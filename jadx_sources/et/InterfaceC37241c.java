package et;

import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.CheckCodeParamsEntity;
import com.kubi.data.entity.CheckCodeResultEntity;
import com.kubi.otc.entity.AdPayType;
import com.kubi.otc.entity.NoticeLatestEntity;
import com.kubi.otc.entity.OtcAd;
import com.kubi.otc.entity.OtcInfoEntity;
import com.kubi.otc.entity.OtcOrder;
import com.kubi.otc.entity.OtcPrice;
import com.kubi.otc.entity.OtcSymbol;
import com.kubi.otc.entity.OtcUserInfo;
import com.kubi.otc.entity.PayTemplate;
import com.kubi.otc.entity.PayTypeEntity;
import com.kubi.otc.entity.PayTypeName;
import com.kubi.otc.entity.PrecheckBean;
import com.kubi.otc.entity.ThirdActivity;
import com.kubi.payment.fast.data.entities.Balance;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41016c;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/* JADX INFO: renamed from: et.c */
/* JADX INFO: compiled from: OtcApi.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\n\u001a\u00020\u0007H'J.\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00040\u00032\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\n\u001a\u00020\u0007H'JB\u0010\u000f\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00100\u0005j\b\u0012\u0004\u0012\u00020\u0010`\u00110\u00040\u00032\b\b\u0003\u0010\u0012\u001a\u00020\u00072\b\b\u0003\u0010\u0013\u001a\u00020\u00072\b\b\u0003\u0010\u0014\u001a\u00020\u0007H'J.\u0010\u0015\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00160\u0005j\b\u0012\u0004\u0012\u00020\u0016`\u00110\u00040\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0007H'J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u0003H'J \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0007H'J\u001e\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00040\u00032\b\b\u0001\u0010\u001d\u001a\u00020\u0007H'J:\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042$\b\u0001\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070 j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`!H§@¢\u0006\u0002\u0010\"JF\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042$\b\u0001\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070 j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`!2\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010%J*\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0014\b\u0001\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070'H§@¢\u0006\u0002\u0010(J6\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0014\b\u0001\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070'2\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010*J\u001e\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00042\b\b\u0001\u0010-\u001a\u00020.H§@¢\u0006\u0002\u0010/J4\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u00101\u001a\u00020\u00072\b\b\u0001\u0010\u001d\u001a\u00020\u00072\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u0007H'J(\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\u001d\u001a\u00020\u00072\b\b\u0003\u00103\u001a\u000204H'J$\u0010\u000f\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002050\u0005j\b\u0012\u0004\u0012\u000205`\u00110\u00040\u0003H'JH\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u00107\u001a\u00020\u00072\b\b\u0001\u00108\u001a\u00020\u00072\b\b\u0001\u00109\u001a\u00020\u00072\b\b\u0001\u0010:\u001a\u00020\u00072\n\b\u0001\u0010;\u001a\u0004\u0018\u00010\u0007H'J<\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u00107\u001a\u00020\u00072\b\b\u0001\u00108\u001a\u00020\u00072\b\b\u0001\u00109\u001a\u00020\u00072\b\b\u0001\u0010:\u001a\u00020\u0007H'JB\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0>0\u00040\u00032\b\b\u0001\u0010@\u001a\u00020\u00072\b\b\u0001\u0010A\u001a\u00020\u00072\b\b\u0001\u0010B\u001a\u00020C2\b\b\u0001\u0010D\u001a\u00020CH'J\u001e\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010F\u001a\u00020\u0007H'J\u001e\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0\u00040\u00032\b\b\u0001\u0010-\u001a\u00020IH'J\u001e\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\u00040\u00032\b\b\u0001\u0010L\u001a\u00020\u0007H'J>\u0010M\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020N0\u0005j\b\u0012\u0004\u0012\u00020N`\u00110\u00040\u00032\u0018\b\u0001\u0010O\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0005j\b\u0012\u0004\u0012\u00020\u0007`\u0011H'J:\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032$\b\u0001\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010 j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001`!H'J:\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032$\b\u0001\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010 j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001`!H'J:\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032$\b\u0001\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010 j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001`!H'J@\u0010S\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0>0\u00040\u00032$\b\u0001\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010 j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001`!H'J\u001e\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\u001d\u001a\u00020\u0007H'J\u001e\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\u001d\u001a\u00020\u0007H'J\u001e\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\u001d\u001a\u00020\u0007H'J(\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\u001d\u001a\u00020\u00072\b\b\u0001\u0010Y\u001a\u000204H'J\u0014\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0003H'J2\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\\0\u00040\u00032\b\b\u0001\u0010]\u001a\u00020\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u00072\b\b\u0001\u0010^\u001a\u00020\u0007H'J$\u0010_\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\u0005j\b\u0012\u0004\u0012\u00020\u0007`\u00110\u00040\u0003H'J&\u0010`\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020b0a0'0\u00040\u0003H'J\"\u0010c\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070'0\u00040\u0003H'J\u0014\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020e0\u00040\u0003H'J\u0014\u0010f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020g0\u00040\u0003H'J\u001e\u0010h\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010i\u001a\u00020\u0007H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006jÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/otc/api/OtcApi;", "", "getCheckRequiredValidation", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Ljava/util/ArrayList;", "", "", "bizType", "loginToken", "header", "checkValidationCode", "Lcom/kubi/data/entity/CheckCodeResultEntity;", "checkCodeParamsEntity", "Lcom/kubi/data/entity/CheckCodeParamsEntity;", "getPayTypeList", "Lcom/kubi/otc/entity/PayTypeEntity;", "Lkotlin/collections/ArrayList;", "type", "legal", "version", "getOtcSymbol", "Lcom/kubi/otc/entity/OtcSymbol;", "getUserKycInfo", "Lcom/kubi/otc/entity/OtcUserInfo;", "getUserTakerAmount", "legalCurrency", "getOtcInfo", "Lcom/kubi/otc/entity/OtcInfoEntity;", "id", "createPayType", ReportDataTable.COLUMN_PARAMS, "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPayTypeV2", "validationToken", "(Ljava/util/HashMap;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePayType", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePayTypeV2", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "preCheckPayType", "Lcom/kubi/otc/entity/PrecheckBean$Response;", "request", "Lcom/kubi/otc/entity/PrecheckBean$Request;", "(Lcom/kubi/otc/entity/PrecheckBean$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePayType", "url", "setDefaultPayType", "isDefault", "", "Lcom/kubi/otc/entity/AdPayType;", "requestOrderBuy", "adId", "currencyAmount", "legalCurrencyAmount", "orderPrice", "adListPrice", "requestOrderSell", "getOrderList", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "Lcom/kubi/otc/entity/OtcOrder;", "side", "status", "page", "", "size", "markSubjectRead", "subject", "getCurrencyBalance", "Lcom/kubi/payment/fast/data/entities/Balance$Response;", "Lcom/kubi/payment/fast/data/entities/Balance$Request;", "getOpTraderInfo", "Lcom/kubi/otc/entity/OtcOpTraderInfo;", "orderId", "latestNotice", "Lcom/kubi/otc/entity/NoticeLatestEntity;", "subjects", "otcPublish", "otcUpdate", "otcUpdateOnline", "otcAdUserList", "Lcom/kubi/otc/entity/OtcAd;", "otcPutUpBuy", "otcPutUpSell", "otcPutDown", "otcDisplay", ViewProps.HIDDEN, "signPact", "otcSymbolPrice", "Lcom/kubi/otc/entity/OtcPrice;", FirebaseAnalytics.Param.CURRENCY, "priceType", "otcMerchantLegal", "getPayTypeTemplate", "", "Lcom/kubi/otc/entity/PayTemplate;", "queryType", "thirdActivity", "Lcom/kubi/otc/entity/ThirdActivity;", "loadUserPayTypeName", "Lcom/kubi/otc/entity/PayTypeName;", "updateUserPayTypeName", "defaultName", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC37241c {
    @GET("v1/otc/pay-type/getTemplate")
    @NotNull
    /* JADX INFO: renamed from: A */
    Observable<BaseEntity<Map<String, List<PayTemplate>>>> m83311A();

    @NotNull
    @FormUrlEncoded
    @Headers({"HEADER_FINGER_EVENT:otc-ad-buy-putup"})
    @POST("v1/otc/ad/buy/putUp")
    /* JADX INFO: renamed from: B */
    Observable<BaseEntity<Object>> m83312B(@Field("id") @NotNull String str);

    @GET("v1/otc/user/kyc-info")
    @NotNull
    /* JADX INFO: renamed from: C */
    Observable<BaseEntity<OtcUserInfo>> m83313C();

    @NotNull
    @FormUrlEncoded
    @Headers({"HEADER_FINGER_EVENT:otc-ad-publish"})
    @POST("v1/otc/ad/publish")
    /* JADX INFO: renamed from: D */
    Observable<BaseEntity<Object>> m83314D(@FieldMap @NotNull HashMap<String, Object> map);

    @FormUrlEncoded
    @POST
    @NotNull
    /* JADX INFO: renamed from: E */
    Observable<BaseEntity<Object>> m83315E(@Url @NotNull String str, @Field("id") @NotNull String str2, @Header("X-VALIDATION-TOKEN") @Nullable String str3);

    @FormUrlEncoded
    @POST("v1/otc/ad/update")
    @NotNull
    /* JADX INFO: renamed from: F */
    Observable<BaseEntity<Object>> m83316F(@FieldMap @NotNull HashMap<String, Object> map);

    @POST("pmtapi/user/balance")
    @NotNull
    /* JADX INFO: renamed from: G */
    Observable<BaseEntity<Balance.Response>> m83317G(@Body @NotNull Balance.Request request);

    @GET("v1/otc/pay-type/get")
    @NotNull
    /* JADX INFO: renamed from: H */
    Observable<BaseEntity<ArrayList<AdPayType>>> m83318H();

    @FormUrlEncoded
    @POST("v2/otc/pay-type/update")
    @Nullable
    /* JADX INFO: renamed from: I */
    Object m83319I(@FieldMap @NotNull Map<String, String> map, @NotNull Continuation<? super BaseEntity<Object>> continuation);

    @NotNull
    @FormUrlEncoded
    @Headers({"HEADER_FINGER_EVENT:otc-deposit"})
    @POST("v1/otc/order/buy")
    /* JADX INFO: renamed from: J */
    Observable<BaseEntity<String>> m83320J(@Field("adId") @NotNull String str, @Field("currencyAmount") @NotNull String str2, @Field("legalCurrencyAmount") @NotNull String str3, @Field("orderPrice") @NotNull String str4, @Field("adListPrice") @Nullable String str5);

    @GET("v1/otc/payType/getUserPayTypeName")
    @NotNull
    /* JADX INFO: renamed from: K */
    Observable<BaseEntity<PayTypeName>> m83321K();

    @FormUrlEncoded
    @POST("v3/otc/pay-type/update")
    @Nullable
    /* JADX INFO: renamed from: L */
    Object m83322L(@FieldMap @NotNull Map<String, String> map, @Header("X-VALIDATION-TOKEN") @Nullable String str, @NotNull Continuation<? super BaseEntity<Object>> continuation);

    @POST("v1/auth/verify-validation-code")
    @NotNull
    /* JADX INFO: renamed from: a */
    Observable<BaseEntity<ArrayList<CheckCodeResultEntity>>> m83323a(@Body @NotNull CheckCodeParamsEntity checkCodeParamsEntity, @Header("X-SERVICE-PLATFORM") @NotNull String str);

    @FormUrlEncoded
    @POST("v1/auth/check-required-validation")
    @NotNull
    /* JADX INFO: renamed from: b */
    Observable<BaseEntity<ArrayList<String[]>>> m83324b(@Field("bizType") @NotNull String str, @Field("loginToken") @Nullable String str2, @Header("X-SERVICE-PLATFORM") @NotNull String str3);

    @GET("v1/otc/dictionary/data")
    @NotNull
    /* JADX INFO: renamed from: c */
    Observable<BaseEntity<ArrayList<PayTypeEntity>>> m83325c(@NotNull @Query("type") String str, @NotNull @Query("legal") String str2, @NotNull @Query("version") String str3);

    @FormUrlEncoded
    @POST("v1/otc/ad/display")
    @NotNull
    /* JADX INFO: renamed from: d */
    Observable<BaseEntity<Object>> m83326d(@Field("id") @NotNull String str, @Field(ViewProps.HIDDEN) boolean z11);

    @FormUrlEncoded
    @POST("v1/otc/pay-type/set-default")
    @NotNull
    /* JADX INFO: renamed from: e */
    Observable<BaseEntity<Object>> m83327e(@Field("id") @NotNull String str, @Field("isDefault") boolean z11);

    @GET("v1/otc/order/history")
    @NotNull
    /* JADX INFO: renamed from: f */
    Observable<BaseEntity<BasePageEntity<OtcOrder>>> m83328f(@NotNull @Query("side") String str, @NotNull @Query("status") String str2, @Query("page") int i11, @Query("size") int i12);

    @FormUrlEncoded
    @POST("v1/notice/mark-subject-read")
    @NotNull
    /* JADX INFO: renamed from: g */
    Observable<BaseEntity<Object>> m83329g(@Field("subject") @NotNull String str);

    @GET("v1/otc/ad/info")
    @NotNull
    /* JADX INFO: renamed from: h */
    Observable<BaseEntity<OtcInfoEntity>> m83330h(@NotNull @Query("id") String str);

    @FormUrlEncoded
    @POST("v1/otc/payType/setUserPayTypeName")
    @NotNull
    /* JADX INFO: renamed from: i */
    Observable<BaseEntity<Object>> m83331i(@Field("defaultName") @NotNull String str);

    @GET("v1/otc/symbol/support")
    @NotNull
    /* JADX INFO: renamed from: j */
    Observable<BaseEntity<ArrayList<OtcSymbol>>> m83332j(@NotNull @Query("legal") String str);

    @FormUrlEncoded
    @POST("v1/otc/ad/putDown")
    @NotNull
    /* JADX INFO: renamed from: k */
    Observable<BaseEntity<Object>> m83333k(@Field("id") @NotNull String str);

    @GET("payment_mobile_gateway/v1/thirdparty/channel/list")
    @NotNull
    /* JADX INFO: renamed from: l */
    Observable<BaseEntity<Map<String, String>>> m83334l();

    @GET("v1/otc/ad/user/list")
    @NotNull
    /* JADX INFO: renamed from: m */
    Observable<BaseEntity<BasePageEntity<OtcAd>>> m83335m(@QueryMap @NotNull HashMap<String, Object> map);

    @NotNull
    @FormUrlEncoded
    @Headers({"HEADER_FINGER_EVENT:otc-order"})
    @POST("v1/otc/order/sell")
    /* JADX INFO: renamed from: n */
    Observable<BaseEntity<String>> m83336n(@Field("adId") @NotNull String str, @Field("currencyAmount") @NotNull String str2, @Field("legalCurrencyAmount") @NotNull String str3, @Field("orderPrice") @NotNull String str4);

    @POST("v1/otc/payType/preCheck")
    @Nullable
    /* JADX INFO: renamed from: p */
    Object m83337p(@Body @NotNull PrecheckBean.Request request, @NotNull Continuation<? super BaseEntity<PrecheckBean.Response>> continuation);

    @GET("v1/otc/merchant/support-legal")
    @NotNull
    /* JADX INFO: renamed from: q */
    Observable<BaseEntity<ArrayList<String>>> m83338q();

    @NotNull
    @FormUrlEncoded
    @Headers({"HEADER_FINGER_EVENT:otc-ad-online-edit"})
    @POST("v1/otc/ad/online-edit")
    /* JADX INFO: renamed from: r */
    Observable<BaseEntity<Object>> m83339r(@FieldMap @NotNull HashMap<String, Object> map);

    @NotNull
    @FormUrlEncoded
    @Headers({"HEADER_FINGER_EVENT:otc-ad-sell-putup"})
    @POST("v1/otc/ad/sell/putUp")
    /* JADX INFO: renamed from: s */
    Observable<BaseEntity<Object>> m83340s(@Field("id") @NotNull String str);

    @POST("v1/notice/latest-event-content")
    @NotNull
    /* JADX INFO: renamed from: t */
    Observable<BaseEntity<ArrayList<NoticeLatestEntity>>> m83341t(@Body @NotNull ArrayList<String> arrayList);

    @GET("v1/otc/all/price")
    @NotNull
    /* JADX INFO: renamed from: u */
    Observable<BaseEntity<OtcPrice>> m83342u(@NotNull @Query(FirebaseAnalytics.Param.CURRENCY) String str, @NotNull @Query("legal") String str2, @NotNull @Query("priceType") String str3);

    @FormUrlEncoded
    @POST("v2/otc/pay-type/create")
    @Nullable
    /* JADX INFO: renamed from: v */
    Object m83343v(@FieldMap @NotNull HashMap<String, String> map, @NotNull Continuation<? super BaseEntity<Object>> continuation);

    @GET("v1/otc/order/quota")
    @NotNull
    /* JADX INFO: renamed from: w */
    Observable<BaseEntity<String>> m83344w(@Nullable @Query("legal") String str);

    @POST("v1/otc/merchant/sign-pact")
    @NotNull
    /* JADX INFO: renamed from: x */
    Observable<BaseEntity<Object>> m83345x();

    @GET("v1/otc/third-party/channel/activity")
    @NotNull
    /* JADX INFO: renamed from: y */
    Observable<BaseEntity<ThirdActivity>> m83346y();

    @FormUrlEncoded
    @POST("v3/otc/pay-type/create")
    @Nullable
    /* JADX INFO: renamed from: z */
    Object m83347z(@FieldMap @NotNull HashMap<String, String> map, @Header("X-VALIDATION-TOKEN") @Nullable String str, @NotNull Continuation<? super BaseEntity<Object>> continuation);

    /* JADX INFO: renamed from: o */
    static /* synthetic */ Observable m83310o(InterfaceC37241c interfaceC37241c, String str, String str2, String str3, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPayTypeList");
        }
        if ((i11 & 1) != 0) {
            str = "LEGAL";
        }
        if ((i11 & 2) != 0) {
            str2 = C41016c.m89965c();
            Intrinsics.checkNotNullExpressionValue(str2, "getCurrentCurrency(...)");
        }
        if ((i11 & 4) != 0) {
            str3 = "v2";
        }
        return interfaceC37241c.m83325c(str, str2, str3);
    }
}
