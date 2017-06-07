package simulator.scheduler;

public class PCB {
    private String name;
    private float burstTime;
    private float arrivalTime;
    private float remainingTime;
    private float executed;
    private float beginTime;
    private float endTime;
    private float waitTime;

    public float getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(float waitTime) {
        this.waitTime = waitTime;
    }

    public void changeWaitTime(float value) {
        this.waitTime -= this.arrivalTime;
        this.waitTime += value;
    }

    public PCB (String name, float burstTime, float arrivalTime) {
//        System.out.println("processo criando: nome" + name + " burst: " + burstTime + " arrival: " + arrivalTime );
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
    }

    protected String getName(){
        return this.name;
    }

    protected float getBurstTime() {
        return burstTime;
    }

    protected void setBurstTime(float burstTime) {
        this.burstTime = burstTime;
    }

    protected float getBeginTime() {
        return beginTime;
    }

    protected void setBeginTime(float beginTime) {
        this.beginTime = beginTime;
    }

    protected float getEndTime() {
        return endTime;
    }

    protected void setEndTime(float endTime) {
        this.endTime = endTime;
    }

    protected float getRemainingTime() {
        return remainingTime;
    }

    protected void setRemainingTime(float remainingTime) {
        this.remainingTime = remainingTime;
    }

    protected float getExecuted() {
        return executed;
    }

    protected void setExecuted(float executed) {
        this.executed = executed;
    }

    protected float getArrivalTime() {
        return arrivalTime;
    }

    protected void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}
