package com.kubi.kumex.market.p091v2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import androidx.camera.core.processing.util.GLUtils;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5286o;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.trade.submit.panel.premarket.g;
import com.kubi.futures.view.AnimateDrawableEndView;
import com.kubi.kumex.R$array;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$font;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.PriceEntity;
import com.kubi.kumex.data.market.model.TickerEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.dialog.C15943u;
import com.kubi.kumex.kline.KuMexKlineFragment;
import com.kubi.kumex.market.KuMexReadyFragment;
import com.kubi.monitor.helper.TracePageHelper;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.RadioGroupPlus;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27032f;
import dm.C36832r2;
import fm.C37567b;
import fm.C37569d;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.List;
import nf.C42828b;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p569qq.C43841b;
import p801yl.C46527h0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Triple;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import th.InterfaceC44980d;
import w00.C45681e;

/* JADX INFO: compiled from: KuMexMarketChartFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 M2\u00020\u0001:\u0001MB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020=H\u0016J\b\u0010?\u001a\u00020=H\u0002J\b\u0010@\u001a\u00020=H\u0002J\b\u0010A\u001a\u00020=H\u0002J\b\u0010B\u001a\u00020=H\u0002J\b\u0010C\u001a\u00020=H\u0002J\u001c\u0010D\u001a\u00020=2\b\u0010E\u001a\u0004\u0018\u00010F2\b\u0010G\u001a\u0004\u0018\u00010HH\u0002J\u0010\u0010I\u001a\u00020=2\u0006\u0010J\u001a\u00020FH\u0003J\u0010\u0010K\u001a\u00020=2\u0006\u0010J\u001a\u00020HH\u0002J\b\u0010L\u001a\u00020=H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u000f\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u000f\u001a\u0004\b#\u0010$R!\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u000f\u001a\u0004\b(\u0010)R\u001d\u0010+\u001a\u0004\u0018\u00010,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u000f\u001a\u0004\b-\u0010.R\u001c\u00100\u001a\u0004\u0018\u00010\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\r\"\u0004\b2\u00103¨\u0006N"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/KuMexMarketChartFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexFragmentMarketBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentMarketBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "symbol", "", "getSymbol", "()Ljava/lang/String;", "symbol$delegate", "Lkotlin/Lazy;", "selectPriceTypeIndex", "", "klineFragment", "Lcom/kubi/kumex/kline/KuMexKlineFragment;", "getKlineFragment", "()Lcom/kubi/kumex/kline/KuMexKlineFragment;", "klineFragment$delegate", "mexReadyFragment", "Lcom/kubi/kumex/market/KuMexReadyFragment;", "getMexReadyFragment", "()Lcom/kubi/kumex/market/KuMexReadyFragment;", "mexReadyFragment$delegate", "bookFragment", "Lcom/kubi/kumex/market/v2/KuMexBookFragmentV2;", "getBookFragment", "()Lcom/kubi/kumex/market/v2/KuMexBookFragmentV2;", "bookFragment$delegate", "recentFragment", "Lcom/kubi/kumex/market/v2/KuMexRecentFragmentV2;", "getRecentFragment", "()Lcom/kubi/kumex/market/v2/KuMexRecentFragmentV2;", "recentFragment$delegate", "bottomFragmentList", "", "getBottomFragmentList", "()Ljava/util/List;", "bottomFragmentList$delegate", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "getContract", "()Lcom/kubi/kumex/data/platform/model/ContractEntity;", "contract$delegate", "pageId", "getPageId", "setPageId", "(Ljava/lang/String;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onLoad", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "initListener", "toggleCurrentFragment", "showSwitchPriceTypeDialog", "resetKLineFragmentData", "subscribe", "setPriceByPriceType", "ticker", "Lcom/kubi/kumex/data/market/model/TickerEntity;", FirebaseAnalytics.Param.PRICE, "Lcom/kubi/kumex/data/market/model/PriceEntity;", "onTickerGet", "it", "onPriceGet", "onResume", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKuMexMarketChartFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuMexMarketChartFragment.kt\ncom/kubi/kumex/market/v2/KuMexMarketChartFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 PriceEntityEx.kt\ncom/kubi/kumex/extensions/PriceEntityExKt\n*L\n1#1,336:1\n147#2,16:337\n28#3,3:353\n20#3,18:356\n*S KotlinDebug\n*F\n+ 1 KuMexMarketChartFragment.kt\ncom/kubi/kumex/market/v2/KuMexMarketChartFragment\n*L\n79#1:337,16\n329#1:353,3\n329#1:356,18\n*E\n"})
public final class KuMexMarketChartFragment extends BaseFragment {

    /* JADX INFO: renamed from: W */
    public int f29607W;

    /* JADX INFO: renamed from: f0 */
    public static final /* synthetic */ KProperty<Object>[] f29604f0 = {Reflection.property1(new PropertyReference1Impl(KuMexMarketChartFragment.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexFragmentMarketBinding;", 0))};

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public static final Companion f29603e0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f29605U = C45681e.m100799e(this, new Function1<KuMexMarketChartFragment, C36832r2>() { // from class: com.kubi.kumex.market.v2.KuMexMarketChartFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36832r2 invoke(@NotNull KuMexMarketChartFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36832r2.m82527a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36832r2, Unit>() { // from class: com.kubi.kumex.market.v2.KuMexMarketChartFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36832r2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36832r2 c36832r2) {
            invoke(c36832r2);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f29606V = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.v2.y
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuMexMarketChartFragment.m34697i4(this.f29872b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f29608X = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.v2.z
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuMexMarketChartFragment.m34681P3(this.f29875b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f29609Y = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.v2.a0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuMexMarketChartFragment.m34682Q3(this.f29689b);
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f29610Z = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.v2.b0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuMexMarketChartFragment.m34674C3(this.f29696b);
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f29611a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.v2.c0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuMexMarketChartFragment.m34685T3(this.f29702b);
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f29612b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.v2.d0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuMexMarketChartFragment.m34675D3(this.f29767b);
        }
    });

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f29613c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.v2.e0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuMexMarketChartFragment.m34676E3(this.f29776b);
        }
    });

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public String f29614d0 = "B6FuturesCandle";

    /* JADX INFO: compiled from: KuMexMarketChartFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/KuMexMarketChartFragment$Companion;", "", "<init>", "()V", "instance", "Lcom/kubi/kumex/market/v2/KuMexMarketChartFragment;", "symbol", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final KuMexMarketChartFragment instance(@NotNull String symbol) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            KuMexMarketChartFragment kuMexMarketChartFragment = new KuMexMarketChartFragment();
            Bundle bundle = new Bundle();
            bundle.putString("symbol", symbol);
            kuMexMarketChartFragment.setArguments(bundle);
            return kuMexMarketChartFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.KuMexMarketChartFragment$a */
    /* JADX INFO: compiled from: KuMexMarketChartFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/kumex/market/v2/KuMexMarketChartFragment$initListener$2", "Lcom/google/android/material/appbar/AppBarLayout$Behavior$DragCallback;", "canDrag", "", "appBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16318a extends AppBarLayout.Behavior.DragCallback {
        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.BaseDragCallback
        public boolean canDrag(AppBarLayout appBarLayout) {
            Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
            return true;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.KuMexMarketChartFragment$b */
    /* JADX INFO: compiled from: KuMexMarketChartFragment.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/kumex/market/v2/KuMexMarketChartFragment$initListener$3", "Lcom/kubi/resources/widget/RadioGroupPlus$OnCheckedChangeListener;", "onCheckedChanged", "", "group", "Lcom/kubi/resources/widget/RadioGroupPlus;", "checkedId", "", "isChecked", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16319b implements RadioGroupPlus.InterfaceC22946c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C36832r2 f29615a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ KuMexMarketChartFragment f29616b;

        public C16319b(C36832r2 c36832r2, KuMexMarketChartFragment kuMexMarketChartFragment) {
            this.f29615a = c36832r2;
            this.f29616b = kuMexMarketChartFragment;
        }

        @Override // com.kubi.resources.widget.RadioGroupPlus.InterfaceC22946c
        /* JADX INFO: renamed from: a */
        public void mo16018a(RadioGroupPlus radioGroupPlus, int i11, boolean z11) {
            Context context = this.f29615a.f80973o.getContext();
            int i12 = R$font.medium;
            Typeface font = ResourcesCompat.getFont(context, i12);
            Typeface font2 = ResourcesCompat.getFont(this.f29615a.f80973o.getContext(), i12);
            this.f29615a.f80973o.setTypeface(i11 == R$id.orderBookRb ? font2 : font);
            RadioButton radioButton = this.f29615a.f80976r;
            if (i11 == R$id.recentDealRb) {
                font = font2;
            }
            radioButton.setTypeface(font);
            this.f29616b.m34699j4();
        }
    }

    /* JADX INFO: renamed from: C3 */
    public static final KuMexBookFragmentV2 m34674C3(KuMexMarketChartFragment kuMexMarketChartFragment) {
        return KuMexBookFragmentV2.f29593Z.instance(kuMexMarketChartFragment.m34678M3());
    }

    /* JADX INFO: renamed from: E3 */
    public static final ContractEntity m34676E3(KuMexMarketChartFragment kuMexMarketChartFragment) {
        return InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), kuMexMarketChartFragment.m34678M3(), false, 2, null);
    }

    /* JADX INFO: renamed from: I3 */
    private final ContractEntity m34677I3() {
        return (ContractEntity) this.f29613c0.getValue();
    }

    /* JADX INFO: renamed from: M3 */
    private final String m34678M3() {
        return (String) this.f29606V.getValue();
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m34680O3(C36832r2 c36832r2, KuMexMarketChartFragment kuMexMarketChartFragment) {
        c36832r2.f80975q.m28819j();
        kuMexMarketChartFragment.m34724W3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P3 */
    public static final KuMexKlineFragment m34681P3(KuMexMarketChartFragment kuMexMarketChartFragment) {
        KuMexKlineFragment.Companion companion = KuMexKlineFragment.f29309i0;
        String strM34678M3 = kuMexMarketChartFragment.m34678M3();
        ContractEntity contractEntityM34677I3 = kuMexMarketChartFragment.m34677I3();
        return companion.newInstance(strM34678M3, C27039d.m66650j(contractEntityM34677I3 != null ? Integer.valueOf(C37567b.m84618h(contractEntityM34677I3)) : null));
    }

    /* JADX INFO: renamed from: Q3 */
    public static final KuMexReadyFragment m34682Q3(KuMexMarketChartFragment kuMexMarketChartFragment) {
        return KuMexReadyFragment.f29396X.newInstance(kuMexMarketChartFragment.m34678M3(), kuMexMarketChartFragment.m34677I3());
    }

    /* JADX INFO: renamed from: R3 */
    private final void m34683R3(PriceEntity priceEntity) {
        BaseTextView baseTextView;
        BigDecimal indexPrice;
        String strM92640e;
        BigDecimal indexPrice2;
        PriceEntity priceEntity2 = priceEntity;
        m34723V3(null, priceEntity2);
        C36832r2 c36832r2M34716F3 = m34716F3();
        if (c36832r2M34716F3 == null || (baseTextView = c36832r2M34716F3.f80972n) == null) {
            return;
        }
        ContractEntity contractEntityM34677I3 = m34677I3();
        if (priceEntity2 == null) {
            priceEntity2 = new PriceEntity(null, null, null, null, null, null, 63, null);
        }
        if (Intrinsics.areEqual("MP", "TP")) {
            if (Intrinsics.areEqual("MP", "MP")) {
                indexPrice = priceEntity2.getMarkPrice();
            } else {
                indexPrice = Intrinsics.areEqual("MP", "IP") ? priceEntity2.getIndexPrice() : priceEntity2.getLatestTicker().getPrice();
            }
            strM92640e = C42180b.m92640e(C41014a.m89921F(indexPrice, GLUtils.VERSION_UNKNOWN), null, C27039d.m66651k(contractEntityM34677I3 != null ? Integer.valueOf(C37567b.m84618h(contractEntityM34677I3)) : null, 2), true, false, true, 0, null, 105, null);
        } else {
            if (Intrinsics.areEqual("MP", "MP")) {
                indexPrice2 = priceEntity2.getMarkPrice();
            } else {
                indexPrice2 = Intrinsics.areEqual("MP", "IP") ? priceEntity2.getIndexPrice() : priceEntity2.getLatestTicker().getPrice();
            }
            strM92640e = C42180b.m92640e(C41014a.m89921F(indexPrice2, GLUtils.VERSION_UNKNOWN), null, C27039d.m66651k(contractEntityM34677I3 != null ? Integer.valueOf(C37567b.m84612b(contractEntityM34677I3)) : null, 2), true, false, true, 0, null, 105, null);
        }
        baseTextView.setText(strM92640e);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x015d  */
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: S3 */
    private final void m34684S3(TickerEntity tickerEntity) {
        C36832r2 c36832r2M34716F3;
        String strM92640e;
        String strM92640e2;
        String quoteCurrency;
        Context context = getContext();
        if (context == null || (c36832r2M34716F3 = m34716F3()) == null) {
            return;
        }
        m34723V3(tickerEntity, null);
        BaseTextView baseTextView = c36832r2M34716F3.f80967i;
        BigDecimal priceChgPct = tickerEntity.getPriceChgPct();
        baseTextView.setTextColor(C22890g.m54281f(context, C27039d.m66646f(priceChgPct != null ? Double.valueOf(priceChgPct.doubleValue()) : null) >= 0.0d));
        BaseTextView baseTextView2 = c36832r2M34716F3.f80968j;
        double dM66647g = C27039d.m66647g(tickerEntity.getPrice());
        ContractEntity contractEntityM34677I3 = m34677I3();
        baseTextView2.setText(C27041f.m66669i(C41014a.m89950x(C41014a.m89939m(dM66647g, contractEntityM34677I3 != null ? contractEntityM34677I3.getQuoteCurrency() : null), null, null, 0, true, false, true, true, 23, null), C37569d.m84684y()));
        BaseTextView baseTextView3 = c36832r2M34716F3.f80974p;
        C27096v0 c27096v0 = new C27096v0();
        BigDecimal priceChgPct2 = tickerEntity.getPriceChgPct();
        String strM93915p = C42828b.m93915p(C42828b.m93911l(C27041f.m66669i(priceChgPct2 != null ? C42180b.m92642g(priceChgPct2, null, null, 0, true, false, true, 23, null) : null, C37569d.m84684y())));
        BigDecimal priceChgPct3 = tickerEntity.getPriceChgPct();
        c27096v0.m66905e(strM93915p, C22890g.m54281f(context, C27039d.m66646f(priceChgPct3 != null ? Double.valueOf(priceChgPct3.doubleValue()) : null) >= 0.0d));
        baseTextView3.setText(c27096v0);
        BaseTextView baseTextView4 = c36832r2M34716F3.f80965g;
        BigDecimal highPrice = tickerEntity.getHighPrice();
        if (highPrice != null) {
            ContractEntity contractEntityM34677I4 = m34677I3();
            strM92640e = C42180b.m92640e(highPrice, null, C27039d.m66650j(contractEntityM34677I4 != null ? Integer.valueOf(C37567b.m84618h(contractEntityM34677I4)) : null), true, false, true, 0, null, 105, null);
        } else {
            strM92640e = null;
        }
        baseTextView4.setText(C27041f.m66669i(strM92640e, "- -"));
        BaseTextView baseTextView5 = c36832r2M34716F3.f80970l;
        BigDecimal lowPrice = tickerEntity.getLowPrice();
        if (lowPrice != null) {
            ContractEntity contractEntityM34677I5 = m34677I3();
            strM92640e2 = C42180b.m92640e(lowPrice, null, C27039d.m66650j(contractEntityM34677I5 != null ? Integer.valueOf(C37567b.m84618h(contractEntityM34677I5)) : null), true, false, true, 0, null, 105, null);
        } else {
            strM92640e2 = null;
        }
        baseTextView5.setText(C27041f.m66669i(strM92640e2, "- -"));
        ContractEntity contractEntityM34677I6 = m34677I3();
        String strM84621k = contractEntityM34677I6 != null ? C37567b.m84621k(contractEntityM34677I6) : null;
        ContractEntity contractEntityM34677I7 = m34677I3();
        if (contractEntityM34677I7 == null || !contractEntityM34677I7.isInverse()) {
            ContractEntity contractEntityM34677I8 = m34677I3();
            if (contractEntityM34677I8 != null) {
                quoteCurrency = contractEntityM34677I8.getQuoteCurrency();
            } else {
                quoteCurrency = null;
            }
        } else {
            ContractEntity contractEntityM34677I9 = m34677I3();
            if (contractEntityM34677I9 != null) {
                quoteCurrency = contractEntityM34677I9.getDisplayBaseCurrency();
            } else {
                quoteCurrency = null;
            }
        }
        String strM66677q = quoteCurrency != null ? C27041f.m66677q(quoteCurrency) : null;
        if (strM84621k != null) {
            c36832r2M34716F3.f80978t.setText(getString(R$string.market_24h_vol) + '(' + strM84621k + ')');
        }
        if (strM66677q != null) {
            c36832r2M34716F3.f80963e.setText(getString(R$string.market_24h_amount) + '(' + strM66677q + ')');
        }
        BaseTextView baseTextView6 = c36832r2M34716F3.f80979u;
        BigDecimal volume = tickerEntity.getVolume();
        baseTextView6.setText(volume != null ? C41014a.m89931e(volume, false, 1, null) : null);
        BaseTextView baseTextView7 = c36832r2M34716F3.f80962d;
        BigDecimal turnover = tickerEntity.getTurnover();
        baseTextView7.setText(turnover != null ? C41014a.m89931e(turnover, false, 1, null) : null);
    }

    /* JADX INFO: renamed from: T3 */
    public static final KuMexRecentFragmentV2 m34685T3(KuMexMarketChartFragment kuMexMarketChartFragment) {
        return KuMexRecentFragmentV2.f29667X.instance(kuMexMarketChartFragment.m34678M3());
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Unit m34687Y3(KuMexMarketChartFragment kuMexMarketChartFragment, int i11, CharSequence text) {
        AnimateDrawableEndView animateDrawableEndView;
        Intrinsics.checkNotNullParameter(text, "text");
        kuMexMarketChartFragment.f29607W = i11;
        C36832r2 c36832r2M34716F3 = kuMexMarketChartFragment.m34716F3();
        if (c36832r2M34716F3 != null && (animateDrawableEndView = c36832r2M34716F3.f80975q) != null) {
            animateDrawableEndView.setText(text);
        }
        kuMexMarketChartFragment.m34722U3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    private final void m34688Z3() {
        BaseTextView baseTextView;
        g gVar = g.a;
        RepositoryServiceLocator repositoryServiceLocator = RepositoryServiceLocator.f19236a;
        if (gVar.o(InterfaceC44980d.m99529O(repositoryServiceLocator.m20288g(), m34678M3(), false, 2, null))) {
            C36832r2 c36832r2M34716F3 = m34716F3();
            if (c36832r2M34716F3 == null || (baseTextView = c36832r2M34716F3.f80967i) == null) {
                return;
            }
            baseTextView.setTextColor(ResourcesCompat.getColor(getResources(), R$color.c_text40, null));
            return;
        }
        Observable<TickerEntity> observableObserveOn = repositoryServiceLocator.m20286e().mo24802b(m34678M3()).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.market.v2.f0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexMarketChartFragment.m34689a4(this.f29782b, (TickerEntity) obj);
            }
        };
        Consumer<? super TickerEntity> consumer = new Consumer() { // from class: com.kubi.kumex.market.v2.g0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexMarketChartFragment.m34690b4(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.kumex.market.v2.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexMarketChartFragment.m34691c4((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.market.v2.r
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexMarketChartFragment.m34692d4(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getVisibleDisposable());
        Observable<PriceEntity> observableObserveOn2 = repositoryServiceLocator.m20286e().mo24807g(m34678M3()).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function3 = new Function1() { // from class: com.kubi.kumex.market.v2.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexMarketChartFragment.m34693e4(this.f29837b, (PriceEntity) obj);
            }
        };
        Consumer<? super PriceEntity> consumer2 = new Consumer() { // from class: com.kubi.kumex.market.v2.t
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexMarketChartFragment.m34694f4(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.kumex.market.v2.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexMarketChartFragment.m34695g4((Throwable) obj);
            }
        };
        Disposable disposableSubscribe2 = observableObserveOn2.subscribe(consumer2, new Consumer() { // from class: com.kubi.kumex.market.v2.v
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexMarketChartFragment.m34696h4(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe2, getVisibleDisposable());
    }

    /* JADX INFO: renamed from: F3 */
    public final C36832r2 m34716F3() {
        return (C36832r2) this.f29605U.getValue(this, f29604f0[0]);
    }

    /* JADX INFO: renamed from: G3 */
    public final KuMexBookFragmentV2 m34717G3() {
        return (KuMexBookFragmentV2) this.f29610Z.getValue();
    }

    /* JADX INFO: renamed from: H3 */
    public final List<BaseFragment> m34718H3() {
        return (List) this.f29612b0.getValue();
    }

    /* JADX INFO: renamed from: J3 */
    public final KuMexKlineFragment m34719J3() {
        return (KuMexKlineFragment) this.f29608X.getValue();
    }

    /* JADX INFO: renamed from: K3 */
    public final KuMexReadyFragment m34720K3() {
        return (KuMexReadyFragment) this.f29609Y.getValue();
    }

    /* JADX INFO: renamed from: L3 */
    public final KuMexRecentFragmentV2 m34721L3() {
        return (KuMexRecentFragmentV2) this.f29611a0.getValue();
    }

    /* JADX INFO: renamed from: W3 */
    public final void m34724W3() {
        BaseDialogFragment baseDialogFragmentM54192r3 = C15943u.m33705x(this.f29607W, ArraysKt.toList(C27017c.f54310a.m66517g(R$array.bkumex_kline_price_type)), new Function2() { // from class: com.kubi.kumex.market.v2.w
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KuMexMarketChartFragment.m34687Y3(this.f29864b, ((Integer) obj).intValue(), (CharSequence) obj2);
            }
        }).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.kumex.market.v2.x
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                KuMexMarketChartFragment.m34686X3(this.f29868b, dialogInterface);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentM54192r3.show(childFragmentManager, "klinePriceTypeDialog");
    }

    @Override // com.kubi.sdk.BaseFragment, p569qq.InterfaceC43845f
    @Nullable
    /* JADX INFO: renamed from: getPageId, reason: from getter */
    public String getF16845V() {
        return this.f29614d0;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C43841b.m96557d("kumex_k_line_page_load", "page_load_start", null, 4, null);
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_market, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setPageId(@Nullable String str) {
        this.f29614d0 = str;
    }

    /* JADX INFO: renamed from: D3 */
    public static final List m34675D3(KuMexMarketChartFragment kuMexMarketChartFragment) {
        return CollectionsKt.listOf((Object[]) new BaseFragment[]{kuMexMarketChartFragment.m34717G3(), kuMexMarketChartFragment.m34721L3()});
    }

    /* JADX INFO: renamed from: N3 */
    private final void m34679N3() {
        AppBarLayout appBarLayout;
        final C36832r2 c36832r2M34716F3 = m34716F3();
        if (c36832r2M34716F3 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = null;
        if (g.a.o(InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), m34678M3(), false, 2, null))) {
            C5286o.m6317a(getChildFragmentManager(), m34720K3(), R$id.kline);
        } else {
            C5286o.m6317a(getChildFragmentManager(), m34719J3(), R$id.kline);
        }
        c36832r2M34716F3.f80975q.setText(getStringRes(R$string.last_price, new Object[0]));
        AnimateDrawableEndView priceType = c36832r2M34716F3.f80975q;
        Intrinsics.checkNotNullExpressionValue(priceType, "priceType");
        C27046k.m66711z(priceType, 0L, new Function0() { // from class: com.kubi.kumex.market.v2.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuMexMarketChartFragment.m34680O3(c36832r2M34716F3, this);
            }
        }, 1, null);
        C36832r2 c36832r2M34716F4 = m34716F3();
        if (c36832r2M34716F4 != null && (appBarLayout = c36832r2M34716F4.f80960b) != null) {
            layoutParams = appBarLayout.getLayoutParams();
        }
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        Intrinsics.checkNotNull(behavior, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.Behavior");
        ((AppBarLayout.Behavior) behavior).setDragCallback(new C16318a());
        c36832r2M34716F3.f80977s.setOnCheckedChangeListener(new C16319b(c36832r2M34716F3, this));
        c36832r2M34716F3.f80977s.m54743f(R$id.orderBookRb);
    }

    /* JADX INFO: renamed from: X3 */
    public static final void m34686X3(KuMexMarketChartFragment kuMexMarketChartFragment, DialogInterface dialogInterface) {
        AnimateDrawableEndView animateDrawableEndView;
        C36832r2 c36832r2M34716F3 = kuMexMarketChartFragment.m34716F3();
        if (c36832r2M34716F3 != null && (animateDrawableEndView = c36832r2M34716F3.f80975q) != null) {
            animateDrawableEndView.m28819j();
        }
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m34689a4(KuMexMarketChartFragment kuMexMarketChartFragment, TickerEntity tickerEntity) {
        Intrinsics.checkNotNull(tickerEntity);
        kuMexMarketChartFragment.m34684S3(tickerEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public static final void m34690b4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c4 */
    public static final Unit m34691c4(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public static final void m34692d4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e4 */
    public static final Unit m34693e4(KuMexMarketChartFragment kuMexMarketChartFragment, PriceEntity priceEntity) {
        Intrinsics.checkNotNull(priceEntity);
        kuMexMarketChartFragment.m34683R3(priceEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public static final void m34694f4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m34695g4(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h4 */
    public static final void m34696h4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i4 */
    public static final String m34697i4(KuMexMarketChartFragment kuMexMarketChartFragment) {
        String strM56284y;
        Bundle arguments = kuMexMarketChartFragment.getArguments();
        if (arguments != null && (strM56284y = RouteExKt.m56284y(arguments, "symbol")) != null) {
            return strM56284y;
        }
        return C46527h0.f104291a.m102677L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public final void m34699j4() {
        Integer numValueOf;
        Fragment fragmentM34717G3;
        RadioGroupPlus radioGroupPlus;
        C36832r2 c36832r2M34716F3 = m34716F3();
        if (c36832r2M34716F3 != null && (radioGroupPlus = c36832r2M34716F3.f80977s) != null) {
            numValueOf = Integer.valueOf(radioGroupPlus.getF44016b());
        } else {
            numValueOf = null;
        }
        int i11 = R$id.orderBookRb;
        if (numValueOf != null && numValueOf.intValue() == i11) {
            fragmentM34717G3 = m34717G3();
        } else {
            int i12 = R$id.recentDealRb;
            if (numValueOf != null && numValueOf.intValue() == i12) {
                fragmentM34717G3 = m34721L3();
            } else {
                fragmentM34717G3 = m34717G3();
            }
        }
        if (!fragmentM34717G3.isAdded()) {
            getChildFragmentManager().beginTransaction().add(R$id.bottomTradeInfoFl, fragmentM34717G3).commitNowAllowingStateLoss();
        }
        for (BaseFragment baseFragment : m34718H3()) {
            if (!Intrinsics.areEqual(baseFragment, fragmentM34717G3)) {
                C27032f.m66615f(this, baseFragment);
            } else {
                C27032f.m66627r(this, baseFragment);
            }
        }
    }

    /* JADX INFO: renamed from: U3 */
    public final void m34722U3() {
        Triple triple;
        ContractEntity contractEntityM34677I3 = m34677I3();
        if (contractEntityM34677I3 == null) {
            return;
        }
        int i11 = this.f29607W;
        if (i11 == 0) {
            triple = new Triple("TP", C27041f.m66668h(contractEntityM34677I3.getSymbol()), Integer.valueOf(C37567b.m84618h(contractEntityM34677I3)));
        } else if (i11 == 1) {
            triple = new Triple("MP", C27041f.m66668h(contractEntityM34677I3.getSymbol()) + "_MARKPRICE", Integer.valueOf(C37567b.m84612b(contractEntityM34677I3)));
        } else {
            triple = new Triple("IP", C27041f.m66668h(contractEntityM34677I3.getIndexSymbol()), Integer.valueOf(C37567b.m84612b(contractEntityM34677I3)));
        }
        m34719J3().m34184V4((String) triple.getFirst(), (String) triple.getSecond(), ((Number) triple.getThird()).intValue());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: V3 */
    public final void m34723V3(TickerEntity tickerEntity, PriceEntity priceEntity) {
        BaseTextView baseTextView;
        BigDecimal indexPrice;
        C36832r2 c36832r2M34716F3 = m34716F3();
        if (c36832r2M34716F3 != null && (baseTextView = c36832r2M34716F3.f80967i) != null) {
            int i11 = this.f29607W;
            String strM92640e = null;
            Integer numValueOf = null;
            strM92640e = null;
            Integer numValueOf2 = null;
            if (i11 == 0 && tickerEntity != null) {
                BigDecimal price = tickerEntity.getPrice();
                if (price != null) {
                    ContractEntity contractEntityM34677I3 = m34677I3();
                    if (contractEntityM34677I3 != null) {
                        numValueOf = Integer.valueOf(C37567b.m84618h(contractEntityM34677I3));
                    }
                    strM92640e = C42180b.m92640e(price, null, C27039d.m66650j(numValueOf), true, false, true, 0, null, 105, null);
                }
            } else if (i11 > 0 && priceEntity != null) {
                if (i11 == 1) {
                    indexPrice = priceEntity.getMarkPrice();
                } else {
                    indexPrice = priceEntity.getIndexPrice();
                }
                BigDecimal bigDecimal = indexPrice;
                if (bigDecimal != null) {
                    ContractEntity contractEntityM34677I4 = m34677I3();
                    if (contractEntityM34677I4 != null) {
                        numValueOf2 = Integer.valueOf(C37567b.m84612b(contractEntityM34677I4));
                    }
                    strM92640e = C42180b.m92640e(bigDecimal, null, C27039d.m66650j(numValueOf2), true, false, true, 0, null, 105, null);
                }
            } else {
                return;
            }
            baseTextView.setText(strM92640e);
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        m34679N3();
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        TracePageHelper.m42470e("open_k_contract", "load_k_contract", "加载:合约-k线");
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m34688Z3();
    }
}
