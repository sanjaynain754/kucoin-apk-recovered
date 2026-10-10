package p484o1;

/* JADX INFO: renamed from: o1.j */
/* JADX INFO: compiled from: MeanCalculator.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42928j {

    /* JADX INFO: renamed from: a */
    public float f95047a;

    /* JADX INFO: renamed from: b */
    public int f95048b;

    /* JADX INFO: renamed from: a */
    public void m94186a(float f11) {
        float f12 = this.f95047a + f11;
        this.f95047a = f12;
        int i11 = this.f95048b + 1;
        this.f95048b = i11;
        if (i11 == Integer.MAX_VALUE) {
            this.f95047a = f12 / 2.0f;
            this.f95048b = i11 / 2;
        }
    }
}
