package com.kubi.lite.p098ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsetsController;
import android.widget.FrameLayout;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blankj.utilcode.util.C5270g;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.lite.R$color;
import com.kubi.lite.R$layout;
import com.kubi.lite.exception.LiteMessage;
import com.kubi.lite.utils.CheckUpgradeHelper;
import com.kubi.lite.utils.LiteState;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.flutter.delegate.FlutterViewDelegate;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.mode.SwitchConfig;
import com.kubi.sdk.mode.widget.HomeMaskView;
import com.kubi.sdk.mode.widget.SwitchLayout;
import com.kubi.sdk.startup.IStartupActivity;
import com.kubi.sdk.util.IDisableEdgeToEdge;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27012a;
import com.kubi.utils.C27059l;
import com.kubi.utils.C27077o;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import f00.C37304a;
import g00.InterfaceC37764p;
import java.util.Iterator;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41769w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p569qq.C43846g;
import p731wn.C45895a;
import p742wz.C45960a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import tz.C45079a;
import vn.InterfaceC45608b;
import w00.C45678b;
import y70.C46392a;

/* JADX INFO: compiled from: LiteFlutterActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 B2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001BB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\u000e\u0010\u0019\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0015H\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0002J\b\u0010\u001e\u001a\u00020\u0015H\u0002J\b\u0010\u001f\u001a\u00020\u0015H\u0014J\b\u0010 \u001a\u00020\u0015H\u0014J\b\u0010!\u001a\u00020\u0015H\u0014J\u0010\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0015H\u0014J\b\u0010&\u001a\u00020\u0015H\u0014J\u0012\u0010'\u001a\u00020\u00152\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\"\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\b\u0010.\u001a\u0004\u0018\u00010)H\u0014J\b\u0010/\u001a\u00020\u0015H\u0016J-\u00100\u001a\u00020\u00152\u0006\u0010+\u001a\u00020,2\u000e\u00101\u001a\n\u0012\u0006\b\u0001\u0012\u000203022\u0006\u00104\u001a\u000205H\u0016¢\u0006\u0002\u00106J\u0010\u00107\u001a\u00020\u00152\u0006\u00108\u001a\u00020,H\u0016J\b\u00109\u001a\u00020\u0015H\u0014J\b\u0010:\u001a\u00020\u0015H\u0016J\b\u0010;\u001a\u00020\u0015H\u0014J\b\u0010<\u001a\u00020\u0015H\u0016J\u0014\u0010=\u001a\u00020\u0015*\u00020>2\u0006\u0010?\u001a\u00020$H\u0002J\b\u0010@\u001a\u00020\u0015H\u0002J\b\u0010A\u001a\u00020\u0015H\u0002R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000¨\u0006C"}, m90084d2 = {"Lcom/kubi/lite/ui/LiteFlutterActivity;", "Lcom/kubi/sdk/BaseActivity;", "Lcom/kubi/lite/api/ILiteFlutterEntryActivity;", "Lcom/kubi/sdk/util/IDisableEdgeToEdge;", "<init>", "()V", "binding", "Lcom/kubi/lite/databinding/LiteFlutterLayoutBinding;", "getBinding", "()Lcom/kubi/lite/databinding/LiteFlutterLayoutBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "delegate", "Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;", "isLoaded", "Ljava/util/concurrent/atomic/AtomicBoolean;", "upgradeHelper", "Lcom/kubi/lite/utils/CheckUpgradeHelper;", "maskView", "Lcom/kubi/sdk/mode/widget/HomeMaskView;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setSystemUI", "onFlutterDisplayed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onLoading", "loadingWithoutAnimation", "loadingWithAnimation", "onLoaded", "onResume", "onPostResume", "onStart", "onWindowFocusChanged", "hasFocus", "", "onStop", "onPause", "onNewIntent", "intent", "Landroid/content/Intent;", "onActivityResult", "requestCode", "", "resultCode", "data", "onBackPressed", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onTrimMemory", FirebaseAnalytics.Param.LEVEL, "onUserLeaveHint", "onPreFinish", "onDestroy", "finish", "setStatusBarDarkIcons", "Landroid/app/Activity;", "darkIcons", "checkAndJumpToLogin", "restart", "Companion", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLiteFlutterActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiteFlutterActivity.kt\ncom/kubi/lite/ui/LiteFlutterActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n+ 3 LiteIssue.kt\ncom/kubi/lite/exception/LiteIssueKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,397:1\n45#2,19:398\n49#3,2:417\n126#4,2:419\n76#5,7:421\n1#6:428\n*S KotlinDebug\n*F\n+ 1 LiteFlutterActivity.kt\ncom/kubi/lite/ui/LiteFlutterActivity\n*L\n119#1:398,19\n134#1:417,2\n146#1:419,2\n149#1:421,7\n*E\n"})
public final class LiteFlutterActivity extends BaseActivity implements InterfaceC45608b, IDisableEdgeToEdge {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final InterfaceC24293a f32190i = C45678b.m100788b(this, new Function1<C45895a, Unit>() { // from class: com.kubi.lite.ui.LiteFlutterActivity$special$$inlined$viewBindingActivity$default$1
        public final void invoke(@NotNull C45895a it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45895a c45895a) {
            invoke(c45895a);
            return Unit.INSTANCE;
        }
    }, new Function1<LiteFlutterActivity, C45895a>() { // from class: com.kubi.lite.ui.LiteFlutterActivity$special$$inlined$viewBindingActivity$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45895a invoke(@NotNull LiteFlutterActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return C45895a.m101360a(C45678b.m100787a(activity));
        }
    });

    /* JADX INFO: renamed from: j */
    @NotNull
    public final FlutterViewDelegate f32191j = new FlutterViewDelegate();

    /* JADX INFO: renamed from: k */
    @NotNull
    public final AtomicBoolean f32192k = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l */
    @NotNull
    public final CheckUpgradeHelper f32193l = new CheckUpgradeHelper(this);

    /* JADX INFO: renamed from: m */
    public HomeMaskView f32194m;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ KProperty<Object>[] f32189o = {Reflection.property1(new PropertyReference1Impl(LiteFlutterActivity.class, "binding", "getBinding()Lcom/kubi/lite/databinding/LiteFlutterLayoutBinding;", 0))};

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final Companion f32188n = new Companion(null);

    /* JADX INFO: compiled from: LiteFlutterActivity.kt */
    /* JADX INFO: loaded from: classes24.dex */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bJ\u0012\u0010\r\u001a\u00020\u0007*\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000fJ\u0012\u0010\u0010\u001a\u00020\u0007*\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/lite/ui/LiteFlutterActivity$Companion;", "", "<init>", "()V", "TAG", "", InterfaceC33617e1.f69659h, "", "bundle", "Landroid/os/Bundle;", "animation", "", "forceNoAnim", "showAnimationInAsync", "Lcom/kubi/sdk/mode/widget/SwitchLayout;", "(Lcom/kubi/sdk/mode/widget/SwitchLayout;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showAnimationOutAsync", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nLiteFlutterActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiteFlutterActivity.kt\ncom/kubi/lite/ui/LiteFlutterActivity$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,397:1\n1761#2,3:398\n*S KotlinDebug\n*F\n+ 1 LiteFlutterActivity.kt\ncom/kubi/lite/ui/LiteFlutterActivity$Companion\n*L\n73#1:398,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Object showAnimationInAsync(@NotNull SwitchLayout switchLayout, @NotNull Continuation<? super Unit> continuation) {
            final InterfaceC41769w interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
            if (switchLayout.m57310B()) {
                C44128b.m97259c("LiteFlutterActivity", "showAnimationIn skip when fromEqualTo");
                return Unit.INSTANCE;
            }
            C44128b.m97259c("LiteFlutterActivity", "showAnimationIn start");
            switchLayout.m57313I(new Function0() { // from class: com.kubi.lite.ui.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LiteFlutterActivity.Companion.m37683c(interfaceC41769wM91388c);
                }
            });
            Object objMo91198h = interfaceC41769wM91388c.mo91198h(continuation);
            return objMo91198h == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo91198h : Unit.INSTANCE;
        }

        @Nullable
        public final Object showAnimationOutAsync(@NotNull SwitchLayout switchLayout, @NotNull Continuation<? super Unit> continuation) {
            final InterfaceC41769w interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
            C44128b.m97259c("LiteFlutterActivity", "showAnimationOut start");
            switchLayout.m57314K(new Function0() { // from class: com.kubi.lite.ui.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LiteFlutterActivity.Companion.m37684d(interfaceC41769wM91388c);
                }
            });
            Object objMo91198h = interfaceC41769wM91388c.mo91198h(continuation);
            return objMo91198h == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo91198h : Unit.INSTANCE;
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: c */
        public static final Unit m37683c(InterfaceC41769w interfaceC41769w) {
            Unit unit = Unit.INSTANCE;
            interfaceC41769w.mo91370n(unit);
            C44128b.m97259c("LiteFlutterActivity", "showAnimationIn end");
            return unit;
        }

        /* JADX INFO: renamed from: d */
        public static final Unit m37684d(InterfaceC41769w interfaceC41769w) {
            Unit unit = Unit.INSTANCE;
            interfaceC41769w.mo91370n(unit);
            C44128b.m97259c("LiteFlutterActivity", "showAnimationOut end");
            return unit;
        }

        public static /* synthetic */ void launch$default(Companion companion, Bundle bundle, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            if ((i11 & 4) != 0) {
                z12 = false;
            }
            companion.launch(bundle, z11, z12);
        }

        public final void launch(@NotNull Bundle bundle, boolean animation, boolean forceNoAnim) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Context contextM66757a = C27059l.f54343a.m66757a();
            Intent intent = new Intent(contextM66757a, (Class<?>) LiteFlutterActivity.class);
            boolean zM37696b = LiteState.f32201a.m37696b();
            Stack<Activity> stackM66493g = C27012a.m66486i().m66493g();
            Intrinsics.checkNotNullExpressionValue(stackM66493g, "getActivityStack(...)");
            boolean z11 = false;
            if (stackM66493g == null || !stackM66493g.isEmpty()) {
                Iterator<T> it = stackM66493g.iterator();
                while (it.hasNext()) {
                    if (!(((Activity) it.next()) instanceof IStartupActivity)) {
                        z11 = true;
                        break;
                    }
                }
            }
            intent.putExtras(bundle);
            FragmentActivity fragmentActivity = contextM66757a instanceof FragmentActivity ? (FragmentActivity) contextM66757a : null;
            if ((animation || (!zM37696b && z11)) && fragmentActivity != null && !forceNoAnim) {
                boolean zM101394i = C45960a.f103398a.m101394i(fragmentActivity, intent);
                C44128b.m97266j("LiteTag", "LiteFlutterActivity 切换动画 = " + zM101394i);
                if (zM101394i) {
                    return;
                }
            }
            if (!zM37696b) {
                intent.addFlags(32768);
                if (!(contextM66757a instanceof Activity)) {
                    intent.addFlags(268435456);
                }
            }
            contextM66757a.startActivity(intent);
            C44128b.m97266j("LiteTag", "LiteFlutterActivity 未使用动画打开钱包");
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        super.onCreate(null);
        getTitleBar().m58934f();
        C44128b.m97266j("LiteTag", "LiteFlutterActivity onCreate");
        setContentView(R$layout.lite_flutter_layout);
        m37677g0();
        C45895a c45895aM37678Y = m37678Y();
        if (c45895aM37678Y == null) {
            C43846g.m96568c(new LiteMessage("bing = null", "LiteFlutterActivity", false, 4, null), null, 2, null);
            finish();
            return;
        }
        HomeMaskView maskView$default = HomeMaskView.Companion.setMaskView$default(HomeMaskView.f47143d, this, AppMode.Lite, false, 4, null);
        if (maskView$default == null) {
            finish();
            return;
        }
        this.f32194m = maskView$default;
        this.f32191j.m56761i();
        this.f32191j.m56755U(CollectionsKt.listOf("entry=liteMode"));
        this.f32191j.m56764l(this);
        FlutterViewDelegate flutterViewDelegate = this.f32191j;
        FrameLayout flutterContainer = c45895aM37678Y.f103366b;
        Intrinsics.checkNotNullExpressionValue(flutterContainer, "flutterContainer");
        FlutterViewDelegate.m56724D(flutterViewDelegate, this, flutterContainer, false, 4, null);
        C46392a.m102328k(C45079a.f101482a.m99687a(), true);
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.event.FlutterEvent:flutterCommonEvent".length();
        }
        C12572a.m23692a(this, false, new LiteFlutterActivity$onCreate$$inlined$bindFlowEvent$default$1("com.kubi.event.FlutterEvent:flutterCommonEvent", null, this));
    }

    /* JADX INFO: renamed from: Z */
    private final void m37672Z() {
        AppMode appModeFromStringDefault;
        if (m37678Y() == null) {
            return;
        }
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        String strM56280w = RouteExKt.m56280w(intent, "from");
        if (strM56280w == null || (appModeFromStringDefault = AppMode.INSTANCE.fromStringDefault(strM56280w, AppMode.Pro)) == null) {
            appModeFromStringDefault = AppMode.Pro;
        }
        AppMode appMode = appModeFromStringDefault;
        HomeMaskView homeMaskView = this.f32194m;
        if (homeMaskView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("maskView");
            homeMaskView = null;
        }
        SwitchLayout sharedView = homeMaskView.getSharedView();
        if (sharedView != null) {
            sharedView.m57317y(new SwitchConfig(appMode, AppMode.Lite, false, false, false, 100L, 400L, 0L, 600L, null, true, 660, null));
        }
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new LiteFlutterActivity$loadingWithAnimation$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public final void m37674c0() throws JSONException {
        this.f32191j.m56738A();
        this.f32193l.m37690f();
        C45960a.f103398a.m101388c();
    }

    /* JADX INFO: renamed from: Y */
    public final C45895a m37678Y() {
        return (C45895a) this.f32190i.getValue(this, f32189o[0]);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        if (r6.showAnimationOutAsync(r9, r0) == r1) goto L30;
     */
    /* JADX INFO: renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m37679b0(Continuation<? super Unit> continuation) {
        LiteFlutterActivity$onFlutterDisplayed$1 liteFlutterActivity$onFlutterDisplayed$1;
        C45895a c45895aM37678Y;
        HomeMaskView homeMaskView;
        if (continuation instanceof LiteFlutterActivity$onFlutterDisplayed$1) {
            liteFlutterActivity$onFlutterDisplayed$1 = (LiteFlutterActivity$onFlutterDisplayed$1) continuation;
            int i11 = liteFlutterActivity$onFlutterDisplayed$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                liteFlutterActivity$onFlutterDisplayed$1.label = i11 - Integer.MIN_VALUE;
            } else {
                liteFlutterActivity$onFlutterDisplayed$1 = new LiteFlutterActivity$onFlutterDisplayed$1(this, continuation);
            }
        } else {
            liteFlutterActivity$onFlutterDisplayed$1 = new LiteFlutterActivity$onFlutterDisplayed$1(this, continuation);
        }
        Object obj = liteFlutterActivity$onFlutterDisplayed$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = liteFlutterActivity$onFlutterDisplayed$1.label;
        HomeMaskView homeMaskView2 = null;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c45895aM37678Y = m37678Y();
            if (c45895aM37678Y == null) {
                return Unit.INSTANCE;
            }
            liteFlutterActivity$onFlutterDisplayed$1.L$0 = c45895aM37678Y;
            liteFlutterActivity$onFlutterDisplayed$1.label = 1;
            if (DelayKt.m90350b(200L, liteFlutterActivity$onFlutterDisplayed$1) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            c45895aM37678Y = (C45895a) liteFlutterActivity$onFlutterDisplayed$1.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        homeMaskView = this.f32194m;
        if (homeMaskView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("maskView");
        } else {
            homeMaskView2 = homeMaskView;
        }
        homeMaskView2.m57278a();
        return Unit.INSTANCE;
        FrameLayout flutterContainer = c45895aM37678Y.f103366b;
        Intrinsics.checkNotNullExpressionValue(flutterContainer, "flutterContainer");
        ViewExtKt.m66594y(flutterContainer);
        HomeMaskView homeMaskView3 = this.f32194m;
        if (homeMaskView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("maskView");
            homeMaskView3 = null;
        }
        SwitchLayout sharedView = homeMaskView3.getSharedView();
        if (sharedView != null) {
            Companion companion = f32188n;
            liteFlutterActivity$onFlutterDisplayed$1.L$0 = SpillingKt.nullOutSpilledVariable(c45895aM37678Y);
            liteFlutterActivity$onFlutterDisplayed$1.label = 2;
        }
        homeMaskView = this.f32194m;
        if (homeMaskView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("maskView");
        } else {
            homeMaskView2 = homeMaskView;
        }
        homeMaskView2.m57278a();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m37680f0(Activity activity, boolean z11) {
        if (Build.VERSION.SDK_INT < 30) {
            View decorView = activity.getWindow().getDecorView();
            decorView.setSystemUiVisibility(z11 ? decorView.getSystemUiVisibility() | 8192 : decorView.getSystemUiVisibility() & (-8193));
        } else {
            WindowInsetsController insetsController = activity.getWindow().getInsetsController();
            if (insetsController != null) {
                insetsController.setSystemBarsAppearance(z11 ? 8 : 0, 8);
            }
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f32191j.m56739B()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.kubi.sdk.BaseActivity
    public void onPreFinish() {
        C44128b.m97266j("LiteTag", "LiteFlutterActivity onPreFinish");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) throws Throwable {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        this.f32191j.m56747M(requestCode, permissions, grantResults);
    }

    /* JADX INFO: renamed from: X */
    private final void m37671X() {
        Bundle extras;
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null && RouteExKt.m56250h(extras, "toLogin")) {
            InterfaceC37764p.a.m85181b(C37304a.f82764a, null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
            intent.removeExtra("toLogin");
        }
    }

    /* JADX INFO: renamed from: a0 */
    private final void m37673a0() throws JSONException {
        C45895a c45895aM37678Y = m37678Y();
        if (c45895aM37678Y == null) {
            return;
        }
        HomeMaskView homeMaskView = this.f32194m;
        if (homeMaskView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("maskView");
            homeMaskView = null;
        }
        homeMaskView.m57278a();
        FrameLayout flutterContainer = c45895aM37678Y.f103366b;
        Intrinsics.checkNotNullExpressionValue(flutterContainer, "flutterContainer");
        ViewExtKt.m66594y(flutterContainer);
        this.f32191j.m56773y();
        m37674c0();
    }

    /* JADX INFO: renamed from: d0 */
    private final void m37675d0() throws JSONException {
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        String strM56280w = RouteExKt.m56280w(intent, "flutterInitialRoute");
        if (strM56280w == null) {
            strM56280w = "/";
        }
        boolean booleanExtra = getIntent().getBooleanExtra("wallet_animation", false);
        getIntent().removeExtra("wallet_animation");
        this.f32191j.m56756V(strM56280w);
        if (booleanExtra) {
            m37672Z();
        } else {
            m37673a0();
        }
    }

    /* JADX INFO: renamed from: e0 */
    private final void m37676e0() {
        Intent intent = getIntent();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            boolean z11 = false;
            if (extras != null && RouteExKt.m56250h(extras, "restart")) {
                z11 = true;
            }
            C44128b.m97266j("LiteTag", "LiteFlutterActivity restart=" + z11);
            if (z11) {
                if (C27077o.m66821a()) {
                    getIntent().setFlags(268468224);
                    startActivity(getIntent());
                } else {
                    startActivity(getIntent());
                    finish();
                }
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    private final void m37677g0() {
        C5270g.m6206t(this);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(C27046k.m66699n(this, R$color.c_overlay));
        C44128b.m97266j("LiteTag", "LiteFlutterActivity setSystemUI");
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        C44128b.m97266j("LiteTag", "LiteFlutterActivity finish");
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) throws Exception {
        super.onActivityResult(requestCode, resultCode, data);
        this.f32191j.m56774z(requestCode, resultCode, data);
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() throws Throwable {
        super.onDestroy();
        this.f32191j.m56741E();
        C44128b.m97266j("LiteTag", "LiteFlutterActivity onDestroy");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            this.f32191j.m56744I(intent);
            setIntent(intent);
            m37676e0();
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f32191j.m56745K();
        C44128b.m97266j("LiteTag", "LiteFlutterActivity onPause");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f32191j.m56746L();
        C44128b.m97266j("LiteTag", "LiteFlutterActivity onPostResume");
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() throws JSONException {
        super.onResume();
        C44128b.m97266j("LiteTag", "LiteFlutterActivity onResume");
        if (!this.f32192k.getAndSet(true)) {
            m37675d0();
        }
        this.f32191j.m56748N();
        DayNightThemeManager dayNightThemeManager = DayNightThemeManager.f28592a;
        dayNightThemeManager.m33196u();
        m37680f0(this, dayNightThemeManager.m33187l());
        m37671X();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f32191j.m56749O();
        C44128b.m97266j("LiteTag", "LiteFlutterActivity onStart");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f32191j.m56742G();
        C44128b.m97266j("LiteTag", "LiteFlutterActivity onStop");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        this.f32191j.m56750P(level);
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        this.f32191j.m56751Q();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        this.f32191j.m56752R(hasFocus);
    }
}
