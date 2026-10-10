package androidx.camera.core;

import androidx.annotation.FloatRange;
import androidx.core.util.Pair;
import com.swmansion.rnscreens.Screen;

/* JADX INFO: loaded from: classes23.dex */
public class CompositionSettings {
    public static final CompositionSettings DEFAULT = new Builder().setAlpha(1.0f).setOffset(0.0f, 0.0f).setScale(1.0f, 1.0f).build();
    private final float mAlpha;
    private final Pair<Float, Float> mOffset;
    private final Pair<Float, Float> mScale;

    public static final class Builder {
        private float mAlpha;
        private Pair<Float, Float> mOffset;
        private Pair<Float, Float> mScale;

        public CompositionSettings build() {
            return new CompositionSettings(this.mAlpha, this.mOffset, this.mScale);
        }

        public Builder setAlpha(@FloatRange(from = 0.0d, m1552to = 1.0d) float f11) {
            this.mAlpha = f11;
            return this;
        }

        public Builder() {
            Float fValueOf = Float.valueOf(1.0f);
            this.mAlpha = 1.0f;
            Float fValueOf2 = Float.valueOf(0.0f);
            this.mOffset = Pair.create(fValueOf2, fValueOf2);
            this.mScale = Pair.create(fValueOf, fValueOf);
        }

        public Builder setOffset(@FloatRange(from = Screen.SHEET_FIT_TO_CONTENTS, m1552to = 1.0d) float f11, @FloatRange(from = Screen.SHEET_FIT_TO_CONTENTS, m1552to = 1.0d) float f12) {
            this.mOffset = Pair.create(Float.valueOf(f11), Float.valueOf(f12));
            return this;
        }

        public Builder setScale(float f11, float f12) {
            this.mScale = Pair.create(Float.valueOf(f11), Float.valueOf(f12));
            return this;
        }
    }

    private CompositionSettings(float f11, Pair<Float, Float> pair, Pair<Float, Float> pair2) {
        this.mAlpha = f11;
        this.mOffset = pair;
        this.mScale = pair2;
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    public Pair<Float, Float> getOffset() {
        return this.mOffset;
    }

    public Pair<Float, Float> getScale() {
        return this.mScale;
    }
}
