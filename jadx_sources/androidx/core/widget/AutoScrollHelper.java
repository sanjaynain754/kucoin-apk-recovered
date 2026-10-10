package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes23.dex */
public abstract class AutoScrollHelper implements View.OnTouchListener {
    private static final int DEFAULT_ACTIVATION_DELAY = ViewConfiguration.getTapTimeout();
    private static final int DEFAULT_EDGE_TYPE = 1;
    private static final float DEFAULT_MAXIMUM_EDGE = Float.MAX_VALUE;
    private static final int DEFAULT_MAXIMUM_VELOCITY_DIPS = 1575;
    private static final int DEFAULT_MINIMUM_VELOCITY_DIPS = 315;
    private static final int DEFAULT_RAMP_DOWN_DURATION = 500;
    private static final int DEFAULT_RAMP_UP_DURATION = 500;
    private static final float DEFAULT_RELATIVE_EDGE = 0.2f;
    private static final float DEFAULT_RELATIVE_VELOCITY = 1.0f;
    public static final int EDGE_TYPE_INSIDE = 0;
    public static final int EDGE_TYPE_INSIDE_EXTEND = 1;
    public static final int EDGE_TYPE_OUTSIDE = 2;
    private static final int HORIZONTAL = 0;
    public static final float NO_MAX = Float.MAX_VALUE;
    public static final float NO_MIN = 0.0f;
    public static final float RELATIVE_UNSPECIFIED = 0.0f;
    private static final int VERTICAL = 1;
    private int mActivationDelay;
    private boolean mAlreadyDelayed;
    boolean mAnimating;
    private int mEdgeType;
    private boolean mEnabled;
    private boolean mExclusive;
    boolean mNeedsCancel;
    boolean mNeedsReset;
    private Runnable mRunnable;
    final View mTarget;
    final ClampedScroller mScroller = new ClampedScroller();
    private final Interpolator mEdgeInterpolator = new AccelerateInterpolator();
    private float[] mRelativeEdges = {0.0f, 0.0f};
    private float[] mMaximumEdges = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] mRelativeVelocity = {0.0f, 0.0f};
    private float[] mMinimumVelocity = {0.0f, 0.0f};
    private float[] mMaximumVelocity = {Float.MAX_VALUE, Float.MAX_VALUE};

    public static class ClampedScroller {
        private int mEffectiveRampDown;
        private int mRampDownDuration;
        private int mRampUpDuration;
        private float mStopValue;
        private float mTargetVelocityX;
        private float mTargetVelocityY;
        private long mStartTime = Long.MIN_VALUE;
        private long mStopTime = -1;
        private long mDeltaTime = 0;
        private int mDeltaX = 0;
        private int mDeltaY = 0;

        private float getValueAt(long j11) {
            long j12 = this.mStartTime;
            if (j11 < j12) {
                return 0.0f;
            }
            long j13 = this.mStopTime;
            if (j13 < 0 || j11 < j13) {
                return AutoScrollHelper.constrain((j11 - j12) / this.mRampUpDuration, 0.0f, 1.0f) * 0.5f;
            }
            float f11 = this.mStopValue;
            return (1.0f - f11) + (f11 * AutoScrollHelper.constrain((j11 - j13) / this.mEffectiveRampDown, 0.0f, 1.0f));
        }

        private float interpolateValue(float f11) {
            return ((-4.0f) * f11 * f11) + (f11 * 4.0f);
        }

        public void computeScrollDelta() {
            if (this.mDeltaTime == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fInterpolateValue = interpolateValue(getValueAt(jCurrentAnimationTimeMillis));
            long j11 = jCurrentAnimationTimeMillis - this.mDeltaTime;
            this.mDeltaTime = jCurrentAnimationTimeMillis;
            float f11 = j11 * fInterpolateValue;
            this.mDeltaX = (int) (this.mTargetVelocityX * f11);
            this.mDeltaY = (int) (f11 * this.mTargetVelocityY);
        }

        public int getDeltaX() {
            return this.mDeltaX;
        }

        public int getDeltaY() {
            return this.mDeltaY;
        }

        public int getHorizontalDirection() {
            float f11 = this.mTargetVelocityX;
            return (int) (f11 / Math.abs(f11));
        }

        public int getVerticalDirection() {
            float f11 = this.mTargetVelocityY;
            return (int) (f11 / Math.abs(f11));
        }

        public boolean isFinished() {
            return this.mStopTime > 0 && AnimationUtils.currentAnimationTimeMillis() > this.mStopTime + ((long) this.mEffectiveRampDown);
        }

        public void setRampDownDuration(int i11) {
            this.mRampDownDuration = i11;
        }

        public void setRampUpDuration(int i11) {
            this.mRampUpDuration = i11;
        }

        public void setTargetVelocity(float f11, float f12) {
            this.mTargetVelocityX = f11;
            this.mTargetVelocityY = f12;
        }

        public void requestStop() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.mEffectiveRampDown = AutoScrollHelper.constrain((int) (jCurrentAnimationTimeMillis - this.mStartTime), 0, this.mRampDownDuration);
            this.mStopValue = getValueAt(jCurrentAnimationTimeMillis);
            this.mStopTime = jCurrentAnimationTimeMillis;
        }

        public void start() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.mStartTime = jCurrentAnimationTimeMillis;
            this.mStopTime = -1L;
            this.mDeltaTime = jCurrentAnimationTimeMillis;
            this.mStopValue = 0.5f;
            this.mDeltaX = 0;
            this.mDeltaY = 0;
        }
    }

    public class ScrollAnimationRunnable implements Runnable {
        public ScrollAnimationRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AutoScrollHelper autoScrollHelper = AutoScrollHelper.this;
            if (autoScrollHelper.mAnimating) {
                if (autoScrollHelper.mNeedsReset) {
                    autoScrollHelper.mNeedsReset = false;
                    autoScrollHelper.mScroller.start();
                }
                ClampedScroller clampedScroller = AutoScrollHelper.this.mScroller;
                if (clampedScroller.isFinished() || !AutoScrollHelper.this.shouldAnimate()) {
                    AutoScrollHelper.this.mAnimating = false;
                    return;
                }
                AutoScrollHelper autoScrollHelper2 = AutoScrollHelper.this;
                if (autoScrollHelper2.mNeedsCancel) {
                    autoScrollHelper2.mNeedsCancel = false;
                    autoScrollHelper2.cancelTargetTouch();
                }
                clampedScroller.computeScrollDelta();
                AutoScrollHelper.this.scrollTargetBy(clampedScroller.getDeltaX(), clampedScroller.getDeltaY());
                ViewCompat.postOnAnimation(AutoScrollHelper.this.mTarget, this);
            }
        }
    }

    public static float constrain(float f11, float f12, float f13) {
        if (f11 > f13) {
            return f13;
        }
        return f11 < f12 ? f12 : f11;
    }

    private float constrainEdgeValue(float f11, float f12) {
        if (f12 == 0.0f) {
            return 0.0f;
        }
        int i11 = this.mEdgeType;
        if (i11 == 0 || i11 == 1) {
            if (f11 < f12) {
                if (f11 >= 0.0f) {
                    return 1.0f - (f11 / f12);
                }
                if (this.mAnimating && i11 == 1) {
                    return 1.0f;
                }
            }
        } else if (i11 == 2 && f11 < 0.0f) {
            return f11 / (-f12);
        }
        return 0.0f;
    }

    private float getEdgeValue(float f11, float f12, float f13, float f14) {
        float interpolation;
        float fConstrain = constrain(f11 * f12, 0.0f, f13);
        float fConstrainEdgeValue = constrainEdgeValue(f12 - f14, fConstrain) - constrainEdgeValue(f14, fConstrain);
        if (fConstrainEdgeValue < 0.0f) {
            interpolation = -this.mEdgeInterpolator.getInterpolation(-fConstrainEdgeValue);
        } else {
            if (fConstrainEdgeValue <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.mEdgeInterpolator.getInterpolation(fConstrainEdgeValue);
        }
        return constrain(interpolation, -1.0f, 1.0f);
    }

    public abstract boolean canTargetScrollHorizontally(int i11);

    public abstract boolean canTargetScrollVertically(int i11);

    public abstract void scrollTargetBy(int i11, int i12);

    private float computeTargetVelocity(int i11, float f11, float f12, float f13) {
        float edgeValue = getEdgeValue(this.mRelativeEdges[i11], f12, this.mMaximumEdges[i11], f11);
        if (edgeValue == 0.0f) {
            return 0.0f;
        }
        float f14 = this.mRelativeVelocity[i11];
        float f15 = this.mMinimumVelocity[i11];
        float f16 = this.mMaximumVelocity[i11];
        float f17 = f14 * f13;
        return edgeValue > 0.0f ? constrain(edgeValue * f17, f15, f16) : -constrain((-edgeValue) * f17, f15, f16);
    }

    public static int constrain(int i11, int i12, int i13) {
        if (i11 > i13) {
            return i13;
        }
        return i11 < i12 ? i12 : i11;
    }

    private void requestStop() {
        if (this.mNeedsReset) {
            this.mAnimating = false;
        } else {
            this.mScroller.requestStop();
        }
    }

    private void startAnimating() {
        int i11;
        if (this.mRunnable == null) {
            this.mRunnable = new ScrollAnimationRunnable();
        }
        this.mAnimating = true;
        this.mNeedsReset = true;
        if (this.mAlreadyDelayed || (i11 = this.mActivationDelay) <= 0) {
            this.mRunnable.run();
        } else {
            ViewCompat.postOnAnimationDelayed(this.mTarget, this.mRunnable, i11);
        }
        this.mAlreadyDelayed = true;
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public boolean isExclusive() {
        return this.mExclusive;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.mEnabled) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                requestStop();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    requestStop();
                }
            }
            return !this.mExclusive && this.mAnimating;
        }
        this.mNeedsCancel = true;
        this.mAlreadyDelayed = false;
        this.mScroller.setTargetVelocity(computeTargetVelocity(0, motionEvent.getX(), view.getWidth(), this.mTarget.getWidth()), computeTargetVelocity(1, motionEvent.getY(), view.getHeight(), this.mTarget.getHeight()));
        if (!this.mAnimating && shouldAnimate()) {
            startAnimating();
        }
        if (this.mExclusive) {
        }
    }

    @NonNull
    public AutoScrollHelper setActivationDelay(int i11) {
        this.mActivationDelay = i11;
        return this;
    }

    @NonNull
    public AutoScrollHelper setEdgeType(int i11) {
        this.mEdgeType = i11;
        return this;
    }

    public AutoScrollHelper setEnabled(boolean z11) {
        if (this.mEnabled && !z11) {
            requestStop();
        }
        this.mEnabled = z11;
        return this;
    }

    public AutoScrollHelper setExclusive(boolean z11) {
        this.mExclusive = z11;
        return this;
    }

    @NonNull
    public AutoScrollHelper setMaximumEdges(float f11, float f12) {
        float[] fArr = this.mMaximumEdges;
        fArr[0] = f11;
        fArr[1] = f12;
        return this;
    }

    @NonNull
    public AutoScrollHelper setMaximumVelocity(float f11, float f12) {
        float[] fArr = this.mMaximumVelocity;
        fArr[0] = f11 / 1000.0f;
        fArr[1] = f12 / 1000.0f;
        return this;
    }

    @NonNull
    public AutoScrollHelper setMinimumVelocity(float f11, float f12) {
        float[] fArr = this.mMinimumVelocity;
        fArr[0] = f11 / 1000.0f;
        fArr[1] = f12 / 1000.0f;
        return this;
    }

    @NonNull
    public AutoScrollHelper setRampDownDuration(int i11) {
        this.mScroller.setRampDownDuration(i11);
        return this;
    }

    @NonNull
    public AutoScrollHelper setRampUpDuration(int i11) {
        this.mScroller.setRampUpDuration(i11);
        return this;
    }

    @NonNull
    public AutoScrollHelper setRelativeEdges(float f11, float f12) {
        float[] fArr = this.mRelativeEdges;
        fArr[0] = f11;
        fArr[1] = f12;
        return this;
    }

    @NonNull
    public AutoScrollHelper setRelativeVelocity(float f11, float f12) {
        float[] fArr = this.mRelativeVelocity;
        fArr[0] = f11 / 1000.0f;
        fArr[1] = f12 / 1000.0f;
        return this;
    }

    public boolean shouldAnimate() {
        ClampedScroller clampedScroller = this.mScroller;
        int verticalDirection = clampedScroller.getVerticalDirection();
        int horizontalDirection = clampedScroller.getHorizontalDirection();
        if (verticalDirection == 0 || !canTargetScrollVertically(verticalDirection)) {
            return horizontalDirection != 0 && canTargetScrollHorizontally(horizontalDirection);
        }
        return true;
    }

    public AutoScrollHelper(@NonNull View view) {
        this.mTarget = view;
        float f11 = Resources.getSystem().getDisplayMetrics().density;
        float f12 = (int) ((1575.0f * f11) + 0.5f);
        setMaximumVelocity(f12, f12);
        float f13 = (int) ((f11 * 315.0f) + 0.5f);
        setMinimumVelocity(f13, f13);
        setEdgeType(1);
        setMaximumEdges(Float.MAX_VALUE, Float.MAX_VALUE);
        setRelativeEdges(0.2f, 0.2f);
        setRelativeVelocity(1.0f, 1.0f);
        setActivationDelay(DEFAULT_ACTIVATION_DELAY);
        setRampUpDuration(500);
        setRampDownDuration(500);
    }

    public void cancelTargetTouch() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.mTarget.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }
}
