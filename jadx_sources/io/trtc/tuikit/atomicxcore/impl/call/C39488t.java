package io.trtc.tuikit.atomicxcore.impl.call;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.call.t */
/* JADX INFO: loaded from: classes61.dex */
public final class C39488t implements TUICommonDefine.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CompletionHandler f87663a;

    public C39488t(CompletionHandler completionHandler) {
        this.f87663a = completionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.common.TUICommonDefine.Callback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f87663a;
        if (completionHandler != null) {
            if (str == null) {
                str = "";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.common.TUICommonDefine.Callback
    public final void onSuccess() {
        CompletionHandler completionHandler = this.f87663a;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
