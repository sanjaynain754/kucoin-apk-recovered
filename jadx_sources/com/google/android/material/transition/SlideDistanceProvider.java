package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import com.google.android.material.C7090R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes45.dex */
public final class SlideDistanceProvider implements VisibilityAnimatorProvider {
    private static final int DEFAULT_DISTANCE = -1;

    @Px
    private int slideDistance = -1;
    private int slideEdge;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface GravityFlag {
    }

    private static Animator createTranslationXAnimator(final View view, float f11, float f12, final float f13) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f11, f12));
        objectAnimatorOfPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.SlideDistanceProvider.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setTranslationX(f13);
            }
        });
        return objectAnimatorOfPropertyValuesHolder;
    }

    private static Animator createTranslationYAnimator(final View view, float f11, float f12, final float f13) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f11, f12));
        objectAnimatorOfPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.SlideDistanceProvider.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setTranslationY(f13);
            }
        });
        return objectAnimatorOfPropertyValuesHolder;
    }

    private int getSlideDistanceOrDefault(Context context) {
        int i11 = this.slideDistance;
        return i11 != -1 ? i11 : context.getResources().getDimensionPixelSize(C7090R.dimen.mtrl_transition_shared_axis_slide_distance);
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return createTranslationAppearAnimator(viewGroup, view, this.slideEdge, getSlideDistanceOrDefault(view.getContext()));
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return createTranslationDisappearAnimator(viewGroup, view, this.slideEdge, getSlideDistanceOrDefault(view.getContext()));
    }

    @Px
    public int getSlideDistance() {
        return this.slideDistance;
    }

    public int getSlideEdge() {
        return this.slideEdge;
    }

    public void setSlideDistance(@Px int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
        }
        this.slideDistance = i11;
    }

    public void setSlideEdge(int i11) {
        this.slideEdge = i11;
    }

    public SlideDistanceProvider(int i11) {
        this.slideEdge = i11;
    }

    private static Animator createTranslationAppearAnimator(View view, View view2, int i11, @Px int i12) {
        float f11;
        float f12;
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i11 != 3) {
            if (i11 != 5) {
                if (i11 != 48) {
                    if (i11 != 80) {
                        if (i11 != 8388611) {
                            if (i11 == 8388613) {
                                if (isRtl(view)) {
                                    f12 = translationX - i12;
                                } else {
                                    f12 = i12 + translationX;
                                }
                                return createTranslationXAnimator(view2, f12, translationX, translationX);
                            }
                            throw new IllegalArgumentException("Invalid slide direction: " + i11);
                        }
                        if (isRtl(view)) {
                            f11 = i12 + translationX;
                        } else {
                            f11 = translationX - i12;
                        }
                        return createTranslationXAnimator(view2, f11, translationX, translationX);
                    }
                    return createTranslationYAnimator(view2, i12 + translationY, translationY, translationY);
                }
                return createTranslationYAnimator(view2, translationY - i12, translationY, translationY);
            }
            return createTranslationXAnimator(view2, translationX - i12, translationX, translationX);
        }
        return createTranslationXAnimator(view2, i12 + translationX, translationX, translationX);
    }

    private static Animator createTranslationDisappearAnimator(View view, View view2, int i11, @Px int i12) {
        float f11;
        float f12;
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i11 != 3) {
            if (i11 != 5) {
                if (i11 != 48) {
                    if (i11 != 80) {
                        if (i11 != 8388611) {
                            if (i11 == 8388613) {
                                if (isRtl(view)) {
                                    f12 = i12 + translationX;
                                } else {
                                    f12 = translationX - i12;
                                }
                                return createTranslationXAnimator(view2, translationX, f12, translationX);
                            }
                            throw new IllegalArgumentException("Invalid slide direction: " + i11);
                        }
                        if (isRtl(view)) {
                            f11 = translationX - i12;
                        } else {
                            f11 = i12 + translationX;
                        }
                        return createTranslationXAnimator(view2, translationX, f11, translationX);
                    }
                    return createTranslationYAnimator(view2, translationY, translationY - i12, translationY);
                }
                return createTranslationYAnimator(view2, translationY, i12 + translationY, translationY);
            }
            return createTranslationXAnimator(view2, translationX, i12 + translationX, translationX);
        }
        return createTranslationXAnimator(view2, translationX, translationX - i12, translationX);
    }

    private static boolean isRtl(View view) {
        if (view.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }
}
