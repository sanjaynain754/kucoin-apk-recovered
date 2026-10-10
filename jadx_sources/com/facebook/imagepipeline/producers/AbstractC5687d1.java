package com.facebook.imagepipeline.producers;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p651u3.AbstractRunnableC45105h;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.d1 */
/* JADX INFO: compiled from: StatefulProducerRunnable.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u000e\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0017\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00162\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010 R\"\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00168TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, m90084d2 = {"Lcom/facebook/imagepipeline/producers/d1;", ExifInterface.GPS_DIRECTION_TRUE, "Lu3/h;", "Lcom/facebook/imagepipeline/producers/m;", "consumer", "Lcom/facebook/imagepipeline/producers/y0;", "producerListener", "Lcom/facebook/imagepipeline/producers/w0;", "producerContext", "", "producerName", "<init>", "(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/y0;Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;)V", DbParams.KEY_CHANNEL_RESULT, "", "f", "(Ljava/lang/Object;)V", "Ljava/lang/Exception;", "e", "(Ljava/lang/Exception;)V", "d", "()V", "", "i", "(Ljava/lang/Object;)Ljava/util/Map;", "exception", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/Exception;)Ljava/util/Map;", "c", "Lcom/facebook/imagepipeline/producers/m;", "Lcom/facebook/imagepipeline/producers/y0;", "Lcom/facebook/imagepipeline/producers/w0;", "Ljava/lang/String;", "g", "()Ljava/util/Map;", "extraMapOnCancellation", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public abstract class AbstractC5687d1<T> extends AbstractRunnableC45105h<T> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5712m<T> consumer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5737y0 producerListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5733w0 producerContext;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String producerName;

    @Nullable
    /* JADX INFO: renamed from: g */
    public Map<String, String> m9657g() {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public Map<String, String> m9658h(@Nullable Exception exception) {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public Map<String, String> mo9587i(@Nullable T result) {
        return null;
    }

    public AbstractC5687d1(@NotNull InterfaceC5712m<T> consumer, @NotNull InterfaceC5737y0 producerListener, @NotNull InterfaceC5733w0 producerContext, @NotNull String producerName) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(producerListener, "producerListener");
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        this.consumer = consumer;
        this.producerListener = producerListener;
        this.producerContext = producerContext;
        this.producerName = producerName;
        producerListener.mo9454b(producerContext, producerName);
    }

    @Override // p651u3.AbstractRunnableC45105h
    /* JADX INFO: renamed from: d */
    public void mo9655d() {
        InterfaceC5737y0 interfaceC5737y0 = this.producerListener;
        InterfaceC5733w0 interfaceC5733w0 = this.producerContext;
        String str = this.producerName;
        interfaceC5737y0.mo9456d(interfaceC5733w0, str, interfaceC5737y0.mo9458f(interfaceC5733w0, str) ? m9657g() : null);
        this.consumer.mo9651a();
    }

    @Override // p651u3.AbstractRunnableC45105h
    /* JADX INFO: renamed from: e */
    public void mo9656e(@NotNull Exception e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        InterfaceC5737y0 interfaceC5737y0 = this.producerListener;
        InterfaceC5733w0 interfaceC5733w0 = this.producerContext;
        String str = this.producerName;
        interfaceC5737y0.mo9463k(interfaceC5733w0, str, e11, interfaceC5737y0.mo9458f(interfaceC5733w0, str) ? m9658h(e11) : null);
        this.consumer.onFailure(e11);
    }

    @Override // p651u3.AbstractRunnableC45105h
    /* JADX INFO: renamed from: f */
    public void mo9597f(@Nullable T result) {
        InterfaceC5737y0 interfaceC5737y0 = this.producerListener;
        InterfaceC5733w0 interfaceC5733w0 = this.producerContext;
        String str = this.producerName;
        interfaceC5737y0.mo9462j(interfaceC5733w0, str, interfaceC5737y0.mo9458f(interfaceC5733w0, str) ? mo9587i(result) : null);
        this.consumer.mo9652b(result, 1);
    }
}
