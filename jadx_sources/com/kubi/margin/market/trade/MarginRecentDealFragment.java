package com.kubi.margin.market.trade;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5275i0;
import com.google.gson.reflect.TypeToken;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.kucoin.manager.SpotMarketSocketAdapter;
import com.kubi.kucoin.manager.SpotMatchPushEntity;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.margin.entity.MarketRecentEntity;
import com.kubi.margin.entity.WsRecentDealEntity;
import com.kubi.network.websocket.model.Message;
import com.kubi.network.websocket.model.Request;
import com.kubi.network.websocket.observable.C19406c;
import com.kubi.resources.C22890g;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27099x;
import com.kubi.utils.FlowableCompatKt;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37886j;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import l30.C42050c;
import l30.C42051d;
import l30.InterfaceC42048a;
import mr.C42597a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36938s0;
import p239ep.C37226g;
import p402kf.C41014a;
import p429lf.C42179a;
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
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: MarginRecentDealFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u001c\u0018\u0000 62\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001a\u001a\u00020\u0017H\u0014J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020!H\u0016J!\u0010'\u001a\u00020!2\u0012\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020*0)\"\u00020*H\u0002¢\u0006\u0002\u0010+J\u0016\u0010,\u001a\u00020!2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.H\u0002J\u0010\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020/H\u0002J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R#\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001d\u0010\u001e¨\u00067"}, m90084d2 = {"Lcom/kubi/margin/market/trade/MarginRecentDealFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "bmarginLayoutRecyclerBinding", "Lcom/kubi/margin/databinding/BmarginLayoutRecyclerBinding;", "getBmarginLayoutRecyclerBinding", "()Lcom/kubi/margin/databinding/BmarginLayoutRecyclerBinding;", "bmarginLayoutRecyclerBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mApi", "Lcom/kubi/margin/api/MarketApi;", "kotlin.jvm.PlatformType", "getMApi", "()Lcom/kubi/margin/api/MarketApi;", "mApi$delegate", "Lkotlin/Lazy;", "tradeItem", "Lcom/kubi/data/entity/TradeItemBean;", "getTradeItem", "()Lcom/kubi/data/entity/TradeItemBean;", "tradeItem$delegate", "showSize", "", "mAmountDisplayRule", "Lcom/kubi/tradebase/business/orderbook/IOrderBookAmountDisplayRule;", "getLayout", "mAdapter", "com/kubi/margin/market/trade/MarginRecentDealFragment$mAdapter$2$1", "getMAdapter", "()Lcom/kubi/margin/market/trade/MarginRecentDealFragment$mAdapter$2$1;", "mAdapter$delegate", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onLoad", "initRecyclerView", "recyclerViews", "", "Landroidx/recyclerview/widget/RecyclerView;", "([Landroidx/recyclerview/widget/RecyclerView;)V", "onL3Get", "marketRecentEntities", "", "Lcom/kubi/margin/entity/MarketRecentEntity;", "onL3DataGet", "convertToEntity", "formatterAmount", "", "size", "Ljava/math/BigDecimal;", "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginRecentDealFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginRecentDealFragment.kt\ncom/kubi/margin/market/trade/MarginRecentDealFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 Response.kt\ncom/kubi/network/websocket/model/Message\n+ 4 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,211:1\n147#2,16:212\n58#3,6:228\n64#3,2:235\n58#3,6:237\n64#3,2:244\n58#3,6:246\n64#3,2:253\n126#4:234\n126#4:243\n126#4:252\n*S KotlinDebug\n*F\n+ 1 MarginRecentDealFragment.kt\ncom/kubi/margin/market/trade/MarginRecentDealFragment\n*L\n55#1:212,16\n115#1:228,6\n115#1:235,2\n135#1:237,6\n135#1:244,2\n137#1:246,6\n137#1:253,2\n115#1:234\n135#1:243\n137#1:252\n*E\n"})
public final class MarginRecentDealFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: Y */
    @Nullable
    public InterfaceC42048a f33493Y;

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ KProperty<Object>[] f33488b0 = {Reflection.property1(new PropertyReference1Impl(MarginRecentDealFragment.class, "bmarginLayoutRecyclerBinding", "getBmarginLayoutRecyclerBinding()Lcom/kubi/margin/databinding/BmarginLayoutRecyclerBinding;", 0))};

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final Companion f33487a0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f33489U = C45681e.m100799e(this, new Function1<MarginRecentDealFragment, C36938s0>() { // from class: com.kubi.margin.market.trade.MarginRecentDealFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36938s0 invoke(@NotNull MarginRecentDealFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36938s0.m82745a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36938s0, Unit>() { // from class: com.kubi.margin.market.trade.MarginRecentDealFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36938s0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36938s0 c36938s0) {
            invoke(c36938s0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f33490V = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.trade.g1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginRecentDealFragment.m39359K3();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f33491W = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.trade.o1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginRecentDealFragment.m39374b4(this.f33531b);
        }
    });

    /* JADX INFO: renamed from: X */
    public int f33492X = 22;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f33494Z = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.trade.p1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginRecentDealFragment.m39358J3(this.f33534b);
        }
    });

    /* JADX INFO: compiled from: MarginRecentDealFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/margin/market/trade/MarginRecentDealFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/margin/market/trade/MarginRecentDealFragment;", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MarginRecentDealFragment newInstance(@NotNull TradeItemBean tradeItemBean) {
            Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
            MarginRecentDealFragment marginRecentDealFragment = new MarginRecentDealFragment();
            marginRecentDealFragment.setArguments(new C27051h().m66721e("data", tradeItemBean).m66717a());
            return marginRecentDealFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.trade.MarginRecentDealFragment$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C18011a extends TypeToken<BasePageEntity<MarketRecentEntity>> {
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.trade.MarginRecentDealFragment$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C18012b extends TypeToken<WsRecentDealEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.trade.MarginRecentDealFragment$c */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C18013c extends TypeToken<BasePageEntity<MarketRecentEntity>> {
    }

    /* JADX INFO: renamed from: I3 */
    private final void m39357I3(RecyclerView... recyclerViewArr) {
        for (RecyclerView recyclerView : recyclerViewArr) {
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H3 */
    public final TradeItemBean m39356H3() {
        return (TradeItemBean) this.f33491W.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.kubi.margin.market.trade.MarginRecentDealFragment$mAdapter$2$1] */
    /* JADX INFO: renamed from: J3 */
    public static final MarginRecentDealFragment$mAdapter$2$1 m39358J3(final MarginRecentDealFragment marginRecentDealFragment) {
        final int i11 = R$layout.bmargin_item_market_recent_deal;
        return new BaseQuickAdapter<MarketRecentEntity, BaseViewHolder>(i11) { // from class: com.kubi.margin.market.trade.MarginRecentDealFragment$mAdapter$2$1
            {
                setHasStableIds(true);
            }

            @Override // io.chad.library.adapter.base.BaseQuickAdapter
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void convert(BaseViewHolder helper, MarketRecentEntity item) {
                Intrinsics.checkNotNullParameter(helper, "helper");
                Intrinsics.checkNotNullParameter(item, "item");
                int i12 = R$id.recent_time_tv;
                Long time = item.getTime();
                BaseViewHolder text = helper.setText(i12, time != null ? C42179a.m92635h(time.longValue(), null, false, null, 7, null) : null);
                int i13 = R$id.recent_price_tv;
                Context mContext = this.mContext;
                Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
                text.setTextColor(i13, C22890g.m54281f(mContext, Intrinsics.areEqual("buy", item.getSide())));
                BigDecimal price = item.getPrice();
                helper.setText(i13, price != null ? C37886j.m85579c(price, this.f33495i.m39356H3().getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null) : null).setText(R$id.recent_vol_tv, this.f33495i.m39391D3(C41014a.m89922G(item.getSize(), null, 1, null)));
            }
        };
    }

    /* JADX INFO: renamed from: N3 */
    public static final Object m39360N3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: O3 */
    public static final boolean m39361O3(String str, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            return true;
        }
        return Intrinsics.areEqual(it.getSource(), "socket") && Intrinsics.areEqual(it.getTopic(), str) && it.getUserId().length() == 0;
    }

    /* JADX INFO: renamed from: P3 */
    public static final boolean m39362P3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Object m39363Q3(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objM66914d = null;
        try {
            if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
                if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                    String data = it.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data, new C18011a().getType());
                }
            } else if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                String data2 = it.getData();
                Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type kotlin.String");
                C27099x c27099x2 = C27099x.f54458a;
                objM66914d = C27099x.m66914d(data2, new C18012b().getType());
            }
        } catch (Throwable unused) {
        }
        Intrinsics.checkNotNull(objM66914d, "null cannot be cast to non-null type kotlin.Any");
        return objM66914d;
    }

    /* JADX INFO: renamed from: R3 */
    public static final Object m39364R3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: S3 */
    public static final void m39365S3(MarginRecentDealFragment marginRecentDealFragment, Object obj) {
        Long sequence;
        if (obj instanceof BasePageEntity) {
            List<MarketRecentEntity> items = ((BasePageEntity) obj).getItems();
            Intrinsics.checkNotNullExpressionValue(items, "getItems(...)");
            marginRecentDealFragment.m39396M3(items);
        } else if (obj instanceof WsRecentDealEntity) {
            List<MarketRecentEntity> data = marginRecentDealFragment.m39393F3().getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            MarketRecentEntity marketRecentEntity = (MarketRecentEntity) CollectionsKt.firstOrNull((List) data);
            Long lValueOf = (marketRecentEntity == null || (sequence = marketRecentEntity.getSequence()) == null) ? null : Long.valueOf(C27039d.m66652l(sequence));
            if (lValueOf == null || ((WsRecentDealEntity) obj).getSequence() > lValueOf.longValue()) {
                marginRecentDealFragment.m39395L3(((WsRecentDealEntity) obj).convertToEntity());
            }
        }
    }

    /* JADX INFO: renamed from: V3 */
    public static final boolean m39368V3(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getSource(), "heartbeat");
    }

    /* JADX INFO: renamed from: W3 */
    public static final boolean m39369W3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: X3 */
    public static final Object m39370X3(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objM66914d = null;
        if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
            try {
                String data = it.getData();
                Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                C27099x c27099x = C27099x.f54458a;
                objM66914d = C27099x.m66914d(data, new C18013c().getType());
            } catch (Throwable unused) {
            }
        }
        Intrinsics.checkNotNull(objM66914d, "null cannot be cast to non-null type kotlin.Any");
        return objM66914d;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Object m39371Y3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: a4 */
    public static final Object m39373a4(SpotMatchPushEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WsRecentDealEntity wsRecentDealEntityM83276a = C37226g.m83276a(it);
        Intrinsics.checkNotNull(wsRecentDealEntityM83276a, "null cannot be cast to non-null type kotlin.Any");
        return wsRecentDealEntityM83276a;
    }

    /* JADX INFO: renamed from: D3 */
    public final String m39391D3(BigDecimal bigDecimal) {
        InterfaceC42048a c42050c = this.f33493Y;
        if (c42050c == null) {
            c42050c = m39356H3().getSymbolInfoEntity().getPriceIncrementPrecision() >= 8 ? new C42050c() : new C42051d();
            this.f33493Y = c42050c;
        }
        return c42050c.mo92251a(bigDecimal.doubleValue(), m39356H3().getSymbolInfoEntity().getBaseIncrementPrecision());
    }

    /* JADX INFO: renamed from: E3 */
    public final C36938s0 m39392E3() {
        return (C36938s0) this.f33489U.getValue(this, f33488b0[0]);
    }

    /* JADX INFO: renamed from: F3 */
    public final MarginRecentDealFragment$mAdapter$2$1 m39393F3() {
        return (MarginRecentDealFragment$mAdapter$2$1) this.f33494Z.getValue();
    }

    /* JADX INFO: renamed from: G3 */
    public final InterfaceC46307h m39394G3() {
        return (InterfaceC46307h) this.f33490V.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.bmargin_layout_recycler;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Fragment parentFragment = getParentFragment();
        MarginMarketTradeFragment marginMarketTradeFragment = parentFragment instanceof MarginMarketTradeFragment ? (MarginMarketTradeFragment) parentFragment : null;
        float fM66650j = C27039d.m66650j(marginMarketTradeFragment != null ? Integer.valueOf(marginMarketTradeFragment.getF33473d0()) : null);
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        float fM66565c = fM66650j - C27025c.m66565c(mContext, 44);
        Context mContext2 = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
        this.f33492X = (int) (fM66565c / C27025c.m66564b(mContext2, 20.0f));
        C36938s0 c36938s0M39392E3 = m39392E3();
        Intrinsics.checkNotNull(c36938s0M39392E3);
        RecyclerView recyclerView3 = c36938s0M39392E3.f81977c;
        Intrinsics.checkNotNullExpressionValue(recyclerView3, "recyclerView");
        m39357I3(recyclerView3);
        m39393F3().addHeaderView(View.inflate(this.mContext, R$layout.bmargin_fragment_market_recent, null));
        C36938s0 c36938s0M39392E4 = m39392E3();
        if (c36938s0M39392E4 != null && (recyclerView2 = c36938s0M39392E4.f81977c) != null) {
            recyclerView2.setAdapter(m39393F3());
        }
        C36938s0 c36938s0M39392E5 = m39392E3();
        if (c36938s0M39392E5 != null && (recyclerView = c36938s0M39392E5.f81977c) != null) {
            recyclerView.setPadding(C5275i0.m6241f(16.0f), 0, C5275i0.m6241f(16.0f), 0);
        }
        showLoading();
    }

    /* JADX INFO: renamed from: K3 */
    public static final InterfaceC46307h m39359K3() {
        return (InterfaceC46307h) C42597a.m93390f().create(InterfaceC46307h.class);
    }

    /* JADX INFO: renamed from: T3 */
    public static final Unit m39366T3(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    public static final void m39367U3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z3 */
    public static final Observable m39372Z3() {
        Observable observableEmpty = Observable.empty();
        Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
        return observableEmpty;
    }

    /* JADX INFO: renamed from: b4 */
    public static final TradeItemBean m39374b4(MarginRecentDealFragment marginRecentDealFragment) {
        TradeItemBean tradeItemBean;
        Bundle arguments = marginRecentDealFragment.getArguments();
        if (arguments != null) {
            tradeItemBean = (TradeItemBean) arguments.getParcelable("data");
        } else {
            tradeItemBean = null;
        }
        Intrinsics.checkNotNull(tradeItemBean);
        return tradeItemBean;
    }

    /* JADX INFO: renamed from: L3 */
    public final void m39395L3(MarketRecentEntity marketRecentEntity) {
        m39393F3().getData().add(0, marketRecentEntity);
        if (m39393F3().getData().size() >= this.f33492X) {
            m39393F3().remove(m39393F3().getData().size() - 1);
        }
        if (m39393F3().getData().isEmpty()) {
            showEmpty();
        } else {
            showContent();
            m39393F3().notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: M3 */
    public final void m39396M3(List<MarketRecentEntity> list) {
        m39393F3().replaceData(list);
        if (m39393F3().getData().isEmpty()) {
            showEmpty();
        } else {
            showContent();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        Observable map;
        super.onLoad();
        final String strM66551u = DowngradeExKt.m66551u("/market/match:%s", new Object[]{m39356H3().getSymbol()}, null, 2, null);
        SpotMarketSocketAdapter spotMarketSocketAdapter = SpotMarketSocketAdapter.f28144a;
        if (spotMarketSocketAdapter.m32665b0()) {
            Request.Companion companion = Request.INSTANCE;
            C19406c c19406c = new C19406c(companion.subscribe(m39394G3().m102131o(this.f33492X, m39356H3().getSymbol()), new String[0]), companion.unsubscribe(m39394G3().m102131o(this.f33492X, m39356H3().getSymbol()), new String[0]), null, true, null, 20, null);
            final Function1 function1 = new Function1() { // from class: com.kubi.margin.market.trade.q1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(MarginRecentDealFragment.m39368V3((Message) obj));
                }
            };
            Observable<Message> observableFilter = c19406c.filter(new Predicate() { // from class: com.kubi.margin.market.trade.v1
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return MarginRecentDealFragment.m39369W3(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: com.kubi.margin.market.trade.w1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginRecentDealFragment.m39370X3((Message) obj);
                }
            };
            ObservableSource map2 = observableFilter.map(new Function() { // from class: com.kubi.margin.market.trade.h1
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return MarginRecentDealFragment.m39371Y3(function2, obj);
                }
            });
            String symbol = m39356H3().getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
            Observable observableM32619F = SpotMarketSocketAdapter.m32619F(spotMarketSocketAdapter, symbol, false, new Function0() { // from class: com.kubi.margin.market.trade.i1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginRecentDealFragment.m39372Z3();
                }
            }, 2, null);
            final Function1 function3 = new Function1() { // from class: com.kubi.margin.market.trade.j1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginRecentDealFragment.m39373a4((SpotMatchPushEntity) obj);
                }
            };
            map = Observable.merge(map2, observableM32619F.map(new Function() { // from class: com.kubi.margin.market.trade.k1
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return MarginRecentDealFragment.m39360N3(function3, obj);
                }
            }));
        } else {
            Request.Companion companion2 = Request.INSTANCE;
            C19406c c19406c2 = new C19406c(companion2.subscribe(m39394G3().m102131o(this.f33492X, m39356H3().getSymbol()), strM66551u), companion2.unsubscribe(m39394G3().m102131o(this.f33492X, m39356H3().getSymbol()), strM66551u), null, true, null, 20, null);
            final Function1 function4 = new Function1() { // from class: com.kubi.margin.market.trade.l1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(MarginRecentDealFragment.m39361O3(strM66551u, (Message) obj));
                }
            };
            Observable<Message> observableFilter2 = c19406c2.filter(new Predicate() { // from class: com.kubi.margin.market.trade.m1
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return MarginRecentDealFragment.m39362P3(function4, obj);
                }
            });
            final Function1 function5 = new Function1() { // from class: com.kubi.margin.market.trade.n1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginRecentDealFragment.m39363Q3((Message) obj);
                }
            };
            map = observableFilter2.map(new Function() { // from class: com.kubi.margin.market.trade.r1
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return MarginRecentDealFragment.m39364R3(function5, obj);
                }
            });
        }
        Intrinsics.checkNotNull(map);
        Observable observableObserveOn = FlowableCompatKt.m66394h(map).subscribeOn(C42916f.m94127f()).observeOn(AndroidSchedulers.mainThread());
        Consumer consumer = new Consumer() { // from class: com.kubi.margin.market.trade.s1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginRecentDealFragment.m39365S3(this.f33549b, obj);
            }
        };
        final Function1 function6 = new Function1() { // from class: com.kubi.margin.market.trade.t1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginRecentDealFragment.m39366T3((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.market.trade.u1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginRecentDealFragment.m39367U3(function6, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }
}
