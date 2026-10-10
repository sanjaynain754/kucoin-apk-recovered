package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "UvmEntryCreator")
public class UvmEntry extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<UvmEntry> CREATOR = new zzbe();

    @SafeParcelable.Field(getter = "getUserVerificationMethod", m12889id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getKeyProtectionType", m12889id = 2)
    private final short zzb;

    @SafeParcelable.Field(getter = "getMatcherProtectionType", m12889id = 3)
    private final short zzc;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static final class Builder {
        private int zza;
        private short zzb;
        private short zzc;

        @NonNull
        public UvmEntry build() {
            return new UvmEntry(this.zza, this.zzb, this.zzc);
        }

        @NonNull
        public Builder setKeyProtectionType(short s11) {
            this.zzb = s11;
            return this;
        }

        @NonNull
        public Builder setMatcherProtectionType(short s11) {
            this.zzc = s11;
            return this;
        }

        @NonNull
        public Builder setUserVerificationMethod(int i11) {
            this.zza = i11;
            return this;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof UvmEntry)) {
            return false;
        }
        UvmEntry uvmEntry = (UvmEntry) obj;
        return this.zza == uvmEntry.zza && this.zzb == uvmEntry.zzb && this.zzc == uvmEntry.zzc;
    }

    public short getKeyProtectionType() {
        return this.zzb;
    }

    public short getMatcherProtectionType() {
        return this.zzc;
    }

    public int getUserVerificationMethod() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Short.valueOf(this.zzb), Short.valueOf(this.zzc));
    }

    @SafeParcelable.Constructor
    public UvmEntry(@SafeParcelable.Param(m12890id = 1) int i11, @SafeParcelable.Param(m12890id = 2) short s11, @SafeParcelable.Param(m12890id = 3) short s12) {
        this.zza = i11;
        this.zzb = s11;
        this.zzc = s12;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getUserVerificationMethod());
        SafeParcelWriter.writeShort(parcel, 2, getKeyProtectionType());
        SafeParcelWriter.writeShort(parcel, 3, getMatcherProtectionType());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
