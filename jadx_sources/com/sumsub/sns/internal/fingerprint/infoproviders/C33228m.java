package com.sumsub.sns.internal.fingerprint.infoproviders;

import android.os.Build;
import com.sumsub.sns.internal.fingerprint.tools.threading.safe.AbstractC33266c;
import p852kotlin.Result;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.infoproviders.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33228m {
    /* JADX INFO: renamed from: b */
    public static final String m71591b() {
        return Build.VERSION.RELEASE;
    }

    /* JADX INFO: renamed from: d */
    public static final String m71592d() {
        return Build.FINGERPRINT;
    }

    /* JADX INFO: renamed from: h */
    public static final String m71594h() {
        return Build.MANUFACTURER;
    }

    /* JADX INFO: renamed from: j */
    public static final String m71595j() {
        return Build.MODEL;
    }

    /* JADX INFO: renamed from: l */
    public static final String m71596l() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    /* JADX INFO: renamed from: a */
    public final String m71597a() {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.infoproviders.l0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C33228m.m71591b();
            }
        });
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = "";
        }
        return (String) objM71616a;
    }

    /* JADX INFO: renamed from: c */
    public final String m71598c() {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.infoproviders.m0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C33228m.m71592d();
            }
        });
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = "";
        }
        return (String) objM71616a;
    }

    /* JADX INFO: renamed from: e */
    public final String m71599e() {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.infoproviders.o0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C33228m.m71593f();
            }
        });
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = "";
        }
        return (String) objM71616a;
    }

    /* JADX INFO: renamed from: g */
    public final String m71600g() {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.infoproviders.n0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C33228m.m71594h();
            }
        });
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = "";
        }
        return (String) objM71616a;
    }

    /* JADX INFO: renamed from: i */
    public final String m71601i() {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.infoproviders.k0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C33228m.m71595j();
            }
        });
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = "";
        }
        return (String) objM71616a;
    }

    /* JADX INFO: renamed from: k */
    public final String m71602k() {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.infoproviders.j0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C33228m.m71596l();
            }
        });
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = "";
        }
        return (String) objM71616a;
    }

    /* JADX INFO: renamed from: f */
    public static final String m71593f() {
        return System.getProperty("os.version");
    }
}
