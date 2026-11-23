package com.databridge.exercises.day7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LoggingDemo {

    private static final Logger log = LoggerFactory.getLogger(LoggingDemo.class);
    public static void main(String[] args){
        log.debug("Debug sarted {}");
        log.info("main method started");
        log.warn("warning started");
        log.error("encountered an error");
    }
}
