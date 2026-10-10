package com.geetest.gtc4;

/* JADX INFO: renamed from: com.geetest.gtc4.m3 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6819m3 extends IllegalStateException {
    private Throwable cause;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public C6819m3(String str, Throwable th2) {
        super(str);
        this.cause = th2;
    }
}
