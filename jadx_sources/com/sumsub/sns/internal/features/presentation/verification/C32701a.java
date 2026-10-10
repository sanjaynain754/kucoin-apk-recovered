package com.sumsub.sns.internal.features.presentation.verification;

import androidx.lifecycle.SavedStateHandle;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32701a {

    /* JADX INFO: renamed from: a */
    public final SavedStateHandle f66873a;

    /* JADX INFO: renamed from: b */
    public final Map f66874b;

    public C32701a(SavedStateHandle savedStateHandle, Map map) {
        this.f66873a = savedStateHandle;
        this.f66874b = map;
        long jCurrentTimeMillis = System.currentTimeMillis();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((Number) entry.getValue()).longValue() > jCurrentTimeMillis) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            this.f66873a.set((String) entry2.getKey(), Long.valueOf(((Number) entry2.getValue()).longValue()));
        }
    }
}
