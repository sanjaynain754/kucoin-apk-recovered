package com.kubi.assets.options.detail;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.R$id;
import com.kubi.assets.R$string;
import com.kubi.assets.detail.AccountDetailHeaderView;
import com.kubi.assets.detail.BaseAccountDetailFragment;
import com.kubi.assets.detail.FullCoinBean;
import com.kubi.assets.entity.AccountDetailEntity;
import com.kubi.assets.entity.AssetResponse;
import com.kubi.assets.entity.SymbolResponse;
import com.kubi.assets.filter.ParcelizePair;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37885i;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42179a;
import p637ta.C44828n5;
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

/* JADX INFO: compiled from: AssetOptionsDetailFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J$\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0014J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0014J\u001a\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0016J\b\u0010\u001e\u001a\u00020\u0014H\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0002J\u0014\u0010 \u001a\u00020\u00142\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"H\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006#"}, m90084d2 = {"Lcom/kubi/assets/options/detail/AssetOptionsDetailFragment;", "Lcom/kubi/assets/detail/BaseAccountDetailFragment;", "Lcom/kubi/assets/entity/AccountDetailEntity;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/LayoutBaseAccountDetailBinding;", "getBinding", "()Lcom/kubi/assets/databinding/LayoutBaseAccountDetailBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getAccountType", "", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "", "pageSize", "bindDataToView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "lazyLoad", "fetchCodeSymbols", "fetchOptionOverview", "initHeaderInfo", "balance", "Lcom/kubi/assets/entity/AssetResponse;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetOptionsDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetOptionsDetailFragment.kt\ncom/kubi/assets/options/detail/AssetOptionsDetailFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,186:1\n147#2,16:187\n774#3:203\n865#3,2:204\n1869#3,2:206\n*S KotlinDebug\n*F\n+ 1 AssetOptionsDetailFragment.kt\ncom/kubi/assets/options/detail/AssetOptionsDetailFragment\n*L\n47#1:187,16\n59#1:203\n59#1:204,2\n59#1:206,2\n*E\n"})
public final class AssetOptionsDetailFragment extends BaseAccountDetailFragment<AccountDetailEntity> {

    /* JADX INFO: renamed from: i0 */
    public static final /* synthetic */ KProperty<Object>[] f18144i0 = {Reflection.property1(new PropertyReference1Impl(AssetOptionsDetailFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/LayoutBaseAccountDetailBinding;", 0))};

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final InterfaceC24293a f18145h0 = C45681e.m100799e(this, new Function1<AssetOptionsDetailFragment, C44828n5>() { // from class: com.kubi.assets.options.detail.AssetOptionsDetailFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44828n5 invoke(@NotNull AssetOptionsDetailFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44828n5.m99182a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44828n5, Unit>() { // from class: com.kubi.assets.options.detail.AssetOptionsDetailFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44828n5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44828n5 c44828n5) {
            invoke(c44828n5);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: U4 */
    public static final Unit m18132U4(AssetOptionsDetailFragment assetOptionsDetailFragment, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            SymbolResponse symbolResponse = (SymbolResponse) next;
            TradeItemBean tradeItemBean = new TradeItemBean();
            tradeItemBean.setShowSymbol(C42828b.m93905f(symbolResponse.getCurrency(), "Options", true, true));
            tradeItemBean.setLastDealPrice(C27039d.m66647g(symbolResponse.getIndexPrice()));
            tradeItemBean.setSymbol(symbolResponse.getCurrency());
            arrayList2.add(tradeItemBean);
        }
        assetOptionsDetailFragment.m15908H4(arrayList2, false, new Consumer() { // from class: com.kubi.assets.options.detail.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AssetOptionsDetailFragment.m18133V4((TradeItemBean) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V4 */
    public static final void m18133V4(TradeItemBean tradeItemBean) {
        Router router = Router.f46192a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("krn/router?component=kucoin_options_rn&biz=options&entry=main&route=");
        sb2.append(Uri.encode("HomePage?currency=" + tradeItemBean.getSymbol()));
        router.m56184f(sb2.toString()).m4048k();
    }

    /* JADX INFO: renamed from: Z4 */
    public static final Unit m18135Z4() {
        AssetsHelper.m19139N(AssetsHelper.f18684a, null, "OPTION", null, 5, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g4 */
    private final C44828n5 m18136g4() {
        return (C44828n5) this.f18145h0.getValue(this, f18144i0[0]);
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
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
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.assets.options.detail.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetOptionsDetailFragment.m18130S4(item, this);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: Y4 */
    public final void m18139Y4(AssetResponse assetResponse) {
        BigDecimal holdAmount;
        BigDecimal holdAmount2;
        BigDecimal availableAmount;
        BigDecimal availableAmount2;
        AccountDetailHeaderView accountDetailHeaderView;
        BigDecimal totalAmount;
        BigDecimal totalAmount2;
        C44828n5 c44828n5M18136g4;
        AccountDetailHeaderView accountDetailHeaderView2;
        if (assetResponse != null && (c44828n5M18136g4 = m18136g4()) != null && (accountDetailHeaderView2 = c44828n5M18136g4.f100515e) != null) {
            accountDetailHeaderView2.m15861a(new FullCoinBean(C27041f.m66668h(assetResponse.getIconUrl()), C27041f.m66669i(assetResponse.getCurrencyName(), "--"), C27041f.m66669i(assetResponse.getCurrencyFullName(), "--")));
        }
        C44828n5 c44828n5M18136g5 = m18136g4();
        String strM89950x = null;
        if (c44828n5M18136g5 != null && (accountDetailHeaderView = c44828n5M18136g5.f100515e) != null) {
            accountDetailHeaderView.m15863c(C27041f.m66669i((assetResponse == null || (totalAmount2 = assetResponse.getTotalAmount()) == null) ? null : C37885i.m85563b(totalAmount2, assetResponse.getCurrency(), 0, 2, null), "--"), C27041f.m66669i((assetResponse == null || (totalAmount = assetResponse.getTotalAmount()) == null) ? null : C41014a.m89950x(C41014a.m89940n(totalAmount, assetResponse.getCurrency()), null, null, 0, false, false, false, false, 127, null), "--"));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BaseAccountDetailFragment.AssetHeaderInfo(getString(R$string.useful), C27041f.m66669i((assetResponse == null || (availableAmount2 = assetResponse.getAvailableAmount()) == null) ? null : C37885i.m85563b(availableAmount2, assetResponse.getCurrency(), 0, 2, null), "--"), C27041f.m66669i((assetResponse == null || (availableAmount = assetResponse.getAvailableAmount()) == null) ? null : C41014a.m89950x(C41014a.m89940n(availableAmount, assetResponse.getCurrency()), null, null, 0, false, false, false, false, 127, null), "--"), false, null, null, null, null, 248, null));
        String string = getString(R$string.lock);
        String strM66669i = C27041f.m66669i((assetResponse == null || (holdAmount2 = assetResponse.getHoldAmount()) == null) ? null : C37885i.m85563b(holdAmount2, assetResponse.getCurrency(), 0, 2, null), "--");
        if (assetResponse != null && (holdAmount = assetResponse.getHoldAmount()) != null) {
            strM89950x = C41014a.m89950x(C41014a.m89940n(holdAmount, assetResponse.getCurrency()), null, null, 0, false, false, false, false, 127, null);
        }
        arrayList.add(new BaseAccountDetailFragment.AssetHeaderInfo(string, strM66669i, C27041f.m66669i(strM89950x, "--"), false, null, null, null, null, 248, null));
        m15904C4(arrayList);
    }

    @Override // com.kubi.assets.detail.BaseAccountDetailFragment
    @NotNull
    /* JADX INFO: renamed from: c4 */
    public String mo15911c4() {
        return "OPTION";
    }

    @Override // com.kubi.assets.detail.BaseAccountDetailFragment, com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws Exception {
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        KcPrimaryButton kcPrimaryButton3;
        KcPrimaryButton kcPrimaryButton4;
        KcPrimaryButton kcPrimaryButton5;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C44828n5 c44828n5M18136g4 = m18136g4();
        if (c44828n5M18136g4 != null && (kcPrimaryButton5 = c44828n5M18136g4.f100524n) != null) {
            kcPrimaryButton5.setText(getString(R$string.transfer));
        }
        C44828n5 c44828n5M18136g5 = m18136g4();
        if (c44828n5M18136g5 != null && (kcPrimaryButton4 = c44828n5M18136g5.f100524n) != null) {
            kcPrimaryButton4.setVisibility(0);
        }
        C44828n5 c44828n5M18136g6 = m18136g4();
        if (c44828n5M18136g6 != null && (kcPrimaryButton3 = c44828n5M18136g6.f100524n) != null) {
            C27046k.m66711z(kcPrimaryButton3, 0L, new Function0() { // from class: com.kubi.assets.options.detail.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetOptionsDetailFragment.m18135Z4();
                }
            }, 1, null);
        }
        C44828n5 c44828n5M18136g7 = m18136g4();
        if (c44828n5M18136g7 != null && (kcPrimaryButton2 = c44828n5M18136g7.f100523m) != null) {
            kcPrimaryButton2.setVisibility(8);
        }
        C44828n5 c44828n5M18136g8 = m18136g4();
        if (c44828n5M18136g8 == null || (kcPrimaryButton = c44828n5M18136g8.f100526p) == null) {
            return;
        }
        kcPrimaryButton.setVisibility(8);
    }

    /* JADX INFO: renamed from: S4 */
    public static final Unit m18130S4(AccountDetailEntity accountDetailEntity, AssetOptionsDetailFragment assetOptionsDetailFragment) {
        String currency;
        CoinInfoEntity coinInfoEntityM15914h4 = assetOptionsDetailFragment.m15914h4();
        String code = null;
        if (coinInfoEntityM15914h4 != null) {
            currency = coinInfoEntityM15914h4.getCurrency();
        } else {
            currency = null;
        }
        CoinInfoEntity coinInfoEntityM15914h5 = assetOptionsDetailFragment.m15914h4();
        if (coinInfoEntityM15914h5 != null) {
            code = coinInfoEntityM15914h5.getCode();
        }
        AccountDetailEntity coinName = accountDetailEntity.setCoinName(currency, code);
        AssetsHelper assetsHelper = AssetsHelper.f18684a;
        Context context = assetOptionsDetailFragment.getContext();
        Intrinsics.checkNotNull(coinName);
        assetsHelper.m19168l(context, coinName);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T4 */
    private final void m18131T4() {
        Observable observableCompose = AssetV2Api.m17051E1(m15912d4(), null, 1, null).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.assets.options.detail.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetOptionsDetailFragment.m18132U4(this.f18146b, (ArrayList) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(new Consumer() { // from class: com.kubi.assets.options.detail.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AssetOptionsDetailFragment.m18134W4(function1, obj);
            }
        }, new C24223c1(this));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    /* JADX INFO: renamed from: W4 */
    public static final void m18134W4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: X4 */
    public final void m18138X4() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new AssetOptionsDetailFragment$fetchOptionOverview$1(this, null));
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void lazyLoad() {
        AssetResponse assetResponse;
        super.lazyLoad();
        m18131T4();
        Bundle arguments = getArguments();
        if (arguments != null) {
            assetResponse = (AssetResponse) RouteExKt.m56274t(arguments, "assetResponse");
        } else {
            assetResponse = null;
        }
        if (assetResponse == null) {
            m18138X4();
        } else {
            m18139Y4(assetResponse);
        }
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
        Observable observableCompose = m15912d4().m17135h0("OPTION", m15916j4()).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }
}
