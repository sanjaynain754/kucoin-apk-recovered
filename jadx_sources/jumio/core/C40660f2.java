package jumio.core;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.jumio.sdk.views.JumioDigitalIdentityView;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.f2 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40660f2 extends WebChromeClient {

    /* JADX INFO: renamed from: a */
    public final JumioDigitalIdentityView f90266a;

    public C40660f2(JumioDigitalIdentityView diView) {
        Intrinsics.checkNotNullParameter(diView, "diView");
        this.f90266a = diView;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView view, boolean z11, boolean z12, Message resultMsg) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resultMsg, "resultMsg");
        Object obj = resultMsg.obj;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.webkit.WebView.WebViewTransport");
        ((WebView.WebViewTransport) obj).setWebView(new WebView(view.getContext()));
        resultMsg.sendToTarget();
        JumioDigitalIdentityView.access$externalRequestStarted(this.f90266a);
        return true;
    }
}
