package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMFriendInfo;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import java.util.Iterator;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.d */
/* JADX INFO: loaded from: classes61.dex */
public final class C39556d implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39586s f87845a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f87846b;

    public C39556d(C39586s c39586s, CompletionHandler completionHandler) {
        this.f87845a = c39586s;
        this.f87846b = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f87846b;
        if (completionHandler != null) {
            if (str == null) {
                str = "";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b A[EDGE_INSN: B:13:0x002b->B:14:0x002c BREAK  A[LOOP:0: B:8:0x0011->B:20:?]] */
    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        boolean z11;
        List list = (List) obj;
        if (list == null) {
            z11 = false;
            break;
        }
        C39586s c39586s = this.f87845a;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z11 = false;
                    break;
                } else if (Intrinsics.areEqual(((V2TIMFriendInfo) it.next()).getUserID(), c39586s.f87908a)) {
                    z11 = true;
                    break;
                }
            }
        } else {
            z11 = false;
            break;
        }
        this.f87845a.f87917j.setValue(Boolean.valueOf(z11));
        CompletionHandler completionHandler = this.f87846b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
