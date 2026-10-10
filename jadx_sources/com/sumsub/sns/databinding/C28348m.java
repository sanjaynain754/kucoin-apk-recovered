package com.sumsub.sns.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.sumsub.sns.core.widget.SNSPrimaryButton;

/* JADX INFO: renamed from: com.sumsub.sns.databinding.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28348m implements ViewBinding {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f57766a;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f57767b;

    /* JADX INFO: renamed from: c */
    public final SNSPrimaryButton f57768c;

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f57766a;
    }

    public C28348m(ConstraintLayout constraintLayout, FrameLayout frameLayout, SNSPrimaryButton sNSPrimaryButton) {
        this.f57766a = constraintLayout;
        this.f57767b = frameLayout;
        this.f57768c = sNSPrimaryButton;
    }
}
