package com.facebook.imagepipeline.producers;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.c0 */
/* JADX INFO: compiled from: InternalProducerListener.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0018\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014JE\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0018\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0018\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0014J)\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, m90084d2 = {"Lcom/facebook/imagepipeline/producers/c0;", "Lcom/facebook/imagepipeline/producers/y0;", "Lcom/facebook/imagepipeline/producers/z0;", "producerListener", "producerListener2", "<init>", "(Lcom/facebook/imagepipeline/producers/z0;Lcom/facebook/imagepipeline/producers/y0;)V", "Lcom/facebook/imagepipeline/producers/w0;", "context", "", "producerName", "", "b", "(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;)V", "eventName", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;Ljava/lang/String;)V", "", "extraMap", "j", "(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;Ljava/util/Map;)V", "", "t", "k", "(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "d", "", "successful", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;Z)V", "f", "(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;)Z", "Lcom/facebook/imagepipeline/producers/z0;", "getProducerListener", "()Lcom/facebook/imagepipeline/producers/z0;", "Lcom/facebook/imagepipeline/producers/y0;", "getProducerListener2", "()Lcom/facebook/imagepipeline/producers/y0;", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class C5683c0 implements InterfaceC5737y0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC5739z0 producerListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC5737y0 producerListener2;

    @Override // com.facebook.imagepipeline.producers.InterfaceC5737y0
    /* JADX INFO: renamed from: a */
    public void mo9453a(@NotNull InterfaceC5733w0 context, @Nullable String producerName, boolean successful) {
        Intrinsics.checkNotNullParameter(context, "context");
        InterfaceC5739z0 interfaceC5739z0 = this.producerListener;
        if (interfaceC5739z0 != null) {
            interfaceC5739z0.onUltimateProducerReached(context.getId(), producerName, successful);
        }
        InterfaceC5737y0 interfaceC5737y0 = this.producerListener2;
        if (interfaceC5737y0 != null) {
            interfaceC5737y0.mo9453a(context, producerName, successful);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5737y0
    /* JADX INFO: renamed from: b */
    public void mo9454b(@NotNull InterfaceC5733w0 context, @Nullable String producerName) {
        Intrinsics.checkNotNullParameter(context, "context");
        InterfaceC5739z0 interfaceC5739z0 = this.producerListener;
        if (interfaceC5739z0 != null) {
            interfaceC5739z0.onProducerStart(context.getId(), producerName);
        }
        InterfaceC5737y0 interfaceC5737y0 = this.producerListener2;
        if (interfaceC5737y0 != null) {
            interfaceC5737y0.mo9454b(context, producerName);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5737y0
    /* JADX INFO: renamed from: d */
    public void mo9456d(@NotNull InterfaceC5733w0 context, @Nullable String producerName, @Nullable Map<String, String> extraMap) {
        Intrinsics.checkNotNullParameter(context, "context");
        InterfaceC5739z0 interfaceC5739z0 = this.producerListener;
        if (interfaceC5739z0 != null) {
            interfaceC5739z0.onProducerFinishWithCancellation(context.getId(), producerName, extraMap);
        }
        InterfaceC5737y0 interfaceC5737y0 = this.producerListener2;
        if (interfaceC5737y0 != null) {
            interfaceC5737y0.mo9456d(context, producerName, extraMap);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5737y0
    /* JADX INFO: renamed from: f */
    public boolean mo9458f(@NotNull InterfaceC5733w0 context, @Nullable String producerName) {
        Intrinsics.checkNotNullParameter(context, "context");
        InterfaceC5739z0 interfaceC5739z0 = this.producerListener;
        Boolean boolValueOf = interfaceC5739z0 != null ? Boolean.valueOf(interfaceC5739z0.requiresExtraMap(context.getId())) : null;
        if (!Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
            InterfaceC5737y0 interfaceC5737y0 = this.producerListener2;
            boolValueOf = interfaceC5737y0 != null ? Boolean.valueOf(interfaceC5737y0.mo9458f(context, producerName)) : null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5737y0
    /* JADX INFO: renamed from: h */
    public void mo9460h(@NotNull InterfaceC5733w0 context, @Nullable String producerName, @Nullable String eventName) {
        Intrinsics.checkNotNullParameter(context, "context");
        InterfaceC5739z0 interfaceC5739z0 = this.producerListener;
        if (interfaceC5739z0 != null) {
            interfaceC5739z0.onProducerEvent(context.getId(), producerName, eventName);
        }
        InterfaceC5737y0 interfaceC5737y0 = this.producerListener2;
        if (interfaceC5737y0 != null) {
            interfaceC5737y0.mo9460h(context, producerName, eventName);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5737y0
    /* JADX INFO: renamed from: j */
    public void mo9462j(@NotNull InterfaceC5733w0 context, @Nullable String producerName, @Nullable Map<String, String> extraMap) {
        Intrinsics.checkNotNullParameter(context, "context");
        InterfaceC5739z0 interfaceC5739z0 = this.producerListener;
        if (interfaceC5739z0 != null) {
            interfaceC5739z0.onProducerFinishWithSuccess(context.getId(), producerName, extraMap);
        }
        InterfaceC5737y0 interfaceC5737y0 = this.producerListener2;
        if (interfaceC5737y0 != null) {
            interfaceC5737y0.mo9462j(context, producerName, extraMap);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5737y0
    /* JADX INFO: renamed from: k */
    public void mo9463k(@NotNull InterfaceC5733w0 context, @Nullable String producerName, @Nullable Throwable t11, @Nullable Map<String, String> extraMap) {
        Intrinsics.checkNotNullParameter(context, "context");
        InterfaceC5739z0 interfaceC5739z0 = this.producerListener;
        if (interfaceC5739z0 != null) {
            interfaceC5739z0.onProducerFinishWithFailure(context.getId(), producerName, t11, extraMap);
        }
        InterfaceC5737y0 interfaceC5737y0 = this.producerListener2;
        if (interfaceC5737y0 != null) {
            interfaceC5737y0.mo9463k(context, producerName, t11, extraMap);
        }
    }

    public C5683c0(@Nullable InterfaceC5739z0 interfaceC5739z0, @Nullable InterfaceC5737y0 interfaceC5737y0) {
        this.producerListener = interfaceC5739z0;
        this.producerListener2 = interfaceC5737y0;
    }
}
