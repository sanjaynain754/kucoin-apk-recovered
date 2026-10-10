package io.trtc.tuikit.atomicxcore.impl.conversation;

import com.tencent.imsdk.p128v2.V2TIMFriendInfo;
import com.tencent.imsdk.p128v2.V2TIMFriendshipListener;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.v */
/* JADX INFO: loaded from: classes61.dex */
public final class C39639v extends V2TIMFriendshipListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39606E f88054a;

    public C39639v(C39606E c39606e) {
        this.f88054a = c39606e;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onFriendInfoChanged(List list) {
        String userID;
        C39606E c39606e;
        Object obj;
        ArrayList arrayList;
        ConversationInfo conversationInfoCopy;
        if (list != null) {
            C39606E c39606e2 = this.f88054a;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                V2TIMFriendInfo v2TIMFriendInfo = (V2TIMFriendInfo) it.next();
                if (v2TIMFriendInfo != null) {
                    String str = TUIConstants.TUIConversation.CONVERSATION_C2C_PREFIX + v2TIMFriendInfo.getUserID();
                    String friendRemark = v2TIMFriendInfo.getFriendRemark();
                    if (friendRemark == null || friendRemark.length() == 0) {
                        String nickName = v2TIMFriendInfo.getUserProfile().getNickName();
                        userID = (nickName == null || nickName.length() == 0) ? v2TIMFriendInfo.getUserID() : v2TIMFriendInfo.getUserProfile().getNickName();
                    } else {
                        userID = v2TIMFriendInfo.getFriendRemark();
                    }
                    String str2 = userID;
                    InterfaceC41669n interfaceC41669n = c39606e2.f87977e;
                    while (true) {
                        Object value = interfaceC41669n.getValue();
                        List<ConversationInfo> list2 = (List) value;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                        for (ConversationInfo conversationInfo : list2) {
                            if (!Intrinsics.areEqual(str, conversationInfo.getConversationID()) || Intrinsics.areEqual(conversationInfo.getTitle(), str2)) {
                                obj = value;
                                arrayList = arrayList2;
                                conversationInfoCopy = conversationInfo;
                            } else {
                                arrayList = arrayList2;
                                obj = value;
                                conversationInfoCopy = conversationInfo.copy((65023 & 1) != 0 ? conversationInfo.conversationID : null, (65023 & 2) != 0 ? conversationInfo.type : null, (65023 & 4) != 0 ? conversationInfo.groupType : null, (65023 & 8) != 0 ? conversationInfo.avatarURL : null, (65023 & 16) != 0 ? conversationInfo.title : str2, (65023 & 32) != 0 ? conversationInfo.lastMessage : null, (65023 & 64) != 0 ? conversationInfo.draft : null, (65023 & 128) != 0 ? conversationInfo.timestamp : 0L, (65023 & 256) != 0 ? conversationInfo.unreadCount : 0, (65023 & 512) != 0 ? conversationInfo.isPinned : false, (65023 & 1024) != 0 ? conversationInfo.orderKey : 0L, (65023 & 2048) != 0 ? conversationInfo.receiveOption : null, (65023 & 4096) != 0 ? conversationInfo.groupAtInfoList : null, (65023 & 8192) != 0 ? conversationInfo.conversationGroupList : null, (65023 & 16384) != 0 ? conversationInfo.markList : null, (65023 & 32768) != 0 ? conversationInfo.rawConversation : null);
                            }
                            arrayList.add(conversationInfoCopy);
                            value = obj;
                            arrayList2 = arrayList;
                            c39606e2 = c39606e2;
                        }
                        c39606e = c39606e2;
                        if (interfaceC41669n.compareAndSet(value, arrayList2)) {
                            break;
                        } else {
                            c39606e2 = c39606e;
                        }
                    }
                    c39606e2 = c39606e;
                }
            }
        }
    }
}
