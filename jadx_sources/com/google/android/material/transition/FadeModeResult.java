package com.google.android.material.transition;

/* JADX INFO: loaded from: classes45.dex */
class FadeModeResult {
    final int endAlpha;
    final boolean endOnTop;
    final int startAlpha;

    public static FadeModeResult endOnTop(int i11, int i12) {
        return new FadeModeResult(i11, i12, true);
    }

    public static FadeModeResult startOnTop(int i11, int i12) {
        return new FadeModeResult(i11, i12, false);
    }

    private FadeModeResult(int i11, int i12, boolean z11) {
        this.startAlpha = i11;
        this.endAlpha = i12;
        this.endOnTop = z11;
    }
}
