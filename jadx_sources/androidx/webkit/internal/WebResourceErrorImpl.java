package androidx.webkit.internal;

import android.webkit.WebResourceError;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.webkit.WebResourceErrorCompat;
import eh0.C37184a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;

/* JADX INFO: loaded from: classes34.dex */
public class WebResourceErrorImpl extends WebResourceErrorCompat {
    private WebResourceErrorBoundaryInterface mBoundaryInterface;
    private WebResourceError mFrameworksImpl;

    public WebResourceErrorImpl(@NonNull InvocationHandler invocationHandler) {
        this.mBoundaryInterface = (WebResourceErrorBoundaryInterface) C37184a.m83171a(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    private WebResourceErrorBoundaryInterface getBoundaryInterface() {
        if (this.mBoundaryInterface == null) {
            this.mBoundaryInterface = (WebResourceErrorBoundaryInterface) C37184a.m83171a(WebResourceErrorBoundaryInterface.class, WebViewGlueCommunicator.getCompatConverter().convertWebResourceError(this.mFrameworksImpl));
        }
        return this.mBoundaryInterface;
    }

    @RequiresApi(23)
    private WebResourceError getFrameworksImpl() {
        if (this.mFrameworksImpl == null) {
            this.mFrameworksImpl = WebViewGlueCommunicator.getCompatConverter().convertWebResourceError(Proxy.getInvocationHandler(this.mBoundaryInterface));
        }
        return this.mFrameworksImpl;
    }

    @Override // androidx.webkit.WebResourceErrorCompat
    @NonNull
    public CharSequence getDescription() {
        ApiFeature.C4163M c4163m = WebViewFeatureInternal.WEB_RESOURCE_ERROR_GET_DESCRIPTION;
        if (c4163m.isSupportedByFramework()) {
            return ApiHelperForM.getDescription(getFrameworksImpl());
        }
        if (c4163m.isSupportedByWebView()) {
            return getBoundaryInterface().getDescription();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.WebResourceErrorCompat
    public int getErrorCode() {
        ApiFeature.C4163M c4163m = WebViewFeatureInternal.WEB_RESOURCE_ERROR_GET_CODE;
        if (c4163m.isSupportedByFramework()) {
            return ApiHelperForM.getErrorCode(getFrameworksImpl());
        }
        if (c4163m.isSupportedByWebView()) {
            return getBoundaryInterface().getErrorCode();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public WebResourceErrorImpl(@NonNull WebResourceError webResourceError) {
        this.mFrameworksImpl = webResourceError;
    }
}
