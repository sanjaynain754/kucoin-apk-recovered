package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "AuthorizationRequestCreator")
public class AuthorizationRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new zbe();

    @SafeParcelable.Field(getter = "getRequestedScopes", m12889id = 1)
    private final List zba;

    @Nullable
    @SafeParcelable.Field(getter = "getServerClientId", m12889id = 2)
    private final String zbb;

    @SafeParcelable.Field(getter = "isOfflineAccessRequested", m12889id = 3)
    private final boolean zbc;

    @SafeParcelable.Field(getter = "isIdTokenRequested", m12889id = 4)
    private final boolean zbd;

    @Nullable
    @SafeParcelable.Field(getter = "getAccount", m12889id = 5)
    private final Account zbe;

    @Nullable
    @SafeParcelable.Field(getter = "getHostedDomain", m12889id = 6)
    private final String zbf;

    @Nullable
    @SafeParcelable.Field(getter = "getSessionId", m12889id = 7)
    private final String zbg;

    @SafeParcelable.Field(getter = "isForceCodeForRefreshToken", m12889id = 8)
    private final boolean zbh;

    @Nullable
    @SafeParcelable.Field(getter = "getResourceParameters", m12889id = 9)
    private final Bundle zbi;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    public static final class Builder {
        private List zba;

        @Nullable
        private String zbb;
        private boolean zbc;
        private boolean zbd;

        @Nullable
        private Account zbe;

        @Nullable
        private String zbf;

        @Nullable
        private String zbg;
        private boolean zbh;

        @Nullable
        private Bundle zbi;

        @NonNull
        public Builder requestOfflineAccess(@NonNull String str) {
            requestOfflineAccess(str, false);
            return this;
        }

        @NonNull
        public Builder setRequestedScopes(@NonNull List<Scope> list) {
            boolean z11 = false;
            if (list != null && !list.isEmpty()) {
                z11 = true;
            }
            Preconditions.checkArgument(z11, "requestedScopes cannot be null or empty");
            this.zba = list;
            return this;
        }

        @NonNull
        public AuthorizationRequest build() {
            return new AuthorizationRequest(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf, this.zbg, this.zbh, this.zbi);
        }

        @NonNull
        public Builder requestOfflineAccess(@NonNull String str, boolean z11) {
            zbd(str);
            this.zbb = str;
            this.zbc = true;
            this.zbh = z11;
            return this;
        }

        public final Builder zba(@NonNull zbd zbdVar, @NonNull String str) {
            Preconditions.checkNotNull(zbdVar, "Resource parameter cannot be null");
            Preconditions.checkNotNull(str, "Resource parameter value cannot be null");
            if (this.zbi == null) {
                this.zbi = new Bundle();
            }
            this.zbi.putString(zbdVar.zbc, str);
            return this;
        }

        @NonNull
        public final Builder zbc(@NonNull String str) {
            this.zbg = str;
            return this;
        }

        private final String zbd(String str) {
            Preconditions.checkNotNull(str);
            String str2 = this.zbb;
            boolean z11 = true;
            if (str2 != null && !str2.equals(str)) {
                z11 = false;
            }
            Preconditions.checkArgument(z11, "two different server client ids provided");
            return str;
        }

        @NonNull
        public Builder filterByHostedDomain(@NonNull String str) {
            this.zbf = Preconditions.checkNotEmpty(str);
            return this;
        }

        @NonNull
        public Builder setAccount(@NonNull Account account) {
            this.zbe = (Account) Preconditions.checkNotNull(account);
            return this;
        }

        @NonNull
        @ShowFirstParty
        public final Builder zbb(@NonNull String str) {
            zbd(str);
            this.zbb = str;
            this.zbd = true;
            return this;
        }
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        if (this.zba.size() == authorizationRequest.zba.size() && this.zba.containsAll(authorizationRequest.zba)) {
            Bundle bundle = authorizationRequest.zbi;
            Bundle bundle2 = this.zbi;
            if (bundle2 == null) {
                if (bundle == null) {
                    bundle = null;
                }
                return false;
            }
            if (bundle2 == null || bundle != null) {
                if (bundle2 != null) {
                    if (bundle2.size() != bundle.size()) {
                        return false;
                    }
                    for (String str : this.zbi.keySet()) {
                        if (!Objects.equal(this.zbi.getString(str), bundle.getString(str))) {
                            return false;
                        }
                    }
                }
                if (this.zbc == authorizationRequest.zbc && this.zbh == authorizationRequest.zbh && this.zbd == authorizationRequest.zbd && Objects.equal(this.zbb, authorizationRequest.zbb) && Objects.equal(this.zbe, authorizationRequest.zbe) && Objects.equal(this.zbf, authorizationRequest.zbf) && Objects.equal(this.zbg, authorizationRequest.zbg)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Nullable
    public Account getAccount() {
        return this.zbe;
    }

    @Nullable
    public String getHostedDomain() {
        return this.zbf;
    }

    @NonNull
    public List<Scope> getRequestedScopes() {
        return this.zba;
    }

    @Nullable
    public String getServerClientId() {
        return this.zbb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zba, this.zbb, Boolean.valueOf(this.zbc), Boolean.valueOf(this.zbh), Boolean.valueOf(this.zbd), this.zbe, this.zbf, this.zbg, this.zbi);
    }

    public boolean isForceCodeForRefreshToken() {
        return this.zbh;
    }

    public boolean isOfflineAccessRequested() {
        return this.zbc;
    }

    @SafeParcelable.Constructor
    public AuthorizationRequest(@SafeParcelable.Param(m12890id = 1) List list, @Nullable @SafeParcelable.Param(m12890id = 2) String str, @SafeParcelable.Param(m12890id = 3) boolean z11, @SafeParcelable.Param(m12890id = 4) boolean z12, @Nullable @SafeParcelable.Param(m12890id = 5) Account account, @Nullable @SafeParcelable.Param(m12890id = 6) String str2, @Nullable @SafeParcelable.Param(m12890id = 7) String str3, @SafeParcelable.Param(m12890id = 8) boolean z13, @Nullable @SafeParcelable.Param(m12890id = 9) Bundle bundle) {
        boolean z14 = false;
        if (list != null && !list.isEmpty()) {
            z14 = true;
        }
        Preconditions.checkArgument(z14, "requestedScopes cannot be null or empty");
        this.zba = list;
        this.zbb = str;
        this.zbc = z11;
        this.zbd = z12;
        this.zbe = account;
        this.zbf = str2;
        this.zbg = str3;
        this.zbh = z13;
        this.zbi = bundle;
    }

    @NonNull
    public static Builder zba(@NonNull AuthorizationRequest authorizationRequest) {
        zbd zbdVar;
        Preconditions.checkNotNull(authorizationRequest);
        Builder builder = builder();
        builder.setRequestedScopes(authorizationRequest.getRequestedScopes());
        Bundle bundle = authorizationRequest.zbi;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                zbd[] zbdVarArrValues = zbd.values();
                int length = zbdVarArrValues.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        zbdVar = zbdVarArrValues[i11];
                        if (zbdVar.zbc.equals(str)) {
                            break;
                        }
                        i11++;
                    } else {
                        zbdVar = null;
                        break;
                    }
                }
                if (string != null && zbdVar != null) {
                    builder.zba(zbdVar, string);
                }
            }
        }
        boolean zIsForceCodeForRefreshToken = authorizationRequest.isForceCodeForRefreshToken();
        String str2 = authorizationRequest.zbg;
        String hostedDomain = authorizationRequest.getHostedDomain();
        Account account = authorizationRequest.getAccount();
        String serverClientId = authorizationRequest.getServerClientId();
        if (str2 != null) {
            builder.zbc(str2);
        }
        if (hostedDomain != null) {
            builder.filterByHostedDomain(hostedDomain);
        }
        if (account != null) {
            builder.setAccount(account);
        }
        if (authorizationRequest.zbd && serverClientId != null) {
            builder.zbb(serverClientId);
        }
        if (authorizationRequest.isOfflineAccessRequested() && serverClientId != null) {
            builder.requestOfflineAccess(serverClientId, zIsForceCodeForRefreshToken);
        }
        return builder;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getRequestedScopes(), false);
        SafeParcelWriter.writeString(parcel, 2, getServerClientId(), false);
        SafeParcelWriter.writeBoolean(parcel, 3, isOfflineAccessRequested());
        SafeParcelWriter.writeBoolean(parcel, 4, this.zbd);
        SafeParcelWriter.writeParcelable(parcel, 5, getAccount(), i11, false);
        SafeParcelWriter.writeString(parcel, 6, getHostedDomain(), false);
        SafeParcelWriter.writeString(parcel, 7, this.zbg, false);
        SafeParcelWriter.writeBoolean(parcel, 8, isForceCodeForRefreshToken());
        SafeParcelWriter.writeBundle(parcel, 9, this.zbi, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
