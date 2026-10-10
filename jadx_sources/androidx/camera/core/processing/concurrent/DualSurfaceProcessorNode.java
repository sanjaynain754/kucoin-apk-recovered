package androidx.camera.core.processing.concurrent;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.annotation.MainThread;
import androidx.camera.core.Logger;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.Node;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceProcessorInternal;
import androidx.camera.core.processing.TargetUtils;
import androidx.camera.core.processing.util.OutConfig;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes23.dex */
public class DualSurfaceProcessorNode implements Node<AbstractC1115In, Out> {
    private static final String TAG = "DualSurfaceProcessorNode";
    private AbstractC1115In mInput;
    private Out mOutput;
    final CameraInternal mPrimaryCameraInternal;
    final CameraInternal mSecondaryCameraInternal;
    final SurfaceProcessorInternal mSurfaceProcessor;

    /* JADX INFO: renamed from: androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode$In */
    @AutoValue
    public static abstract class AbstractC1115In {
        public abstract List<DualOutConfig> getOutConfigs();

        public abstract SurfaceEdge getPrimarySurfaceEdge();

        public abstract SurfaceEdge getSecondarySurfaceEdge();

        /* JADX INFO: renamed from: of */
        public static AbstractC1115In m2049of(SurfaceEdge surfaceEdge, SurfaceEdge surfaceEdge2, List<DualOutConfig> list) {
            return new AutoValue_DualSurfaceProcessorNode_In(surfaceEdge, surfaceEdge2, list);
        }
    }

    public static class Out extends HashMap<DualOutConfig, SurfaceEdge> {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2047a(DualSurfaceProcessorNode dualSurfaceProcessorNode) {
        Out out = dualSurfaceProcessorNode.mOutput;
        if (out != null) {
            Iterator<SurfaceEdge> it = out.values().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
        }
    }

    @Override // androidx.camera.core.processing.Node
    public void release() {
        this.mSurfaceProcessor.release();
        Threads.runOnMain(new Runnable() { // from class: androidx.camera.core.processing.concurrent.k
            @Override // java.lang.Runnable
            public final void run() {
                DualSurfaceProcessorNode.m2047a(this.f1781b);
            }
        });
    }

    @Override // androidx.camera.core.processing.Node
    @MainThread
    public Out transform(AbstractC1115In abstractC1115In) {
        Threads.checkMainThread();
        Logger.m1866d(TAG, "DualSurfaceProcessorNode Transform Processor = " + this.mSurfaceProcessor + "\n   primary input = " + abstractC1115In.getPrimarySurfaceEdge() + "\n   secondary input = " + abstractC1115In.getSecondarySurfaceEdge());
        Iterator<DualOutConfig> it = abstractC1115In.getOutConfigs().iterator();
        while (it.hasNext()) {
            Logger.m1866d("SurfaceProcessorNode", "   outputConfig = " + it.next());
        }
        this.mInput = abstractC1115In;
        this.mOutput = new Out();
        SurfaceEdge primarySurfaceEdge = this.mInput.getPrimarySurfaceEdge();
        SurfaceEdge secondarySurfaceEdge = this.mInput.getSecondarySurfaceEdge();
        for (DualOutConfig dualOutConfig : this.mInput.getOutConfigs()) {
            this.mOutput.put(dualOutConfig, transformSingleOutput(primarySurfaceEdge, dualOutConfig.getPrimaryOutConfig()));
        }
        sendSurfaceRequest(this.mPrimaryCameraInternal, primarySurfaceEdge, true);
        sendSurfaceRequest(this.mSecondaryCameraInternal, secondarySurfaceEdge, false);
        sendSurfaceOutputs(this.mPrimaryCameraInternal, this.mSecondaryCameraInternal, primarySurfaceEdge, secondarySurfaceEdge, this.mOutput);
        return this.mOutput;
    }

    public DualSurfaceProcessorNode(CameraInternal cameraInternal, CameraInternal cameraInternal2, SurfaceProcessorInternal surfaceProcessorInternal) {
        this.mPrimaryCameraInternal = cameraInternal;
        this.mSecondaryCameraInternal = cameraInternal2;
        this.mSurfaceProcessor = surfaceProcessorInternal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createAndSendSurfaceOutput(CameraInternal cameraInternal, CameraInternal cameraInternal2, SurfaceEdge surfaceEdge, SurfaceEdge surfaceEdge2, Map.Entry<DualOutConfig, SurfaceEdge> entry) {
        final SurfaceEdge value = entry.getValue();
        Logger.m1866d(TAG, "     -> outputEdge = " + value);
        Size resolution = surfaceEdge.getStreamSpec().getResolution();
        Rect cropRect = entry.getKey().getPrimaryOutConfig().getCropRect();
        if (!surfaceEdge.hasCameraTransform()) {
            cameraInternal = null;
        }
        SurfaceOutput.CameraInputInfo cameraInputInfoM1883of = SurfaceOutput.CameraInputInfo.m1883of(resolution, cropRect, cameraInternal, entry.getKey().getPrimaryOutConfig().getRotationDegrees(), entry.getKey().getPrimaryOutConfig().isMirroring());
        Size resolution2 = surfaceEdge2.getStreamSpec().getResolution();
        Rect cropRect2 = entry.getKey().getSecondaryOutConfig().getCropRect();
        if (!surfaceEdge2.hasCameraTransform()) {
            cameraInternal2 = null;
        }
        Futures.addCallback(value.createSurfaceOutputFuture(entry.getKey().getPrimaryOutConfig().getFormat(), cameraInputInfoM1883of, SurfaceOutput.CameraInputInfo.m1883of(resolution2, cropRect2, cameraInternal2, entry.getKey().getSecondaryOutConfig().getRotationDegrees(), entry.getKey().getSecondaryOutConfig().isMirroring())), new FutureCallback<SurfaceOutput>() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th2) {
                if (value.getTargets() == 2 && (th2 instanceof CancellationException)) {
                    Logger.m1866d(DualSurfaceProcessorNode.TAG, "Downstream VideoCapture failed to provide Surface.");
                    return;
                }
                Logger.m1873w(DualSurfaceProcessorNode.TAG, "Downstream node failed to provide Surface. Target: " + TargetUtils.getHumanReadableName(value.getTargets()), th2);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(SurfaceOutput surfaceOutput) {
                Preconditions.checkNotNull(surfaceOutput);
                try {
                    DualSurfaceProcessorNode.this.mSurfaceProcessor.onOutputSurface(surfaceOutput);
                } catch (ProcessingException e11) {
                    Logger.m1869e(DualSurfaceProcessorNode.TAG, "Failed to send SurfaceOutput to SurfaceProcessor.", e11);
                }
            }
        }, CameraXExecutors.mainThreadExecutor());
    }

    private void sendSurfaceOutputs(CameraInternal cameraInternal, CameraInternal cameraInternal2, SurfaceEdge surfaceEdge, SurfaceEdge surfaceEdge2, Map<DualOutConfig, SurfaceEdge> map) {
        for (final Map.Entry<DualOutConfig, SurfaceEdge> entry : map.entrySet()) {
            final CameraInternal cameraInternal3 = cameraInternal;
            final CameraInternal cameraInternal4 = cameraInternal2;
            final SurfaceEdge surfaceEdge3 = surfaceEdge;
            final SurfaceEdge surfaceEdge4 = surfaceEdge2;
            createAndSendSurfaceOutput(cameraInternal3, cameraInternal4, surfaceEdge3, surfaceEdge4, entry);
            entry.getValue().addOnInvalidatedListener(new Runnable() { // from class: androidx.camera.core.processing.concurrent.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1782b.createAndSendSurfaceOutput(cameraInternal3, cameraInternal4, surfaceEdge3, surfaceEdge4, entry);
                }
            });
            cameraInternal = cameraInternal3;
            cameraInternal2 = cameraInternal4;
            surfaceEdge = surfaceEdge3;
            surfaceEdge2 = surfaceEdge4;
        }
    }

    private void sendSurfaceRequest(CameraInternal cameraInternal, SurfaceEdge surfaceEdge, boolean z11) {
        try {
            this.mSurfaceProcessor.onInputSurface(surfaceEdge.createSurfaceRequest(cameraInternal, z11));
        } catch (ProcessingException e11) {
            Logger.m1869e(TAG, "Failed to send SurfaceRequest to SurfaceProcessor.", e11);
        }
    }

    private SurfaceEdge transformSingleOutput(SurfaceEdge surfaceEdge, OutConfig outConfig) {
        boolean z11;
        Rect cropRect = outConfig.getCropRect();
        int rotationDegrees = outConfig.getRotationDegrees();
        boolean zIsMirroring = outConfig.isMirroring();
        Matrix matrix = new Matrix(surfaceEdge.getSensorToBufferTransform());
        matrix.postConcat(TransformUtils.getRectToRect(new RectF(cropRect), TransformUtils.sizeToRectF(outConfig.getSize()), rotationDegrees, zIsMirroring));
        Preconditions.checkArgument(TransformUtils.isAspectRatioMatchingWithRoundingError(TransformUtils.getRotatedSize(cropRect, rotationDegrees), outConfig.getSize()));
        Rect rectSizeToRect = TransformUtils.sizeToRect(outConfig.getSize());
        StreamSpec streamSpecBuild = surfaceEdge.getStreamSpec().toBuilder().setResolution(outConfig.getSize()).build();
        int targets = outConfig.getTargets();
        int format = outConfig.getFormat();
        int rotationDegrees2 = surfaceEdge.getRotationDegrees() - rotationDegrees;
        if (surfaceEdge.isMirroring() != zIsMirroring) {
            z11 = true;
        } else {
            z11 = false;
        }
        return new SurfaceEdge(targets, format, streamSpecBuild, matrix, false, rectSizeToRect, rotationDegrees2, -1, z11);
    }
}
