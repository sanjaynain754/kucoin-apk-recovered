package com.sumsub.sns.databinding;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.sumsub.sns.core.widget.SNSBottomSheetView;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSTextInputLayout;
import com.sumsub.sns.core.widget.SNSToolbarView;

/* JADX INFO: renamed from: com.sumsub.sns.databinding.C */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28323C implements ViewBinding {

    /* JADX INFO: renamed from: a */
    public final SNSBottomSheetView f57630a;

    /* JADX INFO: renamed from: b */
    public final SNSPrimaryButton f57631b;

    /* JADX INFO: renamed from: c */
    public final SNSTextInputLayout f57632c;

    /* JADX INFO: renamed from: d */
    public final RecyclerView f57633d;

    /* JADX INFO: renamed from: e */
    public final SNSToolbarView f57634e;

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f57630a;
    }

    public C28323C(SNSBottomSheetView sNSBottomSheetView, SNSPrimaryButton sNSPrimaryButton, SNSTextInputLayout sNSTextInputLayout, RecyclerView recyclerView, SNSToolbarView sNSToolbarView) {
        this.f57630a = sNSBottomSheetView;
        this.f57631b = sNSPrimaryButton;
        this.f57632c = sNSTextInputLayout;
        this.f57633d = recyclerView;
        this.f57634e = sNSToolbarView;
    }
}
