package com.kubi.margin.market.recommend;

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
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.margin.entity.TickerEntity;
import com.kubi.margin.entity.WsMarketSnapshotEntity;
import com.kubi.margin.entity.WsMarketSnapshotWrapperEntity;
import com.kubi.margin.entity.WsQuotesEntity;
import com.kubi.margin.market.MarginMarketViewModel;
import com.kubi.margin.market.info.MarketCoinInfo;
import com.kubi.margin.market.info.MarketCoinInfoGrid;
import com.kubi.network.websocket.model.Message;
import com.kubi.network.websocket.model.Request;
import com.kubi.network.websocket.observable.C19406c;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.RadioGroupPlus;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27099x;
import com.kubi.utils.FlowableCompatKt;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import mr.C42597a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36904b0;
import p569qq.C43852m;
import p768xo.InterfaceC46307h;
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
import w00.C45681e;

/* JADX INFO: compiled from: MarginMarketRecommendFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J$\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u001a\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020%2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010,\u001a\u00020!H\u0016J\b\u0010-\u001a\u00020!H\u0016J\b\u0010.\u001a\u00020!H\u0002J\b\u0010/\u001a\u00020!H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R#\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001d\u0010\u001e¨\u00061"}, m90084d2 = {"Lcom/kubi/margin/market/recommend/MarginMarketRecommendFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "bmarginFragmentMarketRecommendBinding", "Lcom/kubi/margin/databinding/BmarginFragmentMarketRecommendBinding;", "getBmarginFragmentMarketRecommendBinding", "()Lcom/kubi/margin/databinding/BmarginFragmentMarketRecommendBinding;", "bmarginFragmentMarketRecommendBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mApi", "Lcom/kubi/margin/api/MarketApi;", "kotlin.jvm.PlatformType", "getMApi", "()Lcom/kubi/margin/api/MarketApi;", "mApi$delegate", "Lkotlin/Lazy;", "mTradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "getMTradeItemBean", "()Lcom/kubi/data/entity/TradeItemBean;", "mTradeItemBean$delegate", "mList", "", "Lcom/kubi/margin/market/recommend/MarginMarketRecommendEntity;", "mAdapter", "Lcom/kubi/margin/market/recommend/MarginMarketRecommendAdapter;", "mViewModel", "Lcom/kubi/margin/market/MarginMarketViewModel;", "getMViewModel", "()Lcom/kubi/margin/market/MarginMarketViewModel;", "mViewModel$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onLoad", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "initListener", "subscribe", "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginMarketRecommendFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginMarketRecommendFragment.kt\ncom/kubi/margin/market/recommend/MarginMarketRecommendFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Response.kt\ncom/kubi/network/websocket/model/Message\n+ 6 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,323:1\n147#2,16:324\n172#3,9:340\n1#4:349\n58#5,6:350\n64#5,2:357\n58#5,6:359\n64#5,2:366\n58#5,6:368\n64#5,2:375\n58#5,6:377\n64#5,2:384\n126#6:356\n126#6:365\n126#6:374\n126#6:383\n*S KotlinDebug\n*F\n+ 1 MarginMarketRecommendFragment.kt\ncom/kubi/margin/market/recommend/MarginMarketRecommendFragment\n*L\n59#1:324,16\n82#1:340,9\n245#1:350,6\n245#1:357,2\n246#1:359,6\n246#1:366,2\n294#1:368,6\n294#1:375,2\n295#1:377,6\n295#1:384,2\n245#1:356\n246#1:365\n294#1:374\n295#1:383\n*E\n"})
public final class MarginMarketRecommendFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f33413U = C45681e.m100799e(this, new Function1<MarginMarketRecommendFragment, C36904b0>() { // from class: com.kubi.margin.market.recommend.MarginMarketRecommendFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36904b0 invoke(@NotNull MarginMarketRecommendFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36904b0.m82677a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36904b0, Unit>() { // from class: com.kubi.margin.market.recommend.MarginMarketRecommendFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36904b0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36904b0 c36904b0) {
            invoke(c36904b0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f33414V = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.recommend.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginMarketRecommendFragment.m39187K3();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f33415W = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.recommend.s
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginMarketRecommendFragment.m39188L3(this.f33439b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final List<MarginMarketRecommendEntity> f33416X = new ArrayList();

    /* JADX INFO: renamed from: Y */
    public MarginMarketRecommendAdapter f33417Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f33418Z;

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ KProperty<Object>[] f33412b0 = {Reflection.property1(new PropertyReference1Impl(MarginMarketRecommendFragment.class, "bmarginFragmentMarketRecommendBinding", "getBmarginFragmentMarketRecommendBinding()Lcom/kubi/margin/databinding/BmarginFragmentMarketRecommendBinding;", 0))};

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final Companion f33411a0 = new Companion(null);

    /* JADX INFO: compiled from: MarginMarketRecommendFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/margin/market/recommend/MarginMarketRecommendFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/margin/market/recommend/MarginMarketRecommendFragment;", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MarginMarketRecommendFragment newInstance(@NotNull TradeItemBean tradeItemBean) {
            Intrinsics.checkNotNullParameter(tradeItemBean, "tradeItemBean");
            MarginMarketRecommendFragment marginMarketRecommendFragment = new MarginMarketRecommendFragment();
            marginMarketRecommendFragment.setArguments(new C27051h().m66721e("data", tradeItemBean).m66717a());
            return marginMarketRecommendFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.recommend.MarginMarketRecommendFragment$a */
    /* JADX INFO: compiled from: MarginMarketRecommendFragment.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/margin/market/recommend/MarginMarketRecommendFragment$onViewCreated$1$1", "Lcom/kubi/resources/widget/RadioGroupPlus$OnCheckedChangeListener;", "onCheckedChanged", "", "group", "Lcom/kubi/resources/widget/RadioGroupPlus;", "checkedId", "", "isChecked", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nMarginMarketRecommendFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginMarketRecommendFragment.kt\ncom/kubi/margin/market/recommend/MarginMarketRecommendFragment$onViewCreated$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,323:1\n774#2:324\n865#2,2:325\n*S KotlinDebug\n*F\n+ 1 MarginMarketRecommendFragment.kt\ncom/kubi/margin/market/recommend/MarginMarketRecommendFragment$onViewCreated$1$1\n*L\n121#1:324\n121#1:325,2\n*E\n"})
    public static final class C17948a implements RadioGroupPlus.InterfaceC22946c {
        public C17948a() {
        }

        @Override // com.kubi.resources.widget.RadioGroupPlus.InterfaceC22946c
        /* JADX INFO: renamed from: a */
        public void mo16018a(RadioGroupPlus radioGroupPlus, int i11, boolean z11) {
            String str;
            MarginMarketRecommendAdapter marginMarketRecommendAdapter = null;
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
                C43852m.m96590b("B4candle", "RecommendTab", str, TuplesKt.m90091to("symbol", MarginMarketRecommendFragment.this.m39183G3().getSymbol()));
            }
            List list = MarginMarketRecommendFragment.this.f33416X;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                MarginMarketRecommendEntity marginMarketRecommendEntity = (MarginMarketRecommendEntity) obj;
                if (i11 != R$id.rb_all) {
                    if (i11 == R$id.rb_activity) {
                        if (marginMarketRecommendEntity.getType() == 0) {
                        }
                    } else if (i11 == R$id.rb_robot) {
                        if ((marginMarketRecommendEntity.getType() != 1 || !C24129b.m58030b(SiteVisibleConfigKey.BotSpotGrid)) && (marginMarketRecommendEntity.getType() != 2 || !C24129b.m58030b(SiteVisibleConfigKey.BotFuturesContractGrid))) {
                        }
                    } else if (i11 == R$id.rb_earn) {
                        if (marginMarketRecommendEntity.getType() == 3) {
                        }
                    } else if (i11 != R$id.rb_otc || marginMarketRecommendEntity.getType() != 4) {
                    }
                }
                arrayList.add(obj);
            }
            MarginMarketRecommendAdapter marginMarketRecommendAdapter2 = MarginMarketRecommendFragment.this.f33417Y;
            if (marginMarketRecommendAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            } else {
                marginMarketRecommendAdapter = marginMarketRecommendAdapter2;
            }
            marginMarketRecommendAdapter.replaceData(arrayList);
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.recommend.MarginMarketRecommendFragment$b */
    /* JADX INFO: compiled from: MarginMarketRecommendFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17949b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f33420b;

        public C17949b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f33420b = function;
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
            return this.f33420b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f33420b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.recommend.MarginMarketRecommendFragment$c */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C17950c extends TypeToken<TickerEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.recommend.MarginMarketRecommendFragment$d */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C17951d extends TypeToken<WsQuotesEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.recommend.MarginMarketRecommendFragment$e */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C17952e extends TypeToken<MarketTicker> {
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.recommend.MarginMarketRecommendFragment$f */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C17953f extends TypeToken<WsMarketSnapshotWrapperEntity> {
    }

    /* JADX INFO: renamed from: F3 */
    private final InterfaceC46307h m39182F3() {
        return (InterfaceC46307h) this.f33414V.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G3 */
    public final TradeItemBean m39183G3() {
        return (TradeItemBean) this.f33415W.getValue();
    }

    /* JADX INFO: renamed from: H3 */
    private final MarginMarketViewModel m39184H3() {
        return (MarginMarketViewModel) this.f33418Z.getValue();
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m39186J3(MarginMarketRecommendFragment marginMarketRecommendFragment, C36904b0 c36904b0, MarketCoinInfo marketCoinInfo) {
        if (marketCoinInfo == null) {
            return Unit.INSTANCE;
        }
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(marginMarketRecommendFragment), null, null, new MarginMarketRecommendFragment$initListener$1$1$1(marketCoinInfo, c36904b0, marginMarketRecommendFragment, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M3 */
    public final void m39189M3() {
        Object next;
        Object next2;
        Iterator<T> it = this.f33416X.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((MarginMarketRecommendEntity) next).getType() != 1);
        final MarginMarketRecommendEntity marginMarketRecommendEntity = (MarginMarketRecommendEntity) next;
        if (marginMarketRecommendEntity != null) {
            MarketCoinInfoGrid grid = marginMarketRecommendEntity.getGrid();
            String symbol = grid != null ? grid.getSymbol() : null;
            final String strM66551u = DowngradeExKt.m66551u("/market/snapshot_app:%s", new Object[]{symbol}, null, 2, null);
            Request.Companion companion = Request.INSTANCE;
            C19406c c19406c = new C19406c(companion.subscribe(m39182F3().m102137u(symbol), strM66551u), companion.unsubscribe(m39182F3().m102137u(symbol), strM66551u), null, false, null, 28, null);
            final Function1 function1 = new Function1() { // from class: com.kubi.margin.market.recommend.u
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(MarginMarketRecommendFragment.m39201Y3(strM66551u, (Message) obj));
                }
            };
            Observable<Message> observableFilter = c19406c.filter(new Predicate() { // from class: com.kubi.margin.market.recommend.z
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return MarginMarketRecommendFragment.m39202Z3(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: com.kubi.margin.market.recommend.a0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginMarketRecommendFragment.m39203a4((Message) obj);
                }
            };
            Observable<R> map = observableFilter.map(new io.reactivex.functions.Function() { // from class: com.kubi.margin.market.recommend.l
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return MarginMarketRecommendFragment.m39190N3(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            Observable observableObserveOn = FlowableCompatKt.m66397k(map).subscribeOn(C42916f.m94127f()).observeOn(AndroidSchedulers.mainThread());
            Consumer consumer = new Consumer() { // from class: com.kubi.margin.market.recommend.m
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginMarketRecommendFragment.m39191O3(this.f33434b, marginMarketRecommendEntity, obj);
                }
            };
            final Function1 function3 = new Function1() { // from class: com.kubi.margin.market.recommend.n
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginMarketRecommendFragment.m39192P3((Throwable) obj);
                }
            };
            Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.market.recommend.o
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginMarketRecommendFragment.m39193Q3(function3, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, getVisibleDisposable());
        }
        Iterator<T> it2 = this.f33416X.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (((MarginMarketRecommendEntity) next2).getType() != 2);
        final MarginMarketRecommendEntity marginMarketRecommendEntity2 = (MarginMarketRecommendEntity) next2;
        if (marginMarketRecommendEntity2 != null) {
            MarketCoinInfoGrid grid2 = marginMarketRecommendEntity2.getGrid();
            String symbol2 = grid2 != null ? grid2.getSymbol() : null;
            final String strM66551u2 = DowngradeExKt.m66551u("/contractMarket/snapshotV2:%s", new Object[]{symbol2}, null, 2, null);
            Request.Companion companion2 = Request.INSTANCE;
            C19406c c19406c2 = new C19406c(companion2.subscribe(m39182F3().m102125i(C27041f.m66668h(symbol2)), strM66551u2), companion2.unsubscribe(m39182F3().m102125i(C27041f.m66668h(symbol2)), strM66551u2), null, false, null, 28, null);
            final Function1 function4 = new Function1() { // from class: com.kubi.margin.market.recommend.p
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(MarginMarketRecommendFragment.m39194R3(strM66551u2, (Message) obj));
                }
            };
            Observable<Message> observableFilter2 = c19406c2.filter(new Predicate() { // from class: com.kubi.margin.market.recommend.q
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return MarginMarketRecommendFragment.m39195S3(function4, obj);
                }
            });
            final Function1 function5 = new Function1() { // from class: com.kubi.margin.market.recommend.r
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginMarketRecommendFragment.m39196T3((Message) obj);
                }
            };
            Observable<R> map2 = observableFilter2.map(new io.reactivex.functions.Function() { // from class: com.kubi.margin.market.recommend.v
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return MarginMarketRecommendFragment.m39197U3(function5, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
            Observable observableObserveOn2 = FlowableCompatKt.m66397k(map2).subscribeOn(C42916f.m94127f()).observeOn(AndroidSchedulers.mainThread());
            Consumer consumer2 = new Consumer() { // from class: com.kubi.margin.market.recommend.w
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginMarketRecommendFragment.m39198V3(this.f33444b, marginMarketRecommendEntity2, obj);
                }
            };
            final Function1 function6 = new Function1() { // from class: com.kubi.margin.market.recommend.x
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginMarketRecommendFragment.m39199W3((Throwable) obj);
                }
            };
            Disposable disposableSubscribe2 = observableObserveOn2.subscribe(consumer2, new Consumer() { // from class: com.kubi.margin.market.recommend.y
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MarginMarketRecommendFragment.m39200X3(function6, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe2, getVisibleDisposable());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public static final Object m39190N3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: R3 */
    public static final boolean m39194R3(String str, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            return true;
        }
        return Intrinsics.areEqual(it.getSource(), "socket") && Intrinsics.areEqual(it.getTopic(), str);
    }

    /* JADX INFO: renamed from: S3 */
    public static final boolean m39195S3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: T3 */
    public static final Object m39196T3(Message it) {
        Parcelable parcelable;
        Intrinsics.checkNotNullParameter(it, "it");
        Object objM66914d = null;
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                try {
                    String data = it.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data, new C17950c().getType());
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
                    objM66914d = C27099x.m66914d(data2, new C17951d().getType());
                } catch (Throwable unused2) {
                }
            }
            parcelable = (Parcelable) objM66914d;
        }
        Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type kotlin.Any");
        return parcelable;
    }

    /* JADX INFO: renamed from: U3 */
    public static final Object m39197U3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public static final boolean m39201Y3(String str, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            return true;
        }
        return Intrinsics.areEqual(it.getSource(), "socket") && Intrinsics.areEqual(it.getTopic(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public static final boolean m39202Z3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public static final Object m39203a4(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objM66914d = null;
        try {
            if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
                if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                    String data = it.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data, new C17952e().getType());
                }
            } else if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                String data2 = it.getData();
                Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type kotlin.String");
                C27099x c27099x2 = C27099x.f54458a;
                objM66914d = C27099x.m66914d(data2, new C17953f().getType());
            }
        } catch (Throwable unused) {
        }
        Intrinsics.checkNotNull(objM66914d, "null cannot be cast to non-null type kotlin.Any");
        return objM66914d;
    }

    /* JADX INFO: renamed from: E3 */
    public final C36904b0 m39221E3() {
        return (C36904b0) this.f33413U.getValue(this, f33412b0[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bmargin_fragment_market_recommend, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36904b0 c36904b0M39221E3 = m39221E3();
        if (c36904b0M39221E3 != null) {
            c36904b0M39221E3.f81597i.setOnCheckedChangeListener(new C17948a());
            RecyclerView recyclerView = c36904b0M39221E3.f81596h;
            MarginMarketRecommendAdapter marginMarketRecommendAdapter = this.f33417Y;
            if (marginMarketRecommendAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                marginMarketRecommendAdapter = null;
            }
            recyclerView.setAdapter(marginMarketRecommendAdapter);
            BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        }
    }

    public MarginMarketRecommendFragment() {
        final Function0 function0 = null;
        this.f33418Z = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MarginMarketViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.margin.market.recommend.MarginMarketRecommendFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.kubi.margin.market.recommend.MarginMarketRecommendFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.margin.market.recommend.MarginMarketRecommendFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: I3 */
    private final void m39185I3() {
        final C36904b0 c36904b0M39221E3 = m39221E3();
        if (c36904b0M39221E3 != null) {
            m39184H3().m38821r().observe(getViewLifecycleOwner(), new C17949b(new Function1() { // from class: com.kubi.margin.market.recommend.t
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginMarketRecommendFragment.m39186J3(this.f33440b, c36904b0M39221E3, (MarketCoinInfo) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K3 */
    public static final InterfaceC46307h m39187K3() {
        return (InterfaceC46307h) C42597a.m93390f().create(InterfaceC46307h.class);
    }

    /* JADX INFO: renamed from: L3 */
    public static final TradeItemBean m39188L3(MarginMarketRecommendFragment marginMarketRecommendFragment) {
        TradeItemBean tradeItemBean;
        Bundle arguments = marginMarketRecommendFragment.getArguments();
        if (arguments != null && (tradeItemBean = (TradeItemBean) arguments.getParcelable("data")) != null) {
            return tradeItemBean;
        }
        return new TradeItemBean("BTC-USDT");
    }

    /* JADX INFO: renamed from: O3 */
    public static final void m39191O3(MarginMarketRecommendFragment marginMarketRecommendFragment, MarginMarketRecommendEntity marginMarketRecommendEntity, Object obj) {
        BigDecimal changeRate;
        BigDecimal lastTradedPrice;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        C36904b0 c36904b0M39221E3 = marginMarketRecommendFragment.m39221E3();
        if (c36904b0M39221E3 != null) {
            MarginMarketRecommendAdapter marginMarketRecommendAdapter = null;
            if (obj instanceof MarketTicker) {
                MarketCoinInfoGrid grid = marginMarketRecommendEntity.getGrid();
                if (grid != null) {
                    Double lastDealPrice = ((MarketTicker) obj).getLastDealPrice();
                    if (lastDealPrice != null) {
                        bigDecimal2 = new BigDecimal(String.valueOf(lastDealPrice.doubleValue()));
                    } else {
                        bigDecimal2 = null;
                    }
                    grid.setPrice(bigDecimal2);
                }
                MarketCoinInfoGrid grid2 = marginMarketRecommendEntity.getGrid();
                if (grid2 != null) {
                    Double changeRate2 = ((MarketTicker) obj).getChangeRate();
                    if (changeRate2 != null) {
                        bigDecimal = new BigDecimal(String.valueOf(changeRate2.doubleValue()));
                    } else {
                        bigDecimal = null;
                    }
                    grid2.setChangeRate(bigDecimal);
                }
                if (c36904b0M39221E3.f81597i.getF44016b() == R$id.rb_all || c36904b0M39221E3.f81597i.getF44016b() == R$id.rb_robot) {
                    MarginMarketRecommendAdapter marginMarketRecommendAdapter2 = marginMarketRecommendFragment.f33417Y;
                    if (marginMarketRecommendAdapter2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    } else {
                        marginMarketRecommendAdapter = marginMarketRecommendAdapter2;
                    }
                    marginMarketRecommendAdapter.notifyDataSetChanged();
                    return;
                }
                return;
            }
            if (obj instanceof WsMarketSnapshotWrapperEntity) {
                MarketCoinInfoGrid grid3 = marginMarketRecommendEntity.getGrid();
                if (grid3 != null) {
                    WsMarketSnapshotEntity data = ((WsMarketSnapshotWrapperEntity) obj).getData();
                    if (data != null) {
                        lastTradedPrice = data.getLastTradedPrice();
                    } else {
                        lastTradedPrice = null;
                    }
                    grid3.setPrice(lastTradedPrice);
                }
                MarketCoinInfoGrid grid4 = marginMarketRecommendEntity.getGrid();
                if (grid4 != null) {
                    WsMarketSnapshotEntity data2 = ((WsMarketSnapshotWrapperEntity) obj).getData();
                    if (data2 != null) {
                        changeRate = data2.getChangeRate();
                    } else {
                        changeRate = null;
                    }
                    grid4.setChangeRate(changeRate);
                }
                if (c36904b0M39221E3.f81597i.getF44016b() == R$id.rb_all || c36904b0M39221E3.f81597i.getF44016b() == R$id.rb_robot) {
                    MarginMarketRecommendAdapter marginMarketRecommendAdapter3 = marginMarketRecommendFragment.f33417Y;
                    if (marginMarketRecommendAdapter3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    } else {
                        marginMarketRecommendAdapter = marginMarketRecommendAdapter3;
                    }
                    marginMarketRecommendAdapter.notifyDataSetChanged();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public static final Unit m39192P3(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q3 */
    public static final void m39193Q3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V3 */
    public static final void m39198V3(MarginMarketRecommendFragment marginMarketRecommendFragment, MarginMarketRecommendEntity marginMarketRecommendEntity, Object obj) {
        C36904b0 c36904b0M39221E3 = marginMarketRecommendFragment.m39221E3();
        if (c36904b0M39221E3 != null) {
            MarginMarketRecommendAdapter marginMarketRecommendAdapter = null;
            if (obj instanceof TickerEntity) {
                MarketCoinInfoGrid grid = marginMarketRecommendEntity.getGrid();
                if (grid != null) {
                    grid.setPrice(((TickerEntity) obj).getPrice());
                }
                MarketCoinInfoGrid grid2 = marginMarketRecommendEntity.getGrid();
                if (grid2 != null) {
                    grid2.setChangeRate(((TickerEntity) obj).getPriceChgPct());
                }
                if (c36904b0M39221E3.f81597i.getF44016b() == R$id.rb_all || c36904b0M39221E3.f81597i.getF44016b() == R$id.rb_robot) {
                    MarginMarketRecommendAdapter marginMarketRecommendAdapter2 = marginMarketRecommendFragment.f33417Y;
                    if (marginMarketRecommendAdapter2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    } else {
                        marginMarketRecommendAdapter = marginMarketRecommendAdapter2;
                    }
                    marginMarketRecommendAdapter.notifyDataSetChanged();
                    return;
                }
                return;
            }
            if (obj instanceof WsQuotesEntity) {
                MarketCoinInfoGrid grid3 = marginMarketRecommendEntity.getGrid();
                if (grid3 != null) {
                    grid3.setPrice(((WsQuotesEntity) obj).getLastPrice());
                }
                MarketCoinInfoGrid grid4 = marginMarketRecommendEntity.getGrid();
                if (grid4 != null) {
                    grid4.setChangeRate(((WsQuotesEntity) obj).getPriceChgPct());
                }
                if (c36904b0M39221E3.f81597i.getF44016b() == R$id.rb_all || c36904b0M39221E3.f81597i.getF44016b() == R$id.rb_robot) {
                    MarginMarketRecommendAdapter marginMarketRecommendAdapter3 = marginMarketRecommendFragment.f33417Y;
                    if (marginMarketRecommendAdapter3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    } else {
                        marginMarketRecommendAdapter = marginMarketRecommendAdapter3;
                    }
                    marginMarketRecommendAdapter.notifyDataSetChanged();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public static final Unit m39199W3(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public static final void m39200X3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f33417Y = new MarginMarketRecommendAdapter(this, m39183G3(), new ArrayList());
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        m39185I3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m39189M3();
    }
}
