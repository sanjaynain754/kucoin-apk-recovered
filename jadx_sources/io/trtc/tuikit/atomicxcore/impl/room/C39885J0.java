package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager;
import io.trtc.tuikit.atomicxcore.api.room.CallUserToRoomCompletionHandler;
import io.trtc.tuikit.atomicxcore.api.room.RoomCallResult;
import java.util.LinkedHashMap;
import java.util.Map;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.J0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39885J0 implements TUIConferenceInvitationManager.InviteUsersCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CallUserToRoomCompletionHandler f88643a;

    public C39885J0(CallUserToRoomCompletionHandler callUserToRoomCompletionHandler) {
        this.f88643a = callUserToRoomCompletionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager.InviteUsersCallback
    public final void onError(TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        CallUserToRoomCompletionHandler callUserToRoomCompletionHandler = this.f88643a;
        if (callUserToRoomCompletionHandler != null) {
            callUserToRoomCompletionHandler.onFailure(error.getValue(), message);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager.InviteUsersCallback
    public final void onSuccess(Map resultMap) {
        RoomCallResult roomCallResult;
        Intrinsics.checkNotNullParameter(resultMap, "resultMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(resultMap.size()));
        for (Map.Entry entry : resultMap.entrySet()) {
            Object key = entry.getKey();
            TUIConferenceInvitationManager.InvitationCode code = (TUIConferenceInvitationManager.InvitationCode) entry.getValue();
            Intrinsics.checkNotNullParameter(code, "code");
            int i11 = AbstractC39936l0.f88799e[code.ordinal()];
            if (i11 == 1) {
                roomCallResult = RoomCallResult.SUCCESS;
            } else if (i11 == 2) {
                roomCallResult = RoomCallResult.ALREADY_IN_CALLING;
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                roomCallResult = RoomCallResult.ALREADY_IN_ROOM;
            }
            linkedHashMap.put(key, roomCallResult);
        }
        CallUserToRoomCompletionHandler callUserToRoomCompletionHandler = this.f88643a;
        if (callUserToRoomCompletionHandler != null) {
            callUserToRoomCompletionHandler.onSuccess(MapsKt.toMutableMap(linkedHashMap));
        }
    }
}
