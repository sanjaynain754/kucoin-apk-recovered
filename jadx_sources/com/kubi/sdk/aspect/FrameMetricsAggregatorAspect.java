package com.kubi.sdk.aspect;

import com.kubi.sdk.exception.AppBaseException;
import org.aspectj.lang.InterfaceC43176b;
import org.aspectj.lang.NoAspectBoundException;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.sdk.aspect.d, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FrameMetricsAggregatorAspect.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/sdk/aspect/FrameMetricsAggregatorAspect;", "", "<init>", "()V", "onFrameMetricsAvailable", "", "point", "Lorg/aspectj/lang/ProceedingJoinPoint;", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFrameMetricsAggregatorAspect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameMetricsAggregatorAspect.kt\ncom/kubi/sdk/aspect/FrameMetricsAggregatorAspect\n+ 2 AppBaseIssue.kt\ncom/kubi/sdk/exception/AppBaseIssueKt\n*L\n1#1,27:1\n45#2,2:28\n*S KotlinDebug\n*F\n+ 1 FrameMetricsAggregatorAspect.kt\ncom/kubi/sdk/aspect/FrameMetricsAggregatorAspect\n*L\n24#1:28,2\n*E\n"})
public final class FrameMetricsAggregatorAspect {

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Throwable f46472a;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ FrameMetricsAggregatorAspect f46473b;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m56531a() {
        f46473b = new FrameMetricsAggregatorAspect();
    }

    /* JADX INFO: renamed from: b */
    public static FrameMetricsAggregatorAspect m56532b() {
        FrameMetricsAggregatorAspect frameMetricsAggregatorAspect = f46473b;
        if (frameMetricsAggregatorAspect != null) {
            return frameMetricsAggregatorAspect;
        }
        throw new NoAspectBoundException("com.kubi.sdk.aspect.FrameMetricsAggregatorAspect", f46472a);
    }

    /* JADX INFO: renamed from: c */
    public final void m56533c(@NotNull InterfaceC43176b point) throws Throwable {
        Intrinsics.checkNotNullParameter(point, "point");
        try {
            point.mo82133d(point.mo82131b());
        } catch (Exception e11) {
            C43846g.m96568c(new AppBaseException(e11, "FrameMetricsAggregatorAspect", false, null, 8, null), null, 2, null);
        }
    }

    static {
        try {
            m56531a();
        } catch (Throwable th2) {
            f46472a = th2;
        }
    }
}
