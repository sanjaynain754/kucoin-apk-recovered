package th;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.futures.data.platform.model.StrategyOrderConfigEntity;
import com.kubi.kumex.data.platform.model.CoinEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.ContractMaintainEntity;
import com.kubi.kumex.data.platform.model.HedgeDiscountRateEntity;
import com.kubi.kumex.data.platform.model.NoticeConfig;
import com.kubi.kumex.data.platform.model.SymbolConfig;
import com.kubi.kumex.data.platform.model.SystemConfig;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p801yl.C46527h0;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: th.d */
/* JADX INFO: compiled from: IPlatformService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0005H&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH&J\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0005H&J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000eH&J\u0016\u0010\u0013\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000eH&J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u00162\b\b\u0002\u0010\u0011\u001a\u00020\u000bH&J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000e0\u0016H&J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016H&J\b\u0010\u001a\u001a\u00020\u001bH&J%\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001e0\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u0003H&J\u0018\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000bH&J\b\u0010%\u001a\u00020\u0003H&J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0016H&J\b\u0010(\u001a\u00020'H&J\u0014\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001e0\u001dH&J\u001c\u0010*\u001a\u00020\u00032\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001e0\u001dH&J\u0012\u0010)\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0011\u001a\u00020\u000bH&J\u001a\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001e0\u001d0\u0016H&J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00162\u0006\u0010\u0011\u001a\u00020\u000bH&J\b\u0010-\u001a\u00020\u0003H&J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H&J\u000e\u00101\u001a\b\u0012\u0004\u0012\u0002000/H&J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020003H&J\u0012\u00104\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000bH'J\u0016\u00105\u001a\u00020\u00032\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH&J\b\u00107\u001a\u000208H&J\u001c\u00109\u001a\u00020\u00032\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001dH&J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH&J\b\u0010<\u001a\u00020=H&J\b\u0010>\u001a\u00020\u0005H&J\b\u0010?\u001a\u00020\u0003H&J\n\u0010@\u001a\u0004\u0018\u00010AH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006BÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/data/platform/IPlatformService;", "Lcom/kubi/futures/data/platform/IPlatformApi;", "synchronized", "", "force", "", "getServerTime", "", "getCoin", "Lcom/kubi/kumex/data/platform/model/CoinEntity;", FirebaseAnalytics.Param.CURRENCY, "", "wait", "getCoinList", "", "getContract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "symbol", "getContractList", "insertContractList", "list", "observeContract", "Lio/reactivex/Flowable;", "observeContractList", "observeContractVersion", "", "getSystemConfig", "Lcom/kubi/kumex/data/platform/model/SystemConfig;", "fetchSymbolConfig", "", "Lcom/kubi/kumex/data/platform/model/SymbolConfig;", "isOnLogin", "(Ljava/lang/Boolean;)Ljava/util/Map;", "expireSymbolConfig", "mergeBatchLeverageLocally", "primarySymbol", "leverage", "loadNoticeConfig", "observeNoticeConfig", "Lcom/kubi/kumex/data/platform/model/NoticeConfig;", "getNoticeConfig", "getSymbolConfig", "insertSymbolConfig", "config", "observeSymbolConfig", "fetchInitData", "fetchMaintainData", "Lio/reactivex/Observable;", "Lcom/kubi/kumex/data/platform/model/ContractMaintainEntity;", "observeMaintainData", "bindSocketOfContractStatus", "Lkotlinx/coroutines/flow/Flow;", "getContractStatus", "updateFavouriteQuotes", "quotes", "observeContractUpdate", "Lio/reactivex/disposables/Disposable;", "clearCacheFavoriteStatus", "symbolMap", "getFavouriteQuotes", "getHedgeDiscountRate", "Lcom/kubi/kumex/data/platform/model/HedgeDiscountRateEntity;", "isReversePositionEnable", "fetchAndUpdateRobotSiteConfig", "getStrategyConfig", "Lcom/kubi/futures/data/platform/model/StrategyOrderConfigEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC44980d extends InterfaceC44974a {
    @NotNull
    /* JADX INFO: renamed from: A */
    List<String> mo24976A();

    @Nullable
    /* JADX INFO: renamed from: D */
    ContractEntity mo24978D(@NotNull String str, boolean z11);

    /* JADX INFO: renamed from: F */
    void mo24979F();

    @NotNull
    /* JADX INFO: renamed from: G */
    Map<String, SymbolConfig> mo24980G();

    @NotNull
    /* JADX INFO: renamed from: I */
    Flowable<ContractEntity> mo24982I(@NotNull String str);

    /* JADX INFO: renamed from: J */
    void mo24983J(@NotNull List<String> list);

    @NotNull
    /* JADX INFO: renamed from: K */
    Disposable mo24984K();

    @NotNull
    /* JADX INFO: renamed from: N */
    HedgeDiscountRateEntity mo24987N();

    @NotNull
    /* JADX INFO: renamed from: P */
    Flowable<Map<String, SymbolConfig>> mo24988P();

    @NotNull
    /* JADX INFO: renamed from: Q */
    Flowable<List<ContractEntity>> mo24989Q();

    /* JADX INFO: renamed from: R */
    void mo24990R(@NotNull Map<String, String> map);

    @Nullable
    /* JADX INFO: renamed from: T */
    StrategyOrderConfigEntity mo24993T();

    @Nullable
    /* JADX INFO: renamed from: X */
    SymbolConfig mo24996X(@NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: Y */
    String mo24997Y(@NotNull String str);

    /* JADX INFO: renamed from: c */
    void mo25003c(boolean z11);

    @NotNull
    /* JADX INFO: renamed from: d */
    List<CoinEntity> mo25004d();

    @NotNull
    /* JADX INFO: renamed from: d0 */
    Map<String, SymbolConfig> mo25005d0(@Nullable Boolean bool);

    /* JADX INFO: renamed from: e */
    void mo25006e();

    @NotNull
    /* JADX INFO: renamed from: e0 */
    Observable<ContractMaintainEntity> mo25007e0();

    @NotNull
    /* JADX INFO: renamed from: f0 */
    Flowable<SymbolConfig> mo25009f0(@NotNull String str);

    /* JADX INFO: renamed from: h */
    void mo25012h();

    /* JADX INFO: renamed from: i */
    void mo25013i();

    @NotNull
    /* JADX INFO: renamed from: j */
    InterfaceC41634e<ContractMaintainEntity> mo25014j();

    @NotNull
    /* JADX INFO: renamed from: k */
    List<ContractEntity> mo25016k();

    /* JADX INFO: renamed from: l */
    void mo25017l(@NotNull String str, @NotNull String str2);

    @NotNull
    /* JADX INFO: renamed from: n */
    NoticeConfig mo25019n();

    /* JADX INFO: renamed from: o */
    boolean mo25020o();

    @NotNull
    /* JADX INFO: renamed from: p */
    Observable<ContractMaintainEntity> mo25021p();

    @Nullable
    /* JADX INFO: renamed from: s */
    CoinEntity mo25027s(@NotNull String str, boolean z11);

    @NotNull
    /* JADX INFO: renamed from: t */
    SystemConfig mo25029t();

    /* JADX INFO: renamed from: v */
    long mo25031v();

    /* JADX INFO: renamed from: B */
    static /* synthetic */ Map m99527B(InterfaceC44980d interfaceC44980d, Boolean bool, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchSymbolConfig");
        }
        if ((i11 & 1) != 0) {
            bool = Boolean.FALSE;
        }
        return interfaceC44980d.mo25005d0(bool);
    }

    /* JADX INFO: renamed from: E */
    static /* synthetic */ CoinEntity m99528E(InterfaceC44980d interfaceC44980d, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCoin");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return interfaceC44980d.mo25027s(str, z11);
    }

    /* JADX INFO: renamed from: O */
    static /* synthetic */ ContractEntity m99529O(InterfaceC44980d interfaceC44980d, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContract");
        }
        if ((i11 & 1) != 0) {
            str = C46527h0.f104291a.m102677L();
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return interfaceC44980d.mo24978D(str, z11);
    }

    /* JADX INFO: renamed from: V */
    static /* synthetic */ String m99530V(InterfaceC44980d interfaceC44980d, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContractStatus");
        }
        if ((i11 & 1) != 0) {
            str = C46527h0.f104291a.m102677L();
        }
        return interfaceC44980d.mo24997Y(str);
    }
}
