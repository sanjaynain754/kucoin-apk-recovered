package com.sumsub.sns.internal.core.presentation.screen.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.features.data.model.common.ValidationIdentifierType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.screen.navigation.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28945b implements InterfaceC28952i {

    @NotNull
    public static final Parcelable.Creator<C28945b> CREATOR = new C28944a();

    /* JADX INFO: renamed from: a */
    public final String f58848a;

    /* JADX INFO: renamed from: b */
    public final ValidationIdentifierType f58849b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28945b)) {
            return false;
        }
        C28945b c28945b = (C28945b) obj;
        return Intrinsics.areEqual(this.f58848a, c28945b.f58848a) && this.f58849b == c28945b.f58849b;
    }

    public final int hashCode() {
        return this.f58849b.hashCode() + (this.f58848a.hashCode() * 31);
    }

    public final String toString() {
        return "CodeInput(identifier=" + this.f58848a + ", verificationType=" + this.f58849b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f58848a);
        this.f58849b.writeToParcel(parcel, i11);
    }

    public C28945b(String str, ValidationIdentifierType validationIdentifierType) {
        this.f58848a = str;
        this.f58849b = validationIdentifierType;
    }
}
