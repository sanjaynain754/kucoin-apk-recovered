package com.tencent.bugly.crashreport.crash.jni;

import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.util.Map;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public interface NativeExceptionHandler {
    boolean clearPreDumpAnrInfo();

    void handleNativeException(int i11, int i12, long j11, long j12, String str, String str2, String str3, String str4, String str5, int i13, String str6, int i14, int i15, int i16, String str7, String str8);

    void handleNativeException2(int i11, int i12, long j11, long j12, String str, String str2, String str3, String str4, String str5, int i13, String str6, int i14, int i15, int i16, String str7, String str8, String[] strArr);

    CrashDetailBean packageCrashBasicDatas(String str, long j11, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11);

    void packageCrashDetailDatas(CrashDetailBean crashDetailBean, String str, byte[] bArr, Map<String, String> map, boolean z11, long j11, long j12, long j13, long j14);

    boolean preDumpAnrInfo();

    boolean updateStateAndHandleAnr();
}
