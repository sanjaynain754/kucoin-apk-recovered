package p030b2;

import androidx.annotation.NonNull;
import p523p2.C43363j;
import p680v1.InterfaceC45359j;

/* JADX INFO: renamed from: b2.l */
/* JADX INFO: compiled from: SimpleResource.java */
/* JADX INFO: loaded from: classes.dex */
public class C4466l<T> implements InterfaceC45359j<T> {

    /* JADX INFO: renamed from: b */
    public final T f3866b;

    @Override // p680v1.InterfaceC45359j
    public final int getSize() {
        return 1;
    }

    @Override // p680v1.InterfaceC45359j
    @NonNull
    /* JADX INFO: renamed from: a */
    public Class<T> mo4266a() {
        return (Class<T>) this.f3866b.getClass();
    }

    @Override // p680v1.InterfaceC45359j
    @NonNull
    public final T get() {
        return this.f3866b;
    }

    public C4466l(@NonNull T t11) {
        this.f3866b = (T) C43363j.m95506d(t11);
    }

    @Override // p680v1.InterfaceC45359j
    public void recycle() {
    }
}
