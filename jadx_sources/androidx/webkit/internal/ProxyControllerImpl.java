package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.webkit.ProxyConfig;
import androidx.webkit.ProxyController;
import java.lang.reflect.Array;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;

/* JADX INFO: loaded from: classes34.dex */
public class ProxyControllerImpl extends ProxyController {
    private ProxyControllerBoundaryInterface mBoundaryInterface;

    private ProxyControllerBoundaryInterface getBoundaryInterface() {
        if (this.mBoundaryInterface == null) {
            this.mBoundaryInterface = WebViewGlueCommunicator.getFactory().getProxyController();
        }
        return this.mBoundaryInterface;
    }

    @Override // androidx.webkit.ProxyController
    public void clearProxyOverride(@NonNull Executor executor, @NonNull Runnable runnable) {
        if (!WebViewFeatureInternal.PROXY_OVERRIDE.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        getBoundaryInterface().clearProxyOverride(runnable, executor);
    }

    @Override // androidx.webkit.ProxyController
    public void setProxyOverride(@NonNull ProxyConfig proxyConfig, @NonNull Executor executor, @NonNull Runnable runnable) {
        ApiFeature.NoFramework noFramework = WebViewFeatureInternal.PROXY_OVERRIDE;
        ApiFeature.NoFramework noFramework2 = WebViewFeatureInternal.PROXY_OVERRIDE_REVERSE_BYPASS;
        String[][] strArrProxyRulesToStringArray = proxyRulesToStringArray(proxyConfig.getProxyRules());
        String[] strArr = (String[]) proxyConfig.getBypassRules().toArray(new String[0]);
        if (noFramework.isSupportedByWebView() && !proxyConfig.isReverseBypassEnabled()) {
            getBoundaryInterface().setProxyOverride(strArrProxyRulesToStringArray, strArr, runnable, executor);
        } else {
            if (!noFramework.isSupportedByWebView() || !noFramework2.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            getBoundaryInterface().setProxyOverride(strArrProxyRulesToStringArray, strArr, runnable, executor, proxyConfig.isReverseBypassEnabled());
        }
    }

    @NonNull
    @VisibleForTesting
    public static String[][] proxyRulesToStringArray(@NonNull List<ProxyConfig.ProxyRule> list) {
        String[][] strArr = (String[][]) Array.newInstance((Class<?>) String.class, list.size(), 2);
        for (int i11 = 0; i11 < list.size(); i11++) {
            strArr[i11][0] = list.get(i11).getSchemeFilter();
            strArr[i11][1] = list.get(i11).getUrl();
        }
        return strArr;
    }
}
