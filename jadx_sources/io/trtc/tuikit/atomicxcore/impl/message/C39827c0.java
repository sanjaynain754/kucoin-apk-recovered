package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.p128v2.V2TIMMessageReceipt;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.message.MessageInfo;
import io.trtc.tuikit.atomicxcore.api.message.MessageReceipt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.c0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39827c0 implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39857r0 f88492a;

    public C39827c0(C39857r0 c39857r0) {
        this.f88492a = c39857r0;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        StringBuilder sb2 = new StringBuilder("[MessageListStore] Failed to get message read receipts: code=");
        sb2.append(i11);
        sb2.append(", desc=");
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        System.out.println((Object) sb2.toString());
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        Object value;
        ArrayList arrayList;
        List list = (List) obj;
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            Pair pairM90091to = null;
            if (!it.hasNext()) {
                break;
            }
            V2TIMMessageReceipt v2TIMMessageReceipt = (V2TIMMessageReceipt) it.next();
            String msgID = v2TIMMessageReceipt.getMsgID();
            if (msgID != null) {
                Intrinsics.checkNotNull(msgID);
                pairM90091to = TuplesKt.m90091to(msgID, v2TIMMessageReceipt);
            }
            if (pairM90091to != null) {
                arrayList2.add(pairM90091to);
            }
        }
        Map map = MapsKt.toMap(arrayList2);
        InterfaceC41669n interfaceC41669n = this.f88492a.f88591e;
        do {
            value = interfaceC41669n.getValue();
            List<MessageInfo> list2 = (List) value;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (MessageInfo messageInfoCopy$default : list2) {
                String msgID2 = messageInfoCopy$default.getMsgID();
                V2TIMMessageReceipt v2Receipt = msgID2 != null ? (V2TIMMessageReceipt) map.get(msgID2) : null;
                if (v2Receipt != null) {
                    Intrinsics.checkNotNullParameter(v2Receipt, "v2Receipt");
                    messageInfoCopy$default = MessageInfo.copy$default(messageInfoCopy$default, null, null, false, null, null, null, null, 0, null, false, null, null, false, new MessageReceipt(v2Receipt.isPeerRead(), (int) v2Receipt.getReadCount(), (int) v2Receipt.getUnreadCount()), false, null, null, null, 0, null, null, null, 4186111, null);
                }
                arrayList.add(messageInfoCopy$default);
            }
        } while (!interfaceC41669n.compareAndSet(value, arrayList));
    }
}
