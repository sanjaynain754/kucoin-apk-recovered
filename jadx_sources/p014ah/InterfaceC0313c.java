package p014ah;

import com.appsflyer.AppsFlyerProperties;
import com.kubi.kumex.data.platform.model.UserMaxLeverageEntity;
import com.kubi.kumex.data.trade.model.OrderResult;
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
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: renamed from: ah.c */
/* JADX INFO: compiled from: ITrialOrderApi.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J\u0014\u0010\u0006\u001a\u00020\u00012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005H'J\u001e\u0010\b\u001a\u00020\t2\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000bH'J(\u0010\f\u001a\u00020\t2\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b2\b\b\u0001\u0010\r\u001a\u00020\u0005H'Jn\u0010\u000e\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u00052\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0005H'Jx\u0010\u0017\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\u00052\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0005H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/classic/common/order/api/ITrialOrderApi;", "", "fetchUserMaxLeverage", "Lcom/kubi/kumex/data/platform/model/UserMaxLeverageEntity;", "symbol", "", "cancelOrder", "orderId", "submitOrder", "Lcom/kubi/kumex/data/trade/model/OrderResult;", "request", "", "submitOrderV2", "validationToken", "submitStopOrder", "positionSide", "marginMode", "upType", "upPrice", "Ljava/math/BigDecimal;", "downType", "downPrice", AppsFlyerProperties.CHANNEL, "submitStopOrderV2", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC0313c {
    @POST("v1/kumex-trial/order/cancel/{orderId}")
    @NotNull
    /* JADX INFO: renamed from: C */
    Object m1101C(@Path("orderId") @Nullable String str) throws Throwable;

    @GET("v2/km/trial/trade/configs/getCrossUserMaxLeverage")
    @NotNull
    /* JADX INFO: renamed from: a */
    UserMaxLeverageEntity m1102a(@NotNull @Query("symbol") String str) throws Throwable;

    @NotNull
    @FormUrlEncoded
    @Headers({"HEADER_FINGER_EVENT:trade-futures-trial"})
    @POST("v1/kumex-trial/order")
    /* JADX INFO: renamed from: b */
    OrderResult m1103b(@FieldMap @NotNull Map<String, String> map) throws Throwable;

    @NotNull
    @FormUrlEncoded
    @Headers({"HEADER_FINGER_EVENT:trade-futures-trial-updateStopOrdersFromShortcut"})
    @POST("v1/kumex-trial/updateStopOrdersFromShortcut")
    /* JADX INFO: renamed from: e */
    Object m1104e(@Field("symbol") @NotNull String str, @Field("positionSide") @NotNull String str2, @Field("marginMode") @NotNull String str3, @Field("upStopPriceType") @Nullable String str4, @Field("upPrice") @Nullable BigDecimal bigDecimal, @Field("downStopPriceType") @Nullable String str5, @Field("downPrice") @Nullable BigDecimal bigDecimal2, @Field("orderId") @Nullable String str6, @Field(AppsFlyerProperties.CHANNEL) @Nullable String str7) throws Throwable;

    @NotNull
    @FormUrlEncoded
    @Headers({"HEADER_FINGER_EVENT:trade-futures-trial-updateStopOrdersFromShortcut"})
    @POST("v2/kumex-trial/updateStopOrdersFromShortcut")
    /* JADX INFO: renamed from: f */
    Object m1105f(@Field("symbol") @NotNull String str, @Field("positionSide") @NotNull String str2, @Field("marginMode") @NotNull String str3, @Header("X-VALIDATION-TOKEN") @NotNull String str4, @Field("upStopPriceType") @Nullable String str5, @Field("upPrice") @Nullable BigDecimal bigDecimal, @Field("downStopPriceType") @Nullable String str6, @Field("downPrice") @Nullable BigDecimal bigDecimal2, @Field("orderId") @Nullable String str7, @Field(AppsFlyerProperties.CHANNEL) @Nullable String str8) throws Throwable;

    @NotNull
    @FormUrlEncoded
    @Headers({"HEADER_FINGER_EVENT:trade-futures-trial"})
    @POST("v2/kumex-trial/order")
    /* JADX INFO: renamed from: n */
    OrderResult m1106n(@FieldMap @NotNull Map<String, String> map, @Header("X-VALIDATION-TOKEN") @NotNull String str) throws Throwable;

    /* JADX INFO: renamed from: c */
    static /* synthetic */ Object m1099c(InterfaceC0313c interfaceC0313c, String str, String str2, String str3, String str4, BigDecimal bigDecimal, String str5, BigDecimal bigDecimal2, String str6, String str7, int i11, Object obj) throws Throwable {
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
        return interfaceC0313c.m1104e(str, str2, str3, str4, bigDecimal, str5, bigDecimal2, str6, str7);
    }

    /* JADX INFO: renamed from: d */
    static /* synthetic */ Object m1100d(InterfaceC0313c interfaceC0313c, String str, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, String str6, BigDecimal bigDecimal2, String str7, String str8, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitStopOrderV2");
        }
        if ((i11 & 16) != 0) {
            str5 = null;
        }
        if ((i11 & 32) != 0) {
            bigDecimal = null;
        }
        if ((i11 & 64) != 0) {
            str6 = null;
        }
        if ((i11 & 128) != 0) {
            bigDecimal2 = null;
        }
        if ((i11 & 256) != 0) {
            str7 = null;
        }
        if ((i11 & 512) != 0) {
            str8 = "ANDROID";
        }
        return interfaceC0313c.m1105f(str, str2, str3, str4, str5, bigDecimal, str6, bigDecimal2, str7, str8);
    }
}
