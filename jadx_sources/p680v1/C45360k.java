package p680v1;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p523p2.C43360g;
import p523p2.C43364k;
import p628t1.C44613e;
import p628t1.InterfaceC44610b;
import p628t1.InterfaceC44616h;
import p710w1.InterfaceC45684b;

/* JADX INFO: renamed from: v1.k */
/* JADX INFO: compiled from: ResourceCacheKey.java */
/* JADX INFO: loaded from: classes.dex */
public final class C45360k implements InterfaceC44610b {

    /* JADX INFO: renamed from: j */
    public static final C43360g<Class<?>, byte[]> f101975j = new C43360g<>(50);

    /* JADX INFO: renamed from: b */
    public final InterfaceC45684b f101976b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC44610b f101977c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC44610b f101978d;

    /* JADX INFO: renamed from: e */
    public final int f101979e;

    /* JADX INFO: renamed from: f */
    public final int f101980f;

    /* JADX INFO: renamed from: g */
    public final Class<?> f101981g;

    /* JADX INFO: renamed from: h */
    public final C44613e f101982h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC44616h<?> f101983i;

    @Override // p628t1.InterfaceC44610b
    /* JADX INFO: renamed from: a */
    public void mo4268a(@NonNull MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f101976b.mo100807e(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f101979e).putInt(this.f101980f).array();
        this.f101978d.mo4268a(messageDigest);
        this.f101977c.mo4268a(messageDigest);
        messageDigest.update(bArr);
        InterfaceC44616h<?> interfaceC44616h = this.f101983i;
        if (interfaceC44616h != null) {
            interfaceC44616h.mo4268a(messageDigest);
        }
        this.f101982h.mo4268a(messageDigest);
        messageDigest.update(m100264c());
        this.f101976b.put(bArr);
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m100264c() {
        C43360g<Class<?>, byte[]> c43360g = f101975j;
        byte[] bArrM95493g = c43360g.m95493g(this.f101981g);
        if (bArrM95493g != null) {
            return bArrM95493g;
        }
        byte[] bytes = this.f101981g.getName().getBytes(InterfaceC44610b.f98907a);
        c43360g.m95497k(this.f101981g, bytes);
        return bytes;
    }

    @Override // p628t1.InterfaceC44610b
    public boolean equals(Object obj) {
        if (obj instanceof C45360k) {
            C45360k c45360k = (C45360k) obj;
            if (this.f101980f == c45360k.f101980f && this.f101979e == c45360k.f101979e && C43364k.m95511d(this.f101983i, c45360k.f101983i) && this.f101981g.equals(c45360k.f101981g) && this.f101977c.equals(c45360k.f101977c) && this.f101978d.equals(c45360k.f101978d) && this.f101982h.equals(c45360k.f101982h)) {
                return true;
            }
        }
        return false;
    }

    @Override // p628t1.InterfaceC44610b
    public int hashCode() {
        int iHashCode = (((((this.f101977c.hashCode() * 31) + this.f101978d.hashCode()) * 31) + this.f101979e) * 31) + this.f101980f;
        InterfaceC44616h<?> interfaceC44616h = this.f101983i;
        if (interfaceC44616h != null) {
            iHashCode = (iHashCode * 31) + interfaceC44616h.hashCode();
        }
        return (((iHashCode * 31) + this.f101981g.hashCode()) * 31) + this.f101982h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f101977c + ", signature=" + this.f101978d + ", width=" + this.f101979e + ", height=" + this.f101980f + ", decodedResourceClass=" + this.f101981g + ", transformation='" + this.f101983i + "', options=" + this.f101982h + '}';
    }

    public C45360k(InterfaceC45684b interfaceC45684b, InterfaceC44610b interfaceC44610b, InterfaceC44610b interfaceC44610b2, int i11, int i12, InterfaceC44616h<?> interfaceC44616h, Class<?> cls, C44613e c44613e) {
        this.f101976b = interfaceC45684b;
        this.f101977c = interfaceC44610b;
        this.f101978d = interfaceC44610b2;
        this.f101979e = i11;
        this.f101980f = i12;
        this.f101983i = interfaceC44616h;
        this.f101981g = cls;
        this.f101982h = c44613e;
    }
}
