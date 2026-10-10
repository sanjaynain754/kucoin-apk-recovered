package com.revolut.revolutpay.p123ui.webview;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.revolut.revolutpay.R$id;
import com.revolut.revolutpay.R$layout;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006*\u0001\u000e\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m90084d2 = {"Lcom/revolut/revolutpay/ui/webview/WebViewConfirmationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "", "confirmationUrl", "returnUrl", "", "H", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "com/revolut/revolutpay/ui/webview/WebViewConfirmationActivity$b", "G", "(Ljava/lang/String;)Lcom/revolut/revolutpay/ui/webview/WebViewConfirmationActivity$b;", "i", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1})
public final class WebViewConfirmationActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui.webview.WebViewConfirmationActivity$b */
    public static final class C27590b extends WebViewClient {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f56366a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ WebViewConfirmationActivity f56367b;

        public C27590b(String str, WebViewConfirmationActivity webViewConfirmationActivity) {
            this.f56366a = str;
            this.f56367b = webViewConfirmationActivity;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable String str) {
            String str2 = this.f56366a;
            if (str2 != null && str != null) {
                Uri returnUri = Uri.parse(str2);
                Uri currentUri = Uri.parse(str);
                Intrinsics.checkNotNullExpressionValue(returnUri, "returnUri");
                Intrinsics.checkNotNullExpressionValue(currentUri, "currentUri");
                if (m68495a(returnUri, currentUri)) {
                    this.f56367b.finish();
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m68495a(Uri uri, Uri uri2) {
            if (uri.getHost() != null && Intrinsics.areEqual(uri.getHost(), uri2.getHost()) && uri.getScheme() != null && Intrinsics.areEqual(uri.getScheme(), uri2.getScheme())) {
                return true;
            }
            return false;
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: H */
    private final void m68493H(String confirmationUrl, String returnUrl) {
        WebView webView = (WebView) findViewById(R$id.internalRevolutPay_webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setFocusable(true);
        webView.setFocusableInTouchMode(true);
        webView.setWebViewClient(m68494G(returnUrl));
        webView.loadUrl(confirmationUrl);
    }

    /* JADX INFO: renamed from: G */
    public final C27590b m68494G(String returnUrl) {
        return new C27590b(returnUrl, this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String string;
        super.onCreate(savedInstanceState);
        setContentView(R$layout.internal_revolut_pay_webview_activity);
        Bundle extras = getIntent().getExtras();
        String string2 = null;
        if (extras != null) {
            string = extras.getString("CONFIRMATION_URL_PARAM");
        } else {
            string = null;
        }
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            string2 = extras2.getString("RETURN_URL_PARAM");
        }
        if (string != null && string2 != null) {
            m68493H(string, string2);
        } else {
            finish();
        }
    }
}
