package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.ListResultCompletionHandler;
import io.trtc.tuikit.atomicxcore.api.room.RoomInfo;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.O0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39895O0 implements TUIConferenceListManager.FetchScheduledAttendeesCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f88671a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39904T0 f88672b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ListResultCompletionHandler f88673c;

    public C39895O0(String str, C39904T0 c39904t0, ListResultCompletionHandler listResultCompletionHandler) {
        this.f88671a = str;
        this.f88672b = c39904t0;
        this.f88673c = listResultCompletionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager.FetchScheduledAttendeesCallback
    public final void onError(TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        ListResultCompletionHandler listResultCompletionHandler = this.f88673c;
        if (listResultCompletionHandler != null) {
            listResultCompletionHandler.onFailure(error.getValue(), message);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager.FetchScheduledAttendeesCallback
    public final void onSuccess(TUIConferenceListManager.ScheduledAttendeesResult result) {
        ArrayList arrayList;
        String str;
        ArrayList arrayList2;
        Object obj;
        ArrayList arrayList3;
        Intrinsics.checkNotNullParameter(result, "result");
        List<TUIRoomDefine.UserInfo> scheduleAttendees = result.scheduleAttendees;
        Intrinsics.checkNotNullExpressionValue(scheduleAttendees, "scheduleAttendees");
        ArrayList arrayList4 = new ArrayList();
        for (TUIRoomDefine.UserInfo userInfo : scheduleAttendees) {
            Intrinsics.checkNotNull(userInfo);
            arrayList4.add(AbstractC39939m0.m88368a(userInfo));
        }
        String str2 = result.cursor;
        if (Intrinsics.areEqual(this.f88671a, ((RoomInfo) this.f88672b.f88697c.getValue()).getRoomID())) {
            InterfaceC41669n interfaceC41669n = this.f88672b.f88697c;
            while (true) {
                Object value = interfaceC41669n.getValue();
                RoomInfo roomInfo = (RoomInfo) value;
                arrayList = arrayList4;
                if (interfaceC41669n.compareAndSet(value, roomInfo.copy((32319 & 1) != 0 ? roomInfo.roomID : null, (32319 & 2) != 0 ? roomInfo.roomName : null, (32319 & 4) != 0 ? roomInfo.roomOwner : null, (32319 & 8) != 0 ? roomInfo.participantCount : 0, (32319 & 16) != 0 ? roomInfo.createTime : 0L, (32319 & 32) != 0 ? roomInfo.roomStatus : null, (32319 & 64) != 0 ? roomInfo.scheduledStartTime : 0L, (32319 & 128) != 0 ? roomInfo.scheduledEndTime : 0L, (32319 & 256) != 0 ? roomInfo.startReminderInSeconds : 0, (32319 & 512) != 0 ? roomInfo.scheduleAttendees : arrayList, (32319 & 1024) != 0 ? roomInfo.password : null, (32319 & 2048) != 0 ? roomInfo.isAllMicrophoneDisabled : false, (32319 & 4096) != 0 ? roomInfo.isAllCameraDisabled : false, (32319 & 8192) != 0 ? roomInfo.isAllMessageDisabled : false, (32319 & 16384) != 0 ? roomInfo.isAllScreenShareDisabled : false))) {
                    break;
                } else {
                    arrayList4 = arrayList;
                }
            }
        } else {
            arrayList = arrayList4;
        }
        InterfaceC41669n interfaceC41669n2 = this.f88672b.f88695a;
        String str3 = this.f88671a;
        while (true) {
            Object value2 = interfaceC41669n2.getValue();
            List<RoomInfo> list = (List) value2;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (RoomInfo roomInfoCopy : list) {
                if (Intrinsics.areEqual(roomInfoCopy.getRoomID(), str3)) {
                    obj = value2;
                    arrayList3 = arrayList5;
                    roomInfoCopy = roomInfoCopy.copy((32319 & 1) != 0 ? roomInfoCopy.roomID : null, (32319 & 2) != 0 ? roomInfoCopy.roomName : null, (32319 & 4) != 0 ? roomInfoCopy.roomOwner : null, (32319 & 8) != 0 ? roomInfoCopy.participantCount : 0, (32319 & 16) != 0 ? roomInfoCopy.createTime : 0L, (32319 & 32) != 0 ? roomInfoCopy.roomStatus : null, (32319 & 64) != 0 ? roomInfoCopy.scheduledStartTime : 0L, (32319 & 128) != 0 ? roomInfoCopy.scheduledEndTime : 0L, (32319 & 256) != 0 ? roomInfoCopy.startReminderInSeconds : 0, (32319 & 512) != 0 ? roomInfoCopy.scheduleAttendees : arrayList, (32319 & 1024) != 0 ? roomInfoCopy.password : null, (32319 & 2048) != 0 ? roomInfoCopy.isAllMicrophoneDisabled : false, (32319 & 4096) != 0 ? roomInfoCopy.isAllCameraDisabled : false, (32319 & 8192) != 0 ? roomInfoCopy.isAllMessageDisabled : false, (32319 & 16384) != 0 ? roomInfoCopy.isAllScreenShareDisabled : false);
                } else {
                    obj = value2;
                    arrayList3 = arrayList5;
                }
                ArrayList arrayList6 = arrayList;
                arrayList3.add(roomInfoCopy);
                arrayList5 = arrayList3;
                arrayList = arrayList6;
                str2 = str2;
                value2 = obj;
                str3 = str3;
            }
            str = str2;
            String str4 = str3;
            arrayList2 = arrayList;
            if (interfaceC41669n2.compareAndSet(value2, arrayList5)) {
                break;
            }
            str3 = str4;
            arrayList = arrayList2;
            str2 = str;
        }
        ListResultCompletionHandler listResultCompletionHandler = this.f88673c;
        if (listResultCompletionHandler != null) {
            Intrinsics.checkNotNull(str);
            listResultCompletionHandler.onSuccess(arrayList2, str);
        }
    }
}
