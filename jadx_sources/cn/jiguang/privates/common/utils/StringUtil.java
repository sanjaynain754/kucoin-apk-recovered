package cn.jiguang.privates.common.utils;

import android.text.TextUtils;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes34.dex */
public class StringUtil {
    private static final String HEX = "0123456789ABCDEF";

    public static String getBytesSHA1(byte[] bArr) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(bArr);
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : bArrDigest) {
                int i11 = b11 & 255;
                if (i11 < 16) {
                    sb2.append("0");
                }
                sb2.append(Integer.toHexString(i11));
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String toMD5(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return toHex(messageDigest.digest());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String decodeToString(String str) {
        try {
            return new String(Base64.decode(str.getBytes("UTF-8"), 2));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String encodeToString(String str) {
        try {
            return Base64.encodeToString(str.getBytes("UTF-8"), 2);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String get32MD5String(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[charArray.length];
            for (int i11 = 0; i11 < charArray.length; i11++) {
                bArr[i11] = (byte) charArray[i11];
            }
            byte[] bArrDigest = messageDigest.digest(bArr);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b11 : bArrDigest) {
                int i12 = b11 & 255;
                if (i12 < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i12));
            }
            return stringBuffer.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getBytesMD5(byte[] bArr) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(bArr);
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : bArrDigest) {
                int i11 = b11 & 255;
                if (i11 < 16) {
                    sb2.append("0");
                }
                sb2.append(Integer.toHexString(i11));
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getMD5Utf8(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : bArrDigest) {
                int i11 = b11 & 255;
                if (i11 < 16) {
                    sb2.append("0");
                }
                sb2.append(Integer.toHexString(i11));
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getTlv2(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return "";
        }
        try {
            byte[] bArr = new byte[byteBuffer.getShort()];
            byteBuffer.get(bArr);
            return new String(bArr, "UTF-8");
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String toHex(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b11 : bArr) {
            sb2.append(HEX.charAt((b11 >> 4) & 15));
            sb2.append(HEX.charAt(b11 & 15));
        }
        return sb2.toString();
    }

    public static String filterSpecialCharacter(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return Pattern.compile("[^\\w#$@\\-一-龥]+").matcher(str).replaceAll("");
    }

    public static String get16MD5String(String str) {
        return get32MD5String(str).substring(8, 24);
    }

    public static byte[] stringToUtf8Bytes(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return new byte[0];
            }
            return str.getBytes("UTF-8");
        } catch (Throwable unused) {
            return str.getBytes();
        }
    }

    public static String getBytesSHA1(String str) {
        try {
            return TextUtils.isEmpty(str) ? str : getBytesSHA1(str.getBytes("UTF-8"));
        } catch (Throwable unused) {
            return str;
        }
    }
}
