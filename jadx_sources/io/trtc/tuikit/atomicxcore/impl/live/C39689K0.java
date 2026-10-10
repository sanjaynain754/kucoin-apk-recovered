package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.live.MetaDataCompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import java.util.HashMap;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.K0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39689K0 implements TUIRoomDefine.GetRoomMetadataCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39695N0 f88171a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MetaDataCompletionHandler f88172b;

    public C39689K0(C39695N0 c39695n0, MetaDataCompletionHandler metaDataCompletionHandler) {
        this.f88171a = c39695n0;
        this.f88172b = metaDataCompletionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.GetRoomMetadataCallback
    public final void onError(TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        C39510r c39510r = this.f88171a.f88203d;
        String message2 = "queryMetaData onError: " + error + ", " + message;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c39510r.m88251a(2, message2);
        MetaDataCompletionHandler metaDataCompletionHandler = this.f88172b;
        if (metaDataCompletionHandler != null) {
            metaDataCompletionHandler.onFailure(error.getValue(), message);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.GetRoomMetadataCallback
    public final void onSuccess(HashMap map) {
        C39510r c39510r = this.f88171a.f88203d;
        String message = "queryMetaData onSuccess,metadata:" + map;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        MetaDataCompletionHandler metaDataCompletionHandler = this.f88172b;
        if (metaDataCompletionHandler != 0) {
            if (map == null) {
                map = new HashMap();
            }
            metaDataCompletionHandler.onSuccess(map);
        }
    }
}
