package p768xo;

import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.util.Constants;
import com.kubi.data.entity.MarginSymbolInfo;
import com.kubi.margin.api.entity.FeeEntity;
import com.kubi.margin.api.entity.FundsInfo;
import com.kubi.margin.api.entity.IsolateMarginPosition;
import com.kubi.margin.api.entity.IsolateMarginPositionTag;
import com.kubi.margin.api.entity.LeverBalance;
import com.kubi.margin.api.entity.MarginBonusConfig;
import com.kubi.margin.api.entity.MarginCouponConfig;
import com.kubi.margin.api.entity.MarginNoticeBanner;
import com.kubi.margin.api.entity.MarginPosition;
import com.kubi.margin.api.entity.MarkPrice;
import com.kubi.margin.entity.IsolateMarginPositionConfig;
import com.kubi.margin.entity.LeverConfig;
import com.kubi.margin.entity.LeverOpen;
import com.kubi.margin.entity.LeverSymbolMarket;
import com.kubi.margin.entity.LiquidationCurrencyConfig;
import com.kubi.margin.entity.MarginAsset;
import com.kubi.margin.entity.MarginBannerV2;
import com.kubi.margin.entity.MarginDebtPositions;
import com.kubi.margin.entity.MarginPermission;
import com.kubi.margin.entity.MarginSymbol;
import com.kubi.margin.entity.NewUpCoin;
import com.kubi.margin.trade.dialog.LiquidationCrossParams;
import com.kubi.sdk.base.entity.BaseEntity;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: xo.f */
/* JADX INFO: compiled from: MarginApi.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H'J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00040\u0003H'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u0003H'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u0003H'J\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u000fH'J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u0003H'J\b\u0010\u0012\u001a\u00020\u0011H'J\u001e\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00040\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u000fH'J/\u0010\u0016\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00140\u0018j\b\u0012\u0004\u0012\u00020\u0014`\u00190\u00172\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001bH'¢\u0006\u0002\u0010\u001cJ\u0012\u0010\u001d\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u000fH'J\u0014\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u0003H'J\u0014\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u0003H'J\u0014\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00040\u0003H'J\u0014\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00040\u0003H'J\u0014\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00040\u0003H'J\u001e\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010&\u001a\u00020\u000fH'J)\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00040\u00032\u000e\b\u0001\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000f0*H'¢\u0006\u0002\u0010+J\u001e\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010-\u001a\u00020\u000fH'J\u001a\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00050\u00040\u0003H'J\u001a\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00050\u00040\u0003H'J%\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u00040\u00032\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001bH'¢\u0006\u0002\u00103J1\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u00040\u00032\n\b\u0003\u00106\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u00107\u001a\u0004\u0018\u00010\u001bH'¢\u0006\u0002\u00108J%\u00109\u001a\u0002052\n\b\u0003\u00106\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u00107\u001a\u0004\u0018\u00010\u001bH'¢\u0006\u0002\u0010:J(\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010&\u001a\u00020\u000f2\b\b\u0001\u0010<\u001a\u00020\u000fH'J \u0010=\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0\u00040\u00032\b\b\u0001\u0010?\u001a\u00020\u000fH'J\u001e\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0\u00040\u00032\b\b\u0001\u0010<\u001a\u00020\u000fH'J.\u0010B\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\u00050\u00040\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u000f2\b\b\u0003\u0010D\u001a\u00020\u000fH'J\"\u0010E\u001a\b\u0012\u0004\u0012\u00020C0\u00052\b\b\u0001\u0010\u0015\u001a\u00020\u000f2\b\b\u0003\u0010D\u001a\u00020\u000fH'J(\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010<\u001a\u00020\u000f2\b\b\u0001\u0010G\u001a\u00020\u001bH'J(\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0\u00040\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u000f2\b\b\u0001\u0010<\u001a\u00020\u000fH'J*\u0010J\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\u00050\u00040\u00032\u000e\b\u0001\u0010L\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005H'J \u0010M\u001a\b\u0012\u0004\u0012\u00020K0\u00052\u0010\b\u0001\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0005H'J\u001a\u0010N\u001a\u00020O2\u0010\b\u0001\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0005H'J\u001e\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u00040\u00032\b\b\u0003\u0010R\u001a\u00020\u000fH'J\u0014\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0\u00040\u0003H'J2\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020V0\u00040\u00032\b\b\u0001\u0010<\u001a\u00020\u000f2\b\b\u0003\u0010W\u001a\u00020\u001b2\b\b\u0003\u0010X\u001a\u00020\u001bH'J(\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010<\u001a\u00020\u000f2\b\b\u0001\u0010Z\u001a\u00020\u000fH'J2\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010<\u001a\u00020\u000f2\b\b\u0001\u0010Z\u001a\u00020\u000f2\b\b\u0001\u0010\\\u001a\u00020\u000fH'J\u001e\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010^\u001a\u00020_H'J(\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010^\u001a\u00020_2\b\b\u0001\u0010\\\u001a\u00020\u000fH'J\u0014\u0010a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0003H'J\u001e\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010<\u001a\u00020\u000fH'J\u0014\u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020d0\u00040\u0003H'J$\u0010e\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00140\u0018j\b\u0012\u0004\u0012\u00020\u0014`\u00190\u00040\u0003H'J\u0014\u0010f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0003H'J\u001e\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\b\b\u0001\u0010h\u001a\u00020\u000fH'J\u001e\u0010i\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\b\b\u0003\u0010h\u001a\u00020\u000fH'J\u0014\u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020k0\u00040\u0003H'J$\u0010l\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020m0\u0018j\b\u0012\u0004\u0012\u00020m`\u00190\u00040\u0003H'J\u0014\u0010n\u001a\b\u0012\u0004\u0012\u00020o0\u0004H§@¢\u0006\u0002\u0010pJ\u0014\u0010q\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004H§@¢\u0006\u0002\u0010pJ\u0016\u0010r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H§@¢\u0006\u0002\u0010pø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006sÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/margin/api/MarginApi;", "", "getMarginMarketSymbols", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "", "Lcom/kubi/margin/entity/LeverSymbolMarket;", "getMarginSymbols", "Lcom/kubi/margin/entity/MarginSymbol;", "getMarginWelfareConfig", "Lcom/kubi/margin/api/entity/MarginCouponConfig;", "fetchMarginBonus", "Lcom/kubi/margin/api/entity/MarginBonusConfig;", "receiveMarginBonus", "id", "", "leverPositionInfo", "Lcom/kubi/margin/api/entity/LeverBalance;", "leverPositionInfoSync", "singlePositionInfo", "Lcom/kubi/margin/api/entity/FundsInfo;", FirebaseAnalytics.Param.CURRENCY, "fetchCrossAssetsList", "Lkotlinx/coroutines/flow/Flow;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "filterNotLoan", "", "(Ljava/lang/Boolean;)Lkotlinx/coroutines/flow/Flow;", "singlePositionInfoSync", "openLeverExam", "openEtfExam", "openLever", "Lcom/kubi/margin/entity/LeverOpen;", "fetchMarginConfigs", "Lcom/kubi/margin/entity/LeverConfig;", "fetchMarginConfigsV2", "modifyUserWholeLeverage", "userLeverage", "fetchMarginBalance", "Lcom/kubi/margin/entity/MarginAsset;", "currencyList", "", "([Ljava/lang/String;)Lio/reactivex/Observable;", "setMarginAutoReturn", "switchStatus", "fetchIsolateMarginConfigs", "Lcom/kubi/margin/entity/IsolateMarginPositionConfig;", "fetchIsolateMarginConfigsV2", "fetchIsolateMarginPositions", "Lcom/kubi/margin/api/entity/IsolateMarginPosition;", "(Ljava/lang/Boolean;)Lio/reactivex/Observable;", "getSingleMarginPositionByCode", "Lcom/kubi/margin/api/entity/MarginPosition;", "symbolCode", "withCache", "(Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/Observable;", "getSingleMarginPositionByCodeSync", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/margin/api/entity/MarginPosition;", "modifyUserLeverage", "symbol", "fetchEtfTicker", "Ljava/math/BigDecimal;", AppsFlyerProperties.CURRENCY_CODE, "getTradeFee", "Lcom/kubi/margin/api/entity/FeeEntity;", "getIsoLatePositionTags", "Lcom/kubi/margin/api/entity/IsolateMarginPositionTag;", "bizType", "getIsoLatePositionTagsBorrow", "setIsolateMarginAutoReturn", Constants.ENABLE_DISABLE, "getIsolatedTransfer", "Lcom/kubi/margin/api/entity/MarginTransfer;", "getMarginMarkPrices", "Lcom/kubi/margin/api/entity/MarkPrice;", "symbolList", "getMarginMarkPricesSync", "getMarginMarkPricesRequest", "Lokhttp3/Request;", "marginPermission", "Lcom/kubi/margin/entity/MarginPermission;", AppsFlyerProperties.CHANNEL, "getMarginBannersV2", "Lcom/kubi/margin/entity/MarginBannerV2;", "getMarginDebtPositions", "Lcom/kubi/margin/entity/MarginDebtPositions;", "onlyShowCurrent", "includeAssetPosition", "oneKeyLiquidation", "model", "oneKeyLiquidationV2", "validationToken", "oneKeyLiquidationCross", ReportDataTable.COLUMN_PARAMS, "Lcom/kubi/margin/trade/dialog/LiquidationCrossParams;", "oneKeyLiquidationCrossV2", "cancelOneKeyLiquidationCross", "cancelOneKeyLiquidation", "fetchLiquidationCurrencyConfig", "Lcom/kubi/margin/entity/LiquidationCurrencyConfig;", "getLeverDetail", "agreeEtf", "fetchMarginTaxTips", "type", "fetchSpotTaxTips", "fetchNewUpCoin", "Lcom/kubi/margin/entity/NewUpCoin;", "fetchMarginSymbols", "Lcom/kubi/data/entity/MarginSymbolInfo;", "getMarginNoticeBanner", "Lcom/kubi/margin/api/entity/MarginNoticeBanner;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkMarginRiskAgreement", "signMarginRiskAgreement", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC46305f {
    @GET("v1/position/funds-info")
    @NotNull
    /* JADX INFO: renamed from: A */
    Observable<BaseEntity<ArrayList<FundsInfo>>> m102067A();

    @GET("v1/mark-prices/last-records")
    @NotNull
    /* JADX INFO: renamed from: B */
    Observable<BaseEntity<List<MarkPrice>>> m102068B(@NotNull @Query("symbolList") List<String> list);

    @GET("v1/margin/risk-agreement/sign")
    @Nullable
    /* JADX INFO: renamed from: C */
    Object m102069C(@NotNull Continuation<? super BaseEntity<Object>> continuation);

    @GET("v2/margin/symbols")
    @NotNull
    /* JADX INFO: renamed from: E */
    Observable<BaseEntity<ArrayList<MarginSymbolInfo>>> m102070E();

    @GET("v1/margin/position/query-assets")
    @NotNull
    /* JADX INFO: renamed from: F */
    Observable<BaseEntity<MarginAsset>> m102071F(@NotNull @Query("currencyList") String[] strArr);

    @GET("v1/margin/trading-exam")
    @NotNull
    /* JADX INFO: renamed from: G */
    Observable<BaseEntity<String>> m102072G();

    @GET("v2/margin/banner/list")
    @NotNull
    /* JADX INFO: renamed from: I */
    Observable<BaseEntity<MarginBannerV2>> m102073I();

    @GET("v1/margin/isolated/position/currentAndDebt")
    @NotNull
    /* JADX INFO: renamed from: J */
    Observable<BaseEntity<MarginDebtPositions>> m102074J(@NotNull @Query("symbol") String str, @Query("onlyShowCurrent") boolean z11, @Query("includeAssetPosition") boolean z12);

    @GET("v1/margin/one-click-liquidation/config")
    @NotNull
    /* JADX INFO: renamed from: K */
    Observable<BaseEntity<LiquidationCurrencyConfig>> m102075K();

    @GET("v1/margin-coupon/coupon/last-coupon")
    @NotNull
    /* JADX INFO: renamed from: L */
    Observable<BaseEntity<MarginCouponConfig>> m102076L();

    @FormUrlEncoded
    @POST("v1/margin/position/one-click-liquidation/cancel")
    @NotNull
    /* JADX INFO: renamed from: M */
    Observable<BaseEntity<Object>> m102077M(@Field("symbol") @NotNull String str);

    @GET("v1/margin/isolated/position-cfgs")
    @NotNull
    /* JADX INFO: renamed from: N */
    Observable<BaseEntity<List<IsolateMarginPositionConfig>>> m102078N();

    @GET("v1/margin/isolated/position/tags")
    @NotNull
    /* JADX INFO: renamed from: O */
    List<IsolateMarginPositionTag> m102079O(@NotNull @Query(FirebaseAnalytics.Param.CURRENCY) String str, @NotNull @Query("bizType") String str2) throws Exception;

    @GET("v2/margin/market-symbols")
    @NotNull
    /* JADX INFO: renamed from: P */
    Observable<BaseEntity<List<LeverSymbolMarket>>> m102080P();

    @GET("v1/margin-fund/trading-exam")
    @NotNull
    /* JADX INFO: renamed from: Q */
    Observable<BaseEntity<String>> m102081Q();

    @GET("v1/trade/get-fee")
    @NotNull
    /* JADX INFO: renamed from: R */
    Observable<BaseEntity<FeeEntity>> m102082R(@NotNull @Query("symbol") String str);

    @GET("v1/margin/risk-agreement/chk")
    @Nullable
    /* JADX INFO: renamed from: S */
    Object m102083S(@NotNull Continuation<? super BaseEntity<Boolean>> continuation);

    @GET("v1/margin/tax/tips/query")
    @NotNull
    /* JADX INFO: renamed from: T */
    Observable<BaseEntity<String>> m102084T(@NotNull @Query("type") String str);

    @FormUrlEncoded
    @POST("v1/margin/position/permission-check")
    @NotNull
    /* JADX INFO: renamed from: U */
    Observable<BaseEntity<MarginPermission>> m102085U(@Field(AppsFlyerProperties.CHANNEL) @NotNull String str);

    @GET("v1/kc/tax/tips/query")
    @NotNull
    /* JADX INFO: renamed from: V */
    Observable<BaseEntity<String>> m102086V(@NotNull @Query("type") String str);

    @GET("v1/margin/notice-banner")
    @Nullable
    /* JADX INFO: renamed from: W */
    Object m102087W(@NotNull Continuation<? super BaseEntity<MarginNoticeBanner>> continuation);

    @GET("v1/margin/isolated/assets")
    @NotNull
    /* JADX INFO: renamed from: X */
    Observable<BaseEntity<IsolateMarginPosition>> m102088X(@Nullable @Query("filterNotLoan") Boolean bool);

    @FormUrlEncoded
    @POST("v1/margin/position/one-click-liquidation")
    @NotNull
    /* JADX INFO: renamed from: Y */
    Observable<BaseEntity<Object>> m102089Y(@Field("symbol") @NotNull String str, @Field("model") @NotNull String str2);

    @FormUrlEncoded
    @POST("v2/margin/position/one-click-liquidation")
    @NotNull
    /* JADX INFO: renamed from: a */
    Observable<BaseEntity<Object>> m102090a(@Field("symbol") @NotNull String str, @Field("model") @NotNull String str2, @Header("X-VALIDATION-TOKEN") @NotNull String str3);

    @GET("v1/position/funds-info")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<ArrayList<FundsInfo>> m102091b(@Nullable @Query("filterNotLoan") Boolean bool);

    @GET("v1/margin/isolated/position")
    @NotNull
    /* JADX INFO: renamed from: c */
    MarginPosition m102092c(@Nullable @Query("tag") String str, @Nullable @Query("withCache") Boolean bool) throws Exception;

    @GET("v1/position/currency/funds-info")
    @NotNull
    /* JADX INFO: renamed from: d */
    Observable<BaseEntity<FundsInfo>> m102093d(@NotNull @Query(FirebaseAnalytics.Param.CURRENCY) String str);

    @GET("v1/position/currency/funds-info")
    @NotNull
    /* JADX INFO: renamed from: e */
    FundsInfo m102094e(@NotNull @Query(FirebaseAnalytics.Param.CURRENCY) String str) throws Exception;

    @GET("v1/position/info")
    @NotNull
    /* JADX INFO: renamed from: f */
    Observable<BaseEntity<LeverBalance>> m102095f();

    @GET("v1/margin-fund/agreement/agree")
    @NotNull
    /* JADX INFO: renamed from: g */
    Observable<BaseEntity<Object>> m102096g();

    @GET("v1/symbol/loan-symbols")
    @NotNull
    /* JADX INFO: renamed from: h */
    Observable<BaseEntity<List<MarginSymbol>>> m102097h();

    @GET("v1/position/info")
    @NotNull
    /* JADX INFO: renamed from: i */
    LeverBalance m102098i() throws Exception;

    @GET("v1/margin/isolated/position")
    @NotNull
    /* JADX INFO: renamed from: j */
    Observable<BaseEntity<MarginPosition>> m102099j(@Nullable @Query("tag") String str, @Nullable @Query("withCache") Boolean bool);

    @GET("v1/margin-fund/fund/currency/nav")
    @NotNull
    /* JADX INFO: renamed from: k */
    Observable<BaseEntity<BigDecimal>> m102100k(@NotNull @Query(AppsFlyerProperties.CURRENCY_CODE) String str);

    @GET("v1/mark-prices/last-records")
    @NotNull
    /* JADX INFO: renamed from: l */
    List<MarkPrice> m102101l(@NotNull @Query("symbolList") List<String> list) throws Exception;

    @GET("v1/margin/configs")
    @NotNull
    /* JADX INFO: renamed from: m */
    Observable<BaseEntity<LeverConfig>> m102102m();

    @GET("v2/margin/isolated/position-cfgs")
    @NotNull
    /* JADX INFO: renamed from: o */
    Observable<BaseEntity<List<IsolateMarginPositionConfig>>> m102103o();

    @FormUrlEncoded
    @POST("v1/margin/position/update-user-leverage")
    @NotNull
    /* JADX INFO: renamed from: p */
    Observable<BaseEntity<Object>> m102104p(@Field("leverage") @NotNull String str);

    @GET("v1/margin/currency/query-up-remind")
    @NotNull
    /* JADX INFO: renamed from: q */
    Observable<BaseEntity<NewUpCoin>> m102105q();

    @POST("v1/margin/one-click-liquidation")
    @NotNull
    /* JADX INFO: renamed from: r */
    Observable<BaseEntity<Object>> m102106r(@Body @NotNull LiquidationCrossParams liquidationCrossParams);

    @FormUrlEncoded
    @POST("v1/margin/isolated/position/update-user-leverage")
    @NotNull
    /* JADX INFO: renamed from: s */
    Observable<BaseEntity<Object>> m102107s(@Field("userLeverage") @NotNull String str, @Field("symbol") @NotNull String str2);

    @GET("v1/margin/bonus/status/by-user")
    @NotNull
    /* JADX INFO: renamed from: t */
    Observable<BaseEntity<MarginBonusConfig>> m102108t();

    @POST("v1/margin/one-click-liquidation/cancel")
    @NotNull
    /* JADX INFO: renamed from: v */
    Observable<BaseEntity<Object>> m102109v();

    @GET("v1/margin/configs/by-user-id")
    @NotNull
    /* JADX INFO: renamed from: w */
    Observable<BaseEntity<LeverConfig>> m102110w();

    @POST("v2/margin/one-click-liquidation")
    @NotNull
    /* JADX INFO: renamed from: x */
    Observable<BaseEntity<Object>> m102111x(@Body @NotNull LiquidationCrossParams liquidationCrossParams, @Header("X-VALIDATION-TOKEN") @NotNull String str);

    @GET("v1/mark-prices/last-records")
    @NotNull
    /* JADX INFO: renamed from: y */
    Request m102112y(@NotNull @Query("symbolList") List<String> list);

    @POST("v1/position/open")
    @NotNull
    /* JADX INFO: renamed from: z */
    Observable<BaseEntity<LeverOpen>> m102113z();

    /* JADX INFO: renamed from: D */
    static /* synthetic */ Observable m102063D(InterfaceC46305f interfaceC46305f, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: marginPermission");
        }
        if ((i11 & 1) != 0) {
            str = "TRANSFER-IN";
        }
        return interfaceC46305f.m102085U(str);
    }

    /* JADX INFO: renamed from: H */
    static /* synthetic */ Observable m102064H(InterfaceC46305f interfaceC46305f, String str, Boolean bool, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSingleMarginPositionByCode");
        }
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            bool = Boolean.FALSE;
        }
        return interfaceC46305f.m102099j(str, bool);
    }

    /* JADX INFO: renamed from: n */
    static /* synthetic */ Observable m102065n(InterfaceC46305f interfaceC46305f, String str, boolean z11, boolean z12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMarginDebtPositions");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = true;
        }
        return interfaceC46305f.m102074J(str, z11, z12);
    }

    /* JADX INFO: renamed from: u */
    static /* synthetic */ List m102066u(InterfaceC46305f interfaceC46305f, String str, String str2, int i11, Object obj) throws Exception {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIsoLatePositionTagsBorrow");
        }
        if ((i11 & 2) != 0) {
            str2 = "BORROW_TRADE";
        }
        return interfaceC46305f.m102079O(str, str2);
    }
}
