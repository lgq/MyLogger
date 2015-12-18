package com.lgq.mylogger;

public class MyLoggerFactory implements LoggerFactory{

    private String tag = "";
    public MyLoggerFactory(String tag){
        this.tag = tag;
    }

    @Override
    public Logger create(String s) {
        return new PrioritySecondsLogger(tag, s);
    }
}
