package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.credentials.provider.CredentialEntry;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "PaymentDataRequestCreator")
public final class PaymentDataRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PaymentDataRequest> CREATOR = new zzac();

    @SafeParcelable.Field(m12889id = 1)
    boolean zza;

    @SafeParcelable.Field(m12889id = 2)
    boolean zzb;

    @SafeParcelable.Field(m12889id = 3)
    CardRequirements zzc;

    @SafeParcelable.Field(m12889id = 4)
    boolean zzd;

    @SafeParcelable.Field(m12889id = 5)
    ShippingAddressRequirements zze;

    @SafeParcelable.Field(m12889id = 6)
    ArrayList zzf;

    @SafeParcelable.Field(m12889id = 7)
    PaymentMethodTokenizationParameters zzg;

    @SafeParcelable.Field(m12889id = 8)
    TransactionInfo zzh;

    @SafeParcelable.Field(defaultValue = CredentialEntry.TRUE_STRING, m12889id = 9)
    boolean zzi;

    @SafeParcelable.Field(m12889id = 10)
    String zzj;

    @Nullable
    @ShowFirstParty
    @SafeParcelable.Field(m12889id = 12)
    byte[] zzk;

    @Nullable
    @SafeParcelable.Field(m12889id = 11)
    Bundle zzl;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
    @Deprecated
    public final class Builder {
        @NonNull
        public Builder addAllowedPaymentMethods(@NonNull Collection<Integer> collection) {
            boolean z11 = false;
            if (collection != null && !collection.isEmpty()) {
                z11 = true;
            }
            Preconditions.checkArgument(z11, "allowedPaymentMethods can't be null or empty!");
            PaymentDataRequest paymentDataRequest = PaymentDataRequest.this;
            if (paymentDataRequest.zzf == null) {
                paymentDataRequest.zzf = new ArrayList();
            }
            PaymentDataRequest.this.zzf.addAll(collection);
            return this;
        }

        public /* synthetic */ Builder(zzab zzabVar) {
        }

        @NonNull
        public Builder addAllowedPaymentMethod(int i11) {
            PaymentDataRequest paymentDataRequest = PaymentDataRequest.this;
            if (paymentDataRequest.zzf == null) {
                paymentDataRequest.zzf = new ArrayList();
            }
            PaymentDataRequest.this.zzf.add(Integer.valueOf(i11));
            return this;
        }

        @NonNull
        public PaymentDataRequest build() {
            PaymentDataRequest paymentDataRequest = PaymentDataRequest.this;
            if (paymentDataRequest.zzj == null && paymentDataRequest.zzk == null) {
                Preconditions.checkNotNull(paymentDataRequest.zzf, "Allowed payment methods must be set! You can set it through addAllowedPaymentMethod() or addAllowedPaymentMethods() in the PaymentDataRequest Builder.");
                Preconditions.checkNotNull(PaymentDataRequest.this.zzc, "Card requirements must be set!");
                PaymentDataRequest paymentDataRequest2 = PaymentDataRequest.this;
                if (paymentDataRequest2.zzg != null) {
                    Preconditions.checkNotNull(paymentDataRequest2.zzh, "Transaction info must be set if paymentMethodTokenizationParameters is set!");
                }
            }
            return PaymentDataRequest.this;
        }

        @NonNull
        public Builder setCardRequirements(@NonNull CardRequirements cardRequirements) {
            PaymentDataRequest.this.zzc = cardRequirements;
            return this;
        }

        @NonNull
        public Builder setEmailRequired(boolean z11) {
            PaymentDataRequest.this.zza = z11;
            return this;
        }

        @NonNull
        public Builder setPaymentMethodTokenizationParameters(@NonNull PaymentMethodTokenizationParameters paymentMethodTokenizationParameters) {
            PaymentDataRequest.this.zzg = paymentMethodTokenizationParameters;
            return this;
        }

        @NonNull
        public Builder setPhoneNumberRequired(boolean z11) {
            PaymentDataRequest.this.zzb = z11;
            return this;
        }

        @NonNull
        public Builder setShippingAddressRequired(boolean z11) {
            PaymentDataRequest.this.zzd = z11;
            return this;
        }

        @NonNull
        public Builder setShippingAddressRequirements(@NonNull ShippingAddressRequirements shippingAddressRequirements) {
            PaymentDataRequest.this.zze = shippingAddressRequirements;
            return this;
        }

        @NonNull
        public Builder setTransactionInfo(@NonNull TransactionInfo transactionInfo) {
            PaymentDataRequest.this.zzh = transactionInfo;
            return this;
        }

        @NonNull
        public Builder setUiRequired(boolean z11) {
            PaymentDataRequest.this.zzi = z11;
            return this;
        }
    }

    private PaymentDataRequest() {
        this.zzi = true;
    }

    @SafeParcelable.Constructor
    public PaymentDataRequest(@SafeParcelable.Param(m12890id = 1) boolean z11, @SafeParcelable.Param(m12890id = 2) boolean z12, @SafeParcelable.Param(m12890id = 3) CardRequirements cardRequirements, @SafeParcelable.Param(m12890id = 4) boolean z13, @SafeParcelable.Param(m12890id = 5) ShippingAddressRequirements shippingAddressRequirements, @SafeParcelable.Param(m12890id = 6) ArrayList arrayList, @SafeParcelable.Param(m12890id = 7) PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, @SafeParcelable.Param(m12890id = 8) TransactionInfo transactionInfo, @SafeParcelable.Param(m12890id = 9) boolean z14, @SafeParcelable.Param(m12890id = 10) String str, @SafeParcelable.Param(m12890id = 12) byte[] bArr, @Nullable @SafeParcelable.Param(m12890id = 11) Bundle bundle) {
        this.zza = z11;
        this.zzb = z12;
        this.zzc = cardRequirements;
        this.zzd = z13;
        this.zze = shippingAddressRequirements;
        this.zzf = arrayList;
        this.zzg = paymentMethodTokenizationParameters;
        this.zzh = transactionInfo;
        this.zzi = z14;
        this.zzj = str;
        this.zzk = bArr;
        this.zzl = bundle;
    }

    @NonNull
    @Deprecated
    public static Builder newBuilder() {
        return new PaymentDataRequest().new Builder(null);
    }

    @NonNull
    @Deprecated
    public ArrayList<Integer> getAllowedPaymentMethods() {
        return this.zzf;
    }

    @Nullable
    @Deprecated
    public CardRequirements getCardRequirements() {
        return this.zzc;
    }

    @NonNull
    @Deprecated
    public PaymentMethodTokenizationParameters getPaymentMethodTokenizationParameters() {
        return this.zzg;
    }

    @Nullable
    public Bundle getSavedState() {
        return this.zzl;
    }

    @Nullable
    @Deprecated
    public ShippingAddressRequirements getShippingAddressRequirements() {
        return this.zze;
    }

    @NonNull
    @Deprecated
    public TransactionInfo getTransactionInfo() {
        return this.zzh;
    }

    @Deprecated
    public boolean isEmailRequired() {
        return this.zza;
    }

    @Deprecated
    public boolean isPhoneNumberRequired() {
        return this.zzb;
    }

    @Deprecated
    public boolean isShippingAddressRequired() {
        return this.zzd;
    }

    @Deprecated
    public boolean isUiRequired() {
        return this.zzi;
    }

    @NonNull
    public String toJson() {
        return this.zzj;
    }

    @NonNull
    public PaymentDataRequest withSavedState(@Nullable Bundle bundle) {
        this.zzl = bundle;
        return this;
    }

    @NonNull
    public static PaymentDataRequest fromJson(@NonNull String str) {
        Builder builderNewBuilder = newBuilder();
        PaymentDataRequest.this.zzj = (String) Preconditions.checkNotNull(str, "paymentDataRequestJson cannot be null!");
        return builderNewBuilder.build();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i11, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i11, false);
        SafeParcelWriter.writeIntegerList(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzh, i11, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzi);
        SafeParcelWriter.writeString(parcel, 10, this.zzj, false);
        SafeParcelWriter.writeBundle(parcel, 11, this.zzl, false);
        SafeParcelWriter.writeByteArray(parcel, 12, this.zzk, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
