package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.credentials.provider.CredentialEntry;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "ModuleInstallResponseCreator")
public class ModuleInstallResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new zad();

    @SafeParcelable.Field(getter = "getSessionId", m12889id = 1)
    private final int zaa;

    @SafeParcelable.Field(defaultValue = CredentialEntry.FALSE_STRING, getter = "getShouldUnregisterListener", m12889id = 2)
    private final boolean zab;

    @KeepForSdk
    public ModuleInstallResponse(int i11) {
        this(i11, false);
    }

    @SafeParcelable.Constructor
    public ModuleInstallResponse(@SafeParcelable.Param(m12890id = 1) int i11, @SafeParcelable.Param(m12890id = 2) boolean z11) {
        this.zaa = i11;
        this.zab = z11;
    }

    public boolean areModulesAlreadyInstalled() {
        return this.zaa == 0;
    }

    public int getSessionId() {
        return this.zaa;
    }

    public final boolean zaa() {
        return this.zab;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getSessionId());
        SafeParcelWriter.writeBoolean(parcel, 2, this.zab);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
