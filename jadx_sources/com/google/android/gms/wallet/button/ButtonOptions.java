package com.google.android.gms.wallet.button;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "ButtonOptionsCreator")
public final class ButtonOptions extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<ButtonOptions> CREATOR = new zzb();

    @SafeParcelable.Field(defaultValueUnchecked = "0", getter = "getButtonType", m12889id = 1)
    int zza;

    @SafeParcelable.Field(defaultValueUnchecked = "0", getter = "getButtonTheme", m12889id = 2)
    int zzb;

    @SafeParcelable.Field(defaultValueUnchecked = "0", getter = "getCornerRadius", m12889id = 3)
    int zzc;

    @SafeParcelable.Field(getter = "getAllowedPaymentMethods", m12889id = 4)
    String zzd;
    boolean zze = false;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
    public final class Builder {
        public /* synthetic */ Builder(zza zzaVar) {
        }

        @NonNull
        public ButtonOptions build() {
            return ButtonOptions.this;
        }

        @NonNull
        public Builder setAllowedPaymentMethods(@NonNull String str) {
            ButtonOptions.this.zzd = str;
            return this;
        }

        @NonNull
        public Builder setButtonTheme(int i11) {
            ButtonOptions.this.zzb = i11;
            return this;
        }

        @NonNull
        public Builder setButtonType(int i11) {
            ButtonOptions.this.zza = i11;
            return this;
        }

        @NonNull
        public Builder setCornerRadius(int i11) {
            ButtonOptions buttonOptions = ButtonOptions.this;
            buttonOptions.zzc = i11;
            buttonOptions.zze = true;
            return this;
        }
    }

    private ButtonOptions() {
    }

    @SafeParcelable.Constructor
    public ButtonOptions(@SafeParcelable.Param(m12890id = 1) int i11, @SafeParcelable.Param(m12890id = 2) int i12, @SafeParcelable.Param(m12890id = 3) int i13, @SafeParcelable.Param(m12890id = 4) String str) {
        this.zza = ((Integer) Preconditions.checkNotNull(Integer.valueOf(i11))).intValue();
        this.zzb = ((Integer) Preconditions.checkNotNull(Integer.valueOf(i12))).intValue();
        this.zzc = ((Integer) Preconditions.checkNotNull(Integer.valueOf(i13))).intValue();
        this.zzd = (String) Preconditions.checkNotNull(str);
    }

    @NonNull
    public static Builder newBuilder() {
        return new ButtonOptions().new Builder(null);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ButtonOptions) {
            ButtonOptions buttonOptions = (ButtonOptions) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(buttonOptions.zza)) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(buttonOptions.zzb)) && Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(buttonOptions.zzc)) && Objects.equal(this.zzd, buttonOptions.zzd)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public String getAllowedPaymentMethods() {
        return this.zzd;
    }

    public int getButtonTheme() {
        return this.zzb;
    }

    public int getButtonType() {
        return this.zza;
    }

    public int getCornerRadius() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getButtonType());
        SafeParcelWriter.writeInt(parcel, 2, getButtonTheme());
        SafeParcelWriter.writeInt(parcel, 3, getCornerRadius());
        SafeParcelWriter.writeString(parcel, 4, getAllowedPaymentMethods(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
