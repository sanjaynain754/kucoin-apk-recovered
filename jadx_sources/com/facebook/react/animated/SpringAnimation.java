package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.layoutanimation.SimpleSpringInterpolator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SpringAnimation.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u0000 '2\u00020\u0001:\u0002&'B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0007H\u0016J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0011H\u0002J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u000bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\"¨\u0006("}, m90084d2 = {"Lcom/facebook/react/animated/SpringAnimation;", "Lcom/facebook/react/animated/AnimationDriver;", "config", "Lcom/facebook/react/bridge/ReadableMap;", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;)V", "lastTime", "", "springStarted", "", "springStiffness", "", SimpleSpringInterpolator.PARAM_SPRING_DAMPING, "springMass", "initialVelocity", "overshootClampingEnabled", "currentState", "Lcom/facebook/react/animated/SpringAnimation$PhysicsState;", "startValue", "endValue", "restSpeedThreshold", "displacementFromRestThreshold", "timeAccumulator", "iterations", "", "currentLoop", "originalValue", "resetConfig", "", "runAnimationStep", "frameTimeNanos", "getDisplacementDistanceForState", "state", "isAtRest", "()Z", "isOvershooting", "advance", "realDeltaTime", "PhysicsState", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpringAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringAnimation.kt\ncom/facebook/react/animated/SpringAnimation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,188:1\n1#2:189\n*E\n"})
public final class SpringAnimation extends AnimationDriver {
    private static final double MAX_DELTA_TIME_SEC = 0.064d;
    private int currentLoop;

    @NotNull
    private final PhysicsState currentState;
    private double displacementFromRestThreshold;
    private double endValue;
    private double initialVelocity;
    private int iterations;
    private long lastTime;
    private double originalValue;
    private boolean overshootClampingEnabled;
    private double restSpeedThreshold;
    private double springDamping;
    private double springMass;
    private boolean springStarted;
    private double springStiffness;
    private double startValue;
    private double timeAccumulator;

    /* JADX INFO: compiled from: SpringAnimation.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0017"}, m90084d2 = {"Lcom/facebook/react/animated/SpringAnimation$PhysicsState;", "", ViewProps.POSITION, "", "velocity", "<init>", "(DD)V", "getPosition", "()D", "setPosition", "(D)V", "getVelocity", "setVelocity", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final /* data */ class PhysicsState {
        private double position;
        private double velocity;

        public PhysicsState() {
            this(0.0d, 0.0d, 3, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhysicsState)) {
                return false;
            }
            PhysicsState physicsState = (PhysicsState) other;
            return Double.compare(this.position, physicsState.position) == 0 && Double.compare(this.velocity, physicsState.velocity) == 0;
        }

        public PhysicsState(double d11, double d12) {
            this.position = d11;
            this.velocity = d12;
        }

        public static /* synthetic */ PhysicsState copy$default(PhysicsState physicsState, double d11, double d12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                d11 = physicsState.position;
            }
            if ((i11 & 2) != 0) {
                d12 = physicsState.velocity;
            }
            return physicsState.copy(d11, d12);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final double getPosition() {
            return this.position;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final double getVelocity() {
            return this.velocity;
        }

        @NotNull
        public final PhysicsState copy(double position, double velocity) {
            return new PhysicsState(position, velocity);
        }

        public final double getPosition() {
            return this.position;
        }

        public final double getVelocity() {
            return this.velocity;
        }

        public int hashCode() {
            return (Double.hashCode(this.position) * 31) + Double.hashCode(this.velocity);
        }

        public final void setPosition(double d11) {
            this.position = d11;
        }

        public final void setVelocity(double d11) {
            this.velocity = d11;
        }

        @NotNull
        public String toString() {
            return "PhysicsState(position=" + this.position + ", velocity=" + this.velocity + ")";
        }

        public /* synthetic */ PhysicsState(double d11, double d12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 0.0d : d11, (i11 & 2) != 0 ? 0.0d : d12);
        }
    }

    public SpringAnimation(@NotNull ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        PhysicsState physicsState = new PhysicsState(0.0d, 0.0d, 3, null);
        this.currentState = physicsState;
        physicsState.setVelocity(config.getDouble("initialVelocity"));
        resetConfig(config);
    }

    private final void advance(double realDeltaTime) {
        double dSin;
        double dSin2;
        if (isAtRest()) {
            return;
        }
        double d11 = MAX_DELTA_TIME_SEC;
        if (realDeltaTime <= MAX_DELTA_TIME_SEC) {
            d11 = realDeltaTime;
        }
        this.timeAccumulator += d11;
        double d12 = this.springDamping;
        double d13 = this.springMass;
        double d14 = this.springStiffness;
        double d15 = -this.initialVelocity;
        double dSqrt = d12 / (((double) 2) * Math.sqrt(d14 * d13));
        double dSqrt2 = Math.sqrt(d14 / d13);
        double dSqrt3 = Math.sqrt(1.0d - (dSqrt * dSqrt)) * dSqrt2;
        double d16 = this.endValue - this.startValue;
        double d17 = this.timeAccumulator;
        if (dSqrt < 1.0d) {
            double dExp = Math.exp((-dSqrt) * dSqrt2 * d17);
            double d18 = dSqrt2 * dSqrt;
            double d19 = d15 + (d18 * d16);
            double d21 = d17 * dSqrt3;
            dSin2 = this.endValue - ((((d19 / dSqrt3) * Math.sin(d21)) + (Math.cos(d21) * d16)) * dExp);
            dSin = ((d18 * dExp) * (((Math.sin(d21) * d19) / dSqrt3) + (Math.cos(d21) * d16))) - (dExp * ((Math.cos(d21) * d19) - ((dSqrt3 * d16) * Math.sin(d21))));
        } else {
            double dExp2 = Math.exp((-dSqrt2) * d17);
            double d22 = this.endValue - (((((dSqrt2 * d16) + d15) * d17) + d16) * dExp2);
            dSin = dExp2 * ((d15 * ((d17 * dSqrt2) - ((double) 1))) + (d17 * d16 * dSqrt2 * dSqrt2));
            dSin2 = d22;
        }
        this.currentState.setPosition(dSin2);
        this.currentState.setVelocity(dSin);
        if (isAtRest() || (this.overshootClampingEnabled && isOvershooting())) {
            if (this.springStiffness > 0.0d) {
                double d23 = this.endValue;
                this.startValue = d23;
                this.currentState.setPosition(d23);
            } else {
                double position = this.currentState.getPosition();
                this.endValue = position;
                this.startValue = position;
            }
            this.currentState.setVelocity(0.0d);
        }
    }

    private final double getDisplacementDistanceForState(PhysicsState state) {
        return Math.abs(this.endValue - state.getPosition());
    }

    private final boolean isAtRest() {
        if (Math.abs(this.currentState.getVelocity()) <= this.restSpeedThreshold) {
            return getDisplacementDistanceForState(this.currentState) <= this.displacementFromRestThreshold || this.springStiffness == 0.0d;
        }
        return false;
    }

    private final boolean isOvershooting() {
        if (this.springStiffness <= 0.0d) {
            return false;
        }
        if (this.startValue >= this.endValue || this.currentState.getPosition() <= this.endValue) {
            return this.startValue > this.endValue && this.currentState.getPosition() < this.endValue;
        }
        return true;
    }

    @Override // com.facebook.react.animated.AnimationDriver
    public void resetConfig(@NotNull ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.springStiffness = config.getDouble("stiffness");
        this.springDamping = config.getDouble("damping");
        this.springMass = config.getDouble("mass");
        this.initialVelocity = this.currentState.getVelocity();
        this.endValue = config.getDouble("toValue");
        this.restSpeedThreshold = config.getDouble("restSpeedThreshold");
        this.displacementFromRestThreshold = config.getDouble("restDisplacementThreshold");
        this.overshootClampingEnabled = config.getBoolean("overshootClamping");
        int i11 = config.hasKey("iterations") ? config.getInt("iterations") : 1;
        this.iterations = i11;
        this.hasFinished = i11 == 0;
        this.currentLoop = 0;
        this.timeAccumulator = 0.0d;
        this.springStarted = false;
    }

    @Override // com.facebook.react.animated.AnimationDriver
    public void runAnimationStep(long frameTimeNanos) {
        ValueAnimatedNode valueAnimatedNode = this.animatedValue;
        if (valueAnimatedNode == null) {
            throw new IllegalArgumentException("Animated value should not be null");
        }
        long j11 = frameTimeNanos / ((long) 1000000);
        if (!this.springStarted) {
            if (this.currentLoop == 0) {
                this.originalValue = valueAnimatedNode.nodeValue;
                this.currentLoop = 1;
            }
            this.currentState.setPosition(valueAnimatedNode.nodeValue);
            this.startValue = this.currentState.getPosition();
            this.lastTime = j11;
            this.timeAccumulator = 0.0d;
            this.springStarted = true;
        }
        advance((j11 - this.lastTime) / 1000.0d);
        this.lastTime = j11;
        valueAnimatedNode.nodeValue = this.currentState.getPosition();
        if (isAtRest()) {
            int i11 = this.iterations;
            if (i11 != -1 && this.currentLoop >= i11) {
                this.hasFinished = true;
                return;
            }
            this.springStarted = false;
            valueAnimatedNode.nodeValue = this.originalValue;
            this.currentLoop++;
        }
    }
}
