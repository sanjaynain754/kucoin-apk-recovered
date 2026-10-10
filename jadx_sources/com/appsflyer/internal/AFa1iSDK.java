package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
class AFa1iSDK implements AFa1dSDK {
    private static AFa1iSDK afErrorLog;
    private final AFb1nSDK values = new AFb1nSDK();

    public static synchronized AFa1iSDK afDebugLog() {
        try {
            if (afErrorLog == null) {
                afErrorLog = new AFa1iSDK();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return afErrorLog;
    }

    @Override // com.appsflyer.internal.AFa1dSDK
    public void afRDLog(Map<String, Object> map, byte[] bArr, Map<String, Object> map2) {
        this.values.afRDLog(map, bArr, map2);
    }

    static {
        try {
            System.loadLibrary("sdk_bc_lib");
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("Failed to load native library", th2);
        }
    }

    private AFa1iSDK() {
    }
}
