package com.sumsub.sns.internal.core.presentation.helper.camera;

import com.sumsub.sns.internal.core.presentation.intro.C28895g;
import java.util.Map;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.helper.camera.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28883d extends AbstractC28885f {

    /* JADX INFO: renamed from: a */
    public final C28895g f58729a;

    /* JADX INFO: renamed from: b */
    public final Map f58730b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28883d)) {
            return false;
        }
        C28883d c28883d = (C28883d) obj;
        return Intrinsics.areEqual(this.f58729a, c28883d.f58729a) && Intrinsics.areEqual(this.f58730b, c28883d.f58730b);
    }

    public final int hashCode() {
        return this.f58730b.hashCode() + (this.f58729a.hashCode() * 31);
    }

    public final String toString() {
        return "Intro(stepInfo=" + this.f58729a + ", instuctionsData=" + this.f58730b + ")";
    }

    public C28883d(C28895g c28895g, Map map) {
        this.f58729a = c28895g;
        this.f58730b = map;
    }
}
