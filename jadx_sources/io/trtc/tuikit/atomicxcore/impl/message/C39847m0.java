package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.p128v2.V2TIMAdvancedMsgListener;
import com.tencent.imsdk.p128v2.V2TIMMessage;
import com.tencent.imsdk.p128v2.V2TIMMessageExtension;
import com.tencent.imsdk.p128v2.V2TIMMessageReaction;
import com.tencent.imsdk.p128v2.V2TIMMessageReactionChangeInfo;
import com.tencent.imsdk.p128v2.V2TIMMessageReceipt;
import com.tencent.imsdk.p128v2.V2TIMUserFullInfo;
import com.tencent.imsdk.p128v2.V2TIMUserInfo;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import io.trtc.tuikit.atomicxcore.api.message.MessageBody;
import io.trtc.tuikit.atomicxcore.api.message.MessageEvent;
import io.trtc.tuikit.atomicxcore.api.message.MessageExtension;
import io.trtc.tuikit.atomicxcore.api.message.MessageInfo;
import io.trtc.tuikit.atomicxcore.api.message.MessageListType;
import io.trtc.tuikit.atomicxcore.api.message.MessageReaction;
import io.trtc.tuikit.atomicxcore.api.message.MessageReceipt;
import io.trtc.tuikit.atomicxcore.api.message.MessageStatus;
import io.trtc.tuikit.atomicxcore.api.message.MessageType;
import io.trtc.tuikit.atomicxcore.impl.common.AbstractC39504l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.m0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39847m0 extends V2TIMAdvancedMsgListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39857r0 f88555a;

    public C39847m0(C39857r0 c39857r0) {
        this.f88555a = c39857r0;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMAdvancedMsgListener
    public final void onRecvMessageExtensionsChanged(String msgID, List v2Extensions) {
        Object value;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(msgID, "msgID");
        Intrinsics.checkNotNullParameter(v2Extensions, "extensions");
        C39857r0 c39857r0 = this.f88555a;
        if (c39857r0.f88588b != MessageListType.HISTORY) {
            return;
        }
        InterfaceC41669n interfaceC41669n = c39857r0.f88591e;
        do {
            value = interfaceC41669n.getValue();
            List<MessageInfo> list = (List) value;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (MessageInfo messageInfoCopy$default : list) {
                if (Intrinsics.areEqual(messageInfoCopy$default.getMsgID(), msgID)) {
                    Intrinsics.checkNotNullParameter(v2Extensions, "v2Extensions");
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : v2Extensions) {
                        if (obj instanceof V2TIMMessageExtension) {
                            MessageExtension messageExtension = new MessageExtension(null, null, 3, null);
                            V2TIMMessageExtension v2TIMMessageExtension = (V2TIMMessageExtension) obj;
                            messageExtension.setExtensionKey(v2TIMMessageExtension.getExtensionKey());
                            messageExtension.setExtensionValue(v2TIMMessageExtension.getExtensionValue());
                            arrayList2.add(messageExtension);
                        }
                    }
                    messageInfoCopy$default = MessageInfo.copy$default(messageInfoCopy$default, null, null, false, null, null, null, null, 0, null, false, null, null, false, null, false, arrayList2, null, null, 0, null, null, null, 4161535, null);
                }
                arrayList.add(messageInfoCopy$default);
            }
        } while (!interfaceC41669n.compareAndSet(value, arrayList));
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMAdvancedMsgListener
    public final void onRecvMessageExtensionsDeleted(String msgID, List extensionKeys) {
        Object value;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(msgID, "msgID");
        Intrinsics.checkNotNullParameter(extensionKeys, "extensionKeys");
        C39857r0 c39857r0 = this.f88555a;
        if (c39857r0.f88588b != MessageListType.HISTORY) {
            return;
        }
        InterfaceC41669n interfaceC41669n = c39857r0.f88591e;
        do {
            value = interfaceC41669n.getValue();
            List<MessageInfo> list = (List) value;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (MessageInfo messageInfoCopy$default : list) {
                if (Intrinsics.areEqual(messageInfoCopy$default.getMsgID(), msgID)) {
                    List<MessageExtension> extensionList = messageInfoCopy$default.getExtensionList();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : extensionList) {
                        String extensionKey = ((MessageExtension) obj).getExtensionKey();
                        if (!(extensionKey != null ? extensionKeys.contains(extensionKey) : false)) {
                            arrayList2.add(obj);
                        }
                    }
                    messageInfoCopy$default = MessageInfo.copy$default(messageInfoCopy$default, null, null, false, null, null, null, null, 0, null, false, null, null, false, null, false, arrayList2, null, null, 0, null, null, null, 4161535, null);
                }
                arrayList.add(messageInfoCopy$default);
            }
        } while (!interfaceC41669n.compareAndSet(value, arrayList));
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMAdvancedMsgListener
    public final void onRecvMessageModified(V2TIMMessage msg) {
        Object value;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(msg, "msg");
        C39857r0 c39857r0 = this.f88555a;
        if (c39857r0.f88588b != MessageListType.HISTORY) {
            return;
        }
        InterfaceC41669n interfaceC41669n = c39857r0.f88591e;
        do {
            value = interfaceC41669n.getValue();
            List<MessageInfo> list = (List) value;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (MessageInfo messageInfoCopy$default : list) {
                if (Intrinsics.areEqual(messageInfoCopy$default.getMsgID(), msg.getMsgID())) {
                    messageInfoCopy$default = MessageInfo.copy$default(AbstractC39504l.m88244a(msg), null, null, false, null, null, null, null, 0, null, false, null, null, false, messageInfoCopy$default.getReceipt(), false, messageInfoCopy$default.getExtensionList(), messageInfoCopy$default.getReactionList(), null, 0, null, null, null, 4087807, null);
                }
                arrayList.add(messageInfoCopy$default);
            }
        } while (!interfaceC41669n.compareAndSet(value, arrayList));
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMAdvancedMsgListener
    public final void onRecvMessageReactionsChanged(List changedList) {
        Object value;
        ArrayList arrayList;
        Object next;
        Intrinsics.checkNotNullParameter(changedList, "changedList");
        if (this.f88555a.f88588b != MessageListType.HISTORY) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = changedList.iterator();
        while (it.hasNext()) {
            String messageID = ((V2TIMMessageReactionChangeInfo) it.next()).getMessageID();
            if (messageID != null) {
                arrayList2.add(messageID);
            }
        }
        Set set = CollectionsKt.toSet(arrayList2);
        if (set.isEmpty()) {
            return;
        }
        InterfaceC41669n interfaceC41669n = this.f88555a.f88591e;
        do {
            value = interfaceC41669n.getValue();
            List<MessageInfo> list = (List) value;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (MessageInfo messageInfo : list) {
                if (CollectionsKt.contains(set, messageInfo.getMsgID())) {
                    Iterator it2 = changedList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!Intrinsics.areEqual(((V2TIMMessageReactionChangeInfo) next).getMessageID(), messageInfo.getMsgID()));
                    V2TIMMessageReactionChangeInfo v2TIMMessageReactionChangeInfo = (V2TIMMessageReactionChangeInfo) next;
                    if (v2TIMMessageReactionChangeInfo != null) {
                        List<V2TIMMessageReaction> v2Reactions = v2TIMMessageReactionChangeInfo.getReactionList();
                        Intrinsics.checkNotNullExpressionValue(v2Reactions, "getReactionList(...)");
                        Intrinsics.checkNotNullParameter(v2Reactions, "v2Reactions");
                        ArrayList<MessageReaction> arrayList3 = new ArrayList();
                        for (V2TIMMessageReaction v2TIMMessageReaction : v2Reactions) {
                            String reactionID = v2TIMMessageReaction.getReactionID();
                            if (reactionID == null) {
                                reactionID = "";
                            }
                            MessageReaction messageReaction = new MessageReaction(reactionID, 0, null, false, 14, null);
                            messageReaction.setTotalUserCount(v2TIMMessageReaction.getTotalUserCount());
                            messageReaction.setReactedByMyself(v2TIMMessageReaction.getReactedByMyself());
                            ArrayList arrayList4 = new ArrayList();
                            List<V2TIMUserInfo> partialUserList = v2TIMMessageReaction.getPartialUserList();
                            if (partialUserList != null) {
                                Intrinsics.checkNotNull(partialUserList);
                                for (V2TIMUserInfo v2UserInfo : partialUserList) {
                                    Intrinsics.checkNotNull(v2UserInfo);
                                    Intrinsics.checkNotNullParameter(v2UserInfo, "v2UserInfo");
                                    String userID = v2UserInfo.getUserID();
                                    UserProfile userProfile = new UserProfile(userID == null ? "" : userID, v2UserInfo.getNickName(), v2UserInfo.getFaceUrl(), null, null, null, null, null, null, null, 1016, null);
                                    userProfile.setBirthday(Long.valueOf(v2UserInfo.getBirthday()));
                                    arrayList4.add(userProfile);
                                }
                            }
                            messageReaction.setPartialUserList(arrayList4);
                            arrayList3.add(messageReaction);
                        }
                        List<MessageReaction> reactionList = messageInfo.getReactionList();
                        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(reactionList, 10)), 16));
                        for (Object obj : reactionList) {
                            linkedHashMap.put(((MessageReaction) obj).getReactionID(), obj);
                        }
                        Map mutableMap = MapsKt.toMutableMap(linkedHashMap);
                        for (MessageReaction messageReaction2 : arrayList3) {
                            if (messageReaction2.getTotalUserCount() == 0) {
                                mutableMap.remove(messageReaction2.getReactionID());
                            } else {
                                mutableMap.put(messageReaction2.getReactionID(), messageReaction2);
                            }
                        }
                        MessageInfo messageInfoCopy$default = MessageInfo.copy$default(messageInfo, null, null, false, null, null, null, null, 0, null, false, null, null, false, null, false, null, CollectionsKt.toList(mutableMap.values()), null, 0, null, null, null, 4128767, null);
                        if (messageInfoCopy$default != null) {
                            messageInfo = messageInfoCopy$default;
                        }
                    }
                }
                arrayList.add(messageInfo);
            }
        } while (!interfaceC41669n.compareAndSet(value, arrayList));
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMAdvancedMsgListener
    public final void onRecvMessageReadReceipts(List receiptList) {
        Object value;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(receiptList, "receiptList");
        if (this.f88555a.f88588b != MessageListType.HISTORY) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(receiptList, 10)), 16));
        for (Object obj : receiptList) {
            linkedHashMap.put(((V2TIMMessageReceipt) obj).getMsgID(), obj);
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        InterfaceC41669n interfaceC41669n = this.f88555a.f88591e;
        do {
            value = interfaceC41669n.getValue();
            List<MessageInfo> list = (List) value;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (MessageInfo messageInfoCopy$default : list) {
                if (linkedHashMap.containsKey(messageInfoCopy$default.getMsgID())) {
                    Object obj2 = linkedHashMap.get(messageInfoCopy$default.getMsgID());
                    Intrinsics.checkNotNull(obj2);
                    V2TIMMessageReceipt v2Receipt = (V2TIMMessageReceipt) obj2;
                    Intrinsics.checkNotNullParameter(v2Receipt, "v2Receipt");
                    messageInfoCopy$default = MessageInfo.copy$default(messageInfoCopy$default, null, null, false, null, null, null, null, 0, null, false, null, null, false, new MessageReceipt(v2Receipt.isPeerRead(), (int) v2Receipt.getReadCount(), (int) v2Receipt.getUnreadCount()), false, null, null, null, 0, null, null, null, 4186111, null);
                }
                arrayList.add(messageInfoCopy$default);
            }
        } while (!interfaceC41669n.compareAndSet(value, arrayList));
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMAdvancedMsgListener
    public final void onRecvNewMessage(V2TIMMessage msg) {
        Object value;
        Intrinsics.checkNotNullParameter(msg, "msg");
        C39857r0 c39857r0 = this.f88555a;
        if (c39857r0.f88588b != MessageListType.HISTORY) {
            return;
        }
        String conversationID = c39857r0.f88587a;
        Intrinsics.checkNotNullParameter(msg, "<this>");
        Intrinsics.checkNotNullParameter(conversationID, "conversationID");
        String userID = msg.getUserID();
        Intrinsics.checkNotNullParameter(conversationID, "conversationID");
        if (Intrinsics.areEqual(userID, StringsKt.startsWith$default(conversationID, TUIConstants.TUIConversation.CONVERSATION_C2C_PREFIX, false, 2, (Object) null) ? StringsKt.replaceFirst$default(conversationID, TUIConstants.TUIConversation.CONVERSATION_C2C_PREFIX, "", false, 4, (Object) null) : null)) {
            String groupID = msg.getGroupID();
            Intrinsics.checkNotNullParameter(conversationID, "conversationID");
            if (Intrinsics.areEqual(groupID, StringsKt.startsWith$default(conversationID, TUIConstants.TUIConversation.CONVERSATION_GROUP_PREFIX, false, 2, (Object) null) ? StringsKt.replaceFirst$default(conversationID, TUIConstants.TUIConversation.CONVERSATION_GROUP_PREFIX, "", false, 4, (Object) null) : null)) {
                MessageInfo messageInfoM88244a = AbstractC39504l.m88244a(msg);
                InterfaceC41669n interfaceC41669n = this.f88555a.f88591e;
                do {
                    value = interfaceC41669n.getValue();
                } while (!interfaceC41669n.compareAndSet(value, CollectionsKt.plus((Collection<? extends MessageInfo>) value, messageInfoM88244a)));
                this.f88555a.m88337a(new MessageEvent.RecvMessage(messageInfoM88244a));
            }
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMAdvancedMsgListener
    public final void onRecvMessageRevoked(String str, V2TIMUserFullInfo v2TIMUserFullInfo, String str2) {
        Object value;
        ArrayList arrayList;
        super.onRecvMessageRevoked(str, v2TIMUserFullInfo, str2);
        C39857r0 c39857r0 = this.f88555a;
        if (c39857r0.f88588b == MessageListType.HISTORY) {
            InterfaceC41669n interfaceC41669n = c39857r0.f88591e;
            do {
                value = interfaceC41669n.getValue();
                List<MessageInfo> list = (List) value;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (MessageInfo messageInfoCopy$default : list) {
                    if (Intrinsics.areEqual(messageInfoCopy$default.getMsgID(), str)) {
                        MessageStatus status = messageInfoCopy$default.getStatus();
                        MessageStatus messageStatus = MessageStatus.RECALLED;
                        if (status != messageStatus) {
                            MessageType messageType = MessageType.SYSTEM;
                            V2TIMMessage rawMessage = messageInfoCopy$default.getRawMessage();
                            Intrinsics.checkNotNull(rawMessage);
                            messageInfoCopy$default = MessageInfo.copy$default(messageInfoCopy$default, null, null, false, null, null, null, messageStatus, 0, null, false, messageType, new MessageBody(null, null, null, null, 0, 0, 0, null, null, null, null, 0, 0, null, 0, 0, 0, null, 0, 0, null, null, null, null, null, 0, 0, null, CollectionsKt.listOf(AbstractC39504l.m88245a(rawMessage, v2TIMUserFullInfo, str2)), null, null, 1879048191, null), false, null, false, null, null, null, 0, null, null, null, 4191167, null);
                        }
                    }
                    arrayList.add(messageInfoCopy$default);
                }
            } while (!interfaceC41669n.compareAndSet(value, arrayList));
        }
    }
}
