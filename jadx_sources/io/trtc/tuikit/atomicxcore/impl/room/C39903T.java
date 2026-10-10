package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.impl.room.log.C39937a;
import kotlinx.coroutines.C41716o;
import p852kotlin.Result;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.T */
/* JADX INFO: loaded from: classes61.dex */
public final class C39903T implements TUIRoomDefine.GetUserInfoCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C41716o f88692a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39934k0 f88693b;

    public C39903T(C41716o c41716o, C39934k0 c39934k0) {
        this.f88692a = c41716o;
        this.f88693b = c39934k0;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.GetUserInfoCallback
    public final void onError(TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        C39937a c39937a = this.f88693b.f88776j;
        String message2 = "getRoomUser onError: " + error + ", " + message;
        c39937a.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c39937a.m88357a(2, message2);
        this.f88692a.resumeWith(Result.m103844constructorimpl(""));
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.GetUserInfoCallback
    public final void onSuccess(TUIRoomDefine.UserInfo userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        C41716o c41716o = this.f88692a;
        Result.Companion companion = Result.INSTANCE;
        c41716o.resumeWith(Result.m103844constructorimpl(userInfo.nameCard));
    }
}
