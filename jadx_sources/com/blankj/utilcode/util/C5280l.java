package com.blankj.utilcode.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: com.blankj.utilcode.util.l */
/* JADX INFO: compiled from: EncryptUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C5280l {
    /* JADX INFO: renamed from: e */
    public static byte[] m6265e(byte[] bArr, String str) {
        if (bArr != null && bArr.length > 0) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str);
                messageDigest.update(bArr);
                return messageDigest.digest();
            } catch (NoSuchAlgorithmException e11) {
                e11.printStackTrace();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m6261a(byte[] bArr) {
        return m6265e(bArr, "MD5");
    }

    /* JADX INFO: renamed from: b */
    public static String m6262b(String str) {
        return (str == null || str.length() == 0) ? "" : m6264d(str.getBytes());
    }

    /* JADX INFO: renamed from: c */
    public static String m6263c(String str, String str2) {
        if (str == null && str2 == null) {
            return "";
        }
        if (str2 == null) {
            return C5299u0.m6480c(m6261a(str.getBytes()));
        }
        if (str == null) {
            return C5299u0.m6480c(m6261a(str2.getBytes()));
        }
        return C5299u0.m6480c(m6261a((str + str2).getBytes()));
    }

    /* JADX INFO: renamed from: d */
    public static String m6264d(byte[] bArr) {
        return C5299u0.m6480c(m6261a(bArr));
    }
}
