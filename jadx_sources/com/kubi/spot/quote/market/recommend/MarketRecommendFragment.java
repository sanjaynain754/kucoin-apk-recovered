package com.kubi.spot.quote.market.recommend;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.reflect.TypeToken;
import com.kubi.data.entity.MarketTicker;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.network.websocket.model.Message;
import com.kubi.network.websocket.model.Request;
import com.kubi.network.websocket.observable.C19406c;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.RadioGroupPlus;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.kubi.spot.entity.TickerEntity;
import com.kubi.spot.entity.WsMarketSnapshotWrapperEntity;
import com.kubi.spot.entity.WsQuotesEntity;
import com.kubi.spot.quote.market.KuCoinMarketViewModel;
import com.kubi.spot.quote.market.info.MarketCoinInfo;
import com.kubi.spot.quote.market.info.MarketCoinInfoGrid;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27099x;
import com.kubi.utils.FlowableCompatKt;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import e20.InterfaceC37053d;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.schedulers.Schedulers;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import t20.C44646j;
import w00.C45681e;

/* JADX INFO: compiled from: MarketRecommendFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J$\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u001a\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020%2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010,\u001a\u00020!H\u0016J\b\u0010-\u001a\u00020!H\u0016J\b\u0010.\u001a\u00020!H\u0002J\b\u0010/\u001a\u00020!H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R#\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001d\u0010\u001e¨\u00061"}, m90084d2 = {"Lcom/kubi/spot/quote/market/recommend/MarketRecommendFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/spot/databinding/BkucoinFragmentMarketRecommendBinding;", "getBinding", "()Lcom/kubi/spot/databinding/BkucoinFragmentMarketRecommendBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mApi", "Lcom/kubi/spot/api/MarketApi;", "kotlin.jvm.PlatformType", "getMApi", "()Lcom/kubi/spot/api/MarketApi;", "mApi$delegate", "Lkotlin/Lazy;", "mTradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "getMTradeItemBean", "()Lcom/kubi/data/entity/TradeItemBean;", "mTradeItemBean$delegate", "mList", "", "Lcom/kubi/spot/quote/market/recommend/MarketRecommendEntity;", "mAdapter", "Lcom/kubi/spot/quote/market/recommend/MarketRecommendAdapter;", "mViewModel", "Lcom/kubi/spot/quote/market/KuCoinMarketViewModel;", "getMViewModel", "()Lcom/kubi/spot/quote/market/KuCoinMarketViewModel;", "mViewModel$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onLoad", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "initListener", "subscribe", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketRecommendFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketRecommendFragment.kt\ncom/kubi/spot/quote/market/recommend/MarketRecommendFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Response.kt\ncom/kubi/network/websocket/model/Message\n+ 6 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,308:1\n147#2,16:309\n172#3,9:325\n1#4:334\n58#5,6:335\n64#5,2:342\n58#5,6:344\n64#5,2:351\n58#5,6:353\n64#5,2:360\n58#5,6:362\n64#5,2:369\n126#6:341\n126#6:350\n126#6:359\n126#6:368\n*S KotlinDebug\n*F\n+ 1 MarketRecommendFragment.kt\ncom/kubi/spot/quote/market/recommend/MarketRecommendFragment\n*L\n57#1:309,16\n76#1:325,9\n236#1:335,6\n236#1:342,2\n237#1:344,6\n237#1:351,2\n282#1:353,6\n282#1:360,2\n283#1:362,6\n283#1:369,2\n236#1:341\n237#1:350\n282#1:359\n283#1:368\n*E\n"})
public final class MarketRecommendFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f51034U = C45681e.m100799e(this, new Function1<MarketRecommendFragment, C44646j>() { // from class: com.kubi.spot.quote.market.recommend.MarketRecommendFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44646j invoke(@NotNull MarketRecommendFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44646j.m98768a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44646j, Unit>() { // from class: com.kubi.spot.quote.market.recommend.MarketRecommendFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44646j it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44646j c44646j) {
            invoke(c44646j);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f51035V = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.recommend.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketRecommendFragment.m62697L3();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f51036W = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.recommend.s
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketRecommendFragment.m62698M3(this.f51060b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final List<MarketRecommendEntity> f51037X = new ArrayList();

    /* JADX INFO: renamed from: Y */
    public MarketRecommendAdapter f51038Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f51039Z;

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ KProperty<Object>[] f51033b0 = {Reflection.property1(new PropertyReference1Impl(MarketRecommendFragment.class, "binding", "getBinding()Lcom/kubi/spot/databinding/BkucoinFragmentMarketRecommendBinding;", 0))};

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final Companion f51032a0 = new Companion(null);

    /* JADX INFO: compiled from: MarketRecommendFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/spot/quote/market/recommend/MarketRecommendFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/spot/quote/market/recommend/MarketRecommendFragment;", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MarketRecommendFragment newInstance(@NotNull TradeItemBean tradeItemBean) {
            Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
            MarketRecommendFragment marketRecommendFragment = new MarketRecommendFragment();
            marketRecommendFragment.setArguments(new C27051h().m66721e("data", tradeItemBean).m66717a());
            return marketRecommendFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.recommend.MarketRecommendFragment$a */
    /* JADX INFO: compiled from: MarketRecommendFragment.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/spot/quote/market/recommend/MarketRecommendFragment$onViewCreated$1", "Lcom/kubi/resources/widget/RadioGroupPlus$OnCheckedChangeListener;", "onCheckedChanged", "", "group", "Lcom/kubi/resources/widget/RadioGroupPlus;", "checkedId", "", "isChecked", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nMarketRecommendFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketRecommendFragment.kt\ncom/kubi/spot/quote/market/recommend/MarketRecommendFragment$onViewCreated$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,308:1\n774#2:309\n865#2,2:310\n*S KotlinDebug\n*F\n+ 1 MarketRecommendFragment.kt\ncom/kubi/spot/quote/market/recommend/MarketRecommendFragment$onViewCreated$1\n*L\n113#1:309\n113#1:310,2\n*E\n"})
    public static final class C25671a implements RadioGroupPlus.InterfaceC22946c {
        public C25671a() {
        }

        @Override // com.kubi.resources.widget.RadioGroupPlus.InterfaceC22946c
        /* JADX INFO: renamed from: a */
        public void mo16018a(RadioGroupPlus radioGroupPlus, int i11, boolean z11) {
            String str;
            MarketRecommendAdapter marketRecommendAdapter = null;
            if (i11 == R$id.rb_activity) {
                str = "1";
            } else if (i11 == R$id.rb_robot) {
                str = "2";
            } else if (i11 == R$id.rb_earn) {
                str = "3";
            } else {
                str = i11 == R$id.rb_otc ? "4" : null;
            }
            if (str != null) {
                C43852m.m96590b("B5candle", "RecommendTab", str, TuplesKt.m90091to("symbol", MarketRecommendFragment.this.m62693H3().getSymbol()));
            }
            List list = MarketRecommendFragment.this.f51037X;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                MarketRecommendEntity marketRecommendEntity = (MarketRecommendEntity) obj;
                if (i11 != R$id.rb_all) {
                    if (i11 == R$id.rb_activity) {
                        if (marketRecommendEntity.getType() == 0) {
                        }
                    } else if (i11 == R$id.rb_robot) {
                        if ((marketRecommendEntity.getType() != 1 || !C24129b.m58030b(SiteVisibleConfigKey.BotSpotGrid)) && (marketRecommendEntity.getType() != 2 || !C24129b.m58030b(SiteVisibleConfigKey.BotFuturesContractGrid))) {
                        }
                    } else if (i11 == R$id.rb_earn) {
                        if (marketRecommendEntity.getType() == 3) {
                        }
                    } else if (i11 != R$id.rb_otc || marketRecommendEntity.getType() != 4) {
                    }
                }
                arrayList.add(obj);
            }
            MarketRecommendAdapter marketRecommendAdapter2 = MarketRecommendFragment.this.f51038Y;
            if (marketRecommendAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            } else {
                marketRecommendAdapter = marketRecommendAdapter2;
            }
            marketRecommendAdapter.replaceData(arrayList);
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.recommend.MarketRecommendFragment$b */
    /* JADX INFO: compiled from: MarketRecommendFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25672b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f51041b;

        public C25672b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f51041b = function;
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
            return this.f51041b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f51041b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.recommend.MarketRecommendFragment$c */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C25673c extends TypeToken<TickerEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.recommend.MarketRecommendFragment$d */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C25674d extends TypeToken<WsQuotesEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.recommend.MarketRecommendFragment$e */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C25675e extends TypeToken<MarketTicker> {
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.recommend.MarketRecommendFragment$f */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C25676f extends TypeToken<WsMarketSnapshotWrapperEntity> {
    }

    /* JADX INFO: renamed from: G3 */
    private final InterfaceC37053d m62692G3() {
        return (InterfaceC37053d) this.f51035V.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H3 */
    public final TradeItemBean m62693H3() {
        return (TradeItemBean) this.f51036W.getValue();
    }

    /* JADX INFO: renamed from: I3 */
    private final KuCoinMarketViewModel m62694I3() {
        return (KuCoinMarketViewModel) this.f51039Z.getValue();
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m62696K3(MarketRecommendFragment marketRecommendFragment, MarketCoinInfo marketCoinInfo) {
        if (marketCoinInfo == null) {
            return Unit.INSTANCE;
        }
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(marketRecommendFragment), null, null, new MarketRecommendFragment$initListener$1$1(marketCoinInfo, marketRecommendFragment, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public final void m62699N3() {
        Object next;
        Object next2;
        Iterator<T> it = this.f51037X.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((MarketRecommendEntity) next).getType() != 1);
        final MarketRecommendEntity marketRecommendEntity = (MarketRecommendEntity) next;
        if (marketRecommendEntity != null) {
            MarketCoinInfoGrid grid = marketRecommendEntity.getGrid();
            String symbol = grid != null ? grid.getSymbol() : null;
            final String str = String.format("/market/snapshot_app:%s", Arrays.copyOf(new Object[]{symbol}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            Request.Companion companion = Request.INSTANCE;
            C19406c c19406c = new C19406c(companion.subscribe(m62692G3().m82953u(symbol), str), companion.unsubscribe(m62692G3().m82953u(symbol), str), null, false, null, 28, null);
            final Function1 function1 = new Function1() { // from class: com.kubi.spot.quote.market.recommend.u
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(MarketRecommendFragment.m62709X3(str, (Message) obj));
                }
            };
            Observable<Message> observableFilter = c19406c.filter(new Predicate() { // from class: com.kubi.spot.quote.market.recommend.z
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return MarketRecommendFragment.m62710Y3(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: com.kubi.spot.quote.market.recommend.a0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarketRecommendFragment.m62711Z3((Message) obj);
                }
            };
            Observable<R> map = observableFilter.map(new io.reactivex.functions.Function() { // from class: com.kubi.spot.quote.market.recommend.l
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return MarketRecommendFragment.m62712a4(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            Observable observableObserveOn = FlowableCompatKt.m66397k(map).subscribeOn(Schedulers.m87969io()).observeOn(AndroidSchedulers.mainThread());
            Consumer consumer = new Consumer() { // from class: com.kubi.spot.quote.market.recommend.m
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarketRecommendFragment.m62713b4(marketRecommendEntity, this, obj);
                }
            };
            final Function1 function3 = new Function1() { // from class: com.kubi.spot.quote.market.recommend.n
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarketRecommendFragment.m62700O3((Throwable) obj);
                }
            };
            Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.quote.market.recommend.o
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarketRecommendFragment.m62701P3(function3, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, getVisibleDisposable());
        }
        Iterator<T> it2 = this.f51037X.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (((MarketRecommendEntity) next2).getType() != 2);
        final MarketRecommendEntity marketRecommendEntity2 = (MarketRecommendEntity) next2;
        if (marketRecommendEntity2 != null) {
            MarketCoinInfoGrid grid2 = marketRecommendEntity2.getGrid();
            String symbol2 = grid2 != null ? grid2.getSymbol() : null;
            final String str2 = String.format("/contractMarket/snapshotV2:%s", Arrays.copyOf(new Object[]{symbol2}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            Request.Companion companion2 = Request.INSTANCE;
            C19406c c19406c2 = new C19406c(companion2.subscribe(m62692G3().m82941i(C27041f.m66668h(symbol2)), str2), companion2.unsubscribe(m62692G3().m82941i(C27041f.m66668h(symbol2)), str2), null, false, null, 28, null);
            final Function1 function4 = new Function1() { // from class: com.kubi.spot.quote.market.recommend.p
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(MarketRecommendFragment.m62702Q3(str2, (Message) obj));
                }
            };
            Observable<Message> observableFilter2 = c19406c2.filter(new Predicate() { // from class: com.kubi.spot.quote.market.recommend.q
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return MarketRecommendFragment.m62703R3(function4, obj);
                }
            });
            final Function1 function5 = new Function1() { // from class: com.kubi.spot.quote.market.recommend.r
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarketRecommendFragment.m62704S3((Message) obj);
                }
            };
            Observable<R> map2 = observableFilter2.map(new io.reactivex.functions.Function() { // from class: com.kubi.spot.quote.market.recommend.v
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return MarketRecommendFragment.m62705T3(function5, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
            Observable observableObserveOn2 = FlowableCompatKt.m66397k(map2).subscribeOn(Schedulers.m87969io()).observeOn(AndroidSchedulers.mainThread());
            Consumer consumer2 = new Consumer() { // from class: com.kubi.spot.quote.market.recommend.w
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarketRecommendFragment.m62706U3(marketRecommendEntity2, this, obj);
                }
            };
            final Function1 function6 = new Function1() { // from class: com.kubi.spot.quote.market.recommend.x
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarketRecommendFragment.m62707V3((Throwable) obj);
                }
            };
            Disposable disposableSubscribe2 = observableObserveOn2.subscribe(consumer2, new Consumer() { // from class: com.kubi.spot.quote.market.recommend.y
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarketRecommendFragment.m62708W3(function6, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe2, getVisibleDisposable());
        }
    }

    /* JADX INFO: renamed from: Q3 */
    public static final boolean m62702Q3(String str, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            return true;
        }
        return Intrinsics.areEqual(it.getSource(), "socket") && Intrinsics.areEqual(it.getTopic(), str);
    }

    /* JADX INFO: renamed from: R3 */
    public static final boolean m62703R3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: S3 */
    public static final Object m62704S3(Message it) {
        Parcelable parcelable;
        Intrinsics.checkNotNullParameter(it, "it");
        Object objM66914d = null;
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                try {
                    String data = it.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data, new C25673c().getType());
                } catch (Throwable unused) {
                }
            }
            parcelable = (Parcelable) objM66914d;
        } else {
            if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                try {
                    String data2 = it.getData();
                    Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x2 = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data2, new C25674d().getType());
                } catch (Throwable unused2) {
                }
            }
            parcelable = (Parcelable) objM66914d;
        }
        Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type kotlin.Any");
        return parcelable;
    }

    /* JADX INFO: renamed from: T3 */
    public static final Object m62705T3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: U3 */
    public static final void m62706U3(MarketRecommendEntity marketRecommendEntity, MarketRecommendFragment marketRecommendFragment, Object obj) {
        C44646j c44646jM62731F3;
        RadioGroupPlus radioGroupPlus;
        RadioGroupPlus radioGroupPlus2;
        C44646j c44646jM62731F4;
        RadioGroupPlus radioGroupPlus3;
        RadioGroupPlus radioGroupPlus4;
        MarketRecommendAdapter marketRecommendAdapter = null;
        if (obj instanceof TickerEntity) {
            MarketCoinInfoGrid grid = marketRecommendEntity.getGrid();
            if (grid != null) {
                grid.setPrice(((TickerEntity) obj).getPrice());
            }
            MarketCoinInfoGrid grid2 = marketRecommendEntity.getGrid();
            if (grid2 != null) {
                grid2.setChangeRate(((TickerEntity) obj).getPriceChgPct());
            }
            C44646j c44646jM62731F5 = marketRecommendFragment.m62731F3();
            if ((c44646jM62731F5 == null || (radioGroupPlus4 = c44646jM62731F5.f99144i) == null || radioGroupPlus4.getF44016b() != R$id.rb_all) && ((c44646jM62731F4 = marketRecommendFragment.m62731F3()) == null || (radioGroupPlus3 = c44646jM62731F4.f99144i) == null || radioGroupPlus3.getF44016b() != R$id.rb_robot)) {
                return;
            }
            MarketRecommendAdapter marketRecommendAdapter2 = marketRecommendFragment.f51038Y;
            if (marketRecommendAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            } else {
                marketRecommendAdapter = marketRecommendAdapter2;
            }
            marketRecommendAdapter.notifyDataSetChanged();
            return;
        }
        if (obj instanceof WsQuotesEntity) {
            MarketCoinInfoGrid grid3 = marketRecommendEntity.getGrid();
            if (grid3 != null) {
                grid3.setPrice(((WsQuotesEntity) obj).getLastPrice());
            }
            MarketCoinInfoGrid grid4 = marketRecommendEntity.getGrid();
            if (grid4 != null) {
                grid4.setChangeRate(((WsQuotesEntity) obj).getPriceChgPct());
            }
            C44646j c44646jM62731F6 = marketRecommendFragment.m62731F3();
            if ((c44646jM62731F6 == null || (radioGroupPlus2 = c44646jM62731F6.f99144i) == null || radioGroupPlus2.getF44016b() != R$id.rb_all) && ((c44646jM62731F3 = marketRecommendFragment.m62731F3()) == null || (radioGroupPlus = c44646jM62731F3.f99144i) == null || radioGroupPlus.getF44016b() != R$id.rb_robot)) {
                return;
            }
            MarketRecommendAdapter marketRecommendAdapter3 = marketRecommendFragment.f51038Y;
            if (marketRecommendAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            } else {
                marketRecommendAdapter = marketRecommendAdapter3;
            }
            marketRecommendAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: X3 */
    public static final boolean m62709X3(String str, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            return true;
        }
        return Intrinsics.areEqual(it.getSource(), "socket") && Intrinsics.areEqual(it.getTopic(), str);
    }

    /* JADX INFO: renamed from: Y3 */
    public static final boolean m62710Y3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: Z3 */
    public static final Object m62711Z3(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objM66914d = null;
        try {
            if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
                if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                    String data = it.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data, new C25675e().getType());
                }
            } else if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                String data2 = it.getData();
                Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type kotlin.String");
                C27099x c27099x2 = C27099x.f54458a;
                objM66914d = C27099x.m66914d(data2, new C25676f().getType());
            }
        } catch (Throwable unused) {
        }
        Intrinsics.checkNotNull(objM66914d, "null cannot be cast to non-null type kotlin.Any");
        return objM66914d;
    }

    /* JADX INFO: renamed from: a4 */
    public static final Object m62712a4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: b4 */
    public static final void m62713b4(MarketRecommendEntity marketRecommendEntity, MarketRecommendFragment marketRecommendFragment, Object obj) {
        C44646j c44646jM62731F3;
        RadioGroupPlus radioGroupPlus;
        RadioGroupPlus radioGroupPlus2;
        C44646j c44646jM62731F4;
        RadioGroupPlus radioGroupPlus3;
        RadioGroupPlus radioGroupPlus4;
        MarketRecommendAdapter marketRecommendAdapter = null;
        if (obj instanceof MarketTicker) {
            MarketCoinInfoGrid grid = marketRecommendEntity.getGrid();
            if (grid != null) {
                Double lastDealPrice = ((MarketTicker) obj).getLastDealPrice();
                grid.setPrice(lastDealPrice != null ? new BigDecimal(String.valueOf(lastDealPrice.doubleValue())) : null);
            }
            MarketCoinInfoGrid grid2 = marketRecommendEntity.getGrid();
            if (grid2 != null) {
                Double changeRate = ((MarketTicker) obj).getChangeRate();
                grid2.setChangeRate(changeRate != null ? new BigDecimal(String.valueOf(changeRate.doubleValue())) : null);
            }
            C44646j c44646jM62731F5 = marketRecommendFragment.m62731F3();
            if ((c44646jM62731F5 == null || (radioGroupPlus4 = c44646jM62731F5.f99144i) == null || radioGroupPlus4.getF44016b() != R$id.rb_all) && ((c44646jM62731F4 = marketRecommendFragment.m62731F3()) == null || (radioGroupPlus3 = c44646jM62731F4.f99144i) == null || radioGroupPlus3.getF44016b() != R$id.rb_robot)) {
                return;
            }
            MarketRecommendAdapter marketRecommendAdapter2 = marketRecommendFragment.f51038Y;
            if (marketRecommendAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            } else {
                marketRecommendAdapter = marketRecommendAdapter2;
            }
            marketRecommendAdapter.notifyDataSetChanged();
            return;
        }
        if (obj instanceof WsMarketSnapshotWrapperEntity) {
            MarketCoinInfoGrid grid3 = marketRecommendEntity.getGrid();
            if (grid3 != null) {
                WsMarketSnapshotEntity data = ((WsMarketSnapshotWrapperEntity) obj).getData();
                grid3.setPrice(data != null ? new BigDecimal(String.valueOf(data.getLastTradedPrice())) : null);
            }
            MarketCoinInfoGrid grid4 = marketRecommendEntity.getGrid();
            if (grid4 != null) {
                WsMarketSnapshotEntity data2 = ((WsMarketSnapshotWrapperEntity) obj).getData();
                grid4.setChangeRate(data2 != null ? new BigDecimal(String.valueOf(data2.getChangeRate())) : null);
            }
            C44646j c44646jM62731F6 = marketRecommendFragment.m62731F3();
            if ((c44646jM62731F6 == null || (radioGroupPlus2 = c44646jM62731F6.f99144i) == null || radioGroupPlus2.getF44016b() != R$id.rb_all) && ((c44646jM62731F3 = marketRecommendFragment.m62731F3()) == null || (radioGroupPlus = c44646jM62731F3.f99144i) == null || radioGroupPlus.getF44016b() != R$id.rb_robot)) {
                return;
            }
            MarketRecommendAdapter marketRecommendAdapter3 = marketRecommendFragment.f51038Y;
            if (marketRecommendAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            } else {
                marketRecommendAdapter = marketRecommendAdapter3;
            }
            marketRecommendAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: F3 */
    public final C44646j m62731F3() {
        return (C44646j) this.f51034U.getValue(this, f51033b0[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkucoin_fragment_market_recommend, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView;
        RadioGroupPlus radioGroupPlus;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C44646j c44646jM62731F3 = m62731F3();
        if (c44646jM62731F3 != null && (radioGroupPlus = c44646jM62731F3.f99144i) != null) {
            radioGroupPlus.setOnCheckedChangeListener(new C25671a());
        }
        C44646j c44646jM62731F4 = m62731F3();
        if (c44646jM62731F4 == null || (recyclerView = c44646jM62731F4.f99143h) == null) {
            return;
        }
        MarketRecommendAdapter marketRecommendAdapter = this.f51038Y;
        if (marketRecommendAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            marketRecommendAdapter = null;
        }
        recyclerView.setAdapter(marketRecommendAdapter);
    }

    public MarketRecommendFragment() {
        final Function0 function0 = null;
        this.f51039Z = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(KuCoinMarketViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.spot.quote.market.recommend.MarketRecommendFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore mViewModelStore = this.requireActivity().getMViewModelStore();
                Intrinsics.checkNotNullExpressionValue(mViewModelStore, "requireActivity().viewModelStore");
                return mViewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.spot.quote.market.recommend.MarketRecommendFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = function0;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.spot.quote.market.recommend.MarketRecommendFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: renamed from: J3 */
    private final void m62695J3() {
        m62694I3().m62350r().observe(getViewLifecycleOwner(), new C25672b(new Function1() { // from class: com.kubi.spot.quote.market.recommend.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketRecommendFragment.m62696K3(this.f51061b, (MarketCoinInfo) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L3 */
    public static final InterfaceC37053d m62697L3() {
        return (InterfaceC37053d) C42597a.m93390f().create(InterfaceC37053d.class);
    }

    /* JADX INFO: renamed from: M3 */
    public static final TradeItemBean m62698M3(MarketRecommendFragment marketRecommendFragment) {
        TradeItemBean tradeItemBean;
        Bundle arguments = marketRecommendFragment.getArguments();
        if (arguments != null && (tradeItemBean = (TradeItemBean) arguments.getParcelable("data")) != null) {
            return tradeItemBean;
        }
        return new TradeItemBean("BTC-USDT");
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m62700O3(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public static final void m62701P3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m62707V3(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W3 */
    public static final void m62708W3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f51038Y = new MarketRecommendAdapter(this, m62693H3(), new ArrayList());
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        m62695J3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m62699N3();
    }
}
