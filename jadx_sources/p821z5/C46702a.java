package p821z5;

import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: z5.a */
/* JADX INFO: compiled from: BaseRequestListener.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ5\u0010\u001f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J=\u0010\"\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u00112\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\"\u0010#J5\u0010$\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u001dH\u0016¢\u0006\u0004\b$\u0010 J'\u0010&\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010%\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)¨\u0006*"}, m90084d2 = {"Lz5/a;", "Lz5/d;", "<init>", "()V", "Lcom/facebook/imagepipeline/request/ImageRequest;", "request", "", "callerContext", "", "requestId", "", "isPrefetch", "", "onRequestStart", "(Lcom/facebook/imagepipeline/request/ImageRequest;Ljava/lang/Object;Ljava/lang/String;Z)V", "onRequestSuccess", "(Lcom/facebook/imagepipeline/request/ImageRequest;Ljava/lang/String;Z)V", "", "throwable", "onRequestFailure", "(Lcom/facebook/imagepipeline/request/ImageRequest;Ljava/lang/String;Ljava/lang/Throwable;Z)V", "onRequestCancellation", "(Ljava/lang/String;)V", "producerName", "onProducerStart", "(Ljava/lang/String;Ljava/lang/String;)V", "eventName", "onProducerEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "extraMap", "onProducerFinishWithSuccess", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "t", "onProducerFinishWithFailure", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "onProducerFinishWithCancellation", "successful", "onUltimateProducerReached", "(Ljava/lang/String;Ljava/lang/String;Z)V", "requiresExtraMap", "(Ljava/lang/String;)Z", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public class C46702a implements InterfaceC46705d {
    @Override // com.facebook.imagepipeline.producers.InterfaceC5739z0
    public void onProducerEvent(@NotNull String requestId, @NotNull String producerName, @NotNull String eventName) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5739z0
    public void onProducerFinishWithCancellation(@NotNull String requestId, @NotNull String producerName, @Nullable Map<String, String> extraMap) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5739z0
    public void onProducerFinishWithFailure(@NotNull String requestId, @NotNull String producerName, @NotNull Throwable t11, @Nullable Map<String, String> extraMap) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Intrinsics.checkNotNullParameter(t11, "t");
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5739z0
    public void onProducerFinishWithSuccess(@NotNull String requestId, @NotNull String producerName, @Nullable Map<String, String> extraMap) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5739z0
    public void onProducerStart(@NotNull String requestId, @NotNull String producerName) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
    }

    @Override // p821z5.InterfaceC46705d
    public void onRequestCancellation(@NotNull String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
    }

    @Override // p821z5.InterfaceC46705d
    public void onRequestFailure(@NotNull ImageRequest request, @NotNull String requestId, @NotNull Throwable throwable, boolean isPrefetch) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
    }

    @Override // p821z5.InterfaceC46705d
    public void onRequestStart(@NotNull ImageRequest request, @NotNull Object callerContext, @NotNull String requestId, boolean isPrefetch) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callerContext, "callerContext");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
    }

    @Override // p821z5.InterfaceC46705d
    public void onRequestSuccess(@NotNull ImageRequest request, @NotNull String requestId, boolean isPrefetch) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5739z0
    public void onUltimateProducerReached(@NotNull String requestId, @NotNull String producerName, boolean successful) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5739z0
    public boolean requiresExtraMap(@NotNull String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        return false;
    }
}
