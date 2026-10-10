package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.C1528R;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes23.dex */
public class Carousel extends MotionHelper {
    private static final boolean DEBUG = false;
    private static final String TAG = "Carousel";
    public static final int TOUCH_UP_CARRY_ON = 2;
    public static final int TOUCH_UP_IMMEDIATE_STOP = 1;
    private Adapter mAdapter;
    private int mAnimateTargetDelay;
    private int mBackwardTransition;
    private float mDampening;
    private int mEmptyViewBehavior;
    private int mFirstViewReference;
    private int mForwardTransition;
    private int mIndex;
    private boolean mInfiniteCarousel;
    int mLastStartId;
    private final ArrayList<View> mList;
    private MotionLayout mMotionLayout;
    private int mNextState;
    private int mPreviousIndex;
    private int mPreviousState;
    private int mStartIndex;
    private int mTargetIndex;
    private int mTouchUpMode;
    Runnable mUpdateRunnable;
    private float mVelocityThreshold;

    public interface Adapter {
        int count();

        void onNewItem(int i11);

        void populate(View view, int i11);
    }

    public Carousel(Context context) {
        super(context);
        this.mAdapter = null;
        this.mList = new ArrayList<>();
        this.mPreviousIndex = 0;
        this.mIndex = 0;
        this.mFirstViewReference = -1;
        this.mInfiniteCarousel = false;
        this.mBackwardTransition = -1;
        this.mForwardTransition = -1;
        this.mPreviousState = -1;
        this.mNextState = -1;
        this.mDampening = 0.9f;
        this.mStartIndex = 0;
        this.mEmptyViewBehavior = 4;
        this.mTouchUpMode = 1;
        this.mVelocityThreshold = 2.0f;
        this.mTargetIndex = -1;
        this.mAnimateTargetDelay = 200;
        this.mLastStartId = -1;
        this.mUpdateRunnable = new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1
            @Override // java.lang.Runnable
            public void run() {
                Carousel.this.mMotionLayout.setProgress(0.0f);
                Carousel.this.updateItems();
                Carousel.this.mAdapter.onNewItem(Carousel.this.mIndex);
                float velocity = Carousel.this.mMotionLayout.getVelocity();
                if (Carousel.this.mTouchUpMode != 2 || velocity <= Carousel.this.mVelocityThreshold || Carousel.this.mIndex >= Carousel.this.mAdapter.count() - 1) {
                    return;
                }
                final float f11 = velocity * Carousel.this.mDampening;
                if (Carousel.this.mIndex != 0 || Carousel.this.mPreviousIndex <= Carousel.this.mIndex) {
                    if (Carousel.this.mIndex != Carousel.this.mAdapter.count() - 1 || Carousel.this.mPreviousIndex >= Carousel.this.mIndex) {
                        Carousel.this.mMotionLayout.post(new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Carousel.this.mMotionLayout.touchAnimateTo(5, 1.0f, f11);
                            }
                        });
                    }
                }
            }
        };
    }

    private boolean enableTransition(int i11, boolean z11) {
        MotionLayout motionLayout;
        MotionScene.Transition transition;
        if (i11 == -1 || (motionLayout = this.mMotionLayout) == null || (transition = motionLayout.getTransition(i11)) == null || z11 == transition.isEnabled()) {
            return false;
        }
        transition.setEnabled(z11);
        return true;
    }

    private boolean updateViewVisibility(View view, int i11) {
        MotionLayout motionLayout = this.mMotionLayout;
        if (motionLayout == null) {
            return false;
        }
        boolean zUpdateViewVisibility = false;
        for (int i12 : motionLayout.getConstraintSetIds()) {
            zUpdateViewVisibility |= updateViewVisibility(i12, view, i11);
        }
        return zUpdateViewVisibility;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2271a(Carousel carousel) {
        carousel.mMotionLayout.setTransitionDuration(carousel.mAnimateTargetDelay);
        if (carousel.mTargetIndex < carousel.mIndex) {
            carousel.mMotionLayout.transitionToState(carousel.mPreviousState, carousel.mAnimateTargetDelay);
        } else {
            carousel.mMotionLayout.transitionToState(carousel.mNextState, carousel.mAnimateTargetDelay);
        }
    }

    private void enableAllTransitions(boolean z11) {
        Iterator<MotionScene.Transition> it = this.mMotionLayout.getDefinedTransitions().iterator();
        while (it.hasNext()) {
            it.next().setEnabled(z11);
        }
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1528R.styleable.Carousel);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == C1528R.styleable.Carousel_carousel_firstView) {
                    this.mFirstViewReference = typedArrayObtainStyledAttributes.getResourceId(index, this.mFirstViewReference);
                } else if (index == C1528R.styleable.Carousel_carousel_backwardTransition) {
                    this.mBackwardTransition = typedArrayObtainStyledAttributes.getResourceId(index, this.mBackwardTransition);
                } else if (index == C1528R.styleable.Carousel_carousel_forwardTransition) {
                    this.mForwardTransition = typedArrayObtainStyledAttributes.getResourceId(index, this.mForwardTransition);
                } else if (index == C1528R.styleable.Carousel_carousel_emptyViewsBehavior) {
                    this.mEmptyViewBehavior = typedArrayObtainStyledAttributes.getInt(index, this.mEmptyViewBehavior);
                } else if (index == C1528R.styleable.Carousel_carousel_previousState) {
                    this.mPreviousState = typedArrayObtainStyledAttributes.getResourceId(index, this.mPreviousState);
                } else if (index == C1528R.styleable.Carousel_carousel_nextState) {
                    this.mNextState = typedArrayObtainStyledAttributes.getResourceId(index, this.mNextState);
                } else if (index == C1528R.styleable.Carousel_carousel_touchUp_dampeningFactor) {
                    this.mDampening = typedArrayObtainStyledAttributes.getFloat(index, this.mDampening);
                } else if (index == C1528R.styleable.Carousel_carousel_touchUpMode) {
                    this.mTouchUpMode = typedArrayObtainStyledAttributes.getInt(index, this.mTouchUpMode);
                } else if (index == C1528R.styleable.Carousel_carousel_touchUp_velocityThreshold) {
                    this.mVelocityThreshold = typedArrayObtainStyledAttributes.getFloat(index, this.mVelocityThreshold);
                } else if (index == C1528R.styleable.Carousel_carousel_infinite) {
                    this.mInfiniteCarousel = typedArrayObtainStyledAttributes.getBoolean(index, this.mInfiniteCarousel);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateItems() {
        Adapter adapter = this.mAdapter;
        if (adapter == null || this.mMotionLayout == null || adapter.count() == 0) {
            return;
        }
        int size = this.mList.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.mList.get(i11);
            int iCount = (this.mIndex + i11) - this.mStartIndex;
            if (this.mInfiniteCarousel) {
                if (iCount < 0) {
                    int i12 = this.mEmptyViewBehavior;
                    if (i12 != 4) {
                        updateViewVisibility(view, i12);
                    } else {
                        updateViewVisibility(view, 0);
                    }
                    if (iCount % this.mAdapter.count() == 0) {
                        this.mAdapter.populate(view, 0);
                    } else {
                        Adapter adapter2 = this.mAdapter;
                        adapter2.populate(view, adapter2.count() + (iCount % this.mAdapter.count()));
                    }
                } else if (iCount >= this.mAdapter.count()) {
                    if (iCount == this.mAdapter.count()) {
                        iCount = 0;
                    } else if (iCount > this.mAdapter.count()) {
                        iCount %= this.mAdapter.count();
                    }
                    int i13 = this.mEmptyViewBehavior;
                    if (i13 != 4) {
                        updateViewVisibility(view, i13);
                    } else {
                        updateViewVisibility(view, 0);
                    }
                    this.mAdapter.populate(view, iCount);
                } else {
                    updateViewVisibility(view, 0);
                    this.mAdapter.populate(view, iCount);
                }
            } else if (iCount < 0) {
                updateViewVisibility(view, this.mEmptyViewBehavior);
            } else if (iCount >= this.mAdapter.count()) {
                updateViewVisibility(view, this.mEmptyViewBehavior);
            } else {
                updateViewVisibility(view, 0);
                this.mAdapter.populate(view, iCount);
            }
        }
        int i14 = this.mTargetIndex;
        if (i14 != -1 && i14 != this.mIndex) {
            this.mMotionLayout.post(new Runnable() { // from class: androidx.constraintlayout.helper.widget.a
                @Override // java.lang.Runnable
                public final void run() {
                    Carousel.m2271a(this.f2209b);
                }
            });
        } else if (i14 == this.mIndex) {
            this.mTargetIndex = -1;
        }
        if (this.mBackwardTransition == -1 || this.mForwardTransition == -1) {
            Log.w(TAG, "No backward or forward transitions defined for Carousel!");
            return;
        }
        if (this.mInfiniteCarousel) {
            return;
        }
        int iCount2 = this.mAdapter.count();
        if (this.mIndex == 0) {
            enableTransition(this.mBackwardTransition, false);
        } else {
            enableTransition(this.mBackwardTransition, true);
            this.mMotionLayout.setTransition(this.mBackwardTransition);
        }
        if (this.mIndex == iCount2 - 1) {
            enableTransition(this.mForwardTransition, false);
        } else {
            enableTransition(this.mForwardTransition, true);
            this.mMotionLayout.setTransition(this.mForwardTransition);
        }
    }

    public int getCount() {
        Adapter adapter = this.mAdapter;
        if (adapter != null) {
            return adapter.count();
        }
        return 0;
    }

    public int getCurrentIndex() {
        return this.mIndex;
    }

    public boolean isInfinite() {
        return this.mInfiniteCarousel;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionChange(MotionLayout motionLayout, int i11, int i12, float f11) {
        this.mLastStartId = i11;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionCompleted(MotionLayout motionLayout, int i11) {
        int i12 = this.mIndex;
        this.mPreviousIndex = i12;
        if (i11 == this.mNextState) {
            this.mIndex = i12 + 1;
        } else if (i11 == this.mPreviousState) {
            this.mIndex = i12 - 1;
        }
        if (this.mInfiniteCarousel) {
            if (this.mIndex >= this.mAdapter.count()) {
                this.mIndex = 0;
            }
            if (this.mIndex < 0) {
                this.mIndex = this.mAdapter.count() - 1;
            }
        } else {
            if (this.mIndex >= this.mAdapter.count()) {
                this.mIndex = this.mAdapter.count() - 1;
            }
            if (this.mIndex < 0) {
                this.mIndex = 0;
            }
        }
        if (this.mPreviousIndex != this.mIndex) {
            this.mMotionLayout.post(this.mUpdateRunnable);
        }
    }

    public void refresh() {
        int size = this.mList.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.mList.get(i11);
            if (this.mAdapter.count() == 0) {
                updateViewVisibility(view, this.mEmptyViewBehavior);
            } else {
                updateViewVisibility(view, 0);
            }
        }
        this.mMotionLayout.rebuildScene();
        updateItems();
    }

    public void setAdapter(Adapter adapter) {
        this.mAdapter = adapter;
    }

    public void setInfinite(boolean z11) {
        this.mInfiniteCarousel = z11;
    }

    public void jumpToIndex(int i11) {
        this.mIndex = Math.max(0, Math.min(getCount() - 1, i11));
        refresh();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            this.mList.clear();
            for (int i11 = 0; i11 < this.mCount; i11++) {
                int i12 = this.mIds[i11];
                View viewById = motionLayout.getViewById(i12);
                if (this.mFirstViewReference == i12) {
                    this.mStartIndex = i11;
                }
                this.mList.add(viewById);
            }
            this.mMotionLayout = motionLayout;
            if (this.mTouchUpMode == 2) {
                MotionScene.Transition transition = motionLayout.getTransition(this.mForwardTransition);
                if (transition != null) {
                    transition.setOnTouchUp(5);
                }
                MotionScene.Transition transition2 = this.mMotionLayout.getTransition(this.mBackwardTransition);
                if (transition2 != null) {
                    transition2.setOnTouchUp(5);
                }
            }
            updateItems();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mList.clear();
    }

    public void transitionToIndex(int i11, int i12) {
        this.mTargetIndex = Math.max(0, Math.min(getCount() - 1, i11));
        int iMax = Math.max(0, i12);
        this.mAnimateTargetDelay = iMax;
        this.mMotionLayout.setTransitionDuration(iMax);
        if (i11 < this.mIndex) {
            this.mMotionLayout.transitionToState(this.mPreviousState, this.mAnimateTargetDelay);
        } else {
            this.mMotionLayout.transitionToState(this.mNextState, this.mAnimateTargetDelay);
        }
    }

    private boolean updateViewVisibility(int i11, View view, int i12) {
        ConstraintSet.Constraint constraint;
        ConstraintSet constraintSet = this.mMotionLayout.getConstraintSet(i11);
        if (constraintSet == null || (constraint = constraintSet.getConstraint(view.getId())) == null) {
            return false;
        }
        constraint.propertySet.mVisibilityMode = 1;
        view.setVisibility(i12);
        return true;
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAdapter = null;
        this.mList = new ArrayList<>();
        this.mPreviousIndex = 0;
        this.mIndex = 0;
        this.mFirstViewReference = -1;
        this.mInfiniteCarousel = false;
        this.mBackwardTransition = -1;
        this.mForwardTransition = -1;
        this.mPreviousState = -1;
        this.mNextState = -1;
        this.mDampening = 0.9f;
        this.mStartIndex = 0;
        this.mEmptyViewBehavior = 4;
        this.mTouchUpMode = 1;
        this.mVelocityThreshold = 2.0f;
        this.mTargetIndex = -1;
        this.mAnimateTargetDelay = 200;
        this.mLastStartId = -1;
        this.mUpdateRunnable = new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1
            @Override // java.lang.Runnable
            public void run() {
                Carousel.this.mMotionLayout.setProgress(0.0f);
                Carousel.this.updateItems();
                Carousel.this.mAdapter.onNewItem(Carousel.this.mIndex);
                float velocity = Carousel.this.mMotionLayout.getVelocity();
                if (Carousel.this.mTouchUpMode != 2 || velocity <= Carousel.this.mVelocityThreshold || Carousel.this.mIndex >= Carousel.this.mAdapter.count() - 1) {
                    return;
                }
                final float f11 = velocity * Carousel.this.mDampening;
                if (Carousel.this.mIndex != 0 || Carousel.this.mPreviousIndex <= Carousel.this.mIndex) {
                    if (Carousel.this.mIndex != Carousel.this.mAdapter.count() - 1 || Carousel.this.mPreviousIndex >= Carousel.this.mIndex) {
                        Carousel.this.mMotionLayout.post(new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Carousel.this.mMotionLayout.touchAnimateTo(5, 1.0f, f11);
                            }
                        });
                    }
                }
            }
        };
        init(context, attributeSet);
    }

    public Carousel(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mAdapter = null;
        this.mList = new ArrayList<>();
        this.mPreviousIndex = 0;
        this.mIndex = 0;
        this.mFirstViewReference = -1;
        this.mInfiniteCarousel = false;
        this.mBackwardTransition = -1;
        this.mForwardTransition = -1;
        this.mPreviousState = -1;
        this.mNextState = -1;
        this.mDampening = 0.9f;
        this.mStartIndex = 0;
        this.mEmptyViewBehavior = 4;
        this.mTouchUpMode = 1;
        this.mVelocityThreshold = 2.0f;
        this.mTargetIndex = -1;
        this.mAnimateTargetDelay = 200;
        this.mLastStartId = -1;
        this.mUpdateRunnable = new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1
            @Override // java.lang.Runnable
            public void run() {
                Carousel.this.mMotionLayout.setProgress(0.0f);
                Carousel.this.updateItems();
                Carousel.this.mAdapter.onNewItem(Carousel.this.mIndex);
                float velocity = Carousel.this.mMotionLayout.getVelocity();
                if (Carousel.this.mTouchUpMode != 2 || velocity <= Carousel.this.mVelocityThreshold || Carousel.this.mIndex >= Carousel.this.mAdapter.count() - 1) {
                    return;
                }
                final float f11 = velocity * Carousel.this.mDampening;
                if (Carousel.this.mIndex != 0 || Carousel.this.mPreviousIndex <= Carousel.this.mIndex) {
                    if (Carousel.this.mIndex != Carousel.this.mAdapter.count() - 1 || Carousel.this.mPreviousIndex >= Carousel.this.mIndex) {
                        Carousel.this.mMotionLayout.post(new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Carousel.this.mMotionLayout.touchAnimateTo(5, 1.0f, f11);
                            }
                        });
                    }
                }
            }
        };
        init(context, attributeSet);
    }
}
