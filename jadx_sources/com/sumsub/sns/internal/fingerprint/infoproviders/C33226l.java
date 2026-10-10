package com.sumsub.sns.internal.fingerprint.infoproviders;

import android.app.ActivityManager;
import android.os.StatFs;
import com.sumsub.sns.internal.fingerprint.tools.threading.safe.AbstractC33266c;
import p852kotlin.Result;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.infoproviders.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33226l {

    /* JADX INFO: renamed from: a */
    public final ActivityManager f67773a;

    /* JADX INFO: renamed from: b */
    public final StatFs f67774b;

    /* JADX INFO: renamed from: a */
    public final long m71589a() {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.infoproviders.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(C33226l.m71587a(this.f67766b));
            }
        });
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = 0L;
        }
        return ((Number) objM71616a).longValue();
    }

    /* JADX INFO: renamed from: b */
    public final long m71590b() {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.infoproviders.i0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(C33226l.m71588b(this.f67769b));
            }
        });
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = 0L;
        }
        return ((Number) objM71616a).longValue();
    }

    public C33226l(ActivityManager activityManager, StatFs statFs) {
        this.f67773a = activityManager;
        this.f67774b = statFs;
    }

    /* JADX INFO: renamed from: a */
    public static final long m71587a(C33226l c33226l) {
        return c33226l.f67774b.getTotalBytes();
    }

    /* JADX INFO: renamed from: b */
    public static final long m71588b(C33226l c33226l) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = c33226l.f67773a;
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
        }
        return memoryInfo.totalMem;
    }
}
