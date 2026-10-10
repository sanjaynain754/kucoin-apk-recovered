package com.kubi.assets.exchange.p075ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.ExchangeRecordEntity;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import gf.C37886j;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44848q4;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: ExchangeCoinDetailFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000*\u0001\u001f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010&\u001a\u00020$H\u0002J\b\u0010'\u001a\u00020$H\u0002J\u0010\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020*H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R#\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0010\u001a\u0004\b \u0010!¨\u0006+"}, m90084d2 = {"Lcom/kubi/assets/exchange/ui/ExchangeCoinDetailFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/KucoinFragmentGhostExchangeDetailBinding;", "getBinding", "()Lcom/kubi/assets/databinding/KucoinFragmentGhostExchangeDetailBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "assetApi", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getAssetApi", "()Lcom/kubi/assets/AssetV2Api;", "assetApi$delegate", "Lkotlin/Lazy;", "exchangeId", "", "getExchangeId", "()Ljava/lang/String;", "exchangeId$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "exchangeDetailAdapter", "com/kubi/assets/exchange/ui/ExchangeCoinDetailFragment$exchangeDetailAdapter$2$1", "getExchangeDetailAdapter", "()Lcom/kubi/assets/exchange/ui/ExchangeCoinDetailFragment$exchangeDetailAdapter$2$1;", "exchangeDetailAdapter$delegate", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", "getExchangeDetails", "getAccountName", "item", "Lcom/kubi/assets/entity/ExchangeRecordEntity;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nExchangeCoinDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExchangeCoinDetailFragment.kt\ncom/kubi/assets/exchange/ui/ExchangeCoinDetailFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,119:1\n147#2,16:120\n*S KotlinDebug\n*F\n+ 1 ExchangeCoinDetailFragment.kt\ncom/kubi/assets/exchange/ui/ExchangeCoinDetailFragment\n*L\n35#1:120,16\n*E\n"})
public final class ExchangeCoinDetailFragment extends BaseFragment {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f17259Y = {Reflection.property1(new PropertyReference1Impl(ExchangeCoinDetailFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/KucoinFragmentGhostExchangeDetailBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f17260U = C45681e.m100799e(this, new Function1<ExchangeCoinDetailFragment, C44848q4>() { // from class: com.kubi.assets.exchange.ui.ExchangeCoinDetailFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44848q4 invoke(@NotNull ExchangeCoinDetailFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44848q4.m99221a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44848q4, Unit>() { // from class: com.kubi.assets.exchange.ui.ExchangeCoinDetailFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44848q4 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44848q4 c44848q4) {
            invoke(c44848q4);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f17261V = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.exchange.ui.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ExchangeCoinDetailFragment.m16420r3();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f17262W = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.exchange.ui.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ExchangeCoinDetailFragment.m16422t3(this.f17304b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f17263X = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.exchange.ui.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ExchangeCoinDetailFragment.m16421s3(this.f17305b);
        }
    });

    /* JADX INFO: renamed from: y3 */
    public final void m16429y3() {
        Observable<BaseEntity<ArrayList<ExchangeRecordEntity>>> observableM17120b1;
        BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        Bundle arguments = getArguments();
        if (Intrinsics.areEqual(arguments != null ? RouteExKt.m56284y(arguments, "page") : null, "LEVER")) {
            observableM17120b1 = m16423v3().m17114Z0(C27041f.m66668h(m16425D3()));
        } else {
            Bundle arguments2 = getArguments();
            observableM17120b1 = Intrinsics.areEqual(arguments2 != null ? RouteExKt.m56284y(arguments2, "page") : null, "MAIN") ? m16423v3().m17120b1(C27041f.m66668h(m16425D3()), "MAIN") : AssetV2Api.m17066n(m16423v3(), C27041f.m66668h(m16425D3()), null, 2, null);
        }
        Observable<R> observableCompose = observableM17120b1.compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.assets.exchange.ui.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ExchangeCoinDetailFragment.m16424z3(this.f17306b, (ArrayList) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.assets.exchange.ui.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ExchangeCoinDetailFragment.m16409A3(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.assets.exchange.ui.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ExchangeCoinDetailFragment.m16410B3(this.f17308b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.assets.exchange.ui.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ExchangeCoinDetailFragment.m16411C3(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.kubi.assets.exchange.ui.ExchangeCoinDetailFragment$exchangeDetailAdapter$2$1] */
    /* JADX INFO: renamed from: s3 */
    public static final ExchangeCoinDetailFragment$exchangeDetailAdapter$2$1 m16421s3(final ExchangeCoinDetailFragment exchangeCoinDetailFragment) {
        final int i11 = R$layout.view_item_exchange_detail;
        return new BaseQuickAdapter<ExchangeRecordEntity, BaseViewHolder>(i11) { // from class: com.kubi.assets.exchange.ui.ExchangeCoinDetailFragment$exchangeDetailAdapter$2$1
            @Override // io.chad.library.adapter.base.BaseQuickAdapter
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void convert(BaseViewHolder helper, ExchangeRecordEntity item) {
                Intrinsics.checkNotNullParameter(helper, "helper");
                Intrinsics.checkNotNullParameter(item, "item");
                CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(item.getCurrency()));
                C24277v.m58542g((ImageView) helper.getView(R$id.iv_icon), C27041f.m66668h(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null));
                BaseViewHolder text = helper.setText(R$id.tv_coin_name, C27041f.m66668h(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null)).setText(R$id.tv_coin_full_name, C27041f.m66668h(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getName() : null));
                int i12 = R$id.tv_convert_amount;
                BigDecimal sourceAmount = item.getSourceAmount();
                BaseViewHolder text2 = text.setText(i12, C27041f.m66668h(sourceAmount != null ? C37886j.m85578b(sourceAmount, item.getCurrency(), null, false, false, false, 0, null, 0, 254, null) : null));
                int i13 = R$id.tv_convert_amount_kcs;
                BigDecimal realExchangeAmount = item.getRealExchangeAmount();
                BaseViewHolder text3 = text2.setText(i13, C27041f.m66668h(realExchangeAmount != null ? C37886j.m85578b(realExchangeAmount, "KCS", null, false, false, false, 0, null, 0, 254, null) : null));
                int i14 = R$id.tv_fee;
                BigDecimal fee = item.getFee();
                BaseViewHolder text4 = text3.setText(i14, C27041f.m66668h(fee != null ? C37886j.m85578b(fee, "KCS", null, false, false, false, 0, null, 0, 254, null) : null));
                int i15 = R$id.tv_account;
                text4.setText(i15, this.f17264i.m16426u3(item)).setGone(R$id.tv_account_name, !TextUtils.isEmpty(item.getPositionType())).setGone(i15, !TextUtils.isEmpty(item.getPositionType()));
            }
        };
    }

    /* JADX INFO: renamed from: v3 */
    private final AssetV2Api m16423v3() {
        return (AssetV2Api) this.f17261V.getValue();
    }

    /* JADX INFO: renamed from: D3 */
    public final String m16425D3() {
        return (String) this.f17262W.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.kucoin_fragment_ghost_exchange_detail, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        m16429y3();
    }

    /* JADX INFO: renamed from: w3 */
    public final C44848q4 m16427w3() {
        return (C44848q4) this.f17260U.getValue(this, f17259Y[0]);
    }

    /* JADX INFO: renamed from: x3 */
    public final ExchangeCoinDetailFragment$exchangeDetailAdapter$2$1 m16428x3() {
        return (ExchangeCoinDetailFragment$exchangeDetailAdapter$2$1) this.f17263X.getValue();
    }

    /* JADX INFO: renamed from: A3 */
    public static final void m16409A3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m16410B3(ExchangeCoinDetailFragment exchangeCoinDetailFragment, Throwable th2) {
        exchangeCoinDetailFragment.showContentView();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C3 */
    public static final void m16411C3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void initView() {
        RecyclerView recyclerView;
        C44848q4 c44848q4M16427w3 = m16427w3();
        if (c44848q4M16427w3 != null && (recyclerView = c44848q4M16427w3.f100695b) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            m16428x3().bindToRecyclerView(recyclerView);
            m16428x3().setEmptyView(R$layout.view_empty, recyclerView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r3 */
    public static final AssetV2Api m16420r3() {
        return (AssetV2Api) C42597a.m93386b().create(AssetV2Api.class);
    }

    /* JADX INFO: renamed from: t3 */
    public static final String m16422t3(ExchangeCoinDetailFragment exchangeCoinDetailFragment) {
        Bundle arguments = exchangeCoinDetailFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m16424z3(ExchangeCoinDetailFragment exchangeCoinDetailFragment, ArrayList arrayList) {
        exchangeCoinDetailFragment.showContentView();
        exchangeCoinDetailFragment.m16428x3().replaceData(arrayList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u3 */
    public final String m16426u3(ExchangeRecordEntity exchangeRecordEntity) {
        String showSymbol;
        String positionType = exchangeRecordEntity.getPositionType();
        String str = "";
        if (Intrinsics.areEqual(positionType, SharedPositionInfo.MARGIN_MODE_ISOLATED)) {
            SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(C27041f.m66668h(exchangeRecordEntity.getPositionTag()));
            if (symbolInfoEntityM85601B != null) {
                showSymbol = symbolInfoEntityM85601B.getShowSymbol();
            } else {
                showSymbol = null;
            }
            if (showSymbol != null) {
                str = showSymbol;
            }
            return getString(R$string.margin_isolated_title) + ' ' + str;
        }
        if (!Intrinsics.areEqual(positionType, "MARGIN")) {
            return "";
        }
        String string = getString(R$string.margin_cross_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}
