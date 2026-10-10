package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.Objects;

/* JADX INFO: loaded from: classes34.dex */
public final class PercentageRating extends Rating {
    private static final String FIELD_PERCENT = Util.intToStringMaxRadix(1);
    private static final int TYPE = 1;
    private final float percent;

    public PercentageRating() {
        this.percent = -1.0f;
    }

    @UnstableApi
    public static PercentageRating fromBundle(Bundle bundle) {
        Assertions.checkArgument(bundle.getInt(Rating.FIELD_RATING_TYPE, -1) == 1);
        float f11 = bundle.getFloat(FIELD_PERCENT, -1.0f);
        return f11 == -1.0f ? new PercentageRating() : new PercentageRating(f11);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof PercentageRating) && this.percent == ((PercentageRating) obj).percent;
    }

    public float getPercent() {
        return this.percent;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.percent));
    }

    @Override // androidx.media3.common.Rating
    public boolean isRated() {
        return this.percent != -1.0f;
    }

    @Override // androidx.media3.common.Rating
    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(Rating.FIELD_RATING_TYPE, 1);
        bundle.putFloat(FIELD_PERCENT, this.percent);
        return bundle;
    }

    public PercentageRating(@FloatRange(from = 0.0d, m1552to = 100.0d) float f11) {
        Assertions.checkArgument(f11 >= 0.0f && f11 <= 100.0f, "percent must be in the range of [0, 100]");
        this.percent = f11;
    }
}
