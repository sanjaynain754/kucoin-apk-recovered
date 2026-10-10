package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "LoyaltyPointsBalanceCreator")
@SafeParcelable.Reserved({1})
public final class LoyaltyPointsBalance extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LoyaltyPointsBalance> CREATOR = new zzi();

    @SafeParcelable.Field(m12889id = 2)
    int zza;

    @SafeParcelable.Field(m12889id = 3)
    String zzb;

    @SafeParcelable.Field(m12889id = 4)
    double zzc;

    @SafeParcelable.Field(m12889id = 5)
    String zzd;

    @SafeParcelable.Field(m12889id = 6)
    long zze;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.wallet.wobs.LoyaltyPointsBalance.Type.UNDEFINED", m12889id = 7)
    int zzf;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
    public final class Builder {
        public /* synthetic */ Builder(zzh zzhVar) {
        }

        @NonNull
        public LoyaltyPointsBalance build() {
            return LoyaltyPointsBalance.this;
        }

        @NonNull
        public Builder setDouble(double d11) {
            LoyaltyPointsBalance loyaltyPointsBalance = LoyaltyPointsBalance.this;
            loyaltyPointsBalance.zzc = d11;
            loyaltyPointsBalance.zzf = 2;
            return this;
        }

        @NonNull
        public Builder setInt(int i11) {
            LoyaltyPointsBalance loyaltyPointsBalance = LoyaltyPointsBalance.this;
            loyaltyPointsBalance.zza = i11;
            loyaltyPointsBalance.zzf = 0;
            return this;
        }

        @NonNull
        public Builder setMoney(@NonNull String str, long j11) {
            LoyaltyPointsBalance loyaltyPointsBalance = LoyaltyPointsBalance.this;
            loyaltyPointsBalance.zzd = str;
            loyaltyPointsBalance.zze = j11;
            loyaltyPointsBalance.zzf = 3;
            return this;
        }

        @NonNull
        public Builder setString(@NonNull String str) {
            LoyaltyPointsBalance loyaltyPointsBalance = LoyaltyPointsBalance.this;
            loyaltyPointsBalance.zzb = str;
            loyaltyPointsBalance.zzf = 1;
            return this;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
    public interface Type {
        public static final int DOUBLE = 2;
        public static final int INT = 0;
        public static final int MONEY = 3;
        public static final int STRING = 1;
        public static final int UNDEFINED = -1;
    }

    public LoyaltyPointsBalance() {
        this.zzf = -1;
        this.zza = -1;
        this.zzc = -1.0d;
    }

    @SafeParcelable.Constructor
    public LoyaltyPointsBalance(@SafeParcelable.Param(m12890id = 2) int i11, @SafeParcelable.Param(m12890id = 3) String str, @SafeParcelable.Param(m12890id = 4) double d11, @SafeParcelable.Param(m12890id = 5) String str2, @SafeParcelable.Param(m12890id = 6) long j11, @SafeParcelable.Param(m12890id = 7) int i12) {
        this.zza = i11;
        this.zzb = str;
        this.zzc = d11;
        this.zzd = str2;
        this.zze = j11;
        this.zzf = i12;
    }

    @NonNull
    public static Builder newBuilder() {
        return new LoyaltyPointsBalance().new Builder(null);
    }

    @NonNull
    public String getCurrencyCode() {
        return this.zzd;
    }

    public long getCurrencyMicros() {
        return this.zze;
    }

    public double getDouble() {
        return this.zzc;
    }

    public int getInt() {
        return this.zza;
    }

    @NonNull
    public String getString() {
        return this.zzb;
    }

    public int getType() {
        return this.zzf;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeDouble(parcel, 4, this.zzc);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeLong(parcel, 6, this.zze);
        SafeParcelWriter.writeInt(parcel, 7, this.zzf);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
