package io.trtc.tuikit.atomicxcore.impl.conversation;

import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.I */
/* JADX INFO: loaded from: classes61.dex */
public final class C39610I implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ArrayList f87992a;

    public C39610I(ArrayList arrayList) {
        this.f87992a = arrayList;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        Iterator it = this.f87992a.iterator();
        while (it.hasNext()) {
            C39617P.f88010f.remove((String) it.next());
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        Iterator it = this.f87992a.iterator();
        while (it.hasNext()) {
            C39617P.f88010f.remove((String) it.next());
        }
    }
}
