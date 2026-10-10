package com.sumsub.sns.databinding;

import android.view.View;
import android.widget.RadioGroup;
import androidx.viewbinding.ViewBinding;
import com.sumsub.sns.core.widget.SNSBackgroundConstraintLayout;
import com.sumsub.sns.core.widget.SNSCaptionTextView;
import com.sumsub.sns.core.widget.SNSCountrySelectorView;
import com.sumsub.sns.core.widget.SNSH1TextView;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSSubtitle1TextView;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;

/* JADX INFO: renamed from: com.sumsub.sns.databinding.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28340e implements ViewBinding {

    /* JADX INFO: renamed from: a */
    public final SNSBackgroundConstraintLayout f57713a;

    /* JADX INFO: renamed from: b */
    public final SNSPrimaryButton f57714b;

    /* JADX INFO: renamed from: c */
    public final SNSCountrySelectorView f57715c;

    /* JADX INFO: renamed from: d */
    public final SNSSubtitle1TextView f57716d;

    /* JADX INFO: renamed from: e */
    public final SNSSubtitle2TextView f57717e;

    /* JADX INFO: renamed from: f */
    public final SNSCaptionTextView f57718f;

    /* JADX INFO: renamed from: g */
    public final RadioGroup f57719g;

    /* JADX INFO: renamed from: h */
    public final SNSH1TextView f57720h;

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f57713a;
    }

    public C28340e(SNSBackgroundConstraintLayout sNSBackgroundConstraintLayout, SNSPrimaryButton sNSPrimaryButton, SNSCountrySelectorView sNSCountrySelectorView, SNSSubtitle1TextView sNSSubtitle1TextView, SNSSubtitle2TextView sNSSubtitle2TextView, SNSCaptionTextView sNSCaptionTextView, RadioGroup radioGroup, SNSH1TextView sNSH1TextView) {
        this.f57713a = sNSBackgroundConstraintLayout;
        this.f57714b = sNSPrimaryButton;
        this.f57715c = sNSCountrySelectorView;
        this.f57716d = sNSSubtitle1TextView;
        this.f57717e = sNSSubtitle2TextView;
        this.f57718f = sNSCaptionTextView;
        this.f57719g = radioGroup;
        this.f57720h = sNSH1TextView;
    }
}
