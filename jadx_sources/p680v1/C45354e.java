package p680v1;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Map;
import p523p2.C43363j;
import p628t1.C44613e;
import p628t1.InterfaceC44610b;
import p628t1.InterfaceC44616h;

/* JADX INFO: renamed from: v1.e */
/* JADX INFO: compiled from: EngineKey.java */
/* JADX INFO: loaded from: classes.dex */
public class C45354e implements InterfaceC44610b {

    /* JADX INFO: renamed from: b */
    public final Object f101959b;

    /* JADX INFO: renamed from: c */
    public final int f101960c;

    /* JADX INFO: renamed from: d */
    public final int f101961d;

    /* JADX INFO: renamed from: e */
    public final Class<?> f101962e;

    /* JADX INFO: renamed from: f */
    public final Class<?> f101963f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC44610b f101964g;

    /* JADX INFO: renamed from: h */
    public final Map<Class<?>, InterfaceC44616h<?>> f101965h;

    /* JADX INFO: renamed from: i */
    public final C44613e f101966i;

    /* JADX INFO: renamed from: j */
    public int f101967j;

    @Override // p628t1.InterfaceC44610b
    /* JADX INFO: renamed from: a */
    public void mo4268a(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p628t1.InterfaceC44610b
    public boolean equals(Object obj) {
        if (obj instanceof C45354e) {
            C45354e c45354e = (C45354e) obj;
            if (this.f101959b.equals(c45354e.f101959b) && this.f101964g.equals(c45354e.f101964g) && this.f101961d == c45354e.f101961d && this.f101960c == c45354e.f101960c && this.f101965h.equals(c45354e.f101965h) && this.f101962e.equals(c45354e.f101962e) && this.f101963f.equals(c45354e.f101963f) && this.f101966i.equals(c45354e.f101966i)) {
                return true;
            }
        }
        return false;
    }

    @Override // p628t1.InterfaceC44610b
    public int hashCode() {
        if (this.f101967j == 0) {
            int iHashCode = this.f101959b.hashCode();
            this.f101967j = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f101964g.hashCode()) * 31) + this.f101960c) * 31) + this.f101961d;
            this.f101967j = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f101965h.hashCode();
            this.f101967j = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f101962e.hashCode();
            this.f101967j = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f101963f.hashCode();
            this.f101967j = iHashCode5;
            this.f101967j = (iHashCode5 * 31) + this.f101966i.hashCode();
        }
        return this.f101967j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f101959b + ", width=" + this.f101960c + ", height=" + this.f101961d + ", resourceClass=" + this.f101962e + ", transcodeClass=" + this.f101963f + ", signature=" + this.f101964g + ", hashCode=" + this.f101967j + ", transformations=" + this.f101965h + ", options=" + this.f101966i + '}';
    }

    public C45354e(Object obj, InterfaceC44610b interfaceC44610b, int i11, int i12, Map<Class<?>, InterfaceC44616h<?>> map, Class<?> cls, Class<?> cls2, C44613e c44613e) {
        this.f101959b = C43363j.m95506d(obj);
        this.f101964g = (InterfaceC44610b) C43363j.m95507e(interfaceC44610b, "Signature must not be null");
        this.f101960c = i11;
        this.f101961d = i12;
        this.f101965h = (Map) C43363j.m95506d(map);
        this.f101962e = (Class) C43363j.m95507e(cls, "Resource class must not be null");
        this.f101963f = (Class) C43363j.m95507e(cls2, "Transcode class must not be null");
        this.f101966i = (C44613e) C43363j.m95506d(c44613e);
    }
}
