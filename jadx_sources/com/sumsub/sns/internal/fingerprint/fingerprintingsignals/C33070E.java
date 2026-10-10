package com.sumsub.sns.internal.fingerprint.fingerprintingsignals;

import com.sumsub.sns.internal.fingerprint.signalproviders.StabilityLevel;
import java.util.ArrayList;
import java.util.Map;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.fingerprintingsignals.E */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33070E extends AbstractC33169s {

    /* JADX INFO: renamed from: b */
    public static final C33165r f67527b = new C33165r(StabilityLevel.STABLE);

    /* JADX INFO: renamed from: a */
    public final Map f67528a;

    @Override // com.sumsub.sns.internal.fingerprint.fingerprintingsignals.AbstractC33169s
    /* JADX INFO: renamed from: a */
    public final Map mo71462a() {
        Map map = this.f67528a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(TuplesKt.m90091to("proc_info." + AbstractC33173t.m71465a((String) entry.getKey()), entry.getValue()));
        }
        return MapsKt.toMap(arrayList);
    }

    public C33070E(Map map) {
        this.f67528a = map;
    }
}
