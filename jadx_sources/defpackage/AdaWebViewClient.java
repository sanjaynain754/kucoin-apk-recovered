package defpackage;

import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.messaging.Constants;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.net.URISyntaxException;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TypeCastException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: AdaWebViewClient.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\u0018\u0000  2\u00020\u0001:\u00010B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0015\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\"\u0010\u0018R\u0016\u0010%\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*\"\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, m90084d2 = {"LAdaWebViewClient;", "Landroid/webkit/WebViewClient;", "Lkotlin/Function0;", "", "webViewLoadingErrorCallback", "", "timeoutMillis", "<init>", "(Lkotlin/jvm/functions/Function0;I)V", "Landroid/webkit/WebView;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onReceivedError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "", "url", "Landroid/graphics/Bitmap;", "favicon", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Landroid/webkit/WebResourceResponse;", "shouldInterceptRequest", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "e", "(Ljava/lang/String;)Z", "d", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Z", "hasLoaded", "b", "hasError", "c", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "setWebViewLoadingErrorCallback", "(Lkotlin/jvm/functions/Function0;)V", "I", "getTimeoutMillis", "()I", "Companion", "ada-embed_release"}, m90085k = 1, m90086mv = {1, 4, 0})
public final class AdaWebViewClient extends WebViewClient {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean hasLoaded;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean hasError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public Function0<Unit> webViewLoadingErrorCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int timeoutMillis;

    /* JADX INFO: compiled from: AdaWebViewClient.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\n¨\u0006\u0012"}, m90084d2 = {"LAdaWebViewClient$Companion;", "", "<init>", "()V", "Lkotlin/Function0;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lkotlin/jvm/functions/Function0;", "", "ADA_INTERFACE_NAME", "Ljava/lang/String;", "", "DEFAULT_LOAD_TIMEOUT", "I", "EMBED_URL", "FALLBACK_URL", "INTENT", "MARKET_PREFIX", "ada-embed_release"}, m90085k = 1, m90086mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Function0<Unit> m5a() {
            return new Function0<Unit>() { // from class: AdaWebViewClient$Companion$defaultErrorCallback$1
                @Override // p852kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Log.d("AdaWebView", "Error Loading AdaWebView");
                }
            };
        }
    }

    /* JADX INFO: renamed from: AdaWebViewClient$a */
    /* JADX INFO: compiled from: AdaWebViewClient.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m90084d2 = {"<anonymous>", "", "run"}, m90085k = 3, m90086mv = {1, 1, 15})
    public static final class RunnableC0000a implements Runnable {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ WebView f6c;

        public RunnableC0000a(WebView webView) {
            this.f6c = webView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (AdaWebViewClient.this.hasLoaded || AdaWebViewClient.this.hasError) {
                return;
            }
            WebView webView = this.f6c;
            if (webView == null || webView.getProgress() != 100) {
                WebView webView2 = this.f6c;
                if (webView2 != null) {
                    webView2.stopLoading();
                }
                AdaWebViewClient.this.m2c().invoke();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3d(WebView view, String url) {
        try {
            Intent uri = Intent.parseUri(url, 1);
            Intrinsics.checkExpressionValueIsNotNull(uri, "Intent.parseUri(url, Intent.URI_INTENT_SCHEME)");
            if (uri == null) {
                return;
            }
            Context context = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
            if (context.getPackageManager().resolveActivity(uri, 65536) != null) {
                try {
                    uri.addCategory("android.intent.category.BROWSABLE");
                    uri.setComponent(null);
                    uri.setSelector(null);
                    view.getContext().startActivity(uri);
                    return;
                } catch (ActivityNotFoundException unused) {
                    Toast.makeText(view.getContext(), "A problem occurred and " + url + " could not be opened.", 1);
                    return;
                }
            }
            if (StringsKt.startsWith$default(url, "intent://", false, 2, (Object) null)) {
                String stringExtra = uri.getStringExtra("browser_fallback_url");
                if (stringExtra != null) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(stringExtra));
                    intent.addCategory("android.intent.category.BROWSABLE");
                    intent.setComponent(null);
                    intent.setSelector(null);
                    view.getContext().startActivity(intent);
                    return;
                }
                if (uri.getPackage() != null) {
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    String str = String.format("market://details?id=%s", Arrays.copyOf(new Object[]{uri.getPackage()}, 1));
                    Intrinsics.checkExpressionValueIsNotNull(str, "java.lang.String.format(this, *args)");
                    Intent data = intent2.setData(Uri.parse(str));
                    Intrinsics.checkExpressionValueIsNotNull(data, "Intent(Intent.ACTION_VIE…age()))\n                )");
                    Context context2 = view.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context2, "view.context");
                    if (data.resolveActivity(context2.getPackageManager()) != null) {
                        data.addCategory("android.intent.category.BROWSABLE");
                        data.setComponent(null);
                        data.setSelector(null);
                        view.getContext().startActivity(data);
                    }
                }
            }
        } catch (URISyntaxException unused2) {
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4e(String url) {
        return StringsKt.contains$default((CharSequence) url, (CharSequence) "file://", false, 2, (Object) null) && url != "file:///android_asset/embed.html";
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(@Nullable WebView view, @Nullable String url) {
        this.hasLoaded = true;
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(@Nullable WebView view, @Nullable String url, @Nullable Bitmap favicon) {
        this.hasLoaded = false;
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0000a(view), this.timeoutMillis);
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@NotNull WebView view, @NotNull String url) {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Function0<Unit> m2c() {
        return this.webViewLoadingErrorCallback;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(@Nullable WebView view, @NotNull WebResourceRequest request, @NotNull WebResourceError error) {
        Log.e("AdaWebView Error", error.getDescription().toString() + " Request URL:" + request.getUrl().toString());
        this.hasError = true;
        this.webViewLoadingErrorCallback.invoke();
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@NotNull WebView view, @NotNull WebResourceRequest request) {
        Uri requestUri = request.getUrl();
        Intrinsics.checkExpressionValueIsNotNull(requestUri, "requestUri");
        if (Intrinsics.areEqual(requestUri.getScheme(), "http")) {
            view.removeJavascriptInterface("AdaAndroid");
        }
        return super.shouldInterceptRequest(view, request);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(@NotNull WebView view, @NotNull String url) {
        if (!StringsKt.contains((CharSequence) url, (CharSequence) ".pdf", true) && !StringsKt.contains((CharSequence) url, (CharSequence) ".txt", true)) {
            if (m4e(url)) {
                return true;
            }
            m3d(view, url);
            return true;
        }
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
        request.setNotificationVisibility(1);
        String strSubstring = url.substring(StringsKt.lastIndexOf$default((CharSequence) url, "name=", 0, false, 6, (Object) null) + 5);
        Intrinsics.checkExpressionValueIsNotNull(strSubstring, "(this as java.lang.String).substring(startIndex)");
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strSubstring);
        Object systemService = view.getContext().getSystemService("download");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.DownloadManager");
        }
        ((DownloadManager) systemService).enqueue(request);
        Toast.makeText(view.getContext(), "Downloading File", 1).show();
        return true;
    }

    public AdaWebViewClient(@NotNull Function0<Unit> function0, int i11) {
        this.webViewLoadingErrorCallback = function0;
        this.timeoutMillis = i11;
    }
}
