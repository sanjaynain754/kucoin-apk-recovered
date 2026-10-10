package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.core.graphics.PathParser;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.material.C7090R;
import com.google.android.material.resources.MaterialAttributes;

/* JADX INFO: loaded from: classes.dex */
public class MotionUtils {
    private static final String EASING_TYPE_CUBIC_BEZIER = "cubic-bezier";
    private static final String EASING_TYPE_FORMAT_END = ")";
    private static final String EASING_TYPE_FORMAT_START = "(";
    private static final String EASING_TYPE_PATH = "path";

    private static float getLegacyControlPoint(String[] strArr, int i11) {
        float f11 = Float.parseFloat(strArr[i11]);
        if (f11 >= 0.0f && f11 <= 1.0f) {
            return f11;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f11);
    }

    private static TimeInterpolator getLegacyThemeInterpolator(String str) {
        if (!isLegacyEasingType(str, EASING_TYPE_CUBIC_BEZIER)) {
            if (isLegacyEasingType(str, "path")) {
                return new PathInterpolator(PathParser.createPathFromPathData(getLegacyEasingContent(str, "path")));
            }
            throw new IllegalArgumentException("Invalid motion easing type: " + str);
        }
        String[] strArrSplit = getLegacyEasingContent(str, EASING_TYPE_CUBIC_BEZIER).split(",");
        if (strArrSplit.length == 4) {
            return new PathInterpolator(getLegacyControlPoint(strArrSplit, 0), getLegacyControlPoint(strArrSplit, 1), getLegacyControlPoint(strArrSplit, 2), getLegacyControlPoint(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    private static boolean isLegacyEasingAttribute(String str) {
        return isLegacyEasingType(str, EASING_TYPE_CUBIC_BEZIER) || isLegacyEasingType(str, "path");
    }

    private static boolean isLegacyEasingType(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(EASING_TYPE_FORMAT_START);
        return str.startsWith(sb2.toString()) && str.endsWith(EASING_TYPE_FORMAT_END);
    }

    @NonNull
    public static TimeInterpolator resolveThemeInterpolator(@NonNull Context context, @AttrRes int i11, @NonNull TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i11, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        return isLegacyEasingAttribute(strValueOf) ? getLegacyThemeInterpolator(strValueOf) : AnimationUtils.loadInterpolator(context, typedValue.resourceId);
    }

    private MotionUtils() {
    }

    private static String getLegacyEasingContent(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    public static int resolveThemeDuration(@NonNull Context context, @AttrRes int i11, int i12) {
        return MaterialAttributes.resolveInteger(context, i11, i12);
    }

    @NonNull
    public static SpringForce resolveThemeSpringForce(@NonNull Context context, @AttrRes int i11, @StyleRes int i12) {
        TypedArray typedArrayObtainStyledAttributes;
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i11);
        if (typedValueResolve == null) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C7090R.styleable.MaterialSpring, 0, i12);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(typedValueResolve.resourceId, C7090R.styleable.MaterialSpring);
        }
        SpringForce springForce = new SpringForce();
        try {
            float f11 = typedArrayObtainStyledAttributes.getFloat(C7090R.styleable.MaterialSpring_stiffness, Float.MIN_VALUE);
            if (f11 != Float.MIN_VALUE) {
                float f12 = typedArrayObtainStyledAttributes.getFloat(C7090R.styleable.MaterialSpring_damping, Float.MIN_VALUE);
                if (f12 != Float.MIN_VALUE) {
                    springForce.setStiffness(f11);
                    springForce.setDampingRatio(f12);
                    typedArrayObtainStyledAttributes.recycle();
                    return springForce;
                }
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
