package p523p2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: p2.i */
/* JADX INFO: compiled from: MultiClassKey.java */
/* JADX INFO: loaded from: classes.dex */
public class C43362i {

    /* JADX INFO: renamed from: a */
    public Class<?> f95759a;

    /* JADX INFO: renamed from: b */
    public Class<?> f95760b;

    /* JADX INFO: renamed from: c */
    public Class<?> f95761c;

    public C43362i() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C43362i c43362i = (C43362i) obj;
        return this.f95759a.equals(c43362i.f95759a) && this.f95760b.equals(c43362i.f95760b) && C43364k.m95511d(this.f95761c, c43362i.f95761c);
    }

    public C43362i(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        m95502a(cls, cls2, cls3);
    }

    /* JADX INFO: renamed from: a */
    public void m95502a(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        this.f95759a = cls;
        this.f95760b = cls2;
        this.f95761c = cls3;
    }

    public int hashCode() {
        int iHashCode = ((this.f95759a.hashCode() * 31) + this.f95760b.hashCode()) * 31;
        Class<?> cls = this.f95761c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f95759a + ", second=" + this.f95760b + '}';
    }
}
