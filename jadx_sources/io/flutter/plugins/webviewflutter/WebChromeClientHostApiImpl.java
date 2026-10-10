package io.flutter.plugins.webviewflutter;

import android.content.Context;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class WebChromeClientHostApiImpl implements GeneratedAndroidWebView.WebChromeClientHostApi {
    private Context context;
    private final WebChromeClientFlutterApiImpl flutterApi;
    private final InstanceManager instanceManager;
    private final WebChromeClientCreator webChromeClientCreator;

    /* JADX INFO: loaded from: classes60.dex */
    public static class SecureWebChromeClient extends WebChromeClient {

        @Nullable
        WebViewClient webViewClient;

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(@NonNull WebView webView, boolean z11, boolean z12, @NonNull Message message) {
            return onCreateWindow(webView, message, new WebView(webView.getContext()));
        }

        @VisibleForTesting
        public boolean onCreateWindow(@NonNull final WebView webView, @NonNull Message message, @Nullable WebView webView2) {
            if (this.webViewClient == null) {
                return false;
            }
            WebViewClient webViewClient = new WebViewClient() { // from class: io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl.SecureWebChromeClient.1
                @Override // android.webkit.WebViewClient
                @RequiresApi(api = 24)
                public boolean shouldOverrideUrlLoading(@NonNull WebView webView3, @NonNull WebResourceRequest webResourceRequest) {
                    if (SecureWebChromeClient.this.webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest)) {
                        return true;
                    }
                    webView.loadUrl(webResourceRequest.getUrl().toString());
                    return true;
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView3, String str) {
                    if (SecureWebChromeClient.this.webViewClient.shouldOverrideUrlLoading(webView, str)) {
                        return true;
                    }
                    webView.loadUrl(str);
                    return true;
                }
            };
            if (webView2 == null) {
                webView2 = new WebView(webView.getContext());
            }
            webView2.setWebViewClient(webViewClient);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }

        public void setWebViewClient(@NonNull WebViewClient webViewClient) {
            this.webViewClient = webViewClient;
        }
    }

    public static class WebChromeClientCreator {
        @NonNull
        public WebChromeClientImpl createWebChromeClient(@NonNull WebChromeClientFlutterApiImpl webChromeClientFlutterApiImpl) {
            return new WebChromeClientImpl(webChromeClientFlutterApiImpl);
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
    public static class WebChromeClientImpl extends SecureWebChromeClient {
        private final WebChromeClientFlutterApiImpl flutterApi;
        private boolean returnValueForOnShowFileChooser = false;
        private boolean returnValueForOnConsoleMessage = false;
        private boolean returnValueForOnJsAlert = false;
        private boolean returnValueForOnJsConfirm = false;
        private boolean returnValueForOnJsPrompt = false;

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ void m87753h(boolean z11, ValueCallback valueCallback, List list) {
            if (z11) {
                Uri[] uriArr = new Uri[list.size()];
                for (int i11 = 0; i11 < list.size(); i11++) {
                    uriArr[i11] = Uri.parse((String) list.get(i11));
                }
                valueCallback.onReceiveValue(uriArr);
            }
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ void m87754i(JsPromptResult jsPromptResult, String str) {
            if (str != null) {
                jsPromptResult.confirm(str);
            } else {
                jsPromptResult.cancel();
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            this.flutterApi.onConsoleMessage(this, consoleMessage, new GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.n3
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply
                public final void reply(Object obj) {
                    WebChromeClientHostApiImpl.WebChromeClientImpl.m87750e((Void) obj);
                }
            });
            return this.returnValueForOnConsoleMessage;
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsHidePrompt() {
            this.flutterApi.onGeolocationPermissionsHidePrompt(this, new GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.t3
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply
                public final void reply(Object obj) {
                    WebChromeClientHostApiImpl.WebChromeClientImpl.m87748c((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(@NonNull String str, @NonNull GeolocationPermissions.Callback callback) {
            this.flutterApi.onGeolocationPermissionsShowPrompt(this, str, callback, new GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.s3
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply
                public final void reply(Object obj) {
                    WebChromeClientHostApiImpl.WebChromeClientImpl.m87746a((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            this.flutterApi.onHideCustomView(this, new GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.u3
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply
                public final void reply(Object obj) {
                    WebChromeClientHostApiImpl.WebChromeClientImpl.m87747b((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
            if (!this.returnValueForOnJsAlert) {
                return false;
            }
            this.flutterApi.onJsAlert(this, str, str2, new GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.p3
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply
                public final void reply(Object obj) {
                    jsResult.confirm();
                }
            });
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
            if (!this.returnValueForOnJsConfirm) {
                return false;
            }
            this.flutterApi.onJsConfirm(this, str, str2, new GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.l3
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply
                public final void reply(Object obj) {
                    WebChromeClientHostApiImpl.WebChromeClientImpl.m87751f(jsResult, (Boolean) obj);
                }
            });
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, final JsPromptResult jsPromptResult) {
            if (!this.returnValueForOnJsPrompt) {
                return false;
            }
            this.flutterApi.onJsPrompt(this, str, str2, str3, new GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.o3
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply
                public final void reply(Object obj) {
                    WebChromeClientHostApiImpl.WebChromeClientImpl.m87754i(jsPromptResult, (String) obj);
                }
            });
            return true;
        }

        @Override // android.webkit.WebChromeClient
        @RequiresApi(api = 21)
        public void onPermissionRequest(@NonNull PermissionRequest permissionRequest) {
            this.flutterApi.onPermissionRequest(this, permissionRequest, new GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.m3
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply
                public final void reply(Object obj) {
                    WebChromeClientHostApiImpl.WebChromeClientImpl.m87756k((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(@NonNull WebView webView, int i11) {
            this.flutterApi.onProgressChanged(this, webView, Long.valueOf(i11), new GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.r3
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply
                public final void reply(Object obj) {
                    WebChromeClientHostApiImpl.WebChromeClientImpl.m87755j((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            this.flutterApi.onShowCustomView(this, view, customViewCallback, new GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.k3
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply
                public final void reply(Object obj) {
                    WebChromeClientHostApiImpl.WebChromeClientImpl.m87752g((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        @RequiresApi(api = 21)
        public boolean onShowFileChooser(@NonNull WebView webView, @NonNull final ValueCallback<Uri[]> valueCallback, @NonNull WebChromeClient.FileChooserParams fileChooserParams) {
            final boolean z11 = this.returnValueForOnShowFileChooser;
            this.flutterApi.onShowFileChooser(this, webView, fileChooserParams, new GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.q3
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply
                public final void reply(Object obj) {
                    WebChromeClientHostApiImpl.WebChromeClientImpl.m87753h(z11, valueCallback, (List) obj);
                }
            });
            return z11;
        }

        public void setReturnValueForOnConsoleMessage(boolean z11) {
            this.returnValueForOnConsoleMessage = z11;
        }

        public void setReturnValueForOnJsAlert(boolean z11) {
            this.returnValueForOnJsAlert = z11;
        }

        public void setReturnValueForOnJsConfirm(boolean z11) {
            this.returnValueForOnJsConfirm = z11;
        }

        public void setReturnValueForOnJsPrompt(boolean z11) {
            this.returnValueForOnJsPrompt = z11;
        }

        public void setReturnValueForOnShowFileChooser(boolean z11) {
            this.returnValueForOnShowFileChooser = z11;
        }

        public WebChromeClientImpl(@NonNull WebChromeClientFlutterApiImpl webChromeClientFlutterApiImpl) {
            this.flutterApi = webChromeClientFlutterApiImpl;
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m87751f(JsResult jsResult, Boolean bool) {
            if (bool.booleanValue()) {
                jsResult.confirm();
            } else {
                jsResult.cancel();
            }
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m87746a(Void r11) {
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m87747b(Void r11) {
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m87748c(Void r11) {
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m87750e(Void r11) {
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ void m87752g(Void r11) {
        }

        /* JADX INFO: renamed from: j */
        public static /* synthetic */ void m87755j(Void r11) {
        }

        /* JADX INFO: renamed from: k */
        public static /* synthetic */ void m87756k(Void r11) {
        }
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi
    public void create(@NonNull Long l11) {
        this.instanceManager.addDartCreatedInstance(this.webChromeClientCreator.createWebChromeClient(this.flutterApi), l11.longValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi
    public void setSynchronousReturnValueForOnConsoleMessage(@NonNull Long l11, @NonNull Boolean bool) {
        WebChromeClientImpl webChromeClientImpl = (WebChromeClientImpl) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webChromeClientImpl);
        webChromeClientImpl.setReturnValueForOnConsoleMessage(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi
    public void setSynchronousReturnValueForOnJsAlert(@NonNull Long l11, @NonNull Boolean bool) {
        WebChromeClientImpl webChromeClientImpl = (WebChromeClientImpl) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webChromeClientImpl);
        webChromeClientImpl.setReturnValueForOnJsAlert(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi
    public void setSynchronousReturnValueForOnJsConfirm(@NonNull Long l11, @NonNull Boolean bool) {
        WebChromeClientImpl webChromeClientImpl = (WebChromeClientImpl) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webChromeClientImpl);
        webChromeClientImpl.setReturnValueForOnJsConfirm(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi
    public void setSynchronousReturnValueForOnJsPrompt(@NonNull Long l11, @NonNull Boolean bool) {
        WebChromeClientImpl webChromeClientImpl = (WebChromeClientImpl) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webChromeClientImpl);
        webChromeClientImpl.setReturnValueForOnJsPrompt(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi
    public void setSynchronousReturnValueForOnShowFileChooser(@NonNull Long l11, @NonNull Boolean bool) {
        WebChromeClientImpl webChromeClientImpl = (WebChromeClientImpl) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webChromeClientImpl);
        webChromeClientImpl.setReturnValueForOnShowFileChooser(bool.booleanValue());
    }

    public WebChromeClientHostApiImpl(@NonNull InstanceManager instanceManager, @NonNull WebChromeClientCreator webChromeClientCreator, @NonNull WebChromeClientFlutterApiImpl webChromeClientFlutterApiImpl) {
        this.instanceManager = instanceManager;
        this.webChromeClientCreator = webChromeClientCreator;
        this.flutterApi = webChromeClientFlutterApiImpl;
    }
}
