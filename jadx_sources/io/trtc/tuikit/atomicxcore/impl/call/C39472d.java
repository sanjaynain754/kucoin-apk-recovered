package io.trtc.tuikit.atomicxcore.impl.call;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.call.d */
/* JADX INFO: loaded from: classes61.dex */
public final class C39472d implements TUICommonDefine.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CompletionHandler f87630a;

    public C39472d(CompletionHandler completionHandler) {
        this.f87630a = completionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.common.TUICommonDefine.Callback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f87630a;
        if (completionHandler != null) {
            if (str == null) {
                str = "";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.common.TUICommonDefine.Callback
    public final void onSuccess() {
        CompletionHandler completionHandler = this.f87630a;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
