package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.android.material.animation.AnimationUtils;

/* JADX INFO: loaded from: classes45.dex */
class ElasticTabIndicatorInterpolator extends TabIndicatorInterpolator {
    private static float accInterp(@FloatRange(from = 0.0d, m1552to = 1.0d) float f11) {
        return (float) (1.0d - Math.cos((((double) f11) * 3.141592653589793d) / 2.0d));
    }

    private static float decInterp(@FloatRange(from = 0.0d, m1552to = 1.0d) float f11) {
        return (float) Math.sin((((double) f11) * 3.141592653589793d) / 2.0d);
    }

    @Override // com.google.android.material.tabs.TabIndicatorInterpolator
    public void updateIndicatorForOffset(TabLayout tabLayout, View view, View view2, float f11, @NonNull Drawable drawable) {
        float fDecInterp;
        float fAccInterp;
        RectF rectFCalculateIndicatorWidthForTab = TabIndicatorInterpolator.calculateIndicatorWidthForTab(tabLayout, view);
        RectF rectFCalculateIndicatorWidthForTab2 = TabIndicatorInterpolator.calculateIndicatorWidthForTab(tabLayout, view2);
        if (rectFCalculateIndicatorWidthForTab.left < rectFCalculateIndicatorWidthForTab2.left) {
            fDecInterp = accInterp(f11);
            fAccInterp = decInterp(f11);
        } else {
            fDecInterp = decInterp(f11);
            fAccInterp = accInterp(f11);
        }
        drawable.setBounds(AnimationUtils.lerp((int) rectFCalculateIndicatorWidthForTab.left, (int) rectFCalculateIndicatorWidthForTab2.left, fDecInterp), drawable.getBounds().top, AnimationUtils.lerp((int) rectFCalculateIndicatorWidthForTab.right, (int) rectFCalculateIndicatorWidthForTab2.right, fAccInterp), drawable.getBounds().bottom);
    }
}
