package com.sensorsdata.analytics.android.sdk.autotrack.utils;

/* JADX INFO: loaded from: classes59.dex */
public class AutoTrackUtils {
    private static String sLastScreenUrl = "";

    public static String getLastScreenUrl() {
        return sLastScreenUrl;
    }

    public static void setLastScreenUrl(String str) {
        sLastScreenUrl = str;
    }
}
