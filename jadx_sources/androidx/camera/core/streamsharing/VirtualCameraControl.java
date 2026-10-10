package androidx.camera.core.streamsharing;

import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.ForwardingCameraControl;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class VirtualCameraControl extends ForwardingCameraControl {
    private static final int DEFAULT_JPEG_QUALITY = 100;
    private static final int DEFAULT_ROTATION_DEGREES = 0;
    private final StreamSharing.Control mStreamSharingControl;

    public VirtualCameraControl(CameraControlInternal cameraControlInternal, StreamSharing.Control control) {
        super(cameraControlInternal);
        this.mStreamSharingControl = control;
    }

    private int getJpegQuality(CaptureConfig captureConfig) {
        Integer num = (Integer) captureConfig.getImplementationOptions().retrieveOption(CaptureConfig.OPTION_JPEG_QUALITY, 100);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    private int getRotationDegrees(CaptureConfig captureConfig) {
        Integer num = (Integer) captureConfig.getImplementationOptions().retrieveOption(CaptureConfig.OPTION_ROTATION, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.impl.CameraControlInternal
    public ListenableFuture<List<Void>> submitStillCaptureRequests(final List<CaptureConfig> list, int i11, int i12) {
        boolean z11;
        if (list.size() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "Only support one capture config.");
        final ListenableFuture<CameraCapturePipeline> cameraCapturePipelineAsync = getCameraCapturePipelineAsync(i11, 1);
        return Futures.allAsList(Collections.singletonList(FutureChain.from(cameraCapturePipelineAsync).transformAsync(new AsyncFunction() { // from class: androidx.camera.core.streamsharing.f
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final ListenableFuture apply(Object obj) {
                return ((CameraCapturePipeline) cameraCapturePipelineAsync.get()).invokePreCapture();
            }
        }, CameraXExecutors.directExecutor()).transformAsync(new AsyncFunction() { // from class: androidx.camera.core.streamsharing.g
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final ListenableFuture apply(Object obj) {
                VirtualCameraControl virtualCameraControl = this.f1857a;
                List list2 = list;
                return virtualCameraControl.mStreamSharingControl.jpegSnapshot(virtualCameraControl.getJpegQuality((CaptureConfig) list2.get(0)), virtualCameraControl.getRotationDegrees((CaptureConfig) list2.get(0)));
            }
        }, CameraXExecutors.directExecutor()).transformAsync(new AsyncFunction() { // from class: androidx.camera.core.streamsharing.h
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final ListenableFuture apply(Object obj) {
                return ((CameraCapturePipeline) cameraCapturePipelineAsync.get()).invokePostCapture();
            }
        }, CameraXExecutors.directExecutor())));
    }
}
