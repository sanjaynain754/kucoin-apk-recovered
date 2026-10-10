package com.kubi.flutter.widget.kline.interactor;

import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.flutter.widget.kline.interactor.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KLineCommonDataInteractors.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH'J0\u0010\n\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/interactor/IMarketSocket;", "", "getIndexKline", "Lokhttp3/Request;", "symbol", "", "type", "begin", "", "end", "getMarketKline", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
interface IMarketSocket {
    @GET("v1/kc/market/kline")
    @NotNull
    /* JADX INFO: renamed from: a */
    Request m24349a(@NotNull @Query("symbol") String str, @NotNull @Query("type") String str2, @Query("begin") long j11, @Query("end") long j12);

    @GET("v1/index/candles")
    @NotNull
    /* JADX INFO: renamed from: b */
    Request m24350b(@NotNull @Query("symbol") String str, @NotNull @Query("type") String str2, @Query("begin") long j11, @Query("end") long j12);
}
