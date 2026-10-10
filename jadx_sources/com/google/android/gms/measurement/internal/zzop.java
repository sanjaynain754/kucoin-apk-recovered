package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "UploadBatchesParcelCreator")
public final class zzop extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzop> CREATOR = new zzoq();

    @SafeParcelable.Field(m12889id = 1)
    public final List zza;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        List list = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, list, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzop(@SafeParcelable.Param(m12890id = 1) List list) {
        this.zza = list;
    }
}
