package com.tencent.liteav.base.util;

import android.text.TextUtils;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.tencent.liteav.base.util.s */
/* JADX INFO: loaded from: classes59.dex */
public final class C34754s<T> {

    /* JADX INFO: renamed from: a */
    private T f73563a;

    /* JADX INFO: renamed from: b */
    private Callable<T> f73564b;

    /* JADX INFO: renamed from: a */
    public final void m76144a(T t11) {
        synchronized (this) {
            this.f73563a = t11;
        }
    }

    public C34754s(Callable<T> callable) {
        this.f73564b = callable;
    }

    /* JADX INFO: renamed from: a */
    public final T m76143a() {
        T t11 = this.f73563a;
        if (t11 instanceof String) {
            if (!TextUtils.isEmpty((CharSequence) t11)) {
                return this.f73563a;
            }
        } else if (t11 != null) {
            return t11;
        }
        synchronized (this) {
            try {
                T t12 = this.f73563a;
                if (t12 instanceof String) {
                    if (!TextUtils.isEmpty((CharSequence) t12)) {
                        return this.f73563a;
                    }
                } else if (t12 != null) {
                    return t12;
                }
                try {
                    this.f73563a = this.f73564b.call();
                } catch (Exception e11) {
                    e11.printStackTrace();
                    LiteavLog.m76083e("Stash", "Get value failed. msg:" + e11.getMessage());
                }
                return this.f73563a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
