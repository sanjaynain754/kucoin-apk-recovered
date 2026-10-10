package com.datavisor.vangogh.bridge;

/* JADX INFO: loaded from: classes34.dex */
public class crypto {
    public static native byte[] a2d(byte[] bArr);

    public static native synchronized String addZDTimerCollectData(String str, String str2);

    public static native String convert(String str);

    public static native byte[] d2a(byte[] bArr);

    public static native byte[] decryptL(byte[] bArr, String str, String str2);

    public static native byte[] decryptV(byte[] bArr);

    public static native String encrypt(String str, byte[] bArr);

    public static native synchronized byte[] encryptForLongToken(String str);

    public static native synchronized byte[] encryptForPatchConfig(String str);

    public static native byte[] encryptL(byte[] bArr, String str, String str2);

    public static native byte[] encryptV(byte[] bArr);

    public static native synchronized byte[] encryptVV(String str, int i11);

    public static native synchronized String encryptZDNoVV(String str);

    public static native synchronized byte[] encryptZDVV(String str);

    public static native String getCTByUID(String str);

    public static native String getZDUUByUID(String str);

    public static native long geti(String str);

    public static native byte[] reduce(byte[] bArr);

    public static native byte[] sign(byte[] bArr);
}
