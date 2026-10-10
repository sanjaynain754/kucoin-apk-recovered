package com.google.android.material.transition;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes45.dex */
class FitModeEvaluators {
    private static final FitModeEvaluator WIDTH = new FitModeEvaluator() { // from class: com.google.android.material.transition.FitModeEvaluators.1
        @Override // com.google.android.material.transition.FitModeEvaluator
        public FitModeResult evaluate(float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
            float fLerp = TransitionUtils.lerp(f14, f16, f12, f13, f11, true);
            float f18 = fLerp / f14;
            float f19 = fLerp / f16;
            return new FitModeResult(f18, f19, fLerp, f15 * f18, fLerp, f17 * f19);
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public void applyMask(RectF rectF, float f11, FitModeResult fitModeResult) {
            rectF.bottom -= Math.abs(fitModeResult.currentEndHeight - fitModeResult.currentStartHeight) * f11;
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            return fitModeResult.currentStartHeight > fitModeResult.currentEndHeight;
        }
    };
    private static final FitModeEvaluator HEIGHT = new FitModeEvaluator() { // from class: com.google.android.material.transition.FitModeEvaluators.2
        @Override // com.google.android.material.transition.FitModeEvaluator
        public FitModeResult evaluate(float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
            float fLerp = TransitionUtils.lerp(f15, f17, f12, f13, f11, true);
            float f18 = fLerp / f15;
            float f19 = fLerp / f17;
            return new FitModeResult(f18, f19, f14 * f18, fLerp, f16 * f19, fLerp);
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public void applyMask(RectF rectF, float f11, FitModeResult fitModeResult) {
            float fAbs = (Math.abs(fitModeResult.currentEndWidth - fitModeResult.currentStartWidth) / 2.0f) * f11;
            rectF.left += fAbs;
            rectF.right -= fAbs;
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            return fitModeResult.currentStartWidth > fitModeResult.currentEndWidth;
        }
    };

    public static FitModeEvaluator get(int i11, boolean z11, RectF rectF, RectF rectF2) {
        if (i11 == 0) {
            return shouldAutoFitToWidth(z11, rectF, rectF2) ? WIDTH : HEIGHT;
        }
        if (i11 == 1) {
            return WIDTH;
        }
        if (i11 == 2) {
            return HEIGHT;
        }
        throw new IllegalArgumentException("Invalid fit mode: " + i11);
    }

    private FitModeEvaluators() {
    }

    private static boolean shouldAutoFitToWidth(boolean z11, RectF rectF, RectF rectF2) {
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float fWidth2 = rectF2.width();
        float fHeight2 = rectF2.height();
        float f11 = (fHeight2 * fWidth) / fWidth2;
        float f12 = (fWidth2 * fHeight) / fWidth;
        if (z11) {
            if (f11 < fHeight) {
                return false;
            }
            return true;
        }
        if (f12 < fHeight2) {
            return false;
        }
        return true;
    }
}
