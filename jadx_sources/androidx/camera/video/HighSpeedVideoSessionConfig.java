package androidx.camera.video;

import android.util.Range;
import androidx.annotation.RestrictTo;
import androidx.camera.core.Preview;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HighSpeedVideoSessionConfig.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B;\b\u0007\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0015\u001a\u00020\u00162\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\b8WX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, m90084d2 = {"Landroidx/camera/video/HighSpeedVideoSessionConfig;", "Landroidx/camera/core/SessionConfig;", "videoCapture", "Landroidx/camera/video/VideoCapture;", "preview", "Landroidx/camera/core/Preview;", "frameRateRange", "Landroid/util/Range;", "", "isSlowMotionEnabled", "", "<init>", "(Landroidx/camera/video/VideoCapture;Landroidx/camera/core/Preview;Landroid/util/Range;Z)V", "getVideoCapture", "()Landroidx/camera/video/VideoCapture;", "getPreview", "()Landroidx/camera/core/Preview;", "()Z", "sessionType", "getSessionType", "()I", "validateSettingsOrThrow", "", "Builder", "Companion", "camera-video_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@ExperimentalHighSpeedVideo
public final class HighSpeedVideoSessionConfig extends SessionConfig {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int SLOW_MOTION_ENCODE_FRAME_RATE = 30;
    private final boolean isSlowMotionEnabled;

    @Nullable
    private final Preview preview;
    private final int sessionType;

    @NotNull
    private final VideoCapture<?> videoCapture;

    /* JADX INFO: compiled from: HighSpeedVideoSessionConfig.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\fJ\u0014\u0010\u0010\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0006\u0010\u0011\u001a\u00020\u0012R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Landroidx/camera/video/HighSpeedVideoSessionConfig$Builder;", "", "videoCapture", "Landroidx/camera/video/VideoCapture;", "<init>", "(Landroidx/camera/video/VideoCapture;)V", "preview", "Landroidx/camera/core/Preview;", "frameRateRange", "Landroid/util/Range;", "", "isSlowMotionEnabled", "", "setPreview", "setSlowMotionEnabled", "enabled", "setFrameRateRange", "build", "Landroidx/camera/video/HighSpeedVideoSessionConfig;", "camera-video_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Builder {

        @NotNull
        private Range<Integer> frameRateRange;
        private boolean isSlowMotionEnabled;

        @Nullable
        private Preview preview;

        @NotNull
        private final VideoCapture<?> videoCapture;

        @NotNull
        public final HighSpeedVideoSessionConfig build() {
            return new HighSpeedVideoSessionConfig(this.videoCapture, this.preview, this.frameRateRange, this.isSlowMotionEnabled);
        }

        @NotNull
        public final Builder setFrameRateRange(@NotNull Range<Integer> frameRateRange) {
            Intrinsics.checkNotNullParameter(frameRateRange, "frameRateRange");
            this.frameRateRange = frameRateRange;
            return this;
        }

        @NotNull
        public final Builder setPreview(@Nullable Preview preview) {
            this.preview = preview;
            return this;
        }

        @NotNull
        public final Builder setSlowMotionEnabled(boolean enabled) {
            this.isSlowMotionEnabled = enabled;
            return this;
        }

        public Builder(@NotNull VideoCapture<?> videoCapture) {
            Intrinsics.checkNotNullParameter(videoCapture, "videoCapture");
            this.videoCapture = videoCapture;
            Range<Integer> FRAME_RATE_RANGE_UNSPECIFIED = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            Intrinsics.checkNotNullExpressionValue(FRAME_RATE_RANGE_UNSPECIFIED, "FRAME_RATE_RANGE_UNSPECIFIED");
            this.frameRateRange = FRAME_RATE_RANGE_UNSPECIFIED;
        }
    }

    /* JADX INFO: compiled from: HighSpeedVideoSessionConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Landroidx/camera/video/HighSpeedVideoSessionConfig$Companion;", "", "<init>", "()V", "SLOW_MOTION_ENCODE_FRAME_RATE", "", "camera-video_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HighSpeedVideoSessionConfig(@NotNull VideoCapture<?> videoCapture) {
        this(videoCapture, null, null, false, 14, null);
        Intrinsics.checkNotNullParameter(videoCapture, "videoCapture");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HighSpeedVideoSessionConfig(@NotNull VideoCapture<?> videoCapture, @Nullable Preview preview) {
        this(videoCapture, preview, null, false, 12, null);
        Intrinsics.checkNotNullParameter(videoCapture, "videoCapture");
    }

    @Nullable
    public final Preview getPreview() {
        return this.preview;
    }

    @Override // androidx.camera.core.SessionConfig
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int getSessionType() {
        return this.sessionType;
    }

    @NotNull
    public final VideoCapture<?> getVideoCapture() {
        return this.videoCapture;
    }

    /* JADX INFO: renamed from: isSlowMotionEnabled, reason: from getter */
    public final boolean getIsSlowMotionEnabled() {
        return this.isSlowMotionEnabled;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HighSpeedVideoSessionConfig(@NotNull VideoCapture<?> videoCapture, @Nullable Preview preview, @NotNull Range<Integer> frameRateRange) {
        this(videoCapture, preview, frameRateRange, false, 8, null);
        Intrinsics.checkNotNullParameter(videoCapture, "videoCapture");
        Intrinsics.checkNotNullParameter(frameRateRange, "frameRateRange");
    }

    private final void validateSettingsOrThrow(VideoCapture<?> videoCapture, Preview preview) {
        if (videoCapture.getMirrorMode() == 0) {
            Range<Integer> targetFrameRate = videoCapture.getTargetFrameRate();
            Range<Integer> range = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            if (Intrinsics.areEqual(targetFrameRate, range)) {
                if (preview != null) {
                    if (Intrinsics.areEqual(preview.getTargetFrameRate(), range)) {
                        UseCaseConfig<?> currentConfig = preview.getCurrentConfig();
                        Intrinsics.checkNotNull(currentConfig, "null cannot be cast to non-null type androidx.camera.core.impl.ImageOutputConfig");
                        ImageOutputConfig imageOutputConfig = (ImageOutputConfig) currentConfig;
                        if (imageOutputConfig.getResolutionSelector(null) == null) {
                            if (imageOutputConfig.getTargetResolution(null) == null) {
                                if (imageOutputConfig.hasTargetAspectRatio()) {
                                    throw new IllegalArgumentException("Preview.Builder.setTargetAspectRatio() is not allowed for high-speed video.");
                                }
                                return;
                            }
                            throw new IllegalArgumentException("Preview.Builder.setTargetResolution() is not allowed for high-speed video.");
                        }
                        throw new IllegalArgumentException("Preview.Builder.setResolutionSelector() is not allowed for high-speed video.");
                    }
                    throw new IllegalArgumentException("Preview.Builder.setTargetFrameRate() is not allowed for high-speed video.");
                }
                return;
            }
            throw new IllegalArgumentException("VideoCapture.Builder.setTargetFrameRate() is not allowed for high-speed video.");
        }
        throw new IllegalArgumentException("VideoCapture.Builder.setMirrorMode() is not allowed for high-speed video.");
    }

    public /* synthetic */ HighSpeedVideoSessionConfig(VideoCapture videoCapture, Preview preview, Range range, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(videoCapture, (i11 & 2) != 0 ? null : preview, (i11 & 4) != 0 ? StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED : range, (i11 & 8) != 0 ? false : z11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HighSpeedVideoSessionConfig(@NotNull VideoCapture<?> videoCapture, @Nullable Preview preview, @NotNull Range<Integer> frameRateRange, boolean z11) {
        super(CollectionsKt.listOfNotNull((Object[]) new UseCase[]{videoCapture, preview}), null, null, frameRateRange, null, null, 54, null);
        Intrinsics.checkNotNullParameter(videoCapture, "videoCapture");
        Intrinsics.checkNotNullParameter(frameRateRange, "frameRateRange");
        this.videoCapture = videoCapture;
        this.preview = preview;
        this.isSlowMotionEnabled = z11;
        this.sessionType = 1;
        validateSettingsOrThrow(videoCapture, preview);
        if (z11) {
            VideoOutput output = videoCapture.getOutput();
            Intrinsics.checkNotNull(output, "null cannot be cast to non-null type androidx.camera.video.Recorder");
            ((Recorder) output).setVideoEncodingFrameRate(30);
        }
    }
}
