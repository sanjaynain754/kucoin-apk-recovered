package io.trtc.tuikit.atomicxcore.impl.call;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.call.m */
/* JADX INFO: loaded from: classes61.dex */
public final class C39481m implements TUICommonDefine.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CompletionHandler f87652a;

    public C39481m(CompletionHandler completionHandler) {
        this.f87652a = completionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.common.TUICommonDefine.Callback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f87652a;
        if (completionHandler != null) {
            if (str == null) {
                str = "";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.common.TUICommonDefine.Callback
    public final void onSuccess() {
        CompletionHandler completionHandler = this.f87652a;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
