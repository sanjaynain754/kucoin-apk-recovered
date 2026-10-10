package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.webkit.JavaScriptReplyProxy;
import eh0.C37184a;
import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* JADX INFO: loaded from: classes34.dex */
public class JavaScriptReplyProxyImpl extends JavaScriptReplyProxy {
    private JsReplyProxyBoundaryInterface mBoundaryInterface;

    @Override // androidx.webkit.JavaScriptReplyProxy
    public void postMessage(@NonNull String str) {
        if (!WebViewFeatureInternal.WEB_MESSAGE_LISTENER.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        this.mBoundaryInterface.postMessage(str);
    }

    @NonNull
    public static JavaScriptReplyProxyImpl forInvocationHandler(@NonNull InvocationHandler invocationHandler) {
        final JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) C37184a.m83171a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (JavaScriptReplyProxyImpl) jsReplyProxyBoundaryInterface.getOrCreatePeer(new Callable<Object>() { // from class: androidx.webkit.internal.JavaScriptReplyProxyImpl.1
            @Override // java.util.concurrent.Callable
            public Object call() {
                return new JavaScriptReplyProxyImpl(jsReplyProxyBoundaryInterface);
            }
        });
    }

    public JavaScriptReplyProxyImpl(@NonNull JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.mBoundaryInterface = jsReplyProxyBoundaryInterface;
    }

    @Override // androidx.webkit.JavaScriptReplyProxy
    public void postMessage(@NonNull byte[] bArr) {
        Objects.requireNonNull(bArr, "ArrayBuffer must be non-null");
        if (WebViewFeatureInternal.WEB_MESSAGE_ARRAY_BUFFER.isSupportedByWebView()) {
            this.mBoundaryInterface.postMessageWithPayload(C37184a.m83173c(new WebMessagePayloadAdapter(bArr)));
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
