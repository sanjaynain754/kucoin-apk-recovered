package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
class TranslationAnimationCreator {

    public static class TransitionPositionListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        private boolean mIsTransitionCanceled;
        private final View mMovingView;
        private float mPausedX;
        private float mPausedY;
        private final float mTerminalX;
        private final float mTerminalY;
        private int[] mTransitionPosition;
        private final View mViewInHierarchy;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.mIsTransitionCanceled = true;
            this.mMovingView.setTranslationX(this.mTerminalX);
            this.mMovingView.setTranslationY(this.mTerminalY);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z11) {
            if (z11) {
                return;
            }
            this.mMovingView.setTranslationX(this.mTerminalX);
            this.mMovingView.setTranslationY(this.mTerminalY);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(@NonNull Transition transition) {
            this.mIsTransitionCanceled = true;
            this.mMovingView.setTranslationX(this.mTerminalX);
            this.mMovingView.setTranslationY(this.mTerminalY);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@NonNull Transition transition, boolean z11) {
            if (this.mIsTransitionCanceled) {
                return;
            }
            this.mViewInHierarchy.setTag(C4093R.id.transition_position, null);
        }

        private void setInterruptedPosition() {
            if (this.mTransitionPosition == null) {
                this.mTransitionPosition = new int[2];
            }
            this.mMovingView.getLocationOnScreen(this.mTransitionPosition);
            this.mViewInHierarchy.setTag(C4093R.id.transition_position, this.mTransitionPosition);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(@NonNull Transition transition) {
            this.mMovingView.setTranslationX(this.mPausedX);
            this.mMovingView.setTranslationY(this.mPausedY);
        }

        public TransitionPositionListener(View view, View view2, float f11, float f12) {
            this.mMovingView = view;
            this.mViewInHierarchy = view2;
            this.mTerminalX = f11;
            this.mTerminalY = f12;
            int i11 = C4093R.id.transition_position;
            int[] iArr = (int[]) view2.getTag(i11);
            this.mTransitionPosition = iArr;
            if (iArr != null) {
                view2.setTag(i11, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@NonNull Transition transition) {
            onTransitionEnd(transition, false);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(@NonNull Transition transition) {
            setInterruptedPosition();
            this.mPausedX = this.mMovingView.getTranslationX();
            this.mPausedY = this.mMovingView.getTranslationY();
            this.mMovingView.setTranslationX(this.mTerminalX);
            this.mMovingView.setTranslationY(this.mTerminalY);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(@NonNull Transition transition) {
        }
    }

    @Nullable
    public static Animator createAnimation(@NonNull View view, @NonNull TransitionValues transitionValues, int i11, int i12, float f11, float f12, float f13, float f14, @Nullable TimeInterpolator timeInterpolator, @NonNull Transition transition) {
        float f15;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) transitionValues.view.getTag(C4093R.id.transition_position);
        if (iArr != null) {
            f11 = (iArr[0] - i11) + translationX;
            f15 = (iArr[1] - i12) + translationY;
        } else {
            f15 = f12;
        }
        view.setTranslationX(f11);
        view.setTranslationY(f15);
        if (f11 == f13 && f15 == f14) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f11, f13), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f15, f14));
        TransitionPositionListener transitionPositionListener = new TransitionPositionListener(view, transitionValues.view, translationX, translationY);
        transition.addListener(transitionPositionListener);
        objectAnimatorOfPropertyValuesHolder.addListener(transitionPositionListener);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    private TranslationAnimationCreator() {
    }
}
