package com.google.android.gms.wallet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.identity.intents.model.UserAddress;

/* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "PaymentDataCreator")
public final class PaymentData extends AbstractSafeParcelable implements AutoResolvableResult {

    @NonNull
    public static final Parcelable.Creator<PaymentData> CREATOR = new zzaa();

    @SafeParcelable.Field(m12889id = 1)
    String zza;

    @SafeParcelable.Field(m12889id = 2)
    CardInfo zzb;

    @SafeParcelable.Field(m12889id = 3)
    UserAddress zzc;

    @SafeParcelable.Field(m12889id = 4)
    PaymentMethodToken zzd;

    @SafeParcelable.Field(m12889id = 5)
    String zze;

    @SafeParcelable.Field(m12889id = 6)
    Bundle zzf;

    @SafeParcelable.Field(m12889id = 7)
    String zzg;

    @Nullable
    @SafeParcelable.Field(m12889id = 8)
    Bundle zzh;

    private PaymentData() {
    }

    @SafeParcelable.Constructor
    public PaymentData(@SafeParcelable.Param(m12890id = 1) String str, @SafeParcelable.Param(m12890id = 2) CardInfo cardInfo, @SafeParcelable.Param(m12890id = 3) UserAddress userAddress, @SafeParcelable.Param(m12890id = 4) PaymentMethodToken paymentMethodToken, @SafeParcelable.Param(m12890id = 5) String str2, @SafeParcelable.Param(m12890id = 6) Bundle bundle, @SafeParcelable.Param(m12890id = 7) String str3, @Nullable @SafeParcelable.Param(m12890id = 8) Bundle bundle2) {
        this.zza = str;
        this.zzb = cardInfo;
        this.zzc = userAddress;
        this.zzd = paymentMethodToken;
        this.zze = str2;
        this.zzf = bundle;
        this.zzg = str3;
        this.zzh = bundle2;
    }

    @NonNull
    public static PaymentData fromJson(@NonNull String str) {
        PaymentData paymentData = new PaymentData();
        paymentData.zzg = (String) Preconditions.checkNotNull(str, "paymentDataJson cannot be null!");
        return paymentData;
    }

    @Nullable
    public static PaymentData getFromIntent(@NonNull Intent intent) {
        return (PaymentData) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.wallet.PaymentData", CREATOR);
    }

    @NonNull
    @Deprecated
    public CardInfo getCardInfo() {
        return this.zzb;
    }

    @Nullable
    @Deprecated
    public String getEmail() {
        return this.zza;
    }

    @Nullable
    @Deprecated
    public Bundle getExtraData() {
        return this.zzf;
    }

    @NonNull
    @Deprecated
    public String getGoogleTransactionId() {
        return this.zze;
    }

    @Nullable
    public Bundle getLastSavedState() {
        return this.zzh;
    }

    @Nullable
    @Deprecated
    public PaymentMethodToken getPaymentMethodToken() {
        return this.zzd;
    }

    @Nullable
    @Deprecated
    public UserAddress getShippingAddress() {
        return this.zzc;
    }

    @Override // com.google.android.gms.wallet.AutoResolvableResult
    public void putIntoIntent(@NonNull Intent intent) {
        SafeParcelableSerializer.serializeToIntentExtra(this, intent, "com.google.android.gms.wallet.PaymentData");
    }

    @NonNull
    public String toJson() {
        return this.zzg;
    }

    @NonNull
    public PaymentData withLastSavedState(@Nullable Bundle bundle) {
        this.zzh = bundle;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i11, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeBundle(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeBundle(parcel, 8, this.zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
