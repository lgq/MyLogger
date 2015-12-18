package com.lgq.mylogger;

public class NullLogger implements Logger {
    public NullLogger() {
    }

    public void setTag(String tag) {
    }

    @Override
    public void v(String msg) {

    }

    public void d(String msg) {
    }

    public void e(String msg) {
    }

    public void e(String msg, Throwable t) {
    }

    public void w(String msg) {
    }

    public void i(String msg) {
    }

    public int println(int priority, String tag, String msg) {
        return 0;
    }
}
