package androidx.credentials.webauthn;

import androidx.annotation.RestrictTo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FidoDataTypes.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, m90084d2 = {"Landroidx/credentials/webauthn/AuthenticatorSelectionCriteria;", "", "authenticatorAttachment", "", "residentKey", "requireResidentKey", "", "userVerification", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getAuthenticatorAttachment", "()Ljava/lang/String;", "getResidentKey", "getRequireResidentKey", "()Z", "getUserVerification", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final /* data */ class AuthenticatorSelectionCriteria {

    @NotNull
    private final String authenticatorAttachment;
    private final boolean requireResidentKey;

    @NotNull
    private final String residentKey;

    @NotNull
    private final String userVerification;

    public AuthenticatorSelectionCriteria(@NotNull String authenticatorAttachment, @NotNull String residentKey, boolean z11, @NotNull String userVerification) {
        Intrinsics.checkNotNullParameter(authenticatorAttachment, "authenticatorAttachment");
        Intrinsics.checkNotNullParameter(residentKey, "residentKey");
        Intrinsics.checkNotNullParameter(userVerification, "userVerification");
        this.authenticatorAttachment = authenticatorAttachment;
        this.residentKey = residentKey;
        this.requireResidentKey = z11;
        this.userVerification = userVerification;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) other;
        return Intrinsics.areEqual(this.authenticatorAttachment, authenticatorSelectionCriteria.authenticatorAttachment) && Intrinsics.areEqual(this.residentKey, authenticatorSelectionCriteria.residentKey) && this.requireResidentKey == authenticatorSelectionCriteria.requireResidentKey && Intrinsics.areEqual(this.userVerification, authenticatorSelectionCriteria.userVerification);
    }

    public static /* synthetic */ AuthenticatorSelectionCriteria copy$default(AuthenticatorSelectionCriteria authenticatorSelectionCriteria, String str, String str2, boolean z11, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = authenticatorSelectionCriteria.authenticatorAttachment;
        }
        if ((i11 & 2) != 0) {
            str2 = authenticatorSelectionCriteria.residentKey;
        }
        if ((i11 & 4) != 0) {
            z11 = authenticatorSelectionCriteria.requireResidentKey;
        }
        if ((i11 & 8) != 0) {
            str3 = authenticatorSelectionCriteria.userVerification;
        }
        return authenticatorSelectionCriteria.copy(str, str2, z11, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuthenticatorAttachment() {
        return this.authenticatorAttachment;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getResidentKey() {
        return this.residentKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getRequireResidentKey() {
        return this.requireResidentKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserVerification() {
        return this.userVerification;
    }

    @NotNull
    public final AuthenticatorSelectionCriteria copy(@NotNull String authenticatorAttachment, @NotNull String residentKey, boolean requireResidentKey, @NotNull String userVerification) {
        Intrinsics.checkNotNullParameter(authenticatorAttachment, "authenticatorAttachment");
        Intrinsics.checkNotNullParameter(residentKey, "residentKey");
        Intrinsics.checkNotNullParameter(userVerification, "userVerification");
        return new AuthenticatorSelectionCriteria(authenticatorAttachment, residentKey, requireResidentKey, userVerification);
    }

    @NotNull
    public final String getAuthenticatorAttachment() {
        return this.authenticatorAttachment;
    }

    public final boolean getRequireResidentKey() {
        return this.requireResidentKey;
    }

    @NotNull
    public final String getResidentKey() {
        return this.residentKey;
    }

    @NotNull
    public final String getUserVerification() {
        return this.userVerification;
    }

    public int hashCode() {
        return (((((this.authenticatorAttachment.hashCode() * 31) + this.residentKey.hashCode()) * 31) + Boolean.hashCode(this.requireResidentKey)) * 31) + this.userVerification.hashCode();
    }

    @NotNull
    public String toString() {
        return "AuthenticatorSelectionCriteria(authenticatorAttachment=" + this.authenticatorAttachment + ", residentKey=" + this.residentKey + ", requireResidentKey=" + this.requireResidentKey + ", userVerification=" + this.userVerification + ')';
    }

    public /* synthetic */ AuthenticatorSelectionCriteria(String str, String str2, boolean z11, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? "preferred" : str3);
    }
}
