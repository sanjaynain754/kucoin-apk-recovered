package ue0;

/* JADX INFO: renamed from: ue0.p */
/* JADX INFO: compiled from: SizeScaler.java */
/* JADX INFO: loaded from: classes60.dex */
public class C45209p {

    /* JADX INFO: renamed from: a */
    public final float f101726a;

    /* JADX INFO: renamed from: ue0.p$a */
    /* JADX INFO: compiled from: SizeScaler.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f101727a;

        /* JADX INFO: renamed from: b */
        public final int f101728b;

        /* JADX INFO: renamed from: c */
        public final float f101729c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f101727a == aVar.f101727a && this.f101728b == aVar.f101728b && Float.compare(aVar.f101729c, this.f101729c) == 0) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i11 = ((this.f101727a * 31) + this.f101728b) * 31;
            float f11 = this.f101729c;
            return i11 + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }

        public String toString() {
            return "Size{width=" + this.f101727a + ", height=" + this.f101728b + ", scaleFactor=" + this.f101729c + '}';
        }

        public a(int i11, int i12, float f11) {
            this.f101727a = i11;
            this.f101728b = i12;
            this.f101729c = f11;
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m99882b(int i11, int i12) {
        return m99881a((float) i12) == 0 || m99881a((float) i11) == 0;
    }

    /* JADX INFO: renamed from: d */
    public a m99884d(int i11, int i12) {
        float f11 = i11;
        int iM99883c = m99883c(m99881a(f11));
        float f12 = f11 / iM99883c;
        return new a(iM99883c, (int) Math.ceil(i12 / f12), f12);
    }

    /* JADX INFO: renamed from: a */
    public final int m99881a(float f11) {
        return (int) Math.ceil(f11 / this.f101726a);
    }

    /* JADX INFO: renamed from: c */
    public final int m99883c(int i11) {
        int i12 = i11 % 64;
        return i12 == 0 ? i11 : (i11 - i12) + 64;
    }

    public C45209p(float f11) {
        this.f101726a = f11;
    }
}
