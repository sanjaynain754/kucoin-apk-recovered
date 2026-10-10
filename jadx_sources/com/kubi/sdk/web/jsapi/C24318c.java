package com.kubi.sdk.web.jsapi;

import android.webkit.WebView;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.web.config.WebConfig;
import com.kubi.sdk.web.core.WebBridge;
import com.kubi.sdk.web.util.C24329b;
import com.sensorsdata.analytics.android.sdk.SensorsDataAutoTrackHelper;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.web.jsapi.c */
/* JADX INFO: compiled from: JsBridgeHelper.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u00020\u0007*\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u0007*\u00020\u0004¢\u0006\u0004\b\f\u0010\u000bJ\u0011\u0010\r\u001a\u00020\u0007*\u00020\u0004¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/sdk/web/jsapi/c;", "", "<init>", "()V", "Landroid/webkit/WebView;", "Lcom/kubi/sdk/web/core/WebBridge;", "bridge", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/webkit/WebView;Lcom/kubi/sdk/web/core/WebBridge;)V", "c", "(Landroid/webkit/WebView;)V", "b", "d", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C24318c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C24318c f48486a = new C24318c();

    /* JADX INFO: renamed from: a */
    public final void m58766a(@NotNull WebView webView, @NotNull WebBridge bridge) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        Intrinsics.checkNotNullParameter(bridge, "bridge");
        C24329b.f48558a.m58864d("jsbridgeEnable", "addBizJsBridge");
        webView.addJavascriptInterface(new HybridJsInterface(bridge), WebConfig.f48355a.m58595f());
    }

    /* JADX INFO: renamed from: b */
    public final void m58767b(@NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        SensorsDataAutoTrackHelper.loadUrl2(webView, "");
    }

    /* JADX INFO: renamed from: c */
    public final void m58768c(@NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        C24329b.f48558a.m58864d("jsbridgeEnable", "removeBizJsBridge");
        webView.removeJavascriptInterface(WebConfig.f48355a.m58595f());
    }

    /* JADX INFO: renamed from: d */
    public final void m58769d(@NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        webView.removeJavascriptInterface("SensorsData_APP_New_H5_Bridge");
        webView.removeJavascriptInterface("SensorsData_App_Visual_Bridge");
    }
}
