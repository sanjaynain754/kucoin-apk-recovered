package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes45.dex */
final class CarouselStrategyHelper {
    private CarouselStrategyHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static float addEnd(float r1, float r2, int r3) {
            int r3 = r3 + (-1)
            r0 = 0
            int r3 = java.lang.Math.max(r0, r3)
            float r3 = (float) r3
            float r3 = r3 * r2
            float r1 = r1 + r3
            return r1
    }

    public static float addStart(float r0, float r1, int r2) {
            if (r2 <= 0) goto L6
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r0 = r0 + r1
        L6:
            return r0
    }

    public static com.google.android.material.carousel.KeylineState createCenterAlignedKeylineState(@androidx.annotation.NonNull android.content.Context r19, float r20, int r21, @androidx.annotation.NonNull com.google.android.material.carousel.Arrangement r22) {
            r0 = r20
            r1 = r21
            r2 = r22
            float r3 = getExtraSmallSize(r19)
            float r3 = r3 + r0
            float r4 = r2.largeSize
            float r3 = java.lang.Math.min(r3, r4)
            r4 = 1073741824(0x40000000, float:2.0)
            float r5 = r3 / r4
            r6 = 0
            float r7 = r6 - r5
            float r8 = r2.smallSize
            int r9 = r2.smallCount
            float r8 = addStart(r6, r8, r9)
            float r9 = r2.smallSize
            int r10 = r2.smallCount
            float r10 = (float) r10
            float r10 = r10 / r4
            double r10 = (double) r10
            double r10 = java.lang.Math.floor(r10)
            int r10 = (int) r10
            float r9 = addEnd(r8, r9, r10)
            float r10 = r2.smallSize
            int r11 = r2.smallCount
            float r6 = updateCurPosition(r6, r9, r10, r11)
            float r9 = r2.mediumSize
            int r10 = r2.mediumCount
            float r9 = addStart(r6, r9, r10)
            float r10 = r2.mediumSize
            int r11 = r2.mediumCount
            float r11 = (float) r11
            float r11 = r11 / r4
            double r11 = (double) r11
            double r11 = java.lang.Math.floor(r11)
            int r11 = (int) r11
            float r10 = addEnd(r9, r10, r11)
            float r11 = r2.mediumSize
            int r12 = r2.mediumCount
            float r6 = updateCurPosition(r6, r10, r11, r12)
            float r10 = r2.largeSize
            int r11 = r2.largeCount
            float r13 = addStart(r6, r10, r11)
            float r10 = r2.largeSize
            int r11 = r2.largeCount
            float r10 = addEnd(r13, r10, r11)
            float r11 = r2.largeSize
            int r12 = r2.largeCount
            float r6 = updateCurPosition(r6, r10, r11, r12)
            float r10 = r2.mediumSize
            int r11 = r2.mediumCount
            float r10 = addStart(r6, r10, r11)
            float r11 = r2.mediumSize
            int r12 = r2.mediumCount
            float r12 = (float) r12
            float r12 = r12 / r4
            double r14 = (double) r12
            double r14 = java.lang.Math.ceil(r14)
            int r12 = (int) r14
            float r11 = addEnd(r10, r11, r12)
            float r12 = r2.mediumSize
            int r14 = r2.mediumCount
            float r6 = updateCurPosition(r6, r11, r12, r14)
            float r11 = r2.smallSize
            int r12 = r2.smallCount
            float r6 = addStart(r6, r11, r12)
            float r11 = (float) r1
            float r11 = r11 + r5
            float r5 = r2.largeSize
            float r5 = com.google.android.material.carousel.CarouselStrategy.getChildMaskPercentage(r3, r5, r0)
            float r12 = r2.smallSize
            float r14 = r2.largeSize
            float r12 = com.google.android.material.carousel.CarouselStrategy.getChildMaskPercentage(r12, r14, r0)
            float r14 = r2.mediumSize
            float r15 = r2.largeSize
            float r0 = com.google.android.material.carousel.CarouselStrategy.getChildMaskPercentage(r14, r15, r0)
            com.google.android.material.carousel.KeylineState$Builder r14 = new com.google.android.material.carousel.KeylineState$Builder
            float r15 = r2.largeSize
            r14.<init>(r15, r1)
            com.google.android.material.carousel.KeylineState$Builder r1 = r14.addAnchorKeyline(r7, r5, r3)
            int r7 = r2.smallCount
            if (r7 <= 0) goto Ld1
            float r14 = r2.smallSize
            float r7 = (float) r7
            float r7 = r7 / r4
            r19 = r4
            r18 = r5
            double r4 = (double) r7
            double r4 = java.lang.Math.floor(r4)
            int r4 = (int) r4
            r1.addKeylineRange(r8, r12, r14, r4)
            goto Ld5
        Ld1:
            r19 = r4
            r18 = r5
        Ld5:
            int r4 = r2.mediumCount
            if (r4 <= 0) goto Le7
            float r5 = r2.mediumSize
            float r4 = (float) r4
            float r4 = r4 / r19
            double r7 = (double) r4
            double r7 = java.lang.Math.floor(r7)
            int r4 = (int) r7
            r1.addKeylineRange(r9, r0, r5, r4)
        Le7:
            float r15 = r2.largeSize
            int r4 = r2.largeCount
            r17 = 1
            r14 = 0
            r16 = r12
            r12 = r1
            r1 = r16
            r16 = r4
            r12.addKeylineRange(r13, r14, r15, r16, r17)
            int r4 = r2.mediumCount
            if (r4 <= 0) goto L10a
            float r5 = r2.mediumSize
            float r4 = (float) r4
            float r4 = r4 / r19
            double r7 = (double) r4
            double r7 = java.lang.Math.ceil(r7)
            int r4 = (int) r7
            r12.addKeylineRange(r10, r0, r5, r4)
        L10a:
            int r0 = r2.smallCount
            if (r0 <= 0) goto L11c
            float r2 = r2.smallSize
            float r0 = (float) r0
            float r0 = r0 / r19
            double r4 = (double) r0
            double r4 = java.lang.Math.ceil(r4)
            int r0 = (int) r4
            r12.addKeylineRange(r6, r1, r2, r0)
        L11c:
            r0 = r18
            r12.addAnchorKeyline(r11, r0, r3)
            com.google.android.material.carousel.KeylineState r0 = r12.build()
            return r0
    }

    public static com.google.android.material.carousel.KeylineState createKeylineState(@androidx.annotation.NonNull android.content.Context r1, float r2, int r3, @androidx.annotation.NonNull com.google.android.material.carousel.Arrangement r4, int r5) {
            r0 = 1
            if (r5 != r0) goto L8
            com.google.android.material.carousel.KeylineState r1 = createCenterAlignedKeylineState(r1, r2, r3, r4)
            return r1
        L8:
            com.google.android.material.carousel.KeylineState r1 = createLeftAlignedKeylineState(r1, r2, r3, r4)
            return r1
    }

    public static com.google.android.material.carousel.KeylineState createLeftAlignedKeylineState(@androidx.annotation.NonNull android.content.Context r12, float r13, int r14, @androidx.annotation.NonNull com.google.android.material.carousel.Arrangement r15) {
            float r12 = getExtraSmallSize(r12)
            float r12 = r12 + r13
            float r0 = r15.largeSize
            float r12 = java.lang.Math.min(r12, r0)
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r12 / r0
            r1 = 0
            float r2 = r1 - r0
            float r3 = r15.largeSize
            int r4 = r15.largeCount
            float r6 = addStart(r1, r3, r4)
            float r3 = r15.largeSize
            int r4 = r15.largeCount
            float r3 = addEnd(r6, r3, r4)
            float r4 = r15.largeSize
            int r5 = r15.largeCount
            float r1 = updateCurPosition(r1, r3, r4, r5)
            float r3 = r15.mediumSize
            int r4 = r15.mediumCount
            float r3 = addStart(r1, r3, r4)
            float r4 = r15.mediumSize
            int r5 = r15.mediumCount
            float r1 = updateCurPosition(r1, r3, r4, r5)
            float r4 = r15.smallSize
            int r5 = r15.smallCount
            float r1 = addStart(r1, r4, r5)
            float r4 = (float) r14
            float r4 = r4 + r0
            float r0 = r15.largeSize
            float r0 = com.google.android.material.carousel.CarouselStrategy.getChildMaskPercentage(r12, r0, r13)
            float r5 = r15.smallSize
            float r7 = r15.largeSize
            float r11 = com.google.android.material.carousel.CarouselStrategy.getChildMaskPercentage(r5, r7, r13)
            float r5 = r15.mediumSize
            float r7 = r15.largeSize
            float r13 = com.google.android.material.carousel.CarouselStrategy.getChildMaskPercentage(r5, r7, r13)
            com.google.android.material.carousel.KeylineState$Builder r5 = new com.google.android.material.carousel.KeylineState$Builder
            float r7 = r15.largeSize
            r5.<init>(r7, r14)
            com.google.android.material.carousel.KeylineState$Builder r5 = r5.addAnchorKeyline(r2, r0, r12)
            float r8 = r15.largeSize
            int r9 = r15.largeCount
            r10 = 1
            r7 = 0
            com.google.android.material.carousel.KeylineState$Builder r14 = r5.addKeylineRange(r6, r7, r8, r9, r10)
            int r2 = r15.mediumCount
            if (r2 <= 0) goto L78
            float r2 = r15.mediumSize
            r14.addKeyline(r3, r13, r2)
        L78:
            int r13 = r15.smallCount
            if (r13 <= 0) goto L81
            float r15 = r15.smallSize
            r14.addKeylineRange(r1, r11, r15, r13)
        L81:
            r14.addAnchorKeyline(r4, r0, r12)
            com.google.android.material.carousel.KeylineState r12 = r14.build()
            return r12
    }

    public static float getExtraSmallSize(@androidx.annotation.NonNull android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            int r0 = com.google.android.material.C7090R.dimen.m3_carousel_gone_size
            float r1 = r1.getDimension(r0)
            return r1
    }

    public static float getSmallSizeMax(@androidx.annotation.NonNull android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            int r0 = com.google.android.material.C7090R.dimen.m3_carousel_small_item_size_max
            float r1 = r1.getDimension(r0)
            return r1
    }

    public static float getSmallSizeMin(@androidx.annotation.NonNull android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            int r0 = com.google.android.material.C7090R.dimen.m3_carousel_small_item_size_min
            float r1 = r1.getDimension(r0)
            return r1
    }

    public static int maxValue(int[] r4) {
            int r0 = r4.length
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 0
        L4:
            if (r2 >= r0) goto Le
            r3 = r4[r2]
            if (r3 <= r1) goto Lb
            r1 = r3
        Lb:
            int r2 = r2 + 1
            goto L4
        Le:
            return r1
    }

    public static float updateCurPosition(float r0, float r1, float r2, int r3) {
            if (r3 <= 0) goto L7
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            float r1 = r1 + r2
            return r1
        L7:
            return r0
    }
}
