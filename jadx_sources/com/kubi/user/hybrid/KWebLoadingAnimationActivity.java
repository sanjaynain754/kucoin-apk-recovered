package com.kubi.user.hybrid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.C5275i0;
import com.google.firebase.messaging.Constants;
import com.kubi.C11352b;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.web.KWebView;
import com.kubi.sdk.web.core.WebLoadError;
import com.kubi.user.R$color;
import com.kubi.widget.web.helper.ImageFileChooser;
import com.kubi.widget.web.helper.OutFileChooser;
import com.kubi.widget.web.helper.WebPermissionsHelper;
import com.kubi.widget.web.ui.KWebBaseActivity;
import com.kubi.widget.web.ui.KWebContainer;
import com.kubi.widget.web.ui.KWebUIConfig;
import e10.InterfaceC37042a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import z00.InterfaceC46620b;

/* JADX INFO: compiled from: KWebLoadingAnimationActivity.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0014J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\tH\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\tH\u0002J\b\u0010\u0015\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/user/hybrid/KWebLoadingAnimationActivity;", "Lcom/kubi/widget/web/ui/KWebBaseActivity;", "<init>", "()V", "loadingViewContainer", "Landroid/widget/FrameLayout;", "isLoadingViewRemoved", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "onDestroy", "initWebView", "webView", "Lcom/kubi/sdk/web/KWebView;", "startLoad", "getWebUIConfig", "Lcom/kubi/widget/web/ui/KWebUIConfig;", "removeLoadingView", "isActivityInvalid", "Companion", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKWebLoadingAnimationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KWebLoadingAnimationActivity.kt\ncom/kubi/user/hybrid/KWebLoadingAnimationActivity\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,202:1\n29#2:203\n*S KotlinDebug\n*F\n+ 1 KWebLoadingAnimationActivity.kt\ncom/kubi/user/hybrid/KWebLoadingAnimationActivity\n*L\n180#1:203\n*E\n"})
public final class KWebLoadingAnimationActivity extends KWebBaseActivity {

    /* JADX INFO: renamed from: v */
    @NotNull
    public static final Companion f53668v = new Companion(null);

    /* JADX INFO: renamed from: t */
    public FrameLayout f53669t;

    /* JADX INFO: renamed from: u */
    public boolean f53670u;

    /* JADX INFO: compiled from: KWebLoadingAnimationActivity.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/user/hybrid/KWebLoadingAnimationActivity$Companion;", "", "<init>", "()V", "TAG", "", "openPage", "", "context", "Landroid/content/Context;", "url", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void openPage(@Nullable Context context, @NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            if (context == null) {
                return;
            }
            Intent intent = new Intent(context, (Class<?>) KWebLoadingAnimationActivity.class);
            intent.putExtra("url", url);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: com.kubi.user.hybrid.KWebLoadingAnimationActivity$a */
    /* JADX INFO: compiled from: KWebLoadingAnimationActivity.kt */
    /* JADX INFO: loaded from: classes53.dex */
    @Metadata(m90083d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J(\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016¨\u0006\u0013"}, m90084d2 = {"com/kubi/user/hybrid/KWebLoadingAnimationActivity$onCreate$2", "Lcom/kubi/sdk/web/listener/IViewLoadingListener;", "onLoadFailed", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/kubi/sdk/web/core/WebLoadError;", "onLoadStart", "onLoadSuccess", "onMount", "pageType", "", "dclTime", "", "currentProjectName", "currentProjectVersion", "onProgressChanged", "progress", "", "onTimeOut", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26712a implements InterfaceC46620b {
        public C26712a() {
        }

        @Override // z00.InterfaceC46620b
        /* JADX INFO: renamed from: a */
        public void mo65497a(String pageType, double d11, String currentProjectName, String currentProjectVersion) {
            Intrinsics.checkNotNullParameter(pageType, "pageType");
            Intrinsics.checkNotNullParameter(currentProjectName, "currentProjectName");
            Intrinsics.checkNotNullParameter(currentProjectVersion, "currentProjectVersion");
            if (!KWebLoadingAnimationActivity.this.m65493U0()) {
                KWebLoadingAnimationActivity.this.m65494V0();
            }
            C44128b.m97259c("KWebLoadingAnimationActivityTAG", "onMount pageType:" + pageType + ", dclTime:" + d11 + ", currentProjectName:" + currentProjectName + ", currentProjectVersion:" + currentProjectVersion);
        }

        @Override // z00.InterfaceC46620b
        /* JADX INFO: renamed from: b */
        public void mo65498b(int i11) {
            C44128b.m97259c("KWebLoadingAnimationActivityTAG", "onProgressChanged progress:" + i11);
        }

        @Override // z00.InterfaceC46620b
        /* JADX INFO: renamed from: c */
        public void mo65499c() {
            C44128b.m97259c("KWebLoadingAnimationActivityTAG", "onLoadSuccess");
        }

        @Override // z00.InterfaceC46620b
        /* JADX INFO: renamed from: d */
        public void mo65500d() {
            C44128b.m97259c("KWebLoadingAnimationActivityTAG", "onLoadStart");
        }

        @Override // z00.InterfaceC46620b
        /* JADX INFO: renamed from: e */
        public void mo65501e(WebLoadError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            if (!KWebLoadingAnimationActivity.this.m65493U0()) {
                KWebLoadingAnimationActivity.this.m65494V0();
            }
            C44128b.m97259c("KWebLoadingAnimationActivityTAG", "onLoadFailed error:" + error);
        }

        @Override // z00.InterfaceC46620b
        /* JADX INFO: renamed from: f */
        public void mo65502f() {
            final KWebLoadingAnimationActivity kWebLoadingAnimationActivity = KWebLoadingAnimationActivity.this;
            kWebLoadingAnimationActivity.runOnUiThread(new Runnable() { // from class: com.kubi.user.hybrid.e
                @Override // java.lang.Runnable
                public final void run() {
                    KWebLoadingAnimationActivity.C26712a.m65496h(kWebLoadingAnimationActivity);
                }
            });
            C44128b.m97259c("KWebLoadingAnimationActivityTAG", "onTimeOut");
        }

        /* JADX INFO: renamed from: h */
        public static final void m65496h(KWebLoadingAnimationActivity kWebLoadingAnimationActivity) {
            if (!kWebLoadingAnimationActivity.m65493U0()) {
                kWebLoadingAnimationActivity.m65494V0();
            }
        }
    }

    @Override // com.kubi.widget.web.ui.KWebBaseActivity, com.kubi.sdk.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        setResult(-1);
        super.onBackPressed();
    }

    /* JADX INFO: renamed from: V0 */
    public final void m65494V0() {
        if (this.f53670u) {
            return;
        }
        try {
            KWebContainer kWebContainerM67451l0 = m67451l0();
            FrameLayout frameLayout = this.f53669t;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadingViewContainer");
                frameLayout = null;
            }
            kWebContainerM67451l0.removeView(frameLayout);
            this.f53670u = true;
        } catch (Exception e11) {
            C44128b.m97261e("KWebLoadingAnimationActivityTAG", "removeLoadingView error: " + e11.getMessage());
        }
    }

    @Override // com.kubi.widget.web.ui.KWebBaseActivity
    @NotNull
    /* JADX INFO: renamed from: m0 */
    public KWebUIConfig mo14852m0() {
        KWebUIConfig.C27229a c27229a = new KWebUIConfig.C27229a();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        c27229a.m67532c(Uri.parse(RouteExKt.m56282x(intent, "url", "")));
        c27229a.m67531b(!DayNightThemeManager.f28592a.m33187l());
        return c27229a.m67530a();
    }

    @Override // com.kubi.widget.web.ui.KWebBaseActivity
    /* JADX INFO: renamed from: O0 */
    public void mo14848O0() {
        KWebView f55267b = m67451l0().getF55267b();
        if (f55267b != null) {
            f55267b.m58567g(10L);
        }
        super.mo14848O0();
    }

    /* JADX INFO: renamed from: U0 */
    public final boolean m65493U0() {
        if (!isFinishing() && !isDestroyed()) {
            return false;
        }
        return true;
    }

    @Override // com.kubi.widget.web.ui.KWebBaseActivity, com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        int i11;
        super.onCreate(savedInstanceState);
        C44128b.m97266j(BaseActivity.WEB_DEBUG_TAG, "child onCreate activity=" + KWebLoadingAnimationActivity.class.getName());
        ImageView imageView = new ImageView(this);
        C11352b.m20197a(imageView);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C5275i0.m6236a(40.0f), C5275i0.m6236a(40.0f));
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(this);
        Context context = frameLayout.getContext();
        if (DayNightThemeManager.f28592a.m33187l()) {
            i11 = R$color.kweb_background_light;
        } else {
            i11 = R$color.kweb_background_dark;
        }
        frameLayout.setBackgroundColor(ContextCompat.getColor(context, i11));
        this.f53669t = frameLayout;
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(C5275i0.m6236a(40.0f), C5275i0.m6236a(40.0f), 17));
        KWebContainer kWebContainerM67451l0 = m67451l0();
        FrameLayout frameLayout2 = this.f53669t;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingViewContainer");
            frameLayout2 = null;
        }
        kWebContainerM67451l0.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        m67451l0().setLoadingListener(new C26712a());
    }

    @Override // com.kubi.widget.web.ui.KWebBaseActivity, com.kubi.sdk.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        m67451l0().m67494o();
        super.onDestroy();
    }

    @Override // com.kubi.widget.web.ui.KWebBaseActivity
    /* JADX INFO: renamed from: u0 */
    public void mo14853u0(@NotNull KWebView webView) {
        InterfaceC37042a imageFileChooser;
        Intrinsics.checkNotNullParameter(webView, "webView");
        super.mo14853u0(webView);
        webView.setWebPermission(new WebPermissionsHelper(this, false, 2, null));
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        if (RouteExKt.m56248g(intent, "is_out_file", false)) {
            imageFileChooser = new OutFileChooser(this);
        } else {
            imageFileChooser = new ImageFileChooser(this);
        }
        webView.setFileChooser(imageFileChooser);
        m67451l0().m67499x(this);
    }
}
