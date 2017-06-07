package simulator.scheduler;

public class FCFS extends Scheduler {
    FCFS (PCB[] pcb) {
        super(pcb);
        run();
    }
    public void calcAllFcfs() { // this function only works with FCFS
        for (int i = 0; i < nProcess; i++) {
            if( i != 0) {
                processControlBlock[i].setBeginTime(processControlBlock[i - 1].getEndTime());
            }else{
                processControlBlock[i].setBeginTime(processControlBlock[i].getArrivalTime());
            }
            processControlBlock[i].setEndTime(processControlBlock[i].getBurstTime() + processControlBlock[i].getBeginTime() );
        }
        timeLine = processControlBlock[nProcess - 1].getEndTime();
    }

    public void run() {
        sortPcb();
        calcAllFcfs();
        for (int i = 0; i < nProcess; i++) {
            float temp = 0;
            processControlBlock[i].setExecuted(processControlBlock[i].getBurstTime());
            processControlBlock[i].setRemainingTime(0);
            for( int j = 0; j < i; j++){
                temp += processControlBlock[j].getBurstTime();
            }
            processControlBlock[i].setWaitTime( temp - processControlBlock[i].getArrivalTime() + normalization);
            System.out.println("Executado: " + processControlBlock[i].getExecuted() + " Restante: " + processControlBlock[i].getRemainingTime() + " Tempo total:" + timeLine + " Begin: " + processControlBlock[i].getBeginTime() + " End: " + processControlBlock[i].getEndTime());
        }
        averageTime();
    }
}
