package p680v1;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p628t1.InterfaceC44610b;

/* JADX INFO: renamed from: v1.a */
/* JADX INFO: compiled from: DataCacheKey.java */
/* JADX INFO: loaded from: classes.dex */
public final class C45350a implements InterfaceC44610b {

    /* JADX INFO: renamed from: b */
    public final InterfaceC44610b f101949b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC44610b f101950c;

    @Override // p628t1.InterfaceC44610b
    /* JADX INFO: renamed from: a */
    public void mo4268a(@NonNull MessageDigest messageDigest) {
        this.f101949b.mo4268a(messageDigest);
        this.f101950c.mo4268a(messageDigest);
    }

    @Override // p628t1.InterfaceC44610b
    public boolean equals(Object obj) {
        if (obj instanceof C45350a) {
            C45350a c45350a = (C45350a) obj;
            if (this.f101949b.equals(c45350a.f101949b) && this.f101950c.equals(c45350a.f101950c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p628t1.InterfaceC44610b
    public int hashCode() {
        return (this.f101949b.hashCode() * 31) + this.f101950c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f101949b + ", signature=" + this.f101950c + '}';
    }

    public C45350a(InterfaceC44610b interfaceC44610b, InterfaceC44610b interfaceC44610b2) {
        this.f101949b = interfaceC44610b;
        this.f101950c = interfaceC44610b2;
    }
}
