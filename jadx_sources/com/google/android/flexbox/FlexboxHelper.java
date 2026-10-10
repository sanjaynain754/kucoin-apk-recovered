package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.widget.CompoundButtonCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes45.dex */
class FlexboxHelper {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int INITIAL_CAPACITY = 10;
    private static final long MEASURE_SPEC_WIDTH_MASK = 4294967295L;
    private boolean[] mChildrenFrozen;
    private final FlexContainer mFlexContainer;

    @Nullable
    int[] mIndexToFlexLine;

    @Nullable
    long[] mMeasureSpecCache;

    @Nullable
    private long[] mMeasuredSizeCache;

    public static class FlexLinesResult {
        int mChildState;
        List<FlexLine> mFlexLines;

        public void reset() {
            this.mFlexLines = null;
            this.mChildState = 0;
        }
    }

    public static class Order implements Comparable<Order> {
        int index;
        int order;

        private Order() {
        }

        @Override // java.lang.Comparable
        public int compareTo(@NonNull Order order) {
            int i11 = this.order;
            int i12 = order.order;
            return i11 != i12 ? i11 - i12 : this.index - order.index;
        }

        @NonNull
        public String toString() {
            return "Order{order=" + this.order + ", index=" + this.index + '}';
        }
    }

    private List<FlexLine> constructFlexLinesForAlignContentCenter(List<FlexLine> list, int i11, int i12) {
        int i13 = (i11 - i12) / 2;
        ArrayList arrayList = new ArrayList();
        FlexLine flexLine = new FlexLine();
        flexLine.mCrossSize = i13;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (i14 == 0) {
                arrayList.add(flexLine);
            }
            arrayList.add(list.get(i14));
            if (i14 == list.size() - 1) {
                arrayList.add(flexLine);
            }
        }
        return arrayList;
    }

    private boolean isLastFlexItem(int i11, int i12, FlexLine flexLine) {
        return i11 == i12 - 1 && flexLine.getItemCountNotGone() != 0;
    }

    public void calculateHorizontalFlexLines(FlexLinesResult flexLinesResult, int i11, int i12) {
        calculateFlexLines(flexLinesResult, i11, i12, Integer.MAX_VALUE, 0, -1, null);
    }

    public void calculateHorizontalFlexLinesToIndex(FlexLinesResult flexLinesResult, int i11, int i12, int i13, int i14, List<FlexLine> list) {
        calculateFlexLines(flexLinesResult, i11, i12, i13, 0, i14, list);
    }

    public void calculateVerticalFlexLines(FlexLinesResult flexLinesResult, int i11, int i12) {
        calculateFlexLines(flexLinesResult, i12, i11, Integer.MAX_VALUE, 0, -1, null);
    }

    public void calculateVerticalFlexLinesToIndex(FlexLinesResult flexLinesResult, int i11, int i12, int i13, int i14, List<FlexLine> list) {
        calculateFlexLines(flexLinesResult, i12, i11, i13, 0, i14, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] createReorderedIndices(View view, int i11, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.mFlexContainer.getFlexItemCount();
        List<Order> listCreateOrders = createOrders(flexItemCount);
        Order order = new Order();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            order.order = 1;
        } else {
            order.order = ((FlexItem) layoutParams).getOrder();
        }
        if (i11 == -1 || i11 == flexItemCount || i11 >= this.mFlexContainer.getFlexItemCount()) {
            order.index = flexItemCount;
        } else {
            order.index = i11;
            while (i11 < flexItemCount) {
                listCreateOrders.get(i11).index++;
                i11++;
            }
        }
        listCreateOrders.add(order);
        return sortOrdersIntoReorderedIndices(flexItemCount + 1, listCreateOrders, sparseIntArray);
    }

    public void determineMainSize(int i11, int i12) {
        determineMainSize(i11, i12, 0);
    }

    public int extractLowerInt(long j11) {
        return (int) j11;
    }

    @VisibleForTesting
    public long makeCombinedLong(int i11, int i12) {
        return (((long) i11) & 4294967295L) | (((long) i12) << 32);
    }

    public void stretchViews() {
        stretchViews(0);
    }

    private void addFlexLine(List<FlexLine> list, FlexLine flexLine, int i11, int i12) {
        flexLine.mSumCrossSizeBefore = i12;
        this.mFlexContainer.onNewFlexLineAdded(flexLine);
        flexLine.mLastIndex = i11;
        list.add(flexLine);
    }

    @NonNull
    private List<Order> createOrders(int i11) {
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            FlexItem flexItem = (FlexItem) this.mFlexContainer.getFlexItemAt(i12).getLayoutParams();
            Order order = new Order();
            order.order = flexItem.getOrder();
            order.index = i12;
            arrayList.add(order);
        }
        return arrayList;
    }

    private void ensureChildrenFrozen(int i11) {
        boolean[] zArr = this.mChildrenFrozen;
        if (zArr == null) {
            if (i11 < 10) {
                i11 = 10;
            }
            this.mChildrenFrozen = new boolean[i11];
        } else {
            if (zArr.length >= i11) {
                Arrays.fill(zArr, false);
                return;
            }
            int length = zArr.length * 2;
            if (length >= i11) {
                i11 = length;
            }
            this.mChildrenFrozen = new boolean[i11];
        }
    }

    private void expandFlexItems(int i11, int i12, FlexLine flexLine, int i13, int i14, boolean z11) {
        int i15;
        float f11;
        float f12;
        int iMax;
        double d11;
        double d12;
        float f13 = flexLine.mTotalFlexGrow;
        float f14 = 0.0f;
        if (f13 <= 0.0f || i13 < (i15 = flexLine.mMainSize)) {
            return;
        }
        float f15 = (i13 - i15) / f13;
        flexLine.mMainSize = i14 + flexLine.mDividerLengthInMainSize;
        if (!z11) {
            flexLine.mCrossSize = Integer.MIN_VALUE;
        }
        int i16 = 0;
        boolean z12 = false;
        int i17 = 0;
        float f16 = 0.0f;
        while (i16 < flexLine.mItemCount) {
            int i18 = flexLine.mFirstIndex + i16;
            View reorderedFlexItemAt = this.mFlexContainer.getReorderedFlexItemAt(i18);
            if (reorderedFlexItemAt == null || reorderedFlexItemAt.getVisibility() == 8) {
                f11 = f14;
                f12 = f15;
                z12 = z12;
            } else {
                FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                int flexDirection = this.mFlexContainer.getFlexDirection();
                f11 = f14;
                if (flexDirection == 0 || flexDirection == 1) {
                    f12 = f15;
                    boolean z13 = z12;
                    int measuredWidth = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr = this.mMeasuredSizeCache;
                    if (jArr != null) {
                        measuredWidth = extractLowerInt(jArr[i18]);
                    }
                    int measuredHeight = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr2 = this.mMeasuredSizeCache;
                    if (jArr2 != null) {
                        measuredHeight = extractHigherInt(jArr2[i18]);
                    }
                    if (this.mChildrenFrozen[i18] || flexItem.getFlexGrow() <= f11) {
                        z12 = z13;
                    } else {
                        float flexGrow = measuredWidth + (flexItem.getFlexGrow() * f12);
                        if (i16 == flexLine.mItemCount - 1) {
                            flexGrow += f16;
                            f16 = f11;
                        }
                        int iRound = Math.round(flexGrow);
                        if (iRound > flexItem.getMaxWidth()) {
                            iRound = flexItem.getMaxWidth();
                            this.mChildrenFrozen[i18] = true;
                            flexLine.mTotalFlexGrow -= flexItem.getFlexGrow();
                            z12 = true;
                        } else {
                            f16 += flexGrow - iRound;
                            double d13 = f16;
                            if (d13 > 1.0d) {
                                iRound++;
                                d11 = d13 - 1.0d;
                            } else {
                                if (d13 < -1.0d) {
                                    iRound--;
                                    d11 = d13 + 1.0d;
                                }
                                z12 = z13;
                            }
                            f16 = (float) d11;
                            z12 = z13;
                        }
                        int childHeightMeasureSpecInternal = getChildHeightMeasureSpecInternal(i12, flexItem, flexLine.mSumCrossSizeBefore);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        reorderedFlexItemAt.measure(iMakeMeasureSpec, childHeightMeasureSpecInternal);
                        int measuredWidth2 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight2 = reorderedFlexItemAt.getMeasuredHeight();
                        updateMeasureCache(i18, iMakeMeasureSpec, childHeightMeasureSpecInternal, reorderedFlexItemAt);
                        this.mFlexContainer.updateViewCache(i18, reorderedFlexItemAt);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i17, measuredHeight + flexItem.getMarginTop() + flexItem.getMarginBottom() + this.mFlexContainer.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    flexLine.mMainSize += measuredWidth + flexItem.getMarginLeft() + flexItem.getMarginRight();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr3 = this.mMeasuredSizeCache;
                    if (jArr3 != null) {
                        measuredHeight3 = extractHigherInt(jArr3[i18]);
                    }
                    int measuredWidth3 = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr4 = this.mMeasuredSizeCache;
                    f12 = f15;
                    boolean z14 = z12;
                    if (jArr4 != null) {
                        measuredWidth3 = extractLowerInt(jArr4[i18]);
                    }
                    if (this.mChildrenFrozen[i18] || flexItem.getFlexGrow() <= f11) {
                        z12 = z14;
                    } else {
                        float flexGrow2 = measuredHeight3 + (flexItem.getFlexGrow() * f12);
                        if (i16 == flexLine.mItemCount - 1) {
                            flexGrow2 += f16;
                            f16 = f11;
                        }
                        int iRound2 = Math.round(flexGrow2);
                        if (iRound2 > flexItem.getMaxHeight()) {
                            iRound2 = flexItem.getMaxHeight();
                            this.mChildrenFrozen[i18] = true;
                            flexLine.mTotalFlexGrow -= flexItem.getFlexGrow();
                            z12 = true;
                        } else {
                            f16 += flexGrow2 - iRound2;
                            double d14 = f16;
                            if (d14 > 1.0d) {
                                iRound2++;
                                d12 = d14 - 1.0d;
                            } else {
                                if (d14 < -1.0d) {
                                    iRound2--;
                                    d12 = d14 + 1.0d;
                                }
                                z12 = z14;
                            }
                            f16 = (float) d12;
                            z12 = z14;
                        }
                        int childWidthMeasureSpecInternal = getChildWidthMeasureSpecInternal(i11, flexItem, flexLine.mSumCrossSizeBefore);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        reorderedFlexItemAt.measure(childWidthMeasureSpecInternal, iMakeMeasureSpec2);
                        int measuredWidth4 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight4 = reorderedFlexItemAt.getMeasuredHeight();
                        updateMeasureCache(i18, childWidthMeasureSpecInternal, iMakeMeasureSpec2, reorderedFlexItemAt);
                        this.mFlexContainer.updateViewCache(i18, reorderedFlexItemAt);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i17, measuredWidth3 + flexItem.getMarginLeft() + flexItem.getMarginRight() + this.mFlexContainer.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    flexLine.mMainSize += measuredHeight3 + flexItem.getMarginTop() + flexItem.getMarginBottom();
                }
                flexLine.mCrossSize = Math.max(flexLine.mCrossSize, iMax);
                i17 = iMax;
            }
            i16++;
            f15 = f12;
            f14 = f11;
        }
        if (!z12 || i15 == flexLine.mMainSize) {
            return;
        }
        expandFlexItems(i11, i12, flexLine, i13, i14, true);
    }

    private int getChildHeightMeasureSpecInternal(int i11, FlexItem flexItem, int i12) {
        FlexContainer flexContainer = this.mFlexContainer;
        int childHeightMeasureSpec = flexContainer.getChildHeightMeasureSpec(i11, flexContainer.getPaddingTop() + this.mFlexContainer.getPaddingBottom() + flexItem.getMarginTop() + flexItem.getMarginBottom() + i12, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(childHeightMeasureSpec);
        if (size > flexItem.getMaxHeight()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.getMaxHeight(), View.MeasureSpec.getMode(childHeightMeasureSpec));
        }
        return size < flexItem.getMinHeight() ? View.MeasureSpec.makeMeasureSpec(flexItem.getMinHeight(), View.MeasureSpec.getMode(childHeightMeasureSpec)) : childHeightMeasureSpec;
    }

    private int getChildWidthMeasureSpecInternal(int i11, FlexItem flexItem, int i12) {
        FlexContainer flexContainer = this.mFlexContainer;
        int childWidthMeasureSpec = flexContainer.getChildWidthMeasureSpec(i11, flexContainer.getPaddingLeft() + this.mFlexContainer.getPaddingRight() + flexItem.getMarginLeft() + flexItem.getMarginRight() + i12, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(childWidthMeasureSpec);
        if (size > flexItem.getMaxWidth()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.getMaxWidth(), View.MeasureSpec.getMode(childWidthMeasureSpec));
        }
        return size < flexItem.getMinWidth() ? View.MeasureSpec.makeMeasureSpec(flexItem.getMinWidth(), View.MeasureSpec.getMode(childWidthMeasureSpec)) : childWidthMeasureSpec;
    }

    private int getFlexItemMarginEndCross(FlexItem flexItem, boolean z11) {
        return z11 ? flexItem.getMarginBottom() : flexItem.getMarginRight();
    }

    private int getFlexItemMarginEndMain(FlexItem flexItem, boolean z11) {
        return z11 ? flexItem.getMarginRight() : flexItem.getMarginBottom();
    }

    private int getFlexItemMarginStartCross(FlexItem flexItem, boolean z11) {
        return z11 ? flexItem.getMarginTop() : flexItem.getMarginLeft();
    }

    private int getFlexItemMarginStartMain(FlexItem flexItem, boolean z11) {
        return z11 ? flexItem.getMarginLeft() : flexItem.getMarginTop();
    }

    private int getFlexItemSizeCross(FlexItem flexItem, boolean z11) {
        return z11 ? flexItem.getHeight() : flexItem.getWidth();
    }

    private int getFlexItemSizeMain(FlexItem flexItem, boolean z11) {
        return z11 ? flexItem.getWidth() : flexItem.getHeight();
    }

    private int getPaddingEndCross(boolean z11) {
        return z11 ? this.mFlexContainer.getPaddingBottom() : this.mFlexContainer.getPaddingEnd();
    }

    private int getPaddingEndMain(boolean z11) {
        return z11 ? this.mFlexContainer.getPaddingEnd() : this.mFlexContainer.getPaddingBottom();
    }

    private int getPaddingStartCross(boolean z11) {
        return z11 ? this.mFlexContainer.getPaddingTop() : this.mFlexContainer.getPaddingStart();
    }

    private int getPaddingStartMain(boolean z11) {
        return z11 ? this.mFlexContainer.getPaddingStart() : this.mFlexContainer.getPaddingTop();
    }

    private int getViewMeasuredSizeCross(View view, boolean z11) {
        return z11 ? view.getMeasuredHeight() : view.getMeasuredWidth();
    }

    private int getViewMeasuredSizeMain(View view, boolean z11) {
        return z11 ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    private boolean isWrapRequired(View view, int i11, int i12, int i13, int i14, FlexItem flexItem, int i15, int i16, int i17) {
        if (this.mFlexContainer.getFlexWrap() == 0) {
            return false;
        }
        if (flexItem.isWrapBefore()) {
            return true;
        }
        if (i11 == 0) {
            return false;
        }
        int maxLine = this.mFlexContainer.getMaxLine();
        if (maxLine != -1 && maxLine <= i17 + 1) {
            return false;
        }
        int decorationLengthMainAxis = this.mFlexContainer.getDecorationLengthMainAxis(view, i15, i16);
        if (decorationLengthMainAxis > 0) {
            i14 += decorationLengthMainAxis;
        }
        return i12 < i13 + i14;
    }

    private void shrinkFlexItems(int i11, int i12, FlexLine flexLine, int i13, int i14, boolean z11) {
        float f11;
        float f12;
        int iMax;
        int minWidth;
        int i15 = flexLine.mMainSize;
        float f13 = flexLine.mTotalFlexShrink;
        float f14 = 0.0f;
        if (f13 <= 0.0f || i13 > i15) {
            return;
        }
        float f15 = (i15 - i13) / f13;
        flexLine.mMainSize = i14 + flexLine.mDividerLengthInMainSize;
        if (!z11) {
            flexLine.mCrossSize = Integer.MIN_VALUE;
        }
        int i16 = 0;
        boolean z12 = false;
        int i17 = 0;
        float f16 = 0.0f;
        while (i16 < flexLine.mItemCount) {
            int i18 = flexLine.mFirstIndex + i16;
            View reorderedFlexItemAt = this.mFlexContainer.getReorderedFlexItemAt(i18);
            if (reorderedFlexItemAt == null || reorderedFlexItemAt.getVisibility() == 8) {
                f11 = f14;
                f12 = f15;
            } else {
                FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                int flexDirection = this.mFlexContainer.getFlexDirection();
                f11 = f14;
                if (flexDirection == 0 || flexDirection == 1) {
                    int measuredWidth = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr = this.mMeasuredSizeCache;
                    if (jArr != null) {
                        measuredWidth = extractLowerInt(jArr[i18]);
                    }
                    int measuredHeight = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr2 = this.mMeasuredSizeCache;
                    f12 = f15;
                    if (jArr2 != null) {
                        measuredHeight = extractHigherInt(jArr2[i18]);
                    }
                    if (!this.mChildrenFrozen[i18] && flexItem.getFlexShrink() > f11) {
                        float flexShrink = measuredWidth - (f12 * flexItem.getFlexShrink());
                        if (i16 == flexLine.mItemCount - 1) {
                            flexShrink += f16;
                            f16 = f11;
                        }
                        int iRound = Math.round(flexShrink);
                        if (iRound < flexItem.getMinWidth()) {
                            minWidth = flexItem.getMinWidth();
                            this.mChildrenFrozen[i18] = true;
                            flexLine.mTotalFlexShrink -= flexItem.getFlexShrink();
                            z12 = true;
                        } else {
                            f16 += flexShrink - iRound;
                            double d11 = f16;
                            if (d11 > 1.0d) {
                                minWidth = iRound + 1;
                                f16 -= 1.0f;
                            } else if (d11 < -1.0d) {
                                minWidth = iRound - 1;
                                f16 += 1.0f;
                            } else {
                                minWidth = iRound;
                            }
                        }
                        int childHeightMeasureSpecInternal = getChildHeightMeasureSpecInternal(i12, flexItem, flexLine.mSumCrossSizeBefore);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(minWidth, 1073741824);
                        reorderedFlexItemAt.measure(iMakeMeasureSpec, childHeightMeasureSpecInternal);
                        int measuredWidth2 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight2 = reorderedFlexItemAt.getMeasuredHeight();
                        updateMeasureCache(i18, iMakeMeasureSpec, childHeightMeasureSpecInternal, reorderedFlexItemAt);
                        this.mFlexContainer.updateViewCache(i18, reorderedFlexItemAt);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i17, measuredHeight + flexItem.getMarginTop() + flexItem.getMarginBottom() + this.mFlexContainer.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    flexLine.mMainSize += measuredWidth + flexItem.getMarginLeft() + flexItem.getMarginRight();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr3 = this.mMeasuredSizeCache;
                    if (jArr3 != null) {
                        measuredHeight3 = extractHigherInt(jArr3[i18]);
                    }
                    int measuredWidth3 = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr4 = this.mMeasuredSizeCache;
                    if (jArr4 != null) {
                        measuredWidth3 = extractLowerInt(jArr4[i18]);
                    }
                    if (!this.mChildrenFrozen[i18] && flexItem.getFlexShrink() > f11) {
                        float flexShrink2 = measuredHeight3 - (flexItem.getFlexShrink() * f15);
                        if (i16 == flexLine.mItemCount - 1) {
                            flexShrink2 += f16;
                            f16 = f11;
                        }
                        int iRound2 = Math.round(flexShrink2);
                        if (iRound2 < flexItem.getMinHeight()) {
                            iRound2 = flexItem.getMinHeight();
                            this.mChildrenFrozen[i18] = true;
                            flexLine.mTotalFlexShrink -= flexItem.getFlexShrink();
                            z12 = true;
                        } else {
                            f16 += flexShrink2 - iRound2;
                            double d12 = f16;
                            if (d12 > 1.0d) {
                                iRound2++;
                                f16 -= 1.0f;
                            } else if (d12 < -1.0d) {
                                iRound2--;
                                f16 += 1.0f;
                            }
                        }
                        int childWidthMeasureSpecInternal = getChildWidthMeasureSpecInternal(i11, flexItem, flexLine.mSumCrossSizeBefore);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        reorderedFlexItemAt.measure(childWidthMeasureSpecInternal, iMakeMeasureSpec2);
                        int measuredWidth4 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight4 = reorderedFlexItemAt.getMeasuredHeight();
                        updateMeasureCache(i18, childWidthMeasureSpecInternal, iMakeMeasureSpec2, reorderedFlexItemAt);
                        this.mFlexContainer.updateViewCache(i18, reorderedFlexItemAt);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i17, measuredWidth3 + flexItem.getMarginLeft() + flexItem.getMarginRight() + this.mFlexContainer.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    flexLine.mMainSize += measuredHeight3 + flexItem.getMarginTop() + flexItem.getMarginBottom();
                    f12 = f15;
                }
                flexLine.mCrossSize = Math.max(flexLine.mCrossSize, iMax);
                i17 = iMax;
            }
            i16++;
            f15 = f12;
            f14 = f11;
        }
        if (!z12 || i15 == flexLine.mMainSize) {
            return;
        }
        shrinkFlexItems(i11, i12, flexLine, i13, i14, true);
    }

    private void updateMeasureCache(int i11, int i12, int i13, View view) {
        long[] jArr = this.mMeasureSpecCache;
        if (jArr != null) {
            jArr[i11] = makeCombinedLong(i12, i13);
        }
        long[] jArr2 = this.mMeasuredSizeCache;
        if (jArr2 != null) {
            jArr2[i11] = makeCombinedLong(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void calculateFlexLines(FlexLinesResult flexLinesResult, int i11, int i12, int i13, int i14, int i15, @Nullable List<FlexLine> list) {
        int i16;
        int i17;
        int i18;
        int i19;
        int childWidthMeasureSpec;
        int i21;
        int i22;
        FlexLine flexLine;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28 = i11;
        boolean zIsMainAxisDirectionHorizontal = this.mFlexContainer.isMainAxisDirectionHorizontal();
        int mode = View.MeasureSpec.getMode(i28);
        int size = View.MeasureSpec.getSize(i28);
        List<FlexLine> arrayList = list == null ? new ArrayList() : list;
        flexLinesResult.mFlexLines = arrayList;
        boolean z11 = i15 == -1;
        int paddingStartMain = getPaddingStartMain(zIsMainAxisDirectionHorizontal);
        int paddingEndMain = getPaddingEndMain(zIsMainAxisDirectionHorizontal);
        int paddingStartCross = getPaddingStartCross(zIsMainAxisDirectionHorizontal);
        int paddingEndCross = getPaddingEndCross(zIsMainAxisDirectionHorizontal);
        FlexLine flexLine2 = new FlexLine();
        int i29 = i14;
        flexLine2.mFirstIndex = i29;
        int i31 = paddingStartMain + paddingEndMain;
        flexLine2.mMainSize = i31;
        int flexItemCount = this.mFlexContainer.getFlexItemCount();
        boolean z12 = z11;
        FlexLine flexLine3 = flexLine2;
        int i32 = Integer.MIN_VALUE;
        int i33 = 0;
        int iCombineMeasuredStates = 0;
        int i34 = 0;
        while (i29 < flexItemCount) {
            View reorderedFlexItemAt = this.mFlexContainer.getReorderedFlexItemAt(i29);
            if (reorderedFlexItemAt == null) {
                if (isLastFlexItem(i29, flexItemCount, flexLine3)) {
                    addFlexLine(arrayList, flexLine3, i29, i33);
                }
                i17 = i31;
            } else {
                i17 = i31;
                if (reorderedFlexItemAt.getVisibility() == 8) {
                    flexLine3.mGoneItemCount++;
                    flexLine3.mItemCount++;
                    if (isLastFlexItem(i29, flexItemCount, flexLine3)) {
                        addFlexLine(arrayList, flexLine3, i29, i33);
                    }
                } else {
                    if (reorderedFlexItemAt instanceof CompoundButton) {
                        evaluateMinimumSizeForCompoundButton((CompoundButton) reorderedFlexItemAt);
                    }
                    FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                    int i35 = flexItemCount;
                    if (flexItem.getAlignSelf() == 4) {
                        flexLine3.mIndicesAlignSelfStretch.add(Integer.valueOf(i29));
                    }
                    int flexItemSizeMain = getFlexItemSizeMain(flexItem, zIsMainAxisDirectionHorizontal);
                    if (flexItem.getFlexBasisPercent() != -1.0f && mode == 1073741824) {
                        flexItemSizeMain = Math.round(size * flexItem.getFlexBasisPercent());
                    }
                    if (zIsMainAxisDirectionHorizontal) {
                        childWidthMeasureSpec = this.mFlexContainer.getChildWidthMeasureSpec(i28, i17 + getFlexItemMarginStartMain(flexItem, true) + getFlexItemMarginEndMain(flexItem, true), flexItemSizeMain);
                        i18 = i33;
                        int childHeightMeasureSpec = this.mFlexContainer.getChildHeightMeasureSpec(i12, paddingStartCross + paddingEndCross + getFlexItemMarginStartCross(flexItem, true) + getFlexItemMarginEndCross(flexItem, true) + i33, getFlexItemSizeCross(flexItem, true));
                        reorderedFlexItemAt.measure(childWidthMeasureSpec, childHeightMeasureSpec);
                        updateMeasureCache(i29, childWidthMeasureSpec, childHeightMeasureSpec, reorderedFlexItemAt);
                        i19 = 0;
                    } else {
                        i18 = i33;
                        i19 = 0;
                        int childWidthMeasureSpec2 = this.mFlexContainer.getChildWidthMeasureSpec(i12, paddingStartCross + paddingEndCross + getFlexItemMarginStartCross(flexItem, false) + getFlexItemMarginEndCross(flexItem, false) + i18, getFlexItemSizeCross(flexItem, false));
                        int childHeightMeasureSpec2 = this.mFlexContainer.getChildHeightMeasureSpec(i28, i17 + getFlexItemMarginStartMain(flexItem, false) + getFlexItemMarginEndMain(flexItem, false), flexItemSizeMain);
                        reorderedFlexItemAt.measure(childWidthMeasureSpec2, childHeightMeasureSpec2);
                        updateMeasureCache(i29, childWidthMeasureSpec2, childHeightMeasureSpec2, reorderedFlexItemAt);
                        childWidthMeasureSpec = childHeightMeasureSpec2;
                    }
                    this.mFlexContainer.updateViewCache(i29, reorderedFlexItemAt);
                    checkSizeConstraints(reorderedFlexItemAt, i29);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, reorderedFlexItemAt.getMeasuredState());
                    int i36 = i19;
                    i21 = i29;
                    int i37 = childWidthMeasureSpec;
                    FlexLine flexLine4 = flexLine3;
                    int i38 = i34;
                    i22 = i18;
                    size = size;
                    if (isWrapRequired(reorderedFlexItemAt, mode, size, flexLine3.mMainSize, getViewMeasuredSizeMain(reorderedFlexItemAt, zIsMainAxisDirectionHorizontal) + getFlexItemMarginStartMain(flexItem, zIsMainAxisDirectionHorizontal) + getFlexItemMarginEndMain(flexItem, zIsMainAxisDirectionHorizontal), flexItem, i21, i38, arrayList.size())) {
                        if (flexLine4.getItemCountNotGone() > 0) {
                            addFlexLine(arrayList, flexLine4, i21 > 0 ? i21 - 1 : i36, i22);
                            i27 = i22 + flexLine4.mCrossSize;
                        } else {
                            i27 = i22;
                        }
                        if (zIsMainAxisDirectionHorizontal) {
                            if (flexItem.getHeight() == -1) {
                                FlexContainer flexContainer = this.mFlexContainer;
                                reorderedFlexItemAt.measure(i37, flexContainer.getChildHeightMeasureSpec(i12, flexContainer.getPaddingTop() + this.mFlexContainer.getPaddingBottom() + flexItem.getMarginTop() + flexItem.getMarginBottom() + i27, flexItem.getHeight()));
                                checkSizeConstraints(reorderedFlexItemAt, i21);
                            }
                        } else if (flexItem.getWidth() == -1) {
                            FlexContainer flexContainer2 = this.mFlexContainer;
                            reorderedFlexItemAt.measure(flexContainer2.getChildWidthMeasureSpec(i12, flexContainer2.getPaddingLeft() + this.mFlexContainer.getPaddingRight() + flexItem.getMarginLeft() + flexItem.getMarginRight() + i27, flexItem.getWidth()), i37);
                            checkSizeConstraints(reorderedFlexItemAt, i21);
                        }
                        FlexLine flexLine5 = new FlexLine();
                        flexLine5.mItemCount = 1;
                        i23 = i17;
                        flexLine5.mMainSize = i23;
                        flexLine5.mFirstIndex = i21;
                        i22 = i27;
                        i25 = Integer.MIN_VALUE;
                        flexLine = flexLine5;
                        i24 = i36;
                    } else {
                        flexLine = flexLine4;
                        i23 = i17;
                        flexLine.mItemCount++;
                        i24 = i38 + 1;
                        i25 = i32;
                    }
                    flexLine.mAnyItemsHaveFlexGrow = (flexLine.mAnyItemsHaveFlexGrow ? 1 : 0) | (flexItem.getFlexGrow() != 0.0f ? 1 : i36);
                    flexLine.mAnyItemsHaveFlexShrink = (flexLine.mAnyItemsHaveFlexShrink ? 1 : 0) | (flexItem.getFlexShrink() != 0.0f ? 1 : i36);
                    int[] iArr = this.mIndexToFlexLine;
                    if (iArr != null) {
                        iArr[i21] = arrayList.size();
                    }
                    flexLine.mMainSize += getViewMeasuredSizeMain(reorderedFlexItemAt, zIsMainAxisDirectionHorizontal) + getFlexItemMarginStartMain(flexItem, zIsMainAxisDirectionHorizontal) + getFlexItemMarginEndMain(flexItem, zIsMainAxisDirectionHorizontal);
                    flexLine.mTotalFlexGrow += flexItem.getFlexGrow();
                    flexLine.mTotalFlexShrink += flexItem.getFlexShrink();
                    this.mFlexContainer.onNewFlexItemAdded(reorderedFlexItemAt, i21, i24, flexLine);
                    int iMax = Math.max(i25, getViewMeasuredSizeCross(reorderedFlexItemAt, zIsMainAxisDirectionHorizontal) + getFlexItemMarginStartCross(flexItem, zIsMainAxisDirectionHorizontal) + getFlexItemMarginEndCross(flexItem, zIsMainAxisDirectionHorizontal) + this.mFlexContainer.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    flexLine.mCrossSize = Math.max(flexLine.mCrossSize, iMax);
                    if (zIsMainAxisDirectionHorizontal) {
                        if (this.mFlexContainer.getFlexWrap() != 2) {
                            flexLine.mMaxBaseline = Math.max(flexLine.mMaxBaseline, reorderedFlexItemAt.getBaseline() + flexItem.getMarginTop());
                        } else {
                            flexLine.mMaxBaseline = Math.max(flexLine.mMaxBaseline, (reorderedFlexItemAt.getMeasuredHeight() - reorderedFlexItemAt.getBaseline()) + flexItem.getMarginBottom());
                        }
                    }
                    i26 = i35;
                    if (isLastFlexItem(i21, i26, flexLine)) {
                        addFlexLine(arrayList, flexLine, i21, i22);
                        i22 += flexLine.mCrossSize;
                    }
                    if (i15 != -1 && arrayList.size() > 0) {
                        if (arrayList.get(arrayList.size() - 1).mLastIndex >= i15 && i21 >= i15 && !z12) {
                            i22 = -flexLine.getCrossSize();
                            z12 = true;
                        }
                    }
                    if (i22 > i13 && z12) {
                        i16 = iCombineMeasuredStates;
                        flexLinesResult.mChildState = i16;
                    } else {
                        i34 = i24;
                        i32 = iMax;
                    }
                }
                flexItemCount = i26;
                i29 = i21 + 1;
                i31 = i23;
                flexLine3 = flexLine;
                i33 = i22;
                mode = mode;
                i28 = i11;
            }
            i21 = i29;
            mode = mode;
            i26 = flexItemCount;
            i22 = i33;
            i23 = i17;
            flexLine = flexLine3;
            flexItemCount = i26;
            i29 = i21 + 1;
            i31 = i23;
            flexLine3 = flexLine;
            i33 = i22;
            mode = mode;
            i28 = i11;
        }
        i16 = iCombineMeasuredStates;
        flexLinesResult.mChildState = i16;
    }

    public void calculateHorizontalFlexLines(FlexLinesResult flexLinesResult, int i11, int i12, int i13, int i14, @Nullable List<FlexLine> list) {
        calculateFlexLines(flexLinesResult, i11, i12, i13, i14, -1, list);
    }

    public void calculateVerticalFlexLines(FlexLinesResult flexLinesResult, int i11, int i12, int i13, int i14, @Nullable List<FlexLine> list) {
        calculateFlexLines(flexLinesResult, i12, i11, i13, i14, -1, list);
    }

    public void clearFlexLines(List<FlexLine> list, int i11) {
        int i12 = this.mIndexToFlexLine[i11];
        if (i12 == -1) {
            i12 = 0;
        }
        for (int size = list.size() - 1; size >= i12; size--) {
            list.remove(size);
        }
        int[] iArr = this.mIndexToFlexLine;
        int length = iArr.length - 1;
        if (i11 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i11, length, -1);
        }
        long[] jArr = this.mMeasureSpecCache;
        int length2 = jArr.length - 1;
        if (i11 > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i11, length2, 0L);
        }
    }

    public void determineCrossSize(int i11, int i12, int i13) {
        int mode;
        int size;
        int flexDirection = this.mFlexContainer.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i12);
            int size2 = View.MeasureSpec.getSize(i12);
            mode = mode2;
            size = size2;
        } else {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            mode = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
        }
        List<FlexLine> flexLinesInternal = this.mFlexContainer.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.mFlexContainer.getSumOfCrossSize() + i13;
            int i14 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).mCrossSize = size - i13;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.mFlexContainer.getAlignContent();
                if (alignContent == 1) {
                    int i15 = size - sumOfCrossSize;
                    FlexLine flexLine = new FlexLine();
                    flexLine.mCrossSize = i15;
                    flexLinesInternal.add(0, flexLine);
                    return;
                }
                if (alignContent == 2) {
                    this.mFlexContainer.setFlexLines(constructFlexLinesForAlignContentCenter(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size4 = flexLinesInternal.size();
                    float f11 = 0.0f;
                    while (i14 < size4) {
                        arrayList.add(flexLinesInternal.get(i14));
                        if (i14 != flexLinesInternal.size() - 1) {
                            FlexLine flexLine2 = new FlexLine();
                            if (i14 == flexLinesInternal.size() - 2) {
                                flexLine2.mCrossSize = Math.round(f11 + size3);
                                f11 = 0.0f;
                            } else {
                                flexLine2.mCrossSize = Math.round(size3);
                            }
                            int i16 = flexLine2.mCrossSize;
                            f11 += size3 - i16;
                            if (f11 > 1.0f) {
                                flexLine2.mCrossSize = i16 + 1;
                                f11 -= 1.0f;
                            } else if (f11 < -1.0f) {
                                flexLine2.mCrossSize = i16 - 1;
                                f11 += 1.0f;
                            }
                            arrayList.add(flexLine2);
                        }
                        i14++;
                    }
                    this.mFlexContainer.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.mFlexContainer.setFlexLines(constructFlexLinesForAlignContentCenter(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    FlexLine flexLine3 = new FlexLine();
                    flexLine3.mCrossSize = size5;
                    for (FlexLine flexLine4 : flexLinesInternal) {
                        arrayList2.add(flexLine3);
                        arrayList2.add(flexLine4);
                        arrayList2.add(flexLine3);
                    }
                    this.mFlexContainer.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f12 = 0.0f;
                    while (i14 < size7) {
                        FlexLine flexLine5 = flexLinesInternal.get(i14);
                        float f13 = flexLine5.mCrossSize + size6;
                        if (i14 == flexLinesInternal.size() - 1) {
                            f13 += f12;
                            f12 = 0.0f;
                        }
                        int iRound = Math.round(f13);
                        f12 += f13 - iRound;
                        if (f12 > 1.0f) {
                            iRound++;
                            f12 -= 1.0f;
                        } else if (f12 < -1.0f) {
                            iRound--;
                            f12 += 1.0f;
                        }
                        flexLine5.mCrossSize = iRound;
                        i14++;
                    }
                }
            }
        }
    }

    public void determineMainSize(int i11, int i12, int i13) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i14;
        int i15;
        ensureChildrenFrozen(this.mFlexContainer.getFlexItemCount());
        if (i13 >= this.mFlexContainer.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.mFlexContainer.getFlexDirection();
        int flexDirection2 = this.mFlexContainer.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
            int largestMainSize = this.mFlexContainer.getLargestMainSize();
            if (mode != 1073741824 && largestMainSize <= size) {
                size = largestMainSize;
            }
            paddingLeft = this.mFlexContainer.getPaddingLeft();
            paddingRight = this.mFlexContainer.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            int mode2 = View.MeasureSpec.getMode(i12);
            size = View.MeasureSpec.getSize(i12);
            if (mode2 != 1073741824) {
                size = this.mFlexContainer.getLargestMainSize();
            }
            paddingLeft = this.mFlexContainer.getPaddingTop();
            paddingRight = this.mFlexContainer.getPaddingBottom();
        }
        int i16 = paddingLeft + paddingRight;
        int i17 = size;
        int[] iArr = this.mIndexToFlexLine;
        int i18 = iArr != null ? iArr[i13] : 0;
        List<FlexLine> flexLinesInternal = this.mFlexContainer.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i18 < size2) {
            FlexLine flexLine = flexLinesInternal.get(i18);
            int i19 = flexLine.mMainSize;
            if (i19 >= i17 || !flexLine.mAnyItemsHaveFlexGrow) {
                i14 = i11;
                i15 = i12;
                if (i19 > i17 && flexLine.mAnyItemsHaveFlexShrink) {
                    shrinkFlexItems(i14, i15, flexLine, i17, i16, false);
                }
            } else {
                i14 = i11;
                i15 = i12;
                expandFlexItems(i14, i15, flexLine, i17, i16, false);
            }
            i18++;
            i11 = i14;
            i12 = i15;
        }
    }

    public void ensureIndexToFlexLine(int i11) {
        int[] iArr = this.mIndexToFlexLine;
        if (iArr == null) {
            if (i11 < 10) {
                i11 = 10;
            }
            this.mIndexToFlexLine = new int[i11];
        } else if (iArr.length < i11) {
            int length = iArr.length * 2;
            if (length >= i11) {
                i11 = length;
            }
            this.mIndexToFlexLine = Arrays.copyOf(iArr, i11);
        }
    }

    public void ensureMeasureSpecCache(int i11) {
        long[] jArr = this.mMeasureSpecCache;
        if (jArr == null) {
            if (i11 < 10) {
                i11 = 10;
            }
            this.mMeasureSpecCache = new long[i11];
        } else if (jArr.length < i11) {
            int length = jArr.length * 2;
            if (length >= i11) {
                i11 = length;
            }
            this.mMeasureSpecCache = Arrays.copyOf(jArr, i11);
        }
    }

    public void ensureMeasuredSizeCache(int i11) {
        long[] jArr = this.mMeasuredSizeCache;
        if (jArr == null) {
            if (i11 < 10) {
                i11 = 10;
            }
            this.mMeasuredSizeCache = new long[i11];
        } else if (jArr.length < i11) {
            int length = jArr.length * 2;
            if (length >= i11) {
                i11 = length;
            }
            this.mMeasuredSizeCache = Arrays.copyOf(jArr, i11);
        }
    }

    public int extractHigherInt(long j11) {
        return (int) (j11 >> 32);
    }

    public boolean isOrderChangedFromLastMeasurement(SparseIntArray sparseIntArray) {
        int flexItemCount = this.mFlexContainer.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i11 = 0; i11 < flexItemCount; i11++) {
            View flexItemAt = this.mFlexContainer.getFlexItemAt(i11);
            if (flexItemAt != null && ((FlexItem) flexItemAt.getLayoutParams()).getOrder() != sparseIntArray.get(i11)) {
                return true;
            }
        }
        return false;
    }

    public void stretchViews(int i11) {
        View reorderedFlexItemAt;
        if (i11 >= this.mFlexContainer.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.mFlexContainer.getFlexDirection();
        if (this.mFlexContainer.getAlignItems() != 4) {
            for (FlexLine flexLine : this.mFlexContainer.getFlexLinesInternal()) {
                for (Integer num : flexLine.mIndicesAlignSelfStretch) {
                    View reorderedFlexItemAt2 = this.mFlexContainer.getReorderedFlexItemAt(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        stretchViewVertically(reorderedFlexItemAt2, flexLine.mCrossSize, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                        }
                        stretchViewHorizontally(reorderedFlexItemAt2, flexLine.mCrossSize, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.mIndexToFlexLine;
        List<FlexLine> flexLinesInternal = this.mFlexContainer.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i12 = iArr != null ? iArr[i11] : 0; i12 < size; i12++) {
            FlexLine flexLine2 = flexLinesInternal.get(i12);
            int i13 = flexLine2.mItemCount;
            for (int i14 = 0; i14 < i13; i14++) {
                int i15 = flexLine2.mFirstIndex + i14;
                if (i14 < this.mFlexContainer.getFlexItemCount() && (reorderedFlexItemAt = this.mFlexContainer.getReorderedFlexItemAt(i15)) != null && reorderedFlexItemAt.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                    if (flexItem.getAlignSelf() == -1 || flexItem.getAlignSelf() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            stretchViewVertically(reorderedFlexItemAt, flexLine2.mCrossSize, i15);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                            }
                            stretchViewHorizontally(reorderedFlexItemAt, flexLine2.mCrossSize, i15);
                        }
                    }
                }
            }
        }
    }

    public FlexboxHelper(FlexContainer flexContainer) {
        this.mFlexContainer = flexContainer;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    private void checkSizeConstraints(View view, int i11) {
        boolean z11;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z12 = true;
        if (measuredWidth < flexItem.getMinWidth()) {
            measuredWidth = flexItem.getMinWidth();
        } else {
            if (measuredWidth > flexItem.getMaxWidth()) {
                measuredWidth = flexItem.getMaxWidth();
            } else {
                z11 = false;
            }
            if (measuredHeight < flexItem.getMinHeight()) {
                measuredHeight = flexItem.getMinHeight();
            } else if (measuredHeight > flexItem.getMaxHeight()) {
                measuredHeight = flexItem.getMaxHeight();
            } else {
                z12 = z11;
            }
            if (z12) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                updateMeasureCache(i11, iMakeMeasureSpec, iMakeMeasureSpec2, view);
                this.mFlexContainer.updateViewCache(i11, view);
            }
        }
        z11 = true;
        if (measuredHeight < flexItem.getMinHeight()) {
            measuredHeight = flexItem.getMinHeight();
        } else if (measuredHeight > flexItem.getMaxHeight()) {
            measuredHeight = flexItem.getMaxHeight();
        } else {
            z12 = z11;
        }
        if (z12) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            updateMeasureCache(i11, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
            this.mFlexContainer.updateViewCache(i11, view);
        }
    }

    private void evaluateMinimumSizeForCompoundButton(CompoundButton compoundButton) {
        int minimumWidth;
        FlexItem flexItem = (FlexItem) compoundButton.getLayoutParams();
        int minWidth = flexItem.getMinWidth();
        int minHeight = flexItem.getMinHeight();
        Drawable buttonDrawable = CompoundButtonCompat.getButtonDrawable(compoundButton);
        int minimumHeight = 0;
        if (buttonDrawable == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = buttonDrawable.getMinimumWidth();
        }
        if (buttonDrawable != null) {
            minimumHeight = buttonDrawable.getMinimumHeight();
        }
        if (minWidth == -1) {
            minWidth = minimumWidth;
        }
        flexItem.setMinWidth(minWidth);
        if (minHeight == -1) {
            minHeight = minimumHeight;
        }
        flexItem.setMinHeight(minHeight);
    }

    private int[] sortOrdersIntoReorderedIndices(int i11, List<Order> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i11];
        int i12 = 0;
        for (Order order : list) {
            int i13 = order.index;
            iArr[i12] = i13;
            sparseIntArray.append(i13, order.order);
            i12++;
        }
        return iArr;
    }

    private void stretchViewHorizontally(View view, int i11, int i12) {
        int measuredHeight;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i11 - flexItem.getMarginLeft()) - flexItem.getMarginRight()) - this.mFlexContainer.getDecorationLengthCrossAxis(view), flexItem.getMinWidth()), flexItem.getMaxWidth());
        long[] jArr = this.mMeasuredSizeCache;
        if (jArr != null) {
            measuredHeight = extractHigherInt(jArr[i12]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        updateMeasureCache(i12, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        this.mFlexContainer.updateViewCache(i12, view);
    }

    private void stretchViewVertically(View view, int i11, int i12) {
        int measuredWidth;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i11 - flexItem.getMarginTop()) - flexItem.getMarginBottom()) - this.mFlexContainer.getDecorationLengthCrossAxis(view), flexItem.getMinHeight()), flexItem.getMaxHeight());
        long[] jArr = this.mMeasuredSizeCache;
        if (jArr != null) {
            measuredWidth = extractLowerInt(jArr[i12]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        updateMeasureCache(i12, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        this.mFlexContainer.updateViewCache(i12, view);
    }

    public void layoutSingleChildHorizontal(View view, FlexLine flexLine, int i11, int i12, int i13, int i14) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.mFlexContainer.getAlignItems();
        if (flexItem.getAlignSelf() != -1) {
            alignItems = flexItem.getAlignSelf();
        }
        int i15 = flexLine.mCrossSize;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems != 2) {
                    if (alignItems != 3) {
                        if (alignItems != 4) {
                            return;
                        }
                    } else if (this.mFlexContainer.getFlexWrap() != 2) {
                        int iMax = Math.max(flexLine.mMaxBaseline - view.getBaseline(), flexItem.getMarginTop());
                        view.layout(i11, i12 + iMax, i13, i14 + iMax);
                        return;
                    } else {
                        int iMax2 = Math.max((flexLine.mMaxBaseline - view.getMeasuredHeight()) + view.getBaseline(), flexItem.getMarginBottom());
                        view.layout(i11, i12 - iMax2, i13, i14 - iMax2);
                        return;
                    }
                } else {
                    int measuredHeight = (((i15 - view.getMeasuredHeight()) + flexItem.getMarginTop()) - flexItem.getMarginBottom()) / 2;
                    if (this.mFlexContainer.getFlexWrap() != 2) {
                        int i16 = i12 + measuredHeight;
                        view.layout(i11, i16, i13, view.getMeasuredHeight() + i16);
                        return;
                    } else {
                        int i17 = i12 - measuredHeight;
                        view.layout(i11, i17, i13, view.getMeasuredHeight() + i17);
                        return;
                    }
                }
            } else if (this.mFlexContainer.getFlexWrap() != 2) {
                int i18 = i12 + i15;
                view.layout(i11, (i18 - view.getMeasuredHeight()) - flexItem.getMarginBottom(), i13, i18 - flexItem.getMarginBottom());
                return;
            } else {
                view.layout(i11, (i12 - i15) + view.getMeasuredHeight() + flexItem.getMarginTop(), i13, (i14 - i15) + view.getMeasuredHeight() + flexItem.getMarginTop());
                return;
            }
        }
        if (this.mFlexContainer.getFlexWrap() != 2) {
            view.layout(i11, i12 + flexItem.getMarginTop(), i13, i14 + flexItem.getMarginTop());
        } else {
            view.layout(i11, i12 - flexItem.getMarginBottom(), i13, i14 - flexItem.getMarginBottom());
        }
    }

    public void layoutSingleChildVertical(View view, FlexLine flexLine, boolean z11, int i11, int i12, int i13, int i14) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.mFlexContainer.getAlignItems();
        if (flexItem.getAlignSelf() != -1) {
            alignItems = flexItem.getAlignSelf();
        }
        int i15 = flexLine.mCrossSize;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems != 2) {
                    if (alignItems != 3 && alignItems != 4) {
                        return;
                    }
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int measuredWidth = (((i15 - view.getMeasuredWidth()) + MarginLayoutParamsCompat.getMarginStart(marginLayoutParams)) - MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams)) / 2;
                    if (!z11) {
                        view.layout(i11 + measuredWidth, i12, i13 + measuredWidth, i14);
                        return;
                    } else {
                        view.layout(i11 - measuredWidth, i12, i13 - measuredWidth, i14);
                        return;
                    }
                }
            } else if (!z11) {
                view.layout(((i11 + i15) - view.getMeasuredWidth()) - flexItem.getMarginRight(), i12, ((i13 + i15) - view.getMeasuredWidth()) - flexItem.getMarginRight(), i14);
                return;
            } else {
                view.layout((i11 - i15) + view.getMeasuredWidth() + flexItem.getMarginLeft(), i12, (i13 - i15) + view.getMeasuredWidth() + flexItem.getMarginLeft(), i14);
                return;
            }
        }
        if (!z11) {
            view.layout(i11 + flexItem.getMarginLeft(), i12, i13 + flexItem.getMarginLeft(), i14);
        } else {
            view.layout(i11 - flexItem.getMarginRight(), i12, i13 - flexItem.getMarginRight(), i14);
        }
    }

    public int[] createReorderedIndices(SparseIntArray sparseIntArray) {
        int flexItemCount = this.mFlexContainer.getFlexItemCount();
        return sortOrdersIntoReorderedIndices(flexItemCount, createOrders(flexItemCount), sparseIntArray);
    }
}
