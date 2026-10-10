package com.tencent.bugly.common.reporter.upload;

import android.text.TextUtils;
import android.util.Base64;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tencent.bugly.proguard.C33820nf;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.UUID;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.Charsets;
import p852kotlin.text.Regex;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m90084d2 = {"Lcom/tencent/bugly/common/reporter/upload/UploadEncrypt;", "", "()V", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class UploadEncrypt {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int IV_LENGTH = 16;

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\bH\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\bH\u0007J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0007J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0018\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/tencent/bugly/common/reporter/upload/UploadEncrypt$Companion;", "", "()V", "IV_LENGTH", "", "buildCipher", "Ljavax/crypto/Cipher;", "key", "", "mode", "createEncryptKey", "doResponseDecrypt", "", "response", "doUploadEncrypt", "request", "doUploadEncryptWithAppId", RemoteConfigConstants.RequestFieldKey.APP_ID, "encryptData", "Ljava/io/ByteArrayOutputStream;", "data", "encryptKey", "getEncryptKey", "sha256", "input", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final byte[] sha256(String input) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                byte[] bytes = input.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                return messageDigest.digest(bytes);
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }

        @JvmStatic
        @NotNull
        public final Cipher buildCipher(@NotNull String key, int mode) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
            byte[] bArrCopyOf;
            Intrinsics.checkNotNullParameter(key, "key");
            byte[] bArrSha256 = sha256(key);
            if (bArrSha256 != null) {
                bArrCopyOf = Arrays.copyOf(bArrSha256, 16);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, newSize)");
            } else {
                bArrCopyOf = null;
            }
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(mode, new SecretKeySpec(bArrSha256, "AES"), new IvParameterSpec(bArrCopyOf));
            Intrinsics.checkNotNullExpressionValue(cipher, "cipher");
            return cipher;
        }

        @JvmStatic
        @NotNull
        public final ByteArrayOutputStream encryptData(@NotNull byte[] data, @NotNull String encryptKey) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(encryptKey, "encryptKey");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            CipherOutputStream cipherOutputStream = new CipherOutputStream(byteArrayOutputStream, buildCipher(encryptKey, 1));
            cipherOutputStream.write(data);
            cipherOutputStream.close();
            return byteArrayOutputStream;
        }

        @JvmStatic
        @NotNull
        public final String getEncryptKey(@NotNull String encryptKey) {
            Intrinsics.checkNotNullParameter(encryptKey, "encryptKey");
            try {
                EncryptionUtil encryptionUtil = EncryptionUtil.INSTANCE;
                byte[] bytes = encryptKey.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                String strEncodeToString = Base64.encodeToString(encryptionUtil.encryptData(bytes), 2);
                Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(encryptedData, Base64.NO_WRAP)");
                return strEncodeToString;
            } catch (Exception e11) {
                e11.printStackTrace();
                return encryptKey;
            }
        }

        @JvmStatic
        @NotNull
        public final String createEncryptKey() {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            if (TextUtils.isEmpty(string)) {
                return "";
            }
            return new Regex(C33820nf.f71144W).replace(string, "");
        }

        @JvmStatic
        @NotNull
        public final byte[] doResponseDecrypt(@NotNull byte[] response, @NotNull String key) throws BadPaddingException, IllegalBlockSizeException {
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(key, "key");
            byte[] bArrDoFinal = buildCipher(key, 2).doFinal(response);
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "buildCipher(key, Cipher.…T_MODE).doFinal(response)");
            return bArrDoFinal;
        }

        @JvmStatic
        @NotNull
        public final byte[] doUploadEncrypt(@NotNull byte[] request, @NotNull String key) throws BadPaddingException, IllegalBlockSizeException {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(key, "key");
            byte[] bArrDoFinal = buildCipher(key, 1).doFinal(request);
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "buildCipher(key, Cipher.…PT_MODE).doFinal(request)");
            return bArrDoFinal;
        }

        @JvmStatic
        @NotNull
        public final byte[] doUploadEncryptWithAppId(@NotNull byte[] request, @NotNull String appId) throws BadPaddingException, IllegalBlockSizeException {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(appId, "appId");
            byte[] bArrDoFinal = buildCipher("692692a23ad61ea3" + appId + "16371bbed4f1a9a1", 1).doFinal(request);
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "buildCipher(\"692692a23ad…PT_MODE).doFinal(request)");
            return bArrDoFinal;
        }
    }

    @JvmStatic
    @NotNull
    public static final Cipher buildCipher(@NotNull String str, int i11) {
        return INSTANCE.buildCipher(str, i11);
    }

    @JvmStatic
    @NotNull
    public static final String createEncryptKey() {
        return INSTANCE.createEncryptKey();
    }

    @JvmStatic
    @NotNull
    public static final byte[] doResponseDecrypt(@NotNull byte[] bArr, @NotNull String str) {
        return INSTANCE.doResponseDecrypt(bArr, str);
    }

    @JvmStatic
    @NotNull
    public static final byte[] doUploadEncrypt(@NotNull byte[] bArr, @NotNull String str) {
        return INSTANCE.doUploadEncrypt(bArr, str);
    }

    @JvmStatic
    @NotNull
    public static final byte[] doUploadEncryptWithAppId(@NotNull byte[] bArr, @NotNull String str) {
        return INSTANCE.doUploadEncryptWithAppId(bArr, str);
    }

    @JvmStatic
    @NotNull
    public static final ByteArrayOutputStream encryptData(@NotNull byte[] bArr, @NotNull String str) {
        return INSTANCE.encryptData(bArr, str);
    }

    @JvmStatic
    @NotNull
    public static final String getEncryptKey(@NotNull String str) {
        return INSTANCE.getEncryptKey(str);
    }
}
