package io.trtc.tuikit.atomicxcore.impl.call;

import com.tencent.cloud.tuikit.engine.call.TUICallDefine;
import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import io.trtc.tuikit.atomicxcore.api.call.CallEndReason;
import io.trtc.tuikit.atomicxcore.api.call.CallMediaType;
import io.trtc.tuikit.atomicxcore.api.call.CallParams;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.call.b */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC39470b {
    /* JADX INFO: renamed from: a */
    public static final TUICallDefine.CallParams m88237a(CallParams callParams) {
        TUICallDefine.CallParams callParams2 = new TUICallDefine.CallParams();
        if (callParams == null) {
            return callParams2;
        }
        TUICommonDefine.RoomId roomId = new TUICommonDefine.RoomId();
        callParams2.roomId = roomId;
        roomId.strRoomId = callParams.getRoomId();
        callParams2.timeout = callParams.getTimeout();
        callParams2.isEphemeralCall = callParams.isEphemeralCall();
        callParams2.chatGroupId = callParams.getChatGroupId();
        callParams2.userData = callParams.getUserData();
        TUICallDefine.OfflinePushInfo offlinePushInfo = new TUICallDefine.OfflinePushInfo();
        UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
        offlinePushInfo.title = value != null ? value.getUserID() : null;
        offlinePushInfo.desc = "You have a new call.";
        offlinePushInfo.setIgnoreIOSBadge(false);
        offlinePushInfo.setIOSSound("phone_ringing.mp3");
        offlinePushInfo.androidSound = "phone_ringing";
        offlinePushInfo.androidHuaWeiCategory = "IM";
        offlinePushInfo.setIOSPushType(TUICallDefine.IOSOfflinePushType.VoIP);
        callParams2.offlinePushInfo = offlinePushInfo;
        return callParams2;
    }

    /* JADX INFO: renamed from: a */
    public static final CallMediaType m88239a(TUICallDefine.MediaType mediaType) {
        int i11 = mediaType == null ? -1 : AbstractC39469a.f87626b[mediaType.ordinal()];
        if (i11 == 1) {
            return CallMediaType.Audio;
        }
        if (i11 != 2) {
            return null;
        }
        return CallMediaType.Video;
    }

    /* JADX INFO: renamed from: a */
    public static final CallEndReason m88238a(TUICallDefine.CallEndReason callEndReason) {
        switch (callEndReason == null ? -1 : AbstractC39469a.f87628d[callEndReason.ordinal()]) {
            case 1:
                return CallEndReason.Hangup;
            case 2:
                return CallEndReason.LineBusy;
            case 3:
                return CallEndReason.Reject;
            case 4:
                return CallEndReason.NoResponse;
            case 5:
                return CallEndReason.Offline;
            case 6:
                return CallEndReason.Canceled;
            case 7:
                return CallEndReason.OtherDeviceAccepted;
            case 8:
                return CallEndReason.OtherDeviceReject;
            case 9:
                return CallEndReason.EndByServer;
            default:
                return CallEndReason.Unknown;
        }
    }
}
