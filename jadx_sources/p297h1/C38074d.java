package p297h1;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.webkit.ProxyConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: h1.d */
/* JADX INFO: compiled from: KeyPath.java */
/* JADX INFO: loaded from: classes34.dex */
public class C38074d {

    /* JADX INFO: renamed from: c */
    public static final C38074d f85714c = new C38074d("COMPOSITION");

    /* JADX INFO: renamed from: a */
    public final List<String> f85715a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public InterfaceC38075e f85716b;

    public C38074d(String... strArr) {
        this.f85715a = Arrays.asList(strArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C38074d c38074d = (C38074d) obj;
            if (!this.f85715a.equals(c38074d.f85715a)) {
                return false;
            }
            InterfaceC38075e interfaceC38075e = this.f85716b;
            InterfaceC38075e interfaceC38075e2 = c38074d.f85716b;
            if (interfaceC38075e != null) {
                return interfaceC38075e.equals(interfaceC38075e2);
            }
            if (interfaceC38075e2 == null) {
                return true;
            }
        }
        return false;
    }

    @CheckResult
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: a */
    public C38074d m85965a(String str) {
        C38074d c38074d = new C38074d(this);
        c38074d.f85715a.add(str);
        return c38074d;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m85966b() {
        List<String> list = this.f85715a;
        return list.get(list.size() - 1).equals("**");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: c */
    public boolean m85967c(String str, int i11) {
        if (i11 >= this.f85715a.size()) {
            return false;
        }
        boolean z11 = i11 == this.f85715a.size() - 1;
        String str2 = this.f85715a.get(i11);
        if (!str2.equals("**")) {
            return (z11 || (i11 == this.f85715a.size() + (-2) && m85966b())) && (str2.equals(str) || str2.equals(ProxyConfig.MATCH_ALL_SCHEMES));
        }
        if (!z11 && this.f85715a.get(i11 + 1).equals(str)) {
            return i11 == this.f85715a.size() + (-2) || (i11 == this.f85715a.size() + (-3) && m85966b());
        }
        if (z11) {
            return true;
        }
        int i12 = i11 + 1;
        if (i12 < this.f85715a.size() - 1) {
            return false;
        }
        return this.f85715a.get(i12).equals(str);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: d */
    public InterfaceC38075e m85968d() {
        return this.f85716b;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m85970f(String str) {
        return "__container".equals(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: h */
    public boolean m85972h(String str, int i11) {
        return "__container".equals(str) || i11 < this.f85715a.size() - 1 || this.f85715a.get(i11).equals("**");
    }

    public int hashCode() {
        int iHashCode = this.f85715a.hashCode() * 31;
        InterfaceC38075e interfaceC38075e = this.f85716b;
        return iHashCode + (interfaceC38075e != null ? interfaceC38075e.hashCode() : 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: i */
    public C38074d m85973i(InterfaceC38075e interfaceC38075e) {
        C38074d c38074d = new C38074d(this);
        c38074d.f85716b = interfaceC38075e;
        return c38074d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPath{keys=");
        sb2.append(this.f85715a);
        sb2.append(",resolved=");
        sb2.append(this.f85716b != null);
        sb2.append('}');
        return sb2.toString();
    }

    public C38074d(C38074d c38074d) {
        this.f85715a = new ArrayList(c38074d.f85715a);
        this.f85716b = c38074d.f85716b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: e */
    public int m85969e(String str, int i11) {
        if (m85970f(str)) {
            return 0;
        }
        if (!this.f85715a.get(i11).equals("**")) {
            return 1;
        }
        if (i11 == this.f85715a.size() - 1 || !this.f85715a.get(i11 + 1).equals(str)) {
            return 0;
        }
        return 2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: g */
    public boolean m85971g(String str, int i11) {
        if (m85970f(str)) {
            return true;
        }
        if (i11 >= this.f85715a.size()) {
            return false;
        }
        if (this.f85715a.get(i11).equals(str) || this.f85715a.get(i11).equals("**") || this.f85715a.get(i11).equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
            return true;
        }
        return false;
    }
}
