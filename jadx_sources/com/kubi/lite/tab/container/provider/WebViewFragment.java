package com.kubi.lite.tab.container.provider;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.lite.tab.container.provider.WebViewFragment;
import com.kubi.sdk.BaseFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: H5FragmentProvider.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/lite/tab/container/provider/WebViewFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "webView", "Landroid/webkit/WebView;", "url", "", "getUrl", "()Ljava/lang/String;", "url$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onDestroyView", "", "Companion", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class WebViewFragment extends BaseFragment {

    /* JADX INFO: renamed from: W */
    @NotNull
    public static final Companion f32098W = new Companion(null);

    /* JADX INFO: renamed from: U */
    @Nullable
    public WebView f32099U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f32100V = LazyKt.lazy(new Function0() { // from class: co.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WebViewFragment.m37569l3(this.f5698b);
        }
    });

    /* JADX INFO: compiled from: H5FragmentProvider.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/lite/tab/container/provider/WebViewFragment$Companion;", "", "<init>", "()V", "TAG", "", "ARG_URL", "newInstance", "Lcom/kubi/lite/tab/container/provider/WebViewFragment;", "url", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final WebViewFragment newInstance(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            C44128b.m97266j("WebViewFragment", "Creating new WebViewFragment instance: URL length=" + url.length());
            WebViewFragment webViewFragment = new WebViewFragment();
            Bundle bundle = new Bundle();
            bundle.putString("url", url);
            webViewFragment.setArguments(bundle);
            return webViewFragment;
        }
    }

    /* JADX INFO: renamed from: k3 */
    public final String m37570k3() {
        return (String) this.f32100V.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C44128b.m97266j(getTAG(), "onCreateView started: URL length=" + m37570k3().length());
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WebView webView = new WebView(requireContext());
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        this.f32099U = webView;
        frameLayout.addView(webView);
        if (m37570k3().length() > 0) {
            C44128b.m97266j(getTAG(), "Loading WebView URL: " + m37570k3());
            WebView webView2 = this.f32099U;
            if (webView2 != null) {
                webView2.loadUrl(m37570k3());
            }
        } else {
            C44128b.m97266j(getTAG(), "URL is empty, skipping load");
        }
        C44128b.m97266j(getTAG(), "onCreateView completed");
        return frameLayout;
    }

    /* JADX INFO: renamed from: l3 */
    public static final String m37569l3(WebViewFragment webViewFragment) {
        String string;
        Bundle arguments = webViewFragment.getArguments();
        if (arguments != null && (string = arguments.getString("url")) != null) {
            return string;
        }
        C44128b.m97266j(webViewFragment.getTAG(), "URL parameter is null or missing");
        return "";
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C44128b.m97266j(getTAG(), "WebView destroyed: URL length=" + m37570k3().length());
        WebView webView = this.f32099U;
        if (webView != null) {
            webView.destroy();
        }
        this.f32099U = null;
    }
}
