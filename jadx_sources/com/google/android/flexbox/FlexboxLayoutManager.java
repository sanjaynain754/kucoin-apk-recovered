package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes45.dex */
public class FlexboxLayoutManager extends RecyclerView.LayoutManager implements FlexContainer, RecyclerView.SmoothScroller.ScrollVectorProvider {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean DEBUG = false;
    private static final String TAG = "FlexboxLayoutManager";
    private static final Rect TEMP_RECT = new Rect();
    private int mAlignItems;
    private AnchorInfo mAnchorInfo;
    private final Context mContext;
    private int mDirtyPosition;
    private int mFlexDirection;
    private List<FlexLine> mFlexLines;
    private FlexboxHelper.FlexLinesResult mFlexLinesResult;
    private int mFlexWrap;
    private final FlexboxHelper mFlexboxHelper;
    private boolean mFromBottomToTop;
    private boolean mIsRtl;
    private int mJustifyContent;
    private int mLastHeight;
    private int mLastWidth;
    private LayoutState mLayoutState;
    private int mMaxLine;
    private OrientationHelper mOrientationHelper;
    private View mParent;
    private SavedState mPendingSavedState;
    private int mPendingScrollPosition;
    private int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private RecyclerView.Recycler mRecycler;
    private RecyclerView.State mState;
    private OrientationHelper mSubOrientationHelper;
    private SparseArray<View> mViewCache;

    public class AnchorInfo {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private boolean mAssignedFromSavedState;
        private int mCoordinate;
        private int mFlexLinePosition;
        private boolean mLayoutFromEnd;
        private int mPerpendicularCoordinate;
        private int mPosition;
        private boolean mValid;

        private AnchorInfo() {
            this.mPerpendicularCoordinate = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void reset() {
            this.mPosition = -1;
            this.mFlexLinePosition = -1;
            this.mCoordinate = Integer.MIN_VALUE;
            this.mValid = false;
            this.mAssignedFromSavedState = false;
            if (FlexboxLayoutManager.this.isMainAxisDirectionHorizontal()) {
                if (FlexboxLayoutManager.this.mFlexWrap == 0) {
                    this.mLayoutFromEnd = FlexboxLayoutManager.this.mFlexDirection == 1;
                    return;
                } else {
                    this.mLayoutFromEnd = FlexboxLayoutManager.this.mFlexWrap == 2;
                    return;
                }
            }
            if (FlexboxLayoutManager.this.mFlexWrap == 0) {
                this.mLayoutFromEnd = FlexboxLayoutManager.this.mFlexDirection == 3;
            } else {
                this.mLayoutFromEnd = FlexboxLayoutManager.this.mFlexWrap == 2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void assignCoordinateFromPadding() {
            if (FlexboxLayoutManager.this.isMainAxisDirectionHorizontal() || !FlexboxLayoutManager.this.mIsRtl) {
                this.mCoordinate = this.mLayoutFromEnd ? FlexboxLayoutManager.this.mOrientationHelper.getEndAfterPadding() : FlexboxLayoutManager.this.mOrientationHelper.getStartAfterPadding();
            } else {
                this.mCoordinate = this.mLayoutFromEnd ? FlexboxLayoutManager.this.mOrientationHelper.getEndAfterPadding() : FlexboxLayoutManager.this.getWidth() - FlexboxLayoutManager.this.mOrientationHelper.getStartAfterPadding();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void assignFromView(View view) {
            OrientationHelper orientationHelper = FlexboxLayoutManager.this.mFlexWrap == 0 ? FlexboxLayoutManager.this.mSubOrientationHelper : FlexboxLayoutManager.this.mOrientationHelper;
            if (FlexboxLayoutManager.this.isMainAxisDirectionHorizontal() || !FlexboxLayoutManager.this.mIsRtl) {
                if (this.mLayoutFromEnd) {
                    this.mCoordinate = orientationHelper.getDecoratedEnd(view) + orientationHelper.getTotalSpaceChange();
                } else {
                    this.mCoordinate = orientationHelper.getDecoratedStart(view);
                }
            } else if (this.mLayoutFromEnd) {
                this.mCoordinate = orientationHelper.getDecoratedStart(view) + orientationHelper.getTotalSpaceChange();
            } else {
                this.mCoordinate = orientationHelper.getDecoratedEnd(view);
            }
            this.mPosition = FlexboxLayoutManager.this.getPosition(view);
            this.mAssignedFromSavedState = false;
            int[] iArr = FlexboxLayoutManager.this.mFlexboxHelper.mIndexToFlexLine;
            int i11 = this.mPosition;
            if (i11 == -1) {
                i11 = 0;
            }
            int i12 = iArr[i11];
            this.mFlexLinePosition = i12 != -1 ? i12 : 0;
            if (FlexboxLayoutManager.this.mFlexLines.size() > this.mFlexLinePosition) {
                this.mPosition = ((FlexLine) FlexboxLayoutManager.this.mFlexLines.get(this.mFlexLinePosition)).mFirstIndex;
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.mPosition + ", mFlexLinePosition=" + this.mFlexLinePosition + ", mCoordinate=" + this.mCoordinate + ", mPerpendicularCoordinate=" + this.mPerpendicularCoordinate + ", mLayoutFromEnd=" + this.mLayoutFromEnd + ", mValid=" + this.mValid + ", mAssignedFromSavedState=" + this.mAssignedFromSavedState + '}';
        }
    }

    public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Parcelable.Creator<LayoutParams>() { // from class: com.google.android.flexbox.FlexboxLayoutManager.LayoutParams.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LayoutParams[] newArray(int i11) {
                return new LayoutParams[i11];
            }
        };
        private int mAlignSelf;
        private float mFlexBasisPercent;
        private float mFlexGrow;
        private float mFlexShrink;
        private int mMaxHeight;
        private int mMaxWidth;
        private int mMinHeight;
        private int mMinWidth;
        private boolean mWrapBefore;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getAlignSelf() {
            return this.mAlignSelf;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexBasisPercent() {
            return this.mFlexBasisPercent;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexGrow() {
            return this.mFlexGrow;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexShrink() {
            return this.mFlexShrink;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginBottom() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginLeft() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginRight() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginTop() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxHeight() {
            return this.mMaxHeight;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxWidth() {
            return this.mMaxWidth;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMinHeight() {
            return this.mMinHeight;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMinWidth() {
            return this.mMinWidth;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean isWrapBefore() {
            return this.mWrapBefore;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setAlignSelf(int i11) {
            this.mAlignSelf = i11;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexBasisPercent(float f11) {
            this.mFlexBasisPercent = f11;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexGrow(float f11) {
            this.mFlexGrow = f11;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexShrink(float f11) {
            this.mFlexShrink = f11;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setHeight(int i11) {
            ((ViewGroup.MarginLayoutParams) this).height = i11;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMaxHeight(int i11) {
            this.mMaxHeight = i11;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMaxWidth(int i11) {
            this.mMaxWidth = i11;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinHeight(int i11) {
            this.mMinHeight = i11;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinWidth(int i11) {
            this.mMinWidth = i11;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setOrder(int i11) {
            throw new UnsupportedOperationException("Setting the order in the FlexboxLayoutManager is not supported. Use FlexboxLayout if you need to reorder using the attribute.");
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setWidth(int i11) {
            ((ViewGroup.MarginLayoutParams) this).width = i11;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setWrapBefore(boolean z11) {
            this.mWrapBefore = z11;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeFloat(this.mFlexGrow);
            parcel.writeFloat(this.mFlexShrink);
            parcel.writeInt(this.mAlignSelf);
            parcel.writeFloat(this.mFlexBasisPercent);
            parcel.writeInt(this.mMinWidth);
            parcel.writeInt(this.mMinHeight);
            parcel.writeInt(this.mMaxWidth);
            parcel.writeInt(this.mMaxHeight);
            parcel.writeByte(this.mWrapBefore ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((RecyclerView.LayoutParams) layoutParams);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
            this.mFlexGrow = layoutParams.mFlexGrow;
            this.mFlexShrink = layoutParams.mFlexShrink;
            this.mAlignSelf = layoutParams.mAlignSelf;
            this.mFlexBasisPercent = layoutParams.mFlexBasisPercent;
            this.mMinWidth = layoutParams.mMinWidth;
            this.mMinHeight = layoutParams.mMinHeight;
            this.mMaxWidth = layoutParams.mMaxWidth;
            this.mMaxHeight = layoutParams.mMaxHeight;
            this.mWrapBefore = layoutParams.mWrapBefore;
        }

        public LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
            this.mFlexGrow = parcel.readFloat();
            this.mFlexShrink = parcel.readFloat();
            this.mAlignSelf = parcel.readInt();
            this.mFlexBasisPercent = parcel.readFloat();
            this.mMinWidth = parcel.readInt();
            this.mMinHeight = parcel.readInt();
            this.mMaxWidth = parcel.readInt();
            this.mMaxHeight = parcel.readInt();
            this.mWrapBefore = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public static class LayoutState {
        private static final int ITEM_DIRECTION_TAIL = 1;
        private static final int LAYOUT_END = 1;
        private static final int LAYOUT_START = -1;
        private static final int SCROLLING_OFFSET_NaN = Integer.MIN_VALUE;
        private int mAvailable;
        private int mFlexLinePosition;
        private boolean mInfinite;
        private int mItemDirection;
        private int mLastScrollDelta;
        private int mLayoutDirection;
        private int mOffset;
        private int mPosition;
        private int mScrollingOffset;
        private boolean mShouldRecycle;

        private LayoutState() {
            this.mItemDirection = 1;
            this.mLayoutDirection = 1;
        }

        public static /* synthetic */ int access$1508(LayoutState layoutState) {
            int i11 = layoutState.mFlexLinePosition;
            layoutState.mFlexLinePosition = i11 + 1;
            return i11;
        }

        public static /* synthetic */ int access$1510(LayoutState layoutState) {
            int i11 = layoutState.mFlexLinePosition;
            layoutState.mFlexLinePosition = i11 - 1;
            return i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasMore(RecyclerView.State state, List<FlexLine> list) {
            int i11;
            int i12 = this.mPosition;
            return i12 >= 0 && i12 < state.getItemCount() && (i11 = this.mFlexLinePosition) >= 0 && i11 < list.size();
        }

        public String toString() {
            return "LayoutState{mAvailable=" + this.mAvailable + ", mFlexLinePosition=" + this.mFlexLinePosition + ", mPosition=" + this.mPosition + ", mOffset=" + this.mOffset + ", mScrollingOffset=" + this.mScrollingOffset + ", mLastScrollDelta=" + this.mLastScrollDelta + ", mItemDirection=" + this.mItemDirection + ", mLayoutDirection=" + this.mLayoutDirection + '}';
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.google.android.flexbox.FlexboxLayoutManager.SavedState.1
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
        private int mAnchorOffset;
        private int mAnchorPosition;

        /* JADX INFO: Access modifiers changed from: private */
        public void invalidateAnchor() {
            this.mAnchorPosition = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasValidAnchor(int i11) {
            int i12 = this.mAnchorPosition;
            return i12 >= 0 && i12 < i11;
        }

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.mAnchorPosition + ", mAnchorOffset=" + this.mAnchorOffset + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mAnchorOffset);
        }

        public SavedState() {
        }

        private SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mAnchorOffset = parcel.readInt();
        }

        private SavedState(SavedState savedState) {
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mAnchorOffset = savedState.mAnchorOffset;
        }
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0, 1);
    }

    private View findFirstReferenceChild(int i11) {
        View viewFindReferenceChild = findReferenceChild(0, getChildCount(), i11);
        if (viewFindReferenceChild == null) {
            return null;
        }
        int i12 = this.mFlexboxHelper.mIndexToFlexLine[getPosition(viewFindReferenceChild)];
        if (i12 == -1) {
            return null;
        }
        return findFirstReferenceViewInLine(viewFindReferenceChild, this.mFlexLines.get(i12));
    }

    private View getChildClosestToStart() {
        return getChildAt(0);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getAlignContent() {
        return 5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i11, int i12, Object obj) {
        super.onItemsUpdated(recyclerView, i11, i12, obj);
        updateDirtyPosition(i11);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexWrap(int i11) {
        if (i11 == 2) {
            throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
        }
        int i12 = this.mFlexWrap;
        if (i12 != i11) {
            if (i12 == 0 || i11 == 0) {
                removeAllViews();
                clearFlexLines();
            }
            this.mFlexWrap = i11;
            this.mOrientationHelper = null;
            this.mSubOrientationHelper = null;
            requestLayout();
        }
    }

    public FlexboxLayoutManager(Context context, int i11) {
        this(context, i11, 1);
    }

    private void clearFlexLines() {
        this.mFlexLines.clear();
        this.mAnchorInfo.reset();
        this.mAnchorInfo.mPerpendicularCoordinate = 0;
    }

    private void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = new LayoutState();
        }
    }

    private void ensureOrientationHelper() {
        if (this.mOrientationHelper != null) {
            return;
        }
        if (isMainAxisDirectionHorizontal()) {
            if (this.mFlexWrap == 0) {
                this.mOrientationHelper = OrientationHelper.createHorizontalHelper(this);
                this.mSubOrientationHelper = OrientationHelper.createVerticalHelper(this);
                return;
            } else {
                this.mOrientationHelper = OrientationHelper.createVerticalHelper(this);
                this.mSubOrientationHelper = OrientationHelper.createHorizontalHelper(this);
                return;
            }
        }
        if (this.mFlexWrap == 0) {
            this.mOrientationHelper = OrientationHelper.createVerticalHelper(this);
            this.mSubOrientationHelper = OrientationHelper.createHorizontalHelper(this);
        } else {
            this.mOrientationHelper = OrientationHelper.createHorizontalHelper(this);
            this.mSubOrientationHelper = OrientationHelper.createVerticalHelper(this);
        }
    }

    private View findOneVisibleChild(int i11, int i12, boolean z11) {
        int i13 = i12 > i11 ? 1 : -1;
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (isViewVisible(childAt, z11)) {
                return childAt;
            }
            i11 += i13;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:50:0x0110  */
    /* JADX WARN: Code duplicated, block: B:53:0x0131  */
    /* JADX WARN: Code duplicated, block: B:54:0x0149  */
    private int layoutFlexLineMainAxisHorizontal(FlexLine flexLine, LayoutState layoutState) {
        float f11;
        float f12;
        float f13;
        float measuredWidth;
        float measuredWidth2;
        float fMax;
        int itemCount;
        int i11;
        int i12;
        float f14;
        View flexItemAt;
        float f15;
        int iExtractLowerInt;
        int iExtractHigherInt;
        LayoutParams layoutParams;
        float leftDecorationWidth;
        float rightDecorationWidth;
        int topDecorationHeight;
        FlexLine flexLine2 = flexLine;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int width = getWidth();
        int i13 = layoutState.mOffset;
        if (layoutState.mLayoutDirection == -1) {
            i13 -= flexLine2.mCrossSize;
        }
        int i14 = i13;
        int i15 = layoutState.mPosition;
        int i16 = this.mJustifyContent;
        int i17 = 1;
        if (i16 == 0) {
            f11 = paddingLeft;
            f12 = width - paddingRight;
        } else {
            if (i16 != 1) {
                if (i16 == 2) {
                    int i18 = flexLine2.mMainSize;
                    f11 = paddingLeft + ((width - i18) / 2.0f);
                    f12 = (width - paddingRight) - ((width - i18) / 2.0f);
                } else if (i16 == 3) {
                    f11 = paddingLeft;
                    int i19 = flexLine2.mItemCount;
                    f13 = (width - flexLine2.mMainSize) / (i19 != 1 ? i19 - 1 : 1.0f);
                    f12 = width - paddingRight;
                } else if (i16 == 4) {
                    int i21 = flexLine2.mItemCount;
                    f13 = i21 != 0 ? (width - flexLine2.mMainSize) / i21 : 0.0f;
                    float f16 = f13 / 2.0f;
                    f11 = paddingLeft + f16;
                    f12 = (width - paddingRight) - f16;
                } else {
                    if (i16 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.mJustifyContent);
                    }
                    int i22 = flexLine2.mItemCount;
                    f13 = i22 != 0 ? (width - flexLine2.mMainSize) / (i22 + 1) : 0.0f;
                    f11 = paddingLeft + f13;
                    f12 = (width - paddingRight) - f13;
                }
                measuredWidth = f11 - this.mAnchorInfo.mPerpendicularCoordinate;
                measuredWidth2 = f12 - this.mAnchorInfo.mPerpendicularCoordinate;
                fMax = Math.max(f13, 0.0f);
                itemCount = flexLine2.getItemCount();
                i11 = 0;
                i12 = i15;
                while (i12 < i15 + itemCount) {
                    f14 = measuredWidth2;
                    flexItemAt = getFlexItemAt(i12);
                    if (flexItemAt == null) {
                        measuredWidth2 = f14;
                        f15 = fMax;
                    } else {
                        if (layoutState.mLayoutDirection == i17) {
                            calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                            addView(flexItemAt);
                        } else {
                            calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                            addView(flexItemAt, i11);
                            i11++;
                        }
                        int i23 = i11;
                        FlexboxHelper flexboxHelper = this.mFlexboxHelper;
                        f15 = fMax;
                        long j11 = flexboxHelper.mMeasureSpecCache[i12];
                        iExtractLowerInt = flexboxHelper.extractLowerInt(j11);
                        iExtractHigherInt = this.mFlexboxHelper.extractHigherInt(j11);
                        layoutParams = (LayoutParams) flexItemAt.getLayoutParams();
                        if (shouldMeasureChild(flexItemAt, iExtractLowerInt, iExtractHigherInt, layoutParams)) {
                            flexItemAt.measure(iExtractLowerInt, iExtractHigherInt);
                        }
                        leftDecorationWidth = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + getLeftDecorationWidth(flexItemAt);
                        rightDecorationWidth = f14 - (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + getRightDecorationWidth(flexItemAt));
                        topDecorationHeight = i14 + getTopDecorationHeight(flexItemAt);
                        if (this.mIsRtl) {
                            this.mFlexboxHelper.layoutSingleChildHorizontal(flexItemAt, flexLine2, Math.round(rightDecorationWidth) - flexItemAt.getMeasuredWidth(), topDecorationHeight, Math.round(rightDecorationWidth), flexItemAt.getMeasuredHeight() + topDecorationHeight);
                        } else {
                            this.mFlexboxHelper.layoutSingleChildHorizontal(flexItemAt, flexLine, Math.round(leftDecorationWidth), topDecorationHeight, flexItemAt.getMeasuredWidth() + Math.round(leftDecorationWidth), topDecorationHeight + flexItemAt.getMeasuredHeight());
                        }
                        measuredWidth = leftDecorationWidth + flexItemAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + getRightDecorationWidth(flexItemAt) + f15;
                        i11 = i23;
                        measuredWidth2 = rightDecorationWidth - (((flexItemAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + getLeftDecorationWidth(flexItemAt)) + f15);
                    }
                    i12++;
                    flexLine2 = flexLine;
                    fMax = f15;
                    i17 = 1;
                }
                layoutState.mFlexLinePosition += this.mLayoutState.mLayoutDirection;
                return flexLine.getCrossSize();
            }
            int i24 = flexLine2.mMainSize;
            float f17 = (width - i24) + paddingRight;
            f12 = i24 - paddingLeft;
            f11 = f17;
        }
        f13 = 0.0f;
        measuredWidth = f11 - this.mAnchorInfo.mPerpendicularCoordinate;
        measuredWidth2 = f12 - this.mAnchorInfo.mPerpendicularCoordinate;
        fMax = Math.max(f13, 0.0f);
        itemCount = flexLine2.getItemCount();
        i11 = 0;
        i12 = i15;
        while (i12 < i15 + itemCount) {
            f14 = measuredWidth2;
            flexItemAt = getFlexItemAt(i12);
            if (flexItemAt == null) {
                measuredWidth2 = f14;
                f15 = fMax;
            } else {
                if (layoutState.mLayoutDirection == i17) {
                    calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                    addView(flexItemAt);
                } else {
                    calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                    addView(flexItemAt, i11);
                    i11++;
                }
                int i25 = i11;
                FlexboxHelper flexboxHelper2 = this.mFlexboxHelper;
                f15 = fMax;
                long j12 = flexboxHelper2.mMeasureSpecCache[i12];
                iExtractLowerInt = flexboxHelper2.extractLowerInt(j12);
                iExtractHigherInt = this.mFlexboxHelper.extractHigherInt(j12);
                layoutParams = (LayoutParams) flexItemAt.getLayoutParams();
                if (shouldMeasureChild(flexItemAt, iExtractLowerInt, iExtractHigherInt, layoutParams)) {
                    flexItemAt.measure(iExtractLowerInt, iExtractHigherInt);
                }
                leftDecorationWidth = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + getLeftDecorationWidth(flexItemAt);
                rightDecorationWidth = f14 - (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + getRightDecorationWidth(flexItemAt));
                topDecorationHeight = i14 + getTopDecorationHeight(flexItemAt);
                if (this.mIsRtl) {
                    this.mFlexboxHelper.layoutSingleChildHorizontal(flexItemAt, flexLine2, Math.round(rightDecorationWidth) - flexItemAt.getMeasuredWidth(), topDecorationHeight, Math.round(rightDecorationWidth), flexItemAt.getMeasuredHeight() + topDecorationHeight);
                } else {
                    this.mFlexboxHelper.layoutSingleChildHorizontal(flexItemAt, flexLine, Math.round(leftDecorationWidth), topDecorationHeight, flexItemAt.getMeasuredWidth() + Math.round(leftDecorationWidth), topDecorationHeight + flexItemAt.getMeasuredHeight());
                }
                measuredWidth = leftDecorationWidth + flexItemAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + getRightDecorationWidth(flexItemAt) + f15;
                i11 = i25;
                measuredWidth2 = rightDecorationWidth - (((flexItemAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + getLeftDecorationWidth(flexItemAt)) + f15);
            }
            i12++;
            flexLine2 = flexLine;
            fMax = f15;
            i17 = 1;
        }
        layoutState.mFlexLinePosition += this.mLayoutState.mLayoutDirection;
        return flexLine.getCrossSize();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:48:0x011d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0128  */
    /* JADX WARN: Code duplicated, block: B:53:0x0142  */
    /* JADX WARN: Code duplicated, block: B:55:0x0146  */
    /* JADX WARN: Code duplicated, block: B:56:0x0164  */
    /* JADX WARN: Code duplicated, block: B:57:0x0181  */
    /* JADX WARN: Code duplicated, block: B:59:0x0187  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a4  */
    private int layoutFlexLineMainAxisVertical(FlexLine flexLine, LayoutState layoutState) {
        float f11;
        float f12;
        float f13;
        float measuredHeight;
        float measuredHeight2;
        float fMax;
        int itemCount;
        int i11;
        int i12;
        float f14;
        View flexItemAt;
        float f15;
        int iExtractLowerInt;
        int iExtractHigherInt;
        LayoutParams layoutParams;
        float topDecorationHeight;
        float bottomDecorationHeight;
        int leftDecorationWidth;
        int rightDecorationWidth;
        boolean z11;
        boolean z12;
        FlexLine flexLine2 = flexLine;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i13 = layoutState.mOffset;
        int i14 = layoutState.mOffset;
        if (layoutState.mLayoutDirection == -1) {
            int i15 = flexLine2.mCrossSize;
            i13 -= i15;
            i14 += i15;
        }
        int i16 = i13;
        int i17 = i14;
        int i18 = layoutState.mPosition;
        int i19 = this.mJustifyContent;
        boolean z13 = true;
        if (i19 == 0) {
            f11 = paddingTop;
            f12 = height - paddingBottom;
        } else {
            if (i19 != 1) {
                if (i19 == 2) {
                    int i21 = flexLine2.mMainSize;
                    f11 = paddingTop + ((height - i21) / 2.0f);
                    f12 = (height - paddingBottom) - ((height - i21) / 2.0f);
                } else if (i19 == 3) {
                    f11 = paddingTop;
                    int i22 = flexLine2.mItemCount;
                    f13 = (height - flexLine2.mMainSize) / (i22 != 1 ? i22 - 1 : 1.0f);
                    f12 = height - paddingBottom;
                } else if (i19 == 4) {
                    int i23 = flexLine2.mItemCount;
                    f13 = i23 != 0 ? (height - flexLine2.mMainSize) / i23 : 0.0f;
                    float f16 = f13 / 2.0f;
                    f11 = paddingTop + f16;
                    f12 = (height - paddingBottom) - f16;
                } else {
                    if (i19 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.mJustifyContent);
                    }
                    int i24 = flexLine2.mItemCount;
                    f13 = i24 != 0 ? (height - flexLine2.mMainSize) / (i24 + 1) : 0.0f;
                    f11 = paddingTop + f13;
                    f12 = (height - paddingBottom) - f13;
                }
                measuredHeight = f11 - this.mAnchorInfo.mPerpendicularCoordinate;
                measuredHeight2 = f12 - this.mAnchorInfo.mPerpendicularCoordinate;
                fMax = Math.max(f13, 0.0f);
                itemCount = flexLine2.getItemCount();
                i11 = 0;
                i12 = i18;
                while (i12 < i18 + itemCount) {
                    f14 = measuredHeight2;
                    flexItemAt = getFlexItemAt(i12);
                    if (flexItemAt == null) {
                        measuredHeight2 = f14;
                        z12 = z13;
                        f15 = fMax;
                    } else {
                        FlexboxHelper flexboxHelper = this.mFlexboxHelper;
                        f15 = fMax;
                        long j11 = flexboxHelper.mMeasureSpecCache[i12];
                        iExtractLowerInt = flexboxHelper.extractLowerInt(j11);
                        iExtractHigherInt = this.mFlexboxHelper.extractHigherInt(j11);
                        layoutParams = (LayoutParams) flexItemAt.getLayoutParams();
                        if (shouldMeasureChild(flexItemAt, iExtractLowerInt, iExtractHigherInt, layoutParams)) {
                            flexItemAt.measure(iExtractLowerInt, iExtractHigherInt);
                        }
                        topDecorationHeight = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + getTopDecorationHeight(flexItemAt);
                        bottomDecorationHeight = f14 - (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + getBottomDecorationHeight(flexItemAt));
                        if (layoutState.mLayoutDirection == 1) {
                            calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                            addView(flexItemAt);
                        } else {
                            calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                            addView(flexItemAt, i11);
                            i11++;
                        }
                        int i25 = i11;
                        leftDecorationWidth = getLeftDecorationWidth(flexItemAt) + i16;
                        rightDecorationWidth = i17 - getRightDecorationWidth(flexItemAt);
                        z11 = this.mIsRtl;
                        if (z11) {
                            z12 = true;
                            if (this.mFromBottomToTop) {
                                this.mFlexboxHelper.layoutSingleChildVertical(flexItemAt, flexLine, z11, leftDecorationWidth, Math.round(bottomDecorationHeight) - flexItemAt.getMeasuredHeight(), leftDecorationWidth + flexItemAt.getMeasuredWidth(), Math.round(bottomDecorationHeight));
                            } else {
                                this.mFlexboxHelper.layoutSingleChildVertical(flexItemAt, flexLine, z11, leftDecorationWidth, Math.round(topDecorationHeight), leftDecorationWidth + flexItemAt.getMeasuredWidth(), flexItemAt.getMeasuredHeight() + Math.round(topDecorationHeight));
                            }
                        } else if (this.mFromBottomToTop) {
                            z12 = true;
                            this.mFlexboxHelper.layoutSingleChildVertical(flexItemAt, flexLine2, z11, rightDecorationWidth - flexItemAt.getMeasuredWidth(), Math.round(bottomDecorationHeight) - flexItemAt.getMeasuredHeight(), rightDecorationWidth, Math.round(bottomDecorationHeight));
                        } else {
                            z12 = true;
                            this.mFlexboxHelper.layoutSingleChildVertical(flexItemAt, flexLine, z11, rightDecorationWidth - flexItemAt.getMeasuredWidth(), Math.round(topDecorationHeight), rightDecorationWidth, flexItemAt.getMeasuredHeight() + Math.round(topDecorationHeight));
                        }
                        measuredHeight = topDecorationHeight + flexItemAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + getBottomDecorationHeight(flexItemAt) + f15;
                        i11 = i25;
                        measuredHeight2 = bottomDecorationHeight - (((flexItemAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) + getTopDecorationHeight(flexItemAt)) + f15);
                    }
                    i12++;
                    flexLine2 = flexLine;
                    fMax = f15;
                    z13 = z12;
                }
                layoutState.mFlexLinePosition += this.mLayoutState.mLayoutDirection;
                return flexLine.getCrossSize();
            }
            int i26 = flexLine2.mMainSize;
            float f17 = (height - i26) + paddingBottom;
            f12 = i26 - paddingTop;
            f11 = f17;
        }
        f13 = 0.0f;
        measuredHeight = f11 - this.mAnchorInfo.mPerpendicularCoordinate;
        measuredHeight2 = f12 - this.mAnchorInfo.mPerpendicularCoordinate;
        fMax = Math.max(f13, 0.0f);
        itemCount = flexLine2.getItemCount();
        i11 = 0;
        i12 = i18;
        while (i12 < i18 + itemCount) {
            f14 = measuredHeight2;
            flexItemAt = getFlexItemAt(i12);
            if (flexItemAt == null) {
                measuredHeight2 = f14;
                z12 = z13;
                f15 = fMax;
            } else {
                FlexboxHelper flexboxHelper2 = this.mFlexboxHelper;
                f15 = fMax;
                long j12 = flexboxHelper2.mMeasureSpecCache[i12];
                iExtractLowerInt = flexboxHelper2.extractLowerInt(j12);
                iExtractHigherInt = this.mFlexboxHelper.extractHigherInt(j12);
                layoutParams = (LayoutParams) flexItemAt.getLayoutParams();
                if (shouldMeasureChild(flexItemAt, iExtractLowerInt, iExtractHigherInt, layoutParams)) {
                    flexItemAt.measure(iExtractLowerInt, iExtractHigherInt);
                }
                topDecorationHeight = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + getTopDecorationHeight(flexItemAt);
                bottomDecorationHeight = f14 - (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + getBottomDecorationHeight(flexItemAt));
                if (layoutState.mLayoutDirection == 1) {
                    calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                    addView(flexItemAt);
                } else {
                    calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                    addView(flexItemAt, i11);
                    i11++;
                }
                int i27 = i11;
                leftDecorationWidth = getLeftDecorationWidth(flexItemAt) + i16;
                rightDecorationWidth = i17 - getRightDecorationWidth(flexItemAt);
                z11 = this.mIsRtl;
                if (z11) {
                    z12 = true;
                    if (this.mFromBottomToTop) {
                        this.mFlexboxHelper.layoutSingleChildVertical(flexItemAt, flexLine, z11, leftDecorationWidth, Math.round(bottomDecorationHeight) - flexItemAt.getMeasuredHeight(), leftDecorationWidth + flexItemAt.getMeasuredWidth(), Math.round(bottomDecorationHeight));
                    } else {
                        this.mFlexboxHelper.layoutSingleChildVertical(flexItemAt, flexLine, z11, leftDecorationWidth, Math.round(topDecorationHeight), leftDecorationWidth + flexItemAt.getMeasuredWidth(), flexItemAt.getMeasuredHeight() + Math.round(topDecorationHeight));
                    }
                } else if (this.mFromBottomToTop) {
                    z12 = true;
                    this.mFlexboxHelper.layoutSingleChildVertical(flexItemAt, flexLine2, z11, rightDecorationWidth - flexItemAt.getMeasuredWidth(), Math.round(bottomDecorationHeight) - flexItemAt.getMeasuredHeight(), rightDecorationWidth, Math.round(bottomDecorationHeight));
                } else {
                    z12 = true;
                    this.mFlexboxHelper.layoutSingleChildVertical(flexItemAt, flexLine, z11, rightDecorationWidth - flexItemAt.getMeasuredWidth(), Math.round(topDecorationHeight), rightDecorationWidth, flexItemAt.getMeasuredHeight() + Math.round(topDecorationHeight));
                }
                measuredHeight = topDecorationHeight + flexItemAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + getBottomDecorationHeight(flexItemAt) + f15;
                i11 = i27;
                measuredHeight2 = bottomDecorationHeight - (((flexItemAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) + getTopDecorationHeight(flexItemAt)) + f15);
            }
            i12++;
            flexLine2 = flexLine;
            fMax = f15;
            z13 = z12;
        }
        layoutState.mFlexLinePosition += this.mLayoutState.mLayoutDirection;
        return flexLine.getCrossSize();
    }

    private void recycleChildren(RecyclerView.Recycler recycler, int i11, int i12) {
        while (i12 >= i11) {
            removeAndRecycleViewAt(i12, recycler);
            i12--;
        }
    }

    private void updateAnchorInfoForLayout(RecyclerView.State state, AnchorInfo anchorInfo) {
        if (updateAnchorFromPendingState(state, anchorInfo, this.mPendingSavedState) || updateAnchorFromChildren(state, anchorInfo)) {
            return;
        }
        anchorInfo.assignCoordinateFromPadding();
        anchorInfo.mPosition = 0;
        anchorInfo.mFlexLinePosition = 0;
    }

    private void updateLayoutState(int i11, int i12) {
        this.mLayoutState.mLayoutDirection = i11;
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        boolean z11 = !zIsMainAxisDirectionHorizontal && this.mIsRtl;
        if (i11 == 1) {
            View childAt = getChildAt(getChildCount() - 1);
            this.mLayoutState.mOffset = this.mOrientationHelper.getDecoratedEnd(childAt);
            int position = getPosition(childAt);
            View viewFindLastReferenceViewInLine = findLastReferenceViewInLine(childAt, this.mFlexLines.get(this.mFlexboxHelper.mIndexToFlexLine[position]));
            this.mLayoutState.mItemDirection = 1;
            LayoutState layoutState = this.mLayoutState;
            layoutState.mPosition = position + layoutState.mItemDirection;
            if (this.mFlexboxHelper.mIndexToFlexLine.length <= this.mLayoutState.mPosition) {
                this.mLayoutState.mFlexLinePosition = -1;
            } else {
                LayoutState layoutState2 = this.mLayoutState;
                layoutState2.mFlexLinePosition = this.mFlexboxHelper.mIndexToFlexLine[layoutState2.mPosition];
            }
            if (z11) {
                this.mLayoutState.mOffset = this.mOrientationHelper.getDecoratedStart(viewFindLastReferenceViewInLine);
                this.mLayoutState.mScrollingOffset = (-this.mOrientationHelper.getDecoratedStart(viewFindLastReferenceViewInLine)) + this.mOrientationHelper.getStartAfterPadding();
                LayoutState layoutState3 = this.mLayoutState;
                layoutState3.mScrollingOffset = layoutState3.mScrollingOffset >= 0 ? this.mLayoutState.mScrollingOffset : 0;
            } else {
                this.mLayoutState.mOffset = this.mOrientationHelper.getDecoratedEnd(viewFindLastReferenceViewInLine);
                this.mLayoutState.mScrollingOffset = this.mOrientationHelper.getDecoratedEnd(viewFindLastReferenceViewInLine) - this.mOrientationHelper.getEndAfterPadding();
            }
            if ((this.mLayoutState.mFlexLinePosition == -1 || this.mLayoutState.mFlexLinePosition > this.mFlexLines.size() - 1) && this.mLayoutState.mPosition <= getFlexItemCount()) {
                int i13 = i12 - this.mLayoutState.mScrollingOffset;
                this.mFlexLinesResult.reset();
                if (i13 > 0) {
                    if (zIsMainAxisDirectionHorizontal) {
                        this.mFlexboxHelper.calculateHorizontalFlexLines(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i13, this.mLayoutState.mPosition, this.mFlexLines);
                    } else {
                        this.mFlexboxHelper.calculateVerticalFlexLines(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i13, this.mLayoutState.mPosition, this.mFlexLines);
                    }
                    this.mFlexboxHelper.determineMainSize(iMakeMeasureSpec, iMakeMeasureSpec2, this.mLayoutState.mPosition);
                    this.mFlexboxHelper.stretchViews(this.mLayoutState.mPosition);
                }
            }
        } else {
            View childAt2 = getChildAt(0);
            this.mLayoutState.mOffset = this.mOrientationHelper.getDecoratedStart(childAt2);
            int position2 = getPosition(childAt2);
            View viewFindFirstReferenceViewInLine = findFirstReferenceViewInLine(childAt2, this.mFlexLines.get(this.mFlexboxHelper.mIndexToFlexLine[position2]));
            this.mLayoutState.mItemDirection = 1;
            int i14 = this.mFlexboxHelper.mIndexToFlexLine[position2];
            if (i14 == -1) {
                i14 = 0;
            }
            if (i14 > 0) {
                this.mLayoutState.mPosition = position2 - this.mFlexLines.get(i14 - 1).getItemCount();
            } else {
                this.mLayoutState.mPosition = -1;
            }
            this.mLayoutState.mFlexLinePosition = i14 > 0 ? i14 - 1 : 0;
            if (z11) {
                this.mLayoutState.mOffset = this.mOrientationHelper.getDecoratedEnd(viewFindFirstReferenceViewInLine);
                this.mLayoutState.mScrollingOffset = this.mOrientationHelper.getDecoratedEnd(viewFindFirstReferenceViewInLine) - this.mOrientationHelper.getEndAfterPadding();
                LayoutState layoutState4 = this.mLayoutState;
                layoutState4.mScrollingOffset = layoutState4.mScrollingOffset >= 0 ? this.mLayoutState.mScrollingOffset : 0;
            } else {
                this.mLayoutState.mOffset = this.mOrientationHelper.getDecoratedStart(viewFindFirstReferenceViewInLine);
                this.mLayoutState.mScrollingOffset = (-this.mOrientationHelper.getDecoratedStart(viewFindFirstReferenceViewInLine)) + this.mOrientationHelper.getStartAfterPadding();
            }
        }
        LayoutState layoutState5 = this.mLayoutState;
        layoutState5.mAvailable = i12 - layoutState5.mScrollingOffset;
    }

    private void updateLayoutStateToFillEnd(AnchorInfo anchorInfo, boolean z11, boolean z12) {
        if (z12) {
            resolveInfiniteAmount();
        } else {
            this.mLayoutState.mInfinite = false;
        }
        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
            this.mLayoutState.mAvailable = this.mOrientationHelper.getEndAfterPadding() - anchorInfo.mCoordinate;
        } else {
            this.mLayoutState.mAvailable = anchorInfo.mCoordinate - getPaddingRight();
        }
        this.mLayoutState.mPosition = anchorInfo.mPosition;
        this.mLayoutState.mItemDirection = 1;
        this.mLayoutState.mLayoutDirection = 1;
        this.mLayoutState.mOffset = anchorInfo.mCoordinate;
        this.mLayoutState.mScrollingOffset = Integer.MIN_VALUE;
        this.mLayoutState.mFlexLinePosition = anchorInfo.mFlexLinePosition;
        if (!z11 || this.mFlexLines.size() <= 1 || anchorInfo.mFlexLinePosition < 0 || anchorInfo.mFlexLinePosition >= this.mFlexLines.size() - 1) {
            return;
        }
        FlexLine flexLine = this.mFlexLines.get(anchorInfo.mFlexLinePosition);
        LayoutState.access$1508(this.mLayoutState);
        this.mLayoutState.mPosition += flexLine.getItemCount();
    }

    private void updateLayoutStateToFillStart(AnchorInfo anchorInfo, boolean z11, boolean z12) {
        if (z12) {
            resolveInfiniteAmount();
        } else {
            this.mLayoutState.mInfinite = false;
        }
        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
            this.mLayoutState.mAvailable = anchorInfo.mCoordinate - this.mOrientationHelper.getStartAfterPadding();
        } else {
            this.mLayoutState.mAvailable = (this.mParent.getWidth() - anchorInfo.mCoordinate) - this.mOrientationHelper.getStartAfterPadding();
        }
        this.mLayoutState.mPosition = anchorInfo.mPosition;
        this.mLayoutState.mItemDirection = 1;
        this.mLayoutState.mLayoutDirection = -1;
        this.mLayoutState.mOffset = anchorInfo.mCoordinate;
        this.mLayoutState.mScrollingOffset = Integer.MIN_VALUE;
        this.mLayoutState.mFlexLinePosition = anchorInfo.mFlexLinePosition;
        if (!z11 || anchorInfo.mFlexLinePosition <= 0 || this.mFlexLines.size() <= anchorInfo.mFlexLinePosition) {
            return;
        }
        FlexLine flexLine = this.mFlexLines.get(anchorInfo.mFlexLinePosition);
        LayoutState.access$1510(this.mLayoutState);
        this.mLayoutState.mPosition -= flexLine.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        if (this.mFlexWrap == 0) {
            return isMainAxisDirectionHorizontal();
        }
        if (!isMainAxisDirectionHorizontal()) {
            return true;
        }
        int width = getWidth();
        View view = this.mParent;
        return width > (view != null ? view.getWidth() : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        if (this.mFlexWrap == 0) {
            return !isMainAxisDirectionHorizontal();
        }
        if (!isMainAxisDirectionHorizontal()) {
            int height = getHeight();
            View view = this.mParent;
            if (height <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getAlignItems() {
        return this.mAlignItems;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexDirection() {
        return this.mFlexDirection;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public View getFlexItemAt(int i11) {
        View view = this.mViewCache.get(i11);
        return view != null ? view : this.mRecycler.getViewForPosition(i11);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexItemCount() {
        return this.mState.getItemCount();
    }

    @Override // com.google.android.flexbox.FlexContainer
    public List<FlexLine> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.mFlexLines.size());
        int size = this.mFlexLines.size();
        for (int i11 = 0; i11 < size; i11++) {
            FlexLine flexLine = this.mFlexLines.get(i11);
            if (flexLine.getItemCount() != 0) {
                arrayList.add(flexLine);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public List<FlexLine> getFlexLinesInternal() {
        return this.mFlexLines;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexWrap() {
        return this.mFlexWrap;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getJustifyContent() {
        return this.mJustifyContent;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getLargestMainSize() {
        if (this.mFlexLines.size() == 0) {
            return 0;
        }
        int size = this.mFlexLines.size();
        int iMax = Integer.MIN_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            iMax = Math.max(iMax, this.mFlexLines.get(i11).mMainSize);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getMaxLine() {
        return this.mMaxLine;
    }

    public int getPositionToFlexLineIndex(int i11) {
        return this.mFlexboxHelper.mIndexToFlexLine[i11];
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getSumOfCrossSize() {
        int size = this.mFlexLines.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += this.mFlexLines.get(i12).mCrossSize;
        }
        return i11;
    }

    public boolean isLayoutRtl() {
        return this.mIsRtl;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public boolean isMainAxisDirectionHorizontal() {
        int i11 = this.mFlexDirection;
        return i11 == 0 || i11 == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i11;
        int i12;
        this.mRecycler = recycler;
        this.mState = state;
        int itemCount = state.getItemCount();
        if (itemCount == 0 && state.isPreLayout()) {
            return;
        }
        resolveLayoutDirection();
        ensureOrientationHelper();
        ensureLayoutState();
        this.mFlexboxHelper.ensureMeasureSpecCache(itemCount);
        this.mFlexboxHelper.ensureMeasuredSizeCache(itemCount);
        this.mFlexboxHelper.ensureIndexToFlexLine(itemCount);
        this.mLayoutState.mShouldRecycle = false;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.hasValidAnchor(itemCount)) {
            this.mPendingScrollPosition = this.mPendingSavedState.mAnchorPosition;
        }
        if (!this.mAnchorInfo.mValid || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            this.mAnchorInfo.reset();
            updateAnchorInfoForLayout(state, this.mAnchorInfo);
            this.mAnchorInfo.mValid = true;
        }
        detachAndScrapAttachedViews(recycler);
        if (this.mAnchorInfo.mLayoutFromEnd) {
            updateLayoutStateToFillStart(this.mAnchorInfo, false, true);
        } else {
            updateLayoutStateToFillEnd(this.mAnchorInfo, false, true);
        }
        updateFlexLines(itemCount);
        if (this.mAnchorInfo.mLayoutFromEnd) {
            fill(recycler, state, this.mLayoutState);
            i12 = this.mLayoutState.mOffset;
            updateLayoutStateToFillEnd(this.mAnchorInfo, true, false);
            fill(recycler, state, this.mLayoutState);
            i11 = this.mLayoutState.mOffset;
        } else {
            fill(recycler, state, this.mLayoutState);
            i11 = this.mLayoutState.mOffset;
            updateLayoutStateToFillStart(this.mAnchorInfo, true, false);
            fill(recycler, state, this.mLayoutState);
            i12 = this.mLayoutState.mOffset;
        }
        if (getChildCount() > 0) {
            if (this.mAnchorInfo.mLayoutFromEnd) {
                fixLayoutStartGap(i12 + fixLayoutEndGap(i11, recycler, state, true), recycler, state, false);
            } else {
                fixLayoutEndGap(i11 + fixLayoutStartGap(i12, recycler, state, true), recycler, state, false);
            }
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void onNewFlexItemAdded(View view, int i11, int i12, FlexLine flexLine) {
        calculateItemDecorationsForChild(view, TEMP_RECT);
        if (isMainAxisDirectionHorizontal()) {
            int leftDecorationWidth = getLeftDecorationWidth(view) + getRightDecorationWidth(view);
            flexLine.mMainSize += leftDecorationWidth;
            flexLine.mDividerLengthInMainSize += leftDecorationWidth;
        } else {
            int topDecorationHeight = getTopDecorationHeight(view) + getBottomDecorationHeight(view);
            flexLine.mMainSize += topDecorationHeight;
            flexLine.mDividerLengthInMainSize += topDecorationHeight;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.mPendingSavedState = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() <= 0) {
            savedState.invalidateAnchor();
            return savedState;
        }
        View childClosestToStart = getChildClosestToStart();
        savedState.mAnchorPosition = getPosition(childClosestToStart);
        savedState.mAnchorOffset = this.mOrientationHelper.getDecoratedStart(childClosestToStart) - this.mOrientationHelper.getStartAfterPadding();
        return savedState;
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

    @Override // com.google.android.flexbox.FlexContainer
    public void setAlignContent(int i11) {
        throw new UnsupportedOperationException("Setting the alignContent in the FlexboxLayoutManager is not supported. Use FlexboxLayout if you need to use this attribute.");
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setAlignItems(int i11) {
        int i12 = this.mAlignItems;
        if (i12 != i11) {
            if (i12 == 4 || i11 == 4) {
                removeAllViews();
                clearFlexLines();
            }
            this.mAlignItems = i11;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexDirection(int i11) {
        if (this.mFlexDirection != i11) {
            removeAllViews();
            this.mFlexDirection = i11;
            this.mOrientationHelper = null;
            this.mSubOrientationHelper = null;
            clearFlexLines();
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexLines(List<FlexLine> list) {
        this.mFlexLines = list;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setJustifyContent(int i11) {
        if (this.mJustifyContent != i11) {
            this.mJustifyContent = i11;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setMaxLine(int i11) {
        if (this.mMaxLine != i11) {
            this.mMaxLine = i11;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z11) {
        this.mRecycleChildrenOnDetach = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i11) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i11);
        startSmoothScroll(linearSmoothScroller);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void updateViewCache(int i11, View view) {
        this.mViewCache.put(i11, view);
    }

    public FlexboxLayoutManager(Context context, int i11, int i12) {
        this.mMaxLine = -1;
        this.mFlexLines = new ArrayList();
        this.mFlexboxHelper = new FlexboxHelper(this);
        this.mAnchorInfo = new AnchorInfo();
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mLastWidth = Integer.MIN_VALUE;
        this.mLastHeight = Integer.MIN_VALUE;
        this.mViewCache = new SparseArray<>();
        this.mDirtyPosition = -1;
        this.mFlexLinesResult = new FlexboxHelper.FlexLinesResult();
        setFlexDirection(i11);
        setFlexWrap(i12);
        setAlignItems(4);
        setAutoMeasureEnabled(true);
        this.mContext = context;
    }

    private boolean canViewBeRecycledFromEnd(View view, int i11) {
        if (!isMainAxisDirectionHorizontal() && this.mIsRtl) {
            if (this.mOrientationHelper.getDecoratedEnd(view) > i11) {
                return false;
            }
            return true;
        }
        if (this.mOrientationHelper.getDecoratedStart(view) < this.mOrientationHelper.getEnd() - i11) {
            return false;
        }
        return true;
    }

    private boolean canViewBeRecycledFromStart(View view, int i11) {
        if (!isMainAxisDirectionHorizontal() && this.mIsRtl) {
            if (this.mOrientationHelper.getEnd() - this.mOrientationHelper.getDecoratedStart(view) > i11) {
                return false;
            }
            return true;
        }
        if (this.mOrientationHelper.getDecoratedEnd(view) > i11) {
            return false;
        }
        return true;
    }

    private int computeScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        ensureOrientationHelper();
        View viewFindFirstReferenceChild = findFirstReferenceChild(itemCount);
        View viewFindLastReferenceChild = findLastReferenceChild(itemCount);
        if (state.getItemCount() == 0 || viewFindFirstReferenceChild == null || viewFindLastReferenceChild == null) {
            return 0;
        }
        return Math.min(this.mOrientationHelper.getTotalSpace(), this.mOrientationHelper.getDecoratedEnd(viewFindLastReferenceChild) - this.mOrientationHelper.getDecoratedStart(viewFindFirstReferenceChild));
    }

    private int computeScrollOffset(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        View viewFindFirstReferenceChild = findFirstReferenceChild(itemCount);
        View viewFindLastReferenceChild = findLastReferenceChild(itemCount);
        if (state.getItemCount() != 0 && viewFindFirstReferenceChild != null && viewFindLastReferenceChild != null) {
            int position = getPosition(viewFindFirstReferenceChild);
            int position2 = getPosition(viewFindLastReferenceChild);
            int iAbs = Math.abs(this.mOrientationHelper.getDecoratedEnd(viewFindLastReferenceChild) - this.mOrientationHelper.getDecoratedStart(viewFindFirstReferenceChild));
            int[] iArr = this.mFlexboxHelper.mIndexToFlexLine;
            int i11 = iArr[position];
            if (i11 != 0 && i11 != -1) {
                return Math.round((i11 * (iAbs / ((iArr[position2] - i11) + 1))) + (this.mOrientationHelper.getStartAfterPadding() - this.mOrientationHelper.getDecoratedStart(viewFindFirstReferenceChild)));
            }
        }
        return 0;
    }

    private int computeScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        View viewFindFirstReferenceChild = findFirstReferenceChild(itemCount);
        View viewFindLastReferenceChild = findLastReferenceChild(itemCount);
        if (state.getItemCount() == 0 || viewFindFirstReferenceChild == null || viewFindLastReferenceChild == null) {
            return 0;
        }
        return (int) ((Math.abs(this.mOrientationHelper.getDecoratedEnd(viewFindLastReferenceChild) - this.mOrientationHelper.getDecoratedStart(viewFindFirstReferenceChild)) / ((findLastVisibleItemPosition() - findFirstVisibleItemPosition()) + 1)) * state.getItemCount());
    }

    private int fill(RecyclerView.Recycler recycler, RecyclerView.State state, LayoutState layoutState) {
        if (layoutState.mScrollingOffset != Integer.MIN_VALUE) {
            if (layoutState.mAvailable < 0) {
                layoutState.mScrollingOffset += layoutState.mAvailable;
            }
            recycleByLayoutState(recycler, layoutState);
        }
        int i11 = layoutState.mAvailable;
        int crossSize = layoutState.mAvailable;
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int iLayoutFlexLine = 0;
        while (true) {
            if ((crossSize <= 0 && !this.mLayoutState.mInfinite) || !layoutState.hasMore(state, this.mFlexLines)) {
                break;
            }
            FlexLine flexLine = this.mFlexLines.get(layoutState.mFlexLinePosition);
            layoutState.mPosition = flexLine.mFirstIndex;
            iLayoutFlexLine += layoutFlexLine(flexLine, layoutState);
            if (zIsMainAxisDirectionHorizontal || !this.mIsRtl) {
                layoutState.mOffset += flexLine.getCrossSize() * layoutState.mLayoutDirection;
            } else {
                layoutState.mOffset -= flexLine.getCrossSize() * layoutState.mLayoutDirection;
            }
            crossSize -= flexLine.getCrossSize();
        }
        layoutState.mAvailable -= iLayoutFlexLine;
        if (layoutState.mScrollingOffset != Integer.MIN_VALUE) {
            layoutState.mScrollingOffset += iLayoutFlexLine;
            if (layoutState.mAvailable < 0) {
                layoutState.mScrollingOffset += layoutState.mAvailable;
            }
            recycleByLayoutState(recycler, layoutState);
        }
        return i11 - layoutState.mAvailable;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    private View findFirstReferenceViewInLine(View view, FlexLine flexLine) {
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int i11 = flexLine.mItemCount;
        for (int i12 = 1; i12 < i11; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (this.mIsRtl && !zIsMainAxisDirectionHorizontal) {
                    if (this.mOrientationHelper.getDecoratedEnd(view) < this.mOrientationHelper.getDecoratedEnd(childAt)) {
                        view = childAt;
                    }
                } else if (this.mOrientationHelper.getDecoratedStart(view) > this.mOrientationHelper.getDecoratedStart(childAt)) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    private View findLastReferenceChild(int i11) {
        View viewFindReferenceChild = findReferenceChild(getChildCount() - 1, -1, i11);
        if (viewFindReferenceChild == null) {
            return null;
        }
        return findLastReferenceViewInLine(viewFindReferenceChild, this.mFlexLines.get(this.mFlexboxHelper.mIndexToFlexLine[getPosition(viewFindReferenceChild)]));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    private View findLastReferenceViewInLine(View view, FlexLine flexLine) {
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int childCount = (getChildCount() - flexLine.mItemCount) - 1;
        for (int childCount2 = getChildCount() - 2; childCount2 > childCount; childCount2--) {
            View childAt = getChildAt(childCount2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (this.mIsRtl && !zIsMainAxisDirectionHorizontal) {
                    if (this.mOrientationHelper.getDecoratedStart(view) > this.mOrientationHelper.getDecoratedStart(childAt)) {
                        view = childAt;
                    }
                } else if (this.mOrientationHelper.getDecoratedEnd(view) < this.mOrientationHelper.getDecoratedEnd(childAt)) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    private View findReferenceChild(int i11, int i12, int i13) {
        int i14;
        ensureOrientationHelper();
        ensureLayoutState();
        int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
        int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
        if (i12 > i11) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        View view2 = null;
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            int position = getPosition(childAt);
            if (position >= 0 && position < i13) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.getDecoratedStart(childAt) >= startAfterPadding && this.mOrientationHelper.getDecoratedEnd(childAt) <= endAfterPadding) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i11 += i14;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    private int fixLayoutEndGap(int i11, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z11) {
        int iHandleScrollingMainOrientation;
        int endAfterPadding;
        if (!isMainAxisDirectionHorizontal() && this.mIsRtl) {
            int startAfterPadding = i11 - this.mOrientationHelper.getStartAfterPadding();
            if (startAfterPadding <= 0) {
                return 0;
            }
            iHandleScrollingMainOrientation = handleScrollingMainOrientation(startAfterPadding, recycler, state);
        } else {
            int endAfterPadding2 = this.mOrientationHelper.getEndAfterPadding() - i11;
            if (endAfterPadding2 <= 0) {
                return 0;
            }
            iHandleScrollingMainOrientation = -handleScrollingMainOrientation(-endAfterPadding2, recycler, state);
        }
        int i12 = i11 + iHandleScrollingMainOrientation;
        if (z11 && (endAfterPadding = this.mOrientationHelper.getEndAfterPadding() - i12) > 0) {
            this.mOrientationHelper.offsetChildren(endAfterPadding);
            return endAfterPadding + iHandleScrollingMainOrientation;
        }
        return iHandleScrollingMainOrientation;
    }

    private int fixLayoutStartGap(int i11, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z11) {
        int iHandleScrollingMainOrientation;
        int startAfterPadding;
        if (!isMainAxisDirectionHorizontal() && this.mIsRtl) {
            int endAfterPadding = this.mOrientationHelper.getEndAfterPadding() - i11;
            if (endAfterPadding <= 0) {
                return 0;
            }
            iHandleScrollingMainOrientation = handleScrollingMainOrientation(-endAfterPadding, recycler, state);
        } else {
            int startAfterPadding2 = i11 - this.mOrientationHelper.getStartAfterPadding();
            if (startAfterPadding2 <= 0) {
                return 0;
            }
            iHandleScrollingMainOrientation = -handleScrollingMainOrientation(startAfterPadding2, recycler, state);
        }
        int i12 = i11 + iHandleScrollingMainOrientation;
        if (z11 && (startAfterPadding = i12 - this.mOrientationHelper.getStartAfterPadding()) > 0) {
            this.mOrientationHelper.offsetChildren(-startAfterPadding);
            return iHandleScrollingMainOrientation - startAfterPadding;
        }
        return iHandleScrollingMainOrientation;
    }

    private int getChildBottom(View view) {
        return getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    private int getChildLeft(View view) {
        return getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
    }

    private int getChildRight(View view) {
        return getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
    }

    private int getChildTop(View view) {
        return getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
    }

    private int handleScrollingMainOrientation(int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean z11;
        if (getChildCount() == 0 || i11 == 0) {
            return 0;
        }
        ensureOrientationHelper();
        int i12 = 1;
        this.mLayoutState.mShouldRecycle = true;
        if (!isMainAxisDirectionHorizontal() && this.mIsRtl) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 ? i11 <= 0 : i11 >= 0) {
            i12 = -1;
        }
        int iAbs = Math.abs(i11);
        updateLayoutState(i12, iAbs);
        int iFill = this.mLayoutState.mScrollingOffset + fill(recycler, state, this.mLayoutState);
        if (iFill < 0) {
            return 0;
        }
        if (z11) {
            if (iAbs > iFill) {
                i11 = (-i12) * iFill;
            }
        } else if (iAbs > iFill) {
            i11 = i12 * iFill;
        }
        this.mOrientationHelper.offsetChildren(-i11);
        this.mLayoutState.mLastScrollDelta = i11;
        return i11;
    }

    private int handleScrollingSubOrientation(int i11) {
        int height;
        int height2;
        if (getChildCount() != 0 && i11 != 0) {
            ensureOrientationHelper();
            boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
            View view = this.mParent;
            if (zIsMainAxisDirectionHorizontal) {
                height = view.getWidth();
            } else {
                height = view.getHeight();
            }
            if (zIsMainAxisDirectionHorizontal) {
                height2 = getWidth();
            } else {
                height2 = getHeight();
            }
            if (getLayoutDirection() == 1) {
                int iAbs = Math.abs(i11);
                if (i11 < 0) {
                    return -Math.min((height2 + this.mAnchorInfo.mPerpendicularCoordinate) - height, iAbs);
                }
                if (this.mAnchorInfo.mPerpendicularCoordinate + i11 > 0) {
                    return -this.mAnchorInfo.mPerpendicularCoordinate;
                }
            } else {
                if (i11 > 0) {
                    return Math.min((height2 - this.mAnchorInfo.mPerpendicularCoordinate) - height, i11);
                }
                if (this.mAnchorInfo.mPerpendicularCoordinate + i11 < 0) {
                    return -this.mAnchorInfo.mPerpendicularCoordinate;
                }
            }
            return i11;
        }
        return 0;
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

    private boolean isViewVisible(View view, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int childLeft = getChildLeft(view);
        int childTop = getChildTop(view);
        int childRight = getChildRight(view);
        int childBottom = getChildBottom(view);
        if (paddingLeft <= childLeft && width >= childRight) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (childLeft < width && childRight < paddingLeft) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (paddingTop <= childTop && height >= childBottom) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (childTop < height && childBottom < paddingTop) {
            z15 = false;
        } else {
            z15 = true;
        }
        if (z11) {
            if (z12 && z14) {
                return true;
            }
            return false;
        }
        if (z13 && z15) {
            return true;
        }
        return false;
    }

    private int layoutFlexLine(FlexLine flexLine, LayoutState layoutState) {
        if (isMainAxisDirectionHorizontal()) {
            return layoutFlexLineMainAxisHorizontal(flexLine, layoutState);
        }
        return layoutFlexLineMainAxisVertical(flexLine, layoutState);
    }

    private void recycleByLayoutState(RecyclerView.Recycler recycler, LayoutState layoutState) {
        if (!layoutState.mShouldRecycle) {
            return;
        }
        if (layoutState.mLayoutDirection == -1) {
            recycleFlexLinesFromEnd(recycler, layoutState);
        } else {
            recycleFlexLinesFromStart(recycler, layoutState);
        }
    }

    private void recycleFlexLinesFromEnd(RecyclerView.Recycler recycler, LayoutState layoutState) {
        if (layoutState.mScrollingOffset >= 0) {
            this.mOrientationHelper.getEnd();
            int unused = layoutState.mScrollingOffset;
            int childCount = getChildCount();
            if (childCount != 0) {
                int i11 = childCount - 1;
                int i12 = this.mFlexboxHelper.mIndexToFlexLine[getPosition(getChildAt(i11))];
                if (i12 == -1) {
                    return;
                }
                FlexLine flexLine = this.mFlexLines.get(i12);
                for (int i13 = i11; i13 >= 0; i13--) {
                    View childAt = getChildAt(i13);
                    if (!canViewBeRecycledFromEnd(childAt, layoutState.mScrollingOffset)) {
                        break;
                    }
                    if (flexLine.mFirstIndex == getPosition(childAt)) {
                        if (i12 <= 0) {
                            childCount = i13;
                            break;
                        } else {
                            i12 += layoutState.mLayoutDirection;
                            flexLine = this.mFlexLines.get(i12);
                            childCount = i13;
                        }
                    }
                }
                recycleChildren(recycler, childCount, i11);
            }
        }
    }

    private void recycleFlexLinesFromStart(RecyclerView.Recycler recycler, LayoutState layoutState) {
        int childCount;
        if (layoutState.mScrollingOffset >= 0 && (childCount = getChildCount()) != 0) {
            int i11 = this.mFlexboxHelper.mIndexToFlexLine[getPosition(getChildAt(0))];
            int i12 = -1;
            if (i11 == -1) {
                return;
            }
            FlexLine flexLine = this.mFlexLines.get(i11);
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (!canViewBeRecycledFromStart(childAt, layoutState.mScrollingOffset)) {
                    break;
                }
                if (flexLine.mLastIndex == getPosition(childAt)) {
                    if (i11 >= this.mFlexLines.size() - 1) {
                        i12 = i13;
                        break;
                    } else {
                        i11 += layoutState.mLayoutDirection;
                        flexLine = this.mFlexLines.get(i11);
                        i12 = i13;
                    }
                }
            }
            recycleChildren(recycler, 0, i12);
        }
    }

    private void resolveInfiniteAmount() {
        int widthMode;
        boolean z11;
        if (isMainAxisDirectionHorizontal()) {
            widthMode = getHeightMode();
        } else {
            widthMode = getWidthMode();
        }
        LayoutState layoutState = this.mLayoutState;
        if (widthMode != 0 && widthMode != Integer.MIN_VALUE) {
            z11 = false;
        } else {
            z11 = true;
        }
        layoutState.mInfinite = z11;
    }

    private void resolveLayoutDirection() {
        boolean z11;
        boolean z12;
        boolean z13;
        int layoutDirection = getLayoutDirection();
        int i11 = this.mFlexDirection;
        boolean z14 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        this.mIsRtl = false;
                        this.mFromBottomToTop = false;
                        return;
                    }
                    if (layoutDirection == 1) {
                        z14 = true;
                    }
                    this.mIsRtl = z14;
                    if (this.mFlexWrap == 2) {
                        this.mIsRtl = !z14;
                    }
                    this.mFromBottomToTop = true;
                    return;
                }
                if (layoutDirection == 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.mIsRtl = z13;
                if (this.mFlexWrap == 2) {
                    this.mIsRtl = !z13;
                }
                this.mFromBottomToTop = false;
                return;
            }
            if (layoutDirection != 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.mIsRtl = z12;
            if (this.mFlexWrap == 2) {
                z14 = true;
            }
            this.mFromBottomToTop = z14;
            return;
        }
        if (layoutDirection == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.mIsRtl = z11;
        if (this.mFlexWrap == 2) {
            z14 = true;
        }
        this.mFromBottomToTop = z14;
    }

    private boolean shouldMeasureChild(View view, int i11, int i12, RecyclerView.LayoutParams layoutParams) {
        if (!view.isLayoutRequested() && isMeasurementCacheEnabled() && isMeasurementUpToDate(view.getWidth(), i11, ((ViewGroup.MarginLayoutParams) layoutParams).width) && isMeasurementUpToDate(view.getHeight(), i12, ((ViewGroup.MarginLayoutParams) layoutParams).height)) {
            return false;
        }
        return true;
    }

    private boolean updateAnchorFromChildren(RecyclerView.State state, AnchorInfo anchorInfo) {
        View viewFindFirstReferenceChild;
        int startAfterPadding;
        if (getChildCount() == 0) {
            return false;
        }
        if (anchorInfo.mLayoutFromEnd) {
            viewFindFirstReferenceChild = findLastReferenceChild(state.getItemCount());
        } else {
            viewFindFirstReferenceChild = findFirstReferenceChild(state.getItemCount());
        }
        if (viewFindFirstReferenceChild != null) {
            anchorInfo.assignFromView(viewFindFirstReferenceChild);
            if (!state.isPreLayout() && supportsPredictiveItemAnimations()) {
                if (this.mOrientationHelper.getDecoratedStart(viewFindFirstReferenceChild) >= this.mOrientationHelper.getEndAfterPadding() || this.mOrientationHelper.getDecoratedEnd(viewFindFirstReferenceChild) < this.mOrientationHelper.getStartAfterPadding()) {
                    if (anchorInfo.mLayoutFromEnd) {
                        startAfterPadding = this.mOrientationHelper.getEndAfterPadding();
                    } else {
                        startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
                    }
                    anchorInfo.mCoordinate = startAfterPadding;
                    return true;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    private boolean updateAnchorFromPendingState(RecyclerView.State state, AnchorInfo anchorInfo, SavedState savedState) {
        int i11;
        int decoratedStart;
        boolean z11 = false;
        if (!state.isPreLayout() && (i11 = this.mPendingScrollPosition) != -1) {
            if (i11 >= 0 && i11 < state.getItemCount()) {
                anchorInfo.mPosition = this.mPendingScrollPosition;
                anchorInfo.mFlexLinePosition = this.mFlexboxHelper.mIndexToFlexLine[anchorInfo.mPosition];
                SavedState savedState2 = this.mPendingSavedState;
                if (savedState2 != null && savedState2.hasValidAnchor(state.getItemCount())) {
                    anchorInfo.mCoordinate = this.mOrientationHelper.getStartAfterPadding() + savedState.mAnchorOffset;
                    anchorInfo.mAssignedFromSavedState = true;
                    anchorInfo.mFlexLinePosition = -1;
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
                            }
                            anchorInfo.mLayoutFromEnd = z11;
                        }
                        anchorInfo.assignCoordinateFromPadding();
                    }
                    return true;
                }
                if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
                    anchorInfo.mCoordinate = this.mOrientationHelper.getStartAfterPadding() + this.mPendingScrollPositionOffset;
                } else {
                    anchorInfo.mCoordinate = this.mPendingScrollPositionOffset - this.mOrientationHelper.getEndPadding();
                }
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    private void updateDirtyPosition(int i11) {
        if (i11 < findLastVisibleItemPosition()) {
            int childCount = getChildCount();
            this.mFlexboxHelper.ensureMeasureSpecCache(childCount);
            this.mFlexboxHelper.ensureMeasuredSizeCache(childCount);
            this.mFlexboxHelper.ensureIndexToFlexLine(childCount);
            if (i11 < this.mFlexboxHelper.mIndexToFlexLine.length) {
                this.mDirtyPosition = i11;
                View childClosestToStart = getChildClosestToStart();
                if (childClosestToStart == null) {
                    return;
                }
                this.mPendingScrollPosition = getPosition(childClosestToStart);
                if (!isMainAxisDirectionHorizontal() && this.mIsRtl) {
                    this.mPendingScrollPositionOffset = this.mOrientationHelper.getDecoratedEnd(childClosestToStart) + this.mOrientationHelper.getEndPadding();
                } else {
                    this.mPendingScrollPositionOffset = this.mOrientationHelper.getDecoratedStart(childClosestToStart) - this.mOrientationHelper.getStartAfterPadding();
                }
            }
        }
    }

    private void updateFlexLines(int i11) {
        int i12;
        int iMin;
        int i13;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        int width = getWidth();
        int height = getHeight();
        boolean z11 = false;
        if (isMainAxisDirectionHorizontal()) {
            int i14 = this.mLastWidth;
            if (i14 != Integer.MIN_VALUE && i14 != width) {
                z11 = true;
            }
            i12 = this.mLayoutState.mInfinite ? this.mContext.getResources().getDisplayMetrics().heightPixels : this.mLayoutState.mAvailable;
        } else {
            int i15 = this.mLastHeight;
            if (i15 != Integer.MIN_VALUE && i15 != height) {
                z11 = true;
            }
            if (!this.mLayoutState.mInfinite) {
                i12 = this.mLayoutState.mAvailable;
            } else {
                i12 = this.mContext.getResources().getDisplayMetrics().widthPixels;
            }
        }
        int i16 = i12;
        this.mLastWidth = width;
        this.mLastHeight = height;
        int i17 = this.mDirtyPosition;
        if (i17 == -1 && (this.mPendingScrollPosition != -1 || z11)) {
            if (this.mAnchorInfo.mLayoutFromEnd) {
                return;
            }
            this.mFlexLines.clear();
            this.mFlexLinesResult.reset();
            if (isMainAxisDirectionHorizontal()) {
                this.mFlexboxHelper.calculateHorizontalFlexLinesToIndex(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i16, this.mAnchorInfo.mPosition, this.mFlexLines);
            } else {
                this.mFlexboxHelper.calculateVerticalFlexLinesToIndex(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i16, this.mAnchorInfo.mPosition, this.mFlexLines);
            }
            this.mFlexLines = this.mFlexLinesResult.mFlexLines;
            this.mFlexboxHelper.determineMainSize(iMakeMeasureSpec, iMakeMeasureSpec2);
            this.mFlexboxHelper.stretchViews();
            AnchorInfo anchorInfo = this.mAnchorInfo;
            anchorInfo.mFlexLinePosition = this.mFlexboxHelper.mIndexToFlexLine[anchorInfo.mPosition];
            this.mLayoutState.mFlexLinePosition = this.mAnchorInfo.mFlexLinePosition;
            return;
        }
        if (i17 == -1) {
            iMin = this.mAnchorInfo.mPosition;
        } else {
            iMin = Math.min(i17, this.mAnchorInfo.mPosition);
        }
        int i18 = iMin;
        this.mFlexLinesResult.reset();
        if (isMainAxisDirectionHorizontal()) {
            if (this.mFlexLines.size() > 0) {
                this.mFlexboxHelper.clearFlexLines(this.mFlexLines, i18);
                this.mFlexboxHelper.calculateFlexLines(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i16, i18, this.mAnchorInfo.mPosition, this.mFlexLines);
                i13 = i18;
            } else {
                i13 = i18;
                this.mFlexboxHelper.ensureIndexToFlexLine(i11);
                this.mFlexboxHelper.calculateHorizontalFlexLines(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i16, 0, this.mFlexLines);
            }
        } else {
            i13 = i18;
            if (this.mFlexLines.size() > 0) {
                this.mFlexboxHelper.clearFlexLines(this.mFlexLines, i13);
                i18 = i13;
                this.mFlexboxHelper.calculateFlexLines(this.mFlexLinesResult, iMakeMeasureSpec2, iMakeMeasureSpec, i16, i18, this.mAnchorInfo.mPosition, this.mFlexLines);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
                i13 = i18;
            } else {
                this.mFlexboxHelper.ensureIndexToFlexLine(i11);
                this.mFlexboxHelper.calculateVerticalFlexLines(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i16, 0, this.mFlexLines);
            }
        }
        this.mFlexLines = this.mFlexLinesResult.mFlexLines;
        this.mFlexboxHelper.determineMainSize(iMakeMeasureSpec, iMakeMeasureSpec2, i13);
        this.mFlexboxHelper.stretchViews(i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF computeScrollVectorForPosition(int i11) {
        int i12;
        if (getChildCount() == 0) {
            return null;
        }
        if (i11 < getPosition(getChildAt(0))) {
            i12 = -1;
        } else {
            i12 = 1;
        }
        if (isMainAxisDirectionHorizontal()) {
            return new PointF(0.0f, i12);
        }
        return new PointF(i12, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getChildHeightMeasureSpec(int i11, int i12, int i13) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), i12, i13, canScrollVertically());
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getChildWidthMeasureSpec(int i11, int i12, int i13) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), i12, i13, canScrollHorizontally());
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getDecorationLengthCrossAxis(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (isMainAxisDirectionHorizontal()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return leftDecorationWidth + rightDecorationWidth;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getDecorationLengthMainAxis(View view, int i11, int i12) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (isMainAxisDirectionHorizontal()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return topDecorationHeight + bottomDecorationHeight;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public View getReorderedFlexItemAt(int i11) {
        return getFlexItemAt(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.mParent = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(@NonNull RecyclerView recyclerView, int i11, int i12) {
        super.onItemsAdded(recyclerView, i11, i12);
        updateDirtyPosition(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(@NonNull RecyclerView recyclerView, int i11, int i12, int i13) {
        super.onItemsMoved(recyclerView, i11, i12, i13);
        updateDirtyPosition(Math.min(i11, i12));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i11, int i12) {
        super.onItemsRemoved(recyclerView, i11, i12);
        updateDirtyPosition(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i11, int i12) {
        super.onItemsUpdated(recyclerView, i11, i12);
        updateDirtyPosition(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mDirtyPosition = -1;
        this.mAnchorInfo.reset();
        this.mViewCache.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (isMainAxisDirectionHorizontal() && (this.mFlexWrap != 0 || !isMainAxisDirectionHorizontal())) {
            int iHandleScrollingSubOrientation = handleScrollingSubOrientation(i11);
            this.mAnchorInfo.mPerpendicularCoordinate += iHandleScrollingSubOrientation;
            this.mSubOrientationHelper.offsetChildren(-iHandleScrollingSubOrientation);
            return iHandleScrollingSubOrientation;
        }
        int iHandleScrollingMainOrientation = handleScrollingMainOrientation(i11, recycler, state);
        this.mViewCache.clear();
        return iHandleScrollingMainOrientation;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!isMainAxisDirectionHorizontal() && (this.mFlexWrap != 0 || isMainAxisDirectionHorizontal())) {
            int iHandleScrollingSubOrientation = handleScrollingSubOrientation(i11);
            this.mAnchorInfo.mPerpendicularCoordinate += iHandleScrollingSubOrientation;
            this.mSubOrientationHelper.offsetChildren(-iHandleScrollingSubOrientation);
            return iHandleScrollingSubOrientation;
        }
        int iHandleScrollingMainOrientation = handleScrollingMainOrientation(i11, recycler, state);
        this.mViewCache.clear();
        return iHandleScrollingMainOrientation;
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        this.mMaxLine = -1;
        this.mFlexLines = new ArrayList();
        this.mFlexboxHelper = new FlexboxHelper(this);
        this.mAnchorInfo = new AnchorInfo();
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mLastWidth = Integer.MIN_VALUE;
        this.mLastHeight = Integer.MIN_VALUE;
        this.mViewCache = new SparseArray<>();
        this.mDirtyPosition = -1;
        this.mFlexLinesResult = new FlexboxHelper.FlexLinesResult();
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i11, i12);
        int i13 = properties.orientation;
        if (i13 != 0) {
            if (i13 == 1) {
                if (properties.reverseLayout) {
                    setFlexDirection(3);
                } else {
                    setFlexDirection(2);
                }
            }
        } else if (properties.reverseLayout) {
            setFlexDirection(1);
        } else {
            setFlexDirection(0);
        }
        setFlexWrap(1);
        setAlignItems(4);
        setAutoMeasureEnabled(true);
        this.mContext = context;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void onNewFlexLineAdded(FlexLine flexLine) {
    }
}
