package com.sumsub.sns.databinding;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.sumsub.sns.core.widget.SNSImageView;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;

/* JADX INFO: renamed from: com.sumsub.sns.databinding.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28354s implements ViewBinding {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f57787a;

    /* JADX INFO: renamed from: b */
    public final SNSPrimaryButton f57788b;

    /* JADX INFO: renamed from: c */
    public final SNSSubtitle2TextView f57789c;

    /* JADX INFO: renamed from: d */
    public final SNSImageView f57790d;

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f57787a;
    }

    public C28354s(ConstraintLayout constraintLayout, SNSPrimaryButton sNSPrimaryButton, SNSSubtitle2TextView sNSSubtitle2TextView, SNSImageView sNSImageView) {
        this.f57787a = constraintLayout;
        this.f57788b = sNSPrimaryButton;
        this.f57789c = sNSSubtitle2TextView;
        this.f57790d = sNSImageView;
    }
}
