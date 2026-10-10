package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "SignInButtonConfigCreator")
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new zay();

    @SafeParcelable.VersionField(m12892id = 1)
    final int zaa;

    @SafeParcelable.Field(getter = "getButtonSize", m12889id = 2)
    private final int zab;

    @SafeParcelable.Field(getter = "getColorScheme", m12889id = 3)
    private final int zac;

    @Nullable
    @SafeParcelable.Field(getter = "getScopes", m12889id = 4)
    @Deprecated
    private final Scope[] zad;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.zaa;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i12);
        SafeParcelWriter.writeInt(parcel, 2, this.zab);
        SafeParcelWriter.writeInt(parcel, 3, this.zac);
        SafeParcelWriter.writeTypedArray(parcel, 4, this.zad, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zax(@SafeParcelable.Param(m12890id = 1) int i11, @SafeParcelable.Param(m12890id = 2) int i12, @SafeParcelable.Param(m12890id = 3) int i13, @Nullable @SafeParcelable.Param(m12890id = 4) Scope[] scopeArr) {
        this.zaa = i11;
        this.zab = i12;
        this.zac = i13;
        this.zad = scopeArr;
    }
}
