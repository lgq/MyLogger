package com.lgq.mylogger;

public class PrioritySecondsLogger extends SecondsLogger {

    public PrioritySecondsLogger(String tag, String second_tag) {
        super(tag, second_tag);
    }

    @Override
    public int println(int priority, String tag, String msg) {
        if (priority >= LoggerUtils.getPriority()) {
            return super.println(priority, tag, msg);
        } else {
            return 0;
        }
    }
}
