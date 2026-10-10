package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.provider.CredentialEntry;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "GoogleCertificatesLookupQueryCreator")
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();

    @SafeParcelable.Field(getter = "getCallingPackage", m12889id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getAllowTestKeys", m12889id = 2)
    private final boolean zzb;

    @SafeParcelable.Field(defaultValue = CredentialEntry.FALSE_STRING, getter = "getIgnoreTestKeysOverride", m12889id = 3)
    private final boolean zzc;

    @SafeParcelable.Field(getter = "getCallingContextBinder", m12889id = 4, type = "android.os.IBinder")
    private final Context zzd;

    @SafeParcelable.Field(getter = "getIsChimeraPackage", m12889id = 5)
    private final boolean zze;

    @SafeParcelable.Field(getter = "getIncludeHashesInErrorMessage", m12889id = 6)
    private final boolean zzf;

    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeIBinder(parcel, 4, ObjectWrapper.wrap(this.zzd), false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzo(@SafeParcelable.Param(m12890id = 1) String str, @SafeParcelable.Param(m12890id = 2) boolean z11, @SafeParcelable.Param(m12890id = 3) boolean z12, @SafeParcelable.Param(m12890id = 4) IBinder iBinder, @SafeParcelable.Param(m12890id = 5) boolean z13, @SafeParcelable.Param(m12890id = 6) boolean z14) {
        this.zza = str;
        this.zzb = z11;
        this.zzc = z12;
        this.zzd = (Context) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.zze = z13;
        this.zzf = z14;
    }
}
