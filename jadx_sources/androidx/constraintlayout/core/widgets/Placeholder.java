package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;

/* JADX INFO: loaded from: classes23.dex */
public class Placeholder extends VirtualLayout {
    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z11) {
        super.addToSolver(linearSystem, z11);
        if (this.mWidgetsCount > 0) {
            ConstraintWidget constraintWidget = this.mWidgets[0];
            constraintWidget.resetAllConstraints();
            ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
            constraintWidget.connect(type, this, type);
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
            constraintWidget.connect(type2, this, type2);
            ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
            constraintWidget.connect(type3, this, type3);
            ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
            constraintWidget.connect(type4, this, type4);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    public void measure(int i11, int i12, int i13, int i14) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        boolean z11 = false;
        if (this.mWidgetsCount > 0) {
            paddingLeft += this.mWidgets[0].getWidth();
            paddingTop += this.mWidgets[0].getHeight();
        }
        int iMax = Math.max(getMinWidth(), paddingLeft);
        int iMax2 = Math.max(getMinHeight(), paddingTop);
        if (i11 != 1073741824) {
            if (i11 == Integer.MIN_VALUE) {
                i12 = Math.min(iMax, i12);
            } else if (i11 == 0) {
                i12 = iMax;
            } else {
                i12 = 0;
            }
        }
        if (i13 != 1073741824) {
            if (i13 == Integer.MIN_VALUE) {
                i14 = Math.min(iMax2, i14);
            } else if (i13 == 0) {
                i14 = iMax2;
            } else {
                i14 = 0;
            }
        }
        setMeasure(i12, i14);
        setWidth(i12);
        setHeight(i14);
        if (this.mWidgetsCount > 0) {
            z11 = true;
        }
        needsCallbackFromSolver(z11);
    }
}
