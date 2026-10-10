package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMGroupInfo;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.contact.ContactInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.F */
/* JADX INFO: loaded from: classes61.dex */
public final class C39528F implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39539O f87745a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f87746b;

    public C39528F(C39539O c39539o, CompletionHandler completionHandler) {
        this.f87745a = c39539o;
        this.f87746b = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f87746b;
        if (completionHandler != null) {
            if (str == null) {
                str = "Get group list failed";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        List list = (List) obj;
        if (list != null) {
            C39539O c39539o = this.f87745a;
            CompletionHandler completionHandler = this.f87746b;
            c39539o.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C39539O.m88276a((V2TIMGroupInfo) it.next()));
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((ContactInfo) it2.next()).setInGroup(Boolean.TRUE);
            }
            c39539o.f87800c.setValue(arrayList);
            if (completionHandler != null) {
                completionHandler.onSuccess();
            }
        }
    }
}
