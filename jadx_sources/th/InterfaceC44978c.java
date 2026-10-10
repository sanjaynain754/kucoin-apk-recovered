package th;

import androidx.credentials.provider.CredentialEntry;
import com.google.gson.reflect.TypeToken;
import com.kubi.kumex.data.BKuMexMemoryProxy;
import com.kubi.kumex.data.platform.model.CoinEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.ContractMaintainEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareComposeEntity;
import com.kubi.kumex.data.platform.model.HedgeDiscountRateEntity;
import com.kubi.kumex.data.platform.model.LeverageConfig;
import com.kubi.kumex.data.platform.model.NoticeConfig;
import com.kubi.kumex.data.platform.model.PreferencesEntity;
import com.kubi.kumex.data.platform.model.SymbolConfig;
import com.kubi.kumex.data.platform.model.SystemConfig;
import com.kubi.kumex.data.platform.model.TradingNoticeEntity;
import com.kubi.kumex.data.platform.model.UserConfig;
import com.kubi.restful.AbstractC23185a;
import com.kubi.restful.InterfaceC23192h;
import com.kubi.restful.InterfaceC23193i;
import com.kubi.restful.InterfaceC23194j;
import com.kubi.restful.InterfaceC23195k;
import com.kubi.restful.InterfaceC23196l;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: th.c */
/* JADX INFO: compiled from: IPlatformMemory.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J\u001c\u0010\n\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J&\u0010\u000b\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\f2\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J\u001c\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J&\u0010\u000e\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u000f2\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J\u001c\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00122\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J&\u0010\u0013\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J\u001c\u0010\u0014\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J&\u0010\u0016\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00172\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J\u001c\u0010\u0018\u001a\u00020\u00172\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J2\u0010\u0019\u001a\u00020\u00032\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a2\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J(\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a2\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J&\u0010\u001e\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u001f2\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J\u001c\u0010 \u001a\u00020\u001f2\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J\"\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00122\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J.\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a0\u00122\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J,\u0010#\u001a\u00020\u00032\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020%0$2\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J\"\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$2\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J,\u0010'\u001a\u00020\u00032\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020(0$2\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J\"\u0010)\u001a\b\u0012\u0004\u0012\u00020(0$2\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J(\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0$0\u00122\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J\u001c\u0010+\u001a\u00020,2\b\b\u0001\u0010\u0004\u001a\u00020-2\b\b\u0003\u0010\u0006\u001a\u00020\u0007H'J\"\u0010.\u001a\b\u0012\u0004\u0012\u00020-0/2\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J\u001c\u00100\u001a\u00020-2\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J&\u00101\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u0002022\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J\u001c\u00103\u001a\u0002022\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J\"\u00104\u001a\b\u0012\u0004\u0012\u0002020/2\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J&\u00105\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u0002062\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J\u001c\u00107\u001a\u0002062\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J\"\u00108\u001a\b\u0012\u0004\u0012\u0002060/2\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J&\u00109\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020:2\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J\u001c\u0010;\u001a\u00020:2\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J\"\u0010<\u001a\b\u0012\u0004\u0012\u00020:0/2\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J&\u0010=\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020>2\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'J\u001c\u0010?\u001a\u00020>2\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006@À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/data/platform/IPlatformMemory;", "", "insertServerTime", "", "value", "", "proxy", "Lcom/kubi/restful/BaseProxy;", "type", "Ljava/lang/reflect/Type;", "getServerTime", "insertSystemConfig", "Lcom/kubi/kumex/data/platform/model/SystemConfig;", "getSystemConfig", "insertNoticeConfig", "Lcom/kubi/kumex/data/platform/model/NoticeConfig;", "getNoticeConfig", "observeNoticeConfig", "Lio/reactivex/Flowable;", "insertRewardConfig", "getRewardConfig", "observeRewardConfig", "insertLeverageConfig", "Lcom/kubi/kumex/data/platform/model/LeverageConfig;", "getLeverageConfig", "insertSymbolConfig", "", "", "Lcom/kubi/kumex/data/platform/model/SymbolConfig;", "getSymbolConfig", "insertUserConfig", "Lcom/kubi/kumex/data/platform/model/UserConfig;", "getUserConfig", "observeUserConfig", "observeSymbolConfig", "insertCoinList", "", "Lcom/kubi/kumex/data/platform/model/CoinEntity;", "getCoinList", "insertContractList", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "getContractList", "observeContractList", "insertContractMaintain", "", "Lcom/kubi/kumex/data/platform/model/ContractMaintainEntity;", "observeContractMaintain", "Lio/reactivex/Observable;", "getContractMaintain", "insertPreferencesSettings", "Lcom/kubi/kumex/data/platform/model/PreferencesEntity;", "getPreferencesSettings", "observePreferencesSettings", "insertTradingNoticeSettings", "Lcom/kubi/kumex/data/platform/model/TradingNoticeEntity;", "getTradingNoticeSettings", "observeTradingNoticeSettings", "insertFuturesWelfare2", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeEntity;", "getFuturesWelfare2", "observeFuturesWelfare2", "insertHedgeDiscountRate", "Lcom/kubi/kumex/data/platform/model/HedgeDiscountRateEntity;", "getHedgeDiscountRate", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC44978c {

    /* JADX INFO: renamed from: th.c$a */
    /* JADX INFO: compiled from: IPlatformMemory.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m90084d2 = {"com/kubi/futures/data/platform/IPlatformMemory$getCoinList$1", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/kubi/kumex/data/platform/model/CoinEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends TypeToken<List<? extends CoinEntity>> {
    }

    /* JADX INFO: renamed from: th.c$b */
    /* JADX INFO: compiled from: IPlatformMemory.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m90084d2 = {"com/kubi/futures/data/platform/IPlatformMemory$getContractList$1", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b extends TypeToken<List<? extends ContractEntity>> {
    }

    /* JADX INFO: renamed from: th.c$c */
    /* JADX INFO: compiled from: IPlatformMemory.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m90084d2 = {"com/kubi/futures/data/platform/IPlatformMemory$getContractMaintain$1", "Lcom/google/gson/reflect/TypeToken;", "Lcom/kubi/kumex/data/platform/model/ContractMaintainEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class c extends TypeToken<ContractMaintainEntity> {
    }

    /* JADX INFO: renamed from: th.c$d */
    /* JADX INFO: compiled from: IPlatformMemory.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, m90084d2 = {"com/kubi/futures/data/platform/IPlatformMemory$getSymbolConfig$1", "Lcom/google/gson/reflect/TypeToken;", "", "", "Lcom/kubi/kumex/data/platform/model/SymbolConfig;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class d extends TypeToken<Map<String, ? extends SymbolConfig>> {
    }

    /* JADX INFO: renamed from: th.c$e */
    /* JADX INFO: compiled from: IPlatformMemory.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m90084d2 = {"com/kubi/futures/data/platform/IPlatformMemory$observeContractList$1", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class e extends TypeToken<List<? extends ContractEntity>> {
    }

    /* JADX INFO: renamed from: th.c$f */
    /* JADX INFO: compiled from: IPlatformMemory.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m90084d2 = {"com/kubi/futures/data/platform/IPlatformMemory$observeContractMaintain$1", "Lcom/google/gson/reflect/TypeToken;", "Lcom/kubi/kumex/data/platform/model/ContractMaintainEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class f extends TypeToken<ContractMaintainEntity> {
    }

    /* JADX INFO: renamed from: th.c$g */
    /* JADX INFO: compiled from: IPlatformMemory.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, m90084d2 = {"com/kubi/futures/data/platform/IPlatformMemory$observeSymbolConfig$1", "Lcom/google/gson/reflect/TypeToken;", "", "", "Lcom/kubi/kumex/data/platform/model/SymbolConfig;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class g extends TypeToken<Map<String, ? extends SymbolConfig>> {
    }

    @InterfaceC23192h(key = "SERVER_TIME")
    /* JADX INFO: renamed from: A */
    boolean m99491A(@InterfaceC23196l @NotNull long[] jArr, @InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23192h(key = "reward_config")
    /* JADX INFO: renamed from: B */
    boolean m99492B(@InterfaceC23196l boolean z11, @InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23194j(m103799default = "{}", key = "user_config")
    @NotNull
    /* JADX INFO: renamed from: C */
    UserConfig m99493C(@InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23194j(m103799default = "{}", key = "bkumex_preferences_notice_settings")
    @NotNull
    /* JADX INFO: renamed from: D */
    Observable<TradingNoticeEntity> m99494D(@InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23192h(key = "futures_welfare_coupons2")
    /* JADX INFO: renamed from: E */
    boolean m99495E(@InterfaceC23196l @NotNull FuturesWelfareComposeEntity futuresWelfareComposeEntity, @InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23194j(m103799default = "{}", key = "kyc_config")
    @NotNull
    /* JADX INFO: renamed from: F */
    LeverageConfig m99496F(@InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23192h(key = "contract")
    /* JADX INFO: renamed from: G */
    boolean m99497G(@InterfaceC23196l @NotNull List<ContractEntity> list, @InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23194j(m103799default = CredentialEntry.FALSE_STRING, key = "reward_config")
    /* JADX INFO: renamed from: I */
    boolean m99498I(@InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23192h(key = "user_config")
    /* JADX INFO: renamed from: J */
    boolean m99499J(@InterfaceC23196l @NotNull UserConfig userConfig, @InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23194j(m103799default = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, key = "contract")
    @NotNull
    /* JADX INFO: renamed from: L */
    List<ContractEntity> m99500L(@InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23194j(m103799default = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, key = "contract")
    @NotNull
    /* JADX INFO: renamed from: O */
    Flowable<List<ContractEntity>> m99501O(@InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23194j(m103799default = "{}", key = "user_config")
    @NotNull
    /* JADX INFO: renamed from: P */
    Flowable<UserConfig> m99502P(@InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23194j(m103799default = "{}", key = "bkumex_preferences_settings")
    @NotNull
    /* JADX INFO: renamed from: T */
    Observable<PreferencesEntity> m99503T(@InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23194j(m103799default = "{}", key = "hedge_discount_rate")
    @NotNull
    /* JADX INFO: renamed from: U */
    HedgeDiscountRateEntity m99504U(@InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23192h(key = "system_config")
    /* JADX INFO: renamed from: V */
    boolean m99505V(@InterfaceC23196l @NotNull SystemConfig systemConfig, @InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23194j(m103799default = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, key = "coin")
    @NotNull
    /* JADX INFO: renamed from: a */
    List<CoinEntity> m99506a(@InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23192h(key = "coin")
    /* JADX INFO: renamed from: b */
    boolean m99507b(@InterfaceC23196l @NotNull List<CoinEntity> list, @InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23194j(m103799default = "{}", key = "futures_welfare_coupons2")
    @NotNull
    /* JADX INFO: renamed from: b0 */
    FuturesWelfareComposeEntity m99508b0(@InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23192h(key = "bkumex_preferences_settings")
    /* JADX INFO: renamed from: c */
    boolean m99509c(@InterfaceC23196l @NotNull PreferencesEntity preferencesEntity, @InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23194j(m103799default = "{}", key = "futures_welfare_coupons2")
    @NotNull
    /* JADX INFO: renamed from: c0 */
    Observable<FuturesWelfareComposeEntity> m99510c0(@InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23194j(m103799default = "{}", key = "bkumex_preferences_settings")
    @NotNull
    /* JADX INFO: renamed from: d */
    PreferencesEntity m99511d(@InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23194j(m103799default = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, key = "notice_config")
    @NotNull
    /* JADX INFO: renamed from: e */
    NoticeConfig m99512e(@InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23192h(key = "notice_config")
    /* JADX INFO: renamed from: h */
    boolean m99513h(@InterfaceC23196l @NotNull NoticeConfig noticeConfig, @InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23194j(m103799default = "{}", key = "maintain_entity")
    @NotNull
    /* JADX INFO: renamed from: i */
    ContractMaintainEntity m99514i(@InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23194j(m103799default = "{}", key = "system_config")
    @NotNull
    /* JADX INFO: renamed from: k */
    SystemConfig m99515k(@InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23194j(m103799default = "[0,0]", key = "SERVER_TIME")
    @NotNull
    /* JADX INFO: renamed from: m */
    long[] m99516m(@InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23194j(m103799default = "{}", key = "bkumex_preferences_notice_settings")
    @NotNull
    /* JADX INFO: renamed from: n */
    TradingNoticeEntity m99517n(@InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23192h(key = "kyc_config")
    /* JADX INFO: renamed from: n0 */
    boolean m99518n0(@InterfaceC23196l @NotNull LeverageConfig leverageConfig, @InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23194j(m103799default = "{}", key = "symbol_config")
    @NotNull
    /* JADX INFO: renamed from: o0 */
    Flowable<Map<String, SymbolConfig>> m99519o0(@InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23192h(key = "bkumex_preferences_notice_settings")
    /* JADX INFO: renamed from: p */
    boolean m99520p(@InterfaceC23196l @NotNull TradingNoticeEntity tradingNoticeEntity, @InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23192h(key = "maintain_entity")
    /* JADX INFO: renamed from: q */
    void m99521q(@InterfaceC23196l @NotNull ContractMaintainEntity contractMaintainEntity, @InterfaceC23193i @NotNull AbstractC23185a abstractC23185a) throws Throwable;

    @InterfaceC23192h(key = "hedge_discount_rate")
    /* JADX INFO: renamed from: s */
    boolean m99522s(@InterfaceC23196l @NotNull HedgeDiscountRateEntity hedgeDiscountRateEntity, @InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23194j(m103799default = "{}", key = "symbol_config")
    @NotNull
    /* JADX INFO: renamed from: s0 */
    Map<String, SymbolConfig> m99523s0(@InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23194j(m103799default = "{}", key = "maintain_entity")
    @NotNull
    /* JADX INFO: renamed from: t */
    Observable<ContractMaintainEntity> m99524t(@InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23192h(key = "symbol_config")
    /* JADX INFO: renamed from: w */
    boolean m99525w(@InterfaceC23196l @NotNull Map<String, SymbolConfig> map, @InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    @InterfaceC23194j(m103799default = CredentialEntry.FALSE_STRING, key = "reward_config")
    @NotNull
    /* JADX INFO: renamed from: y */
    Flowable<Boolean> m99526y(@InterfaceC23193i @NotNull AbstractC23185a abstractC23185a, @InterfaceC23195k @NotNull Type type) throws Throwable;

    /* JADX INFO: renamed from: H */
    static /* synthetic */ boolean m99455H(InterfaceC44978c interfaceC44978c, NoticeConfig noticeConfig, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertNoticeConfig");
        }
        if ((i11 & 2) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 4) != 0) {
            type = Boolean.TYPE;
        }
        return interfaceC44978c.m99513h(noticeConfig, abstractC23185a, type);
    }

    /* JADX INFO: renamed from: K */
    static /* synthetic */ boolean m99456K(InterfaceC44978c interfaceC44978c, PreferencesEntity preferencesEntity, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertPreferencesSettings");
        }
        if ((i11 & 2) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 4) != 0) {
            type = Boolean.TYPE;
        }
        return interfaceC44978c.m99509c(preferencesEntity, abstractC23185a, type);
    }

    /* JADX INFO: renamed from: M */
    static /* synthetic */ Observable m99457M(InterfaceC44978c interfaceC44978c, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observePreferencesSettings");
        }
        if ((i11 & 1) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 2) != 0) {
            type = PreferencesEntity.class;
        }
        return interfaceC44978c.m99503T(abstractC23185a, type);
    }

    /* JADX INFO: renamed from: N */
    static /* synthetic */ Flowable m99458N(InterfaceC44978c interfaceC44978c, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeContractList");
        }
        if ((i11 & 1) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 2) != 0) {
            type = new e().getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        }
        return interfaceC44978c.m99501O(abstractC23185a, type);
    }

    /* JADX INFO: renamed from: Q */
    static /* synthetic */ boolean m99459Q(InterfaceC44978c interfaceC44978c, LeverageConfig leverageConfig, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertLeverageConfig");
        }
        if ((i11 & 2) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 4) != 0) {
            type = Boolean.TYPE;
        }
        return interfaceC44978c.m99518n0(leverageConfig, abstractC23185a, type);
    }

    /* JADX INFO: renamed from: R */
    static /* synthetic */ List m99460R(InterfaceC44978c interfaceC44978c, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCoinList");
        }
        if ((i11 & 1) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 2) != 0) {
            type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        }
        return interfaceC44978c.m99506a(abstractC23185a, type);
    }

    /* JADX INFO: renamed from: S */
    static /* synthetic */ ContractMaintainEntity m99461S(InterfaceC44978c interfaceC44978c, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContractMaintain");
        }
        if ((i11 & 1) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 2) != 0) {
            type = new c().getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        }
        return interfaceC44978c.m99514i(abstractC23185a, type);
    }

    /* JADX INFO: renamed from: W */
    static /* synthetic */ Flowable m99462W(InterfaceC44978c interfaceC44978c, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeRewardConfig");
        }
        if ((i11 & 1) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 2) != 0) {
            type = Boolean.TYPE;
        }
        return interfaceC44978c.m99526y(abstractC23185a, type);
    }

    /* JADX INFO: renamed from: X */
    static /* synthetic */ boolean m99463X(InterfaceC44978c interfaceC44978c, List list, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertCoinList");
        }
        if ((i11 & 2) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 4) != 0) {
            type = Boolean.TYPE;
        }
        return interfaceC44978c.m99507b(list, abstractC23185a, type);
    }

    /* JADX INFO: renamed from: Y */
    static /* synthetic */ HedgeDiscountRateEntity m99464Y(InterfaceC44978c interfaceC44978c, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHedgeDiscountRate");
        }
        if ((i11 & 1) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 2) != 0) {
            type = HedgeDiscountRateEntity.class;
        }
        return interfaceC44978c.m99504U(abstractC23185a, type);
    }

    /* JADX INFO: renamed from: Z */
    static /* synthetic */ boolean m99465Z(InterfaceC44978c interfaceC44978c, boolean z11, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertRewardConfig");
        }
        if ((i11 & 2) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 4) != 0) {
            type = Boolean.TYPE;
        }
        return interfaceC44978c.m99492B(z11, abstractC23185a, type);
    }

    /* JADX INFO: renamed from: a0 */
    static /* synthetic */ long[] m99466a0(InterfaceC44978c interfaceC44978c, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getServerTime");
        }
        if ((i11 & 1) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 2) != 0) {
            type = long[].class;
        }
        return interfaceC44978c.m99516m(abstractC23185a, type);
    }

    /* JADX INFO: renamed from: d0 */
    static /* synthetic */ FuturesWelfareComposeEntity m99467d0(InterfaceC44978c interfaceC44978c, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFuturesWelfare2");
        }
        if ((i11 & 1) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 2) != 0) {
            type = FuturesWelfareComposeEntity.class;
        }
        return interfaceC44978c.m99508b0(abstractC23185a, type);
    }

    /* JADX INFO: renamed from: e0 */
    static /* synthetic */ boolean m99468e0(InterfaceC44978c interfaceC44978c, FuturesWelfareComposeEntity futuresWelfareComposeEntity, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertFuturesWelfare2");
        }
        if ((i11 & 2) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 4) != 0) {
            type = Boolean.TYPE;
        }
        return interfaceC44978c.m99495E(futuresWelfareComposeEntity, abstractC23185a, type);
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ boolean m99469f(InterfaceC44978c interfaceC44978c, UserConfig userConfig, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertUserConfig");
        }
        if ((i11 & 2) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 4) != 0) {
            type = Boolean.TYPE;
        }
        return interfaceC44978c.m99499J(userConfig, abstractC23185a, type);
    }

    /* JADX INFO: renamed from: f0 */
    static /* synthetic */ boolean m99470f0(InterfaceC44978c interfaceC44978c, List list, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertContractList");
        }
        if ((i11 & 2) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 4) != 0) {
            type = Boolean.TYPE;
        }
        return interfaceC44978c.m99497G(list, abstractC23185a, type);
    }

    /* JADX INFO: renamed from: g */
    static /* synthetic */ List m99471g(InterfaceC44978c interfaceC44978c, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContractList");
        }
        if ((i11 & 1) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 2) != 0) {
            type = new b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        }
        return interfaceC44978c.m99500L(abstractC23185a, type);
    }

    /* JADX INFO: renamed from: g0 */
    static /* synthetic */ NoticeConfig m99472g0(InterfaceC44978c interfaceC44978c, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNoticeConfig");
        }
        if ((i11 & 1) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 2) != 0) {
            type = NoticeConfig.class;
        }
        return interfaceC44978c.m99512e(abstractC23185a, type);
    }

    /* JADX INFO: renamed from: h0 */
    static /* synthetic */ boolean m99473h0(InterfaceC44978c interfaceC44978c, TradingNoticeEntity tradingNoticeEntity, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertTradingNoticeSettings");
        }
        if ((i11 & 2) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 4) != 0) {
            type = Boolean.TYPE;
        }
        return interfaceC44978c.m99520p(tradingNoticeEntity, abstractC23185a, type);
    }

    /* JADX INFO: renamed from: i0 */
    static /* synthetic */ Observable m99474i0(InterfaceC44978c interfaceC44978c, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeFuturesWelfare2");
        }
        if ((i11 & 1) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 2) != 0) {
            type = FuturesWelfareComposeEntity.class;
        }
        return interfaceC44978c.m99510c0(abstractC23185a, type);
    }

    /* JADX INFO: renamed from: j */
    static /* synthetic */ boolean m99475j(InterfaceC44978c interfaceC44978c, SystemConfig systemConfig, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertSystemConfig");
        }
        if ((i11 & 2) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 4) != 0) {
            type = Boolean.TYPE;
        }
        return interfaceC44978c.m99505V(systemConfig, abstractC23185a, type);
    }

    /* JADX INFO: renamed from: j0 */
    static /* synthetic */ LeverageConfig m99476j0(InterfaceC44978c interfaceC44978c, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLeverageConfig");
        }
        if ((i11 & 1) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 2) != 0) {
            type = LeverageConfig.class;
        }
        return interfaceC44978c.m99496F(abstractC23185a, type);
    }

    /* JADX INFO: renamed from: k0 */
    static /* synthetic */ Observable m99477k0(InterfaceC44978c interfaceC44978c, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeContractMaintain");
        }
        if ((i11 & 1) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 2) != 0) {
            type = new f().getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        }
        return interfaceC44978c.m99524t(abstractC23185a, type);
    }

    /* JADX INFO: renamed from: l */
    static /* synthetic */ Flowable m99478l(InterfaceC44978c interfaceC44978c, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeSymbolConfig");
        }
        if ((i11 & 1) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 2) != 0) {
            type = new g().getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        }
        return interfaceC44978c.m99519o0(abstractC23185a, type);
    }

    /* JADX INFO: renamed from: l0 */
    static /* synthetic */ Flowable m99479l0(InterfaceC44978c interfaceC44978c, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeUserConfig");
        }
        if ((i11 & 1) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 2) != 0) {
            type = UserConfig.class;
        }
        return interfaceC44978c.m99502P(abstractC23185a, type);
    }

    /* JADX INFO: renamed from: m0 */
    static /* synthetic */ PreferencesEntity m99480m0(InterfaceC44978c interfaceC44978c, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPreferencesSettings");
        }
        if ((i11 & 1) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 2) != 0) {
            type = PreferencesEntity.class;
        }
        return interfaceC44978c.m99511d(abstractC23185a, type);
    }

    /* JADX INFO: renamed from: o */
    static /* synthetic */ boolean m99481o(InterfaceC44978c interfaceC44978c, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRewardConfig");
        }
        if ((i11 & 1) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 2) != 0) {
            type = Boolean.TYPE;
        }
        return interfaceC44978c.m99498I(abstractC23185a, type);
    }

    /* JADX INFO: renamed from: p0 */
    static /* synthetic */ boolean m99482p0(InterfaceC44978c interfaceC44978c, HedgeDiscountRateEntity hedgeDiscountRateEntity, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertHedgeDiscountRate");
        }
        if ((i11 & 2) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 4) != 0) {
            type = HedgeDiscountRateEntity.class;
        }
        return interfaceC44978c.m99522s(hedgeDiscountRateEntity, abstractC23185a, type);
    }

    /* JADX INFO: renamed from: q0 */
    static /* synthetic */ Map m99483q0(InterfaceC44978c interfaceC44978c, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSymbolConfig");
        }
        if ((i11 & 1) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 2) != 0) {
            type = new d().getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        }
        return interfaceC44978c.m99523s0(abstractC23185a, type);
    }

    /* JADX INFO: renamed from: r */
    static /* synthetic */ boolean m99484r(InterfaceC44978c interfaceC44978c, long[] jArr, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertServerTime");
        }
        if ((i11 & 2) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 4) != 0) {
            type = Boolean.TYPE;
        }
        return interfaceC44978c.m99491A(jArr, abstractC23185a, type);
    }

    /* JADX INFO: renamed from: r0 */
    static /* synthetic */ TradingNoticeEntity m99485r0(InterfaceC44978c interfaceC44978c, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTradingNoticeSettings");
        }
        if ((i11 & 1) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 2) != 0) {
            type = TradingNoticeEntity.class;
        }
        return interfaceC44978c.m99517n(abstractC23185a, type);
    }

    /* JADX INFO: renamed from: t0 */
    static /* synthetic */ SystemConfig m99486t0(InterfaceC44978c interfaceC44978c, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSystemConfig");
        }
        if ((i11 & 1) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 2) != 0) {
            type = SystemConfig.class;
        }
        return interfaceC44978c.m99515k(abstractC23185a, type);
    }

    /* JADX INFO: renamed from: u */
    static /* synthetic */ boolean m99487u(InterfaceC44978c interfaceC44978c, Map map, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertSymbolConfig");
        }
        if ((i11 & 2) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 4) != 0) {
            type = Boolean.TYPE;
        }
        return interfaceC44978c.m99525w(map, abstractC23185a, type);
    }

    /* JADX INFO: renamed from: v */
    static /* synthetic */ Observable m99488v(InterfaceC44978c interfaceC44978c, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeTradingNoticeSettings");
        }
        if ((i11 & 1) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 2) != 0) {
            type = TradingNoticeEntity.class;
        }
        return interfaceC44978c.m99494D(abstractC23185a, type);
    }

    /* JADX INFO: renamed from: x */
    static /* synthetic */ void m99489x(InterfaceC44978c interfaceC44978c, ContractMaintainEntity contractMaintainEntity, AbstractC23185a abstractC23185a, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insertContractMaintain");
        }
        if ((i11 & 2) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        interfaceC44978c.m99521q(contractMaintainEntity, abstractC23185a);
    }

    /* JADX INFO: renamed from: z */
    static /* synthetic */ UserConfig m99490z(InterfaceC44978c interfaceC44978c, AbstractC23185a abstractC23185a, Type type, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUserConfig");
        }
        if ((i11 & 1) != 0) {
            abstractC23185a = BKuMexMemoryProxy.f28814d.getInstance();
        }
        if ((i11 & 2) != 0) {
            type = UserConfig.class;
        }
        return interfaceC44978c.m99493C(abstractC23185a, type);
    }
}
