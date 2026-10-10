package com.sumsub.sns.internal.features.data.model.common;

import java.util.Comparator;
import java.util.List;
import p852kotlin.comparisons.ComparisonsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.N */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29031N implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f58973a;

    public C29031N(List list) {
        this.f58973a = list;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.compareValues(Integer.valueOf(!this.f58973a.contains(((C29070X) obj).f59014a) ? 1 : 0), Integer.valueOf(!this.f58973a.contains(((C29070X) obj2).f59014a) ? 1 : 0));
    }
}
