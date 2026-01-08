package com.week3.designpatterns.behavioral.chainofresponsibility;

public class TeamLead extends LeaveApprover{

    @Override
    public void approveLeave(int days) {
        if(days<=5){
            System.out.println("Approved leave of "+days+ " days");
        } else if(nextApprover!=null){
            nextApprover.approveLeave(days);
        }

    }
}
