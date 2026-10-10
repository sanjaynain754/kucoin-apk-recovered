package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes45.dex */
public final class UncontainedCarouselStrategy extends CarouselStrategy {
    private static final float MEDIUM_LARGE_ITEM_PERCENTAGE_THRESHOLD = 0.85f;

    private float calculateMediumChildSize(float f11, float f12, float f13) {
        float fMax = Math.max(1.5f * f13, f11);
        float f14 = MEDIUM_LARGE_ITEM_PERCENTAGE_THRESHOLD * f12;
        if (fMax > f14) {
            fMax = Math.max(f14, f13 * 1.2f);
        }
        return Math.min(f12, fMax);
    }

    private KeylineState createCenterAlignedKeylineState(int i11, float f11, float f12, int i12, float f13, float f14, float f15) {
        float fMin = Math.min(f14, f12);
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(fMin, f12, f11);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(f13, f12, f11);
        float f16 = f13 / 2.0f;
        float f17 = (f15 + 0.0f) - f16;
        float f18 = f17 + f16;
        float f19 = fMin / 2.0f;
        float f21 = (i12 * f12) + f18;
        KeylineState.Builder builderAddKeylineRange = new KeylineState.Builder(f12, i11).addAnchorKeyline((f17 - f16) - f19, childMaskPercentage, fMin).addKeyline(f17, childMaskPercentage2, f13, false).addKeylineRange((f12 / 2.0f) + f18, 0.0f, f12, i12, true);
        builderAddKeylineRange.addKeyline(f16 + f21, childMaskPercentage2, f13, false);
        builderAddKeylineRange.addAnchorKeyline(f21 + f13 + f19, childMaskPercentage, fMin);
        return builderAddKeylineRange.build();
    }

    private KeylineState createLeftAlignedKeylineState(Context context, float f11, int i11, float f12, int i12, float f13, int i13, float f14) {
        float fMin = Math.min(f14, f12);
        float fMax = Math.max(fMin, 0.5f * f13);
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(fMax, f12, f11);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(fMin, f12, f11);
        float childMaskPercentage3 = CarouselStrategy.getChildMaskPercentage(f13, f12, f11);
        float f15 = (i12 * f12) + 0.0f;
        KeylineState.Builder builderAddKeylineRange = new KeylineState.Builder(f12, i11).addAnchorKeyline(0.0f - (fMax / 2.0f), childMaskPercentage, fMax).addKeylineRange(f12 / 2.0f, 0.0f, f12, i12, true);
        if (i13 > 0) {
            float f16 = (f13 / 2.0f) + f15;
            f15 += f13;
            builderAddKeylineRange.addKeyline(f16, childMaskPercentage3, f13, false);
        }
        builderAddKeylineRange.addAnchorKeyline(f15 + (CarouselStrategyHelper.getExtraSmallSize(context) / 2.0f), childMaskPercentage2, fMin);
        return builderAddKeylineRange.build();
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public CarouselStrategy.StrategyType getStrategyType() {
        return CarouselStrategy.StrategyType.UNCONTAINED;
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        int containerHeight;
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        } else {
            containerHeight = carousel.getContainerHeight();
        }
        int i11 = containerHeight;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f11 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            f11 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f12 = measuredHeight;
        float f13 = f11;
        float f14 = f12 + f13;
        float extraSmallSize = CarouselStrategyHelper.getExtraSmallSize(view.getContext()) + f13;
        float extraSmallSize2 = CarouselStrategyHelper.getExtraSmallSize(view.getContext()) + f13;
        float f15 = i11;
        int iMax = Math.max(1, (int) Math.floor(f15 / f14));
        float f16 = f15 - (iMax * f14);
        if (carousel.getCarouselAlignment() == 1) {
            float f17 = f16 / 2.0f;
            return createCenterAlignedKeylineState(i11, f13, f14, iMax, Math.max(Math.min(3.0f * f17, f14), getSmallItemSizeMin() + f13), extraSmallSize2, f17);
        }
        int i12 = 1;
        if (f16 <= 0.0f) {
            i12 = 0;
        }
        return createLeftAlignedKeylineState(view.getContext(), f13, i11, f14, iMax, calculateMediumChildSize(extraSmallSize, f14, f16), i12, extraSmallSize2);
    }
}
