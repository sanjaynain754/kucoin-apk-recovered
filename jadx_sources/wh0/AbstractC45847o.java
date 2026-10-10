package wh0;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: wh0.o */
/* JADX INFO: compiled from: StringUtils.java */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC45847o {

    /* JADX INFO: renamed from: a */
    public static final String[] f103318a = new String[0];

    /* JADX INFO: renamed from: d */
    public static String[] m101268d(String str, String str2) {
        return m101269e(str, str2, null);
    }

    /* JADX INFO: renamed from: a */
    public static String[] m101265a(String str) {
        return m101268d(str, ",");
    }

    /* JADX INFO: renamed from: e */
    public static String[] m101269e(String str, String str2, String str3) {
        if (str == null) {
            return f103318a;
        }
        if (str2 == null) {
            return new String[]{str};
        }
        ArrayList arrayList = new ArrayList();
        int length = 0;
        if (str2.isEmpty()) {
            while (length < str.length()) {
                int i11 = length + 1;
                arrayList.add(m101267c(str.substring(length, i11), str3));
                length = i11;
            }
        } else {
            while (true) {
                int iIndexOf = str.indexOf(str2, length);
                if (iIndexOf == -1) {
                    break;
                }
                arrayList.add(m101267c(str.substring(length, iIndexOf), str3));
                length = str2.length() + iIndexOf;
            }
            if (str.length() > 0 && length <= str.length()) {
                arrayList.add(m101267c(str.substring(length), str3));
            }
        }
        return m101272h(arrayList);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m101270f(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m101271g(String str) {
        return (str == null || str.isEmpty() || !m101266b(str)) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m101266b(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!Character.isWhitespace(charSequence.charAt(i11))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static String m101267c(String str, String str2) {
        if (m101270f(str) && m101270f(str2)) {
            char[] cArr = new char[str.length()];
            int i11 = 0;
            for (int i12 = 0; i12 < str.length(); i12++) {
                char cCharAt = str.charAt(i12);
                if (str2.indexOf(cCharAt) == -1) {
                    cArr[i11] = cCharAt;
                    i11++;
                }
            }
            if (i11 == str.length()) {
                return str;
            }
            return new String(cArr, 0, i11);
        }
        return str;
    }

    /* JADX INFO: renamed from: h */
    public static String[] m101272h(Collection<String> collection) {
        if (!AbstractC45839g.m101260c(collection)) {
            return (String[]) collection.toArray(f103318a);
        }
        return f103318a;
    }

    /* JADX INFO: renamed from: i */
    public static String m101273i(String str, Charset charset) {
        int length = str.length();
        if (length != 0) {
            AbstractC45833a.m101250a(charset, "Charset must not be null");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
            int i11 = 0;
            boolean z11 = false;
            while (i11 < length) {
                char cCharAt = str.charAt(i11);
                if (cCharAt == '%') {
                    int i12 = i11 + 2;
                    if (i12 < length) {
                        char cCharAt2 = str.charAt(i11 + 1);
                        char cCharAt3 = str.charAt(i12);
                        int iDigit = Character.digit(cCharAt2, 16);
                        int iDigit2 = Character.digit(cCharAt3, 16);
                        if (iDigit != -1 && iDigit2 != -1) {
                            byteArrayOutputStream.write((char) ((iDigit << 4) + iDigit2));
                            i11 = i12;
                            z11 = true;
                        } else {
                            throw new IllegalArgumentException("Invalid encoded sequence \"" + str.substring(i11) + "\"");
                        }
                    } else {
                        throw new IllegalArgumentException("Invalid encoded sequence \"" + str.substring(i11) + "\"");
                    }
                } else {
                    byteArrayOutputStream.write(cCharAt);
                }
                i11++;
            }
            if (z11) {
                return AbstractC45846n.m101264a(byteArrayOutputStream, charset);
            }
            return str;
        }
        return str;
    }
}
