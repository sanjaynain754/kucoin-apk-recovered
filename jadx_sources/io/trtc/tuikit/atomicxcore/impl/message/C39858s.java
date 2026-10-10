package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.imsdk.p128v2.V2TIMMessage;
import io.trtc.tuikit.atomicxcore.api.message.MessageEvent;
import io.trtc.tuikit.atomicxcore.api.message.MessageInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.s */
/* JADX INFO: loaded from: classes61.dex */
public final class C39858s implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39857r0 f88600a;

    public C39858s(C39857r0 c39857r0) {
        this.f88600a = c39857r0;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        List<MessageInfo> listListOf;
        MessageEvent messageEvent = (MessageEvent) obj;
        C39857r0 c39857r0 = this.f88600a;
        int i11 = C39857r0.f88586n;
        c39857r0.getClass();
        if (messageEvent instanceof MessageEvent.FetchMessages) {
            listListOf = ((MessageEvent.FetchMessages) messageEvent).getMessageList();
        } else {
            if (!(messageEvent instanceof MessageEvent.FetchMoreMessages)) {
                if (messageEvent instanceof MessageEvent.RecvMessage) {
                    listListOf = CollectionsKt.listOf(((MessageEvent.RecvMessage) messageEvent).getMessage());
                } else if (!(messageEvent instanceof MessageEvent.SendMessage ? true : messageEvent instanceof MessageEvent.DeleteMessages)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
            listListOf = ((MessageEvent.FetchMoreMessages) messageEvent).getMessageList();
        }
        if (!listListOf.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listListOf) {
                MessageInfo messageInfo = (MessageInfo) obj2;
                if (messageInfo.isSelf() && messageInfo.getNeedReadReceipt() && messageInfo.getRawMessage() != null) {
                    arrayList.add(obj2);
                }
            }
            ArrayList<MessageInfo> arrayList2 = new ArrayList();
            for (Object obj3 : listListOf) {
                MessageInfo messageInfo2 = (MessageInfo) obj3;
                if (messageInfo2.getSupportExtension() && messageInfo2.getRawMessage() != null) {
                    arrayList2.add(obj3);
                }
            }
            if (!arrayList.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    V2TIMMessage rawMessage = ((MessageInfo) it.next()).getRawMessage();
                    if (rawMessage != null) {
                        arrayList3.add(rawMessage);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    V2TIMManager.getMessageManager().getMessageReadReceipts(arrayList3, new C39827c0(c39857r0));
                }
            }
            if (!arrayList2.isEmpty()) {
                for (MessageInfo messageInfo3 : arrayList2) {
                    V2TIMMessage rawMessage2 = messageInfo3.getRawMessage();
                    if (rawMessage2 != null) {
                        V2TIMManager.getMessageManager().getMessageExtensions(rawMessage2, new C39823a0(messageInfo3, c39857r0));
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
