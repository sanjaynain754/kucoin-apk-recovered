package com.kubi.assets.spot.detail;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetApiRemoteConfig;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.R$id;
import com.kubi.assets.R$string;
import com.kubi.assets.detail.AccountDetailHeaderView;
import com.kubi.assets.detail.BaseAccountDetailFragment;
import com.kubi.assets.entity.AccountDetailEntity;
import com.kubi.assets.entity.AssetSingleCurrencyBalance;
import com.kubi.assets.filter.ParcelizePair;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.assets.service.AssetsService;
import com.kubi.data.coin.TransferJumper;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.EtfCoinEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.margin.api.IMarginService;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.api.ISpotService;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
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
import nf.C42827a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p311hf.C38184b;
import p311hf.C38185c;
import p402kf.C41014a;
import p402kf.C41016c;
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
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: SpotAccountDetailFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0016J$\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0002H\u0014J\u001a\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010,\u001a\u00020\u001dH\u0016J\b\u0010-\u001a\u00020\u001dH\u0002J\b\u0010.\u001a\u00020\u001dH\u0016J\b\u0010/\u001a\u00020\u001dH\u0016J\u0016\u00100\u001a\u00020\u001d2\f\u00101\u001a\b\u0012\u0004\u0012\u0002020'H\u0002J\u0010\u00103\u001a\u00020\u001d2\u0006\u0010 \u001a\u000202H\u0002J\u0014\u00104\u001a\u00020\u001d2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0013H\u0002J\u0012\u00106\u001a\u00020\u001d2\b\u00105\u001a\u0004\u0018\u00010\u0013H\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR#\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0011\u001a\u0004\b)\u0010*¨\u00068"}, m90084d2 = {"Lcom/kubi/assets/spot/detail/SpotAccountDetailFragment;", "Lcom/kubi/assets/detail/BaseAccountDetailFragment;", "Lcom/kubi/assets/entity/AccountDetailEntity;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/LayoutBaseAccountDetailBinding;", "getBinding", "()Lcom/kubi/assets/databinding/LayoutBaseAccountDetailBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "coinJson", "Lorg/json/JSONObject;", "kotlin.jvm.PlatformType", "getCoinJson", "()Lorg/json/JSONObject;", "coinJson$delegate", "Lkotlin/Lazy;", "mCoinBalance", "Lcom/kubi/assets/entity/AssetSingleCurrencyBalance;", "getAccountType", "", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "", "pageSize", "bindDataToView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "supportSymbols", "", "Lcom/kubi/data/entity/SymbolInfoEntity;", "getSupportSymbols", "()Ljava/util/List;", "supportSymbols$delegate", "lazyLoad", "fetchCodeSymbols", "onFilterClick", "onViewMoreClick", "setTradeListData", "list", "Lcom/kubi/data/entity/TradeItemBean;", "toCoinTradeTab", "initHeaderInfo", "balance", "openEditAvgCost", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotAccountDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotAccountDetailFragment.kt\ncom/kubi/assets/spot/detail/SpotAccountDetailFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,328:1\n147#2,16:329\n774#3:345\n865#3,2:346\n1869#3,2:348\n1563#3:350\n1634#3,2:351\n1636#3:354\n1068#3:355\n1617#3,9:356\n1869#3:365\n1870#3:367\n1626#3:368\n774#3:369\n865#3,2:370\n1#4:353\n1#4:366\n*S KotlinDebug\n*F\n+ 1 SpotAccountDetailFragment.kt\ncom/kubi/assets/spot/detail/SpotAccountDetailFragment\n*L\n61#1:329,16\n84#1:345\n84#1:346,2\n84#1:348,2\n170#1:350\n170#1:351,2\n170#1:354\n240#1:355\n182#1:356,9\n182#1:365\n182#1:367\n182#1:368\n185#1:369\n185#1:370,2\n182#1:366\n*E\n"})
public final class SpotAccountDetailFragment extends BaseAccountDetailFragment<AccountDetailEntity> {

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final InterfaceC24293a f18839h0 = C45681e.m100799e(this, new Function1<SpotAccountDetailFragment, C44828n5>() { // from class: com.kubi.assets.spot.detail.SpotAccountDetailFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44828n5 invoke(@NotNull SpotAccountDetailFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44828n5.m99182a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44828n5, Unit>() { // from class: com.kubi.assets.spot.detail.SpotAccountDetailFragment$special$$inlined$viewBindingFragment$1
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
    public final Lazy f18840i0;

    /* JADX INFO: renamed from: j0 */
    @Nullable
    public AssetSingleCurrencyBalance f18841j0;

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public final Lazy f18842k0;

    /* JADX INFO: renamed from: m0 */
    public static final /* synthetic */ KProperty<Object>[] f18838m0 = {Reflection.property1(new PropertyReference1Impl(SpotAccountDetailFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/LayoutBaseAccountDetailBinding;", 0))};

    /* JADX INFO: renamed from: l0 */
    @NotNull
    public static final Companion f18837l0 = new Companion(null);

    /* JADX INFO: compiled from: SpotAccountDetailFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/spot/detail/SpotAccountDetailFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.spot.detail.SpotAccountDetailFragment$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 SpotAccountDetailFragment.kt\ncom/kubi/assets/spot/detail/SpotAccountDetailFragment\n*L\n1#1,328:1\n240#2:329\n*E\n"})
    public static final class C11042a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Double.valueOf(C27039d.m66646f(((TradeItemBean) t12).getChangeRate())), Double.valueOf(C27039d.m66646f(((TradeItemBean) t11).getChangeRate())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D5 */
    public static final Unit m19490D5(Throwable th2) {
        C44128b.m97263g("SpotAccountDetailFragment", th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J5 */
    public static final Unit m19496J5(Throwable th2) {
        C44128b.m97263g("SpotAccountDetailFragment", th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M5 */
    public static final Unit m19501M5(SpotAccountDetailFragment spotAccountDetailFragment) {
        IMarginService iMarginServiceM19183d = AssetsDepend.f18689a.m19183d();
        Context contextRequireContext = spotAccountDetailFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        CoinInfoEntity coinInfoEntityM15914h4 = spotAccountDetailFragment.m15914h4();
        iMarginServiceM19183d.mo37958s(contextRequireContext, coinInfoEntityM15914h4 != null ? coinInfoEntityM15914h4.getCode() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N5 */
    public static final Unit m19503N5(SpotAccountDetailFragment spotAccountDetailFragment) {
        IMarginService iMarginServiceM19183d = AssetsDepend.f18689a.m19183d();
        Context contextRequireContext = spotAccountDetailFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        CoinInfoEntity coinInfoEntityM15914h4 = spotAccountDetailFragment.m15914h4();
        iMarginServiceM19183d.mo37959s0(contextRequireContext, coinInfoEntityM15914h4 != null ? coinInfoEntityM15914h4.getCode() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g4 */
    private final C44828n5 m19527g4() {
        return (C44828n5) this.f18839h0.getValue(this, f18838m0[0]);
    }

    /* JADX INFO: renamed from: o5 */
    public static final JSONObject m19535o5(SpotAccountDetailFragment spotAccountDetailFragment) {
        JSONObject jSONObject = new JSONObject();
        CoinInfoEntity coinInfoEntityM15914h4 = spotAccountDetailFragment.m15914h4();
        String code = coinInfoEntityM15914h4 != null ? coinInfoEntityM15914h4.getCode() : null;
        if (code == null) {
            code = "";
        }
        return jSONObject.put("coin", code);
    }

    /* JADX INFO: renamed from: q5 */
    public static final CharSequence m19537q5(SymbolInfoEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String code = it.getCode();
        Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
        return code;
    }

    /* JADX INFO: renamed from: t5 */
    private final JSONObject m19540t5() {
        return (JSONObject) this.f18840i0.getValue();
    }

    /* JADX INFO: renamed from: u5 */
    private final List<SymbolInfoEntity> m19541u5() {
        return (List) this.f18842k0.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX INFO: renamed from: v5 */
    private final void m19542v5(final AssetSingleCurrencyBalance assetSingleCurrencyBalance) throws JSONException {
        final boolean z11;
        BigDecimal holdBalance;
        BigDecimal holdBalance2;
        BigDecimal availableBalance;
        BigDecimal availableBalance2;
        AccountDetailHeaderView accountDetailHeaderView;
        BigDecimal totalBalance;
        BigDecimal totalBalance2;
        this.f18841j0 = assetSingleCurrencyBalance;
        C44828n5 c44828n5M19527g4 = m19527g4();
        if (c44828n5M19527g4 != null && (accountDetailHeaderView = c44828n5M19527g4.f100515e) != null) {
            accountDetailHeaderView.m15863c(C27041f.m66669i((assetSingleCurrencyBalance == null || (totalBalance2 = assetSingleCurrencyBalance.getTotalBalance()) == null) ? null : C37885i.m85563b(totalBalance2, assetSingleCurrencyBalance.getCurrency(), 0, 2, null), "--"), C27041f.m66669i((assetSingleCurrencyBalance == null || (totalBalance = assetSingleCurrencyBalance.getTotalBalance()) == null) ? null : C38185c.m86150b(new BigDecimal(String.valueOf(C41014a.m89940n(totalBalance, assetSingleCurrencyBalance.getCurrency()))), true), "--"));
        }
        if (AssetApiRemoteConfig.f17838a.m17475d()) {
            z11 = C42827a.f94887a.m93899a(assetSingleCurrencyBalance != null ? assetSingleCurrencyBalance.getCurrency() : null) ? false : true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BaseAccountDetailFragment.AssetHeaderInfo(getString(R$string.useful), C27041f.m66669i((assetSingleCurrencyBalance == null || (availableBalance2 = assetSingleCurrencyBalance.getAvailableBalance()) == null) ? null : C37885i.m85563b(availableBalance2, assetSingleCurrencyBalance.getCurrency(), 0, 2, null), "--"), C27041f.m66669i((assetSingleCurrencyBalance == null || (availableBalance = assetSingleCurrencyBalance.getAvailableBalance()) == null) ? null : C41014a.m89950x(C41014a.m89940n(availableBalance, assetSingleCurrencyBalance.getCurrency()), null, null, 0, false, false, false, false, 127, null), "--"), false, null, null, null, null, 248, null));
        arrayList.add(new BaseAccountDetailFragment.AssetHeaderInfo(getString(R$string.lock), C27041f.m66669i((assetSingleCurrencyBalance == null || (holdBalance2 = assetSingleCurrencyBalance.getHoldBalance()) == null) ? null : C37885i.m85563b(holdBalance2, assetSingleCurrencyBalance.getCurrency(), 0, 2, null), "--"), C27041f.m66669i((assetSingleCurrencyBalance == null || (holdBalance = assetSingleCurrencyBalance.getHoldBalance()) == null) ? null : C41014a.m89950x(C41014a.m89940n(holdBalance, assetSingleCurrencyBalance.getCurrency()), null, null, 0, false, false, false, false, 127, null), "--"), true, null, null, null, null, 240, null));
        if (!Intrinsics.areEqual(assetSingleCurrencyBalance != null ? assetSingleCurrencyBalance.getCostStr() : null, "--")) {
            JSONObject jSONObject = new JSONObject();
            CoinInfoEntity coinInfoEntityM15914h4 = m15914h4();
            jSONObject.put("coin", coinInfoEntityM15914h4 != null ? coinInfoEntityM15914h4.getCurrency() : null);
            Unit unit = Unit.INSTANCE;
            C43852m.m96593e("B1tradeAccountDetail", "coin", "avgPrice", jSONObject);
        }
        arrayList.add(new BaseAccountDetailFragment.AssetHeaderInfo(getString(R$string.kc_cost_price_key), assetSingleCurrencyBalance != null ? assetSingleCurrencyBalance.getCostStr() : null, null, false, null, null, new Function0() { // from class: com.kubi.assets.spot.detail.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotAccountDetailFragment.m19544x5(this.f18852b, z11, assetSingleCurrencyBalance);
            }
        }, z11 ? new Function0() { // from class: com.kubi.assets.spot.detail.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotAccountDetailFragment.m19546z5(this.f18856b, assetSingleCurrencyBalance);
            }
        } : null, 60, null));
        m15904C4(arrayList);
    }

    /* JADX INFO: renamed from: w5 */
    public static /* synthetic */ void m19543w5(SpotAccountDetailFragment spotAccountDetailFragment, AssetSingleCurrencyBalance assetSingleCurrencyBalance, int i11, Object obj) throws JSONException {
        if ((i11 & 1) != 0) {
            assetSingleCurrencyBalance = null;
        }
        spotAccountDetailFragment.m19542v5(assetSingleCurrencyBalance);
    }

    /* JADX INFO: renamed from: x5 */
    public static final Unit m19544x5(final SpotAccountDetailFragment spotAccountDetailFragment, boolean z11, final AssetSingleCurrencyBalance assetSingleCurrencyBalance) {
        AssetsService assetsService = new AssetsService();
        FragmentManager childFragmentManager = spotAccountDetailFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        assetsService.mo15340e(childFragmentManager, z11, IUnifyAccountService.f53155a.get().mo64983G(), new Function0() { // from class: com.kubi.assets.spot.detail.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotAccountDetailFragment.m19545y5(this.f18861b, assetSingleCurrencyBalance);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P5 */
    public final void m19547P5(AssetSingleCurrencyBalance assetSingleCurrencyBalance) {
        String code;
        AssetsService assetsService = new AssetsService();
        if (assetSingleCurrencyBalance == null || (code = assetSingleCurrencyBalance.getCurrency()) == null) {
            CoinInfoEntity coinInfoEntityM15914h4 = m15914h4();
            code = coinInfoEntityM15914h4 != null ? coinInfoEntityM15914h4.getCode() : null;
            if (code == null) {
                code = "";
            }
        }
        assetsService.mo15352r(this, code, assetSingleCurrencyBalance != null ? assetSingleCurrencyBalance.getCostUsdt() : null, new Function0() { // from class: com.kubi.assets.spot.detail.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotAccountDetailFragment.m19508Q5(this.f18866b);
            }
        }, "B1tradeAccountDetail", "spotFundsEditAvgCost");
    }

    /* JADX INFO: renamed from: R5 */
    public final void m19548R5(List<? extends TradeItemBean> list) {
        BaseAccountDetailFragment.m15869I4(this, CollectionsKt.sortedWith(list, new C11042a()), false, new Consumer() { // from class: com.kubi.assets.spot.detail.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SpotAccountDetailFragment.m19511S5(this.f18860b, (TradeItemBean) obj);
            }
        }, 2, null);
    }

    @Override // com.kubi.assets.detail.BaseAccountDetailFragment
    @NotNull
    /* JADX INFO: renamed from: c4 */
    public String mo15911c4() {
        return "TRADE";
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: m5, reason: merged with bridge method [inline-methods] */
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
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.assets.spot.detail.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotAccountDetailFragment.m19534n5(this.f18858b, item);
            }
        }, 1, null);
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
        C44828n5 c44828n5M19527g4 = m19527g4();
        if (c44828n5M19527g4 != null && (kcPrimaryButton7 = c44828n5M19527g4.f100524n) != null) {
            ViewExtKt.m66577h(kcPrimaryButton7);
        }
        C44828n5 c44828n5M19527g5 = m19527g4();
        if (c44828n5M19527g5 != null && (kcPrimaryButton6 = c44828n5M19527g5.f100523m) != null) {
            ViewExtKt.m66577h(kcPrimaryButton6);
        }
        C44828n5 c44828n5M19527g6 = m19527g4();
        if (c44828n5M19527g6 != null && (kcPrimaryButton5 = c44828n5M19527g6.f100526p) != null) {
            C27046k.m66711z(kcPrimaryButton5, 0L, new Function0() { // from class: com.kubi.assets.spot.detail.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SpotAccountDetailFragment.m19499L5(this.f18843b);
                }
            }, 1, null);
        }
        CoinInfoEntity coinInfoEntityM15914h4 = m15914h4();
        if (C27025c.m66566d(coinInfoEntityM15914h4 != null ? Boolean.valueOf(coinInfoEntityM15914h4.isEtfCoin()) : null) && C24129b.m58030b(SiteVisibleConfigKey.ETF)) {
            C44828n5 c44828n5M19527g7 = m19527g4();
            if (c44828n5M19527g7 != null && (kcPrimaryButton4 = c44828n5M19527g7.f100524n) != null) {
                kcPrimaryButton4.setText(getString(R$string.etf_buy));
            }
            C44828n5 c44828n5M19527g8 = m19527g4();
            if (c44828n5M19527g8 != null && (kcPrimaryButton3 = c44828n5M19527g8.f100524n) != null) {
                C27046k.m66711z(kcPrimaryButton3, 0L, new Function0() { // from class: com.kubi.assets.spot.detail.l
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SpotAccountDetailFragment.m19501M5(this.f18855b);
                    }
                }, 1, null);
            }
            C44828n5 c44828n5M19527g9 = m19527g4();
            if (c44828n5M19527g9 != null && (kcPrimaryButton2 = c44828n5M19527g9.f100523m) != null) {
                kcPrimaryButton2.setText(getString(R$string.etf_sell));
            }
            C44828n5 c44828n5M19527g10 = m19527g4();
            if (c44828n5M19527g10 != null && (kcPrimaryButton = c44828n5M19527g10.f100523m) != null) {
                C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.assets.spot.detail.t
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SpotAccountDetailFragment.m19503N5(this.f18867b);
                    }
                }, 1, null);
            }
            AssetV2Api assetV2ApiM15912d4 = m15912d4();
            CoinInfoEntity coinInfoEntityM15914h5 = m15914h4();
            Observable<R> observableCompose = assetV2ApiM15912d4.m17146m(coinInfoEntityM15914h5 != null ? coinInfoEntityM15914h5.getCode() : null).compose(C24217a1.m58389m());
            final Function1 function1 = new Function1() { // from class: com.kubi.assets.spot.detail.u
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SpotAccountDetailFragment.m19505O5(this.f18868b, (EtfCoinEntity) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.assets.spot.detail.v
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SpotAccountDetailFragment.m19489C5(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.assets.spot.detail.w
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SpotAccountDetailFragment.m19490D5((Throwable) obj);
                }
            };
            Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.assets.spot.detail.x
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SpotAccountDetailFragment.m19491E5(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        } else {
            C24129b.m58033e(SiteVisibleConfigKey.Convert, new Function0() { // from class: com.kubi.assets.spot.detail.y
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SpotAccountDetailFragment.m19492F5(this.f18871b);
                }
            });
        }
        m19543w5(this, null, 1, null);
        if (!m19541u5().isEmpty()) {
            List<SymbolInfoEntity> listM19541u5 = m19541u5();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM19541u5, 10));
            Iterator<T> it = listM19541u5.iterator();
            while (it.hasNext()) {
                TradeItemBean tradeItemBean = new TradeItemBean(((SymbolInfoEntity) it.next()).getSymbol());
                tradeItemBean.empty = true;
                arrayList.add(tradeItemBean);
            }
            m19548R5(arrayList);
        }
        m15918l4();
    }

    public SpotAccountDetailFragment() {
        setPageId("B1tradeAccountDetail");
        this.f18840i0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.spot.detail.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotAccountDetailFragment.m19535o5(this.f18845b);
            }
        });
        this.f18842k0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.spot.detail.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotAccountDetailFragment.m19515U5(this.f18846b);
            }
        });
    }

    /* JADX INFO: renamed from: A5 */
    public static final Unit m19487A5(SpotAccountDetailFragment spotAccountDetailFragment, AssetSingleCurrencyBalance assetSingleCurrencyBalance) throws JSONException {
        spotAccountDetailFragment.m19542v5(assetSingleCurrencyBalance);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B5 */
    public static final void m19488B5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C5 */
    public static final void m19489C5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E5 */
    public static final void m19491E5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F5 */
    public static final Unit m19492F5(final SpotAccountDetailFragment spotAccountDetailFragment) {
        String code;
        CoinInfoEntity coinInfoEntityM15914h4 = spotAccountDetailFragment.m15914h4();
        if (coinInfoEntityM15914h4 != null && (code = coinInfoEntityM15914h4.getCode()) != null) {
            Observable<R> observableCompose = spotAccountDetailFragment.m15912d4().m17126e(code).compose(C24217a1.m58389m());
            final Function1 function1 = new Function1() { // from class: com.kubi.assets.spot.detail.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SpotAccountDetailFragment.m19493G5(this.f18847b, (Boolean) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.assets.spot.detail.e
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SpotAccountDetailFragment.m19495I5(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.assets.spot.detail.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SpotAccountDetailFragment.m19496J5((Throwable) obj);
                }
            };
            Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.assets.spot.detail.g
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SpotAccountDetailFragment.m19497K5(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, spotAccountDetailFragment.getDestroyDisposable());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G5 */
    public static final Unit m19493G5(final SpotAccountDetailFragment spotAccountDetailFragment, Boolean bool) {
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        KcPrimaryButton kcPrimaryButton3;
        if (bool.booleanValue()) {
            C44828n5 c44828n5M19527g4 = spotAccountDetailFragment.m19527g4();
            if (c44828n5M19527g4 != null && (kcPrimaryButton3 = c44828n5M19527g4.f100524n) != null) {
                ViewExtKt.m66594y(kcPrimaryButton3);
            }
            C44828n5 c44828n5M19527g5 = spotAccountDetailFragment.m19527g4();
            if (c44828n5M19527g5 != null && (kcPrimaryButton2 = c44828n5M19527g5.f100524n) != null) {
                kcPrimaryButton2.setText(spotAccountDetailFragment.getString(R$string.assets_convert));
            }
            C43852m.m96593e("B1tradeAccountDetail", "convert", "1", spotAccountDetailFragment.m19540t5());
            C44828n5 c44828n5M19527g6 = spotAccountDetailFragment.m19527g4();
            if (c44828n5M19527g6 != null && (kcPrimaryButton = c44828n5M19527g6.f100524n) != null) {
                C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.assets.spot.detail.r
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SpotAccountDetailFragment.m19494H5(this.f18865b);
                    }
                }, 1, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H5 */
    public static final Unit m19494H5(SpotAccountDetailFragment spotAccountDetailFragment) {
        String code;
        C43852m.m96589a("B1tradeAccountDetail", "convert", "1", spotAccountDetailFragment.m19540t5());
        AssetsHelper assetsHelper = AssetsHelper.f18684a;
        CoinInfoEntity coinInfoEntityM15914h4 = spotAccountDetailFragment.m15914h4();
        if (coinInfoEntityM15914h4 != null) {
            code = coinInfoEntityM15914h4.getCode();
        } else {
            code = null;
        }
        if (code == null) {
            code = "";
        }
        AssetsHelper.m19136C(assetsHelper, code, C38184b.f85884a.m86146a(), false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I5 */
    public static final void m19495I5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K5 */
    public static final void m19497K5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: L5 */
    public static final Unit m19499L5(SpotAccountDetailFragment spotAccountDetailFragment) {
        String code;
        C43852m.m96589a("B1tradeAccountDetail", "transfer", "1", spotAccountDetailFragment.m19540t5());
        TransferJumper.Companion companion = TransferJumper.f21427a;
        CoinInfoEntity coinInfoEntityM15914h4 = spotAccountDetailFragment.m15914h4();
        if (coinInfoEntityM15914h4 != null) {
            code = coinInfoEntityM15914h4.getCode();
        } else {
            code = null;
        }
        TransferJumper.Companion.jumpToTransfer$default(companion, code, null, null, "TRADE", "MAIN", true, C43852m.m96602n("B1tradeAccountDetail", "transfer", null, 4, null), 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O5 */
    public static final Unit m19505O5(SpotAccountDetailFragment spotAccountDetailFragment, EtfCoinEntity etfCoinEntity) {
        C44828n5 c44828n5M19527g4;
        KcPrimaryButton kcPrimaryButton;
        C44828n5 c44828n5M19527g5;
        KcPrimaryButton kcPrimaryButton2;
        Integer numIsSubscribeEnabled = etfCoinEntity.isSubscribeEnabled();
        if (numIsSubscribeEnabled != null && numIsSubscribeEnabled.intValue() == 1 && (c44828n5M19527g5 = spotAccountDetailFragment.m19527g4()) != null && (kcPrimaryButton2 = c44828n5M19527g5.f100524n) != null) {
            ViewExtKt.m66594y(kcPrimaryButton2);
        }
        Integer numIsRedemptionEnabled = etfCoinEntity.isRedemptionEnabled();
        if (numIsRedemptionEnabled != null && numIsRedemptionEnabled.intValue() == 1 && (c44828n5M19527g4 = spotAccountDetailFragment.m19527g4()) != null && (kcPrimaryButton = c44828n5M19527g4.f100523m) != null) {
            ViewExtKt.m66594y(kcPrimaryButton);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q5 */
    public static final Unit m19508Q5(SpotAccountDetailFragment spotAccountDetailFragment) {
        spotAccountDetailFragment.lazyLoad();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S5 */
    public static final void m19511S5(final SpotAccountDetailFragment spotAccountDetailFragment, final TradeItemBean tradeItemBean) {
        BigDecimal totalBalance;
        C43852m.m96589a("B1tradeAccountDetail", "trade", "1", spotAccountDetailFragment.m19540t5());
        AssetSingleCurrencyBalance assetSingleCurrencyBalance = spotAccountDetailFragment.f18841j0;
        if (assetSingleCurrencyBalance != null) {
            totalBalance = assetSingleCurrencyBalance.getTotalBalance();
        } else {
            totalBalance = null;
        }
        if (C27039d.m66647g(totalBalance) == 0.0d) {
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54153J4(R$string.account_trade_empty).m54162S4(R$string.still_trade, new DialogInterface.OnClickListener() { // from class: com.kubi.assets.spot.detail.q
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    SpotAccountDetailFragment.m19513T5(this.f18863b, tradeItemBean, dialogInterface, i11);
                }
            }).m54159P4(R$string.cancel, null).m54172c5(spotAccountDetailFragment.getChildFragmentManager());
        } else {
            Intrinsics.checkNotNull(tradeItemBean);
            spotAccountDetailFragment.m19549V5(tradeItemBean);
        }
    }

    /* JADX INFO: renamed from: T5 */
    public static final void m19513T5(SpotAccountDetailFragment spotAccountDetailFragment, TradeItemBean tradeItemBean, DialogInterface dialogInterface, int i11) {
        Intrinsics.checkNotNull(tradeItemBean);
        spotAccountDetailFragment.m19549V5(tradeItemBean);
    }

    /* JADX INFO: renamed from: U5 */
    public static final List m19515U5(SpotAccountDetailFragment spotAccountDetailFragment) {
        String code;
        List<SymbolInfoEntity> listM85602C;
        CoinInfoEntity coinInfoEntityM15914h4 = spotAccountDetailFragment.m15914h4();
        String code2 = null;
        if (coinInfoEntityM15914h4 != null) {
            code = coinInfoEntityM15914h4.getCode();
        } else {
            code = null;
        }
        C38184b c38184b = C38184b.f85884a;
        if (Intrinsics.areEqual(code, c38184b.m86147b())) {
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{"BTC-" + c38184b.m86147b(), "ETH-" + c38184b.m86147b(), "KCS-" + c38184b.m86147b()});
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
            CoinInfoEntity coinInfoEntityM15914h5 = spotAccountDetailFragment.m15914h4();
            if (coinInfoEntityM15914h5 != null) {
                code2 = coinInfoEntityM15914h5.getCode();
            }
            listM85602C = c37890n.m85602C(code2);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM85602C) {
            if (((SymbolInfoEntity) obj).isEnableTrading()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n5 */
    public static final Unit m19534n5(SpotAccountDetailFragment spotAccountDetailFragment, AccountDetailEntity accountDetailEntity) {
        String currency;
        C43852m.m96589a("B1tradeAccountDetail", "accountDetail", "2", spotAccountDetailFragment.m19540t5());
        CoinInfoEntity coinInfoEntityM15914h4 = spotAccountDetailFragment.m15914h4();
        String code = null;
        if (coinInfoEntityM15914h4 != null) {
            currency = coinInfoEntityM15914h4.getCurrency();
        } else {
            currency = null;
        }
        CoinInfoEntity coinInfoEntityM15914h5 = spotAccountDetailFragment.m15914h4();
        if (coinInfoEntityM15914h5 != null) {
            code = coinInfoEntityM15914h5.getCode();
        }
        AccountDetailEntity coinName = accountDetailEntity.setCoinName(currency, code);
        AssetsHelper assetsHelper = AssetsHelper.f18684a;
        Context context = spotAccountDetailFragment.getContext();
        Intrinsics.checkNotNull(coinName);
        assetsHelper.m19168l(context, coinName);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p5 */
    private final void m19536p5() {
        if (!m19541u5().isEmpty()) {
            Observable<R> observableCompose = m15912d4().m17115a(CollectionsKt.joinToString$default(m19541u5(), null, null, null, 0, null, new Function1() { // from class: com.kubi.assets.spot.detail.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SpotAccountDetailFragment.m19537q5((SymbolInfoEntity) obj);
                }
            }, 31, null), "android/trade_info").compose(C24217a1.m58389m());
            final Function1 function1 = new Function1() { // from class: com.kubi.assets.spot.detail.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SpotAccountDetailFragment.m19538r5(this.f18850b, (ArrayList) obj);
                }
            };
            Disposable disposableSubscribe = observableCompose.subscribe(new Consumer() { // from class: com.kubi.assets.spot.detail.j
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SpotAccountDetailFragment.m19539s5(function1, obj);
                }
            }, new C24223c1(this));
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        }
    }

    /* JADX INFO: renamed from: r5 */
    public static final Unit m19538r5(SpotAccountDetailFragment spotAccountDetailFragment, ArrayList arrayList) {
        Intrinsics.checkNotNull(arrayList);
        spotAccountDetailFragment.m19548R5(arrayList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s5 */
    public static final void m19539s5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y5 */
    public static final Unit m19545y5(SpotAccountDetailFragment spotAccountDetailFragment, AssetSingleCurrencyBalance assetSingleCurrencyBalance) {
        spotAccountDetailFragment.m19547P5(assetSingleCurrencyBalance);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z5 */
    public static final Unit m19546z5(SpotAccountDetailFragment spotAccountDetailFragment, AssetSingleCurrencyBalance assetSingleCurrencyBalance) {
        spotAccountDetailFragment.m19547P5(assetSingleCurrencyBalance);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V5 */
    public final void m19549V5(TradeItemBean tradeItemBean) {
        if (tradeItemBean.needPullPreviewInfo()) {
            ISpotService.m59983d(AssetsDepend.f18689a.m19187h(), getContext(), tradeItemBean, null, 4, null);
            return;
        }
        ISpotService iSpotServiceM19187h = AssetsDepend.f18689a.m19187h();
        String symbol = tradeItemBean.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        ISpotService.m59984g(iSpotServiceM19187h, symbol, false, 2, null);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void lazyLoad() {
        Observable<BaseEntity<AssetSingleCurrencyBalance>> observableM17116a0;
        super.lazyLoad();
        String code = null;
        if (AssetApiRemoteConfig.f17838a.m17476e()) {
            AssetV2Api assetV2ApiM15912d4 = m15912d4();
            CoinInfoEntity coinInfoEntityM15914h4 = m15914h4();
            if (coinInfoEntityM15914h4 != null) {
                code = coinInfoEntityM15914h4.getCode();
            }
            observableM17116a0 = assetV2ApiM15912d4.m17159r("TRADE", code, "USDT", C41016c.m89965c());
        } else {
            AssetV2Api assetV2ApiM15912d5 = m15912d4();
            CoinInfoEntity coinInfoEntityM15914h5 = m15914h4();
            if (coinInfoEntityM15914h5 != null) {
                code = coinInfoEntityM15914h5.getCode();
            }
            observableM17116a0 = assetV2ApiM15912d5.m17116a0("TRADE", code, "USDT", C41016c.m89965c());
        }
        Observable<R> observableCompose = observableM17116a0.compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.assets.spot.detail.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpotAccountDetailFragment.m19487A5(this.f18872b, (AssetSingleCurrencyBalance) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(new Consumer() { // from class: com.kubi.assets.spot.detail.a0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SpotAccountDetailFragment.m19488B5(function1, obj);
            }
        }, new C24223c1(this));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        m19536p5();
    }

    @Override // com.kubi.assets.detail.BaseAccountDetailFragment
    /* JADX INFO: renamed from: q4 */
    public void mo15920q4() {
        super.mo15920q4();
        C43852m.m96589a("B1tradeAccountDetail", "accountDetail", "1", m19540t5());
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
        Observable observableCompose = m15912d4().m17166t1(m15916j4()).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }

    @Override // com.kubi.assets.detail.BaseAccountDetailFragment
    /* JADX INFO: renamed from: u4 */
    public void mo15922u4() {
        super.mo15922u4();
        C43852m.m96589a("B1tradeAccountDetail", "trade", "2", m19540t5());
    }
}
