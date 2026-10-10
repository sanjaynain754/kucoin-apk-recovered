package com.sumsub.sns.core.widget;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBindings;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.R$style;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.databinding.C28329I;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28485q;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.AbstractC28962j;
import com.sumsub.sns.internal.core.presentation.theme.C28956d;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0014\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001d\u001a\u00020\u000b2\u001a\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSSumsubIdBanner;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "applyCardStyle", "()V", "", "title", "subtitle", "Lkotlin/Function1;", "", "onSubtitleLinkClicked", "setText", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)V", "", "isChecked", "setIsChecked", "(Z)V", "Lkotlin/Function2;", "Landroid/widget/CompoundButton;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnCheckedChanged", "(Lkotlin/jvm/functions/Function2;)V", "Lcom/sumsub/sns/databinding/I;", "binding", "Lcom/sumsub/sns/databinding/I;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class SNSSumsubIdBanner extends ConstraintLayout {

    @NotNull
    private final C28329I binding;

    @JvmOverloads
    public SNSSumsubIdBanner(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @JvmOverloads
    public SNSSumsubIdBanner(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    private final void applyCardStyle() {
        float dimension;
        Integer numM69174a = AbstractC28234b.m69174a(this, SNSColorElement.BACKGROUND_NEUTRAL);
        int iIntValue = numM69174a != null ? numM69174a.intValue() : ContextCompat.getColor(getContext(), R$color.sns_backgroundNeutral);
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            SNSMetricElement sNSMetricElement = SNSMetricElement.CARD_CORNER_RADIUS;
            Map map = c28966p.f58878d;
            AbstractC28962j abstractC28962j = map != null ? (AbstractC28962j) map.get(sNSMetricElement.getValue()) : null;
            C28956d c28956d = abstractC28962j instanceof C28956d ? (C28956d) abstractC28962j : null;
            Float f11 = c28956d != null ? c28956d.f58860a : null;
            if (f11 != null) {
                dimension = f11.floatValue();
            } else {
                dimension = getResources().getDimension(R$dimen.sns_id_banner_corner_radius);
            }
        } else {
            dimension = getResources().getDimension(R$dimen.sns_id_banner_corner_radius);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(iIntValue);
        setBackground(gradientDrawable);
    }

    public final void setIsChecked(boolean isChecked) {
        this.binding.f57654c.setChecked(isChecked);
        this.binding.f57654c.jumpDrawablesToCurrentState();
    }

    public final void setOnCheckedChanged(@Nullable final Function2<? super CompoundButton, ? super Boolean, Unit> listener) {
        this.binding.f57654c.setOnCheckedChangeListener(listener != null ? new CompoundButton.OnCheckedChangeListener() { // from class: com.sumsub.sns.core.widget.h0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SNSSumsubIdBanner.setOnCheckedChanged$lambda$1(listener, compoundButton, z11);
            }
        } : null);
    }

    public final void setText(@Nullable CharSequence title, @Nullable CharSequence subtitle, @Nullable Function1<? super String, Unit> onSubtitleLinkClicked) {
        AbstractC28458h.m69341a(this.binding.f57655d, title);
        AbstractC28458h.m69341a(this.binding.f57653b, subtitle);
        AbstractC28485q.m69381a(this.binding.f57653b, onSubtitleLinkClicked);
    }

    @JvmOverloads
    public SNSSumsubIdBanner(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnCheckedChanged$lambda$1(Function2 function2, CompoundButton compoundButton, boolean z11) {
        function2.invoke(compoundButton, Boolean.valueOf(z11));
    }

    public /* synthetic */ SNSSumsubIdBanner(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_SumsubIdBannerStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSSumsubIdBanner : i12);
    }

    @JvmOverloads
    public SNSSumsubIdBanner(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        LayoutInflater.from(context).inflate(R$layout.sns_sumsubid_banner, this);
        int i13 = R$id.sns_sumsubid_banner_icon;
        if (((ImageView) ViewBindings.findChildViewById(this, i13)) != null) {
            i13 = R$id.sns_sumsubid_banner_subtitle;
            SNSBodyTextView sNSBodyTextView = (SNSBodyTextView) ViewBindings.findChildViewById(this, i13);
            if (sNSBodyTextView != null) {
                i13 = R$id.sns_sumsubid_banner_switch;
                SNSSwitch sNSSwitch = (SNSSwitch) ViewBindings.findChildViewById(this, i13);
                if (sNSSwitch != null) {
                    i13 = R$id.sns_sumsubid_banner_title;
                    SNSSubtitle1TextView sNSSubtitle1TextView = (SNSSubtitle1TextView) ViewBindings.findChildViewById(this, i13);
                    if (sNSSubtitle1TextView != null) {
                        this.binding = new C28329I(this, sNSBodyTextView, sNSSwitch, sNSSubtitle1TextView);
                        applyCardStyle();
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i13)));
    }
}
