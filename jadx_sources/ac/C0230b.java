package ac;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.resources.C22890g;
import com.kubi.tradebase.R$color;
import com.kubi.tradebase.R$drawable;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ac.b */
/* JADX INFO: compiled from: TradeButtonStyleUtil.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\b\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0016\u0010\t\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0016\u0010\n\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u000e\u001a\u00020\f*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u000f\u001a\u00020\f*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u0010\u001a\u00020\f*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\b\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\b\u0010\u0013\u001a\u00020\u0012H\u0002\u001a\f\u0010\u0014\u001a\u00020\u0012*\u00020\u0002H\u0002¨\u0006\u0015"}, m90084d2 = {"wrapperBuyButtonStyle", "", "Landroid/widget/TextView;", "isSelected", "", "wrapperSellButtonStyle", "wrapperKlineBuyButtonStyle", "wrapperKlineSellButtonStyle", "fillBuyButtonDrawable", "fillKlineButtonDrawable", "fillSellButtonDrawable", "getBuyTextColor", "", "Landroid/content/Context;", "getSellTextColor", "getKlineBuyTextColor", "getKlineSellTextColor", "getRedDrawable", "Landroid/graphics/drawable/Drawable;", "getGreenDrawable", "createKlineSelectedBackgroundDrawable", "TradeBaseLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C0230b {
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m848l(TextView textView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        m847k(textView, z11);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m852p(TextView textView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        m851o(textView, z11);
    }

    /* JADX INFO: renamed from: b */
    public static final void m838b(TextView textView, boolean z11) {
        if (z11) {
            textView.setBackground(DayNightThemeManager.f28592a.m33189n() ? m842f() : m845i());
        } else {
            textView.setBackground(null);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m839c(TextView textView, boolean z11) {
        if (z11) {
            textView.setBackground(m837a(textView));
        } else {
            textView.setBackground(null);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m840d(TextView textView, boolean z11) {
        if (z11) {
            textView.setBackground(DayNightThemeManager.f28592a.m33189n() ? m845i() : m842f());
        } else {
            textView.setBackground(null);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final int m841e(Context context, boolean z11) {
        if (DayNightThemeManager.f28592a.m33187l()) {
            return z11 ? C22890g.m54291p(context) : C27046k.m66699n(context, R$color.c_text60);
        }
        return z11 ? Color.parseColor("#1D1D1D") : context.getColor(R$color.c_text60);
    }

    /* JADX INFO: renamed from: f */
    public static final Drawable m842f() {
        return DayNightThemeManager.f28592a.m33187l() ? C27017c.m66510d(C27017c.f54310a, R$drawable.ic_trade_rectangle_green, null, 2, null) : C27017c.m66510d(C27017c.f54310a, R$drawable.ic_trade_rectangle_dark_green, null, 2, null);
    }

    /* JADX INFO: renamed from: g */
    public static final int m843g(Context context, boolean z11) {
        if (DayNightThemeManager.f28592a.m33187l()) {
            return z11 ? C22890g.m54291p(context) : C27046k.m66699n(context, R$color.c_text60);
        }
        return Color.parseColor("#00B47D");
    }

    /* JADX INFO: renamed from: h */
    public static final int m844h(Context context, boolean z11) {
        return z11 ? C22890g.m54289n(context) : C27046k.m66699n(context, R$color.c_text60);
    }

    /* JADX INFO: renamed from: i */
    public static final Drawable m845i() {
        return DayNightThemeManager.f28592a.m33187l() ? C27017c.m66510d(C27017c.f54310a, R$drawable.ic_trade_rectangle_red, null, 2, null) : C27017c.m66510d(C27017c.f54310a, R$drawable.ic_trade_rectangle_dark_red, null, 2, null);
    }

    /* JADX INFO: renamed from: j */
    public static final int m846j(Context context, boolean z11) {
        if (DayNightThemeManager.f28592a.m33187l()) {
            return z11 ? C22890g.m54289n(context) : C27046k.m66699n(context, R$color.c_text60);
        }
        return z11 ? Color.parseColor("#1D1D1D") : context.getColor(R$color.c_text60);
    }

    /* JADX INFO: renamed from: k */
    public static final void m847k(@NotNull TextView textView, boolean z11) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        m838b(textView, z11);
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setTextColor(m841e(context, z11));
    }

    /* JADX INFO: renamed from: m */
    public static final void m849m(@NotNull TextView textView, boolean z11) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        m839c(textView, z11);
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setTextColor(m843g(context, z11));
    }

    /* JADX INFO: renamed from: n */
    public static final void m850n(@NotNull TextView textView, boolean z11) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        m839c(textView, z11);
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setTextColor(m844h(context, z11));
    }

    /* JADX INFO: renamed from: o */
    public static final void m851o(@NotNull TextView textView, boolean z11) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        m840d(textView, z11);
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setTextColor(m846j(context, z11));
    }

    /* JADX INFO: renamed from: a */
    public static final Drawable m837a(TextView textView) {
        float f11 = textView.getResources().getDisplayMetrics().density * 6.0f;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f11);
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientDrawable.setColor(C27046k.m66699n(context, R$color.color_fff_222223));
        return gradientDrawable;
    }
}
