package com.kubi.resources.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.graphics.ColorUtils;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KcTradeRateView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/resources/widget/KcTradeRateView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "initView", "", "setTextColor", "color", "", "updateBackgroundDrawable", "dp2px", "dpValue", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KcTradeRateView extends AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KcTradeRateView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        initView();
    }

    private final void initView() {
        setPadding(m54641b(4.0f), m54641b(2.0f), m54641b(4.0f), m54641b(2.0f));
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        if (getTag() == null || !Intrinsics.areEqual(getTag().toString(), "noLtr")) {
            setTextDirection(3);
        }
        m54642c();
    }

    /* JADX INFO: renamed from: b */
    private final int m54641b(float f11) {
        return (int) ((f11 * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: c */
    public final void m54642c() {
        int iAlpha = Color.alpha(getCurrentTextColor());
        int currentTextColor = getCurrentTextColor();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Integer.valueOf(ColorUtils.setAlphaComponent(currentTextColor, (int) (((double) iAlpha) * 0.12d))).intValue());
        gradientDrawable.setCornerRadius(m54641b(4.0f));
        setBackgroundDrawable(gradientDrawable);
    }

    @Override // android.widget.TextView
    public void setTextColor(int color) {
        super.setTextColor(color);
        m54642c();
    }
}
