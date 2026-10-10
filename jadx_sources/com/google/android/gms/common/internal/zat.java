package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "ResolveAccountRequestCreator")
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new zau();

    @SafeParcelable.VersionField(m12892id = 1)
    final int zaa;

    @SafeParcelable.Field(getter = "getAccount", m12889id = 2)
    private final Account zab;

    @SafeParcelable.Field(getter = "getSessionId", m12889id = 3)
    private final int zac;

    @Nullable
    @SafeParcelable.Field(getter = "getSignInAccountHint", m12889id = 4)
    private final GoogleSignInAccount zad;

    @SafeParcelable.Constructor
    public zat(@SafeParcelable.Param(m12890id = 1) int i11, @SafeParcelable.Param(m12890id = 2) Account account, @SafeParcelable.Param(m12890id = 3) int i12, @Nullable @SafeParcelable.Param(m12890id = 4) GoogleSignInAccount googleSignInAccount) {
        this.zaa = i11;
        this.zab = account;
        this.zac = i12;
        this.zad = googleSignInAccount;
    }

    public zat(Account account, int i11, @Nullable GoogleSignInAccount googleSignInAccount) {
        this(2, account, i11, googleSignInAccount);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.zaa;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i12);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zab, i11, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zac);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zad, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
