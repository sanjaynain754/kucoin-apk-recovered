package com.jumio.core.extraction.docfinder.processor;

import com.jumio.core.extraction.docfinder.processor.base.DocfinderBaseImageProcessor;
import com.jumio.core.extraction.docfinder.processor.tilted.TiltedImageProcessor;
import com.jumio.core.processor.ImageProcessorConfig;
import com.jumio.core.processor.ImageProcessorFactoryInterface;
import com.jumio.core.processor.ImageProcessorInterface;
import com.jumio.core.processor.alignment.AlignmentConfig;
import com.jumio.core.processor.base.BaseProcessorConfig;
import com.jumio.core.processor.challenge.CameraChallengeImageProcessor;
import com.jumio.core.processor.challenge.CameraChallengeProcessorConfig;
import com.jumio.core.processor.flash.FlashImageProcessor;
import com.jumio.core.processor.flash.FlashProcessorConfig;
import com.jumio.core.processor.tilted.TiltedProcessorConfig;
import com.jumio.core.toolkit.ToolkitProviderInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/jumio/core/extraction/docfinder/processor/DocfinderProcessorFactory;", "Lcom/jumio/core/processor/ImageProcessorFactoryInterface;", "alignmentConfig", "Lcom/jumio/core/processor/alignment/AlignmentConfig;", "<init>", "(Lcom/jumio/core/processor/alignment/AlignmentConfig;)V", "createImageProcessor", "Lcom/jumio/core/processor/ImageProcessorInterface;", "imageProcessorConfig", "Lcom/jumio/core/processor/ImageProcessorConfig;", "jumio-docfinder_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DocfinderProcessorFactory implements ImageProcessorFactoryInterface {

    /* JADX INFO: renamed from: a */
    public final AlignmentConfig f14082a;

    /* JADX WARN: Multi-variable type inference failed */
    public DocfinderProcessorFactory() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public DocfinderProcessorFactory(@NotNull AlignmentConfig alignmentConfig) {
        Intrinsics.checkNotNullParameter(alignmentConfig, "alignmentConfig");
        this.f14082a = alignmentConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.jumio.core.processor.ImageProcessorFactoryInterface
    @Nullable
    public ImageProcessorInterface createImageProcessor(@NotNull ImageProcessorConfig<?> imageProcessorConfig) {
        Intrinsics.checkNotNullParameter(imageProcessorConfig, "imageProcessorConfig");
        if (imageProcessorConfig instanceof BaseProcessorConfig) {
            return new DocfinderBaseImageProcessor((BaseProcessorConfig) imageProcessorConfig, this.f14082a);
        }
        if (imageProcessorConfig instanceof FlashProcessorConfig) {
            return new FlashImageProcessor((FlashProcessorConfig) imageProcessorConfig, 0, null, 6, null);
        }
        if (imageProcessorConfig instanceof TiltedProcessorConfig) {
            return new TiltedImageProcessor((TiltedProcessorConfig) imageProcessorConfig, this.f14082a, null, 4, null);
        }
        ToolkitProviderInterface toolkitProviderInterface = null;
        Object[] objArr = 0;
        if (imageProcessorConfig instanceof CameraChallengeProcessorConfig) {
            return new CameraChallengeImageProcessor((CameraChallengeProcessorConfig) imageProcessorConfig, toolkitProviderInterface, 2, objArr == true ? 1 : 0);
        }
        return null;
    }

    public /* synthetic */ DocfinderProcessorFactory(AlignmentConfig alignmentConfig, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new AlignmentConfig(0.0f, 0.0f, null, 7, null) : alignmentConfig);
    }
}
