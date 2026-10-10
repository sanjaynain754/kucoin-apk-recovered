package com.sumsub.sns.internal.features.presentation.sumsubid.p124ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.viewbinding.ViewBindings;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.databinding.C28335O;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.ui.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C32580f extends FunctionReferenceImpl implements Function2 {

    /* JADX INFO: renamed from: a */
    public static final C32580f f66448a = new C32580f();

    public C32580f() {
        super(2, C28335O.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/sumsub/sns/databinding/SnsSumsubidStateWebviewBinding;", 0);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.sns_sumsubid_state_webview, viewGroup);
        int i11 = R$id.sns_webview;
        WebView webView = (WebView) ViewBindings.findChildViewById(viewGroup, i11);
        if (webView != null) {
            return new C28335O(viewGroup, webView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(i11)));
    }
}
