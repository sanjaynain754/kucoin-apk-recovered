package r60;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.kumex.data.trade.model.OrderResult;
import com.kubi.kumex.data.trade.model.SubmitScaledOrderBody;
import com.kubi.unify.entity.UnifyLeverageEntity;
import com.kubi.unify.entity.UnifyOrderEntity;
import com.kubi.unify.entity.UnifyPageEntity;
import com.kubi.unify.entity.UnifyReversePositionParams;
import com.kubi.unify.entity.UtaActiveOrdersCountDataResponse;
import com.kubi.unify.unify.common.order.delegate.UtaLimitOrMarketOrderParams;
import com.kubi.unify.unify.common.order.delegate.UtaModifyOrderParams;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.HashMap;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/* JADX INFO: renamed from: r60.a */
/* JADX INFO: compiled from: IOrderApi.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J\u001e\u0010\u0006\u001a\u00020\u00012\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH'J(\u0010\t\u001a\u00020\u00012\b\b\u0001\u0010\n\u001a\u00020\u00052\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH'J(\u0010\u000b\u001a\u00020\u00012\b\b\u0001\u0010\n\u001a\u00020\u00052\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH'J\u0012\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH'J\u001c\u0010\u0010\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u0005H'J\u0012\u0010\u0012\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u0013H'J\u001c\u0010\u0014\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u00132\b\b\u0001\u0010\u0011\u001a\u00020\u0005H'J\u001c\u0010\u0015\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u0016\u001a\u00020\u0017H'J$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0014\b\u0001\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH'J$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0014\b\u0001\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH'JF\u0010\u001d\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001ej\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u001f2\u0016\b\u0001\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\bH§@¢\u0006\u0002\u0010 J\u001c\u0010!\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\"\u001a\u00020#H'J(\u0010$\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\"\u001a\u00020#2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0005H'J\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\b\b\u0003\u0010(\u001a\u00020\u0005H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006)À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/unify/unify/common/order/api/IOrderApi;", "", "fetchUserMaxLeverage", "Lcom/kubi/unify/entity/UnifyLeverageEntity;", "symbol", "", "cancelOrder", "map", "", "cancelAllOrder", "url", "cancelAllAdvancedOrders", "submitOrder", "Lcom/kubi/kumex/data/trade/model/OrderResult;", "orderParams", "Lcom/kubi/unify/unify/common/order/delegate/UtaLimitOrMarketOrderParams;", "submitOrderV2", "validationToken", "submitModifyOrder", "Lcom/kubi/unify/unify/common/order/delegate/UtaModifyOrderParams;", "submitModifyOrderV2", "submitReversePositionOrder", ReportDataTable.COLUMN_PARAMS, "Lcom/kubi/unify/entity/UnifyReversePositionParams;", "fetchActiveOrAdvanceOrders", "Lcom/kubi/unify/entity/UnifyPageEntity;", "Lcom/kubi/unify/entity/UnifyOrderEntity;", "request", "fetchHistoryOrders", "fetchEsAccountRiskRateChange", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitScaledOrder", TtmlNode.TAG_BODY, "Lcom/kubi/kumex/data/trade/model/SubmitScaledOrderBody;", "submitScaledOrderV2", "getOrderCounts", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/unify/entity/UtaActiveOrdersCountDataResponse;", "tradeType", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC43932a {
    @GET("ultra-position/unified/inner/position/user-max-leverage")
    @NotNull
    /* JADX INFO: renamed from: a */
    UnifyLeverageEntity m96857a(@NotNull @Query("symbol") String str) throws Throwable;

    @GET("ultra-order/unified/inner/orders/counts")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<UtaActiveOrdersCountDataResponse> m96858b(@NotNull @Query("tradeType") String str) throws Throwable;

    @GET("ultra-order/unified/inner/orders/query-history-orders")
    @NotNull
    /* JADX INFO: renamed from: j */
    UnifyPageEntity<UnifyOrderEntity> m96859j(@QueryMap @NotNull Map<String, String> map) throws Throwable;

    @GET("ultra-order/unified/inner/orders/query-orders")
    @NotNull
    /* JADX INFO: renamed from: k */
    UnifyPageEntity<UnifyOrderEntity> m96860k(@QueryMap @NotNull Map<String, String> map) throws Throwable;

    @Headers({"HEADER_FINGER_EVENT:unified-trade-futures"})
    @POST("ultra-trade/unified/inner/v2/orders")
    @NotNull
    /* JADX INFO: renamed from: l */
    OrderResult m96861l(@Body @NotNull UtaLimitOrMarketOrderParams utaLimitOrMarketOrderParams, @Header("X-VALIDATION-TOKEN") @NotNull String str) throws Throwable;

    @POST("ultra-trade/unified/inner/orders/cancel")
    @NotNull
    /* JADX INFO: renamed from: m */
    Object m96862m(@Body @NotNull Map<String, String> map) throws Throwable;

    @Headers({"HEADER_FINGER_EVENT:unified-trade-futures"})
    @POST("ultra-trade/unified/inner/v2/orders/modify")
    @NotNull
    /* JADX INFO: renamed from: n */
    OrderResult m96863n(@Body @NotNull UtaModifyOrderParams utaModifyOrderParams, @Header("X-VALIDATION-TOKEN") @NotNull String str) throws Throwable;

    @Headers({"HEADER_FINGER_EVENT:trade-futures"})
    @POST
    @NotNull
    /* JADX INFO: renamed from: o */
    OrderResult m96864o(@Url @NotNull String str, @Body @NotNull SubmitScaledOrderBody submitScaledOrderBody, @Header("X-VALIDATION-TOKEN") @Nullable String str2) throws Throwable;

    @Headers({"HEADER_FINGER_EVENT:unified-trade-futures"})
    @POST("ultra-trade/unified/inner/orders/modify")
    @NotNull
    /* JADX INFO: renamed from: p */
    OrderResult m96865p(@Body @NotNull UtaModifyOrderParams utaModifyOrderParams) throws Throwable;

    @Headers({"HEADER_FINGER_EVENT:trade-futures"})
    @POST
    @NotNull
    /* JADX INFO: renamed from: q */
    OrderResult m96866q(@Url @NotNull String str, @Body @NotNull SubmitScaledOrderBody submitScaledOrderBody) throws Throwable;

    @POST
    @NotNull
    /* JADX INFO: renamed from: r */
    Object m96867r(@Url @NotNull String str, @Body @NotNull Map<String, String> map) throws Throwable;

    @GET("ultra-order/unified/inner/orders/pre-calculate-riskratio")
    @Nullable
    /* JADX INFO: renamed from: s */
    Object m96868s(@QueryMap @NotNull Map<String, String> map, @NotNull Continuation<? super HashMap<String, Object>> continuation) throws Throwable;

    @POST
    @NotNull
    /* JADX INFO: renamed from: u */
    Object m96869u(@Url @NotNull String str, @Body @NotNull Map<String, String> map) throws Throwable;

    @Headers({"HEADER_FINGER_EVENT:unified-trade-futures"})
    @POST
    @NotNull
    /* JADX INFO: renamed from: v */
    OrderResult m96870v(@Url @NotNull String str, @Body @NotNull UnifyReversePositionParams unifyReversePositionParams) throws Throwable;

    @Headers({"HEADER_FINGER_EVENT:unified-trade-futures"})
    @POST("ultra-trade/unified/inner/orders")
    @NotNull
    /* JADX INFO: renamed from: w */
    OrderResult m96871w(@Body @NotNull UtaLimitOrMarketOrderParams utaLimitOrMarketOrderParams) throws Throwable;

    /* JADX INFO: renamed from: t */
    static /* synthetic */ InterfaceC41634e m96856t(InterfaceC43932a interfaceC43932a, String str, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOrderCounts");
        }
        if ((i11 & 1) != 0) {
            str = "ALL";
        }
        return interfaceC43932a.m96858b(str);
    }
}
