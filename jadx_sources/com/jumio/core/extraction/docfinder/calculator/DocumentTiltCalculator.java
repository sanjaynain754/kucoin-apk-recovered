package com.jumio.core.extraction.docfinder.calculator;

import com.jumio.core.data.document.CornerPoints;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"Lcom/jumio/core/extraction/docfinder/calculator/DocumentTiltCalculator;", "Lcom/jumio/core/extraction/docfinder/calculator/DocumentTiltCalculatorInterface;", "<init>", "()V", "calculateTilt", "Lcom/jumio/core/extraction/docfinder/calculator/DocumentTilt;", "corners", "Lcom/jumio/core/data/document/CornerPoints;", "referenceRatio", "", "jumio-docfinder_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DocumentTiltCalculator implements DocumentTiltCalculatorInterface {
    @Override // com.jumio.core.extraction.docfinder.calculator.DocumentTiltCalculatorInterface
    @NotNull
    public DocumentTilt calculateTilt(@NotNull CornerPoints corners, float referenceRatio) {
        Intrinsics.checkNotNullParameter(corners, "corners");
        return new DocumentTilt((int) (((float) Math.acos(Math.min(1.0f, referenceRatio / corners.getAspectRatio()))) * 57.29578f), corners.getF13788i() > corners.getF13790k() ? TiltDirection.RIGHT : TiltDirection.LEFT, corners.getF13789j() > corners.getF13791l() ? TiltDirection.DOWN : TiltDirection.UP);
    }
}
