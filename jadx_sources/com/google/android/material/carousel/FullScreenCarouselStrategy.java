package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes45.dex */
public class FullScreenCarouselStrategy extends CarouselStrategy {
    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        int containerHeight;
        int i11;
        int i12;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
            i11 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            i12 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            containerHeight = carousel.getContainerHeight();
            i11 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            i12 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        float f11 = i11 + i12;
        float f12 = containerHeight;
        return CarouselStrategyHelper.createLeftAlignedKeylineState(view.getContext(), f11, containerHeight, new Arrangement(0, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0, Math.min(f12 + f11, f12), 1, f12));
    }
}
