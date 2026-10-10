package com.jumio.core.extraction.docfinder.processor.tilted;

import com.jumio.core.models.TiltRange;
import p852kotlin.Metadata;
import p852kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"MEDIAN_ANGLE_OFFSET_DEGREES", "", "asRange", "Lkotlin/ranges/IntRange;", "Lcom/jumio/core/models/TiltRange;", "median", "getMedian", "(Lkotlin/ranges/IntRange;)I", "jumio-docfinder_release"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TiltedImageProcessorKt {
    public static final IntRange access$asRange(TiltRange tiltRange) {
        return new IntRange(tiltRange.getMinAngle(), tiltRange.getMaxAngle());
    }

    public static final int access$getMedian(IntRange intRange) {
        return (intRange.getLast() + intRange.getFirst()) / 2;
    }
}
