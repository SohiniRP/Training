package com.week3.designpatterns.behavioral.chainofresponsibility;

public abstract class LeaveApprover {

    protected LeaveApprover nextApprover;

    public void setNextApprover(LeaveApprover nextApprover){
        this.nextApprover = nextApprover;
    }

    public LeaveApprover getNextApprover() {
        return nextApprover;
    }

    public abstract void approveLeave(int days);
}
