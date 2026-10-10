package com.facebook.react.views.view;

import ai.advance.sdk.global.iqa.lib.C0358g;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.Animation;
import androidx.annotation.Nullable;
import com.facebook.react.C5771R;
import com.facebook.react.C6252x;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.touch.OnInterceptTouchEventListener;
import com.facebook.react.touch.ReactHitSlopView;
import com.facebook.react.touch.ReactInterceptingViewGroup;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.BlendModeHelper;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.MeasureSpecAssertions;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactClippingProhibitedView;
import com.facebook.react.uimanager.ReactClippingViewGroup;
import com.facebook.react.uimanager.ReactClippingViewGroupHelper;
import com.facebook.react.uimanager.ReactOverflowViewWithInset;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.uimanager.ReactZIndexedViewGroup;
import com.facebook.react.uimanager.ViewGroupDrawingOrderHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.uimanager.style.Overflow;
import java.util.HashSet;
import java.util.Set;
import p302h6.C38115a;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
public class ReactViewGroup extends ViewGroup implements ReactInterceptingViewGroup, ReactClippingViewGroup, ReactPointerEventsView, ReactHitSlopView, ReactZIndexedViewGroup, ReactOverflowViewWithInset {
    private static final int ARRAY_CAPACITY_INCREMENT = 12;
    private static final ViewGroup.LayoutParams sDefaultLayoutParam = new ViewGroup.LayoutParams(0, 0);

    @Nullable
    private View[] mAllChildren;
    private int mAllChildrenCount;
    private float mBackfaceOpacity;
    private String mBackfaceVisibility;

    @Nullable
    private ChildrenLayoutChangeListener mChildrenLayoutChangeListener;

    @Nullable
    private Set<Integer> mChildrenRemovedWhileTransitioning;

    @Nullable
    private Rect mClippingRect;

    @Nullable
    private ViewGroupDrawingOrderHelper mDrawingOrderHelper;

    @Nullable
    private Rect mHitSlopRect;
    private boolean mNeedsOffscreenAlphaCompositing;

    @Nullable
    private OnInterceptTouchEventListener mOnInterceptTouchEventListener;
    private Overflow mOverflow;
    private final Rect mOverflowInset;
    private PointerEvents mPointerEvents;
    private int mRecycleCount;
    private boolean mRemoveClippedSubviews;

    public static final class ChildrenLayoutChangeListener implements View.OnLayoutChangeListener {

        @Nullable
        private ReactViewGroup mParent;

        public void shutdown() {
            this.mParent = null;
        }

        private ChildrenLayoutChangeListener(ReactViewGroup reactViewGroup) {
            this.mParent = reactViewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            ReactViewGroup reactViewGroup = this.mParent;
            if (reactViewGroup == null || !reactViewGroup.getRemoveClippedSubviews()) {
                return;
            }
            this.mParent.updateSubviewClipStatus(view);
        }
    }

    private void initView() {
        setClipChildren(false);
        this.mRemoveClippedSubviews = false;
        this.mAllChildren = null;
        this.mAllChildrenCount = 0;
        this.mClippingRect = null;
        this.mHitSlopRect = null;
        this.mOverflow = Overflow.VISIBLE;
        this.mPointerEvents = PointerEvents.AUTO;
        this.mChildrenLayoutChangeListener = null;
        this.mOnInterceptTouchEventListener = null;
        this.mNeedsOffscreenAlphaCompositing = false;
        this.mDrawingOrderHelper = null;
        this.mBackfaceOpacity = 1.0f;
        this.mBackfaceVisibility = ViewProps.VISIBLE;
        this.mChildrenRemovedWhileTransitioning = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void updateSubviewClipStatus(Rect rect, int i11, int i12) {
        UiThreadUtil.assertOnUiThread();
        C0358g c0358g = ((View[]) C38115a.m86047c(this.mAllChildren))[i11];
        boolean zIntersects = rect.intersects(c0358g.getLeft(), c0358g.getTop(), c0358g.getRight(), c0358g.getBottom());
        Animation animation = c0358g.getAnimation();
        boolean z11 = (animation == null || animation.hasEnded()) ? false : true;
        if (!zIntersects && !isViewClipped(c0358g) && !z11) {
            removeViewInLayout(c0358g);
        } else if (zIntersects && isViewClipped(c0358g)) {
            addViewInLayout(c0358g, i11 - i12, sDefaultLayoutParam, true);
            invalidate();
        } else if (!zIntersects) {
            return;
        }
        if (c0358g instanceof ReactClippingViewGroup) {
            ReactClippingViewGroup reactClippingViewGroup = (ReactClippingViewGroup) c0358g;
            if (reactClippingViewGroup.getRemoveClippedSubviews()) {
                reactClippingViewGroup.updateClippingRect();
            }
        }
    }

    public void addViewWithSubviewClippingEnabled(View view, int i11) {
        addViewWithSubviewClippingEnabled(view, i11, sDefaultLayoutParam);
    }

    @Deprecated(forRemoval = true, since = "0.75.0")
    public void setBorderRadius(float f11) {
        setBorderRadius(f11, BorderRadiusProp.BORDER_RADIUS.ordinal());
    }

    /* JADX INFO: renamed from: com.facebook.react.views.view.ReactViewGroup$2 */
    public static /* synthetic */ class C62432 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$uimanager$style$Overflow;

        static {
            int[] iArr = new int[Overflow.values().length];
            $SwitchMap$com$facebook$react$uimanager$style$Overflow = iArr;
            try {
                iArr[Overflow.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$style$Overflow[Overflow.SCROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$style$Overflow[Overflow.VISIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void addInArray(View view, int i11) {
        View[] viewArr = (View[]) C38115a.m86047c(this.mAllChildren);
        int i12 = this.mAllChildrenCount;
        int length = viewArr.length;
        if (i11 == i12) {
            if (length == i12) {
                View[] viewArr2 = new View[length + 12];
                this.mAllChildren = viewArr2;
                System.arraycopy(viewArr, 0, viewArr2, 0, length);
                viewArr = this.mAllChildren;
            }
            int i13 = this.mAllChildrenCount;
            this.mAllChildrenCount = i13 + 1;
            viewArr[i13] = view;
            return;
        }
        if (i11 >= i12) {
            throw new IndexOutOfBoundsException("index=" + i11 + " count=" + i12);
        }
        if (length == i12) {
            View[] viewArr3 = new View[length + 12];
            this.mAllChildren = viewArr3;
            System.arraycopy(viewArr, 0, viewArr3, 0, i11);
            System.arraycopy(viewArr, i11, this.mAllChildren, i11 + 1, i12 - i11);
            viewArr = this.mAllChildren;
        } else {
            System.arraycopy(viewArr, i11, viewArr, i11 + 1, i12 - i11);
        }
        viewArr[i11] = view;
        this.mAllChildrenCount++;
    }

    private ViewGroupDrawingOrderHelper getDrawingOrderHelper() {
        if (this.mDrawingOrderHelper == null) {
            this.mDrawingOrderHelper = new ViewGroupDrawingOrderHelper(this);
        }
        return this.mDrawingOrderHelper;
    }

    private int indexOfChildInAllChildren(View view) {
        int i11 = this.mAllChildrenCount;
        View[] viewArr = (View[]) C38115a.m86047c(this.mAllChildren);
        for (int i12 = 0; i12 < i11; i12++) {
            if (viewArr[i12] == view) {
                return i12;
            }
        }
        return -1;
    }

    private boolean isChildRemovedWhileTransitioning(View view) {
        Set<Integer> set = this.mChildrenRemovedWhileTransitioning;
        return set != null && set.contains(Integer.valueOf(view.getId()));
    }

    private void removeFromArray(int i11) {
        View[] viewArr = (View[]) C38115a.m86047c(this.mAllChildren);
        int i12 = this.mAllChildrenCount;
        if (i11 == i12 - 1) {
            int i13 = i12 - 1;
            this.mAllChildrenCount = i13;
            viewArr[i13] = null;
        } else {
            if (i11 < 0 || i11 >= i12) {
                throw new IndexOutOfBoundsException();
            }
            System.arraycopy(viewArr, i11 + 1, viewArr, i11, (i12 - i11) - 1);
            int i14 = this.mAllChildrenCount - 1;
            this.mAllChildrenCount = i14;
            viewArr[i14] = null;
        }
    }

    private void trackChildViewTransition(int i11) {
        if (this.mChildrenRemovedWhileTransitioning == null) {
            this.mChildrenRemovedWhileTransitioning = new HashSet();
        }
        this.mChildrenRemovedWhileTransitioning.add(Integer.valueOf(i11));
    }

    private void updateClippingToRect(Rect rect) {
        C38115a.m86047c(this.mAllChildren);
        int i11 = 0;
        for (int i12 = 0; i12 < this.mAllChildrenCount; i12++) {
            try {
                updateSubviewClipStatus(rect, i12, i11);
                if (isViewClipped(this.mAllChildren[i12])) {
                    i11++;
                }
            } catch (IndexOutOfBoundsException e11) {
                throw new IllegalStateException("Invalid clipping state. i=" + i12 + " clippedSoFar=" + i11 + " count=" + getChildCount() + " allChildrenCount=" + this.mAllChildrenCount + " recycleCount=" + this.mRecycleCount, e11);
            }
        }
    }

    public void addViewWithSubviewClippingEnabled(final View view, int i11, ViewGroup.LayoutParams layoutParams) {
        C38115a.m86045a(this.mRemoveClippedSubviews);
        addInArray(view, i11);
        Rect rect = (Rect) C38115a.m86047c(this.mClippingRect);
        View[] viewArr = (View[]) C38115a.m86047c(this.mAllChildren);
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            if (isViewClipped(viewArr[i13])) {
                i12++;
            }
        }
        updateSubviewClipStatus(rect, i11, i12);
        view.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        if (view instanceof ReactClippingProhibitedView) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.views.view.ReactViewGroup.1
                @Override // java.lang.Runnable
                public void run() {
                    if (view.isShown()) {
                        return;
                    }
                    ReactSoftExceptionLogger.logSoftException(ReactConstants.TAG, new ReactNoCrashSoftException("Child view has been added to Parent view in which it is clipped and not visible. This is not legal for this particular child view. Child: [" + view.getId() + "] " + view.toString() + " Parent: [" + ReactViewGroup.this.getId() + "] " + toString()));
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.mOverflow != Overflow.VISIBLE || getTag(C5771R.id.filter) != null) {
            BackgroundStyleApplicator.clipToPaddingBox(this, canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (PointerEvents.canChildrenBeTouchTarget(this.mPointerEvents)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (Build.VERSION.SDK_INT < 29 || ViewUtil.getUIManagerType(this) != 2 || !BlendModeHelper.needsIsolatedLayer(this)) {
            super.draw(canvas);
            return;
        }
        Rect overflowInset = getOverflowInset();
        canvas.saveLayer(overflowInset.left, overflowInset.top, getWidth() + (-overflowInset.right), getHeight() + (-overflowInset.bottom), null);
        super.draw(canvas);
        canvas.restore();
    }

    public int getAllChildrenCount() {
        return this.mAllChildrenCount;
    }

    @Nullable
    public View getChildAtWithSubviewClippingEnabled(int i11) {
        if (i11 < 0 || i11 >= this.mAllChildrenCount) {
            return null;
        }
        return ((View[]) C38115a.m86047c(this.mAllChildren))[i11];
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public void getClippingRect(Rect rect) {
        rect.set((Rect) C38115a.m86050f(this.mClippingRect, "Fix in Kotlin"));
    }

    @Override // com.facebook.react.touch.ReactHitSlopView
    @Nullable
    public Rect getHitSlopRect() {
        return this.mHitSlopRect;
    }

    @Override // com.facebook.react.uimanager.ReactOverflowView
    @Nullable
    public String getOverflow() {
        int i11 = C62432.$SwitchMap$com$facebook$react$uimanager$style$Overflow[this.mOverflow.ordinal()];
        if (i11 == 1) {
            return ViewProps.HIDDEN;
        }
        if (i11 == 2) {
            return ViewProps.SCROLL;
        }
        if (i11 != 3) {
            return null;
        }
        return ViewProps.VISIBLE;
    }

    @Override // com.facebook.react.uimanager.ReactOverflowViewWithInset
    public Rect getOverflowInset() {
        return this.mOverflowInset;
    }

    @Override // com.facebook.react.uimanager.ReactPointerEventsView
    public PointerEvents getPointerEvents() {
        return this.mPointerEvents;
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public boolean getRemoveClippedSubviews() {
        return this.mRemoveClippedSubviews;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mNeedsOffscreenAlphaCompositing;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return ReactFeatureFlags.dispatchPointerEvents ? PointerEvents.canBeTouchTarget(this.mPointerEvents) : super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        OnInterceptTouchEventListener onInterceptTouchEventListener = this.mOnInterceptTouchEventListener;
        if ((onInterceptTouchEventListener == null || !onInterceptTouchEventListener.onInterceptTouchEvent(this, motionEvent)) && PointerEvents.canChildrenBeTouchTarget(this.mPointerEvents)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return PointerEvents.canBeTouchTarget(this.mPointerEvents);
    }

    public void recycleView() {
        ChildrenLayoutChangeListener childrenLayoutChangeListener;
        this.mRecycleCount++;
        if (this.mAllChildren != null && (childrenLayoutChangeListener = this.mChildrenLayoutChangeListener) != null) {
            childrenLayoutChangeListener.shutdown();
            for (int i11 = 0; i11 < this.mAllChildrenCount; i11++) {
                this.mAllChildren[i11].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
            }
        }
        initView();
        this.mOverflowInset.setEmpty();
        removeAllViews();
        updateBackgroundDrawable(null);
        resetPointerEvents();
    }

    public void removeAllViewsWithSubviewClippingEnabled() {
        C38115a.m86045a(this.mRemoveClippedSubviews);
        View[] viewArr = (View[]) C38115a.m86047c(this.mAllChildren);
        for (int i11 = 0; i11 < this.mAllChildrenCount; i11++) {
            viewArr[i11].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        }
        removeAllViewsInLayout();
        this.mAllChildrenCount = 0;
    }

    public void resetPointerEvents() {
        this.mPointerEvents = PointerEvents.AUTO;
    }

    public void setBackfaceVisibility(String str) {
        this.mBackfaceVisibility = str;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setBackfaceVisibilityDependantOpacity() {
        if (this.mBackfaceVisibility.equals(ViewProps.VISIBLE)) {
            setAlpha(this.mBackfaceOpacity);
            return;
        }
        float rotationX = getRotationX();
        float rotationY = getRotationY();
        if (rotationX < -90.0f || rotationX >= 90.0f || rotationY < -90.0f || rotationY >= 90.0f) {
            setAlpha(0.0f);
        } else {
            setAlpha(this.mBackfaceOpacity);
        }
    }

    @Deprecated(forRemoval = true, since = "0.75.0")
    public void setBorderRadius(float f11, int i11) {
        BackgroundStyleApplicator.setBorderRadius(this, BorderRadiusProp.values()[i11], Float.isNaN(f11) ? null : new LengthPercentage(f11, LengthPercentageType.POINT));
    }

    public void setBorderStyle(@Nullable String str) {
        BackgroundStyleApplicator.setBorderStyle(this, str == null ? null : BorderStyle.fromString(str));
    }

    public void setHitSlopRect(@Nullable Rect rect) {
        this.mHitSlopRect = rect;
    }

    public void setNeedsOffscreenAlphaCompositing(boolean z11) {
        this.mNeedsOffscreenAlphaCompositing = z11;
    }

    @Override // com.facebook.react.touch.ReactInterceptingViewGroup
    public void setOnInterceptTouchEventListener(OnInterceptTouchEventListener onInterceptTouchEventListener) {
        this.mOnInterceptTouchEventListener = onInterceptTouchEventListener;
    }

    public void setOpacityIfPossible(float f11) {
        this.mBackfaceOpacity = f11;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setOverflow(@Nullable String str) {
        if (str == null) {
            this.mOverflow = Overflow.VISIBLE;
        } else {
            Overflow overflowFromString = Overflow.fromString(str);
            if (overflowFromString == null) {
                overflowFromString = Overflow.VISIBLE;
            }
            this.mOverflow = overflowFromString;
        }
        invalidate();
    }

    public void setPointerEvents(PointerEvents pointerEvents) {
        this.mPointerEvents = pointerEvents;
    }

    public void setRemoveClippedSubviews(boolean z11) {
        if (z11 == this.mRemoveClippedSubviews) {
            return;
        }
        this.mRemoveClippedSubviews = z11;
        this.mChildrenRemovedWhileTransitioning = null;
        if (z11) {
            Rect rect = new Rect();
            this.mClippingRect = rect;
            ReactClippingViewGroupHelper.calculateClippingRect(this, rect);
            int childCount = getChildCount();
            this.mAllChildrenCount = childCount;
            this.mAllChildren = new View[Math.max(12, childCount)];
            this.mChildrenLayoutChangeListener = new ChildrenLayoutChangeListener();
            for (int i11 = 0; i11 < this.mAllChildrenCount; i11++) {
                View childAt = getChildAt(i11);
                this.mAllChildren[i11] = childAt;
                childAt.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
            }
            updateClippingRect();
            return;
        }
        C38115a.m86047c(this.mClippingRect);
        C38115a.m86047c(this.mAllChildren);
        C38115a.m86047c(this.mChildrenLayoutChangeListener);
        for (int i12 = 0; i12 < this.mAllChildrenCount; i12++) {
            this.mAllChildren[i12].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        }
        getDrawingRect(this.mClippingRect);
        updateClippingToRect(this.mClippingRect);
        this.mAllChildren = null;
        this.mClippingRect = null;
        this.mAllChildrenCount = 0;
        this.mChildrenLayoutChangeListener = null;
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public void updateClippingRect() {
        if (this.mRemoveClippedSubviews) {
            C38115a.m86047c(this.mClippingRect);
            C38115a.m86047c(this.mAllChildren);
            ReactClippingViewGroupHelper.calculateClippingRect(this, this.mClippingRect);
            updateClippingToRect(this.mClippingRect);
        }
    }

    public ReactViewGroup(@Nullable Context context) {
        super(context);
        this.mOverflowInset = new Rect();
        this.mRecycleCount = 0;
        this.mPointerEvents = PointerEvents.AUTO;
        initView();
    }

    private boolean customDrawOrderDisabled() {
        if (getId() == -1 || ViewUtil.getUIManagerType(getId()) != 2) {
            return false;
        }
        return true;
    }

    private boolean isViewClipped(View view) {
        if (view.getParent() != null) {
            if (!isChildRemovedWhileTransitioning(view) || indexOfChild(view) != -1) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(23)
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        try {
            super.dispatchProvideStructure(viewStructure);
        } catch (NullPointerException e11) {
            C45999a.m101508n(ReactConstants.TAG, "NullPointerException when executing dispatchProvideStructure", e11);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j11) {
        boolean z11;
        Canvas canvas2;
        BlendMode blendModeM10647a;
        if (view.getElevation() > 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            CanvasUtil.enableZ(canvas, true);
        }
        if (Build.VERSION.SDK_INT >= 29 && BlendModeHelper.needsIsolatedLayer(this)) {
            blendModeM10647a = C6252x.m10647a(view.getTag(C5771R.id.mix_blend_mode));
            if (blendModeM10647a != null) {
                Paint paint = new Paint();
                paint.setBlendMode(blendModeM10647a);
                Rect overflowInset = getOverflowInset();
                float f11 = overflowInset.left;
                float f12 = overflowInset.top;
                float width = getWidth() + (-overflowInset.right);
                float height = getHeight() + (-overflowInset.bottom);
                canvas2 = canvas;
                canvas2.saveLayer(f11, f12, width, height, paint);
            } else {
                canvas2 = canvas;
            }
        } else {
            canvas2 = canvas;
            blendModeM10647a = null;
        }
        boolean zDrawChild = super.drawChild(canvas2, view, j11);
        if (blendModeM10647a != null) {
            canvas2.restore();
        }
        if (z11) {
            CanvasUtil.enableZ(canvas2, false);
        }
        return zDrawChild;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        super.endViewTransition(view);
        Set<Integer> set = this.mChildrenRemovedWhileTransitioning;
        if (set != null) {
            set.remove(Integer.valueOf(view.getId()));
        }
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i11, int i12) {
        UiThreadUtil.assertOnUiThread();
        if (!customDrawOrderDisabled()) {
            return getDrawingOrderHelper().getChildDrawingOrder(i11, i12);
        }
        return i12;
    }

    @Override // com.facebook.react.uimanager.ReactZIndexedViewGroup
    public int getZIndexMappedChildIndex(int i11) {
        UiThreadUtil.assertOnUiThread();
        if (!customDrawOrderDisabled() && getDrawingOrderHelper().shouldEnableCustomDrawingOrder()) {
            return getDrawingOrderHelper().getChildDrawingOrder(getChildCount(), i11);
        }
        return i11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        MeasureSpecAssertions.assertExplicitMeasureSpec(i11, i12);
        setMeasuredDimension(View.MeasureSpec.getSize(i11), View.MeasureSpec.getSize(i12));
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        UiThreadUtil.assertOnUiThread();
        if (!customDrawOrderDisabled()) {
            getDrawingOrderHelper().handleAddView(view);
            setChildrenDrawingOrderEnabled(getDrawingOrderHelper().shouldEnableCustomDrawingOrder());
        } else {
            setChildrenDrawingOrderEnabled(false);
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        UiThreadUtil.assertOnUiThread();
        if (!customDrawOrderDisabled()) {
            getDrawingOrderHelper().handleRemoveView(view);
            setChildrenDrawingOrderEnabled(getDrawingOrderHelper().shouldEnableCustomDrawingOrder());
        } else {
            setChildrenDrawingOrderEnabled(false);
        }
        if (view.getParent() != null) {
            trackChildViewTransition(view.getId());
        }
        super.onViewRemoved(view);
    }

    public void removeViewWithSubviewClippingEnabled(View view) {
        UiThreadUtil.assertOnUiThread();
        C38115a.m86045a(this.mRemoveClippedSubviews);
        C38115a.m86047c(this.mClippingRect);
        View[] viewArr = (View[]) C38115a.m86047c(this.mAllChildren);
        view.removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        int iIndexOfChildInAllChildren = indexOfChildInAllChildren(view);
        if (!isViewClipped(viewArr[iIndexOfChildInAllChildren])) {
            int i11 = 0;
            for (int i12 = 0; i12 < iIndexOfChildInAllChildren; i12++) {
                if (isViewClipped(viewArr[i12])) {
                    i11++;
                }
            }
            removeViewsInLayout(iIndexOfChildInAllChildren - i11, 1);
            invalidate();
        }
        removeFromArray(iIndexOfChildInAllChildren);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        BackgroundStyleApplicator.setBackgroundColor(this, Integer.valueOf(i11));
    }

    public void setBorderColor(int i11, @Nullable Integer num) {
        BackgroundStyleApplicator.setBorderColor(this, LogicalEdge.values()[i11], num);
    }

    public void setBorderWidth(int i11, float f11) {
        BackgroundStyleApplicator.setBorderWidth(this, LogicalEdge.values()[i11], Float.valueOf(PixelUtil.toDIPFromPixel(f11)));
    }

    @Override // com.facebook.react.uimanager.ReactOverflowViewWithInset
    public void setOverflowInset(int i11, int i12, int i13, int i14) {
        if (BlendModeHelper.needsIsolatedLayer(this)) {
            Rect rect = this.mOverflowInset;
            if (rect.left != i11 || rect.top != i12 || rect.right != i13 || rect.bottom != i14) {
                invalidate();
            }
        }
        this.mOverflowInset.set(i11, i12, i13, i14);
    }

    @Deprecated(forRemoval = true, since = "0.76.0")
    public void setTranslucentBackgroundDrawable(@Nullable Drawable drawable) {
        BackgroundStyleApplicator.setFeedbackUnderlay(this, drawable);
    }

    public void updateBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackground(drawable);
    }

    @Override // com.facebook.react.uimanager.ReactZIndexedViewGroup
    public void updateDrawingOrder() {
        if (customDrawOrderDisabled()) {
            return;
        }
        getDrawingOrderHelper().update();
        setChildrenDrawingOrderEnabled(getDrawingOrderHelper().shouldEnableCustomDrawingOrder());
        invalidate();
    }

    public void setBorderRadius(BorderRadiusProp borderRadiusProp, @Nullable LengthPercentage lengthPercentage) {
        BackgroundStyleApplicator.setBorderRadius(this, borderRadiusProp, lengthPercentage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSubviewClipStatus(View view) {
        if (!this.mRemoveClippedSubviews || getParent() == null) {
            return;
        }
        C38115a.m86047c(this.mClippingRect);
        C38115a.m86047c(this.mAllChildren);
        if (this.mClippingRect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) != (!isViewClipped(view))) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.mAllChildrenCount; i12++) {
                View view2 = this.mAllChildren[i12];
                if (view2 == view) {
                    updateSubviewClipStatus(this.mClippingRect, i12, i11);
                    return;
                } else {
                    if (isViewClipped(view2)) {
                        i11++;
                    }
                }
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSetPressed(boolean z11) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }
}
