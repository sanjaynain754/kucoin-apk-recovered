package com.sumsub.sns.internal.fingerprint.fingerprintingsignals;

import com.sumsub.sns.internal.fingerprint.infoproviders.C33224k;
import com.sumsub.sns.internal.fingerprint.signalproviders.StabilityLevel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.fingerprintingsignals.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33122h extends AbstractC33169s {

    /* JADX INFO: renamed from: b */
    public static final C33165r f67601b = new C33165r(StabilityLevel.OPTIMAL);

    /* JADX INFO: renamed from: a */
    public final List f67602a;

    /* JADX INFO: renamed from: a */
    public static final CharSequence m71464a(String str) {
        return str;
    }

    @Override // com.sumsub.sns.internal.fingerprint.fingerprintingsignals.AbstractC33169s
    /* JADX INFO: renamed from: a */
    public final Map mo71462a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i11 = 0;
        for (Object obj : this.f67602a) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            C33224k c33224k = (C33224k) obj;
            linkedHashMap.put("codec_info." + i11 + ".name", c33224k.f67771a);
            linkedHashMap.put("codec_info." + i11 + ".capabilities", CollectionsKt.joinToString$default(c33224k.f67772b, null, null, null, 0, null, new Function1() { // from class: com.sumsub.sns.internal.fingerprint.fingerprintingsignals.b0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return C33122h.m71464a((String) obj2);
                }
            }, 31, null));
            i11 = i12;
        }
        return linkedHashMap;
    }

    public C33122h(List list) {
        this.f67602a = list;
    }
}
