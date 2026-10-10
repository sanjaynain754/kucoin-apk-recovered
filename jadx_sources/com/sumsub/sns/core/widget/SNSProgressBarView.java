package com.sumsub.sns.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.appcompat.C0467R;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.theme.SNSThemeMetric$Size;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.AbstractC28962j;
import com.sumsub.sns.internal.core.presentation.theme.C28960h;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0014¨\u0006\u000e"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSProgressBarView;", "Landroid/widget/ProgressBar;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class SNSProgressBarView extends ProgressBar {
    @JvmOverloads
    public SNSProgressBarView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SNSProgressBarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int dimensionPixelSize;
        Map map;
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        AbstractC28962j abstractC28962j = (c28966p == null || (map = c28966p.f58878d) == null) ? null : (AbstractC28962j) map.get(SNSMetricElement.ACTIVITY_INDICATOR_STYLE.getValue());
        C28960h c28960h = abstractC28962j instanceof C28960h ? (C28960h) abstractC28962j : null;
        if (c28960h == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        String str = c28960h.f58868a;
        if (Intrinsics.areEqual(str, SNSThemeMetric$Size.LARGE.getValue())) {
            dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.sns_progress_bar_size_large);
        } else {
            dimensionPixelSize = Intrinsics.areEqual(str, SNSThemeMetric$Size.SMALL.getValue()) ? getResources().getDimensionPixelSize(R$dimen.sns_progress_bar_size_small) : getResources().getDimensionPixelSize(R$dimen.sns_progress_bar_size_medium);
        }
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + dimensionPixelSize, getPaddingTop() + getPaddingBottom() + dimensionPixelSize);
    }

    public /* synthetic */ SNSProgressBarView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? C0467R.attr.progressBarStyle : i11);
    }

    @JvmOverloads
    public SNSProgressBarView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
