package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.FragmentTransaction;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.LayoutManager implements ItemTouchHelper.ViewDropHandler, RecyclerView.SmoothScroller.ScrollVectorProvider {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final AnchorInfo mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final LayoutChunkResult mLayoutChunkResult;
    private LayoutState mLayoutState;
    int mOrientation;
    OrientationHelper mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    public static class AnchorInfo {
        int mCoordinate;
        boolean mLayoutFromEnd;
        OrientationHelper mOrientationHelper;
        int mPosition;
        boolean mValid;

        public void reset() {
            this.mPosition = -1;
            this.mCoordinate = Integer.MIN_VALUE;
            this.mLayoutFromEnd = false;
            this.mValid = false;
        }

        public void assignCoordinateFromPadding() {
            this.mCoordinate = this.mLayoutFromEnd ? this.mOrientationHelper.getEndAfterPadding() : this.mOrientationHelper.getStartAfterPadding();
        }

        public void assignFromView(View view, int i11) {
            if (this.mLayoutFromEnd) {
                this.mCoordinate = this.mOrientationHelper.getDecoratedEnd(view) + this.mOrientationHelper.getTotalSpaceChange();
            } else {
                this.mCoordinate = this.mOrientationHelper.getDecoratedStart(view);
            }
            this.mPosition = i11;
        }

        public void assignFromViewAndKeepVisibleRect(View view, int i11) {
            int totalSpaceChange = this.mOrientationHelper.getTotalSpaceChange();
            if (totalSpaceChange >= 0) {
                assignFromView(view, i11);
                return;
            }
            this.mPosition = i11;
            if (this.mLayoutFromEnd) {
                int endAfterPadding = (this.mOrientationHelper.getEndAfterPadding() - totalSpaceChange) - this.mOrientationHelper.getDecoratedEnd(view);
                this.mCoordinate = this.mOrientationHelper.getEndAfterPadding() - endAfterPadding;
                if (endAfterPadding > 0) {
                    int decoratedMeasurement = this.mCoordinate - this.mOrientationHelper.getDecoratedMeasurement(view);
                    int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
                    int iMin = decoratedMeasurement - (startAfterPadding + Math.min(this.mOrientationHelper.getDecoratedStart(view) - startAfterPadding, 0));
                    if (iMin < 0) {
                        this.mCoordinate += Math.min(endAfterPadding, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int decoratedStart = this.mOrientationHelper.getDecoratedStart(view);
            int startAfterPadding2 = decoratedStart - this.mOrientationHelper.getStartAfterPadding();
            this.mCoordinate = decoratedStart;
            if (startAfterPadding2 > 0) {
                int endAfterPadding2 = (this.mOrientationHelper.getEndAfterPadding() - Math.min(0, (this.mOrientationHelper.getEndAfterPadding() - totalSpaceChange) - this.mOrientationHelper.getDecoratedEnd(view))) - (decoratedStart + this.mOrientationHelper.getDecoratedMeasurement(view));
                if (endAfterPadding2 < 0) {
                    this.mCoordinate -= Math.min(startAfterPadding2, -endAfterPadding2);
                }
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.mPosition + ", mCoordinate=" + this.mCoordinate + ", mLayoutFromEnd=" + this.mLayoutFromEnd + ", mValid=" + this.mValid + '}';
        }

        public AnchorInfo() {
            reset();
        }

        public boolean isViewValidAsAnchor(View view, RecyclerView.State state) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (!layoutParams.isItemRemoved() && layoutParams.getViewLayoutPosition() >= 0 && layoutParams.getViewLayoutPosition() < state.getItemCount()) {
                return true;
            }
            return false;
        }
    }

    public static class LayoutChunkResult {
        public int mConsumed;
        public boolean mFinished;
        public boolean mFocusable;
        public boolean mIgnoreConsumed;

        public void resetInternal() {
            this.mConsumed = 0;
            this.mFinished = false;
            this.mIgnoreConsumed = false;
            this.mFocusable = false;
        }
    }

    public static class LayoutState {
        static final int INVALID_LAYOUT = Integer.MIN_VALUE;
        static final int ITEM_DIRECTION_HEAD = -1;
        static final int ITEM_DIRECTION_TAIL = 1;
        static final int LAYOUT_END = 1;
        static final int LAYOUT_START = -1;
        static final int SCROLLING_OFFSET_NaN = Integer.MIN_VALUE;
        static final String TAG = "LLM#LayoutState";
        int mAvailable;
        int mCurrentPosition;
        boolean mInfinite;
        int mItemDirection;
        int mLastScrollDelta;
        int mLayoutDirection;
        int mOffset;
        int mScrollingOffset;
        boolean mRecycle = true;
        int mExtraFillSpace = 0;
        int mNoRecycleSpace = 0;
        boolean mIsPreLayout = false;
        List<RecyclerView.ViewHolder> mScrapList = null;

        public void assignPositionFromScrapList() {
            assignPositionFromScrapList(null);
        }

        private View nextViewFromScrapList() {
            int size = this.mScrapList.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = this.mScrapList.get(i11).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!layoutParams.isItemRemoved() && this.mCurrentPosition == layoutParams.getViewLayoutPosition()) {
                    assignPositionFromScrapList(view);
                    return view;
                }
            }
            return null;
        }

        public void assignPositionFromScrapList(View view) {
            View viewNextViewInLimitedList = nextViewInLimitedList(view);
            if (viewNextViewInLimitedList == null) {
                this.mCurrentPosition = -1;
            } else {
                this.mCurrentPosition = ((RecyclerView.LayoutParams) viewNextViewInLimitedList.getLayoutParams()).getViewLayoutPosition();
            }
        }

        public boolean hasMore(RecyclerView.State state) {
            int i11 = this.mCurrentPosition;
            return i11 >= 0 && i11 < state.getItemCount();
        }

        public void log() {
            Log.d(TAG, "avail:" + this.mAvailable + ", ind:" + this.mCurrentPosition + ", dir:" + this.mItemDirection + ", offset:" + this.mOffset + ", layoutDir:" + this.mLayoutDirection);
        }

        public View next(RecyclerView.Recycler recycler) {
            if (this.mScrapList != null) {
                return nextViewFromScrapList();
            }
            View viewForPosition = recycler.getViewForPosition(this.mCurrentPosition);
            this.mCurrentPosition += this.mItemDirection;
            return viewForPosition;
        }

        public View nextViewInLimitedList(View view) {
            int viewLayoutPosition;
            int size = this.mScrapList.size();
            View view2 = null;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < size; i12++) {
                View view3 = this.mScrapList.get(i12).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.isItemRemoved() && (viewLayoutPosition = (layoutParams.getViewLayoutPosition() - this.mCurrentPosition) * this.mItemDirection) >= 0 && viewLayoutPosition < i11) {
                    if (viewLayoutPosition == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i11 = viewLayoutPosition;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.recyclerview.widget.LinearLayoutManager.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        };
        boolean mAnchorLayoutFromEnd;
        int mAnchorOffset;
        int mAnchorPosition;

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void invalidateAnchor() {
            this.mAnchorPosition = -1;
        }

        public SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mAnchorOffset = parcel.readInt();
            this.mAnchorLayoutFromEnd = parcel.readInt() == 1;
        }

        public boolean hasValidAnchor() {
            return this.mAnchorPosition >= 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mAnchorOffset);
            parcel.writeInt(this.mAnchorLayoutFromEnd ? 1 : 0);
        }

        @SuppressLint({"UnknownNullness"})
        public SavedState(SavedState savedState) {
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mAnchorOffset = savedState.mAnchorOffset;
            this.mAnchorLayoutFromEnd = savedState.mAnchorLayoutFromEnd;
        }
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private void updateLayoutStateToFillEnd(AnchorInfo anchorInfo) {
        updateLayoutStateToFillEnd(anchorInfo.mPosition, anchorInfo.mCoordinate);
    }

    private void updateLayoutStateToFillStart(AnchorInfo anchorInfo) {
        updateLayoutStateToFillStart(anchorInfo.mPosition, anchorInfo.mCoordinate);
    }

    public int convertFocusDirectionToLayoutDirection(int i11) {
        if (i11 == 1) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
        }
        if (i11 == 2) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1;
        }
        if (i11 == 17) {
            return this.mOrientation == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i11 == 33) {
            return this.mOrientation == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i11 != 66) {
            return (i11 == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.mOrientation == 0 ? 1 : Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public void setReverseLayout(boolean z11) {
        assertNotInLayoutOrScroll(null);
        if (z11 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z11;
        requestLayout();
    }

    public void setStackFromEnd(boolean z11) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z11) {
            return;
        }
        this.mStackFromEnd = z11;
        requestLayout();
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context, int i11, boolean z11) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new AnchorInfo();
        this.mLayoutChunkResult = new LayoutChunkResult();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i11);
        setReverseLayout(z11);
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
        return this.mShouldReverseLayout ? findFirstPartiallyOrCompletelyInvisibleChild() : findLastPartiallyOrCompletelyInvisibleChild();
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        return this.mShouldReverseLayout ? findLastPartiallyOrCompletelyInvisibleChild() : findFirstPartiallyOrCompletelyInvisibleChild();
    }

    private int fixLayoutEndGap(int i11, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z11) {
        int endAfterPadding;
        int endAfterPadding2 = this.mOrientationHelper.getEndAfterPadding() - i11;
        if (endAfterPadding2 <= 0) {
            return 0;
        }
        int i12 = -scrollBy(-endAfterPadding2, recycler, state);
        int i13 = i11 + i12;
        if (!z11 || (endAfterPadding = this.mOrientationHelper.getEndAfterPadding() - i13) <= 0) {
            return i12;
        }
        this.mOrientationHelper.offsetChildren(endAfterPadding);
        return endAfterPadding + i12;
    }

    private int fixLayoutStartGap(int i11, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z11) {
        int startAfterPadding;
        int startAfterPadding2 = i11 - this.mOrientationHelper.getStartAfterPadding();
        if (startAfterPadding2 <= 0) {
            return 0;
        }
        int i12 = -scrollBy(startAfterPadding2, recycler, state);
        int i13 = i11 + i12;
        if (!z11 || (startAfterPadding = i13 - this.mOrientationHelper.getStartAfterPadding()) <= 0) {
            return i12;
        }
        this.mOrientationHelper.offsetChildren(-startAfterPadding);
        return i12 - startAfterPadding;
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private void logChildren() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.getDecoratedStart(childAt));
        }
        Log.d(TAG, "==============");
    }

    private void recycleByLayoutState(RecyclerView.Recycler recycler, LayoutState layoutState) {
        if (!layoutState.mRecycle || layoutState.mInfinite) {
            return;
        }
        int i11 = layoutState.mScrollingOffset;
        int i12 = layoutState.mNoRecycleSpace;
        if (layoutState.mLayoutDirection == -1) {
            recycleViewsFromEnd(recycler, i11, i12);
        } else {
            recycleViewsFromStart(recycler, i11, i12);
        }
    }

    private void recycleChildren(RecyclerView.Recycler recycler, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        if (i12 <= i11) {
            while (i11 > i12) {
                removeAndRecycleViewAt(i11, recycler);
                i11--;
            }
        } else {
            for (int i13 = i12 - 1; i13 >= i11; i13--) {
                removeAndRecycleViewAt(i13, recycler);
            }
        }
    }

    private void recycleViewsFromStart(RecyclerView.Recycler recycler, int i11, int i12) {
        if (i11 < 0) {
            return;
        }
        int i13 = i11 - i12;
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (this.mOrientationHelper.getDecoratedEnd(childAt) > i13 || this.mOrientationHelper.getTransformedEndWithDecoration(childAt) > i13) {
                    recycleChildren(recycler, 0, i14);
                    return;
                }
            }
            return;
        }
        int i15 = childCount - 1;
        for (int i16 = i15; i16 >= 0; i16--) {
            View childAt2 = getChildAt(i16);
            if (this.mOrientationHelper.getDecoratedEnd(childAt2) > i13 || this.mOrientationHelper.getTransformedEndWithDecoration(childAt2) > i13) {
                recycleChildren(recycler, i15, i16);
                return;
            }
        }
    }

    private void resolveShouldLayoutReverse() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    private void updateLayoutState(int i11, int i12, boolean z11, RecyclerView.State state) {
        int startAfterPadding;
        this.mLayoutState.mInfinite = resolveIsInfinite();
        this.mLayoutState.mLayoutDirection = i11;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(state, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z12 = i11 == 1;
        LayoutState layoutState = this.mLayoutState;
        int i13 = z12 ? iMax2 : iMax;
        layoutState.mExtraFillSpace = i13;
        if (!z12) {
            iMax = iMax2;
        }
        layoutState.mNoRecycleSpace = iMax;
        if (z12) {
            layoutState.mExtraFillSpace = i13 + this.mOrientationHelper.getEndPadding();
            View childClosestToEnd = getChildClosestToEnd();
            LayoutState layoutState2 = this.mLayoutState;
            layoutState2.mItemDirection = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(childClosestToEnd);
            LayoutState layoutState3 = this.mLayoutState;
            layoutState2.mCurrentPosition = position + layoutState3.mItemDirection;
            layoutState3.mOffset = this.mOrientationHelper.getDecoratedEnd(childClosestToEnd);
            startAfterPadding = this.mOrientationHelper.getDecoratedEnd(childClosestToEnd) - this.mOrientationHelper.getEndAfterPadding();
        } else {
            View childClosestToStart = getChildClosestToStart();
            this.mLayoutState.mExtraFillSpace += this.mOrientationHelper.getStartAfterPadding();
            LayoutState layoutState4 = this.mLayoutState;
            layoutState4.mItemDirection = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(childClosestToStart);
            LayoutState layoutState5 = this.mLayoutState;
            layoutState4.mCurrentPosition = position2 + layoutState5.mItemDirection;
            layoutState5.mOffset = this.mOrientationHelper.getDecoratedStart(childClosestToStart);
            startAfterPadding = (-this.mOrientationHelper.getDecoratedStart(childClosestToStart)) + this.mOrientationHelper.getStartAfterPadding();
        }
        LayoutState layoutState6 = this.mLayoutState;
        layoutState6.mAvailable = i12;
        if (z11) {
            layoutState6.mAvailable = i12 - startAfterPadding;
        }
        layoutState6.mScrollingOffset = startAfterPadding;
    }

    private void updateLayoutStateToFillEnd(int i11, int i12) {
        this.mLayoutState.mAvailable = this.mOrientationHelper.getEndAfterPadding() - i12;
        LayoutState layoutState = this.mLayoutState;
        layoutState.mItemDirection = this.mShouldReverseLayout ? -1 : 1;
        layoutState.mCurrentPosition = i11;
        layoutState.mLayoutDirection = 1;
        layoutState.mOffset = i12;
        layoutState.mScrollingOffset = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(int i11, int i12) {
        this.mLayoutState.mAvailable = i12 - this.mOrientationHelper.getStartAfterPadding();
        LayoutState layoutState = this.mLayoutState;
        layoutState.mCurrentPosition = i11;
        layoutState.mItemDirection = this.mShouldReverseLayout ? 1 : -1;
        layoutState.mLayoutDirection = -1;
        layoutState.mOffset = i12;
        layoutState.mScrollingOffset = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void collectAdjacentPrefetchPositions(int i11, int i12, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        if (this.mOrientation != 0) {
            i11 = i12;
        }
        if (getChildCount() == 0 || i11 == 0) {
            return;
        }
        ensureLayoutState();
        updateLayoutState(i11 > 0 ? 1 : -1, Math.abs(i11), true, state);
        collectPrefetchPositionsForLayoutState(state, this.mLayoutState, layoutPrefetchRegistry);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int i11, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        boolean z11;
        int i12;
        SavedState savedState = this.mPendingSavedState;
        if (savedState == null || !savedState.hasValidAnchor()) {
            resolveShouldLayoutReverse();
            z11 = this.mShouldReverseLayout;
            i12 = this.mPendingScrollPosition;
            if (i12 == -1) {
                i12 = z11 ? i11 - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.mPendingSavedState;
            z11 = savedState2.mAnchorLayoutFromEnd;
            i12 = savedState2.mAnchorPosition;
        }
        int i13 = z11 ? -1 : 1;
        for (int i14 = 0; i14 < this.mInitialPrefetchItemCount && i12 >= 0 && i12 < i11; i14++) {
            layoutPrefetchRegistry.addPosition(i12, 0);
            i12 += i13;
        }
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView.State state, LayoutState layoutState, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i11 = layoutState.mCurrentPosition;
        if (i11 < 0 || i11 >= state.getItemCount()) {
            return;
        }
        layoutPrefetchRegistry.addPosition(i11, Math.max(0, layoutState.mScrollingOffset));
    }

    public LayoutState createLayoutState() {
        return new LayoutState();
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public int fill(RecyclerView.Recycler recycler, LayoutState layoutState, RecyclerView.State state, boolean z11) {
        int i11 = layoutState.mAvailable;
        int i12 = layoutState.mScrollingOffset;
        if (i12 != Integer.MIN_VALUE) {
            if (i11 < 0) {
                layoutState.mScrollingOffset = i12 + i11;
            }
            recycleByLayoutState(recycler, layoutState);
        }
        int i13 = layoutState.mAvailable + layoutState.mExtraFillSpace;
        LayoutChunkResult layoutChunkResult = this.mLayoutChunkResult;
        while (true) {
            if ((!layoutState.mInfinite && i13 <= 0) || !layoutState.hasMore(state)) {
                break;
            }
            layoutChunkResult.resetInternal();
            layoutChunk(recycler, state, layoutState, layoutChunkResult);
            if (!layoutChunkResult.mFinished) {
                layoutState.mOffset += layoutChunkResult.mConsumed * layoutState.mLayoutDirection;
                if (!layoutChunkResult.mIgnoreConsumed || layoutState.mScrapList != null || !state.isPreLayout()) {
                    int i14 = layoutState.mAvailable;
                    int i15 = layoutChunkResult.mConsumed;
                    layoutState.mAvailable = i14 - i15;
                    i13 -= i15;
                }
                int i16 = layoutState.mScrollingOffset;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + layoutChunkResult.mConsumed;
                    layoutState.mScrollingOffset = i17;
                    int i18 = layoutState.mAvailable;
                    if (i18 < 0) {
                        layoutState.mScrollingOffset = i17 + i18;
                    }
                    recycleByLayoutState(recycler, layoutState);
                }
                if (z11 && layoutChunkResult.mFocusable) {
                    break;
                }
            } else {
                break;
            }
        }
        return i11 - layoutState.mAvailable;
    }

    public View findFirstVisibleChildClosestToEnd(boolean z11, boolean z12) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z11, z12) : findOneVisibleChild(getChildCount() - 1, -1, z11, z12);
    }

    public View findFirstVisibleChildClosestToStart(boolean z11, boolean z12) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z11, z12) : findOneVisibleChild(0, getChildCount(), z11, z12);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    public View findReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z11, boolean z12) {
        int i11;
        int childCount;
        int i12;
        ensureLayoutState();
        int childCount2 = getChildCount();
        if (z12) {
            childCount = getChildCount() - 1;
            i11 = -1;
            i12 = -1;
        } else {
            i11 = childCount2;
            childCount = 0;
            i12 = 1;
        }
        int itemCount = state.getItemCount();
        int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
        int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (childCount != i11) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            int decoratedStart = this.mOrientationHelper.getDecoratedStart(childAt);
            int decoratedEnd = this.mOrientationHelper.getDecoratedEnd(childAt);
            if (position >= 0 && position < itemCount) {
                if (!((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    boolean z13 = decoratedEnd <= startAfterPadding && decoratedStart < startAfterPadding;
                    boolean z14 = decoratedStart >= endAfterPadding && decoratedEnd > endAfterPadding;
                    if (!z13 && !z14) {
                        return childAt;
                    }
                    if (z11) {
                        if (z14) {
                            view2 = childAt;
                        } else if (view == null) {
                            view = childAt;
                        }
                    } else if (z13) {
                        view2 = childAt;
                    } else if (view == null) {
                        view = childAt;
                    }
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            childCount += i12;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i11;
        int i12;
        int i13;
        int i14;
        int iFixLayoutEndGap;
        int i15;
        View viewFindViewByPosition;
        int decoratedStart;
        int endAfterPadding;
        int i16 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.hasValidAnchor()) {
            this.mPendingScrollPosition = this.mPendingSavedState.mAnchorPosition;
        }
        ensureLayoutState();
        this.mLayoutState.mRecycle = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        AnchorInfo anchorInfo = this.mAnchorInfo;
        if (!anchorInfo.mValid || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            anchorInfo.reset();
            AnchorInfo anchorInfo2 = this.mAnchorInfo;
            anchorInfo2.mLayoutFromEnd = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(recycler, state, anchorInfo2);
            this.mAnchorInfo.mValid = true;
        } else if (focusedChild != null && (this.mOrientationHelper.getDecoratedStart(focusedChild) >= this.mOrientationHelper.getEndAfterPadding() || this.mOrientationHelper.getDecoratedEnd(focusedChild) <= this.mOrientationHelper.getStartAfterPadding())) {
            this.mAnchorInfo.assignFromViewAndKeepVisibleRect(focusedChild, getPosition(focusedChild));
        }
        LayoutState layoutState = this.mLayoutState;
        layoutState.mLayoutDirection = layoutState.mLastScrollDelta >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(state, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]) + this.mOrientationHelper.getStartAfterPadding();
        int iMax2 = Math.max(0, this.mReusableIntPair[1]) + this.mOrientationHelper.getEndPadding();
        if (state.isPreLayout() && (i15 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i15)) != null) {
            if (this.mShouldReverseLayout) {
                endAfterPadding = this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(viewFindViewByPosition);
                decoratedStart = this.mPendingScrollPositionOffset;
            } else {
                decoratedStart = this.mOrientationHelper.getDecoratedStart(viewFindViewByPosition) - this.mOrientationHelper.getStartAfterPadding();
                endAfterPadding = this.mPendingScrollPositionOffset;
            }
            int i17 = endAfterPadding - decoratedStart;
            if (i17 > 0) {
                iMax += i17;
            } else {
                iMax2 -= i17;
            }
        }
        AnchorInfo anchorInfo3 = this.mAnchorInfo;
        if (!anchorInfo3.mLayoutFromEnd ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i16 = 1;
        }
        onAnchorReady(recycler, state, anchorInfo3, i16);
        detachAndScrapAttachedViews(recycler);
        this.mLayoutState.mInfinite = resolveIsInfinite();
        this.mLayoutState.mIsPreLayout = state.isPreLayout();
        this.mLayoutState.mNoRecycleSpace = 0;
        AnchorInfo anchorInfo4 = this.mAnchorInfo;
        if (anchorInfo4.mLayoutFromEnd) {
            updateLayoutStateToFillStart(anchorInfo4);
            LayoutState layoutState2 = this.mLayoutState;
            layoutState2.mExtraFillSpace = iMax;
            fill(recycler, layoutState2, state, false);
            LayoutState layoutState3 = this.mLayoutState;
            i12 = layoutState3.mOffset;
            int i18 = layoutState3.mCurrentPosition;
            int i19 = layoutState3.mAvailable;
            if (i19 > 0) {
                iMax2 += i19;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            LayoutState layoutState4 = this.mLayoutState;
            layoutState4.mExtraFillSpace = iMax2;
            layoutState4.mCurrentPosition += layoutState4.mItemDirection;
            fill(recycler, layoutState4, state, false);
            LayoutState layoutState5 = this.mLayoutState;
            i11 = layoutState5.mOffset;
            int i21 = layoutState5.mAvailable;
            if (i21 > 0) {
                updateLayoutStateToFillStart(i18, i12);
                LayoutState layoutState6 = this.mLayoutState;
                layoutState6.mExtraFillSpace = i21;
                fill(recycler, layoutState6, state, false);
                i12 = this.mLayoutState.mOffset;
            }
        } else {
            updateLayoutStateToFillEnd(anchorInfo4);
            LayoutState layoutState7 = this.mLayoutState;
            layoutState7.mExtraFillSpace = iMax2;
            fill(recycler, layoutState7, state, false);
            LayoutState layoutState8 = this.mLayoutState;
            i11 = layoutState8.mOffset;
            int i22 = layoutState8.mCurrentPosition;
            int i23 = layoutState8.mAvailable;
            if (i23 > 0) {
                iMax += i23;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            LayoutState layoutState9 = this.mLayoutState;
            layoutState9.mExtraFillSpace = iMax;
            layoutState9.mCurrentPosition += layoutState9.mItemDirection;
            fill(recycler, layoutState9, state, false);
            LayoutState layoutState10 = this.mLayoutState;
            i12 = layoutState10.mOffset;
            int i24 = layoutState10.mAvailable;
            if (i24 > 0) {
                updateLayoutStateToFillEnd(i22, i11);
                LayoutState layoutState11 = this.mLayoutState;
                layoutState11.mExtraFillSpace = i24;
                fill(recycler, layoutState11, state, false);
                i11 = this.mLayoutState.mOffset;
            }
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int iFixLayoutEndGap2 = fixLayoutEndGap(i11, recycler, state, true);
                i13 = i12 + iFixLayoutEndGap2;
                i14 = i11 + iFixLayoutEndGap2;
                iFixLayoutEndGap = fixLayoutStartGap(i13, recycler, state, false);
            } else {
                int iFixLayoutStartGap = fixLayoutStartGap(i12, recycler, state, true);
                i13 = i12 + iFixLayoutStartGap;
                i14 = i11 + iFixLayoutStartGap;
                iFixLayoutEndGap = fixLayoutEndGap(i14, recycler, state, false);
            }
            i12 = i13 + iFixLayoutEndGap;
            i11 = i14 + iFixLayoutEndGap;
        }
        layoutForPredictiveAnimations(recycler, state, i12, i11);
        if (state.isPreLayout()) {
            this.mAnchorInfo.reset();
        } else {
            this.mOrientationHelper.onLayoutComplete();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.invalidateAnchor();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() <= 0) {
            savedState.invalidateAnchor();
            return savedState;
        }
        ensureLayoutState();
        boolean z11 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
        savedState.mAnchorLayoutFromEnd = z11;
        if (z11) {
            View childClosestToEnd = getChildClosestToEnd();
            savedState.mAnchorOffset = this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(childClosestToEnd);
            savedState.mAnchorPosition = getPosition(childClosestToEnd);
            return savedState;
        }
        View childClosestToStart = getChildClosestToStart();
        savedState.mAnchorPosition = getPosition(childClosestToStart);
        savedState.mAnchorOffset = this.mOrientationHelper.getDecoratedStart(childClosestToStart) - this.mOrientationHelper.getStartAfterPadding();
        return savedState;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.ViewDropHandler
    public void prepareForDrop(@NonNull View view, @NonNull View view2, int i11, int i12) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        byte b11 = position < position2 ? (byte) 1 : (byte) -1;
        if (this.mShouldReverseLayout) {
            if (b11 == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.getEndAfterPadding() - (this.mOrientationHelper.getDecoratedStart(view2) + this.mOrientationHelper.getDecoratedMeasurement(view)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(view2));
                return;
            }
        }
        if (b11 == -1) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.getDecoratedStart(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.getDecoratedEnd(view2) - this.mOrientationHelper.getDecoratedMeasurement(view));
        }
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.getMode() == 0 && this.mOrientationHelper.getEnd() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int scrollHorizontallyBy(int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i11, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i11) {
        this.mPendingScrollPosition = i11;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.invalidateAnchor();
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i11, int i12) {
        this.mPendingScrollPosition = i11;
        this.mPendingScrollPositionOffset = i12;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.invalidateAnchor();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int scrollVerticallyBy(int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i11, recycler, state);
    }

    public void setInitialPrefetchItemCount(int i11) {
        this.mInitialPrefetchItemCount = i11;
    }

    public void setOrientation(int i11) {
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i11);
        }
        assertNotInLayoutOrScroll(null);
        if (i11 != this.mOrientation || this.mOrientationHelper == null) {
            OrientationHelper orientationHelperCreateOrientationHelper = OrientationHelper.createOrientationHelper(this, i11);
            this.mOrientationHelper = orientationHelperCreateOrientationHelper;
            this.mAnchorInfo.mOrientationHelper = orientationHelperCreateOrientationHelper;
            this.mOrientation = i11;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z11) {
        this.mRecycleChildrenOnDetach = z11;
    }

    public void setSmoothScrollbarEnabled(boolean z11) {
        this.mSmoothScrollbarEnabled = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i11) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i11);
        startSmoothScroll(linearSmoothScroller);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int decoratedStart = this.mOrientationHelper.getDecoratedStart(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i11 = 1; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                int position2 = getPosition(childAt);
                int decoratedStart2 = this.mOrientationHelper.getDecoratedStart(childAt);
                if (position2 < position) {
                    logChildren();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("detected invalid position. loc invalid? ");
                    sb2.append(decoratedStart2 < decoratedStart);
                    throw new RuntimeException(sb2.toString());
                }
                if (decoratedStart2 > decoratedStart) {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i12 = 1; i12 < getChildCount(); i12++) {
            View childAt2 = getChildAt(i12);
            int position3 = getPosition(childAt2);
            int decoratedStart3 = this.mOrientationHelper.getDecoratedStart(childAt2);
            if (position3 < position) {
                logChildren();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("detected invalid position. loc invalid? ");
                sb3.append(decoratedStart3 < decoratedStart);
                throw new RuntimeException(sb3.toString());
            }
            if (decoratedStart3 < decoratedStart) {
                logChildren();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    private int computeScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return ScrollbarHelper.computeScrollExtent(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return ScrollbarHelper.computeScrollOffset(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return ScrollbarHelper.computeScrollRange(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private void layoutForPredictiveAnimations(RecyclerView.Recycler recycler, RecyclerView.State state, int i11, int i12) {
        boolean z11;
        if (state.willRunPredictiveAnimations() && getChildCount() != 0 && !state.isPreLayout() && supportsPredictiveItemAnimations()) {
            List<RecyclerView.ViewHolder> scrapList = recycler.getScrapList();
            int size = scrapList.size();
            int position = getPosition(getChildAt(0));
            int decoratedMeasurement = 0;
            int decoratedMeasurement2 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                RecyclerView.ViewHolder viewHolder = scrapList.get(i13);
                if (!viewHolder.isRemoved()) {
                    if (viewHolder.getLayoutPosition() < position) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 != this.mShouldReverseLayout) {
                        decoratedMeasurement += this.mOrientationHelper.getDecoratedMeasurement(viewHolder.itemView);
                    } else {
                        decoratedMeasurement2 += this.mOrientationHelper.getDecoratedMeasurement(viewHolder.itemView);
                    }
                }
            }
            this.mLayoutState.mScrapList = scrapList;
            if (decoratedMeasurement > 0) {
                updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i11);
                LayoutState layoutState = this.mLayoutState;
                layoutState.mExtraFillSpace = decoratedMeasurement;
                layoutState.mAvailable = 0;
                layoutState.assignPositionFromScrapList();
                fill(recycler, this.mLayoutState, state, false);
            }
            if (decoratedMeasurement2 > 0) {
                updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i12);
                LayoutState layoutState2 = this.mLayoutState;
                layoutState2.mExtraFillSpace = decoratedMeasurement2;
                layoutState2.mAvailable = 0;
                layoutState2.assignPositionFromScrapList();
                fill(recycler, this.mLayoutState, state, false);
            }
            this.mLayoutState.mScrapList = null;
        }
    }

    private void recycleViewsFromEnd(RecyclerView.Recycler recycler, int i11, int i12) {
        int childCount = getChildCount();
        if (i11 >= 0) {
            int end = (this.mOrientationHelper.getEnd() - i11) + i12;
            if (this.mShouldReverseLayout) {
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    if (this.mOrientationHelper.getDecoratedStart(childAt) < end || this.mOrientationHelper.getTransformedStartWithDecoration(childAt) < end) {
                        recycleChildren(recycler, 0, i13);
                        return;
                    }
                }
                return;
            }
            int i14 = childCount - 1;
            for (int i15 = i14; i15 >= 0; i15--) {
                View childAt2 = getChildAt(i15);
                if (this.mOrientationHelper.getDecoratedStart(childAt2) < end || this.mOrientationHelper.getTransformedStartWithDecoration(childAt2) < end) {
                    recycleChildren(recycler, i14, i15);
                    return;
                }
            }
        }
    }

    private boolean updateAnchorFromChildren(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorInfo) {
        View viewFindReferenceChild;
        boolean z11;
        boolean z12 = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && anchorInfo.isViewValidAsAnchor(focusedChild, state)) {
            anchorInfo.assignFromViewAndKeepVisibleRect(focusedChild, getPosition(focusedChild));
            return true;
        }
        boolean z13 = this.mLastStackFromEnd;
        boolean z14 = this.mStackFromEnd;
        if (z13 != z14 || (viewFindReferenceChild = findReferenceChild(recycler, state, anchorInfo.mLayoutFromEnd, z14)) == null) {
            return false;
        }
        anchorInfo.assignFromView(viewFindReferenceChild, getPosition(viewFindReferenceChild));
        if (!state.isPreLayout() && supportsPredictiveItemAnimations()) {
            int decoratedStart = this.mOrientationHelper.getDecoratedStart(viewFindReferenceChild);
            int decoratedEnd = this.mOrientationHelper.getDecoratedEnd(viewFindReferenceChild);
            int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
            int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
            if (decoratedEnd <= startAfterPadding && decoratedStart < startAfterPadding) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (decoratedStart >= endAfterPadding && decoratedEnd > endAfterPadding) {
                z12 = true;
            }
            if (z11 || z12) {
                if (anchorInfo.mLayoutFromEnd) {
                    startAfterPadding = endAfterPadding;
                }
                anchorInfo.mCoordinate = startAfterPadding;
            }
        }
        return true;
    }

    private boolean updateAnchorFromPendingData(RecyclerView.State state, AnchorInfo anchorInfo) {
        int i11;
        boolean z11;
        int decoratedStart;
        boolean z12 = false;
        if (!state.isPreLayout() && (i11 = this.mPendingScrollPosition) != -1) {
            if (i11 >= 0 && i11 < state.getItemCount()) {
                anchorInfo.mPosition = this.mPendingScrollPosition;
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null && savedState.hasValidAnchor()) {
                    boolean z13 = this.mPendingSavedState.mAnchorLayoutFromEnd;
                    anchorInfo.mLayoutFromEnd = z13;
                    if (z13) {
                        anchorInfo.mCoordinate = this.mOrientationHelper.getEndAfterPadding() - this.mPendingSavedState.mAnchorOffset;
                    } else {
                        anchorInfo.mCoordinate = this.mOrientationHelper.getStartAfterPadding() + this.mPendingSavedState.mAnchorOffset;
                    }
                    return true;
                }
                if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View viewFindViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                    if (viewFindViewByPosition != null) {
                        if (this.mOrientationHelper.getDecoratedMeasurement(viewFindViewByPosition) > this.mOrientationHelper.getTotalSpace()) {
                            anchorInfo.assignCoordinateFromPadding();
                            return true;
                        }
                        if (this.mOrientationHelper.getDecoratedStart(viewFindViewByPosition) - this.mOrientationHelper.getStartAfterPadding() < 0) {
                            anchorInfo.mCoordinate = this.mOrientationHelper.getStartAfterPadding();
                            anchorInfo.mLayoutFromEnd = false;
                            return true;
                        }
                        if (this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(viewFindViewByPosition) < 0) {
                            anchorInfo.mCoordinate = this.mOrientationHelper.getEndAfterPadding();
                            anchorInfo.mLayoutFromEnd = true;
                            return true;
                        }
                        if (anchorInfo.mLayoutFromEnd) {
                            decoratedStart = this.mOrientationHelper.getDecoratedEnd(viewFindViewByPosition) + this.mOrientationHelper.getTotalSpaceChange();
                        } else {
                            decoratedStart = this.mOrientationHelper.getDecoratedStart(viewFindViewByPosition);
                        }
                        anchorInfo.mCoordinate = decoratedStart;
                    } else {
                        if (getChildCount() > 0) {
                            if (this.mPendingScrollPosition < getPosition(getChildAt(0))) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11 == this.mShouldReverseLayout) {
                                z12 = true;
                            }
                            anchorInfo.mLayoutFromEnd = z12;
                        }
                        anchorInfo.assignCoordinateFromPadding();
                    }
                    return true;
                }
                boolean z14 = this.mShouldReverseLayout;
                anchorInfo.mLayoutFromEnd = z14;
                if (z14) {
                    anchorInfo.mCoordinate = this.mOrientationHelper.getEndAfterPadding() - this.mPendingScrollPositionOffset;
                } else {
                    anchorInfo.mCoordinate = this.mOrientationHelper.getStartAfterPadding() + this.mPendingScrollPositionOffset;
                }
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    private void updateAnchorInfoForLayout(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorInfo) {
        int itemCount;
        if (updateAnchorFromPendingData(state, anchorInfo) || updateAnchorFromChildren(recycler, state, anchorInfo)) {
            return;
        }
        anchorInfo.assignCoordinateFromPadding();
        if (this.mStackFromEnd) {
            itemCount = state.getItemCount() - 1;
        } else {
            itemCount = 0;
        }
        anchorInfo.mPosition = itemCount;
    }

    public void calculateExtraLayoutSpace(@NonNull RecyclerView.State state, @NonNull int[] iArr) {
        int i11;
        int extraLayoutSpace = getExtraLayoutSpace(state);
        if (this.mLayoutState.mLayoutDirection == -1) {
            i11 = 0;
        } else {
            i11 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    @SuppressLint({"UnknownNullness"})
    public PointF computeScrollVectorForPosition(int i11) {
        if (getChildCount() == 0) {
            return null;
        }
        boolean z11 = false;
        int i12 = 1;
        if (i11 < getPosition(getChildAt(0))) {
            z11 = true;
        }
        if (z11 != this.mShouldReverseLayout) {
            i12 = -1;
        }
        if (this.mOrientation == 0) {
            return new PointF(i12, 0.0f);
        }
        return new PointF(0.0f, i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i11, int i12) {
        int i13;
        int i14;
        ensureLayoutState();
        if (i12 > i11 || i12 < i11) {
            if (this.mOrientationHelper.getDecoratedStart(getChildAt(i11)) < this.mOrientationHelper.getStartAfterPadding()) {
                i13 = 16644;
                i14 = 16388;
            } else {
                i13 = 4161;
                i14 = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
            }
            if (this.mOrientation == 0) {
                return this.mHorizontalBoundCheck.findOneViewWithinBoundFlags(i11, i12, i13, i14);
            }
            return this.mVerticalBoundCheck.findOneViewWithinBoundFlags(i11, i12, i13, i14);
        }
        return getChildAt(i11);
    }

    public View findOneVisibleChild(int i11, int i12, boolean z11, boolean z12) {
        int i13;
        ensureLayoutState();
        int i14 = 320;
        if (z11) {
            i13 = 24579;
        } else {
            i13 = 320;
        }
        if (!z12) {
            i14 = 0;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.findOneViewWithinBoundFlags(i11, i12, i13, i14);
        }
        return this.mVerticalBoundCheck.findOneViewWithinBoundFlags(i11, i12, i13, i14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public View findViewByPosition(int i11) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i11 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i11) {
                return childAt;
            }
        }
        return super.findViewByPosition(i11);
    }

    @Deprecated
    public int getExtraLayoutSpace(RecyclerView.State state) {
        if (state.hasTargetScrollPosition()) {
            return this.mOrientationHelper.getTotalSpace();
        }
        return 0;
    }

    public boolean isLayoutRTL() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, LayoutState layoutState, LayoutChunkResult layoutChunkResult) {
        boolean z11;
        int decoratedMeasurementInOther;
        int i11;
        int i12;
        int i13;
        int paddingLeft;
        int decoratedMeasurementInOther2;
        int i14;
        int i15;
        boolean z12;
        View next = layoutState.next(recycler);
        if (next == null) {
            layoutChunkResult.mFinished = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) next.getLayoutParams();
        if (layoutState.mScrapList == null) {
            boolean z13 = this.mShouldReverseLayout;
            if (layoutState.mLayoutDirection == -1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z13 == z12) {
                addView(next);
            } else {
                addView(next, 0);
            }
        } else {
            boolean z14 = this.mShouldReverseLayout;
            if (layoutState.mLayoutDirection == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z14 == z11) {
                addDisappearingView(next);
            } else {
                addDisappearingView(next, 0);
            }
        }
        measureChildWithMargins(next, 0, 0);
        layoutChunkResult.mConsumed = this.mOrientationHelper.getDecoratedMeasurement(next);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                decoratedMeasurementInOther2 = getWidth() - getPaddingRight();
                paddingLeft = decoratedMeasurementInOther2 - this.mOrientationHelper.getDecoratedMeasurementInOther(next);
            } else {
                paddingLeft = getPaddingLeft();
                decoratedMeasurementInOther2 = this.mOrientationHelper.getDecoratedMeasurementInOther(next) + paddingLeft;
            }
            if (layoutState.mLayoutDirection == -1) {
                i15 = layoutState.mOffset;
                i14 = i15 - layoutChunkResult.mConsumed;
            } else {
                i14 = layoutState.mOffset;
                i15 = layoutChunkResult.mConsumed + i14;
            }
            int i16 = paddingLeft;
            i13 = i14;
            i12 = i16;
            decoratedMeasurementInOther = i15;
            i11 = decoratedMeasurementInOther2;
        } else {
            int paddingTop = getPaddingTop();
            decoratedMeasurementInOther = this.mOrientationHelper.getDecoratedMeasurementInOther(next) + paddingTop;
            if (layoutState.mLayoutDirection == -1) {
                int i17 = layoutState.mOffset;
                i12 = i17 - layoutChunkResult.mConsumed;
                i11 = i17;
            } else {
                int i18 = layoutState.mOffset;
                i11 = layoutChunkResult.mConsumed + i18;
                i12 = i18;
            }
            i13 = paddingTop;
        }
        layoutDecoratedWithMargins(next, i12, i13, i11, decoratedMeasurementInOther);
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            layoutChunkResult.mIgnoreConsumed = true;
        }
        layoutChunkResult.mFocusable = next.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public View onFocusSearchFailed(View view, int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int iConvertFocusDirectionToLayoutDirection;
        View viewFindPartiallyOrCompletelyInvisibleChildClosestToEnd;
        View childClosestToEnd;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i11)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.getTotalSpace() * MAX_SCROLL_FACTOR), false, state);
        LayoutState layoutState = this.mLayoutState;
        layoutState.mScrollingOffset = Integer.MIN_VALUE;
        layoutState.mRecycle = false;
        fill(recycler, layoutState, state, true);
        if (iConvertFocusDirectionToLayoutDirection == -1) {
            viewFindPartiallyOrCompletelyInvisibleChildClosestToEnd = findPartiallyOrCompletelyInvisibleChildClosestToStart();
        } else {
            viewFindPartiallyOrCompletelyInvisibleChildClosestToEnd = findPartiallyOrCompletelyInvisibleChildClosestToEnd();
        }
        if (iConvertFocusDirectionToLayoutDirection == -1) {
            childClosestToEnd = getChildClosestToStart();
        } else {
            childClosestToEnd = getChildClosestToEnd();
        }
        if (childClosestToEnd.hasFocusable()) {
            if (viewFindPartiallyOrCompletelyInvisibleChildClosestToEnd == null) {
                return null;
            }
            return childClosestToEnd;
        }
        return viewFindPartiallyOrCompletelyInvisibleChildClosestToEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @SuppressLint({"UnknownNullness"})
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.reset();
    }

    public int scrollBy(int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i12;
        if (getChildCount() == 0 || i11 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.mRecycle = true;
        if (i11 > 0) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        int iAbs = Math.abs(i11);
        updateLayoutState(i12, iAbs, true, state);
        LayoutState layoutState = this.mLayoutState;
        int iFill = layoutState.mScrollingOffset + fill(recycler, layoutState, state, false);
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i11 = i12 * iFill;
        }
        this.mOrientationHelper.offsetChildren(-i11);
        this.mLayoutState.mLastScrollDelta = i11;
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean shouldMeasureTwice() {
        if (getHeightMode() != 1073741824 && getWidthMode() != 1073741824 && hasFlexibleChildInBothOrientations()) {
            return true;
        }
        return false;
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new AnchorInfo();
        this.mLayoutChunkResult = new LayoutChunkResult();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i11, i12);
        setOrientation(properties.orientation);
        setReverseLayout(properties.reverseLayout);
        setStackFromEnd(properties.stackFromEnd);
    }

    public void onAnchorReady(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorInfo, int i11) {
    }
}
