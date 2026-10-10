package vh0;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.util.LinkedMultiValueMap;
import wh0.AbstractC45839g;
import wh0.AbstractC45847o;
import wh0.InterfaceC45841i;

/* JADX INFO: renamed from: vh0.a */
/* JADX INFO: compiled from: DefaultPathContainer.java */
/* JADX INFO: loaded from: classes61.dex */
public final class C45552a implements InterfaceC45553b {

    /* JADX INFO: renamed from: c */
    public static final InterfaceC45553b f102643c = new C45552a("", Collections.EMPTY_LIST);

    /* JADX INFO: renamed from: d */
    public static final Map<Character, b> f102644d;

    /* JADX INFO: renamed from: a */
    public final String f102645a;

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC45553b.a> f102646b;

    /* JADX INFO: renamed from: vh0.a$a */
    /* JADX INFO: compiled from: DefaultPathContainer.java */
    public static final class a implements InterfaceC45553b.c {

        /* JADX INFO: renamed from: d */
        public static final InterfaceC45841i<String, String> f102647d = AbstractC45839g.m101263f(new LinkedMultiValueMap());

        /* JADX INFO: renamed from: a */
        public final String f102648a;

        /* JADX INFO: renamed from: b */
        public final String f102649b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC45841i<String, String> f102650c;

        /* JADX INFO: renamed from: c */
        public static a m100597c(String str, String str2) {
            return new a(str, str2, f102647d);
        }

        /* JADX INFO: renamed from: d */
        public static a m100598d(String str, String str2, InterfaceC45841i<String, String> interfaceC45841i) {
            return new a(str, str2, AbstractC45839g.m101263f(interfaceC45841i));
        }

        @Override // vh0.InterfaceC45553b.c
        /* JADX INFO: renamed from: a */
        public String mo100600a() {
            return this.f102649b;
        }

        @Override // vh0.InterfaceC45553b.c
        /* JADX INFO: renamed from: b */
        public InterfaceC45841i<String, String> mo100601b() {
            return this.f102650c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof InterfaceC45553b.c) {
                return value().equals(((InterfaceC45553b.c) obj).value());
            }
            return false;
        }

        public int hashCode() {
            return this.f102648a.hashCode();
        }

        public String toString() {
            return "[value='" + this.f102648a + "']";
        }

        @Override // vh0.InterfaceC45553b.a
        public String value() {
            return this.f102648a;
        }

        public a(String str, String str2, InterfaceC45841i<String, String> interfaceC45841i) {
            this.f102648a = str;
            this.f102649b = str2;
            this.f102650c = interfaceC45841i;
        }

        /* JADX INFO: renamed from: e */
        public static a m100599e(String str, b bVar) {
            String strReplaceAll;
            if (str.contains(bVar.m100602c())) {
                strReplaceAll = str.replaceAll(bVar.m100602c(), bVar.value());
            } else {
                strReplaceAll = str;
            }
            return m100597c(str, strReplaceAll);
        }
    }

    /* JADX INFO: renamed from: vh0.a$b */
    /* JADX INFO: compiled from: DefaultPathContainer.java */
    public static class b implements InterfaceC45553b.d {

        /* JADX INFO: renamed from: a */
        public final String f102651a;

        /* JADX INFO: renamed from: b */
        public final String f102652b;

        /* JADX INFO: renamed from: c */
        public String m100602c() {
            return this.f102652b;
        }

        @Override // vh0.InterfaceC45553b.a
        public String value() {
            return this.f102651a;
        }

        public b(char c11, String str) {
            this.f102651a = String.valueOf(c11);
            this.f102652b = str;
        }
    }

    static {
        HashMap map = new HashMap(2);
        f102644d = map;
        map.put('/', new b('/', "%2F"));
        map.put('.', new b('.', "%2E"));
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC45553b.c m100593d(String str) {
        Charset charset = StandardCharsets.UTF_8;
        int iIndexOf = str.indexOf(59);
        return iIndexOf == -1 ? a.m100597c(str, AbstractC45847o.m101273i(str, charset)) : a.m100598d(str, AbstractC45847o.m101273i(str.substring(0, iIndexOf), charset), m100595f(str.substring(iIndexOf), charset));
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC45841i<String, String> m100595f(String str, Charset charset) {
        LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
        int i11 = 1;
        while (i11 < str.length()) {
            int iIndexOf = str.indexOf(59, i11);
            m100594e(iIndexOf != -1 ? str.substring(i11, iIndexOf) : str.substring(i11), charset, linkedMultiValueMap);
            if (iIndexOf == -1) {
                break;
            }
            i11 = iIndexOf + 1;
        }
        return linkedMultiValueMap;
    }

    @Override // vh0.InterfaceC45553b
    /* JADX INFO: renamed from: a */
    public List<InterfaceC45553b.a> mo100596a() {
        return this.f102646b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InterfaceC45553b) {
            return value().equals(((InterfaceC45553b) obj).value());
        }
        return false;
    }

    public int hashCode() {
        return this.f102645a.hashCode();
    }

    @Override // vh0.InterfaceC45553b
    public String value() {
        return this.f102645a;
    }

    public C45552a(String str, List<InterfaceC45553b.a> list) {
        this.f102645a = str;
        this.f102646b = Collections.unmodifiableList(list);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC45553b m100592c(String str, InterfaceC45553b.b bVar) {
        String strSubstring;
        InterfaceC45553b.c cVarM100599e;
        if (str.isEmpty()) {
            return f102643c;
        }
        char cM100605b = bVar.m100605b();
        b bVar2 = f102644d.get(Character.valueOf(cM100605b));
        if (bVar2 != null) {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            if (str.charAt(0) == cM100605b) {
                arrayList.add(bVar2);
                i11 = 1;
            }
            while (i11 < str.length()) {
                int iIndexOf = str.indexOf(cM100605b, i11);
                if (iIndexOf != -1) {
                    strSubstring = str.substring(i11, iIndexOf);
                } else {
                    strSubstring = str.substring(i11);
                }
                if (!strSubstring.isEmpty()) {
                    if (bVar.m100606c()) {
                        cVarM100599e = m100593d(strSubstring);
                    } else {
                        cVarM100599e = a.m100599e(strSubstring, bVar2);
                    }
                    arrayList.add(cVarM100599e);
                }
                if (iIndexOf == -1) {
                    break;
                }
                arrayList.add(bVar2);
                i11 = iIndexOf + 1;
            }
            return new C45552a(str, arrayList);
        }
        throw new IllegalArgumentException("Unexpected separator: '" + cM100605b + "'");
    }

    /* JADX INFO: renamed from: e */
    public static void m100594e(String str, Charset charset, InterfaceC45841i<String, String> interfaceC45841i) {
        if (AbstractC45847o.m101271g(str)) {
            int iIndexOf = str.indexOf(61);
            if (iIndexOf != -1) {
                String strM101273i = AbstractC45847o.m101273i(str.substring(0, iIndexOf), charset);
                if (AbstractC45847o.m101271g(strM101273i)) {
                    for (String str2 : AbstractC45847o.m101265a(str.substring(iIndexOf + 1))) {
                        interfaceC45841i.add(strM101273i, AbstractC45847o.m101273i(str2, charset));
                    }
                    return;
                }
                return;
            }
            if (AbstractC45847o.m101271g(AbstractC45847o.m101273i(str, charset))) {
                interfaceC45841i.add(str, "");
            }
        }
    }

    public String toString() {
        return value();
    }
}
