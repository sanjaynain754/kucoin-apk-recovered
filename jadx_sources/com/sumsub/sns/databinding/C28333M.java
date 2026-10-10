package com.sumsub.sns.databinding;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.sumsub.sns.core.widget.SNSH1TextView;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;
import com.sumsub.sns.core.widget.SNSTextInputEditText;
import com.sumsub.sns.core.widget.SNSTextInputLayout;

/* JADX INFO: renamed from: com.sumsub.sns.databinding.M */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28333M implements ViewBinding {

    /* JADX INFO: renamed from: a */
    public final View f57677a;

    /* JADX INFO: renamed from: b */
    public final SNSTextInputLayout f57678b;

    /* JADX INFO: renamed from: c */
    public final SNSTextInputEditText f57679c;

    /* JADX INFO: renamed from: d */
    public final SNSSubtitle2TextView f57680d;

    /* JADX INFO: renamed from: e */
    public final SNSH1TextView f57681e;

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f57677a;
    }

    public C28333M(ViewGroup viewGroup, SNSTextInputLayout sNSTextInputLayout, SNSTextInputEditText sNSTextInputEditText, SNSSubtitle2TextView sNSSubtitle2TextView, SNSH1TextView sNSH1TextView) {
        this.f57677a = viewGroup;
        this.f57678b = sNSTextInputLayout;
        this.f57679c = sNSTextInputEditText;
        this.f57680d = sNSSubtitle2TextView;
        this.f57681e = sNSH1TextView;
    }
}
