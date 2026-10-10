package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMReceiveMessageOptInfo;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.contact.ReceiveMessageOpt;
import java.util.List;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.k */
/* JADX INFO: loaded from: classes61.dex */
public final class C39570k implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39586s f87876a;

    public C39570k(C39586s c39586s) {
        this.f87876a = c39586s;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        List list = (List) obj;
        V2TIMReceiveMessageOptInfo v2TIMReceiveMessageOptInfo = list != null ? (V2TIMReceiveMessageOptInfo) CollectionsKt.firstOrNull(list) : null;
        if (v2TIMReceiveMessageOptInfo != null) {
            this.f87876a.f87914g.setValue(Boolean.valueOf(v2TIMReceiveMessageOptInfo.getC2CReceiveMessageOpt() == 2));
            this.f87876a.f87918k.setValue(ReceiveMessageOpt.INSTANCE.parse(v2TIMReceiveMessageOptInfo.getC2CReceiveMessageOpt()));
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
    }
}
