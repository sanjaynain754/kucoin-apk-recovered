package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends ConstraintWidget {
    public static final int HORIZONTAL = 0;
    public static final int RELATIVE_BEGIN = 1;
    public static final int RELATIVE_END = 2;
    public static final int RELATIVE_PERCENT = 0;
    public static final int RELATIVE_UNKNOWN = -1;
    public static final int VERTICAL = 1;
    private boolean mResolved;
    protected float mRelativePercent = -1.0f;
    protected int mRelativeBegin = -1;
    protected int mRelativeEnd = -1;
    protected boolean mGuidelineUseRtl = true;
    private ConstraintAnchor mAnchor = this.mTop;
    private int mOrientation = 0;
    private int mMinimumPosition = 0;

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean allowedInBarrier() {
        return true;
    }

    public ConstraintAnchor getAnchor() {
        return this.mAnchor;
    }

    public void setGuideBegin(int i11) {
        if (i11 > -1) {
            this.mRelativePercent = -1.0f;
            this.mRelativeBegin = i11;
            this.mRelativeEnd = -1;
        }
    }

    public void setGuideEnd(int i11) {
        if (i11 > -1) {
            this.mRelativePercent = -1.0f;
            this.mRelativeBegin = -1;
            this.mRelativeEnd = i11;
        }
    }

    public void setGuidePercent(int i11) {
        setGuidePercent(i11 / 100.0f);
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.Guideline$1 */
    /* JADX INFO: loaded from: classes23.dex */
    public static /* synthetic */ class C15011 {

        /* JADX INFO: renamed from: $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type */
        static final /* synthetic */ int[] f2203x6930e354;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f2203x6930e354 = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2203x6930e354[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2203x6930e354[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2203x6930e354[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2203x6930e354[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2203x6930e354[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2203x6930e354[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2203x6930e354[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2203x6930e354[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public void cyclePosition() {
        if (this.mRelativeBegin != -1) {
            inferRelativePercentPosition();
        } else if (this.mRelativePercent != -1.0f) {
            inferRelativeEndPosition();
        } else if (this.mRelativeEnd != -1) {
            inferRelativeBeginPosition();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public ConstraintAnchor getAnchor(ConstraintAnchor.Type type) {
        int i11 = C15011.f2203x6930e354[type.ordinal()];
        if (i11 == 1 || i11 == 2) {
            if (this.mOrientation == 1) {
                return this.mAnchor;
            }
            return null;
        }
        if ((i11 == 3 || i11 == 4) && this.mOrientation == 0) {
            return this.mAnchor;
        }
        return null;
    }

    public int getMinimumPosition() {
        return this.mMinimumPosition;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getRelativeBegin() {
        return this.mRelativeBegin;
    }

    public int getRelativeBehaviour() {
        if (this.mRelativePercent != -1.0f) {
            return 0;
        }
        if (this.mRelativeBegin != -1) {
            return 1;
        }
        return this.mRelativeEnd != -1 ? 2 : -1;
    }

    public int getRelativeEnd() {
        return this.mRelativeEnd;
    }

    public float getRelativePercent() {
        return this.mRelativePercent;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String getType() {
        return "Guideline";
    }

    public boolean isPercent() {
        return this.mRelativePercent != -1.0f && this.mRelativeBegin == -1 && this.mRelativeEnd == -1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedHorizontally() {
        return this.mResolved;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedVertically() {
        return this.mResolved;
    }

    public void setFinalValue(int i11) {
        this.mAnchor.setFinalValue(i11);
        this.mResolved = true;
    }

    public void setGuidePercent(float f11) {
        if (f11 > -1.0f) {
            this.mRelativePercent = f11;
            this.mRelativeBegin = -1;
            this.mRelativeEnd = -1;
        }
    }

    public void setMinimumPosition(int i11) {
        this.mMinimumPosition = i11;
    }

    public void setOrientation(int i11) {
        if (this.mOrientation == i11) {
            return;
        }
        this.mOrientation = i11;
        this.mAnchors.clear();
        if (this.mOrientation == 1) {
            this.mAnchor = this.mLeft;
        } else {
            this.mAnchor = this.mTop;
        }
        this.mAnchors.add(this.mAnchor);
        int length = this.mListAnchors.length;
        for (int i12 = 0; i12 < length; i12++) {
            this.mListAnchors[i12] = this.mAnchor;
        }
    }

    public Guideline() {
        this.mAnchors.clear();
        this.mAnchors.add(this.mAnchor);
        int length = this.mListAnchors.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.mListAnchors[i11] = this.mAnchor;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z11) {
        boolean z12;
        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) getParent();
        if (constraintWidgetContainer != null) {
            ConstraintAnchor anchor = constraintWidgetContainer.getAnchor(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor anchor2 = constraintWidgetContainer.getAnchor(ConstraintAnchor.Type.RIGHT);
            ConstraintWidget constraintWidget = this.mParent;
            boolean z13 = true;
            if (constraintWidget != null && constraintWidget.mListDimensionBehaviors[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.mOrientation == 0) {
                anchor = constraintWidgetContainer.getAnchor(ConstraintAnchor.Type.TOP);
                anchor2 = constraintWidgetContainer.getAnchor(ConstraintAnchor.Type.BOTTOM);
                ConstraintWidget constraintWidget2 = this.mParent;
                if (constraintWidget2 == null || constraintWidget2.mListDimensionBehaviors[1] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    z13 = false;
                }
                z12 = z13;
            }
            if (this.mResolved && this.mAnchor.hasFinalValue()) {
                SolverVariable solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mAnchor);
                linearSystem.addEquality(solverVariableCreateObjectVariable, this.mAnchor.getFinalValue());
                if (this.mRelativeBegin != -1) {
                    if (z12) {
                        linearSystem.addGreaterThan(linearSystem.createObjectVariable(anchor2), solverVariableCreateObjectVariable, 0, 5);
                    }
                } else if (this.mRelativeEnd != -1 && z12) {
                    SolverVariable solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(anchor2);
                    linearSystem.addGreaterThan(solverVariableCreateObjectVariable, linearSystem.createObjectVariable(anchor), 0, 5);
                    linearSystem.addGreaterThan(solverVariableCreateObjectVariable2, solverVariableCreateObjectVariable, 0, 5);
                }
                this.mResolved = false;
                return;
            }
            if (this.mRelativeBegin != -1) {
                SolverVariable solverVariableCreateObjectVariable3 = linearSystem.createObjectVariable(this.mAnchor);
                linearSystem.addEquality(solverVariableCreateObjectVariable3, linearSystem.createObjectVariable(anchor), this.mRelativeBegin, 8);
                if (z12) {
                    linearSystem.addGreaterThan(linearSystem.createObjectVariable(anchor2), solverVariableCreateObjectVariable3, 0, 5);
                    return;
                }
                return;
            }
            if (this.mRelativeEnd != -1) {
                SolverVariable solverVariableCreateObjectVariable4 = linearSystem.createObjectVariable(this.mAnchor);
                SolverVariable solverVariableCreateObjectVariable5 = linearSystem.createObjectVariable(anchor2);
                linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable5, -this.mRelativeEnd, 8);
                if (z12) {
                    linearSystem.addGreaterThan(solverVariableCreateObjectVariable4, linearSystem.createObjectVariable(anchor), 0, 5);
                    linearSystem.addGreaterThan(solverVariableCreateObjectVariable5, solverVariableCreateObjectVariable4, 0, 5);
                    return;
                }
                return;
            }
            if (this.mRelativePercent != -1.0f) {
                linearSystem.addConstraint(LinearSystem.createRowDimensionPercent(linearSystem, linearSystem.createObjectVariable(this.mAnchor), linearSystem.createObjectVariable(anchor2), this.mRelativePercent));
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.copy(constraintWidget, map);
        Guideline guideline = (Guideline) constraintWidget;
        this.mRelativePercent = guideline.mRelativePercent;
        this.mRelativeBegin = guideline.mRelativeBegin;
        this.mRelativeEnd = guideline.mRelativeEnd;
        this.mGuidelineUseRtl = guideline.mGuidelineUseRtl;
        setOrientation(guideline.mOrientation);
    }

    public void inferRelativeBeginPosition() {
        int x11 = getX();
        if (this.mOrientation == 0) {
            x11 = getY();
        }
        setGuideBegin(x11);
    }

    public void inferRelativeEndPosition() {
        int width = getParent().getWidth() - getX();
        if (this.mOrientation == 0) {
            width = getParent().getHeight() - getY();
        }
        setGuideEnd(width);
    }

    public void inferRelativePercentPosition() {
        float x11 = getX() / getParent().getWidth();
        if (this.mOrientation == 0) {
            x11 = getY() / getParent().getHeight();
        }
        setGuidePercent(x11);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void updateFromSolver(LinearSystem linearSystem, boolean z11) {
        if (getParent() == null) {
            return;
        }
        int objectVariableValue = linearSystem.getObjectVariableValue(this.mAnchor);
        if (this.mOrientation == 1) {
            setX(objectVariableValue);
            setY(0);
            setHeight(getParent().getHeight());
            setWidth(0);
            return;
        }
        setX(0);
        setY(objectVariableValue);
        setWidth(getParent().getWidth());
        setHeight(0);
    }
}
