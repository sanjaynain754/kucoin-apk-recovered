package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.p128v2.V2TIMMessage;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.message.MessageEvent;
import io.trtc.tuikit.atomicxcore.api.message.MessageFetchDirection;
import io.trtc.tuikit.atomicxcore.api.message.MessageFetchOption;
import io.trtc.tuikit.atomicxcore.impl.common.AbstractC39504l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.e0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39831e0 implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MessageFetchOption f88497a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39857r0 f88498b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f88499c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CompletionHandler f88500d;

    public C39831e0(MessageFetchOption messageFetchOption, C39857r0 c39857r0, boolean z11, CompletionHandler completionHandler) {
        this.f88497a = messageFetchOption;
        this.f88498b = c39857r0;
        this.f88499c = z11;
        this.f88500d = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        CompletionHandler completionHandler = this.f88500d;
        if (completionHandler != null) {
            completionHandler.onFailure(i11, desc);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        ArrayList arrayList;
        Object value;
        List list;
        List msgs = (List) obj;
        Intrinsics.checkNotNullParameter(msgs, "msgs");
        if (this.f88497a.getDirection() == MessageFetchDirection.OLDER) {
            C39857r0 c39857r0 = this.f88498b;
            List listReversed = CollectionsKt.reversed(msgs);
            c39857r0.getClass();
            arrayList = new ArrayList();
            Iterator it = listReversed.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC39504l.m88244a((V2TIMMessage) it.next()));
            }
        } else {
            this.f88498b.getClass();
            arrayList = new ArrayList();
            Iterator it2 = msgs.iterator();
            while (it2.hasNext()) {
                arrayList.add(AbstractC39504l.m88244a((V2TIMMessage) it2.next()));
            }
        }
        InterfaceC41669n interfaceC41669n = this.f88498b.f88591e;
        MessageFetchOption messageFetchOption = this.f88497a;
        do {
            value = interfaceC41669n.getValue();
            list = (List) value;
        } while (!interfaceC41669n.compareAndSet(value, messageFetchOption.getDirection() == MessageFetchDirection.OLDER ? CollectionsKt.plus((Collection) arrayList, (Iterable) list) : CollectionsKt.plus((Collection) list, (Iterable) arrayList)));
        if (!arrayList.isEmpty()) {
            if (this.f88499c) {
                this.f88498b.m88337a(new MessageEvent.FetchMoreMessages(arrayList));
            } else {
                this.f88498b.m88337a(new MessageEvent.FetchMessages(arrayList, this.f88497a.getDirection()));
            }
        }
        boolean z11 = msgs.size() >= this.f88497a.getPageCount();
        if (this.f88497a.getDirection() == MessageFetchDirection.NEWER) {
            this.f88498b.f88593g.setValue(Boolean.valueOf(z11));
        } else {
            this.f88498b.f88592f.setValue(Boolean.valueOf(z11));
        }
        CompletionHandler completionHandler = this.f88500d;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
