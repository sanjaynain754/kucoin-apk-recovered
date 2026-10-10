package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUILiveListManager;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfoCompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.F0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39679F0 implements TUILiveListManager.LiveInfoCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39695N0 f88153a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LiveInfoCompletionHandler f88154b;

    public C39679F0(C39695N0 c39695n0, LiveInfoCompletionHandler liveInfoCompletionHandler) {
        this.f88153a = c39695n0;
        this.f88154b = liveInfoCompletionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveListManager.LiveInfoCallback
    public final void onError(TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        C39510r c39510r = this.f88153a.f88203d;
        String message2 = "getLiveInfo onError: " + error + ", " + message;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c39510r.m88251a(2, message2);
        LiveInfoCompletionHandler liveInfoCompletionHandler = this.f88154b;
        if (liveInfoCompletionHandler != null) {
            liveInfoCompletionHandler.onFailure(error.getValue(), message);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveListManager.LiveInfoCallback
    public final void onSuccess(TUILiveListManager.LiveInfo liveInfo) {
        C39510r c39510r = this.f88153a.f88203d;
        String message = "getLiveInfo onSuccess,liveInfo:" + liveInfo;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        LiveInfo liveInfo2 = new LiveInfo(null, null, null, false, false, false, false, 0, null, 0, null, null, null, 0, null, 0L, 0, false, null, 524287, null);
        if (liveInfo != null) {
            liveInfo2 = AbstractC39778u0.m88330a(liveInfo);
        }
        LiveInfoCompletionHandler liveInfoCompletionHandler = this.f88154b;
        if (liveInfoCompletionHandler != null) {
            liveInfoCompletionHandler.onSuccess(liveInfo2);
        }
    }
}
