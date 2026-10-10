package io.trtc.tuikit.atomicxcore.impl.barrage;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.barrage.c */
/* JADX INFO: loaded from: classes61.dex */
public final class C39466c implements TUIRoomDefine.SendCustomMessageCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39468e f87613a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f87614b;

    public C39466c(C39468e c39468e, CompletionHandler completionHandler) {
        this.f87613a = c39468e;
        this.f87614b = completionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.SendCustomMessageCallback
    public final void onError(TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        C39510r c39510r = this.f87613a.f87619c;
        String message2 = "Response: sendCustomMessage failed code=" + error.getValue() + ", message=" + message;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c39510r.m88251a(2, message2);
        CompletionHandler completionHandler = this.f87614b;
        if (completionHandler != null) {
            completionHandler.onFailure(error.getValue(), message);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.SendCustomMessageCallback
    public final void onSuccess(TUIRoomDefine.RoomCustomMessage roomCustomMessage) {
        AbstractC39465b.m88232a(this.f87613a.f87619c, "Response: sendCustomMessage success", "message", 0, "Response: sendCustomMessage success");
        CompletionHandler completionHandler = this.f87614b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
