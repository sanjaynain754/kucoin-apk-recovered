package com.kubi.search;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.operation.api.entity.SearchTopicEntity;
import com.kubi.search.entity.ContractEntity;
import com.kubi.search.entity.SearchEntity;
import com.kubi.search.entity.SearchEventUploadEntity;
import com.kubi.search.entity.SearchGuideWordEntity;
import com.kubi.search.entity.SearchLoginFavorEntity;
import com.kubi.search.entity.SearchRealtimeEntity;
import com.kubi.search.entity.SearchRecommendEntity;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.search.x, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SearchApi.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H'J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0003H'J\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH'J(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0018\b\u0001\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011H'J(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0018\b\u0001\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011H'J\u0010\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0003H'J\u0010\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0003H'J\u0010\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0003H'J*\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00060\u00032\b\b\u0003\u0010\u001b\u001a\u00020\u000b2\b\b\u0003\u0010\u001c\u001a\u00020\u000bH'J\u001a\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00032\b\b\u0001\u0010\u001f\u001a\u00020 H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/search/SearchApi;", "", "searchHint", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/search/entity/SearchGuideWordEntity;", "fetchContractList", "", "Lcom/kubi/search/entity/ContractEntity;", FirebaseAnalytics.Event.SEARCH, "Lcom/kubi/search/entity/SearchEntity;", "keyword", "", "eventClick", "", FirebaseAnalytics.Param.ITEMS, "Ljava/util/ArrayList;", "Lcom/kubi/search/entity/SearchEventUploadEntity;", "Lkotlin/collections/ArrayList;", "eventExpose", "realtimeRecommend", "Lcom/kubi/search/entity/SearchRealtimeEntity;", "hotTopicInfo", "Lcom/kubi/operation/api/entity/SearchTopicEntity;", "recommend", "Lcom/kubi/search/entity/SearchRecommendEntity;", "loginFavor", "Lcom/kubi/search/entity/SearchLoginFavorEntity;", "quotes", "from", "addOrDeleteMemeToFav", "Lcom/kubi/search/entity/ChainBackDeleteEntity;", "param", "Lcom/kubi/search/entity/ChainWithTokenParam;", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface SearchApi {
    @GET("v1/api-reaper/pathfinder/recommend/aggregated")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<SearchRecommendEntity> m59627a();

    @GET("v1/kcop/platform-hottopic/anchors/search")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<SearchTopicEntity> m59628b();

    @GET("v1/market/symbol")
    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC41634e<List<SearchLoginFavorEntity>> m59629d(@NotNull @Query("quote") String str, @Header("User-Agent") @NotNull String str2);

    @GET("v2/api-reaper/recommend-search")
    @NotNull
    /* JADX INFO: renamed from: e */
    InterfaceC41634e<SearchGuideWordEntity> m59630e();

    @GET("v1/api-reaper/pathfinder/recommend/spot")
    @NotNull
    /* JADX INFO: renamed from: f */
    InterfaceC41634e<SearchRealtimeEntity> m59631f();

    @POST("v1/api-reaper/pathfinder/event/exposure")
    @NotNull
    /* JADX INFO: renamed from: g */
    InterfaceC41634e<Boolean> m59632g(@Body @NotNull ArrayList<SearchEventUploadEntity> arrayList);

    @Headers({"Cache-Time: 60000"})
    @GET("v1/kumex-market/market/list")
    @NotNull
    /* JADX INFO: renamed from: h */
    InterfaceC41634e<List<ContractEntity>> m59633h();

    @GET("v1/api-reaper/pathfinder/search")
    @NotNull
    /* JADX INFO: renamed from: i */
    InterfaceC41634e<List<SearchEntity>> m59634i(@NotNull @Query("keyword") String str);

    @POST("v1/api-reaper/pathfinder/event/click")
    @NotNull
    /* JADX INFO: renamed from: j */
    InterfaceC41634e<Boolean> m59635j(@Body @NotNull ArrayList<SearchEventUploadEntity> arrayList);

    /* JADX INFO: renamed from: c */
    static /* synthetic */ InterfaceC41634e m59626c(SearchApi searchApi, String str, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loginFavor");
        }
        if ((i11 & 1) != 0) {
            str = "favor";
        }
        if ((i11 & 2) != 0) {
            str2 = "android/trade_list";
        }
        return searchApi.m59629d(str, str2);
    }
}
