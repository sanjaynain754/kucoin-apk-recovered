package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.Cache;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.analyzer.ChainRun;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.bugly.proguard.C33627eb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintWidget {
    public static final int ANCHOR_BASELINE = 4;
    public static final int ANCHOR_BOTTOM = 3;
    public static final int ANCHOR_LEFT = 0;
    public static final int ANCHOR_RIGHT = 1;
    public static final int ANCHOR_TOP = 2;
    private static final boolean AUTOTAG_CENTER = false;
    public static final int BOTH = 2;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static float DEFAULT_BIAS = 0.5f;
    static final int DIMENSION_HORIZONTAL = 0;
    static final int DIMENSION_VERTICAL = 1;
    protected static final int DIRECT = 2;
    private static final boolean DO_NOT_USE = false;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int INVISIBLE = 4;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_RATIO = 3;
    public static final int MATCH_CONSTRAINT_RATIO_RESOLVED = 4;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    protected static final int SOLVER = 1;
    public static final int UNKNOWN = -1;
    private static final boolean USE_WRAP_DIMENSION_FOR_SPREAD = false;
    public static final int VERTICAL = 1;
    public static final int VISIBLE = 0;
    private static final int WRAP = -2;
    public static final int WRAP_BEHAVIOR_HORIZONTAL_ONLY = 1;
    public static final int WRAP_BEHAVIOR_INCLUDED = 0;
    public static final int WRAP_BEHAVIOR_SKIPPED = 3;
    public static final int WRAP_BEHAVIOR_VERTICAL_ONLY = 2;
    public WidgetFrame frame;
    public ChainRun horizontalChainRun;
    public int horizontalGroup;
    public boolean[] isTerminalWidget;
    protected ArrayList<ConstraintAnchor> mAnchors;
    private boolean mAnimated;
    public ConstraintAnchor mBaseline;
    int mBaselineDistance;
    public ConstraintAnchor mBottom;
    boolean mBottomHasCentered;
    public ConstraintAnchor mCenter;
    ConstraintAnchor mCenterX;
    ConstraintAnchor mCenterY;
    public float mCircleConstraintAngle;
    private Object mCompanionWidget;
    private int mContainerItemSkip;
    private String mDebugName;
    public float mDimensionRatio;
    protected int mDimensionRatioSide;
    int mDistToBottom;
    int mDistToLeft;
    int mDistToRight;
    int mDistToTop;
    boolean mGroupsToSolver;
    private boolean mHasBaseline;
    int mHeight;
    private int mHeightOverride;
    float mHorizontalBiasPercent;
    boolean mHorizontalChainFixedPosition;
    int mHorizontalChainStyle;
    ConstraintWidget mHorizontalNextWidget;
    public int mHorizontalResolution;
    public HorizontalWidgetRun mHorizontalRun;
    private boolean mHorizontalSolvingPass;
    boolean mHorizontalWrapVisited;
    private boolean mInPlaceholder;
    private boolean mInVirtualLayout;
    public boolean mIsHeightWrapContent;
    private boolean[] mIsInBarrier;
    public boolean mIsWidthWrapContent;
    private int mLastHorizontalMeasureSpec;
    private int mLastVerticalMeasureSpec;
    public ConstraintAnchor mLeft;
    boolean mLeftHasCentered;
    public ConstraintAnchor[] mListAnchors;
    public DimensionBehaviour[] mListDimensionBehaviors;
    protected ConstraintWidget[] mListNextMatchConstraintsWidget;
    public int mMatchConstraintDefaultHeight;
    public int mMatchConstraintDefaultWidth;
    public int mMatchConstraintMaxHeight;
    public int mMatchConstraintMaxWidth;
    public int mMatchConstraintMinHeight;
    public int mMatchConstraintMinWidth;
    public float mMatchConstraintPercentHeight;
    public float mMatchConstraintPercentWidth;
    private int[] mMaxDimension;
    private boolean mMeasureRequested;
    protected int mMinHeight;
    protected int mMinWidth;
    protected ConstraintWidget[] mNextChainWidget;
    protected int mOffsetX;
    protected int mOffsetY;
    private boolean mOptimizeWrapO;
    private boolean mOptimizeWrapOnResolved;
    public ConstraintWidget mParent;
    int mRelX;
    int mRelY;
    float mResolvedDimensionRatio;
    int mResolvedDimensionRatioSide;
    boolean mResolvedHasRatio;
    private boolean mResolvedHorizontal;
    public int[] mResolvedMatchConstraintDefault;
    private boolean mResolvedVertical;
    public ConstraintAnchor mRight;
    boolean mRightHasCentered;
    public ConstraintAnchor mTop;
    boolean mTopHasCentered;
    private String mType;
    float mVerticalBiasPercent;
    boolean mVerticalChainFixedPosition;
    int mVerticalChainStyle;
    ConstraintWidget mVerticalNextWidget;
    public int mVerticalResolution;
    public VerticalWidgetRun mVerticalRun;
    private boolean mVerticalSolvingPass;
    boolean mVerticalWrapVisited;
    private int mVisibility;
    public float[] mWeight;
    int mWidth;
    private int mWidthOverride;
    private int mWrapBehaviorInParent;

    /* JADX INFO: renamed from: mX */
    protected int f2200mX;

    /* JADX INFO: renamed from: mY */
    protected int f2201mY;
    public boolean measured;
    public WidgetRun[] run;
    public String stringId;
    public ChainRun verticalChainRun;
    public int verticalGroup;

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public ConstraintWidget() {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.mHorizontalRun = null;
        this.mVerticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.mResolvedHasRatio = false;
        this.mMeasureRequested = true;
        this.mOptimizeWrapO = false;
        this.mOptimizeWrapOnResolved = true;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
        this.frame = new WidgetFrame(this);
        this.mResolvedHorizontal = false;
        this.mResolvedVertical = false;
        this.mHorizontalSolvingPass = false;
        this.mVerticalSolvingPass = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mWrapBehaviorInParent = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = Float.NaN;
        this.mHasBaseline = false;
        this.mInVirtualLayout = false;
        this.mLastHorizontalMeasureSpec = 0;
        this.mLastVerticalMeasureSpec = 0;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.f2200mX = 0;
        this.f2201mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f11 = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f11;
        this.mVerticalBiasPercent = f11;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mAnimated = false;
        this.mDebugName = null;
        this.mType = null;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        addAnchors();
    }

    /* JADX WARN: Code duplicated, block: B:306:0x0499 A[PHI: r7
      0x0499: PHI (r7v13 int) = (r7v12 int), (r7v17 int), (r7v17 int), (r7v17 int) binds: [B:299:0x0489, B:301:0x048f, B:302:0x0491, B:304:0x0495] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:368:0x0543  */
    private void applyConstraints(LinearSystem linearSystem, boolean z11, boolean z12, boolean z13, boolean z14, SolverVariable solverVariable, SolverVariable solverVariable2, DimensionBehaviour dimensionBehaviour, boolean z15, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i11, int i12, int i13, int i14, float f11, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, int i15, int i16, int i17, int i18, float f12, boolean z22) {
        boolean z23;
        boolean z24;
        boolean z25;
        int iMin;
        int i19;
        SolverVariable solverVariable3;
        boolean z26;
        boolean z27;
        int i21;
        int i22;
        SolverVariable solverVariableCreateObjectVariable;
        SolverVariable solverVariableCreateObjectVariable2;
        boolean z28;
        ConstraintAnchor constraintAnchor3;
        int i23;
        int i24;
        boolean z29;
        boolean z31;
        boolean z32;
        boolean z33;
        SolverVariable solverVariable4;
        ConstraintWidget constraintWidget;
        boolean z34;
        int iMin2;
        int i25;
        boolean z35;
        int i26;
        int i27;
        int i28;
        boolean z36;
        int i29;
        int i31;
        int i32;
        boolean z37;
        ConstraintWidget constraintWidget2;
        int i33;
        ConstraintWidget constraintWidget3;
        linearSystem = linearSystem;
        SolverVariable solverVariableCreateObjectVariable3 = linearSystem.createObjectVariable(constraintAnchor);
        SolverVariable solverVariableCreateObjectVariable4 = linearSystem.createObjectVariable(constraintAnchor2);
        SolverVariable solverVariableCreateObjectVariable5 = linearSystem.createObjectVariable(constraintAnchor.getTarget());
        SolverVariable solverVariableCreateObjectVariable6 = linearSystem.createObjectVariable(constraintAnchor2.getTarget());
        if (LinearSystem.getMetrics() != null) {
            LinearSystem.getMetrics().nonresolvedWidgets++;
        }
        boolean zIsConnected = constraintAnchor.isConnected();
        boolean zIsConnected2 = constraintAnchor2.isConnected();
        boolean zIsConnected3 = this.mCenter.isConnected();
        int i34 = zIsConnected2 ? (zIsConnected ? 1 : 0) + 1 : zIsConnected ? 1 : 0;
        if (zIsConnected3) {
            i34++;
        }
        int i35 = z16 ? 3 : i15;
        SolverVariable solverVariable5 = solverVariableCreateObjectVariable6;
        int iOrdinal = dimensionBehaviour.ordinal();
        boolean z38 = (iOrdinal == 0 || iOrdinal == 1 || iOrdinal != 2 || i35 == 4) ? false : true;
        int i36 = this.mWidthOverride;
        if (i36 == -1 || !z11) {
            i36 = i12;
            z23 = z38;
        } else {
            this.mWidthOverride = -1;
            z23 = false;
        }
        int i37 = this.mHeightOverride;
        if (i37 == -1 || z11) {
            z24 = z23;
        } else {
            this.mHeightOverride = -1;
            i36 = i37;
            z24 = false;
        }
        int i38 = i36;
        if (this.mVisibility == 8) {
            z25 = false;
            iMin = 0;
        } else {
            z25 = z24;
            iMin = i38;
        }
        if (z22) {
            if (!zIsConnected && !zIsConnected2 && !zIsConnected3) {
                linearSystem.addEquality(solverVariableCreateObjectVariable3, i11);
            } else if (zIsConnected && !zIsConnected2) {
                i19 = 8;
                linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), 8);
            }
            i19 = 8;
        } else {
            i19 = 8;
        }
        if (z25 == 0) {
            if (z15) {
                linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, 0, 3);
                if (i13 > 0) {
                    linearSystem.addGreaterThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i13, 8);
                }
                if (i14 < Integer.MAX_VALUE) {
                    linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i14, 8);
                }
            } else {
                linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, i19);
            }
            i22 = i18;
            solverVariable3 = solverVariableCreateObjectVariable4;
            i34 = i34 == true ? 1 : 0;
            solverVariable5 = solverVariable5;
            z26 = z25;
            z27 = z14;
            i21 = i17;
        } else if (i34 == 2 || z16 || !(i35 == 1 || i35 == 0)) {
            int i39 = i17 == -2 ? iMin : i17;
            int i41 = i18 == -2 ? iMin : i18;
            if (iMin > 0 && i35 != 1) {
                iMin = 0;
            }
            if (i39 > 0) {
                linearSystem.addGreaterThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i39, 8);
                iMin = Math.max(iMin, i39);
            }
            if (i41 > 0) {
                if (!z12 || i35 != 1) {
                    linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i41, 8);
                }
                iMin = Math.min(iMin, i41);
            }
            if (i35 == 1) {
                if (z12) {
                    linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 8);
                } else if (z18) {
                    linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 5);
                    linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 8);
                } else {
                    linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 5);
                    linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 8);
                }
                solverVariable3 = solverVariableCreateObjectVariable4;
                solverVariable5 = solverVariable5;
                z26 = z25;
                z27 = z14;
                i21 = i39;
                i22 = i41;
                i34 = i34 == true ? 1 : 0;
            } else {
                if (i35 == 2) {
                    ConstraintAnchor.Type type = constraintAnchor.getType();
                    ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
                    if (type == type2 || constraintAnchor.getType() == ConstraintAnchor.Type.BOTTOM) {
                        solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(type2));
                        solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.BOTTOM));
                    } else {
                        solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.LEFT));
                        solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.RIGHT));
                    }
                    SolverVariable solverVariable6 = solverVariableCreateObjectVariable2;
                    solverVariable3 = solverVariableCreateObjectVariable4;
                    linearSystem.addConstraint(linearSystem.createRow().createRowDimensionRatio(solverVariable3, solverVariableCreateObjectVariable3, solverVariable6, solverVariableCreateObjectVariable, f12));
                    if (z12) {
                        z25 = false;
                    }
                    z27 = z14;
                    z26 = z25;
                } else {
                    solverVariable3 = solverVariableCreateObjectVariable4;
                    z26 = z25;
                    z27 = true;
                }
                i21 = i39;
                i22 = i41;
            }
        } else {
            int iMax = Math.max(i17, iMin);
            if (i18 > 0) {
                iMax = Math.min(i18, iMax);
            }
            linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMax, 8);
            i21 = i17;
            i22 = i18;
            solverVariable3 = solverVariableCreateObjectVariable4;
            i34 = i34 == true ? 1 : 0;
            solverVariable5 = solverVariable5;
            z26 = false;
            z27 = z14;
        }
        if (!z22 || z18) {
            if (i34 < 2 && z12 && z27) {
                linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariable, 0, 8);
                boolean z39 = z11 || this.mBaseline.mTarget == null;
                if (z11 || (constraintAnchor3 = this.mBaseline.mTarget) == null) {
                    z28 = z39;
                } else {
                    ConstraintWidget constraintWidget4 = constraintAnchor3.mOwner;
                    if (constraintWidget4.mDimensionRatio != 0.0f) {
                        DimensionBehaviour[] dimensionBehaviourArr = constraintWidget4.mListDimensionBehaviors;
                        DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
                        DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
                        if (dimensionBehaviour2 == dimensionBehaviour3 && dimensionBehaviourArr[1] == dimensionBehaviour3) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                    } else {
                        z28 = false;
                    }
                }
                if (z28) {
                    linearSystem.addGreaterThan(solverVariable2, solverVariable3, 0, 8);
                    return;
                }
                return;
            }
            return;
        }
        if (!zIsConnected && !zIsConnected2 && !zIsConnected3) {
            i26 = 5;
            z34 = z12;
            i33 = i26;
        } else if (!zIsConnected || zIsConnected2) {
            if (zIsConnected || !zIsConnected2) {
                if (zIsConnected && zIsConnected2) {
                    ConstraintWidget constraintWidget5 = constraintAnchor.mTarget.mOwner;
                    ConstraintWidget constraintWidget6 = constraintAnchor2.mTarget.mOwner;
                    ConstraintWidget parent = getParent();
                    int i42 = 6;
                    if (z26) {
                        if (i35 == 0) {
                            if (i22 != 0 || i21 != 0) {
                                z32 = false;
                                i32 = 5;
                                i23 = 5;
                                z37 = true;
                                z31 = true;
                            } else if (solverVariableCreateObjectVariable5.isFinalValue && solverVariable5.isFinalValue) {
                                linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), 8);
                                linearSystem.addEquality(solverVariable3, solverVariable5, -constraintAnchor2.getMargin(), 8);
                                return;
                            } else {
                                z37 = false;
                                z31 = false;
                                i32 = 8;
                                i23 = 8;
                                z32 = true;
                            }
                            if ((constraintWidget5 instanceof Barrier) || (constraintWidget6 instanceof Barrier)) {
                                i23 = 4;
                            }
                            z29 = z37;
                            i24 = i32;
                            solverVariableCreateObjectVariable5 = solverVariableCreateObjectVariable5;
                            i42 = 6;
                        } else {
                            if (i35 == 2) {
                                i23 = ((constraintWidget5 instanceof Barrier) || (constraintWidget6 instanceof Barrier)) ? 4 : 5;
                                i24 = 5;
                            } else if (i35 == 1) {
                                solverVariableCreateObjectVariable3 = solverVariableCreateObjectVariable3;
                                solverVariable5 = solverVariable5;
                                solverVariableCreateObjectVariable5 = solverVariableCreateObjectVariable5;
                                i42 = 6;
                                i23 = 4;
                                i24 = 8;
                            } else if (i35 == 3) {
                                if (this.mResolvedDimensionRatioSide == -1) {
                                    if (z19) {
                                        linearSystem = linearSystem;
                                        solverVariableCreateObjectVariable3 = solverVariableCreateObjectVariable3;
                                        solverVariable5 = solverVariable5;
                                        solverVariableCreateObjectVariable5 = solverVariableCreateObjectVariable5;
                                        i42 = z12 ? 5 : 4;
                                    } else {
                                        linearSystem = linearSystem;
                                        solverVariableCreateObjectVariable3 = solverVariableCreateObjectVariable3;
                                        solverVariable5 = solverVariable5;
                                        solverVariableCreateObjectVariable5 = solverVariableCreateObjectVariable5;
                                        i42 = 8;
                                    }
                                    i23 = 5;
                                    i24 = 8;
                                } else {
                                    if (z16) {
                                        if (i16 == 2 || i16 == 1) {
                                            i29 = 5;
                                            i31 = 4;
                                        } else {
                                            i29 = 8;
                                            i31 = 5;
                                        }
                                        i24 = i29;
                                        i23 = i31;
                                    } else {
                                        if (i22 > 0) {
                                            i23 = 5;
                                        } else if (i22 != 0 || i21 != 0) {
                                            i23 = 4;
                                        } else if (z19) {
                                            i24 = (constraintWidget5 == parent || constraintWidget6 == parent) ? 5 : 4;
                                            i23 = 4;
                                        } else {
                                            i23 = 8;
                                        }
                                        i24 = 5;
                                    }
                                    z29 = true;
                                    z31 = true;
                                    z32 = true;
                                    linearSystem = linearSystem;
                                }
                                z29 = true;
                                z31 = true;
                                z32 = true;
                            } else {
                                linearSystem = linearSystem;
                                solverVariableCreateObjectVariable3 = solverVariableCreateObjectVariable3;
                                solverVariable5 = solverVariable5;
                                solverVariableCreateObjectVariable5 = solverVariableCreateObjectVariable5;
                                i42 = 6;
                                i23 = 4;
                                i24 = 5;
                                z29 = false;
                                z31 = false;
                                z32 = false;
                            }
                            z29 = true;
                            z31 = true;
                            z32 = false;
                        }
                    } else {
                        if (solverVariableCreateObjectVariable5.isFinalValue && solverVariable5.isFinalValue) {
                            SolverVariable solverVariable7 = solverVariable5;
                            linearSystem.addCentering(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), f11, solverVariable7, solverVariable3, constraintAnchor2.getMargin(), 8);
                            if (z12 && z27) {
                                int margin = constraintAnchor2.mTarget != null ? constraintAnchor2.getMargin() : 0;
                                if (solverVariable7 != solverVariable2) {
                                    linearSystem.addGreaterThan(solverVariable2, solverVariable3, margin, 5);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        linearSystem = linearSystem;
                        solverVariableCreateObjectVariable3 = solverVariableCreateObjectVariable3;
                        solverVariable5 = solverVariable5;
                        solverVariableCreateObjectVariable5 = solverVariableCreateObjectVariable5;
                        i42 = 6;
                        i23 = 4;
                        i24 = 5;
                        z29 = true;
                        z31 = true;
                        z32 = false;
                    }
                    if (z31 && solverVariableCreateObjectVariable5 == solverVariable5 && constraintWidget5 != parent) {
                        z31 = false;
                        z33 = false;
                    } else {
                        z33 = true;
                    }
                    if (z29) {
                        if (z26 || z17 || z19 || solverVariableCreateObjectVariable5 != solverVariable || solverVariable5 != solverVariable2) {
                            i28 = i42;
                            z36 = z12;
                        } else {
                            i28 = 8;
                            z36 = false;
                            i24 = 8;
                            z33 = false;
                        }
                        solverVariable4 = solverVariable;
                        z12 = z36;
                        constraintWidget = constraintWidget6;
                        SolverVariable solverVariable8 = solverVariable3;
                        linearSystem.addCentering(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), f11, solverVariable5, solverVariable8, constraintAnchor2.getMargin(), i28);
                        solverVariable5 = solverVariable5;
                        solverVariable3 = solverVariable8;
                    } else {
                        solverVariable5 = solverVariable5;
                        solverVariable4 = solverVariable;
                        constraintWidget = constraintWidget6;
                    }
                    z34 = z12;
                    if (this.mVisibility == 8 && !constraintAnchor2.hasDependents()) {
                        return;
                    }
                    if (z31) {
                        int i43 = (!z34 || solverVariableCreateObjectVariable5 == solverVariable5 || z26 || !((constraintWidget5 instanceof Barrier) || (constraintWidget instanceof Barrier))) ? i24 : 6;
                        linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), i43);
                        linearSystem.addLowerThan(solverVariable3, solverVariable5, -constraintAnchor2.getMargin(), i43);
                        i24 = i43;
                    }
                    if (!z34 || !z21 || (constraintWidget5 instanceof Barrier) || (constraintWidget instanceof Barrier) || constraintWidget == parent) {
                        iMin2 = i23;
                        i25 = i24;
                        z35 = z33;
                    } else {
                        iMin2 = 6;
                        i25 = 6;
                        z35 = true;
                    }
                    if (z35) {
                        if (z32 && (!z19 || z13)) {
                            if (constraintWidget5 != parent && constraintWidget != parent) {
                                i42 = iMin2;
                            }
                            if ((constraintWidget5 instanceof Guideline) || (constraintWidget instanceof Guideline)) {
                                i42 = 5;
                            }
                            if ((constraintWidget5 instanceof Barrier) || (constraintWidget instanceof Barrier)) {
                                i42 = 5;
                            }
                            iMin2 = Math.max(z19 ? 5 : i42, iMin2);
                        }
                        if (z34) {
                            iMin2 = Math.min(i25, iMin2);
                            if (z16 && !z19 && (constraintWidget5 == parent || constraintWidget == parent)) {
                                i27 = 4;
                            } else {
                                i27 = iMin2;
                            }
                        } else {
                            i27 = iMin2;
                        }
                        linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), i27);
                        linearSystem.addEquality(solverVariable3, solverVariable5, -constraintAnchor2.getMargin(), i27);
                    }
                    if (z34) {
                        int margin2 = solverVariable4 == solverVariableCreateObjectVariable5 ? constraintAnchor.getMargin() : 0;
                        if (solverVariableCreateObjectVariable5 != solverVariable4) {
                            linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariable4, margin2, 5);
                        }
                    }
                    if (!z34 || !z26 || i13 != 0 || i21 != 0) {
                        i26 = 5;
                    } else if (z26 && i35 == 3) {
                        linearSystem.addGreaterThan(solverVariable3, solverVariableCreateObjectVariable3, 0, 8);
                        i26 = 5;
                    } else {
                        i26 = 5;
                        linearSystem.addGreaterThan(solverVariable3, solverVariableCreateObjectVariable3, 0, 5);
                    }
                }
                i33 = i26;
            } else {
                linearSystem.addEquality(solverVariable3, solverVariable5, -constraintAnchor2.getMargin(), 8);
                if (z12) {
                    if (this.mOptimizeWrapO && solverVariableCreateObjectVariable3.isFinalValue && (constraintWidget2 = this.mParent) != null) {
                        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget2;
                        if (z11) {
                            constraintWidgetContainer.addHorizontalWrapMinVariable(constraintAnchor);
                        } else {
                            constraintWidgetContainer.addVerticalWrapMinVariable(constraintAnchor);
                        }
                    } else {
                        linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariable, 0, 5);
                        i26 = 5;
                    }
                }
                z34 = z12;
                i33 = i26;
            }
            i26 = 5;
            z34 = z12;
            i33 = i26;
        } else {
            SolverVariable solverVariable9 = solverVariable5;
            i33 = (z12 && (constraintAnchor.mTarget.mOwner instanceof Barrier)) ? 8 : 5;
            solverVariable5 = solverVariable9;
            z34 = z12;
        }
        if (z34 && z27) {
            int margin3 = constraintAnchor2.mTarget != null ? constraintAnchor2.getMargin() : 0;
            if (solverVariable5 != solverVariable2) {
                if (!this.mOptimizeWrapO || !solverVariable3.isFinalValue || (constraintWidget3 = this.mParent) == null) {
                    linearSystem.addGreaterThan(solverVariable2, solverVariable3, margin3, i33);
                    return;
                }
                ConstraintWidgetContainer constraintWidgetContainer2 = (ConstraintWidgetContainer) constraintWidget3;
                if (z11) {
                    constraintWidgetContainer2.addHorizontalWrapMaxVariable(constraintAnchor2);
                } else {
                    constraintWidgetContainer2.addVerticalWrapMaxVariable(constraintAnchor2);
                }
            }
        }
    }

    private void serializeAttribute(StringBuilder sb2, String str, float f11, float f12) {
        if (f11 == f12) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f11);
        sb2.append(",\n");
    }

    private void serializeDimensionRatio(StringBuilder sb2, String str, float f11, int i11) {
        if (f11 == 0.0f) {
            return;
        }
        sb2.append(str);
        sb2.append(" :  [");
        sb2.append(f11);
        sb2.append(",");
        sb2.append(i11);
        sb2.append("");
        sb2.append("],\n");
    }

    public void connect(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i11) {
        if (constraintAnchor.getOwner() == this) {
            connect(constraintAnchor.getType(), constraintAnchor2.getOwner(), constraintAnchor2.getType(), i11);
        }
    }

    public void ensureMeasureRequested() {
        this.mMeasureRequested = true;
    }

    public void getSceneString(StringBuilder sb2) {
        sb2.append("  " + this.stringId + ":{\n");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("    actualWidth:");
        sb3.append(this.mWidth);
        sb2.append(sb3.toString());
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        sb2.append("    actualHeight:" + this.mHeight);
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        sb2.append("    actualLeft:" + this.f2200mX);
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        sb2.append("    actualTop:" + this.f2201mY);
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        getSceneString(sb2, "left", this.mLeft);
        getSceneString(sb2, ViewProps.TOP, this.mTop);
        getSceneString(sb2, "right", this.mRight);
        getSceneString(sb2, ViewProps.BOTTOM, this.mBottom);
        getSceneString(sb2, "baseline", this.mBaseline);
        getSceneString(sb2, "centerX", this.mCenterX);
        getSceneString(sb2, "centerY", this.mCenterY);
        getSceneString(sb2, "    width", this.mWidth, this.mMinWidth, this.mMaxDimension[0], this.mWidthOverride, this.mMatchConstraintMinWidth, this.mMatchConstraintDefaultWidth, this.mMatchConstraintPercentWidth, this.mListDimensionBehaviors[0], this.mWeight[0]);
        getSceneString(sb2, "    height", this.mHeight, this.mMinHeight, this.mMaxDimension[1], this.mHeightOverride, this.mMatchConstraintMinHeight, this.mMatchConstraintDefaultHeight, this.mMatchConstraintPercentHeight, this.mListDimensionBehaviors[1], this.mWeight[1]);
        serializeDimensionRatio(sb2, "    dimensionRatio", this.mDimensionRatio, this.mDimensionRatioSide);
        serializeAttribute(sb2, "    horizontalBias", this.mHorizontalBiasPercent, DEFAULT_BIAS);
        serializeAttribute(sb2, "    verticalBias", this.mVerticalBiasPercent, DEFAULT_BIAS);
        serializeAttribute(sb2, "    horizontalChainStyle", this.mHorizontalChainStyle, 0);
        serializeAttribute(sb2, "    verticalChainStyle", this.mVerticalChainStyle, 0);
        sb2.append("  }");
    }

    public boolean hasDanglingDimension(int i11) {
        if (i11 == 0) {
            return (this.mLeft.mTarget != null ? 1 : 0) + (this.mRight.mTarget != null ? 1 : 0) < 2;
        }
        return ((this.mTop.mTarget != null ? 1 : 0) + (this.mBottom.mTarget != null ? 1 : 0)) + (this.mBaseline.mTarget != null ? 1 : 0) < 2;
    }

    public boolean hasResolvedTargets(int i11, int i12) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i11 == 0) {
            ConstraintAnchor constraintAnchor3 = this.mLeft.mTarget;
            return constraintAnchor3 != null && constraintAnchor3.hasFinalValue() && (constraintAnchor2 = this.mRight.mTarget) != null && constraintAnchor2.hasFinalValue() && (this.mRight.mTarget.getFinalValue() - this.mRight.getMargin()) - (this.mLeft.mTarget.getFinalValue() + this.mLeft.getMargin()) >= i12;
        }
        ConstraintAnchor constraintAnchor4 = this.mTop.mTarget;
        if (constraintAnchor4 != null && constraintAnchor4.hasFinalValue() && (constraintAnchor = this.mBottom.mTarget) != null && constraintAnchor.hasFinalValue() && (this.mBottom.mTarget.getFinalValue() - this.mBottom.getMargin()) - (this.mTop.mTarget.getFinalValue() + this.mTop.getMargin()) >= i12) {
            return true;
        }
        return false;
    }

    public void markHorizontalSolvingPassDone() {
        this.mHorizontalSolvingPass = true;
    }

    public void markVerticalSolvingPassDone() {
        this.mVerticalSolvingPass = true;
    }

    public boolean oppositeDimensionDependsOn(int i11) {
        char c11 = i11 == 0 ? (char) 1 : (char) 0;
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[i11];
        DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[c11];
        DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
        return dimensionBehaviour == dimensionBehaviour3 && dimensionBehaviour2 == dimensionBehaviour3;
    }

    public void resetFinalResolution() {
        this.mResolvedHorizontal = false;
        this.mResolvedVertical = false;
        this.mHorizontalSolvingPass = false;
        this.mVerticalSolvingPass = false;
        int size = this.mAnchors.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.mAnchors.get(i11).resetFinalResolution();
        }
    }

    public void resetSolvingPassFlag() {
        this.mHorizontalSolvingPass = false;
        this.mVerticalSolvingPass = false;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[PHI: r0
      0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    public void setDimensionRatio(String str) {
        float fAbs;
        int i11 = 0;
        if (str == null || str.length() == 0) {
            this.mDimensionRatio = 0.0f;
            return;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i12 = 0;
        int i13 = -1;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!strSubstring.equalsIgnoreCase(ExifInterface.LONGITUDE_WEST)) {
                i12 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            }
            i13 = i12;
            i12 = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        try {
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i12);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                } else {
                    fAbs = i11;
                }
            } else {
                String strSubstring3 = str.substring(i12, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                    fAbs = i11;
                } else {
                    float f11 = Float.parseFloat(strSubstring3);
                    float f12 = Float.parseFloat(strSubstring4);
                    if (f11 <= 0.0f || f12 <= 0.0f) {
                        fAbs = i11;
                    } else {
                        fAbs = i13 == 1 ? Math.abs(f12 / f11) : Math.abs(f11 / f12);
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        i11 = (fAbs > i11 ? 1 : (fAbs == i11 ? 0 : -1));
        if (i11 > 0) {
            this.mDimensionRatio = fAbs;
            this.mDimensionRatioSide = i13;
        }
    }

    public void setFrame(int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17 = i13 - i11;
        int i18 = i14 - i12;
        this.f2200mX = i11;
        this.f2201mY = i12;
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i17 < (i16 = this.mWidth)) {
            i17 = i16;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i18 < (i15 = this.mHeight)) {
            i18 = i15;
        }
        this.mWidth = i17;
        this.mHeight = i18;
        int i19 = this.mMinHeight;
        if (i18 < i19) {
            this.mHeight = i19;
        }
        int i21 = this.mMinWidth;
        if (i17 < i21) {
            this.mWidth = i21;
        }
        int i22 = this.mMatchConstraintMaxWidth;
        if (i22 > 0 && dimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.mWidth = Math.min(this.mWidth, i22);
        }
        int i23 = this.mMatchConstraintMaxHeight;
        if (i23 > 0 && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.mHeight = Math.min(this.mHeight, i23);
        }
        int i24 = this.mWidth;
        if (i17 != i24) {
            this.mWidthOverride = i24;
        }
        int i25 = this.mHeight;
        if (i18 != i25) {
            this.mHeightOverride = i25;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.ConstraintWidget$1 */
    public static /* synthetic */ class C15001 {

        /* JADX INFO: renamed from: $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type */
        static final /* synthetic */ int[] f2202x6930e354;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f2202x6930e354 = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2202x6930e354[ConstraintAnchor.Type.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2202x6930e354[ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2202x6930e354[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2202x6930e354[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2202x6930e354[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2202x6930e354[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2202x6930e354[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2202x6930e354[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private void addAnchors() {
        this.mAnchors.add(this.mLeft);
        this.mAnchors.add(this.mTop);
        this.mAnchors.add(this.mRight);
        this.mAnchors.add(this.mBottom);
        this.mAnchors.add(this.mCenterX);
        this.mAnchors.add(this.mCenterY);
        this.mAnchors.add(this.mCenter);
        this.mAnchors.add(this.mBaseline);
    }

    private boolean isChainHead(int i11) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i12 = i11 * 2;
        ConstraintAnchor[] constraintAnchorArr = this.mListAnchors;
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i12];
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        return (constraintAnchor4 == null || constraintAnchor4.mTarget == constraintAnchor3 || (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i12 + 1]).mTarget) == null || constraintAnchor2.mTarget != constraintAnchor) ? false : true;
    }

    private void serializeAnchor(StringBuilder sb2, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.mTarget == null) {
            return;
        }
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(constraintAnchor.mTarget);
        sb2.append("',");
        sb2.append(constraintAnchor.mMargin);
        sb2.append(",");
        sb2.append(constraintAnchor.mGoneMargin);
        sb2.append(",");
        sb2.append(" ] ,\n");
    }

    private void serializeCircle(StringBuilder sb2, ConstraintAnchor constraintAnchor, float f11) {
        if (constraintAnchor.mTarget == null || Float.isNaN(f11)) {
            return;
        }
        sb2.append("circle : [ '");
        sb2.append(constraintAnchor.mTarget);
        sb2.append("',");
        sb2.append(constraintAnchor.mMargin);
        sb2.append(",");
        sb2.append(f11);
        sb2.append(",");
        sb2.append(" ] ,\n");
    }

    public void addChildrenToSolverByDependency(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, HashSet<ConstraintWidget> hashSet, int i11, boolean z11) {
        if (z11) {
            if (!hashSet.contains(this)) {
                return;
            }
            Optimizer.checkMatchParent(constraintWidgetContainer, linearSystem, this);
            hashSet.remove(this);
            addToSolver(linearSystem, constraintWidgetContainer.optimizeFor(64));
        }
        if (i11 == 0) {
            HashSet<ConstraintAnchor> dependents = this.mLeft.getDependents();
            if (dependents != null) {
                Iterator<ConstraintAnchor> it = dependents.iterator();
                while (it.hasNext()) {
                    it.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i11, true);
                }
            }
            HashSet<ConstraintAnchor> dependents2 = this.mRight.getDependents();
            if (dependents2 != null) {
                Iterator<ConstraintAnchor> it2 = dependents2.iterator();
                while (it2.hasNext()) {
                    it2.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i11, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> dependents3 = this.mTop.getDependents();
        if (dependents3 != null) {
            Iterator<ConstraintAnchor> it3 = dependents3.iterator();
            while (it3.hasNext()) {
                it3.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i11, true);
            }
        }
        HashSet<ConstraintAnchor> dependents4 = this.mBottom.getDependents();
        if (dependents4 != null) {
            Iterator<ConstraintAnchor> it4 = dependents4.iterator();
            while (it4.hasNext()) {
                it4.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i11, true);
            }
        }
        HashSet<ConstraintAnchor> dependents5 = this.mBaseline.getDependents();
        if (dependents5 != null) {
            Iterator<ConstraintAnchor> it5 = dependents5.iterator();
            while (it5.hasNext()) {
                it5.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i11, true);
            }
        }
    }

    public boolean addFirst() {
        return (this instanceof VirtualLayout) || (this instanceof Guideline);
    }

    /* JADX WARN: Code duplicated, block: B:192:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:194:0x02fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:196:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:199:0x0303  */
    /* JADX WARN: Code duplicated, block: B:19:0x004d  */
    /* JADX WARN: Code duplicated, block: B:203:0x030d  */
    /* JADX WARN: Code duplicated, block: B:206:0x0319  */
    /* JADX WARN: Code duplicated, block: B:209:0x0320  */
    /* JADX WARN: Code duplicated, block: B:211:0x0324  */
    /* JADX WARN: Code duplicated, block: B:214:0x033f  */
    /* JADX WARN: Code duplicated, block: B:235:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:250:0x0439  */
    /* JADX WARN: Code duplicated, block: B:267:0x048b  */
    /* JADX WARN: Code duplicated, block: B:270:0x049b  */
    /* JADX WARN: Code duplicated, block: B:271:0x049d  */
    /* JADX WARN: Code duplicated, block: B:273:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:310:0x0578  */
    /* JADX WARN: Code duplicated, block: B:312:0x057f  */
    /* JADX WARN: Code duplicated, block: B:314:0x0586  */
    /* JADX WARN: Code duplicated, block: B:315:0x0595  */
    /* JADX WARN: Code duplicated, block: B:316:0x0598  */
    /* JADX WARN: Code duplicated, block: B:319:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:322:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:325:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public void addToSolver(LinearSystem linearSystem, boolean z11) {
        boolean z12;
        boolean z13;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        boolean zIsInHorizontalChain;
        boolean zIsInVerticalChain;
        int i11;
        SolverVariable solverVariable;
        int i12;
        int i13;
        int i14;
        boolean z14;
        int i15;
        boolean z15;
        DimensionBehaviour dimensionBehaviour;
        DimensionBehaviour dimensionBehaviour2;
        boolean z16;
        SolverVariable solverVariable2;
        int i16;
        boolean z17;
        boolean z18;
        boolean z19;
        SolverVariable solverVariable3;
        SolverVariable solverVariable4;
        SolverVariable solverVariable5;
        int i17;
        char c11;
        int i18;
        int i19;
        int i21;
        LinearSystem linearSystem2;
        Metrics metrics;
        boolean z21;
        VerticalWidgetRun verticalWidgetRun;
        HorizontalWidgetRun horizontalWidgetRun;
        int i22;
        int i23;
        int i24;
        HorizontalWidgetRun horizontalWidgetRun2;
        VerticalWidgetRun verticalWidgetRun2;
        LinearSystem linearSystem3 = linearSystem;
        SolverVariable solverVariableCreateObjectVariable = linearSystem3.createObjectVariable(this.mLeft);
        SolverVariable solverVariableCreateObjectVariable2 = linearSystem3.createObjectVariable(this.mRight);
        SolverVariable solverVariableCreateObjectVariable3 = linearSystem3.createObjectVariable(this.mTop);
        SolverVariable solverVariableCreateObjectVariable4 = linearSystem3.createObjectVariable(this.mBottom);
        SolverVariable solverVariableCreateObjectVariable5 = linearSystem3.createObjectVariable(this.mBaseline);
        ConstraintWidget constraintWidget3 = this.mParent;
        if (constraintWidget3 == null) {
            z12 = false;
            z13 = false;
        } else {
            z13 = constraintWidget3 != null && constraintWidget3.mListDimensionBehaviors[0] == DimensionBehaviour.WRAP_CONTENT;
            z12 = constraintWidget3 != null && constraintWidget3.mListDimensionBehaviors[1] == DimensionBehaviour.WRAP_CONTENT;
            int i25 = this.mWrapBehaviorInParent;
            if (i25 == 1) {
                z12 = false;
            } else if (i25 == 2) {
                z13 = false;
            } else if (i25 == 3) {
                z12 = false;
                z13 = false;
            }
        }
        if (this.mVisibility == 8 && !this.mAnimated && !hasDependencies()) {
            boolean[] zArr = this.mIsInBarrier;
            if (!zArr[0] && !zArr[1]) {
                return;
            }
        }
        boolean z22 = this.mResolvedHorizontal;
        if (z22 || this.mResolvedVertical) {
            if (z22) {
                linearSystem3.addEquality(solverVariableCreateObjectVariable, this.f2200mX);
                linearSystem3.addEquality(solverVariableCreateObjectVariable2, this.f2200mX + this.mWidth);
                if (z13 && (constraintWidget2 = this.mParent) != null) {
                    if (this.mOptimizeWrapOnResolved) {
                        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget2;
                        constraintWidgetContainer.addHorizontalWrapMinVariable(this.mLeft);
                        constraintWidgetContainer.addHorizontalWrapMaxVariable(this.mRight);
                    } else {
                        linearSystem3.addGreaterThan(linearSystem3.createObjectVariable(constraintWidget2.mRight), solverVariableCreateObjectVariable2, 0, 5);
                    }
                }
            }
            if (this.mResolvedVertical) {
                linearSystem3.addEquality(solverVariableCreateObjectVariable3, this.f2201mY);
                linearSystem3.addEquality(solverVariableCreateObjectVariable4, this.f2201mY + this.mHeight);
                if (this.mBaseline.hasDependents()) {
                    linearSystem3.addEquality(solverVariableCreateObjectVariable5, this.f2201mY + this.mBaselineDistance);
                }
                if (z12 && (constraintWidget = this.mParent) != null) {
                    if (this.mOptimizeWrapOnResolved) {
                        ConstraintWidgetContainer constraintWidgetContainer2 = (ConstraintWidgetContainer) constraintWidget;
                        constraintWidgetContainer2.addVerticalWrapMinVariable(this.mTop);
                        constraintWidgetContainer2.addVerticalWrapMaxVariable(this.mBottom);
                    } else {
                        linearSystem3.addGreaterThan(linearSystem3.createObjectVariable(constraintWidget.mBottom), solverVariableCreateObjectVariable4, 0, 5);
                    }
                }
            }
            if (this.mResolvedHorizontal && this.mResolvedVertical) {
                this.mResolvedHorizontal = false;
                this.mResolvedVertical = false;
                return;
            }
        }
        Metrics metrics2 = LinearSystem.sMetrics;
        if (metrics2 != null) {
            metrics2.widgets++;
        }
        if (z11 && (horizontalWidgetRun2 = this.mHorizontalRun) != null && (verticalWidgetRun2 = this.mVerticalRun) != null) {
            DependencyNode dependencyNode = horizontalWidgetRun2.start;
            if (dependencyNode.resolved && horizontalWidgetRun2.end.resolved && verticalWidgetRun2.start.resolved && verticalWidgetRun2.end.resolved) {
                if (metrics2 != null) {
                    metrics2.graphSolved++;
                }
                linearSystem3.addEquality(solverVariableCreateObjectVariable, dependencyNode.value);
                linearSystem3.addEquality(solverVariableCreateObjectVariable2, this.mHorizontalRun.end.value);
                linearSystem3.addEquality(solverVariableCreateObjectVariable3, this.mVerticalRun.start.value);
                linearSystem3.addEquality(solverVariableCreateObjectVariable4, this.mVerticalRun.end.value);
                linearSystem3.addEquality(solverVariableCreateObjectVariable5, this.mVerticalRun.baseline.value);
                if (this.mParent != null) {
                    if (z13 && this.isTerminalWidget[0] && !isInHorizontalChain()) {
                        linearSystem3.addGreaterThan(linearSystem3.createObjectVariable(this.mParent.mRight), solverVariableCreateObjectVariable2, 0, 8);
                    }
                    if (z12 && this.isTerminalWidget[1] && !isInVerticalChain()) {
                        linearSystem3.addGreaterThan(linearSystem3.createObjectVariable(this.mParent.mBottom), solverVariableCreateObjectVariable4, 0, 8);
                    }
                }
                this.mResolvedHorizontal = false;
                this.mResolvedVertical = false;
                return;
            }
        }
        if (metrics2 != null) {
            metrics2.linearSolved++;
        }
        if (this.mParent != null) {
            if (isChainHead(0)) {
                ((ConstraintWidgetContainer) this.mParent).addChain(this, 0);
                zIsInHorizontalChain = true;
                i24 = 1;
            } else {
                zIsInHorizontalChain = isInHorizontalChain();
                i24 = 1;
            }
            if (isChainHead(i24)) {
                ((ConstraintWidgetContainer) this.mParent).addChain(this, i24);
                zIsInVerticalChain = true;
            } else {
                zIsInVerticalChain = isInVerticalChain();
            }
            if (!zIsInHorizontalChain && z13 && this.mVisibility != 8 && this.mLeft.mTarget == null && this.mRight.mTarget == null) {
                linearSystem3.addGreaterThan(linearSystem3.createObjectVariable(this.mParent.mRight), solverVariableCreateObjectVariable2, 0, 1);
            }
            if (!zIsInVerticalChain && z12 && this.mVisibility != 8 && this.mTop.mTarget == null && this.mBottom.mTarget == null && this.mBaseline == null) {
                linearSystem3.addGreaterThan(linearSystem3.createObjectVariable(this.mParent.mBottom), solverVariableCreateObjectVariable4, 0, 1);
            }
        } else {
            zIsInHorizontalChain = false;
            zIsInVerticalChain = false;
        }
        int i26 = this.mWidth;
        int i27 = this.mMinWidth;
        if (i26 >= i27) {
            i27 = i26;
        }
        int i28 = this.mHeight;
        int i29 = this.mMinHeight;
        if (i28 >= i29) {
            i29 = i28;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[0];
        SolverVariable solverVariable6 = solverVariableCreateObjectVariable4;
        DimensionBehaviour dimensionBehaviour4 = DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z23 = dimensionBehaviour3 != dimensionBehaviour4;
        DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr[1];
        boolean z24 = zIsInHorizontalChain;
        boolean z25 = dimensionBehaviour5 != dimensionBehaviour4;
        boolean z26 = zIsInVerticalChain;
        int i31 = this.mDimensionRatioSide;
        this.mResolvedDimensionRatioSide = i31;
        int i32 = i29;
        float f11 = this.mDimensionRatio;
        this.mResolvedDimensionRatio = f11;
        int i33 = this.mMatchConstraintDefaultWidth;
        int i34 = this.mMatchConstraintDefaultHeight;
        if (f11 > 0.0f) {
            i11 = i27;
            if (this.mVisibility != 8) {
                i12 = (dimensionBehaviour3 == dimensionBehaviour4 && i33 == 0) ? 3 : i33;
                int i35 = (dimensionBehaviour5 == dimensionBehaviour4 && i34 == 0) ? 3 : i34;
                if (dimensionBehaviour3 == dimensionBehaviour4 && dimensionBehaviour5 == dimensionBehaviour4) {
                    solverVariable = solverVariableCreateObjectVariable2;
                    i23 = 3;
                    if (i12 == 3 && i35 == 3) {
                        setupDimensionRatio(z13, z12, z23, z25);
                    }
                    i32 = i32;
                    z14 = true;
                    i13 = i35;
                    i14 = i11;
                    int[] iArr = this.mResolvedMatchConstraintDefault;
                    iArr[0] = i12;
                    iArr[1] = i13;
                    this.mResolvedHasRatio = z14;
                    if (z14) {
                        int i36 = this.mResolvedDimensionRatioSide;
                        i15 = -1;
                        boolean z27 = i36 != 0 || i36 == -1;
                        if (z14 || !((i22 = this.mResolvedDimensionRatioSide) == 1 || i22 == i15)) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        dimensionBehaviour = this.mListDimensionBehaviors[0];
                        dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                        if (dimensionBehaviour == dimensionBehaviour2 || !(this instanceof ConstraintWidgetContainer)) {
                            z16 = false;
                        } else {
                            z16 = true;
                        }
                        if (z16) {
                            i14 = 0;
                        }
                        boolean z28 = !this.mCenter.isConnected();
                        boolean[] zArr2 = this.mIsInBarrier;
                        boolean z29 = zArr2[0];
                        boolean z31 = zArr2[1];
                        if (this.mHorizontalResolution != 2 || this.mResolvedHorizontal) {
                            z19 = z13;
                            solverVariable2 = solverVariableCreateObjectVariable3;
                            z18 = z24;
                            z17 = z26;
                            i16 = i12;
                        } else {
                            if (z11 && (horizontalWidgetRun = this.mHorizontalRun) != null) {
                                DependencyNode dependencyNode2 = horizontalWidgetRun.start;
                                if (dependencyNode2.resolved && horizontalWidgetRun.end.resolved) {
                                    if (z11) {
                                        linearSystem3.addEquality(solverVariableCreateObjectVariable, dependencyNode2.value);
                                        SolverVariable solverVariable7 = solverVariable;
                                        linearSystem3.addEquality(solverVariable7, this.mHorizontalRun.end.value);
                                        if (this.mParent != null && z13 && this.isTerminalWidget[0] && !isInHorizontalChain()) {
                                            linearSystem3.addGreaterThan(linearSystem3.createObjectVariable(this.mParent.mRight), solverVariable7, 0, 8);
                                        }
                                        solverVariable = solverVariable7;
                                    }
                                    z19 = z13;
                                    solverVariable2 = solverVariableCreateObjectVariable3;
                                    z18 = z24;
                                    z17 = z26;
                                    i16 = i12;
                                }
                            }
                            SolverVariable solverVariable8 = solverVariable;
                            ConstraintWidget constraintWidget4 = this.mParent;
                            SolverVariable solverVariableCreateObjectVariable6 = constraintWidget4 != null ? linearSystem3.createObjectVariable(constraintWidget4.mRight) : null;
                            ConstraintWidget constraintWidget5 = this.mParent;
                            SolverVariable solverVariableCreateObjectVariable7 = constraintWidget5 != null ? linearSystem3.createObjectVariable(constraintWidget5.mLeft) : null;
                            boolean z32 = this.isTerminalWidget[0];
                            DimensionBehaviour[] dimensionBehaviourArr2 = this.mListDimensionBehaviors;
                            DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr2[0];
                            ConstraintAnchor constraintAnchor = this.mLeft;
                            i16 = i12;
                            ConstraintAnchor constraintAnchor2 = this.mRight;
                            z14 = z14;
                            z19 = z13;
                            int i37 = this.f2200mX;
                            boolean z33 = z27;
                            SolverVariable solverVariable9 = solverVariableCreateObjectVariable7;
                            int i38 = this.mMinWidth;
                            int i39 = this.mMaxDimension[0];
                            float f12 = this.mHorizontalBiasPercent;
                            boolean z34 = dimensionBehaviourArr2[1] == dimensionBehaviour4;
                            solverVariableCreateObjectVariable = solverVariableCreateObjectVariable;
                            solverVariable6 = solverVariable6;
                            dimensionBehaviour4 = dimensionBehaviour4;
                            z12 = z12;
                            z18 = z24;
                            z17 = z26;
                            dimensionBehaviour2 = dimensionBehaviour2;
                            solverVariable = solverVariable8;
                            solverVariable2 = solverVariableCreateObjectVariable3;
                            linearSystem3 = linearSystem;
                            applyConstraints(linearSystem3, true, z19, z12, z32, solverVariable9, solverVariableCreateObjectVariable6, dimensionBehaviour6, z16, constraintAnchor, constraintAnchor2, i37, i14, i38, i39, f12, z33, z34, z18, z17, z29, i16, i13, this.mMatchConstraintMinWidth, this.mMatchConstraintMaxWidth, this.mMatchConstraintPercentWidth, z28);
                        }
                        if (z11 || (verticalWidgetRun = this.mVerticalRun) == null) {
                            solverVariable3 = solverVariable2;
                            solverVariable4 = solverVariable6;
                            solverVariable5 = r24;
                            i17 = 0;
                            c11 = 1;
                            i18 = 8;
                            i19 = 1;
                        } else {
                            DependencyNode dependencyNode3 = verticalWidgetRun.start;
                            if (dependencyNode3.resolved && verticalWidgetRun.end.resolved) {
                                int i41 = dependencyNode3.value;
                                solverVariable3 = solverVariable2;
                                linearSystem3.addEquality(solverVariable3, i41);
                                solverVariable4 = solverVariable6;
                                linearSystem3.addEquality(solverVariable4, this.mVerticalRun.end.value);
                                solverVariable5 = solverVariableCreateObjectVariable5;
                                linearSystem3.addEquality(solverVariable5, this.mVerticalRun.baseline.value);
                                ConstraintWidget constraintWidget6 = this.mParent;
                                if (constraintWidget6 == null || z17 || !z12) {
                                    i17 = 0;
                                    c11 = 1;
                                } else {
                                    c11 = 1;
                                    if (this.isTerminalWidget[1]) {
                                        i17 = 0;
                                        i18 = 8;
                                        linearSystem3.addGreaterThan(linearSystem3.createObjectVariable(constraintWidget6.mBottom), solverVariable4, 0, 8);
                                    } else {
                                        i17 = 0;
                                    }
                                    i19 = i17;
                                }
                                i18 = 8;
                                i19 = i17;
                            } else {
                                solverVariable3 = solverVariable2;
                                solverVariable4 = solverVariable6;
                                solverVariable5 = r24;
                                i17 = 0;
                                c11 = 1;
                                i18 = 8;
                                i19 = 1;
                            }
                        }
                        if (this.mVerticalResolution == 2) {
                            i21 = i17;
                        } else {
                            i21 = i19;
                        }
                        if (i21 == 0 && !this.mResolvedVertical) {
                            boolean z35 = (this.mListDimensionBehaviors[c11] == dimensionBehaviour2 && (this instanceof ConstraintWidgetContainer)) ? c11 : i17;
                            int i42 = z35 != 0 ? i17 : i32;
                            ConstraintWidget constraintWidget7 = this.mParent;
                            SolverVariable solverVariableCreateObjectVariable8 = constraintWidget7 != null ? linearSystem3.createObjectVariable(constraintWidget7.mBottom) : null;
                            ConstraintWidget constraintWidget8 = this.mParent;
                            SolverVariable solverVariableCreateObjectVariable9 = constraintWidget8 != null ? linearSystem3.createObjectVariable(constraintWidget8.mTop) : null;
                            if (this.mBaselineDistance > 0 || this.mVisibility == i18) {
                                z21 = z28;
                                ConstraintAnchor constraintAnchor3 = this.mBaseline;
                                if (constraintAnchor3.mTarget != null) {
                                    linearSystem3.addEquality(solverVariable5, solverVariable3, getBaselineDistance(), i18);
                                    linearSystem3.addEquality(solverVariable5, linearSystem3.createObjectVariable(this.mBaseline.mTarget), this.mBaseline.getMargin(), i18);
                                    if (z12) {
                                        linearSystem3.addGreaterThan(solverVariableCreateObjectVariable8, linearSystem3.createObjectVariable(this.mBottom), i17, 5);
                                    }
                                    z21 = i17;
                                } else if (this.mVisibility == i18) {
                                    linearSystem3.addEquality(solverVariable5, solverVariable3, constraintAnchor3.getMargin(), i18);
                                    z21 = z28;
                                } else {
                                    linearSystem3.addEquality(solverVariable5, solverVariable3, getBaselineDistance(), i18);
                                    z21 = z28;
                                }
                            }
                            z21 = z28;
                            boolean z36 = this.isTerminalWidget[c11];
                            DimensionBehaviour[] dimensionBehaviourArr3 = this.mListDimensionBehaviors;
                            int i43 = i17;
                            char c12 = c11;
                            applyConstraints(linearSystem, false, z12, z19, z36, solverVariableCreateObjectVariable9, solverVariableCreateObjectVariable8, dimensionBehaviourArr3[c11], z35, this.mTop, this.mBottom, this.f2201mY, i42, this.mMinHeight, this.mMaxDimension[c12], this.mVerticalBiasPercent, z15, dimensionBehaviourArr3[i43] == dimensionBehaviour4 ? c12 : i43, z17, z18, z31, i13, i16, this.mMatchConstraintMinHeight, this.mMatchConstraintMaxHeight, this.mMatchConstraintPercentHeight, z21);
                        }
                        if (!z14) {
                            linearSystem2 = linearSystem;
                        } else if (this.mResolvedDimensionRatioSide == 1) {
                            linearSystem.addRatio(solverVariable4, solverVariable3, solverVariable, solverVariableCreateObjectVariable, this.mResolvedDimensionRatio, 8);
                            linearSystem2 = linearSystem;
                        } else {
                            linearSystem.addRatio(solverVariable, solverVariableCreateObjectVariable, solverVariable4, solverVariable3, this.mResolvedDimensionRatio, 8);
                            linearSystem2 = linearSystem;
                        }
                        if (this.mCenter.isConnected()) {
                            linearSystem2.addCenterPoint(this, this.mCenter.getTarget().getOwner(), (float) Math.toRadians(this.mCircleConstraintAngle + 90.0f), this.mCenter.getMargin());
                        }
                        this.mResolvedHorizontal = false;
                        this.mResolvedVertical = false;
                        metrics = LinearSystem.sMetrics;
                        if (metrics != null) {
                            metrics.mEquations = linearSystem2.getNumEquations();
                            LinearSystem.sMetrics.mVariables = linearSystem2.getNumVariables();
                        }
                    }
                    i15 = -1;
                    if (z14) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    dimensionBehaviour = this.mListDimensionBehaviors[0];
                    dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour2) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    if (z16) {
                        i14 = 0;
                    }
                    boolean z210 = !this.mCenter.isConnected();
                    boolean[] zArr3 = this.mIsInBarrier;
                    boolean z211 = zArr3[0];
                    boolean z37 = zArr3[1];
                    if (this.mHorizontalResolution != 2) {
                        z19 = z13;
                        solverVariable2 = solverVariableCreateObjectVariable3;
                        z18 = z24;
                        z17 = z26;
                        i16 = i12;
                    } else {
                        z19 = z13;
                        solverVariable2 = solverVariableCreateObjectVariable3;
                        z18 = z24;
                        z17 = z26;
                        i16 = i12;
                    }
                    if (z11) {
                        solverVariable3 = solverVariable2;
                        solverVariable4 = solverVariable6;
                        solverVariable5 = r24;
                        i17 = 0;
                        c11 = 1;
                        i18 = 8;
                        i19 = 1;
                    } else {
                        solverVariable3 = solverVariable2;
                        solverVariable4 = solverVariable6;
                        solverVariable5 = r24;
                        i17 = 0;
                        c11 = 1;
                        i18 = 8;
                        i19 = 1;
                    }
                    if (this.mVerticalResolution == 2) {
                        i21 = i17;
                    } else {
                        i21 = i19;
                    }
                    if (i21 == 0) {
                    }
                    if (!z14) {
                        linearSystem2 = linearSystem;
                    } else if (this.mResolvedDimensionRatioSide == 1) {
                        linearSystem.addRatio(solverVariable4, solverVariable3, solverVariable, solverVariableCreateObjectVariable, this.mResolvedDimensionRatio, 8);
                        linearSystem2 = linearSystem;
                    } else {
                        linearSystem.addRatio(solverVariable, solverVariableCreateObjectVariable, solverVariable4, solverVariable3, this.mResolvedDimensionRatio, 8);
                        linearSystem2 = linearSystem;
                    }
                    if (this.mCenter.isConnected()) {
                        linearSystem2.addCenterPoint(this, this.mCenter.getTarget().getOwner(), (float) Math.toRadians(this.mCircleConstraintAngle + 90.0f), this.mCenter.getMargin());
                    }
                    this.mResolvedHorizontal = false;
                    this.mResolvedVertical = false;
                    metrics = LinearSystem.sMetrics;
                    if (metrics != null) {
                        metrics.mEquations = linearSystem2.getNumEquations();
                        LinearSystem.sMetrics.mVariables = linearSystem2.getNumVariables();
                    }
                }
                solverVariable = solverVariableCreateObjectVariable2;
                i23 = 3;
                if (dimensionBehaviour3 == dimensionBehaviour4 && i12 == i23) {
                    this.mResolvedDimensionRatioSide = 0;
                    int i44 = (int) (i28 * f11);
                    if (dimensionBehaviour5 != dimensionBehaviour4) {
                        i12 = 4;
                        i13 = i35;
                        i14 = i44;
                    } else {
                        solverVariable6 = solverVariable6;
                        i32 = i32;
                        i13 = i35;
                        i14 = i44;
                        z14 = true;
                    }
                } else {
                    if (dimensionBehaviour5 == dimensionBehaviour4 && i35 == i23) {
                        this.mResolvedDimensionRatioSide = 1;
                        if (i31 == -1) {
                            this.mResolvedDimensionRatio = 1.0f / f11;
                        }
                        i32 = (int) (this.mResolvedDimensionRatio * i26);
                        if (dimensionBehaviour3 != dimensionBehaviour4) {
                            solverVariable6 = solverVariable6;
                            i14 = i11;
                            z14 = false;
                            i13 = 4;
                        }
                    } else {
                        i32 = i32;
                    }
                    z14 = true;
                    i13 = i35;
                    i14 = i11;
                }
                int[] iArr2 = this.mResolvedMatchConstraintDefault;
                iArr2[0] = i12;
                iArr2[1] = i13;
                this.mResolvedHasRatio = z14;
                if (z14) {
                    int i310 = this.mResolvedDimensionRatioSide;
                    i15 = -1;
                    if (i310 != 0) {
                    }
                    if (z14) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    dimensionBehaviour = this.mListDimensionBehaviors[0];
                    dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour2) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    if (z16) {
                        i14 = 0;
                    }
                    boolean z212 = !this.mCenter.isConnected();
                    boolean[] zArr4 = this.mIsInBarrier;
                    boolean z213 = zArr4[0];
                    boolean z38 = zArr4[1];
                    if (this.mHorizontalResolution != 2) {
                        z19 = z13;
                        solverVariable2 = solverVariableCreateObjectVariable3;
                        z18 = z24;
                        z17 = z26;
                        i16 = i12;
                    } else {
                        z19 = z13;
                        solverVariable2 = solverVariableCreateObjectVariable3;
                        z18 = z24;
                        z17 = z26;
                        i16 = i12;
                    }
                    if (z11) {
                        solverVariable3 = solverVariable2;
                        solverVariable4 = solverVariable6;
                        solverVariable5 = r24;
                        i17 = 0;
                        c11 = 1;
                        i18 = 8;
                        i19 = 1;
                    } else {
                        solverVariable3 = solverVariable2;
                        solverVariable4 = solverVariable6;
                        solverVariable5 = r24;
                        i17 = 0;
                        c11 = 1;
                        i18 = 8;
                        i19 = 1;
                    }
                    if (this.mVerticalResolution == 2) {
                        i21 = i17;
                    } else {
                        i21 = i19;
                    }
                    if (i21 == 0) {
                    }
                    if (!z14) {
                        linearSystem2 = linearSystem;
                    } else if (this.mResolvedDimensionRatioSide == 1) {
                        linearSystem.addRatio(solverVariable4, solverVariable3, solverVariable, solverVariableCreateObjectVariable, this.mResolvedDimensionRatio, 8);
                        linearSystem2 = linearSystem;
                    } else {
                        linearSystem.addRatio(solverVariable, solverVariableCreateObjectVariable, solverVariable4, solverVariable3, this.mResolvedDimensionRatio, 8);
                        linearSystem2 = linearSystem;
                    }
                    if (this.mCenter.isConnected()) {
                        linearSystem2.addCenterPoint(this, this.mCenter.getTarget().getOwner(), (float) Math.toRadians(this.mCircleConstraintAngle + 90.0f), this.mCenter.getMargin());
                    }
                    this.mResolvedHorizontal = false;
                    this.mResolvedVertical = false;
                    metrics = LinearSystem.sMetrics;
                    if (metrics != null) {
                        metrics.mEquations = linearSystem2.getNumEquations();
                        LinearSystem.sMetrics.mVariables = linearSystem2.getNumVariables();
                    }
                }
                i15 = -1;
                if (z14) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                dimensionBehaviour = this.mListDimensionBehaviors[0];
                dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour == dimensionBehaviour2) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                if (z16) {
                    i14 = 0;
                }
                boolean z214 = !this.mCenter.isConnected();
                boolean[] zArr5 = this.mIsInBarrier;
                boolean z215 = zArr5[0];
                boolean z39 = zArr5[1];
                if (this.mHorizontalResolution != 2) {
                    z19 = z13;
                    solverVariable2 = solverVariableCreateObjectVariable3;
                    z18 = z24;
                    z17 = z26;
                    i16 = i12;
                } else {
                    z19 = z13;
                    solverVariable2 = solverVariableCreateObjectVariable3;
                    z18 = z24;
                    z17 = z26;
                    i16 = i12;
                }
                if (z11) {
                    solverVariable3 = solverVariable2;
                    solverVariable4 = solverVariable6;
                    solverVariable5 = r24;
                    i17 = 0;
                    c11 = 1;
                    i18 = 8;
                    i19 = 1;
                } else {
                    solverVariable3 = solverVariable2;
                    solverVariable4 = solverVariable6;
                    solverVariable5 = r24;
                    i17 = 0;
                    c11 = 1;
                    i18 = 8;
                    i19 = 1;
                }
                if (this.mVerticalResolution == 2) {
                    i21 = i17;
                } else {
                    i21 = i19;
                }
                if (i21 == 0) {
                }
                if (!z14) {
                    linearSystem2 = linearSystem;
                } else if (this.mResolvedDimensionRatioSide == 1) {
                    linearSystem.addRatio(solverVariable4, solverVariable3, solverVariable, solverVariableCreateObjectVariable, this.mResolvedDimensionRatio, 8);
                    linearSystem2 = linearSystem;
                } else {
                    linearSystem.addRatio(solverVariable, solverVariableCreateObjectVariable, solverVariable4, solverVariable3, this.mResolvedDimensionRatio, 8);
                    linearSystem2 = linearSystem;
                }
                if (this.mCenter.isConnected()) {
                    linearSystem2.addCenterPoint(this, this.mCenter.getTarget().getOwner(), (float) Math.toRadians(this.mCircleConstraintAngle + 90.0f), this.mCenter.getMargin());
                }
                this.mResolvedHorizontal = false;
                this.mResolvedVertical = false;
                metrics = LinearSystem.sMetrics;
                if (metrics != null) {
                    metrics.mEquations = linearSystem2.getNumEquations();
                    LinearSystem.sMetrics.mVariables = linearSystem2.getNumVariables();
                }
            }
            z14 = false;
            int[] iArr3 = this.mResolvedMatchConstraintDefault;
            iArr3[0] = i12;
            iArr3[1] = i13;
            this.mResolvedHasRatio = z14;
            if (z14) {
                int i311 = this.mResolvedDimensionRatioSide;
                i15 = -1;
                if (i311 != 0) {
                }
                if (z14) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                dimensionBehaviour = this.mListDimensionBehaviors[0];
                dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour == dimensionBehaviour2) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                if (z16) {
                    i14 = 0;
                }
                boolean z216 = !this.mCenter.isConnected();
                boolean[] zArr6 = this.mIsInBarrier;
                boolean z217 = zArr6[0];
                boolean z310 = zArr6[1];
                if (this.mHorizontalResolution != 2) {
                    z19 = z13;
                    solverVariable2 = solverVariableCreateObjectVariable3;
                    z18 = z24;
                    z17 = z26;
                    i16 = i12;
                } else {
                    z19 = z13;
                    solverVariable2 = solverVariableCreateObjectVariable3;
                    z18 = z24;
                    z17 = z26;
                    i16 = i12;
                }
                if (z11) {
                    solverVariable3 = solverVariable2;
                    solverVariable4 = solverVariable6;
                    solverVariable5 = r24;
                    i17 = 0;
                    c11 = 1;
                    i18 = 8;
                    i19 = 1;
                } else {
                    solverVariable3 = solverVariable2;
                    solverVariable4 = solverVariable6;
                    solverVariable5 = r24;
                    i17 = 0;
                    c11 = 1;
                    i18 = 8;
                    i19 = 1;
                }
                if (this.mVerticalResolution == 2) {
                    i21 = i17;
                } else {
                    i21 = i19;
                }
                if (i21 == 0) {
                }
                if (!z14) {
                    linearSystem2 = linearSystem;
                } else if (this.mResolvedDimensionRatioSide == 1) {
                    linearSystem.addRatio(solverVariable4, solverVariable3, solverVariable, solverVariableCreateObjectVariable, this.mResolvedDimensionRatio, 8);
                    linearSystem2 = linearSystem;
                } else {
                    linearSystem.addRatio(solverVariable, solverVariableCreateObjectVariable, solverVariable4, solverVariable3, this.mResolvedDimensionRatio, 8);
                    linearSystem2 = linearSystem;
                }
                if (this.mCenter.isConnected()) {
                    linearSystem2.addCenterPoint(this, this.mCenter.getTarget().getOwner(), (float) Math.toRadians(this.mCircleConstraintAngle + 90.0f), this.mCenter.getMargin());
                }
                this.mResolvedHorizontal = false;
                this.mResolvedVertical = false;
                metrics = LinearSystem.sMetrics;
                if (metrics != null) {
                    metrics.mEquations = linearSystem2.getNumEquations();
                    LinearSystem.sMetrics.mVariables = linearSystem2.getNumVariables();
                }
            }
            i15 = -1;
            if (z14) {
                z15 = false;
            } else {
                z15 = false;
            }
            dimensionBehaviour = this.mListDimensionBehaviors[0];
            dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
            if (dimensionBehaviour == dimensionBehaviour2) {
                z16 = false;
            } else {
                z16 = false;
            }
            if (z16) {
                i14 = 0;
            }
            boolean z218 = !this.mCenter.isConnected();
            boolean[] zArr7 = this.mIsInBarrier;
            boolean z219 = zArr7[0];
            boolean z311 = zArr7[1];
            if (this.mHorizontalResolution != 2) {
                z19 = z13;
                solverVariable2 = solverVariableCreateObjectVariable3;
                z18 = z24;
                z17 = z26;
                i16 = i12;
            } else {
                z19 = z13;
                solverVariable2 = solverVariableCreateObjectVariable3;
                z18 = z24;
                z17 = z26;
                i16 = i12;
            }
            if (z11) {
                solverVariable3 = solverVariable2;
                solverVariable4 = solverVariable6;
                solverVariable5 = r24;
                i17 = 0;
                c11 = 1;
                i18 = 8;
                i19 = 1;
            } else {
                solverVariable3 = solverVariable2;
                solverVariable4 = solverVariable6;
                solverVariable5 = r24;
                i17 = 0;
                c11 = 1;
                i18 = 8;
                i19 = 1;
            }
            if (this.mVerticalResolution == 2) {
                i21 = i17;
            } else {
                i21 = i19;
            }
            if (i21 == 0) {
            }
            if (!z14) {
                linearSystem2 = linearSystem;
            } else if (this.mResolvedDimensionRatioSide == 1) {
                linearSystem.addRatio(solverVariable4, solverVariable3, solverVariable, solverVariableCreateObjectVariable, this.mResolvedDimensionRatio, 8);
                linearSystem2 = linearSystem;
            } else {
                linearSystem.addRatio(solverVariable, solverVariableCreateObjectVariable, solverVariable4, solverVariable3, this.mResolvedDimensionRatio, 8);
                linearSystem2 = linearSystem;
            }
            if (this.mCenter.isConnected()) {
                linearSystem2.addCenterPoint(this, this.mCenter.getTarget().getOwner(), (float) Math.toRadians(this.mCircleConstraintAngle + 90.0f), this.mCenter.getMargin());
            }
            this.mResolvedHorizontal = false;
            this.mResolvedVertical = false;
            metrics = LinearSystem.sMetrics;
            if (metrics != null) {
                metrics.mEquations = linearSystem2.getNumEquations();
                LinearSystem.sMetrics.mVariables = linearSystem2.getNumVariables();
            }
        }
        i11 = i27;
        solverVariable = solverVariableCreateObjectVariable2;
        i12 = i33;
        i13 = i34;
        i14 = i11;
        z14 = false;
        int[] iArr4 = this.mResolvedMatchConstraintDefault;
        iArr4[0] = i12;
        iArr4[1] = i13;
        this.mResolvedHasRatio = z14;
        if (z14) {
            int i312 = this.mResolvedDimensionRatioSide;
            i15 = -1;
            if (i312 != 0) {
            }
            if (z14) {
                z15 = false;
            } else {
                z15 = false;
            }
            dimensionBehaviour = this.mListDimensionBehaviors[0];
            dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
            if (dimensionBehaviour == dimensionBehaviour2) {
                z16 = false;
            } else {
                z16 = false;
            }
            if (z16) {
                i14 = 0;
            }
            boolean z2110 = !this.mCenter.isConnected();
            boolean[] zArr8 = this.mIsInBarrier;
            boolean z2111 = zArr8[0];
            boolean z312 = zArr8[1];
            if (this.mHorizontalResolution != 2) {
                z19 = z13;
                solverVariable2 = solverVariableCreateObjectVariable3;
                z18 = z24;
                z17 = z26;
                i16 = i12;
            } else {
                z19 = z13;
                solverVariable2 = solverVariableCreateObjectVariable3;
                z18 = z24;
                z17 = z26;
                i16 = i12;
            }
            if (z11) {
                solverVariable3 = solverVariable2;
                solverVariable4 = solverVariable6;
                solverVariable5 = r24;
                i17 = 0;
                c11 = 1;
                i18 = 8;
                i19 = 1;
            } else {
                solverVariable3 = solverVariable2;
                solverVariable4 = solverVariable6;
                solverVariable5 = r24;
                i17 = 0;
                c11 = 1;
                i18 = 8;
                i19 = 1;
            }
            if (this.mVerticalResolution == 2) {
                i21 = i17;
            } else {
                i21 = i19;
            }
            if (i21 == 0) {
            }
            if (!z14) {
                linearSystem2 = linearSystem;
            } else if (this.mResolvedDimensionRatioSide == 1) {
                linearSystem.addRatio(solverVariable4, solverVariable3, solverVariable, solverVariableCreateObjectVariable, this.mResolvedDimensionRatio, 8);
                linearSystem2 = linearSystem;
            } else {
                linearSystem.addRatio(solverVariable, solverVariableCreateObjectVariable, solverVariable4, solverVariable3, this.mResolvedDimensionRatio, 8);
                linearSystem2 = linearSystem;
            }
            if (this.mCenter.isConnected()) {
                linearSystem2.addCenterPoint(this, this.mCenter.getTarget().getOwner(), (float) Math.toRadians(this.mCircleConstraintAngle + 90.0f), this.mCenter.getMargin());
            }
            this.mResolvedHorizontal = false;
            this.mResolvedVertical = false;
            metrics = LinearSystem.sMetrics;
            if (metrics != null) {
                metrics.mEquations = linearSystem2.getNumEquations();
                LinearSystem.sMetrics.mVariables = linearSystem2.getNumVariables();
            }
        }
        i15 = -1;
        if (z14) {
            z15 = false;
        } else {
            z15 = false;
        }
        dimensionBehaviour = this.mListDimensionBehaviors[0];
        dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour == dimensionBehaviour2) {
            z16 = false;
        } else {
            z16 = false;
        }
        if (z16) {
            i14 = 0;
        }
        boolean z2112 = !this.mCenter.isConnected();
        boolean[] zArr9 = this.mIsInBarrier;
        boolean z2113 = zArr9[0];
        boolean z313 = zArr9[1];
        if (this.mHorizontalResolution != 2) {
            z19 = z13;
            solverVariable2 = solverVariableCreateObjectVariable3;
            z18 = z24;
            z17 = z26;
            i16 = i12;
        } else {
            z19 = z13;
            solverVariable2 = solverVariableCreateObjectVariable3;
            z18 = z24;
            z17 = z26;
            i16 = i12;
        }
        if (z11) {
            solverVariable3 = solverVariable2;
            solverVariable4 = solverVariable6;
            solverVariable5 = r24;
            i17 = 0;
            c11 = 1;
            i18 = 8;
            i19 = 1;
        } else {
            solverVariable3 = solverVariable2;
            solverVariable4 = solverVariable6;
            solverVariable5 = r24;
            i17 = 0;
            c11 = 1;
            i18 = 8;
            i19 = 1;
        }
        if (this.mVerticalResolution == 2) {
            i21 = i17;
        } else {
            i21 = i19;
        }
        if (i21 == 0) {
        }
        if (!z14) {
            linearSystem2 = linearSystem;
        } else if (this.mResolvedDimensionRatioSide == 1) {
            linearSystem.addRatio(solverVariable4, solverVariable3, solverVariable, solverVariableCreateObjectVariable, this.mResolvedDimensionRatio, 8);
            linearSystem2 = linearSystem;
        } else {
            linearSystem.addRatio(solverVariable, solverVariableCreateObjectVariable, solverVariable4, solverVariable3, this.mResolvedDimensionRatio, 8);
            linearSystem2 = linearSystem;
        }
        if (this.mCenter.isConnected()) {
            linearSystem2.addCenterPoint(this, this.mCenter.getTarget().getOwner(), (float) Math.toRadians(this.mCircleConstraintAngle + 90.0f), this.mCenter.getMargin());
        }
        this.mResolvedHorizontal = false;
        this.mResolvedVertical = false;
        metrics = LinearSystem.sMetrics;
        if (metrics != null) {
            metrics.mEquations = linearSystem2.getNumEquations();
            LinearSystem.sMetrics.mVariables = linearSystem2.getNumVariables();
        }
    }

    public boolean allowedInBarrier() {
        return this.mVisibility != 8;
    }

    public void connectCircularConstraint(ConstraintWidget constraintWidget, float f11, int i11) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
        immediateConnect(type, constraintWidget, type, i11, 0);
        this.mCircleConstraintAngle = f11;
    }

    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        this.mHorizontalResolution = constraintWidget.mHorizontalResolution;
        this.mVerticalResolution = constraintWidget.mVerticalResolution;
        this.mMatchConstraintDefaultWidth = constraintWidget.mMatchConstraintDefaultWidth;
        this.mMatchConstraintDefaultHeight = constraintWidget.mMatchConstraintDefaultHeight;
        int[] iArr = this.mResolvedMatchConstraintDefault;
        int[] iArr2 = constraintWidget.mResolvedMatchConstraintDefault;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.mMatchConstraintMinWidth = constraintWidget.mMatchConstraintMinWidth;
        this.mMatchConstraintMaxWidth = constraintWidget.mMatchConstraintMaxWidth;
        this.mMatchConstraintMinHeight = constraintWidget.mMatchConstraintMinHeight;
        this.mMatchConstraintMaxHeight = constraintWidget.mMatchConstraintMaxHeight;
        this.mMatchConstraintPercentHeight = constraintWidget.mMatchConstraintPercentHeight;
        this.mIsWidthWrapContent = constraintWidget.mIsWidthWrapContent;
        this.mIsHeightWrapContent = constraintWidget.mIsHeightWrapContent;
        this.mResolvedDimensionRatioSide = constraintWidget.mResolvedDimensionRatioSide;
        this.mResolvedDimensionRatio = constraintWidget.mResolvedDimensionRatio;
        int[] iArr3 = constraintWidget.mMaxDimension;
        this.mMaxDimension = Arrays.copyOf(iArr3, iArr3.length);
        this.mCircleConstraintAngle = constraintWidget.mCircleConstraintAngle;
        this.mHasBaseline = constraintWidget.mHasBaseline;
        this.mInPlaceholder = constraintWidget.mInPlaceholder;
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mListDimensionBehaviors = (DimensionBehaviour[]) Arrays.copyOf(this.mListDimensionBehaviors, 2);
        this.mParent = this.mParent == null ? null : map.get(constraintWidget.mParent);
        this.mWidth = constraintWidget.mWidth;
        this.mHeight = constraintWidget.mHeight;
        this.mDimensionRatio = constraintWidget.mDimensionRatio;
        this.mDimensionRatioSide = constraintWidget.mDimensionRatioSide;
        this.f2200mX = constraintWidget.f2200mX;
        this.f2201mY = constraintWidget.f2201mY;
        this.mRelX = constraintWidget.mRelX;
        this.mRelY = constraintWidget.mRelY;
        this.mOffsetX = constraintWidget.mOffsetX;
        this.mOffsetY = constraintWidget.mOffsetY;
        this.mBaselineDistance = constraintWidget.mBaselineDistance;
        this.mMinWidth = constraintWidget.mMinWidth;
        this.mMinHeight = constraintWidget.mMinHeight;
        this.mHorizontalBiasPercent = constraintWidget.mHorizontalBiasPercent;
        this.mVerticalBiasPercent = constraintWidget.mVerticalBiasPercent;
        this.mCompanionWidget = constraintWidget.mCompanionWidget;
        this.mContainerItemSkip = constraintWidget.mContainerItemSkip;
        this.mVisibility = constraintWidget.mVisibility;
        this.mAnimated = constraintWidget.mAnimated;
        this.mDebugName = constraintWidget.mDebugName;
        this.mType = constraintWidget.mType;
        this.mDistToTop = constraintWidget.mDistToTop;
        this.mDistToLeft = constraintWidget.mDistToLeft;
        this.mDistToRight = constraintWidget.mDistToRight;
        this.mDistToBottom = constraintWidget.mDistToBottom;
        this.mLeftHasCentered = constraintWidget.mLeftHasCentered;
        this.mRightHasCentered = constraintWidget.mRightHasCentered;
        this.mTopHasCentered = constraintWidget.mTopHasCentered;
        this.mBottomHasCentered = constraintWidget.mBottomHasCentered;
        this.mHorizontalWrapVisited = constraintWidget.mHorizontalWrapVisited;
        this.mVerticalWrapVisited = constraintWidget.mVerticalWrapVisited;
        this.mHorizontalChainStyle = constraintWidget.mHorizontalChainStyle;
        this.mVerticalChainStyle = constraintWidget.mVerticalChainStyle;
        this.mHorizontalChainFixedPosition = constraintWidget.mHorizontalChainFixedPosition;
        this.mVerticalChainFixedPosition = constraintWidget.mVerticalChainFixedPosition;
        float[] fArr = this.mWeight;
        float[] fArr2 = constraintWidget.mWeight;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.mListNextMatchConstraintsWidget;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.mListNextMatchConstraintsWidget;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.mNextChainWidget;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.mNextChainWidget;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget2 = constraintWidget.mHorizontalNextWidget;
        this.mHorizontalNextWidget = constraintWidget2 == null ? null : map.get(constraintWidget2);
        ConstraintWidget constraintWidget3 = constraintWidget.mVerticalNextWidget;
        this.mVerticalNextWidget = constraintWidget3 != null ? map.get(constraintWidget3) : null;
    }

    public void createObjectVariables(LinearSystem linearSystem) {
        linearSystem.createObjectVariable(this.mLeft);
        linearSystem.createObjectVariable(this.mTop);
        linearSystem.createObjectVariable(this.mRight);
        linearSystem.createObjectVariable(this.mBottom);
        if (this.mBaselineDistance > 0) {
            linearSystem.createObjectVariable(this.mBaseline);
        }
    }

    public void ensureWidgetRuns() {
        if (this.mHorizontalRun == null) {
            this.mHorizontalRun = new HorizontalWidgetRun(this);
        }
        if (this.mVerticalRun == null) {
            this.mVerticalRun = new VerticalWidgetRun(this);
        }
    }

    public ConstraintAnchor getAnchor(ConstraintAnchor.Type type) {
        switch (C15001.f2202x6930e354[type.ordinal()]) {
            case 1:
                return this.mLeft;
            case 2:
                return this.mTop;
            case 3:
                return this.mRight;
            case 4:
                return this.mBottom;
            case 5:
                return this.mBaseline;
            case 6:
                return this.mCenter;
            case 7:
                return this.mCenterX;
            case 8:
                return this.mCenterY;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public ArrayList<ConstraintAnchor> getAnchors() {
        return this.mAnchors;
    }

    public int getBaselineDistance() {
        return this.mBaselineDistance;
    }

    public float getBiasPercent(int i11) {
        if (i11 == 0) {
            return this.mHorizontalBiasPercent;
        }
        if (i11 == 1) {
            return this.mVerticalBiasPercent;
        }
        return -1.0f;
    }

    public Object getCompanionWidget() {
        return this.mCompanionWidget;
    }

    public int getContainerItemSkip() {
        return this.mContainerItemSkip;
    }

    public String getDebugName() {
        return this.mDebugName;
    }

    public DimensionBehaviour getDimensionBehaviour(int i11) {
        if (i11 == 0) {
            return getHorizontalDimensionBehaviour();
        }
        if (i11 == 1) {
            return getVerticalDimensionBehaviour();
        }
        return null;
    }

    public float getDimensionRatio() {
        return this.mDimensionRatio;
    }

    public int getDimensionRatioSide() {
        return this.mDimensionRatioSide;
    }

    public boolean getHasBaseline() {
        return this.mHasBaseline;
    }

    public int getHeight() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mHeight;
    }

    public float getHorizontalBiasPercent() {
        return this.mHorizontalBiasPercent;
    }

    public int getHorizontalChainStyle() {
        return this.mHorizontalChainStyle;
    }

    public DimensionBehaviour getHorizontalDimensionBehaviour() {
        return this.mListDimensionBehaviors[0];
    }

    public int getHorizontalMargin() {
        ConstraintAnchor constraintAnchor = this.mLeft;
        int i11 = constraintAnchor != null ? constraintAnchor.mMargin : 0;
        ConstraintAnchor constraintAnchor2 = this.mRight;
        return constraintAnchor2 != null ? i11 + constraintAnchor2.mMargin : i11;
    }

    public int getLastHorizontalMeasureSpec() {
        return this.mLastHorizontalMeasureSpec;
    }

    public int getLastVerticalMeasureSpec() {
        return this.mLastVerticalMeasureSpec;
    }

    public int getLength(int i11) {
        if (i11 == 0) {
            return getWidth();
        }
        if (i11 == 1) {
            return getHeight();
        }
        return 0;
    }

    public int getMaxHeight() {
        return this.mMaxDimension[1];
    }

    public int getMaxWidth() {
        return this.mMaxDimension[0];
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public ConstraintWidget getNextChainMember(int i11) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i11 != 0) {
            if (i11 == 1 && (constraintAnchor2 = (constraintAnchor = this.mBottom).mTarget) != null && constraintAnchor2.mTarget == constraintAnchor) {
                return constraintAnchor2.mOwner;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.mRight;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        if (constraintAnchor4 == null || constraintAnchor4.mTarget != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.mOwner;
    }

    public int getOptimizerWrapHeight() {
        int iMax = this.mHeight;
        if (this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            if (this.mMatchConstraintDefaultHeight == 1) {
                iMax = Math.max(this.mMatchConstraintMinHeight, iMax);
            } else {
                iMax = this.mMatchConstraintMinHeight;
                if (iMax > 0) {
                    this.mHeight = iMax;
                } else {
                    iMax = 0;
                }
            }
            int i11 = this.mMatchConstraintMaxHeight;
            if (i11 > 0 && i11 < iMax) {
                return i11;
            }
        }
        return iMax;
    }

    public int getOptimizerWrapWidth() {
        int i11 = this.mWidth;
        int iMax = 0;
        if (this.mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i11;
        }
        if (this.mMatchConstraintDefaultWidth == 1) {
            iMax = Math.max(this.mMatchConstraintMinWidth, i11);
        } else {
            int i12 = this.mMatchConstraintMinWidth;
            if (i12 > 0) {
                this.mWidth = i12;
                iMax = i12;
            }
        }
        int i13 = this.mMatchConstraintMaxWidth;
        return (i13 <= 0 || i13 >= iMax) ? iMax : i13;
    }

    public ConstraintWidget getParent() {
        return this.mParent;
    }

    public ConstraintWidget getPreviousChainMember(int i11) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i11 != 0) {
            if (i11 == 1 && (constraintAnchor2 = (constraintAnchor = this.mTop).mTarget) != null && constraintAnchor2.mTarget == constraintAnchor) {
                return constraintAnchor2.mOwner;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.mLeft;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        if (constraintAnchor4 == null || constraintAnchor4.mTarget != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.mOwner;
    }

    public int getRelativePositioning(int i11) {
        if (i11 == 0) {
            return this.mRelX;
        }
        if (i11 == 1) {
            return this.mRelY;
        }
        return 0;
    }

    public int getRootX() {
        return this.f2200mX + this.mOffsetX;
    }

    public int getRootY() {
        return this.f2201mY + this.mOffsetY;
    }

    public WidgetRun getRun(int i11) {
        if (i11 == 0) {
            return this.mHorizontalRun;
        }
        if (i11 == 1) {
            return this.mVerticalRun;
        }
        return null;
    }

    public String getType() {
        return this.mType;
    }

    public float getVerticalBiasPercent() {
        return this.mVerticalBiasPercent;
    }

    public int getVerticalChainStyle() {
        return this.mVerticalChainStyle;
    }

    public DimensionBehaviour getVerticalDimensionBehaviour() {
        return this.mListDimensionBehaviors[1];
    }

    public int getVerticalMargin() {
        int i11 = this.mLeft != null ? this.mTop.mMargin : 0;
        return this.mRight != null ? i11 + this.mBottom.mMargin : i11;
    }

    public int getVisibility() {
        return this.mVisibility;
    }

    public int getWidth() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mWidth;
    }

    public int getWrapBehaviorInParent() {
        return this.mWrapBehaviorInParent;
    }

    public int getX() {
        ConstraintWidget constraintWidget = this.mParent;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.f2200mX : ((ConstraintWidgetContainer) constraintWidget).mPaddingLeft + this.f2200mX;
    }

    public int getY() {
        ConstraintWidget constraintWidget = this.mParent;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.f2201mY : ((ConstraintWidgetContainer) constraintWidget).mPaddingTop + this.f2201mY;
    }

    public boolean hasBaseline() {
        return this.mHasBaseline;
    }

    public boolean hasDependencies() {
        int size = this.mAnchors.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.mAnchors.get(i11).hasDependents()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasDimensionOverride() {
        return (this.mWidthOverride == -1 && this.mHeightOverride == -1) ? false : true;
    }

    public boolean isAnimated() {
        return this.mAnimated;
    }

    public boolean isHeightWrapContent() {
        return this.mIsHeightWrapContent;
    }

    public boolean isHorizontalSolvingPassDone() {
        return this.mHorizontalSolvingPass;
    }

    public boolean isInBarrier(int i11) {
        return this.mIsInBarrier[i11];
    }

    public boolean isInHorizontalChain() {
        ConstraintAnchor constraintAnchor = this.mLeft;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 != null && constraintAnchor2.mTarget == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.mRight;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        return constraintAnchor4 != null && constraintAnchor4.mTarget == constraintAnchor3;
    }

    public boolean isInPlaceholder() {
        return this.mInPlaceholder;
    }

    public boolean isInVerticalChain() {
        ConstraintAnchor constraintAnchor = this.mTop;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 != null && constraintAnchor2.mTarget == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.mBottom;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        return constraintAnchor4 != null && constraintAnchor4.mTarget == constraintAnchor3;
    }

    public boolean isInVirtualLayout() {
        return this.mInVirtualLayout;
    }

    public boolean isMeasureRequested() {
        return this.mMeasureRequested && this.mVisibility != 8;
    }

    public boolean isResolvedHorizontally() {
        if (this.mResolvedHorizontal) {
            return true;
        }
        return this.mLeft.hasFinalValue() && this.mRight.hasFinalValue();
    }

    public boolean isResolvedVertically() {
        if (this.mResolvedVertical) {
            return true;
        }
        return this.mTop.hasFinalValue() && this.mBottom.hasFinalValue();
    }

    public boolean isRoot() {
        return this.mParent == null;
    }

    public boolean isSpreadHeight() {
        return this.mMatchConstraintDefaultHeight == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinHeight == 0 && this.mMatchConstraintMaxHeight == 0 && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean isSpreadWidth() {
        return this.mMatchConstraintDefaultWidth == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinWidth == 0 && this.mMatchConstraintMaxWidth == 0 && this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean isVerticalSolvingPassDone() {
        return this.mVerticalSolvingPass;
    }

    public boolean isWidthWrapContent() {
        return this.mIsWidthWrapContent;
    }

    public boolean oppositeDimensionsTied() {
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.MATCH_CONSTRAINT;
        return dimensionBehaviour == dimensionBehaviour2 && dimensionBehaviourArr[1] == dimensionBehaviour2;
    }

    public void reset() {
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mParent = null;
        this.mCircleConstraintAngle = Float.NaN;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.f2200mX = 0;
        this.f2201mY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        float f11 = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f11;
        this.mVerticalBiasPercent = f11;
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.mCompanionWidget = null;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mType = null;
        this.mHorizontalWrapVisited = false;
        this.mVerticalWrapVisited = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mHorizontalChainFixedPosition = false;
        this.mVerticalChainFixedPosition = false;
        float[] fArr = this.mWeight;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        int[] iArr = this.mMaxDimension;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mMatchConstraintMaxWidth = Integer.MAX_VALUE;
        this.mMatchConstraintMaxHeight = Integer.MAX_VALUE;
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMinHeight = 0;
        this.mResolvedHasRatio = false;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mGroupsToSolver = false;
        boolean[] zArr = this.isTerminalWidget;
        zArr[0] = true;
        zArr[1] = true;
        this.mInVirtualLayout = false;
        boolean[] zArr2 = this.mIsInBarrier;
        zArr2[0] = false;
        zArr2[1] = false;
        this.mMeasureRequested = true;
        int[] iArr2 = this.mResolvedMatchConstraintDefault;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
    }

    public void resetSolverVariables(Cache cache) {
        this.mLeft.resetSolverVariable(cache);
        this.mTop.resetSolverVariable(cache);
        this.mRight.resetSolverVariable(cache);
        this.mBottom.resetSolverVariable(cache);
        this.mBaseline.resetSolverVariable(cache);
        this.mCenter.resetSolverVariable(cache);
        this.mCenterX.resetSolverVariable(cache);
        this.mCenterY.resetSolverVariable(cache);
    }

    public void setAnimated(boolean z11) {
        this.mAnimated = z11;
    }

    public void setBaselineDistance(int i11) {
        this.mBaselineDistance = i11;
        this.mHasBaseline = i11 > 0;
    }

    public void setCompanionWidget(Object obj) {
        this.mCompanionWidget = obj;
    }

    public void setContainerItemSkip(int i11) {
        if (i11 >= 0) {
            this.mContainerItemSkip = i11;
        } else {
            this.mContainerItemSkip = 0;
        }
    }

    public void setDebugName(String str) {
        this.mDebugName = str;
    }

    public void setDebugSolverName(LinearSystem linearSystem, String str) {
        this.mDebugName = str;
        SolverVariable solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mLeft);
        SolverVariable solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(this.mTop);
        SolverVariable solverVariableCreateObjectVariable3 = linearSystem.createObjectVariable(this.mRight);
        SolverVariable solverVariableCreateObjectVariable4 = linearSystem.createObjectVariable(this.mBottom);
        solverVariableCreateObjectVariable.setName(str + ".left");
        solverVariableCreateObjectVariable2.setName(str + ".top");
        solverVariableCreateObjectVariable3.setName(str + ".right");
        solverVariableCreateObjectVariable4.setName(str + ".bottom");
        linearSystem.createObjectVariable(this.mBaseline).setName(str + ".baseline");
    }

    public void setDimension(int i11, int i12) {
        this.mWidth = i11;
        int i13 = this.mMinWidth;
        if (i11 < i13) {
            this.mWidth = i13;
        }
        this.mHeight = i12;
        int i14 = this.mMinHeight;
        if (i12 < i14) {
            this.mHeight = i14;
        }
    }

    public void setFinalBaseline(int i11) {
        if (this.mHasBaseline) {
            int i12 = i11 - this.mBaselineDistance;
            int i13 = this.mHeight + i12;
            this.f2201mY = i12;
            this.mTop.setFinalValue(i12);
            this.mBottom.setFinalValue(i13);
            this.mBaseline.setFinalValue(i11);
            this.mResolvedVertical = true;
        }
    }

    public void setFinalHorizontal(int i11, int i12) {
        if (this.mResolvedHorizontal) {
            return;
        }
        this.mLeft.setFinalValue(i11);
        this.mRight.setFinalValue(i12);
        this.f2200mX = i11;
        this.mWidth = i12 - i11;
        this.mResolvedHorizontal = true;
    }

    public void setFinalLeft(int i11) {
        this.mLeft.setFinalValue(i11);
        this.f2200mX = i11;
    }

    public void setFinalTop(int i11) {
        this.mTop.setFinalValue(i11);
        this.f2201mY = i11;
    }

    public void setFinalVertical(int i11, int i12) {
        if (this.mResolvedVertical) {
            return;
        }
        this.mTop.setFinalValue(i11);
        this.mBottom.setFinalValue(i12);
        this.f2201mY = i11;
        this.mHeight = i12 - i11;
        if (this.mHasBaseline) {
            this.mBaseline.setFinalValue(i11 + this.mBaselineDistance);
        }
        this.mResolvedVertical = true;
    }

    public void setGoneMargin(ConstraintAnchor.Type type, int i11) {
        int i12 = C15001.f2202x6930e354[type.ordinal()];
        if (i12 == 1) {
            this.mLeft.mGoneMargin = i11;
            return;
        }
        if (i12 == 2) {
            this.mTop.mGoneMargin = i11;
            return;
        }
        if (i12 == 3) {
            this.mRight.mGoneMargin = i11;
        } else if (i12 == 4) {
            this.mBottom.mGoneMargin = i11;
        } else {
            if (i12 != 5) {
                return;
            }
            this.mBaseline.mGoneMargin = i11;
        }
    }

    public void setHasBaseline(boolean z11) {
        this.mHasBaseline = z11;
    }

    public void setHeight(int i11) {
        this.mHeight = i11;
        int i12 = this.mMinHeight;
        if (i11 < i12) {
            this.mHeight = i12;
        }
    }

    public void setHeightWrapContent(boolean z11) {
        this.mIsHeightWrapContent = z11;
    }

    public void setHorizontalBiasPercent(float f11) {
        this.mHorizontalBiasPercent = f11;
    }

    public void setHorizontalChainStyle(int i11) {
        this.mHorizontalChainStyle = i11;
    }

    public void setHorizontalDimension(int i11, int i12) {
        this.f2200mX = i11;
        int i13 = i12 - i11;
        this.mWidth = i13;
        int i14 = this.mMinWidth;
        if (i13 < i14) {
            this.mWidth = i14;
        }
    }

    public void setHorizontalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[0] = dimensionBehaviour;
    }

    public void setHorizontalMatchStyle(int i11, int i12, int i13, float f11) {
        this.mMatchConstraintDefaultWidth = i11;
        this.mMatchConstraintMinWidth = i12;
        if (i13 == Integer.MAX_VALUE) {
            i13 = 0;
        }
        this.mMatchConstraintMaxWidth = i13;
        this.mMatchConstraintPercentWidth = f11;
        if (f11 <= 0.0f || f11 >= 1.0f || i11 != 0) {
            return;
        }
        this.mMatchConstraintDefaultWidth = 2;
    }

    public void setHorizontalWeight(float f11) {
        this.mWeight[0] = f11;
    }

    public void setInBarrier(int i11, boolean z11) {
        this.mIsInBarrier[i11] = z11;
    }

    public void setInPlaceholder(boolean z11) {
        this.mInPlaceholder = z11;
    }

    public void setInVirtualLayout(boolean z11) {
        this.mInVirtualLayout = z11;
    }

    public void setLastMeasureSpec(int i11, int i12) {
        this.mLastHorizontalMeasureSpec = i11;
        this.mLastVerticalMeasureSpec = i12;
        setMeasureRequested(false);
    }

    public void setLength(int i11, int i12) {
        if (i12 == 0) {
            setWidth(i11);
        } else if (i12 == 1) {
            setHeight(i11);
        }
    }

    public void setMaxHeight(int i11) {
        this.mMaxDimension[1] = i11;
    }

    public void setMaxWidth(int i11) {
        this.mMaxDimension[0] = i11;
    }

    public void setMeasureRequested(boolean z11) {
        this.mMeasureRequested = z11;
    }

    public void setMinHeight(int i11) {
        if (i11 < 0) {
            this.mMinHeight = 0;
        } else {
            this.mMinHeight = i11;
        }
    }

    public void setMinWidth(int i11) {
        if (i11 < 0) {
            this.mMinWidth = 0;
        } else {
            this.mMinWidth = i11;
        }
    }

    public void setOffset(int i11, int i12) {
        this.mOffsetX = i11;
        this.mOffsetY = i12;
    }

    public void setOrigin(int i11, int i12) {
        this.f2200mX = i11;
        this.f2201mY = i12;
    }

    public void setParent(ConstraintWidget constraintWidget) {
        this.mParent = constraintWidget;
    }

    public void setRelativePositioning(int i11, int i12) {
        if (i12 == 0) {
            this.mRelX = i11;
        } else if (i12 == 1) {
            this.mRelY = i11;
        }
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setVerticalBiasPercent(float f11) {
        this.mVerticalBiasPercent = f11;
    }

    public void setVerticalChainStyle(int i11) {
        this.mVerticalChainStyle = i11;
    }

    public void setVerticalDimension(int i11, int i12) {
        this.f2201mY = i11;
        int i13 = i12 - i11;
        this.mHeight = i13;
        int i14 = this.mMinHeight;
        if (i13 < i14) {
            this.mHeight = i14;
        }
    }

    public void setVerticalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[1] = dimensionBehaviour;
    }

    public void setVerticalMatchStyle(int i11, int i12, int i13, float f11) {
        this.mMatchConstraintDefaultHeight = i11;
        this.mMatchConstraintMinHeight = i12;
        if (i13 == Integer.MAX_VALUE) {
            i13 = 0;
        }
        this.mMatchConstraintMaxHeight = i13;
        this.mMatchConstraintPercentHeight = f11;
        if (f11 <= 0.0f || f11 >= 1.0f || i11 != 0) {
            return;
        }
        this.mMatchConstraintDefaultHeight = 2;
    }

    public void setVerticalWeight(float f11) {
        this.mWeight[1] = f11;
    }

    public void setVisibility(int i11) {
        this.mVisibility = i11;
    }

    public void setWidth(int i11) {
        this.mWidth = i11;
        int i12 = this.mMinWidth;
        if (i11 < i12) {
            this.mWidth = i12;
        }
    }

    public void setWidthWrapContent(boolean z11) {
        this.mIsWidthWrapContent = z11;
    }

    public void setWrapBehaviorInParent(int i11) {
        if (i11 < 0 || i11 > 3) {
            return;
        }
        this.mWrapBehaviorInParent = i11;
    }

    public void setX(int i11) {
        this.f2200mX = i11;
    }

    public void setY(int i11) {
        this.f2201mY = i11;
    }

    public void setupDimensionRatio(boolean z11, boolean z12, boolean z13, boolean z14) {
        if (this.mResolvedDimensionRatioSide == -1) {
            if (z13 && !z14) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (!z13 && z14) {
                this.mResolvedDimensionRatioSide = 1;
                if (this.mDimensionRatioSide == -1) {
                    this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                }
            }
        }
        if (this.mResolvedDimensionRatioSide == 0 && (!this.mTop.isConnected() || !this.mBottom.isConnected())) {
            this.mResolvedDimensionRatioSide = 1;
        } else if (this.mResolvedDimensionRatioSide == 1 && (!this.mLeft.isConnected() || !this.mRight.isConnected())) {
            this.mResolvedDimensionRatioSide = 0;
        }
        if (this.mResolvedDimensionRatioSide == -1 && (!this.mTop.isConnected() || !this.mBottom.isConnected() || !this.mLeft.isConnected() || !this.mRight.isConnected())) {
            if (this.mTop.isConnected() && this.mBottom.isConnected()) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (this.mLeft.isConnected() && this.mRight.isConnected()) {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
        if (this.mResolvedDimensionRatioSide == -1) {
            int i11 = this.mMatchConstraintMinWidth;
            if (i11 > 0 && this.mMatchConstraintMinHeight == 0) {
                this.mResolvedDimensionRatioSide = 0;
            } else {
                if (i11 != 0 || this.mMatchConstraintMinHeight <= 0) {
                    return;
                }
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (this.mType != null) {
            str = "type: " + this.mType + C33627eb.f69716f;
        } else {
            str = "";
        }
        sb2.append(str);
        if (this.mDebugName != null) {
            str2 = "id: " + this.mDebugName + C33627eb.f69716f;
        }
        sb2.append(str2);
        sb2.append("(");
        sb2.append(this.f2200mX);
        sb2.append(", ");
        sb2.append(this.f2201mY);
        sb2.append(") - (");
        sb2.append(this.mWidth);
        sb2.append(" x ");
        sb2.append(this.mHeight);
        sb2.append(")");
        return sb2.toString();
    }

    public void updateFromRuns(boolean z11, boolean z12) {
        int i11;
        int i12;
        boolean zIsResolved = z11 & this.mHorizontalRun.isResolved();
        boolean zIsResolved2 = z12 & this.mVerticalRun.isResolved();
        HorizontalWidgetRun horizontalWidgetRun = this.mHorizontalRun;
        int i13 = horizontalWidgetRun.start.value;
        VerticalWidgetRun verticalWidgetRun = this.mVerticalRun;
        int i14 = verticalWidgetRun.start.value;
        int i15 = horizontalWidgetRun.end.value;
        int i16 = verticalWidgetRun.end.value;
        int i17 = i16 - i14;
        if (i15 - i13 < 0 || i17 < 0 || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE || i16 == Integer.MIN_VALUE || i16 == Integer.MAX_VALUE) {
            i15 = 0;
            i13 = 0;
            i16 = 0;
            i14 = 0;
        }
        int i18 = i15 - i13;
        int i19 = i16 - i14;
        if (zIsResolved) {
            this.f2200mX = i13;
        }
        if (zIsResolved2) {
            this.f2201mY = i14;
        }
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        if (zIsResolved) {
            if (this.mListDimensionBehaviors[0] == DimensionBehaviour.FIXED && i18 < (i12 = this.mWidth)) {
                i18 = i12;
            }
            this.mWidth = i18;
            int i21 = this.mMinWidth;
            if (i18 < i21) {
                this.mWidth = i21;
            }
        }
        if (zIsResolved2) {
            if (this.mListDimensionBehaviors[1] == DimensionBehaviour.FIXED && i19 < (i11 = this.mHeight)) {
                i19 = i11;
            }
            this.mHeight = i19;
            int i22 = this.mMinHeight;
            if (i19 < i22) {
                this.mHeight = i22;
            }
        }
    }

    public void updateFromSolver(LinearSystem linearSystem, boolean z11) {
        VerticalWidgetRun verticalWidgetRun;
        HorizontalWidgetRun horizontalWidgetRun;
        int objectVariableValue = linearSystem.getObjectVariableValue(this.mLeft);
        int objectVariableValue2 = linearSystem.getObjectVariableValue(this.mTop);
        int objectVariableValue3 = linearSystem.getObjectVariableValue(this.mRight);
        int objectVariableValue4 = linearSystem.getObjectVariableValue(this.mBottom);
        if (z11 && (horizontalWidgetRun = this.mHorizontalRun) != null) {
            DependencyNode dependencyNode = horizontalWidgetRun.start;
            if (dependencyNode.resolved) {
                DependencyNode dependencyNode2 = horizontalWidgetRun.end;
                if (dependencyNode2.resolved) {
                    objectVariableValue = dependencyNode.value;
                    objectVariableValue3 = dependencyNode2.value;
                }
            }
        }
        if (z11 && (verticalWidgetRun = this.mVerticalRun) != null) {
            DependencyNode dependencyNode3 = verticalWidgetRun.start;
            if (dependencyNode3.resolved) {
                DependencyNode dependencyNode4 = verticalWidgetRun.end;
                if (dependencyNode4.resolved) {
                    objectVariableValue2 = dependencyNode3.value;
                    objectVariableValue4 = dependencyNode4.value;
                }
            }
        }
        int i11 = objectVariableValue4 - objectVariableValue2;
        if (objectVariableValue3 - objectVariableValue < 0 || i11 < 0 || objectVariableValue == Integer.MIN_VALUE || objectVariableValue == Integer.MAX_VALUE || objectVariableValue2 == Integer.MIN_VALUE || objectVariableValue2 == Integer.MAX_VALUE || objectVariableValue3 == Integer.MIN_VALUE || objectVariableValue3 == Integer.MAX_VALUE || objectVariableValue4 == Integer.MIN_VALUE || objectVariableValue4 == Integer.MAX_VALUE) {
            objectVariableValue = 0;
            objectVariableValue4 = 0;
            objectVariableValue2 = 0;
            objectVariableValue3 = 0;
        }
        setFrame(objectVariableValue, objectVariableValue2, objectVariableValue3, objectVariableValue4);
    }

    private void serializeSize(StringBuilder sb2, String str, int i11, int i12, int i13, int i14, int i15, int i16, float f11, float f12) {
        sb2.append(str);
        sb2.append(" :  {\n");
        serializeAttribute(sb2, "size", i11, Integer.MIN_VALUE);
        serializeAttribute(sb2, "min", i12, 0);
        serializeAttribute(sb2, "max", i13, Integer.MAX_VALUE);
        serializeAttribute(sb2, "matchMin", i15, 0);
        serializeAttribute(sb2, "matchDef", i16, 0);
        serializeAttribute(sb2, "matchPercent", i16, 1);
        serializeAttribute(sb2, "matchConstraintPercent", f11, 1.0f);
        serializeAttribute(sb2, "weight", f12, 1.0f);
        serializeAttribute(sb2, "override", i14, 1);
        sb2.append("},\n");
    }

    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2) {
        connect(type, constraintWidget, type2, 0);
    }

    public int getBottom() {
        return getY() + this.mHeight;
    }

    public ConstraintWidget getHorizontalChainControlWidget() {
        ConstraintAnchor target;
        ConstraintWidget owner;
        ConstraintAnchor target2;
        if (!isInHorizontalChain()) {
            return null;
        }
        ConstraintWidget constraintWidget = this;
        ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            ConstraintAnchor anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT);
            if (anchor == null) {
                target = null;
            } else {
                target = anchor.getTarget();
            }
            if (target == null) {
                owner = null;
            } else {
                owner = target.getOwner();
            }
            if (owner == getParent()) {
                return constraintWidget;
            }
            if (owner == null) {
                target2 = null;
            } else {
                target2 = owner.getAnchor(ConstraintAnchor.Type.RIGHT).getTarget();
            }
            if (target2 != null && target2.getOwner() != constraintWidget) {
                constraintWidget2 = constraintWidget;
            } else {
                constraintWidget = owner;
            }
        }
        return constraintWidget2;
    }

    public int getLeft() {
        return getX();
    }

    public int getRight() {
        return getX() + this.mWidth;
    }

    public int getTop() {
        return getY();
    }

    public ConstraintWidget getVerticalChainControlWidget() {
        ConstraintAnchor target;
        ConstraintWidget owner;
        ConstraintAnchor target2;
        if (!isInVerticalChain()) {
            return null;
        }
        ConstraintWidget constraintWidget = this;
        ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            ConstraintAnchor anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.TOP);
            if (anchor == null) {
                target = null;
            } else {
                target = anchor.getTarget();
            }
            if (target == null) {
                owner = null;
            } else {
                owner = target.getOwner();
            }
            if (owner == getParent()) {
                return constraintWidget;
            }
            if (owner == null) {
                target2 = null;
            } else {
                target2 = owner.getAnchor(ConstraintAnchor.Type.BOTTOM).getTarget();
            }
            if (target2 != null && target2.getOwner() != constraintWidget) {
                constraintWidget2 = constraintWidget;
            } else {
                constraintWidget = owner;
            }
        }
        return constraintWidget2;
    }

    public void immediateConnect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i11, int i12) {
        getAnchor(type).connect(constraintWidget.getAnchor(type2), i11, i12, true);
    }

    public void resetAllConstraints() {
        resetAnchors();
        setVerticalBiasPercent(DEFAULT_BIAS);
        setHorizontalBiasPercent(DEFAULT_BIAS);
    }

    public void resetAnchor(ConstraintAnchor constraintAnchor) {
        if (getParent() != null && (getParent() instanceof ConstraintWidgetContainer) && ((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            return;
        }
        ConstraintAnchor anchor = getAnchor(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor anchor2 = getAnchor(ConstraintAnchor.Type.RIGHT);
        ConstraintAnchor anchor3 = getAnchor(ConstraintAnchor.Type.TOP);
        ConstraintAnchor anchor4 = getAnchor(ConstraintAnchor.Type.BOTTOM);
        ConstraintAnchor anchor5 = getAnchor(ConstraintAnchor.Type.CENTER);
        ConstraintAnchor anchor6 = getAnchor(ConstraintAnchor.Type.CENTER_X);
        ConstraintAnchor anchor7 = getAnchor(ConstraintAnchor.Type.CENTER_Y);
        if (constraintAnchor == anchor5) {
            if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                anchor.reset();
                anchor2.reset();
            }
            if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
                anchor3.reset();
                anchor4.reset();
            }
            this.mHorizontalBiasPercent = 0.5f;
            this.mVerticalBiasPercent = 0.5f;
        } else if (constraintAnchor == anchor6) {
            if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget().getOwner() == anchor2.getTarget().getOwner()) {
                anchor.reset();
                anchor2.reset();
            }
            this.mHorizontalBiasPercent = 0.5f;
        } else if (constraintAnchor == anchor7) {
            if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget().getOwner() == anchor4.getTarget().getOwner()) {
                anchor3.reset();
                anchor4.reset();
            }
            this.mVerticalBiasPercent = 0.5f;
        } else if (constraintAnchor != anchor && constraintAnchor != anchor2) {
            if ((constraintAnchor == anchor3 || constraintAnchor == anchor4) && anchor3.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
                anchor5.reset();
            }
        } else if (anchor.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
            anchor5.reset();
        }
        constraintAnchor.reset();
    }

    public void resetAnchors() {
        ConstraintWidget parent = getParent();
        if (parent == null || !(parent instanceof ConstraintWidgetContainer) || !((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            int size = this.mAnchors.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.mAnchors.get(i11).reset();
            }
        }
    }

    public StringBuilder serialize(StringBuilder sb2) {
        sb2.append("{\n");
        serializeAnchor(sb2, "left", this.mLeft);
        serializeAnchor(sb2, ViewProps.TOP, this.mTop);
        serializeAnchor(sb2, "right", this.mRight);
        serializeAnchor(sb2, ViewProps.BOTTOM, this.mBottom);
        serializeAnchor(sb2, "baseline", this.mBaseline);
        serializeAnchor(sb2, "centerX", this.mCenterX);
        serializeAnchor(sb2, "centerY", this.mCenterY);
        serializeCircle(sb2, this.mCenter, this.mCircleConstraintAngle);
        serializeSize(sb2, "width", this.mWidth, this.mMinWidth, this.mMaxDimension[0], this.mWidthOverride, this.mMatchConstraintMinWidth, this.mMatchConstraintDefaultWidth, this.mMatchConstraintPercentWidth, this.mWeight[0]);
        serializeSize(sb2, "height", this.mHeight, this.mMinHeight, this.mMaxDimension[1], this.mHeightOverride, this.mMatchConstraintMinHeight, this.mMatchConstraintDefaultHeight, this.mMatchConstraintPercentHeight, this.mWeight[1]);
        serializeDimensionRatio(sb2, "dimensionRatio", this.mDimensionRatio, this.mDimensionRatioSide);
        serializeAttribute(sb2, "horizontalBias", this.mHorizontalBiasPercent, DEFAULT_BIAS);
        serializeAttribute(sb2, "verticalBias", this.mVerticalBiasPercent, DEFAULT_BIAS);
        sb2.append("}\n");
        return sb2;
    }

    public void setFinalFrame(int i11, int i12, int i13, int i14, int i15, int i16) {
        setFrame(i11, i12, i13, i14);
        setBaselineDistance(i15);
        if (i16 == 0) {
            this.mResolvedHorizontal = true;
            this.mResolvedVertical = false;
        } else if (i16 == 1) {
            this.mResolvedHorizontal = false;
            this.mResolvedVertical = true;
        } else if (i16 == 2) {
            this.mResolvedHorizontal = true;
            this.mResolvedVertical = true;
        } else {
            this.mResolvedHorizontal = false;
            this.mResolvedVertical = false;
        }
    }

    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i11) {
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        boolean z11;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.CENTER;
        if (type == type5) {
            if (type2 == type5) {
                ConstraintAnchor.Type type6 = ConstraintAnchor.Type.LEFT;
                ConstraintAnchor anchor = getAnchor(type6);
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.RIGHT;
                ConstraintAnchor anchor2 = getAnchor(type7);
                ConstraintAnchor.Type type8 = ConstraintAnchor.Type.TOP;
                ConstraintAnchor anchor3 = getAnchor(type8);
                ConstraintAnchor.Type type9 = ConstraintAnchor.Type.BOTTOM;
                ConstraintAnchor anchor4 = getAnchor(type9);
                boolean z12 = true;
                if ((anchor == null || !anchor.isConnected()) && (anchor2 == null || !anchor2.isConnected())) {
                    connect(type6, constraintWidget, type6, 0);
                    connect(type7, constraintWidget, type7, 0);
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((anchor3 == null || !anchor3.isConnected()) && (anchor4 == null || !anchor4.isConnected())) {
                    connect(type8, constraintWidget, type8, 0);
                    connect(type9, constraintWidget, type9, 0);
                } else {
                    z12 = false;
                }
                if (z11 && z12) {
                    getAnchor(type5).connect(constraintWidget.getAnchor(type5), 0);
                    return;
                }
                if (z11) {
                    ConstraintAnchor.Type type10 = ConstraintAnchor.Type.CENTER_X;
                    getAnchor(type10).connect(constraintWidget.getAnchor(type10), 0);
                    return;
                } else {
                    if (z12) {
                        ConstraintAnchor.Type type11 = ConstraintAnchor.Type.CENTER_Y;
                        getAnchor(type11).connect(constraintWidget.getAnchor(type11), 0);
                        return;
                    }
                    return;
                }
            }
            ConstraintAnchor.Type type12 = ConstraintAnchor.Type.LEFT;
            if (type2 != type12 && type2 != ConstraintAnchor.Type.RIGHT) {
                ConstraintAnchor.Type type13 = ConstraintAnchor.Type.TOP;
                if (type2 == type13 || type2 == ConstraintAnchor.Type.BOTTOM) {
                    connect(type13, constraintWidget, type2, 0);
                    connect(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                    getAnchor(type5).connect(constraintWidget.getAnchor(type2), 0);
                    return;
                }
                return;
            }
            connect(type12, constraintWidget, type2, 0);
            connect(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
            getAnchor(type5).connect(constraintWidget.getAnchor(type2), 0);
            return;
        }
        ConstraintAnchor.Type type14 = ConstraintAnchor.Type.CENTER_X;
        if (type == type14 && (type2 == (type4 = ConstraintAnchor.Type.LEFT) || type2 == ConstraintAnchor.Type.RIGHT)) {
            ConstraintAnchor anchor5 = getAnchor(type4);
            ConstraintAnchor anchor6 = constraintWidget.getAnchor(type2);
            ConstraintAnchor anchor7 = getAnchor(ConstraintAnchor.Type.RIGHT);
            anchor5.connect(anchor6, 0);
            anchor7.connect(anchor6, 0);
            getAnchor(type14).connect(anchor6, 0);
            return;
        }
        ConstraintAnchor.Type type15 = ConstraintAnchor.Type.CENTER_Y;
        if (type == type15 && (type2 == (type3 = ConstraintAnchor.Type.TOP) || type2 == ConstraintAnchor.Type.BOTTOM)) {
            ConstraintAnchor anchor8 = constraintWidget.getAnchor(type2);
            getAnchor(type3).connect(anchor8, 0);
            getAnchor(ConstraintAnchor.Type.BOTTOM).connect(anchor8, 0);
            getAnchor(type15).connect(anchor8, 0);
            return;
        }
        if (type == type14 && type2 == type14) {
            ConstraintAnchor.Type type16 = ConstraintAnchor.Type.LEFT;
            getAnchor(type16).connect(constraintWidget.getAnchor(type16), 0);
            ConstraintAnchor.Type type17 = ConstraintAnchor.Type.RIGHT;
            getAnchor(type17).connect(constraintWidget.getAnchor(type17), 0);
            getAnchor(type14).connect(constraintWidget.getAnchor(type2), 0);
            return;
        }
        if (type == type15 && type2 == type15) {
            ConstraintAnchor.Type type18 = ConstraintAnchor.Type.TOP;
            getAnchor(type18).connect(constraintWidget.getAnchor(type18), 0);
            ConstraintAnchor.Type type19 = ConstraintAnchor.Type.BOTTOM;
            getAnchor(type19).connect(constraintWidget.getAnchor(type19), 0);
            getAnchor(type15).connect(constraintWidget.getAnchor(type2), 0);
            return;
        }
        ConstraintAnchor anchor9 = getAnchor(type);
        ConstraintAnchor anchor10 = constraintWidget.getAnchor(type2);
        if (anchor9.isValidConnection(anchor10)) {
            ConstraintAnchor.Type type20 = ConstraintAnchor.Type.BASELINE;
            if (type == type20) {
                ConstraintAnchor anchor11 = getAnchor(ConstraintAnchor.Type.TOP);
                ConstraintAnchor anchor12 = getAnchor(ConstraintAnchor.Type.BOTTOM);
                if (anchor11 != null) {
                    anchor11.reset();
                }
                if (anchor12 != null) {
                    anchor12.reset();
                }
            } else if (type != ConstraintAnchor.Type.TOP && type != ConstraintAnchor.Type.BOTTOM) {
                if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                    ConstraintAnchor anchor13 = getAnchor(type5);
                    if (anchor13.getTarget() != anchor10) {
                        anchor13.reset();
                    }
                    ConstraintAnchor opposite = getAnchor(type).getOpposite();
                    ConstraintAnchor anchor14 = getAnchor(type14);
                    if (anchor14.isConnected()) {
                        opposite.reset();
                        anchor14.reset();
                    }
                }
            } else {
                ConstraintAnchor anchor15 = getAnchor(type20);
                if (anchor15 != null) {
                    anchor15.reset();
                }
                ConstraintAnchor anchor16 = getAnchor(type5);
                if (anchor16.getTarget() != anchor10) {
                    anchor16.reset();
                }
                ConstraintAnchor opposite2 = getAnchor(type).getOpposite();
                ConstraintAnchor anchor17 = getAnchor(type15);
                if (anchor17.isConnected()) {
                    opposite2.reset();
                    anchor17.reset();
                }
            }
            anchor9.connect(anchor10, i11);
        }
    }

    private void serializeAttribute(StringBuilder sb2, String str, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i11);
        sb2.append(",\n");
    }

    private void serializeAttribute(StringBuilder sb2, String str, String str2, String str3) {
        if (str3.equals(str2)) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(str2);
        sb2.append(",\n");
    }

    public void setDimensionRatio(float f11, int i11) {
        this.mDimensionRatio = f11;
        this.mDimensionRatioSide = i11;
    }

    public void setFrame(int i11, int i12, int i13) {
        if (i13 == 0) {
            setHorizontalDimension(i11, i12);
        } else if (i13 == 1) {
            setVerticalDimension(i11, i12);
        }
    }

    private void getSceneString(StringBuilder sb2, String str, int i11, int i12, int i13, int i14, int i15, int i16, float f11, DimensionBehaviour dimensionBehaviour, float f12) {
        sb2.append(str);
        sb2.append(" :  {\n");
        serializeAttribute(sb2, "      behavior", dimensionBehaviour.toString(), DimensionBehaviour.FIXED.toString());
        serializeAttribute(sb2, "      size", i11, 0);
        serializeAttribute(sb2, "      min", i12, 0);
        serializeAttribute(sb2, "      max", i13, Integer.MAX_VALUE);
        serializeAttribute(sb2, "      matchMin", i15, 0);
        serializeAttribute(sb2, "      matchDef", i16, 0);
        serializeAttribute(sb2, "      matchPercent", f11, 1.0f);
        sb2.append("    },\n");
    }

    private void getSceneString(StringBuilder sb2, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.mTarget == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(constraintAnchor.mTarget);
        sb2.append("'");
        if (constraintAnchor.mGoneMargin != Integer.MIN_VALUE || constraintAnchor.mMargin != 0) {
            sb2.append(",");
            sb2.append(constraintAnchor.mMargin);
            if (constraintAnchor.mGoneMargin != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(constraintAnchor.mGoneMargin);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    public ConstraintWidget(String str) {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.mHorizontalRun = null;
        this.mVerticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.mResolvedHasRatio = false;
        this.mMeasureRequested = true;
        this.mOptimizeWrapO = false;
        this.mOptimizeWrapOnResolved = true;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
        this.frame = new WidgetFrame(this);
        this.mResolvedHorizontal = false;
        this.mResolvedVertical = false;
        this.mHorizontalSolvingPass = false;
        this.mVerticalSolvingPass = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mWrapBehaviorInParent = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = Float.NaN;
        this.mHasBaseline = false;
        this.mInVirtualLayout = false;
        this.mLastHorizontalMeasureSpec = 0;
        this.mLastVerticalMeasureSpec = 0;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.f2200mX = 0;
        this.f2201mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f11 = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f11;
        this.mVerticalBiasPercent = f11;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mAnimated = false;
        this.mDebugName = null;
        this.mType = null;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        addAnchors();
        setDebugName(str);
    }

    public ConstraintWidget(int i11, int i12, int i13, int i14) {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.mHorizontalRun = null;
        this.mVerticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.mResolvedHasRatio = false;
        this.mMeasureRequested = true;
        this.mOptimizeWrapO = false;
        this.mOptimizeWrapOnResolved = true;
        this.mWidthOverride = -1;
        this.mHeightOverride = -1;
        this.frame = new WidgetFrame(this);
        this.mResolvedHorizontal = false;
        this.mResolvedVertical = false;
        this.mHorizontalSolvingPass = false;
        this.mVerticalSolvingPass = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mWrapBehaviorInParent = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = Float.NaN;
        this.mHasBaseline = false;
        this.mInVirtualLayout = false;
        this.mLastHorizontalMeasureSpec = 0;
        this.mLastVerticalMeasureSpec = 0;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.mParent = null;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f11 = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f11;
        this.mVerticalBiasPercent = f11;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mAnimated = false;
        this.mDebugName = null;
        this.mType = null;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        this.f2200mX = i11;
        this.f2201mY = i12;
        this.mWidth = i13;
        this.mHeight = i14;
        addAnchors();
    }

    public ConstraintWidget(String str, int i11, int i12, int i13, int i14) {
        this(i11, i12, i13, i14);
        setDebugName(str);
    }

    public ConstraintWidget(int i11, int i12) {
        this(0, 0, i11, i12);
    }

    public ConstraintWidget(String str, int i11, int i12) {
        this(i11, i12);
        setDebugName(str);
    }
}
