package com.sumsub.sns.core.widget.applicantData;

import android.content.Context;
import com.google.firebase.messaging.Constants;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.internal.core.common.AbstractC28485q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR@\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataDescriptionView;", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "subtitleView", "Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;", "value", "", Constants.ScionAnalytics.PARAM_LABEL, "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "Lkotlin/Function1;", "", "", "onLinkClicked", "getOnLinkClicked", "()Lkotlin/jvm/functions/Function1;", "setOnLinkClicked", "(Lkotlin/jvm/functions/Function1;)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSApplicantDataDescriptionView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSApplicantDataDescriptionView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSApplicantDataDescriptionView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,39:1\n157#2,8:40\n*S KotlinDebug\n*F\n+ 1 SNSApplicantDataDescriptionView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSApplicantDataDescriptionView\n*L\n31#1:40,8\n*E\n"})
public final class SNSApplicantDataDescriptionView extends SNSApplicantDataBaseFieldView {

    @Nullable
    private Function1<? super String, Unit> onLinkClicked;

    @NotNull
    private final SNSSubtitle2TextView subtitleView;

    public SNSApplicantDataDescriptionView(@NotNull Context context) {
        super(context, null, 0, 0, 14, null);
        removeAllViews();
        SNSSubtitle2TextView sNSSubtitle2TextView = new SNSSubtitle2TextView(context, null, 0, 0, 14, null);
        sNSSubtitle2TextView.setPadding(sNSSubtitle2TextView.getPaddingLeft(), context.getResources().getDimensionPixelSize(R$dimen.sns_margin_medium), sNSSubtitle2TextView.getPaddingRight(), sNSSubtitle2TextView.getPaddingBottom());
        this.subtitleView = sNSSubtitle2TextView;
        addView(sNSSubtitle2TextView);
        onInitializationFinished();
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    @Nullable
    public CharSequence getLabel() {
        return this.subtitleView.getText();
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    @Nullable
    public Function1<String, Unit> getOnLinkClicked() {
        return this.onLinkClicked;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setLabel(@Nullable CharSequence charSequence) {
        this.subtitleView.setText(charSequence);
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setOnLinkClicked(@Nullable Function1<? super String, Unit> function1) {
        super.setOnLinkClicked(function1);
        AbstractC28485q.m69381a(this.subtitleView, function1);
        this.onLinkClicked = function1;
    }
}
