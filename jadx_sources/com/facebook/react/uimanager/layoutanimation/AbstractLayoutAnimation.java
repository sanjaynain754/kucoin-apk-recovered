package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.IllegalViewOperationException;
import java.util.Map;

/* JADX INFO: loaded from: classes45.dex */
abstract class AbstractLayoutAnimation {
    private static final Map<InterpolatorType, BaseInterpolator> INTERPOLATOR = MapBuilder.m10225of(InterpolatorType.LINEAR, new LinearInterpolator(), InterpolatorType.EASE_IN, new AccelerateInterpolator(), InterpolatorType.EASE_OUT, new DecelerateInterpolator(), InterpolatorType.EASE_IN_EASE_OUT, new AccelerateDecelerateInterpolator());
    private static final boolean SLOWDOWN_ANIMATION_MODE = false;

    @Nullable
    protected AnimatedPropertyType mAnimatedProperty;
    private int mDelayMs;
    protected int mDurationMs;

    @Nullable
    private Interpolator mInterpolator;

    @Nullable
    public abstract Animation createAnimationImpl(View view, int i11, int i12, int i13, int i14);

    public abstract boolean isValid();

    public void reset() {
        this.mAnimatedProperty = null;
        this.mDurationMs = 0;
        this.mDelayMs = 0;
        this.mInterpolator = null;
    }

    private static Interpolator getInterpolator(InterpolatorType interpolatorType, ReadableMap readableMap) {
        BaseInterpolator simpleSpringInterpolator = interpolatorType.equals(InterpolatorType.SPRING) ? new SimpleSpringInterpolator(SimpleSpringInterpolator.getSpringDamping(readableMap)) : INTERPOLATOR.get(interpolatorType);
        if (simpleSpringInterpolator != null) {
            return simpleSpringInterpolator;
        }
        throw new IllegalArgumentException("Missing interpolator for type : " + interpolatorType);
    }

    @Nullable
    public final Animation createAnimation(View view, int i11, int i12, int i13, int i14) {
        if (!isValid()) {
            return null;
        }
        Animation animationCreateAnimationImpl = createAnimationImpl(view, i11, i12, i13, i14);
        if (animationCreateAnimationImpl != null) {
            animationCreateAnimationImpl.setDuration(this.mDurationMs);
            animationCreateAnimationImpl.setStartOffset(this.mDelayMs);
            animationCreateAnimationImpl.setInterpolator(this.mInterpolator);
        }
        return animationCreateAnimationImpl;
    }

    public void initializeFromConfig(ReadableMap readableMap, int i11) {
        AnimatedPropertyType animatedPropertyTypeFromString;
        int i12;
        if (readableMap.hasKey("property")) {
            animatedPropertyTypeFromString = AnimatedPropertyType.fromString(readableMap.getString("property"));
        } else {
            animatedPropertyTypeFromString = null;
        }
        this.mAnimatedProperty = animatedPropertyTypeFromString;
        if (readableMap.hasKey(TypedValues.TransitionType.S_DURATION)) {
            i11 = readableMap.getInt(TypedValues.TransitionType.S_DURATION);
        }
        this.mDurationMs = i11;
        if (readableMap.hasKey("delay")) {
            i12 = readableMap.getInt("delay");
        } else {
            i12 = 0;
        }
        this.mDelayMs = i12;
        if (readableMap.hasKey("type")) {
            this.mInterpolator = getInterpolator(InterpolatorType.fromString(readableMap.getString("type")), readableMap);
            if (isValid()) {
                return;
            }
            throw new IllegalViewOperationException("Invalid layout animation : " + readableMap);
        }
        throw new IllegalArgumentException("Missing interpolation type.");
    }
}
