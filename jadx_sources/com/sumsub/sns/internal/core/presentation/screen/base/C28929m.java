package com.sumsub.sns.internal.core.presentation.screen.base;

import com.sumsub.sns.core.presentation.base.AbstractC28081V;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.screen.base.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28929m extends AbstractC28081V implements InterfaceC28920d {

    /* JADX INFO: renamed from: a */
    public final List f58817a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28929m) && Intrinsics.areEqual(this.f58817a, ((C28929m) obj).f58817a);
    }

    public final int hashCode() {
        return this.f58817a.hashCode();
    }

    public final String toString() {
        return "ViewState(screenStack=" + this.f58817a + ")";
    }

    public C28929m(List list) {
        this.f58817a = list;
    }
}
