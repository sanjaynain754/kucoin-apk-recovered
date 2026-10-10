package com.kubi.utils;

import android.util.Base64;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* JADX INFO: renamed from: com.kubi.utils.q0 */
/* JADX INFO: compiled from: RsaUtils.java */
/* JADX INFO: loaded from: classes23.dex */
public final class C27082q0 {
    /* JADX INFO: renamed from: b */
    public static PublicKey m66837b(String str) throws Exception {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str.getBytes(), 0)));
    }

    /* JADX INFO: renamed from: a */
    public static String m66836a(String str, String str2) throws Exception {
        PublicKey publicKeyM66837b = m66837b(str2);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, publicKeyM66837b);
        return new String(cipher.doFinal(Base64.decode(str.getBytes(), 0)));
    }
}
