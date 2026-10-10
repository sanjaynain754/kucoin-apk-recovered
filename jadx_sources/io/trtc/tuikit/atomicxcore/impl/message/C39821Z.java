package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.p128v2.V2TIMMessage;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.message.MessageEvent;
import io.trtc.tuikit.atomicxcore.api.message.MessageFetchOption;
import io.trtc.tuikit.atomicxcore.impl.common.AbstractC39504l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.Z */
/* JADX INFO: loaded from: classes61.dex */
public final class C39821Z implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39829d0 f88479a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39857r0 f88480b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MessageFetchOption f88481c;

    public C39821Z(C39829d0 c39829d0, C39857r0 c39857r0, MessageFetchOption messageFetchOption) {
        this.f88479a = c39829d0;
        this.f88480b = c39857r0;
        this.f88481c = messageFetchOption;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String desc) {
        C39829d0 c39829d0 = this.f88479a;
        if (desc == null) {
            desc = "";
        }
        Intrinsics.checkNotNullParameter(desc, "desc");
        CompletionHandler completionHandler = c39829d0.f88494a;
        if (completionHandler != null) {
            completionHandler.onFailure(i11, desc);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        List list = (List) obj;
        if (list == null) {
            C39829d0 c39829d0 = this.f88479a;
            Intrinsics.checkNotNullParameter("Download failed", "desc");
            CompletionHandler completionHandler = c39829d0.f88494a;
            if (completionHandler != null) {
                completionHandler.onFailure(-1, "Download failed");
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC39504l.m88244a((V2TIMMessage) it.next()));
        }
        this.f88480b.f88591e.setValue(arrayList);
        if (!arrayList.isEmpty()) {
            this.f88480b.m88337a(new MessageEvent.FetchMessages(arrayList, this.f88481c.getDirection()));
        }
        this.f88479a.onSuccess();
    }
}
