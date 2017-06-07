package simulator.scheduler;

public class RR extends Scheduler {
    private float quantum;
    RR (float quantum) {
        this.quantum = quantum;
    }

    public void setParameters() {
        for (int i = 0; i < n; i++) {
            processControlBlock[i].setRemainTime(processControlBlock[i].getExecutedTime());
        }
    }

    public void run() {
        sortPCB();
        calcAll();
        setParameters();
        int actualTime = 0;
        while (actualTime < timeLine) {
            for (int i = 0; i < nProcess; i++) {
                if (processControlBlock[i].getRemainTime() > 0) {
                    if (processControlBlock[i].getRemainTime() < this.quantum) {
                        actualTime += processControlBlock[i].getRemainTime();
                        int temp = processControlBlock[i].getRemainTime();
                        temp += processControlBlock[i].getExecuted();
                        processControlBlock[i].setExecuted(temp);
                        processControlBlock[i].setRemainTime(0);
                    } else {
                        int temp = this.quantum;
                        temp += processControlBlock[i].getExecuted();
                        processControlBlock[i].setExecuted(temp);
                        int temp2 = processControlBlock[i].getRemainTime();
                        temp2 -= this.quantum;
                        processControlBlock[i].setRemainTime(temp2);
                        actualTime += this.quantum;
                    }
                    System.out.println("Executado: " + processControlBlock[i].getExecuted() + " Restante: " + processControlBlock[i].getRemainTime());
                } else {
                    i++;
                }
            }
        }
    }
}