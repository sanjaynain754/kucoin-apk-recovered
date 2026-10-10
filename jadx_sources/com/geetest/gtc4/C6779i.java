package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: renamed from: com.geetest.gtc4.i */
/* JADX INFO: loaded from: classes45.dex */
public final class C6779i extends IOException {
    private Throwable cause;

    public C6779i(String str) {
        super(str);
    }

    public C6779i(String str, Throwable th2) {
        super(str);
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
