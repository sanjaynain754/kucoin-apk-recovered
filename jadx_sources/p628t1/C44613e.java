package p628t1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import java.security.MessageDigest;
import p523p2.C43355b;

/* JADX INFO: renamed from: t1.e */
/* JADX INFO: compiled from: Options.java */
/* JADX INFO: loaded from: classes.dex */
public final class C44613e implements InterfaceC44610b {

    /* JADX INFO: renamed from: b */
    public final ArrayMap<C44612d<?>, Object> f98914b = new C43355b();

    @Override // p628t1.InterfaceC44610b
    /* JADX INFO: renamed from: a */
    public void mo4268a(@NonNull MessageDigest messageDigest) {
        for (int i11 = 0; i11 < this.f98914b.getSize(); i11++) {
            m98731f(this.f98914b.keyAt(i11), this.f98914b.valueAt(i11), messageDigest);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public <T> T m98732c(@NonNull C44612d<T> c44612d) {
        return this.f98914b.containsKey(c44612d) ? (T) this.f98914b.get(c44612d) : c44612d.m98728c();
    }

    /* JADX INFO: renamed from: d */
    public void m98733d(@NonNull C44613e c44613e) {
        this.f98914b.putAll((SimpleArrayMap<? extends C44612d<?>, ? extends Object>) c44613e.f98914b);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public <T> C44613e m98734e(@NonNull C44612d<T> c44612d, @NonNull T t11) {
        this.f98914b.put(c44612d, t11);
        return this;
    }

    @Override // p628t1.InterfaceC44610b
    public boolean equals(Object obj) {
        if (obj instanceof C44613e) {
            return this.f98914b.equals(((C44613e) obj).f98914b);
        }
        return false;
    }

    @Override // p628t1.InterfaceC44610b
    public int hashCode() {
        return this.f98914b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f98914b + '}';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static <T> void m98731f(@NonNull C44612d<T> c44612d, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        c44612d.m98730g(obj, messageDigest);
    }
}
