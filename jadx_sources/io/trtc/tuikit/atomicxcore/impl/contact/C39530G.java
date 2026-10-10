package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMFriendCheckResult;
import com.tencent.imsdk.p128v2.V2TIMUserFullInfo;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.contact.ContactInfo;
import io.trtc.tuikit.atomicxcore.api.contact.ContactType;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.G */
/* JADX INFO: loaded from: classes61.dex */
public final class C39530G implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39539O f87753a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ V2TIMUserFullInfo f87754b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CompletionHandler f87755c;

    public C39530G(C39539O c39539o, V2TIMUserFullInfo v2TIMUserFullInfo, CompletionHandler completionHandler) {
        this.f87753a = c39539o;
        this.f87754b = v2TIMUserFullInfo;
        this.f87755c = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        InterfaceC41669n interfaceC41669n = this.f87753a.f87805h;
        V2TIMUserFullInfo v2TIMUserFullInfo = this.f87754b;
        String userID = v2TIMUserFullInfo.getUserID();
        if (userID == null) {
            userID = "";
        }
        ContactType contactType = ContactType.USER;
        String faceUrl = v2TIMUserFullInfo.getFaceUrl();
        String nickName = v2TIMUserFullInfo.getNickName();
        if (nickName == null) {
            nickName = v2TIMUserFullInfo.getUserID();
        }
        interfaceC41669n.setValue(new ContactInfo(userID, contactType, faceUrl, nickName, null, null, null, 112, null));
        CompletionHandler completionHandler = this.f87755c;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        List list = (List) obj;
        V2TIMFriendCheckResult v2TIMFriendCheckResult = list != null ? (V2TIMFriendCheckResult) CollectionsKt.firstOrNull(list) : null;
        boolean z11 = v2TIMFriendCheckResult != null && v2TIMFriendCheckResult.getResultType() == 3;
        InterfaceC41669n interfaceC41669n = this.f87753a.f87805h;
        V2TIMUserFullInfo v2TIMUserFullInfo = this.f87754b;
        String userID = v2TIMUserFullInfo.getUserID();
        if (userID == null) {
            userID = "";
        }
        ContactType contactType = ContactType.USER;
        String faceUrl = v2TIMUserFullInfo.getFaceUrl();
        String nickName = v2TIMUserFullInfo.getNickName();
        if (nickName == null) {
            nickName = v2TIMUserFullInfo.getUserID();
        }
        ContactInfo contactInfo = new ContactInfo(userID, contactType, faceUrl, nickName, null, null, null, 112, null);
        contactInfo.setContact(Boolean.valueOf(z11));
        interfaceC41669n.setValue(contactInfo);
        CompletionHandler completionHandler = this.f87755c;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
