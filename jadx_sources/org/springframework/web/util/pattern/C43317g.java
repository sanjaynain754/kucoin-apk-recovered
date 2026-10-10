package org.springframework.web.util.pattern;

import androidx.webkit.ProxyConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import vh0.InterfaceC45553b;
import wh0.InterfaceC45841i;

/* JADX INFO: renamed from: org.springframework.web.util.pattern.g */
/* JADX INFO: compiled from: RegexPathElement.java */
/* JADX INFO: loaded from: classes61.dex */
public class C43317g extends AbstractC43315e {

    /* JADX INFO: renamed from: k */
    public static final Pattern f95631k = Pattern.compile("\\?|\\*|\\{((?:\\{[^/]+?\\}|[^/{}]|\\\\[{}])+?)\\}");

    /* JADX INFO: renamed from: f */
    public final char[] f95632f;

    /* JADX INFO: renamed from: g */
    public final boolean f95633g;

    /* JADX INFO: renamed from: h */
    public final Pattern f95634h;

    /* JADX INFO: renamed from: i */
    public int f95635i;

    /* JADX INFO: renamed from: j */
    public final List<String> f95636j;

    @Override // org.springframework.web.util.pattern.AbstractC43315e
    /* JADX INFO: renamed from: a */
    public int mo95318a() {
        return this.f95636j.size();
    }

    @Override // org.springframework.web.util.pattern.AbstractC43315e
    /* JADX INFO: renamed from: b */
    public int mo95319b() {
        Iterator<String> it = this.f95636j.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += it.next().length();
        }
        return (this.f95632f.length - length) - this.f95636j.size();
    }

    /* JADX INFO: renamed from: f */
    public Pattern m95356f(char[] cArr, char[] cArr2) {
        StringBuilder sb2 = new StringBuilder();
        String str = new String(cArr);
        Matcher matcher = f95631k.matcher(str);
        int iEnd = 0;
        while (matcher.find()) {
            sb2.append(m95359i(str, iEnd, matcher.start()));
            String strGroup = matcher.group();
            if ("?".equals(strGroup)) {
                sb2.append('.');
            } else if (ProxyConfig.MATCH_ALL_SCHEMES.equals(strGroup)) {
                sb2.append(".*");
                int iStart = matcher.start();
                if (iStart < 1 || str.charAt(iStart - 1) != '.') {
                    this.f95635i++;
                }
            } else if (strGroup.startsWith("{") && strGroup.endsWith("}")) {
                int iIndexOf = strGroup.indexOf(58);
                if (iIndexOf == -1) {
                    sb2.append("(.*)");
                    String strGroup2 = matcher.group(1);
                    if (this.f95636j.contains(strGroup2)) {
                        throw new PatternParseException(this.f95602a, cArr2, PatternParseException.PatternMessage.ILLEGAL_DOUBLE_CAPTURE, strGroup2);
                    }
                    this.f95636j.add(strGroup2);
                } else {
                    String strSubstring = strGroup.substring(iIndexOf + 1, strGroup.length() - 1);
                    sb2.append('(');
                    sb2.append(strSubstring);
                    sb2.append(')');
                    String strSubstring2 = strGroup.substring(1, iIndexOf);
                    if (this.f95636j.contains(strSubstring2)) {
                        throw new PatternParseException(this.f95602a, cArr2, PatternParseException.PatternMessage.ILLEGAL_DOUBLE_CAPTURE, strSubstring2);
                    }
                    this.f95636j.add(strSubstring2);
                }
            }
            iEnd = matcher.end();
        }
        sb2.append(m95359i(str, iEnd, str.length()));
        return Pattern.compile(sb2.toString(), (this.f95633g ? 0 : 2) | 32);
    }

    /* JADX INFO: renamed from: g */
    public List<String> m95357g() {
        return this.f95636j;
    }

    /* JADX INFO: renamed from: h */
    public int m95358h() {
        return this.f95635i;
    }

    /* JADX INFO: renamed from: i */
    public final String m95359i(String str, int i11, int i12) {
        return i11 == i12 ? "" : Pattern.quote(str.substring(i11, i12));
    }

    public String toString() {
        return "Regex(" + String.valueOf(this.f95632f) + ")";
    }

    public C43317g(int i11, char[] cArr, boolean z11, char[] cArr2, char c11) {
        super(i11, c11);
        this.f95636j = new ArrayList();
        this.f95632f = cArr;
        this.f95633g = z11;
        this.f95634h = m95356f(cArr, cArr2);
    }

    @Override // org.springframework.web.util.pattern.AbstractC43315e
    /* JADX INFO: renamed from: c */
    public int mo95322c() {
        return mo95318a() + (m95358h() * 100);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    @Override // org.springframework.web.util.pattern.AbstractC43315e
    /* JADX INFO: renamed from: e */
    public boolean mo95320e(int i11, C43316f.a aVar) {
        InterfaceC45841i<String, String> interfaceC45841iMo100601b;
        boolean z11;
        String strM95352d = aVar.m95352d(i11);
        Matcher matcher = this.f95634h.matcher(strM95352d);
        boolean zMatches = matcher.matches();
        if (zMatches) {
            if (m95333d()) {
                if (aVar.f95625g && (this.f95636j.isEmpty() || strM95352d.length() > 0)) {
                    aVar.f95626h = i11 + 1;
                } else {
                    int i12 = i11 + 1;
                    if (i12 >= aVar.f95621c && (this.f95636j.isEmpty() || strM95352d.length() > 0)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11 && aVar.m95350b()) {
                        if ((!this.f95636j.isEmpty() && strM95352d.length() <= 0) || i11 + 2 < aVar.f95621c || !aVar.m95351c(i12)) {
                            zMatches = false;
                        }
                    } else {
                        zMatches = z11;
                    }
                }
                zMatches = true;
            } else {
                AbstractC43315e abstractC43315e = this.f95604c;
                if (abstractC43315e != null && abstractC43315e.mo95320e(i11 + 1, aVar)) {
                    zMatches = true;
                } else {
                    zMatches = false;
                }
            }
        }
        if (zMatches && aVar.f95624f) {
            if (this.f95636j.size() == matcher.groupCount()) {
                for (int i13 = 1; i13 <= matcher.groupCount(); i13++) {
                    String str = this.f95636j.get(i13 - 1);
                    String strGroup = matcher.group(i13);
                    if (i13 == this.f95636j.size()) {
                        interfaceC45841iMo100601b = ((InterfaceC45553b.c) aVar.f95620b.get(i11)).mo100601b();
                    } else {
                        interfaceC45841iMo100601b = AbstractC43315e.f95601e;
                    }
                    aVar.m95353e(str, strGroup, interfaceC45841iMo100601b);
                }
            } else {
                throw new IllegalArgumentException("The number of capturing groups in the pattern segment " + this.f95634h + " does not match the number of URI template variables it defines, which can occur if capturing groups are used in a URI template regex. Use non-capturing groups instead.");
            }
        }
        return zMatches;
    }
}
