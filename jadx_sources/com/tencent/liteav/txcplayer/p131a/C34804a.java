package com.tencent.liteav.txcplayer.p131a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.liteav.base.util.LiteavLog;
import java.net.URLDecoder;
import java.security.MessageDigest;

/* JADX INFO: renamed from: com.tencent.liteav.txcplayer.a.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C34804a {
    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    /* JADX INFO: renamed from: a */
    public static String m76212a(String str) {
        String strSubstring;
        if (TextUtils.isEmpty(str)) {
            strSubstring = "";
        } else {
            int iIndexOf = str.indexOf(63);
            if (iIndexOf > 0) {
                str = str.substring(0, iIndexOf);
            }
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf < 0 || iLastIndexOf >= str.length() - 1) {
                strSubstring = "";
            } else {
                strSubstring = str.substring(iLastIndexOf + 1);
            }
        }
        return strSubstring.contains("/") ? "" : strSubstring;
    }

    /* JADX INFO: renamed from: b */
    public static String m76215b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer("");
            for (int i11 = 0; i11 < bArrDigest.length; i11++) {
                int i12 = bArrDigest[i11];
                if (i12 < 0) {
                    i12 += 256;
                }
                if (i12 < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i12));
            }
            return stringBuffer.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m76216c(String str) {
        try {
            if (m76220g(str)) {
                LiteavLog.m76093w("CommonUtil", "URL has been encoded");
                return str;
            }
            byte[] bytes = str.getBytes("UTF-8");
            StringBuilder sb2 = new StringBuilder(bytes.length);
            for (int i11 = 0; i11 < bytes.length; i11++) {
                int i12 = bytes[i11];
                if (i12 < 0) {
                    i12 += 256;
                }
                if (i12 <= 32 || i12 >= 127 || i12 == 34 || i12 == 37 || i12 == 60 || i12 == 62 || i12 == 91 || i12 == 125 || i12 == 92 || i12 == 93 || i12 == 94 || i12 == 96 || i12 == 123 || i12 == 124) {
                    sb2.append(String.format("%%%02X", Integer.valueOf(i12)));
                } else {
                    sb2.append((char) i12);
                }
            }
            return sb2.toString();
        } catch (Exception e11) {
            LiteavLog.m76084e("CommonUtil", "tryEncodeUrl failed.", e11);
            return str;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m76218e(String str) {
        return new String(Base64.decode(str, 0));
    }

    /* JADX INFO: renamed from: g */
    private static boolean m76220g(String str) {
        if (str == null) {
            return true;
        }
        try {
            return !str.replace("+", C33627eb.f69716f).equals(URLDecoder.decode(str, "UTF-8").replace("+", C33627eb.f69716f));
        } catch (Exception e11) {
            LiteavLog.m76084e("CommonUtil", "isUrlEncoded error : ", e11);
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    private static boolean m76221h(String str) {
        int iIndexOf = str.indexOf("?");
        if (iIndexOf < 0) {
            return false;
        }
        String strSubstring = str.substring(iIndexOf);
        return !TextUtils.isEmpty(strSubstring) && strSubstring.toLowerCase().contains("exper");
    }

    /* JADX INFO: renamed from: d */
    public static String m76217d(String str) {
        String strM76215b = m76215b(str);
        String strM76212a = m76212a(str);
        if (!TextUtils.isEmpty(strM76212a)) {
            if (strM76212a.toLowerCase().endsWith("m3u8")) {
                return strM76215b + ".hls";
            }
            if (strM76212a.toLowerCase().endsWith("mp4") && !m76221h(str)) {
                strM76215b = m76215b(m76222i(str));
            }
            return strM76215b + C33978va.f72339h + strM76212a;
        }
        return strM76215b + ".auto";
    }

    /* JADX INFO: renamed from: f */
    public static boolean m76219f(String str) {
        if (!TextUtils.isEmpty(str) && str.contains("?") && !str.startsWith("http")) {
            String strM76217d = m76217d(str.substring(str.indexOf("?") + 1));
            if (!TextUtils.isEmpty(strM76217d)) {
                if (str.contains(strM76217d + "?")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    private static String m76222i(String str) {
        int iIndexOf;
        int iIndexOf2 = str.indexOf("voddrm.token.");
        if (iIndexOf2 >= 0 && (iIndexOf = str.indexOf(C33978va.f72339h, iIndexOf2 + 13)) >= 0 && iIndexOf < str.length() - 1) {
            str = str.substring(0, iIndexOf2) + str.substring(iIndexOf + 1);
        }
        int iIndexOf3 = str.indexOf("?");
        if (iIndexOf3 >= 0) {
            return str.substring(0, iIndexOf3);
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public static String m76213a(String str, String str2) {
        String path;
        int iLastIndexOf;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (TextUtils.isEmpty(str2) || (path = Uri.parse(str).getPath()) == null) {
            return str;
        }
        String[] strArrSplit = path.split("/");
        if (strArrSplit.length <= 0 || (iLastIndexOf = str.lastIndexOf(strArrSplit[strArrSplit.length - 1])) <= 0) {
            return str;
        }
        return str.substring(0, iLastIndexOf) + "voddrm.token." + str2 + C33978va.f72339h + str.substring(iLastIndexOf);
    }

    /* JADX INFO: renamed from: a */
    public static String m76214a(String str, String str2, String str3, int i11) {
        String str4;
        Uri uri = Uri.parse(str);
        String query = uri.getQuery();
        if (TextUtils.isEmpty(query)) {
            str4 = "";
        } else {
            str4 = query + "&";
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "plain";
        }
        return Uri.decode(uri.buildUpon().query(str4 + "spfileid=" + str2 + "&spdrmtype=" + str3 + "&spappid=" + i11).build().toString());
    }
}
