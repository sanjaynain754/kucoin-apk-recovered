package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMFriendInfo;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.contact.ContactInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.B */
/* JADX INFO: loaded from: classes61.dex */
public final class C39520B implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39539O f87720a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f87721b;

    public C39520B(C39539O c39539o, CompletionHandler completionHandler) {
        this.f87720a = c39539o;
        this.f87721b = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f87721b;
        if (completionHandler != null) {
            if (str == null) {
                str = "Get friend list failed";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        List list = (List) obj;
        if (list != null) {
            C39539O c39539o = this.f87720a;
            CompletionHandler completionHandler = this.f87721b;
            c39539o.getClass();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C39539O.m88275a((V2TIMFriendInfo) it.next()));
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((ContactInfo) it2.next()).setContact(Boolean.TRUE);
            }
            c39539o.f87799b.setValue(arrayList);
            if (completionHandler != null) {
                completionHandler.onSuccess();
            }
        }
    }
}
