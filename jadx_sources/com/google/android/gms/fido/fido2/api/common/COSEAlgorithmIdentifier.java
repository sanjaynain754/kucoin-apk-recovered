package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* JADX INFO: loaded from: classes45.dex */
public class COSEAlgorithmIdentifier implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new zzp();

    @NonNull
    private final Algorithm zza;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static class UnsupportedAlgorithmIdentifierException extends Exception {
        public UnsupportedAlgorithmIdentifierException(int i11) {
            super("Algorithm with COSE value " + i11 + " not supported");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public static COSEAlgorithmIdentifier fromCoseValue(int i11) throws UnsupportedAlgorithmIdentifierException {
        Algorithm algorithm;
        if (i11 != RSAAlgorithm.LEGACY_RS1.getAlgoValue()) {
            for (RSAAlgorithm rSAAlgorithm : RSAAlgorithm.values()) {
                if (rSAAlgorithm.getAlgoValue() == i11) {
                    algorithm = rSAAlgorithm;
                }
            }
            for (EC2Algorithm eC2Algorithm : EC2Algorithm.values()) {
                if (eC2Algorithm.getAlgoValue() == i11) {
                    algorithm = eC2Algorithm;
                }
            }
            throw new UnsupportedAlgorithmIdentifierException(i11);
        }
        algorithm = RSAAlgorithm.RS1;
        return new COSEAlgorithmIdentifier(algorithm);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof COSEAlgorithmIdentifier) && this.zza.getAlgoValue() == ((COSEAlgorithmIdentifier) obj).zza.getAlgoValue();
    }

    public int hashCode() {
        return Objects.hashCode(this.zza);
    }

    public int toCoseValue() {
        return this.zza.getAlgoValue();
    }

    @NonNull
    public final String toString() {
        return "COSEAlgorithmIdentifier{algorithm=" + String.valueOf(this.zza) + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        parcel.writeInt(this.zza.getAlgoValue());
    }

    public COSEAlgorithmIdentifier(@NonNull Algorithm algorithm) {
        this.zza = (Algorithm) Preconditions.checkNotNull(algorithm);
    }
}
