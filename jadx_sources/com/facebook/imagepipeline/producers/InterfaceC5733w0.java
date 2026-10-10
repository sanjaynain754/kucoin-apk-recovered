package com.facebook.imagepipeline.producers;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p617s5.InterfaceC44346r;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.w0 */
/* JADX INFO: compiled from: ProducerContext.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010%R\u0014\u00100\u001a\u00020-8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, m90084d2 = {"Lcom/facebook/imagepipeline/producers/w0;", "Lcom/facebook/fresco/middleware/HasExtraData;", "Lcom/facebook/imagepipeline/producers/x0;", "callbacks", "", "i", "(Lcom/facebook/imagepipeline/producers/x0;)V", "", "origin", "subcategory", "j", "(Ljava/lang/String;Ljava/lang/String;)V", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/lang/String;)V", "Lcom/facebook/imagepipeline/request/ImageRequest;", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Lcom/facebook/imagepipeline/request/ImageRequest;", "imageRequest", "getId", "()Ljava/lang/String;", "id", "k", "uiComponentId", "Lcom/facebook/imagepipeline/producers/y0;", "g", "()Lcom/facebook/imagepipeline/producers/y0;", "producerListener", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/Object;", "callerContext", "Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;", "o", "()Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;", "lowestPermittedRequestLevel", "", "n", "()Z", "isPrefetch", "Lcom/facebook/imagepipeline/common/Priority;", "getPriority", "()Lcom/facebook/imagepipeline/common/Priority;", "priority", "m", "isIntermediateResultExpected", "Ls5/r;", "b", "()Ls5/r;", "imagePipelineConfig", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface InterfaceC5733w0 extends HasExtraData {
    @NotNull
    /* JADX INFO: renamed from: a */
    Object mo9663a();

    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC44346r mo9664b();

    @NotNull
    /* JADX INFO: renamed from: g */
    InterfaceC5737y0 mo9665g();

    @NotNull
    String getId();

    @NotNull
    Priority getPriority();

    @NotNull
    /* JADX INFO: renamed from: h */
    ImageRequest mo9666h();

    /* JADX INFO: renamed from: i */
    void mo9667i(@NotNull InterfaceC5735x0 callbacks);

    /* JADX INFO: renamed from: j */
    void mo9668j(@Nullable String origin, @Nullable String subcategory);

    @Nullable
    /* JADX INFO: renamed from: k */
    String mo9669k();

    /* JADX INFO: renamed from: l */
    void mo9670l(@Nullable String origin);

    /* JADX INFO: renamed from: m */
    boolean mo9671m();

    /* JADX INFO: renamed from: n */
    boolean mo9672n();

    @NotNull
    /* JADX INFO: renamed from: o */
    ImageRequest.RequestLevel mo9673o();
}
