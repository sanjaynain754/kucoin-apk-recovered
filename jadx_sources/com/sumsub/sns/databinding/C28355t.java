package com.sumsub.sns.databinding;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.sumsub.sns.core.widget.SNSH1TextView;
import com.sumsub.sns.core.widget.SNSLinkButton;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.core.widget.pincode.SNSPinView;

/* JADX INFO: renamed from: com.sumsub.sns.databinding.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28355t implements ViewBinding {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f57791a;

    /* JADX INFO: renamed from: b */
    public final SNSSubtitle2TextView f57792b;

    /* JADX INFO: renamed from: c */
    public final SNSPinView f57793c;

    /* JADX INFO: renamed from: d */
    public final SNSLinkButton f57794d;

    /* JADX INFO: renamed from: e */
    public final SNSSubtitle2TextView f57795e;

    /* JADX INFO: renamed from: f */
    public final SNSH1TextView f57796f;

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f57791a;
    }

    public C28355t(ConstraintLayout constraintLayout, SNSSubtitle2TextView sNSSubtitle2TextView, SNSPinView sNSPinView, SNSLinkButton sNSLinkButton, SNSSubtitle2TextView sNSSubtitle2TextView2, SNSH1TextView sNSH1TextView) {
        this.f57791a = constraintLayout;
        this.f57792b = sNSSubtitle2TextView;
        this.f57793c = sNSPinView;
        this.f57794d = sNSLinkButton;
        this.f57795e = sNSSubtitle2TextView2;
        this.f57796f = sNSH1TextView;
    }
}
