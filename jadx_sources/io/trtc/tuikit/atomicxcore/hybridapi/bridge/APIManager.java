package io.trtc.tuikit.atomicxcore.hybridapi.bridge;

import android.content.Context;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.hybridapi.api.AudioEffectAPI;
import io.trtc.tuikit.atomicxcore.hybridapi.api.BarrageAPI;
import io.trtc.tuikit.atomicxcore.hybridapi.api.BaseBeautyAPI;
import io.trtc.tuikit.atomicxcore.hybridapi.api.BattleAPI;
import io.trtc.tuikit.atomicxcore.hybridapi.api.CoGuestAPI;
import io.trtc.tuikit.atomicxcore.hybridapi.api.CoHostAPI;
import io.trtc.tuikit.atomicxcore.hybridapi.api.DeviceAPI;
import io.trtc.tuikit.atomicxcore.hybridapi.api.GiftAPI;
import io.trtc.tuikit.atomicxcore.hybridapi.api.LikeAPI;
import io.trtc.tuikit.atomicxcore.hybridapi.api.LiveAudienceAPI;
import io.trtc.tuikit.atomicxcore.hybridapi.api.LiveListAPI;
import io.trtc.tuikit.atomicxcore.hybridapi.api.LiveSeatAPI;
import io.trtc.tuikit.atomicxcore.hybridapi.api.LoginAPI;
import io.trtc.tuikit.atomicxcore.hybridapi.json.JsonParserKt;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020 0$J$\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020 0$H\u0002J$\u0010)\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020 0$H\u0002J$\u0010*\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020 0$H\u0002J$\u0010+\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020 0$H\u0002J$\u0010,\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020 0$H\u0002J$\u0010-\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020 0$H\u0002J$\u0010.\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020 0$H\u0002J$\u0010/\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020 0$H\u0002J$\u00100\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020 0$H\u0002J$\u00101\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020 0$H\u0002J$\u00102\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020 0$H\u0002J$\u00103\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020 0$H\u0002J$\u00104\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020 0$H\u0002J,\u00105\u001a\u00020 2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020 0$2\u0006\u00106\u001a\u00020\"2\u0006\u00107\u001a\u00020\"H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/APIManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "audioEffectAPI", "Lio/trtc/tuikit/atomicxcore/hybridapi/api/AudioEffectAPI;", "barrageAPI", "Lio/trtc/tuikit/atomicxcore/hybridapi/api/BarrageAPI;", "baseBeautyAPI", "Lio/trtc/tuikit/atomicxcore/hybridapi/api/BaseBeautyAPI;", "battleAPI", "Lio/trtc/tuikit/atomicxcore/hybridapi/api/BattleAPI;", "coGuestAPI", "Lio/trtc/tuikit/atomicxcore/hybridapi/api/CoGuestAPI;", "coHostAPI", "Lio/trtc/tuikit/atomicxcore/hybridapi/api/CoHostAPI;", "deviceAPI", "Lio/trtc/tuikit/atomicxcore/hybridapi/api/DeviceAPI;", "giftAPI", "Lio/trtc/tuikit/atomicxcore/hybridapi/api/GiftAPI;", "likeAPI", "Lio/trtc/tuikit/atomicxcore/hybridapi/api/LikeAPI;", "liveAudienceAPI", "Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveAudienceAPI;", "liveListAPI", "Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveListAPI;", "liveSeatAPI", "Lio/trtc/tuikit/atomicxcore/hybridapi/api/LiveSeatAPI;", "loginAPI", "Lio/trtc/tuikit/atomicxcore/hybridapi/api/LoginAPI;", "callAPI", "", JPushConstants.Analysis.KEY_JSON, "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "handleAudioEffectAPI", "", "request", "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;", "handleBarrageAPI", "handleBaseBeautyAPI", "handleBattleAPI", "handleCoGuestAPI", "handleCoHostAPI", "handleDeviceAPI", "handleGiftAPI", "handleLikeAPI", "handleLiveAudienceAPI", "handleLiveListAPI", "handleLiveSeatAPI", "handleLoginAPI", "sendErrorResponse", "api", "message", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAPIManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 APIManager.kt\nio/trtc/tuikit/atomicxcore/hybridapi/bridge/APIManager\n+ 2 JsonParser.kt\nio/trtc/tuikit/atomicxcore/hybridapi/json/JsonParserKt\n*L\n1#1,501:1\n45#2,5:502\n*S KotlinDebug\n*F\n+ 1 APIManager.kt\nio/trtc/tuikit/atomicxcore/hybridapi/bridge/APIManager\n*L\n63#1:502,5\n*E\n"})
public final class APIManager {

    @NotNull
    private final AudioEffectAPI audioEffectAPI;

    @NotNull
    private final BarrageAPI barrageAPI;

    @NotNull
    private final BaseBeautyAPI baseBeautyAPI;

    @NotNull
    private final BattleAPI battleAPI;

    @NotNull
    private final CoGuestAPI coGuestAPI;

    @NotNull
    private final CoHostAPI coHostAPI;

    @NotNull
    private final Context context;

    @NotNull
    private final DeviceAPI deviceAPI;

    @NotNull
    private final GiftAPI giftAPI;

    @NotNull
    private final LikeAPI likeAPI;

    @NotNull
    private final LiveAudienceAPI liveAudienceAPI;

    @NotNull
    private final LiveListAPI liveListAPI;

    @NotNull
    private final LiveSeatAPI liveSeatAPI;

    @NotNull
    private final LoginAPI loginAPI;

    public APIManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.loginAPI = new LoginAPI(context);
        this.liveListAPI = new LiveListAPI(context);
        this.deviceAPI = new DeviceAPI(context);
        this.baseBeautyAPI = new BaseBeautyAPI(context);
        this.audioEffectAPI = new AudioEffectAPI(context);
        this.likeAPI = new LikeAPI(context);
        this.giftAPI = new GiftAPI(context);
        this.battleAPI = new BattleAPI(context);
        this.coGuestAPI = new CoGuestAPI(context);
        this.coHostAPI = new CoHostAPI(context);
        this.liveAudienceAPI = new LiveAudienceAPI(context);
        this.liveSeatAPI = new LiveSeatAPI(context);
        this.barrageAPI = new BarrageAPI(context);
    }

    private final void sendErrorResponse(Function1<? super String, Unit> callback, String api, String message) {
        callback.invoke(HybridResponse.Companion.failure$default(HybridResponse.INSTANCE, api, -1, message, null, 8, null));
    }

    public final void callAPI(@NotNull String json, @NotNull Function1<? super String, Unit> callback) {
        Object objFromJson;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            objFromJson = JsonParserKt.getSharedGson().fromJson(json, (Class<Object>) HybridRequest.class);
        } catch (Exception unused) {
            objFromJson = null;
        }
        HybridRequest hybridRequest = (HybridRequest) objFromJson;
        if (hybridRequest == null) {
            sendErrorResponse(callback, "unknown", "Json parse failed");
            return;
        }
        if (handleLoginAPI(hybridRequest, callback) || handleLiveListAPI(hybridRequest, callback) || handleDeviceAPI(hybridRequest, callback) || handleBaseBeautyAPI(hybridRequest, callback) || handleAudioEffectAPI(hybridRequest, callback) || handleLikeAPI(hybridRequest, callback) || handleGiftAPI(hybridRequest, callback) || handleBattleAPI(hybridRequest, callback) || handleCoGuestAPI(hybridRequest, callback) || handleCoHostAPI(hybridRequest, callback) || handleLiveAudienceAPI(hybridRequest, callback) || handleLiveSeatAPI(hybridRequest, callback) || handleBarrageAPI(hybridRequest, callback)) {
            return;
        }
        sendErrorResponse(callback, hybridRequest.getApi(), "Unknown api: " + hybridRequest.getApi());
    }

    private final boolean handleAudioEffectAPI(HybridRequest request, Function1<? super String, Unit> callback) {
        switch (request.getApi()) {
            case "setAudioReverbType":
                this.audioEffectAPI.setAudioReverbType(request, callback);
                return true;
            case "setAudioChangerType":
                this.audioEffectAPI.setAudioChangerType(request, callback);
                return true;
            case "setVoiceEarMonitorEnable":
                this.audioEffectAPI.setVoiceEarMonitorEnable(request, callback);
                return true;
            case "resetAudioEffect":
                this.audioEffectAPI.reset(request, callback);
                return true;
            case "setVoiceEarMonitorVolume":
                this.audioEffectAPI.setVoiceEarMonitorVolume(request, callback);
                return true;
            default:
                return false;
        }
    }

    private final boolean handleBarrageAPI(HybridRequest request, Function1<? super String, Unit> callback) {
        String api = request.getApi();
        int iHashCode = api.hashCode();
        if (iHashCode != -1225500498) {
            if (iHashCode != 1639917162) {
                if (iHashCode == 1644620146 && api.equals("sendTextMessage")) {
                    this.barrageAPI.sendTextMessage(request, callback);
                    return true;
                }
                return false;
            }
            if (api.equals("appendLocalTip")) {
                this.barrageAPI.appendLocalTip(request, callback);
                return true;
            }
            return false;
        }
        if (!api.equals("sendCustomMessage")) {
            return false;
        }
        this.barrageAPI.sendCustomMessage(request, callback);
        return true;
    }

    private final boolean handleBaseBeautyAPI(HybridRequest request, Function1<? super String, Unit> callback) {
        String api = request.getApi();
        int iHashCode = api.hashCode();
        if (iHashCode != -1189225392) {
            if (iHashCode != -677378458) {
                if (iHashCode != -302004900) {
                    if (iHashCode == 1488276660 && api.equals("setSmoothLevel")) {
                        this.baseBeautyAPI.setSmoothLevel(request, callback);
                        return true;
                    }
                    return false;
                }
                if (api.equals("resetBaseBeauty")) {
                    this.baseBeautyAPI.reset(request, callback);
                    return true;
                }
                return false;
            }
            if (api.equals("setWhitenessLevel")) {
                this.baseBeautyAPI.setWhitenessLevel(request, callback);
                return true;
            }
            return false;
        }
        if (!api.equals("setRuddyLevel")) {
            return false;
        }
        this.baseBeautyAPI.setRuddyLevel(request, callback);
        return true;
    }

    private final boolean handleBattleAPI(HybridRequest request, Function1<? super String, Unit> callback) {
        switch (request.getApi()) {
            case "exitBattle":
                this.battleAPI.exitBattle(request, callback);
                return true;
            case "requestBattle":
                this.battleAPI.requestBattle(request, callback);
                return true;
            case "acceptBattle":
                this.battleAPI.acceptBattle(request, callback);
                return true;
            case "cancelBattleRequest":
                this.battleAPI.cancelBattleRequest(request, callback);
                return true;
            case "rejectBattle":
                this.battleAPI.rejectBattle(request, callback);
                return true;
            default:
                return false;
        }
    }

    private final boolean handleCoGuestAPI(HybridRequest request, Function1<? super String, Unit> callback) {
        switch (request.getApi()) {
            case "rejectApplication":
                this.coGuestAPI.rejectApplication(request, callback);
                return true;
            case "rejectInvitation":
                this.coGuestAPI.rejectInvitation(request, callback);
                return true;
            case "cancelApplication":
                this.coGuestAPI.cancelApplication(request, callback);
                return true;
            case "applyForSeat":
                this.coGuestAPI.applyForSeat(request, callback);
                return true;
            case "inviteToSeat":
                this.coGuestAPI.inviteToSeat(request, callback);
                return true;
            case "disconnect":
                this.coGuestAPI.disconnect(request, callback);
                return true;
            case "cancelInvitation":
                this.coGuestAPI.cancelInvitation(request, callback);
                return true;
            case "acceptApplication":
                this.coGuestAPI.acceptApplication(request, callback);
                return true;
            case "acceptInvitation":
                this.coGuestAPI.acceptInvitation(request, callback);
                return true;
            default:
                return false;
        }
    }

    private final boolean handleCoHostAPI(HybridRequest request, Function1<? super String, Unit> callback) {
        switch (request.getApi()) {
            case "rejectHostConnection":
                this.coHostAPI.rejectHostConnection(request, callback);
                return true;
            case "requestHostConnection":
                this.coHostAPI.requestHostConnection(request, callback);
                return true;
            case "acceptHostConnection":
                this.coHostAPI.acceptHostConnection(request, callback);
                return true;
            case "exitHostConnection":
                this.coHostAPI.exitHostConnection(request, callback);
                return true;
            case "cancelHostConnection":
                this.coHostAPI.cancelHostConnection(request, callback);
                return true;
            default:
                return false;
        }
    }

    private final boolean handleDeviceAPI(HybridRequest request, Function1<? super String, Unit> callback) {
        switch (request.getApi()) {
            case "setOutputVolume":
                this.deviceAPI.setOutputVolume(request, callback);
                return true;
            case "startScreenShare":
                this.deviceAPI.startScreenShare(request, callback);
                return true;
            case "setCaptureVolume":
                this.deviceAPI.setCaptureVolume(request, callback);
                return true;
            case "openLocalCamera":
                this.deviceAPI.openLocalCamera(request, callback);
                return true;
            case "closeLocalCamera":
                this.deviceAPI.closeLocalCamera(request, callback);
                return true;
            case "stopScreenShare":
                this.deviceAPI.stopScreenShare(request, callback);
                return true;
            case "updateVideoQuality":
                this.deviceAPI.updateVideoQuality(request, callback);
                return true;
            case "reset":
                this.deviceAPI.reset(request, callback);
                return true;
            case "closeLocalMicrophone":
                this.deviceAPI.closeLocalMicrophone(request, callback);
                return true;
            case "switchCamera":
                this.deviceAPI.switchCamera(request, callback);
                return true;
            case "switchMirror":
                this.deviceAPI.switchMirror(request, callback);
                return true;
            case "openLocalMicrophone":
                this.deviceAPI.openLocalMicrophone(request, callback);
                return true;
            case "setAudioRoute":
                this.deviceAPI.setAudioRoute(request, callback);
                return true;
            default:
                return false;
        }
    }

    private final boolean handleGiftAPI(HybridRequest request, Function1<? super String, Unit> callback) {
        String api = request.getApi();
        int iHashCode = api.hashCode();
        if (iHashCode != -1040625328) {
            if (iHashCode != 375730650) {
                if (iHashCode == 1247062232 && api.equals("sendGift")) {
                    this.giftAPI.sendGift(request, callback);
                    return true;
                }
                return false;
            }
            if (api.equals("setLanguage")) {
                this.giftAPI.setLanguage(request, callback);
                return true;
            }
            return false;
        }
        if (!api.equals("refreshUsableGifts")) {
            return false;
        }
        this.giftAPI.refreshUsableGifts(request, callback);
        return true;
    }

    private final boolean handleLikeAPI(HybridRequest request, Function1<? super String, Unit> callback) {
        if (Intrinsics.areEqual(request.getApi(), "sendLike")) {
            this.likeAPI.sendLike(request, callback);
            return true;
        }
        return false;
    }

    private final boolean handleLiveAudienceAPI(HybridRequest request, Function1<? super String, Unit> callback) {
        switch (request.getApi()) {
            case "fetchAudienceList":
                this.liveAudienceAPI.fetchAudienceList(request, callback);
                return true;
            case "revokeAdministrator":
                this.liveAudienceAPI.revokeAdministrator(request, callback);
                return true;
            case "disableSendMessage":
                this.liveAudienceAPI.disableSendMessage(request, callback);
                return true;
            case "setAdministrator":
                this.liveAudienceAPI.setAdministrator(request, callback);
                return true;
            case "kickUserOutOfRoom":
                this.liveAudienceAPI.kickUserOutOfRoom(request, callback);
                return true;
            default:
                return false;
        }
    }

    private final boolean handleLiveListAPI(HybridRequest request, Function1<? super String, Unit> callback) {
        switch (request.getApi()) {
            case "updateLiveInfo":
                this.liveListAPI.updateLiveInfo(request, callback);
                return true;
            case "fetchLiveList":
                this.liveListAPI.fetchLiveList(request, callback);
                return true;
            case "endLive":
                this.liveListAPI.endLive(request, callback);
                return true;
            case "joinLive":
                this.liveListAPI.joinLive(request, callback);
                return true;
            case "reset":
                this.liveListAPI.reset(request, callback);
                return true;
            case "updateLiveMetaData":
                this.liveListAPI.updateLiveMetaData(request, callback);
                return true;
            case "queryMetaData":
                this.liveListAPI.queryMetaData(request, callback);
                return true;
            case "createLive":
                this.liveListAPI.createLive(request, callback);
                return true;
            case "leaveLive":
                this.liveListAPI.leaveLive(request, callback);
                return true;
            default:
                return false;
        }
    }

    private final boolean handleLiveSeatAPI(HybridRequest request, Function1<? super String, Unit> callback) {
        switch (request.getApi()) {
            case "openRemoteCamera":
                this.liveSeatAPI.openRemoteCamera(request, callback);
                return true;
            case "moveUserToSeat":
                this.liveSeatAPI.moveUserToSeat(request, callback);
                return true;
            case "closeRemoteCamera":
                this.liveSeatAPI.closeRemoteCamera(request, callback);
                return true;
            case "unlockSeat":
                this.liveSeatAPI.unlockSeat(request, callback);
                return true;
            case "takeSeat":
                this.liveSeatAPI.takeSeat(request, callback);
                return true;
            case "unmuteMicrophone":
                this.liveSeatAPI.unmuteMicrophone(request, callback);
                return true;
            case "openRemoteMicrophone":
                this.liveSeatAPI.openRemoteMicrophone(request, callback);
                return true;
            case "muteMicrophone":
                this.liveSeatAPI.muteMicrophone(request, callback);
                return true;
            case "closeRemoteMicrophone":
                this.liveSeatAPI.closeRemoteMicrophone(request, callback);
                return true;
            case "kickUserOutOfSeat":
                this.liveSeatAPI.kickUserOutOfSeat(request, callback);
                return true;
            case "leaveSeat":
                this.liveSeatAPI.leaveSeat(request, callback);
                return true;
            case "lockSeat":
                this.liveSeatAPI.lockSeat(request, callback);
                return true;
            default:
                return false;
        }
    }

    private final boolean handleLoginAPI(HybridRequest request, Function1<? super String, Unit> callback) {
        String api = request.getApi();
        int iHashCode = api.hashCode();
        if (iHashCode != -1113931620) {
            if (iHashCode != -1097329270) {
                if (iHashCode == 103149417 && api.equals(FirebaseAnalytics.Event.LOGIN)) {
                    this.loginAPI.login(request, callback);
                    return true;
                }
                return false;
            }
            if (api.equals("logout")) {
                this.loginAPI.logout(request, callback);
                return true;
            }
            return false;
        }
        if (!api.equals("setSelfInfo")) {
            return false;
        }
        this.loginAPI.setSelfInfo(request, callback);
        return true;
    }
}
