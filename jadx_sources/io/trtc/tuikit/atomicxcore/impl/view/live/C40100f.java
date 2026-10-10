package io.trtc.tuikit.atomicxcore.impl.view.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUILiveListManager;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfoCompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.deprecated.LiveCoreViewDeprecated;
import io.trtc.tuikit.atomicxcore.impl.live.AbstractC39778u0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.f */
/* JADX INFO: loaded from: classes61.dex */
public final class C40100f implements LiveInfoCompletionHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LiveCoreViewDeprecated f89193a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TUILiveListManager.LiveInfoCallback f89194b;

    public C40100f(LiveCoreViewDeprecated liveCoreViewDeprecated, TUILiveListManager.LiveInfoCallback liveInfoCallback) {
        this.f89193a = liveCoreViewDeprecated;
        this.f89194b = liveInfoCallback;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveInfoCompletionHandler
    public final void onFailure(int i11, String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        this.f89193a.getCallbackHandler().m88489b(this.f89193a.getLiveId());
        TUILiveListManager.LiveInfoCallback liveInfoCallback = this.f89194b;
        if (liveInfoCallback != null) {
            liveInfoCallback.onError(TUICommonDefine.Error.fromInt(i11), desc);
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveInfoCompletionHandler
    public final void onSuccess(LiveInfo liveInfo) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        this.f89193a.getCoreStateProvider().m88479a(liveInfo);
        TUILiveListManager.LiveInfoCallback liveInfoCallback = this.f89194b;
        if (liveInfoCallback != null) {
            liveInfoCallback.onSuccess(AbstractC39778u0.m88329a(liveInfo));
        }
    }
}
