package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.core.widgets.analyzer.DependencyGraph;
import androidx.constraintlayout.core.widgets.analyzer.Direct;
import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintWidgetContainer extends WidgetContainer {
    private static final boolean DEBUG = false;
    static final boolean DEBUG_GRAPH = false;
    private static final boolean DEBUG_LAYOUT = false;
    private static final int MAX_ITERATIONS = 8;
    static int sMyCounter;
    BasicMeasure mBasicMeasureSolver;
    int mDebugSolverPassCount;
    public DependencyGraph mDependencyGraph;
    public boolean mGroupsWrapOptimized;
    private boolean mHeightMeasuredTooSmall;
    ChainHead[] mHorizontalChainsArray;
    public int mHorizontalChainsSize;
    private WeakReference<ConstraintAnchor> mHorizontalWrapMax;
    private WeakReference<ConstraintAnchor> mHorizontalWrapMin;
    public boolean mHorizontalWrapOptimized;
    private boolean mIsRtl;
    public BasicMeasure.Measure mMeasure;
    protected BasicMeasure.Measurer mMeasurer;
    public Metrics mMetrics;
    private int mOptimizationLevel;
    int mPaddingBottom;
    int mPaddingLeft;
    int mPaddingRight;
    int mPaddingTop;
    private int mPass;
    public boolean mSkipSolver;
    protected LinearSystem mSystem;
    ChainHead[] mVerticalChainsArray;
    public int mVerticalChainsSize;
    private WeakReference<ConstraintAnchor> mVerticalWrapMax;
    private WeakReference<ConstraintAnchor> mVerticalWrapMin;
    public boolean mVerticalWrapOptimized;
    HashSet<ConstraintWidget> mWidgetsToAdd;
    private boolean mWidthMeasuredTooSmall;
    public int mWrapFixedHeight;
    public int mWrapFixedWidth;

    public ConstraintWidgetContainer() {
        this.mBasicMeasureSolver = new BasicMeasure(this);
        this.mDependencyGraph = new DependencyGraph(this);
        this.mMeasurer = null;
        this.mIsRtl = false;
        this.mSystem = new LinearSystem();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.mVerticalChainsArray = new ChainHead[4];
        this.mHorizontalChainsArray = new ChainHead[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.mOptimizationLevel = 257;
        this.mSkipSolver = false;
        this.mWidthMeasuredTooSmall = false;
        this.mHeightMeasuredTooSmall = false;
        this.mDebugSolverPassCount = 0;
        this.mVerticalWrapMin = null;
        this.mHorizontalWrapMin = null;
        this.mVerticalWrapMax = null;
        this.mHorizontalWrapMax = null;
        this.mWidgetsToAdd = new HashSet<>();
        this.mMeasure = new BasicMeasure.Measure();
    }

    private void resetChains() {
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
    }

    public boolean handlesInternalConstraints() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x021f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0228  */
    /* JADX WARN: Code duplicated, block: B:127:0x0231 A[LOOP:5: B:126:0x022f->B:127:0x0231, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:149:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:152:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:154:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:160:0x0313  */
    /* JADX WARN: Code duplicated, block: B:167:0x0334 A[PHI: r13 r19
      0x0334: PHI (r13v9 ??) = (r13v8 ??), (r13v11 ??), (r13v11 ??), (r13v11 ??) binds: [B:153:0x02f0, B:162:0x0319, B:163:0x031b, B:165:0x0321] A[DONT_GENERATE, DONT_INLINE]
      0x0334: PHI (r19v4 ??) = (r19v3 ??), (r19v6 ??), (r19v6 ??), (r19v6 ??) binds: [B:153:0x02f0, B:162:0x0319, B:163:0x031b, B:165:0x0321] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:169:0x0338  */
    /* JADX WARN: Code duplicated, block: B:170:0x033b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean] */
    @Override // androidx.constraintlayout.core.widgets.WidgetContainer
    public void layout() {
        int i11;
        int i12;
        boolean z11;
        int i13;
        ?? r18;
        char c11;
        ?? AddChildrenToSolver;
        int i14;
        ?? UpdateChildrenFromSolver;
        ?? r19;
        int iMax;
        ?? r110;
        ?? r13;
        int iMax2;
        ?? r111;
        ?? r14;
        int i15;
        ?? r112;
        ?? r15;
        ?? r16;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ?? r11;
        ?? r17;
        ?? r12;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        int i16 = 0;
        this.f2200mX = 0;
        this.f2201mY = 0;
        this.mWidthMeasuredTooSmall = false;
        this.mHeightMeasuredTooSmall = false;
        int size = this.mChildren.size();
        int iMax3 = Math.max(0, getWidth());
        int iMax4 = Math.max(0, getHeight());
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        boolean z12 = true;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[1];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr[0];
        Metrics metrics = this.mMetrics;
        if (metrics != null) {
            metrics.layouts++;
        }
        if (this.mPass == 0 && Optimizer.enabled(this.mOptimizationLevel, 1)) {
            Direct.solvingPass(this, getMeasurer());
            for (int i17 = 0; i17 < size; i17++) {
                ConstraintWidget constraintWidget = this.mChildren.get(i17);
                if (constraintWidget.isMeasureRequested() && !(constraintWidget instanceof Guideline) && !(constraintWidget instanceof Barrier) && !(constraintWidget instanceof VirtualLayout) && !constraintWidget.isInVirtualLayout()) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = constraintWidget.getDimensionBehaviour(0);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = constraintWidget.getDimensionBehaviour(1);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour6 != dimensionBehaviour8 || constraintWidget.mMatchConstraintDefaultWidth == 1 || dimensionBehaviour7 != dimensionBehaviour8 || constraintWidget.mMatchConstraintDefaultHeight == 1) {
                        measure(0, constraintWidget, this.mMeasurer, new BasicMeasure.Measure(), BasicMeasure.Measure.SELF_DIMENSIONS);
                    }
                }
            }
        }
        char c12 = 2;
        if (size <= 2 || !((dimensionBehaviour5 == (dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour4 == dimensionBehaviour3) && Optimizer.enabled(this.mOptimizationLevel, 1024) && Grouping.simpleSolvingPass(this, getMeasurer()))) {
            i11 = iMax4;
            i12 = iMax3;
            z11 = false;
        } else {
            if (dimensionBehaviour5 == dimensionBehaviour3) {
                if (iMax3 >= getWidth() || iMax3 <= 0) {
                    iMax3 = getWidth();
                } else {
                    setWidth(iMax3);
                    this.mWidthMeasuredTooSmall = true;
                }
            }
            if (dimensionBehaviour4 == dimensionBehaviour3) {
                if (iMax4 >= getHeight() || iMax4 <= 0) {
                    iMax4 = getHeight();
                } else {
                    setHeight(iMax4);
                    this.mHeightMeasuredTooSmall = true;
                }
            }
            i11 = iMax4;
            i12 = iMax3;
            z11 = true;
        }
        boolean z13 = optimizeFor(64) || optimizeFor(128);
        LinearSystem linearSystem = this.mSystem;
        linearSystem.graphOptimizer = false;
        linearSystem.newgraphOptimizer = false;
        if (this.mOptimizationLevel != 0 && z13) {
            linearSystem.newgraphOptimizer = true;
        }
        ArrayList<ConstraintWidget> arrayList = this.mChildren;
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z14 = horizontalDimensionBehaviour == dimensionBehaviour9 || getVerticalDimensionBehaviour() == dimensionBehaviour9;
        resetChains();
        for (int i18 = 0; i18 < size; i18++) {
            ConstraintWidget constraintWidget2 = this.mChildren.get(i18);
            if (constraintWidget2 instanceof WidgetContainer) {
                ((WidgetContainer) constraintWidget2).layout();
            }
        }
        boolean zOptimizeFor = optimizeFor(64);
        ?? r113 = z11;
        int i19 = 0;
        ?? r114 = 1;
        while (r114 != 0) {
            int i21 = i19 + 1;
            try {
                this.mSystem.reset();
                resetChains();
                createObjectVariables(this.mSystem);
                int i22 = i16;
                while (i22 < size) {
                    i13 = i16;
                    try {
                        c11 = c12;
                        try {
                            this.mChildren.get(i22).createObjectVariables(this.mSystem);
                            i22++;
                            i16 = i13;
                            c12 = c11;
                        } catch (Exception e11) {
                            e = e11;
                            r18 = z12;
                            AddChildrenToSolver = r114;
                            e.printStackTrace();
                            System.out.println("EXCEPTION : " + e);
                            if (AddChildrenToSolver != 0) {
                                UpdateChildrenFromSolver = updateChildrenFromSolver(this.mSystem, Optimizer.sFlags);
                            } else {
                                updateFromSolver(this.mSystem, zOptimizeFor);
                                for (i14 = i13; i14 < size; i14++) {
                                    this.mChildren.get(i14).updateFromSolver(this.mSystem, zOptimizeFor);
                                }
                                UpdateChildrenFromSolver = i13;
                            }
                            if (z14) {
                                r19 = UpdateChildrenFromSolver == true ? 1 : 0;
                            } else {
                                r19 = UpdateChildrenFromSolver == true ? 1 : 0;
                            }
                            iMax = Math.max(this.mMinWidth, getWidth());
                            r13 = r113;
                            r110 = r19;
                            if (iMax > getWidth()) {
                                setWidth(iMax);
                                this.mListDimensionBehaviors[i13] = ConstraintWidget.DimensionBehaviour.FIXED;
                                ?? r115 = r18;
                                r110 = r115 == true ? 1 : 0;
                                r13 = r115;
                            }
                            iMax2 = Math.max(this.mMinHeight, getHeight());
                            r14 = r13;
                            r111 = r110;
                            if (iMax2 > getHeight()) {
                                setHeight(iMax2);
                                this.mListDimensionBehaviors[r18] = ConstraintWidget.DimensionBehaviour.FIXED;
                                r17 = r18;
                                r111 = r17 == true ? 1 : 0;
                            }
                            if (r14 == 0) {
                                dimensionBehaviour = this.mListDimensionBehaviors[i13];
                                dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                                if (dimensionBehaviour == dimensionBehaviour2) {
                                    r14 = r17;
                                    r11 = r18;
                                    r14 = r14;
                                    r111 = r111;
                                } else {
                                    r14 = r17;
                                    r11 = r18;
                                    r14 = r14;
                                    r111 = r111;
                                }
                                if (this.mListDimensionBehaviors[r11] == dimensionBehaviour2) {
                                    r14 = r17;
                                    i15 = 8;
                                    r15 = r14;
                                    r112 = r111;
                                } else {
                                    r14 = r17;
                                    i15 = 8;
                                    r15 = r14;
                                    r112 = r111;
                                }
                            } else {
                                r14 = r17;
                                i15 = 8;
                                r15 = r14;
                                r112 = r111;
                            }
                            if (i21 > i15) {
                                r16 = i13;
                            } else {
                                r16 = r112;
                            }
                            i19 = i21;
                            i16 = i13;
                            c12 = c11;
                            z12 = true;
                            r113 = r15;
                            r114 = r16;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        c11 = c12;
                    }
                }
                i13 = i16;
                c11 = c12;
                AddChildrenToSolver = addChildrenToSolver(this.mSystem);
                WeakReference<ConstraintAnchor> weakReference = this.mVerticalWrapMin;
                if (weakReference == null || weakReference.get() == null) {
                    r18 = z12;
                } else {
                    boolean z15 = z12;
                    try {
                        addMinWrap(this.mVerticalWrapMin.get(), this.mSystem.createObjectVariable(this.mTop));
                        this.mVerticalWrapMin = null;
                        r18 = z15;
                    } catch (Exception e13) {
                        e = e13;
                        AddChildrenToSolver = AddChildrenToSolver;
                        r18 = z15;
                        e.printStackTrace();
                        System.out.println("EXCEPTION : " + e);
                    }
                }
                WeakReference<ConstraintAnchor> weakReference2 = this.mVerticalWrapMax;
                if (weakReference2 != null && weakReference2.get() != null) {
                    addMaxWrap(this.mVerticalWrapMax.get(), this.mSystem.createObjectVariable(this.mBottom));
                    this.mVerticalWrapMax = null;
                }
                WeakReference<ConstraintAnchor> weakReference3 = this.mHorizontalWrapMin;
                if (weakReference3 != null && weakReference3.get() != null) {
                    addMinWrap(this.mHorizontalWrapMin.get(), this.mSystem.createObjectVariable(this.mLeft));
                    this.mHorizontalWrapMin = null;
                }
                WeakReference<ConstraintAnchor> weakReference4 = this.mHorizontalWrapMax;
                if (weakReference4 != null && weakReference4.get() != null) {
                    addMaxWrap(this.mHorizontalWrapMax.get(), this.mSystem.createObjectVariable(this.mRight));
                    this.mHorizontalWrapMax = null;
                }
                if (AddChildrenToSolver != 0) {
                    this.mSystem.minimize();
                }
            } catch (Exception e14) {
                e = e14;
                i13 = i16;
                r18 = z12;
                c11 = c12;
                AddChildrenToSolver = r114;
            }
            if (AddChildrenToSolver != 0) {
                UpdateChildrenFromSolver = updateChildrenFromSolver(this.mSystem, Optimizer.sFlags);
            } else {
                updateFromSolver(this.mSystem, zOptimizeFor);
                while (i14 < size) {
                    this.mChildren.get(i14).updateFromSolver(this.mSystem, zOptimizeFor);
                }
                UpdateChildrenFromSolver = i13;
            }
            if (z14 || i21 >= 8 || !Optimizer.sFlags[c11]) {
                r19 = UpdateChildrenFromSolver == true ? 1 : 0;
            } else {
                int i23 = i13;
                int iMax5 = i23;
                int iMax6 = iMax5;
                while (i23 < size) {
                    r12 = UpdateChildrenFromSolver;
                    ConstraintWidget constraintWidget3 = this.mChildren.get(i23);
                    iMax5 = Math.max(iMax5, constraintWidget3.f2200mX + constraintWidget3.getWidth());
                    iMax6 = Math.max(iMax6, constraintWidget3.f2201mY + constraintWidget3.getHeight());
                    i23++;
                    r12 = r12 == true ? 1 : 0;
                }
                r12 = UpdateChildrenFromSolver;
                ?? r116 = r12;
                int iMax7 = Math.max(this.mMinWidth, iMax5);
                int iMax8 = Math.max(this.mMinHeight, iMax6);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                r113 = r113;
                r19 = r116;
                if (dimensionBehaviour5 == dimensionBehaviour10 && getWidth() < iMax7) {
                    r113 = r113;
                    r19 = r116;
                    setWidth(iMax7);
                    this.mListDimensionBehaviors[i13] = dimensionBehaviour10;
                    ?? r117 = r18;
                    r19 = r117 == true ? 1 : 0;
                    r113 = r117;
                }
                if (dimensionBehaviour4 == dimensionBehaviour10 && getHeight() < iMax8) {
                    setHeight(iMax8);
                    this.mListDimensionBehaviors[r18] = dimensionBehaviour10;
                    r113 = r18;
                    r19 = r113 == true ? 1 : 0;
                }
            }
            iMax = Math.max(this.mMinWidth, getWidth());
            r13 = r113;
            r110 = r19;
            if (iMax > getWidth()) {
                setWidth(iMax);
                this.mListDimensionBehaviors[i13] = ConstraintWidget.DimensionBehaviour.FIXED;
                ?? r118 = r18;
                r110 = r118 == true ? 1 : 0;
                r13 = r118;
            }
            iMax2 = Math.max(this.mMinHeight, getHeight());
            r14 = r13;
            r111 = r110;
            if (iMax2 > getHeight()) {
                setHeight(iMax2);
                this.mListDimensionBehaviors[r18] = ConstraintWidget.DimensionBehaviour.FIXED;
                r17 = r18;
                r111 = r17 == true ? 1 : 0;
            }
            if (r14 == 0) {
                dimensionBehaviour = this.mListDimensionBehaviors[i13];
                dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour == dimensionBehaviour2 || i12 <= 0 || getWidth() <= i12) {
                    r14 = r17;
                    r11 = r18;
                    r14 = r14;
                    r111 = r111;
                } else {
                    ?? r21 = r18;
                    this.mWidthMeasuredTooSmall = r21;
                    this.mListDimensionBehaviors[i13] = ConstraintWidget.DimensionBehaviour.FIXED;
                    setWidth(i12);
                    boolean z16 = r21 == true ? 1 : 0;
                    r111 = z16 ? 1 : 0;
                    r11 = r21;
                    r14 = z16;
                }
                if (this.mListDimensionBehaviors[r11] == dimensionBehaviour2 || i11 <= 0 || getHeight() <= i11) {
                    r14 = r17;
                    i15 = 8;
                    r15 = r14;
                    r112 = r111;
                } else {
                    this.mHeightMeasuredTooSmall = r11;
                    this.mListDimensionBehaviors[r11] = ConstraintWidget.DimensionBehaviour.FIXED;
                    setHeight(i11);
                    i15 = 8;
                    r15 = 1;
                    r112 = 1;
                }
            } else {
                r14 = r17;
                i15 = 8;
                r15 = r14;
                r112 = r111;
            }
            if (i21 > i15) {
                r16 = i13;
            } else {
                r16 = r112;
            }
            i19 = i21;
            i16 = i13;
            c12 = c11;
            z12 = true;
            r113 = r15;
            r114 = r16;
        }
        int i24 = i16;
        this.mChildren = arrayList;
        if (r113 != 0) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = this.mListDimensionBehaviors;
            dimensionBehaviourArr2[i24] = dimensionBehaviour5;
            dimensionBehaviourArr2[1] = dimensionBehaviour4;
        }
        resetSolverVariables(this.mSystem.getCache());
    }

    public long measure(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.mPaddingLeft = i18;
        this.mPaddingTop = i19;
        return this.mBasicMeasureSolver.solverMeasure(this, i11, i18, i19, i12, i13, i14, i15, i16, i17);
    }

    public boolean updateChildrenFromSolver(LinearSystem linearSystem, boolean[] zArr) {
        zArr[2] = false;
        boolean zOptimizeFor = optimizeFor(64);
        updateFromSolver(linearSystem, zOptimizeFor);
        int size = this.mChildren.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            ConstraintWidget constraintWidget = this.mChildren.get(i11);
            constraintWidget.updateFromSolver(linearSystem, zOptimizeFor);
            if (constraintWidget.hasDimensionOverride()) {
                z11 = true;
            }
        }
        return z11;
    }

    private void addHorizontalChain(ConstraintWidget constraintWidget) {
        int i11 = this.mHorizontalChainsSize + 1;
        ChainHead[] chainHeadArr = this.mHorizontalChainsArray;
        if (i11 >= chainHeadArr.length) {
            this.mHorizontalChainsArray = (ChainHead[]) Arrays.copyOf(chainHeadArr, chainHeadArr.length * 2);
        }
        this.mHorizontalChainsArray[this.mHorizontalChainsSize] = new ChainHead(constraintWidget, 0, isRtl());
        this.mHorizontalChainsSize++;
    }

    private void addMaxWrap(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.mSystem.addGreaterThan(solverVariable, this.mSystem.createObjectVariable(constraintAnchor), 0, 5);
    }

    private void addMinWrap(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.mSystem.addGreaterThan(this.mSystem.createObjectVariable(constraintAnchor), solverVariable, 0, 5);
    }

    private void addVerticalChain(ConstraintWidget constraintWidget) {
        int i11 = this.mVerticalChainsSize + 1;
        ChainHead[] chainHeadArr = this.mVerticalChainsArray;
        if (i11 >= chainHeadArr.length) {
            this.mVerticalChainsArray = (ChainHead[]) Arrays.copyOf(chainHeadArr, chainHeadArr.length * 2);
        }
        this.mVerticalChainsArray[this.mVerticalChainsSize] = new ChainHead(constraintWidget, 1, isRtl());
        this.mVerticalChainsSize++;
    }

    public void addChain(ConstraintWidget constraintWidget, int i11) {
        if (i11 == 0) {
            addHorizontalChain(constraintWidget);
        } else if (i11 == 1) {
            addVerticalChain(constraintWidget);
        }
    }

    public boolean addChildrenToSolver(LinearSystem linearSystem) {
        ConstraintWidgetContainer constraintWidgetContainer;
        LinearSystem linearSystem2;
        boolean zOptimizeFor = optimizeFor(64);
        addToSolver(linearSystem, zOptimizeFor);
        int size = this.mChildren.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            ConstraintWidget constraintWidget = this.mChildren.get(i11);
            constraintWidget.setInBarrier(0, false);
            constraintWidget.setInBarrier(1, false);
            if (constraintWidget instanceof Barrier) {
                z11 = true;
            }
        }
        if (z11) {
            for (int i12 = 0; i12 < size; i12++) {
                ConstraintWidget constraintWidget2 = this.mChildren.get(i12);
                if (constraintWidget2 instanceof Barrier) {
                    ((Barrier) constraintWidget2).markWidgets();
                }
            }
        }
        this.mWidgetsToAdd.clear();
        for (int i13 = 0; i13 < size; i13++) {
            ConstraintWidget constraintWidget3 = this.mChildren.get(i13);
            if (constraintWidget3.addFirst()) {
                if (constraintWidget3 instanceof VirtualLayout) {
                    this.mWidgetsToAdd.add(constraintWidget3);
                } else {
                    constraintWidget3.addToSolver(linearSystem, zOptimizeFor);
                }
            }
        }
        while (this.mWidgetsToAdd.size() > 0) {
            int size2 = this.mWidgetsToAdd.size();
            Iterator<ConstraintWidget> it = this.mWidgetsToAdd.iterator();
            while (it.hasNext()) {
                VirtualLayout virtualLayout = (VirtualLayout) it.next();
                if (virtualLayout.contains(this.mWidgetsToAdd)) {
                    virtualLayout.addToSolver(linearSystem, zOptimizeFor);
                    this.mWidgetsToAdd.remove(virtualLayout);
                    break;
                }
            }
            if (size2 == this.mWidgetsToAdd.size()) {
                Iterator<ConstraintWidget> it2 = this.mWidgetsToAdd.iterator();
                while (it2.hasNext()) {
                    it2.next().addToSolver(linearSystem, zOptimizeFor);
                }
                this.mWidgetsToAdd.clear();
            }
        }
        if (LinearSystem.USE_DEPENDENCY_ORDERING) {
            HashSet<ConstraintWidget> hashSet = new HashSet<>();
            for (int i14 = 0; i14 < size; i14++) {
                ConstraintWidget constraintWidget4 = this.mChildren.get(i14);
                if (!constraintWidget4.addFirst()) {
                    hashSet.add(constraintWidget4);
                }
            }
            constraintWidgetContainer = this;
            linearSystem2 = linearSystem;
            constraintWidgetContainer.addChildrenToSolverByDependency(this, linearSystem2, hashSet, getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT ? 0 : 1, false);
            for (ConstraintWidget constraintWidget5 : hashSet) {
                Optimizer.checkMatchParent(this, linearSystem2, constraintWidget5);
                constraintWidget5.addToSolver(linearSystem2, zOptimizeFor);
            }
        } else {
            constraintWidgetContainer = this;
            linearSystem2 = linearSystem;
            for (int i15 = 0; i15 < size; i15++) {
                ConstraintWidget constraintWidget6 = constraintWidgetContainer.mChildren.get(i15);
                if (constraintWidget6 instanceof ConstraintWidgetContainer) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget6.mListDimensionBehaviors;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget6.addToSolver(linearSystem2, zOptimizeFor);
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.setHorizontalDimensionBehaviour(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.setVerticalDimensionBehaviour(dimensionBehaviour2);
                    }
                } else {
                    Optimizer.checkMatchParent(this, linearSystem2, constraintWidget6);
                    if (!constraintWidget6.addFirst()) {
                        constraintWidget6.addToSolver(linearSystem2, zOptimizeFor);
                    }
                }
            }
        }
        if (constraintWidgetContainer.mHorizontalChainsSize > 0) {
            Chain.applyChainConstraints(this, linearSystem2, null, 0);
        }
        if (constraintWidgetContainer.mVerticalChainsSize > 0) {
            Chain.applyChainConstraints(this, linearSystem2, null, 1);
        }
        return true;
    }

    public void addHorizontalWrapMaxVariable(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.mHorizontalWrapMax;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.getFinalValue() > this.mHorizontalWrapMax.get().getFinalValue()) {
            this.mHorizontalWrapMax = new WeakReference<>(constraintAnchor);
        }
    }

    public void addHorizontalWrapMinVariable(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.mHorizontalWrapMin;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.getFinalValue() > this.mHorizontalWrapMin.get().getFinalValue()) {
            this.mHorizontalWrapMin = new WeakReference<>(constraintAnchor);
        }
    }

    public void addVerticalWrapMaxVariable(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.mVerticalWrapMax;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.getFinalValue() > this.mVerticalWrapMax.get().getFinalValue()) {
            this.mVerticalWrapMax = new WeakReference<>(constraintAnchor);
        }
    }

    public void addVerticalWrapMinVariable(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.mVerticalWrapMin;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.getFinalValue() > this.mVerticalWrapMin.get().getFinalValue()) {
            this.mVerticalWrapMin = new WeakReference<>(constraintAnchor);
        }
    }

    public void defineTerminalWidgets() {
        this.mDependencyGraph.defineTerminalWidgets(getHorizontalDimensionBehaviour(), getVerticalDimensionBehaviour());
    }

    public boolean directMeasure(boolean z11) {
        return this.mDependencyGraph.directMeasure(z11);
    }

    public boolean directMeasureSetup(boolean z11) {
        return this.mDependencyGraph.directMeasureSetup(z11);
    }

    public boolean directMeasureWithOrientation(boolean z11, int i11) {
        return this.mDependencyGraph.directMeasureWithOrientation(z11, i11);
    }

    public void fillMetrics(Metrics metrics) {
        this.mMetrics = metrics;
        this.mSystem.fillMetrics(metrics);
    }

    public ArrayList<Guideline> getHorizontalGuidelines() {
        ArrayList<Guideline> arrayList = new ArrayList<>();
        int size = this.mChildren.size();
        for (int i11 = 0; i11 < size; i11++) {
            ConstraintWidget constraintWidget = this.mChildren.get(i11);
            if (constraintWidget instanceof Guideline) {
                Guideline guideline = (Guideline) constraintWidget;
                if (guideline.getOrientation() == 0) {
                    arrayList.add(guideline);
                }
            }
        }
        return arrayList;
    }

    public BasicMeasure.Measurer getMeasurer() {
        return this.mMeasurer;
    }

    public int getOptimizationLevel() {
        return this.mOptimizationLevel;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void getSceneString(StringBuilder sb2) {
        sb2.append(this.stringId + ":{\n");
        sb2.append("  actualWidth:" + this.mWidth);
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        sb2.append("  actualHeight:" + this.mHeight);
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        Iterator<ConstraintWidget> it = getChildren().iterator();
        while (it.hasNext()) {
            it.next().getSceneString(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }

    public LinearSystem getSystem() {
        return this.mSystem;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String getType() {
        return "ConstraintLayout";
    }

    public ArrayList<Guideline> getVerticalGuidelines() {
        ArrayList<Guideline> arrayList = new ArrayList<>();
        int size = this.mChildren.size();
        for (int i11 = 0; i11 < size; i11++) {
            ConstraintWidget constraintWidget = this.mChildren.get(i11);
            if (constraintWidget instanceof Guideline) {
                Guideline guideline = (Guideline) constraintWidget;
                if (guideline.getOrientation() == 1) {
                    arrayList.add(guideline);
                }
            }
        }
        return arrayList;
    }

    public void invalidateGraph() {
        this.mDependencyGraph.invalidateGraph();
    }

    public void invalidateMeasures() {
        this.mDependencyGraph.invalidateMeasures();
    }

    public boolean isHeightMeasuredTooSmall() {
        return this.mHeightMeasuredTooSmall;
    }

    public boolean isRtl() {
        return this.mIsRtl;
    }

    public boolean isWidthMeasuredTooSmall() {
        return this.mWidthMeasuredTooSmall;
    }

    public boolean optimizeFor(int i11) {
        return (this.mOptimizationLevel & i11) == i11;
    }

    @Override // androidx.constraintlayout.core.widgets.WidgetContainer, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void reset() {
        this.mSystem.reset();
        this.mPaddingLeft = 0;
        this.mPaddingRight = 0;
        this.mPaddingTop = 0;
        this.mPaddingBottom = 0;
        this.mSkipSolver = false;
        super.reset();
    }

    public void setMeasurer(BasicMeasure.Measurer measurer) {
        this.mMeasurer = measurer;
        this.mDependencyGraph.setMeasurer(measurer);
    }

    public void setOptimizationLevel(int i11) {
        this.mOptimizationLevel = i11;
        LinearSystem.USE_DEPENDENCY_ORDERING = optimizeFor(512);
    }

    public void setPadding(int i11, int i12, int i13, int i14) {
        this.mPaddingLeft = i11;
        this.mPaddingTop = i12;
        this.mPaddingRight = i13;
        this.mPaddingBottom = i14;
    }

    public void setPass(int i11) {
        this.mPass = i11;
    }

    public void setRtl(boolean z11) {
        this.mIsRtl = z11;
    }

    public void updateHierarchy() {
        this.mBasicMeasureSolver.updateHierarchy(this);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void updateFromRuns(boolean z11, boolean z12) {
        super.updateFromRuns(z11, z12);
        int size = this.mChildren.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.mChildren.get(i11).updateFromRuns(z11, z12);
        }
    }

    public static boolean measure(int i11, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, BasicMeasure.Measure measure, int i12) {
        int i13;
        int i14;
        if (measurer == null) {
            return false;
        }
        if (constraintWidget.getVisibility() != 8 && !(constraintWidget instanceof Guideline) && !(constraintWidget instanceof Barrier)) {
            measure.horizontalBehavior = constraintWidget.getHorizontalDimensionBehaviour();
            measure.verticalBehavior = constraintWidget.getVerticalDimensionBehaviour();
            measure.horizontalDimension = constraintWidget.getWidth();
            measure.verticalDimension = constraintWidget.getHeight();
            measure.measuredNeedsSolverPass = false;
            measure.measureStrategy = i12;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.horizontalBehavior;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z11 = dimensionBehaviour == dimensionBehaviour2;
            boolean z12 = measure.verticalBehavior == dimensionBehaviour2;
            boolean z13 = z11 && constraintWidget.mDimensionRatio > 0.0f;
            boolean z14 = z12 && constraintWidget.mDimensionRatio > 0.0f;
            if (z11 && constraintWidget.hasDanglingDimension(0) && constraintWidget.mMatchConstraintDefaultWidth == 0 && !z13) {
                measure.horizontalBehavior = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (z12 && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                    measure.horizontalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
                }
                z11 = false;
            }
            if (z12 && constraintWidget.hasDanglingDimension(1) && constraintWidget.mMatchConstraintDefaultHeight == 0 && !z14) {
                measure.verticalBehavior = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (z11 && constraintWidget.mMatchConstraintDefaultWidth == 0) {
                    measure.verticalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
                }
                z12 = false;
            }
            if (constraintWidget.isResolvedHorizontally()) {
                measure.horizontalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
                z11 = false;
            }
            if (constraintWidget.isResolvedVertically()) {
                measure.verticalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
                z12 = false;
            }
            if (z13) {
                if (constraintWidget.mResolvedMatchConstraintDefault[0] == 4) {
                    measure.horizontalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
                } else if (!z12) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = measure.verticalBehavior;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    if (dimensionBehaviour3 == dimensionBehaviour4) {
                        i14 = measure.verticalDimension;
                    } else {
                        measure.horizontalBehavior = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        measurer.measure(constraintWidget, measure);
                        i14 = measure.measuredHeight;
                    }
                    measure.horizontalBehavior = dimensionBehaviour4;
                    measure.horizontalDimension = (int) (constraintWidget.getDimensionRatio() * i14);
                }
            }
            if (z14) {
                if (constraintWidget.mResolvedMatchConstraintDefault[1] == 4) {
                    measure.verticalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
                } else if (!z11) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = measure.horizontalBehavior;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
                    if (dimensionBehaviour5 == dimensionBehaviour6) {
                        i13 = measure.horizontalDimension;
                    } else {
                        measure.verticalBehavior = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        measurer.measure(constraintWidget, measure);
                        i13 = measure.measuredWidth;
                    }
                    measure.verticalBehavior = dimensionBehaviour6;
                    if (constraintWidget.getDimensionRatioSide() == -1) {
                        measure.verticalDimension = (int) (i13 / constraintWidget.getDimensionRatio());
                    } else {
                        measure.verticalDimension = (int) (constraintWidget.getDimensionRatio() * i13);
                    }
                }
            }
            measurer.measure(constraintWidget, measure);
            constraintWidget.setWidth(measure.measuredWidth);
            constraintWidget.setHeight(measure.measuredHeight);
            constraintWidget.setHasBaseline(measure.measuredHasBaseline);
            constraintWidget.setBaselineDistance(measure.measuredBaseline);
            measure.measureStrategy = BasicMeasure.Measure.SELF_DIMENSIONS;
            return measure.measuredNeedsSolverPass;
        }
        measure.measuredWidth = 0;
        measure.measuredHeight = 0;
        return false;
    }

    public ConstraintWidgetContainer(int i11, int i12, int i13, int i14) {
        super(i11, i12, i13, i14);
        this.mBasicMeasureSolver = new BasicMeasure(this);
        this.mDependencyGraph = new DependencyGraph(this);
        this.mMeasurer = null;
        this.mIsRtl = false;
        this.mSystem = new LinearSystem();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.mVerticalChainsArray = new ChainHead[4];
        this.mHorizontalChainsArray = new ChainHead[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.mOptimizationLevel = 257;
        this.mSkipSolver = false;
        this.mWidthMeasuredTooSmall = false;
        this.mHeightMeasuredTooSmall = false;
        this.mDebugSolverPassCount = 0;
        this.mVerticalWrapMin = null;
        this.mHorizontalWrapMin = null;
        this.mVerticalWrapMax = null;
        this.mHorizontalWrapMax = null;
        this.mWidgetsToAdd = new HashSet<>();
        this.mMeasure = new BasicMeasure.Measure();
    }

    public ConstraintWidgetContainer(int i11, int i12) {
        super(i11, i12);
        this.mBasicMeasureSolver = new BasicMeasure(this);
        this.mDependencyGraph = new DependencyGraph(this);
        this.mMeasurer = null;
        this.mIsRtl = false;
        this.mSystem = new LinearSystem();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.mVerticalChainsArray = new ChainHead[4];
        this.mHorizontalChainsArray = new ChainHead[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.mOptimizationLevel = 257;
        this.mSkipSolver = false;
        this.mWidthMeasuredTooSmall = false;
        this.mHeightMeasuredTooSmall = false;
        this.mDebugSolverPassCount = 0;
        this.mVerticalWrapMin = null;
        this.mHorizontalWrapMin = null;
        this.mVerticalWrapMax = null;
        this.mHorizontalWrapMax = null;
        this.mWidgetsToAdd = new HashSet<>();
        this.mMeasure = new BasicMeasure.Measure();
    }

    public ConstraintWidgetContainer(String str, int i11, int i12) {
        super(i11, i12);
        this.mBasicMeasureSolver = new BasicMeasure(this);
        this.mDependencyGraph = new DependencyGraph(this);
        this.mMeasurer = null;
        this.mIsRtl = false;
        this.mSystem = new LinearSystem();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.mVerticalChainsArray = new ChainHead[4];
        this.mHorizontalChainsArray = new ChainHead[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.mOptimizationLevel = 257;
        this.mSkipSolver = false;
        this.mWidthMeasuredTooSmall = false;
        this.mHeightMeasuredTooSmall = false;
        this.mDebugSolverPassCount = 0;
        this.mVerticalWrapMin = null;
        this.mHorizontalWrapMin = null;
        this.mVerticalWrapMax = null;
        this.mHorizontalWrapMax = null;
        this.mWidgetsToAdd = new HashSet<>();
        this.mMeasure = new BasicMeasure.Measure();
        setDebugName(str);
    }
}
