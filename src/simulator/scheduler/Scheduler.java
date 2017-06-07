package simulator.scheduler;

public class Scheduler {

    protected PCB[] processControlBlock;
    protected int nProcess;
    protected float timeLine = 0;
    private float avgExecutionTime, avgWaitTime;
    protected float normalization;


    public Scheduler(PCB[] pcb){
        this.processControlBlock = pcb;
        this.nProcess = pcb.length;
        normalization();
    }

    public void normalization(){ // This function serve to set begin just only for the first process
        normalization = processControlBlock[0].getArrivalTime();
    }


    public void sortPcb(){
        for (int i = 0; i < nProcess; i ++){
            for(int j = 1; j < nProcess; j++ ){
                if (processControlBlock[j].getArrivalTime() < processControlBlock[j-1].getArrivalTime()){
                    PCB temptemp = processControlBlock[j-1];
                    processControlBlock[j-1] = processControlBlock[j];
                    processControlBlock[j] = temptemp;
                }
            }
        }
    }
    public void averageTime(){
        for(int i = 0; i < nProcess; i++) {
            avgExecutionTime += processControlBlock[i].getBurstTime() + processControlBlock[i].getWaitTime();
            avgWaitTime += processControlBlock[i].getWaitTime();
        }
        avgWaitTime /= nProcess;
        avgExecutionTime /= nProcess;
        System.out.println(avgExecutionTime + " " + avgWaitTime);
    }
}
