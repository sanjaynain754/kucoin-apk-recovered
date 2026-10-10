package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public class WebMessageChannelChannelDelegate extends ChannelDelegateImpl {
    private WebMessageChannel webMessageChannel;

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.getClass();
        switch (str) {
            case "close":
                WebMessageChannel webMessageChannel = this.webMessageChannel;
                if (webMessageChannel != null && (webMessageChannel.webView instanceof InAppWebView)) {
                    this.webMessageChannel.closeForInAppWebView((Integer) methodCall.argument("index"), result);
                    break;
                } else {
                    result.success(Boolean.FALSE);
                    break;
                }
                break;
            case "setWebMessageCallback":
                WebMessageChannel webMessageChannel2 = this.webMessageChannel;
                if (webMessageChannel2 != null && (webMessageChannel2.webView instanceof InAppWebView)) {
                    this.webMessageChannel.setWebMessageCallbackForInAppWebView(((Integer) methodCall.argument("index")).intValue(), result);
                    break;
                } else {
                    result.success(Boolean.FALSE);
                    break;
                }
                break;
            case "postMessage":
                WebMessageChannel webMessageChannel3 = this.webMessageChannel;
                if (webMessageChannel3 != null && (webMessageChannel3.webView instanceof InAppWebView)) {
                    this.webMessageChannel.postMessageForInAppWebView((Integer) methodCall.argument("index"), WebMessageCompatExt.fromMap((Map) methodCall.argument("message")), result);
                    break;
                } else {
                    result.success(Boolean.FALSE);
                    break;
                }
                break;
            default:
                result.notImplemented();
                break;
        }
    }

    public WebMessageChannelChannelDelegate(WebMessageChannel webMessageChannel, MethodChannel methodChannel) {
        super(methodChannel);
        this.webMessageChannel = webMessageChannel;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.webMessageChannel = null;
    }

    public void onMessage(int i11, WebMessageCompatExt webMessageCompatExt) {
        Map<String, Object> map;
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("index", Integer.valueOf(i11));
        if (webMessageCompatExt != null) {
            map = webMessageCompatExt.toMap();
        } else {
            map = null;
        }
        map2.put("message", map);
        channel.invokeMethod("onMessage", map2);
    }
}
