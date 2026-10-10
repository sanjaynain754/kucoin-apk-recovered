package com.kubi.sdk.aspect;

import org.aspectj.lang.InterfaceC43176b;
import org.aspectj.lang.NoAspectBoundException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: NetworkingModuleAspect.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\t"}, m90084d2 = {"Lcom/kubi/sdk/aspect/NetworkingModuleAspect;", "", "<init>", "()V", "addResponseHandler", "", "point", "Lorg/aspectj/lang/ProceedingJoinPoint;", "Companion", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class NetworkingModuleAspect {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f46465a = new Companion(null);

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Throwable f46466b;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ NetworkingModuleAspect f46467c;

    /* JADX INFO: compiled from: NetworkingModuleAspect.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/sdk/aspect/NetworkingModuleAspect$Companion;", "", "<init>", "()V", "TAG", "", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    static {
        try {
            m56522b();
        } catch (Throwable th2) {
            f46466b = th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m56522b() {
        f46467c = new NetworkingModuleAspect();
    }

    /* JADX INFO: renamed from: c */
    public static NetworkingModuleAspect m56523c() {
        NetworkingModuleAspect networkingModuleAspect = f46467c;
        if (networkingModuleAspect != null) {
            return networkingModuleAspect;
        }
        throw new NoAspectBoundException("com.kubi.sdk.aspect.NetworkingModuleAspect", f46466b);
    }

    /* JADX INFO: renamed from: a */
    public final void m56524a(@NotNull InterfaceC43176b point) throws Throwable {
        Intrinsics.checkNotNullParameter(point, "point");
        Object[] objArrMo82131b = point.mo82131b();
        Intrinsics.checkNotNullExpressionValue(objArrMo82131b, "getArgs(...)");
        if (ArraysKt.firstOrNull(objArrMo82131b) == null) {
            C44128b.m97266j("NetworkingModuleAspect", "skip null responseHandler");
        } else {
            point.mo82133d(point.mo82131b());
        }
    }
}
