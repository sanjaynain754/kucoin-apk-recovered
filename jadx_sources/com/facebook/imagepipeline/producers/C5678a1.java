package com.facebook.imagepipeline.producers;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.common.memory.PooledByteBuffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a4.AbstractC0110a;
import p749x5.C46075i;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.a1 */
/* JADX INFO: compiled from: RemoveImageTransformMetaDataProducer.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\rB\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/facebook/imagepipeline/producers/a1;", "Lcom/facebook/imagepipeline/producers/v0;", "La4/a;", "Lcom/facebook/common/memory/PooledByteBuffer;", "Lx5/i;", "inputProducer", "<init>", "(Lcom/facebook/imagepipeline/producers/v0;)V", "Lcom/facebook/imagepipeline/producers/m;", "consumer", "Lcom/facebook/imagepipeline/producers/w0;", "context", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)V", "Lcom/facebook/imagepipeline/producers/v0;", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C5678a1 implements InterfaceC5731v0<AbstractC0110a<PooledByteBuffer>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5731v0<C46075i> inputProducer;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.a1$a */
    /* JADX INFO: compiled from: RemoveImageTransformMetaDataProducer.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/facebook/imagepipeline/producers/a1$a;", "Lcom/facebook/imagepipeline/producers/s;", "Lx5/i;", "La4/a;", "Lcom/facebook/common/memory/PooledByteBuffer;", "Lcom/facebook/imagepipeline/producers/m;", "consumer", "<init>", "(Lcom/facebook/imagepipeline/producers/a1;Lcom/facebook/imagepipeline/producers/m;)V", "newResult", "", "status", "", "p", "(Lx5/i;I)V", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public final class a extends AbstractC5724s<C46075i, AbstractC0110a<PooledByteBuffer>> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C5678a1 f9264c;

        @Override // com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo9551h(@Nullable C46075i newResult, int status) {
            AbstractC0110a<PooledByteBuffer> abstractC0110aM101574i = null;
            try {
                if (C46075i.m101554E(newResult) && newResult != null) {
                    abstractC0110aM101574i = newResult.m101574i();
                }
                m9801o().mo9652b(abstractC0110aM101574i, status);
            } finally {
                AbstractC0110a.m555j(abstractC0110aM101574i);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull C5678a1 c5678a1, InterfaceC5712m<AbstractC0110a<PooledByteBuffer>> consumer) {
            super(consumer);
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            this.f9264c = c5678a1;
        }
    }

    public C5678a1(@NotNull InterfaceC5731v0<C46075i> inputProducer) {
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        this.inputProducer = inputProducer;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5731v0
    /* JADX INFO: renamed from: a */
    public void mo9524a(@NotNull InterfaceC5712m<AbstractC0110a<PooledByteBuffer>> consumer, @NotNull InterfaceC5733w0 context) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(context, "context");
        this.inputProducer.mo9524a(new a(this, consumer), context);
    }
}
