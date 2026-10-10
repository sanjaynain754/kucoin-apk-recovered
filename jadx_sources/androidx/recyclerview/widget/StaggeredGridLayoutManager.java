package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.ScrollVectorProvider {
    static final boolean DEBUG = false;

    @Deprecated
    public static final int GAP_HANDLING_LAZY = 1;
    public static final int GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS = 2;
    public static final int GAP_HANDLING_NONE = 0;
    public static final int HORIZONTAL = 0;
    static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "StaggeredGridLManager";
    public static final int VERTICAL = 1;
    private int mFullSizeSpec;
    private boolean mLastLayoutFromEnd;
    private boolean mLastLayoutRTL;

    @NonNull
    private final LayoutState mLayoutState;
    private int mOrientation;
    private SavedState mPendingSavedState;
    private int[] mPrefetchDistances;

    @NonNull
    OrientationHelper mPrimaryOrientation;
    private BitSet mRemainingSpans;

    @NonNull
    OrientationHelper mSecondaryOrientation;
    private int mSizePerSpan;
    Span[] mSpans;
    private int mSpanCount = -1;
    boolean mReverseLayout = false;
    boolean mShouldReverseLayout = false;
    int mPendingScrollPosition = -1;
    int mPendingScrollPositionOffset = Integer.MIN_VALUE;
    LazySpanLookup mLazySpanLookup = new LazySpanLookup();
    private int mGapStrategy = 2;
    private final Rect mTmpRect = new Rect();
    private final AnchorInfo mAnchorInfo = new AnchorInfo();
    private boolean mLaidOutInvalidFullSpan = false;
    private boolean mSmoothScrollbarEnabled = true;
    private final Runnable mCheckForGapsRunnable = new Runnable() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.1
        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.checkForGaps();
        }
    };

    public class AnchorInfo {
        boolean mInvalidateOffsets;
        boolean mLayoutFromEnd;
        int mOffset;
        int mPosition;
        int[] mSpanReferenceLines;
        boolean mValid;

        public void assignCoordinateFromPadding() {
            this.mOffset = this.mLayoutFromEnd ? StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding() : StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding();
        }

        public void reset() {
            this.mPosition = -1;
            this.mOffset = Integer.MIN_VALUE;
            this.mLayoutFromEnd = false;
            this.mInvalidateOffsets = false;
            this.mValid = false;
            int[] iArr = this.mSpanReferenceLines;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void saveSpanReferenceLines(Span[] spanArr) {
            int length = spanArr.length;
            int[] iArr = this.mSpanReferenceLines;
            if (iArr == null || iArr.length < length) {
                this.mSpanReferenceLines = new int[StaggeredGridLayoutManager.this.mSpans.length];
            }
            for (int i11 = 0; i11 < length; i11++) {
                this.mSpanReferenceLines[i11] = spanArr[i11].getStartLine(Integer.MIN_VALUE);
            }
        }

        public AnchorInfo() {
            reset();
        }

        public void assignCoordinateFromPadding(int i11) {
            if (this.mLayoutFromEnd) {
                this.mOffset = StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding() - i11;
            } else {
                this.mOffset = StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding() + i11;
            }
        }
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        boolean mFullSpan;
        Span mSpan;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
        }

        public final int getSpanIndex() {
            Span span = this.mSpan;
            if (span == null) {
                return -1;
            }
            return span.mIndex;
        }

        public boolean isFullSpan() {
            return this.mFullSpan;
        }

        public void setFullSpan(boolean z11) {
            this.mFullSpan = z11;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static class LazySpanLookup {
        private static final int MIN_SIZE = 10;
        int[] mData;
        List<FullSpanItem> mFullSpanItems;

        @SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new Parcelable.Creator<FullSpanItem>() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public FullSpanItem[] newArray(int i11) {
                    return new FullSpanItem[i11];
                }
            };
            int mGapDir;
            int[] mGapPerSpan;
            boolean mHasUnwantedGapAfter;
            int mPosition;

            public FullSpanItem(Parcel parcel) {
                this.mPosition = parcel.readInt();
                this.mGapDir = parcel.readInt();
                this.mHasUnwantedGapAfter = parcel.readInt() == 1;
                int i11 = parcel.readInt();
                if (i11 > 0) {
                    int[] iArr = new int[i11];
                    this.mGapPerSpan = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public int getGapForSpan(int i11) {
                int[] iArr = this.mGapPerSpan;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i11];
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.mPosition + ", mGapDir=" + this.mGapDir + ", mHasUnwantedGapAfter=" + this.mHasUnwantedGapAfter + ", mGapPerSpan=" + Arrays.toString(this.mGapPerSpan) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i11) {
                parcel.writeInt(this.mPosition);
                parcel.writeInt(this.mGapDir);
                parcel.writeInt(this.mHasUnwantedGapAfter ? 1 : 0);
                int[] iArr = this.mGapPerSpan;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.mGapPerSpan);
                }
            }

            public FullSpanItem() {
            }
        }

        private int invalidateFullSpansAfter(int i11) {
            if (this.mFullSpanItems == null) {
                return -1;
            }
            FullSpanItem fullSpanItem = getFullSpanItem(i11);
            if (fullSpanItem != null) {
                this.mFullSpanItems.remove(fullSpanItem);
            }
            int size = this.mFullSpanItems.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    i12 = -1;
                    break;
                }
                if (this.mFullSpanItems.get(i12).mPosition >= i11) {
                    break;
                }
                i12++;
            }
            if (i12 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem2 = this.mFullSpanItems.get(i12);
            this.mFullSpanItems.remove(i12);
            return fullSpanItem2.mPosition;
        }

        private void offsetFullSpansForAddition(int i11, int i12) {
            List<FullSpanItem> list = this.mFullSpanItems;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.mFullSpanItems.get(size);
                int i13 = fullSpanItem.mPosition;
                if (i13 >= i11) {
                    fullSpanItem.mPosition = i13 + i12;
                }
            }
        }

        private void offsetFullSpansForRemoval(int i11, int i12) {
            List<FullSpanItem> list = this.mFullSpanItems;
            if (list == null) {
                return;
            }
            int i13 = i11 + i12;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.mFullSpanItems.get(size);
                int i14 = fullSpanItem.mPosition;
                if (i14 >= i11) {
                    if (i14 < i13) {
                        this.mFullSpanItems.remove(size);
                    } else {
                        fullSpanItem.mPosition = i14 - i12;
                    }
                }
            }
        }

        public void addFullSpanItem(FullSpanItem fullSpanItem) {
            if (this.mFullSpanItems == null) {
                this.mFullSpanItems = new ArrayList();
            }
            int size = this.mFullSpanItems.size();
            for (int i11 = 0; i11 < size; i11++) {
                FullSpanItem fullSpanItem2 = this.mFullSpanItems.get(i11);
                if (fullSpanItem2.mPosition == fullSpanItem.mPosition) {
                    this.mFullSpanItems.remove(i11);
                }
                if (fullSpanItem2.mPosition >= fullSpanItem.mPosition) {
                    this.mFullSpanItems.add(i11, fullSpanItem);
                    return;
                }
            }
            this.mFullSpanItems.add(fullSpanItem);
        }

        public void clear() {
            int[] iArr = this.mData;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.mFullSpanItems = null;
        }

        public void ensureSize(int i11) {
            int[] iArr = this.mData;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i11, 10) + 1];
                this.mData = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i11 >= iArr.length) {
                int[] iArr3 = new int[sizeForPosition(i11)];
                this.mData = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.mData;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public int forceInvalidateAfter(int i11) {
            List<FullSpanItem> list = this.mFullSpanItems;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.mFullSpanItems.get(size).mPosition >= i11) {
                        this.mFullSpanItems.remove(size);
                    }
                }
            }
            return invalidateAfter(i11);
        }

        public FullSpanItem getFirstFullSpanItemInRange(int i11, int i12, int i13, boolean z11) {
            List<FullSpanItem> list = this.mFullSpanItems;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                FullSpanItem fullSpanItem = this.mFullSpanItems.get(i14);
                int i15 = fullSpanItem.mPosition;
                if (i15 >= i12) {
                    return null;
                }
                if (i15 >= i11 && (i13 == 0 || fullSpanItem.mGapDir == i13 || (z11 && fullSpanItem.mHasUnwantedGapAfter))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem getFullSpanItem(int i11) {
            List<FullSpanItem> list = this.mFullSpanItems;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.mFullSpanItems.get(size);
                if (fullSpanItem.mPosition == i11) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public int getSpan(int i11) {
            int[] iArr = this.mData;
            if (iArr == null || i11 >= iArr.length) {
                return -1;
            }
            return iArr[i11];
        }

        public int invalidateAfter(int i11) {
            int[] iArr = this.mData;
            if (iArr == null || i11 >= iArr.length) {
                return -1;
            }
            int iInvalidateFullSpansAfter = invalidateFullSpansAfter(i11);
            if (iInvalidateFullSpansAfter == -1) {
                int[] iArr2 = this.mData;
                Arrays.fill(iArr2, i11, iArr2.length, -1);
                return this.mData.length;
            }
            int iMin = Math.min(iInvalidateFullSpansAfter + 1, this.mData.length);
            Arrays.fill(this.mData, i11, iMin, -1);
            return iMin;
        }

        public void offsetForAddition(int i11, int i12) {
            int[] iArr = this.mData;
            if (iArr == null || i11 >= iArr.length) {
                return;
            }
            int i13 = i11 + i12;
            ensureSize(i13);
            int[] iArr2 = this.mData;
            System.arraycopy(iArr2, i11, iArr2, i13, (iArr2.length - i11) - i12);
            Arrays.fill(this.mData, i11, i13, -1);
            offsetFullSpansForAddition(i11, i12);
        }

        public void offsetForRemoval(int i11, int i12) {
            int[] iArr = this.mData;
            if (iArr == null || i11 >= iArr.length) {
                return;
            }
            int i13 = i11 + i12;
            ensureSize(i13);
            int[] iArr2 = this.mData;
            System.arraycopy(iArr2, i13, iArr2, i11, (iArr2.length - i11) - i12);
            int[] iArr3 = this.mData;
            Arrays.fill(iArr3, iArr3.length - i12, iArr3.length, -1);
            offsetFullSpansForRemoval(i11, i12);
        }

        public int sizeForPosition(int i11) {
            int length = this.mData.length;
            while (length <= i11) {
                length *= 2;
            }
            return length;
        }

        public void setSpan(int i11, Span span) {
            ensureSize(i11);
            this.mData[i11] = span.mIndex;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState.1
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
        int mAnchorPosition;
        List<LazySpanLookup.FullSpanItem> mFullSpanItems;
        boolean mLastLayoutRTL;
        boolean mReverseLayout;
        int[] mSpanLookup;
        int mSpanLookupSize;
        int[] mSpanOffsets;
        int mSpanOffsetsSize;
        int mVisibleAnchorPosition;

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void invalidateAnchorPositionInfo() {
            this.mSpanOffsets = null;
            this.mSpanOffsetsSize = 0;
            this.mAnchorPosition = -1;
            this.mVisibleAnchorPosition = -1;
        }

        public void invalidateSpanInfo() {
            this.mSpanOffsets = null;
            this.mSpanOffsetsSize = 0;
            this.mSpanLookupSize = 0;
            this.mSpanLookup = null;
            this.mFullSpanItems = null;
        }

        public SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mVisibleAnchorPosition = parcel.readInt();
            int i11 = parcel.readInt();
            this.mSpanOffsetsSize = i11;
            if (i11 > 0) {
                int[] iArr = new int[i11];
                this.mSpanOffsets = iArr;
                parcel.readIntArray(iArr);
            }
            int i12 = parcel.readInt();
            this.mSpanLookupSize = i12;
            if (i12 > 0) {
                int[] iArr2 = new int[i12];
                this.mSpanLookup = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.mReverseLayout = parcel.readInt() == 1;
            this.mAnchorLayoutFromEnd = parcel.readInt() == 1;
            this.mLastLayoutRTL = parcel.readInt() == 1;
            this.mFullSpanItems = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mVisibleAnchorPosition);
            parcel.writeInt(this.mSpanOffsetsSize);
            if (this.mSpanOffsetsSize > 0) {
                parcel.writeIntArray(this.mSpanOffsets);
            }
            parcel.writeInt(this.mSpanLookupSize);
            if (this.mSpanLookupSize > 0) {
                parcel.writeIntArray(this.mSpanLookup);
            }
            parcel.writeInt(this.mReverseLayout ? 1 : 0);
            parcel.writeInt(this.mAnchorLayoutFromEnd ? 1 : 0);
            parcel.writeInt(this.mLastLayoutRTL ? 1 : 0);
            parcel.writeList(this.mFullSpanItems);
        }

        public SavedState(SavedState savedState) {
            this.mSpanOffsetsSize = savedState.mSpanOffsetsSize;
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mVisibleAnchorPosition = savedState.mVisibleAnchorPosition;
            this.mSpanOffsets = savedState.mSpanOffsets;
            this.mSpanLookupSize = savedState.mSpanLookupSize;
            this.mSpanLookup = savedState.mSpanLookup;
            this.mReverseLayout = savedState.mReverseLayout;
            this.mAnchorLayoutFromEnd = savedState.mAnchorLayoutFromEnd;
            this.mLastLayoutRTL = savedState.mLastLayoutRTL;
            this.mFullSpanItems = savedState.mFullSpanItems;
        }
    }

    public class Span {
        static final int INVALID_LINE = Integer.MIN_VALUE;
        final int mIndex;
        ArrayList<View> mViews = new ArrayList<>();
        int mCachedStart = Integer.MIN_VALUE;
        int mCachedEnd = Integer.MIN_VALUE;
        int mDeletedSize = 0;

        public int findOnePartiallyVisibleChild(int i11, int i12, boolean z11) {
            return findOnePartiallyOrCompletelyVisibleChild(i11, i12, false, false, z11);
        }

        public int findOneVisibleChild(int i11, int i12, boolean z11) {
            return findOnePartiallyOrCompletelyVisibleChild(i11, i12, z11, true, false);
        }

        public int getEndLine(int i11) {
            int i12 = this.mCachedEnd;
            if (i12 != Integer.MIN_VALUE) {
                return i12;
            }
            if (this.mViews.size() == 0) {
                return i11;
            }
            calculateCachedEnd();
            return this.mCachedEnd;
        }

        public View getFocusableViewAfter(int i11, int i12) {
            View view = null;
            if (i12 != -1) {
                int size = this.mViews.size() - 1;
                while (size >= 0) {
                    View view2 = this.mViews.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.mReverseLayout && staggeredGridLayoutManager.getPosition(view2) >= i11) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.mReverseLayout && staggeredGridLayoutManager2.getPosition(view2) <= i11) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = this.mViews.size();
            int i13 = 0;
            while (i13 < size2) {
                View view3 = this.mViews.get(i13);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                if (staggeredGridLayoutManager3.mReverseLayout && staggeredGridLayoutManager3.getPosition(view3) <= i11) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                if ((!staggeredGridLayoutManager4.mReverseLayout && staggeredGridLayoutManager4.getPosition(view3) >= i11) || !view3.hasFocusable()) {
                    break;
                }
                i13++;
                view = view3;
            }
            return view;
        }

        public int getStartLine(int i11) {
            int i12 = this.mCachedStart;
            if (i12 != Integer.MIN_VALUE) {
                return i12;
            }
            if (this.mViews.size() == 0) {
                return i11;
            }
            calculateCachedStart();
            return this.mCachedStart;
        }

        public Span(int i11) {
            this.mIndex = i11;
        }

        public void cacheReferenceLineAndClear(boolean z11, int i11) {
            int endLine = z11 ? getEndLine(Integer.MIN_VALUE) : getStartLine(Integer.MIN_VALUE);
            clear();
            if (endLine == Integer.MIN_VALUE) {
                return;
            }
            if (!z11 || endLine >= StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding()) {
                if (z11 || endLine <= StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding()) {
                    if (i11 != Integer.MIN_VALUE) {
                        endLine += i11;
                    }
                    this.mCachedEnd = endLine;
                    this.mCachedStart = endLine;
                }
            }
        }

        public void calculateCachedEnd() {
            LazySpanLookup.FullSpanItem fullSpanItem;
            ArrayList<View> arrayList = this.mViews;
            View view = arrayList.get(arrayList.size() - 1);
            LayoutParams layoutParams = getLayoutParams(view);
            this.mCachedEnd = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedEnd(view);
            if (layoutParams.mFullSpan && (fullSpanItem = StaggeredGridLayoutManager.this.mLazySpanLookup.getFullSpanItem(layoutParams.getViewLayoutPosition())) != null && fullSpanItem.mGapDir == 1) {
                this.mCachedEnd += fullSpanItem.getGapForSpan(this.mIndex);
            }
        }

        public void calculateCachedStart() {
            LazySpanLookup.FullSpanItem fullSpanItem;
            View view = this.mViews.get(0);
            LayoutParams layoutParams = getLayoutParams(view);
            this.mCachedStart = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedStart(view);
            if (layoutParams.mFullSpan && (fullSpanItem = StaggeredGridLayoutManager.this.mLazySpanLookup.getFullSpanItem(layoutParams.getViewLayoutPosition())) != null && fullSpanItem.mGapDir == -1) {
                this.mCachedStart -= fullSpanItem.getGapForSpan(this.mIndex);
            }
        }

        public void clear() {
            this.mViews.clear();
            invalidateCache();
            this.mDeletedSize = 0;
        }

        public int findFirstCompletelyVisibleItemPosition() {
            return StaggeredGridLayoutManager.this.mReverseLayout ? findOneVisibleChild(this.mViews.size() - 1, -1, true) : findOneVisibleChild(0, this.mViews.size(), true);
        }

        public int findFirstPartiallyVisibleItemPosition() {
            return StaggeredGridLayoutManager.this.mReverseLayout ? findOnePartiallyVisibleChild(this.mViews.size() - 1, -1, true) : findOnePartiallyVisibleChild(0, this.mViews.size(), true);
        }

        public int findFirstVisibleItemPosition() {
            return StaggeredGridLayoutManager.this.mReverseLayout ? findOneVisibleChild(this.mViews.size() - 1, -1, false) : findOneVisibleChild(0, this.mViews.size(), false);
        }

        public int findLastCompletelyVisibleItemPosition() {
            return StaggeredGridLayoutManager.this.mReverseLayout ? findOneVisibleChild(0, this.mViews.size(), true) : findOneVisibleChild(this.mViews.size() - 1, -1, true);
        }

        public int findLastPartiallyVisibleItemPosition() {
            return StaggeredGridLayoutManager.this.mReverseLayout ? findOnePartiallyVisibleChild(0, this.mViews.size(), true) : findOnePartiallyVisibleChild(this.mViews.size() - 1, -1, true);
        }

        public int findLastVisibleItemPosition() {
            return StaggeredGridLayoutManager.this.mReverseLayout ? findOneVisibleChild(0, this.mViews.size(), false) : findOneVisibleChild(this.mViews.size() - 1, -1, false);
        }

        public int findOnePartiallyOrCompletelyVisibleChild(int i11, int i12, boolean z11, boolean z12, boolean z13) {
            int startAfterPadding = StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding();
            int endAfterPadding = StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding();
            int i13 = i12 > i11 ? 1 : -1;
            while (i11 != i12) {
                View view = this.mViews.get(i11);
                int decoratedStart = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedStart(view);
                int decoratedEnd = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedEnd(view);
                boolean z14 = false;
                boolean z15 = !z13 ? decoratedStart >= endAfterPadding : decoratedStart > endAfterPadding;
                if (!z13 ? decoratedEnd > startAfterPadding : decoratedEnd >= startAfterPadding) {
                    z14 = true;
                }
                if (z15 && z14) {
                    if (z11 && z12) {
                        if (decoratedStart >= startAfterPadding && decoratedEnd <= endAfterPadding) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else {
                        if (z12) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                        if (decoratedStart < startAfterPadding || decoratedEnd > endAfterPadding) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    }
                }
                i11 += i13;
            }
            return -1;
        }

        public int getDeletedSize() {
            return this.mDeletedSize;
        }

        public void invalidateCache() {
            this.mCachedStart = Integer.MIN_VALUE;
            this.mCachedEnd = Integer.MIN_VALUE;
        }

        public void onOffset(int i11) {
            int i12 = this.mCachedStart;
            if (i12 != Integer.MIN_VALUE) {
                this.mCachedStart = i12 + i11;
            }
            int i13 = this.mCachedEnd;
            if (i13 != Integer.MIN_VALUE) {
                this.mCachedEnd = i13 + i11;
            }
        }

        public void popEnd() {
            int size = this.mViews.size();
            View viewRemove = this.mViews.remove(size - 1);
            LayoutParams layoutParams = getLayoutParams(viewRemove);
            layoutParams.mSpan = null;
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.mDeletedSize -= StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(viewRemove);
            }
            if (size == 1) {
                this.mCachedStart = Integer.MIN_VALUE;
            }
            this.mCachedEnd = Integer.MIN_VALUE;
        }

        public void popStart() {
            View viewRemove = this.mViews.remove(0);
            LayoutParams layoutParams = getLayoutParams(viewRemove);
            layoutParams.mSpan = null;
            if (this.mViews.size() == 0) {
                this.mCachedEnd = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.mDeletedSize -= StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(viewRemove);
            }
            this.mCachedStart = Integer.MIN_VALUE;
        }

        public void setLine(int i11) {
            this.mCachedStart = i11;
            this.mCachedEnd = i11;
        }

        public void appendToSpan(View view) {
            LayoutParams layoutParams = getLayoutParams(view);
            layoutParams.mSpan = this;
            this.mViews.add(view);
            this.mCachedEnd = Integer.MIN_VALUE;
            if (this.mViews.size() == 1) {
                this.mCachedStart = Integer.MIN_VALUE;
            }
            if (!layoutParams.isItemRemoved() && !layoutParams.isItemChanged()) {
                return;
            }
            this.mDeletedSize += StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(view);
        }

        public LayoutParams getLayoutParams(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        public void prependToSpan(View view) {
            LayoutParams layoutParams = getLayoutParams(view);
            layoutParams.mSpan = this;
            this.mViews.add(0, view);
            this.mCachedStart = Integer.MIN_VALUE;
            if (this.mViews.size() == 1) {
                this.mCachedEnd = Integer.MIN_VALUE;
            }
            if (!layoutParams.isItemRemoved() && !layoutParams.isItemChanged()) {
                return;
            }
            this.mDeletedSize += StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(view);
        }

        public int getEndLine() {
            int i11 = this.mCachedEnd;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            calculateCachedEnd();
            return this.mCachedEnd;
        }

        public int getStartLine() {
            int i11 = this.mCachedStart;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            calculateCachedStart();
            return this.mCachedStart;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i11, i12);
        setOrientation(properties.orientation);
        setSpanCount(properties.spanCount);
        setReverseLayout(properties.reverseLayout);
        this.mLayoutState = new LayoutState();
        createOrientationHelpers();
    }

    private int convertFocusDirectionToLayoutDirection(int i11) {
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

    private void measureChildWithDecorationsAndMargin(View view, LayoutParams layoutParams, boolean z11) {
        if (layoutParams.mFullSpan) {
            if (this.mOrientation == 1) {
                measureChildWithDecorationsAndMargin(view, this.mFullSizeSpec, RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), z11);
                return;
            } else {
                measureChildWithDecorationsAndMargin(view, RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), this.mFullSizeSpec, z11);
                return;
            }
        }
        if (this.mOrientation == 1) {
            measureChildWithDecorationsAndMargin(view, RecyclerView.LayoutManager.getChildMeasureSpec(this.mSizePerSpan, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).width, false), RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), z11);
        } else {
            measureChildWithDecorationsAndMargin(view, RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), RecyclerView.LayoutManager.getChildMeasureSpec(this.mSizePerSpan, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).height, false), z11);
        }
    }

    private void updateAllRemainingSpans(int i11, int i12) {
        for (int i13 = 0; i13 < this.mSpanCount; i13++) {
            if (!this.mSpans[i13].mViews.isEmpty()) {
                updateRemainingSpans(this.mSpans[i13], i11, i12);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i11, int i12) {
        handleUpdate(i11, i12, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i11, int i12) {
        handleUpdate(i11, i12, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i11, int i12, Object obj) {
        handleUpdate(i11, i12, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        onLayoutChildren(recycler, state, true);
    }

    public void prepareLayoutStateForDelta(int i11, RecyclerView.State state) {
        int firstChildPosition;
        int i12;
        if (i11 > 0) {
            firstChildPosition = getLastChildPosition();
            i12 = 1;
        } else {
            firstChildPosition = getFirstChildPosition();
            i12 = -1;
        }
        this.mLayoutState.mRecycle = true;
        updateLayoutState(firstChildPosition, state);
        setLayoutStateDirection(i12);
        LayoutState layoutState = this.mLayoutState;
        layoutState.mCurrentPosition = firstChildPosition + layoutState.mItemDirection;
        layoutState.mAvailable = Math.abs(i11);
    }

    public void setGapStrategy(int i11) {
        assertNotInLayoutOrScroll(null);
        if (i11 == this.mGapStrategy) {
            return;
        }
        if (i11 != 0 && i11 != 2) {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
        this.mGapStrategy = i11;
        requestLayout();
    }

    public void setReverseLayout(boolean z11) {
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.mReverseLayout != z11) {
            savedState.mReverseLayout = z11;
        }
        this.mReverseLayout = z11;
        requestLayout();
    }

    public void setSpanCount(int i11) {
        assertNotInLayoutOrScroll(null);
        if (i11 != this.mSpanCount) {
            invalidateSpanAssignments();
            this.mSpanCount = i11;
            this.mRemainingSpans = new BitSet(this.mSpanCount);
            this.mSpans = new Span[this.mSpanCount];
            for (int i12 = 0; i12 < this.mSpanCount; i12++) {
                this.mSpans[i12] = new Span(i12);
            }
            requestLayout();
        }
    }

    private void appendViewToAllSpans(View view) {
        for (int i11 = this.mSpanCount - 1; i11 >= 0; i11--) {
            this.mSpans[i11].appendToSpan(view);
        }
    }

    private void applyPendingSavedState(AnchorInfo anchorInfo) {
        SavedState savedState = this.mPendingSavedState;
        int i11 = savedState.mSpanOffsetsSize;
        if (i11 > 0) {
            if (i11 == this.mSpanCount) {
                for (int i12 = 0; i12 < this.mSpanCount; i12++) {
                    this.mSpans[i12].clear();
                    SavedState savedState2 = this.mPendingSavedState;
                    int endAfterPadding = savedState2.mSpanOffsets[i12];
                    if (endAfterPadding != Integer.MIN_VALUE) {
                        endAfterPadding += savedState2.mAnchorLayoutFromEnd ? this.mPrimaryOrientation.getEndAfterPadding() : this.mPrimaryOrientation.getStartAfterPadding();
                    }
                    this.mSpans[i12].setLine(endAfterPadding);
                }
            } else {
                savedState.invalidateSpanInfo();
                SavedState savedState3 = this.mPendingSavedState;
                savedState3.mAnchorPosition = savedState3.mVisibleAnchorPosition;
            }
        }
        SavedState savedState4 = this.mPendingSavedState;
        this.mLastLayoutRTL = savedState4.mLastLayoutRTL;
        setReverseLayout(savedState4.mReverseLayout);
        resolveShouldLayoutReverse();
        SavedState savedState5 = this.mPendingSavedState;
        int i13 = savedState5.mAnchorPosition;
        if (i13 != -1) {
            this.mPendingScrollPosition = i13;
            anchorInfo.mLayoutFromEnd = savedState5.mAnchorLayoutFromEnd;
        } else {
            anchorInfo.mLayoutFromEnd = this.mShouldReverseLayout;
        }
        if (savedState5.mSpanLookupSize > 1) {
            LazySpanLookup lazySpanLookup = this.mLazySpanLookup;
            lazySpanLookup.mData = savedState5.mSpanLookup;
            lazySpanLookup.mFullSpanItems = savedState5.mFullSpanItems;
        }
    }

    private void attachViewToSpans(View view, LayoutParams layoutParams, LayoutState layoutState) {
        if (layoutState.mLayoutDirection == 1) {
            if (layoutParams.mFullSpan) {
                appendViewToAllSpans(view);
                return;
            } else {
                layoutParams.mSpan.appendToSpan(view);
                return;
            }
        }
        if (layoutParams.mFullSpan) {
            prependViewToAllSpans(view);
        } else {
            layoutParams.mSpan.prependToSpan(view);
        }
    }

    private boolean checkSpanForGap(Span span) {
        if (this.mShouldReverseLayout) {
            if (span.getEndLine() < this.mPrimaryOrientation.getEndAfterPadding()) {
                ArrayList<View> arrayList = span.mViews;
                return !span.getLayoutParams(arrayList.get(arrayList.size() - 1)).mFullSpan;
            }
        } else if (span.getStartLine() > this.mPrimaryOrientation.getStartAfterPadding()) {
            return !span.getLayoutParams(span.mViews.get(0)).mFullSpan;
        }
        return false;
    }

    private LazySpanLookup.FullSpanItem createFullSpanItemFromEnd(int i11) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.mGapPerSpan = new int[this.mSpanCount];
        for (int i12 = 0; i12 < this.mSpanCount; i12++) {
            fullSpanItem.mGapPerSpan[i12] = i11 - this.mSpans[i12].getEndLine(i11);
        }
        return fullSpanItem;
    }

    private LazySpanLookup.FullSpanItem createFullSpanItemFromStart(int i11) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.mGapPerSpan = new int[this.mSpanCount];
        for (int i12 = 0; i12 < this.mSpanCount; i12++) {
            fullSpanItem.mGapPerSpan[i12] = this.mSpans[i12].getStartLine(i11) - i11;
        }
        return fullSpanItem;
    }

    private void createOrientationHelpers() {
        this.mPrimaryOrientation = OrientationHelper.createOrientationHelper(this, this.mOrientation);
        this.mSecondaryOrientation = OrientationHelper.createOrientationHelper(this, 1 - this.mOrientation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView$LayoutManager, androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    private int fill(RecyclerView.Recycler recycler, LayoutState layoutState, RecyclerView.State state) {
        int i11;
        int maxEnd;
        Span nextSpan;
        int minStart;
        int decoratedMeasurement;
        int startAfterPadding;
        int decoratedMeasurement2;
        ?? r11;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        ?? r12 = 0;
        staggeredGridLayoutManager.mRemainingSpans.set(0, staggeredGridLayoutManager.mSpanCount, true);
        if (staggeredGridLayoutManager.mLayoutState.mInfinite) {
            i11 = layoutState.mLayoutDirection == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i11 = layoutState.mLayoutDirection == 1 ? layoutState.mEndLine + layoutState.mAvailable : layoutState.mStartLine - layoutState.mAvailable;
        }
        int i12 = i11;
        staggeredGridLayoutManager.updateAllRemainingSpans(layoutState.mLayoutDirection, i12);
        int endAfterPadding = staggeredGridLayoutManager.mShouldReverseLayout ? staggeredGridLayoutManager.mPrimaryOrientation.getEndAfterPadding() : staggeredGridLayoutManager.mPrimaryOrientation.getStartAfterPadding();
        boolean z11 = false;
        ?? r13 = staggeredGridLayoutManager;
        while (layoutState.hasMore(state) && (r13.mLayoutState.mInfinite || !r13.mRemainingSpans.isEmpty())) {
            View next = layoutState.next(recycler);
            LayoutParams layoutParams = (LayoutParams) next.getLayoutParams();
            int viewLayoutPosition = layoutParams.getViewLayoutPosition();
            int span = r13.mLazySpanLookup.getSpan(viewLayoutPosition);
            ?? r14 = span == -1 ? 1 : r12;
            if (r14 != 0) {
                nextSpan = layoutParams.mFullSpan ? r13.mSpans[r12] : r13.getNextSpan(layoutState);
                r13.mLazySpanLookup.setSpan(viewLayoutPosition, nextSpan);
            } else {
                nextSpan = r13.mSpans[span];
            }
            Span span2 = nextSpan;
            layoutParams.mSpan = span2;
            if (layoutState.mLayoutDirection == 1) {
                r13.addView(next);
            } else {
                r13.addView(next, r12);
            }
            r13.measureChildWithDecorationsAndMargin(next, layoutParams, r12);
            if (layoutState.mLayoutDirection == 1) {
                decoratedMeasurement = layoutParams.mFullSpan ? r13.getMaxEnd(endAfterPadding) : span2.getEndLine(endAfterPadding);
                minStart = r13.mPrimaryOrientation.getDecoratedMeasurement(next) + decoratedMeasurement;
                if (r14 != 0 && layoutParams.mFullSpan) {
                    LazySpanLookup.FullSpanItem fullSpanItemCreateFullSpanItemFromEnd = r13.createFullSpanItemFromEnd(decoratedMeasurement);
                    fullSpanItemCreateFullSpanItemFromEnd.mGapDir = -1;
                    fullSpanItemCreateFullSpanItemFromEnd.mPosition = viewLayoutPosition;
                    r13.mLazySpanLookup.addFullSpanItem(fullSpanItemCreateFullSpanItemFromEnd);
                }
            } else {
                minStart = layoutParams.mFullSpan ? r13.getMinStart(endAfterPadding) : span2.getStartLine(endAfterPadding);
                decoratedMeasurement = minStart - r13.mPrimaryOrientation.getDecoratedMeasurement(next);
                if (r14 != 0 && layoutParams.mFullSpan) {
                    LazySpanLookup.FullSpanItem fullSpanItemCreateFullSpanItemFromStart = r13.createFullSpanItemFromStart(minStart);
                    fullSpanItemCreateFullSpanItemFromStart.mGapDir = 1;
                    fullSpanItemCreateFullSpanItemFromStart.mPosition = viewLayoutPosition;
                    r13.mLazySpanLookup.addFullSpanItem(fullSpanItemCreateFullSpanItemFromStart);
                }
            }
            if (layoutParams.mFullSpan && layoutState.mItemDirection == -1) {
                if (r14 != 0) {
                    r13.mLaidOutInvalidFullSpan = true;
                } else {
                    if (!(layoutState.mLayoutDirection == 1 ? r13.areAllEndsEqual() : r13.areAllStartsEqual())) {
                        LazySpanLookup.FullSpanItem fullSpanItem = r13.mLazySpanLookup.getFullSpanItem(viewLayoutPosition);
                        if (fullSpanItem != null) {
                            fullSpanItem.mHasUnwantedGapAfter = true;
                        }
                        r13.mLaidOutInvalidFullSpan = true;
                    }
                }
            }
            r13.attachViewToSpans(next, layoutParams, layoutState);
            if (r13.isLayoutRTL() && r13.mOrientation == 1) {
                decoratedMeasurement2 = layoutParams.mFullSpan ? r13.mSecondaryOrientation.getEndAfterPadding() : r13.mSecondaryOrientation.getEndAfterPadding() - (((r13.mSpanCount - 1) - span2.mIndex) * r13.mSizePerSpan);
                startAfterPadding = decoratedMeasurement2 - r13.mSecondaryOrientation.getDecoratedMeasurement(next);
            } else {
                startAfterPadding = layoutParams.mFullSpan ? r13.mSecondaryOrientation.getStartAfterPadding() : (span2.mIndex * r13.mSizePerSpan) + r13.mSecondaryOrientation.getStartAfterPadding();
                decoratedMeasurement2 = r13.mSecondaryOrientation.getDecoratedMeasurement(next) + startAfterPadding;
            }
            int i13 = decoratedMeasurement2;
            int i14 = startAfterPadding;
            if (r13.mOrientation == 1) {
                r13.layoutDecoratedWithMargins(next, i14, decoratedMeasurement, i13, minStart);
                r11 = this;
            } else {
                r13.layoutDecoratedWithMargins(next, decoratedMeasurement, i14, minStart, i13);
                r11 = r13;
            }
            if (layoutParams.mFullSpan) {
                r11.updateAllRemainingSpans(r11.mLayoutState.mLayoutDirection, i12);
            } else {
                r11.updateRemainingSpans(span2, r11.mLayoutState.mLayoutDirection, i12);
            }
            r11.recycle(recycler, r11.mLayoutState);
            if (r11.mLayoutState.mStopInFocusable && next.hasFocusable()) {
                if (layoutParams.mFullSpan) {
                    r11.mRemainingSpans.clear();
                } else {
                    r11.mRemainingSpans.set(span2.mIndex, false);
                }
            }
            z11 = true;
            r12 = 0;
            r13 = r11;
        }
        if (!z11) {
            r13.recycle(recycler, r13.mLayoutState);
        }
        if (r13.mLayoutState.mLayoutDirection == -1) {
            maxEnd = r13.mPrimaryOrientation.getStartAfterPadding() - r13.getMinStart(r13.mPrimaryOrientation.getStartAfterPadding());
        } else {
            maxEnd = r13.getMaxEnd(r13.mPrimaryOrientation.getEndAfterPadding()) - r13.mPrimaryOrientation.getEndAfterPadding();
        }
        if (maxEnd > 0) {
            return Math.min(layoutState.mAvailable, maxEnd);
        }
        return 0;
    }

    private void fixEndGap(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z11) {
        int endAfterPadding;
        int maxEnd = getMaxEnd(Integer.MIN_VALUE);
        if (maxEnd != Integer.MIN_VALUE && (endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding() - maxEnd) > 0) {
            int i11 = endAfterPadding - (-scrollBy(-endAfterPadding, recycler, state));
            if (!z11 || i11 <= 0) {
                return;
            }
            this.mPrimaryOrientation.offsetChildren(i11);
        }
    }

    private int getMaxEnd(int i11) {
        int endLine = this.mSpans[0].getEndLine(i11);
        for (int i12 = 1; i12 < this.mSpanCount; i12++) {
            int endLine2 = this.mSpans[i12].getEndLine(i11);
            if (endLine2 > endLine) {
                endLine = endLine2;
            }
        }
        return endLine;
    }

    private int getMaxStart(int i11) {
        int startLine = this.mSpans[0].getStartLine(i11);
        for (int i12 = 1; i12 < this.mSpanCount; i12++) {
            int startLine2 = this.mSpans[i12].getStartLine(i11);
            if (startLine2 > startLine) {
                startLine = startLine2;
            }
        }
        return startLine;
    }

    private int getMinEnd(int i11) {
        int endLine = this.mSpans[0].getEndLine(i11);
        for (int i12 = 1; i12 < this.mSpanCount; i12++) {
            int endLine2 = this.mSpans[i12].getEndLine(i11);
            if (endLine2 < endLine) {
                endLine = endLine2;
            }
        }
        return endLine;
    }

    private int getMinStart(int i11) {
        int startLine = this.mSpans[0].getStartLine(i11);
        for (int i12 = 1; i12 < this.mSpanCount; i12++) {
            int startLine2 = this.mSpans[i12].getStartLine(i11);
            if (startLine2 < startLine) {
                startLine = startLine2;
            }
        }
        return startLine;
    }

    private Span getNextSpan(LayoutState layoutState) {
        int i11;
        int i12;
        int i13;
        if (preferLastSpan(layoutState.mLayoutDirection)) {
            i12 = this.mSpanCount - 1;
            i11 = -1;
            i13 = -1;
        } else {
            i11 = this.mSpanCount;
            i12 = 0;
            i13 = 1;
        }
        Span span = null;
        if (layoutState.mLayoutDirection == 1) {
            int startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
            int i14 = Integer.MAX_VALUE;
            while (i12 != i11) {
                Span span2 = this.mSpans[i12];
                int endLine = span2.getEndLine(startAfterPadding);
                if (endLine < i14) {
                    span = span2;
                    i14 = endLine;
                }
                i12 += i13;
            }
            return span;
        }
        int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        int i15 = Integer.MIN_VALUE;
        while (i12 != i11) {
            Span span3 = this.mSpans[i12];
            int startLine = span3.getStartLine(endAfterPadding);
            if (startLine > i15) {
                span = span3;
                i15 = startLine;
            }
            i12 += i13;
        }
        return span;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0029 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    private void handleUpdate(int i11, int i12, int i13) {
        int i14;
        int i15;
        int lastChildPosition;
        int lastChildPosition2 = this.mShouldReverseLayout ? getLastChildPosition() : getFirstChildPosition();
        if (i13 == 8) {
            if (i11 < i12) {
                i14 = i12 + 1;
            } else {
                i14 = i11 + 1;
                i15 = i12;
            }
            this.mLazySpanLookup.invalidateAfter(i15);
            if (i13 != 1) {
                this.mLazySpanLookup.offsetForAddition(i11, i12);
            } else if (i13 != 2) {
                this.mLazySpanLookup.offsetForRemoval(i11, i12);
            } else if (i13 == 8) {
                this.mLazySpanLookup.offsetForRemoval(i11, 1);
                this.mLazySpanLookup.offsetForAddition(i12, 1);
            }
            if (i14 <= lastChildPosition2) {
                return;
            }
            if (this.mShouldReverseLayout) {
                lastChildPosition = getFirstChildPosition();
            } else {
                lastChildPosition = getLastChildPosition();
            }
            if (i15 <= lastChildPosition) {
                requestLayout();
            }
        }
        i14 = i11 + i12;
        i15 = i11;
        this.mLazySpanLookup.invalidateAfter(i15);
        if (i13 != 1) {
            this.mLazySpanLookup.offsetForAddition(i11, i12);
        } else if (i13 != 2) {
            this.mLazySpanLookup.offsetForRemoval(i11, i12);
        } else if (i13 == 8) {
            this.mLazySpanLookup.offsetForRemoval(i11, 1);
            this.mLazySpanLookup.offsetForAddition(i12, 1);
        }
        if (i14 <= lastChildPosition2) {
            return;
        }
        if (this.mShouldReverseLayout) {
            lastChildPosition = getFirstChildPosition();
        } else {
            lastChildPosition = getLastChildPosition();
        }
        if (i15 <= lastChildPosition) {
            requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0155  */
    private void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z11) {
        boolean z12;
        SavedState savedState;
        AnchorInfo anchorInfo = this.mAnchorInfo;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            anchorInfo.reset();
            return;
        }
        boolean z13 = (anchorInfo.mValid && this.mPendingScrollPosition == -1 && this.mPendingSavedState == null) ? false : true;
        if (z13) {
            anchorInfo.reset();
            if (this.mPendingSavedState != null) {
                applyPendingSavedState(anchorInfo);
            } else {
                resolveShouldLayoutReverse();
                anchorInfo.mLayoutFromEnd = this.mShouldReverseLayout;
            }
            updateAnchorInfoForLayout(state, anchorInfo);
            anchorInfo.mValid = true;
        }
        if (this.mPendingSavedState == null && this.mPendingScrollPosition == -1 && (anchorInfo.mLayoutFromEnd != this.mLastLayoutFromEnd || isLayoutRTL() != this.mLastLayoutRTL)) {
            this.mLazySpanLookup.clear();
            anchorInfo.mInvalidateOffsets = true;
        }
        if (getChildCount() > 0 && ((savedState = this.mPendingSavedState) == null || savedState.mSpanOffsetsSize < 1)) {
            if (anchorInfo.mInvalidateOffsets) {
                for (int i11 = 0; i11 < this.mSpanCount; i11++) {
                    this.mSpans[i11].clear();
                    int i12 = anchorInfo.mOffset;
                    if (i12 != Integer.MIN_VALUE) {
                        this.mSpans[i11].setLine(i12);
                    }
                }
            } else if (z13 || this.mAnchorInfo.mSpanReferenceLines == null) {
                for (int i13 = 0; i13 < this.mSpanCount; i13++) {
                    this.mSpans[i13].cacheReferenceLineAndClear(this.mShouldReverseLayout, anchorInfo.mOffset);
                }
                this.mAnchorInfo.saveSpanReferenceLines(this.mSpans);
            } else {
                for (int i14 = 0; i14 < this.mSpanCount; i14++) {
                    Span span = this.mSpans[i14];
                    span.clear();
                    span.setLine(this.mAnchorInfo.mSpanReferenceLines[i14]);
                }
            }
        }
        detachAndScrapAttachedViews(recycler);
        this.mLayoutState.mRecycle = false;
        this.mLaidOutInvalidFullSpan = false;
        updateMeasureSpecs(this.mSecondaryOrientation.getTotalSpace());
        updateLayoutState(anchorInfo.mPosition, state);
        if (anchorInfo.mLayoutFromEnd) {
            setLayoutStateDirection(-1);
            fill(recycler, this.mLayoutState, state);
            setLayoutStateDirection(1);
            LayoutState layoutState = this.mLayoutState;
            layoutState.mCurrentPosition = anchorInfo.mPosition + layoutState.mItemDirection;
            fill(recycler, layoutState, state);
        } else {
            setLayoutStateDirection(1);
            fill(recycler, this.mLayoutState, state);
            setLayoutStateDirection(-1);
            LayoutState layoutState2 = this.mLayoutState;
            layoutState2.mCurrentPosition = anchorInfo.mPosition + layoutState2.mItemDirection;
            fill(recycler, layoutState2, state);
        }
        repositionToWrapContentIfNecessary();
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout) {
                fixEndGap(recycler, state, true);
                fixStartGap(recycler, state, false);
            } else {
                fixStartGap(recycler, state, true);
                fixEndGap(recycler, state, false);
            }
        }
        if (z11 && !state.isPreLayout() && this.mGapStrategy != 0 && getChildCount() > 0 && (this.mLaidOutInvalidFullSpan || hasGapsToFix() != null)) {
            removeCallbacks(this.mCheckForGapsRunnable);
            z12 = checkForGaps();
        }
        if (state.isPreLayout()) {
            this.mAnchorInfo.reset();
        }
        this.mLastLayoutFromEnd = anchorInfo.mLayoutFromEnd;
        this.mLastLayoutRTL = isLayoutRTL();
        if (z12) {
            this.mAnchorInfo.reset();
            onLayoutChildren(recycler, state, false);
        }
    }

    private boolean preferLastSpan(int i11) {
        if (this.mOrientation == 0) {
            return (i11 == -1) != this.mShouldReverseLayout;
        }
        return ((i11 == -1) == this.mShouldReverseLayout) == isLayoutRTL();
    }

    private void prependViewToAllSpans(View view) {
        for (int i11 = this.mSpanCount - 1; i11 >= 0; i11--) {
            this.mSpans[i11].prependToSpan(view);
        }
    }

    private void recycle(RecyclerView.Recycler recycler, LayoutState layoutState) {
        int iMin;
        if (!layoutState.mRecycle || layoutState.mInfinite) {
            return;
        }
        if (layoutState.mAvailable == 0) {
            if (layoutState.mLayoutDirection == -1) {
                recycleFromEnd(recycler, layoutState.mEndLine);
                return;
            } else {
                recycleFromStart(recycler, layoutState.mStartLine);
                return;
            }
        }
        if (layoutState.mLayoutDirection == -1) {
            int i11 = layoutState.mStartLine;
            int maxStart = i11 - getMaxStart(i11);
            recycleFromEnd(recycler, maxStart < 0 ? layoutState.mEndLine : layoutState.mEndLine - Math.min(maxStart, layoutState.mAvailable));
        } else {
            int minEnd = getMinEnd(layoutState.mEndLine) - layoutState.mEndLine;
            if (minEnd < 0) {
                iMin = layoutState.mStartLine;
            } else {
                iMin = Math.min(minEnd, layoutState.mAvailable) + layoutState.mStartLine;
            }
            recycleFromStart(recycler, iMin);
        }
    }

    private void repositionToWrapContentIfNecessary() {
        if (this.mSecondaryOrientation.getMode() == 1073741824) {
            return;
        }
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            float decoratedMeasurement = this.mSecondaryOrientation.getDecoratedMeasurement(childAt);
            if (decoratedMeasurement >= fMax) {
                if (((LayoutParams) childAt.getLayoutParams()).isFullSpan()) {
                    decoratedMeasurement = (decoratedMeasurement * 1.0f) / this.mSpanCount;
                }
                fMax = Math.max(fMax, decoratedMeasurement);
            }
        }
        int i12 = this.mSizePerSpan;
        int iRound = Math.round(fMax * this.mSpanCount);
        if (this.mSecondaryOrientation.getMode() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.mSecondaryOrientation.getTotalSpace());
        }
        updateMeasureSpecs(iRound);
        if (this.mSizePerSpan == i12) {
            return;
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
            if (!layoutParams.mFullSpan) {
                if (isLayoutRTL() && this.mOrientation == 1) {
                    int i14 = this.mSpanCount;
                    int i15 = layoutParams.mSpan.mIndex;
                    childAt2.offsetLeftAndRight(((-((i14 - 1) - i15)) * this.mSizePerSpan) - ((-((i14 - 1) - i15)) * i12));
                } else {
                    int i16 = layoutParams.mSpan.mIndex;
                    int i17 = this.mSizePerSpan * i16;
                    int i18 = i16 * i12;
                    if (this.mOrientation == 1) {
                        childAt2.offsetLeftAndRight(i17 - i18);
                    } else {
                        childAt2.offsetTopAndBottom(i17 - i18);
                    }
                }
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

    private void setLayoutStateDirection(int i11) {
        LayoutState layoutState = this.mLayoutState;
        layoutState.mLayoutDirection = i11;
        layoutState.mItemDirection = this.mShouldReverseLayout != (i11 == -1) ? -1 : 1;
    }

    private boolean updateAnchorFromChildren(RecyclerView.State state, AnchorInfo anchorInfo) {
        anchorInfo.mPosition = this.mLastLayoutFromEnd ? findLastReferenceChildPosition(state.getItemCount()) : findFirstReferenceChildPosition(state.getItemCount());
        anchorInfo.mOffset = Integer.MIN_VALUE;
        return true;
    }

    private void updateLayoutState(int i11, RecyclerView.State state) {
        int totalSpace;
        int totalSpace2;
        int targetScrollPosition;
        LayoutState layoutState = this.mLayoutState;
        boolean z11 = false;
        layoutState.mAvailable = 0;
        layoutState.mCurrentPosition = i11;
        if (!isSmoothScrolling() || (targetScrollPosition = state.getTargetScrollPosition()) == -1) {
            totalSpace = 0;
            totalSpace2 = 0;
        } else {
            if (this.mShouldReverseLayout == (targetScrollPosition < i11)) {
                totalSpace = this.mPrimaryOrientation.getTotalSpace();
                totalSpace2 = 0;
            } else {
                totalSpace2 = this.mPrimaryOrientation.getTotalSpace();
                totalSpace = 0;
            }
        }
        if (getClipToPadding()) {
            this.mLayoutState.mStartLine = this.mPrimaryOrientation.getStartAfterPadding() - totalSpace2;
            this.mLayoutState.mEndLine = this.mPrimaryOrientation.getEndAfterPadding() + totalSpace;
        } else {
            this.mLayoutState.mEndLine = this.mPrimaryOrientation.getEnd() + totalSpace;
            this.mLayoutState.mStartLine = -totalSpace2;
        }
        LayoutState layoutState2 = this.mLayoutState;
        layoutState2.mStopInFocusable = false;
        layoutState2.mRecycle = true;
        if (this.mPrimaryOrientation.getMode() == 0 && this.mPrimaryOrientation.getEnd() == 0) {
            z11 = true;
        }
        layoutState2.mInfinite = z11;
    }

    private int updateSpecWithExtra(int i11, int i12, int i13) {
        int mode;
        return (!(i12 == 0 && i13 == 0) && ((mode = View.MeasureSpec.getMode(i11)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - i12) - i13), mode) : i11;
    }

    public boolean areAllEndsEqual() {
        int endLine = this.mSpans[0].getEndLine(Integer.MIN_VALUE);
        for (int i11 = 1; i11 < this.mSpanCount; i11++) {
            if (this.mSpans[i11].getEndLine(Integer.MIN_VALUE) != endLine) {
                return false;
            }
        }
        return true;
    }

    public boolean areAllStartsEqual() {
        int startLine = this.mSpans[0].getStartLine(Integer.MIN_VALUE);
        for (int i11 = 1; i11 < this.mSpanCount; i11++) {
            if (this.mSpans[i11].getStartLine(Integer.MIN_VALUE) != startLine) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
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
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void collectAdjacentPrefetchPositions(int i11, int i12, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int endLine;
        int startLine;
        if (this.mOrientation != 0) {
            i11 = i12;
        }
        if (getChildCount() == 0 || i11 == 0) {
            return;
        }
        prepareLayoutStateForDelta(i11, state);
        int[] iArr = this.mPrefetchDistances;
        if (iArr == null || iArr.length < this.mSpanCount) {
            this.mPrefetchDistances = new int[this.mSpanCount];
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.mSpanCount; i14++) {
            LayoutState layoutState = this.mLayoutState;
            if (layoutState.mItemDirection == -1) {
                endLine = layoutState.mStartLine;
                startLine = this.mSpans[i14].getStartLine(endLine);
            } else {
                endLine = this.mSpans[i14].getEndLine(layoutState.mEndLine);
                startLine = this.mLayoutState.mEndLine;
            }
            int i15 = endLine - startLine;
            if (i15 >= 0) {
                this.mPrefetchDistances[i13] = i15;
                i13++;
            }
        }
        Arrays.sort(this.mPrefetchDistances, 0, i13);
        for (int i16 = 0; i16 < i13 && this.mLayoutState.hasMore(state); i16++) {
            layoutPrefetchRegistry.addPosition(this.mLayoutState.mCurrentPosition, this.mPrefetchDistances[i16]);
            LayoutState layoutState2 = this.mLayoutState;
            layoutState2.mCurrentPosition += layoutState2.mItemDirection;
        }
    }

    public int[] findFirstCompletelyVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i11 = 0; i11 < this.mSpanCount; i11++) {
            iArr[i11] = this.mSpans[i11].findFirstCompletelyVisibleItemPosition();
        }
        return iArr;
    }

    public View findFirstVisibleItemClosestToEnd(boolean z11) {
        int startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
        int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int decoratedStart = this.mPrimaryOrientation.getDecoratedStart(childAt);
            int decoratedEnd = this.mPrimaryOrientation.getDecoratedEnd(childAt);
            if (decoratedEnd > startAfterPadding && decoratedStart < endAfterPadding) {
                if (decoratedEnd <= endAfterPadding || !z11) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public View findFirstVisibleItemClosestToStart(boolean z11) {
        int startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
        int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        int childCount = getChildCount();
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            int decoratedStart = this.mPrimaryOrientation.getDecoratedStart(childAt);
            if (this.mPrimaryOrientation.getDecoratedEnd(childAt) > startAfterPadding && decoratedStart < endAfterPadding) {
                if (decoratedStart >= startAfterPadding || !z11) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public int findFirstVisibleItemPositionInt() {
        View viewFindFirstVisibleItemClosestToEnd = this.mShouldReverseLayout ? findFirstVisibleItemClosestToEnd(true) : findFirstVisibleItemClosestToStart(true);
        if (viewFindFirstVisibleItemClosestToEnd == null) {
            return -1;
        }
        return getPosition(viewFindFirstVisibleItemClosestToEnd);
    }

    public int[] findFirstVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i11 = 0; i11 < this.mSpanCount; i11++) {
            iArr[i11] = this.mSpans[i11].findFirstVisibleItemPosition();
        }
        return iArr;
    }

    public int[] findLastCompletelyVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i11 = 0; i11 < this.mSpanCount; i11++) {
            iArr[i11] = this.mSpans[i11].findLastCompletelyVisibleItemPosition();
        }
        return iArr;
    }

    public int[] findLastVisibleItemPositions(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i11 = 0; i11 < this.mSpanCount; i11++) {
            iArr[i11] = this.mSpans[i11].findLastVisibleItemPosition();
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getGapStrategy() {
        return this.mGapStrategy;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    public void invalidateSpanAssignments() {
        this.mLazySpanLookup.clear();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return this.mGapStrategy != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(@Nullable RecyclerView.Adapter adapter, @Nullable RecyclerView.Adapter adapter2) {
        this.mLazySpanLookup.clear();
        for (int i11 = 0; i11 < this.mSpanCount; i11++) {
            this.mSpans[i11].clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        this.mLazySpanLookup.clear();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i11, int i12, int i13) {
        handleUpdate(i11, i12, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.invalidateAnchorPositionInfo();
                this.mPendingSavedState.invalidateSpanInfo();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        int startLine;
        int startAfterPadding;
        int[] iArr;
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        savedState.mReverseLayout = this.mReverseLayout;
        savedState.mAnchorLayoutFromEnd = this.mLastLayoutFromEnd;
        savedState.mLastLayoutRTL = this.mLastLayoutRTL;
        LazySpanLookup lazySpanLookup = this.mLazySpanLookup;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.mData) == null) {
            savedState.mSpanLookupSize = 0;
        } else {
            savedState.mSpanLookup = iArr;
            savedState.mSpanLookupSize = iArr.length;
            savedState.mFullSpanItems = lazySpanLookup.mFullSpanItems;
        }
        if (getChildCount() <= 0) {
            savedState.mAnchorPosition = -1;
            savedState.mVisibleAnchorPosition = -1;
            savedState.mSpanOffsetsSize = 0;
            return savedState;
        }
        savedState.mAnchorPosition = this.mLastLayoutFromEnd ? getLastChildPosition() : getFirstChildPosition();
        savedState.mVisibleAnchorPosition = findFirstVisibleItemPositionInt();
        int i11 = this.mSpanCount;
        savedState.mSpanOffsetsSize = i11;
        savedState.mSpanOffsets = new int[i11];
        for (int i12 = 0; i12 < this.mSpanCount; i12++) {
            if (this.mLastLayoutFromEnd) {
                startLine = this.mSpans[i12].getEndLine(Integer.MIN_VALUE);
                if (startLine != Integer.MIN_VALUE) {
                    startAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
                    startLine -= startAfterPadding;
                }
            } else {
                startLine = this.mSpans[i12].getStartLine(Integer.MIN_VALUE);
                if (startLine != Integer.MIN_VALUE) {
                    startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
                    startLine -= startAfterPadding;
                }
            }
            savedState.mSpanOffsets[i12] = startLine;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i11) {
        if (i11 == 0) {
            checkForGaps();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i11) {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.mAnchorPosition != i11) {
            savedState.invalidateAnchorPositionInfo();
        }
        this.mPendingScrollPosition = i11;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i11, int i12) {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.invalidateAnchorPositionInfo();
        }
        this.mPendingScrollPosition = i11;
        this.mPendingScrollPositionOffset = i12;
        requestLayout();
    }

    public void setOrientation(int i11) {
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i11 == this.mOrientation) {
            return;
        }
        this.mOrientation = i11;
        OrientationHelper orientationHelper = this.mPrimaryOrientation;
        this.mPrimaryOrientation = this.mSecondaryOrientation;
        this.mSecondaryOrientation = orientationHelper;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i11) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i11);
        startSmoothScroll(linearSmoothScroller);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null;
    }

    public void updateMeasureSpecs(int i11) {
        this.mSizePerSpan = i11 / this.mSpanCount;
        this.mFullSizeSpec = View.MeasureSpec.makeMeasureSpec(i11, this.mSecondaryOrientation.getMode());
    }

    private int calculateScrollDirectionForPosition(int i11) {
        boolean z11;
        if (getChildCount() == 0) {
            if (!this.mShouldReverseLayout) {
                return -1;
            }
            return 1;
        }
        if (i11 < getFirstChildPosition()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != this.mShouldReverseLayout) {
            return -1;
        }
        return 1;
    }

    private int computeScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return ScrollbarHelper.computeScrollExtent(state, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return ScrollbarHelper.computeScrollOffset(state, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return ScrollbarHelper.computeScrollRange(state, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled);
    }

    private int findFirstReferenceChildPosition(int i11) {
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            int position = getPosition(getChildAt(i12));
            if (position >= 0 && position < i11) {
                return position;
            }
        }
        return 0;
    }

    private int findLastReferenceChildPosition(int i11) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i11) {
                return position;
            }
        }
        return 0;
    }

    private void fixStartGap(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z11) {
        int startAfterPadding;
        int minStart = getMinStart(Integer.MAX_VALUE);
        if (minStart != Integer.MAX_VALUE && (startAfterPadding = minStart - this.mPrimaryOrientation.getStartAfterPadding()) > 0) {
            int iScrollBy = startAfterPadding - scrollBy(startAfterPadding, recycler, state);
            if (z11 && iScrollBy > 0) {
                this.mPrimaryOrientation.offsetChildren(-iScrollBy);
            }
        }
    }

    private void recycleFromEnd(RecyclerView.Recycler recycler, int i11) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.mPrimaryOrientation.getDecoratedStart(childAt) >= i11 && this.mPrimaryOrientation.getTransformedStartWithDecoration(childAt) >= i11) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.mFullSpan) {
                    for (int i12 = 0; i12 < this.mSpanCount; i12++) {
                        if (this.mSpans[i12].mViews.size() == 1) {
                            return;
                        }
                    }
                    for (int i13 = 0; i13 < this.mSpanCount; i13++) {
                        this.mSpans[i13].popEnd();
                    }
                } else if (layoutParams.mSpan.mViews.size() != 1) {
                    layoutParams.mSpan.popEnd();
                } else {
                    return;
                }
                removeAndRecycleView(childAt, recycler);
            } else {
                return;
            }
        }
    }

    private void recycleFromStart(RecyclerView.Recycler recycler, int i11) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.mPrimaryOrientation.getDecoratedEnd(childAt) <= i11 && this.mPrimaryOrientation.getTransformedEndWithDecoration(childAt) <= i11) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.mFullSpan) {
                    for (int i12 = 0; i12 < this.mSpanCount; i12++) {
                        if (this.mSpans[i12].mViews.size() == 1) {
                            return;
                        }
                    }
                    for (int i13 = 0; i13 < this.mSpanCount; i13++) {
                        this.mSpans[i13].popStart();
                    }
                } else if (layoutParams.mSpan.mViews.size() != 1) {
                    layoutParams.mSpan.popStart();
                } else {
                    return;
                }
                removeAndRecycleView(childAt, recycler);
            } else {
                return;
            }
        }
    }

    private void updateRemainingSpans(Span span, int i11, int i12) {
        int deletedSize = span.getDeletedSize();
        if (i11 == -1) {
            if (span.getStartLine() + deletedSize <= i12) {
                this.mRemainingSpans.set(span.mIndex, false);
            }
        } else if (span.getEndLine() - deletedSize >= i12) {
            this.mRemainingSpans.set(span.mIndex, false);
        }
    }

    public boolean checkForGaps() {
        int firstChildPosition;
        int lastChildPosition;
        int i11;
        if (getChildCount() == 0 || this.mGapStrategy == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.mShouldReverseLayout) {
            firstChildPosition = getLastChildPosition();
            lastChildPosition = getFirstChildPosition();
        } else {
            firstChildPosition = getFirstChildPosition();
            lastChildPosition = getLastChildPosition();
        }
        if (firstChildPosition == 0 && hasGapsToFix() != null) {
            this.mLazySpanLookup.clear();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
        if (!this.mLaidOutInvalidFullSpan) {
            return false;
        }
        if (this.mShouldReverseLayout) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        int i12 = lastChildPosition + 1;
        LazySpanLookup.FullSpanItem firstFullSpanItemInRange = this.mLazySpanLookup.getFirstFullSpanItemInRange(firstChildPosition, i12, i11, true);
        if (firstFullSpanItemInRange == null) {
            this.mLaidOutInvalidFullSpan = false;
            this.mLazySpanLookup.forceInvalidateAfter(i12);
            return false;
        }
        LazySpanLookup.FullSpanItem firstFullSpanItemInRange2 = this.mLazySpanLookup.getFirstFullSpanItemInRange(firstChildPosition, firstFullSpanItemInRange.mPosition, i11 * (-1), true);
        if (firstFullSpanItemInRange2 == null) {
            this.mLazySpanLookup.forceInvalidateAfter(firstFullSpanItemInRange.mPosition);
        } else {
            this.mLazySpanLookup.forceInvalidateAfter(firstFullSpanItemInRange2.mPosition + 1);
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
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
        int iCalculateScrollDirectionForPosition = calculateScrollDirectionForPosition(i11);
        PointF pointF = new PointF();
        if (iCalculateScrollDirectionForPosition == 0) {
            return null;
        }
        if (this.mOrientation == 0) {
            pointF.x = iCalculateScrollDirectionForPosition;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = iCalculateScrollDirectionForPosition;
        return pointF;
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

    public int getFirstChildPosition() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public int getLastChildPosition() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:36:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:42:0x009c  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[SYNTHETIC] */
    public View hasGapsToFix() {
        byte b11;
        int i11;
        View childAt;
        int decoratedStart;
        int decoratedStart2;
        boolean z11;
        boolean z12;
        int decoratedEnd;
        int decoratedEnd2;
        int childCount = getChildCount();
        int i12 = childCount - 1;
        BitSet bitSet = new BitSet(this.mSpanCount);
        bitSet.set(0, this.mSpanCount, true);
        int i13 = -1;
        if (this.mOrientation == 1 && isLayoutRTL()) {
            b11 = 1;
        } else {
            b11 = -1;
        }
        if (this.mShouldReverseLayout) {
            childCount = -1;
        } else {
            i12 = 0;
        }
        if (i12 < childCount) {
            i13 = 1;
        }
        while (i12 != childCount) {
            View childAt2 = getChildAt(i12);
            LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
            if (bitSet.get(layoutParams.mSpan.mIndex)) {
                if (!checkSpanForGap(layoutParams.mSpan)) {
                    bitSet.clear(layoutParams.mSpan.mIndex);
                    if (!layoutParams.mFullSpan) {
                        childAt = getChildAt(i11);
                        if (this.mShouldReverseLayout) {
                            decoratedEnd = this.mPrimaryOrientation.getDecoratedEnd(childAt2);
                            decoratedEnd2 = this.mPrimaryOrientation.getDecoratedEnd(childAt);
                            if (decoratedEnd >= decoratedEnd2) {
                                if (decoratedEnd == decoratedEnd2) {
                                    if (layoutParams.mSpan.mIndex - ((LayoutParams) childAt.getLayoutParams()).mSpan.mIndex < 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (b11 < 0) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z11 != z12) {
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            decoratedStart = this.mPrimaryOrientation.getDecoratedStart(childAt2);
                            decoratedStart2 = this.mPrimaryOrientation.getDecoratedStart(childAt);
                            if (decoratedStart <= decoratedStart2) {
                                if (decoratedStart == decoratedStart2) {
                                    if (layoutParams.mSpan.mIndex - ((LayoutParams) childAt.getLayoutParams()).mSpan.mIndex < 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (b11 < 0) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z11 != z12) {
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                    i12 += i13;
                }
            } else {
                if (!layoutParams.mFullSpan && (i11 = i12 + i13) != childCount) {
                    childAt = getChildAt(i11);
                    if (this.mShouldReverseLayout) {
                        decoratedEnd = this.mPrimaryOrientation.getDecoratedEnd(childAt2);
                        decoratedEnd2 = this.mPrimaryOrientation.getDecoratedEnd(childAt);
                        if (decoratedEnd >= decoratedEnd2) {
                            if (decoratedEnd == decoratedEnd2) {
                                if (layoutParams.mSpan.mIndex - ((LayoutParams) childAt.getLayoutParams()).mSpan.mIndex < 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (b11 < 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z11 != z12) {
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        decoratedStart = this.mPrimaryOrientation.getDecoratedStart(childAt2);
                        decoratedStart2 = this.mPrimaryOrientation.getDecoratedStart(childAt);
                        if (decoratedStart <= decoratedStart2) {
                            if (decoratedStart == decoratedStart2) {
                                if (layoutParams.mSpan.mIndex - ((LayoutParams) childAt.getLayoutParams()).mSpan.mIndex < 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (b11 < 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z11 != z12) {
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i12 += i13;
            }
            return childAt2;
        }
        return null;
    }

    public boolean isLayoutRTL() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenHorizontal(int i11) {
        super.offsetChildrenHorizontal(i11);
        for (int i12 = 0; i12 < this.mSpanCount; i12++) {
            this.mSpans[i12].onOffset(i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenVertical(int i11) {
        super.offsetChildrenVertical(i11);
        for (int i12 = 0; i12 < this.mSpanCount; i12++) {
            this.mSpans[i12].onOffset(i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        removeCallbacks(this.mCheckForGapsRunnable);
        for (int i11 = 0; i11 < this.mSpanCount; i11++) {
            this.mSpans[i11].clear();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @Nullable
    public View onFocusSearchFailed(View view, int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
        View viewFindContainingItemView;
        int firstChildPosition;
        boolean z11;
        boolean z12;
        int iFindLastPartiallyVisibleItemPosition;
        int iFindLastPartiallyVisibleItemPosition2;
        int iFindLastPartiallyVisibleItemPosition3;
        View focusableViewAfter;
        if (getChildCount() == 0 || (viewFindContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        resolveShouldLayoutReverse();
        int iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i11);
        if (iConvertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) viewFindContainingItemView.getLayoutParams();
        boolean z13 = layoutParams.mFullSpan;
        Span span = layoutParams.mSpan;
        if (iConvertFocusDirectionToLayoutDirection == 1) {
            firstChildPosition = getLastChildPosition();
        } else {
            firstChildPosition = getFirstChildPosition();
        }
        updateLayoutState(firstChildPosition, state);
        setLayoutStateDirection(iConvertFocusDirectionToLayoutDirection);
        LayoutState layoutState = this.mLayoutState;
        layoutState.mCurrentPosition = layoutState.mItemDirection + firstChildPosition;
        layoutState.mAvailable = (int) (this.mPrimaryOrientation.getTotalSpace() * MAX_SCROLL_FACTOR);
        LayoutState layoutState2 = this.mLayoutState;
        layoutState2.mStopInFocusable = true;
        layoutState2.mRecycle = false;
        fill(recycler, layoutState2, state);
        this.mLastLayoutFromEnd = this.mShouldReverseLayout;
        if (!z13 && (focusableViewAfter = span.getFocusableViewAfter(firstChildPosition, iConvertFocusDirectionToLayoutDirection)) != null && focusableViewAfter != viewFindContainingItemView) {
            return focusableViewAfter;
        }
        if (preferLastSpan(iConvertFocusDirectionToLayoutDirection)) {
            for (int i12 = this.mSpanCount - 1; i12 >= 0; i12--) {
                View focusableViewAfter2 = this.mSpans[i12].getFocusableViewAfter(firstChildPosition, iConvertFocusDirectionToLayoutDirection);
                if (focusableViewAfter2 != null && focusableViewAfter2 != viewFindContainingItemView) {
                    return focusableViewAfter2;
                }
            }
        } else {
            for (int i13 = 0; i13 < this.mSpanCount; i13++) {
                View focusableViewAfter3 = this.mSpans[i13].getFocusableViewAfter(firstChildPosition, iConvertFocusDirectionToLayoutDirection);
                if (focusableViewAfter3 != null && focusableViewAfter3 != viewFindContainingItemView) {
                    return focusableViewAfter3;
                }
            }
        }
        boolean z14 = !this.mReverseLayout;
        if (iConvertFocusDirectionToLayoutDirection == -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z14 == z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z13) {
            if (z12) {
                iFindLastPartiallyVisibleItemPosition3 = span.findFirstPartiallyVisibleItemPosition();
            } else {
                iFindLastPartiallyVisibleItemPosition3 = span.findLastPartiallyVisibleItemPosition();
            }
            View viewFindViewByPosition = findViewByPosition(iFindLastPartiallyVisibleItemPosition3);
            if (viewFindViewByPosition != null && viewFindViewByPosition != viewFindContainingItemView) {
                return viewFindViewByPosition;
            }
        }
        if (preferLastSpan(iConvertFocusDirectionToLayoutDirection)) {
            for (int i14 = this.mSpanCount - 1; i14 >= 0; i14--) {
                if (i14 != span.mIndex) {
                    if (z12) {
                        iFindLastPartiallyVisibleItemPosition2 = this.mSpans[i14].findFirstPartiallyVisibleItemPosition();
                    } else {
                        iFindLastPartiallyVisibleItemPosition2 = this.mSpans[i14].findLastPartiallyVisibleItemPosition();
                    }
                    View viewFindViewByPosition2 = findViewByPosition(iFindLastPartiallyVisibleItemPosition2);
                    if (viewFindViewByPosition2 != null && viewFindViewByPosition2 != viewFindContainingItemView) {
                        return viewFindViewByPosition2;
                    }
                }
            }
        } else {
            for (int i15 = 0; i15 < this.mSpanCount; i15++) {
                if (z12) {
                    iFindLastPartiallyVisibleItemPosition = this.mSpans[i15].findFirstPartiallyVisibleItemPosition();
                } else {
                    iFindLastPartiallyVisibleItemPosition = this.mSpans[i15].findLastPartiallyVisibleItemPosition();
                }
                View viewFindViewByPosition3 = findViewByPosition(iFindLastPartiallyVisibleItemPosition);
                if (viewFindViewByPosition3 != null && viewFindViewByPosition3 != viewFindContainingItemView) {
                    return viewFindViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewFindFirstVisibleItemClosestToStart = findFirstVisibleItemClosestToStart(false);
            View viewFindFirstVisibleItemClosestToEnd = findFirstVisibleItemClosestToEnd(false);
            if (viewFindFirstVisibleItemClosestToStart != null && viewFindFirstVisibleItemClosestToEnd != null) {
                int position = getPosition(viewFindFirstVisibleItemClosestToStart);
                int position2 = getPosition(viewFindFirstVisibleItemClosestToEnd);
                if (position < position2) {
                    accessibilityEvent.setFromIndex(position);
                    accessibilityEvent.setToIndex(position2);
                } else {
                    accessibilityEvent.setFromIndex(position2);
                    accessibilityEvent.setToIndex(position);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo.reset();
    }

    public int scrollBy(int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i11 == 0) {
            return 0;
        }
        prepareLayoutStateForDelta(i11, state);
        int iFill = fill(recycler, this.mLayoutState, state);
        if (this.mLayoutState.mAvailable >= iFill) {
            if (i11 < 0) {
                i11 = -iFill;
            } else {
                i11 = iFill;
            }
        }
        this.mPrimaryOrientation.offsetChildren(-i11);
        this.mLastLayoutFromEnd = this.mShouldReverseLayout;
        LayoutState layoutState = this.mLayoutState;
        layoutState.mAvailable = 0;
        recycle(recycler, layoutState);
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return scrollBy(i11, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return scrollBy(i11, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(Rect rect, int i11, int i12) {
        int iChooseSize;
        int iChooseSize2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            iChooseSize2 = RecyclerView.LayoutManager.chooseSize(i12, rect.height() + paddingTop, getMinimumHeight());
            iChooseSize = RecyclerView.LayoutManager.chooseSize(i11, (this.mSizePerSpan * this.mSpanCount) + paddingLeft, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.LayoutManager.chooseSize(i11, rect.width() + paddingLeft, getMinimumWidth());
            iChooseSize2 = RecyclerView.LayoutManager.chooseSize(i12, (this.mSizePerSpan * this.mSpanCount) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    public boolean updateAnchorFromPendingData(RecyclerView.State state, AnchorInfo anchorInfo) {
        int i11;
        int firstChildPosition;
        int startAfterPadding;
        boolean z11 = false;
        if (!state.isPreLayout() && (i11 = this.mPendingScrollPosition) != -1) {
            if (i11 >= 0 && i11 < state.getItemCount()) {
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null && savedState.mAnchorPosition != -1 && savedState.mSpanOffsetsSize >= 1) {
                    anchorInfo.mOffset = Integer.MIN_VALUE;
                    anchorInfo.mPosition = this.mPendingScrollPosition;
                } else {
                    View viewFindViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                    if (viewFindViewByPosition != null) {
                        if (this.mShouldReverseLayout) {
                            firstChildPosition = getLastChildPosition();
                        } else {
                            firstChildPosition = getFirstChildPosition();
                        }
                        anchorInfo.mPosition = firstChildPosition;
                        if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                            if (anchorInfo.mLayoutFromEnd) {
                                anchorInfo.mOffset = (this.mPrimaryOrientation.getEndAfterPadding() - this.mPendingScrollPositionOffset) - this.mPrimaryOrientation.getDecoratedEnd(viewFindViewByPosition);
                            } else {
                                anchorInfo.mOffset = (this.mPrimaryOrientation.getStartAfterPadding() + this.mPendingScrollPositionOffset) - this.mPrimaryOrientation.getDecoratedStart(viewFindViewByPosition);
                            }
                            return true;
                        }
                        if (this.mPrimaryOrientation.getDecoratedMeasurement(viewFindViewByPosition) > this.mPrimaryOrientation.getTotalSpace()) {
                            if (anchorInfo.mLayoutFromEnd) {
                                startAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
                            } else {
                                startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
                            }
                            anchorInfo.mOffset = startAfterPadding;
                            return true;
                        }
                        int decoratedStart = this.mPrimaryOrientation.getDecoratedStart(viewFindViewByPosition) - this.mPrimaryOrientation.getStartAfterPadding();
                        if (decoratedStart < 0) {
                            anchorInfo.mOffset = -decoratedStart;
                            return true;
                        }
                        int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding() - this.mPrimaryOrientation.getDecoratedEnd(viewFindViewByPosition);
                        if (endAfterPadding < 0) {
                            anchorInfo.mOffset = endAfterPadding;
                            return true;
                        }
                        anchorInfo.mOffset = Integer.MIN_VALUE;
                    } else {
                        int i12 = this.mPendingScrollPosition;
                        anchorInfo.mPosition = i12;
                        int i13 = this.mPendingScrollPositionOffset;
                        if (i13 == Integer.MIN_VALUE) {
                            if (calculateScrollDirectionForPosition(i12) == 1) {
                                z11 = true;
                            }
                            anchorInfo.mLayoutFromEnd = z11;
                            anchorInfo.assignCoordinateFromPadding();
                        } else {
                            anchorInfo.assignCoordinateFromPadding(i13);
                        }
                        anchorInfo.mInvalidateOffsets = true;
                    }
                }
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    public void updateAnchorInfoForLayout(RecyclerView.State state, AnchorInfo anchorInfo) {
        if (updateAnchorFromPendingData(state, anchorInfo) || updateAnchorFromChildren(state, anchorInfo)) {
            return;
        }
        anchorInfo.assignCoordinateFromPadding();
        anchorInfo.mPosition = 0;
    }

    public StaggeredGridLayoutManager(int i11, int i12) {
        this.mOrientation = i12;
        setSpanCount(i11);
        this.mLayoutState = new LayoutState();
        createOrientationHelpers();
    }

    private void measureChildWithDecorationsAndMargin(View view, int i11, int i12, boolean z11) {
        boolean zShouldMeasureChild;
        calculateItemDecorationsForChild(view, this.mTmpRect);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i13 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        Rect rect = this.mTmpRect;
        int iUpdateSpecWithExtra = updateSpecWithExtra(i11, i13 + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int i14 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        Rect rect2 = this.mTmpRect;
        int iUpdateSpecWithExtra2 = updateSpecWithExtra(i12, i14 + rect2.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect2.bottom);
        if (z11) {
            zShouldMeasureChild = shouldReMeasureChild(view, iUpdateSpecWithExtra, iUpdateSpecWithExtra2, layoutParams);
        } else {
            zShouldMeasureChild = shouldMeasureChild(view, iUpdateSpecWithExtra, iUpdateSpecWithExtra2, layoutParams);
        }
        if (zShouldMeasureChild) {
            view.measure(iUpdateSpecWithExtra, iUpdateSpecWithExtra2);
        }
    }
}
