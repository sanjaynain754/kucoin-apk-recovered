package com.sumsub.sns.internal.features.data.model.common;

import com.sumsub.sns.core.widget.AbstractC28250a;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.A */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28975A extends AbstractC28985C {

    /* JADX INFO: renamed from: b */
    public final String f58898b;

    /* JADX INFO: renamed from: c */
    public final int f58899c;

    /* JADX INFO: renamed from: d */
    public final List f58900d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28975A)) {
            return false;
        }
        C28975A c28975a = (C28975A) obj;
        return Intrinsics.areEqual(this.f58898b, c28975a.f58898b) && this.f58899c == c28975a.f58899c && Intrinsics.areEqual(this.f58900d, c28975a.f58900d);
    }

    public final int hashCode() {
        String str = this.f58898b;
        return this.f58900d.hashCode() + AbstractC28250a.m69223a(this.f58899c, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public final String toString() {
        return "Dropdown(label=" + this.f58898b + ", currentSelectedItem=" + this.f58899c + ", items=" + this.f58900d + ")";
    }

    public C28975A(int i11, String str, List list) {
        this.f58898b = str;
        this.f58899c = i11;
        this.f58900d = list;
    }
}
