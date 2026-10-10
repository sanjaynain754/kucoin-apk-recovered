package com.kubi.resources;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.sdk.res.R$attr;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$drawable;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.resources.g */
/* JADX INFO: compiled from: ColorHelper.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u0012\u0010\n\u001a\u00020\u0005*\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u0012\u0010\u000b\u001a\u00020\u0005*\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u0012\u0010\n\u001a\u00020\u0005*\u00020\f2\u0006\u0010\b\u001a\u00020\t\u001a\u0012\u0010\r\u001a\u00020\u0005*\u00020\f2\u0006\u0010\b\u001a\u00020\t\u001a\u0012\u0010\u000e\u001a\u00020\u0005*\u00020\f2\u0006\u0010\b\u001a\u00020\t\u001a\u0014\u0010\u000f\u001a\u00020\u0003*\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0003H\u0007\u001a\f\u0010\u0011\u001a\u00020\u0003*\u00020\tH\u0007\u001a\f\u0010\u0012\u001a\u00020\u0003*\u00020\tH\u0007\u001a*\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u001a\u001a\u0010\u001a\u001a\u00020\u00142\b\b\u0001\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u001a\u0016\u0010\u001e\u001a\u00020\u0003*\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\u0007H\u0007\u001a\u001e\u0010\u001e\u001a\u00020\u0003*\u00020\t2\u0006\u0010 \u001a\u00020!2\b\b\u0003\u0010\"\u001a\u00020\u0003H\u0007\u001a \u0010#\u001a\u00020\u0003*\u00020\t2\b\b\u0002\u0010 \u001a\u00020\f2\b\b\u0003\u0010\"\u001a\u00020\u0003H\u0007\u001a\u0016\u0010$\u001a\u00020\u0003*\u00020\t2\b\b\u0002\u0010 \u001a\u00020\fH\u0007\u001a\u0014\u0010%\u001a\u00020&*\u00020\t2\u0006\u0010'\u001a\u00020\u0003H\u0002\u001a&\u0010(\u001a\u00020\u0005*\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020\u001d2\b\b\u0002\u0010*\u001a\u00020\u0003¨\u0006+"}, m90084d2 = {"setBackGround", "Lio/chad/library/adapter/base/BaseViewHolder;", "id", "", "drawable", "Landroid/graphics/drawable/Drawable;", "getBackUpOrDn16ByBool", "", "context", "Landroid/content/Context;", "getBorder16Solid8UpDown", "getSolid4UpDown", "", "getChangeRateBg", "getChangeRateBgAlpha8", "getAttrColor", "attrId", "getUpColor", "getDownColor", "getGradientShape", "Landroid/graphics/drawable/GradientDrawable;", "startColor", "endColor", "orientation", "Landroid/graphics/drawable/GradientDrawable$Orientation;", "gradientType", "getCornersShape", "colorInt", "radius", "", "getAutoUpDownColor", "isUp", "value", "Ljava/math/BigDecimal;", "zeroColorId", "getAutoRateColor", "getAutoRateUpDownColor", "obtainTypedValue", "Landroid/util/TypedValue;", "resId", "borderBgAlpha4", "cornerRadius", "strokeWidth", "LComponent_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C22890g {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Drawable m54276a(@NotNull Context context, boolean z11, float f11, int i11) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(f11);
        gradientDrawable.setStroke(i11, m54277b(context, z11 ? R$attr.upColor : R$attr.downColor));
        gradientDrawable.setColor(m54277b(context, z11 ? R$attr.upColor4 : R$attr.downColor4));
        return gradientDrawable;
    }

    @ColorInt
    /* JADX INFO: renamed from: b */
    public static final int m54277b(@NotNull Context context, int i11) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return m54292q(context, i11).data;
    }

    @ColorInt
    /* JADX INFO: renamed from: c */
    public static final int m54278c(@NotNull Context context, double d11, @ColorRes int i11) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (d11 > 0.0d) {
            return m54291p(context);
        }
        return d11 < 0.0d ? m54289n(context) : C27046k.m66699n(context, i11);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m54279d(Context context, double d11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            d11 = 0.0d;
        }
        if ((i12 & 2) != 0) {
            i11 = R$color.emphasis60;
        }
        return m54278c(context, d11, i11);
    }

    @ColorInt
    /* JADX INFO: renamed from: e */
    public static final int m54280e(@NotNull Context context, @NotNull BigDecimal value, @ColorRes int i11) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (value.compareTo(bigDecimal) > 0) {
            return m54291p(context);
        }
        return value.compareTo(bigDecimal) < 0 ? m54289n(context) : C27046k.m66699n(context, i11);
    }

    @ColorInt
    /* JADX INFO: renamed from: f */
    public static final int m54281f(@NotNull Context context, boolean z11) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return z11 ? m54291p(context) : m54289n(context);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m54282g(Context context, BigDecimal bigDecimal, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = R$color.emphasis;
        }
        return m54280e(context, bigDecimal, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final Drawable m54283h(boolean z11, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return m54288m(m54277b(context, z11 ? R$attr.upColor20 : R$attr.downColor20), 0.0f, 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final Drawable m54284i(double d11, @NotNull Context context) {
        int iM54277b;
        int iM54277b2;
        Intrinsics.checkNotNullParameter(context, "context");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C5275i0.m6236a(2.0f));
        int iM6236a = C5275i0.m6236a(0.5f);
        if (d11 > 0.0d) {
            iM54277b = m54277b(context, R$attr.upColor16);
        } else {
            iM54277b = d11 < 0.0d ? m54277b(context, R$attr.downColor16) : context.getResources().getColor(R$color.c_cover8);
        }
        gradientDrawable.setStroke(iM6236a, iM54277b);
        if (d11 > 0.0d) {
            iM54277b2 = m54277b(context, R$attr.upColor8);
        } else {
            iM54277b2 = d11 < 0.0d ? m54277b(context, R$attr.downColor8) : context.getResources().getColor(R$color.c_cover4);
        }
        gradientDrawable.setColor(iM54277b2);
        return gradientDrawable;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final Drawable m54285j(boolean z11, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C5275i0.m6236a(2.0f));
        gradientDrawable.setStroke(C5275i0.m6236a(0.5f), m54277b(context, z11 ? R$attr.upColor16 : R$attr.downColor16));
        gradientDrawable.setColor(m54277b(context, z11 ? R$attr.upColor8 : R$attr.downColor8));
        return gradientDrawable;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final Drawable m54286k(double d11, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (d11 > 0.0d) {
            return m54287l(m54277b(context, R$attr.upColor), 6.0f);
        }
        if (d11 < 0.0d) {
            return m54287l(m54277b(context, R$attr.downColor), 6.0f);
        }
        Drawable drawable = context.getResources().getDrawable(R$drawable.shape_icon40_6r);
        Intrinsics.checkNotNull(drawable);
        return drawable;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final GradientDrawable m54287l(@ColorInt int i11, float f11) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C5275i0.m6236a(f11));
        gradientDrawable.setColor(i11);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ GradientDrawable m54288m(int i11, float f11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f11 = 2.0f;
        }
        return m54287l(i11, f11);
    }

    @ColorInt
    /* JADX INFO: renamed from: n */
    public static final int m54289n(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        int iM54277b = m54277b(context, R$attr.downColor);
        return iM54277b == 0 ? C27046k.m66699n(context, R$color.secondary) : iM54277b;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public static final Drawable m54290o(boolean z11, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C5275i0.m6236a(4.0f));
        gradientDrawable.setColor(m54277b(context, z11 ? R$attr.upColor4 : R$attr.downColor4));
        return gradientDrawable;
    }

    @ColorInt
    /* JADX INFO: renamed from: p */
    public static final int m54291p(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        int iM54277b = m54277b(context, R$attr.upColor);
        return iM54277b == 0 ? C27046k.m66699n(context, R$color.primary) : iM54277b;
    }

    /* JADX INFO: renamed from: q */
    public static final TypedValue m54292q(Context context, int i11) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i11, typedValue, true);
        return typedValue;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public static final BaseViewHolder m54293r(@NotNull BaseViewHolder baseViewHolder, int i11, @NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(baseViewHolder, "<this>");
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        baseViewHolder.getView(i11).setBackground(drawable);
        return baseViewHolder;
    }
}
