package com.sumsub.sns.core.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.AbstractC28962j;
import com.sumsub.sns.internal.core.presentation.theme.C28956d;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSListItemView;", "Lcom/sumsub/sns/core/widget/SNSStepView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSListItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSListItemView.kt\ncom/sumsub/sns/core/widget/SNSListItemView\n+ 2 ThemeHelper.kt\ncom/sumsub/sns/core/presentation/helper/ThemeHelper\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n22#2:47\n1#3:48\n*S KotlinDebug\n*F\n+ 1 SNSListItemView.kt\ncom/sumsub/sns/core/widget/SNSListItemView\n*L\n22#1:47\n22#1:48\n*E\n"})
public final class SNSListItemView extends SNSStepView {
    @JvmOverloads
    public SNSListItemView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @JvmOverloads
    public SNSListItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @JvmOverloads
    public SNSListItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    public /* synthetic */ SNSListItemView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_ListItemViewStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSListItemView : i12);
    }

    @JvmOverloads
    public SNSListItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12, null);
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            Integer numM69174a = AbstractC28234b.m69174a(this, SNSColorElement.CONTENT_STRONG);
            Integer numM69174a2 = AbstractC28234b.m69174a(this, SNSColorElement.CONTENT_NEUTRAL);
            if (numM69174a != null) {
                setTitleTextColor(ColorStateList.valueOf(numM69174a.intValue()));
                setIconTintColor(ColorStateList.valueOf(numM69174a.intValue()));
            }
            if (numM69174a2 != null) {
                setSubtitleTextColor(ColorStateList.valueOf(numM69174a2.intValue()));
            }
            Integer numM69174a3 = AbstractC28234b.m69174a(this, SNSColorElement.BACKGROUND_NEUTRAL);
            if (numM69174a3 != null) {
                setCardBackgroundColor(ColorStateList.valueOf(numM69174a3.intValue()));
            }
            SNSMetricElement sNSMetricElement = SNSMetricElement.CARD_CORNER_RADIUS;
            Map map = c28966p.f58878d;
            AbstractC28962j abstractC28962j = map != null ? (AbstractC28962j) map.get(sNSMetricElement.getValue()) : null;
            C28956d c28956d = abstractC28962j instanceof C28956d ? (C28956d) abstractC28962j : null;
            Float f11 = c28956d != null ? c28956d.f58860a : null;
            if (f11 != null) {
                setRadius(f11.floatValue());
            }
        }
    }
}
