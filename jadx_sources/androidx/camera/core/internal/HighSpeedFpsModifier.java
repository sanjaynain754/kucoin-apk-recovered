package androidx.camera.core.internal;

import android.media.MediaCodec;
import android.util.Range;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HighSpeedFpsModifier.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u0012\u0010\u0010\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\f\u0010\u0010\u001a\u00020\f*\u00020\nH\u0002J\f\u0010\u0011\u001a\u00020\f*\u00020\u0012H\u0002¨\u0006\u0014"}, m90084d2 = {"Landroidx/camera/core/internal/HighSpeedFpsModifier;", "", "<init>", "()V", "modifyFpsForPreviewOnlyRepeating", "", "outputConfigs", "", "Landroidx/camera/core/impl/SessionConfig$OutputConfig;", "repeatingConfigBuilder", "Landroidx/camera/core/impl/CaptureConfig$Builder;", "isHighSpeedFixedFps", "", "Landroid/util/Range;", "", "toPreviewOnlyRange", "hasVideoSurface", "isVideoSurface", "Landroidx/camera/core/impl/DeferrableSurface;", "Companion", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHighSpeedFpsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HighSpeedFpsModifier.kt\nandroidx/camera/core/internal/HighSpeedFpsModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n1#2:91\n1755#3,3:92\n1755#3,3:95\n*S KotlinDebug\n*F\n+ 1 HighSpeedFpsModifier.kt\nandroidx/camera/core/internal/HighSpeedFpsModifier\n*L\n80#1:92,3\n85#1:95,3\n*E\n"})
public final class HighSpeedFpsModifier {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int PREVIEW_ONLY_FPS_LOWER = 30;

    @NotNull
    private static final String TAG = "HighSpeedFpsModifier";

    /* JADX INFO: compiled from: HighSpeedFpsModifier.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Landroidx/camera/core/internal/HighSpeedFpsModifier$Companion;", "", "<init>", "()V", "TAG", "", "PREVIEW_ONLY_FPS_LOWER", "", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final boolean hasVideoSurface(CaptureConfig.Builder builder) {
        Set<DeferrableSurface> surfaces = builder.getSurfaces();
        Intrinsics.checkNotNullExpressionValue(surfaces, "getSurfaces(...)");
        if (surfaces != null && surfaces.isEmpty()) {
            return false;
        }
        for (DeferrableSurface deferrableSurface : surfaces) {
            Intrinsics.checkNotNull(deferrableSurface);
            if (isVideoSurface(deferrableSurface)) {
                return true;
            }
        }
        return false;
    }

    private final Range<Integer> toPreviewOnlyRange(Range<Integer> range) {
        Range<Integer> range2 = new Range<>(30, range.getUpper());
        Logger.m1866d(TAG, "Modified high-speed FPS range from " + range + " to " + range2);
        return range2;
    }

    private final boolean isHighSpeedFixedFps(Range<Integer> range) {
        if (((Number) range.getUpper()).intValue() >= 120 && Intrinsics.areEqual(range.getLower(), range.getUpper())) {
            return true;
        }
        return false;
    }

    private final boolean isVideoSurface(DeferrableSurface deferrableSurface) {
        return Intrinsics.areEqual(deferrableSurface.getContainerClass(), MediaCodec.class);
    }

    public final void modifyFpsForPreviewOnlyRepeating(@NotNull Collection<? extends SessionConfig.OutputConfig> outputConfigs, @NotNull CaptureConfig.Builder repeatingConfigBuilder) {
        Range<Integer> expectedFrameRateRange;
        Intrinsics.checkNotNullParameter(outputConfigs, "outputConfigs");
        Intrinsics.checkNotNullParameter(repeatingConfigBuilder, "repeatingConfigBuilder");
        if (outputConfigs.size() == 2 && hasVideoSurface(outputConfigs) && !hasVideoSurface(repeatingConfigBuilder) && (expectedFrameRateRange = repeatingConfigBuilder.getExpectedFrameRateRange()) != null) {
            if (!isHighSpeedFixedFps(expectedFrameRateRange)) {
                expectedFrameRateRange = null;
            }
            if (expectedFrameRateRange != null) {
                repeatingConfigBuilder.setExpectedFrameRateRange(toPreviewOnlyRange(expectedFrameRateRange));
            }
        }
    }

    private final boolean hasVideoSurface(Collection<? extends SessionConfig.OutputConfig> collection) {
        if (collection != null && collection.isEmpty()) {
            return false;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            DeferrableSurface surface = ((SessionConfig.OutputConfig) it.next()).getSurface();
            Intrinsics.checkNotNullExpressionValue(surface, "getSurface(...)");
            if (isVideoSurface(surface)) {
                return true;
            }
        }
        return false;
    }
}
