package com.mycompany.java2022w3hw3.core.logger;

public class FileLogger implements ILogger{
    
    @Override
    public void log(String log) {
        System.out.println("Logged to file : " + log);
    }
}
