package com.kubi.resources.widget.interpolator;

import android.view.animation.Interpolator;
import androidx.annotation.Keep;
import androidx.core.view.animation.PathInterpolatorCompat;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KcInterpolators.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0007¨\u0006\u0004"}, m90084d2 = {"create", "Landroid/view/animation/Interpolator;", "Lcom/kubi/resources/widget/interpolator/KcInterpolators$Productive;", "Lcom/kubi/resources/widget/interpolator/KcInterpolators$Expressive;", "LComponent_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KcInterpolatorsKt {
    @Keep
    @NotNull
    public static final Interpolator create(@NotNull KcInterpolators$Productive kcInterpolators$Productive) {
        Intrinsics.checkNotNullParameter(kcInterpolators$Productive, "<this>");
        Interpolator interpolatorCreate = PathInterpolatorCompat.create(kcInterpolators$Productive.getX1(), kcInterpolators$Productive.getY1(), kcInterpolators$Productive.getX2(), kcInterpolators$Productive.getY2());
        Intrinsics.checkNotNullExpressionValue(interpolatorCreate, "create(...)");
        return interpolatorCreate;
    }

    @Keep
    @NotNull
    public static final Interpolator create(@NotNull KcInterpolators$Expressive kcInterpolators$Expressive) {
        Intrinsics.checkNotNullParameter(kcInterpolators$Expressive, "<this>");
        Interpolator interpolatorCreate = PathInterpolatorCompat.create(kcInterpolators$Expressive.getX1(), kcInterpolators$Expressive.getY1(), kcInterpolators$Expressive.getX2(), kcInterpolators$Expressive.getY2());
        Intrinsics.checkNotNullExpressionValue(interpolatorCreate, "create(...)");
        return interpolatorCreate;
    }
}
