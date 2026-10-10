package com.kubi.sdk.aspect;

import org.aspectj.lang.InterfaceC43176b;
import org.aspectj.lang.NoAspectBoundException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.aspect.i, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ViewModelStoreAspect.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/sdk/aspect/ViewModelStoreAspect;", "", "<init>", "()V", "lock", "clear", "", "point", "Lorg/aspectj/lang/ProceedingJoinPoint;", "put", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ViewModelStoreAspect {

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Throwable f46483b;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ ViewModelStoreAspect f46484c;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Object f46485a = new Object();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m56553b() {
        f46484c = new ViewModelStoreAspect();
    }

    /* JADX INFO: renamed from: c */
    public static ViewModelStoreAspect m56554c() {
        ViewModelStoreAspect viewModelStoreAspect = f46484c;
        if (viewModelStoreAspect != null) {
            return viewModelStoreAspect;
        }
        throw new NoAspectBoundException("com.kubi.sdk.aspect.ViewModelStoreAspect", f46483b);
    }

    /* JADX INFO: renamed from: d */
    public final void m56555d(@NotNull InterfaceC43176b point) throws Throwable {
        Intrinsics.checkNotNullParameter(point, "point");
        synchronized (this.f46485a) {
            point.mo82133d(point.mo82131b());
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m56556e(@NotNull InterfaceC43176b point) throws Throwable {
        Intrinsics.checkNotNullParameter(point, "point");
        synchronized (this.f46485a) {
            point.mo82133d(point.mo82131b());
        }
    }

    static {
        try {
            m56553b();
        } catch (Throwable th2) {
            f46483b = th2;
        }
    }
}
