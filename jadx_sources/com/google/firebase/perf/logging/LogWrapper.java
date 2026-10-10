package com.google.firebase.perf.logging;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
class LogWrapper {
    private static final String LOG_TAG = "FirebasePerformance";
    private static LogWrapper instance;

    public static synchronized LogWrapper getInstance() {
        try {
            if (instance == null) {
                instance = new LogWrapper();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return instance;
    }

    /* JADX INFO: renamed from: d */
    public void m13820d(String str) {
        Log.d(LOG_TAG, str);
    }

    /* JADX INFO: renamed from: e */
    public void m13821e(String str) {
        Log.e(LOG_TAG, str);
    }

    /* JADX INFO: renamed from: i */
    public void m13822i(String str) {
        Log.i(LOG_TAG, str);
    }

    /* JADX INFO: renamed from: v */
    public void m13823v(String str) {
        Log.v(LOG_TAG, str);
    }

    /* JADX INFO: renamed from: w */
    public void m13824w(String str) {
        Log.w(LOG_TAG, str);
    }

    private LogWrapper() {
    }
}
