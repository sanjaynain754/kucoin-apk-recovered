package xb0;

/* JADX INFO: renamed from: xb0.a */
/* JADX INFO: compiled from: Permission.java */
/* JADX INFO: loaded from: classes59.dex */
public class C46125a {

    /* JADX INFO: renamed from: a */
    public final String f103590a;

    /* JADX INFO: renamed from: b */
    public final boolean f103591b;

    /* JADX INFO: renamed from: c */
    public final boolean f103592c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C46125a c46125a = (C46125a) obj;
        if (this.f103591b == c46125a.f103591b && this.f103592c == c46125a.f103592c) {
            return this.f103590a.equals(c46125a.f103590a);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f103590a.hashCode() * 31) + (this.f103591b ? 1 : 0)) * 31) + (this.f103592c ? 1 : 0);
    }

    public String toString() {
        return "Permission{name='" + this.f103590a + "', granted=" + this.f103591b + ", shouldShowRequestPermissionRationale=" + this.f103592c + '}';
    }

    public C46125a(String str, boolean z11, boolean z12) {
        this.f103590a = str;
        this.f103591b = z11;
        this.f103592c = z12;
    }
}
