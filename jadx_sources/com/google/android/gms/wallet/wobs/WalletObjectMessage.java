package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "WalletObjectMessageCreator")
@SafeParcelable.Reserved({1})
public final class WalletObjectMessage extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<WalletObjectMessage> CREATOR = new zzo();

    @SafeParcelable.Field(m12889id = 2)
    String zza;

    @SafeParcelable.Field(m12889id = 3)
    String zzb;

    @SafeParcelable.Field(m12889id = 4)
    TimeInterval zzc;

    @SafeParcelable.Field(m12889id = 5)
    @Deprecated
    UriData zzd;

    @SafeParcelable.Field(m12889id = 6)
    @Deprecated
    UriData zze;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
    public final class Builder {
        public /* synthetic */ Builder(zzn zznVar) {
        }

        @NonNull
        public WalletObjectMessage build() {
            return WalletObjectMessage.this;
        }

        @NonNull
        @Deprecated
        public Builder setActionUri(@NonNull UriData uriData) {
            WalletObjectMessage.this.zzd = uriData;
            return this;
        }

        @NonNull
        public Builder setBody(@NonNull String str) {
            WalletObjectMessage.this.zzb = str;
            return this;
        }

        @NonNull
        public Builder setDisplayInterval(@NonNull TimeInterval timeInterval) {
            WalletObjectMessage.this.zzc = timeInterval;
            return this;
        }

        @NonNull
        public Builder setHeader(@NonNull String str) {
            WalletObjectMessage.this.zza = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setImageUri(@NonNull UriData uriData) {
            WalletObjectMessage.this.zze = uriData;
            return this;
        }
    }

    public WalletObjectMessage() {
    }

    @SafeParcelable.Constructor
    public WalletObjectMessage(@SafeParcelable.Param(m12890id = 2) String str, @SafeParcelable.Param(m12890id = 3) String str2, @SafeParcelable.Param(m12890id = 4) TimeInterval timeInterval, @SafeParcelable.Param(m12890id = 5) UriData uriData, @SafeParcelable.Param(m12890id = 6) UriData uriData2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = timeInterval;
        this.zzd = uriData;
        this.zze = uriData2;
    }

    @NonNull
    public static Builder newBuilder() {
        return new WalletObjectMessage().new Builder(null);
    }

    @NonNull
    @Deprecated
    public UriData getActionUri() {
        return this.zzd;
    }

    @NonNull
    public String getBody() {
        return this.zzb;
    }

    @NonNull
    public TimeInterval getDisplayInterval() {
        return this.zzc;
    }

    @NonNull
    public String getHeader() {
        return this.zza;
    }

    @NonNull
    @Deprecated
    public UriData getImageUri() {
        return this.zze;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zze, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
