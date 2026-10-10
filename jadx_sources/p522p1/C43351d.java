package p522p1;

/* JADX INFO: renamed from: p1.d */
/* JADX INFO: compiled from: ScaleXY.java */
/* JADX INFO: loaded from: classes.dex */
public class C43351d {

    /* JADX INFO: renamed from: a */
    public float f95734a;

    /* JADX INFO: renamed from: b */
    public float f95735b;

    public C43351d(float f11, float f12) {
        this.f95734a = f11;
        this.f95735b = f12;
    }

    /* JADX INFO: renamed from: a */
    public boolean m95469a(float f11, float f12) {
        return this.f95734a == f11 && this.f95735b == f12;
    }

    /* JADX INFO: renamed from: b */
    public float m95470b() {
        return this.f95734a;
    }

    /* JADX INFO: renamed from: c */
    public float m95471c() {
        return this.f95735b;
    }

    /* JADX INFO: renamed from: d */
    public void m95472d(float f11, float f12) {
        this.f95734a = f11;
        this.f95735b = f12;
    }

    public String toString() {
        return m95470b() + "x" + m95471c();
    }

    public C43351d() {
        this(1.0f, 1.0f);
    }
}
