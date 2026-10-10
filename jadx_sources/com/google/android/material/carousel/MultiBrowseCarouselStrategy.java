package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes45.dex */
public final class MultiBrowseCarouselStrategy extends CarouselStrategy {
    private int keylineCount = 0;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {1, 0};

    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        boolean z11;
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f11 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            f11 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float smallItemSizeMin = getSmallItemSizeMin() + f11;
        float fMax = Math.max(getSmallItemSizeMax() + f11, smallItemSizeMin);
        float f12 = containerHeight;
        float fMin = Math.min(measuredHeight + f11, f12);
        float fClamp = MathUtils.clamp((measuredHeight / 3.0f) + f11, smallItemSizeMin + f11, fMax + f11);
        float f13 = (fMin + fClamp) / 2.0f;
        int[] iArrDoubleCounts = SMALL_COUNTS;
        float f14 = 2.0f * smallItemSizeMin;
        if (f12 <= f14) {
            iArrDoubleCounts = new int[]{0};
        }
        int[] iArrDoubleCounts2 = MEDIUM_COUNTS;
        if (carousel.getCarouselAlignment() == 1) {
            iArrDoubleCounts = CarouselStrategy.doubleCounts(iArrDoubleCounts);
            iArrDoubleCounts2 = CarouselStrategy.doubleCounts(iArrDoubleCounts2);
        }
        int[] iArr = iArrDoubleCounts2;
        int[] iArr2 = iArrDoubleCounts;
        float f15 = f11;
        int iMax = (int) Math.max(1.0d, Math.floor(((f12 - (CarouselStrategyHelper.maxValue(iArr) * f13)) - (CarouselStrategyHelper.maxValue(iArr2) * fMax)) / fMin));
        int iCeil = (int) Math.ceil(f12 / fMin);
        int i11 = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr3[i12] = iCeil - i12;
        }
        Arrangement arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f12, fClamp, smallItemSizeMin, fMax, iArr2, f13, iArr, fMin, iArr3);
        this.keylineCount = arrangementFindLowestCostArrangement.getItemCount();
        boolean zEnsureArrangementFitsItemCount = ensureArrangementFitsItemCount(arrangementFindLowestCostArrangement, carousel.getItemCount());
        int i13 = arrangementFindLowestCostArrangement.mediumCount;
        if (i13 == 0 && arrangementFindLowestCostArrangement.smallCount == 0 && f12 > f14) {
            arrangementFindLowestCostArrangement.smallCount = 1;
            z11 = true;
        } else {
            z11 = zEnsureArrangementFitsItemCount;
        }
        if (z11) {
            arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f12, fClamp, smallItemSizeMin, fMax, new int[]{arrangementFindLowestCostArrangement.smallCount}, f13, new int[]{i13}, fMin, new int[]{arrangementFindLowestCostArrangement.largeCount});
        }
        return CarouselStrategyHelper.createKeylineState(view.getContext(), f15, containerHeight, arrangementFindLowestCostArrangement, carousel.getCarouselAlignment());
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(@NonNull Carousel carousel, int i11) {
        if (i11 >= this.keylineCount || carousel.getItemCount() < this.keylineCount) {
            return i11 >= this.keylineCount && carousel.getItemCount() < this.keylineCount;
        }
        return true;
    }

    public boolean ensureArrangementFitsItemCount(Arrangement arrangement, int i11) {
        boolean z11;
        int itemCount = arrangement.getItemCount() - i11;
        if (itemCount > 0 && (arrangement.smallCount > 0 || arrangement.mediumCount > 1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        while (itemCount > 0) {
            int i12 = arrangement.smallCount;
            if (i12 > 0) {
                arrangement.smallCount = i12 - 1;
            } else {
                int i13 = arrangement.mediumCount;
                if (i13 > 1) {
                    arrangement.mediumCount = i13 - 1;
                }
            }
            itemCount--;
        }
        return z11;
    }
}
