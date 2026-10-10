package com.kubi.home.pagergridlayoutmanager;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.kubi.home.pagergridlayoutmanager.b */
/* JADX INFO: compiled from: PagerGridSmoothScroller.java */
/* JADX INFO: loaded from: classes15.dex */
public class C14751b extends LinearSmoothScroller {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final PagerGridLayoutManager f25986a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f25987b;

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        float fM29788q = this.f25986a.m29788q() / displayMetrics.densityDpi;
        if (PagerGridLayoutManager.f25941B) {
            Log.i("PagerGridSmoothScroller", "calculateSpeedPerPixel-speed: " + fM29788q);
        }
        return fM29788q;
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public final int calculateTimeForScrolling(int i11) {
        int iMin = Math.min(this.f25986a.m29787p(), super.calculateTimeForScrolling(i11));
        Log.i("PagerGridSmoothScroller", "calculateTimeForScrolling-time: " + iMin);
        return iMin;
    }

    public C14751b(@NonNull RecyclerView recyclerView, @NonNull PagerGridLayoutManager pagerGridLayoutManager) {
        super(recyclerView.getContext());
        this.f25987b = recyclerView;
        this.f25986a = pagerGridLayoutManager;
    }

    /* JADX INFO: renamed from: a */
    public static int m29808a(PagerGridLayoutManager pagerGridLayoutManager, Rect rect, Rect rect2) {
        if (!pagerGridLayoutManager.canScrollHorizontally()) {
            return 0;
        }
        return rect2.left - rect.left;
    }

    /* JADX INFO: renamed from: b */
    public static int m29809b(PagerGridLayoutManager pagerGridLayoutManager, Rect rect, Rect rect2, boolean z11) {
        int i11;
        int i12;
        if (!pagerGridLayoutManager.canScrollHorizontally()) {
            return 0;
        }
        if (z11) {
            i11 = rect2.left;
            i12 = rect.left;
        } else {
            i11 = rect2.right;
            i12 = rect.right;
        }
        return i11 - i12;
    }

    /* JADX INFO: renamed from: c */
    public static int m29810c(PagerGridLayoutManager pagerGridLayoutManager, Rect rect, Rect rect2) {
        if (!pagerGridLayoutManager.canScrollVertically()) {
            return 0;
        }
        return rect2.top - rect.top;
    }

    /* JADX INFO: renamed from: d */
    public static int m29811d(PagerGridLayoutManager pagerGridLayoutManager, Rect rect, Rect rect2, boolean z11) {
        int i11;
        int i12;
        if (!pagerGridLayoutManager.canScrollVertically()) {
            return 0;
        }
        if (z11) {
            i11 = rect2.top;
            i12 = rect.top;
        } else {
            i11 = rect2.bottom;
            i12 = rect.bottom;
        }
        return i11 - i12;
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        PagerGridLayoutManager pagerGridLayoutManager;
        int position;
        PointF pointFComputeScrollVectorForPosition;
        boolean z11;
        Rect rectM29784m;
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if ((layoutManager instanceof PagerGridLayoutManager) && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition((position = (pagerGridLayoutManager = (PagerGridLayoutManager) layoutManager).getPosition(view)))) != null) {
            if (pointFComputeScrollVectorForPosition.x <= 0.0f && pointFComputeScrollVectorForPosition.y <= 0.0f) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (pagerGridLayoutManager.m29769R()) {
                z11 = !z11;
            }
            if (z11) {
                rectM29784m = pagerGridLayoutManager.m29797z();
            } else {
                rectM29784m = pagerGridLayoutManager.m29784m();
            }
            Rect rect = new Rect();
            layoutManager.getDecoratedBoundsWithMargins(view, rect);
            int iM29809b = m29809b(pagerGridLayoutManager, rectM29784m, rect, z11);
            int iM29811d = m29811d(pagerGridLayoutManager, rectM29784m, rect, z11);
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(iM29809b), Math.abs(iM29811d)));
            if (PagerGridLayoutManager.f25941B) {
                Log.i("PagerGridSmoothScroller", "onTargetFound-targetPosition:" + position + ", dx:" + iM29809b + ",dy:" + iM29811d + ",time:" + iCalculateTimeForDeceleration + ",isLayoutToEnd:" + z11 + ",snapRect:" + rectM29784m + ",targetRect:" + rect);
            }
            if (iCalculateTimeForDeceleration > 0) {
                action.update(iM29809b, iM29811d, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            } else {
                pagerGridLayoutManager.m29773b(position);
            }
        }
    }
}
