package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMFriendApplication;
import com.tencent.imsdk.p128v2.V2TIMFriendApplicationResult;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import java.util.List;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.A */
/* JADX INFO: loaded from: classes61.dex */
public final class C39518A implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39539O f87714a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f87715b;

    public C39518A(C39539O c39539o, CompletionHandler completionHandler) {
        this.f87714a = c39539o;
        this.f87715b = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f87715b;
        if (completionHandler != null) {
            if (str == null) {
                str = "Get friend application list failed";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        List<V2TIMFriendApplication> friendApplicationList;
        V2TIMFriendApplicationResult v2TIMFriendApplicationResult = (V2TIMFriendApplicationResult) obj;
        this.f87714a.f87803f.setValue(Integer.valueOf(v2TIMFriendApplicationResult != null ? v2TIMFriendApplicationResult.getUnreadCount() : 0));
        if (v2TIMFriendApplicationResult != null && (friendApplicationList = v2TIMFriendApplicationResult.getFriendApplicationList()) != null) {
            C39539O c39539o = this.f87714a;
            c39539o.f87801d.setValue(C39539O.m88277a(c39539o, friendApplicationList));
        }
        CompletionHandler completionHandler = this.f87715b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
