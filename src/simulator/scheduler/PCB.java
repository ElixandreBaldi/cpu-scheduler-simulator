package simulator.scheduler;

public class PCB {
    private String name;
    private float burstTime;
    private float arrivalTime;
    private float executionTime;
    private float remainingTime;
    private float executed;
    private float beginTime;
    private float endTime;
    private double averageExecutionTime, averageWaitTime;

    /*PCB(int q, float arrivalTime, float executionTime, float remainingTime, float executed, double averageExecutionTime, double averageWaitTime, float beginTime, float endTime) {
        quantum = q;
        this.arrivalTime = arrivalTime;
        this.executionTime = executionTime;
        this.remainingTime = remainingTime;
        this.executed = executed;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.averageExecutionTime = averageExecutionTime;
        this.averageWaitTime = averageWaitTime;
    }*/

    PCB (String name, float arrivalTime, float burstTime) {
        System.out.println("processo criando: nome" + name + " arrival: " + arrivalTime + " burst: " + burstTime);
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
    }

    float getBeginTime() {
        return beginTime;
    }

    void setBeginTime(float beginTime) {
        this.beginTime = beginTime;
    }

    float getEndTime() {
        return endTime;
    }

    void setEndTime(float endTime) {
        this.endTime = endTime;
    }

    public double getAverageExecutionTime() {
        return averageExecutionTime;
    }

    void setAverageExecutionTime(float averageExecutionTime) {
        this.averageExecutionTime = averageExecutionTime;
    }

    public double getAverageWaitTime() {
        return averageWaitTime;
    }

    public void setAverageWaitTime(float averageWaitTime) {
        this.averageWaitTime = averageWaitTime;
    }

    public float getQuantum() {
        return quantum;
    }

    public void setQuantum(float quantum) {
        this.quantum = quantum;
    }

    float getRemainingTime() {
        return remainingTime;
    }

    void setRemainingTime(float remainingTime) {
        this.remainingTime = remainingTime;
    }

    float getExecuted() {
        return executed;
    }

    void setExecuted(float executed) {
        this.executed = executed;
    }

    float getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    float getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(int executionTime) {
        this.executionTime = executionTime;
    }
}
