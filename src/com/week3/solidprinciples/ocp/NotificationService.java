package com.week3.solidprinciples.ocp;

public interface NotificationService {

    void sendOtp(String medium);

    void transactionNotification(String medium);
}
