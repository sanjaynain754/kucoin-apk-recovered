package com.sumsub.sns.internal.core.common;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p852kotlin.collections.ArraysKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28464j {
    /* JADX INFO: renamed from: a */
    public static final byte[] m69367a(byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArr3 = new byte[16];
        new SecureRandom().nextBytes(bArr3);
        SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(bArr2, 16), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(bArr3));
        return ArraysKt.plus(bArr3, cipher.doFinal(bArr));
    }
}
