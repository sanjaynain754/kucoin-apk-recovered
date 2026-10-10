package et;

import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.otc.entity.ConfigDate;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.otc.entity.FiatAdvCashInfo;
import com.kubi.otc.entity.FiatAdvCashParams;
import com.kubi.otc.entity.FiatBankCardOrder;
import com.kubi.otc.entity.FiatBindAdvcashAccount;
import com.kubi.otc.entity.FiatBindCapitualAccount;
import com.kubi.otc.entity.FiatCapitualBank;
import com.kubi.otc.entity.FiatCapitualChannel;
import com.kubi.otc.entity.FiatCurrency;
import com.kubi.otc.entity.FiatCurrencyParams;
import com.kubi.otc.entity.FiatEmail;
import com.kubi.otc.entity.FiatFee;
import com.kubi.otc.entity.FiatRechargeHistory;
import com.kubi.otc.entity.FiatRechargeInfo;
import com.kubi.otc.entity.FiatSepaPayInfo;
import com.kubi.otc.entity.FiatUnBindWithdrawAccount;
import com.kubi.otc.entity.FiatUserInfo;
import com.kubi.otc.entity.FiatVerifyCapitualStatus;
import com.kubi.otc.entity.FiatWithdrawAccountInfo;
import com.kubi.otc.entity.FiatWithdrawOrderInfo;
import com.kubi.otc.entity.FiatWithdrawPaymentParams;
import com.kubi.otc.entity.FiatWithdrawPaymentResult;
import com.kubi.otc.entity.SessionData;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.entity.BaseWrapEntity;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.reactivex.Observable;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/* JADX INFO: renamed from: et.b */
/* JADX INFO: compiled from: FiatApi.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u0003H'JD\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000fH'J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\u0003H'J\u001e\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00040\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u000fH'J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\b\u0001\u0010\u0018\u001a\u00020\u000fH§@¢\u0006\u0002\u0010\u0019Jz\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00162\b\b\u0001\u0010\u0018\u001a\u00020\u000f2\b\b\u0001\u0010\u001c\u001a\u00020\u000f2\b\b\u0001\u0010\u001d\u001a\u00020\u000f2\b\b\u0001\u0010\u001e\u001a\u00020\u000f2\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\b\b\u0001\u0010 \u001a\u00020\u000f2\b\b\u0003\u0010!\u001a\u00020\u000f2\b\b\u0001\u0010\"\u001a\u00020\u000f2\b\b\u0001\u0010#\u001a\u00020\u000f2\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u000fH§@¢\u0006\u0002\u0010%J\u001e\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00040\u00032\b\b\u0001\u0010'\u001a\u00020(H'J\u001e\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00040\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u000fH'J8\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0\u00040\u00032\b\b\u0001\u0010.\u001a\u00020\u000f2\b\b\u0001\u0010/\u001a\u00020\u000f2\b\b\u0001\u0010\u001e\u001a\u00020\u000fH'J\u001e\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00040\u00032\b\b\u0001\u0010'\u001a\u000201H'J4\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u00040\u00032\b\b\u0001\u00104\u001a\u00020\u000f2\b\b\u0001\u0010'\u001a\u0002052\n\b\u0001\u00106\u001a\u0004\u0018\u00010\u000fH'J8\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u00050\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH'J\u001e\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u00040\u00032\b\b\u0001\u0010:\u001a\u00020\u000fH'J\u001e\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\u00040\u00032\b\b\u0001\u0010.\u001a\u00020\u000fH'J\u001e\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0\u00040\u00032\b\b\u0001\u0010?\u001a\u00020@H'J\u001e\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\u00040\u00032\b\b\u0001\u0010'\u001a\u00020CH'J*\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0\u00040\u00032\u0014\b\u0001\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0FH'J\u001e\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00040\u00032\b\b\u0001\u0010'\u001a\u00020HH'J$\u0010I\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0,0\u00040\u00032\b\b\u0001\u0010.\u001a\u00020\u000fH'J\u001e\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00040\u00032\b\b\u0001\u0010'\u001a\u00020LH'J\u001e\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0\u00040\u00032\b\b\u0001\u0010'\u001a\u00020OH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006PÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/otc/api/FiatApi;", "", "getBankOrderList", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "Lcom/kubi/otc/entity/FiatBankCardOrder;", "page", "", "size", "getPayConfig", "Lcom/kubi/otc/entity/ConfigDate;", "getRechargeOrderHistory", "Lcom/kubi/otc/entity/FiatRechargeHistory;", "fiat", "", "orderType", "getFiatUserInfo", "Lcom/kubi/otc/entity/FiatUserInfo;", "tradeOrderDetails", "orderId", "getSessionId", "Lcom/kubi/sdk/base/entity/BaseWrapEntity;", "Lcom/kubi/otc/entity/SessionData;", "bizType", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkRisk", "", "sessionId", "cardId", FirebaseAnalytics.Param.CURRENCY, "cryptoCurrency", "totalAmount", "clientFrom", "mobileId", "deviceBrand", "frequency", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEmail", ReportDataTable.COLUMN_PARAMS, "Lcom/kubi/otc/entity/FiatEmail;", "rechargeOrderDetails", "Lcom/kubi/otc/entity/FiatRechargeInfo;", "getWithdrawAccounts", "", "Lcom/kubi/otc/entity/FiatWithdrawAccountInfo;", "channelId", "paymentMethodCode", "deleteWithdrawAccount", "Lcom/kubi/otc/entity/FiatUnBindWithdrawAccount;", "createWithdrawPayment", "Lcom/kubi/otc/entity/FiatWithdrawPaymentResult;", "url", "Lcom/kubi/otc/entity/FiatWithdrawPaymentParams;", "validationToken", "getWithdrawOrderHistory", "Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;", "getWithdrawOrderDetails", "payoutTrxnId", "queryCapitaulKycInfo", "Lcom/kubi/otc/entity/FiatVerifyCapitualStatus;", "queryCapitualRechargeInfo", "Lcom/kubi/otc/entity/FiatSepaPayInfo;", AppsFlyerProperties.CHANNEL, "Lcom/kubi/otc/entity/FiatCapitualChannel;", "rechargeAdvCash", "Lcom/kubi/otc/entity/FiatAdvCashInfo;", "Lcom/kubi/otc/entity/FiatAdvCashParams;", "getFiatPaymentFee", "Lcom/kubi/otc/entity/FiatFee;", "", "bindCapitualAccount", "Lcom/kubi/otc/entity/FiatBindCapitualAccount;", "getChannelBanks", "Lcom/kubi/otc/entity/FiatCapitualBank;", "bindAdvcashAccount", "Lcom/kubi/otc/entity/FiatBindAdvcashAccount;", "getFiatCurrencyBalance", "Lcom/kubi/otc/entity/FiatCurrency;", "Lcom/kubi/otc/entity/FiatCurrencyParams;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC37240b {
    @GET("v1/order/trade/details")
    @NotNull
    /* JADX INFO: renamed from: a */
    Observable<BaseEntity<FiatBankCardOrder>> m83289a(@NotNull @Query("orderId") String str);

    @Headers({"HEADER_FINGER_EVENT:pay-fiat-bind-account"})
    @POST("v1/payment/api/create_payout_account")
    @NotNull
    /* JADX INFO: renamed from: c */
    Observable<BaseEntity<FiatWithdrawAccountInfo>> m83290c(@Body @NotNull FiatBindCapitualAccount fiatBindCapitualAccount);

    @GET("payment_mobile_gateway/v2/api/payout/transaction/details")
    @NotNull
    /* JADX INFO: renamed from: d */
    Observable<BaseEntity<FiatWithdrawOrderInfo>> m83291d(@NotNull @Query("payoutTrxnId") String str);

    @GET("v1/payment/api/user/query")
    @NotNull
    /* JADX INFO: renamed from: e */
    Observable<BaseEntity<FiatVerifyCapitualStatus>> m83292e(@NotNull @Query("channelId") String str);

    @GET("v2/order/trade/history")
    @NotNull
    /* JADX INFO: renamed from: f */
    Observable<BaseEntity<BasePageEntity<FiatBankCardOrder>>> m83293f(@Query("page") int i11, @Query("size") int i12);

    @Headers({"HEADER_FINGER_EVENT:pay-fiat-withdraw"})
    @POST
    @NotNull
    /* JADX INFO: renamed from: g */
    Observable<BaseEntity<FiatWithdrawPaymentResult>> m83294g(@Url @NotNull String str, @Body @NotNull FiatWithdrawPaymentParams fiatWithdrawPaymentParams, @Header("X-VALIDATION-TOKEN") @Nullable String str2);

    @POST("v1/payment/api/channel/bank_account/query")
    @NotNull
    /* JADX INFO: renamed from: h */
    Observable<BaseEntity<FiatSepaPayInfo>> m83295h(@Body @NotNull FiatCapitualChannel fiatCapitualChannel);

    @POST("v1/deposit/common/email/send")
    @NotNull
    /* JADX INFO: renamed from: i */
    Observable<BaseEntity<Boolean>> m83296i(@Body @NotNull FiatEmail fiatEmail);

    @POST("v1/api/create_payin_transaction")
    @NotNull
    /* JADX INFO: renamed from: j */
    Observable<BaseEntity<FiatAdvCashInfo>> m83297j(@Body @NotNull FiatAdvCashParams fiatAdvCashParams);

    @GET("v1/deposit/common/payment/fee")
    @NotNull
    /* JADX INFO: renamed from: k */
    Observable<BaseEntity<FiatFee>> m83298k(@QueryMap @NotNull Map<String, String> map);

    @GET("v1/deposit/common/get/dictionary/item/map")
    @NotNull
    /* JADX INFO: renamed from: l */
    Observable<BaseEntity<ConfigDate>> m83299l();

    @Headers({"HEADER_FINGER_EVENT:pay-fiat-delete-account"})
    @POST("v2/payment/api/payout_account/delete")
    @NotNull
    /* JADX INFO: renamed from: m */
    Observable<BaseEntity<Boolean>> m83300m(@Body @NotNull FiatUnBindWithdrawAccount fiatUnBindWithdrawAccount);

    @GET("pmtapi/v3/order/get/orderHistory")
    @NotNull
    /* JADX INFO: renamed from: n */
    Observable<BaseEntity<BasePageEntity<FiatRechargeHistory>>> m83301n(@NotNull @Query("fiat") String str, @Query("page") int i11, @Query("size") int i12, @Nullable @Query("orderType") String str2);

    @GET("pmtapi/v3/recharge/order/details")
    @NotNull
    /* JADX INFO: renamed from: o */
    Observable<BaseEntity<FiatRechargeInfo>> m83302o(@NotNull @Query("orderId") String str);

    @GET("v1/deposit/risk/session/id")
    @Nullable
    /* JADX INFO: renamed from: p */
    Object m83303p(@NotNull @Query("bizType") String str, @NotNull Continuation<? super BaseWrapEntity<SessionData>> continuation);

    @GET("payment_mobile_gateway/v2/api/payout/transaction/transactions")
    @NotNull
    /* JADX INFO: renamed from: q */
    Observable<BaseEntity<BasePageEntity<FiatWithdrawOrderInfo>>> m83304q(@NotNull @Query("fiat") String str, @Query("currentPage") int i11, @Query("pageSize") int i12);

    @POST("pmtapi/v1/queryCurrencyBalance")
    @NotNull
    /* JADX INFO: renamed from: r */
    Observable<BaseEntity<FiatCurrency>> m83305r(@Body @NotNull FiatCurrencyParams fiatCurrencyParams);

    @GET("v1/common/get/userInfo")
    @NotNull
    /* JADX INFO: renamed from: s */
    Observable<BaseEntity<FiatUserInfo>> m83306s();

    @GET("v1/payment/api/channels/{channelId}/banks")
    @NotNull
    /* JADX INFO: renamed from: t */
    Observable<BaseEntity<List<FiatCapitualBank>>> m83307t(@Path("channelId") @NotNull String str);

    @GET("v1/payment/api/payout_accounts")
    @NotNull
    /* JADX INFO: renamed from: u */
    Observable<BaseEntity<List<FiatWithdrawAccountInfo>>> m83308u(@NotNull @Query("channelId") String str, @NotNull @Query("paymentMethodCode") String str2, @NotNull @Query(FirebaseAnalytics.Param.CURRENCY) String str3);

    @Headers({"HEADER_FINGER_EVENT:pay-fiat-bind-account"})
    @POST("v1/payment/api/create_payout_account")
    @NotNull
    /* JADX INFO: renamed from: v */
    Observable<BaseEntity<FiatWithdrawAccountInfo>> m83309v(@Body @NotNull FiatBindAdvcashAccount fiatBindAdvcashAccount);

    /* JADX INFO: renamed from: b */
    static /* synthetic */ Observable m83288b(InterfaceC37240b interfaceC37240b, String str, int i11, int i12, String str2, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRechargeOrderHistory");
        }
        if ((i13 & 8) != 0) {
            str2 = FastQuoteModel.PAY_RECHARGE;
        }
        return interfaceC37240b.m83301n(str, i11, i12, str2);
    }
}
