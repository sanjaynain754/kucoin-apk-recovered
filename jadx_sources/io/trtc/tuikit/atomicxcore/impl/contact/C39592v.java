package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMFriendOperationResult;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.v */
/* JADX INFO: loaded from: classes61.dex */
public final class C39592v implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CompletionHandler f87938a;

    public C39592v(CompletionHandler completionHandler) {
        this.f87938a = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f87938a;
        if (completionHandler != null) {
            if (str == null) {
                str = "Add friend failed";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        V2TIMFriendOperationResult v2TIMFriendOperationResult = (V2TIMFriendOperationResult) obj;
        int resultCode = v2TIMFriendOperationResult != null ? v2TIMFriendOperationResult.getResultCode() : 0;
        if (resultCode == 0) {
            CompletionHandler completionHandler = this.f87938a;
            if (completionHandler != null) {
                completionHandler.onSuccess();
                return;
            }
            return;
        }
        CompletionHandler completionHandler2 = this.f87938a;
        if (completionHandler2 != null) {
            String resultInfo = v2TIMFriendOperationResult != null ? v2TIMFriendOperationResult.getResultInfo() : null;
            if (resultInfo == null) {
                resultInfo = "Add friend failed";
            }
            completionHandler2.onFailure(resultCode, resultInfo);
        }
    }
}
