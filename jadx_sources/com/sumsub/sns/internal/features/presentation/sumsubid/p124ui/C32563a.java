package com.sumsub.sns.internal.features.presentation.sumsubid.p124ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.divider.MaterialDivider;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.widget.SNSCheckBox;
import com.sumsub.sns.core.widget.SNSH1TextView;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.core.widget.SNSTextView;
import com.sumsub.sns.databinding.C28331K;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.ui.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C32563a extends FunctionReferenceImpl implements Function2 {

    /* JADX INFO: renamed from: a */
    public static final C32563a f66419a = new C32563a();

    public C32563a() {
        super(2, C28331K.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/sumsub/sns/databinding/SnsSumsubidStateAgreementsBinding;", 0);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.sns_sumsubid_state_agreements, viewGroup);
        int i11 = R$id.sns_checkbox_user_consent;
        SNSCheckBox sNSCheckBox = (SNSCheckBox) ViewBindings.findChildViewById(viewGroup, i11);
        if (sNSCheckBox != null) {
            i11 = R$id.sns_checkgroup;
            if (((ConstraintLayout) ViewBindings.findChildViewById(viewGroup, i11)) != null) {
                i11 = R$id.sns_divider;
                if (((MaterialDivider) ViewBindings.findChildViewById(viewGroup, i11)) != null) {
                    i11 = R$id.sns_footer;
                    SNSTextView sNSTextView = (SNSTextView) ViewBindings.findChildViewById(viewGroup, i11);
                    if (sNSTextView != null) {
                        i11 = R$id.sns_subtitle;
                        SNSSubtitle2TextView sNSSubtitle2TextView = (SNSSubtitle2TextView) ViewBindings.findChildViewById(viewGroup, i11);
                        if (sNSSubtitle2TextView != null) {
                            i11 = R$id.sns_sumsubid_benefit_icon_instantly;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewGroup, i11);
                            if (imageView != null) {
                                i11 = R$id.sns_sumsubid_benefit_icon_optionally;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewGroup, i11);
                                if (imageView2 != null) {
                                    i11 = R$id.sns_sumsubid_benefit_icon_securely;
                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewGroup, i11);
                                    if (imageView3 != null) {
                                        i11 = R$id.sns_sumsubid_benefit_title_instantly;
                                        SNSSubtitle2TextView sNSSubtitle2TextView2 = (SNSSubtitle2TextView) ViewBindings.findChildViewById(viewGroup, i11);
                                        if (sNSSubtitle2TextView2 != null) {
                                            i11 = R$id.sns_sumsubid_benefit_title_optionally;
                                            SNSSubtitle2TextView sNSSubtitle2TextView3 = (SNSSubtitle2TextView) ViewBindings.findChildViewById(viewGroup, i11);
                                            if (sNSSubtitle2TextView3 != null) {
                                                i11 = R$id.sns_sumsubid_benefit_title_securely;
                                                SNSSubtitle2TextView sNSSubtitle2TextView4 = (SNSSubtitle2TextView) ViewBindings.findChildViewById(viewGroup, i11);
                                                if (sNSSubtitle2TextView4 != null) {
                                                    i11 = R$id.sns_text_user_consent;
                                                    SNSTextView sNSTextView2 = (SNSTextView) ViewBindings.findChildViewById(viewGroup, i11);
                                                    if (sNSTextView2 != null) {
                                                        i11 = R$id.sns_title;
                                                        SNSH1TextView sNSH1TextView = (SNSH1TextView) ViewBindings.findChildViewById(viewGroup, i11);
                                                        if (sNSH1TextView != null) {
                                                            return new C28331K(viewGroup, sNSCheckBox, sNSTextView, sNSSubtitle2TextView, imageView, imageView2, imageView3, sNSSubtitle2TextView2, sNSSubtitle2TextView3, sNSSubtitle2TextView4, sNSTextView2, sNSH1TextView);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(i11)));
    }
}
