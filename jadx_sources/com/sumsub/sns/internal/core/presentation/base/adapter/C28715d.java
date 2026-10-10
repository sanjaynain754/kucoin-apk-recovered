package com.sumsub.sns.internal.core.presentation.base.adapter;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.base.adapter.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28715d extends AbstractC28712a {

    /* JADX INFO: renamed from: b */
    public final String f58400b;

    public C28715d(String str) {
        super(6);
        this.f58400b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28715d) && Intrinsics.areEqual(this.f58400b, ((C28715d) obj).f58400b);
    }

    public final int hashCode() {
        return this.f58400b.hashCode();
    }

    public final String toString() {
        return "SNSDocumentsModeratorCommentViewItem(moderatorComment=" + ((Object) this.f58400b) + ")";
    }
}
