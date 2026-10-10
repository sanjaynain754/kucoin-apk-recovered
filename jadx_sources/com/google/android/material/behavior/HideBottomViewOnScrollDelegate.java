package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes45.dex */
final class HideBottomViewOnScrollDelegate extends HideViewOnScrollDelegate {
    @Override // com.google.android.material.behavior.HideViewOnScrollDelegate
    public int getTargetTranslation() {
        return 0;
    }

    @Override // com.google.android.material.behavior.HideViewOnScrollDelegate
    public int getViewEdge() {
        return 1;
    }

    @Override // com.google.android.material.behavior.HideViewOnScrollDelegate
    public <V extends View> void setAdditionalHiddenOffset(@NonNull V v11, int i11, int i12) {
        v11.setTranslationY(i11 + i12);
    }

    @Override // com.google.android.material.behavior.HideViewOnScrollDelegate
    public <V extends View> void setViewTranslation(@NonNull V v11, int i11) {
        v11.setTranslationY(i11);
    }

    @Override // com.google.android.material.behavior.HideViewOnScrollDelegate
    public <V extends View> int getSize(@NonNull V v11, @NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return v11.getMeasuredHeight() + marginLayoutParams.bottomMargin;
    }

    @Override // com.google.android.material.behavior.HideViewOnScrollDelegate
    public <V extends View> ViewPropertyAnimator getViewTranslationAnimator(@NonNull V v11, int i11) {
        return v11.animate().translationY(i11);
    }
}
