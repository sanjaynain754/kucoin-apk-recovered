package com.kubi.assets.bill;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.entity.AccountDetailEntity;
import com.kubi.assets.entity.FinanceBillItemEntity;
import com.kubi.assets.entity.FinanceBillOptionsEntity;
import com.kubi.assets.holdearn.HoldEarnSwitchResp;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.kumex.entity.FundsRecordEntity;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.base.entity.BasePageEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.assets.bill.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AccountBillApi.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032$\b\u0001\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001`\tH§@¢\u0006\u0002\u0010\nJ@\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032$\b\u0001\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001`\tH§@¢\u0006\u0002\u0010\nJJ\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\r\u001a\u00020\b2$\b\u0001\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001`\tH§@¢\u0006\u0002\u0010\u000eJx\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u00032\b\b\u0001\u0010\u0011\u001a\u00020\b2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0019H§@¢\u0006\u0002\u0010\u001bJ.\u0010\u001c\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u001d0\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0002\u0010\u001eJ\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0003H§@¢\u0006\u0002\u0010!Jz\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00040\u00032\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u00192\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u0019H§@¢\u0006\u0002\u0010\u001bJ<\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00032$\b\u0001\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001`\tH§@¢\u0006\u0002\u0010\nJ(\u0010*\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020,\u0018\u00010+j\n\u0012\u0004\u0012\u00020,\u0018\u0001`-0\u0003H§@¢\u0006\u0002\u0010!ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006.À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/assets/bill/AccountBillApi;", "", "getMainDetail", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "Lcom/kubi/assets/entity/AccountDetailEntity;", "hashMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTradeDetail", "getLeverAccountDetail", "accountType", "(Ljava/lang/String;Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFundsRecord", "Lcom/kubi/kumex/entity/FundsRecordEntity;", "fundsType", FirebaseAnalytics.Param.CURRENCY, "type", "side", "currentPage", "", "pageSize", "beginTime", "", "endTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getKumexBizType", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFinanceOptions", "Lcom/kubi/assets/entity/FinanceBillOptionsEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFinanceRecords", "Lcom/kubi/assets/entity/FinanceBillItemEntity;", "productCategory", "bizType", "startAt", "endAt", "switchHoldEarn", "Lcom/kubi/assets/holdearn/HoldEarnSwitchResp;", "getCoinList", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/CoinInfoEntity;", "Lkotlin/collections/ArrayList;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface AccountBillApi {
    @FormUrlEncoded
    @POST("v1/earn/app/hold-earn/switch")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m15799a(@FieldMap @NotNull HashMap<String, Object> map, @NotNull Continuation<? super BaseEntity<HoldEarnSwitchResp>> continuation);

    @FormUrlEncoded
    @POST("v1/account/main-detail")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m15800b(@FieldMap @NotNull HashMap<String, Object> map, @NotNull Continuation<? super BaseEntity<BasePageEntity<AccountDetailEntity>>> continuation);

    @FormUrlEncoded
    @POST("v1/account/detail")
    @Nullable
    /* JADX INFO: renamed from: c */
    Object m15801c(@Field("accountType") @NotNull String str, @FieldMap @NotNull HashMap<String, Object> map, @NotNull Continuation<? super BaseEntity<BasePageEntity<AccountDetailEntity>>> continuation);

    @FormUrlEncoded
    @POST("v1/account/trade-detail")
    @Nullable
    /* JADX INFO: renamed from: d */
    Object m15802d(@FieldMap @NotNull HashMap<String, Object> map, @NotNull Continuation<? super BaseEntity<BasePageEntity<AccountDetailEntity>>> continuation);

    @GET("v1/kumex-account/funds-tx-type")
    @Nullable
    /* JADX INFO: renamed from: e */
    Object m15803e(@Nullable @Query("fundsType") String str, @NotNull Continuation<? super BaseEntity<Map<String, String>>> continuation);

    @GET("v1/kumex-account/funds-tx")
    @Nullable
    /* JADX INFO: renamed from: f */
    Object m15804f(@NotNull @Query("fundsType") String str, @Nullable @Query(FirebaseAnalytics.Param.CURRENCY) String str2, @Nullable @Query("type") String str3, @Nullable @Query("side") String str4, @Nullable @Query("currentPage") Integer num, @Nullable @Query("pageSize") Integer num2, @Nullable @Query("beginTime") Long l11, @Nullable @Query("endTime") Long l12, @NotNull Continuation<? super BaseEntity<BasePageEntity<FundsRecordEntity>>> continuation);

    @GET("v2/currencies-balance-sorted")
    @Nullable
    /* JADX INFO: renamed from: g */
    Object m15805g(@NotNull Continuation<? super BaseEntity<ArrayList<CoinInfoEntity>>> continuation);

    @GET("v1/earn/select-options")
    @Nullable
    /* JADX INFO: renamed from: h */
    Object m15806h(@NotNull Continuation<? super BaseEntity<FinanceBillOptionsEntity>> continuation);

    @GET("v1/earn/account-bills")
    @Nullable
    /* JADX INFO: renamed from: i */
    Object m15807i(@Nullable @Query("productCategory") String str, @Nullable @Query(FirebaseAnalytics.Param.CURRENCY) String str2, @Nullable @Query("bizType") String str3, @Nullable @Query("side") String str4, @Nullable @Query("page") Integer num, @Nullable @Query("pageSize") Integer num2, @Nullable @Query("startAt") Long l11, @Nullable @Query("endAt") Long l12, @NotNull Continuation<? super BaseEntity<BasePageEntity<FinanceBillItemEntity>>> continuation);
}
