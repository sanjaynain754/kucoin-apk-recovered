package com.kubi.home.rank.impl.cache;

import com.kubi.kucoin.home.cards_2.rank.impl.cache.RankCoinEntity;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.GET;

/* JADX INFO: renamed from: com.kubi.home.rank.impl.cache.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IRankCoinApi.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/home/rank/impl/cache/IRankCoinApi;", "", "fetchCoinList", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/kubi/kucoin/home/cards_2/rank/impl/cache/RankCoinEntity;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IRankCoinApi {
    @GET("v1/currency")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<List<RankCoinEntity>> m29964a();
}
