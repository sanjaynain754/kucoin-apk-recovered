package com.sumsub.sns.databinding;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.sumsub.sns.core.widget.SNSH1TextView;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;

/* JADX INFO: renamed from: com.sumsub.sns.databinding.N */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28334N implements ViewBinding {

    /* JADX INFO: renamed from: a */
    public final View f57682a;

    /* JADX INFO: renamed from: b */
    public final SNSSubtitle2TextView f57683b;

    /* JADX INFO: renamed from: c */
    public final SNSH1TextView f57684c;

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f57682a;
    }

    public C28334N(ViewGroup viewGroup, SNSSubtitle2TextView sNSSubtitle2TextView, SNSH1TextView sNSH1TextView) {
        this.f57682a = viewGroup;
        this.f57683b = sNSSubtitle2TextView;
        this.f57684c = sNSH1TextView;
    }
}
