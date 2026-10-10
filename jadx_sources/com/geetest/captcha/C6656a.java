package com.geetest.captcha;

import android.util.Base64;
import androidx.core.view.InputDeviceCompat;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: renamed from: com.geetest.captcha.a */
/* JADX INFO: loaded from: classes45.dex */
public final class C6656a {
    /* JADX INFO: renamed from: a */
    public static byte[] m12517a(byte[] bArr) throws Exception {
        byte[] bytes = "VedaT=ZbPq0Zv7Do".getBytes("utf-8");
        Object objNewInstance = Class.forName(m12515a("amF2YXguY3J5cHRvLnNwZWMuSXZQYXJhbWV0ZXJTcGVj")).getConstructor(byte[].class).newInstance(m12516a());
        Object objNewInstance2 = Class.forName(m12515a("amF2YXguY3J5cHRvLnNwZWMuU2VjcmV0S2V5U3BlYw==")).getConstructor(byte[].class, String.class).newInstance(bytes, "AES");
        Class<?> cls = Class.forName(m12515a("amF2YXguY3J5cHRvLkNpcGhlcg=="));
        Object objInvoke = cls.getMethod("getInstance", String.class).invoke(cls, "AES/CBC/PKCS5Padding");
        cls.getMethod("init", Integer.TYPE, Key.class, AlgorithmParameterSpec.class).invoke(objInvoke, 2, objNewInstance2, objNewInstance);
        return (byte[]) cls.getMethod("doFinal", byte[].class).invoke(objInvoke, bArr);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m12518b(String str) throws Exception {
        String str2 = new String(m12516a());
        byte[] bytes = str.getBytes("utf-8");
        byte[] bytes2 = "VedaT=ZbPq0Zv7Do".getBytes("utf-8");
        Object objNewInstance = Class.forName(m12515a("amF2YXguY3J5cHRvLnNwZWMuSXZQYXJhbWV0ZXJTcGVj")).getConstructor(byte[].class).newInstance(str2.getBytes("utf-8"));
        Object objNewInstance2 = Class.forName(m12515a("amF2YXguY3J5cHRvLnNwZWMuU2VjcmV0S2V5U3BlYw==")).getConstructor(byte[].class, String.class).newInstance(bytes2, "AES");
        Class<?> cls = Class.forName(m12515a("amF2YXguY3J5cHRvLkNpcGhlcg=="));
        Object objInvoke = cls.getMethod("getInstance", String.class).invoke(cls, "AES/CBC/PKCS5Padding");
        cls.getMethod("init", Integer.TYPE, Key.class, AlgorithmParameterSpec.class).invoke(objInvoke, 1, objNewInstance2, objNewInstance);
        return (byte[]) cls.getMethod("doFinal", byte[].class).invoke(objInvoke, bytes);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m12516a() {
        char[] charArray = new String(Base64.decode("MzAzMDMwMzAzMDMwMzAzMDMwMzAzMDMwMzAzMDMwMzA=", 0)).toCharArray();
        int length = charArray.length / 2;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            int iDigit = Character.digit(charArray[i12 + 1], 16) | (Character.digit(charArray[i12], 16) << 4);
            if (iDigit > 127) {
                iDigit += InputDeviceCompat.SOURCE_ANY;
            }
            bArr[i11] = (byte) iDigit;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public static String m12515a(String str) {
        return new String(Base64.decode(str, 0));
    }
}
