package androidx.camera.core.internal.utils;

import androidx.camera.core.ImageInfo;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraCaptureResults;

/* JADX INFO: loaded from: classes23.dex */
public final class ZslRingBuffer extends ArrayRingBuffer<ImageProxy> {
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.camera.core.internal.utils.ArrayRingBuffer, androidx.camera.core.internal.utils.RingBuffer
    public void enqueue(ImageProxy imageProxy) {
        if (isValidZslFrame(imageProxy.getImageInfo())) {
            super.enqueue(imageProxy);
        } else {
            this.mOnRemoveCallback.onRemove((T) imageProxy);
        }
    }

    public ZslRingBuffer(int i11, RingBuffer.OnRemoveCallback<ImageProxy> onRemoveCallback) {
        super(i11, onRemoveCallback);
    }

    private boolean isValidZslFrame(ImageInfo imageInfo) {
        CameraCaptureResult cameraCaptureResultRetrieveCameraCaptureResult = CameraCaptureResults.retrieveCameraCaptureResult(imageInfo);
        if (cameraCaptureResultRetrieveCameraCaptureResult == null) {
            return false;
        }
        if ((cameraCaptureResultRetrieveCameraCaptureResult.getAfState() != CameraCaptureMetaData.AfState.LOCKED_FOCUSED && cameraCaptureResultRetrieveCameraCaptureResult.getAfState() != CameraCaptureMetaData.AfState.PASSIVE_FOCUSED) || cameraCaptureResultRetrieveCameraCaptureResult.getAeState() != CameraCaptureMetaData.AeState.CONVERGED || cameraCaptureResultRetrieveCameraCaptureResult.getAwbState() != CameraCaptureMetaData.AwbState.CONVERGED) {
            return false;
        }
        return true;
    }
}
