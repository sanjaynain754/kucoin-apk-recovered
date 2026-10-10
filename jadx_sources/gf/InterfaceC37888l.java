package gf;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.AlphaCurrencyInfoEntity;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: gf.l */
/* JADX INFO: compiled from: ISymbolsCoinDao.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J4\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u001e\b\u0002\u0010\u0006\u001a\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH&J\u0014\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH&J\u0018\u0010\u0012\u001a\u00020\u00032\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010H&J\u0012\u0010\u0012\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH&J\u001a\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u000eH&J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\u0006\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000bH&J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H&J\b\u0010\u001d\u001a\u00020\u0003H&J(\u0010\u001e\u001a\u00020\u00032\u001e\b\u0002\u0010\u0006\u001a\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H&J#\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0002\u0010$J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0010H&J \u0010&\u001a\u00020\u00032\u0016\b\u0002\u0010'\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u0010\u0018\u00010(H&J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0010H&J\"\u0010+\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010'\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u0010\u0018\u00010(H&J\u0012\u0010,\u001a\u0004\u0018\u00010)2\u0006\u0010\u0016\u001a\u00020\u000eH&J\u001e\u0010-\u001a\b\u0012\u0004\u0012\u00020)0\u00102\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010/\u001a\u000200H&J,\u00101\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u00102\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u0010\u0018\u00010(2\b\b\u0002\u00104\u001a\u00020\u000bH&J\u0012\u00105\u001a\u0004\u0018\u0001032\u0006\u00106\u001a\u00020\u000eH&J\u0018\u00107\u001a\u0004\u0018\u0001032\u0006\u00106\u001a\u00020\u000eH¦@¢\u0006\u0002\u00108J\n\u00109\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010:\u001a\u0004\u0018\u00010;2\u0006\u0010\r\u001a\u00020\u000eH&J\n\u0010<\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u000eH&J\n\u0010@\u001a\u0004\u0018\u00010\u0005H&J\u0016\u0010A\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006BÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/data/coin/ISymbolsCoinDao;", "", "initDefaultSymbolsList", "", "fetchSymbolInfoList", "Lio/reactivex/disposables/Disposable;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/SymbolInfoEntity;", "ignoreState", "", "getSymbolEntityByCode", "code", "", "getSymbolPairList", "", "baseCurrency", "updateSymbolEntity", "list", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "getRecommendsSymbolByCurrency", FirebaseAnalytics.Param.CURRENCY, "getBestSymbolByCurrency", "defaultSymbol", "getSymbolEntityByBaseCurrency", "isMargin", "isIsolatedMargin", "getIsolateSymbols", "initDefaultAlphaCurrencyList", "fetchAlphaCurrencyList", "Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;", "getAlphaCurrencyEntity", "currencySeq", "", "isQuoteCurrency", "(Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;", "getAlphaCurrencyInfoListSync", "getLocaleCoinList", "callBack", "Lio/reactivex/functions/Consumer;", "Lcom/kubi/data/entity/CoinInfoEntity;", "getLocaleCoinListSync", "fetchCoinList", "getCoinEntityByCode", "searchCoinListByKeyword", "keyword", BridgeParamKeyKt.MAX_COUNT, "", "getTradeBeanList", "resultCallBack", "Lcom/kubi/data/entity/TradeItemBean;", "latest", "getTradeItem", "item", "getTradeItemAwait", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchEtfCoinList", "getEtfEntityByCode", "Lcom/kubi/data/entity/EtfCoinEntity;", "fetchQuoteLimitConfig", "getQuoteLimitSize", "", "quoteCurrency", "initQuoteLimitConfig", "onReceiveSymbolsCoinPush", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC37888l {
    /* JADX INFO: renamed from: a */
    void mo85590a(@Nullable Consumer<List<CoinInfoEntity>> consumer);

    @NotNull
    /* JADX INFO: renamed from: b */
    String mo85591b(@NotNull String str, @NotNull String str2);

    @NotNull
    /* JADX INFO: renamed from: c */
    List<SymbolInfoEntity> mo85592c(@NotNull String str, boolean z11, boolean z12);

    /* JADX INFO: renamed from: e */
    void mo85593e(@Nullable Function1<? super ArrayList<AlphaCurrencyInfoEntity>, Unit> function1);

    @Nullable
    /* JADX INFO: renamed from: g */
    Disposable mo85594g(@Nullable Consumer<List<TradeItemBean>> consumer, boolean z11);

    @Nullable
    /* JADX INFO: renamed from: j */
    Disposable mo85595j(@Nullable Consumer<List<CoinInfoEntity>> consumer);

    @Nullable
    /* JADX INFO: renamed from: m */
    Disposable mo85596m(@Nullable Function1<? super ArrayList<SymbolInfoEntity>, Unit> function1, boolean z11);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    static /* synthetic */ void m85583d(InterfaceC37888l interfaceC37888l, Consumer consumer, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLocaleCoinList");
        }
        if ((i11 & 1) != 0) {
            consumer = null;
        }
        interfaceC37888l.mo85590a(consumer);
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ List m85584f(InterfaceC37888l interfaceC37888l, String str, boolean z11, boolean z12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSymbolEntityByBaseCurrency");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        return interfaceC37888l.mo85592c(str, z11, z12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    static /* synthetic */ Disposable m85585h(InterfaceC37888l interfaceC37888l, Function1 function1, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchSymbolInfoList");
        }
        if ((i11 & 1) != 0) {
            function1 = null;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return interfaceC37888l.mo85596m(function1, z11);
    }

    /* JADX INFO: renamed from: i */
    static /* synthetic */ String m85586i(InterfaceC37888l interfaceC37888l, String str, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBestSymbolByCurrency");
        }
        if ((i11 & 2) != 0) {
            str2 = "BTC-USDT";
        }
        return interfaceC37888l.mo85591b(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    static /* synthetic */ Disposable m85587k(InterfaceC37888l interfaceC37888l, Consumer consumer, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTradeBeanList");
        }
        if ((i11 & 1) != 0) {
            consumer = null;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return interfaceC37888l.mo85594g(consumer, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    static /* synthetic */ void m85588l(InterfaceC37888l interfaceC37888l, Function1 function1, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchAlphaCurrencyList");
        }
        if ((i11 & 1) != 0) {
            function1 = null;
        }
        interfaceC37888l.mo85593e(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    static /* synthetic */ Disposable m85589n(InterfaceC37888l interfaceC37888l, Consumer consumer, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCoinList");
        }
        if ((i11 & 1) != 0) {
            consumer = null;
        }
        return interfaceC37888l.mo85595j(consumer);
    }
}
