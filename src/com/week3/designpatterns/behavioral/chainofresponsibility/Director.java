package com.week3.designpatterns.behavioral.chainofresponsibility;

public class Director extends LeaveApprover{

    @Override
    public void approveLeave(int days) {
        if(days<=10){
            System.out.println("Approved leave of "+days+ " days");
        } else if(nextApprover!=null){
            nextApprover.approveLeave(days);
        } else{
            System.out.println("Leave not approved!");
        }

    }
}
