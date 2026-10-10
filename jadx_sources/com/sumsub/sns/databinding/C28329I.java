package com.sumsub.sns.databinding;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.sumsub.sns.core.widget.SNSBodyTextView;
import com.sumsub.sns.core.widget.SNSSubtitle1TextView;
import com.sumsub.sns.core.widget.SNSSumsubIdBanner;
import com.sumsub.sns.core.widget.SNSSwitch;

/* JADX INFO: renamed from: com.sumsub.sns.databinding.I */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28329I implements ViewBinding {

    /* JADX INFO: renamed from: a */
    public final SNSSumsubIdBanner f57652a;

    /* JADX INFO: renamed from: b */
    public final SNSBodyTextView f57653b;

    /* JADX INFO: renamed from: c */
    public final SNSSwitch f57654c;

    /* JADX INFO: renamed from: d */
    public final SNSSubtitle1TextView f57655d;

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f57652a;
    }

    public C28329I(SNSSumsubIdBanner sNSSumsubIdBanner, SNSBodyTextView sNSBodyTextView, SNSSwitch sNSSwitch, SNSSubtitle1TextView sNSSubtitle1TextView) {
        this.f57652a = sNSSumsubIdBanner;
        this.f57653b = sNSBodyTextView;
        this.f57654c = sNSSwitch;
        this.f57655d = sNSSubtitle1TextView;
    }
}
