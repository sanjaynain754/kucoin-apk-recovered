package com.sumsub.sns.internal.core.presentation.helper.camera;

import com.sumsub.sns.internal.core.presentation.intro.C28895g;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.helper.camera.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28882c extends AbstractC28885f {

    /* JADX INFO: renamed from: a */
    public final String f58725a;

    /* JADX INFO: renamed from: b */
    public final String f58726b;

    /* JADX INFO: renamed from: c */
    public final String f58727c;

    /* JADX INFO: renamed from: d */
    public final C28895g f58728d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28882c)) {
            return false;
        }
        C28882c c28882c = (C28882c) obj;
        return Intrinsics.areEqual(this.f58725a, c28882c.f58725a) && Intrinsics.areEqual(this.f58726b, c28882c.f58726b) && Intrinsics.areEqual(this.f58727c, c28882c.f58727c) && Intrinsics.areEqual(this.f58728d, c28882c.f58728d);
    }

    public final int hashCode() {
        return this.f58728d.hashCode() + ((this.f58727c.hashCode() + ((this.f58726b.hashCode() + (this.f58725a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str = this.f58725a;
        String str2 = this.f58726b;
        String str3 = this.f58727c;
        return "BriefDetails(title=" + ((Object) str) + ", brief=" + ((Object) str2) + ", details=" + ((Object) str3) + ", stepInfo=" + this.f58728d + ")";
    }

    public C28882c(String str, String str2, String str3, C28895g c28895g) {
        this.f58725a = str;
        this.f58726b = str2;
        this.f58727c = str3;
        this.f58728d = c28895g;
    }
}
