package com.sumsub.sns.databinding;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.sumsub.sns.core.widget.SNSCaptionTextView;
import com.sumsub.sns.core.widget.SNSH1TextView;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.core.widget.SNSTextInputEditText;

/* JADX INFO: renamed from: com.sumsub.sns.databinding.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28357v implements ViewBinding {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f57804a;

    /* JADX INFO: renamed from: b */
    public final SNSCaptionTextView f57805b;

    /* JADX INFO: renamed from: c */
    public final SNSTextInputEditText f57806c;

    /* JADX INFO: renamed from: d */
    public final SNSPrimaryButton f57807d;

    /* JADX INFO: renamed from: e */
    public final SNSSubtitle2TextView f57808e;

    /* JADX INFO: renamed from: f */
    public final SNSH1TextView f57809f;

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f57804a;
    }

    public C28357v(ConstraintLayout constraintLayout, SNSCaptionTextView sNSCaptionTextView, SNSTextInputEditText sNSTextInputEditText, SNSPrimaryButton sNSPrimaryButton, SNSSubtitle2TextView sNSSubtitle2TextView, SNSH1TextView sNSH1TextView) {
        this.f57804a = constraintLayout;
        this.f57805b = sNSCaptionTextView;
        this.f57806c = sNSTextInputEditText;
        this.f57807d = sNSPrimaryButton;
        this.f57808e = sNSSubtitle2TextView;
        this.f57809f = sNSH1TextView;
    }
}
