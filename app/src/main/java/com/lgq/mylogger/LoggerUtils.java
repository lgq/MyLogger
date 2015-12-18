package com.lgq.mylogger;

import android.util.Log;

public class LoggerUtils {
    static int sPriority = Log.VERBOSE;

    public static int getPriority() {
        return sPriority;
    }

    public static void setPriority(int priority) {
        sPriority = priority;
    }

}
