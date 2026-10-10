package p817z1;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: z1.j */
/* JADX INFO: compiled from: LazyHeaders.java */
/* JADX INFO: loaded from: classes.dex */
public final class C46631j implements InterfaceC46629h {

    /* JADX INFO: renamed from: c */
    public final Map<String, List<InterfaceC46630i>> f104408c;

    /* JADX INFO: renamed from: d */
    public volatile Map<String, String> f104409d;

    /* JADX INFO: renamed from: z1.j$a */
    /* JADX INFO: compiled from: LazyHeaders.java */
    public static final class a {

        /* JADX INFO: renamed from: d */
        public static final String f104410d;

        /* JADX INFO: renamed from: e */
        public static final Map<String, List<InterfaceC46630i>> f104411e;

        /* JADX INFO: renamed from: a */
        public boolean f104412a = true;

        /* JADX INFO: renamed from: b */
        public Map<String, List<InterfaceC46630i>> f104413b = f104411e;

        /* JADX INFO: renamed from: c */
        public boolean f104414c = true;

        /* JADX INFO: renamed from: c */
        public C46631j m102834c() {
            this.f104412a = true;
            return new C46631j(this.f104413b);
        }

        @VisibleForTesting
        /* JADX INFO: renamed from: g */
        public static String m102831g() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i11 = 0; i11 < length; i11++) {
                char cCharAt = property.charAt(i11);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append('?');
                }
            }
            return sb2.toString();
        }

        /* JADX INFO: renamed from: a */
        public a m102832a(@NonNull String str, @NonNull String str2) {
            return m102833b(str, new b(str2));
        }

        /* JADX INFO: renamed from: b */
        public a m102833b(@NonNull String str, @NonNull InterfaceC46630i interfaceC46630i) {
            if (this.f104414c && "User-Agent".equalsIgnoreCase(str)) {
                return m102838h(str, interfaceC46630i);
            }
            m102836e();
            m102837f(str).add(interfaceC46630i);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final Map<String, List<InterfaceC46630i>> m102835d() {
            HashMap map = new HashMap(this.f104413b.size());
            for (Map.Entry<String, List<InterfaceC46630i>> entry : this.f104413b.entrySet()) {
                map.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            return map;
        }

        /* JADX INFO: renamed from: e */
        public final void m102836e() {
            if (this.f104412a) {
                this.f104412a = false;
                this.f104413b = m102835d();
            }
        }

        /* JADX INFO: renamed from: f */
        public final List<InterfaceC46630i> m102837f(String str) {
            List<InterfaceC46630i> list = this.f104413b.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.f104413b.put(str, arrayList);
            return arrayList;
        }

        static {
            String strM102831g = m102831g();
            f104410d = strM102831g;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strM102831g)) {
                map.put("User-Agent", Collections.singletonList(new b(strM102831g)));
            }
            f104411e = Collections.unmodifiableMap(map);
        }

        /* JADX INFO: renamed from: h */
        public a m102838h(@NonNull String str, @Nullable InterfaceC46630i interfaceC46630i) {
            m102836e();
            if (interfaceC46630i == null) {
                this.f104413b.remove(str);
            } else {
                List<InterfaceC46630i> listM102837f = m102837f(str);
                listM102837f.clear();
                listM102837f.add(interfaceC46630i);
            }
            if (this.f104414c && "User-Agent".equalsIgnoreCase(str)) {
                this.f104414c = false;
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: z1.j$b */
    /* JADX INFO: compiled from: LazyHeaders.java */
    public static final class b implements InterfaceC46630i {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final String f104415a;

        @Override // p817z1.InterfaceC46630i
        /* JADX INFO: renamed from: a */
        public String mo102828a() {
            return this.f104415a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f104415a.equals(((b) obj).f104415a);
            }
            return false;
        }

        public int hashCode() {
            return this.f104415a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f104415a + "'}";
        }

        public b(@NonNull String str) {
            this.f104415a = str;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public final String m102829a(@NonNull List<InterfaceC46630i> list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            String strMo102828a = list.get(i11).mo102828a();
            if (!TextUtils.isEmpty(strMo102828a)) {
                sb2.append(strMo102828a);
                if (i11 != list.size() - 1) {
                    sb2.append(',');
                }
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public final Map<String, String> m102830b() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<InterfaceC46630i>> entry : this.f104408c.entrySet()) {
            String strM102829a = m102829a(entry.getValue());
            if (!TextUtils.isEmpty(strM102829a)) {
                map.put(entry.getKey(), strM102829a);
            }
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C46631j) {
            return this.f104408c.equals(((C46631j) obj).f104408c);
        }
        return false;
    }

    @Override // p817z1.InterfaceC46629h
    public Map<String, String> getHeaders() {
        if (this.f104409d == null) {
            synchronized (this) {
                try {
                    if (this.f104409d == null) {
                        this.f104409d = Collections.unmodifiableMap(m102830b());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f104409d;
    }

    public int hashCode() {
        return this.f104408c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f104408c + '}';
    }

    public C46631j(Map<String, List<InterfaceC46630i>> map) {
        this.f104408c = Collections.unmodifiableMap(map);
    }
}
