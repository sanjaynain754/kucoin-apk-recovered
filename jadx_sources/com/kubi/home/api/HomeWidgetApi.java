package com.kubi.home.api;

import com.kubi.home.entity.HomeGridNavigationEntity;
import com.kubi.home.entity.WidgetBannerEntity;
import com.kubi.home.entity.WidgetRecommendEntity;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.home.api.d, reason: from Kotlin metadata */
/* JADX INFO: compiled from: HomeWidgetApi.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u0006J8\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\b2\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\f\u001a\u00020\tH§@¢\u0006\u0002\u0010\rJ\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n2\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0002\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/home/api/HomeWidgetApi;", "", "gridNaviWidget", "Lcom/kubi/home/entity/HomeGridNavigationEntity;", "cacheTime", "", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bannerWidget", "", "", "", "Lcom/kubi/home/entity/WidgetBannerEntity;", "code", "(Ljava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recommendWidget", "Lcom/kubi/home/entity/WidgetRecommendEntity;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface HomeWidgetApi {
    @GET("homepage/navigations")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m28970a(@Header("Cache-Time") @Nullable Long l11, @NotNull Continuation<? super HomeGridNavigationEntity> continuation) throws Exception;

    @GET("v1/platform-resource-position/position")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m28971b(@Header("Cache-Time") @Nullable Long l11, @NotNull @Query("code") String str, @NotNull Continuation<? super Map<String, ? extends List<WidgetBannerEntity>>> continuation) throws Exception;

    @GET("v1/homepage/recommend-position")
    @Nullable
    /* JADX INFO: renamed from: d */
    Object m28972d(@Header("Cache-Time") @Nullable Long l11, @NotNull Continuation<? super List<WidgetRecommendEntity>> continuation) throws Exception;

    /* JADX INFO: renamed from: c */
    static /* synthetic */ Object m28969c(HomeWidgetApi homeWidgetApi, Long l11, String str, Continuation continuation, int i11, Object obj) throws Exception {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bannerWidget");
        }
        if ((i11 & 1) != 0) {
            l11 = null;
        }
        if ((i11 & 2) != 0) {
            str = "app-banner-new-2026";
        }
        return homeWidgetApi.m28971b(l11, str, continuation);
    }
}
