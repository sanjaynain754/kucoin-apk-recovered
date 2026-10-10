package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.ArrayUtils;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "LabelValueRowCreator")
@SafeParcelable.Reserved({1})
public final class LabelValueRow extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LabelValueRow> CREATOR = new zzf();

    @SafeParcelable.Field(m12889id = 2)
    @Deprecated
    String zza;

    @SafeParcelable.Field(m12889id = 3)
    @Deprecated
    String zzb;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", m12889id = 4)
    final ArrayList zzc;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
    public final class Builder {
        public /* synthetic */ Builder(zze zzeVar) {
        }

        @NonNull
        public Builder addColumn(@NonNull LabelValue labelValue) {
            LabelValueRow.this.zzc.add(labelValue);
            return this;
        }

        @NonNull
        public Builder addColumns(@NonNull Collection<LabelValue> collection) {
            LabelValueRow.this.zzc.addAll(collection);
            return this;
        }

        @NonNull
        public LabelValueRow build() {
            return LabelValueRow.this;
        }

        @NonNull
        @Deprecated
        public Builder setHexBackgroundColor(@NonNull String str) {
            LabelValueRow.this.zzb = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setHexFontColor(@NonNull String str) {
            LabelValueRow.this.zza = str;
            return this;
        }
    }

    public LabelValueRow() {
        this.zzc = ArrayUtils.newArrayList();
    }

    @NonNull
    public static Builder newBuilder() {
        return new LabelValueRow().new Builder(null);
    }

    @NonNull
    public ArrayList<LabelValue> getColumns() {
        return this.zzc;
    }

    @NonNull
    @Deprecated
    public String getHexBackgroundColor() {
        return this.zzb;
    }

    @NonNull
    @Deprecated
    public String getHexFontColor() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    public LabelValueRow(@SafeParcelable.Param(m12890id = 2) String str, @SafeParcelable.Param(m12890id = 3) String str2, @SafeParcelable.Param(m12890id = 4) ArrayList arrayList) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeTypedList(parcel, 4, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
