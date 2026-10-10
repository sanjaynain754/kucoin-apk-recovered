package com.kubi.futures.data.market;

import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.app.FrameMetricsAggregator;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.futures.C13228l;
import com.kubi.kumex.data.market.model.AvailableTradeAreaEntity;
import com.kubi.kumex.data.market.model.FundingRateEntity;
import com.kubi.kumex.data.market.model.MarkPriceEntity;
import com.kubi.kumex.data.market.model.MexCurrencyIconUrlEntity;
import com.kubi.kumex.data.market.model.PriceAggregationEntity;
import com.kubi.kumex.data.market.model.PriceEntity;
import com.kubi.kumex.data.market.model.PricesSymbolsReqInfo;
import com.kubi.kumex.data.market.model.QuotesEntity;
import com.kubi.kumex.data.market.model.RecentDealEntity;
import com.kubi.kumex.data.market.model.TickerEntity;
import com.kubi.kumex.data.market.model.WsPriceEntity;
import com.kubi.kumex.data.market.model.WsQuotesEntity;
import com.kubi.kumex.logic.book.BookEntity;
import com.kubi.kumex.market.p091v2.coinInfo.entity.MarketCoinInfo;
import com.kubi.kumex.market.p091v2.coinInfo.entity.TagEntity;
import com.kubi.kumex.utils.Log;
import com.kubi.network.restful.C19321b;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.network.websocket.model.Message;
import com.kubi.network.websocket.observable.C19406c;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.utils.C27099x;
import com.kubi.utils.FlowableCompatKt;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import er.C37237b;
import fi.C37500b;
import gr.C38000b;
import gr.C38005g;
import gr.C38006h;
import hr.C38293f;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.rx2.RxConvertKt;
import mr.C42597a;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p836zl.C46894j;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.TypeIntrinsics;
import p852kotlin.text.StringsKt;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import y70.C46392a;

/* JADX INFO: compiled from: MarketServiceImpl.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u00100\u001a\u000201H\u0016J\"\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\u001b032\f\u00105\u001a\b\u0012\u0004\u0012\u0002010\u001bH\u0016J\u0010\u00106\u001a\u0002072\u0006\u00100\u001a\u000201H\u0016J\u0010\u00108\u001a\u0002092\u0006\u00100\u001a\u000201H\u0016J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u0002070.2\u0006\u00100\u001a\u000201H\u0016J\u0016\u0010;\u001a\b\u0012\u0004\u0012\u00020<0.2\u0006\u00100\u001a\u000201H\u0016J,\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0\u001b0.2\b\u0010?\u001a\u0004\u0018\u0001012\f\u0010@\u001a\b\u0012\u0004\u0012\u00020>0\u001bH\u0016J\u0012\u0010A\u001a\u0004\u0018\u0001012\u0006\u0010B\u001a\u000201H\u0016J(\u0010C\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010\u001b2\b\u0010?\u001a\u0004\u0018\u0001012\f\u0010@\u001a\b\u0012\u0004\u0012\u00020>0\u001bH\u0002J\u001a\u0010E\u001a\u00020D2\b\u0010?\u001a\u0004\u0018\u0001012\u0006\u00105\u001a\u000201H\u0002J\u0012\u0010F\u001a\u0002092\b\u0010?\u001a\u0004\u0018\u000101H\u0002J\u001e\u0010G\u001a\b\u0012\u0004\u0012\u00020H0.2\u0006\u00100\u001a\u0002012\u0006\u0010I\u001a\u00020JH\u0016J$\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0\u001b0.2\u0006\u00100\u001a\u0002012\u0006\u0010M\u001a\u00020JH\u0016J\u0012\u0010N\u001a\u0004\u0018\u00010<2\u0006\u00100\u001a\u000201H\u0016J\u001c\u0010O\u001a\b\u0012\u0004\u0012\u00020P0.2\f\u00105\u001a\b\u0012\u0004\u0012\u0002010\u001bH\u0016JL\u0010Q\u001a\b\u0012\u0004\u0012\u00020D0\u001b2\u0006\u0010R\u001a\u00020J2\f\u00105\u001a\b\u0012\u0004\u0012\u0002010\u001b2\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u0002010T2\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u0002090TH\u0002J\u0018\u0010E\u001a\u00020D2\u0006\u0010S\u001a\u0002012\u0006\u0010U\u001a\u000209H\u0002J\"\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020X0\u001b0W2\u0006\u0010Y\u001a\u00020ZH\u0096@¢\u0006\u0002\u0010[J$\u0010\\\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0\u001b0]0.2\b\u00105\u001a\u0004\u0018\u000101H\u0016J\u001c\u0010^\u001a\b\u0012\u0004\u0012\u00020X0\u001b2\u0006\u0010Y\u001a\u00020ZH\u0096@¢\u0006\u0002\u0010[J\u001e\u0010_\u001a\b\u0012\u0004\u0012\u00020>0\u001b2\b\u0010?\u001a\u0004\u0018\u000101H\u0096@¢\u0006\u0002\u0010`J\b\u0010a\u001a\u00020\u001cH\u0002J/\u0010b\u001a\u001e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u0002010cj\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000201`d2\b\b\u0001\u00100\u001a\u000201H\u0097\u0001J\u0015\u0010e\u001a\u0004\u0018\u00010f2\b\b\u0001\u00100\u001a\u000201H\u0097\u0001J\u001f\u0010g\u001a\u0004\u0018\u00010h2\b\b\u0001\u0010i\u001a\u0002012\b\b\u0001\u0010j\u001a\u000201H\u0097\u0001J=\u0010k\u001a\u0004\u0018\u00010l2\b\b\u0001\u0010B\u001a\u0002012\b\b\u0001\u00100\u001a\u0002012\b\b\u0001\u0010m\u001a\u0002012\b\b\u0001\u0010n\u001a\u0002012\b\b\u0001\u0010o\u001a\u000201H\u0097\u0001J)\u0010p\u001a\u0016\u0012\u0004\u0012\u00020r\u0018\u00010qj\n\u0012\u0004\u0012\u00020r\u0018\u0001`s2\n\b\u0001\u00100\u001a\u0004\u0018\u000101H\u0097\u0001R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR#\u0010\r\u001a\n \u000e*\u0004\u0018\u00010\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R#\u0010\u0012\u001a\n \u000e*\u0004\u0018\u00010\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0013\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u0017\u0010\u0018R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\f\u001a\u0004\b\"\u0010#R\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\f\u001a\u0004\b&\u0010#R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\f\u001a\u0004\b*\u0010+¨\u0006t"}, m90084d2 = {"Lcom/kubi/futures/data/market/MarketServiceImpl;", "Lcom/kubi/futures/data/market/IMarketService;", "Lcom/kubi/futures/data/market/IMarketApi;", "marketApi", "<init>", "(Lcom/kubi/futures/data/market/IMarketApi;)V", "()V", "marketSocket", "Lcom/kubi/futures/data/market/IMarketSocket;", "getMarketSocket", "()Lcom/kubi/futures/data/market/IMarketSocket;", "marketSocket$delegate", "Lkotlin/Lazy;", "api", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/futures/data/market/IMarketApi;", "api$delegate", "defaultApi", "getDefaultApi", "defaultApi$delegate", "contractTradeJsonMarketSocket", "Lcom/kubi/futures/data/market/ContractTradeJsonMarketSocket;", "getContractTradeJsonMarketSocket", "()Lcom/kubi/futures/data/market/ContractTradeJsonMarketSocket;", "contractTradeJsonMarketSocket$delegate", "contractTradeMarketSockets", "", "Lcom/kubi/futures/data/market/ContractTradeMarketSocket;", "getContractTradeMarketSockets", "()Ljava/util/List;", "contractTradeMarketSockets$delegate", "socketApi", "Lcom/kubi/futures/data/market/IMarketSocketApi;", "getSocketApi", "()Lcom/kubi/futures/data/market/IMarketSocketApi;", "socketApi$delegate", "socketFlowApi", "getSocketFlowApi", "socketFlowApi$delegate", "bindingRequest", "Lcom/kubi/futures/data/market/MarketBindingRequest;", "getBindingRequest", "()Lcom/kubi/futures/data/market/MarketBindingRequest;", "bindingRequest$delegate", "observeFundingRate", "Lio/reactivex/Observable;", "Lcom/kubi/kumex/data/market/model/FundingRateEntity;", "symbol", "", "observePrices", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/kumex/data/market/model/PriceAggregationEntity;", "symbols", "fetchPrice", "Lcom/kubi/kumex/data/market/model/PriceEntity;", "getTicker", "Lokhttp3/Request;", "observePrice", "observeTicker", "Lcom/kubi/kumex/data/market/model/TickerEntity;", "observeQuotesList", "Lcom/kubi/kumex/data/market/model/QuotesEntity;", "tradingArea", "quotes", "getMexCurrencyIconUrl", FirebaseAnalytics.Param.CURRENCY, "generateCompositeObservable", "Lcom/kubi/network/websocket/observable/CompositeObservable;", "doGenerateCompositeObservable", "getRecommendOrOtherRequest", "observeBook", "Lcom/kubi/kumex/logic/book/BookEntity;", "precision", "", "observeDeal", "Lcom/kubi/kumex/data/market/model/RecentDealEntity;", TUIConstants.TUIContact.LIMIT, "fetchTicker", "observeMarkPrices", "", "createCompositeObservables", JPushConstants.Geofence.KEY_INTERVAL, "topic", "Lkotlin/Function1;", "request", "fetchTradingArea", "Lcom/kubi/network/retrofit/utils/RetrofitResult;", "Lcom/kubi/kumex/data/market/model/AvailableTradeAreaEntity;", "isRobot", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchQuotesListBySymbolsForDistribution", "Lcom/kubi/sdk/base/entity/BaseEntity;", "getTradingAreaFromCache", "fetchQuotesListResult", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currentContractTradeMarketSocket", "fetchContractMaxMinPrice", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "fetchMexCurrencyIconUrl", "Lcom/kubi/kumex/data/market/model/MexCurrencyIconUrlEntity;", "getDiscoverDetailTags", "Lcom/kubi/kumex/market/v2/coinInfo/entity/TagEntity;", "item", "type", "getMarketCoinInfo", "Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;", "legalCurrency", "lang", "source", "getSymbolsInfo", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/SymbolInfoEntity;", "Lkotlin/collections/ArrayList;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketServiceImpl.kt\ncom/kubi/futures/data/market/MarketServiceImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 7 Response.kt\ncom/kubi/network/websocket/model/Message\n+ 8 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,467:1\n1563#2:468\n1634#2,2:469\n1636#2:476\n230#2,2:479\n49#3:471\n51#3:475\n46#4:472\n51#4:474\n105#5:473\n172#6:477\n172#6:478\n58#7,6:481\n64#7,2:488\n58#7,6:490\n64#7,2:497\n58#7,6:499\n64#7,2:506\n58#7,6:508\n64#7,2:515\n58#7,6:517\n64#7,2:524\n58#7,6:526\n64#7,2:533\n58#7,6:535\n64#7,2:542\n58#7,6:544\n64#7,2:551\n126#8:487\n126#8:496\n126#8:505\n126#8:514\n126#8:523\n126#8:532\n126#8:541\n126#8:550\n*S KotlinDebug\n*F\n+ 1 MarketServiceImpl.kt\ncom/kubi/futures/data/market/MarketServiceImpl\n*L\n138#1:468\n138#1:469,2\n138#1:476\n465#1:479,2\n147#1:471\n147#1:475\n147#1:472\n147#1:474\n147#1:473\n453#1:477\n455#1:478\n189#1:481,6\n189#1:488,2\n191#1:490,6\n191#1:497,2\n229#1:499,6\n229#1:506,2\n231#1:508,6\n231#1:515,2\n336#1:517,6\n336#1:524,2\n338#1:526,6\n338#1:533,2\n378#1:535,6\n378#1:542,2\n380#1:544,6\n380#1:551,2\n189#1:487\n191#1:496\n229#1:505\n231#1:514\n336#1:523\n338#1:532\n378#1:541\n380#1:550\n*E\n"})
public final class MarketServiceImpl implements IMarketService, IMarketApi {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final IMarketApi f22686a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f22687b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f22688c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f22689d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f22690e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Lazy f22691f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Lazy f22692g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final Lazy f22693h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Lazy f22694i;

    /* JADX INFO: renamed from: com.kubi.futures.data.market.MarketServiceImpl$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C12946a extends TypeToken<List<? extends RecentDealEntity>> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.data.market.MarketServiceImpl$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C12947b extends TypeToken<RecentDealEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.data.market.MarketServiceImpl$c */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C12948c extends TypeToken<List<? extends MarkPriceEntity>> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.data.market.MarketServiceImpl$d */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C12949d extends TypeToken<MarkPriceEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.data.market.MarketServiceImpl$e */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C12950e extends TypeToken<PriceEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.data.market.MarketServiceImpl$f */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C12951f extends TypeToken<WsPriceEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.data.market.MarketServiceImpl$g */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C12952g extends TypeToken<List<? extends QuotesEntity>> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.data.market.MarketServiceImpl$h */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C12953h extends TypeToken<WsQuotesEntity> {
    }

    public MarketServiceImpl(@NotNull IMarketApi marketApi) {
        Intrinsics.checkNotNullParameter(marketApi, "marketApi");
        this.f22686a = marketApi;
        this.f22687b = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.data.market.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketServiceImpl.m24726C0();
            }
        });
        this.f22688c = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.data.market.l0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketServiceImpl.m24791j0();
            }
        });
        this.f22689d = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.data.market.w0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketServiceImpl.m24795p0();
            }
        });
        this.f22690e = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.data.market.f1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketServiceImpl.m24793l0(this.f22713b);
            }
        });
        this.f22691f = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.data.market.g1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketServiceImpl.m24794m0(this.f22716b);
            }
        });
        this.f22692g = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.data.market.h1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketServiceImpl.m24788h1();
            }
        });
        this.f22693h = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.data.market.i1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketServiceImpl.m24790i1();
            }
        });
        this.f22694i = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.data.market.j1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketServiceImpl.m24792k0();
            }
        });
    }

    @Override // com.kubi.futures.data.market.IMarketService
    @NotNull
    /* JADX INFO: renamed from: u */
    public InterfaceC41634e<List<PriceAggregationEntity>> mo24824u(@NotNull List<String> symbols) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        if (symbols.isEmpty()) {
            return C41636g.m90879C();
        }
        List<List> listChunked = CollectionsKt.chunked(symbols, 50);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listChunked, 10));
        for (List list : listChunked) {
            String strM66551u = DowngradeExKt.m66551u("/contractMarket/aggregation:%s", new Object[]{CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null)}, null, 2, null);
            C38293f<List<PriceAggregationEntity>> c38293fM24871c = m24825u0().m24871c(new PricesSymbolsReqInfo(list));
            final InterfaceC41634e interfaceC41634eM90894R = C41636g.m90894R(IMarketSocketApi.m24864c(m24800B0(), strM66551u, c38293fM24871c, null, 4, null), c38293fM24871c);
            arrayList.add(new InterfaceC41634e<List<? extends PriceAggregationEntity>>() { // from class: com.kubi.futures.data.market.MarketServiceImpl$observePrices$lambda$12$$inlined$map$1

                /* JADX INFO: renamed from: com.kubi.futures.data.market.MarketServiceImpl$observePrices$lambda$12$$inlined$map$1$2 */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 MarketServiceImpl.kt\ncom/kubi/futures/data/market/MarketServiceImpl\n*L\n1#1,49:1\n50#2:50\n148#3,4:51\n*E\n"})
                public static final class C129542<T> implements InterfaceC41635f {

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ InterfaceC41635f f22696b;

                    /* JADX INFO: renamed from: com.kubi.futures.data.market.MarketServiceImpl$observePrices$lambda$12$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @DebugMetadata(m90121c = "com.kubi.futures.data.market.MarketServiceImpl$observePrices$lambda$12$$inlined$map$1$2", m90122f = "MarketServiceImpl.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C129542.this.emit(null, this);
                        }
                    }

                    public C129542(InterfaceC41635f interfaceC41635f) {
                        this.f22696b = interfaceC41635f;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i11 = anonymousClass1.label;
                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i12 = anonymousClass1.label;
                        if (i12 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            InterfaceC41635f interfaceC41635f = this.f22696b;
                            List listEmptyList = (List) obj;
                            if (listEmptyList == null) {
                                listEmptyList = CollectionsKt.emptyList();
                            }
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(listEmptyList, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.InterfaceC41634e
                public Object collect(InterfaceC41635f<? super List<? extends PriceAggregationEntity>> interfaceC41635f, Continuation continuation) {
                    Object objCollect = interfaceC41634eM90894R.collect(new C129542(interfaceC41635f), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            });
        }
        return C41636g.m90935r(C41636g.m90893Q(arrayList));
    }

    /* JADX INFO: renamed from: D0 */
    public static final boolean m24728D0(String str, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            return true;
        }
        return Intrinsics.areEqual(it.getSource(), "socket") && Intrinsics.areEqual(DowngradeExKt.m66551u("/contractMarket/execution:%s", new Object[]{str}, null, 2, null), it.getTopic());
    }

    /* JADX INFO: renamed from: E0 */
    public static final boolean m24730E0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: F0 */
    public static final Object m24732F0(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objM66914d = null;
        try {
            if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
                if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                    String data = it.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data, new C12946a().getType());
                }
            } else if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                String data2 = it.getData();
                Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type kotlin.String");
                C27099x c27099x2 = C27099x.f54458a;
                objM66914d = C27099x.m66914d(data2, new C12947b().getType());
            }
        } catch (Throwable unused) {
        }
        Intrinsics.checkNotNull(objM66914d, "null cannot be cast to non-null type kotlin.Any");
        return objM66914d;
    }

    /* JADX INFO: renamed from: G0 */
    public static final Object m24734G0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: H0 */
    public static final Object m24736H0(int i11, Object t11, Object t12) {
        Intrinsics.checkNotNullParameter(t11, "t1");
        Intrinsics.checkNotNullParameter(t12, "t2");
        synchronized (t11) {
            if (!TypeIntrinsics.isMutableList(t12)) {
                t12 = t12 instanceof RecentDealEntity ? C13019z.m24876c(TypeIntrinsics.asMutableList(t11), (RecentDealEntity) t12, i11) : t11;
            }
        }
        return t12;
    }

    /* JADX INFO: renamed from: I0 */
    public static final List m24738I0(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) it;
    }

    /* JADX INFO: renamed from: K0 */
    public static final FundingRateEntity m24742K0(Ref.BooleanRef booleanRef, FundingRateEntity old, FundingRateEntity current) {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(current, "current");
        if (!booleanRef.element) {
            return old;
        }
        BigDecimal fundingRate = current.getFundingRate();
        if (fundingRate == null) {
            fundingRate = current.getLastFundingRate();
        }
        return old.copy((16351 & 1) != 0 ? old.remainSettleTime : null, (16351 & 2) != 0 ? old.settleTime : null, (16351 & 4) != 0 ? old.symbol : null, (16351 & 8) != 0 ? old.granularity : null, (16351 & 16) != 0 ? old.currentFundingRateGranularity : null, (16351 & 32) != 0 ? old.lastFundingRate : fundingRate, (16351 & 64) != 0 ? old.lastTimeFundingRate : null, (16351 & 128) != 0 ? old.fundingRate : null, (16351 & 256) != 0 ? old.predictedValue : null, (16351 & 512) != 0 ? old.predictedFundingRate : null, (16351 & 1024) != 0 ? old.fundingRateCap : null, (16351 & 2048) != 0 ? old.fundingRateFloor : null, (16351 & 4096) != 0 ? old.dailyInterestRate : null, (16351 & 8192) != 0 ? old.period : null);
    }

    /* JADX INFO: renamed from: M0 */
    public static final String m24746M0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return DowngradeExKt.m66551u("/contract/price:%s", new Object[]{it}, null, 2, null);
    }

    /* JADX INFO: renamed from: N0 */
    public static final Request m24748N0(MarketServiceImpl marketServiceImpl, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return marketServiceImpl.m24831y0().m24863d(it);
    }

    /* JADX INFO: renamed from: O0 */
    public static final boolean m24750O0(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            return true;
        }
        return Intrinsics.areEqual(it.getSource(), "socket") && Intrinsics.areEqual(it.getSubject(), "mark.price");
    }

    /* JADX INFO: renamed from: P0 */
    public static final boolean m24752P0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: Q0 */
    public static final Object m24754Q0(Message it) {
        Object objM66914d;
        Intrinsics.checkNotNullParameter(it, "it");
        Object objM66914d2 = null;
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                try {
                    String data = it.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d2 = C27099x.m66914d(data, new C12948c().getType());
                } catch (Throwable unused) {
                }
            }
            List list = (List) objM66914d2;
            return list == null ? CollectionsKt.emptyList() : list;
        }
        if (it.getData() == null || TextUtils.isEmpty(it.getData())) {
            objM66914d = null;
        } else {
            try {
                String data2 = it.getData();
                Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type kotlin.String");
                C27099x c27099x2 = C27099x.f54458a;
                objM66914d = C27099x.m66914d(data2, new C12949d().getType());
            } catch (Throwable unused2) {
                objM66914d = null;
            }
        }
        MarkPriceEntity markPriceEntity = (MarkPriceEntity) objM66914d;
        if (markPriceEntity == null) {
            markPriceEntity = new MarkPriceEntity(null, null, 3, null);
        }
        return markPriceEntity;
    }

    /* JADX INFO: renamed from: R0 */
    public static final Object m24756R0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: S0 */
    public static final boolean m24758S0(String str, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            return true;
        }
        return Intrinsics.areEqual(it.getSource(), "socket") && Intrinsics.areEqual(it.getTopic(), DowngradeExKt.m66551u("/contract/instrument:%s", new Object[]{str}, null, 2, null)) && Intrinsics.areEqual(it.getSubject(), "mark.index.price") && !C37500b.f83191a.m84428a();
    }

    /* JADX INFO: renamed from: T0 */
    public static final boolean m24760T0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: U0 */
    public static final Object m24762U0(Message it) {
        Parcelable parcelable;
        Intrinsics.checkNotNullParameter(it, "it");
        Object objM66914d = null;
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                try {
                    String data = it.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data, new C12950e().getType());
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
                    objM66914d = C27099x.m66914d(data2, new C12951f().getType());
                } catch (Throwable unused2) {
                }
            }
            parcelable = (Parcelable) objM66914d;
        }
        Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type kotlin.Any");
        return parcelable;
    }

    /* JADX INFO: renamed from: V0 */
    public static final Object m24764V0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: W0 */
    public static final Object m24766W0(Object t11, Object t12) {
        Intrinsics.checkNotNullParameter(t11, "t1");
        Intrinsics.checkNotNullParameter(t12, "t2");
        if (t12 instanceof PriceEntity) {
            return C13019z.m24875b(t11, t12);
        }
        return t12 instanceof WsPriceEntity ? C13019z.m24875b(t11, t12) : t11;
    }

    /* JADX INFO: renamed from: X0 */
    public static final PriceEntity m24768X0(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (PriceEntity) it;
    }

    /* JADX INFO: renamed from: Y0 */
    public static final List m24770Y0(String str, List list) {
        if (Intrinsics.areEqual(str, "recommend")) {
            List<QuotesEntity> listMo84211e = MultiBizFacadeManager.f19232a.m20274q().mo84211e();
            return listMo84211e == null ? CollectionsKt.emptyList() : listMo84211e;
        }
        if (!list.isEmpty()) {
            return list;
        }
        List<QuotesEntity> listMo84209b = MultiBizFacadeManager.f19232a.m20274q().mo84209b(str);
        return listMo84209b == null ? CollectionsKt.emptyList() : listMo84209b;
    }

    /* JADX INFO: renamed from: Z0 */
    public static final ObservableSource m24772Z0(MarketServiceImpl marketServiceImpl, String str, List cache) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        if (cache.isEmpty()) {
            return Observable.just(CollectionsKt.emptyList());
        }
        Observable observableMerge = Observable.merge(marketServiceImpl.m24821s0(str, cache));
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.data.market.p0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(MarketServiceImpl.m24774a1((Message) obj));
            }
        };
        Observable observableFilter = observableMerge.filter(new Predicate() { // from class: com.kubi.futures.data.market.q0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return MarketServiceImpl.m24776b1(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.futures.data.market.r0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketServiceImpl.m24778c1((Message) obj);
            }
        };
        Observable map = observableFilter.map(new Function() { // from class: com.kubi.futures.data.market.s0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MarketServiceImpl.m24780d1(function2, obj);
            }
        });
        if (!cache.isEmpty()) {
            map = map.startWith(cache);
        }
        return map.scan(new BiFunction() { // from class: com.kubi.futures.data.market.t0
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return MarketServiceImpl.m24782e1(obj, obj2);
            }
        }).map(new Function() { // from class: com.kubi.futures.data.market.u0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MarketServiceImpl.m24784f1(obj);
            }
        });
    }

    /* JADX INFO: renamed from: a1 */
    public static final boolean m24774a1(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            return true;
        }
        return Intrinsics.areEqual(it.getSource(), "socket") && Intrinsics.areEqual(it.getSubject(), "snapshot.24h");
    }

    /* JADX INFO: renamed from: b1 */
    public static final boolean m24776b1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: c1 */
    public static final Object m24778c1(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objM66914d = null;
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                try {
                    String data = it.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data, new C12952g().getType());
                } catch (Throwable unused) {
                }
            }
            List list = (List) objM66914d;
            return list == null ? new ArrayList() : list;
        }
        if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
            try {
                String data2 = it.getData();
                Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type kotlin.String");
                C27099x c27099x2 = C27099x.f54458a;
                objM66914d = C27099x.m66914d(data2, new C12953h().getType());
            } catch (Throwable unused2) {
            }
        }
        WsQuotesEntity wsQuotesEntity = (WsQuotesEntity) objM66914d;
        return wsQuotesEntity == null ? new WsQuotesEntity(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null) : wsQuotesEntity;
    }

    /* JADX INFO: renamed from: d1 */
    public static final Object m24780d1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: e1 */
    public static final Object m24782e1(Object t11, Object t12) {
        Intrinsics.checkNotNullParameter(t11, "t1");
        Intrinsics.checkNotNullParameter(t12, "t2");
        if (TypeIntrinsics.isMutableList(t12)) {
            return t12;
        }
        if (t12 instanceof WsQuotesEntity) {
            Object obj = null;
            List list = TypeIntrinsics.isMutableList(t11) ? (List) t11 : null;
            if (list != null) {
                for (Object obj2 : list) {
                    if (Intrinsics.areEqual(((QuotesEntity) obj2).getSymbol(), ((WsQuotesEntity) t12).getSymbol())) {
                        obj = obj2;
                        break;
                    }
                }
                QuotesEntity quotesEntity = (QuotesEntity) obj;
                if (quotesEntity != null) {
                    C13019z.m24878e(quotesEntity, (WsQuotesEntity) t12);
                }
            }
        }
        return t11;
    }

    /* JADX INFO: renamed from: f1 */
    public static final List m24784f1(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) it;
    }

    /* JADX INFO: renamed from: g1 */
    public static final ObservableSource m24786g1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (ObservableSource) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: h1 */
    public static final IMarketSocketApi m24788h1() {
        return (IMarketSocketApi) new C19321b.a().m42777b(new C38005g(C37237b.m83279b())).m42778c(new C38006h()).m42776a().m42772b(IMarketSocketApi.class);
    }

    /* JADX INFO: renamed from: i1 */
    public static final IMarketSocketApi m24790i1() {
        return (IMarketSocketApi) new C19321b.a().m42777b(new C38000b(C37237b.m83279b())).m42778c(new C38006h()).m42776a().m42772b(IMarketSocketApi.class);
    }

    /* JADX INFO: renamed from: k0 */
    public static final MarketBindingRequest m24792k0() {
        return new MarketBindingRequest();
    }

    /* JADX INFO: renamed from: l0 */
    public static final ContractTradeJsonMarketSocket m24793l0(MarketServiceImpl marketServiceImpl) {
        IMarketSocket iMarketSocketM24831y0 = marketServiceImpl.m24831y0();
        IMarketApi iMarketApiM24823t0 = marketServiceImpl.m24823t0();
        Intrinsics.checkNotNullExpressionValue(iMarketApiM24823t0, "<get-api>(...)");
        return new ContractTradeJsonMarketSocket(iMarketSocketM24831y0, iMarketApiM24823t0);
    }

    /* JADX INFO: renamed from: m0 */
    public static final List m24794m0(MarketServiceImpl marketServiceImpl) {
        IMarketApi iMarketApiM24823t0 = marketServiceImpl.m24823t0();
        Intrinsics.checkNotNullExpressionValue(iMarketApiM24823t0, "<get-api>(...)");
        return CollectionsKt.listOf((Object[]) new ContractTradeMarketSocket[]{new ContractTradePbMarketSocket(iMarketApiM24823t0), marketServiceImpl.m24827v0()});
    }

    /* JADX INFO: renamed from: A0 */
    public final IMarketSocketApi m24799A0() {
        return (IMarketSocketApi) this.f22692g.getValue();
    }

    /* JADX INFO: renamed from: B0 */
    public final IMarketSocketApi m24800B0() {
        return (IMarketSocketApi) this.f22693h.getValue();
    }

    @Override // com.kubi.futures.data.market.IMarketService
    @NotNull
    /* JADX INFO: renamed from: a */
    public Observable<BookEntity> mo24801a(@NotNull String symbol, int i11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return m24814o0().mo24719a(symbol, i11);
    }

    @Override // com.kubi.futures.data.market.IMarketService
    @NotNull
    /* JADX INFO: renamed from: b */
    public Observable<TickerEntity> mo24802b(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return m24814o0().mo24720b(symbol);
    }

    @Override // com.kubi.futures.data.market.IMarketApi
    @GET("v1/symbols")
    @Nullable
    /* JADX INFO: renamed from: c */
    public ArrayList<SymbolInfoEntity> mo24803c(@Nullable @Query("symbols") String str) {
        return this.f22686a.mo24803c(str);
    }

    @Override // com.kubi.futures.data.market.IMarketService
    @Nullable
    /* JADX INFO: renamed from: d */
    public String mo24804d(@NotNull String currency) throws Throwable {
        Intrinsics.checkNotNullParameter(currency, "currency");
        try {
            MexCurrencyIconUrlEntity mexCurrencyIconUrlEntityMo24818r = this.f22686a.mo24818r(currency);
            if (mexCurrencyIconUrlEntityMo24818r != null) {
                return mexCurrencyIconUrlEntityMo24818r.getImgUrl();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // com.kubi.futures.data.market.IMarketService
    @NotNull
    /* JADX INFO: renamed from: e */
    public Observable<FundingRateEntity> mo24805e(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        String strM66551u = DowngradeExKt.m66551u("/contract/instrument:%s", new Object[]{symbol}, null, 2, null);
        C38293f<FundingRateEntity> c38293fM24873e = m24825u0().m24873e(symbol);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Observable observableScan = Observable.merge(m24799A0().m24866b(strM66551u, c38293fM24873e, new FundingRateConvert(strM66551u)), RxConvertKt.m91207d(c38293fM24873e, null, 1, null)).scan(new BiFunction() { // from class: com.kubi.futures.data.market.v0
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return MarketServiceImpl.m24742K0(booleanRef, (FundingRateEntity) obj, (FundingRateEntity) obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableScan, "scan(...)");
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.data.market.x0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketServiceImpl.m24744L0(booleanRef, (FundingRateEntity) obj);
            }
        };
        return C13228l.m25657a(observableScan, new Consumer() { // from class: com.kubi.futures.data.market.y0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarketServiceImpl.m24740J0(function1, obj);
            }
        });
    }

    @Override // com.kubi.futures.data.market.IMarketService
    @NotNull
    /* JADX INFO: renamed from: f */
    public Observable<Object> mo24806f(@NotNull List<String> symbols) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        List<C19406c> listM24813n0 = m24813n0(50, symbols, new Function1() { // from class: com.kubi.futures.data.market.z0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketServiceImpl.m24746M0((String) obj);
            }
        }, new Function1() { // from class: com.kubi.futures.data.market.a1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketServiceImpl.m24748N0(this.f22700b, (String) obj);
            }
        });
        if (listM24813n0 == null || listM24813n0.isEmpty()) {
            Observable<Object> observableJust = Observable.just(new Object());
            Intrinsics.checkNotNull(observableJust);
            return observableJust;
        }
        Observable observableMerge = Observable.merge(listM24813n0);
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.data.market.b1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(MarketServiceImpl.m24750O0((Message) obj));
            }
        };
        Observable observableFilter = observableMerge.filter(new Predicate() { // from class: com.kubi.futures.data.market.c1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return MarketServiceImpl.m24752P0(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.futures.data.market.d1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketServiceImpl.m24754Q0((Message) obj);
            }
        };
        Observable<Object> map = observableFilter.map(new Function() { // from class: com.kubi.futures.data.market.e1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MarketServiceImpl.m24756R0(function2, obj);
            }
        });
        Intrinsics.checkNotNull(map);
        return map;
    }

    @Override // com.kubi.futures.data.market.IMarketService
    @NotNull
    /* JADX INFO: renamed from: g */
    public Observable<PriceEntity> mo24807g(@NotNull final String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        com.kubi.network.websocket.model.Request.Companion companion = com.kubi.network.websocket.model.Request.INSTANCE;
        C19406c c19406c = new C19406c(companion.subscribe(m24831y0().m24862c(symbol), DowngradeExKt.m66551u("/contract/instrument:%s", new Object[]{symbol}, null, 2, null)), companion.unsubscribe(m24831y0().m24862c(symbol), DowngradeExKt.m66551u("/contract/instrument:%s", new Object[]{symbol}, null, 2, null)), null, false, C37237b.m83279b(), 12, null);
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.data.market.i0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(MarketServiceImpl.m24758S0(symbol, (Message) obj));
            }
        };
        Observable<Message> observableFilter = c19406c.filter(new Predicate() { // from class: com.kubi.futures.data.market.j0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return MarketServiceImpl.m24760T0(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.futures.data.market.k0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketServiceImpl.m24762U0((Message) obj);
            }
        };
        Observable map = observableFilter.map(new Function() { // from class: com.kubi.futures.data.market.m0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MarketServiceImpl.m24764V0(function2, obj);
            }
        }).scan(new BiFunction() { // from class: com.kubi.futures.data.market.n0
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return MarketServiceImpl.m24766W0(obj, obj2);
            }
        }).map(new Function() { // from class: com.kubi.futures.data.market.o0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MarketServiceImpl.m24768X0(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable<PriceEntity> observableM66399m = FlowableCompatKt.m66399m(map);
        Intrinsics.checkNotNullExpressionValue(observableM66399m, "midFrequency(...)");
        return observableM66399m;
    }

    @Override // com.kubi.futures.data.market.IMarketService
    @NotNull
    /* JADX INFO: renamed from: h */
    public Observable<List<RecentDealEntity>> mo24808h(@NotNull final String symbol, final int i11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        com.kubi.network.websocket.model.Request.Companion companion = com.kubi.network.websocket.model.Request.INSTANCE;
        C19406c c19406c = new C19406c(companion.subscribe(m24831y0().m24860a(symbol, i11), DowngradeExKt.m66551u("/contractMarket/execution:%s", new Object[]{symbol}, null, 2, null)), companion.unsubscribe(m24831y0().m24860a(symbol, i11), DowngradeExKt.m66551u("/contractMarket/execution:%s", new Object[]{symbol}, null, 2, null)), null, false, C37237b.m83279b(), 12, null);
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.data.market.c0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(MarketServiceImpl.m24728D0(symbol, (Message) obj));
            }
        };
        Observable<Message> observableFilter = c19406c.filter(new Predicate() { // from class: com.kubi.futures.data.market.d0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return MarketServiceImpl.m24730E0(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.futures.data.market.e0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketServiceImpl.m24732F0((Message) obj);
            }
        };
        Observable map = observableFilter.map(new Function() { // from class: com.kubi.futures.data.market.f0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MarketServiceImpl.m24734G0(function2, obj);
            }
        }).scan(new BiFunction() { // from class: com.kubi.futures.data.market.g0
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return MarketServiceImpl.m24736H0(i11, obj, obj2);
            }
        }).map(new Function() { // from class: com.kubi.futures.data.market.h0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MarketServiceImpl.m24738I0(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable<List<RecentDealEntity>> observableM66394h = FlowableCompatKt.m66394h(map);
        Intrinsics.checkNotNullExpressionValue(observableM66394h, "highFrequency(...)");
        return observableM66394h;
    }

    @Override // com.kubi.futures.data.market.IMarketApi
    @NotNull
    /* JADX INFO: renamed from: i */
    public Request mo24809i(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return m24823t0().mo24809i(symbol);
    }

    @Override // com.kubi.futures.data.market.IMarketService
    @NotNull
    /* JADX INFO: renamed from: l */
    public Observable<List<QuotesEntity>> mo24810l(@Nullable final String str, @NotNull final List<QuotesEntity> quotes) {
        Intrinsics.checkNotNullParameter(quotes, "quotes");
        Observable observableFromCallable = Observable.fromCallable(new Callable() { // from class: com.kubi.futures.data.market.k1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return MarketServiceImpl.m24770Y0(str, quotes);
            }
        });
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.data.market.l1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketServiceImpl.m24772Z0(this.f22727b, str, (List) obj);
            }
        };
        Observable observableFlatMap = observableFromCallable.flatMap(new Function() { // from class: com.kubi.futures.data.market.b0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MarketServiceImpl.m24786g1(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        Observable<List<QuotesEntity>> observableM66397k = FlowableCompatKt.m66397k(observableFlatMap);
        Intrinsics.checkNotNullExpressionValue(observableM66397k, "lowFrequency(...)");
        return observableM66397k;
    }

    @Override // com.kubi.futures.data.market.IMarketService
    @Nullable
    /* JADX INFO: renamed from: m */
    public Object mo24811m(boolean z11, @NotNull Continuation<? super List<AvailableTradeAreaEntity>> continuation) {
        return z11 ? C46392a.m102325g(C46894j.f104736a.m103242G(), CollectionsKt.emptyList()) : C46392a.m102325g(C46894j.f104736a.m103284w(), CollectionsKt.emptyList());
    }

    @Override // com.kubi.futures.data.market.IMarketService
    @Nullable
    /* JADX INFO: renamed from: p */
    public Object mo24815p(boolean z11, @NotNull Continuation<? super C19334f<List<AvailableTradeAreaEntity>>> continuation) {
        return RetrofitFlowExKt.m42824e(MultiBizFacadeManager.f19232a.m20274q().mo84210d(z11), false, new MarketServiceImpl$fetchTradingArea$2(z11, null), continuation, 1, null);
    }

    @Override // com.kubi.futures.data.market.IMarketApi
    @GET("v1/discover/item/tag")
    @Nullable
    /* JADX INFO: renamed from: q */
    public TagEntity mo24816q(@NotNull @Query("item") String item, @NotNull @Query("type") String type) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f22686a.mo24816q(item, type);
    }

    /* JADX INFO: renamed from: q0 */
    public final C19406c m24817q0(String str, String str2) {
        com.kubi.network.websocket.model.Request.Companion companion = com.kubi.network.websocket.model.Request.INSTANCE;
        return new C19406c(companion.subscribe(m24832z0(str), DowngradeExKt.m66551u("/contractMarket/snapshotV3:%s", new Object[]{str2}, null, 2, null)), companion.unsubscribe(m24832z0(str), DowngradeExKt.m66551u("/contractMarket/snapshotV3:%s", new Object[]{str2}, null, 2, null)), null, false, C37237b.m83279b(), 12, null);
    }

    @Override // com.kubi.futures.data.market.IMarketApi
    @GET("v1/kumex-contract/contract-info")
    @Nullable
    /* JADX INFO: renamed from: r */
    public MexCurrencyIconUrlEntity mo24818r(@NotNull @Query("symbol") String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return this.f22686a.mo24818r(symbol);
    }

    /* JADX INFO: renamed from: r0 */
    public final C19406c m24819r0(String str, Request request) {
        com.kubi.network.websocket.model.Request.Companion companion = com.kubi.network.websocket.model.Request.INSTANCE;
        return new C19406c(companion.subscribe(request, str), companion.unsubscribe(request, str), null, true, C37237b.m83279b());
    }

    @Override // com.kubi.futures.data.market.IMarketApi
    @NotNull
    /* JADX INFO: renamed from: s */
    public PriceEntity mo24820s(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return this.f22686a.mo24820s(symbol);
    }

    @Override // com.kubi.futures.data.market.IMarketApi
    @Nullable
    /* JADX INFO: renamed from: t */
    public TickerEntity mo24822t(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return this.f22686a.mo24822t(symbol);
    }

    /* JADX INFO: renamed from: t0 */
    public final IMarketApi m24823t0() {
        return (IMarketApi) this.f22688c.getValue();
    }

    /* JADX INFO: renamed from: u0 */
    public final MarketBindingRequest m24825u0() {
        return (MarketBindingRequest) this.f22694i.getValue();
    }

    @Override // com.kubi.futures.data.market.IMarketApi
    @GET("v1/kumex-trade/orders/price-limit")
    @NotNull
    /* JADX INFO: renamed from: v */
    public HashMap<String, String> mo24826v(@NotNull @Query("symbol") String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return this.f22686a.mo24826v(symbol);
    }

    /* JADX INFO: renamed from: v0 */
    public final ContractTradeJsonMarketSocket m24827v0() {
        return (ContractTradeJsonMarketSocket) this.f22690e.getValue();
    }

    @Override // com.kubi.futures.data.market.IMarketApi
    @GET("v1/quick-silver/universe-currency/symbols/info/{currency}")
    @Nullable
    /* JADX INFO: renamed from: w */
    public MarketCoinInfo mo24828w(@Path(FirebaseAnalytics.Param.CURRENCY) @NotNull String currency, @NotNull @Query("symbol") String symbol, @NotNull @Query("legalCurrency") String legalCurrency, @NotNull @Query("lang") String lang, @NotNull @Query("source") String source) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(legalCurrency, "legalCurrency");
        Intrinsics.checkNotNullParameter(lang, "lang");
        Intrinsics.checkNotNullParameter(source, "source");
        return this.f22686a.mo24828w(currency, symbol, legalCurrency, lang, source);
    }

    /* JADX INFO: renamed from: w0 */
    public final List<ContractTradeMarketSocket> m24829w0() {
        return (List) this.f22691f.getValue();
    }

    /* JADX INFO: renamed from: x0 */
    public final IMarketApi m24830x0() {
        return (IMarketApi) this.f22689d.getValue();
    }

    /* JADX INFO: renamed from: y0 */
    public final IMarketSocket m24831y0() {
        Object value = this.f22687b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IMarketSocket) value;
    }

    /* JADX INFO: renamed from: z0 */
    public final Request m24832z0(String str) {
        return Intrinsics.areEqual(str, "recommend") ? MultiBizFacadeManager.f19232a.m20274q().mo84213u0() : MultiBizFacadeManager.f19232a.m20274q().mo84212e0(str);
    }

    /* JADX INFO: renamed from: C0 */
    public static final IMarketSocket m24726C0() {
        return (IMarketSocket) C42597a.m93390f().create(IMarketSocket.class);
    }

    /* JADX INFO: renamed from: J0 */
    public static final void m24740J0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: L0 */
    public static final Unit m24744L0(Ref.BooleanRef booleanRef, FundingRateEntity fundingRateEntity) {
        boolean z11;
        if (C27039d.m66650j(fundingRateEntity.getPeriod()) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        booleanRef.element = z11;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j0 */
    public static final IMarketApi m24791j0() {
        return (IMarketApi) C42597a.m93388d().create(IMarketApi.class);
    }

    /* JADX INFO: renamed from: p0 */
    public static final IMarketApi m24795p0() {
        return (IMarketApi) C42597a.m93386b().create(IMarketApi.class);
    }

    @Override // com.kubi.futures.data.market.IMarketApi
    @NotNull
    /* JADX INFO: renamed from: n */
    public Observable<BaseEntity<List<QuotesEntity>>> mo24812n(@Nullable String str) {
        return m24830x0().mo24812n(str);
    }

    /* JADX INFO: renamed from: n0 */
    public final List<C19406c> m24813n0(int i11, List<String> list, Function1<? super String, String> function1, Function1<? super String, Request> function2) {
        if (list.isEmpty()) {
            Log.f30813a.m36617c("MarketServiceImpl", "MarketServiceImpl-createCompositeObservable");
            return CollectionsKt.emptyList();
        }
        int size = list.size() - 1;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        if (size >= 0) {
            int i12 = 1;
            int i13 = 0;
            while (true) {
                sb2.append(",");
                sb2.append(list.get(i13));
                if (i13 >= (i12 * i11) - 1 || i13 >= size) {
                    i12++;
                    sb2.deleteCharAt(0);
                    String string = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    arrayList.add(m24819r0(function1.invoke(string), function2.invoke(string)));
                    StringsKt.clear(sb2);
                }
                if (i13 == size) {
                    break;
                }
                i13++;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o0 */
    public final ContractTradeMarketSocket m24814o0() {
        for (ContractTradeMarketSocket contractTradeMarketSocket : m24829w0()) {
            if (contractTradeMarketSocket.mo24721c()) {
                return contractTradeMarketSocket;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: s0 */
    public final List<C19406c> m24821s0(String str, List<QuotesEntity> list) {
        if (list.isEmpty()) {
            return null;
        }
        int size = list.size() - 1;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        if (size >= 0) {
            int i11 = 1;
            int i12 = 0;
            while (true) {
                sb2.append(",");
                sb2.append(C27041f.m66668h(list.get(i12).getSymbol()));
                if (i12 >= (i11 * 80) - 1 || i12 >= size) {
                    i11++;
                    sb2.deleteCharAt(0);
                    String string = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    arrayList.add(m24817q0(str, string));
                    StringsKt.clear(sb2);
                }
                if (i12 == size) {
                    break;
                }
                i12++;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MarketServiceImpl() {
        Object objCreate = C42597a.m93391g().create(IMarketApi.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        this((IMarketApi) objCreate);
    }
}
