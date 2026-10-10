package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager;
import io.trtc.tuikit.atomicxcore.impl.room.log.C39937a;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.SafeContinuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.P */
/* JADX INFO: loaded from: classes61.dex */
public final class C39896P implements TUIConferenceInvitationManager.GetInvitationListCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SafeContinuation f88674a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39934k0 f88675b;

    public C39896P(SafeContinuation safeContinuation, C39934k0 c39934k0) {
        this.f88674a = safeContinuation;
        this.f88675b = c39934k0;
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager.GetInvitationListCallback
    public final void onError(TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        C39937a c39937a = this.f88675b.f88776j;
        String message2 = "fetchInvitationList, onError error:" + error + ",message:" + message;
        c39937a.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c39937a.m88357a(2, message2);
        SafeContinuation safeContinuation = this.f88674a;
        Result.Companion companion = Result.INSTANCE;
        safeContinuation.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(new C39919d(error.getValue(), message))));
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager.GetInvitationListCallback
    public final void onSuccess(TUIConferenceInvitationManager.InvitationListResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f88674a.resumeWith(Result.m103844constructorimpl(result));
    }
}
