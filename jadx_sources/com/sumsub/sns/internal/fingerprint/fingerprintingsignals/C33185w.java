package com.sumsub.sns.internal.fingerprint.fingerprintingsignals;

import com.sumsub.sns.internal.fingerprint.signalproviders.StabilityLevel;
import java.util.Map;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.fingerprintingsignals.w */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33185w extends AbstractC33169s {

    /* JADX INFO: renamed from: b */
    public static final C33165r f67727b = new C33165r(StabilityLevel.STABLE);

    /* JADX INFO: renamed from: a */
    public final String f67728a;

    @Override // com.sumsub.sns.internal.fingerprint.fingerprintingsignals.AbstractC33169s
    /* JADX INFO: renamed from: a */
    public final Map mo71462a() {
        return MapsKt.mapOf(TuplesKt.m90091to("gles_version", this.f67728a));
    }

    public C33185w(String str) {
        this.f67728a = str;
    }
}
