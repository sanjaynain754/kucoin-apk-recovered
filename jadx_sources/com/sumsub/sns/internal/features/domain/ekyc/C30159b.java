package com.sumsub.sns.internal.features.domain.ekyc;

import com.sumsub.sns.internal.features.data.model.common.C28999F;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.ekyc.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30159b {
    /* JADX INFO: renamed from: a */
    public static Map m70123a(String str, Map map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.areEqual(((C28999F) obj).f58944e, str)) {
                    arrayList2.add(obj);
                }
            }
            Pair pairM90091to = !arrayList2.isEmpty() ? TuplesKt.m90091to(str2, arrayList2) : null;
            if (pairM90091to != null) {
                arrayList.add(pairM90091to);
            }
        }
        return MapsKt.toMap(arrayList);
    }
}
