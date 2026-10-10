package io.trtc.tuikit.atomicxcore.impl.conversation;

import com.tencent.imsdk.p128v2.V2TIMConversation;
import com.tencent.imsdk.p128v2.V2TIMGroupAtInfo;
import com.tencent.imsdk.p128v2.V2TIMMessage;
import io.trtc.tuikit.atomicxcore.api.contact.GroupType;
import io.trtc.tuikit.atomicxcore.api.contact.ReceiveMessageOpt;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationInfo;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationMarkType;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationType;
import io.trtc.tuikit.atomicxcore.api.conversation.GroupAtInfo;
import io.trtc.tuikit.atomicxcore.api.conversation.GroupAtType;
import io.trtc.tuikit.atomicxcore.api.message.MessageInfo;
import io.trtc.tuikit.atomicxcore.impl.common.AbstractC39504l;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.b */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC39619b {
    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    /* JADX INFO: renamed from: a */
    public static ConversationInfo m88290a(V2TIMConversation imConversation) {
        ArrayList arrayList;
        List<ConversationMarkType> listEmptyList;
        GroupType groupType;
        Intrinsics.checkNotNullParameter(imConversation, "imConversation");
        List<V2TIMGroupAtInfo> groupAtInfoList = imConversation.getGroupAtInfoList();
        if (groupAtInfoList == null) {
            arrayList = null;
        } else {
            if (groupAtInfoList.isEmpty()) {
                groupAtInfoList = null;
            }
            if (groupAtInfoList != null) {
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(groupAtInfoList, 10));
                for (V2TIMGroupAtInfo v2TIMGroupAtInfo : groupAtInfoList) {
                    arrayList2.add(new GroupAtInfo(v2TIMGroupAtInfo.getSeq(), GroupAtType.INSTANCE.parse(v2TIMGroupAtInfo.getAtType())));
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
        }
        List<Long> markList = imConversation.getMarkList();
        if (markList == null || (listEmptyList = ConversationMarkType.INSTANCE.parseList(markList)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        int unreadCount = (listEmptyList.contains(ConversationMarkType.UNREAD) && imConversation.getUnreadCount() == 0) ? 1 : imConversation.getUnreadCount();
        String conversationID = imConversation.getConversationID();
        Intrinsics.checkNotNullExpressionValue(conversationID, "getConversationID(...)");
        ConversationType conversationType = ConversationType.INSTANCE.parse(imConversation.getType());
        if (imConversation.getType() == 2) {
            GroupType.Companion companion = GroupType.INSTANCE;
            String groupType2 = imConversation.getGroupType();
            Intrinsics.checkNotNullExpressionValue(groupType2, "getGroupType(...)");
            groupType = companion.parse(groupType2);
        } else {
            groupType = null;
        }
        String faceUrl = imConversation.getFaceUrl();
        GroupType groupType3 = groupType;
        String showName = imConversation.getShowName();
        V2TIMMessage lastMessage = imConversation.getLastMessage();
        MessageInfo messageInfoM88244a = lastMessage != null ? AbstractC39504l.m88244a(lastMessage) : null;
        String draftText = imConversation.getDraftText();
        String draftText2 = imConversation.getDraftText();
        long timestamp = (draftText2 == null || draftText2.length() == 0) ? imConversation.getLastMessage() != null ? imConversation.getLastMessage().getTimestamp() : 0L : imConversation.getDraftTimestamp();
        boolean zIsPinned = imConversation.isPinned();
        long orderKey = imConversation.getOrderKey();
        List<ConversationMarkType> list = listEmptyList;
        ReceiveMessageOpt receiveMessageOpt = ReceiveMessageOpt.INSTANCE.parse(imConversation.getRecvOpt());
        List<String> conversationGroupList = imConversation.getConversationGroupList();
        if (conversationGroupList == null) {
            conversationGroupList = CollectionsKt.emptyList();
        }
        return new ConversationInfo(conversationID, conversationType, groupType3, faceUrl, showName, messageInfoM88244a, draftText, timestamp, unreadCount, zIsPinned, orderKey, receiveMessageOpt, arrayList, conversationGroupList, list, imConversation);
    }
}
