package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.webkit.WebViewRenderProcess;
import eh0.C37184a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;

/* JADX INFO: loaded from: classes34.dex */
public class WebViewRenderProcessImpl extends WebViewRenderProcess {
    private static final WeakHashMap<android.webkit.WebViewRenderProcess, WebViewRenderProcessImpl> sFrameworkMap = new WeakHashMap<>();
    private WebViewRendererBoundaryInterface mBoundaryInterface;
    private WeakReference<android.webkit.WebViewRenderProcess> mFrameworkObject;

    public WebViewRenderProcessImpl(@NonNull WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        this.mBoundaryInterface = webViewRendererBoundaryInterface;
    }

    @NonNull
    public static WebViewRenderProcessImpl forFrameworkObject(@NonNull android.webkit.WebViewRenderProcess webViewRenderProcess) {
        WeakHashMap<android.webkit.WebViewRenderProcess, WebViewRenderProcessImpl> weakHashMap = sFrameworkMap;
        WebViewRenderProcessImpl webViewRenderProcessImpl = weakHashMap.get(webViewRenderProcess);
        if (webViewRenderProcessImpl != null) {
            return webViewRenderProcessImpl;
        }
        WebViewRenderProcessImpl webViewRenderProcessImpl2 = new WebViewRenderProcessImpl(webViewRenderProcess);
        weakHashMap.put(webViewRenderProcess, webViewRenderProcessImpl2);
        return webViewRenderProcessImpl2;
    }

    @NonNull
    public static WebViewRenderProcessImpl forInvocationHandler(@NonNull InvocationHandler invocationHandler) {
        final WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) C37184a.m83171a(WebViewRendererBoundaryInterface.class, invocationHandler);
        return (WebViewRenderProcessImpl) webViewRendererBoundaryInterface.getOrCreatePeer(new Callable<Object>() { // from class: androidx.webkit.internal.WebViewRenderProcessImpl.1
            @Override // java.util.concurrent.Callable
            public Object call() {
                return new WebViewRenderProcessImpl(webViewRendererBoundaryInterface);
            }
        });
    }

    @Override // androidx.webkit.WebViewRenderProcess
    public boolean terminate() {
        ApiFeature.C4167Q c4167q = WebViewFeatureInternal.WEB_VIEW_RENDERER_TERMINATE;
        if (c4167q.isSupportedByFramework()) {
            android.webkit.WebViewRenderProcess webViewRenderProcessM3817a = C4192g0.m3817a(this.mFrameworkObject.get());
            return webViewRenderProcessM3817a != null && ApiHelperForQ.terminate(webViewRenderProcessM3817a);
        }
        if (c4167q.isSupportedByWebView()) {
            return this.mBoundaryInterface.terminate();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public WebViewRenderProcessImpl(@NonNull android.webkit.WebViewRenderProcess webViewRenderProcess) {
        this.mFrameworkObject = new WeakReference<>(webViewRenderProcess);
    }
}
