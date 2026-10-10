package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMConversation;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import kotlinx.coroutines.flow.InterfaceC41669n;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.i */
/* JADX INFO: loaded from: classes61.dex */
public final class C39566i implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39586s f87870a;

    public C39566i(C39586s c39586s) {
        this.f87870a = c39586s;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0010  */
    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        boolean z11;
        V2TIMConversation v2TIMConversation = (V2TIMConversation) obj;
        InterfaceC41669n interfaceC41669n = this.f87870a.f87915h;
        if (v2TIMConversation != null) {
            z11 = v2TIMConversation.isPinned();
        }
        interfaceC41669n.setValue(Boolean.valueOf(z11));
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
    }
}
