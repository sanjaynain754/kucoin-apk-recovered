package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends HelperWidget {
    public static final int BOTTOM = 3;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int TOP = 2;
    private static final boolean USE_RELAX_GONE = false;
    private static final boolean USE_RESOLUTION = true;
    private int mBarrierType = 0;
    private boolean mAllowsGoneWidget = true;
    private int mMargin = 0;
    boolean mResolved = false;

    public Barrier() {
    }

    public boolean allSolved() {
        int i11;
        int i12;
        int i13;
        boolean z11 = true;
        int i14 = 0;
        while (true) {
            i11 = this.mWidgetsCount;
            if (i14 >= i11) {
                break;
            }
            ConstraintWidget constraintWidget = this.mWidgets[i14];
            if ((this.mAllowsGoneWidget || constraintWidget.allowedInBarrier()) && ((((i12 = this.mBarrierType) == 0 || i12 == 1) && !constraintWidget.isResolvedHorizontally()) || (((i13 = this.mBarrierType) == 2 || i13 == 3) && !constraintWidget.isResolvedVertically()))) {
                z11 = false;
            }
            i14++;
        }
        if (!z11 || i11 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z12 = false;
        for (int i15 = 0; i15 < this.mWidgetsCount; i15++) {
            ConstraintWidget constraintWidget2 = this.mWidgets[i15];
            if (this.mAllowsGoneWidget || constraintWidget2.allowedInBarrier()) {
                if (!z12) {
                    int i16 = this.mBarrierType;
                    if (i16 == 0) {
                        iMax = constraintWidget2.getAnchor(ConstraintAnchor.Type.LEFT).getFinalValue();
                    } else if (i16 == 1) {
                        iMax = constraintWidget2.getAnchor(ConstraintAnchor.Type.RIGHT).getFinalValue();
                    } else if (i16 == 2) {
                        iMax = constraintWidget2.getAnchor(ConstraintAnchor.Type.TOP).getFinalValue();
                    } else if (i16 == 3) {
                        iMax = constraintWidget2.getAnchor(ConstraintAnchor.Type.BOTTOM).getFinalValue();
                    }
                    z12 = true;
                }
                int i17 = this.mBarrierType;
                if (i17 == 0) {
                    iMax = Math.min(iMax, constraintWidget2.getAnchor(ConstraintAnchor.Type.LEFT).getFinalValue());
                } else if (i17 == 1) {
                    iMax = Math.max(iMax, constraintWidget2.getAnchor(ConstraintAnchor.Type.RIGHT).getFinalValue());
                } else if (i17 == 2) {
                    iMax = Math.min(iMax, constraintWidget2.getAnchor(ConstraintAnchor.Type.TOP).getFinalValue());
                } else if (i17 == 3) {
                    iMax = Math.max(iMax, constraintWidget2.getAnchor(ConstraintAnchor.Type.BOTTOM).getFinalValue());
                }
            }
        }
        int i18 = iMax + this.mMargin;
        int i19 = this.mBarrierType;
        if (i19 == 0 || i19 == 1) {
            setFinalHorizontal(i18, i18);
        } else {
            setFinalVertical(i18, i18);
        }
        this.mResolved = true;
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean allowedInBarrier() {
        return true;
    }

    public void markWidgets() {
        for (int i11 = 0; i11 < this.mWidgetsCount; i11++) {
            ConstraintWidget constraintWidget = this.mWidgets[i11];
            if (this.mAllowsGoneWidget || constraintWidget.allowedInBarrier()) {
                int i12 = this.mBarrierType;
                if (i12 == 0 || i12 == 1) {
                    constraintWidget.setInBarrier(0, true);
                } else if (i12 == 2 || i12 == 3) {
                    constraintWidget.setInBarrier(1, true);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z11) {
        ConstraintAnchor[] constraintAnchorArr;
        boolean z12;
        int i11;
        int i12;
        int i13;
        ConstraintAnchor[] constraintAnchorArr2 = this.mListAnchors;
        constraintAnchorArr2[0] = this.mLeft;
        constraintAnchorArr2[2] = this.mTop;
        constraintAnchorArr2[1] = this.mRight;
        constraintAnchorArr2[3] = this.mBottom;
        int i14 = 0;
        while (true) {
            constraintAnchorArr = this.mListAnchors;
            if (i14 >= constraintAnchorArr.length) {
                break;
            }
            ConstraintAnchor constraintAnchor = constraintAnchorArr[i14];
            constraintAnchor.mSolverVariable = linearSystem.createObjectVariable(constraintAnchor);
            i14++;
        }
        int i15 = this.mBarrierType;
        if (i15 < 0 || i15 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i15];
        if (!this.mResolved) {
            allSolved();
        }
        if (this.mResolved) {
            this.mResolved = false;
            int i16 = this.mBarrierType;
            if (i16 == 0 || i16 == 1) {
                linearSystem.addEquality(this.mLeft.mSolverVariable, this.f2200mX);
                linearSystem.addEquality(this.mRight.mSolverVariable, this.f2200mX);
                return;
            } else {
                if (i16 == 2 || i16 == 3) {
                    linearSystem.addEquality(this.mTop.mSolverVariable, this.f2201mY);
                    linearSystem.addEquality(this.mBottom.mSolverVariable, this.f2201mY);
                    return;
                }
                return;
            }
        }
        int i17 = 0;
        while (true) {
            if (i17 >= this.mWidgetsCount) {
                z12 = false;
                break;
            }
            ConstraintWidget constraintWidget = this.mWidgets[i17];
            if ((this.mAllowsGoneWidget || constraintWidget.allowedInBarrier()) && ((((i12 = this.mBarrierType) == 0 || i12 == 1) && constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mLeft.mTarget != null && constraintWidget.mRight.mTarget != null) || (((i13 = this.mBarrierType) == 2 || i13 == 3) && constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mTop.mTarget != null && constraintWidget.mBottom.mTarget != null))) {
                z12 = true;
                break;
            }
            i17++;
        }
        boolean z13 = this.mLeft.hasCenteredDependents() || this.mRight.hasCenteredDependents();
        boolean z14 = this.mTop.hasCenteredDependents() || this.mBottom.hasCenteredDependents();
        int i18 = !(!z12 && (((i11 = this.mBarrierType) == 0 && z13) || ((i11 == 2 && z14) || ((i11 == 1 && z13) || (i11 == 3 && z14))))) ? 4 : 5;
        for (int i19 = 0; i19 < this.mWidgetsCount; i19++) {
            ConstraintWidget constraintWidget2 = this.mWidgets[i19];
            if (this.mAllowsGoneWidget || constraintWidget2.allowedInBarrier()) {
                SolverVariable solverVariableCreateObjectVariable = linearSystem.createObjectVariable(constraintWidget2.mListAnchors[this.mBarrierType]);
                ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.mListAnchors;
                int i21 = this.mBarrierType;
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr3[i21];
                constraintAnchor3.mSolverVariable = solverVariableCreateObjectVariable;
                ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
                int i22 = (constraintAnchor4 == null || constraintAnchor4.mOwner != this) ? 0 : constraintAnchor3.mMargin;
                if (i21 == 0 || i21 == 2) {
                    linearSystem.addLowerBarrier(constraintAnchor2.mSolverVariable, solverVariableCreateObjectVariable, this.mMargin - i22, z12);
                } else {
                    linearSystem.addGreaterBarrier(constraintAnchor2.mSolverVariable, solverVariableCreateObjectVariable, this.mMargin + i22, z12);
                }
                linearSystem.addEquality(constraintAnchor2.mSolverVariable, solverVariableCreateObjectVariable, this.mMargin + i22, i18);
            }
        }
        int i23 = this.mBarrierType;
        if (i23 == 0) {
            linearSystem.addEquality(this.mRight.mSolverVariable, this.mLeft.mSolverVariable, 0, 8);
            linearSystem.addEquality(this.mLeft.mSolverVariable, this.mParent.mRight.mSolverVariable, 0, 4);
            linearSystem.addEquality(this.mLeft.mSolverVariable, this.mParent.mLeft.mSolverVariable, 0, 0);
            return;
        }
        if (i23 == 1) {
            linearSystem.addEquality(this.mLeft.mSolverVariable, this.mRight.mSolverVariable, 0, 8);
            linearSystem.addEquality(this.mLeft.mSolverVariable, this.mParent.mLeft.mSolverVariable, 0, 4);
            linearSystem.addEquality(this.mLeft.mSolverVariable, this.mParent.mRight.mSolverVariable, 0, 0);
        } else if (i23 == 2) {
            linearSystem.addEquality(this.mBottom.mSolverVariable, this.mTop.mSolverVariable, 0, 8);
            linearSystem.addEquality(this.mTop.mSolverVariable, this.mParent.mBottom.mSolverVariable, 0, 4);
            linearSystem.addEquality(this.mTop.mSolverVariable, this.mParent.mTop.mSolverVariable, 0, 0);
        } else if (i23 == 3) {
            linearSystem.addEquality(this.mTop.mSolverVariable, this.mBottom.mSolverVariable, 0, 8);
            linearSystem.addEquality(this.mTop.mSolverVariable, this.mParent.mTop.mSolverVariable, 0, 4);
            linearSystem.addEquality(this.mTop.mSolverVariable, this.mParent.mBottom.mSolverVariable, 0, 0);
        }
    }

    @Deprecated
    public boolean allowsGoneWidget() {
        return this.mAllowsGoneWidget;
    }

    public boolean getAllowsGoneWidget() {
        return this.mAllowsGoneWidget;
    }

    public int getBarrierType() {
        return this.mBarrierType;
    }

    public int getMargin() {
        return this.mMargin;
    }

    public int getOrientation() {
        int i11 = this.mBarrierType;
        if (i11 == 0 || i11 == 1) {
            return 0;
        }
        return (i11 == 2 || i11 == 3) ? 1 : -1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedHorizontally() {
        return this.mResolved;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedVertically() {
        return this.mResolved;
    }

    public void setAllowsGoneWidget(boolean z11) {
        this.mAllowsGoneWidget = z11;
    }

    public void setBarrierType(int i11) {
        this.mBarrierType = i11;
    }

    public void setMargin(int i11) {
        this.mMargin = i11;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String toString() {
        String str = "[Barrier] " + getDebugName() + " {";
        for (int i11 = 0; i11 < this.mWidgetsCount; i11++) {
            ConstraintWidget constraintWidget = this.mWidgets[i11];
            if (i11 > 0) {
                str = str + ", ";
            }
            str = str + constraintWidget.getDebugName();
        }
        return str + "}";
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.copy(constraintWidget, map);
        Barrier barrier = (Barrier) constraintWidget;
        this.mBarrierType = barrier.mBarrierType;
        this.mAllowsGoneWidget = barrier.mAllowsGoneWidget;
        this.mMargin = barrier.mMargin;
    }

    public Barrier(String str) {
        setDebugName(str);
    }
}
