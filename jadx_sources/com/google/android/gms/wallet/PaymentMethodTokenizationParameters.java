package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "PaymentMethodTokenizationParametersCreator")
@SafeParcelable.Reserved({1})
public final class PaymentMethodTokenizationParameters extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PaymentMethodTokenizationParameters> CREATOR = new zzaf();

    @SafeParcelable.Field(m12889id = 2)
    int zza;

    @SafeParcelable.Field(m12889id = 3)
    final Bundle zzb;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
    public final class Builder {
        public /* synthetic */ Builder(zzae zzaeVar) {
        }

        @NonNull
        public Builder addParameter(@NonNull String str, @NonNull String str2) {
            Preconditions.checkNotEmpty(str, "Tokenization parameter name must not be empty");
            Preconditions.checkNotEmpty(str2, "Tokenization parameter value must not be empty");
            PaymentMethodTokenizationParameters.this.zzb.putString(str, str2);
            return this;
        }

        @NonNull
        public PaymentMethodTokenizationParameters build() {
            return PaymentMethodTokenizationParameters.this;
        }

        @NonNull
        public Builder setPaymentMethodTokenizationType(int i11) {
            PaymentMethodTokenizationParameters.this.zza = i11;
            return this;
        }
    }

    private PaymentMethodTokenizationParameters() {
        this.zzb = new Bundle();
    }

    @NonNull
    public static Builder newBuilder() {
        return new PaymentMethodTokenizationParameters().new Builder(null);
    }

    @NonNull
    public Bundle getParameters() {
        return new Bundle(this.zzb);
    }

    public int getPaymentMethodTokenizationType() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    public PaymentMethodTokenizationParameters(@SafeParcelable.Param(m12890id = 2) int i11, @SafeParcelable.Param(m12890id = 3) Bundle bundle) {
        new Bundle();
        this.zza = i11;
        this.zzb = bundle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeBundle(parcel, 3, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
