package com.kubi.home.api;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.home.entity.CmsAdEntity;
import com.kubi.home.entity.GridNavigationMoreEntity;
import com.kubi.home.entity.GridNavigationSaveReqEntity;
import com.kubi.home.entity.MoodInfoEntity;
import com.kubi.home.v2.biz.kuming.KuMiningDataEntity;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.home.api.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: HomeBizApi.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'JH\u0010\u0005\u001a8\u00124\u00122\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0018\u00010\u0006j\u0018\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0018\u0001`\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u0007H'J\u0010\u0010\f\u001a\u0004\u0018\u00010\rH§@¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0012H§@¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015H§@¢\u0006\u0002\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/home/api/HomeBizApi;", "", "moodInfo", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/home/entity/MoodInfoEntity;", "dropDownConfig", "Ljava/util/HashMap;", "", "", "Lcom/kubi/home/entity/CmsAdEntity;", "Lkotlin/collections/HashMap;", "lang", "gridNavigationMore", "Lcom/kubi/home/entity/GridNavigationMoreEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveHomeGridNavigation", "", TtmlNode.TAG_BODY, "Lcom/kubi/home/entity/GridNavigationSaveReqEntity;", "(Lcom/kubi/home/entity/GridNavigationSaveReqEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchKuMiningData", "Lcom/kubi/home/v2/biz/kuming/KuMiningDataEntity;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface HomeBizApi {
    @GET("v1/cms/ads?ad_position=app-drop-down")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<HashMap<String, List<CmsAdEntity>>> m28956a(@NotNull @Query("lang") String str);

    @POST("v1/navigation/user-custom-config/operate")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m28957b(@Body @NotNull GridNavigationSaveReqEntity gridNavigationSaveReqEntity, @NotNull Continuation<? super Boolean> continuation) throws Exception;

    @GET("cloud-mining-core/home/mining-profit-index")
    @Nullable
    /* JADX INFO: renamed from: c */
    Object m28958c(@NotNull Continuation<? super KuMiningDataEntity> continuation) throws Exception;

    @Headers({"X-SENSORS-ID:true"})
    @GET("discover-new/advance_decline_distribution/home_page_summary")
    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC41634e<MoodInfoEntity> m28959d();

    @GET("homepage/navigation/more")
    @Nullable
    /* JADX INFO: renamed from: e */
    Object m28960e(@NotNull Continuation<? super GridNavigationMoreEntity> continuation) throws Exception;
}
