package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Helper;

/* JADX INFO: loaded from: classes.dex */
public class HorizontalWidgetRun extends WidgetRun {
    private static int[] sTempDimensions = new int[2];

    private void computeInsetRatio(int[] iArr, int i11, int i12, int i13, int i14, float f11, int i15) {
        int i16 = i12 - i11;
        int i17 = i14 - i13;
        if (i15 != -1) {
            if (i15 == 0) {
                iArr[0] = (int) ((i17 * f11) + 0.5f);
                iArr[1] = i17;
                return;
            } else {
                if (i15 != 1) {
                    return;
                }
                iArr[0] = i16;
                iArr[1] = (int) ((i16 * f11) + 0.5f);
                return;
            }
        }
        int i18 = (int) ((i17 * f11) + 0.5f);
        int i19 = (int) ((i16 / f11) + 0.5f);
        if (i18 <= i16) {
            iArr[0] = i18;
            iArr[1] = i17;
        } else if (i19 <= i17) {
            iArr[0] = i16;
            iArr[1] = i19;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void apply() {
        ConstraintWidget parent;
        ConstraintWidget parent2;
        ConstraintWidget constraintWidget = this.mWidget;
        if (constraintWidget.measured) {
            this.mDimension.resolve(constraintWidget.getWidth());
        }
        if (this.mDimension.resolved) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.mDimensionBehavior;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour == dimensionBehaviour2 && (parent = this.mWidget.getParent()) != null && (parent.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED || parent.getHorizontalDimensionBehaviour() == dimensionBehaviour2)) {
                addTarget(this.start, parent.mHorizontalRun.start, this.mWidget.mLeft.getMargin());
                addTarget(this.end, parent.mHorizontalRun.end, -this.mWidget.mRight.getMargin());
                return;
            }
        } else {
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = this.mWidget.getHorizontalDimensionBehaviour();
            this.mDimensionBehavior = horizontalDimensionBehaviour;
            if (horizontalDimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (horizontalDimensionBehaviour == dimensionBehaviour3 && (parent2 = this.mWidget.getParent()) != null && (parent2.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED || parent2.getHorizontalDimensionBehaviour() == dimensionBehaviour3)) {
                    int width = (parent2.getWidth() - this.mWidget.mLeft.getMargin()) - this.mWidget.mRight.getMargin();
                    addTarget(this.start, parent2.mHorizontalRun.start, this.mWidget.mLeft.getMargin());
                    addTarget(this.end, parent2.mHorizontalRun.end, -this.mWidget.mRight.getMargin());
                    this.mDimension.resolve(width);
                    return;
                }
                if (this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.mDimension.resolve(this.mWidget.getWidth());
                }
            }
        }
        DimensionDependency dimensionDependency = this.mDimension;
        if (dimensionDependency.resolved) {
            ConstraintWidget constraintWidget2 = this.mWidget;
            if (constraintWidget2.measured) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.mListAnchors;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[0];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
                if (constraintAnchor2 != null && constraintAnchorArr[1].mTarget != null) {
                    if (constraintWidget2.isInHorizontalChain()) {
                        this.start.mMargin = this.mWidget.mListAnchors[0].getMargin();
                        this.end.mMargin = -this.mWidget.mListAnchors[1].getMargin();
                        return;
                    }
                    DependencyNode target = getTarget(this.mWidget.mListAnchors[0]);
                    if (target != null) {
                        addTarget(this.start, target, this.mWidget.mListAnchors[0].getMargin());
                    }
                    DependencyNode target2 = getTarget(this.mWidget.mListAnchors[1]);
                    if (target2 != null) {
                        addTarget(this.end, target2, -this.mWidget.mListAnchors[1].getMargin());
                    }
                    this.start.delegateToWidgetRun = true;
                    this.end.delegateToWidgetRun = true;
                    return;
                }
                if (constraintAnchor2 != null) {
                    DependencyNode target3 = getTarget(constraintAnchor);
                    if (target3 != null) {
                        addTarget(this.start, target3, this.mWidget.mListAnchors[0].getMargin());
                        addTarget(this.end, this.start, this.mDimension.value);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[1];
                if (constraintAnchor3.mTarget != null) {
                    DependencyNode target4 = getTarget(constraintAnchor3);
                    if (target4 != null) {
                        addTarget(this.end, target4, -this.mWidget.mListAnchors[1].getMargin());
                        addTarget(this.start, this.end, -this.mDimension.value);
                        return;
                    }
                    return;
                }
                if ((constraintWidget2 instanceof Helper) || constraintWidget2.getParent() == null || this.mWidget.getAnchor(ConstraintAnchor.Type.CENTER).mTarget != null) {
                    return;
                }
                addTarget(this.start, this.mWidget.getParent().mHorizontalRun.start, this.mWidget.getX());
                addTarget(this.end, this.start, this.mDimension.value);
                return;
            }
        }
        if (this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget3 = this.mWidget;
            int i11 = constraintWidget3.mMatchConstraintDefaultWidth;
            if (i11 == 2) {
                ConstraintWidget parent3 = constraintWidget3.getParent();
                if (parent3 != null) {
                    DimensionDependency dimensionDependency2 = parent3.mVerticalRun.mDimension;
                    this.mDimension.mTargets.add(dimensionDependency2);
                    dimensionDependency2.mDependencies.add(this.mDimension);
                    DimensionDependency dimensionDependency3 = this.mDimension;
                    dimensionDependency3.delegateToWidgetRun = true;
                    dimensionDependency3.mDependencies.add(this.start);
                    this.mDimension.mDependencies.add(this.end);
                }
            } else if (i11 == 3) {
                if (constraintWidget3.mMatchConstraintDefaultHeight == 3) {
                    this.start.updateDelegate = this;
                    this.end.updateDelegate = this;
                    VerticalWidgetRun verticalWidgetRun = constraintWidget3.mVerticalRun;
                    verticalWidgetRun.start.updateDelegate = this;
                    verticalWidgetRun.end.updateDelegate = this;
                    dimensionDependency.updateDelegate = this;
                    if (constraintWidget3.isInVerticalChain()) {
                        this.mDimension.mTargets.add(this.mWidget.mVerticalRun.mDimension);
                        this.mWidget.mVerticalRun.mDimension.mDependencies.add(this.mDimension);
                        VerticalWidgetRun verticalWidgetRun2 = this.mWidget.mVerticalRun;
                        verticalWidgetRun2.mDimension.updateDelegate = this;
                        this.mDimension.mTargets.add(verticalWidgetRun2.start);
                        this.mDimension.mTargets.add(this.mWidget.mVerticalRun.end);
                        this.mWidget.mVerticalRun.start.mDependencies.add(this.mDimension);
                        this.mWidget.mVerticalRun.end.mDependencies.add(this.mDimension);
                    } else if (this.mWidget.isInHorizontalChain()) {
                        this.mWidget.mVerticalRun.mDimension.mTargets.add(this.mDimension);
                        this.mDimension.mDependencies.add(this.mWidget.mVerticalRun.mDimension);
                    } else {
                        this.mWidget.mVerticalRun.mDimension.mTargets.add(this.mDimension);
                    }
                } else {
                    DimensionDependency dimensionDependency4 = constraintWidget3.mVerticalRun.mDimension;
                    dimensionDependency.mTargets.add(dimensionDependency4);
                    dimensionDependency4.mDependencies.add(this.mDimension);
                    this.mWidget.mVerticalRun.start.mDependencies.add(this.mDimension);
                    this.mWidget.mVerticalRun.end.mDependencies.add(this.mDimension);
                    DimensionDependency dimensionDependency5 = this.mDimension;
                    dimensionDependency5.delegateToWidgetRun = true;
                    dimensionDependency5.mDependencies.add(this.start);
                    this.mDimension.mDependencies.add(this.end);
                    this.start.mTargets.add(this.mDimension);
                    this.end.mTargets.add(this.mDimension);
                }
            }
        }
        ConstraintWidget constraintWidget4 = this.mWidget;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget4.mListAnchors;
        ConstraintAnchor constraintAnchor4 = constraintAnchorArr2[0];
        ConstraintAnchor constraintAnchor5 = constraintAnchor4.mTarget;
        if (constraintAnchor5 != null && constraintAnchorArr2[1].mTarget != null) {
            if (constraintWidget4.isInHorizontalChain()) {
                this.start.mMargin = this.mWidget.mListAnchors[0].getMargin();
                this.end.mMargin = -this.mWidget.mListAnchors[1].getMargin();
                return;
            }
            DependencyNode target5 = getTarget(this.mWidget.mListAnchors[0]);
            DependencyNode target6 = getTarget(this.mWidget.mListAnchors[1]);
            if (target5 != null) {
                target5.addDependency(this);
            }
            if (target6 != null) {
                target6.addDependency(this);
            }
            this.mRunType = WidgetRun.RunType.CENTER;
            return;
        }
        if (constraintAnchor5 != null) {
            DependencyNode target7 = getTarget(constraintAnchor4);
            if (target7 != null) {
                addTarget(this.start, target7, this.mWidget.mListAnchors[0].getMargin());
                addTarget(this.end, this.start, 1, this.mDimension);
                return;
            }
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr2[1];
        if (constraintAnchor6.mTarget != null) {
            DependencyNode target8 = getTarget(constraintAnchor6);
            if (target8 != null) {
                addTarget(this.end, target8, -this.mWidget.mListAnchors[1].getMargin());
                addTarget(this.start, this.end, -1, this.mDimension);
                return;
            }
            return;
        }
        if ((constraintWidget4 instanceof Helper) || constraintWidget4.getParent() == null) {
            return;
        }
        addTarget(this.start, this.mWidget.getParent().mHorizontalRun.start, this.mWidget.getX());
        addTarget(this.end, this.start, 1, this.mDimension);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void clear() {
        this.mRunGroup = null;
        this.start.clear();
        this.end.clear();
        this.mDimension.clear();
        this.mResolved = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void reset() {
        this.mResolved = false;
        this.start.clear();
        this.start.resolved = false;
        this.end.clear();
        this.end.resolved = false;
        this.mDimension.resolved = false;
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun$1 */
    /* JADX INFO: loaded from: classes23.dex */
    public static /* synthetic */ class C15021 {

        /* JADX INFO: renamed from: $SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType */
        static final /* synthetic */ int[] f2206x56910102;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            f2206x56910102 = iArr;
            try {
                iArr[WidgetRun.RunType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2206x56910102[WidgetRun.RunType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2206x56910102[WidgetRun.RunType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        DependencyNode dependencyNode = this.start;
        if (dependencyNode.resolved) {
            this.mWidget.setX(dependencyNode.value);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public boolean supportsWrapComputation() {
        return this.mDimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.mWidget.mMatchConstraintDefaultWidth == 0;
    }

    public String toString() {
        return "HorizontalRun " + this.mWidget.getDebugName();
    }

    /* JADX WARN: Code duplicated, block: B:122:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d9  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
        int limitedDimension;
        int i11;
        int limitedDimension2;
        float f11;
        float dimensionRatio;
        float dimensionRatio2;
        int i12;
        int i13 = C15021.f2206x56910102[this.mRunType.ordinal()];
        if (i13 == 1) {
            updateRunStart(dependency);
        } else if (i13 == 2) {
            updateRunEnd(dependency);
        } else if (i13 == 3) {
            ConstraintWidget constraintWidget = this.mWidget;
            updateRunCenter(dependency, constraintWidget.mLeft, constraintWidget.mRight, 0);
            return;
        }
        if (!this.mDimension.resolved && this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.mWidget;
            int i14 = constraintWidget2.mMatchConstraintDefaultWidth;
            if (i14 == 2) {
                ConstraintWidget parent = constraintWidget2.getParent();
                if (parent != null) {
                    DimensionDependency dimensionDependency = parent.mHorizontalRun.mDimension;
                    if (dimensionDependency.resolved) {
                        this.mDimension.resolve((int) ((dimensionDependency.value * this.mWidget.mMatchConstraintPercentWidth) + 0.5f));
                    }
                }
            } else if (i14 == 3) {
                int i15 = constraintWidget2.mMatchConstraintDefaultHeight;
                if (i15 == 0 || i15 == 3) {
                    VerticalWidgetRun verticalWidgetRun = constraintWidget2.mVerticalRun;
                    DependencyNode dependencyNode = verticalWidgetRun.start;
                    DependencyNode dependencyNode2 = verticalWidgetRun.end;
                    boolean z11 = constraintWidget2.mLeft.mTarget != null;
                    boolean z12 = constraintWidget2.mTop.mTarget != null;
                    boolean z13 = constraintWidget2.mRight.mTarget != null;
                    boolean z14 = constraintWidget2.mBottom.mTarget != null;
                    int dimensionRatioSide = constraintWidget2.getDimensionRatioSide();
                    if (z11 && z12 && z13 && z14) {
                        float dimensionRatio3 = this.mWidget.getDimensionRatio();
                        if (dependencyNode.resolved && dependencyNode2.resolved) {
                            DependencyNode dependencyNode3 = this.start;
                            if (dependencyNode3.readyToSolve && this.end.readyToSolve) {
                                computeInsetRatio(sTempDimensions, this.start.mMargin + dependencyNode3.mTargets.get(0).value, this.end.mTargets.get(0).value - this.end.mMargin, dependencyNode.mMargin + dependencyNode.value, dependencyNode2.value - dependencyNode2.mMargin, dimensionRatio3, dimensionRatioSide);
                                this.mDimension.resolve(sTempDimensions[0]);
                                this.mWidget.mVerticalRun.mDimension.resolve(sTempDimensions[1]);
                                return;
                            }
                            return;
                        }
                        DependencyNode dependencyNode4 = this.start;
                        if (dependencyNode4.resolved) {
                            DependencyNode dependencyNode5 = this.end;
                            if (dependencyNode5.resolved) {
                                if (!dependencyNode.readyToSolve || !dependencyNode2.readyToSolve) {
                                    return;
                                }
                                computeInsetRatio(sTempDimensions, dependencyNode4.value + dependencyNode4.mMargin, dependencyNode5.value - dependencyNode5.mMargin, dependencyNode.mMargin + dependencyNode.mTargets.get(0).value, dependencyNode2.mTargets.get(0).value - dependencyNode2.mMargin, dimensionRatio3, dimensionRatioSide);
                                this.mDimension.resolve(sTempDimensions[0]);
                                this.mWidget.mVerticalRun.mDimension.resolve(sTempDimensions[1]);
                            }
                        }
                        DependencyNode dependencyNode6 = this.start;
                        if (!dependencyNode6.readyToSolve || !this.end.readyToSolve || !dependencyNode.readyToSolve || !dependencyNode2.readyToSolve) {
                            return;
                        }
                        computeInsetRatio(sTempDimensions, this.start.mMargin + dependencyNode6.mTargets.get(0).value, this.end.mTargets.get(0).value - this.end.mMargin, dependencyNode.mMargin + dependencyNode.mTargets.get(0).value, dependencyNode2.mTargets.get(0).value - dependencyNode2.mMargin, dimensionRatio3, dimensionRatioSide);
                        this.mDimension.resolve(sTempDimensions[0]);
                        this.mWidget.mVerticalRun.mDimension.resolve(sTempDimensions[1]);
                    } else if (z11 && z13) {
                        if (!this.start.readyToSolve || !this.end.readyToSolve) {
                            return;
                        }
                        float dimensionRatio4 = this.mWidget.getDimensionRatio();
                        int i16 = this.start.mTargets.get(0).value + this.start.mMargin;
                        int i17 = this.end.mTargets.get(0).value - this.end.mMargin;
                        if (dimensionRatioSide == -1 || dimensionRatioSide == 0) {
                            int limitedDimension3 = getLimitedDimension(i17 - i16, 0);
                            int i18 = (int) ((limitedDimension3 * dimensionRatio4) + 0.5f);
                            int limitedDimension4 = getLimitedDimension(i18, 1);
                            if (i18 != limitedDimension4) {
                                limitedDimension3 = (int) ((limitedDimension4 / dimensionRatio4) + 0.5f);
                            }
                            this.mDimension.resolve(limitedDimension3);
                            this.mWidget.mVerticalRun.mDimension.resolve(limitedDimension4);
                        } else if (dimensionRatioSide == 1) {
                            int limitedDimension5 = getLimitedDimension(i17 - i16, 0);
                            int i19 = (int) ((limitedDimension5 / dimensionRatio4) + 0.5f);
                            int limitedDimension6 = getLimitedDimension(i19, 1);
                            if (i19 != limitedDimension6) {
                                limitedDimension5 = (int) ((limitedDimension6 * dimensionRatio4) + 0.5f);
                            }
                            this.mDimension.resolve(limitedDimension5);
                            this.mWidget.mVerticalRun.mDimension.resolve(limitedDimension6);
                        }
                    } else if (z12 && z14) {
                        if (!dependencyNode.readyToSolve || !dependencyNode2.readyToSolve) {
                            return;
                        }
                        float dimensionRatio5 = this.mWidget.getDimensionRatio();
                        int i21 = dependencyNode.mTargets.get(0).value + dependencyNode.mMargin;
                        int i22 = dependencyNode2.mTargets.get(0).value - dependencyNode2.mMargin;
                        if (dimensionRatioSide == -1) {
                            limitedDimension = getLimitedDimension(i22 - i21, 1);
                            i11 = (int) ((limitedDimension / dimensionRatio5) + 0.5f);
                            limitedDimension2 = getLimitedDimension(i11, 0);
                            if (i11 != limitedDimension2) {
                                limitedDimension = (int) ((limitedDimension2 * dimensionRatio5) + 0.5f);
                            }
                            this.mDimension.resolve(limitedDimension2);
                            this.mWidget.mVerticalRun.mDimension.resolve(limitedDimension);
                        } else if (dimensionRatioSide == 0) {
                            int limitedDimension7 = getLimitedDimension(i22 - i21, 1);
                            int i23 = (int) ((limitedDimension7 * dimensionRatio5) + 0.5f);
                            int limitedDimension8 = getLimitedDimension(i23, 0);
                            if (i23 != limitedDimension8) {
                                limitedDimension7 = (int) ((limitedDimension8 / dimensionRatio5) + 0.5f);
                            }
                            this.mDimension.resolve(limitedDimension8);
                            this.mWidget.mVerticalRun.mDimension.resolve(limitedDimension7);
                        } else if (dimensionRatioSide == 1) {
                            limitedDimension = getLimitedDimension(i22 - i21, 1);
                            i11 = (int) ((limitedDimension / dimensionRatio5) + 0.5f);
                            limitedDimension2 = getLimitedDimension(i11, 0);
                            if (i11 != limitedDimension2) {
                                limitedDimension = (int) ((limitedDimension2 * dimensionRatio5) + 0.5f);
                            }
                            this.mDimension.resolve(limitedDimension2);
                            this.mWidget.mVerticalRun.mDimension.resolve(limitedDimension);
                        }
                    }
                } else {
                    int dimensionRatioSide2 = constraintWidget2.getDimensionRatioSide();
                    if (dimensionRatioSide2 != -1) {
                        if (dimensionRatioSide2 == 0) {
                            ConstraintWidget constraintWidget3 = this.mWidget;
                            dimensionRatio2 = constraintWidget3.mVerticalRun.mDimension.value / constraintWidget3.getDimensionRatio();
                            i12 = (int) (dimensionRatio2 + 0.5f);
                        } else if (dimensionRatioSide2 != 1) {
                            i12 = 0;
                        } else {
                            ConstraintWidget constraintWidget4 = this.mWidget;
                            f11 = constraintWidget4.mVerticalRun.mDimension.value;
                            dimensionRatio = constraintWidget4.getDimensionRatio();
                        }
                        this.mDimension.resolve(i12);
                    } else {
                        ConstraintWidget constraintWidget5 = this.mWidget;
                        f11 = constraintWidget5.mVerticalRun.mDimension.value;
                        dimensionRatio = constraintWidget5.getDimensionRatio();
                    }
                    dimensionRatio2 = f11 * dimensionRatio;
                    i12 = (int) (dimensionRatio2 + 0.5f);
                    this.mDimension.resolve(i12);
                }
            }
        }
        DependencyNode dependencyNode7 = this.start;
        if (dependencyNode7.readyToSolve) {
            DependencyNode dependencyNode8 = this.end;
            if (dependencyNode8.readyToSolve) {
                if (dependencyNode7.resolved && dependencyNode8.resolved && this.mDimension.resolved) {
                    return;
                }
                if (!this.mDimension.resolved && this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    ConstraintWidget constraintWidget6 = this.mWidget;
                    if (constraintWidget6.mMatchConstraintDefaultWidth == 0 && !constraintWidget6.isInHorizontalChain()) {
                        DependencyNode dependencyNode9 = this.start.mTargets.get(0);
                        DependencyNode dependencyNode10 = this.end.mTargets.get(0);
                        int i24 = dependencyNode9.value;
                        DependencyNode dependencyNode11 = this.start;
                        int i25 = i24 + dependencyNode11.mMargin;
                        int i26 = dependencyNode10.value + this.end.mMargin;
                        dependencyNode11.resolve(i25);
                        this.end.resolve(i26);
                        this.mDimension.resolve(i26 - i25);
                        return;
                    }
                }
                if (!this.mDimension.resolved && this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.matchConstraintsType == 1 && this.start.mTargets.size() > 0 && this.end.mTargets.size() > 0) {
                    int iMin = Math.min((this.end.mTargets.get(0).value + this.end.mMargin) - (this.start.mTargets.get(0).value + this.start.mMargin), this.mDimension.wrapValue);
                    ConstraintWidget constraintWidget7 = this.mWidget;
                    int i27 = constraintWidget7.mMatchConstraintMaxWidth;
                    int iMax = Math.max(constraintWidget7.mMatchConstraintMinWidth, iMin);
                    if (i27 > 0) {
                        iMax = Math.min(i27, iMax);
                    }
                    this.mDimension.resolve(iMax);
                }
                if (this.mDimension.resolved) {
                    DependencyNode dependencyNode12 = this.start.mTargets.get(0);
                    DependencyNode dependencyNode13 = this.end.mTargets.get(0);
                    int i28 = dependencyNode12.value + this.start.mMargin;
                    int i29 = dependencyNode13.value + this.end.mMargin;
                    float horizontalBiasPercent = this.mWidget.getHorizontalBiasPercent();
                    if (dependencyNode12 == dependencyNode13) {
                        i28 = dependencyNode12.value;
                        i29 = dependencyNode13.value;
                        horizontalBiasPercent = 0.5f;
                    }
                    this.start.resolve((int) (i28 + 0.5f + (((i29 - i28) - this.mDimension.value) * horizontalBiasPercent)));
                    this.end.resolve(this.start.value + this.mDimension.value);
                }
            }
        }
    }

    public HorizontalWidgetRun(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.start.mType = DependencyNode.Type.LEFT;
        this.end.mType = DependencyNode.Type.RIGHT;
        this.orientation = 0;
    }
}
