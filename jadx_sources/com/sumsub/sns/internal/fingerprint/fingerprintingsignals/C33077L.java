package com.sumsub.sns.internal.fingerprint.fingerprintingsignals;

import com.sumsub.sns.internal.fingerprint.infoproviders.C33230n;
import com.sumsub.sns.internal.fingerprint.signalproviders.StabilityLevel;
import com.tencent.bugly.proguard.C33978va;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.fingerprintingsignals.L */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33077L extends AbstractC33169s {

    /* JADX INFO: renamed from: b */
    public static final C33165r f67541b = new C33165r(StabilityLevel.STABLE);

    /* JADX INFO: renamed from: a */
    public final List f67542a;

    @Override // com.sumsub.sns.internal.fingerprint.fingerprintingsignals.AbstractC33169s
    /* JADX INFO: renamed from: a */
    public final Map mo71462a() {
        List list = this.f67542a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            C33230n c33230n = (C33230n) obj;
            arrayList.add(TuplesKt.m90091to("sensor." + i11 + C33978va.f72339h + AbstractC33173t.m71465a(c33230n.f67775a), c33230n.f67776b));
            i11 = i12;
        }
        return MapsKt.toMap(arrayList);
    }

    public C33077L(List list) {
        this.f67542a = list;
    }
}
