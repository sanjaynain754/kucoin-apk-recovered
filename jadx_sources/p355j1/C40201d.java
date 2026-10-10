package p355j1;

import java.util.Arrays;
import p484o1.C42922d;
import p484o1.C42929k;

/* JADX INFO: renamed from: j1.d */
/* JADX INFO: compiled from: GradientColor.java */
/* JADX INFO: loaded from: classes34.dex */
public class C40201d {

    /* JADX INFO: renamed from: a */
    public final float[] f89335a;

    /* JADX INFO: renamed from: b */
    public final int[] f89336b;

    /* JADX INFO: renamed from: a */
    public final void m88557a(C40201d c40201d) {
        int i11 = 0;
        while (true) {
            int[] iArr = c40201d.f89336b;
            if (i11 >= iArr.length) {
                return;
            }
            this.f89335a[i11] = c40201d.f89335a[i11];
            this.f89336b[i11] = iArr[i11];
            i11++;
        }
    }

    /* JADX INFO: renamed from: b */
    public C40201d m88558b(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i11 = 0; i11 < fArr.length; i11++) {
            iArr[i11] = m88559c(fArr[i11]);
        }
        return new C40201d(fArr, iArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C40201d c40201d = (C40201d) obj;
            if (Arrays.equals(this.f89335a, c40201d.f89335a) && Arrays.equals(this.f89336b, c40201d.f89336b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final int m88559c(float f11) {
        int iBinarySearch = Arrays.binarySearch(this.f89335a, f11);
        if (iBinarySearch >= 0) {
            return this.f89336b[iBinarySearch];
        }
        int i11 = -(iBinarySearch + 1);
        if (i11 == 0) {
            return this.f89336b[0];
        }
        int[] iArr = this.f89336b;
        if (i11 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.f89335a;
        int i12 = i11 - 1;
        float f12 = fArr[i12];
        return C42922d.m94154c((f11 - f12) / (fArr[i11] - f12), iArr[i12], iArr[i11]);
    }

    /* JADX INFO: renamed from: d */
    public int[] m88560d() {
        return this.f89336b;
    }

    /* JADX INFO: renamed from: e */
    public float[] m88561e() {
        return this.f89335a;
    }

    /* JADX INFO: renamed from: f */
    public int m88562f() {
        return this.f89336b.length;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f89335a) * 31) + Arrays.hashCode(this.f89336b);
    }

    public C40201d(float[] fArr, int[] iArr) {
        this.f89335a = fArr;
        this.f89336b = iArr;
    }

    /* JADX INFO: renamed from: g */
    public void m88563g(C40201d c40201d, C40201d c40201d2, float f11) {
        int[] iArr;
        if (c40201d.equals(c40201d2)) {
            m88557a(c40201d);
            return;
        }
        if (f11 <= 0.0f) {
            m88557a(c40201d);
            return;
        }
        if (f11 >= 1.0f) {
            m88557a(c40201d2);
            return;
        }
        if (c40201d.f89336b.length == c40201d2.f89336b.length) {
            int i11 = 0;
            while (true) {
                iArr = c40201d.f89336b;
                if (i11 >= iArr.length) {
                    break;
                }
                this.f89335a[i11] = C42929k.m94195i(c40201d.f89335a[i11], c40201d2.f89335a[i11], f11);
                this.f89336b[i11] = C42922d.m94154c(f11, c40201d.f89336b[i11], c40201d2.f89336b[i11]);
                i11++;
            }
            int length = iArr.length;
            while (true) {
                float[] fArr = this.f89335a;
                if (length < fArr.length) {
                    int[] iArr2 = c40201d.f89336b;
                    fArr[length] = fArr[iArr2.length - 1];
                    int[] iArr3 = this.f89336b;
                    iArr3[length] = iArr3[iArr2.length - 1];
                    length++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + c40201d.f89336b.length + " vs " + c40201d2.f89336b.length + ")");
        }
    }
}
