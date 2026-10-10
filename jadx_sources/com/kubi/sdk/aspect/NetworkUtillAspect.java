package com.kubi.sdk.aspect;

import com.blankj.utilcode.util.NetworkUtils;
import org.aspectj.lang.InterfaceC43176b;
import org.aspectj.lang.NoAspectBoundException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.aspect.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: NetworkUtillAspect.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\n"}, m90084d2 = {"Lcom/kubi/sdk/aspect/NetworkUtillAspect;", "", "<init>", "()V", "getNetworkType", "Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;", "point", "Lorg/aspectj/lang/ProceedingJoinPoint;", "isSocketNetworkAvailable", "", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class NetworkUtillAspect {

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Throwable f46474a;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ NetworkUtillAspect f46475b;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m56534a() {
        f46475b = new NetworkUtillAspect();
    }

    /* JADX INFO: renamed from: b */
    public static NetworkUtillAspect m56535b() {
        NetworkUtillAspect networkUtillAspect = f46475b;
        if (networkUtillAspect != null) {
            return networkUtillAspect;
        }
        throw new NoAspectBoundException("com.kubi.sdk.aspect.NetworkUtillAspect", f46474a);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final NetworkUtils.NetworkType m56536c(@NotNull InterfaceC43176b point) throws Throwable {
        Intrinsics.checkNotNullParameter(point, "point");
        try {
            Object objMo82133d = point.mo82133d(point.mo82131b());
            Intrinsics.checkNotNull(objMo82133d, "null cannot be cast to non-null type com.blankj.utilcode.util.NetworkUtils.NetworkType");
            return (NetworkUtils.NetworkType) objMo82133d;
        } catch (Exception unused) {
            return NetworkUtils.NetworkType.NETWORK_UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m56537d(@NotNull InterfaceC43176b point) {
        Intrinsics.checkNotNullParameter(point, "point");
        try {
            Object objMo82133d = point.mo82133d(point.mo82131b());
            Intrinsics.checkNotNull(objMo82133d, "null cannot be cast to non-null type kotlin.Boolean");
            return ((Boolean) objMo82133d).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    static {
        try {
            m56534a();
        } catch (Throwable th2) {
            f46474a = th2;
        }
    }
}
