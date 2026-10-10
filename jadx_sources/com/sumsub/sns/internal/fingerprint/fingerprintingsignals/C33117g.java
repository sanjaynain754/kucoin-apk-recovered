package com.sumsub.sns.internal.fingerprint.fingerprintingsignals;

import com.sumsub.sns.internal.fingerprint.infoproviders.C33206b;
import com.sumsub.sns.internal.fingerprint.signalproviders.StabilityLevel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.fingerprintingsignals.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33117g extends AbstractC33169s {

    /* JADX INFO: renamed from: b */
    public static final C33165r f67595b = new C33165r(StabilityLevel.STABLE);

    /* JADX INFO: renamed from: a */
    public final List f67596a;

    @Override // com.sumsub.sns.internal.fingerprint.fingerprintingsignals.AbstractC33169s
    /* JADX INFO: renamed from: a */
    public final Map mo71462a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i11 = 0;
        for (Object obj : this.f67596a) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            C33206b c33206b = (C33206b) obj;
            linkedHashMap.put("camera_name." + i11, c33206b.f67752a);
            linkedHashMap.put("camera_type." + i11, c33206b.f67753b);
            linkedHashMap.put("camera_orientation." + i11, c33206b.f67754c);
            i11 = i12;
        }
        return linkedHashMap;
    }

    public C33117g(List list) {
        this.f67596a = list;
    }
}
