package oc0;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: oc0.b */
/* JADX INFO: compiled from: DigestUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C43015b {
    /* JADX INFO: renamed from: a */
    public static String m94483a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; bArr != null && i11 < bArr.length; i11++) {
            String hexString = Integer.toHexString(bArr[i11] & 255);
            if (hexString.length() == 1) {
                sb2.append('0');
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m94484b(byte[] bArr, byte[] bArr2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "HmacSHA1");
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(secretKeySpec);
            return m94483a(mac.doFinal(bArr));
        } catch (InvalidKeyException | NoSuchAlgorithmException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m94485c(String str) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("SHA");
        } catch (Exception unused) {
            messageDigest = null;
        }
        byte[] bArrDigest = messageDigest.digest(str.getBytes(StandardCharsets.UTF_8));
        StringBuilder sb2 = new StringBuilder();
        for (byte b11 : bArrDigest) {
            int i11 = b11 & 255;
            if (i11 < 16) {
                sb2.append("0");
            }
            sb2.append(Integer.toHexString(i11));
        }
        return sb2.toString();
    }
}
