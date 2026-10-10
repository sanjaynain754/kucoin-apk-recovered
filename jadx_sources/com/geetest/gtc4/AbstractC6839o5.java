package com.geetest.gtc4;

import java.io.InputStream;

/* JADX INFO: renamed from: com.geetest.gtc4.o5 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6839o5 extends InputStream {

    /* JADX INFO: renamed from: a */
    public final InputStream f11450a;

    /* JADX INFO: renamed from: b */
    public final int f11451b;

    /* JADX INFO: renamed from: a */
    public final void m12689a() {
        InputStream inputStream = this.f11450a;
        if (inputStream instanceof C6794j5) {
            C6794j5 c6794j5 = (C6794j5) inputStream;
            c6794j5.f11412f = true;
            c6794j5.m12663b();
        }
    }

    public AbstractC6839o5(InputStream inputStream, int i11) {
        this.f11450a = inputStream;
        this.f11451b = i11;
    }
}
