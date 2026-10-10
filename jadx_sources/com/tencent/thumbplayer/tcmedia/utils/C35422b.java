package com.tencent.thumbplayer.tcmedia.utils;

import android.text.TextUtils;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.bugly.proguard.C33978va;
import java.security.MessageDigest;
import java.util.Collection;
import java.util.Map;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.utils.b */
/* JADX INFO: loaded from: classes64.dex */
public class C35422b {
    /* JADX INFO: renamed from: a */
    public static int m78842a(String str, int i11) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e11) {
                TPLogUtil.m78798e("TPCommonUtils", e11);
            }
        }
        return i11;
    }

    /* JADX INFO: renamed from: a */
    public static String m78843a(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb2 = new StringBuilder(40);
            for (byte b11 : bArrDigest) {
                int i11 = b11 & 255;
                if ((i11 >> 4) == 0) {
                    sb2.append("0");
                }
                sb2.append(Integer.toHexString(i11));
            }
            return sb2.toString();
        } catch (Exception e11) {
            TPLogUtil.m78797e("TPCommonUtils", e11.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m78844a(Object obj, String str) {
        if (obj == null) {
            if (TextUtils.isEmpty(str)) {
                str = "this argument should not be null!";
            }
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    /* JADX INFO: renamed from: b */
    public static String m78847b(String str) {
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
        if (strSubstring.contains("/")) {
            return "";
        }
        return strSubstring;
    }

    /* JADX INFO: renamed from: c */
    public static String m78848c(String str) {
        String strM78843a = m78843a(str);
        String strM78847b = m78847b(str);
        if (!TextUtils.isEmpty(strM78847b)) {
            if (strM78847b.toLowerCase().endsWith("m3u8")) {
                return strM78843a + ".hls";
            }
            return strM78843a + C33978va.f72339h + strM78847b;
        }
        return strM78843a + ".auto";
    }

    /* JADX INFO: renamed from: d */
    public static boolean m78849d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return str.split(C33844oi.f71346o)[0].matches("^((https|http|ftp|rtsp|mms)?)");
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m78845a(Collection<? extends Object> collection) {
        return collection == null || collection.size() <= 0;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m78846a(Map<? extends Object, ? extends Object> map) {
        return map == null || map.size() <= 0;
    }
}
