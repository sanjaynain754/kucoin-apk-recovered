package com.tencent.bugly.common.reporter.upload;

import android.util.Base64;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\b\u0010\n\u001a\u00020\u0004H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/tencent/bugly/common/reporter/upload/EncryptionUtil;", "", "()V", "publicKey", "Ljava/security/PublicKey;", "publicKeyText", "", "encryptData", "", "data", "generatePublicKey", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class EncryptionUtil {

    @NotNull
    public static final EncryptionUtil INSTANCE = new EncryptionUtil();

    @Nullable
    private static PublicKey publicKey = null;

    @NotNull
    private static final String publicKeyText = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA68geFnp46/efYc9WoheJGk9CkL80BGx1ICZ2fmSb/z6ygAhgiNS9d/zjS2Xa1ZN1HIRoh31y2fYn5kTEmkVqyxvFyy/npNdhEbl8N56F10B6p7b8DdAD3Mt8kydC6aXi2aTU+TBQ6XDvfHPLaLPDzaFm0Szs2Dsg9y7F6fh70pOn5A+zfV+/RsSLkgRNV0KALfKPNXvqGMeKaWFNZRdHARIAy4nQ8lH8TxHC43nR0Vjb/bsU1pcifyeaDu6+i29wwvyl5ygfSVRCdHXFzT2a3IOdEoLsUODIACzN2iYEf+y6Mujy4BKARb6rw9Mdd3JUiMn6rIy2wfPqvif3TbBxnwIDAQAB";

    private final PublicKey generatePublicKey() throws InvalidKeySpecException {
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(publicKeyText, 0)));
        Intrinsics.checkNotNullExpressionValue(publicKeyGeneratePublic, "keyFactory.generatePublic(keySpec)");
        return publicKeyGeneratePublic;
    }

    @NotNull
    public final byte[] encryptData(@NotNull byte[] data) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Intrinsics.checkNotNullParameter(data, "data");
        if (publicKey == null) {
            publicKey = generatePublicKey();
        }
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPPadding");
        cipher.init(1, publicKey, new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
        byte[] bArrDoFinal = cipher.doFinal(data);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "cipher.doFinal(data)");
        return bArrDoFinal;
    }

    private EncryptionUtil() {
    }
}
