package com.pichillilorenzo.flutter_inappwebview_android.webview;

import android.os.Handler;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobController;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobSettings;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class JavaScriptBridgeInterface {
    private static final String LOG_TAG = "JSBridgeInterface";
    private InAppWebView inAppWebView;

    public void dispose() {
        this.inAppWebView = null;
    }

    @JavascriptInterface
    public void _callHandler(final String str, final String str2, final String str3) {
        if (this.inAppWebView == null) {
            return;
        }
        new Handler(this.inAppWebView.getWebViewLooper()).post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.JavaScriptBridgeInterface.2
            @Override // java.lang.Runnable
            public void run() {
                String string;
                if (JavaScriptBridgeInterface.this.inAppWebView != null) {
                    if (str.equals("onPrintRequest")) {
                        PrintJobSettings printJobSettings = new PrintJobSettings();
                        printJobSettings.handledByClient = Boolean.TRUE;
                        final String strPrintCurrentPage = JavaScriptBridgeInterface.this.inAppWebView.printCurrentPage(printJobSettings);
                        if (JavaScriptBridgeInterface.this.inAppWebView != null && JavaScriptBridgeInterface.this.inAppWebView.channelDelegate != null) {
                            JavaScriptBridgeInterface.this.inAppWebView.channelDelegate.onPrintRequest(JavaScriptBridgeInterface.this.inAppWebView.getUrl(), strPrintCurrentPage, new WebViewChannelDelegate.PrintRequestCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.JavaScriptBridgeInterface.2.1
                                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                                public void defaultBehaviour(Boolean bool) {
                                    PrintJobController printJobController;
                                    if (JavaScriptBridgeInterface.this.inAppWebView == null || JavaScriptBridgeInterface.this.inAppWebView.plugin == null || JavaScriptBridgeInterface.this.inAppWebView.plugin.printJobManager == null || (printJobController = JavaScriptBridgeInterface.this.inAppWebView.plugin.printJobManager.jobs.get(strPrintCurrentPage)) == null) {
                                        return;
                                    }
                                    printJobController.disposeNoCancel();
                                }

                                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, io.flutter.plugin.common.MethodChannel.Result
                                public void error(String str4, String str5, Object obj) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(str4);
                                    sb2.append(", ");
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    sb2.append(str5);
                                    Log.e(JavaScriptBridgeInterface.LOG_TAG, sb2.toString());
                                    defaultBehaviour((Boolean) null);
                                }

                                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                                public boolean nonNullSuccess(Boolean bool) {
                                    return !bool.booleanValue();
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (str.equals("callAsyncJavaScript")) {
                        try {
                            JSONObject jSONObject = new JSONArray(str3).getJSONObject(0);
                            String string2 = jSONObject.getString("resultUuid");
                            ValueCallback<String> valueCallback = JavaScriptBridgeInterface.this.inAppWebView.callAsyncJavaScriptCallbacks.get(string2);
                            if (valueCallback != null) {
                                valueCallback.onReceiveValue(jSONObject.toString());
                                JavaScriptBridgeInterface.this.inAppWebView.callAsyncJavaScriptCallbacks.remove(string2);
                                return;
                            }
                            return;
                        } catch (JSONException e11) {
                            Log.e(JavaScriptBridgeInterface.LOG_TAG, "", e11);
                            return;
                        }
                    }
                    if (str.equals("evaluateJavaScriptWithContentWorld")) {
                        try {
                            JSONObject jSONObject2 = new JSONArray(str3).getJSONObject(0);
                            String string3 = jSONObject2.getString("resultUuid");
                            ValueCallback<String> valueCallback2 = JavaScriptBridgeInterface.this.inAppWebView.evaluateJavaScriptContentWorldCallbacks.get(string3);
                            if (valueCallback2 != null) {
                                if (jSONObject2.has("value")) {
                                    string = jSONObject2.get("value").toString();
                                } else {
                                    string = "null";
                                }
                                valueCallback2.onReceiveValue(string);
                                JavaScriptBridgeInterface.this.inAppWebView.evaluateJavaScriptContentWorldCallbacks.remove(string3);
                                return;
                            }
                            return;
                        } catch (JSONException e12) {
                            Log.e(JavaScriptBridgeInterface.LOG_TAG, "", e12);
                            return;
                        }
                    }
                    if (JavaScriptBridgeInterface.this.inAppWebView.channelDelegate != null) {
                        JavaScriptBridgeInterface.this.inAppWebView.channelDelegate.onCallJsHandler(str, str3, new WebViewChannelDelegate.CallJsHandlerCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.JavaScriptBridgeInterface.2.2
                            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                            public void defaultBehaviour(Object obj) {
                                if (JavaScriptBridgeInterface.this.inAppWebView == null) {
                                    return;
                                }
                                JavaScriptBridgeInterface.this.inAppWebView.evaluateJavascript("if (window.flutter_inappwebview[" + str2 + "] != null) { window." + JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME + "[" + str2 + "].resolve(" + obj + "); delete window." + JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME + "[" + str2 + "]; }", null);
                            }

                            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, io.flutter.plugin.common.MethodChannel.Result
                            public void error(String str4, String str5, Object obj) {
                                String str6;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(str4);
                                if (str5 != null) {
                                    str6 = ", " + str5;
                                } else {
                                    str6 = "";
                                }
                                sb2.append(str6);
                                String string4 = sb2.toString();
                                Log.e(JavaScriptBridgeInterface.LOG_TAG, string4);
                                if (JavaScriptBridgeInterface.this.inAppWebView == null) {
                                    return;
                                }
                                JavaScriptBridgeInterface.this.inAppWebView.evaluateJavascript("if (window.flutter_inappwebview[" + str2 + "] != null) { window." + JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME + "[" + str2 + "].reject(new Error(" + JSONObject.quote(string4) + ")); delete window." + JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME + "[" + str2 + "]; }", null);
                            }
                        });
                    }
                }
            }
        });
    }

    @JavascriptInterface
    public void _hideContextMenu() {
        if (this.inAppWebView == null) {
            return;
        }
        new Handler(this.inAppWebView.getWebViewLooper()).post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.JavaScriptBridgeInterface.1
            @Override // java.lang.Runnable
            public void run() {
                if (JavaScriptBridgeInterface.this.inAppWebView == null || JavaScriptBridgeInterface.this.inAppWebView.floatingContextMenu == null) {
                    return;
                }
                JavaScriptBridgeInterface.this.inAppWebView.hideContextMenu();
            }
        });
    }

    public JavaScriptBridgeInterface(InAppWebView inAppWebView) {
        this.inAppWebView = inAppWebView;
    }
}
