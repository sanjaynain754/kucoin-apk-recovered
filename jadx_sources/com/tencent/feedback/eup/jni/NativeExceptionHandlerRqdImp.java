package com.tencent.feedback.eup.jni;

import android.content.Context;
import com.tencent.bugly.proguard.C33745k3;
import com.tencent.feedback.eup.CrashHandleListener;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class NativeExceptionHandlerRqdImp implements NativeExceptionHandler {

    /* JADX INFO: renamed from: c */
    public static NativeExceptionHandlerRqdImp f73262c;
    public static CrashHandleListener listener;

    /* JADX INFO: renamed from: a */
    public Context f73263a;

    /* JADX INFO: renamed from: b */
    public String f73264b;

    public static synchronized NativeExceptionHandlerRqdImp getInstance(Context context) {
        try {
            if (f73262c == null) {
                f73262c = new NativeExceptionHandlerRqdImp(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f73262c;
    }

    public synchronized String getTombDir() {
        return this.f73264b;
    }

    @Override // com.tencent.feedback.eup.jni.NativeExceptionHandler
    public void handleNativeException(int i11, int i12, long j11, long j12, String str, String str2, String str3, String str4, String str5) {
        handleNativeException(i11, i12, j11, j12, str, str2, str3, str4, str5, -1234567890, "", -1, -1, -1, "", "unknown");
    }

    public synchronized void setTombDir(String str) {
        this.f73264b = str;
    }

    @Override // com.tencent.feedback.eup.jni.NativeExceptionHandler
    public void handleNativeException(int i11, int i12, long j11, long j12, String str, String str2, String str3, String str4, String str5, int i13, String str6, int i14, int i15, int i16, String str7, String str8) {
        handleNativeException(i11, i12, j11, j12, str, str2, str3, str4, str5, i13, str6, i14, i15, i16, str7, str8, null);
    }

    public NativeExceptionHandlerRqdImp(Context context) {
        this.f73263a = context;
    }

    @Override // com.tencent.feedback.eup.jni.NativeExceptionHandler
    public void handleNativeException(int i11, int i12, long j11, long j12, String str, String str2, String str3, String str4, String str5, int i13, String str6, int i14, int i15, int i16, String str7, String str8, String[] strArr) {
        C33745k3.m73653l().m73681m().handleNativeException2(i11, i12, j11, j12, str, str2, str3, str4, str5, i13, str6, i14, i15, i16, str7, str8, strArr);
    }

    public static synchronized NativeExceptionHandlerRqdImp getInstance() {
        return f73262c;
    }
}
