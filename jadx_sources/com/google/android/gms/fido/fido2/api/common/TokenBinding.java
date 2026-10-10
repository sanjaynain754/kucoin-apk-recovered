package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzbk;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "TokenBindingCreator")
@SafeParcelable.Reserved({1})
public class TokenBinding extends AbstractSafeParcelable {

    @NonNull
    @SafeParcelable.Field(getter = "getTokenBindingStatusAsString", m12889id = 2, type = "java.lang.String")
    private final TokenBindingStatus zza;

    @Nullable
    @SafeParcelable.Field(getter = "getTokenBindingId", m12889id = 3)
    private final String zzb;

    @NonNull
    public static final Parcelable.Creator<TokenBinding> CREATOR = new zzaz();

    @NonNull
    public static final TokenBinding SUPPORTED = new TokenBinding(TokenBindingStatus.SUPPORTED.toString(), null);

    @NonNull
    public static final TokenBinding NOT_SUPPORTED = new TokenBinding(TokenBindingStatus.NOT_SUPPORTED.toString(), null);

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public enum TokenBindingStatus implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");


        @NonNull
        public static final Parcelable.Creator<TokenBindingStatus> CREATOR = new zzay();

        @NonNull
        private final String zzb;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return this.zzb;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            parcel.writeString(this.zzb);
        }

        TokenBindingStatus(String str) {
            this.zzb = str;
        }

        @NonNull
        public static TokenBindingStatus fromString(@NonNull String str) throws UnsupportedTokenBindingStatusException {
            for (TokenBindingStatus tokenBindingStatus : values()) {
                if (str.equals(tokenBindingStatus.zzb)) {
                    return tokenBindingStatus;
                }
            }
            throw new UnsupportedTokenBindingStatusException(str);
        }
    }

    public TokenBinding(@NonNull String str) {
        this(TokenBindingStatus.PRESENT.toString(), (String) Preconditions.checkNotNull(str));
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static class UnsupportedTokenBindingStatusException extends Exception {
        public UnsupportedTokenBindingStatusException(@NonNull String str) {
            super(String.format("TokenBindingStatus %s not supported", str));
        }
    }

    @SafeParcelable.Constructor
    public TokenBinding(@NonNull @SafeParcelable.Param(m12890id = 2) String str, @Nullable @SafeParcelable.Param(m12890id = 3) String str2) {
        Preconditions.checkNotNull(str);
        try {
            this.zza = TokenBindingStatus.fromString(str);
            this.zzb = str2;
        } catch (UnsupportedTokenBindingStatusException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof TokenBinding)) {
            return false;
        }
        TokenBinding tokenBinding = (TokenBinding) obj;
        return zzbk.zza(this.zza, tokenBinding.zza) && zzbk.zza(this.zzb, tokenBinding.zzb);
    }

    @Nullable
    public String getTokenBindingId() {
        return this.zzb;
    }

    @NonNull
    public String getTokenBindingStatusAsString() {
        return this.zza.toString();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    @NonNull
    public JSONObject toJsonObject() throws JSONException {
        try {
            return new JSONObject().put("status", this.zza).put("id", this.zzb);
        } catch (JSONException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getTokenBindingStatusAsString(), false);
        SafeParcelWriter.writeString(parcel, 3, getTokenBindingId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
