package com.kubi.launch;

import android.app.Activity;
import android.util.Log;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.launch.exception.SplashException;
import com.kubi.launch.exception.SplashMessage;
import com.kubi.launch.helper.NewVersionJourneyHelper;
import com.kubi.monitor.MonitorLevel;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseConstants;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.site.SiteService;
import com.kubi.sdk.site.config.SiteConfigManager;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.site.rebirth.AppRebirth;
import com.kubi.sdk.startup.StartupDispatcher;
import com.kubi.sdk.util.StartupMinorTraceUtils;
import com.kubi.sdk.util.StartupTrace;
import com.kubi.utils.C27012a;
import com.kubi.utils.extensions.C27046k;
import f00.C37304a;
import g00.InterfaceC37754f;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41769w;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p569qq.C43846g;
import p668un.C45280q;
import p830zf.InterfaceC46801h0;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: LauncherManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u000b\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0016\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@¢\u0006\u0002\u0010\u0017J\b\u0010\u001a\u001a\u00020\u0011H\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/launch/LauncherManager;", "", "<init>", "()V", "delayJob", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/Job;", "startUpDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "com/kubi/launch/LauncherManager$listener$1", "Lcom/kubi/launch/LauncherManager$listener$1;", "launchers", "", "Lcom/kubi/launch/Launcher;", "startLaunch", "", "context", "Lcom/kubi/launch/LauncherContext;", "parseLauncher", "Lcom/kubi/launch/ILauncher;", "afterStart", "(Lcom/kubi/launch/LauncherContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "watchStartUpTimeout", "jumpToNext", "abTestClose", "Companion", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLauncherManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LauncherManager.kt\ncom/kubi/launch/LauncherManager\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 LauncherIssue.kt\ncom/kubi/launch/exception/LauncherIssueKt\n+ 5 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,359:1\n17#2,2:360\n295#3,2:362\n51#4,2:364\n55#4,2:366\n55#4,2:368\n55#4,2:370\n55#4,2:374\n51#4,2:376\n126#5,2:372\n*S KotlinDebug\n*F\n+ 1 LauncherManager.kt\ncom/kubi/launch/LauncherManager\n*L\n121#1:360,2\n123#1:362,2\n125#1:364,2\n192#1:366,2\n213#1:368,2\n222#1:370,2\n330#1:374,2\n308#1:376,2\n253#1:372,2\n*E\n"})
public final class LauncherManager {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Companion f31776e = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final AtomicReference<InterfaceC41775x1> f31777a = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC41769w<Boolean> f31778b = C41777y.m91388c(null, 1, null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public final C17346a f31779c = new C17346a();

    /* JADX INFO: renamed from: d */
    @NotNull
    public final List<Launcher> f31780d = CollectionsKt.listOf((Object[]) new Launcher[]{new RebirthLauncher(), new PendingIntentLauncher(), new TimPushLauncher(), new PushLauncher(), new KuCoinPayLinkLauncher(), new OneLinkLauncher(), new SchemeLauncher(), new WCLauncher()});

    /* JADX INFO: compiled from: LauncherManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/launch/LauncherManager$Companion;", "", "<init>", "()V", "AGREE_PROTOCOL", "", "TAG", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.launch.LauncherManager$a */
    /* JADX INFO: compiled from: LauncherManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/launch/LauncherManager$listener$1", "Lcom/kubi/sdk/startup/StartupDispatcher$IStateListener;", "onStateChanged", "", "newState", "", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17346a implements StartupDispatcher.IStateListener {
        public C17346a() {
        }

        @Override // com.kubi.sdk.startup.StartupDispatcher.IStateListener
        public void onStateChanged(int newState) {
            if (newState >= 4) {
                Log.i("SplashActivity", "enable task finish 1");
                LauncherManager.this.f31778b.mo91370n(Boolean.TRUE);
            }
            if (newState == 4) {
                try {
                    StartupMinorTraceUtils.f48182a.m58419b("task_done");
                } catch (Exception e11) {
                    C44128b.m97263g("SplashActivity", e11);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m37431d() {
        com.kubi.user.config.a.f(false);
        com.kubi.user.config.a.g(false);
        C45280q c45280q = C45280q.f101804a;
        c45280q.m100078p().mo65779a("");
        c45280q.m100078p().mo65780b(new Runnable() { // from class: com.kubi.launch.n
            @Override // java.lang.Runnable
            public final void run() {
                LauncherManager.m37422e();
            }
        }, new Runnable() { // from class: com.kubi.launch.o
            @Override // java.lang.Runnable
            public final void run() {
                LauncherManager.m37423f();
            }
        }, false);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x032b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x0357  */
    /* JADX WARN: Code duplicated, block: B:113:0x0364  */
    /* JADX WARN: Code duplicated, block: B:116:0x0389  */
    /* JADX WARN: Code duplicated, block: B:118:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:34:0x0129  */
    /* JADX WARN: Code duplicated, block: B:37:0x0137  */
    /* JADX WARN: Code duplicated, block: B:39:0x013d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0162  */
    /* JADX WARN: Code duplicated, block: B:43:0x0173  */
    /* JADX WARN: Code duplicated, block: B:45:0x017b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0186  */
    /* JADX WARN: Code duplicated, block: B:50:0x0191  */
    /* JADX WARN: Code duplicated, block: B:51:0x0193  */
    /* JADX WARN: Code duplicated, block: B:53:0x0199 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:58:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:65:0x0227  */
    /* JADX WARN: Code duplicated, block: B:66:0x023c  */
    /* JADX WARN: Code duplicated, block: B:69:0x024e  */
    /* JADX WARN: Code duplicated, block: B:72:0x026d  */
    /* JADX WARN: Code duplicated, block: B:81:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:86:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:88:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:90:0x02db  */
    /* JADX WARN: Code duplicated, block: B:92:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:94:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:96:0x0307  */
    /* JADX WARN: Code duplicated, block: B:97:0x0310  */
    /* JADX WARN: Instruction removed from duplicated block: B:116:0x0389, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x013d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x01d7, please report this as an issue */
    /* JADX INFO: renamed from: n */
    public final Object m37433n(LauncherContext launcherContext, Continuation<? super Unit> continuation) {
        LauncherManager$jumpToNext$1 launcherManager$jumpToNext$1;
        BaseActivity f31802a;
        String f31803b;
        boolean zM37485d;
        LauncherContext launcherContext2;
        boolean z11;
        String str;
        final BaseActivity baseActivity;
        InterfaceC41775x1 andSet;
        SiteService siteService;
        MonitorLevel monitorLevel;
        BaseActivity baseActivity2;
        LauncherContext launcherContext3;
        Object objM57981G;
        String str2;
        C45280q c45280q;
        final String str3;
        Router router;
        final C4400a c4400aM56184f;
        String scheme;
        boolean zM4048k;
        Activity activityM66494h;
        AppRebirth appRebirth;
        String strMo65782d;
        Activity activityM66494h2;
        AppMode.Companion companion;
        LauncherContext launcherContext4 = launcherContext;
        if (continuation instanceof LauncherManager$jumpToNext$1) {
            launcherManager$jumpToNext$1 = (LauncherManager$jumpToNext$1) continuation;
            int i11 = launcherManager$jumpToNext$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                launcherManager$jumpToNext$1.label = i11 - Integer.MIN_VALUE;
            } else {
                launcherManager$jumpToNext$1 = new LauncherManager$jumpToNext$1(this, continuation);
            }
        } else {
            launcherManager$jumpToNext$1 = new LauncherManager$jumpToNext$1(this, continuation);
        }
        LauncherManager$jumpToNext$1 launcherManager$jumpToNext$2 = launcherManager$jumpToNext$1;
        Object obj = launcherManager$jumpToNext$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = launcherManager$jumpToNext$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            f31802a = launcherContext4.getF31802a();
            f31803b = launcherContext4.getF31803b();
            zM37485d = launcherContext4.m37485d();
            LauncherReport.f31812a.m37498c(launcherContext4);
            StartupMinorTraceUtils.f48182a.m58419b("site_await");
            InterfaceC41769w<Boolean> interfaceC41769wM58040g = SiteConfigManager.f47884a.m58040g();
            launcherManager$jumpToNext$2.L$0 = launcherContext4;
            launcherManager$jumpToNext$2.L$1 = f31802a;
            launcherManager$jumpToNext$2.L$2 = f31803b;
            launcherManager$jumpToNext$2.Z$0 = zM37485d;
            launcherManager$jumpToNext$2.label = 1;
            if (interfaceC41769wM58040g.mo91198h(launcherManager$jumpToNext$2) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            boolean z12 = launcherManager$jumpToNext$2.Z$0;
            f31803b = (String) launcherManager$jumpToNext$2.L$2;
            f31802a = (BaseActivity) launcherManager$jumpToNext$2.L$1;
            LauncherContext launcherContext5 = (LauncherContext) launcherManager$jumpToNext$2.L$0;
            ResultKt.throwOnFailure(obj);
            zM37485d = z12;
            launcherContext4 = launcherContext5;
        } else {
            if (i12 == 2) {
                z11 = launcherManager$jumpToNext$2.Z$0;
                String str4 = (String) launcherManager$jumpToNext$2.L$2;
                BaseActivity baseActivity3 = (BaseActivity) launcherManager$jumpToNext$2.L$1;
                LauncherContext launcherContext6 = (LauncherContext) launcherManager$jumpToNext$2.L$0;
                ResultKt.throwOnFailure(obj);
                str = str4;
                baseActivity = baseActivity3;
                launcherContext2 = launcherContext6;
                C44128b.m97266j("SplashActivity", "enable task finish 2");
                andSet = this.f31777a.getAndSet(null);
                if (andSet != null) {
                    InterfaceC41775x1.a.m91377a(andSet, null, 1, null);
                }
                C44128b.m97266j("SplashActivity", "waitStartup end");
                siteService = SiteService.f47793a;
                if (siteService.m58008v()) {
                    launcherContext2.getF31807f().m37504e(10);
                    C44128b.m97266j("SiteService", "state_jump_switch_site splash");
                    SiteService.SwitchFromType switchFromType = SiteService.SwitchFromType.Splash;
                    launcherManager$jumpToNext$2.L$0 = launcherContext2;
                    launcherManager$jumpToNext$2.L$1 = baseActivity;
                    launcherManager$jumpToNext$2.L$2 = str;
                    launcherManager$jumpToNext$2.Z$0 = z11;
                    launcherManager$jumpToNext$2.label = 3;
                    baseActivity2 = baseActivity;
                    launcherContext3 = launcherContext2;
                    monitorLevel = null;
                    objM57981G = SiteService.m57981G(siteService, null, switchFromType, null, null, launcherManager$jumpToNext$2, 13, null);
                    if (objM57981G != coroutine_suspended) {
                        str2 = str;
                        obj = objM57981G;
                        launcherContext2 = launcherContext3;
                        baseActivity = baseActivity2;
                    }
                    return coroutine_suspended;
                }
                monitorLevel = null;
                c45280q = C45280q.f101804a;
                if (!c45280q.m100074l().mo100052a()) {
                    companion = AppMode.INSTANCE;
                    if (companion.isLiteMode()) {
                        companion.updateCurrentMode(AppMode.Pro);
                    }
                }
                if (launcherContext2.getF31805d()) {
                    LaunchIntentHelper.f31789a.m37449e(launcherContext2);
                    baseActivity.finish();
                    return Unit.INSTANCE;
                }
                if ((str != null || str.length() == 0) && z11) {
                    launcherContext2.getF31807f().m37504e(1);
                    C43846g.m96568c(new SplashMessage("SplashActivity jumpNextPage but router is null " + launcherContext2.getF31807f(), "jumpToNext", false, 4, null), monitorLevel, 2, monitorLevel);
                    baseActivity.finish();
                    return Unit.INSTANCE;
                }
                if (str != null || str.length() == 0) {
                    launcherContext2.getF31807f().m37504e(2);
                    C43846g.m96568c(new SplashMessage("SplashActivity jumpNextPage but router is empty , hasAnyBizActivity " + z11, "jumpToNext", false, 4, null), monitorLevel, 2, monitorLevel);
                    str3 = "home";
                } else {
                    str3 = str;
                }
                C44128b.m97266j("SplashActivity", "jumpNextPage routerUrl：" + str3 + " start");
                router = Router.f46192a;
                c4400aM56184f = router.m56184f(str3);
                if (launcherContext2.getF31804c()) {
                    c4400aM56184f.m4052o(c4400aM56184f.m4042e() | 268468224);
                    launcherContext2.getF31807f().m37504e(3);
                } else {
                    launcherContext2.getF31807f().m37504e(4);
                }
                if (!launcherContext2.m37488g().isEmpty()) {
                    c4400aM56184f.m4039b(launcherContext2.m37488g());
                }
                c4400aM56184f.m4038a("modeSwitchUseAtc", Boxing.boxBoolean(true));
                StartupMinorTraceUtils startupMinorTraceUtils = StartupMinorTraceUtils.f48182a;
                startupMinorTraceUtils.m58419b("sensor_ab");
                if (!NewVersionJourneyHelper.f31794a.m37477a() && (activityM66494h2 = C27012a.m66486i().m66494h()) != null && !z11 && !AppRebirth.f47935a.m58167b(activityM66494h2)) {
                    router.m56184f("krn/router?biz=startup&entry=main&component=kc_startup_rn&route=RewardsRegisterPage&loginSource=-1").m4048k();
                    C46392a.m102328k(BaseConstants.f46539a.m56609b(), true);
                    StartupTrace.f48194a.m58458r();
                    activityM66494h2.finish();
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(RouteExKt.m56216G(c4400aM56184f.getUri()), "home") && (strMo65782d = c45280q.m100078p().mo65782d()) != null) {
                    c4400aM56184f.getBundle().putBoolean(strMo65782d, true);
                }
                if (c45280q.m100078p().mo65781c()) {
                    if (c45280q.m100078p().mo65784h()) {
                        activityM66494h = C27012a.m66486i().m66494h();
                        if (!z11) {
                            appRebirth = AppRebirth.f47935a;
                            Intrinsics.checkNotNull(activityM66494h);
                            if (!appRebirth.m58167b(activityM66494h)) {
                                if (c45280q.m100078p().mo65783e()) {
                                    router.m56184f("safe/gestureUnlock").m4050m(c4400aM56184f.m4045h()).m4048k();
                                    activityM66494h.finish();
                                    return Unit.INSTANCE;
                                }
                                C44128b.m97261e("SplashActivity", "开关关退出登录1");
                                m37431d();
                            }
                        }
                    } else {
                        C44128b.m97261e("SplashActivity", "开关关退出登录2");
                        m37431d();
                    }
                }
                scheme = c4400aM56184f.getUri().getScheme();
                if (launcherContext2.getF31807f().getF31814b() != 3 && !z11 && (Intrinsics.areEqual(scheme, "http") || Intrinsics.areEqual(scheme, ProxyConfig.MATCH_HTTPS))) {
                    baseActivity.getWindow().getDecorView().post(new Runnable() { // from class: com.kubi.launch.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            LauncherManager.m37430o(baseActivity, str3, c4400aM56184f);
                        }
                    });
                    return Unit.INSTANCE;
                }
                startupMinorTraceUtils.m58419b("navigation_start");
                if (scheme != null || C17367j.m37480a().contains(scheme)) {
                    zM4048k = c4400aM56184f.m4048k();
                } else {
                    zM4048k = false;
                }
                startupMinorTraceUtils.m58419b("navigation_end");
                C44128b.m97266j("SplashActivity", "jumpNextPage routerUrl：" + str3 + " result:" + zM4048k);
                if (!zM4048k) {
                    C43846g.m96568c(new SplashMessage("SplashActivity jumpNextPage but router not found:" + str + ", " + str3 + ", hasAnyBizActivity " + z11, "jumpToNext", false, 4, null), null, 2, null);
                    if (!z11) {
                        InterfaceC37754f.a.m85132d(C37304a.f82764a, null, null, null, null, null, null, 63, null);
                        baseActivity.getWindow().setFlags(2048, 2048);
                    }
                }
                baseActivity.finish();
                return Unit.INSTANCE;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = launcherManager$jumpToNext$2.Z$0;
            str2 = (String) launcherManager$jumpToNext$2.L$2;
            baseActivity = (BaseActivity) launcherManager$jumpToNext$2.L$1;
            launcherContext2 = (LauncherContext) launcherManager$jumpToNext$2.L$0;
            ResultKt.throwOnFailure(obj);
            monitorLevel = null;
        }
        if (((Boolean) obj).booleanValue()) {
            baseActivity.finish();
            return Unit.INSTANCE;
        }
        C43846g.m96568c(new SplashMessage("SplashActivity startSwitchSite failed, hasAnyBizActivity " + z11, "jumpToNext", false, 4, null), monitorLevel, 2, monitorLevel);
        str = str2;
        c45280q = C45280q.f101804a;
        if (!c45280q.m100074l().mo100052a()) {
            companion = AppMode.INSTANCE;
            if (companion.isLiteMode()) {
                companion.updateCurrentMode(AppMode.Pro);
            }
        }
        if (launcherContext2.getF31805d()) {
            LaunchIntentHelper.f31789a.m37449e(launcherContext2);
            baseActivity.finish();
            return Unit.INSTANCE;
        }
        if (str != null) {
            launcherContext2.getF31807f().m37504e(1);
            C43846g.m96568c(new SplashMessage("SplashActivity jumpNextPage but router is null " + launcherContext2.getF31807f(), "jumpToNext", false, 4, null), monitorLevel, 2, monitorLevel);
            baseActivity.finish();
            return Unit.INSTANCE;
        }
        launcherContext2.getF31807f().m37504e(1);
        C43846g.m96568c(new SplashMessage("SplashActivity jumpNextPage but router is null " + launcherContext2.getF31807f(), "jumpToNext", false, 4, null), monitorLevel, 2, monitorLevel);
        baseActivity.finish();
        return Unit.INSTANCE;
        if (str != null) {
            launcherContext2.getF31807f().m37504e(2);
            C43846g.m96568c(new SplashMessage("SplashActivity jumpNextPage but router is empty , hasAnyBizActivity " + z11, "jumpToNext", false, 4, null), monitorLevel, 2, monitorLevel);
            str3 = "home";
        } else {
            launcherContext2.getF31807f().m37504e(2);
            C43846g.m96568c(new SplashMessage("SplashActivity jumpNextPage but router is empty , hasAnyBizActivity " + z11, "jumpToNext", false, 4, null), monitorLevel, 2, monitorLevel);
            str3 = "home";
        }
        C44128b.m97266j("SplashActivity", "jumpNextPage routerUrl：" + str3 + " start");
        router = Router.f46192a;
        c4400aM56184f = router.m56184f(str3);
        if (launcherContext2.getF31804c()) {
            c4400aM56184f.m4052o(c4400aM56184f.m4042e() | 268468224);
            launcherContext2.getF31807f().m37504e(3);
        } else {
            launcherContext2.getF31807f().m37504e(4);
        }
        if (!launcherContext2.m37488g().isEmpty()) {
            c4400aM56184f.m4039b(launcherContext2.m37488g());
        }
        c4400aM56184f.m4038a("modeSwitchUseAtc", Boxing.boxBoolean(true));
        StartupMinorTraceUtils startupMinorTraceUtils2 = StartupMinorTraceUtils.f48182a;
        startupMinorTraceUtils2.m58419b("sensor_ab");
        if (!NewVersionJourneyHelper.f31794a.m37477a()) {
        }
        if (Intrinsics.areEqual(RouteExKt.m56216G(c4400aM56184f.getUri()), "home")) {
            c4400aM56184f.getBundle().putBoolean(strMo65782d, true);
        }
        if (c45280q.m100078p().mo65781c()) {
            if (c45280q.m100078p().mo65784h()) {
                activityM66494h = C27012a.m66486i().m66494h();
                if (!z11) {
                    appRebirth = AppRebirth.f47935a;
                    Intrinsics.checkNotNull(activityM66494h);
                    if (!appRebirth.m58167b(activityM66494h)) {
                        if (c45280q.m100078p().mo65783e()) {
                            router.m56184f("safe/gestureUnlock").m4050m(c4400aM56184f.m4045h()).m4048k();
                            activityM66494h.finish();
                            return Unit.INSTANCE;
                        }
                        C44128b.m97261e("SplashActivity", "开关关退出登录1");
                        m37431d();
                    }
                }
            } else {
                C44128b.m97261e("SplashActivity", "开关关退出登录2");
                m37431d();
            }
        }
        scheme = c4400aM56184f.getUri().getScheme();
        if (launcherContext2.getF31807f().getF31814b() != 3) {
        }
        startupMinorTraceUtils2.m58419b("navigation_start");
        if (scheme != null) {
            zM4048k = c4400aM56184f.m4048k();
        } else {
            zM4048k = c4400aM56184f.m4048k();
        }
        startupMinorTraceUtils2.m58419b("navigation_end");
        C44128b.m97266j("SplashActivity", "jumpNextPage routerUrl：" + str3 + " result:" + zM4048k);
        if (!zM4048k) {
            C43846g.m96568c(new SplashMessage("SplashActivity jumpNextPage but router not found:" + str + ", " + str3 + ", hasAnyBizActivity " + z11, "jumpToNext", false, 4, null), null, 2, null);
            if (!z11) {
                InterfaceC37754f.a.m85132d(C37304a.f82764a, null, null, null, null, null, null, 63, null);
                baseActivity.getWindow().setFlags(2048, 2048);
            }
        }
        baseActivity.finish();
        return Unit.INSTANCE;
        SiteConfigManager.f47884a.m58037c();
        StartupMinorTraceUtils.f48182a.m58419b("task_await");
        InterfaceC41769w<Boolean> interfaceC41769w = this.f31778b;
        launcherManager$jumpToNext$2.L$0 = launcherContext4;
        launcherManager$jumpToNext$2.L$1 = f31802a;
        launcherManager$jumpToNext$2.L$2 = f31803b;
        launcherManager$jumpToNext$2.Z$0 = zM37485d;
        launcherManager$jumpToNext$2.label = 2;
        if (interfaceC41769w.mo91198h(launcherManager$jumpToNext$2) != coroutine_suspended) {
            BaseActivity baseActivity4 = f31802a;
            launcherContext2 = launcherContext4;
            z11 = zM37485d;
            str = f31803b;
            baseActivity = baseActivity4;
            C44128b.m97266j("SplashActivity", "enable task finish 2");
            andSet = this.f31777a.getAndSet(null);
            if (andSet != null) {
                InterfaceC41775x1.a.m91377a(andSet, null, 1, null);
            }
            C44128b.m97266j("SplashActivity", "waitStartup end");
            siteService = SiteService.f47793a;
            if (siteService.m58008v()) {
                launcherContext2.getF31807f().m37504e(10);
                C44128b.m97266j("SiteService", "state_jump_switch_site splash");
                SiteService.SwitchFromType switchFromType2 = SiteService.SwitchFromType.Splash;
                launcherManager$jumpToNext$2.L$0 = launcherContext2;
                launcherManager$jumpToNext$2.L$1 = baseActivity;
                launcherManager$jumpToNext$2.L$2 = str;
                launcherManager$jumpToNext$2.Z$0 = z11;
                launcherManager$jumpToNext$2.label = 3;
                baseActivity2 = baseActivity;
                launcherContext3 = launcherContext2;
                monitorLevel = null;
                objM57981G = SiteService.m57981G(siteService, null, switchFromType2, null, null, launcherManager$jumpToNext$2, 13, null);
                if (objM57981G != coroutine_suspended) {
                    str2 = str;
                    obj = objM57981G;
                    launcherContext2 = launcherContext3;
                    baseActivity = baseActivity2;
                    if (((Boolean) obj).booleanValue()) {
                        baseActivity.finish();
                        return Unit.INSTANCE;
                    }
                    C43846g.m96568c(new SplashMessage("SplashActivity startSwitchSite failed, hasAnyBizActivity " + z11, "jumpToNext", false, 4, null), monitorLevel, 2, monitorLevel);
                    str = str2;
                }
            } else {
                monitorLevel = null;
            }
            c45280q = C45280q.f101804a;
            if (!c45280q.m100074l().mo100052a()) {
                companion = AppMode.INSTANCE;
                if (companion.isLiteMode()) {
                    companion.updateCurrentMode(AppMode.Pro);
                }
            }
            if (launcherContext2.getF31805d()) {
                LaunchIntentHelper.f31789a.m37449e(launcherContext2);
                baseActivity.finish();
                return Unit.INSTANCE;
            }
            if (str != null) {
                launcherContext2.getF31807f().m37504e(1);
                C43846g.m96568c(new SplashMessage("SplashActivity jumpNextPage but router is null " + launcherContext2.getF31807f(), "jumpToNext", false, 4, null), monitorLevel, 2, monitorLevel);
                baseActivity.finish();
                return Unit.INSTANCE;
            }
            launcherContext2.getF31807f().m37504e(1);
            C43846g.m96568c(new SplashMessage("SplashActivity jumpNextPage but router is null " + launcherContext2.getF31807f(), "jumpToNext", false, 4, null), monitorLevel, 2, monitorLevel);
            baseActivity.finish();
            return Unit.INSTANCE;
            if (str != null) {
                launcherContext2.getF31807f().m37504e(2);
                C43846g.m96568c(new SplashMessage("SplashActivity jumpNextPage but router is empty , hasAnyBizActivity " + z11, "jumpToNext", false, 4, null), monitorLevel, 2, monitorLevel);
                str3 = "home";
            } else {
                launcherContext2.getF31807f().m37504e(2);
                C43846g.m96568c(new SplashMessage("SplashActivity jumpNextPage but router is empty , hasAnyBizActivity " + z11, "jumpToNext", false, 4, null), monitorLevel, 2, monitorLevel);
                str3 = "home";
            }
            C44128b.m97266j("SplashActivity", "jumpNextPage routerUrl：" + str3 + " start");
            router = Router.f46192a;
            c4400aM56184f = router.m56184f(str3);
            if (launcherContext2.getF31804c()) {
                c4400aM56184f.m4052o(c4400aM56184f.m4042e() | 268468224);
                launcherContext2.getF31807f().m37504e(3);
            } else {
                launcherContext2.getF31807f().m37504e(4);
            }
            if (!launcherContext2.m37488g().isEmpty()) {
                c4400aM56184f.m4039b(launcherContext2.m37488g());
            }
            c4400aM56184f.m4038a("modeSwitchUseAtc", Boxing.boxBoolean(true));
            StartupMinorTraceUtils startupMinorTraceUtils3 = StartupMinorTraceUtils.f48182a;
            startupMinorTraceUtils3.m58419b("sensor_ab");
            if (!NewVersionJourneyHelper.f31794a.m37477a()) {
            }
            if (Intrinsics.areEqual(RouteExKt.m56216G(c4400aM56184f.getUri()), "home")) {
                c4400aM56184f.getBundle().putBoolean(strMo65782d, true);
            }
            if (c45280q.m100078p().mo65781c()) {
                if (c45280q.m100078p().mo65784h()) {
                    activityM66494h = C27012a.m66486i().m66494h();
                    if (!z11) {
                        appRebirth = AppRebirth.f47935a;
                        Intrinsics.checkNotNull(activityM66494h);
                        if (!appRebirth.m58167b(activityM66494h)) {
                            if (c45280q.m100078p().mo65783e()) {
                                router.m56184f("safe/gestureUnlock").m4050m(c4400aM56184f.m4045h()).m4048k();
                                activityM66494h.finish();
                                return Unit.INSTANCE;
                            }
                            C44128b.m97261e("SplashActivity", "开关关退出登录1");
                            m37431d();
                        }
                    }
                } else {
                    C44128b.m97261e("SplashActivity", "开关关退出登录2");
                    m37431d();
                }
            }
            scheme = c4400aM56184f.getUri().getScheme();
            if (launcherContext2.getF31807f().getF31814b() != 3) {
            }
            startupMinorTraceUtils3.m58419b("navigation_start");
            if (scheme != null) {
                zM4048k = c4400aM56184f.m4048k();
            } else {
                zM4048k = c4400aM56184f.m4048k();
            }
            startupMinorTraceUtils3.m58419b("navigation_end");
            C44128b.m97266j("SplashActivity", "jumpNextPage routerUrl：" + str3 + " result:" + zM4048k);
            if (!zM4048k) {
                C43846g.m96568c(new SplashMessage("SplashActivity jumpNextPage but router not found:" + str + ", " + str3 + ", hasAnyBizActivity " + z11, "jumpToNext", false, 4, null), null, 2, null);
                if (!z11) {
                    InterfaceC37754f.a.m85132d(C37304a.f82764a, null, null, null, null, null, null, 63, null);
                    baseActivity.getWindow().setFlags(2048, 2048);
                }
            }
            baseActivity.finish();
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: m */
    public final Object m37432m(LauncherContext launcherContext, Continuation<? super Unit> continuation) {
        Object objM91130f = C41713n0.m91130f(new LauncherManager$afterStart$2(launcherContext, this, null), continuation);
        return objM91130f == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91130f : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public final ILauncher m37434p(LauncherContext launcherContext) {
        Object next;
        ILauncher iLauncherM103133d;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46801h0.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null && (iLauncherM103133d = ((InterfaceC46801h0) objM56186h).m103133d(launcherContext)) != null) {
            return iLauncherM103133d;
        }
        try {
            Iterator<T> it = this.f31780d.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((Launcher) next).mo37437a(launcherContext));
            Launcher launcher = (Launcher) next;
            return launcher == null ? new NormalLauncher() : launcher;
        } catch (Exception e11) {
            C43846g.m96568c(new SplashException(e11, "parseLauncher", false, null, 12, null), null, 2, null);
            return new NormalLauncher();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m37435q(@NotNull LauncherContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        StartupDispatcher startupDispatcher = StartupDispatcher.INSTANCE;
        startupDispatcher.addStateListener(this.f31779c);
        int i11 = 1;
        boolean z11 = startupDispatcher.getState() >= 4;
        if (z11) {
            this.f31778b.mo91370n(Boolean.TRUE);
        }
        Map<String, Object> mapM37488g = context.m37488g();
        if (context.m37485d()) {
            i11 = 2;
        } else if (z11) {
            i11 = 3;
        }
        mapM37488g.put("appLauncherType", Integer.valueOf(i11));
        if (context.m37485d()) {
            C27046k.m66703r(context.m37491j());
        }
        C41696j.m91104d(context.m37487f(), null, null, new LauncherManager$startLaunch$1(this, context, null), 3, null);
        if (z11) {
            return;
        }
        C41696j.m91104d(context.m37487f(), null, null, new LauncherManager$startLaunch$2(this, context, null), 3, null);
    }

    /* JADX INFO: renamed from: r */
    public final Object m37436r(LauncherContext launcherContext, Continuation<? super Unit> continuation) {
        Object objM91130f = C41713n0.m91130f(new LauncherManager$watchStartUpTimeout$2(this, launcherContext, null), continuation);
        return objM91130f == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91130f : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final void m37430o(BaseActivity baseActivity, String str, C4400a c4400a) {
        Object objM103844constructorimpl;
        if (!baseActivity.isFinishing() && !baseActivity.isDestroyed()) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(c4400a.m4048k()));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C43846g.m96568c(new SplashException(thM103847exceptionOrNullimpl, "jumpToNext OneLink web navigation", false, null, 12, null), null, 2, null);
            }
            Boolean bool = Boolean.FALSE;
            if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                objM103844constructorimpl = bool;
            }
            if (!((Boolean) objM103844constructorimpl).booleanValue()) {
                InterfaceC37754f.a.m85132d(C37304a.f82764a, null, null, null, null, null, null, 63, null);
            }
            baseActivity.finish();
            return;
        }
        C44128b.m97266j("SplashActivity", "jumpNextPage skip OneLink web navigation, splash destroyed: " + str);
    }

    /* JADX INFO: renamed from: e */
    public static final void m37422e() {
    }

    /* JADX INFO: renamed from: f */
    public static final void m37423f() {
    }
}
