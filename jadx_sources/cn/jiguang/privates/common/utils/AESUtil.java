package cn.jiguang.privates.common.utils;

import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes34.dex */
public class AESUtil {
    public static byte[] decryptBytes(byte[] bArr, String str) throws Exception {
        return aes_gcm(bArr, str, 2);
    }

    public static byte[] encryptBytes(byte[] bArr, String str) throws Exception {
        return aes_gcm(bArr, str, 1);
    }

    private static byte[] aes_cbc(byte[] bArr, String str, String str2, int i11) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(generateKeyBytes(str, "UTF-8"), "AES");
        IvParameterSpec ivParameterSpecReflectGetIv = reflectGetIv(str2.getBytes("UTF-8"));
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(i11, secretKeySpec, ivParameterSpecReflectGetIv);
        return cipher.doFinal(bArr);
    }

    private static byte[] aes_gcm(byte[] bArr, String str, int i11) throws Exception {
        byte[] bArrGenerateKeyBytes = generateKeyBytes(str, "UTF-8");
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(i11, new SecretKeySpec(bArrGenerateKeyBytes, "AES"), new GCMParameterSpec(128, bArrGenerateKeyBytes));
        return cipher.doFinal(bArr);
    }

    public static byte[] decryptBytes(byte[] bArr, String str, String str2) throws Exception {
        return aes_cbc(bArr, str, str2, 2);
    }

    public static byte[] encryptBytes(byte[] bArr, String str, String str2) throws Exception {
        return aes_cbc(bArr, str, str2, 1);
    }

    public static int generateSeed() {
        return Math.abs(new SecureRandom().nextInt()) & 16777215;
    }

    public static String get16Md5AesKey(long j11) {
        long j12;
        long j13;
        switch ((int) (j11 % 10)) {
            case 1:
                j12 = 5 * j11;
                j13 = j11 % 88;
                break;
            case 2:
                j12 = 23 * j11;
                j13 = j11 % 15;
                break;
            case 3:
                j12 = 3 * j11;
                j13 = j11 % 73;
                break;
            case 4:
                j12 = 13 * j11;
                j13 = j11 % 96;
                break;
            case 5:
                j12 = 17 * j11;
                j13 = j11 % 49;
                break;
            case 6:
                j12 = 7 * j11;
                j13 = j11 % 68;
                break;
            case 7:
                j12 = 31 * j11;
                j13 = j11 % 39;
                break;
            case 8:
                j12 = 29 * j11;
                j13 = j11 % 41;
                break;
            case 9:
                j12 = 37 * j11;
                j13 = j11 % 91;
                break;
            default:
                j12 = 8 * j11;
                j13 = j11 % 74;
                break;
        }
        return StringUtil.get16MD5String("JCKP" + (j12 + j13));
    }

    public static String getMd5AesKey(long j11) {
        long j12;
        long j13;
        switch ((int) (j11 % 10)) {
            case 1:
                j12 = 5 * j11;
                j13 = j11 % 88;
                break;
            case 2:
                j12 = 23 * j11;
                j13 = j11 % 15;
                break;
            case 3:
                j12 = 3 * j11;
                j13 = j11 % 73;
                break;
            case 4:
                j12 = 13 * j11;
                j13 = j11 % 96;
                break;
            case 5:
                j12 = 17 * j11;
                j13 = j11 % 49;
                break;
            case 6:
                j12 = 7 * j11;
                j13 = j11 % 68;
                break;
            case 7:
                j12 = 31 * j11;
                j13 = j11 % 39;
                break;
            case 8:
                j12 = 29 * j11;
                j13 = j11 % 41;
                break;
            case 9:
                j12 = 37 * j11;
                j13 = j11 % 91;
                break;
            default:
                j12 = 8 * j11;
                j13 = j11 % 74;
                break;
        }
        return StringUtil.get32MD5String("JCKP" + (j12 + j13));
    }

    private static IvParameterSpec reflectGetIv(byte[] bArr) throws Exception {
        return (IvParameterSpec) ReflectUtil.invokeConstructor(IvParameterSpec.class, new Object[]{bArr}, new Class[]{byte[].class});
    }

    private static byte[] generateKeyBytes(String str, String str2) throws UnsupportedEncodingException {
        byte[] bArr = new byte[str.length()];
        byte[] bytes = str.substring(0, str.length() / 2).getBytes(str2);
        byte[] bytes2 = str.substring(str.length() / 2).getBytes(str2);
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        System.arraycopy(bytes2, 0, bArr, bytes.length, bytes2.length);
        return bArr;
    }
}
