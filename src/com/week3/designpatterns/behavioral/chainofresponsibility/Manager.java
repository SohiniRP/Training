package com.week3.designpatterns.behavioral.chainofresponsibility;

public class Manager extends LeaveApprover{

    @Override
    public void approveLeave(int days) {
        if(days<=3){
            System.out.println("Approved leave of "+days+ " days");
        } else if(nextApprover!=null){
            nextApprover.approveLeave(days);
        }

    }
}
