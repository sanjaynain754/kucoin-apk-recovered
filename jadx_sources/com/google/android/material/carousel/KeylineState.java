package com.google.android.material.carousel;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.animation.AnimationUtils;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class KeylineState {
    private final int carouselSize;
    private final int firstFocalKeylineIndex;
    private final float itemSize;
    private final List<Keyline> keylines;
    private final int lastFocalKeylineIndex;
    private int totalVisibleFocalItems;

    public static final class Builder {
        private static final int NO_INDEX = -1;
        private static final float UNKNOWN_LOC = Float.MIN_VALUE;
        private final int carouselSize;
        private final float itemSize;
        private Keyline tmpFirstFocalKeyline;
        private Keyline tmpLastFocalKeyline;
        private final List<Keyline> tmpKeylines = new ArrayList();
        private int firstFocalKeylineIndex = -1;
        private int lastFocalKeylineIndex = -1;
        private float lastKeylineMaskedSize = 0.0f;
        private int latestAnchorKeylineIndex = -1;

        private static float calculateKeylineLocationForItemPosition(float f11, float f12, int i11, int i12) {
            return (f11 - (i11 * f12)) + (i12 * f12);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addAnchorKeyline(float f11, @FloatRange(from = 0.0d, m1552to = 1.0d) float f12, float f13) {
            return addKeyline(f11, f12, f13, false, true);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeyline(float f11, @FloatRange(from = 0.0d, m1552to = 1.0d) float f12, float f13, boolean z11) {
            return addKeyline(f11, f12, f13, z11, false);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeylineRange(float f11, @FloatRange(from = 0.0d, m1552to = 1.0d) float f12, float f13, int i11) {
            return addKeylineRange(f11, f12, f13, i11, false);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeyline(float f11, @FloatRange(from = 0.0d, m1552to = 1.0d) float f12, float f13) {
            return addKeyline(f11, f12, f13, false);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeylineRange(float f11, @FloatRange(from = 0.0d, m1552to = 1.0d) float f12, float f13, int i11, boolean z11) {
            if (i11 > 0 && f13 > 0.0f) {
                for (int i12 = 0; i12 < i11; i12++) {
                    addKeyline((i12 * f13) + f11, f12, f13, z11);
                }
            }
            return this;
        }

        @NonNull
        public KeylineState build() {
            if (this.tmpFirstFocalKeyline == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < this.tmpKeylines.size(); i11++) {
                Keyline keyline = this.tmpKeylines.get(i11);
                arrayList.add(new Keyline(calculateKeylineLocationForItemPosition(this.tmpFirstFocalKeyline.locOffset, this.itemSize, this.firstFocalKeylineIndex, i11), keyline.locOffset, keyline.mask, keyline.maskedItemSize, keyline.isAnchor, keyline.cutoff, keyline.leftOrTopPaddingShift, keyline.rightOrBottomPaddingShift));
            }
            return new KeylineState(this.itemSize, arrayList, this.firstFocalKeylineIndex, this.lastFocalKeylineIndex, this.carouselSize);
        }

        public Builder(float f11, int i11) {
            this.itemSize = f11;
            this.carouselSize = i11;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeyline(float f11, @FloatRange(from = 0.0d, m1552to = 1.0d) float f12, float f13, boolean z11, boolean z12, float f14, float f15, float f16) {
            if (f13 <= 0.0f) {
                return this;
            }
            if (z12) {
                if (!z11) {
                    int i11 = this.latestAnchorKeylineIndex;
                    if (i11 != -1 && i11 != 0) {
                        throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                    }
                    this.latestAnchorKeylineIndex = this.tmpKeylines.size();
                } else {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
            }
            Keyline keyline = new Keyline(Float.MIN_VALUE, f11, f12, f13, z12, f14, f15, f16);
            if (z11) {
                if (this.tmpFirstFocalKeyline == null) {
                    this.tmpFirstFocalKeyline = keyline;
                    this.firstFocalKeylineIndex = this.tmpKeylines.size();
                }
                if (this.lastFocalKeylineIndex != -1 && this.tmpKeylines.size() - this.lastFocalKeylineIndex > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f13 == this.tmpFirstFocalKeyline.maskedItemSize) {
                    this.tmpLastFocalKeyline = keyline;
                    this.lastFocalKeylineIndex = this.tmpKeylines.size();
                } else {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
            } else {
                if (this.tmpFirstFocalKeyline == null && keyline.maskedItemSize < this.lastKeylineMaskedSize) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.tmpLastFocalKeyline != null && keyline.maskedItemSize > this.lastKeylineMaskedSize) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.lastKeylineMaskedSize = keyline.maskedItemSize;
            this.tmpKeylines.add(keyline);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeyline(float f11, @FloatRange(from = 0.0d, m1552to = 1.0d) float f12, float f13, boolean z11, boolean z12, float f14) {
            return addKeyline(f11, f12, f13, z11, z12, f14, 0.0f, 0.0f);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder addKeyline(float f11, @FloatRange(from = 0.0d, m1552to = 1.0d) float f12, float f13, boolean z11, boolean z12) {
            float fAbs;
            float f14 = f13 / 2.0f;
            float f15 = f11 - f14;
            float f16 = f14 + f11;
            int i11 = this.carouselSize;
            if (f16 > i11) {
                fAbs = Math.abs(f16 - Math.max(f16 - f13, i11));
            } else {
                fAbs = 0.0f;
                if (f15 < 0.0f) {
                    fAbs = Math.abs(f15 - Math.min(f15 + f13, 0.0f));
                }
            }
            return addKeyline(f11, f12, f13, z11, z12, fAbs);
        }
    }

    public static final class Keyline {
        final float cutoff;
        final boolean isAnchor;
        final float leftOrTopPaddingShift;
        final float loc;
        final float locOffset;
        final float mask;
        final float maskedItemSize;
        final float rightOrBottomPaddingShift;

        public Keyline(float f11, float f12, float f13, float f14) {
            this(f11, f12, f13, f14, false, 0.0f, 0.0f, 0.0f);
        }

        public Keyline(float f11, float f12, float f13, float f14, boolean z11, float f15, float f16, float f17) {
            this.loc = f11;
            this.locOffset = f12;
            this.mask = f13;
            this.maskedItemSize = f14;
            this.isAnchor = z11;
            this.cutoff = f15;
            this.leftOrTopPaddingShift = f16;
            this.rightOrBottomPaddingShift = f17;
        }

        public static Keyline lerp(Keyline keyline, Keyline keyline2, @FloatRange(from = 0.0d, m1552to = 1.0d) float f11) {
            return new Keyline(AnimationUtils.lerp(keyline.loc, keyline2.loc, f11), AnimationUtils.lerp(keyline.locOffset, keyline2.locOffset, f11), AnimationUtils.lerp(keyline.mask, keyline2.mask, f11), AnimationUtils.lerp(keyline.maskedItemSize, keyline2.maskedItemSize, f11));
        }
    }

    @Nullable
    public Keyline getFirstNonAnchorKeyline() {
        for (int i11 = 0; i11 < this.keylines.size(); i11++) {
            Keyline keyline = this.keylines.get(i11);
            if (!keyline.isAnchor) {
                return keyline;
            }
        }
        return null;
    }

    private KeylineState(float f11, List<Keyline> list, int i11, int i12, int i13) {
        this.itemSize = f11;
        this.keylines = Collections.unmodifiableList(list);
        this.firstFocalKeylineIndex = i11;
        this.lastFocalKeylineIndex = i12;
        while (i11 <= i12) {
            if (list.get(i11).cutoff == 0.0f) {
                this.totalVisibleFocalItems++;
            }
            i11++;
        }
        this.carouselSize = i13;
    }

    public static KeylineState reverse(KeylineState keylineState, int i11) {
        Builder builder = new Builder(keylineState.getItemSize(), i11);
        float f11 = (i11 - keylineState.getLastKeyline().locOffset) - (keylineState.getLastKeyline().maskedItemSize / 2.0f);
        int size = keylineState.getKeylines().size() - 1;
        while (size >= 0) {
            Keyline keyline = keylineState.getKeylines().get(size);
            builder.addKeyline((keyline.maskedItemSize / 2.0f) + f11, keyline.mask, keyline.maskedItemSize, size >= keylineState.getFirstFocalKeylineIndex() && size <= keylineState.getLastFocalKeylineIndex(), keyline.isAnchor);
            f11 += keyline.maskedItemSize;
            size--;
        }
        return builder.build();
    }

    public int getCarouselSize() {
        return this.carouselSize;
    }

    public Keyline getFirstFocalKeyline() {
        return this.keylines.get(this.firstFocalKeylineIndex);
    }

    public int getFirstFocalKeylineIndex() {
        return this.firstFocalKeylineIndex;
    }

    public Keyline getFirstKeyline() {
        return this.keylines.get(0);
    }

    public List<Keyline> getFocalKeylines() {
        return this.keylines.subList(this.firstFocalKeylineIndex, this.lastFocalKeylineIndex + 1);
    }

    public float getItemSize() {
        return this.itemSize;
    }

    public List<Keyline> getKeylines() {
        return this.keylines;
    }

    public Keyline getLastFocalKeyline() {
        return this.keylines.get(this.lastFocalKeylineIndex);
    }

    public int getLastFocalKeylineIndex() {
        return this.lastFocalKeylineIndex;
    }

    public Keyline getLastKeyline() {
        List<Keyline> list = this.keylines;
        return list.get(list.size() - 1);
    }

    @Nullable
    public Keyline getLastNonAnchorKeyline() {
        for (int size = this.keylines.size() - 1; size >= 0; size--) {
            Keyline keyline = this.keylines.get(size);
            if (!keyline.isAnchor) {
                return keyline;
            }
        }
        return null;
    }

    public int getNumberOfNonAnchorKeylines() {
        Iterator<Keyline> it = this.keylines.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (it.next().isAnchor) {
                i11++;
            }
        }
        return this.keylines.size() - i11;
    }

    public int getTotalVisibleFocalItems() {
        return this.totalVisibleFocalItems;
    }

    public static KeylineState lerp(KeylineState keylineState, KeylineState keylineState2, float f11) {
        if (keylineState.getItemSize() == keylineState2.getItemSize()) {
            List<Keyline> keylines = keylineState.getKeylines();
            List<Keyline> keylines2 = keylineState2.getKeylines();
            if (keylines.size() == keylines2.size()) {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < keylineState.getKeylines().size(); i11++) {
                    arrayList.add(Keyline.lerp(keylines.get(i11), keylines2.get(i11), f11));
                }
                return new KeylineState(keylineState.getItemSize(), arrayList, AnimationUtils.lerp(keylineState.getFirstFocalKeylineIndex(), keylineState2.getFirstFocalKeylineIndex(), f11), AnimationUtils.lerp(keylineState.getLastFocalKeylineIndex(), keylineState2.getLastFocalKeylineIndex(), f11), keylineState.carouselSize);
            }
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
    }
}
