package com.pichillilorenzo.flutter_inappwebview_android.webview;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class InAppWebViewManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "InAppWebViewManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_manager";
    public final Map<String, FlutterWebView> keepAliveWebViews;
    public InAppWebViewFlutterPlugin plugin;
    public int windowAutoincrementId;
    public final Map<Integer, Message> windowWebViewMessages;

    public InAppWebViewManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.keepAliveWebViews = new HashMap();
        this.windowWebViewMessages = new HashMap();
        this.windowAutoincrementId = 0;
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public void clearAllCache(Context context, boolean z11) {
        WebView webView = new WebView(context);
        webView.clearCache(z11);
        webView.destroy();
    }

    public Map<String, Object> convertWebViewPackageToMap(PackageInfo packageInfo) {
        HashMap map = new HashMap();
        map.put("versionName", packageInfo.versionName);
        map.put(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, packageInfo.packageName);
        return map;
    }

    public void disposeKeepAlive(String str) {
        ViewGroup viewGroup;
        FlutterWebView flutterWebView = this.keepAliveWebViews.get(str);
        if (flutterWebView != null) {
            flutterWebView.keepAliveId = null;
            View view = flutterWebView.getView();
            if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                viewGroup.removeView(view);
            }
            flutterWebView.dispose();
        }
        if (this.keepAliveWebViews.containsKey(str)) {
            this.keepAliveWebViews.put(str, null);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, final MethodChannel.Result result) {
        Context context;
        String str = methodCall.method;
        str.getClass();
        switch (str) {
            case "disableWebView":
                if (Build.VERSION.SDK_INT >= 28) {
                    WebView.disableWebView();
                }
                result.success(Boolean.TRUE);
                break;
            case "setWebContentsDebuggingEnabled":
                WebView.setWebContentsDebuggingEnabled(((Boolean) methodCall.argument("debuggingEnabled")).booleanValue());
                result.success(Boolean.TRUE);
                break;
            case "getVariationsHeader":
                if (WebViewFeature.isFeatureSupported(WebViewFeature.GET_VARIATIONS_HEADER)) {
                    result.success(WebViewCompat.getVariationsHeader());
                    break;
                } else {
                    result.success(null);
                    break;
                }
                break;
            case "clearClientCertPreferences":
                WebView.clearClientCertPreferences(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager.1
                    @Override // java.lang.Runnable
                    public void run() {
                        result.success(Boolean.TRUE);
                    }
                });
                break;
            case "getSafeBrowsingPrivacyPolicyUrl":
                if (WebViewFeature.isFeatureSupported(WebViewFeature.SAFE_BROWSING_PRIVACY_POLICY_URL)) {
                    result.success(WebViewCompat.getSafeBrowsingPrivacyPolicyUrl().toString());
                    break;
                } else {
                    result.success(null);
                    break;
                }
                break;
            case "setSafeBrowsingAllowlist":
                if (WebViewFeature.isFeatureSupported(WebViewFeature.SAFE_BROWSING_ALLOWLIST)) {
                    WebViewCompat.setSafeBrowsingAllowlist(new HashSet((List) methodCall.argument("hosts")), new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager.2
                        @Override // android.webkit.ValueCallback
                        public void onReceiveValue(Boolean bool) {
                            result.success(bool);
                        }
                    });
                    break;
                } else {
                    if (!WebViewFeature.isFeatureSupported(WebViewFeature.SAFE_BROWSING_WHITELIST)) {
                        result.success(Boolean.FALSE);
                    } else {
                        WebViewCompat.setSafeBrowsingWhitelist((List) methodCall.argument("hosts"), new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager.3
                            @Override // android.webkit.ValueCallback
                            public void onReceiveValue(Boolean bool) {
                                result.success(bool);
                            }
                        });
                    }
                    break;
                }
                break;
            case "getDefaultUserAgent":
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
                if (inAppWebViewFlutterPlugin != null) {
                    result.success(WebSettings.getDefaultUserAgent(inAppWebViewFlutterPlugin.applicationContext));
                    break;
                } else {
                    result.success(null);
                    break;
                }
                break;
            case "clearAllCache":
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
                if (inAppWebViewFlutterPlugin2 != null) {
                    Context context2 = inAppWebViewFlutterPlugin2.activity;
                    if (context2 == null) {
                        context2 = inAppWebViewFlutterPlugin2.applicationContext;
                    }
                    if (context2 != null) {
                        clearAllCache(context2, ((Boolean) methodCall.argument("includeDiskFiles")).booleanValue());
                    }
                }
                result.success(Boolean.TRUE);
                break;
            case "getCurrentWebViewPackage":
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin3 = this.plugin;
                if (inAppWebViewFlutterPlugin3 != null) {
                    context = inAppWebViewFlutterPlugin3.activity;
                    if (context == null) {
                        context = inAppWebViewFlutterPlugin3.applicationContext;
                    }
                } else {
                    context = null;
                }
                PackageInfo currentWebViewPackage = context != null ? WebViewCompat.getCurrentWebViewPackage(context) : null;
                result.success(currentWebViewPackage != null ? convertWebViewPackageToMap(currentWebViewPackage) : null);
                break;
            case "isMultiProcessEnabled":
                if (WebViewFeature.isFeatureSupported(WebViewFeature.MULTI_PROCESS)) {
                    result.success(Boolean.valueOf(WebViewCompat.isMultiProcessEnabled()));
                    break;
                } else {
                    result.success(Boolean.FALSE);
                    break;
                }
                break;
            case "disposeKeepAlive":
                String str2 = (String) methodCall.argument("keepAliveId");
                if (str2 != null) {
                    disposeKeepAlive(str2);
                }
                result.success(Boolean.TRUE);
                break;
            default:
                result.notImplemented();
                break;
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        Iterator<FlutterWebView> it = this.keepAliveWebViews.values().iterator();
        while (it.hasNext()) {
            String str = it.next().keepAliveId;
            if (str != null) {
                disposeKeepAlive(str);
            }
        }
        this.keepAliveWebViews.clear();
        this.windowWebViewMessages.clear();
        this.plugin = null;
    }
}
