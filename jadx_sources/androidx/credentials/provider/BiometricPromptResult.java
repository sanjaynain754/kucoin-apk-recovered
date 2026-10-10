package androidx.credentials.provider;

import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BiometricPromptResult.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\tJ\u0013\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0015"}, m90084d2 = {"Landroidx/credentials/provider/BiometricPromptResult;", "", "authenticationResult", "Landroidx/credentials/provider/AuthenticationResult;", "authenticationError", "Landroidx/credentials/provider/AuthenticationError;", "<init>", "(Landroidx/credentials/provider/AuthenticationResult;Landroidx/credentials/provider/AuthenticationError;)V", "(Landroidx/credentials/provider/AuthenticationError;)V", "(Landroidx/credentials/provider/AuthenticationResult;)V", "getAuthenticationResult", "()Landroidx/credentials/provider/AuthenticationResult;", "getAuthenticationError", "()Landroidx/credentials/provider/AuthenticationError;", "isSuccessful", "", "()Z", "equals", "other", "hashCode", "", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class BiometricPromptResult {

    @Nullable
    private final AuthenticationError authenticationError;

    @Nullable
    private final AuthenticationResult authenticationResult;
    private final boolean isSuccessful;

    /* JADX WARN: Multi-variable type inference failed */
    public BiometricPromptResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof BiometricPromptResult) {
            BiometricPromptResult biometricPromptResult = (BiometricPromptResult) other;
            if (this.isSuccessful == biometricPromptResult.isSuccessful && Intrinsics.areEqual(this.authenticationResult, biometricPromptResult.authenticationResult) && Intrinsics.areEqual(this.authenticationError, biometricPromptResult.authenticationError)) {
                return true;
            }
        }
        return false;
    }

    public BiometricPromptResult(@Nullable AuthenticationResult authenticationResult, @Nullable AuthenticationError authenticationError) {
        this.authenticationResult = authenticationResult;
        this.authenticationError = authenticationError;
        this.isSuccessful = authenticationResult != null;
    }

    @Nullable
    public final AuthenticationError getAuthenticationError() {
        return this.authenticationError;
    }

    @Nullable
    public final AuthenticationResult getAuthenticationResult() {
        return this.authenticationResult;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.isSuccessful), this.authenticationResult, this.authenticationError);
    }

    /* JADX INFO: renamed from: isSuccessful, reason: from getter */
    public final boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    public /* synthetic */ BiometricPromptResult(AuthenticationResult authenticationResult, AuthenticationError authenticationError, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : authenticationResult, (i11 & 2) != 0 ? null : authenticationError);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BiometricPromptResult(@NotNull AuthenticationError authenticationError) {
        this(null, authenticationError);
        Intrinsics.checkNotNullParameter(authenticationError, "authenticationError");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BiometricPromptResult(@NotNull AuthenticationResult authenticationResult) {
        this(authenticationResult, null);
        Intrinsics.checkNotNullParameter(authenticationResult, "authenticationResult");
    }
}
