package com.kubi.lite.tab.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import bo.C4638a;
import com.blankj.utilcode.util.C5270g;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.advert.api.IAdvertService;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.lite.R$color;
import com.kubi.lite.R$id;
import com.kubi.lite.R$layout;
import com.kubi.lite.R$string;
import com.kubi.lite.api.ILiteService;
import com.kubi.lite.exception.LiteMessage;
import com.kubi.lite.tab.bean.TabConfig;
import com.kubi.lite.tab.bean.TabSwitchEvent;
import com.kubi.lite.tab.util.LanguageChangeUtil;
import com.kubi.lite.tab.util.LiteCommonUtils;
import com.kubi.lite.tab.util.TabScrollUtil;
import com.kubi.lite.utils.CheckUpgradeHelper;
import com.kubi.lite.utils.LiteState;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.mode.SwitchConfig;
import com.kubi.sdk.mode.widget.HomeMaskView;
import com.kubi.sdk.mode.widget.SwitchLayout;
import com.kubi.sdk.startup.IStartupActivity;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.utils.C27012a;
import com.kubi.utils.C27059l;
import com.kubi.utils.C27077o;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import f00.C37304a;
import g00.InterfaceC37764p;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41769w;
import my.C42674m;
import my.InterfaceC42667f;
import my.InterfaceC42678q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p238eo.C37218a;
import p291go.C37976a;
import p569qq.C43846g;
import p742wz.C45960a;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import tz.C45079a;
import vn.InterfaceC45608b;
import y70.C46392a;

/* JADX INFO: compiled from: LiteMainActivity.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90083d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 N2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001NB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\u0012\u0010.\u001a\u00020+2\b\u0010/\u001a\u0004\u0018\u000100H\u0002J\b\u00101\u001a\u00020+H\u0002J\u0006\u00102\u001a\u00020+J\b\u00103\u001a\u00020+H\u0002J\b\u00104\u001a\u00020+H\u0002J\u000e\u00105\u001a\u00020+H\u0082@¢\u0006\u0002\u00106J\b\u00107\u001a\u00020+H\u0002J\b\u00108\u001a\u00020+H\u0002J\b\u00109\u001a\u00020+H\u0002J\b\u0010:\u001a\u00020+H\u0002J\b\u0010;\u001a\u00020+H\u0014J\b\u0010<\u001a\u00020+H\u0014J\b\u0010=\u001a\u00020+H\u0014J\b\u0010>\u001a\u00020+H\u0014J\u0018\u0010?\u001a\u00020+2\u0006\u0010@\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u0007H\u0016J\u0014\u0010B\u001a\u0004\u0018\u00010C2\b\u0010D\u001a\u0004\u0018\u00010EH\u0002J\b\u0010F\u001a\u00020+H\u0002J\u0012\u0010G\u001a\u00020+2\b\u0010/\u001a\u0004\u0018\u000100H\u0014J\b\u0010H\u001a\u00020+H\u0017J\b\u0010I\u001a\u00020+H\u0016J\b\u0010J\u001a\u00020+H\u0014J\b\u0010K\u001a\u00020+H\u0016J\b\u0010L\u001a\u00020+H\u0002J\b\u0010M\u001a\u00020+H\u0002R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020(X\u0082D¢\u0006\u0002\n\u0000¨\u0006O"}, m90084d2 = {"Lcom/kubi/lite/tab/ui/LiteMainActivity;", "Lcom/kubi/sdk/BaseActivity;", "Lcom/kubi/lite/api/ILiteFlutterEntryActivity;", "Lcom/kubi/sdk/eventhub/IBusinessTabBarHideable;", "<init>", "()V", "disableSetSystemUI", "", "getDisableSetSystemUI", "()Z", "gcdMainHostId", "", "mViewModel", "Lcom/kubi/lite/tab/viewmodel/LiteTabViewModel;", "getMViewModel", "()Lcom/kubi/lite/tab/viewmodel/LiteTabViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "mLiteTabLayout", "Lcom/kubi/lite/tab/ui/LiteTabLayout;", "getMLiteTabLayout", "()Lcom/kubi/lite/tab/ui/LiteTabLayout;", "setMLiteTabLayout", "(Lcom/kubi/lite/tab/ui/LiteTabLayout;)V", "liteTabPlaceholder", "Landroid/view/View;", "fragmentContainer", "Landroid/widget/FrameLayout;", "tabFragmentManager", "Lcom/kubi/lite/tab/container/TabFragmentManager;", "upgradeHelper", "Lcom/kubi/lite/utils/CheckUpgradeHelper;", "maskView", "Lcom/kubi/sdk/mode/widget/HomeMaskView;", "isLoaded", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mTabScrollUtil", "Lcom/kubi/lite/tab/util/TabScrollUtil;", "businessTabBarHidden", "quitTime", "", "quickTime", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "handleJumpUri", "intent", "Landroid/content/Intent;", "observeViewModel", "setSystemUI", "initViews", "initFragmentManager", "onPageDisplayed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onLoading", "loadingWithoutAnimation", "loadingWithAnimation", "onLoaded", "onResume", "onStart", "onStop", "onPause", "setBusinessTabBarHidden", ViewProps.HIDDEN, "animated", "findRnContainerProvider", "Lcom/kubi/sdk/eventhub/RnContainerIdProvider;", "fragment", "Landroidx/fragment/app/Fragment;", "syncTabBarForCurrentTab", "onNewIntent", "onBackPressed", "onPreFinish", "onDestroy", "finish", "checkAndJumpToLogin", "restart", "Companion", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLiteMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiteMainActivity.kt\ncom/kubi/lite/tab/ui/LiteMainActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 LiteIssue.kt\ncom/kubi/lite/exception/LiteIssueKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,579:1\n75#2,13:580\n49#3,2:593\n126#4,2:595\n1#5:597\n163#6,2:598\n163#6,2:600\n*S KotlinDebug\n*F\n+ 1 LiteMainActivity.kt\ncom/kubi/lite/tab/ui/LiteMainActivity\n*L\n138#1:580,13\n175#1:593,2\n193#1:595,2\n221#1:598,2\n225#1:600,2\n*E\n"})
public final class LiteMainActivity extends BaseActivity implements InterfaceC45608b, InterfaceC42667f {

    /* JADX INFO: renamed from: w */
    @NotNull
    public static final Companion f32101w = new Companion(null);

    /* JADX INFO: renamed from: k */
    @NotNull
    public final Lazy f32104k;

    /* JADX INFO: renamed from: l */
    public LiteTabLayout f32105l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public View f32106m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f32107n;

    /* JADX INFO: renamed from: o */
    public C4638a f32108o;

    /* JADX INFO: renamed from: q */
    public HomeMaskView f32110q;

    /* JADX INFO: renamed from: t */
    public boolean f32113t;

    /* JADX INFO: renamed from: u */
    public long f32114u;

    /* JADX INFO: renamed from: i */
    public final boolean f32102i = true;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final String f32103j = LiteMainActivity.class.getName() + '@' + System.identityHashCode(this);

    /* JADX INFO: renamed from: p */
    @NotNull
    public final CheckUpgradeHelper f32109p = new CheckUpgradeHelper(this);

    /* JADX INFO: renamed from: r */
    @NotNull
    public final AtomicBoolean f32111r = new AtomicBoolean(false);

    /* JADX INFO: renamed from: s */
    @NotNull
    public TabScrollUtil f32112s = TabScrollUtil.f32166f.getInstance();

    /* JADX INFO: renamed from: v */
    public final long f32115v = 1000;

    /* JADX INFO: compiled from: LiteMainActivity.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bJ\u0012\u0010\r\u001a\u00020\u0007*\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000fJ\u0012\u0010\u0010\u001a\u00020\u0007*\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/lite/tab/ui/LiteMainActivity$Companion;", "", "<init>", "()V", "TAG", "", InterfaceC33617e1.f69659h, "", "bundle", "Landroid/os/Bundle;", "animation", "", "forceNoAnim", "showAnimationInAsync", "Lcom/kubi/sdk/mode/widget/SwitchLayout;", "(Lcom/kubi/sdk/mode/widget/SwitchLayout;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showAnimationOutAsync", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nLiteMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiteMainActivity.kt\ncom/kubi/lite/tab/ui/LiteMainActivity$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,579:1\n1761#2,3:580\n*S KotlinDebug\n*F\n+ 1 LiteMainActivity.kt\ncom/kubi/lite/tab/ui/LiteMainActivity$Companion\n*L\n92#1:580,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Object showAnimationInAsync(@NotNull SwitchLayout switchLayout, @NotNull Continuation<? super Unit> continuation) {
            final InterfaceC41769w interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
            if (switchLayout.m57310B()) {
                C44128b.m97259c("LiteV2-LiteMainActivity", "showAnimationIn skipped, fromEqualTo=true");
                return Unit.INSTANCE;
            }
            C44128b.m97266j("LiteV2-LiteMainActivity", "Start entering animation");
            switchLayout.m57313I(new Function0() { // from class: com.kubi.lite.tab.ui.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LiteMainActivity.Companion.m37603c(interfaceC41769wM91388c);
                }
            });
            Object objMo91198h = interfaceC41769wM91388c.mo91198h(continuation);
            return objMo91198h == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo91198h : Unit.INSTANCE;
        }

        @Nullable
        public final Object showAnimationOutAsync(@NotNull SwitchLayout switchLayout, @NotNull Continuation<? super Unit> continuation) {
            final InterfaceC41769w interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
            C44128b.m97266j("LiteV2-LiteMainActivity", "Start exiting animation");
            switchLayout.m57314K(new Function0() { // from class: com.kubi.lite.tab.ui.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LiteMainActivity.Companion.m37604d(interfaceC41769wM91388c);
                }
            });
            Object objMo91198h = interfaceC41769wM91388c.mo91198h(continuation);
            return objMo91198h == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo91198h : Unit.INSTANCE;
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: c */
        public static final Unit m37603c(InterfaceC41769w interfaceC41769w) {
            Unit unit = Unit.INSTANCE;
            interfaceC41769w.mo91370n(unit);
            C44128b.m97266j("LiteV2-LiteMainActivity", "Entering animation finished");
            return unit;
        }

        /* JADX INFO: renamed from: d */
        public static final Unit m37604d(InterfaceC41769w interfaceC41769w) {
            Unit unit = Unit.INSTANCE;
            interfaceC41769w.mo91370n(unit);
            C44128b.m97266j("LiteV2-LiteMainActivity", "Exiting animation finished");
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
            Intent intent = new Intent(contextM66757a, (Class<?>) LiteMainActivity.class);
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
                C44128b.m97266j("LiteV2-LiteMainActivity", "Switch animation result = " + zM101394i);
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
            C44128b.m97266j("LiteV2-LiteMainActivity", "Opened without animation");
        }
    }

    /* JADX INFO: renamed from: com.kubi.lite.tab.ui.LiteMainActivity$a */
    /* JADX INFO: compiled from: LiteMainActivity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17400a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f32116b;

        public C17400a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f32116b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f32116b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f32116b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c0 */
    private final InterfaceC42678q m37579c0(Fragment fragment) {
        if (fragment != 0 && fragment.isAdded()) {
            if (fragment instanceof InterfaceC42678q) {
                return (InterfaceC42678q) fragment;
            }
            Iterator<Fragment> it = fragment.getChildFragmentManager().getFragments().iterator();
            while (it.hasNext()) {
                InterfaceC42678q interfaceC42678qM37579c0 = m37579c0(it.next());
                if (interfaceC42678qM37579c0 != null) {
                    return interfaceC42678qM37579c0;
                }
            }
        }
        return null;
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        super.onCreate(null);
        LanguageChangeUtil.f32162c.getInstance().m37635b(this);
        getTitleBar().m58934f();
        Log.i("LiteV2-LiteMainActivity", "onCreate: begin");
        ILiteService.f32003a.get().mo37532c();
        List<TabConfig> value = m37594e0().m85825q().getValue();
        if (value == null) {
            value = CollectionsKt.emptyList();
        }
        if (value.size() < LiteCommonUtils.f32173a.m37652f()) {
            setContentView(R$layout.activity_lite_main_dynamic_items);
        } else {
            setContentView(R$layout.activity_lite_main_five_items);
        }
        m37600v0();
        HomeMaskView maskView$default = HomeMaskView.Companion.setMaskView$default(HomeMaskView.f47143d, this, AppMode.Lite, false, 4, null);
        if (maskView$default == null) {
            C44128b.m97261e("LiteV2-LiteMainActivity", "MaskView initialization failed");
            C43846g.m96568c(new LiteMessage("maskView init failed", "LiteV2-LiteMainActivity", false, 4, null), null, 2, null);
            finish();
            return;
        }
        this.f32110q = maskView$default;
        C44128b.m97266j("LiteV2-LiteMainActivity", "MaskView initialized successfully");
        m37581h0();
        m37595g0();
        m37582k0();
        if (!C37218a.f82536a.m83262c(this, value)) {
            C37976a.m85821v(m37594e0(), 0, null, 2, null);
        }
        m37580f0(getIntent());
        this.f32112s.m37641e(this);
        C46392a.m102328k(C45079a.f101482a.m99687a(), true);
        EdgeToEdgeCompat.f48106a.m58265c(this);
        Log.i("LiteV2-LiteMainActivity", "onCreate: end");
    }

    /* JADX INFO: renamed from: f0 */
    private final void m37580f0(Intent intent) {
        String strM56280w = intent != null ? RouteExKt.m56280w(intent, "jumpUrl") : null;
        if (strM56280w == null || TextUtils.isEmpty(strM56280w)) {
            return;
        }
        Router.f46192a.m56184f(strM56280w).m4048k();
    }

    /* JADX INFO: renamed from: h0 */
    private final void m37581h0() {
        View viewFindViewById = findViewById(R$id.simpleTabLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        m37599u0((LiteTabLayout) viewFindViewById);
        this.f32106m = findViewById(R$id.view_stub);
        View viewFindViewById2 = findViewById(R$id.fragmentContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f32107n = (FrameLayout) viewFindViewById2;
    }

    /* JADX INFO: renamed from: m0 */
    public static final void m37584m0(LiteMainActivity liteMainActivity, TabConfig tabConfig) {
        Object objM103844constructorimpl;
        FrameLayout frameLayout = liteMainActivity.f32107n;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentContainer");
            frameLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (C37218a.f82536a.m83263d(tabConfig)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(Integer.valueOf(C5270g.m6194h()));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
                objM103844constructorimpl = Integer.valueOf((int) (liteMainActivity.getResources().getDisplayMetrics().density * 24));
            }
            int iIntValue = ((Number) objM103844constructorimpl).intValue();
            C44128b.m97266j("LiteV2-LiteMainActivity", "Post-layout: Switching to RN tab, setting marginTop to statusBarHeight: " + iIntValue);
            FrameLayout frameLayout3 = liteMainActivity.f32107n;
            if (frameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fragmentContainer");
                frameLayout3 = null;
            }
            frameLayout3.setPadding(0, iIntValue, 0, 0);
        } else {
            C44128b.m97266j("LiteV2-LiteMainActivity", "Post-layout: Switching to non-RN tab, setting marginTop to 0");
            FrameLayout frameLayout4 = liteMainActivity.f32107n;
            if (frameLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fragmentContainer");
                frameLayout4 = null;
            }
            frameLayout4.setPadding(0, 0, 0, 0);
        }
        FrameLayout frameLayout5 = liteMainActivity.f32107n;
        if (frameLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentContainer");
        } else {
            frameLayout2 = frameLayout5;
        }
        frameLayout2.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public final void m37586o0() {
        C44128b.m97266j("LiteV2-LiteMainActivity", "Page loading completed");
        this.f32109p.m37690f();
        C45960a.f103398a.m101388c();
        C44128b.m97266j("LiteV2-LiteMainActivity", "Upgrade check completed");
    }

    /* JADX INFO: renamed from: s0 */
    public static final void m37589s0(LiteMainActivity liteMainActivity, LiteTabLayout liteTabLayout, View view) {
        if (liteMainActivity.f32113t) {
            liteTabLayout.setVisibility(8);
            if (view != null) {
                view.setVisibility(8);
            }
            liteTabLayout.setTranslationY(0.0f);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static final void m37590t0(LiteMainActivity liteMainActivity, LiteTabLayout liteTabLayout, boolean z11) {
        if (liteMainActivity.f32113t) {
            return;
        }
        float height = liteTabLayout.getHeight();
        if (height <= 0.0f) {
            liteTabLayout.setTranslationY(0.0f);
            return;
        }
        if (!z11 && liteTabLayout.getTranslationY() == 0.0f) {
            liteTabLayout.setTranslationY(height);
        }
        liteTabLayout.animate().translationY(0.0f).setDuration(250L).start();
    }

    /* JADX INFO: renamed from: w0 */
    private final void m37591w0() {
        C4638a c4638a = this.f32108o;
        if (c4638a == null) {
            return;
        }
        if (c4638a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabFragmentManager");
            c4638a = null;
        }
        InterfaceC42678q interfaceC42678qM37579c0 = m37579c0(c4638a.m4572c());
        C42674m.f94426a.m93476o(this, interfaceC42678qM37579c0 != null ? interfaceC42678qM37579c0.getRnContainerId() : null, interfaceC42678qM37579c0 != null);
    }

    @Override // my.InterfaceC42667f
    /* JADX INFO: renamed from: c */
    public void mo32392c(boolean z11, boolean z12) {
        if (this.f32105l == null) {
            return;
        }
        final LiteTabLayout liteTabLayoutM37593d0 = m37593d0();
        final View view = this.f32106m;
        liteTabLayoutM37593d0.animate().cancel();
        if (z11) {
            this.f32113t = true;
            if (liteTabLayoutM37593d0.getVisibility() != 0) {
                if (view != null) {
                    view.setVisibility(8);
                }
                liteTabLayoutM37593d0.setTranslationY(0.0f);
                return;
            }
            float height = liteTabLayoutM37593d0.getHeight() > 0 ? liteTabLayoutM37593d0.getHeight() : liteTabLayoutM37593d0.getMeasuredHeight();
            if (z12 && height > 0.0f) {
                liteTabLayoutM37593d0.animate().translationY(height).setDuration(250L).withEndAction(new Runnable() { // from class: com.kubi.lite.tab.ui.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        LiteMainActivity.m37589s0(this.f32132b, liteTabLayoutM37593d0, view);
                    }
                }).start();
                return;
            }
            liteTabLayoutM37593d0.setVisibility(8);
            if (view != null) {
                view.setVisibility(8);
            }
            liteTabLayoutM37593d0.setTranslationY(0.0f);
            return;
        }
        if (this.f32113t || liteTabLayoutM37593d0.getVisibility() != 0 || liteTabLayoutM37593d0.getTranslationY() != 0.0f || (view != null && view.getVisibility() == 8)) {
            this.f32113t = false;
            final boolean z13 = liteTabLayoutM37593d0.getVisibility() == 0;
            if (view != null) {
                view.setVisibility(0);
            }
            liteTabLayoutM37593d0.setVisibility(0);
            if (z12) {
                liteTabLayoutM37593d0.post(new Runnable() { // from class: com.kubi.lite.tab.ui.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        LiteMainActivity.m37590t0(this.f32135b, liteTabLayoutM37593d0, z13);
                    }
                });
            } else {
                liteTabLayoutM37593d0.setTranslationY(0.0f);
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final LiteTabLayout m37593d0() {
        LiteTabLayout liteTabLayout = this.f32105l;
        if (liteTabLayout != null) {
            return liteTabLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mLiteTabLayout");
        return null;
    }

    /* JADX INFO: renamed from: e0 */
    public final C37976a m37594e0() {
        return (C37976a) this.f32104k.getValue();
    }

    @Override // android.app.Activity
    public void finish() {
        C44128b.m97266j("LiteV2-LiteMainActivity", "finish started");
        super.finish();
        C44128b.m97266j("LiteV2-LiteMainActivity", "finish finished");
    }

    /* JADX INFO: renamed from: g0 */
    public final void m37595g0() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        this.f32108o = new C4638a(supportFragmentManager, R$id.fragmentContainer, null, 4, null);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m37596i0() {
        AppMode appModeFromStringDefault;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        String strM56280w = RouteExKt.m56280w(intent, "from");
        if (strM56280w == null || (appModeFromStringDefault = AppMode.INSTANCE.fromStringDefault(strM56280w, AppMode.Pro)) == null) {
            appModeFromStringDefault = AppMode.Pro;
        }
        AppMode appMode = appModeFromStringDefault;
        HomeMaskView homeMaskView = this.f32110q;
        if (homeMaskView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("maskView");
            homeMaskView = null;
        }
        SwitchLayout sharedView = homeMaskView.getSharedView();
        if (sharedView != null) {
            sharedView.m57317y(new SwitchConfig(appMode, AppMode.Lite, false, false, false, 100L, 400L, 0L, 600L, null, true, 660, null));
        }
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new LiteMainActivity$loadingWithAnimation$1(this, null), 3, null);
        C44128b.m97266j("LiteV2-LiteMainActivity", "Animated loading process started");
    }

    /* JADX INFO: renamed from: j0 */
    public final void m37597j0() {
        HomeMaskView homeMaskView = this.f32110q;
        FrameLayout frameLayout = null;
        if (homeMaskView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("maskView");
            homeMaskView = null;
        }
        homeMaskView.m57278a();
        FrameLayout frameLayout2 = this.f32107n;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentContainer");
        } else {
            frameLayout = frameLayout2;
        }
        ViewExtKt.m66594y(frameLayout);
        m37586o0();
        C44128b.m97266j("LiteV2-LiteMainActivity", "Non-animated loading completed");
    }

    @Override // com.kubi.sdk.BaseActivity
    public void onPreFinish() {
        C44128b.m97266j("LiteV2-LiteMainActivity", "onPreFinish");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0090  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        if (r2.showAnimationOutAsync(r11, r0) == r1) goto L29;
     */
    /* JADX INFO: renamed from: q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m37598q0(Continuation<? super Unit> continuation) {
        LiteMainActivity$onPageDisplayed$1 liteMainActivity$onPageDisplayed$1;
        HomeMaskView homeMaskView;
        if (continuation instanceof LiteMainActivity$onPageDisplayed$1) {
            liteMainActivity$onPageDisplayed$1 = (LiteMainActivity$onPageDisplayed$1) continuation;
            int i11 = liteMainActivity$onPageDisplayed$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                liteMainActivity$onPageDisplayed$1.label = i11 - Integer.MIN_VALUE;
            } else {
                liteMainActivity$onPageDisplayed$1 = new LiteMainActivity$onPageDisplayed$1(this, continuation);
            }
        } else {
            liteMainActivity$onPageDisplayed$1 = new LiteMainActivity$onPageDisplayed$1(this, continuation);
        }
        Object obj = liteMainActivity$onPageDisplayed$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = liteMainActivity$onPageDisplayed$1.label;
        HomeMaskView homeMaskView2 = null;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C44128b.m97266j("LiteV2-LiteMainActivity", "Page display started, waiting 200ms");
            liteMainActivity$onPageDisplayed$1.label = 1;
            if (DelayKt.m90350b(200L, liteMainActivity$onPageDisplayed$1) != coroutine_suspended) {
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
        homeMaskView = this.f32110q;
        if (homeMaskView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("maskView");
        } else {
            homeMaskView2 = homeMaskView;
        }
        homeMaskView2.m57278a();
        C44128b.m97266j("LiteV2-LiteMainActivity", "Page display completed");
        return Unit.INSTANCE;
        FrameLayout frameLayout = this.f32107n;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentContainer");
            frameLayout = null;
        }
        ViewExtKt.m66594y(frameLayout);
        HomeMaskView homeMaskView3 = this.f32110q;
        if (homeMaskView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("maskView");
            homeMaskView3 = null;
        }
        SwitchLayout sharedView = homeMaskView3.getSharedView();
        if (sharedView != null) {
            C44128b.m97266j("LiteV2-LiteMainActivity", "Executing exit animation");
            Companion companion = f32101w;
            liteMainActivity$onPageDisplayed$1.L$0 = SpillingKt.nullOutSpilledVariable(sharedView);
            liteMainActivity$onPageDisplayed$1.I$0 = 0;
            liteMainActivity$onPageDisplayed$1.label = 2;
        }
        homeMaskView = this.f32110q;
        if (homeMaskView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("maskView");
        } else {
            homeMaskView2 = homeMaskView;
        }
        homeMaskView2.m57278a();
        C44128b.m97266j("LiteV2-LiteMainActivity", "Page display completed");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u0 */
    public final void m37599u0(@NotNull LiteTabLayout liteTabLayout) {
        Intrinsics.checkNotNullParameter(liteTabLayout, "<set-?>");
        this.f32105l = liteTabLayout;
    }

    /* JADX INFO: renamed from: v0 */
    public final void m37600v0() {
        if (this.f32102i) {
            return;
        }
        boolean zM33187l = DayNightThemeManager.f28592a.m33187l();
        int iM66699n = C27046k.m66699n(this, R$color.c_overlay);
        C44128b.m97266j("LiteV2-LiteMainActivity", "setSystemUI: start, isDay=" + zM33187l + ", bgColor=" + iM66699n);
        C5270g.m6201o(this, iM66699n);
        C5270g.m6204r(this, zM33187l);
        getWindow().setNavigationBarColor(iM66699n);
        if (Build.VERSION.SDK_INT >= 26) {
            C5270g.m6198l(this, zM33187l);
        }
        C44128b.m97266j("LiteV2-LiteMainActivity", "setSystemUI: end");
    }

    public LiteMainActivity() {
        final Function0 function0 = null;
        this.f32104k = new ViewModelLazy(Reflection.getOrCreateKotlinClass(C37976a.class), new Function0<ViewModelStore>() { // from class: com.kubi.lite.tab.ui.LiteMainActivity$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return this.getMViewModelStore();
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.lite.tab.ui.LiteMainActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.lite.tab.ui.LiteMainActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = function0;
                return (function1 == null || (creationExtras = (CreationExtras) function1.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : creationExtras;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    private final void m37582k0() {
        m37594e0().m85824p().observe(this, new C17400a(new Function1() { // from class: com.kubi.lite.tab.ui.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiteMainActivity.m37583l0(this.f32128b, (TabSwitchEvent) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public static final Unit m37583l0(final LiteMainActivity liteMainActivity, TabSwitchEvent tabSwitchEvent) {
        boolean z11;
        int position = tabSwitchEvent.getPosition();
        final TabConfig config = tabSwitchEvent.getConfig();
        String newUrl = tabSwitchEvent.getNewUrl();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("observe switchTabEvent: pos=");
        sb2.append(position);
        sb2.append(", hasNewUrl=");
        if (newUrl != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        sb2.append(z11);
        C44128b.m97266j("LiteV2-LiteMainActivity", sb2.toString());
        FrameLayout frameLayout = liteMainActivity.f32107n;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentContainer");
            frameLayout = null;
        }
        frameLayout.post(new Runnable() { // from class: com.kubi.lite.tab.ui.c
            @Override // java.lang.Runnable
            public final void run() {
                LiteMainActivity.m37584m0(this.f32129b, config);
            }
        });
        C4638a c4638a = liteMainActivity.f32108o;
        if (c4638a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabFragmentManager");
            c4638a = null;
        }
        c4638a.m4574e(position, config, newUrl);
        liteMainActivity.f32112s.m37645i(config);
        FrameLayout frameLayout3 = liteMainActivity.f32107n;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentContainer");
        } else {
            frameLayout2 = frameLayout3;
        }
        frameLayout2.post(new Runnable() { // from class: com.kubi.lite.tab.ui.d
            @Override // java.lang.Runnable
            public final void run() {
                LiteMainActivity.m37585n0(this.f32131b);
            }
        });
        C44128b.m97266j("LiteV2-LiteMainActivity", "update system UI after tab switch");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n0 */
    public static final void m37585n0(LiteMainActivity liteMainActivity) {
        liteMainActivity.m37591w0();
    }

    /* JADX INFO: renamed from: p0 */
    private final void m37587p0() {
        boolean booleanExtra = getIntent().getBooleanExtra("wallet_animation", false);
        getIntent().removeExtra("wallet_animation");
        if (booleanExtra) {
            C44128b.m97266j("LiteV2-LiteMainActivity", "Loading with animation");
            m37596i0();
        } else {
            C44128b.m97266j("LiteV2-LiteMainActivity", "Loading without animation");
            m37597j0();
        }
    }

    /* JADX INFO: renamed from: r0 */
    private final void m37588r0() {
        Intent intent = getIntent();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            boolean z11 = false;
            if (extras != null && RouteExKt.m56250h(extras, "restart")) {
                z11 = true;
            }
            C44128b.m97266j("LiteV2-LiteMainActivity", "Checking restart: restart=" + z11);
            if (z11) {
                C44128b.m97266j("LiteV2-LiteMainActivity", "Performing activity restart");
                if (C27077o.m66821a()) {
                    C44128b.m97266j("LiteV2-LiteMainActivity", "HarmonyOS detected, restarting with NEW_TASK | CLEAR_TASK");
                    getIntent().setFlags(268468224);
                    startActivity(getIntent());
                } else {
                    C44128b.m97266j("LiteV2-LiteMainActivity", "Non-HarmonyOS, normal restart");
                    startActivity(getIntent());
                    finish();
                }
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m37592b0() {
        Intent intent = getIntent();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            boolean z11 = false;
            if (extras != null && RouteExKt.m56250h(extras, "toLogin")) {
                z11 = true;
            }
            C44128b.m97266j("LiteV2-LiteMainActivity", "Checking login redirect: toLogin=" + z11);
            if (z11) {
                C44128b.m97266j("LiteV2-LiteMainActivity", "Redirecting to login page");
                InterfaceC37764p.a.m85181b(C37304a.f82764a, null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
                intent.removeExtra("toLogin");
            }
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public void onBackPressed() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f32114u > this.f32115v) {
            this.f32114u = jCurrentTimeMillis;
            ToastCompat.m66437C(R$string.double_quit);
            C44128b.m97266j("LiteV2-LiteMainActivity", "First back press, waiting for double-click");
        } else {
            C44128b.m97266j("LiteV2-LiteMainActivity", "Double back press detected, exiting app");
            C27012a.m66486i().m66490d();
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() throws Throwable {
        super.onDestroy();
        C44128b.m97266j("LiteV2-LiteMainActivity", "onDestroy started");
        C4638a c4638a = this.f32108o;
        if (c4638a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabFragmentManager");
            c4638a = null;
        }
        c4638a.m4570a();
        C44128b.m97266j("LiteV2-LiteMainActivity", "onDestroy finished");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        String action;
        super.onNewIntent(intent);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onNewIntent: intent=");
        if (intent == null || (action = intent.getAction()) == null) {
            action = "null";
        }
        sb2.append(action);
        C44128b.m97266j("LiteV2-LiteMainActivity", sb2.toString());
        m37580f0(intent);
        if (intent != null) {
            setIntent(intent);
            m37588r0();
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        IAdvertService.f15070a.get().mo14770o(this.f32103j);
        C44128b.m97266j("LiteV2-LiteMainActivity", "onPause");
        C42674m.f94426a.m93473j(this);
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        IAdvertService.f15070a.get().mo14768m(this.f32103j);
        C44128b.m97266j("LiteV2-LiteMainActivity", "onResume started");
        if (!this.f32111r.getAndSet(true)) {
            C44128b.m97266j("LiteV2-LiteMainActivity", "First load, executing onLoading");
            m37587p0();
        } else {
            C44128b.m97266j("LiteV2-LiteMainActivity", "Not first load");
        }
        DayNightThemeManager.f28592a.m33196u();
        m37600v0();
        m37592b0();
        m37591w0();
        C44128b.m97266j("LiteV2-LiteMainActivity", "onResume finished");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        C44128b.m97266j("LiteV2-LiteMainActivity", "onStart");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        C44128b.m97266j("LiteV2-LiteMainActivity", "onStop");
    }
}
