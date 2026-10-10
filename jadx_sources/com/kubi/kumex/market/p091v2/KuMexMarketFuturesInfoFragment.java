package com.kubi.kumex.market.p091v2;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.R$font;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.trade.menu.WebViewContainerFragment;
import com.kubi.resources.widget.RadioGroupPlus;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36850u2;
import fm.C37567b;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p729wl.C45875l0;
import p801yl.C46527h0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.reflect.KProperty;
import th.InterfaceC44980d;
import w00.C45681e;

/* JADX INFO: compiled from: KuMexMarketFuturesInfoFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u001a\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010-\u001a\u00020+H\u0002J\b\u0010.\u001a\u00020+H\u0002J\b\u0010/\u001a\u00020+H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0016\u0010\u0013R\u001b\u0010\u0018\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0019\u0010\u0013R\u001b\u0010\u001b\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000f\u001a\u0004\b\u001c\u0010\u0013R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/KuMexMarketFuturesInfoFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexFragmentMarketFuturesInfoBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentMarketFuturesInfoBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "symbol", "", "getSymbol", "()Ljava/lang/String;", "symbol$delegate", "Lkotlin/Lazy;", "tradingRulesFragment", "Lcom/kubi/kumex/trade/menu/WebViewContainerFragment;", "getTradingRulesFragment", "()Lcom/kubi/kumex/trade/menu/WebViewContainerFragment;", "tradingRulesFragment$delegate", "fundingRateInTimeFragment", "getFundingRateInTimeFragment", "fundingRateInTimeFragment$delegate", "fundingRateFragment", "getFundingRateFragment", "fundingRateFragment$delegate", "riskLimitFragment", "getRiskLimitFragment", "riskLimitFragment$delegate", "isPerpetualContract", "", "infoFragments", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "preloadFragments", "bindAdapter", "toggleCurrentFragment", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKuMexMarketFuturesInfoFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuMexMarketFuturesInfoFragment.kt\ncom/kubi/kumex/market/v2/KuMexMarketFuturesInfoFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,193:1\n147#2,16:194\n1869#3,2:210\n1869#3,2:212\n*S KotlinDebug\n*F\n+ 1 KuMexMarketFuturesInfoFragment.kt\ncom/kubi/kumex/market/v2/KuMexMarketFuturesInfoFragment\n*L\n46#1:194,16\n134#1:210,2\n187#1:212,2\n*E\n"})
public final class KuMexMarketFuturesInfoFragment extends BaseFragment {

    /* JADX INFO: renamed from: a0 */
    public boolean f29625a0;

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f29618d0 = {Reflection.property1(new PropertyReference1Impl(KuMexMarketFuturesInfoFragment.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexFragmentMarketFuturesInfoBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final Companion f29617c0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f29619U = C45681e.m100799e(this, new Function1<KuMexMarketFuturesInfoFragment, C36850u2>() { // from class: com.kubi.kumex.market.v2.KuMexMarketFuturesInfoFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36850u2 invoke(@NotNull KuMexMarketFuturesInfoFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36850u2.m82565a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36850u2, Unit>() { // from class: com.kubi.kumex.market.v2.KuMexMarketFuturesInfoFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36850u2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36850u2 c36850u2) {
            invoke(c36850u2);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f29620V = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.v2.j0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuMexMarketFuturesInfoFragment.m34728E3(this.f29803b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f29621W = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.v2.k0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuMexMarketFuturesInfoFragment.m34730G3(this.f29807b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f29622X = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.v2.l0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuMexMarketFuturesInfoFragment.m34741t3(this.f29811b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f29623Y = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.v2.m0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuMexMarketFuturesInfoFragment.m34740s3(this.f29816b);
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f29624Z = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.market.v2.n0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KuMexMarketFuturesInfoFragment.m34727D3(this.f29820b);
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public List<WebViewContainerFragment> f29626b0 = CollectionsKt.emptyList();

    /* JADX INFO: compiled from: KuMexMarketFuturesInfoFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/KuMexMarketFuturesInfoFragment$Companion;", "", "<init>", "()V", "instance", "Lcom/kubi/kumex/market/v2/KuMexMarketFuturesInfoFragment;", "symbol", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final KuMexMarketFuturesInfoFragment instance(@NotNull String symbol) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            KuMexMarketFuturesInfoFragment kuMexMarketFuturesInfoFragment = new KuMexMarketFuturesInfoFragment();
            Bundle bundle = new Bundle();
            bundle.putString("symbol", symbol);
            kuMexMarketFuturesInfoFragment.setArguments(bundle);
            return kuMexMarketFuturesInfoFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.KuMexMarketFuturesInfoFragment$a */
    /* JADX INFO: compiled from: KuMexMarketFuturesInfoFragment.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/kumex/market/v2/KuMexMarketFuturesInfoFragment$bindAdapter$1", "Lcom/kubi/resources/widget/RadioGroupPlus$OnCheckedChangeListener;", "onCheckedChanged", "", "group", "Lcom/kubi/resources/widget/RadioGroupPlus;", "checkedId", "", "isChecked", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16320a implements RadioGroupPlus.InterfaceC22946c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C36850u2 f29627a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ KuMexMarketFuturesInfoFragment f29628b;

        public C16320a(C36850u2 c36850u2, KuMexMarketFuturesInfoFragment kuMexMarketFuturesInfoFragment) {
            this.f29627a = c36850u2;
            this.f29628b = kuMexMarketFuturesInfoFragment;
        }

        @Override // com.kubi.resources.widget.RadioGroupPlus.InterfaceC22946c
        /* JADX INFO: renamed from: a */
        public void mo16018a(RadioGroupPlus radioGroupPlus, int i11, boolean z11) {
            Context context = this.f29627a.f81140h.getContext();
            int i12 = R$font.medium;
            Typeface font = ResourcesCompat.getFont(context, i12);
            Typeface font2 = ResourcesCompat.getFont(this.f29627a.f81140h.getContext(), i12);
            RadioButton radioButton = this.f29627a.f81140h;
            int i13 = R$id.orderBookRb;
            radioButton.setTypeface(i11 == i13 ? font2 : font);
            RadioButton radioButton2 = this.f29627a.f81134b;
            int i14 = R$id.recentDealRb;
            radioButton2.setTypeface(i11 == i14 ? font2 : font);
            RadioButton radioButton3 = this.f29627a.f81139g;
            if (i11 == i14) {
                font = font2;
            }
            radioButton3.setTypeface(font);
            this.f29628b.m34729F3();
            if (i11 == i13) {
                C43852m.m96591c("B6FuturesCandle", "ContractInfo", null, null, 12, null);
            }
        }
    }

    /* JADX INFO: renamed from: A3 */
    public static final Unit m34725A3(KuMexMarketFuturesInfoFragment kuMexMarketFuturesInfoFragment, Boolean bool) {
        Iterator<WebViewContainerFragment> it = kuMexMarketFuturesInfoFragment.f29626b0.iterator();
        while (it.hasNext()) {
            it.next().m36337l3();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public static final WebViewContainerFragment m34727D3(KuMexMarketFuturesInfoFragment kuMexMarketFuturesInfoFragment) {
        WebViewContainerFragment.Companion companion = WebViewContainerFragment.f30576W;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(C45875l0.f103336a.m101343k0(), Arrays.copyOf(new Object[]{kuMexMarketFuturesInfoFragment.m34742y3()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return companion.newInstance(str);
    }

    /* JADX INFO: renamed from: G3 */
    public static final WebViewContainerFragment m34730G3(KuMexMarketFuturesInfoFragment kuMexMarketFuturesInfoFragment) {
        WebViewContainerFragment.Companion companion = WebViewContainerFragment.f30576W;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(C45875l0.f103336a.m101354v0(), Arrays.copyOf(new Object[]{kuMexMarketFuturesInfoFragment.m34742y3()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return companion.newInstance(str);
    }

    /* JADX INFO: renamed from: s3 */
    public static final WebViewContainerFragment m34740s3(KuMexMarketFuturesInfoFragment kuMexMarketFuturesInfoFragment) {
        WebViewContainerFragment.Companion companion = WebViewContainerFragment.f30576W;
        StringBuilder sb2 = new StringBuilder();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(C45875l0.f103336a.m101345m0(), Arrays.copyOf(new Object[]{kuMexMarketFuturesInfoFragment.m34742y3()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        sb2.append(str);
        sb2.append("&displayType=history&needFilter=false");
        return companion.newInstance(sb2.toString());
    }

    /* JADX INFO: renamed from: t3 */
    public static final WebViewContainerFragment m34741t3(KuMexMarketFuturesInfoFragment kuMexMarketFuturesInfoFragment) {
        WebViewContainerFragment.Companion companion = WebViewContainerFragment.f30576W;
        StringBuilder sb2 = new StringBuilder();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(C45875l0.f103336a.m101345m0(), Arrays.copyOf(new Object[]{kuMexMarketFuturesInfoFragment.m34742y3()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        sb2.append(str);
        sb2.append("&displayType=immediate&needFilter=false");
        return companion.newInstance(sb2.toString());
    }

    /* JADX INFO: renamed from: y3 */
    private final String m34742y3() {
        return (String) this.f29620V.getValue();
    }

    /* JADX INFO: renamed from: C3 */
    public final void m34743C3() {
        if (this.f29626b0.isEmpty()) {
            return;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction(...)");
        for (WebViewContainerFragment webViewContainerFragment : this.f29626b0) {
            if (!webViewContainerFragment.isAdded()) {
                fragmentTransactionBeginTransaction.add(R$id.infoContainerFl, webViewContainerFragment);
            }
            if (Intrinsics.areEqual(webViewContainerFragment, m34748z3())) {
                fragmentTransactionBeginTransaction.show(webViewContainerFragment);
            } else {
                fragmentTransactionBeginTransaction.hide(webViewContainerFragment);
            }
        }
        fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_market_futures_info, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(m34742y3()), false, 2, null);
        boolean zM84625o = contractEntityM99529O != null ? C37567b.m84625o(contractEntityM99529O) : false;
        this.f29625a0 = zM84625o;
        this.f29626b0 = !zM84625o ? CollectionsKt.listOf((Object[]) new WebViewContainerFragment[]{m34748z3(), m34747x3()}) : CollectionsKt.listOf((Object[]) new WebViewContainerFragment[]{m34748z3(), m34746w3(), m34745v3(), m34747x3()});
        m34743C3();
        m34739r3();
        Observable observableObserveOn = UserInfo.a.e().observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.market.v2.h0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexMarketFuturesInfoFragment.m34725A3(this.f29792b, (Boolean) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(new Consumer() { // from class: com.kubi.kumex.market.v2.i0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexMarketFuturesInfoFragment.m34726B3(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    /* JADX INFO: renamed from: u3 */
    public final C36850u2 m34744u3() {
        return (C36850u2) this.f29619U.getValue(this, f29618d0[0]);
    }

    /* JADX INFO: renamed from: v3 */
    public final WebViewContainerFragment m34745v3() {
        return (WebViewContainerFragment) this.f29623Y.getValue();
    }

    /* JADX INFO: renamed from: w3 */
    public final WebViewContainerFragment m34746w3() {
        return (WebViewContainerFragment) this.f29622X.getValue();
    }

    /* JADX INFO: renamed from: x3 */
    public final WebViewContainerFragment m34747x3() {
        return (WebViewContainerFragment) this.f29624Z.getValue();
    }

    /* JADX INFO: renamed from: z3 */
    public final WebViewContainerFragment m34748z3() {
        return (WebViewContainerFragment) this.f29621W.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B3 */
    public static final void m34726B3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: E3 */
    public static final String m34728E3(KuMexMarketFuturesInfoFragment kuMexMarketFuturesInfoFragment) {
        String strM56284y;
        Bundle arguments = kuMexMarketFuturesInfoFragment.getArguments();
        if (arguments != null && (strM56284y = RouteExKt.m56284y(arguments, "symbol")) != null) {
            return strM56284y;
        }
        return C46527h0.f104291a.m102677L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F3 */
    public final void m34729F3() {
        Integer numValueOf;
        WebViewContainerFragment webViewContainerFragmentM34747x3;
        RadioGroupPlus radioGroupPlus;
        C36850u2 c36850u2M34744u3 = m34744u3();
        if (c36850u2M34744u3 != null && (radioGroupPlus = c36850u2M34744u3.f81138f) != null) {
            numValueOf = Integer.valueOf(radioGroupPlus.getF44016b());
        } else {
            numValueOf = null;
        }
        int i11 = R$id.tradeRulesRb;
        if (numValueOf != null && numValueOf.intValue() == i11) {
            webViewContainerFragmentM34747x3 = m34748z3();
        } else {
            int i12 = R$id.fundingRateRbInTime;
            if (numValueOf != null && numValueOf.intValue() == i12) {
                webViewContainerFragmentM34747x3 = m34746w3();
            } else {
                int i13 = R$id.fundingRateRb;
                if (numValueOf != null && numValueOf.intValue() == i13) {
                    webViewContainerFragmentM34747x3 = m34745v3();
                } else {
                    webViewContainerFragmentM34747x3 = m34747x3();
                }
            }
        }
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction(...)");
        for (WebViewContainerFragment webViewContainerFragment : this.f29626b0) {
            if (Intrinsics.areEqual(webViewContainerFragment, webViewContainerFragmentM34747x3)) {
                fragmentTransactionBeginTransaction.show(webViewContainerFragment);
            } else {
                fragmentTransactionBeginTransaction.hide(webViewContainerFragment);
            }
        }
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    /* JADX INFO: renamed from: r3 */
    private final void m34739r3() {
        int i11;
        C36850u2 c36850u2M34744u3 = m34744u3();
        if (c36850u2M34744u3 == null) {
            return;
        }
        RadioButton radioButton = c36850u2M34744u3.f81135c;
        int i12 = 0;
        if (!this.f29625a0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        radioButton.setVisibility(i11);
        RadioButton radioButton2 = c36850u2M34744u3.f81134b;
        if (!this.f29625a0) {
            i12 = 8;
        }
        radioButton2.setVisibility(i12);
        c36850u2M34744u3.f81138f.setOnCheckedChangeListener(new C16320a(c36850u2M34744u3, this));
        c36850u2M34744u3.f81138f.m54743f(R$id.tradeRulesRb);
    }
}
