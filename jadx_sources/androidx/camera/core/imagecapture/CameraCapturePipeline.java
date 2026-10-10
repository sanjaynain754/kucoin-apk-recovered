package androidx.camera.core.imagecapture;

import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.ListenableFuture;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: CameraCapturePipeline.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H&J\u0010\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Landroidx/camera/core/imagecapture/CameraCapturePipeline;", "", "invokePreCapture", "Lcom/google/common/util/concurrent/ListenableFuture;", "Ljava/lang/Void;", "invokePostCapture", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface CameraCapturePipeline {
    @NotNull
    ListenableFuture<Void> invokePostCapture();

    @NotNull
    ListenableFuture<Void> invokePreCapture();
}
