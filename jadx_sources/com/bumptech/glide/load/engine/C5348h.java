package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import p523p2.C43363j;
import p628t1.InterfaceC44610b;
import p680v1.InterfaceC45359j;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.h */
/* JADX INFO: compiled from: EngineResource.java */
/* JADX INFO: loaded from: classes.dex */
public class C5348h<Z> implements InterfaceC45359j<Z> {

    /* JADX INFO: renamed from: b */
    public final boolean f6925b;

    /* JADX INFO: renamed from: c */
    public final boolean f6926c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC45359j<Z> f6927d;

    /* JADX INFO: renamed from: e */
    public final a f6928e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC44610b f6929f;

    /* JADX INFO: renamed from: g */
    public int f6930g;

    /* JADX INFO: renamed from: h */
    public boolean f6931h;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.h$a */
    /* JADX INFO: compiled from: EngineResource.java */
    public interface a {
        /* JADX INFO: renamed from: c */
        void mo6785c(InterfaceC44610b interfaceC44610b, C5348h<?> c5348h);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m6820b() {
        if (this.f6931h) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f6930g++;
    }

    /* JADX INFO: renamed from: e */
    public void m6823e() {
        boolean z11;
        synchronized (this) {
            int i11 = this.f6930g;
            if (i11 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z11 = true;
            int i12 = i11 - 1;
            this.f6930g = i12;
            if (i12 != 0) {
                z11 = false;
            }
        }
        if (z11) {
            this.f6928e.mo6785c(this.f6929f, this);
        }
    }

    @Override // p680v1.InterfaceC45359j
    public synchronized void recycle() {
        if (this.f6930g > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f6931h) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f6931h = true;
        if (this.f6926c) {
            this.f6927d.recycle();
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f6925b + ", listener=" + this.f6928e + ", key=" + this.f6929f + ", acquired=" + this.f6930g + ", isRecycled=" + this.f6931h + ", resource=" + this.f6927d + '}';
    }

    @Override // p680v1.InterfaceC45359j
    @NonNull
    /* JADX INFO: renamed from: a */
    public Class<Z> mo4266a() {
        return this.f6927d.mo4266a();
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC45359j<Z> m6821c() {
        return this.f6927d;
    }

    /* JADX INFO: renamed from: d */
    public boolean m6822d() {
        return this.f6925b;
    }

    @Override // p680v1.InterfaceC45359j
    @NonNull
    public Z get() {
        return this.f6927d.get();
    }

    @Override // p680v1.InterfaceC45359j
    public int getSize() {
        return this.f6927d.getSize();
    }

    public C5348h(InterfaceC45359j<Z> interfaceC45359j, boolean z11, boolean z12, InterfaceC44610b interfaceC44610b, a aVar) {
        this.f6927d = (InterfaceC45359j) C43363j.m95506d(interfaceC45359j);
        this.f6925b = z11;
        this.f6926c = z12;
        this.f6929f = interfaceC44610b;
        this.f6928e = (a) C43363j.m95506d(aVar);
    }
}
