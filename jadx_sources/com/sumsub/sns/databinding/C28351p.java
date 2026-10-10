package com.sumsub.sns.databinding;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.sumsub.sns.core.widget.SNSBackgroundConstraintLayout;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSSecondaryButton;
import com.sumsub.sns.core.widget.SNSToolbarView;

/* JADX INFO: renamed from: com.sumsub.sns.databinding.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28351p implements ViewBinding {

    /* JADX INFO: renamed from: a */
    public final SNSBackgroundConstraintLayout f57775a;

    /* JADX INFO: renamed from: b */
    public final SNSPrimaryButton f57776b;

    /* JADX INFO: renamed from: c */
    public final ConstraintLayout f57777c;

    /* JADX INFO: renamed from: d */
    public final SNSSecondaryButton f57778d;

    /* JADX INFO: renamed from: e */
    public final SNSToolbarView f57779e;

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f57775a;
    }

    public C28351p(SNSBackgroundConstraintLayout sNSBackgroundConstraintLayout, SNSPrimaryButton sNSPrimaryButton, ConstraintLayout constraintLayout, SNSSecondaryButton sNSSecondaryButton, SNSToolbarView sNSToolbarView) {
        this.f57775a = sNSBackgroundConstraintLayout;
        this.f57776b = sNSPrimaryButton;
        this.f57777c = constraintLayout;
        this.f57778d = sNSSecondaryButton;
        this.f57779e = sNSToolbarView;
    }
}
