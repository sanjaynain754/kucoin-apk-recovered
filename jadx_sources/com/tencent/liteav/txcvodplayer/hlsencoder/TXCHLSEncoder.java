package com.tencent.liteav.txcvodplayer.hlsencoder;

import android.text.TextUtils;
import android.util.Base64;
import com.tencent.liteav.base.util.LiteavLog;
import java.nio.charset.Charset;
import java.util.Random;

/* JADX INFO: loaded from: classes59.dex */
public class TXCHLSEncoder {

    /* JADX INFO: renamed from: a */
    private static final String f74030a = "com.tencent.liteav.txcvodplayer.hlsencoder.TXCHLSEncoder";

    /* JADX INFO: renamed from: b */
    private static final Charset f74031b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c */
    private static final char[] f74032c = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: a */
    public static String m76426a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return rsaEncrypt(str);
        }
        LiteavLog.m76093w(f74030a, "encryptKey input exception!");
        return null;
    }

    private static native byte[] aesDecrypt(String str, byte[] bArr);

    private static native byte[] aesEncrypt(String str, byte[] bArr);

    private static native String md5(int i11, String str, String str2, int i12);

    private static native String rsaEncrypt(String str);

    /* JADX INFO: renamed from: b */
    public static String m76428b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return new String(aesDecrypt(str, Base64.decode(str2, 2)), f74031b);
        }
        LiteavLog.m76093w(f74030a, "decryptWithSecretKey input exception!");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m76424a() {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < 32; i11++) {
            char[] cArr = f74032c;
            sb2.append(cArr[new Random().nextInt(cArr.length)]);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m76425a(int i11, String str, String str2, int i12) {
        if (TextUtils.isEmpty(str)) {
            str = "default";
        }
        if (TextUtils.isEmpty(str2)) {
            LiteavLog.m76093w(f74030a, "genSecretKey input exception!");
            return null;
        }
        return md5(i11, str, str2, i12);
    }

    /* JADX INFO: renamed from: a */
    public static String m76427a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return Base64.encodeToString(aesEncrypt(str, str2.getBytes(f74031b)), 2);
        }
        LiteavLog.m76093w(f74030a, "encryptWithSecretKey input exception!");
        return null;
    }
}
