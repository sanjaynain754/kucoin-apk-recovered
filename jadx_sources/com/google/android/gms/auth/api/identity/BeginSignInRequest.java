package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.credentials.provider.CredentialEntry;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "BeginSignInRequestCreator")
@Deprecated
public final class BeginSignInRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new zbg();

    @SafeParcelable.Field(getter = "getPasswordRequestOptions", m12889id = 1)
    private final PasswordRequestOptions zba;

    @SafeParcelable.Field(getter = "getGoogleIdTokenRequestOptions", m12889id = 2)
    private final GoogleIdTokenRequestOptions zbb;

    @Nullable
    @SafeParcelable.Field(getter = "getSessionId", m12889id = 3)
    private final String zbc;

    @SafeParcelable.Field(getter = "isAutoSelectEnabled", m12889id = 4)
    private final boolean zbd;

    @SafeParcelable.Field(getter = "getTheme", m12889id = 5)
    private final int zbe;

    @SafeParcelable.Field(getter = "getPasskeysRequestOptions", m12889id = 6)
    private final PasskeysRequestOptions zbf;

    @SafeParcelable.Field(getter = "getPasskeyJsonRequestOptions", m12889id = 7)
    private final PasskeyJsonRequestOptions zbg;

    @SafeParcelable.Field(defaultValue = CredentialEntry.FALSE_STRING, getter = "getPreferImmediatelyAvailableCredentials", m12889id = 8)
    private final boolean zbh;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    @Deprecated
    public static final class Builder {
        private PasswordRequestOptions zba;
        private GoogleIdTokenRequestOptions zbb;
        private PasskeysRequestOptions zbc;
        private PasskeyJsonRequestOptions zbd;

        @Nullable
        private String zbe;
        private boolean zbf;
        private int zbg;
        private boolean zbh;

        @NonNull
        public BeginSignInRequest build() {
            return new BeginSignInRequest(this.zba, this.zbb, this.zbe, this.zbf, this.zbg, this.zbc, this.zbd, this.zbh);
        }

        @NonNull
        public Builder setAutoSelectEnabled(boolean z11) {
            this.zbf = z11;
            return this;
        }

        @NonNull
        public Builder setPreferImmediatelyAvailableCredentials(boolean z11) {
            this.zbh = z11;
            return this;
        }

        @NonNull
        public final Builder zba(@NonNull String str) {
            this.zbe = str;
            return this;
        }

        @NonNull
        public final Builder zbb(int i11) {
            this.zbg = i11;
            return this;
        }

        public Builder() {
            PasswordRequestOptions.Builder builder = PasswordRequestOptions.builder();
            builder.setSupported(false);
            this.zba = builder.build();
            GoogleIdTokenRequestOptions.Builder builder2 = GoogleIdTokenRequestOptions.builder();
            builder2.setSupported(false);
            this.zbb = builder2.build();
            PasskeysRequestOptions.Builder builder3 = PasskeysRequestOptions.builder();
            builder3.setSupported(false);
            this.zbc = builder3.build();
            PasskeyJsonRequestOptions.Builder builder4 = PasskeyJsonRequestOptions.builder();
            builder4.setSupported(false);
            this.zbd = builder4.build();
        }

        @NonNull
        public Builder setGoogleIdTokenRequestOptions(@NonNull GoogleIdTokenRequestOptions googleIdTokenRequestOptions) {
            this.zbb = (GoogleIdTokenRequestOptions) Preconditions.checkNotNull(googleIdTokenRequestOptions);
            return this;
        }

        @NonNull
        public Builder setPasskeyJsonSignInRequestOptions(@NonNull PasskeyJsonRequestOptions passkeyJsonRequestOptions) {
            this.zbd = (PasskeyJsonRequestOptions) Preconditions.checkNotNull(passkeyJsonRequestOptions);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setPasskeysSignInRequestOptions(@NonNull PasskeysRequestOptions passkeysRequestOptions) {
            this.zbc = (PasskeysRequestOptions) Preconditions.checkNotNull(passkeysRequestOptions);
            return this;
        }

        @NonNull
        public Builder setPasswordRequestOptions(@NonNull PasswordRequestOptions passwordRequestOptions) {
            this.zba = (PasswordRequestOptions) Preconditions.checkNotNull(passwordRequestOptions);
            return this;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    @SafeParcelable.Class(creator = "GoogleIdTokenRequestOptionsCreator")
    @Deprecated
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new zbm();

        @SafeParcelable.Field(getter = "isSupported", m12889id = 1)
        private final boolean zba;

        @Nullable
        @SafeParcelable.Field(getter = "getServerClientId", m12889id = 2)
        private final String zbb;

        @Nullable
        @SafeParcelable.Field(getter = "getNonce", m12889id = 3)
        private final String zbc;

        @SafeParcelable.Field(getter = "filterByAuthorizedAccounts", m12889id = 4)
        private final boolean zbd;

        @Nullable
        @SafeParcelable.Field(getter = "getLinkedServiceId", m12889id = 5)
        private final String zbe;

        @Nullable
        @SafeParcelable.Field(getter = "getIdTokenDepositionScopes", m12889id = 6)
        private final List zbf;

        @SafeParcelable.Field(getter = "requestVerifiedPhoneNumber", m12889id = 7)
        private final boolean zbg;

        /* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
        public static final class Builder {
            private boolean zba = false;

            @Nullable
            private String zbb = null;

            @Nullable
            private String zbc = null;
            private boolean zbd = true;

            @Nullable
            private String zbe = null;

            @Nullable
            private List zbf = null;
            private boolean zbg = false;

            @NonNull
            public Builder associateLinkedAccounts(@NonNull String str, @Nullable List<String> list) {
                this.zbe = (String) Preconditions.checkNotNull(str, "linkedServiceId must be provided if you want to associate linked accounts.");
                this.zbf = list;
                return this;
            }

            @NonNull
            public GoogleIdTokenRequestOptions build() {
                return new GoogleIdTokenRequestOptions(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf, this.zbg);
            }

            @NonNull
            public Builder setFilterByAuthorizedAccounts(boolean z11) {
                this.zbd = z11;
                return this;
            }

            @NonNull
            public Builder setNonce(@Nullable String str) {
                this.zbc = str;
                return this;
            }

            @NonNull
            @Deprecated
            public Builder setRequestVerifiedPhoneNumber(boolean z11) {
                this.zbg = z11;
                return this;
            }

            @NonNull
            public Builder setSupported(boolean z11) {
                this.zba = z11;
                return this;
            }

            @NonNull
            public Builder setServerClientId(@NonNull String str) {
                this.zbb = Preconditions.checkNotEmpty(str);
                return this;
            }
        }

        @NonNull
        public static Builder builder() {
            return new Builder();
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            return this.zba == googleIdTokenRequestOptions.zba && Objects.equal(this.zbb, googleIdTokenRequestOptions.zbb) && Objects.equal(this.zbc, googleIdTokenRequestOptions.zbc) && this.zbd == googleIdTokenRequestOptions.zbd && Objects.equal(this.zbe, googleIdTokenRequestOptions.zbe) && Objects.equal(this.zbf, googleIdTokenRequestOptions.zbf) && this.zbg == googleIdTokenRequestOptions.zbg;
        }

        public boolean filterByAuthorizedAccounts() {
            return this.zbd;
        }

        @Nullable
        public List<String> getIdTokenDepositionScopes() {
            return this.zbf;
        }

        @Nullable
        public String getLinkedServiceId() {
            return this.zbe;
        }

        @Nullable
        public String getNonce() {
            return this.zbc;
        }

        @Nullable
        public String getServerClientId() {
            return this.zbb;
        }

        public int hashCode() {
            return Objects.hashCode(Boolean.valueOf(this.zba), this.zbb, this.zbc, Boolean.valueOf(this.zbd), this.zbe, this.zbf, Boolean.valueOf(this.zbg));
        }

        public boolean isSupported() {
            return this.zba;
        }

        @Deprecated
        public boolean requestVerifiedPhoneNumber() {
            return this.zbg;
        }

        @SafeParcelable.Constructor
        public GoogleIdTokenRequestOptions(@SafeParcelable.Param(m12890id = 1) boolean z11, @Nullable @SafeParcelable.Param(m12890id = 2) String str, @Nullable @SafeParcelable.Param(m12890id = 3) String str2, @SafeParcelable.Param(m12890id = 4) boolean z12, @Nullable @SafeParcelable.Param(m12890id = 5) String str3, @Nullable @SafeParcelable.Param(m12890id = 6) List list, @SafeParcelable.Param(m12890id = 7) boolean z13) {
            boolean z14 = true;
            if (z12 && z13) {
                z14 = false;
            }
            Preconditions.checkArgument(z14, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.zba = z11;
            if (z11) {
                Preconditions.checkNotNull(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.zbb = str;
            this.zbc = str2;
            this.zbd = z12;
            Parcelable.Creator<BeginSignInRequest> creator = BeginSignInRequest.CREATOR;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.zbf = arrayList;
            this.zbe = str3;
            this.zbg = z13;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, isSupported());
            SafeParcelWriter.writeString(parcel, 2, getServerClientId(), false);
            SafeParcelWriter.writeString(parcel, 3, getNonce(), false);
            SafeParcelWriter.writeBoolean(parcel, 4, filterByAuthorizedAccounts());
            SafeParcelWriter.writeString(parcel, 5, getLinkedServiceId(), false);
            SafeParcelWriter.writeStringList(parcel, 6, getIdTokenDepositionScopes(), false);
            SafeParcelWriter.writeBoolean(parcel, 7, requestVerifiedPhoneNumber());
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    @SafeParcelable.Class(creator = "PasskeyJsonRequestOptionsCreator")
    @Deprecated
    public static final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = new zbn();

        @SafeParcelable.Field(getter = "isSupported", m12889id = 1)
        private final boolean zba;

        @SafeParcelable.Field(getter = "getRequestJson", m12889id = 2)
        private final String zbb;

        /* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
        public static final class Builder {
            private boolean zba = false;
            private String zbb;

            @NonNull
            public PasskeyJsonRequestOptions build() {
                return new PasskeyJsonRequestOptions(this.zba, this.zbb);
            }

            @NonNull
            public Builder setRequestJson(@NonNull String str) {
                this.zbb = str;
                return this;
            }

            @NonNull
            public Builder setSupported(boolean z11) {
                this.zba = z11;
                return this;
            }
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyJsonRequestOptions)) {
                return false;
            }
            PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
            return this.zba == passkeyJsonRequestOptions.zba && Objects.equal(this.zbb, passkeyJsonRequestOptions.zbb);
        }

        @NonNull
        public static Builder builder() {
            return new Builder();
        }

        @NonNull
        public String getRequestJson() {
            return this.zbb;
        }

        public int hashCode() {
            return Objects.hashCode(Boolean.valueOf(this.zba), this.zbb);
        }

        public boolean isSupported() {
            return this.zba;
        }

        @SafeParcelable.Constructor
        public PasskeyJsonRequestOptions(@SafeParcelable.Param(m12890id = 1) boolean z11, @SafeParcelable.Param(m12890id = 2) String str) {
            if (z11) {
                Preconditions.checkNotNull(str);
            }
            this.zba = z11;
            this.zbb = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, isSupported());
            SafeParcelWriter.writeString(parcel, 2, getRequestJson(), false);
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    @SafeParcelable.Class(creator = "PasskeysRequestOptionsCreator")
    @Deprecated
    public static final class PasskeysRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new zbo();

        @SafeParcelable.Field(getter = "isSupported", m12889id = 1)
        private final boolean zba;

        @SafeParcelable.Field(getter = "getChallenge", m12889id = 2)
        private final byte[] zbb;

        @SafeParcelable.Field(getter = "getRpId", m12889id = 3)
        private final String zbc;

        /* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
        public static final class Builder {
            private boolean zba = false;
            private byte[] zbb;
            private String zbc;

            @NonNull
            public PasskeysRequestOptions build() {
                return new PasskeysRequestOptions(this.zba, this.zbb, this.zbc);
            }

            @NonNull
            public Builder setChallenge(@NonNull byte[] bArr) {
                this.zbb = bArr;
                return this;
            }

            @NonNull
            public Builder setRpId(@NonNull String str) {
                this.zbc = str;
                return this;
            }

            @NonNull
            public Builder setSupported(boolean z11) {
                this.zba = z11;
                return this;
            }
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeysRequestOptions)) {
                return false;
            }
            PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
            return this.zba == passkeysRequestOptions.zba && Arrays.equals(this.zbb, passkeysRequestOptions.zbb) && java.util.Objects.equals(this.zbc, passkeysRequestOptions.zbc);
        }

        @NonNull
        public static Builder builder() {
            return new Builder();
        }

        @NonNull
        public byte[] getChallenge() {
            return this.zbb;
        }

        @NonNull
        public String getRpId() {
            return this.zbc;
        }

        public int hashCode() {
            return (java.util.Objects.hash(Boolean.valueOf(this.zba), this.zbc) * 31) + Arrays.hashCode(this.zbb);
        }

        public boolean isSupported() {
            return this.zba;
        }

        @SafeParcelable.Constructor
        public PasskeysRequestOptions(@SafeParcelable.Param(m12890id = 1) boolean z11, @SafeParcelable.Param(m12890id = 2) byte[] bArr, @SafeParcelable.Param(m12890id = 3) String str) {
            if (z11) {
                Preconditions.checkNotNull(bArr);
                Preconditions.checkNotNull(str);
            }
            this.zba = z11;
            this.zbb = bArr;
            this.zbc = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, isSupported());
            SafeParcelWriter.writeByteArray(parcel, 2, getChallenge(), false);
            SafeParcelWriter.writeString(parcel, 3, getRpId(), false);
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    @SafeParcelable.Class(creator = "PasswordRequestOptionsCreator")
    @Deprecated
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new zbp();

        @SafeParcelable.Field(getter = "isSupported", m12889id = 1)
        private final boolean zba;

        /* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
        public static final class Builder {
            private boolean zba = false;

            @NonNull
            public PasswordRequestOptions build() {
                return new PasswordRequestOptions(this.zba);
            }

            @NonNull
            public Builder setSupported(boolean z11) {
                this.zba = z11;
                return this;
            }
        }

        @NonNull
        public static Builder builder() {
            return new Builder();
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.zba == ((PasswordRequestOptions) obj).zba;
        }

        public int hashCode() {
            return Objects.hashCode(Boolean.valueOf(this.zba));
        }

        public boolean isSupported() {
            return this.zba;
        }

        @SafeParcelable.Constructor
        public PasswordRequestOptions(@SafeParcelable.Param(m12890id = 1) boolean z11) {
            this.zba = z11;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, isSupported());
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        return Objects.equal(this.zba, beginSignInRequest.zba) && Objects.equal(this.zbb, beginSignInRequest.zbb) && Objects.equal(this.zbf, beginSignInRequest.zbf) && Objects.equal(this.zbg, beginSignInRequest.zbg) && Objects.equal(this.zbc, beginSignInRequest.zbc) && this.zbd == beginSignInRequest.zbd && this.zbe == beginSignInRequest.zbe && this.zbh == beginSignInRequest.zbh;
    }

    @NonNull
    public GoogleIdTokenRequestOptions getGoogleIdTokenRequestOptions() {
        return this.zbb;
    }

    @NonNull
    public PasskeyJsonRequestOptions getPasskeyJsonRequestOptions() {
        return this.zbg;
    }

    @NonNull
    public PasskeysRequestOptions getPasskeysRequestOptions() {
        return this.zbf;
    }

    @NonNull
    public PasswordRequestOptions getPasswordRequestOptions() {
        return this.zba;
    }

    public boolean getPreferImmediatelyAvailableCredentials() {
        return this.zbh;
    }

    public int hashCode() {
        return Objects.hashCode(this.zba, this.zbb, this.zbf, this.zbg, this.zbc, Boolean.valueOf(this.zbd), Integer.valueOf(this.zbe), Boolean.valueOf(this.zbh));
    }

    public boolean isAutoSelectEnabled() {
        return this.zbd;
    }

    @SafeParcelable.Constructor
    public BeginSignInRequest(@SafeParcelable.Param(m12890id = 1) PasswordRequestOptions passwordRequestOptions, @SafeParcelable.Param(m12890id = 2) GoogleIdTokenRequestOptions googleIdTokenRequestOptions, @Nullable @SafeParcelable.Param(m12890id = 3) String str, @SafeParcelable.Param(m12890id = 4) boolean z11, @SafeParcelable.Param(m12890id = 5) int i11, @Nullable @SafeParcelable.Param(m12890id = 6) PasskeysRequestOptions passkeysRequestOptions, @Nullable @SafeParcelable.Param(m12890id = 7) PasskeyJsonRequestOptions passkeyJsonRequestOptions, @SafeParcelable.Param(m12890id = 8) boolean z12) {
        this.zba = (PasswordRequestOptions) Preconditions.checkNotNull(passwordRequestOptions);
        this.zbb = (GoogleIdTokenRequestOptions) Preconditions.checkNotNull(googleIdTokenRequestOptions);
        this.zbc = str;
        this.zbd = z11;
        this.zbe = i11;
        if (passkeysRequestOptions == null) {
            PasskeysRequestOptions.Builder builder = PasskeysRequestOptions.builder();
            builder.setSupported(false);
            passkeysRequestOptions = builder.build();
        }
        this.zbf = passkeysRequestOptions;
        if (passkeyJsonRequestOptions == null) {
            PasskeyJsonRequestOptions.Builder builder2 = PasskeyJsonRequestOptions.builder();
            builder2.setSupported(false);
            passkeyJsonRequestOptions = builder2.build();
        }
        this.zbg = passkeyJsonRequestOptions;
        this.zbh = z12;
    }

    @NonNull
    public static Builder zba(@NonNull BeginSignInRequest beginSignInRequest) {
        Preconditions.checkNotNull(beginSignInRequest);
        Builder builder = builder();
        builder.setGoogleIdTokenRequestOptions(beginSignInRequest.getGoogleIdTokenRequestOptions());
        builder.setPasswordRequestOptions(beginSignInRequest.getPasswordRequestOptions());
        builder.setPasskeysSignInRequestOptions(beginSignInRequest.getPasskeysRequestOptions());
        builder.setPasskeyJsonSignInRequestOptions(beginSignInRequest.getPasskeyJsonRequestOptions());
        builder.setAutoSelectEnabled(beginSignInRequest.zbd);
        builder.zbb(beginSignInRequest.zbe);
        builder.setPreferImmediatelyAvailableCredentials(beginSignInRequest.zbh);
        String str = beginSignInRequest.zbc;
        if (str != null) {
            builder.zba(str);
        }
        return builder;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getPasswordRequestOptions(), i11, false);
        SafeParcelWriter.writeParcelable(parcel, 2, getGoogleIdTokenRequestOptions(), i11, false);
        SafeParcelWriter.writeString(parcel, 3, this.zbc, false);
        SafeParcelWriter.writeBoolean(parcel, 4, isAutoSelectEnabled());
        SafeParcelWriter.writeInt(parcel, 5, this.zbe);
        SafeParcelWriter.writeParcelable(parcel, 6, getPasskeysRequestOptions(), i11, false);
        SafeParcelWriter.writeParcelable(parcel, 7, getPasskeyJsonRequestOptions(), i11, false);
        SafeParcelWriter.writeBoolean(parcel, 8, getPreferImmediatelyAvailableCredentials());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
