package gf;

import android.annotation.SuppressLint;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.coin.PushDelay;
import com.kubi.data.coin.info.AlphaCurrencyInfo;
import com.kubi.data.coin.info.EtfInfo;
import com.kubi.data.coin.info.ExchangeRateInfo;
import com.kubi.data.coin.info.OrderLimitInfo;
import com.kubi.data.coin.info.SymbolsInfo;
import com.kubi.data.coin.info.TradeQuotesInfo;
import com.kubi.data.entity.AlphaCurrencyInfoEntity;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.EtfCoinEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.data.exception.CoinDataMessage;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.utils.C27100x0;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38184b;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: renamed from: gf.x */
/* JADX INFO: compiled from: SymbolsCoinDaoNew.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J0\u0010\b\u001a\u0004\u0018\u00010\t2\u001c\u0010\n\u001a\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u0015\u001a\u00020\u00072\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0013H\u0016J\u0012\u0010\u0015\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0016J\u0018\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005H\u0016J&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000fH\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u0013H\u0016J\b\u0010 \u001a\u00020\u0007H\u0016J&\u0010!\u001a\u00020\u00072\u001c\u0010\n\u001a\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010\f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bH\u0016J#\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0002\u0010'J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\"0\u0013H\u0016J\u001e\u0010)\u001a\u00020\u00072\u0014\u0010*\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u0013\u0018\u00010+H\u0016J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u0013H\u0016J \u0010.\u001a\u0004\u0018\u00010\t2\u0014\u0010*\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u0013\u0018\u00010+H\u0016J\u0012\u0010/\u001a\u0004\u0018\u00010,2\u0006\u0010\u0019\u001a\u00020\u0005H\u0016J\u001e\u00100\u001a\b\u0012\u0004\u0012\u00020,0\u00132\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u000203H\u0016J(\u00104\u001a\u0004\u0018\u00010\t2\u0014\u00105\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u0013\u0018\u00010+2\u0006\u00107\u001a\u00020\u000fH\u0016J\u0012\u00108\u001a\u0004\u0018\u0001062\u0006\u00109\u001a\u00020\u0005H\u0016J\u0018\u0010:\u001a\u0004\u0018\u0001062\u0006\u00109\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010;J\n\u0010<\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010=\u001a\u0004\u0018\u00010>2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\n\u0010?\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010C\u001a\u0004\u0018\u00010\tH\u0016J\u0016\u0010D\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0013H\u0016J\u0016\u0010E\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006F"}, m90084d2 = {"Lcom/kubi/data/coin/SymbolsCoinDaoNew;", "Lcom/kubi/data/coin/ISymbolsCoinDao;", "<init>", "()V", "TAG", "", "initDefaultSymbolsList", "", "fetchSymbolInfoList", "Lio/reactivex/disposables/Disposable;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/SymbolInfoEntity;", "ignoreState", "", "getSymbolEntityByCode", "code", "getSymbolPairList", "", "baseCurrency", "updateSymbolEntity", "list", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "getRecommendsSymbolByCurrency", FirebaseAnalytics.Param.CURRENCY, "getBestSymbolByCurrency", "defaultSymbol", "getSymbolEntityByBaseCurrency", "isMargin", "isIsolatedMargin", "getIsolateSymbols", "initDefaultAlphaCurrencyList", "fetchAlphaCurrencyList", "Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;", "getAlphaCurrencyEntity", "currencySeq", "", "isQuoteCurrency", "(Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;", "getAlphaCurrencyInfoListSync", "getLocaleCoinList", "callBack", "Lio/reactivex/functions/Consumer;", "Lcom/kubi/data/entity/CoinInfoEntity;", "getLocaleCoinListSync", "fetchCoinList", "getCoinEntityByCode", "searchCoinListByKeyword", "keyword", BridgeParamKeyKt.MAX_COUNT, "", "getTradeBeanList", "resultCallBack", "Lcom/kubi/data/entity/TradeItemBean;", "latest", "getTradeItem", "item", "getTradeItemAwait", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchEtfCoinList", "getEtfEntityByCode", "Lcom/kubi/data/entity/EtfCoinEntity;", "fetchQuoteLimitConfig", "getQuoteLimitSize", "", "quoteCurrency", "initQuoteLimitConfig", "onReceiveSymbolsCoinPush", "reportPushDelay", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"KCCyclomaticComplexityCheck"})
@SourceDebugExtension({"SMAP\nSymbolsCoinDaoNew.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SymbolsCoinDaoNew.kt\ncom/kubi/data/coin/SymbolsCoinDaoNew\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 CoinDataIssue.kt\ncom/kubi/data/exception/CoinDataIssueKt\n*L\n1#1,277:1\n1#2:278\n1669#3,8:279\n1669#3,8:287\n1669#3,8:295\n1669#3,8:303\n1056#3:311\n84#4:312\n51#5,2:313\n*S KotlinDebug\n*F\n+ 1 SymbolsCoinDaoNew.kt\ncom/kubi/data/coin/SymbolsCoinDaoNew\n*L\n132#1:279,8\n135#1:287,8\n138#1:295,8\n147#1:303,8\n148#1:311\n257#1:312\n267#1:313,2\n*E\n"})
public final class C37900x implements InterfaceC37888l {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37900x f85280a = new C37900x();

    /* JADX INFO: renamed from: gf.x$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SymbolsCoinDaoNew.kt\ncom/kubi/data/coin/SymbolsCoinDaoNew\n*L\n1#1,328:1\n149#2,6:329\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Code duplicated, block: B:16:0x004d  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int i11;
            String quoteCurrency = ((SymbolInfoEntity) t11).getQuoteCurrency();
            Intrinsics.checkNotNullExpressionValue(quoteCurrency, "getQuoteCurrency(...)");
            Locale locale = Locale.ROOT;
            String upperCase = quoteCurrency.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            int iHashCode = upperCase.hashCode();
            int i12 = 2;
            if (iHashCode != 66097) {
                if (iHashCode != 68985) {
                    if (iHashCode == 2614190 && upperCase.equals("USDT")) {
                        i11 = -1;
                    } else {
                        i11 = 2;
                    }
                } else if (upperCase.equals("ETH")) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
            } else if (upperCase.equals("BTC")) {
                i11 = 0;
            } else {
                i11 = 2;
            }
            Integer numValueOf = Integer.valueOf(i11);
            String quoteCurrency2 = ((SymbolInfoEntity) t12).getQuoteCurrency();
            Intrinsics.checkNotNullExpressionValue(quoteCurrency2, "getQuoteCurrency(...)");
            String upperCase2 = quoteCurrency2.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            int iHashCode2 = upperCase2.hashCode();
            if (iHashCode2 != 66097) {
                if (iHashCode2 != 68985) {
                    if (iHashCode2 == 2614190 && upperCase2.equals("USDT")) {
                        i12 = -1;
                    }
                } else if (upperCase2.equals("ETH")) {
                    i12 = 1;
                }
            } else if (upperCase2.equals("BTC")) {
                i12 = 0;
            }
            return ComparisonsKt.compareValues(numValueOf, Integer.valueOf(i12));
        }
    }

    /* JADX INFO: renamed from: B */
    public static final boolean m85619B(String str, SymbolInfoEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getQuoteCurrency(), str);
    }

    /* JADX INFO: renamed from: C */
    public static final boolean m85620C(String str, SymbolInfoEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getBaseCurrency(), str);
    }

    /* JADX INFO: renamed from: G */
    public static final boolean m85621G(SymbolInfoEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.isIsolatedMarginEnabled();
    }

    /* JADX INFO: renamed from: K */
    public static final boolean m85622K(String str, SymbolInfoEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getBaseCurrency(), str);
    }

    /* JADX INFO: renamed from: L */
    public static final boolean m85623L(String str, SymbolInfoEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getBaseCurrency(), str) && it.isMarginEnabled();
    }

    /* JADX INFO: renamed from: M */
    public static final boolean m85624M(String str, SymbolInfoEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getBaseCurrency(), str) && it.isIsolatedMarginTradeEnabled();
    }

    /* JADX INFO: renamed from: N */
    public static final boolean m85625N(String str, SymbolInfoEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getBaseCurrency(), str) && it.isEnableTrading();
    }

    /* JADX INFO: renamed from: Q */
    public static final boolean m85626Q(String str, SymbolInfoEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getBaseCurrency(), str) || Intrinsics.areEqual(it.getBaseCurrencyName(), str);
    }

    /* JADX INFO: renamed from: V */
    public static final Unit m85627V(List list) {
        Long unionUpdatedAt;
        long jM102324f = C46392a.m102324f(SymbolsInfo.f21457a.m23636z(), 0L);
        if (jM102324f > 0) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                unionUpdatedAt = ((SymbolInfoEntity) it.next()).getUnionUpdatedAt();
                while (it.hasNext()) {
                    Long unionUpdatedAt2 = ((SymbolInfoEntity) it.next()).getUnionUpdatedAt();
                    if (unionUpdatedAt.compareTo(unionUpdatedAt2) > 0) {
                        unionUpdatedAt = unionUpdatedAt2;
                    }
                }
            } else {
                unionUpdatedAt = null;
            }
            if (unionUpdatedAt != null) {
                long jLongValue = unionUpdatedAt.longValue();
                C43840a.m96550d("push min timeline:" + jM102324f + " -> " + jLongValue, "SymbolsCoinDao");
                long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
                if (jCurrentTimeMillis < 60000) {
                    C37901y.m85657b(PushDelay.L1);
                } else if (jCurrentTimeMillis < 300000) {
                    C37901y.m85657b(PushDelay.L5);
                } else if (jCurrentTimeMillis < 600000) {
                    C37901y.m85657b(PushDelay.L10);
                } else {
                    C37901y.m85657b(PushDelay.M10);
                    C43846g.m96568c(new CoinDataMessage("receive push delay:" + ((SymbolInfoEntity) list.get(0)).getSymbol() + '|' + ((SymbolInfoEntity) list.get(0)).getUnionUpdatedAt(), "SymbolsCoinDao", false, 4, null), null, 2, null);
                }
            }
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public List<AlphaCurrencyInfoEntity> m85637A() {
        return AlphaCurrencyInfo.f21428a.m23495l();
    }

    @Nullable
    /* JADX INFO: renamed from: D */
    public CoinInfoEntity m85638D(@NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return ExchangeRateInfo.f21433a.m23529v(currency);
    }

    @Nullable
    /* JADX INFO: renamed from: E */
    public EtfCoinEntity m85639E(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return EtfInfo.f21447a.m23601o(code);
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public List<SymbolInfoEntity> m85640F() {
        List<SymbolInfoEntity> listM23631u = SymbolsInfo.f21457a.m23631u(new Function1() { // from class: gf.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C37900x.m85621G((SymbolInfoEntity) obj));
            }
        });
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM23631u) {
            if (hashSet.add(((SymbolInfoEntity) obj).getCode())) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.sortedWith(arrayList, new a());
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public List<CoinInfoEntity> m85641H() {
        return ExchangeRateInfo.f21433a.m23524B();
    }

    /* JADX INFO: renamed from: I */
    public double m85642I(@Nullable String str) {
        return OrderLimitInfo.f21441a.m23583n(str);
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public String m85643J(@NotNull final String currency) {
        Object obj;
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(currency, "currency");
        C38184b c38184b = C38184b.f85884a;
        if (Intrinsics.areEqual(currency, c38184b.m86147b())) {
            return "BTC-" + c38184b.m86147b();
        }
        List<SymbolInfoEntity> listM23631u = SymbolsInfo.f21457a.m23631u(new Function1() { // from class: gf.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(C37900x.m85622K(currency, (SymbolInfoEntity) obj2));
            }
        });
        Iterator<T> it = listM23631u.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((SymbolInfoEntity) next).getQuoteCurrency(), C38184b.f85884a.m86147b()));
        SymbolInfoEntity symbolInfoEntity = (SymbolInfoEntity) next;
        if (symbolInfoEntity == null) {
            Iterator<T> it2 = listM23631u.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!Intrinsics.areEqual(((SymbolInfoEntity) next2).getQuoteCurrency(), "BTC"));
            symbolInfoEntity = (SymbolInfoEntity) next2;
            if (symbolInfoEntity == null) {
                for (Object obj2 : listM23631u) {
                    if (Intrinsics.areEqual(((SymbolInfoEntity) obj2).getQuoteCurrency(), "ETH")) {
                        obj = obj2;
                        break;
                    }
                }
                symbolInfoEntity = (SymbolInfoEntity) obj;
            }
        }
        if (symbolInfoEntity != null) {
            String symbol = symbolInfoEntity.getSymbol();
            Intrinsics.checkNotNull(symbol);
            return symbol;
        }
        if (!listM23631u.isEmpty()) {
            String symbol2 = listM23631u.get(0).getSymbol();
            Intrinsics.checkNotNull(symbol2);
            return symbol2;
        }
        return "BTC-" + C38184b.f85884a.m86147b();
    }

    @Nullable
    /* JADX INFO: renamed from: O */
    public SymbolInfoEntity m85644O(@Nullable String str) {
        return SymbolsInfo.f21457a.m23635y(str);
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public List<SymbolInfoEntity> m85645P(@Nullable final String str) {
        return SymbolsInfo.f21457a.m23631u(new Function1() { // from class: gf.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C37900x.m85626Q(str, (SymbolInfoEntity) obj));
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: R */
    public TradeItemBean m85646R(@NotNull String item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return TradeQuotesInfo.f21436a.m23559E(item);
    }

    /* JADX INFO: renamed from: S */
    public void m85647S() {
        SymbolsInfo.f21457a.m23625B();
    }

    /* JADX INFO: renamed from: T */
    public void m85648T(@NotNull List<? extends SymbolInfoEntity> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        m85649U(list);
        m85652Y(list);
    }

    /* JADX INFO: renamed from: U */
    public final void m85649U(final List<? extends SymbolInfoEntity> list) {
        C27100x0.m66924e(new Function0() { // from class: gf.t
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C37900x.m85627V(list);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public List<CoinInfoEntity> m85650W(@NotNull String keyword, int i11) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        return ExchangeRateInfo.f21433a.m23527E(keyword, i11);
    }

    /* JADX INFO: renamed from: X */
    public void m85651X(@Nullable SymbolInfoEntity symbolInfoEntity) {
        SymbolsInfo.f21457a.m23627F(symbolInfoEntity);
    }

    /* JADX INFO: renamed from: Y */
    public void m85652Y(@Nullable List<? extends SymbolInfoEntity> list) {
        SymbolsInfo.f21457a.m23628G(list);
    }

    @Override // gf.InterfaceC37888l
    /* JADX INFO: renamed from: a */
    public void mo85590a(@Nullable Consumer<List<CoinInfoEntity>> consumer) {
        ExchangeRateInfo.f21433a.m23531x(consumer);
    }

    @Override // gf.InterfaceC37888l
    @NotNull
    /* JADX INFO: renamed from: b */
    public String mo85591b(@NotNull final String currency, @NotNull String defaultSymbol) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        Object next6;
        Object next7;
        Object next8;
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(defaultSymbol, "defaultSymbol");
        List<SymbolInfoEntity> listM23631u = SymbolsInfo.f21457a.m23631u(new Function1() { // from class: gf.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(C37900x.m85620C(currency, (SymbolInfoEntity) obj2));
            }
        });
        Iterator<T> it = listM23631u.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((SymbolInfoEntity) next).getQuoteCurrency(), C38184b.f85884a.m86147b()));
        SymbolInfoEntity symbolInfoEntity = (SymbolInfoEntity) next;
        if (symbolInfoEntity == null) {
            Iterator<T> it2 = listM23631u.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!Intrinsics.areEqual(((SymbolInfoEntity) next2).getQuoteCurrency(), "BTC"));
            symbolInfoEntity = (SymbolInfoEntity) next2;
            if (symbolInfoEntity == null) {
                Iterator<T> it3 = listM23631u.iterator();
                do {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                } while (!Intrinsics.areEqual(((SymbolInfoEntity) next3).getQuoteCurrency(), "KCS"));
                symbolInfoEntity = (SymbolInfoEntity) next3;
                if (symbolInfoEntity == null) {
                    Iterator<T> it4 = listM23631u.iterator();
                    do {
                        if (!it4.hasNext()) {
                            next4 = null;
                            break;
                        }
                        next4 = it4.next();
                    } while (!Intrinsics.areEqual(((SymbolInfoEntity) next4).getQuoteCurrency(), "ETH"));
                    symbolInfoEntity = (SymbolInfoEntity) next4;
                    if (symbolInfoEntity == null) {
                        Iterator<T> it5 = listM23631u.iterator();
                        do {
                            if (!it5.hasNext()) {
                                next5 = null;
                                break;
                            }
                            next5 = it5.next();
                        } while (!Intrinsics.areEqual(((SymbolInfoEntity) next5).getQuoteCurrency(), "USDC"));
                        symbolInfoEntity = (SymbolInfoEntity) next5;
                        if (symbolInfoEntity == null) {
                            Iterator<T> it6 = listM23631u.iterator();
                            do {
                                if (!it6.hasNext()) {
                                    next6 = null;
                                    break;
                                }
                                next6 = it6.next();
                            } while (!Intrinsics.areEqual(((SymbolInfoEntity) next6).getQuoteCurrency(), "TUSD"));
                            symbolInfoEntity = (SymbolInfoEntity) next6;
                            if (symbolInfoEntity == null) {
                                Iterator<T> it7 = listM23631u.iterator();
                                do {
                                    if (!it7.hasNext()) {
                                        next7 = null;
                                        break;
                                    }
                                    next7 = it7.next();
                                } while (!Intrinsics.areEqual(((SymbolInfoEntity) next7).getQuoteCurrency(), "UST"));
                                symbolInfoEntity = (SymbolInfoEntity) next7;
                                if (symbolInfoEntity == null) {
                                    Iterator<T> it8 = listM23631u.iterator();
                                    do {
                                        if (!it8.hasNext()) {
                                            next8 = null;
                                            break;
                                        }
                                        next8 = it8.next();
                                    } while (!Intrinsics.areEqual(((SymbolInfoEntity) next8).getQuoteCurrency(), "PAX"));
                                    symbolInfoEntity = (SymbolInfoEntity) next8;
                                    if (symbolInfoEntity == null) {
                                        for (Object obj2 : listM23631u) {
                                            if (Intrinsics.areEqual(((SymbolInfoEntity) obj2).getQuoteCurrency(), "DAI")) {
                                                obj = obj2;
                                                break;
                                            }
                                        }
                                        symbolInfoEntity = (SymbolInfoEntity) obj;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (symbolInfoEntity != null) {
            String symbol = symbolInfoEntity.getSymbol();
            Intrinsics.checkNotNull(symbol);
            return symbol;
        }
        if (!listM23631u.isEmpty()) {
            String symbol2 = listM23631u.get(0).getSymbol();
            Intrinsics.checkNotNull(symbol2);
            return symbol2;
        }
        List<SymbolInfoEntity> listM23631u2 = SymbolsInfo.f21457a.m23631u(new Function1() { // from class: gf.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return Boolean.valueOf(C37900x.m85619B(currency, (SymbolInfoEntity) obj3));
            }
        });
        if (listM23631u2.isEmpty()) {
            return defaultSymbol;
        }
        String symbol3 = listM23631u2.get(0).getSymbol();
        Intrinsics.checkNotNull(symbol3);
        return symbol3;
    }

    @Override // gf.InterfaceC37888l
    @NotNull
    /* JADX INFO: renamed from: c */
    public List<SymbolInfoEntity> mo85592c(@NotNull final String currency, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        if (z11) {
            List<SymbolInfoEntity> listM23631u = SymbolsInfo.f21457a.m23631u(new Function1() { // from class: gf.u
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(C37900x.m85623L(currency, (SymbolInfoEntity) obj));
                }
            });
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM23631u) {
                if (hashSet.add(((SymbolInfoEntity) obj).getCode())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        if (z12) {
            List<SymbolInfoEntity> listM23631u2 = SymbolsInfo.f21457a.m23631u(new Function1() { // from class: gf.v
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(C37900x.m85624M(currency, (SymbolInfoEntity) obj2));
                }
            });
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listM23631u2) {
                if (hashSet2.add(((SymbolInfoEntity) obj2).getCode())) {
                    arrayList2.add(obj2);
                }
            }
            return arrayList2;
        }
        List<SymbolInfoEntity> listM23631u3 = SymbolsInfo.f21457a.m23631u(new Function1() { // from class: gf.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return Boolean.valueOf(C37900x.m85625N(currency, (SymbolInfoEntity) obj3));
            }
        });
        HashSet hashSet3 = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listM23631u3) {
            if (hashSet3.add(((SymbolInfoEntity) obj3).getCode())) {
                arrayList3.add(obj3);
            }
        }
        return arrayList3;
    }

    @Override // gf.InterfaceC37888l
    /* JADX INFO: renamed from: e */
    public void mo85593e(@Nullable Function1<? super ArrayList<AlphaCurrencyInfoEntity>, Unit> function1) {
        AlphaCurrencyInfo.f21428a.m23492h(function1);
    }

    @Override // gf.InterfaceC37888l
    @Nullable
    /* JADX INFO: renamed from: g */
    public Disposable mo85594g(@Nullable Consumer<List<TradeItemBean>> consumer, boolean z11) {
        if (consumer != null) {
            return TradeQuotesInfo.f21436a.m23566y(consumer, z11);
        }
        return null;
    }

    @Override // gf.InterfaceC37888l
    @Nullable
    /* JADX INFO: renamed from: j */
    public Disposable mo85595j(@Nullable Consumer<List<CoinInfoEntity>> consumer) {
        return ExchangeRateInfo.f21433a.m23528m(consumer);
    }

    @Override // gf.InterfaceC37888l
    @SuppressLint({"CheckResult"})
    @Nullable
    /* JADX INFO: renamed from: m */
    public Disposable mo85596m(@Nullable Function1<? super ArrayList<SymbolInfoEntity>, Unit> function1, boolean z11) {
        return SymbolsInfo.f21457a.m23630n(function1, z11);
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public Disposable m85653x() {
        return EtfInfo.f21447a.m23599i();
    }

    @Nullable
    /* JADX INFO: renamed from: y */
    public Disposable m85654y() {
        return OrderLimitInfo.f21441a.m23581h();
    }

    @Nullable
    /* JADX INFO: renamed from: z */
    public AlphaCurrencyInfoEntity m85655z(@Nullable Long l11, @Nullable Boolean bool) {
        return AlphaCurrencyInfo.f21428a.m23494k(l11, bool);
    }
}
