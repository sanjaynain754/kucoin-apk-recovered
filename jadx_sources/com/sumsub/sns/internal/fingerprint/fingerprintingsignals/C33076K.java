package com.sumsub.sns.internal.fingerprint.fingerprintingsignals;

import com.sumsub.sns.internal.fingerprint.signalproviders.StabilityLevel;
import com.tencent.bugly.proguard.C33978va;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.fingerprintingsignals.K */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33076K extends AbstractC33169s {

    /* JADX INFO: renamed from: b */
    public static final C33165r f67539b = new C33165r(StabilityLevel.OPTIMAL);

    /* JADX INFO: renamed from: a */
    public final List f67540a;

    @Override // com.sumsub.sns.internal.fingerprint.fingerprintingsignals.AbstractC33169s
    /* JADX INFO: renamed from: a */
    public final Map mo71462a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i11 = 0;
        for (Object obj : this.f67540a) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Pair pair = (Pair) obj;
            linkedHashMap.put("security_provider." + i11 + C33978va.f72339h + pair.getFirst(), pair.getSecond());
            i11 = i12;
        }
        return linkedHashMap;
    }

    public C33076K(List list) {
        this.f67540a = list;
    }
}
