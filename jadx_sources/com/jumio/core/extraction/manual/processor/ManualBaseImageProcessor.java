package com.jumio.core.extraction.manual.processor;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.Frame;
import com.jumio.core.processor.ProcessorImage;
import com.jumio.core.processor.ProcessorParameterInterface;
import com.jumio.core.processor.ProcessorState;
import com.jumio.core.processor.SingleImageProcessorBase;
import com.jumio.core.processor.base.BaseProcessorConfig;
import jumio.core.InterfaceC40705o2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tH\u0016R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/jumio/core/extraction/manual/processor/ManualBaseImageProcessor;", "Lcom/jumio/core/processor/SingleImageProcessorBase;", "Lcom/jumio/core/processor/base/BaseProcessorConfig;", "Lcom/jumio/core/processor/ProcessorImage$BaseImage;", "Lcom/jumio/core/processor/ManualImageProcessorInterface;", "config", "<init>", "(Lcom/jumio/core/processor/base/BaseProcessorConfig;)V", "uhdImageRequired", "", "getUhdImageRequired", "()Z", "process", "Lcom/jumio/core/processor/ProcessorState;", "bitmap", "Landroid/graphics/Bitmap;", "cameraSettings", "Lcom/jumio/commons/camera/CameraSettings;", "extractionArea", "Landroid/graphics/Rect;", "metadata", "Lcom/jumio/commons/camera/Frame$Metadata;", "takeImage", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ManualBaseImageProcessor extends SingleImageProcessorBase<BaseProcessorConfig, ProcessorImage.BaseImage> implements InterfaceC40705o2 {

    /* JADX INFO: renamed from: a */
    public final boolean f14134a;

    @Override // com.jumio.core.processor.ImageProcessorInterface, com.jumio.core.processor.CornerPointImageProcessorInterface
    @NotNull
    public ProcessorState process(@NotNull Bitmap bitmap, @NotNull CameraSettings cameraSettings, @NotNull Rect rect, @NotNull Frame.Metadata metadata, @NotNull ProcessorParameterInterface processorParameterInterface) {
        return super.process(bitmap, cameraSettings, rect, metadata, processorParameterInterface);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualBaseImageProcessor(@NotNull BaseProcessorConfig config) {
        super(config);
        Intrinsics.checkNotNullParameter(config, "config");
        this.f14134a = true;
    }

    @Override // com.jumio.core.processor.AbstractC9312a, com.jumio.core.processor.ImageProcessorInterface
    /* JADX INFO: renamed from: getUhdImageRequired, reason: from getter */
    public boolean getF14134a() {
        return this.f14134a;
    }

    @Override // jumio.core.InterfaceC40705o2
    @NotNull
    public ProcessorState process(@NotNull Bitmap bitmap, @NotNull CameraSettings cameraSettings, @NotNull Rect extractionArea, @NotNull Frame.Metadata metadata, boolean takeImage) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        Intrinsics.checkNotNullParameter(extractionArea, "extractionArea");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        if (getCurrentState() instanceof ProcessorState.TakePicture) {
            setCurrentState(new ProcessorState.Finished(null, null, 3, null));
        } else if (takeImage) {
            setCurrentState(new ProcessorState.TakePicture(null, null, null, 7, null));
        }
        return getCurrentState();
    }
}
