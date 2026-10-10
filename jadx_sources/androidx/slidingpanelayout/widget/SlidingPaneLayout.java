package androidx.slidingpanelayout.widget;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.Openable;
import androidx.customview.widget.ViewDragHelper;
import androidx.transition.ChangeBounds;
import androidx.transition.TransitionManager;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes34.dex */
public class SlidingPaneLayout extends ViewGroup implements Openable {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.slidingpanelayout.widget.SlidingPaneLayout";
    public static final int LOCK_MODE_LOCKED = 3;
    public static final int LOCK_MODE_LOCKED_CLOSED = 2;
    public static final int LOCK_MODE_LOCKED_OPEN = 1;
    public static final int LOCK_MODE_UNLOCKED = 0;
    private static final int MIN_FLING_VELOCITY = 400;
    private static final String TAG = "SlidingPaneLayout";
    private static boolean sEdgeSizeUsingSystemGestureInsets;
    private boolean mCanSlide;
    private int mCoveredFadeColor;
    private boolean mDisplayListReflectionLoaded;
    final ViewDragHelper mDragHelper;
    private boolean mFirstLayout;
    FoldingFeature mFoldingFeature;
    private FoldingFeatureObserver mFoldingFeatureObserver;
    private Method mGetDisplayList;
    private float mInitialMotionX;
    private float mInitialMotionY;
    boolean mIsUnableToDrag;
    private int mLockMode;
    private FoldingFeatureObserver.OnFoldingFeatureChangeListener mOnFoldingFeatureChangeListener;

    @Nullable
    private PanelSlideListener mPanelSlideListener;
    private final List<PanelSlideListener> mPanelSlideListeners;
    private int mParallaxBy;
    private float mParallaxOffset;
    final ArrayList<DisableLayerRunnable> mPostedRunnables;
    boolean mPreservedOpenState;
    private Field mRecreateDisplayList;
    private Drawable mShadowDrawableLeft;
    private Drawable mShadowDrawableRight;
    float mSlideOffset;
    int mSlideRange;
    View mSlideableView;
    private int mSliderFadeColor;
    private final Rect mTmpRect;

    public class AccessibilityDelegate extends AccessibilityDelegateCompat {
        private final Rect mTmpRect = new Rect();

        public AccessibilityDelegate() {
        }

        private void copyNodeInfoNoChildren(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2) {
            Rect rect = this.mTmpRect;
            accessibilityNodeInfoCompat2.getBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setBoundsInScreen(rect);
            accessibilityNodeInfoCompat.setVisibleToUser(accessibilityNodeInfoCompat2.isVisibleToUser());
            accessibilityNodeInfoCompat.setPackageName(accessibilityNodeInfoCompat2.getPackageName());
            accessibilityNodeInfoCompat.setClassName(accessibilityNodeInfoCompat2.getClassName());
            accessibilityNodeInfoCompat.setContentDescription(accessibilityNodeInfoCompat2.getContentDescription());
            accessibilityNodeInfoCompat.setEnabled(accessibilityNodeInfoCompat2.isEnabled());
            accessibilityNodeInfoCompat.setClickable(accessibilityNodeInfoCompat2.isClickable());
            accessibilityNodeInfoCompat.setFocusable(accessibilityNodeInfoCompat2.isFocusable());
            accessibilityNodeInfoCompat.setFocused(accessibilityNodeInfoCompat2.isFocused());
            accessibilityNodeInfoCompat.setAccessibilityFocused(accessibilityNodeInfoCompat2.isAccessibilityFocused());
            accessibilityNodeInfoCompat.setSelected(accessibilityNodeInfoCompat2.isSelected());
            accessibilityNodeInfoCompat.setLongClickable(accessibilityNodeInfoCompat2.isLongClickable());
            accessibilityNodeInfoCompat.addAction(accessibilityNodeInfoCompat2.getActions());
            accessibilityNodeInfoCompat.setMovementGranularities(accessibilityNodeInfoCompat2.getMovementGranularities());
        }

        public boolean filter(View view) {
            return SlidingPaneLayout.this.isDimmed(view);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.ACCESSIBILITY_CLASS_NAME);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain(accessibilityNodeInfoCompat);
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompatObtain);
            copyNodeInfoNoChildren(accessibilityNodeInfoCompat, accessibilityNodeInfoCompatObtain);
            accessibilityNodeInfoCompatObtain.recycle();
            accessibilityNodeInfoCompat.setClassName(SlidingPaneLayout.ACCESSIBILITY_CLASS_NAME);
            accessibilityNodeInfoCompat.setSource(view);
            Object parentForAccessibility = ViewCompat.getParentForAccessibility(view);
            if (parentForAccessibility instanceof View) {
                accessibilityNodeInfoCompat.setParent((View) parentForAccessibility);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i11);
                if (!filter(childAt) && childAt.getVisibility() == 0) {
                    ViewCompat.setImportantForAccessibility(childAt, 1);
                    accessibilityNodeInfoCompat.addChild(childAt);
                }
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!filter(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    public class DisableLayerRunnable implements Runnable {
        final View mChildView;

        public DisableLayerRunnable(View view) {
            this.mChildView = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mChildView.getParent() == SlidingPaneLayout.this) {
                this.mChildView.setLayerType(0, null);
                SlidingPaneLayout.this.invalidateChildRegion(this.mChildView);
            }
            SlidingPaneLayout.this.mPostedRunnables.remove(this);
        }
    }

    public class DragHelperCallback extends ViewDragHelper.Callback {
        public DragHelperCallback() {
        }

        private boolean isDraggable() {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.mIsUnableToDrag || slidingPaneLayout.getLockMode() == 3) {
                return false;
            }
            if (SlidingPaneLayout.this.isOpen() && SlidingPaneLayout.this.getLockMode() == 1) {
                return false;
            }
            return SlidingPaneLayout.this.isOpen() || SlidingPaneLayout.this.getLockMode() != 2;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View view, int i11, int i12) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.mSlideableView.getLayoutParams();
            if (SlidingPaneLayout.this.isLayoutRtlSupport()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + SlidingPaneLayout.this.mSlideableView.getWidth());
                return Math.max(Math.min(i11, width), width - SlidingPaneLayout.this.mSlideRange);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            return Math.min(Math.max(i11, paddingLeft), SlidingPaneLayout.this.mSlideRange + paddingLeft);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(View view) {
            return SlidingPaneLayout.this.mSlideRange;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(View view, int i11) {
            SlidingPaneLayout.this.setAllChildrenVisible();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i11) {
            if (SlidingPaneLayout.this.mDragHelper.getViewDragState() == 0) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                if (slidingPaneLayout.mSlideOffset != 1.0f) {
                    slidingPaneLayout.dispatchOnPanelOpened(slidingPaneLayout.mSlideableView);
                    SlidingPaneLayout.this.mPreservedOpenState = true;
                } else {
                    slidingPaneLayout.updateObscuredViewsVisibility(slidingPaneLayout.mSlideableView);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    slidingPaneLayout2.dispatchOnPanelClosed(slidingPaneLayout2.mSlideableView);
                    SlidingPaneLayout.this.mPreservedOpenState = false;
                }
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i11, int i12, int i13, int i14) {
            SlidingPaneLayout.this.onPanelDragged(i11);
            SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View view, int i11, int i12) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeDragStarted(int i11, int i12) {
            if (!isDraggable()) {
                return;
            }
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.mDragHelper.captureChildView(slidingPaneLayout.mSlideableView, i12);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeTouched(int i11, int i12) {
            if (!isDraggable()) {
                return;
            }
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.mDragHelper.captureChildView(slidingPaneLayout.mSlideableView, i12);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(View view, float f11, float f12) {
            int paddingLeft;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.isLayoutRtlSupport()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                if (f11 < 0.0f || (f11 == 0.0f && SlidingPaneLayout.this.mSlideOffset > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.mSlideRange;
                }
                paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.mSlideableView.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                if (f11 > 0.0f || (f11 == 0.0f && SlidingPaneLayout.this.mSlideOffset > 0.5f)) {
                    paddingLeft += SlidingPaneLayout.this.mSlideRange;
                }
            }
            SlidingPaneLayout.this.mDragHelper.settleCapturedViewAt(paddingLeft, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i11) {
            if (!isDraggable()) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).slideable;
        }
    }

    public interface PanelSlideListener {
        void onPanelClosed(@NonNull View view);

        void onPanelOpened(@NonNull View view);

        void onPanelSlide(@NonNull View view, float f11);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };
        boolean isOpen;
        int mLockMode;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.isOpen = parcel.readInt() != 0;
            this.mLockMode = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.isOpen ? 1 : 0);
            parcel.writeInt(this.mLockMode);
        }
    }

    public SlidingPaneLayout(@NonNull Context context) {
        this(context, null);
    }

    private boolean closePane(int i11) {
        if (!this.mCanSlide) {
            this.mPreservedOpenState = false;
        }
        if (!this.mFirstLayout && !smoothSlideTo(1.0f, i11)) {
            return false;
        }
        this.mPreservedOpenState = false;
        return true;
    }

    private static Rect getFoldBoundsInView(@NonNull FoldingFeature foldingFeature, View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i11 = iArr[0];
        Rect rect = new Rect(i11, iArr[1], view.getWidth() + i11, iArr[1] + view.getWidth());
        Rect rect2 = new Rect(foldingFeature.getBounds());
        boolean zIntersect = rect2.intersect(rect);
        if ((rect2.width() == 0 && rect2.height() == 0) || !zIntersect) {
            return null;
        }
        rect2.offset(-iArr[0], -iArr[1]);
        return rect2;
    }

    private boolean openPane(int i11) {
        if (!this.mCanSlide) {
            this.mPreservedOpenState = true;
        }
        if (!this.mFirstLayout && !smoothSlideTo(0.0f, i11)) {
            return false;
        }
        this.mPreservedOpenState = true;
        return true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public boolean isDimmed(View view) {
        if (view == null) {
            return false;
        }
        return this.mCanSlide && ((LayoutParams) view.getLayoutParams()).dimWhenOffset && this.mSlideOffset > 0.0f;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        private static final int[] ATTRS = {R.attr.layout_weight};
        Paint dimPaint;
        boolean dimWhenOffset;
        boolean slideable;
        public float weight;

        public LayoutParams() {
            super(-1, -1);
            this.weight = 0.0f;
        }

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
            this.weight = 0.0f;
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.weight = 0.0f;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.weight = 0.0f;
        }

        public LayoutParams(@NonNull LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.weight = 0.0f;
            this.weight = layoutParams.weight;
        }

        public LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.weight = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ATTRS);
            this.weight = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class TouchBlocker extends FrameLayout {
        @Override // android.view.View
        public boolean onGenericMotionEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }

        public TouchBlocker(View view) {
            super(view.getContext());
            addView(view);
        }
    }

    static {
        sEdgeSizeUsingSystemGestureInsets = Build.VERSION.SDK_INT >= 29;
    }

    public SlidingPaneLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Nullable
    private static Activity getActivityOrNull(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    private static int getMinimumWidth(View view) {
        return view instanceof TouchBlocker ? ViewCompat.getMinimumWidth(((TouchBlocker) view).getChildAt(0)) : ViewCompat.getMinimumWidth(view);
    }

    private Insets getSystemGestureInsets() {
        WindowInsetsCompat rootWindowInsets;
        if (!sEdgeSizeUsingSystemGestureInsets || (rootWindowInsets = ViewCompat.getRootWindowInsets(this)) == null) {
            return null;
        }
        return rootWindowInsets.getSystemGestureInsets();
    }

    private void setFoldingFeatureObserver(FoldingFeatureObserver foldingFeatureObserver) {
        this.mFoldingFeatureObserver = foldingFeatureObserver;
        foldingFeatureObserver.setOnFoldingFeatureChangeListener(this.mOnFoldingFeatureChangeListener);
    }

    private ArrayList<Rect> splitViewPositions() {
        Rect foldBoundsInView;
        FoldingFeature foldingFeature = this.mFoldingFeature;
        if (foldingFeature == null || !foldingFeature.isSeparating() || this.mFoldingFeature.getBounds().left == 0 || this.mFoldingFeature.getBounds().top != 0 || (foldBoundsInView = getFoldBoundsInView(this.mFoldingFeature, this)) == null) {
            return null;
        }
        Rect rect = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), foldBoundsInView.left), getHeight() - getPaddingBottom());
        int width = getWidth() - getPaddingRight();
        return new ArrayList<>(Arrays.asList(rect, new Rect(Math.min(width, foldBoundsInView.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
    }

    public void addPanelSlideListener(@NonNull PanelSlideListener panelSlideListener) {
        this.mPanelSlideListeners.add(panelSlideListener);
    }

    public boolean canScroll(View view, boolean z11, int i11, int i12, int i13) {
        int i14;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i15 = i12 + scrollX;
                if (i15 >= childAt.getLeft() && i15 < childAt.getRight() && (i14 = i13 + scrollY) >= childAt.getTop() && i14 < childAt.getBottom() && canScroll(childAt, true, i11, i15 - childAt.getLeft(), i14 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (!z11) {
            return false;
        }
        if (!isLayoutRtlSupport()) {
            i11 = -i11;
        }
        return view.canScrollHorizontally(i11);
    }

    @Deprecated
    public boolean canSlide() {
        return this.mCanSlide;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.mDragHelper.continueSettling(true)) {
            if (this.mCanSlide) {
                ViewCompat.postInvalidateOnAnimation(this);
            } else {
                this.mDragHelper.abort();
            }
        }
    }

    public void dispatchOnPanelClosed(@NonNull View view) {
        Iterator<PanelSlideListener> it = this.mPanelSlideListeners.iterator();
        while (it.hasNext()) {
            it.next().onPanelClosed(view);
        }
        sendAccessibilityEvent(32);
    }

    public void dispatchOnPanelOpened(@NonNull View view) {
        Iterator<PanelSlideListener> it = this.mPanelSlideListeners.iterator();
        while (it.hasNext()) {
            it.next().onPanelOpened(view);
        }
        sendAccessibilityEvent(32);
    }

    public void dispatchOnPanelSlide(@NonNull View view) {
        Iterator<PanelSlideListener> it = this.mPanelSlideListeners.iterator();
        while (it.hasNext()) {
            it.next().onPanelSlide(view, this.mSlideOffset);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @ColorInt
    @Deprecated
    public int getCoveredFadeColor() {
        return this.mCoveredFadeColor;
    }

    public final int getLockMode() {
        return this.mLockMode;
    }

    @Px
    public int getParallaxDistance() {
        return this.mParallaxBy;
    }

    @ColorInt
    @Deprecated
    public int getSliderFadeColor() {
        return this.mSliderFadeColor;
    }

    @Override // androidx.customview.widget.Openable
    public boolean isOpen() {
        return !this.mCanSlide || this.mSlideOffset == 0.0f;
    }

    public boolean isSlideable() {
        return this.mCanSlide;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        FoldingFeature foldingFeature;
        int iWidth;
        boolean zIsLayoutRtlSupport = isLayoutRtlSupport();
        int i19 = i13 - i11;
        int paddingRight = zIsLayoutRtlSupport ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zIsLayoutRtlSupport ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.mFirstLayout) {
            this.mSlideOffset = (this.mCanSlide && this.mPreservedOpenState) ? 0.0f : 1.0f;
        }
        int i21 = paddingRight;
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt = getChildAt(i22);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.slideable) {
                    int i23 = i19 - paddingLeft;
                    int iMin = (Math.min(paddingRight, i23) - i21) - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    this.mSlideRange = iMin;
                    int i24 = zIsLayoutRtlSupport ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    layoutParams.dimWhenOffset = ((i21 + i24) + iMin) + (measuredWidth / 2) > i23;
                    int i25 = (int) (iMin * this.mSlideOffset);
                    i21 += i24 + i25;
                    this.mSlideOffset = i25 / iMin;
                } else {
                    if (!this.mCanSlide || (i15 = this.mParallaxBy) == 0) {
                        i21 = paddingRight;
                    } else {
                        i16 = (int) ((1.0f - this.mSlideOffset) * i15);
                        i21 = paddingRight;
                    }
                    if (zIsLayoutRtlSupport) {
                        i18 = (i19 - i21) + i16;
                        i17 = i18 - measuredWidth;
                    } else {
                        i17 = i21 - i16;
                        i18 = i17 + measuredWidth;
                    }
                    childAt.layout(i17, paddingTop, i18, childAt.getMeasuredHeight() + paddingTop);
                    foldingFeature = this.mFoldingFeature;
                    if (foldingFeature == null && foldingFeature.getOrientation() == FoldingFeature.Orientation.VERTICAL && this.mFoldingFeature.isSeparating()) {
                        iWidth = this.mFoldingFeature.getBounds().width();
                    } else {
                        iWidth = 0;
                    }
                    paddingRight += childAt.getWidth() + Math.abs(iWidth);
                }
                i16 = 0;
                if (zIsLayoutRtlSupport) {
                    i18 = (i19 - i21) + i16;
                    i17 = i18 - measuredWidth;
                } else {
                    i17 = i21 - i16;
                    i18 = i17 + measuredWidth;
                }
                childAt.layout(i17, paddingTop, i18, childAt.getMeasuredHeight() + paddingTop);
                foldingFeature = this.mFoldingFeature;
                if (foldingFeature == null) {
                    iWidth = 0;
                } else {
                    iWidth = 0;
                }
                paddingRight += childAt.getWidth() + Math.abs(iWidth);
            }
        }
        if (this.mFirstLayout) {
            if (this.mCanSlide && this.mParallaxBy != 0) {
                parallaxOtherViews(this.mSlideOffset);
            }
            updateObscuredViewsVisibility(this.mSlideableView);
        }
        this.mFirstLayout = false;
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        int paddingTop;
        int iMin;
        int i13;
        int iMax;
        int iMakeMeasureSpec;
        int i14;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (mode2 != Integer.MIN_VALUE) {
            iMin = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = iMin;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            iMin = 0;
        }
        int iMax2 = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e(TAG, "onMeasure: More than two child views are not supported.");
        }
        this.mSlideableView = null;
        int i15 = 0;
        boolean z11 = false;
        int i16 = iMax2;
        float f11 = 0.0f;
        while (true) {
            i13 = 8;
            if (i15 >= childCount) {
                break;
            }
            View childAt = getChildAt(i15);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int i17 = iMax2;
            if (childAt.getVisibility() == 8) {
                layoutParams.dimWhenOffset = false;
            } else {
                float f12 = layoutParams.weight;
                if (f12 > 0.0f) {
                    f11 += f12;
                    if (((ViewGroup.MarginLayoutParams) layoutParams).width == 0) {
                    }
                    i15 = i14 + 1;
                    iMax2 = i17;
                }
                int iMax3 = Math.max(i17 - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin), 0);
                int i18 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                i14 = i15;
                childAt.measure(i18 == -2 ? View.MeasureSpec.makeMeasureSpec(iMax3, mode == 0 ? mode : Integer.MIN_VALUE) : i18 == -1 ? View.MeasureSpec.makeMeasureSpec(iMax3, mode) : View.MeasureSpec.makeMeasureSpec(i18, 1073741824), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height));
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > iMin) {
                    if (mode2 == Integer.MIN_VALUE) {
                        iMin = Math.min(measuredHeight, paddingTop);
                    } else if (mode2 == 0) {
                        iMin = measuredHeight;
                    }
                }
                i16 -= measuredWidth;
                if (i14 != 0) {
                    boolean z12 = i16 < 0;
                    layoutParams.slideable = z12;
                    z11 |= z12;
                    if (z12) {
                        this.mSlideableView = childAt;
                    }
                }
                i15 = i14 + 1;
                iMax2 = i17;
            }
            i14 = i15;
            i15 = i14 + 1;
            iMax2 = i17;
        }
        int i19 = iMax2;
        if (z11 || f11 > 0.0f) {
            int i21 = 0;
            while (i21 < childCount) {
                View childAt2 = getChildAt(i21);
                if (childAt2.getVisibility() != i13) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    int measuredWidth2 = (((ViewGroup.MarginLayoutParams) layoutParams2).width != 0 || layoutParams2.weight <= 0.0f) ? childAt2.getMeasuredWidth() : 0;
                    if (z11) {
                        iMax = i19 - (((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else if (layoutParams2.weight > 0.0f) {
                        iMax = measuredWidth2 + ((int) ((layoutParams2.weight * Math.max(0, i16)) / f11));
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else {
                        iMax = measuredWidth2;
                        iMakeMeasureSpec = 0;
                    }
                    int iMeasureChildHeight = measureChildHeight(childAt2, i12, getPaddingTop() + getPaddingBottom());
                    if (measuredWidth2 != iMax) {
                        childAt2.measure(iMakeMeasureSpec, iMeasureChildHeight);
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        if (measuredHeight2 > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                iMin = Math.min(measuredHeight2, paddingTop);
                            } else if (mode2 == 0) {
                                iMin = measuredHeight2;
                            }
                        }
                    }
                }
                i21++;
                i13 = 8;
            }
        }
        ArrayList<Rect> arrayListSplitViewPositions = splitViewPositions();
        if (arrayListSplitViewPositions != null && !z11) {
            for (int i22 = 0; i22 < childCount; i22++) {
                View childAt3 = getChildAt(i22);
                if (childAt3.getVisibility() != 8) {
                    Rect rect = arrayListSplitViewPositions.get(i22);
                    LayoutParams layoutParams3 = (LayoutParams) childAt3.getLayoutParams();
                    int i23 = ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin;
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), Integer.MIN_VALUE), iMakeMeasureSpec2);
                    if ((childAt3.getMeasuredWidthAndState() & 16777216) == 1 || (getMinimumWidth(childAt3) != 0 && rect.width() < getMinimumWidth(childAt3))) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(i19 - i23, 1073741824), iMakeMeasureSpec2);
                        if (i22 != 0) {
                            layoutParams3.slideable = true;
                            this.mSlideableView = childAt3;
                            z11 = true;
                        }
                    } else {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), 1073741824), iMakeMeasureSpec2);
                    }
                }
            }
        }
        setMeasuredDimension(size, iMin + getPaddingTop() + getPaddingBottom());
        this.mCanSlide = z11;
        if (this.mDragHelper.getViewDragState() == 0 || z11) {
            return;
        }
        this.mDragHelper.abort();
    }

    public void onPanelDragged(int i11) {
        if (this.mSlideableView == null) {
            this.mSlideOffset = 0.0f;
            return;
        }
        boolean zIsLayoutRtlSupport = isLayoutRtlSupport();
        LayoutParams layoutParams = (LayoutParams) this.mSlideableView.getLayoutParams();
        int width = this.mSlideableView.getWidth();
        if (zIsLayoutRtlSupport) {
            i11 = (getWidth() - i11) - width;
        }
        float paddingRight = (i11 - ((zIsLayoutRtlSupport ? getPaddingRight() : getPaddingLeft()) + (zIsLayoutRtlSupport ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin))) / this.mSlideRange;
        this.mSlideOffset = paddingRight;
        if (this.mParallaxBy != 0) {
            parallaxOtherViews(paddingRight);
        }
        dispatchOnPanelSlide(this.mSlideableView);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.isOpen) {
            openPane();
        } else {
            closePane();
        }
        this.mPreservedOpenState = savedState.isOpen;
        setLockMode(savedState.mLockMode);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mCanSlide) {
            return super.onTouchEvent(motionEvent);
        }
        this.mDragHelper.processTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            this.mInitialMotionX = x11;
            this.mInitialMotionY = y11;
            return true;
        }
        if (actionMasked == 1 && isDimmed(this.mSlideableView)) {
            float x12 = motionEvent.getX();
            float y12 = motionEvent.getY();
            float f11 = x12 - this.mInitialMotionX;
            float f12 = y12 - this.mInitialMotionY;
            int touchSlop = this.mDragHelper.getTouchSlop();
            if ((f11 * f11) + (f12 * f12) < touchSlop * touchSlop && this.mDragHelper.isViewUnder(this.mSlideableView, (int) x12, (int) y12)) {
                closePane(0);
            }
        }
        return true;
    }

    public void removePanelSlideListener(@NonNull PanelSlideListener panelSlideListener) {
        this.mPanelSlideListeners.remove(panelSlideListener);
    }

    @Deprecated
    public void setCoveredFadeColor(@ColorInt int i11) {
        this.mCoveredFadeColor = i11;
    }

    public final void setLockMode(int i11) {
        this.mLockMode = i11;
    }

    @Deprecated
    public void setPanelSlideListener(@Nullable PanelSlideListener panelSlideListener) {
        PanelSlideListener panelSlideListener2 = this.mPanelSlideListener;
        if (panelSlideListener2 != null) {
            removePanelSlideListener(panelSlideListener2);
        }
        if (panelSlideListener != null) {
            addPanelSlideListener(panelSlideListener);
        }
        this.mPanelSlideListener = panelSlideListener;
    }

    public void setParallaxDistance(@Px int i11) {
        this.mParallaxBy = i11;
        requestLayout();
    }

    public void setShadowDrawableLeft(@Nullable Drawable drawable) {
        this.mShadowDrawableLeft = drawable;
    }

    public void setShadowDrawableRight(@Nullable Drawable drawable) {
        this.mShadowDrawableRight = drawable;
    }

    @Deprecated
    public void setSliderFadeColor(@ColorInt int i11) {
        this.mSliderFadeColor = i11;
    }

    public boolean smoothSlideTo(float f11, int i11) {
        int paddingLeft;
        if (!this.mCanSlide) {
            return false;
        }
        boolean zIsLayoutRtlSupport = isLayoutRtlSupport();
        LayoutParams layoutParams = (LayoutParams) this.mSlideableView.getLayoutParams();
        if (zIsLayoutRtlSupport) {
            paddingLeft = (int) (getWidth() - (((getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + (f11 * this.mSlideRange)) + this.mSlideableView.getWidth()));
        } else {
            paddingLeft = (int) (getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + (f11 * this.mSlideRange));
        }
        ViewDragHelper viewDragHelper = this.mDragHelper;
        View view = this.mSlideableView;
        if (!viewDragHelper.smoothSlideViewTo(view, paddingLeft, view.getTop())) {
            return false;
        }
        setAllChildrenVisible();
        ViewCompat.postInvalidateOnAnimation(this);
        return true;
    }

    public void updateObscuredViewsVisibility(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View childAt;
        View view2 = view;
        boolean zIsLayoutRtlSupport = isLayoutRtlSupport();
        int width = zIsLayoutRtlSupport ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zIsLayoutRtlSupport ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !viewIsOpaque(view2)) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view2.getLeft();
            right = view2.getRight();
            top = view2.getTop();
            bottom = view2.getBottom();
        }
        int childCount = getChildCount();
        int i11 = 0;
        while (i11 < childCount && (childAt = getChildAt(i11)) != view2) {
            if (childAt.getVisibility() != 8) {
                childAt.setVisibility((Math.max(zIsLayoutRtlSupport ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zIsLayoutRtlSupport ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i11++;
            view2 = view;
            zIsLayoutRtlSupport = zIsLayoutRtlSupport;
        }
    }

    public SlidingPaneLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mSliderFadeColor = 0;
        this.mSlideOffset = 1.0f;
        this.mPanelSlideListeners = new CopyOnWriteArrayList();
        this.mFirstLayout = true;
        this.mTmpRect = new Rect();
        this.mPostedRunnables = new ArrayList<>();
        this.mOnFoldingFeatureChangeListener = new FoldingFeatureObserver.OnFoldingFeatureChangeListener() { // from class: androidx.slidingpanelayout.widget.SlidingPaneLayout.1
            @Override // androidx.slidingpanelayout.widget.FoldingFeatureObserver.OnFoldingFeatureChangeListener
            public void onFoldingFeatureChange(@NonNull FoldingFeature foldingFeature) {
                SlidingPaneLayout.this.mFoldingFeature = foldingFeature;
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(300L);
                changeBounds.setInterpolator(PathInterpolatorCompat.create(0.2f, 0.0f, 0.0f, 1.0f));
                TransitionManager.beginDelayedTransition(SlidingPaneLayout.this, changeBounds);
                SlidingPaneLayout.this.requestLayout();
            }
        };
        float f11 = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegate());
        ViewCompat.setImportantForAccessibility(this, 1);
        ViewDragHelper viewDragHelperCreate = ViewDragHelper.create(this, 0.5f, new DragHelperCallback());
        this.mDragHelper = viewDragHelperCreate;
        viewDragHelperCreate.setMinVelocity(f11 * 400.0f);
        setFoldingFeatureObserver(new FoldingFeatureObserver(WindowInfoTracker.getOrCreate(context), ContextCompat.getMainExecutor(context)));
    }

    private static int measureChildHeight(@NonNull View view, int i11, int i12) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) layoutParams).width == 0 && layoutParams.weight > 0.0f) {
            return ViewGroup.getChildMeasureSpec(i11, i12, ((ViewGroup.MarginLayoutParams) layoutParams).height);
        }
        return View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824);
    }

    private void parallaxOtherViews(float f11) {
        boolean zIsLayoutRtlSupport = isLayoutRtlSupport();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt != this.mSlideableView) {
                float f12 = 1.0f - this.mParallaxOffset;
                int i12 = this.mParallaxBy;
                this.mParallaxOffset = f11;
                int i13 = ((int) (f12 * i12)) - ((int) ((1.0f - f11) * i12));
                if (zIsLayoutRtlSupport) {
                    i13 = -i13;
                }
                childAt.offsetLeftAndRight(i13);
            }
        }
    }

    private static boolean viewIsOpaque(View view) {
        if (view.isOpaque()) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i11, @Nullable ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            super.addView(new TouchBlocker(view), i11, layoutParams);
        } else {
            super.addView(view, i11, layoutParams);
        }
    }

    @Override // androidx.customview.widget.Openable
    public void close() {
        closePane();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        View childAt;
        int i11;
        int right;
        super.draw(canvas);
        if (isLayoutRtlSupport()) {
            drawable = this.mShadowDrawableRight;
        } else {
            drawable = this.mShadowDrawableLeft;
        }
        if (getChildCount() > 1) {
            childAt = getChildAt(1);
        } else {
            childAt = null;
        }
        if (childAt != null && drawable != null) {
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (isLayoutRtlSupport()) {
                right = childAt.getRight();
                i11 = intrinsicWidth + right;
            } else {
                int left = childAt.getLeft();
                int i12 = left - intrinsicWidth;
                i11 = left;
                right = i12;
            }
            drawable.setBounds(right, top, i11, bottom);
            drawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j11) {
        if (isLayoutRtlSupport() ^ isOpen()) {
            this.mDragHelper.setEdgeTrackingEnabled(1);
            Insets systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                ViewDragHelper viewDragHelper = this.mDragHelper;
                viewDragHelper.setEdgeSize(Math.max(viewDragHelper.getDefaultEdgeSize(), systemGestureInsets.left));
            }
        } else {
            this.mDragHelper.setEdgeTrackingEnabled(2);
            Insets systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                ViewDragHelper viewDragHelper2 = this.mDragHelper;
                viewDragHelper2.setEdgeSize(Math.max(viewDragHelper2.getDefaultEdgeSize(), systemGestureInsets2.right));
            }
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.mCanSlide && !layoutParams.slideable && this.mSlideableView != null) {
            canvas.getClipBounds(this.mTmpRect);
            if (isLayoutRtlSupport()) {
                Rect rect = this.mTmpRect;
                rect.left = Math.max(rect.left, this.mSlideableView.getRight());
            } else {
                Rect rect2 = this.mTmpRect;
                rect2.right = Math.min(rect2.right, this.mSlideableView.getLeft());
            }
            canvas.clipRect(this.mTmpRect);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j11);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    public void invalidateChildRegion(View view) {
        ViewCompat.setLayerPaint(view, ((LayoutParams) view.getLayoutParams()).dimPaint);
    }

    public boolean isLayoutRtlSupport() {
        if (ViewCompat.getLayoutDirection(this) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Activity activityOrNull;
        super.onAttachedToWindow();
        this.mFirstLayout = true;
        if (this.mFoldingFeatureObserver != null && (activityOrNull = getActivityOrNull(getContext())) != null) {
            this.mFoldingFeatureObserver.registerLayoutStateChangeCallback(activityOrNull);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mFirstLayout = true;
        FoldingFeatureObserver foldingFeatureObserver = this.mFoldingFeatureObserver;
        if (foldingFeatureObserver != null) {
            foldingFeatureObserver.unregisterLayoutStateChangeCallback();
        }
        int size = this.mPostedRunnables.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.mPostedRunnables.get(i11).run();
        }
        this.mPostedRunnables.clear();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.mCanSlide && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.mPreservedOpenState = this.mDragHelper.isViewUnder(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.mCanSlide && (!this.mIsUnableToDrag || actionMasked == 0)) {
            if (actionMasked != 3 && actionMasked != 1) {
                if (actionMasked != 0) {
                    if (actionMasked == 2) {
                        float x11 = motionEvent.getX();
                        float y11 = motionEvent.getY();
                        float fAbs = Math.abs(x11 - this.mInitialMotionX);
                        float fAbs2 = Math.abs(y11 - this.mInitialMotionY);
                        if (fAbs > this.mDragHelper.getTouchSlop() && fAbs2 > fAbs) {
                            this.mDragHelper.cancel();
                            this.mIsUnableToDrag = true;
                            return false;
                        }
                    }
                } else {
                    this.mIsUnableToDrag = false;
                    float x12 = motionEvent.getX();
                    float y12 = motionEvent.getY();
                    this.mInitialMotionX = x12;
                    this.mInitialMotionY = y12;
                    if (this.mDragHelper.isViewUnder(this.mSlideableView, (int) x12, (int) y12) && isDimmed(this.mSlideableView)) {
                        z11 = true;
                    }
                    if (!this.mDragHelper.shouldInterceptTouchEvent(motionEvent) || z11) {
                        return true;
                    }
                    return false;
                }
                z11 = false;
                if (!this.mDragHelper.shouldInterceptTouchEvent(motionEvent)) {
                }
                return true;
            }
            this.mDragHelper.cancel();
            return false;
        }
        this.mDragHelper.cancel();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean zIsOpen;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (isSlideable()) {
            zIsOpen = isOpen();
        } else {
            zIsOpen = this.mPreservedOpenState;
        }
        savedState.isOpen = zIsOpen;
        savedState.mLockMode = this.mLockMode;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (i11 != i13) {
            this.mFirstLayout = true;
        }
    }

    @Override // androidx.customview.widget.Openable
    public void open() {
        openPane();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@NonNull View view) {
        if (view.getParent() instanceof TouchBlocker) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        boolean z11;
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.mCanSlide) {
            if (view == this.mSlideableView) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.mPreservedOpenState = z11;
        }
    }

    public void setAllChildrenVisible() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    @Deprecated
    public void setShadowResource(@DrawableRes int i11) {
        setShadowDrawableLeft(getResources().getDrawable(i11));
    }

    public void setShadowResourceLeft(int i11) {
        setShadowDrawableLeft(ContextCompat.getDrawable(getContext(), i11));
    }

    public void setShadowResourceRight(int i11) {
        setShadowDrawableRight(ContextCompat.getDrawable(getContext(), i11));
    }

    @Deprecated
    public void smoothSlideClosed() {
        closePane();
    }

    @Deprecated
    public void smoothSlideOpen() {
        openPane();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public boolean closePane() {
        return closePane(0);
    }

    public boolean openPane() {
        return openPane(0);
    }

    public static class SimplePanelSlideListener implements PanelSlideListener {
        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelClosed(@NonNull View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelOpened(@NonNull View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelSlide(@NonNull View view, float f11) {
        }
    }
}
