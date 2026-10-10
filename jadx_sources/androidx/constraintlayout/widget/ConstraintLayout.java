package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.internal.view.SupportMenu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.2.0-alpha04";
    private static SharedValues sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<ConstraintHelper> mConstraintHelpers;
    protected ConstraintLayoutStates mConstraintLayoutSpec;
    private ConstraintSet mConstraintSet;
    private int mConstraintSetId;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected ConstraintWidgetContainer mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    Measurer mMeasurer;
    private Metrics mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private ArrayList<ValueModifier> mModifiers;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<ConstraintWidget> mTempMapIdToWidget;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public static final int BASELINE = 5;
        public static final int BOTTOM = 4;
        public static final int CHAIN_PACKED = 2;
        public static final int CHAIN_SPREAD = 0;
        public static final int CHAIN_SPREAD_INSIDE = 1;
        public static final int CIRCLE = 8;
        public static final int END = 7;
        public static final int GONE_UNSET = Integer.MIN_VALUE;
        public static final int HORIZONTAL = 0;
        public static final int LEFT = 1;
        public static final int MATCH_CONSTRAINT = 0;
        public static final int MATCH_CONSTRAINT_PERCENT = 2;
        public static final int MATCH_CONSTRAINT_SPREAD = 0;
        public static final int MATCH_CONSTRAINT_WRAP = 1;
        public static final int PARENT_ID = 0;
        public static final int RIGHT = 2;
        public static final int START = 6;
        public static final int TOP = 3;
        public static final int UNSET = -1;
        public static final int VERTICAL = 1;
        public static final int WRAP_BEHAVIOR_HORIZONTAL_ONLY = 1;
        public static final int WRAP_BEHAVIOR_INCLUDED = 0;
        public static final int WRAP_BEHAVIOR_SKIPPED = 3;
        public static final int WRAP_BEHAVIOR_VERTICAL_ONLY = 2;
        public int baselineMargin;
        public int baselineToBaseline;
        public int baselineToBottom;
        public int baselineToTop;
        public int bottomToBottom;
        public int bottomToTop;
        public float circleAngle;
        public int circleConstraint;
        public int circleRadius;
        public boolean constrainedHeight;
        public boolean constrainedWidth;
        public String constraintTag;
        public String dimensionRatio;
        public int editorAbsoluteX;
        public int editorAbsoluteY;
        public int endToEnd;
        public int endToStart;
        public int goneBaselineMargin;
        public int goneBottomMargin;
        public int goneEndMargin;
        public int goneLeftMargin;
        public int goneRightMargin;
        public int goneStartMargin;
        public int goneTopMargin;
        public int guideBegin;
        public int guideEnd;
        public float guidePercent;
        public boolean guidelineUseRtl;
        public boolean helped;
        public float horizontalBias;
        public int horizontalChainStyle;
        public float horizontalWeight;
        public int leftToLeft;
        public int leftToRight;
        int mDimensionRatioSide;
        float mDimensionRatioValue;
        boolean mHeightSet;
        boolean mHorizontalDimensionFixed;
        boolean mIsGuideline;
        boolean mIsHelper;
        boolean mIsInPlaceholder;
        boolean mIsVirtualGroup;
        boolean mNeedsBaseline;
        int mResolveGoneLeftMargin;
        int mResolveGoneRightMargin;
        int mResolvedGuideBegin;
        int mResolvedGuideEnd;
        float mResolvedGuidePercent;
        float mResolvedHorizontalBias;
        int mResolvedLeftToLeft;
        int mResolvedLeftToRight;
        int mResolvedRightToLeft;
        int mResolvedRightToRight;
        boolean mVerticalDimensionFixed;
        ConstraintWidget mWidget;
        boolean mWidthSet;
        public int matchConstraintDefaultHeight;
        public int matchConstraintDefaultWidth;
        public int matchConstraintMaxHeight;
        public int matchConstraintMaxWidth;
        public int matchConstraintMinHeight;
        public int matchConstraintMinWidth;
        public float matchConstraintPercentHeight;
        public float matchConstraintPercentWidth;
        public int orientation;
        public int rightToLeft;
        public int rightToRight;
        public int startToEnd;
        public int startToStart;
        public int topToBottom;
        public int topToTop;
        public float verticalBias;
        public int verticalChainStyle;
        public float verticalWeight;
        public int wrapBehaviorInParent;

        public static class Table {
            public static final int ANDROID_ORIENTATION = 1;
            public static final int GUIDELINE_USE_RTL = 67;
            public static final int LAYOUT_CONSTRAINED_HEIGHT = 28;
            public static final int LAYOUT_CONSTRAINED_WIDTH = 27;
            public static final int LAYOUT_CONSTRAINT_BASELINE_CREATOR = 43;
            public static final int LAYOUT_CONSTRAINT_BASELINE_TO_BASELINE_OF = 16;
            public static final int LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF = 53;
            public static final int LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF = 52;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_CREATOR = 42;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_BOTTOM_OF = 15;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_TOP_OF = 14;
            public static final int LAYOUT_CONSTRAINT_CIRCLE = 2;
            public static final int LAYOUT_CONSTRAINT_CIRCLE_ANGLE = 4;
            public static final int LAYOUT_CONSTRAINT_CIRCLE_RADIUS = 3;
            public static final int LAYOUT_CONSTRAINT_DIMENSION_RATIO = 44;
            public static final int LAYOUT_CONSTRAINT_END_TO_END_OF = 20;
            public static final int LAYOUT_CONSTRAINT_END_TO_START_OF = 19;
            public static final int LAYOUT_CONSTRAINT_GUIDE_BEGIN = 5;
            public static final int LAYOUT_CONSTRAINT_GUIDE_END = 6;
            public static final int LAYOUT_CONSTRAINT_GUIDE_PERCENT = 7;
            public static final int LAYOUT_CONSTRAINT_HEIGHT = 65;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_DEFAULT = 32;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_MAX = 37;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_MIN = 36;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_PERCENT = 38;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_BIAS = 29;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_CHAINSTYLE = 47;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_WEIGHT = 45;
            public static final int LAYOUT_CONSTRAINT_LEFT_CREATOR = 39;
            public static final int LAYOUT_CONSTRAINT_LEFT_TO_LEFT_OF = 8;
            public static final int LAYOUT_CONSTRAINT_LEFT_TO_RIGHT_OF = 9;
            public static final int LAYOUT_CONSTRAINT_RIGHT_CREATOR = 41;
            public static final int LAYOUT_CONSTRAINT_RIGHT_TO_LEFT_OF = 10;
            public static final int LAYOUT_CONSTRAINT_RIGHT_TO_RIGHT_OF = 11;
            public static final int LAYOUT_CONSTRAINT_START_TO_END_OF = 17;
            public static final int LAYOUT_CONSTRAINT_START_TO_START_OF = 18;
            public static final int LAYOUT_CONSTRAINT_TAG = 51;
            public static final int LAYOUT_CONSTRAINT_TOP_CREATOR = 40;
            public static final int LAYOUT_CONSTRAINT_TOP_TO_BOTTOM_OF = 13;
            public static final int LAYOUT_CONSTRAINT_TOP_TO_TOP_OF = 12;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_BIAS = 30;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE = 48;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_WEIGHT = 46;
            public static final int LAYOUT_CONSTRAINT_WIDTH = 64;
            public static final int LAYOUT_CONSTRAINT_WIDTH_DEFAULT = 31;
            public static final int LAYOUT_CONSTRAINT_WIDTH_MAX = 34;
            public static final int LAYOUT_CONSTRAINT_WIDTH_MIN = 33;
            public static final int LAYOUT_CONSTRAINT_WIDTH_PERCENT = 35;
            public static final int LAYOUT_EDITOR_ABSOLUTEX = 49;
            public static final int LAYOUT_EDITOR_ABSOLUTEY = 50;
            public static final int LAYOUT_GONE_MARGIN_BASELINE = 55;
            public static final int LAYOUT_GONE_MARGIN_BOTTOM = 24;
            public static final int LAYOUT_GONE_MARGIN_END = 26;
            public static final int LAYOUT_GONE_MARGIN_LEFT = 21;
            public static final int LAYOUT_GONE_MARGIN_RIGHT = 23;
            public static final int LAYOUT_GONE_MARGIN_START = 25;
            public static final int LAYOUT_GONE_MARGIN_TOP = 22;
            public static final int LAYOUT_MARGIN_BASELINE = 54;
            public static final int LAYOUT_WRAP_BEHAVIOR_IN_PARENT = 66;
            public static final int UNUSED = 0;
            public static final SparseIntArray sMap;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                sMap = sparseIntArray;
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintWidth, 64);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintHeight, 65);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toTopOf, 52);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBottomOf, 53);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_guidelineUseRtl, 67);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_goneMarginBaseline, 55);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_marginBaseline, 54);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_constraintTag, 51);
                sparseIntArray.append(C1528R.styleable.ConstraintLayout_Layout_layout_wrapBehaviorInParent, 66);
            }

            private Table() {
            }
        }

        @SuppressLint({"ClassVerificationFailure"})
        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.guidelineUseRtl = true;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.baselineToTop = -1;
            this.baselineToBottom = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = Integer.MIN_VALUE;
            this.goneTopMargin = Integer.MIN_VALUE;
            this.goneRightMargin = Integer.MIN_VALUE;
            this.goneBottomMargin = Integer.MIN_VALUE;
            this.goneStartMargin = Integer.MIN_VALUE;
            this.goneEndMargin = Integer.MIN_VALUE;
            this.goneBaselineMargin = Integer.MIN_VALUE;
            this.baselineMargin = 0;
            this.mWidthSet = true;
            this.mHeightSet = true;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.mDimensionRatioValue = 0.0f;
            this.mDimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.wrapBehaviorInParent = 0;
            this.mHorizontalDimensionFixed = true;
            this.mVerticalDimensionFixed = true;
            this.mNeedsBaseline = false;
            this.mIsGuideline = false;
            this.mIsHelper = false;
            this.mIsInPlaceholder = false;
            this.mIsVirtualGroup = false;
            this.mResolvedLeftToLeft = -1;
            this.mResolvedLeftToRight = -1;
            this.mResolvedRightToLeft = -1;
            this.mResolvedRightToRight = -1;
            this.mResolveGoneLeftMargin = Integer.MIN_VALUE;
            this.mResolveGoneRightMargin = Integer.MIN_VALUE;
            this.mResolvedHorizontalBias = 0.5f;
            this.mWidget = new ConstraintWidget();
            this.helped = false;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof LayoutParams) {
                LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                this.guideBegin = layoutParams2.guideBegin;
                this.guideEnd = layoutParams2.guideEnd;
                this.guidePercent = layoutParams2.guidePercent;
                this.guidelineUseRtl = layoutParams2.guidelineUseRtl;
                this.leftToLeft = layoutParams2.leftToLeft;
                this.leftToRight = layoutParams2.leftToRight;
                this.rightToLeft = layoutParams2.rightToLeft;
                this.rightToRight = layoutParams2.rightToRight;
                this.topToTop = layoutParams2.topToTop;
                this.topToBottom = layoutParams2.topToBottom;
                this.bottomToTop = layoutParams2.bottomToTop;
                this.bottomToBottom = layoutParams2.bottomToBottom;
                this.baselineToBaseline = layoutParams2.baselineToBaseline;
                this.baselineToTop = layoutParams2.baselineToTop;
                this.baselineToBottom = layoutParams2.baselineToBottom;
                this.circleConstraint = layoutParams2.circleConstraint;
                this.circleRadius = layoutParams2.circleRadius;
                this.circleAngle = layoutParams2.circleAngle;
                this.startToEnd = layoutParams2.startToEnd;
                this.startToStart = layoutParams2.startToStart;
                this.endToStart = layoutParams2.endToStart;
                this.endToEnd = layoutParams2.endToEnd;
                this.goneLeftMargin = layoutParams2.goneLeftMargin;
                this.goneTopMargin = layoutParams2.goneTopMargin;
                this.goneRightMargin = layoutParams2.goneRightMargin;
                this.goneBottomMargin = layoutParams2.goneBottomMargin;
                this.goneStartMargin = layoutParams2.goneStartMargin;
                this.goneEndMargin = layoutParams2.goneEndMargin;
                this.goneBaselineMargin = layoutParams2.goneBaselineMargin;
                this.baselineMargin = layoutParams2.baselineMargin;
                this.horizontalBias = layoutParams2.horizontalBias;
                this.verticalBias = layoutParams2.verticalBias;
                this.dimensionRatio = layoutParams2.dimensionRatio;
                this.mDimensionRatioValue = layoutParams2.mDimensionRatioValue;
                this.mDimensionRatioSide = layoutParams2.mDimensionRatioSide;
                this.horizontalWeight = layoutParams2.horizontalWeight;
                this.verticalWeight = layoutParams2.verticalWeight;
                this.horizontalChainStyle = layoutParams2.horizontalChainStyle;
                this.verticalChainStyle = layoutParams2.verticalChainStyle;
                this.constrainedWidth = layoutParams2.constrainedWidth;
                this.constrainedHeight = layoutParams2.constrainedHeight;
                this.matchConstraintDefaultWidth = layoutParams2.matchConstraintDefaultWidth;
                this.matchConstraintDefaultHeight = layoutParams2.matchConstraintDefaultHeight;
                this.matchConstraintMinWidth = layoutParams2.matchConstraintMinWidth;
                this.matchConstraintMaxWidth = layoutParams2.matchConstraintMaxWidth;
                this.matchConstraintMinHeight = layoutParams2.matchConstraintMinHeight;
                this.matchConstraintMaxHeight = layoutParams2.matchConstraintMaxHeight;
                this.matchConstraintPercentWidth = layoutParams2.matchConstraintPercentWidth;
                this.matchConstraintPercentHeight = layoutParams2.matchConstraintPercentHeight;
                this.editorAbsoluteX = layoutParams2.editorAbsoluteX;
                this.editorAbsoluteY = layoutParams2.editorAbsoluteY;
                this.orientation = layoutParams2.orientation;
                this.mHorizontalDimensionFixed = layoutParams2.mHorizontalDimensionFixed;
                this.mVerticalDimensionFixed = layoutParams2.mVerticalDimensionFixed;
                this.mNeedsBaseline = layoutParams2.mNeedsBaseline;
                this.mIsGuideline = layoutParams2.mIsGuideline;
                this.mResolvedLeftToLeft = layoutParams2.mResolvedLeftToLeft;
                this.mResolvedLeftToRight = layoutParams2.mResolvedLeftToRight;
                this.mResolvedRightToLeft = layoutParams2.mResolvedRightToLeft;
                this.mResolvedRightToRight = layoutParams2.mResolvedRightToRight;
                this.mResolveGoneLeftMargin = layoutParams2.mResolveGoneLeftMargin;
                this.mResolveGoneRightMargin = layoutParams2.mResolveGoneRightMargin;
                this.mResolvedHorizontalBias = layoutParams2.mResolvedHorizontalBias;
                this.constraintTag = layoutParams2.constraintTag;
                this.wrapBehaviorInParent = layoutParams2.wrapBehaviorInParent;
                this.mWidget = layoutParams2.mWidget;
                this.mWidthSet = layoutParams2.mWidthSet;
                this.mHeightSet = layoutParams2.mHeightSet;
            }
        }

        public void validate() {
            this.mIsGuideline = false;
            this.mHorizontalDimensionFixed = true;
            this.mVerticalDimensionFixed = true;
            int i11 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i11 == -2 && this.constrainedWidth) {
                this.mHorizontalDimensionFixed = false;
                if (this.matchConstraintDefaultWidth == 0) {
                    this.matchConstraintDefaultWidth = 1;
                }
            }
            int i12 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i12 == -2 && this.constrainedHeight) {
                this.mVerticalDimensionFixed = false;
                if (this.matchConstraintDefaultHeight == 0) {
                    this.matchConstraintDefaultHeight = 1;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.mHorizontalDimensionFixed = false;
                if (i11 == 0 && this.matchConstraintDefaultWidth == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.constrainedWidth = true;
                }
            }
            if (i12 == 0 || i12 == -1) {
                this.mVerticalDimensionFixed = false;
                if (i12 == 0 && this.matchConstraintDefaultHeight == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.constrainedHeight = true;
                }
            }
            if (this.guidePercent == -1.0f && this.guideBegin == -1 && this.guideEnd == -1) {
                return;
            }
            this.mIsGuideline = true;
            this.mHorizontalDimensionFixed = true;
            this.mVerticalDimensionFixed = true;
            if (!(this.mWidget instanceof androidx.constraintlayout.core.widgets.Guideline)) {
                this.mWidget = new androidx.constraintlayout.core.widgets.Guideline();
            }
            ((androidx.constraintlayout.core.widgets.Guideline) this.mWidget).setOrientation(this.orientation);
        }

        public String getConstraintTag() {
            return this.constraintTag;
        }

        public ConstraintWidget getConstraintWidget() {
            return this.mWidget;
        }

        public void reset() {
            ConstraintWidget constraintWidget = this.mWidget;
            if (constraintWidget != null) {
                constraintWidget.reset();
            }
        }

        /* JADX WARN: Code duplicated, block: B:17:0x004a  */
        /* JADX WARN: Code duplicated, block: B:20:0x0051  */
        /* JADX WARN: Code duplicated, block: B:23:0x0058  */
        /* JADX WARN: Code duplicated, block: B:26:0x005e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0064  */
        /* JADX WARN: Code duplicated, block: B:38:0x007a  */
        /* JADX WARN: Code duplicated, block: B:39:0x0082 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x0084  */
        /* JADX WARN: Code duplicated, block: B:41:0x008b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x008d  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        public void resolveLayoutDirection(int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            int i16 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i17 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i11);
            boolean z11 = false;
            boolean z12 = 1 == getLayoutDirection();
            this.mResolvedRightToLeft = -1;
            this.mResolvedRightToRight = -1;
            this.mResolvedLeftToLeft = -1;
            this.mResolvedLeftToRight = -1;
            this.mResolveGoneLeftMargin = this.goneLeftMargin;
            this.mResolveGoneRightMargin = this.goneRightMargin;
            float f11 = this.horizontalBias;
            this.mResolvedHorizontalBias = f11;
            int i18 = this.guideBegin;
            this.mResolvedGuideBegin = i18;
            int i19 = this.guideEnd;
            this.mResolvedGuideEnd = i19;
            float f12 = this.guidePercent;
            this.mResolvedGuidePercent = f12;
            if (z12) {
                int i21 = this.startToEnd;
                if (i21 != -1) {
                    this.mResolvedRightToLeft = i21;
                } else {
                    int i22 = this.startToStart;
                    if (i22 != -1) {
                        this.mResolvedRightToRight = i22;
                    } else {
                        i12 = this.endToStart;
                        if (i12 != -1) {
                            this.mResolvedLeftToRight = i12;
                            z11 = true;
                        }
                        i13 = this.endToEnd;
                        if (i13 != -1) {
                            this.mResolvedLeftToLeft = i13;
                            z11 = true;
                        }
                        i14 = this.goneStartMargin;
                        if (i14 != Integer.MIN_VALUE) {
                            this.mResolveGoneRightMargin = i14;
                        }
                        i15 = this.goneEndMargin;
                        if (i15 != Integer.MIN_VALUE) {
                            this.mResolveGoneLeftMargin = i15;
                        }
                        if (z11) {
                            this.mResolvedHorizontalBias = 1.0f - f11;
                        }
                        if (this.mIsGuideline && this.orientation == 1 && this.guidelineUseRtl) {
                            if (f12 != -1.0f) {
                                this.mResolvedGuidePercent = 1.0f - f12;
                                this.mResolvedGuideBegin = -1;
                                this.mResolvedGuideEnd = -1;
                            } else if (i18 != -1) {
                                this.mResolvedGuideEnd = i18;
                                this.mResolvedGuideBegin = -1;
                                this.mResolvedGuidePercent = -1.0f;
                            } else if (i19 != -1) {
                                this.mResolvedGuideBegin = i19;
                                this.mResolvedGuideEnd = -1;
                                this.mResolvedGuidePercent = -1.0f;
                            }
                        }
                    }
                }
                z11 = true;
                i12 = this.endToStart;
                if (i12 != -1) {
                    this.mResolvedLeftToRight = i12;
                    z11 = true;
                }
                i13 = this.endToEnd;
                if (i13 != -1) {
                    this.mResolvedLeftToLeft = i13;
                    z11 = true;
                }
                i14 = this.goneStartMargin;
                if (i14 != Integer.MIN_VALUE) {
                    this.mResolveGoneRightMargin = i14;
                }
                i15 = this.goneEndMargin;
                if (i15 != Integer.MIN_VALUE) {
                    this.mResolveGoneLeftMargin = i15;
                }
                if (z11) {
                    this.mResolvedHorizontalBias = 1.0f - f11;
                }
                if (this.mIsGuideline) {
                    if (f12 != -1.0f) {
                        this.mResolvedGuidePercent = 1.0f - f12;
                        this.mResolvedGuideBegin = -1;
                        this.mResolvedGuideEnd = -1;
                    } else if (i18 != -1) {
                        this.mResolvedGuideEnd = i18;
                        this.mResolvedGuideBegin = -1;
                        this.mResolvedGuidePercent = -1.0f;
                    } else if (i19 != -1) {
                        this.mResolvedGuideBegin = i19;
                        this.mResolvedGuideEnd = -1;
                        this.mResolvedGuidePercent = -1.0f;
                    }
                }
            } else {
                int i23 = this.startToEnd;
                if (i23 != -1) {
                    this.mResolvedLeftToRight = i23;
                }
                int i24 = this.startToStart;
                if (i24 != -1) {
                    this.mResolvedLeftToLeft = i24;
                }
                int i25 = this.endToStart;
                if (i25 != -1) {
                    this.mResolvedRightToLeft = i25;
                }
                int i26 = this.endToEnd;
                if (i26 != -1) {
                    this.mResolvedRightToRight = i26;
                }
                int i27 = this.goneStartMargin;
                if (i27 != Integer.MIN_VALUE) {
                    this.mResolveGoneLeftMargin = i27;
                }
                int i28 = this.goneEndMargin;
                if (i28 != Integer.MIN_VALUE) {
                    this.mResolveGoneRightMargin = i28;
                }
            }
            if (this.endToStart == -1 && this.endToEnd == -1 && this.startToStart == -1 && this.startToEnd == -1) {
                int i29 = this.rightToLeft;
                if (i29 != -1) {
                    this.mResolvedRightToLeft = i29;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i17 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i17;
                    }
                } else {
                    int i31 = this.rightToRight;
                    if (i31 != -1) {
                        this.mResolvedRightToRight = i31;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i17 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i17;
                        }
                    }
                }
                int i32 = this.leftToLeft;
                if (i32 != -1) {
                    this.mResolvedLeftToLeft = i32;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i16 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i16;
                    return;
                }
                int i33 = this.leftToRight;
                if (i33 != -1) {
                    this.mResolvedLeftToRight = i33;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i16 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i16;
                }
            }
        }

        public void setWidgetDebugName(String str) {
            this.mWidget.setDebugName(str);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.guidelineUseRtl = true;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.baselineToTop = -1;
            this.baselineToBottom = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = Integer.MIN_VALUE;
            this.goneTopMargin = Integer.MIN_VALUE;
            this.goneRightMargin = Integer.MIN_VALUE;
            this.goneBottomMargin = Integer.MIN_VALUE;
            this.goneStartMargin = Integer.MIN_VALUE;
            this.goneEndMargin = Integer.MIN_VALUE;
            this.goneBaselineMargin = Integer.MIN_VALUE;
            this.baselineMargin = 0;
            this.mWidthSet = true;
            this.mHeightSet = true;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.mDimensionRatioValue = 0.0f;
            this.mDimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.wrapBehaviorInParent = 0;
            this.mHorizontalDimensionFixed = true;
            this.mVerticalDimensionFixed = true;
            this.mNeedsBaseline = false;
            this.mIsGuideline = false;
            this.mIsHelper = false;
            this.mIsInPlaceholder = false;
            this.mIsVirtualGroup = false;
            this.mResolvedLeftToLeft = -1;
            this.mResolvedLeftToRight = -1;
            this.mResolvedRightToLeft = -1;
            this.mResolvedRightToRight = -1;
            this.mResolveGoneLeftMargin = Integer.MIN_VALUE;
            this.mResolveGoneRightMargin = Integer.MIN_VALUE;
            this.mResolvedHorizontalBias = 0.5f;
            this.mWidget = new ConstraintWidget();
            this.helped = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1528R.styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                int i12 = Table.sMap.get(index);
                switch (i12) {
                    case 1:
                        this.orientation = typedArrayObtainStyledAttributes.getInt(index, this.orientation);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.circleConstraint);
                        this.circleConstraint = resourceId;
                        if (resourceId == -1) {
                            this.circleConstraint = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.circleRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.circleRadius);
                        break;
                    case 4:
                        float f11 = typedArrayObtainStyledAttributes.getFloat(index, this.circleAngle) % 360.0f;
                        this.circleAngle = f11;
                        if (f11 < 0.0f) {
                            this.circleAngle = (360.0f - f11) % 360.0f;
                        }
                        break;
                    case 5:
                        this.guideBegin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.guideBegin);
                        break;
                    case 6:
                        this.guideEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.guideEnd);
                        break;
                    case 7:
                        this.guidePercent = typedArrayObtainStyledAttributes.getFloat(index, this.guidePercent);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.leftToLeft);
                        this.leftToLeft = resourceId2;
                        if (resourceId2 == -1) {
                            this.leftToLeft = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.leftToRight);
                        this.leftToRight = resourceId3;
                        if (resourceId3 == -1) {
                            this.leftToRight = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.rightToLeft);
                        this.rightToLeft = resourceId4;
                        if (resourceId4 == -1) {
                            this.rightToLeft = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.rightToRight);
                        this.rightToRight = resourceId5;
                        if (resourceId5 == -1) {
                            this.rightToRight = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.topToTop);
                        this.topToTop = resourceId6;
                        if (resourceId6 == -1) {
                            this.topToTop = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.topToBottom);
                        this.topToBottom = resourceId7;
                        if (resourceId7 == -1) {
                            this.topToBottom = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.bottomToTop);
                        this.bottomToTop = resourceId8;
                        if (resourceId8 == -1) {
                            this.bottomToTop = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.bottomToBottom);
                        this.bottomToBottom = resourceId9;
                        if (resourceId9 == -1) {
                            this.bottomToBottom = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.baselineToBaseline);
                        this.baselineToBaseline = resourceId10;
                        if (resourceId10 == -1) {
                            this.baselineToBaseline = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.startToEnd);
                        this.startToEnd = resourceId11;
                        if (resourceId11 == -1) {
                            this.startToEnd = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.startToStart);
                        this.startToStart = resourceId12;
                        if (resourceId12 == -1) {
                            this.startToStart = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.endToStart);
                        this.endToStart = resourceId13;
                        if (resourceId13 == -1) {
                            this.endToStart = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.endToEnd);
                        this.endToEnd = resourceId14;
                        if (resourceId14 == -1) {
                            this.endToEnd = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.goneLeftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneLeftMargin);
                        break;
                    case 22:
                        this.goneTopMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneTopMargin);
                        break;
                    case 23:
                        this.goneRightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneRightMargin);
                        break;
                    case 24:
                        this.goneBottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneBottomMargin);
                        break;
                    case 25:
                        this.goneStartMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneStartMargin);
                        break;
                    case 26:
                        this.goneEndMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneEndMargin);
                        break;
                    case 27:
                        this.constrainedWidth = typedArrayObtainStyledAttributes.getBoolean(index, this.constrainedWidth);
                        break;
                    case 28:
                        this.constrainedHeight = typedArrayObtainStyledAttributes.getBoolean(index, this.constrainedHeight);
                        break;
                    case 29:
                        this.horizontalBias = typedArrayObtainStyledAttributes.getFloat(index, this.horizontalBias);
                        break;
                    case 30:
                        this.verticalBias = typedArrayObtainStyledAttributes.getFloat(index, this.verticalBias);
                        break;
                    case 31:
                        int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.matchConstraintDefaultWidth = i13;
                        if (i13 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i14 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.matchConstraintDefaultHeight = i14;
                        if (i14 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.matchConstraintMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinWidth);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.matchConstraintMinWidth) == -2) {
                                this.matchConstraintMinWidth = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.matchConstraintMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxWidth);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.matchConstraintMaxWidth) == -2) {
                                this.matchConstraintMaxWidth = -2;
                            }
                        }
                        break;
                    case 35:
                        this.matchConstraintPercentWidth = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.matchConstraintPercentWidth));
                        this.matchConstraintDefaultWidth = 2;
                        break;
                    case 36:
                        try {
                            this.matchConstraintMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinHeight);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.matchConstraintMinHeight) == -2) {
                                this.matchConstraintMinHeight = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.matchConstraintMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxHeight);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.matchConstraintMaxHeight) == -2) {
                                this.matchConstraintMaxHeight = -2;
                            }
                        }
                        break;
                    case 38:
                        this.matchConstraintPercentHeight = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.matchConstraintPercentHeight));
                        this.matchConstraintDefaultHeight = 2;
                        break;
                    default:
                        switch (i12) {
                            case 44:
                                ConstraintSet.parseDimensionRatioString(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.horizontalWeight = typedArrayObtainStyledAttributes.getFloat(index, this.horizontalWeight);
                                break;
                            case 46:
                                this.verticalWeight = typedArrayObtainStyledAttributes.getFloat(index, this.verticalWeight);
                                break;
                            case 47:
                                this.horizontalChainStyle = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.verticalChainStyle = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.editorAbsoluteX = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteX);
                                break;
                            case 50:
                                this.editorAbsoluteY = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteY);
                                break;
                            case 51:
                                this.constraintTag = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.baselineToTop);
                                this.baselineToTop = resourceId15;
                                if (resourceId15 == -1) {
                                    this.baselineToTop = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.baselineToBottom);
                                this.baselineToBottom = resourceId16;
                                if (resourceId16 == -1) {
                                    this.baselineToBottom = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.baselineMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.baselineMargin);
                                break;
                            case 55:
                                this.goneBaselineMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneBaselineMargin);
                                break;
                            default:
                                switch (i12) {
                                    case 64:
                                        ConstraintSet.parseDimensionConstraints(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.mWidthSet = true;
                                        break;
                                    case 65:
                                        ConstraintSet.parseDimensionConstraints(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.mHeightSet = true;
                                        break;
                                    case 66:
                                        this.wrapBehaviorInParent = typedArrayObtainStyledAttributes.getInt(index, this.wrapBehaviorInParent);
                                        break;
                                    case 67:
                                        this.guidelineUseRtl = typedArrayObtainStyledAttributes.getBoolean(index, this.guidelineUseRtl);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            validate();
        }

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.guidelineUseRtl = true;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.baselineToTop = -1;
            this.baselineToBottom = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = Integer.MIN_VALUE;
            this.goneTopMargin = Integer.MIN_VALUE;
            this.goneRightMargin = Integer.MIN_VALUE;
            this.goneBottomMargin = Integer.MIN_VALUE;
            this.goneStartMargin = Integer.MIN_VALUE;
            this.goneEndMargin = Integer.MIN_VALUE;
            this.goneBaselineMargin = Integer.MIN_VALUE;
            this.baselineMargin = 0;
            this.mWidthSet = true;
            this.mHeightSet = true;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.mDimensionRatioValue = 0.0f;
            this.mDimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.wrapBehaviorInParent = 0;
            this.mHorizontalDimensionFixed = true;
            this.mVerticalDimensionFixed = true;
            this.mNeedsBaseline = false;
            this.mIsGuideline = false;
            this.mIsHelper = false;
            this.mIsInPlaceholder = false;
            this.mIsVirtualGroup = false;
            this.mResolvedLeftToLeft = -1;
            this.mResolvedLeftToRight = -1;
            this.mResolvedRightToLeft = -1;
            this.mResolvedRightToRight = -1;
            this.mResolveGoneLeftMargin = Integer.MIN_VALUE;
            this.mResolveGoneRightMargin = Integer.MIN_VALUE;
            this.mResolvedHorizontalBias = 0.5f;
            this.mWidget = new ConstraintWidget();
            this.helped = false;
        }
    }

    public class Measurer implements BasicMeasure.Measurer {
        ConstraintLayout mLayout;
        int mLayoutHeightSpec;
        int mLayoutWidthSpec;
        int mPaddingBottom;
        int mPaddingHeight;
        int mPaddingTop;
        int mPaddingWidth;

        private boolean isSimilarSpec(int i11, int i12, int i13) {
            if (i11 == i12) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i11);
            int mode2 = View.MeasureSpec.getMode(i12);
            int size = View.MeasureSpec.getSize(i12);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i13 == size;
            }
            return false;
        }

        public Measurer(ConstraintLayout constraintLayout) {
            this.mLayout = constraintLayout;
        }

        public void captureLayoutInfo(int i11, int i12, int i13, int i14, int i15, int i16) {
            this.mPaddingTop = i13;
            this.mPaddingBottom = i14;
            this.mPaddingWidth = i15;
            this.mPaddingHeight = i16;
            this.mLayoutWidthSpec = i11;
            this.mLayoutHeightSpec = i12;
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
        public final void didMeasures() {
            int childCount = this.mLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.mLayout.getChildAt(i11);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).updatePostMeasure(this.mLayout);
                }
            }
            int size = this.mLayout.mConstraintHelpers.size();
            if (size > 0) {
                for (int i12 = 0; i12 < size; i12++) {
                    ((ConstraintHelper) this.mLayout.mConstraintHelpers.get(i12)).updatePostMeasure(this.mLayout);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:111:0x01cf  */
        /* JADX WARN: Code duplicated, block: B:112:0x01d1  */
        /* JADX WARN: Code duplicated, block: B:114:0x01d4  */
        /* JADX WARN: Code duplicated, block: B:115:0x01d6  */
        /* JADX WARN: Code duplicated, block: B:122:0x01e2  */
        /* JADX WARN: Code duplicated, block: B:128:0x01ec  */
        /* JADX WARN: Code duplicated, block: B:134:0x01f8  */
        /* JADX WARN: Code duplicated, block: B:139:0x0203  */
        /* JADX WARN: Code duplicated, block: B:142:0x0208  */
        /* JADX WARN: Code duplicated, block: B:154:0x022f  */
        /* JADX WARN: Code duplicated, block: B:156:0x0233  */
        /* JADX WARN: Code duplicated, block: B:159:0x0241  */
        /* JADX WARN: Code duplicated, block: B:162:0x0257  */
        /* JADX WARN: Code duplicated, block: B:164:0x025e  */
        /* JADX WARN: Code duplicated, block: B:167:0x0264  */
        /* JADX WARN: Code duplicated, block: B:170:0x026c  */
        /* JADX WARN: Code duplicated, block: B:172:0x0273  */
        /* JADX WARN: Code duplicated, block: B:175:0x0279  */
        /* JADX WARN: Code duplicated, block: B:178:0x028c  */
        /* JADX WARN: Code duplicated, block: B:180:0x0290 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:182:0x0299 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:183:0x029b A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:186:0x02a5 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:189:0x02aa  */
        /* JADX WARN: Code duplicated, block: B:191:0x02ae  */
        /* JADX WARN: Code duplicated, block: B:192:0x02b3  */
        /* JADX WARN: Code duplicated, block: B:194:0x02b7  */
        /* JADX WARN: Code duplicated, block: B:195:0x02bc  */
        /* JADX WARN: Code duplicated, block: B:198:0x02d3  */
        /* JADX WARN: Code duplicated, block: B:199:0x02d5  */
        /* JADX WARN: Code duplicated, block: B:206:0x02e1  */
        /* JADX WARN: Code duplicated, block: B:209:0x02e8  */
        /* JADX WARN: Code duplicated, block: B:218:0x0307  */
        /* JADX WARN: Code duplicated, block: B:220:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:223:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:55:0x00de  */
        /* JADX WARN: Code duplicated, block: B:57:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:59:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:61:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:62:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:64:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:65:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:70:0x0101  */
        /* JADX WARN: Code duplicated, block: B:72:0x010b  */
        /* JADX WARN: Code duplicated, block: B:73:0x010d  */
        /* JADX WARN: Code duplicated, block: B:76:0x0114 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:83:0x0124  */
        /* JADX WARN: Code duplicated, block: B:84:0x012f  */
        /* JADX WARN: Code duplicated, block: B:85:0x013e  */
        /* JADX WARN: Code duplicated, block: B:86:0x0148  */
        @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
        @SuppressLint({"WrongCall"})
        public final void measure(ConstraintWidget constraintWidget, BasicMeasure.Measure measure) {
            long jNanoTime;
            int iMakeMeasureSpec;
            int childMeasureSpec;
            int i11;
            int iMakeMeasureSpec2;
            ConstraintWidgetContainer constraintWidgetContainer;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour;
            boolean z11;
            boolean z12;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            LayoutParams layoutParams;
            int i12;
            int measuredWidth;
            int measuredHeight;
            int baseline;
            int i13;
            int measuredWidth2;
            int i14;
            int i15;
            int i16;
            int measuredHeight2;
            int i17;
            int i18;
            int iMakeMeasureSpec3;
            int iMakeMeasureSpec4;
            int i19;
            boolean z17;
            boolean z18;
            boolean z19;
            int i21;
            boolean z21;
            if (constraintWidget == null) {
                return;
            }
            if (constraintWidget.getVisibility() == 8 && !constraintWidget.isInPlaceholder()) {
                measure.measuredWidth = 0;
                measure.measuredHeight = 0;
                measure.measuredBaseline = 0;
                return;
            }
            if (constraintWidget.getParent() == null) {
                return;
            }
            if (ConstraintLayout.this.mMetrics != null) {
                ConstraintLayout.this.mMetrics.mNumberOfMeasures++;
                jNanoTime = System.nanoTime();
            } else {
                jNanoTime = 0;
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = measure.horizontalBehavior;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = measure.verticalBehavior;
            int i22 = measure.horizontalDimension;
            int i23 = measure.verticalDimension;
            int i24 = this.mPaddingTop + this.mPaddingBottom;
            int i25 = this.mPaddingWidth;
            View view = (View) constraintWidget.getCompanionWidget();
            int[] iArr = C15271.f2217x6d00e4a2;
            int i26 = iArr[dimensionBehaviour3.ordinal()];
            if (i26 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i22, 1073741824);
            } else if (i26 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.mLayoutWidthSpec, i25, -2);
            } else {
                if (i26 != 3) {
                    if (i26 != 4) {
                        childMeasureSpec = 0;
                    } else {
                        childMeasureSpec = ViewGroup.getChildMeasureSpec(this.mLayoutWidthSpec, i25, -2);
                        boolean z22 = constraintWidget.mMatchConstraintDefaultWidth == 1;
                        int i27 = measure.measureStrategy;
                        if (i27 == BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS || i27 == BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) {
                            boolean z23 = view.getMeasuredHeight() == constraintWidget.getHeight();
                            if (measure.measureStrategy == BasicMeasure.Measure.USE_GIVEN_DIMENSIONS || !z22 || ((z22 && z23) || (view instanceof Placeholder) || constraintWidget.isResolvedHorizontally())) {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(constraintWidget.getWidth(), 1073741824);
                            }
                        }
                    }
                    i11 = iArr[dimensionBehaviour4.ordinal()];
                    if (i11 != 1) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i23, 1073741824);
                    } else if (i11 != 2) {
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.mLayoutHeightSpec, i24, -2);
                    } else if (i11 != 3) {
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.mLayoutHeightSpec, i24 + constraintWidget.getVerticalMargin(), -1);
                    } else if (i11 != 4) {
                        iMakeMeasureSpec2 = 0;
                    } else {
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.mLayoutHeightSpec, i24, -2);
                        if (constraintWidget.mMatchConstraintDefaultHeight == 1) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        i21 = measure.measureStrategy;
                        if (i21 != BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS || i21 == BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) {
                            if (view.getMeasuredWidth() == constraintWidget.getWidth()) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            if (measure.measureStrategy != BasicMeasure.Measure.USE_GIVEN_DIMENSIONS || !z19 || ((z19 && z21) || (view instanceof Placeholder) || constraintWidget.isResolvedVertically())) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.getHeight(), 1073741824);
                            }
                        }
                    }
                    constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget.getParent();
                    if (constraintWidgetContainer == null && Optimizer.enabled(ConstraintLayout.this.mOptimizationLevel, 256) && view.getMeasuredWidth() == constraintWidget.getWidth() && view.getMeasuredWidth() < constraintWidgetContainer.getWidth() && view.getMeasuredHeight() == constraintWidget.getHeight() && view.getMeasuredHeight() < constraintWidgetContainer.getHeight() && view.getBaseline() == constraintWidget.getBaselineDistance() && !constraintWidget.isMeasureRequested() && isSimilarSpec(constraintWidget.getLastHorizontalMeasureSpec(), childMeasureSpec, constraintWidget.getWidth()) && isSimilarSpec(constraintWidget.getLastVerticalMeasureSpec(), iMakeMeasureSpec2, constraintWidget.getHeight())) {
                        measure.measuredWidth = constraintWidget.getWidth();
                        measure.measuredHeight = constraintWidget.getHeight();
                        measure.measuredBaseline = constraintWidget.getBaselineDistance();
                        return;
                    }
                    dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour3 == dimensionBehaviour) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (dimensionBehaviour4 == dimensionBehaviour) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                    if (dimensionBehaviour4 != dimensionBehaviour2 || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (dimensionBehaviour3 != dimensionBehaviour2 || dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.FIXED) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z11 || constraintWidget.mDimensionRatio <= 0.0f) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    if (z12 || constraintWidget.mDimensionRatio <= 0.0f) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    if (view == null) {
                        return;
                    }
                    layoutParams = (LayoutParams) view.getLayoutParams();
                    i12 = measure.measureStrategy;
                    boolean z24 = z14;
                    if (i12 == BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS && i12 != BasicMeasure.Measure.USE_GIVEN_DIMENSIONS && z11 && constraintWidget.mMatchConstraintDefaultWidth == 0 && z12 && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                        measuredHeight2 = 0;
                        i19 = -1;
                        baseline = 0;
                        measuredWidth2 = 0;
                    } else {
                        if ((view instanceof VirtualLayout) || !(constraintWidget instanceof androidx.constraintlayout.core.widgets.VirtualLayout)) {
                            view.measure(childMeasureSpec, iMakeMeasureSpec2);
                        } else {
                            ((VirtualLayout) view).onMeasure((androidx.constraintlayout.core.widgets.VirtualLayout) constraintWidget, childMeasureSpec, iMakeMeasureSpec2);
                        }
                        constraintWidget.setLastMeasureSpec(childMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth = view.getMeasuredWidth();
                        measuredHeight = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        i13 = constraintWidget.mMatchConstraintMinWidth;
                        if (i13 > 0) {
                            measuredWidth2 = Math.max(i13, measuredWidth);
                        } else {
                            measuredWidth2 = measuredWidth;
                        }
                        i14 = iMakeMeasureSpec2;
                        i15 = constraintWidget.mMatchConstraintMaxWidth;
                        if (i15 > 0) {
                            measuredWidth2 = Math.min(i15, measuredWidth2);
                        }
                        i16 = constraintWidget.mMatchConstraintMinHeight;
                        if (i16 > 0) {
                            measuredHeight2 = Math.max(i16, measuredHeight);
                        } else {
                            measuredHeight2 = measuredHeight;
                        }
                        i17 = childMeasureSpec;
                        i18 = constraintWidget.mMatchConstraintMaxHeight;
                        if (i18 > 0) {
                            measuredHeight2 = Math.min(i18, measuredHeight2);
                        }
                        if (!Optimizer.enabled(ConstraintLayout.this.mOptimizationLevel, 1)) {
                            if (!z15 && z13) {
                                measuredWidth2 = (int) ((measuredHeight2 * constraintWidget.mDimensionRatio) + 0.5f);
                            } else if (z16 && z24) {
                                measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                            }
                        }
                        if (measuredWidth == measuredWidth2 || measuredHeight != measuredHeight2) {
                            if (measuredWidth != measuredWidth2) {
                                iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                            } else {
                                iMakeMeasureSpec3 = i17;
                            }
                            if (measuredHeight != measuredHeight2) {
                                iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                            } else {
                                iMakeMeasureSpec4 = i14;
                            }
                            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                            constraintWidget.setLastMeasureSpec(iMakeMeasureSpec3, iMakeMeasureSpec4);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        }
                        i19 = -1;
                    }
                    if (baseline != i19) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (measuredWidth2 == measure.horizontalDimension || measuredHeight2 != measure.verticalDimension) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    measure.measuredNeedsSolverPass = z18;
                    if (layoutParams.mNeedsBaseline) {
                        z17 = true;
                    }
                    if (z17 && baseline != -1 && constraintWidget.getBaselineDistance() != baseline) {
                        measure.measuredNeedsSolverPass = true;
                    }
                    measure.measuredWidth = measuredWidth2;
                    measure.measuredHeight = measuredHeight2;
                    measure.measuredHasBaseline = z17;
                    measure.measuredBaseline = baseline;
                    if (ConstraintLayout.this.mMetrics != null) {
                        long jNanoTime2 = System.nanoTime();
                        ConstraintLayout.this.mMetrics.measuresWidgetsDuration += jNanoTime2 - jNanoTime;
                    }
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.mLayoutWidthSpec, i25 + constraintWidget.getHorizontalMargin(), -1);
            }
            childMeasureSpec = iMakeMeasureSpec;
            i11 = iArr[dimensionBehaviour4.ordinal()];
            if (i11 != 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i23, 1073741824);
            } else if (i11 != 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.mLayoutHeightSpec, i24, -2);
            } else if (i11 != 3) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.mLayoutHeightSpec, i24 + constraintWidget.getVerticalMargin(), -1);
            } else if (i11 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.mLayoutHeightSpec, i24, -2);
                if (constraintWidget.mMatchConstraintDefaultHeight == 1) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                i21 = measure.measureStrategy;
                if (i21 != BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS) {
                    if (view.getMeasuredWidth() == constraintWidget.getWidth()) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if (measure.measureStrategy != BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.getHeight(), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.getHeight(), 1073741824);
                    }
                } else {
                    if (view.getMeasuredWidth() == constraintWidget.getWidth()) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if (measure.measureStrategy != BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.getHeight(), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.getHeight(), 1073741824);
                    }
                }
            }
            constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget.getParent();
            if (constraintWidgetContainer == null) {
            }
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour3 == dimensionBehaviour) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (dimensionBehaviour4 == dimensionBehaviour) {
                z12 = true;
            } else {
                z12 = false;
            }
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour4 != dimensionBehaviour2) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (dimensionBehaviour3 != dimensionBehaviour2) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (z11) {
                z15 = false;
            } else {
                z15 = false;
            }
            if (z12) {
                z16 = false;
            } else {
                z16 = false;
            }
            if (view == null) {
                return;
            }
            layoutParams = (LayoutParams) view.getLayoutParams();
            i12 = measure.measureStrategy;
            boolean z25 = z14;
            if (i12 == BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS) {
                if (view instanceof VirtualLayout) {
                    view.measure(childMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(childMeasureSpec, iMakeMeasureSpec2);
                }
                constraintWidget.setLastMeasureSpec(childMeasureSpec, iMakeMeasureSpec2);
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                i13 = constraintWidget.mMatchConstraintMinWidth;
                if (i13 > 0) {
                    measuredWidth2 = Math.max(i13, measuredWidth);
                } else {
                    measuredWidth2 = measuredWidth;
                }
                i14 = iMakeMeasureSpec2;
                i15 = constraintWidget.mMatchConstraintMaxWidth;
                if (i15 > 0) {
                    measuredWidth2 = Math.min(i15, measuredWidth2);
                }
                i16 = constraintWidget.mMatchConstraintMinHeight;
                if (i16 > 0) {
                    measuredHeight2 = Math.max(i16, measuredHeight);
                } else {
                    measuredHeight2 = measuredHeight;
                }
                i17 = childMeasureSpec;
                i18 = constraintWidget.mMatchConstraintMaxHeight;
                if (i18 > 0) {
                    measuredHeight2 = Math.min(i18, measuredHeight2);
                }
                if (!Optimizer.enabled(ConstraintLayout.this.mOptimizationLevel, 1)) {
                    if (!z15) {
                        if (z16) {
                            measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                        }
                    } else if (z16) {
                        measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                    }
                }
                if (measuredWidth == measuredWidth2) {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    } else {
                        iMakeMeasureSpec3 = i17;
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    } else {
                        iMakeMeasureSpec4 = i14;
                    }
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    constraintWidget.setLastMeasureSpec(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                } else {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    } else {
                        iMakeMeasureSpec3 = i17;
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    } else {
                        iMakeMeasureSpec4 = i14;
                    }
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    constraintWidget.setLastMeasureSpec(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i19 = -1;
            } else {
                if (view instanceof VirtualLayout) {
                    view.measure(childMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(childMeasureSpec, iMakeMeasureSpec2);
                }
                constraintWidget.setLastMeasureSpec(childMeasureSpec, iMakeMeasureSpec2);
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                i13 = constraintWidget.mMatchConstraintMinWidth;
                if (i13 > 0) {
                    measuredWidth2 = Math.max(i13, measuredWidth);
                } else {
                    measuredWidth2 = measuredWidth;
                }
                i14 = iMakeMeasureSpec2;
                i15 = constraintWidget.mMatchConstraintMaxWidth;
                if (i15 > 0) {
                    measuredWidth2 = Math.min(i15, measuredWidth2);
                }
                i16 = constraintWidget.mMatchConstraintMinHeight;
                if (i16 > 0) {
                    measuredHeight2 = Math.max(i16, measuredHeight);
                } else {
                    measuredHeight2 = measuredHeight;
                }
                i17 = childMeasureSpec;
                i18 = constraintWidget.mMatchConstraintMaxHeight;
                if (i18 > 0) {
                    measuredHeight2 = Math.min(i18, measuredHeight2);
                }
                if (!Optimizer.enabled(ConstraintLayout.this.mOptimizationLevel, 1)) {
                    if (!z15) {
                        if (z16) {
                            measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                        }
                    } else if (z16) {
                        measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                    }
                }
                if (measuredWidth == measuredWidth2) {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    } else {
                        iMakeMeasureSpec3 = i17;
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    } else {
                        iMakeMeasureSpec4 = i14;
                    }
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    constraintWidget.setLastMeasureSpec(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                } else {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    } else {
                        iMakeMeasureSpec3 = i17;
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    } else {
                        iMakeMeasureSpec4 = i14;
                    }
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    constraintWidget.setLastMeasureSpec(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i19 = -1;
            }
            if (baseline != i19) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (measuredWidth2 == measure.horizontalDimension) {
                z18 = true;
            } else {
                z18 = true;
            }
            measure.measuredNeedsSolverPass = z18;
            if (layoutParams.mNeedsBaseline) {
                z17 = true;
            }
            if (z17) {
                measure.measuredNeedsSolverPass = true;
            }
            measure.measuredWidth = measuredWidth2;
            measure.measuredHeight = measuredHeight2;
            measure.measuredHasBaseline = z17;
            measure.measuredBaseline = baseline;
            if (ConstraintLayout.this.mMetrics != null) {
                long jNanoTime3 = System.nanoTime();
                ConstraintLayout.this.mMetrics.measuresWidgetsDuration += jNanoTime3 - jNanoTime;
            }
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public interface ValueModifier {
        boolean update(int i11, int i12, int i13, View view, LayoutParams layoutParams);
    }

    public ConstraintLayout(@NonNull Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(null, 0, 0);
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0174  */
    /* JADX WARN: Code duplicated, block: B:78:0x017d  */
    public void applyConstraintsFromLayoutParams(boolean z11, View view, ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5;
        LayoutParams layoutParams2;
        ConstraintWidget constraintWidget6;
        float f11;
        int i11;
        layoutParams.validate();
        layoutParams.helped = false;
        constraintWidget.setVisibility(view.getVisibility());
        if (layoutParams.mIsInPlaceholder) {
            constraintWidget.setInPlaceholder(true);
            constraintWidget.setVisibility(8);
        }
        constraintWidget.setCompanionWidget(view);
        if (view instanceof ConstraintHelper) {
            ((ConstraintHelper) view).resolveRtl(constraintWidget, this.mLayoutWidget.isRtl());
        }
        if (layoutParams.mIsGuideline) {
            androidx.constraintlayout.core.widgets.Guideline guideline = (androidx.constraintlayout.core.widgets.Guideline) constraintWidget;
            int i12 = layoutParams.mResolvedGuideBegin;
            int i13 = layoutParams.mResolvedGuideEnd;
            float f12 = layoutParams.mResolvedGuidePercent;
            if (f12 != -1.0f) {
                guideline.setGuidePercent(f12);
                return;
            } else if (i12 != -1) {
                guideline.setGuideBegin(i12);
                return;
            } else {
                if (i13 != -1) {
                    guideline.setGuideEnd(i13);
                    return;
                }
                return;
            }
        }
        int i14 = layoutParams.mResolvedLeftToLeft;
        int i15 = layoutParams.mResolvedLeftToRight;
        int i16 = layoutParams.mResolvedRightToLeft;
        int i17 = layoutParams.mResolvedRightToRight;
        int i18 = layoutParams.mResolveGoneLeftMargin;
        int i19 = layoutParams.mResolveGoneRightMargin;
        float f13 = layoutParams.mResolvedHorizontalBias;
        int i21 = layoutParams.circleConstraint;
        if (i21 != -1) {
            ConstraintWidget constraintWidget7 = sparseArray.get(i21);
            if (constraintWidget7 != null) {
                constraintWidget.connectCircularConstraint(constraintWidget7, layoutParams.circleAngle, layoutParams.circleRadius);
            }
            constraintWidget6 = constraintWidget;
            layoutParams2 = layoutParams;
        } else {
            if (i14 != -1) {
                ConstraintWidget constraintWidget8 = sparseArray.get(i14);
                if (constraintWidget8 != null) {
                    ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                    constraintWidget.immediateConnect(type, constraintWidget8, type, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i18);
                }
            } else if (i15 != -1 && (constraintWidget2 = sparseArray.get(i15)) != null) {
                constraintWidget.immediateConnect(ConstraintAnchor.Type.LEFT, constraintWidget2, ConstraintAnchor.Type.RIGHT, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i18);
            }
            if (i16 != -1) {
                ConstraintWidget constraintWidget9 = sparseArray.get(i16);
                if (constraintWidget9 != null) {
                    constraintWidget.immediateConnect(ConstraintAnchor.Type.RIGHT, constraintWidget9, ConstraintAnchor.Type.LEFT, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i19);
                }
            } else if (i17 != -1 && (constraintWidget3 = sparseArray.get(i17)) != null) {
                ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.immediateConnect(type2, constraintWidget3, type2, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i19);
            }
            int i22 = layoutParams.topToTop;
            if (i22 != -1) {
                ConstraintWidget constraintWidget10 = sparseArray.get(i22);
                if (constraintWidget10 != null) {
                    ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
                    constraintWidget.immediateConnect(type3, constraintWidget10, type3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.goneTopMargin);
                }
            } else {
                int i23 = layoutParams.topToBottom;
                if (i23 != -1 && (constraintWidget4 = sparseArray.get(i23)) != null) {
                    constraintWidget.immediateConnect(ConstraintAnchor.Type.TOP, constraintWidget4, ConstraintAnchor.Type.BOTTOM, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.goneTopMargin);
                }
            }
            int i24 = layoutParams.bottomToTop;
            if (i24 != -1) {
                ConstraintWidget constraintWidget11 = sparseArray.get(i24);
                if (constraintWidget11 != null) {
                    constraintWidget.immediateConnect(ConstraintAnchor.Type.BOTTOM, constraintWidget11, ConstraintAnchor.Type.TOP, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.goneBottomMargin);
                }
            } else {
                int i25 = layoutParams.bottomToBottom;
                if (i25 != -1 && (constraintWidget5 = sparseArray.get(i25)) != null) {
                    ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
                    constraintWidget.immediateConnect(type4, constraintWidget5, type4, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.goneBottomMargin);
                }
            }
            int i26 = layoutParams.baselineToBaseline;
            if (i26 != -1) {
                layoutParams2 = layoutParams;
                setWidgetBaseline(constraintWidget, layoutParams2, sparseArray, i26, ConstraintAnchor.Type.BASELINE);
            } else {
                layoutParams2 = layoutParams;
                int i27 = layoutParams2.baselineToTop;
                if (i27 != -1) {
                    setWidgetBaseline(constraintWidget, layoutParams2, sparseArray, i27, ConstraintAnchor.Type.TOP);
                } else {
                    int i28 = layoutParams2.baselineToBottom;
                    if (i28 != -1) {
                        setWidgetBaseline(constraintWidget, layoutParams2, sparseArray, i28, ConstraintAnchor.Type.BOTTOM);
                        constraintWidget6 = constraintWidget;
                    }
                    if (f13 >= 0.0f) {
                        constraintWidget6.setHorizontalBiasPercent(f13);
                    }
                    f11 = layoutParams2.verticalBias;
                    if (f11 >= 0.0f) {
                        constraintWidget6.setVerticalBiasPercent(f11);
                    }
                }
            }
            constraintWidget6 = constraintWidget;
            if (f13 >= 0.0f) {
                constraintWidget6.setHorizontalBiasPercent(f13);
            }
            f11 = layoutParams2.verticalBias;
            if (f11 >= 0.0f) {
                constraintWidget6.setVerticalBiasPercent(f11);
            }
        }
        if (z11 && ((i11 = layoutParams2.editorAbsoluteX) != -1 || layoutParams2.editorAbsoluteY != -1)) {
            constraintWidget6.setOrigin(i11, layoutParams2.editorAbsoluteY);
        }
        if (layoutParams2.mHorizontalDimensionFixed) {
            constraintWidget6.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget6.setWidth(((ViewGroup.MarginLayoutParams) layoutParams2).width);
            if (((ViewGroup.MarginLayoutParams) layoutParams2).width == -2) {
                constraintWidget6.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams2).width == -1) {
            if (layoutParams2.constrainedWidth) {
                constraintWidget6.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            } else {
                constraintWidget6.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            }
            constraintWidget6.getAnchor(ConstraintAnchor.Type.LEFT).mMargin = ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
            constraintWidget6.getAnchor(ConstraintAnchor.Type.RIGHT).mMargin = ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
        } else {
            constraintWidget6.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            constraintWidget6.setWidth(0);
        }
        if (layoutParams2.mVerticalDimensionFixed) {
            constraintWidget6.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget6.setHeight(((ViewGroup.MarginLayoutParams) layoutParams2).height);
            if (((ViewGroup.MarginLayoutParams) layoutParams2).height == -2) {
                constraintWidget6.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams2).height == -1) {
            if (layoutParams2.constrainedHeight) {
                constraintWidget6.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            } else {
                constraintWidget6.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            }
            constraintWidget6.getAnchor(ConstraintAnchor.Type.TOP).mMargin = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
            constraintWidget6.getAnchor(ConstraintAnchor.Type.BOTTOM).mMargin = ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        } else {
            constraintWidget6.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            constraintWidget6.setHeight(0);
        }
        constraintWidget6.setDimensionRatio(layoutParams2.dimensionRatio);
        constraintWidget6.setHorizontalWeight(layoutParams2.horizontalWeight);
        constraintWidget6.setVerticalWeight(layoutParams2.verticalWeight);
        constraintWidget6.setHorizontalChainStyle(layoutParams2.horizontalChainStyle);
        constraintWidget6.setVerticalChainStyle(layoutParams2.verticalChainStyle);
        constraintWidget6.setWrapBehaviorInParent(layoutParams2.wrapBehaviorInParent);
        constraintWidget6.setHorizontalMatchStyle(layoutParams2.matchConstraintDefaultWidth, layoutParams2.matchConstraintMinWidth, layoutParams2.matchConstraintMaxWidth, layoutParams2.matchConstraintPercentWidth);
        constraintWidget6.setVerticalMatchStyle(layoutParams2.matchConstraintDefaultHeight, layoutParams2.matchConstraintMinHeight, layoutParams2.matchConstraintMaxHeight, layoutParams2.matchConstraintPercentHeight);
    }

    public void loadLayoutDescription(int i11) {
        if (i11 == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new ConstraintLayoutStates(getContext(), this, i11);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$1 */
    public static /* synthetic */ class C15271 {

        /* JADX INFO: renamed from: $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour */
        static final /* synthetic */ int[] f2217x6d00e4a2;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            f2217x6d00e4a2 = iArr;
            try {
                iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2217x6d00e4a2[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2217x6d00e4a2[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2217x6d00e4a2[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static SharedValues getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new SharedValues();
        }
        return sSharedValues;
    }

    private ConstraintWidget getTargetWidget(int i11) {
        if (i11 == 0) {
            return this.mLayoutWidget;
        }
        View viewFindViewById = this.mChildrenByIds.get(i11);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i11)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.mLayoutWidget;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((LayoutParams) viewFindViewById.getLayoutParams()).mWidget;
    }

    private void init(AttributeSet attributeSet, int i11, int i12) {
        this.mLayoutWidget.setCompanionWidget(this);
        this.mLayoutWidget.setMeasurer(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1528R.styleable.ConstraintLayout_Layout, i11, i12);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i13);
                if (index == C1528R.styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == C1528R.styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == C1528R.styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == C1528R.styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == C1528R.styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.mOptimizationLevel = typedArrayObtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == C1528R.styleable.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == C1528R.styleable.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.load(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.setOptimizationLevel(this.mOptimizationLevel);
    }

    private void setWidgetBaseline(ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray, int i11, ConstraintAnchor.Type type) {
        View view = this.mChildrenByIds.get(i11);
        ConstraintWidget constraintWidget2 = sparseArray.get(i11);
        if (constraintWidget2 == null || view == null || !(view.getLayoutParams() instanceof LayoutParams)) {
            return;
        }
        layoutParams.mNeedsBaseline = true;
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.BASELINE;
        if (type == type2) {
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            layoutParams2.mNeedsBaseline = true;
            layoutParams2.mWidget.setHasBaseline(true);
        }
        constraintWidget.getAnchor(type2).connect(constraintWidget2.getAnchor(type), layoutParams.baselineMargin, layoutParams.goneBaselineMargin, true);
        constraintWidget.setHasBaseline(true);
        constraintWidget.getAnchor(ConstraintAnchor.Type.TOP).reset();
        constraintWidget.getAnchor(ConstraintAnchor.Type.BOTTOM).reset();
    }

    public void addValueModifier(ValueModifier valueModifier) {
        if (this.mModifiers == null) {
            this.mModifiers = new ArrayList<>();
        }
        this.mModifiers.add(valueModifier);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                this.mConstraintHelpers.get(i11).updatePreDraw(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i13 = Integer.parseInt(strArrSplit[0]);
                        int i14 = Integer.parseInt(strArrSplit[1]);
                        int i15 = Integer.parseInt(strArrSplit[2]);
                        int i16 = (int) ((i13 / 1080.0f) * width);
                        int i17 = (int) ((i14 / 1920.0f) * height);
                        int i18 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(SupportMenu.CATEGORY_MASK);
                        float f11 = i16;
                        float f12 = i17;
                        float f13 = i16 + ((int) ((i15 / 1080.0f) * width));
                        canvas.drawLine(f11, f12, f13, f12, paint);
                        float f14 = i17 + i18;
                        canvas.drawLine(f13, f12, f13, f14, paint);
                        canvas.drawLine(f13, f14, f11, f14, paint);
                        canvas.drawLine(f11, f14, f11, f12, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f11, f12, f13, f14, paint);
                        canvas.drawLine(f11, f14, f13, f12, paint);
                    }
                }
            }
        }
    }

    public boolean dynamicUpdateConstraints(int i11, int i12) {
        boolean zUpdate = false;
        if (this.mModifiers == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        for (ValueModifier valueModifier : this.mModifiers) {
            Iterator<ConstraintWidget> it = this.mLayoutWidget.getChildren().iterator();
            while (it.hasNext()) {
                View view = (View) it.next().getCompanionWidget();
                zUpdate |= valueModifier.update(size, size2, view.getId(), view, (LayoutParams) view.getLayoutParams());
            }
        }
        return zUpdate;
    }

    public void fillMetrics(Metrics metrics) {
        this.mMetrics = metrics;
        this.mLayoutWidget.fillMetrics(metrics);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public Object getDesignInformation(int i11, Object obj) {
        if (i11 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.mDesignIds;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.getOptimizationLevel();
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.mLayoutWidget.stringId == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.mLayoutWidget.stringId = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.mLayoutWidget.stringId = "parent";
            }
        }
        if (this.mLayoutWidget.getDebugName() == null) {
            ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
            constraintWidgetContainer.setDebugName(constraintWidgetContainer.stringId);
            Log.v(TAG, " setDebugName " + this.mLayoutWidget.getDebugName());
        }
        for (ConstraintWidget constraintWidget : this.mLayoutWidget.getChildren()) {
            View view = (View) constraintWidget.getCompanionWidget();
            if (view != null) {
                if (constraintWidget.stringId == null && (id2 = view.getId()) != -1) {
                    constraintWidget.stringId = getContext().getResources().getResourceEntryName(id2);
                }
                if (constraintWidget.getDebugName() == null) {
                    constraintWidget.setDebugName(constraintWidget.stringId);
                    Log.v(TAG, " setDebugName " + constraintWidget.getDebugName());
                }
            }
        }
        this.mLayoutWidget.getSceneString(sb2);
        return sb2.toString();
    }

    public View getViewById(int i11) {
        return this.mChildrenByIds.get(i11);
    }

    public final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).mWidget;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).mWidget;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        View content;
        Metrics metrics = this.mMetrics;
        if (metrics != null) {
            metrics.mNumberOfLayouts++;
        }
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.mWidget;
            if ((childAt.getVisibility() != 8 || layoutParams.mIsGuideline || layoutParams.mIsHelper || layoutParams.mIsVirtualGroup || zIsInEditMode) && !layoutParams.mIsInPlaceholder) {
                int x11 = constraintWidget.getX();
                int y11 = constraintWidget.getY();
                int width = constraintWidget.getWidth() + x11;
                int height = constraintWidget.getHeight() + y11;
                childAt.layout(x11, y11, width, height);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(x11, y11, width, height);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i16 = 0; i16 < size; i16++) {
                this.mConstraintHelpers.get(i16).updatePostLayout(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        long jNanoTime;
        if (this.mMetrics != null) {
            jNanoTime = System.nanoTime();
            this.mMetrics.mChildCount = getChildCount();
            this.mMetrics.mMeasureCalls++;
        } else {
            jNanoTime = 0;
        }
        boolean zDynamicUpdateConstraints = this.mDirtyHierarchy | dynamicUpdateConstraints(i11, i12);
        this.mDirtyHierarchy = zDynamicUpdateConstraints;
        if (!zDynamicUpdateConstraints) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                if (getChildAt(i13).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
            }
        }
        this.mOnMeasureWidthMeasureSpec = i11;
        this.mOnMeasureHeightMeasureSpec = i12;
        this.mLayoutWidget.setRtl(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                this.mLayoutWidget.updateHierarchy();
            }
        }
        this.mLayoutWidget.fillMetrics(this.mMetrics);
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i11, i12);
        resolveMeasuredDimension(i11, i12, this.mLayoutWidget.getWidth(), this.mLayoutWidget.getHeight(), this.mLayoutWidget.isWidthMeasuredTooSmall(), this.mLayoutWidget.isHeightMeasuredTooSmall());
        Metrics metrics = this.mMetrics;
        if (metrics != null) {
            metrics.mMeasureDuration += System.nanoTime() - jNanoTime;
        }
    }

    public void parseLayoutDescription(int i11) {
        this.mConstraintLayoutSpec = new ConstraintLayoutStates(getContext(), this, i11);
    }

    public void removeValueModifier(ValueModifier valueModifier) {
        if (valueModifier == null) {
            return;
        }
        this.mModifiers.remove(valueModifier);
    }

    public void resolveMeasuredDimension(int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
        Measurer measurer = this.mMeasurer;
        int i15 = measurer.mPaddingHeight;
        int iResolveSizeAndState = View.resolveSizeAndState(i13 + measurer.mPaddingWidth, i11, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i14 + i15, i12, 0) & 16777215;
        int iMin = Math.min(this.mMaxWidth, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.mMaxHeight, iResolveSizeAndState2);
        if (z11) {
            iMin |= 16777216;
        }
        if (z12) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.mLastMeasureWidth = iMin;
        this.mLastMeasureHeight = iMin2;
    }

    public void setConstraintSet(ConstraintSet constraintSet) {
        this.mConstraintSet = constraintSet;
    }

    public void setDesignInformation(int i11, Object obj, Object obj2) {
        if (i11 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.mDesignIds.put(strSubstring, num);
        }
    }

    @Override // android.view.View
    public void setId(int i11) {
        this.mChildrenByIds.remove(getId());
        super.setId(i11);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i11) {
        if (i11 == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i11;
        requestLayout();
    }

    public void setMaxWidth(int i11) {
        if (i11 == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i11;
        requestLayout();
    }

    public void setMinHeight(int i11) {
        if (i11 == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i11;
        requestLayout();
    }

    public void setMinWidth(int i11) {
        if (i11 == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i11;
        requestLayout();
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.setOnConstraintsChanged(constraintsChangedListener);
        }
    }

    public void setOptimizationLevel(int i11) {
        this.mOptimizationLevel = i11;
        this.mLayoutWidget.setOptimizationLevel(i11);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r2
      0x003e: PHI (r2v4 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour) = 
      (r2v3 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
      (r2v0 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
     binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    public void setSelfDimensionBehaviour(ConstraintWidgetContainer constraintWidgetContainer, int i11, int i12, int i13, int i14) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        Measurer measurer = this.mMeasurer;
        int i15 = measurer.mPaddingHeight;
        int i16 = measurer.mPaddingWidth;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        int childCount = getChildCount();
        if (i11 == Integer.MIN_VALUE) {
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i12 = Math.max(0, this.mMinWidth);
            }
        } else if (i11 == 0) {
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            i12 = childCount == 0 ? Math.max(0, this.mMinWidth) : 0;
        } else if (i11 != 1073741824) {
            dimensionBehaviour = dimensionBehaviour2;
        } else {
            i12 = Math.min(this.mMaxWidth - i16, i12);
            dimensionBehaviour = dimensionBehaviour2;
        }
        if (i13 == Integer.MIN_VALUE) {
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i14 = Math.max(0, this.mMinHeight);
            }
        } else if (i13 == 0) {
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i14 = Math.max(0, this.mMinHeight);
            } else {
                i14 = 0;
            }
        } else if (i13 != 1073741824) {
            i14 = 0;
        } else {
            i14 = Math.min(this.mMaxHeight - i15, i14);
        }
        if (i12 != constraintWidgetContainer.getWidth() || i14 != constraintWidgetContainer.getHeight()) {
            constraintWidgetContainer.invalidateMeasures();
        }
        constraintWidgetContainer.setX(0);
        constraintWidgetContainer.setY(0);
        constraintWidgetContainer.setMaxWidth(this.mMaxWidth - i16);
        constraintWidgetContainer.setMaxHeight(this.mMaxHeight - i15);
        constraintWidgetContainer.setMinWidth(0);
        constraintWidgetContainer.setMinHeight(0);
        constraintWidgetContainer.setHorizontalDimensionBehaviour(dimensionBehaviour);
        constraintWidgetContainer.setWidth(i12);
        constraintWidgetContainer.setVerticalDimensionBehaviour(dimensionBehaviour2);
        constraintWidgetContainer.setHeight(i14);
        constraintWidgetContainer.setMinWidth(this.mMinWidth - i16);
        constraintWidgetContainer.setMinHeight(this.mMinHeight - i15);
    }

    public void setState(int i11, int i12, int i13) {
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.updateConstraints(i11, i12, i13);
        }
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        if (iMax2 > 0) {
            return iMax2;
        }
        return iMax;
    }

    private void setChildrenConstraints() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ConstraintWidget viewWidget = getViewWidget(getChildAt(i11));
            if (viewWidget != null) {
                viewWidget.reset();
            }
        }
        if (zIsInEditMode) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).setDebugName(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt2 = getChildAt(i13);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof Constraints)) {
                    this.mConstraintSet = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        ConstraintSet constraintSet = this.mConstraintSet;
        if (constraintSet != null) {
            constraintSet.applyToInternal(this, true);
        }
        this.mLayoutWidget.removeAllChildren();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                this.mConstraintHelpers.get(i14).updatePreLayout(this);
            }
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt3 = getChildAt(i15);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).updatePreLayout(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt4 = getChildAt(i16);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt5 = getChildAt(i17);
            ConstraintWidget viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                this.mLayoutWidget.add(viewWidget2);
                applyConstraintsFromLayoutParams(zIsInEditMode, childAt5, viewWidget2, layoutParams, this.mTempMapIdToWidget);
            }
        }
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            if (getChildAt(i11).isLayoutRequested()) {
                z11 = true;
                break;
            }
        }
        if (z11) {
            setChildrenConstraints();
        }
        return z11;
    }

    @Override // android.view.View
    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public boolean isRtl() {
        if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof androidx.constraintlayout.core.widgets.Guideline)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            androidx.constraintlayout.core.widgets.Guideline guideline = new androidx.constraintlayout.core.widgets.Guideline();
            layoutParams.mWidget = guideline;
            layoutParams.mIsGuideline = true;
            guideline.setOrientation(layoutParams.orientation);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.validateParams();
            ((LayoutParams) view.getLayoutParams()).mIsHelper = true;
            if (!this.mConstraintHelpers.contains(constraintHelper)) {
                this.mConstraintHelpers.add(constraintHelper);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.remove(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    public void resolveSystem(ConstraintWidgetContainer constraintWidgetContainer, int i11, int i12, int i13) {
        int i14;
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i13);
        int size2 = View.MeasureSpec.getSize(i13);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i15 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.mMeasurer.captureLayoutInfo(i12, i13, iMax, iMax2, paddingWidth, i15);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 <= 0 && iMax4 <= 0) {
            iMax3 = Math.max(0, getPaddingLeft());
        } else {
            if (isRtl()) {
                i14 = iMax4;
            }
            int i16 = size - paddingWidth;
            int i17 = size2 - i15;
            setSelfDimensionBehaviour(constraintWidgetContainer, mode, i16, mode2, i17);
            constraintWidgetContainer.measure(i11, mode, i16, mode2, i17, this.mLastMeasureWidth, this.mLastMeasureHeight, i14, iMax);
        }
        i14 = iMax3;
        int i18 = size - paddingWidth;
        int i19 = size2 - i15;
        setSelfDimensionBehaviour(constraintWidgetContainer, mode, i18, mode2, i19);
        constraintWidgetContainer.measure(i11, mode, i18, mode2, i19, this.mLastMeasureWidth, this.mLastMeasureHeight, i14, iMax);
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, 0, 0);
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i11, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i11, i12);
    }
}
