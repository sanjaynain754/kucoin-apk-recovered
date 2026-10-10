package com.kubi.futures.data.market;

import com.tencent.qcloud.tuicore.TUIConstants;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.futures.data.market.t, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IMarketSocket.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J-\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u0012\u0010\u000b\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J\u0012\u0010\f\u001a\u00020\u00032\b\b\u0001\u0010\r\u001a\u00020\u0005H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/data/market/IMarketSocket;", "", "getBookList", "Lokhttp3/Request;", "symbol", "", TUIConstants.TUIContact.LIMIT, "", "precision", "(Ljava/lang/String;Ljava/lang/Integer;I)Lokhttp3/Request;", "getRecentDeal", "getPrice", "getMarkPrices", "symbols", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IMarketSocket {
    @GET("v1/kumex-market/latest-orders")
    @NotNull
    /* JADX INFO: renamed from: a */
    Request m24860a(@NotNull @Query("symbol") String str, @Query(TUIConstants.TUIContact.LIMIT) int i11);

    @GET("v2/km/level2/snapshot")
    @NotNull
    /* JADX INFO: renamed from: b */
    Request m24861b(@NotNull @Query("symbol") String str, @Nullable @Query(TUIConstants.TUIContact.LIMIT) Integer num, @Query("multiplier") int i11) throws Throwable;

    @GET("v1/kumex-index/index-price")
    @NotNull
    /* JADX INFO: renamed from: c */
    Request m24862c(@NotNull @Query("symbol") String str) throws Throwable;

    @GET("v1/kumex-index/batch-mark-price")
    @NotNull
    /* JADX INFO: renamed from: d */
    Request m24863d(@NotNull @Query("symbols") String str) throws Throwable;
}
