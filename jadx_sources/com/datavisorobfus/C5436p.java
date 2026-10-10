package com.datavisorobfus;

import android.content.Context;
import android.os.Debug;

/* JADX INFO: renamed from: com.datavisorobfus.p */
/* JADX INFO: loaded from: classes34.dex */
public class C5436p {

    /* JADX INFO: renamed from: c */
    private static C5436p f7338c;

    /* JADX INFO: renamed from: a */
    private Context f7339a;

    /* JADX INFO: renamed from: b */
    private long f7340b;

    /* JADX INFO: renamed from: a */
    public static C5436p m7250a(Context context) {
        if (f7338c == null) {
            synchronized (C5452x.class) {
                try {
                    if (f7338c == null) {
                        f7338c = new C5436p(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f7338c;
    }

    /* JADX INFO: renamed from: a */
    private void m7251a() {
        if ((this.f7339a.getApplicationInfo().flags & 2) != 0) {
            this.f7340b |= 1;
        }
    }

    /* JADX INFO: renamed from: c */
    public String m7253c() {
        this.f7340b = 0L;
        m7251a();
        m7252b();
        return String.valueOf(this.f7340b);
    }

    private C5436p(Context context) {
        this.f7339a = null;
        this.f7340b = 0L;
        if (context != null) {
            this.f7339a = context;
            this.f7340b = 0L;
            return;
        }
        throw new IllegalArgumentException("DbgDetect initialization error: mContext is null.");
    }

    /* JADX INFO: renamed from: b */
    private void m7252b() {
        if (Debug.isDebuggerConnected()) {
            this.f7340b |= 2;
        }
    }
}
