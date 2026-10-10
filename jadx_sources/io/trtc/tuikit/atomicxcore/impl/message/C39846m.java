package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.p128v2.V2TIMMessageExtension;
import com.tencent.imsdk.p128v2.V2TIMMessageExtensionResult;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import java.util.List;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.m */
/* JADX INFO: loaded from: classes61.dex */
public final class C39846m implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CompletionHandler f88554a;

    public C39846m(CompletionHandler completionHandler) {
        this.f88554a = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f88554a;
        if (completionHandler != null) {
            if (str == null) {
                str = "";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        List<V2TIMMessageExtensionResult> list = (List) obj;
        if (list != null) {
            for (V2TIMMessageExtensionResult v2TIMMessageExtensionResult : list) {
                if (v2TIMMessageExtensionResult.getResultCode() != 0) {
                    StringBuilder sb2 = new StringBuilder("[MessageActionStore] Failed to set extension: key=");
                    V2TIMMessageExtension extension = v2TIMMessageExtensionResult.getExtension();
                    sb2.append(extension != null ? extension.getExtensionKey() : null);
                    sb2.append(", code=");
                    sb2.append(v2TIMMessageExtensionResult.getResultCode());
                    sb2.append(", message=");
                    sb2.append(v2TIMMessageExtensionResult.getResultInfo());
                    System.out.println((Object) sb2.toString());
                }
            }
        }
        CompletionHandler completionHandler = this.f88554a;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
