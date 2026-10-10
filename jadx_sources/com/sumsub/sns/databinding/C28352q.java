package com.sumsub.sns.databinding;

import android.view.View;
import android.webkit.WebView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.sumsub.sns.core.widget.SNSBottomSheetView;
import com.sumsub.sns.core.widget.SNSTextView;
import com.sumsub.sns.core.widget.SNSToolbarView;

/* JADX INFO: renamed from: com.sumsub.sns.databinding.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28352q implements ViewBinding {

    /* JADX INFO: renamed from: a */
    public final SNSBottomSheetView f57780a;

    /* JADX INFO: renamed from: b */
    public final NestedScrollView f57781b;

    /* JADX INFO: renamed from: c */
    public final SNSTextView f57782c;

    /* JADX INFO: renamed from: d */
    public final SNSToolbarView f57783d;

    /* JADX INFO: renamed from: e */
    public final NestedScrollView f57784e;

    /* JADX INFO: renamed from: f */
    public final WebView f57785f;

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f57780a;
    }

    public C28352q(SNSBottomSheetView sNSBottomSheetView, NestedScrollView nestedScrollView, SNSTextView sNSTextView, SNSToolbarView sNSToolbarView, NestedScrollView nestedScrollView2, WebView webView) {
        this.f57780a = sNSBottomSheetView;
        this.f57781b = nestedScrollView;
        this.f57782c = sNSTextView;
        this.f57783d = sNSToolbarView;
        this.f57784e = nestedScrollView2;
        this.f57785f = webView;
    }
}
