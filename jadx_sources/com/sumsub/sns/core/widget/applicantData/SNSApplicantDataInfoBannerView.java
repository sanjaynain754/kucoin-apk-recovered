package com.sumsub.sns.core.widget.applicantData;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.firebase.messaging.Constants;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
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

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u001d\u001a\u00020\u001eH\u0002R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R(\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u000bR(\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\t\"\u0004\b\u001c\u0010\u000b¨\u0006\u001f"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataInfoBannerView;", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", Constants.ScionAnalytics.PARAM_LABEL, "", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "contentView", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "actionView", "getActionView", "value", "text", "getText", "setText", "actionText", "getActionText", "setActionText", "applyBannerStyle", "", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class SNSApplicantDataInfoBannerView extends SNSApplicantDataBaseFieldView {

    @Nullable
    private CharSequence actionText;

    @Nullable
    private CharSequence label;

    @Nullable
    private CharSequence text;

    public SNSApplicantDataInfoBannerView(@NotNull Context context) {
        super(context, null, 0, 0, 14, null);
        LayoutInflater.from(context).inflate(R$layout.sns_layout_applicant_data_info_banner_field, (ViewGroup) this, true);
        applyBannerStyle();
        onInitializationFinished();
    }

    private final void applyBannerStyle() {
        Integer numM69174a = AbstractC28234b.m69174a(this, SNSColorElement.BACKGROUND_INFO);
        int iIntValue = numM69174a != null ? numM69174a.intValue() : ContextCompat.getColor(getContext(), R$color.sns_backgroundInfo);
        SNSMetricElement sNSMetricElement = SNSMetricElement.CARD_CORNER_RADIUS;
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        Float f11 = null;
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            Map map = c28966p.f58878d;
            AbstractC28962j abstractC28962j = map != null ? (AbstractC28962j) map.get(sNSMetricElement.getValue()) : null;
            C28956d c28956d = abstractC28962j instanceof C28956d ? (C28956d) abstractC28962j : null;
            if (c28956d != null) {
                f11 = c28956d.f58860a;
            }
        }
        float fFloatValue = f11 != null ? f11.floatValue() : getResources().getDimension(R$dimen.sns_agreement_card_corner_radius);
        Integer numM69174a2 = AbstractC28234b.m69174a(this, SNSColorElement.LINK_BUTTON_CONTENT);
        int iIntValue2 = numM69174a2 != null ? numM69174a2.intValue() : ContextCompat.getColor(getContext(), R$color.sns_contentLink);
        View contentView = getContentView();
        if (contentView != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(iIntValue);
            gradientDrawable.setCornerRadius(fFloatValue);
            contentView.setBackground(gradientDrawable);
        }
        TextView actionView = getActionView();
        if (actionView != null) {
            actionView.setTextColor(iIntValue2);
        }
    }

    private final TextView getActionView() {
        return (TextView) findViewById(R$id.sns_info_banner_action);
    }

    private final View getContentView() {
        return findViewById(R$id.sns_info_banner_content);
    }

    private final TextView getTextView() {
        return (TextView) findViewById(R$id.sns_info_banner_text);
    }

    @Nullable
    public final CharSequence getActionText() {
        return this.actionText;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    @Nullable
    public CharSequence getLabel() {
        return this.label;
    }

    @Nullable
    public final CharSequence getText() {
        return this.text;
    }

    public final void setActionText(@Nullable CharSequence charSequence) {
        this.actionText = charSequence;
        TextView actionView = getActionView();
        if (actionView != null) {
            actionView.setText(charSequence);
        }
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setLabel(@Nullable CharSequence charSequence) {
        this.label = charSequence;
    }

    public final void setText(@Nullable CharSequence charSequence) {
        this.text = charSequence;
        TextView textView = getTextView();
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
