package com.kubi.spot.quote.coin;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5275i0;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.data.entity.MarketTicker;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.margin.api.IMarginService;
import com.kubi.network.websocket.model.Message;
import com.kubi.network.websocket.model.Request;
import com.kubi.network.websocket.observable.C19406c;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.spot.R$color;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$string;
import com.kubi.spot.entity.TickerEntity;
import com.kubi.spot.entity.WsMarketSnapshotWrapperEntity;
import com.kubi.spot.entity.WsQuotesEntity;
import com.kubi.spot.quote.market.info.CoinWrapEntity;
import com.kubi.spot.quote.market.info.MarketByCurrencyEntity;
import com.kubi.spot.service.SpotDepend;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.C27099x;
import com.kubi.utils.FlowableCompatKt;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.ClickCardReport;
import e20.InterfaceC37053d;
import f00.C37304a;
import g00.InterfaceC37754f;
import gf.C37886j;
import gf.C37890n;
import id.C38519a;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.schedulers.Schedulers;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import t20.C44644i;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: MarketPairsFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010%\u001a\u00020#H\u0016J\b\u0010&\u001a\u00020#H\u0016J\b\u0010'\u001a\u00020#H\u0002J\b\u0010(\u001a\u00020#H\u0002J\u001c\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020\u00182\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0018H\u0003J\u0010\u0010,\u001a\u00020#2\u0006\u0010+\u001a\u00020\u0018H\u0003J\u0010\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020\u0018H\u0003J:\u0010/\u001a\u00020#2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u0001012\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u0001042\b\u00106\u001a\u0004\u0018\u000107H\u0002J\u0012\u00108\u001a\u00020#2\b\u00106\u001a\u0004\u0018\u000107H\u0002J\b\u00109\u001a\u00020#H\u0002J\b\u0010:\u001a\u00020#H\u0002J\b\u0010;\u001a\u00020#H\u0002J\b\u0010<\u001a\u00020#H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R#\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0018`\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, m90084d2 = {"Lcom/kubi/spot/quote/coin/MarketPairsFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/spot/databinding/BkucoinFragmentMarketPairsBinding;", "getBinding", "()Lcom/kubi/spot/databinding/BkucoinFragmentMarketPairsBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mApi", "Lcom/kubi/spot/api/MarketApi;", "kotlin.jvm.PlatformType", "getMApi", "()Lcom/kubi/spot/api/MarketApi;", "mApi$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/kubi/spot/quote/coin/KuCoinCoinViewModel;", "getViewModel", "()Lcom/kubi/spot/quote/coin/KuCoinCoinViewModel;", "viewModel$delegate", "list", "Ljava/util/ArrayList;", "Lcom/kubi/spot/quote/market/info/MarketByCurrencyEntity;", "Lkotlin/collections/ArrayList;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onLoad", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "initListener", "initData", "showSpot", SearchCategory$Companion.SPOT, ViewProps.MARGIN, "showMargin", "showFuture", ClickCardReport.ReportData.CARD_TYPE_FUTURE, "setPriceTick", "priceView", "Landroid/widget/TextView;", "chgView", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "change", "symbol", "", "toMargin", "subscribe", "subscribeSpot", "subscribeMargin", "subscribeFuture", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketPairsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketPairsFragment.kt\ncom/kubi/spot/quote/coin/MarketPairsFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 6 Response.kt\ncom/kubi/network/websocket/model/Message\n+ 7 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,415:1\n147#2,16:416\n172#3,9:432\n1#4:441\n135#5,2:442\n58#6,6:444\n64#6,2:451\n58#6,6:453\n64#6,2:460\n58#6,6:462\n64#6,2:469\n58#6,6:471\n64#6,2:478\n58#6,6:480\n64#6,2:487\n58#6,6:489\n64#6,2:496\n126#7:450\n126#7:459\n126#7:468\n126#7:477\n126#7:486\n126#7:495\n*S KotlinDebug\n*F\n+ 1 MarketPairsFragment.kt\ncom/kubi/spot/quote/coin/MarketPairsFragment\n*L\n62#1:416,16\n67#1:432,9\n245#1:442,2\n282#1:444,6\n282#1:451,2\n283#1:453,6\n283#1:460,2\n334#1:462,6\n334#1:469,2\n335#1:471,6\n335#1:478,2\n385#1:480,6\n385#1:487,2\n386#1:489,6\n386#1:496,2\n282#1:450\n283#1:459\n334#1:468\n335#1:477\n385#1:486\n386#1:495\n*E\n"})
public final class MarketPairsFragment extends BaseFragment {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f50797Y = {Reflection.property1(new PropertyReference1Impl(MarketPairsFragment.class, "binding", "getBinding()Lcom/kubi/spot/databinding/BkucoinFragmentMarketPairsBinding;", 0))};

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f50800W;

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f50798U = C45681e.m100799e(this, new Function1<MarketPairsFragment, C44644i>() { // from class: com.kubi.spot.quote.coin.MarketPairsFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44644i invoke(@NotNull MarketPairsFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44644i.m98764a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44644i, Unit>() { // from class: com.kubi.spot.quote.coin.MarketPairsFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44644i it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44644i c44644i) {
            invoke(c44644i);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f50799V = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.coin.q0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketPairsFragment.m62241S3();
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final ArrayList<MarketByCurrencyEntity> f50801X = new ArrayList<>();

    /* JADX INFO: renamed from: com.kubi.spot.quote.coin.MarketPairsFragment$a */
    /* JADX INFO: compiled from: MarketPairsFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25473a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f50802b;

        public C25473a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f50802b = function;
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
            return this.f50802b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f50802b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.coin.MarketPairsFragment$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C25474b extends TypeToken<TickerEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.coin.MarketPairsFragment$c */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C25475c extends TypeToken<WsQuotesEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.coin.MarketPairsFragment$d */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C25476d extends TypeToken<MarketTicker> {
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.coin.MarketPairsFragment$e */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C25477e extends TypeToken<WsMarketSnapshotWrapperEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.coin.MarketPairsFragment$f */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C25478f extends TypeToken<MarketTicker> {
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.coin.MarketPairsFragment$g */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C25479g extends TypeToken<WsMarketSnapshotWrapperEntity> {
    }

    /* JADX INFO: renamed from: R3 */
    public static final Unit m62240R3(MarketPairsFragment marketPairsFragment, CoinWrapEntity coinWrapEntity) {
        List<MarketByCurrencyEntity> symbols = coinWrapEntity != null ? coinWrapEntity.getSymbols() : null;
        if (symbols == null || symbols.isEmpty()) {
            C27096v0 c27096v0 = new C27096v0();
            String string = marketPairsFragment.getString(R$string.coin_no_data);
            C27017c c27017c = C27017c.f54310a;
            C27096v0 c27096v0M66903c = c27096v0.m66903c(string, new ForegroundColorSpan(c27017c.m66512a(R$color.c_text60)), new AbsoluteSizeSpan(C5275i0.m6241f(14.0f))).append("\n\n").m66903c(marketPairsFragment.getString(R$string.coin_network_error), new ForegroundColorSpan(c27017c.m66512a(R$color.c_text20)), new AbsoluteSizeSpan(C5275i0.m6241f(12.0f)));
            Intrinsics.checkNotNullExpressionValue(c27096v0M66903c, "append(...)");
            BaseFragment.showEmptyView$default(marketPairsFragment, c27096v0M66903c, 0, (View.OnClickListener) null, 6, (Object) null);
        } else {
            marketPairsFragment.f50801X.clear();
            marketPairsFragment.f50801X.addAll(C27024b.m66560c(coinWrapEntity != null ? coinWrapEntity.getSymbols() : null));
            marketPairsFragment.m62238P3();
            marketPairsFragment.showContentView();
            marketPairsFragment.m62247c4();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A4 */
    public static final void m62222A4(MarketPairsFragment marketPairsFragment, String str, Object obj) {
        if (obj instanceof MarketTicker) {
            C44644i c44644iM62286M3 = marketPairsFragment.m62286M3();
            BaseTextView baseTextView = c44644iM62286M3 != null ? c44644iM62286M3.f99127s : null;
            C44644i c44644iM62286M4 = marketPairsFragment.m62286M3();
            BaseTextView baseTextView2 = c44644iM62286M4 != null ? c44644iM62286M4.f99124p : null;
            MarketTicker marketTicker = (MarketTicker) obj;
            Double lastDealPrice = marketTicker.getLastDealPrice();
            BigDecimal bigDecimal = lastDealPrice != null ? new BigDecimal(String.valueOf(lastDealPrice.doubleValue())) : null;
            Double changeRate = marketTicker.getChangeRate();
            marketPairsFragment.m62287T3(baseTextView, baseTextView2, bigDecimal, changeRate != null ? new BigDecimal(String.valueOf(changeRate.doubleValue())) : null, str);
            return;
        }
        if (obj instanceof WsMarketSnapshotWrapperEntity) {
            C44644i c44644iM62286M5 = marketPairsFragment.m62286M3();
            BaseTextView baseTextView3 = c44644iM62286M5 != null ? c44644iM62286M5.f99127s : null;
            C44644i c44644iM62286M6 = marketPairsFragment.m62286M3();
            BaseTextView baseTextView4 = c44644iM62286M6 != null ? c44644iM62286M6.f99124p : null;
            WsMarketSnapshotWrapperEntity wsMarketSnapshotWrapperEntity = (WsMarketSnapshotWrapperEntity) obj;
            WsMarketSnapshotEntity data = wsMarketSnapshotWrapperEntity.getData();
            BigDecimal bigDecimal2 = data != null ? new BigDecimal(String.valueOf(data.getLastTradedPrice())) : null;
            WsMarketSnapshotEntity data2 = wsMarketSnapshotWrapperEntity.getData();
            marketPairsFragment.m62287T3(baseTextView3, baseTextView4, bigDecimal2, data2 != null ? new BigDecimal(String.valueOf(data2.getChangeRate())) : null, str);
        }
    }

    /* JADX INFO: renamed from: N3 */
    private final InterfaceC37053d m62236N3() {
        return (InterfaceC37053d) this.f50799V.getValue();
    }

    /* JADX INFO: renamed from: O3 */
    private final KuCoinCoinViewModel m62237O3() {
        return (KuCoinCoinViewModel) this.f50800W.getValue();
    }

    /* JADX INFO: renamed from: P3 */
    private final void m62238P3() {
        Object next;
        Object next2;
        Object next3;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        ConstraintLayout constraintLayout3;
        ConstraintLayout constraintLayout4;
        ConstraintLayout constraintLayout5;
        ConstraintLayout constraintLayout6;
        ConstraintLayout constraintLayout7;
        ConstraintLayout constraintLayout8;
        ConstraintLayout constraintLayout9;
        ConstraintLayout constraintLayout10;
        ConstraintLayout constraintLayout11;
        MarketByCurrencyEntity marketByCurrencyEntity;
        MarketByCurrencyEntity marketByCurrencyEntity2;
        MarketByCurrencyEntity marketByCurrencyEntity3;
        Iterator<T> it = this.f50801X.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                marketByCurrencyEntity3 = (MarketByCurrencyEntity) next;
            }
        } while (!Intrinsics.areEqual(marketByCurrencyEntity3 != null ? marketByCurrencyEntity3.getCategory() : null, "SPOT"));
        MarketByCurrencyEntity marketByCurrencyEntity4 = (MarketByCurrencyEntity) next;
        Iterator<T> it2 = this.f50801X.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it2.next();
                marketByCurrencyEntity2 = (MarketByCurrencyEntity) next2;
            }
        } while (!Intrinsics.areEqual(marketByCurrencyEntity2 != null ? marketByCurrencyEntity2.getCategory() : null, "MARGIN"));
        MarketByCurrencyEntity marketByCurrencyEntity5 = (MarketByCurrencyEntity) next2;
        Iterator<T> it3 = this.f50801X.iterator();
        do {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            } else {
                next3 = it3.next();
                marketByCurrencyEntity = (MarketByCurrencyEntity) next3;
            }
        } while (!Intrinsics.areEqual(marketByCurrencyEntity != null ? marketByCurrencyEntity.getCategory() : null, "FUTURE"));
        MarketByCurrencyEntity marketByCurrencyEntity6 = (MarketByCurrencyEntity) next3;
        if (marketByCurrencyEntity4 == null) {
            C44644i c44644iM62286M3 = m62286M3();
            if (c44644iM62286M3 != null && (constraintLayout11 = c44644iM62286M3.f99112d) != null) {
                ViewExtKt.m66577h(constraintLayout11);
            }
            if (marketByCurrencyEntity5 == null) {
                C44644i c44644iM62286M4 = m62286M3();
                if (c44644iM62286M4 != null && (constraintLayout10 = c44644iM62286M4.f99111c) != null) {
                    ViewExtKt.m66577h(constraintLayout10);
                }
            } else if (C24129b.m58030b(SiteVisibleConfigKey.Margin)) {
                C44644i c44644iM62286M5 = m62286M3();
                if (c44644iM62286M5 != null && (constraintLayout9 = c44644iM62286M5.f99111c) != null) {
                    ViewExtKt.m66594y(constraintLayout9);
                }
                m62289W3(marketByCurrencyEntity5);
            } else {
                C44644i c44644iM62286M6 = m62286M3();
                if (c44644iM62286M6 != null && (constraintLayout8 = c44644iM62286M6.f99111c) != null) {
                    ViewExtKt.m66577h(constraintLayout8);
                }
            }
        } else {
            C44644i c44644iM62286M7 = m62286M3();
            if (c44644iM62286M7 != null && (constraintLayout5 = c44644iM62286M7.f99112d) != null) {
                ViewExtKt.m66594y(constraintLayout5);
            }
            if (marketByCurrencyEntity5 == null) {
                C44644i c44644iM62286M8 = m62286M3();
                if (c44644iM62286M8 != null && (constraintLayout4 = c44644iM62286M8.f99111c) != null) {
                    ViewExtKt.m66577h(constraintLayout4);
                }
                m62244Z3(this, marketByCurrencyEntity4, null, 2, null);
            } else if (Intrinsics.areEqual(marketByCurrencyEntity5.getSymbol(), marketByCurrencyEntity4.getSymbol())) {
                C44644i c44644iM62286M9 = m62286M3();
                if (c44644iM62286M9 != null && (constraintLayout3 = c44644iM62286M9.f99111c) != null) {
                    ViewExtKt.m66577h(constraintLayout3);
                }
                m62290Y3(marketByCurrencyEntity4, marketByCurrencyEntity5);
            } else {
                m62244Z3(this, marketByCurrencyEntity4, null, 2, null);
                if (C24129b.m58030b(SiteVisibleConfigKey.Margin)) {
                    C44644i c44644iM62286M10 = m62286M3();
                    if (c44644iM62286M10 != null && (constraintLayout2 = c44644iM62286M10.f99111c) != null) {
                        ViewExtKt.m66594y(constraintLayout2);
                    }
                    m62289W3(marketByCurrencyEntity5);
                } else {
                    C44644i c44644iM62286M11 = m62286M3();
                    if (c44644iM62286M11 != null && (constraintLayout = c44644iM62286M11.f99111c) != null) {
                        ViewExtKt.m66577h(constraintLayout);
                    }
                }
            }
        }
        if (marketByCurrencyEntity6 == null || !C24129b.m58030b(SiteVisibleConfigKey.Futures)) {
            C44644i c44644iM62286M12 = m62286M3();
            if (c44644iM62286M12 == null || (constraintLayout6 = c44644iM62286M12.f99110b) == null) {
                return;
            }
            ViewExtKt.m66577h(constraintLayout6);
            return;
        }
        C44644i c44644iM62286M13 = m62286M3();
        if (c44644iM62286M13 != null && (constraintLayout7 = c44644iM62286M13.f99110b) != null) {
            ViewExtKt.m66594y(constraintLayout7);
        }
        m62288U3(marketByCurrencyEntity6);
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m62244Z3(MarketPairsFragment marketPairsFragment, MarketByCurrencyEntity marketByCurrencyEntity, MarketByCurrencyEntity marketByCurrencyEntity2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            marketByCurrencyEntity2 = null;
        }
        marketPairsFragment.m62290Y3(marketByCurrencyEntity, marketByCurrencyEntity2);
    }

    /* JADX INFO: renamed from: g4 */
    public static final boolean m62250g4(String str, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            return true;
        }
        return Intrinsics.areEqual(it.getSource(), "socket") && Intrinsics.areEqual(it.getTopic(), str);
    }

    /* JADX INFO: renamed from: h4 */
    public static final boolean m62251h4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: i4 */
    public static final Object m62252i4(Message it) {
        Parcelable parcelable;
        Intrinsics.checkNotNullParameter(it, "it");
        Object objM66914d = null;
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                try {
                    String data = it.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data, new C25474b().getType());
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
                    objM66914d = C27099x.m66914d(data2, new C25475c().getType());
                } catch (Throwable unused2) {
                }
            }
            parcelable = (Parcelable) objM66914d;
        }
        Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type kotlin.Any");
        return parcelable;
    }

    /* JADX INFO: renamed from: j4 */
    public static final Object m62254j4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: k4 */
    public static final void m62256k4(MarketPairsFragment marketPairsFragment, String str, Object obj) {
        if (obj instanceof TickerEntity) {
            C44644i c44644iM62286M3 = marketPairsFragment.m62286M3();
            BaseTextView baseTextView = c44644iM62286M3 != null ? c44644iM62286M3.f99116h : null;
            C44644i c44644iM62286M4 = marketPairsFragment.m62286M3();
            TickerEntity tickerEntity = (TickerEntity) obj;
            marketPairsFragment.m62287T3(baseTextView, c44644iM62286M4 != null ? c44644iM62286M4.f99114f : null, tickerEntity.getPrice(), tickerEntity.getPriceChgPct(), str);
            return;
        }
        if (obj instanceof WsQuotesEntity) {
            C44644i c44644iM62286M5 = marketPairsFragment.m62286M3();
            BaseTextView baseTextView2 = c44644iM62286M5 != null ? c44644iM62286M5.f99116h : null;
            C44644i c44644iM62286M6 = marketPairsFragment.m62286M3();
            WsQuotesEntity wsQuotesEntity = (WsQuotesEntity) obj;
            marketPairsFragment.m62287T3(baseTextView2, c44644iM62286M6 != null ? c44644iM62286M6.f99114f : null, wsQuotesEntity.getLastPrice(), wsQuotesEntity.getPriceChgPct(), str);
        }
    }

    /* JADX INFO: renamed from: o4 */
    public static final boolean m62263o4(String str, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            return true;
        }
        return Intrinsics.areEqual(it.getSource(), "socket") && Intrinsics.areEqual(it.getTopic(), str);
    }

    /* JADX INFO: renamed from: p4 */
    public static final boolean m62265p4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: q4 */
    public static final Object m62267q4(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objM66914d = null;
        try {
            if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
                if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                    String data = it.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data, new C25476d().getType());
                }
            } else if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                String data2 = it.getData();
                Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type kotlin.String");
                C27099x c27099x2 = C27099x.f54458a;
                objM66914d = C27099x.m66914d(data2, new C25477e().getType());
            }
        } catch (Throwable unused) {
        }
        Intrinsics.checkNotNull(objM66914d, "null cannot be cast to non-null type kotlin.Any");
        return objM66914d;
    }

    /* JADX INFO: renamed from: r4 */
    public static final Object m62269r4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: s4 */
    public static final void m62271s4(MarketPairsFragment marketPairsFragment, String str, Object obj) {
        if (obj instanceof MarketTicker) {
            C44644i c44644iM62286M3 = marketPairsFragment.m62286M3();
            BaseTextView baseTextView = c44644iM62286M3 != null ? c44644iM62286M3.f99121m : null;
            C44644i c44644iM62286M4 = marketPairsFragment.m62286M3();
            BaseTextView baseTextView2 = c44644iM62286M4 != null ? c44644iM62286M4.f99119k : null;
            MarketTicker marketTicker = (MarketTicker) obj;
            Double lastDealPrice = marketTicker.getLastDealPrice();
            BigDecimal bigDecimal = lastDealPrice != null ? new BigDecimal(String.valueOf(lastDealPrice.doubleValue())) : null;
            Double changeRate = marketTicker.getChangeRate();
            marketPairsFragment.m62287T3(baseTextView, baseTextView2, bigDecimal, changeRate != null ? new BigDecimal(String.valueOf(changeRate.doubleValue())) : null, str);
            return;
        }
        if (obj instanceof WsMarketSnapshotWrapperEntity) {
            C44644i c44644iM62286M5 = marketPairsFragment.m62286M3();
            BaseTextView baseTextView3 = c44644iM62286M5 != null ? c44644iM62286M5.f99121m : null;
            C44644i c44644iM62286M6 = marketPairsFragment.m62286M3();
            BaseTextView baseTextView4 = c44644iM62286M6 != null ? c44644iM62286M6.f99119k : null;
            WsMarketSnapshotWrapperEntity wsMarketSnapshotWrapperEntity = (WsMarketSnapshotWrapperEntity) obj;
            WsMarketSnapshotEntity data = wsMarketSnapshotWrapperEntity.getData();
            BigDecimal bigDecimal2 = data != null ? new BigDecimal(String.valueOf(data.getLastTradedPrice())) : null;
            WsMarketSnapshotEntity data2 = wsMarketSnapshotWrapperEntity.getData();
            marketPairsFragment.m62287T3(baseTextView3, baseTextView4, bigDecimal2, data2 != null ? new BigDecimal(String.valueOf(data2.getChangeRate())) : null, str);
        }
    }

    /* JADX INFO: renamed from: w4 */
    public static final boolean m62278w4(String str, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            return true;
        }
        return Intrinsics.areEqual(it.getSource(), "socket") && Intrinsics.areEqual(it.getTopic(), str);
    }

    /* JADX INFO: renamed from: x4 */
    public static final boolean m62280x4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: y4 */
    public static final Object m62282y4(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objM66914d = null;
        try {
            if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
                if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                    String data = it.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data, new C25478f().getType());
                }
            } else if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                String data2 = it.getData();
                Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type kotlin.String");
                C27099x c27099x2 = C27099x.f54458a;
                objM66914d = C27099x.m66914d(data2, new C25479g().getType());
            }
        } catch (Throwable unused) {
        }
        Intrinsics.checkNotNull(objM66914d, "null cannot be cast to non-null type kotlin.Any");
        return objM66914d;
    }

    /* JADX INFO: renamed from: z4 */
    public static final Object m62284z4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: D4 */
    public final void m62285D4(String str) {
        C43852m.m96590b("B5CoinPage", "Margin", "1", TuplesKt.m90091to("Symbol", C27041f.m66668h(str)));
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(str);
        boolean zM66566d = C27025c.m66566d(symbolInfoEntityM85601B != null ? Boolean.valueOf(symbolInfoEntityM85601B.isMarginEnabled()) : null);
        boolean zM66566d2 = C27025c.m66566d(symbolInfoEntityM85601B != null ? Boolean.valueOf(symbolInfoEntityM85601B.isIsolatedMarginTradeEnabled()) : null);
        if (zM66566d && zM66566d2) {
            IMarginService.m37900d0(SpotDepend.f51244a.m63033c(), C27041f.m66668h(str), C46392a.m102322d(C38519a.f86479a.m87134i(), false), false, null, 12, null);
        } else if (zM66566d) {
            IMarginService.m37900d0(SpotDepend.f51244a.m63033c(), C27041f.m66668h(str), false, false, null, 12, null);
        } else {
            IMarginService.m37900d0(SpotDepend.f51244a.m63033c(), C27041f.m66668h(str), true, false, null, 12, null);
        }
    }

    /* JADX INFO: renamed from: M3 */
    public final C44644i m62286M3() {
        return (C44644i) this.f50798U.getValue(this, f50797Y[0]);
    }

    /* JADX INFO: renamed from: T3 */
    public final void m62287T3(TextView textView, TextView textView2, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str) {
        if (textView2 != null) {
            textView2.setTextColor(C22890g.m54279d(C27017c.f54310a.m66513b(), C27039d.m66647g(bigDecimal2), 0, 2, null));
        }
        if (textView != null) {
            textView.setText(C27041f.m66669i(bigDecimal != null ? C37886j.m85579c(bigDecimal, str, (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null) : null, "--"));
        }
        if (textView2 != null) {
            textView2.setText(C42180b.m92649n(bigDecimal2 != null ? C42180b.m92642g(bigDecimal2, null, null, 0, true, false, false, 55, null) : null));
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: U3 */
    public final void m62288U3(final MarketByCurrencyEntity marketByCurrencyEntity) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        C27096v0 c27096v0M33249T = IKuMexService.m33249T(SpotDepend.f51244a.m63032b(), C27041f.m66668h(marketByCurrencyEntity.getSymbol()), false, 2, null);
        C44644i c44644iM62286M3 = m62286M3();
        if (c44644iM62286M3 != null && (baseTextView3 = c44644iM62286M3.f99117i) != null) {
            baseTextView3.setText(c27096v0M33249T.toString());
        }
        C44644i c44644iM62286M4 = m62286M3();
        if (c44644iM62286M4 != null && (baseTextView2 = c44644iM62286M4.f99115g) != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(marketByCurrencyEntity.getMaxLeverage());
            sb2.append('x');
            baseTextView2.setText(sb2.toString());
        }
        C44644i c44644iM62286M5 = m62286M3();
        if (c44644iM62286M5 != null && (baseTextView = c44644iM62286M5.f99113e) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.spot.quote.coin.m0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarketPairsFragment.m62242V3(marketByCurrencyEntity);
                }
            }, 1, null);
        }
        C44644i c44644iM62286M6 = m62286M3();
        BaseTextView baseTextView4 = c44644iM62286M6 != null ? c44644iM62286M6.f99116h : null;
        C44644i c44644iM62286M7 = m62286M3();
        m62287T3(baseTextView4, c44644iM62286M7 != null ? c44644iM62286M7.f99114f : null, DowngradeExKt.m66536f(marketByCurrencyEntity.getPrice()), DowngradeExKt.m66536f(marketByCurrencyEntity.getChangeRate()), marketByCurrencyEntity.getSymbol());
    }

    /* JADX INFO: renamed from: f4 */
    public final void m62291f4() {
        Object obj;
        Iterator<T> it = this.f50801X.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            MarketByCurrencyEntity marketByCurrencyEntity = (MarketByCurrencyEntity) next;
            if (Intrinsics.areEqual(marketByCurrencyEntity != null ? marketByCurrencyEntity.getCategory() : null, "FUTURE")) {
                obj = next;
                break;
            }
        }
        MarketByCurrencyEntity marketByCurrencyEntity2 = (MarketByCurrencyEntity) obj;
        if (marketByCurrencyEntity2 == null) {
            return;
        }
        final String symbol = marketByCurrencyEntity2.getSymbol();
        final String str = String.format("/contractMarket/snapshotV2:%s", Arrays.copyOf(new Object[]{symbol}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Request.Companion companion = Request.INSTANCE;
        C19406c c19406c = new C19406c(companion.subscribe(m62236N3().m82941i(C27041f.m66668h(symbol)), str), companion.unsubscribe(m62236N3().m82941i(C27041f.m66668h(symbol)), str), null, false, null, 28, null);
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.quote.coin.r0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(MarketPairsFragment.m62250g4(str, (Message) obj2));
            }
        };
        Observable<Message> observableFilter = c19406c.filter(new Predicate() { // from class: com.kubi.spot.quote.coin.s0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj2) {
                return MarketPairsFragment.m62251h4(function1, obj2);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.quote.coin.t0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return MarketPairsFragment.m62252i4((Message) obj2);
            }
        };
        Observable<R> map = observableFilter.map(new io.reactivex.functions.Function() { // from class: com.kubi.spot.quote.coin.u0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj2) {
                return MarketPairsFragment.m62254j4(function2, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableObserveOn = FlowableCompatKt.m66397k(map).subscribeOn(Schedulers.m87969io()).observeOn(AndroidSchedulers.mainThread());
        Consumer consumer = new Consumer() { // from class: com.kubi.spot.quote.coin.v0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                MarketPairsFragment.m62256k4(this.f50868b, symbol, obj2);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.spot.quote.coin.w0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return MarketPairsFragment.m62258l4((Throwable) obj2);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.quote.coin.v
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                MarketPairsFragment.m62260m4(function3, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getVisibleDisposable());
    }

    /* JADX INFO: renamed from: n4 */
    public final void m62292n4() {
        Object obj;
        ConstraintLayout constraintLayout;
        Iterator<T> it = this.f50801X.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            MarketByCurrencyEntity marketByCurrencyEntity = (MarketByCurrencyEntity) next;
            if (Intrinsics.areEqual(marketByCurrencyEntity != null ? marketByCurrencyEntity.getCategory() : null, "MARGIN")) {
                obj = next;
                break;
            }
        }
        MarketByCurrencyEntity marketByCurrencyEntity2 = (MarketByCurrencyEntity) obj;
        if (marketByCurrencyEntity2 != null) {
            C44644i c44644iM62286M3 = m62286M3();
            if (c44644iM62286M3 == null || (constraintLayout = c44644iM62286M3.f99111c) == null || !ViewExtKt.m66579j(constraintLayout)) {
                final String symbol = marketByCurrencyEntity2.getSymbol();
                final String str = String.format("/market/snapshot_app:%s", Arrays.copyOf(new Object[]{symbol}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                Request.Companion companion = Request.INSTANCE;
                C19406c c19406c = new C19406c(companion.subscribe(m62236N3().m82953u(symbol), str), companion.unsubscribe(m62236N3().m82953u(symbol), str), null, false, null, 28, null);
                final Function1 function1 = new Function1() { // from class: com.kubi.spot.quote.coin.e0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(MarketPairsFragment.m62263o4(str, (Message) obj2));
                    }
                };
                Observable<Message> observableFilter = c19406c.filter(new Predicate() { // from class: com.kubi.spot.quote.coin.g0
                    @Override // io.reactivex.functions.Predicate
                    public final boolean test(Object obj2) {
                        return MarketPairsFragment.m62265p4(function1, obj2);
                    }
                });
                final Function1 function2 = new Function1() { // from class: com.kubi.spot.quote.coin.h0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return MarketPairsFragment.m62267q4((Message) obj2);
                    }
                };
                Observable<R> map = observableFilter.map(new io.reactivex.functions.Function() { // from class: com.kubi.spot.quote.coin.i0
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj2) {
                        return MarketPairsFragment.m62269r4(function2, obj2);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                Observable observableObserveOn = FlowableCompatKt.m66397k(map).subscribeOn(Schedulers.m87969io()).observeOn(AndroidSchedulers.mainThread());
                Consumer consumer = new Consumer() { // from class: com.kubi.spot.quote.coin.j0
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj2) {
                        MarketPairsFragment.m62271s4(this.f50840b, symbol, obj2);
                    }
                };
                final Function1 function3 = new Function1() { // from class: com.kubi.spot.quote.coin.k0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return MarketPairsFragment.m62273t4((Throwable) obj2);
                    }
                };
                Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.quote.coin.l0
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj2) {
                        MarketPairsFragment.m62275u4(function3, obj2);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
                DisposableKt.addTo(disposableSubscribe, getVisibleDisposable());
            }
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkucoin_fragment_market_pairs, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
    }

    /* JADX INFO: renamed from: v4 */
    public final void m62293v4() {
        Object obj;
        Iterator<T> it = this.f50801X.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            MarketByCurrencyEntity marketByCurrencyEntity = (MarketByCurrencyEntity) next;
            if (Intrinsics.areEqual(marketByCurrencyEntity != null ? marketByCurrencyEntity.getCategory() : null, "SPOT")) {
                obj = next;
                break;
            }
        }
        MarketByCurrencyEntity marketByCurrencyEntity2 = (MarketByCurrencyEntity) obj;
        if (marketByCurrencyEntity2 == null) {
            return;
        }
        final String symbol = marketByCurrencyEntity2.getSymbol();
        final String str = String.format("/market/snapshot_app:%s", Arrays.copyOf(new Object[]{symbol}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Request.Companion companion = Request.INSTANCE;
        C19406c c19406c = new C19406c(companion.subscribe(m62236N3().m82953u(symbol), str), companion.unsubscribe(m62236N3().m82953u(symbol), str), null, false, null, 28, null);
        final Function1 function1 = new Function1() { // from class: com.kubi.spot.quote.coin.x
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(MarketPairsFragment.m62278w4(str, (Message) obj2));
            }
        };
        Observable<Message> observableFilter = c19406c.filter(new Predicate() { // from class: com.kubi.spot.quote.coin.y
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj2) {
                return MarketPairsFragment.m62280x4(function1, obj2);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.spot.quote.coin.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return MarketPairsFragment.m62282y4((Message) obj2);
            }
        };
        Observable<R> map = observableFilter.map(new io.reactivex.functions.Function() { // from class: com.kubi.spot.quote.coin.a0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj2) {
                return MarketPairsFragment.m62284z4(function2, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableObserveOn = FlowableCompatKt.m66397k(map).subscribeOn(Schedulers.m87969io()).observeOn(AndroidSchedulers.mainThread());
        Consumer consumer = new Consumer() { // from class: com.kubi.spot.quote.coin.b0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                MarketPairsFragment.m62222A4(this.f50817b, symbol, obj2);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.spot.quote.coin.c0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return MarketPairsFragment.m62224B4((Throwable) obj2);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.spot.quote.coin.d0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                MarketPairsFragment.m62226C4(function3, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getVisibleDisposable());
    }

    public MarketPairsFragment() {
        final Function0 function0 = null;
        this.f50800W = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(KuCoinCoinViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.spot.quote.coin.MarketPairsFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.kubi.spot.quote.coin.MarketPairsFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.spot.quote.coin.MarketPairsFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: B4 */
    public static final Unit m62224B4(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public static final void m62226C4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q3 */
    private final void m62239Q3() {
        m62237O3().m62202r().observe(getViewLifecycleOwner(), new C25473a(new Function1() { // from class: com.kubi.spot.quote.coin.p0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketPairsFragment.m62240R3(this.f50856b, (CoinWrapEntity) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public static final InterfaceC37053d m62241S3() {
        return (InterfaceC37053d) C42597a.m93390f().create(InterfaceC37053d.class);
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m62242V3(MarketByCurrencyEntity marketByCurrencyEntity) {
        C43852m.m96590b("B5CoinPage", "Futures", "1", TuplesKt.m90091to("Symbol", C27041f.m66668h(marketByCurrencyEntity.getSymbol())));
        InterfaceC37754f.a.m85131c(C37304a.f82764a, marketByCurrencyEntity.getSymbol(), null, null, null, null, null, null, null, null, 510, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m62243X3(MarketPairsFragment marketPairsFragment, MarketByCurrencyEntity marketByCurrencyEntity) {
        marketPairsFragment.m62285D4(marketByCurrencyEntity.getSymbol());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m62245a4(MarketPairsFragment marketPairsFragment, MarketByCurrencyEntity marketByCurrencyEntity) {
        marketPairsFragment.m62285D4(marketByCurrencyEntity.getSymbol());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public static final Unit m62246b4(MarketByCurrencyEntity marketByCurrencyEntity) {
        C43852m.m96590b("B5CoinPage", "Spots", "1", TuplesKt.m90091to("Symbol", C27041f.m66668h(marketByCurrencyEntity.getSymbol())));
        InterfaceC37754f.a.m85140l(C37304a.f82764a, marketByCurrencyEntity.getSymbol(), Boolean.TRUE, null, null, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c4 */
    private final void m62247c4() {
        m62293v4();
        C24129b.m58033e(SiteVisibleConfigKey.Margin, new Function0() { // from class: com.kubi.spot.quote.coin.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketPairsFragment.m62248d4(this.f50865b);
            }
        });
        C24129b.m58033e(SiteVisibleConfigKey.Futures, new Function0() { // from class: com.kubi.spot.quote.coin.f0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketPairsFragment.m62249e4(this.f50829b);
            }
        });
    }

    /* JADX INFO: renamed from: d4 */
    public static final Unit m62248d4(MarketPairsFragment marketPairsFragment) {
        marketPairsFragment.m62292n4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e4 */
    public static final Unit m62249e4(MarketPairsFragment marketPairsFragment) {
        marketPairsFragment.m62291f4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    public static final Unit m62258l4(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public static final void m62260m4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m62273t4(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u4 */
    public static final void m62275u4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: W3 */
    public final void m62289W3(final MarketByCurrencyEntity marketByCurrencyEntity) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        C44644i c44644iM62286M3 = m62286M3();
        if (c44644iM62286M3 != null && (baseTextView4 = c44644iM62286M3.f99122n) != null) {
            baseTextView4.setText(marketByCurrencyEntity.getBaseCurrency() + '/' + marketByCurrencyEntity.getQuoteCurrency());
        }
        C44644i c44644iM62286M4 = m62286M3();
        if (c44644iM62286M4 != null && (baseTextView3 = c44644iM62286M4.f99120l) != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(marketByCurrencyEntity.getMaxLeverage());
            sb2.append('x');
            baseTextView3.setText(sb2.toString());
        }
        C44644i c44644iM62286M5 = m62286M3();
        if (c44644iM62286M5 != null && (baseTextView2 = c44644iM62286M5.f99118j) != null) {
            C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: com.kubi.spot.quote.coin.w
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarketPairsFragment.m62243X3(this.f50870b, marketByCurrencyEntity);
                }
            }, 1, null);
        }
        C44644i c44644iM62286M6 = m62286M3();
        BaseTextView baseTextView5 = null;
        if (c44644iM62286M6 != null) {
            baseTextView = c44644iM62286M6.f99121m;
        } else {
            baseTextView = null;
        }
        C44644i c44644iM62286M7 = m62286M3();
        if (c44644iM62286M7 != null) {
            baseTextView5 = c44644iM62286M7.f99119k;
        }
        m62287T3(baseTextView, baseTextView5, DowngradeExKt.m66536f(marketByCurrencyEntity.getPrice()), DowngradeExKt.m66536f(marketByCurrencyEntity.getChangeRate()), marketByCurrencyEntity.getSymbol());
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: Y3 */
    public final void m62290Y3(final MarketByCurrencyEntity marketByCurrencyEntity, final MarketByCurrencyEntity marketByCurrencyEntity2) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        BaseTextView baseTextView9;
        C44644i c44644iM62286M3 = m62286M3();
        if (c44644iM62286M3 != null && (baseTextView9 = c44644iM62286M3.f99128t) != null) {
            baseTextView9.setText(marketByCurrencyEntity.getBaseCurrency() + '/' + marketByCurrencyEntity.getQuoteCurrency());
        }
        if (marketByCurrencyEntity2 != null && C24129b.m58030b(SiteVisibleConfigKey.Margin)) {
            C44644i c44644iM62286M4 = m62286M3();
            if (c44644iM62286M4 != null && (baseTextView8 = c44644iM62286M4.f99125q) != null) {
                ViewExtKt.m66594y(baseTextView8);
            }
            C44644i c44644iM62286M5 = m62286M3();
            if (c44644iM62286M5 != null && (baseTextView7 = c44644iM62286M5.f99126r) != null) {
                ViewExtKt.m66594y(baseTextView7);
            }
            C44644i c44644iM62286M6 = m62286M3();
            if (c44644iM62286M6 != null && (baseTextView6 = c44644iM62286M6.f99125q) != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(marketByCurrencyEntity2.getMaxLeverage());
                sb2.append('x');
                baseTextView6.setText(sb2.toString());
            }
            C44644i c44644iM62286M7 = m62286M3();
            if (c44644iM62286M7 != null && (baseTextView5 = c44644iM62286M7.f99126r) != null) {
                C27046k.m66711z(baseTextView5, 0L, new Function0() { // from class: com.kubi.spot.quote.coin.n0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MarketPairsFragment.m62245a4(this.f50851b, marketByCurrencyEntity2);
                    }
                }, 1, null);
            }
        } else {
            C44644i c44644iM62286M8 = m62286M3();
            if (c44644iM62286M8 != null && (baseTextView2 = c44644iM62286M8.f99125q) != null) {
                ViewExtKt.m66577h(baseTextView2);
            }
            C44644i c44644iM62286M9 = m62286M3();
            if (c44644iM62286M9 != null && (baseTextView = c44644iM62286M9.f99126r) != null) {
                ViewExtKt.m66577h(baseTextView);
            }
        }
        C44644i c44644iM62286M10 = m62286M3();
        if (c44644iM62286M10 != null && (baseTextView4 = c44644iM62286M10.f99123o) != null) {
            C27046k.m66711z(baseTextView4, 0L, new Function0() { // from class: com.kubi.spot.quote.coin.o0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarketPairsFragment.m62246b4(marketByCurrencyEntity);
                }
            }, 1, null);
        }
        C44644i c44644iM62286M11 = m62286M3();
        BaseTextView baseTextView10 = null;
        if (c44644iM62286M11 != null) {
            baseTextView3 = c44644iM62286M11.f99127s;
        } else {
            baseTextView3 = null;
        }
        C44644i c44644iM62286M12 = m62286M3();
        if (c44644iM62286M12 != null) {
            baseTextView10 = c44644iM62286M12.f99124p;
        }
        m62287T3(baseTextView3, baseTextView10, DowngradeExKt.m66536f(marketByCurrencyEntity.getPrice()), DowngradeExKt.m66536f(marketByCurrencyEntity.getChangeRate()), marketByCurrencyEntity.getSymbol());
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        m62239Q3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m62247c4();
    }
}
