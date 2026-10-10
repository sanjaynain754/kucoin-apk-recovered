package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMFriendInfo;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.z */
/* JADX INFO: loaded from: classes61.dex */
public final class C39600z implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39539O f87956a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f87957b;

    public C39600z(C39539O c39539o, CompletionHandler completionHandler) {
        this.f87956a = c39539o;
        this.f87957b = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f87957b;
        if (completionHandler != null) {
            if (str == null) {
                str = "Get blacklist failed";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        List list = (List) obj;
        if (list != null) {
            C39539O c39539o = this.f87956a;
            CompletionHandler completionHandler = this.f87957b;
            c39539o.getClass();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C39539O.m88275a((V2TIMFriendInfo) it.next()));
            }
            c39539o.f87798a.setValue(arrayList);
            if (completionHandler != null) {
                completionHandler.onSuccess();
            }
        }
    }
}
