package com.facebook.imagepipeline.producers;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.s */
/* JADX INFO: compiled from: DelegatingConsumer.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m90084d2 = {"Lcom/facebook/imagepipeline/producers/s;", "I", "O", "Lcom/facebook/imagepipeline/producers/c;", "Lcom/facebook/imagepipeline/producers/m;", "consumer", "<init>", "(Lcom/facebook/imagepipeline/producers/m;)V", "", "t", "", "g", "(Ljava/lang/Throwable;)V", "f", "()V", "", "progress", "i", "(F)V", "b", "Lcom/facebook/imagepipeline/producers/m;", "o", "()Lcom/facebook/imagepipeline/producers/m;", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public abstract class AbstractC5724s<I, O> extends AbstractC5682c<I> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5712m<O> consumer;

    public AbstractC5724s(@NotNull InterfaceC5712m<O> consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.consumer = consumer;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5682c
    /* JADX INFO: renamed from: f */
    public void mo9549f() {
        this.consumer.mo9651a();
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5682c
    /* JADX INFO: renamed from: i */
    public void mo9552i(float progress) {
        this.consumer.mo9653c(progress);
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final InterfaceC5712m<O> m9801o() {
        return this.consumer;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5682c
    /* JADX INFO: renamed from: g */
    public void mo9550g(@NotNull Throwable t11) {
        Intrinsics.checkNotNullParameter(t11, "t");
        this.consumer.onFailure(t11);
    }
}
