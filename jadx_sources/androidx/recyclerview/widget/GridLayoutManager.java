package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.annotation.NonNull;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    private static final boolean DEBUG = false;
    public static final int DEFAULT_SPAN_COUNT = -1;
    private static final String TAG = "GridLayoutManager";
    int[] mCachedBorders;
    final Rect mDecorInsets;
    boolean mPendingSpanCountChange;
    final SparseIntArray mPreLayoutSpanIndexCache;
    final SparseIntArray mPreLayoutSpanSizeCache;
    View[] mSet;
    int mSpanCount;
    SpanSizeLookup mSpanSizeLookup;
    private boolean mUsingSpansToEstimateScrollBarDimensions;

    public static final class DefaultSpanSizeLookup extends SpanSizeLookup {
        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanIndex(int i11, int i12) {
            return i11 % i12;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i11) {
            return 1;
        }
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        int mSpanIndex;
        int mSpanSize;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public int getSpanIndex() {
            return this.mSpanIndex;
        }

        public int getSpanSize() {
            return this.mSpanSize;
        }

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }
    }

    public static abstract class SpanSizeLookup {
        final SparseIntArray mSpanIndexCache = new SparseIntArray();
        final SparseIntArray mSpanGroupIndexCache = new SparseIntArray();
        private boolean mCacheSpanIndices = false;
        private boolean mCacheSpanGroupIndices = false;

        public abstract int getSpanSize(int i11);

        public int getCachedSpanGroupIndex(int i11, int i12) {
            if (!this.mCacheSpanGroupIndices) {
                return getSpanGroupIndex(i11, i12);
            }
            int i13 = this.mSpanGroupIndexCache.get(i11, -1);
            if (i13 != -1) {
                return i13;
            }
            int spanGroupIndex = getSpanGroupIndex(i11, i12);
            this.mSpanGroupIndexCache.put(i11, spanGroupIndex);
            return spanGroupIndex;
        }

        public int getCachedSpanIndex(int i11, int i12) {
            if (!this.mCacheSpanIndices) {
                return getSpanIndex(i11, i12);
            }
            int i13 = this.mSpanIndexCache.get(i11, -1);
            if (i13 != -1) {
                return i13;
            }
            int spanIndex = getSpanIndex(i11, i12);
            this.mSpanIndexCache.put(i11, spanIndex);
            return spanIndex;
        }

        public int getSpanGroupIndex(int i11, int i12) {
            int i13;
            int i14;
            int cachedSpanIndex;
            int iFindFirstKeyLessThan;
            if (!this.mCacheSpanGroupIndices || (iFindFirstKeyLessThan = findFirstKeyLessThan(this.mSpanGroupIndexCache, i11)) == -1) {
                i13 = 0;
                i14 = 0;
                cachedSpanIndex = 0;
            } else {
                i13 = this.mSpanGroupIndexCache.get(iFindFirstKeyLessThan);
                i14 = iFindFirstKeyLessThan + 1;
                cachedSpanIndex = getCachedSpanIndex(iFindFirstKeyLessThan, i12) + getSpanSize(iFindFirstKeyLessThan);
                if (cachedSpanIndex == i12) {
                    i13++;
                    cachedSpanIndex = 0;
                }
            }
            int spanSize = getSpanSize(i11);
            while (i14 < i11) {
                int spanSize2 = getSpanSize(i14);
                cachedSpanIndex += spanSize2;
                if (cachedSpanIndex == i12) {
                    i13++;
                    cachedSpanIndex = 0;
                } else if (cachedSpanIndex > i12) {
                    i13++;
                    cachedSpanIndex = spanSize2;
                }
                i14++;
            }
            return cachedSpanIndex + spanSize > i12 ? i13 + 1 : i13;
        }

        public void invalidateSpanGroupIndexCache() {
            this.mSpanGroupIndexCache.clear();
        }

        public void invalidateSpanIndexCache() {
            this.mSpanIndexCache.clear();
        }

        public boolean isSpanGroupIndexCacheEnabled() {
            return this.mCacheSpanGroupIndices;
        }

        public boolean isSpanIndexCacheEnabled() {
            return this.mCacheSpanIndices;
        }

        public void setSpanGroupIndexCacheEnabled(boolean z11) {
            if (!z11) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanGroupIndices = z11;
        }

        public void setSpanIndexCacheEnabled(boolean z11) {
            if (!z11) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanIndices = z11;
        }

        public static int findFirstKeyLessThan(SparseIntArray sparseIntArray, int i11) {
            int size = sparseIntArray.size() - 1;
            int i12 = 0;
            while (i12 <= size) {
                int i13 = (i12 + size) >>> 1;
                if (sparseIntArray.keyAt(i13) < i11) {
                    i12 = i13 + 1;
                } else {
                    size = i13 - 1;
                }
            }
            int i14 = i12 - 1;
            if (i14 >= 0 && i14 < sparseIntArray.size()) {
                return sparseIntArray.keyAt(i14);
            }
            return -1;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0024  */
        /* JADX WARN: Code duplicated, block: B:14:0x002b  */
        /* JADX WARN: Code duplicated, block: B:15:0x002d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:16:0x002f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:17:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public int getSpanIndex(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.getSpanSize(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.mCacheSpanIndices
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.mSpanIndexCache
                int r2 = findFirstKeyLessThan(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.mSpanIndexCache
                int r3 = r3.get(r2)
                int r4 = r5.getSpanSize(r2)
                int r3 = r3 + r4
                goto L30
            L20:
                r2 = r1
                r3 = r2
            L22:
                if (r2 >= r6) goto L33
                int r4 = r5.getSpanSize(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L2d
                r3 = r1
                goto L30
            L2d:
                if (r3 <= r7) goto L30
                r3 = r4
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r3
                if (r0 > r7) goto L37
                return r3
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup.getSpanIndex(int, int):int");
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new DefaultSpanSizeLookup();
        this.mDecorInsets = new Rect();
        setSpanCount(RecyclerView.LayoutManager.getProperties(context, attributeSet, i11, i12).spanCount);
    }

    private void assignSpans(RecyclerView.Recycler recycler, RecyclerView.State state, int i11, boolean z11) {
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        if (z11) {
            i14 = 1;
            i13 = i11;
            i12 = 0;
        } else {
            i12 = i11 - 1;
            i13 = -1;
            i14 = -1;
        }
        while (i12 != i13) {
            View view = this.mSet[i12];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int spanSize = getSpanSize(recycler, state, getPosition(view));
            layoutParams.mSpanSize = spanSize;
            layoutParams.mSpanIndex = i15;
            i15 += spanSize;
            i12 += i14;
        }
    }

    private void calculateItemBorders(int i11) {
        this.mCachedBorders = calculateItemBorders(this.mCachedBorders, this.mSpanCount, i11);
    }

    private void ensureAnchorIsInCorrectSpan(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.AnchorInfo anchorInfo, int i11) {
        boolean z11 = i11 == 1;
        int spanIndex = getSpanIndex(recycler, state, anchorInfo.mPosition);
        if (z11) {
            while (spanIndex > 0) {
                int i12 = anchorInfo.mPosition;
                if (i12 <= 0) {
                    return;
                }
                int i13 = i12 - 1;
                anchorInfo.mPosition = i13;
                spanIndex = getSpanIndex(recycler, state, i13);
            }
            return;
        }
        int itemCount = state.getItemCount() - 1;
        int i14 = anchorInfo.mPosition;
        while (i14 < itemCount) {
            int i15 = i14 + 1;
            int spanIndex2 = getSpanIndex(recycler, state, i15);
            if (spanIndex2 <= spanIndex) {
                break;
            }
            i14 = i15;
            spanIndex = spanIndex2;
        }
        anchorInfo.mPosition = i14;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public static int[] calculateItemBorders(int[] iArr, int i11, int i12) {
        int i13;
        if (iArr == null || iArr.length != i11 + 1 || iArr[iArr.length - 1] != i12) {
            iArr = new int[i11 + 1];
        }
        int i14 = 0;
        iArr[0] = 0;
        int i15 = i12 / i11;
        int i16 = i12 % i11;
        int i17 = 0;
        for (int i18 = 1; i18 <= i11; i18++) {
            i14 += i16;
            if (i14 <= 0 || i11 - i14 >= i16) {
                i13 = i15;
            } else {
                i13 = i15 + 1;
                i14 -= i11;
            }
            i17 += i13;
            iArr[i18] = i17;
        }
        return iArr;
    }

    private void clearPreLayoutSpanMappingCache() {
        this.mPreLayoutSpanSizeCache.clear();
        this.mPreLayoutSpanIndexCache.clear();
    }

    private void ensureViewSet() {
        View[] viewArr = this.mSet;
        if (viewArr == null || viewArr.length != this.mSpanCount) {
            this.mSet = new View[this.mSpanCount];
        }
    }

    private void guessMeasurement(float f11, int i11) {
        calculateItemBorders(Math.max(Math.round(f11 * this.mSpanCount), i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void collectPrefetchPositionsForLayoutState(RecyclerView.State state, LinearLayoutManager.LayoutState layoutState, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int spanSize = this.mSpanCount;
        for (int i11 = 0; i11 < this.mSpanCount && layoutState.hasMore(state) && spanSize > 0; i11++) {
            int i12 = layoutState.mCurrentPosition;
            layoutPrefetchRegistry.addPosition(i12, Math.max(0, layoutState.mScrollingOffset));
            spanSize -= this.mSpanSizeLookup.getSpanSize(i12);
            layoutState.mCurrentPosition += layoutState.mItemDirection;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return this.mUsingSpansToEstimateScrollBarDimensions ? computeScrollOffsetWithSpanInfo(state) : super.computeHorizontalScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return this.mUsingSpansToEstimateScrollBarDimensions ? computeScrollRangeWithSpanInfo(state) : super.computeHorizontalScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return this.mUsingSpansToEstimateScrollBarDimensions ? computeScrollOffsetWithSpanInfo(state) : super.computeVerticalScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return this.mUsingSpansToEstimateScrollBarDimensions ? computeScrollRangeWithSpanInfo(state) : super.computeVerticalScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 1) {
            return this.mSpanCount;
        }
        if (state.getItemCount() < 1) {
            return 0;
        }
        return getSpanGroupIndex(recycler, state, state.getItemCount() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 0) {
            return this.mSpanCount;
        }
        if (state.getItemCount() < 1) {
            return 0;
        }
        return getSpanGroupIndex(recycler, state, state.getItemCount() - 1) + 1;
    }

    public int getSpaceForSpanRange(int i11, int i12) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.mCachedBorders;
            return iArr[i12 + i11] - iArr[i11];
        }
        int[] iArr2 = this.mCachedBorders;
        int i13 = this.mSpanCount;
        return iArr2[i13 - i11] - iArr2[(i13 - i11) - i12];
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    public SpanSizeLookup getSpanSizeLookup() {
        return this.mSpanSizeLookup;
    }

    public boolean isUsingSpansToEstimateScrollbarDimensions() {
        return this.mUsingSpansToEstimateScrollBarDimensions;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.LayoutState layoutState, LinearLayoutManager.LayoutChunkResult layoutChunkResult) {
        int i11;
        int i12;
        int paddingLeft;
        int paddingTop;
        int decoratedMeasurementInOther;
        int decoratedMeasurementInOther2;
        int i13;
        int childMeasureSpec;
        int childMeasureSpec2;
        View next;
        int modeInOther = this.mOrientationHelper.getModeInOther();
        boolean z11 = modeInOther != 1073741824;
        int i14 = getChildCount() > 0 ? this.mCachedBorders[this.mSpanCount] : 0;
        if (z11) {
            updateMeasurements();
        }
        boolean z12 = layoutState.mItemDirection == 1;
        int spanIndex = this.mSpanCount;
        if (!z12) {
            spanIndex = getSpanIndex(recycler, state, layoutState.mCurrentPosition) + getSpanSize(recycler, state, layoutState.mCurrentPosition);
        }
        int i15 = 0;
        while (i15 < this.mSpanCount && layoutState.hasMore(state) && spanIndex > 0) {
            int i16 = layoutState.mCurrentPosition;
            int spanSize = getSpanSize(recycler, state, i16);
            if (spanSize > this.mSpanCount) {
                throw new IllegalArgumentException("Item at position " + i16 + " requires " + spanSize + " spans but GridLayoutManager has only " + this.mSpanCount + " spans.");
            }
            spanIndex -= spanSize;
            if (spanIndex < 0 || (next = layoutState.next(recycler)) == null) {
                break;
            }
            this.mSet[i15] = next;
            i15++;
        }
        if (i15 == 0) {
            layoutChunkResult.mFinished = true;
            return;
        }
        assignSpans(recycler, state, i15, z12);
        float f11 = 0.0f;
        int i17 = 0;
        for (int i18 = 0; i18 < i15; i18++) {
            View view = this.mSet[i18];
            if (layoutState.mScrapList == null) {
                if (z12) {
                    addView(view);
                } else {
                    addView(view, 0);
                }
            } else if (z12) {
                addDisappearingView(view);
            } else {
                addDisappearingView(view, 0);
            }
            calculateItemDecorationsForChild(view, this.mDecorInsets);
            measureChild(view, modeInOther, false);
            int decoratedMeasurement = this.mOrientationHelper.getDecoratedMeasurement(view);
            if (decoratedMeasurement > i17) {
                i17 = decoratedMeasurement;
            }
            float decoratedMeasurementInOther3 = (this.mOrientationHelper.getDecoratedMeasurementInOther(view) * 1.0f) / ((LayoutParams) view.getLayoutParams()).mSpanSize;
            if (decoratedMeasurementInOther3 > f11) {
                f11 = decoratedMeasurementInOther3;
            }
        }
        if (z11) {
            guessMeasurement(f11, i14);
            i17 = 0;
            for (int i19 = 0; i19 < i15; i19++) {
                View view2 = this.mSet[i19];
                measureChild(view2, 1073741824, true);
                int decoratedMeasurement2 = this.mOrientationHelper.getDecoratedMeasurement(view2);
                if (decoratedMeasurement2 > i17) {
                    i17 = decoratedMeasurement2;
                }
            }
        }
        for (int i21 = 0; i21 < i15; i21++) {
            View view3 = this.mSet[i21];
            if (this.mOrientationHelper.getDecoratedMeasurement(view3) != i17) {
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                Rect rect = layoutParams.mDecorInsets;
                int i22 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                int i23 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                int spaceForSpanRange = getSpaceForSpanRange(layoutParams.mSpanIndex, layoutParams.mSpanSize);
                if (this.mOrientation == 1) {
                    childMeasureSpec2 = RecyclerView.LayoutManager.getChildMeasureSpec(spaceForSpanRange, 1073741824, i23, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - i22, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - i23, 1073741824);
                    childMeasureSpec = RecyclerView.LayoutManager.getChildMeasureSpec(spaceForSpanRange, 1073741824, i22, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
                    childMeasureSpec2 = iMakeMeasureSpec;
                }
                measureChildWithDecorationsAndMargin(view3, childMeasureSpec2, childMeasureSpec, true);
            }
        }
        layoutChunkResult.mConsumed = i17;
        if (this.mOrientation == 1) {
            if (layoutState.mLayoutDirection == -1) {
                decoratedMeasurementInOther2 = layoutState.mOffset;
                i13 = decoratedMeasurementInOther2 - i17;
            } else {
                i13 = layoutState.mOffset;
                decoratedMeasurementInOther2 = i13 + i17;
            }
            paddingTop = i13;
            decoratedMeasurementInOther = 0;
            paddingLeft = 0;
        } else {
            if (layoutState.mLayoutDirection == -1) {
                i12 = layoutState.mOffset;
                i11 = i12 - i17;
            } else {
                i11 = layoutState.mOffset;
                i12 = i11 + i17;
            }
            paddingLeft = i11;
            paddingTop = 0;
            decoratedMeasurementInOther = i12;
            decoratedMeasurementInOther2 = 0;
        }
        for (int i24 = 0; i24 < i15; i24++) {
            View view4 = this.mSet[i24];
            LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
            if (this.mOrientation != 1) {
                paddingTop = this.mCachedBorders[layoutParams2.mSpanIndex] + getPaddingTop();
                decoratedMeasurementInOther2 = this.mOrientationHelper.getDecoratedMeasurementInOther(view4) + paddingTop;
            } else if (isLayoutRTL()) {
                decoratedMeasurementInOther = getPaddingLeft() + this.mCachedBorders[this.mSpanCount - layoutParams2.mSpanIndex];
                paddingLeft = decoratedMeasurementInOther - this.mOrientationHelper.getDecoratedMeasurementInOther(view4);
            } else {
                paddingLeft = this.mCachedBorders[layoutParams2.mSpanIndex] + getPaddingLeft();
                decoratedMeasurementInOther = this.mOrientationHelper.getDecoratedMeasurementInOther(view4) + paddingLeft;
            }
            int i25 = decoratedMeasurementInOther2;
            int i26 = paddingTop;
            int i27 = decoratedMeasurementInOther;
            int i28 = paddingLeft;
            layoutDecoratedWithMargins(view4, i28, i26, i27, i25);
            decoratedMeasurementInOther2 = i25;
            paddingLeft = i28;
            decoratedMeasurementInOther = i27;
            paddingTop = i26;
            if (layoutParams2.isItemRemoved() || layoutParams2.isItemChanged()) {
                layoutChunkResult.mIgnoreConsumed = true;
            }
            layoutChunkResult.mFocusable = view4.hasFocusable() | layoutChunkResult.mFocusable;
        }
        Arrays.fill(this.mSet, (Object) null);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:73:0x0111  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View onFocusSearchFailed(View view, int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int childCount;
        int i12;
        int childCount2;
        View view2;
        View view3;
        View view4;
        int i13;
        int i14;
        int i15;
        RecyclerView.Recycler recycler2 = recycler;
        RecyclerView.State state2 = state;
        View viewFindContainingItemView = findContainingItemView(view);
        View view5 = null;
        if (viewFindContainingItemView == null) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) viewFindContainingItemView.getLayoutParams();
        int i16 = layoutParams.mSpanIndex;
        int i17 = layoutParams.mSpanSize + i16;
        if (super.onFocusSearchFailed(view, i11, recycler, state) == null) {
            return null;
        }
        if ((convertFocusDirectionToLayoutDirection(i11) == 1) != this.mShouldReverseLayout) {
            childCount2 = getChildCount() - 1;
            childCount = -1;
            i12 = -1;
        } else {
            childCount = getChildCount();
            i12 = 1;
            childCount2 = 0;
        }
        boolean z11 = this.mOrientation == 1 && isLayoutRTL();
        int spanGroupIndex = getSpanGroupIndex(recycler2, state2, childCount2);
        int i18 = -1;
        int i19 = -1;
        int iMin = 0;
        int iMin2 = 0;
        int i21 = childCount2;
        View view6 = null;
        while (i21 != childCount) {
            int spanGroupIndex2 = getSpanGroupIndex(recycler2, state2, i21);
            View childAt = getChildAt(i21);
            if (childAt == viewFindContainingItemView) {
                break;
            }
            if (!childAt.hasFocusable() || spanGroupIndex2 == spanGroupIndex) {
                LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                int i22 = layoutParams2.mSpanIndex;
                view2 = viewFindContainingItemView;
                int i23 = layoutParams2.mSpanSize + i22;
                if (childAt.hasFocusable() && i22 == i16 && i23 == i17) {
                    return childAt;
                }
                if (!(childAt.hasFocusable() && view5 == null) && (childAt.hasFocusable() || view6 != null)) {
                    view3 = view5;
                    int iMin3 = Math.min(i23, i17) - Math.max(i22, i16);
                    if (!childAt.hasFocusable()) {
                        if (view3 == null) {
                            view4 = view6;
                            i13 = iMin;
                            if (isViewPartiallyVisible(childAt, false, true)) {
                                i14 = iMin2;
                                if (iMin3 > i14) {
                                    i15 = i19;
                                } else if (iMin3 == i14) {
                                    i15 = i19;
                                    if (z11 == (i22 > i15)) {
                                    }
                                    iMin = i13;
                                    view5 = view3;
                                    i21 += i12;
                                    recycler2 = recycler;
                                    state2 = state;
                                    viewFindContainingItemView = view2;
                                } else {
                                    i15 = i19;
                                }
                                if (childAt.hasFocusable()) {
                                    i19 = i15;
                                    iMin2 = i14;
                                    i18 = layoutParams2.mSpanIndex;
                                    view6 = view4;
                                    view5 = childAt;
                                    iMin = Math.min(i23, i17) - Math.max(i22, i16);
                                } else {
                                    int i24 = layoutParams2.mSpanIndex;
                                    iMin2 = Math.min(i23, i17) - Math.max(i22, i16);
                                    view6 = childAt;
                                    i19 = i24;
                                    iMin = i13;
                                    view5 = view3;
                                }
                                i21 += i12;
                                recycler2 = recycler;
                                state2 = state;
                                viewFindContainingItemView = view2;
                            }
                            i19 = i15;
                            iMin2 = i14;
                            view6 = view4;
                            iMin = i13;
                            view5 = view3;
                            i21 += i12;
                            recycler2 = recycler;
                            state2 = state;
                            viewFindContainingItemView = view2;
                        }
                        i15 = i19;
                        i14 = iMin2;
                        i19 = i15;
                        iMin2 = i14;
                        view6 = view4;
                        iMin = i13;
                        view5 = view3;
                        i21 += i12;
                        recycler2 = recycler;
                        state2 = state;
                        viewFindContainingItemView = view2;
                    } else if (iMin3 <= iMin) {
                        if (iMin3 == iMin) {
                        }
                    }
                } else {
                    view3 = view5;
                }
                view4 = view6;
                i13 = iMin;
                i15 = i19;
                i14 = iMin2;
                if (childAt.hasFocusable()) {
                    i19 = i15;
                    iMin2 = i14;
                    i18 = layoutParams2.mSpanIndex;
                    view6 = view4;
                    view5 = childAt;
                    iMin = Math.min(i23, i17) - Math.max(i22, i16);
                } else {
                    int i25 = layoutParams2.mSpanIndex;
                    iMin2 = Math.min(i23, i17) - Math.max(i22, i16);
                    view6 = childAt;
                    i19 = i25;
                    iMin = i13;
                    view5 = view3;
                }
                i21 += i12;
                recycler2 = recycler;
                state2 = state;
                viewFindContainingItemView = view2;
            } else {
                if (view5 != null) {
                    break;
                }
                view2 = viewFindContainingItemView;
                view3 = view5;
            }
            view4 = view6;
            i13 = iMin;
            i15 = i19;
            i14 = iMin2;
            i19 = i15;
            iMin2 = i14;
            view6 = view4;
            iMin = i13;
            view5 = view3;
            i21 += i12;
            recycler2 = recycler;
            state2 = state;
            viewFindContainingItemView = view2;
        }
        View view7 = view5;
        return view7 != null ? view7 : view6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i11, int i12) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i11, int i12, int i13) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i11, int i12) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i11, int i12, Object obj) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(Rect rect, int i11, int i12) {
        int iChooseSize;
        int iChooseSize2;
        if (this.mCachedBorders == null) {
            super.setMeasuredDimension(rect, i11, i12);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            iChooseSize2 = RecyclerView.LayoutManager.chooseSize(i12, rect.height() + paddingTop, getMinimumHeight());
            int[] iArr = this.mCachedBorders;
            iChooseSize = RecyclerView.LayoutManager.chooseSize(i11, iArr[iArr.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.LayoutManager.chooseSize(i11, rect.width() + paddingLeft, getMinimumWidth());
            int[] iArr2 = this.mCachedBorders;
            iChooseSize2 = RecyclerView.LayoutManager.chooseSize(i12, iArr2[iArr2.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    public void setSpanCount(int i11) {
        if (i11 == this.mSpanCount) {
            return;
        }
        this.mPendingSpanCountChange = true;
        if (i11 >= 1) {
            this.mSpanCount = i11;
            this.mSpanSizeLookup.invalidateSpanIndexCache();
            requestLayout();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i11);
        }
    }

    public void setSpanSizeLookup(SpanSizeLookup spanSizeLookup) {
        this.mSpanSizeLookup = spanSizeLookup;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z11) {
        if (z11) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    public void setUsingSpansToEstimateScrollbarDimensions(boolean z11) {
        this.mUsingSpansToEstimateScrollBarDimensions = z11;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.mPendingSpanCountChange;
    }

    private void cachePreLayoutSpanMapping() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i11).getLayoutParams();
            int viewLayoutPosition = layoutParams.getViewLayoutPosition();
            this.mPreLayoutSpanSizeCache.put(viewLayoutPosition, layoutParams.getSpanSize());
            this.mPreLayoutSpanIndexCache.put(viewLayoutPosition, layoutParams.getSpanIndex());
        }
    }

    private int computeScrollOffsetWithSpanInfo(RecyclerView.State state) {
        int iMax;
        if (getChildCount() != 0 && state.getItemCount() != 0) {
            ensureLayoutState();
            boolean zIsSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            View viewFindFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!zIsSmoothScrollbarEnabled, true);
            View viewFindFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!zIsSmoothScrollbarEnabled, true);
            if (viewFindFirstVisibleChildClosestToStart != null && viewFindFirstVisibleChildClosestToEnd != null) {
                int cachedSpanGroupIndex = this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToStart), this.mSpanCount);
                int cachedSpanGroupIndex2 = this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToEnd), this.mSpanCount);
                int iMin = Math.min(cachedSpanGroupIndex, cachedSpanGroupIndex2);
                int iMax2 = Math.max(cachedSpanGroupIndex, cachedSpanGroupIndex2);
                int cachedSpanGroupIndex3 = this.mSpanSizeLookup.getCachedSpanGroupIndex(state.getItemCount() - 1, this.mSpanCount) + 1;
                if (this.mShouldReverseLayout) {
                    iMax = Math.max(0, (cachedSpanGroupIndex3 - iMax2) - 1);
                } else {
                    iMax = Math.max(0, iMin);
                }
                if (!zIsSmoothScrollbarEnabled) {
                    return iMax;
                }
                return Math.round((iMax * (Math.abs(this.mOrientationHelper.getDecoratedEnd(viewFindFirstVisibleChildClosestToEnd) - this.mOrientationHelper.getDecoratedStart(viewFindFirstVisibleChildClosestToStart)) / ((this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToEnd), this.mSpanCount) - this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToStart), this.mSpanCount)) + 1))) + (this.mOrientationHelper.getStartAfterPadding() - this.mOrientationHelper.getDecoratedStart(viewFindFirstVisibleChildClosestToStart)));
            }
        }
        return 0;
    }

    private int computeScrollRangeWithSpanInfo(RecyclerView.State state) {
        if (getChildCount() != 0 && state.getItemCount() != 0) {
            ensureLayoutState();
            View viewFindFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled(), true);
            View viewFindFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled(), true);
            if (viewFindFirstVisibleChildClosestToStart != null && viewFindFirstVisibleChildClosestToEnd != null) {
                if (!isSmoothScrollbarEnabled()) {
                    return this.mSpanSizeLookup.getCachedSpanGroupIndex(state.getItemCount() - 1, this.mSpanCount) + 1;
                }
                return (int) (((this.mOrientationHelper.getDecoratedEnd(viewFindFirstVisibleChildClosestToEnd) - this.mOrientationHelper.getDecoratedStart(viewFindFirstVisibleChildClosestToStart)) / ((this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToEnd), this.mSpanCount) - this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToStart), this.mSpanCount)) + 1)) * (this.mSpanSizeLookup.getCachedSpanGroupIndex(state.getItemCount() - 1, this.mSpanCount) + 1));
            }
        }
        return 0;
    }

    private int getSpanGroupIndex(RecyclerView.Recycler recycler, RecyclerView.State state, int i11) {
        if (!state.isPreLayout()) {
            return this.mSpanSizeLookup.getCachedSpanGroupIndex(i11, this.mSpanCount);
        }
        int iConvertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i11);
        if (iConvertPreLayoutPositionToPostLayout == -1) {
            Log.w(TAG, "Cannot find span size for pre layout position. " + i11);
            return 0;
        }
        return this.mSpanSizeLookup.getCachedSpanGroupIndex(iConvertPreLayoutPositionToPostLayout, this.mSpanCount);
    }

    private int getSpanIndex(RecyclerView.Recycler recycler, RecyclerView.State state, int i11) {
        if (!state.isPreLayout()) {
            return this.mSpanSizeLookup.getCachedSpanIndex(i11, this.mSpanCount);
        }
        int i12 = this.mPreLayoutSpanIndexCache.get(i11, -1);
        if (i12 != -1) {
            return i12;
        }
        int iConvertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i11);
        if (iConvertPreLayoutPositionToPostLayout == -1) {
            Log.w(TAG, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i11);
            return 0;
        }
        return this.mSpanSizeLookup.getCachedSpanIndex(iConvertPreLayoutPositionToPostLayout, this.mSpanCount);
    }

    private int getSpanSize(RecyclerView.Recycler recycler, RecyclerView.State state, int i11) {
        if (!state.isPreLayout()) {
            return this.mSpanSizeLookup.getSpanSize(i11);
        }
        int i12 = this.mPreLayoutSpanSizeCache.get(i11, -1);
        if (i12 != -1) {
            return i12;
        }
        int iConvertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i11);
        if (iConvertPreLayoutPositionToPostLayout == -1) {
            Log.w(TAG, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i11);
            return 1;
        }
        return this.mSpanSizeLookup.getSpanSize(iConvertPreLayoutPositionToPostLayout);
    }

    private void measureChild(View view, int i11, boolean z11) {
        int childMeasureSpec;
        int childMeasureSpec2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.mDecorInsets;
        int i12 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i13 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int spaceForSpanRange = getSpaceForSpanRange(layoutParams.mSpanIndex, layoutParams.mSpanSize);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = RecyclerView.LayoutManager.getChildMeasureSpec(spaceForSpanRange, i11, i13, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
            childMeasureSpec = RecyclerView.LayoutManager.getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), getHeightMode(), i12, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
        } else {
            int childMeasureSpec3 = RecyclerView.LayoutManager.getChildMeasureSpec(spaceForSpanRange, i11, i12, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
            int childMeasureSpec4 = RecyclerView.LayoutManager.getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), getWidthMode(), i13, ((ViewGroup.MarginLayoutParams) layoutParams).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        measureChildWithDecorationsAndMargin(view, childMeasureSpec2, childMeasureSpec, z11);
    }

    private void measureChildWithDecorationsAndMargin(View view, int i11, int i12, boolean z11) {
        boolean zShouldMeasureChild;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z11) {
            zShouldMeasureChild = shouldReMeasureChild(view, i11, i12, layoutParams);
        } else {
            zShouldMeasureChild = shouldMeasureChild(view, i11, i12, layoutParams);
        }
        if (zShouldMeasureChild) {
            view.measure(i11, i12);
        }
    }

    private void updateMeasurements() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        calculateItemBorders(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View findReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z11, boolean z12) {
        int i11;
        int childCount;
        int childCount2 = getChildCount();
        int i12 = 1;
        if (z12) {
            childCount = getChildCount() - 1;
            i11 = -1;
            i12 = -1;
        } else {
            i11 = childCount2;
            childCount = 0;
        }
        int itemCount = state.getItemCount();
        ensureLayoutState();
        int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
        int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
        View view = null;
        View view2 = null;
        while (childCount != i11) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < itemCount && getSpanIndex(recycler, state, position) == 0) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.getDecoratedStart(childAt) < endAfterPadding && this.mOrientationHelper.getDecoratedEnd(childAt) >= startAfterPadding) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            childCount += i12;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void onAnchorReady(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.AnchorInfo anchorInfo, int i11) {
        super.onAnchorReady(recycler, state, anchorInfo, i11);
        updateMeasurements();
        if (state.getItemCount() > 0 && !state.isPreLayout()) {
            ensureAnchorIsInCorrectSpan(recycler, state, anchorInfo, i11);
        }
        ensureViewSet();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int spanGroupIndex = getSpanGroupIndex(recycler, state, layoutParams2.getViewLayoutPosition());
        if (this.mOrientation == 0) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(layoutParams2.getSpanIndex(), layoutParams2.getSpanSize(), spanGroupIndex, 1, false, false));
        } else {
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(spanGroupIndex, 1, layoutParams2.getSpanIndex(), layoutParams2.getSpanSize(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.isPreLayout()) {
            cachePreLayoutSpanMapping();
        }
        super.onLayoutChildren(recycler, state);
        clearPreLayoutSpanMappingCache();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.mPendingSpanCountChange = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollHorizontallyBy(i11, recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollVerticallyBy(i11, recycler, state);
    }

    public GridLayoutManager(Context context, int i11) {
        super(context);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new DefaultSpanSizeLookup();
        this.mDecorInsets = new Rect();
        setSpanCount(i11);
    }

    public GridLayoutManager(Context context, int i11, int i12, boolean z11) {
        super(context, i12, z11);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new DefaultSpanSizeLookup();
        this.mDecorInsets = new Rect();
        setSpanCount(i11);
    }
}
