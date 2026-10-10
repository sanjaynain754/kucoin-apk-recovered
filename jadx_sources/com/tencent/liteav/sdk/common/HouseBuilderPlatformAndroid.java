package com.tencent.liteav.sdk.common;

import android.util.Base64;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::house")
public class HouseBuilderPlatformAndroid {
    private static final String ALGORITHM_AES = "AES";
    private static final String ALGORITHM_AES_CBC_PKCS5PADDING = "AES/CBC/PKCS5Padding";
    private static final String ALGORITHM_RSA = "RSA";
    private static final String ALGORITHM_SHA256WITH_RSA = "SHA256WithRSA";
    private static final String TAG = "HouseBuilderPlatformAndroid";

    public static boolean verifyHouse(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0 || bArr3 == null || bArr3.length == 0) {
            Log.m76036w(TAG, "verifyHouse: invalid parameter.", new Object[0]);
            return false;
        }
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(ALGORITHM_RSA).generatePublic(new X509EncodedKeySpec(Base64.decode(bArr3, 0)));
            Signature signature = Signature.getInstance(ALGORITHM_SHA256WITH_RSA);
            signature.initVerify(publicKeyGeneratePublic);
            signature.update(Base64.decode(bArr, 0));
            return signature.verify(Base64.decode(bArr2, 0));
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e11) {
            e11.printStackTrace();
            return false;
        }
    }

    public static String decryptHouse(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0 || bArr3 == null || bArr3.length == 0) {
            Log.m76036w(TAG, "decryptHouse: invalid parameter.", new Object[0]);
            return "";
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, ALGORITHM_AES);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM_AES_CBC_PKCS5PADDING);
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(Base64.decode(bArr, 0)));
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    public static String getPackageFile(String str) {
        InputStream inputStreamOpen = null;
        try {
            try {
                inputStreamOpen = ContextUtils.getApplicationContext().getAssets().open(str);
                byte[] bArr = new byte[inputStreamOpen.available()];
                if (inputStreamOpen.read(bArr) <= 0) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException unused) {
                    }
                    return "";
                }
                inputStreamOpen.close();
                String str2 = new String(bArr);
                try {
                    inputStreamOpen.close();
                } catch (IOException unused2) {
                }
                return str2;
            } catch (IOException e11) {
                Log.m76036w(TAG, "read asset file failed.", e11);
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException unused3) {
                    }
                }
                return "";
            }
        } catch (Throwable th2) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException unused4) {
                }
            }
            throw th2;
        }
    }
}
