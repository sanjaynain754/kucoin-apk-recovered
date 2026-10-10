package com.google.android.gms.wallet;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "PaymentCardRecognitionIntentResponseCreator")
public class PaymentCardRecognitionIntentResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PaymentCardRecognitionIntentResponse> CREATOR = new zzz();

    @SafeParcelable.Field(m12889id = 1)
    PendingIntent zza;

    public PaymentCardRecognitionIntentResponse() {
    }

    @SafeParcelable.Constructor
    public PaymentCardRecognitionIntentResponse(@SafeParcelable.Param(m12890id = 1) PendingIntent pendingIntent) {
        this.zza = pendingIntent;
    }

    @NonNull
    public PendingIntent getPaymentCardRecognitionPendingIntent() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
