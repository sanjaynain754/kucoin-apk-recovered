package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.room.CreateRoomOptions;
import io.trtc.tuikit.atomicxcore.impl.room.log.C39937a;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.K0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39887K0 implements TUIRoomDefine.ActionCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39904T0 f88647a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f88648b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CreateRoomOptions f88649c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CompletionHandler f88650d;

    public C39887K0(C39904T0 c39904t0, String str, CreateRoomOptions createRoomOptions, CompletionHandler completionHandler) {
        this.f88647a = c39904t0;
        this.f88648b = str;
        this.f88649c = createRoomOptions;
        this.f88650d = completionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.ActionCallback
    public final void onError(TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        C39937a c39937a = this.f88647a.f88698d;
        String message2 = "createRoom onError: " + error + ", " + message;
        c39937a.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c39937a.m88357a(2, message2);
        CompletionHandler completionHandler = this.f88650d;
        if (completionHandler != null) {
            completionHandler.onFailure(error.getValue(), message);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.ActionCallback
    public final void onSuccess() {
        C39937a c39937a = this.f88647a.f88698d;
        c39937a.getClass();
        Intrinsics.checkNotNullParameter("createRoom onSuccess", "message");
        c39937a.m88357a(0, "createRoom onSuccess");
        this.f88647a.joinRoom(this.f88648b, this.f88649c.getPassword(), this.f88650d);
    }
}
