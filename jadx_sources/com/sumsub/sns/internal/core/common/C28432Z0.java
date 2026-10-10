package com.sumsub.sns.internal.core.common;

import com.sumsub.sns.internal.features.data.model.common.remote.C29285T3;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.text.Regex;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.Z0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28432Z0 {

    /* JADX INFO: renamed from: a */
    public Map f57944a = MapsKt.emptyMap();

    /* JADX INFO: renamed from: a */
    public final InterfaceC28430Y0 m69315a(String str, String str2) {
        Regex regex = (Regex) this.f57944a.get(str2.toUpperCase(Locale.ROOT));
        if (regex == null) {
            return C28426W0.f57937a;
        }
        return regex.matches(str) ? C28428X0.f57938a : C28424V0.f57935a;
    }

    /* JADX INFO: renamed from: a */
    public final void m69316a(Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str = ((C29285T3) entry.getValue()).f59300b;
            Pair pairM90091to = str != null ? TuplesKt.m90091to(((String) entry.getKey()).toUpperCase(Locale.ROOT), new Regex(str)) : null;
            if (pairM90091to != null) {
                arrayList.add(pairM90091to);
            }
        }
        this.f57944a = MapsKt.toMap(arrayList);
    }
}
