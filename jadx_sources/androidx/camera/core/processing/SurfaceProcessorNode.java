package androidx.camera.core.processing;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.annotation.MainThread;
import androidx.camera.core.Logger;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.util.OutConfig;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes23.dex */
public class SurfaceProcessorNode implements Node<AbstractC1107In, Out> {
    private static final String TAG = "SurfaceProcessorNode";
    final CameraInternal mCameraInternal;
    private AbstractC1107In mInput;
    private Out mOutput;
    final SurfaceProcessorInternal mSurfaceProcessor;

    /* JADX INFO: renamed from: androidx.camera.core.processing.SurfaceProcessorNode$In */
    @AutoValue
    public static abstract class AbstractC1107In {
        public abstract List<OutConfig> getOutConfigs();

        public abstract SurfaceEdge getSurfaceEdge();

        /* JADX INFO: renamed from: of */
        public static AbstractC1107In m2034of(SurfaceEdge surfaceEdge, List<OutConfig> list) {
            return new AutoValue_SurfaceProcessorNode_In(surfaceEdge, list);
        }
    }

    public static class Out extends HashMap<OutConfig, SurfaceEdge> {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m2033c(SurfaceProcessorNode surfaceProcessorNode) {
        Out out = surfaceProcessorNode.mOutput;
        if (out != null) {
            Iterator<SurfaceEdge> it = out.values().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
        }
    }

    private void sendSurfaceRequest(SurfaceEdge surfaceEdge) {
        try {
            this.mSurfaceProcessor.onInputSurface(surfaceEdge.createSurfaceRequest(this.mCameraInternal));
        } catch (ProcessingException e11) {
            Logger.m1869e(TAG, "Failed to send SurfaceRequest to SurfaceProcessor.", e11);
        }
    }

    public SurfaceProcessorInternal getSurfaceProcessor() {
        return this.mSurfaceProcessor;
    }

    @Override // androidx.camera.core.processing.Node
    public void release() {
        this.mSurfaceProcessor.release();
        Threads.runOnMain(new Runnable() { // from class: androidx.camera.core.processing.g0
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceProcessorNode.m2033c(this.f1802b);
            }
        });
    }

    public void setUpRotationUpdates(SurfaceEdge surfaceEdge, final Map<OutConfig, SurfaceEdge> map) {
        surfaceEdge.addTransformationUpdateListener(new Consumer() { // from class: androidx.camera.core.processing.f0
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                SurfaceProcessorNode.m2032b(map, (SurfaceRequest.TransformationInfo) obj);
            }
        });
    }

    @Override // androidx.camera.core.processing.Node
    @MainThread
    public Out transform(AbstractC1107In abstractC1107In) {
        Threads.checkMainThread();
        Logger.m1866d(TAG, "SurfaceProcessorNode Transform (Processor=" + this.mSurfaceProcessor + "\n   inputEdge = " + abstractC1107In.getSurfaceEdge());
        Iterator<OutConfig> it = abstractC1107In.getOutConfigs().iterator();
        while (it.hasNext()) {
            Logger.m1866d(TAG, "   outputConfig = " + it.next());
        }
        this.mInput = abstractC1107In;
        this.mOutput = new Out();
        SurfaceEdge surfaceEdge = abstractC1107In.getSurfaceEdge();
        for (OutConfig outConfig : abstractC1107In.getOutConfigs()) {
            this.mOutput.put(outConfig, transformSingleOutput(surfaceEdge, outConfig));
        }
        sendSurfaceRequest(surfaceEdge);
        sendSurfaceOutputs(surfaceEdge, this.mOutput);
        setUpRotationUpdates(surfaceEdge, this.mOutput);
        return this.mOutput;
    }

    public SurfaceProcessorNode(CameraInternal cameraInternal, SurfaceProcessorInternal surfaceProcessorInternal) {
        this.mCameraInternal = cameraInternal;
        this.mSurfaceProcessor = surfaceProcessorInternal;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2032b(Map map, SurfaceRequest.TransformationInfo transformationInfo) {
        for (Map.Entry entry : map.entrySet()) {
            int rotationDegrees = transformationInfo.getRotationDegrees() - ((OutConfig) entry.getKey()).getRotationDegrees();
            if (((OutConfig) entry.getKey()).isMirroring()) {
                rotationDegrees = -rotationDegrees;
            }
            ((SurfaceEdge) entry.getValue()).updateTransformation(TransformUtils.within360(rotationDegrees), -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createAndSendSurfaceOutput(SurfaceEdge surfaceEdge, Map.Entry<OutConfig, SurfaceEdge> entry) {
        CameraInternal cameraInternal;
        final SurfaceEdge value = entry.getValue();
        Logger.m1866d(TAG, "     -> outputEdge = " + value);
        Size resolution = surfaceEdge.getStreamSpec().getResolution();
        Rect cropRect = entry.getKey().getCropRect();
        if (surfaceEdge.hasCameraTransform()) {
            cameraInternal = this.mCameraInternal;
        } else {
            cameraInternal = null;
        }
        Futures.addCallback(value.createSurfaceOutputFuture(entry.getKey().getFormat(), SurfaceOutput.CameraInputInfo.m1883of(resolution, cropRect, cameraInternal, entry.getKey().getRotationDegrees(), entry.getKey().isMirroring()), null), new FutureCallback<SurfaceOutput>() { // from class: androidx.camera.core.processing.SurfaceProcessorNode.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th2) {
                if (value.getTargets() == 2 && (th2 instanceof CancellationException)) {
                    Logger.m1866d(SurfaceProcessorNode.TAG, "Downstream VideoCapture failed to provide Surface.");
                    return;
                }
                Logger.m1873w(SurfaceProcessorNode.TAG, "Downstream node failed to provide Surface. Target: " + TargetUtils.getHumanReadableName(value.getTargets()), th2);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(SurfaceOutput surfaceOutput) {
                Preconditions.checkNotNull(surfaceOutput);
                try {
                    SurfaceProcessorNode.this.mSurfaceProcessor.onOutputSurface(surfaceOutput);
                } catch (ProcessingException e11) {
                    Logger.m1869e(SurfaceProcessorNode.TAG, "Failed to send SurfaceOutput to SurfaceProcessor.", e11);
                }
            }
        }, CameraXExecutors.mainThreadExecutor());
    }

    private void sendSurfaceOutputs(final SurfaceEdge surfaceEdge, Map<OutConfig, SurfaceEdge> map) {
        for (final Map.Entry<OutConfig, SurfaceEdge> entry : map.entrySet()) {
            createAndSendSurfaceOutput(surfaceEdge, entry);
            entry.getValue().addOnInvalidatedListener(new Runnable() { // from class: androidx.camera.core.processing.e0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1794b.createAndSendSurfaceOutput(surfaceEdge, entry);
                }
            });
        }
    }

    private SurfaceEdge transformSingleOutput(SurfaceEdge surfaceEdge, OutConfig outConfig) {
        Rect rectSizeToRect;
        boolean z11;
        Rect cropRect = outConfig.getCropRect();
        int rotationDegrees = outConfig.getRotationDegrees();
        boolean zIsMirroring = outConfig.isMirroring();
        Matrix matrix = new Matrix(surfaceEdge.getSensorToBufferTransform());
        Matrix rectToRect = TransformUtils.getRectToRect(new RectF(cropRect), TransformUtils.sizeToRectF(outConfig.getSize()), rotationDegrees, zIsMirroring);
        matrix.postConcat(rectToRect);
        Preconditions.checkArgument(TransformUtils.isAspectRatioMatchingWithRoundingError(TransformUtils.getRotatedSize(cropRect, rotationDegrees), outConfig.getSize()));
        if (outConfig.shouldRespectInputCropRect()) {
            Preconditions.checkArgument(outConfig.getCropRect().contains(surfaceEdge.getCropRect()), String.format("Output crop rect %s must contain input crop rect %s", outConfig.getCropRect(), surfaceEdge.getCropRect()));
            rectSizeToRect = new Rect();
            RectF rectF = new RectF(surfaceEdge.getCropRect());
            rectToRect.mapRect(rectF);
            rectF.round(rectSizeToRect);
        } else {
            rectSizeToRect = TransformUtils.sizeToRect(outConfig.getSize());
        }
        Rect rect = rectSizeToRect;
        StreamSpec streamSpecBuild = surfaceEdge.getStreamSpec().toBuilder().setResolution(outConfig.getSize()).build();
        int targets = outConfig.getTargets();
        int format = outConfig.getFormat();
        int rotationDegrees2 = surfaceEdge.getRotationDegrees() - rotationDegrees;
        if (surfaceEdge.isMirroring() != zIsMirroring) {
            z11 = true;
        } else {
            z11 = false;
        }
        return new SurfaceEdge(targets, format, streamSpecBuild, matrix, false, rect, rotationDegrees2, -1, z11);
    }
}
