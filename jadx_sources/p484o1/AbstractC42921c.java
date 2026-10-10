package p484o1;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: o1.c */
/* JADX INFO: compiled from: BaseLottieAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC42921c extends ValueAnimator {

    /* JADX INFO: renamed from: b */
    public final Set<ValueAnimator.AnimatorUpdateListener> f95023b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: c */
    public final Set<Animator.AnimatorListener> f95024c = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: d */
    public final Set<Animator.AnimatorPauseListener> f95025d = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: a */
    public void mo94145a() {
        Iterator<Animator.AnimatorListener> it = this.f95024c.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f95024c.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f95025d.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f95023b.add(animatorUpdateListener);
    }

    /* JADX INFO: renamed from: b */
    public void m94146b(boolean z11) {
        for (Animator.AnimatorListener animatorListener : this.f95024c) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z11);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m94147c() {
        Iterator<Animator.AnimatorPauseListener> it = this.f95025d.iterator();
        while (it.hasNext()) {
            it.next().onAnimationPause(this);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m94148d() {
        Iterator<Animator.AnimatorListener> it = this.f95024c.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m94149e() {
        Iterator<Animator.AnimatorPauseListener> it = this.f95025d.iterator();
        while (it.hasNext()) {
            it.next().onAnimationResume(this);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m94150f(boolean z11) {
        for (Animator.AnimatorListener animatorListener : this.f95024c) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z11);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m94151g() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.f95023b.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f95024c.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.f95023b.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f95024c.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f95025d.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f95023b.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j11) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j11) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }
}
