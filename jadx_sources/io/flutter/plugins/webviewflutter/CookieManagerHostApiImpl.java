package io.flutter.plugins.webviewflutter;

import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class CookieManagerHostApiImpl implements GeneratedAndroidWebView.CookieManagerHostApi {
    private final BinaryMessenger binaryMessenger;
    private final InstanceManager instanceManager;
    private final CookieManagerProxy proxy;

    @NonNull
    private final AndroidSdkChecker sdkChecker;

    @VisibleForTesting
    public interface AndroidSdkChecker {
        @ChecksSdkIntAtLeast(parameter = 0)
        boolean sdkIsAtLeast(int i11);
    }

    public CookieManagerHostApiImpl(@NonNull BinaryMessenger binaryMessenger, @NonNull InstanceManager instanceManager) {
        this(binaryMessenger, instanceManager, new CookieManagerProxy());
    }

    @VisibleForTesting
    public static class CookieManagerProxy {
        @NonNull
        public CookieManager getInstance() {
            return CookieManager.getInstance();
        }
    }

    @VisibleForTesting
    public CookieManagerHostApiImpl(@NonNull BinaryMessenger binaryMessenger, @NonNull InstanceManager instanceManager, @NonNull CookieManagerProxy cookieManagerProxy) {
        this(binaryMessenger, instanceManager, cookieManagerProxy, new AndroidSdkChecker() { // from class: io.flutter.plugins.webviewflutter.a
            @Override // io.flutter.plugins.webviewflutter.CookieManagerHostApiImpl.AndroidSdkChecker
            public final boolean sdkIsAtLeast(int i11) {
                return CookieManagerHostApiImpl.m87634e(i11);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m87634e(int i11) {
        return Build.VERSION.SDK_INT >= i11;
    }

    @NonNull
    private CookieManager getCookieManagerInstance(@NonNull Long l11) {
        CookieManager cookieManager = (CookieManager) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(cookieManager);
        return cookieManager;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi
    public void attachInstance(@NonNull Long l11) {
        this.instanceManager.addDartCreatedInstance(this.proxy.getInstance(), l11.longValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi
    public void removeAllCookies(@NonNull Long l11, @NonNull final GeneratedAndroidWebView.Result<Boolean> result) {
        if (!this.sdkChecker.sdkIsAtLeast(21)) {
            result.success(Boolean.valueOf(removeCookiesPreL(getCookieManagerInstance(l11))));
            return;
        }
        CookieManager cookieManagerInstance = getCookieManagerInstance(l11);
        Objects.requireNonNull(result);
        cookieManagerInstance.removeAllCookies(new ValueCallback() { // from class: io.flutter.plugins.webviewflutter.b
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                result.success((Boolean) obj);
            }
        });
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi
    public void setAcceptThirdPartyCookies(@NonNull Long l11, @NonNull Long l12, @NonNull Boolean bool) {
        if (!this.sdkChecker.sdkIsAtLeast(21)) {
            throw new UnsupportedOperationException("`setAcceptThirdPartyCookies` is unsupported on versions below `Build.VERSION_CODES.LOLLIPOP`.");
        }
        CookieManager cookieManagerInstance = getCookieManagerInstance(l11);
        WebView webView = (WebView) this.instanceManager.getInstance(l12.longValue());
        Objects.requireNonNull(webView);
        cookieManagerInstance.setAcceptThirdPartyCookies(webView, bool.booleanValue());
    }

    @VisibleForTesting
    public CookieManagerHostApiImpl(@NonNull BinaryMessenger binaryMessenger, @NonNull InstanceManager instanceManager, @NonNull CookieManagerProxy cookieManagerProxy, @NonNull AndroidSdkChecker androidSdkChecker) {
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
        this.proxy = cookieManagerProxy;
        this.sdkChecker = androidSdkChecker;
    }

    private boolean removeCookiesPreL(CookieManager cookieManager) {
        boolean zHasCookies = cookieManager.hasCookies();
        if (zHasCookies) {
            cookieManager.removeAllCookie();
        }
        return zHasCookies;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi
    public void setCookie(@NonNull Long l11, @NonNull String str, @NonNull String str2) {
        getCookieManagerInstance(l11).setCookie(str, str2);
    }
}
