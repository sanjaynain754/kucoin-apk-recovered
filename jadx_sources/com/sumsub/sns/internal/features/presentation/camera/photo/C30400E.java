package com.sumsub.sns.internal.features.presentation.camera.photo;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.E */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30400E implements InterfaceC30681m {

    /* JADX INFO: renamed from: a */
    public final InterfaceC30399D f61160a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f61161b;

    /* JADX INFO: renamed from: c */
    public final String f61162c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30400E)) {
            return false;
        }
        C30400E c30400e = (C30400E) obj;
        return Intrinsics.areEqual(this.f61160a, c30400e.f61160a) && Intrinsics.areEqual(this.f61161b, c30400e.f61161b) && Intrinsics.areEqual(this.f61162c, c30400e.f61162c);
    }

    public final int hashCode() {
        int iHashCode = this.f61160a.hashCode() * 31;
        CharSequence charSequence = this.f61161b;
        return this.f61162c.hashCode() + ((iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31);
    }

    public final String toString() {
        InterfaceC30399D interfaceC30399D = this.f61160a;
        CharSequence charSequence = this.f61161b;
        return "SelectableItem(identifier=" + interfaceC30399D + ", title=" + ((Object) charSequence) + ", drawableId=" + this.f61162c + ")";
    }

    public C30400E(InterfaceC30399D interfaceC30399D, CharSequence charSequence, String str) {
        this.f61160a = interfaceC30399D;
        this.f61161b = charSequence;
        this.f61162c = str;
    }
}
