package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomObserver;
import io.trtc.tuikit.atomicxcore.api.device.DeviceType;
import io.trtc.tuikit.atomicxcore.api.device.NetworkInfo;
import io.trtc.tuikit.atomicxcore.api.device.NetworkQuality;
import io.trtc.tuikit.atomicxcore.api.room.ParticipantRole;
import io.trtc.tuikit.atomicxcore.api.room.RoomParticipant;
import io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStatus;
import io.trtc.tuikit.atomicxcore.api.room.RoomUser;
import io.trtc.tuikit.atomicxcore.impl.device.AbstractC39651h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.Lazy;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.E */
/* JADX INFO: loaded from: classes61.dex */
public final class C39874E extends TUIRoomObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39934k0 f88629a;

    public C39874E(C39934k0 c39934k0) {
        this.f88629a = c39934k0;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onAllUserCameraDisableChanged(String roomId, boolean z11) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        C39934k0 c39934k0 = this.f88629a;
        c39934k0.f88787u.m88249a((Function1) new C39931j(z11, c39934k0));
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onAllUserMicrophoneDisableChanged(String roomId, boolean z11) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        C39934k0 c39934k0 = this.f88629a;
        c39934k0.f88787u.m88249a((Function1) new C39933k(z11, c39934k0));
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onKickedOutOfRoom(String roomId, TUIRoomDefine.KickedOutOfRoomReason reason, String message) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f88629a.f88787u.m88249a((Function1) new C39935l(reason, message));
        Lazy lazy = C39945p0.f88810b;
        AbstractC39943o0.m88369a().m88370a(roomId);
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onRemoteUserEnterRoom(String roomId, TUIRoomDefine.UserInfo userInfo) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        this.f88629a.m88354a(AbstractC39939m0.m88367a(userInfo, RoomParticipantStatus.IN_ROOM));
        this.f88629a.f88787u.m88249a((Function1) new C39938m(userInfo));
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onRemoteUserLeaveRoom(String roomId, TUIRoomDefine.UserInfo userInfo) {
        Object value;
        ArrayList arrayList;
        Object value2;
        ArrayList arrayList2;
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        C39934k0 c39934k0 = this.f88629a;
        String userID = userInfo.userId;
        Intrinsics.checkNotNullExpressionValue(userID, "userId");
        c39934k0.getClass();
        Intrinsics.checkNotNullParameter(userID, "userID");
        c39934k0.f88781o.remove(userID);
        InterfaceC41669n interfaceC41669n = c39934k0.f88768b;
        do {
            value = interfaceC41669n.getValue();
            arrayList = new ArrayList();
            for (Object obj : (List) value) {
                if (!Intrinsics.areEqual(((RoomParticipant) obj).getUserID(), userID)) {
                    arrayList.add(obj);
                }
            }
        } while (!interfaceC41669n.compareAndSet(value, arrayList));
        InterfaceC41669n interfaceC41669n2 = c39934k0.f88770d;
        do {
            value2 = interfaceC41669n2.getValue();
            arrayList2 = new ArrayList();
            for (Object obj2 : (List) value2) {
                if (!Intrinsics.areEqual(((RoomParticipant) obj2).getUserID(), userID)) {
                    arrayList2.add(obj2);
                }
            }
        } while (!interfaceC41669n2.compareAndSet(value2, arrayList2));
        RoomParticipant roomParticipant = (RoomParticipant) c39934k0.f88771e.getValue();
        if (roomParticipant != null && Intrinsics.areEqual(roomParticipant.getUserID(), userID)) {
            c39934k0.f88771e.setValue(null);
        }
        this.f88629a.f88787u.m88249a((Function1) new C39940n(userInfo));
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onRequestCancelled(TUIRoomDefine.Request request, TUIRoomDefine.UserInfo operateUser) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(operateUser, "operateUser");
        TUIRoomDefine.RequestAction requestAction = request.requestAction;
        int i11 = requestAction == null ? -1 : AbstractC39929i.f88755b[requestAction.ordinal()];
        if (i11 == 1) {
            C39915b c39915b = this.f88629a.f88791y;
            DeviceType deviceType = DeviceType.CAMERA;
            String userId = request.fromUser.userId;
            Intrinsics.checkNotNullExpressionValue(userId, "userId");
            c39915b.m88345a(deviceType, userId);
            this.f88629a.f88787u.m88249a((Function1) new C39942o(request));
            return;
        }
        if (i11 == 2) {
            C39915b c39915b2 = this.f88629a.f88791y;
            DeviceType deviceType2 = DeviceType.MICROPHONE;
            String userId2 = request.fromUser.userId;
            Intrinsics.checkNotNullExpressionValue(userId2, "userId");
            c39915b2.m88345a(deviceType2, userId2);
            this.f88629a.f88787u.m88249a((Function1) new C39944p(request));
            return;
        }
        if (i11 == 3) {
            C39915b c39915b3 = this.f88629a.f88791y;
            String userId3 = request.fromUser.userId;
            Intrinsics.checkNotNullExpressionValue(userId3, "userId");
            c39915b3.m88346b(userId3, DeviceType.CAMERA);
            this.f88629a.f88787u.m88249a((Function1) new C39946q(request));
            return;
        }
        if (i11 != 4) {
            return;
        }
        C39915b c39915b4 = this.f88629a.f88791y;
        String userId4 = request.fromUser.userId;
        Intrinsics.checkNotNullExpressionValue(userId4, "userId");
        c39915b4.m88346b(userId4, DeviceType.MICROPHONE);
        this.f88629a.f88787u.m88249a((Function1) new C39948r(request));
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onRequestProcessed(TUIRoomDefine.Request request, TUIRoomDefine.UserInfo operateUser) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(operateUser, "operateUser");
        TUIRoomDefine.RequestAction requestAction = request.requestAction;
        int i11 = requestAction == null ? -1 : AbstractC39929i.f88755b[requestAction.ordinal()];
        if (i11 == 1) {
            C39915b c39915b = this.f88629a.f88791y;
            DeviceType deviceType = DeviceType.CAMERA;
            String userId = request.fromUser.userId;
            Intrinsics.checkNotNullExpressionValue(userId, "userId");
            c39915b.m88345a(deviceType, userId);
            this.f88629a.f88787u.m88249a((Function1) new C39950s(request, operateUser));
            return;
        }
        if (i11 != 2) {
            return;
        }
        C39915b c39915b2 = this.f88629a.f88791y;
        DeviceType deviceType2 = DeviceType.MICROPHONE;
        String userId2 = request.fromUser.userId;
        Intrinsics.checkNotNullExpressionValue(userId2, "userId");
        c39915b2.m88345a(deviceType2, userId2);
        this.f88629a.f88787u.m88249a((Function1) new C39952t(request, operateUser));
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onRequestReceived(TUIRoomDefine.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        TUIRoomDefine.RequestAction requestAction = request.requestAction;
        switch (requestAction == null ? -1 : AbstractC39929i.f88755b[requestAction.ordinal()]) {
            case 1:
                this.f88629a.f88791y.m88344a(DeviceType.CAMERA, request);
                this.f88629a.f88787u.m88249a((Function1) new C39954u(request));
                break;
            case 2:
                this.f88629a.f88791y.m88344a(DeviceType.MICROPHONE, request);
                this.f88629a.f88787u.m88249a((Function1) new C39956v(request));
                break;
            case 3:
                C39915b c39915b = this.f88629a.f88791y;
                String userID = request.fromUser.userId;
                Intrinsics.checkNotNullExpressionValue(userID, "userId");
                DeviceType deviceType = DeviceType.CAMERA;
                c39915b.getClass();
                Intrinsics.checkNotNullParameter(userID, "userID");
                Intrinsics.checkNotNullParameter(deviceType, "device");
                Intrinsics.checkNotNullParameter(request, "request");
                C39908V0 c39908v0 = (C39908V0) c39915b.f88732f.get(userID);
                if (c39908v0 == null) {
                    c39908v0 = new C39908V0(userID, MapsKt.emptyMap());
                }
                Intrinsics.checkNotNullParameter(deviceType, "deviceType");
                Intrinsics.checkNotNullParameter(request, "request");
                Map deviceRequests = MapsKt.toMutableMap(c39908v0.f88718b);
                deviceRequests.put(deviceType, request);
                String userId = c39908v0.f88717a;
                Intrinsics.checkNotNullParameter(userId, "userId");
                Intrinsics.checkNotNullParameter(deviceRequests, "deviceRequests");
                c39915b.f88732f.put(userID, new C39908V0(userId, deviceRequests));
                this.f88629a.f88787u.m88249a((Function1) new C39958w(request));
                break;
            case 4:
                C39915b c39915b2 = this.f88629a.f88791y;
                String userID2 = request.fromUser.userId;
                Intrinsics.checkNotNullExpressionValue(userID2, "userId");
                DeviceType deviceType2 = DeviceType.MICROPHONE;
                c39915b2.getClass();
                Intrinsics.checkNotNullParameter(userID2, "userID");
                Intrinsics.checkNotNullParameter(deviceType2, "device");
                Intrinsics.checkNotNullParameter(request, "request");
                C39908V0 c39908v1 = (C39908V0) c39915b2.f88732f.get(userID2);
                if (c39908v1 == null) {
                    c39908v1 = new C39908V0(userID2, MapsKt.emptyMap());
                }
                Intrinsics.checkNotNullParameter(deviceType2, "deviceType");
                Intrinsics.checkNotNullParameter(request, "request");
                Map deviceRequests2 = MapsKt.toMutableMap(c39908v1.f88718b);
                deviceRequests2.put(deviceType2, request);
                String userId2 = c39908v1.f88717a;
                Intrinsics.checkNotNullParameter(userId2, "userId");
                Intrinsics.checkNotNullParameter(deviceRequests2, "deviceRequests");
                c39915b2.f88732f.put(userID2, new C39908V0(userId2, deviceRequests2));
                this.f88629a.f88787u.m88249a((Function1) new C39960x(request));
                break;
            case 5:
                this.f88629a.f88787u.m88249a((Function1) new C39962y(request));
                break;
            case 6:
                this.f88629a.f88787u.m88249a((Function1) new C39964z(request));
                break;
            case 7:
                this.f88629a.f88787u.m88249a((Function1) new C39866A(request));
                break;
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onScreenShareForAllUserDisableChanged(String roomId, boolean z11) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        C39934k0 c39934k0 = this.f88629a;
        c39934k0.f88787u.m88249a((Function1) new C39868B(z11, c39934k0));
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onSendMessageForAllUserDisableChanged(String roomId, boolean z11) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        C39934k0 c39934k0 = this.f88629a;
        c39934k0.f88787u.m88249a((Function1) new C39870C(z11, c39934k0));
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onSendMessageForUserDisableChanged(String roomId, String userId, boolean z11) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        C39934k0 c39934k0 = this.f88629a;
        c39934k0.f88787u.m88249a((Function1) new C39872D(c39934k0, userId, z11));
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onUserInfoChanged(TUIRoomDefine.UserInfo userInfo, List modifyFlag) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(modifyFlag, "modifyFlag");
        if (modifyFlag.contains(TUIRoomDefine.UserInfoModifyFlag.USER_ROLE)) {
            C39934k0 c39934k0 = this.f88629a;
            String userID = userInfo.userId;
            Intrinsics.checkNotNullExpressionValue(userID, "userId");
            TUIRoomDefine.Role userRole = userInfo.userRole;
            Intrinsics.checkNotNullExpressionValue(userRole, "userRole");
            ParticipantRole userRole2 = AbstractC39939m0.m88362a(userRole);
            c39934k0.getClass();
            Intrinsics.checkNotNullParameter(userID, "userID");
            Intrinsics.checkNotNullParameter(userRole2, "userRole");
            RoomParticipant roomParticipant = (RoomParticipant) c39934k0.f88781o.get(userID);
            if (roomParticipant != null) {
                RoomParticipant roomParticipantCopy$default = RoomParticipant.copy$default(roomParticipant, null, null, null, null, userRole2, null, null, null, null, false, null, 2031, null);
                c39934k0.m88354a(roomParticipantCopy$default);
                RoomUser roomUser = new RoomUser(roomParticipantCopy$default.getUserID(), roomParticipantCopy$default.getUserName(), roomParticipantCopy$default.getAvatarURL());
                int i11 = AbstractC39876F.f88631a[roomParticipantCopy$default.getRole().ordinal()];
                if (i11 == 1) {
                    c39934k0.f88787u.m88249a((Function1) new C39914a0(roomUser));
                } else if (i11 == 2 && roomParticipant.getRole() == ParticipantRole.ADMIN) {
                    c39934k0.f88787u.m88249a((Function1) new C39916b0(roomUser));
                }
            }
        }
        if (modifyFlag.contains(TUIRoomDefine.UserInfoModifyFlag.NAME_CARD)) {
            C39934k0 c39934k1 = this.f88629a;
            String userID2 = userInfo.userId;
            Intrinsics.checkNotNullExpressionValue(userID2, "userId");
            String nameCard = userInfo.nameCard;
            Intrinsics.checkNotNullExpressionValue(nameCard, "nameCard");
            c39934k1.getClass();
            Intrinsics.checkNotNullParameter(userID2, "userID");
            Intrinsics.checkNotNullParameter(nameCard, "nameCard");
            RoomParticipant roomParticipant2 = (RoomParticipant) c39934k1.f88781o.get(userID2);
            if (roomParticipant2 != null) {
                c39934k1.m88354a(RoomParticipant.copy$default(roomParticipant2, null, null, null, nameCard, null, null, null, null, null, false, null, 2039, null));
            }
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onUserNetworkQualityChanged(Map networkMap) {
        Object value;
        LinkedHashMap linkedHashMap;
        NetworkQuality networkQuality;
        Intrinsics.checkNotNullParameter(networkMap, "networkMap");
        InterfaceC41669n interfaceC41669n = this.f88629a.f88774h;
        do {
            value = interfaceC41669n.getValue();
            linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(networkMap.size()));
            for (Map.Entry entry : networkMap.entrySet()) {
                Object key = entry.getKey();
                TUICommonDefine.NetworkInfo networkInfo = (TUICommonDefine.NetworkInfo) entry.getValue();
                Intrinsics.checkNotNullParameter(networkInfo, "networkInfo");
                String str = networkInfo.userId;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                TUICommonDefine.NetworkQuality networkQuality2 = networkInfo.quality;
                Intrinsics.checkNotNullExpressionValue(networkQuality2, "quality");
                Intrinsics.checkNotNullParameter(networkQuality2, "networkQuality");
                switch (AbstractC39651h.f88088e[networkQuality2.ordinal()]) {
                    case 1:
                        networkQuality = NetworkQuality.UNKNOWN;
                        break;
                    case 2:
                        networkQuality = NetworkQuality.EXCELLENT;
                        break;
                    case 3:
                        networkQuality = NetworkQuality.GOOD;
                        break;
                    case 4:
                        networkQuality = NetworkQuality.POOR;
                        break;
                    case 5:
                        networkQuality = NetworkQuality.BAD;
                        break;
                    case 6:
                        networkQuality = NetworkQuality.VERY_BAD;
                        break;
                    case 7:
                        networkQuality = NetworkQuality.DOWN;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                linkedHashMap.put(key, new NetworkInfo(str2, networkQuality, networkInfo.upLoss, networkInfo.downLoss, networkInfo.delay));
            }
        } while (!interfaceC41669n.compareAndSet(value, MapsKt.toMutableMap(linkedHashMap)));
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onUserAudioStateChanged(String userId, boolean z11, TUIRoomDefine.ChangeReason reason) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(reason, "reason");
        C39934k0.m88350a(this.f88629a, userId, EnumC39906U0.AUDIO, z11);
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onUserVideoStateChanged(String userId, TUIRoomDefine.VideoStreamType streamType, boolean z11, TUIRoomDefine.ChangeReason reason) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(streamType, "streamType");
        Intrinsics.checkNotNullParameter(reason, "reason");
        int i11 = AbstractC39929i.f88754a[streamType.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            C39934k0.m88350a(this.f88629a, userId, EnumC39906U0.SCREEN_SHARE, z11);
            return;
        }
        C39934k0.m88350a(this.f88629a, userId, EnumC39906U0.VIDEO, z11);
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onUserVoiceVolumeChanged(Map volumeMap) {
        Object value;
        Intrinsics.checkNotNullParameter(volumeMap, "volumeMap");
        InterfaceC41669n interfaceC41669n = this.f88629a.f88773g;
        do {
            value = interfaceC41669n.getValue();
        } while (!interfaceC41669n.compareAndSet(value, MapsKt.toMutableMap(volumeMap)));
    }
}
