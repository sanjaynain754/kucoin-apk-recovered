package com.kubi.widget.web.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import androidx.credentials.provider.CredentialEntry;
import com.blankj.utilcode.util.C5270g;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.event.api.C12572a;
import com.kubi.p110rn.RNConstantKt;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.web.KWebView;
import com.kubi.sdk.web.core.InterfaceC24304b;
import com.kubi.sdk.web.core.WebLoadError;
import com.kubi.sdk.web.util.C24329b;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.kubi.widget.web.R$color;
import com.kubi.widget.web.R$drawable;
import com.kubi.widget.web.R$id;
import com.kubi.widget.web.R$layout;
import com.kubi.widget.web.R$string;
import com.kubi.widget.web.exception.KWebWidgetException;
import com.kubi.widget.web.helper.ImageSaveHelper;
import com.kubi.widget.web.service.IKWebService;
import com.kubi.widget.web.service.KWebService;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.reflect.Type;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p569qq.C43840a;
import p569qq.C43846g;
import p694vk.C45590s;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import t80.C44709g;
import z00.InterfaceC46619a;
import z00.InterfaceC46620b;

/* JADX INFO: compiled from: KWebContainer.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 g2\u00020\u0001:\u0003ghiB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0006\u00106\u001a\u00020+J\u000e\u00107\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%J\u0010\u00108\u001a\u00020+2\u0006\u00109\u001a\u00020\u0016H\u0002J\u000e\u0010:\u001a\u00020\u00162\u0006\u0010;\u001a\u00020<J\u0016\u0010=\u001a\u00020\u00162\u0006\u0010;\u001a\u00020<H\u0086@¢\u0006\u0002\u0010>J\u0006\u0010?\u001a\u00020\u0016J\u000e\u0010@\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010AJ,\u0010B\u001a\u00020\u00162\u001c\u0010C\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0E\u0012\u0006\u0012\u0004\u0018\u00010F0DH\u0086@¢\u0006\u0002\u0010GJ\u000e\u0010H\u001a\u00020+H\u0086@¢\u0006\u0002\u0010AJ\b\u0010I\u001a\u00020\u0016H\u0002J\u0016\u0010J\u001a\u00020+2\u0006\u0010;\u001a\u00020<H\u0082@¢\u0006\u0002\u0010>J\u0014\u0010K\u001a\u00020+2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020+0*J\b\u0010M\u001a\u00020\u0016H\u0007J\u0016\u0010N\u001a\u00020+2\u000e\u0010O\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*J\u000e\u0010P\u001a\u00020+2\u0006\u0010Q\u001a\u00020\u0018J\u0006\u0010R\u001a\u00020+J\u0016\u0010S\u001a\u00020\u00162\f\u0010L\u001a\b\u0012\u0004\u0012\u00020+0*H\u0002J\u000e\u0010T\u001a\u00020+2\u0006\u0010\u0002\u001a\u00020UJ\u000e\u0010V\u001a\u00020+2\u0006\u0010\u0002\u001a\u00020UJ\u0006\u0010W\u001a\u00020+J\b\u0010X\u001a\u00020\u0016H\u0002J\u0010\u0010Y\u001a\u00020+2\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010Z\u001a\u00020+2\u0006\u0010[\u001a\u00020<H\u0002J\u0010\u0010\\\u001a\u00020+2\u0006\u0010]\u001a\u00020\u0016H\u0002J\b\u0010^\u001a\u00020 H\u0002J\f\u0010_\u001a\u00020+*\u00020`H\u0002J\u0006\u0010a\u001a\u00020\u0016J\b\u0010b\u001a\u00020+H\u0002J\u0012\u0010c\u001a\u00020\u00162\b\u0010d\u001a\u0004\u0018\u00010eH\u0002J\u0006\u0010f\u001a\u00020+R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001e\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020%@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\"\u0010)\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00100\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\"\u00103\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010-\"\u0004\b5\u0010/¨\u0006j"}, m90084d2 = {"Lcom/kubi/widget/web/ui/KWebContainer;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "webView", "Lcom/kubi/sdk/web/KWebView;", "getWebView", "()Lcom/kubi/sdk/web/KWebView;", "loadingView", "disableSceneHelper", "Lcom/kubi/widget/web/ui/KWebContainer$DisableSceneHelper;", "imageSaveHelper", "Lcom/kubi/widget/web/helper/ImageSaveHelper;", "isNotFoundShowFailedUi", "", "viewListener", "Lcom/kubi/sdk/web/listener/IViewLoadingListener;", "isRenderProcessGone", "isDestroying", "isWarmupHit", "hasMarkedWarmupConsumed", "hasReportedLoadTerminal", "immersiveBackButtonLazy", "Lkotlin/Lazy;", "Landroid/widget/ImageButton;", "immersiveBackButton", "getImmersiveBackButton", "()Landroid/widget/ImageButton;", "value", "Lcom/kubi/widget/web/ui/KWebUIConfig;", "config", "getConfig", "()Lcom/kubi/widget/web/ui/KWebUIConfig;", "onReload", "Lkotlin/Function0;", "", "getOnReload$LWebWidget_googleRelease", "()Lkotlin/jvm/functions/Function0;", "setOnReload$LWebWidget_googleRelease", "(Lkotlin/jvm/functions/Function0;)V", "onLoadSuccess", "getOnLoadSuccess$LWebWidget_googleRelease", "setOnLoadSuccess$LWebWidget_googleRelease", RNConstantKt.SEND_PAGE_MOUNT, "getOnPageMount$LWebWidget_googleRelease", "setOnPageMount$LWebWidget_googleRelease", "disableNotFoundShowFailedUi", "updateConfig", "perInitColor", "dark", "loadUrl", "url", "", "loadUrlWithSessionReady", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "loadWithSessionReady", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadTemplate", "htmlMaker", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestBySsg", "canLoad", "waitForSessionReady", "onBackPressed", "goBackAction", "tryHideWhiteContainer", "setOnReload", "onReloadListener", "setLoadingListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "clearLoadingListener", "goBack", "initDisableDialog", "Lcom/kubi/sdk/BaseActivity;", "initImageSaveHelper", "onDestroy", "shouldShowImmersiveBackButton", "markWarmupConsumedBeforeFirstLoad", "reportLoadTerminal", "reason", "updateImmersiveBackButton", TIMPushProvider.f75062n, "createImmersiveBackButton", "removeFromParent", "Landroid/view/View;", "canDispatchLifecycleEvent", "installRenderProcessGoneGuardIfNeeded", "handleRenderProcessGone", C33556b3.f68963J, "Landroid/webkit/RenderProcessGoneDetail;", "offDisableScene", "Companion", "LoadingListener", "DisableSceneHelper", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKWebContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KWebContainer.kt\ncom/kubi/widget/web/ui/KWebContainer\n+ 2 KWebIssue.kt\ncom/kubi/widget/web/exception/KWebIssueKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,809:1\n46#2,6:810\n35#3,4:816\n39#3:822\n35#3,4:824\n39#3:830\n44#4,2:820\n44#4,2:828\n1#5:823\n*S KotlinDebug\n*F\n+ 1 KWebContainer.kt\ncom/kubi/widget/web/ui/KWebContainer\n*L\n138#1:810,6\n478#1:816,4\n478#1:822\n578#1:824,4\n578#1:830\n478#1:820,2\n578#1:828,2\n*E\n"})
public final class KWebContainer extends FrameLayout {

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final Companion f55266r = new Companion(null);

    /* JADX INFO: renamed from: b */
    @Nullable
    public final KWebView f55267b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final FrameLayout f55268c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public C27224b f55269d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public ImageSaveHelper f55270e;

    /* JADX INFO: renamed from: f */
    public boolean f55271f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public InterfaceC46620b f55272g;

    /* JADX INFO: renamed from: h */
    public boolean f55273h;

    /* JADX INFO: renamed from: i */
    public boolean f55274i;

    /* JADX INFO: renamed from: j */
    public boolean f55275j;

    /* JADX INFO: renamed from: k */
    public boolean f55276k;

    /* JADX INFO: renamed from: l */
    public boolean f55277l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final Lazy<ImageButton> f55278m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public KWebUIConfig f55279n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public Function0<Unit> f55280o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public Function0<Unit> f55281p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public Function0<Unit> f55282q;

    /* JADX INFO: compiled from: KWebContainer.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/widget/web/ui/KWebContainer$Companion;", "", "<init>", "()V", "TAG", "", "IS_NOT_FOUND", "", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.widget.web.ui.KWebContainer$a */
    /* JADX INFO: compiled from: KWebContainer.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/widget/web/ui/KWebContainer$2", "Lcom/kubi/sdk/web/core/FullscreenListener;", "onEnterFullscreen", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", TUIConstants.TUIChat.CALL_BACK, "Landroid/webkit/WebChromeClient$CustomViewCallback;", "onExitFullscreen", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C27223a implements InterfaceC24304b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f55283a;

        @Override // com.kubi.sdk.web.core.InterfaceC24304b
        /* JADX INFO: renamed from: a */
        public void mo58688a() {
            C12572a.m23695d("exit_full_screen", null, 0L, 6, null);
            KWebService.f55235b.mo67354a("onExitFullscreen");
        }

        public C27223a(Context context) {
            this.f55283a = context;
        }

        @Override // com.kubi.sdk.web.core.InterfaceC24304b
        /* JADX INFO: renamed from: b */
        public void mo58689b(View view, WebChromeClient.CustomViewCallback callback) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(callback, "callback");
            KWebService.f55235b.mo67354a("onEnterFullscreen");
            this.f55283a.startActivity(new Intent(this.f55283a, (Class<?>) KWebFullScreenVideoActivity.class));
        }
    }

    /* JADX INFO: renamed from: com.kubi.widget.web.ui.KWebContainer$b */
    /* JADX INFO: compiled from: KWebContainer.kt */
    @Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/widget/web/ui/KWebContainer$DisableSceneHelper;", "Lcom/kubi/sdk/web/listener/IDisableSceneListener;", "activity", "Lcom/kubi/sdk/BaseActivity;", "webContainer", "Lcom/kubi/widget/web/ui/KWebContainer;", "<init>", "(Lcom/kubi/sdk/BaseActivity;Lcom/kubi/widget/web/ui/KWebContainer;)V", "whiteContainer", "Landroid/view/ViewGroup;", "urlText", "Landroid/widget/TextView;", "button", "lastWhiteCheckTime", "", "title", "", "onChangeUrlDisable", "", "url", "showWhiteContainer", "hideWhiteContainer", "tryHide", "", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C27224b implements InterfaceC46619a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final BaseActivity f55284a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final KWebContainer f55285b;

        /* JADX INFO: renamed from: c */
        @NotNull
        public final ViewGroup f55286c;

        /* JADX INFO: renamed from: d */
        @NotNull
        public final TextView f55287d;

        /* JADX INFO: renamed from: e */
        @NotNull
        public final TextView f55288e;

        /* JADX INFO: renamed from: f */
        public long f55289f;

        /* JADX INFO: renamed from: g */
        @NotNull
        public String f55290g;

        public C27224b(@NotNull BaseActivity activity, @NotNull KWebContainer webContainer) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(webContainer, "webContainer");
            this.f55284a = activity;
            this.f55285b = webContainer;
            View viewFindViewById = webContainer.findViewById(R$id.white_container);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f55286c = (ViewGroup) viewFindViewById;
            View viewFindViewById2 = webContainer.findViewById(R$id.tv_url);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.f55287d = (TextView) viewFindViewById2;
            View viewFindViewById3 = webContainer.findViewById(R$id.tv_go_on);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.f55288e = (TextView) viewFindViewById3;
            this.f55290g = "";
        }

        /* JADX INFO: renamed from: f */
        public static final Unit m67504f(final String str, final C27224b c27224b) {
            C24329b.f48558a.m58864d("extBrowser", "url:" + str);
            c27224b.f55289f = System.currentTimeMillis();
            c27224b.m67507d();
            c27224b.f55284a.onBackPressed();
            C27100x0.m66924e(new Function0() { // from class: com.kubi.widget.web.ui.v
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KWebContainer.C27224b.m67505g(str, c27224b);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: g */
        public static final Unit m67505g(String str, C27224b c27224b) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(524288);
            c27224b.f55284a.startActivity(intent);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: d */
        public final void m67507d() {
            if (this.f55290g.length() > 0) {
                BaseActivity baseActivity = this.f55284a;
                if (baseActivity instanceof KWebBaseActivity) {
                    ((KWebBaseActivity) baseActivity).getNavigationBar().setTitle(this.f55290g);
                }
            }
            ViewExtKt.m66577h(this.f55286c);
        }

        /* JADX INFO: renamed from: e */
        public final void m67508e(final String str) {
            BaseActivity baseActivity = this.f55284a;
            if (baseActivity instanceof KWebBaseActivity) {
                NavigationBar navigationBar = ((KWebBaseActivity) baseActivity).getNavigationBar();
                String titleText = navigationBar.getTitleText();
                Intrinsics.checkNotNullExpressionValue(titleText, "getTitleText(...)");
                this.f55290g = titleText;
                navigationBar.setTitle(this.f55284a.getString(R$string.web_safe_center));
            }
            C27046k.m66685H(this.f55286c);
            this.f55287d.setText(str);
            C27046k.m66710y(this.f55288e, 300L, new Function0() { // from class: com.kubi.widget.web.ui.u
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KWebContainer.C27224b.m67504f(str, this);
                }
            });
        }

        /* JADX INFO: renamed from: h */
        public final boolean m67509h() {
            if (!C27046k.m66704s(this.f55286c)) {
                return false;
            }
            m67507d();
            return true;
        }

        @Override // z00.InterfaceC46619a
        /* JADX INFO: renamed from: a */
        public void mo67506a(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            if (System.currentTimeMillis() - this.f55289f > 2000) {
                m67508e(url);
            } else {
                m67507d();
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.widget.web.ui.KWebContainer$c */
    /* JADX INFO: compiled from: KWebContainer.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J(\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0002J\b\u0010\u0016\u001a\u00020\u0005H\u0002¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/widget/web/ui/KWebContainer$LoadingListener;", "Lcom/kubi/sdk/web/listener/IViewLoadingListener;", "<init>", "(Lcom/kubi/widget/web/ui/KWebContainer;)V", "onLoadStart", "", "onTimeOut", "onProgressChanged", "progress", "", "onLoadSuccess", "onMount", "pageType", "", "dclTime", "", "currentProjectName", "currentProjectVersion", "onLoadFailed", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/kubi/sdk/web/core/WebLoadError;", "showLoadFailed", "reload", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C27225c implements InterfaceC46620b {
        public C27225c() {
        }

        @Override // z00.InterfaceC46620b
        /* JADX INFO: renamed from: b */
        public void mo65498b(int i11) {
            View childAt = KWebContainer.this.f55268c.getChildAt(0);
            if (childAt instanceof ProgressBar) {
                ((ProgressBar) childAt).setProgress(i11);
            }
            InterfaceC46620b interfaceC46620b = KWebContainer.this.f55272g;
            if (interfaceC46620b != null) {
                interfaceC46620b.mo65498b(i11);
            }
        }

        @Override // z00.InterfaceC46620b
        /* JADX INFO: renamed from: c */
        public void mo65499c() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[page] onLoadSuccess target=");
            sb2.append(KWebContainer.this.getF55279n().getF55296a());
            sb2.append(", current=");
            KWebView f55267b = KWebContainer.this.getF55267b();
            sb2.append(f55267b != null ? f55267b.getUrl() : null);
            C43840a.m96550d(sb2.toString(), "KWebContainer");
            KWebContainer.this.m67485M("success");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("onLoadSuccess target=");
            sb3.append(KWebContainer.this.getF55279n().getF55296a());
            sb3.append(" current=");
            KWebView f55267b2 = KWebContainer.this.getF55267b();
            sb3.append(f55267b2 != null ? f55267b2.getUrl() : null);
            C44128b.m97266j(BaseActivity.WEB_DEBUG_TAG, sb3.toString());
            KWebContainer.this.f55268c.removeAllViews();
            ViewExtKt.m66577h(KWebContainer.this.f55268c);
            KWebContainer.this.m67490R(false);
            KWebView f55267b3 = KWebContainer.this.getF55267b();
            if (f55267b3 != null) {
                ViewExtKt.m66594y(f55267b3);
            }
            Function0<Unit> onLoadSuccess$LWebWidget_googleRelease = KWebContainer.this.getOnLoadSuccess$LWebWidget_googleRelease();
            if (onLoadSuccess$LWebWidget_googleRelease != null) {
                onLoadSuccess$LWebWidget_googleRelease.invoke();
            }
            InterfaceC46620b interfaceC46620b = KWebContainer.this.f55272g;
            if (interfaceC46620b != null) {
                interfaceC46620b.mo65499c();
            }
        }

        @Override // z00.InterfaceC46620b
        /* JADX INFO: renamed from: d */
        public void mo65500d() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[page] onLoadStart target=");
            sb2.append(KWebContainer.this.getF55279n().getF55296a());
            sb2.append(", current=");
            KWebView f55267b = KWebContainer.this.getF55267b();
            sb2.append(f55267b != null ? f55267b.getUrl() : null);
            C43840a.m96550d(sb2.toString(), "KWebContainer");
            int iM67522f = KWebContainer.this.getF55279n().getF55299d();
            WebViewLoadHelper webViewLoadHelper = WebViewLoadHelper.f55331a;
            Context context = KWebContainer.this.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            View viewM67558d = webViewLoadHelper.m67558d(context, iM67522f);
            KWebContainer.this.f55268c.removeAllViews();
            KWebContainer.this.f55268c.addView(viewM67558d);
            if (iM67522f == 0) {
                ViewExtKt.m66577h(KWebContainer.this.f55268c);
            } else if (iM67522f == 1) {
                KWebContainer.this.f55268c.setBackgroundColor(ContextCompat.getColor(KWebContainer.this.getContext(), KWebContainer.this.getF55279n().getF55301f() ? R$color.kweb_background_dark : R$color.kweb_background_light));
            } else if (iM67522f == 2) {
                KWebContainer.this.f55268c.setBackgroundColor(ContextCompat.getColor(KWebContainer.this.getContext(), KWebContainer.this.getF55279n().getF55301f() ? R$color.kweb_background_dark : R$color.kweb_background_light));
            }
            KWebContainer.this.m67490R(iM67522f != 0);
            InterfaceC46620b interfaceC46620b = KWebContainer.this.f55272g;
            if (interfaceC46620b != null) {
                interfaceC46620b.mo65500d();
            }
        }

        @Override // z00.InterfaceC46620b
        /* JADX INFO: renamed from: e */
        public void mo65501e(@NotNull WebLoadError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[page] onLoadFailed target=");
            sb2.append(KWebContainer.this.getF55279n().getF55296a());
            sb2.append(", current=");
            KWebView f55267b = KWebContainer.this.getF55267b();
            sb2.append(f55267b != null ? f55267b.getUrl() : null);
            sb2.append(", error=");
            sb2.append(error);
            C43840a.m96548b(sb2.toString(), "KWebContainer");
            KWebContainer.this.m67485M("failed");
            m67513i();
            if (C45590s.f102687a.m100666Q()) {
                ToastCompat.m66441G(error.getRequestUri() + ':' + error.getCom.tencent.qcloud.tuicore.TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION java.lang.String(), new Object[0]);
            }
            InterfaceC46620b interfaceC46620b = KWebContainer.this.f55272g;
            if (interfaceC46620b != null) {
                interfaceC46620b.mo65501e(error);
            }
        }

        @Override // z00.InterfaceC46620b
        /* JADX INFO: renamed from: f */
        public void mo65502f() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[page] onTimeOut target=");
            sb2.append(KWebContainer.this.getF55279n().getF55296a());
            sb2.append(", current=");
            KWebView f55267b = KWebContainer.this.getF55267b();
            sb2.append(f55267b != null ? f55267b.getUrl() : null);
            C43840a.m96548b(sb2.toString(), "KWebContainer");
            KWebContainer.this.m67485M("timeout");
            m67513i();
            if (C45590s.f102687a.m100666Q()) {
                ToastCompat.m66441G(KWebContainer.this.getF55279n().getF55296a() + " timeout", new Object[0]);
            }
            InterfaceC46620b interfaceC46620b = KWebContainer.this.f55272g;
            if (interfaceC46620b != null) {
                interfaceC46620b.mo65502f();
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m67512h() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[page] reload target=");
            sb2.append(KWebContainer.this.getF55279n().getF55296a());
            sb2.append(", current=");
            KWebView f55267b = KWebContainer.this.getF55267b();
            sb2.append(f55267b != null ? f55267b.getUrl() : null);
            C43840a.m96550d(sb2.toString(), "KWebContainer");
            KWebView f55267b2 = KWebContainer.this.getF55267b();
            if (f55267b2 != null) {
                f55267b2.m58557B(this);
            }
            KWebView f55267b3 = KWebContainer.this.getF55267b();
            if (f55267b3 != null) {
                f55267b3.m58563c(KWebContainer.this.new C27225c());
            }
            Function0<Unit> onReload$LWebWidget_googleRelease = KWebContainer.this.getOnReload$LWebWidget_googleRelease();
            if (onReload$LWebWidget_googleRelease != null) {
                onReload$LWebWidget_googleRelease.invoke();
            }
        }

        /* JADX INFO: renamed from: i */
        public final void m67513i() {
            C44128b.m97266j(BaseActivity.WEB_DEBUG_TAG, "showLoadFailed url=" + KWebContainer.this.getF55279n().getF55296a() + " transparentTitle=" + KWebContainer.this.getF55279n().getF55304i() + " fullScreen=" + KWebContainer.this.getF55279n().getF55297b().getBooleanQueryParameter("fullScreen", false));
            KWebContainer.this.f55268c.removeAllViews();
            FrameLayout frameLayout = KWebContainer.this.f55268c;
            WebViewLoadHelper webViewLoadHelper = WebViewLoadHelper.f55331a;
            Context context = KWebContainer.this.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            frameLayout.addView(webViewLoadHelper.m67557b(context, new Function0() { // from class: com.kubi.widget.web.ui.w
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KWebContainer.C27225c.m67511j(this.f55348b);
                }
            }));
            KWebContainer.this.m67490R(true);
        }

        /* JADX INFO: renamed from: j */
        public static final Unit m67511j(C27225c c27225c) {
            c27225c.m67512h();
            return Unit.INSTANCE;
        }

        @Override // z00.InterfaceC46620b
        /* JADX INFO: renamed from: a */
        public void mo65497a(@NotNull String pageType, double d11, @NotNull String currentProjectName, @NotNull String currentProjectVersion) {
            Intrinsics.checkNotNullParameter(pageType, "pageType");
            Intrinsics.checkNotNullParameter(currentProjectName, "currentProjectName");
            Intrinsics.checkNotNullParameter(currentProjectVersion, "currentProjectVersion");
            C44128b.m97259c("KWebContainer", "onMount: pageType=" + pageType + ", dclTime=" + d11 + ", currentProjectName=" + currentProjectName + ", currentProjectVersion=" + currentProjectVersion);
            Function0<Unit> onPageMount$LWebWidget_googleRelease = KWebContainer.this.getOnPageMount$LWebWidget_googleRelease();
            if (onPageMount$LWebWidget_googleRelease != null) {
                onPageMount$LWebWidget_googleRelease.invoke();
            }
            InterfaceC46620b interfaceC46620b = KWebContainer.this.f55272g;
            if (interfaceC46620b != null) {
                interfaceC46620b.mo65497a(pageType, d11, currentProjectName, currentProjectVersion);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.widget.web.ui.KWebContainer$d */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C27226d extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.widget.web.ui.KWebContainer$e */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C27227e extends TypeToken<Boolean> {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KWebContainer(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: o */
    public final void m67494o() {
        this.f55272g = null;
    }

    /* JADX INFO: renamed from: r */
    public final void m67496r() {
        this.f55271f = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KWebContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m67458H(Ref.IntRef intRef, KWebContainer kWebContainer) {
        intRef.element = kWebContainer.f55267b.copyBackForwardList().getSize();
        return Unit.INSTANCE;
    }

    private final ImageButton getImmersiveBackButton() {
        return this.f55278m.getValue();
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m67474v() {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: B */
    public final Object m67476B(@NotNull Function1<? super Continuation<? super String>, ? extends Object> function1, @NotNull Continuation<? super Boolean> continuation) {
        KWebContainer$loadTemplate$1 kWebContainer$loadTemplate$1;
        if (continuation instanceof KWebContainer$loadTemplate$1) {
            kWebContainer$loadTemplate$1 = (KWebContainer$loadTemplate$1) continuation;
            int i11 = kWebContainer$loadTemplate$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kWebContainer$loadTemplate$1.label = i11 - Integer.MIN_VALUE;
            } else {
                kWebContainer$loadTemplate$1 = new KWebContainer$loadTemplate$1(this, continuation);
            }
        } else {
            kWebContainer$loadTemplate$1 = new KWebContainer$loadTemplate$1(this, continuation);
        }
        Object obj = kWebContainer$loadTemplate$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kWebContainer$loadTemplate$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!m67493n()) {
                return Boxing.boxBoolean(false);
            }
            String strM67525i = this.f55279n.getF55296a();
            kWebContainer$loadTemplate$1.L$0 = function1;
            kWebContainer$loadTemplate$1.label = 1;
            if (m67491S(strM67525i, kWebContainer$loadTemplate$1) != coroutine_suspended) {
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        function1 = (Function1) kWebContainer$loadTemplate$1.L$0;
        ResultKt.throwOnFailure(obj);
        if (!m67493n()) {
            return Boxing.boxBoolean(false);
        }
        m67480F(this.f55279n.getF55296a());
        m67501z();
        Map<String, String> mapM67527k = this.f55279n.m67527k();
        KWebView kWebView = this.f55267b;
        if (kWebView == null) {
            return Boxing.boxBoolean(false);
        }
        String strM67525i2 = this.f55279n.getF55296a();
        kWebContainer$loadTemplate$1.L$0 = SpillingKt.nullOutSpilledVariable(function1);
        kWebContainer$loadTemplate$1.L$1 = SpillingKt.nullOutSpilledVariable(mapM67527k);
        kWebContainer$loadTemplate$1.L$2 = SpillingKt.nullOutSpilledVariable(kWebView);
        kWebContainer$loadTemplate$1.label = 2;
        Object objM58574n = kWebView.m58574n(strM67525i2, mapM67527k, function1, kWebContainer$loadTemplate$1);
        return objM58574n == coroutine_suspended ? coroutine_suspended : objM58574n;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: D */
    public final Object m67478D(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        KWebContainer$loadUrlWithSessionReady$1 kWebContainer$loadUrlWithSessionReady$1;
        if (continuation instanceof KWebContainer$loadUrlWithSessionReady$1) {
            kWebContainer$loadUrlWithSessionReady$1 = (KWebContainer$loadUrlWithSessionReady$1) continuation;
            int i11 = kWebContainer$loadUrlWithSessionReady$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kWebContainer$loadUrlWithSessionReady$1.label = i11 - Integer.MIN_VALUE;
            } else {
                kWebContainer$loadUrlWithSessionReady$1 = new KWebContainer$loadUrlWithSessionReady$1(this, continuation);
            }
        } else {
            kWebContainer$loadUrlWithSessionReady$1 = new KWebContainer$loadUrlWithSessionReady$1(this, continuation);
        }
        Object obj = kWebContainer$loadUrlWithSessionReady$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kWebContainer$loadUrlWithSessionReady$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!m67493n()) {
                return Boxing.boxBoolean(false);
            }
            kWebContainer$loadUrlWithSessionReady$1.L$0 = str;
            kWebContainer$loadUrlWithSessionReady$1.label = 1;
            if (m67491S(str, kWebContainer$loadUrlWithSessionReady$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) kWebContainer$loadUrlWithSessionReady$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return !m67493n() ? Boxing.boxBoolean(false) : Boxing.boxBoolean(m67477C(str));
    }

    @Nullable
    /* JADX INFO: renamed from: E */
    public final Object m67479E(@NotNull Continuation<? super Boolean> continuation) {
        return m67478D(this.f55279n.getF55296a(), continuation);
    }

    /* JADX INFO: renamed from: F */
    public final void m67480F(String str) {
        if (!this.f55275j || this.f55276k) {
            return;
        }
        this.f55276k = true;
        KWebView kWebView = this.f55267b;
        if (kWebView != null) {
            kWebView.m58579s();
        }
        C44128b.m97266j("KWebWarmup", "consume before load url=" + str);
    }

    /* JADX INFO: renamed from: G */
    public final void m67481G(@NotNull final Function0<Unit> goBackAction) {
        Intrinsics.checkNotNullParameter(goBackAction, "goBackAction");
        if (this.f55267b == null) {
            goBackAction.invoke();
            return;
        }
        if (!m67488P()) {
            if (ViewExtKt.m66581l(this.f55268c)) {
                m67497s(goBackAction);
                return;
            } else {
                this.f55267b.m58581u(new Function0() { // from class: com.kubi.widget.web.ui.t
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return KWebContainer.m67459I(this.f55342b, goBackAction);
                    }
                });
                return;
            }
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        C27100x0.m66924e(new Function0() { // from class: com.kubi.widget.web.ui.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KWebContainer.m67458H(intRef, this);
            }
        });
        if (intRef.element > 0) {
            return;
        }
        goBackAction.invoke();
    }

    /* JADX INFO: renamed from: J */
    public final void m67482J() {
        Object objM20457a;
        m67485M(TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC);
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C27227e().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("android_webview_fix_crash_test", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        if (!C27025c.m66567e((Boolean) objM20457a, true)) {
            KWebView kWebView = this.f55267b;
            if (kWebView != null) {
                kWebView.m58576p();
            }
            ImageSaveHelper imageSaveHelper = this.f55270e;
            if (imageSaveHelper != null) {
                imageSaveHelper.m67260r();
            }
            this.f55270e = null;
            m67490R(false);
            KWebView kWebView2 = this.f55267b;
            if (kWebView2 != null) {
                kWebView2.destroy();
                return;
            }
            return;
        }
        if (this.f55274i) {
            return;
        }
        this.f55274i = true;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[destroy] container onDestroy target=");
        sb2.append(this.f55279n.getF55296a());
        sb2.append(", current=");
        KWebView kWebView3 = this.f55267b;
        sb2.append(kWebView3 != null ? kWebView3.getUrl() : null);
        sb2.append(", renderProcessGone=");
        sb2.append(this.f55273h);
        C43840a.m96550d(sb2.toString(), "KWebContainer");
        KWebView kWebView4 = this.f55267b;
        if (kWebView4 != null) {
            kWebView4.m58576p();
        }
        ImageSaveHelper imageSaveHelper2 = this.f55270e;
        if (imageSaveHelper2 != null) {
            imageSaveHelper2.m67260r();
        }
        this.f55270e = null;
        m67490R(false);
        KWebView kWebView5 = this.f55267b;
        if (kWebView5 != null) {
            C27239e0.m67542i(kWebView5);
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m67483K(boolean z11) {
        int color = z11 ? ContextCompat.getColor(getContext(), R$color.kweb_background_dark) : ContextCompat.getColor(getContext(), R$color.kweb_background_light);
        KWebView kWebView = this.f55267b;
        if (kWebView != null) {
            kWebView.setBackgroundColor(color);
        }
        setBackgroundColor(color);
    }

    /* JADX INFO: renamed from: M */
    public final void m67485M(String str) {
        Object objM103844constructorimpl;
        if (this.f55277l) {
            return;
        }
        this.f55277l = true;
        try {
            Result.Companion companion = Result.INSTANCE;
            C44709g.f99496a.m98930E(str, this.f55279n.getF55296a());
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97266j("KWebWarmup", "terminal report failed reason=" + str + " error=" + thM103847exceptionOrNullimpl.getClass().getSimpleName() + " message=" + thM103847exceptionOrNullimpl.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
    
        if (r2.m58558C(r4, r7, r0) == r1) goto L33;
     */
    @Nullable
    /* JADX INFO: renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m67486N(@NotNull Continuation<? super Unit> continuation) {
        KWebContainer$requestBySsg$1 kWebContainer$requestBySsg$1;
        if (continuation instanceof KWebContainer$requestBySsg$1) {
            kWebContainer$requestBySsg$1 = (KWebContainer$requestBySsg$1) continuation;
            int i11 = kWebContainer$requestBySsg$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kWebContainer$requestBySsg$1.label = i11 - Integer.MIN_VALUE;
            } else {
                kWebContainer$requestBySsg$1 = new KWebContainer$requestBySsg$1(this, continuation);
            }
        } else {
            kWebContainer$requestBySsg$1 = new KWebContainer$requestBySsg$1(this, continuation);
        }
        Object obj = kWebContainer$requestBySsg$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kWebContainer$requestBySsg$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!m67493n()) {
                return Unit.INSTANCE;
            }
            String strM67525i = this.f55279n.getF55296a();
            kWebContainer$requestBySsg$1.label = 1;
            if (m67491S(strM67525i, kWebContainer$requestBySsg$1) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        if (!m67493n()) {
            return Unit.INSTANCE;
        }
        m67480F(this.f55279n.getF55296a());
        m67501z();
        Map<String, String> mapM67527k = this.f55279n.m67527k();
        mapM67527k.put("appNeedLang", CredentialEntry.TRUE_STRING);
        KWebView kWebView = this.f55267b;
        if (kWebView == null) {
            return Unit.INSTANCE;
        }
        String strM67525i2 = this.f55279n.getF55296a();
        kWebContainer$requestBySsg$1.L$0 = SpillingKt.nullOutSpilledVariable(mapM67527k);
        kWebContainer$requestBySsg$1.L$1 = SpillingKt.nullOutSpilledVariable(kWebView);
        kWebContainer$requestBySsg$1.label = 2;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m67487O() {
        return this.f55279n.getF55304i() || this.f55279n.getF55297b().getBooleanQueryParameter("fullScreen", false);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: P */
    public final boolean m67488P() {
        C27224b c27224b = this.f55269d;
        return c27224b != null && c27224b.m67509h();
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m67489Q(@NotNull KWebUIConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (this.f55267b == null) {
            return false;
        }
        this.f55279n = config;
        C43840a.m96550d("[entry] updateConfig target=" + config.getF55296a() + ", host=" + config.getF55297b().getHost() + ", path=" + config.getF55297b().getEncodedPath() + ", dark=" + config.getF55301f() + ", progressMode=" + config.getF55299d(), "KWebContainer");
        String strM67519c = config.getF55303h();
        if (strM67519c != null && strM67519c.length() != 0) {
            C44128b.m97266j("KWebContainer", "change ua:" + config.getF55303h());
            this.f55267b.getSettings().setUserAgentString(config.getF55303h());
        }
        if (config.getF55299d() == 2) {
            C27046k.m66703r(this.f55267b);
        }
        m67483K(config.getF55301f());
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: S */
    public final Object m67491S(String str, Continuation<? super Unit> continuation) {
        KWebContainer$waitForSessionReady$1 kWebContainer$waitForSessionReady$1;
        String str2;
        if (continuation instanceof KWebContainer$waitForSessionReady$1) {
            kWebContainer$waitForSessionReady$1 = (KWebContainer$waitForSessionReady$1) continuation;
            int i11 = kWebContainer$waitForSessionReady$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kWebContainer$waitForSessionReady$1.label = i11 - Integer.MIN_VALUE;
            } else {
                kWebContainer$waitForSessionReady$1 = new KWebContainer$waitForSessionReady$1(this, continuation);
            }
        } else {
            kWebContainer$waitForSessionReady$1 = new KWebContainer$waitForSessionReady$1(this, continuation);
        }
        KWebContainer$waitForSessionReady$1 kWebContainer$waitForSessionReady$2 = kWebContainer$waitForSessionReady$1;
        Object objM67353f = kWebContainer$waitForSessionReady$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kWebContainer$waitForSessionReady$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM67353f);
            Log.i("KWebContainer", "[session] web load gate start url=" + str);
            KWebService kWebService = KWebService.f55235b;
            kWebContainer$waitForSessionReady$2.L$0 = str;
            kWebContainer$waitForSessionReady$2.label = 1;
            objM67353f = IKWebService.m67353f(kWebService, str, 0L, kWebContainer$waitForSessionReady$2, 2, null);
            if (objM67353f == coroutine_suspended) {
                return coroutine_suspended;
            }
            str2 = str;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) kWebContainer$waitForSessionReady$2.L$0;
            ResultKt.throwOnFailure(objM67353f);
        }
        IKWebService.SessionReadyResult sessionReadyResult = (IKWebService.SessionReadyResult) objM67353f;
        if (sessionReadyResult.getF55228a()) {
            Log.i("KWebContainer", "[session] web load gate ready status=" + sessionReadyResult.getF55229b() + " action=load url=" + str2);
        } else {
            Log.w("KWebContainer", "[session] web load gate not_ready status=" + sessionReadyResult.getF55229b() + " message=" + sessionReadyResult.getF55230c() + " action=continue_load url=" + str2);
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: getConfig, reason: from getter */
    public final KWebUIConfig getF55279n() {
        return this.f55279n;
    }

    @Nullable
    public final Function0<Unit> getOnLoadSuccess$LWebWidget_googleRelease() {
        return this.f55281p;
    }

    @Nullable
    public final Function0<Unit> getOnPageMount$LWebWidget_googleRelease() {
        return this.f55282q;
    }

    @Nullable
    public final Function0<Unit> getOnReload$LWebWidget_googleRelease() {
        return this.f55280o;
    }

    @Nullable
    /* JADX INFO: renamed from: getWebView, reason: from getter */
    public final KWebView getF55267b() {
        return this.f55267b;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m67492m() {
        return (this.f55274i || this.f55273h) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m67493n() {
        return (this.f55267b == null || this.f55274i || this.f55273h) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m67497s(Function0<Unit> function0) {
        KWebView kWebView = this.f55267b;
        if (kWebView == null || !C27025c.m66566d(Boolean.valueOf(kWebView.canGoBack()))) {
            function0.invoke();
            return false;
        }
        this.f55267b.goBack();
        return true;
    }

    public final void setLoadingListener(@NotNull InterfaceC46620b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f55272g = listener;
    }

    public final void setOnLoadSuccess$LWebWidget_googleRelease(@Nullable Function0<Unit> function0) {
        this.f55281p = function0;
    }

    public final void setOnPageMount$LWebWidget_googleRelease(@Nullable Function0<Unit> function0) {
        this.f55282q = function0;
    }

    public final void setOnReload(@Nullable Function0<Unit> onReloadListener) {
        this.f55280o = onReloadListener;
    }

    public final void setOnReload$LWebWidget_googleRelease(@Nullable Function0<Unit> function0) {
        this.f55280o = function0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m67498t(RenderProcessGoneDetail renderProcessGoneDetail) {
        if (this.f55273h) {
            return true;
        }
        this.f55273h = true;
        this.f55274i = true;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("kweb render process gone didCrash=");
                sb2.append(renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null);
                sb2.append(" priority=");
                sb2.append(renderProcessGoneDetail != null ? Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()) : null);
                sb2.append(" url=");
                sb2.append(this.f55279n.getF55296a());
                C43840a.m96548b(sb2.toString(), "KWebContainer");
            }
        } catch (Exception unused) {
        }
        final KWebView kWebView = this.f55267b;
        if (kWebView != null) {
            kWebView.m58578r();
            C27100x0.m66924e(new Function0() { // from class: com.kubi.widget.web.ui.p
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KWebContainer.m67473u(kWebView);
                }
            });
            C27239e0.m67542i(kWebView);
        }
        this.f55268c.removeAllViews();
        FrameLayout frameLayout = this.f55268c;
        WebViewLoadHelper webViewLoadHelper = WebViewLoadHelper.f55331a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        frameLayout.addView(webViewLoadHelper.m67557b(context, new Function0() { // from class: com.kubi.widget.web.ui.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KWebContainer.m67474v();
            }
        }));
        m67490R(true);
        ViewExtKt.m66594y(this.f55268c);
        return true;
    }

    /* JADX INFO: renamed from: x */
    public final void m67499x(@NotNull BaseActivity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C27224b c27224b = new C27224b(context, this);
        KWebView kWebView = this.f55267b;
        if (kWebView != null) {
            kWebView.setDisableSceneListener(c27224b);
        }
        this.f55269d = c27224b;
    }

    /* JADX INFO: renamed from: y */
    public final void m67500y(@NotNull BaseActivity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f55267b != null) {
            ImageSaveHelper imageSaveHelper = new ImageSaveHelper(context);
            imageSaveHelper.m67263u(this.f55267b);
            this.f55270e = imageSaveHelper;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m67501z() {
        Object objM20457a;
        KWebView kWebView;
        WebViewClient webViewClient;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C27226d().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("android_webview_fix_crash_test", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        if (!C27025c.m66567e((Boolean) objM20457a, true) || Build.VERSION.SDK_INT < 26 || (kWebView = this.f55267b) == null || this.f55273h || (webViewClient = kWebView.getWebViewClient()) == null || (webViewClient instanceof RenderProcessGoneGuardClient)) {
            return;
        }
        this.f55267b.setWebViewClient(new RenderProcessGoneGuardClient(webViewClient, new Function1() { // from class: com.kubi.widget.web.ui.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(KWebContainer.m67457A(this.f55336b, (RenderProcessGoneDetail) obj));
            }
        }));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KWebContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        Object objM103844constructorimpl;
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f55278m = LazyKt.lazy(new Function0() { // from class: com.kubi.widget.web.ui.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KWebContainer.m67475w(this.f55337b);
            }
        });
        this.f55279n = KWebUIConfig.f55294m.getEmpty$LWebWidget_googleRelease();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LayoutInflater.from(context).inflate(R$layout.kweb_layout_container, this);
        View viewFindViewById = findViewById(R$id.loading_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f55268c = (FrameLayout) viewFindViewById;
        KWebView kWebView = null;
        try {
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(C44709g.f99496a.m98931r(context));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C44128b.m97266j("KWebWarmup", "acquire failed fallback normal create error=" + thM103847exceptionOrNullimpl.getClass().getSimpleName() + " message=" + thM103847exceptionOrNullimpl.getMessage());
            }
            C44709g.KWebViewWarmupResult aVar = (C44709g.KWebViewWarmupResult) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
            KWebView kWebViewM98936b = aVar != null ? aVar.getWebView() : null;
            this.f55275j = aVar != null;
            boolean zM98935a = aVar != null ? aVar.getFirstWebViewWarmup() : false;
            kWebViewM98936b = kWebViewM98936b == null ? new KWebView(context) : kWebViewM98936b;
            long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
            kWebViewM98936b.m58577q(jElapsedRealtime, jElapsedRealtime3, this.f55275j, zM98935a);
            C44128b.m97266j("KWebWarmup", "container performance init warmupHit=" + this.f55275j + " firstWebViewWarmup=" + zM98935a + " viewCreateTimeMs=" + jElapsedRealtime3);
            addView(kWebViewM98936b, 0, new ViewGroup.LayoutParams(-1, -1));
            kWebViewM98936b.m58563c(new C27225c());
            C43840a.m96550d("[lifecycle] create KWebView success", "KWebContainer");
            kWebView = kWebViewM98936b;
        } catch (Throwable th3) {
            C43840a.m96549c("kwebView create failed", null, 2, null);
            if (!C42899b.m94075e(th3)) {
                C43846g.m96568c(new KWebWidgetException(th3, "KWebContainer", false, null, 8, null), null, 2, null);
            } else {
                C44128b.m97264h(th3);
            }
        }
        this.f55267b = kWebView;
        if (kWebView != null) {
            kWebView.setFullscreenListener(new C27223a(context));
        }
    }

    /* JADX INFO: renamed from: A */
    public static final boolean m67457A(KWebContainer kWebContainer, RenderProcessGoneDetail renderProcessGoneDetail) {
        return kWebContainer.m67498t(renderProcessGoneDetail);
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m67459I(KWebContainer kWebContainer, Function0 function0) {
        kWebContainer.m67497s(function0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final void m67472q(ImageButton imageButton, View view) {
        KWebBaseActivity kWebBaseActivity;
        Context context = imageButton.getContext();
        if (context instanceof KWebBaseActivity) {
            kWebBaseActivity = (KWebBaseActivity) context;
        } else {
            kWebBaseActivity = null;
        }
        if (kWebBaseActivity != null) {
            kWebBaseActivity.onBackPressed();
        }
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m67473u(KWebView kWebView) {
        ViewGroup viewGroup;
        ViewParent parent = kWebView.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.removeView(kWebView);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final ImageButton m67475w(KWebContainer kWebContainer) {
        return kWebContainer.m67495p();
    }

    /* JADX INFO: renamed from: C */
    public final boolean m67477C(@NotNull String url) {
        KWebView kWebView;
        Intrinsics.checkNotNullParameter(url, "url");
        if (!m67493n() || url.length() == 0 || (kWebView = this.f55267b) == null) {
            return false;
        }
        C43840a.m96550d("[page] loadUrl target=" + url + ", current=" + kWebView.getUrl(), "KWebContainer");
        m67480F(url);
        m67501z();
        kWebView.m58575o(url, this.f55279n.m67527k());
        return true;
    }

    /* JADX INFO: renamed from: L */
    public final void m67484L(View view) {
        ViewGroup viewGroup;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m67490R(boolean z11) {
        boolean zM67487O = m67487O();
        C44128b.m97266j("KWebContainer", "updateImmersiveBackButton show=" + z11 + " allow=" + zM67487O + " url=" + this.f55279n.getF55296a());
        if (zM67487O && z11) {
            if (getImmersiveBackButton().getParent() == null) {
                this.f55268c.addView(getImmersiveBackButton());
                return;
            } else {
                getImmersiveBackButton().bringToFront();
                return;
            }
        }
        if (this.f55278m.isInitialized()) {
            m67484L(getImmersiveBackButton());
        }
    }

    /* JADX INFO: renamed from: p */
    public final ImageButton m67495p() {
        Object objM103844constructorimpl;
        int i11 = (int) (getResources().getDisplayMetrics().density * 44);
        int i12 = (int) (getResources().getDisplayMetrics().density * 16);
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Integer.valueOf(C5270g.m6194h()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            objM103844constructorimpl = Integer.valueOf((int) (getResources().getDisplayMetrics().density * 24));
        }
        int iIntValue = ((Number) objM103844constructorimpl).intValue() + ((int) (getResources().getDisplayMetrics().density * 8));
        final ImageButton imageButton = new ImageButton(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, i11);
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = iIntValue;
        layoutParams.setMarginStart(i12);
        imageButton.setLayoutParams(layoutParams);
        imageButton.setBackground(null);
        imageButton.setImageResource(R$drawable.ic2_arrow_left2_20);
        imageButton.setImageTintList(ContextCompat.getColorStateList(imageButton.getContext(), R$color.c_icon));
        imageButton.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.widget.web.ui.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KWebContainer.m67472q(imageButton, view);
            }
        });
        return imageButton;
    }
}
