package p749x5;

/* JADX INFO: renamed from: x5.m */
/* JADX INFO: compiled from: ImmutableQualityInfo.java */
/* JADX INFO: loaded from: classes34.dex */
public class C46079m implements InterfaceC46080n {

    /* JADX INFO: renamed from: d */
    public static final InterfaceC46080n f103527d = m101588d(Integer.MAX_VALUE, true, true);

    /* JADX INFO: renamed from: a */
    public int f103528a;

    /* JADX INFO: renamed from: b */
    public boolean f103529b;

    /* JADX INFO: renamed from: c */
    public boolean f103530c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C46079m)) {
            return false;
        }
        C46079m c46079m = (C46079m) obj;
        return this.f103528a == c46079m.f103528a && this.f103529b == c46079m.f103529b && this.f103530c == c46079m.f103530c;
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC46080n m101588d(int i11, boolean z11, boolean z12) {
        return new C46079m(i11, z11, z12);
    }

    @Override // p749x5.InterfaceC46080n
    /* JADX INFO: renamed from: a */
    public boolean mo101589a() {
        return this.f103530c;
    }

    @Override // p749x5.InterfaceC46080n
    /* JADX INFO: renamed from: b */
    public boolean mo101590b() {
        return this.f103529b;
    }

    @Override // p749x5.InterfaceC46080n
    /* JADX INFO: renamed from: c */
    public int mo101591c() {
        return this.f103528a;
    }

    public int hashCode() {
        return (this.f103528a ^ (this.f103529b ? 4194304 : 0)) ^ (this.f103530c ? 8388608 : 0);
    }

    public C46079m(int i11, boolean z11, boolean z12) {
        this.f103528a = i11;
        this.f103529b = z11;
        this.f103530c = z12;
    }
}
