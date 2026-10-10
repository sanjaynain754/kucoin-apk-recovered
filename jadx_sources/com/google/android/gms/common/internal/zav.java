package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "ResolveAccountResponseCreator")
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new zaw();

    @SafeParcelable.VersionField(m12892id = 1)
    final int zaa;

    @Nullable
    @SafeParcelable.Field(m12889id = 2)
    final IBinder zab;

    @SafeParcelable.Field(getter = "getConnectionResult", m12889id = 3)
    private final ConnectionResult zac;

    @SafeParcelable.Field(getter = "getSaveDefaultAccount", m12889id = 4)
    private final boolean zad;

    @SafeParcelable.Field(getter = "isFromCrossClientAuth", m12889id = 5)
    private final boolean zae;

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zavVar = (zav) obj;
        return this.zac.equals(zavVar.zac) && Objects.equal(zab(), zavVar.zab());
    }

    public final ConnectionResult zaa() {
        return this.zac;
    }

    @Nullable
    public final IAccountAccessor zab() {
        IBinder iBinder = this.zab;
        if (iBinder == null) {
            return null;
        }
        return IAccountAccessor.Stub.asInterface(iBinder);
    }

    public final boolean zac() {
        return this.zad;
    }

    public final boolean zad() {
        return this.zae;
    }

    @SafeParcelable.Constructor
    public zav(@SafeParcelable.Param(m12890id = 1) int i11, @Nullable @SafeParcelable.Param(m12890id = 2) IBinder iBinder, @SafeParcelable.Param(m12890id = 3) ConnectionResult connectionResult, @SafeParcelable.Param(m12890id = 4) boolean z11, @SafeParcelable.Param(m12890id = 5) boolean z12) {
        this.zaa = i11;
        this.zab = iBinder;
        this.zac = connectionResult;
        this.zad = z11;
        this.zae = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zab, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zac, i11, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zad);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zae);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
