package androidx.webkit;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.webkit.internal.ApiFeature;
import androidx.webkit.internal.ApiHelperForM;
import androidx.webkit.internal.ApiHelperForO;
import androidx.webkit.internal.ApiHelperForOMR1;
import androidx.webkit.internal.ApiHelperForP;
import androidx.webkit.internal.ApiHelperForQ;
import androidx.webkit.internal.WebMessageAdapter;
import androidx.webkit.internal.WebMessagePortImpl;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import androidx.webkit.internal.WebViewProviderAdapter;
import androidx.webkit.internal.WebViewProviderFactory;
import androidx.webkit.internal.WebViewRenderProcessClientFrameworkAdapter;
import androidx.webkit.internal.WebViewRenderProcessImpl;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: classes34.dex */
public class WebViewCompat {
    private static final Uri WILDCARD_URI = Uri.parse(ProxyConfig.MATCH_ALL_SCHEMES);
    private static final Uri EMPTY_URI = Uri.parse("");

    public interface VisualStateCallback {
        @UiThread
        void onComplete(long j11);
    }

    public interface WebMessageListener {
        @UiThread
        void onPostMessage(@NonNull WebView webView, @NonNull WebMessageCompat webMessageCompat, @NonNull Uri uri, boolean z11, @NonNull JavaScriptReplyProxy javaScriptReplyProxy);
    }

    @SuppressLint({"PrivateApi"})
    private static PackageInfo getNotYetLoadedWebViewPackageInfo(Context context) {
        try {
            String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", new Class[0]).invoke(null, new Object[0]);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @SuppressLint({"LambdaLast"})
    public static void setWebViewRenderProcessClient(@NonNull WebView webView, @NonNull Executor executor, @NonNull WebViewRenderProcessClient webViewRenderProcessClient) {
        ApiFeature.C4167Q c4167q = WebViewFeatureInternal.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE;
        if (c4167q.isSupportedByFramework()) {
            ApiHelperForQ.setWebViewRenderProcessClient(webView, executor, webViewRenderProcessClient);
        } else {
            if (!c4167q.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            getProvider(webView).setWebViewRenderProcessClient(executor, webViewRenderProcessClient);
        }
    }

    @NonNull
    public static ScriptHandler addDocumentStartJavaScript(@NonNull WebView webView, @NonNull String str, @NonNull Set<String> set) {
        if (WebViewFeatureInternal.DOCUMENT_START_SCRIPT.isSupportedByWebView()) {
            return getProvider(webView).addDocumentStartJavaScript(str, (String[]) set.toArray(new String[0]));
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void addWebMessageListener(@NonNull WebView webView, @NonNull String str, @NonNull Set<String> set, @NonNull WebMessageListener webMessageListener) {
        if (!WebViewFeatureInternal.WEB_MESSAGE_LISTENER.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        getProvider(webView).addWebMessageListener(str, (String[]) set.toArray(new String[0]), webMessageListener);
    }

    private static void checkThread(WebView webView) {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, new Object[0]);
                return;
            } catch (IllegalAccessException e11) {
                throw new RuntimeException(e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException(e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException(e13);
            }
        }
        Looper webViewLooper = ApiHelperForP.getWebViewLooper(webView);
        if (webViewLooper == Looper.myLooper()) {
            return;
        }
        throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + webViewLooper + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
    }

    @NonNull
    public static WebMessagePortCompat[] createWebMessageChannel(@NonNull WebView webView) {
        ApiFeature.C4163M c4163m = WebViewFeatureInternal.CREATE_WEB_MESSAGE_CHANNEL;
        if (c4163m.isSupportedByFramework()) {
            return WebMessagePortImpl.portsToCompat(ApiHelperForM.createWebMessageChannel(webView));
        }
        if (c4163m.isSupportedByWebView()) {
            return getProvider(webView).createWebMessageChannel();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static PackageInfo getCurrentLoadedWebViewPackage() {
        if (Build.VERSION.SDK_INT >= 26) {
            return ApiHelperForO.getCurrentWebViewPackage();
        }
        try {
            return getLoadedWebViewPackageInfo();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @SuppressLint({"PrivateApi"})
    private static PackageInfo getLoadedWebViewPackageInfo() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }

    @NonNull
    @UiThread
    public static Profile getProfile(@NonNull WebView webView) {
        if (WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            return getProvider(webView).getProfile();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    private static WebViewProviderAdapter getProvider(WebView webView) {
        return new WebViewProviderAdapter(createProvider(webView));
    }

    @NonNull
    public static Uri getSafeBrowsingPrivacyPolicyUrl() {
        ApiFeature.O_MR1 o_mr1 = WebViewFeatureInternal.SAFE_BROWSING_PRIVACY_POLICY_URL;
        if (o_mr1.isSupportedByFramework()) {
            return ApiHelperForOMR1.getSafeBrowsingPrivacyPolicyUrl();
        }
        if (o_mr1.isSupportedByWebView()) {
            return getFactory().getStatics().getSafeBrowsingPrivacyPolicyUrl();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @NonNull
    public static String getVariationsHeader() {
        if (WebViewFeatureInternal.GET_VARIATIONS_HEADER.isSupportedByWebView()) {
            return getFactory().getStatics().getVariationsHeader();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Nullable
    public static WebChromeClient getWebChromeClient(@NonNull WebView webView) {
        ApiFeature.C4165O c4165o = WebViewFeatureInternal.GET_WEB_CHROME_CLIENT;
        if (c4165o.isSupportedByFramework()) {
            return ApiHelperForO.getWebChromeClient(webView);
        }
        if (c4165o.isSupportedByWebView()) {
            return getProvider(webView).getWebChromeClient();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @NonNull
    public static WebViewClient getWebViewClient(@NonNull WebView webView) {
        ApiFeature.C4165O c4165o = WebViewFeatureInternal.GET_WEB_VIEW_CLIENT;
        if (c4165o.isSupportedByFramework()) {
            return ApiHelperForO.getWebViewClient(webView);
        }
        if (c4165o.isSupportedByWebView()) {
            return getProvider(webView).getWebViewClient();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Nullable
    public static WebViewRenderProcess getWebViewRenderProcess(@NonNull WebView webView) {
        ApiFeature.C4167Q c4167q = WebViewFeatureInternal.GET_WEB_VIEW_RENDERER;
        if (!c4167q.isSupportedByFramework()) {
            if (c4167q.isSupportedByWebView()) {
                return getProvider(webView).getWebViewRenderProcess();
            }
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        android.webkit.WebViewRenderProcess webViewRenderProcess = ApiHelperForQ.getWebViewRenderProcess(webView);
        if (webViewRenderProcess != null) {
            return WebViewRenderProcessImpl.forFrameworkObject(webViewRenderProcess);
        }
        return null;
    }

    @Nullable
    public static WebViewRenderProcessClient getWebViewRenderProcessClient(@NonNull WebView webView) {
        ApiFeature.C4167Q c4167q = WebViewFeatureInternal.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE;
        if (!c4167q.isSupportedByFramework()) {
            if (c4167q.isSupportedByWebView()) {
                return getProvider(webView).getWebViewRenderProcessClient();
            }
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        android.webkit.WebViewRenderProcessClient webViewRenderProcessClient = ApiHelperForQ.getWebViewRenderProcessClient(webView);
        if (webViewRenderProcessClient == null || !(webViewRenderProcessClient instanceof WebViewRenderProcessClientFrameworkAdapter)) {
            return null;
        }
        return ((WebViewRenderProcessClientFrameworkAdapter) webViewRenderProcessClient).getFrameworkRenderProcessClient();
    }

    public static boolean isAudioMuted(@NonNull WebView webView) {
        if (WebViewFeatureInternal.MUTE_AUDIO.isSupportedByWebView()) {
            return getProvider(webView).isAudioMuted();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static boolean isMultiProcessEnabled() {
        if (WebViewFeatureInternal.MULTI_PROCESS.isSupportedByWebView()) {
            return getFactory().getStatics().isMultiProcessEnabled();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void postVisualStateCallback(@NonNull WebView webView, long j11, @NonNull VisualStateCallback visualStateCallback) {
        ApiFeature.C4163M c4163m = WebViewFeatureInternal.VISUAL_STATE_CALLBACK;
        if (c4163m.isSupportedByFramework()) {
            ApiHelperForM.postVisualStateCallback(webView, j11, visualStateCallback);
        } else {
            if (!c4163m.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            checkThread(webView);
            getProvider(webView).insertVisualStateCallback(j11, visualStateCallback);
        }
    }

    public static void postWebMessage(@NonNull WebView webView, @NonNull WebMessageCompat webMessageCompat, @NonNull Uri uri) {
        if (WILDCARD_URI.equals(uri)) {
            uri = EMPTY_URI;
        }
        ApiFeature.C4163M c4163m = WebViewFeatureInternal.POST_WEB_MESSAGE;
        if (c4163m.isSupportedByFramework() && webMessageCompat.getType() == 0) {
            ApiHelperForM.postWebMessage(webView, WebMessagePortImpl.compatToFrameworkMessage(webMessageCompat), uri);
        } else {
            if (!c4163m.isSupportedByWebView() || !WebMessageAdapter.isMessagePayloadTypeSupportedByWebView(webMessageCompat.getType())) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            getProvider(webView).postWebMessage(webMessageCompat, uri);
        }
    }

    public static void removeWebMessageListener(@NonNull WebView webView, @NonNull String str) {
        if (!WebViewFeatureInternal.WEB_MESSAGE_LISTENER.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        getProvider(webView).removeWebMessageListener(str);
    }

    public static void setAudioMuted(@NonNull WebView webView, boolean z11) {
        if (!WebViewFeatureInternal.MUTE_AUDIO.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        getProvider(webView).setAudioMuted(z11);
    }

    @UiThread
    public static void setProfile(@NonNull WebView webView, @NonNull String str) {
        if (!WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        getProvider(webView).setProfileWithName(str);
    }

    public static void setSafeBrowsingAllowlist(@NonNull Set<String> set, @Nullable ValueCallback<Boolean> valueCallback) {
        ApiFeature.O_MR1 o_mr1 = WebViewFeatureInternal.SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_PREFERRED;
        ApiFeature.O_MR1 o_mr2 = WebViewFeatureInternal.SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_DEPRECATED;
        if (o_mr1.isSupportedByWebView()) {
            getFactory().getStatics().setSafeBrowsingAllowlist(set, valueCallback);
            return;
        }
        ArrayList arrayList = new ArrayList(set);
        if (o_mr2.isSupportedByFramework()) {
            ApiHelperForOMR1.setSafeBrowsingWhitelist(arrayList, valueCallback);
        } else {
            if (!o_mr2.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            getFactory().getStatics().setSafeBrowsingWhitelist(arrayList, valueCallback);
        }
    }

    @Deprecated
    public static void setSafeBrowsingWhitelist(@NonNull List<String> list, @Nullable ValueCallback<Boolean> valueCallback) {
        setSafeBrowsingAllowlist(new HashSet(list), valueCallback);
    }

    public static void startSafeBrowsing(@NonNull Context context, @Nullable ValueCallback<Boolean> valueCallback) {
        ApiFeature.O_MR1 o_mr1 = WebViewFeatureInternal.START_SAFE_BROWSING;
        if (o_mr1.isSupportedByFramework()) {
            ApiHelperForOMR1.startSafeBrowsing(context, valueCallback);
        } else {
            if (!o_mr1.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            getFactory().getStatics().initSafeBrowsing(context, valueCallback);
        }
    }

    private WebViewCompat() {
    }

    private static WebViewProviderBoundaryInterface createProvider(WebView webView) {
        return getFactory().createWebView(webView);
    }

    @Nullable
    public static PackageInfo getCurrentWebViewPackage(@NonNull Context context) {
        PackageInfo currentLoadedWebViewPackage = getCurrentLoadedWebViewPackage();
        if (currentLoadedWebViewPackage != null) {
            return currentLoadedWebViewPackage;
        }
        return getNotYetLoadedWebViewPackageInfo(context);
    }

    private static WebViewProviderFactory getFactory() {
        return WebViewGlueCommunicator.getFactory();
    }

    public static void setWebViewRenderProcessClient(@NonNull WebView webView, @Nullable WebViewRenderProcessClient webViewRenderProcessClient) {
        ApiFeature.C4167Q c4167q = WebViewFeatureInternal.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE;
        if (c4167q.isSupportedByFramework()) {
            ApiHelperForQ.setWebViewRenderProcessClient(webView, webViewRenderProcessClient);
        } else {
            if (c4167q.isSupportedByWebView()) {
                getProvider(webView).setWebViewRenderProcessClient(null, webViewRenderProcessClient);
                return;
            }
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }
}
