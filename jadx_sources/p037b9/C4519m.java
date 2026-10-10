package p037b9;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: b9.m */
/* JADX INFO: compiled from: Size.java */
/* JADX INFO: loaded from: classes56.dex */
public class C4519m implements Comparable<C4519m> {

    /* JADX INFO: renamed from: b */
    public final int f3949b;

    /* JADX INFO: renamed from: c */
    public final int f3950c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C4519m c4519m = (C4519m) obj;
            if (this.f3949b == c4519m.f3949b && this.f3950c == c4519m.f3950c) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull C4519m c4519m) {
        int i11 = this.f3950c * this.f3949b;
        int i12 = c4519m.f3950c * c4519m.f3949b;
        if (i12 < i11) {
            return 1;
        }
        return i12 > i11 ? -1 : 0;
    }

    /* JADX INFO: renamed from: b */
    public C4519m m4351b() {
        return new C4519m(this.f3950c, this.f3949b);
    }

    /* JADX INFO: renamed from: c */
    public C4519m m4352c(C4519m c4519m) {
        int i11 = this.f3949b;
        int i12 = c4519m.f3950c;
        int i13 = i11 * i12;
        int i14 = c4519m.f3949b;
        int i15 = this.f3950c;
        return i13 <= i14 * i15 ? new C4519m(i14, (i15 * i14) / i11) : new C4519m((i11 * i12) / i15, i12);
    }

    /* JADX INFO: renamed from: d */
    public C4519m m4353d(C4519m c4519m) {
        int i11 = this.f3949b;
        int i12 = c4519m.f3950c;
        int i13 = i11 * i12;
        int i14 = c4519m.f3949b;
        int i15 = this.f3950c;
        return i13 >= i14 * i15 ? new C4519m(i14, (i15 * i14) / i11) : new C4519m((i11 * i12) / i15, i12);
    }

    public int hashCode() {
        return (this.f3949b * 31) + this.f3950c;
    }

    public String toString() {
        return this.f3949b + "x" + this.f3950c;
    }

    public C4519m(int i11, int i12) {
        this.f3949b = i11;
        this.f3950c = i12;
    }
}
