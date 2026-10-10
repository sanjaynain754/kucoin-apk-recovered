package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31704g extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C31715m f64337a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31735y f64338b;

    public C31704g(C31715m c31715m, C31735y c31735y) {
        this.f64337a = c31715m;
        this.f64338b = c31735y;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        BottomSheetBehavior bottomSheetBehavior = this.f64337a.f64406n;
        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 3 || webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
            return false;
        }
        return ((C31707h0) this.f64337a.f64393a.getValue()).m70815a(this.f64338b.f64460b, url);
    }
}
