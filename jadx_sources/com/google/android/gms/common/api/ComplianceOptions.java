package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.credentials.provider.CredentialEntry;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes45.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "ComplianceOptionsCreator")
public final class ComplianceOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ComplianceOptions> CREATOR;

    @NonNull
    public static final ComplianceOptions zza;

    @SafeParcelable.Field(getter = "getCallerProductId", m12889id = 1)
    private final int zzb;

    @SafeParcelable.Field(getter = "getDataOwnerProductId", m12889id = 2)
    private final int zzc;

    @SafeParcelable.Field(getter = "getProcessingReason", m12889id = 3)
    private final int zzd;

    @SafeParcelable.Field(defaultValue = CredentialEntry.TRUE_STRING, getter = "isUserData", m12889id = 4)
    private final boolean zze;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    @KeepForSdk
    public static final class Builder {
        private int zza = -1;
        private int zzb = -1;
        private int zzc = 0;
        private boolean zzd = true;

        @NonNull
        @KeepForSdk
        public ComplianceOptions build() {
            return new ComplianceOptions(this.zza, this.zzb, this.zzc, this.zzd);
        }

        @NonNull
        @KeepForSdk
        public Builder setCallerProductId(int i11) {
            this.zza = i11;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder setDataOwnerProductId(int i11) {
            this.zzb = i11;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder setIsUserData(boolean z11) {
            this.zzd = z11;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder setProcessingReason(int i11) {
            this.zzc = i11;
            return this;
        }
    }

    @NonNull
    @KeepForSdk
    public static Builder newBuilder() {
        return new Builder();
    }

    @NonNull
    @KeepForSdk
    public static final Builder newBuilder(@NonNull Context context) {
        return newBuilder();
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ComplianceOptions)) {
            return false;
        }
        ComplianceOptions complianceOptions = (ComplianceOptions) obj;
        return this.zzb == complianceOptions.zzb && this.zzc == complianceOptions.zzc && this.zzd == complianceOptions.zzd && this.zze == complianceOptions.zze;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), Boolean.valueOf(this.zze));
    }

    @NonNull
    @KeepForSdk
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setCallerProductId(this.zzb);
        builder.setDataOwnerProductId(this.zzc);
        builder.setProcessingReason(this.zzd);
        builder.setIsUserData(this.zze);
        return builder;
    }

    @NonNull
    public final String toString() {
        return "ComplianceOptions{callerProductId=" + this.zzb + ", dataOwnerProductId=" + this.zzc + ", processingReason=" + this.zzd + ", isUserData=" + this.zze + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i11) {
        int i12 = this.zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i12);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    static {
        Builder builderNewBuilder = newBuilder();
        builderNewBuilder.setCallerProductId(-1);
        builderNewBuilder.setDataOwnerProductId(-1);
        builderNewBuilder.setProcessingReason(0);
        builderNewBuilder.setIsUserData(true);
        zza = builderNewBuilder.build();
        CREATOR = new zzc();
    }

    @SafeParcelable.Constructor
    public ComplianceOptions(@SafeParcelable.Param(m12890id = 1) int i11, @SafeParcelable.Param(m12890id = 2) int i12, @SafeParcelable.Param(m12890id = 3) int i13, @SafeParcelable.Param(m12890id = 4) boolean z11) {
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = z11;
    }
}
