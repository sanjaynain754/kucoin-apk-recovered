package com.kubi.futures.data.platform;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.credentials.provider.CredentialEntry;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.broker.MultiBizType;
import com.kubi.copytrading.ICopyTradingService;
import com.kubi.futures.data.platform.PlatformServiceImpl;
import com.kubi.futures.data.platform.model.OpenFuturesAgreement;
import com.kubi.futures.data.platform.model.StrategyOrderConfigEntity;
import com.kubi.futures.trade.submit.panel.tradeType.twap.z;
import com.kubi.kumex.BKumexWebSocketStartUpTask;
import com.kubi.kumex.data.platform.model.CoinEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.ContractMaintainEntity;
import com.kubi.kumex.data.platform.model.ContractRiskLimitEntity;
import com.kubi.kumex.data.platform.model.DictEntity;
import com.kubi.kumex.data.platform.model.FuturesCampaignActivityEntity;
import com.kubi.kumex.data.platform.model.FuturesSpreadConfigEntity;
import com.kubi.kumex.data.platform.model.HedgeDiscountRateEntity;
import com.kubi.kumex.data.platform.model.LeverageConfig;
import com.kubi.kumex.data.platform.model.NasdaqMarketStatusEntity;
import com.kubi.kumex.data.platform.model.NoticeConfig;
import com.kubi.kumex.data.platform.model.NoticeEntity;
import com.kubi.kumex.data.platform.model.ResourcePositionEntity;
import com.kubi.kumex.data.platform.model.RobotSiteConfigEntity;
import com.kubi.kumex.data.platform.model.SymbolConfig;
import com.kubi.kumex.data.platform.model.SystemConfig;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.kumex.utils.Log;
import com.kubi.network.websocket.model.HeartbeatRequest;
import com.kubi.network.websocket.model.Message;
import com.kubi.network.websocket.model.Request;
import com.kubi.network.websocket.observable.C19406c;
import com.kubi.quotefacade.entity.MarketListEntityItem;
import com.kubi.restful.C23198n;
import com.kubi.router.utils.C23636b;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.constant.monitor.KunlunTechEventEnum;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import er.C37237b;
import er.InterfaceC37236a;
import fm.C37567b;
import fm.C37570e;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.processors.BehaviorProcessor;
import ir.C40167b;
import ir.InterfaceC40166a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.rx2.RxConvertKt;
import mr.C42597a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p236em.C37214b;
import p294gz.C38057a;
import p569qq.C43847h;
import p836zl.C46894j;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.TypeIntrinsics;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import ro.C44128b;
import sh0.InterfaceC44416b;
import th.C44986g;
import th.C44990i;
import th.InterfaceC44974a;
import th.InterfaceC44978c;
import th.InterfaceC44980d;
import th.InterfaceC44982e;
import y70.C46392a;

/* JADX INFO: compiled from: PlatformServiceImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0097\u00012\u00020\u00012\u00020\u0002:\u0002\u0097\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020(H\u0016J\u001a\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020&H\u0016J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020+0/H\u0016J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020+0/2\u0006\u00101\u001a\u00020\bH\u0016J\"\u00102\u001a\b\u0012\u0004\u0012\u0002030/2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b05H\u0016J\u001a\u00106\u001a\u0004\u0018\u0001032\u0006\u00107\u001a\u00020\b2\u0006\u0010-\u001a\u00020&H\u0016J\u000e\u00108\u001a\b\u0012\u0004\u0012\u0002030/H\u0016J\u0016\u00109\u001a\u00020$2\f\u0010:\u001a\b\u0012\u0004\u0012\u0002030/H\u0016J\u0016\u0010;\u001a\b\u0012\u0004\u0012\u0002030<2\u0006\u00107\u001a\u00020\bH\u0016J\u0014\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030/0<H\u0016J\u000e\u0010B\u001a\b\u0012\u0004\u0012\u00020@0<H\u0016J\b\u0010C\u001a\u00020DH\u0016J\b\u0010E\u001a\u00020DH\u0016J\b\u0010F\u001a\u00020$H\u0016J\b\u0010G\u001a\u00020HH\u0016J\b\u0010I\u001a\u00020HH\u0016J\u000e\u0010J\u001a\b\u0012\u0004\u0012\u00020H0<H\u0016J#\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020L052\b\u0010M\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0002\u0010NJ\b\u0010O\u001a\u00020$H\u0016J\u0018\u0010P\u001a\u00020$2\u0006\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020\bH\u0016J\u0014\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020L05H\u0016J\u001c\u0010T\u001a\u00020$2\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020L05H\u0016J\u0012\u0010S\u001a\u0004\u0018\u00010L2\u0006\u00107\u001a\u00020\bH\u0016J\u001e\u0010V\u001a\u0004\u0018\u00010\"2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b05H\u0016J\u001c\u0010X\u001a\u00020$2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b05H\u0002J\u001a\u0010Y\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020L050<H\u0016J\u0016\u0010Y\u001a\b\u0012\u0004\u0012\u00020L0<2\u0006\u00107\u001a\u00020\bH\u0016J\b\u0010Z\u001a\u00020$H\u0016J\u000e\u0010[\u001a\b\u0012\u0004\u0012\u00020]0\\H\u0017J\u000e\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\\H\u0016J\u000e\u0010_\u001a\b\u0012\u0004\u0012\u00020]0`H\u0016J\u0010\u0010a\u001a\u00020\b2\u0006\u00107\u001a\u00020\bH\u0016J\u0016\u0010b\u001a\u00020$2\f\u0010c\u001a\b\u0012\u0004\u0012\u00020\b0/H\u0016J\u000e\u0010d\u001a\b\u0012\u0004\u0012\u00020\b0/H\u0016J\b\u0010e\u001a\u00020fH\u0016J\u001c\u0010g\u001a\u00020$2\u0012\u0010h\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b05H\u0016J\u000e\u0010i\u001a\b\u0012\u0004\u0012\u00020\b0/H\u0002J\u0010\u0010j\u001a\u00020$2\u0006\u0010k\u001a\u000203H\u0002J\b\u0010l\u001a\u00020mH\u0016J\b\u0010n\u001a\u00020mH\u0016J\b\u0010o\u001a\u00020&H\u0016J\b\u0010p\u001a\u00020$H\u0016J\n\u0010q\u001a\u0004\u0018\u00010rH\u0016J\u0011\u0010s\u001a\n\u0012\u0004\u0012\u00020t\u0018\u00010/H\u0097\u0001J\t\u0010u\u001a\u00020vH\u0097\u0001JD\u0010w\u001a\u0004\u0018\u00010x2\b\b\u0001\u0010y\u001a\u00020@2\b\b\u0001\u0010z\u001a\u00020@2\b\b\u0001\u0010{\u001a\u00020\b2\b\b\u0001\u0010|\u001a\u00020\b2\n\b\u0001\u0010}\u001a\u0004\u0018\u00010@H\u0097\u0001¢\u0006\u0002\u0010~J\n\u0010\u007f\u001a\u00030\u0080\u0001H\u0097\u0001J\u001d\u0010\u0081\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0082\u0001\u0018\u00010/2\b\b\u0001\u00107\u001a\u00020\bH\u0097\u0001J\r\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u0001H\u0097\u0001J\u0012\u0010\u0085\u0001\u001a\u0004\u0018\u00010&H\u0097\u0001¢\u0006\u0003\u0010\u0086\u0001J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010rH\u0097\u0001J!\u0010\u0088\u0001\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020L052\t\b\u0001\u0010\u0089\u0001\u001a\u00020\bH\u0097\u0001J\u0016\u0010\u008a\u0001\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020L05H\u0097\u0001J\u0015\u0010\u008b\u0001\u001a\u00030\u008c\u00012\b\b\u0001\u00107\u001a\u00020\bH\u0097\u0001J:\u0010\u008d\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u008f\u00010\u008e\u00010\\2\t\b\u0001\u0010\u0090\u0001\u001a\u00020\b2\n\b\u0001\u00107\u001a\u0004\u0018\u00010\b2\t\b\u0001\u0010\u0091\u0001\u001a\u00020\bH\u0097\u0001J(\u0010\u0092\u0001\u001a\u0015\u0012\u0004\u0012\u00020\b\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0093\u00010/052\t\b\u0001\u0010\u0094\u0001\u001a\u00020\bH\u0097\u0001J=\u0010\u0095\u0001\u001a\u0015\u0012\u0004\u0012\u00020\b\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0093\u00010/052\t\b\u0001\u0010\u0094\u0001\u001a\u00020\b2\t\b\u0001\u0010\u0096\u0001\u001a\u00020\b2\b\b\u0001\u00107\u001a\u00020\bH\u0097\u0001R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0014\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010>\u001a\u0010\u0012\f\u0012\n A*\u0004\u0018\u00010@0@0?X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0098\u0001"}, m90084d2 = {"Lcom/kubi/futures/data/platform/PlatformServiceImpl;", "Lcom/kubi/futures/data/platform/IPlatformService;", "Lcom/kubi/futures/data/platform/IPlatformApi;", "platformApi", "<init>", "(Lcom/kubi/futures/data/platform/IPlatformApi;)V", "()V", "SYMBOL_CONFIG", "", "getSYMBOL_CONFIG", "()Ljava/lang/String;", "SYMBOL_CONFIG$delegate", "Lcom/kubi/network/api/utils/Link;", "EXPIRED_FLAG", "Ljava/util/concurrent/atomic/AtomicBoolean;", "platformDao", "Lcom/kubi/futures/data/platform/PlatformDaoWrapper;", "getPlatformDao", "()Lcom/kubi/futures/data/platform/PlatformDaoWrapper;", "platformDao$delegate", "Lkotlin/Lazy;", "platformMemory", "Lcom/kubi/futures/data/platform/IPlatformMemory;", "platformSocket", "Lcom/kubi/futures/data/platform/IPlatformSocket;", "getPlatformSocket", "()Lcom/kubi/futures/data/platform/IPlatformSocket;", "platformSocket$delegate", "futuresClient", "Lcom/kubi/network/api/IWebSocketClient;", "getFuturesClient", "()Lcom/kubi/network/api/IWebSocketClient;", "futuresClient$delegate", "contractCacheLock", "", "synchronized", "", "force", "", "getServerTime", "", "fetchServerTime", "getCoin", "Lcom/kubi/kumex/data/platform/model/CoinEntity;", FirebaseAnalytics.Param.CURRENCY, "wait", "getCoinList", "", "fetchCoinList", "platfrom", "fetchContractList", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "headers", "", "getContract", "symbol", "getContractList", "insertContractList", "list", "observeContract", "Lio/reactivex/Flowable;", "observeContractList", "contractVersionBP", "Lio/reactivex/processors/BehaviorProcessor;", "", "kotlin.jvm.PlatformType", "observeContractVersion", "fetchSystemConfig", "Lcom/kubi/kumex/data/platform/model/SystemConfig;", "getSystemConfig", "loadNoticeConfig", "fetchNoticeConfig", "Lcom/kubi/kumex/data/platform/model/NoticeConfig;", "getNoticeConfig", "observeNoticeConfig", "fetchSymbolConfig", "Lcom/kubi/kumex/data/platform/model/SymbolConfig;", "isOnLogin", "(Ljava/lang/Boolean;)Ljava/util/Map;", "expireSymbolConfig", "mergeBatchLeverageLocally", "primarySymbol", "leverage", "getSymbolConfig", "insertSymbolConfig", "config", "submitSymbolConfig", "map", "mergeSymbolConfig", "observeSymbolConfig", "fetchInitData", "fetchMaintainData", "Lio/reactivex/Observable;", "Lcom/kubi/kumex/data/platform/model/ContractMaintainEntity;", "observeMaintainData", "bindSocketOfContractStatus", "Lkotlinx/coroutines/flow/Flow;", "getContractStatus", "updateFavouriteQuotes", "quotes", "getFavouriteQuotes", "observeContractUpdate", "Lio/reactivex/disposables/Disposable;", "clearCacheFavoriteStatus", "symbolMap", "findFavoriteFormCache", "putContract", "contract", "fetchHedgeDiscountRate", "Lcom/kubi/kumex/data/platform/model/HedgeDiscountRateEntity;", "getHedgeDiscountRate", "isReversePositionEnable", "fetchAndUpdateRobotSiteConfig", "getStrategyConfig", "Lcom/kubi/futures/data/platform/model/StrategyOrderConfigEntity;", "fetchAgreementsOfOpenFutures", "Lcom/kubi/futures/data/platform/model/OpenFuturesAgreement;", "fetchAnnouncement", "Lcom/kubi/kumex/data/platform/model/NoticeEntity;", "fetchCampaignActivities", "Lcom/kubi/kumex/data/platform/model/FuturesCampaignActivityEntity;", "page", "pageSize", "lang", "categories", "weight", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/kubi/kumex/data/platform/model/FuturesCampaignActivityEntity;", "fetchNasdaqMarketStatus", "Lcom/kubi/kumex/data/platform/model/NasdaqMarketStatusEntity;", "fetchRiskLimitList", "Lcom/kubi/kumex/data/platform/model/ContractRiskLimitEntity;", "fetchRobotSiteConfig", "Lcom/kubi/kumex/data/platform/model/RobotSiteConfigEntity;", "fetchShowCopyTradingGuideConfig", "()Ljava/lang/Boolean;", "fetchStrategyConfig", "fetchSymbolConfig1", "time", "fetchSymbolConfig2", "fetchUserSpreadConfig", "Lcom/kubi/kumex/data/platform/model/FuturesSpreadConfigEntity;", "getDiscoverTradeDataBySymbols", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/quotefacade/entity/MarketListEntityItem;", "datasource", "customizations", "loadMiddleGroundResource", "Lcom/kubi/kumex/data/platform/model/ResourcePositionEntity;", "code", "resourcePositionBanner", "tradeType", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"CheckResult"})
@SourceDebugExtension({"SMAP\nPlatformServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformServiceImpl.kt\ncom/kubi/futures/data/platform/PlatformServiceImpl\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 7 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 8 Response.kt\ncom/kubi/network/websocket/model/Message\n*L\n1#1,779:1\n67#2:780\n67#2:808\n58#2,2:809\n144#2,2:825\n154#2:827\n144#2,2:829\n160#3,4:781\n160#3,4:786\n160#3,4:790\n160#3,4:794\n160#3,4:798\n160#3,4:813\n160#3,4:821\n126#3:837\n126#3:846\n1#4:785\n774#5:802\n865#5,2:803\n774#5:805\n865#5,2:806\n1869#5,2:811\n1869#5,2:817\n216#6,2:819\n178#7:828\n58#8,6:831\n64#8,2:838\n58#8,6:840\n64#8,2:847\n*S KotlinDebug\n*F\n+ 1 PlatformServiceImpl.kt\ncom/kubi/futures/data/platform/PlatformServiceImpl\n*L\n342#1:780\n314#1:808\n316#1:809,2\n769#1:825,2\n777#1:827\n566#1:829,2\n174#1:781,4\n205#1:786,4\n246#1:790,4\n288#1:794,4\n308#1:798,4\n455#1:813,4\n706#1:821,4\n673#1:837\n674#1:846\n311#1:802\n311#1:803,2\n312#1:805\n312#1:806,2\n408#1:811,2\n513#1:817,2\n631#1:819,2\n777#1:828\n673#1:831,6\n673#1:838,2\n674#1:840,6\n674#1:847,2\n*E\n"})
public final class PlatformServiceImpl implements InterfaceC44980d, InterfaceC44974a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC44974a f22746a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC40166a f22747b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final AtomicBoolean f22748c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f22749d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final InterfaceC44978c f22750e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Lazy f22751f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Lazy f22752g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final Object f22753h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final BehaviorProcessor<Integer> f22754i;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ KProperty<Object>[] f22745k = {Reflection.property1(new PropertyReference1Impl(PlatformServiceImpl.class, "SYMBOL_CONFIG", "getSYMBOL_CONFIG()Ljava/lang/String;", 0))};

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final Companion f22744j = new Companion(null);

    /* JADX INFO: compiled from: PlatformServiceImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/futures/data/platform/PlatformServiceImpl$Companion;", "", "<init>", "()V", "HEDGE_MODE_POSITION", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.data.platform.PlatformServiceImpl$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C13021a extends TypeToken<Map<String, ? extends SymbolConfig>> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.data.platform.PlatformServiceImpl$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C13022b extends TypeToken<List<? extends CoinEntity>> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.data.platform.PlatformServiceImpl$c */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C13023c extends TypeToken<List<? extends CoinEntity>> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.data.platform.PlatformServiceImpl$d */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C13024d extends TypeToken<List<? extends ContractEntity>> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.data.platform.PlatformServiceImpl$e */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C13025e extends TypeToken<List<? extends ContractEntity>> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.data.platform.PlatformServiceImpl$f */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C13026f extends TypeToken<Map<String, ? extends SymbolConfig>> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.data.platform.PlatformServiceImpl$g */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C13027g extends TypeToken<List<? extends ContractEntity>> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.data.platform.PlatformServiceImpl$h */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C13028h extends TypeToken<ContractEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.data.platform.PlatformServiceImpl$i */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C13029i extends TypeToken<List<? extends ContractEntity>> {
    }

    public PlatformServiceImpl(@NotNull InterfaceC44974a platformApi) {
        Intrinsics.checkNotNullParameter(platformApi, "platformApi");
        this.f22746a = platformApi;
        this.f22747b = C40167b.m88525a(new Function0() { // from class: th.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PlatformServiceImpl.m24937Y0();
            }
        });
        this.f22748c = new AtomicBoolean(false);
        this.f22749d = LazyKt.lazy(new Function0() { // from class: th.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PlatformServiceImpl.m24925Q1();
            }
        });
        this.f22750e = (InterfaceC44978c) new C23198n.a().m55669a().m55665b(InterfaceC44978c.class);
        this.f22751f = LazyKt.lazy(new Function0() { // from class: th.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PlatformServiceImpl.m24927R1();
            }
        });
        this.f22752g = LazyKt.lazy(new Function0() { // from class: th.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PlatformServiceImpl.m24951k1();
            }
        });
        this.f22753h = new Object();
        BehaviorProcessor<Integer> behaviorProcessorCreateDefault = BehaviorProcessor.createDefault(Integer.valueOf(C46392a.m102323e(C46894j.f104736a.m103287z(), 0)));
        Intrinsics.checkNotNullExpressionValue(behaviorProcessorCreateDefault, "createDefault(...)");
        this.f22754i = behaviorProcessorCreateDefault;
    }

    /* JADX INFO: renamed from: T1 */
    public static final Unit m24930T1(PlatformServiceImpl platformServiceImpl) {
        InterfaceC44980d.m99527B(platformServiceImpl, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U1 */
    public static final Unit m24932U1(PlatformServiceImpl platformServiceImpl) throws Throwable {
        InterfaceC44974a.m99452y(platformServiceImpl, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a1 */
    public static final Unit m24939a1(PlatformServiceImpl platformServiceImpl) {
        InterfaceC44980d.m99527B(platformServiceImpl, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b1 */
    public static final Unit m24940b1(PlatformServiceImpl platformServiceImpl) throws Throwable {
        InterfaceC44974a.m99451w(platformServiceImpl, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c1 */
    public static final Unit m24941c1(PlatformServiceImpl platformServiceImpl) throws Throwable {
        InterfaceC44974a.m99452y(platformServiceImpl, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l1 */
    public static final Unit m24953l1(PlatformServiceImpl platformServiceImpl) throws Throwable {
        InterfaceC44974a.m99451w(platformServiceImpl, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m1 */
    public static final Unit m24955m1(PlatformServiceImpl platformServiceImpl) throws Throwable {
        InterfaceC44974a.m99451w(platformServiceImpl, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n1 */
    public static final Unit m24957n1(PlatformServiceImpl platformServiceImpl) throws Throwable {
        InterfaceC44974a.m99452y(platformServiceImpl, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o1 */
    public static final Unit m24959o1(PlatformServiceImpl platformServiceImpl) throws Throwable {
        InterfaceC44974a.m99452y(platformServiceImpl, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u1 */
    public static final Unit m24967u1(PlatformServiceImpl platformServiceImpl) {
        InterfaceC44980d.m99527B(platformServiceImpl, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S1 */
    public final void m24992S1(ContractEntity contractEntity) {
        synchronized (this.f22753h) {
            try {
                List<ContractEntity> mutableList = CollectionsKt.toMutableList((Collection) mo25016k());
                ContractEntity contractEntity2 = null;
                if (mutableList.isEmpty()) {
                    InterfaceC44974a.m99452y(this, null, 1, null);
                } else {
                    int size = mutableList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        ContractEntity contractEntity3 = mutableList.get(i11);
                        if (contractEntity3 != null && Intrinsics.areEqual(C27041f.m66668h(contractEntity3.getSymbol()), C27041f.m66668h(contractEntity.getSymbol()))) {
                            mutableList.set(i11, contractEntity);
                            contractEntity2 = contractEntity3;
                            break;
                        }
                    }
                    if (contractEntity2 == null) {
                        mutableList.add(contractEntity);
                    }
                    m25032v1(mutableList);
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: A1 */
    public static final InterfaceC44416b m24893A1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (InterfaceC44416b) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: B1 */
    public static final boolean m24895B1(String str, ContractEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getSymbol(), str);
    }

    /* JADX INFO: renamed from: C1 */
    public static final boolean m24897C1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: D1 */
    public static final boolean m24899D1(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            return true;
        }
        return Intrinsics.areEqual(it.getSource(), "socket") && Intrinsics.areEqual(it.getTopic(), "/contract/updated") && Intrinsics.areEqual(it.getSubject(), "contractUpdated");
    }

    /* JADX INFO: renamed from: E1 */
    public static final boolean m24901E1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: F1 */
    public static final Object m24903F1(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object objM66914d = null;
        if (Intrinsics.areEqual(it.getSource(), "socket")) {
            if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
                try {
                    String data = it.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(data, new C13028h().getType());
                } catch (Throwable unused) {
                }
            }
            ContractEntity contractEntity = (ContractEntity) objM66914d;
            return contractEntity == null ? new ContractEntity(null, false, null, null, null, null, null, null, 0L, 0L, 0L, null, 0L, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 536870911, null) : contractEntity;
        }
        if (it.getData() != null && !TextUtils.isEmpty(it.getData())) {
            try {
                String data2 = it.getData();
                Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type kotlin.String");
                C27099x c27099x2 = C27099x.f54458a;
                objM66914d = C27099x.m66914d(data2, new C13029i().getType());
            } catch (Throwable unused2) {
            }
        }
        List list = (List) objM66914d;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: renamed from: G1 */
    public static final Object m24905G1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return function1.invoke(p11);
    }

    /* JADX INFO: renamed from: H1 */
    public static final void m24907H1(PlatformServiceImpl platformServiceImpl, Object obj) {
        if (!(obj instanceof ContractEntity)) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.kubi.kumex.data.platform.model.ContractEntity>");
            platformServiceImpl.m25032v1((List) obj);
            return;
        }
        Log.f30813a.m36615a("PlatformServiceImpl", "observeContractUpdate:" + obj);
        platformServiceImpl.m24992S1((ContractEntity) obj);
    }

    /* JADX INFO: renamed from: K1 */
    public static final InterfaceC44416b m24913K1(Map it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Flowable.fromIterable(it.entrySet());
    }

    /* JADX INFO: renamed from: L1 */
    public static final InterfaceC44416b m24915L1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (InterfaceC44416b) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: M1 */
    public static final boolean m24917M1(String str, Map.Entry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getKey(), str);
    }

    /* JADX INFO: renamed from: N1 */
    public static final boolean m24919N1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: O1 */
    public static final SymbolConfig m24921O1(Map.Entry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (SymbolConfig) it.getValue();
    }

    /* JADX INFO: renamed from: P1 */
    public static final SymbolConfig m24923P1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (SymbolConfig) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: Q1 */
    public static final C44990i m24925Q1() {
        return new C44990i();
    }

    /* JADX INFO: renamed from: Y0 */
    public static final String m24937Y0() {
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        if (!kuMexDepend.m35905g().c()) {
            return "config_list";
        }
        return kuMexDepend.m35905g().d() + "config_list";
    }

    /* JADX INFO: renamed from: d1 */
    public static final Unit m24942d1() {
        MultiBizFacadeManager.m20257l(MultiBizFacadeManager.f19232a, null, 1, null).mo89034U();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e1 */
    public static final Unit m24943e1(PlatformServiceImpl platformServiceImpl) throws Throwable {
        StrategyOrderConfigEntity strategyOrderConfigEntityMo25035z = platformServiceImpl.f22746a.mo25035z();
        if (strategyOrderConfigEntityMo25035z != null) {
            C46392a.m102331n(C46894j.f104736a.m103255T(), strategyOrderConfigEntityMo25035z);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f1 */
    public static final boolean m24944f1(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            return true;
        }
        return Intrinsics.areEqual(it.getSource(), "socket") && Intrinsics.areEqual(it.getTopic(), "/contract/normal") && Intrinsics.areEqual(it.getSubject(), "contractStatusChange");
    }

    /* JADX INFO: renamed from: g1 */
    public static final boolean m24945g1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: h1 */
    public static final ContractMaintainEntity m24946h1(PlatformServiceImpl platformServiceImpl, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getSource(), "socket") ? C44986g.m99538c(platformServiceImpl.mo25025r(MapsKt.emptyMap())) : C44986g.m99537b(it);
    }

    /* JADX INFO: renamed from: i1 */
    public static final ContractMaintainEntity m24948i1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (ContractMaintainEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: w1 */
    public static final void m24970w1(final PlatformServiceImpl platformServiceImpl) {
        C27100x0.m66923d(new Function0() { // from class: th.n0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PlatformServiceImpl.m24972x1(this.f101381b);
            }
        });
    }

    /* JADX INFO: renamed from: z1 */
    public static final InterfaceC44416b m24975z1(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Flowable.fromIterable(it);
    }

    @Override // th.InterfaceC44980d
    /* JADX INFO: renamed from: F */
    public void mo24979F() {
        try {
            RobotSiteConfigEntity robotSiteConfigEntityMo24981H = this.f22746a.mo24981H();
            if (robotSiteConfigEntityMo24981H != null) {
                C46392a.m102331n(C46894j.f104736a.m103252Q(), robotSiteConfigEntityMo24981H);
            }
        } catch (Throwable th2) {
            C37214b.m83255a(th2, "fetchRobotSiteConfig");
        }
    }

    @Override // th.InterfaceC44974a
    @GET("v1/robot/task/common/site-config")
    @Nullable
    /* JADX INFO: renamed from: H */
    public RobotSiteConfigEntity mo24981H() {
        return this.f22746a.mo24981H();
    }

    @Override // th.InterfaceC44980d
    /* JADX INFO: renamed from: J */
    public void mo24983J(@NotNull List<String> quotes) throws Throwable {
        Intrinsics.checkNotNullParameter(quotes, "quotes");
        Map<String, SymbolConfig> mapMo24980G = mo24980G();
        Intrinsics.checkNotNull(mapMo24980G, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, com.kubi.kumex.data.platform.model.SymbolConfig>");
        Map mapAsMutableMap = TypeIntrinsics.asMutableMap(mapMo24980G);
        synchronized (mapAsMutableMap) {
            try {
                for (Map.Entry entry : mapAsMutableMap.entrySet()) {
                    if (quotes.contains(entry.getKey())) {
                        ((Map) entry.getValue()).put("favourite", CredentialEntry.TRUE_STRING);
                    } else {
                        ((Map) entry.getValue()).put("favourite", CredentialEntry.FALSE_STRING);
                    }
                }
                InterfaceC44978c.m99487u(this.f22750e, mapAsMutableMap, null, null, 6, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // th.InterfaceC44980d
    @NotNull
    /* JADX INFO: renamed from: K */
    public Disposable mo24984K() {
        try {
            Request.Companion companion = Request.INSTANCE;
            C19406c c19406c = new C19406c(companion.subscribe(new HeartbeatRequest("subscribe", m25026r1().m99531a(), false, false, 0, 0, 60, null), "/contract/updated"), companion.unsubscribe(new HeartbeatRequest("unsubscribe", m25026r1().m99531a(), false, false, 0, 0, 60, null), "/contract/updated"), null, false, m25022p1(), 12, null);
            final Function1 function1 = new Function1() { // from class: th.e0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(PlatformServiceImpl.m24899D1((Message) obj));
                }
            };
            Observable<Message> observableFilter = c19406c.filter(new Predicate() { // from class: th.g0
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return PlatformServiceImpl.m24901E1(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: th.h0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PlatformServiceImpl.m24903F1((Message) obj);
                }
            };
            Observable observableObserveOn = observableFilter.map(new Function() { // from class: th.i0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return PlatformServiceImpl.m24905G1(function2, obj);
                }
            }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94127f());
            Consumer consumer = new Consumer() { // from class: th.j0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    PlatformServiceImpl.m24907H1(this.f101374b, obj);
                }
            };
            final Function1 function3 = new Function1() { // from class: th.k0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PlatformServiceImpl.m24909I1((Throwable) obj);
                }
            };
            Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: th.l0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    PlatformServiceImpl.m24911J1(function3, obj);
                }
            });
            Intrinsics.checkNotNull(disposableSubscribe);
            return disposableSubscribe;
        } catch (Throwable th2) {
            C37214b.m83255a(th2, "observeContractUpdate");
            Disposable disposableDisposed = Disposables.disposed();
            Intrinsics.checkNotNull(disposableDisposed);
            return disposableDisposed;
        }
    }

    @Override // th.InterfaceC44974a
    @GET("v1/cms/articles")
    @Nullable
    /* JADX INFO: renamed from: M */
    public FuturesCampaignActivityEntity mo24986M(@Query("page") int i11, @Query("pageSize") int i12, @NotNull @Query("lang") String lang, @NotNull @Query("categories") String categories, @Nullable @Query("weight") Integer num) {
        Intrinsics.checkNotNullParameter(lang, "lang");
        Intrinsics.checkNotNullParameter(categories, "categories");
        return this.f22746a.mo24986M(i11, i12, lang, categories, num);
    }

    @Override // th.InterfaceC44980d
    @NotNull
    /* JADX INFO: renamed from: N */
    public HedgeDiscountRateEntity mo24987N() throws Throwable {
        HedgeDiscountRateEntity hedgeDiscountRateEntityM99464Y = InterfaceC44978c.m99464Y(this.f22750e, null, null, 3, null);
        if (hedgeDiscountRateEntityM99464Y.getImhedgeRate() == null) {
            hedgeDiscountRateEntityM99464Y = HedgeDiscountRateEntity.copy$default(hedgeDiscountRateEntityM99464Y, null, BigDecimal.ONE, 1, null);
        }
        return hedgeDiscountRateEntityM99464Y.getMmhedgeRate() == null ? HedgeDiscountRateEntity.copy$default(hedgeDiscountRateEntityM99464Y, BigDecimal.ONE, null, 2, null) : hedgeDiscountRateEntityM99464Y;
    }

    @Override // th.InterfaceC44980d
    @NotNull
    /* JADX INFO: renamed from: P */
    public Flowable<Map<String, SymbolConfig>> mo24988P() {
        return InterfaceC44978c.m99478l(this.f22750e, null, null, 3, null);
    }

    @Override // th.InterfaceC44980d
    @NotNull
    /* JADX INFO: renamed from: Q */
    public Flowable<List<ContractEntity>> mo24989Q() {
        Flowable<List<ContractEntity>> flowableOnErrorResumeNext = InterfaceC44978c.m99458N(this.f22750e, null, null, 3, null).onErrorResumeNext(Flowable.just(mo25016k()));
        Intrinsics.checkNotNullExpressionValue(flowableOnErrorResumeNext, "onErrorResumeNext(...)");
        return flowableOnErrorResumeNext;
    }

    @Override // th.InterfaceC44974a
    @GET("v1/kumex-trade/user/contractsConfigs")
    @NotNull
    /* JADX INFO: renamed from: S */
    public Map<String, SymbolConfig> mo24991S() {
        return this.f22746a.mo24991S();
    }

    @Override // th.InterfaceC44980d
    @Nullable
    /* JADX INFO: renamed from: T */
    public StrategyOrderConfigEntity mo24993T() {
        return (StrategyOrderConfigEntity) C46392a.f104043a.m102336j(C46894j.f104736a.m103255T(), StrategyOrderConfigEntity.class, null);
    }

    @Override // th.InterfaceC44974a
    @GET("v1/km/user/agreements")
    @Nullable
    /* JADX INFO: renamed from: U */
    public List<OpenFuturesAgreement> mo24994U() {
        return this.f22746a.mo24994U();
    }

    @Override // th.InterfaceC44974a
    @GET("v1/nasdaq/market-status")
    @NotNull
    /* JADX INFO: renamed from: W */
    public NasdaqMarketStatusEntity mo24995W() {
        return this.f22746a.mo24995W();
    }

    @Override // th.InterfaceC44974a
    @NotNull
    /* JADX INFO: renamed from: Z */
    public List<CoinEntity> mo24998Z(@NotNull String platfrom) throws Throwable {
        Intrinsics.checkNotNullParameter(platfrom, "platfrom");
        List<CoinEntity> listMo24998Z = this.f22746a.mo24998Z(platfrom);
        DictEntity dictEntity = new DictEntity();
        dictEntity.setKey("coin_list");
        dictEntity.setValue(C27099x.m66919i(listMo24998Z, false, 2, null));
        m25024q1().m99543d(CollectionsKt.mutableListOf(dictEntity));
        InterfaceC44978c.m99463X(this.f22750e, listMo24998Z, null, null, 6, null);
        return listMo24998Z;
    }

    @Override // th.InterfaceC44974a
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo24999a(@NotNull Map<String, String> map) throws Throwable {
        Map<String, String> linkedHashMap;
        Intrinsics.checkNotNullParameter(map, "map");
        if (!KuMexDepend.f30378a.m35905g().c()) {
            m25034y1(map);
            return null;
        }
        if (map.containsKey("isNetwork") && !Boolean.parseBoolean(C27041f.m66668h(map.get("isNetwork")))) {
            m25034y1(map);
            this.f22748c.compareAndSet(false, true);
            return null;
        }
        if (map.containsKey("leverage")) {
            linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.putAll(map);
            linkedHashMap.put("defaultLeverage", C27041f.m66668h(linkedHashMap.remove("leverage")));
        } else {
            linkedHashMap = map;
        }
        Object objMo20620a = BrokerConfig.f19211a.m20201d().mo4515x() == MultiBizType.COPY_TRADING ? ICopyTradingService.f19723a.get().mo20620a(linkedHashMap) : this.f22746a.mo24999a(linkedHashMap);
        m25034y1(map);
        this.f22748c.compareAndSet(false, true);
        return objMo20620a;
    }

    @Override // th.InterfaceC44974a
    /* JADX INFO: renamed from: a0 */
    public long mo25000a0() throws Throwable {
        long jMo25000a0 = this.f22746a.mo25000a0();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(System.currentTimeMillis() - jMo25000a0) < 60000) {
            InterfaceC44978c.m99484r(this.f22750e, new long[]{jCurrentTimeMillis, SystemClock.elapsedRealtime()}, null, null, 6, null);
            return jMo25000a0;
        }
        InterfaceC44978c.m99484r(this.f22750e, new long[]{jMo25000a0, SystemClock.elapsedRealtime()}, null, null, 6, null);
        return jMo25000a0;
    }

    @Override // th.InterfaceC44974a
    @NotNull
    /* JADX INFO: renamed from: b0 */
    public HedgeDiscountRateEntity mo25002b0() throws Throwable {
        HedgeDiscountRateEntity hedgeDiscountRateEntityMo25002b0 = this.f22746a.mo25002b0();
        InterfaceC44978c.m99482p0(this.f22750e, hedgeDiscountRateEntityMo25002b0, null, null, 6, null);
        return hedgeDiscountRateEntityMo25002b0;
    }

    @Override // th.InterfaceC44980d
    /* JADX INFO: renamed from: c */
    public void mo25003c(boolean z11) {
        if (C24129b.m58030b(SiteVisibleConfigKey.Futures)) {
            C27100x0.m66921b(m25028s1(), z11, new Function0() { // from class: th.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PlatformServiceImpl.m24930T1(this.f101376b);
                }
            });
            C27100x0.m66921b("contract_list", z11, new Function0() { // from class: th.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PlatformServiceImpl.m24932U1(this.f101378b);
                }
            });
            C27100x0.m66921b("notice_config", z11, new Function0() { // from class: th.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PlatformServiceImpl.m24934V1(this.f101380b);
                }
            });
        }
    }

    @Override // th.InterfaceC44980d
    @NotNull
    /* JADX INFO: renamed from: d */
    public List<CoinEntity> mo25004d() throws Throwable {
        Object objM66914d;
        C27100x0.m66921b("coin_list", false, new Function0() { // from class: th.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PlatformServiceImpl.m24955m1(this.f101392b);
            }
        });
        List<CoinEntity> list = null;
        List<CoinEntity> listM99460R = InterfaceC44978c.m99460R(this.f22750e, null, null, 3, null);
        if (listM99460R != null && !listM99460R.isEmpty()) {
            return listM99460R;
        }
        DictEntity dictEntityM99544f = m25024q1().m99544f("coin_list");
        if (dictEntityM99544f != null) {
            String value = dictEntityM99544f.getValue();
            try {
                C27099x c27099x = C27099x.f54458a;
                objM66914d = C27099x.m66914d(value, new C13023c().getType());
            } catch (Throwable unused) {
                objM66914d = null;
            }
            List<CoinEntity> list2 = (List) objM66914d;
            if (list2 != null) {
                InterfaceC44978c.m99463X(this.f22750e, list2, null, null, 6, null);
                list = list2;
            }
        }
        return (list == null || list.isEmpty()) ? CollectionsKt.emptyList() : list;
    }

    @Override // th.InterfaceC44980d
    @NotNull
    /* JADX INFO: renamed from: d0 */
    public Map<String, SymbolConfig> mo25005d0(@Nullable Boolean bool) throws Throwable {
        LeverageConfig leverageConfigM99476j0;
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        if (!kuMexDepend.m35905g().c() || TextUtils.isEmpty(kuMexDepend.m35905g().d())) {
            return new HashMap();
        }
        ArrayList arrayList = new ArrayList();
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            arrayList.addAll(m25015j1());
        }
        try {
            leverageConfigM99476j0 = new LeverageConfig(kuMexDepend.m35905g().d(), Boolean.valueOf(kuMexDepend.m35902d().mo43964k()), this.f22746a.mo24991S(), Integer.valueOf(kuMexDepend.m35902d().mo43957d()));
        } catch (Throwable th2) {
            C44128b.m97264h(th2);
            leverageConfigM99476j0 = InterfaceC44978c.m99476j0(this.f22750e, null, null, 3, null);
        }
        LeverageConfig leverageConfig = leverageConfigM99476j0;
        InterfaceC44978c.m99459Q(this.f22750e, leverageConfig, null, null, 6, null);
        String str = this.f22748c.compareAndSet(true, false) ? "0" : "60000";
        Map<String, SymbolConfig> mapMo20621b = BrokerConfig.f19211a.m20201d().mo4515x() == MultiBizType.COPY_TRADING ? ICopyTradingService.f19723a.get().mo20621b(str) : this.f22746a.mo25001b(str);
        Map<String, SymbolConfig> leverage = leverageConfig.getLeverage();
        if (leverage == null) {
            leverage = new HashMap<>();
        }
        Map<String, SymbolConfig> mapM99536a = C44986g.m99536a(mapMo20621b, leverage);
        if (Intrinsics.areEqual(bool, Boolean.TRUE) && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                SymbolConfig symbolConfig = mapM99536a.get((String) it.next());
                if (symbolConfig != null) {
                    symbolConfig.put("favourite", CredentialEntry.TRUE_STRING);
                }
            }
        }
        DictEntity dictEntity = new DictEntity();
        dictEntity.setKey("config_list");
        dictEntity.setValue(C27099x.m66919i(mapM99536a, false, 2, null));
        m25024q1().m99543d(CollectionsKt.mutableListOf(dictEntity));
        InterfaceC44978c.m99487u(this.f22750e, mapM99536a, null, null, 6, null);
        return mapM99536a;
    }

    @Override // th.InterfaceC44980d
    /* JADX INFO: renamed from: e */
    public void mo25006e() {
        C27100x0.m66921b("SERVER_TIME", false, new Function0() { // from class: th.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PlatformServiceImpl.m24938Z0(this.f101382b);
            }
        });
        if (m25024q1().m99544f("config_list") == null) {
            C27100x0.m66921b(m25028s1(), false, new Function0() { // from class: th.p
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PlatformServiceImpl.m24939a1(this.f101383b);
                }
            });
        }
        if (m25024q1().m99544f("coin_list") == null) {
            C27100x0.m66921b("coin_list", false, new Function0() { // from class: th.q
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PlatformServiceImpl.m24940b1(this.f101385b);
                }
            });
        }
        if (m25024q1().m99544f("contract_list") == null) {
            C27100x0.m66921b("contract_list", false, new Function0() { // from class: th.r
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PlatformServiceImpl.m24941c1(this.f101387b);
                }
            });
        }
        C27100x0.m66921b("fetchFeatureAvailable", false, new Function0() { // from class: th.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PlatformServiceImpl.m24942d1();
            }
        });
        if (z.a()) {
            C27100x0.m66921b("StrategyOrderConfig", false, new Function0() { // from class: th.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PlatformServiceImpl.m24943e1(this.f101390b);
                }
            });
        }
    }

    @Override // th.InterfaceC44980d
    @SuppressLint({"WrongConstant"})
    @NotNull
    /* JADX INFO: renamed from: e0 */
    public Observable<ContractMaintainEntity> mo25007e0() {
        Request.Companion companion = Request.INSTANCE;
        C19406c c19406c = new C19406c(companion.subscribe(new HeartbeatRequest("subscribe", m25026r1().m99531a(), false, false, 0, 30000, 28, null), "/contract/normal"), companion.unsubscribe(new HeartbeatRequest("unsubscribe", m25026r1().m99531a(), false, false, 0, 30000, 28, null), "/contract/normal"), null, false, m25022p1(), 12, null);
        final Function1 function1 = new Function1() { // from class: th.w0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(PlatformServiceImpl.m24944f1((Message) obj));
            }
        };
        Observable<Message> observableDebounce = c19406c.filter(new Predicate() { // from class: th.x0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return PlatformServiceImpl.m24945g1(function1, obj);
            }
        }).debounce(5L, TimeUnit.SECONDS);
        final Function1 function2 = new Function1() { // from class: th.y0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlatformServiceImpl.m24946h1(this.f101398b, (Message) obj);
            }
        };
        Observable map = observableDebounce.map(new Function() { // from class: th.k
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return PlatformServiceImpl.m24948i1(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // th.InterfaceC44974a
    @GET("v1/platform-resource-position/position")
    @NotNull
    /* JADX INFO: renamed from: f */
    public Map<String, List<ResourcePositionEntity>> mo25008f(@NotNull @Query("code") String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return this.f22746a.mo25008f(code);
    }

    @Override // th.InterfaceC44974a
    @NotNull
    /* JADX INFO: renamed from: g */
    public SystemConfig mo25010g() throws Throwable {
        SystemConfig systemConfigMo25010g = this.f22746a.mo25010g();
        InterfaceC44978c.m99475j(this.f22750e, systemConfigMo25010g, null, null, 6, null);
        return systemConfigMo25010g;
    }

    @Override // th.InterfaceC44974a
    @Headers({"Cache-Time: 1000", "X-KC-CDN-SITE-TYPE: global"})
    @GET("discover-front/trading/item")
    @NotNull
    /* JADX INFO: renamed from: g0 */
    public Observable<BaseEntity<MarketListEntityItem>> mo25011g0(@NotNull @Query("datasource") String datasource, @Nullable @Query("symbol") String str, @NotNull @Query("customizations") String customizations) {
        Intrinsics.checkNotNullParameter(datasource, "datasource");
        Intrinsics.checkNotNullParameter(customizations, "customizations");
        return this.f22746a.mo25011g0(datasource, str, customizations);
    }

    @Override // th.InterfaceC44980d
    /* JADX INFO: renamed from: i */
    public void mo25013i() {
        this.f22748c.compareAndSet(false, true);
    }

    /* JADX INFO: renamed from: j1 */
    public final List<String> m25015j1() throws Throwable {
        Object objM66914d = null;
        Map mapM99483q0 = InterfaceC44978c.m99483q0(this.f22750e, null, null, 3, null);
        if (!mapM99483q0.isEmpty()) {
            return CollectionsKt.toMutableList((Collection) C37570e.m84693h(mapM99483q0));
        }
        DictEntity dictEntityM99544f = m25024q1().m99544f("config_list");
        if (dictEntityM99544f != null) {
            String value = dictEntityM99544f.getValue();
            try {
                C27099x c27099x = C27099x.f54458a;
                objM66914d = C27099x.m66914d(value, new C13021a().getType());
            } catch (Throwable unused) {
            }
            Map map = (Map) objM66914d;
            if (map != null) {
                return CollectionsKt.toMutableList((Collection) C37570e.m84693h(map));
            }
        }
        return CollectionsKt.emptyList();
    }

    @Override // th.InterfaceC44980d
    @NotNull
    /* JADX INFO: renamed from: k */
    public List<ContractEntity> mo25016k() throws Throwable {
        C27100x0.m66921b("contract_list", false, new Function0() { // from class: th.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PlatformServiceImpl.m24959o1(this.f101373b);
            }
        });
        List<ContractEntity> listEmptyList = null;
        Object objM66914d = null;
        List<ContractEntity> listM99471g = InterfaceC44978c.m99471g(this.f22750e, null, null, 3, null);
        if (listM99471g != null && !listM99471g.isEmpty()) {
            return listM99471g;
        }
        DictEntity dictEntityM99544f = m25024q1().m99544f("contract_list");
        if (dictEntityM99544f != null) {
            String value = dictEntityM99544f.getValue();
            if (value == null || value.length() == 0) {
                listEmptyList = CollectionsKt.emptyList();
            } else {
                String value2 = dictEntityM99544f.getValue();
                try {
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(value2, new C13025e().getType());
                } catch (Throwable unused) {
                }
                List<ContractEntity> list = (List) objM66914d;
                if (list != null && !list.isEmpty()) {
                    InterfaceC44978c.m99470f0(this.f22750e, list, null, null, 6, null);
                }
                listEmptyList = list;
            }
        }
        return (listEmptyList == null || listEmptyList.isEmpty()) ? CollectionsKt.emptyList() : listEmptyList;
    }

    @Override // th.InterfaceC44980d
    /* JADX INFO: renamed from: l */
    public void mo25017l(@NotNull String primarySymbol, @NotNull String leverage) throws Throwable {
        Intrinsics.checkNotNullParameter(primarySymbol, "primarySymbol");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Map mapM99483q0 = InterfaceC44978c.m99483q0(this.f22750e, null, null, 3, null);
        if (!TypeIntrinsics.isMutableMap(mapM99483q0)) {
            InterfaceC44978c.m99487u(this.f22750e, new HashMap(mapM99483q0), null, null, 6, null);
        }
        m25034y1(MapsKt.hashMapOf(TuplesKt.m90091to("symbol", CollectionsKt.joinToString$default(SetsKt.plus((Set<? extends String>) InterfaceC44978c.m99483q0(this.f22750e, null, null, 3, null).keySet(), primarySymbol), ",", null, null, 0, null, null, 62, null)), TuplesKt.m90091to("leverage", leverage)));
    }

    @Override // th.InterfaceC44974a
    @Headers({"Cache-Time: 30000"})
    @GET("v1/kumex/announcement")
    @NotNull
    /* JADX INFO: renamed from: m */
    public NoticeEntity mo25018m() {
        return this.f22746a.mo25018m();
    }

    @Override // th.InterfaceC44980d
    @NotNull
    /* JADX INFO: renamed from: n */
    public NoticeConfig mo25019n() {
        return InterfaceC44978c.m99472g0(this.f22750e, null, null, 3, null);
    }

    @Override // th.InterfaceC44980d
    /* JADX INFO: renamed from: o */
    public boolean mo25020o() {
        return C38057a.f85671a.m85928a("kcApp.B6FuturesTrade.BackhandTrading", true) && BrokerConfig.f19211a.m20201d().mo20240o();
    }

    @Override // th.InterfaceC44980d
    @NotNull
    /* JADX INFO: renamed from: p */
    public Observable<ContractMaintainEntity> mo25021p() {
        return InterfaceC44978c.m99477k0(this.f22750e, null, null, 3, null);
    }

    /* JADX INFO: renamed from: p1 */
    public final InterfaceC37236a m25022p1() {
        return (InterfaceC37236a) this.f22752g.getValue();
    }

    @Override // th.InterfaceC44974a
    @NotNull
    /* JADX INFO: renamed from: q */
    public NoticeConfig mo25023q() throws Throwable {
        NoticeConfig noticeConfigMo25023q = this.f22746a.mo25023q();
        InterfaceC44978c.m99455H(this.f22750e, noticeConfigMo25023q, null, null, 6, null);
        return noticeConfigMo25023q;
    }

    /* JADX INFO: renamed from: q1 */
    public final C44990i m25024q1() {
        return (C44990i) this.f22749d.getValue();
    }

    @Override // th.InterfaceC44974a
    @NotNull
    /* JADX INFO: renamed from: r */
    public List<ContractEntity> mo25025r(@NotNull Map<String, String> headers) throws Throwable {
        Intrinsics.checkNotNullParameter(headers, "headers");
        List<ContractEntity> listMo25025r = this.f22746a.mo25025r(headers);
        m25032v1(listMo25025r);
        return listMo25025r;
    }

    /* JADX INFO: renamed from: r1 */
    public final InterfaceC44982e m25026r1() {
        Object value = this.f22751f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (InterfaceC44982e) value;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009a  */
    @Override // th.InterfaceC44980d
    @Nullable
    /* JADX INFO: renamed from: s */
    public CoinEntity mo25027s(@NotNull String currency, boolean z11) throws Throwable {
        Object next;
        CoinEntity coinEntity;
        Object next2;
        CoinEntity coinEntity2;
        Object objM66914d;
        Object next3;
        CoinEntity coinEntity3;
        CoinEntity coinEntity4;
        Intrinsics.checkNotNullParameter(currency, "currency");
        C27100x0.m66921b("coin_list", false, new Function0() { // from class: th.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PlatformServiceImpl.m24953l1(this.f101395b);
            }
        });
        CoinEntity coinEntity5 = null;
        Iterator it = InterfaceC44978c.m99460R(this.f22750e, null, null, 3, null).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            coinEntity4 = (CoinEntity) next;
            if (Intrinsics.areEqual(coinEntity4.getCurrency(), currency)) {
                break;
            }
        } while (!Intrinsics.areEqual(coinEntity4.getCode(), currency));
        CoinEntity coinEntity6 = (CoinEntity) next;
        if (coinEntity6 != null) {
            return coinEntity6;
        }
        DictEntity dictEntityM99544f = m25024q1().m99544f("coin_list");
        if (dictEntityM99544f != null) {
            String value = dictEntityM99544f.getValue();
            try {
                C27099x c27099x = C27099x.f54458a;
                objM66914d = C27099x.m66914d(value, new C13022b().getType());
            } catch (Throwable unused) {
                objM66914d = null;
            }
            List list = (List) objM66914d;
            if (list != null) {
                InterfaceC44978c.m99463X(this.f22750e, list, null, null, 6, null);
                Iterator it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it2.next();
                    coinEntity3 = (CoinEntity) next3;
                    if (Intrinsics.areEqual(coinEntity3.getCurrency(), currency)) {
                        break;
                    }
                } while (!Intrinsics.areEqual(coinEntity3.getCode(), currency));
                coinEntity = (CoinEntity) next3;
            } else {
                coinEntity = null;
            }
        } else {
            coinEntity = null;
        }
        if (coinEntity != null) {
            return coinEntity;
        }
        if (z11) {
            try {
                Iterator it3 = InterfaceC44974a.m99451w(this, null, 1, null).iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    coinEntity2 = (CoinEntity) next2;
                    if (Intrinsics.areEqual(coinEntity2.getCurrency(), currency)) {
                        break;
                    }
                } while (!Intrinsics.areEqual(coinEntity2.getCode(), currency));
                coinEntity5 = (CoinEntity) next2;
            } catch (Throwable th2) {
                C44128b.m97264h(th2);
            }
        }
        return coinEntity5;
    }

    /* JADX INFO: renamed from: s1 */
    public final String m25028s1() {
        return (String) this.f22747b.getValue(this, f22745k[0]);
    }

    @Override // th.InterfaceC44980d
    @NotNull
    /* JADX INFO: renamed from: t */
    public SystemConfig mo25029t() {
        return InterfaceC44978c.m99486t0(this.f22750e, null, null, 3, null);
    }

    @Override // th.InterfaceC44974a
    @GET("v1/copyTrading/isPushGuidePopUp")
    @Nullable
    /* JADX INFO: renamed from: u */
    public Boolean mo25030u() {
        return this.f22746a.mo25030u();
    }

    @Override // th.InterfaceC44980d
    /* JADX INFO: renamed from: v */
    public long mo25031v() throws Throwable {
        C27100x0.m66921b("SERVER_TIME", false, new Function0() { // from class: th.y
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PlatformServiceImpl.m24965t1(this.f101397b);
            }
        });
        long[] jArrM99466a0 = InterfaceC44978c.m99466a0(this.f22750e, null, null, 3, null);
        long j11 = jArrM99466a0[0];
        return (j11 == 0 && jArrM99466a0[1] == 0) ? System.currentTimeMillis() : j11 + (SystemClock.elapsedRealtime() - jArrM99466a0[1]);
    }

    /* JADX INFO: renamed from: v1 */
    public void m25032v1(@NotNull List<ContractEntity> list) {
        List list2;
        Object objM66914d;
        Intrinsics.checkNotNullParameter(list, "list");
        DictEntity dictEntity = new DictEntity();
        dictEntity.setKey("contract_list");
        dictEntity.setValue(C27099x.m66919i(list, false, 2, null));
        DictEntity dictEntityM99544f = m25024q1().m99544f("contract_list");
        if (dictEntityM99544f != null) {
            try {
                objM66914d = C27099x.m66914d(dictEntityM99544f.getValue(), new C13027g().getType());
            } catch (Throwable unused) {
                objM66914d = null;
            }
            list2 = (List) objM66914d;
        } else {
            list2 = null;
        }
        synchronized (this.f22753h) {
            try {
                List listM66560c = C27024b.m66560c(list);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listM66560c) {
                    if (C37567b.m84625o((ContractEntity) obj)) {
                        arrayList.add(obj);
                    }
                }
                int size = arrayList.size();
                List listM66560c2 = C27024b.m66560c(list2);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listM66560c2) {
                    if (C37567b.m84625o((ContractEntity) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                if (size > arrayList2.size()) {
                    C46894j c46894j = C46894j.f104736a;
                    int iM102323e = C46392a.m102323e(c46894j.m103287z(), 0) + 1;
                    C46392a.m102329l(c46894j.m103287z(), iM102323e);
                    this.f22754i.offer(Integer.valueOf(iM102323e));
                }
                m25024q1().m99543d(CollectionsKt.mutableListOf(dictEntity));
                InterfaceC44978c.m99470f0(this.f22750e, list, null, null, 6, null);
                InterfaceC44978c.m99489x(this.f22750e, C44986g.m99538c(list), null, 2, null);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // th.InterfaceC44974a
    @GET("v1/platform-resource-position/position")
    @NotNull
    /* JADX INFO: renamed from: x */
    public Map<String, List<ResourcePositionEntity>> mo25033x(@NotNull @Query("code") String code, @NotNull @Query("tradeType") String tradeType, @NotNull @Query("symbol") String symbol) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return this.f22746a.mo25033x(code, tradeType, symbol);
    }

    /* JADX INFO: renamed from: y1 */
    public final void m25034y1(Map<String, String> map) throws Throwable {
        Map mapM99483q0 = InterfaceC44978c.m99483q0(this.f22750e, null, null, 3, null);
        Intrinsics.checkNotNull(mapM99483q0, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, com.kubi.kumex.data.platform.model.SymbolConfig>");
        Map mapAsMutableMap = TypeIntrinsics.asMutableMap(mapM99483q0);
        String str = map.get("symbol");
        if (str == null) {
            throw new RuntimeException("symbol为必传字段");
        }
        synchronized (mapAsMutableMap) {
            try {
                for (String str2 : StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null)) {
                    SymbolConfig symbolConfig = (SymbolConfig) mapAsMutableMap.get(str2);
                    if (symbolConfig == null) {
                        symbolConfig = new SymbolConfig();
                    }
                    Iterator<T> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String str3 = (String) entry.getKey();
                        if (!Intrinsics.areEqual(str3, "symbol")) {
                            symbolConfig.put(str3, entry.getValue());
                        }
                    }
                    mapAsMutableMap.put(str2, symbolConfig);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        InterfaceC44978c.m99487u(this.f22750e, mapAsMutableMap, null, null, 6, null);
        C44990i c44990iM25024q1 = m25024q1();
        DictEntity dictEntity = new DictEntity();
        dictEntity.setKey("config_list");
        dictEntity.setValue(C27099x.m66919i(mapAsMutableMap, false, 2, null));
        c44990iM25024q1.m99543d(CollectionsKt.mutableListOf(dictEntity));
    }

    @Override // th.InterfaceC44974a
    @GET("v1/km/trade/configs/strategy")
    @Nullable
    /* JADX INFO: renamed from: z */
    public StrategyOrderConfigEntity mo25035z() {
        return this.f22746a.mo25035z();
    }

    /* JADX INFO: renamed from: I1 */
    public static final Unit m24909I1(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C37214b.m83255a(th2, "observeContractUpdate");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J1 */
    public static final void m24911J1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R1 */
    public static final InterfaceC44982e m24927R1() {
        return (InterfaceC44982e) C42597a.m93390f().create(InterfaceC44982e.class);
    }

    /* JADX INFO: renamed from: V1 */
    public static final Unit m24934V1(PlatformServiceImpl platformServiceImpl) throws Throwable {
        platformServiceImpl.mo25023q();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z0 */
    public static final Unit m24938Z0(PlatformServiceImpl platformServiceImpl) throws Throwable {
        platformServiceImpl.mo25000a0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k1 */
    public static final InterfaceC37236a m24951k1() {
        try {
            return C37237b.m83279b();
        } catch (Throwable unused) {
            C23636b.m56287a();
            BKumexWebSocketStartUpTask bKumexWebSocketStartUpTask = new BKumexWebSocketStartUpTask();
            Application applicationM56287a = C23636b.m56287a();
            Intrinsics.checkNotNullExpressionValue(applicationM56287a, "getApp(...)");
            bKumexWebSocketStartUpTask.run(applicationM56287a);
            return C37237b.m83279b();
        }
    }

    /* JADX INFO: renamed from: t1 */
    public static final Unit m24965t1(PlatformServiceImpl platformServiceImpl) throws Throwable {
        platformServiceImpl.mo25000a0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x1 */
    public static final Unit m24972x1(PlatformServiceImpl platformServiceImpl) throws Throwable {
        platformServiceImpl.mo25023q();
        return Unit.INSTANCE;
    }

    @Override // th.InterfaceC44980d
    @NotNull
    /* JADX INFO: renamed from: A */
    public List<String> mo24976A() {
        return C37570e.m84686a(mo24980G());
    }

    @Override // th.InterfaceC44974a
    @GET("v1/km/user-spread-config")
    @NotNull
    /* JADX INFO: renamed from: C */
    public FuturesSpreadConfigEntity mo24977C(@NotNull @Query("symbol") String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return this.f22746a.mo24977C(symbol);
    }

    @Override // th.InterfaceC44980d
    @Nullable
    /* JADX INFO: renamed from: D */
    public ContractEntity mo24978D(@NotNull String symbol, boolean z11) throws Throwable {
        Object next;
        Object next2;
        Object objM66914d;
        ContractEntity contractEntity;
        Object next3;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        int i11 = 0;
        C27100x0.m66921b("contract_list", false, new Function0() { // from class: th.m0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PlatformServiceImpl.m24957n1(this.f101379b);
            }
        });
        ContractEntity contractEntity2 = null;
        Iterator it = InterfaceC44978c.m99471g(this.f22750e, null, null, 3, null).iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!Intrinsics.areEqual(((ContractEntity) next).getSymbol(), symbol));
        ContractEntity contractEntity3 = (ContractEntity) next;
        if (contractEntity3 == null) {
            DictEntity dictEntityM99544f = m25024q1().m99544f("contract_list");
            if (dictEntityM99544f != null) {
                String value = dictEntityM99544f.getValue();
                try {
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(value, new C13024d().getType());
                } catch (Throwable unused) {
                    objM66914d = null;
                }
                List list = (List) objM66914d;
                if (list != null && !list.isEmpty()) {
                    InterfaceC44978c.m99470f0(this.f22750e, list, null, null, 6, null);
                }
                if (list != null) {
                    Iterator it2 = list.iterator();
                    do {
                        if (it2.hasNext()) {
                            next3 = it2.next();
                        } else {
                            next3 = null;
                            break;
                        }
                    } while (!Intrinsics.areEqual(((ContractEntity) next3).getSymbol(), symbol));
                    contractEntity = (ContractEntity) next3;
                } else {
                    contractEntity = null;
                }
                contractEntity3 = contractEntity;
            } else {
                contractEntity3 = null;
            }
            if (contractEntity3 == null) {
                if (z11) {
                    try {
                        Iterator it3 = InterfaceC44974a.m99452y(this, null, 1, null).iterator();
                        do {
                            if (it3.hasNext()) {
                                next2 = it3.next();
                            } else {
                                next2 = null;
                                break;
                            }
                        } while (!Intrinsics.areEqual(((ContractEntity) next2).getSymbol(), symbol));
                        contractEntity2 = (ContractEntity) next2;
                    } catch (Throwable th2) {
                        C37214b.m83255a(th2, "PlatformServiceImpl-getContract-FetchContractList");
                    }
                }
                contractEntity3 = contractEntity2;
            }
        }
        KunlunTechEventEnum kunlunTechEventEnum = KunlunTechEventEnum.CONTRACT_ENTITY_QUERY;
        if (contractEntity3 == null) {
            i11 = 1;
        }
        C43847h.m96575d(kunlunTechEventEnum, i11);
        return contractEntity3;
    }

    @Override // th.InterfaceC44980d
    @NotNull
    /* JADX INFO: renamed from: G */
    public Map<String, SymbolConfig> mo24980G() throws Throwable {
        Object objM66914d;
        C27100x0.m66921b(m25028s1(), false, new Function0() { // from class: th.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PlatformServiceImpl.m24967u1(this.f101394b);
            }
        });
        Map<String, SymbolConfig> map = null;
        Map<String, SymbolConfig> mapM99483q0 = InterfaceC44978c.m99483q0(this.f22750e, null, null, 3, null);
        if (!mapM99483q0.isEmpty()) {
            return mapM99483q0;
        }
        DictEntity dictEntityM99544f = m25024q1().m99544f("config_list");
        if (dictEntityM99544f != null) {
            String value = dictEntityM99544f.getValue();
            try {
                C27099x c27099x = C27099x.f54458a;
                objM66914d = C27099x.m66914d(value, new C13026f().getType());
            } catch (Throwable unused) {
                objM66914d = null;
            }
            Map<String, SymbolConfig> map2 = (Map) objM66914d;
            if (map2 != null) {
                InterfaceC44978c.m99487u(this.f22750e, map2, null, null, 6, null);
                map = map2;
            }
        }
        if (map == null) {
            return new HashMap();
        }
        return map;
    }

    @Override // th.InterfaceC44980d
    @NotNull
    /* JADX INFO: renamed from: I */
    public Flowable<ContractEntity> mo24982I(@NotNull final String symbol) throws Throwable {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Flowable flowableM99458N = InterfaceC44978c.m99458N(this.f22750e, null, null, 3, null);
        final Function1 function1 = new Function1() { // from class: th.o0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlatformServiceImpl.m24975z1((List) obj);
            }
        };
        Flowable flowableFlatMap = flowableM99458N.flatMap(new Function() { // from class: th.p0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return PlatformServiceImpl.m24893A1(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: th.r0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(PlatformServiceImpl.m24895B1(symbol, (ContractEntity) obj));
            }
        };
        Flowable<ContractEntity> flowableFilter = flowableFlatMap.filter(new Predicate() { // from class: th.s0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return PlatformServiceImpl.m24897C1(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(flowableFilter, "filter(...)");
        return flowableFilter;
    }

    @Override // th.InterfaceC44974a
    @GET("v1/km/contracts/risk-limit")
    @Nullable
    /* JADX INFO: renamed from: L */
    public List<ContractRiskLimitEntity> mo24985L(@NotNull @Query("symbol") String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return this.f22746a.mo24985L(symbol);
    }

    @Override // th.InterfaceC44980d
    /* JADX INFO: renamed from: R */
    public void mo24990R(@NotNull Map<String, String> symbolMap) throws Throwable {
        Intrinsics.checkNotNullParameter(symbolMap, "symbolMap");
        m25034y1(symbolMap);
    }

    @Override // th.InterfaceC44980d
    @Nullable
    /* JADX INFO: renamed from: X */
    public SymbolConfig mo24996X(@NotNull String symbol) {
        Object next;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Iterator<T> it = mo24980G().entrySet().iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!Intrinsics.areEqual(((Map.Entry) next).getKey(), symbol));
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return (SymbolConfig) entry.getValue();
    }

    @Override // th.InterfaceC44980d
    @NotNull
    /* JADX INFO: renamed from: Y */
    public String mo24997Y(@NotNull String symbol) throws Throwable {
        Boolean boolValueOf;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Boolean boolValueOf2 = null;
        ContractMaintainEntity contractMaintainEntityM99461S = InterfaceC44978c.m99461S(this.f22750e, null, null, 3, null);
        List<String> pausedContracts = contractMaintainEntityM99461S.getPausedContracts();
        if (pausedContracts != null) {
            boolValueOf = Boolean.valueOf(pausedContracts.contains(symbol));
        } else {
            boolValueOf = null;
        }
        if (C27025c.m66566d(boolValueOf)) {
            return "Paused";
        }
        List<String> cancelOnlyContracts = contractMaintainEntityM99461S.getCancelOnlyContracts();
        if (cancelOnlyContracts != null) {
            boolValueOf2 = Boolean.valueOf(cancelOnlyContracts.contains(symbol));
        }
        if (C27025c.m66566d(boolValueOf2)) {
            return "CancelOnly";
        }
        return "Open";
    }

    @Override // th.InterfaceC44974a
    @GET("v1/kumex/user-contracts-config")
    @NotNull
    /* JADX INFO: renamed from: b */
    public Map<String, SymbolConfig> mo25001b(@Header("Cache-Time") @NotNull String time) {
        Intrinsics.checkNotNullParameter(time, "time");
        return this.f22746a.mo25001b(time);
    }

    @Override // th.InterfaceC44980d
    @NotNull
    /* JADX INFO: renamed from: f0 */
    public Flowable<SymbolConfig> mo25009f0(@NotNull final String symbol) throws Throwable {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Flowable flowableM99478l = InterfaceC44978c.m99478l(this.f22750e, null, null, 3, null);
        final Function1 function1 = new Function1() { // from class: th.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlatformServiceImpl.m24913K1((Map) obj);
            }
        };
        Flowable flowableFlatMap = flowableM99478l.flatMap(new Function() { // from class: th.f0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return PlatformServiceImpl.m24915L1(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: th.q0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(PlatformServiceImpl.m24917M1(symbol, (Map.Entry) obj));
            }
        };
        Flowable flowableFilter = flowableFlatMap.filter(new Predicate() { // from class: th.t0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return PlatformServiceImpl.m24919N1(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: th.u0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlatformServiceImpl.m24921O1((Map.Entry) obj);
            }
        };
        Flowable<SymbolConfig> map = flowableFilter.map(new Function() { // from class: th.v0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return PlatformServiceImpl.m24923P1(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // th.InterfaceC44980d
    /* JADX INFO: renamed from: h */
    public void mo25012h() {
        C42916f.m94127f().scheduleDirect(new Runnable() { // from class: th.z
            @Override // java.lang.Runnable
            public final void run() {
                PlatformServiceImpl.m24970w1(this.f101399b);
            }
        });
    }

    @Override // th.InterfaceC44980d
    @NotNull
    /* JADX INFO: renamed from: j */
    public InterfaceC41634e<ContractMaintainEntity> mo25014j() {
        return C41636g.m90894R(RxConvertKt.m91205b(mo25007e0()), RxConvertKt.m91205b(mo25021p()));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PlatformServiceImpl() {
        Object objCreate = C42597a.m93391g().create(InterfaceC44974a.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        this((InterfaceC44974a) objCreate);
    }
}
