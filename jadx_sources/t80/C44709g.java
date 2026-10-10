package t80;

import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.media3.common.MimeTypes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.util.Constants;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.sdk.web.KWebView;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: t80.g */
/* JADX INFO: compiled from: KWebViewWarmupManager.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u001e\bÆ\u0002\u0018\u00002\u00020\u0001:\u00015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010 \u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%J\u0016\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0005J\u0010\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020\u0005H\u0002J\u0010\u0010+\u001a\u00020!2\u0006\u0010'\u001a\u00020\u0005H\u0002J\b\u0010,\u001a\u00020\u0013H\u0002J\n\u0010-\u001a\u0004\u0018\u00010\u0005H\u0002J\u0015\u0010.\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\bH\u0000¢\u0006\u0002\b0J\b\u00101\u001a\u00020\bH\u0002J\u0019\u00102\u001a\u00020!2\u000e\b\u0004\u00103\u001a\b\u0012\u0004\u0012\u00020!04H\u0082\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001f¨\u00066"}, m90084d2 = {"Lcom/kubi/widget/web/manager/KWebViewWarmupManager;", "", "<init>", "()V", "TAG", "", "ENABLE_KEY", "REPLENISH_DELAY_MS", "", "ANDROID_10_API", "", "ANDROID_12_API", "ANDROID_12L_API", "FOUR_GB_BYTES", "mainHandler", "Landroid/os/Handler;", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "initialized", "", "creating", "cachedWebView", "Lcom/kubi/sdk/web/KWebView;", "cachedContext", "Landroid/content/MutableContextWrapper;", "cachedFirstWebViewWarmup", "hasCreatedFirstWarmup", "replenishTask", "Ljava/lang/Runnable;", "componentCallbacks", "com/kubi/widget/web/manager/KWebViewWarmupManager$componentCallbacks$1", "Lcom/kubi/widget/web/manager/KWebViewWarmupManager$componentCallbacks$1;", "initialize", "", "acquireIfReady", "Lcom/kubi/widget/web/manager/KWebViewWarmupManager$KWebViewWarmupResult;", "context", "Landroid/content/Context;", "onPageTerminal", "reason", "url", "ensureCachedInstance", "trigger", "clearCachedInstance", Constants.ENABLE_DISABLE, "getDeviceDisabledReason", "isAndroid12MemoryAllowed", "totalMemBytes", "isAndroid12MemoryAllowed$LWebWidget_googleRelease", "getTotalMemoryBytes", "runOnMain", "block", "Lkotlin/Function0;", "KWebViewWarmupResult", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKWebViewWarmupManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KWebViewWarmupManager.kt\ncom/kubi/widget/web/manager/KWebViewWarmupManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,237:1\n225#1,6:238\n225#1,6:244\n1#2:250\n35#3,4:251\n39#3:257\n44#4,2:255\n*S KotlinDebug\n*F\n+ 1 KWebViewWarmupManager.kt\ncom/kubi/widget/web/manager/KWebViewWarmupManager\n*L\n63#1:238,6\n118#1:244,6\n186#1:251,4\n186#1:257\n186#1:255,2\n*E\n"})
public final class C44709g {

    /* JADX INFO: renamed from: c */
    @Nullable
    public static Application f99498c;

    /* JADX INFO: renamed from: d */
    public static boolean f99499d;

    /* JADX INFO: renamed from: e */
    public static boolean f99500e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public static KWebView f99501f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public static MutableContextWrapper f99502g;

    /* JADX INFO: renamed from: h */
    public static boolean f99503h;

    /* JADX INFO: renamed from: i */
    public static boolean f99504i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public static Runnable f99505j;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C44709g f99496a = new C44709g();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Handler f99497b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final b f99506k = new b();

    /* JADX INFO: renamed from: t80.g$a, reason: from toString */
    /* JADX INFO: compiled from: KWebViewWarmupManager.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/widget/web/manager/KWebViewWarmupManager$KWebViewWarmupResult;", "", "webView", "Lcom/kubi/sdk/web/KWebView;", "firstWebViewWarmup", "", "<init>", "(Lcom/kubi/sdk/web/KWebView;Z)V", "getWebView", "()Lcom/kubi/sdk/web/KWebView;", "getFirstWebViewWarmup", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class KWebViewWarmupResult {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final KWebView webView;

        /* JADX INFO: renamed from: b, reason: from toString */
        public final boolean firstWebViewWarmup;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof KWebViewWarmupResult)) {
                return false;
            }
            KWebViewWarmupResult kWebViewWarmupResult = (KWebViewWarmupResult) other;
            return Intrinsics.areEqual(this.webView, kWebViewWarmupResult.webView) && this.firstWebViewWarmup == kWebViewWarmupResult.firstWebViewWarmup;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getFirstWebViewWarmup() {
            return this.firstWebViewWarmup;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final KWebView getWebView() {
            return this.webView;
        }

        public int hashCode() {
            return (this.webView.hashCode() * 31) + Boolean.hashCode(this.firstWebViewWarmup);
        }

        @NotNull
        public String toString() {
            return "KWebViewWarmupResult(webView=" + this.webView + ", firstWebViewWarmup=" + this.firstWebViewWarmup + ')';
        }

        public KWebViewWarmupResult(@NotNull KWebView webView, boolean z11) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            this.webView = webView;
            this.firstWebViewWarmup = z11;
        }
    }

    /* JADX INFO: renamed from: t80.g$b */
    /* JADX INFO: compiled from: KWebViewWarmupManager.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/widget/web/manager/KWebViewWarmupManager$componentCallbacks$1", "Landroid/content/ComponentCallbacks2;", "onTrimMemory", "", FirebaseAnalytics.Param.LEVEL, "", "onLowMemory", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nKWebViewWarmupManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KWebViewWarmupManager.kt\ncom/kubi/widget/web/manager/KWebViewWarmupManager$componentCallbacks$1\n+ 2 KWebViewWarmupManager.kt\ncom/kubi/widget/web/manager/KWebViewWarmupManager\n*L\n1#1,237:1\n225#2,6:238\n225#2,6:244\n*S KotlinDebug\n*F\n+ 1 KWebViewWarmupManager.kt\ncom/kubi/widget/web/manager/KWebViewWarmupManager$componentCallbacks$1\n*L\n52#1:238,6\n56#1:244,6\n*E\n"})
    public static final class b implements ComponentCallbacks2 {

        /* JADX INFO: renamed from: t80.g$b$a */
        /* JADX INFO: compiled from: KWebViewWarmupManager.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nKWebViewWarmupManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KWebViewWarmupManager.kt\ncom/kubi/widget/web/manager/KWebViewWarmupManager$runOnMain$1\n+ 2 KWebViewWarmupManager.kt\ncom/kubi/widget/web/manager/KWebViewWarmupManager$componentCallbacks$1\n*L\n1#1,237:1\n56#2:238\n*E\n"})
        public static final class a implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                C44709g.f99496a.m98932s("low_memory");
            }
        }

        /* JADX INFO: renamed from: t80.g$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: KWebViewWarmupManager.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nKWebViewWarmupManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KWebViewWarmupManager.kt\ncom/kubi/widget/web/manager/KWebViewWarmupManager$runOnMain$1\n+ 2 KWebViewWarmupManager.kt\ncom/kubi/widget/web/manager/KWebViewWarmupManager$componentCallbacks$1\n*L\n1#1,237:1\n52#2:238\n*E\n"})
        public static final class RunnableC47028b implements Runnable {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f99509b;

            public RunnableC47028b(int i11) {
                this.f99509b = i11;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C44709g.f99496a.m98932s("trim_memory_" + this.f99509b);
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            C44709g c44709g = C44709g.f99496a;
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                C44709g.f99496a.m98932s("low_memory");
            } else {
                C44709g.f99497b.post(new a());
            }
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int level) {
            if (level == 20) {
                return;
            }
            C44709g c44709g = C44709g.f99496a;
            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                C44709g.f99497b.post(new RunnableC47028b(level));
                return;
            }
            C44709g.f99496a.m98932s("trim_memory_" + level);
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration newConfig) {
            Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        }
    }

    /* JADX INFO: renamed from: t80.g$c */
    /* JADX INFO: compiled from: KWebViewWarmupManager.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nKWebViewWarmupManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KWebViewWarmupManager.kt\ncom/kubi/widget/web/manager/KWebViewWarmupManager$runOnMain$1\n+ 2 KWebViewWarmupManager.kt\ncom/kubi/widget/web/manager/KWebViewWarmupManager\n*L\n1#1,237:1\n64#2,12:238\n*E\n"})
    public static final class c implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Application f99510b;

        public c(Application application) {
            this.f99510b = application;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!C44709g.f99499d) {
                C44709g.f99498c = this.f99510b;
                this.f99510b.registerComponentCallbacks(C44709g.f99506k);
                C44709g.f99499d = true;
            }
            C44709g c44709g = C44709g.f99496a;
            boolean zM98929D = c44709g.m98929D();
            C44128b.m97266j("KWebWarmup", "initialize enabled=" + zM98929D);
            if (zM98929D) {
                c44709g.m98933y("first_page");
            }
        }
    }

    /* JADX INFO: renamed from: t80.g$d */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class d extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: t80.g$e */
    /* JADX INFO: compiled from: KWebViewWarmupManager.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nKWebViewWarmupManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KWebViewWarmupManager.kt\ncom/kubi/widget/web/manager/KWebViewWarmupManager$runOnMain$1\n+ 2 KWebViewWarmupManager.kt\ncom/kubi/widget/web/manager/KWebViewWarmupManager\n*L\n1#1,237:1\n119#2,14:238\n*E\n"})
    public static final class e implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f99511b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f99512c;

        public e(String str, String str2) {
            this.f99511b = str;
            this.f99512c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C44709g.f99499d && C44709g.f99496a.m98929D() && C44709g.f99501f == null && !C44709g.f99500e && C44709g.f99505j == null) {
                f fVar = new f(this.f99511b);
                C44709g.f99505j = fVar;
                C44709g.f99497b.postDelayed(fVar, 0L);
                C44128b.m97266j("KWebWarmup", "replenish scheduled reason=" + this.f99511b + " delayMs=0 url=" + this.f99512c);
            }
        }
    }

    /* JADX INFO: renamed from: t80.g$f */
    /* JADX INFO: compiled from: KWebViewWarmupManager.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class f implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f99513b;

        @Override // java.lang.Runnable
        public final void run() {
            C44709g.f99505j = null;
            C44709g.f99496a.m98933y("terminal_" + this.f99513b);
        }

        public f(String str) {
            this.f99513b = str;
        }
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m98922u(KWebView kWebView) {
        kWebView.setWebChromeClient(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final long m98926A() {
        Application application = f99498c;
        if (application == null) {
            return 0L;
        }
        Object systemService = application.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null) {
            return 0L;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    /* JADX INFO: renamed from: B */
    public final void m98927B(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            f99497b.post(new c(application));
            return;
        }
        if (!f99499d) {
            f99498c = application;
            application.registerComponentCallbacks(f99506k);
            f99499d = true;
        }
        C44709g c44709g = f99496a;
        boolean zM98929D = c44709g.m98929D();
        C44128b.m97266j("KWebWarmup", "initialize enabled=" + zM98929D);
        if (zM98929D) {
            c44709g.m98933y("first_page");
        }
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public final KWebViewWarmupResult m98931r(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            C44128b.m97266j("KWebWarmup", "acquire miss reason=not_main_thread");
            return null;
        }
        if (!m98929D()) {
            m98932s("switch_off");
            C44128b.m97266j("KWebWarmup", "acquire miss enabled=false");
            return null;
        }
        KWebView kWebView = f99501f;
        if (kWebView == null) {
            C44128b.m97266j("KWebWarmup", "acquire miss reason=empty");
            return null;
        }
        MutableContextWrapper mutableContextWrapper = f99502g;
        if (mutableContextWrapper == null) {
            m98932s("missing_context");
            C44128b.m97266j("KWebWarmup", "acquire miss reason=missing_context");
            return null;
        }
        if (kWebView.getParent() != null) {
            m98932s("unexpected_parent");
            C44128b.m97266j("KWebWarmup", "acquire miss reason=unexpected_parent");
            return null;
        }
        KWebViewWarmupResult kWebViewWarmupResult = new KWebViewWarmupResult(kWebView, f99503h);
        f99501f = null;
        f99502g = null;
        f99503h = false;
        mutableContextWrapper.setBaseContext(context);
        C44128b.m97266j("KWebWarmup", "acquire hit context=" + context.getClass().getSimpleName() + " firstWebViewWarmup=" + kWebViewWarmupResult.getFirstWebViewWarmup());
        return kWebViewWarmupResult;
    }

    /* JADX INFO: renamed from: s */
    public final void m98932s(String str) {
        Runnable runnable = f99505j;
        if (runnable != null) {
            f99497b.removeCallbacks(runnable);
        }
        f99505j = null;
        final KWebView kWebView = f99501f;
        if (kWebView == null) {
            return;
        }
        f99501f = null;
        f99502g = null;
        f99503h = false;
        C44128b.m97266j("KWebWarmup", "clear cached reason=" + str);
        C27100x0.m66924e(new Function0() { // from class: t80.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C44709g.m98921t(kWebView);
            }
        });
        C27100x0.m66924e(new Function0() { // from class: t80.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C44709g.m98922u(kWebView);
            }
        });
        C27100x0.m66924e(new Function0() { // from class: t80.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C44709g.m98923v(kWebView);
            }
        });
        C27100x0.m66924e(new Function0() { // from class: t80.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C44709g.m98924w(kWebView);
            }
        });
        if (Build.VERSION.SDK_INT == 35 && StringsKt.equals(Build.MODEL, "Redmi 13C", true)) {
            C44128b.m97266j("KWebWarmup", "clear bypass destroy reason=known_webview_crash");
        } else {
            C27100x0.m66924e(new Function0() { // from class: t80.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C44709g.m98925x(kWebView);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m98933y(String str) {
        if (f99501f != null || f99500e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("create skip trigger=");
            sb2.append(str);
            sb2.append(" hasCached=");
            sb2.append(f99501f != null);
            sb2.append(" creating=");
            sb2.append(f99500e);
            C44128b.m97266j("KWebWarmup", sb2.toString());
            return;
        }
        Application application = f99498c;
        if (application == null) {
            C44128b.m97266j("KWebWarmup", "create skip trigger=" + str + " reason=not_initialized");
            return;
        }
        f99500e = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            boolean z11 = !f99504i;
            MutableContextWrapper mutableContextWrapper = new MutableContextWrapper(application.getApplicationContext());
            f99501f = new KWebView(mutableContextWrapper);
            f99502g = mutableContextWrapper;
            f99503h = z11;
            f99504i = true;
            C44128b.m97266j("KWebWarmup", "create success trigger=" + str + " firstWebViewWarmup=" + z11 + " costMs=" + (SystemClock.elapsedRealtime() - jElapsedRealtime));
            f99500e = false;
        } catch (Throwable th2) {
            try {
                f99501f = null;
                f99502g = null;
                f99503h = false;
                SystemClock.elapsedRealtime();
                C44128b.m97266j("KWebWarmup", "create failed trigger=" + str + " error=" + th2.getClass().getSimpleName() + " message=" + th2.getMessage());
            } finally {
                f99500e = false;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final String m98934z() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 == 29) {
            return "android_10";
        }
        if (i11 != 31 && i11 != 32) {
            return null;
        }
        long jM98926A = m98926A();
        if (m98928C(jM98926A)) {
            return null;
        }
        return "android_12_memory_not_allowed totalMem=" + jM98926A;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m98921t(KWebView kWebView) {
        kWebView.stopLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m98923v(KWebView kWebView) {
        kWebView.removeAllViews();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m98924w(KWebView kWebView) {
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

    /* JADX INFO: renamed from: x */
    public static final Unit m98925x(KWebView kWebView) {
        kWebView.destroy();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m98929D() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new d().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("webview_warmup_enable", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        if (!C27025c.m66567e((Boolean) objM20457a, true)) {
            return false;
        }
        String strM98934z = m98934z();
        if (strM98934z == null) {
            return true;
        }
        C44128b.m97266j("KWebWarmup", "disabled by device reason=" + strM98934z);
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final void m98930E(@NotNull String reason, @NotNull String url) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(url, "url");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            if (f99499d && f99496a.m98929D() && f99501f == null && !f99500e && f99505j == null) {
                f fVar = new f(reason);
                f99505j = fVar;
                f99497b.postDelayed(fVar, 0L);
                C44128b.m97266j("KWebWarmup", "replenish scheduled reason=" + reason + " delayMs=0 url=" + url);
                return;
            }
            return;
        }
        f99497b.post(new e(reason, url));
    }

    /* JADX INFO: renamed from: C */
    public final boolean m98928C(long j11) {
        if (j11 > 4294967296L) {
            return true;
        }
        return false;
    }
}
