package androidx.camera.video;

import android.util.Range;
import androidx.annotation.RestrictTo;
import com.google.auto.value.AutoValue;
import java.util.Arrays;

/* JADX INFO: loaded from: classes23.dex */
@AutoValue
@RestrictTo({RestrictTo.Scope.LIBRARY})
public abstract class VideoSpec {
    public static final Range<Integer> BITRATE_RANGE_AUTO = new Range<>(0, Integer.MAX_VALUE);
    public static final int ENCODE_FRAME_RATE_AUTO = 0;
    public static final QualitySelector QUALITY_SELECTOR_AUTO;

    @AutoValue.Builder
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static abstract class Builder {
        public abstract VideoSpec build();

        public abstract Builder setAspectRatio(int i11);

        public abstract Builder setBitrate(Range<Integer> range);

        public abstract Builder setEncodeFrameRate(int i11);

        public abstract Builder setQualitySelector(QualitySelector qualitySelector);
    }

    public abstract int getAspectRatio();

    public abstract Range<Integer> getBitrate();

    public abstract int getEncodeFrameRate();

    public abstract QualitySelector getQualitySelector();

    public abstract Builder toBuilder();

    static {
        Quality quality = Quality.FHD;
        QUALITY_SELECTOR_AUTO = QualitySelector.fromOrderedList(Arrays.asList(quality, Quality.f1930HD, Quality.f1931SD), FallbackStrategy.higherQualityOrLowerThan(quality));
    }

    public static Builder builder() {
        return new AutoValue_VideoSpec.Builder().setQualitySelector(QUALITY_SELECTOR_AUTO).setEncodeFrameRate(0).setBitrate(BITRATE_RANGE_AUTO).setAspectRatio(-1);
    }
}
