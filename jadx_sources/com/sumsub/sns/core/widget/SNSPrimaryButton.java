package com.sumsub.sns.core.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.C7090R;
import com.google.android.material.button.MaterialButton;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.theme.SNSTypographyElement;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.AbstractC28962j;
import com.sumsub.sns.internal.core.presentation.theme.C28956d;
import com.sumsub.sns.internal.core.presentation.theme.C28961i;
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
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0014¨\u0006\u000e"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSPrimaryButton;", "Lcom/google/android/material/button/MaterialButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSPrimaryButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSPrimaryButton.kt\ncom/sumsub/sns/core/widget/SNSPrimaryButton\n+ 2 ThemeHelper.kt\ncom/sumsub/sns/core/presentation/helper/ThemeHelper\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n22#2:97\n1#3:98\n1#3:99\n*S KotlinDebug\n*F\n+ 1 SNSPrimaryButton.kt\ncom/sumsub/sns/core/widget/SNSPrimaryButton\n*L\n25#1:97\n25#1:98\n*E\n"})
public final class SNSPrimaryButton extends MaterialButton {
    @JvmOverloads
    public SNSPrimaryButton(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SNSPrimaryButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        Float f11 = null;
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            SNSMetricElement sNSMetricElement = SNSMetricElement.BUTTON_HEIGHT;
            Map map = c28966p.f58878d;
            AbstractC28962j abstractC28962j = map != null ? (AbstractC28962j) map.get(sNSMetricElement.getValue()) : null;
            C28956d c28956d = abstractC28962j instanceof C28956d ? (C28956d) abstractC28962j : null;
            if (c28956d != null) {
                f11 = c28956d.f58860a;
            }
        }
        if (f11 != null) {
            super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) f11.floatValue(), 1073741824));
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public /* synthetic */ SNSPrimaryButton(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? C7090R.attr.materialButtonStyle : i11);
    }

    @JvmOverloads
    public SNSPrimaryButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        C28961i c28961i;
        super(context, attributeSet, i11);
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            Map map = c28966p.f58876b;
            if (map != null && (c28961i = (C28961i) map.get(SNSTypographyElement.SUBTITLE1.getValue())) != null) {
                Typeface typeface = c28961i.f58872d;
                if (typeface != null) {
                    setTypeface(typeface);
                }
                setTextSize(c28961i.f58870b);
            }
            int[][] iArr = {new int[]{-16842910}, new int[]{R.attr.state_pressed}, new int[0]};
            Integer numM69174a = AbstractC28234b.m69174a(this, SNSColorElement.PRIMARY_BUTTON_CONTENT);
            Integer numM69174a2 = AbstractC28234b.m69174a(this, SNSColorElement.PRIMARY_BUTTON_CONTENT_DISABLED);
            Integer numM69174a3 = AbstractC28234b.m69174a(this, SNSColorElement.PRIMARY_BUTTON_CONTENT_HIGHLIGHTED);
            if (numM69174a != null || numM69174a2 != null || numM69174a3 != null) {
                ColorStateList colorStateList = new ColorStateList(iArr, new int[]{numM69174a2 != null ? numM69174a2.intValue() : 0, numM69174a3 != null ? numM69174a3.intValue() : 0, numM69174a != null ? numM69174a.intValue() : 0});
                setTextColor(colorStateList);
                setStrokeColor(colorStateList);
            }
            Integer numM69174a4 = AbstractC28234b.m69174a(this, SNSColorElement.PRIMARY_BUTTON_BACKGROUND);
            Integer numM69174a5 = AbstractC28234b.m69174a(this, SNSColorElement.PRIMARY_BUTTON_BACKGROUND_DISABLED);
            Integer numM69174a6 = AbstractC28234b.m69174a(this, SNSColorElement.PRIMARY_BUTTON_BACKGROUND_HIGHLIGHTED);
            if (numM69174a4 != null || numM69174a5 != null || numM69174a6 != null) {
                setElevation(0.0f);
                setStateListAnimator(null);
                setBackgroundTintList(new ColorStateList(iArr, new int[]{numM69174a5 != null ? numM69174a5.intValue() : 0, numM69174a6 != null ? numM69174a6.intValue() : 0, numM69174a4 != null ? numM69174a4.intValue() : 0}));
            }
            SNSMetricElement sNSMetricElement = SNSMetricElement.BUTTON_CORNER_RADIUS;
            Map map2 = c28966p.f58878d;
            AbstractC28962j abstractC28962j = map2 != null ? (AbstractC28962j) map2.get(sNSMetricElement.getValue()) : null;
            C28956d c28956d = abstractC28962j instanceof C28956d ? (C28956d) abstractC28962j : null;
            Float f11 = c28956d != null ? c28956d.f58860a : null;
            if (f11 != null) {
                setCornerRadius((int) f11.floatValue());
            }
            SNSMetricElement sNSMetricElement2 = SNSMetricElement.BUTTON_BORDER_WIDTH;
            Map map3 = c28966p.f58878d;
            AbstractC28962j abstractC28962j2 = map3 != null ? (AbstractC28962j) map3.get(sNSMetricElement2.getValue()) : null;
            C28956d c28956d2 = abstractC28962j2 instanceof C28956d ? (C28956d) abstractC28962j2 : null;
            Float f12 = c28956d2 != null ? c28956d2.f58860a : null;
            if (f12 != null) {
                setStrokeWidth((int) f12.floatValue());
            }
        }
    }
}
