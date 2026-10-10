package io.flutter.plugins.webviewflutter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.flutter.embedding.android.FlutterView;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.platform.PlatformView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class WebViewHostApiImpl implements GeneratedAndroidWebView.WebViewHostApi {
    private static final String nullStringIdentifier = "<null-value>";
    private final BinaryMessenger binaryMessenger;
    private Context context;
    private final InstanceManager instanceManager;
    private final WebViewProxy webViewProxy;

    /* JADX INFO: loaded from: classes60.dex */
    @SuppressLint({"ViewConstructor"})
    public static class WebViewPlatformView extends WebView implements PlatformView {
        private WebViewFlutterApiImpl api;
        private WebChromeClientHostApiImpl.SecureWebChromeClient currentWebChromeClient;
        private WebViewClient currentWebViewClient;

        @NonNull
        private final AndroidSdkChecker sdkChecker;

        @VisibleForTesting
        public interface AndroidSdkChecker {
            @ChecksSdkIntAtLeast(parameter = 0)
            boolean sdkIsAtLeast(int i11);
        }

        public static class SafeCallback implements ActionMode.Callback {
            private final ActionMode.Callback delegate;

            @Override // android.view.ActionMode.Callback
            public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                return this.delegate.onActionItemClicked(actionMode, menuItem);
            }

            @Override // android.view.ActionMode.Callback
            public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                try {
                    return this.delegate.onCreateActionMode(actionMode, menu);
                } catch (Resources.NotFoundException unused) {
                    return false;
                }
            }

            @Override // android.view.ActionMode.Callback
            public void onDestroyActionMode(ActionMode actionMode) {
                this.delegate.onDestroyActionMode(actionMode);
            }

            @Override // android.view.ActionMode.Callback
            public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                return this.delegate.onPrepareActionMode(actionMode, menu);
            }

            public SafeCallback(ActionMode.Callback callback) {
                this.delegate = callback;
            }
        }

        public WebViewPlatformView(@NonNull Context context, @NonNull BinaryMessenger binaryMessenger, @NonNull InstanceManager instanceManager) {
            this(context, binaryMessenger, instanceManager, new AndroidSdkChecker() { // from class: io.flutter.plugins.webviewflutter.b5
                @Override // io.flutter.plugins.webviewflutter.WebViewHostApiImpl.WebViewPlatformView.AndroidSdkChecker
                public final boolean sdkIsAtLeast(int i11) {
                    return WebViewHostApiImpl.WebViewPlatformView.m87789b(i11);
                }
            });
        }

        private FlutterView tryFindFlutterView() {
            ViewParent parent = this;
            while (parent.getParent() != null) {
                parent = parent.getParent();
                if (parent instanceof FlutterView) {
                    return (FlutterView) parent;
                }
            }
            return null;
        }

        @Override // android.view.View
        public ActionMode startActionMode(ActionMode.Callback callback) {
            SafeCallback safeCallback;
            if (callback != null) {
                try {
                    safeCallback = new SafeCallback(callback);
                } catch (Resources.NotFoundException unused) {
                    return null;
                }
            } else {
                safeCallback = null;
            }
            return super.startActionMode(safeCallback);
        }

        @VisibleForTesting
        public WebViewPlatformView(@NonNull Context context, @NonNull BinaryMessenger binaryMessenger, @NonNull InstanceManager instanceManager, @NonNull AndroidSdkChecker androidSdkChecker) {
            super(context);
            this.currentWebViewClient = new WebViewClient();
            this.currentWebChromeClient = new WebChromeClientHostApiImpl.SecureWebChromeClient();
            this.api = new WebViewFlutterApiImpl(binaryMessenger, instanceManager);
            this.sdkChecker = androidSdkChecker;
            setWebViewClient(this.currentWebViewClient);
            setWebChromeClient(this.currentWebChromeClient);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ boolean m87789b(int i11) {
            return Build.VERSION.SDK_INT >= i11;
        }

        @Override // android.webkit.WebView
        @Nullable
        public WebChromeClient getWebChromeClient() {
            return this.currentWebChromeClient;
        }

        @VisibleForTesting
        public void setApi(WebViewFlutterApiImpl webViewFlutterApiImpl) {
            this.api = webViewFlutterApiImpl;
        }

        @Override // android.view.View
        public ActionMode startActionMode(ActionMode.Callback callback, int i11) {
            SafeCallback safeCallback;
            if (callback != null) {
                try {
                    safeCallback = new SafeCallback(callback);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                safeCallback = null;
            }
            return super.startActionMode(safeCallback, i11);
        }

        @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            FlutterView flutterViewTryFindFlutterView;
            super.onAttachedToWindow();
            if (this.sdkChecker.sdkIsAtLeast(26) && (flutterViewTryFindFlutterView = tryFindFlutterView()) != null) {
                flutterViewTryFindFlutterView.setImportantForAutofill(1);
            }
        }

        @Override // android.webkit.WebView, android.view.View
        public void onScrollChanged(int i11, int i12, int i13, int i14) {
            super.onScrollChanged(i11, i12, i13, i14);
            this.api.onScrollChanged(this, Long.valueOf(i11), Long.valueOf(i12), Long.valueOf(i13), Long.valueOf(i14), new GeneratedAndroidWebView.WebViewFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.c5
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewFlutterApi.Reply
                public final void reply(Object obj) {
                    WebViewHostApiImpl.WebViewPlatformView.m87788a((Void) obj);
                }
            });
        }

        @Override // android.webkit.WebView
        public void setWebChromeClient(@Nullable WebChromeClient webChromeClient) {
            super.setWebChromeClient(webChromeClient);
            if (webChromeClient instanceof WebChromeClientHostApiImpl.SecureWebChromeClient) {
                WebChromeClientHostApiImpl.SecureWebChromeClient secureWebChromeClient = (WebChromeClientHostApiImpl.SecureWebChromeClient) webChromeClient;
                this.currentWebChromeClient = secureWebChromeClient;
                secureWebChromeClient.setWebViewClient(this.currentWebViewClient);
                return;
            }
            throw new AssertionError("Client must be a SecureWebChromeClient.");
        }

        @Override // android.webkit.WebView
        public void setWebViewClient(@NonNull WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            this.currentWebViewClient = webViewClient;
            this.currentWebChromeClient.setWebViewClient(webViewClient);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m87788a(Void r11) {
        }

        @Override // io.flutter.plugin.platform.PlatformView
        public void dispose() {
        }

        @Override // io.flutter.plugin.platform.PlatformView
        @Nullable
        public View getView() {
            return this;
        }
    }

    public static class WebViewProxy {
        @NonNull
        public WebViewPlatformView createWebView(@NonNull Context context, @NonNull BinaryMessenger binaryMessenger, @NonNull InstanceManager instanceManager) {
            return new WebViewPlatformView(context, binaryMessenger, instanceManager);
        }

        public void setWebContentsDebuggingEnabled(boolean z11) {
            WebView.setWebContentsDebuggingEnabled(z11);
        }
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    @SuppressLint({"JavascriptInterface"})
    public void addJavaScriptChannel(@NonNull Long l11, @NonNull Long l12) {
        WebView webView = (WebView) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webView);
        JavaScriptChannel javaScriptChannel = (JavaScriptChannel) this.instanceManager.getInstance(l12.longValue());
        Objects.requireNonNull(javaScriptChannel);
        webView.addJavascriptInterface(javaScriptChannel, javaScriptChannel.javaScriptChannelName);
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    @NonNull
    public Boolean canGoBack(@NonNull Long l11) {
        WebView webView = (WebView) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webView);
        return Boolean.valueOf(webView.canGoBack());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    @NonNull
    public Boolean canGoForward(@NonNull Long l11) {
        WebView webView = (WebView) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webView);
        return Boolean.valueOf(webView.canGoForward());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void clearCache(@NonNull Long l11, @NonNull Boolean bool) {
        WebView webView = (WebView) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webView);
        webView.clearCache(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void create(@NonNull Long l11) {
        DisplayListenerProxy displayListenerProxy = new DisplayListenerProxy();
        DisplayManager displayManager = (DisplayManager) this.context.getSystemService("display");
        displayListenerProxy.onPreWebViewInitialization(displayManager);
        WebViewPlatformView webViewPlatformViewCreateWebView = this.webViewProxy.createWebView(this.context, this.binaryMessenger, this.instanceManager);
        displayListenerProxy.onPostWebViewInitialization(displayManager);
        this.instanceManager.addDartCreatedInstance(webViewPlatformViewCreateWebView, l11.longValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void evaluateJavascript(@NonNull Long l11, @NonNull String str, @NonNull final GeneratedAndroidWebView.Result<String> result) {
        WebView webView = (WebView) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webView);
        Objects.requireNonNull(result);
        webView.evaluateJavascript(str, new ValueCallback() { // from class: io.flutter.plugins.webviewflutter.a5
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                result.success((String) obj);
            }
        });
    }

    @NonNull
    public InstanceManager getInstanceManager() {
        return this.instanceManager;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    @NonNull
    public GeneratedAndroidWebView.WebViewPoint getScrollPosition(@NonNull Long l11) {
        WebView webView = (WebView) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webView);
        return new GeneratedAndroidWebView.WebViewPoint.Builder().setX(Long.valueOf(webView.getScrollX())).setY(Long.valueOf(webView.getScrollY())).build();
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    @NonNull
    public Long getScrollX(@NonNull Long l11) {
        WebView webView = (WebView) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webView);
        return Long.valueOf(webView.getScrollX());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    @NonNull
    public Long getScrollY(@NonNull Long l11) {
        WebView webView = (WebView) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webView);
        return Long.valueOf(webView.getScrollY());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    @Nullable
    public String getTitle(@NonNull Long l11) {
        WebView webView = (WebView) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webView);
        return webView.getTitle();
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    @Nullable
    public String getUrl(@NonNull Long l11) {
        WebView webView = (WebView) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webView);
        return webView.getUrl();
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void goBack(@NonNull Long l11) {
        WebView webView = (WebView) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webView);
        webView.goBack();
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void goForward(@NonNull Long l11) {
        WebView webView = (WebView) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webView);
        webView.goForward();
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void loadData(@NonNull Long l11, @NonNull String str, @Nullable String str2, @Nullable String str3) {
        WebView webView = (WebView) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webView);
        webView.loadData(str, str2, str3);
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void loadDataWithBaseUrl(@NonNull Long l11, @Nullable String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        WebView webView = (WebView) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webView);
        webView.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void loadUrl(@NonNull Long l11, @NonNull String str, @NonNull Map<String, String> map) {
        WebView webView = (WebView) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webView);
        webView.loadUrl(str, map);
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void postUrl(@NonNull Long l11, @NonNull String str, @NonNull byte[] bArr) {
        WebView webView = (WebView) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webView);
        webView.postUrl(str, bArr);
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void reload(@NonNull Long l11) {
        WebView webView = (WebView) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webView);
        webView.reload();
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void removeJavaScriptChannel(@NonNull Long l11, @NonNull Long l12) {
        WebView webView = (WebView) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webView);
        JavaScriptChannel javaScriptChannel = (JavaScriptChannel) this.instanceManager.getInstance(l12.longValue());
        Objects.requireNonNull(javaScriptChannel);
        webView.removeJavascriptInterface(javaScriptChannel.javaScriptChannelName);
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void scrollBy(@NonNull Long l11, @NonNull Long l12, @NonNull Long l13) {
        WebView webView = (WebView) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webView);
        webView.scrollBy(l12.intValue(), l13.intValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void scrollTo(@NonNull Long l11, @NonNull Long l12, @NonNull Long l13) {
        WebView webView = (WebView) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webView);
        webView.scrollTo(l12.intValue(), l13.intValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void setBackgroundColor(@NonNull Long l11, @NonNull Long l12) {
        WebView webView = (WebView) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webView);
        webView.setBackgroundColor(l12.intValue());
    }

    public void setContext(@Nullable Context context) {
        this.context = context;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void setDownloadListener(@NonNull Long l11, @Nullable Long l12) {
        WebView webView = (WebView) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webView);
        InstanceManager instanceManager = this.instanceManager;
        Objects.requireNonNull(l12);
        webView.setDownloadListener((DownloadListener) instanceManager.getInstance(l12.longValue()));
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void setWebChromeClient(@NonNull Long l11, @Nullable Long l12) {
        WebView webView = (WebView) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webView);
        InstanceManager instanceManager = this.instanceManager;
        Objects.requireNonNull(l12);
        webView.setWebChromeClient((WebChromeClient) instanceManager.getInstance(l12.longValue()));
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void setWebContentsDebuggingEnabled(@NonNull Boolean bool) {
        this.webViewProxy.setWebContentsDebuggingEnabled(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void setWebViewClient(@NonNull Long l11, @NonNull Long l12) {
        WebView webView = (WebView) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webView);
        webView.setWebViewClient((WebViewClient) this.instanceManager.getInstance(l12.longValue()));
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public String takeScreenShot(Long l11) {
        String str = "";
        try {
            Bitmap bitmapCaptureFromWebView = captureFromWebView((WebView) this.instanceManager.getInstance(l11.longValue()));
            File file = new File(this.context.getCacheDir().getPath() + "/dapp_shots");
            if (!file.isDirectory()) {
                file.mkdir();
            }
            str = this.context.getCacheDir().getPath() + "/dapp_shots/" + System.currentTimeMillis() + ".jpg";
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            bitmapCaptureFromWebView.compress(Bitmap.CompressFormat.JPEG, 70, fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e11) {
            Log.e("takeScreenShot", e11.getMessage());
        }
        return str != null ? str : nullStringIdentifier;
    }

    public WebViewHostApiImpl(@NonNull InstanceManager instanceManager, @NonNull BinaryMessenger binaryMessenger, @NonNull WebViewProxy webViewProxy, @Nullable Context context) {
        this.instanceManager = instanceManager;
        this.binaryMessenger = binaryMessenger;
        this.webViewProxy = webViewProxy;
        this.context = context;
    }

    public static Bitmap captureFromWebView(WebView webView) {
        Picture pictureCapturePicture = webView.capturePicture();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(pictureCapturePicture.getWidth(), pictureCapturePicture.getHeight(), Bitmap.Config.ARGB_8888);
        pictureCapturePicture.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }
}
