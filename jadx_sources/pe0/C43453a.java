package pe0;

import android.os.Bundle;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import io.trtc.tuikit.atomicxcore.api.live.TakeSeatMode;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: pe0.a */
/* JADX INFO: compiled from: LiveInfoUtils.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005J\n\u0010\n\u001a\u00020\u0007*\u00020\u000bJ\f\u0010\f\u001a\u00020\r*\u0004\u0018\u00010\u000eJ\n\u0010\u000f\u001a\u00020\u000b*\u00020\u0007J\n\u0010\u0010\u001a\u00020\u000e*\u00020\r¨\u0006\u0011"}, m90084d2 = {"Lcom/trtc/uikit/livekit/livestream/impl/LiveInfoUtils;", "", "<init>", "()V", "convertLiveInfoToBundle", "Landroid/os/Bundle;", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "convertBundleToLiveInfo", "liveBundle", "asStoreLiveInfo", "Lcom/tencent/cloud/tuikit/engine/extension/TUILiveListManager$LiveInfo;", "toTakeSeatMode", "Lio/trtc/tuikit/atomicxcore/api/live/TakeSeatMode;", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;", "asEngineLiveInfo", "toTUISeatMode", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43453a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43453a f95982a = new C43453a();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final LiveInfo m95667a(@NotNull Bundle liveBundle) {
        Intrinsics.checkNotNullParameter(liveBundle, "liveBundle");
        LiveUserInfo liveUserInfo = new LiveUserInfo(null, null, null, 7, null);
        String string = liveBundle.getString(TUIConstantDefine.OWNER_ID, "");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        liveUserInfo.setUserID(string);
        String string2 = liveBundle.getString(TUIConstantDefine.OWNER_NAME, "");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        liveUserInfo.setUserName(string2);
        String string3 = liveBundle.getString(TUIConstantDefine.OWNER_AVATAR_URL, "");
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        liveUserInfo.setAvatarURL(string3);
        Unit unit = Unit.INSTANCE;
        LiveInfo liveInfo = new LiveInfo(null, null, null, false, false, false, false, 0, null, 0, null, null, null, 0, liveUserInfo, liveBundle.getLong(TUIConstantDefine.CREATE_TIME, 0L), 0, false, null, 475135, null);
        String string4 = liveBundle.getString("roomId", "");
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        liveInfo.setLiveID(string4);
        String string5 = liveBundle.getString("name", "");
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        liveInfo.setLiveName(string5);
        liveInfo.setMessageDisable(liveBundle.getBoolean("isMessageDisableForAllUser", false));
        liveInfo.setSeatEnabled(liveBundle.getBoolean(TUIConstantDefine.IS_SEAT_ENABLE, false));
        liveInfo.setSeatMode(liveBundle.getInt(TUIConstantDefine.SEAT_MODE, 0) == 0 ? TakeSeatMode.FREE : TakeSeatMode.APPLY);
        liveInfo.setMaxSeatCount(liveBundle.getInt(TUIConstantDefine.MAX_SEAT_COUNT, 0));
        String string6 = liveBundle.getString("coverUrl", "");
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        liveInfo.setCoverURL(string6);
        String string7 = liveBundle.getString("backgroundUrl", "");
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        liveInfo.setBackgroundURL(string7);
        List<Integer> integerArrayList = liveBundle.getIntegerArrayList("categoryList");
        if (integerArrayList == null) {
            integerArrayList = CollectionsKt.emptyList();
        }
        liveInfo.setCategoryList(integerArrayList);
        liveInfo.setPublicVisible(liveBundle.getBoolean("isPublicVisible", false));
        liveInfo.setActivityStatus(liveBundle.getInt("activityStatus", 0));
        liveInfo.setTotalViewerCount(liveBundle.getInt("viewCount", 0));
        return liveInfo;
    }
}
