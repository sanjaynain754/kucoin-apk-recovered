package androidx.webkit.internal;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.Profile;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewRenderProcess;
import androidx.webkit.WebViewRenderProcessClient;
import eh0.C37184a;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: classes34.dex */
public class WebViewProviderAdapter {
    WebViewProviderBoundaryInterface mImpl;

    @NonNull
    public ScriptHandlerImpl addDocumentStartJavaScript(@NonNull String str, @NonNull String[] strArr) {
        return ScriptHandlerImpl.toScriptHandler(this.mImpl.addDocumentStartJavaScript(str, strArr));
    }

    public void addWebMessageListener(@NonNull String str, @NonNull String[] strArr, @NonNull WebViewCompat.WebMessageListener webMessageListener) {
        this.mImpl.addWebMessageListener(str, strArr, C37184a.m83173c(new WebMessageListenerAdapter(webMessageListener)));
    }

    @NonNull
    public WebMessagePortCompat[] createWebMessageChannel() {
        InvocationHandler[] invocationHandlerArrCreateWebMessageChannel = this.mImpl.createWebMessageChannel();
        WebMessagePortCompat[] webMessagePortCompatArr = new WebMessagePortCompat[invocationHandlerArrCreateWebMessageChannel.length];
        for (int i11 = 0; i11 < invocationHandlerArrCreateWebMessageChannel.length; i11++) {
            webMessagePortCompatArr[i11] = new WebMessagePortImpl(invocationHandlerArrCreateWebMessageChannel[i11]);
        }
        return webMessagePortCompatArr;
    }

    @NonNull
    public Profile getProfile() {
        return new ProfileImpl((ProfileBoundaryInterface) C37184a.m83171a(ProfileBoundaryInterface.class, this.mImpl.getProfile()));
    }

    @Nullable
    public WebChromeClient getWebChromeClient() {
        return this.mImpl.getWebChromeClient();
    }

    @NonNull
    public WebViewClient getWebViewClient() {
        return this.mImpl.getWebViewClient();
    }

    @Nullable
    public WebViewRenderProcess getWebViewRenderProcess() {
        return WebViewRenderProcessImpl.forInvocationHandler(this.mImpl.getWebViewRenderer());
    }

    @Nullable
    public WebViewRenderProcessClient getWebViewRenderProcessClient() {
        InvocationHandler webViewRendererClient = this.mImpl.getWebViewRendererClient();
        if (webViewRendererClient == null) {
            return null;
        }
        return ((WebViewRenderProcessClientAdapter) C37184a.m83175e(webViewRendererClient)).getWebViewRenderProcessClient();
    }

    public void insertVisualStateCallback(long j11, @NonNull WebViewCompat.VisualStateCallback visualStateCallback) {
        this.mImpl.insertVisualStateCallback(j11, C37184a.m83173c(new VisualStateCallbackAdapter(visualStateCallback)));
    }

    public boolean isAudioMuted() {
        return this.mImpl.isAudioMuted();
    }

    public void postWebMessage(@NonNull WebMessageCompat webMessageCompat, @NonNull Uri uri) {
        this.mImpl.postMessageToMainFrame(C37184a.m83173c(new WebMessageAdapter(webMessageCompat)), uri);
    }

    public void removeWebMessageListener(@NonNull String str) {
        this.mImpl.removeWebMessageListener(str);
    }

    public void setAudioMuted(boolean z11) {
        this.mImpl.setAudioMuted(z11);
    }

    public void setProfileWithName(@NonNull String str) {
        this.mImpl.setProfile(str);
    }

    @SuppressLint({"LambdaLast"})
    public void setWebViewRenderProcessClient(@Nullable Executor executor, @Nullable WebViewRenderProcessClient webViewRenderProcessClient) {
        this.mImpl.setWebViewRendererClient(webViewRenderProcessClient != null ? C37184a.m83173c(new WebViewRenderProcessClientAdapter(executor, webViewRenderProcessClient)) : null);
    }

    public WebViewProviderAdapter(@NonNull WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.mImpl = webViewProviderBoundaryInterface;
    }
}
