package com.sumsub.sns.internal.features.data.repository.dynamic;

import p852kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.N */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC29971N {
    /* JADX INFO: renamed from: a */
    public Throwable mo70049a() {
        C29969L c29969l = this instanceof C29969L ? (C29969L) this : null;
        if (c29969l != null) {
            return c29969l.f60205a;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final Object m70050b() {
        if (this instanceof C29970M) {
            return ((C29970M) this).f60207a;
        }
        if (this instanceof C29969L) {
            return ((C29969L) this).f60206b;
        }
        if (this instanceof C29968K) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    public final Object m70051c() {
        C29970M c29970m = this instanceof C29970M ? (C29970M) this : null;
        if (c29970m != null) {
            return c29970m.f60207a;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final Object m70052d() throws Throwable {
        if (this instanceof C29969L) {
            throw ((C29969L) this).f60205a;
        }
        Object objM70050b = m70050b();
        if (objM70050b != null) {
            return objM70050b;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
