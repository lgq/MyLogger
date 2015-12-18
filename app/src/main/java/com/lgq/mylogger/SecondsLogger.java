package com.lgq.mylogger;

public class SecondsLogger extends SimpleLogger {
    String mSecondTag;

    public SecondsLogger(String tag, String second_tag) {
        this.mSecondTag = second_tag;
        this.setTag(tag);
    }

    protected String wrapperMsg(String msg) {
        return "[" + this.mSecondTag + "] " + msg;
    }

    @Override
    public int println(int priority, String tag, String msg) {
        return super.println(priority, tag, this.wrapperMsg(msg));
    }
}
