package com.kubi.sdk.aspect;

import org.aspectj.lang.InterfaceC43176b;
import org.aspectj.lang.NoAspectBoundException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.sdk.aspect.h, reason: from Kotlin metadata */
/* JADX INFO: compiled from: UtilsActivityLifecycleImplAspect.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/sdk/aspect/UtilsActivityLifecycleImplAspect;", "", "<init>", "()V", "lock", "postStatus", "", "point", "Lorg/aspectj/lang/ProceedingJoinPoint;", "addOnAppStatusChangedListener", "removeOnAppStatusChangedListener", "getTopActivity", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUtilsActivityLifecycleImplAspect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtilsActivityLifecycleImplAspect.kt\ncom/kubi/sdk/aspect/UtilsActivityLifecycleImplAspect\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
public final class UtilsActivityLifecycleImplAspect {

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Throwable f46480b;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ UtilsActivityLifecycleImplAspect f46481c;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Object f46482a = new Object();

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m56547c() {
        f46481c = new UtilsActivityLifecycleImplAspect();
    }

    /* JADX INFO: renamed from: d */
    public static UtilsActivityLifecycleImplAspect m56548d() {
        UtilsActivityLifecycleImplAspect utilsActivityLifecycleImplAspect = f46481c;
        if (utilsActivityLifecycleImplAspect != null) {
            return utilsActivityLifecycleImplAspect;
        }
        throw new NoAspectBoundException("com.kubi.sdk.aspect.UtilsActivityLifecycleImplAspect", f46480b);
    }

    /* JADX INFO: renamed from: a */
    public final void m56549a(@NotNull InterfaceC43176b point) throws Throwable {
        Intrinsics.checkNotNullParameter(point, "point");
        synchronized (this.f46482a) {
            point.mo82133d(point.mo82131b());
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m56550e(@NotNull InterfaceC43176b point) throws Throwable {
        Intrinsics.checkNotNullParameter(point, "point");
        synchronized (this.f46482a) {
            point.mo82133d(point.mo82131b());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m56551f(@NotNull InterfaceC43176b point) throws Throwable {
        Intrinsics.checkNotNullParameter(point, "point");
        synchronized (this.f46482a) {
            point.mo82133d(point.mo82131b());
        }
    }

    static {
        try {
            m56547c();
        } catch (Throwable th2) {
            f46480b = th2;
        }
    }
}
