package com.facebook.imagepipeline.core;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p617s5.InterfaceC44341n;
import p617s5.ThreadFactoryC44349u;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DefaultExecutorSupplier.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \r2\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bR\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u0019"}, m90084d2 = {"Lcom/facebook/imagepipeline/core/DefaultExecutorSupplier;", "Ls5/n;", "", "numCpuBoundThreads", "<init>", "(I)V", "Ljava/util/concurrent/Executor;", "c", "()Ljava/util/concurrent/Executor;", "e", "g", "b", "Ljava/util/concurrent/ScheduledExecutorService;", "f", "()Ljava/util/concurrent/ScheduledExecutorService;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "d", "Ljava/util/concurrent/Executor;", "ioBoundExecutor", "decodeExecutor", "backgroundExecutor", "lightWeightBackgroundExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "backgroundScheduledExecutorService", "Companion", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class DefaultExecutorSupplier implements InterfaceC44341n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Executor ioBoundExecutor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Executor decodeExecutor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Executor backgroundExecutor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Executor lightWeightBackgroundExecutor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final ScheduledExecutorService backgroundScheduledExecutorService;

    @Override // p617s5.InterfaceC44341n
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public Executor getLightWeightBackgroundExecutor() {
        return this.lightWeightBackgroundExecutor;
    }

    @Override // p617s5.InterfaceC44341n
    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public Executor getBackgroundExecutor() {
        return this.backgroundExecutor;
    }

    @Override // p617s5.InterfaceC44341n
    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public Executor getIoBoundExecutor() {
        return this.ioBoundExecutor;
    }

    @Override // p617s5.InterfaceC44341n
    @NotNull
    /* JADX INFO: renamed from: d */
    public Executor mo9200d() {
        return this.ioBoundExecutor;
    }

    @Override // p617s5.InterfaceC44341n
    @NotNull
    /* JADX INFO: renamed from: e */
    public Executor mo9201e() {
        return this.ioBoundExecutor;
    }

    @Override // p617s5.InterfaceC44341n
    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public ScheduledExecutorService getBackgroundScheduledExecutorService() {
        return this.backgroundScheduledExecutorService;
    }

    @Override // p617s5.InterfaceC44341n
    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public Executor getDecodeExecutor() {
        return this.decodeExecutor;
    }

    public DefaultExecutorSupplier(int i11) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2, new ThreadFactoryC44349u(10, "FrescoIoBoundExecutor", true));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
        this.ioBoundExecutor = executorServiceNewFixedThreadPool;
        ExecutorService executorServiceNewFixedThreadPool2 = Executors.newFixedThreadPool(i11, new ThreadFactoryC44349u(10, "FrescoDecodeExecutor", true));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool2, "newFixedThreadPool(...)");
        this.decodeExecutor = executorServiceNewFixedThreadPool2;
        ExecutorService executorServiceNewFixedThreadPool3 = Executors.newFixedThreadPool(i11, new ThreadFactoryC44349u(10, "FrescoBackgroundExecutor", true));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool3, "newFixedThreadPool(...)");
        this.backgroundExecutor = executorServiceNewFixedThreadPool3;
        ExecutorService executorServiceNewFixedThreadPool4 = Executors.newFixedThreadPool(1, new ThreadFactoryC44349u(10, "FrescoLightWeightBackgroundExecutor", true));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool4, "newFixedThreadPool(...)");
        this.lightWeightBackgroundExecutor = executorServiceNewFixedThreadPool4;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(i11, new ThreadFactoryC44349u(10, "FrescoBackgroundExecutor", true));
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(...)");
        this.backgroundScheduledExecutorService = scheduledExecutorServiceNewScheduledThreadPool;
    }
}
