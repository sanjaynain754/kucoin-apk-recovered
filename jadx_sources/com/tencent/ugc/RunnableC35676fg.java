package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.fg */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35676fg implements Runnable {

    /* JADX INFO: renamed from: a */
    private final int f77075a;

    /* JADX INFO: renamed from: b */
    private final String f77076b;

    /* JADX INFO: renamed from: c */
    private final String f77077c;

    /* JADX INFO: renamed from: d */
    private final String f77078d;

    /* JADX INFO: renamed from: e */
    private final TXRecordCommon.ITXVideoRecordListener f77079e;

    /* JADX INFO: renamed from: a */
    public static Runnable m79170a(int i11, String str, String str2, String str3, TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        return new RunnableC35676fg(i11, str, str2, str3, iTXVideoRecordListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCRecorderJni.lambda$onRecordComplete$0(this.f77075a, this.f77076b, this.f77077c, this.f77078d, this.f77079e);
    }

    private RunnableC35676fg(int i11, String str, String str2, String str3, TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        this.f77075a = i11;
        this.f77076b = str;
        this.f77077c = str2;
        this.f77078d = str3;
        this.f77079e = iTXVideoRecordListener;
    }
}
