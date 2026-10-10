package androidx.camera.core.impl;

import androidx.camera.core.DynamicRange;
import androidx.core.util.Preconditions;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DynamicRanges.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0007J*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0007J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¨\u0006\u0011"}, m90084d2 = {"Landroidx/camera/core/impl/DynamicRanges;", "", "<init>", "()V", "canResolve", "", "dynamicRangeToTest", "Landroidx/camera/core/DynamicRange;", "fullySpecifiedDynamicRanges", "", "findAllPossibleMatches", "dynamicRangesToTest", "canResolveUnderSpecifiedTo", "underSpecifiedDynamicRange", "fullySpecifiedDynamicRange", "canMatchBitDepth", "canMatchEncoding", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDynamicRanges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicRanges.kt\nandroidx/camera/core/impl/DynamicRanges\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n295#2,2:131\n1863#2:133\n1863#2,2:134\n1864#2:136\n*S KotlinDebug\n*F\n+ 1 DynamicRanges.kt\nandroidx/camera/core/impl/DynamicRanges\n*L\n40#1:131,2\n65#1:133\n74#1:134,2\n65#1:136\n*E\n"})
public final class DynamicRanges {

    @NotNull
    public static final DynamicRanges INSTANCE = new DynamicRanges();

    /* JADX WARN: Code duplicated, block: B:14:0x0032 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0034 A[RETURN] */
    @JvmStatic
    public static final boolean canResolve(@NotNull DynamicRange dynamicRangeToTest, @NotNull Set<DynamicRange> fullySpecifiedDynamicRanges) {
        Intrinsics.checkNotNullParameter(dynamicRangeToTest, "dynamicRangeToTest");
        Intrinsics.checkNotNullParameter(fullySpecifiedDynamicRanges, "fullySpecifiedDynamicRanges");
        if (dynamicRangeToTest.isFullySpecified()) {
            return fullySpecifiedDynamicRanges.contains(dynamicRangeToTest);
        }
        for (Object obj : fullySpecifiedDynamicRanges) {
            if (INSTANCE.canResolveUnderSpecifiedTo(dynamicRangeToTest, (DynamicRange) obj)) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    @JvmStatic
    @NotNull
    public static final Set<DynamicRange> findAllPossibleMatches(@NotNull Set<DynamicRange> dynamicRangesToTest, @NotNull Set<DynamicRange> fullySpecifiedDynamicRanges) {
        Intrinsics.checkNotNullParameter(dynamicRangesToTest, "dynamicRangesToTest");
        Intrinsics.checkNotNullParameter(fullySpecifiedDynamicRanges, "fullySpecifiedDynamicRanges");
        if (dynamicRangesToTest.isEmpty()) {
            throw new IllegalArgumentException("Candidate dynamic range set must contain at least 1 candidate dynamic range.");
        }
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        for (DynamicRange dynamicRange : dynamicRangesToTest) {
            if (!dynamicRange.isFullySpecified()) {
                for (DynamicRange dynamicRange2 : fullySpecifiedDynamicRanges) {
                    if (INSTANCE.canResolveUnderSpecifiedTo(dynamicRange, dynamicRange2)) {
                        setCreateSetBuilder.add(dynamicRange2);
                    }
                }
            } else if (fullySpecifiedDynamicRanges.contains(dynamicRange)) {
                setCreateSetBuilder.add(dynamicRange);
            }
        }
        return SetsKt.build(setCreateSetBuilder);
    }

    private DynamicRanges() {
    }

    private final boolean canMatchBitDepth(DynamicRange dynamicRangeToTest, DynamicRange fullySpecifiedDynamicRange) {
        Preconditions.checkState(fullySpecifiedDynamicRange.isFullySpecified(), "Fully specified range is not actually fully specified.");
        if (dynamicRangeToTest.getBitDepth() == 0 || dynamicRangeToTest.getBitDepth() == fullySpecifiedDynamicRange.getBitDepth()) {
            return true;
        }
        return false;
    }

    private final boolean canMatchEncoding(DynamicRange dynamicRangeToTest, DynamicRange fullySpecifiedDynamicRange) {
        Preconditions.checkState(fullySpecifiedDynamicRange.isFullySpecified(), "Fully specified range is not actually fully specified.");
        int encoding = dynamicRangeToTest.getEncoding();
        if (encoding == 0) {
            return true;
        }
        int encoding2 = fullySpecifiedDynamicRange.getEncoding();
        if ((encoding == 2 && encoding2 != 1) || encoding == encoding2) {
            return true;
        }
        return false;
    }

    private final boolean canResolveUnderSpecifiedTo(DynamicRange underSpecifiedDynamicRange, DynamicRange fullySpecifiedDynamicRange) {
        if (canMatchBitDepth(underSpecifiedDynamicRange, fullySpecifiedDynamicRange) && canMatchEncoding(underSpecifiedDynamicRange, fullySpecifiedDynamicRange)) {
            return true;
        }
        return false;
    }
}
