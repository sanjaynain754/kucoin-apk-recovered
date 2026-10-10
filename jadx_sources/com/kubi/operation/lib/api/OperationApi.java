package com.kubi.operation.lib.api;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.operation.api.entity.WelfareSignupEntity;
import com.kubi.operation.lib.entity.CoinTopicEntity;
import com.kubi.operation.lib.entity.LearnVideoEntity;
import com.kubi.operation.lib.entity.MainCoinDataEntity;
import com.kubi.operation.lib.entity.NewUserStatusInfoEntity;
import com.kubi.operation.lib.entity.WelfareTaskInfoEntity;
import com.kubi.operation.lib.realtime.bonus.BonusItemEntity;
import com.kubi.operation.lib.realtime.gempool.GempoolItemEntity;
import com.kubi.operation.lib.realtime.gempool.GempoolMarkedReadReqEntity;
import com.kubi.operation.lib.realtimev2.DynamicCardDeleteEntity;
import com.kubi.operation.lib.realtimev2.DynamicCardEntity;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.operation.lib.api.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: OperationApi.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u001a\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00032\b\b\u0001\u0010\t\u001a\u00020\u0006H'J\u001a\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00032\b\b\u0001\u0010\t\u001a\u00020\u0006H'J\u001a\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u0006H'J!\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0002\u0010\u0012J'\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00140\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0002\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\b2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011H§@¢\u0006\u0002\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00192\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011H§@¢\u0006\u0002\u0010\u0017J\u001c\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dH§@¢\u0006\u0002\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u001bJ\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0014H§@¢\u0006\u0002\u0010\u001eJ\u0018\u0010\"\u001a\u00020\u000b2\b\b\u0001\u0010#\u001a\u00020$H§@¢\u0006\u0002\u0010%J\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0014H§@¢\u0006\u0002\u0010\u001eJ\u0010\u0010(\u001a\u0004\u0018\u00010)H§@¢\u0006\u0002\u0010\u001eJ\u001a\u0010*\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010#\u001a\u00020+H§@¢\u0006\u0002\u0010,ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006-À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/operation/lib/api/OperationApi;", "", "currencyDetail", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/operation/lib/entity/CoinTopicEntity;", FirebaseAnalytics.Param.CURRENCY, "", "taskInfo", "Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;", "userId", "welfareCardShowConfig", "", "welfareApplyJoinTask", "Lcom/kubi/operation/api/entity/WelfareSignupEntity;", "questId", "bonusCardInfo", "cacheTime", "", "(Ljava/lang/Long;)Lkotlinx/coroutines/flow/Flow;", "mainCoinCardInfo", "", "Lcom/kubi/operation/lib/entity/MainCoinDataEntity;", "fetchNewUserWidgetInfo", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchLearnWidgetInfo", "Lcom/kubi/operation/lib/entity/LearnVideoEntity;", "fetchUserStatusWidgetInfo", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchUserStatusWidgetInfoV2", "Lcom/kubi/operation/lib/entity/NewUserStatusInfoEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestWelfareApplyJoinTask", "gempoolData", "Lcom/kubi/operation/lib/realtime/gempool/GempoolItemEntity;", "gempoolViewed", TtmlNode.TAG_BODY, "Lcom/kubi/operation/lib/realtime/gempool/GempoolMarkedReadReqEntity;", "(Lcom/kubi/operation/lib/realtime/gempool/GempoolMarkedReadReqEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "realtimeBonusData", "Lcom/kubi/operation/lib/realtime/bonus/BonusItemEntity;", "dynamicCardList", "Lcom/kubi/operation/lib/realtimev2/DynamicCardEntity;", "deleteDynamicCard", "Lcom/kubi/operation/lib/realtimev2/DynamicCardDeleteEntity;", "(Lcom/kubi/operation/lib/realtimev2/DynamicCardDeleteEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface OperationApi {
    @GET("v1/home-page/guidance-card")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m43284a(@NotNull Continuation<? super NewUserStatusInfoEntity> continuation) throws Exception;

    @GET("v2/kcop/newcomer/user-task/info2")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<WelfareTaskInfoEntity> m43285b(@Header("Cache-Time") @Nullable Long l11);

    @GET("v1/kcop/platform-hottopic/anchors/currency-detail")
    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC41634e<CoinTopicEntity> m43286c(@NotNull @Query(FirebaseAnalytics.Param.CURRENCY) String str);

    @GET("v2/kcop/newcomer/task/list")
    @Nullable
    /* JADX INFO: renamed from: d */
    Object m43287d(@NotNull Continuation<? super List<BonusItemEntity>> continuation) throws Exception;

    @GET("v1/signUp")
    @Nullable
    /* JADX INFO: renamed from: e */
    Object m43288e(@NotNull @Query("questId") String str, @NotNull Continuation<? super WelfareSignupEntity> continuation) throws Exception;

    @POST("gempool/staking/campaign/viewed-ended-cards")
    @Nullable
    /* JADX INFO: renamed from: f */
    Object m43289f(@Body @NotNull GempoolMarkedReadReqEntity gempoolMarkedReadReqEntity, @NotNull Continuation<? super Boolean> continuation) throws Exception;

    @GET("v2/kcop/newcomer/user-task/info")
    @NotNull
    /* JADX INFO: renamed from: g */
    InterfaceC41634e<WelfareTaskInfoEntity> m43290g(@NotNull @Query("userId") String str);

    @POST("v1/home-page/dynamic-card/delete")
    @Nullable
    /* JADX INFO: renamed from: h */
    Object m43291h(@Body @NotNull DynamicCardDeleteEntity dynamicCardDeleteEntity, @NotNull Continuation<? super Boolean> continuation) throws Exception;

    @GET("gempool/staking/campaign/cards")
    @Nullable
    /* JADX INFO: renamed from: i */
    Object m43292i(@NotNull Continuation<? super List<GempoolItemEntity>> continuation) throws Exception;

    @GET("v1/newcommer-page/learn")
    @Nullable
    /* JADX INFO: renamed from: j */
    Object m43293j(@Header("Cache-Time") @Nullable Long l11, @NotNull Continuation<? super LearnVideoEntity> continuation) throws Exception;

    @GET("v2/kcop/newcomer/user-task/info2")
    @Nullable
    /* JADX INFO: renamed from: k */
    Object m43294k(@Header("Cache-Time") @Nullable Long l11, @NotNull Continuation<? super WelfareTaskInfoEntity> continuation) throws Exception;

    @GET("v1/home-page/dynamic-card/list")
    @Nullable
    /* JADX INFO: renamed from: l */
    Object m43295l(@NotNull Continuation<? super DynamicCardEntity> continuation) throws Exception;

    @GET("v2/kcop/newcomer/user-task/info")
    @Nullable
    /* JADX INFO: renamed from: m */
    Object m43296m(@Nullable @Query("userId") String str, @NotNull Continuation<? super WelfareTaskInfoEntity> continuation) throws Exception;

    @GET("v1/homepage/card/currency")
    @NotNull
    /* JADX INFO: renamed from: n */
    InterfaceC41634e<List<MainCoinDataEntity>> m43297n(@Header("Cache-Time") @Nullable Long l11);

    @GET("v1/signUp")
    @NotNull
    /* JADX INFO: renamed from: o */
    InterfaceC41634e<WelfareSignupEntity> m43298o(@NotNull @Query("questId") String str);
}
