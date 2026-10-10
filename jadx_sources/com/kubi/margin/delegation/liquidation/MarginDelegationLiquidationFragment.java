package com.kubi.margin.delegation.liquidation;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.C5275i0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.margin.R$color;
import com.kubi.margin.R$drawable;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.margin.delegation.MarginDelegationFragment;
import com.kubi.margin.delegation.borrowing.MarginDelegationFilterViewExt;
import com.kubi.margin.entity.AssetEntity;
import com.kubi.margin.entity.DelegationLiquidationEntity;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.StrictDividerItemDecoration;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.resources.widget.drop.DropMenuView;
import com.kubi.resources.widget.drop.FilterType;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27017c;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import gf.C37886j;
import gf.C37890n;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mp.C42579a;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p181cp.AbstractC36514a;
import p206dp.C36927n;
import p206dp.C36928n0;
import p429lf.C42179a;
import p429lf.C42180b;
import p698vp.C45617g;
import p768xo.InterfaceC46307h;
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
import p852kotlin.reflect.KProperty;
import rs.AbstractC44173c;
import rs.C44172b;
import w00.C45681e;

/* JADX INFO: compiled from: MarginDelegationLiquidationFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010-\u001a\u00020 H\u0014J\b\u0010.\u001a\u00020\"H\u0014J\b\u0010/\u001a\u00020\"H\u0014J\b\u00100\u001a\u00020 H\u0016J\b\u00101\u001a\u00020 H\u0016J\b\u00102\u001a\u000203H\u0016J\u0018\u00104\u001a\u0002032\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0002H\u0014J\u0018\u00108\u001a\u0002032\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0002H\u0002J\u0018\u00109\u001a\u0002032\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0002H\u0002J\u0018\u0010:\u001a\u0002032\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0002H\u0002J\u0018\u0010;\u001a\u0002032\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0002H\u0002J\u0018\u0010<\u001a\u0002032\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0002H\u0002J\u0018\u0010=\u001a\u0002032\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0002H\u0002J\u0018\u0010>\u001a\u0002032\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0002H\u0002J\u0018\u0010?\u001a\u0002032\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0002H\u0002J\u0018\u0010@\u001a\u0002032\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0002H\u0002J\u0018\u0010A\u001a\u0002032\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0002H\u0002J\u0012\u0010B\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010C\u001a\u00020\u000e2\b\u0010D\u001a\u0004\u0018\u00010\u000eH\u0002J&\u0010E\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020G\u0018\u00010F2\u0006\u0010H\u001a\u00020\"2\u0006\u0010I\u001a\u00020\"H\u0014J\u0010\u0010L\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\u000eH\u0002J\u001a\u0010R\u001a\u0002032\u0006\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010VH\u0016J\b\u0010W\u001a\u000203H\u0016J\u0006\u0010X\u001a\u000203J\u000e\u0010Y\u001a\u0002032\u0006\u0010Z\u001a\u00020\u0019J\u000e\u0010[\u001a\u0002032\u0006\u0010\\\u001a\u00020]J\b\u0010^\u001a\u000203H\u0016J\b\u0010_\u001a\u000203H\u0016J\b\u0010`\u001a\u00020\"H\u0014R#\u0010\u0005\u001a\u0004\u0018\u00010\u00068FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\tR*\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020\"8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b#\u0010$R#\u0010'\u001a\n )*\u0004\u0018\u00010(0(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b*\u0010+R\u000e\u0010J\u001a\u00020KX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010N\u001a\u00020O¢\u0006\b\n\u0000\u001a\u0004\bP\u0010Q¨\u0006b"}, m90084d2 = {"Lcom/kubi/margin/delegation/liquidation/MarginDelegationLiquidationFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/margin/entity/DelegationLiquidationEntity;", "<init>", "()V", "binding", "Lcom/kubi/margin/databinding/BmarginFragmentDelegationLiquidationBinding;", "getBinding$annotations", "getBinding", "()Lcom/kubi/margin/databinding/BmarginFragmentDelegationLiquidationBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "hashMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "symbol", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "coin", "getCoin", "setCoin", "bizType", "Lcom/kubi/margin/constant/LiquidationBizType;", "getBizType", "()Lcom/kubi/margin/constant/LiquidationBizType;", "setBizType", "(Lcom/kubi/margin/constant/LiquidationBizType;)V", "timeType", "isFilter", "", "tradeType", "", "getTradeType", "()I", "tradeType$delegate", "Lkotlin/Lazy;", "mTradeApi", "Lcom/kubi/margin/api/MarketApi;", "kotlin.jvm.PlatformType", "getMTradeApi", "()Lcom/kubi/margin/api/MarketApi;", "mTradeApi$delegate", "needDefaultBackground", "getLayout", "getItemLayout", "canLoad", "needAutoLoad", "onLoad", "", "bindDataToView", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "bindTimeValue", "bindTradePair", "bindDebtRateValue", "bindDebtsValue", "bindAssetValue", "bindTotalValue", "bindExchangedValue", "bindDefaultDebtsValue", "bindTotalConsumedValue", "bindForcedValue", "getSymbolName", "getCurrencyName", FirebaseAnalytics.Param.CURRENCY, "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "beforeGet", "Lcom/kubi/utils/TimeUtils$BeforeGet;", "getStart", "value", "filterView", "Lcom/kubi/margin/delegation/borrowing/MarginDelegationFilterViewExt;", "getFilterView", "()Lcom/kubi/margin/delegation/borrowing/MarginDelegationFilterViewExt;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "refreshData", "updateSymbol", "updateBizType", "type", "setFilterData", "time", "Lcom/kubi/resources/widget/drop/FilterType$IFilter;", "showContent", "showEmpty", "getEndFooterText", "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginDelegationLiquidationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginDelegationLiquidationFragment.kt\ncom/kubi/margin/delegation/liquidation/MarginDelegationLiquidationFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,563:1\n147#2,16:564\n*S KotlinDebug\n*F\n+ 1 MarginDelegationLiquidationFragment.kt\ncom/kubi/margin/delegation/liquidation/MarginDelegationLiquidationFragment\n*L\n54#1:564,16\n*E\n"})
public final class MarginDelegationLiquidationFragment extends BasePagingFragment<DelegationLiquidationEntity> {

    /* JADX INFO: renamed from: f0 */
    public boolean f32953f0;

    /* JADX INFO: renamed from: l0 */
    public static final /* synthetic */ KProperty<Object>[] f32946l0 = {Reflection.property1(new PropertyReference1Impl(MarginDelegationLiquidationFragment.class, "binding", "getBinding()Lcom/kubi/margin/databinding/BmarginFragmentDelegationLiquidationBinding;", 0))};

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public static final Companion f32945k0 = new Companion(null);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC24293a f32947Z = C45681e.m100799e(this, new Function1<MarginDelegationLiquidationFragment, C36927n>() { // from class: com.kubi.margin.delegation.liquidation.MarginDelegationLiquidationFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36927n invoke(@NotNull MarginDelegationLiquidationFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36927n.m82722a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36927n, Unit>() { // from class: com.kubi.margin.delegation.liquidation.MarginDelegationLiquidationFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36927n it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36927n c36927n) {
            invoke(c36927n);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final HashMap<String, String> f32948a0 = new HashMap<>();

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public String f32949b0 = "";

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public String f32950c0 = "";

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public AbstractC36514a f32951d0 = AbstractC36514a.a.f79342c;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public String f32952e0 = "THREE_MONTH";

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final Lazy f32954g0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.delegation.liquidation.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(MarginDelegationLiquidationFragment.m38250y4(this.f32962b));
        }
    });

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final Lazy f32955h0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.delegation.liquidation.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginDelegationLiquidationFragment.m38245s4();
        }
    });

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public TimeUtils.C27004b f32956i0 = new TimeUtils.C27004b();

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public final MarginDelegationFilterViewExt f32957j0 = new MarginDelegationFilterViewExt();

    /* JADX INFO: compiled from: MarginDelegationLiquidationFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/margin/delegation/liquidation/MarginDelegationLiquidationFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/margin/delegation/liquidation/MarginDelegationLiquidationFragment;", "tradeType", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MarginDelegationLiquidationFragment newInstance(int tradeType) {
            MarginDelegationLiquidationFragment marginDelegationLiquidationFragment = new MarginDelegationLiquidationFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("tradeType", tradeType);
            marginDelegationLiquidationFragment.setArguments(bundle);
            return marginDelegationLiquidationFragment;
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: B3 */
    public boolean mo21464B3() {
        return false;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: C3 */
    public boolean mo15903C3() {
        return false;
    }

    /* JADX INFO: renamed from: e4 */
    public static final void m38236e4(MarginDelegationLiquidationFragment marginDelegationLiquidationFragment, DelegationLiquidationEntity delegationLiquidationEntity, View view) {
        C45617g c45617g = C45617g.f102739a;
        String string = marginDelegationLiquidationFragment.getString(R$string.lever_liquidation_foced, marginDelegationLiquidationFragment.m38239m4(delegationLiquidationEntity.getBalanceCurrency()));
        String string2 = marginDelegationLiquidationFragment.getString(R$string.lever_liquidation_foced_detail);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        C45617g.m100710c(c45617g, marginDelegationLiquidationFragment, string, string2, null, null, null, null, null, 124, null);
    }

    /* JADX INFO: renamed from: m4 */
    private final String m38239m4(String str) {
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(str));
        return C27041f.m66668h(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null);
    }

    /* JADX INFO: renamed from: n4 */
    public static final ObservableSource m38240n4(MarginDelegationLiquidationFragment marginDelegationLiquidationFragment, BasePageEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        for (DelegationLiquidationEntity delegationLiquidationEntity : entity.getItems()) {
            for (AssetEntity assetEntity : delegationLiquidationEntity.getAssets()) {
                CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(assetEntity.getCurrency()));
                if (coinInfoEntityM85613u != null) {
                    assetEntity.setCurrencyName(coinInfoEntityM85613u.getCurrency());
                    assetEntity.setCurrencyIcon(coinInfoEntityM85613u.getIconUrl());
                    assetEntity.setBalanceCurrency(delegationLiquidationEntity.getBalanceCurrency());
                    assetEntity.setBalanceCurrencyName(marginDelegationLiquidationFragment.m38239m4(delegationLiquidationEntity.getBalanceCurrency()));
                }
            }
            for (AssetEntity assetEntity2 : delegationLiquidationEntity.getDebts()) {
                CoinInfoEntity coinInfoEntityM85613u2 = C37890n.f85269a.m85613u(C27041f.m66668h(assetEntity2.getCurrency()));
                if (coinInfoEntityM85613u2 != null) {
                    assetEntity2.setCurrencyName(coinInfoEntityM85613u2.getCurrency());
                    assetEntity2.setCurrencyIcon(coinInfoEntityM85613u2.getIconUrl());
                    assetEntity2.setBalanceCurrency(delegationLiquidationEntity.getBalanceCurrency());
                    assetEntity2.setBalanceCurrencyName(marginDelegationLiquidationFragment.m38239m4(delegationLiquidationEntity.getBalanceCurrency()));
                }
            }
            List<AssetEntity> liquidationConsumedList = delegationLiquidationEntity.getLiquidationConsumedList();
            if (liquidationConsumedList == null) {
                liquidationConsumedList = CollectionsKt.emptyList();
            }
            for (AssetEntity assetEntity3 : liquidationConsumedList) {
                CoinInfoEntity coinInfoEntityM85613u3 = C37890n.f85269a.m85613u(C27041f.m66668h(assetEntity3.getCurrency()));
                if (coinInfoEntityM85613u3 != null) {
                    assetEntity3.setCurrencyName(coinInfoEntityM85613u3.getCurrency());
                    assetEntity3.setCurrencyIcon(coinInfoEntityM85613u3.getIconUrl());
                    assetEntity3.setBalanceCurrency(delegationLiquidationEntity.getBalanceCurrency());
                    assetEntity3.setBalanceCurrencyName(marginDelegationLiquidationFragment.m38239m4(delegationLiquidationEntity.getBalanceCurrency()));
                }
            }
        }
        return Observable.just(entity);
    }

    /* JADX INFO: renamed from: o4 */
    public static final ObservableSource m38241o4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (ObservableSource) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: p4 */
    private final InterfaceC46307h m38242p4() {
        return (InterfaceC46307h) this.f32955h0.getValue();
    }

    /* JADX INFO: renamed from: r4 */
    private final String m38244r4(String str) {
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(str);
        return C27041f.m66668h(symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getShowSymbol() : null);
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m38246t4(MarginDelegationLiquidationFragment marginDelegationLiquidationFragment, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        marginDelegationLiquidationFragment.m38264x4((FilterType.InterfaceC23033b) it.get(0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m38247u4(C36927n c36927n) {
        DropMenuView dropMenuView = c36927n.f81844f;
        if (dropMenuView != null) {
            dropMenuView.m55148k();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w4 */
    public static final Unit m38249w4(MarginDelegationLiquidationFragment marginDelegationLiquidationFragment, AbstractC36514a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        marginDelegationLiquidationFragment.m38265z4(type);
        marginDelegationLiquidationFragment.mo15906F3();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: F3 */
    public void mo15906F3() {
        this.f32956i0 = new TimeUtils.C27004b();
        super.mo15906F3();
    }

    /* JADX INFO: renamed from: V3 */
    public final void m38252V3(BaseViewHolder baseViewHolder, DelegationLiquidationEntity delegationLiquidationEntity) {
        if (Intrinsics.areEqual(this.f32951d0, AbstractC36514a.b.f79343c)) {
            m38257b4(baseViewHolder, delegationLiquidationEntity);
        } else {
            m38261i4(baseViewHolder, delegationLiquidationEntity);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: W3, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@NotNull BaseViewHolder helper, @NotNull DelegationLiquidationEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        m38259f4(helper, item);
        m38262k4(helper, item);
        m38254X3(helper, item);
        m38255Y3(helper, item);
        m38252V3(helper, item);
        m38258d4(helper, item);
    }

    /* JADX INFO: renamed from: X3 */
    public final void m38254X3(BaseViewHolder baseViewHolder, DelegationLiquidationEntity delegationLiquidationEntity) {
        if (Intrinsics.areEqual(this.f32951d0, AbstractC36514a.b.f79343c)) {
            baseViewHolder.setGone(R$id.tv_lever_debt_rate, false);
            baseViewHolder.setGone(R$id.tv_lever_debt_rate_value, false);
            return;
        }
        baseViewHolder.setVisible(R$id.tv_lever_debt_rate, true);
        int i11 = R$id.tv_lever_debt_rate_value;
        baseViewHolder.setVisible(i11, true);
        BigDecimal liabilityRate = delegationLiquidationEntity.getLiabilityRate();
        baseViewHolder.setText(i11, C42180b.m92649n(liabilityRate != null ? C42180b.m92642g(liabilityRate, null, null, 0, false, false, false, 63, null) : null));
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m38255Y3(BaseViewHolder baseViewHolder, DelegationLiquidationEntity delegationLiquidationEntity) {
        if (Intrinsics.areEqual(this.f32951d0, AbstractC36514a.b.f79343c)) {
            m38260g4(baseViewHolder, delegationLiquidationEntity);
        } else {
            m38256Z3(baseViewHolder, delegationLiquidationEntity);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m38256Z3(BaseViewHolder baseViewHolder, final DelegationLiquidationEntity delegationLiquidationEntity) {
        int i11 = R$string.lever_liquidation_debts;
        String string = getString(i11, m38239m4(delegationLiquidationEntity.getBalanceCurrency()));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        final String string2 = getString(i11, m38239m4(delegationLiquidationEntity.getBalanceCurrency()));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        BigDecimal liability = delegationLiquidationEntity.getLiability();
        String strM66669i = C27041f.m66669i(liability != null ? C37886j.m85578b(liability, delegationLiquidationEntity.getBalanceCurrency(), null, false, false, false, 0, null, 0, 254, null) : null, "--");
        int i12 = R$id.tv_lever_liquidation_debts;
        BaseViewHolder text = baseViewHolder.setText(i12, string);
        int i13 = R$id.tv_lever_liquidation_debts_value;
        View view = text.setText(i13, strM66669i).getView(i13);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C44172b.m97383c((TextView) view, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        DashTextView dashTextView = (DashTextView) baseViewHolder.getView(i12);
        boolean z11 = !delegationLiquidationEntity.getDebts().isEmpty();
        dashTextView.setClickable(z11);
        dashTextView.setNeedDash(z11);
        dashTextView.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.margin.delegation.liquidation.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MarginDelegationLiquidationFragment.m38234a4(delegationLiquidationEntity, string2, this, view2);
            }
        });
    }

    /* JADX INFO: renamed from: b4 */
    public final void m38257b4(BaseViewHolder baseViewHolder, final DelegationLiquidationEntity delegationLiquidationEntity) {
        int i11 = R$id.tv_lever_liquidation_total;
        BaseViewHolder text = baseViewHolder.setText(i11, getString(R$string.interest_liquidation_total_exchanged_stub, m38239m4(delegationLiquidationEntity.getBalanceCurrency())));
        int i12 = R$id.tv_lever_liquidation_total_value;
        BigDecimal liability = delegationLiquidationEntity.getLiability();
        text.setText(i12, C27041f.m66669i(liability != null ? C37886j.m85578b(liability, delegationLiquidationEntity.getBalanceCurrency(), null, false, false, false, 0, null, 0, 254, null) : null, "--"));
        DashTextView dashTextView = (DashTextView) baseViewHolder.getView(i11);
        boolean z11 = !delegationLiquidationEntity.getDebts().isEmpty();
        dashTextView.setClickable(z11);
        dashTextView.setNeedDash(z11);
        dashTextView.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.margin.delegation.liquidation.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MarginDelegationLiquidationFragment.m38235c4(delegationLiquidationEntity, this, view);
            }
        });
    }

    /* JADX INFO: renamed from: d4 */
    public final void m38258d4(BaseViewHolder baseViewHolder, final DelegationLiquidationEntity delegationLiquidationEntity) {
        if (!Intrinsics.areEqual(this.f32951d0, AbstractC36514a.a.f79342c)) {
            baseViewHolder.setGone(R$id.tv_lever_liquidation_foced, false);
            baseViewHolder.setGone(R$id.tv_lever_liquidation_foced_value, false);
            return;
        }
        int i11 = R$id.tv_lever_liquidation_foced;
        baseViewHolder.setVisible(i11, true);
        int i12 = R$id.tv_lever_liquidation_foced_value;
        baseViewHolder.setVisible(i12, true);
        View view = baseViewHolder.getView(i12);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C44172b.m97383c((TextView) view, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        BaseViewHolder text = baseViewHolder.setText(i11, getString(R$string.lever_liquidation_foced, m38239m4(delegationLiquidationEntity.getBalanceCurrency())));
        BigDecimal returnAsset = delegationLiquidationEntity.getReturnAsset();
        text.setText(i12, C27041f.m66669i(returnAsset != null ? C37886j.m85578b(returnAsset, delegationLiquidationEntity.getBalanceCurrency(), null, false, false, false, 0, null, 0, 254, null) : null, "--"));
        ((DashTextView) baseViewHolder.getView(i11)).setOnClickListener(new View.OnClickListener() { // from class: com.kubi.margin.delegation.liquidation.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MarginDelegationLiquidationFragment.m38236e4(this.f32965b, delegationLiquidationEntity, view2);
            }
        });
    }

    /* JADX INFO: renamed from: f4 */
    public final void m38259f4(BaseViewHolder baseViewHolder, DelegationLiquidationEntity delegationLiquidationEntity) {
        baseViewHolder.setText(R$id.tv_starttime_value, C42179a.m92633f(C27039d.m66652l(delegationLiquidationEntity.getCreatedAt()), null, false, false, null, 15, null)).setText(R$id.tv_endtime_value, C42179a.m92633f(C27039d.m66652l(delegationLiquidationEntity.getUpdatedAt()), null, false, false, null, 15, null));
    }

    /* JADX INFO: renamed from: g4 */
    public final void m38260g4(BaseViewHolder baseViewHolder, final DelegationLiquidationEntity delegationLiquidationEntity) {
        String string = getString(R$string.interest_liquidation_total_consumed_usdt);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        final String string2 = getString(R$string.interest_liquidation_total_consumed);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        BigDecimal totalConsumedUsdt = delegationLiquidationEntity.getTotalConsumedUsdt();
        String strM66669i = C27041f.m66669i(totalConsumedUsdt != null ? C37886j.m85578b(totalConsumedUsdt, "USDT", null, false, false, false, 0, null, 0, 254, null) : null, "--");
        int i11 = R$id.tv_lever_liquidation_debts;
        BaseViewHolder text = baseViewHolder.setText(i11, string);
        int i12 = R$id.tv_lever_liquidation_debts_value;
        View view = text.setText(i12, strM66669i).getView(i12);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C44172b.m97383c((TextView) view, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        DashTextView dashTextView = (DashTextView) baseViewHolder.getView(i11);
        List<AssetEntity> liquidationConsumedList = delegationLiquidationEntity.getLiquidationConsumedList();
        boolean z11 = !(liquidationConsumedList == null || liquidationConsumedList.isEmpty());
        dashTextView.setClickable(z11);
        dashTextView.setNeedDash(z11);
        dashTextView.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.margin.delegation.liquidation.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MarginDelegationLiquidationFragment.m38237h4(delegationLiquidationEntity, string2, this, view2);
            }
        });
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.bmargin_fragment_delegation_liquidation;
    }

    public final int getTradeType() {
        return ((Number) this.f32954g0.getValue()).intValue();
    }

    /* JADX INFO: renamed from: i4 */
    public final void m38261i4(BaseViewHolder baseViewHolder, final DelegationLiquidationEntity delegationLiquidationEntity) {
        final String string = getString(R$string.lever_liquidation_total, m38239m4(delegationLiquidationEntity.getBalanceCurrency()));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        int i11 = R$id.tv_lever_liquidation_total;
        BaseViewHolder text = baseViewHolder.setText(i11, string);
        int i12 = R$id.tv_lever_liquidation_total_value;
        BigDecimal total = delegationLiquidationEntity.getTotal();
        text.setText(i12, C27041f.m66669i(total != null ? C37886j.m85578b(total, delegationLiquidationEntity.getBalanceCurrency(), null, false, false, false, 0, null, 0, 254, null) : null, "--"));
        DashTextView dashTextView = (DashTextView) baseViewHolder.getView(i11);
        boolean z11 = !delegationLiquidationEntity.getAssets().isEmpty();
        dashTextView.setClickable(z11);
        dashTextView.setNeedDash(z11);
        dashTextView.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.margin.delegation.liquidation.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MarginDelegationLiquidationFragment.m38238j4(delegationLiquidationEntity, string, this, view);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: l4 */
    public final C36927n m38263l4() {
        return (C36927n) this.f32947Z.getValue(this, f32946l0[0]);
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final C36927n c36927nM38263l4 = m38263l4();
        if (c36927nM38263l4 != null) {
            c36927nM38263l4.f81845g.setEnabled(getParentFragment() instanceof MarginDelegationFragment);
            c36927nM38263l4.f81845g.getRecyclerView().addItemDecoration(new StrictDividerItemDecoration(getColorRes(R$color.emphasis8), C5275i0.m6236a(0.5f), C5275i0.m6236a(16.0f)));
            MarginDelegationFilterViewExt marginDelegationFilterViewExt = this.f32957j0;
            DropMenuView mDropMenuView = c36927nM38263l4.f81844f;
            Intrinsics.checkNotNullExpressionValue(mDropMenuView, "mDropMenuView");
            BaseTextView ivFilter = c36927nM38263l4.f81842d;
            Intrinsics.checkNotNullExpressionValue(ivFilter, "ivFilter");
            marginDelegationFilterViewExt.m38167F(mDropMenuView, ivFilter, this.mContext, new Function1() { // from class: com.kubi.margin.delegation.liquidation.k
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginDelegationLiquidationFragment.m38246t4(this.f32969b, (List) obj);
                }
            });
            BaseTextView ivFilter2 = c36927nM38263l4.f81842d;
            Intrinsics.checkNotNullExpressionValue(ivFilter2, "ivFilter");
            C27046k.m66711z(ivFilter2, 0L, new Function0() { // from class: com.kubi.margin.delegation.liquidation.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginDelegationLiquidationFragment.m38247u4(c36927nM38263l4);
                }
            }, 1, null);
            MarginDelegationFilterViewExt marginDelegationFilterViewExt2 = this.f32957j0;
            BaseTextView tvChoosePairs = c36927nM38263l4.f81847i;
            Intrinsics.checkNotNullExpressionValue(tvChoosePairs, "tvChoosePairs");
            marginDelegationFilterViewExt2.m38171t(tvChoosePairs, getTradeType(), this, new Function0() { // from class: com.kubi.margin.delegation.liquidation.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginDelegationLiquidationFragment.m38248v4(this.f32971b);
                }
            });
            if (getTradeType() == 2) {
                BaseTextView tvChoosePairs2 = c36927nM38263l4.f81847i;
                Intrinsics.checkNotNullExpressionValue(tvChoosePairs2, "tvChoosePairs");
                ViewExtKt.m66594y(tvChoosePairs2);
            } else {
                BaseTextView tvChoosePairs3 = c36927nM38263l4.f81847i;
                Intrinsics.checkNotNullExpressionValue(tvChoosePairs3, "tvChoosePairs");
                ViewExtKt.m66577h(tvChoosePairs3);
            }
            BaseTextView baseTextView = c36927nM38263l4.f81846h;
            MarginDelegationFilterViewExt marginDelegationFilterViewExt3 = this.f32957j0;
            Intrinsics.checkNotNull(baseTextView);
            marginDelegationFilterViewExt3.m38169o(baseTextView, this, this.f32951d0, new Function1() { // from class: com.kubi.margin.delegation.liquidation.n
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginDelegationLiquidationFragment.m38249w4(this.f32972b, (AbstractC36514a) obj);
                }
            });
            m38265z4(this.f32951d0);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: p3 */
    public boolean mo21477p3() {
        return C42579a.f94275a.m93347g().c();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @Nullable
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<DelegationLiquidationEntity>> mo16440r3(int i11, int i12) {
        this.f32948a0.clear();
        if (!this.f32953f0) {
            this.f32952e0 = "THREE_MONTH";
        }
        this.f32948a0.put("startAt", m38243q4(this.f32952e0));
        this.f32948a0.put("endAt", this.f32956i0.f54265b);
        this.f32948a0.put("page", String.valueOf(i11));
        this.f32948a0.put("size", String.valueOf(i12));
        if (getTradeType() == 2) {
            this.f32948a0.put("positionTag", this.f32949b0);
        }
        this.f32948a0.put("bizType", this.f32951d0.getF79341b());
        this.f32948a0.put("positionType", getTradeType() == 2 ? SharedPositionInfo.MARGIN_MODE_ISOLATED : "MARGIN");
        Observable<R> observableCompose = m38242p4().m102140x(this.f32948a0).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.delegation.liquidation.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginDelegationLiquidationFragment.m38240n4(this.f32963b, (BasePageEntity) obj);
            }
        };
        return observableCompose.flatMap(new Function() { // from class: com.kubi.margin.delegation.liquidation.g
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MarginDelegationLiquidationFragment.m38241o4(function1, obj);
            }
        });
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: v3 */
    public int mo15923v3() {
        return R$string.delegation_no_more_data;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.bmargin_item_delegation_liquidation_view;
    }

    /* JADX INFO: renamed from: x4 */
    public final void m38264x4(@NotNull FilterType.InterfaceC23033b time) {
        Intrinsics.checkNotNullParameter(time, "time");
        this.f32953f0 = true;
        this.f32952e0 = time.getF44545b();
        m38251B4();
        mo15906F3();
    }

    /* JADX INFO: renamed from: z4 */
    public final void m38265z4(@NotNull final AbstractC36514a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f32951d0 = type;
        runOnUiThread(new Function0() { // from class: com.kubi.margin.delegation.liquidation.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginDelegationLiquidationFragment.m38219A4(this.f32967b, type);
            }
        });
    }

    /* JADX INFO: renamed from: A4 */
    public static final Unit m38219A4(MarginDelegationLiquidationFragment marginDelegationLiquidationFragment, AbstractC36514a abstractC36514a) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        C36927n c36927nM38263l4 = marginDelegationLiquidationFragment.m38263l4();
        if (c36927nM38263l4 != null && (baseTextView2 = c36927nM38263l4.f81846h) != null) {
            baseTextView2.setText(C27017c.f54310a.m66516f(abstractC36514a.getF79340a(), new Object[0]));
        }
        C36927n c36927nM38263l5 = marginDelegationLiquidationFragment.m38263l4();
        if (c36927nM38263l5 != null && (baseTextView = c36927nM38263l5.f81846h) != null) {
            baseTextView.setTextColor(C27017c.f54310a.m66512a(R$color.brandGreen));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a4 */
    public static final void m38234a4(DelegationLiquidationEntity delegationLiquidationEntity, String str, MarginDelegationLiquidationFragment marginDelegationLiquidationFragment, View view) {
        if (!delegationLiquidationEntity.getDebts().isEmpty()) {
            CoinListDialog.Companion companion = CoinListDialog.f32939u0;
            ArrayList<AssetEntity> arrayList = new ArrayList<>(delegationLiquidationEntity.getDebts());
            String string = marginDelegationLiquidationFragment.getString(R$string.lever_liquidation_debt);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            CoinListDialog coinListDialogNewInstance = companion.newInstance(arrayList, str, string);
            FragmentManager childFragmentManager = marginDelegationLiquidationFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            coinListDialogNewInstance.show(childFragmentManager, "CoinListDialog");
        }
    }

    /* JADX INFO: renamed from: c4 */
    public static final void m38235c4(DelegationLiquidationEntity delegationLiquidationEntity, MarginDelegationLiquidationFragment marginDelegationLiquidationFragment, View view) {
        if (!delegationLiquidationEntity.getDebts().isEmpty()) {
            CoinListDialog.Companion companion = CoinListDialog.f32939u0;
            ArrayList<AssetEntity> arrayList = new ArrayList<>(delegationLiquidationEntity.getDebts());
            String string = marginDelegationLiquidationFragment.getString(R$string.interest_liquidation_total_exchanged);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = marginDelegationLiquidationFragment.getString(R$string.lever_liquidation_assets);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            CoinListDialog coinListDialogNewInstance = companion.newInstance(arrayList, string, string2);
            FragmentManager childFragmentManager = marginDelegationLiquidationFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            coinListDialogNewInstance.show(childFragmentManager, "CoinListDialog");
        }
    }

    /* JADX INFO: renamed from: h4 */
    public static final void m38237h4(DelegationLiquidationEntity delegationLiquidationEntity, String str, MarginDelegationLiquidationFragment marginDelegationLiquidationFragment, View view) {
        List<AssetEntity> liquidationConsumedList = delegationLiquidationEntity.getLiquidationConsumedList();
        if (liquidationConsumedList == null) {
            liquidationConsumedList = CollectionsKt.emptyList();
        }
        if (!liquidationConsumedList.isEmpty()) {
            CoinListDialog.Companion companion = CoinListDialog.f32939u0;
            ArrayList<AssetEntity> arrayList = new ArrayList<>(liquidationConsumedList);
            String string = marginDelegationLiquidationFragment.getString(R$string.lever_liquidation_debt);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            CoinListDialog coinListDialogNewInstance = companion.newInstance(arrayList, str, string);
            FragmentManager childFragmentManager = marginDelegationLiquidationFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            coinListDialogNewInstance.show(childFragmentManager, "CoinListDialog");
        }
    }

    /* JADX INFO: renamed from: j4 */
    public static final void m38238j4(DelegationLiquidationEntity delegationLiquidationEntity, String str, MarginDelegationLiquidationFragment marginDelegationLiquidationFragment, View view) {
        if (!delegationLiquidationEntity.getAssets().isEmpty()) {
            CoinListDialog.Companion companion = CoinListDialog.f32939u0;
            ArrayList<AssetEntity> arrayList = new ArrayList<>(delegationLiquidationEntity.getAssets());
            String string = marginDelegationLiquidationFragment.getString(R$string.lever_liquidation_assets);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            CoinListDialog coinListDialogNewInstance = companion.newInstance(arrayList, str, string);
            FragmentManager childFragmentManager = marginDelegationLiquidationFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            coinListDialogNewInstance.show(childFragmentManager, "CoinListDialog");
        }
    }

    /* JADX INFO: renamed from: q4 */
    private final String m38243q4(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1480287667) {
            if (iHashCode != -170154913) {
                if (iHashCode == 1346794279 && str.equals("ONE_MONTH")) {
                    return String.valueOf(this.f32956i0.m66434a(30, 6));
                }
                return "";
            }
            if (str.equals("THREE_MONTH")) {
                return String.valueOf(this.f32956i0.m66434a(90, 6));
            }
            return "";
        }
        if (str.equals("ONE_WEEK")) {
            return String.valueOf(this.f32956i0.m66434a(7, 6));
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s4 */
    public static final InterfaceC46307h m38245s4() {
        return (InterfaceC46307h) C42597a.m93386b().create(InterfaceC46307h.class);
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m38248v4(MarginDelegationLiquidationFragment marginDelegationLiquidationFragment) {
        marginDelegationLiquidationFragment.m38251B4();
        marginDelegationLiquidationFragment.mo15906F3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    public static final int m38250y4(MarginDelegationLiquidationFragment marginDelegationLiquidationFragment) {
        Integer numValueOf;
        Bundle arguments = marginDelegationLiquidationFragment.getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt("tradeType"));
        } else {
            numValueOf = null;
        }
        return C27039d.m66651k(numValueOf, 1);
    }

    /* JADX INFO: renamed from: B4 */
    public final void m38251B4() {
        Object tag;
        BaseTextView baseTextView;
        C36927n c36927nM38263l4 = m38263l4();
        String str = null;
        if (c36927nM38263l4 != null && (baseTextView = c36927nM38263l4.f81847i) != null) {
            tag = baseTextView.getTag();
        } else {
            tag = null;
        }
        if (tag instanceof String) {
            str = (String) tag;
        }
        if (str == null || Intrinsics.areEqual(str, getString(R$string.all))) {
            str = "";
        }
        this.f32949b0 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38262k4(BaseViewHolder baseViewHolder, DelegationLiquidationEntity delegationLiquidationEntity) {
        if (getTradeType() == 2) {
            int i11 = R$id.tv_trade_pair;
            baseViewHolder.setGone(i11, true);
            baseViewHolder.setText(i11, m38244r4(delegationLiquidationEntity.getPositionTag()));
            return;
        }
        baseViewHolder.setGone(R$id.tv_trade_pair, false);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        mo15906F3();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showContent() {
        SwipeRefreshRecyclerView swipeRefreshRecyclerView;
        C36928n0 c36928n0;
        LinearLayout root;
        super.showContent();
        C36927n c36927nM38263l4 = m38263l4();
        if (c36927nM38263l4 != null && (c36928n0 = c36927nM38263l4.f81840b) != null && (root = c36928n0.getRoot()) != null) {
            ViewExtKt.m66577h(root);
        }
        C36927n c36927nM38263l5 = m38263l4();
        if (c36927nM38263l5 != null && (swipeRefreshRecyclerView = c36927nM38263l5.f81845g) != null) {
            ViewExtKt.m66594y(swipeRefreshRecyclerView);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty() {
        C36928n0 c36928n0;
        BaseTextView baseTextView;
        C36928n0 c36928n1;
        ImageView imageView;
        SwipeRefreshRecyclerView swipeRefreshRecyclerView;
        C36928n0 c36928n2;
        LinearLayout root;
        super.showContent();
        C36927n c36927nM38263l4 = m38263l4();
        if (c36927nM38263l4 != null && (c36928n2 = c36927nM38263l4.f81840b) != null && (root = c36928n2.getRoot()) != null) {
            ViewExtKt.m66594y(root);
        }
        C36927n c36927nM38263l5 = m38263l4();
        if (c36927nM38263l5 != null && (swipeRefreshRecyclerView = c36927nM38263l5.f81845g) != null) {
            ViewExtKt.m66577h(swipeRefreshRecyclerView);
        }
        C36927n c36927nM38263l6 = m38263l4();
        if (c36927nM38263l6 != null && (c36928n1 = c36927nM38263l6.f81840b) != null && (imageView = c36928n1.f81849b) != null) {
            imageView.setImageResource(R$drawable.ic2_common_empty);
        }
        C36927n c36927nM38263l7 = m38263l4();
        if (c36927nM38263l7 != null && (c36928n0 = c36927nM38263l7.f81840b) != null && (baseTextView = c36928n0.f81850c) != null) {
            baseTextView.setText(R$string.no_records);
        }
    }
}
