package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager;
import io.trtc.tuikit.atomicxcore.api.room.GetRoomInfoCompletionHandler;
import io.trtc.tuikit.atomicxcore.api.room.RoomInfo;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.N0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39893N0 implements TUIConferenceListManager.FetchConferenceInfoCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ GetRoomInfoCompletionHandler f88664a;

    public C39893N0(GetRoomInfoCompletionHandler getRoomInfoCompletionHandler) {
        this.f88664a = getRoomInfoCompletionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager.FetchConferenceInfoCallback
    public final void onError(TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        GetRoomInfoCompletionHandler getRoomInfoCompletionHandler = this.f88664a;
        if (getRoomInfoCompletionHandler != null) {
            getRoomInfoCompletionHandler.onFailure(error.getValue(), message);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager.FetchConferenceInfoCallback
    public final void onSuccess(TUIConferenceListManager.ConferenceInfo conference) {
        Intrinsics.checkNotNullParameter(conference, "conference");
        RoomInfo roomInfoM88364a = AbstractC39939m0.m88364a(conference);
        GetRoomInfoCompletionHandler getRoomInfoCompletionHandler = this.f88664a;
        if (getRoomInfoCompletionHandler != null) {
            getRoomInfoCompletionHandler.onSuccess(roomInfoM88364a);
        }
    }
}
