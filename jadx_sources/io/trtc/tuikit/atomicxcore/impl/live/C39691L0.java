package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.L0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39691L0 implements TUIRoomDefine.ActionCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39695N0 f88175a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f88176b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CompletionHandler f88177c;

    public C39691L0(C39695N0 c39695n0, List list, CompletionHandler completionHandler) {
        this.f88175a = c39695n0;
        this.f88176b = list;
        this.f88177c = completionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.ActionCallback
    public final void onError(TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        C39510r c39510r = this.f88175a.f88203d;
        String message2 = "updateLiveInfo onError: " + error + ", " + message;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c39510r.m88251a(2, message2);
        CompletionHandler completionHandler = this.f88177c;
        if (completionHandler != null) {
            completionHandler.onFailure(error.getValue(), message);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.ActionCallback
    public final void onSuccess() {
        C39510r c39510r = this.f88175a.f88203d;
        String message = "updateLiveInfo onSuccess,modifyFlagList:" + this.f88176b;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        CompletionHandler completionHandler = this.f88177c;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
