package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes23.dex */
public class Chain {
    private static final boolean DEBUG = false;
    public static final boolean USE_CHAIN_OPTIMIZATION = false;

    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ArrayList<ConstraintWidget> arrayList, int i11) {
        int i12;
        ChainHead[] chainHeadArr;
        int i13;
        if (i11 == 0) {
            i12 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i13 = 0;
        } else {
            i12 = constraintWidgetContainer.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
            i13 = 2;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            ChainHead chainHead = chainHeadArr[i14];
            chainHead.define();
            if (arrayList == null || arrayList.contains(chainHead.mFirst)) {
                applyChainConstraints(constraintWidgetContainer, linearSystem, i11, i13, chainHead);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0173  */
    /* JADX WARN: Code duplicated, block: B:104:0x0194  */
    /* JADX WARN: Code duplicated, block: B:16:0x0033 A[PHI: r15 r16
      0x0033: PHI (r15v28 boolean) = (r15v1 boolean), (r15v30 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r16v5 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[PHI: r15 r16
      0x0035: PHI (r15v3 boolean) = (r15v1 boolean), (r15v30 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r16v3 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:218:0x038a  */
    /* JADX WARN: Code duplicated, block: B:289:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:292:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:293:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:296:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:297:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:299:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:301:0x04da  */
    /* JADX WARN: Code duplicated, block: B:304:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:317:0x038b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x016a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [androidx.constraintlayout.core.LinearSystem] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.constraintlayout.core.LinearSystem] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r5v17, types: [androidx.constraintlayout.core.SolverVariable] */
    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i11, int i12, ChainHead chainHead) {
        boolean z11;
        boolean z12;
        boolean z13;
        float f11;
        ?? r11;
        LinearSystem linearSystem2;
        ConstraintAnchor constraintAnchor;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        int i13;
        ConstraintAnchor constraintAnchor2;
        SolverVariable solverVariable3;
        int i14;
        ConstraintAnchor[] constraintAnchorArr;
        int i15;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        SolverVariable solverVariable4;
        ConstraintAnchor constraintAnchor5;
        Object obj;
        float f12;
        int size;
        ConstraintAnchor constraintAnchor6;
        int i16;
        int i17 = i11;
        ConstraintWidget constraintWidget = chainHead.mFirst;
        ConstraintWidget constraintWidget2 = chainHead.mLast;
        ConstraintWidget constraintWidget3 = chainHead.mFirstVisibleWidget;
        ConstraintWidget constraintWidget4 = chainHead.mLastVisibleWidget;
        ConstraintWidget constraintWidget5 = chainHead.mHead;
        float f13 = chainHead.mTotalWeight;
        boolean z14 = constraintWidgetContainer.mListDimensionBehaviors[i17] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (i17 == 0) {
            int i18 = constraintWidget5.mHorizontalChainStyle;
            z11 = i18 == 0;
            z12 = i18 == 1;
            if (i18 == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
        } else {
            int i19 = constraintWidget5.mVerticalChainStyle;
            z11 = i19 == 0;
            z12 = i19 == 1;
            if (i19 == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
        }
        ?? r14 = constraintWidget;
        boolean z15 = false;
        while (true) {
            f11 = f13;
            Object obj2 = null;
            if (z15) {
                break;
            }
            ConstraintAnchor constraintAnchor7 = r14.mListAnchors[i12];
            int i21 = z13 ? 1 : 4;
            int margin = constraintAnchor7.getMargin();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = r14.mListDimensionBehaviors[i17];
            boolean z16 = z14;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z17 = dimensionBehaviour == dimensionBehaviour2 && r14.mResolvedMatchConstraintDefault[i17] == 0;
            boolean z18 = z13;
            ConstraintAnchor constraintAnchor8 = constraintAnchor7.mTarget;
            if (constraintAnchor8 != null && r14 != constraintWidget) {
                margin += constraintAnchor8.getMargin();
            }
            int i22 = margin;
            if (z18 && r14 != constraintWidget && r14 != constraintWidget3) {
                i21 = 8;
            }
            boolean z19 = z17;
            ConstraintAnchor constraintAnchor9 = constraintAnchor7.mTarget;
            if (constraintAnchor9 != null) {
                if (r14 == constraintWidget3) {
                    linearSystem.addGreaterThan(constraintAnchor7.mSolverVariable, constraintAnchor9.mSolverVariable, i22, 6);
                } else {
                    linearSystem.addGreaterThan(constraintAnchor7.mSolverVariable, constraintAnchor9.mSolverVariable, i22, 8);
                }
                if (z19 && !z18) {
                    i21 = 5;
                }
                linearSystem.addEquality(constraintAnchor7.mSolverVariable, constraintAnchor7.mTarget.mSolverVariable, i22, (r14 == constraintWidget3 && z18 && r14.isInBarrier(i17)) ? 5 : i21);
            } else {
                z15 = z15;
                z11 = z11;
            }
            if (z16) {
                if (r14.getVisibility() == 8 || r14.mListDimensionBehaviors[i17] != dimensionBehaviour2) {
                    i16 = 0;
                } else {
                    ConstraintAnchor[] constraintAnchorArr2 = r14.mListAnchors;
                    i16 = 0;
                    linearSystem.addGreaterThan(constraintAnchorArr2[i12 + 1].mSolverVariable, constraintAnchorArr2[i12].mSolverVariable, 0, 5);
                }
                linearSystem.addGreaterThan(r14.mListAnchors[i12].mSolverVariable, constraintWidgetContainer.mListAnchors[i12].mSolverVariable, i16, 8);
            }
            ConstraintAnchor constraintAnchor10 = r14.mListAnchors[i12 + 1].mTarget;
            if (constraintAnchor10 != null) {
                ConstraintWidget constraintWidget6 = constraintAnchor10.mOwner;
                ConstraintAnchor constraintAnchor11 = constraintWidget6.mListAnchors[i12].mTarget;
                if (constraintAnchor11 != null && constraintAnchor11.mOwner == r14) {
                    obj2 = constraintWidget6;
                }
            }
            if (obj2 != null) {
                r14 = obj2;
                z15 = z15;
            } else {
                z15 = true;
            }
            f13 = f11;
            z14 = z16;
            z13 = z18;
            z11 = z11;
            r14 = r14;
        }
        boolean z21 = z14;
        boolean z22 = z13;
        boolean z23 = z11;
        if (constraintWidget4 != null) {
            int i23 = i12 + 1;
            if (constraintWidget2.mListAnchors[i23].mTarget != null) {
                ConstraintAnchor constraintAnchor12 = constraintWidget4.mListAnchors[i23];
                if (constraintWidget4.mListDimensionBehaviors[i17] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget4.mResolvedMatchConstraintDefault[i17] == 0 && !z22) {
                    ConstraintAnchor constraintAnchor13 = constraintAnchor12.mTarget;
                    if (constraintAnchor13.mOwner == constraintWidgetContainer) {
                        linearSystem.addEquality(constraintAnchor12.mSolverVariable, constraintAnchor13.mSolverVariable, -constraintAnchor12.getMargin(), 5);
                    } else if (z22) {
                        constraintAnchor6 = constraintAnchor12.mTarget;
                        if (constraintAnchor6.mOwner == constraintWidgetContainer) {
                            linearSystem.addEquality(constraintAnchor12.mSolverVariable, constraintAnchor6.mSolverVariable, -constraintAnchor12.getMargin(), 4);
                        }
                    }
                } else if (z22) {
                    constraintAnchor6 = constraintAnchor12.mTarget;
                    if (constraintAnchor6.mOwner == constraintWidgetContainer) {
                        linearSystem.addEquality(constraintAnchor12.mSolverVariable, constraintAnchor6.mSolverVariable, -constraintAnchor12.getMargin(), 4);
                    }
                }
                linearSystem.addLowerThan(constraintAnchor12.mSolverVariable, constraintWidget2.mListAnchors[i23].mTarget.mSolverVariable, -constraintAnchor12.getMargin(), 6);
            }
        }
        if (z21) {
            int i24 = i12 + 1;
            SolverVariable solverVariable5 = constraintWidgetContainer.mListAnchors[i24].mSolverVariable;
            ConstraintAnchor constraintAnchor14 = constraintWidget2.mListAnchors[i24];
            linearSystem.addGreaterThan(solverVariable5, constraintAnchor14.mSolverVariable, constraintAnchor14.getMargin(), 8);
        }
        ArrayList<ConstraintWidget> arrayList = chainHead.mWeightedMatchConstraintsWidgets;
        if (arrayList != null && (size = arrayList.size()) > 1) {
            float f14 = (!chainHead.mHasUndefinedWeights || chainHead.mHasComplexMatchWeights) ? f11 : chainHead.mWidgetsMatchCount;
            float f15 = 0.0f;
            float f16 = 0.0f;
            ConstraintWidget constraintWidget7 = null;
            int i25 = 0;
            while (i25 < size) {
                ConstraintWidget constraintWidget8 = arrayList.get(i25);
                float f17 = constraintWidget8.mWeight[i17];
                if (f17 < f15) {
                    if (chainHead.mHasComplexMatchWeights) {
                        ConstraintAnchor[] constraintAnchorArr3 = constraintWidget8.mListAnchors;
                        f15 = f15;
                        linearSystem.addEquality(constraintAnchorArr3[i12 + 1].mSolverVariable, constraintAnchorArr3[i12].mSolverVariable, 0, 4);
                    } else {
                        f17 = 1.0f;
                    }
                    arrayList = arrayList;
                    i25++;
                    f15 = f15;
                    arrayList = arrayList;
                }
                float f18 = f17;
                if (f18 == f15) {
                    ConstraintAnchor[] constraintAnchorArr4 = constraintWidget8.mListAnchors;
                    linearSystem.addEquality(constraintAnchorArr4[i12 + 1].mSolverVariable, constraintAnchorArr4[i12].mSolverVariable, 0, 8);
                    arrayList = arrayList;
                } else {
                    if (constraintWidget7 != null) {
                        ConstraintAnchor[] constraintAnchorArr5 = constraintWidget7.mListAnchors;
                        SolverVariable solverVariable6 = constraintAnchorArr5[i12].mSolverVariable;
                        int i26 = i12 + 1;
                        SolverVariable solverVariable7 = constraintAnchorArr5[i26].mSolverVariable;
                        ConstraintAnchor[] constraintAnchorArr6 = constraintWidget8.mListAnchors;
                        SolverVariable solverVariable8 = constraintAnchorArr6[i12].mSolverVariable;
                        SolverVariable solverVariable9 = constraintAnchorArr6[i26].mSolverVariable;
                        ArrayRow arrayRowCreateRow = linearSystem.createRow();
                        arrayRowCreateRow.createRowEqualMatchDimensions(f16, f14, f18, solverVariable6, solverVariable7, solverVariable8, solverVariable9);
                        linearSystem.addConstraint(arrayRowCreateRow);
                    }
                    constraintWidget7 = constraintWidget8;
                    f16 = f18;
                }
                i25++;
                f15 = f15;
                arrayList = arrayList;
            }
        }
        if (constraintWidget3 != null && (constraintWidget3 == constraintWidget4 || z22)) {
            ConstraintAnchor constraintAnchor15 = constraintWidget.mListAnchors[i12];
            int i27 = i12 + 1;
            ConstraintAnchor constraintAnchor16 = constraintWidget2.mListAnchors[i27];
            ConstraintAnchor constraintAnchor17 = constraintAnchor15.mTarget;
            SolverVariable solverVariable10 = constraintAnchor17 != null ? constraintAnchor17.mSolverVariable : null;
            ConstraintAnchor constraintAnchor18 = constraintAnchor16.mTarget;
            SolverVariable solverVariable11 = constraintAnchor18 != null ? constraintAnchor18.mSolverVariable : null;
            ConstraintAnchor constraintAnchor19 = constraintWidget3.mListAnchors[i12];
            if (constraintWidget4 != null) {
                constraintAnchor16 = constraintWidget4.mListAnchors[i27];
            }
            if (solverVariable10 != null && solverVariable11 != null) {
                if (i17 == 0) {
                    f12 = constraintWidget5.mHorizontalBiasPercent;
                } else {
                    f12 = constraintWidget5.mVerticalBiasPercent;
                }
                linearSystem.addCentering(constraintAnchor19.mSolverVariable, solverVariable10, constraintAnchor19.getMargin(), f12, solverVariable11, constraintAnchor16.mSolverVariable, constraintAnchor16.getMargin(), 7);
            }
        } else {
            if (!z23 || constraintWidget3 == null) {
                if (z12 && constraintWidget3 != null) {
                    int i28 = chainHead.mWidgetsMatchCount;
                    boolean z24 = i28 > 0 && chainHead.mWidgetsCount == i28;
                    ConstraintWidget constraintWidget9 = constraintWidget3;
                    ConstraintWidget constraintWidget10 = constraintWidget9;
                    while (constraintWidget9 != null) {
                        ConstraintWidget constraintWidget11 = constraintWidget9.mNextChainWidget[i11];
                        while (constraintWidget11 != null && constraintWidget11.getVisibility() == 8) {
                            constraintWidget11 = constraintWidget11.mNextChainWidget[i11];
                        }
                        if (constraintWidget9 != constraintWidget3 && constraintWidget9 != constraintWidget4 && constraintWidget11 != null) {
                            if (constraintWidget11 == constraintWidget4) {
                                constraintWidget11 = null;
                            }
                            ConstraintAnchor constraintAnchor20 = constraintWidget9.mListAnchors[i12];
                            SolverVariable solverVariable12 = constraintAnchor20.mSolverVariable;
                            ConstraintAnchor constraintAnchor21 = constraintAnchor20.mTarget;
                            if (constraintAnchor21 != null) {
                                SolverVariable solverVariable13 = constraintAnchor21.mSolverVariable;
                            }
                            int i29 = i12 + 1;
                            SolverVariable solverVariable14 = constraintWidget10.mListAnchors[i29].mSolverVariable;
                            int margin2 = constraintAnchor20.getMargin();
                            int margin3 = constraintWidget9.mListAnchors[i29].getMargin();
                            if (constraintWidget11 != null) {
                                constraintAnchor = constraintWidget11.mListAnchors[i12];
                                solverVariable = constraintAnchor.mSolverVariable;
                                ConstraintAnchor constraintAnchor22 = constraintAnchor.mTarget;
                                solverVariable2 = constraintAnchor22 != null ? constraintAnchor22.mSolverVariable : null;
                            } else {
                                constraintAnchor = constraintWidget4.mListAnchors[i12];
                                solverVariable = constraintAnchor != null ? constraintAnchor.mSolverVariable : null;
                                solverVariable2 = constraintWidget9.mListAnchors[i29].mSolverVariable;
                            }
                            if (constraintAnchor != null) {
                                margin3 += constraintAnchor.getMargin();
                            }
                            int margin4 = margin2 + constraintWidget10.mListAnchors[i29].getMargin();
                            int i31 = z24 ? 8 : 4;
                            if (solverVariable12 != null && solverVariable14 != null && solverVariable != null && solverVariable2 != null) {
                                linearSystem.addCentering(solverVariable12, solverVariable14, margin4, 0.5f, solverVariable, solverVariable2, margin3, i31);
                            }
                            constraintWidget11 = constraintWidget11;
                        }
                        if (constraintWidget9.getVisibility() != 8) {
                            constraintWidget10 = constraintWidget9;
                        }
                        constraintWidget9 = constraintWidget11;
                    }
                    ConstraintAnchor constraintAnchor23 = constraintWidget3.mListAnchors[i12];
                    ConstraintAnchor constraintAnchor24 = constraintWidget.mListAnchors[i12].mTarget;
                    int i32 = i12 + 1;
                    ConstraintAnchor constraintAnchor25 = constraintWidget4.mListAnchors[i32];
                    ConstraintAnchor constraintAnchor26 = constraintWidget2.mListAnchors[i32].mTarget;
                    if (constraintAnchor24 == null) {
                        r11 = linearSystem;
                    } else {
                        if (constraintWidget3 != constraintWidget4) {
                            linearSystem.addEquality(constraintAnchor23.mSolverVariable, constraintAnchor24.mSolverVariable, constraintAnchor23.getMargin(), 5);
                        } else if (constraintAnchor26 != null) {
                            linearSystem2 = linearSystem;
                            linearSystem2.addCentering(constraintAnchor23.mSolverVariable, constraintAnchor24.mSolverVariable, constraintAnchor23.getMargin(), 0.5f, constraintAnchor25.mSolverVariable, constraintAnchor26.mSolverVariable, constraintAnchor25.getMargin(), 5);
                        }
                        r11 = linearSystem;
                    }
                    if (constraintAnchor26 != null && constraintWidget3 != constraintWidget4) {
                        r11.addEquality(constraintAnchor25.mSolverVariable, constraintAnchor26.mSolverVariable, -constraintAnchor25.getMargin(), 5);
                    }
                }
                if ((z23 && !z12) || constraintWidget3 == null || constraintWidget3 == constraintWidget4) {
                    return;
                }
                constraintAnchorArr = constraintWidget3.mListAnchors;
                ConstraintAnchor constraintAnchor27 = constraintAnchorArr[i12];
                if (constraintWidget4 == null) {
                    constraintWidget4 = constraintWidget3;
                }
                i15 = i12 + 1;
                constraintAnchor3 = constraintWidget4.mListAnchors[i15];
                constraintAnchor4 = constraintAnchor27.mTarget;
                if (constraintAnchor4 != null) {
                    solverVariable4 = constraintAnchor4.mSolverVariable;
                } else {
                    solverVariable4 = null;
                }
                constraintAnchor5 = constraintAnchor3.mTarget;
                if (constraintAnchor5 != null) {
                    obj = constraintAnchor5.mSolverVariable;
                } else {
                    obj = null;
                }
                if (constraintWidget2 != constraintWidget4) {
                    ConstraintAnchor constraintAnchor28 = constraintWidget2.mListAnchors[i15].mTarget;
                    obj = constraintAnchor28 != null ? constraintAnchor28.mSolverVariable : null;
                }
                if (constraintWidget3 == constraintWidget4) {
                    constraintAnchor3 = constraintAnchorArr[i15];
                }
                if (solverVariable4 != null || obj == null) {
                }
                r11.addCentering(constraintAnchor27.mSolverVariable, solverVariable4, constraintAnchor27.getMargin(), 0.5f, obj, constraintAnchor3.mSolverVariable, constraintWidget4.mListAnchors[i15].getMargin(), 5);
                return;
            }
            int i33 = chainHead.mWidgetsMatchCount;
            boolean z25 = i33 > 0 && chainHead.mWidgetsCount == i33;
            ConstraintWidget constraintWidget12 = constraintWidget3;
            ConstraintWidget constraintWidget13 = constraintWidget12;
            while (constraintWidget12 != null) {
                ConstraintWidget constraintWidget14 = constraintWidget12.mNextChainWidget[i17];
                while (true) {
                    if (constraintWidget14 == null) {
                        i13 = 8;
                        break;
                    }
                    i13 = 8;
                    if (constraintWidget14.getVisibility() != 8) {
                        break;
                    } else {
                        constraintWidget14 = constraintWidget14.mNextChainWidget[i17];
                    }
                }
                if (constraintWidget14 != null || constraintWidget12 == constraintWidget4) {
                    ConstraintAnchor constraintAnchor29 = constraintWidget12.mListAnchors[i12];
                    SolverVariable solverVariable15 = constraintAnchor29.mSolverVariable;
                    ConstraintAnchor constraintAnchor30 = constraintAnchor29.mTarget;
                    SolverVariable solverVariable16 = constraintAnchor30 != null ? constraintAnchor30.mSolverVariable : null;
                    if (constraintWidget13 != constraintWidget12) {
                        solverVariable16 = constraintWidget13.mListAnchors[i12 + 1].mSolverVariable;
                    } else if (constraintWidget12 == constraintWidget3) {
                        ConstraintAnchor constraintAnchor31 = constraintWidget.mListAnchors[i12].mTarget;
                        solverVariable16 = constraintAnchor31 != null ? constraintAnchor31.mSolverVariable : null;
                    }
                    int margin5 = constraintAnchor29.getMargin();
                    int i34 = i12 + 1;
                    int margin6 = constraintWidget12.mListAnchors[i34].getMargin();
                    if (constraintWidget14 != null) {
                        constraintAnchor2 = constraintWidget14.mListAnchors[i12];
                        solverVariable3 = constraintAnchor2.mSolverVariable;
                    } else {
                        constraintAnchor2 = constraintWidget2.mListAnchors[i34].mTarget;
                        solverVariable3 = constraintAnchor2 != null ? constraintAnchor2.mSolverVariable : null;
                    }
                    SolverVariable solverVariable17 = constraintWidget12.mListAnchors[i34].mSolverVariable;
                    if (constraintAnchor2 != null) {
                        margin6 += constraintAnchor2.getMargin();
                    }
                    int margin7 = margin5 + constraintWidget13.mListAnchors[i34].getMargin();
                    if (solverVariable15 == null || solverVariable16 == null || solverVariable3 == null || solverVariable17 == null) {
                        i14 = 8;
                    } else {
                        if (constraintWidget12 == constraintWidget3) {
                            margin7 = constraintWidget3.mListAnchors[i12].getMargin();
                        }
                        if (constraintWidget12 == constraintWidget4) {
                            margin6 = constraintWidget4.mListAnchors[i34].getMargin();
                        }
                        constraintWidget14 = constraintWidget14;
                        i14 = 8;
                        linearSystem.addCentering(solverVariable15, solverVariable16, margin7, 0.5f, solverVariable3, solverVariable17, margin6, z25 ? 8 : 5);
                    }
                    if (constraintWidget12.getVisibility() != i14) {
                        constraintWidget13 = constraintWidget12;
                    }
                    i17 = i11;
                    constraintWidget12 = constraintWidget14;
                } else {
                    i14 = i13;
                }
                if (constraintWidget12.getVisibility() != i14) {
                    constraintWidget13 = constraintWidget12;
                }
                i17 = i11;
                constraintWidget12 = constraintWidget14;
            }
        }
        r11 = linearSystem;
        if (z23) {
        }
        constraintAnchorArr = constraintWidget3.mListAnchors;
        ConstraintAnchor constraintAnchor210 = constraintAnchorArr[i12];
        if (constraintWidget4 == null) {
            constraintWidget4 = constraintWidget3;
        }
        i15 = i12 + 1;
        constraintAnchor3 = constraintWidget4.mListAnchors[i15];
        constraintAnchor4 = constraintAnchor210.mTarget;
        if (constraintAnchor4 != null) {
            solverVariable4 = constraintAnchor4.mSolverVariable;
        } else {
            solverVariable4 = null;
        }
        constraintAnchor5 = constraintAnchor3.mTarget;
        if (constraintAnchor5 != null) {
            obj = constraintAnchor5.mSolverVariable;
        } else {
            obj = null;
        }
        if (constraintWidget2 != constraintWidget4) {
            ConstraintAnchor constraintAnchor211 = constraintWidget2.mListAnchors[i15].mTarget;
            obj = constraintAnchor211 != null ? constraintAnchor211.mSolverVariable : null;
        }
        if (constraintWidget3 == constraintWidget4) {
            constraintAnchor3 = constraintAnchorArr[i15];
        }
        if (solverVariable4 != null) {
        }
    }
}
