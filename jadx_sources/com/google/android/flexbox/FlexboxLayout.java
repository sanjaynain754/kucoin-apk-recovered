package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes45.dex */
public class FlexboxLayout extends ViewGroup implements FlexContainer {
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    private int mAlignContent;
    private int mAlignItems;

    @Nullable
    private Drawable mDividerDrawableHorizontal;

    @Nullable
    private Drawable mDividerDrawableVertical;
    private int mDividerHorizontalHeight;
    private int mDividerVerticalWidth;
    private int mFlexDirection;
    private List<FlexLine> mFlexLines;
    private FlexboxHelper.FlexLinesResult mFlexLinesResult;
    private int mFlexWrap;
    private FlexboxHelper mFlexboxHelper;
    private int mJustifyContent;
    private int mMaxLine;
    private SparseIntArray mOrderCache;
    private int[] mReorderedIndices;
    private int mShowDividerHorizontal;
    private int mShowDividerVertical;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Parcelable.Creator<LayoutParams>() { // from class: com.google.android.flexbox.FlexboxLayout.LayoutParams.1
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
        private int mOrder;
        private boolean mWrapBefore;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7037R.styleable.FlexboxLayout_Layout);
            this.mOrder = typedArrayObtainStyledAttributes.getInt(C7037R.styleable.FlexboxLayout_Layout_layout_order, 1);
            this.mFlexGrow = typedArrayObtainStyledAttributes.getFloat(C7037R.styleable.FlexboxLayout_Layout_layout_flexGrow, 0.0f);
            this.mFlexShrink = typedArrayObtainStyledAttributes.getFloat(C7037R.styleable.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.mAlignSelf = typedArrayObtainStyledAttributes.getInt(C7037R.styleable.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.mFlexBasisPercent = typedArrayObtainStyledAttributes.getFraction(C7037R.styleable.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7037R.styleable.FlexboxLayout_Layout_layout_minWidth, -1);
            this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7037R.styleable.FlexboxLayout_Layout_layout_minHeight, -1);
            this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7037R.styleable.FlexboxLayout_Layout_layout_maxWidth, 16777215);
            this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7037R.styleable.FlexboxLayout_Layout_layout_maxHeight, 16777215);
            this.mWrapBefore = typedArrayObtainStyledAttributes.getBoolean(C7037R.styleable.FlexboxLayout_Layout_layout_wrapBefore, false);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
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
        public int getOrder() {
            return this.mOrder;
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
            this.mOrder = i11;
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
            parcel.writeInt(this.mOrder);
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

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
            this.mOrder = layoutParams.mOrder;
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

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(int i11, int i12) {
            super(new ViewGroup.LayoutParams(i11, i12));
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(Parcel parcel) {
            super(0, 0);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
            this.mOrder = parcel.readInt();
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

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    private boolean allFlexLinesAreDummyBefore(int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.mFlexLines.get(i12).getItemCountNotGone() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean allViewsAreGoneBefore(int i11, int i12) {
        for (int i13 = 1; i13 <= i12; i13++) {
            View reorderedChildAt = getReorderedChildAt(i11 - i13);
            if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private boolean hasDividerBeforeFlexLine(int i11) {
        if (i11 >= 0 && i11 < this.mFlexLines.size()) {
            if (allFlexLinesAreDummyBefore(i11)) {
                if (isMainAxisDirectionHorizontal()) {
                    return (this.mShowDividerHorizontal & 1) != 0;
                }
                return (this.mShowDividerVertical & 1) != 0;
            }
            if (isMainAxisDirectionHorizontal()) {
                return (this.mShowDividerHorizontal & 2) != 0;
            }
            if ((this.mShowDividerVertical & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean hasEndDividerAfterFlexLine(int i11) {
        if (i11 >= 0 && i11 < this.mFlexLines.size()) {
            for (int i12 = i11 + 1; i12 < this.mFlexLines.size(); i12++) {
                if (this.mFlexLines.get(i12).getItemCountNotGone() > 0) {
                    return false;
                }
            }
            if (isMainAxisDirectionHorizontal()) {
                return (this.mShowDividerHorizontal & 4) != 0;
            }
            if ((this.mShowDividerVertical & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getDecorationLengthCrossAxis(View view) {
        return 0;
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void drawHorizontalDivider(Canvas canvas, int i11, int i12, int i13) {
        Drawable drawable = this.mDividerDrawableHorizontal;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i11, i12, i13 + i11, this.mDividerHorizontalHeight + i12);
        this.mDividerDrawableHorizontal.draw(canvas);
    }

    private void drawVerticalDivider(Canvas canvas, int i11, int i12, int i13) {
        Drawable drawable = this.mDividerDrawableVertical;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i11, i12, this.mDividerVerticalWidth + i11, i13 + i12);
        this.mDividerDrawableVertical.draw(canvas);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:49:0x010b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0115  */
    /* JADX WARN: Code duplicated, block: B:57:0x0129  */
    /* JADX WARN: Code duplicated, block: B:60:0x012f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0131  */
    /* JADX WARN: Code duplicated, block: B:63:0x0157  */
    /* JADX WARN: Code duplicated, block: B:64:0x0179  */
    /* JADX WARN: Code duplicated, block: B:66:0x0185  */
    /* JADX WARN: Code duplicated, block: B:67:0x019f  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:72:0x01de  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ef  */
    private void layoutHorizontal(boolean z11, int i11, int i12, int i13, int i14) {
        float measuredWidth;
        float f11;
        float f12;
        float fMax;
        int i15;
        int i16;
        View reorderedChildAt;
        boolean z12;
        int i17;
        int i18;
        float f13;
        float f14;
        int i19;
        float f15;
        int i21;
        View view;
        FlexLine flexLine;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i22 = i13 - i11;
        int paddingBottom = (i14 - i12) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.mFlexLines.size();
        for (int i23 = 0; i23 < size; i23++) {
            FlexLine flexLine2 = this.mFlexLines.get(i23);
            if (hasDividerBeforeFlexLine(i23)) {
                int i24 = this.mDividerHorizontalHeight;
                paddingBottom -= i24;
                paddingTop += i24;
            }
            int i25 = paddingBottom;
            int i26 = this.mJustifyContent;
            char c11 = 4;
            int i27 = 2;
            boolean z13 = true;
            if (i26 == 0) {
                measuredWidth = paddingLeft;
                f11 = i22 - paddingRight;
            } else if (i26 != 1) {
                if (i26 == 2) {
                    int i28 = flexLine2.mMainSize;
                    measuredWidth = paddingLeft + ((i22 - i28) / 2.0f);
                    f11 = (i22 - paddingRight) - ((i22 - i28) / 2.0f);
                } else if (i26 == 3) {
                    measuredWidth = paddingLeft;
                    int itemCountNotGone = flexLine2.getItemCountNotGone();
                    f12 = (i22 - flexLine2.mMainSize) / (itemCountNotGone != 1 ? itemCountNotGone - 1 : 1.0f);
                    f11 = i22 - paddingRight;
                } else if (i26 == 4) {
                    int itemCountNotGone2 = flexLine2.getItemCountNotGone();
                    float f16 = itemCountNotGone2 != 0 ? (i22 - flexLine2.mMainSize) / itemCountNotGone2 : 0.0f;
                    float f17 = f16 / 2.0f;
                    measuredWidth = paddingLeft + f17;
                    float f18 = (i22 - paddingRight) - f17;
                    f12 = f16;
                    f11 = f18;
                } else {
                    if (i26 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.mJustifyContent);
                    }
                    int itemCountNotGone3 = flexLine2.getItemCountNotGone();
                    f12 = itemCountNotGone3 != 0 ? (i22 - flexLine2.mMainSize) / (itemCountNotGone3 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f12;
                    f11 = (i22 - paddingRight) - f12;
                }
                fMax = Math.max(f12, 0.0f);
                i15 = 0;
                while (i15 < flexLine2.mItemCount) {
                    i16 = flexLine2.mFirstIndex + i15;
                    reorderedChildAt = getReorderedChildAt(i16);
                    char c12 = c11;
                    if (reorderedChildAt != null) {
                        z12 = z13;
                        if (reorderedChildAt.getVisibility() == 8) {
                            z12 = z12;
                        } else {
                            LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                            f13 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                            f14 = f11 - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            if (hasDividerBeforeChildAtAlongMainAxis(i16, i15)) {
                                int i29 = this.mDividerVerticalWidth;
                                float f19 = i29;
                                f13 += f19;
                                f14 -= f19;
                                i19 = i29;
                            } else {
                                i19 = 0;
                            }
                            f15 = f14;
                            if (i15 == flexLine2.mItemCount - 1 || (this.mShowDividerVertical & 4) <= 0) {
                                i21 = 0;
                            } else {
                                i21 = this.mDividerVerticalWidth;
                            }
                            if (this.mFlexWrap == i27) {
                                if (z11) {
                                    i18 = i27;
                                    view = reorderedChildAt;
                                    this.mFlexboxHelper.layoutSingleChildHorizontal(view, flexLine2, Math.round(f15) - reorderedChildAt.getMeasuredWidth(), i25 - reorderedChildAt.getMeasuredHeight(), Math.round(f15), i25);
                                } else {
                                    i18 = i27;
                                    view = reorderedChildAt;
                                    this.mFlexboxHelper.layoutSingleChildHorizontal(view, flexLine2, Math.round(f13), i25 - view.getMeasuredHeight(), Math.round(f13) + view.getMeasuredWidth(), i25);
                                }
                                i17 = i25;
                            } else {
                                i18 = i27;
                                i15 = i15;
                                i17 = i25;
                                view = reorderedChildAt;
                                z12 = z12;
                                if (z11) {
                                    this.mFlexboxHelper.layoutSingleChildHorizontal(view, flexLine2, Math.round(f15) - view.getMeasuredWidth(), paddingTop, Math.round(f15), paddingTop + view.getMeasuredHeight());
                                } else {
                                    int i31 = paddingTop;
                                    this.mFlexboxHelper.layoutSingleChildHorizontal(view, flexLine2, Math.round(f13), i31, view.getMeasuredWidth() + Math.round(f13), i31 + view.getMeasuredHeight());
                                    paddingTop = i31;
                                }
                            }
                            measuredWidth = f13 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            float measuredWidth2 = f15 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
                            if (z11) {
                                flexLine = flexLine2;
                                flexLine.updatePositionFromView(view, i21, 0, i19, 0);
                            } else {
                                flexLine = flexLine2;
                                flexLine.updatePositionFromView(view, i19, 0, i21, 0);
                            }
                            flexLine2 = flexLine;
                            f11 = measuredWidth2;
                        }
                        i15++;
                        c11 = c12;
                        z13 = z12;
                        i27 = i18;
                        i25 = i17;
                    } else {
                        z12 = z13;
                    }
                    i18 = i27;
                    i15 = i15;
                    i17 = i25;
                    i15++;
                    c11 = c12;
                    z13 = z12;
                    i27 = i18;
                    i25 = i17;
                }
                int i32 = flexLine2.mCrossSize;
                paddingTop += i32;
                paddingBottom = i25 - i32;
            } else {
                int i33 = flexLine2.mMainSize;
                f11 = i33 - paddingLeft;
                measuredWidth = (i22 - i33) + paddingRight;
            }
            f12 = 0.0f;
            fMax = Math.max(f12, 0.0f);
            i15 = 0;
            while (i15 < flexLine2.mItemCount) {
                i16 = flexLine2.mFirstIndex + i15;
                reorderedChildAt = getReorderedChildAt(i16);
                char c13 = c11;
                if (reorderedChildAt != null) {
                    z12 = z13;
                    if (reorderedChildAt.getVisibility() == 8) {
                        z12 = z12;
                    } else {
                        LayoutParams layoutParams2 = (LayoutParams) reorderedChildAt.getLayoutParams();
                        f13 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                        f14 = f11 - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        if (hasDividerBeforeChildAtAlongMainAxis(i16, i15)) {
                            int i210 = this.mDividerVerticalWidth;
                            float f110 = i210;
                            f13 += f110;
                            f14 -= f110;
                            i19 = i210;
                        } else {
                            i19 = 0;
                        }
                        f15 = f14;
                        if (i15 == flexLine2.mItemCount - 1) {
                            i21 = 0;
                        } else {
                            i21 = 0;
                        }
                        if (this.mFlexWrap == i27) {
                            if (z11) {
                                i18 = i27;
                                view = reorderedChildAt;
                                this.mFlexboxHelper.layoutSingleChildHorizontal(view, flexLine2, Math.round(f15) - reorderedChildAt.getMeasuredWidth(), i25 - reorderedChildAt.getMeasuredHeight(), Math.round(f15), i25);
                            } else {
                                i18 = i27;
                                view = reorderedChildAt;
                                this.mFlexboxHelper.layoutSingleChildHorizontal(view, flexLine2, Math.round(f13), i25 - view.getMeasuredHeight(), Math.round(f13) + view.getMeasuredWidth(), i25);
                            }
                            i17 = i25;
                        } else {
                            i18 = i27;
                            i15 = i15;
                            i17 = i25;
                            view = reorderedChildAt;
                            z12 = z12;
                            if (z11) {
                                this.mFlexboxHelper.layoutSingleChildHorizontal(view, flexLine2, Math.round(f15) - view.getMeasuredWidth(), paddingTop, Math.round(f15), paddingTop + view.getMeasuredHeight());
                            } else {
                                int i34 = paddingTop;
                                this.mFlexboxHelper.layoutSingleChildHorizontal(view, flexLine2, Math.round(f13), i34, view.getMeasuredWidth() + Math.round(f13), i34 + view.getMeasuredHeight());
                                paddingTop = i34;
                            }
                        }
                        measuredWidth = f13 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        float measuredWidth3 = f15 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
                        if (z11) {
                            flexLine = flexLine2;
                            flexLine.updatePositionFromView(view, i21, 0, i19, 0);
                        } else {
                            flexLine = flexLine2;
                            flexLine.updatePositionFromView(view, i19, 0, i21, 0);
                        }
                        flexLine2 = flexLine;
                        f11 = measuredWidth3;
                    }
                    i15++;
                    c11 = c13;
                    z13 = z12;
                    i27 = i18;
                    i25 = i17;
                } else {
                    z12 = z13;
                }
                i18 = i27;
                i15 = i15;
                i17 = i25;
                i15++;
                c11 = c13;
                z13 = z12;
                i27 = i18;
                i25 = i17;
            }
            int i35 = flexLine2.mCrossSize;
            paddingTop += i35;
            paddingBottom = i25 - i35;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:48:0x0109  */
    /* JADX WARN: Code duplicated, block: B:50:0x0111  */
    /* JADX WARN: Code duplicated, block: B:56:0x0123  */
    /* JADX WARN: Code duplicated, block: B:58:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0129  */
    /* JADX WARN: Code duplicated, block: B:61:0x014d  */
    /* JADX WARN: Code duplicated, block: B:62:0x016c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0174  */
    /* JADX WARN: Code duplicated, block: B:65:0x0190  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:72:0x01df  */
    private void layoutVertical(boolean z11, boolean z12, int i11, int i12, int i13, int i14) {
        float measuredHeight;
        float f11;
        float f12;
        float fMax;
        int i15;
        int i16;
        int i17;
        View reorderedChildAt;
        char c11;
        int i18;
        int i19;
        float f13;
        float f14;
        int i21;
        float f15;
        int i22;
        FlexLine flexLine;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i23 = i14 - i12;
        int i24 = (i13 - i11) - paddingRight;
        int size = this.mFlexLines.size();
        for (int i25 = 0; i25 < size; i25++) {
            FlexLine flexLine2 = this.mFlexLines.get(i25);
            if (hasDividerBeforeFlexLine(i25)) {
                int i26 = this.mDividerVerticalWidth;
                paddingLeft += i26;
                i24 -= i26;
            }
            int i27 = i24;
            int i28 = this.mJustifyContent;
            char c12 = 4;
            int i29 = 1;
            if (i28 == 0) {
                measuredHeight = paddingTop;
                f11 = i23 - paddingBottom;
            } else if (i28 != 1) {
                if (i28 == 2) {
                    int i31 = flexLine2.mMainSize;
                    measuredHeight = paddingTop + ((i23 - i31) / 2.0f);
                    f11 = (i23 - paddingBottom) - ((i23 - i31) / 2.0f);
                } else if (i28 == 3) {
                    measuredHeight = paddingTop;
                    int itemCountNotGone = flexLine2.getItemCountNotGone();
                    f12 = (i23 - flexLine2.mMainSize) / (itemCountNotGone != 1 ? itemCountNotGone - 1 : 1.0f);
                    f11 = i23 - paddingBottom;
                } else if (i28 == 4) {
                    int itemCountNotGone2 = flexLine2.getItemCountNotGone();
                    f12 = itemCountNotGone2 != 0 ? (i23 - flexLine2.mMainSize) / itemCountNotGone2 : 0.0f;
                    float f16 = f12 / 2.0f;
                    measuredHeight = paddingTop + f16;
                    f11 = (i23 - paddingBottom) - f16;
                } else {
                    if (i28 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.mJustifyContent);
                    }
                    int itemCountNotGone3 = flexLine2.getItemCountNotGone();
                    f12 = itemCountNotGone3 != 0 ? (i23 - flexLine2.mMainSize) / (itemCountNotGone3 + 1) : 0.0f;
                    measuredHeight = paddingTop + f12;
                    f11 = (i23 - paddingBottom) - f12;
                }
                fMax = Math.max(f12, 0.0f);
                i15 = 0;
                while (i15 < flexLine2.mItemCount) {
                    i16 = flexLine2.mFirstIndex + i15;
                    i17 = i29;
                    reorderedChildAt = getReorderedChildAt(i16);
                    if (reorderedChildAt != null) {
                        c11 = c12;
                        if (reorderedChildAt.getVisibility() == 8) {
                            LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                            f13 = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                            f14 = f11 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (hasDividerBeforeChildAtAlongMainAxis(i16, i15)) {
                                i21 = this.mDividerHorizontalHeight;
                                float f17 = i21;
                                f13 += f17;
                                f14 -= f17;
                            } else {
                                i21 = 0;
                            }
                            f15 = f14;
                            if (i15 == flexLine2.mItemCount - i17 || (this.mShowDividerHorizontal & 4) <= 0) {
                                i22 = 0;
                            } else {
                                i22 = this.mDividerHorizontalHeight;
                            }
                            if (z11) {
                                if (z12) {
                                    i19 = i15;
                                    this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, true, i27 - reorderedChildAt.getMeasuredWidth(), Math.round(f15) - reorderedChildAt.getMeasuredHeight(), i27, Math.round(f15));
                                } else {
                                    i19 = i15;
                                    this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, true, i27 - reorderedChildAt.getMeasuredWidth(), Math.round(f13), i27, Math.round(f13) + reorderedChildAt.getMeasuredHeight());
                                }
                                i18 = i27;
                            } else {
                                i19 = i15;
                                i17 = i17;
                                i18 = i27;
                                if (z12) {
                                    this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, false, paddingLeft, Math.round(f15) - reorderedChildAt.getMeasuredHeight(), paddingLeft + reorderedChildAt.getMeasuredWidth(), Math.round(f15));
                                } else {
                                    int i32 = paddingLeft;
                                    this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, false, i32, Math.round(f13), i32 + reorderedChildAt.getMeasuredWidth(), Math.round(f13) + reorderedChildAt.getMeasuredHeight());
                                    paddingLeft = i32;
                                }
                            }
                            measuredHeight = f13 + reorderedChildAt.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            float measuredHeight2 = f15 - ((reorderedChildAt.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                            if (z12) {
                                flexLine = flexLine2;
                                flexLine.updatePositionFromView(reorderedChildAt, 0, i22, 0, i21);
                            } else {
                                flexLine = flexLine2;
                                flexLine.updatePositionFromView(reorderedChildAt, 0, i21, 0, i22);
                            }
                            flexLine2 = flexLine;
                            f11 = measuredHeight2;
                        }
                        i15 = i19 + 1;
                        c12 = c11;
                        i29 = i17;
                        i27 = i18;
                    } else {
                        c11 = c12;
                    }
                    i19 = i15;
                    i17 = i17;
                    i18 = i27;
                    i15 = i19 + 1;
                    c12 = c11;
                    i29 = i17;
                    i27 = i18;
                }
                int i33 = flexLine2.mCrossSize;
                paddingLeft += i33;
                i24 = i27 - i33;
            } else {
                int i34 = flexLine2.mMainSize;
                f11 = i34 - paddingTop;
                measuredHeight = (i23 - i34) + paddingBottom;
            }
            f12 = 0.0f;
            fMax = Math.max(f12, 0.0f);
            i15 = 0;
            while (i15 < flexLine2.mItemCount) {
                i16 = flexLine2.mFirstIndex + i15;
                i17 = i29;
                reorderedChildAt = getReorderedChildAt(i16);
                if (reorderedChildAt != null) {
                    c11 = c12;
                    if (reorderedChildAt.getVisibility() == 8) {
                        LayoutParams layoutParams2 = (LayoutParams) reorderedChildAt.getLayoutParams();
                        f13 = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                        f14 = f11 - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        if (hasDividerBeforeChildAtAlongMainAxis(i16, i15)) {
                            i21 = this.mDividerHorizontalHeight;
                            float f18 = i21;
                            f13 += f18;
                            f14 -= f18;
                        } else {
                            i21 = 0;
                        }
                        f15 = f14;
                        if (i15 == flexLine2.mItemCount - i17) {
                            i22 = 0;
                        } else {
                            i22 = 0;
                        }
                        if (z11) {
                            if (z12) {
                                i19 = i15;
                                this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, true, i27 - reorderedChildAt.getMeasuredWidth(), Math.round(f15) - reorderedChildAt.getMeasuredHeight(), i27, Math.round(f15));
                            } else {
                                i19 = i15;
                                this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, true, i27 - reorderedChildAt.getMeasuredWidth(), Math.round(f13), i27, Math.round(f13) + reorderedChildAt.getMeasuredHeight());
                            }
                            i18 = i27;
                        } else {
                            i19 = i15;
                            i17 = i17;
                            i18 = i27;
                            if (z12) {
                                this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, false, paddingLeft, Math.round(f15) - reorderedChildAt.getMeasuredHeight(), paddingLeft + reorderedChildAt.getMeasuredWidth(), Math.round(f15));
                            } else {
                                int i35 = paddingLeft;
                                this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, false, i35, Math.round(f13), i35 + reorderedChildAt.getMeasuredWidth(), Math.round(f13) + reorderedChildAt.getMeasuredHeight());
                                paddingLeft = i35;
                            }
                        }
                        measuredHeight = f13 + reorderedChildAt.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        float measuredHeight3 = f15 - ((reorderedChildAt.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin);
                        if (z12) {
                            flexLine = flexLine2;
                            flexLine.updatePositionFromView(reorderedChildAt, 0, i22, 0, i21);
                        } else {
                            flexLine = flexLine2;
                            flexLine.updatePositionFromView(reorderedChildAt, 0, i21, 0, i22);
                        }
                        flexLine2 = flexLine;
                        f11 = measuredHeight3;
                    }
                    i15 = i19 + 1;
                    c12 = c11;
                    i29 = i17;
                    i27 = i18;
                } else {
                    c11 = c12;
                }
                i19 = i15;
                i17 = i17;
                i18 = i27;
                i15 = i19 + 1;
                c12 = c11;
                i29 = i17;
                i27 = i18;
            }
            int i36 = flexLine2.mCrossSize;
            paddingLeft += i36;
            i24 = i27 - i36;
        }
    }

    private void measureHorizontal(int i11, int i12) {
        this.mFlexLines.clear();
        this.mFlexLinesResult.reset();
        this.mFlexboxHelper.calculateHorizontalFlexLines(this.mFlexLinesResult, i11, i12);
        this.mFlexLines = this.mFlexLinesResult.mFlexLines;
        this.mFlexboxHelper.determineMainSize(i11, i12);
        if (this.mAlignItems == 3) {
            for (FlexLine flexLine : this.mFlexLines) {
                int iMax = Integer.MIN_VALUE;
                for (int i13 = 0; i13 < flexLine.mItemCount; i13++) {
                    View reorderedChildAt = getReorderedChildAt(flexLine.mFirstIndex + i13);
                    if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                        iMax = this.mFlexWrap != 2 ? Math.max(iMax, reorderedChildAt.getMeasuredHeight() + Math.max(flexLine.mMaxBaseline - reorderedChildAt.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(iMax, reorderedChildAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max((flexLine.mMaxBaseline - reorderedChildAt.getMeasuredHeight()) + reorderedChildAt.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                    }
                }
                flexLine.mCrossSize = iMax;
            }
        }
        this.mFlexboxHelper.determineCrossSize(i11, i12, getPaddingTop() + getPaddingBottom());
        this.mFlexboxHelper.stretchViews();
        setMeasuredDimensionForFlex(this.mFlexDirection, i11, i12, this.mFlexLinesResult.mChildState);
    }

    private void measureVertical(int i11, int i12) {
        this.mFlexLines.clear();
        this.mFlexLinesResult.reset();
        this.mFlexboxHelper.calculateVerticalFlexLines(this.mFlexLinesResult, i11, i12);
        this.mFlexLines = this.mFlexLinesResult.mFlexLines;
        this.mFlexboxHelper.determineMainSize(i11, i12);
        this.mFlexboxHelper.determineCrossSize(i11, i12, getPaddingLeft() + getPaddingRight());
        this.mFlexboxHelper.stretchViews();
        setMeasuredDimensionForFlex(this.mFlexDirection, i11, i12, this.mFlexLinesResult.mChildState);
    }

    private void setWillNotDrawFlag() {
        if (this.mDividerDrawableHorizontal == null && this.mDividerDrawableVertical == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (this.mOrderCache == null) {
            this.mOrderCache = new SparseIntArray(getChildCount());
        }
        this.mReorderedIndices = this.mFlexboxHelper.createReorderedIndices(view, i11, layoutParams, this.mOrderCache);
        super.addView(view, i11, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getAlignContent() {
        return this.mAlignContent;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getAlignItems() {
        return this.mAlignItems;
    }

    @Nullable
    public Drawable getDividerDrawableHorizontal() {
        return this.mDividerDrawableHorizontal;
    }

    @Nullable
    public Drawable getDividerDrawableVertical() {
        return this.mDividerDrawableVertical;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexDirection() {
        return this.mFlexDirection;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public List<FlexLine> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.mFlexLines.size());
        for (FlexLine flexLine : this.mFlexLines) {
            if (flexLine.getItemCountNotGone() != 0) {
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
        Iterator<FlexLine> it = this.mFlexLines.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().mMainSize);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getMaxLine() {
        return this.mMaxLine;
    }

    public View getReorderedChildAt(int i11) {
        if (i11 < 0) {
            return null;
        }
        int[] iArr = this.mReorderedIndices;
        if (i11 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i11]);
    }

    public int getShowDividerHorizontal() {
        return this.mShowDividerHorizontal;
    }

    public int getShowDividerVertical() {
        return this.mShowDividerVertical;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getSumOfCrossSize() {
        int size = this.mFlexLines.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            FlexLine flexLine = this.mFlexLines.get(i12);
            if (hasDividerBeforeFlexLine(i12)) {
                i11 += isMainAxisDirectionHorizontal() ? this.mDividerHorizontalHeight : this.mDividerVerticalWidth;
            }
            if (hasEndDividerAfterFlexLine(i12)) {
                i11 += isMainAxisDirectionHorizontal() ? this.mDividerHorizontalHeight : this.mDividerVerticalWidth;
            }
            i11 += flexLine.mCrossSize;
        }
        return i11;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public boolean isMainAxisDirectionHorizontal() {
        int i11 = this.mFlexDirection;
        return i11 == 0 || i11 == 1;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mDividerDrawableVertical == null && this.mDividerDrawableHorizontal == null) {
            return;
        }
        if (this.mShowDividerHorizontal == 0 && this.mShowDividerVertical == 0) {
            return;
        }
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int i11 = this.mFlexDirection;
        if (i11 == 0) {
            drawDividersHorizontal(canvas, layoutDirection == 1, this.mFlexWrap == 2);
            return;
        }
        if (i11 == 1) {
            drawDividersHorizontal(canvas, layoutDirection != 1, this.mFlexWrap == 2);
            return;
        }
        if (i11 == 2) {
            boolean z11 = layoutDirection == 1;
            if (this.mFlexWrap == 2) {
                z11 = !z11;
            }
            drawDividersVertical(canvas, z11, false);
            return;
        }
        if (i11 != 3) {
            return;
        }
        boolean z12 = layoutDirection == 1;
        if (this.mFlexWrap == 2) {
            z12 = !z12;
        }
        drawDividersVertical(canvas, z12, true);
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        if (this.mOrderCache == null) {
            this.mOrderCache = new SparseIntArray(getChildCount());
        }
        if (this.mFlexboxHelper.isOrderChangedFromLastMeasurement(this.mOrderCache)) {
            this.mReorderedIndices = this.mFlexboxHelper.createReorderedIndices(this.mOrderCache);
        }
        int i13 = this.mFlexDirection;
        if (i13 == 0 || i13 == 1) {
            measureHorizontal(i11, i12);
            return;
        }
        if (i13 == 2 || i13 == 3) {
            measureVertical(i11, i12);
            return;
        }
        throw new IllegalStateException("Invalid value for the flex direction is set: " + this.mFlexDirection);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setAlignContent(int i11) {
        if (this.mAlignContent != i11) {
            this.mAlignContent = i11;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setAlignItems(int i11) {
        if (this.mAlignItems != i11) {
            this.mAlignItems = i11;
            requestLayout();
        }
    }

    public void setDividerDrawableHorizontal(@Nullable Drawable drawable) {
        if (drawable == this.mDividerDrawableHorizontal) {
            return;
        }
        this.mDividerDrawableHorizontal = drawable;
        if (drawable != null) {
            this.mDividerHorizontalHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerHorizontalHeight = 0;
        }
        setWillNotDrawFlag();
        requestLayout();
    }

    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
        if (drawable == this.mDividerDrawableVertical) {
            return;
        }
        this.mDividerDrawableVertical = drawable;
        if (drawable != null) {
            this.mDividerVerticalWidth = drawable.getIntrinsicWidth();
        } else {
            this.mDividerVerticalWidth = 0;
        }
        setWillNotDrawFlag();
        requestLayout();
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexDirection(int i11) {
        if (this.mFlexDirection != i11) {
            this.mFlexDirection = i11;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexLines(List<FlexLine> list) {
        this.mFlexLines = list;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexWrap(int i11) {
        if (this.mFlexWrap != i11) {
            this.mFlexWrap = i11;
            requestLayout();
        }
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

    public void setShowDividerHorizontal(int i11) {
        if (i11 != this.mShowDividerHorizontal) {
            this.mShowDividerHorizontal = i11;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i11) {
        if (i11 != this.mShowDividerVertical) {
            this.mShowDividerVertical = i11;
            requestLayout();
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mMaxLine = -1;
        this.mFlexboxHelper = new FlexboxHelper(this);
        this.mFlexLines = new ArrayList();
        this.mFlexLinesResult = new FlexboxHelper.FlexLinesResult();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7037R.styleable.FlexboxLayout, i11, 0);
        this.mFlexDirection = typedArrayObtainStyledAttributes.getInt(C7037R.styleable.FlexboxLayout_flexDirection, 0);
        this.mFlexWrap = typedArrayObtainStyledAttributes.getInt(C7037R.styleable.FlexboxLayout_flexWrap, 0);
        this.mJustifyContent = typedArrayObtainStyledAttributes.getInt(C7037R.styleable.FlexboxLayout_justifyContent, 0);
        this.mAlignItems = typedArrayObtainStyledAttributes.getInt(C7037R.styleable.FlexboxLayout_alignItems, 0);
        this.mAlignContent = typedArrayObtainStyledAttributes.getInt(C7037R.styleable.FlexboxLayout_alignContent, 0);
        this.mMaxLine = typedArrayObtainStyledAttributes.getInt(C7037R.styleable.FlexboxLayout_maxLine, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C7037R.styleable.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(C7037R.styleable.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(C7037R.styleable.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i12 = typedArrayObtainStyledAttributes.getInt(C7037R.styleable.FlexboxLayout_showDivider, 0);
        if (i12 != 0) {
            this.mShowDividerVertical = i12;
            this.mShowDividerHorizontal = i12;
        }
        int i13 = typedArrayObtainStyledAttributes.getInt(C7037R.styleable.FlexboxLayout_showDividerVertical, 0);
        if (i13 != 0) {
            this.mShowDividerVertical = i13;
        }
        int i14 = typedArrayObtainStyledAttributes.getInt(C7037R.styleable.FlexboxLayout_showDividerHorizontal, 0);
        if (i14 != 0) {
            this.mShowDividerHorizontal = i14;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void drawDividersHorizontal(Canvas canvas, boolean z11, boolean z12) {
        int i11;
        int i12;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.mFlexLines.size();
        for (int i13 = 0; i13 < size; i13++) {
            FlexLine flexLine = this.mFlexLines.get(i13);
            for (int i14 = 0; i14 < flexLine.mItemCount; i14++) {
                int i15 = flexLine.mFirstIndex + i14;
                View reorderedChildAt = getReorderedChildAt(i15);
                if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                    if (hasDividerBeforeChildAtAlongMainAxis(i15, i14)) {
                        if (z11) {
                            left = reorderedChildAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        } else {
                            left = (reorderedChildAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.mDividerVerticalWidth;
                        }
                        drawVerticalDivider(canvas, left, flexLine.mTop, flexLine.mCrossSize);
                    }
                    if (i14 == flexLine.mItemCount - 1 && (this.mShowDividerVertical & 4) > 0) {
                        if (z11) {
                            right = (reorderedChildAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.mDividerVerticalWidth;
                        } else {
                            right = reorderedChildAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        }
                        drawVerticalDivider(canvas, right, flexLine.mTop, flexLine.mCrossSize);
                    }
                }
            }
            if (hasDividerBeforeFlexLine(i13)) {
                if (z12) {
                    i12 = flexLine.mBottom;
                } else {
                    i12 = flexLine.mTop - this.mDividerHorizontalHeight;
                }
                drawHorizontalDivider(canvas, paddingLeft, i12, iMax);
            }
            if (hasEndDividerAfterFlexLine(i13) && (this.mShowDividerHorizontal & 4) > 0) {
                if (z12) {
                    i11 = flexLine.mTop - this.mDividerHorizontalHeight;
                } else {
                    i11 = flexLine.mBottom;
                }
                drawHorizontalDivider(canvas, paddingLeft, i11, iMax);
            }
        }
    }

    private void drawDividersVertical(Canvas canvas, boolean z11, boolean z12) {
        int i11;
        int i12;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.mFlexLines.size();
        for (int i13 = 0; i13 < size; i13++) {
            FlexLine flexLine = this.mFlexLines.get(i13);
            for (int i14 = 0; i14 < flexLine.mItemCount; i14++) {
                int i15 = flexLine.mFirstIndex + i14;
                View reorderedChildAt = getReorderedChildAt(i15);
                if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                    if (hasDividerBeforeChildAtAlongMainAxis(i15, i14)) {
                        if (z12) {
                            top = reorderedChildAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        } else {
                            top = (reorderedChildAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.mDividerHorizontalHeight;
                        }
                        drawHorizontalDivider(canvas, flexLine.mLeft, top, flexLine.mCrossSize);
                    }
                    if (i14 == flexLine.mItemCount - 1 && (this.mShowDividerHorizontal & 4) > 0) {
                        if (z12) {
                            bottom = (reorderedChildAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.mDividerHorizontalHeight;
                        } else {
                            bottom = reorderedChildAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        }
                        drawHorizontalDivider(canvas, flexLine.mLeft, bottom, flexLine.mCrossSize);
                    }
                }
            }
            if (hasDividerBeforeFlexLine(i13)) {
                if (z11) {
                    i12 = flexLine.mRight;
                } else {
                    i12 = flexLine.mLeft - this.mDividerVerticalWidth;
                }
                drawVerticalDivider(canvas, i12, paddingTop, iMax);
            }
            if (hasEndDividerAfterFlexLine(i13) && (this.mShowDividerVertical & 4) > 0) {
                if (z11) {
                    i11 = flexLine.mLeft - this.mDividerVerticalWidth;
                } else {
                    i11 = flexLine.mRight;
                }
                drawVerticalDivider(canvas, i11, paddingTop, iMax);
            }
        }
    }

    private boolean hasDividerBeforeChildAtAlongMainAxis(int i11, int i12) {
        if (allViewsAreGoneBefore(i11, i12)) {
            if (isMainAxisDirectionHorizontal()) {
                if ((this.mShowDividerVertical & 1) == 0) {
                    return false;
                }
                return true;
            }
            if ((this.mShowDividerHorizontal & 1) == 0) {
                return false;
            }
            return true;
        }
        if (isMainAxisDirectionHorizontal()) {
            if ((this.mShowDividerVertical & 2) == 0) {
                return false;
            }
            return true;
        }
        if ((this.mShowDividerHorizontal & 2) == 0) {
            return false;
        }
        return true;
    }

    private void setMeasuredDimensionForFlex(int i11, int i12, int i13, int i14) {
        int sumOfCrossSize;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i13);
        int size2 = View.MeasureSpec.getSize(i13);
        if (i11 != 0 && i11 != 1) {
            if (i11 != 2 && i11 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + i11);
            }
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        } else {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    if (size < largestMainSize) {
                        i14 = View.combineMeasuredStates(i14, 16777216);
                    }
                    iResolveSizeAndState = View.resolveSizeAndState(size, i12, i14);
                } else {
                    throw new IllegalStateException("Unknown width mode is set: " + mode);
                }
            } else {
                iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i12, i14);
            }
        } else {
            if (size < largestMainSize) {
                i14 = View.combineMeasuredStates(i14, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i12, i14);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 == 1073741824) {
                    if (size2 < sumOfCrossSize) {
                        i14 = View.combineMeasuredStates(i14, 256);
                    }
                    iResolveSizeAndState2 = View.resolveSizeAndState(size2, i13, i14);
                } else {
                    throw new IllegalStateException("Unknown height mode is set: " + mode2);
                }
            } else {
                iResolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i13, i14);
            }
        } else {
            if (size2 < sumOfCrossSize) {
                i14 = View.combineMeasuredStates(i14, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i13, i14);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getChildHeightMeasureSpec(int i11, int i12, int i13) {
        return ViewGroup.getChildMeasureSpec(i11, i12, i13);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getChildWidthMeasureSpec(int i11, int i12, int i13) {
        return ViewGroup.getChildMeasureSpec(i11, i12, i13);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getDecorationLengthMainAxis(View view, int i11, int i12) {
        int i13;
        int i14 = 0;
        if (isMainAxisDirectionHorizontal()) {
            if (hasDividerBeforeChildAtAlongMainAxis(i11, i12)) {
                i14 = this.mDividerVerticalWidth;
            }
            if ((this.mShowDividerVertical & 4) > 0) {
                i13 = this.mDividerVerticalWidth;
            } else {
                return i14;
            }
        } else {
            if (hasDividerBeforeChildAtAlongMainAxis(i11, i12)) {
                i14 = this.mDividerHorizontalHeight;
            }
            if ((this.mShowDividerHorizontal & 4) > 0) {
                i13 = this.mDividerHorizontalHeight;
            } else {
                return i14;
            }
        }
        return i14 + i13;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public View getFlexItemAt(int i11) {
        return getChildAt(i11);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexItemCount() {
        return getChildCount();
    }

    @Override // com.google.android.flexbox.FlexContainer
    public View getReorderedFlexItemAt(int i11) {
        return getReorderedChildAt(i11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        boolean z12;
        boolean z13;
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int i15 = this.mFlexDirection;
        boolean z14 = false;
        if (i15 != 0) {
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 == 3) {
                        if (layoutDirection == 1) {
                            z14 = true;
                        }
                        if (this.mFlexWrap == 2) {
                            z14 = !z14;
                        }
                        layoutVertical(z14, true, i11, i12, i13, i14);
                        return;
                    }
                    throw new IllegalStateException("Invalid flex direction is set: " + this.mFlexDirection);
                }
                if (layoutDirection == 1) {
                    z14 = true;
                }
                if (this.mFlexWrap == 2) {
                    z14 = !z14;
                }
                layoutVertical(z14, false, i11, i12, i13, i14);
                return;
            }
            if (layoutDirection != 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            layoutHorizontal(z13, i11, i12, i13, i14);
            return;
        }
        if (layoutDirection == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        layoutHorizontal(z12, i11, i12, i13, i14);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void onNewFlexItemAdded(View view, int i11, int i12, FlexLine flexLine) {
        if (hasDividerBeforeChildAtAlongMainAxis(i11, i12)) {
            if (isMainAxisDirectionHorizontal()) {
                int i13 = flexLine.mMainSize;
                int i14 = this.mDividerVerticalWidth;
                flexLine.mMainSize = i13 + i14;
                flexLine.mDividerLengthInMainSize += i14;
                return;
            }
            int i15 = flexLine.mMainSize;
            int i16 = this.mDividerHorizontalHeight;
            flexLine.mMainSize = i15 + i16;
            flexLine.mDividerLengthInMainSize += i16;
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void onNewFlexLineAdded(FlexLine flexLine) {
        if (isMainAxisDirectionHorizontal()) {
            if ((this.mShowDividerVertical & 4) > 0) {
                int i11 = flexLine.mMainSize;
                int i12 = this.mDividerVerticalWidth;
                flexLine.mMainSize = i11 + i12;
                flexLine.mDividerLengthInMainSize += i12;
                return;
            }
            return;
        }
        if ((this.mShowDividerHorizontal & 4) > 0) {
            int i13 = flexLine.mMainSize;
            int i14 = this.mDividerHorizontalHeight;
            flexLine.mMainSize = i13 + i14;
            flexLine.mDividerLengthInMainSize += i14;
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setShowDivider(int i11) {
        setShowDividerVertical(i11);
        setShowDividerHorizontal(i11);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void updateViewCache(int i11, View view) {
    }
}
