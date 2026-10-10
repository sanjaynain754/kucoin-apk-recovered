package com.sumsub.sns.internal.features.presentation.sumsubid;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.sumsub.sns.R$id;
import com.sumsub.sns.core.widget.SNSAspectRatioImageView;
import com.sumsub.sns.core.widget.SNSBottomSheetHandleView;
import com.sumsub.sns.core.widget.SNSH1TextView;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSSubtitle1TextView;
import com.sumsub.sns.databinding.C28330J;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.P */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C32488P extends FunctionReferenceImpl implements Function1 {

    /* JADX INFO: renamed from: a */
    public static final C32488P f66283a = new C32488P();

    public C32488P() {
        super(1, C28330J.class, "bind", "bind(Landroid/view/View;)Lcom/sumsub/sns/databinding/SnsSumsubidLearnMoreBottomSheetBinding;", 0);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        int i11 = R$id.sns_sumsubid_learn_more_banner;
        SNSAspectRatioImageView sNSAspectRatioImageView = (SNSAspectRatioImageView) ViewBindings.findChildViewById(view, i11);
        if (sNSAspectRatioImageView != null) {
            i11 = R$id.sns_sumsubid_learn_more_benefits;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                i11 = R$id.sns_sumsubid_learn_more_button;
                SNSPrimaryButton sNSPrimaryButton = (SNSPrimaryButton) ViewBindings.findChildViewById(view, i11);
                if (sNSPrimaryButton != null) {
                    i11 = R$id.sns_sumsubid_learn_more_handle;
                    if (((SNSBottomSheetHandleView) ViewBindings.findChildViewById(view, i11)) != null) {
                        i11 = R$id.sns_sumsubid_learn_more_scroll;
                        if (((NestedScrollView) ViewBindings.findChildViewById(view, i11)) != null) {
                            i11 = R$id.sns_sumsubid_learn_more_subtitle;
                            SNSSubtitle1TextView sNSSubtitle1TextView = (SNSSubtitle1TextView) ViewBindings.findChildViewById(view, i11);
                            if (sNSSubtitle1TextView != null) {
                                i11 = R$id.sns_sumsubid_learn_more_title;
                                SNSH1TextView sNSH1TextView = (SNSH1TextView) ViewBindings.findChildViewById(view, i11);
                                if (sNSH1TextView != null) {
                                    return new C28330J((ConstraintLayout) view, sNSAspectRatioImageView, linearLayout, sNSPrimaryButton, sNSSubtitle1TextView, sNSH1TextView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }
}
