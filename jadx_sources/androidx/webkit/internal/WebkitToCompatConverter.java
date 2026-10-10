package androidx.webkit.internal;

import android.webkit.CookieManager;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import eh0.C37184a;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes34.dex */
public class WebkitToCompatConverter {
    private final WebkitToCompatConverterBoundaryInterface mImpl;

    @NonNull
    public InvocationHandler convertSafeBrowsingResponse(@NonNull SafeBrowsingResponse safeBrowsingResponse) {
        return this.mImpl.convertSafeBrowsingResponse(safeBrowsingResponse);
    }

    @NonNull
    public InvocationHandler convertServiceWorkerSettings(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return this.mImpl.convertServiceWorkerSettings(serviceWorkerWebSettings);
    }

    @NonNull
    public InvocationHandler convertWebMessagePort(@NonNull WebMessagePort webMessagePort) {
        return this.mImpl.convertWebMessagePort(webMessagePort);
    }

    @NonNull
    public InvocationHandler convertWebResourceError(@NonNull WebResourceError webResourceError) {
        return this.mImpl.convertWebResourceError(webResourceError);
    }

    @NonNull
    public CookieManagerAdapter convertCookieManager(@NonNull CookieManager cookieManager) {
        return new CookieManagerAdapter((WebViewCookieManagerBoundaryInterface) C37184a.m83171a(WebViewCookieManagerBoundaryInterface.class, this.mImpl.convertCookieManager(cookieManager)));
    }

    @NonNull
    @RequiresApi(27)
    public SafeBrowsingResponse convertSafeBrowsingResponse(@NonNull InvocationHandler invocationHandler) {
        return C4194h0.m3819a(this.mImpl.convertSafeBrowsingResponse(invocationHandler));
    }

    @NonNull
    @RequiresApi(24)
    public ServiceWorkerWebSettings convertServiceWorkerSettings(@NonNull InvocationHandler invocationHandler) {
        return (ServiceWorkerWebSettings) this.mImpl.convertServiceWorkerSettings(invocationHandler);
    }

    @NonNull
    public WebSettingsAdapter convertSettings(@NonNull WebSettings webSettings) {
        return new WebSettingsAdapter((WebSettingsBoundaryInterface) C37184a.m83171a(WebSettingsBoundaryInterface.class, this.mImpl.convertSettings(webSettings)));
    }

    @NonNull
    @RequiresApi(23)
    public WebMessagePort convertWebMessagePort(@NonNull InvocationHandler invocationHandler) {
        return (WebMessagePort) this.mImpl.convertWebMessagePort(invocationHandler);
    }

    @NonNull
    @RequiresApi(23)
    public WebResourceError convertWebResourceError(@NonNull InvocationHandler invocationHandler) {
        return (WebResourceError) this.mImpl.convertWebResourceError(invocationHandler);
    }

    @NonNull
    public WebResourceRequestAdapter convertWebResourceRequest(@NonNull WebResourceRequest webResourceRequest) {
        return new WebResourceRequestAdapter((WebResourceRequestBoundaryInterface) C37184a.m83171a(WebResourceRequestBoundaryInterface.class, this.mImpl.convertWebResourceRequest(webResourceRequest)));
    }

    public WebkitToCompatConverter(@NonNull WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.mImpl = webkitToCompatConverterBoundaryInterface;
    }
}
