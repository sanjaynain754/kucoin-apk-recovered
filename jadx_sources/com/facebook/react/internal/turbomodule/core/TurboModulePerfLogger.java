package com.facebook.react.internal.turbomodule.core;

import com.facebook.react.reactperflogger.NativeModulePerfLogger;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC44695a
class TurboModulePerfLogger {
    private static NativeModulePerfLogger sNativeModulePerfLogger;

    private static native void jniEnableCppLogging(NativeModulePerfLogger nativeModulePerfLogger);

    public static void enableLogging(NativeModulePerfLogger nativeModulePerfLogger) {
        if (nativeModulePerfLogger != null) {
            sNativeModulePerfLogger = nativeModulePerfLogger;
            jniEnableCppLogging(nativeModulePerfLogger);
        }
    }

    public static void moduleCreateCacheHit(String str, int i11) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.moduleCreateCacheHit(str, i11);
        }
    }

    public static void moduleCreateConstructEnd(String str, int i11) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.moduleCreateConstructEnd(str, i11);
        }
    }

    public static void moduleCreateConstructStart(String str, int i11) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.moduleCreateConstructStart(str, i11);
        }
    }

    public static void moduleCreateEnd(String str, int i11) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.moduleCreateEnd(str, i11);
        }
    }

    public static void moduleCreateFail(String str, int i11) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.moduleCreateFail(str, i11);
        }
    }

    public static void moduleCreateSetUpEnd(String str, int i11) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.moduleCreateSetUpEnd(str, i11);
        }
    }

    public static void moduleCreateSetUpStart(String str, int i11) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.moduleCreateSetUpStart(str, i11);
        }
    }

    public static void moduleCreateStart(String str, int i11) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.moduleCreateStart(str, i11);
        }
    }

    public static void moduleDataCreateEnd(String str, int i11) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.moduleDataCreateEnd(str, i11);
        }
    }

    public static void moduleDataCreateStart(String str, int i11) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.moduleDataCreateStart(str, i11);
        }
    }

    static {
        NativeModuleSoLoader.maybeLoadSoLibrary();
    }
}
