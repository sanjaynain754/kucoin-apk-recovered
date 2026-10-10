package e50;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.tradingbotkit.bean.params.StopBean;
import com.kubi.tradingbotkit.business.strategyList.entity.StrategyItemEntity;
import com.kubi.tradingbotkit.entity.CurrencyBalanceEntity;
import com.kubi.tradingbotkit.entity.OrderBookCenterEntity;
import com.kubi.tradingbotkit.entity.SymbolEntity;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;

/* JADX INFO: renamed from: e50.a */
/* JADX INFO: compiled from: RobotSpotApi.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00032\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000bH'J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000bH'J(\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00032\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000bH'J(\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00032\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u000bH'J\u001a\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u0018H'J \u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00040\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u000bH'J \u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00040\u00032\b\b\u0001\u0010\u001e\u001a\u00020\u000bH'J\u001a\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\b\b\u0001\u0010 \u001a\u00020!H'J \u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u0016H'J\u0010\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u0003H'J4\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00040\u00032\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010)\u001a\u00020\u000b2\b\b\u0003\u0010*\u001a\u00020\u000bH'J\u0018\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00032\b\b\u0001\u0010\u0017\u001a\u00020-H'J\u0018\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00032\b\b\u0001\u0010\u0017\u001a\u00020-H'J\u0018\u00100\u001a\b\u0012\u0004\u0012\u00020,0\u00032\b\b\u0001\u0010\u0017\u001a\u000201H'J\u001c\u00102\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u000104030\u0003H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00065À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/spot/restful/RobotSpotApi;", "", "getRobotSpotSymbols", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/kubi/tradingbotkit/entity/SymbolEntity;", "templateId", "", "getOrderBookCenter", "Lcom/kubi/tradingbotkit/entity/OrderBookCenterEntity;", "symbol", "", "getAiParams", "Lcom/kubi/tradingbotkit/entity/AiParameterEntity;", "taskId", "getMarketInfo", "Lcom/kubi/tradingbotkit/entity/MarketInfoEntity;", "getCurrencyBalance", "Lcom/kubi/tradingbotkit/entity/CurrencyBalanceEntity;", "accountType", FirebaseAnalytics.Param.CURRENCY, "createRobot", "", ReportDataTable.COLUMN_PARAMS, "Lcom/kubi/tradingbotkit/bean/params/CreateRobotParamsBean;", "getStrategyList", "Lcom/kubi/tradingbotkit/entity/StrategyEntity;", "type", "getStrategyListV2", "Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;", "url", "shutdownRobot", "stopBean", "Lcom/kubi/tradingbotkit/bean/params/StopBean;", "getAccountValueList", "Lcom/kubi/tradingbotkit/entity/AccountListItemEntity;", "getDefaultSymbol", "Lcom/kubi/tradingbotkit/entity/DefaultSymbolEntity;", "getTradeTickerByFreshman", "Lcom/kubi/data/entity/TradeItemBean;", "symbols", "from", "header", "getExtendRegionAmount", "Lcom/kubi/tradingbotkit/entity/ExtendRegionAmountEntity;", "Lcom/kubi/tradingbotkit/bean/params/ExtendRegionAmountBean;", "getExtendRegionExec", "", "getUpdateRegionAmount", "Lcom/kubi/tradingbotkit/bean/params/UpdateRegionBean;", "requestDowntimeInformation", "", "Lcom/kubi/tradingbotkit/entity/downtime/DowntimeInformationEntity;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC37075a {
    @GET("v1/robot/template/common/symbols")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<List<SymbolEntity>> m82978a(@Query("templateId") int i11);

    @POST("v1/robot/task/common/stop")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<Object> m82979b(@Body @NotNull StopBean stopBean);

    @GET
    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC41634e<List<StrategyItemEntity>> m82980c(@Url @NotNull String str);

    @FormUrlEncoded
    @POST("v1/account/currency-balance")
    @NotNull
    /* JADX INFO: renamed from: f */
    InterfaceC41634e<CurrencyBalanceEntity> m82981f(@Field("accountType") @Nullable String str, @Field(FirebaseAnalytics.Param.CURRENCY) @Nullable String str2);

    @GET("v1/market/orderbook-level1")
    @NotNull
    /* JADX INFO: renamed from: g */
    InterfaceC41634e<OrderBookCenterEntity> m82982g(@Nullable @Query("symbol") String str);
}
