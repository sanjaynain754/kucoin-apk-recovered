package com.sumsub.sns.core.widget.applicantData;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import com.google.firebase.messaging.Constants;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.theme.SNSThemeMetric$TextAlignment;
import com.sumsub.sns.core.widget.SNSH1TextView;
import com.sumsub.sns.internal.core.common.AbstractC28485q;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.AbstractC28962j;
import com.sumsub.sns.internal.core.presentation.theme.C28960h;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR@\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataTitleView;", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "titleView", "Lcom/sumsub/sns/core/widget/SNSH1TextView;", "value", "", Constants.ScionAnalytics.PARAM_LABEL, "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "Lkotlin/Function1;", "", "", "onLinkClicked", "getOnLinkClicked", "()Lkotlin/jvm/functions/Function1;", "setOnLinkClicked", "(Lkotlin/jvm/functions/Function1;)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSApplicantDataTitleView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSApplicantDataTitleView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSApplicantDataTitleView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n157#2,8:55\n1#3:63\n*S KotlinDebug\n*F\n+ 1 SNSApplicantDataTitleView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSApplicantDataTitleView\n*L\n36#1:55,8\n*E\n"})
public final class SNSApplicantDataTitleView extends SNSApplicantDataBaseFieldView {

    @Nullable
    private Function1<? super String, Unit> onLinkClicked;

    @Nullable
    private final SNSH1TextView titleView;

    public SNSApplicantDataTitleView(@NotNull Context context) {
        super(context, null, 0, 0, 14, null);
        removeAllViews();
        SNSH1TextView sNSH1TextView = new SNSH1TextView(context, null, 0, 0, 14, null);
        sNSH1TextView.setPadding(sNSH1TextView.getPaddingLeft(), context.getResources().getDimensionPixelSize(R$dimen.sns_margin_medium), sNSH1TextView.getPaddingRight(), sNSH1TextView.getPaddingBottom());
        sNSH1TextView.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        this.titleView = sNSH1TextView;
        addView(sNSH1TextView);
        onInitializationFinished();
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        Integer numValueOf = null;
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        int iIntValue = 17;
        if (c28966p != null) {
            SNSMetricElement sNSMetricElement = SNSMetricElement.SCREEN_HEADER_ALIGNMENT;
            Map map = c28966p.f58878d;
            AbstractC28962j abstractC28962j = map != null ? (AbstractC28962j) map.get(sNSMetricElement.getValue()) : null;
            C28960h c28960h = abstractC28962j instanceof C28960h ? (C28960h) abstractC28962j : null;
            String str = c28960h != null ? c28960h.f58868a : null;
            if (str != null) {
                if (Intrinsics.areEqual(str, SNSThemeMetric$TextAlignment.LEFT.getValue())) {
                    numValueOf = Integer.valueOf(GravityCompat.START);
                } else if (Intrinsics.areEqual(str, SNSThemeMetric$TextAlignment.RIGHT.getValue())) {
                    numValueOf = Integer.valueOf(GravityCompat.END);
                } else if (Intrinsics.areEqual(str, SNSThemeMetric$TextAlignment.CENTER.getValue())) {
                    numValueOf = 17;
                }
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                }
            }
        }
        sNSH1TextView.setGravity(iIntValue);
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    @Nullable
    public CharSequence getLabel() {
        SNSH1TextView sNSH1TextView = this.titleView;
        if (sNSH1TextView != null) {
            return sNSH1TextView.getText();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    @Nullable
    public Function1<String, Unit> getOnLinkClicked() {
        return this.onLinkClicked;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setLabel(@Nullable CharSequence charSequence) {
        SNSH1TextView sNSH1TextView = this.titleView;
        if (sNSH1TextView != null) {
            sNSH1TextView.setText(charSequence);
        }
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setOnLinkClicked(@Nullable Function1<? super String, Unit> function1) {
        SNSH1TextView sNSH1TextView = this.titleView;
        if (sNSH1TextView != null) {
            AbstractC28485q.m69381a(sNSH1TextView, function1);
        }
        this.onLinkClicked = function1;
    }
}
