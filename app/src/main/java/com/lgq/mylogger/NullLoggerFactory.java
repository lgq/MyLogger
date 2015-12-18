package com.lgq.mylogger;

public class NullLoggerFactory implements LoggerFactory {
    public NullLoggerFactory() {
    }

    public Logger create(String tag) {
        return new NullLogger();
    }
}
