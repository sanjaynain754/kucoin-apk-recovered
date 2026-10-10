package com.kubi.wallet.p119ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowInsetsController;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import b80.InterfaceC4506b;
import c80.C4906a;
import com.blankj.utilcode.util.C5270g;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.router.core.Router;
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
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.kubi.wallet.R$color;
import com.kubi.wallet.R$layout;
import com.kubi.wallet.exception.WalletMessage;
import com.kubi.wallet.utils.CheckUpgradeHelper;
import com.kubi.wallet.utils.WalletState;
import com.tencent.bugly.proguard.InterfaceC33617e1;
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
import w00.C45678b;

/* JADX INFO: compiled from: WalletFlutterActivity.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 B2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001BB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\u000e\u0010\u001d\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u0015H\u0002J\b\u0010 \u001a\u00020\u0015H\u0002J\b\u0010!\u001a\u00020\u0015H\u0002J\b\u0010\"\u001a\u00020\u0015H\u0002J\b\u0010#\u001a\u00020\u0015H\u0014J\b\u0010$\u001a\u00020\u0015H\u0014J\b\u0010%\u001a\u00020\u0015H\u0014J\u0010\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u0015H\u0014J\b\u0010*\u001a\u00020\u0015H\u0014J\u0012\u0010+\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\"\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\b\u00100\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u00101\u001a\u00020\u0015H\u0017J-\u00102\u001a\u00020\u00152\u0006\u0010-\u001a\u00020.2\u000e\u00103\u001a\n\u0012\u0006\b\u0001\u0012\u000205042\u0006\u00106\u001a\u000207H\u0016¢\u0006\u0002\u00108J\u0010\u00109\u001a\u00020\u00152\u0006\u0010:\u001a\u00020.H\u0016J\b\u0010;\u001a\u00020\u0015H\u0014J\b\u0010<\u001a\u00020\u0015H\u0016J\b\u0010=\u001a\u00020\u0015H\u0014J\b\u0010>\u001a\u00020\u0015H\u0016J\u0014\u0010?\u001a\u00020\u0015*\u00020@2\u0006\u0010A\u001a\u00020(H\u0002R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000¨\u0006C"}, m90084d2 = {"Lcom/kubi/wallet/ui/WalletFlutterActivity;", "Lcom/kubi/sdk/BaseActivity;", "Lcom/kubi/wallet/api/IWalletFlutterEntryActivity;", "Lcom/kubi/sdk/util/IDisableEdgeToEdge;", "<init>", "()V", "binding", "Lcom/kubi/wallet/databinding/WalletFlutterLayoutBinding;", "getBinding", "()Lcom/kubi/wallet/databinding/WalletFlutterLayoutBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "delegate", "Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;", "isLoaded", "Ljava/util/concurrent/atomic/AtomicBoolean;", "upgradeHelper", "Lcom/kubi/wallet/utils/CheckUpgradeHelper;", "maskView", "Lcom/kubi/sdk/mode/widget/HomeMaskView;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "handleJumpUri", "intent", "Landroid/content/Intent;", "setSystemUI", "bindEvent", "onFlutterDisplayed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onLoading", "loadingWithoutAnimation", "loadingWithAnimation", "onLoaded", "onResume", "onPostResume", "onStart", "onWindowFocusChanged", "hasFocus", "", "onStop", "onPause", "onNewIntent", "onActivityResult", "requestCode", "", "resultCode", "data", "onBackPressed", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onTrimMemory", FirebaseAnalytics.Param.LEVEL, "onUserLeaveHint", "onPreFinish", "onDestroy", "finish", "setStatusBarDarkIcons", "Landroid/app/Activity;", "darkIcons", "Companion", "WalletLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWalletFlutterActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletFlutterActivity.kt\ncom/kubi/wallet/ui/WalletFlutterActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n+ 3 WalletIssue.kt\ncom/kubi/wallet/exception/WalletIssueKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,395:1\n45#2,19:396\n55#3,2:415\n76#4,7:417\n1#5:424\n*S KotlinDebug\n*F\n+ 1 WalletFlutterActivity.kt\ncom/kubi/wallet/ui/WalletFlutterActivity\n*L\n128#1:396,19\n143#1:415,2\n188#1:417,7\n*E\n"})
public final class WalletFlutterActivity extends BaseActivity implements InterfaceC4506b, IDisableEdgeToEdge {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final InterfaceC24293a f54627i = C45678b.m100788b(this, new Function1<C4906a, Unit>() { // from class: com.kubi.wallet.ui.WalletFlutterActivity$special$$inlined$viewBindingActivity$default$1
        public final void invoke(@NotNull C4906a it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4906a c4906a) {
            invoke(c4906a);
            return Unit.INSTANCE;
        }
    }, new Function1<WalletFlutterActivity, C4906a>() { // from class: com.kubi.wallet.ui.WalletFlutterActivity$special$$inlined$viewBindingActivity$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4906a invoke(@NotNull WalletFlutterActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return C4906a.m5089a(C45678b.m100787a(activity));
        }
    });

    /* JADX INFO: renamed from: j */
    @NotNull
    public final FlutterViewDelegate f54628j = new FlutterViewDelegate();

    /* JADX INFO: renamed from: k */
    @NotNull
    public final AtomicBoolean f54629k = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l */
    @NotNull
    public final CheckUpgradeHelper f54630l = new CheckUpgradeHelper(this);

    /* JADX INFO: renamed from: m */
    public HomeMaskView f54631m;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ KProperty<Object>[] f54626o = {Reflection.property1(new PropertyReference1Impl(WalletFlutterActivity.class, "binding", "getBinding()Lcom/kubi/wallet/databinding/WalletFlutterLayoutBinding;", 0))};

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final Companion f54625n = new Companion(null);

    /* JADX INFO: compiled from: WalletFlutterActivity.kt */
    /* JADX INFO: loaded from: classes55.dex */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\u0012\u0010\f\u001a\u00020\u0007*\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u00020\u0007*\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/wallet/ui/WalletFlutterActivity$Companion;", "", "<init>", "()V", "TAG", "", InterfaceC33617e1.f69659h, "", "bundle", "Landroid/os/Bundle;", "animation", "", "showAnimationInAsync", "Lcom/kubi/sdk/mode/widget/SwitchLayout;", "(Lcom/kubi/sdk/mode/widget/SwitchLayout;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showAnimationOutAsync", "WalletLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nWalletFlutterActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletFlutterActivity.kt\ncom/kubi/wallet/ui/WalletFlutterActivity$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 WalletIssue.kt\ncom/kubi/wallet/exception/WalletIssueKt\n*L\n1#1,395:1\n1761#2,3:396\n55#3,2:399\n*S KotlinDebug\n*F\n+ 1 WalletFlutterActivity.kt\ncom/kubi/wallet/ui/WalletFlutterActivity$Companion\n*L\n74#1:396,3\n95#1:399,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void launch$default(Companion companion, Bundle bundle, boolean z11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            companion.launch(bundle, z11);
        }

        public final void launch(@NotNull Bundle bundle, boolean animation) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Context contextM66757a = C27059l.f54343a.m66757a();
            Intent intent = new Intent(contextM66757a, (Class<?>) WalletFlutterActivity.class);
            boolean zM66999b = WalletState.f54638a.m66999b();
            boolean z11 = !zM66999b;
            Stack<Activity> stackM66493g = C27012a.m66486i().m66493g();
            Intrinsics.checkNotNullExpressionValue(stackM66493g, "getActivityStack(...)");
            boolean z12 = false;
            if (stackM66493g == null || !stackM66493g.isEmpty()) {
                Iterator<T> it = stackM66493g.iterator();
                while (it.hasNext()) {
                    if (!(((Activity) it.next()) instanceof IStartupActivity)) {
                        z12 = true;
                        break;
                    }
                }
            }
            intent.putExtras(bundle);
            FragmentActivity fragmentActivity = contextM66757a instanceof FragmentActivity ? (FragmentActivity) contextM66757a : null;
            C44128b.m97266j("LiteTag", "WalletFlutterActivity launch mainActivity = " + fragmentActivity);
            if ((animation || (!zM66999b && z12)) && fragmentActivity != null) {
                boolean zM101395j = C45960a.f103398a.m101395j(fragmentActivity, intent);
                C44128b.m97266j("LiteTag", "WalletFlutterActivity 切换动画 = " + zM101395j);
                if (zM101395j) {
                    return;
                }
            }
            if (!zM66999b) {
                try {
                    intent.addFlags(32768);
                    if (!(contextM66757a instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                } catch (Exception e11) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("WalletFlutterActivity launch error: ");
                    sb2.append(e11.getMessage());
                    sb2.append(", notUsing=");
                    sb2.append(z11);
                    sb2.append(", context=");
                    sb2.append(!(contextM66757a instanceof Activity));
                    C43846g.m96568c(new WalletMessage(sb2.toString(), "WalletFlutterActivity", false, 4, null), null, 2, null);
                    return;
                }
            }
            contextM66757a.startActivity(intent);
            C44128b.m97266j("LiteTag", "WalletFlutterActivity 未使用动画打开钱包");
        }

        @Nullable
        public final Object showAnimationInAsync(@NotNull SwitchLayout switchLayout, @NotNull Continuation<? super Unit> continuation) {
            final InterfaceC41769w interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
            if (switchLayout.m57310B()) {
                C44128b.m97259c("WalletFlutterActivity", "showAnimationIn skip fromEqualTo");
                return Unit.INSTANCE;
            }
            C44128b.m97259c("WalletFlutterActivity", "showAnimationIn start");
            switchLayout.m57313I(new Function0() { // from class: com.kubi.wallet.ui.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WalletFlutterActivity.Companion.m66986c(interfaceC41769wM91388c);
                }
            });
            Object objMo91198h = interfaceC41769wM91388c.mo91198h(continuation);
            return objMo91198h == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo91198h : Unit.INSTANCE;
        }

        @Nullable
        public final Object showAnimationOutAsync(@NotNull SwitchLayout switchLayout, @NotNull Continuation<? super Unit> continuation) {
            final InterfaceC41769w interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
            C44128b.m97259c("WalletFlutterActivity", "showAnimationOut start");
            switchLayout.m57314K(new Function0() { // from class: com.kubi.wallet.ui.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WalletFlutterActivity.Companion.m66987d(interfaceC41769wM91388c);
                }
            });
            Object objMo91198h = interfaceC41769wM91388c.mo91198h(continuation);
            return objMo91198h == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo91198h : Unit.INSTANCE;
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: c */
        public static final Unit m66986c(InterfaceC41769w interfaceC41769w) {
            Unit unit = Unit.INSTANCE;
            interfaceC41769w.mo91370n(unit);
            C44128b.m97259c("WalletFlutterActivity", "showAnimationIn end");
            return unit;
        }

        /* JADX INFO: renamed from: d */
        public static final Unit m66987d(InterfaceC41769w interfaceC41769w) {
            Unit unit = Unit.INSTANCE;
            interfaceC41769w.mo91370n(unit);
            C44128b.m97259c("WalletFlutterActivity", "showAnimationOut end");
            return unit;
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        super.onCreate(null);
        getTitleBar().m58934f();
        C44128b.m97266j("LiteTag", "WalletFlutterActivity onCreate");
        setContentView(R$layout.wallet_flutter_layout);
        m66982g0();
        C4906a c4906aM66983Y = m66983Y();
        if (c4906aM66983Y == null) {
            C43846g.m96568c(new WalletMessage("bing = null", "WalletFlutterActivity", false, 4, null), null, 2, null);
            finish();
            return;
        }
        HomeMaskView maskView$default = HomeMaskView.Companion.setMaskView$default(HomeMaskView.f47143d, this, AppMode.Web3, false, 4, null);
        if (maskView$default == null) {
            finish();
            return;
        }
        this.f54631m = maskView$default;
        this.f54628j.m56761i();
        this.f54628j.m56755U(CollectionsKt.listOf("entry=web3Wallet"));
        this.f54628j.m56764l(this);
        FlutterViewDelegate flutterViewDelegate = this.f54628j;
        FrameLayout flutterContainer = c4906aM66983Y.f5402b;
        Intrinsics.checkNotNullExpressionValue(flutterContainer, "flutterContainer");
        FlutterViewDelegate.m56724D(flutterViewDelegate, this, flutterContainer, false, 4, null);
        m66974X();
        m66975Z(getIntent());
    }

    /* JADX INFO: renamed from: X */
    private final void m66974X() {
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.event.FlutterEvent:flutterCommonEvent".length();
        }
        C12572a.m23692a(this, false, new WalletFlutterActivity$bindEvent$$inlined$bindFlowEvent$default$1("com.kubi.event.FlutterEvent:flutterCommonEvent", null, this));
    }

    /* JADX INFO: renamed from: Z */
    private final void m66975Z(Intent intent) {
        String strM56280w = intent != null ? RouteExKt.m56280w(intent, "jumpUrl") : null;
        if (strM56280w == null || TextUtils.isEmpty(strM56280w)) {
            return;
        }
        Router.f46192a.m56184f(strM56280w).m4048k();
    }

    /* JADX INFO: renamed from: a0 */
    private final void m66976a0() {
        AppMode appModeFromStringDefault;
        if (m66983Y() == null) {
            return;
        }
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        String strM56280w = RouteExKt.m56280w(intent, "from");
        if (strM56280w == null || (appModeFromStringDefault = AppMode.INSTANCE.fromStringDefault(strM56280w, AppMode.Pro)) == null) {
            appModeFromStringDefault = AppMode.Pro;
        }
        AppMode appMode = appModeFromStringDefault;
        C44128b.m97259c("WalletFlutterActivity", "[loadingWithAnimation] fromAppMode:" + appMode);
        HomeMaskView homeMaskView = this.f54631m;
        if (homeMaskView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("maskView");
            homeMaskView = null;
        }
        SwitchLayout sharedView = homeMaskView.getSharedView();
        if (sharedView != null) {
            sharedView.m57317y(new SwitchConfig(appMode, AppMode.Web3, false, false, false, 100L, 400L, 0L, 600L, null, true, 660, null));
        }
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WalletFlutterActivity$loadingWithAnimation$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
    
        if (r7.showAnimationOutAsync(r10, r0) == r1) goto L30;
     */
    /* JADX INFO: renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m66978c0(Continuation<? super Unit> continuation) {
        WalletFlutterActivity$onFlutterDisplayed$1 walletFlutterActivity$onFlutterDisplayed$1;
        C4906a c4906aM66983Y;
        HomeMaskView homeMaskView;
        if (continuation instanceof WalletFlutterActivity$onFlutterDisplayed$1) {
            walletFlutterActivity$onFlutterDisplayed$1 = (WalletFlutterActivity$onFlutterDisplayed$1) continuation;
            int i11 = walletFlutterActivity$onFlutterDisplayed$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                walletFlutterActivity$onFlutterDisplayed$1.label = i11 - Integer.MIN_VALUE;
            } else {
                walletFlutterActivity$onFlutterDisplayed$1 = new WalletFlutterActivity$onFlutterDisplayed$1(this, continuation);
            }
        } else {
            walletFlutterActivity$onFlutterDisplayed$1 = new WalletFlutterActivity$onFlutterDisplayed$1(this, continuation);
        }
        Object obj = walletFlutterActivity$onFlutterDisplayed$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = walletFlutterActivity$onFlutterDisplayed$1.label;
        HomeMaskView homeMaskView2 = null;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C44128b.m97259c("WalletFlutterActivity", "[onFlutterDisplayed]");
            c4906aM66983Y = m66983Y();
            if (c4906aM66983Y == null) {
                return Unit.INSTANCE;
            }
            walletFlutterActivity$onFlutterDisplayed$1.L$0 = c4906aM66983Y;
            walletFlutterActivity$onFlutterDisplayed$1.label = 1;
            if (DelayKt.m90350b(200L, walletFlutterActivity$onFlutterDisplayed$1) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            c4906aM66983Y = (C4906a) walletFlutterActivity$onFlutterDisplayed$1.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        homeMaskView = this.f54631m;
        if (homeMaskView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("maskView");
        } else {
            homeMaskView2 = homeMaskView;
        }
        homeMaskView2.m57278a();
        C44128b.m97259c("WalletFlutterActivity", "[onFlutterDisplayed] maskView removeMask");
        return Unit.INSTANCE;
        FrameLayout flutterContainer = c4906aM66983Y.f5402b;
        Intrinsics.checkNotNullExpressionValue(flutterContainer, "flutterContainer");
        ViewExtKt.m66594y(flutterContainer);
        HomeMaskView homeMaskView3 = this.f54631m;
        if (homeMaskView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("maskView");
            homeMaskView3 = null;
        }
        SwitchLayout sharedView = homeMaskView3.getSharedView();
        if (sharedView != null) {
            Companion companion = f54625n;
            walletFlutterActivity$onFlutterDisplayed$1.L$0 = SpillingKt.nullOutSpilledVariable(c4906aM66983Y);
            walletFlutterActivity$onFlutterDisplayed$1.label = 2;
        }
        homeMaskView = this.f54631m;
        if (homeMaskView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("maskView");
        } else {
            homeMaskView2 = homeMaskView;
        }
        homeMaskView2.m57278a();
        C44128b.m97259c("WalletFlutterActivity", "[onFlutterDisplayed] maskView removeMask");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public final void m66979d0() throws JSONException {
        this.f54628j.m56738A();
        this.f54630l.m66993f();
        C45960a.f103398a.m101388c();
    }

    /* JADX INFO: renamed from: f0 */
    private final void m66981f0(Activity activity, boolean z11) {
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

    /* JADX INFO: renamed from: Y */
    public final C4906a m66983Y() {
        return (C4906a) this.f54627i.getValue(this, f54626o[0]);
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public void onBackPressed() {
        if (this.f54628j.m56739B()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.kubi.sdk.BaseActivity
    public void onPreFinish() {
        C44128b.m97266j("LiteTag", "WalletFlutterActivity onPreFinish");
    }

    /* JADX INFO: renamed from: b0 */
    private final void m66977b0() throws JSONException {
        C4906a c4906aM66983Y = m66983Y();
        if (c4906aM66983Y == null) {
            return;
        }
        HomeMaskView homeMaskView = this.f54631m;
        if (homeMaskView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("maskView");
            homeMaskView = null;
        }
        homeMaskView.m57278a();
        C44128b.m97259c("WalletFlutterActivity", "[loadingWithoutAnimation] maskView removeMask");
        FrameLayout flutterContainer = c4906aM66983Y.f5402b;
        Intrinsics.checkNotNullExpressionValue(flutterContainer, "flutterContainer");
        ViewExtKt.m66594y(flutterContainer);
        this.f54628j.m56773y();
        m66979d0();
    }

    /* JADX INFO: renamed from: e0 */
    private final void m66980e0() throws JSONException {
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        String strM56280w = RouteExKt.m56280w(intent, "flutterInitialRoute");
        if (strM56280w == null) {
            strM56280w = "/";
        }
        boolean booleanExtra = getIntent().getBooleanExtra("wallet_animation", false);
        getIntent().removeExtra("wallet_animation");
        this.f54628j.m56756V(strM56280w);
        if (booleanExtra) {
            m66976a0();
        } else {
            m66977b0();
        }
    }

    /* JADX INFO: renamed from: g0 */
    private final void m66982g0() {
        C5270g.m6206t(this);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(C27046k.m66699n(this, R$color.c_overlay));
        C44128b.m97266j("LiteTag", "WalletFlutterActivity setSystemUI");
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        C44128b.m97266j("LiteTag", "WalletFlutterActivity finish");
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) throws Exception {
        super.onActivityResult(requestCode, resultCode, data);
        this.f54628j.m56774z(requestCode, resultCode, data);
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() throws Throwable {
        super.onDestroy();
        this.f54628j.m56741E();
        C44128b.m97266j("LiteTag", "WalletFlutterActivity onDestroy");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        m66975Z(intent);
        if (intent != null) {
            this.f54628j.m56744I(intent);
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f54628j.m56745K();
        C44128b.m97266j("LiteTag", "WalletFlutterActivity onPause");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f54628j.m56746L();
        C44128b.m97266j("LiteTag", "WalletFlutterActivity onPostResume");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) throws Throwable {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        this.f54628j.m56747M(requestCode, permissions, grantResults);
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() throws JSONException {
        super.onResume();
        C44128b.m97266j("LiteTag", "WalletFlutterActivity onResume");
        if (!this.f54629k.getAndSet(true)) {
            m66980e0();
        }
        this.f54628j.m56748N();
        DayNightThemeManager dayNightThemeManager = DayNightThemeManager.f28592a;
        dayNightThemeManager.m33196u();
        m66981f0(this, dayNightThemeManager.m33187l());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f54628j.m56749O();
        C44128b.m97266j("LiteTag", "WalletFlutterActivity onStart");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f54628j.m56742G();
        C44128b.m97266j("LiteTag", "WalletFlutterActivity onStop");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        this.f54628j.m56750P(level);
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        this.f54628j.m56751Q();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        this.f54628j.m56752R(hasFocus);
    }
}
