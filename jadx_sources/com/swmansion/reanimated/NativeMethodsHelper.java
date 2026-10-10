package com.swmansion.reanimated;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.RootViewUtil;
import com.facebook.react.views.scroll.ReactHorizontalScrollView;
import com.facebook.react.views.scroll.ReactScrollView;
import com.facebook.react.views.swiperefresh.ReactSwipeRefreshLayout;

/* JADX INFO: loaded from: classes59.dex */
public class NativeMethodsHelper {
    private static ReactScrollView findScrollView(ReactSwipeRefreshLayout reactSwipeRefreshLayout) {
        for (int i11 = 0; i11 < reactSwipeRefreshLayout.getChildCount(); i11++) {
            if (reactSwipeRefreshLayout.getChildAt(i11) instanceof ReactScrollView) {
                return (ReactScrollView) reactSwipeRefreshLayout.getChildAt(i11);
            }
        }
        return null;
    }

    private static void computeBoundingBox(View view, int[] iArr) {
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        mapRectFromViewToWindowCoords(view, rectF);
        iArr[0] = Math.round(rectF.left);
        iArr[1] = Math.round(rectF.top);
        iArr[2] = Math.round(rectF.right - rectF.left);
        iArr[3] = Math.round(rectF.bottom - rectF.top);
    }

    private static void mapRectFromViewToWindowCoords(View view, RectF rectF) {
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.mapRect(rectF);
        }
        rectF.offset(view.getLeft(), view.getTop());
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            Matrix matrix2 = view2.getMatrix();
            if (!matrix2.isIdentity()) {
                matrix2.mapRect(rectF);
            }
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
    }

    public static float[] measure(View view) {
        View view2 = (View) RootViewUtil.getRootView(view);
        if (view2 != null && view != null) {
            int[] iArr = new int[4];
            computeBoundingBox(view2, iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            computeBoundingBox(view, iArr);
            iArr[0] = iArr[0] - i11;
            iArr[1] = iArr[1] - i12;
            float[] fArr = new float[6];
            fArr[0] = PixelUtil.toDIPFromPixel(view.getLeft());
            fArr[1] = PixelUtil.toDIPFromPixel(view.getTop());
            for (int i13 = 2; i13 < 6; i13++) {
                fArr[i13] = PixelUtil.toDIPFromPixel(iArr[i13 - 2]);
            }
            return fArr;
        }
        float[] fArr2 = new float[6];
        fArr2[0] = -1234567.0f;
        return fArr2;
    }

    public static void scrollTo(final View view, double d11, double d12, boolean z11) {
        final int iRound = Math.round(PixelUtil.toPixelFromDIP(d11));
        final int iRound2 = Math.round(PixelUtil.toPixelFromDIP(d12));
        boolean z12 = view instanceof ReactHorizontalScrollView;
        if (!z12) {
            if (view instanceof ReactSwipeRefreshLayout) {
                view = findScrollView((ReactSwipeRefreshLayout) view);
            }
            if (!(view instanceof ReactScrollView)) {
                Log.w("REANIMATED", "NativeMethodsHelper: Unhandled scroll view type - allowed only {ReactScrollView, ReactHorizontalScrollView}");
                return;
            }
        }
        if (z11) {
            if (z12) {
                view.post(new Runnable() { // from class: com.swmansion.reanimated.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((ReactHorizontalScrollView) view).smoothScrollTo(iRound, iRound2);
                    }
                });
                return;
            } else {
                view.post(new Runnable() { // from class: com.swmansion.reanimated.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((ReactScrollView) view).smoothScrollTo(iRound, iRound2);
                    }
                });
                return;
            }
        }
        view.scrollTo(iRound, iRound2);
    }
}
