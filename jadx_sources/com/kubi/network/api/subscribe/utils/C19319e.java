package com.kubi.network.api.subscribe.utils;

import androidx.media3.exoplayer.upstream.CmcdData;
import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;
import kotlinx.coroutines.AbstractC41710m1;
import kotlinx.coroutines.C41718o1;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.network.api.subscribe.utils.e */
/* JADX INFO: compiled from: WsThreadPool.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\tR\u001a\u0010\u000f\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u0012\u0004\b\u000e\u0010\u0003R\u001a\u0010\u0011\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u0012\u0004\b\u0010\u0010\u0003¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/network/api/subscribe/utils/e;", "", "<init>", "()V", "Lio/reactivex/Scheduler;", "b", "()Lio/reactivex/Scheduler;", "Lkotlinx/coroutines/m1;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lkotlinx/coroutines/m1;", "d", "c", "Lcom/kubi/network/api/subscribe/utils/c;", "Lcom/kubi/network/api/subscribe/utils/c;", "getSRequestThreadPool$annotations", "sRequestThreadPool", "getSResponseThreadPool$annotations", "sResponseThreadPool", "network-adapter-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C19319e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C19319e f35847a = new C19319e();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final C19317c sRequestThreadPool = new C19317c(1, "ws-request");

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final C19317c sResponseThreadPool;

    static {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Integer.valueOf(Runtime.getRuntime().availableProcessors()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = 4;
        }
        sResponseThreadPool = new C19317c(((Number) objM103844constructorimpl).intValue(), "ws-process");
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final AbstractC41710m1 m42762a() {
        return C41718o1.m91179c(sRequestThreadPool.m42760a());
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Scheduler m42763b() {
        Scheduler schedulerFrom = Schedulers.from(sRequestThreadPool.m42760a());
        Intrinsics.checkNotNullExpressionValue(schedulerFrom, "from(sRequestThreadPool.getSingleThread())");
        return schedulerFrom;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final AbstractC41710m1 m42764c() {
        return C41718o1.m91179c(sResponseThreadPool.m42760a());
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final Scheduler m42765d() {
        Scheduler schedulerFrom = Schedulers.from(sResponseThreadPool.m42760a());
        Intrinsics.checkNotNullExpressionValue(schedulerFrom, "from(sResponseThreadPool.getSingleThread())");
        return schedulerFrom;
    }
}
