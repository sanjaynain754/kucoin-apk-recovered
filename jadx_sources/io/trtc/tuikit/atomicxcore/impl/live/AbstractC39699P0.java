package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager;
import io.trtc.tuikit.atomicxcore.api.live.LiveCanvas;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import org.json.JSONObject;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.P0 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC39699P0 {
    /* JADX INFO: renamed from: a */
    public static final LiveCanvas m88311a(String jsonString) {
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        LiveCanvas liveCanvas = new LiveCanvas(0, 0, 0, 7, null);
        try {
            JSONObject jSONObject = new JSONObject(jsonString);
            liveCanvas.setH(jSONObject.optInt("canvasHeight", 0));
            liveCanvas.setW(jSONObject.optInt("canvasWidth", 0));
            liveCanvas.setTemplateID(jSONObject.optInt("templateId", 0));
            return liveCanvas;
        } catch (Exception e11) {
            e11.printStackTrace();
            return liveCanvas;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final TUILiveConnectionManager.ConnectionUser m88310a(SeatUserInfo seatUserInfo) {
        TUILiveConnectionManager.ConnectionUser connectionUser = new TUILiveConnectionManager.ConnectionUser();
        connectionUser.userId = seatUserInfo != null ? seatUserInfo.getUserID() : null;
        connectionUser.userName = seatUserInfo != null ? seatUserInfo.getUserName() : null;
        connectionUser.avatarUrl = seatUserInfo != null ? seatUserInfo.getAvatarURL() : null;
        connectionUser.roomId = seatUserInfo != null ? seatUserInfo.getLiveID() : null;
        return connectionUser;
    }

    /* JADX INFO: renamed from: a */
    public static final SeatUserInfo m88312a(TUILiveConnectionManager.ConnectionUser seatInfo) {
        Intrinsics.checkNotNullParameter(seatInfo, "seatInfo");
        String str = seatInfo.roomId;
        String str2 = seatInfo.userId;
        String str3 = seatInfo.userName;
        String str4 = seatInfo.avatarUrl;
        Intrinsics.checkNotNull(str2);
        Intrinsics.checkNotNull(str3);
        Intrinsics.checkNotNull(str4);
        Intrinsics.checkNotNull(str);
        return new SeatUserInfo(str2, str3, str4, null, str, null, false, null, false, null, 1000, null);
    }
}
