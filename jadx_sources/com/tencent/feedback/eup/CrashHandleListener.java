package com.tencent.feedback.eup;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public interface CrashHandleListener {
    byte[] getCrashExtraData(boolean z11, String str, String str2, String str3, int i11, long j11);

    String getCrashExtraMessage(boolean z11, String str, String str2, String str3, int i11, long j11);

    boolean onCrashHandleEnd(boolean z11);

    void onCrashHandleStart(boolean z11, String str);

    boolean onCrashSaving(boolean z11, String str, String str2, String str3, String str4, int i11, long j11, String str5, String str6, String str7, String str8);
}
