package com.sumsub.sns.databinding;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.sumsub.sns.core.widget.SNSCaptionTextView;
import com.sumsub.sns.core.widget.SNSH1TextView;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.core.widget.SNSTextInputEditText;
import com.sumsub.sns.core.widget.SNSTextInputLayout;

/* JADX INFO: renamed from: com.sumsub.sns.databinding.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28356u implements ViewBinding {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f57797a;

    /* JADX INFO: renamed from: b */
    public final SNSTextInputLayout f57798b;

    /* JADX INFO: renamed from: c */
    public final SNSTextInputEditText f57799c;

    /* JADX INFO: renamed from: d */
    public final SNSCaptionTextView f57800d;

    /* JADX INFO: renamed from: e */
    public final SNSPrimaryButton f57801e;

    /* JADX INFO: renamed from: f */
    public final SNSSubtitle2TextView f57802f;

    /* JADX INFO: renamed from: g */
    public final SNSH1TextView f57803g;

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f57797a;
    }

    public C28356u(ConstraintLayout constraintLayout, SNSTextInputLayout sNSTextInputLayout, SNSTextInputEditText sNSTextInputEditText, SNSCaptionTextView sNSCaptionTextView, SNSPrimaryButton sNSPrimaryButton, SNSSubtitle2TextView sNSSubtitle2TextView, SNSH1TextView sNSH1TextView) {
        this.f57797a = constraintLayout;
        this.f57798b = sNSTextInputLayout;
        this.f57799c = sNSTextInputEditText;
        this.f57800d = sNSCaptionTextView;
        this.f57801e = sNSPrimaryButton;
        this.f57802f = sNSSubtitle2TextView;
        this.f57803g = sNSH1TextView;
    }
}
