package com.sumsub.sns.databinding;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.sumsub.sns.core.widget.SNSCheckBox;
import com.sumsub.sns.core.widget.SNSFlagView;
import com.sumsub.sns.core.widget.SNSSubtitle2TextView;

/* JADX INFO: renamed from: com.sumsub.sns.databinding.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28336a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f57687a;

    /* JADX INFO: renamed from: b */
    public final SNSFlagView f57688b;

    /* JADX INFO: renamed from: c */
    public final SNSCheckBox f57689c;

    /* JADX INFO: renamed from: d */
    public final SNSSubtitle2TextView f57690d;

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f57687a;
    }

    public C28336a(ConstraintLayout constraintLayout, SNSFlagView sNSFlagView, SNSCheckBox sNSCheckBox, SNSSubtitle2TextView sNSSubtitle2TextView) {
        this.f57687a = constraintLayout;
        this.f57688b = sNSFlagView;
        this.f57689c = sNSCheckBox;
        this.f57690d = sNSSubtitle2TextView;
    }
}
