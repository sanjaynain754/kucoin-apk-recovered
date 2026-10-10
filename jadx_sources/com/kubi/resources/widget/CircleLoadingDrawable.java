package com.kubi.resources.widget;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.graphics.PorterDuff;
import android.graphics.drawable.RotateDrawable;
import android.view.animation.LinearInterpolator;
import androidx.annotation.ColorInt;
import androidx.appcompat.content.res.AppCompatResources;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.sdk.res.R$drawable;
import com.kubi.utils.C27059l;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.resources.widget.r, reason: from Kotlin metadata */
/* JADX INFO: compiled from: CircleLoadingDrawable.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0007J\u0006\u0010\n\u001a\u00020\tR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/resources/widget/CircleLoadingDrawable;", "Landroid/graphics/drawable/RotateDrawable;", "tintColor", "", "<init>", "(I)V", "loadingAnimator", "Landroid/animation/ObjectAnimator;", "loadingStart", "", "loadingStop", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CircleLoadingDrawable extends RotateDrawable {

    /* JADX INFO: renamed from: b */
    @Nullable
    public ObjectAnimator f45029b;

    @SuppressLint({"Recycle"})
    /* JADX INFO: renamed from: a */
    public final void m55416a() {
        ObjectAnimator objectAnimatorOfInt = this.f45029b;
        if (objectAnimatorOfInt == null) {
            objectAnimatorOfInt = ObjectAnimator.ofInt(this, FirebaseAnalytics.Param.LEVEL, 0, 10000);
            objectAnimatorOfInt.setDuration(700L);
            objectAnimatorOfInt.setRepeatCount(-1);
            objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        }
        this.f45029b = objectAnimatorOfInt;
        objectAnimatorOfInt.start();
    }

    /* JADX INFO: renamed from: b */
    public final void m55417b() {
        ObjectAnimator objectAnimator = this.f45029b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public CircleLoadingDrawable(@ColorInt int i11) {
        setDrawable(AppCompatResources.getDrawable(C27059l.f54343a.m66757a(), R$drawable.ic2_loading_small_24));
        setFromDegrees(0.0f);
        setToDegrees(359.0f);
        setPivotX(0.5f);
        setPivotY(0.5f);
        setColorFilter(i11, PorterDuff.Mode.SRC_ATOP);
    }
}
