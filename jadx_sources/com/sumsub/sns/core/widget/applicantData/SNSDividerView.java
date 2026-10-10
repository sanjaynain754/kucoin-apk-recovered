package com.sumsub.sns.core.widget.applicantData;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.core.presentation.helper.AbstractC28233a;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSDividerView;", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", Constants.ScionAnalytics.PARAM_LABEL, "", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSDividerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSDividerView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSDividerView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,39:1\n157#2,8:40\n*S KotlinDebug\n*F\n+ 1 SNSDividerView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSDividerView\n*L\n32#1:40,8\n*E\n"})
public final class SNSDividerView extends SNSApplicantDataBaseFieldView {

    @Nullable
    private CharSequence label;

    public SNSDividerView(@NotNull Context context) {
        Float fM69171a;
        Integer numM69172a;
        super(context, null, 0, 0, 14, null);
        C28966p c28966pM69169a = AbstractC28233a.m69169a();
        int color = (c28966pM69169a == null || (numM69172a = AbstractC28233a.m69172a(c28966pM69169a, SNSColorElement.CONTENT_WEAK, AbstractC28458h.m69346a(context.getResources().getConfiguration()))) == null) ? context.getColor(R$color.sns_listSeparator) : numM69172a.intValue();
        C28966p c28966pM69169a2 = AbstractC28233a.m69169a();
        int dimensionPixelSize = (c28966pM69169a2 == null || (fM69171a = AbstractC28233a.m69171a(c28966pM69169a2, SNSMetricElement.LIST_SEPARATOR_HEIGHT)) == null) ? context.getResources().getDimensionPixelSize(R$dimen.sns_list_separator_height_default) : (int) fM69171a.floatValue();
        View view = new View(context);
        view.setBackgroundColor(color);
        view.setLayoutParams(new ConstraintLayout.LayoutParams(-1, dimensionPixelSize));
        addView(view);
        Resources resources = context.getResources();
        int i11 = R$dimen.sns_margin_tiny_plus;
        setPadding(getPaddingLeft(), resources.getDimensionPixelSize(i11), getPaddingRight(), context.getResources().getDimensionPixelSize(i11));
        onInitializationFinished();
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    @Nullable
    public CharSequence getLabel() {
        return this.label;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setLabel(@Nullable CharSequence charSequence) {
        this.label = charSequence;
    }
}
