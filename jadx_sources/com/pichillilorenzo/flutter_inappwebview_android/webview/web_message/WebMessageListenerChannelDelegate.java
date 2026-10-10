package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public class WebMessageListenerChannelDelegate extends ChannelDelegateImpl {
    private WebMessageListener webMessageListener;

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.getClass();
        if (!str.equals("postMessage")) {
            result.notImplemented();
            return;
        }
        WebMessageListener webMessageListener = this.webMessageListener;
        if (webMessageListener == null || !(webMessageListener.webView instanceof InAppWebView)) {
            result.success(Boolean.FALSE);
        } else {
            this.webMessageListener.postMessageForInAppWebView(WebMessageCompatExt.fromMap((Map) methodCall.argument("message")), result);
        }
    }

    public WebMessageListenerChannelDelegate(WebMessageListener webMessageListener, MethodChannel methodChannel) {
        super(methodChannel);
        this.webMessageListener = webMessageListener;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.webMessageListener = null;
    }

    public void onPostMessage(WebMessageCompatExt webMessageCompatExt, String str, boolean z11) {
        Map<String, Object> map;
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map2 = new HashMap();
        if (webMessageCompatExt != null) {
            map = webMessageCompatExt.toMap();
        } else {
            map = null;
        }
        map2.put("message", map);
        map2.put("sourceOrigin", str);
        map2.put("isMainFrame", Boolean.valueOf(z11));
        channel.invokeMethod("onPostMessage", map2);
    }
}
