package com.sumsub.sns.databinding;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.sumsub.sns.core.widget.SNSH1TextView;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;

/* JADX INFO: renamed from: com.sumsub.sns.databinding.H */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28328H implements ViewBinding {

    /* JADX INFO: renamed from: a */
    public final LinearLayout f57649a;

    /* JADX INFO: renamed from: b */
    public final SNSSubtitle2TextView f57650b;

    /* JADX INFO: renamed from: c */
    public final SNSH1TextView f57651c;

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f57649a;
    }

    public C28328H(LinearLayout linearLayout, SNSSubtitle2TextView sNSSubtitle2TextView, SNSH1TextView sNSH1TextView) {
        this.f57649a = linearLayout;
        this.f57650b = sNSSubtitle2TextView;
        this.f57651c = sNSH1TextView;
    }
}
