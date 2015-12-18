package com.lgq.mylogger;

import android.util.Log;

public class SimpleLogger extends NullLogger {
    protected String mTag;

    public SimpleLogger() {
    }

    public void setTag(String tag) {
        this.mTag = tag;
    }

    @Override
    public void v(String msg) {
        this.println(Log.VERBOSE, this.mTag, msg);
    }

    public void d(String msg) {
        this.println(3, this.mTag, msg);
    }

    public void e(String msg) {
        this.println(6, this.mTag, msg);
    }

    public void e(String msg, Throwable t) {
        this.println(6, this.mTag, msg + "\n" + Log.getStackTraceString(t));
    }

    public void w(String msg) {
        this.println(5, this.mTag, msg);
    }

    public void i(String msg) {
        this.println(4, this.mTag, msg);
    }

    public int println(int priority, String tag, String msg) {
        return Log.println(priority, tag, msg);
    }

}
