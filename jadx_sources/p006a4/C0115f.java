package p006a4;

import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: a4.f */
/* JADX INFO: compiled from: OOMSoftReference.java */
/* JADX INFO: loaded from: classes34.dex */
public class C0115f<T> {

    /* JADX INFO: renamed from: a */
    public SoftReference<T> f443a = null;

    /* JADX INFO: renamed from: b */
    public SoftReference<T> f444b = null;

    /* JADX INFO: renamed from: c */
    public SoftReference<T> f445c = null;

    /* JADX INFO: renamed from: a */
    public void m571a() {
        SoftReference<T> softReference = this.f443a;
        if (softReference != null) {
            softReference.clear();
            this.f443a = null;
        }
        SoftReference<T> softReference2 = this.f444b;
        if (softReference2 != null) {
            softReference2.clear();
            this.f444b = null;
        }
        SoftReference<T> softReference3 = this.f445c;
        if (softReference3 != null) {
            softReference3.clear();
            this.f445c = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public T m572b() {
        SoftReference<T> softReference = this.f443a;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    /* JADX INFO: renamed from: c */
    public void m573c(T t11) {
        this.f443a = new SoftReference<>(t11);
        this.f444b = new SoftReference<>(t11);
        this.f445c = new SoftReference<>(t11);
    }
}
