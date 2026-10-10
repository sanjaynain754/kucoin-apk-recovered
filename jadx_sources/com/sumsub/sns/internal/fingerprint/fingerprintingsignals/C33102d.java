package com.sumsub.sns.internal.fingerprint.fingerprintingsignals;

import com.sumsub.sns.internal.fingerprint.signalproviders.StabilityLevel;
import java.util.List;
import java.util.Map;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.fingerprintingsignals.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33102d extends AbstractC33169s {

    /* JADX INFO: renamed from: b */
    public static final C33165r f67577b = new C33165r(StabilityLevel.OPTIMAL);

    /* JADX INFO: renamed from: a */
    public final List f67578a;

    /* JADX INFO: renamed from: a */
    public static final CharSequence m71463a(String str) {
        return str;
    }

    @Override // com.sumsub.sns.internal.fingerprint.fingerprintingsignals.AbstractC33169s
    /* JADX INFO: renamed from: a */
    public final Map mo71462a() {
        return MapsKt.mapOf(TuplesKt.m90091to("available_locales", CollectionsKt.joinToString$default(this.f67578a, null, null, null, 0, null, new Function1() { // from class: com.sumsub.sns.internal.fingerprint.fingerprintingsignals.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C33102d.m71463a((String) obj);
            }
        }, 31, null)));
    }

    public C33102d(List list) {
        this.f67578a = list;
    }
}
