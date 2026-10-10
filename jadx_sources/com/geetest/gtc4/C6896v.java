package com.geetest.gtc4;

/* JADX INFO: renamed from: com.geetest.gtc4.v */
/* JADX INFO: loaded from: classes45.dex */
public final class C6896v extends IllegalStateException {
    private Throwable cause;

    public C6896v(String str) {
        super(str);
    }

    public C6896v(String str, Throwable th2) {
        super(str);
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
