package jumio.core;

import com.jumio.commons.camera.renderer.graphics.DynamicRange$Companion;

/* JADX INFO: renamed from: jumio.core.e1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40654e1 {

    /* JADX INFO: renamed from: c */
    public static final DynamicRange$Companion f90250c = new DynamicRange$Companion(null);

    /* JADX INFO: renamed from: d */
    public static final C40654e1 f90251d = new C40654e1(0, 0);

    /* JADX INFO: renamed from: e */
    public static final C40654e1 f90252e = new C40654e1(1, 8);

    /* JADX INFO: renamed from: f */
    public static final C40654e1 f90253f = new C40654e1(2, 10);

    /* JADX INFO: renamed from: g */
    public static final C40654e1 f90254g = new C40654e1(3, 10);

    /* JADX INFO: renamed from: h */
    public static final C40654e1 f90255h = new C40654e1(4, 10);

    /* JADX INFO: renamed from: i */
    public static final C40654e1 f90256i = new C40654e1(5, 10);

    /* JADX INFO: renamed from: j */
    public static final C40654e1 f90257j = new C40654e1(6, 10);

    /* JADX INFO: renamed from: k */
    public static final C40654e1 f90258k = new C40654e1(6, 8);

    /* JADX INFO: renamed from: a */
    public final int f90259a;

    /* JADX INFO: renamed from: b */
    public final int f90260b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C40654e1) {
            C40654e1 c40654e1 = (C40654e1) obj;
            if (this.f90259a == c40654e1.f90259a && this.f90260b == c40654e1.f90260b) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m89253a() {
        int i11;
        int i12 = this.f90259a;
        return (i12 == 0 || i12 == 2 || (i11 = this.f90260b) == 0 || i12 == 1 || i11 != 10) ? false : true;
    }

    public final int hashCode() {
        return ((this.f90259a ^ 1000003) * 1000003) ^ this.f90260b;
    }

    public final String toString() {
        return "DynamicRange@" + Integer.toHexString(System.identityHashCode(this)) + "{encoding=" + DynamicRange$Companion.access$getEncodingLabel(f90250c, this.f90259a) + ", bitDepth=" + this.f90260b + '}';
    }

    public C40654e1(int i11, int i12) {
        this.f90259a = i11;
        this.f90260b = i12;
    }
}
