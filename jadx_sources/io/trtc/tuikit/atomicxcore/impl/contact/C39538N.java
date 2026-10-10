package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.contact.GroupApplicationHandledResult;
import io.trtc.tuikit.atomicxcore.api.contact.GroupApplicationHandledStatus;
import io.trtc.tuikit.atomicxcore.api.contact.GroupApplicationInfo;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.N */
/* JADX INFO: loaded from: classes61.dex */
public final class C39538N implements V2TIMCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39539O f87795a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f87796b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ GroupApplicationInfo f87797c;

    public C39538N(C39539O c39539o, CompletionHandler completionHandler, GroupApplicationInfo groupApplicationInfo) {
        this.f87795a = c39539o;
        this.f87796b = completionHandler;
        this.f87797c = groupApplicationInfo;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f87796b;
        if (completionHandler != null) {
            if (str == null) {
                str = "Refuse group application failed";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onSuccess() {
        Object value;
        ArrayList arrayList;
        InterfaceC41669n interfaceC41669n = this.f87795a.f87802e;
        GroupApplicationInfo groupApplicationInfo = this.f87797c;
        do {
            value = interfaceC41669n.getValue();
            List<GroupApplicationInfo> list = (List) value;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (GroupApplicationInfo groupApplicationInfoCopy : list) {
                if (Intrinsics.areEqual(groupApplicationInfoCopy.getApplicationID(), groupApplicationInfo.getApplicationID()) && groupApplicationInfoCopy.getHandledStatus() == GroupApplicationHandledStatus.UNHANDLED) {
                    groupApplicationInfoCopy = groupApplicationInfoCopy.copy((6655 & 1) != 0 ? groupApplicationInfoCopy.applicationID : null, (6655 & 2) != 0 ? groupApplicationInfoCopy.groupID : null, (6655 & 4) != 0 ? groupApplicationInfoCopy.fromUser : null, (6655 & 8) != 0 ? groupApplicationInfoCopy.fromUserNickname : null, (6655 & 16) != 0 ? groupApplicationInfoCopy.fromUserAvatarURL : null, (6655 & 32) != 0 ? groupApplicationInfoCopy.toUser : null, (6655 & 64) != 0 ? groupApplicationInfoCopy.addTime : 0L, (6655 & 128) != 0 ? groupApplicationInfoCopy.requestMsg : null, (6655 & 256) != 0 ? groupApplicationInfoCopy.handledMsg : null, (6655 & 512) != 0 ? groupApplicationInfoCopy.handledStatus : GroupApplicationHandledStatus.BY_MYSELF, (6655 & 1024) != 0 ? groupApplicationInfoCopy.handledResult : GroupApplicationHandledResult.REFUSED, (6655 & 2048) != 0 ? groupApplicationInfoCopy.type : null, (6655 & 4096) != 0 ? groupApplicationInfoCopy.application : null);
                }
                arrayList.add(groupApplicationInfoCopy);
            }
        } while (!interfaceC41669n.compareAndSet(value, arrayList));
        CompletionHandler completionHandler = this.f87796b;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
