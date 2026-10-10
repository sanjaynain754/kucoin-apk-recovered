package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.LinearLayout;
import androidx.annotation.GravityInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0467R;
import androidx.core.view.GravityCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.Set;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    /* JADX INFO: loaded from: classes23.dex */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface DividerMode {
    }

    /* JADX INFO: loaded from: classes23.dex */
    @RequiresApi(29)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {
        private int mBaselineAlignedChildIndexId;
        private int mBaselineAlignedId;
        private int mDividerId;
        private int mDividerPaddingId;
        private int mGravityId;
        private int mMeasureWithLargestChildId;
        private int mOrientationId;
        private boolean mPropertiesMapped = false;
        private int mShowDividersId;
        private int mWeightSumId;

        public void mapProperties(@NonNull PropertyMapper propertyMapper) {
            this.mBaselineAlignedId = propertyMapper.mapBoolean("baselineAligned", R.attr.baselineAligned);
            this.mBaselineAlignedChildIndexId = propertyMapper.mapInt("baselineAlignedChildIndex", R.attr.baselineAlignedChildIndex);
            this.mGravityId = propertyMapper.mapGravity("gravity", R.attr.gravity);
            this.mOrientationId = propertyMapper.mapIntEnum("orientation", R.attr.orientation, new IntFunction<String>() { // from class: androidx.appcompat.widget.LinearLayoutCompat.InspectionCompanion.1
                @Override // java.util.function.IntFunction
                public String apply(int i11) {
                    if (i11 != 0) {
                        return i11 != 1 ? String.valueOf(i11) : "vertical";
                    }
                    return "horizontal";
                }
            });
            this.mWeightSumId = propertyMapper.mapFloat("weightSum", R.attr.weightSum);
            this.mDividerId = propertyMapper.mapObject("divider", C0467R.attr.divider);
            this.mDividerPaddingId = propertyMapper.mapInt("dividerPadding", C0467R.attr.dividerPadding);
            this.mMeasureWithLargestChildId = propertyMapper.mapBoolean("measureWithLargestChild", C0467R.attr.measureWithLargestChild);
            this.mShowDividersId = propertyMapper.mapIntFlag("showDividers", C0467R.attr.showDividers, new IntFunction<Set<String>>() { // from class: androidx.appcompat.widget.LinearLayoutCompat.InspectionCompanion.2
                @Override // java.util.function.IntFunction
                public Set<String> apply(int i11) {
                    HashSet hashSet = new HashSet();
                    if (i11 == 0) {
                        hashSet.add("none");
                    }
                    if (i11 == 1) {
                        hashSet.add("beginning");
                    }
                    if (i11 == 2) {
                        hashSet.add("middle");
                    }
                    if (i11 == 4) {
                        hashSet.add("end");
                    }
                    return hashSet;
                }
            });
            this.mPropertiesMapped = true;
        }

        public void readProperties(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull PropertyReader propertyReader) {
            if (!this.mPropertiesMapped) {
                throw C0574c.m1567a();
            }
            propertyReader.readBoolean(this.mBaselineAlignedId, linearLayoutCompat.isBaselineAligned());
            propertyReader.readInt(this.mBaselineAlignedChildIndexId, linearLayoutCompat.getBaselineAlignedChildIndex());
            propertyReader.readGravity(this.mGravityId, linearLayoutCompat.getGravity());
            propertyReader.readIntEnum(this.mOrientationId, linearLayoutCompat.getOrientation());
            propertyReader.readFloat(this.mWeightSumId, linearLayoutCompat.getWeightSum());
            propertyReader.readObject(this.mDividerId, linearLayoutCompat.getDividerDrawable());
            propertyReader.readInt(this.mDividerPaddingId, linearLayoutCompat.getDividerPadding());
            propertyReader.readBoolean(this.mMeasureWithLargestChildId, linearLayoutCompat.isMeasureWithLargestChildEnabled());
            propertyReader.readIntFlag(this.mShowDividersId, linearLayoutCompat.getShowDividers());
        }
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
        }

        public LayoutParams(int i11, int i12, float f11) {
            super(i11, i12, f11);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface OrientationMode {
    }

    public LinearLayoutCompat(@NonNull Context context) {
        this(context, null);
    }

    private void setChildFrame(View view, int i11, int i12, int i13, int i14) {
        view.layout(i11, i12, i13 + i11, i14 + i12);
    }

    public int getChildrenSkipCount(View view, int i11) {
        return 0;
    }

    public int getLocationOffset(View view) {
        return 0;
    }

    public int getNextLocationOffset(View view) {
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean hasDividerBeforeChildAt(int i11) {
        if (i11 == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        if (i11 == getChildCount()) {
            return (this.mShowDividers & 4) != 0;
        }
        if ((this.mShowDividers & 2) != 0) {
            for (int i12 = i11 - 1; i12 >= 0; i12--) {
                if (getChildAt(i12).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    public void measureChildBeforeLayout(View view, int i11, int i12, int i13, int i14, int i15) {
        measureChildWithMargins(view, i12, i13, i14, i15);
    }

    public int measureNullChild(int i11) {
        return 0;
    }

    public void setWeightSum(float f11) {
        this.mWeightSum = Math.max(0.0f, f11);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void drawHorizontalDivider(Canvas canvas, int i11) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i11, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i11);
        this.mDivider.draw(canvas);
    }

    public void drawVerticalDivider(Canvas canvas, int i11) {
        this.mDivider.setBounds(i11, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i11, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        int i11 = this.mOrientation;
        if (i11 == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i11 == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i11;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i12 = this.mBaselineAlignedChildIndex;
        if (childCount <= i12) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i12);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i11 = this.mGravity & 112) != 48) {
            if (i11 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
            } else if (i11 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    @GravityInt
    public int getGravity() {
        return this.mGravity;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:48:0x0103  */
    public void layoutHorizontal(int i11, int i12, int i13, int i14) {
        int paddingLeft;
        int i15;
        int i16;
        char c11;
        char c12;
        int i17;
        int childrenSkipCount;
        int i18;
        int baseline;
        int i19;
        int i21;
        int i22;
        int measuredHeight;
        int i23;
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        int paddingTop = getPaddingTop();
        int i24 = i14 - i12;
        int paddingBottom = i24 - getPaddingBottom();
        int paddingBottom2 = (i24 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i25 = this.mGravity;
        int i26 = i25 & 112;
        boolean z11 = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        int absoluteGravity = GravityCompat.getAbsoluteGravity(8388615 & i25, getLayoutDirection());
        char c13 = 2;
        char c14 = 1;
        if (absoluteGravity != 1) {
            paddingLeft = absoluteGravity != 5 ? getPaddingLeft() : ((getPaddingLeft() + i13) - i11) - this.mTotalLength;
        } else {
            paddingLeft = getPaddingLeft() + (((i13 - i11) - this.mTotalLength) / 2);
        }
        if (zIsLayoutRtl) {
            i15 = virtualChildCount - 1;
            i16 = -1;
        } else {
            i15 = 0;
            i16 = 1;
        }
        int i27 = 0;
        while (i27 < virtualChildCount) {
            int i28 = i15 + (i16 * i27);
            int i29 = i27;
            View virtualChildAt = getVirtualChildAt(i28);
            if (virtualChildAt == null) {
                paddingLeft += measureNullChild(i28);
                childrenSkipCount = i29;
                i17 = paddingTop;
                c11 = c13;
                c12 = c14;
            } else {
                c11 = c13;
                c12 = c14;
                if (virtualChildAt.getVisibility() != 8) {
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    int measuredHeight2 = virtualChildAt.getMeasuredHeight();
                    LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                    int i31 = paddingLeft;
                    if (z11) {
                        i18 = measuredHeight2;
                        baseline = ((LinearLayout.LayoutParams) layoutParams).height != -1 ? virtualChildAt.getBaseline() : -1;
                        i19 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                        if (i19 < 0) {
                            i19 = i26;
                        }
                        i21 = i19 & 112;
                        i17 = paddingTop;
                        if (i21 != 16) {
                            if (i21 != 48) {
                                i22 = i17 + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                                if (baseline != -1) {
                                    i22 += iArr[c12] - baseline;
                                }
                            } else if (i21 != 80) {
                                i22 = i17;
                            } else {
                                i22 = (paddingBottom - i18) - ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[c11] - (virtualChildAt.getMeasuredHeight() - baseline);
                                }
                            }
                            if (hasDividerBeforeChildAt(i28)) {
                                i23 = i31 + this.mDividerWidth;
                            } else {
                                i23 = i31;
                            }
                            int i32 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + i23;
                            setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i32, i22, measuredWidth, i18);
                            int nextLocationOffset = i32 + ((LinearLayout.LayoutParams) layoutParams).rightMargin + measuredWidth + getNextLocationOffset(virtualChildAt);
                            childrenSkipCount = getChildrenSkipCount(virtualChildAt, i28) + i29;
                            paddingLeft = nextLocationOffset;
                        } else {
                            i22 = i17 + ((paddingBottom2 - i18) / 2) + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        }
                        i22 -= measuredHeight;
                        if (hasDividerBeforeChildAt(i28)) {
                            i23 = i31 + this.mDividerWidth;
                        } else {
                            i23 = i31;
                        }
                        int i33 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + i23;
                        setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i33, i22, measuredWidth, i18);
                        int nextLocationOffset2 = i33 + ((LinearLayout.LayoutParams) layoutParams).rightMargin + measuredWidth + getNextLocationOffset(virtualChildAt);
                        childrenSkipCount = getChildrenSkipCount(virtualChildAt, i28) + i29;
                        paddingLeft = nextLocationOffset2;
                    } else {
                        i18 = measuredHeight2;
                    }
                    i19 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                    if (i19 < 0) {
                        i19 = i26;
                    }
                    i21 = i19 & 112;
                    i17 = paddingTop;
                    if (i21 != 16) {
                        if (i21 != 48) {
                            i22 = i17 + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                            if (baseline != -1) {
                                i22 += iArr[c12] - baseline;
                            }
                        } else if (i21 != 80) {
                            i22 = i17;
                        } else {
                            i22 = (paddingBottom - i18) - ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[c11] - (virtualChildAt.getMeasuredHeight() - baseline);
                            }
                        }
                        if (hasDividerBeforeChildAt(i28)) {
                            i23 = i31 + this.mDividerWidth;
                        } else {
                            i23 = i31;
                        }
                        int i34 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + i23;
                        setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i34, i22, measuredWidth, i18);
                        int nextLocationOffset3 = i34 + ((LinearLayout.LayoutParams) layoutParams).rightMargin + measuredWidth + getNextLocationOffset(virtualChildAt);
                        childrenSkipCount = getChildrenSkipCount(virtualChildAt, i28) + i29;
                        paddingLeft = nextLocationOffset3;
                    } else {
                        i22 = i17 + ((paddingBottom2 - i18) / 2) + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        measuredHeight = ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    }
                    i22 -= measuredHeight;
                    if (hasDividerBeforeChildAt(i28)) {
                        i23 = i31 + this.mDividerWidth;
                    } else {
                        i23 = i31;
                    }
                    int i35 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + i23;
                    setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i35, i22, measuredWidth, i18);
                    int nextLocationOffset4 = i35 + ((LinearLayout.LayoutParams) layoutParams).rightMargin + measuredWidth + getNextLocationOffset(virtualChildAt);
                    childrenSkipCount = getChildrenSkipCount(virtualChildAt, i28) + i29;
                    paddingLeft = nextLocationOffset4;
                } else {
                    i17 = paddingTop;
                    childrenSkipCount = i29;
                }
            }
            i27 = childrenSkipCount + 1;
            c13 = c11;
            c14 = c12;
            paddingTop = i17;
        }
    }

    /* JADX WARN: Code duplicated, block: B:200:0x045e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0182  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x01dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x01df  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x01e8  */
    public void measureHorizontal(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iMax;
        int i18;
        int iMax2;
        int i19;
        int baseline;
        int i21;
        int i22;
        byte b11;
        int i23;
        int i24;
        int[] iArr;
        int i25;
        boolean z11;
        int[] iArr2;
        View view;
        int i26;
        boolean z12;
        int i27;
        int measuredHeight;
        int baseline2;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        if (this.mMaxAscent == null || this.mMaxDescent == null) {
            this.mMaxAscent = new int[4];
            this.mMaxDescent = new int[4];
        }
        int[] iArr3 = this.mMaxAscent;
        int[] iArr4 = this.mMaxDescent;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z13 = this.mBaselineAligned;
        boolean z14 = this.mUseLargestChild;
        int i28 = 1073741824;
        boolean z15 = mode == 1073741824;
        boolean z16 = z14;
        int childrenSkipCount = 0;
        int iMax3 = 0;
        int iMax4 = 0;
        boolean z17 = false;
        int iCombineMeasuredStates = 0;
        boolean z18 = false;
        boolean z19 = true;
        float f11 = 0.0f;
        int iMax5 = 0;
        int iMax6 = 0;
        while (true) {
            i13 = iMax3;
            if (childrenSkipCount >= virtualChildCount) {
                break;
            }
            boolean z21 = z13;
            View virtualChildAt = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt == null) {
                this.mTotalLength += measureNullChild(childrenSkipCount);
            } else {
                if (virtualChildAt.getVisibility() == 8) {
                    childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                } else {
                    if (hasDividerBeforeChildAt(childrenSkipCount)) {
                        this.mTotalLength += this.mDividerWidth;
                    }
                    LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                    float f12 = ((LinearLayout.LayoutParams) layoutParams).weight;
                    float f13 = f11 + f12;
                    if (mode == i28 && ((LinearLayout.LayoutParams) layoutParams).width == 0 && f12 > 0.0f) {
                        if (z15) {
                            this.mTotalLength += ((LinearLayout.LayoutParams) layoutParams).leftMargin + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        } else {
                            int i29 = this.mTotalLength;
                            this.mTotalLength = Math.max(i29, ((LinearLayout.LayoutParams) layoutParams).leftMargin + i29 + ((LinearLayout.LayoutParams) layoutParams).rightMargin);
                        }
                        if (z21) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            virtualChildAt.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                            i24 = mode;
                            iArr = iArr3;
                            iArr2 = iArr4;
                            i25 = i13;
                            z11 = z16;
                            view = virtualChildAt;
                        } else {
                            i24 = mode;
                            iArr = iArr3;
                            iArr2 = iArr4;
                            z17 = true;
                            i25 = i13;
                            i26 = 1073741824;
                            z11 = z16;
                            view = virtualChildAt;
                        }
                        if (mode2 == i26 && ((LinearLayout.LayoutParams) layoutParams).height == -1) {
                            z12 = true;
                            z18 = true;
                        } else {
                            z12 = false;
                        }
                        i27 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i27;
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        if (!z21 && (baseline2 = view.getBaseline()) != -1) {
                            int i31 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                            if (i31 < 0) {
                                i31 = this.mGravity;
                            }
                            int i32 = (((i31 & 112) >> 4) & (-2)) >> 1;
                            iArr[i32] = Math.max(iArr[i32], baseline2);
                            iArr2[i32] = Math.max(iArr2[i32], measuredHeight - baseline2);
                        }
                        iMax3 = Math.max(i25, measuredHeight);
                        if (z19 || ((LinearLayout.LayoutParams) layoutParams).height != -1) {
                            z19 = false;
                        } else {
                            z19 = true;
                        }
                        if (((LinearLayout.LayoutParams) layoutParams).weight > 0.0f) {
                            if (z12) {
                                measuredHeight = i27;
                            }
                            iMax6 = Math.max(iMax6, measuredHeight);
                        } else {
                            if (z12 != 0) {
                                measuredHeight = i27;
                            }
                            iMax5 = Math.max(iMax5, measuredHeight);
                        }
                        childrenSkipCount += getChildrenSkipCount(view, childrenSkipCount);
                        f11 = f13;
                    } else {
                        if (((LinearLayout.LayoutParams) layoutParams).width != 0 || f12 <= 0.0f) {
                            b11 = -2;
                            i23 = Integer.MIN_VALUE;
                        } else {
                            b11 = -2;
                            ((LinearLayout.LayoutParams) layoutParams).width = -2;
                            i23 = 0;
                        }
                        i24 = mode;
                        iArr = iArr3;
                        i25 = i13;
                        int i33 = i23;
                        z11 = z16;
                        iArr2 = iArr4;
                        measureChildBeforeLayout(virtualChildAt, childrenSkipCount, i11, f13 == 0.0f ? this.mTotalLength : 0, i12, 0);
                        view = virtualChildAt;
                        if (i33 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) layoutParams).width = i33;
                        }
                        int measuredWidth = view.getMeasuredWidth();
                        if (z15) {
                            this.mTotalLength += ((LinearLayout.LayoutParams) layoutParams).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).rightMargin + getNextLocationOffset(view);
                        } else {
                            int i34 = this.mTotalLength;
                            this.mTotalLength = Math.max(i34, i34 + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).leftMargin + ((LinearLayout.LayoutParams) layoutParams).rightMargin + getNextLocationOffset(view));
                        }
                        if (z11) {
                            iMax4 = Math.max(measuredWidth, iMax4);
                        }
                    }
                    i26 = 1073741824;
                    if (mode2 == i26) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    i27 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i27;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    if (!z21) {
                    }
                    iMax3 = Math.max(i25, measuredHeight);
                    if (z19) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    if (((LinearLayout.LayoutParams) layoutParams).weight > 0.0f) {
                        if (z12) {
                            measuredHeight = i27;
                        }
                        iMax6 = Math.max(iMax6, measuredHeight);
                    } else {
                        if (z12 != 0) {
                            measuredHeight = i27;
                        }
                        iMax5 = Math.max(iMax5, measuredHeight);
                    }
                    childrenSkipCount += getChildrenSkipCount(view, childrenSkipCount);
                    f11 = f13;
                }
                childrenSkipCount++;
                z16 = z11;
                iArr4 = iArr2;
                z13 = z21;
                iArr3 = iArr;
                mode = i24;
                i28 = 1073741824;
            }
            i24 = mode;
            iArr = iArr3;
            iArr2 = iArr4;
            iMax3 = i13;
            z11 = z16;
            childrenSkipCount++;
            z16 = z11;
            iArr4 = iArr2;
            z13 = z21;
            iArr3 = iArr;
            mode = i24;
            i28 = 1073741824;
        }
        boolean z22 = z13;
        int i35 = mode;
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        int i36 = iCombineMeasuredStates;
        boolean z23 = z16;
        if (this.mTotalLength > 0 && hasDividerBeforeChildAt(virtualChildCount)) {
            this.mTotalLength += this.mDividerWidth;
        }
        int i37 = iArr5[1];
        int iMax7 = (i37 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? i13 : Math.max(i13, Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i37, iArr5[2]))) + Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))));
        if (z23) {
            i15 = i35;
            if (i15 == Integer.MIN_VALUE || i15 == 0) {
                this.mTotalLength = 0;
                int childrenSkipCount2 = 0;
                while (childrenSkipCount2 < virtualChildCount) {
                    View virtualChildAt2 = getVirtualChildAt(childrenSkipCount2);
                    if (virtualChildAt2 == null) {
                        this.mTotalLength += measureNullChild(childrenSkipCount2);
                    } else {
                        if (virtualChildAt2.getVisibility() == 8) {
                            childrenSkipCount2 += getChildrenSkipCount(virtualChildAt2, childrenSkipCount2);
                        } else {
                            LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                            if (z15) {
                                this.mTotalLength += ((LinearLayout.LayoutParams) layoutParams2).leftMargin + iMax4 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + getNextLocationOffset(virtualChildAt2);
                            } else {
                                iMax7 = iMax7;
                                int i38 = this.mTotalLength;
                                this.mTotalLength = Math.max(i38, i38 + iMax4 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + getNextLocationOffset(virtualChildAt2));
                            }
                        }
                        childrenSkipCount2++;
                        iMax7 = iMax7;
                        f11 = f11;
                    }
                    childrenSkipCount2++;
                    iMax7 = iMax7;
                    f11 = f11;
                }
            }
            i14 = iMax7;
        } else {
            i14 = iMax7;
            i15 = i35;
        }
        float f14 = f11;
        int paddingLeft = this.mTotalLength + getPaddingLeft() + getPaddingRight();
        this.mTotalLength = paddingLeft;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i11, 0);
        int i39 = (16777215 & iResolveSizeAndState) - this.mTotalLength;
        if (z17 || (i39 != 0 && f14 > 0.0f)) {
            float f15 = this.mWeightSum;
            if (f15 > 0.0f) {
                f14 = f15;
            }
            iArr5[3] = -1;
            iArr5[2] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[2] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            this.mTotalLength = 0;
            int iCombineMeasuredStates2 = i36;
            int iMax8 = -1;
            int i41 = 0;
            while (i41 < virtualChildCount) {
                View virtualChildAt3 = getVirtualChildAt(i41);
                if (virtualChildAt3 == null || virtualChildAt3.getVisibility() == 8) {
                    iResolveSizeAndState = iResolveSizeAndState;
                } else {
                    LayoutParams layoutParams3 = (LayoutParams) virtualChildAt3.getLayoutParams();
                    float f16 = ((LinearLayout.LayoutParams) layoutParams3).weight;
                    if (f16 > 0.0f) {
                        int i42 = (int) ((i39 * f16) / f14);
                        f14 -= f16;
                        i39 -= i42;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin, ((LinearLayout.LayoutParams) layoutParams3).height);
                        if (((LinearLayout.LayoutParams) layoutParams3).width == 0) {
                            i22 = 1073741824;
                            if (i15 == 1073741824) {
                                if (i42 <= 0) {
                                    i42 = 0;
                                }
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(i42, 1073741824), childMeasureSpec);
                            }
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, virtualChildAt3.getMeasuredState() & ViewCompat.MEASURED_STATE_MASK);
                        } else {
                            i22 = 1073741824;
                        }
                        int measuredWidth2 = virtualChildAt3.getMeasuredWidth() + i42;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i22), childMeasureSpec);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, virtualChildAt3.getMeasuredState() & ViewCompat.MEASURED_STATE_MASK);
                    }
                    if (z15) {
                        this.mTotalLength += virtualChildAt3.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + getNextLocationOffset(virtualChildAt3);
                    } else {
                        int i43 = this.mTotalLength;
                        this.mTotalLength = Math.max(i43, virtualChildAt3.getMeasuredWidth() + i43 + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + getNextLocationOffset(virtualChildAt3));
                    }
                    boolean z24 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) layoutParams3).height == -1;
                    int i44 = ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin;
                    int measuredHeight2 = virtualChildAt3.getMeasuredHeight() + i44;
                    iMax8 = Math.max(iMax8, measuredHeight2);
                    if (!z24) {
                        i44 = measuredHeight2;
                    }
                    int iMax9 = Math.max(iMax5, i44);
                    if (z19) {
                        i19 = -1;
                        boolean z25 = ((LinearLayout.LayoutParams) layoutParams3).height == -1;
                        if (z22 && (baseline = virtualChildAt3.getBaseline()) != i19) {
                            i21 = ((LinearLayout.LayoutParams) layoutParams3).gravity;
                            if (i21 < 0) {
                                i21 = this.mGravity;
                            }
                            int i45 = (((i21 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i45] = Math.max(iArr5[i45], baseline);
                            iArr6[i45] = Math.max(iArr6[i45], measuredHeight2 - baseline);
                        }
                        iMax5 = iMax9;
                        z19 = z25;
                    } else {
                        i19 = -1;
                    }
                    if (z22) {
                        i21 = ((LinearLayout.LayoutParams) layoutParams3).gravity;
                        if (i21 < 0) {
                            i21 = this.mGravity;
                        }
                        int i46 = (((i21 & 112) >> 4) & (-2)) >> 1;
                        iArr5[i46] = Math.max(iArr5[i46], baseline);
                        iArr6[i46] = Math.max(iArr6[i46], measuredHeight2 - baseline);
                    }
                    iMax5 = iMax9;
                    z19 = z25;
                }
                i41++;
                iResolveSizeAndState = iResolveSizeAndState;
            }
            i16 = iResolveSizeAndState;
            i17 = ViewCompat.MEASURED_STATE_MASK;
            this.mTotalLength += getPaddingLeft() + getPaddingRight();
            int i47 = iArr5[1];
            iMax = (i47 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? iMax8 : Math.max(iMax8, Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i47, iArr5[2]))) + Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))));
            i18 = iCombineMeasuredStates2;
            iMax2 = iMax5;
        } else {
            iMax2 = Math.max(iMax5, iMax6);
            if (z23 && i15 != 1073741824) {
                for (int i48 = 0; i48 < virtualChildCount; i48++) {
                    View virtualChildAt4 = getVirtualChildAt(i48);
                    if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt4.getLayoutParams())).weight > 0.0f) {
                        virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(iMax4, 1073741824), View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i16 = iResolveSizeAndState;
            i18 = i36;
            iMax = i14;
            i17 = ViewCompat.MEASURED_STATE_MASK;
        }
        if (!z19 && mode2 != 1073741824) {
            iMax = iMax2;
        }
        setMeasuredDimension(i16 | (i18 & i17), View.resolveSizeAndState(Math.max(iMax + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i12, i18 << 16));
        if (z18) {
            forceUniformHeight(virtualChildCount, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0158 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x015b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0162 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0165  */
    public void measureVertical(int i11, int i12) {
        int i13;
        int iMax;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        boolean z11;
        int iMax2;
        View view;
        int iMax3;
        boolean z12;
        int iMax4;
        int i24;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int i25 = this.mBaselineAlignedChildIndex;
        boolean z13 = this.mUseLargestChild;
        int childrenSkipCount = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int iMax5 = 0;
        boolean z14 = false;
        boolean z15 = false;
        float f11 = 0.0f;
        boolean z16 = true;
        while (true) {
            int i31 = 8;
            if (childrenSkipCount >= virtualChildCount) {
                float f12 = f11;
                int i32 = i26;
                int i33 = virtualChildCount;
                int i34 = mode2;
                boolean z17 = z13;
                int i35 = i27;
                int iMax6 = i28;
                int iCombineMeasuredStates = i29;
                if (this.mTotalLength > 0) {
                    i13 = i33;
                    if (hasDividerBeforeChildAt(i13)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                } else {
                    i13 = i33;
                }
                int i36 = i34;
                if (z17 && (i36 == Integer.MIN_VALUE || i36 == 0)) {
                    this.mTotalLength = 0;
                    int childrenSkipCount2 = 0;
                    while (childrenSkipCount2 < i13) {
                        View virtualChildAt = getVirtualChildAt(childrenSkipCount2);
                        if (virtualChildAt == null) {
                            this.mTotalLength += measureNullChild(childrenSkipCount2);
                        } else if (virtualChildAt.getVisibility() == i31) {
                            childrenSkipCount2 += getChildrenSkipCount(virtualChildAt, childrenSkipCount2);
                        } else {
                            LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                            int i37 = this.mTotalLength;
                            this.mTotalLength = Math.max(i37, i37 + i35 + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + getNextLocationOffset(virtualChildAt));
                        }
                        childrenSkipCount2++;
                        i31 = 8;
                    }
                }
                int paddingTop = this.mTotalLength + getPaddingTop() + getPaddingBottom();
                this.mTotalLength = paddingTop;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i12, 0);
                int i38 = (16777215 & iResolveSizeAndState) - this.mTotalLength;
                if (z14 || (i38 != 0 && f12 > 0.0f)) {
                    float f13 = this.mWeightSum;
                    if (f13 <= 0.0f) {
                        f13 = f12;
                    }
                    this.mTotalLength = 0;
                    float f14 = f13;
                    int i39 = i38;
                    int i41 = 0;
                    while (i41 < i13) {
                        View virtualChildAt2 = getVirtualChildAt(i41);
                        if (virtualChildAt2.getVisibility() == 8) {
                            i36 = i36;
                            i41 = i41;
                        } else {
                            LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                            float f15 = ((LinearLayout.LayoutParams) layoutParams2).weight;
                            if (f15 > 0.0f) {
                                int i42 = (int) ((i39 * f15) / f14);
                                f14 -= f15;
                                i39 -= i42;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, getPaddingLeft() + getPaddingRight() + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin, ((LinearLayout.LayoutParams) layoutParams2).width);
                                if (((LinearLayout.LayoutParams) layoutParams2).height == 0) {
                                    i15 = 1073741824;
                                    if (i36 == 1073741824) {
                                        virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i42 > 0 ? i42 : 0, 1073741824));
                                    }
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt2.getMeasuredState() & InputDeviceCompat.SOURCE_ANY);
                                } else {
                                    i15 = 1073741824;
                                }
                                int measuredHeight = virtualChildAt2.getMeasuredHeight() + i42;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i15));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt2.getMeasuredState() & InputDeviceCompat.SOURCE_ANY);
                            } else {
                                i36 = i36;
                            }
                            int i43 = ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                            int measuredWidth = virtualChildAt2.getMeasuredWidth() + i43;
                            iMax6 = Math.max(iMax6, measuredWidth);
                            if (mode != 1073741824) {
                                i14 = -1;
                                if (((LinearLayout.LayoutParams) layoutParams2).width == -1) {
                                    measuredWidth = i43;
                                }
                            } else {
                                i14 = -1;
                            }
                            int iMax7 = Math.max(iMax5, measuredWidth);
                            boolean z18 = z16 && ((LinearLayout.LayoutParams) layoutParams2).width == i14;
                            int i44 = this.mTotalLength;
                            this.mTotalLength = Math.max(i44, i44 + virtualChildAt2.getMeasuredHeight() + ((LinearLayout.LayoutParams) layoutParams2).topMargin + ((LinearLayout.LayoutParams) layoutParams2).bottomMargin + getNextLocationOffset(virtualChildAt2));
                            iMax5 = iMax7;
                            z16 = z18;
                        }
                        i41++;
                        i36 = i36;
                    }
                    this.mTotalLength += getPaddingTop() + getPaddingBottom();
                    iMax = iMax5;
                } else {
                    iMax = Math.max(iMax5, i32);
                    if (z17 && i36 != 1073741824) {
                        for (int i45 = 0; i45 < i13; i45++) {
                            View virtualChildAt3 = getVirtualChildAt(i45);
                            if (virtualChildAt3 != null && virtualChildAt3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt3.getLayoutParams())).weight > 0.0f) {
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(virtualChildAt3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i35, 1073741824));
                            }
                        }
                    }
                }
                if (!z16 && mode != 1073741824) {
                    iMax6 = iMax;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax6 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i11, iCombineMeasuredStates), iResolveSizeAndState);
                if (z15) {
                    forceUniformWidth(i13, i12);
                    return;
                }
                return;
            }
            float f16 = f11;
            View virtualChildAt4 = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt4 == null) {
                this.mTotalLength += measureNullChild(childrenSkipCount);
            } else {
                if (virtualChildAt4.getVisibility() == 8) {
                    childrenSkipCount += getChildrenSkipCount(virtualChildAt4, childrenSkipCount);
                } else {
                    if (hasDividerBeforeChildAt(childrenSkipCount)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                    LayoutParams layoutParams3 = (LayoutParams) virtualChildAt4.getLayoutParams();
                    float f17 = ((LinearLayout.LayoutParams) layoutParams3).weight;
                    float f18 = f16 + f17;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) layoutParams3).height == 0 && f17 > 0.0f) {
                        int i46 = this.mTotalLength;
                        this.mTotalLength = Math.max(i46, ((LinearLayout.LayoutParams) layoutParams3).topMargin + i46 + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin);
                        iMax2 = i26;
                        iMax3 = i27;
                        i19 = virtualChildCount;
                        i21 = mode2;
                        z14 = true;
                        view = virtualChildAt4;
                        i23 = i28;
                        i22 = i29;
                        z11 = z13;
                    } else {
                        if (((LinearLayout.LayoutParams) layoutParams3).height != 0 || f17 <= 0.0f) {
                            i16 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) layoutParams3).height = -2;
                            i16 = 0;
                        }
                        if (f18 == 0.0f) {
                            int i47 = i29;
                            i18 = this.mTotalLength;
                            i17 = i47;
                        } else {
                            i17 = i29;
                            i18 = 0;
                        }
                        int i48 = i27;
                        i19 = virtualChildCount;
                        i21 = mode2;
                        i22 = i17;
                        i23 = i28;
                        z11 = z13;
                        iMax2 = i26;
                        measureChildBeforeLayout(virtualChildAt4, childrenSkipCount, i11, 0, i12, i18);
                        view = virtualChildAt4;
                        if (i16 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) layoutParams3).height = i16;
                        }
                        int measuredHeight2 = view.getMeasuredHeight();
                        int i49 = this.mTotalLength;
                        this.mTotalLength = Math.max(i49, i49 + measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin + getNextLocationOffset(view));
                        iMax3 = z11 ? Math.max(measuredHeight2, i48) : i48;
                    }
                    if (i25 >= 0 && i25 == childrenSkipCount + 1) {
                        this.mBaselineChildTop = this.mTotalLength;
                    }
                    if (childrenSkipCount < i25 && ((LinearLayout.LayoutParams) layoutParams3).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((LinearLayout.LayoutParams) layoutParams3).width != -1) {
                        z12 = false;
                    } else {
                        z12 = true;
                        z15 = true;
                    }
                    int i51 = ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i51;
                    iMax4 = Math.max(i23, measuredWidth2);
                    int i52 = iMax3;
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(i22, view.getMeasuredState());
                    if (z16) {
                        i24 = iCombineMeasuredStates2;
                        z16 = ((LinearLayout.LayoutParams) layoutParams3).width == -1;
                        if (((LinearLayout.LayoutParams) layoutParams3).weight > 0.0f) {
                            if (!z12) {
                                i51 = measuredWidth2;
                            }
                            iMax2 = Math.max(iMax2, i51);
                        } else {
                            if (!z12) {
                                i51 = measuredWidth2;
                            }
                            iMax5 = Math.max(iMax5, i51);
                        }
                        childrenSkipCount += getChildrenSkipCount(view, childrenSkipCount);
                        f11 = f18;
                        i27 = i52;
                        i29 = i24;
                    } else {
                        i24 = iCombineMeasuredStates2;
                    }
                    if (((LinearLayout.LayoutParams) layoutParams3).weight > 0.0f) {
                        if (!z12) {
                            i51 = measuredWidth2;
                        }
                        iMax2 = Math.max(iMax2, i51);
                    } else {
                        if (!z12) {
                            i51 = measuredWidth2;
                        }
                        iMax5 = Math.max(iMax5, i51);
                    }
                    childrenSkipCount += getChildrenSkipCount(view, childrenSkipCount);
                    f11 = f18;
                    i27 = i52;
                    i29 = i24;
                }
                childrenSkipCount++;
                i28 = iMax4;
                i26 = iMax2;
                z13 = z11;
                mode2 = i21;
                virtualChildCount = i19;
            }
            iMax2 = i26;
            i19 = virtualChildCount;
            i21 = mode2;
            z11 = z13;
            f11 = f16;
            iMax4 = i28;
            childrenSkipCount++;
            i28 = iMax4;
            i26 = iMax2;
            z13 = z11;
            mode2 = i21;
            virtualChildCount = i19;
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        if (this.mOrientation == 1) {
            layoutVertical(i11, i12, i13, i14);
        } else {
            layoutHorizontal(i11, i12, i13, i14);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        if (this.mOrientation == 1) {
            measureVertical(i11, i12);
        } else {
            measureHorizontal(i11, i12);
        }
    }

    public void setBaselineAligned(boolean z11) {
        this.mBaselineAligned = z11;
    }

    public void setBaselineAlignedChildIndex(int i11) {
        if (i11 >= 0 && i11 < getChildCount()) {
            this.mBaselineAlignedChildIndex = i11;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i11) {
        this.mDividerPadding = i11;
    }

    public void setGravity(@GravityInt int i11) {
        if (this.mGravity != i11) {
            if ((8388615 & i11) == 0) {
                i11 |= GravityCompat.START;
            }
            if ((i11 & 112) == 0) {
                i11 |= 48;
            }
            this.mGravity = i11;
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z11) {
        this.mUseLargestChild = z11;
    }

    public void setOrientation(int i11) {
        if (this.mOrientation != i11) {
            this.mOrientation = i11;
            requestLayout();
        }
    }

    public void setShowDividers(int i11) {
        if (i11 != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i11;
    }

    public void setVerticalGravity(int i11) {
        int i12 = i11 & 112;
        int i13 = this.mGravity;
        if ((i13 & 112) != i12) {
            this.mGravity = i12 | (i13 & (-113));
            requestLayout();
        }
    }

    public LinearLayoutCompat(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        int[] iArr = C0467R.styleable.LinearLayoutCompat;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i11, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i11, 0);
        int i12 = tintTypedArrayObtainStyledAttributes.getInt(C0467R.styleable.LinearLayoutCompat_android_orientation, -1);
        if (i12 >= 0) {
            setOrientation(i12);
        }
        int i13 = tintTypedArrayObtainStyledAttributes.getInt(C0467R.styleable.LinearLayoutCompat_android_gravity, -1);
        if (i13 >= 0) {
            setGravity(i13);
        }
        boolean z11 = tintTypedArrayObtainStyledAttributes.getBoolean(C0467R.styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!z11) {
            setBaselineAligned(z11);
        }
        this.mWeightSum = tintTypedArrayObtainStyledAttributes.getFloat(C0467R.styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.mBaselineAlignedChildIndex = tintTypedArrayObtainStyledAttributes.getInt(C0467R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.mUseLargestChild = tintTypedArrayObtainStyledAttributes.getBoolean(C0467R.styleable.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(C0467R.styleable.LinearLayoutCompat_divider));
        this.mShowDividers = tintTypedArrayObtainStyledAttributes.getInt(C0467R.styleable.LinearLayoutCompat_showDividers, 0);
        this.mDividerPadding = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(C0467R.styleable.LinearLayoutCompat_dividerPadding, 0);
        tintTypedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    private void forceUniformHeight(int i11, int i12) {
        int i13;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int i14 = 0;
        while (i14 < i11) {
            View virtualChildAt = getVirtualChildAt(i14);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).height == -1) {
                    int i15 = ((LinearLayout.LayoutParams) layoutParams).width;
                    ((LinearLayout.LayoutParams) layoutParams).width = virtualChildAt.getMeasuredWidth();
                    i13 = i12;
                    measureChildWithMargins(virtualChildAt, i13, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) layoutParams).width = i15;
                } else {
                    i13 = i12;
                }
            } else {
                i13 = i12;
            }
            i14++;
            i12 = i13;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    private void forceUniformWidth(int i11, int i12) {
        int i13;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i14 = 0;
        while (i14 < i11) {
            View virtualChildAt = getVirtualChildAt(i14);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).width == -1) {
                    int i15 = ((LinearLayout.LayoutParams) layoutParams).height;
                    ((LinearLayout.LayoutParams) layoutParams).height = virtualChildAt.getMeasuredHeight();
                    i13 = i12;
                    measureChildWithMargins(virtualChildAt, iMakeMeasureSpec, 0, i13, 0);
                    ((LinearLayout.LayoutParams) layoutParams).height = i15;
                } else {
                    i13 = i12;
                }
            } else {
                i13 = i12;
            }
            i14++;
            i12 = i13;
        }
    }

    public void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int i11;
        int left2;
        int virtualChildCount = getVirtualChildCount();
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        for (int i12 = 0; i12 < virtualChildCount; i12++) {
            View virtualChildAt = getVirtualChildAt(i12);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i12)) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (zIsLayoutRtl) {
                    left2 = virtualChildAt.getRight() + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                } else {
                    left2 = (virtualChildAt.getLeft() - ((LinearLayout.LayoutParams) layoutParams).leftMargin) - this.mDividerWidth;
                }
                drawVerticalDivider(canvas, left2);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 == null) {
                if (zIsLayoutRtl) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth() - getPaddingRight();
                    i11 = this.mDividerWidth;
                    right = left - i11;
                }
            } else {
                LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                if (zIsLayoutRtl) {
                    left = virtualChildAt2.getLeft() - ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                    i11 = this.mDividerWidth;
                    right = left - i11;
                } else {
                    right = virtualChildAt2.getRight() + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                }
            }
            drawVerticalDivider(canvas, right);
        }
    }

    public void drawDividersVertical(Canvas canvas) {
        int bottom;
        int virtualChildCount = getVirtualChildCount();
        for (int i11 = 0; i11 < virtualChildCount; i11++) {
            View virtualChildAt = getVirtualChildAt(i11);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i11)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt.getLayoutParams())).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.mDividerHeight;
            } else {
                bottom = virtualChildAt2.getBottom() + ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt2.getLayoutParams())).bottomMargin;
            }
            drawHorizontalDivider(canvas, bottom);
        }
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public View getVirtualChildAt(int i11) {
        return getChildAt(i11);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    public void layoutVertical(int i11, int i12, int i13, int i14) {
        int paddingTop;
        int i15;
        int i16;
        int i17;
        int paddingLeft = getPaddingLeft();
        int i18 = i13 - i11;
        int paddingRight = i18 - getPaddingRight();
        int paddingRight2 = (i18 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i19 = this.mGravity;
        int i21 = i19 & 112;
        int i22 = i19 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i21 != 16) {
            if (i21 != 80) {
                paddingTop = getPaddingTop();
            } else {
                paddingTop = ((getPaddingTop() + i14) - i12) - this.mTotalLength;
            }
        } else {
            paddingTop = getPaddingTop() + (((i14 - i12) - this.mTotalLength) / 2);
        }
        int childrenSkipCount = 0;
        while (childrenSkipCount < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt == null) {
                paddingTop += measureNullChild(childrenSkipCount);
            } else {
                if (virtualChildAt.getVisibility() != 8) {
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    int measuredHeight = virtualChildAt.getMeasuredHeight();
                    LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                    int i23 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                    if (i23 < 0) {
                        i23 = i22;
                    }
                    int absoluteGravity = GravityCompat.getAbsoluteGravity(i23, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i17 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft;
                        } else {
                            i15 = paddingRight - measuredWidth;
                            i16 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        }
                        int i24 = i17;
                        if (hasDividerBeforeChildAt(childrenSkipCount)) {
                            paddingTop += this.mDividerHeight;
                        }
                        int i25 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        setChildFrame(virtualChildAt, i24, i25 + getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                        paddingTop = i25 + measuredHeight + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + getNextLocationOffset(virtualChildAt);
                        childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                    } else {
                        i15 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        i16 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    }
                    i17 = i15 - i16;
                    int i26 = i17;
                    if (hasDividerBeforeChildAt(childrenSkipCount)) {
                        paddingTop += this.mDividerHeight;
                    }
                    int i27 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    setChildFrame(virtualChildAt, i26, i27 + getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                    paddingTop = i27 + measuredHeight + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + getNextLocationOffset(virtualChildAt);
                    childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                }
                childrenSkipCount++;
            }
            childrenSkipCount++;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    public void setHorizontalGravity(int i11) {
        int i12 = i11 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        int i13 = this.mGravity;
        if ((8388615 & i13) != i12) {
            this.mGravity = i12 | ((-8388616) & i13);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }
}
