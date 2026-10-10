package io.trtc.tuikit.atomicxcore.impl.call;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.call.n */
/* JADX INFO: loaded from: classes61.dex */
public final class C39482n implements TUICommonDefine.ValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CompletionHandler f87653a;

    public C39482n(CompletionHandler completionHandler) {
        this.f87653a = completionHandler;
    }

    @Override // com.tencent.cloud.tuikit.engine.common.TUICommonDefine.ValueCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f87653a;
        if (completionHandler != null) {
            if (str == null) {
                str = "";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.common.TUICommonDefine.ValueCallback
    public final void onSuccess(Object obj) {
        CompletionHandler completionHandler = this.f87653a;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
