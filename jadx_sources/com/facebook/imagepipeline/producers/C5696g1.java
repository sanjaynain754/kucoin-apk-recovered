package com.facebook.imagepipeline.producers;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.g1 */
/* JADX INFO: compiled from: ThreadHandoffProducerQueueImpl.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m90084d2 = {"Lcom/facebook/imagepipeline/producers/g1;", "Lcom/facebook/imagepipeline/producers/f1;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Ljava/lang/Runnable;", "runnable", "", "b", "(Ljava/lang/Runnable;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/concurrent/Executor;", "", "Z", "queueing", "Ljava/util/Deque;", "c", "Ljava/util/Deque;", "runnableList", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C5696g1 implements InterfaceC5693f1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Executor executor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean queueing;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Deque<Runnable> runnableList;

    @Override // com.facebook.imagepipeline.producers.InterfaceC5693f1
    /* JADX INFO: renamed from: a */
    public synchronized void mo9686a(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.runnableList.remove(runnable);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5693f1
    /* JADX INFO: renamed from: b */
    public synchronized void mo9687b(@NotNull Runnable runnable) {
        try {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            if (this.queueing) {
                this.runnableList.add(runnable);
            } else {
                this.executor.execute(runnable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public C5696g1(@NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.executor = executor;
        this.runnableList = new ArrayDeque();
    }
}
