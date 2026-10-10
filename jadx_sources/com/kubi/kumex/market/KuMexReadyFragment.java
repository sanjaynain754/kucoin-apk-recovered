package com.kubi.kumex.market;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.material.timepicker.TimeModel;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.event.api.C12572a;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.market.p091v2.KuMexMarketInfoFragment;
import com.kubi.kumex.market.p091v2.viewModel.MarketCoinInfoUiStatus;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36727a;
import f00.C37304a;
import g00.InterfaceC37766r;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42179a;
import p429lf.C42180b;
import p729wl.C45875l0;
import p801yl.C46527h0;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import th.InterfaceC44980d;
import w00.C45681e;

/* JADX INFO: compiled from: KuMexReadyFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001%B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\b\u0010\u001e\u001a\u00020\u0018H\u0002J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\fH\u0002J\u0012\u0010!\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010\u000eH\u0003J\b\u0010#\u001a\u00020\u0018H\u0016J\b\u0010$\u001a\u00020\u0018H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, m90084d2 = {"Lcom/kubi/kumex/market/KuMexReadyFragment;", "Lcom/kubi/sdk/BaseFragment;", "Lcom/kubi/futures/trade/submit/panel/premarket/CountdownListener;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkucoinFragmentNewMexReadyBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkucoinFragmentNewMexReadyBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "symbol", "", "contractEntity", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onCreate", "", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", "initMoreButton", "initPreMarketIntroduce", "initObserver", "updateHeaderSymbolText", "curSymbol", "updateSymbolCountDown", "contract", "onTick", "onDestroyView", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKuMexReadyFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuMexReadyFragment.kt\ncom/kubi/kumex/market/KuMexReadyFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,201:1\n147#2,16:202\n*S KotlinDebug\n*F\n+ 1 KuMexReadyFragment.kt\ncom/kubi/kumex/market/KuMexReadyFragment\n*L\n52#1:202,16\n*E\n"})
public final class KuMexReadyFragment extends BaseFragment implements com.kubi.futures.trade.submit.panel.premarket.h {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f29398U = C45681e.m100799e(this, new Function1<KuMexReadyFragment, C36727a>() { // from class: com.kubi.kumex.market.KuMexReadyFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36727a invoke(@NotNull KuMexReadyFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36727a.m82303a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36727a, Unit>() { // from class: com.kubi.kumex.market.KuMexReadyFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36727a it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36727a c36727a) {
            invoke(c36727a);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    public String f29399V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public ContractEntity f29400W;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f29397Y = {Reflection.property1(new PropertyReference1Impl(KuMexReadyFragment.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkucoinFragmentNewMexReadyBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f29396X = new Companion(null);

    /* JADX INFO: compiled from: KuMexReadyFragment.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/kumex/market/KuMexReadyFragment$Companion;", "", "<init>", "()V", "TO_COIN_INFO_TAB", "", "HIDE_SHARE_FAV", "REFRESH_MEX_MARKET_INFO_FRAGMENT", "newInstance", "Lcom/kubi/kumex/market/KuMexReadyFragment;", "symbol", "contractEntity", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final KuMexReadyFragment newInstance(@NotNull String symbol, @Nullable ContractEntity contractEntity) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            KuMexReadyFragment kuMexReadyFragment = new KuMexReadyFragment();
            Bundle bundle = new Bundle();
            bundle.putString("symbol", symbol);
            bundle.putParcelable("data", contractEntity);
            kuMexReadyFragment.setArguments(bundle);
            return kuMexReadyFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.market.KuMexReadyFragment$a */
    /* JADX INFO: compiled from: KuMexReadyFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16189a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f29401b;

        public C16189a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f29401b = function;
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
            return this.f29401b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f29401b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: v3 */
    public static final Unit m34313v3() {
        C12572a.m23695d("to_coin_info_tab", null, 0L, 6, null);
        return Unit.INSTANCE;
    }

    @SuppressLint({"SetTextI18n", "DefaultLocale"})
    /* JADX INFO: renamed from: G3 */
    private final void m34302G3(ContractEntity contractEntity) {
        BaseTextView baseTextView;
        if (contractEntity == null) {
            return;
        }
        String strM92647l = C42180b.m92647l(C42179a.m92633f(contractEntity.getFirstOpenDate(), null, false, false, null, 15, null));
        int rawOffset = ((TimeZone.getDefault().getRawOffset() / 1000) / 60) / 60;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(rawOffset >= 0 ? "+" : "");
        sb2.append(rawOffset);
        String string = sb2.toString();
        C36727a c36727aM34319t3 = m34319t3();
        if (c36727aM34319t3 != null && (baseTextView = c36727aM34319t3.f79667t) != null) {
            baseTextView.setText(getString(R$string.kumex_pre_market_open_time, strM92647l, "UTC" + string));
        }
        com.kubi.futures.trade.submit.panel.premarket.o.a.g("KuMexReadyFragment", this);
    }

    private final void initView() {
        String str = this.f29399V;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbol");
            str = null;
        }
        m34317E3(str);
        ContractEntity contractEntity = this.f29400W;
        if (contractEntity != null && contractEntity.getSpotCurrency() != null) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KuMexReadyFragment$initView$1$1(this, null), 3, null);
        }
        m34320u3();
        m34321y3();
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            parentFragment.getParentFragment();
        }
        C12572a.m23695d("hide_share_fav", null, 0L, 6, null);
        Flowable<ContractEntity> flowableObserveOn = C46527h0.f104291a.m102687W().observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.market.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexReadyFragment.m34297A3(this.f29439b, (ContractEntity) obj);
            }
        };
        Consumer<? super ContractEntity> consumer = new Consumer() { // from class: com.kubi.kumex.market.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexReadyFragment.m34298B3(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.kumex.market.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KuMexReadyFragment.m34299C3((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = flowableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.market.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KuMexReadyFragment.m34300D3(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        m34302G3(this.f29400W);
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m34316z3() {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, C45875l0.f103336a.m101353u0(), null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E3 */
    public final void m34317E3(final String str) {
        runOnUiThread(new Function0() { // from class: com.kubi.kumex.market.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuMexReadyFragment.m34301F3(this.f29446b, str);
            }
        });
    }

    /* JADX INFO: renamed from: R1 */
    public void m34318R1() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        long jP = com.kubi.futures.trade.submit.panel.premarket.g.a.p(this.f29400W);
        if (jP < 0) {
            return;
        }
        if (jP <= 0) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94121c(), null, new KuMexReadyFragment$onTick$1(this, null), 2, null);
            return;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long days = timeUnit.toDays(jP);
        long hours = timeUnit.toHours(jP) % ((long) 24);
        long j11 = 60;
        long minutes = timeUnit.toMinutes(jP) % j11;
        long j12 = jP % j11;
        C36727a c36727aM34319t3 = m34319t3();
        if (c36727aM34319t3 != null && (baseTextView4 = c36727aM34319t3.f79664q) != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(days)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            baseTextView4.setText(str);
        }
        C36727a c36727aM34319t4 = m34319t3();
        if (c36727aM34319t4 != null && (baseTextView3 = c36727aM34319t4.f79665r) != null) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format(Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(hours)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            baseTextView3.setText(str2);
        }
        C36727a c36727aM34319t5 = m34319t3();
        if (c36727aM34319t5 != null && (baseTextView2 = c36727aM34319t5.f79666s) != null) {
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String str3 = String.format(Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(minutes)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            baseTextView2.setText(str3);
        }
        C36727a c36727aM34319t6 = m34319t3();
        if (c36727aM34319t6 == null || (baseTextView = c36727aM34319t6.f79668u) == null) {
            return;
        }
        StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
        String str4 = String.format(Locale.ENGLISH, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j12)}, 1));
        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
        baseTextView.setText(str4);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkucoin_fragment_new_mex_ready, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    /* JADX INFO: renamed from: t3 */
    public final C36727a m34319t3() {
        return (C36727a) this.f29398U.getValue(this, f29397Y[0]);
    }

    /* JADX INFO: renamed from: A3 */
    public static final Unit m34297A3(KuMexReadyFragment kuMexReadyFragment, ContractEntity contractEntity) {
        kuMexReadyFragment.m34302G3(contractEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B3 */
    public static final void m34298B3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m34299C3(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public static final void m34300D3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F3 */
    public static final Unit m34301F3(KuMexReadyFragment kuMexReadyFragment, String str) {
        C36727a c36727aM34319t3 = kuMexReadyFragment.m34319t3();
        if (c36727aM34319t3 == null) {
            return Unit.INSTANCE;
        }
        BaseTextView baseTextView = c36727aM34319t3.f79669v;
        C27096v0 c27096v0M24441f = null;
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), str, false, 2, null);
        if (contractEntityM99529O != null) {
            c27096v0M24441f = FuturesDisplayNameUtils.f22525a.m24441f(contractEntityM99529O, false);
        }
        baseTextView.setText(C27041f.m66667g(c27096v0M24441f, str));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w3 */
    private final void m34314w3() {
        Fragment parentFragment;
        Fragment parentFragment2 = getParentFragment();
        if (parentFragment2 != null) {
            parentFragment = parentFragment2.getParentFragment();
        } else {
            parentFragment = null;
        }
        if (parentFragment instanceof KuMexMarketInfoFragment) {
            ((KuMexMarketInfoFragment) parentFragment).m34880x4().m35119n().observe(getViewLifecycleOwner(), new C16189a(new Function1() { // from class: com.kubi.kumex.market.q
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KuMexReadyFragment.m34315x3(this.f29451b, (MarketCoinInfoUiStatus) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m34315x3(KuMexReadyFragment kuMexReadyFragment, MarketCoinInfoUiStatus marketCoinInfoUiStatus) {
        C36727a c36727aM34319t3;
        KcPrimaryButton kcPrimaryButton;
        String symbol = marketCoinInfoUiStatus.getSymbol();
        String str = kuMexReadyFragment.f29399V;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("symbol");
            str = null;
        }
        if (Intrinsics.areEqual(symbol, str) && !marketCoinInfoUiStatus.getHasCoinInfo() && (c36727aM34319t3 = kuMexReadyFragment.m34319t3()) != null && (kcPrimaryButton = c36727aM34319t3.f79650c) != null) {
            ViewExtKt.m66577h(kcPrimaryButton);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        ContractEntity contractEntity;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String strM56284y = RouteExKt.m56284y(arguments, "symbol");
            if (strM56284y == null) {
                strM56284y = C46527h0.f104291a.m102677L();
            }
            this.f29399V = strM56284y;
            if (Build.VERSION.SDK_INT >= 33) {
                contractEntity = (ContractEntity) arguments.getParcelable("data", ContractEntity.class);
            } else {
                contractEntity = (ContractEntity) arguments.getParcelable("data");
            }
            this.f29400W = contractEntity;
        }
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        com.kubi.futures.trade.submit.panel.premarket.o.a.j("KuMexReadyFragment");
    }

    /* JADX INFO: renamed from: u3 */
    public final void m34320u3() {
        KcPrimaryButton kcPrimaryButton;
        C36727a c36727aM34319t3 = m34319t3();
        if (c36727aM34319t3 != null && (kcPrimaryButton = c36727aM34319t3.f79650c) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.kumex.market.p
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuMexReadyFragment.m34313v3();
                }
            }, 1, null);
        }
        m34314w3();
    }

    /* JADX INFO: renamed from: y3 */
    public final void m34321y3() {
        AppCompatTextView appCompatTextView;
        C36727a c36727aM34319t3 = m34319t3();
        if (c36727aM34319t3 != null && (appCompatTextView = c36727aM34319t3.f79649b) != null) {
            appCompatTextView.getPaint().setFlags(8);
            appCompatTextView.getPaint().setAntiAlias(true);
            C27046k.m66711z(appCompatTextView, 0L, new Function0() { // from class: com.kubi.kumex.market.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KuMexReadyFragment.m34316z3();
                }
            }, 1, null);
        }
    }
}
