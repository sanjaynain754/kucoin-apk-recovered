package p485o2;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p523p2.C43363j;
import p628t1.InterfaceC44610b;

/* JADX INFO: renamed from: o2.d */
/* JADX INFO: compiled from: ObjectKey.java */
/* JADX INFO: loaded from: classes.dex */
public final class C42950d implements InterfaceC44610b {

    /* JADX INFO: renamed from: b */
    public final Object f95059b;

    @Override // p628t1.InterfaceC44610b
    /* JADX INFO: renamed from: a */
    public void mo4268a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.f95059b.toString().getBytes(InterfaceC44610b.f98907a));
    }

    @Override // p628t1.InterfaceC44610b
    public boolean equals(Object obj) {
        if (obj instanceof C42950d) {
            return this.f95059b.equals(((C42950d) obj).f95059b);
        }
        return false;
    }

    @Override // p628t1.InterfaceC44610b
    public int hashCode() {
        return this.f95059b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f95059b + '}';
    }

    public C42950d(@NonNull Object obj) {
        this.f95059b = C43363j.m95506d(obj);
    }
}
