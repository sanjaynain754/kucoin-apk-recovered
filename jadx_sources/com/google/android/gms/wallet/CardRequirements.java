package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.credentials.provider.CredentialEntry;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "CardRequirementsCreator")
public final class CardRequirements extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CardRequirements> CREATOR = new zzg();

    @SafeParcelable.Field(m12889id = 1)
    ArrayList zza;

    @SafeParcelable.Field(defaultValue = CredentialEntry.TRUE_STRING, m12889id = 2)
    boolean zzb;

    @SafeParcelable.Field(m12889id = 3)
    boolean zzc;

    @SafeParcelable.Field(m12889id = 4)
    int zzd;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
    public final class Builder {
        @NonNull
        public Builder addAllowedCardNetworks(@NonNull Collection<Integer> collection) {
            boolean z11 = false;
            if (collection != null && !collection.isEmpty()) {
                z11 = true;
            }
            Preconditions.checkArgument(z11, "allowedCardNetworks can't be null or empty! You must provide a valid value from WalletConstants.CardNetwork.");
            CardRequirements cardRequirements = CardRequirements.this;
            if (cardRequirements.zza == null) {
                cardRequirements.zza = new ArrayList();
            }
            CardRequirements.this.zza.addAll(collection);
            return this;
        }

        public /* synthetic */ Builder(zzf zzfVar) {
        }

        @NonNull
        public Builder addAllowedCardNetwork(int i11) {
            CardRequirements cardRequirements = CardRequirements.this;
            if (cardRequirements.zza == null) {
                cardRequirements.zza = new ArrayList();
            }
            CardRequirements.this.zza.add(Integer.valueOf(i11));
            return this;
        }

        @NonNull
        public CardRequirements build() {
            Preconditions.checkNotNull(CardRequirements.this.zza, "Allowed card networks must be non-empty! You can set it through addAllowedCardNetwork() or addAllowedCardNetworks() in the CardRequirements Builder.");
            return CardRequirements.this;
        }

        @NonNull
        public Builder setAllowPrepaidCards(boolean z11) {
            CardRequirements.this.zzb = z11;
            return this;
        }

        @NonNull
        public Builder setBillingAddressFormat(int i11) {
            CardRequirements.this.zzd = i11;
            return this;
        }

        @NonNull
        public Builder setBillingAddressRequired(boolean z11) {
            CardRequirements.this.zzc = z11;
            return this;
        }
    }

    private CardRequirements() {
        this.zzb = true;
    }

    @SafeParcelable.Constructor
    public CardRequirements(@SafeParcelable.Param(m12890id = 1) ArrayList arrayList, @SafeParcelable.Param(m12890id = 2) boolean z11, @SafeParcelable.Param(m12890id = 3) boolean z12, @SafeParcelable.Param(m12890id = 4) int i11) {
        this.zza = arrayList;
        this.zzb = z11;
        this.zzc = z12;
        this.zzd = i11;
    }

    @NonNull
    public static Builder newBuilder() {
        return new CardRequirements().new Builder(null);
    }

    public boolean allowPrepaidCards() {
        return this.zzb;
    }

    @Nullable
    public ArrayList<Integer> getAllowedCardNetworks() {
        return this.zza;
    }

    public int getBillingAddressFormat() {
        return this.zzd;
    }

    public boolean isBillingAddressRequired() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerList(parcel, 1, this.zza, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
