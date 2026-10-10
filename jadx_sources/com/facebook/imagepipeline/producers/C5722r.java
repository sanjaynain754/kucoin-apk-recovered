package com.facebook.imagepipeline.producers;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a4.AbstractC0110a;
import p749x5.InterfaceC46071e;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.r */
/* JADX INFO: compiled from: DelayProducer.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B%\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lcom/facebook/imagepipeline/producers/r;", "Lcom/facebook/imagepipeline/producers/v0;", "La4/a;", "Lx5/e;", "inputProducer", "Ljava/util/concurrent/ScheduledExecutorService;", "backgroundTasksExecutor", "<init>", "(Lcom/facebook/imagepipeline/producers/v0;Ljava/util/concurrent/ScheduledExecutorService;)V", "Lcom/facebook/imagepipeline/producers/m;", "consumer", "Lcom/facebook/imagepipeline/producers/w0;", "context", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)V", "Lcom/facebook/imagepipeline/producers/v0;", "b", "Ljava/util/concurrent/ScheduledExecutorService;", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C5722r implements InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> inputProducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final ScheduledExecutorService backgroundTasksExecutor;

    public C5722r(@NotNull InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> inputProducer, @Nullable ScheduledExecutorService scheduledExecutorService) {
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        this.inputProducer = inputProducer;
        this.backgroundTasksExecutor = scheduledExecutorService;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5731v0
    /* JADX INFO: renamed from: a */
    public void mo9524a(@NotNull final InterfaceC5712m<AbstractC0110a<InterfaceC46071e>> consumer, @NotNull final InterfaceC5733w0 context) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(context, "context");
        ImageRequest imageRequestMo9666h = context.mo9666h();
        ScheduledExecutorService scheduledExecutorService = this.backgroundTasksExecutor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.schedule(new Runnable() { // from class: com.facebook.imagepipeline.producers.q
                @Override // java.lang.Runnable
                public final void run() {
                    C5722r.m9800d(this.f9422b, consumer, context);
                }
            }, imageRequestMo9666h.getDelayMs(), TimeUnit.MILLISECONDS);
        } else {
            this.inputProducer.mo9524a(consumer, context);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m9800d(C5722r this$0, InterfaceC5712m consumer, InterfaceC5733w0 context) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(consumer, "$consumer");
        Intrinsics.checkNotNullParameter(context, "$context");
        this$0.inputProducer.mo9524a(consumer, context);
    }
}
