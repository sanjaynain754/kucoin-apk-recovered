package com.sumsub.sns.databinding;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.sumsub.sns.core.widget.SNSCaptionTextView;

/* JADX INFO: renamed from: com.sumsub.sns.databinding.L */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28332L implements ViewBinding {

    /* JADX INFO: renamed from: a */
    public final View f57674a;

    /* JADX INFO: renamed from: b */
    public final RecyclerView f57675b;

    /* JADX INFO: renamed from: c */
    public final SNSCaptionTextView f57676c;

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f57674a;
    }

    public C28332L(ViewGroup viewGroup, RecyclerView recyclerView, SNSCaptionTextView sNSCaptionTextView) {
        this.f57674a = viewGroup;
        this.f57675b = recyclerView;
        this.f57676c = sNSCaptionTextView;
    }
}
