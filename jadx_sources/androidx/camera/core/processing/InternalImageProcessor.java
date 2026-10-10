package androidx.camera.core.processing;

import androidx.camera.core.CameraEffect;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessor;
import androidx.camera.core.ProcessingException;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
public class InternalImageProcessor {
    private final Consumer<Throwable> mErrorListener;
    private final Executor mExecutor;
    private final ImageProcessor mImageProcessor;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m2017a(final InternalImageProcessor internalImageProcessor, final ImageProcessor.Request request, final CallbackToFutureAdapter.Completer completer) {
        internalImageProcessor.mExecutor.execute(new Runnable() { // from class: androidx.camera.core.processing.q
            @Override // java.lang.Runnable
            public final void run() {
                InternalImageProcessor.m2018b(this.f1825b, request, completer);
            }
        });
        return "InternalImageProcessor#process " + request.hashCode();
    }

    public ImageProcessor.Response safeProcess(final ImageProcessor.Request request) throws ImageCaptureException {
        try {
            return (ImageProcessor.Response) CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.processing.r
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return InternalImageProcessor.m2017a(this.f1828a, request, completer);
                }
            }).get();
        } catch (Exception e11) {
            e = e11;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new ImageCaptureException(0, "Failed to invoke ImageProcessor.", e);
        }
    }

    public InternalImageProcessor(CameraEffect cameraEffect) {
        boolean z11;
        if (cameraEffect.getTargets() == 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11);
        this.mExecutor = cameraEffect.getExecutor();
        ImageProcessor imageProcessor = cameraEffect.getImageProcessor();
        Objects.requireNonNull(imageProcessor);
        this.mImageProcessor = imageProcessor;
        this.mErrorListener = cameraEffect.getErrorListener();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2018b(InternalImageProcessor internalImageProcessor, ImageProcessor.Request request, CallbackToFutureAdapter.Completer completer) {
        internalImageProcessor.getClass();
        try {
            completer.set(internalImageProcessor.mImageProcessor.process(request));
        } catch (ProcessingException e11) {
            internalImageProcessor.mErrorListener.accept(e11);
            completer.setException(e11);
        }
    }
}
