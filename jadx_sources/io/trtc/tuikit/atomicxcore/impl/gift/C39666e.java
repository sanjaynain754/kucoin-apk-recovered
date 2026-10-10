package io.trtc.tuikit.atomicxcore.impl.gift;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.gift.e */
/* JADX INFO: loaded from: classes61.dex */
public final class C39666e implements TUIRoomDefine.ActionCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39667f f88128a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f88129b;

    public C39666e(C39667f c39667f, CompletionHandler completionHandler) {
        this.f88128a = c39667f;
        this.f88129b = completionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.ActionCallback
    public final void onError(TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        C39510r c39510r = this.f88128a.f88132c;
        String message2 = "Response: sendGift failed code=" + error.getValue() + ", message=" + message;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c39510r.m88251a(2, message2);
        CompletionHandler completionHandler = this.f88129b;
        if (completionHandler != null) {
            completionHandler.onFailure(error.getValue(), message);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.ActionCallback
    public final void onSuccess() {
        AbstractC39465b.m88232a(this.f88128a.f88132c, "Response: sendGift success", "message", 0, "Response: sendGift success");
        CompletionHandler completionHandler = this.f88129b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
