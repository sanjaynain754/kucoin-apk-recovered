package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.p0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39765p0 implements TUIRoomDefine.ActionCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39774s0 f88361a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f88362b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CompletionHandler f88363c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f88364d;

    public C39765p0(C39774s0 c39774s0, String str, CompletionHandler completionHandler, boolean z11) {
        this.f88361a = c39774s0;
        this.f88362b = str;
        this.f88363c = completionHandler;
        this.f88364d = z11;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.ActionCallback
    public final void onError(TUICommonDefine.Error error, String str) {
        C39510r c39510r = this.f88361a.f88389f;
        StringBuilder sb2 = new StringBuilder("Response: disableSendingMessageByAdmin failed code=");
        sb2.append(error != null ? Integer.valueOf(error.getValue()) : null);
        sb2.append(", message=");
        sb2.append(str);
        String message = sb2.toString();
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(2, message);
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.ActionCallback
    public final void onSuccess() {
        Object value;
        ArrayList arrayList;
        Object next;
        Object value2;
        AbstractC39465b.m88232a(this.f88361a.f88389f, "Response: disableSendingMessageByAdmin success", "message", 0, "Response: disableSendingMessageByAdmin success");
        String str = this.f88362b;
        if (str != null) {
            boolean z11 = this.f88364d;
            C39774s0 c39774s0 = this.f88361a;
            if (z11) {
                Iterator it = ((Iterable) c39774s0.f88388e.getValue()).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((LiveUserInfo) next).getUserID(), str));
                if (next == null) {
                    List mutableList = CollectionsKt.toMutableList((Collection) c39774s0.f88388e.getValue());
                    mutableList.add(new LiveUserInfo(str, null, null, 6, null));
                    InterfaceC41669n interfaceC41669n = c39774s0.f88388e;
                    do {
                        value2 = interfaceC41669n.getValue();
                    } while (!interfaceC41669n.compareAndSet(value2, mutableList));
                }
            } else {
                InterfaceC41669n interfaceC41669n2 = c39774s0.f88388e;
                do {
                    value = interfaceC41669n2.getValue();
                    arrayList = new ArrayList();
                    for (Object obj : (List) value) {
                        if (!Intrinsics.areEqual(((LiveUserInfo) obj).getUserID(), str)) {
                            arrayList.add(obj);
                        }
                    }
                } while (!interfaceC41669n2.compareAndSet(value, CollectionsKt.toMutableList((Collection) arrayList)));
            }
        }
        CompletionHandler completionHandler = this.f88363c;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
