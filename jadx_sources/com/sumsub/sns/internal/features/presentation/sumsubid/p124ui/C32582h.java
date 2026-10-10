package com.sumsub.sns.internal.features.presentation.sumsubid.p124ui;

import android.os.Message;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.sumsub.sns.internal.features.presentation.sumsubid.AbstractC32493S;
import com.sumsub.sns.internal.features.presentation.sumsubid.C32496T0;
import java.lang.ref.WeakReference;
import java.util.List;
import p852kotlin.collections.ArraysKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.ui.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32582h extends WebChromeClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C32583i f66449a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32496T0 f66450b;

    public C32582h(C32583i c32583i, C32496T0 c32496t0) {
        this.f66449a = c32583i;
        this.f66450b = c32496t0;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z11, boolean z12, Message message) {
        WebView.HitTestResult hitTestResult;
        String extra;
        if (webView == null || (hitTestResult = webView.getHitTestResult()) == null || (extra = hitTestResult.getExtra()) == null) {
            return false;
        }
        this.f66449a.f66453c.invoke(this.f66450b.f66327d.invoke(extra));
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        List list;
        String[] resources = permissionRequest.getResources();
        if (resources != null) {
            list = ArraysKt.toList(resources);
        } else {
            list = null;
        }
        AbstractC32493S.m71164a("Got permission request from web view: " + list);
        if (ArraysKt.contains(permissionRequest.getResources(), "android.webkit.resource.VIDEO_CAPTURE")) {
            this.f66449a.f66456f = new WeakReference(permissionRequest);
            this.f66449a.f66454d.invoke();
            return;
        }
        permissionRequest.deny();
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        List list;
        String[] resources = permissionRequest.getResources();
        if (resources != null) {
            list = ArraysKt.toList(resources);
        } else {
            list = null;
        }
        AbstractC32493S.m71164a("Permission request was canceled: " + list);
        this.f66449a.f66455e.invoke();
        this.f66449a.f66456f = null;
    }
}
