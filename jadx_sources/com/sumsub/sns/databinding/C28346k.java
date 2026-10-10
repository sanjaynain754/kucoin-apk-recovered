package com.sumsub.sns.databinding;

import android.view.View;
import android.widget.RadioGroup;
import androidx.viewbinding.ViewBinding;
import com.sumsub.sns.core.widget.SNSBackgroundConstraintLayout;
import com.sumsub.sns.core.widget.SNSH1TextView;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSSubtitle1TextView;

/* JADX INFO: renamed from: com.sumsub.sns.databinding.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28346k implements ViewBinding {

    /* JADX INFO: renamed from: a */
    public final SNSBackgroundConstraintLayout f57748a;

    /* JADX INFO: renamed from: b */
    public final SNSPrimaryButton f57749b;

    /* JADX INFO: renamed from: c */
    public final RadioGroup f57750c;

    /* JADX INFO: renamed from: d */
    public final SNSSubtitle1TextView f57751d;

    /* JADX INFO: renamed from: e */
    public final SNSH1TextView f57752e;

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f57748a;
    }

    public C28346k(SNSBackgroundConstraintLayout sNSBackgroundConstraintLayout, SNSPrimaryButton sNSPrimaryButton, RadioGroup radioGroup, SNSSubtitle1TextView sNSSubtitle1TextView, SNSH1TextView sNSH1TextView) {
        this.f57748a = sNSBackgroundConstraintLayout;
        this.f57749b = sNSPrimaryButton;
        this.f57750c = radioGroup;
        this.f57751d = sNSSubtitle1TextView;
        this.f57752e = sNSH1TextView;
    }
}
