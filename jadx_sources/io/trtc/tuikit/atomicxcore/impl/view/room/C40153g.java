package io.trtc.tuikit.atomicxcore.impl.view.room;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.gift.AbstractC39662a;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.room.g */
/* JADX INFO: loaded from: classes61.dex */
public final class C40153g implements TUIRoomDefine.PlayCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40155i f89297a;

    public C40153g(C40155i c40155i) {
        this.f89297a = c40155i;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.PlayCallback
    public final void onLoading(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        AbstractC39662a.m88299a("startPlayCameraStream onLoading:userId:", userId, this.f89297a.f89300a, "message", 0);
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.PlayCallback
    public final void onPlayError(String userId, TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        C39510r c39510r = this.f89297a.f89300a;
        String message2 = "startPlayCameraStream onPlayError:userId" + userId + ", error" + error + ", message" + message;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c39510r.m88251a(2, message2);
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.PlayCallback
    public final void onPlaying(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        AbstractC39662a.m88299a("startPlayCameraStream onPlaying:userId:", userId, this.f89297a.f89300a, "message", 0);
    }
}
