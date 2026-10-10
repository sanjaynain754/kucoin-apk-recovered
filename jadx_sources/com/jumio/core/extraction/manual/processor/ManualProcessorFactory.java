package com.jumio.core.extraction.manual.processor;

import com.jumio.core.processor.ImageProcessorConfig;
import com.jumio.core.processor.ImageProcessorFactoryInterface;
import com.jumio.core.processor.ImageProcessorInterface;
import com.jumio.core.processor.base.BaseProcessorConfig;
import com.jumio.core.processor.challenge.CameraChallengeImageProcessor;
import com.jumio.core.processor.challenge.CameraChallengeProcessorConfig;
import com.jumio.core.processor.flash.FlashImageProcessor;
import com.jumio.core.processor.flash.FlashProcessorConfig;
import com.jumio.core.toolkit.ToolkitProviderInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/extraction/manual/processor/ManualProcessorFactory;", "Lcom/jumio/core/processor/ImageProcessorFactoryInterface;", "<init>", "()V", "createImageProcessor", "Lcom/jumio/core/processor/ImageProcessorInterface;", "imageProcessorConfig", "Lcom/jumio/core/processor/ImageProcessorConfig;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ManualProcessorFactory implements ImageProcessorFactoryInterface {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.jumio.core.processor.ImageProcessorFactoryInterface
    @Nullable
    public ImageProcessorInterface createImageProcessor(@NotNull ImageProcessorConfig<?> imageProcessorConfig) {
        Intrinsics.checkNotNullParameter(imageProcessorConfig, "imageProcessorConfig");
        if (imageProcessorConfig instanceof BaseProcessorConfig) {
            return new ManualBaseImageProcessor((BaseProcessorConfig) imageProcessorConfig);
        }
        if (imageProcessorConfig instanceof FlashProcessorConfig) {
            FlashProcessorConfig flashProcessorConfig = (FlashProcessorConfig) imageProcessorConfig;
            if (flashProcessorConfig.getManualEnabled()) {
                return new FlashImageProcessor(flashProcessorConfig, 0, null, 6, null);
            }
        }
        ToolkitProviderInterface toolkitProviderInterface = null;
        Object[] objArr = 0;
        if (imageProcessorConfig instanceof CameraChallengeProcessorConfig) {
            CameraChallengeProcessorConfig cameraChallengeProcessorConfig = (CameraChallengeProcessorConfig) imageProcessorConfig;
            if (cameraChallengeProcessorConfig.getCameraChallengeData().f90151a) {
                return new CameraChallengeImageProcessor(cameraChallengeProcessorConfig, toolkitProviderInterface, 2, objArr == true ? 1 : 0);
            }
        }
        return null;
    }
}
