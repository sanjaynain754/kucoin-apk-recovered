package com.facebook.react.bridge;

import android.os.SystemClock;
import com.facebook.soloader.SoLoader;

/* JADX INFO: loaded from: classes45.dex */
public class ReactBridge {
    private static volatile boolean sDidInit;
    private static volatile long sLoadEndTime;
    private static volatile long sLoadStartTime;

    public static long getLoadEndTime() {
        return sLoadEndTime;
    }

    public static long getLoadStartTime() {
        return sLoadStartTime;
    }

    public static boolean isInitialized() {
        return sDidInit;
    }

    public static synchronized void staticInit() {
        if (sDidInit) {
            return;
        }
        sLoadStartTime = SystemClock.uptimeMillis();
        com.facebook.systrace.Systrace.m10662c(0L, "ReactBridge.staticInit::load:reactnativejni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
        SoLoader.loadLibrary("reactnativejni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
        com.facebook.systrace.Systrace.m10667i(0L);
        sLoadEndTime = SystemClock.uptimeMillis();
        sDidInit = true;
    }
}
