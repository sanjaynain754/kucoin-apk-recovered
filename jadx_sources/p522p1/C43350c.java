package p522p1;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import p248f1.AbstractC37305a;

/* JADX INFO: renamed from: p1.c */
/* JADX INFO: compiled from: LottieValueCallback.java */
/* JADX INFO: loaded from: classes34.dex */
public class C43350c<T> {

    /* JADX INFO: renamed from: a */
    public final C43349b<T> f95731a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public AbstractC37305a<?, ?> f95732b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public T f95733c;

    public C43350c() {
        this.f95731a = new C43349b<>();
        this.f95733c = null;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public T mo5530a(C43349b<T> c43349b) {
        return this.f95733c;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: b */
    public final T m95467b(float f11, float f12, T t11, T t12, float f13, float f14, float f15) {
        return mo5530a(this.f95731a.m95466h(f11, f12, t11, t12, f13, f14, f15));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: c */
    public final void m95468c(@Nullable AbstractC37305a<?, ?> abstractC37305a) {
        this.f95732b = abstractC37305a;
    }

    public C43350c(@Nullable T t11) {
        this.f95731a = new C43349b<>();
        this.f95733c = t11;
    }
}
