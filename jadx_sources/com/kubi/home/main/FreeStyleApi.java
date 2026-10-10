package com.kubi.home.main;

import com.kubi.home.entity.CmsAdEntity;
import com.kubi.home.entity.HomeAppGuideEntity;
import com.kubi.home.entity.NewcomerConfigEntity;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.home.main.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FreeStyleApi.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\t\u001a\u00020\nH'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H'J>\u0010\r\u001a8\u00124\u00122\u0012\u0004\u0012\u00020\u000f\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0018\u00010\u000ej\u0018\u0012\u0004\u0012\u00020\u000f\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0018\u0001`\u00120\u0003H'J\u0010\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0003H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/home/main/FreeStyleApi;", "", "queryAppNotice", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/home/main/FreeStyleEntity;", "ui", "", "(Ljava/lang/Long;)Lkotlinx/coroutines/flow/Flow;", "postAppNoticeRead", "data", "Lcom/kubi/home/main/FreeStyleIdEntity;", "queryAppGuide", "Lcom/kubi/home/entity/HomeAppGuideEntity;", "welfareAlertInfo", "Ljava/util/HashMap;", "", "", "Lcom/kubi/home/entity/CmsAdEntity;", "Lkotlin/collections/HashMap;", "isNewcomer", "Lcom/kubi/home/entity/NewcomerConfigEntity;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface FreeStyleApi {
    @POST("v1/app-notice/read")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<Object> m29392a(@Body @NotNull FreeStyleIdEntity freeStyleIdEntity);

    @GET("v1/app-notice/query")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<FreeStyleEntity> m29393b(@Nullable @Query("uid") Long l11);

    @GET("v1/cms/ads-login?ad_position=app-homepage-welfare-popup")
    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC41634e<HashMap<String, List<CmsAdEntity>>> m29394c();

    @GET("v1/kcop/newcomer/app/is-newcomer")
    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC41634e<NewcomerConfigEntity> m29395d();

    @GET("v1/campaign-center/invitation-support-v2/app-guide")
    @NotNull
    /* JADX INFO: renamed from: e */
    InterfaceC41634e<HomeAppGuideEntity> m29396e();
}
