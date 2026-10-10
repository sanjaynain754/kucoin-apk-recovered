package com.kubi.resources.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import com.kubi.sdk.res.R$mipmap;
import com.kubi.utils.C27014a1;
import com.kubi.utils.extensions.C27046k;
import java.math.BigDecimal;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UpDownTextView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ1\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u0007¢\u0006\u0002\u0010\u0012J'\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u0007¢\u0006\u0002\u0010\u0014J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0011\u001a\u00020\u0007J!\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/resources/widget/UpDownTextView;", "Lcom/kubi/resources/widget/ShowHideTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "setValueWithIconRich", "", "display", "", "lastDealPrice", "", "changeRate", "color", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;I)V", "setValue", "(Ljava/lang/String;Ljava/lang/Double;I)V", "setValueColorPercent", "(Ljava/lang/Double;I)V", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UpDownTextView extends ShowHideTextView {
    @JvmOverloads
    public UpDownTextView(@Nullable Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public UpDownTextView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m54917e(@NotNull String lastDealPrice, @ColorInt int i11) {
        Intrinsics.checkNotNullParameter(lastDealPrice, "lastDealPrice");
        setText(lastDealPrice);
        setTextColor(i11);
    }

    /* JADX INFO: renamed from: f */
    public final void m54918f(@NotNull String display, @Nullable Double d11, @ColorInt int i11) {
        Intrinsics.checkNotNullParameter(display, "display");
        if (d11 == null) {
            display = "--";
        }
        setText(display);
        setTextColor(i11);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: g */
    public final void m54919g(@Nullable Double d11, @ColorInt int i11) {
        setText(C42828b.m93915p(C42828b.m93911l(C42180b.m92649n(d11 != null ? C42180b.m92642g(new BigDecimal(String.valueOf(d11.doubleValue())), null, null, 0, true, false, false, 55, null) : null))));
        setTextColor(i11);
    }

    /* JADX INFO: renamed from: h */
    public final void m54920h(@NotNull String display, @Nullable Double d11, @Nullable Double d12, @ColorInt int i11) {
        Intrinsics.checkNotNullParameter(display, "display");
        if (d11 == null) {
            display = "--";
        }
        setText(display);
        setTextColor(i11);
        if (d12 == null || Intrinsics.areEqual(d12, 0.0d)) {
            C27014a1.m66504d(this, 0, 5);
        } else {
            C27014a1.m66504d(this, d12.doubleValue() > 0.0d ? R$mipmap.kucoin_icon_arrow_green_up : R$mipmap.kucoin_icon_arrow_red_down, 5);
            C27046k.m66702q(this, i11);
        }
    }

    public /* synthetic */ UpDownTextView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @JvmOverloads
    public UpDownTextView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        setInputType(2);
    }
}
