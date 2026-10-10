package com.blankj.utilcode.util;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.blankj.utilcode.util.i0 */
/* JADX INFO: compiled from: SizeUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C5275i0 {
    /* JADX INFO: renamed from: a */
    public static int m6236a(float f11) {
        return (int) ((f11 * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: b */
    public static int m6237b(View view) {
        return m6239d(view)[1];
    }

    /* JADX INFO: renamed from: c */
    public static int m6238c(View view) {
        return m6239d(view)[0];
    }

    /* JADX INFO: renamed from: d */
    public static int[] m6239d(View view) {
        int iMakeMeasureSpec;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i11 = layoutParams.height;
        if (i11 > 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(childMeasureSpec, iMakeMeasureSpec);
        return new int[]{view.getMeasuredWidth(), view.getMeasuredHeight()};
    }

    /* JADX INFO: renamed from: e */
    public static int m6240e(float f11) {
        return (int) ((f11 / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: f */
    public static int m6241f(float f11) {
        return (int) ((f11 * Resources.getSystem().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
