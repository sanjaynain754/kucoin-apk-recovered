package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUILiveListManager;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfoCompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import java.util.Iterator;
import java.util.Map;
import p852kotlin.Lazy;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.H0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39683H0 implements TUILiveListManager.LiveInfoCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39695N0 f88160a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LiveInfoCompletionHandler f88161b;

    public C39683H0(C39695N0 c39695n0, LiveInfoCompletionHandler liveInfoCompletionHandler) {
        this.f88160a = c39695n0;
        this.f88161b = liveInfoCompletionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveListManager.LiveInfoCallback
    public final void onError(TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        C39510r c39510r = this.f88160a.f88203d;
        String message2 = "joinLive onError: " + error + ", " + message;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c39510r.m88251a(2, message2);
        this.f88160a.m88309a(false);
        LiveInfoCompletionHandler liveInfoCompletionHandler = this.f88161b;
        if (liveInfoCompletionHandler != null) {
            liveInfoCompletionHandler.onFailure(error.getValue(), message);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveListManager.LiveInfoCallback
    public final void onSuccess(TUILiveListManager.LiveInfo engineLiveInfo) {
        Intrinsics.checkNotNullParameter(engineLiveInfo, "engineLiveInfo");
        this.f88160a.f88202c.setValue(AbstractC39778u0.m88330a(engineLiveInfo));
        C39510r c39510r = this.f88160a.f88203d;
        String message = "joinLive onSuccess,liveInfo:" + this.f88160a.f88202c.getValue();
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        Lazy lazy = C39772r1.f88378c;
        C39772r1 c39772r1M88324a = AbstractC39769q1.m88324a();
        LiveInfo liveInfo = (LiveInfo) this.f88160a.f88202c.getValue();
        c39772r1M88324a.getClass();
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        Map map = (Map) c39772r1M88324a.f88379a.get(liveInfo.getLiveID());
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                ((InterfaceC39729d0) ((Map.Entry) it.next()).getValue()).mo88234a(liveInfo);
            }
        }
        LiveInfoCompletionHandler liveInfoCompletionHandler = this.f88161b;
        if (liveInfoCompletionHandler != null) {
            liveInfoCompletionHandler.onSuccess((LiveInfo) this.f88160a.f88202c.getValue());
        }
    }
}
