package com.mycompany.java2022w3hw3.core.logger;

public class DatabaseLogger implements ILogger{

    @Override
    public void log(String log) {
        System.out.println("Logged to database : " + log);
    }   
}
