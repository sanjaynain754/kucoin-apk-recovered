package com.sumsub.sns.internal.core.domain;

import com.sumsub.sns.internal.core.common.InterfaceC28418S0;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29980i;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.domain.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28553f implements InterfaceC28418S0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C28578h f58105a;

    public C28553f(C28578h c28578h) {
        this.f58105a = c28578h;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00af  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sumsub.sns.internal.core.common.InterfaceC28418S0
    /* JADX INFO: renamed from: a */
    public final String mo69300a(String str) {
        C29124h c29124h;
        LinkedHashMap linkedHashMap;
        Map map;
        Pair pairM90091to;
        C29980i c29980i = (C29980i) ((C29967J) ((InterfaceC29984m) this.f58105a.f58180r.getValue())).f60201i.getValue();
        if (c29980i != null && (c29124h = (C29124h) c29980i.f60240b.m70051c()) != null) {
            Map map2 = c29124h.f59071d;
            Object obj = map2 != null ? map2.get("errorCodes") : null;
            Map map3 = obj instanceof Map ? (Map) obj : null;
            if (map3 != null) {
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map3.entrySet()) {
                    if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            } else {
                linkedHashMap = null;
            }
            if (linkedHashMap == null || !(!linkedHashMap.isEmpty())) {
                linkedHashMap = null;
            }
            if (linkedHashMap != null) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key = entry2.getKey();
                    if (!(key instanceof String)) {
                        key = null;
                    }
                    String str2 = (String) key;
                    if (str2 == null) {
                        pairM90091to = null;
                    } else {
                        Object value = entry2.getValue();
                        if (!(value instanceof String)) {
                            value = null;
                        }
                        String str3 = (String) value;
                        if (str3 == null) {
                            pairM90091to = null;
                        } else {
                            pairM90091to = TuplesKt.m90091to(str2, str3);
                        }
                    }
                    if (pairM90091to != null) {
                        arrayList.add(pairM90091to);
                    }
                }
                map = MapsKt.toMap(arrayList);
            } else {
                map = null;
            }
            if (map != null) {
                return (String) map.get(str);
            }
        }
        return null;
    }
}
