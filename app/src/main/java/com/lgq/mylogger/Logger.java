package com.lgq.mylogger;

public interface Logger {
    void setTag(String var1);

    void v(String msg);

    void d(String var1);

    void e(String var1);

    void e(String var1, Throwable var2);

    void w(String var1);

    void i(String var1);

    int println(int var1, String var2, String var3);
}
