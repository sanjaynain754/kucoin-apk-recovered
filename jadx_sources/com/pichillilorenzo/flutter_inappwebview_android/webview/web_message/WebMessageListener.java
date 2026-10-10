package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.ProxyConfig;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.types.PluginScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScriptInjectionTime;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes59.dex */
public class WebMessageListener implements Disposable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected static final String LOG_TAG = "WebMessageListener";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_web_message_listener_";
    public Set<String> allowedOriginRules;
    public WebMessageListenerChannelDelegate channelDelegate;

    /* JADX INFO: renamed from: id */
    public String f55844id;
    public String jsObjectName;
    public WebViewCompat.WebMessageListener listener;
    public JavaScriptReplyProxy replyProxy;
    public InAppWebViewInterface webView;

    public static WebMessageListener fromMap(InAppWebViewInterface inAppWebViewInterface, BinaryMessenger binaryMessenger, Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new WebMessageListener((String) map.get("id"), inAppWebViewInterface, binaryMessenger, (String) map.get("jsObjectName"), new HashSet((List) map.get("allowedOriginRules")));
    }

    public void assertOriginRulesValid() throws Exception {
        int i11 = 0;
        for (String str : this.allowedOriginRules) {
            if (str == null) {
                throw new Exception("allowedOriginRules[" + i11 + "] is null");
            }
            if (str.isEmpty()) {
                throw new Exception("allowedOriginRules[" + i11 + "] is empty");
            }
            if (!ProxyConfig.MATCH_ALL_SCHEMES.equals(str)) {
                Uri uri = Uri.parse(str);
                String scheme = uri.getScheme();
                String host = uri.getHost();
                String path = uri.getPath();
                int port = uri.getPort();
                if (scheme == null) {
                    throw new Exception("allowedOriginRules " + str + " is invalid");
                }
                if (("http".equals(scheme) || ProxyConfig.MATCH_HTTPS.equals(scheme)) && (host == null || host.isEmpty())) {
                    throw new Exception("allowedOriginRules " + str + " is invalid");
                }
                if (!"http".equals(scheme) && !ProxyConfig.MATCH_HTTPS.equals(scheme) && (host != null || port != -1)) {
                    throw new Exception("allowedOriginRules " + str + " is invalid");
                }
                if ((host == null || host.isEmpty()) && port != -1) {
                    throw new Exception("allowedOriginRules " + str + " is invalid");
                }
                if (!path.isEmpty()) {
                    throw new Exception("allowedOriginRules " + str + " is invalid");
                }
                if (host != null) {
                    int iIndexOf = host.indexOf(ProxyConfig.MATCH_ALL_SCHEMES);
                    if (iIndexOf != 0 || (iIndexOf == 0 && !host.startsWith("*."))) {
                        throw new Exception("allowedOriginRules " + str + " is invalid");
                    }
                    if (host.startsWith("[")) {
                        if (!host.endsWith("]")) {
                            throw new Exception("allowedOriginRules " + str + " is invalid");
                        }
                        if (!Util.isIPv6(host.substring(1, host.length() - 1))) {
                            throw new Exception("allowedOriginRules " + str + " is invalid");
                        }
                    }
                }
                i11++;
            }
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        WebMessageListenerChannelDelegate webMessageListenerChannelDelegate = this.channelDelegate;
        if (webMessageListenerChannelDelegate != null) {
            webMessageListenerChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.listener = null;
        this.replyProxy = null;
        this.webView = null;
    }

    public void initJsInstance() {
        if (this.webView != null) {
            String strReplaceAll = Util.replaceAll(this.jsObjectName, "'", "\\'");
            ArrayList arrayList = new ArrayList();
            for (String str : this.allowedOriginRules) {
                if (ProxyConfig.MATCH_ALL_SCHEMES.equals(str)) {
                    arrayList.add("'*'");
                } else {
                    Uri uri = Uri.parse(str);
                    String str2 = uri.getHost() != null ? "'" + Util.replaceAll(uri.getHost(), "'", "\\'") + "'" : "null";
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("{scheme: '");
                    sb2.append(uri.getScheme());
                    sb2.append("', host: ");
                    sb2.append(str2);
                    sb2.append(", port: ");
                    sb2.append(uri.getPort() != -1 ? Integer.valueOf(uri.getPort()) : "null");
                    sb2.append("}");
                    arrayList.add(sb2.toString());
                }
            }
            this.webView.getUserContentController().addPluginScript(new PluginScript("WebMessageListener-" + this.jsObjectName, "(function() {  var allowedOriginRules = [" + TextUtils.join(", ", arrayList) + "];  var isPageBlank = window.location.href === 'about:blank';  var scheme = !isPageBlank ? window.location.protocol.replace(':', '') : null;  var host = !isPageBlank ? window.location.hostname : null;  var port = !isPageBlank ? window.location.port : null;  if (window." + JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME + "._isOriginAllowed(allowedOriginRules, scheme, host, port)) {      window['" + strReplaceAll + "'] = new FlutterInAppWebViewWebMessageListener('" + strReplaceAll + "');  }})();", UserScriptInjectionTime.AT_DOCUMENT_START, null, false, null));
        }
    }

    public boolean isOriginAllowed(String str, String str2, int i11) {
        int port;
        String strNormalizeIPv6;
        Iterator<String> it = this.allowedOriginRules.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            String next = it.next();
            if (ProxyConfig.MATCH_ALL_SCHEMES.equals(next)) {
                return true;
            }
            if (str != null && !str.isEmpty() && (!str.isEmpty() || ((str2 != null && !str2.isEmpty()) || (i11 != 0 && i11 != -1)))) {
                Uri uri = Uri.parse(next);
                int i12 = 80;
                if (uri.getPort() == -1 || uri.getPort() == 0) {
                    port = ProxyConfig.MATCH_HTTPS.equals(uri.getScheme()) ? 443 : 80;
                } else {
                    port = uri.getPort();
                }
                if (i11 != 0 && i11 != -1) {
                    i12 = i11;
                } else if (ProxyConfig.MATCH_HTTPS.equals(str)) {
                    i12 = 443;
                }
                String strNormalizeIPv7 = null;
                if (uri.getHost() == null || !uri.getHost().startsWith("[")) {
                    strNormalizeIPv6 = null;
                } else {
                    try {
                        strNormalizeIPv6 = Util.normalizeIPv6(uri.getHost().substring(1, uri.getHost().length() - 1));
                    } catch (Exception unused) {
                        strNormalizeIPv6 = null;
                    }
                }
                try {
                    strNormalizeIPv7 = Util.normalizeIPv6(str2);
                } catch (Exception unused2) {
                }
                boolean zEquals = uri.getScheme().equals(str);
                boolean z11 = uri.getHost() == null || uri.getHost().isEmpty() || uri.getHost().equals(str2) || (uri.getHost().startsWith(ProxyConfig.MATCH_ALL_SCHEMES) && str2 != null && str2.contains(uri.getHost().split("\\*")[1])) || !(strNormalizeIPv7 == null || strNormalizeIPv6 == null || !strNormalizeIPv7.equals(strNormalizeIPv6));
                boolean z12 = port == i12;
                if (zEquals && z11 && z12) {
                    return true;
                }
            }
        }
    }

    public void postMessageForInAppWebView(WebMessageCompatExt webMessageCompatExt, MethodChannel.Result result) {
        Object data;
        if (this.replyProxy != null && WebViewFeature.isFeatureSupported(WebViewFeature.WEB_MESSAGE_LISTENER) && (data = webMessageCompatExt.getData()) != null) {
            if (WebViewFeature.isFeatureSupported(WebViewFeature.WEB_MESSAGE_ARRAY_BUFFER) && webMessageCompatExt.getType() == 1) {
                this.replyProxy.postMessage((byte[]) data);
            } else {
                this.replyProxy.postMessage(data.toString());
            }
        }
        result.success(Boolean.TRUE);
    }

    public WebMessageListener(String str, InAppWebViewInterface inAppWebViewInterface, BinaryMessenger binaryMessenger, String str2, Set<String> set) {
        this.f55844id = str;
        this.webView = inAppWebViewInterface;
        this.jsObjectName = str2;
        this.allowedOriginRules = set;
        this.channelDelegate = new WebMessageListenerChannelDelegate(this, new MethodChannel(binaryMessenger, METHOD_CHANNEL_NAME_PREFIX + this.f55844id + "_" + this.jsObjectName));
        if (this.webView instanceof InAppWebView) {
            this.listener = new WebViewCompat.WebMessageListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageListener.1
                @Override // androidx.webkit.WebViewCompat.WebMessageListener
                public void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z11, JavaScriptReplyProxy javaScriptReplyProxy) {
                    WebMessageListener webMessageListener = WebMessageListener.this;
                    webMessageListener.replyProxy = javaScriptReplyProxy;
                    WebMessageListenerChannelDelegate webMessageListenerChannelDelegate = webMessageListener.channelDelegate;
                    if (webMessageListenerChannelDelegate != null) {
                        webMessageListenerChannelDelegate.onPostMessage(WebMessageCompatExt.fromMapWebMessageCompat(webMessageCompat), uri.toString().equals("null") ? null : uri.toString(), z11);
                    }
                }
            };
        }
    }
}
