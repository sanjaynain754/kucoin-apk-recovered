package com.kubi.home.rank.impl;

import com.kubi.home.api.RankEntity;
import com.kubi.home.rank.RankTradeItem;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.home.rank.impl.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IRankApi.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H'J*\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0007H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/home/rank/impl/IRankApi;", "", "getRankList", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/kubi/home/api/RankEntity;", "rankType", "", "getTradeDataBySymbols", "Lcom/kubi/home/rank/RankTradeItem;", "symbols", "from", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IRankApi {
    @Headers({"Cache-Time: 1000", "SELF-UA: true"})
    @GET("v1/market/symbol")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<List<RankTradeItem>> m29926a(@Nullable @Query("symbols") String str, @Header("User-Agent") @NotNull String str2);

    @GET("v1/api-reaper/rank")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<List<RankEntity>> m29927b(@Nullable @Query("rankType") String str);
}
