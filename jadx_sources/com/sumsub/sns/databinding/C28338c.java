package com.sumsub.sns.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import androidx.viewbinding.ViewBinding;
import com.sumsub.sns.core.widget.SNSBackgroundConstraintLayout;
import com.sumsub.sns.core.widget.SNSBodyTextView;
import com.sumsub.sns.core.widget.SNSH2TextView;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;

/* JADX INFO: renamed from: com.sumsub.sns.databinding.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28338c implements ViewBinding {

    /* JADX INFO: renamed from: a */
    public final SNSBackgroundConstraintLayout f57695a;

    /* JADX INFO: renamed from: b */
    public final SNSBodyTextView f57696b;

    /* JADX INFO: renamed from: c */
    public final ImageView f57697c;

    /* JADX INFO: renamed from: d */
    public final SNSPrimaryButton f57698d;

    /* JADX INFO: renamed from: e */
    public final RadioGroup f57699e;

    /* JADX INFO: renamed from: f */
    public final SNSSubtitle2TextView f57700f;

    /* JADX INFO: renamed from: g */
    public final SNSH2TextView f57701g;

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f57695a;
    }

    public C28338c(SNSBackgroundConstraintLayout sNSBackgroundConstraintLayout, SNSBodyTextView sNSBodyTextView, ImageView imageView, SNSPrimaryButton sNSPrimaryButton, RadioGroup radioGroup, SNSSubtitle2TextView sNSSubtitle2TextView, SNSH2TextView sNSH2TextView) {
        this.f57695a = sNSBackgroundConstraintLayout;
        this.f57696b = sNSBodyTextView;
        this.f57697c = imageView;
        this.f57698d = sNSPrimaryButton;
        this.f57699e = radioGroup;
        this.f57700f = sNSSubtitle2TextView;
        this.f57701g = sNSH2TextView;
    }
}
