package com.sumsub.sns.internal.core.presentation.android;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sentry.android.AbstractC27920h;
import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28643c implements InterfaceC28649f {

    @NotNull
    public static final Parcelable.Creator<C28643c> CREATOR = new C28641b();

    /* JADX INFO: renamed from: a */
    public final Set f58276a;

    /* JADX INFO: renamed from: b */
    public final boolean f58277b;

    /* JADX INFO: renamed from: c */
    public final boolean f58278c;

    /* JADX INFO: renamed from: d */
    public final int f58279d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28643c)) {
            return false;
        }
        C28643c c28643c = (C28643c) obj;
        return Intrinsics.areEqual(this.f58276a, c28643c.f58276a) && this.f58277b == c28643c.f58277b && this.f58278c == c28643c.f58278c && this.f58279d == c28643c.f58279d;
    }

    /* JADX INFO: renamed from: a */
    public static C28643c m69486a(C28643c c28643c, Set set, boolean z11, int i11, int i12) {
        if ((i12 & 1) != 0) {
            set = c28643c.f58276a;
        }
        boolean z12 = (i12 & 2) != 0 ? c28643c.f58277b : true;
        if ((i12 & 4) != 0) {
            z11 = c28643c.f58278c;
        }
        if ((i12 & 8) != 0) {
            i11 = c28643c.f58279d;
        }
        return new C28643c(set, z12, z11, i11);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f58279d) + AbstractC27920h.m69001a(this.f58278c, AbstractC27920h.m69001a(this.f58277b, this.f58276a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "Checking(permissions=" + this.f58276a + ", askedForRuntimePermissions=" + this.f58277b + ", permissionsChanged=" + this.f58278c + ", attempt=" + this.f58279d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        Set set = this.f58276a;
        parcel.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i11);
        }
        parcel.writeInt(this.f58277b ? 1 : 0);
        parcel.writeInt(this.f58278c ? 1 : 0);
        parcel.writeInt(this.f58279d);
    }

    public C28643c(Set set, boolean z11, boolean z12, int i11) {
        this.f58276a = set;
        this.f58277b = z11;
        this.f58278c = z12;
        this.f58279d = i11;
    }
}
