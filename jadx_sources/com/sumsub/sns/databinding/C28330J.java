package com.sumsub.sns.databinding;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.sumsub.sns.core.widget.SNSAspectRatioImageView;
import com.sumsub.sns.core.widget.SNSH1TextView;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSSubtitle1TextView;

/* JADX INFO: renamed from: com.sumsub.sns.databinding.J */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28330J implements ViewBinding {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f57656a;

    /* JADX INFO: renamed from: b */
    public final SNSAspectRatioImageView f57657b;

    /* JADX INFO: renamed from: c */
    public final LinearLayout f57658c;

    /* JADX INFO: renamed from: d */
    public final SNSPrimaryButton f57659d;

    /* JADX INFO: renamed from: e */
    public final SNSSubtitle1TextView f57660e;

    /* JADX INFO: renamed from: f */
    public final SNSH1TextView f57661f;

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f57656a;
    }

    public C28330J(ConstraintLayout constraintLayout, SNSAspectRatioImageView sNSAspectRatioImageView, LinearLayout linearLayout, SNSPrimaryButton sNSPrimaryButton, SNSSubtitle1TextView sNSSubtitle1TextView, SNSH1TextView sNSH1TextView) {
        this.f57656a = constraintLayout;
        this.f57657b = sNSAspectRatioImageView;
        this.f57658c = linearLayout;
        this.f57659d = sNSPrimaryButton;
        this.f57660e = sNSSubtitle1TextView;
        this.f57661f = sNSH1TextView;
    }
}
