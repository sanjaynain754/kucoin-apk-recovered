package th;

import com.kubi.futures.data.platform.model.OpenFuturesAgreement;
import com.kubi.futures.data.platform.model.StrategyOrderConfigEntity;
import com.kubi.kumex.data.platform.model.CoinEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.ContractRiskLimitEntity;
import com.kubi.kumex.data.platform.model.FuturesCampaignActivityEntity;
import com.kubi.kumex.data.platform.model.FuturesSpreadConfigEntity;
import com.kubi.kumex.data.platform.model.HedgeDiscountRateEntity;
import com.kubi.kumex.data.platform.model.NasdaqMarketStatusEntity;
import com.kubi.kumex.data.platform.model.NoticeConfig;
import com.kubi.kumex.data.platform.model.NoticeEntity;
import com.kubi.kumex.data.platform.model.ResourcePositionEntity;
import com.kubi.kumex.data.platform.model.RobotSiteConfigEntity;
import com.kubi.kumex.data.platform.model.SymbolConfig;
import com.kubi.kumex.data.platform.model.SystemConfig;
import com.kubi.quotefacade.entity.MarketListEntityItem;
import com.kubi.sdk.base.entity.BaseEntity;
import io.reactivex.Observable;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: th.a */
/* JADX INFO: compiled from: IPlatformApi.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\u0006\u001a\u00020\u0007H'J \u0010\b\u001a\u0004\u0018\u00010\u00012\u0014\b\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH'J\u001e\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\n2\b\b\u0003\u0010\u000e\u001a\u00020\u000bH'J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\nH'J\u0012\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u000bH'J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0003\u0010\u0016\u001a\u00020\u000bH'J$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00142\u0014\b\u0003\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH'J\b\u0010\u001a\u001a\u00020\u001bH'JC\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0001\u0010\u001e\u001a\u00020\u001f2\b\b\u0001\u0010 \u001a\u00020\u001f2\b\b\u0003\u0010!\u001a\u00020\u000b2\b\b\u0001\u0010\"\u001a\u00020\u000b2\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u001fH'¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020&H'J\u001a\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u00142\b\b\u0001\u0010\u0012\u001a\u00020\u000bH'J\u0010\u0010)\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u0014H'J\n\u0010+\u001a\u0004\u0018\u00010,H'J\u000f\u0010-\u001a\u0004\u0018\u00010.H'¢\u0006\u0002\u0010/J\n\u00100\u001a\u0004\u0018\u000101H'J8\u00102\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u00140\n2\b\b\u0001\u00104\u001a\u00020\u000b2\b\b\u0001\u00105\u001a\u00020\u000b2\b\b\u0001\u0010\u0012\u001a\u00020\u000bH'J$\u00106\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u00140\n2\b\b\u0001\u00104\u001a\u00020\u000bH'J4\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:09082\b\b\u0003\u0010;\u001a\u00020\u000b2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\b\u0003\u0010<\u001a\u00020\u000bH'J\b\u0010=\u001a\u00020>H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006?À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/data/platform/IPlatformApi;", "", "fetchServerTime", "", "fetchSystemConfig", "Lcom/kubi/kumex/data/platform/model/SystemConfig;", "fetchNoticeConfig", "Lcom/kubi/kumex/data/platform/model/NoticeConfig;", "submitSymbolConfig", "request", "", "", "fetchSymbolConfig1", "Lcom/kubi/kumex/data/platform/model/SymbolConfig;", "time", "fetchSymbolConfig2", "fetchUserSpreadConfig", "Lcom/kubi/kumex/data/platform/model/FuturesSpreadConfigEntity;", "symbol", "fetchCoinList", "", "Lcom/kubi/kumex/data/platform/model/CoinEntity;", "platfrom", "fetchContractList", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "headers", "fetchAnnouncement", "Lcom/kubi/kumex/data/platform/model/NoticeEntity;", "fetchCampaignActivities", "Lcom/kubi/kumex/data/platform/model/FuturesCampaignActivityEntity;", "page", "", "pageSize", "lang", "categories", "weight", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/kubi/kumex/data/platform/model/FuturesCampaignActivityEntity;", "fetchHedgeDiscountRate", "Lcom/kubi/kumex/data/platform/model/HedgeDiscountRateEntity;", "fetchRiskLimitList", "Lcom/kubi/kumex/data/platform/model/ContractRiskLimitEntity;", "fetchAgreementsOfOpenFutures", "Lcom/kubi/futures/data/platform/model/OpenFuturesAgreement;", "fetchRobotSiteConfig", "Lcom/kubi/kumex/data/platform/model/RobotSiteConfigEntity;", "fetchShowCopyTradingGuideConfig", "", "()Ljava/lang/Boolean;", "fetchStrategyConfig", "Lcom/kubi/futures/data/platform/model/StrategyOrderConfigEntity;", "resourcePositionBanner", "Lcom/kubi/kumex/data/platform/model/ResourcePositionEntity;", "code", "tradeType", "loadMiddleGroundResource", "getDiscoverTradeDataBySymbols", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/quotefacade/entity/MarketListEntityItem;", "datasource", "customizations", "fetchNasdaqMarketStatus", "Lcom/kubi/kumex/data/platform/model/NasdaqMarketStatusEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC44974a {
    @GET("v1/km/user-spread-config")
    @NotNull
    /* JADX INFO: renamed from: C */
    FuturesSpreadConfigEntity mo24977C(@NotNull @Query("symbol") String str) throws Throwable;

    @GET("v1/robot/task/common/site-config")
    @Nullable
    /* JADX INFO: renamed from: H */
    RobotSiteConfigEntity mo24981H() throws Throwable;

    @GET("v1/km/contracts/risk-limit")
    @Nullable
    /* JADX INFO: renamed from: L */
    List<ContractRiskLimitEntity> mo24985L(@NotNull @Query("symbol") String str) throws Throwable;

    @GET("v1/cms/articles")
    @Nullable
    /* JADX INFO: renamed from: M */
    FuturesCampaignActivityEntity mo24986M(@Query("page") int i11, @Query("pageSize") int i12, @NotNull @Query("lang") String str, @NotNull @Query("categories") String str2, @Nullable @Query("weight") Integer num) throws Throwable;

    @GET("v1/kumex-trade/user/contractsConfigs")
    @NotNull
    /* JADX INFO: renamed from: S */
    Map<String, SymbolConfig> mo24991S() throws Throwable;

    @GET("v1/km/user/agreements")
    @Nullable
    /* JADX INFO: renamed from: U */
    List<OpenFuturesAgreement> mo24994U() throws Throwable;

    @GET("v1/nasdaq/market-status")
    @NotNull
    /* JADX INFO: renamed from: W */
    NasdaqMarketStatusEntity mo24995W() throws Throwable;

    @GET("v1/currency")
    @NotNull
    /* JADX INFO: renamed from: Z */
    List<CoinEntity> mo24998Z(@Header("X-SERVICE-PLATFORM") @NotNull String str) throws Throwable;

    @Nullable
    @FormUrlEncoded
    @POST("v1/kumex/user-contracts-config")
    /* JADX INFO: renamed from: a */
    Object mo24999a(@FieldMap @NotNull Map<String, String> map) throws Throwable;

    @GET("/timestamp")
    /* JADX INFO: renamed from: a0 */
    long mo25000a0() throws Throwable;

    @GET("v1/kumex/user-contracts-config")
    @NotNull
    /* JADX INFO: renamed from: b */
    Map<String, SymbolConfig> mo25001b(@Header("Cache-Time") @NotNull String str) throws Throwable;

    @GET("v2/km/trade/configs/queryMarginHedgeRate")
    @NotNull
    /* JADX INFO: renamed from: b0 */
    HedgeDiscountRateEntity mo25002b0() throws Throwable;

    @GET("v1/platform-resource-position/position")
    @NotNull
    /* JADX INFO: renamed from: f */
    Map<String, List<ResourcePositionEntity>> mo25008f(@NotNull @Query("code") String str) throws Throwable;

    @Headers({"Cache-Time: 30000"})
    @GET("v1/system-config")
    @NotNull
    /* JADX INFO: renamed from: g */
    SystemConfig mo25010g() throws Throwable;

    @Headers({"Cache-Time: 1000", "X-KC-CDN-SITE-TYPE: global"})
    @GET("discover-front/trading/item")
    @NotNull
    /* JADX INFO: renamed from: g0 */
    Observable<BaseEntity<MarketListEntityItem>> mo25011g0(@NotNull @Query("datasource") String str, @Nullable @Query("symbol") String str2, @NotNull @Query("customizations") String str3);

    @Headers({"Cache-Time: 30000"})
    @GET("v1/kumex/announcement")
    @NotNull
    /* JADX INFO: renamed from: m */
    NoticeEntity mo25018m() throws Throwable;

    @GET("v1/adTips")
    @NotNull
    /* JADX INFO: renamed from: q */
    NoticeConfig mo25023q() throws Throwable;

    @GET("v1/kumex-contract/contracts-info")
    @NotNull
    /* JADX INFO: renamed from: r */
    List<ContractEntity> mo25025r(@HeaderMap @NotNull Map<String, String> map) throws Throwable;

    @GET("v1/copyTrading/isPushGuidePopUp")
    @Nullable
    /* JADX INFO: renamed from: u */
    Boolean mo25030u() throws Throwable;

    @GET("v1/platform-resource-position/position")
    @NotNull
    /* JADX INFO: renamed from: x */
    Map<String, List<ResourcePositionEntity>> mo25033x(@NotNull @Query("code") String str, @NotNull @Query("tradeType") String str2, @NotNull @Query("symbol") String str3) throws Throwable;

    @GET("v1/km/trade/configs/strategy")
    @Nullable
    /* JADX INFO: renamed from: z */
    StrategyOrderConfigEntity mo25035z() throws Throwable;

    /* JADX INFO: renamed from: c0 */
    static /* synthetic */ FuturesCampaignActivityEntity m99449c0(InterfaceC44974a interfaceC44974a, int i11, int i12, String str, String str2, Integer num, int i13, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCampaignActivities");
        }
        if ((i13 & 4) != 0) {
            str = "en_US";
        }
        String str3 = str;
        if ((i13 & 16) != 0) {
            num = null;
        }
        return interfaceC44974a.mo24986M(i11, i12, str3, str2, num);
    }

    /* JADX INFO: renamed from: h0 */
    static /* synthetic */ Observable m99450h0(InterfaceC44974a interfaceC44974a, String str, String str2, String str3, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDiscoverTradeDataBySymbols");
        }
        if ((i11 & 1) != 0) {
            str = "Futures";
        }
        if ((i11 & 4) != 0) {
            str3 = "UserFavorites,PriceWarn";
        }
        return interfaceC44974a.mo25011g0(str, str2, str3);
    }

    /* JADX INFO: renamed from: w */
    static /* synthetic */ List m99451w(InterfaceC44974a interfaceC44974a, String str, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchCoinList");
        }
        if ((i11 & 1) != 0) {
            str = "KUMEX";
        }
        return interfaceC44974a.mo24998Z(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    static /* synthetic */ List m99452y(InterfaceC44974a interfaceC44974a, Map map, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchContractList");
        }
        if ((i11 & 1) != 0) {
            map = MapsKt.hashMapOf(TuplesKt.m90091to("Cache-Time", "10000"));
        }
        return interfaceC44974a.mo25025r(map);
    }
}
