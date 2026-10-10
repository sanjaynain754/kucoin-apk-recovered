package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.C1529R;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Pools;
import androidx.core.view.GravityCompat;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.tencent.bugly.proguard.C33978va;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements NestedScrollingParent2, NestedScrollingParent3 {
    static final Class<?>[] CONSTRUCTOR_PARAMS;
    static final int EVENT_NESTED_SCROLL = 1;
    static final int EVENT_PRE_DRAW = 0;
    static final int EVENT_VIEW_REMOVED = 2;
    static final String TAG = "CoordinatorLayout";
    static final Comparator<View> TOP_SORTED_CHILDREN_COMPARATOR;
    private static final int TYPE_ON_INTERCEPT = 0;
    private static final int TYPE_ON_TOUCH = 1;
    static final String WIDGET_PACKAGE_NAME;
    static final ThreadLocal<Map<String, Constructor<Behavior>>> sConstructors;
    private static final Pools.Pool<Rect> sRectPool;
    private OnApplyWindowInsetsListener mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private View mBehaviorTouchView;
    private final DirectedAcyclicGraph<View> mChildDag;
    private final List<View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private WindowInsetsCompat mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final NestedScrollingParentHelper mNestedScrollingParentHelper;
    private View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private OnPreDrawListener mOnPreDrawListener;
    private Paint mScrimPaint;
    private Drawable mStatusBarBackground;
    private final List<View> mTempDependenciesList;
    private final List<View> mTempList1;

    public interface AttachedBehavior {
        @NonNull
        Behavior getBehavior();
    }

    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull Rect rect) {
            return false;
        }

        @FloatRange(from = 0.0d, m1552to = 1.0d)
        public float getScrimOpacity(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11) {
            return 0.0f;
        }

        public boolean layoutDependsOn(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view) {
            return false;
        }

        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view) {
            return false;
        }

        public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11) {
            return false;
        }

        public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11, int i12, int i13, int i14) {
            return false;
        }

        public boolean onNestedFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, float f11, float f12, boolean z11) {
            return false;
        }

        public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, float f11, float f12) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, @NonNull int[] iArr) {
        }

        @Deprecated
        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, int i13, int i14) {
        }

        @Deprecated
        public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, @NonNull View view2, int i11) {
        }

        public boolean onRequestChildRectangleOnScreen(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull Rect rect, boolean z11) {
            return false;
        }

        @Deprecated
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, @NonNull View view2, int i11) {
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view) {
        }

        public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        @ColorInt
        public int getScrimColor(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11) {
            return ViewCompat.MEASURED_STATE_MASK;
        }

        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, @NonNull int[] iArr, int i13) {
            if (i13 == 0) {
                onNestedPreScroll(coordinatorLayout, v11, view, i11, i12, iArr);
            }
        }

        @Deprecated
        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, int i13, int i14, int i15) {
            if (i15 == 0) {
                onNestedScroll(coordinatorLayout, v11, view, i11, i12, i13, i14);
            }
        }

        public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, @NonNull View view2, int i11, int i12) {
            if (i12 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v11, view, view2, i11);
            }
        }

        @Nullable
        public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, @NonNull View view2, int i11, int i12) {
            if (i12 == 0) {
                return onStartNestedScroll(coordinatorLayout, v11, view, view2, i11);
            }
            return false;
        }

        public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11) {
            if (i11 == 0) {
                onStopNestedScroll(coordinatorLayout, v11, view);
            }
        }

        @Nullable
        public static Object getTag(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).mBehaviorTag;
        }

        public static void setTag(@NonNull View view, @Nullable Object obj) {
            ((LayoutParams) view.getLayoutParams()).mBehaviorTag = obj;
        }

        public boolean blocksInteractionBelow(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11) {
            if (getScrimOpacity(coordinatorLayout, v11) > 0.0f) {
                return true;
            }
            return false;
        }

        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, int i13, int i14, int i15, @NonNull int[] iArr) {
            iArr[0] = iArr[0] + i13;
            iArr[1] = iArr[1] + i14;
            onNestedScroll(coordinatorLayout, v11, view, i11, i12, i13, i14, i15);
        }

        public void onDetachedFromLayoutParams() {
        }

        public void onAttachedToLayoutParams(@NonNull LayoutParams layoutParams) {
        }

        @NonNull
        public WindowInsetsCompat onApplyWindowInsets(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        public void onDependentViewRemoved(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view) {
        }

        public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull Parcelable parcelable) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface DefaultBehavior {
        Class<? extends Behavior> value();
    }

    /* JADX INFO: loaded from: classes23.dex */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface DispatchChangeEvent {
    }

    public class HierarchyChangeListener implements ViewGroup.OnHierarchyChangeListener {
        public HierarchyChangeListener() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.onChildViewsChanged(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int anchorGravity;
        public int dodgeInsetEdges;
        public int gravity;
        public int insetEdge;
        public int keyline;
        View mAnchorDirectChild;
        int mAnchorId;
        View mAnchorView;
        Behavior mBehavior;
        boolean mBehaviorResolved;
        Object mBehaviorTag;
        private boolean mDidAcceptNestedScrollNonTouch;
        private boolean mDidAcceptNestedScrollTouch;
        private boolean mDidBlockInteraction;
        private boolean mDidChangeAfterNestedScroll;
        int mInsetOffsetX;
        int mInsetOffsetY;
        final Rect mLastChildRect;

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.mLastChildRect = new Rect();
        }

        public void invalidateAnchor() {
            this.mAnchorDirectChild = null;
            this.mAnchorView = null;
        }

        public void resetChangedAfterNestedScroll() {
            this.mDidChangeAfterNestedScroll = false;
        }

        public void resetNestedScroll(int i11) {
            setNestedScrollAccepted(i11, false);
        }

        public void resetTouchBehaviorTracking() {
            this.mDidBlockInteraction = false;
        }

        private void resolveAnchorView(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.mAnchorId);
            this.mAnchorView = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.mAnchorDirectChild = null;
                    this.mAnchorView = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.mAnchorId) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.mAnchorDirectChild = null;
                this.mAnchorView = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.mAnchorDirectChild = null;
                    this.mAnchorView = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.mAnchorDirectChild = viewFindViewById;
        }

        private boolean verifyAnchorView(View view, CoordinatorLayout coordinatorLayout) {
            if (this.mAnchorView.getId() != this.mAnchorId) {
                return false;
            }
            View view2 = this.mAnchorView;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.mAnchorDirectChild = null;
                    this.mAnchorView = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.mAnchorDirectChild = view2;
            return true;
        }

        public boolean checkAnchorChanged() {
            return this.mAnchorView == null && this.mAnchorId != -1;
        }

        public boolean dependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.mAnchorDirectChild || shouldDodge(view2, ViewCompat.getLayoutDirection(coordinatorLayout))) {
                return true;
            }
            Behavior behavior = this.mBehavior;
            return behavior != null && behavior.layoutDependsOn(coordinatorLayout, view, view2);
        }

        public boolean didBlockInteraction() {
            if (this.mBehavior == null) {
                this.mDidBlockInteraction = false;
            }
            return this.mDidBlockInteraction;
        }

        public View findAnchorView(CoordinatorLayout coordinatorLayout, View view) {
            if (this.mAnchorId == -1) {
                this.mAnchorDirectChild = null;
                this.mAnchorView = null;
                return null;
            }
            if (this.mAnchorView == null || !verifyAnchorView(view, coordinatorLayout)) {
                resolveAnchorView(view, coordinatorLayout);
            }
            return this.mAnchorView;
        }

        @IdRes
        public int getAnchorId() {
            return this.mAnchorId;
        }

        @Nullable
        public Behavior getBehavior() {
            return this.mBehavior;
        }

        public boolean getChangedAfterNestedScroll() {
            return this.mDidChangeAfterNestedScroll;
        }

        public Rect getLastChildRect() {
            return this.mLastChildRect;
        }

        public boolean isBlockingInteractionBelow(CoordinatorLayout coordinatorLayout, View view) {
            boolean z11 = this.mDidBlockInteraction;
            if (z11) {
                return true;
            }
            Behavior behavior = this.mBehavior;
            boolean zBlocksInteractionBelow = (behavior != null ? behavior.blocksInteractionBelow(coordinatorLayout, view) : false) | z11;
            this.mDidBlockInteraction = zBlocksInteractionBelow;
            return zBlocksInteractionBelow;
        }

        public boolean isNestedScrollAccepted(int i11) {
            if (i11 == 0) {
                return this.mDidAcceptNestedScrollTouch;
            }
            if (i11 != 1) {
                return false;
            }
            return this.mDidAcceptNestedScrollNonTouch;
        }

        public void setBehavior(@Nullable Behavior behavior) {
            Behavior behavior2 = this.mBehavior;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.onDetachedFromLayoutParams();
                }
                this.mBehavior = behavior;
                this.mBehaviorTag = null;
                this.mBehaviorResolved = true;
                if (behavior != null) {
                    behavior.onAttachedToLayoutParams(this);
                }
            }
        }

        public void setChangedAfterNestedScroll(boolean z11) {
            this.mDidChangeAfterNestedScroll = z11;
        }

        public void setLastChildRect(Rect rect) {
            this.mLastChildRect.set(rect);
        }

        public void setNestedScrollAccepted(int i11, boolean z11) {
            if (i11 == 0) {
                this.mDidAcceptNestedScrollTouch = z11;
            } else {
                if (i11 != 1) {
                    return;
                }
                this.mDidAcceptNestedScrollNonTouch = z11;
            }
        }

        private boolean shouldDodge(View view, int i11) {
            int absoluteGravity = GravityCompat.getAbsoluteGravity(((LayoutParams) view.getLayoutParams()).insetEdge, i11);
            if (absoluteGravity != 0 && (GravityCompat.getAbsoluteGravity(this.dodgeInsetEdges, i11) & absoluteGravity) == absoluteGravity) {
                return true;
            }
            return false;
        }

        public void setAnchorId(@IdRes int i11) {
            invalidateAnchor();
            this.mAnchorId = i11;
        }

        public LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.mLastChildRect = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1529R.styleable.CoordinatorLayout_Layout);
            this.gravity = typedArrayObtainStyledAttributes.getInteger(C1529R.styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.mAnchorId = typedArrayObtainStyledAttributes.getResourceId(C1529R.styleable.CoordinatorLayout_Layout_layout_anchor, -1);
            this.anchorGravity = typedArrayObtainStyledAttributes.getInteger(C1529R.styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.keyline = typedArrayObtainStyledAttributes.getInteger(C1529R.styleable.CoordinatorLayout_Layout_layout_keyline, -1);
            this.insetEdge = typedArrayObtainStyledAttributes.getInt(C1529R.styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.dodgeInsetEdges = typedArrayObtainStyledAttributes.getInt(C1529R.styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            int i11 = C1529R.styleable.CoordinatorLayout_Layout_layout_behavior;
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i11);
            this.mBehaviorResolved = zHasValue;
            if (zHasValue) {
                this.mBehavior = CoordinatorLayout.parseBehavior(context, attributeSet, typedArrayObtainStyledAttributes.getString(i11));
            }
            typedArrayObtainStyledAttributes.recycle();
            Behavior behavior = this.mBehavior;
            if (behavior != null) {
                behavior.onAttachedToLayoutParams(this);
            }
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.mLastChildRect = new Rect();
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.mLastChildRect = new Rect();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.mLastChildRect = new Rect();
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public class OnPreDrawListener implements ViewTreeObserver.OnPreDrawListener {
        public OnPreDrawListener() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.onChildViewsChanged(0);
            return true;
        }
    }

    public static class ViewElevationComparator implements Comparator<View> {
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            float z11 = ViewCompat.getZ(view);
            float z12 = ViewCompat.getZ(view2);
            if (z11 > z12) {
                return -1;
            }
            return z11 < z12 ? 1 : 0;
        }
    }

    public CoordinatorLayout(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
        onNestedPreScroll(view, i11, i12, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        onNestedScroll(view, i11, i12, i13, i14, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i11) {
        onNestedScrollAccepted(view, view2, i11, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i11) {
        return onStartNestedScroll(view, view2, i11, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState.1
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
        SparseArray<Parcelable> behaviorStates;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i11 = parcel.readInt();
            int[] iArr = new int[i11];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.behaviorStates = new SparseArray<>(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                this.behaviorStates.append(iArr[i12], parcelableArray[i12]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            int size;
            super.writeToParcel(parcel, i11);
            SparseArray<Parcelable> sparseArray = this.behaviorStates;
            if (sparseArray != null) {
                size = sparseArray.size();
            } else {
                size = 0;
            }
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i12 = 0; i12 < size; i12++) {
                iArr[i12] = this.behaviorStates.keyAt(i12);
                parcelableArr[i12] = this.behaviorStates.valueAt(i12);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i11);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    static {
        Package r11 = CoordinatorLayout.class.getPackage();
        WIDGET_PACKAGE_NAME = r11 != null ? r11.getName() : null;
        TOP_SORTED_CHILDREN_COMPARATOR = new ViewElevationComparator();
        CONSTRUCTOR_PARAMS = new Class[]{Context.class, AttributeSet.class};
        sConstructors = new ThreadLocal<>();
        sRectPool = new Pools.SynchronizedPool(12);
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C1529R.attr.coordinatorLayoutStyle);
    }

    @NonNull
    private static Rect acquireTempRect() {
        Rect rectAcquire = sRectPool.acquire();
        return rectAcquire == null ? new Rect() : rectAcquire;
    }

    private static int clamp(int i11, int i12, int i13) {
        if (i11 < i12) {
            return i12;
        }
        return i11 > i13 ? i13 : i11;
    }

    private void getDesiredAnchoredChildRectWithoutConstraints(View view, int i11, Rect rect, Rect rect2, LayoutParams layoutParams, int i12, int i13) {
        int iWidth;
        int iHeight;
        int absoluteGravity = GravityCompat.getAbsoluteGravity(resolveAnchoredChildGravity(layoutParams.gravity), i11);
        int absoluteGravity2 = GravityCompat.getAbsoluteGravity(resolveGravity(layoutParams.anchorGravity), i11);
        int i14 = absoluteGravity & 7;
        int i15 = absoluteGravity & 112;
        int i16 = absoluteGravity2 & 7;
        int i17 = absoluteGravity2 & 112;
        if (i16 != 1) {
            iWidth = i16 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i17 != 16) {
            iHeight = i17 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i14 == 1) {
            iWidth -= i12 / 2;
        } else if (i14 != 5) {
            iWidth -= i12;
        }
        if (i15 == 16) {
            iHeight -= i13 / 2;
        } else if (i15 != 80) {
            iHeight -= i13;
        }
        rect2.set(iWidth, iHeight, i12 + iWidth, i13 + iHeight);
    }

    private int getKeyline(int i11) {
        int[] iArr = this.mKeylines;
        if (iArr == null) {
            Log.e(TAG, "No keylines defined for " + this + " - attempted index lookup " + i11);
            return 0;
        }
        if (i11 >= 0 && i11 < iArr.length) {
            return iArr[i11];
        }
        Log.e(TAG, "Keyline index " + i11 + " out of range for " + this);
        return 0;
    }

    private boolean hasDependencies(View view) {
        return this.mChildDag.hasOutgoingEdges(view);
    }

    private boolean performIntercept(MotionEvent motionEvent, int i11) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.mTempList1;
        getTopSortedChildren(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zOnInterceptTouchEvent = false;
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = list.get(i12);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Behavior behavior = layoutParams.getBehavior();
            if (!(zOnInterceptTouchEvent || z11) || actionMasked == 0) {
                if (!zOnInterceptTouchEvent && behavior != null) {
                    if (i11 == 0) {
                        zOnInterceptTouchEvent = behavior.onInterceptTouchEvent(this, view, motionEvent);
                    } else if (i11 == 1) {
                        zOnInterceptTouchEvent = behavior.onTouchEvent(this, view, motionEvent);
                    }
                    if (zOnInterceptTouchEvent) {
                        this.mBehaviorTouchView = view;
                    }
                }
                boolean zDidBlockInteraction = layoutParams.didBlockInteraction();
                boolean zIsBlockingInteractionBelow = layoutParams.isBlockingInteractionBelow(this, view);
                z11 = zIsBlockingInteractionBelow && !zDidBlockInteraction;
                if (zIsBlockingInteractionBelow && !z11) {
                    break;
                }
            } else if (behavior != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i11 == 0) {
                    behavior.onInterceptTouchEvent(this, view, motionEventObtain);
                } else if (i11 == 1) {
                    behavior.onTouchEvent(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zOnInterceptTouchEvent;
    }

    private void prepareChildren() {
        this.mDependencySortedChildren.clear();
        this.mChildDag.clear();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            LayoutParams resolvedLayoutParams = getResolvedLayoutParams(childAt);
            resolvedLayoutParams.findAnchorView(this, childAt);
            this.mChildDag.addNode(childAt);
            for (int i12 = 0; i12 < childCount; i12++) {
                if (i12 != i11) {
                    View childAt2 = getChildAt(i12);
                    if (resolvedLayoutParams.dependsOn(this, childAt, childAt2)) {
                        if (!this.mChildDag.contains(childAt2)) {
                            this.mChildDag.addNode(childAt2);
                        }
                        this.mChildDag.addEdge(childAt2, childAt);
                    }
                }
            }
        }
        this.mDependencySortedChildren.addAll(this.mChildDag.getSortedList());
        Collections.reverse(this.mDependencySortedChildren);
    }

    private static int resolveAnchoredChildGravity(int i11) {
        if (i11 == 0) {
            return 17;
        }
        return i11;
    }

    private static int resolveGravity(int i11) {
        if ((i11 & 7) == 0) {
            i11 |= GravityCompat.START;
        }
        return (i11 & 112) == 0 ? i11 | 48 : i11;
    }

    private static int resolveKeylineGravity(int i11) {
        if (i11 == 0) {
            return 8388661;
        }
        return i11;
    }

    public void addPreDrawListener() {
        if (this.mIsAttachedToWindow) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new OnPreDrawListener();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void dispatchDependentViewsChanged(@NonNull View view) {
        List incomingEdges = this.mChildDag.getIncomingEdges(view);
        if (incomingEdges == null || incomingEdges.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < incomingEdges.size(); i11++) {
            View view2 = (View) incomingEdges.get(i11);
            Behavior behavior = ((LayoutParams) view2.getLayoutParams()).getBehavior();
            if (behavior != null) {
                behavior.onDependentViewChanged(this, view2, view);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x008f  */
    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j11) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Behavior behavior = layoutParams.mBehavior;
        if (behavior != null) {
            float scrimOpacity = behavior.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.mScrimPaint == null) {
                    this.mScrimPaint = new Paint();
                }
                this.mScrimPaint.setColor(layoutParams.mBehavior.getScrimColor(this, view));
                this.mScrimPaint.setAlpha(clamp(Math.round(scrimOpacity * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.mScrimPaint);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j11);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @NonNull
    public List<View> getDependencies(@NonNull View view) {
        List<View> outgoingEdges = this.mChildDag.getOutgoingEdges(view);
        this.mTempDependenciesList.clear();
        if (outgoingEdges != null) {
            this.mTempDependenciesList.addAll(outgoingEdges);
        }
        return this.mTempDependenciesList;
    }

    @NonNull
    public List<View> getDependents(@NonNull View view) {
        List incomingEdges = this.mChildDag.getIncomingEdges(view);
        this.mTempDependenciesList.clear();
        if (incomingEdges != null) {
            this.mTempDependenciesList.addAll(incomingEdges);
        }
        return this.mTempDependenciesList;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final WindowInsetsCompat getLastWindowInsets() {
        return this.mLastInsets;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.getNestedScrollAxes();
    }

    @Nullable
    public Drawable getStatusBarBackground() {
        return this.mStatusBarBackground;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    public final void onChildViewsChanged(int i11) {
        int i12;
        Behavior behavior;
        boolean zOnDependentViewChanged;
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int size = this.mDependencySortedChildren.size();
        Rect rectAcquireTempRect = acquireTempRect();
        Rect rectAcquireTempRect2 = acquireTempRect();
        Rect rectAcquireTempRect3 = acquireTempRect();
        for (int i13 = 0; i13 < size; i13++) {
            View view = this.mDependencySortedChildren.get(i13);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (i11 != 0 || view.getVisibility() != 8) {
                for (int i14 = 0; i14 < i13; i14++) {
                    if (layoutParams.mAnchorDirectChild == this.mDependencySortedChildren.get(i14)) {
                        offsetChildToAnchor(view, layoutDirection);
                    }
                }
                getChildRect(view, true, rectAcquireTempRect2);
                if (layoutParams.insetEdge != 0 && !rectAcquireTempRect2.isEmpty()) {
                    int absoluteGravity = GravityCompat.getAbsoluteGravity(layoutParams.insetEdge, layoutDirection);
                    int i15 = absoluteGravity & 112;
                    if (i15 == 48) {
                        rectAcquireTempRect.top = Math.max(rectAcquireTempRect.top, rectAcquireTempRect2.bottom);
                    } else if (i15 == 80) {
                        rectAcquireTempRect.bottom = Math.max(rectAcquireTempRect.bottom, getHeight() - rectAcquireTempRect2.top);
                    }
                    int i16 = absoluteGravity & 7;
                    if (i16 == 3) {
                        rectAcquireTempRect.left = Math.max(rectAcquireTempRect.left, rectAcquireTempRect2.right);
                    } else if (i16 == 5) {
                        rectAcquireTempRect.right = Math.max(rectAcquireTempRect.right, getWidth() - rectAcquireTempRect2.left);
                    }
                }
                if (layoutParams.dodgeInsetEdges != 0 && view.getVisibility() == 0) {
                    offsetChildByInset(view, rectAcquireTempRect, layoutDirection);
                }
                if (i11 != 2) {
                    getLastChildRect(view, rectAcquireTempRect3);
                    if (!rectAcquireTempRect3.equals(rectAcquireTempRect2)) {
                        recordLastChildRect(view, rectAcquireTempRect2);
                        for (i12 = i13 + 1; i12 < size; i12++) {
                            View view2 = this.mDependencySortedChildren.get(i12);
                            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
                            behavior = layoutParams2.getBehavior();
                            if (behavior == null && behavior.layoutDependsOn(this, view2, view)) {
                                if (i11 == 0 && layoutParams2.getChangedAfterNestedScroll()) {
                                    layoutParams2.resetChangedAfterNestedScroll();
                                } else {
                                    if (i11 != 2) {
                                        zOnDependentViewChanged = behavior.onDependentViewChanged(this, view2, view);
                                    } else {
                                        behavior.onDependentViewRemoved(this, view2, view);
                                        zOnDependentViewChanged = true;
                                    }
                                    if (i11 == 1) {
                                        layoutParams2.setChangedAfterNestedScroll(zOnDependentViewChanged);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i12 < size) {
                        View view3 = this.mDependencySortedChildren.get(i12);
                        LayoutParams layoutParams3 = (LayoutParams) view3.getLayoutParams();
                        behavior = layoutParams3.getBehavior();
                        if (behavior == null) {
                        }
                    }
                }
            }
        }
        releaseTempRect(rectAcquireTempRect);
        releaseTempRect(rectAcquireTempRect2);
        releaseTempRect(rectAcquireTempRect3);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:44:0x010b  */
    /* JADX WARN: Code duplicated, block: B:47:0x012c  */
    /* JADX WARN: Code duplicated, block: B:48:0x012f  */
    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        Behavior behavior;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        View view;
        int i24;
        int i25;
        boolean zOnMeasureChild;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.prepareChildren();
        coordinatorLayout.ensurePreDrawListener();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int layoutDirection = ViewCompat.getLayoutDirection(coordinatorLayout);
        boolean z11 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int i26 = paddingLeft + paddingRight;
        int i27 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z12 = coordinatorLayout.mLastInsets != null && ViewCompat.getFitsSystemWindows(coordinatorLayout);
        int size3 = coordinatorLayout.mDependencySortedChildren.size();
        int i28 = 0;
        int iCombineMeasuredStates = 0;
        while (i28 < size3) {
            View view2 = coordinatorLayout.mDependencySortedChildren.get(i28);
            int i29 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                i18 = size3;
                i14 = i28;
                i24 = paddingRight;
                i19 = layoutDirection;
                suggestedMinimumWidth = i29;
                i16 = paddingLeft;
            } else {
                LayoutParams layoutParams = (LayoutParams) view2.getLayoutParams();
                int i31 = layoutParams.keyline;
                if (i31 < 0 || mode == 0) {
                    i13 = suggestedMinimumHeight;
                } else {
                    int keyline = coordinatorLayout.getKeyline(i31);
                    int absoluteGravity = GravityCompat.getAbsoluteGravity(resolveKeylineGravity(layoutParams.gravity), layoutDirection) & 7;
                    i13 = suggestedMinimumHeight;
                    if ((absoluteGravity != 3 || z11) && !(absoluteGravity == 5 && z11)) {
                        if ((absoluteGravity == 5 && !z11) || (absoluteGravity == 3 && z11)) {
                            iMax = Math.max(0, keyline - paddingLeft);
                        }
                        if (z12 || ViewCompat.getFitsSystemWindows(view2)) {
                            iMakeMeasureSpec = i11;
                            iMakeMeasureSpec2 = i12;
                        } else {
                            int systemWindowInsetLeft = coordinatorLayout.mLastInsets.getSystemWindowInsetLeft() + coordinatorLayout.mLastInsets.getSystemWindowInsetRight();
                            int systemWindowInsetTop = coordinatorLayout.mLastInsets.getSystemWindowInsetTop() + coordinatorLayout.mLastInsets.getSystemWindowInsetBottom();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - systemWindowInsetLeft, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - systemWindowInsetTop, mode2);
                        }
                        behavior = layoutParams.getBehavior();
                        if (behavior != null) {
                            i18 = size3;
                            int i32 = iMakeMeasureSpec;
                            view = view2;
                            i16 = paddingLeft;
                            i17 = i29;
                            i19 = layoutDirection;
                            i21 = i13;
                            i24 = paddingRight;
                            i25 = iCombineMeasuredStates;
                            int i33 = iMakeMeasureSpec2;
                            zOnMeasureChild = behavior.onMeasureChild(this, view, i32, i15, i33, 0);
                            i23 = i32;
                            i22 = i33;
                            if (zOnMeasureChild) {
                                coordinatorLayout = this;
                            }
                            suggestedMinimumWidth = Math.max(i17, i26 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                            int iMax2 = Math.max(i21, i27 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(i25, view.getMeasuredState());
                            suggestedMinimumHeight = iMax2;
                        } else {
                            i16 = paddingLeft;
                            i17 = i29;
                            i18 = size3;
                            i19 = layoutDirection;
                            i21 = i13;
                            i22 = iMakeMeasureSpec2;
                            i23 = iMakeMeasureSpec;
                            view = view2;
                            i24 = paddingRight;
                            i25 = iCombineMeasuredStates;
                        }
                        View view3 = view;
                        coordinatorLayout = this;
                        coordinatorLayout.onMeasureChild(view3, i23, i15, i22, 0);
                        view = view3;
                        suggestedMinimumWidth = Math.max(i17, i26 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                        int iMax3 = Math.max(i21, i27 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i25, view.getMeasuredState());
                        suggestedMinimumHeight = iMax3;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - keyline);
                    }
                    int i34 = i28;
                    i15 = iMax;
                    i14 = i34;
                    if (z12) {
                        iMakeMeasureSpec = i11;
                        iMakeMeasureSpec2 = i12;
                    } else {
                        iMakeMeasureSpec = i11;
                        iMakeMeasureSpec2 = i12;
                    }
                    behavior = layoutParams.getBehavior();
                    if (behavior != null) {
                        i18 = size3;
                        int i35 = iMakeMeasureSpec;
                        view = view2;
                        i16 = paddingLeft;
                        i17 = i29;
                        i19 = layoutDirection;
                        i21 = i13;
                        i24 = paddingRight;
                        i25 = iCombineMeasuredStates;
                        int i36 = iMakeMeasureSpec2;
                        zOnMeasureChild = behavior.onMeasureChild(this, view, i35, i15, i36, 0);
                        i23 = i35;
                        i22 = i36;
                        if (zOnMeasureChild) {
                            coordinatorLayout = this;
                        }
                        suggestedMinimumWidth = Math.max(i17, i26 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                        int iMax4 = Math.max(i21, i27 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i25, view.getMeasuredState());
                        suggestedMinimumHeight = iMax4;
                    } else {
                        i16 = paddingLeft;
                        i17 = i29;
                        i18 = size3;
                        i19 = layoutDirection;
                        i21 = i13;
                        i22 = iMakeMeasureSpec2;
                        i23 = iMakeMeasureSpec;
                        view = view2;
                        i24 = paddingRight;
                        i25 = iCombineMeasuredStates;
                    }
                    View view4 = view;
                    coordinatorLayout = this;
                    coordinatorLayout.onMeasureChild(view4, i23, i15, i22, 0);
                    view = view4;
                    suggestedMinimumWidth = Math.max(i17, i26 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    int iMax5 = Math.max(i21, i27 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i25, view.getMeasuredState());
                    suggestedMinimumHeight = iMax5;
                }
                i14 = i28;
                i15 = 0;
                if (z12) {
                    iMakeMeasureSpec = i11;
                    iMakeMeasureSpec2 = i12;
                } else {
                    iMakeMeasureSpec = i11;
                    iMakeMeasureSpec2 = i12;
                }
                behavior = layoutParams.getBehavior();
                if (behavior != null) {
                    i18 = size3;
                    int i37 = iMakeMeasureSpec;
                    view = view2;
                    i16 = paddingLeft;
                    i17 = i29;
                    i19 = layoutDirection;
                    i21 = i13;
                    i24 = paddingRight;
                    i25 = iCombineMeasuredStates;
                    int i38 = iMakeMeasureSpec2;
                    zOnMeasureChild = behavior.onMeasureChild(this, view, i37, i15, i38, 0);
                    i23 = i37;
                    i22 = i38;
                    if (zOnMeasureChild) {
                        coordinatorLayout = this;
                    }
                    suggestedMinimumWidth = Math.max(i17, i26 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    int iMax6 = Math.max(i21, i27 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i25, view.getMeasuredState());
                    suggestedMinimumHeight = iMax6;
                } else {
                    i16 = paddingLeft;
                    i17 = i29;
                    i18 = size3;
                    i19 = layoutDirection;
                    i21 = i13;
                    i22 = iMakeMeasureSpec2;
                    i23 = iMakeMeasureSpec;
                    view = view2;
                    i24 = paddingRight;
                    i25 = iCombineMeasuredStates;
                }
                View view5 = view;
                coordinatorLayout = this;
                coordinatorLayout.onMeasureChild(view5, i23, i15, i22, 0);
                view = view5;
                suggestedMinimumWidth = Math.max(i17, i26 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                int iMax7 = Math.max(i21, i27 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i25, view.getMeasuredState());
                suggestedMinimumHeight = iMax7;
            }
            i28 = i14 + 1;
            paddingLeft = i16;
            paddingRight = i24;
            size3 = i18;
            layoutDirection = i19;
        }
        int i39 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i11, (-16777216) & i39), View.resolveSizeAndState(suggestedMinimumHeight, i12, i39 << 16));
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr, int i13) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z11 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isNestedScrollAccepted(i13) && (behavior = layoutParams.getBehavior()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedPreScroll(this, childAt, view, i11, i12, iArr2, i13);
                    int[] iArr3 = this.mBehaviorConsumed;
                    iMax = i11 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    iMax2 = i12 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z11 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z11) {
            onChildViewsChanged(1);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14, int i15) {
        onNestedScroll(view, i11, i12, i13, i14, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i11, int i12) {
        Behavior behavior;
        View view3;
        View view4;
        int i13;
        int i14;
        this.mNestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i11, i12);
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        int i15 = 0;
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.isNestedScrollAccepted(i12) && (behavior = layoutParams.getBehavior()) != null) {
                view3 = view;
                view4 = view2;
                i13 = i11;
                i14 = i12;
                behavior.onNestedScrollAccepted(this, childAt, view3, view4, i13, i14);
            } else {
                view3 = view;
                view4 = view2;
                i13 = i11;
                i14 = i12;
            }
            i15++;
            view = view3;
            view2 = view4;
            i11 = i13;
            i12 = i14;
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        SparseArray<Parcelable> sparseArray = savedState.behaviorStates;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            int id2 = childAt.getId();
            Behavior behavior = getResolvedLayoutParams(childAt).getBehavior();
            if (id2 != -1 && behavior != null && (parcelable2 = sparseArray.get(id2)) != null) {
                behavior.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            int id2 = childAt.getId();
            Behavior behavior = ((LayoutParams) childAt.getLayoutParams()).getBehavior();
            if (id2 != -1 && behavior != null && (parcelableOnSaveInstanceState = behavior.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id2, parcelableOnSaveInstanceState);
            }
        }
        savedState.behaviorStates = sparseArray;
        return savedState;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i11, int i12) {
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Behavior behavior = layoutParams.getBehavior();
                if (behavior != null) {
                    boolean zOnStartNestedScroll = behavior.onStartNestedScroll(this, childAt, view, view2, i11, i12);
                    z11 |= zOnStartNestedScroll;
                    layoutParams.setNestedScrollAccepted(i12, zOnStartNestedScroll);
                } else {
                    layoutParams.setNestedScrollAccepted(i12, false);
                }
            }
        }
        return z11;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i11) {
        this.mNestedScrollingParentHelper.onStopNestedScroll(view, i11);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.isNestedScrollAccepted(i11)) {
                Behavior behavior = layoutParams.getBehavior();
                if (behavior != null) {
                    behavior.onStopNestedScroll(this, childAt, view, i11);
                }
                layoutParams.resetNestedScroll(i11);
                layoutParams.resetChangedAfterNestedScroll();
            }
        }
        this.mNestedScrollingTarget = null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:15:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0024, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zPerformIntercept;
        boolean zOnTouchEvent;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.mBehaviorTouchView == null) {
            zPerformIntercept = performIntercept(motionEvent, 1);
            if (!zPerformIntercept) {
                zOnTouchEvent = false;
            }
            motionEventObtain = null;
            if (this.mBehaviorTouchView == null) {
                zOnTouchEvent |= super.onTouchEvent(motionEvent);
            } else if (zPerformIntercept) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zOnTouchEvent;
            }
            resetTouchBehaviors(false);
            return zOnTouchEvent;
        }
        zPerformIntercept = false;
        Behavior behavior = ((LayoutParams) this.mBehaviorTouchView.getLayoutParams()).getBehavior();
        if (behavior != null) {
            zOnTouchEvent = behavior.onTouchEvent(this, this.mBehaviorTouchView, motionEvent);
        } else {
            zOnTouchEvent = false;
        }
        motionEventObtain = null;
        if (this.mBehaviorTouchView == null) {
            zOnTouchEvent |= super.onTouchEvent(motionEvent);
        } else if (zPerformIntercept) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        resetTouchBehaviors(false);
        return zOnTouchEvent;
    }

    public void removePreDrawListener() {
        if (this.mIsAttachedToWindow && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = false;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.mStatusBarBackground = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.mStatusBarBackground.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.mStatusBarBackground, ViewCompat.getLayoutDirection(this));
                this.mStatusBarBackground.setVisible(getVisibility() == 0, false);
                this.mStatusBarBackground.setCallback(this);
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void setStatusBarBackgroundColor(@ColorInt int i11) {
        setStatusBarBackground(new ColorDrawable(i11));
    }

    public void setStatusBarBackgroundResource(@DrawableRes int i11) {
        setStatusBarBackground(i11 != 0 ? ContextCompat.getDrawable(getContext(), i11) : null);
    }

    public final WindowInsetsCompat setWindowInsets(WindowInsetsCompat windowInsetsCompat) {
        if (ObjectsCompat.equals(this.mLastInsets, windowInsetsCompat)) {
            return windowInsetsCompat;
        }
        this.mLastInsets = windowInsetsCompat;
        boolean z11 = false;
        boolean z12 = windowInsetsCompat != null && windowInsetsCompat.getSystemWindowInsetTop() > 0;
        this.mDrawStatusBarBackground = z12;
        if (!z12 && getBackground() == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        WindowInsetsCompat windowInsetsCompatDispatchApplyWindowInsetsToBehaviors = dispatchApplyWindowInsetsToBehaviors(windowInsetsCompat);
        requestLayout();
        return windowInsetsCompatDispatchApplyWindowInsetsToBehaviors;
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11) {
        TypedArray typedArrayObtainStyledAttributes;
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i11);
        this.mDependencySortedChildren = new ArrayList();
        this.mChildDag = new DirectedAcyclicGraph<>();
        this.mTempList1 = new ArrayList();
        this.mTempDependenciesList = new ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mNestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        if (i11 == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1529R.styleable.CoordinatorLayout, 0, C1529R.style.Widget_Support_CoordinatorLayout);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1529R.styleable.CoordinatorLayout, i11, 0);
        }
        TypedArray typedArray = typedArrayObtainStyledAttributes;
        if (Build.VERSION.SDK_INT < 29) {
            coordinatorLayout = this;
            context2 = context;
        } else if (i11 == 0) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, C1529R.styleable.CoordinatorLayout, attributeSet, typedArray, 0, C1529R.style.Widget_Support_CoordinatorLayout);
        } else {
            context2 = context;
            coordinatorLayout = this;
            coordinatorLayout.saveAttributeDataForStyleable(context2, C1529R.styleable.CoordinatorLayout, attributeSet, typedArray, i11, 0);
        }
        int resourceId = typedArray.getResourceId(C1529R.styleable.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.mKeylines = resources.getIntArray(resourceId);
            float f11 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.mKeylines.length;
            for (int i12 = 0; i12 < length; i12++) {
                int[] iArr = coordinatorLayout.mKeylines;
                iArr[i12] = (int) (iArr[i12] * f11);
            }
        }
        coordinatorLayout.mStatusBarBackground = typedArray.getDrawable(C1529R.styleable.CoordinatorLayout_statusBarBackground);
        typedArray.recycle();
        setupForInsets();
        super.setOnHierarchyChangeListener(new HierarchyChangeListener());
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
    }

    private void constrainChildRect(LayoutParams layoutParams, Rect rect, int i11, int i12) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i11) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i12) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
        rect.set(iMax, iMax2, i11 + iMax, i12 + iMax2);
    }

    private WindowInsetsCompat dispatchApplyWindowInsetsToBehaviors(WindowInsetsCompat windowInsetsCompat) {
        Behavior behavior;
        if (windowInsetsCompat.isConsumed()) {
            return windowInsetsCompat;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (ViewCompat.getFitsSystemWindows(childAt) && (behavior = ((LayoutParams) childAt.getLayoutParams()).getBehavior()) != null) {
                windowInsetsCompat = behavior.onApplyWindowInsets(this, childAt, windowInsetsCompat);
                if (windowInsetsCompat.isConsumed()) {
                    return windowInsetsCompat;
                }
            }
        }
        return windowInsetsCompat;
    }

    private void getTopSortedChildren(List<View> list) {
        int childDrawingOrder;
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            if (zIsChildrenDrawingOrderEnabled) {
                childDrawingOrder = getChildDrawingOrder(childCount, i11);
            } else {
                childDrawingOrder = i11;
            }
            list.add(getChildAt(childDrawingOrder));
        }
        Comparator<View> comparator = TOP_SORTED_CHILDREN_COMPARATOR;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private void layoutChild(View view, int i11) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rectAcquireTempRect = acquireTempRect();
        rectAcquireTempRect.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        if (this.mLastInsets != null && ViewCompat.getFitsSystemWindows(this) && !ViewCompat.getFitsSystemWindows(view)) {
            rectAcquireTempRect.left += this.mLastInsets.getSystemWindowInsetLeft();
            rectAcquireTempRect.top += this.mLastInsets.getSystemWindowInsetTop();
            rectAcquireTempRect.right -= this.mLastInsets.getSystemWindowInsetRight();
            rectAcquireTempRect.bottom -= this.mLastInsets.getSystemWindowInsetBottom();
        }
        Rect rectAcquireTempRect2 = acquireTempRect();
        GravityCompat.apply(resolveGravity(layoutParams.gravity), view.getMeasuredWidth(), view.getMeasuredHeight(), rectAcquireTempRect, rectAcquireTempRect2, i11);
        view.layout(rectAcquireTempRect2.left, rectAcquireTempRect2.top, rectAcquireTempRect2.right, rectAcquireTempRect2.bottom);
        releaseTempRect(rectAcquireTempRect);
        releaseTempRect(rectAcquireTempRect2);
    }

    private void layoutChildWithAnchor(View view, View view2, int i11) {
        Rect rectAcquireTempRect = acquireTempRect();
        Rect rectAcquireTempRect2 = acquireTempRect();
        try {
            getDescendantRect(view2, rectAcquireTempRect);
            getDesiredAnchoredChildRect(view, i11, rectAcquireTempRect, rectAcquireTempRect2);
            view.layout(rectAcquireTempRect2.left, rectAcquireTempRect2.top, rectAcquireTempRect2.right, rectAcquireTempRect2.bottom);
        } finally {
            releaseTempRect(rectAcquireTempRect);
            releaseTempRect(rectAcquireTempRect2);
        }
    }

    private void layoutChildWithKeyline(View view, int i11, int i12) {
        int i13;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int absoluteGravity = GravityCompat.getAbsoluteGravity(resolveKeylineGravity(layoutParams.gravity), i12);
        int i14 = absoluteGravity & 7;
        int i15 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i12 == 1) {
            i11 = width - i11;
        }
        int keyline = getKeyline(i11) - measuredWidth;
        if (i14 != 1) {
            if (i14 == 5) {
                keyline += measuredWidth;
            }
        } else {
            keyline += measuredWidth / 2;
        }
        if (i15 != 16) {
            if (i15 != 80) {
                i13 = 0;
            } else {
                i13 = measuredHeight;
            }
        } else {
            i13 = measuredHeight / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, Math.min(keyline, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, Math.min(i13, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private void offsetChildByInset(View view, Rect rect, int i11) {
        boolean z11;
        boolean z12;
        int width;
        int i12;
        int i13;
        int i14;
        int height;
        int i15;
        int i16;
        int i17;
        if (ViewCompat.isLaidOut(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Behavior behavior = layoutParams.getBehavior();
            Rect rectAcquireTempRect = acquireTempRect();
            Rect rectAcquireTempRect2 = acquireTempRect();
            rectAcquireTempRect2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (behavior != null && behavior.getInsetDodgeRect(this, view, rectAcquireTempRect)) {
                if (!rectAcquireTempRect2.contains(rectAcquireTempRect)) {
                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectAcquireTempRect.toShortString() + " | Bounds:" + rectAcquireTempRect2.toShortString());
                }
            } else {
                rectAcquireTempRect.set(rectAcquireTempRect2);
            }
            releaseTempRect(rectAcquireTempRect2);
            if (rectAcquireTempRect.isEmpty()) {
                releaseTempRect(rectAcquireTempRect);
                return;
            }
            int absoluteGravity = GravityCompat.getAbsoluteGravity(layoutParams.dodgeInsetEdges, i11);
            boolean z13 = true;
            if ((absoluteGravity & 48) == 48 && (i16 = (rectAcquireTempRect.top - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - layoutParams.mInsetOffsetY) < (i17 = rect.top)) {
                setInsetOffsetY(view, i17 - i16);
                z11 = true;
            } else {
                z11 = false;
            }
            if ((absoluteGravity & 80) == 80 && (height = ((getHeight() - rectAcquireTempRect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) + layoutParams.mInsetOffsetY) < (i15 = rect.bottom)) {
                setInsetOffsetY(view, height - i15);
                z11 = true;
            }
            if (!z11) {
                setInsetOffsetY(view, 0);
            }
            if ((absoluteGravity & 3) == 3 && (i13 = (rectAcquireTempRect.left - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - layoutParams.mInsetOffsetX) < (i14 = rect.left)) {
                setInsetOffsetX(view, i14 - i13);
                z12 = true;
            } else {
                z12 = false;
            }
            if ((absoluteGravity & 5) == 5 && (width = ((getWidth() - rectAcquireTempRect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + layoutParams.mInsetOffsetX) < (i12 = rect.right)) {
                setInsetOffsetX(view, width - i12);
            } else {
                z13 = z12;
            }
            if (!z13) {
                setInsetOffsetX(view, 0);
            }
            releaseTempRect(rectAcquireTempRect);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Behavior parseBehavior(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(C33978va.f72339h)) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = WIDGET_PACKAGE_NAME;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<Behavior>>> threadLocal = sConstructors;
            Map<String, Constructor<Behavior>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<Behavior> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e11) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e11);
        }
    }

    private static void releaseTempRect(@NonNull Rect rect) {
        rect.setEmpty();
        sRectPool.release(rect);
    }

    private void resetTouchBehaviors(boolean z11) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            Behavior behavior = ((LayoutParams) childAt.getLayoutParams()).getBehavior();
            if (behavior != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z11) {
                    behavior.onInterceptTouchEvent(this, childAt, motionEventObtain);
                } else {
                    behavior.onTouchEvent(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            ((LayoutParams) getChildAt(i12).getLayoutParams()).resetTouchBehaviorTracking();
        }
        this.mBehaviorTouchView = null;
        this.mDisallowInterceptReset = false;
    }

    private void setInsetOffsetX(View view, int i11) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i12 = layoutParams.mInsetOffsetX;
        if (i12 != i11) {
            ViewCompat.offsetLeftAndRight(view, i11 - i12);
            layoutParams.mInsetOffsetX = i11;
        }
    }

    private void setInsetOffsetY(View view, int i11) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i12 = layoutParams.mInsetOffsetY;
        if (i12 != i11) {
            ViewCompat.offsetTopAndBottom(view, i11 - i12);
            layoutParams.mInsetOffsetY = i11;
        }
    }

    private void setupForInsets() {
        if (ViewCompat.getFitsSystemWindows(this)) {
            if (this.mApplyWindowInsetsListener == null) {
                this.mApplyWindowInsetsListener = new OnApplyWindowInsetsListener() { // from class: androidx.coordinatorlayout.widget.CoordinatorLayout.1
                    @Override // androidx.core.view.OnApplyWindowInsetsListener
                    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                        return CoordinatorLayout.this.setWindowInsets(windowInsetsCompat);
                    }
                };
            }
            ViewCompat.setOnApplyWindowInsetsListener(this, this.mApplyWindowInsetsListener);
            setSystemUiVisibility(1280);
            return;
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, null);
    }

    public boolean doViewsOverlap(@NonNull View view, @NonNull View view2) {
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect rectAcquireTempRect = acquireTempRect();
        if (view.getParent() != this) {
            z11 = true;
        } else {
            z11 = false;
        }
        getChildRect(view, z11, rectAcquireTempRect);
        Rect rectAcquireTempRect2 = acquireTempRect();
        if (view2.getParent() != this) {
            z12 = true;
        } else {
            z12 = false;
        }
        getChildRect(view2, z12, rectAcquireTempRect2);
        try {
            if (rectAcquireTempRect.left <= rectAcquireTempRect2.right && rectAcquireTempRect.top <= rectAcquireTempRect2.bottom && rectAcquireTempRect.right >= rectAcquireTempRect2.left && rectAcquireTempRect.bottom >= rectAcquireTempRect2.top) {
                z13 = true;
            }
            return z13;
        } finally {
            releaseTempRect(rectAcquireTempRect);
            releaseTempRect(rectAcquireTempRect2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        boolean state;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mStatusBarBackground;
        if (drawable != null && drawable.isStateful()) {
            state = drawable.setState(drawableState);
        } else {
            state = false;
        }
        if (state) {
            invalidate();
        }
    }

    public void ensurePreDrawListener() {
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            if (hasDependencies(getChildAt(i11))) {
                z11 = true;
                break;
            }
        }
        if (z11 != this.mNeedsPreDrawListener) {
            if (z11) {
                addPreDrawListener();
            } else {
                removePreDrawListener();
            }
        }
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void getChildRect(View view, boolean z11, Rect rect) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z11) {
                getDescendantRect(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    @VisibleForTesting
    public final List<View> getDependencySortedChildren() {
        prepareChildren();
        return Collections.unmodifiableList(this.mDependencySortedChildren);
    }

    public void getDescendantRect(View view, Rect rect) {
        ViewGroupUtils.getDescendantRect(this, view, rect);
    }

    public void getDesiredAnchoredChildRect(View view, int i11, Rect rect, Rect rect2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        getDesiredAnchoredChildRectWithoutConstraints(view, i11, rect, rect2, layoutParams, measuredWidth, measuredHeight);
        constrainChildRect(layoutParams, rect2, measuredWidth, measuredHeight);
    }

    public void getLastChildRect(View view, Rect rect) {
        rect.set(((LayoutParams) view.getLayoutParams()).getLastChildRect());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutParams getResolvedLayoutParams(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.mBehaviorResolved) {
            if (view instanceof AttachedBehavior) {
                Behavior behavior = ((AttachedBehavior) view).getBehavior();
                if (behavior == null) {
                    Log.e(TAG, "Attached behavior class is null");
                }
                layoutParams.setBehavior(behavior);
                layoutParams.mBehaviorResolved = true;
                return layoutParams;
            }
            DefaultBehavior defaultBehavior = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                defaultBehavior = (DefaultBehavior) superclass.getAnnotation(DefaultBehavior.class);
                if (defaultBehavior != null) {
                    break;
                }
            }
            if (defaultBehavior != null) {
                try {
                    layoutParams.setBehavior(defaultBehavior.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Exception e11) {
                    Log.e(TAG, "Default behavior class " + defaultBehavior.value().getName() + " could not be instantiated. Did you forget a default constructor?", e11);
                }
            }
            layoutParams.mBehaviorResolved = true;
        }
        return layoutParams;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public boolean isPointInChildBounds(@NonNull View view, int i11, int i12) {
        Rect rectAcquireTempRect = acquireTempRect();
        getDescendantRect(view, rectAcquireTempRect);
        try {
            return rectAcquireTempRect.contains(i11, i12);
        } finally {
            releaseTempRect(rectAcquireTempRect);
        }
    }

    public void offsetChildToAnchor(View view, int i11) {
        Behavior behavior;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.mAnchorView != null) {
            Rect rectAcquireTempRect = acquireTempRect();
            Rect rectAcquireTempRect2 = acquireTempRect();
            Rect rectAcquireTempRect3 = acquireTempRect();
            getDescendantRect(layoutParams.mAnchorView, rectAcquireTempRect);
            boolean z11 = false;
            getChildRect(view, false, rectAcquireTempRect2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            getDesiredAnchoredChildRectWithoutConstraints(view, i11, rectAcquireTempRect, rectAcquireTempRect3, layoutParams, measuredWidth, measuredHeight);
            if (rectAcquireTempRect3.left != rectAcquireTempRect2.left || rectAcquireTempRect3.top != rectAcquireTempRect2.top) {
                z11 = true;
            }
            constrainChildRect(layoutParams, rectAcquireTempRect3, measuredWidth, measuredHeight);
            int i12 = rectAcquireTempRect3.left - rectAcquireTempRect2.left;
            int i13 = rectAcquireTempRect3.top - rectAcquireTempRect2.top;
            if (i12 != 0) {
                ViewCompat.offsetLeftAndRight(view, i12);
            }
            if (i13 != 0) {
                ViewCompat.offsetTopAndBottom(view, i13);
            }
            if (z11 && (behavior = layoutParams.getBehavior()) != null) {
                behavior.onDependentViewChanged(this, view, layoutParams.mAnchorView);
            }
            releaseTempRect(rectAcquireTempRect);
            releaseTempRect(rectAcquireTempRect2);
            releaseTempRect(rectAcquireTempRect3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new OnPreDrawListener();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null && ViewCompat.getFitsSystemWindows(this)) {
            ViewCompat.requestApplyInsets(this);
        }
        this.mIsAttachedToWindow = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        View view = this.mNestedScrollingTarget;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.mIsAttachedToWindow = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int systemWindowInsetTop;
        super.onDraw(canvas);
        if (this.mDrawStatusBarBackground && this.mStatusBarBackground != null) {
            WindowInsetsCompat windowInsetsCompat = this.mLastInsets;
            if (windowInsetsCompat != null) {
                systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
            } else {
                systemWindowInsetTop = 0;
            }
            if (systemWindowInsetTop > 0) {
                this.mStatusBarBackground.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.mStatusBarBackground.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetTouchBehaviors(true);
        }
        boolean zPerformIntercept = performIntercept(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zPerformIntercept;
        }
        resetTouchBehaviors(true);
        return zPerformIntercept;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        Behavior behavior;
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int size = this.mDependencySortedChildren.size();
        for (int i15 = 0; i15 < size; i15++) {
            View view = this.mDependencySortedChildren.get(i15);
            if (view.getVisibility() != 8 && ((behavior = ((LayoutParams) view.getLayoutParams()).getBehavior()) == null || !behavior.onLayoutChild(this, view, layoutDirection))) {
                onLayoutChild(view, layoutDirection);
            }
        }
    }

    public void onLayoutChild(@NonNull View view, int i11) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.checkAnchorChanged()) {
            View view2 = layoutParams.mAnchorView;
            if (view2 != null) {
                layoutChildWithAnchor(view, view2, i11);
                return;
            }
            int i12 = layoutParams.keyline;
            if (i12 >= 0) {
                layoutChildWithKeyline(view, i12, i11);
                return;
            } else {
                layoutChild(view, i11);
                return;
            }
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    public void onMeasureChild(View view, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        Behavior behavior;
        View view2;
        float f13;
        float f14;
        boolean z12;
        int childCount = getChildCount();
        int i11 = 0;
        boolean zOnNestedFling = false;
        while (i11 < childCount) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f13 = f11;
                f14 = f12;
                z12 = z11;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (!layoutParams.isNestedScrollAccepted(0) || (behavior = layoutParams.getBehavior()) == null) {
                    view2 = view;
                    f13 = f11;
                    f14 = f12;
                    z12 = z11;
                } else {
                    view2 = view;
                    f13 = f11;
                    f14 = f12;
                    z12 = z11;
                    zOnNestedFling |= behavior.onNestedFling(this, childAt, view2, f13, f14, z12);
                }
            }
            i11++;
            view = view2;
            f11 = f13;
            f12 = f14;
            z11 = z12;
        }
        if (zOnNestedFling) {
            onChildViewsChanged(1);
        }
        return zOnNestedFling;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f11, float f12) {
        Behavior behavior;
        View view2;
        float f13;
        float f14;
        int childCount = getChildCount();
        int i11 = 0;
        boolean zOnNestedPreFling = false;
        while (i11 < childCount) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f13 = f11;
                f14 = f12;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (!layoutParams.isNestedScrollAccepted(0) || (behavior = layoutParams.getBehavior()) == null) {
                    view2 = view;
                    f13 = f11;
                    f14 = f12;
                } else {
                    view2 = view;
                    f13 = f11;
                    f14 = f12;
                    zOnNestedPreFling |= behavior.onNestedPreFling(this, childAt, view2, f13, f14);
                }
            }
            i11++;
            view = view2;
            f11 = f13;
            f12 = f14;
        }
        return zOnNestedPreFling;
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NonNull View view, int i11, int i12, int i13, int i14, int i15, @NonNull int[] iArr) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z11 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isNestedScrollAccepted(i15) && (behavior = layoutParams.getBehavior()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedScroll(this, childAt, view, i11, i12, i13, i14, i15, iArr2);
                    int[] iArr3 = this.mBehaviorConsumed;
                    iMax = i13 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    iMax2 = i14 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z11 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z11) {
            onChildViewsChanged(1);
        }
    }

    public void recordLastChildRect(View view, Rect rect) {
        ((LayoutParams) view.getLayoutParams()).setLastChildRect(rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z11) {
        Behavior behavior = ((LayoutParams) view.getLayoutParams()).getBehavior();
        if (behavior != null && behavior.onRequestChildRectangleOnScreen(this, view, rect, z11)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        super.requestDisallowInterceptTouchEvent(z11);
        if (z11 && !this.mDisallowInterceptReset) {
            resetTouchBehaviors(false);
            this.mDisallowInterceptReset = true;
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z11) {
        super.setFitsSystemWindows(z11);
        setupForInsets();
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        boolean z11;
        super.setVisibility(i11);
        if (i11 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Drawable drawable = this.mStatusBarBackground;
        if (drawable != null && drawable.isVisible() != z11) {
            this.mStatusBarBackground.setVisible(z11, false);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.mStatusBarBackground) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }
}
