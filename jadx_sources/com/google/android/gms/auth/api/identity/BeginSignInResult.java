package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "BeginSignInResultCreator")
@Deprecated
public final class BeginSignInResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = new zbh();

    @SafeParcelable.Field(getter = "getPendingIntent", m12889id = 1)
    private final PendingIntent zba;

    @NonNull
    public PendingIntent getPendingIntent() {
        return this.zba;
    }

    @SafeParcelable.Constructor
    public BeginSignInResult(@NonNull @SafeParcelable.Param(m12890id = 1) PendingIntent pendingIntent) {
        this.zba = (PendingIntent) Preconditions.checkNotNull(pendingIntent);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getPendingIntent(), i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
