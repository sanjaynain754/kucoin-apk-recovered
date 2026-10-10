package com.jumio.core.processor.flash;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.Frame;
import com.jumio.commons.camera.MeteringConfig;
import com.jumio.commons.log.Log;
import com.jumio.commons.log.LogLevel;
import com.jumio.core.processor.ProcessorImage;
import com.jumio.core.processor.ProcessorParameterInterface;
import com.jumio.core.processor.ProcessorState;
import com.jumio.core.processor.SingleImageProcessorBase;
import com.jumio.core.toolkit.DefaultToolkitProvider;
import com.jumio.core.toolkit.ToolkitInterface;
import com.jumio.core.toolkit.ToolkitProviderInterface;
import com.jumio.sdk.enums.JumioFlashState;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import jumio.core.AbstractC40729t1;
import jumio.core.C40724s1;
import jumio.core.C40734u1;
import jumio.core.C40739v1;
import jumio.core.C40744w1;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jdk7.AutoCloseableKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J0\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u0010%\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u0010'\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$2\u0006\u0010(\u001a\u00020$H\u0002J\u0010\u0010)\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010*\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010+\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0002J\n\u0010,\u001a\u0004\u0018\u00010$H\u0002J\u0010\u0010-\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, m90084d2 = {"Lcom/jumio/core/processor/flash/FlashImageProcessor;", "Lcom/jumio/core/processor/SingleImageProcessorBase;", "Lcom/jumio/core/processor/flash/FlashProcessorConfig;", "Lcom/jumio/core/processor/ProcessorImage$FlashImage;", "config", "flashRetryCounter", "", "toolkitProvider", "Lcom/jumio/core/toolkit/ToolkitProviderInterface;", "<init>", "(Lcom/jumio/core/processor/flash/FlashProcessorConfig;ILcom/jumio/core/toolkit/ToolkitProviderInterface;)V", DbParams.KEY_CHANNEL_RESULT, "Lcom/jumio/core/processor/flash/FlashProcessingResult;", "colorSpikeTime", "", "captureTime", "requestedState", "Lcom/jumio/sdk/enums/JumioFlashState;", "checkRequirements", "", "cameraSettings", "Lcom/jumio/commons/camera/CameraSettings;", "reset", "", "process", "Lcom/jumio/core/processor/ProcessorState;", "bitmap", "Landroid/graphics/Bitmap;", "extractionArea", "Landroid/graphics/Rect;", "metadata", "Lcom/jumio/commons/camera/Frame$Metadata;", "parameterInterface", "Lcom/jumio/core/processor/ProcessorParameterInterface;", "internalProcess", "currentFrame", "Lcom/jumio/core/processor/flash/FlashFrame;", "processFrame", "handleColorSpikeDetection", "isColorSpikeDetected", "referenceFrame", "handleLuxStabilization", "isLuxStabilized", "checkLuxVariationStability", "getReferenceFrame", "takePicture", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFlashImageProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlashImageProcessor.kt\ncom/jumio/core/processor/flash/FlashImageProcessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,192:1\n543#2,6:193\n295#2,2:200\n1#3:199\n*S KotlinDebug\n*F\n+ 1 FlashImageProcessor.kt\ncom/jumio/core/processor/flash/FlashImageProcessor\n*L\n158#1:193,6\n169#1:200,2\n*E\n"})
public final class FlashImageProcessor extends SingleImageProcessorBase<FlashProcessorConfig, ProcessorImage.FlashImage> {
    private long captureTime;
    private long colorSpikeTime;
    private int flashRetryCounter;

    @NotNull
    private JumioFlashState requestedState;

    @NotNull
    private final C40734u1 result;

    @NotNull
    private final ToolkitProviderInterface toolkitProvider;

    public /* synthetic */ FlashImageProcessor(FlashProcessorConfig flashProcessorConfig, int i11, ToolkitProviderInterface toolkitProviderInterface, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(flashProcessorConfig, (i12 & 2) != 0 ? 3 : i11, (i12 & 4) != 0 ? new DefaultToolkitProvider() : toolkitProviderInterface);
    }

    private final boolean checkLuxVariationStability(C40724s1 c40724s1) {
        Object objPrevious;
        ArrayList arrayList = this.result.f90441a;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (c40724s1.f90398d.getTimestamp() - ((C40724s1) objPrevious).f90398d.getTimestamp() <= ((FlashProcessorConfig) getConfig()).getImage().getSettings().getFlashAdaption().getLuxTimeWindow());
        C40724s1 c40724s2 = (C40724s1) objPrevious;
        if (c40724s2 != null) {
            double d11 = c40724s2.f90397c;
            Double dValueOf = d11 > 0.0d ? Double.valueOf(d11) : null;
            if (dValueOf != null) {
                if (Math.abs((c40724s1.f90397c / dValueOf.doubleValue()) - 1.0d) < ((FlashProcessorConfig) getConfig()).getImage().getSettings().getFlashAdaption().getLuxThreshold()) {
                    return true;
                }
            }
        }
        return false;
    }

    private final C40724s1 getReferenceFrame() {
        Object next;
        int i11 = AbstractC40729t1.f90416a[this.requestedState.ordinal()];
        if (i11 == 1) {
            return (C40724s1) CollectionsKt.firstOrNull((List) this.result.f90441a);
        }
        if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Iterator it = this.result.f90441a.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((C40724s1) next).f90398d.getTimestamp() == this.captureTime) {
                return (C40724s1) next;
            }
        }
        next = null;
        return (C40724s1) next;
    }

    private final boolean isColorSpikeDetected(C40724s1 c40724s1, C40724s1 c40724s2) {
        if (c40724s1.f90398d.getTimestamp() - c40724s2.f90398d.getTimestamp() > ((FlashProcessorConfig) getConfig()).getImage().getSettings().getFlashDetection().getTimeout()) {
            return true;
        }
        double d11 = c40724s1.f90396b;
        if (d11 > 0.0d) {
            double d12 = c40724s2.f90396b;
            if (d12 > 0.0d && Math.abs((d11 / d12) - 1.0d) > ((FlashProcessorConfig) getConfig()).getImage().getSettings().getFlashDetection().getColorShiftThreshold()) {
                return true;
            }
        }
        return false;
    }

    private final boolean isLuxStabilized(C40724s1 c40724s1) {
        long timestamp = c40724s1.f90398d.getTimestamp() - this.colorSpikeTime;
        if (timestamp < ((FlashProcessorConfig) getConfig()).getImage().getSettings().getFlashAdaption().getLuxTimeWindow()) {
            return false;
        }
        if (timestamp > ((FlashProcessorConfig) getConfig()).getImage().getSettings().getFlashAdaption().getTimeout()) {
            return true;
        }
        return checkLuxVariationStability(c40724s1);
    }

    private final ProcessorState takePicture(C40724s1 c40724s1) {
        if (c40724s1.f90398d.hasFlashFired()) {
            setImageStarted(false);
            this.captureTime = c40724s1.f90398d.getTimestamp();
            this.flashRetryCounter = 3;
            return new ProcessorState.TakePicture("FRONT_WITH_FLASH", null, null, 6, null);
        }
        int i11 = this.flashRetryCounter;
        if (i11 <= 0) {
            return ProcessorState.Skip.INSTANCE;
        }
        this.flashRetryCounter = i11 - 1;
        resetStart();
        shouldStart();
        return ProcessorState.Processing.INSTANCE;
    }

    @Override // com.jumio.core.processor.AbstractC9312a, com.jumio.core.processor.ImageProcessorInterface
    public boolean checkRequirements(@NotNull CameraSettings cameraSettings) {
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        return cameraSettings.getF13520f().getHasFlash();
    }

    @Override // com.jumio.core.processor.ImageProcessorInterface, com.jumio.core.processor.CornerPointImageProcessorInterface
    @NotNull
    public ProcessorState process(@NotNull Bitmap bitmap, @NotNull CameraSettings cameraSettings, @NotNull Rect extractionArea, @NotNull Frame.Metadata metadata, @NotNull ProcessorParameterInterface parameterInterface) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        Intrinsics.checkNotNullParameter(extractionArea, "extractionArea");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(parameterInterface, "parameterInterface");
        ProcessorState processorStateInternalProcess = internalProcess(processFrame(bitmap, metadata));
        if (!Intrinsics.areEqual(processorStateInternalProcess, ProcessorState.Processing.INSTANCE)) {
            setCurrentState(processorStateInternalProcess);
        }
        return processorStateInternalProcess;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlashImageProcessor(@NotNull FlashProcessorConfig config, int i11, @NotNull ToolkitProviderInterface toolkitProvider) {
        super(config);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(toolkitProvider, "toolkitProvider");
        this.flashRetryCounter = i11;
        this.toolkitProvider = toolkitProvider;
        this.result = new C40734u1();
        this.colorSpikeTime = -1L;
        this.captureTime = -1L;
        this.requestedState = JumioFlashState.OFF;
    }

    private final ProcessorState handleColorSpikeDetection(C40724s1 c40724s1) {
        C40724s1 referenceFrame = getReferenceFrame();
        if (referenceFrame == null) {
            return C40739v1.f90453a;
        }
        if (isColorSpikeDetected(c40724s1, referenceFrame)) {
            this.colorSpikeTime = c40724s1.f90398d.getTimestamp();
            if (this.requestedState == JumioFlashState.ON) {
                this.result.f90442b = c40724s1.f90398d.getTimestamp() - referenceFrame.f90398d.getTimestamp();
            }
            MeteringConfig.Builder builder = new MeteringConfig.Builder();
            builder.point(0.5f, 0.5f, 1.0f, 1.0f);
            MeteringConfig.Builder.mode$default(builder, true, false, false, 6, null);
            return new ProcessorState.RequestMetering(builder.build());
        }
        return C40739v1.f90453a;
    }

    private final ProcessorState handleLuxStabilization(C40724s1 c40724s1) {
        C40724s1 referenceFrame = getReferenceFrame();
        if (referenceFrame == null) {
            return C40744w1.f90462a;
        }
        if (c40724s1.f90398d.getTimestamp() - referenceFrame.f90398d.getTimestamp() >= getImage().getSettings().getMinimumCaptureTime() && isLuxStabilized(c40724s1)) {
            if (getImageStarted()) {
                this.result.f90443c = c40724s1.f90398d.getTimestamp() - this.colorSpikeTime;
                return takePicture(c40724s1);
            }
            Intrinsics.checkNotNullParameter(this.result, "<this>");
            Log log = Log.INSTANCE;
            LogLevel logLevel = LogLevel.OFF;
            return new ProcessorState.Finished("FRONT_WITH_FLASH", this.result);
        }
        return C40744w1.f90462a;
    }

    private final ProcessorState internalProcess(C40724s1 c40724s1) {
        if (getCurrentState() instanceof ProcessorState.TakePicture) {
            JumioFlashState jumioFlashState = JumioFlashState.OFF;
            this.requestedState = jumioFlashState;
            return new FlashProcessorState$Flash(jumioFlashState);
        }
        if (getCurrentState() instanceof FlashProcessorState$Flash) {
            return handleColorSpikeDetection(c40724s1);
        }
        if (getImageStarted() && shouldStart()) {
            JumioFlashState jumioFlashState2 = JumioFlashState.ON;
            this.requestedState = jumioFlashState2;
            return new FlashProcessorState$Flash(jumioFlashState2);
        }
        if (getCurrentState() instanceof C40739v1) {
            return handleColorSpikeDetection(c40724s1);
        }
        if (getCurrentState() instanceof ProcessorState.RequestMetering) {
            return C40744w1.f90462a;
        }
        if (getCurrentState() instanceof C40744w1) {
            return handleLuxStabilization(c40724s1);
        }
        return ProcessorState.Processing.INSTANCE;
    }

    private final C40724s1 processFrame(Bitmap bitmap, Frame.Metadata metadata) {
        double aperture;
        int iAverageColor$default;
        if (metadata.getIso() > 0 && metadata.getShutterSpeed() > 0) {
            aperture = (metadata.getAperture() * metadata.getAperture()) / (metadata.getShutterSpeed() * ((long) metadata.getIso()));
        } else {
            aperture = 0.0d;
        }
        double d11 = aperture;
        try {
            ToolkitInterface toolkitInterfaceCreate = this.toolkitProvider.create();
            try {
                iAverageColor$default = ToolkitInterface.averageColor$default(toolkitInterfaceCreate, bitmap, null, 2, null);
                AutoCloseableKt.closeFinally(toolkitInterfaceCreate, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AutoCloseableKt.closeFinally(toolkitInterfaceCreate, th2);
                    throw th3;
                }
            }
        } catch (Exception e11) {
            Log.printStackTrace(e11);
            iAverageColor$default = 0;
        }
        int i11 = iAverageColor$default;
        C40724s1 c40724s1 = new C40724s1(i11, ((double) (Color.blue(i11) + (Color.green(i11) + Color.red(i11)))) / 3.0d, d11, metadata);
        this.result.f90441a.add(c40724s1);
        return c40724s1;
    }

    @Override // com.jumio.core.processor.AbstractC9312a, com.jumio.core.processor.ImageProcessorInterface
    public void reset() {
        super.reset();
        this.flashRetryCounter = 3;
        this.colorSpikeTime = -1L;
        this.captureTime = -1L;
        this.requestedState = JumioFlashState.OFF;
    }
}
