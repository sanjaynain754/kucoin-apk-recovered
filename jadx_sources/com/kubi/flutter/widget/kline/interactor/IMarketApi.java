package com.kubi.flutter.widget.kline.interactor;

import com.kubi.flutter.widget.kline.ActiveOrderEntity;
import com.kubi.flutter.widget.kline.KlineOrderEntity;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: renamed from: com.kubi.flutter.widget.kline.interactor.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KLineCommonDataInteractors.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bb\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\tH'J<\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\tH'J6\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\tH'JH\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102$\b\u0001\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0013j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u00142\b\b\u0003\u0010\u0015\u001a\u00020\u00162\b\b\u0003\u0010\u0017\u001a\u00020\u0016H'J6\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\u0019\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\tH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/interactor/IMarketApi;", "", "fetchIndexKline", "", "", "", "symbol", "type", "begin", "", "end", "fetchMarketKline", "fetchBSData", "Lcom/kubi/flutter/widget/kline/KlineOrderEntity;", "tradeType", "getTradeOrdersV2", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "Lcom/kubi/flutter/widget/kline/ActiveOrderEntity;", ReportDataTable.COLUMN_PARAMS, "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "checkAllowCancelAll", "", "forceTypeLimit", "fetchMarginBSData", "positionType", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
interface IMarketApi {
    @GET("v2/kc/trade/orders")
    @NotNull
    /* JADX INFO: renamed from: e */
    BasePageEntity<ActiveOrderEntity> m24344e(@QueryMap @NotNull HashMap<String, String> map, @Query("checkAllowCancelAll") boolean z11, @Query("forceTypeLimit") boolean z12);

    @GET("v1/kc/bs/data")
    @NotNull
    /* JADX INFO: renamed from: g */
    List<KlineOrderEntity> m24345g(@NotNull @Query("symbol") String str, @NotNull @Query("type") String str2, @NotNull @Query("tradeType") String str3, @Query("begin") long j11);

    @GET("v1/index/candles")
    @NotNull
    /* JADX INFO: renamed from: h */
    List<String[]> m24346h(@NotNull @Query("symbol") String str, @NotNull @Query("type") String str2, @Query("begin") long j11, @Query("end") long j12);

    @GET("v1/margin/position/bs/data")
    @NotNull
    /* JADX INFO: renamed from: i */
    List<KlineOrderEntity> m24347i(@NotNull @Query("symbol") String str, @NotNull @Query("type") String str2, @NotNull @Query("positionType") String str3, @Query("begin") long j11);

    @Headers({"Cache-Time: 60000"})
    @GET("v1/kc/market/kline")
    @NotNull
    /* JADX INFO: renamed from: j */
    List<String[]> m24348j(@NotNull @Query("symbol") String str, @NotNull @Query("type") String str2, @Query("begin") long j11, @Query("end") long j12);

    /* JADX INFO: renamed from: f */
    static /* synthetic */ BasePageEntity m24343f(IMarketApi iMarketApi, HashMap map, boolean z11, boolean z12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTradeOrdersV2");
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        return iMarketApi.m24344e(map, z11, z12);
    }
}
