package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.M0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39693M0 implements TUIRoomDefine.ActionCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39695N0 f88194a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f88195b;

    public C39693M0(C39695N0 c39695n0, CompletionHandler completionHandler) {
        this.f88194a = c39695n0;
        this.f88195b = completionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.ActionCallback
    public final void onError(TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        C39510r c39510r = this.f88194a.f88203d;
        String message2 = "updateLiveMetaData onError: " + error + ", " + message;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c39510r.m88251a(2, message2);
        CompletionHandler completionHandler = this.f88195b;
        if (completionHandler != null) {
            completionHandler.onFailure(error.getValue(), message);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.ActionCallback
    public final void onSuccess() {
        AbstractC39465b.m88232a(this.f88194a.f88203d, "updateLiveMetaData onSuccess", "message", 0, "updateLiveMetaData onSuccess");
        CompletionHandler completionHandler = this.f88195b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
