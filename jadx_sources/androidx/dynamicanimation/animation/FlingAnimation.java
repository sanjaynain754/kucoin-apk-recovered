package androidx.dynamicanimation.animation;

import androidx.annotation.FloatRange;

/* JADX INFO: loaded from: classes34.dex */
public final class FlingAnimation extends DynamicAnimation<FlingAnimation> {
    private final DragForce mFlingForce;

    public static final class DragForce implements Force {
        private static final float DEFAULT_FRICTION = -4.2f;
        private static final float VELOCITY_THRESHOLD_MULTIPLIER = 62.5f;
        private float mFriction = DEFAULT_FRICTION;
        private final DynamicAnimation.MassState mMassState = new DynamicAnimation.MassState();
        private float mVelocityThreshold;

        @Override // androidx.dynamicanimation.animation.Force
        public float getAcceleration(float f11, float f12) {
            return f12 * this.mFriction;
        }

        public float getFrictionScalar() {
            return this.mFriction / DEFAULT_FRICTION;
        }

        public void setValueThreshold(float f11) {
            this.mVelocityThreshold = f11 * VELOCITY_THRESHOLD_MULTIPLIER;
        }

        public DynamicAnimation.MassState updateValueAndVelocity(float f11, float f12, long j11) {
            this.mMassState.mVelocity = (float) (((double) f12) * Math.exp((j11 / 1000.0f) * this.mFriction));
            DynamicAnimation.MassState massState = this.mMassState;
            float f13 = massState.mVelocity;
            float f14 = f11 + ((f13 - f12) / this.mFriction);
            massState.mValue = f14;
            if (isAtEquilibrium(f14, f13)) {
                this.mMassState.mVelocity = 0.0f;
            }
            return this.mMassState;
        }

        @Override // androidx.dynamicanimation.animation.Force
        public boolean isAtEquilibrium(float f11, float f12) {
            if (Math.abs(f12) < this.mVelocityThreshold) {
                return true;
            }
            return false;
        }

        public void setFrictionScalar(float f11) {
            this.mFriction = f11 * DEFAULT_FRICTION;
        }
    }

    public FlingAnimation(FloatValueHolder floatValueHolder) {
        super(floatValueHolder);
        DragForce dragForce = new DragForce();
        this.mFlingForce = dragForce;
        dragForce.setValueThreshold(getValueThreshold());
    }

    public FlingAnimation setFriction(@FloatRange(from = 0.0d, fromInclusive = false) float f11) {
        if (f11 <= 0.0f) {
            throw new IllegalArgumentException("Friction must be positive");
        }
        this.mFlingForce.setFrictionScalar(f11);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public float getAcceleration(float f11, float f12) {
        return this.mFlingForce.getAcceleration(f11, f12);
    }

    public float getFriction() {
        return this.mFlingForce.getFrictionScalar();
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public boolean isAtEquilibrium(float f11, float f12) {
        return f11 >= this.mMaxValue || f11 <= this.mMinValue || this.mFlingForce.isAtEquilibrium(f11, f12);
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public FlingAnimation setMaxValue(float f11) {
        super.setMaxValue(f11);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public FlingAnimation setMinValue(float f11) {
        super.setMinValue(f11);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public FlingAnimation setStartVelocity(float f11) {
        super.setStartVelocity(f11);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public void setValueThreshold(float f11) {
        this.mFlingForce.setValueThreshold(f11);
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public boolean updateValueAndVelocity(long j11) {
        DynamicAnimation.MassState massStateUpdateValueAndVelocity = this.mFlingForce.updateValueAndVelocity(this.mValue, this.mVelocity, j11);
        float f11 = massStateUpdateValueAndVelocity.mValue;
        this.mValue = f11;
        float f12 = massStateUpdateValueAndVelocity.mVelocity;
        this.mVelocity = f12;
        float f13 = this.mMinValue;
        if (f11 < f13) {
            this.mValue = f13;
            return true;
        }
        float f14 = this.mMaxValue;
        if (f11 <= f14) {
            return isAtEquilibrium(f11, f12);
        }
        this.mValue = f14;
        return true;
    }

    public <K> FlingAnimation(K k11, FloatPropertyCompat<K> floatPropertyCompat) {
        super(k11, floatPropertyCompat);
        DragForce dragForce = new DragForce();
        this.mFlingForce = dragForce;
        dragForce.setValueThreshold(getValueThreshold());
    }
}
