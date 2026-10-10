package com.kubi.sdk.aspect;

import com.kubi.sdk.exception.AppBaseException;
import org.aspectj.lang.InterfaceC43176b;
import org.aspectj.lang.NoAspectBoundException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.sdk.aspect.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ConnectionTrackerAspect.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/sdk/aspect/ConnectionTrackerAspect;", "", "<init>", "()V", "bindService", "point", "Lorg/aspectj/lang/ProceedingJoinPoint;", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nConnectionTrackerAspect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionTrackerAspect.kt\ncom/kubi/sdk/aspect/ConnectionTrackerAspect\n+ 2 AppBaseIssue.kt\ncom/kubi/sdk/exception/AppBaseIssueKt\n*L\n1#1,28:1\n45#2,2:29\n*S KotlinDebug\n*F\n+ 1 ConnectionTrackerAspect.kt\ncom/kubi/sdk/aspect/ConnectionTrackerAspect\n*L\n24#1:29,2\n*E\n"})
public final class ConnectionTrackerAspect {

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Throwable f46468a;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ConnectionTrackerAspect f46469b;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m56525a() {
        f46469b = new ConnectionTrackerAspect();
    }

    /* JADX INFO: renamed from: b */
    public static ConnectionTrackerAspect m56526b() {
        ConnectionTrackerAspect connectionTrackerAspect = f46469b;
        if (connectionTrackerAspect != null) {
            return connectionTrackerAspect;
        }
        throw new NoAspectBoundException("com.kubi.sdk.aspect.ConnectionTrackerAspect", f46468a);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m56527c(@NotNull InterfaceC43176b point) throws Throwable {
        Intrinsics.checkNotNullParameter(point, "point");
        try {
            return point.mo82133d(point.mo82131b());
        } catch (Exception e11) {
            C43846g.m96568c(new AppBaseException(e11, "ConnectionTrackerAspect", false, null, 8, null), null, 2, null);
            return Boolean.FALSE;
        }
    }

    static {
        try {
            m56525a();
        } catch (Throwable th2) {
            f46468a = th2;
        }
    }
}
