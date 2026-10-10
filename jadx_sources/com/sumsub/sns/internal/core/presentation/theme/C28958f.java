package com.sumsub.sns.internal.core.presentation.theme;

import java.util.LinkedHashMap;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.theme.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28958f extends AbstractC28962j {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f58865a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28958f) && Intrinsics.areEqual(this.f58865a, ((C28958f) obj).f58865a);
    }

    public final int hashCode() {
        return this.f58865a.hashCode();
    }

    public final String toString() {
        return "ImageList(images=" + this.f58865a + ")";
    }
}
