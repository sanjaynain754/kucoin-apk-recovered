package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMGroupInfo;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.contact.ContactInfo;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.D */
/* JADX INFO: loaded from: classes61.dex */
public final class C39524D implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39539O f87731a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ V2TIMGroupInfo f87732b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CompletionHandler f87733c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f87734d;

    public C39524D(C39539O c39539o, V2TIMGroupInfo v2TIMGroupInfo, CompletionHandler completionHandler, String str) {
        this.f87731a = c39539o;
        this.f87732b = v2TIMGroupInfo;
        this.f87733c = completionHandler;
        this.f87734d = str;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        InterfaceC41669n interfaceC41669n = this.f87731a.f87806i;
        V2TIMGroupInfo info = this.f87732b;
        Intrinsics.checkNotNullExpressionValue(info, "$info");
        interfaceC41669n.setValue(C39539O.m88276a(info));
        CompletionHandler completionHandler = this.f87733c;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029 A[EDGE_INSN: B:13:0x0029->B:14:0x002a BREAK  A[LOOP:0: B:8:0x0011->B:20:?]] */
    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        boolean z11;
        List list = (List) obj;
        if (list == null) {
            z11 = false;
            break;
        }
        String str = this.f87734d;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z11 = false;
                    break;
                } else if (Intrinsics.areEqual(((V2TIMGroupInfo) it.next()).getGroupID(), str)) {
                    z11 = true;
                    break;
                }
            }
        } else {
            z11 = false;
            break;
        }
        InterfaceC41669n interfaceC41669n = this.f87731a.f87806i;
        V2TIMGroupInfo info = this.f87732b;
        Intrinsics.checkNotNullExpressionValue(info, "$info");
        ContactInfo contactInfoM88276a = C39539O.m88276a(info);
        contactInfoM88276a.setInGroup(Boolean.valueOf(z11));
        interfaceC41669n.setValue(contactInfoM88276a);
        CompletionHandler completionHandler = this.f87733c;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
