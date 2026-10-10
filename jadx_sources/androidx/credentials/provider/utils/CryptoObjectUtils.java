package androidx.credentials.provider.utils;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import androidx.annotation.RequiresApi;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CryptoObjectUtils.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\r"}, m90084d2 = {"Landroidx/credentials/provider/utils/CryptoObjectUtils;", "", "<init>", "()V", "wrapForBiometricPrompt", "Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;", "cryptoObject", "Landroidx/biometric/BiometricPrompt$CryptoObject;", "getOperationHandle", "", "Api35Impl", "Api30Impl", "Api28Impl", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class CryptoObjectUtils {

    @NotNull
    public static final CryptoObjectUtils INSTANCE = new CryptoObjectUtils();

    /* JADX INFO: compiled from: CryptoObjectUtils.kt */
    @RequiresApi(28)
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m90084d2 = {"Landroidx/credentials/provider/utils/CryptoObjectUtils$Api28Impl;", "", "<init>", "()V", "create", "Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;", "cipher", "Ljavax/crypto/Cipher;", TUIConstants.TUICalling.PARAM_NAME_AUDIO_SIGNATURE, "Ljava/security/Signature;", TPDownloadProxyEnum.USER_MAC, "Ljavax/crypto/Mac;", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Api28Impl {

        @NotNull
        public static final Api28Impl INSTANCE = new Api28Impl();

        @NotNull
        public final BiometricPrompt.CryptoObject create(@NotNull Cipher cipher) {
            Intrinsics.checkNotNullParameter(cipher, "cipher");
            return new BiometricPrompt.CryptoObject(cipher);
        }

        @NotNull
        public final BiometricPrompt.CryptoObject create(@NotNull Signature signature) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            return new BiometricPrompt.CryptoObject(signature);
        }

        private Api28Impl() {
        }

        @NotNull
        public final BiometricPrompt.CryptoObject create(@NotNull Mac mac) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            return new BiometricPrompt.CryptoObject(mac);
        }
    }

    /* JADX INFO: compiled from: CryptoObjectUtils.kt */
    @RequiresApi(30)
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Landroidx/credentials/provider/utils/CryptoObjectUtils$Api30Impl;", "", "<init>", "()V", "create", "Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;", "identityCredential", "Landroid/security/identity/IdentityCredential;", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Api30Impl {

        @NotNull
        public static final Api30Impl INSTANCE = new Api30Impl();

        @NotNull
        public final BiometricPrompt.CryptoObject create(@NotNull IdentityCredential identityCredential) {
            Intrinsics.checkNotNullParameter(identityCredential, "identityCredential");
            return new BiometricPrompt.CryptoObject(identityCredential);
        }

        private Api30Impl() {
        }
    }

    /* JADX INFO: compiled from: CryptoObjectUtils.kt */
    @RequiresApi(35)
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Landroidx/credentials/provider/utils/CryptoObjectUtils$Api35Impl;", "", "<init>", "()V", "getOperationHandle", "", "crypto", "Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Api35Impl {

        @NotNull
        public static final Api35Impl INSTANCE = new Api35Impl();

        public final long getOperationHandle(@NotNull BiometricPrompt.CryptoObject crypto) {
            Intrinsics.checkNotNullParameter(crypto, "crypto");
            return crypto.getOperationHandle();
        }

        private Api35Impl() {
        }
    }

    @RequiresApi(28)
    @Nullable
    public final BiometricPrompt.CryptoObject wrapForBiometricPrompt(@Nullable androidx.biometric.BiometricPrompt.CryptoObject cryptoObject) {
        IdentityCredential identityCredential;
        if (cryptoObject == null) {
            return null;
        }
        Cipher cipher = cryptoObject.getCipher();
        if (cipher != null) {
            return Api28Impl.INSTANCE.create(cipher);
        }
        Signature signature = cryptoObject.getSignature();
        if (signature != null) {
            return Api28Impl.INSTANCE.create(signature);
        }
        Mac mac = cryptoObject.getMac();
        if (mac != null) {
            return Api28Impl.INSTANCE.create(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredential = cryptoObject.getIdentityCredential()) == null) {
            return null;
        }
        return Api30Impl.INSTANCE.create(identityCredential);
    }

    private CryptoObjectUtils() {
    }

    @RequiresApi(35)
    public final long getOperationHandle(@Nullable androidx.biometric.BiometricPrompt.CryptoObject cryptoObject) {
        BiometricPrompt.CryptoObject cryptoObjectWrapForBiometricPrompt = wrapForBiometricPrompt(cryptoObject);
        if (cryptoObjectWrapForBiometricPrompt != null) {
            return Api35Impl.INSTANCE.getOperationHandle(cryptoObjectWrapForBiometricPrompt);
        }
        return 0L;
    }
}
