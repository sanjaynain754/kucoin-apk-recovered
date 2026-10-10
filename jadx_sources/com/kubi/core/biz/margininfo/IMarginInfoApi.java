package com.kubi.core.biz.margininfo;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.core.biz.loan.entity.MaxAvailableEntity;
import com.kubi.core.spot.entity.MarginSymbolInfo;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.core.biz.margininfo.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IMarginInfoApi.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J3\u0010\u0002\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\tH'J$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0014\b\u0001\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H'J\u001e\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u0005H'J\\\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u00052\b\b\u0001\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010\u0012\u001a\u00020\u00052\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0005H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/biz/margininfo/IMarginInfoApi;", "", "fetchUserMaxAvailable", "Lkotlinx/coroutines/flow/Flow;", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", FirebaseAnalytics.Param.CURRENCY, "leverage", "", "modifyMarginLeverage", ReportDataTable.COLUMN_PARAMS, "getMarginSymbolList", "", "Lcom/kubi/core/spot/entity/MarginSymbolInfo;", "symbol", "Lcom/kubi/core/biz/loan/entity/MaxAvailableEntity;", "tradeType", "orderType", "buyPrice", "buyTriggerPrice", "sellPrice", "sellTriggerPrice", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IMarginInfoApi {
    @GET("ultra-account/unified/inner/account/user-remaining-borrow")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<Map<String, String>> m21868a(@NotNull @Query(FirebaseAnalytics.Param.CURRENCY) String str, @Query("leverage") int i11);

    @GET("ultra-order/unified/inner/orders/max-available")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<MaxAvailableEntity> m21869b(@NotNull @Query("tradeType") String str, @NotNull @Query("symbol") String str2, @NotNull @Query("orderType") String str3, @Nullable @Query("buyPrice") String str4, @Nullable @Query("buyTriggerPrice") String str5, @Nullable @Query("sellPrice") String str6, @Nullable @Query("sellTriggerPrice") String str7);

    @POST("ultra-loan/unified/inner/loan/modify-margin-leverage")
    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC41634e<Object> m21870c(@Body @NotNull Map<String, String> map);

    @GET("ultra-loan/unified/inner/loan/get-margin-symbol-list")
    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC41634e<List<MarginSymbolInfo>> m21871d(@NotNull @Query("symbol") String str);
}
