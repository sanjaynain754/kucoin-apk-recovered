package com.kubi.utils;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.CycleInterpolator;
import android.view.animation.TranslateAnimation;
import com.blankj.utilcode.util.C5275i0;
import io.reactivex.functions.Action;

/* JADX INFO: renamed from: com.kubi.utils.b */
/* JADX INFO: compiled from: AnimationUtil.java */
/* JADX INFO: loaded from: classes54.dex */
public class C27015b {

    /* JADX INFO: renamed from: com.kubi.utils.b$a */
    /* JADX INFO: compiled from: AnimationUtil.java */
    public class a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Action f54306a;

        public a(Action action) {
            this.f54306a = action;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Action action = this.f54306a;
            if (action == null) {
                return;
            }
            try {
                action.run();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.utils.b$b */
    /* JADX INFO: compiled from: AnimationUtil.java */
    public class b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Action f54307a;

        public b(Action action) {
            this.f54307a = action;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Action action = this.f54307a;
            if (action == null) {
                return;
            }
            try {
                action.run();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static Animation m66506a(Animation.AnimationListener animationListener) {
        RotateXYAnimation rotateXYAnimation = new RotateXYAnimation();
        rotateXYAnimation.setDuration(500L);
        rotateXYAnimation.setRepeatMode(2);
        rotateXYAnimation.setRepeatCount(-1);
        rotateXYAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        rotateXYAnimation.setAnimationListener(animationListener);
        return rotateXYAnimation;
    }

    /* JADX INFO: renamed from: b */
    public static Animation m66507b(Action action) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 20.0f, 0.0f, 0.0f);
        translateAnimation.setInterpolator(new CycleInterpolator(2.0f));
        translateAnimation.setDuration(300L);
        translateAnimation.setAnimationListener(new a(action));
        return translateAnimation;
    }

    /* JADX INFO: renamed from: c */
    public static Animation m66508c(boolean z11, Action action) {
        TranslateAnimation translateAnimation = z11 ? new TranslateAnimation(0.0f, 0.0f, 0.0f, C5275i0.m6236a(25.0f) + C5275i0.m6241f(16.0f)) : new TranslateAnimation(0.0f, 0.0f, 0.0f, -(C5275i0.m6236a(25.0f) + C5275i0.m6241f(16.0f)));
        translateAnimation.setDuration(300L);
        translateAnimation.setAnimationListener(new b(action));
        return translateAnimation;
    }
}
