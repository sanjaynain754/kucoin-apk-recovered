package io.trtc.tuikit.atomicxcore.impl.live;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomObserver;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.SeatInfo;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.json.JSONException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.IntRange;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.V0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39710V0 extends TUIRoomObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39716Y0 f88226a;

    public C39710V0(C39716Y0 c39716y0) {
        this.f88226a = c39716y0;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onSeatListChanged(String roomId, List seatList, List newlySeatedUsers, List newlyLeftUsers) throws JSONException {
        String string;
        Object next;
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(seatList, "seatList");
        Intrinsics.checkNotNullParameter(newlySeatedUsers, "newlySeatedUsers");
        Intrinsics.checkNotNullParameter(newlyLeftUsers, "newlyLeftUsers");
        if (Intrinsics.areEqual(roomId, this.f88226a.f88234a)) {
            C39510r c39510r = this.f88226a.f88240g;
            StringBuilder sb2 = new StringBuilder("onSeatListChanged:");
            sb2.append(roomId);
            sb2.append(", seatList: ");
            Intrinsics.checkNotNullParameter(seatList, "seatList");
            if (seatList.isEmpty()) {
                string = "seatList is empty";
            } else {
                StringBuilder sb3 = new StringBuilder("seatList:" + seatList.size() + '\n');
                Iterator it = seatList.iterator();
                while (it.hasNext()) {
                    TUIRoomDefine.SeatFullInfo seatFullInfo = (TUIRoomDefine.SeatFullInfo) it.next();
                    Intrinsics.checkNotNullParameter(seatFullInfo, "<this>");
                    StringBuilder sb4 = new StringBuilder("SeatFullInfo {");
                    sb4.append("  roomId: " + seatFullInfo.roomId);
                    sb4.append("  seatIndex: " + seatFullInfo.seatIndex);
                    sb4.append("  isSeatLocked: " + seatFullInfo.isSeatLocked);
                    sb4.append("  userId: " + seatFullInfo.userId);
                    sb4.append("  userName: " + seatFullInfo.userName);
                    sb4.append("  userAvatar: " + seatFullInfo.userAvatar);
                    sb4.append("  userMicrophoneStatus: " + seatFullInfo.userMicrophoneStatus);
                    sb4.append("  userCameraStatus: " + seatFullInfo.userCameraStatus);
                    sb4.append("  userSuspendStatus: " + seatFullInfo.userSuspendStatus);
                    sb4.append("  x: " + seatFullInfo.f73243x);
                    sb4.append("  y: " + seatFullInfo.f73244y);
                    sb4.append("  width: " + seatFullInfo.width);
                    sb4.append("  height: " + seatFullInfo.height);
                    sb4.append("  zorder: " + seatFullInfo.zorder);
                    sb4.append("}");
                    String string2 = sb4.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
                    sb3.append(string2);
                    sb3.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                }
                string = sb3.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            }
            sb2.append(string);
            String message = sb2.toString();
            c39510r.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            c39510r.m88251a(0, message);
            Iterator it2 = seatList.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.areEqual(((TUIRoomDefine.SeatFullInfo) next).userId, TUIRoomEngine.getSelfInfo().userId));
            TUIRoomDefine.SeatFullInfo seatFullInfo2 = (TUIRoomDefine.SeatFullInfo) next;
            if (seatFullInfo2 != null) {
                C39716Y0 c39716y0 = this.f88226a;
                TUIRoomDefine.SeatFullInfo seatFullInfo3 = c39716y0.f88245l;
                if (seatFullInfo3 != null) {
                    TUIRoomDefine.DeviceStatus deviceStatus = seatFullInfo2.userCameraStatus;
                    TUIRoomDefine.DeviceStatus deviceStatus2 = seatFullInfo3.userCameraStatus;
                    TUIRoomDefine.DeviceStatus deviceStatus3 = TUIRoomDefine.DeviceStatus.CLOSED_BY_ADMIN;
                    if (deviceStatus == deviceStatus3 ? deviceStatus2 != deviceStatus3 : deviceStatus2 == deviceStatus3) {
                        if (deviceStatus == deviceStatus3) {
                            c39716y0.f88241h.m88249a((Function1) new C39704S0(c39716y0));
                        } else {
                            c39716y0.f88241h.m88249a((Function1) new C39706T0(c39716y0));
                        }
                    }
                    TUIRoomDefine.DeviceStatus deviceStatus4 = seatFullInfo2.userMicrophoneStatus;
                    TUIRoomDefine.DeviceStatus deviceStatus5 = seatFullInfo3.userMicrophoneStatus;
                    if (deviceStatus4 == deviceStatus3 ? deviceStatus5 != deviceStatus3 : deviceStatus5 == deviceStatus3) {
                        if (deviceStatus4 == deviceStatus3) {
                            C39716Y0 c39716y1 = this.f88226a;
                            c39716y1.f88241h.m88249a((Function1) new C39701Q0(c39716y1));
                        } else {
                            C39716Y0 c39716y2 = this.f88226a;
                            c39716y2.f88241h.m88249a((Function1) new C39702R0(c39716y2));
                        }
                    }
                }
                c39716y0.f88245l = seatFullInfo2;
                Unit unit = Unit.INSTANCE;
            } else {
                new C39708U0(this.f88226a);
            }
            this.f88226a.m88315a(seatList);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onUserAudioStateChanged(String str, boolean z11, TUIRoomDefine.ChangeReason reason) {
        Object obj;
        ArrayList arrayList;
        String userID = str;
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (z11) {
            this.f88226a.getHasAudioStreamUserList$atomicxcore_release().add(userID);
        } else {
            this.f88226a.getHasAudioStreamUserList$atomicxcore_release().remove(userID);
        }
        C39716Y0 c39716y0 = this.f88226a;
        LiveInfo liveInfo = c39716y0.f88244k;
        String liveID = liveInfo != null ? liveInfo.getLiveID() : null;
        if (liveID == null || liveID.length() == 0) {
            return;
        }
        IntRange intRange = new IntRange(1, 199);
        LiveInfo liveInfo2 = c39716y0.f88244k;
        Integer numValueOf = liveInfo2 != null ? Integer.valueOf(liveInfo2.getSeatLayoutTemplateID()) : null;
        if (numValueOf == null || !intRange.contains(numValueOf.intValue())) {
            return;
        }
        DeviceStatus deviceStatus = z11 ? DeviceStatus.ON : DeviceStatus.OFF;
        InterfaceC41669n interfaceC41669n = this.f88226a.f88236c;
        while (true) {
            Object value = interfaceC41669n.getValue();
            List<SeatInfo> list = (List) value;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (SeatInfo seatInfoCopy$default : list) {
                if (Intrinsics.areEqual(seatInfoCopy$default.getUserInfo().getUserID(), userID)) {
                    arrayList = arrayList2;
                    obj = value;
                    seatInfoCopy$default = SeatInfo.copy$default(seatInfoCopy$default, 0, false, SeatUserInfo.copy$default(seatInfoCopy$default.getUserInfo(), null, null, null, null, null, deviceStatus, false, null, false, null, 991, null), null, 11, null);
                } else {
                    obj = value;
                    arrayList = arrayList2;
                }
                arrayList.add(seatInfoCopy$default);
                value = obj;
                arrayList2 = arrayList;
                userID = str;
            }
            if (interfaceC41669n.compareAndSet(value, arrayList2)) {
                return;
            } else {
                userID = str;
            }
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onUserVideoStateChanged(String userID, TUIRoomDefine.VideoStreamType videoStreamType, boolean z11, TUIRoomDefine.ChangeReason changeReason) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        C39510r c39510r = this.f88226a.f88240g;
        String message = "onUserVideoStateChanged:userID" + userID + ", streamType" + videoStreamType + ", hasVideo" + z11 + ", reason" + changeReason;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        if (z11) {
            this.f88226a.getHasVideoStreamUserList$atomicxcore_release().add(userID);
        } else {
            this.f88226a.getHasVideoStreamUserList$atomicxcore_release().remove(userID);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onUserVoiceVolumeChanged(Map volumeMap) {
        Object value;
        Intrinsics.checkNotNullParameter(volumeMap, "volumeMap");
        InterfaceC41669n interfaceC41669n = this.f88226a.f88238e;
        do {
            value = interfaceC41669n.getValue();
        } while (!interfaceC41669n.compareAndSet(value, MapsKt.toMutableMap(volumeMap)));
    }
}
