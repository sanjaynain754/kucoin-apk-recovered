package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.p128v2.V2TIMMessageExtension;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.message.MessageExtension;
import io.trtc.tuikit.atomicxcore.api.message.MessageInfo;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.a0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39823a0 implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MessageInfo f88483a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39857r0 f88484b;

    public C39823a0(MessageInfo messageInfo, C39857r0 c39857r0) {
        this.f88483a = messageInfo;
        this.f88484b = c39857r0;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        StringBuilder sb2 = new StringBuilder("[MessageListStore] Failed to get message extensions: code=");
        sb2.append(i11);
        sb2.append(", desc=");
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        System.out.println((Object) sb2.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.ArrayList] */
    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        Object value;
        ArrayList arrayList;
        ?? EmptyList;
        List v2Extensions = (List) obj;
        String msgID = this.f88483a.getMsgID();
        if (msgID == null) {
            return;
        }
        InterfaceC41669n interfaceC41669n = this.f88484b.f88591e;
        do {
            value = interfaceC41669n.getValue();
            List<MessageInfo> list = (List) value;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (MessageInfo messageInfoCopy$default : list) {
                if (Intrinsics.areEqual(messageInfoCopy$default.getMsgID(), msgID)) {
                    if (v2Extensions != null) {
                        Intrinsics.checkNotNullParameter(v2Extensions, "v2Extensions");
                        EmptyList = new ArrayList();
                        for (Object obj2 : v2Extensions) {
                            if (obj2 instanceof V2TIMMessageExtension) {
                                MessageExtension messageExtension = new MessageExtension(null, null, 3, null);
                                V2TIMMessageExtension v2TIMMessageExtension = (V2TIMMessageExtension) obj2;
                                messageExtension.setExtensionKey(v2TIMMessageExtension.getExtensionKey());
                                messageExtension.setExtensionValue(v2TIMMessageExtension.getExtensionValue());
                                EmptyList.add(messageExtension);
                            }
                        }
                    } else {
                        EmptyList = CollectionsKt.emptyList();
                    }
                    messageInfoCopy$default = MessageInfo.copy$default(messageInfoCopy$default, null, null, false, null, null, null, null, 0, null, false, null, null, false, null, false, EmptyList, null, null, 0, null, null, null, 4161535, null);
                }
                arrayList.add(messageInfoCopy$default);
            }
        } while (!interfaceC41669n.compareAndSet(value, arrayList));
    }
}
