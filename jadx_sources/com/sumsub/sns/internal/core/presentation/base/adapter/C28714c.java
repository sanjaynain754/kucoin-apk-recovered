package com.sumsub.sns.internal.core.presentation.base.adapter;

import com.sumsub.sns.internal.features.data.model.common.Document;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.base.adapter.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28714c {

    /* JADX INFO: renamed from: a */
    public final SNSDocumentViewTypeInfo$Type f58398a;

    /* JADX INFO: renamed from: b */
    public final Document f58399b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28714c)) {
            return false;
        }
        C28714c c28714c = (C28714c) obj;
        return this.f58398a == c28714c.f58398a && Intrinsics.areEqual(this.f58399b, c28714c.f58399b);
    }

    public final int hashCode() {
        return this.f58399b.hashCode() + (this.f58398a.hashCode() * 31);
    }

    public final String toString() {
        return "SNSDocumentViewTypeInfo(type=" + this.f58398a + ", document=" + this.f58399b + ")";
    }

    public C28714c(SNSDocumentViewTypeInfo$Type sNSDocumentViewTypeInfo$Type, Document document) {
        this.f58398a = sNSDocumentViewTypeInfo$Type;
        this.f58399b = document;
    }
}
