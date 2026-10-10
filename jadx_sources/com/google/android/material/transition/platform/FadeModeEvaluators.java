package com.google.android.material.transition.platform;

import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes45.dex */
@RequiresApi(21)
class FadeModeEvaluators {

    /* JADX INFO: renamed from: IN */
    private static final FadeModeEvaluator f11946IN = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.1
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f11, float f12, float f13, float f14) {
            return FadeModeResult.endOnTop(255, TransitionUtils.lerp(0, 255, f12, f13, f11));
        }
    };
    private static final FadeModeEvaluator OUT = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.2
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f11, float f12, float f13, float f14) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f12, f13, f11), 255);
        }
    };
    private static final FadeModeEvaluator CROSS = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.3
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f11, float f12, float f13, float f14) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f12, f13, f11), TransitionUtils.lerp(0, 255, f12, f13, f11));
        }
    };
    private static final FadeModeEvaluator THROUGH = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.4
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f11, float f12, float f13, float f14) {
            float f15 = ((f13 - f12) * f14) + f12;
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f12, f15, f11), TransitionUtils.lerp(0, 255, f15, f13, f11));
        }
    };

    public static FadeModeEvaluator get(int i11, boolean z11) {
        if (i11 == 0) {
            return z11 ? f11946IN : OUT;
        }
        if (i11 == 1) {
            return z11 ? OUT : f11946IN;
        }
        if (i11 == 2) {
            return CROSS;
        }
        if (i11 == 3) {
            return THROUGH;
        }
        throw new IllegalArgumentException("Invalid fade mode: " + i11);
    }

    private FadeModeEvaluators() {
    }
}
