package oh0;

import com.tencent.bugly.proguard.C33627eb;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import nh0.C42841b;

/* JADX INFO: renamed from: oh0.c */
/* JADX INFO: compiled from: StringUtil.java */
/* JADX INFO: loaded from: classes61.dex */
public final class C43093c {

    /* JADX INFO: renamed from: a */
    public static final String[] f95290a = {"", C33627eb.f69716f, "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};

    /* JADX INFO: renamed from: b */
    public static final Stack<StringBuilder> f95291b = new Stack<>();

    /* JADX INFO: renamed from: c */
    public static boolean m94684c(String str, String... strArr) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m94687f(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i11 = 0; i11 < length; i11++) {
                if (!m94690i(str.codePointAt(i11))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m94689h(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!Character.isDigit(str.codePointAt(i11))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static StringBuilder m94683b() {
        StringBuilder sb2;
        Stack<StringBuilder> stack = f95291b;
        synchronized (stack) {
            try {
                sb2 = stack.empty() ? new StringBuilder(8192) : stack.pop();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sb2;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m94686e(int i11) {
        return i11 == 32 || i11 == 9 || i11 == 10 || i11 == 12 || i11 == 13 || i11 == 160;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m94688g(int i11) {
        return i11 == 8203 || i11 == 173;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m94690i(int i11) {
        return i11 == 32 || i11 == 9 || i11 == 10 || i11 == 12 || i11 == 13;
    }

    /* JADX INFO: renamed from: l */
    public static String m94693l(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("width must be > 0");
        }
        String[] strArr = f95290a;
        if (i11 < strArr.length) {
            return strArr[i11];
        }
        char[] cArr = new char[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            cArr[i12] = ' ';
        }
        return String.valueOf(cArr);
    }

    /* JADX INFO: renamed from: n */
    public static String m94695n(String str, String str2) {
        try {
            try {
                return m94696o(new URL(str), str2).toExternalForm();
            } catch (MalformedURLException unused) {
                return new URL(str2).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            return "";
        }
    }

    /* JADX INFO: renamed from: o */
    public static URL m94696o(URL url, String str) throws MalformedURLException {
        if (str.startsWith("?")) {
            str = url.getPath() + str;
        }
        if (str.indexOf(46) == 0 && url.getFile().indexOf(47) != 0) {
            url = new URL(url.getProtocol(), url.getHost(), url.getPort(), "/" + url.getFile());
        }
        return new URL(url, str);
    }

    /* JADX INFO: renamed from: a */
    public static void m94682a(StringBuilder sb2, String str, boolean z11) {
        int length = str.length();
        int iCharCount = 0;
        boolean z12 = false;
        boolean z13 = false;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (m94686e(iCodePointAt)) {
                if ((!z11 || z12) && !z13) {
                    sb2.append(' ');
                    z13 = true;
                }
            } else if (!m94688g(iCodePointAt)) {
                sb2.appendCodePoint(iCodePointAt);
                z13 = false;
                z12 = true;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m94685d(String str, String[] strArr) {
        if (Arrays.binarySearch(strArr, str) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static String m94691j(Collection collection, String str) {
        return m94692k(collection.iterator(), str);
    }

    /* JADX INFO: renamed from: k */
    public static String m94692k(Iterator it, String str) {
        if (!it.hasNext()) {
            return "";
        }
        String string = it.next().toString();
        if (!it.hasNext()) {
            return string;
        }
        StringBuilder sbM94683b = m94683b();
        sbM94683b.append(string);
        while (it.hasNext()) {
            sbM94683b.append(str);
            sbM94683b.append(it.next());
        }
        return m94694m(sbM94683b);
    }

    /* JADX INFO: renamed from: m */
    public static String m94694m(StringBuilder sb2) {
        C42841b.m93957i(sb2);
        String string = sb2.toString();
        if (sb2.length() > 8192) {
            sb2 = new StringBuilder(8192);
        } else {
            sb2.delete(0, sb2.length());
        }
        Stack<StringBuilder> stack = f95291b;
        synchronized (stack) {
            try {
                stack.push(sb2);
                while (true) {
                    Stack<StringBuilder> stack2 = f95291b;
                    if (stack2.size() > 8) {
                        stack2.pop();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }
}
