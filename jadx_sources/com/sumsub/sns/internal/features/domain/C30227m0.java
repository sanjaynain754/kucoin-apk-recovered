package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.features.data.model.common.Document;
import java.util.List;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.m0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30227m0 extends AbstractC30176f0 {

    /* JADX INFO: renamed from: d */
    public final List f60759d;

    /* JADX INFO: renamed from: e */
    public final boolean f60760e;

    public C30227m0(Document document, String str, List list) {
        super(document, str, false);
        this.f60759d = list;
        this.f60760e = false;
    }

    public C30227m0(Document document, String str, List list, boolean z11, boolean z12) {
        super(document, str, z11);
        this.f60759d = list;
        this.f60760e = z12;
    }
}
