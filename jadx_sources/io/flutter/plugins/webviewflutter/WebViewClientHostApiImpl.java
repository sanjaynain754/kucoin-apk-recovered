package io.flutter.plugins.webviewflutter;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.webkit.HttpAuthHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.webkit.WebResourceErrorCompat;
import androidx.webkit.WebViewClientCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class WebViewClientHostApiImpl implements GeneratedAndroidWebView.WebViewClientHostApi {
    private final WebViewClientFlutterApiImpl flutterApi;
    private final InstanceManager instanceManager;
    private final WebViewClientCreator webViewClientCreator;

    /* JADX INFO: loaded from: classes60.dex */
    public static class WebViewClientCompatImpl extends WebViewClientCompat {
        private final WebViewClientFlutterApiImpl flutterApi;
        private boolean returnValueForShouldOverrideUrlLoading = false;

        @Override // androidx.webkit.WebViewClientCompat
        @RequiresApi(api = 21)
        @SuppressLint({"RequiresFeature"})
        public void onReceivedError(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceErrorCompat webResourceErrorCompat) {
            this.flutterApi.onReceivedRequestError(this, webView, webResourceRequest, webResourceErrorCompat, new GeneratedAndroidWebView.WebViewClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.n4
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply
                public final void reply(Object obj) {
                    WebViewClientHostApiImpl.WebViewClientCompatImpl.m87775i((Void) obj);
                }
            });
        }

        @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
        @TargetApi(21)
        public boolean shouldOverrideUrlLoading(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest) {
            this.flutterApi.requestLoading(this, webView, webResourceRequest, new GeneratedAndroidWebView.WebViewClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.k4
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply
                public final void reply(Object obj) {
                    WebViewClientHostApiImpl.WebViewClientCompatImpl.m87770d((Void) obj);
                }
            });
            return webResourceRequest.isForMainFrame() && this.returnValueForShouldOverrideUrlLoading;
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(@NonNull WebView webView, @NonNull String str, boolean z11) {
            this.flutterApi.doUpdateVisitedHistory(this, webView, str, z11, new GeneratedAndroidWebView.WebViewClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.i4
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply
                public final void reply(Object obj) {
                    WebViewClientHostApiImpl.WebViewClientCompatImpl.m87774h((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@NonNull WebView webView, @NonNull String str) {
            this.flutterApi.onPageFinished(this, webView, str, new GeneratedAndroidWebView.WebViewClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.l4
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply
                public final void reply(Object obj) {
                    WebViewClientHostApiImpl.WebViewClientCompatImpl.m87773g((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(@NonNull WebView webView, @NonNull String str, @NonNull Bitmap bitmap) {
            this.flutterApi.onPageStarted(this, webView, str, new GeneratedAndroidWebView.WebViewClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.j4
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply
                public final void reply(Object obj) {
                    WebViewClientHostApiImpl.WebViewClientCompatImpl.m87767a((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(@NonNull WebView webView, int i11, @NonNull String str, @NonNull String str2) {
            this.flutterApi.onReceivedError(this, webView, Long.valueOf(i11), str, str2, new GeneratedAndroidWebView.WebViewClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.h4
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply
                public final void reply(Object obj) {
                    WebViewClientHostApiImpl.WebViewClientCompatImpl.m87769c((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(@NonNull WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            this.flutterApi.onReceivedHttpAuthRequest(this, webView, httpAuthHandler, str, str2, new GeneratedAndroidWebView.WebViewClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.m4
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply
                public final void reply(Object obj) {
                    WebViewClientHostApiImpl.WebViewClientCompatImpl.m87771e((Void) obj);
                }
            });
        }

        @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
        @RequiresApi(api = 21)
        public void onReceivedHttpError(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceResponse webResourceResponse) {
            this.flutterApi.onReceivedHttpError(this, webView, webResourceRequest, webResourceResponse, new GeneratedAndroidWebView.WebViewClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.g4
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply
                public final void reply(Object obj) {
                    WebViewClientHostApiImpl.WebViewClientCompatImpl.m87768b((Void) obj);
                }
            });
        }

        public void setReturnValueForShouldOverrideUrlLoading(boolean z11) {
            this.returnValueForShouldOverrideUrlLoading = z11;
        }

        public WebViewClientCompatImpl(@NonNull WebViewClientFlutterApiImpl webViewClientFlutterApiImpl) {
            this.flutterApi = webViewClientFlutterApiImpl;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@NonNull WebView webView, @NonNull String str) {
            this.flutterApi.urlLoading(this, webView, str, new GeneratedAndroidWebView.WebViewClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.f4
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply
                public final void reply(Object obj) {
                    WebViewClientHostApiImpl.WebViewClientCompatImpl.m87772f((Void) obj);
                }
            });
            return this.returnValueForShouldOverrideUrlLoading;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m87767a(Void r11) {
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m87768b(Void r11) {
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m87769c(Void r11) {
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m87770d(Void r11) {
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m87771e(Void r11) {
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m87772f(Void r11) {
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ void m87773g(Void r11) {
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ void m87774h(Void r11) {
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ void m87775i(Void r11) {
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(@NonNull WebView webView, @NonNull KeyEvent keyEvent) {
        }
    }

    public static class WebViewClientCreator {
        @NonNull
        public WebViewClient createWebViewClient(@NonNull WebViewClientFlutterApiImpl webViewClientFlutterApiImpl) {
            return new WebViewClientImpl(webViewClientFlutterApiImpl);
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
    @RequiresApi(24)
    public static class WebViewClientImpl extends WebViewClient {
        private final WebViewClientFlutterApiImpl flutterApi;
        private boolean returnValueForShouldOverrideUrlLoading = false;

        @Override // android.webkit.WebViewClient
        public void onReceivedError(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceError webResourceError) {
            this.flutterApi.onReceivedRequestError(this, webView, webResourceRequest, webResourceError, new GeneratedAndroidWebView.WebViewClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.o4
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply
                public final void reply(Object obj) {
                    WebViewClientHostApiImpl.WebViewClientImpl.m87784i((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest) {
            this.flutterApi.requestLoading(this, webView, webResourceRequest, new GeneratedAndroidWebView.WebViewClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.p4
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply
                public final void reply(Object obj) {
                    WebViewClientHostApiImpl.WebViewClientImpl.m87780e((Void) obj);
                }
            });
            return webResourceRequest.isForMainFrame() && this.returnValueForShouldOverrideUrlLoading;
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(@NonNull WebView webView, @NonNull String str, boolean z11) {
            this.flutterApi.doUpdateVisitedHistory(this, webView, str, z11, new GeneratedAndroidWebView.WebViewClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.w4
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply
                public final void reply(Object obj) {
                    WebViewClientHostApiImpl.WebViewClientImpl.m87781f((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@NonNull WebView webView, @NonNull String str) {
            this.flutterApi.onPageFinished(this, webView, str, new GeneratedAndroidWebView.WebViewClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.q4
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply
                public final void reply(Object obj) {
                    WebViewClientHostApiImpl.WebViewClientImpl.m87778c((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(@NonNull WebView webView, @NonNull String str, @NonNull Bitmap bitmap) {
            this.flutterApi.onPageStarted(this, webView, str, new GeneratedAndroidWebView.WebViewClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.t4
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply
                public final void reply(Object obj) {
                    WebViewClientHostApiImpl.WebViewClientImpl.m87783h((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(@NonNull WebView webView, int i11, @NonNull String str, @NonNull String str2) {
            this.flutterApi.onReceivedError(this, webView, Long.valueOf(i11), str, str2, new GeneratedAndroidWebView.WebViewClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.u4
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply
                public final void reply(Object obj) {
                    WebViewClientHostApiImpl.WebViewClientImpl.m87782g((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(@NonNull WebView webView, @NonNull HttpAuthHandler httpAuthHandler, @NonNull String str, @NonNull String str2) {
            this.flutterApi.onReceivedHttpAuthRequest(this, webView, httpAuthHandler, str, str2, new GeneratedAndroidWebView.WebViewClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.v4
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply
                public final void reply(Object obj) {
                    WebViewClientHostApiImpl.WebViewClientImpl.m87776a((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceResponse webResourceResponse) {
            this.flutterApi.onReceivedHttpError(this, webView, webResourceRequest, webResourceResponse, new GeneratedAndroidWebView.WebViewClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.s4
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply
                public final void reply(Object obj) {
                    WebViewClientHostApiImpl.WebViewClientImpl.m87779d((Void) obj);
                }
            });
        }

        public void setReturnValueForShouldOverrideUrlLoading(boolean z11) {
            this.returnValueForShouldOverrideUrlLoading = z11;
        }

        public WebViewClientImpl(@NonNull WebViewClientFlutterApiImpl webViewClientFlutterApiImpl) {
            this.flutterApi = webViewClientFlutterApiImpl;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@NonNull WebView webView, @NonNull String str) {
            this.flutterApi.urlLoading(this, webView, str, new GeneratedAndroidWebView.WebViewClientFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.r4
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply
                public final void reply(Object obj) {
                    WebViewClientHostApiImpl.WebViewClientImpl.m87777b((Void) obj);
                }
            });
            return this.returnValueForShouldOverrideUrlLoading;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m87776a(Void r11) {
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m87777b(Void r11) {
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m87778c(Void r11) {
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m87779d(Void r11) {
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m87780e(Void r11) {
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m87781f(Void r11) {
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ void m87782g(Void r11) {
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ void m87783h(Void r11) {
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ void m87784i(Void r11) {
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(@NonNull WebView webView, @NonNull KeyEvent keyEvent) {
        }
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientHostApi
    public void create(@NonNull Long l11) {
        this.instanceManager.addDartCreatedInstance(this.webViewClientCreator.createWebViewClient(this.flutterApi), l11.longValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientHostApi
    public void setSynchronousReturnValueForShouldOverrideUrlLoading(@NonNull Long l11, @NonNull Boolean bool) {
        WebViewClient webViewClient = (WebViewClient) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webViewClient);
        if (webViewClient instanceof WebViewClientCompatImpl) {
            ((WebViewClientCompatImpl) webViewClient).setReturnValueForShouldOverrideUrlLoading(bool.booleanValue());
        } else {
            if (!(webViewClient instanceof WebViewClientImpl)) {
                throw new IllegalStateException("This WebViewClient doesn't support setting the returnValueForShouldOverrideUrlLoading.");
            }
            ((WebViewClientImpl) webViewClient).setReturnValueForShouldOverrideUrlLoading(bool.booleanValue());
        }
    }

    public WebViewClientHostApiImpl(@NonNull InstanceManager instanceManager, @NonNull WebViewClientCreator webViewClientCreator, @NonNull WebViewClientFlutterApiImpl webViewClientFlutterApiImpl) {
        this.instanceManager = instanceManager;
        this.webViewClientCreator = webViewClientCreator;
        this.flutterApi = webViewClientFlutterApiImpl;
    }
}
