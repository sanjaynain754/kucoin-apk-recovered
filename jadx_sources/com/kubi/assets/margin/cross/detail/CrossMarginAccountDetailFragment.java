package com.kubi.assets.margin.cross.detail;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.R$id;
import com.kubi.assets.R$string;
import com.kubi.assets.detail.AccountDetailHeaderView;
import com.kubi.assets.detail.BaseAccountDetailFragment;
import com.kubi.assets.entity.AccountDetailEntity;
import com.kubi.assets.filter.ParcelizePair;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.data.coin.TransferJumper;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.margin.api.IMarginService;
import com.kubi.margin.api.entity.FundsInfo;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37756h;
import gf.C37885i;
import gf.C37890n;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38184b;
import p429lf.C42179a;
import p569qq.C43852m;
import p637ta.C44828n5;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: CrossMarginAccountDetailFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J$\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0014J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0014J\u001a\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0016J\b\u0010%\u001a\u00020\u0014H\u0002J\u0014\u0010&\u001a\u00020\u00142\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(H\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006)"}, m90084d2 = {"Lcom/kubi/assets/margin/cross/detail/CrossMarginAccountDetailFragment;", "Lcom/kubi/assets/detail/BaseAccountDetailFragment;", "Lcom/kubi/assets/entity/AccountDetailEntity;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/LayoutBaseAccountDetailBinding;", "getBinding", "()Lcom/kubi/assets/databinding/LayoutBaseAccountDetailBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getAccountType", "", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "", "pageSize", "bindDataToView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "lazyLoad", "supportSymbols", "", "Lcom/kubi/data/entity/SymbolInfoEntity;", "getSupportSymbols", "()Ljava/util/List;", "supportSymbols$delegate", "Lkotlin/Lazy;", "fetchCodeSymbols", "initHeaderInfo", "balance", "Lcom/kubi/margin/api/entity/FundsInfo;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCrossMarginAccountDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossMarginAccountDetailFragment.kt\ncom/kubi/assets/margin/cross/detail/CrossMarginAccountDetailFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,215:1\n147#2,16:216\n774#3:232\n865#3,2:233\n1869#3,2:235\n1563#3:237\n1634#3,2:238\n1636#3:241\n1617#3,9:242\n1869#3:251\n1870#3:253\n1626#3:254\n774#3:255\n865#3,2:256\n1068#3:258\n1#4:240\n1#4:252\n*S KotlinDebug\n*F\n+ 1 CrossMarginAccountDetailFragment.kt\ncom/kubi/assets/margin/cross/detail/CrossMarginAccountDetailFragment\n*L\n46#1:216,16\n58#1:232\n58#1:233,2\n58#1:235,2\n122#1:237\n122#1:238,2\n122#1:241\n147#1:242,9\n147#1:251\n147#1:253\n147#1:254\n150#1:255\n150#1:256,2\n164#1:258\n147#1:252\n*E\n"})
public final class CrossMarginAccountDetailFragment extends BaseAccountDetailFragment<AccountDetailEntity> {

    /* JADX INFO: renamed from: j0 */
    public static final /* synthetic */ KProperty<Object>[] f18006j0 = {Reflection.property1(new PropertyReference1Impl(CrossMarginAccountDetailFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/LayoutBaseAccountDetailBinding;", 0))};

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final InterfaceC24293a f18007h0 = C45681e.m100799e(this, new Function1<CrossMarginAccountDetailFragment, C44828n5>() { // from class: com.kubi.assets.margin.cross.detail.CrossMarginAccountDetailFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44828n5 invoke(@NotNull CrossMarginAccountDetailFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44828n5.m99182a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44828n5, Unit>() { // from class: com.kubi.assets.margin.cross.detail.CrossMarginAccountDetailFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44828n5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44828n5 c44828n5) {
            invoke(c44828n5);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final Lazy f18008i0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.margin.cross.detail.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CrossMarginAccountDetailFragment.m17901n5(this.f18015b);
        }
    });

    /* JADX INFO: renamed from: com.kubi.assets.margin.cross.detail.CrossMarginAccountDetailFragment$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 CrossMarginAccountDetailFragment.kt\ncom/kubi/assets/margin/cross/detail/CrossMarginAccountDetailFragment\n*L\n1#1,328:1\n164#2:329\n*E\n"})
    public static final class C10399a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(C27039d.m66646f(((TradeItemBean) t12).getChangeRate())), Double.valueOf(C27039d.m66646f(((TradeItemBean) t11).getChangeRate())));
        }
    }

    /* JADX INFO: renamed from: a5 */
    public static final CharSequence m17889a5(SymbolInfoEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String code = it.getCode();
        Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
        return code;
    }

    /* JADX INFO: renamed from: c5 */
    public static final void m17891c5(TradeItemBean tradeItemBean) {
        C43852m.m96591c("B4crossMarginAssetsDetails", "tradeButton", "1", null, 8, null);
        IMarginService iMarginServiceM19183d = AssetsDepend.f18689a.m19183d();
        String symbol = tradeItemBean.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        IMarginService.m37900d0(iMarginServiceM19183d, symbol, false, false, null, 12, null);
    }

    /* JADX INFO: renamed from: g4 */
    private final C44828n5 m17893g4() {
        return (C44828n5) this.f18007h0.getValue(this, f18006j0[0]);
    }

    /* JADX INFO: renamed from: g5 */
    public static /* synthetic */ void m17894g5(CrossMarginAccountDetailFragment crossMarginAccountDetailFragment, FundsInfo fundsInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fundsInfo = null;
        }
        crossMarginAccountDetailFragment.m17905f5(fundsInfo);
    }

    /* JADX INFO: renamed from: j5 */
    public static final void m17897j5(TradeItemBean tradeItemBean) {
        C43852m.m96591c("B4crossMarginAssetsDetails", "tradeButton", "1", null, 8, null);
        IMarginService iMarginServiceM19183d = AssetsDepend.f18689a.m19183d();
        String symbol = tradeItemBean.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        IMarginService.m37900d0(iMarginServiceM19183d, symbol, false, false, null, 12, null);
    }

    /* JADX INFO: renamed from: k5 */
    public static final Unit m17898k5(CrossMarginAccountDetailFragment crossMarginAccountDetailFragment) {
        C43852m.m96591c("B4crossMarginAssetsDetails", "borrow", "1", null, 8, null);
        C37304a c37304a = C37304a.f82764a;
        CoinInfoEntity coinInfoEntityM15914h4 = crossMarginAccountDetailFragment.m15914h4();
        InterfaceC37756h.a.m85144b(c37304a, coinInfoEntityM15914h4 != null ? coinInfoEntityM15914h4.getCode() : null, null, "borrow", "cross", C43852m.m96601m("B4crossMarginAssetsDetails", "borrow", "1"), null, null, 98, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l5 */
    public static final Unit m17899l5(CrossMarginAccountDetailFragment crossMarginAccountDetailFragment) {
        C43852m.m96591c("B4crossMarginAssetsDetails", "repay", "1", null, 8, null);
        C37304a c37304a = C37304a.f82764a;
        CoinInfoEntity coinInfoEntityM15914h4 = crossMarginAccountDetailFragment.m15914h4();
        InterfaceC37756h.a.m85143a(c37304a, 0L, coinInfoEntityM15914h4 != null ? coinInfoEntityM15914h4.getCode() : null, null, C43852m.m96601m("B4crossMarginAssetsDetails", "repay", "1"), null, null, 52, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m5 */
    public static final Unit m17900m5(CrossMarginAccountDetailFragment crossMarginAccountDetailFragment) {
        C43852m.m96591c("B4crossMarginAssetsDetails", "transfer", "1", null, 8, null);
        TransferJumper.Companion companion = TransferJumper.f21427a;
        CoinInfoEntity coinInfoEntityM15914h4 = crossMarginAccountDetailFragment.m15914h4();
        TransferJumper.Companion.jumpToTransfer$default(companion, coinInfoEntityM15914h4 != null ? coinInfoEntityM15914h4.getCode() : null, null, null, "MAIN", "MARGIN", false, C43852m.m96601m("B4crossMarginAssetsDetails", "transfer", "1"), 38, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: X4, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@NotNull BaseViewHolder helper, @NotNull final AccountDetailEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int i11 = R$id.tv_amount;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(item.getDirectionSymbol());
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(item.getAmount()));
        CoinInfoEntity coinInfoEntityM15914h4 = m15914h4();
        sb2.append(C37885i.m85563b(bigDecimal, coinInfoEntityM15914h4 != null ? coinInfoEntityM15914h4.getCode() : null, 0, 2, null));
        helper.setText(i11, sb2.toString()).setTextColor(i11, item.getDirectionColor(this.mContext));
        helper.setText(R$id.tv_type, item.getBizTypeNameString());
        helper.setText(R$id.tv_time, C42179a.m92633f(item.getTradeDate(), null, true, true, null, 9, null));
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.assets.margin.cross.detail.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CrossMarginAccountDetailFragment.m17888Y4(item, this);
            }
        }, 1, null);
    }

    @Override // com.kubi.assets.detail.BaseAccountDetailFragment
    @NotNull
    /* JADX INFO: renamed from: c4 */
    public String mo15911c4() {
        return "MARGIN";
    }

    /* JADX INFO: renamed from: e5 */
    public final List<SymbolInfoEntity> m17904e5() {
        return (List) this.f18008i0.getValue();
    }

    /* JADX INFO: renamed from: f5 */
    public final void m17905f5(FundsInfo fundsInfo) {
        AccountDetailHeaderView accountDetailHeaderView;
        C44828n5 c44828n5M17893g4 = m17893g4();
        if (c44828n5M17893g4 != null && (accountDetailHeaderView = c44828n5M17893g4.f100515e) != null) {
            accountDetailHeaderView.m15863c(C27041f.m66669i(fundsInfo != null ? fundsInfo.getTotalBalanceStr() : null, "- -"), C27041f.m66669i(fundsInfo != null ? fundsInfo.getTotalBalancePriceStr() : null, "- -"));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BaseAccountDetailFragment.AssetHeaderInfo(getString(R$string.useful), C27041f.m66669i(fundsInfo != null ? fundsInfo.getAvailableBalanceStr() : null, "- -"), C27041f.m66669i(fundsInfo != null ? fundsInfo.getAvailableBalancePriceStr() : null, "- -"), false, null, null, null, null, 248, null));
        arrayList.add(new BaseAccountDetailFragment.AssetHeaderInfo(getString(R$string.lock), C27041f.m66669i(fundsInfo != null ? fundsInfo.getHoldBalanceStr() : null, "- -"), C27041f.m66669i(fundsInfo != null ? fundsInfo.getHoldBalancePriceStr() : null, "- -"), false, null, null, null, null, 248, null));
        arrayList.add(new BaseAccountDetailFragment.AssetHeaderInfo(getString(R$string.debt), C27041f.m66669i(fundsInfo != null ? fundsInfo.getLiabilityStr() : null, "- -"), C27041f.m66669i(fundsInfo != null ? fundsInfo.getLiabilityPriceStr() : null, "- -"), false, null, null, null, null, 248, null));
        arrayList.add(new BaseAccountDetailFragment.AssetHeaderInfo(getString(R$string.margin_net_position), C27041f.m66669i(fundsInfo != null ? fundsInfo.getNetBalanceStr() : null, "- -"), "- -", false, null, null, null, null, 248, null));
        arrayList.add(new BaseAccountDetailFragment.AssetHeaderInfo(getString(R$string.margin_max_out_transfer), C27041f.m66669i(fundsInfo != null ? fundsInfo.getMaxOutSizeStr() : null, "- -"), "- -", false, null, null, null, null, 248, null));
        m15904C4(arrayList);
    }

    @Override // com.kubi.assets.detail.BaseAccountDetailFragment, com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws Exception {
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        KcPrimaryButton kcPrimaryButton3;
        KcPrimaryButton kcPrimaryButton4;
        KcPrimaryButton kcPrimaryButton5;
        KcPrimaryButton kcPrimaryButton6;
        KcPrimaryButton kcPrimaryButton7;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C44828n5 c44828n5M17893g4 = m17893g4();
        if (c44828n5M17893g4 != null && (kcPrimaryButton7 = c44828n5M17893g4.f100524n) != null) {
            kcPrimaryButton7.setText(getString(R$string.borrow));
        }
        C44828n5 c44828n5M17893g5 = m17893g4();
        if (c44828n5M17893g5 != null && (kcPrimaryButton6 = c44828n5M17893g5.f100524n) != null) {
            CoinInfoEntity coinInfoEntityM15914h4 = m15914h4();
            kcPrimaryButton6.setVisibility(C27025c.m66566d(coinInfoEntityM15914h4 != null ? Boolean.valueOf(coinInfoEntityM15914h4.isMarginEnabled()) : null) ? 0 : 8);
        }
        C44828n5 c44828n5M17893g6 = m17893g4();
        if (c44828n5M17893g6 != null && (kcPrimaryButton5 = c44828n5M17893g6.f100524n) != null) {
            C27046k.m66711z(kcPrimaryButton5, 0L, new Function0() { // from class: com.kubi.assets.margin.cross.detail.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CrossMarginAccountDetailFragment.m17898k5(this.f18009b);
                }
            }, 1, null);
        }
        C44828n5 c44828n5M17893g7 = m17893g4();
        if (c44828n5M17893g7 != null && (kcPrimaryButton4 = c44828n5M17893g7.f100523m) != null) {
            CoinInfoEntity coinInfoEntityM15914h5 = m15914h4();
            kcPrimaryButton4.setVisibility(C27025c.m66566d(coinInfoEntityM15914h5 != null ? Boolean.valueOf(coinInfoEntityM15914h5.isMarginEnabled()) : null) ? 0 : 8);
        }
        C44828n5 c44828n5M17893g8 = m17893g4();
        if (c44828n5M17893g8 != null && (kcPrimaryButton3 = c44828n5M17893g8.f100523m) != null) {
            kcPrimaryButton3.setText(getString(R$string.repay_coin));
        }
        C44828n5 c44828n5M17893g9 = m17893g4();
        if (c44828n5M17893g9 != null && (kcPrimaryButton2 = c44828n5M17893g9.f100523m) != null) {
            C27046k.m66711z(kcPrimaryButton2, 0L, new Function0() { // from class: com.kubi.assets.margin.cross.detail.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CrossMarginAccountDetailFragment.m17899l5(this.f18011b);
                }
            }, 1, null);
        }
        C44828n5 c44828n5M17893g10 = m17893g4();
        if (c44828n5M17893g10 != null && (kcPrimaryButton = c44828n5M17893g10.f100526p) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.assets.margin.cross.detail.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CrossMarginAccountDetailFragment.m17900m5(this.f18012b);
                }
            }, 1, null);
        }
        m17894g5(this, null, 1, null);
        if (m17904e5().isEmpty()) {
            return;
        }
        List<SymbolInfoEntity> listM17904e5 = m17904e5();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM17904e5, 10));
        Iterator<T> it = listM17904e5.iterator();
        while (it.hasNext()) {
            TradeItemBean tradeItemBean = new TradeItemBean(((SymbolInfoEntity) it.next()).getSymbol());
            tradeItemBean.empty = true;
            arrayList.add(tradeItemBean);
        }
        BaseAccountDetailFragment.m15869I4(this, arrayList, false, new Consumer() { // from class: com.kubi.assets.margin.cross.detail.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CrossMarginAccountDetailFragment.m17897j5((TradeItemBean) obj);
            }
        }, 2, null);
    }

    /* JADX INFO: renamed from: Y4 */
    public static final Unit m17888Y4(AccountDetailEntity accountDetailEntity, CrossMarginAccountDetailFragment crossMarginAccountDetailFragment) {
        String currency;
        CoinInfoEntity coinInfoEntityM15914h4 = crossMarginAccountDetailFragment.m15914h4();
        String code = null;
        if (coinInfoEntityM15914h4 != null) {
            currency = coinInfoEntityM15914h4.getCurrency();
        } else {
            currency = null;
        }
        CoinInfoEntity coinInfoEntityM15914h5 = crossMarginAccountDetailFragment.m15914h4();
        if (coinInfoEntityM15914h5 != null) {
            code = coinInfoEntityM15914h5.getCode();
        }
        AccountDetailEntity coinName = accountDetailEntity.setCoinName(currency, code);
        AssetsHelper assetsHelper = AssetsHelper.f18684a;
        Context context = crossMarginAccountDetailFragment.getContext();
        Intrinsics.checkNotNull(coinName);
        assetsHelper.m19168l(context, coinName);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b5 */
    public static final Unit m17890b5(CrossMarginAccountDetailFragment crossMarginAccountDetailFragment, ArrayList arrayList) {
        Intrinsics.checkNotNull(arrayList);
        BaseAccountDetailFragment.m15869I4(crossMarginAccountDetailFragment, CollectionsKt.sortedWith(arrayList, new C10399a()), false, new Consumer() { // from class: com.kubi.assets.margin.cross.detail.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CrossMarginAccountDetailFragment.m17891c5((TradeItemBean) obj);
            }
        }, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d5 */
    public static final void m17892d5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h5 */
    public static final Unit m17895h5(CrossMarginAccountDetailFragment crossMarginAccountDetailFragment, FundsInfo fundsInfo) {
        crossMarginAccountDetailFragment.m17905f5(fundsInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i5 */
    public static final void m17896i5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n5 */
    public static final List m17901n5(CrossMarginAccountDetailFragment crossMarginAccountDetailFragment) {
        String code;
        List<SymbolInfoEntity> listM85602C;
        CoinInfoEntity coinInfoEntityM15914h4 = crossMarginAccountDetailFragment.m15914h4();
        String code2 = null;
        if (coinInfoEntityM15914h4 != null) {
            code = coinInfoEntityM15914h4.getCode();
        } else {
            code = null;
        }
        if (Intrinsics.areEqual(code, "USDT")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BTC-");
            C38184b c38184b = C38184b.f85884a;
            sb2.append(c38184b.m86147b());
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{sb2.toString(), "ETH-" + c38184b.m86147b(), "KCS-" + c38184b.m86147b()});
            listM85602C = new ArrayList<>();
            Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B((String) it.next());
                if (symbolInfoEntityM85601B != null) {
                    listM85602C.add(symbolInfoEntityM85601B);
                }
            }
        } else {
            C37890n c37890n = C37890n.f85269a;
            CoinInfoEntity coinInfoEntityM15914h5 = crossMarginAccountDetailFragment.m15914h4();
            if (coinInfoEntityM15914h5 != null) {
                code2 = coinInfoEntityM15914h5.getCode();
            }
            listM85602C = c37890n.m85602C(code2);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM85602C) {
            if (((SymbolInfoEntity) obj).isMarginEnabled()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Z4 */
    public final void m17903Z4() {
        if (!m17904e5().isEmpty()) {
            Observable<R> observableCompose = m15912d4().m17115a(CollectionsKt.joinToString$default(m17904e5(), null, null, null, 0, null, new Function1() { // from class: com.kubi.assets.margin.cross.detail.k
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CrossMarginAccountDetailFragment.m17889a5((SymbolInfoEntity) obj);
                }
            }, 31, null), "android/trade_info").compose(C24217a1.m58389m());
            final Function1 function1 = new Function1() { // from class: com.kubi.assets.margin.cross.detail.l
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CrossMarginAccountDetailFragment.m17890b5(this.f18018b, (ArrayList) obj);
                }
            };
            Disposable disposableSubscribe = observableCompose.subscribe(new Consumer() { // from class: com.kubi.assets.margin.cross.detail.b
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    CrossMarginAccountDetailFragment.m17892d5(function1, obj);
                }
            }, new C24223c1(this));
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void lazyLoad() {
        String code;
        super.lazyLoad();
        IMarginService iMarginServiceM19183d = AssetsDepend.f18689a.m19183d();
        CoinInfoEntity coinInfoEntityM15914h4 = m15914h4();
        if (coinInfoEntityM15914h4 != null) {
            code = coinInfoEntityM15914h4.getCode();
        } else {
            code = null;
        }
        if (code == null) {
            code = "";
        }
        Observable<R> observableCompose = iMarginServiceM19183d.mo37933d(code).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.assets.margin.cross.detail.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CrossMarginAccountDetailFragment.m17895h5(this.f18013b, (FundsInfo) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(new Consumer() { // from class: com.kubi.assets.margin.cross.detail.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CrossMarginAccountDetailFragment.m17896i5(function1, obj);
            }
        }, new C24223c1(this));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        m17903Z4();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @NotNull
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<AccountDetailEntity>> mo16440r3(int i11, int i12) {
        String code;
        m15916j4().clear();
        m15916j4().put("size", Integer.valueOf(i12));
        m15916j4().put("page", Integer.valueOf(i11));
        HashMap<String, Object> mapM15916j4 = m15916j4();
        CoinInfoEntity coinInfoEntityM15914h4 = m15914h4();
        if (coinInfoEntityM15914h4 != null) {
            code = coinInfoEntityM15914h4.getCode();
        } else {
            code = null;
        }
        if (code == null) {
            code = "";
        }
        mapM15916j4.put(FirebaseAnalytics.Param.CURRENCY, code);
        ArrayList<ParcelizePair> arrayListM15915i4 = m15915i4();
        ArrayList<ParcelizePair> arrayList = new ArrayList();
        for (Object obj : arrayListM15915i4) {
            if (!TextUtils.isEmpty(((ParcelizePair) obj).getValue())) {
                arrayList.add(obj);
            }
        }
        for (ParcelizePair parcelizePair : arrayList) {
            m15916j4().put(parcelizePair.getKey(), parcelizePair.getValue());
        }
        m15916j4().put("startAt", Long.valueOf(m15917k4(String.valueOf(m15916j4().get("time")))));
        m15916j4().put("endAt", getF16861b0().f54265b);
        m15916j4().remove("time");
        Observable observableCompose = m15912d4().m17135h0("MARGIN", m15916j4()).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }
}
