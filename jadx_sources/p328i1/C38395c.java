package p328i1;

import java.util.Arrays;
import java.util.List;
import p248f1.AbstractC37305a;
import p248f1.C37309e;
import p355j1.C40201d;
import p522p1.C43348a;

/* JADX INFO: renamed from: i1.c */
/* JADX INFO: compiled from: AnimatableGradientColorValue.java */
/* JADX INFO: loaded from: classes34.dex */
public class C38395c extends AbstractC38406n<C40201d, C40201d> {
    /* JADX INFO: renamed from: d */
    public static List<C43348a<C40201d>> m86577d(List<C43348a<C40201d>> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            list.set(i11, m86576c(list.get(i11)));
        }
        return list;
    }

    /* JADX INFO: renamed from: e */
    public static float[] m86578e(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f11 = Float.NaN;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            float f12 = fArr3[i12];
            if (f12 != f11) {
                fArr3[i11] = f12;
                i11++;
                f11 = fArr3[i12];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i11);
    }

    /* JADX INFO: renamed from: c */
    public static C43348a<C40201d> m86576c(C43348a<C40201d> c43348a) {
        C40201d c40201d = c43348a.f95709b;
        C40201d c40201d2 = c43348a.f95710c;
        if (c40201d == null || c40201d2 == null || c40201d.m88561e().length == c40201d2.m88561e().length) {
            return c43348a;
        }
        float[] fArrM86578e = m86578e(c40201d.m88561e(), c40201d2.m88561e());
        return c43348a.m95451b(c40201d.m88558b(fArrM86578e), c40201d2.m88558b(fArrM86578e));
    }

    @Override // p328i1.InterfaceC38405m
    /* JADX INFO: renamed from: a */
    public AbstractC37305a<C40201d, C40201d> mo86574a() {
        return new C37309e(this.f86187a);
    }

    public C38395c(List<C43348a<C40201d>> list) {
        super(m86577d(list));
    }

    @Override // p328i1.AbstractC38406n, p328i1.InterfaceC38405m
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ List mo86575b() {
        return super.mo86575b();
    }

    @Override // p328i1.AbstractC38406n, p328i1.InterfaceC38405m
    public /* bridge */ /* synthetic */ boolean isStatic() {
        return super.isStatic();
    }

    @Override // p328i1.AbstractC38406n
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
