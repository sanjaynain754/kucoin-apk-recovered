package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.BaseConstants;
import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.imsdk.p128v2.V2TIMUserFullInfo;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import java.util.List;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.H */
/* JADX INFO: loaded from: classes61.dex */
public final class C39532H implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39539O f87785a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f87786b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f87787c;

    public C39532H(C39539O c39539o, CompletionHandler completionHandler, String str) {
        this.f87785a = c39539o;
        this.f87786b = completionHandler;
        this.f87787c = str;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        this.f87785a.f87805h.setValue(null);
        CompletionHandler completionHandler = this.f87786b;
        if (completionHandler != null) {
            if (str == null) {
                str = "Get user info failed";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        List list = (List) obj;
        V2TIMUserFullInfo v2TIMUserFullInfo = list != null ? (V2TIMUserFullInfo) CollectionsKt.firstOrNull(list) : null;
        if (v2TIMUserFullInfo != null) {
            V2TIMManager.getFriendshipManager().checkFriend(CollectionsKt.listOf(this.f87787c), 2, new C39530G(this.f87785a, v2TIMUserFullInfo, this.f87786b));
            return;
        }
        this.f87785a.f87805h.setValue(null);
        CompletionHandler completionHandler = this.f87786b;
        if (completionHandler != null) {
            completionHandler.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "user not exist");
        }
    }
}
