package io.trtc.tuikit.atomicxcore.impl.common;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.common.c */
/* JADX INFO: loaded from: classes61.dex */
public final class C39495c implements TUIRoomDefine.ActionCallback {

    /* JADX INFO: renamed from: a */
    public final CompletionHandler f87681a;

    /* JADX INFO: renamed from: b */
    public final Function0 f87682b;

    /* JADX INFO: renamed from: c */
    public final Function2 f87683c;

    public C39495c(CompletionHandler completionHandler, Function0 success, Function2 error, int i11) {
        completionHandler = (i11 & 1) != 0 ? null : completionHandler;
        success = (i11 & 2) != 0 ? C39493a.f87679a : success;
        error = (i11 & 4) != 0 ? C39494b.f87680a : error;
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f87681a = completionHandler;
        this.f87682b = success;
        this.f87683c = error;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.ActionCallback
    public final void onError(TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f87683c.invoke(error, message);
        CompletionHandler completionHandler = this.f87681a;
        if (completionHandler != null) {
            completionHandler.onFailure(error.getValue(), message);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.ActionCallback
    public final void onSuccess() {
        this.f87682b.invoke();
        CompletionHandler completionHandler = this.f87681a;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
