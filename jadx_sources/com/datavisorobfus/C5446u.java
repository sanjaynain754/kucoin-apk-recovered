package com.datavisorobfus;

import java.security.MessageDigest;

/* JADX INFO: renamed from: com.datavisorobfus.u */
/* JADX INFO: loaded from: classes34.dex */
public class C5446u {
    /* JADX INFO: renamed from: a */
    public static String m7403a(String str) {
        try {
            if (C5457z0.m7480a(str)) {
                return null;
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("UTF-8"));
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : bArrDigest) {
                sb2.append(String.format("%02x", Byte.valueOf(b11)));
            }
            return sb2.toString();
        } catch (Exception e11) {
            C5415f0.m7139a(e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m7404a(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                messageDigest.update(bArr);
                return messageDigest.digest();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static String m7405b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : bArrDigest) {
                sb2.append(String.format("%02x", Byte.valueOf(b11)));
            }
            return sb2.toString();
        } catch (Exception e11) {
            C5415f0.m7139a(e11);
            return null;
        }
    }
}
