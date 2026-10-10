package com.google.android.material.carousel;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

/* JADX INFO: loaded from: classes45.dex */
public class CarouselSnapHelper extends SnapHelper {
    private static final float HORIZONTAL_SNAP_SPEED = 100.0f;
    private static final float VERTICAL_SNAP_SPEED = 50.0f;
    private final boolean disableFling;
    private RecyclerView recyclerView;

    public CarouselSnapHelper() {
        this(true);
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        return calculateDistanceToSnap(layoutManager, view, false);
    }

    public CarouselSnapHelper(boolean z11) {
        this.disableFling = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] calculateDistanceToSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view, boolean z11) {
        if (!(layoutManager instanceof CarouselLayoutManager)) {
            return new int[]{0, 0};
        }
        int iDistanceToFirstFocalKeyline = distanceToFirstFocalKeyline(view, (CarouselLayoutManager) layoutManager, z11);
        if (layoutManager.canScrollHorizontally()) {
            return new int[]{iDistanceToFirstFocalKeyline, 0};
        }
        return layoutManager.canScrollVertically() ? new int[]{0, iDistanceToFirstFocalKeyline} : new int[]{0, 0};
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public RecyclerView.SmoothScroller createScroller(@NonNull final RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new LinearSmoothScroller(this.recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselSnapHelper.1
                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    float f11;
                    float f12;
                    if (layoutManager.canScrollVertically()) {
                        f11 = displayMetrics.densityDpi;
                        f12 = 50.0f;
                    } else {
                        f11 = displayMetrics.densityDpi;
                        f12 = 100.0f;
                    }
                    return f12 / f11;
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                    if (CarouselSnapHelper.this.recyclerView != null) {
                        CarouselSnapHelper carouselSnapHelper = CarouselSnapHelper.this;
                        int[] iArrCalculateDistanceToSnap = carouselSnapHelper.calculateDistanceToSnap(carouselSnapHelper.recyclerView.getLayoutManager(), view, true);
                        int i11 = iArrCalculateDistanceToSnap[0];
                        int i12 = iArrCalculateDistanceToSnap[1];
                        int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i11), Math.abs(i12)));
                        if (iCalculateTimeForDeceleration > 0) {
                            action.update(i11, i12, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
                        }
                    }
                }
            };
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i11, int i12) {
        int itemCount;
        if (!this.disableFling || (itemCount = layoutManager.getItemCount()) == 0) {
            return -1;
        }
        int childCount = layoutManager.getChildCount();
        View view = null;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = layoutManager.getChildAt(i15);
            if (childAt != null) {
                int iDistanceToFirstFocalKeyline = distanceToFirstFocalKeyline(childAt, (CarouselLayoutManager) layoutManager, false);
                if (iDistanceToFirstFocalKeyline <= 0 && iDistanceToFirstFocalKeyline > i14) {
                    view2 = childAt;
                    i14 = iDistanceToFirstFocalKeyline;
                }
                if (iDistanceToFirstFocalKeyline >= 0 && iDistanceToFirstFocalKeyline < i13) {
                    view = childAt;
                    i13 = iDistanceToFirstFocalKeyline;
                }
            }
        }
        boolean zIsForwardFling = isForwardFling(layoutManager, i11, i12);
        if (zIsForwardFling && view != null) {
            return layoutManager.getPosition(view);
        }
        if (!zIsForwardFling && view2 != null) {
            return layoutManager.getPosition(view2);
        }
        if (zIsForwardFling) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = layoutManager.getPosition(view) + (isReverseLayout(layoutManager) == zIsForwardFling ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }

    private int distanceToFirstFocalKeyline(@NonNull View view, CarouselLayoutManager carouselLayoutManager, boolean z11) {
        return carouselLayoutManager.getOffsetToScrollToPositionForSnap(carouselLayoutManager.getPosition(view), z11);
    }

    @Nullable
    private View findViewNearestFirstKeyline(RecyclerView.LayoutManager layoutManager) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount != 0 && (layoutManager instanceof CarouselLayoutManager)) {
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) layoutManager;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = layoutManager.getChildAt(i12);
                int iAbs = Math.abs(carouselLayoutManager.getOffsetToScrollToPositionForSnap(layoutManager.getPosition(childAt), false));
                if (iAbs < i11) {
                    view = childAt;
                    i11 = iAbs;
                }
            }
        }
        return view;
    }

    private boolean isForwardFling(RecyclerView.LayoutManager layoutManager, int i11, int i12) {
        if (layoutManager.canScrollHorizontally()) {
            if (i11 <= 0) {
                return false;
            }
            return true;
        }
        if (i12 <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isReverseLayout(RecyclerView.LayoutManager layoutManager) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = layoutManager.getItemCount();
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (pointFComputeScrollVectorForPosition = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        if (pointFComputeScrollVectorForPosition.x >= 0.0f && pointFComputeScrollVectorForPosition.y >= 0.0f) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) {
        super.attachToRecyclerView(recyclerView);
        this.recyclerView = recyclerView;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        return findViewNearestFirstKeyline(layoutManager);
    }
}
