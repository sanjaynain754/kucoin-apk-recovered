package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C1528R;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;

/* JADX INFO: loaded from: classes23.dex */
public class MotionHelper extends ConstraintHelper implements MotionHelperInterface {
    private float mProgress;
    private boolean mUseOnHide;
    private boolean mUseOnShow;
    protected View[] views;

    public MotionHelper(Context context) {
        super(context);
        this.mUseOnShow = false;
        this.mUseOnHide = false;
    }

    public boolean isDecorator() {
        return false;
    }

    public void setProgress(View view, float f11) {
    }

    @Override // androidx.constraintlayout.motion.widget.Animatable
    public float getProgress() {
        return this.mProgress;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public boolean isUseOnHide() {
        return this.mUseOnHide;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public boolean isUsedOnShow() {
        return this.mUseOnShow;
    }

    @Override // androidx.constraintlayout.motion.widget.Animatable
    public void setProgress(float f11) {
        this.mProgress = f11;
        int i11 = 0;
        if (this.mCount > 0) {
            this.views = getViews((ConstraintLayout) getParent());
            while (i11 < this.mCount) {
                setProgress(this.views[i11], f11);
                i11++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i11 < childCount) {
            View childAt = viewGroup.getChildAt(i11);
            if (!(childAt instanceof MotionHelper)) {
                setProgress(childAt, f11);
            }
            i11++;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1528R.styleable.MotionHelper);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == C1528R.styleable.MotionHelper_onShow) {
                    this.mUseOnShow = typedArrayObtainStyledAttributes.getBoolean(index, this.mUseOnShow);
                } else if (index == C1528R.styleable.MotionHelper_onHide) {
                    this.mUseOnHide = typedArrayObtainStyledAttributes.getBoolean(index, this.mUseOnHide);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mUseOnShow = false;
        this.mUseOnHide = false;
        init(attributeSet);
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mUseOnShow = false;
        this.mUseOnHide = false;
        init(attributeSet);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public void onFinishedMotionScene(MotionLayout motionLayout) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public void onPostDraw(Canvas canvas) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public void onPreDraw(Canvas canvas) {
    }

    public void onPreSetup(MotionLayout motionLayout, HashMap<View, MotionController> map) {
    }

    public void onTransitionCompleted(MotionLayout motionLayout, int i11) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionStarted(MotionLayout motionLayout, int i11, int i12) {
    }

    public void onTransitionChange(MotionLayout motionLayout, int i11, int i12, float f11) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionTrigger(MotionLayout motionLayout, int i11, boolean z11, float f11) {
    }
}
