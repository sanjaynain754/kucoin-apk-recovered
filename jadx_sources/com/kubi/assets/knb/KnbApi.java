package com.kubi.assets.knb;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.entity.CoinAddressEntity;
import com.kubi.assets.entity.DepositAddressEntity;
import com.kubi.assets.entity.HistoryRecordEntity;
import com.kubi.assets.entity.MultiChainEntity;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.rate.CurrencyPrice;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.assets.knb.k, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KnbApi.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\b\u001a\u00020\u0006H'J&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0006H'J\u001e\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u0010H'J\u001e\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u0010H'J*\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\r0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\b\u001a\u00020\u0006H'J\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0006H'J\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0001\u0010\u0019\u001a\u00020\u0006H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/assets/knb/KnbApi;", "", "getDepositAddress", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/assets/entity/CoinAddressEntity;", FirebaseAnalytics.Param.CURRENCY, "", "tag", "platFrom", "getDepositAddressList", "Lcom/kubi/assets/entity/DepositAddressEntity;", "chainId", "getWithdrawEnableCoinList", "", "Lcom/kubi/data/entity/CoinInfoEntity;", "isFiat", "", "getWithdrawEnableCoinListV2", "getMultiChain", "Lcom/kubi/assets/entity/MultiChainEntity;", "getCurrencyPrice", "Lcom/kubi/data/rate/CurrencyPrice;", "unit", "getWithdrawRecord", "Lcom/kubi/assets/entity/HistoryRecordEntity;", "withdrawId", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface KnbApi {
    @GET("v2/currency-price")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<CurrencyPrice> m17537a(@Nullable @Query(TtmlNode.RUBY_BASE) String str);

    @GET("v1/account/trade-main-balances")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<List<CoinInfoEntity>> m17538b(@Query("isFiat") int i11);

    @GET("payment/v2/withdraw/get")
    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC41634e<HistoryRecordEntity> m17539c(@NotNull @Query("withdrawId") String str);

    @Headers({"HEADER_FINGER_EVENT:deposit-address-get"})
    @GET("v1/asset/deposit-address/get")
    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC41634e<CoinAddressEntity> m17540d(@Nullable @Query(FirebaseAnalytics.Param.CURRENCY) String str, @Nullable @Query("chainId") String str2, @Header("X-SERVICE-PLATFORM") @NotNull String str3);

    @GET("payment/deposit-address/list")
    @NotNull
    /* JADX INFO: renamed from: e */
    InterfaceC41634e<DepositAddressEntity> m17541e(@Nullable @Query(FirebaseAnalytics.Param.CURRENCY) String str, @Nullable @Query("chainId") String str2);

    @GET("asset-front/withdraw/currencies")
    @NotNull
    /* JADX INFO: renamed from: f */
    InterfaceC41634e<List<CoinInfoEntity>> m17542f(@Query("isFiat") int i11);

    @GET("v1/asset/currency/chain-info")
    @NotNull
    /* JADX INFO: renamed from: k */
    InterfaceC41634e<List<MultiChainEntity>> m17543k(@Nullable @Query(FirebaseAnalytics.Param.CURRENCY) String str, @Header("X-SERVICE-PLATFORM") @NotNull String str2);

    /* JADX INFO: renamed from: g */
    static /* synthetic */ InterfaceC41634e m17533g(KnbApi knbApi, String str, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMultiChain");
        }
        if ((i11 & 2) != 0) {
            str2 = "WEB3";
        }
        return knbApi.m17543k(str, str2);
    }

    /* JADX INFO: renamed from: h */
    static /* synthetic */ InterfaceC41634e m17534h(KnbApi knbApi, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWithdrawEnableCoinList");
        }
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return knbApi.m17538b(i11);
    }

    /* JADX INFO: renamed from: i */
    static /* synthetic */ InterfaceC41634e m17535i(KnbApi knbApi, String str, String str2, String str3, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDepositAddress");
        }
        if ((i11 & 4) != 0) {
            str3 = "WEB3";
        }
        return knbApi.m17540d(str, str2, str3);
    }

    /* JADX INFO: renamed from: j */
    static /* synthetic */ InterfaceC41634e m17536j(KnbApi knbApi, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWithdrawEnableCoinListV2");
        }
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return knbApi.m17542f(i11);
    }
}
