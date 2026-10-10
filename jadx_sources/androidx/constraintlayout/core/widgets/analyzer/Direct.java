package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ChainHead;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class Direct {
    private static final boolean APPLY_MATCH_PARENT = false;
    private static final boolean DEBUG = false;
    private static final boolean EARLY_TERMINATION = true;
    private static BasicMeasure.Measure sMeasure = new BasicMeasure.Measure();
    private static int sHcount = 0;
    private static int sVcount = 0;

    /* JADX WARN: Code duplicated, block: B:102:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:106:0x01db  */
    /* JADX WARN: Code duplicated, block: B:108:0x01df  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x01e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x01eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:115:0x020e  */
    /* JADX WARN: Code duplicated, block: B:117:0x022f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:119:0x0232 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0127  */
    /* JADX WARN: Code duplicated, block: B:78:0x012c  */
    /* JADX WARN: Code duplicated, block: B:81:0x013a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0143  */
    /* JADX WARN: Code duplicated, block: B:85:0x0154 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0156  */
    /* JADX WARN: Code duplicated, block: B:88:0x015d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0165 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0167  */
    /* JADX WARN: Code duplicated, block: B:92:0x0172  */
    /* JADX WARN: Code duplicated, block: B:94:0x0181  */
    /* JADX WARN: Code duplicated, block: B:96:0x018c  */
    /* JADX WARN: Code duplicated, block: B:98:0x01a2  */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7, types: [boolean, int] */
    public static boolean solveChain(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i11, int i12, ChainHead chainHead, boolean z11, boolean z12, boolean z13) {
        int i13;
        int margin;
        boolean z14;
        ConstraintWidget constraintWidget;
        ?? r11;
        int margin2;
        int height;
        ConstraintAnchor constraintAnchor;
        ConstraintWidget constraintWidget2;
        ConstraintAnchor constraintAnchor2;
        float verticalBiasPercent;
        int i14;
        if (z13) {
            return false;
        }
        if (i11 == 0) {
            if (!constraintWidgetContainer.isResolvedHorizontally()) {
                return false;
            }
        } else if (!constraintWidgetContainer.isResolvedVertically()) {
            return false;
        }
        boolean zIsRtl = constraintWidgetContainer.isRtl();
        ConstraintWidget first = chainHead.getFirst();
        ConstraintWidget last = chainHead.getLast();
        ConstraintWidget firstVisibleWidget = chainHead.getFirstVisibleWidget();
        ConstraintWidget lastVisibleWidget = chainHead.getLastVisibleWidget();
        ConstraintWidget head = chainHead.getHead();
        ConstraintAnchor constraintAnchor3 = first.mListAnchors[i12];
        int i15 = i12 + 1;
        ConstraintAnchor constraintAnchor4 = last.mListAnchors[i15];
        ConstraintAnchor constraintAnchor5 = constraintAnchor3.mTarget;
        if (constraintAnchor5 == null || constraintAnchor4.mTarget == null) {
            return false;
        }
        if (!constraintAnchor5.hasFinalValue() || !constraintAnchor4.mTarget.hasFinalValue()) {
            return false;
        }
        if (firstVisibleWidget == null || lastVisibleWidget == null) {
            return false;
        }
        int finalValue = constraintAnchor3.mTarget.getFinalValue() + firstVisibleWidget.mListAnchors[i12].getMargin();
        int finalValue2 = constraintAnchor4.mTarget.getFinalValue() - lastVisibleWidget.mListAnchors[i15].getMargin();
        int i16 = finalValue2 - finalValue;
        if (i16 <= 0) {
            return false;
        }
        BasicMeasure.Measure measure = new BasicMeasure.Measure();
        boolean z15 = false;
        int i17 = 0;
        int i18 = 0;
        int margin3 = 0;
        boolean z16 = false;
        ConstraintWidget constraintWidget3 = first;
        while (true) {
            ConstraintWidget constraintWidget4 = null;
            if (z15) {
                ConstraintWidget constraintWidget5 = first;
                ConstraintWidget constraintWidget6 = head;
                if (i17 == 0 || i17 != i18 || i16 < margin3) {
                    return false;
                }
                int i19 = i16 - margin3;
                if (!z11) {
                    if (z12 && i17 > 2) {
                        i13 = 1;
                        i19 = (i19 / i17) - 1;
                    }
                    if (i17 == i13) {
                        if (i11 == 0) {
                            verticalBiasPercent = constraintWidget6.getHorizontalBiasPercent();
                        } else {
                            verticalBiasPercent = constraintWidget6.getVerticalBiasPercent();
                        }
                        i14 = (int) (finalValue + 0.5f + (i19 * verticalBiasPercent));
                        if (i11 == 0) {
                            firstVisibleWidget.setFinalHorizontal(i14, firstVisibleWidget.getWidth() + i14);
                        } else {
                            firstVisibleWidget.setFinalVertical(i14, firstVisibleWidget.getHeight() + i14);
                        }
                        horizontalSolvingPass(1, firstVisibleWidget, constraintWidgetContainer.getMeasurer(), zIsRtl);
                        return true;
                    }
                    if (z11) {
                        if (z12) {
                            return true;
                        }
                        if (i17 == 2) {
                            return false;
                        }
                        if (i11 == 0) {
                            firstVisibleWidget.setFinalHorizontal(finalValue, firstVisibleWidget.getWidth() + finalValue);
                            lastVisibleWidget.setFinalHorizontal(finalValue2 - lastVisibleWidget.getWidth(), finalValue2);
                            horizontalSolvingPass(1, firstVisibleWidget, constraintWidgetContainer.getMeasurer(), zIsRtl);
                            horizontalSolvingPass(1, lastVisibleWidget, constraintWidgetContainer.getMeasurer(), zIsRtl);
                            return true;
                        }
                        firstVisibleWidget.setFinalVertical(finalValue, firstVisibleWidget.getHeight() + finalValue);
                        lastVisibleWidget.setFinalVertical(finalValue2 - lastVisibleWidget.getHeight(), finalValue2);
                        verticalSolvingPass(1, firstVisibleWidget, constraintWidgetContainer.getMeasurer());
                        verticalSolvingPass(1, lastVisibleWidget, constraintWidgetContainer.getMeasurer());
                        return true;
                    }
                    margin = finalValue + i19;
                    z14 = false;
                    constraintWidget = constraintWidget5;
                    while (!z14) {
                        if (constraintWidget.getVisibility() == 8) {
                            margin2 = margin + constraintWidget.mListAnchors[i12].getMargin();
                            if (i11 == 0) {
                                r11 = i13;
                                constraintWidget.setFinalHorizontal(margin2, constraintWidget.getWidth() + margin2);
                                horizontalSolvingPass(1, constraintWidget, constraintWidgetContainer.getMeasurer(), zIsRtl);
                                height = constraintWidget.getWidth();
                            } else {
                                r11 = i13;
                                constraintWidget.setFinalVertical(margin2, constraintWidget.getHeight() + margin2);
                                verticalSolvingPass(1, constraintWidget, constraintWidgetContainer.getMeasurer());
                                height = constraintWidget.getHeight();
                            }
                            margin = margin2 + height + constraintWidget.mListAnchors[i15].getMargin() + i19;
                        } else if (i11 == 0) {
                            constraintWidget.setFinalHorizontal(margin, margin);
                            horizontalSolvingPass(r11, constraintWidget, constraintWidgetContainer.getMeasurer(), zIsRtl);
                        } else {
                            constraintWidget.setFinalVertical(margin, margin);
                            verticalSolvingPass(r11, constraintWidget, constraintWidgetContainer.getMeasurer());
                        }
                        constraintWidget.addToSolver(linearSystem, z16);
                        constraintAnchor = constraintWidget.mListAnchors[i15].mTarget;
                        if (constraintAnchor != null) {
                            constraintWidget2 = constraintAnchor.mOwner;
                            constraintAnchor2 = constraintWidget2.mListAnchors[i12].mTarget;
                            if (constraintAnchor2 != null || constraintAnchor2.mOwner != constraintWidget) {
                                constraintWidget2 = null;
                            }
                        } else {
                            constraintWidget2 = null;
                        }
                        if (constraintWidget2 != null) {
                            constraintWidget = constraintWidget2;
                        } else {
                            z14 = true;
                        }
                        r11 = 1;
                        z16 = false;
                    }
                    r11 = i13;
                    return r11;
                }
                i19 /= i17 + 1;
                i13 = 1;
                if (i17 == i13) {
                    if (i11 == 0) {
                        verticalBiasPercent = constraintWidget6.getHorizontalBiasPercent();
                    } else {
                        verticalBiasPercent = constraintWidget6.getVerticalBiasPercent();
                    }
                    i14 = (int) (finalValue + 0.5f + (i19 * verticalBiasPercent));
                    if (i11 == 0) {
                        firstVisibleWidget.setFinalHorizontal(i14, firstVisibleWidget.getWidth() + i14);
                    } else {
                        firstVisibleWidget.setFinalVertical(i14, firstVisibleWidget.getHeight() + i14);
                    }
                    horizontalSolvingPass(1, firstVisibleWidget, constraintWidgetContainer.getMeasurer(), zIsRtl);
                    return true;
                }
                if (z11) {
                    if (z12) {
                        return true;
                    }
                    if (i17 == 2) {
                        return false;
                    }
                    if (i11 == 0) {
                        firstVisibleWidget.setFinalHorizontal(finalValue, firstVisibleWidget.getWidth() + finalValue);
                        lastVisibleWidget.setFinalHorizontal(finalValue2 - lastVisibleWidget.getWidth(), finalValue2);
                        horizontalSolvingPass(1, firstVisibleWidget, constraintWidgetContainer.getMeasurer(), zIsRtl);
                        horizontalSolvingPass(1, lastVisibleWidget, constraintWidgetContainer.getMeasurer(), zIsRtl);
                        return true;
                    }
                    firstVisibleWidget.setFinalVertical(finalValue, firstVisibleWidget.getHeight() + finalValue);
                    lastVisibleWidget.setFinalVertical(finalValue2 - lastVisibleWidget.getHeight(), finalValue2);
                    verticalSolvingPass(1, firstVisibleWidget, constraintWidgetContainer.getMeasurer());
                    verticalSolvingPass(1, lastVisibleWidget, constraintWidgetContainer.getMeasurer());
                    return true;
                }
                margin = finalValue + i19;
                z14 = false;
                constraintWidget = constraintWidget5;
                while (!z14) {
                    if (constraintWidget.getVisibility() == 8) {
                        margin2 = margin + constraintWidget.mListAnchors[i12].getMargin();
                        if (i11 == 0) {
                            r11 = i13;
                            constraintWidget.setFinalHorizontal(margin2, constraintWidget.getWidth() + margin2);
                            horizontalSolvingPass(1, constraintWidget, constraintWidgetContainer.getMeasurer(), zIsRtl);
                            height = constraintWidget.getWidth();
                        } else {
                            r11 = i13;
                            constraintWidget.setFinalVertical(margin2, constraintWidget.getHeight() + margin2);
                            verticalSolvingPass(1, constraintWidget, constraintWidgetContainer.getMeasurer());
                            height = constraintWidget.getHeight();
                        }
                        margin = margin2 + height + constraintWidget.mListAnchors[i15].getMargin() + i19;
                    } else if (i11 == 0) {
                        constraintWidget.setFinalHorizontal(margin, margin);
                        horizontalSolvingPass(r11, constraintWidget, constraintWidgetContainer.getMeasurer(), zIsRtl);
                    } else {
                        constraintWidget.setFinalVertical(margin, margin);
                        verticalSolvingPass(r11, constraintWidget, constraintWidgetContainer.getMeasurer());
                    }
                    constraintWidget.addToSolver(linearSystem, z16);
                    constraintAnchor = constraintWidget.mListAnchors[i15].mTarget;
                    if (constraintAnchor != null) {
                        constraintWidget2 = constraintAnchor.mOwner;
                        constraintAnchor2 = constraintWidget2.mListAnchors[i12].mTarget;
                        if (constraintAnchor2 != null) {
                            constraintWidget2 = null;
                        } else {
                            constraintWidget2 = null;
                        }
                    } else {
                        constraintWidget2 = null;
                    }
                    if (constraintWidget2 != null) {
                        constraintWidget = constraintWidget2;
                    } else {
                        z14 = true;
                    }
                    r11 = 1;
                    z16 = false;
                }
                r11 = i13;
                return r11;
            }
            if (!canMeasure(1, constraintWidget3)) {
                return false;
            }
            ConstraintWidget constraintWidget7 = first;
            if (constraintWidget3.mListDimensionBehaviors[i11] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                return false;
            }
            if (constraintWidget3.isMeasureRequested()) {
                ConstraintWidgetContainer.measure(1, constraintWidget3, constraintWidgetContainer.getMeasurer(), measure, BasicMeasure.Measure.SELF_DIMENSIONS);
            }
            margin3 = margin3 + constraintWidget3.mListAnchors[i12].getMargin() + (i11 == 0 ? constraintWidget3.getWidth() : constraintWidget3.getHeight()) + constraintWidget3.mListAnchors[i15].getMargin();
            i18++;
            if (constraintWidget3.getVisibility() != 8) {
                i17++;
            }
            ConstraintAnchor constraintAnchor6 = constraintWidget3.mListAnchors[i15].mTarget;
            if (constraintAnchor6 != null) {
                ConstraintWidget constraintWidget8 = constraintAnchor6.mOwner;
                ConstraintAnchor constraintAnchor7 = constraintWidget8.mListAnchors[i12].mTarget;
                if (constraintAnchor7 != null && constraintAnchor7.mOwner == constraintWidget3) {
                    constraintWidget4 = constraintWidget8;
                }
            }
            if (constraintWidget4 != null) {
                constraintWidget3 = constraintWidget4;
            } else {
                z15 = true;
            }
            first = constraintWidget7;
            head = head;
        }
    }

    private static void horizontalSolvingPass(int i11, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, boolean z11) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.isHorizontalSolvingPassDone()) {
            return;
        }
        boolean z12 = true;
        sHcount++;
        if (!(constraintWidget instanceof ConstraintWidgetContainer) && constraintWidget.isMeasureRequested()) {
            int i12 = i11 + 1;
            if (canMeasure(i12, constraintWidget)) {
                ConstraintWidgetContainer.measure(i12, constraintWidget, measurer, new BasicMeasure.Measure(), BasicMeasure.Measure.SELF_DIMENSIONS);
            }
        }
        ConstraintAnchor anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor anchor2 = constraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT);
        int finalValue = anchor.getFinalValue();
        int finalValue2 = anchor2.getFinalValue();
        if (anchor.getDependents() != null && anchor.hasFinalValue()) {
            Iterator<ConstraintAnchor> it = anchor.getDependents().iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.mOwner;
                int i13 = i11 + 1;
                boolean zCanMeasure = canMeasure(i13, constraintWidget2);
                if (constraintWidget2.isMeasureRequested() && zCanMeasure) {
                    ConstraintWidgetContainer.measure(i13, constraintWidget2, measurer, new BasicMeasure.Measure(), BasicMeasure.Measure.SELF_DIMENSIONS);
                }
                boolean z13 = ((next == constraintWidget2.mLeft && (constraintAnchor4 = constraintWidget2.mRight.mTarget) != null && constraintAnchor4.hasFinalValue()) || (next == constraintWidget2.mRight && (constraintAnchor3 = constraintWidget2.mLeft.mTarget) != null && constraintAnchor3.hasFinalValue())) ? z12 : false;
                ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = constraintWidget2.getHorizontalDimensionBehaviour();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (horizontalDimensionBehaviour != dimensionBehaviour || zCanMeasure) {
                    if (!constraintWidget2.isMeasureRequested()) {
                        ConstraintAnchor constraintAnchor5 = constraintWidget2.mLeft;
                        if (next == constraintAnchor5 && constraintWidget2.mRight.mTarget == null) {
                            int margin = constraintAnchor5.getMargin() + finalValue;
                            constraintWidget2.setFinalHorizontal(margin, constraintWidget2.getWidth() + margin);
                            horizontalSolvingPass(i13, constraintWidget2, measurer, z11);
                        } else {
                            ConstraintAnchor constraintAnchor6 = constraintWidget2.mRight;
                            if (next == constraintAnchor6 && constraintAnchor5.mTarget == null) {
                                int margin2 = finalValue - constraintAnchor6.getMargin();
                                constraintWidget2.setFinalHorizontal(margin2 - constraintWidget2.getWidth(), margin2);
                                horizontalSolvingPass(i13, constraintWidget2, measurer, z11);
                            } else if (z13 && !constraintWidget2.isInHorizontalChain()) {
                                solveHorizontalCenterConstraints(i13, measurer, constraintWidget2, z11);
                            }
                        }
                    }
                } else if (constraintWidget2.getHorizontalDimensionBehaviour() == dimensionBehaviour && constraintWidget2.mMatchConstraintMaxWidth >= 0 && constraintWidget2.mMatchConstraintMinWidth >= 0 && ((constraintWidget2.getVisibility() == 8 || (constraintWidget2.mMatchConstraintDefaultWidth == 0 && constraintWidget2.getDimensionRatio() == 0.0f)) && !constraintWidget2.isInHorizontalChain() && !constraintWidget2.isInVirtualLayout() && z13 && !constraintWidget2.isInHorizontalChain())) {
                    solveHorizontalMatchConstraint(i13, constraintWidget, measurer, constraintWidget2, z11);
                }
                z12 = z12;
            }
        }
        boolean z14 = z12;
        if (constraintWidget instanceof Guideline) {
            return;
        }
        if (anchor2.getDependents() != null && anchor2.hasFinalValue()) {
            Iterator<ConstraintAnchor> it2 = anchor2.getDependents().iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.mOwner;
                int i14 = i11 + 1;
                boolean zCanMeasure2 = canMeasure(i14, constraintWidget3);
                if (constraintWidget3.isMeasureRequested() && zCanMeasure2) {
                    ConstraintWidgetContainer.measure(i14, constraintWidget3, measurer, new BasicMeasure.Measure(), BasicMeasure.Measure.SELF_DIMENSIONS);
                }
                boolean z15 = ((next2 == constraintWidget3.mLeft && (constraintAnchor2 = constraintWidget3.mRight.mTarget) != null && constraintAnchor2.hasFinalValue()) || (next2 == constraintWidget3.mRight && (constraintAnchor = constraintWidget3.mLeft.mTarget) != null && constraintAnchor.hasFinalValue())) ? z14 : false;
                ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour2 = constraintWidget3.getHorizontalDimensionBehaviour();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (horizontalDimensionBehaviour2 != dimensionBehaviour2 || zCanMeasure2) {
                    if (!constraintWidget3.isMeasureRequested()) {
                        ConstraintAnchor constraintAnchor7 = constraintWidget3.mLeft;
                        if (next2 == constraintAnchor7 && constraintWidget3.mRight.mTarget == null) {
                            int margin3 = constraintAnchor7.getMargin() + finalValue2;
                            constraintWidget3.setFinalHorizontal(margin3, constraintWidget3.getWidth() + margin3);
                            horizontalSolvingPass(i14, constraintWidget3, measurer, z11);
                        } else {
                            ConstraintAnchor constraintAnchor8 = constraintWidget3.mRight;
                            if (next2 == constraintAnchor8 && constraintAnchor7.mTarget == null) {
                                int margin4 = finalValue2 - constraintAnchor8.getMargin();
                                constraintWidget3.setFinalHorizontal(margin4 - constraintWidget3.getWidth(), margin4);
                                horizontalSolvingPass(i14, constraintWidget3, measurer, z11);
                            } else if (z15 && !constraintWidget3.isInHorizontalChain()) {
                                solveHorizontalCenterConstraints(i14, measurer, constraintWidget3, z11);
                            }
                        }
                    }
                } else if (constraintWidget3.getHorizontalDimensionBehaviour() == dimensionBehaviour2 && constraintWidget3.mMatchConstraintMaxWidth >= 0 && constraintWidget3.mMatchConstraintMinWidth >= 0 && (constraintWidget3.getVisibility() == 8 || (constraintWidget3.mMatchConstraintDefaultWidth == 0 && constraintWidget3.getDimensionRatio() == 0.0f))) {
                    if (!constraintWidget3.isInHorizontalChain() && !constraintWidget3.isInVirtualLayout() && z15 && !constraintWidget3.isInHorizontalChain()) {
                        solveHorizontalMatchConstraint(i14, constraintWidget, measurer, constraintWidget3, z11);
                    }
                }
            }
        }
        constraintWidget.markHorizontalSolvingPassDone();
    }

    /* JADX INFO: renamed from: ls */
    public static String m2270ls(int i11) {
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append("  ");
        }
        sb2.append("+-(" + i11 + ") ");
        return sb2.toString();
    }

    private static void verticalSolvingPass(int i11, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.isVerticalSolvingPassDone()) {
            return;
        }
        boolean z11 = true;
        sVcount++;
        if (!(constraintWidget instanceof ConstraintWidgetContainer) && constraintWidget.isMeasureRequested()) {
            int i12 = i11 + 1;
            if (canMeasure(i12, constraintWidget)) {
                ConstraintWidgetContainer.measure(i12, constraintWidget, measurer, new BasicMeasure.Measure(), BasicMeasure.Measure.SELF_DIMENSIONS);
            }
        }
        ConstraintAnchor anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.TOP);
        ConstraintAnchor anchor2 = constraintWidget.getAnchor(ConstraintAnchor.Type.BOTTOM);
        int finalValue = anchor.getFinalValue();
        int finalValue2 = anchor2.getFinalValue();
        if (anchor.getDependents() != null && anchor.hasFinalValue()) {
            Iterator<ConstraintAnchor> it = anchor.getDependents().iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.mOwner;
                int i13 = i11 + 1;
                boolean zCanMeasure = canMeasure(i13, constraintWidget2);
                if (constraintWidget2.isMeasureRequested() && zCanMeasure) {
                    ConstraintWidgetContainer.measure(i13, constraintWidget2, measurer, new BasicMeasure.Measure(), BasicMeasure.Measure.SELF_DIMENSIONS);
                }
                boolean z12 = ((next == constraintWidget2.mTop && (constraintAnchor4 = constraintWidget2.mBottom.mTarget) != null && constraintAnchor4.hasFinalValue()) || (next == constraintWidget2.mBottom && (constraintAnchor3 = constraintWidget2.mTop.mTarget) != null && constraintAnchor3.hasFinalValue())) ? z11 : false;
                ConstraintWidget.DimensionBehaviour verticalDimensionBehaviour = constraintWidget2.getVerticalDimensionBehaviour();
                boolean z13 = z11;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (verticalDimensionBehaviour != dimensionBehaviour || zCanMeasure) {
                    if (!constraintWidget2.isMeasureRequested()) {
                        ConstraintAnchor constraintAnchor5 = constraintWidget2.mTop;
                        if (next == constraintAnchor5 && constraintWidget2.mBottom.mTarget == null) {
                            int margin = constraintAnchor5.getMargin() + finalValue;
                            constraintWidget2.setFinalVertical(margin, constraintWidget2.getHeight() + margin);
                            verticalSolvingPass(i13, constraintWidget2, measurer);
                        } else {
                            ConstraintAnchor constraintAnchor6 = constraintWidget2.mBottom;
                            if (next == constraintAnchor6 && constraintAnchor5.mTarget == null) {
                                int margin2 = finalValue - constraintAnchor6.getMargin();
                                constraintWidget2.setFinalVertical(margin2 - constraintWidget2.getHeight(), margin2);
                                verticalSolvingPass(i13, constraintWidget2, measurer);
                            } else if (z12 && !constraintWidget2.isInVerticalChain()) {
                                solveVerticalCenterConstraints(i13, measurer, constraintWidget2);
                            }
                        }
                    }
                } else if (constraintWidget2.getVerticalDimensionBehaviour() == dimensionBehaviour && constraintWidget2.mMatchConstraintMaxHeight >= 0 && constraintWidget2.mMatchConstraintMinHeight >= 0 && ((constraintWidget2.getVisibility() == 8 || (constraintWidget2.mMatchConstraintDefaultHeight == 0 && constraintWidget2.getDimensionRatio() == 0.0f)) && !constraintWidget2.isInVerticalChain() && !constraintWidget2.isInVirtualLayout() && z12 && !constraintWidget2.isInVerticalChain())) {
                    solveVerticalMatchConstraint(i13, constraintWidget, measurer, constraintWidget2);
                }
                z11 = z13;
            }
        }
        boolean z14 = z11;
        if (constraintWidget instanceof Guideline) {
            return;
        }
        if (anchor2.getDependents() != null && anchor2.hasFinalValue()) {
            Iterator<ConstraintAnchor> it2 = anchor2.getDependents().iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.mOwner;
                int i14 = i11 + 1;
                boolean zCanMeasure2 = canMeasure(i14, constraintWidget3);
                if (constraintWidget3.isMeasureRequested() && zCanMeasure2) {
                    ConstraintWidgetContainer.measure(i14, constraintWidget3, measurer, new BasicMeasure.Measure(), BasicMeasure.Measure.SELF_DIMENSIONS);
                }
                boolean z15 = ((next2 == constraintWidget3.mTop && (constraintAnchor2 = constraintWidget3.mBottom.mTarget) != null && constraintAnchor2.hasFinalValue()) || (next2 == constraintWidget3.mBottom && (constraintAnchor = constraintWidget3.mTop.mTarget) != null && constraintAnchor.hasFinalValue())) ? z14 : false;
                ConstraintWidget.DimensionBehaviour verticalDimensionBehaviour2 = constraintWidget3.getVerticalDimensionBehaviour();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (verticalDimensionBehaviour2 != dimensionBehaviour2 || zCanMeasure2) {
                    if (!constraintWidget3.isMeasureRequested()) {
                        ConstraintAnchor constraintAnchor7 = constraintWidget3.mTop;
                        if (next2 == constraintAnchor7 && constraintWidget3.mBottom.mTarget == null) {
                            int margin3 = constraintAnchor7.getMargin() + finalValue2;
                            constraintWidget3.setFinalVertical(margin3, constraintWidget3.getHeight() + margin3);
                            verticalSolvingPass(i14, constraintWidget3, measurer);
                        } else {
                            ConstraintAnchor constraintAnchor8 = constraintWidget3.mBottom;
                            if (next2 == constraintAnchor8 && constraintAnchor7.mTarget == null) {
                                int margin4 = finalValue2 - constraintAnchor8.getMargin();
                                constraintWidget3.setFinalVertical(margin4 - constraintWidget3.getHeight(), margin4);
                                verticalSolvingPass(i14, constraintWidget3, measurer);
                            } else if (z15 && !constraintWidget3.isInVerticalChain()) {
                                solveVerticalCenterConstraints(i14, measurer, constraintWidget3);
                            }
                        }
                    }
                } else if (constraintWidget3.getVerticalDimensionBehaviour() == dimensionBehaviour2 && constraintWidget3.mMatchConstraintMaxHeight >= 0 && constraintWidget3.mMatchConstraintMinHeight >= 0 && (constraintWidget3.getVisibility() == 8 || (constraintWidget3.mMatchConstraintDefaultHeight == 0 && constraintWidget3.getDimensionRatio() == 0.0f))) {
                    if (!constraintWidget3.isInVerticalChain() && !constraintWidget3.isInVirtualLayout() && z15 && !constraintWidget3.isInVerticalChain()) {
                        solveVerticalMatchConstraint(i14, constraintWidget, measurer, constraintWidget3);
                    }
                }
            }
        }
        ConstraintAnchor anchor3 = constraintWidget.getAnchor(ConstraintAnchor.Type.BASELINE);
        if (anchor3.getDependents() != null && anchor3.hasFinalValue()) {
            int finalValue3 = anchor3.getFinalValue();
            for (ConstraintAnchor constraintAnchor9 : anchor3.getDependents()) {
                ConstraintWidget constraintWidget4 = constraintAnchor9.mOwner;
                int i15 = i11 + 1;
                boolean zCanMeasure3 = canMeasure(i15, constraintWidget4);
                if (constraintWidget4.isMeasureRequested() && zCanMeasure3) {
                    ConstraintWidgetContainer.measure(i15, constraintWidget4, measurer, new BasicMeasure.Measure(), BasicMeasure.Measure.SELF_DIMENSIONS);
                }
                if (constraintWidget4.getVerticalDimensionBehaviour() != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || zCanMeasure3) {
                    if (!constraintWidget4.isMeasureRequested() && constraintAnchor9 == constraintWidget4.mBaseline) {
                        constraintWidget4.setFinalBaseline(constraintAnchor9.getMargin() + finalValue3);
                        verticalSolvingPass(i15, constraintWidget4, measurer);
                    }
                }
            }
        }
        constraintWidget.markVerticalSolvingPassDone();
    }

    private static boolean canMeasure(int i11, ConstraintWidget constraintWidget) {
        ConstraintWidgetContainer constraintWidgetContainer;
        boolean z11;
        boolean z12;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = constraintWidget.getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour verticalDimensionBehaviour = constraintWidget.getVerticalDimensionBehaviour();
        if (constraintWidget.getParent() != null) {
            constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget.getParent();
        } else {
            constraintWidgetContainer = null;
        }
        if (constraintWidgetContainer != null) {
            constraintWidgetContainer.getHorizontalDimensionBehaviour();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (constraintWidgetContainer != null) {
            constraintWidgetContainer.getVerticalDimensionBehaviour();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (horizontalDimensionBehaviour != dimensionBehaviour5 && !constraintWidget.isResolvedHorizontally() && horizontalDimensionBehaviour != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && ((horizontalDimensionBehaviour != (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) || constraintWidget.mMatchConstraintDefaultWidth != 0 || constraintWidget.mDimensionRatio != 0.0f || !constraintWidget.hasDanglingDimension(0)) && (horizontalDimensionBehaviour != dimensionBehaviour2 || constraintWidget.mMatchConstraintDefaultWidth != 1 || !constraintWidget.hasResolvedTargets(0, constraintWidget.getWidth())))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (verticalDimensionBehaviour != dimensionBehaviour5 && !constraintWidget.isResolvedVertically() && verticalDimensionBehaviour != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && ((verticalDimensionBehaviour != (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) || constraintWidget.mMatchConstraintDefaultHeight != 0 || constraintWidget.mDimensionRatio != 0.0f || !constraintWidget.hasDanglingDimension(1)) && (verticalDimensionBehaviour != dimensionBehaviour || constraintWidget.mMatchConstraintDefaultHeight != 1 || !constraintWidget.hasResolvedTargets(1, constraintWidget.getHeight())))) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (constraintWidget.mDimensionRatio > 0.0f && (z11 || z12)) {
            return true;
        }
        if (!z11 || !z12) {
            return false;
        }
        return true;
    }

    private static void solveBarrier(int i11, Barrier barrier, BasicMeasure.Measurer measurer, int i12, boolean z11) {
        if (barrier.allSolved()) {
            if (i12 == 0) {
                horizontalSolvingPass(i11 + 1, barrier, measurer, z11);
            } else {
                verticalSolvingPass(i11 + 1, barrier, measurer);
            }
        }
    }

    private static void solveHorizontalCenterConstraints(int i11, BasicMeasure.Measurer measurer, ConstraintWidget constraintWidget, boolean z11) {
        float f11;
        float horizontalBiasPercent = constraintWidget.getHorizontalBiasPercent();
        int finalValue = constraintWidget.mLeft.mTarget.getFinalValue();
        int finalValue2 = constraintWidget.mRight.mTarget.getFinalValue();
        int margin = constraintWidget.mLeft.getMargin() + finalValue;
        int margin2 = finalValue2 - constraintWidget.mRight.getMargin();
        if (finalValue == finalValue2) {
            horizontalBiasPercent = 0.5f;
        } else {
            finalValue = margin;
            finalValue2 = margin2;
        }
        int width = constraintWidget.getWidth();
        int i12 = (finalValue2 - finalValue) - width;
        if (finalValue > finalValue2) {
            i12 = (finalValue - finalValue2) - width;
        }
        if (i12 > 0) {
            f11 = (horizontalBiasPercent * i12) + 0.5f;
        } else {
            f11 = horizontalBiasPercent * i12;
        }
        int i13 = ((int) f11) + finalValue;
        int i14 = i13 + width;
        if (finalValue > finalValue2) {
            i14 = i13 - width;
        }
        constraintWidget.setFinalHorizontal(i13, i14);
        horizontalSolvingPass(i11 + 1, constraintWidget, measurer, z11);
    }

    private static void solveHorizontalMatchConstraint(int i11, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, ConstraintWidget constraintWidget2, boolean z11) {
        int width;
        float horizontalBiasPercent = constraintWidget2.getHorizontalBiasPercent();
        int finalValue = constraintWidget2.mLeft.mTarget.getFinalValue() + constraintWidget2.mLeft.getMargin();
        int finalValue2 = constraintWidget2.mRight.mTarget.getFinalValue() - constraintWidget2.mRight.getMargin();
        if (finalValue2 >= finalValue) {
            int width2 = constraintWidget2.getWidth();
            if (constraintWidget2.getVisibility() != 8) {
                int i12 = constraintWidget2.mMatchConstraintDefaultWidth;
                if (i12 == 2) {
                    if (constraintWidget instanceof ConstraintWidgetContainer) {
                        width = constraintWidget.getWidth();
                    } else {
                        width = constraintWidget.getParent().getWidth();
                    }
                    width2 = (int) (constraintWidget2.getHorizontalBiasPercent() * 0.5f * width);
                } else if (i12 == 0) {
                    width2 = finalValue2 - finalValue;
                }
                width2 = Math.max(constraintWidget2.mMatchConstraintMinWidth, width2);
                int i13 = constraintWidget2.mMatchConstraintMaxWidth;
                if (i13 > 0) {
                    width2 = Math.min(i13, width2);
                }
            }
            int i14 = finalValue + ((int) ((horizontalBiasPercent * ((finalValue2 - finalValue) - width2)) + 0.5f));
            constraintWidget2.setFinalHorizontal(i14, width2 + i14);
            horizontalSolvingPass(i11 + 1, constraintWidget2, measurer, z11);
        }
    }

    private static void solveVerticalCenterConstraints(int i11, BasicMeasure.Measurer measurer, ConstraintWidget constraintWidget) {
        float f11;
        float verticalBiasPercent = constraintWidget.getVerticalBiasPercent();
        int finalValue = constraintWidget.mTop.mTarget.getFinalValue();
        int finalValue2 = constraintWidget.mBottom.mTarget.getFinalValue();
        int margin = constraintWidget.mTop.getMargin() + finalValue;
        int margin2 = finalValue2 - constraintWidget.mBottom.getMargin();
        if (finalValue == finalValue2) {
            verticalBiasPercent = 0.5f;
        } else {
            finalValue = margin;
            finalValue2 = margin2;
        }
        int height = constraintWidget.getHeight();
        int i12 = (finalValue2 - finalValue) - height;
        if (finalValue > finalValue2) {
            i12 = (finalValue - finalValue2) - height;
        }
        if (i12 > 0) {
            f11 = (verticalBiasPercent * i12) + 0.5f;
        } else {
            f11 = verticalBiasPercent * i12;
        }
        int i13 = (int) f11;
        int i14 = finalValue + i13;
        int i15 = i14 + height;
        if (finalValue > finalValue2) {
            i14 = finalValue - i13;
            i15 = i14 - height;
        }
        constraintWidget.setFinalVertical(i14, i15);
        verticalSolvingPass(i11 + 1, constraintWidget, measurer);
    }

    private static void solveVerticalMatchConstraint(int i11, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, ConstraintWidget constraintWidget2) {
        int height;
        float verticalBiasPercent = constraintWidget2.getVerticalBiasPercent();
        int finalValue = constraintWidget2.mTop.mTarget.getFinalValue() + constraintWidget2.mTop.getMargin();
        int finalValue2 = constraintWidget2.mBottom.mTarget.getFinalValue() - constraintWidget2.mBottom.getMargin();
        if (finalValue2 >= finalValue) {
            int height2 = constraintWidget2.getHeight();
            if (constraintWidget2.getVisibility() != 8) {
                int i12 = constraintWidget2.mMatchConstraintDefaultHeight;
                if (i12 == 2) {
                    if (constraintWidget instanceof ConstraintWidgetContainer) {
                        height = constraintWidget.getHeight();
                    } else {
                        height = constraintWidget.getParent().getHeight();
                    }
                    height2 = (int) (verticalBiasPercent * 0.5f * height);
                } else if (i12 == 0) {
                    height2 = finalValue2 - finalValue;
                }
                height2 = Math.max(constraintWidget2.mMatchConstraintMinHeight, height2);
                int i13 = constraintWidget2.mMatchConstraintMaxHeight;
                if (i13 > 0) {
                    height2 = Math.min(i13, height2);
                }
            }
            int i14 = finalValue + ((int) ((verticalBiasPercent * ((finalValue2 - finalValue) - height2)) + 0.5f));
            constraintWidget2.setFinalVertical(i14, height2 + i14);
            verticalSolvingPass(i11 + 1, constraintWidget2, measurer);
        }
    }

    public static void solvingPass(ConstraintWidgetContainer constraintWidgetContainer, BasicMeasure.Measurer measurer) {
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = constraintWidgetContainer.getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour verticalDimensionBehaviour = constraintWidgetContainer.getVerticalDimensionBehaviour();
        sHcount = 0;
        sVcount = 0;
        constraintWidgetContainer.resetFinalResolution();
        ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
        int size = children.size();
        for (int i11 = 0; i11 < size; i11++) {
            children.get(i11).resetFinalResolution();
        }
        boolean zIsRtl = constraintWidgetContainer.isRtl();
        if (horizontalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED) {
            constraintWidgetContainer.setFinalHorizontal(0, constraintWidgetContainer.getWidth());
        } else {
            constraintWidgetContainer.setFinalLeft(0);
        }
        boolean z11 = false;
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            ConstraintWidget constraintWidget = children.get(i12);
            if (constraintWidget instanceof Guideline) {
                Guideline guideline = (Guideline) constraintWidget;
                if (guideline.getOrientation() == 1) {
                    if (guideline.getRelativeBegin() != -1) {
                        guideline.setFinalValue(guideline.getRelativeBegin());
                    } else if (guideline.getRelativeEnd() != -1 && constraintWidgetContainer.isResolvedHorizontally()) {
                        guideline.setFinalValue(constraintWidgetContainer.getWidth() - guideline.getRelativeEnd());
                    } else if (constraintWidgetContainer.isResolvedHorizontally()) {
                        guideline.setFinalValue((int) ((guideline.getRelativePercent() * constraintWidgetContainer.getWidth()) + 0.5f));
                    }
                    z11 = true;
                }
            } else if ((constraintWidget instanceof Barrier) && ((Barrier) constraintWidget).getOrientation() == 0) {
                z12 = true;
            }
        }
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                ConstraintWidget constraintWidget2 = children.get(i13);
                if (constraintWidget2 instanceof Guideline) {
                    Guideline guideline2 = (Guideline) constraintWidget2;
                    if (guideline2.getOrientation() == 1) {
                        horizontalSolvingPass(0, guideline2, measurer, zIsRtl);
                    }
                }
            }
        }
        horizontalSolvingPass(0, constraintWidgetContainer, measurer, zIsRtl);
        if (z12) {
            for (int i14 = 0; i14 < size; i14++) {
                ConstraintWidget constraintWidget3 = children.get(i14);
                if (constraintWidget3 instanceof Barrier) {
                    Barrier barrier = (Barrier) constraintWidget3;
                    if (barrier.getOrientation() == 0) {
                        solveBarrier(0, barrier, measurer, 0, zIsRtl);
                    }
                }
            }
        }
        if (verticalDimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED) {
            constraintWidgetContainer.setFinalVertical(0, constraintWidgetContainer.getHeight());
        } else {
            constraintWidgetContainer.setFinalTop(0);
        }
        boolean z13 = false;
        boolean z14 = false;
        for (int i15 = 0; i15 < size; i15++) {
            ConstraintWidget constraintWidget4 = children.get(i15);
            if (constraintWidget4 instanceof Guideline) {
                Guideline guideline3 = (Guideline) constraintWidget4;
                if (guideline3.getOrientation() == 0) {
                    if (guideline3.getRelativeBegin() != -1) {
                        guideline3.setFinalValue(guideline3.getRelativeBegin());
                    } else if (guideline3.getRelativeEnd() != -1 && constraintWidgetContainer.isResolvedVertically()) {
                        guideline3.setFinalValue(constraintWidgetContainer.getHeight() - guideline3.getRelativeEnd());
                    } else if (constraintWidgetContainer.isResolvedVertically()) {
                        guideline3.setFinalValue((int) ((guideline3.getRelativePercent() * constraintWidgetContainer.getHeight()) + 0.5f));
                    }
                    z13 = true;
                }
            } else if ((constraintWidget4 instanceof Barrier) && ((Barrier) constraintWidget4).getOrientation() == 1) {
                z14 = true;
            }
        }
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                ConstraintWidget constraintWidget5 = children.get(i16);
                if (constraintWidget5 instanceof Guideline) {
                    Guideline guideline4 = (Guideline) constraintWidget5;
                    if (guideline4.getOrientation() == 0) {
                        verticalSolvingPass(1, guideline4, measurer);
                    }
                }
            }
        }
        verticalSolvingPass(0, constraintWidgetContainer, measurer);
        if (z14) {
            for (int i17 = 0; i17 < size; i17++) {
                ConstraintWidget constraintWidget6 = children.get(i17);
                if (constraintWidget6 instanceof Barrier) {
                    Barrier barrier2 = (Barrier) constraintWidget6;
                    if (barrier2.getOrientation() == 1) {
                        solveBarrier(0, barrier2, measurer, 1, zIsRtl);
                    }
                }
            }
        }
        for (int i18 = 0; i18 < size; i18++) {
            ConstraintWidget constraintWidget7 = children.get(i18);
            if (constraintWidget7.isMeasureRequested() && canMeasure(0, constraintWidget7)) {
                ConstraintWidgetContainer.measure(0, constraintWidget7, measurer, sMeasure, BasicMeasure.Measure.SELF_DIMENSIONS);
                if (constraintWidget7 instanceof Guideline) {
                    if (((Guideline) constraintWidget7).getOrientation() == 0) {
                        verticalSolvingPass(0, constraintWidget7, measurer);
                    } else {
                        horizontalSolvingPass(0, constraintWidget7, measurer, zIsRtl);
                    }
                } else {
                    horizontalSolvingPass(0, constraintWidget7, measurer, zIsRtl);
                    verticalSolvingPass(0, constraintWidget7, measurer);
                }
            }
        }
    }
}
