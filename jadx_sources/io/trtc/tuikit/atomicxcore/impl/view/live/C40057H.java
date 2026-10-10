package io.trtc.tuikit.atomicxcore.impl.view.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.view.LiveCoreView;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.H */
/* JADX INFO: loaded from: classes61.dex */
public final class C40057H implements TUIRoomDefine.PlayCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LiveCoreView f89113a;

    public C40057H(LiveCoreView liveCoreView) {
        this.f89113a = liveCoreView;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.PlayCallback
    public final void onLoading(String str) {
        C39510r logger = this.f89113a.getLogger();
        String message = "oid:" + this.f89113a.getOid() + ", onLoading:userId" + str;
        logger.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        logger.m88251a(0, message);
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.PlayCallback
    public final void onPlayError(String str, TUICommonDefine.Error error, String str2) {
        C39510r logger = this.f89113a.getLogger();
        String message = "oid:" + this.f89113a.getOid() + ", onPlayError:userId" + str + ", error" + error + ", message" + str2;
        logger.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        logger.m88251a(2, message);
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.PlayCallback
    public final void onPlaying(String str) {
        C39510r logger = this.f89113a.getLogger();
        String message = "oid:" + this.f89113a.getOid() + ", onPlaying:userId" + str;
        logger.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        logger.m88251a(0, message);
    }
}
