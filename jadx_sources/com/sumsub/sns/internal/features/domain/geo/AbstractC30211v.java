package com.sumsub.sns.internal.features.domain.geo;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29103d2;
import com.sumsub.sns.internal.features.data.model.common.C29094c;
import com.sumsub.sns.internal.features.data.model.common.C29719y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.geo.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC30211v {
    /* JADX INFO: renamed from: a */
    public static final ArrayList m70140a(List list, Map map) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C29719y c29719y = (C29719y) it.next();
            AbstractC29103d2 abstractC29103d2 = c29719y.f59781b;
            Object obj = map.get(abstractC29103d2 != null ? abstractC29103d2.mo69715b() : null);
            String str = obj instanceof String ? (String) obj : null;
            arrayList.add(new C29094c(c29719y, str, true ^ (str == null || StringsKt.isBlank(str))));
        }
        return arrayList;
    }
}
