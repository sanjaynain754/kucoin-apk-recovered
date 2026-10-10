package androidx.credentials.provider;

import android.util.Log;
import androidx.annotation.RestrictTo;
import java.util.LinkedHashMap;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AuthenticationResult.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, m90084d2 = {"Landroidx/credentials/provider/AuthenticationResult;", "", "authenticationType", "", "<init>", "(I)V", "getAuthenticationType", "()I", "equals", "", "other", "hashCode", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class AuthenticationResult {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final String EXTRA_BIOMETRIC_AUTH_RESULT_TYPE = "androidx.credentials.provider.BIOMETRIC_AUTH_RESULT";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final String EXTRA_BIOMETRIC_AUTH_RESULT_TYPE_FALLBACK = "BIOMETRIC_AUTH_RESULT";
    private final int authenticationType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final LinkedHashMap<Integer, Integer> biometricFrameworkToJetpackResultMap = MapsKt.linkedMapOf(TuplesKt.m90091to(2, 2), TuplesKt.m90091to(1, 1));

    /* JADX INFO: compiled from: AuthenticationResult.kt */
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0000¢\u0006\u0002\b\u000fJ\u001f\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0015R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R2\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\n8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m90084d2 = {"Landroidx/credentials/provider/AuthenticationResult$Companion;", "", "<init>", "()V", "EXTRA_BIOMETRIC_AUTH_RESULT_TYPE", "", "EXTRA_BIOMETRIC_AUTH_RESULT_TYPE_FALLBACK", "biometricFrameworkToJetpackResultMap", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "getBiometricFrameworkToJetpackResultMap$credentials", "()Ljava/util/LinkedHashMap;", "convertFrameworkBiometricResultToJetpack", "frameworkCode", "convertFrameworkBiometricResultToJetpack$credentials", "createFrom", "Landroidx/credentials/provider/AuthenticationResult;", "uiAuthenticationType", "isFrameworkBiometricPrompt", "", "createFrom$credentials", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmOverloads
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final AuthenticationResult createFrom$credentials(int i11) {
            return createFrom$credentials$default(this, i11, false, 2, null);
        }

        private Companion() {
        }

        public static /* synthetic */ AuthenticationResult createFrom$credentials$default(Companion companion, int i11, boolean z11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                z11 = true;
            }
            return companion.createFrom$credentials(i11, z11);
        }

        @JvmOverloads
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final AuthenticationResult createFrom$credentials(int uiAuthenticationType, boolean isFrameworkBiometricPrompt) {
            if (isFrameworkBiometricPrompt) {
                uiAuthenticationType = convertFrameworkBiometricResultToJetpack$credentials(uiAuthenticationType);
            }
            return new AuthenticationResult(uiAuthenticationType);
        }

        public final int convertFrameworkBiometricResultToJetpack$credentials(int frameworkCode) {
            if (getBiometricFrameworkToJetpackResultMap$credentials().containsKey(Integer.valueOf(frameworkCode))) {
                Integer num = getBiometricFrameworkToJetpackResultMap$credentials().get(Integer.valueOf(frameworkCode));
                Intrinsics.checkNotNull(num);
                return num.intValue();
            }
            Log.i(AuthenticationError.INSTANCE.getTAG$credentials(), "Non framework result code, " + frameworkCode + ", ");
            return frameworkCode;
        }

        @NotNull
        public final LinkedHashMap<Integer, Integer> getBiometricFrameworkToJetpackResultMap$credentials() {
            return AuthenticationResult.biometricFrameworkToJetpackResultMap;
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AuthenticationResult) && this.authenticationType == ((AuthenticationResult) other).authenticationType;
    }

    public final int getAuthenticationType() {
        return this.authenticationType;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.authenticationType));
    }

    public AuthenticationResult(int i11) {
        this.authenticationType = i11;
    }
}
