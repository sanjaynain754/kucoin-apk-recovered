package io.trtc.tuikit.atomicxcore.impl.view.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.r */
/* JADX INFO: loaded from: classes61.dex */
public final class C40129r implements CompletionHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TUIRoomDefine.ActionCallback f89259a;

    public C40129r(TUIRoomDefine.ActionCallback actionCallback) {
        this.f89259a = actionCallback;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
    public final void onFailure(int i11, String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        TUIRoomDefine.ActionCallback actionCallback = this.f89259a;
        if (actionCallback != null) {
            actionCallback.onError(TUICommonDefine.Error.fromInt(i11), desc);
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
    public final void onSuccess() {
        TUIRoomDefine.ActionCallback actionCallback = this.f89259a;
        if (actionCallback != null) {
            actionCallback.onSuccess();
        }
    }
}
