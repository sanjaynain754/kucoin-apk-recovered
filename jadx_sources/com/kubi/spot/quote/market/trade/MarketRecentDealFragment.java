package com.kubi.spot.quote.market.trade;

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
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.kucoin.manager.SpotMarketSocketAdapter;
import com.kubi.kucoin.manager.SpotMatchPushEntity;
import com.kubi.network.websocket.model.Message;
import com.kubi.network.websocket.model.Request;
import com.kubi.network.websocket.observable.C19406c;
import com.kubi.router.core.Router;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.R$layout;
import com.kubi.spot.entity.MarketRecentEntity;
import com.kubi.spot.entity.MarketRecentTypeEntity;
import com.kubi.spot.entity.WsRecentDealEntity;
import com.kubi.spot.entity.WsRecentDealEntityKt;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27099x;
import com.kubi.utils.FlowableCompatKt;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.tencent.qcloud.tuicore.TUIConstants;
import e20.InterfaceC37053d;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p830zf.InterfaceC46828x;
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
import t20.C44657o0;
import w00.C45681e;

/* JADX INFO: compiled from: MarketRecentDealFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 C2\u00020\u0001:\u0001CB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u0017H\u0014J\u001a\u00101\u001a\u0002022\u0006\u00103\u001a\u00020#2\b\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u00106\u001a\u000202H\u0016J!\u00107\u001a\u0002022\u0012\u00108\u001a\n\u0012\u0006\b\u0001\u0012\u00020:09\"\u00020:H\u0002¢\u0006\u0002\u0010;J\u0016\u0010<\u001a\u0002022\f\u0010=\u001a\b\u0012\u0004\u0012\u00020?0>H\u0002J\b\u0010@\u001a\u000202H\u0002J\u0010\u0010A\u001a\u0002022\u0006\u0010B\u001a\u00020?H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R#\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R#\u0010\"\u001a\n \f*\u0004\u0018\u00010#0#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0010\u001a\u0004\b$\u0010%R\u001b\u0010'\u001a\u00020(8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0010\u001a\u0004\b)\u0010*R\u001b\u0010,\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0010\u001a\u0004\b.\u0010/¨\u0006D"}, m90084d2 = {"Lcom/kubi/spot/quote/market/trade/MarketRecentDealFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/spot/databinding/KucoinLayoutRecyclerBinding;", "getBinding", "()Lcom/kubi/spot/databinding/KucoinLayoutRecyclerBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mApi", "Lcom/kubi/spot/api/MarketApi;", "kotlin.jvm.PlatformType", "getMApi", "()Lcom/kubi/spot/api/MarketApi;", "mApi$delegate", "Lkotlin/Lazy;", "tradeItem", "Lcom/kubi/data/entity/TradeItemBean;", "getTradeItem", "()Lcom/kubi/data/entity/TradeItemBean;", "tradeItem$delegate", "showSize", "", "getLayout", "data", "", "Lcom/kubi/spot/entity/MarketRecentTypeEntity;", "marketChangeDisplay", "", "getMarketChangeDisplay", "()Z", "setMarketChangeDisplay", "(Z)V", "headerView", "Landroid/view/View;", "getHeaderView", "()Landroid/view/View;", "headerView$delegate", "mAdapter", "Lcom/kubi/spot/quote/market/trade/MarketRecentItemAdapter;", "getMAdapter", "()Lcom/kubi/spot/quote/market/trade/MarketRecentItemAdapter;", "mAdapter$delegate", "marketRecentAdapter", "Lcom/kubi/spot/quote/market/trade/MarketRecentAdapter;", "getMarketRecentAdapter", "()Lcom/kubi/spot/quote/market/trade/MarketRecentAdapter;", "marketRecentAdapter$delegate", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "savedInstanceState", "Landroid/os/Bundle;", "onLoad", "initRecyclerView", "recyclerViews", "", "Landroidx/recyclerview/widget/RecyclerView;", "([Landroidx/recyclerview/widget/RecyclerView;)V", "onL3Get", "marketRecentEntities", "", "Lcom/kubi/spot/entity/MarketRecentEntity;", "handleHeaderView", "onL3DataGet", "convertToEntity", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketRecentDealFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketRecentDealFragment.kt\ncom/kubi/spot/quote/market/trade/MarketRecentDealFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 6 Response.kt\ncom/kubi/network/websocket/model/Message\n+ 7 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,239:1\n147#2,16:240\n17#3,2:256\n17#3,2:258\n1#4:260\n81#5,2:261\n58#6,6:263\n64#6,2:270\n58#6,6:272\n64#6,2:279\n58#6,6:281\n64#6,2:288\n126#7:269\n126#7:278\n126#7:287\n*S KotlinDebug\n*F\n+ 1 MarketRecentDealFragment.kt\ncom/kubi/spot/quote/market/trade/MarketRecentDealFragment\n*L\n46#1:240,16\n60#1:256,2\n70#1:258,2\n109#1:261,2\n130#1:263,6\n130#1:270,2\n150#1:272,6\n150#1:279,2\n152#1:281,6\n152#1:288,2\n130#1:269\n150#1:278\n152#1:287\n*E\n"})
public final class MarketRecentDealFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f51097U = C45681e.m100799e(this, new Function1<MarketRecentDealFragment, C44657o0>() { // from class: com.kubi.spot.quote.market.trade.MarketRecentDealFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44657o0 invoke(@NotNull MarketRecentDealFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44657o0.m98790a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44657o0, Unit>() { // from class: com.kubi.spot.quote.market.trade.MarketRecentDealFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44657o0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44657o0 c44657o0) {
            invoke(c44657o0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f51098V = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.trade.v
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketRecentDealFragment.m62815O3();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f51099W = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.trade.f0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketRecentDealFragment.m62832h4(this.f51149b);
        }
    });

    /* JADX INFO: renamed from: X */
    public int f51100X = 22;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public List<MarketRecentTypeEntity> f51101Y;

    /* JADX INFO: renamed from: Z */
    public boolean f51102Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f51103a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f51104b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f51105c0;

    /* JADX INFO: renamed from: e0 */
    public static final /* synthetic */ KProperty<Object>[] f51096e0 = {Reflection.property1(new PropertyReference1Impl(MarketRecentDealFragment.class, "binding", "getBinding()Lcom/kubi/spot/databinding/KucoinLayoutRecyclerBinding;", 0))};

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public static final Companion f51095d0 = new Companion(null);

    /* JADX INFO: compiled from: MarketRecentDealFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/spot/quote/market/trade/MarketRecentDealFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/spot/quote/market/trade/MarketRecentDealFragment;", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "MARKET_CHANGE_DISPLAY", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MarketRecentDealFragment newInstance(@NotNull TradeItemBean tradeItemBean) {
            Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
            MarketRecentDealFragment marketRecentDealFragment = new MarketRecentDealFragment();
            marketRecentDealFragment.setArguments(new C27051h().m66721e("data", tradeItemBean).m66717a());
            return marketRecentDealFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.trade.MarketRecentDealFragment$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C25714a extends TypeToken<BasePageEntity<MarketRecentEntity>> {
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.trade.MarketRecentDealFragment$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C25715b extends TypeToken<BasePageEntity<MarketRecentEntity>> {
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.trade.MarketRecentDealFragment$c */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C25716c extends TypeToken<WsRecentDealEntity> {
    }

    /* JADX INFO: renamed from: M3 */
    private final void m62813M3(RecyclerView... recyclerViewArr) {
        for (RecyclerView recyclerView : recyclerViewArr) {
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        }
    }

    /* JADX INFO: renamed from: J3 */
    private final TradeItemBean m62811J3() {
        return (TradeItemBean) this.f51099W.getValue();
    }

    /* JADX INFO: renamed from: L3 */
    public static final View m62812L3(MarketRecentDealFragment marketRecentDealFragment) {
        return View.inflate(marketRecentDealFragment.mContext, R$layout.kucoin_fragment_market_recent, null);
    }

    /* JADX INFO: renamed from: N3 */
    public static final MarketRecentItemAdapter m62814N3(MarketRecentDealFragment marketRecentDealFragment) {
        return new MarketRecentItemAdapter(marketRecentDealFragment.m62811J3().getSymbolInfoEntity().getPriceIncrementPrecision(), marketRecentDealFragment.m62811J3().getSymbolInfoEntity().getBaseIncrementPrecision());
    }

    /* JADX INFO: renamed from: P3 */
    public static final MarketRecentAdapter m62816P3(MarketRecentDealFragment marketRecentDealFragment) {
        return new MarketRecentAdapter(marketRecentDealFragment.f51101Y, marketRecentDealFragment.m62851G3());
    }

    /* JADX INFO: renamed from: S3 */
    public static final boolean m62818S3(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getSource(), "heartbeat");
    }

    /* JADX INFO: renamed from: T3 */
    public static final boolean m62819T3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: U3 */
    public static final Object m62820U3(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objM66914d = null;
        if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
            try {
                String data = it.getData();
                Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                C27099x c27099x = C27099x.f54458a;
                objM66914d = C27099x.m66914d(data, new C25714a().getType());
            } catch (Throwable unused) {
            }
        }
        Intrinsics.checkNotNull(objM66914d, "null cannot be cast to non-null type kotlin.Any");
        return objM66914d;
    }

    /* JADX INFO: renamed from: V3 */
    public static final Object m62821V3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: X3 */
    public static final Object m62823X3(SpotMatchPushEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WsRecentDealEntity spotWsRecentDealEntity = WsRecentDealEntityKt.toSpotWsRecentDealEntity(it);
        Intrinsics.checkNotNull(spotWsRecentDealEntity, "null cannot be cast to non-null type kotlin.Any");
        return spotWsRecentDealEntity;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Object m62824Y3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: Z3 */
    public static final boolean m62825Z3(String str, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            return true;
        }
        return Intrinsics.areEqual(it.getSource(), "socket") && Intrinsics.areEqual(it.getTopic(), str) && it.getUserId().length() == 0;
    }

    /* JADX INFO: renamed from: a4 */
    public static final boolean m62826a4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: b4 */
    public static final Object m62827b4(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objM66914d = null;
        try {
            if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
                if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                    String data = it.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data, new C25715b().getType());
                }
            } else if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                String data2 = it.getData();
                Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type kotlin.String");
                C27099x c27099x2 = C27099x.f54458a;
                objM66914d = C27099x.m66914d(data2, new C25716c().getType());
            }
        } catch (Throwable unused) {
        }
        Intrinsics.checkNotNull(objM66914d, "null cannot be cast to non-null type kotlin.Any");
        return objM66914d;
    }

    /* JADX INFO: renamed from: c4 */
    public static final Object m62828c4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: d4 */
    public static final void m62829d4(MarketRecentDealFragment marketRecentDealFragment, Object obj) {
        if (obj instanceof BasePageEntity) {
            List<? extends MarketRecentEntity> items = ((BasePageEntity) obj).getItems();
            Intrinsics.checkNotNullExpressionValue(items, "getItems(...)");
            marketRecentDealFragment.m62817R3(items);
        } else if (obj instanceof WsRecentDealEntity) {
            List<MarketRecentEntity> data = marketRecentDealFragment.m62851G3().getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            MarketRecentEntity marketRecentEntity = (MarketRecentEntity) CollectionsKt.firstOrNull((List) data);
            Long lValueOf = marketRecentEntity != null ? Long.valueOf(marketRecentEntity.getSequence()) : null;
            if (lValueOf == null || ((WsRecentDealEntity) obj).getSequence() > lValueOf.longValue()) {
                marketRecentDealFragment.m62855Q3(((WsRecentDealEntity) obj).convertToEntity());
            }
        }
    }

    /* JADX INFO: renamed from: E3 */
    public final C44657o0 m62849E3() {
        return (C44657o0) this.f51097U.getValue(this, f51096e0[0]);
    }

    /* JADX INFO: renamed from: F3 */
    public final View m62850F3() {
        return (View) this.f51103a0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: G3 */
    public final MarketRecentItemAdapter m62851G3() {
        return (MarketRecentItemAdapter) this.f51104b0.getValue();
    }

    /* JADX INFO: renamed from: H3 */
    public final InterfaceC37053d m62852H3() {
        return (InterfaceC37053d) this.f51098V.getValue();
    }

    /* JADX INFO: renamed from: I3 */
    public final MarketRecentAdapter m62853I3() {
        return (MarketRecentAdapter) this.f51105c0.getValue();
    }

    /* JADX INFO: renamed from: g4 */
    public final void m62856g4(boolean z11) {
        this.f51102Z = z11;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.kucoin_layout_recycler;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Fragment parentFragment = getParentFragment();
        MarketTradeFragment marketTradeFragment = parentFragment instanceof MarketTradeFragment ? (MarketTradeFragment) parentFragment : null;
        float fM66650j = C27039d.m66650j(marketTradeFragment != null ? Integer.valueOf(marketTradeFragment.getF51126d0()) : null);
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        float fM66565c = fM66650j - C27025c.m66565c(mContext, 44);
        Context mContext2 = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
        this.f51100X = (int) (fM66565c / C27025c.m66564b(mContext2, 20.0f));
        C44657o0 c44657o0M62849E3 = m62849E3();
        if (c44657o0M62849E3 != null && (recyclerView3 = c44657o0M62849E3.f99274c) != null) {
            m62813M3(recyclerView3);
        }
        m62851G3().addHeaderView(m62850F3());
        C44657o0 c44657o0M62849E4 = m62849E3();
        if (c44657o0M62849E4 != null && (recyclerView2 = c44657o0M62849E4.f99274c) != null) {
            recyclerView2.setAdapter(m62853I3());
        }
        C44657o0 c44657o0M62849E5 = m62849E3();
        if (c44657o0M62849E5 != null && (recyclerView = c44657o0M62849E5.f99274c) != null) {
            recyclerView.setPadding(C5275i0.m6241f(16.0f), 0, C5275i0.m6241f(16.0f), 0);
        }
        showLoading();
        if (C12573b.f21598a.m23696a()) {
            "market_change_display".length();
        }
        C12572a.m23692a(this, true, new MarketRecentDealFragment$onViewCreated$$inlined$bindFlowEvent$1("market_change_display", null, this));
    }

    public MarketRecentDealFragment() {
        boolean zMo1058a;
        ArrayList arrayList = new ArrayList();
        Router router = Router.f46192a;
        SiteInfoManager siteInfoManager = SiteInfoManager.f47913a;
        Object objM56186h = router.m56186h(InterfaceC46828x.class, siteInfoManager.m58109c());
        if (objM56186h != null) {
            zMo1058a = ((InterfaceC46828x) objM56186h).mo1058a();
        } else {
            zMo1058a = true;
        }
        if (zMo1058a) {
            arrayList.add(new MarketRecentTypeEntity(0, null, null, 6, null));
        }
        arrayList.add(new MarketRecentTypeEntity(1, null, null, 6, null));
        this.f51101Y = arrayList;
        Object objM56186h2 = router.m56186h(InterfaceC46828x.class, siteInfoManager.m58109c());
        this.f51102Z = objM56186h2 != null ? ((InterfaceC46828x) objM56186h2).mo1058a() : true;
        this.f51103a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.trade.g0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketRecentDealFragment.m62812L3(this.f51153b);
            }
        });
        this.f51104b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.trade.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketRecentDealFragment.m62814N3(this.f51156b);
            }
        });
        this.f51105c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.trade.i0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketRecentDealFragment.m62816P3(this.f51163b);
            }
        });
    }

    /* JADX INFO: renamed from: O3 */
    public static final InterfaceC37053d m62815O3() {
        return (InterfaceC37053d) C42597a.m93390f().create(InterfaceC37053d.class);
    }

    /* JADX INFO: renamed from: R3 */
    private final void m62817R3(List<? extends MarketRecentEntity> list) {
        Object next;
        m62851G3().replaceData(list);
        Iterator<T> it = this.f51101Y.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                Integer type = ((MarketRecentTypeEntity) next).getType();
                if (type != null && type.intValue() == 1) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        MarketRecentTypeEntity marketRecentTypeEntity = (MarketRecentTypeEntity) next;
        if (marketRecentTypeEntity != null) {
            marketRecentTypeEntity.setInfo(list);
        }
        m62854K3();
        if (m62851G3().getData().isEmpty() && !this.f51102Z) {
            showEmpty();
        } else {
            showContent();
        }
        m62853I3().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: W3 */
    public static final Observable m62822W3() {
        Observable observableEmpty = Observable.empty();
        Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
        return observableEmpty;
    }

    /* JADX INFO: renamed from: e4 */
    public static final Unit m62830e4(MarketRecentDealFragment marketRecentDealFragment, Throwable th2) {
        C44128b.m97264h(th2);
        List<? extends MarketRecentEntity> data = marketRecentDealFragment.m62851G3().getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        if (data.isEmpty()) {
            data = new ArrayList<>();
        }
        marketRecentDealFragment.m62817R3(data);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f4 */
    public static final void m62831f4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h4 */
    public static final TradeItemBean m62832h4(MarketRecentDealFragment marketRecentDealFragment) {
        TradeItemBean tradeItemBean;
        Bundle arguments = marketRecentDealFragment.getArguments();
        if (arguments != null) {
            tradeItemBean = (TradeItemBean) arguments.getParcelable("data");
        } else {
            tradeItemBean = null;
        }
        Intrinsics.checkNotNull(tradeItemBean);
        return tradeItemBean;
    }

    /* JADX INFO: renamed from: K3 */
    public final void m62854K3() {
        if (m62851G3().getData().isEmpty()) {
            m62851G3().removeAllHeaderView();
        } else if (m62851G3().getHeaderLayoutCount() <= 0) {
            m62851G3().addHeaderView(m62850F3());
        }
    }

    /* JADX INFO: renamed from: Q3 */
    public final void m62855Q3(MarketRecentEntity marketRecentEntity) {
        Object next;
        m62851G3().getData().add(0, marketRecentEntity);
        if (m62851G3().getData().size() >= this.f51100X) {
            m62851G3().getData().remove(m62851G3().getData().size() - 1);
        }
        m62854K3();
        Iterator<T> it = this.f51101Y.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                Integer type = ((MarketRecentTypeEntity) next).getType();
                if (type != null && type.intValue() == 1) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        MarketRecentTypeEntity marketRecentTypeEntity = (MarketRecentTypeEntity) next;
        if (marketRecentTypeEntity != null) {
            marketRecentTypeEntity.setInfo(m62851G3().getData());
        }
        if (m62851G3().getData().isEmpty() && !this.f51102Z) {
            showEmpty();
        } else {
            showContent();
        }
        m62853I3().notifyDataSetChanged();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        Observable map;
        super.onLoad();
        final String str = String.format("/market/match:%s", Arrays.copyOf(new Object[]{m62811J3().getSymbol()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        SpotMarketSocketAdapter spotMarketSocketAdapter = SpotMarketSocketAdapter.f28144a;
        if (spotMarketSocketAdapter.m32665b0()) {
            Request.Companion companion = Request.INSTANCE;
            C19406c c19406c = new C19406c(companion.subscribe(m62852H3().m82947o(this.f51100X, m62811J3().getSymbol()), new String[0]), companion.unsubscribe(m62852H3().m82947o(this.f51100X, m62811J3().getSymbol()), new String[0]), null, true, null, 20, null);
            final Function1 function1 = new Function1() { // from class: com.kubi.spot.quote.market.trade.j0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(MarketRecentDealFragment.m62818S3((Message) obj));
                }
            };
            Observable<Message> observableFilter = c19406c.filter(new Predicate() { // from class: com.kubi.spot.quote.market.trade.w
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return MarketRecentDealFragment.m62819T3(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: com.kubi.spot.quote.market.trade.x
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarketRecentDealFragment.m62820U3((Message) obj);
                }
            };
            ObservableSource map2 = observableFilter.map(new Function() { // from class: com.kubi.spot.quote.market.trade.y
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return MarketRecentDealFragment.m62821V3(function2, obj);
                }
            });
            String symbol = m62811J3().getSymbol();
            Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
            Observable observableM32619F = SpotMarketSocketAdapter.m32619F(spotMarketSocketAdapter, symbol, false, new Function0() { // from class: com.kubi.spot.quote.market.trade.z
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarketRecentDealFragment.m62822W3();
                }
            }, 2, null);
            final Function1 function3 = new Function1() { // from class: com.kubi.spot.quote.market.trade.a0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarketRecentDealFragment.m62823X3((SpotMatchPushEntity) obj);
                }
            };
            map = Observable.merge(map2, observableM32619F.map(new Function() { // from class: com.kubi.spot.quote.market.trade.b0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return MarketRecentDealFragment.m62824Y3(function3, obj);
                }
            }));
        } else {
            Request.Companion companion2 = Request.INSTANCE;
            C19406c c19406c2 = new C19406c(companion2.subscribe(m62852H3().m82947o(this.f51100X, m62811J3().getSymbol()), str), companion2.unsubscribe(m62852H3().m82947o(this.f51100X, m62811J3().getSymbol()), str), null, true, null, 20, null);
            final Function1 function4 = new Function1() { // from class: com.kubi.spot.quote.market.trade.c0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(MarketRecentDealFragment.m62825Z3(str, (Message) obj));
                }
            };
            Observable<Message> observableFilter2 = c19406c2.filter(new Predicate() { // from class: com.kubi.spot.quote.market.trade.d0
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return MarketRecentDealFragment.m62826a4(function4, obj);
                }
            });
            final Function1 function5 = new Function1() { // from class: com.kubi.spot.quote.market.trade.e0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarketRecentDealFragment.m62827b4((Message) obj);
                }
            };
            map = observableFilter2.map(new Function() { // from class: com.kubi.spot.quote.market.trade.k0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return MarketRecentDealFragment.m62828c4(function5, obj);
                }
            });
        }
        Intrinsics.checkNotNull(map);
        Observable observableObserveOn = FlowableCompatKt.m66394h(map).subscribeOn(Schedulers.m87969io()).observeOn(AndroidSchedulers.mainThread());
        Consumer consumer = new Consumer() { // from class: com.kubi.spot.quote.market.trade.l0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarketRecentDealFragment.m62829d4(this.f51170b, obj);
            }
        };
        final Function1 function6 = new Function1() { // from class: com.kubi.spot.quote.market.trade.m0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketRecentDealFragment.m62830e4(this.f51173b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.quote.market.trade.n0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarketRecentDealFragment.m62831f4(function6, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }
}
