package n70;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.utaspotlib.api.data.PreCalRiskRatioData;
import com.kubi.utaspotlib.repo.order.data.GroupRequest;
import com.kubi.utaspotlib.repo.order.data.GroupResponse;
import com.kubi.utaspotlib.repo.order.data.Response;
import com.kubi.utaspotlib.repo.order.data.SingleRequest;
import com.kubi.utaspotlib.repo.order.data.SingleResponse;
import com.kubi.utaspotlib.repo.order.data.UtaOrderRequest;
import com.kubi.utaspotlib.repo.order.data.UtaOrderResponse;
import com.kubi.utaspotlib.repo.order.data.UtaScaledOrderBody;
import io.reactivex.Observable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;

/* JADX INFO: renamed from: n70.c */
/* JADX INFO: compiled from: UtaOrderApi.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J*\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH'J(\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\f\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\rH'J4\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\f\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\r2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH'J\u001e\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0011H'J(\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u00032\b\b\u0001\u0010\f\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u0014H'J(\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u00032\b\b\u0001\u0010\f\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u0014H'JV\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00040\u00032\b\b\u0003\u0010\u0018\u001a\u00020\n2\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u001c\u001a\u00020\u001d2\b\b\u0003\u0010\u001e\u001a\u00020\u001dH'J\u001e\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00040\u00032\b\b\u0001\u0010\u0018\u001a\u00020\nH'J\u0080\u0001\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00040\u00032\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\nH'JP\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00040\u00032\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\nH'Jh\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00040\u00032\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010-\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010.\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\nH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00060À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/utaspotlib/api/UtaOrderApi;", "", "requestOrder", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/utaspotlib/repo/order/data/UtaOrderResponse;", TtmlNode.TAG_BODY, "Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;", "requestOrderV2", "validationToken", "", "requestScaledOrder", "url", "Lcom/kubi/utaspotlib/repo/order/data/UtaScaledOrderBody;", "requestScaledOrderV2", "cancelTradeOder", "Lcom/kubi/utaspotlib/repo/order/data/UtaCancelOrderData$SingleResponse;", "Lcom/kubi/utaspotlib/repo/order/data/UtaCancelOrderData$SingleRequest;", "cancelAllOrderByGroup", "Lcom/kubi/utaspotlib/repo/order/data/UtaCancelOrderData$GroupResponse;", "Lcom/kubi/utaspotlib/repo/order/data/UtaCancelOrderData$GroupRequest;", "cancelAllAdvancedOrderByGroup", "fetchActiveOrders", "Lcom/kubi/core/base/order/data/ActiveOrdersData$ListData$Response;", "tradeType", "symbol", "orderFilter", "side", "currentPage", "", "pageSize", "getOrderCounts", "Lcom/kubi/utaspotlib/repo/order/data/UtaActiveOrdersCountData$Response;", "fetchHistoryOrders", "Lcom/kubi/core/base/order/data/HistoryOrderList$Response;", "orderDisplayType", "status", "startAt", "endAt", "fetchHistoryOrderDetailFills", "Lcom/kubi/core/base/order/data/HistoryOrderDetailFills$Response;", "orderId", "preCalculateRiskRatio", "Lcom/kubi/utaspotlib/api/data/PreCalRiskRatioData;", FirebaseAnalytics.Param.PRICE, "size", "funds", "orderType", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC42773c {
    @GET("ultra-order/unified/inner/orders/counts")
    @NotNull
    /* JADX INFO: renamed from: b */
    Observable<BaseEntity<Response>> m93710b(@NotNull @Query("tradeType") String str) throws Throwable;

    @NotNull
    @Headers({"HEADER_FINGER_EVENT:unified-trade-spot"})
    @POST("ultra-trade/unified/inner/orders")
    /* JADX INFO: renamed from: c */
    Observable<BaseEntity<UtaOrderResponse>> m93711c(@Body @NotNull UtaOrderRequest utaOrderRequest) throws Throwable;

    @NotNull
    @Headers({"HEADER_FINGER_EVENT:unified-trade-spot"})
    @POST("ultra-trade/unified/inner/v2/orders")
    /* JADX INFO: renamed from: e */
    Observable<BaseEntity<UtaOrderResponse>> m93712e(@Body @NotNull UtaOrderRequest utaOrderRequest, @Header("X-VALIDATION-TOKEN") @Nullable String str) throws Throwable;

    @GET("ultra-order/unified/inner/orders/query-history-orders")
    @NotNull
    /* JADX INFO: renamed from: f */
    Observable<BaseEntity<com.kubi.core.base.order.data.Response>> m93713f(@Nullable @Query("tradeType") String str, @Nullable @Query("symbol") String str2, @Nullable @Query("side") String str3, @Nullable @Query("orderDisplayType") String str4, @Nullable @Query("status") String str5, @Nullable @Query("startAt") String str6, @Nullable @Query("endAt") String str7, @Nullable @Query("currentPage") String str8, @Nullable @Query("pageSize") String str9) throws Throwable;

    @GET("ultra-order/unified/inner/orders/query-orders")
    @NotNull
    /* JADX INFO: renamed from: g */
    Observable<BaseEntity<com.kubi.core.base.order.data.Response>> m93714g(@NotNull @Query("tradeType") String str, @Nullable @Query("symbol") String str2, @Nullable @Query("orderFilter") String str3, @Nullable @Query("side") String str4, @Query("currentPage") int i11, @Query("pageSize") int i12) throws Throwable;

    @GET("ultra-order/unified/inner/orders/pre-calculate-riskratio")
    @NotNull
    /* JADX INFO: renamed from: h */
    Observable<BaseEntity<PreCalRiskRatioData>> m93715h(@Nullable @Query("symbol") String str, @Nullable @Query(FirebaseAnalytics.Param.PRICE) String str2, @Nullable @Query("size") String str3, @Nullable @Query("funds") String str4, @Nullable @Query("side") String str5, @Nullable @Query("orderType") String str6, @Nullable @Query("tradeType") String str7) throws Throwable;

    @NotNull
    @Headers({"HEADER_FINGER_EVENT:unified-trade-spot"})
    @POST
    /* JADX INFO: renamed from: i */
    Observable<BaseEntity<UtaOrderResponse>> m93716i(@Url @NotNull String str, @Body @NotNull UtaScaledOrderBody utaScaledOrderBody, @Header("X-VALIDATION-TOKEN") @Nullable String str2) throws Throwable;

    @NotNull
    @Headers({"HEADER_FINGER_EVENT:unified-trade-spot"})
    @POST
    /* JADX INFO: renamed from: j */
    Observable<BaseEntity<UtaOrderResponse>> m93717j(@Url @NotNull String str, @Body @NotNull UtaScaledOrderBody utaScaledOrderBody) throws Throwable;

    @GET("ultra-order/unified/inner/orders/fills")
    @NotNull
    /* JADX INFO: renamed from: k */
    Observable<BaseEntity<com.kubi.core.base.order.data.Response>> m93718k(@Nullable @Query("tradeType") String str, @Nullable @Query("symbol") String str2, @Nullable @Query("orderId") String str3, @Nullable @Query("currentPage") String str4, @Nullable @Query("pageSize") String str5) throws Throwable;

    @POST("ultra-trade/unified/inner/orders/cancel")
    @NotNull
    /* JADX INFO: renamed from: l */
    Observable<BaseEntity<SingleResponse>> m93719l(@Body @NotNull SingleRequest singleRequest) throws Throwable;

    @POST
    @NotNull
    /* JADX INFO: renamed from: m */
    Observable<BaseEntity<GroupResponse>> m93720m(@Url @NotNull String str, @Body @NotNull GroupRequest groupRequest) throws Throwable;

    @POST
    @NotNull
    /* JADX INFO: renamed from: n */
    Observable<BaseEntity<GroupResponse>> m93721n(@Url @NotNull String str, @Body @NotNull GroupRequest groupRequest) throws Throwable;

    /* JADX INFO: renamed from: d */
    static /* synthetic */ Observable m93709d(InterfaceC42773c interfaceC42773c, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preCalculateRiskRatio");
        }
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        if ((i11 & 8) != 0) {
            str4 = null;
        }
        return interfaceC42773c.m93715h(str, str2, str3, str4, str5, str6, str7);
    }
}
