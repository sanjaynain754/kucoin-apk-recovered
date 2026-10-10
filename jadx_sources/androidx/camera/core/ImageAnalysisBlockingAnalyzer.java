package androidx.camera.core;

import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;

/* JADX INFO: loaded from: classes23.dex */
final class ImageAnalysisBlockingAnalyzer extends ImageAnalysisAbstractAnalyzer {
    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    public ImageProxy acquireImage(ImageReaderProxy imageReaderProxy) {
        return imageReaderProxy.acquireNextImage();
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    public void onValidImageAvailable(final ImageProxy imageProxy) {
        Futures.addCallback(analyzeImage(imageProxy), new FutureCallback<Void>() { // from class: androidx.camera.core.ImageAnalysisBlockingAnalyzer.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Void r11) {
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th2) {
                imageProxy.close();
            }
        }, CameraXExecutors.directExecutor());
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    public void clearCache() {
    }
}
