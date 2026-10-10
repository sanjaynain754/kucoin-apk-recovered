package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes45.dex */
public class HeroCarouselStrategy extends CarouselStrategy {
    private int keylineCount = 0;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {0, 1};

    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        int[] iArr;
        int i11;
        int[] iArrDoubleCounts;
        int[] iArrDoubleCounts2;
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f11 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredWidth = view.getMeasuredWidth() * 2;
        if (carousel.isHorizontal()) {
            f11 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredWidth = view.getMeasuredHeight() * 2;
        }
        float smallItemSizeMin = getSmallItemSizeMin() + f11;
        float fMax = Math.max(getSmallItemSizeMax() + f11, smallItemSizeMin);
        float f12 = containerHeight;
        float fMin = Math.min(measuredWidth + f11, f12);
        float fClamp = MathUtils.clamp((measuredWidth / 3.0f) + f11, smallItemSizeMin + f11, fMax + f11);
        float f13 = (fMin + fClamp) / 2.0f;
        int[] iArr2 = SMALL_COUNTS;
        int i12 = 0;
        if (f12 < 2.0f * smallItemSizeMin) {
            iArr = new int[]{0};
        } else {
            iArr = iArr2;
        }
        int iMax = (int) Math.max(1.0d, Math.floor((f12 - (CarouselStrategyHelper.maxValue(iArr2) * fMax)) / fMin));
        int iCeil = (((int) Math.ceil(f12 / fMin)) - iMax) + 1;
        int[] iArr3 = new int[iCeil];
        for (int i13 = 0; i13 < iCeil; i13++) {
            iArr3[i13] = iMax + i13;
        }
        if (carousel.getCarouselAlignment() == 1) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (i11 != 0) {
            iArrDoubleCounts = CarouselStrategy.doubleCounts(iArr);
        } else {
            iArrDoubleCounts = iArr;
        }
        if (i11 != 0) {
            iArrDoubleCounts2 = CarouselStrategy.doubleCounts(MEDIUM_COUNTS);
        } else {
            iArrDoubleCounts2 = MEDIUM_COUNTS;
        }
        Arrangement arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f12, fClamp, smallItemSizeMin, fMax, iArrDoubleCounts, f13, iArrDoubleCounts2, fMin, iArr3);
        this.keylineCount = arrangementFindLowestCostArrangement.getItemCount();
        if (arrangementFindLowestCostArrangement.getItemCount() > carousel.getItemCount()) {
            arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f12, fClamp, smallItemSizeMin, fMax, iArr, f13, MEDIUM_COUNTS, fMin, iArr3);
        } else {
            i12 = i11;
        }
        return CarouselStrategyHelper.createKeylineState(view.getContext(), f11, containerHeight, arrangementFindLowestCostArrangement, i12);
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(@NonNull Carousel carousel, int i11) {
        if (carousel.getCarouselAlignment() == 1) {
            if ((i11 < this.keylineCount && carousel.getItemCount() >= this.keylineCount) || (i11 >= this.keylineCount && carousel.getItemCount() < this.keylineCount)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
