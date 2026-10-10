package com.jumio.core.processor;

import com.jumio.core.models.SupplementalImage;
import com.jumio.core.models.TiltRange;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002¨\u0006\u0005"}, m90084d2 = {"asFlashImage", "Lcom/jumio/core/processor/ProcessorImage$FlashImage;", "Lcom/jumio/core/models/SupplementalImage;", "asTiltedImage", "Lcom/jumio/core/processor/ProcessorImage$TiltedImage;", "jumio-core_release"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ProcessorImageKt {
    @NotNull
    public static final ProcessorImage.FlashImage asFlashImage(@NotNull SupplementalImage supplementalImage) {
        Intrinsics.checkNotNullParameter(supplementalImage, "<this>");
        return new ProcessorImage.FlashImage(supplementalImage.getClassifier(), supplementalImage.getHoldStillTime(), supplementalImage.getUsabilityExpected(), supplementalImage.getFlashSettings());
    }

    @NotNull
    public static final ProcessorImage.TiltedImage asTiltedImage(@NotNull SupplementalImage supplementalImage) {
        Intrinsics.checkNotNullParameter(supplementalImage, "<this>");
        String classifier = supplementalImage.getClassifier();
        boolean flash = supplementalImage.getFlash();
        TiltRange tiltRange = supplementalImage.getTiltRange();
        if (tiltRange == null) {
            tiltRange = new TiltRange(0, 0);
        }
        return new ProcessorImage.TiltedImage(classifier, flash, tiltRange, supplementalImage.getHoldStillTime(), supplementalImage.getUsabilityExpected());
    }
}
