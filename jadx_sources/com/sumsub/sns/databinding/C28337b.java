package com.sumsub.sns.databinding;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.sumsub.sns.core.widget.SNSBackgroundConstraintLayout;
import com.sumsub.sns.core.widget.SNSH2TextView;
import com.sumsub.sns.core.widget.SNSImageView;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;

/* JADX INFO: renamed from: com.sumsub.sns.databinding.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28337b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    public final SNSBackgroundConstraintLayout f57691a;

    /* JADX INFO: renamed from: b */
    public final SNSImageView f57692b;

    /* JADX INFO: renamed from: c */
    public final SNSSubtitle2TextView f57693c;

    /* JADX INFO: renamed from: d */
    public final SNSH2TextView f57694d;

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f57691a;
    }

    public C28337b(SNSBackgroundConstraintLayout sNSBackgroundConstraintLayout, SNSImageView sNSImageView, SNSSubtitle2TextView sNSSubtitle2TextView, SNSH2TextView sNSH2TextView) {
        this.f57691a = sNSBackgroundConstraintLayout;
        this.f57692b = sNSImageView;
        this.f57693c = sNSSubtitle2TextView;
        this.f57694d = sNSH2TextView;
    }
}
