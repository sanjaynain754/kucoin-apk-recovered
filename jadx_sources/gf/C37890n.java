package gf;

import android.annotation.SuppressLint;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.AlphaCurrencyInfoEntity;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.EtfCoinEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.bugly.proguard.C33536a4;
import com.tencent.bugly.proguard.C33786m2;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: gf.n */
/* JADX INFO: compiled from: SymbolsCoinDao.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u0014J0\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u001c\u0010\u0017\u001a\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u0014H\u0017J\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010!\u001a\u00020\u00102\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001fH\u0016J\u0012\u0010!\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005H\u0016J\u0018\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0016J&\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001f2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u0014H\u0016J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001fH\u0016J\b\u0010,\u001a\u00020\u0010H\u0016J&\u0010-\u001a\u00020\u00102\u001c\u0010\u0017\u001a\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u00020.\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0018H\u0016J#\u0010/\u001a\u0004\u0018\u00010.2\b\u00100\u001a\u0004\u0018\u00010\b2\b\u00101\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0002\u00102J\u000e\u00103\u001a\b\u0012\u0004\u0012\u00020.0\u001fH\u0016J\u001e\u00104\u001a\u00020\u00102\u0014\u00105\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u001f\u0018\u000106H\u0016J\u000e\u00108\u001a\b\u0012\u0004\u0012\u0002070\u001fH\u0016J \u00109\u001a\u0004\u0018\u00010\u00162\u0014\u00105\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u001f\u0018\u000106H\u0016J\u0012\u0010:\u001a\u0004\u0018\u0001072\u0006\u0010%\u001a\u00020\u0005H\u0016J\u001e\u0010;\u001a\b\u0012\u0004\u0012\u0002070\u001f2\u0006\u0010<\u001a\u00020\u00052\u0006\u0010=\u001a\u00020>H\u0016J(\u0010?\u001a\u0004\u0018\u00010\u00162\u0014\u0010@\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0\u001f\u0018\u0001062\u0006\u0010B\u001a\u00020\u0014H\u0016J\u0012\u0010C\u001a\u0004\u0018\u00010A2\u0006\u0010D\u001a\u00020\u0005H\u0016J\u0018\u0010E\u001a\u0004\u0018\u00010A2\u0006\u0010D\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010FJ\n\u0010G\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010H\u001a\u0004\u0018\u00010I2\u0006\u0010\u001d\u001a\u00020\u0005H\u0016J\n\u0010J\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010N\u001a\u0004\u0018\u00010\u0016H\u0016J\u0016\u0010O\u001a\u00020\u00102\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006P"}, m90084d2 = {"Lcom/kubi/data/coin/SymbolsCoinDao;", "Lcom/kubi/data/coin/ISymbolsCoinDao;", "<init>", "()V", "TAG", "", "SYMBOLS_INFO_FETCH_TIME", "Lcom/kubi/utils/storage/StorageId;", "", "delegate", "Lcom/kubi/data/coin/SymbolsCoinDaoNew;", "getDelegate", "()Lcom/kubi/data/coin/SymbolsCoinDaoNew;", "delegate$delegate", "Lkotlin/Lazy;", "initDefaultSymbolsList", "", "updateSymbolsInfoWithLimit", "frequency", "ignore", "", "fetchSymbolInfoList", "Lio/reactivex/disposables/Disposable;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/SymbolInfoEntity;", "ignoreState", "getSymbolEntityByCode", "code", "getSymbolPairList", "", "baseCurrency", "updateSymbolEntity", "list", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "getRecommendsSymbolByCurrency", FirebaseAnalytics.Param.CURRENCY, "getBestSymbolByCurrency", "defaultSymbol", "getSymbolEntityByBaseCurrency", "isMargin", "isIsolatedMargin", "getIsolateSymbols", "initDefaultAlphaCurrencyList", "fetchAlphaCurrencyList", "Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;", "getAlphaCurrencyEntity", "currencySeq", "isQuoteCurrency", "(Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;", "getAlphaCurrencyInfoListSync", "getLocaleCoinList", "callBack", "Lio/reactivex/functions/Consumer;", "Lcom/kubi/data/entity/CoinInfoEntity;", "getLocaleCoinListSync", "fetchCoinList", "getCoinEntityByCode", "searchCoinListByKeyword", "keyword", BridgeParamKeyKt.MAX_COUNT, "", "getTradeBeanList", "resultCallBack", "Lcom/kubi/data/entity/TradeItemBean;", "latest", "getTradeItem", "item", "getTradeItemAwait", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchEtfCoinList", "getEtfEntityByCode", "Lcom/kubi/data/entity/EtfCoinEntity;", "fetchQuoteLimitConfig", "getQuoteLimitSize", "", "quoteCurrency", "initQuoteLimitConfig", "onReceiveSymbolsCoinPush", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSymbolsCoinDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SymbolsCoinDao.kt\ncom/kubi/data/coin/SymbolsCoinDao\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,203:1\n84#2:204\n75#2,2:205\n*S KotlinDebug\n*F\n+ 1 SymbolsCoinDao.kt\ncom/kubi/data/coin/SymbolsCoinDao\n*L\n42#1:204\n51#1:205,2\n*E\n"})
public final class C37890n implements InterfaceC37888l {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37890n f85269a = new C37890n();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final StorageId<Long> f85270b = new StorageId<>(C33786m2.f70892t, "symbols_info_fetch_time", null, false, 12, null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f85271c = LazyKt.lazy(new Function0() { // from class: gf.m
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C37890n.m85599p();
        }
    });

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m85597J(C37890n c37890n, long j11, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = C33536a4.f68797g;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        c37890n.m85608I(j11, z11);
    }

    /* JADX INFO: renamed from: p */
    public static final C37900x m85599p() {
        return C37900x.f85280a;
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public String m85600A(@NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return m85614v().m85643J(currency);
    }

    @Nullable
    /* JADX INFO: renamed from: D */
    public TradeItemBean m85603D(@NotNull String item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return m85614v().m85646R(item);
    }

    /* JADX INFO: renamed from: F */
    public void m85605F(@NotNull List<? extends SymbolInfoEntity> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        m85614v().m85648T(list);
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public List<CoinInfoEntity> m85606G(@NotNull String keyword, int i11) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        return m85614v().m85650W(keyword, i11);
    }

    /* JADX INFO: renamed from: I */
    public final void m85608I(long j11, boolean z11) {
        if (System.currentTimeMillis() - C46392a.m102324f(f85270b, 0L) > j11) {
            InterfaceC37888l.m85585h(this, null, z11, 1, null);
        }
    }

    @Override // gf.InterfaceC37888l
    @NotNull
    /* JADX INFO: renamed from: b */
    public String mo85591b(@NotNull String currency, @NotNull String defaultSymbol) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(defaultSymbol, "defaultSymbol");
        return m85614v().mo85591b(currency, defaultSymbol);
    }

    @Override // gf.InterfaceC37888l
    @NotNull
    /* JADX INFO: renamed from: c */
    public List<SymbolInfoEntity> mo85592c(@NotNull String currency, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return m85614v().mo85592c(currency, z11, z12);
    }

    @Override // gf.InterfaceC37888l
    @SuppressLint({"CheckResult"})
    @Nullable
    /* JADX INFO: renamed from: m */
    public Disposable mo85596m(@Nullable Function1<? super ArrayList<SymbolInfoEntity>, Unit> function1, boolean z11) {
        C46392a.m102330m(f85270b, System.currentTimeMillis());
        return m85614v().mo85596m(function1, z11);
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public CoinInfoEntity m85613u(@NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return m85614v().m85638D(currency);
    }

    /* JADX INFO: renamed from: v */
    public final C37900x m85614v() {
        return (C37900x) f85271c.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public EtfCoinEntity m85615w(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return m85614v().m85639E(code);
    }

    @Nullable
    /* JADX INFO: renamed from: B */
    public SymbolInfoEntity m85601B(@Nullable String str) {
        return m85614v().m85644O(str);
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public List<SymbolInfoEntity> m85602C(@Nullable String str) {
        return m85614v().m85645P(str);
    }

    /* JADX INFO: renamed from: E */
    public void m85604E() {
        m85614v().m85647S();
    }

    /* JADX INFO: renamed from: H */
    public void m85607H(@Nullable SymbolInfoEntity symbolInfoEntity) {
        m85614v().m85651X(symbolInfoEntity);
    }

    @Override // gf.InterfaceC37888l
    /* JADX INFO: renamed from: a */
    public void mo85590a(@Nullable Consumer<List<CoinInfoEntity>> consumer) {
        m85614v().mo85590a(consumer);
    }

    @Override // gf.InterfaceC37888l
    /* JADX INFO: renamed from: e */
    public void mo85593e(@Nullable Function1<? super ArrayList<AlphaCurrencyInfoEntity>, Unit> function1) {
        m85614v().mo85593e(function1);
    }

    @Override // gf.InterfaceC37888l
    @Nullable
    /* JADX INFO: renamed from: g */
    public Disposable mo85594g(@Nullable Consumer<List<TradeItemBean>> consumer, boolean z11) {
        return m85614v().mo85594g(consumer, z11);
    }

    @Override // gf.InterfaceC37888l
    @Nullable
    /* JADX INFO: renamed from: j */
    public Disposable mo85595j(@Nullable Consumer<List<CoinInfoEntity>> consumer) {
        return m85614v().mo85595j(consumer);
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public Disposable m85609q() {
        return m85614v().m85653x();
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public Disposable m85610r() {
        return m85614v().m85654y();
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public AlphaCurrencyInfoEntity m85611s(@Nullable Long l11, @Nullable Boolean bool) {
        return m85614v().m85655z(l11, bool);
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public List<AlphaCurrencyInfoEntity> m85612t() {
        return m85614v().m85637A();
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public List<SymbolInfoEntity> m85616x() {
        return m85614v().m85640F();
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public List<CoinInfoEntity> m85617y() {
        return m85614v().m85641H();
    }

    /* JADX INFO: renamed from: z */
    public double m85618z(@Nullable String str) {
        return m85614v().m85642I(str);
    }
}
