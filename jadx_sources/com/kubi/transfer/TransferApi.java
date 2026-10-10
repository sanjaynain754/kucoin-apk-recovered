package com.kubi.transfer;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.SingleCurrencyBalance;
import com.kubi.kumex.entity.BalanceEntity;
import com.kubi.transfer.entity.AccountCoin;
import com.kubi.transfer.entity.AccountTransferResult;
import com.kubi.transfer.entity.CoinListEntity;
import com.kubi.transfer.entity.QueryBalanceParam;
import com.kubi.transfer.entity.ReqMultiAccountBalanceParam;
import com.kubi.transfer.entity.ReqMultiAccountCoinsParam;
import com.kubi.transfer.entity.ReqMultiAccountTransferParam;
import com.kubi.transfer.entity.RespMultiAccountBalance;
import com.kubi.transfer.entity.SearchSymbolEntity;
import com.kubi.transfer.entity.TransferAccountBalance;
import com.kubi.transfer.entity.TransferCurrencyResult;
import com.kubi.transfer.entity.TransferInfo;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41016c;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.transfer.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TransferApi.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H'J,\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H'JJ\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0007H'J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u0012H'J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u0015H'J\u001e\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00040\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u0018H'J\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00040\u00032\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0007H'JP\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u001d\u001a\u00020\u00072\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010 \u001a\u00020\u00072\b\b\u0003\u0010!\u001a\u00020\u0007H'J\u001e\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00040\u00032\b\b\u0001\u0010\u0011\u001a\u00020$H'J(\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00032\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u0007H'J\u001e\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00040\u00032\b\b\u0001\u0010\u0011\u001a\u00020+H'J\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006.À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/transfer/TransferApi;", "", "getAllBalances", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/kubi/data/entity/SingleCurrencyBalance;", FirebaseAnalytics.Param.CURRENCY, "", "accountType", "getTransferValidAccounts", "getFromBalance", "Lcom/kubi/transfer/entity/TransferAccountBalance;", "toAccountType", "tag", "toAccountTag", "getMultiAccountBalance", "Lcom/kubi/transfer/entity/RespMultiAccountBalance;", "param", "Lcom/kubi/transfer/entity/ReqMultiAccountBalanceParam;", "getCoinList", "Lcom/kubi/transfer/entity/CoinListEntity;", "Lcom/kubi/transfer/entity/QueryBalanceParam;", "getMultiCoinList", "Lcom/kubi/transfer/entity/AccountCoin;", "Lcom/kubi/transfer/entity/ReqMultiAccountCoinsParam;", "getSymbolList", "Lcom/kubi/transfer/entity/SearchSymbolEntity;", "baseLegalCurrency", "accountTransfer", "amount", "payAccountType", "recAccountType", "payTag", "recTag", "multiAccountTransfer", "Lcom/kubi/transfer/entity/AccountTransferResult;", "Lcom/kubi/transfer/entity/ReqMultiAccountTransferParam;", "queryBatchTransferConfig", "", "from", TypedValues.TransitionType.S_TO, "batchTransfer", "Lcom/kubi/transfer/entity/TransferCurrencyResult;", "Lcom/kubi/transfer/entity/TransferInfo;", "fetchBalanceFlow", "Lcom/kubi/kumex/entity/BalanceEntity;", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface TransferApi {
    @GET("v1/asset/transfer/position/tags")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<List<SearchSymbolEntity>> m64496a(@Nullable @Query("baseLegalCurrency") String str);

    @GET("v1/asset/transfer/query-balance")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<TransferAccountBalance> m64497b(@Nullable @Query(FirebaseAnalytics.Param.CURRENCY) String str, @Nullable @Query("accountType") String str2, @Nullable @Query("toAccountType") String str3, @Nullable @Query("tag") String str4, @Nullable @Query("toAccountTag") String str5);

    @GET("v1/asset/transfer/account/currency-balances")
    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC41634e<List<SingleCurrencyBalance>> m64498c(@Nullable @Query(FirebaseAnalytics.Param.CURRENCY) String str, @Nullable @Query("accountType") String str2);

    @POST("v1/asset/transfer/currencies")
    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC41634e<CoinListEntity> m64499d(@Body @NotNull QueryBalanceParam queryBalanceParam);

    @POST("v1/asset/transfer/batch-transfer")
    @NotNull
    /* JADX INFO: renamed from: e */
    InterfaceC41634e<List<TransferCurrencyResult>> m64500e(@Body @NotNull TransferInfo transferInfo);

    @POST("v1/asset/combine/transfer/currencies")
    @NotNull
    /* JADX INFO: renamed from: f */
    InterfaceC41634e<List<AccountCoin>> m64501f(@Body @NotNull ReqMultiAccountCoinsParam reqMultiAccountCoinsParam);

    @POST("v1/asset/combine/transfer")
    @NotNull
    /* JADX INFO: renamed from: g */
    InterfaceC41634e<List<AccountTransferResult>> m64502g(@Body @NotNull ReqMultiAccountTransferParam reqMultiAccountTransferParam);

    @GET("v1/asset/transfer/batch-support")
    @NotNull
    /* JADX INFO: renamed from: i */
    InterfaceC41634e<Boolean> m64503i(@Nullable @Query("from") String str, @Nullable @Query(TypedValues.TransitionType.S_TO) String str2);

    @POST("v1/asset/combine/transfer/query-balance")
    @NotNull
    /* JADX INFO: renamed from: j */
    InterfaceC41634e<RespMultiAccountBalance> m64504j(@Body @NotNull ReqMultiAccountBalanceParam reqMultiAccountBalanceParam);

    @FormUrlEncoded
    @POST("v1/asset/account/self-transfer")
    @NotNull
    /* JADX INFO: renamed from: k */
    InterfaceC41634e<Object> m64505k(@Field("amount") @NotNull String str, @Field(FirebaseAnalytics.Param.CURRENCY) @Nullable String str2, @Field("payAccountType") @Nullable String str3, @Field("recAccountType") @Nullable String str4, @Field("payTag") @NotNull String str5, @Field("recTag") @NotNull String str6);

    @GET("v1/kumex-account/account-wallet-overview")
    @NotNull
    /* JADX INFO: renamed from: l */
    InterfaceC41634e<BalanceEntity> m64506l(@NotNull @Query(FirebaseAnalytics.Param.CURRENCY) String str) throws Throwable;

    /* JADX INFO: renamed from: h */
    static /* synthetic */ InterfaceC41634e m64495h(TransferApi transferApi, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSymbolList");
        }
        if ((i11 & 1) != 0) {
            str = C41016c.m89965c();
        }
        return transferApi.m64496a(str);
    }
}
