package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class BasicMeasure {
    public static final int AT_MOST = Integer.MIN_VALUE;
    private static final boolean DEBUG = false;
    private static final boolean DO_NOT_USE = false;
    public static final int EXACTLY = 1073741824;
    public static final int FIXED = -3;
    public static final int MATCH_PARENT = -1;
    private static final int MODE_SHIFT = 30;
    public static final int UNSPECIFIED = 0;
    public static final int WRAP_CONTENT = -2;
    private ConstraintWidgetContainer mConstraintWidgetContainer;
    private final ArrayList<ConstraintWidget> mVariableDimensionsWidgets = new ArrayList<>();
    private Measure mMeasure = new Measure();

    public static class Measure {
        public static int SELF_DIMENSIONS = 0;
        public static int TRY_GIVEN_DIMENSIONS = 1;
        public static int USE_GIVEN_DIMENSIONS = 2;
        public ConstraintWidget.DimensionBehaviour horizontalBehavior;
        public int horizontalDimension;
        public int measureStrategy;
        public int measuredBaseline;
        public boolean measuredHasBaseline;
        public int measuredHeight;
        public boolean measuredNeedsSolverPass;
        public int measuredWidth;
        public ConstraintWidget.DimensionBehaviour verticalBehavior;
        public int verticalDimension;
    }

    public interface Measurer {
        void didMeasures();

        void measure(ConstraintWidget constraintWidget, Measure measure);
    }

    public long solverMeasure(ConstraintWidgetContainer constraintWidgetContainer, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        long j11;
        boolean zDirectMeasureWithOrientation;
        int i21;
        int i22;
        int i23;
        long j12;
        boolean z11;
        boolean z12;
        Metrics metrics;
        BasicMeasure basicMeasure = this;
        ConstraintWidgetContainer constraintWidgetContainer2 = constraintWidgetContainer;
        Measurer measurer = constraintWidgetContainer2.getMeasurer();
        int size = constraintWidgetContainer2.mChildren.size();
        int width = constraintWidgetContainer2.getWidth();
        int height = constraintWidgetContainer2.getHeight();
        boolean zEnabled = Optimizer.enabled(i11, 128);
        boolean z13 = zEnabled || Optimizer.enabled(i11, 64);
        if (z13) {
            for (int i24 = 0; i24 < size; i24++) {
                ConstraintWidget constraintWidget = constraintWidgetContainer2.mChildren.get(i24);
                ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = constraintWidget.getHorizontalDimensionBehaviour();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                boolean z14 = (horizontalDimensionBehaviour == dimensionBehaviour) && (constraintWidget.getVerticalDimensionBehaviour() == dimensionBehaviour) && constraintWidget.getDimensionRatio() > 0.0f;
                if ((constraintWidget.isInHorizontalChain() && z14) || ((constraintWidget.isInVerticalChain() && z14) || (constraintWidget instanceof VirtualLayout) || constraintWidget.isInHorizontalChain() || constraintWidget.isInVerticalChain())) {
                    z13 = false;
                    break;
                }
            }
        }
        if (z13 && (metrics = LinearSystem.sMetrics) != null) {
            metrics.measures++;
        }
        boolean z15 = z13 & ((i14 == 1073741824 && i16 == 1073741824) || zEnabled);
        int i25 = 2;
        if (z15) {
            j11 = 1;
            int iMin = Math.min(constraintWidgetContainer2.getMaxWidth(), i15);
            int iMin2 = Math.min(constraintWidgetContainer2.getMaxHeight(), i17);
            if (i14 == 1073741824 && constraintWidgetContainer2.getWidth() != iMin) {
                constraintWidgetContainer2.setWidth(iMin);
                constraintWidgetContainer2.invalidateGraph();
            }
            if (i16 == 1073741824 && constraintWidgetContainer2.getHeight() != iMin2) {
                constraintWidgetContainer2.setHeight(iMin2);
                constraintWidgetContainer2.invalidateGraph();
            }
            if (i14 == 1073741824 && i16 == 1073741824) {
                zDirectMeasureWithOrientation = constraintWidgetContainer2.directMeasure(zEnabled);
                i21 = 2;
            } else {
                boolean zDirectMeasureSetup = constraintWidgetContainer2.directMeasureSetup(zEnabled);
                if (i14 == 1073741824) {
                    zDirectMeasureSetup &= constraintWidgetContainer2.directMeasureWithOrientation(zEnabled, 0);
                    i21 = 1;
                } else {
                    i21 = 0;
                }
                if (i16 == 1073741824) {
                    zDirectMeasureWithOrientation = constraintWidgetContainer2.directMeasureWithOrientation(zEnabled, 1) & zDirectMeasureSetup;
                    i21++;
                } else {
                    zDirectMeasureWithOrientation = zDirectMeasureSetup;
                }
            }
            if (zDirectMeasureWithOrientation) {
                constraintWidgetContainer2.updateFromRuns(i14 == 1073741824, i16 == 1073741824);
            }
        } else {
            j11 = 1;
            zDirectMeasureWithOrientation = false;
            i21 = 0;
        }
        long jNanoTime = 0;
        if (!zDirectMeasureWithOrientation || i21 != 2) {
            int optimizationLevel = constraintWidgetContainer2.getOptimizationLevel();
            if (size > 0) {
                measureChildren(constraintWidgetContainer);
            }
            jNanoTime = constraintWidgetContainer2.mMetrics != null ? System.nanoTime() : 0L;
            updateHierarchy(constraintWidgetContainer);
            int size2 = basicMeasure.mVariableDimensionsWidgets.size();
            if (size > 0) {
                basicMeasure.solveLinearSystem(constraintWidgetContainer2, "First pass", 0, width, height);
                i22 = width;
                i23 = height;
            } else {
                i22 = width;
                i23 = height;
            }
            if (size2 > 0) {
                ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour2 = constraintWidgetContainer2.getHorizontalDimensionBehaviour();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z16 = horizontalDimensionBehaviour2 == dimensionBehaviour2;
                boolean z17 = constraintWidgetContainer2.getVerticalDimensionBehaviour() == dimensionBehaviour2;
                int iMax = Math.max(constraintWidgetContainer2.getWidth(), basicMeasure.mConstraintWidgetContainer.getMinWidth());
                int iMax2 = Math.max(constraintWidgetContainer2.getHeight(), basicMeasure.mConstraintWidgetContainer.getMinHeight());
                int i26 = 0;
                boolean zNeedSolverPass = false;
                while (i26 < size2) {
                    ConstraintWidget constraintWidget2 = basicMeasure.mVariableDimensionsWidgets.get(i26);
                    boolean z18 = z15;
                    if (constraintWidget2 instanceof VirtualLayout) {
                        int width2 = constraintWidget2.getWidth();
                        int height2 = constraintWidget2.getHeight();
                        boolean zMeasure = zNeedSolverPass | basicMeasure.measure(measurer, constraintWidget2, Measure.TRY_GIVEN_DIMENSIONS);
                        Metrics metrics2 = constraintWidgetContainer2.mMetrics;
                        if (metrics2 != null) {
                            metrics2.measuredMatchWidgets += j11;
                        }
                        int width3 = constraintWidget2.getWidth();
                        int height3 = constraintWidget2.getHeight();
                        if (width3 != width2) {
                            constraintWidget2.setWidth(width3);
                            if (z16 && constraintWidget2.getRight() > iMax) {
                                iMax = Math.max(iMax, constraintWidget2.getRight() + constraintWidget2.getAnchor(ConstraintAnchor.Type.RIGHT).getMargin());
                            }
                            z12 = true;
                        } else {
                            z12 = zMeasure;
                        }
                        if (height3 != height2) {
                            constraintWidget2.setHeight(height3);
                            if (z17 && constraintWidget2.getBottom() > iMax2) {
                                iMax2 = Math.max(iMax2, constraintWidget2.getBottom() + constraintWidget2.getAnchor(ConstraintAnchor.Type.BOTTOM).getMargin());
                            }
                            z12 = true;
                        }
                        zNeedSolverPass = z12 | ((VirtualLayout) constraintWidget2).needSolverPass();
                    }
                    i26++;
                    i22 = i22;
                    i23 = i23;
                    z15 = z18;
                    jNanoTime = jNanoTime;
                    i25 = 2;
                }
                boolean z19 = z15;
                j12 = jNanoTime;
                int i27 = i22;
                int i28 = i23;
                int i29 = i25;
                int i31 = 0;
                while (i31 < i29) {
                    int i32 = 0;
                    while (i32 < size2) {
                        ConstraintWidget constraintWidget3 = basicMeasure.mVariableDimensionsWidgets.get(i32);
                        if ((!(constraintWidget3 instanceof Helper) || (constraintWidget3 instanceof VirtualLayout)) && !(constraintWidget3 instanceof Guideline) && constraintWidget3.getVisibility() != 8 && ((!z19 || !constraintWidget3.mHorizontalRun.mDimension.resolved || !constraintWidget3.mVerticalRun.mDimension.resolved) && !(constraintWidget3 instanceof VirtualLayout))) {
                            int width4 = constraintWidget3.getWidth();
                            int height4 = constraintWidget3.getHeight();
                            int baselineDistance = constraintWidget3.getBaselineDistance();
                            int i33 = Measure.TRY_GIVEN_DIMENSIONS;
                            if (i31 == 1) {
                                i33 = Measure.USE_GIVEN_DIMENSIONS;
                            }
                            boolean zMeasure2 = zNeedSolverPass | basicMeasure.measure(measurer, constraintWidget3, i33);
                            Metrics metrics3 = constraintWidgetContainer2.mMetrics;
                            if (metrics3 != null) {
                                metrics3.measuredMatchWidgets += j11;
                            }
                            int width5 = constraintWidget3.getWidth();
                            int height5 = constraintWidget3.getHeight();
                            if (width5 != width4) {
                                constraintWidget3.setWidth(width5);
                                if (z16 && constraintWidget3.getRight() > iMax) {
                                    iMax = Math.max(iMax, constraintWidget3.getRight() + constraintWidget3.getAnchor(ConstraintAnchor.Type.RIGHT).getMargin());
                                }
                                z11 = true;
                            } else {
                                z11 = zMeasure2;
                            }
                            if (height5 != height4) {
                                constraintWidget3.setHeight(height5);
                                if (z17 && constraintWidget3.getBottom() > iMax2) {
                                    iMax2 = Math.max(iMax2, constraintWidget3.getBottom() + constraintWidget3.getAnchor(ConstraintAnchor.Type.BOTTOM).getMargin());
                                }
                                z11 = true;
                            }
                            zNeedSolverPass = (!constraintWidget3.hasBaseline() || baselineDistance == constraintWidget3.getBaselineDistance()) ? z11 : true;
                        }
                        i32++;
                        basicMeasure = this;
                        constraintWidgetContainer2 = constraintWidgetContainer;
                    }
                    if (!zNeedSolverPass) {
                        constraintWidgetContainer2 = constraintWidgetContainer;
                        break;
                    }
                    i31++;
                    solveLinearSystem(constraintWidgetContainer, "intermediate pass", i31, i27, i28);
                    basicMeasure = this;
                    constraintWidgetContainer2 = constraintWidgetContainer;
                    i29 = 2;
                    zNeedSolverPass = false;
                }
            } else {
                j12 = jNanoTime;
            }
            constraintWidgetContainer2.setOptimizationLevel(optimizationLevel);
            jNanoTime = j12;
        }
        return constraintWidgetContainer2.mMetrics != null ? System.nanoTime() - jNanoTime : jNanoTime;
    }

    private boolean measure(Measurer measurer, ConstraintWidget constraintWidget, int i11) {
        this.mMeasure.horizontalBehavior = constraintWidget.getHorizontalDimensionBehaviour();
        this.mMeasure.verticalBehavior = constraintWidget.getVerticalDimensionBehaviour();
        this.mMeasure.horizontalDimension = constraintWidget.getWidth();
        this.mMeasure.verticalDimension = constraintWidget.getHeight();
        Measure measure = this.mMeasure;
        measure.measuredNeedsSolverPass = false;
        measure.measureStrategy = i11;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.horizontalBehavior;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z11 = dimensionBehaviour == dimensionBehaviour2;
        boolean z12 = measure.verticalBehavior == dimensionBehaviour2;
        boolean z13 = z11 && constraintWidget.mDimensionRatio > 0.0f;
        boolean z14 = z12 && constraintWidget.mDimensionRatio > 0.0f;
        if (z13 && constraintWidget.mResolvedMatchConstraintDefault[0] == 4) {
            measure.horizontalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z14 && constraintWidget.mResolvedMatchConstraintDefault[1] == 4) {
            measure.verticalBehavior = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        measurer.measure(constraintWidget, measure);
        constraintWidget.setWidth(this.mMeasure.measuredWidth);
        constraintWidget.setHeight(this.mMeasure.measuredHeight);
        constraintWidget.setHasBaseline(this.mMeasure.measuredHasBaseline);
        constraintWidget.setBaselineDistance(this.mMeasure.measuredBaseline);
        Measure measure2 = this.mMeasure;
        measure2.measureStrategy = Measure.SELF_DIMENSIONS;
        return measure2.measuredNeedsSolverPass;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0098 A[PHI: r10
      0x0098: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:32:0x0062, B:34:0x0068, B:36:0x006c, B:54:0x0095, B:52:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    private void measureChildren(ConstraintWidgetContainer constraintWidgetContainer) {
        boolean z11;
        HorizontalWidgetRun horizontalWidgetRun;
        VerticalWidgetRun verticalWidgetRun;
        int size = constraintWidgetContainer.mChildren.size();
        boolean zOptimizeFor = constraintWidgetContainer.optimizeFor(64);
        Measurer measurer = constraintWidgetContainer.getMeasurer();
        for (int i11 = 0; i11 < size; i11++) {
            ConstraintWidget constraintWidget = constraintWidgetContainer.mChildren.get(i11);
            if (!(constraintWidget instanceof Guideline) && !(constraintWidget instanceof Barrier) && !constraintWidget.isInVirtualLayout() && (!zOptimizeFor || (horizontalWidgetRun = constraintWidget.mHorizontalRun) == null || (verticalWidgetRun = constraintWidget.mVerticalRun) == null || !horizontalWidgetRun.mDimension.resolved || !verticalWidgetRun.mDimension.resolved)) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget.getDimensionBehaviour(0);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget.getDimensionBehaviour(1);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                boolean z12 = dimensionBehaviour == dimensionBehaviour3 && constraintWidget.mMatchConstraintDefaultWidth != 1 && dimensionBehaviour2 == dimensionBehaviour3 && constraintWidget.mMatchConstraintDefaultHeight != 1;
                if (!z12 && constraintWidgetContainer.optimizeFor(1) && !(constraintWidget instanceof VirtualLayout)) {
                    if (dimensionBehaviour == dimensionBehaviour3 && constraintWidget.mMatchConstraintDefaultWidth == 0 && dimensionBehaviour2 != dimensionBehaviour3 && !constraintWidget.isInHorizontalChain()) {
                        z12 = true;
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3 && constraintWidget.mMatchConstraintDefaultHeight == 0 && dimensionBehaviour != dimensionBehaviour3 && !constraintWidget.isInHorizontalChain()) {
                        z12 = true;
                    }
                    z11 = (!(dimensionBehaviour == dimensionBehaviour3 || dimensionBehaviour2 == dimensionBehaviour3) || constraintWidget.mDimensionRatio <= 0.0f) ? z12 : true;
                }
                if (!z11) {
                    measure(measurer, constraintWidget, Measure.SELF_DIMENSIONS);
                    Metrics metrics = constraintWidgetContainer.mMetrics;
                    if (metrics != null) {
                        metrics.measuredWidgets++;
                    }
                }
            }
        }
        measurer.didMeasures();
    }

    private void solveLinearSystem(ConstraintWidgetContainer constraintWidgetContainer, String str, int i11, int i12, int i13) {
        long jNanoTime = constraintWidgetContainer.mMetrics != null ? System.nanoTime() : 0L;
        int minWidth = constraintWidgetContainer.getMinWidth();
        int minHeight = constraintWidgetContainer.getMinHeight();
        constraintWidgetContainer.setMinWidth(0);
        constraintWidgetContainer.setMinHeight(0);
        constraintWidgetContainer.setWidth(i12);
        constraintWidgetContainer.setHeight(i13);
        constraintWidgetContainer.setMinWidth(minWidth);
        constraintWidgetContainer.setMinHeight(minHeight);
        this.mConstraintWidgetContainer.setPass(i11);
        this.mConstraintWidgetContainer.layout();
        if (constraintWidgetContainer.mMetrics != null) {
            long jNanoTime2 = System.nanoTime();
            Metrics metrics = constraintWidgetContainer.mMetrics;
            metrics.mSolverPasses++;
            metrics.measuresLayoutDuration += jNanoTime2 - jNanoTime;
        }
    }

    public void updateHierarchy(ConstraintWidgetContainer constraintWidgetContainer) {
        this.mVariableDimensionsWidgets.clear();
        int size = constraintWidgetContainer.mChildren.size();
        for (int i11 = 0; i11 < size; i11++) {
            ConstraintWidget constraintWidget = constraintWidgetContainer.mChildren.get(i11);
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = constraintWidget.getHorizontalDimensionBehaviour();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (horizontalDimensionBehaviour == dimensionBehaviour || constraintWidget.getVerticalDimensionBehaviour() == dimensionBehaviour) {
                this.mVariableDimensionsWidgets.add(constraintWidget);
            }
        }
        constraintWidgetContainer.invalidateGraph();
    }

    public BasicMeasure(ConstraintWidgetContainer constraintWidgetContainer) {
        this.mConstraintWidgetContainer = constraintWidgetContainer;
    }
}
