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

/* JADX INFO: compiled from: AuthenticationError.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m90084d2 = {"Landroidx/credentials/provider/AuthenticationError;", "", "errorCode", "", "errorMsg", "", "<init>", "(ILjava/lang/CharSequence;)V", "getErrorCode", "()I", "getErrorMsg", "()Ljava/lang/CharSequence;", "equals", "", "other", "hashCode", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class AuthenticationError {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final String EXTRA_BIOMETRIC_AUTH_ERROR = "androidx.credentials.provider.BIOMETRIC_AUTH_ERROR_CODE";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final String EXTRA_BIOMETRIC_AUTH_ERROR_FALLBACK = "BIOMETRIC_AUTH_ERROR_CODE";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final String EXTRA_BIOMETRIC_AUTH_ERROR_MESSAGE = "androidx.credentials.provider.BIOMETRIC_AUTH_ERROR_MESSAGE";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final String EXTRA_BIOMETRIC_AUTH_ERROR_MESSAGE_FALLBACK = "BIOMETRIC_AUTH_ERROR_MESSAGE";
    private final int errorCode;

    @Nullable
    private final CharSequence errorMsg;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "AuthenticationError";

    @NotNull
    private static final LinkedHashMap<Integer, Integer> biometricFrameworkToJetpackErrorMap = MapsKt.linkedMapOf(TuplesKt.m90091to(5, 5), TuplesKt.m90091to(12, 12), TuplesKt.m90091to(1, 1), TuplesKt.m90091to(7, 7), TuplesKt.m90091to(9, 9), TuplesKt.m90091to(11, 11), TuplesKt.m90091to(14, 14), TuplesKt.m90091to(4, 4), TuplesKt.m90091to(15, 15), TuplesKt.m90091to(3, 3), TuplesKt.m90091to(2, 2), TuplesKt.m90091to(10, 10), TuplesKt.m90091to(8, 8));

    /* JADX INFO: compiled from: AuthenticationError.kt */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0014J'\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0001¢\u0006\u0002\b\u001cR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0002\n\u0000R2\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u000f8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m90084d2 = {"Landroidx/credentials/provider/AuthenticationError$Companion;", "", "<init>", "()V", "TAG", "", "getTAG$credentials", "()Ljava/lang/String;", "EXTRA_BIOMETRIC_AUTH_ERROR", "EXTRA_BIOMETRIC_AUTH_ERROR_FALLBACK", "EXTRA_BIOMETRIC_AUTH_ERROR_MESSAGE", "EXTRA_BIOMETRIC_AUTH_ERROR_MESSAGE_FALLBACK", "biometricFrameworkToJetpackErrorMap", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "getBiometricFrameworkToJetpackErrorMap$credentials", "()Ljava/util/LinkedHashMap;", "convertFrameworkBiometricErrorToJetpack", "frameworkCode", "convertFrameworkBiometricErrorToJetpack$credentials", "createFrom", "Landroidx/credentials/provider/AuthenticationError;", "uiErrorCode", "uiErrorMessage", "", "isFrameworkBiometricPrompt", "", "createFrom$credentials", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmOverloads
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final AuthenticationError createFrom$credentials(int i11, @NotNull CharSequence uiErrorMessage) {
            Intrinsics.checkNotNullParameter(uiErrorMessage, "uiErrorMessage");
            return createFrom$credentials$default(this, i11, uiErrorMessage, false, 4, null);
        }

        private Companion() {
        }

        public static /* synthetic */ AuthenticationError createFrom$credentials$default(Companion companion, int i11, CharSequence charSequence, boolean z11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                z11 = true;
            }
            return companion.createFrom$credentials(i11, charSequence, z11);
        }

        @JvmOverloads
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final AuthenticationError createFrom$credentials(int uiErrorCode, @NotNull CharSequence uiErrorMessage, boolean isFrameworkBiometricPrompt) {
            Intrinsics.checkNotNullParameter(uiErrorMessage, "uiErrorMessage");
            if (isFrameworkBiometricPrompt) {
                uiErrorCode = convertFrameworkBiometricErrorToJetpack$credentials(uiErrorCode);
            }
            return new AuthenticationError(uiErrorCode, uiErrorMessage);
        }

        public final int convertFrameworkBiometricErrorToJetpack$credentials(int frameworkCode) {
            if (getBiometricFrameworkToJetpackErrorMap$credentials().containsKey(Integer.valueOf(frameworkCode))) {
                Integer num = getBiometricFrameworkToJetpackErrorMap$credentials().get(Integer.valueOf(frameworkCode));
                Intrinsics.checkNotNull(num);
                return num.intValue();
            }
            Log.i(getTAG$credentials(), "Unexpected error code, " + frameworkCode + ", ");
            return frameworkCode;
        }

        @NotNull
        public final LinkedHashMap<Integer, Integer> getBiometricFrameworkToJetpackErrorMap$credentials() {
            return AuthenticationError.biometricFrameworkToJetpackErrorMap;
        }

        @NotNull
        public final String getTAG$credentials() {
            return AuthenticationError.TAG;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public AuthenticationError(int i11) {
        this(i11, null, 2, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof AuthenticationError) {
            AuthenticationError authenticationError = (AuthenticationError) other;
            if (this.errorCode == authenticationError.errorCode && Intrinsics.areEqual(this.errorMsg, authenticationError.errorMsg)) {
                return true;
            }
        }
        return false;
    }

    @JvmOverloads
    public AuthenticationError(int i11, @Nullable CharSequence charSequence) {
        this.errorCode = i11;
        this.errorMsg = charSequence;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final CharSequence getErrorMsg() {
        return this.errorMsg;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.errorCode), this.errorMsg);
    }

    public /* synthetic */ AuthenticationError(int i11, CharSequence charSequence, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? null : charSequence);
    }
}
