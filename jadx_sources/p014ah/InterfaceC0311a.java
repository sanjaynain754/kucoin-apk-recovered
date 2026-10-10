package p014ah;

import com.appsflyer.AppsFlyerProperties;
import com.kubi.kumex.data.platform.model.UserMaxLeverageEntity;
import com.kubi.kumex.data.trade.model.CouponDetailEntity;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.data.trade.model.OrderResult;
import com.kubi.kumex.data.trade.model.SubmitAlterTpslOrderEntity;
import com.kubi.kumex.data.trade.model.SubmitModifyOrderEntity;
import com.kubi.kumex.data.trade.model.SubmitReversePositionEntity;
import com.kubi.kumex.data.trade.model.SubmitTwapModifyOrderEntity;
import com.kubi.kumex.data.trade.model.TwapDelegateHistPageEntity;
import com.kubi.sdk.PageEntity;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: renamed from: ah.a */
/* JADX INFO: compiled from: ISelfOrderApi.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J\u0014\u0010\u0006\u001a\u00020\u00012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005H'J=\u0010\b\u001a\u00020\u00012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0002\u0010\rJ1\u0010\u000e\u001a\u00020\u00012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0002\u0010\u000fJ\u001e\u0010\u0010\u001a\u00020\u00112\u0014\b\u0001\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0013H'J(\u0010\u0014\u001a\u00020\u00112\u0014\b\u0001\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00132\b\b\u0001\u0010\u0015\u001a\u00020\u0005H'J\u0082\u0001\u0010\u0016\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0017\u001a\u00020\u00052\b\b\u0001\u0010\u0018\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0019\u001a\u00020\u00052\b\b\u0001\u0010\u0015\u001a\u00020\u00052\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u0005H'J\u001c\u0010 \u001a\u00020\u00112\b\b\u0001\u0010!\u001a\u00020\"2\b\b\u0001\u0010\u0015\u001a\u00020\u0005H'J(\u0010#\u001a\u00020\u00112\u0014\b\u0001\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00132\b\b\u0001\u0010\u0015\u001a\u00020\u0005H'J*\u0010$\u001a\u00020\u00112\u0016\b\u0001\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00132\b\b\u0001\u0010\u0015\u001a\u00020\u0005H'Jz\u0010%\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0017\u001a\u00020\u00052\b\b\u0001\u0010\u0018\u001a\u00020\u00052\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u0005H'J\u001e\u0010&\u001a\u0004\u0018\u00010'2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010(\u001a\u00020\nH'J$\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0014\b\u0001\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0013H'J&\u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*2\u0014\b\u0001\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0013H'J \u0010-\u001a\u0004\u0018\u00010.2\u0014\b\u0001\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0013H'J\u0012\u0010/\u001a\u00020\u00112\b\b\u0001\u0010!\u001a\u000200H'J\u0012\u00101\u001a\u00020\u00112\b\b\u0001\u0010!\u001a\u00020\"H'J\u0012\u00102\u001a\u00020\u00112\b\b\u0001\u0010!\u001a\u000203H'J\u001c\u00104\u001a\u00020\u00112\b\b\u0001\u0010!\u001a\u0002032\b\b\u0001\u0010\u0015\u001a\u00020\u0005H'J\u001e\u00105\u001a\u00020\u00112\u0014\b\u0001\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0013H'J\u001e\u0010-\u001a\u0004\u0018\u0001062\b\b\u0003\u00107\u001a\u00020\u00052\b\b\u0003\u00108\u001a\u00020\u0005H'J\u001e\u00109\u001a\u00020\u00012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u00108\u001a\u00020\u0005H'J\u0014\u0010:\u001a\u00020\u00012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005H'J\u001e\u0010;\u001a\u00020\u00012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u00107\u001a\u00020\u0005H'J \u0010<\u001a\u00020\u00112\u0016\b\u0001\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0013H'J\u0012\u0010=\u001a\u00020\u00112\b\b\u0001\u0010!\u001a\u00020>H'J\u001e\u0010?\u001a\u00020\u00112\b\b\u0001\u0010!\u001a\u00020>2\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0005H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006@À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/classic/common/order/api/ISelfOrderApi;", "", "fetchUserMaxLeverage", "Lcom/kubi/kumex/data/platform/model/UserMaxLeverageEntity;", "symbol", "", "cancelOrder", "orderId", "cancelAllOrder", "includeStopOrders", "", "includeShortCutStopOrders", "fundsType", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/Object;", "cancelAllAdvancedOrders", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/Object;", "submitOrder", "Lcom/kubi/kumex/data/trade/model/OrderResult;", "request", "", "submitOrderV2", "validationToken", "submitStopOrderV2", "positionSide", "marginMode", AppsFlyerProperties.CHANNEL, "upType", "upPrice", "Ljava/math/BigDecimal;", "downType", "downPrice", InterfaceC33730j9.f70350a, "submitModifyOrderV2", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/trade/model/SubmitModifyOrderEntity;", "submitChaseOrderV2", "submitTwapOrderV2", "submitStopOrder", "fetchCouponDetail", "Lcom/kubi/kumex/data/trade/model/CouponDetailEntity;", "isTrialFunds", "fetchActiveOrders", "Lcom/kubi/sdk/PageEntity;", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "fetchAdvancedOrders", "fetchTwapOrders", "Lcom/kubi/kumex/data/trade/model/TwapDelegateHistPageEntity;", "submitReversePositionOrder", "Lcom/kubi/kumex/data/trade/model/SubmitReversePositionEntity;", "submitModifyOrder", "submitAlterTpslOrder", "Lcom/kubi/kumex/data/trade/model/SubmitAlterTpslOrderEntity;", "submitAlterTpslOrderV2", "submitChaseOrder", "Lcom/kubi/kumex/data/trade/model/OrdersPageEntity;", "advancedType", "status", "pauseOrRestartTwapOrder", "cancelTwapOrder", "cancelAllTwapOrder", "submitTwapOrder", "submitModifyTwapOrder", "Lcom/kubi/kumex/data/trade/model/SubmitTwapModifyOrderEntity;", "submitModifyTwapOrderV2", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC0311a {
    @POST("v1/km/orders/alter")
    @NotNull
    /* JADX INFO: renamed from: B */
    OrderResult m1062B(@Body @NotNull SubmitAlterTpslOrderEntity submitAlterTpslOrderEntity) throws Throwable;

    @POST("v1/kumex-trade/order/cancel/{orderId}")
    @NotNull
    /* JADX INFO: renamed from: C */
    Object m1063C(@Path("orderId") @Nullable String str) throws Throwable;

    @POST("v2/km/orders/alter")
    @NotNull
    /* JADX INFO: renamed from: D */
    OrderResult m1064D(@Body @NotNull Map<String, String> map, @Header("X-VALIDATION-TOKEN") @NotNull String str) throws Throwable;

    @POST("v2/km/strategy/alter")
    @NotNull
    /* JADX INFO: renamed from: E */
    OrderResult m1065E(@Body @NotNull SubmitTwapModifyOrderEntity submitTwapModifyOrderEntity, @Header("X-VALIDATION-TOKEN") @Nullable String str) throws Throwable;

    @NotNull
    @FormUrlEncoded
    @Headers({"HEADER_FINGER_EVENT:trade-futures-updateStopOrdersFromShortcut"})
    @POST("v1/kumex-trade/updateStopOrdersFromShortcut")
    /* JADX INFO: renamed from: F */
    Object m1066F(@Field("symbol") @NotNull String str, @Field("positionSide") @NotNull String str2, @Field("marginMode") @NotNull String str3, @Field("upStopPriceType") @Nullable String str4, @Field("upPrice") @Nullable BigDecimal bigDecimal, @Field("downStopPriceType") @Nullable String str5, @Field("downPrice") @Nullable BigDecimal bigDecimal2, @Field("orderId") @Nullable String str6, @Field(AppsFlyerProperties.CHANNEL) @Nullable String str7, @Field(InterfaceC33730j9.f70350a) @Nullable String str8) throws Throwable;

    @POST("v2/km/orders/alter")
    @NotNull
    /* JADX INFO: renamed from: G */
    OrderResult m1067G(@Body @NotNull SubmitAlterTpslOrderEntity submitAlterTpslOrderEntity, @Header("X-VALIDATION-TOKEN") @NotNull String str) throws Throwable;

    @NotNull
    @FormUrlEncoded
    @Headers({"HEADER_FINGER_EVENT:trade-futures-updateStopOrdersFromShortcut"})
    @POST("v2/kumex-trade/updateStopOrdersFromShortcut")
    /* JADX INFO: renamed from: I */
    Object m1068I(@Field("symbol") @NotNull String str, @Field("positionSide") @NotNull String str2, @Field("marginMode") @NotNull String str3, @Field("orderId") @Nullable String str4, @Field(AppsFlyerProperties.CHANNEL) @NotNull String str5, @Header("X-VALIDATION-TOKEN") @NotNull String str6, @Field("upStopPriceType") @Nullable String str7, @Field("upPrice") @Nullable BigDecimal bigDecimal, @Field("downStopPriceType") @Nullable String str8, @Field("downPrice") @Nullable BigDecimal bigDecimal2, @Field(InterfaceC33730j9.f70350a) @Nullable String str9) throws Throwable;

    @POST("v2/km/orders/alter")
    @NotNull
    /* JADX INFO: renamed from: J */
    OrderResult m1069J(@Body @NotNull SubmitModifyOrderEntity submitModifyOrderEntity, @Header("X-VALIDATION-TOKEN") @NotNull String str) throws Throwable;

    @NotNull
    @FormUrlEncoded
    @Headers({"HEADER_FINGER_EVENT:trade-futures"})
    @POST("v2/km/strategy/create")
    /* JADX INFO: renamed from: K */
    OrderResult m1070K(@FieldMap @NotNull Map<String, String> map, @Header("X-VALIDATION-TOKEN") @NotNull String str) throws Throwable;

    @GET("v2/km/trade/configs/getCrossUserMaxLeverage")
    @NotNull
    /* JADX INFO: renamed from: a */
    UserMaxLeverageEntity m1071a(@NotNull @Query("symbol") String str) throws Throwable;

    @NotNull
    @FormUrlEncoded
    @Headers({"HEADER_FINGER_EVENT:trade-futures"})
    @POST("v1/kumex-trade/order")
    /* JADX INFO: renamed from: b */
    OrderResult m1072b(@FieldMap @NotNull Map<String, String> map) throws Throwable;

    @GET("v1/kumex-trade/orders")
    @NotNull
    /* JADX INFO: renamed from: f */
    PageEntity<OrderEntity> m1073f(@QueryMap @NotNull Map<String, String> map) throws Throwable;

    @GET("v1/kumex-trade/stopOrders")
    @Nullable
    /* JADX INFO: renamed from: g */
    PageEntity<OrderEntity> m1074g(@QueryMap @NotNull Map<String, String> map) throws Throwable;

    @POST("v1/km/orders/alter")
    @NotNull
    /* JADX INFO: renamed from: h */
    OrderResult m1075h(@Body @NotNull SubmitModifyOrderEntity submitModifyOrderEntity) throws Throwable;

    @POST("v1/km/strategy/alter")
    @NotNull
    /* JADX INFO: renamed from: i */
    OrderResult m1076i(@Body @NotNull SubmitTwapModifyOrderEntity submitTwapModifyOrderEntity) throws Throwable;

    @POST("v1/km/orders/reversePosition")
    @NotNull
    /* JADX INFO: renamed from: k */
    OrderResult m1077k(@Body @NotNull SubmitReversePositionEntity submitReversePositionEntity) throws Throwable;

    @GET("v1/km/strategy/list")
    @Nullable
    /* JADX INFO: renamed from: m */
    TwapDelegateHistPageEntity m1078m(@QueryMap @NotNull Map<String, String> map) throws Throwable;

    @NotNull
    @FormUrlEncoded
    @Headers({"HEADER_FINGER_EVENT:trade-futures"})
    @POST("v2/kumex-trade/order")
    /* JADX INFO: renamed from: n */
    OrderResult m1079n(@FieldMap @NotNull Map<String, String> map, @Header("X-VALIDATION-TOKEN") @NotNull String str) throws Throwable;

    @FormUrlEncoded
    @POST("v1/km/strategy/cancelById")
    @NotNull
    /* JADX INFO: renamed from: r */
    Object m1080r(@Field("orderId") @Nullable String str) throws Throwable;

    @FormUrlEncoded
    @POST("v1/km/strategy/cancel")
    @NotNull
    /* JADX INFO: renamed from: s */
    Object m1081s(@Field("symbol") @Nullable String str, @Field("advancedType") @NotNull String str2) throws Throwable;

    @FormUrlEncoded
    @POST("v1/web-front/stopOrders/cancel")
    @NotNull
    /* JADX INFO: renamed from: t */
    Object m1082t(@Field("symbol") @Nullable String str, @Field("includeShortCutStopOrders") @Nullable Boolean bool, @Field("fundsType") @Nullable String str2) throws Throwable;

    @FormUrlEncoded
    @POST("v1/web-front/orders/cancel")
    @NotNull
    /* JADX INFO: renamed from: u */
    Object m1083u(@Field("symbol") @Nullable String str, @Field("includeStopOrders") @Nullable Boolean bool, @Field("includeShortCutStopOrders") @Nullable Boolean bool2, @Field("fundsType") @Nullable String str2) throws Throwable;

    @NotNull
    @FormUrlEncoded
    @Headers({"HEADER_FINGER_EVENT:trade-futures"})
    @POST("v1/km/strategy/create")
    /* JADX INFO: renamed from: v */
    OrderResult m1084v(@FieldMap @NotNull Map<String, String> map) throws Throwable;

    @GET("v1/user/one-current-use-coupon-for-symbol")
    @Nullable
    /* JADX INFO: renamed from: w */
    CouponDetailEntity m1085w(@NotNull @Query("symbol") String str, @Query("isTrialFunds") boolean z11) throws Throwable;

    @FormUrlEncoded
    @POST("v1/km/strategy/switch")
    @NotNull
    /* JADX INFO: renamed from: y */
    Object m1086y(@Field("orderId") @Nullable String str, @Field("status") @NotNull String str2) throws Throwable;

    @POST("v1/km/orders/alter")
    @NotNull
    /* JADX INFO: renamed from: z */
    OrderResult m1087z(@Body @NotNull Map<String, String> map) throws Throwable;

    /* JADX INFO: renamed from: H */
    static /* synthetic */ Object m1060H(InterfaceC0311a interfaceC0311a, String str, String str2, String str3, String str4, String str5, String str6, String str7, BigDecimal bigDecimal, String str8, BigDecimal bigDecimal2, String str9, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitStopOrderV2");
        }
        if ((i11 & 8) != 0) {
            str4 = null;
        }
        if ((i11 & 16) != 0) {
            str5 = "ANDROID";
        }
        if ((i11 & 64) != 0) {
            str7 = null;
        }
        if ((i11 & 128) != 0) {
            bigDecimal = null;
        }
        if ((i11 & 256) != 0) {
            str8 = null;
        }
        if ((i11 & 512) != 0) {
            bigDecimal2 = null;
        }
        if ((i11 & 1024) != 0) {
            str9 = null;
        }
        return interfaceC0311a.m1068I(str, str2, str3, str4, str5, str6, str7, bigDecimal, str8, bigDecimal2, str9);
    }

    /* JADX INFO: renamed from: L */
    static /* synthetic */ Object m1061L(InterfaceC0311a interfaceC0311a, String str, String str2, String str3, String str4, BigDecimal bigDecimal, String str5, BigDecimal bigDecimal2, String str6, String str7, String str8, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitStopOrder");
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
        if ((i11 & 128) != 0) {
            str6 = null;
        }
        if ((i11 & 256) != 0) {
            str7 = "ANDROID";
        }
        if ((i11 & 512) != 0) {
            str8 = null;
        }
        return interfaceC0311a.m1066F(str, str2, str3, str4, bigDecimal, str5, bigDecimal2, str6, str7, str8);
    }
}
