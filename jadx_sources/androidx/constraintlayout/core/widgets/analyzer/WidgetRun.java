package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: classes.dex */
public abstract class WidgetRun implements Dependency {
    protected ConstraintWidget.DimensionBehaviour mDimensionBehavior;
    RunGroup mRunGroup;
    ConstraintWidget mWidget;
    public int matchConstraintsType;
    DimensionDependency mDimension = new DimensionDependency(this);
    public int orientation = 0;
    boolean mResolved = false;
    public DependencyNode start = new DependencyNode(this);
    public DependencyNode end = new DependencyNode(this);
    protected RunType mRunType = RunType.NONE;

    /* JADX INFO: loaded from: classes23.dex */
    public enum RunType {
        NONE,
        START,
        END,
        CENTER
    }

    public final void addTarget(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i11) {
        dependencyNode.mTargets.add(dependencyNode2);
        dependencyNode.mMargin = i11;
        dependencyNode2.mDependencies.add(dependencyNode);
    }

    public abstract void apply();

    public abstract void applyToWidget();

    public abstract void clear();

    public final DependencyNode getTarget(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.mOwner;
        int i11 = C15041.f2208x6930e354[constraintAnchor2.mType.ordinal()];
        if (i11 == 1) {
            return constraintWidget.mHorizontalRun.start;
        }
        if (i11 == 2) {
            return constraintWidget.mHorizontalRun.end;
        }
        if (i11 == 3) {
            return constraintWidget.mVerticalRun.start;
        }
        if (i11 == 4) {
            return constraintWidget.mVerticalRun.baseline;
        }
        if (i11 != 5) {
            return null;
        }
        return constraintWidget.mVerticalRun.end;
    }

    public abstract void reset();

    public abstract boolean supportsWrapComputation();

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.WidgetRun$1 */
    /* JADX INFO: loaded from: classes23.dex */
    public static /* synthetic */ class C15041 {

        /* JADX INFO: renamed from: $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type */
        static final /* synthetic */ int[] f2208x6930e354;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f2208x6930e354 = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2208x6930e354[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2208x6930e354[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2208x6930e354[ConstraintAnchor.Type.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2208x6930e354[ConstraintAnchor.Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private void resolveDimension(int i11, int i12) {
        int i13 = this.matchConstraintsType;
        if (i13 == 0) {
            this.mDimension.resolve(getLimitedDimension(i12, i11));
            return;
        }
        if (i13 == 1) {
            this.mDimension.resolve(Math.min(getLimitedDimension(this.mDimension.wrapValue, i11), i12));
            return;
        }
        if (i13 == 2) {
            ConstraintWidget parent = this.mWidget.getParent();
            if (parent != null) {
                DimensionDependency dimensionDependency = (i11 == 0 ? parent.mHorizontalRun : parent.mVerticalRun).mDimension;
                if (dimensionDependency.resolved) {
                    this.mDimension.resolve(getLimitedDimension((int) ((dimensionDependency.value * (i11 == 0 ? this.mWidget.mMatchConstraintPercentWidth : this.mWidget.mMatchConstraintPercentHeight)) + 0.5f), i11));
                    return;
                }
                return;
            }
            return;
        }
        if (i13 != 3) {
            return;
        }
        ConstraintWidget constraintWidget = this.mWidget;
        WidgetRun widgetRun = constraintWidget.mHorizontalRun;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = widgetRun.mDimensionBehavior;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour == dimensionBehaviour2 && widgetRun.matchConstraintsType == 3) {
            VerticalWidgetRun verticalWidgetRun = constraintWidget.mVerticalRun;
            if (verticalWidgetRun.mDimensionBehavior == dimensionBehaviour2 && verticalWidgetRun.matchConstraintsType == 3) {
                return;
            }
        }
        if (i11 == 0) {
            widgetRun = constraintWidget.mVerticalRun;
        }
        if (widgetRun.mDimension.resolved) {
            float dimensionRatio = constraintWidget.getDimensionRatio();
            this.mDimension.resolve(i11 == 1 ? (int) ((widgetRun.mDimension.value / dimensionRatio) + 0.5f) : (int) ((dimensionRatio * widgetRun.mDimension.value) + 0.5f));
        }
    }

    public final int getLimitedDimension(int i11, int i12) {
        if (i12 == 0) {
            ConstraintWidget constraintWidget = this.mWidget;
            int i13 = constraintWidget.mMatchConstraintMaxWidth;
            int iMax = Math.max(constraintWidget.mMatchConstraintMinWidth, i11);
            if (i13 > 0) {
                iMax = Math.min(i13, i11);
            }
            if (iMax != i11) {
                return iMax;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.mWidget;
            int i14 = constraintWidget2.mMatchConstraintMaxHeight;
            int iMax2 = Math.max(constraintWidget2.mMatchConstraintMinHeight, i11);
            if (i14 > 0) {
                iMax2 = Math.min(i14, i11);
            }
            if (iMax2 != i11) {
                return iMax2;
            }
        }
        return i11;
    }

    public long getWrapDimension() {
        DimensionDependency dimensionDependency = this.mDimension;
        if (dimensionDependency.resolved) {
            return dimensionDependency.value;
        }
        return 0L;
    }

    public boolean isCenterConnection() {
        int size = this.start.mTargets.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            if (this.start.mTargets.get(i12).mRun != this) {
                i11++;
            }
        }
        int size2 = this.end.mTargets.size();
        for (int i13 = 0; i13 < size2; i13++) {
            if (this.end.mTargets.get(i13).mRun != this) {
                i11++;
            }
        }
        return i11 >= 2;
    }

    public boolean isDimensionResolved() {
        return this.mDimension.resolved;
    }

    public boolean isResolved() {
        return this.mResolved;
    }

    public long wrapSize(int i11) {
        DimensionDependency dimensionDependency = this.mDimension;
        if (!dimensionDependency.resolved) {
            return 0L;
        }
        long j11 = dimensionDependency.value;
        if (isCenterConnection()) {
            return j11 + ((long) (this.start.mMargin - this.end.mMargin));
        }
        return i11 == 0 ? j11 + ((long) this.start.mMargin) : j11 - ((long) this.end.mMargin);
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.mWidget = constraintWidget;
    }

    public void updateRunCenter(Dependency dependency, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i11) {
        float verticalBiasPercent;
        DependencyNode target = getTarget(constraintAnchor);
        DependencyNode target2 = getTarget(constraintAnchor2);
        if (target.resolved && target2.resolved) {
            int margin = target.value + constraintAnchor.getMargin();
            int margin2 = target2.value - constraintAnchor2.getMargin();
            int i12 = margin2 - margin;
            if (!this.mDimension.resolved && this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                resolveDimension(i11, i12);
            }
            DimensionDependency dimensionDependency = this.mDimension;
            if (dimensionDependency.resolved) {
                if (dimensionDependency.value == i12) {
                    this.start.resolve(margin);
                    this.end.resolve(margin2);
                    return;
                }
                if (i11 == 0) {
                    verticalBiasPercent = this.mWidget.getHorizontalBiasPercent();
                } else {
                    verticalBiasPercent = this.mWidget.getVerticalBiasPercent();
                }
                if (target == target2) {
                    margin = target.value;
                    margin2 = target2.value;
                    verticalBiasPercent = 0.5f;
                }
                this.start.resolve((int) (margin + 0.5f + (((margin2 - margin) - this.mDimension.value) * verticalBiasPercent)));
                this.end.resolve(this.start.value + this.mDimension.value);
            }
        }
    }

    public final void addTarget(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i11, DimensionDependency dimensionDependency) {
        dependencyNode.mTargets.add(dependencyNode2);
        dependencyNode.mTargets.add(this.mDimension);
        dependencyNode.mMarginFactor = i11;
        dependencyNode.mMarginDependency = dimensionDependency;
        dependencyNode2.mDependencies.add(dependencyNode);
        dimensionDependency.mDependencies.add(dependencyNode);
    }

    public final DependencyNode getTarget(ConstraintAnchor constraintAnchor, int i11) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.mOwner;
        WidgetRun widgetRun = i11 == 0 ? constraintWidget.mHorizontalRun : constraintWidget.mVerticalRun;
        int i12 = C15041.f2208x6930e354[constraintAnchor2.mType.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 5) {
                        return null;
                    }
                }
            }
            return widgetRun.end;
        }
        return widgetRun.start;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
    }

    public void updateRunEnd(Dependency dependency) {
    }

    public void updateRunStart(Dependency dependency) {
    }
}
