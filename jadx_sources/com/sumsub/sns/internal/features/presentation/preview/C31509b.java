package com.sumsub.sns.internal.features.presentation.preview;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.internal.features.data.model.common.Document;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31509b implements InterfaceC28145r {

    /* JADX INFO: renamed from: a */
    public final Document f63935a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31509b) && Intrinsics.areEqual(this.f63935a, ((C31509b) obj).f63935a);
    }

    public final int hashCode() {
        return this.f63935a.hashCode();
    }

    public final String toString() {
        return "DocumentUploaded(document=" + this.f63935a + ")";
    }

    public C31509b(Document document) {
        this.f63935a = document;
    }
}
