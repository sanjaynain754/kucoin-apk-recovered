package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha08 */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!BK\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0017\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\u000eJ\b\u0010\u0018\u001a\u00020\u0005H\u0007J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, m90084d2 = {"Lcom/google/android/gms/identitycredentials/CreateCredentialRequest;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "type", "", "credentialData", "Landroid/os/Bundle;", "candidateQueryData", "origin", "requestJson", "resultReceiver", "Landroid/os/ResultReceiver;", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Landroid/os/ResultReceiver;)V", "bundle", "(Landroid/os/Bundle;)V", "getType", "()Ljava/lang/String;", "getCredentialData", "()Landroid/os/Bundle;", "getCandidateQueryData", "getOrigin", "getRequestJson", "getResultReceiver", "()Landroid/os/ResultReceiver;", "toBundle", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "isConditionalRequest", "", "Companion", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SafeParcelable.Class(creator = "CreateCredentialRequestCreator")
public final class CreateCredentialRequest extends AbstractSafeParcelable {

    @SafeParcelable.Field(getter = "getCandidateQueryData", m12889id = 3)
    @NotNull
    private final Bundle candidateQueryData;

    @SafeParcelable.Field(getter = "getCredentialData", m12889id = 2)
    @NotNull
    private final Bundle credentialData;

    @SafeParcelable.Field(getter = "getOrigin", m12889id = 4)
    @Nullable
    private final String origin;

    @SafeParcelable.Field(getter = "getRequestJson", m12889id = 5)
    @Nullable
    private final String requestJson;

    @SafeParcelable.Field(getter = "getResultReceiver", m12889id = 6)
    @Nullable
    private final ResultReceiver resultReceiver;

    @SafeParcelable.Field(getter = "getType", m12889id = 1)
    @NotNull
    private final String type;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<CreateCredentialRequest> CREATOR = new CreateCredentialRequestCreator();

    @NotNull
    public final Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    @NotNull
    public final Bundle getCredentialData() {
        return this.credentialData;
    }

    @androidx.annotation.Nullable
    public final String getOrigin() {
        return this.origin;
    }

    @androidx.annotation.Nullable
    public final String getRequestJson() {
        return this.requestJson;
    }

    @androidx.annotation.Nullable
    public final ResultReceiver getResultReceiver() {
        return this.resultReceiver;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        CreateCredentialRequestCreator.writeToParcel(this, dest, flags);
    }

    @SafeParcelable.Constructor
    public CreateCredentialRequest(@NonNull @SafeParcelable.Param(m12890id = 1) String type, @NonNull @SafeParcelable.Param(m12890id = 2) Bundle credentialData, @NonNull @SafeParcelable.Param(m12890id = 3) Bundle candidateQueryData, @SafeParcelable.Param(m12890id = 4) @Nullable String str, @SafeParcelable.Param(m12890id = 5) @Nullable String str2, @SafeParcelable.Param(m12890id = 6) @Nullable ResultReceiver resultReceiver) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(credentialData, "credentialData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        this.type = type;
        this.credentialData = credentialData;
        this.candidateQueryData = candidateQueryData;
        this.origin = str;
        this.requestJson = str2;
        this.resultReceiver = resultReceiver;
    }
}
