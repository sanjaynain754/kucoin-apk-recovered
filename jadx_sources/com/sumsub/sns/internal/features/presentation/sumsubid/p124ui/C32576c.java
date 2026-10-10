package com.sumsub.sns.internal.features.presentation.sumsubid.p124ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBindings;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.widget.SNSH1TextView;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.core.widget.SNSTextInputEditText;
import com.sumsub.sns.core.widget.SNSTextInputLayout;
import com.sumsub.sns.databinding.C28333M;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.ui.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C32576c extends FunctionReferenceImpl implements Function2 {

    /* JADX INFO: renamed from: a */
    public static final C32576c f66441a = new C32576c();

    public C32576c() {
        super(2, C28333M.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/sumsub/sns/databinding/SnsSumsubidStateEmailBinding;", 0);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.sns_sumsubid_state_email, viewGroup);
        int i11 = R$id.sns_email;
        SNSTextInputLayout sNSTextInputLayout = (SNSTextInputLayout) ViewBindings.findChildViewById(viewGroup, i11);
        if (sNSTextInputLayout != null) {
            i11 = R$id.sns_email_id;
            SNSTextInputEditText sNSTextInputEditText = (SNSTextInputEditText) ViewBindings.findChildViewById(viewGroup, i11);
            if (sNSTextInputEditText != null) {
                i11 = R$id.sns_subtitle;
                SNSSubtitle2TextView sNSSubtitle2TextView = (SNSSubtitle2TextView) ViewBindings.findChildViewById(viewGroup, i11);
                if (sNSSubtitle2TextView != null) {
                    i11 = R$id.sns_title;
                    SNSH1TextView sNSH1TextView = (SNSH1TextView) ViewBindings.findChildViewById(viewGroup, i11);
                    if (sNSH1TextView != null) {
                        return new C28333M(viewGroup, sNSTextInputLayout, sNSTextInputEditText, sNSSubtitle2TextView, sNSH1TextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(i11)));
    }
}
