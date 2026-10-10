package com.sumsub.sns.internal.fingerprint.fingerprintingsignals;

import com.sumsub.sns.internal.fingerprint.infoproviders.C33220i;
import com.sumsub.sns.internal.fingerprint.signalproviders.StabilityLevel;
import com.tencent.bugly.proguard.C33978va;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.fingerprintingsignals.z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33197z extends AbstractC33169s {

    /* JADX INFO: renamed from: b */
    public static final C33165r f67742b = new C33165r(StabilityLevel.STABLE);

    /* JADX INFO: renamed from: a */
    public final List f67743a;

    @Override // com.sumsub.sns.internal.fingerprint.fingerprintingsignals.AbstractC33169s
    /* JADX INFO: renamed from: a */
    public final Map mo71462a() {
        List list = this.f67743a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            C33220i c33220i = (C33220i) obj;
            arrayList.add(TuplesKt.m90091to("input_device_v2." + i11 + C33978va.f72339h + AbstractC33173t.m71465a(c33220i.f67767a), c33220i.f67768b));
            i11 = i12;
        }
        return MapsKt.toMap(arrayList);
    }

    public C33197z(List list) {
        this.f67743a = list;
    }
}
