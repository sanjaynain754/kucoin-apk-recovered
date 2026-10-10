package com.google.android.gms.wallet;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "PaymentCardRecognitionCreator")
public final class PaymentCardRecognitionResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PaymentCardRecognitionResult> CREATOR = new zzw();

    @SafeParcelable.Field(m12889id = 1)
    String zza;

    @Nullable
    @SafeParcelable.Field(m12889id = 2)
    CreditCardExpirationDate zzb;

    public PaymentCardRecognitionResult() {
    }

    @SafeParcelable.Constructor
    public PaymentCardRecognitionResult(@SafeParcelable.Param(m12890id = 1) String str, @Nullable @SafeParcelable.Param(m12890id = 2) CreditCardExpirationDate creditCardExpirationDate) {
        this.zza = str;
        this.zzb = creditCardExpirationDate;
    }

    @Nullable
    public static PaymentCardRecognitionResult getFromIntent(@NonNull Intent intent) {
        return (PaymentCardRecognitionResult) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.wallet.PaymentCardRecognitionResult", CREATOR);
    }

    @Nullable
    public CreditCardExpirationDate getCreditCardExpirationDate() {
        return this.zzb;
    }

    @NonNull
    public String getPan() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
