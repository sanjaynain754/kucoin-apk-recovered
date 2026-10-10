package com.kubi.agora;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.media.ImageReader;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Surface;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import com.blankj.utilcode.util.C5283m0;
import com.kubi.agora.jsbridge.handlers.AgoraKnbJsEventHandler;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.kweb.p093ui.KWebActivity;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.web.KWebView;
import com.kubi.utils.extensions.C27046k;
import com.kubi.widget.web.ui.KWebContainer;
import com.kubi.widget.web.ui.KWebUIConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import s80.C44363a;

/* JADX INFO: compiled from: AgoraScreenShareWebActivity.kt */
/* JADX INFO: loaded from: classes63.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u0010\u001a\u00020\fH\u0014J\u0012\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0015J\b\u0010\u0014\u001a\u00020\fH\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\fH\u0014J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\fH\u0016J\b\u0010\u001a\u001a\u00020\fH\u0002J\b\u0010\u001b\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/agora/AgoraScreenShareWebActivity;", "Lcom/kubi/kweb/ui/KWebActivity;", "<init>", "()V", "isReuseFloatWeb", "", "mediaProjectionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "overlayPermissionLauncher", "initWebView", "", "webView", "Lcom/kubi/sdk/web/KWebView;", "addAllHandlers", "startLoad", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "bindFlowEvent", "getWebUIConfig", "Lcom/kubi/widget/web/ui/KWebUIConfig;", "onDestroy", "interceptWebContainerDestroy", "onBackPressed", "backToFloat", "goBackWithFloatingWebView", "Companion", "AgoraLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAgoraScreenShareWebActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgoraScreenShareWebActivity.kt\ncom/kubi/agora/AgoraScreenShareWebActivity\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,196:1\n153#2,7:197\n153#2,7:204\n*S KotlinDebug\n*F\n+ 1 AgoraScreenShareWebActivity.kt\ncom/kubi/agora/AgoraScreenShareWebActivity\n*L\n107#1:197,7\n125#1:204,7\n*E\n"})
public final class AgoraScreenShareWebActivity extends KWebActivity {

    /* JADX INFO: renamed from: x */
    @NotNull
    public static final Companion f15187x = new Companion(null);

    /* JADX INFO: renamed from: u */
    public boolean f15188u;

    /* JADX INFO: renamed from: v */
    @NotNull
    public final ActivityResultLauncher<Intent> f15189v;

    /* JADX INFO: renamed from: w */
    @NotNull
    public final ActivityResultLauncher<Intent> f15190w;

    /* JADX INFO: compiled from: AgoraScreenShareWebActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/agora/AgoraScreenShareWebActivity$Companion;", "", "<init>", "()V", "TAG", "", "jumpToAgoraScreenSharePage", "", "url", "AgoraLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ void jumpToAgoraScreenSharePage$default(Companion companion, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = null;
            }
            companion.jumpToAgoraScreenSharePage(str);
        }

        public final void jumpToAgoraScreenSharePage(@Nullable String url) {
            C44128b.m97259c("AgoraScreenShareWebActivity", "[jumpToAgoraScreenSharePage] url:" + url);
            Context applicationContext = BaseApplication.INSTANCE.get().getApplicationContext();
            Intent intent = new Intent(applicationContext, (Class<?>) AgoraScreenShareWebActivity.class);
            if (url != null) {
                intent.putExtra("url", url);
            }
            intent.addFlags(268435456);
            applicationContext.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: com.kubi.agora.AgoraScreenShareWebActivity$a */
    /* JADX INFO: compiled from: AgoraScreenShareWebActivity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class RunnableC9376a implements Runnable {
        public RunnableC9376a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ScreenCaptureHelper screenCaptureHelperM14917k;
            AgoraShareScreenManager agoraShareScreenManager = AgoraShareScreenManager.f15305a;
            AgoraScreenShareWebActivity agoraScreenShareWebActivity = AgoraScreenShareWebActivity.this;
            agoraShareScreenManager.m14919m();
            agoraShareScreenManager.m14928z();
            ImageReader imageReaderM14915i = agoraShareScreenManager.m14915i();
            if (imageReaderM14915i == null || (screenCaptureHelperM14917k = agoraShareScreenManager.m14917k()) == null) {
                return;
            }
            Surface surface = imageReaderM14915i.getSurface();
            Intrinsics.checkNotNullExpressionValue(surface, "getSurface(...)");
            Intent intentM14875h = screenCaptureHelperM14917k.m14875h(surface, agoraShareScreenManager.m14914h());
            if (intentM14875h != null) {
                agoraScreenShareWebActivity.f15189v.launch(intentM14875h);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.agora.AgoraScreenShareWebActivity$b */
    /* JADX INFO: compiled from: AgoraScreenShareWebActivity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class RunnableC9377b implements Runnable {
        public RunnableC9377b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AgoraScreenShareWebActivity.this.m14849X0();
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public static final void m14844Y0(AgoraScreenShareWebActivity agoraScreenShareWebActivity) {
        ScreenCaptureService.Companion companion = ScreenCaptureService.f15296c;
        if (companion.canDrawOverlays(agoraScreenShareWebActivity)) {
            agoraScreenShareWebActivity.m14850a1();
        } else {
            agoraScreenShareWebActivity.f15190w.launch(companion.overlayPermissionIntent(agoraScreenShareWebActivity));
        }
    }

    /* JADX INFO: renamed from: Z0 */
    private final void m14845Z0() {
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "com.kubi.screen.share.Event:startScreenShare".length();
        }
        C12572a.m23692a(this, false, new C9378x624e704d("com.kubi.screen.share.Event:startScreenShare", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.screen.share.Event:startToFloating".length();
        }
        C12572a.m23692a(this, false, new C9379x624e704e("com.kubi.screen.share.Event:startToFloating", null, this));
    }

    /* JADX INFO: renamed from: b1 */
    public static final void m14846b1(ActivityResult activityResult) {
        C44128b.m97259c("AgoraScreenShareWebActivity", "[mediaProjectionLauncher] result:" + activityResult);
        ScreenCaptureHelper screenCaptureHelperM14917k = AgoraShareScreenManager.f15305a.m14917k();
        if (screenCaptureHelperM14917k != null) {
            screenCaptureHelperM14917k.m14872e(1001, activityResult.getResultCode(), activityResult.getData());
        }
    }

    /* JADX INFO: renamed from: c1 */
    public static final void m14847c1(AgoraScreenShareWebActivity agoraScreenShareWebActivity, ActivityResult activityResult) {
        if (ScreenCaptureService.f15296c.canDrawOverlays(agoraScreenShareWebActivity)) {
            agoraScreenShareWebActivity.m14850a1();
        } else {
            C5283m0.m6288o(R$string.kc_screen_share_need_float_permission);
        }
    }

    @Override // com.kubi.widget.web.ui.KWebBaseActivity
    /* JADX INFO: renamed from: O0 */
    public void mo14848O0() {
        if (this.f15188u) {
            return;
        }
        super.mo14848O0();
    }

    /* JADX INFO: renamed from: X0 */
    public final void m14849X0() {
        runOnUiThread(new Runnable() { // from class: com.kubi.agora.a
            @Override // java.lang.Runnable
            public final void run() {
                AgoraScreenShareWebActivity.m14844Y0(this.f15302b);
            }
        });
    }

    /* JADX INFO: renamed from: a1 */
    public final void m14850a1() {
        ViewGroup viewGroup = (ViewGroup) findViewById(R$id.web_page_container);
        if (viewGroup != null && m67451l0().getParent() == viewGroup) {
            viewGroup.removeView(m67451l0());
        }
        AgoraShareScreenManager.f15305a.m14924s(m67451l0());
        ScreenCaptureService.f15296c.startFloatingWithWebView();
        finish();
    }

    @Override // com.kubi.widget.web.ui.KWebBaseActivity
    /* JADX INFO: renamed from: e0 */
    public void mo14851e0(@NotNull KWebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        C44363a.f98027a.m97857a(webView, this, new AgoraKnbJsEventHandler(this, webView));
    }

    @Override // com.kubi.widget.web.ui.KWebBaseActivity
    @Nullable
    /* JADX INFO: renamed from: m0 */
    public KWebUIConfig mo14852m0() {
        return this.f15188u ? m67451l0().getF55279n() : super.mo14852m0();
    }

    @Override // com.kubi.widget.web.ui.KWebBaseActivity, com.kubi.sdk.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (AgoraShareScreenManager.f15305a.m14920n()) {
            m14849X0();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.kubi.widget.web.ui.KWebBaseActivity, com.kubi.sdk.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        AgoraShareScreenManager agoraShareScreenManager = AgoraShareScreenManager.f15305a;
        if (!agoraShareScreenManager.m14920n()) {
            agoraShareScreenManager.m14926w();
        }
        super.onDestroy();
    }

    @Override // com.kubi.kweb.p093ui.KWebActivity, com.kubi.widget.web.ui.KWebBaseActivity
    /* JADX INFO: renamed from: u0 */
    public void mo14853u0(@NotNull KWebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        KWebContainer kWebContainerM14918l = AgoraShareScreenManager.f15305a.m14918l();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[initWebView] kWebContainer is null :");
        sb2.append(kWebContainerM14918l == null);
        C44128b.m97259c("AgoraScreenShareWebActivity", sb2.toString());
        if (kWebContainerM14918l == null) {
            super.mo14853u0(webView);
            return;
        }
        this.f15188u = true;
        if (kWebContainerM14918l.getParent() != null) {
            ViewParent parent = kWebContainerM14918l.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(kWebContainerM14918l);
            }
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R$id.web_page_container);
        linearLayout.removeView(m67451l0());
        linearLayout.addView(kWebContainerM14918l, new ViewGroup.LayoutParams(-1, -1));
        m67440M0(kWebContainerM14918l);
        ScreenCaptureService.Companion companion = ScreenCaptureService.f15296c;
        if (companion.isFloatWindowShowing()) {
            companion.stopFloating();
        }
        KWebView webView2 = m67451l0().getF55267b();
        if (webView2 != null) {
            C44363a.f98027a.m97859c(webView2);
            super.mo14853u0(webView2);
        } else {
            C44128b.m97261e("AgoraScreenShareWebActivity", "[initWebView] webContainer.webView is null");
            super.mo14853u0(webView);
        }
    }

    @Override // com.kubi.widget.web.ui.KWebBaseActivity
    /* JADX INFO: renamed from: v0 */
    public boolean mo14854v0() {
        return AgoraShareScreenManager.f15305a.m14920n();
    }

    public AgoraScreenShareWebActivity() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.kubi.agora.b
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                AgoraScreenShareWebActivity.m14846b1((ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f15189v = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.kubi.agora.c
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                AgoraScreenShareWebActivity.m14847c1(this.f15303a, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.f15190w = activityResultLauncherRegisterForActivityResult2;
    }

    @Override // com.kubi.widget.web.ui.KWebBaseActivity, com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"SetJavaScriptEnabled"})
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView.setWebContentsDebuggingEnabled(false);
        m14845Z0();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        AgoraShareScreenManager.f15305a.m14911A(displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.densityDpi);
        if (this.f15188u) {
            getNavigationBar().m54692c();
            KWebView webView = m67451l0().getF55267b();
            if (webView != null) {
                C27046k.m66685H(webView);
            }
        }
    }
}
