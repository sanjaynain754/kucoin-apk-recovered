package io.trtc.tuikit.atomicxcore.impl.call;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.core.app.FrameMetricsAggregator;
import com.tencent.cloud.tuikit.engine.call.TUICallDefine;
import com.tencent.cloud.tuikit.engine.call.TUICallObserver;
import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import io.trtc.tuikit.atomicxcore.api.call.CallInfo;
import io.trtc.tuikit.atomicxcore.api.call.CallParticipantInfo;
import io.trtc.tuikit.atomicxcore.api.call.CallParticipantStatus;
import io.trtc.tuikit.atomicxcore.api.device.DeviceFocusOwner;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import io.trtc.tuikit.atomicxcore.api.device.NetworkQuality;
import io.trtc.tuikit.atomicxcore.impl.device.AbstractC39651h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.call.h */
/* JADX INFO: loaded from: classes61.dex */
public final class C39476h extends TUICallObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39491w f87642a;

    public C39476h(C39491w c39491w) {
        this.f87642a = c39491w;
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallObserver
    public final void onCallBegin(String str, TUICallDefine.MediaType mediaType, TUICallDefine.CallObserverExtraInfo callObserverExtraInfo) {
        Object value;
        CallInfo callInfo;
        String str2;
        String str3;
        Object value2;
        ArrayList arrayList;
        Object value3;
        TUICommonDefine.RoomId roomId;
        String message = "onCallBegin, callId: " + str + " mediaType: " + mediaType + " info: " + callObserverExtraInfo;
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC39492x.m88243a(0, message);
        InterfaceC41669n interfaceC41669n = this.f87642a.f87671d;
        do {
            value = interfaceC41669n.getValue();
            callInfo = (CallInfo) value;
            str2 = "";
            if (str != null) {
                str2 = str;
            }
            String str4 = null;
            String str5 = callObserverExtraInfo != null ? callObserverExtraInfo.chatGroupId : null;
            if (str5 == null) {
                str3 = "";
            } else {
                Intrinsics.checkNotNull(str5);
                str3 = str5;
            }
            if (callObserverExtraInfo != null && (roomId = callObserverExtraInfo.roomId) != null) {
                str4 = roomId.strRoomId;
            }
            if (str4 != null) {
                Intrinsics.checkNotNull(str4);
                str2 = str4;
            }
        } while (!interfaceC41669n.compareAndSet(value, CallInfo.copy$default(callInfo, str2, str2, null, null, str3, AbstractC39470b.m88239a(mediaType), null, System.currentTimeMillis(), 0L, 332, null)));
        C39491w c39491w = this.f87642a;
        InterfaceC41669n interfaceC41669n2 = c39491w.f87675h;
        do {
            value2 = interfaceC41669n2.getValue();
            LinkedHashSet<CallParticipantInfo> linkedHashSet = (LinkedHashSet) value2;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(linkedHashSet, 10));
            for (CallParticipantInfo callParticipantInfoCopy$default : linkedHashSet) {
                if (Intrinsics.areEqual(callParticipantInfoCopy$default.getId(), ((CallParticipantInfo) c39491w.f87673f.getValue()).getId())) {
                    callParticipantInfoCopy$default = CallParticipantInfo.copy$default(callParticipantInfoCopy$default, null, null, null, null, CallParticipantStatus.Accept, false, false, 111, null);
                }
                arrayList.add(callParticipantInfoCopy$default);
            }
        } while (!interfaceC41669n2.compareAndSet(value2, (LinkedHashSet) CollectionsKt.toCollection(arrayList, new LinkedHashSet())));
        InterfaceC41669n interfaceC41669n3 = this.f87642a.f87673f;
        do {
            value3 = interfaceC41669n3.getValue();
        } while (!interfaceC41669n3.compareAndSet(value3, CallParticipantInfo.copy$default((CallParticipantInfo) value3, null, null, null, null, CallParticipantStatus.Accept, false, false, 111, null)));
        C39491w c39491w2 = this.f87642a;
        if (c39491w2.f87669b == null) {
            HandlerThread handlerThread = new HandlerThread("call-duration-timer");
            c39491w2.f87669b = handlerThread;
            handlerThread.start();
            HandlerThread handlerThread2 = c39491w2.f87669b;
            Intrinsics.checkNotNull(handlerThread2);
            c39491w2.f87670c = new Handler(handlerThread2.getLooper());
        }
        RunnableC39489u runnableC39489u = new RunnableC39489u(c39491w2);
        Handler handler = c39491w2.f87670c;
        if (handler != null) {
            handler.post(runnableC39489u);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallObserver
    public final void onCallEnd(String str, TUICallDefine.MediaType mediaType, TUICallDefine.CallEndReason callEndReason, String str2, long j11, TUICallDefine.CallObserverExtraInfo callObserverExtraInfo) {
        String message = "onCallEnd, callId: " + str + " mediaType: " + mediaType + " reason: " + callEndReason + " userId: " + str2 + " totalTime: " + j11 + " info: " + callObserverExtraInfo;
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC39492x.m88243a(0, message);
        this.f87642a.f87674g.m88249a((Function1) new C39473e(str, mediaType, callEndReason, str2));
        C39491w.m88240a(this.f87642a);
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallObserver
    public final void onCallMediaTypeChanged(TUICallDefine.MediaType oldMediaType, TUICallDefine.MediaType newMediaType) {
        Object value;
        CallInfo callInfoCopy$default;
        Intrinsics.checkNotNullParameter(oldMediaType, "oldMediaType");
        Intrinsics.checkNotNullParameter(newMediaType, "newMediaType");
        String message = "onCallMediaTypeChanged, oldMediaType: " + oldMediaType + " newMediaType: " + newMediaType;
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC39492x.m88243a(0, message);
        InterfaceC41669n interfaceC41669n = this.f87642a.f87671d;
        do {
            value = interfaceC41669n.getValue();
            callInfoCopy$default = (CallInfo) value;
            if (oldMediaType != newMediaType) {
                callInfoCopy$default = CallInfo.copy$default(callInfoCopy$default, null, null, null, null, null, AbstractC39470b.m88239a(newMediaType), null, 0L, 0L, 479, null);
            }
        } while (!interfaceC41669n.compareAndSet(value, callInfoCopy$default));
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallObserver
    public final void onCallNotConnected(String str, TUICallDefine.MediaType mediaType, TUICallDefine.CallEndReason callEndReason, String str2, TUICallDefine.CallObserverExtraInfo callObserverExtraInfo) {
        String message = "onCallNotConnected, callId: " + str + " mediaType: " + mediaType + " reason: " + callEndReason + " userId: " + str2 + " info: " + callObserverExtraInfo;
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC39492x.m88243a(0, message);
        this.f87642a.f87674g.m88249a((Function1) new C39474f(str, mediaType, callEndReason, str2));
        C39491w.m88240a(this.f87642a);
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallObserver
    public final void onCallReceived(String str, String str2, List list, TUICallDefine.MediaType mediaType, TUICallDefine.CallObserverExtraInfo callObserverExtraInfo) {
        Object value;
        String message = "onCallReceived, callId: " + str + " callerId: " + str2 + " calleeIdList: " + list + " mediaType: " + mediaType + " info: " + callObserverExtraInfo;
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC39492x.m88243a(0, message);
        if (TUICallDefine.MediaType.Unknown == mediaType || list == null || list.isEmpty()) {
            Intrinsics.checkNotNullParameter("mediaType is unknown or calleeIdList is empty", "message");
            AbstractC39492x.m88243a(2, "mediaType is unknown or calleeIdList is empty");
            return;
        }
        if (list.size() >= 9) {
            Intrinsics.checkNotNullParameter("The user is limited to 9. For larger conference calls, try using TUIRoomKit", "message");
            AbstractC39492x.m88243a(2, "The user is limited to 9. For larger conference calls, try using TUIRoomKit");
            return;
        }
        DeviceStore.INSTANCE.shared().setFocus$atomicxcore_release(DeviceFocusOwner.CALL);
        if (str2 != null && str2.length() != 0) {
            C39491w.m88242a(this.f87642a, str2, CallParticipantStatus.Waiting);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C39491w.m88242a(this.f87642a, (String) it.next(), CallParticipantStatus.Waiting);
        }
        InterfaceC41669n interfaceC41669n = this.f87642a.f87673f;
        do {
            value = interfaceC41669n.getValue();
        } while (!interfaceC41669n.compareAndSet(value, CallParticipantInfo.copy$default((CallParticipantInfo) value, null, null, null, null, CallParticipantStatus.Waiting, false, false, 111, null)));
        InterfaceC41669n interfaceC41669n2 = this.f87642a.f87671d;
        CallInfo callInfo = new CallInfo(null, null, null, null, null, null, null, 0L, 0L, FrameMetricsAggregator.EVERY_DURATION, null);
        if (str != null && str.length() != 0) {
            callInfo.setCallId(str);
        }
        if (str2 != null && str2.length() != 0) {
            callInfo.setInviterId(str2);
        }
        if (mediaType != null) {
            callInfo.setMediaType(AbstractC39470b.m88239a(mediaType));
        }
        if ((callObserverExtraInfo != null ? callObserverExtraInfo.roomId : null) != null) {
            String str3 = callObserverExtraInfo.roomId.strRoomId;
            if (str3 == null) {
                str3 = "";
            } else {
                Intrinsics.checkNotNull(str3);
            }
            callInfo.setRoomId(str3);
        }
        if ((callObserverExtraInfo != null ? callObserverExtraInfo.chatGroupId : null) != null) {
            String chatGroupId = callObserverExtraInfo.chatGroupId;
            Intrinsics.checkNotNullExpressionValue(chatGroupId, "chatGroupId");
            callInfo.setChatGroupId(chatGroupId);
        }
        callInfo.setInviteeIds((LinkedHashSet) CollectionsKt.toCollection(CollectionsKt.filterNotNull(list), new LinkedHashSet()));
        interfaceC41669n2.setValue(callInfo);
        this.f87642a.f87674g.m88249a((Function1) new C39475g(str, mediaType, callObserverExtraInfo));
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallObserver
    public final void onKickedOffline() {
        Intrinsics.checkNotNullParameter("onKickedOffline", "message");
        AbstractC39492x.m88243a(0, "onKickedOffline");
        this.f87642a.hangup(null);
        C39491w.m88240a(this.f87642a);
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallObserver
    public final void onUserAudioAvailable(String userId, boolean z11) {
        boolean z12 = z11;
        Intrinsics.checkNotNullParameter(userId, "userId");
        String message = "onUserAudioAvailable, userId: " + userId + ", isAudioAvailable: " + z12;
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC39492x.m88243a(0, message);
        InterfaceC41669n interfaceC41669n = this.f87642a.f87675h;
        while (true) {
            Object value = interfaceC41669n.getValue();
            LinkedHashSet<CallParticipantInfo> linkedHashSet = (LinkedHashSet) value;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(linkedHashSet, 10));
            for (CallParticipantInfo callParticipantInfoCopy$default : linkedHashSet) {
                if (Intrinsics.areEqual(callParticipantInfoCopy$default.getId(), userId) && callParticipantInfoCopy$default.isMicrophoneOpened() != z12) {
                    callParticipantInfoCopy$default = CallParticipantInfo.copy$default(callParticipantInfoCopy$default, null, null, null, null, null, z11, false, 95, null);
                    z12 = z11;
                }
                arrayList.add(callParticipantInfoCopy$default);
            }
            if (interfaceC41669n.compareAndSet(value, (LinkedHashSet) CollectionsKt.toCollection(arrayList, new LinkedHashSet()))) {
                break;
            } else {
                z12 = z11;
            }
        }
        if (!Intrinsics.areEqual(userId, ((CallParticipantInfo) this.f87642a.f87673f.getValue()).getId()) || ((CallParticipantInfo) this.f87642a.f87673f.getValue()).isMicrophoneOpened() == z12) {
            return;
        }
        InterfaceC41669n interfaceC41669n2 = this.f87642a.f87673f;
        while (true) {
            Object value2 = interfaceC41669n2.getValue();
            if (interfaceC41669n2.compareAndSet(value2, CallParticipantInfo.copy$default((CallParticipantInfo) value2, null, null, null, null, null, z12, false, 95, null))) {
                return;
            } else {
                z12 = z11;
            }
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallObserver
    public final void onUserInviting(String str) {
        String message = "onUserInviting, userId: " + str;
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC39492x.m88243a(0, message);
        C39491w.m88242a(this.f87642a, str, CallParticipantStatus.Waiting);
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallObserver
    public final void onUserJoin(String str) {
        String message = "onUserJoin, userId: " + str;
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC39492x.m88243a(0, message);
        if (str == null || str.length() == 0) {
            return;
        }
        C39491w.m88242a(this.f87642a, str, CallParticipantStatus.Accept);
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallObserver
    public final void onUserLeave(String str) {
        String message = "onUserLeave, userId: " + str;
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC39492x.m88243a(0, message);
        C39491w.m88241a(this.f87642a, str);
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallObserver
    public final void onUserLineBusy(String str) {
        String message = "onUserLineBusy, userId: " + str;
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC39492x.m88243a(0, message);
        C39491w.m88241a(this.f87642a, str);
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallObserver
    public final void onUserNetworkQualityChanged(List list) {
        Object value;
        Map mutableMap;
        NetworkQuality networkQuality;
        if (list == null || list.isEmpty()) {
            return;
        }
        InterfaceC41669n interfaceC41669n = this.f87642a.f87677j;
        do {
            value = interfaceC41669n.getValue();
            mutableMap = MapsKt.toMutableMap((Map) value);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TUICommonDefine.NetworkQualityInfo networkQualityInfo = (TUICommonDefine.NetworkQualityInfo) it.next();
                String userId = networkQualityInfo.userId;
                Intrinsics.checkNotNullExpressionValue(userId, "userId");
                TUICommonDefine.NetworkQuality networkQuality2 = networkQualityInfo.quality;
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
                mutableMap.put(userId, networkQuality);
            }
        } while (!interfaceC41669n.compareAndSet(value, mutableMap));
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallObserver
    public final void onUserNoResponse(String str) {
        String message = "onUserNoResponse, userId: " + str;
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC39492x.m88243a(0, message);
        C39491w.m88241a(this.f87642a, str);
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallObserver
    public final void onUserReject(String str) {
        String message = "onUserReject, userId: " + str;
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC39492x.m88243a(0, message);
        C39491w.m88241a(this.f87642a, str);
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallObserver
    public final void onUserSigExpired() {
        Intrinsics.checkNotNullParameter("onUserSigExpired", "message");
        AbstractC39492x.m88243a(0, "onUserSigExpired");
        this.f87642a.hangup(null);
        C39491w.m88240a(this.f87642a);
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallObserver
    public final void onUserVideoAvailable(String userId, boolean z11) {
        boolean z12 = z11;
        Intrinsics.checkNotNullParameter(userId, "userId");
        String message = "onUserVideoAvailable, userId: " + userId + ", isVideoAvailable: " + z12;
        Intrinsics.checkNotNullParameter(message, "message");
        AbstractC39492x.m88243a(0, message);
        InterfaceC41669n interfaceC41669n = this.f87642a.f87675h;
        while (true) {
            Object value = interfaceC41669n.getValue();
            LinkedHashSet<CallParticipantInfo> linkedHashSet = (LinkedHashSet) value;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(linkedHashSet, 10));
            for (CallParticipantInfo callParticipantInfoCopy$default : linkedHashSet) {
                if (Intrinsics.areEqual(callParticipantInfoCopy$default.getId(), userId) && callParticipantInfoCopy$default.isCameraOpened() != z12) {
                    callParticipantInfoCopy$default = CallParticipantInfo.copy$default(callParticipantInfoCopy$default, null, null, null, null, null, false, z11, 63, null);
                    z12 = z11;
                }
                arrayList.add(callParticipantInfoCopy$default);
            }
            if (interfaceC41669n.compareAndSet(value, (LinkedHashSet) CollectionsKt.toCollection(arrayList, new LinkedHashSet()))) {
                break;
            } else {
                z12 = z11;
            }
        }
        if (!Intrinsics.areEqual(userId, ((CallParticipantInfo) this.f87642a.f87673f.getValue()).getId()) || ((CallParticipantInfo) this.f87642a.f87673f.getValue()).isCameraOpened() == z12) {
            return;
        }
        InterfaceC41669n interfaceC41669n2 = this.f87642a.f87673f;
        while (true) {
            Object value2 = interfaceC41669n2.getValue();
            if (interfaceC41669n2.compareAndSet(value2, CallParticipantInfo.copy$default((CallParticipantInfo) value2, null, null, null, null, null, false, z12, 63, null))) {
                return;
            } else {
                z12 = z11;
            }
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallObserver
    public final void onUserVoiceVolumeChanged(Map map) {
        if (map != null) {
            this.f87642a.f87676i.setValue(map);
        }
    }
}
