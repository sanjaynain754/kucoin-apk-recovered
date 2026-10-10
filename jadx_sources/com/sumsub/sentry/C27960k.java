package com.sumsub.sentry;

import java.util.Comparator;
import java.util.Map;
import p852kotlin.comparisons.ComparisonsKt;

/* JADX INFO: renamed from: com.sumsub.sentry.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C27960k implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.compareValues((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
    }
}
