package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.C7090R;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class MaterialBackAnimationHelper<V extends View> {
    private static final int CANCEL_DURATION_DEFAULT = 100;
    private static final int HIDE_DURATION_MAX_DEFAULT = 300;
    private static final int HIDE_DURATION_MIN_DEFAULT = 150;
    private static final String TAG = "MaterialBackHelper";

    @Nullable
    private BackEventCompat backEvent;
    protected final int cancelDuration;
    protected final int hideDurationMax;
    protected final int hideDurationMin;

    @NonNull
    private final TimeInterpolator progressInterpolator = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);

    @NonNull
    protected final V view;

    public float interpolateProgress(float f11) {
        return this.progressInterpolator.getInterpolation(f11);
    }

    @Nullable
    public BackEventCompat onCancelBackProgress() {
        if (this.backEvent == null) {
            Log.w(TAG, "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        BackEventCompat backEventCompat = this.backEvent;
        this.backEvent = null;
        return backEventCompat;
    }

    @Nullable
    public BackEventCompat onHandleBackInvoked() {
        BackEventCompat backEventCompat = this.backEvent;
        this.backEvent = null;
        return backEventCompat;
    }

    public void onStartBackProgress(@NonNull BackEventCompat backEventCompat) {
        this.backEvent = backEventCompat;
    }

    @Nullable
    public BackEventCompat onUpdateBackProgress(@NonNull BackEventCompat backEventCompat) {
        if (this.backEvent == null) {
            Log.w(TAG, "Must call startBackProgress() before updateBackProgress()");
        }
        BackEventCompat backEventCompat2 = this.backEvent;
        this.backEvent = backEventCompat;
        return backEventCompat2;
    }

    public MaterialBackAnimationHelper(@NonNull V v11) {
        this.view = v11;
        Context context = v11.getContext();
        this.hideDurationMax = MotionUtils.resolveThemeDuration(context, C7090R.attr.motionDurationMedium2, 300);
        this.hideDurationMin = MotionUtils.resolveThemeDuration(context, C7090R.attr.motionDurationShort3, 150);
        this.cancelDuration = MotionUtils.resolveThemeDuration(context, C7090R.attr.motionDurationShort2, 100);
    }
}
