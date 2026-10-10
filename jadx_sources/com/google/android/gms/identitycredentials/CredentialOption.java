package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 BE\b\u0007\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0003\u0010\b\u001a\u00020\u0003\u0012\b\b\u0003\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\rJ\b\u0010\u0019\u001a\u00020\u0005H\u0007J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000f¨\u0006!"}, m90084d2 = {"Lcom/google/android/gms/identitycredentials/CredentialOption;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "type", "", "credentialRetrievalData", "Landroid/os/Bundle;", "candidateQueryData", "requestMatcher", "requestType", "protocolType", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "bundle", "(Landroid/os/Bundle;)V", "getType", "()Ljava/lang/String;", "getCredentialRetrievalData", "()Landroid/os/Bundle;", "getCandidateQueryData", "getRequestMatcher", "getRequestType$annotations", "()V", "getRequestType", "getProtocolType$annotations", "getProtocolType", "toBundle", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "Companion", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SafeParcelable.Class(creator = "CredentialOptionCreator")
public final class CredentialOption extends AbstractSafeParcelable {

    @SafeParcelable.Field(getter = "getCandidateQueryData", m12889id = 3)
    @NotNull
    private final Bundle candidateQueryData;

    @SafeParcelable.Field(getter = "getCredentialRetrievalData", m12889id = 2)
    @NotNull
    private final Bundle credentialRetrievalData;

    @SafeParcelable.Field(defaultValue = "", getter = "getProtocolType", m12889id = 6)
    @NotNull
    private final String protocolType;

    @SafeParcelable.Field(getter = "getRequestMatcher", m12889id = 4)
    @NotNull
    private final String requestMatcher;

    @SafeParcelable.Field(defaultValue = "", getter = "getRequestType", m12889id = 5)
    @NotNull
    private final String requestType;

    @SafeParcelable.Field(defaultValue = "", getter = "getType", m12889id = 1)
    @NotNull
    private final String type;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<CredentialOption> CREATOR = new CredentialOptionCreator();

    @NotNull
    public final Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    @NotNull
    public final Bundle getCredentialRetrievalData() {
        return this.credentialRetrievalData;
    }

    @NotNull
    public final String getProtocolType() {
        return this.protocolType;
    }

    @NotNull
    public final String getRequestMatcher() {
        return this.requestMatcher;
    }

    @NotNull
    public final String getRequestType() {
        return this.requestType;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        CredentialOptionCreator.writeToParcel(this, dest, flags);
    }

    @SafeParcelable.Constructor
    public CredentialOption(@NonNull @SafeParcelable.Param(m12890id = 1) String type, @NonNull @SafeParcelable.Param(m12890id = 2) Bundle credentialRetrievalData, @NonNull @SafeParcelable.Param(m12890id = 3) Bundle candidateQueryData, @NonNull @SafeParcelable.Param(m12890id = 4) String requestMatcher, @NonNull @SafeParcelable.Param(m12890id = 5) String requestType, @NonNull @SafeParcelable.Param(m12890id = 6) String protocolType) {
        boolean z11;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(credentialRetrievalData, "credentialRetrievalData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        Intrinsics.checkNotNullParameter(requestMatcher, "requestMatcher");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(protocolType, "protocolType");
        this.type = type;
        this.credentialRetrievalData = credentialRetrievalData;
        this.candidateQueryData = candidateQueryData;
        this.requestMatcher = requestMatcher;
        this.requestType = requestType;
        this.protocolType = protocolType;
        if (!StringsKt.isBlank(requestType) && !StringsKt.isBlank(protocolType)) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z12 = !StringsKt.isBlank(type) && requestType.length() == 0 && protocolType.length() == 0;
        if (!z11 && !z12) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(type).length() + 31 + String.valueOf(requestType).length() + 19 + String.valueOf(protocolType).length() + 69);
            sb2.append("Either type: ");
            sb2.append(type);
            sb2.append(", or requestType: ");
            sb2.append(requestType);
            sb2.append(" and protocolType: ");
            sb2.append(protocolType);
            sb2.append(" must be specified, but at least one contains an invalid blank value.");
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
