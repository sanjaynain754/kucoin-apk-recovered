package io.trtc.tuikit.atomicxcore.impl.barrage;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.barrage.d */
/* JADX INFO: loaded from: classes61.dex */
public final class C39467d implements TUIRoomDefine.SendTextMessageCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39468e f87615a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f87616b;

    public C39467d(C39468e c39468e, CompletionHandler completionHandler) {
        this.f87615a = c39468e;
        this.f87616b = completionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.SendTextMessageCallback
    public final void onError(TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        C39510r c39510r = this.f87615a.f87619c;
        String message2 = "Response: sendTextMessage failed code=" + error.getValue() + ", message=" + message;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c39510r.m88251a(2, message2);
        CompletionHandler completionHandler = this.f87616b;
        if (completionHandler != null) {
            completionHandler.onFailure(error.getValue(), message);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.SendTextMessageCallback
    public final void onSuccess(TUIRoomDefine.RoomTextMessage roomTextMessage) {
        AbstractC39465b.m88232a(this.f87615a.f87619c, "Response: sendTextMessage success", "message", 0, "Response: sendTextMessage success");
        CompletionHandler completionHandler = this.f87616b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
