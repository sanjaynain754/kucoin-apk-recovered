package com.sumsub.sns.internal.features.domain.ekyc;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.C31538a;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.LoggerType;
import java.util.List;
import java.util.Map;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.ArraysKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.ekyc.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30158a {
    /* JADX INFO: renamed from: a */
    public static Pair m70122a(Map map, String str, List list) {
        String str2 = (String) map.get(str);
        if (str2 == null) {
            return null;
        }
        if (!list.isEmpty()) {
            return TuplesKt.m90091to(str, str2);
        }
        C33272c c33272c = C33272c.f67812a;
        Logger.DefaultImpls.e$default(C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})), AbstractC33294e.m71624a(C31538a.f64033a), "Sources for " + str + " are empty", null, 4, null);
        return null;
    }
}
