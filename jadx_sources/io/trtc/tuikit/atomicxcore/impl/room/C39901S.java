package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.impl.room.log.C39937a;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.SafeContinuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.S */
/* JADX INFO: loaded from: classes61.dex */
public final class C39901S implements TUIRoomDefine.GetUserListCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SafeContinuation f88689a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39934k0 f88690b;

    public C39901S(SafeContinuation safeContinuation, C39934k0 c39934k0) {
        this.f88689a = safeContinuation;
        this.f88690b = c39934k0;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.GetUserListCallback
    public final void onError(TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        C39937a c39937a = this.f88690b.f88776j;
        String message2 = "fetchUserList, onError error:" + error + ",message:" + message;
        c39937a.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c39937a.m88357a(2, message2);
        SafeContinuation safeContinuation = this.f88689a;
        Result.Companion companion = Result.INSTANCE;
        safeContinuation.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(new C39919d(error.getValue(), message))));
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.GetUserListCallback
    public final void onSuccess(TUIRoomDefine.UserListResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f88689a.resumeWith(Result.m103844constructorimpl(result));
    }
}
