package com.facebook.react.uimanager.layoutanimation;

import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;

/* JADX INFO: loaded from: classes45.dex */
public class LayoutAnimationController {

    @Nullable
    private Runnable mCompletionRunnable;
    private boolean mShouldAnimateLayout;
    private final AbstractLayoutAnimation mLayoutCreateAnimation = new LayoutCreateAnimation();
    private final AbstractLayoutAnimation mLayoutUpdateAnimation = new LayoutUpdateAnimation();
    private final AbstractLayoutAnimation mLayoutDeleteAnimation = new LayoutDeleteAnimation();
    private final SparseArray<LayoutHandlingAnimation> mLayoutHandlers = new SparseArray<>(0);
    private long mMaxAnimationDuration = -1;

    private void disableUserInteractions(View view) {
        view.setClickable(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                disableUserInteractions(viewGroup.getChildAt(i11));
            }
        }
    }

    public boolean shouldAnimateLayout(View view) {
        if (view == null) {
            return false;
        }
        return (this.mShouldAnimateLayout && view.getParent() != null) || this.mLayoutHandlers.get(view.getId()) != null;
    }

    private void scheduleCompletionCallback(long j11) {
        if (this.mCompletionRunnable != null) {
            Handler uiThreadHandler = UiThreadUtil.getUiThreadHandler();
            uiThreadHandler.removeCallbacks(this.mCompletionRunnable);
            uiThreadHandler.postDelayed(this.mCompletionRunnable, j11);
        }
    }

    public void initializeFromConfig(@Nullable ReadableMap readableMap, final Callback callback) {
        if (readableMap == null) {
            reset();
            return;
        }
        this.mShouldAnimateLayout = false;
        int i11 = readableMap.hasKey(TypedValues.TransitionType.S_DURATION) ? readableMap.getInt(TypedValues.TransitionType.S_DURATION) : 0;
        LayoutAnimationType layoutAnimationType = LayoutAnimationType.CREATE;
        if (readableMap.hasKey(LayoutAnimationType.toString(layoutAnimationType))) {
            this.mLayoutCreateAnimation.initializeFromConfig(readableMap.getMap(LayoutAnimationType.toString(layoutAnimationType)), i11);
            this.mShouldAnimateLayout = true;
        }
        LayoutAnimationType layoutAnimationType2 = LayoutAnimationType.UPDATE;
        if (readableMap.hasKey(LayoutAnimationType.toString(layoutAnimationType2))) {
            this.mLayoutUpdateAnimation.initializeFromConfig(readableMap.getMap(LayoutAnimationType.toString(layoutAnimationType2)), i11);
            this.mShouldAnimateLayout = true;
        }
        LayoutAnimationType layoutAnimationType3 = LayoutAnimationType.DELETE;
        if (readableMap.hasKey(LayoutAnimationType.toString(layoutAnimationType3))) {
            this.mLayoutDeleteAnimation.initializeFromConfig(readableMap.getMap(LayoutAnimationType.toString(layoutAnimationType3)), i11);
            this.mShouldAnimateLayout = true;
        }
        if (!this.mShouldAnimateLayout || callback == null) {
            return;
        }
        this.mCompletionRunnable = new Runnable() { // from class: com.facebook.react.uimanager.layoutanimation.LayoutAnimationController.1
            @Override // java.lang.Runnable
            public void run() {
                callback.invoke(Boolean.TRUE);
            }
        };
    }

    public void reset() {
        this.mLayoutCreateAnimation.reset();
        this.mLayoutUpdateAnimation.reset();
        this.mLayoutDeleteAnimation.reset();
        this.mCompletionRunnable = null;
        this.mShouldAnimateLayout = false;
        this.mMaxAnimationDuration = -1L;
    }

    public void applyLayoutUpdate(View view, int i11, int i12, int i13, int i14) {
        AbstractLayoutAnimation abstractLayoutAnimation;
        UiThreadUtil.assertOnUiThread();
        final int id2 = view.getId();
        LayoutHandlingAnimation layoutHandlingAnimation = this.mLayoutHandlers.get(id2);
        if (layoutHandlingAnimation != null) {
            layoutHandlingAnimation.onLayoutUpdate(i11, i12, i13, i14);
            return;
        }
        if (view.getWidth() != 0 && view.getHeight() != 0) {
            abstractLayoutAnimation = this.mLayoutUpdateAnimation;
        } else {
            abstractLayoutAnimation = this.mLayoutCreateAnimation;
        }
        Animation animationCreateAnimation = abstractLayoutAnimation.createAnimation(view, i11, i12, i13, i14);
        if (animationCreateAnimation instanceof LayoutHandlingAnimation) {
            animationCreateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.facebook.react.uimanager.layoutanimation.LayoutAnimationController.2
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    LayoutAnimationController.this.mLayoutHandlers.remove(id2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    LayoutAnimationController.this.mLayoutHandlers.put(id2, (LayoutHandlingAnimation) animation);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }
            });
        } else {
            view.layout(i11, i12, i11 + i13, i12 + i14);
        }
        if (animationCreateAnimation != null) {
            long duration = animationCreateAnimation.getDuration();
            if (duration > this.mMaxAnimationDuration) {
                this.mMaxAnimationDuration = duration;
                scheduleCompletionCallback(duration);
            }
            view.startAnimation(animationCreateAnimation);
        }
    }

    public void deleteView(View view, final LayoutAnimationListener layoutAnimationListener) {
        UiThreadUtil.assertOnUiThread();
        Animation animationCreateAnimation = this.mLayoutDeleteAnimation.createAnimation(view, view.getLeft(), view.getTop(), view.getWidth(), view.getHeight());
        if (animationCreateAnimation != null) {
            disableUserInteractions(view);
            animationCreateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.facebook.react.uimanager.layoutanimation.LayoutAnimationController.3
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    layoutAnimationListener.onAnimationEnd();
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }
            });
            long duration = animationCreateAnimation.getDuration();
            if (duration > this.mMaxAnimationDuration) {
                scheduleCompletionCallback(duration);
                this.mMaxAnimationDuration = duration;
            }
            view.startAnimation(animationCreateAnimation);
            return;
        }
        layoutAnimationListener.onAnimationEnd();
    }
}
