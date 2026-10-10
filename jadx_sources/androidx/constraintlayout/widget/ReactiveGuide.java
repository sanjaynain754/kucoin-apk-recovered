package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: loaded from: classes23.dex */
public class ReactiveGuide extends View implements SharedValues.SharedValuesListener {
    private boolean mAnimateChange;
    private boolean mApplyToAllConstraintSets;
    private int mApplyToConstraintSetId;
    private int mAttributeId;

    public ReactiveGuide(Context context) {
        super(context);
        this.mAttributeId = -1;
        this.mAnimateChange = false;
        this.mApplyToConstraintSetId = 0;
        this.mApplyToAllConstraintSets = true;
        super.setVisibility(8);
        init(null);
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        setMeasuredDimension(0, 0);
    }

    private void init(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1528R.styleable.ConstraintLayout_ReactiveGuide);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == C1528R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
                    this.mAttributeId = typedArrayObtainStyledAttributes.getResourceId(index, this.mAttributeId);
                } else if (index == C1528R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
                    this.mAnimateChange = typedArrayObtainStyledAttributes.getBoolean(index, this.mAnimateChange);
                } else if (index == C1528R.styleable.f2219x2694048c) {
                    this.mApplyToConstraintSetId = typedArrayObtainStyledAttributes.getResourceId(index, this.mApplyToConstraintSetId);
                } else if (index == C1528R.styleable.f2218xfdeff96) {
                    this.mApplyToAllConstraintSets = typedArrayObtainStyledAttributes.getBoolean(index, this.mApplyToAllConstraintSets);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.mAttributeId != -1) {
            ConstraintLayout.getSharedValues().addListener(this.mAttributeId, this);
        }
    }

    public int getApplyToConstraintSetId() {
        return this.mApplyToConstraintSetId;
    }

    public int getAttributeId() {
        return this.mAttributeId;
    }

    public boolean isAnimatingChange() {
        return this.mAnimateChange;
    }

    public void setAnimateChange(boolean z11) {
        this.mAnimateChange = z11;
    }

    public void setApplyToConstraintSetId(int i11) {
        this.mApplyToConstraintSetId = i11;
    }

    private void changeValue(int i11, int i12, MotionLayout motionLayout, int i13) {
        ConstraintSet constraintSet = motionLayout.getConstraintSet(i13);
        constraintSet.setGuidelineEnd(i12, i11);
        motionLayout.updateState(i13, constraintSet);
    }

    @Override // androidx.constraintlayout.widget.SharedValues.SharedValuesListener
    public void onNewValue(int i11, int i12, int i13) {
        setGuidelineBegin(i12);
        int id2 = getId();
        if (id2 > 0 && (getParent() instanceof MotionLayout)) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            int currentState = motionLayout.getCurrentState();
            int i14 = this.mApplyToConstraintSetId;
            if (i14 != 0) {
                currentState = i14;
            }
            int i15 = 0;
            if (this.mAnimateChange) {
                if (this.mApplyToAllConstraintSets) {
                    int[] constraintSetIds = motionLayout.getConstraintSetIds();
                    while (i15 < constraintSetIds.length) {
                        int i16 = constraintSetIds[i15];
                        if (i16 != currentState) {
                            changeValue(i12, id2, motionLayout, i16);
                        }
                        i15++;
                    }
                }
                ConstraintSet constraintSetCloneConstraintSet = motionLayout.cloneConstraintSet(currentState);
                constraintSetCloneConstraintSet.setGuidelineEnd(id2, i12);
                motionLayout.updateStateAnimate(currentState, constraintSetCloneConstraintSet, 1000);
                return;
            }
            if (this.mApplyToAllConstraintSets) {
                int[] constraintSetIds2 = motionLayout.getConstraintSetIds();
                while (i15 < constraintSetIds2.length) {
                    changeValue(i12, id2, motionLayout, constraintSetIds2[i15]);
                    i15++;
                }
                return;
            }
            changeValue(i12, id2, motionLayout, currentState);
        }
    }

    public void setAttributeId(int i11) {
        SharedValues sharedValues = ConstraintLayout.getSharedValues();
        int i12 = this.mAttributeId;
        if (i12 != -1) {
            sharedValues.removeListener(i12, this);
        }
        this.mAttributeId = i11;
        if (i11 != -1) {
            sharedValues.addListener(i11, this);
        }
    }

    public void setGuidelineBegin(int i11) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.guideBegin = i11;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i11) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.guideEnd = i11;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f11) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.guidePercent = f11;
        setLayoutParams(layoutParams);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAttributeId = -1;
        this.mAnimateChange = false;
        this.mApplyToConstraintSetId = 0;
        this.mApplyToAllConstraintSets = true;
        super.setVisibility(8);
        init(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mAttributeId = -1;
        this.mAnimateChange = false;
        this.mApplyToConstraintSetId = 0;
        this.mApplyToAllConstraintSets = true;
        super.setVisibility(8);
        init(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11);
        this.mAttributeId = -1;
        this.mAnimateChange = false;
        this.mApplyToConstraintSetId = 0;
        this.mApplyToAllConstraintSets = true;
        super.setVisibility(8);
        init(attributeSet);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(@NonNull Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
    }
}
