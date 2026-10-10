package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.util.Preconditions;
import androidx.recyclerview.C3908R;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C7090R;
import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes45.dex */
public class CarouselLayoutManager extends RecyclerView.LayoutManager implements Carousel, RecyclerView.SmoothScroller.ScrollVectorProvider {
    public static final int ALIGNMENT_CENTER = 1;
    public static final int ALIGNMENT_START = 0;
    public static final int HORIZONTAL = 0;
    private static final String TAG = "CarouselLayoutManager";
    public static final int VERTICAL = 1;
    private int carouselAlignment;

    @NonNull
    private CarouselStrategy carouselStrategy;
    private int currentEstimatedPosition;
    private int currentFillStartPosition;

    @Nullable
    private KeylineState currentKeylineState;
    private final DebugItemDecoration debugItemDecoration;
    private boolean isDebuggingEnabled;

    @Nullable
    private KeylineStateList keylineStateList;

    @Nullable
    private Map<Integer, KeylineState> keylineStatePositionMap;
    private int lastItemCount;

    @VisibleForTesting
    int maxScroll;

    @VisibleForTesting
    int minScroll;
    private CarouselOrientationHelper orientationHelper;
    private final View.OnLayoutChangeListener recyclerViewSizeChangeListener;

    @VisibleForTesting
    int scrollOffset;

    public static class DebugItemDecoration extends RecyclerView.ItemDecoration {
        private List<KeylineState.Keyline> keylines;
        private final Paint linePaint;

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
            super.onDrawOver(canvas, recyclerView, state);
            this.linePaint.setStrokeWidth(recyclerView.getResources().getDimension(C7090R.dimen.m3_carousel_debug_keyline_width));
            for (KeylineState.Keyline keyline : this.keylines) {
                this.linePaint.setColor(ColorUtils.blendARGB(-65281, -16776961, keyline.mask));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).isHorizontal()) {
                    canvas.drawLine(keyline.locOffset, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentTop(), keyline.locOffset, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentBottom(), this.linePaint);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentLeft(), keyline.locOffset, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentRight(), keyline.locOffset, this.linePaint);
                }
            }
        }

        public DebugItemDecoration() {
            Paint paint = new Paint();
            this.linePaint = paint;
            this.keylines = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        public void setKeylines(List<KeylineState.Keyline> list) {
            this.keylines = Collections.unmodifiableList(list);
        }
    }

    public CarouselLayoutManager() {
        this(new MultiBrowseCarouselStrategy());
    }

    private static KeylineRange getSurroundingKeylineRange(List<KeylineState.Keyline> list, float f11, boolean z11) {
        float f12 = Float.MAX_VALUE;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        float f13 = -3.4028235E38f;
        float f14 = Float.MAX_VALUE;
        float f15 = Float.MAX_VALUE;
        for (int i15 = 0; i15 < list.size(); i15++) {
            KeylineState.Keyline keyline = list.get(i15);
            float f16 = z11 ? keyline.locOffset : keyline.loc;
            float fAbs = Math.abs(f16 - f11);
            if (f16 <= f11 && fAbs <= f12) {
                i11 = i15;
                f12 = fAbs;
            }
            if (f16 > f11 && fAbs <= f14) {
                i13 = i15;
                f14 = fAbs;
            }
            if (f16 <= f15) {
                i12 = i15;
                f15 = f16;
            }
            if (f16 > f13) {
                i14 = i15;
                f13 = f16;
            }
        }
        if (i11 == -1) {
            i11 = i12;
        }
        if (i13 == -1) {
            i13 = i14;
        }
        return new KeylineRange(list.get(i11), list.get(i13));
    }

    private void recalculateKeylineStateList(RecyclerView.Recycler recycler) {
        View viewForPosition = recycler.getViewForPosition(0);
        measureChildWithMargins(viewForPosition, 0, 0);
        KeylineState keylineStateOnFirstChildMeasuredWithMargins = this.carouselStrategy.onFirstChildMeasuredWithMargins(this, viewForPosition);
        if (isLayoutRtl()) {
            keylineStateOnFirstChildMeasuredWithMargins = KeylineState.reverse(keylineStateOnFirstChildMeasuredWithMargins, getContainerSize());
        }
        this.keylineStateList = KeylineStateList.from(this, keylineStateOnFirstChildMeasuredWithMargins, getItemMargins(), getLeftOrTopPaddingForKeylineShift(), getRightOrBottomPaddingForKeylineShift(), this.carouselStrategy.getStrategyType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshKeylineState() {
        this.keylineStateList = null;
        requestLayout();
    }

    private void scrollBy(RecyclerView recyclerView, int i11) {
        if (isHorizontal()) {
            recyclerView.scrollBy(i11, 0);
        } else {
            recyclerView.scrollBy(0, i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public static final class ChildCalculations {
        final float center;
        final View child;
        final float offsetCenter;
        final KeylineRange range;

        public ChildCalculations(View view, float f11, float f12, KeylineRange keylineRange) {
            this.child = view;
            this.center = f11;
            this.offsetCenter = f12;
            this.range = keylineRange;
        }
    }

    public static class KeylineRange {
        final KeylineState.Keyline leftOrTop;
        final KeylineState.Keyline rightOrBottom;

        public KeylineRange(KeylineState.Keyline keyline, KeylineState.Keyline keyline2) {
            boolean z11;
            if (keyline.loc <= keyline2.loc) {
                z11 = true;
            } else {
                z11 = false;
            }
            Preconditions.checkArgument(z11);
            this.leftOrTop = keyline;
            this.rightOrBottom = keyline2;
        }
    }

    public static class LayoutDirection {
        private static final int INVALID_LAYOUT = Integer.MIN_VALUE;
        private static final int LAYOUT_END = 1;
        private static final int LAYOUT_START = -1;

        private LayoutDirection() {
        }
    }

    public CarouselLayoutManager(@NonNull CarouselStrategy carouselStrategy) {
        this(carouselStrategy, 0);
    }

    private void addAndLayoutView(View view, int i11, ChildCalculations childCalculations) {
        float itemSize = this.currentKeylineState.getItemSize() / 2.0f;
        addView(view, i11);
        measureChildWithMargins(view, 0, 0);
        float f11 = childCalculations.offsetCenter;
        this.orientationHelper.layoutDecoratedWithMargins(view, (int) (f11 - itemSize), (int) (f11 + itemSize));
        updateChildMaskForLocation(view, childCalculations.center, childCalculations.range);
    }

    private void addViewAtPosition(@NonNull RecyclerView.Recycler recycler, int i11, int i12) {
        if (i11 < 0 || i11 >= getItemCount()) {
            return;
        }
        ChildCalculations childCalculationsMakeChildCalculations = makeChildCalculations(recycler, calculateChildStartForFill(i11), i11);
        addAndLayoutView(childCalculationsMakeChildCalculations.child, i12, childCalculationsMakeChildCalculations);
    }

    private float calculateChildOffsetCenterForLocation(float f11, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.leftOrTop;
        float f12 = keyline.locOffset;
        KeylineState.Keyline keyline2 = keylineRange.rightOrBottom;
        float fLerp = AnimationUtils.lerp(f12, keyline2.locOffset, keyline.loc, keyline2.loc, f11);
        if (keylineRange.rightOrBottom != this.currentKeylineState.getFirstKeyline() && keylineRange.leftOrTop != this.currentKeylineState.getLastKeyline()) {
            return fLerp;
        }
        KeylineState.Keyline keyline3 = keylineRange.rightOrBottom;
        return fLerp + ((f11 - keyline3.loc) * (1.0f - keyline3.mask));
    }

    private static int calculateShouldScrollBy(int i11, int i12, int i13, int i14) {
        int i15 = i12 + i11;
        if (i15 < i13) {
            return i13 - i12;
        }
        return i15 > i14 ? i14 - i12 : i11;
    }

    private float getDecoratedCenterWithMargins(View view) {
        Rect rect = new Rect();
        super.getDecoratedBoundsWithMargins(view, rect);
        return isHorizontal() ? rect.centerX() : rect.centerY();
    }

    private KeylineState getKeylineStateForPosition(int i11) {
        KeylineState keylineState;
        Map<Integer, KeylineState> map = this.keylineStatePositionMap;
        return (map == null || (keylineState = map.get(Integer.valueOf(MathUtils.clamp(i11, 0, Math.max(0, getItemCount() + (-1)))))) == null) ? this.keylineStateList.getDefaultState() : keylineState;
    }

    private float getMaskedItemSizeForLocOffset(float f11, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.leftOrTop;
        float f12 = keyline.maskedItemSize;
        KeylineState.Keyline keyline2 = keylineRange.rightOrBottom;
        return AnimationUtils.lerp(f12, keyline2.maskedItemSize, keyline.locOffset, keyline2.locOffset, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentBottom() {
        return this.orientationHelper.getParentBottom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentLeft() {
        return this.orientationHelper.getParentLeft();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentRight() {
        return this.orientationHelper.getParentRight();
    }

    private int getParentStart() {
        return this.orientationHelper.getParentStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentTop() {
        return this.orientationHelper.getParentTop();
    }

    private void logChildrenIfDebugging() {
        if (this.isDebuggingEnabled && Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "internal representation of views on the screen");
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                Log.d(TAG, "item position " + getPosition(childAt) + ", center:" + getDecoratedCenterWithMargins(childAt) + ", child index:" + i11);
            }
            Log.d(TAG, "==============");
        }
    }

    private void setCarouselAttributes(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7090R.styleable.Carousel);
            setCarouselAlignment(typedArrayObtainStyledAttributes.getInt(C7090R.styleable.Carousel_carousel_alignment, 0));
            setOrientation(typedArrayObtainStyledAttributes.getInt(C3908R.styleable.RecyclerView_android_orientation, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void updateChildMaskForLocation(View view, float f11, KeylineRange keylineRange) {
        if (view instanceof Maskable) {
            KeylineState.Keyline keyline = keylineRange.leftOrTop;
            float f12 = keyline.mask;
            KeylineState.Keyline keyline2 = keylineRange.rightOrBottom;
            float fLerp = AnimationUtils.lerp(f12, keyline2.mask, keyline.loc, keyline2.loc, f11);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF maskRect = this.orientationHelper.getMaskRect(height, width, AnimationUtils.lerp(0.0f, height / 2.0f, 0.0f, 1.0f, fLerp), AnimationUtils.lerp(0.0f, width / 2.0f, 0.0f, 1.0f, fLerp));
            float fCalculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(f11, keylineRange);
            RectF rectF = new RectF(fCalculateChildOffsetCenterForLocation - (maskRect.width() / 2.0f), fCalculateChildOffsetCenterForLocation - (maskRect.height() / 2.0f), fCalculateChildOffsetCenterForLocation + (maskRect.width() / 2.0f), (maskRect.height() / 2.0f) + fCalculateChildOffsetCenterForLocation);
            RectF rectF2 = new RectF(getParentLeft(), getParentTop(), getParentRight(), getParentBottom());
            if (this.carouselStrategy.getStrategyType() == CarouselStrategy.StrategyType.CONTAINED) {
                this.orientationHelper.containMaskWithinBounds(maskRect, rectF, rectF2);
            }
            this.orientationHelper.moveMaskOnEdgeOutsideBounds(maskRect, rectF, rectF2);
            ((Maskable) view).setMaskRectF(maskRect);
        }
    }

    private void updateCurrentKeylineStateForScrollOffset(@NonNull KeylineStateList keylineStateList) {
        int i11 = this.maxScroll;
        int i12 = this.minScroll;
        if (i11 <= i12) {
            this.currentKeylineState = getKeylineStartingState(keylineStateList);
        } else {
            this.currentKeylineState = keylineStateList.getShiftedState(this.scrollOffset, i12, i11);
        }
        this.debugItemDecoration.setKeylines(this.currentKeylineState.getKeylines());
    }

    private void validateChildOrderIfDebugging() {
        if (!this.isDebuggingEnabled || getChildCount() < 1) {
            return;
        }
        int i11 = 0;
        while (i11 < getChildCount() - 1) {
            int position = getPosition(getChildAt(i11));
            int i12 = i11 + 1;
            int position2 = getPosition(getChildAt(i12));
            if (position > position2) {
                logChildrenIfDebugging();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i11 + "] had adapter position [" + position + "] and child at index [" + i12 + "] had adapter position [" + position2 + "].");
            }
            i11 = i12;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(@NonNull RecyclerView.State state) {
        return this.scrollOffset;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(@NonNull RecyclerView.State state) {
        return this.maxScroll - this.minScroll;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    @Nullable
    public PointF computeScrollVectorForPosition(int i11) {
        if (this.keylineStateList == null) {
            return null;
        }
        int offsetToScrollToPosition = getOffsetToScrollToPosition(i11, getKeylineStateForPosition(i11));
        return isHorizontal() ? new PointF(offsetToScrollToPosition, 0.0f) : new PointF(0.0f, offsetToScrollToPosition);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(@NonNull RecyclerView.State state) {
        return this.scrollOffset;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(@NonNull RecyclerView.State state) {
        return this.maxScroll - this.minScroll;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getCarouselAlignment() {
        return this.carouselAlignment;
    }

    public int getOffsetToScrollToPositionForSnap(int i11, boolean z11) {
        int offsetToScrollToPosition = getOffsetToScrollToPosition(i11, this.keylineStateList.getShiftedState(this.scrollOffset, this.minScroll, this.maxScroll, true));
        int offsetToScrollToPosition2 = this.keylineStatePositionMap != null ? getOffsetToScrollToPosition(i11, getKeylineStateForPosition(i11)) : offsetToScrollToPosition;
        return (!z11 || Math.abs(offsetToScrollToPosition2) >= Math.abs(offsetToScrollToPosition)) ? offsetToScrollToPosition : offsetToScrollToPosition2;
    }

    public int getOrientation() {
        return this.orientationHelper.orientation;
    }

    @Override // com.google.android.material.carousel.Carousel
    public boolean isHorizontal() {
        return this.orientationHelper.orientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(@NonNull View view, int i11, int i12) {
        if (!(view instanceof Maskable)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        Rect rect = new Rect();
        calculateItemDecorationsForChild(view, rect);
        int i13 = i11 + rect.left + rect.right;
        int i14 = i12 + rect.top + rect.bottom;
        KeylineStateList keylineStateList = this.keylineStateList;
        float itemSize = (keylineStateList == null || this.orientationHelper.orientation != 0) ? ((ViewGroup.MarginLayoutParams) layoutParams).width : keylineStateList.getDefaultState().getItemSize();
        KeylineStateList keylineStateList2 = this.keylineStateList;
        view.measure(RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i13, (int) itemSize, canScrollHorizontally()), RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i14, (int) ((keylineStateList2 == null || this.orientationHelper.orientation != 1) ? ((ViewGroup.MarginLayoutParams) layoutParams).height : keylineStateList2.getDefaultState().getItemSize()), canScrollVertically()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z11, boolean z12) {
        int smallestScrollOffsetToFocalKeyline;
        if (this.keylineStateList == null || (smallestScrollOffsetToFocalKeyline = getSmallestScrollOffsetToFocalKeyline(getPosition(view), getKeylineStateForPosition(getPosition(view)))) == 0) {
            return false;
        }
        scrollBy(recyclerView, getSmallestScrollOffsetToFocalKeyline(getPosition(view), this.keylineStateList.getShiftedState(this.scrollOffset + calculateShouldScrollBy(smallestScrollOffsetToFocalKeyline, this.scrollOffset, this.minScroll, this.maxScroll), this.minScroll, this.maxScroll)));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i11) {
        this.currentEstimatedPosition = i11;
        if (this.keylineStateList == null) {
            return;
        }
        this.scrollOffset = getScrollOffsetForPosition(i11, getKeylineStateForPosition(i11));
        this.currentFillStartPosition = MathUtils.clamp(i11, 0, Math.max(0, getItemCount() - 1));
        updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
        requestLayout();
    }

    public void setCarouselAlignment(int i11) {
        this.carouselAlignment = i11;
        refreshKeylineState();
    }

    public void setCarouselStrategy(@NonNull CarouselStrategy carouselStrategy) {
        this.carouselStrategy = carouselStrategy;
        refreshKeylineState();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setDebuggingEnabled(@NonNull RecyclerView recyclerView, boolean z11) {
        this.isDebuggingEnabled = z11;
        recyclerView.removeItemDecoration(this.debugItemDecoration);
        if (z11) {
            recyclerView.addItemDecoration(this.debugItemDecoration);
        }
        recyclerView.invalidateItemDecorations();
    }

    public void setOrientation(int i11) {
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i11);
        }
        assertNotInLayoutOrScroll(null);
        CarouselOrientationHelper carouselOrientationHelper = this.orientationHelper;
        if (carouselOrientationHelper == null || i11 != carouselOrientationHelper.orientation) {
            this.orientationHelper = CarouselOrientationHelper.createOrientationHelper(this, i11);
            refreshKeylineState();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i11) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselLayoutManager.1
            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public int calculateDxToMakeVisible(View view, int i12) {
                if (CarouselLayoutManager.this.keylineStateList == null || !CarouselLayoutManager.this.isHorizontal()) {
                    return 0;
                }
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                return carouselLayoutManager.calculateScrollDeltaToMakePositionVisible(carouselLayoutManager.getPosition(view));
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public int calculateDyToMakeVisible(View view, int i12) {
                if (CarouselLayoutManager.this.keylineStateList == null || CarouselLayoutManager.this.isHorizontal()) {
                    return 0;
                }
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                return carouselLayoutManager.calculateScrollDeltaToMakePositionVisible(carouselLayoutManager.getPosition(view));
            }

            @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
            @Nullable
            public PointF computeScrollVectorForPosition(int i12) {
                return CarouselLayoutManager.this.computeScrollVectorForPosition(i12);
            }
        };
        linearSmoothScroller.setTargetPosition(i11);
        startSmoothScroll(linearSmoothScroller);
    }

    public CarouselLayoutManager(@NonNull CarouselStrategy carouselStrategy, int i11) {
        this.isDebuggingEnabled = false;
        this.debugItemDecoration = new DebugItemDecoration();
        this.currentFillStartPosition = 0;
        this.recyclerViewSizeChangeListener = new View.OnLayoutChangeListener() { // from class: com.google.android.material.carousel.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                CarouselLayoutManager.m12934b(this.f11760b, view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        };
        this.currentEstimatedPosition = -1;
        this.carouselAlignment = 0;
        setCarouselStrategy(carouselStrategy);
        setOrientation(i11);
    }

    private float addEnd(float f11, float f12) {
        if (isLayoutRtl()) {
            return f11 - f12;
        }
        return f11 + f12;
    }

    private float addStart(float f11, float f12) {
        if (isLayoutRtl()) {
            return f11 + f12;
        }
        return f11 - f12;
    }

    private void addViewsEnd(RecyclerView.Recycler recycler, RecyclerView.State state, int i11) {
        float fCalculateChildStartForFill = calculateChildStartForFill(i11);
        while (i11 < state.getItemCount()) {
            float fAddEnd = addEnd(fCalculateChildStartForFill, this.currentKeylineState.getItemSize() / 2.0f);
            KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), fAddEnd, false);
            float fCalculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(fAddEnd, surroundingKeylineRange);
            if (!isLocOffsetOutOfFillBoundsEnd(fCalculateChildOffsetCenterForLocation, surroundingKeylineRange)) {
                fCalculateChildStartForFill = addEnd(fCalculateChildStartForFill, this.currentKeylineState.getItemSize());
                if (!isLocOffsetOutOfFillBoundsStart(fCalculateChildOffsetCenterForLocation, surroundingKeylineRange)) {
                    View viewForPosition = recycler.getViewForPosition(i11);
                    addAndLayoutView(viewForPosition, -1, new ChildCalculations(viewForPosition, fAddEnd, fCalculateChildOffsetCenterForLocation, surroundingKeylineRange));
                }
                i11++;
            } else {
                return;
            }
        }
    }

    private void addViewsStart(RecyclerView.Recycler recycler, int i11) {
        float fCalculateChildStartForFill = calculateChildStartForFill(i11);
        while (i11 >= 0) {
            float fAddEnd = addEnd(fCalculateChildStartForFill, this.currentKeylineState.getItemSize() / 2.0f);
            KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), fAddEnd, false);
            float fCalculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(fAddEnd, surroundingKeylineRange);
            if (!isLocOffsetOutOfFillBoundsStart(fCalculateChildOffsetCenterForLocation, surroundingKeylineRange)) {
                fCalculateChildStartForFill = addStart(fCalculateChildStartForFill, this.currentKeylineState.getItemSize());
                if (!isLocOffsetOutOfFillBoundsEnd(fCalculateChildOffsetCenterForLocation, surroundingKeylineRange)) {
                    View viewForPosition = recycler.getViewForPosition(i11);
                    addAndLayoutView(viewForPosition, 0, new ChildCalculations(viewForPosition, fAddEnd, fCalculateChildOffsetCenterForLocation, surroundingKeylineRange));
                }
                i11--;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m12934b(final CarouselLayoutManager carouselLayoutManager, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        carouselLayoutManager.getClass();
        if (i13 - i11 == i17 - i15 && i14 - i12 == i18 - i16) {
            return;
        }
        view.post(new Runnable() { // from class: com.google.android.material.carousel.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f11759b.refreshKeylineState();
            }
        });
    }

    private float calculateChildStartForFill(int i11) {
        return addEnd(getParentStart() - this.scrollOffset, this.currentKeylineState.getItemSize() * i11);
    }

    private int calculateEndScroll(RecyclerView.State state, KeylineStateList keylineStateList) {
        KeylineState endState;
        KeylineState.Keyline lastFocalKeyline;
        float f11;
        boolean zIsLayoutRtl = isLayoutRtl();
        if (zIsLayoutRtl) {
            endState = keylineStateList.getStartState();
        } else {
            endState = keylineStateList.getEndState();
        }
        if (zIsLayoutRtl) {
            lastFocalKeyline = endState.getFirstFocalKeyline();
        } else {
            lastFocalKeyline = endState.getLastFocalKeyline();
        }
        int i11 = 1;
        float itemCount = (state.getItemCount() - 1) * endState.getItemSize();
        if (zIsLayoutRtl) {
            f11 = -1.0f;
        } else {
            f11 = 1.0f;
        }
        float parentStart = (itemCount * f11) - (lastFocalKeyline.loc - getParentStart());
        if (zIsLayoutRtl) {
            i11 = -1;
        }
        int i12 = (int) (parentStart + ((i11 * lastFocalKeyline.maskedItemSize) / 2.0f));
        if (zIsLayoutRtl) {
            return Math.min(0, i12);
        }
        return Math.max(0, i12);
    }

    private int calculateStartScroll(@NonNull KeylineStateList keylineStateList) {
        KeylineState startState;
        KeylineState.Keyline firstFocalKeyline;
        boolean zIsLayoutRtl = isLayoutRtl();
        if (zIsLayoutRtl) {
            startState = keylineStateList.getEndState();
        } else {
            startState = keylineStateList.getStartState();
        }
        if (zIsLayoutRtl) {
            firstFocalKeyline = startState.getLastFocalKeyline();
        } else {
            firstFocalKeyline = startState.getFirstFocalKeyline();
        }
        return (int) (getParentStart() - addStart(firstFocalKeyline.loc, startState.getItemSize() / 2.0f));
    }

    private int convertFocusDirectionToLayoutDirection(int i11) {
        int orientation = getOrientation();
        if (i11 == 1) {
            return -1;
        }
        if (i11 == 2) {
            return 1;
        }
        if (i11 != 17) {
            if (i11 != 33) {
                if (i11 != 66) {
                    if (i11 != 130) {
                        Log.d(TAG, "Unknown focus request:" + i11);
                        return Integer.MIN_VALUE;
                    }
                    if (orientation == 1) {
                        return 1;
                    }
                    return Integer.MIN_VALUE;
                }
                if (orientation != 0) {
                    return Integer.MIN_VALUE;
                }
                if (isLayoutRtl()) {
                    return -1;
                }
                return 1;
            }
            if (orientation == 1) {
                return -1;
            }
            return Integer.MIN_VALUE;
        }
        if (orientation != 0) {
            return Integer.MIN_VALUE;
        }
        if (!isLayoutRtl()) {
            return -1;
        }
        return 1;
    }

    private void fill(RecyclerView.Recycler recycler, RecyclerView.State state) {
        removeAndRecycleOutOfBoundsViews(recycler);
        if (getChildCount() == 0) {
            addViewsStart(recycler, this.currentFillStartPosition - 1);
            addViewsEnd(recycler, state, this.currentFillStartPosition);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            addViewsStart(recycler, position - 1);
            addViewsEnd(recycler, state, position2 + 1);
        }
        validateChildOrderIfDebugging();
    }

    private View getChildClosestToEnd() {
        int childCount;
        if (isLayoutRtl()) {
            childCount = 0;
        } else {
            childCount = getChildCount() - 1;
        }
        return getChildAt(childCount);
    }

    private View getChildClosestToStart() {
        int childCount;
        if (isLayoutRtl()) {
            childCount = getChildCount() - 1;
        } else {
            childCount = 0;
        }
        return getChildAt(childCount);
    }

    private int getContainerSize() {
        if (isHorizontal()) {
            return getContainerWidth();
        }
        return getContainerHeight();
    }

    private int getItemMargins() {
        int i11;
        int i12;
        if (getChildCount() <= 0) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) getChildAt(0).getLayoutParams();
        if (this.orientationHelper.orientation == 0) {
            i11 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            i12 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            i11 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            i12 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return i11 + i12;
    }

    private KeylineState getKeylineStartingState(KeylineStateList keylineStateList) {
        if (isLayoutRtl()) {
            return keylineStateList.getEndState();
        }
        return keylineStateList.getStartState();
    }

    private int getLeftOrTopPaddingForKeylineShift() {
        if (getClipToPadding()) {
            return 0;
        }
        if (getOrientation() == 1) {
            return getPaddingTop();
        }
        return getPaddingLeft();
    }

    private int getRightOrBottomPaddingForKeylineShift() {
        if (getClipToPadding()) {
            return 0;
        }
        if (getOrientation() == 1) {
            return getPaddingBottom();
        }
        return getPaddingRight();
    }

    private int getScrollOffsetForPosition(int i11, KeylineState keylineState) {
        if (isLayoutRtl()) {
            return (int) (((getContainerSize() - keylineState.getLastFocalKeyline().loc) - (i11 * keylineState.getItemSize())) - (keylineState.getItemSize() / 2.0f));
        }
        return (int) (((i11 * keylineState.getItemSize()) - keylineState.getFirstFocalKeyline().loc) + (keylineState.getItemSize() / 2.0f));
    }

    private int getSmallestScrollOffsetToFocalKeyline(int i11, @NonNull KeylineState keylineState) {
        int containerSize;
        int i12 = Integer.MAX_VALUE;
        for (KeylineState.Keyline keyline : keylineState.getFocalKeylines()) {
            float itemSize = (i11 * keylineState.getItemSize()) + (keylineState.getItemSize() / 2.0f);
            if (isLayoutRtl()) {
                containerSize = (int) ((getContainerSize() - keyline.loc) - itemSize);
            } else {
                containerSize = (int) (itemSize - keyline.loc);
            }
            int i13 = containerSize - this.scrollOffset;
            if (Math.abs(i12) > Math.abs(i13)) {
                i12 = i13;
            }
        }
        return i12;
    }

    private boolean isLocOffsetOutOfFillBoundsEnd(float f11, KeylineRange keylineRange) {
        float fAddStart = addStart(f11, getMaskedItemSizeForLocOffset(f11, keylineRange) / 2.0f);
        if (isLayoutRtl()) {
            if (fAddStart >= 0.0f) {
                return false;
            }
            return true;
        }
        if (fAddStart <= getContainerSize()) {
            return false;
        }
        return true;
    }

    private boolean isLocOffsetOutOfFillBoundsStart(float f11, KeylineRange keylineRange) {
        float fAddEnd = addEnd(f11, getMaskedItemSizeForLocOffset(f11, keylineRange) / 2.0f);
        if (isLayoutRtl()) {
            if (fAddEnd <= getContainerSize()) {
                return false;
            }
            return true;
        }
        if (fAddEnd >= 0.0f) {
            return false;
        }
        return true;
    }

    private ChildCalculations makeChildCalculations(RecyclerView.Recycler recycler, float f11, int i11) {
        View viewForPosition = recycler.getViewForPosition(i11);
        measureChildWithMargins(viewForPosition, 0, 0);
        float fAddEnd = addEnd(f11, this.currentKeylineState.getItemSize() / 2.0f);
        KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), fAddEnd, false);
        return new ChildCalculations(viewForPosition, fAddEnd, calculateChildOffsetCenterForLocation(fAddEnd, surroundingKeylineRange), surroundingKeylineRange);
    }

    private float offsetChild(View view, float f11, float f12, Rect rect) {
        float fAddEnd = addEnd(f11, f12);
        KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), fAddEnd, false);
        float fCalculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(fAddEnd, surroundingKeylineRange);
        super.getDecoratedBoundsWithMargins(view, rect);
        updateChildMaskForLocation(view, fAddEnd, surroundingKeylineRange);
        this.orientationHelper.offsetChild(view, rect, f12, fCalculateChildOffsetCenterForLocation);
        return fCalculateChildOffsetCenterForLocation;
    }

    private void removeAndRecycleOutOfBoundsViews(RecyclerView.Recycler recycler) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            float decoratedCenterWithMargins = getDecoratedCenterWithMargins(childAt);
            if (!isLocOffsetOutOfFillBoundsStart(decoratedCenterWithMargins, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), decoratedCenterWithMargins, true))) {
                break;
            } else {
                removeAndRecycleView(childAt, recycler);
            }
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            float decoratedCenterWithMargins2 = getDecoratedCenterWithMargins(childAt2);
            if (isLocOffsetOutOfFillBoundsEnd(decoratedCenterWithMargins2, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), decoratedCenterWithMargins2, true))) {
                removeAndRecycleView(childAt2, recycler);
            } else {
                return;
            }
        }
    }

    private void updateItemCount() {
        int itemCount = getItemCount();
        int i11 = this.lastItemCount;
        if (itemCount != i11 && this.keylineStateList != null) {
            if (this.carouselStrategy.shouldRefreshKeylineState(this, i11)) {
                refreshKeylineState();
            }
            this.lastItemCount = itemCount;
        }
    }

    public int calculateScrollDeltaToMakePositionVisible(int i11) {
        return (int) (this.scrollOffset - getScrollOffsetForPosition(i11, getKeylineStateForPosition(i11)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return !isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(@NonNull RecyclerView.State state) {
        if (getChildCount() != 0 && this.keylineStateList != null && getItemCount() > 1) {
            return (int) (getWidth() * (this.keylineStateList.getDefaultState().getItemSize() / computeHorizontalScrollRange(state)));
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(@NonNull RecyclerView.State state) {
        if (getChildCount() != 0 && this.keylineStateList != null && getItemCount() > 1) {
            return (int) (getHeight() * (this.keylineStateList.getDefaultState().getItemSize() / computeVerticalScrollRange(state)));
        }
        return 0;
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getContainerHeight() {
        return getHeight();
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getContainerWidth() {
        return getWidth();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        float fWidth;
        super.getDecoratedBoundsWithMargins(view, rect);
        float fCenterY = rect.centerY();
        if (isHorizontal()) {
            fCenterY = rect.centerX();
        }
        float maskedItemSizeForLocOffset = getMaskedItemSizeForLocOffset(fCenterY, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), fCenterY, true));
        float fHeight = 0.0f;
        if (isHorizontal()) {
            fWidth = (rect.width() - maskedItemSizeForLocOffset) / 2.0f;
        } else {
            fWidth = 0.0f;
        }
        if (!isHorizontal()) {
            fHeight = (rect.height() - maskedItemSizeForLocOffset) / 2.0f;
        }
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    public int getOffsetToScrollToPosition(int i11, @NonNull KeylineState keylineState) {
        return getScrollOffsetForPosition(i11, keylineState) - this.scrollOffset;
    }

    public boolean isLayoutRtl() {
        if (isHorizontal() && getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public void notifyItemSizeChanged() {
        refreshKeylineState();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.carouselStrategy.initialize(recyclerView.getContext());
        refreshKeylineState();
        recyclerView.addOnLayoutChangeListener(this.recyclerViewSizeChangeListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        recyclerView.removeOnLayoutChangeListener(this.recyclerViewSizeChangeListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @Nullable
    public View onFocusSearchFailed(@NonNull View view, int i11, @NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state) {
        int iConvertFocusDirectionToLayoutDirection;
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i11)) == Integer.MIN_VALUE) {
            return null;
        }
        if (iConvertFocusDirectionToLayoutDirection == -1) {
            if (getPosition(view) == 0) {
                return null;
            }
            addViewAtPosition(recycler, getPosition(getChildAt(0)) - 1, 0);
            return getChildClosestToStart();
        }
        if (getPosition(view) == getItemCount() - 1) {
            return null;
        }
        addViewAtPosition(recycler, getPosition(getChildAt(getChildCount() - 1)) + 1, -1);
        return getChildClosestToEnd();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(@NonNull RecyclerView recyclerView, int i11, int i12) {
        super.onItemsAdded(recyclerView, i11, i12);
        updateItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(@NonNull RecyclerView recyclerView) {
        super.onItemsChanged(recyclerView);
        updateItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i11, int i12) {
        super.onItemsRemoved(recyclerView, i11, i12);
        updateItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean z11;
        int i11;
        if (state.getItemCount() > 0 && getContainerSize() > 0.0f) {
            boolean zIsLayoutRtl = isLayoutRtl();
            KeylineStateList keylineStateList = this.keylineStateList;
            if (keylineStateList == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 || keylineStateList.getDefaultState().getCarouselSize() != getContainerSize()) {
                recalculateKeylineStateList(recycler);
            }
            int iCalculateStartScroll = calculateStartScroll(this.keylineStateList);
            int iCalculateEndScroll = calculateEndScroll(state, this.keylineStateList);
            if (zIsLayoutRtl) {
                i11 = iCalculateEndScroll;
            } else {
                i11 = iCalculateStartScroll;
            }
            this.minScroll = i11;
            if (zIsLayoutRtl) {
                iCalculateEndScroll = iCalculateStartScroll;
            }
            this.maxScroll = iCalculateEndScroll;
            if (z11) {
                this.scrollOffset = iCalculateStartScroll;
                this.keylineStatePositionMap = this.keylineStateList.getKeylineStateForPositionMap(getItemCount(), this.minScroll, this.maxScroll, isLayoutRtl());
                int i12 = this.currentEstimatedPosition;
                if (i12 != -1) {
                    this.scrollOffset = getScrollOffsetForPosition(i12, getKeylineStateForPosition(i12));
                }
            }
            int i13 = this.scrollOffset;
            this.scrollOffset = i13 + calculateShouldScrollBy(0, i13, this.minScroll, this.maxScroll);
            this.currentFillStartPosition = MathUtils.clamp(this.currentFillStartPosition, 0, state.getItemCount());
            updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
            detachAndScrapAttachedViews(recycler);
            fill(recycler, state);
            this.lastItemCount = getItemCount();
            return;
        }
        removeAndRecycleAllViews(recycler);
        this.currentFillStartPosition = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        if (getChildCount() == 0) {
            this.currentFillStartPosition = 0;
        } else {
            this.currentFillStartPosition = getPosition(getChildAt(0));
        }
        validateChildOrderIfDebugging();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (canScrollHorizontally()) {
            return scrollBy(i11, recycler, state);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (canScrollVertically()) {
            return scrollBy(i11, recycler, state);
        }
        return 0;
    }

    private int scrollBy(int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
        float f11;
        if (getChildCount() == 0 || i11 == 0) {
            return 0;
        }
        if (this.keylineStateList == null) {
            recalculateKeylineStateList(recycler);
        }
        if (getItemCount() <= getKeylineStartingState(this.keylineStateList).getTotalVisibleFocalItems()) {
            return 0;
        }
        int iCalculateShouldScrollBy = calculateShouldScrollBy(i11, this.scrollOffset, this.minScroll, this.maxScroll);
        this.scrollOffset += iCalculateShouldScrollBy;
        updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
        float itemSize = this.currentKeylineState.getItemSize() / 2.0f;
        float fCalculateChildStartForFill = calculateChildStartForFill(getPosition(getChildAt(0)));
        Rect rect = new Rect();
        if (isLayoutRtl()) {
            f11 = this.currentKeylineState.getLastFocalKeyline().locOffset;
        } else {
            f11 = this.currentKeylineState.getFirstFocalKeyline().locOffset;
        }
        float f12 = Float.MAX_VALUE;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            float fAbs = Math.abs(f11 - offsetChild(childAt, fCalculateChildStartForFill, itemSize, rect));
            if (childAt != null && fAbs < f12) {
                this.currentEstimatedPosition = getPosition(childAt);
                f12 = fAbs;
            }
            fCalculateChildStartForFill = addEnd(fCalculateChildStartForFill, this.currentKeylineState.getItemSize());
        }
        fill(recycler, state);
        return iCalculateShouldScrollBy;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        this.isDebuggingEnabled = false;
        this.debugItemDecoration = new DebugItemDecoration();
        this.currentFillStartPosition = 0;
        this.recyclerViewSizeChangeListener = new View.OnLayoutChangeListener() { // from class: com.google.android.material.carousel.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i110) {
                CarouselLayoutManager.m12934b(this.f11760b, view, i13, i14, i15, i16, i17, i18, i19, i110);
            }
        };
        this.currentEstimatedPosition = -1;
        this.carouselAlignment = 0;
        setCarouselStrategy(new MultiBrowseCarouselStrategy());
        setCarouselAttributes(context, attributeSet);
    }
}
