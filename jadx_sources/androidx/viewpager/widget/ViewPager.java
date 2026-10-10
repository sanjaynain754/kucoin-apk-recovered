package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.CallSuper;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private int mActivePointerId;
    PagerAdapter mAdapter;
    private List<OnAdapterChangeListener> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private OnPageChangeListener mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<ItemInfo> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private PagerObserver mObserver;
    private int mOffscreenPageLimit;
    private OnPageChangeListener mOnPageChangeListener;
    private List<OnPageChangeListener> mOnPageChangeListeners;
    private int mPageMargin;
    private PageTransformer mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffect mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final ItemInfo mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    static final int[] LAYOUT_ATTRS = {R.attr.layout_gravity};
    private static final Comparator<ItemInfo> COMPARATOR = new Comparator<ItemInfo>() { // from class: androidx.viewpager.widget.ViewPager.1
        @Override // java.util.Comparator
        public int compare(ItemInfo itemInfo, ItemInfo itemInfo2) {
            return itemInfo.position - itemInfo2.position;
        }
    };
    private static final Interpolator sInterpolator = new Interpolator() { // from class: androidx.viewpager.widget.ViewPager.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            float f12 = f11 - 1.0f;
            return (f12 * f12 * f12 * f12 * f12) + 1.0f;
        }
    };
    private static final ViewPositionComparator sPositionComparator = new ViewPositionComparator();

    /* JADX INFO: loaded from: classes34.dex */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DecorView {
    }

    public static class ItemInfo {
        Object object;
        float offset;
        int position;
        boolean scrolling;
        float widthFactor;
    }

    public class MyAccessibilityDelegate extends AccessibilityDelegateCompat {
        public MyAccessibilityDelegate() {
        }

        private boolean canScroll() {
            PagerAdapter pagerAdapter = ViewPager.this.mAdapter;
            return pagerAdapter != null && pagerAdapter.getCount() > 1;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            PagerAdapter pagerAdapter;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(canScroll());
            if (accessibilityEvent.getEventType() == 4096 && (pagerAdapter = ViewPager.this.mAdapter) != null) {
                accessibilityEvent.setItemCount(pagerAdapter.getCount());
                accessibilityEvent.setFromIndex(ViewPager.this.mCurItem);
                accessibilityEvent.setToIndex(ViewPager.this.mCurItem);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
            accessibilityNodeInfoCompat.setScrollable(canScroll());
            if (ViewPager.this.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.addAction(8192);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
            if (super.performAccessibilityAction(view, i11, bundle)) {
                return true;
            }
            if (i11 != 4096) {
                if (i11 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.mCurItem - 1);
                return true;
            }
            if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.mCurItem + 1);
            return true;
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public interface OnAdapterChangeListener {
        void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2);
    }

    public interface OnPageChangeListener {
        void onPageScrollStateChanged(int i11);

        void onPageScrolled(int i11, float f11, @Px int i12);

        void onPageSelected(int i11);
    }

    /* JADX INFO: loaded from: classes34.dex */
    public interface PageTransformer {
        void transformPage(@NonNull View view, float f11);
    }

    public class PagerObserver extends DataSetObserver {
        public PagerObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.dataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.dataSetChanged();
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.viewpager.widget.ViewPager.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };
        Parcelable adapterState;
        ClassLoader loader;
        int position;

        public SavedState(@NonNull Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.position = parcel.readInt();
            this.adapterState = parcel.readParcelable(classLoader);
            this.loader = classLoader;
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.position + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.position);
            parcel.writeParcelable(this.adapterState, i11);
        }
    }

    public static class ViewPositionComparator implements Comparator<View> {
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z11 = layoutParams.isDecor;
            if (z11 != layoutParams2.isDecor) {
                return z11 ? 1 : -1;
            }
            return layoutParams.position - layoutParams2.position;
        }
    }

    public ViewPager(@NonNull Context context) {
        super(context);
        this.mItems = new ArrayList<>();
        this.mTempItem = new ItemInfo();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new Runnable() { // from class: androidx.viewpager.widget.ViewPager.3
            @Override // java.lang.Runnable
            public void run() {
                ViewPager.this.setScrollState(0);
                ViewPager.this.populate();
            }
        };
        this.mScrollState = 0;
        initViewPager();
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private void removeNonDecorViews() {
        int i11 = 0;
        while (i11 < getChildCount()) {
            if (!((LayoutParams) getChildAt(i11).getLayoutParams()).isDecor) {
                removeViewAt(i11);
                i11--;
            }
            i11++;
        }
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        return this.mLeftEdge.isFinished() || this.mRightEdge.isFinished();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        ItemInfo itemInfoInfoForChild;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (itemInfoInfoForChild = infoForChild(childAt)) != null && itemInfoInfoForChild.position == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            completeScroll(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!pageScrolled(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public ItemInfo infoForChild(View view) {
        for (int i11 = 0; i11 < this.mItems.size(); i11++) {
            ItemInfo itemInfo = this.mItems.get(i11);
            if (this.mAdapter.isViewFromObject(view, itemInfo.object)) {
                return itemInfo;
            }
        }
        return null;
    }

    public ItemInfo infoForPosition(int i11) {
        for (int i12 = 0; i12 < this.mItems.size(); i12++) {
            ItemInfo itemInfo = this.mItems.get(i12);
            if (itemInfo.position == i11) {
                return itemInfo;
            }
        }
        return null;
    }

    public void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f11 = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f11);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f11);
        this.mCloseEnough = (int) (2.0f * f11);
        this.mDefaultGutterSize = (int) (f11 * 16.0f);
        ViewCompat.setAccessibilityDelegate(this, new MyAccessibilityDelegate());
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: androidx.viewpager.widget.ViewPager.4
            private final Rect mTempRect = new Rect();

            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat windowInsetsCompatOnApplyWindowInsets = ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
                if (windowInsetsCompatOnApplyWindowInsets.isConsumed()) {
                    return windowInsetsCompatOnApplyWindowInsets;
                }
                Rect rect = this.mTempRect;
                rect.left = windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetLeft();
                rect.top = windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetTop();
                rect.right = windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetRight();
                rect.bottom = windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetBottom();
                int childCount = ViewPager.this.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    WindowInsetsCompat windowInsetsCompatDispatchApplyWindowInsets = ViewCompat.dispatchApplyWindowInsets(ViewPager.this.getChildAt(i11), windowInsetsCompatOnApplyWindowInsets);
                    rect.left = Math.min(windowInsetsCompatDispatchApplyWindowInsets.getSystemWindowInsetLeft(), rect.left);
                    rect.top = Math.min(windowInsetsCompatDispatchApplyWindowInsets.getSystemWindowInsetTop(), rect.top);
                    rect.right = Math.min(windowInsetsCompatDispatchApplyWindowInsets.getSystemWindowInsetRight(), rect.right);
                    rect.bottom = Math.min(windowInsetsCompatDispatchApplyWindowInsets.getSystemWindowInsetBottom(), rect.bottom);
                }
                return windowInsetsCompatOnApplyWindowInsets.replaceSystemWindowInsets(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i13;
        setMeasuredDimension(View.getDefaultSize(0, i11), View.getDefaultSize(0, i12));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i14 = 0;
        while (true) {
            boolean z11 = true;
            int i15 = 1073741824;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.isDecor) {
                int i16 = layoutParams2.gravity;
                int i17 = i16 & 7;
                int i18 = i16 & 112;
                boolean z12 = i18 == 48 || i18 == 80;
                if (i17 != 3 && i17 != 5) {
                    z11 = false;
                }
                int i19 = Integer.MIN_VALUE;
                if (z12) {
                    i13 = Integer.MIN_VALUE;
                    i19 = 1073741824;
                } else {
                    i13 = z11 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i21 = ((ViewGroup.LayoutParams) layoutParams2).width;
                if (i21 != -2) {
                    if (i21 == -1) {
                        i21 = paddingLeft;
                    }
                    i19 = 1073741824;
                } else {
                    i21 = paddingLeft;
                }
                int i22 = ((ViewGroup.LayoutParams) layoutParams2).height;
                if (i22 == -2) {
                    i22 = measuredHeight;
                    i15 = i13;
                } else if (i22 == -1) {
                    i22 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i21, i19), View.MeasureSpec.makeMeasureSpec(i22, i15));
                if (z12) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z11) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i14++;
        }
        this.mChildWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.mChildHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount2 = getChildCount();
        for (int i23 = 0; i23 < childCount2; i23++) {
            View childAt2 = getChildAt(i23);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.isDecor)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.widthFactor), 1073741824), this.mChildHeightMeasureSpec);
            }
        }
    }

    public void populate() {
        populate(this.mCurItem);
    }

    public void setCurrentItem(int i11) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i11, !this.mFirstLayout, false);
    }

    public void setCurrentItemInternal(int i11, boolean z11, boolean z12) {
        setCurrentItemInternal(i11, z11, z12, 0);
    }

    public void setOffscreenPageLimit(int i11) {
        if (i11 < 1) {
            Log.w(TAG, "Requested offscreen page limit " + i11 + " too small; defaulting to 1");
            i11 = 1;
        }
        if (i11 != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i11;
            populate();
        }
    }

    public void setPageMarginDrawable(@Nullable Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z11, @Nullable PageTransformer pageTransformer) {
        setPageTransformer(z11, pageTransformer, 2);
    }

    public void smoothScrollTo(int i11, int i12) {
        smoothScrollTo(i11, i12, 0);
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static class LayoutParams extends ViewGroup.LayoutParams {
        int childIndex;
        public int gravity;
        public boolean isDecor;
        boolean needsMeasure;
        int position;
        float widthFactor;

        public LayoutParams() {
            super(-1, -1);
            this.widthFactor = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.widthFactor = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
            this.gravity = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void calculatePageOffsets(ItemInfo itemInfo, int i11, ItemInfo itemInfo2) {
        int i12;
        int i13;
        ItemInfo itemInfo3;
        ItemInfo itemInfo4;
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        float f11 = clientWidth > 0 ? this.mPageMargin / clientWidth : 0.0f;
        if (itemInfo2 != null) {
            int i14 = itemInfo2.position;
            int i15 = itemInfo.position;
            if (i14 < i15) {
                float pageWidth = itemInfo2.offset + itemInfo2.widthFactor + f11;
                int i16 = i14 + 1;
                int i17 = 0;
                while (i16 <= itemInfo.position && i17 < this.mItems.size()) {
                    ItemInfo itemInfo5 = this.mItems.get(i17);
                    while (true) {
                        itemInfo4 = itemInfo5;
                        if (i16 <= itemInfo4.position || i17 >= this.mItems.size() - 1) {
                            break;
                        }
                        i17++;
                        itemInfo5 = this.mItems.get(i17);
                    }
                    while (i16 < itemInfo4.position) {
                        pageWidth += this.mAdapter.getPageWidth(i16) + f11;
                        i16++;
                    }
                    itemInfo4.offset = pageWidth;
                    pageWidth += itemInfo4.widthFactor + f11;
                    i16++;
                }
            } else if (i14 > i15) {
                int size = this.mItems.size() - 1;
                float pageWidth2 = itemInfo2.offset;
                while (true) {
                    i14--;
                    if (i14 < itemInfo.position || size < 0) {
                        break;
                    }
                    ItemInfo itemInfo6 = this.mItems.get(size);
                    while (true) {
                        itemInfo3 = itemInfo6;
                        if (i14 >= itemInfo3.position || size <= 0) {
                            break;
                        }
                        size--;
                        itemInfo6 = this.mItems.get(size);
                    }
                    while (i14 > itemInfo3.position) {
                        pageWidth2 -= this.mAdapter.getPageWidth(i14) + f11;
                        i14--;
                    }
                    pageWidth2 -= itemInfo3.widthFactor + f11;
                    itemInfo3.offset = pageWidth2;
                }
            }
        }
        int size2 = this.mItems.size();
        float pageWidth3 = itemInfo.offset;
        int i18 = itemInfo.position;
        int i19 = i18 - 1;
        this.mFirstOffset = i18 == 0 ? pageWidth3 : -3.4028235E38f;
        int i21 = count - 1;
        this.mLastOffset = i18 == i21 ? (itemInfo.widthFactor + pageWidth3) - 1.0f : Float.MAX_VALUE;
        int i22 = i11 - 1;
        while (i22 >= 0) {
            ItemInfo itemInfo7 = this.mItems.get(i22);
            while (true) {
                i13 = itemInfo7.position;
                if (i19 <= i13) {
                    break;
                }
                pageWidth3 -= this.mAdapter.getPageWidth(i19) + f11;
                i19--;
            }
            pageWidth3 -= itemInfo7.widthFactor + f11;
            itemInfo7.offset = pageWidth3;
            if (i13 == 0) {
                this.mFirstOffset = pageWidth3;
            }
            i22--;
            i19--;
        }
        float pageWidth4 = itemInfo.offset + itemInfo.widthFactor + f11;
        int i23 = itemInfo.position + 1;
        int i24 = i11 + 1;
        while (i24 < size2) {
            ItemInfo itemInfo8 = this.mItems.get(i24);
            while (true) {
                i12 = itemInfo8.position;
                if (i23 >= i12) {
                    break;
                }
                pageWidth4 += this.mAdapter.getPageWidth(i23) + f11;
                i23++;
            }
            if (i12 == i21) {
                this.mLastOffset = (itemInfo8.widthFactor + pageWidth4) - 1.0f;
            }
            itemInfo8.offset = pageWidth4;
            pageWidth4 += itemInfo8.widthFactor + f11;
            i24++;
            i23++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    private void completeScroll(boolean z11) {
        boolean z12 = this.mScrollState == 2;
        if (z12) {
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        pageScrolled(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        for (int i11 = 0; i11 < this.mItems.size(); i11++) {
            ItemInfo itemInfo = this.mItems.get(i11);
            if (itemInfo.scrolling) {
                itemInfo.scrolling = false;
                z12 = true;
            }
        }
        if (z12) {
            if (z11) {
                ViewCompat.postOnAnimation(this, this.mEndScrollRunnable);
            } else {
                this.mEndScrollRunnable.run();
            }
        }
    }

    private void dispatchOnPageScrolled(int i11, float f11, int i12) {
        OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i11, f11, i12);
        }
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                OnPageChangeListener onPageChangeListener2 = this.mOnPageChangeListeners.get(i13);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrolled(i11, f11, i12);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.mInternalPageChangeListener;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageScrolled(i11, f11, i12);
        }
    }

    private void dispatchOnPageSelected(int i11) {
        OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i11);
        }
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                OnPageChangeListener onPageChangeListener2 = this.mOnPageChangeListeners.get(i12);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageSelected(i11);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.mInternalPageChangeListener;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageSelected(i11);
        }
    }

    private void dispatchOnScrollStateChanged(int i11) {
        OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i11);
        }
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                OnPageChangeListener onPageChangeListener2 = this.mOnPageChangeListeners.get(i12);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrollStateChanged(i11);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.mInternalPageChangeListener;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageScrollStateChanged(i11);
        }
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private boolean isGutterDrag(float f11, float f12) {
        if (f11 >= this.mGutterSize || f12 <= 0.0f) {
            return f11 > ((float) (getWidth() - this.mGutterSize)) && f12 < 0.0f;
        }
        return true;
    }

    private boolean pageScrolled(int i11) {
        if (this.mItems.size() == 0) {
            if (this.mFirstLayout) {
                return false;
            }
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        ItemInfo itemInfoInfoForCurrentScrollPosition = infoForCurrentScrollPosition();
        int clientWidth = getClientWidth();
        int i12 = this.mPageMargin;
        int i13 = clientWidth + i12;
        float f11 = clientWidth;
        int i14 = itemInfoInfoForCurrentScrollPosition.position;
        float f12 = ((i11 / f11) - itemInfoInfoForCurrentScrollPosition.offset) / (itemInfoInfoForCurrentScrollPosition.widthFactor + (i12 / f11));
        this.mCalledSuper = false;
        onPageScrolled(i14, f12, (int) (i13 * f12));
        if (this.mCalledSuper) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean performDrag(float f11) {
        boolean z11;
        boolean z12;
        float f12 = this.mLastMotionX - f11;
        this.mLastMotionX = f11;
        float scrollX = getScrollX() + f12;
        float clientWidth = getClientWidth();
        float f13 = this.mFirstOffset * clientWidth;
        float f14 = this.mLastOffset * clientWidth;
        boolean z13 = false;
        ItemInfo itemInfo = this.mItems.get(0);
        ArrayList<ItemInfo> arrayList = this.mItems;
        ItemInfo itemInfo2 = arrayList.get(arrayList.size() - 1);
        if (itemInfo.position != 0) {
            f13 = itemInfo.offset * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (itemInfo2.position != this.mAdapter.getCount() - 1) {
            f14 = itemInfo2.offset * clientWidth;
            z12 = false;
        } else {
            z12 = true;
        }
        if (scrollX < f13) {
            if (z11) {
                this.mLeftEdge.onPull(Math.abs(f13 - scrollX) / clientWidth);
                z13 = true;
            }
            scrollX = f13;
        } else if (scrollX > f14) {
            if (z12) {
                this.mRightEdge.onPull(Math.abs(scrollX - f14) / clientWidth);
                z13 = true;
            }
            scrollX = f14;
        }
        int i11 = (int) scrollX;
        this.mLastMotionX += scrollX - i11;
        scrollTo(i11, getScrollY());
        pageScrolled(i11);
        return z13;
    }

    private void recomputeScrollPosition(int i11, int i12, int i13, int i14) {
        if (i12 > 0 && !this.mItems.isEmpty()) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i12 - getPaddingLeft()) - getPaddingRight()) + i14)) * (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)), getScrollY());
                return;
            }
        }
        ItemInfo itemInfoInfoForPosition = infoForPosition(this.mCurItem);
        int iMin = (int) ((itemInfoInfoForPosition != null ? Math.min(itemInfoInfoForPosition.offset, this.mLastOffset) : 0.0f) * ((i11 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            completeScroll(false);
            scrollTo(iMin, getScrollY());
        }
    }

    private void setScrollingCacheEnabled(boolean z11) {
        if (this.mScrollingCacheEnabled != z11) {
            this.mScrollingCacheEnabled = z11;
        }
    }

    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                this.mDrawingOrderedChildren.add(getChildAt(i11));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    public ItemInfo addNewItem(int i11, int i12) {
        ItemInfo itemInfo = new ItemInfo();
        itemInfo.position = i11;
        itemInfo.object = this.mAdapter.instantiateItem((ViewGroup) this, i11);
        itemInfo.widthFactor = this.mAdapter.getPageWidth(i11);
        if (i12 < 0 || i12 >= this.mItems.size()) {
            this.mItems.add(itemInfo);
            return itemInfo;
        }
        this.mItems.add(i12, itemInfo);
        return itemInfo;
    }

    public void addOnAdapterChangeListener(@NonNull OnAdapterChangeListener onAdapterChangeListener) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(onAdapterChangeListener);
    }

    public void addOnPageChangeListener(@NonNull OnPageChangeListener onPageChangeListener) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(onPageChangeListener);
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        this.mFakeDragBeginTime = jUptimeMillis;
        return true;
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
        return z11 && view.canScrollHorizontally(-i11);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i11) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i11 < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.mFirstOffset));
        }
        return i11 > 0 && scrollX < ((int) (((float) clientWidth) * this.mLastOffset));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void clearOnPageChangeListeners() {
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void dataSetChanged() {
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        boolean z11 = this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < count;
        int iMax = this.mCurItem;
        int i11 = 0;
        boolean z12 = false;
        while (i11 < this.mItems.size()) {
            ItemInfo itemInfo = this.mItems.get(i11);
            int itemPosition = this.mAdapter.getItemPosition(itemInfo.object);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i11);
                    i11--;
                    if (!z12) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z12 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, itemInfo.position, itemInfo.object);
                    int i12 = this.mCurItem;
                    if (i12 == itemInfo.position) {
                        iMax = Math.max(0, Math.min(i12, count - 1));
                    }
                } else {
                    int i13 = itemInfo.position;
                    if (i13 != itemPosition) {
                        if (i13 == this.mCurItem) {
                            iMax = itemPosition;
                        }
                        itemInfo.position = itemPosition;
                    }
                }
                z11 = true;
            }
            i11++;
        }
        if (z12) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z11) {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i14).getLayoutParams();
                if (!layoutParams.isDecor) {
                    layoutParams.widthFactor = 0.0f;
                }
            }
            setCurrentItemInternal(iMax, false, true);
            requestLayout();
        }
    }

    public float distanceInfluenceForSnapDuration(float f11) {
        return (float) Math.sin((f11 - 0.5f) * 0.47123894f);
    }

    public void endFakeDrag() {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.mAdapter != null) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            ItemInfo itemInfoInfoForCurrentScrollPosition = infoForCurrentScrollPosition();
            setCurrentItemInternal(determineTargetPage(itemInfoInfoForCurrentScrollPosition.position, ((scrollX / clientWidth) - itemInfoInfoForCurrentScrollPosition.offset) / itemInfoInfoForCurrentScrollPosition.widthFactor, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
        }
        endDrag();
        this.mFakeDragging = false;
    }

    public void fakeDragBy(float f11) {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.mAdapter == null) {
            return;
        }
        this.mLastMotionX += f11;
        float scrollX = getScrollX() - f11;
        float clientWidth = getClientWidth();
        float f12 = this.mFirstOffset * clientWidth;
        float f13 = this.mLastOffset * clientWidth;
        ItemInfo itemInfo = this.mItems.get(0);
        ArrayList<ItemInfo> arrayList = this.mItems;
        ItemInfo itemInfo2 = arrayList.get(arrayList.size() - 1);
        if (itemInfo.position != 0) {
            f12 = itemInfo.offset * clientWidth;
        }
        if (itemInfo2.position != this.mAdapter.getCount() - 1) {
            f13 = itemInfo2.offset * clientWidth;
        }
        if (scrollX < f12) {
            scrollX = f12;
        } else if (scrollX > f13) {
            scrollX = f13;
        }
        int i11 = (int) scrollX;
        this.mLastMotionX += scrollX - i11;
        scrollTo(i11, getScrollY());
        pageScrolled(i11);
        MotionEvent motionEventObtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Nullable
    public PagerAdapter getAdapter() {
        return this.mAdapter;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i11, int i12) {
        if (this.mDrawingOrder == 2) {
            i12 = (i11 - 1) - i12;
        }
        return ((LayoutParams) this.mDrawingOrderedChildren.get(i12).getLayoutParams()).childIndex;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i11;
        float f11;
        super.onDraw(canvas);
        if (this.mPageMargin <= 0 || this.mMarginDrawable == null || this.mItems.size() <= 0 || this.mAdapter == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f12 = width;
        float f13 = this.mPageMargin / f12;
        int i12 = 0;
        ItemInfo itemInfo = this.mItems.get(0);
        float f14 = itemInfo.offset;
        int size = this.mItems.size();
        int i13 = itemInfo.position;
        int i14 = this.mItems.get(size - 1).position;
        while (i13 < i14) {
            while (true) {
                i11 = itemInfo.position;
                if (i13 <= i11 || i12 >= size) {
                    break;
                }
                i12++;
                itemInfo = this.mItems.get(i12);
            }
            if (i13 == i11) {
                float f15 = itemInfo.offset;
                float f16 = itemInfo.widthFactor;
                f11 = (f15 + f16) * f12;
                f14 = f15 + f16 + f13;
            } else {
                float pageWidth = this.mAdapter.getPageWidth(i13);
                f11 = (f14 + pageWidth) * f12;
                f14 += pageWidth + f13;
            }
            if (this.mPageMargin + f11 > scrollX) {
                this.mMarginDrawable.setBounds(Math.round(f11), this.mTopPageBounds, Math.round(this.mPageMargin + f11), this.mBottomPageBounds);
                this.mMarginDrawable.draw(canvas);
            }
            if (f11 > scrollX + width) {
                return;
            }
            i13++;
            scrollX = scrollX;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        boolean z12;
        ItemInfo itemInfoInfoForChild;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i15 = i13 - i11;
        int i16 = i14 - i12;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isDecor) {
                    int i19 = layoutParams.gravity;
                    int i21 = i19 & 7;
                    int i22 = i19 & 112;
                    if (i21 != 1) {
                        if (i21 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i21 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i15 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i22 != 16) {
                            if (i22 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i22 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i16 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i23 = paddingLeft + scrollX;
                            childAt.layout(i23, paddingTop, childAt.getMeasuredWidth() + i23, paddingTop + childAt.getMeasuredHeight());
                            i17++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i16 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i24 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i24;
                        int i25 = paddingLeft + scrollX;
                        childAt.layout(i25, paddingTop, childAt.getMeasuredWidth() + i25, paddingTop + childAt.getMeasuredHeight());
                        i17++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i15 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i26 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i26;
                    if (i22 != 16) {
                        if (i22 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i22 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i16 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i27 = paddingLeft + scrollX;
                        childAt.layout(i27, paddingTop, childAt.getMeasuredWidth() + i27, paddingTop + childAt.getMeasuredHeight());
                        i17++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i16 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i28 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i28;
                    int i29 = paddingLeft + scrollX;
                    childAt.layout(i29, paddingTop, childAt.getMeasuredWidth() + i29, paddingTop + childAt.getMeasuredHeight());
                    i17++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i31 = (i15 - paddingLeft) - paddingRight;
        for (int i32 = 0; i32 < childCount; i32++) {
            View childAt2 = getChildAt(i32);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.isDecor && (itemInfoInfoForChild = infoForChild(childAt2)) != null) {
                    float f11 = i31;
                    int i33 = ((int) (itemInfoInfoForChild.offset * f11)) + paddingLeft;
                    if (layoutParams2.needsMeasure) {
                        layoutParams2.needsMeasure = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f11 * layoutParams2.widthFactor), 1073741824), View.MeasureSpec.makeMeasureSpec((i16 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i33, paddingTop, childAt2.getMeasuredWidth() + i33, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.mTopPageBounds = paddingTop;
        this.mBottomPageBounds = i16 - paddingBottom;
        this.mDecorChildCount = i17;
        if (this.mFirstLayout) {
            z12 = false;
            scrollToItem(this.mCurItem, false, 0, false);
        } else {
            z12 = false;
        }
        this.mFirstLayout = z12;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    @CallSuper
    public void onPageScrolled(int i11, float f11, int i12) {
        int iMax;
        int width;
        int left;
        if (this.mDecorChildCount > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isDecor) {
                    int i14 = layoutParams.gravity & 7;
                    if (i14 != 1) {
                        if (i14 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i14 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i15 = iMax;
                    width = paddingLeft;
                    paddingLeft = i15;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        dispatchOnPageScrolled(i11, f11, i12);
        if (this.mPageTransformer != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt2 = getChildAt(i16);
                if (!((LayoutParams) childAt2.getLayoutParams()).isDecor) {
                    this.mPageTransformer.transformPage(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.mCalledSuper = true;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.adapterState, savedState.loader);
            setCurrentItemInternal(savedState.position, false, true);
        } else {
            this.mRestoredCurItem = savedState.position;
            this.mRestoredAdapterState = savedState.adapterState;
            this.mRestoredClassLoader = savedState.loader;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00dc  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter pagerAdapter;
        if (this.mFakeDragging) {
            return true;
        }
        boolean zResetTouch = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (pagerAdapter = this.mAdapter) == null || pagerAdapter.getCount() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mScroller.abortAnimation();
            this.mPopulatePending = false;
            populate();
            float x11 = motionEvent.getX();
            this.mInitialMotionX = x11;
            this.mLastMotionX = x11;
            float y11 = motionEvent.getY();
            this.mInitialMotionY = y11;
            this.mLastMotionY = y11;
            this.mActivePointerId = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.mLastMotionX = motionEvent.getX(actionIndex);
                        this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        onSecondaryPointerUp(motionEvent);
                        this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                    }
                } else if (this.mIsBeingDragged) {
                    scrollToItem(this.mCurItem, true, 0, false);
                    zResetTouch = resetTouch();
                }
            } else if (!this.mIsBeingDragged) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                if (iFindPointerIndex == -1) {
                    zResetTouch = resetTouch();
                } else {
                    float x12 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x12 - this.mLastMotionX);
                    float y12 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y12 - this.mLastMotionY);
                    if (fAbs > this.mTouchSlop && fAbs > fAbs2) {
                        this.mIsBeingDragged = true;
                        requestParentDisallowInterceptTouchEvent(true);
                        float f11 = this.mInitialMotionX;
                        this.mLastMotionX = x12 - f11 > 0.0f ? f11 + this.mTouchSlop : f11 - this.mTouchSlop;
                        this.mLastMotionY = y12;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.mIsBeingDragged) {
                        zResetTouch = performDrag(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                    }
                }
            } else if (this.mIsBeingDragged) {
                zResetTouch = performDrag(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
            }
        } else if (this.mIsBeingDragged) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            ItemInfo itemInfoInfoForCurrentScrollPosition = infoForCurrentScrollPosition();
            float f12 = clientWidth;
            setCurrentItemInternal(determineTargetPage(itemInfoInfoForCurrentScrollPosition.position, ((scrollX / f12) - itemInfoInfoForCurrentScrollPosition.offset) / (itemInfoInfoForCurrentScrollPosition.widthFactor + (this.mPageMargin / f12)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
            zResetTouch = resetTouch();
        }
        if (zResetTouch) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        return true;
    }

    public boolean pageLeft() {
        int i11 = this.mCurItem;
        if (i11 <= 0) {
            return false;
        }
        setCurrentItem(i11 - 1, true);
        return true;
    }

    public boolean pageRight() {
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter == null || this.mCurItem >= pagerAdapter.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00cc A[PHI: r7 r10 r15
      0x00cc: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:64:0x00f0, B:61:0x00da, B:53:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:64:0x00f0, B:61:0x00da, B:53:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:64:0x00f0, B:61:0x00da, B:53:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    public void populate(int i11) {
        ItemInfo itemInfoInfoForPosition;
        String hexString;
        ItemInfo itemInfoAddNewItem;
        ItemInfo itemInfoInfoForChild;
        ItemInfo itemInfo;
        int i12 = this.mCurItem;
        if (i12 != i11) {
            itemInfoInfoForPosition = infoForPosition(i12);
            this.mCurItem = i11;
        } else {
            itemInfoInfoForPosition = null;
        }
        if (this.mAdapter == null) {
            sortChildDrawingOrder();
            return;
        }
        if (this.mPopulatePending) {
            sortChildDrawingOrder();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.mAdapter.startUpdate((ViewGroup) this);
        int i13 = this.mOffscreenPageLimit;
        int iMax = Math.max(0, this.mCurItem - i13);
        int count = this.mAdapter.getCount();
        int iMin = Math.min(count - 1, this.mCurItem + i13);
        if (count != this.mExpectedAdapterCount) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.mExpectedAdapterCount + ", found: " + count + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.mAdapter.getClass());
        }
        int i14 = 0;
        while (true) {
            if (i14 < this.mItems.size()) {
                itemInfoAddNewItem = this.mItems.get(i14);
                int i15 = itemInfoAddNewItem.position;
                int i16 = this.mCurItem;
                if (i15 >= i16) {
                    if (i15 != i16) {
                        break;
                    } else {
                        break;
                    }
                }
                i14++;
            }
            itemInfoAddNewItem = null;
            break;
        }
        if (itemInfoAddNewItem == null && count > 0) {
            itemInfoAddNewItem = addNewItem(this.mCurItem, i14);
        }
        if (itemInfoAddNewItem != null) {
            int i17 = i14 - 1;
            ItemInfo itemInfo2 = i17 >= 0 ? this.mItems.get(i17) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - itemInfoAddNewItem.widthFactor) + (getPaddingLeft() / clientWidth);
            float f11 = 0.0f;
            for (int i18 = this.mCurItem - 1; i18 >= 0; i18--) {
                if (f11 < paddingLeft || i18 >= iMax) {
                    if (itemInfo2 == null || i18 != itemInfo2.position) {
                        f11 += addNewItem(i18, i17 + 1).widthFactor;
                        i14++;
                        if (i17 >= 0) {
                            itemInfo = this.mItems.get(i17);
                        } else {
                            itemInfo = null;
                        }
                    } else {
                        f11 += itemInfo2.widthFactor;
                        i17--;
                        if (i17 >= 0) {
                            itemInfo = this.mItems.get(i17);
                        } else {
                            itemInfo = null;
                        }
                    }
                    itemInfo2 = itemInfo;
                } else {
                    if (itemInfo2 == null) {
                        break;
                    }
                    if (i18 == itemInfo2.position && !itemInfo2.scrolling) {
                        this.mItems.remove(i17);
                        this.mAdapter.destroyItem((ViewGroup) this, i18, itemInfo2.object);
                        i17--;
                        i14--;
                        if (i17 >= 0) {
                            itemInfo = this.mItems.get(i17);
                        } else {
                            itemInfo = null;
                        }
                        itemInfo2 = itemInfo;
                    }
                }
            }
            float f12 = itemInfoAddNewItem.widthFactor;
            int i19 = i14 + 1;
            if (f12 < 2.0f) {
                ItemInfo itemInfo3 = i19 < this.mItems.size() ? this.mItems.get(i19) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i21 = this.mCurItem;
                while (true) {
                    i21++;
                    if (i21 >= count) {
                        break;
                    }
                    if (f12 >= paddingRight && i21 > iMin) {
                        if (itemInfo3 == null) {
                            break;
                        }
                        if (i21 == itemInfo3.position && !itemInfo3.scrolling) {
                            this.mItems.remove(i19);
                            this.mAdapter.destroyItem((ViewGroup) this, i21, itemInfo3.object);
                            if (i19 < this.mItems.size()) {
                                itemInfo3 = this.mItems.get(i19);
                            }
                        }
                    } else if (itemInfo3 == null || i21 != itemInfo3.position) {
                        ItemInfo itemInfoAddNewItem2 = addNewItem(i21, i19);
                        i19++;
                        f12 += itemInfoAddNewItem2.widthFactor;
                        itemInfo3 = i19 < this.mItems.size() ? this.mItems.get(i19) : null;
                    } else {
                        f12 += itemInfo3.widthFactor;
                        i19++;
                        if (i19 < this.mItems.size()) {
                            itemInfo3 = this.mItems.get(i19);
                        }
                    }
                }
            }
            calculatePageOffsets(itemInfoAddNewItem, i14, itemInfoInfoForPosition);
            this.mAdapter.setPrimaryItem((ViewGroup) this, this.mCurItem, itemInfoAddNewItem.object);
        }
        this.mAdapter.finishUpdate((ViewGroup) this);
        int childCount = getChildCount();
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt = getChildAt(i22);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            layoutParams.childIndex = i22;
            if (!layoutParams.isDecor && layoutParams.widthFactor == 0.0f && (itemInfoInfoForChild = infoForChild(childAt)) != null) {
                layoutParams.widthFactor = itemInfoInfoForChild.widthFactor;
                layoutParams.position = itemInfoInfoForChild.position;
            }
        }
        sortChildDrawingOrder();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            ItemInfo itemInfoInfoForAnyChild = viewFindFocus != null ? infoForAnyChild(viewFindFocus) : null;
            if (itemInfoInfoForAnyChild == null || itemInfoInfoForAnyChild.position != this.mCurItem) {
                for (int i23 = 0; i23 < getChildCount(); i23++) {
                    View childAt2 = getChildAt(i23);
                    ItemInfo itemInfoInfoForChild2 = infoForChild(childAt2);
                    if (itemInfoInfoForChild2 != null && itemInfoInfoForChild2.position == this.mCurItem && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public void removeOnAdapterChangeListener(@NonNull OnAdapterChangeListener onAdapterChangeListener) {
        List<OnAdapterChangeListener> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(onAdapterChangeListener);
        }
    }

    public void removeOnPageChangeListener(@NonNull OnPageChangeListener onPageChangeListener) {
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(onPageChangeListener);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(@Nullable PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.mAdapter;
        if (pagerAdapter2 != null) {
            pagerAdapter2.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i11 = 0; i11 < this.mItems.size(); i11++) {
                ItemInfo itemInfo = this.mItems.get(i11);
                this.mAdapter.destroyItem((ViewGroup) this, itemInfo.position, itemInfo.object);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter3 = this.mAdapter;
        this.mAdapter = pagerAdapter;
        this.mExpectedAdapterCount = 0;
        if (pagerAdapter != null) {
            if (this.mObserver == null) {
                this.mObserver = new PagerObserver();
            }
            this.mAdapter.setViewPagerObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z11 = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (z11) {
                requestLayout();
            } else {
                populate();
            }
        }
        List<OnAdapterChangeListener> list = this.mAdapterChangeListeners;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.mAdapterChangeListeners.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.mAdapterChangeListeners.get(i12).onAdapterChanged(this, pagerAdapter3, pagerAdapter);
        }
    }

    public void setCurrentItemInternal(int i11, boolean z11, boolean z12, int i12) {
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z12 && this.mCurItem == i11 && this.mItems.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i11 < 0) {
            i11 = 0;
        } else if (i11 >= this.mAdapter.getCount()) {
            i11 = this.mAdapter.getCount() - 1;
        }
        int i13 = this.mOffscreenPageLimit;
        int i14 = this.mCurItem;
        if (i11 > i14 + i13 || i11 < i14 - i13) {
            for (int i15 = 0; i15 < this.mItems.size(); i15++) {
                this.mItems.get(i15).scrolling = true;
            }
        }
        boolean z13 = this.mCurItem != i11;
        if (!this.mFirstLayout) {
            populate(i11);
            scrollToItem(i11, z11, i12, z13);
        } else {
            this.mCurItem = i11;
            if (z13) {
                dispatchOnPageSelected(i11);
            }
            requestLayout();
        }
    }

    public OnPageChangeListener setInternalPageChangeListener(OnPageChangeListener onPageChangeListener) {
        OnPageChangeListener onPageChangeListener2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = onPageChangeListener;
        return onPageChangeListener2;
    }

    @Deprecated
    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.mOnPageChangeListener = onPageChangeListener;
    }

    public void setPageMargin(int i11) {
        int i12 = this.mPageMargin;
        this.mPageMargin = i11;
        int width = getWidth();
        recomputeScrollPosition(width, width, i11, i12);
        requestLayout();
    }

    public void setPageTransformer(boolean z11, @Nullable PageTransformer pageTransformer, int i11) {
        boolean z12 = pageTransformer != null;
        boolean z13 = z12 != (this.mPageTransformer != null);
        this.mPageTransformer = pageTransformer;
        setChildrenDrawingOrderEnabled(z12);
        if (z12) {
            this.mDrawingOrder = z11 ? 2 : 1;
            this.mPageTransformerLayerType = i11;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z13) {
            populate();
        }
    }

    public void setScrollState(int i11) {
        if (this.mScrollState == i11) {
            return;
        }
        this.mScrollState = i11;
        if (this.mPageTransformer != null) {
            enableLayers(i11 != 0);
        }
        dispatchOnScrollStateChanged(i11);
    }

    public void smoothScrollTo(int i11, int i12, int i13) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.mIsScrollStarted ? this.mScroller.getCurrX() : this.mScroller.getStartX();
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i14 = scrollX;
        int scrollY = getScrollY();
        int i15 = i11 - i14;
        int i16 = i12 - scrollY;
        if (i15 == 0 && i16 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i17 = clientWidth / 2;
        float f11 = clientWidth;
        float f12 = i17;
        float fDistanceInfluenceForSnapDuration = f12 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i15) * 1.0f) / f11)) * f12);
        int iAbs2 = Math.abs(i13);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fDistanceInfluenceForSnapDuration / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i15) / ((f11 * this.mAdapter.getPageWidth(this.mCurItem)) + this.mPageMargin)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i14, scrollY, i15, i16, iMin);
        ViewCompat.postInvalidateOnAnimation(this);
    }

    private int determineTargetPage(int i11, float f11, int i12, int i13) {
        float f12;
        if (Math.abs(i13) > this.mFlingDistance && Math.abs(i12) > this.mMinimumVelocity) {
            if (i12 <= 0) {
                i11++;
            }
        } else {
            if (i11 >= this.mCurItem) {
                f12 = 0.4f;
            } else {
                f12 = 0.6f;
            }
            i11 += (int) (f11 + f12);
        }
        if (this.mItems.size() > 0) {
            ItemInfo itemInfo = this.mItems.get(0);
            ArrayList<ItemInfo> arrayList = this.mItems;
            return Math.max(itemInfo.position, Math.min(i11, arrayList.get(arrayList.size() - 1).position));
        }
        return i11;
    }

    private void enableLayers(boolean z11) {
        int i11;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            if (z11) {
                i11 = this.mPageTransformerLayerType;
            } else {
                i11 = 0;
            }
            getChildAt(i12).setLayerType(i11, null);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private ItemInfo infoForCurrentScrollPosition() {
        float scrollX;
        float f11;
        int i11;
        int clientWidth = getClientWidth();
        float f12 = 0.0f;
        if (clientWidth > 0) {
            scrollX = getScrollX() / clientWidth;
        } else {
            scrollX = 0.0f;
        }
        if (clientWidth > 0) {
            f11 = this.mPageMargin / clientWidth;
        } else {
            f11 = 0.0f;
        }
        int i12 = 0;
        boolean z11 = true;
        ItemInfo itemInfo = null;
        int i13 = -1;
        float f13 = 0.0f;
        while (i12 < this.mItems.size()) {
            ItemInfo itemInfo2 = this.mItems.get(i12);
            if (!z11 && itemInfo2.position != (i11 = i13 + 1)) {
                itemInfo2 = this.mTempItem;
                itemInfo2.offset = f12 + f13 + f11;
                itemInfo2.position = i11;
                itemInfo2.widthFactor = this.mAdapter.getPageWidth(i11);
                i12--;
            }
            ItemInfo itemInfo3 = itemInfo2;
            f12 = itemInfo3.offset;
            float f14 = itemInfo3.widthFactor + f12 + f11;
            if (!z11 && scrollX < f12) {
                break;
            }
            if (scrollX >= f14 && i12 != this.mItems.size() - 1) {
                int i14 = itemInfo3.position;
                float f15 = itemInfo3.widthFactor;
                i12++;
                i13 = i14;
                f13 = f15;
                itemInfo = itemInfo3;
                z11 = false;
            } else {
                return itemInfo3;
            }
        }
        return itemInfo;
    }

    private static boolean isDecorView(@NonNull View view) {
        if (view.getClass().getAnnotation(DecorView.class) != null) {
            return true;
        }
        return false;
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int i11;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            if (actionIndex == 0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            this.mLastMotionX = motionEvent.getX(i11);
            this.mActivePointerId = motionEvent.getPointerId(i11);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z11) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z11);
        }
    }

    private void scrollToItem(int i11, boolean z11, int i12, boolean z12) {
        int clientWidth;
        ItemInfo itemInfoInfoForPosition = infoForPosition(i11);
        if (itemInfoInfoForPosition != null) {
            clientWidth = (int) (getClientWidth() * Math.max(this.mFirstOffset, Math.min(itemInfoInfoForPosition.offset, this.mLastOffset)));
        } else {
            clientWidth = 0;
        }
        if (z11) {
            smoothScrollTo(clientWidth, 0, i12);
            if (z12) {
                dispatchOnPageSelected(i11);
                return;
            }
            return;
        }
        if (z12) {
            dispatchOnPageSelected(i11);
        }
        completeScroll(false);
        scrollTo(clientWidth, 0);
        pageScrolled(clientWidth);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i11, int i12) {
        ItemInfo itemInfoInfoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt = getChildAt(i13);
                if (childAt.getVisibility() == 0 && (itemInfoInfoForChild = infoForChild(childAt)) != null && itemInfoInfoForChild.position == this.mCurItem) {
                    childAt.addFocusables(arrayList, i11, i12);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i12 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean zIsDecorView = layoutParams2.isDecor | isDecorView(view);
        layoutParams2.isDecor = zIsDecorView;
        if (this.mInLayout) {
            if (!zIsDecorView) {
                layoutParams2.needsMeasure = true;
                addViewInLayout(view, i11, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i11, layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
    public boolean arrowScroll(int i11) {
        boolean zPageLeft;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (parent instanceof ViewGroup) {
                    if (parent == this) {
                        break;
                    }
                    parent = parent.getParent();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(viewFindFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb2.append(" => ");
                        sb2.append(parent2.getClass().getSimpleName());
                    }
                    Log.e(TAG, "arrowScroll tried to find focus based on non-child current focused view " + sb2.toString());
                    viewFindFocus = null;
                    break;
                }
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i11);
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            if (i11 == 17) {
                int i12 = getChildRectInPagerCoordinates(this.mTempRect, viewFindNextFocus).left;
                int i13 = getChildRectInPagerCoordinates(this.mTempRect, viewFindFocus).left;
                if (viewFindFocus != null && i12 >= i13) {
                    zPageLeft = pageLeft();
                } else {
                    zPageLeft = viewFindNextFocus.requestFocus();
                }
            } else if (i11 == 66) {
                int i14 = getChildRectInPagerCoordinates(this.mTempRect, viewFindNextFocus).left;
                int i15 = getChildRectInPagerCoordinates(this.mTempRect, viewFindFocus).left;
                if (viewFindFocus != null && i14 <= i15) {
                    zPageLeft = pageRight();
                } else {
                    zPageLeft = viewFindNextFocus.requestFocus();
                }
            } else {
                zPageLeft = false;
            }
        } else if (i11 != 17 && i11 != 1) {
            if (i11 != 66 && i11 != 2) {
                zPageLeft = false;
            } else {
                zPageLeft = pageRight();
            }
        } else {
            zPageLeft = pageLeft();
        }
        if (zPageLeft) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i11));
        }
        return zPageLeft;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !executeKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ItemInfo itemInfoInfoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (itemInfoInfoForChild = infoForChild(childAt)) != null && itemInfoInfoForChild.position == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (pagerAdapter = this.mAdapter) == null || pagerAdapter.getCount() <= 1)) {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
        } else {
            if (!this.mLeftEdge.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.mFirstOffset * width);
                this.mLeftEdge.setSize(height, width);
                zDraw = this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.mRightEdge.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.mLastOffset + 1.0f)) * width2);
                this.mRightEdge.setSize(height2, width2);
                zDraw |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        }
        if (zDraw) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public boolean executeKeyEvent(@NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return arrowScroll(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return arrowScroll(1);
                        }
                        return false;
                    }
                    return false;
                }
                if (keyEvent.hasModifiers(2)) {
                    return pageRight();
                }
                return arrowScroll(66);
            }
            if (keyEvent.hasModifiers(2)) {
                return pageLeft();
            }
            return arrowScroll(17);
        }
        return false;
    }

    public ItemInfo infoForAnyChild(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent != null && (parent instanceof View)) {
                    view = (View) parent;
                } else {
                    return null;
                }
            } else {
                return infoForChild(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f11;
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.mIsBeingDragged) {
                    return true;
                }
                if (this.mIsUnableToDrag) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        onSecondaryPointerUp(motionEvent);
                    }
                } else {
                    int i11 = this.mActivePointerId;
                    if (i11 != -1) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(i11);
                        float x11 = motionEvent.getX(iFindPointerIndex);
                        float f12 = x11 - this.mLastMotionX;
                        float fAbs = Math.abs(f12);
                        float y11 = motionEvent.getY(iFindPointerIndex);
                        float fAbs2 = Math.abs(y11 - this.mInitialMotionY);
                        if (f12 != 0.0f && !isGutterDrag(this.mLastMotionX, f12) && canScroll(this, false, (int) f12, (int) x11, (int) y11)) {
                            this.mLastMotionX = x11;
                            this.mLastMotionY = y11;
                            this.mIsUnableToDrag = true;
                            return false;
                        }
                        int i12 = this.mTouchSlop;
                        if (fAbs > i12 && fAbs * 0.5f > fAbs2) {
                            this.mIsBeingDragged = true;
                            requestParentDisallowInterceptTouchEvent(true);
                            setScrollState(1);
                            float f13 = this.mInitialMotionX;
                            float f14 = this.mTouchSlop;
                            if (f12 > 0.0f) {
                                f11 = f13 + f14;
                            } else {
                                f11 = f13 - f14;
                            }
                            this.mLastMotionX = f11;
                            this.mLastMotionY = y11;
                            setScrollingCacheEnabled(true);
                        } else if (fAbs2 > i12) {
                            this.mIsUnableToDrag = true;
                        }
                        if (this.mIsBeingDragged && performDrag(x11)) {
                            ViewCompat.postInvalidateOnAnimation(this);
                        }
                    }
                }
            } else {
                float x12 = motionEvent.getX();
                this.mInitialMotionX = x12;
                this.mLastMotionX = x12;
                float y12 = motionEvent.getY();
                this.mInitialMotionY = y12;
                this.mLastMotionY = y12;
                this.mActivePointerId = motionEvent.getPointerId(0);
                this.mIsUnableToDrag = false;
                this.mIsScrollStarted = true;
                this.mScroller.computeScrollOffset();
                if (this.mScrollState == 2 && Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) > this.mCloseEnough) {
                    this.mScroller.abortAnimation();
                    this.mPopulatePending = false;
                    populate();
                    this.mIsBeingDragged = true;
                    requestParentDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                } else {
                    completeScroll(false);
                    this.mIsBeingDragged = false;
                }
            }
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
            return this.mIsBeingDragged;
        }
        resetTouch();
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i11, Rect rect) {
        int i12;
        int i13;
        int i14;
        ItemInfo itemInfoInfoForChild;
        int childCount = getChildCount();
        if ((i11 & 2) != 0) {
            i13 = childCount;
            i12 = 0;
            i14 = 1;
        } else {
            i12 = childCount - 1;
            i13 = -1;
            i14 = -1;
        }
        while (i12 != i13) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 0 && (itemInfoInfoForChild = infoForChild(childAt)) != null && itemInfoInfoForChild.position == this.mCurItem && childAt.requestFocus(i11, rect)) {
                return true;
            }
            i12 += i14;
        }
        return false;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.position = this.mCurItem;
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            savedState.adapterState = pagerAdapter.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (i11 != i13) {
            int i15 = this.mPageMargin;
            recomputeScrollPosition(i11, i13, i15, i15);
        }
    }

    public void setCurrentItem(int i11, boolean z11) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i11, z11, false);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.mMarginDrawable) {
            return false;
        }
        return true;
    }

    public void setPageMarginDrawable(@DrawableRes int i11) {
        setPageMarginDrawable(ContextCompat.getDrawable(getContext(), i11));
    }

    public ViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new ArrayList<>();
        this.mTempItem = new ItemInfo();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new Runnable() { // from class: androidx.viewpager.widget.ViewPager.3
            @Override // java.lang.Runnable
            public void run() {
                ViewPager.this.setScrollState(0);
                ViewPager.this.populate();
            }
        };
        this.mScrollState = 0;
        initViewPager();
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static class SimpleOnPageChangeListener implements OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i11, float f11, int i12) {
        }
    }
}
