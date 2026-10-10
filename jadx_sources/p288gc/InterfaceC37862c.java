package p288gc;

import com.kubi.copytrading.futures.FutureCopyTradingConfig;
import com.kubi.kumex.data.platform.model.UserMaxLeverageEntity;
import com.kubi.kumex.data.trade.model.CouponDetailEntity;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.data.trade.model.OrderResult;
import com.kubi.sdk.PageEntity;
import java.math.BigDecimal;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: renamed from: gc.c */
/* JADX INFO: compiled from: IOrderApi.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J\u0012\u0010\u0006\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J\u001e\u0010\u0007\u001a\u00020\u00012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\t\u001a\u00020\u0005H'J=\u0010\n\u001a\u00020\u00012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0002\u0010\u000eJ1\u0010\u000f\u001a\u00020\u00012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u00122\u0014\b\u0001\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0014H'J4\u0010\u0015\u001a\u00020\u00122\u0014\b\u0001\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u00052\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0005H'J4\u0010\u0018\u001a\u00020\u00122\u0014\b\u0001\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u00052\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0005H'JV\u0010\u0019\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u001a\u001a\u00020\u00052\b\b\u0001\u0010\u001b\u001a\u00020\u00052\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u001eH'Jl\u0010!\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u001a\u001a\u00020\u00052\b\b\u0001\u0010\u001b\u001a\u00020\u00052\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u001e2\b\b\u0001\u0010\u0016\u001a\u00020\u00052\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0005H'Jl\u0010\"\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u001a\u001a\u00020\u00052\b\b\u0001\u0010\u001b\u001a\u00020\u00052\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u001e2\b\b\u0001\u0010\u0016\u001a\u00020\u00052\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0005H'J\u001e\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010%\u001a\u00020\fH'J$\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'2\u0014\b\u0001\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0014H'J$\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0014\b\u0001\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0014H'J&\u0010*\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'2\u0014\b\u0001\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0014H'J&\u0010+\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'2\u0014\b\u0001\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0014H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006,À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/copytrading/copytd/common/order/api/IOrderApi;", "", "fetchUserMaxLeverage", "Lcom/kubi/kumex/data/platform/model/UserMaxLeverageEntity;", "symbol", "", "fetchTrialUserMaxLeverage", "cancelOrder", "orderId", "fundsType", "cancelAllOrder", "includeStopOrders", "", "includeShortCutStopOrders", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/Object;", "cancelAllAdvancedOrders", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/Object;", "submitOrder", "Lcom/kubi/kumex/data/trade/model/OrderResult;", "request", "", "submitOrderV2", "validationToken", "subUid", "submitTrialOrder", "submitStopOrder", "positionSide", "marginMode", "upType", "upPrice", "Ljava/math/BigDecimal;", "downType", "downPrice", "submitStopOrderV2", "submitTrialStopOrder", "fetchCouponDetail", "Lcom/kubi/kumex/data/trade/model/CouponDetailEntity;", "isTrialFunds", "fetchActiveOrders", "Lcom/kubi/sdk/PageEntity;", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "fetchTrialActiveOrders", "fetchAdvancedOrders", "fetchTrialAdvancedOrders", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC37862c {
    @GET("v1/copyTrading/exchange/getCrossUserMaxLeverage")
    @NotNull
    /* JADX INFO: renamed from: a */
    UserMaxLeverageEntity m85449a(@NotNull @Query("symbol") String str) throws Throwable;

    @NotNull
    @FormUrlEncoded
    @Headers({"HEADER_FINGER_EVENT:trade-futures"})
    @POST("v1/copyTrading/futures/orders")
    /* JADX INFO: renamed from: b */
    OrderResult m85450b(@FieldMap @NotNull Map<String, String> map) throws Throwable;

    @NotNull
    @FormUrlEncoded
    @Headers({"HEADER_FINGER_EVENT:trade-futures-updateStopOrdersFromShortcut"})
    @POST("v1/copyTrading/exchange/futures/updateStopOrdersFromShortcut")
    /* JADX INFO: renamed from: d */
    Object m85451d(@Field("symbol") @NotNull String str, @Field("positionSide") @NotNull String str2, @Field("marginMode") @NotNull String str3, @Field("upStopPriceType") @Nullable String str4, @Field("upPrice") @Nullable BigDecimal bigDecimal, @Field("downStopPriceType") @Nullable String str5, @Field("downPrice") @Nullable BigDecimal bigDecimal2) throws Throwable;

    @NotNull
    @FormUrlEncoded
    @Headers({"HEADER_FINGER_EVENT:trade-futures"})
    @POST("v2/copyTrading/futures/orders")
    /* JADX INFO: renamed from: e */
    OrderResult m85452e(@FieldMap @NotNull Map<String, String> map, @Header("X-VALIDATION-TOKEN") @NotNull String str, @Header("X-SUB-UID") @Nullable String str2) throws Throwable;

    @GET("v1/copyTrading/exchange/futures/orders")
    @NotNull
    /* JADX INFO: renamed from: f */
    PageEntity<OrderEntity> m85453f(@QueryMap @NotNull Map<String, String> map) throws Throwable;

    @GET("v1/copyTrading/exchange/futures/stopOrders")
    @Nullable
    /* JADX INFO: renamed from: g */
    PageEntity<OrderEntity> m85454g(@QueryMap @NotNull Map<String, String> map) throws Throwable;

    @NotNull
    @FormUrlEncoded
    @Headers({"HEADER_FINGER_EVENT:trade-futures-updateStopOrdersFromShortcut"})
    @POST("v2/copyTrading/exchange/futures/updateStopOrdersFromShortcut")
    /* JADX INFO: renamed from: h */
    Object m85455h(@Field("symbol") @NotNull String str, @Field("positionSide") @NotNull String str2, @Field("marginMode") @NotNull String str3, @Field("upStopPriceType") @Nullable String str4, @Field("upPrice") @Nullable BigDecimal bigDecimal, @Field("downStopPriceType") @Nullable String str5, @Field("downPrice") @Nullable BigDecimal bigDecimal2, @Header("X-VALIDATION-TOKEN") @NotNull String str6, @Header("X-SUB-UID") @Nullable String str7) throws Throwable;

    @GET("v1/copyTrading/exchange/getTrialCrossUserMaxLeverage")
    @NotNull
    /* JADX INFO: renamed from: i */
    UserMaxLeverageEntity m85456i(@NotNull @Query("symbol") String str) throws Throwable;

    @NotNull
    @FormUrlEncoded
    @Headers({"HEADER_FINGER_EVENT:trade-futures-trial-updateStopOrdersFromShortcut"})
    @POST("v2/copyTrading/exchange/updateTrialStopOrdersFromShortcut")
    /* JADX INFO: renamed from: j */
    Object m85457j(@Field("symbol") @NotNull String str, @Field("positionSide") @NotNull String str2, @Field("marginMode") @NotNull String str3, @Field("upStopPriceType") @Nullable String str4, @Field("upPrice") @Nullable BigDecimal bigDecimal, @Field("downStopPriceType") @Nullable String str5, @Field("downPrice") @Nullable BigDecimal bigDecimal2, @Header("X-VALIDATION-TOKEN") @NotNull String str6, @Header("X-SUB-UID") @Nullable String str7) throws Throwable;

    @NotNull
    @FormUrlEncoded
    @Headers({"HEADER_FINGER_EVENT:trade-futures-trial"})
    @POST("v2/copyTrading/futures/trialOrders")
    /* JADX INFO: renamed from: l */
    OrderResult m85458l(@FieldMap @NotNull Map<String, String> map, @Header("X-VALIDATION-TOKEN") @NotNull String str, @Header("X-SUB-UID") @Nullable String str2) throws Throwable;

    @POST("v1/copyTrading/futures/order/cancel")
    @NotNull
    /* JADX INFO: renamed from: m */
    Object m85459m(@Nullable @Query("orderId") String str, @NotNull @Query("fundsType") String str2) throws Throwable;

    @FormUrlEncoded
    @POST("v1/copyTrading/exchange/stopOrders/cancel")
    @NotNull
    /* JADX INFO: renamed from: t */
    Object m85460t(@Field("symbol") @Nullable String str, @Field("includeShortCutStopOrders") @Nullable Boolean bool, @Field("fundsType") @Nullable String str2) throws Throwable;

    @FormUrlEncoded
    @POST("v1/copyTrading/futures/orders/cancel")
    @NotNull
    /* JADX INFO: renamed from: u */
    Object m85461u(@Field("symbol") @Nullable String str, @Field("includeStopOrders") @Nullable Boolean bool, @Field("includeShortCutStopOrders") @Nullable Boolean bool2, @Field("fundsType") @Nullable String str2) throws Throwable;

    @GET("v1/copyTrading/exchange/user/one-current-use-coupon-for-symbol")
    @Nullable
    /* JADX INFO: renamed from: w */
    CouponDetailEntity m85462w(@NotNull @Query("symbol") String str, @Query("isTrialFunds") boolean z11) throws Throwable;

    /* JADX INFO: renamed from: c */
    static /* synthetic */ OrderResult m85445c(InterfaceC37862c interfaceC37862c, Map map, String str, String str2, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitOrderV2");
        }
        if ((i11 & 4) != 0) {
            str2 = FutureCopyTradingConfig.f19902a.m20876k();
        }
        return interfaceC37862c.m85452e(map, str, str2);
    }

    /* JADX INFO: renamed from: k */
    static /* synthetic */ OrderResult m85446k(InterfaceC37862c interfaceC37862c, Map map, String str, String str2, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitTrialOrder");
        }
        if ((i11 & 4) != 0) {
            str2 = FutureCopyTradingConfig.f19902a.m20876k();
        }
        return interfaceC37862c.m85458l(map, str, str2);
    }

    /* JADX INFO: renamed from: n */
    static /* synthetic */ Object m85447n(InterfaceC37862c interfaceC37862c, String str, String str2, String str3, String str4, BigDecimal bigDecimal, String str5, BigDecimal bigDecimal2, String str6, String str7, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitTrialStopOrder");
        }
        if ((i11 & 8) != 0) {
            str4 = null;
        }
        if ((i11 & 16) != 0) {
            bigDecimal = null;
        }
        if ((i11 & 32) != 0) {
            str5 = null;
        }
        if ((i11 & 64) != 0) {
            bigDecimal2 = null;
        }
        if ((i11 & 256) != 0) {
            str7 = FutureCopyTradingConfig.f19902a.m20876k();
        }
        return interfaceC37862c.m85457j(str, str2, str3, str4, bigDecimal, str5, bigDecimal2, str6, str7);
    }

    /* JADX INFO: renamed from: o */
    static /* synthetic */ Object m85448o(InterfaceC37862c interfaceC37862c, String str, String str2, String str3, String str4, BigDecimal bigDecimal, String str5, BigDecimal bigDecimal2, String str6, String str7, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitStopOrderV2");
        }
        if ((i11 & 8) != 0) {
            str4 = null;
        }
        if ((i11 & 16) != 0) {
            bigDecimal = null;
        }
        if ((i11 & 32) != 0) {
            str5 = null;
        }
        if ((i11 & 64) != 0) {
            bigDecimal2 = null;
        }
        if ((i11 & 256) != 0) {
            str7 = FutureCopyTradingConfig.f19902a.m20876k();
        }
        return interfaceC37862c.m85455h(str, str2, str3, str4, bigDecimal, str5, bigDecimal2, str6, str7);
    }
}
