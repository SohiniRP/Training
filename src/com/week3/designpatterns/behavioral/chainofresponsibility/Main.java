package com.week3.designpatterns.behavioral.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        TeamLead lead = new TeamLead();
        Manager manager = new Manager();
        Director director = new Director();

        lead.setNextApprover(manager);
        manager.setNextApprover(director);

        lead.approveLeave(11);

    }
}
