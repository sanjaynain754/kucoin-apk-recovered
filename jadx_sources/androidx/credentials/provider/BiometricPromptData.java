package androidx.credentials.provider;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.biometric.BiometricPrompt;
import androidx.credentials.provider.utils.CryptoObjectUtils;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BiometricPromptData.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 \u000f2\u00020\u0001:\u0004\u000f\u0010\u0011\u0012B)\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u001f\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Landroidx/credentials/provider/BiometricPromptData;", "", "cryptoObject", "Landroidx/biometric/BiometricPrompt$CryptoObject;", "allowedAuthenticators", "", "isCreatedFromBundle", "", "<init>", "(Landroidx/biometric/BiometricPrompt$CryptoObject;IZ)V", "(Landroidx/biometric/BiometricPrompt$CryptoObject;I)V", "getCryptoObject", "()Landroidx/biometric/BiometricPrompt$CryptoObject;", "getAllowedAuthenticators", "()I", "Companion", "Builder", "ApiMinImpl", "Api35Impl", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class BiometricPromptData {

    @NotNull
    public static final String BUNDLE_HINT_ALLOWED_AUTHENTICATORS = "androidx.credentials.provider.BUNDLE_HINT_ALLOWED_AUTHENTICATORS";

    @NotNull
    public static final String BUNDLE_HINT_CRYPTO_OP_ID = "androidx.credentials.provider.BUNDLE_HINT_CRYPTO_OP_ID";

    @NotNull
    private static final String TAG = "BiometricPromptData";
    private final int allowedAuthenticators;

    @Nullable
    private final BiometricPrompt.CryptoObject cryptoObject;
    private boolean isCreatedFromBundle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Set<Integer> ALLOWED_AUTHENTICATOR_VALUES = SetsKt.setOf((Object[]) new Integer[]{15, 255, 32768, 32783, 33023});

    /* JADX INFO: compiled from: BiometricPromptData.kt */
    @RequiresApi(35)
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, m90084d2 = {"Landroidx/credentials/provider/BiometricPromptData$Api35Impl;", "", "<init>", "()V", "toBundle", "Landroid/os/Bundle;", "biometricPromptData", "Landroidx/credentials/provider/BiometricPromptData;", "fromBundle", "bundle", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Api35Impl {

        @NotNull
        public static final Api35Impl INSTANCE = new Api35Impl();

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public static final BiometricPromptData fromBundle(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return new BiometricPromptData(null, bundle.getInt(BiometricPromptData.BUNDLE_HINT_ALLOWED_AUTHENTICATORS), true);
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public static final Bundle toBundle(@NotNull BiometricPromptData biometricPromptData) {
            Intrinsics.checkNotNullParameter(biometricPromptData, "biometricPromptData");
            Bundle bundle = new Bundle();
            bundle.putInt(BiometricPromptData.BUNDLE_HINT_ALLOWED_AUTHENTICATORS, biometricPromptData.getAllowedAuthenticators());
            if (biometricPromptData.getCryptoObject() != null) {
                bundle.putLong(BiometricPromptData.BUNDLE_HINT_CRYPTO_OP_ID, CryptoObjectUtils.INSTANCE.getOperationHandle(biometricPromptData.getCryptoObject()));
            }
            return bundle;
        }

        private Api35Impl() {
        }
    }

    /* JADX INFO: compiled from: BiometricPromptData.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, m90084d2 = {"Landroidx/credentials/provider/BiometricPromptData$ApiMinImpl;", "", "<init>", "()V", "toBundle", "Landroid/os/Bundle;", "biometricPromptData", "Landroidx/credentials/provider/BiometricPromptData;", "fromBundle", "bundle", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class ApiMinImpl {

        @NotNull
        public static final ApiMinImpl INSTANCE = new ApiMinImpl();

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public static final BiometricPromptData fromBundle(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return new BiometricPromptData(null, bundle.getInt(BiometricPromptData.BUNDLE_HINT_ALLOWED_AUTHENTICATORS), true, 1, null);
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public static final Bundle toBundle(@NotNull BiometricPromptData biometricPromptData) {
            Intrinsics.checkNotNullParameter(biometricPromptData, "biometricPromptData");
            Bundle bundle = new Bundle();
            bundle.putInt(BiometricPromptData.BUNDLE_HINT_ALLOWED_AUTHENTICATORS, biometricPromptData.getAllowedAuthenticators());
            return bundle;
        }

        private ApiMinImpl() {
        }
    }

    /* JADX INFO: compiled from: BiometricPromptData.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\b¨\u0006\r"}, m90084d2 = {"Landroidx/credentials/provider/BiometricPromptData$Builder;", "", "<init>", "()V", "cryptoObject", "Landroidx/biometric/BiometricPrompt$CryptoObject;", "allowedAuthenticators", "", "Ljava/lang/Integer;", "setCryptoObject", "setAllowedAuthenticators", "build", "Landroidx/credentials/provider/BiometricPromptData;", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Builder {

        @Nullable
        private Integer allowedAuthenticators;

        @Nullable
        private BiometricPrompt.CryptoObject cryptoObject;

        @NotNull
        public final BiometricPromptData build() {
            Integer num = this.allowedAuthenticators;
            return new BiometricPromptData(this.cryptoObject, num != null ? num.intValue() : 255);
        }

        @NotNull
        public final Builder setCryptoObject(@Nullable BiometricPrompt.CryptoObject cryptoObject) {
            this.cryptoObject = cryptoObject;
            return this;
        }

        @NotNull
        public final Builder setAllowedAuthenticators(int allowedAuthenticators) {
            this.allowedAuthenticators = Integer.valueOf(allowedAuthenticators);
            return this;
        }
    }

    /* JADX INFO: compiled from: BiometricPromptData.kt */
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tH\u0007J\u0017\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Landroidx/credentials/provider/BiometricPromptData$Companion;", "", "<init>", "()V", "TAG", "", "BUNDLE_HINT_ALLOWED_AUTHENTICATORS", "BUNDLE_HINT_CRYPTO_OP_ID", "fromBundle", "Landroidx/credentials/provider/BiometricPromptData;", "bundle", "Landroid/os/Bundle;", "toBundle", "biometricPromptData", "isStrongAuthenticationType", "", "authenticationTypes", "", "(Ljava/lang/Integer;)Z", "ALLOWED_AUTHENTICATOR_VALUES", "", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isStrongAuthenticationType(Integer authenticationTypes) {
            return authenticationTypes != null && (authenticationTypes.intValue() & 240) == 0;
        }

        private Companion() {
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @Nullable
        public final BiometricPromptData fromBundle(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            try {
                if (bundle.containsKey(BiometricPromptData.BUNDLE_HINT_ALLOWED_AUTHENTICATORS)) {
                    return Build.VERSION.SDK_INT >= 35 ? Api35Impl.fromBundle(bundle) : ApiMinImpl.fromBundle(bundle);
                }
                throw new IllegalArgumentException("Bundle lacks allowed authenticator key.");
            } catch (Exception e11) {
                Log.i(BiometricPromptData.TAG, "fromSlice failed with: " + e11.getMessage());
                return null;
            }
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public final Bundle toBundle(@NotNull BiometricPromptData biometricPromptData) {
            Intrinsics.checkNotNullParameter(biometricPromptData, "biometricPromptData");
            return Build.VERSION.SDK_INT >= 35 ? Api35Impl.toBundle(biometricPromptData) : ApiMinImpl.toBundle(biometricPromptData);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public BiometricPromptData() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    @JvmOverloads
    public BiometricPromptData(@Nullable BiometricPrompt.CryptoObject cryptoObject) {
        this(cryptoObject, 0, 2, null);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Nullable
    public static final BiometricPromptData fromBundle(@NotNull Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final Bundle toBundle(@NotNull BiometricPromptData biometricPromptData) {
        return INSTANCE.toBundle(biometricPromptData);
    }

    public final int getAllowedAuthenticators() {
        return this.allowedAuthenticators;
    }

    @Nullable
    public final BiometricPrompt.CryptoObject getCryptoObject() {
        return this.cryptoObject;
    }

    public BiometricPromptData(@Nullable BiometricPrompt.CryptoObject cryptoObject, int i11, boolean z11) {
        this.cryptoObject = cryptoObject;
        this.allowedAuthenticators = i11;
        this.isCreatedFromBundle = z11;
        if (!z11 && !ALLOWED_AUTHENTICATOR_VALUES.contains(Integer.valueOf(i11))) {
            throw new IllegalArgumentException("The allowed authenticator must be specified according to the BiometricPrompt spec.");
        }
        if (cryptoObject != null && !INSTANCE.isStrongAuthenticationType(Integer.valueOf(i11))) {
            throw new IllegalArgumentException("If the cryptoObject is non-null, the allowedAuthenticator value must be Authenticators.BIOMETRIC_STRONG.");
        }
    }

    public /* synthetic */ BiometricPromptData(BiometricPrompt.CryptoObject cryptoObject, int i11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : cryptoObject, (i12 & 2) != 0 ? 255 : i11, (i12 & 4) != 0 ? false : z11);
    }

    public /* synthetic */ BiometricPromptData(BiometricPrompt.CryptoObject cryptoObject, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : cryptoObject, (i12 & 2) != 0 ? 255 : i11);
    }

    @JvmOverloads
    public BiometricPromptData(@Nullable BiometricPrompt.CryptoObject cryptoObject, int i11) {
        this(cryptoObject, i11, false);
    }
}
