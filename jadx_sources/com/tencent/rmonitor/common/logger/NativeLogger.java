package com.tencent.rmonitor.common.logger;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
public class NativeLogger {
    private static int sLogLevel = LogState.WARN.getValue();

    public static int getLogLevel() {
        return sLogLevel;
    }

    public static int initLogLevel(int i11) {
        sLogLevel = i11;
        return i11;
    }
}
