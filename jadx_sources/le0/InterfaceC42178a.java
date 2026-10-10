package le0;

import com.trtc.uikit.livekit.p180kc.data.entity.BlockUser;
import com.trtc.uikit.livekit.p180kc.data.entity.ClickCardReport;
import com.trtc.uikit.livekit.p180kc.data.entity.Follow;
import com.trtc.uikit.livekit.p180kc.data.entity.KCLiveInfo;
import com.trtc.uikit.livekit.p180kc.data.entity.LiveCardInfoListEntity;
import com.trtc.uikit.livekit.p180kc.data.entity.LiveEntranceConfigEntity;
import com.trtc.uikit.livekit.p180kc.data.entity.LiveHitCount;
import com.trtc.uikit.livekit.p180kc.data.entity.LiveRoomInfo;
import com.trtc.uikit.livekit.p180kc.data.entity.LiveShareLink;
import com.trtc.uikit.livekit.p180kc.data.entity.LiveTxUserInfo;
import com.trtc.uikit.livekit.p180kc.data.entity.PrecheckCard;
import com.trtc.uikit.livekit.p180kc.data.entity.Report;
import com.trtc.uikit.livekit.p180kc.data.entity.Reserve;
import com.trtc.uikit.livekit.p180kc.data.entity.SaveLiveCard;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import com.trtc.uikit.livekit.p180kc.data.entity.SubscribeStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: le0.a */
/* JADX INFO: compiled from: LiveWebService.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H§@¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0010\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u0018\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\u0010\u001a\u00020\u001bH§@¢\u0006\u0002\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u001e2\b\b\u0001\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ6\u0010\u001f\u001a\u00020 2\b\b\u0001\u0010!\u001a\u00020\n2\b\b\u0001\u0010\"\u001a\u00020\n2\b\b\u0001\u0010#\u001a\u00020\n2\b\b\u0001\u0010$\u001a\u00020\nH§@¢\u0006\u0002\u0010%J\u0018\u0010&\u001a\u00020'2\b\b\u0001\u0010\u0010\u001a\u00020(H§@¢\u0006\u0002\u0010)J\u0018\u0010*\u001a\u00020+2\b\b\u0001\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u0018\u0010,\u001a\u00020-2\b\b\u0001\u0010\u0010\u001a\u00020.H§@¢\u0006\u0002\u0010/J\u001a\u00100\u001a\u0004\u0018\u0001012\b\b\u0001\u0010\u0010\u001a\u000202H§@¢\u0006\u0002\u00103J\u001a\u00104\u001a\u0004\u0018\u0001052\b\b\u0001\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u001a\u00106\u001a\u0004\u0018\u0001012\b\b\u0001\u0010\u0010\u001a\u000207H§@¢\u0006\u0002\u00108ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00069À\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/source/remote/LiveWebService;", "", "loadLiveTxUserInfo", "Lcom/trtc/uikit/livekit/kc/data/entity/LiveTxUserInfo;", "liveRoomInfo", "Lcom/trtc/uikit/livekit/kc/data/entity/LiveRoomInfo;", "(Lcom/trtc/uikit/livekit/kc/data/entity/LiveRoomInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLiveInfo", "Lcom/trtc/uikit/livekit/kc/data/entity/KCLiveInfo;", "roomId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLiveHitCount", "Lcom/trtc/uikit/livekit/kc/data/entity/LiveHitCount;", "followLive", "Lcom/trtc/uikit/livekit/kc/data/entity/Follow$Response;", "request", "Lcom/trtc/uikit/livekit/kc/data/entity/Follow$Request;", "(Lcom/trtc/uikit/livekit/kc/data/entity/Follow$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reserveLive", "Lcom/trtc/uikit/livekit/kc/data/entity/Reserve$Response;", "Lcom/trtc/uikit/livekit/kc/data/entity/Reserve$Request;", "(Lcom/trtc/uikit/livekit/kc/data/entity/Reserve$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLiveShareLink", "Lcom/trtc/uikit/livekit/kc/data/entity/LiveShareLink;", "report", "Lcom/trtc/uikit/livekit/kc/data/entity/Report$Response;", "Lcom/trtc/uikit/livekit/kc/data/entity/Report$Request;", "(Lcom/trtc/uikit/livekit/kc/data/entity/Report$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadSubscribeStatus", "Lcom/trtc/uikit/livekit/kc/data/entity/SubscribeStatus;", "loadSharedPosition", "Lcom/trtc/uikit/livekit/kc/data/entity/SharedPositionInfo;", "bizType", "bizId", "userOpenId", "closeId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportClickCard", "Lcom/trtc/uikit/livekit/kc/data/entity/ClickCardReport$Response;", "Lcom/trtc/uikit/livekit/kc/data/entity/ClickCardReport$Request;", "(Lcom/trtc/uikit/livekit/kc/data/entity/ClickCardReport$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadEntranceConfig", "Lcom/trtc/uikit/livekit/kc/data/entity/LiveEntranceConfigEntity;", "preCheckCard", "Lcom/trtc/uikit/livekit/kc/data/entity/PrecheckCard$ResponseEntity;", "Lcom/trtc/uikit/livekit/kc/data/entity/PrecheckCard$Request;", "(Lcom/trtc/uikit/livekit/kc/data/entity/PrecheckCard$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveLiveCard", "", "Lcom/trtc/uikit/livekit/kc/data/entity/SaveLiveCard$Request;", "(Lcom/trtc/uikit/livekit/kc/data/entity/SaveLiveCard$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCardInfo", "Lcom/trtc/uikit/livekit/kc/data/entity/LiveCardInfoListEntity;", "blockUser", "Lcom/trtc/uikit/livekit/kc/data/entity/BlockUser$Request;", "(Lcom/trtc/uikit/livekit/kc/data/entity/BlockUser$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC42178a {
    @GET("live-stream/api/v1/getCardInfo")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m92613a(@NotNull @Query("roomId") String str, @NotNull Continuation<? super LiveCardInfoListEntity> continuation) throws Exception;

    @GET("live-stream/api/v1/getLiveHitCount")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m92614b(@NotNull @Query("roomId") String str, @NotNull Continuation<? super LiveHitCount> continuation) throws Exception;

    @POST("live-stream/api/v1/tx/user")
    @Nullable
    /* JADX INFO: renamed from: c */
    Object m92615c(@Body @NotNull LiveRoomInfo liveRoomInfo, @NotNull Continuation<? super LiveTxUserInfo> continuation) throws Exception;

    @POST("live-stream/api/v1/reportEvent")
    @Nullable
    /* JADX INFO: renamed from: d */
    Object m92616d(@Body @NotNull ClickCardReport.Request request, @NotNull Continuation<? super ClickCardReport.Response> continuation) throws Exception;

    @POST("live-stream/api/v1/subscribe")
    @Nullable
    /* JADX INFO: renamed from: e */
    Object m92617e(@Body @NotNull Follow.Request request, @NotNull Continuation<? super Follow.Response> continuation) throws Exception;

    @GET("live-stream/api/v1/getSubscribe")
    @Nullable
    /* JADX INFO: renamed from: f */
    Object m92618f(@NotNull @Query("roomId") String str, @NotNull Continuation<? super SubscribeStatus> continuation) throws Exception;

    @POST("live-stream/api/v1/reportEvent")
    @Nullable
    /* JADX INFO: renamed from: g */
    Object m92619g(@Body @NotNull Report.Request request, @NotNull Continuation<? super Report.Response> continuation) throws Exception;

    @GET("live-stream/api/v1/getLiveShareLink")
    @Nullable
    /* JADX INFO: renamed from: h */
    Object m92620h(@NotNull @Query("roomId") String str, @NotNull Continuation<? super LiveShareLink> continuation) throws Exception;

    @POST("live-stream/api/v1/saveCardInfo/preCheck")
    @Nullable
    /* JADX INFO: renamed from: i */
    Object m92621i(@Body @NotNull PrecheckCard.Request request, @NotNull Continuation<? super PrecheckCard.ResponseEntity> continuation) throws Exception;

    @GET("live-stream/api/v1/getLiveInfo")
    @Nullable
    /* JADX INFO: renamed from: j */
    Object m92622j(@NotNull @Query("roomId") String str, @NotNull Continuation<? super KCLiveInfo> continuation) throws Exception;

    @POST("live-stream/api/v1/saveCardInfo")
    @Nullable
    /* JADX INFO: renamed from: k */
    Object m92623k(@Body @NotNull SaveLiveCard.Request request, @NotNull Continuation<? super Boolean> continuation) throws Exception;

    @GET("v1/km/position/feed/shared-position")
    @Nullable
    /* JADX INFO: renamed from: l */
    Object m92624l(@NotNull @Query("bizType") String str, @NotNull @Query("bizId") String str2, @NotNull @Query("userOpenId") String str3, @NotNull @Query("closeId") String str4, @NotNull Continuation<? super SharedPositionInfo> continuation) throws Exception;

    @POST("live-stream/api/v1/reserve")
    @Nullable
    /* JADX INFO: renamed from: m */
    Object m92625m(@Body @NotNull Reserve.Request request, @NotNull Continuation<? super Reserve.Response> continuation) throws Exception;

    @GET("live-stream/api/v1/cardEnabled")
    @Nullable
    /* JADX INFO: renamed from: n */
    Object m92626n(@NotNull @Query("roomId") String str, @NotNull Continuation<? super LiveEntranceConfigEntity> continuation) throws Exception;

    @POST("live-stream/api/v1/block-streamer")
    @Nullable
    /* JADX INFO: renamed from: o */
    Object m92627o(@Body @NotNull BlockUser.Request request, @NotNull Continuation<? super Boolean> continuation) throws Exception;
}
