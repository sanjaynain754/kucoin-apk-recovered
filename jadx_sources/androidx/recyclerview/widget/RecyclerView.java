package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.TraceCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild2;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.EdgeEffectCompat;
import androidx.customview.poolingcontainer.PoolingContainer;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.C3908R;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33978va;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, NestedScrollingChild2, NestedScrollingChild3 {
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final StretchEdgeEffectFactory sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    RecyclerViewAccessibilityDelegate mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    Adapter mAdapter;
    AdapterHelper mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private ChildDrawingOrderCallback mChildDrawingOrderCallback;
    ChildHelper mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;

    @NonNull
    private EdgeEffectFactory mEdgeEffectFactory;
    boolean mEnableFastScroller;

    @VisibleForTesting
    boolean mFirstLayoutComplete;
    GapWorker mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private OnItemTouchListener mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    ItemAnimator mItemAnimator;
    private ItemAnimator.ItemAnimatorListener mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<ItemDecoration> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;

    @VisibleForTesting
    LayoutManager mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final RecyclerViewDataObserver mObserver;
    private List<OnChildAttachStateChangeListener> mOnChildAttachStateListeners;
    private OnFlingListener mOnFlingListener;
    private final ArrayList<OnItemTouchListener> mOnItemTouchListeners;

    @VisibleForTesting
    final List<ViewHolder> mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    GapWorker.LayoutPrefetchRegistryImpl mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final Recycler mRecycler;
    RecyclerListener mRecyclerListener;
    final List<RecyclerListener> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private OnScrollListener mScrollListener;
    private List<OnScrollListener> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private NestedScrollingChildHelper mScrollingChildHelper;
    final State mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final ViewFlinger mViewFlinger;
    private final ViewInfoStore.ProcessCallback mViewInfoProcessCallback;
    final ViewInfoStore mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    public static abstract class Adapter<VH extends ViewHolder> {
        private final AdapterDataObservable mObservable = new AdapterDataObservable();
        private boolean mHasStableIds = false;
        private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.ALLOW;

        public enum StateRestorationPolicy {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public abstract int getItemCount();

        public int getItemViewType(int i11) {
            return 0;
        }

        public final void notifyItemChanged(int i11) {
            this.mObservable.notifyItemRangeChanged(i11, 1);
        }

        public final void notifyItemRangeChanged(int i11, int i12) {
            this.mObservable.notifyItemRangeChanged(i11, i12);
        }

        public abstract void onBindViewHolder(@NonNull VH vh2, int i11);

        public void onBindViewHolder(@NonNull VH vh2, int i11, @NonNull List<Object> list) {
            onBindViewHolder(vh2, i11);
        }

        @NonNull
        public abstract VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i11);

        public boolean onFailedToRecycleView(@NonNull VH vh2) {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void bindViewHolder(@NonNull VH vh2, int i11) {
            boolean z11 = vh2.mBindingAdapter == null;
            if (z11) {
                vh2.mPosition = i11;
                if (hasStableIds()) {
                    vh2.mItemId = getItemId(i11);
                }
                vh2.setFlags(1, 519);
                TraceCompat.beginSection(RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh2.mBindingAdapter = this;
            onBindViewHolder(vh2, i11, vh2.getUnmodifiedPayloads());
            if (z11) {
                vh2.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh2.itemView.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    ((LayoutParams) layoutParams).mInsetsDirty = true;
                }
                TraceCompat.endSection();
            }
        }

        public boolean canRestoreState() {
            int i11 = C39467.f3611x3d106619[this.mStateRestorationPolicy.ordinal()];
            return i11 != 1 && (i11 != 2 || getItemCount() > 0);
        }

        @NonNull
        public final VH createViewHolder(@NonNull ViewGroup viewGroup, int i11) {
            try {
                TraceCompat.beginSection(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH vh2 = (VH) onCreateViewHolder(viewGroup, i11);
                if (vh2.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh2.mItemViewType = i11;
                TraceCompat.endSection();
                return vh2;
            } catch (Throwable th2) {
                TraceCompat.endSection();
                throw th2;
            }
        }

        public int findRelativeAdapterPositionIn(@NonNull Adapter<? extends ViewHolder> adapter, @NonNull ViewHolder viewHolder, int i11) {
            if (adapter == this) {
                return i11;
            }
            return -1;
        }

        public long getItemId(int i11) {
            return -1L;
        }

        @NonNull
        public final StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.hasObservers();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.notifyChanged();
        }

        public final void notifyItemChanged(int i11, @Nullable Object obj) {
            this.mObservable.notifyItemRangeChanged(i11, 1, obj);
        }

        public final void notifyItemInserted(int i11) {
            this.mObservable.notifyItemRangeInserted(i11, 1);
        }

        public final void notifyItemMoved(int i11, int i12) {
            this.mObservable.notifyItemMoved(i11, i12);
        }

        public final void notifyItemRangeChanged(int i11, int i12, @Nullable Object obj) {
            this.mObservable.notifyItemRangeChanged(i11, i12, obj);
        }

        public final void notifyItemRangeInserted(int i11, int i12) {
            this.mObservable.notifyItemRangeInserted(i11, i12);
        }

        public final void notifyItemRangeRemoved(int i11, int i12) {
            this.mObservable.notifyItemRangeRemoved(i11, i12);
        }

        public final void notifyItemRemoved(int i11) {
            this.mObservable.notifyItemRangeRemoved(i11, 1);
        }

        public void registerAdapterDataObserver(@NonNull AdapterDataObserver adapterDataObserver) {
            this.mObservable.registerObserver(adapterDataObserver);
        }

        public void setStateRestorationPolicy(@NonNull StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.notifyStateRestorationPolicyChanged();
        }

        public void unregisterAdapterDataObserver(@NonNull AdapterDataObserver adapterDataObserver) {
            this.mObservable.unregisterObserver(adapterDataObserver);
        }

        public void setHasStableIds(boolean z11) {
            if (!hasObservers()) {
                this.mHasStableIds = z11;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public void onViewAttachedToWindow(@NonNull VH vh2) {
        }

        public void onViewDetachedFromWindow(@NonNull VH vh2) {
        }

        public void onViewRecycled(@NonNull VH vh2) {
        }
    }

    public static class AdapterDataObservable extends Observable<AdapterDataObserver> {
        public void notifyItemRangeChanged(int i11, int i12) {
            notifyItemRangeChanged(i11, i12, null);
        }

        public boolean hasObservers() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void notifyChanged() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        public void notifyItemMoved(int i11, int i12) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i11, i12, 1);
            }
        }

        public void notifyItemRangeChanged(int i11, int i12, @Nullable Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i11, i12, obj);
            }
        }

        public void notifyItemRangeInserted(int i11, int i12) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i11, i12);
            }
        }

        public void notifyItemRangeRemoved(int i11, int i12) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i11, i12);
            }
        }

        public void notifyStateRestorationPolicyChanged() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }
    }

    public static abstract class AdapterDataObserver {
        public void onItemRangeChanged(int i11, int i12) {
        }

        public void onItemRangeChanged(int i11, int i12, @Nullable Object obj) {
            onItemRangeChanged(i11, i12);
        }

        public void onChanged() {
        }

        public void onStateRestorationPolicyChanged() {
        }

        public void onItemRangeInserted(int i11, int i12) {
        }

        public void onItemRangeRemoved(int i11, int i12) {
        }

        public void onItemRangeMoved(int i11, int i12, int i13) {
        }
    }

    public interface ChildDrawingOrderCallback {
        int onGetChildDrawingOrder(int i11, int i12);
    }

    public static class EdgeEffectFactory {
        public static final int DIRECTION_BOTTOM = 3;
        public static final int DIRECTION_LEFT = 0;
        public static final int DIRECTION_RIGHT = 2;
        public static final int DIRECTION_TOP = 1;

        /* JADX INFO: loaded from: classes34.dex */
        @Retention(RetentionPolicy.SOURCE)
        public @interface EdgeDirection {
        }

        @NonNull
        public EdgeEffect createEdgeEffect(@NonNull RecyclerView recyclerView, int i11) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class ItemAnimator {
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_REMOVED = 8;
        private ItemAnimatorListener mListener = null;
        private ArrayList<ItemAnimatorFinishedListener> mFinishedListeners = new ArrayList<>();
        private long mAddDuration = 120;
        private long mRemoveDuration = 120;
        private long mMoveDuration = 250;
        private long mChangeDuration = 250;

        /* JADX INFO: loaded from: classes34.dex */
        @Retention(RetentionPolicy.SOURCE)
        public @interface AdapterChanges {
        }

        /* JADX INFO: loaded from: classes34.dex */
        public interface ItemAnimatorFinishedListener {
            void onAnimationsFinished();
        }

        public interface ItemAnimatorListener {
            void onAnimationFinished(@NonNull ViewHolder viewHolder);
        }

        public static class ItemHolderInfo {
            public int bottom;
            public int changeFlags;
            public int left;
            public int right;
            public int top;

            @NonNull
            public ItemHolderInfo setFrom(@NonNull ViewHolder viewHolder) {
                return setFrom(viewHolder, 0);
            }

            @NonNull
            public ItemHolderInfo setFrom(@NonNull ViewHolder viewHolder, int i11) {
                View view = viewHolder.itemView;
                this.left = view.getLeft();
                this.top = view.getTop();
                this.right = view.getRight();
                this.bottom = view.getBottom();
                return this;
            }
        }

        public abstract boolean animateAppearance(@NonNull ViewHolder viewHolder, @Nullable ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2);

        public abstract boolean animateChange(@NonNull ViewHolder viewHolder, @NonNull ViewHolder viewHolder2, @NonNull ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2);

        public abstract boolean animateDisappearance(@NonNull ViewHolder viewHolder, @NonNull ItemHolderInfo itemHolderInfo, @Nullable ItemHolderInfo itemHolderInfo2);

        public abstract boolean animatePersistence(@NonNull ViewHolder viewHolder, @NonNull ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2);

        public boolean canReuseUpdatedViewHolder(@NonNull ViewHolder viewHolder) {
            return true;
        }

        public abstract void endAnimation(@NonNull ViewHolder viewHolder);

        public abstract void endAnimations();

        public abstract boolean isRunning();

        public final boolean isRunning(@Nullable ItemAnimatorFinishedListener itemAnimatorFinishedListener) {
            boolean zIsRunning = isRunning();
            if (itemAnimatorFinishedListener != null) {
                if (!zIsRunning) {
                    itemAnimatorFinishedListener.onAnimationsFinished();
                    return zIsRunning;
                }
                this.mFinishedListeners.add(itemAnimatorFinishedListener);
            }
            return zIsRunning;
        }

        public abstract void runPendingAnimations();

        public static int buildAdapterChangeFlagsForAnimations(ViewHolder viewHolder) {
            int i11 = viewHolder.mFlags;
            int i12 = i11 & 14;
            if (viewHolder.isInvalid()) {
                return 4;
            }
            if ((i11 & 4) == 0) {
                int oldPosition = viewHolder.getOldPosition();
                int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
                if (oldPosition != -1 && absoluteAdapterPosition != -1 && oldPosition != absoluteAdapterPosition) {
                    return i12 | 2048;
                }
            }
            return i12;
        }

        public boolean canReuseUpdatedViewHolder(@NonNull ViewHolder viewHolder, @NonNull List<Object> list) {
            return canReuseUpdatedViewHolder(viewHolder);
        }

        public final void dispatchAnimationsFinished() {
            int size = this.mFinishedListeners.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.mFinishedListeners.get(i11).onAnimationsFinished();
            }
            this.mFinishedListeners.clear();
        }

        public long getAddDuration() {
            return this.mAddDuration;
        }

        public long getChangeDuration() {
            return this.mChangeDuration;
        }

        public long getMoveDuration() {
            return this.mMoveDuration;
        }

        public long getRemoveDuration() {
            return this.mRemoveDuration;
        }

        @NonNull
        public ItemHolderInfo obtainHolderInfo() {
            return new ItemHolderInfo();
        }

        public void setAddDuration(long j11) {
            this.mAddDuration = j11;
        }

        public void setChangeDuration(long j11) {
            this.mChangeDuration = j11;
        }

        public void setListener(ItemAnimatorListener itemAnimatorListener) {
            this.mListener = itemAnimatorListener;
        }

        public void setMoveDuration(long j11) {
            this.mMoveDuration = j11;
        }

        public void setRemoveDuration(long j11) {
            this.mRemoveDuration = j11;
        }

        public final void dispatchAnimationFinished(@NonNull ViewHolder viewHolder) {
            onAnimationFinished(viewHolder);
            ItemAnimatorListener itemAnimatorListener = this.mListener;
            if (itemAnimatorListener != null) {
                itemAnimatorListener.onAnimationFinished(viewHolder);
            }
        }

        public final void dispatchAnimationStarted(@NonNull ViewHolder viewHolder) {
            onAnimationStarted(viewHolder);
        }

        @NonNull
        public ItemHolderInfo recordPostLayoutInformation(@NonNull State state, @NonNull ViewHolder viewHolder) {
            return obtainHolderInfo().setFrom(viewHolder);
        }

        @NonNull
        public ItemHolderInfo recordPreLayoutInformation(@NonNull State state, @NonNull ViewHolder viewHolder, int i11, @NonNull List<Object> list) {
            return obtainHolderInfo().setFrom(viewHolder);
        }

        public void onAnimationFinished(@NonNull ViewHolder viewHolder) {
        }

        public void onAnimationStarted(@NonNull ViewHolder viewHolder) {
        }
    }

    public class ItemAnimatorRestoreListener implements ItemAnimator.ItemAnimatorListener {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener
        public void onAnimationFinished(ViewHolder viewHolder) {
            viewHolder.setIsRecyclable(true);
            if (viewHolder.mShadowedHolder != null && viewHolder.mShadowingHolder == null) {
                viewHolder.mShadowedHolder = null;
            }
            viewHolder.mShadowingHolder = null;
            if (viewHolder.shouldBeKeptAsChild() || RecyclerView.this.removeAnimatingView(viewHolder.itemView) || !viewHolder.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(viewHolder.itemView, false);
        }

        public ItemAnimatorRestoreListener() {
        }
    }

    public static abstract class ItemDecoration {
        @Deprecated
        public void getItemOffsets(@NonNull Rect rect, int i11, @NonNull RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull State state) {
            getItemOffsets(rect, ((LayoutParams) view.getLayoutParams()).getViewLayoutPosition(), recyclerView);
        }

        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull State state) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull State state) {
            onDrawOver(canvas, recyclerView);
        }
    }

    public static abstract class LayoutManager {
        boolean mAutoMeasure;
        ChildHelper mChildHelper;
        private int mHeight;
        private int mHeightMode;
        ViewBoundsCheck mHorizontalBoundCheck;
        private final ViewBoundsCheck.Callback mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;

        @Nullable
        SmoothScroller mSmoothScroller;
        ViewBoundsCheck mVerticalBoundCheck;
        private final ViewBoundsCheck.Callback mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        public interface LayoutPrefetchRegistry {
            void addPosition(int i11, int i12);
        }

        public static class Properties {
            public int orientation;
            public boolean reverseLayout;
            public int spanCount;
            public boolean stackFromEnd;
        }

        /* JADX WARN: Code duplicated, block: B:5:0x000c A[PHI: r3
          0x000c: PHI (r3v5 int) = (r3v0 int), (r3v2 int), (r3v0 int) binds: [B:7:0x0010, B:11:0x0016, B:4:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:6:0x000e  */
        @Deprecated
        public static int getChildMeasureSpec(int i11, int i12, int i13, boolean z11) {
            int i14 = i11 - i12;
            int i15 = 0;
            int iMax = Math.max(0, i14);
            if (z11) {
                if (i13 >= 0) {
                    i15 = 1073741824;
                } else {
                    i13 = 0;
                }
            } else if (i13 >= 0) {
                i15 = 1073741824;
            } else if (i13 == -1) {
                i13 = iMax;
                i15 = 1073741824;
            } else if (i13 == -2) {
                i15 = Integer.MIN_VALUE;
                i13 = iMax;
            } else {
                i13 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i13, i15);
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view) {
            addView(view, -1);
        }

        public void attachView(@NonNull View view, int i11, LayoutParams layoutParams) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.addToDisappearedInLayout(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.removeFromDisappearedInLayout(childViewHolderInt);
            }
            this.mChildHelper.attachViewToParent(view, i11, layoutParams, childViewHolderInt.isRemoved());
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public int computeHorizontalScrollExtent(@NonNull State state) {
            return 0;
        }

        public int computeHorizontalScrollOffset(@NonNull State state) {
            return 0;
        }

        public int computeHorizontalScrollRange(@NonNull State state) {
            return 0;
        }

        public int computeVerticalScrollExtent(@NonNull State state) {
            return 0;
        }

        public int computeVerticalScrollOffset(@NonNull State state) {
            return 0;
        }

        public int computeVerticalScrollRange(@NonNull State state) {
            return 0;
        }

        public void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        public void dispatchDetachedFromWindow(RecyclerView recyclerView, Recycler recycler) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, recycler);
        }

        @SuppressLint({"UnknownNullness"})
        public abstract LayoutParams generateDefaultLayoutParams();

        @SuppressLint({"UnknownNullness"})
        public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof LayoutParams) {
                return new LayoutParams((LayoutParams) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getColumnCountForAccessibility(@NonNull Recycler recycler, @NonNull State state) {
            return -1;
        }

        public int getRowCountForAccessibility(@NonNull Recycler recycler, @NonNull State state) {
            return -1;
        }

        public int getSelectionModeForAccessibility(@NonNull Recycler recycler, @NonNull State state) {
            return 0;
        }

        public boolean isLayoutHierarchical(@NonNull Recycler recycler, @NonNull State state) {
            return false;
        }

        public boolean onAddFocusables(@NonNull RecyclerView recyclerView, @NonNull ArrayList<View> arrayList, int i11, int i12) {
            return false;
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        @Nullable
        public View onFocusSearchFailed(@NonNull View view, int i11, @NonNull Recycler recycler, @NonNull State state) {
            return null;
        }

        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, accessibilityNodeInfoCompat);
        }

        public void onInitializeAccessibilityNodeInfoForItem(@NonNull Recycler recycler, @NonNull State state, @NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        @Nullable
        public View onInterceptFocusSearch(@NonNull View view, int i11) {
            return null;
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i11, int i12) {
        }

        @Deprecated
        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull View view, @Nullable View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        @Nullable
        public Parcelable onSaveInstanceState() {
            return null;
        }

        public boolean performAccessibilityAction(int i11, @Nullable Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i11, bundle);
        }

        public boolean performAccessibilityActionForItem(@NonNull Recycler recycler, @NonNull State state, @NonNull View view, int i11, @Nullable Bundle bundle) {
            return false;
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z11) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z11, false);
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        @SuppressLint({"UnknownNullness"})
        public int scrollHorizontallyBy(int i11, Recycler recycler, State state) {
            return 0;
        }

        @SuppressLint({"UnknownNullness"})
        public int scrollVerticallyBy(int i11, Recycler recycler, State state) {
            return 0;
        }

        public void setMeasuredDimension(Rect rect, int i11, int i12) {
            setMeasuredDimension(chooseSize(i11, rect.width() + getPaddingLeft() + getPaddingRight(), getMinimumWidth()), chooseSize(i12, rect.height() + getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
        }

        public boolean shouldMeasureTwice() {
            return false;
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        private void detachViewInternal(int i11, @NonNull View view) {
            this.mChildHelper.detachViewFromParent(i11);
        }

        public static Properties getProperties(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
            Properties properties = new Properties();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3908R.styleable.RecyclerView, i11, i12);
            properties.orientation = typedArrayObtainStyledAttributes.getInt(C3908R.styleable.RecyclerView_android_orientation, 1);
            properties.spanCount = typedArrayObtainStyledAttributes.getInt(C3908R.styleable.RecyclerView_spanCount, 1);
            properties.reverseLayout = typedArrayObtainStyledAttributes.getBoolean(C3908R.styleable.RecyclerView_reverseLayout, false);
            properties.stackFromEnd = typedArrayObtainStyledAttributes.getBoolean(C3908R.styleable.RecyclerView_stackFromEnd, false);
            typedArrayObtainStyledAttributes.recycle();
            return properties;
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view, int i11) {
            addViewInt(view, i11, true);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view, int i11) {
            addViewInt(view, i11, false);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void calculateItemDecorationsForChild(@NonNull View view, @NonNull Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public boolean checkLayoutParams(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        public void detachAndScrapView(@NonNull View view, @NonNull Recycler recycler) {
            scrapOrRecycleView(recycler, this.mChildHelper.indexOfChild(view), view);
        }

        public void detachView(@NonNull View view) {
            int iIndexOfChild = this.mChildHelper.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                detachViewInternal(iIndexOfChild, view);
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void endAnimation(View view) {
            ItemAnimator itemAnimator = this.mRecyclerView.mItemAnimator;
            if (itemAnimator != null) {
                itemAnimator.endAnimation(RecyclerView.getChildViewHolderInt(view));
            }
        }

        @Nullable
        public View findContainingItemView(@NonNull View view) {
            View viewFindContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.isHidden(viewFindContainingItemView)) {
                return null;
            }
            return viewFindContainingItemView;
        }

        @Nullable
        public View getChildAt(int i11) {
            ChildHelper childHelper = this.mChildHelper;
            if (childHelper != null) {
                return childHelper.getChildAt(i11);
            }
            return null;
        }

        public int getChildCount() {
            ChildHelper childHelper = this.mChildHelper;
            if (childHelper != null) {
                return childHelper.getChildCount();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        @Nullable
        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.isHidden(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        @Px
        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getLayoutDirection() {
            return ViewCompat.getLayoutDirection(this.mRecyclerView);
        }

        @Px
        public int getMinimumHeight() {
            return ViewCompat.getMinimumHeight(this.mRecyclerView);
        }

        @Px
        public int getMinimumWidth() {
            return ViewCompat.getMinimumWidth(this.mRecyclerView);
        }

        @Px
        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        @Px
        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return ViewCompat.getPaddingEnd(recyclerView);
            }
            return 0;
        }

        @Px
        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        @Px
        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        @Px
        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return ViewCompat.getPaddingStart(recyclerView);
            }
            return 0;
        }

        @Px
        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public void getTransformedBoundingBox(@NonNull View view, boolean z11, @NonNull Rect rect) {
            Matrix matrix;
            if (z11) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).mDecorInsets;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        @Px
        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            SmoothScroller smoothScroller = this.mSmoothScroller;
            return smoothScroller != null && smoothScroller.isRunning();
        }

        public boolean isViewPartiallyVisible(@NonNull View view, boolean z11, boolean z12) {
            boolean z13 = this.mHorizontalBoundCheck.isViewWithinBoundFlags(view, 24579) && this.mVerticalBoundCheck.isViewWithinBoundFlags(view, 24579);
            return z11 ? z13 : !z13;
        }

        public void offsetChildrenHorizontal(@Px int i11) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i11);
            }
        }

        public void offsetChildrenVertical(@Px int i11) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i11);
            }
        }

        @SuppressLint({"UnknownNullness"})
        @CallSuper
        public void onDetachedFromWindow(RecyclerView recyclerView, Recycler recycler) {
            onDetachedFromWindow(recyclerView);
        }

        public void onInitializeAccessibilityEvent(@NonNull Recycler recycler, @NonNull State state, @NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z11 = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z11 = false;
            }
            accessibilityEvent.setScrollable(z11);
            Adapter adapter = this.mRecyclerView.mAdapter;
            if (adapter != null) {
                accessibilityEvent.setItemCount(adapter.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(@NonNull Recycler recycler, @NonNull State state, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.addAction(8192);
                accessibilityNodeInfoCompat.setScrollable(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
                accessibilityNodeInfoCompat.setScrollable(true);
            }
            accessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(getRowCountForAccessibility(recycler, state), getColumnCountForAccessibility(recycler, state), isLayoutHierarchical(recycler, state), getSelectionModeForAccessibility(recycler, state)));
        }

        public void onInitializeAccessibilityNodeInfoForItem(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved() || this.mChildHelper.isHidden(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, accessibilityNodeInfoCompat);
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i11, int i12, @Nullable Object obj) {
            onItemsUpdated(recyclerView, i11, i12);
        }

        @SuppressLint({"UnknownNullness"})
        public void onLayoutChildren(Recycler recycler, State state) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void onMeasure(@NonNull Recycler recycler, @NonNull State state, int i11, int i12) {
            this.mRecyclerView.defaultOnMeasure(i11, i12);
        }

        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull State state, @NonNull View view, @Nullable View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        public void onSmoothScrollerStopped(SmoothScroller smoothScroller) {
            if (this.mSmoothScroller == smoothScroller) {
                this.mSmoothScroller = null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0067 A[PHI: r9
          0x0067: PHI (r9v8 int) = (r9v5 int), (r9v11 int) binds: [B:29:0x0084, B:20:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
        public boolean performAccessibilityAction(@NonNull Recycler recycler, @NonNull State state, int i11, @Nullable Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            int i12;
            int i13;
            if (this.mRecyclerView == null) {
                return false;
            }
            int height = getHeight();
            int width = getWidth();
            Rect rect = new Rect();
            if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
                height = rect.height();
                width = rect.width();
            }
            if (i11 == 4096) {
                paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                    i12 = paddingTop;
                    i13 = paddingLeft;
                } else {
                    i12 = paddingTop;
                    i13 = 0;
                }
            } else if (i11 != 8192) {
                i13 = 0;
                i12 = 0;
            } else {
                paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                    i12 = paddingTop;
                    i13 = paddingLeft;
                } else {
                    i12 = paddingTop;
                    i13 = 0;
                }
            }
            if (i12 == 0 && i13 == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(i13, i12, null, Integer.MIN_VALUE, true);
            return true;
        }

        public boolean performAccessibilityActionForItem(@NonNull View view, int i11, @Nullable Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i11, bundle);
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                ViewCompat.postOnAnimation(recyclerView, runnable);
            }
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(@NonNull View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        @SuppressLint({"UnknownNullness"})
        public void removeView(View view) {
            this.mChildHelper.removeView(view);
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z11, boolean z12) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(view, rect);
            int i11 = childRectangleOnScreenScrollAmount[0];
            int i12 = childRectangleOnScreenScrollAmount[1];
            if ((z12 && !isFocusedChildVisibleAfterScrolling(recyclerView, i11, i12)) || (i11 == 0 && i12 == 0)) {
                return false;
            }
            if (z11) {
                recyclerView.scrollBy(i11, i12);
            } else {
                recyclerView.smoothScrollBy(i11, i12);
            }
            return true;
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z11) {
            this.mAutoMeasure = z11;
        }

        public final void setItemPrefetchEnabled(boolean z11) {
            if (z11 != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z11;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.updateViewCacheSize();
                }
            }
        }

        public void setMeasurementCacheEnabled(boolean z11) {
            this.mMeasurementCacheEnabled = z11;
        }

        public void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        public boolean shouldReMeasureChild(View view, int i11, int i12, LayoutParams layoutParams) {
            return (this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getMeasuredWidth(), i11, ((ViewGroup.MarginLayoutParams) layoutParams).width) && isMeasurementUpToDate(view.getMeasuredHeight(), i12, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        @SuppressLint({"UnknownNullness"})
        public void smoothScrollToPosition(RecyclerView recyclerView, State state, int i11) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        @SuppressLint({"UnknownNullness"})
        public void startSmoothScroll(SmoothScroller smoothScroller) {
            SmoothScroller smoothScroller2 = this.mSmoothScroller;
            if (smoothScroller2 != null && smoothScroller != smoothScroller2 && smoothScroller2.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = smoothScroller;
            smoothScroller.start(this.mRecyclerView, this);
        }

        public void stopSmoothScroller() {
            SmoothScroller smoothScroller = this.mSmoothScroller;
            if (smoothScroller != null) {
                smoothScroller.stop();
            }
        }

        public LayoutManager() {
            ViewBoundsCheck.Callback callback = new ViewBoundsCheck.Callback() { // from class: androidx.recyclerview.widget.RecyclerView.LayoutManager.1
                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public View getChildAt(int i11) {
                    return LayoutManager.this.getChildAt(i11);
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int getParentEnd() {
                    return LayoutManager.this.getWidth() - LayoutManager.this.getPaddingRight();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int getParentStart() {
                    return LayoutManager.this.getPaddingLeft();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int getChildEnd(View view) {
                    return LayoutManager.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).rightMargin;
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int getChildStart(View view) {
                    return LayoutManager.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).leftMargin;
                }
            };
            this.mHorizontalBoundCheckCallback = callback;
            ViewBoundsCheck.Callback callback2 = new ViewBoundsCheck.Callback() { // from class: androidx.recyclerview.widget.RecyclerView.LayoutManager.2
                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public View getChildAt(int i11) {
                    return LayoutManager.this.getChildAt(i11);
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int getParentEnd() {
                    return LayoutManager.this.getHeight() - LayoutManager.this.getPaddingBottom();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int getParentStart() {
                    return LayoutManager.this.getPaddingTop();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int getChildEnd(View view) {
                    return LayoutManager.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int getChildStart(View view) {
                    return LayoutManager.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).topMargin;
                }
            };
            this.mVerticalBoundCheckCallback = callback2;
            this.mHorizontalBoundCheck = new ViewBoundsCheck(callback);
            this.mVerticalBoundCheck = new ViewBoundsCheck(callback2);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        private void addViewInt(View view, int i11, boolean z11) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!z11 && !childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.removeFromDisappearedInLayout(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.addToDisappearedInLayout(childViewHolderInt);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (!childViewHolderInt.wasReturnedFromScrap() && !childViewHolderInt.isScrap()) {
                if (view.getParent() == this.mRecyclerView) {
                    int iIndexOfChild = this.mChildHelper.indexOfChild(view);
                    if (i11 == -1) {
                        i11 = this.mChildHelper.getChildCount();
                    }
                    if (iIndexOfChild != -1) {
                        if (iIndexOfChild != i11) {
                            this.mRecyclerView.mLayout.moveView(iIndexOfChild, i11);
                        }
                    } else {
                        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.exceptionLabel());
                    }
                } else {
                    this.mChildHelper.addView(view, i11, false);
                    layoutParams.mInsetsDirty = true;
                    SmoothScroller smoothScroller = this.mSmoothScroller;
                    if (smoothScroller != null && smoothScroller.isRunning()) {
                        this.mSmoothScroller.onChildAttachedToWindow(view);
                    }
                }
            } else {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.attachViewToParent(view, i11, view.getLayoutParams(), false);
            }
            if (layoutParams.mPendingInvalidate) {
                childViewHolderInt.itemView.invalidate();
                layoutParams.mPendingInvalidate = false;
            }
        }

        public static int chooseSize(int i11, int i12, int i13) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 1073741824) {
                    return Math.max(i12, i13);
                }
                return size;
            }
            return Math.min(size, Math.max(i12, i13));
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001a  */
        /* JADX WARN: Code duplicated, block: B:14:0x0022  */
        /* JADX WARN: Code duplicated, block: B:5:0x0010  */
        public static int getChildMeasureSpec(int i11, int i12, int i13, int i14, boolean z11) {
            int iMax = Math.max(0, i11 - i13);
            if (z11) {
                if (i14 >= 0) {
                    i12 = 1073741824;
                } else if (i14 != -1 || (i12 != Integer.MIN_VALUE && (i12 == 0 || i12 != 1073741824))) {
                    i12 = 0;
                    i14 = 0;
                } else {
                    i14 = iMax;
                }
            } else if (i14 >= 0) {
                i12 = 1073741824;
            } else if (i14 == -1) {
                i14 = iMax;
            } else if (i14 != -2) {
                i12 = 0;
                i14 = 0;
            } else if (i12 == Integer.MIN_VALUE || i12 == 1073741824) {
                i14 = iMax;
                i12 = Integer.MIN_VALUE;
            } else {
                i14 = iMax;
                i12 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i14, i12);
        }

        private int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i11 = left - paddingLeft;
            int iMin = Math.min(0, i11);
            int i12 = top - paddingTop;
            int iMin2 = Math.min(0, i12);
            int i13 = iWidth - width;
            int iMax = Math.max(0, i13);
            int iMax2 = Math.max(0, iHeight - height);
            if (getLayoutDirection() == 1) {
                if (iMax == 0) {
                    iMax = Math.max(iMin, i13);
                }
            } else {
                if (iMin == 0) {
                    iMin = Math.min(i11, iMax);
                }
                iMax = iMin;
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i12, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i11, int i12) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            if (rect.left - i11 >= width || rect.right - i11 <= paddingLeft || rect.top - i12 >= height || rect.bottom - i12 <= paddingTop) {
                return false;
            }
            return true;
        }

        private static boolean isMeasurementUpToDate(int i11, int i12, int i13) {
            int mode = View.MeasureSpec.getMode(i12);
            int size = View.MeasureSpec.getSize(i12);
            if (i13 > 0 && i11 != i13) {
                return false;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode != 1073741824 || size != i11) {
                    return false;
                }
                return true;
            }
            if (size < i11) {
                return false;
            }
            return true;
        }

        private void scrapOrRecycleView(Recycler recycler, int i11, View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i11);
                recycler.recycleViewHolderInternal(childViewHolderInt);
            } else {
                detachViewAt(i11);
                recycler.scrapView(view);
                this.mRecyclerView.mViewInfoStore.onViewDetached(childViewHolderInt);
            }
        }

        public void detachAndScrapAttachedViews(@NonNull Recycler recycler) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(recycler, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapViewAt(int i11, @NonNull Recycler recycler) {
            scrapOrRecycleView(recycler, i11, getChildAt(i11));
        }

        public void detachViewAt(int i11) {
            detachViewInternal(i11, getChildAt(i11));
        }

        @Nullable
        public View findViewByPosition(int i11) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i11 && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.isPreLayout() || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public int getBottomDecorationHeight(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).mDecorInsets.bottom;
        }

        public int getDecoratedBottom(@NonNull View view) {
            return view.getBottom() + getBottomDecorationHeight(view);
        }

        public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(@NonNull View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(@NonNull View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).mDecorInsets;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(@NonNull View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).mDecorInsets;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(@NonNull View view) {
            return view.getRight() + getRightDecorationWidth(view);
        }

        public int getDecoratedTop(@NonNull View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public int getItemViewType(@NonNull View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public int getLeftDecorationWidth(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).mDecorInsets.left;
        }

        public int getPosition(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
        }

        public int getRightDecorationWidth(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).mDecorInsets.right;
        }

        public int getTopDecorationHeight(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).mDecorInsets.top;
        }

        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i11).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void ignoreView(@NonNull View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent == recyclerView && recyclerView.indexOfChild(view) != -1) {
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                childViewHolderInt.addFlags(128);
                this.mRecyclerView.mViewInfoStore.removeViewHolder(childViewHolderInt);
            } else {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.mRecyclerView.exceptionLabel());
            }
        }

        public void layoutDecorated(@NonNull View view, int i11, int i12, int i13, int i14) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).mDecorInsets;
            view.layout(i11 + rect.left, i12 + rect.top, i13 - rect.right, i14 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(@NonNull View view, int i11, int i12, int i13, int i14) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.mDecorInsets;
            view.layout(i11 + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i12 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i13 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i14 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }

        public void measureChild(@NonNull View view, int i11, int i12) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i13 = i11 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i14 = i12 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + i13, ((ViewGroup.MarginLayoutParams) layoutParams).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + i14, ((ViewGroup.MarginLayoutParams) layoutParams).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(@NonNull View view, int i11, int i12) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i13 = i11 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i14 = i12 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i13, ((ViewGroup.MarginLayoutParams) layoutParams).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i14, ((ViewGroup.MarginLayoutParams) layoutParams).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i11, int i12) {
            View childAt = getChildAt(i11);
            if (childAt != null) {
                detachViewAt(i11);
                attachView(childAt, i12);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i11 + this.mRecyclerView.toString());
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.removeViewAt(childCount);
            }
        }

        public void removeAndRecycleAllViews(@NonNull Recycler recycler) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, recycler);
                }
            }
        }

        public void removeAndRecycleScrapInt(Recycler recycler) {
            int scrapCount = recycler.getScrapCount();
            for (int i11 = scrapCount - 1; i11 >= 0; i11--) {
                View scrapViewAt = recycler.getScrapViewAt(i11);
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(scrapViewAt);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(scrapViewAt, false);
                    }
                    ItemAnimator itemAnimator = this.mRecyclerView.mItemAnimator;
                    if (itemAnimator != null) {
                        itemAnimator.endAnimation(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    recycler.quickRecycleScrapView(scrapViewAt);
                }
            }
            recycler.clearScrap();
            if (scrapCount > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(@NonNull View view, @NonNull Recycler recycler) {
            removeView(view);
            recycler.recycleView(view);
        }

        public void removeAndRecycleViewAt(int i11, @NonNull Recycler recycler) {
            View childAt = getChildAt(i11);
            removeViewAt(i11);
            recycler.recycleView(childAt);
        }

        public void removeViewAt(int i11) {
            if (getChildAt(i11) != null) {
                this.mChildHelper.removeViewAt(i11);
            }
        }

        public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public void setMeasureSpecs(int i11, int i12) {
            this.mWidth = View.MeasureSpec.getSize(i11);
            int mode = View.MeasureSpec.getMode(i11);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i12);
            int mode2 = View.MeasureSpec.getMode(i12);
            this.mHeightMode = mode2;
            if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mHeight = 0;
            }
        }

        public void setMeasuredDimensionFromChildren(int i11, int i12) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i11, i12);
                return;
            }
            int i13 = Integer.MIN_VALUE;
            int i14 = Integer.MAX_VALUE;
            int i15 = Integer.MIN_VALUE;
            int i16 = Integer.MAX_VALUE;
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt = getChildAt(i17);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i18 = rect.left;
                if (i18 < i16) {
                    i16 = i18;
                }
                int i19 = rect.right;
                if (i19 > i13) {
                    i13 = i19;
                }
                int i21 = rect.top;
                if (i21 < i14) {
                    i14 = i21;
                }
                int i22 = rect.bottom;
                if (i22 > i15) {
                    i15 = i22;
                }
            }
            this.mRecyclerView.mTempRect.set(i16, i14, i13, i15);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i11, i12);
        }

        public boolean shouldMeasureChild(View view, int i11, int i12, LayoutParams layoutParams) {
            if (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getWidth(), i11, ((ViewGroup.MarginLayoutParams) layoutParams).width) && isMeasurementUpToDate(view.getHeight(), i12, ((ViewGroup.MarginLayoutParams) layoutParams).height)) {
                return false;
            }
            return true;
        }

        public void stopIgnoringView(@NonNull View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        public void attachView(@NonNull View view, int i11) {
            attachView(view, i11, (LayoutParams) view.getLayoutParams());
        }

        @SuppressLint({"UnknownNullness"})
        public LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        public void setMeasuredDimension(int i11, int i12) {
            this.mRecyclerView.setMeasuredDimension(i11, i12);
        }

        public void attachView(@NonNull View view) {
            attachView(view, -1);
        }

        @CallSuper
        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        public void onItemsChanged(@NonNull RecyclerView recyclerView) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onLayoutCompleted(State state) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public void onScrollStateChanged(int i11) {
        }

        public void scrollToPosition(int i11) {
        }

        @SuppressLint({"UnknownNullness"})
        public void collectInitialPrefetchPositions(int i11, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        }

        public void onAdapterChanged(@Nullable Adapter adapter, @Nullable Adapter adapter2) {
        }

        public void onItemsAdded(@NonNull RecyclerView recyclerView, int i11, int i12) {
        }

        public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i11, int i12) {
        }

        @SuppressLint({"UnknownNullness"})
        public void collectAdjacentPrefetchPositions(int i11, int i12, State state, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        }

        public void onItemsMoved(@NonNull RecyclerView recyclerView, int i11, int i12, int i13) {
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        final Rect mDecorInsets;
        boolean mInsetsDirty;
        boolean mPendingInvalidate;
        ViewHolder mViewHolder;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public int getAbsoluteAdapterPosition() {
            return this.mViewHolder.getAbsoluteAdapterPosition();
        }

        public int getBindingAdapterPosition() {
            return this.mViewHolder.getBindingAdapterPosition();
        }

        @Deprecated
        public int getViewAdapterPosition() {
            return this.mViewHolder.getBindingAdapterPosition();
        }

        public int getViewLayoutPosition() {
            return this.mViewHolder.getLayoutPosition();
        }

        @Deprecated
        public int getViewPosition() {
            return this.mViewHolder.getPosition();
        }

        public boolean isItemChanged() {
            return this.mViewHolder.isUpdated();
        }

        public boolean isItemRemoved() {
            return this.mViewHolder.isRemoved();
        }

        public boolean isViewInvalid() {
            return this.mViewHolder.isInvalid();
        }

        public boolean viewNeedsUpdate() {
            return this.mViewHolder.needsUpdate();
        }

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }
    }

    public interface OnChildAttachStateChangeListener {
        void onChildViewAttachedToWindow(@NonNull View view);

        void onChildViewDetachedFromWindow(@NonNull View view);
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static abstract class OnFlingListener {
        public abstract boolean onFling(int i11, int i12);
    }

    public interface OnItemTouchListener {
        boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);

        void onRequestDisallowInterceptTouchEvent(boolean z11);

        void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);
    }

    /* JADX INFO: loaded from: classes34.dex */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Orientation {
    }

    public static class RecycledViewPool {
        private static final int DEFAULT_MAX_SCRAP = 5;
        SparseArray<ScrapData> mScrap = new SparseArray<>();
        int mAttachCountForClearing = 0;
        Set<Adapter<?>> mAttachedAdaptersForPoolingContainer = Collections.newSetFromMap(new IdentityHashMap());

        public static class ScrapData {
            final ArrayList<ViewHolder> mScrapHeap = new ArrayList<>();
            int mMaxScrap = 5;
            long mCreateRunningAverageNs = 0;
            long mBindRunningAverageNs = 0;
        }

        public void clear() {
            for (int i11 = 0; i11 < this.mScrap.size(); i11++) {
                ScrapData scrapDataValueAt = this.mScrap.valueAt(i11);
                Iterator<ViewHolder> it = scrapDataValueAt.mScrapHeap.iterator();
                while (it.hasNext()) {
                    PoolingContainer.callPoolingContainerOnRelease(it.next().itemView);
                }
                scrapDataValueAt.mScrapHeap.clear();
            }
        }

        public int size() {
            int size = 0;
            for (int i11 = 0; i11 < this.mScrap.size(); i11++) {
                ArrayList<ViewHolder> arrayList = this.mScrap.valueAt(i11).mScrapHeap;
                if (arrayList != null) {
                    size += arrayList.size();
                }
            }
            return size;
        }

        private ScrapData getScrapDataForType(int i11) {
            ScrapData scrapData = this.mScrap.get(i11);
            if (scrapData != null) {
                return scrapData;
            }
            ScrapData scrapData2 = new ScrapData();
            this.mScrap.put(i11, scrapData2);
            return scrapData2;
        }

        public void attach() {
            this.mAttachCountForClearing++;
        }

        public void attachForPoolingContainer(@NonNull Adapter<?> adapter) {
            this.mAttachedAdaptersForPoolingContainer.add(adapter);
        }

        public void detach() {
            this.mAttachCountForClearing--;
        }

        public void detachForPoolingContainer(@NonNull Adapter<?> adapter, boolean z11) {
            this.mAttachedAdaptersForPoolingContainer.remove(adapter);
            if (this.mAttachedAdaptersForPoolingContainer.size() != 0 || z11) {
                return;
            }
            for (int i11 = 0; i11 < this.mScrap.size(); i11++) {
                SparseArray<ScrapData> sparseArray = this.mScrap;
                ArrayList<ViewHolder> arrayList = sparseArray.get(sparseArray.keyAt(i11)).mScrapHeap;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    PoolingContainer.callPoolingContainerOnRelease(arrayList.get(i12).itemView);
                }
            }
        }

        @Nullable
        public ViewHolder getRecycledView(int i11) {
            ScrapData scrapData = this.mScrap.get(i11);
            if (scrapData == null || scrapData.mScrapHeap.isEmpty()) {
                return null;
            }
            ArrayList<ViewHolder> arrayList = scrapData.mScrapHeap;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        public void onAdapterChanged(Adapter<?> adapter, Adapter<?> adapter2, boolean z11) {
            if (adapter != null) {
                detach();
            }
            if (!z11 && this.mAttachCountForClearing == 0) {
                clear();
            }
            if (adapter2 != null) {
                attach();
            }
        }

        public long runningAverage(long j11, long j12) {
            return j11 == 0 ? j12 : ((j11 / 4) * 3) + (j12 / 4);
        }

        public void factorInBindTime(int i11, long j11) {
            ScrapData scrapDataForType = getScrapDataForType(i11);
            scrapDataForType.mBindRunningAverageNs = runningAverage(scrapDataForType.mBindRunningAverageNs, j11);
        }

        public void factorInCreateTime(int i11, long j11) {
            ScrapData scrapDataForType = getScrapDataForType(i11);
            scrapDataForType.mCreateRunningAverageNs = runningAverage(scrapDataForType.mCreateRunningAverageNs, j11);
        }

        public int getRecycledViewCount(int i11) {
            return getScrapDataForType(i11).mScrapHeap.size();
        }

        public void putRecycledView(ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            ArrayList<ViewHolder> arrayList = getScrapDataForType(itemViewType).mScrapHeap;
            if (this.mScrap.get(itemViewType).mMaxScrap <= arrayList.size()) {
                PoolingContainer.callPoolingContainerOnRelease(viewHolder.itemView);
            } else {
                viewHolder.resetInternal();
                arrayList.add(viewHolder);
            }
        }

        public void setMaxRecycledViews(int i11, int i12) {
            ScrapData scrapDataForType = getScrapDataForType(i11);
            scrapDataForType.mMaxScrap = i12;
            ArrayList<ViewHolder> arrayList = scrapDataForType.mScrapHeap;
            while (arrayList.size() > i12) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        public boolean willBindInTime(int i11, long j11, long j12) {
            long j13 = getScrapDataForType(i11).mBindRunningAverageNs;
            if (j13 != 0 && j11 + j13 >= j12) {
                return false;
            }
            return true;
        }

        public boolean willCreateInTime(int i11, long j11, long j12) {
            long j13 = getScrapDataForType(i11).mCreateRunningAverageNs;
            if (j13 != 0 && j11 + j13 >= j12) {
                return false;
            }
            return true;
        }
    }

    public final class Recycler {
        static final int DEFAULT_CACHE_SIZE = 2;
        final ArrayList<ViewHolder> mAttachedScrap;
        final ArrayList<ViewHolder> mCachedViews;
        ArrayList<ViewHolder> mChangedScrap;
        RecycledViewPool mRecyclerPool;
        private int mRequestedCacheMax;
        private final List<ViewHolder> mUnmodifiableAttachedScrap;
        private ViewCacheExtension mViewCacheExtension;
        int mViewCacheMax;

        private void invalidateDisplayListInt(ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ViewGroup) {
                invalidateDisplayListInt((ViewGroup) view, false);
            }
        }

        private void poolingContainerDetach(Adapter<?> adapter) {
            poolingContainerDetach(adapter, false);
        }

        private boolean tryBindViewHolderByDeadline(@NonNull ViewHolder viewHolder, int i11, int i12, long j11) {
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = viewHolder.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j11 != Long.MAX_VALUE && !this.mRecyclerPool.willBindInTime(itemViewType, nanoTime, j11)) {
                return false;
            }
            RecyclerView.this.mAdapter.bindViewHolder(viewHolder, i11);
            this.mRecyclerPool.factorInBindTime(viewHolder.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            attachAccessibilityDelegateOnBind(viewHolder);
            if (!RecyclerView.this.mState.isPreLayout()) {
                return true;
            }
            viewHolder.mPreLayoutPosition = i12;
            return true;
        }

        @NonNull
        public View getViewForPosition(int i11) {
            return getViewForPosition(i11, false);
        }

        public void onDetachedFromWindow() {
            for (int i11 = 0; i11 < this.mCachedViews.size(); i11++) {
                PoolingContainer.callPoolingContainerOnRelease(this.mCachedViews.get(i11).itemView);
            }
            poolingContainerDetach(RecyclerView.this.mAdapter);
        }

        public void viewRangeUpdate(int i11, int i12) {
            int i13;
            int i14 = i12 + i11;
            for (int size = this.mCachedViews.size() - 1; size >= 0; size--) {
                ViewHolder viewHolder = this.mCachedViews.get(size);
                if (viewHolder != null && (i13 = viewHolder.mPosition) >= i11 && i13 < i14) {
                    viewHolder.addFlags(2);
                    recycleCachedViewAt(size);
                }
            }
        }

        public Recycler() {
            ArrayList<ViewHolder> arrayList = new ArrayList<>();
            this.mAttachedScrap = arrayList;
            this.mChangedScrap = null;
            this.mCachedViews = new ArrayList<>();
            this.mUnmodifiableAttachedScrap = Collections.unmodifiableList(arrayList);
            this.mRequestedCacheMax = 2;
            this.mViewCacheMax = 2;
        }

        private void attachAccessibilityDelegateOnBind(ViewHolder viewHolder) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = viewHolder.itemView;
                if (ViewCompat.getImportantForAccessibility(view) == 0) {
                    ViewCompat.setImportantForAccessibility(view, 1);
                }
                RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = RecyclerView.this.mAccessibilityDelegate;
                if (recyclerViewAccessibilityDelegate == null) {
                    return;
                }
                AccessibilityDelegateCompat itemDelegate = recyclerViewAccessibilityDelegate.getItemDelegate();
                if (itemDelegate instanceof RecyclerViewAccessibilityDelegate.ItemDelegate) {
                    ((RecyclerViewAccessibilityDelegate.ItemDelegate) itemDelegate).saveOriginalDelegate(view);
                }
                ViewCompat.setAccessibilityDelegate(view, itemDelegate);
            }
        }

        private void maybeSendPoolingContainerAttach() {
            if (this.mRecyclerPool != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mAdapter == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.mRecyclerPool.attachForPoolingContainer(RecyclerView.this.mAdapter);
            }
        }

        private void poolingContainerDetach(Adapter<?> adapter, boolean z11) {
            RecycledViewPool recycledViewPool = this.mRecyclerPool;
            if (recycledViewPool != null) {
                recycledViewPool.detachForPoolingContainer(adapter, z11);
            }
        }

        public void clear() {
            this.mAttachedScrap.clear();
            recycleAndClearCachedViews();
        }

        public void clearOldPositions() {
            int size = this.mCachedViews.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.mCachedViews.get(i11).clearOldPosition();
            }
            int size2 = this.mAttachedScrap.size();
            for (int i12 = 0; i12 < size2; i12++) {
                this.mAttachedScrap.get(i12).clearOldPosition();
            }
            ArrayList<ViewHolder> arrayList = this.mChangedScrap;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    this.mChangedScrap.get(i13).clearOldPosition();
                }
            }
        }

        public void clearScrap() {
            this.mAttachedScrap.clear();
            ArrayList<ViewHolder> arrayList = this.mChangedScrap;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int convertPreLayoutPositionToPostLayout(int i11) {
            if (i11 >= 0 && i11 < RecyclerView.this.mState.getItemCount()) {
                return !RecyclerView.this.mState.isPreLayout() ? i11 : RecyclerView.this.mAdapterHelper.findPositionOffset(i11);
            }
            throw new IndexOutOfBoundsException("invalid position " + i11 + ". State item count is " + RecyclerView.this.mState.getItemCount() + RecyclerView.this.exceptionLabel());
        }

        public void dispatchViewRecycled(@NonNull ViewHolder viewHolder) {
            RecyclerListener recyclerListener = RecyclerView.this.mRecyclerListener;
            if (recyclerListener != null) {
                recyclerListener.onViewRecycled(viewHolder);
            }
            int size = RecyclerView.this.mRecyclerListeners.size();
            for (int i11 = 0; i11 < size; i11++) {
                RecyclerView.this.mRecyclerListeners.get(i11).onViewRecycled(viewHolder);
            }
            Adapter adapter = RecyclerView.this.mAdapter;
            if (adapter != null) {
                adapter.onViewRecycled(viewHolder);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.removeViewHolder(viewHolder);
            }
        }

        public ViewHolder getChangedScrapViewForPosition(int i11) {
            int size;
            int iFindPositionOffset;
            ArrayList<ViewHolder> arrayList = this.mChangedScrap;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i12 = 0; i12 < size; i12++) {
                    ViewHolder viewHolder = this.mChangedScrap.get(i12);
                    if (!viewHolder.wasReturnedFromScrap() && viewHolder.getLayoutPosition() == i11) {
                        viewHolder.addFlags(32);
                        return viewHolder;
                    }
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && (iFindPositionOffset = RecyclerView.this.mAdapterHelper.findPositionOffset(i11)) > 0 && iFindPositionOffset < RecyclerView.this.mAdapter.getItemCount()) {
                    long itemId = RecyclerView.this.mAdapter.getItemId(iFindPositionOffset);
                    for (int i13 = 0; i13 < size; i13++) {
                        ViewHolder viewHolder2 = this.mChangedScrap.get(i13);
                        if (!viewHolder2.wasReturnedFromScrap() && viewHolder2.getItemId() == itemId) {
                            viewHolder2.addFlags(32);
                            return viewHolder2;
                        }
                    }
                }
            }
            return null;
        }

        public RecycledViewPool getRecycledViewPool() {
            if (this.mRecyclerPool == null) {
                this.mRecyclerPool = new RecycledViewPool();
                maybeSendPoolingContainerAttach();
            }
            return this.mRecyclerPool;
        }

        public int getScrapCount() {
            return this.mAttachedScrap.size();
        }

        @NonNull
        public List<ViewHolder> getScrapList() {
            return this.mUnmodifiableAttachedScrap;
        }

        public ViewHolder getScrapOrCachedViewForId(long j11, int i11, boolean z11) {
            for (int size = this.mAttachedScrap.size() - 1; size >= 0; size--) {
                ViewHolder viewHolder = this.mAttachedScrap.get(size);
                if (viewHolder.getItemId() == j11 && !viewHolder.wasReturnedFromScrap()) {
                    if (i11 == viewHolder.getItemViewType()) {
                        viewHolder.addFlags(32);
                        if (viewHolder.isRemoved() && !RecyclerView.this.mState.isPreLayout()) {
                            viewHolder.setFlags(2, 14);
                        }
                        return viewHolder;
                    }
                    if (!z11) {
                        this.mAttachedScrap.remove(size);
                        RecyclerView.this.removeDetachedView(viewHolder.itemView, false);
                        quickRecycleScrapView(viewHolder.itemView);
                    }
                }
            }
            int size2 = this.mCachedViews.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                ViewHolder viewHolder2 = this.mCachedViews.get(size2);
                if (viewHolder2.getItemId() == j11 && !viewHolder2.isAttachedToTransitionOverlay()) {
                    if (i11 == viewHolder2.getItemViewType()) {
                        if (!z11) {
                            this.mCachedViews.remove(size2);
                        }
                        return viewHolder2;
                    }
                    if (!z11) {
                        recycleCachedViewAt(size2);
                        return null;
                    }
                }
            }
        }

        public ViewHolder getScrapOrHiddenOrCachedHolderForPosition(int i11, boolean z11) {
            View viewFindHiddenNonRemovedView;
            int size = this.mAttachedScrap.size();
            for (int i12 = 0; i12 < size; i12++) {
                ViewHolder viewHolder = this.mAttachedScrap.get(i12);
                if (!viewHolder.wasReturnedFromScrap() && viewHolder.getLayoutPosition() == i11 && !viewHolder.isInvalid() && (RecyclerView.this.mState.mInPreLayout || !viewHolder.isRemoved())) {
                    viewHolder.addFlags(32);
                    return viewHolder;
                }
            }
            if (z11 || (viewFindHiddenNonRemovedView = RecyclerView.this.mChildHelper.findHiddenNonRemovedView(i11)) == null) {
                int size2 = this.mCachedViews.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    ViewHolder viewHolder2 = this.mCachedViews.get(i13);
                    if (!viewHolder2.isInvalid() && viewHolder2.getLayoutPosition() == i11 && !viewHolder2.isAttachedToTransitionOverlay()) {
                        if (!z11) {
                            this.mCachedViews.remove(i13);
                        }
                        return viewHolder2;
                    }
                }
                return null;
            }
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(viewFindHiddenNonRemovedView);
            RecyclerView.this.mChildHelper.unhide(viewFindHiddenNonRemovedView);
            int iIndexOfChild = RecyclerView.this.mChildHelper.indexOfChild(viewFindHiddenNonRemovedView);
            if (iIndexOfChild != -1) {
                RecyclerView.this.mChildHelper.detachViewFromParent(iIndexOfChild);
                scrapView(viewFindHiddenNonRemovedView);
                childViewHolderInt.addFlags(8224);
                return childViewHolderInt;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
        }

        public View getScrapViewAt(int i11) {
            return this.mAttachedScrap.get(i11).itemView;
        }

        public View getViewForPosition(int i11, boolean z11) {
            return tryGetViewHolderForPositionByDeadline(i11, z11, Long.MAX_VALUE).itemView;
        }

        public void markItemDecorInsetsDirty() {
            int size = this.mCachedViews.size();
            for (int i11 = 0; i11 < size; i11++) {
                LayoutParams layoutParams = (LayoutParams) this.mCachedViews.get(i11).itemView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.mInsetsDirty = true;
                }
            }
        }

        public void markKnownViewsInvalid() {
            int size = this.mCachedViews.size();
            for (int i11 = 0; i11 < size; i11++) {
                ViewHolder viewHolder = this.mCachedViews.get(i11);
                if (viewHolder != null) {
                    viewHolder.addFlags(6);
                    viewHolder.addChangePayload(null);
                }
            }
            Adapter adapter = RecyclerView.this.mAdapter;
            if (adapter == null || !adapter.hasStableIds()) {
                recycleAndClearCachedViews();
            }
        }

        public void offsetPositionRecordsForInsert(int i11, int i12) {
            int size = this.mCachedViews.size();
            for (int i13 = 0; i13 < size; i13++) {
                ViewHolder viewHolder = this.mCachedViews.get(i13);
                if (viewHolder != null && viewHolder.mPosition >= i11) {
                    viewHolder.offsetPosition(i12, false);
                }
            }
        }

        public void offsetPositionRecordsForMove(int i11, int i12) {
            int i13;
            int i14;
            int i15;
            int i16;
            if (i11 < i12) {
                i13 = -1;
                i15 = i11;
                i14 = i12;
            } else {
                i13 = 1;
                i14 = i11;
                i15 = i12;
            }
            int size = this.mCachedViews.size();
            for (int i17 = 0; i17 < size; i17++) {
                ViewHolder viewHolder = this.mCachedViews.get(i17);
                if (viewHolder != null && (i16 = viewHolder.mPosition) >= i15 && i16 <= i14) {
                    if (i16 == i11) {
                        viewHolder.offsetPosition(i12 - i11, false);
                    } else {
                        viewHolder.offsetPosition(i13, false);
                    }
                }
            }
        }

        public void offsetPositionRecordsForRemove(int i11, int i12, boolean z11) {
            int i13 = i11 + i12;
            for (int size = this.mCachedViews.size() - 1; size >= 0; size--) {
                ViewHolder viewHolder = this.mCachedViews.get(size);
                if (viewHolder != null) {
                    int i14 = viewHolder.mPosition;
                    if (i14 >= i13) {
                        viewHolder.offsetPosition(-i12, z11);
                    } else if (i14 >= i11) {
                        viewHolder.addFlags(8);
                        recycleCachedViewAt(size);
                    }
                }
            }
        }

        public void recycleAndClearCachedViews() {
            for (int size = this.mCachedViews.size() - 1; size >= 0; size--) {
                recycleCachedViewAt(size);
            }
            this.mCachedViews.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.clearPrefetchPositions();
            }
        }

        public void recycleCachedViewAt(int i11) {
            addViewHolderToRecycledViewPool(this.mCachedViews.get(i11), true);
            this.mCachedViews.remove(i11);
        }

        public void setRecycledViewPool(RecycledViewPool recycledViewPool) {
            poolingContainerDetach(RecyclerView.this.mAdapter);
            RecycledViewPool recycledViewPool2 = this.mRecyclerPool;
            if (recycledViewPool2 != null) {
                recycledViewPool2.detach();
            }
            this.mRecyclerPool = recycledViewPool;
            if (recycledViewPool != null && RecyclerView.this.getAdapter() != null) {
                this.mRecyclerPool.attach();
            }
            maybeSendPoolingContainerAttach();
        }

        public void setViewCacheExtension(ViewCacheExtension viewCacheExtension) {
            this.mViewCacheExtension = viewCacheExtension;
        }

        public void setViewCacheSize(int i11) {
            this.mRequestedCacheMax = i11;
            updateViewCacheSize();
        }

        /* JADX WARN: Code duplicated, block: B:101:0x020c  */
        /* JADX WARN: Code duplicated, block: B:102:0x021a  */
        /* JADX WARN: Code duplicated, block: B:105:0x0220 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:107:0x0223  */
        /* JADX WARN: Code duplicated, block: B:18:0x0037 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:19:0x0039  */
        /* JADX WARN: Code duplicated, block: B:21:0x0043  */
        /* JADX WARN: Code duplicated, block: B:22:0x004e  */
        /* JADX WARN: Code duplicated, block: B:24:0x0054  */
        /* JADX WARN: Code duplicated, block: B:27:0x005c  */
        /* JADX WARN: Code duplicated, block: B:29:0x005f  */
        /* JADX WARN: Code duplicated, block: B:81:0x019f  */
        /* JADX WARN: Code duplicated, block: B:87:0x01cb  */
        /* JADX WARN: Code duplicated, block: B:89:0x01d1  */
        /* JADX WARN: Code duplicated, block: B:98:0x01f6  */
        /* JADX WARN: Code duplicated, block: B:99:0x0204  */
        @Nullable
        public ViewHolder tryGetViewHolderForPositionByDeadline(int i11, boolean z11, long j11) {
            ViewHolder viewHolderCreateViewHolder;
            boolean z12;
            ViewHolder viewHolder;
            boolean z13;
            boolean zTryBindViewHolderByDeadline;
            ViewGroup.LayoutParams layoutParams;
            LayoutParams layoutParams2;
            int iFindPositionOffset;
            RecyclerView recyclerViewFindNestedRecyclerView;
            ViewCacheExtension viewCacheExtension;
            View viewForPositionAndType;
            if (i11 < 0 || i11 >= RecyclerView.this.mState.getItemCount()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i11 + "(" + i11 + "). Item count:" + RecyclerView.this.mState.getItemCount() + RecyclerView.this.exceptionLabel());
            }
            if (RecyclerView.this.mState.isPreLayout()) {
                viewHolderCreateViewHolder = getChangedScrapViewForPosition(i11);
                if (viewHolderCreateViewHolder != null) {
                    z12 = true;
                }
                if (viewHolderCreateViewHolder == null && (viewHolderCreateViewHolder = getScrapOrHiddenOrCachedHolderForPosition(i11, z11)) != null) {
                    if (validateViewHolderForOffsetPosition(viewHolderCreateViewHolder)) {
                        z12 = true;
                    } else {
                        if (!z11) {
                            viewHolderCreateViewHolder.addFlags(4);
                            if (viewHolderCreateViewHolder.isScrap()) {
                                RecyclerView.this.removeDetachedView(viewHolderCreateViewHolder.itemView, false);
                                viewHolderCreateViewHolder.unScrap();
                            } else if (viewHolderCreateViewHolder.wasReturnedFromScrap()) {
                                viewHolderCreateViewHolder.clearReturnedFromScrapFlag();
                            }
                            recycleViewHolderInternal(viewHolderCreateViewHolder);
                        }
                        viewHolderCreateViewHolder = null;
                    }
                }
                if (viewHolderCreateViewHolder == null) {
                    iFindPositionOffset = RecyclerView.this.mAdapterHelper.findPositionOffset(i11);
                    if (iFindPositionOffset >= 0 || iFindPositionOffset >= RecyclerView.this.mAdapter.getItemCount()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i11 + "(offset:" + iFindPositionOffset + ").state:" + RecyclerView.this.mState.getItemCount() + RecyclerView.this.exceptionLabel());
                    }
                    int itemViewType = RecyclerView.this.mAdapter.getItemViewType(iFindPositionOffset);
                    if (RecyclerView.this.mAdapter.hasStableIds() && (viewHolderCreateViewHolder = getScrapOrCachedViewForId(RecyclerView.this.mAdapter.getItemId(iFindPositionOffset), itemViewType, z11)) != null) {
                        viewHolderCreateViewHolder.mPosition = iFindPositionOffset;
                        z12 = true;
                    }
                    if (viewHolderCreateViewHolder == null && (viewCacheExtension = this.mViewCacheExtension) != null && (viewForPositionAndType = viewCacheExtension.getViewForPositionAndType(this, i11, itemViewType)) != null) {
                        viewHolderCreateViewHolder = RecyclerView.this.getChildViewHolder(viewForPositionAndType);
                        if (viewHolderCreateViewHolder == null) {
                            throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder" + RecyclerView.this.exceptionLabel());
                        }
                        if (viewHolderCreateViewHolder.shouldIgnore()) {
                            throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view." + RecyclerView.this.exceptionLabel());
                        }
                    }
                    if (viewHolderCreateViewHolder == null) {
                        ViewHolder recycledView = getRecycledViewPool().getRecycledView(itemViewType);
                        if (recycledView != null) {
                            recycledView.resetInternal();
                            if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                invalidateDisplayListInt(recycledView);
                            }
                        }
                        viewHolderCreateViewHolder = recycledView;
                    }
                    if (viewHolderCreateViewHolder == null) {
                        long nanoTime = RecyclerView.this.getNanoTime();
                        if (j11 != Long.MAX_VALUE && !this.mRecyclerPool.willCreateInTime(itemViewType, nanoTime, j11)) {
                            return null;
                        }
                        RecyclerView recyclerView = RecyclerView.this;
                        viewHolderCreateViewHolder = recyclerView.mAdapter.createViewHolder(recyclerView, itemViewType);
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && (recyclerViewFindNestedRecyclerView = RecyclerView.findNestedRecyclerView(viewHolderCreateViewHolder.itemView)) != null) {
                            viewHolderCreateViewHolder.mNestedRecyclerView = new WeakReference<>(recyclerViewFindNestedRecyclerView);
                        }
                        this.mRecyclerPool.factorInCreateTime(itemViewType, RecyclerView.this.getNanoTime() - nanoTime);
                    }
                }
                viewHolder = viewHolderCreateViewHolder;
                z13 = z12;
                if (z13 && !RecyclerView.this.mState.isPreLayout() && viewHolder.hasAnyOfTheFlags(8192)) {
                    viewHolder.setFlags(0, 8192);
                    if (RecyclerView.this.mState.mRunSimpleAnimations) {
                        int iBuildAdapterChangeFlagsForAnimations = ItemAnimator.buildAdapterChangeFlagsForAnimations(viewHolder) | 4096;
                        RecyclerView recyclerView2 = RecyclerView.this;
                        RecyclerView.this.recordAnimationInfoIfBouncedHiddenView(viewHolder, recyclerView2.mItemAnimator.recordPreLayoutInformation(recyclerView2.mState, viewHolder, iBuildAdapterChangeFlagsForAnimations, viewHolder.getUnmodifiedPayloads()));
                    }
                }
                if (RecyclerView.this.mState.isPreLayout() || !viewHolder.isBound()) {
                    if (viewHolder.isBound() || viewHolder.needsUpdate() || viewHolder.isInvalid()) {
                        zTryBindViewHolderByDeadline = tryBindViewHolderByDeadline(viewHolder, RecyclerView.this.mAdapterHelper.findPositionOffset(i11), i11, j11);
                    }
                    layoutParams = viewHolder.itemView.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams2 = (LayoutParams) RecyclerView.this.generateDefaultLayoutParams();
                        viewHolder.itemView.setLayoutParams(layoutParams2);
                    } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                        layoutParams2 = (LayoutParams) layoutParams;
                    } else {
                        layoutParams2 = (LayoutParams) RecyclerView.this.generateLayoutParams(layoutParams);
                        viewHolder.itemView.setLayoutParams(layoutParams2);
                    }
                    layoutParams2.mViewHolder = viewHolder;
                    layoutParams2.mPendingInvalidate = !z13 && zTryBindViewHolderByDeadline;
                    return viewHolder;
                }
                viewHolder.mPreLayoutPosition = i11;
                zTryBindViewHolderByDeadline = false;
                layoutParams = viewHolder.itemView.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams2 = (LayoutParams) RecyclerView.this.generateDefaultLayoutParams();
                    viewHolder.itemView.setLayoutParams(layoutParams2);
                } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                    layoutParams2 = (LayoutParams) RecyclerView.this.generateLayoutParams(layoutParams);
                    viewHolder.itemView.setLayoutParams(layoutParams2);
                } else {
                    layoutParams2 = (LayoutParams) layoutParams;
                }
                layoutParams2.mViewHolder = viewHolder;
                layoutParams2.mPendingInvalidate = !z13 && zTryBindViewHolderByDeadline;
                return viewHolder;
            }
            viewHolderCreateViewHolder = null;
            z12 = false;
            if (viewHolderCreateViewHolder == null) {
                if (validateViewHolderForOffsetPosition(viewHolderCreateViewHolder)) {
                    if (!z11) {
                        viewHolderCreateViewHolder.addFlags(4);
                        if (viewHolderCreateViewHolder.isScrap()) {
                            RecyclerView.this.removeDetachedView(viewHolderCreateViewHolder.itemView, false);
                            viewHolderCreateViewHolder.unScrap();
                        } else if (viewHolderCreateViewHolder.wasReturnedFromScrap()) {
                            viewHolderCreateViewHolder.clearReturnedFromScrapFlag();
                        }
                        recycleViewHolderInternal(viewHolderCreateViewHolder);
                    }
                    viewHolderCreateViewHolder = null;
                } else {
                    z12 = true;
                }
            }
            if (viewHolderCreateViewHolder == null) {
                iFindPositionOffset = RecyclerView.this.mAdapterHelper.findPositionOffset(i11);
                if (iFindPositionOffset >= 0) {
                }
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i11 + "(offset:" + iFindPositionOffset + ").state:" + RecyclerView.this.mState.getItemCount() + RecyclerView.this.exceptionLabel());
            }
            viewHolder = viewHolderCreateViewHolder;
            z13 = z12;
            if (z13) {
                viewHolder.setFlags(0, 8192);
                if (RecyclerView.this.mState.mRunSimpleAnimations) {
                    int iBuildAdapterChangeFlagsForAnimations2 = ItemAnimator.buildAdapterChangeFlagsForAnimations(viewHolder) | 4096;
                    RecyclerView recyclerView3 = RecyclerView.this;
                    RecyclerView.this.recordAnimationInfoIfBouncedHiddenView(viewHolder, recyclerView3.mItemAnimator.recordPreLayoutInformation(recyclerView3.mState, viewHolder, iBuildAdapterChangeFlagsForAnimations2, viewHolder.getUnmodifiedPayloads()));
                }
            }
            if (RecyclerView.this.mState.isPreLayout()) {
                if (viewHolder.isBound()) {
                }
                zTryBindViewHolderByDeadline = tryBindViewHolderByDeadline(viewHolder, RecyclerView.this.mAdapterHelper.findPositionOffset(i11), i11, j11);
            } else {
                if (viewHolder.isBound()) {
                }
                zTryBindViewHolderByDeadline = tryBindViewHolderByDeadline(viewHolder, RecyclerView.this.mAdapterHelper.findPositionOffset(i11), i11, j11);
            }
            layoutParams = viewHolder.itemView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams2 = (LayoutParams) RecyclerView.this.generateDefaultLayoutParams();
                viewHolder.itemView.setLayoutParams(layoutParams2);
            } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                layoutParams2 = (LayoutParams) RecyclerView.this.generateLayoutParams(layoutParams);
                viewHolder.itemView.setLayoutParams(layoutParams2);
            } else {
                layoutParams2 = (LayoutParams) layoutParams;
            }
            layoutParams2.mViewHolder = viewHolder;
            layoutParams2.mPendingInvalidate = !z13 && zTryBindViewHolderByDeadline;
            return viewHolder;
        }

        public void unscrapView(ViewHolder viewHolder) {
            if (viewHolder.mInChangeScrap) {
                this.mChangedScrap.remove(viewHolder);
            } else {
                this.mAttachedScrap.remove(viewHolder);
            }
            viewHolder.mScrapContainer = null;
            viewHolder.mInChangeScrap = false;
            viewHolder.clearReturnedFromScrapFlag();
        }

        public void updateViewCacheSize() {
            LayoutManager layoutManager = RecyclerView.this.mLayout;
            this.mViewCacheMax = this.mRequestedCacheMax + (layoutManager != null ? layoutManager.mPrefetchMaxCountObserved : 0);
            for (int size = this.mCachedViews.size() - 1; size >= 0 && this.mCachedViews.size() > this.mViewCacheMax; size--) {
                recycleCachedViewAt(size);
            }
        }

        private void invalidateDisplayListInt(ViewGroup viewGroup, boolean z11) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    invalidateDisplayListInt((ViewGroup) childAt, true);
                }
            }
            if (z11) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        public void addViewHolderToRecycledViewPool(@NonNull ViewHolder viewHolder, boolean z11) {
            AccessibilityDelegateCompat andRemoveOriginalDelegateForItem;
            RecyclerView.clearNestedRecyclerViewIfNotNested(viewHolder);
            View view = viewHolder.itemView;
            RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = RecyclerView.this.mAccessibilityDelegate;
            if (recyclerViewAccessibilityDelegate != null) {
                AccessibilityDelegateCompat itemDelegate = recyclerViewAccessibilityDelegate.getItemDelegate();
                if (itemDelegate instanceof RecyclerViewAccessibilityDelegate.ItemDelegate) {
                    andRemoveOriginalDelegateForItem = ((RecyclerViewAccessibilityDelegate.ItemDelegate) itemDelegate).getAndRemoveOriginalDelegateForItem(view);
                } else {
                    andRemoveOriginalDelegateForItem = null;
                }
                ViewCompat.setAccessibilityDelegate(view, andRemoveOriginalDelegateForItem);
            }
            if (z11) {
                dispatchViewRecycled(viewHolder);
            }
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = null;
            getRecycledViewPool().putRecycledView(viewHolder);
        }

        public void bindViewToPosition(@NonNull View view, int i11) {
            LayoutParams layoutParams;
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                int iFindPositionOffset = RecyclerView.this.mAdapterHelper.findPositionOffset(i11);
                if (iFindPositionOffset >= 0 && iFindPositionOffset < RecyclerView.this.mAdapter.getItemCount()) {
                    tryBindViewHolderByDeadline(childViewHolderInt, iFindPositionOffset, i11, Long.MAX_VALUE);
                    ViewGroup.LayoutParams layoutParams2 = childViewHolderInt.itemView.getLayoutParams();
                    if (layoutParams2 == null) {
                        layoutParams = (LayoutParams) RecyclerView.this.generateDefaultLayoutParams();
                        childViewHolderInt.itemView.setLayoutParams(layoutParams);
                    } else if (!RecyclerView.this.checkLayoutParams(layoutParams2)) {
                        layoutParams = (LayoutParams) RecyclerView.this.generateLayoutParams(layoutParams2);
                        childViewHolderInt.itemView.setLayoutParams(layoutParams);
                    } else {
                        layoutParams = (LayoutParams) layoutParams2;
                    }
                    boolean z11 = true;
                    layoutParams.mInsetsDirty = true;
                    layoutParams.mViewHolder = childViewHolderInt;
                    if (childViewHolderInt.itemView.getParent() != null) {
                        z11 = false;
                    }
                    layoutParams.mPendingInvalidate = z11;
                    return;
                }
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i11 + "(offset:" + iFindPositionOffset + ").state:" + RecyclerView.this.mState.getItemCount() + RecyclerView.this.exceptionLabel());
            }
            throw new IllegalArgumentException("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter" + RecyclerView.this.exceptionLabel());
        }

        public void onAdapterChanged(Adapter<?> adapter, Adapter<?> adapter2, boolean z11) {
            clear();
            poolingContainerDetach(adapter, true);
            getRecycledViewPool().onAdapterChanged(adapter, adapter2, z11);
            maybeSendPoolingContainerAttach();
        }

        public void onAttachedToWindow() {
            maybeSendPoolingContainerAttach();
        }

        public void quickRecycleScrapView(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.mScrapContainer = null;
            childViewHolderInt.mInChangeScrap = false;
            childViewHolderInt.clearReturnedFromScrapFlag();
            recycleViewHolderInternal(childViewHolderInt);
        }

        public void recycleView(@NonNull View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            recycleViewHolderInternal(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator != null && !childViewHolderInt.isRecyclable()) {
                RecyclerView.this.mItemAnimator.endAnimation(childViewHolderInt);
            }
        }

        public void recycleViewHolderInternal(ViewHolder viewHolder) {
            boolean z11;
            boolean z12;
            boolean z13 = false;
            boolean z14 = true;
            if (!viewHolder.isScrap() && viewHolder.itemView.getParent() == null) {
                if (!viewHolder.isTmpDetached()) {
                    if (!viewHolder.shouldIgnore()) {
                        boolean zDoesTransientStatePreventRecycling = viewHolder.doesTransientStatePreventRecycling();
                        Adapter adapter = RecyclerView.this.mAdapter;
                        if (adapter != null && zDoesTransientStatePreventRecycling && adapter.onFailedToRecycleView(viewHolder)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11 && !viewHolder.isRecyclable()) {
                            z14 = false;
                        } else {
                            if (this.mViewCacheMax > 0 && !viewHolder.hasAnyOfTheFlags(526)) {
                                int size = this.mCachedViews.size();
                                if (size >= this.mViewCacheMax && size > 0) {
                                    recycleCachedViewAt(0);
                                    size--;
                                }
                                if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.lastPrefetchIncludedPosition(viewHolder.mPosition)) {
                                    int i11 = size - 1;
                                    while (i11 >= 0) {
                                        if (!RecyclerView.this.mPrefetchRegistry.lastPrefetchIncludedPosition(this.mCachedViews.get(i11).mPosition)) {
                                            break;
                                        } else {
                                            i11--;
                                        }
                                    }
                                    size = i11 + 1;
                                }
                                this.mCachedViews.add(size, viewHolder);
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                addViewHolderToRecycledViewPool(viewHolder, true);
                            } else {
                                z14 = false;
                            }
                            z13 = z12;
                        }
                        RecyclerView.this.mViewInfoStore.removeViewHolder(viewHolder);
                        if (!z13 && !z14 && zDoesTransientStatePreventRecycling) {
                            PoolingContainer.callPoolingContainerOnRelease(viewHolder.itemView);
                            viewHolder.mBindingAdapter = null;
                            viewHolder.mOwnerRecyclerView = null;
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
                }
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + viewHolder + RecyclerView.this.exceptionLabel());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(viewHolder.isScrap());
            sb2.append(" isAttached:");
            if (viewHolder.itemView.getParent() != null) {
                z13 = true;
            }
            sb2.append(z13);
            sb2.append(RecyclerView.this.exceptionLabel());
            throw new IllegalArgumentException(sb2.toString());
        }

        public void scrapView(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.mChangedScrap == null) {
                    this.mChangedScrap = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.mChangedScrap.add(childViewHolderInt);
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !RecyclerView.this.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            }
            childViewHolderInt.setScrapContainer(this, false);
            this.mAttachedScrap.add(childViewHolderInt);
        }

        public boolean validateViewHolderForOffsetPosition(ViewHolder viewHolder) {
            if (viewHolder.isRemoved()) {
                return RecyclerView.this.mState.isPreLayout();
            }
            int i11 = viewHolder.mPosition;
            if (i11 >= 0 && i11 < RecyclerView.this.mAdapter.getItemCount()) {
                if (!RecyclerView.this.mState.isPreLayout() && RecyclerView.this.mAdapter.getItemViewType(viewHolder.mPosition) != viewHolder.getItemViewType()) {
                    return false;
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && viewHolder.getItemId() != RecyclerView.this.mAdapter.getItemId(viewHolder.mPosition)) {
                    return false;
                }
                return true;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + viewHolder + RecyclerView.this.exceptionLabel());
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public interface RecyclerListener {
        void onViewRecycled(@NonNull ViewHolder viewHolder);
    }

    public class RecyclerViewDataObserver extends AdapterDataObserver {
        public RecyclerViewDataObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.mStructureChanged = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (RecyclerView.this.mAdapterHelper.hasPendingUpdates()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i11, int i12, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.onItemRangeChanged(i11, i12, obj)) {
                triggerUpdateProcessor();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i11, int i12) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.onItemRangeInserted(i11, i12)) {
                triggerUpdateProcessor();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i11, int i12, int i13) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.onItemRangeMoved(i11, i12, i13)) {
                triggerUpdateProcessor();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i11, int i12) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.onItemRangeRemoved(i11, i12)) {
                triggerUpdateProcessor();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onStateRestorationPolicyChanged() {
            Adapter adapter;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState == null || (adapter = recyclerView.mAdapter) == null || !adapter.canRestoreState()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        public void triggerUpdateProcessor() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    ViewCompat.postOnAnimation(recyclerView, recyclerView.mUpdateChildViewsRunnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.recyclerview.widget.RecyclerView.SavedState.1
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
        Parcelable mLayoutState;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.mLayoutState = parcel.readParcelable(classLoader == null ? LayoutManager.class.getClassLoader() : classLoader);
        }

        public void copyFrom(SavedState savedState) {
            this.mLayoutState = savedState.mLayoutState;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeParcelable(this.mLayoutState, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static abstract class SmoothScroller {
        private LayoutManager mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private boolean mRunning;
        private boolean mStarted;
        private View mTargetView;
        private int mTargetPosition = -1;
        private final Action mRecyclingAction = new Action(0, 0);

        public static class Action {
            public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
            private boolean mChanged;
            private int mConsecutiveUpdates;
            private int mDuration;
            private int mDx;
            private int mDy;
            private Interpolator mInterpolator;
            private int mJumpToPosition;

            public Action(@Px int i11, @Px int i12) {
                this(i11, i12, Integer.MIN_VALUE, null);
            }

            public void setDuration(int i11) {
                this.mChanged = true;
                this.mDuration = i11;
            }

            public void setDx(@Px int i11) {
                this.mChanged = true;
                this.mDx = i11;
            }

            public void setDy(@Px int i11) {
                this.mChanged = true;
                this.mDy = i11;
            }

            public void setInterpolator(@Nullable Interpolator interpolator) {
                this.mChanged = true;
                this.mInterpolator = interpolator;
            }

            public Action(@Px int i11, @Px int i12, int i13) {
                this(i11, i12, i13, null);
            }

            private void validate() {
                if (this.mInterpolator != null && this.mDuration < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.mDuration < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public int getDuration() {
                return this.mDuration;
            }

            @Px
            public int getDx() {
                return this.mDx;
            }

            @Px
            public int getDy() {
                return this.mDy;
            }

            @Nullable
            public Interpolator getInterpolator() {
                return this.mInterpolator;
            }

            public boolean hasJumpTarget() {
                return this.mJumpToPosition >= 0;
            }

            public void jumpTo(int i11) {
                this.mJumpToPosition = i11;
            }

            public void runIfNecessary(RecyclerView recyclerView) {
                int i11 = this.mJumpToPosition;
                if (i11 >= 0) {
                    this.mJumpToPosition = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i11);
                    this.mChanged = false;
                } else {
                    if (!this.mChanged) {
                        this.mConsecutiveUpdates = 0;
                        return;
                    }
                    validate();
                    recyclerView.mViewFlinger.smoothScrollBy(this.mDx, this.mDy, this.mDuration, this.mInterpolator);
                    int i12 = this.mConsecutiveUpdates + 1;
                    this.mConsecutiveUpdates = i12;
                    if (i12 > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.mChanged = false;
                }
            }

            public void update(@Px int i11, @Px int i12, int i13, @Nullable Interpolator interpolator) {
                this.mDx = i11;
                this.mDy = i12;
                this.mDuration = i13;
                this.mInterpolator = interpolator;
                this.mChanged = true;
            }

            public Action(@Px int i11, @Px int i12, int i13, @Nullable Interpolator interpolator) {
                this.mJumpToPosition = -1;
                this.mChanged = false;
                this.mConsecutiveUpdates = 0;
                this.mDx = i11;
                this.mDy = i12;
                this.mDuration = i13;
                this.mInterpolator = interpolator;
            }
        }

        public interface ScrollVectorProvider {
            @Nullable
            PointF computeScrollVectorForPosition(int i11);
        }

        public abstract void onSeekTargetStep(@Px int i11, @Px int i12, @NonNull State state, @NonNull Action action);

        public abstract void onStart();

        public abstract void onStop();

        public abstract void onTargetFound(@NonNull View view, @NonNull State state, @NonNull Action action);

        public View findViewByPosition(int i11) {
            return this.mRecyclerView.mLayout.findViewByPosition(i11);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.getChildCount();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        @Nullable
        public LayoutManager getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated
        public void instantScrollToPosition(int i11) {
            this.mRecyclerView.scrollToPosition(i11);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        public void normalize(@NonNull PointF pointF) {
            float f11 = pointF.x;
            float f12 = pointF.y;
            float fSqrt = (float) Math.sqrt((f11 * f11) + (f12 * f12));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        public void onAnimation(int i11, int i12) {
            PointF pointFComputeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f11 = pointFComputeScrollVectorForPosition.x;
                if (f11 != 0.0f || pointFComputeScrollVectorForPosition.y != 0.0f) {
                    recyclerView.scrollStep((int) Math.signum(f11), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.runIfNecessary(recyclerView);
                    stop();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i11, i12, recyclerView.mState, this.mRecyclingAction);
                boolean zHasJumpTarget = this.mRecyclingAction.hasJumpTarget();
                this.mRecyclingAction.runIfNecessary(recyclerView);
                if (zHasJumpTarget && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.postOnAnimation();
                }
            }
        }

        public void setTargetPosition(int i11) {
            this.mTargetPosition = i11;
        }

        public void start(RecyclerView recyclerView, LayoutManager layoutManager) {
            recyclerView.mViewFlinger.stop();
            if (this.mStarted) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = layoutManager;
            int i11 = this.mTargetPosition;
            if (i11 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.mState.mTargetPosition = i11;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.mViewFlinger.postOnAnimation();
            this.mStarted = true;
        }

        public final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.mState.mTargetPosition = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.onSmoothScrollerStopped(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }

        @Nullable
        public PointF computeScrollVectorForPosition(int i11) {
            Object layoutManager = getLayoutManager();
            if (layoutManager instanceof ScrollVectorProvider) {
                return ((ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(i11);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + ScrollVectorProvider.class.getCanonicalName());
            return null;
        }

        public void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
            }
        }
    }

    public static class State {
        static final int STEP_ANIMATIONS = 4;
        static final int STEP_LAYOUT = 2;
        static final int STEP_START = 1;
        private SparseArray<Object> mData;
        long mFocusedItemId;
        int mFocusedItemPosition;
        int mFocusedSubChildId;
        int mRemainingScrollHorizontal;
        int mRemainingScrollVertical;
        int mTargetPosition = -1;
        int mPreviousLayoutItemCount = 0;
        int mDeletedInvisibleItemCountSincePreviousLayout = 0;
        int mLayoutStep = 1;
        int mItemCount = 0;
        boolean mStructureChanged = false;
        boolean mInPreLayout = false;
        boolean mTrackOldChangeHolders = false;
        boolean mIsMeasuring = false;
        boolean mRunSimpleAnimations = false;
        boolean mRunPredictiveAnimations = false;

        public void prepareForNestedPrefetch(Adapter adapter) {
            this.mLayoutStep = 1;
            this.mItemCount = adapter.getItemCount();
            this.mInPreLayout = false;
            this.mTrackOldChangeHolders = false;
            this.mIsMeasuring = false;
        }

        public void assertLayoutStep(int i11) {
            if ((this.mLayoutStep & i11) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i11) + " but it is " + Integer.toBinaryString(this.mLayoutStep));
        }

        public boolean didStructureChange() {
            return this.mStructureChanged;
        }

        public <T> T get(int i11) {
            SparseArray<Object> sparseArray = this.mData;
            if (sparseArray == null) {
                return null;
            }
            return (T) sparseArray.get(i11);
        }

        public int getItemCount() {
            return this.mInPreLayout ? this.mPreviousLayoutItemCount - this.mDeletedInvisibleItemCountSincePreviousLayout : this.mItemCount;
        }

        public int getRemainingScrollHorizontal() {
            return this.mRemainingScrollHorizontal;
        }

        public int getRemainingScrollVertical() {
            return this.mRemainingScrollVertical;
        }

        public int getTargetScrollPosition() {
            return this.mTargetPosition;
        }

        public boolean hasTargetScrollPosition() {
            return this.mTargetPosition != -1;
        }

        public boolean isMeasuring() {
            return this.mIsMeasuring;
        }

        public boolean isPreLayout() {
            return this.mInPreLayout;
        }

        public void put(int i11, Object obj) {
            if (this.mData == null) {
                this.mData = new SparseArray<>();
            }
            this.mData.put(i11, obj);
        }

        public void remove(int i11) {
            SparseArray<Object> sparseArray = this.mData;
            if (sparseArray == null) {
                return;
            }
            sparseArray.remove(i11);
        }

        public String toString() {
            return "State{mTargetPosition=" + this.mTargetPosition + ", mData=" + this.mData + ", mItemCount=" + this.mItemCount + ", mIsMeasuring=" + this.mIsMeasuring + ", mPreviousLayoutItemCount=" + this.mPreviousLayoutItemCount + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.mDeletedInvisibleItemCountSincePreviousLayout + ", mStructureChanged=" + this.mStructureChanged + ", mInPreLayout=" + this.mInPreLayout + ", mRunSimpleAnimations=" + this.mRunSimpleAnimations + ", mRunPredictiveAnimations=" + this.mRunPredictiveAnimations + '}';
        }

        public boolean willRunPredictiveAnimations() {
            return this.mRunPredictiveAnimations;
        }

        public boolean willRunSimpleAnimations() {
            return this.mRunSimpleAnimations;
        }
    }

    public static class StretchEdgeEffectFactory extends EdgeEffectFactory {
        @Override // androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory
        @NonNull
        public EdgeEffect createEdgeEffect(@NonNull RecyclerView recyclerView, int i11) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static abstract class ViewCacheExtension {
        @Nullable
        public abstract View getViewForPositionAndType(@NonNull Recycler recycler, int i11, int i12);
    }

    public class ViewFlinger implements Runnable {
        private boolean mEatRunOnAnimationRequest;
        Interpolator mInterpolator;
        private int mLastFlingX;
        private int mLastFlingY;
        OverScroller mOverScroller;
        private boolean mReSchedulePostAnimationCallback;

        public ViewFlinger() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.mInterpolator = interpolator;
            this.mEatRunOnAnimationRequest = false;
            this.mReSchedulePostAnimationCallback = false;
            this.mOverScroller = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private void internalPostOnAnimation() {
            RecyclerView.this.removeCallbacks(this);
            ViewCompat.postOnAnimation(RecyclerView.this, this);
        }

        public void fling(int i11, int i12) {
            RecyclerView.this.setScrollState(2);
            this.mLastFlingY = 0;
            this.mLastFlingX = 0;
            Interpolator interpolator = this.mInterpolator;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.mInterpolator = interpolator2;
                this.mOverScroller = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.mOverScroller.fling(0, 0, i11, i12, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            postOnAnimation();
        }

        public void postOnAnimation() {
            if (this.mEatRunOnAnimationRequest) {
                this.mReSchedulePostAnimationCallback = true;
            } else {
                internalPostOnAnimation();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            int i11;
            int i12;
            int i13;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                stop();
                return;
            }
            this.mReSchedulePostAnimationCallback = false;
            this.mEatRunOnAnimationRequest = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.mOverScroller;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i14 = currX - this.mLastFlingX;
                int i15 = currY - this.mLastFlingY;
                this.mLastFlingX = currX;
                this.mLastFlingY = currY;
                int iConsumeFlingInHorizontalStretch = RecyclerView.this.consumeFlingInHorizontalStretch(i14);
                int iConsumeFlingInVerticalStretch = RecyclerView.this.consumeFlingInVerticalStretch(i15);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    iConsumeFlingInHorizontalStretch -= iArr2[0];
                    iConsumeFlingInVerticalStretch -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    int i16 = iArr4[0];
                    int i17 = iArr4[1];
                    iConsumeFlingInHorizontalStretch -= i16;
                    iConsumeFlingInVerticalStretch -= i17;
                    SmoothScroller smoothScroller = recyclerView4.mLayout.mSmoothScroller;
                    if (smoothScroller != null && !smoothScroller.isPendingInitialRun() && smoothScroller.isRunning()) {
                        int itemCount = RecyclerView.this.mState.getItemCount();
                        if (itemCount == 0) {
                            smoothScroller.stop();
                        } else if (smoothScroller.getTargetPosition() >= itemCount) {
                            smoothScroller.setTargetPosition(itemCount - 1);
                            smoothScroller.onAnimation(i16, i17);
                        } else {
                            smoothScroller.onAnimation(i16, i17);
                        }
                    }
                    i12 = i17;
                    i11 = i16;
                } else {
                    i11 = 0;
                    i12 = 0;
                }
                int i18 = iConsumeFlingInHorizontalStretch;
                int i19 = iConsumeFlingInVerticalStretch;
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i11, i12, i18, i19, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i21 = i18 - iArr6[0];
                int i22 = i19 - iArr6[1];
                if (i11 != 0 || i12 != 0) {
                    recyclerView6.dispatchOnScrolled(i11, i12);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z11 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i21 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i22 != 0));
                SmoothScroller smoothScroller2 = RecyclerView.this.mLayout.mSmoothScroller;
                if ((smoothScroller2 == null || !smoothScroller2.isPendingInitialRun()) && z11) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i21 < 0) {
                            i13 = -currVelocity;
                        } else {
                            i13 = i21 > 0 ? currVelocity : 0;
                        }
                        if (i22 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i22 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i13, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.clearPrefetchPositions();
                    }
                } else {
                    postOnAnimation();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    GapWorker gapWorker = recyclerView7.mGapWorker;
                    if (gapWorker != null) {
                        gapWorker.postFromTraversal(recyclerView7, i11, i12);
                    }
                }
            }
            SmoothScroller smoothScroller3 = RecyclerView.this.mLayout.mSmoothScroller;
            if (smoothScroller3 != null && smoothScroller3.isPendingInitialRun()) {
                smoothScroller3.onAnimation(0, 0);
            }
            this.mEatRunOnAnimationRequest = false;
            if (this.mReSchedulePostAnimationCallback) {
                internalPostOnAnimation();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.stopNestedScroll(1);
            }
        }

        public void smoothScrollBy(int i11, int i12, int i13, @Nullable Interpolator interpolator) {
            if (i13 == Integer.MIN_VALUE) {
                i13 = computeScrollDuration(i11, i12);
            }
            int i14 = i13;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.mInterpolator != interpolator) {
                this.mInterpolator = interpolator;
                this.mOverScroller = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.mLastFlingY = 0;
            this.mLastFlingX = 0;
            RecyclerView.this.setScrollState(2);
            this.mOverScroller.startScroll(0, 0, i11, i12, i14);
            postOnAnimation();
        }

        public void stop() {
            RecyclerView.this.removeCallbacks(this);
            this.mOverScroller.abortAnimation();
        }

        private int computeScrollDuration(int i11, int i12) {
            boolean z11;
            int height;
            int iAbs = Math.abs(i11);
            int iAbs2 = Math.abs(i12);
            if (iAbs > iAbs2) {
                z11 = true;
            } else {
                z11 = false;
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (z11) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            if (!z11) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / height) + 1.0f) * 300.0f), 2000);
        }
    }

    public static abstract class ViewHolder {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;

        @NonNull
        public final View itemView;
        Adapter<? extends ViewHolder> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        ViewHolder mShadowedHolder = null;
        ViewHolder mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        Recycler mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        @VisibleForTesting
        int mPendingAccessibilityState = -1;

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public final void setIsRecyclable(boolean z11) {
            int i11 = this.mIsRecyclableCount;
            int i12 = z11 ? i11 - 1 : i11 + 1;
            this.mIsRecyclableCount = i12;
            if (i12 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z11 && i12 == 1) {
                this.mFlags |= 16;
            } else if (z11 && i12 == 0) {
                this.mFlags &= -17;
            }
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i11) {
            this.mFlags = i11 | this.mFlags;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && ViewCompat.hasTransientState(this.itemView);
        }

        public void flagRemovedAndOffsetPosition(int i11, int i12, boolean z11) {
            addFlags(8);
            offsetPosition(i12, z11);
            this.mPosition = i11;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Nullable
        public final Adapter<? extends ViewHolder> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i11 = this.mPreLayoutPosition;
            return i11 == -1 ? this.mPosition : i11;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i11 = this.mPreLayoutPosition;
            return i11 == -1 ? this.mPosition : i11;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i11) {
            return (i11 & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !ViewCompat.hasTransientState(this.itemView);
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i11, boolean z11) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z11) {
                this.mPreLayoutPosition += i11;
            }
            this.mPosition += i11;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).mInsetsDirty = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i11 = this.mPendingAccessibilityState;
            if (i11 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i11;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = ViewCompat.getImportantForAccessibility(this.itemView);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i11, int i12) {
            this.mFlags = (i11 & i12) | (this.mFlags & (~i12));
        }

        public void setScrapContainer(Recycler recycler, boolean z11) {
            this.mScrapContainer = recycler;
            this.mInChangeScrap = z11;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public void unScrap() {
            this.mScrapContainer.unscrapView(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }

        public ViewHolder(@NonNull View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public String toString() {
            String simpleName;
            String str;
            if (getClass().isAnonymousClass()) {
                simpleName = "ViewHolder";
            } else {
                simpleName = getClass().getSimpleName();
            }
            StringBuilder sb2 = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb2.append(" scrap ");
                if (this.mInChangeScrap) {
                    str = "[changeScrap]";
                } else {
                    str = "[attachedScrap]";
                }
                sb2.append(str);
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    public RecyclerView(@NonNull Context context) {
        this(context, null);
    }

    private void animateChange(@NonNull ViewHolder viewHolder, @NonNull ViewHolder viewHolder2, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo2, boolean z11, boolean z12) {
        viewHolder.setIsRecyclable(false);
        if (z11) {
            addAnimatingView(viewHolder);
        }
        if (viewHolder != viewHolder2) {
            if (z12) {
                addAnimatingView(viewHolder2);
            }
            viewHolder.mShadowedHolder = viewHolder2;
            addAnimatingView(viewHolder);
            this.mRecycler.unscrapView(viewHolder);
            viewHolder2.setIsRecyclable(false);
            viewHolder2.mShadowingHolder = viewHolder;
        }
        if (this.mItemAnimator.animateChange(viewHolder, viewHolder2, itemHolderInfo, itemHolderInfo2)) {
            postAnimationRunner();
        }
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(C33978va.f72339h)) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private boolean isPreferredNextFocus(View view, View view2, int i11) {
        int i12;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        byte b11 = -1;
        int i13 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i14 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i15 = rect2.left;
        if ((i14 < i15 || rect.right <= i15) && rect.right < rect2.right) {
            i12 = 1;
        } else {
            int i16 = rect.right;
            int i17 = rect2.right;
            i12 = ((i16 > i17 || i14 >= i17) && i14 > i15) ? -1 : 0;
        }
        int i18 = rect.top;
        int i19 = rect2.top;
        if ((i18 < i19 || rect.bottom <= i19) && rect.bottom < rect2.bottom) {
            b11 = 1;
        } else {
            int i21 = rect.bottom;
            int i22 = rect2.bottom;
            if ((i21 <= i22 && i18 < i22) || i18 <= i19) {
                b11 = 0;
            }
        }
        if (i11 == 1) {
            return b11 < 0 || (b11 == 0 && i12 * i13 < 0);
        }
        if (i11 == 2) {
            return b11 > 0 || (b11 == 0 && i12 * i13 > 0);
        }
        if (i11 == 17) {
            return i12 < 0;
        }
        if (i11 == 33) {
            return b11 < 0;
        }
        if (i11 == 66) {
            return i12 > 0;
        }
        if (i11 == 130) {
            return b11 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i11 + exceptionLabel());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0071  */
    private void pullGlows(float f11, float f12, float f13, float f14) {
        boolean z11;
        boolean z12 = true;
        if (f12 >= 0.0f) {
            if (f12 > 0.0f) {
                ensureRightGlow();
                EdgeEffectCompat.onPullDistance(this.mRightGlow, f12 / getWidth(), f13 / getHeight());
            } else {
                z11 = false;
            }
            if (f14 < 0.0f) {
                ensureTopGlow();
                EdgeEffectCompat.onPullDistance(this.mTopGlow, (-f14) / getHeight(), f11 / getWidth());
            } else if (f14 > 0.0f) {
                ensureBottomGlow();
                EdgeEffectCompat.onPullDistance(this.mBottomGlow, f14 / getHeight(), 1.0f - (f11 / getWidth()));
            } else {
                z12 = z11;
            }
            if (z12 && f12 == 0.0f && f14 == 0.0f) {
                return;
            }
            ViewCompat.postInvalidateOnAnimation(this);
        }
        ensureLeftGlow();
        EdgeEffectCompat.onPullDistance(this.mLeftGlow, (-f12) / getWidth(), 1.0f - (f13 / getHeight()));
        z11 = true;
        if (f14 < 0.0f) {
            ensureTopGlow();
            EdgeEffectCompat.onPullDistance(this.mTopGlow, (-f14) / getHeight(), f11 / getWidth());
        } else if (f14 > 0.0f) {
            ensureBottomGlow();
            EdgeEffectCompat.onPullDistance(this.mBottomGlow, f14 / getHeight(), 1.0f - (f11 / getWidth()));
        } else {
            z12 = z11;
        }
        if (z12) {
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    private boolean shouldAbsorb(@NonNull EdgeEffect edgeEffect, int i11, int i12) {
        if (i11 > 0) {
            return true;
        }
        return getSplineFlingDistance(-i11) < EdgeEffectCompat.getDistance(edgeEffect) * ((float) i12);
    }

    public void addItemDecoration(@NonNull ItemDecoration itemDecoration, int i11) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i11 < 0) {
            this.mItemDecorations.add(itemDecoration);
        } else {
            this.mItemDecorations.add(i11, itemDecoration);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void animateAppearance(@NonNull ViewHolder viewHolder, @Nullable ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        viewHolder.setIsRecyclable(false);
        if (this.mItemAnimator.animateAppearance(viewHolder, itemHolderInfo, itemHolderInfo2)) {
            postAnimationRunner();
        }
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().dispatchNestedPreScroll(i11, i12, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i11, int i12, int i13, int i14, int[] iArr) {
        return getScrollingChildHelper().dispatchNestedScroll(i11, i12, i13, i14, iArr);
    }

    @Nullable
    public ViewHolder findViewHolderForLayoutPosition(int i11) {
        return findViewHolderForPosition(i11, false);
    }

    @Nullable
    @Deprecated
    public ViewHolder findViewHolderForPosition(int i11) {
        return findViewHolderForPosition(i11, false);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().hasNestedScrollingParent();
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void nestedScrollBy(int i11, int i12) {
        nestedScrollByInternal(i11, i12, null, 1);
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    public void recordAnimationInfoIfBouncedHiddenView(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo) {
        viewHolder.setFlags(0, 8192);
        if (this.mState.mTrackOldChangeHolders && viewHolder.isUpdated() && !viewHolder.isRemoved() && !viewHolder.shouldIgnore()) {
            this.mViewInfoStore.addToOldChangeHolders(getChangedHolderKey(viewHolder), viewHolder);
        }
        this.mViewInfoStore.addToPreLayout(viewHolder, itemHolderInfo);
    }

    public void setAdapter(@Nullable Adapter adapter) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void smoothScrollBy(@Px int i11, @Px int i12) {
        smoothScrollBy(i11, i12, null);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i11) {
        return getScrollingChildHelper().startNestedScroll(i11);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        getScrollingChildHelper().stopNestedScroll();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    public void swapAdapter(@Nullable Adapter adapter, boolean z11) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, true, z11);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$7 */
    /* JADX INFO: loaded from: classes34.dex */
    public static /* synthetic */ class C39467 {

        /* JADX INFO: renamed from: $SwitchMap$androidx$recyclerview$widget$RecyclerView$Adapter$StateRestorationPolicy */
        static final /* synthetic */ int[] f3611x3d106619;

        static {
            int[] iArr = new int[Adapter.StateRestorationPolicy.values().length];
            f3611x3d106619 = iArr;
            try {
                iArr[Adapter.StateRestorationPolicy.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3611x3d106619[Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C3908R.attr.recyclerViewStyle);
    }

    private void addAnimatingView(ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        boolean z11 = view.getParent() == this;
        this.mRecycler.unscrapView(getChildViewHolder(view));
        if (viewHolder.isTmpDetached()) {
            this.mChildHelper.attachViewToParent(view, -1, view.getLayoutParams(), true);
        } else if (z11) {
            this.mChildHelper.hide(view);
        } else {
            this.mChildHelper.addView(view, true);
        }
    }

    public static void clearNestedRecyclerViewIfNotNested(@NonNull ViewHolder viewHolder) {
        WeakReference<RecyclerView> weakReference = viewHolder.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == viewHolder.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            viewHolder.mNestedRecyclerView = null;
        }
    }

    private int consumeFlingInStretch(int i11, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i12) {
        if (i11 > 0 && edgeEffect != null && EdgeEffectCompat.getDistance(edgeEffect) != 0.0f) {
            int iRound = Math.round(((-i12) / FLING_DESTRETCH_FACTOR) * EdgeEffectCompat.onPullDistance(edgeEffect, ((-i11) * FLING_DESTRETCH_FACTOR) / i12, 0.5f));
            if (iRound != i11) {
                edgeEffect.finish();
            }
            return i11 - iRound;
        }
        if (i11 >= 0 || edgeEffect2 == null || EdgeEffectCompat.getDistance(edgeEffect2) == 0.0f) {
            return i11;
        }
        float f11 = i12;
        int iRound2 = Math.round((f11 / FLING_DESTRETCH_FACTOR) * EdgeEffectCompat.onPullDistance(edgeEffect2, (i11 * FLING_DESTRETCH_FACTOR) / f11, 0.5f));
        if (iRound2 != i11) {
            edgeEffect2.finish();
        }
        return i11 - iRound2;
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i11, int i12) {
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(LayoutManager.class);
                try {
                    constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i11), Integer.valueOf(i12)};
                } catch (NoSuchMethodException e11) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    } catch (NoSuchMethodException e12) {
                        e12.initCause(e11);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e12);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((LayoutManager) constructor.newInstance(objArr));
            } catch (ClassCastException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e13);
            } catch (ClassNotFoundException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e14);
            } catch (IllegalAccessException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e15);
            } catch (InstantiationException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e16);
            } catch (InvocationTargetException e17) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e17);
            }
        }
    }

    private boolean didChildRangeChange(int i11, int i12) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i11 && iArr[1] == i12) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i11 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i11 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        AccessibilityEventCompat.setContentChangeTypes(accessibilityEventObtain, i11);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void dispatchLayoutStep1() {
        this.mState.assertLayoutStep(1);
        fillRemainingScrollValues(this.mState);
        this.mState.mIsMeasuring = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.clear();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        State state = this.mState;
        state.mTrackOldChangeHolders = state.mRunSimpleAnimations && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        state.mInPreLayout = state.mRunPredictiveAnimations;
        state.mItemCount = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.mRunSimpleAnimations) {
            int childCount = this.mChildHelper.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getChildAt(i11));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.addToPreLayout(childViewHolderInt, this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt, ItemAnimator.buildAdapterChangeFlagsForAnimations(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.mTrackOldChangeHolders && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.addToOldChangeHolders(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.mRunPredictiveAnimations) {
            saveOldPositions();
            State state2 = this.mState;
            boolean z11 = state2.mStructureChanged;
            state2.mStructureChanged = false;
            this.mLayout.onLayoutChildren(this.mRecycler, state2);
            this.mState.mStructureChanged = z11;
            for (int i12 = 0; i12 < this.mChildHelper.getChildCount(); i12++) {
                ViewHolder childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.getChildAt(i12));
                if (!childViewHolderInt2.shouldIgnore() && !this.mViewInfoStore.isInPreLayout(childViewHolderInt2)) {
                    int iBuildAdapterChangeFlagsForAnimations = ItemAnimator.buildAdapterChangeFlagsForAnimations(childViewHolderInt2);
                    boolean zHasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    if (!zHasAnyOfTheFlags) {
                        iBuildAdapterChangeFlagsForAnimations |= 4096;
                    }
                    ItemAnimator.ItemHolderInfo itemHolderInfoRecordPreLayoutInformation = this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt2, iBuildAdapterChangeFlagsForAnimations, childViewHolderInt2.getUnmodifiedPayloads());
                    if (zHasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, itemHolderInfoRecordPreLayoutInformation);
                    } else {
                        this.mViewInfoStore.addToAppearedInPreLayoutHolders(childViewHolderInt2, itemHolderInfoRecordPreLayoutInformation);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.mLayoutStep = 2;
    }

    private void dispatchLayoutStep3() {
        RecyclerView recyclerView;
        this.mState.assertLayoutStep(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        State state = this.mState;
        state.mLayoutStep = 1;
        if (state.mRunSimpleAnimations) {
            for (int childCount = this.mChildHelper.getChildCount() - 1; childCount >= 0; childCount--) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getChildAt(childCount));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    ItemAnimator.ItemHolderInfo itemHolderInfoRecordPostLayoutInformation = this.mItemAnimator.recordPostLayoutInformation(this.mState, childViewHolderInt);
                    ViewHolder fromOldChangeHolders = this.mViewInfoStore.getFromOldChangeHolders(changedHolderKey);
                    if (fromOldChangeHolders == null || fromOldChangeHolders.shouldIgnore()) {
                        this.mViewInfoStore.addToPostLayout(childViewHolderInt, itemHolderInfoRecordPostLayoutInformation);
                    } else {
                        boolean zIsDisappearing = this.mViewInfoStore.isDisappearing(fromOldChangeHolders);
                        boolean zIsDisappearing2 = this.mViewInfoStore.isDisappearing(childViewHolderInt);
                        if (zIsDisappearing && fromOldChangeHolders == childViewHolderInt) {
                            this.mViewInfoStore.addToPostLayout(childViewHolderInt, itemHolderInfoRecordPostLayoutInformation);
                        } else {
                            ItemAnimator.ItemHolderInfo itemHolderInfoPopFromPreLayout = this.mViewInfoStore.popFromPreLayout(fromOldChangeHolders);
                            this.mViewInfoStore.addToPostLayout(childViewHolderInt, itemHolderInfoRecordPostLayoutInformation);
                            ItemAnimator.ItemHolderInfo itemHolderInfoPopFromPostLayout = this.mViewInfoStore.popFromPostLayout(childViewHolderInt);
                            if (itemHolderInfoPopFromPreLayout == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, fromOldChangeHolders);
                            } else {
                                animateChange(fromOldChangeHolders, childViewHolderInt, itemHolderInfoPopFromPreLayout, itemHolderInfoPopFromPostLayout, zIsDisappearing, zIsDisappearing2);
                            }
                        }
                    }
                }
            }
            recyclerView = this;
            recyclerView.mViewInfoStore.process(recyclerView.mViewInfoProcessCallback);
        } else {
            recyclerView = this;
        }
        recyclerView.mLayout.removeAndRecycleScrapInt(recyclerView.mRecycler);
        State state2 = recyclerView.mState;
        state2.mPreviousLayoutItemCount = state2.mItemCount;
        recyclerView.mDataSetHasChangedAfterLayout = false;
        recyclerView.mDispatchItemsChangedEvent = false;
        state2.mRunSimpleAnimations = false;
        state2.mRunPredictiveAnimations = false;
        recyclerView.mLayout.mRequestedSimpleAnimations = false;
        ArrayList<ViewHolder> arrayList = recyclerView.mRecycler.mChangedScrap;
        if (arrayList != null) {
            arrayList.clear();
        }
        LayoutManager layoutManager = recyclerView.mLayout;
        if (layoutManager.mPrefetchMaxObservedInInitialPrefetch) {
            layoutManager.mPrefetchMaxCountObserved = 0;
            layoutManager.mPrefetchMaxObservedInInitialPrefetch = false;
            recyclerView.mRecycler.updateViewCacheSize();
        }
        recyclerView.mLayout.onLayoutCompleted(recyclerView.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        recyclerView.mViewInfoStore.clear();
        int[] iArr = recyclerView.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        OnItemTouchListener onItemTouchListener = this.mInterceptingOnItemTouchListener;
        if (onItemTouchListener == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        onItemTouchListener.onTouchEvent(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int childCount = this.mChildHelper.getChildCount();
        if (childCount == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MIN_VALUE;
        for (int i13 = 0; i13 < childCount; i13++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getChildAt(i13));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i11) {
                    i11 = layoutPosition;
                }
                if (layoutPosition > i12) {
                    i12 = layoutPosition;
                }
            }
        }
        iArr[0] = i11;
        iArr[1] = i12;
    }

    @Nullable
    public static RecyclerView findNestedRecyclerView(@NonNull View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            RecyclerView recyclerViewFindNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i11));
            if (recyclerViewFindNestedRecyclerView != null) {
                return recyclerViewFindNestedRecyclerView;
            }
        }
        return null;
    }

    @Nullable
    private View findNextViewToFocus() {
        ViewHolder viewHolderFindViewHolderForAdapterPosition;
        State state = this.mState;
        int i11 = state.mFocusedItemPosition;
        if (i11 == -1) {
            i11 = 0;
        }
        int itemCount = state.getItemCount();
        for (int i12 = i11; i12 < itemCount; i12++) {
            ViewHolder viewHolderFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i12);
            if (viewHolderFindViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (viewHolderFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return viewHolderFindViewHolderForAdapterPosition2.itemView;
            }
        }
        int iMin = Math.min(itemCount, i11);
        do {
            iMin--;
            if (iMin < 0 || (viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin)) == null) {
                return null;
            }
        } while (!viewHolderFindViewHolderForAdapterPosition.itemView.hasFocusable());
        return viewHolderFindViewHolderForAdapterPosition.itemView;
    }

    public static ViewHolder getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).mViewHolder;
    }

    private NestedScrollingChildHelper getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new NestedScrollingChildHelper(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j11, ViewHolder viewHolder, ViewHolder viewHolder2) {
        int childCount = this.mChildHelper.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getChildAt(i11));
            if (childViewHolderInt != viewHolder && getChangedHolderKey(childViewHolderInt) == j11) {
                Adapter adapter = this.mAdapter;
                if (adapter == null || !adapter.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + viewHolder + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + viewHolder + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + viewHolder2 + " cannot be found but it is necessary for " + viewHolder + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int childCount = this.mChildHelper.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getChildAt(i11));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    private void initChildrenHelper() {
        this.mChildHelper = new ChildHelper(new ChildHelper.Callback() { // from class: androidx.recyclerview.widget.RecyclerView.5
            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public void addView(View view, int i11) {
                RecyclerView.this.addView(view, i11);
                RecyclerView.this.dispatchChildAttached(view);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public View getChildAt(int i11) {
                return RecyclerView.this.getChildAt(i11);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public int getChildCount() {
                return RecyclerView.this.getChildCount();
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public int indexOfChild(View view) {
                return RecyclerView.this.indexOfChild(view);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public void removeViewAt(int i11) {
                View childAt = RecyclerView.this.getChildAt(i11);
                if (childAt != null) {
                    RecyclerView.this.dispatchChildDetached(childAt);
                    childAt.clearAnimation();
                }
                RecyclerView.this.removeViewAt(i11);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public void attachViewToParent(View view, int i11, ViewGroup.LayoutParams layoutParams) {
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                        throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                    }
                    childViewHolderInt.clearTmpDetachFlag();
                }
                RecyclerView.this.attachViewToParent(view, i11, layoutParams);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public void detachViewFromParent(int i11) {
                ViewHolder childViewHolderInt;
                View childAt = getChildAt(i11);
                if (childAt != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt)) != null) {
                    if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                        throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                    }
                    childViewHolderInt.addFlags(256);
                }
                RecyclerView.this.detachViewFromParent(i11);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public ViewHolder getChildViewHolder(View view) {
                return RecyclerView.getChildViewHolderInt(view);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public void onEnteredHiddenState(View view) {
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
                }
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public void onLeftHiddenState(View view) {
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    childViewHolderInt.onLeftHiddenState(RecyclerView.this);
                }
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public void removeAllViews() {
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    RecyclerView.this.dispatchChildDetached(childAt);
                    childAt.clearAnimation();
                }
                RecyclerView.this.removeAllViews();
            }
        });
    }

    private void nestedScrollByInternal(int i11, int i12, @Nullable MotionEvent motionEvent, int i13) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        int i14 = zCanScrollVertically ? (zCanScrollHorizontally ? 1 : 0) | 2 : zCanScrollHorizontally ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iReleaseHorizontalGlow = i11 - releaseHorizontalGlow(i11, height);
        int iReleaseVerticalGlow = i12 - releaseVerticalGlow(i12, width);
        startNestedScroll(i14, i13);
        if (dispatchNestedPreScroll(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, i13)) {
            int[] iArr2 = this.mReusableIntPair;
            iReleaseHorizontalGlow -= iArr2[0];
            iReleaseVerticalGlow -= iArr2[1];
        }
        scrollByInternal(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, motionEvent, i13);
        GapWorker gapWorker = this.mGapWorker;
        if (gapWorker != null && (iReleaseHorizontalGlow != 0 || iReleaseVerticalGlow != 0)) {
            gapWorker.postFromTraversal(this, iReleaseHorizontalGlow, iReleaseVerticalGlow);
        }
        stopNestedScroll(i13);
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z11;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.reset();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.preProcess();
        } else {
            this.mAdapterHelper.consumeUpdatesInOnePass();
        }
        boolean z12 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.mRunSimpleAnimations = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z11 = this.mDataSetHasChangedAfterLayout) || z12 || this.mLayout.mRequestedSimpleAnimations) && (!z11 || this.mAdapter.hasStableIds());
        State state = this.mState;
        state.mRunPredictiveAnimations = state.mRunSimpleAnimations && z12 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled();
    }

    private void recoverFocusFromState() {
        View viewFindViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.isHidden(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.getChildCount() == 0) {
                requestFocus();
                return;
            }
        }
        View viewFindNextViewToFocus = null;
        ViewHolder viewHolderFindViewHolderForItemId = (this.mState.mFocusedItemId == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.mFocusedItemId);
        if (viewHolderFindViewHolderForItemId != null && !this.mChildHelper.isHidden(viewHolderFindViewHolderForItemId.itemView) && viewHolderFindViewHolderForItemId.itemView.hasFocusable()) {
            viewFindNextViewToFocus = viewHolderFindViewHolderForItemId.itemView;
        } else if (this.mChildHelper.getChildCount() > 0) {
            viewFindNextViewToFocus = findNextViewToFocus();
        }
        if (viewFindNextViewToFocus != null) {
            int i11 = this.mState.mFocusedSubChildId;
            if (i11 != -1 && (viewFindViewById = viewFindNextViewToFocus.findViewById(i11)) != null && viewFindViewById.isFocusable()) {
                viewFindNextViewToFocus = viewFindViewById;
            }
            viewFindNextViewToFocus.requestFocus();
        }
    }

    private void releaseGlows() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    private void requestChildOnScreen(@NonNull View view, @Nullable View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.mInsetsDirty) {
                Rect rect = layoutParams2.mDecorInsets;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        State state = this.mState;
        state.mFocusedItemId = -1L;
        state.mFocusedItemPosition = -1;
        state.mFocusedSubChildId = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        int absoluteAdapterPosition;
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        ViewHolder viewHolderFindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (viewHolderFindContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.mFocusedItemId = this.mAdapter.hasStableIds() ? viewHolderFindContainingViewHolder.getItemId() : -1L;
        State state = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            absoluteAdapterPosition = -1;
        } else {
            absoluteAdapterPosition = viewHolderFindContainingViewHolder.isRemoved() ? viewHolderFindContainingViewHolder.mOldPosition : viewHolderFindContainingViewHolder.getAbsoluteAdapterPosition();
        }
        state.mFocusedItemPosition = absoluteAdapterPosition;
        this.mState.mFocusedSubChildId = getDeepestFocusedViewWithId(viewHolderFindContainingViewHolder.itemView);
    }

    private void setAdapterInternal(@Nullable Adapter<?> adapter, boolean z11, boolean z12) {
        Adapter adapter2 = this.mAdapter;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z11 || z12) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.reset();
        Adapter<?> adapter3 = this.mAdapter;
        this.mAdapter = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.mObserver);
            adapter.onAttachedToRecyclerView(this);
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.onAdapterChanged(adapter3, this.mAdapter);
        }
        this.mRecycler.onAdapterChanged(adapter3, this.mAdapter, z11);
        this.mState.mStructureChanged = true;
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z11;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || EdgeEffectCompat.getDistance(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z11 = false;
        } else {
            EdgeEffectCompat.onPullDistance(this.mLeftGlow, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z11 = true;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && EdgeEffectCompat.getDistance(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            EdgeEffectCompat.onPullDistance(this.mRightGlow, 0.0f, motionEvent.getY() / getHeight());
            z11 = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && EdgeEffectCompat.getDistance(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            EdgeEffectCompat.onPullDistance(this.mTopGlow, 0.0f, motionEvent.getX() / getWidth());
            z11 = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 == null || EdgeEffectCompat.getDistance(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z11;
        }
        EdgeEffectCompat.onPullDistance(this.mBottomGlow, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.stop();
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.stopSmoothScroller();
        }
    }

    public void absorbGlows(int i11, int i12) {
        if (i11 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i11);
            }
        }
        if (i12 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i12);
            }
        } else if (i12 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i12);
            }
        }
        if (i11 == 0 && i12 == 0) {
            return;
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i11, int i12) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || !layoutManager.onAddFocusables(this, arrayList, i11, i12)) {
            super.addFocusables(arrayList, i11, i12);
        }
    }

    public void addOnChildAttachStateChangeListener(@NonNull OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(onChildAttachStateChangeListener);
    }

    public void addOnItemTouchListener(@NonNull OnItemTouchListener onItemTouchListener) {
        this.mOnItemTouchListeners.add(onItemTouchListener);
    }

    public void addOnScrollListener(@NonNull OnScrollListener onScrollListener) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(onScrollListener);
    }

    public void addRecyclerListener(@NonNull RecyclerListener recyclerListener) {
        Preconditions.checkArgument(recyclerListener != null, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(recyclerListener);
    }

    public boolean canReuseUpdatedViewHolder(ViewHolder viewHolder) {
        ItemAnimator itemAnimator = this.mItemAnimator;
        return itemAnimator == null || itemAnimator.canReuseUpdatedViewHolder(viewHolder, viewHolder.getUnmodifiedPayloads());
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.mLayout.checkLayoutParams((LayoutParams) layoutParams);
    }

    public void clearOldPositions() {
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        for (int i11 = 0; i11 < unfilteredChildCount; i11++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i11));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        this.mRecycler.clearOldPositions();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i11, int i12) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i11 <= 0) {
            zIsFinished = false;
        } else {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i11 < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i12 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i12 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public int consumeFlingInHorizontalStretch(int i11) {
        return consumeFlingInStretch(i11, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    public int consumeFlingInVerticalStretch(int i11) {
        return consumeFlingInStretch(i11, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            TraceCompat.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            TraceCompat.endSection();
            return;
        }
        if (this.mAdapterHelper.hasPendingUpdates()) {
            if (!this.mAdapterHelper.hasAnyUpdateTypes(4) || this.mAdapterHelper.hasAnyUpdateTypes(11)) {
                if (this.mAdapterHelper.hasPendingUpdates()) {
                    TraceCompat.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    TraceCompat.endSection();
                    return;
                }
                return;
            }
            TraceCompat.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.preProcess();
            if (!this.mLayoutWasDefered) {
                if (hasUpdatedView()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.consumePostponedUpdates();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            TraceCompat.endSection();
        }
    }

    public void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        this.mState.mIsMeasuring = false;
        boolean z11 = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.mLayoutStep == 1) {
            dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else if (this.mAdapterHelper.hasUpdates() || z11 || this.mLayout.getWidth() != getWidth() || this.mLayout.getHeight() != getHeight()) {
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else {
            this.mLayout.setExactMeasureSpecsFrom(this);
        }
        dispatchLayoutStep3();
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i11, int i12, int[] iArr, int[] iArr2, int i13) {
        return getScrollingChildHelper().dispatchNestedPreScroll(i11, i12, iArr, iArr2, i13);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i11, int i12, int i13, int i14, int[] iArr, int i15) {
        return getScrollingChildHelper().dispatchNestedScroll(i11, i12, i13, i14, iArr, i15);
    }

    public void dispatchOnScrollStateChanged(int i11) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.onScrollStateChanged(i11);
        }
        onScrollStateChanged(i11);
        OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(this, i11);
        }
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i11);
            }
        }
    }

    public void dispatchOnScrolled(int i11, int i12) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i11, scrollY - i12);
        onScrolled(i11, i12);
        OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrolled(this, i11, i12);
        }
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i11, i12);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i11;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            ViewHolder viewHolder = this.mPendingAccessibilityImportanceChange.get(size);
            if (viewHolder.itemView.getParent() == this && !viewHolder.shouldIgnore() && (i11 = viewHolder.mPendingAccessibilityState) != -1) {
                ViewCompat.setImportantForAccessibility(viewHolder.itemView, i11);
                viewHolder.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = this.mEdgeEffectFactory.createEdgeEffect(this, 3);
        this.mBottomGlow = edgeEffectCreateEdgeEffect;
        if (this.mClipToPadding) {
            edgeEffectCreateEdgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectCreateEdgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = this.mEdgeEffectFactory.createEdgeEffect(this, 0);
        this.mLeftGlow = edgeEffectCreateEdgeEffect;
        if (this.mClipToPadding) {
            edgeEffectCreateEdgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectCreateEdgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = this.mEdgeEffectFactory.createEdgeEffect(this, 2);
        this.mRightGlow = edgeEffectCreateEdgeEffect;
        if (this.mClipToPadding) {
            edgeEffectCreateEdgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectCreateEdgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = this.mEdgeEffectFactory.createEdgeEffect(this, 1);
        this.mTopGlow = edgeEffectCreateEdgeEffect;
        if (this.mClipToPadding) {
            edgeEffectCreateEdgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectCreateEdgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return C33627eb.f69716f + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    @Nullable
    public View findChildViewUnder(float f11, float f12) {
        for (int childCount = this.mChildHelper.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.mChildHelper.getChildAt(childCount);
            float translationX = childAt.getTranslationX();
            float translationY = childAt.getTranslationY();
            if (f11 >= childAt.getLeft() + translationX && f11 <= childAt.getRight() + translationX && f12 >= childAt.getTop() + translationY && f12 <= childAt.getBottom() + translationY) {
                return childAt;
            }
        }
        return null;
    }

    @Nullable
    public ViewHolder findViewHolderForAdapterPosition(int i11) {
        ViewHolder viewHolder = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        for (int i12 = 0; i12 < unfilteredChildCount; i12++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i12));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i11) {
                if (!this.mChildHelper.isHidden(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                viewHolder = childViewHolderInt;
            }
        }
        return viewHolder;
    }

    public ViewHolder findViewHolderForItemId(long j11) {
        Adapter adapter = this.mAdapter;
        ViewHolder viewHolder = null;
        if (adapter != null && adapter.hasStableIds()) {
            int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
            for (int i11 = 0; i11 < unfilteredChildCount; i11++) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i11));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j11) {
                    if (!this.mChildHelper.isHidden(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    viewHolder = childViewHolderInt;
                }
            }
        }
        return viewHolder;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036 A[SYNTHETIC] */
    @Nullable
    public ViewHolder findViewHolderForPosition(int i11, boolean z11) {
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        ViewHolder viewHolder = null;
        for (int i12 = 0; i12 < unfilteredChildCount; i12++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i12));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z11) {
                    if (childViewHolderInt.mPosition != i11) {
                        continue;
                    } else {
                        if (this.mChildHelper.isHidden(childViewHolderInt.itemView)) {
                            return childViewHolderInt;
                        }
                        viewHolder = childViewHolderInt;
                    }
                } else if (childViewHolderInt.getLayoutPosition() != i11) {
                    continue;
                } else {
                    if (this.mChildHelper.isHidden(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    viewHolder = childViewHolderInt;
                }
            }
        }
        return viewHolder;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean fling(int i11, int i12) {
        int iMax;
        int i13;
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.mLayoutSuppressed) {
            return false;
        }
        int iCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (iCanScrollHorizontally == 0 || Math.abs(i11) < this.mMinFlingVelocity) {
            i11 = 0;
        }
        if (!zCanScrollVertically || Math.abs(i12) < this.mMinFlingVelocity) {
            i12 = 0;
        }
        if (i11 == 0 && i12 == 0) {
            return false;
        }
        if (i11 == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.mLeftGlow;
            if (edgeEffect == null || EdgeEffectCompat.getDistance(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.mRightGlow;
                if (edgeEffect2 == null || EdgeEffectCompat.getDistance(edgeEffect2) == 0.0f) {
                    iMax = 0;
                } else if (shouldAbsorb(this.mRightGlow, i11, getWidth())) {
                    this.mRightGlow.onAbsorb(i11);
                    i11 = 0;
                }
            } else {
                int i14 = -i11;
                if (shouldAbsorb(this.mLeftGlow, i14, getWidth())) {
                    this.mLeftGlow.onAbsorb(i14);
                    i11 = 0;
                }
            }
            iMax = i11;
            i11 = 0;
        }
        if (i12 == 0) {
            i13 = i12;
            i12 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.mTopGlow;
            if (edgeEffect3 == null || EdgeEffectCompat.getDistance(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.mBottomGlow;
                if (edgeEffect4 == null || EdgeEffectCompat.getDistance(edgeEffect4) == 0.0f) {
                    i13 = i12;
                    i12 = 0;
                } else if (shouldAbsorb(this.mBottomGlow, i12, getHeight())) {
                    this.mBottomGlow.onAbsorb(i12);
                    i12 = 0;
                }
            } else {
                int i15 = -i12;
                if (shouldAbsorb(this.mTopGlow, i15, getHeight())) {
                    this.mTopGlow.onAbsorb(i15);
                    i12 = 0;
                }
            }
            i13 = 0;
        }
        if (iMax != 0 || i12 != 0) {
            int i16 = this.mMaxFlingVelocity;
            iMax = Math.max(-i16, Math.min(iMax, i16));
            int i17 = this.mMaxFlingVelocity;
            i12 = Math.max(-i17, Math.min(i12, i17));
            this.mViewFlinger.fling(iMax, i12);
        }
        if (i11 == 0 && i13 == 0) {
            return (iMax == 0 && i12 == 0) ? false : true;
        }
        float f11 = i11;
        float f12 = i13;
        if (!dispatchNestedPreFling(f11, f12)) {
            boolean z11 = iCanScrollHorizontally != 0 || zCanScrollVertically;
            dispatchNestedFling(f11, f12, z11);
            OnFlingListener onFlingListener = this.mOnFlingListener;
            if (onFlingListener != null && onFlingListener.onFling(i11, i13)) {
                return true;
            }
            if (z11) {
                if (zCanScrollVertically) {
                    iCanScrollHorizontally = (iCanScrollHorizontally == true ? 1 : 0) | 2;
                }
                startNestedScroll(iCanScrollHorizontally, 1);
                int i18 = this.mMaxFlingVelocity;
                int iMax2 = Math.max(-i18, Math.min(i11, i18));
                int i19 = this.mMaxFlingVelocity;
                this.mViewFlinger.fling(iMax2, Math.max(-i19, Math.min(i13, i19)));
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i11) {
        View viewOnFocusSearchFailed;
        boolean z11;
        View viewOnInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i11);
        if (viewOnInterceptFocusSearch != null) {
            return viewOnInterceptFocusSearch;
        }
        boolean z12 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z12 && (i11 == 2 || i11 == 1)) {
            if (this.mLayout.canScrollVertically()) {
                int i12 = i11 == 2 ? 130 : 33;
                z11 = focusFinder.findNextFocus(this, view, i12) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i11 = i12;
                }
            } else {
                z11 = false;
            }
            if (!z11 && this.mLayout.canScrollHorizontally()) {
                int i13 = (this.mLayout.getLayoutDirection() == 1) ^ (i11 == 2) ? 66 : 17;
                boolean z13 = focusFinder.findNextFocus(this, view, i13) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i11 = i13;
                }
                z11 = z13;
            }
            if (z11) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i11, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            viewOnFocusSearchFailed = focusFinder.findNextFocus(this, view, i11);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i11);
            if (viewFindNextFocus == null && z12) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                viewOnFocusSearchFailed = this.mLayout.onFocusSearchFailed(view, i11, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                viewOnFocusSearchFailed = viewFindNextFocus;
            }
        }
        if (viewOnFocusSearchFailed == null || viewOnFocusSearchFailed.hasFocusable()) {
            return isPreferredNextFocus(view, viewOnFocusSearchFailed, i11) ? viewOnFocusSearchFailed : super.focusSearch(view, i11);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i11);
        }
        requestChildOnScreen(viewOnFocusSearchFailed, null);
        return view;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.generateDefaultLayoutParams();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Nullable
    public Adapter getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(ViewHolder viewHolder) {
        if (viewHolder.hasAnyOfTheFlags(524) || !viewHolder.isBound()) {
            return -1;
        }
        return this.mAdapterHelper.applyPendingUpdatesToPosition(viewHolder.mPosition);
    }

    @Override // android.view.View
    public int getBaseline() {
        LayoutManager layoutManager = this.mLayout;
        return layoutManager != null ? layoutManager.getBaseline() : super.getBaseline();
    }

    public long getChangedHolderKey(ViewHolder viewHolder) {
        return this.mAdapter.hasStableIds() ? viewHolder.getItemId() : viewHolder.mPosition;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i11, int i12) {
        ChildDrawingOrderCallback childDrawingOrderCallback = this.mChildDrawingOrderCallback;
        return childDrawingOrderCallback == null ? super.getChildDrawingOrder(i11, i12) : childDrawingOrderCallback.onGetChildDrawingOrder(i11, i12);
    }

    public long getChildItemId(@NonNull View view) {
        ViewHolder childViewHolderInt;
        Adapter adapter = this.mAdapter;
        if (adapter == null || !adapter.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    @Nullable
    public RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    @NonNull
    public EdgeEffectFactory getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    @Nullable
    public ItemAnimator getItemAnimator() {
        return this.mItemAnimator;
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    @Nullable
    public LayoutManager getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    @Nullable
    public OnFlingListener getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    @NonNull
    public RecycledViewPool getRecycledViewPool() {
        return this.mRecycler.getRecycledViewPool();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i11) {
        return getScrollingChildHelper().hasNestedScrollingParent(i11);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.hasPendingUpdates();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new AdapterHelper(new AdapterHelper.Callback() { // from class: androidx.recyclerview.widget.RecyclerView.6
            public void dispatchUpdate(AdapterHelper.UpdateOp updateOp) {
                int i11 = updateOp.cmd;
                if (i11 == 1) {
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.mLayout.onItemsAdded(recyclerView, updateOp.positionStart, updateOp.itemCount);
                    return;
                }
                if (i11 == 2) {
                    RecyclerView recyclerView2 = RecyclerView.this;
                    recyclerView2.mLayout.onItemsRemoved(recyclerView2, updateOp.positionStart, updateOp.itemCount);
                } else if (i11 == 4) {
                    RecyclerView recyclerView3 = RecyclerView.this;
                    recyclerView3.mLayout.onItemsUpdated(recyclerView3, updateOp.positionStart, updateOp.itemCount, updateOp.payload);
                } else {
                    if (i11 != 8) {
                        return;
                    }
                    RecyclerView recyclerView4 = RecyclerView.this;
                    recyclerView4.mLayout.onItemsMoved(recyclerView4, updateOp.positionStart, updateOp.itemCount, 1);
                }
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public ViewHolder findViewHolder(int i11) {
                ViewHolder viewHolderFindViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i11, true);
                if (viewHolderFindViewHolderForPosition == null || RecyclerView.this.mChildHelper.isHidden(viewHolderFindViewHolderForPosition.itemView)) {
                    return null;
                }
                return viewHolderFindViewHolderForPosition;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public void markViewHoldersUpdated(int i11, int i12, Object obj) {
                RecyclerView.this.viewRangeUpdate(i11, i12, obj);
                RecyclerView.this.mItemsChanged = true;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public void offsetPositionsForAdd(int i11, int i12) {
                RecyclerView.this.offsetPositionRecordsForInsert(i11, i12);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public void offsetPositionsForMove(int i11, int i12) {
                RecyclerView.this.offsetPositionRecordsForMove(i11, i12);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public void offsetPositionsForRemovingInvisible(int i11, int i12) {
                RecyclerView.this.offsetPositionRecordsForRemove(i11, i12, true);
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mItemsAddedOrRemoved = true;
                recyclerView.mState.mDeletedInvisibleItemCountSincePreviousLayout += i12;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public void offsetPositionsForRemovingLaidOutOrNewView(int i11, int i12) {
                RecyclerView.this.offsetPositionRecordsForRemove(i11, i12, false);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public void onDispatchFirstPass(AdapterHelper.UpdateOp updateOp) {
                dispatchUpdate(updateOp);
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public void onDispatchSecondPass(AdapterHelper.UpdateOp updateOp) {
                dispatchUpdate(updateOp);
            }
        });
    }

    @VisibleForTesting
    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new FastScroller(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C3908R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(C3908R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(C3908R.dimen.fastscroll_margin));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        ItemAnimator itemAnimator = this.mItemAnimator;
        return itemAnimator != null && itemAnimator.isRunning();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    public void jumpToPositionForSmoothScroller(int i11) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i11);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        for (int i11 = 0; i11 < unfilteredChildCount; i11++) {
            ((LayoutParams) this.mChildHelper.getUnfilteredChildAt(i11).getLayoutParams()).mInsetsDirty = true;
        }
        this.mRecycler.markItemDecorInsetsDirty();
    }

    public void markKnownViewsInvalid() {
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        for (int i11 = 0; i11 < unfilteredChildCount; i11++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i11));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.markKnownViewsInvalid();
    }

    public void offsetChildrenHorizontal(@Px int i11) {
        int childCount = this.mChildHelper.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            this.mChildHelper.getChildAt(i12).offsetLeftAndRight(i11);
        }
    }

    public void offsetChildrenVertical(@Px int i11) {
        int childCount = this.mChildHelper.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            this.mChildHelper.getChildAt(i12).offsetTopAndBottom(i11);
        }
    }

    public void offsetPositionRecordsForInsert(int i11, int i12) {
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        for (int i13 = 0; i13 < unfilteredChildCount; i13++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i13));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i11) {
                childViewHolderInt.offsetPosition(i12, false);
                this.mState.mStructureChanged = true;
            }
        }
        this.mRecycler.offsetPositionRecordsForInsert(i11, i12);
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        if (i11 < i12) {
            i15 = -1;
            i14 = i11;
            i13 = i12;
        } else {
            i13 = i11;
            i14 = i12;
            i15 = 1;
        }
        for (int i17 = 0; i17 < unfilteredChildCount; i17++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i17));
            if (childViewHolderInt != null && (i16 = childViewHolderInt.mPosition) >= i14 && i16 <= i13) {
                if (i16 == i11) {
                    childViewHolderInt.offsetPosition(i12 - i11, false);
                } else {
                    childViewHolderInt.offsetPosition(i15, false);
                }
                this.mState.mStructureChanged = true;
            }
        }
        this.mRecycler.offsetPositionRecordsForMove(i11, i12);
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i11, int i12, boolean z11) {
        int i13 = i11 + i12;
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        for (int i14 = 0; i14 < unfilteredChildCount; i14++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i14));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i15 = childViewHolderInt.mPosition;
                if (i15 >= i13) {
                    childViewHolderInt.offsetPosition(-i12, z11);
                    this.mState.mStructureChanged = true;
                } else if (i15 >= i11) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i11 - 1, -i12, z11);
                    this.mState.mStructureChanged = true;
                }
            }
        }
        this.mRecycler.offsetPositionRecordsForRemove(i11, i12, z11);
        requestLayout();
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll(boolean z11) {
        int i11 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i11;
        if (i11 < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z11) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f11;
        float axisValue;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f11 = this.mLayout.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.mLayout.canScrollHorizontally() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.mLayout.canScrollVertically()) {
                    f11 = -axisValue2;
                } else if (this.mLayout.canScrollHorizontally()) {
                    axisValue = axisValue2;
                    f11 = 0.0f;
                } else {
                    f11 = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f11 = 0.0f;
                axisValue = 0.0f;
            }
            if (f11 != 0.0f || axisValue != 0.0f) {
                nestedScrollByInternal((int) (axisValue * this.mScaledHorizontalScrollFactor), (int) (f11 * this.mScaledVerticalScrollFactor), motionEvent, 1);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            return false;
        }
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x11 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x11;
            this.mInitialTouchX = x11;
            int y11 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y11;
            this.mInitialTouchY = y11;
            if (stopGlowAnimations(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i11 = zCanScrollHorizontally;
            if (zCanScrollVertically) {
                i11 = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i11, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x12 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y12 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i12 = x12 - this.mInitialTouchX;
                int i13 = y12 - this.mInitialTouchY;
                if (!zCanScrollHorizontally || Math.abs(i12) <= this.mTouchSlop) {
                    z11 = false;
                } else {
                    this.mLastTouchX = x12;
                    z11 = true;
                }
                if (zCanScrollVertically && Math.abs(i13) > this.mTouchSlop) {
                    this.mLastTouchY = y12;
                    z11 = true;
                }
                if (z11) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x13 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x13;
            this.mInitialTouchX = x13;
            int y13 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y13;
            this.mInitialTouchY = y13;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        TraceCompat.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        TraceCompat.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            defaultOnMeasure(i11, i12);
            return;
        }
        boolean z11 = false;
        if (layoutManager.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i11);
            int mode2 = View.MeasureSpec.getMode(i12);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i11, i12);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z11 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z11;
            if (z11 || this.mAdapter == null) {
                return;
            }
            if (this.mState.mLayoutStep == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(i11, i12);
            this.mState.mIsMeasuring = true;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(i11, i12);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.mIsMeasuring = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i11, i12);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i11, i12);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            State state = this.mState;
            if (state.mRunPredictiveAnimations) {
                state.mInPreLayout = true;
            } else {
                this.mAdapterHelper.consumeUpdatesInOnePass();
                this.mState.mInPreLayout = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.mRunPredictiveAnimations) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        Adapter adapter = this.mAdapter;
        if (adapter != null) {
            this.mState.mItemCount = adapter.getItemCount();
        } else {
            this.mState.mItemCount = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i11, i12);
        stopInterceptRequestLayout(false);
        this.mState.mInPreLayout = false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.getSuperState());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.copyFrom(savedState2);
            return savedState;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            savedState.mLayoutState = layoutManager.onSaveInstanceState();
            return savedState;
        }
        savedState.mLayoutState = null;
        return savedState;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00df A[PHI: r1
      0x00df: PHI (r1v46 int) = (r1v26 int), (r1v50 int) binds: [B:41:0x00c8, B:45:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i11;
        boolean z11;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (dispatchToOnItemTouchListeners(motionEvent)) {
            cancelScroll();
            return true;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            return false;
        }
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.mNestedOffsets;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.mVelocityTracker.addMovement(motionEventObtain);
                this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
                float f11 = zCanScrollHorizontally ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
                float f12 = zCanScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
                if ((f11 == 0.0f && f12 == 0.0f) || !fling((int) f11, (int) f12)) {
                    setScrollState(0);
                }
                resetScroll();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                if (iFindPointerIndex < 0) {
                    Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int iMax = this.mLastTouchX - x11;
                int iMax2 = this.mLastTouchY - y11;
                if (this.mScrollState != 1) {
                    if (zCanScrollHorizontally) {
                        iMax = iMax > 0 ? Math.max(0, iMax - this.mTouchSlop) : Math.min(0, iMax + this.mTouchSlop);
                        if (iMax != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } else {
                        z11 = false;
                    }
                    if (zCanScrollVertically) {
                        iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.mTouchSlop) : Math.min(0, iMax2 + this.mTouchSlop);
                        if (iMax2 != 0) {
                            z11 = true;
                        }
                    }
                    if (z11) {
                        setScrollState(1);
                    }
                }
                if (this.mScrollState == 1) {
                    int[] iArr3 = this.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    int iReleaseHorizontalGlow = iMax - releaseHorizontalGlow(iMax, motionEvent.getY());
                    int iReleaseVerticalGlow = iMax2 - releaseVerticalGlow(iMax2, motionEvent.getX());
                    if (dispatchNestedPreScroll(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, 0)) {
                        int[] iArr4 = this.mReusableIntPair;
                        iReleaseHorizontalGlow -= iArr4[0];
                        iReleaseVerticalGlow -= iArr4[1];
                        int[] iArr5 = this.mNestedOffsets;
                        int i12 = iArr5[0];
                        int[] iArr6 = this.mScrollOffset;
                        iArr5[0] = i12 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int[] iArr7 = this.mScrollOffset;
                    this.mLastTouchX = x11 - iArr7[0];
                    this.mLastTouchY = y11 - iArr7[1];
                    if (scrollByInternal(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    GapWorker gapWorker = this.mGapWorker;
                    if (gapWorker != null && (iReleaseHorizontalGlow != 0 || iReleaseVerticalGlow != 0)) {
                        gapWorker.postFromTraversal(this, iReleaseHorizontalGlow, iReleaseVerticalGlow);
                    }
                }
            } else if (actionMasked == 3) {
                cancelScroll();
            } else if (actionMasked == 5) {
                this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.mLastTouchX = x12;
                this.mInitialTouchX = x12;
                int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.mLastTouchY = y12;
                this.mInitialTouchY = y12;
            } else if (actionMasked == 6) {
                onPointerUp(motionEvent);
            }
            motionEventObtain.recycle();
            return true;
        }
        this.mScrollPointerId = motionEvent.getPointerId(0);
        int x13 = (int) (motionEvent.getX() + 0.5f);
        this.mLastTouchX = x13;
        this.mInitialTouchX = x13;
        int y13 = (int) (motionEvent.getY() + 0.5f);
        this.mLastTouchY = y13;
        this.mInitialTouchY = y13;
        if (zCanScrollVertically) {
            i11 = zCanScrollHorizontally;
            i11 = (zCanScrollHorizontally ? 1 : 0) | 2;
        }
        i11 = zCanScrollHorizontally;
        startNestedScroll(i11, 0);
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        ViewCompat.postOnAnimation(this, this.mItemAnimatorRunner);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z11) {
        this.mDispatchItemsChangedEvent = z11 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void removeAndRecycleViews() {
        ItemAnimator itemAnimator = this.mItemAnimator;
        if (itemAnimator != null) {
            itemAnimator.endAnimations();
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.clear();
    }

    public void removeItemDecoration(@NonNull ItemDecoration itemDecoration) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(itemDecoration);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeOnChildAttachStateChangeListener(@NonNull OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(onChildAttachStateChangeListener);
    }

    public void removeOnItemTouchListener(@NonNull OnItemTouchListener onItemTouchListener) {
        this.mOnItemTouchListeners.remove(onItemTouchListener);
        if (this.mInterceptingOnItemTouchListener == onItemTouchListener) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(@NonNull OnScrollListener onScrollListener) {
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            list.remove(onScrollListener);
        }
    }

    public void removeRecyclerListener(@NonNull RecyclerListener recyclerListener) {
        this.mRecyclerListeners.remove(recyclerListener);
    }

    public void repositionShadowingViews() {
        ViewHolder viewHolder;
        int childCount = this.mChildHelper.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = this.mChildHelper.getChildAt(i11);
            ViewHolder childViewHolder = getChildViewHolder(childAt);
            if (childViewHolder != null && (viewHolder = childViewHolder.mShadowingHolder) != null) {
                View view = viewHolder.itemView;
                int left = childAt.getLeft();
                int top = childAt.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z11) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        int size = this.mOnItemTouchListeners.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.mOnItemTouchListeners.get(i11).onRequestDisallowInterceptTouchEvent(z11);
        }
        super.requestDisallowInterceptTouchEvent(z11);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        for (int i11 = 0; i11 < unfilteredChildCount; i11++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i11));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i11, int i12) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i11 = 0;
            }
            if (!zCanScrollVertically) {
                i12 = 0;
            }
            scrollByInternal(i11, i12, null, 0);
        }
    }

    public boolean scrollByInternal(int i11, int i12, MotionEvent motionEvent, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i11, i12, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i18 = iArr2[0];
            int i19 = iArr2[1];
            i16 = i11 - i18;
            i17 = i12 - i19;
            i15 = i19;
            i14 = i18;
        } else {
            i14 = 0;
            i15 = 0;
            i16 = 0;
            i17 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i14, i15, i16, i17, this.mScrollOffset, i13, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i21 = iArr4[0];
        int i22 = i16 - i21;
        int i23 = iArr4[1];
        int i24 = i17 - i23;
        boolean z11 = (i21 == 0 && i23 == 0) ? false : true;
        int i25 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i26 = iArr5[0];
        this.mLastTouchX = i25 - i26;
        int i27 = this.mLastTouchY;
        int i28 = iArr5[1];
        this.mLastTouchY = i27 - i28;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i26;
        iArr6[1] = iArr6[1] + i28;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !MotionEventCompat.isFromSource(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i22, motionEvent.getY(), i24);
            }
            considerReleasingGlowsOnScroll(i11, i12);
        }
        if (i14 != 0 || i15 != 0) {
            dispatchOnScrolled(i14, i15);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z11 && i14 == 0 && i15 == 0) ? false : true;
    }

    @Override // android.view.View
    public void scrollTo(int i11, int i12) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i11) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            layoutManager.scrollToPosition(i11);
            awakenScrollBars();
        }
    }

    public void setAccessibilityDelegateCompat(@Nullable RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
        this.mAccessibilityDelegate = recyclerViewAccessibilityDelegate;
        ViewCompat.setAccessibilityDelegate(this, recyclerViewAccessibilityDelegate);
    }

    public void setChildDrawingOrderCallback(@Nullable ChildDrawingOrderCallback childDrawingOrderCallback) {
        if (childDrawingOrderCallback == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = childDrawingOrderCallback;
        setChildrenDrawingOrderEnabled(childDrawingOrderCallback != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z11) {
        if (z11 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z11;
        super.setClipToPadding(z11);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setHasFixedSize(boolean z11) {
        this.mHasFixedSize = z11;
    }

    public void setItemAnimator(@Nullable ItemAnimator itemAnimator) {
        ItemAnimator itemAnimator2 = this.mItemAnimator;
        if (itemAnimator2 != null) {
            itemAnimator2.endAnimations();
            this.mItemAnimator.setListener(null);
        }
        this.mItemAnimator = itemAnimator;
        if (itemAnimator != null) {
            itemAnimator.setListener(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i11) {
        this.mRecycler.setViewCacheSize(i11);
    }

    public void setLayoutManager(@Nullable LayoutManager layoutManager) {
        if (layoutManager == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            ItemAnimator itemAnimator = this.mItemAnimator;
            if (itemAnimator != null) {
                itemAnimator.endAnimations();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            this.mRecycler.clear();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            this.mRecycler.clear();
        }
        this.mChildHelper.removeAllViewsUnfiltered();
        this.mLayout = layoutManager;
        if (layoutManager != null) {
            if (layoutManager.mRecyclerView != null) {
                throw new IllegalArgumentException("LayoutManager " + layoutManager + " is already attached to a RecyclerView:" + layoutManager.mRecyclerView.exceptionLabel());
            }
            layoutManager.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.updateViewCacheSize();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    public void setOnFlingListener(@Nullable OnFlingListener onFlingListener) {
        this.mOnFlingListener = onFlingListener;
    }

    @Deprecated
    public void setOnScrollListener(@Nullable OnScrollListener onScrollListener) {
        this.mScrollListener = onScrollListener;
    }

    public void setPreserveFocusAfterLayout(boolean z11) {
        this.mPreserveFocusAfterLayout = z11;
    }

    public void setRecycledViewPool(@Nullable RecycledViewPool recycledViewPool) {
        this.mRecycler.setRecycledViewPool(recycledViewPool);
    }

    @Deprecated
    public void setRecyclerListener(@Nullable RecyclerListener recyclerListener) {
        this.mRecyclerListener = recyclerListener;
    }

    public void setScrollState(int i11) {
        if (i11 == this.mScrollState) {
            return;
        }
        this.mScrollState = i11;
        if (i11 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i11);
    }

    public void setViewCacheExtension(@Nullable ViewCacheExtension viewCacheExtension) {
        this.mRecycler.setViewCacheExtension(viewCacheExtension);
    }

    public void smoothScrollBy(@Px int i11, @Px int i12, @Nullable Interpolator interpolator) {
        smoothScrollBy(i11, i12, interpolator, Integer.MIN_VALUE);
    }

    public void smoothScrollToPosition(int i11) {
        if (this.mLayoutSuppressed) {
            return;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            layoutManager.smoothScrollToPosition(this, this.mState, i11);
        }
    }

    public void startInterceptRequestLayout() {
        int i11 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i11;
        if (i11 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int i11, int i12) {
        return getScrollingChildHelper().startNestedScroll(i11, i12);
    }

    public void stopInterceptRequestLayout(boolean z11) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z11 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z11 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int i11) {
        getScrollingChildHelper().stopNestedScroll(i11);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z11) {
        if (z11 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z11) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void viewRangeUpdate(int i11, int i12, Object obj) {
        int i13;
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        int i14 = i11 + i12;
        for (int i15 = 0; i15 < unfilteredChildCount; i15++) {
            View unfilteredChildAt = this.mChildHelper.getUnfilteredChildAt(i15);
            ViewHolder childViewHolderInt = getChildViewHolderInt(unfilteredChildAt);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i13 = childViewHolderInt.mPosition) >= i11 && i13 < i14) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((LayoutParams) unfilteredChildAt.getLayoutParams()).mInsetsDirty = true;
            }
        }
        this.mRecycler.viewRangeUpdate(i11, i12);
    }

    static {
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new Interpolator() { // from class: androidx.recyclerview.widget.RecyclerView.3
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f11) {
                float f12 = f11 - 1.0f;
                return (f12 * f12 * f12 * f12 * f12) + 1.0f;
            }
        };
        sDefaultEdgeEffectFactory = new StretchEdgeEffectFactory();
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mObserver = new RecyclerViewDataObserver();
        this.mRecycler = new Recycler();
        this.mViewInfoStore = new ViewInfoStore();
        this.mUpdateChildViewsRunnable = new Runnable() { // from class: androidx.recyclerview.widget.RecyclerView.1
            @Override // java.lang.Runnable
            public void run() {
                RecyclerView recyclerView = RecyclerView.this;
                if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                    return;
                }
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.mIsAttached) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.mLayoutSuppressed) {
                    recyclerView2.mLayoutWasDefered = true;
                } else {
                    recyclerView2.consumePendingUpdateOperations();
                }
            }
        };
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        this.mItemAnimator = new DefaultItemAnimator();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new ViewFlinger();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new GapWorker.LayoutPrefetchRegistryImpl() : null;
        this.mState = new State();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new ItemAnimatorRestoreListener();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new Runnable() { // from class: androidx.recyclerview.widget.RecyclerView.2
            @Override // java.lang.Runnable
            public void run() {
                ItemAnimator itemAnimator = RecyclerView.this.mItemAnimator;
                if (itemAnimator != null) {
                    itemAnimator.runPendingAnimations();
                }
                RecyclerView.this.mPostedAnimatorRunner = false;
            }
        };
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new ViewInfoStore.ProcessCallback() { // from class: androidx.recyclerview.widget.RecyclerView.4
            @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
            public void processPersistent(ViewHolder viewHolder, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo2) {
                viewHolder.setIsRecyclable(false);
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mDataSetHasChangedAfterLayout) {
                    if (recyclerView.mItemAnimator.animateChange(viewHolder, viewHolder, itemHolderInfo, itemHolderInfo2)) {
                        RecyclerView.this.postAnimationRunner();
                    }
                } else if (recyclerView.mItemAnimator.animatePersistence(viewHolder, itemHolderInfo, itemHolderInfo2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            }

            @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
            public void processAppeared(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2) {
                RecyclerView.this.animateAppearance(viewHolder, itemHolderInfo, itemHolderInfo2);
            }

            @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
            public void processDisappeared(ViewHolder viewHolder, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo, @Nullable ItemAnimator.ItemHolderInfo itemHolderInfo2) {
                RecyclerView.this.mRecycler.unscrapView(viewHolder);
                RecyclerView.this.animateDisappearance(viewHolder, itemHolderInfo, itemHolderInfo2);
            }

            @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
            public void unused(ViewHolder viewHolder) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.removeAndRecycleView(viewHolder.itemView, recyclerView.mRecycler);
            }
        };
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.setListener(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new RecyclerViewAccessibilityDelegate(this));
        int[] iArr = C3908R.styleable.RecyclerView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i11, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i11, 0);
        String string = typedArrayObtainStyledAttributes.getString(C3908R.styleable.RecyclerView_layoutManager);
        if (typedArrayObtainStyledAttributes.getInt(C3908R.styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(C3908R.styleable.RecyclerView_android_clipToPadding, true);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(C3908R.styleable.RecyclerView_fastScrollEnabled, false);
        this.mEnableFastScroller = z11;
        if (z11) {
            initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(C3908R.styleable.RecyclerView_fastScrollVerticalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(C3908R.styleable.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(C3908R.styleable.RecyclerView_fastScrollHorizontalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(C3908R.styleable.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        typedArrayObtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i11, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i11, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i11, 0);
        boolean z12 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z12);
        PoolingContainer.setPoolingContainer(this, true);
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    private void dispatchLayoutStep2() {
        boolean z11;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.assertLayoutStep(6);
        this.mAdapterHelper.consumeUpdatesInOnePass();
        this.mState.mItemCount = this.mAdapter.getItemCount();
        this.mState.mDeletedInvisibleItemCountSincePreviousLayout = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.mLayoutState;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        State state = this.mState;
        state.mInPreLayout = false;
        this.mLayout.onLayoutChildren(this.mRecycler, state);
        State state2 = this.mState;
        state2.mStructureChanged = false;
        if (state2.mRunSimpleAnimations && this.mItemAnimator != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        state2.mRunSimpleAnimations = z11;
        state2.mLayoutStep = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i11 = 0; i11 < size; i11++) {
            OnItemTouchListener onItemTouchListener = this.mOnItemTouchListeners.get(i11);
            if (onItemTouchListener.onInterceptTouchEvent(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = onItemTouchListener;
                return true;
            }
        }
        return false;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.mDecorInsets;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private float getSplineFlingDistance(int i11) {
        double dLog = Math.log((Math.abs(i11) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        float f11 = DECELERATION_RATE;
        return (float) (((double) (this.mPhysicalCoef * SCROLL_FRICTION)) * Math.exp((((double) f11) / (((double) f11) - 1.0d)) * dLog));
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (ViewCompat.getImportantForAutofill(this) == 0) {
            ViewCompat.setImportantForAutofill(this, 8);
        }
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int i11;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            if (actionIndex == 0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            this.mScrollPointerId = motionEvent.getPointerId(i11);
            int x11 = (int) (motionEvent.getX(i11) + 0.5f);
            this.mLastTouchX = x11;
            this.mInitialTouchX = x11;
            int y11 = (int) (motionEvent.getY(i11) + 0.5f);
            this.mLastTouchY = y11;
            this.mInitialTouchY = y11;
        }
    }

    private int releaseHorizontalGlow(int i11, float f11) {
        float height = f11 / getHeight();
        float width = i11 / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f12 = 0.0f;
        if (edgeEffect != null && EdgeEffectCompat.getDistance(edgeEffect) != 0.0f) {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f13 = -EdgeEffectCompat.onPullDistance(this.mLeftGlow, -width, 1.0f - height);
                if (EdgeEffectCompat.getDistance(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f12 = f13;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && EdgeEffectCompat.getDistance(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float fOnPullDistance = EdgeEffectCompat.onPullDistance(this.mRightGlow, width, height);
                    if (EdgeEffectCompat.getDistance(this.mRightGlow) == 0.0f) {
                        this.mRightGlow.onRelease();
                    }
                    f12 = fOnPullDistance;
                }
                invalidate();
            }
        }
        return Math.round(f12 * getWidth());
    }

    private int releaseVerticalGlow(int i11, float f11) {
        float width = f11 / getWidth();
        float height = i11 / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f12 = 0.0f;
        if (edgeEffect != null && EdgeEffectCompat.getDistance(edgeEffect) != 0.0f) {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f13 = -EdgeEffectCompat.onPullDistance(this.mTopGlow, -height, width);
                if (EdgeEffectCompat.getDistance(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f12 = f13;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && EdgeEffectCompat.getDistance(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float fOnPullDistance = EdgeEffectCompat.onPullDistance(this.mBottomGlow, height, 1.0f - width);
                    if (EdgeEffectCompat.getDistance(this.mBottomGlow) == 0.0f) {
                        this.mBottomGlow.onRelease();
                    }
                    f12 = fOnPullDistance;
                }
                invalidate();
            }
        }
        return Math.round(f12 * getHeight());
    }

    public void animateDisappearance(@NonNull ViewHolder viewHolder, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo, @Nullable ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        addAnimatingView(viewHolder);
        viewHolder.setIsRecyclable(false);
        if (this.mItemAnimator.animateDisappearance(viewHolder, itemHolderInfo, itemHolderInfo2)) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (!isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str + exceptionLabel());
        }
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str);
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + exceptionLabel()));
        }
    }

    public void defaultOnMeasure(int i11, int i12) {
        setMeasuredDimension(LayoutManager.chooseSize(i11, getPaddingLeft() + getPaddingRight(), ViewCompat.getMinimumWidth(this)), LayoutManager.chooseSize(i12, getPaddingTop() + getPaddingBottom(), ViewCompat.getMinimumHeight(this)));
    }

    public void dispatchChildAttached(View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        Adapter adapter = this.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewAttachedToWindow(childViewHolderInt);
        }
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewAttachedToWindow(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        Adapter adapter = this.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewDetachedFromWindow(view);
            }
        }
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f11, float f12, boolean z11) {
        return getScrollingChildHelper().dispatchNestedFling(f11, f12, z11);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f11, float f12) {
        return getScrollingChildHelper().dispatchNestedPreFling(f11, f12);
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public final void dispatchNestedScroll(int i11, int i12, int i13, int i14, int[] iArr, int i15, @NonNull int[] iArr2) {
        getScrollingChildHelper().dispatchNestedScroll(i11, i12, i13, i14, iArr, i15, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z11;
        int paddingTop;
        boolean z12;
        boolean z13;
        int paddingBottom;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z14 = false;
        for (int i11 = 0; i11 < size; i11++) {
            this.mItemDecorations.get(i11).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z15 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int iSave = canvas.save();
            if (this.mClipToPadding) {
                paddingBottom = getPaddingBottom();
            } else {
                paddingBottom = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z11 = true;
            } else {
                z11 = false;
            }
            canvas.restoreToCount(iSave);
        } else {
            z11 = false;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z13 = true;
            } else {
                z13 = false;
            }
            z11 |= z13;
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            if (this.mClipToPadding) {
                paddingTop = getPaddingTop();
            } else {
                paddingTop = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z12 = true;
            } else {
                z12 = false;
            }
            z11 |= z12;
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z14 = true;
            }
            z11 |= z14;
            canvas.restoreToCount(iSave4);
        }
        if (z11 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.isRunning()) {
            z15 = z11;
        }
        if (z15) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j11) {
        return super.drawChild(canvas, view, j11);
    }

    public final void fillRemainingScrollValues(State state) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.mOverScroller;
            state.mRemainingScrollHorizontal = overScroller.getFinalX() - overScroller.getCurrX();
            state.mRemainingScrollVertical = overScroller.getFinalY() - overScroller.getCurrY();
        } else {
            state.mRemainingScrollHorizontal = 0;
            state.mRemainingScrollVertical = 0;
        }
    }

    @Nullable
    public View findContainingItemView(@NonNull View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    @Nullable
    public ViewHolder findContainingViewHolder(@NonNull View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    public int getChildAdapterPosition(@NonNull View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public int getChildLayoutPosition(@NonNull View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(@NonNull View view) {
        return getChildAdapterPosition(view);
    }

    public ViewHolder getChildViewHolder(@NonNull View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return getChildViewHolderInt(view);
    }

    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public Rect getItemDecorInsetsForChild(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.mInsetsDirty) {
            return layoutParams.mDecorInsets;
        }
        if (this.mState.isPreLayout() && (layoutParams.isItemChanged() || layoutParams.isViewInvalid())) {
            return layoutParams.mDecorInsets;
        }
        Rect rect = layoutParams.mDecorInsets;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i11).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i12 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i12 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.mInsetsDirty = false;
        return rect;
    }

    @NonNull
    public ItemDecoration getItemDecorationAt(int i11) {
        int itemDecorationCount = getItemDecorationCount();
        if (i11 >= 0 && i11 < itemDecorationCount) {
            return this.mItemDecorations.get(i11);
        }
        throw new IndexOutOfBoundsException(i11 + " is an invalid index for size " + itemDecorationCount);
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().isNestedScrollingEnabled();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        boolean z11 = true;
        this.mIsAttached = true;
        if (!this.mFirstLayoutComplete || isLayoutRequested()) {
            z11 = false;
        }
        this.mFirstLayoutComplete = z11;
        this.mRecycler.onAttachedToWindow();
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal<GapWorker> threadLocal = GapWorker.sGapWorker;
            GapWorker gapWorker = threadLocal.get();
            this.mGapWorker = gapWorker;
            if (gapWorker == null) {
                this.mGapWorker = new GapWorker();
                Display display = ViewCompat.getDisplay(this);
                if (!isInEditMode() && display != null) {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                } else {
                    refreshRate = 60.0f;
                }
                GapWorker gapWorker2 = this.mGapWorker;
                gapWorker2.mFrameIntervalNs = (long) (1.0E9f / refreshRate);
                threadLocal.set(gapWorker2);
            }
            this.mGapWorker.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        GapWorker gapWorker;
        super.onDetachedFromWindow();
        ItemAnimator itemAnimator = this.mItemAnimator;
        if (itemAnimator != null) {
            itemAnimator.endAnimations();
        }
        stopScroll();
        this.mIsAttached = false;
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.onDetach();
        this.mRecycler.onDetachedFromWindow();
        PoolingContainer.callPoolingContainerOnReleaseForChildren(this);
        if (ALLOW_THREAD_GAP_WORK && (gapWorker = this.mGapWorker) != null) {
            gapWorker.remove(this);
            this.mGapWorker = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.mItemDecorations.get(i11).onDraw(canvas, this, this.mState);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i11, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i11, rect);
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (i11 == i13 && i12 == i14) {
            return;
        }
        invalidateGlows();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean zRemoveViewIfHidden = this.mChildHelper.removeViewIfHidden(view);
        if (zRemoveViewIfHidden) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.unscrapView(childViewHolderInt);
            this.mRecycler.recycleViewHolderInternal(childViewHolderInt);
        }
        stopInterceptRequestLayout(!zRemoveViewIfHidden);
        return zRemoveViewIfHidden;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z11) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z11);
    }

    public void removeItemDecorationAt(int i11) {
        int itemDecorationCount = getItemDecorationCount();
        if (i11 >= 0 && i11 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i11));
            return;
        }
        throw new IndexOutOfBoundsException(i11 + " is an invalid index for size " + itemDecorationCount);
    }

    public void scrollStep(int i11, int i12, @Nullable int[] iArr) {
        int iScrollHorizontallyBy;
        int iScrollVerticallyBy;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        TraceCompat.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        if (i11 != 0) {
            iScrollHorizontallyBy = this.mLayout.scrollHorizontallyBy(i11, this.mRecycler, this.mState);
        } else {
            iScrollHorizontallyBy = 0;
        }
        if (i12 != 0) {
            iScrollVerticallyBy = this.mLayout.scrollVerticallyBy(i12, this.mRecycler, this.mState);
        } else {
            iScrollVerticallyBy = 0;
        }
        TraceCompat.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    @VisibleForTesting
    public boolean setChildImportantForAccessibilityInternal(ViewHolder viewHolder, int i11) {
        if (isComputingLayout()) {
            viewHolder.mPendingAccessibilityState = i11;
            this.mPendingAccessibilityImportanceChange.add(viewHolder);
            return false;
        }
        ViewCompat.setImportantForAccessibility(viewHolder.itemView, i11);
        return true;
    }

    public void setEdgeEffectFactory(@NonNull EdgeEffectFactory edgeEffectFactory) {
        Preconditions.checkNotNull(edgeEffectFactory);
        this.mEdgeEffectFactory = edgeEffectFactory;
        invalidateGlows();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z11) {
        suppressLayout(z11);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z11) {
        getScrollingChildHelper().setNestedScrollingEnabled(z11);
    }

    public void setScrollingTouchSlop(int i11) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i11 != 0) {
            if (i11 != 1) {
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i11 + "; using default value");
            } else {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int contentChangeTypes;
        int i11 = 0;
        if (!isComputingLayout()) {
            return false;
        }
        if (accessibilityEvent != null) {
            contentChangeTypes = AccessibilityEventCompat.getContentChangeTypes(accessibilityEvent);
        } else {
            contentChangeTypes = 0;
        }
        if (contentChangeTypes != 0) {
            i11 = contentChangeTypes;
        }
        this.mEatenAccessibilityChangeFlags |= i11;
        return true;
    }

    public void smoothScrollBy(@Px int i11, @Px int i12, @Nullable Interpolator interpolator, int i13) {
        smoothScrollBy(i11, i12, interpolator, i13, false);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    public void smoothScrollBy(@Px int i11, @Px int i12, @Nullable Interpolator interpolator, int i13, boolean z11) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!layoutManager.canScrollHorizontally()) {
            i11 = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i12 = 0;
        }
        if (i11 == 0 && i12 == 0) {
            return;
        }
        if (i13 != Integer.MIN_VALUE && i13 <= 0) {
            scrollBy(i11, i12);
            return;
        }
        if (z11) {
            int i14 = i11 != 0 ? 1 : 0;
            if (i12 != 0) {
                i14 |= 2;
            }
            startNestedScroll(i14, 1);
        }
        this.mViewFlinger.smoothScrollBy(i11, i12, i13, interpolator);
    }

    public void addItemDecoration(@NonNull ItemDecoration itemDecoration) {
        addItemDecoration(itemDecoration, -1);
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static class SimpleOnItemTouchListener implements OnItemTouchListener {
        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean z11) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        }
    }

    public void onChildAttachedToWindow(@NonNull View view) {
    }

    public void onChildDetachedFromWindow(@NonNull View view) {
    }

    public void onScrollStateChanged(int i11) {
    }

    public static abstract class OnScrollListener {
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i11) {
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i11, int i12) {
        }
    }

    public void onScrolled(@Px int i11, @Px int i12) {
    }
}
