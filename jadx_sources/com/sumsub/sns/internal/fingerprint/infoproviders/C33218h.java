package com.sumsub.sns.internal.fingerprint.infoproviders;

import android.app.ActivityManager;
import android.content.pm.ConfigurationInfo;
import com.sumsub.sns.internal.fingerprint.tools.threading.safe.AbstractC33266c;
import p852kotlin.Result;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.infoproviders.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33218h {

    /* JADX INFO: renamed from: a */
    public final ActivityManager f67765a;

    /* JADX INFO: renamed from: a */
    public final String m71584a() {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.infoproviders.f0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C33218h.m71583a(this.f67761b);
            }
        });
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = "";
        }
        return (String) objM71616a;
    }

    public C33218h(ActivityManager activityManager) {
        this.f67765a = activityManager;
    }

    /* JADX INFO: renamed from: a */
    public static final String m71583a(C33218h c33218h) {
        ConfigurationInfo deviceConfigurationInfo;
        String glEsVersion;
        ActivityManager activityManager = c33218h.f67765a;
        return (activityManager == null || (deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo()) == null || (glEsVersion = deviceConfigurationInfo.getGlEsVersion()) == null) ? "" : glEsVersion;
    }
}
