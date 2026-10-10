package com.kubi.kumex.kline;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.core.processing.util.GLUtils;
import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.C5286o;
import com.blankj.utilcode.util.C5303w0;
import com.google.android.material.tabs.TabLayout;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.flutter.proto.kline.AlertClickType;
import com.kubi.flutter.proto.kline.ChangeToolBarModeEvent;
import com.kubi.flutter.proto.kline.ConfirmAlerEvent;
import com.kubi.flutter.proto.kline.PaintGuideEvent;
import com.kubi.flutter.proto.kline.ToastEvent;
import com.kubi.flutter.proto.kline.ToolBarClick;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.kumex.R$array;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.PriceEntity;
import com.kubi.kumex.data.market.model.TickerEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.UpDownTextView;
import com.kubi.sdk.base.p113ui.BaseUiActivity;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradebase.business.klineSettings.KLineSettingConfig;
import com.kubi.tradebase.view.kline.KLineIndicatorView;
import com.kubi.tradebase.view.kline.KLineToolBarView;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33627eb;
import dm.C36732a4;
import fm.C37567b;
import fm.C37569d;
import gf.C37878b0;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.List;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38190h;
import p402kf.C41014a;
import p429lf.C42180b;
import p801yl.C46527h0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import q30.C43604d;
import ro.C44128b;
import th.InterfaceC44980d;
import w00.C45678b;

/* JADX INFO: compiled from: KuMexKlineLandscapeActivity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001a\u001a\u00020\u001bH\u0014J\b\u0010'\u001a\u00020\u001dH\u0002J\u0012\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0014J\b\u0010,\u001a\u00020)H\u0002J\b\u0010-\u001a\u00020)H\u0002J\b\u0010.\u001a\u00020)H\u0002J\b\u0010/\u001a\u00020)H\u0002J\u0010\u00100\u001a\u00020)2\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020)2\u0006\u00101\u001a\u000204H\u0002J\u000f\u00105\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0002\u00106J\u000f\u00107\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0002\u00106J\b\u00108\u001a\u00020)H\u0002J\b\u00109\u001a\u00020)H\u0014J\n\u0010:\u001a\u0004\u0018\u00010;H\u0014R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u000f\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u000f\u001a\u0004\b#\u0010$R\u000e\u0010&\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, m90084d2 = {"Lcom/kubi/kumex/kline/KuMexKlineLandscapeActivity;", "Lcom/kubi/sdk/base/ui/BaseUiActivity;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexKlineLandscapeActivityBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexKlineLandscapeActivityBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "symbol", "", "getSymbol", "()Ljava/lang/String;", "symbol$delegate", "Lkotlin/Lazy;", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "getContract", "()Lcom/kubi/kumex/data/platform/model/ContractEntity;", "contract$delegate", "klineSettingConfig", "Lcom/kubi/tradebase/business/klineSettings/KLineSettingConfig;", "getKlineSettingConfig", "()Lcom/kubi/tradebase/business/klineSettings/KLineSettingConfig;", "klineSettingConfig$delegate", "getLayout", "", "newInstance", "Lcom/kubi/kumex/kline/KuMexFlutterKlineFragment;", "getNewInstance", "()Lcom/kubi/kumex/kline/KuMexFlutterKlineFragment;", "newInstance$delegate", "helper", "Lcom/kubi/tradebase/helper/KLineHelper;", "getHelper", "()Lcom/kubi/tradebase/helper/KLineHelper;", "helper$delegate", "lastPosition", "buildChartFragment", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initListener", "bindEvent", "initObserver", "subscribe", "onPriceGet", "it", "Lcom/kubi/kumex/data/market/model/PriceEntity;", "onTickerGet", "Lcom/kubi/kumex/data/market/model/TickerEntity;", "getMainIdByPosition", "()Ljava/lang/Integer;", "getNoMainIdByPosition", "enterDrawEditState", "onResume", "initNavigationBar", "Landroid/view/View;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKuMexKlineLandscapeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuMexKlineLandscapeActivity.kt\ncom/kubi/kumex/kline/KuMexKlineLandscapeActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 PriceEntityEx.kt\ncom/kubi/kumex/extensions/PriceEntityExKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,335:1\n49#2,15:336\n81#3,2:351\n81#3,2:353\n81#3,2:355\n81#3,2:357\n28#4,3:359\n20#4,18:362\n1#5:380\n*S KotlinDebug\n*F\n+ 1 KuMexKlineLandscapeActivity.kt\ncom/kubi/kumex/kline/KuMexKlineLandscapeActivity\n*L\n67#1:336,15\n165#1:351,2\n170#1:353,2\n178#1:355,2\n188#1:357,2\n226#1:359,3\n226#1:362,18\n*E\n"})
public final class KuMexKlineLandscapeActivity extends BaseUiActivity {

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ KProperty<Object>[] f29328C = {Reflection.property1(new PropertyReference1Impl(KuMexKlineLandscapeActivity.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexKlineLandscapeActivityBinding;", 0))};

    /* JADX INFO: renamed from: B */
    public int f29330B;

    /* JADX INFO: renamed from: v */
    @NotNull
    public final InterfaceC24293a f29331v = C45678b.m100788b(this, new Function1<C36732a4, Unit>() { // from class: com.kubi.kumex.kline.KuMexKlineLandscapeActivity$special$$inlined$viewBindingActivity$1
        public final void invoke(@NotNull C36732a4 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36732a4 c36732a4) {
            invoke(c36732a4);
            return Unit.INSTANCE;
        }
    }, new Function1<KuMexKlineLandscapeActivity, C36732a4>() { // from class: com.kubi.kumex.kline.KuMexKlineLandscapeActivity$special$$inlined$viewBindingActivity$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36732a4 invoke(@NotNull KuMexKlineLandscapeActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            View view = this.this$0.f46504p;
            Intrinsics.checkNotNullExpressionValue(view, "access$getContentView$p$s208487777(...)");
            return C36732a4.m82314a(view);
        }

        {
            super(1);
        }
    });

    /* JADX INFO: renamed from: w */
    @NotNull
    public final Lazy f29332w = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.kline.i0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuMexKlineLandscapeActivity.m34255w1(this.f29359b);
        }
    });

    /* JADX INFO: renamed from: x */
    @NotNull
    public final Lazy f29333x = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.kline.t0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuMexKlineLandscapeActivity.m34217O0(this.f29381b);
        }
    });

    /* JADX INFO: renamed from: y */
    @NotNull
    public final Lazy f29334y = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.kline.v0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuMexKlineLandscapeActivity.m34231j1(this.f29385b);
        }
    });

    /* JADX INFO: renamed from: z */
    @NotNull
    public final Lazy f29335z = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.kline.w0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuMexKlineLandscapeActivity.m34233k1(this.f29387b);
        }
    });

    /* JADX INFO: renamed from: A */
    @NotNull
    public final Lazy f29329A = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.kline.x0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuMexKlineLandscapeActivity.m34220Y0();
        }
    });

    /* JADX INFO: renamed from: com.kubi.kumex.kline.KuMexKlineLandscapeActivity$a */
    /* JADX INFO: compiled from: KuMexKlineLandscapeActivity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16129a implements Function0<Unit> {
        public C16129a() {
        }

        /* JADX INFO: renamed from: a */
        public final void m34270a() {
            KuMexKlineLandscapeActivity.this.m34266V0().m34103v3(AlertClickType.CONFIRM);
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m34270a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.kline.KuMexKlineLandscapeActivity$b */
    /* JADX INFO: compiled from: KuMexKlineLandscapeActivity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16130b implements Function0<Unit> {
        public C16130b() {
        }

        /* JADX INFO: renamed from: a */
        public final void m34271a() {
            KuMexKlineLandscapeActivity.this.m34266V0().m34103v3(AlertClickType.CANCEL);
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m34271a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.kline.KuMexKlineLandscapeActivity$c */
    /* JADX INFO: compiled from: KuMexKlineLandscapeActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/kumex/kline/KuMexKlineLandscapeActivity$initListener$3", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "onTabUnselected", "", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "onTabSelected", "onTabReselected", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16131c implements TabLayout.OnTabSelectedListener {
        public C16131c() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "tab");
            if (KuMexKlineLandscapeActivity.this.f29330B == tab.getPosition()) {
                return;
            }
            KuMexKlineLandscapeActivity.this.f29330B = tab.getPosition();
            C37878b0 c37878b0 = C37878b0.f85252a;
            c37878b0.m85538s(KuMexKlineLandscapeActivity.this.f29330B);
            KuMexKlineLandscapeActivity.this.m34266V0().m34102u3(c37878b0.m85523d());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity
    @Nullable
    /* JADX INFO: renamed from: c0 */
    public View mo32393c0() {
        return null;
    }

    /* JADX INFO: renamed from: O0 */
    public static final ContractEntity m34217O0(KuMexKlineLandscapeActivity kuMexKlineLandscapeActivity) {
        return InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), kuMexKlineLandscapeActivity.m34219X0(), false, 2, null);
    }

    /* JADX INFO: renamed from: R0 */
    private final ContractEntity m34218R0() {
        return (ContractEntity) this.f29333x.getValue();
    }

    /* JADX INFO: renamed from: X0 */
    private final String m34219X0() {
        return (String) this.f29332w.getValue();
    }

    /* JADX INFO: renamed from: Y0 */
    public static final C43604d m34220Y0() {
        return new C43604d();
    }

    /* JADX INFO: renamed from: b1 */
    public static final void m34223b1(KuMexKlineLandscapeActivity kuMexKlineLandscapeActivity, ToolBarClick.ToolBarItemType toolBarItemType) {
        KLineToolBarView kLineToolBarView;
        KLineIndicatorView kLineIndicatorView;
        if (toolBarItemType == ToolBarClick.ToolBarItemType.BAR_ITEM_Exit) {
            C36732a4 c36732a4M34262Q0 = kuMexKlineLandscapeActivity.m34262Q0();
            if (c36732a4M34262Q0 != null && (kLineIndicatorView = c36732a4M34262Q0.f79700e) != null) {
                ViewExtKt.m66594y(kLineIndicatorView);
            }
            C36732a4 c36732a4M34262Q1 = kuMexKlineLandscapeActivity.m34262Q0();
            if (c36732a4M34262Q1 != null && (kLineToolBarView = c36732a4M34262Q1.f79703h) != null) {
                ViewExtKt.m66577h(kLineToolBarView);
            }
        }
        KuMexFlutterKlineFragment kuMexFlutterKlineFragmentM34266V0 = kuMexKlineLandscapeActivity.m34266V0();
        Intrinsics.checkNotNull(toolBarItemType);
        kuMexFlutterKlineFragmentM34266V0.m34098q3(toolBarItemType);
    }

    /* JADX INFO: renamed from: d1 */
    public static final Unit m34225d1(KuMexKlineLandscapeActivity kuMexKlineLandscapeActivity, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        kuMexKlineLandscapeActivity.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g1 */
    private final void m34228g1() {
        Flowable<ContractEntity> flowableObserveOn = C46527h0.f104291a.m102687W().observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.kline.s0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexKlineLandscapeActivity.m34229h1(this.f29379b, (ContractEntity) obj);
            }
        };
        Disposable disposableSubscribe = flowableObserveOn.subscribe(new Consumer() { // from class: com.kubi.kumex.kline.u0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexKlineLandscapeActivity.m34230i1(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    /* JADX INFO: renamed from: h1 */
    public static final Unit m34229h1(KuMexKlineLandscapeActivity kuMexKlineLandscapeActivity, ContractEntity contractEntity) {
        TextView textView = (TextView) kuMexKlineLandscapeActivity.findViewById(R$id.tv_symbol);
        if (textView != null) {
            ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), kuMexKlineLandscapeActivity.m34219X0(), false, 2, null);
            textView.setText(C27041f.m66667g(contractEntityM99529O != null ? FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM99529O) : null, kuMexKlineLandscapeActivity.m34219X0()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n1 */
    private final void m34237n1() {
        RepositoryServiceLocator repositoryServiceLocator = RepositoryServiceLocator.f19236a;
        Observable<TickerEntity> observableObserveOn = repositoryServiceLocator.m20286e().mo24802b(m34219X0()).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.kline.y0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexKlineLandscapeActivity.m34239o1(this.f29390b, (TickerEntity) obj);
            }
        };
        Consumer<? super TickerEntity> consumer = new Consumer() { // from class: com.kubi.kumex.kline.z0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexKlineLandscapeActivity.m34241p1(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.kumex.kline.a1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexKlineLandscapeActivity.m34243q1((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.kline.b1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexKlineLandscapeActivity.m34245r1(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getVisibleDisposable());
        Observable<PriceEntity> observableObserveOn2 = repositoryServiceLocator.m20286e().mo24807g(m34219X0()).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function3 = new Function1() { // from class: com.kubi.kumex.kline.c1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexKlineLandscapeActivity.m34247s1(this.f29348b, (PriceEntity) obj);
            }
        };
        Consumer<? super PriceEntity> consumer2 = new Consumer() { // from class: com.kubi.kumex.kline.j0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexKlineLandscapeActivity.m34249t1(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.kumex.kline.k0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexKlineLandscapeActivity.m34251u1((Throwable) obj);
            }
        };
        Disposable disposableSubscribe2 = observableObserveOn2.subscribe(consumer2, new Consumer() { // from class: com.kubi.kumex.kline.l0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexKlineLandscapeActivity.m34253v1(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe2, getVisibleDisposable());
    }

    /* JADX INFO: renamed from: M0 */
    public final void m34259M0() {
        String name = ChangeToolBarModeEvent.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            name.length();
        }
        C12572a.m23692a(this, true, new KuMexKlineLandscapeActivity$bindEvent$$inlined$bindFlowEvent$1(name, null, this));
        String name2 = ConfirmAlerEvent.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        if (c12573b.m23696a()) {
            name2.length();
        }
        C12572a.m23692a(this, true, new KuMexKlineLandscapeActivity$bindEvent$$inlined$bindFlowEvent$2(name2, null, this));
        String name3 = PaintGuideEvent.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
        if (c12573b.m23696a()) {
            name3.length();
        }
        C12572a.m23692a(this, true, new KuMexKlineLandscapeActivity$bindEvent$$inlined$bindFlowEvent$3(name3, null, this));
        String name4 = ToastEvent.class.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "getName(...)");
        if (c12573b.m23696a()) {
            name4.length();
        }
        C12572a.m23692a(this, true, new KuMexKlineLandscapeActivity$bindEvent$$inlined$bindFlowEvent$4(name4, null));
    }

    /* JADX INFO: renamed from: Q0 */
    public final C36732a4 m34262Q0() {
        return (C36732a4) this.f29331v.getValue(this, f29328C[0]);
    }

    /* JADX INFO: renamed from: S0 */
    public final C43604d m34263S0() {
        return (C43604d) this.f29329A.getValue();
    }

    /* JADX INFO: renamed from: T0 */
    public final KLineSettingConfig m34264T0() {
        return (KLineSettingConfig) this.f29334y.getValue();
    }

    /* JADX INFO: renamed from: U0 */
    public final Integer m34265U0() {
        int iM85525f = C37878b0.f85252a.m85525f();
        if (iM85525f == 0) {
            return Integer.valueOf(R$id.tv_kline_ma);
        }
        if (iM85525f == 1) {
            return Integer.valueOf(R$id.tv_kline_ema);
        }
        if (iM85525f != 2) {
            return null;
        }
        return Integer.valueOf(R$id.tv_kline_boll);
    }

    /* JADX INFO: renamed from: V0 */
    public final KuMexFlutterKlineFragment m34266V0() {
        return (KuMexFlutterKlineFragment) this.f29335z.getValue();
    }

    /* JADX INFO: renamed from: W0 */
    public final Integer m34267W0() {
        int iM85526g = C37878b0.f85252a.m85526g();
        if (iM85526g == 0) {
            return Integer.valueOf(R$id.tv_kline_macd);
        }
        if (iM85526g == 1) {
            return Integer.valueOf(R$id.tv_kline_kdj);
        }
        if (iM85526g != 2) {
            return null;
        }
        return Integer.valueOf(R$id.tv_kline_rsi);
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity
    /* JADX INFO: renamed from: Z */
    public int mo30326Z() {
        return R$layout.bkumex_kline_landscape_activity;
    }

    /* JADX INFO: renamed from: l1 */
    public final void m34268l1(PriceEntity priceEntity) {
        BigDecimal indexPrice;
        String strM92640e;
        BigDecimal indexPrice2;
        ShowHideTextView showHideTextView = (ShowHideTextView) findViewById(R$id.tv_mark_price);
        C27096v0 c27096v0Append = new C27096v0().append(getString(R$string.mark_price)).append(C33627eb.f69716f);
        ContractEntity contractEntityM34218R0 = m34218R0();
        PriceEntity priceEntity2 = priceEntity == null ? new PriceEntity(null, null, null, null, null, null, 63, null) : priceEntity;
        if (Intrinsics.areEqual("MP", "TP")) {
            if (Intrinsics.areEqual("MP", "MP")) {
                indexPrice = priceEntity2.getMarkPrice();
            } else {
                indexPrice = Intrinsics.areEqual("MP", "IP") ? priceEntity2.getIndexPrice() : priceEntity2.getLatestTicker().getPrice();
            }
            strM92640e = C42180b.m92640e(C41014a.m89921F(indexPrice, GLUtils.VERSION_UNKNOWN), null, C27039d.m66651k(contractEntityM34218R0 != null ? Integer.valueOf(C37567b.m84618h(contractEntityM34218R0)) : null, 2), true, false, true, 0, null, 105, null);
        } else {
            if (Intrinsics.areEqual("MP", "MP")) {
                indexPrice2 = priceEntity2.getMarkPrice();
            } else {
                indexPrice2 = Intrinsics.areEqual("MP", "IP") ? priceEntity2.getIndexPrice() : priceEntity2.getLatestTicker().getPrice();
            }
            strM92640e = C42180b.m92640e(C41014a.m89921F(indexPrice2, GLUtils.VERSION_UNKNOWN), null, C27039d.m66651k(contractEntityM34218R0 != null ? Integer.valueOf(C37567b.m84612b(contractEntityM34218R0)) : null, 2), true, false, true, 0, null, 105, null);
        }
        showHideTextView.setText(c27096v0Append.m66905e(strM92640e, m56586Y(R$color.emphasis)));
    }

    /* JADX INFO: renamed from: m1 */
    public final void m34269m1(TickerEntity tickerEntity) {
        String strM92640e;
        C27096v0 c27096v0M66905e;
        String strM92640e2;
        String strM92640e3;
        String strM92640e4;
        BigDecimal priceChgPct = tickerEntity.getPriceChgPct();
        String strM92640e5 = null;
        int iM54281f = C22890g.m54281f(this, C27039d.m66646f(priceChgPct != null ? Double.valueOf(priceChgPct.doubleValue()) : null) >= 0.0d);
        int iM56586Y = m56586Y(R$color.emphasis);
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), m34219X0(), false, 2, null);
        UpDownTextView upDownTextView = (UpDownTextView) findViewById(R$id.tv_price);
        if (upDownTextView != null) {
            BigDecimal price = tickerEntity.getPrice();
            if (price != null) {
                strM92640e4 = C42180b.m92640e(price, null, C27039d.m66650j(contractEntityM99529O != null ? Integer.valueOf(C37567b.m84618h(contractEntityM99529O)) : null), true, false, true, 0, null, 105, null);
            } else {
                strM92640e4 = null;
            }
            upDownTextView.m54917e(C27041f.m66669i(strM92640e4, C37569d.m84684y()), iM54281f);
        }
        ((ShowHideTextView) findViewById(R$id.tv_priceLegal)).setText(new C27096v0().append(C27041f.m66669i(C41014a.m89950x(C41014a.m89939m(C27039d.m66647g(tickerEntity.getPrice()), contractEntityM99529O != null ? contractEntityM99529O.getQuoteCurrency() : null), null, null, 0, true, true, true, true, 7, null), C37569d.m84684y())));
        ShowHideTextView showHideTextView = (ShowHideTextView) findViewById(R$id.tv_percent);
        C27096v0 c27096v0 = new C27096v0();
        BigDecimal priceChgPct2 = tickerEntity.getPriceChgPct();
        showHideTextView.setText(c27096v0.m66905e(C27041f.m66669i(priceChgPct2 != null ? C42180b.m92642g(priceChgPct2, null, null, 0, true, false, true, 23, null) : null, C37569d.m84684y()), iM54281f));
        ShowHideTextView showHideTextView2 = (ShowHideTextView) findViewById(R$id.tv_high);
        if (C5303w0.m6511a()) {
            C27096v0 c27096v1 = new C27096v0();
            BigDecimal highPrice = tickerEntity.getHighPrice();
            if (highPrice != null) {
                strM92640e3 = C42180b.m92640e(highPrice, null, C27039d.m66650j(contractEntityM99529O != null ? Integer.valueOf(C37567b.m84618h(contractEntityM99529O)) : null), true, false, true, 0, null, 105, null);
            } else {
                strM92640e3 = null;
            }
            c27096v0M66905e = c27096v1.m66905e(C27041f.m66669i(strM92640e3, C37569d.m84684y()), iM56586Y).append(C33627eb.f69716f).append((char) 8237 + getString(R$string.high_price_24h) + (char) 8236);
        } else {
            C27096v0 c27096v0Append = new C27096v0().append(getString(R$string.high_price_24h)).append(C33627eb.f69716f);
            BigDecimal highPrice2 = tickerEntity.getHighPrice();
            if (highPrice2 != null) {
                strM92640e = C42180b.m92640e(highPrice2, null, C27039d.m66650j(contractEntityM99529O != null ? Integer.valueOf(C37567b.m84618h(contractEntityM99529O)) : null), true, false, true, 0, null, 105, null);
            } else {
                strM92640e = null;
            }
            c27096v0M66905e = c27096v0Append.m66905e(C27041f.m66669i(strM92640e, C37569d.m84684y()), iM56586Y);
        }
        showHideTextView2.setText(c27096v0M66905e);
        ShowHideTextView showHideTextView3 = (ShowHideTextView) findViewById(R$id.tv_low);
        C27096v0 c27096v0Append2 = new C27096v0().append(getString(R$string.low_price_24h)).append(C33627eb.f69716f);
        BigDecimal lowPrice = tickerEntity.getLowPrice();
        if (lowPrice != null) {
            strM92640e2 = C42180b.m92640e(lowPrice, null, C27039d.m66650j(contractEntityM99529O != null ? Integer.valueOf(C37567b.m84618h(contractEntityM99529O)) : null), true, false, true, 0, null, 105, null);
        } else {
            strM92640e2 = null;
        }
        showHideTextView3.setText(c27096v0Append2.m66905e(C27041f.m66669i(strM92640e2, C37569d.m84684y()), iM56586Y));
        ShowHideTextView showHideTextView4 = (ShowHideTextView) findViewById(R$id.tv_time_amount);
        C27096v0 c27096v0Append3 = new C27096v0().append(getString(R$string.trade_24h));
        StringBuilder sb2 = new StringBuilder();
        sb2.append('(');
        sb2.append(contractEntityM99529O != null ? C37567b.m84621k(contractEntityM99529O) : null);
        sb2.append(") ");
        C27096v0 c27096v0Append4 = c27096v0Append3.append(sb2.toString());
        BigDecimal volume = tickerEntity.getVolume();
        if (volume != null) {
            strM92640e5 = C42180b.m92640e(volume, null, C27039d.m66650j(contractEntityM99529O != null ? Integer.valueOf(C37567b.m84622l(contractEntityM99529O)) : null), true, false, true, 0, null, 105, null);
        }
        showHideTextView4.setText(c27096v0Append4.m66905e(C27041f.m66669i(strM92640e5, C37569d.m84684y()), iM56586Y));
    }

    /* JADX INFO: renamed from: Z0 */
    private final void m34221Z0() {
        KLineToolBarView kLineToolBarView;
        KLineToolBarView kLineToolBarView2;
        KLineIndicatorView kLineIndicatorView;
        KLineIndicatorView kLineIndicatorView2;
        KLineIndicatorView kLineIndicatorView3;
        TabLayout tabLayout;
        TabLayout tabLayout2;
        TabLayout.Tab tabAt;
        TabLayout tabLayout3;
        TabLayout.Tab tabNewTab;
        TabLayout.Tab text;
        C36732a4 c36732a4M34262Q0;
        TabLayout tabLayout4;
        ImageView imageView;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        KuMexFlutterKlineFragment kuMexFlutterKlineFragmentM34266V0 = m34266V0();
        Intrinsics.checkNotNull(kuMexFlutterKlineFragmentM34266V0, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        C5286o.m6317a(supportFragmentManager, kuMexFlutterKlineFragmentM34266V0, R$id.container);
        C36732a4 c36732a4M34262Q1 = m34262Q0();
        if (c36732a4M34262Q1 != null && (imageView = c36732a4M34262Q1.f79701f) != null) {
            ViewExtKt.m66575f(imageView, new Function1() { // from class: com.kubi.kumex.kline.m0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KuMexKlineLandscapeActivity.m34225d1(this.f29366b, (View) obj);
                }
            });
        }
        String[] stringArray = getResources().getStringArray(R$array.kucoin_kline_all_titles);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        List mutableList = ArraysKt.toMutableList(stringArray);
        if (!C38190h.f85888a.m86167l()) {
            CollectionsKt.removeLastOrNull(mutableList);
        }
        int size = mutableList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C36732a4 c36732a4M34262Q2 = m34262Q0();
            if (c36732a4M34262Q2 != null && (tabLayout3 = c36732a4M34262Q2.f79702g) != null && (tabNewTab = tabLayout3.newTab()) != null && (text = tabNewTab.setText((CharSequence) mutableList.get(i11))) != null && (c36732a4M34262Q0 = m34262Q0()) != null && (tabLayout4 = c36732a4M34262Q0.f79702g) != null) {
                tabLayout4.addTab(text);
            }
        }
        C36732a4 c36732a4M34262Q3 = m34262Q0();
        if (c36732a4M34262Q3 != null && (tabLayout2 = c36732a4M34262Q3.f79702g) != null && (tabAt = tabLayout2.getTabAt(C37878b0.f85252a.m85523d())) != null) {
            tabAt.select();
        }
        C36732a4 c36732a4M34262Q4 = m34262Q0();
        if (c36732a4M34262Q4 != null && (tabLayout = c36732a4M34262Q4.f79702g) != null) {
            tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C16131c());
        }
        C36732a4 c36732a4M34262Q5 = m34262Q0();
        if (c36732a4M34262Q5 != null && (kLineIndicatorView3 = c36732a4M34262Q5.f79700e) != null) {
            kLineIndicatorView3.m63421l(new Consumer() { // from class: com.kubi.kumex.kline.n0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    KuMexKlineLandscapeActivity.m34226e1(this.f29367b, (Integer) obj);
                }
            });
        }
        C36732a4 c36732a4M34262Q6 = m34262Q0();
        if (c36732a4M34262Q6 != null && (kLineIndicatorView2 = c36732a4M34262Q6.f79700e) != null) {
            kLineIndicatorView2.m63422p(new Consumer() { // from class: com.kubi.kumex.kline.o0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    KuMexKlineLandscapeActivity.m34227f1(this.f29369b, (Integer) obj);
                }
            });
        }
        C36732a4 c36732a4M34262Q7 = m34262Q0();
        if (c36732a4M34262Q7 != null && (kLineIndicatorView = c36732a4M34262Q7.f79700e) != null) {
            kLineIndicatorView.m63418h(new Action() { // from class: com.kubi.kumex.kline.p0
                @Override // io.reactivex.functions.Action
                public final void run() {
                    KuMexKlineLandscapeActivity.m34222a1(this.f29371b);
                }
            });
        }
        C36732a4 c36732a4M34262Q8 = m34262Q0();
        if (c36732a4M34262Q8 != null && (kLineToolBarView2 = c36732a4M34262Q8.f79703h) != null) {
            kLineToolBarView2.m63439k(new Consumer() { // from class: com.kubi.kumex.kline.q0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    KuMexKlineLandscapeActivity.m34223b1(this.f29373b, (ToolBarClick.ToolBarItemType) obj);
                }
            });
        }
        C36732a4 c36732a4M34262Q9 = m34262Q0();
        if (c36732a4M34262Q9 != null && (kLineToolBarView = c36732a4M34262Q9.f79703h) != null) {
            kLineToolBarView.m63438i(new Consumer() { // from class: com.kubi.kumex.kline.r0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    KuMexKlineLandscapeActivity.m34224c1(this.f29376b, (ToolBarClick.ToolBarItemType) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a1 */
    public static final void m34222a1(KuMexKlineLandscapeActivity kuMexKlineLandscapeActivity) {
        kuMexKlineLandscapeActivity.m34261P0();
    }

    /* JADX INFO: renamed from: c1 */
    public static final void m34224c1(KuMexKlineLandscapeActivity kuMexKlineLandscapeActivity, ToolBarClick.ToolBarItemType toolBarItemType) {
        KLineToolBarView kLineToolBarView;
        KLineIndicatorView kLineIndicatorView;
        C36732a4 c36732a4M34262Q0 = kuMexKlineLandscapeActivity.m34262Q0();
        if (c36732a4M34262Q0 != null && (kLineIndicatorView = c36732a4M34262Q0.f79700e) != null) {
            ViewExtKt.m66594y(kLineIndicatorView);
        }
        C36732a4 c36732a4M34262Q1 = kuMexKlineLandscapeActivity.m34262Q0();
        if (c36732a4M34262Q1 != null && (kLineToolBarView = c36732a4M34262Q1.f79703h) != null) {
            ViewExtKt.m66577h(kLineToolBarView);
        }
    }

    /* JADX INFO: renamed from: e1 */
    public static final void m34226e1(KuMexKlineLandscapeActivity kuMexKlineLandscapeActivity, Integer num) {
        KuMexFlutterKlineFragment kuMexFlutterKlineFragmentM34266V0 = kuMexKlineLandscapeActivity.m34266V0();
        Intrinsics.checkNotNull(num);
        kuMexFlutterKlineFragmentM34266V0.m34100s3(num.intValue());
    }

    /* JADX INFO: renamed from: f1 */
    public static final void m34227f1(KuMexKlineLandscapeActivity kuMexKlineLandscapeActivity, Integer num) {
        KuMexFlutterKlineFragment kuMexFlutterKlineFragmentM34266V0 = kuMexKlineLandscapeActivity.m34266V0();
        Intrinsics.checkNotNull(num);
        kuMexFlutterKlineFragmentM34266V0.m34101t3(num.intValue());
    }

    /* JADX INFO: renamed from: i1 */
    public static final void m34230i1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j1 */
    public static final KLineSettingConfig m34231j1(KuMexKlineLandscapeActivity kuMexKlineLandscapeActivity) {
        KLineSettingConfig kLineSettingConfig = (KLineSettingConfig) kuMexKlineLandscapeActivity.getIntent().getParcelableExtra("data_4");
        if (kLineSettingConfig == null) {
            return new KLineSettingConfig(false, false, 3, null);
        }
        return kLineSettingConfig;
    }

    /* JADX INFO: renamed from: k1 */
    public static final KuMexFlutterKlineFragment m34233k1(KuMexKlineLandscapeActivity kuMexKlineLandscapeActivity) {
        return kuMexKlineLandscapeActivity.m34260N0();
    }

    /* JADX INFO: renamed from: o1 */
    public static final Unit m34239o1(KuMexKlineLandscapeActivity kuMexKlineLandscapeActivity, TickerEntity tickerEntity) {
        Intrinsics.checkNotNull(tickerEntity);
        kuMexKlineLandscapeActivity.m34269m1(tickerEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p1 */
    public static final void m34241p1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q1 */
    public static final Unit m34243q1(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r1 */
    public static final void m34245r1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s1 */
    public static final Unit m34247s1(KuMexKlineLandscapeActivity kuMexKlineLandscapeActivity, PriceEntity priceEntity) {
        Intrinsics.checkNotNull(priceEntity);
        kuMexKlineLandscapeActivity.m34268l1(priceEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t1 */
    public static final void m34249t1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u1 */
    public static final Unit m34251u1(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v1 */
    public static final void m34253v1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w1 */
    public static final String m34255w1(KuMexKlineLandscapeActivity kuMexKlineLandscapeActivity) {
        Bundle extras;
        String string;
        Intent intent = kuMexKlineLandscapeActivity.getIntent();
        if (intent != null && (extras = intent.getExtras()) != null && (string = extras.getString("symbol")) != null) {
            return string;
        }
        return C46527h0.f104291a.m102677L();
    }

    /* JADX INFO: renamed from: N0 */
    public final KuMexFlutterKlineFragment m34260N0() {
        Integer numValueOf;
        Bundle extras;
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            numValueOf = Integer.valueOf(extras.getInt("data"));
        } else {
            numValueOf = null;
        }
        return KuMexFlutterKlineFragment.f29307Z.newInstance(m34219X0(), C27039d.m66651k(numValueOf, 4));
    }

    /* JADX INFO: renamed from: P0 */
    public final void m34261P0() {
        KLineToolBarView kLineToolBarView;
        KLineIndicatorView kLineIndicatorView;
        C36732a4 c36732a4M34262Q0 = m34262Q0();
        if (c36732a4M34262Q0 != null && (kLineIndicatorView = c36732a4M34262Q0.f79700e) != null) {
            ViewExtKt.m66577h(kLineIndicatorView);
        }
        C36732a4 c36732a4M34262Q1 = m34262Q0();
        if (c36732a4M34262Q1 != null && (kLineToolBarView = c36732a4M34262Q1.f79703h) != null) {
            ViewExtKt.m66594y(kLineToolBarView);
        }
        m34266V0().m34098q3(ToolBarClick.ToolBarItemType.BAR_ITEM_Enter);
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity, com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        EdgeToEdgeCompat.f48106a.m58273k(this);
        m34221Z0();
        m34259M0();
        m34228g1();
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity, com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m34237n1();
        Integer numM34265U0 = m34265U0();
        if (numM34265U0 != null) {
            ((TextView) findViewById(numM34265U0.intValue())).performClick();
        }
        Integer numM34267W0 = m34267W0();
        if (numM34267W0 != null) {
            ((TextView) findViewById(numM34267W0.intValue())).performClick();
        }
        KuMexFlutterKlineFragment.m34095z3(m34266V0(), null, 1, null);
        m34266V0().m34099r3(m34264T0().getShowHistoryOrder());
        m34266V0().m34097p3(m34264T0().getShowActiveOrder());
        C44128b.m97266j("KuMexKlineLandscapeActivity", "changeActiveShow klineSettingConfig:" + m34264T0());
    }
}
