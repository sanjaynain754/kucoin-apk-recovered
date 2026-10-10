package hh0;

import com.tencent.bugly.proguard.C33627eb;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: hh0.a */
/* JADX INFO: compiled from: Escaping.java */
/* JADX INFO: loaded from: classes61.dex */
public class C38209a {

    /* JADX INFO: renamed from: a */
    public static final Pattern f85904a = Pattern.compile("[\\\\&]");

    /* JADX INFO: renamed from: b */
    public static final Pattern f85905b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* JADX INFO: renamed from: c */
    public static final Pattern f85906c = Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");

    /* JADX INFO: renamed from: d */
    public static final char[] f85907d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: e */
    public static final Pattern f85908e = Pattern.compile("[ \t\r\n]+");

    /* JADX INFO: renamed from: f */
    public static final c f85909f = new a();

    /* JADX INFO: renamed from: g */
    public static final c f85910g = new b();

    /* JADX INFO: renamed from: hh0.a$a */
    /* JADX INFO: compiled from: Escaping.java */
    public static class a implements c {
        @Override // hh0.C38209a.c
        /* JADX INFO: renamed from: a */
        public void mo86208a(String str, StringBuilder sb2) {
            if (str.charAt(0) == '\\') {
                sb2.append((CharSequence) str, 1, str.length());
            } else {
                sb2.append(C38210b.m86209a(str));
            }
        }
    }

    /* JADX INFO: renamed from: hh0.a$b */
    /* JADX INFO: compiled from: Escaping.java */
    public static class b implements c {
        @Override // hh0.C38209a.c
        /* JADX INFO: renamed from: a */
        public void mo86208a(String str, StringBuilder sb2) {
            if (str.startsWith("%")) {
                if (str.length() == 3) {
                    sb2.append(str);
                    return;
                } else {
                    sb2.append("%25");
                    sb2.append((CharSequence) str, 1, str.length());
                    return;
                }
            }
            for (byte b11 : str.getBytes(Charset.forName("UTF-8"))) {
                sb2.append('%');
                sb2.append(C38209a.f85907d[(b11 >> 4) & 15]);
                sb2.append(C38209a.f85907d[b11 & 15]);
            }
        }
    }

    /* JADX INFO: renamed from: hh0.a$c */
    /* JADX INFO: compiled from: Escaping.java */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo86208a(String str, StringBuilder sb2);
    }

    /* JADX INFO: renamed from: e */
    public static String m86207e(String str) {
        return f85904a.matcher(str).find() ? m86206d(f85905b, str, f85909f) : str;
    }

    /* JADX INFO: renamed from: b */
    public static String m86204b(String str) {
        return f85908e.matcher(str.trim().toLowerCase(Locale.ROOT)).replaceAll(C33627eb.f69716f);
    }

    /* JADX INFO: renamed from: c */
    public static String m86205c(String str) {
        return m86204b(str.substring(1, str.length() - 1));
    }

    /* JADX INFO: renamed from: d */
    public static String m86206d(Pattern pattern, String str, c cVar) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 16);
        int iEnd = 0;
        do {
            sb2.append((CharSequence) str, iEnd, matcher.start());
            cVar.mo86208a(matcher.group(), sb2);
            iEnd = matcher.end();
        } while (matcher.find());
        if (iEnd != str.length()) {
            sb2.append((CharSequence) str, iEnd, str.length());
        }
        return sb2.toString();
    }
}
