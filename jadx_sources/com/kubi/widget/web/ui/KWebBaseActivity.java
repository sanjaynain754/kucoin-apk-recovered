package com.kubi.widget.web.ui;

import android.R;
import android.app.ComponentCaller;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.credentials.provider.CredentialEntry;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blankj.utilcode.util.C5270g;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.applet.IAppletService;
import com.kubi.sdk.applet.KCMiniAppBaseProtocol;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.sdk.web.KWebView;
import com.kubi.sdk.web.util.WebWhiteTool;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.kubi.widget.web.R$anim;
import com.kubi.widget.web.R$color;
import com.kubi.widget.web.R$drawable;
import com.kubi.widget.web.R$id;
import com.kubi.widget.web.R$layout;
import com.kubi.widget.web.exception.KWebWidgetException;
import com.kubi.widget.web.helper.C27178m;
import com.kubi.widget.web.helper.WhitePageCheckHelper;
import com.tencent.bugly.proguard.RunnableC33958ua;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p481ny.C42899b;
import p569qq.C43840a;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.Regex;
import p852kotlin.text.RegexOption;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import s80.C44363a;
import w80.C45759d;
import w80.ViewTreeObserverOnGlobalLayoutListenerC45756a;

/* JADX INFO: compiled from: KWebBaseActivity.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 `2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001`B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u0010\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020+H\u0002J\n\u0010,\u001a\u0004\u0018\u00010'H\u0014J\u0010\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020/H\u0014J\u0010\u00100\u001a\u00020\"2\u0006\u0010.\u001a\u00020/H\u0014J\b\u00101\u001a\u00020\"H\u0014J\b\u00102\u001a\u00020\"H\u0002J\b\u00103\u001a\u00020\"H\u0002J\u0018\u00104\u001a\u00020\"2\u0006\u00105\u001a\u00020\u001c2\b\b\u0002\u00106\u001a\u00020\u001cJ\u0018\u00107\u001a\u00020\"2\b\u00108\u001a\u0004\u0018\u00010\u00192\u0006\u00109\u001a\u00020\u0019J\u001a\u0010:\u001a\u00020\"2\b\u00108\u001a\u0004\u0018\u00010\u00192\u0006\u00109\u001a\u00020\u0019H\u0002J\b\u0010;\u001a\u00020<H\u0002J\b\u0010=\u001a\u00020\"H\u0002J\u0018\u0010>\u001a\u00020\"2\u0006\u0010?\u001a\u00020<2\u0006\u00109\u001a\u00020\u0019H\u0002J\b\u0010@\u001a\u00020\"H\u0002J\b\u0010A\u001a\u00020\"H\u0002J\b\u0010B\u001a\u00020\u0019H\u0002J\f\u0010C\u001a\u00020\u0019*\u00020+H\u0002J\f\u0010D\u001a\u00020\u0019*\u00020<H\u0002J\u0013\u0010E\u001a\u0004\u0018\u00010<*\u00020\u0019H\u0002¢\u0006\u0002\u0010FJ\f\u0010G\u001a\u00020\"*\u00020\u0010H\u0002J\b\u0010H\u001a\u00020\"H\u0014J\b\u0010I\u001a\u00020\"H\u0014J\b\u0010J\u001a\u00020\u001cH\u0016J\b\u0010K\u001a\u00020\"H\u0016J\b\u0010L\u001a\u00020\"H\u0014J\b\u0010M\u001a\u00020\"H\u0014J\u001d\u0010N\u001a\u00020\"2\u0006\u0010O\u001a\u00020\u001c2\b\u0010P\u001a\u0004\u0018\u00010<¢\u0006\u0002\u0010QJ\u000e\u0010R\u001a\u00020\"2\u0006\u0010S\u001a\u00020\u001cJ\b\u0010T\u001a\u0004\u0018\u00010/J\b\u0010U\u001a\u00020\u0019H\u0016J*\u0010V\u001a\u00020\"2\u0006\u0010W\u001a\u00020<2\u0006\u0010X\u001a\u00020<2\b\u0010Y\u001a\u0004\u0018\u00010Z2\u0006\u0010[\u001a\u00020\\H\u0016J\u0010\u0010]\u001a\u00020\"2\u0006\u0010^\u001a\u00020\bH\u0016J\u0010\u0010_\u001a\u00020\"2\u0006\u0010^\u001a\u00020\bH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@DX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006a"}, m90084d2 = {"Lcom/kubi/widget/web/ui/KWebBaseActivity;", "Lcom/kubi/sdk/BaseActivity;", "Lcom/kubi/sdk/applet/KCMiniAppBaseProtocol;", "Lcom/kubi/widget/web/ui/ActivityResultHost;", "<init>", "()V", "listeners", "", "Lcom/kubi/widget/web/ui/ActivityResultListener;", "value", "Lcom/kubi/widget/web/ui/KWebContainer;", "webContainer", "getWebContainer", "()Lcom/kubi/widget/web/ui/KWebContainer;", "setWebContainer", "(Lcom/kubi/widget/web/ui/KWebContainer;)V", "Lcom/kubi/resources/widget/NavigationBar;", "navigationBar", "getNavigationBar", "()Lcom/kubi/resources/widget/NavigationBar;", "initStartTime", "", "navBackgroundChangeHistoryBeforePageMount", "", "", "", "lastNavBackgroundColorBeforePageMount", "hasReportedNavBackgroundThemeConsistency", "", "isNavigationBarTransparent", "hasReceivedPageMount", "navBackgroundThemeConsistencyFallbackJob", "Lkotlinx/coroutines/Job;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "reportInvalidWebTarget", "config", "Lcom/kubi/widget/web/ui/KWebUIConfig;", "isValidWebTarget", "dealFullScreen", "uri", "Landroid/net/Uri;", "getWebUIConfig", "initWebView", "webView", "Lcom/kubi/sdk/web/KWebView;", "addAllHandlers", "startLoad", "perInitColor", "applyUrlNavigationBarStyle", "applyNavigationBarTransparent", "transparent", "hideNavigationBar", "applyNavigationBarBackground", "background", "source", "applyResolvedNavigationBarBackground", "themeNavigationBarBackgroundColor", "", "applyDebugColorOverridesIfNeeded", "recordNavigationBarBackgroundChangeIfNeeded", "color", "reportNavigationBarThemeConsistencyIfNeeded", "scheduleNavigationBarThemeConsistencyFallback", "reportUrl", "pathWithoutLanguagePrefix", "toHexColor", "toColorOrNull", "(Ljava/lang/String;)Ljava/lang/Integer;", "initBar", "onNavigationBarRightClick", "onDestroy", "interceptWebContainerDestroy", "onBackPressed", "onResume", "onPause", "setStatusBarTransparent", "statusBarTransparent", "backgroundColor", "(ZLjava/lang/Integer;)V", "setWebViewScrollBarVisible", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "getWebView", "url", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "caller", "Landroid/app/ComponentCaller;", "registerActivityResultListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "unregisterActivityResultListener", "Companion", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKWebBaseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KWebBaseActivity.kt\ncom/kubi/widget/web/ui/KWebBaseActivity\n+ 2 KWebIssue.kt\ncom/kubi/widget/web/exception/KWebIssueKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 6 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 7 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,585:1\n46#2,6:586\n46#2,6:592\n46#2,6:599\n46#2,6:624\n46#2,6:630\n1#3:598\n774#4:605\n865#4,2:606\n1869#4,2:636\n1069#5,2:608\n35#6,4:610\n39#6:616\n35#6,4:617\n39#6:623\n44#7,2:614\n44#7,2:621\n*S KotlinDebug\n*F\n+ 1 KWebBaseActivity.kt\ncom/kubi/widget/web/ui/KWebBaseActivity\n*L\n230#1:586,6\n256#1:592,6\n353#1:599,6\n546#1:624,6\n558#1:630,6\n381#1:605\n381#1:606,2\n574#1:636,2\n402#1:608,2\n490#1:610,4\n490#1:616\n502#1:617,4\n502#1:623\n490#1:614,2\n502#1:621,2\n*E\n"})
public abstract class KWebBaseActivity extends BaseActivity implements KCMiniAppBaseProtocol, ActivityResultHost {

    /* JADX INFO: renamed from: s */
    @NotNull
    public static final Companion f55255s = new Companion(null);

    /* JADX INFO: renamed from: j */
    public KWebContainer f55257j;

    /* JADX INFO: renamed from: k */
    public NavigationBar f55258k;

    /* JADX INFO: renamed from: o */
    public boolean f55262o;

    /* JADX INFO: renamed from: p */
    public boolean f55263p;

    /* JADX INFO: renamed from: q */
    public boolean f55264q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public InterfaceC41775x1 f55265r;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Set<ActivityResultListener> f55256i = new LinkedHashSet();

    /* JADX INFO: renamed from: l */
    public final long f55259l = System.currentTimeMillis();

    /* JADX INFO: renamed from: m */
    @NotNull
    public final List<Map<String, String>> f55260m = new ArrayList();

    /* JADX INFO: renamed from: n */
    @NotNull
    public String f55261n = "";

    /* JADX INFO: compiled from: KWebBaseActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/widget/web/ui/KWebBaseActivity$Companion;", "", "<init>", "()V", "TAG", "", "NAV_BG_SOURCE_THEME_DEFAULT", "NAV_BG_SOURCE_URL_QUERY", "NAV_BG_SOURCE_UPDATE_HEADER_JSAPI", "NAV_BG_REPORT_FALLBACK_DELAY_MS", "", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.widget.web.ui.KWebBaseActivity$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes59.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C27219a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.widget.web.ui.KWebBaseActivity$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes59.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C27220b extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.widget.web.ui.KWebBaseActivity$onCreate$1 */
    /* JADX INFO: compiled from: KWebBaseActivity.kt */
    /* JADX INFO: loaded from: classes59.dex */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.widget.web.ui.KWebBaseActivity$onCreate$1", m90122f = "KWebBaseActivity.kt", m90123i = {}, m90124l = {82}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C272211 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C272211(Continuation<? super C272211> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C272211(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C272211) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                WebWhiteTool webWhiteTool = WebWhiteTool.f48551a;
                this.label = 1;
                if (webWhiteTool.m58855f(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.widget.web.ui.KWebBaseActivity$onPause$1 */
    /* JADX INFO: compiled from: KWebBaseActivity.kt */
    /* JADX INFO: loaded from: classes59.dex */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.widget.web.ui.KWebBaseActivity$onPause$1", m90122f = "KWebBaseActivity.kt", m90123i = {}, m90124l = {514}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C272221 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C272221(Continuation<? super C272221> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return KWebBaseActivity.this.new C272221(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C272221) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                KWebView f55267b = KWebBaseActivity.this.m67451l0().getF55267b();
                if (f55267b != null) {
                    this.label = 1;
                    if (f55267b.m58568h(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: B0 */
    public static final Unit m67412B0(KWebBaseActivity kWebBaseActivity) {
        kWebBaseActivity.f55264q = true;
        InterfaceC41775x1 interfaceC41775x1 = kWebBaseActivity.f55265r;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        kWebBaseActivity.m67436I0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p0 */
    public static final Unit m67424p0(KWebView kWebView) {
        KWebView.m58555y(kWebView, "onLeadClick", null, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q0 */
    public static final Unit m67425q0(KWebView kWebView) {
        KWebView.m58555y(kWebView, "onTrailClick", null, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E0 */
    public final String m67432E0(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        if (encodedPath == null) {
            encodedPath = "";
        }
        List listSplit$default = StringsKt.split$default((CharSequence) StringsKt.trim(encodedPath, '/'), new char[]{'/'}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSplit$default) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty() || !new Regex("[a-z]{2}(-[a-z]{2,4})?", RegexOption.IGNORE_CASE).matches((String) CollectionsKt.first((List) arrayList))) {
            return encodedPath;
        }
        return '/' + CollectionsKt.joinToString$default(CollectionsKt.drop(arrayList, 1), "/", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: renamed from: F0 */
    public final void m67433F0() {
        try {
            ImageView leftIcon = getNavigationBar().getLeftIcon();
            Intrinsics.checkNotNullExpressionValue(leftIcon, "getLeftIcon(...)");
            if (m67451l0().getF55279n().getF55301f()) {
                leftIcon.setColorFilter(ContextCompat.getColor(this, R$color.kweb_foreground_dark), PorterDuff.Mode.SRC_IN);
                C5270g.m6204r(this, false);
            } else {
                leftIcon.setColorFilter(ContextCompat.getColor(this, R$color.kweb_foreground_light), PorterDuff.Mode.SRC_IN);
                C5270g.m6204r(this, true);
            }
            m67448i0(null, "themeDefault");
        } catch (Exception e11) {
            if (C42899b.m94075e(e11)) {
                C44128b.m97264h(e11);
            } else {
                C43846g.m96568c(new KWebWidgetException(e11, BaseActivity.WEB_DEBUG_TAG, false, null, 8, null), null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: v0 */
    public boolean mo14854v0() {
        return false;
    }

    /* JADX INFO: renamed from: s0 */
    public static final Unit m67427s0(KWebBaseActivity kWebBaseActivity, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it, CredentialEntry.TRUE_STRING)) {
            return Unit.INSTANCE;
        }
        kWebBaseActivity.mo36751C0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y0 */
    public static final Unit m67430y0(KWebBaseActivity kWebBaseActivity) {
        if (Router.f46192a.m56199u(kWebBaseActivity.getIntent())) {
            kWebBaseActivity.finish();
        } else {
            super.onBackPressed();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G0 */
    public final void m67434G0(int i11, String str) {
        if (this.f55262o) {
            return;
        }
        String strM67444R0 = m67444R0(i11);
        this.f55260m.add(MapsKt.mapOf(TuplesKt.m90091to("value", strM67444R0), TuplesKt.m90091to("source", str)));
        this.f55261n = strM67444R0;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m67436I0() {
        if (this.f55262o) {
            return;
        }
        boolean z11 = true;
        this.f55262o = true;
        InterfaceC41775x1 interfaceC41775x1 = this.f55265r;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        try {
            String strM67444R0 = m67444R0(m67442P0());
            String str = this.f55261n;
            if (str.length() == 0) {
                str = strM67444R0;
            }
            String strM67437J0 = m67437J0();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("category", "nav_bar_bg_theme_consistency");
            jSONObject.put("url", strM67437J0);
            String host = Uri.parse(strM67437J0).getHost();
            String str2 = "";
            if (host == null) {
                host = "";
            }
            jSONObject.put("host", host);
            Uri uri = Uri.parse(strM67437J0);
            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
            jSONObject.put("path", m67432E0(uri));
            jSONObject.put("appTheme", m67451l0().getF55279n().getF55301f() ? "dark" : "light");
            jSONObject.put("themeNavBackgroundColor", strM67444R0);
            jSONObject.put("navBackgroundColorHistory", new JSONArray((Collection) this.f55260m).toString());
            if (!this.f55263p) {
                str2 = str;
            }
            jSONObject.put("navBackgroundColorLastValue", str2);
            jSONObject.put("isNavigationBarTransparent", this.f55263p);
            if (!this.f55263p && !Intrinsics.areEqual(str, strM67444R0)) {
                z11 = false;
            }
            jSONObject.put("isNavBackgroundColorConsistentWithTheme", z11);
            C43852m.m96605q("duration_event", jSONObject);
        } catch (Exception e11) {
            if (C42899b.m94075e(e11)) {
                C44128b.m97264h(e11);
            } else {
                C43846g.m96568c(new KWebWidgetException(e11, BaseActivity.WEB_DEBUG_TAG, false, null, 8, null), null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m67438K0() {
        if (this.f55262o || this.f55264q) {
            return;
        }
        InterfaceC41775x1 interfaceC41775x1 = this.f55265r;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f55265r = C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KWebBaseActivity$scheduleNavigationBarThemeConsistencyFallback$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: M0 */
    public final void m67440M0(@NotNull KWebContainer kWebContainer) {
        Intrinsics.checkNotNullParameter(kWebContainer, "<set-?>");
        this.f55257j = kWebContainer;
    }

    /* JADX INFO: renamed from: R0 */
    public final String m67444R0(int i11) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.US, "#%02X%02X%02X", Arrays.copyOf(new Object[]{Integer.valueOf(Color.red(i11)), Integer.valueOf(Color.green(i11)), Integer.valueOf(Color.blue(i11))}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m67445f0() {
        C45759d.f103178a.m101026a(getNavigationBar(), m67451l0(), m67451l0().getF55279n().getF55296a());
    }

    @NotNull
    public final NavigationBar getNavigationBar() {
        NavigationBar navigationBar = this.f55258k;
        if (navigationBar != null) {
            return navigationBar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigationBar");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m67447h0(boolean z11, boolean z12) {
        this.f55263p = z11;
        C44128b.m97266j(BaseActivity.WEB_DEBUG_TAG, "applyNavigationBarTransparent transparent=" + z11 + " hideNavigationBar=" + z12 + " titleBarVisibility=" + getTitleBar().getVisibility() + " titleBarShown=" + getTitleBar().isShown() + " navVisibility=" + getNavigationBar().getVisibility() + " navShown=" + getNavigationBar().isShown());
        if (!z11) {
            getNavigationBar().m54699j();
            C44128b.m97266j(BaseActivity.WEB_DEBUG_TAG, "applyNavigationBarTransparent result titleBarVisibility=" + getTitleBar().getVisibility() + " titleBarShown=" + getTitleBar().isShown() + " navVisibility=" + getNavigationBar().getVisibility() + " navShown=" + getNavigationBar().isShown());
            return;
        }
        m67439L0(true, null);
        getNavigationBar().setBackGroundColor(ContextCompat.getColor(this, R$color.c_transparent));
        if (z12) {
            getNavigationBar().m54692c();
        } else {
            getNavigationBar().m54699j();
        }
        C44128b.m97266j(BaseActivity.WEB_DEBUG_TAG, "applyNavigationBarTransparent result titleBarVisibility=" + getTitleBar().getVisibility() + " titleBarShown=" + getTitleBar().isShown() + " navVisibility=" + getNavigationBar().getVisibility() + " navShown=" + getNavigationBar().isShown());
    }

    /* JADX INFO: renamed from: i0 */
    public final void m67448i0(String str, String str2) {
        Integer numM67443Q0;
        if (this.f55263p) {
            return;
        }
        int iM67442P0 = (str == null || (numM67443Q0 = m67443Q0(str)) == null) ? m67442P0() : numM67443Q0.intValue();
        getNavigationBar().setBackGroundColor(iM67442P0);
        m67439L0(false, Integer.valueOf(iM67442P0));
        m67434G0(iM67442P0, str2);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m67450k0(Uri uri) {
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("fullScreen", false);
        C44128b.m97266j(BaseActivity.WEB_DEBUG_TAG, "dealFullScreen fullScreen=" + booleanQueryParameter + " url=" + uri);
        if (booleanQueryParameter) {
            m67447h0(true, true);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public final KWebContainer m67451l0() {
        KWebContainer kWebContainer = this.f55257j;
        if (kWebContainer != null) {
            return kWebContainer;
        }
        Intrinsics.throwUninitializedPropertyAccessException("webContainer");
        return null;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m67453o0(NavigationBar navigationBar) {
        navigationBar.setMainTitle(m67451l0().getF55279n().getF55298c());
        final KWebView f55267b = m67451l0().getF55267b();
        if (f55267b == null) {
            return;
        }
        navigationBar.setLeftOnclickListener(new View.OnClickListener() { // from class: com.kubi.widget.web.ui.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KWebBaseActivity.m67428t0(this.f55325b, view);
            }
        });
        int iM66658b = C27040e.m66658b(45);
        int iM66658b2 = C27040e.m66658b(13);
        ImageView rightOne = navigationBar.getRightOne();
        if (rightOne != null) {
            rightOne.getLayoutParams().width = iM66658b;
            rightOne.getLayoutParams().height = iM66658b;
            rightOne.setPadding(iM66658b2, iM66658b2, iM66658b2, iM66658b2);
            C27046k.m66711z(rightOne, 0L, new Function0() { // from class: com.kubi.widget.web.ui.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KWebBaseActivity.m67424p0(f55267b);
                }
            }, 1, null);
        }
        ImageView rightTwo = navigationBar.getRightTwo();
        if (rightTwo != null) {
            rightTwo.getLayoutParams().width = iM66658b;
            rightTwo.getLayoutParams().height = iM66658b;
            rightTwo.setPadding(iM66658b2, iM66658b2, iM66658b2, iM66658b2);
            C27046k.m66711z(rightTwo, 0L, new Function0() { // from class: com.kubi.widget.web.ui.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KWebBaseActivity.m67425q0(f55267b);
                }
            }, 1, null);
        }
        ImageView rightThree = navigationBar.getRightThree();
        if (rightThree != null) {
            rightThree.setImageResource(R$drawable.ic_close_24);
        }
        ImageView rightThree2 = navigationBar.getRightThree();
        if (rightThree2 != null) {
            C27046k.m66711z(rightThree2, 0L, new Function0() { // from class: com.kubi.widget.web.ui.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KWebBaseActivity.m67426r0(f55267b, this);
                }
            }, 1, null);
        }
    }

    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data, @NotNull ComponentCaller caller) {
        Intrinsics.checkNotNullParameter(caller, "caller");
        super.onActivityResult(requestCode, resultCode, data, caller);
        Iterator it = CollectionsKt.toList(this.f55256i).iterator();
        while (it.hasNext()) {
            ((ActivityResultListener) it.next()).onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IAppletService.f46452a.get().mo15069d(this, new Function0() { // from class: com.kubi.widget.web.ui.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KWebBaseActivity.m67429x0(this.f55319b);
            }
        });
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        InterfaceC41775x1 interfaceC41775x1 = this.f55265r;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f55256i.clear();
        super.onDestroy();
        if (mo14854v0()) {
            return;
        }
        m67451l0().m67482J();
    }

    /* JADX INFO: renamed from: A0 */
    public static final Unit m67411A0(KWebBaseActivity kWebBaseActivity) {
        kWebBaseActivity.m67438K0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r0 */
    public static final Unit m67426r0(KWebView kWebView, final KWebBaseActivity kWebBaseActivity) {
        kWebView.m58583w();
        KWebView.m58555y(kWebView, "onRightClick", null, new Function1() { // from class: com.kubi.widget.web.ui.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KWebBaseActivity.m67427s0(this.f55335b, (String) obj);
            }
        }, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t0 */
    public static final void m67428t0(KWebBaseActivity kWebBaseActivity, View view) {
        kWebBaseActivity.onBackPressed();
    }

    /* JADX INFO: renamed from: x0 */
    public static final Unit m67429x0(final KWebBaseActivity kWebBaseActivity) {
        kWebBaseActivity.m67451l0().m67481G(new Function0() { // from class: com.kubi.widget.web.ui.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KWebBaseActivity.m67430y0(this.f55334b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z0 */
    public static final Unit m67431z0(KWebBaseActivity kWebBaseActivity) {
        kWebBaseActivity.mo14848O0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C0 */
    public void mo36751C0() {
        finish();
        overridePendingTransition(R.anim.fade_in, R$anim.anim_bottom_out_200);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m67435H0(KWebUIConfig kWebUIConfig) {
        boolean z11;
        String scheme;
        Boolean boolValueOf;
        Uri uriM67524h = kWebUIConfig.getF55297b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[entry] invalid web target blocked uriNull=");
        if (uriM67524h == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        sb2.append(z11);
        sb2.append(", scheme=");
        String host = null;
        if (uriM67524h != null) {
            scheme = uriM67524h.getScheme();
        } else {
            scheme = null;
        }
        sb2.append(scheme);
        sb2.append(", hierarchical=");
        if (uriM67524h != null) {
            boolValueOf = Boolean.valueOf(uriM67524h.isHierarchical());
        } else {
            boolValueOf = null;
        }
        sb2.append(boolValueOf);
        sb2.append(", host=");
        if (uriM67524h != null) {
            host = uriM67524h.getHost();
        }
        sb2.append(host);
        C43840a.m96552g(sb2.toString(), BaseActivity.WEB_DEBUG_TAG);
    }

    /* JADX INFO: renamed from: J0 */
    public final String m67437J0() {
        String url;
        KWebView f55267b = m67451l0().getF55267b();
        if (f55267b != null) {
            url = f55267b.getUrl();
        } else {
            url = null;
        }
        if (url != null && !StringsKt.isBlank(url) && !Intrinsics.areEqual(url, "about:blank")) {
            return url;
        }
        return m67451l0().getF55279n().getF55296a();
    }

    /* JADX INFO: renamed from: L0 */
    public final void m67439L0(boolean z11, @Nullable Integer num) {
        View decorView;
        View decorView2;
        if (!C27025c.m66566d(Boolean.valueOf(isFinishing())) && !C27025c.m66566d(Boolean.valueOf(isDestroyed()))) {
            try {
                ViewTreeObserverOnGlobalLayoutListenerC45756a.m101013a(this, Boolean.valueOf(z11));
                int systemUiVisibility = 0;
                if (z11) {
                    EdgeToEdgeCompat.f48106a.m58267e(this, ContextCompat.getColor(this, R$color.c_transparent));
                } else {
                    if (num != null) {
                        EdgeToEdgeCompat.f48106a.m58279q(this, num);
                    }
                    Window window = getWindow();
                    if (window != null && (decorView = window.getDecorView()) != null) {
                        Window window2 = getWindow();
                        if (window2 != null && (decorView2 = window2.getDecorView()) != null) {
                            systemUiVisibility = decorView2.getSystemUiVisibility() & (-1029);
                        }
                        decorView.setSystemUiVisibility(systemUiVisibility);
                    }
                }
                C5270g.m6204r(this, !m67451l0().getF55279n().getF55301f());
            } catch (Exception e11) {
                if (!C42899b.m94075e(e11)) {
                    C43846g.m96568c(new KWebWidgetException(e11, BaseActivity.WEB_DEBUG_TAG, false, null, 8, null), null, 2, null);
                } else {
                    C44128b.m97264h(e11);
                }
            }
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m67441N0(boolean z11) {
        KWebView f55267b = m67451l0().getF55267b();
        if (f55267b != null) {
            f55267b.setVerticalScrollBarEnabled(z11);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public void mo14848O0() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KWebBaseActivity$startLoad$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: P0 */
    public final int m67442P0() {
        if (m67451l0().getF55279n().getF55301f()) {
            return ContextCompat.getColor(this, R$color.kweb_background_dark);
        }
        return ContextCompat.getColor(this, R$color.kweb_background_light);
    }

    /* JADX INFO: renamed from: Q0 */
    public final Integer m67443Q0(String str) {
        String string = StringsKt.trim((CharSequence) str).toString();
        if (string.length() == 0) {
            return null;
        }
        if (!StringsKt.startsWith$default(string, RunnableC33958ua.f72251f, false, 2, (Object) null)) {
            string = '#' + string;
        }
        String strRemovePrefix = StringsKt.removePrefix(string, (CharSequence) RunnableC33958ua.f72251f);
        if (strRemovePrefix.length() != 6 && strRemovePrefix.length() != 8) {
            return null;
        }
        for (int i11 = 0; i11 < strRemovePrefix.length(); i11++) {
            char cCharAt = strRemovePrefix.charAt(i11);
            if (('0' > cCharAt || cCharAt >= ':') && (('a' > cCharAt || cCharAt >= 'g') && ('A' > cCharAt || cCharAt >= 'G'))) {
                return null;
            }
        }
        try {
            return Integer.valueOf(Color.parseColor(string));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void mo14851e0(@NotNull KWebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        C44363a.f98027a.m97858b(webView, this);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m67446g0(@Nullable String str, @NotNull String source) {
        String string;
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f55263p) {
            return;
        }
        if (str != null) {
            string = StringsKt.trim((CharSequence) str).toString();
        } else {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        if (string.length() == 0) {
            m67448i0(null, source);
        } else {
            m67448i0(string, source);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m67449j0() {
        try {
            KWebUIConfig f55279n = m67451l0().getF55279n();
            if (f55279n.getF55304i()) {
                m67447h0(true, true);
                C44128b.m97266j(BaseActivity.WEB_DEBUG_TAG, "applyUrlNavigationBarStyle transparent=true url=" + f55279n.getF55296a());
                return;
            }
            this.f55263p = false;
            getNavigationBar().m54699j();
            C44128b.m97266j(BaseActivity.WEB_DEBUG_TAG, "applyUrlNavigationBarStyle transparent=false navBackgroundColor=" + f55279n.getF55305j() + " url=" + f55279n.getF55296a());
            String strM67521e = f55279n.getF55305j();
            if (strM67521e != null) {
                m67446g0(strM67521e, "urlQuery");
            }
        } catch (Exception e11) {
            if (!C42899b.m94075e(e11)) {
                C43846g.m96568c(new KWebWidgetException(e11, BaseActivity.WEB_DEBUG_TAG, false, null, 8, null), null, 2, null);
            } else {
                C44128b.m97264h(e11);
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: m0 */
    public KWebUIConfig mo14852m0() {
        Bundle extras = getIntent().getExtras();
        if (extras != null && !extras.isEmpty()) {
            KWebUIConfig kWebUIConfigFromBundle = KWebUIConfig.f55294m.fromBundle(extras);
            if (kWebUIConfigFromBundle == null) {
                C44128b.m97261e(BaseActivity.WEB_DEBUG_TAG, "webContainer bundle error");
                finish();
                return null;
            }
            return kWebUIConfigFromBundle;
        }
        C44128b.m97261e(BaseActivity.WEB_DEBUG_TAG, "webContainer bundle empty");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: n0 */
    public final KWebView m67452n0() {
        try {
            return m67451l0().getF55267b();
        } catch (Exception e11) {
            if (!C42899b.m94075e(e11)) {
                C43846g.m96568c(new KWebWidgetException(e11, BaseActivity.WEB_DEBUG_TAG, false, null, 8, null), null, 2, null);
            } else {
                C44128b.m97264h(e11);
            }
            return null;
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C44128b.m97266j(BaseActivity.WEB_DEBUG_TAG, "onCreate activity=" + getClass().getName());
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C272211(null), 3, null);
        setContentView(R$layout.kweb_activity_webview);
        View viewFindViewById = findViewById(R$id.web_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        m67440M0((KWebContainer) viewFindViewById);
        View viewFindViewById2 = findViewById(R$id.navigation_bar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f55258k = (NavigationBar) viewFindViewById2;
        m67451l0().setOnReload$LWebWidget_googleRelease(new Function0() { // from class: com.kubi.widget.web.ui.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KWebBaseActivity.m67431z0(this.f55321b);
            }
        });
        KWebView f55267b = m67451l0().getF55267b();
        if (f55267b != null) {
            mo14853u0(f55267b);
        }
        KWebUIConfig kWebUIConfigMo14852m0 = mo14852m0();
        if (kWebUIConfigMo14852m0 == null) {
            C44128b.m97261e(BaseActivity.WEB_DEBUG_TAG, "webContainer bundle error");
            finish();
            return;
        }
        if (!m67455w0(kWebUIConfigMo14852m0)) {
            m67435H0(kWebUIConfigMo14852m0);
            finish();
            return;
        }
        C44128b.m97266j(BaseActivity.WEB_DEBUG_TAG, "WebView begin, url is: \n" + kWebUIConfigMo14852m0.getF55296a() + '\n');
        if (!m67451l0().m67489Q(kWebUIConfigMo14852m0)) {
            C44128b.m97261e(BaseActivity.WEB_DEBUG_TAG, "webContainer updateConfig failed");
            finish();
            return;
        }
        m67451l0().setOnLoadSuccess$LWebWidget_googleRelease(new Function0() { // from class: com.kubi.widget.web.ui.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KWebBaseActivity.m67411A0(this.f55323b);
            }
        });
        m67451l0().setOnPageMount$LWebWidget_googleRelease(new Function0() { // from class: com.kubi.widget.web.ui.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KWebBaseActivity.m67412B0(this.f55324b);
            }
        });
        m67451l0().m67500y(this);
        m67453o0(getNavigationBar());
        if (!kWebUIConfigMo14852m0.getF55302g()) {
            overridePendingTransition(0, 0);
        }
        m67433F0();
        m67449j0();
        m67450k0(m67451l0().getF55279n().getF55297b());
        m67445f0();
        mo14848O0();
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object objM20457a;
        KWebView f55267b;
        super.onPause();
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C27219a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("android_webview_fix_crash_test", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        if (C27025c.m66567e((Boolean) objM20457a, true)) {
            if (!isFinishing() && !isDestroyed() && m67451l0().m67492m() && (f55267b = m67451l0().getF55267b()) != null) {
                C27178m.m67318a(f55267b);
            }
        } else {
            KWebView f55267b2 = m67451l0().getF55267b();
            if (f55267b2 != null) {
                C27178m.m67318a(f55267b2);
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f55259l;
        WhitePageCheckHelper whitePageCheckHelper = WhitePageCheckHelper.f55155a;
        if (whitePageCheckHelper.m67289c() && jCurrentTimeMillis >= whitePageCheckHelper.m67288b()) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C272221(null), 3, null);
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() throws JSONException {
        Object objM20457a;
        KWebView f55267b;
        super.onResume();
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C27220b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("android_webview_fix_crash_test", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        if (C27025c.m66567e((Boolean) objM20457a, true)) {
            if (m67451l0().m67492m() && (f55267b = m67451l0().getF55267b()) != null) {
                C27178m.m67319b(f55267b);
                return;
            }
            return;
        }
        KWebView f55267b2 = m67451l0().getF55267b();
        if (f55267b2 != null) {
            C27178m.m67319b(f55267b2);
        }
    }

    @Override // com.kubi.widget.web.ui.ActivityResultHost
    /* JADX INFO: renamed from: t */
    public void mo67454t(@NotNull ActivityResultListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f55256i.add(listener);
    }

    /* JADX INFO: renamed from: u0 */
    public void mo14853u0(@NotNull KWebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        mo14851e0(webView);
    }

    @Override // com.kubi.sdk.applet.KCBaseProtocol
    @NotNull
    public String url() {
        return m67451l0().getF55279n().getF55296a();
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m67455w0(KWebUIConfig kWebUIConfig) {
        String lowerCase;
        String path;
        String host;
        Uri uriM67524h = kWebUIConfig.getF55297b();
        if (uriM67524h == null) {
            return false;
        }
        String scheme = uriM67524h.getScheme();
        if (scheme != null) {
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            lowerCase = scheme.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        if (lowerCase != null) {
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != 3143036) {
                if (iHashCode != 3213448) {
                    if (uriM67524h.isHierarchical() || (host = uriM67524h.getHost()) == null || StringsKt.isBlank(host)) {
                        return false;
                    }
                    return true;
                }
                if (uriM67524h.isHierarchical()) {
                }
                return false;
            }
            if (lowerCase.equals("file") && uriM67524h.isHierarchical() && (path = uriM67524h.getPath()) != null && !StringsKt.isBlank(path)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.kubi.widget.web.ui.ActivityResultHost
    /* JADX INFO: renamed from: x */
    public void mo67456x(@NotNull ActivityResultListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f55256i.remove(listener);
    }
}
