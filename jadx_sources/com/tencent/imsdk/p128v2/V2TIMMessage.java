package com.tencent.imsdk.p128v2;

import android.text.TextUtils;
import com.tencent.imsdk.group.GroupMemberInfo;
import com.tencent.imsdk.manager.BaseManager;
import com.tencent.imsdk.message.CustomElement;
import com.tencent.imsdk.message.FaceElement;
import com.tencent.imsdk.message.FileElement;
import com.tencent.imsdk.message.GroupTipsElement;
import com.tencent.imsdk.message.ImageElement;
import com.tencent.imsdk.message.LocationElement;
import com.tencent.imsdk.message.MergerElement;
import com.tencent.imsdk.message.Message;
import com.tencent.imsdk.message.MessageAtInfo;
import com.tencent.imsdk.message.MessageBaseElement;
import com.tencent.imsdk.message.MessageOfflinePushInfo;
import com.tencent.imsdk.message.MessageQuoteInfo;
import com.tencent.imsdk.message.SoundElement;
import com.tencent.imsdk.message.StreamElement;
import com.tencent.imsdk.message.TextElement;
import com.tencent.imsdk.message.VideoElement;
import com.tencent.imsdk.relationship.UserInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMMessage implements Serializable {
    public static final int V2TIM_ELEM_TYPE_CUSTOM = 2;
    public static final int V2TIM_ELEM_TYPE_FACE = 8;
    public static final int V2TIM_ELEM_TYPE_FILE = 6;
    public static final int V2TIM_ELEM_TYPE_GROUP_TIPS = 9;
    public static final int V2TIM_ELEM_TYPE_IMAGE = 3;
    public static final int V2TIM_ELEM_TYPE_LOCATION = 7;
    public static final int V2TIM_ELEM_TYPE_MERGER = 10;
    public static final int V2TIM_ELEM_TYPE_NONE = 0;
    public static final int V2TIM_ELEM_TYPE_SOUND = 4;
    public static final int V2TIM_ELEM_TYPE_STREAM = 11;
    public static final int V2TIM_ELEM_TYPE_TEXT = 1;
    public static final int V2TIM_ELEM_TYPE_VIDEO = 5;
    public static final int V2TIM_GROUP_MESSAGE_READ_MEMBERS_FILTER_READ = 0;
    public static final int V2TIM_GROUP_MESSAGE_READ_MEMBERS_FILTER_UNREAD = 1;
    public static final int V2TIM_MSG_STATUS_HAS_DELETED = 4;
    public static final int V2TIM_MSG_STATUS_LOCAL_IMPORTED = 5;
    public static final int V2TIM_MSG_STATUS_LOCAL_REVOKED = 6;
    public static final int V2TIM_MSG_STATUS_SENDING = 1;
    public static final int V2TIM_MSG_STATUS_SEND_FAIL = 3;
    public static final int V2TIM_MSG_STATUS_SEND_SUCC = 2;
    private static final int V2TIM_MSG_STATUS_UNKNOWN = 0;
    public static final int V2TIM_NOT_RECEIVE_MESSAGE = 1;
    public static final int V2TIM_NOT_RECEIVE_MESSAGE_EXCEPT_AT = 4;
    public static final int V2TIM_PRIORITY_DEFAULT = 0;
    public static final int V2TIM_PRIORITY_HIGH = 1;
    public static final int V2TIM_PRIORITY_LOW = 3;
    public static final int V2TIM_PRIORITY_NORMAL = 2;
    public static final int V2TIM_RECEIVE_MESSAGE = 0;
    public static final int V2TIM_RECEIVE_NOT_NOTIFY_MESSAGE = 2;
    public static final int V2TIM_RECEIVE_NOT_NOTIFY_MESSAGE_EXCEPT_AT = 3;
    private Message message;

    public String getCloudCustomData() {
        Message message = this.message;
        return message == null ? "" : message.getCloudCustomString();
    }

    public String getCustomModerationConfigurationID() {
        Message message = this.message;
        return message == null ? "" : message.getCustomModerationConfigurationID();
    }

    public int getElemType() {
        Message message = this.message;
        if (message != null && message.getMessageBaseElements().size() > 0) {
            MessageBaseElement messageBaseElement = this.message.getMessageBaseElements().get(0);
            if (messageBaseElement instanceof TextElement) {
                return 1;
            }
            if (messageBaseElement instanceof ImageElement) {
                return 3;
            }
            if (messageBaseElement instanceof VideoElement) {
                return 5;
            }
            if (messageBaseElement instanceof SoundElement) {
                return 4;
            }
            if (messageBaseElement instanceof FaceElement) {
                return 8;
            }
            if (messageBaseElement instanceof FileElement) {
                return 6;
            }
            if (messageBaseElement instanceof CustomElement) {
                return 2;
            }
            if (messageBaseElement instanceof LocationElement) {
                return 7;
            }
            if (messageBaseElement instanceof GroupTipsElement) {
                return 9;
            }
            if (messageBaseElement instanceof MergerElement) {
                return 10;
            }
            if (messageBaseElement instanceof StreamElement) {
                return 11;
            }
        }
        return 0;
    }

    public String getFaceUrl() {
        Message message = this.message;
        if (message != null) {
            return message.getFaceUrl();
        }
        return null;
    }

    public String getFriendRemark() {
        Message message = this.message;
        if (message != null) {
            return message.getFriendRemark();
        }
        return null;
    }

    public List<String> getGroupAtUserList() {
        Message message = this.message;
        if (message == null) {
            return new ArrayList();
        }
        List<MessageAtInfo> messageGroupAtInfoList = message.getMessageGroupAtInfoList();
        ArrayList arrayList = new ArrayList();
        Iterator<MessageAtInfo> it = messageGroupAtInfoList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getAtUserID());
        }
        return arrayList;
    }

    public String getGroupID() {
        Message message = this.message;
        if (message == null || message.getMessageType() != Message.MESSAGE_TYPE_GROUP) {
            return null;
        }
        return this.message.getGroupID();
    }

    public String getLocalCustomData() {
        Message message = this.message;
        return message == null ? "" : message.getLocalCustomString();
    }

    public int getLocalCustomInt() {
        Message message = this.message;
        if (message == null) {
            return 0;
        }
        return message.getLocalCustomNumber();
    }

    public Message getMessage() {
        return this.message;
    }

    public V2TIMMessageQuoteInfo getMessageQuoteInfo() {
        MessageQuoteInfo quoteInfo;
        Message message = this.message;
        if (message == null || (quoteInfo = message.getQuoteInfo()) == null) {
            return null;
        }
        V2TIMMessageQuoteInfo v2TIMMessageQuoteInfo = new V2TIMMessageQuoteInfo();
        v2TIMMessageQuoteInfo.setMessageQuoteInfo(quoteInfo);
        return v2TIMMessageQuoteInfo;
    }

    public String getMsgID() {
        Message message = this.message;
        return message != null ? message.getMsgID() : "";
    }

    public String getNameCard() {
        Message message = this.message;
        if (message != null) {
            return message.getNameCard();
        }
        return null;
    }

    public String getNickName() {
        Message message = this.message;
        if (message != null) {
            return message.getNickName();
        }
        return null;
    }

    public V2TIMOfflinePushInfo getOfflinePushInfo() {
        Message message = this.message;
        if (message == null) {
            return null;
        }
        MessageOfflinePushInfo offlinePushInfo = message.getOfflinePushInfo();
        V2TIMOfflinePushInfo v2TIMOfflinePushInfo = new V2TIMOfflinePushInfo();
        v2TIMOfflinePushInfo.setMessageOfflinePushInfo(offlinePushInfo);
        return v2TIMOfflinePushInfo;
    }

    public V2TIMGroupMemberFullInfo getPinnerInfo() {
        GroupMemberInfo pinnerInfo;
        Message message = this.message;
        if (message == null || (pinnerInfo = message.getPinnerInfo()) == null || TextUtils.isEmpty(pinnerInfo.getUserID())) {
            return null;
        }
        V2TIMGroupMemberFullInfo v2TIMGroupMemberFullInfo = new V2TIMGroupMemberFullInfo();
        v2TIMGroupMemberFullInfo.setGroupMemberInfo(pinnerInfo);
        return v2TIMGroupMemberFullInfo;
    }

    public int getPriority() {
        Message message = this.message;
        if (message != null) {
            return message.getPriority();
        }
        return 0;
    }

    public long getRandom() {
        Message message = this.message;
        if (message == null) {
            return 0L;
        }
        return message.getRandom();
    }

    public String getRevokeReason() {
        Message message = this.message;
        if (message != null && message.getMessageStatus() == 6) {
            return this.message.getRevokeReason();
        }
        return null;
    }

    public V2TIMUserFullInfo getRevokerInfo() {
        UserInfo revokerInfo;
        Message message = this.message;
        if (message == null || message.getMessageStatus() != 6 || (revokerInfo = this.message.getRevokerInfo()) == null || TextUtils.isEmpty(revokerInfo.getUserID())) {
            return null;
        }
        V2TIMUserFullInfo v2TIMUserFullInfo = new V2TIMUserFullInfo();
        v2TIMUserFullInfo.setUserInfo(revokerInfo);
        return v2TIMUserFullInfo;
    }

    public String getSender() {
        Message message = this.message;
        if (message != null) {
            return message.getSenderUserID();
        }
        return null;
    }

    public long getSeq() {
        Message message = this.message;
        if (message == null) {
            return 0L;
        }
        return message.getSeq();
    }

    public int getStatus() {
        Message message = this.message;
        if (message == null) {
            return 1;
        }
        return message.getMessageStatus();
    }

    public long getTimestamp() {
        Message message = this.message;
        if (message != null) {
            return message.getTimestamp();
        }
        return 0L;
    }

    public String getUserID() {
        Message message = this.message;
        if (message == null || message.getMessageType() != Message.MESSAGE_TYPE_C2C) {
            return null;
        }
        return this.message.isMessageSender() ? this.message.getReceiverUserID() : this.message.getSenderUserID();
    }

    public boolean hasRiskContent() {
        Message message = this.message;
        if (message == null) {
            return false;
        }
        return message.isHasRiskContent();
    }

    public boolean isBroadcastMessage() {
        Message message = this.message;
        if (message != null) {
            return message.isBroadcastMessage();
        }
        return false;
    }

    public boolean isDisableCloudMessagePostHook() {
        Message message = this.message;
        if (message == null) {
            return false;
        }
        return message.isDisableCloudMessagePostHook();
    }

    public boolean isDisableCloudMessagePreHook() {
        Message message = this.message;
        if (message == null) {
            return false;
        }
        return message.isDisableCloudMessagePreHook();
    }

    public boolean isExcludedFromContentModeration() {
        Message message = this.message;
        if (message == null) {
            return false;
        }
        return message.isExcludedFromContentModeration();
    }

    public boolean isExcludedFromLastMessage() {
        Message message = this.message;
        if (message == null) {
            return false;
        }
        return message.isExcludedFromLastMessage();
    }

    public boolean isExcludedFromUnreadCount() {
        Message message = this.message;
        if (message == null) {
            return false;
        }
        return message.isExcludedFromUnreadCount();
    }

    public boolean isNeedReadReceipt() {
        Message message = this.message;
        if (message != null) {
            return message.isNeedReadReceipt();
        }
        return false;
    }

    public boolean isRead() {
        Message message = this.message;
        if (message != null) {
            return message.isSelfRead();
        }
        return true;
    }

    public boolean isSelf() {
        Message message = this.message;
        if (message != null) {
            return message.isMessageSender();
        }
        return true;
    }

    public boolean isSupportMessageExtension() {
        Message message = this.message;
        if (message == null) {
            return false;
        }
        return message.isSupportMessageExtension();
    }

    public void setCloudCustomData(String str) {
        Message message = this.message;
        if (message == null) {
            return;
        }
        message.setCloudCustomString(str);
    }

    public void setCustomModerationConfigurationID(String str) {
        Message message = this.message;
        if (message == null) {
            return;
        }
        message.setCustomModerationConfigurationID(str);
    }

    public void setDisableCloudMessagePostHook(boolean z11) {
        Message message = this.message;
        if (message == null) {
            return;
        }
        message.setDisableCloudMessagePostHook(z11);
    }

    public void setDisableCloudMessagePreHook(boolean z11) {
        Message message = this.message;
        if (message == null) {
            return;
        }
        message.setDisableCloudMessagePreHook(z11);
    }

    public void setExcludedFromContentModeration(boolean z11) {
        Message message = this.message;
        if (message == null) {
            return;
        }
        message.setExcludedFromContentModeration(z11);
    }

    public void setExcludedFromLastMessage(boolean z11) {
        Message message = this.message;
        if (message == null) {
            return;
        }
        message.setExcludedFromLastMessage(z11);
    }

    public void setExcludedFromUnreadCount(boolean z11) {
        Message message = this.message;
        if (message == null) {
            return;
        }
        message.setExcludedFromUnreadCount(z11);
    }

    public void setGroupAtUserList(List<String> list) {
        if (this.message == null || list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            MessageAtInfo messageAtInfo = new MessageAtInfo();
            messageAtInfo.setAtUserID(str);
            arrayList.add(messageAtInfo);
        }
        this.message.setMessageGroupAtInfoList(arrayList);
    }

    public void setLocalCustomData(String str) {
        Message message = this.message;
        if (message == null) {
            return;
        }
        message.setLocalCustomString(str);
    }

    public void setLocalCustomInt(int i11) {
        Message message = this.message;
        if (message == null) {
            return;
        }
        message.setLocalCustomNumber(i11);
    }

    public void setMessage(Message message) {
        if (message == null) {
            return;
        }
        this.message = message;
    }

    public void setNeedReadReceipt(boolean z11) {
        Message message = this.message;
        if (message != null) {
            message.setNeedReadReceipt(z11);
        }
    }

    public void setSupportMessageExtension(boolean z11) {
        Message message = this.message;
        if (message == null) {
            return;
        }
        message.setSupportMessageExtension(z11);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("V2TIMMessage--->");
        StringBuilder sb3 = new StringBuilder();
        V2TIMElem groupTipsElem = null;
        for (int i11 = 0; i11 < this.message.getMessageBaseElements().size(); i11++) {
            MessageBaseElement messageBaseElement = this.message.getMessageBaseElements().get(i11);
            if (messageBaseElement instanceof TextElement) {
                groupTipsElem = groupTipsElem == null ? getTextElem() : groupTipsElem.getNextElem();
                sb3.append(((V2TIMTextElem) groupTipsElem).toString());
            } else if (messageBaseElement instanceof CustomElement) {
                groupTipsElem = groupTipsElem == null ? getCustomElem() : groupTipsElem.getNextElem();
                sb3.append(((V2TIMCustomElem) groupTipsElem).toString());
            } else if (messageBaseElement instanceof ImageElement) {
                groupTipsElem = groupTipsElem == null ? getImageElem() : groupTipsElem.getNextElem();
                sb3.append(((V2TIMImageElem) groupTipsElem).toString());
            } else if (messageBaseElement instanceof SoundElement) {
                groupTipsElem = groupTipsElem == null ? getSoundElem() : groupTipsElem.getNextElem();
                sb3.append(((V2TIMSoundElem) groupTipsElem).toString());
            } else if (messageBaseElement instanceof VideoElement) {
                groupTipsElem = groupTipsElem == null ? getVideoElem() : groupTipsElem.getNextElem();
                sb3.append(((V2TIMVideoElem) groupTipsElem).toString());
            } else if (messageBaseElement instanceof FileElement) {
                groupTipsElem = groupTipsElem == null ? getFileElem() : groupTipsElem.getNextElem();
                sb3.append(((V2TIMFileElem) groupTipsElem).toString());
            } else if (messageBaseElement instanceof LocationElement) {
                groupTipsElem = groupTipsElem == null ? getLocationElem() : groupTipsElem.getNextElem();
                sb3.append(((V2TIMLocationElem) groupTipsElem).toString());
            } else if (messageBaseElement instanceof FaceElement) {
                groupTipsElem = groupTipsElem == null ? getFaceElem() : groupTipsElem.getNextElem();
                sb3.append(((V2TIMFaceElem) groupTipsElem).toString());
            } else if (messageBaseElement instanceof MergerElement) {
                groupTipsElem = groupTipsElem == null ? getMergerElem() : groupTipsElem.getNextElem();
                sb3.append(((V2TIMMergerElem) groupTipsElem).toString());
            } else if (messageBaseElement instanceof GroupTipsElement) {
                groupTipsElem = groupTipsElem == null ? getGroupTipsElem() : groupTipsElem.getNextElem();
                sb3.append(((V2TIMGroupTipsElem) groupTipsElem).toString());
            }
            sb3.append("|");
        }
        sb2.append("msgID:");
        sb2.append(getMsgID());
        sb2.append(", timestamp:");
        sb2.append(getTimestamp());
        sb2.append(", sender:");
        sb2.append(getSender());
        sb2.append(", nickname:");
        sb2.append(getNickName());
        sb2.append(", faceUrl:");
        sb2.append(getFaceUrl());
        sb2.append(", friendRemark:");
        sb2.append(getFriendRemark());
        sb2.append(", nameCard:");
        sb2.append(getNameCard());
        sb2.append(", groupID:");
        sb2.append(getGroupID());
        sb2.append(", userID:");
        sb2.append(getUserID());
        sb2.append(", seq:");
        sb2.append(getSeq());
        sb2.append(", random:");
        sb2.append(getRandom());
        sb2.append(", status:");
        sb2.append(getStatus());
        sb2.append(", isSelf:");
        sb2.append(isSelf());
        sb2.append(", isRead:");
        sb2.append(isRead());
        sb2.append(", isPeerRead:");
        sb2.append(isPeerRead());
        sb2.append(", needReadReceipt:");
        sb2.append(isNeedReadReceipt());
        sb2.append(", priority:");
        sb2.append(getPriority());
        sb2.append(", groupAtUserList:");
        sb2.append(getGroupAtUserList());
        sb2.append(", elemType:");
        sb2.append(getElemType());
        sb2.append(", localCustomData:");
        sb2.append(getLocalCustomData());
        sb2.append(", localCustomInt:");
        sb2.append(getLocalCustomInt());
        sb2.append(", cloudCustomData:");
        sb2.append(getCloudCustomData());
        sb2.append(", isExcludeFromUnreadCount:");
        sb2.append(isExcludedFromUnreadCount());
        sb2.append(", isExcludeFromLastMessage:");
        sb2.append(isExcludedFromLastMessage());
        sb2.append(", offlinePushInfo:");
        sb2.append(getOfflinePushInfo());
        sb2.append(", isBroadcastMessage:");
        sb2.append(isBroadcastMessage());
        sb2.append(", supportMessageExtension:");
        sb2.append(isSupportMessageExtension());
        sb2.append(", hasRiskContent:");
        sb2.append(hasRiskContent());
        sb2.append(", elemDesc:");
        sb2.append(sb3.toString());
        sb2.append(", revokerInfo:");
        sb2.append(getRevokerInfo());
        sb2.append(", revokeReason:");
        sb2.append(getRevokeReason());
        sb2.append(", pinnerInfo:");
        sb2.append(getPinnerInfo());
        sb2.append(", quoteInfo:");
        sb2.append(getMessageQuoteInfo());
        return sb2.toString();
    }

    public V2TIMMessage() {
        Message message = new Message();
        this.message = message;
        message.setClientTime(BaseManager.getInstance().getServerTime());
    }

    public V2TIMCustomElem getCustomElem() {
        if (getElemType() == 0 || getElemType() != 2) {
            return null;
        }
        V2TIMCustomElem v2TIMCustomElem = new V2TIMCustomElem();
        v2TIMCustomElem.setMessage(this.message);
        v2TIMCustomElem.setElemIndex(0);
        return v2TIMCustomElem;
    }

    public V2TIMFaceElem getFaceElem() {
        if (getElemType() == 0 || getElemType() != 8) {
            return null;
        }
        V2TIMFaceElem v2TIMFaceElem = new V2TIMFaceElem();
        v2TIMFaceElem.setMessage(this.message);
        v2TIMFaceElem.setElemIndex(0);
        return v2TIMFaceElem;
    }

    public V2TIMFileElem getFileElem() {
        if (getElemType() == 0 || getElemType() != 6) {
            return null;
        }
        V2TIMFileElem v2TIMFileElem = new V2TIMFileElem();
        v2TIMFileElem.setMessage(this.message);
        v2TIMFileElem.setElemIndex(0);
        return v2TIMFileElem;
    }

    public V2TIMGroupTipsElem getGroupTipsElem() {
        if (getElemType() == 0 || getElemType() != 9) {
            return null;
        }
        V2TIMGroupTipsElem v2TIMGroupTipsElem = new V2TIMGroupTipsElem();
        v2TIMGroupTipsElem.setMessage(this.message);
        v2TIMGroupTipsElem.setElemIndex(0);
        return v2TIMGroupTipsElem;
    }

    public V2TIMImageElem getImageElem() {
        if (getElemType() == 0 || getElemType() != 3) {
            return null;
        }
        V2TIMImageElem v2TIMImageElem = new V2TIMImageElem();
        v2TIMImageElem.setMessage(this.message);
        v2TIMImageElem.setElemIndex(0);
        return v2TIMImageElem;
    }

    public V2TIMLocationElem getLocationElem() {
        if (getElemType() == 0 || getElemType() != 7) {
            return null;
        }
        V2TIMLocationElem v2TIMLocationElem = new V2TIMLocationElem();
        v2TIMLocationElem.setMessage(this.message);
        v2TIMLocationElem.setElemIndex(0);
        return v2TIMLocationElem;
    }

    public V2TIMMergerElem getMergerElem() {
        if (getElemType() == 0 || getElemType() != 10) {
            return null;
        }
        V2TIMMergerElem v2TIMMergerElem = new V2TIMMergerElem();
        v2TIMMergerElem.setMessage(this.message);
        v2TIMMergerElem.setElemIndex(0);
        return v2TIMMergerElem;
    }

    public V2TIMSoundElem getSoundElem() {
        if (getElemType() == 0 || getElemType() != 4) {
            return null;
        }
        V2TIMSoundElem v2TIMSoundElem = new V2TIMSoundElem();
        v2TIMSoundElem.setMessage(this.message);
        v2TIMSoundElem.setElemIndex(0);
        return v2TIMSoundElem;
    }

    public V2TIMStreamElem getStreamElem() {
        if (getElemType() == 0 || getElemType() != 11) {
            return null;
        }
        V2TIMStreamElem v2TIMStreamElem = new V2TIMStreamElem();
        v2TIMStreamElem.setMessage(this.message);
        v2TIMStreamElem.setElemIndex(0);
        return v2TIMStreamElem;
    }

    public V2TIMTextElem getTextElem() {
        if (getElemType() == 0 || getElemType() != 1) {
            return null;
        }
        V2TIMTextElem v2TIMTextElem = new V2TIMTextElem();
        v2TIMTextElem.setMessage(this.message);
        v2TIMTextElem.setElemIndex(0);
        return v2TIMTextElem;
    }

    public V2TIMVideoElem getVideoElem() {
        if (getElemType() == 0 || getElemType() != 5) {
            return null;
        }
        V2TIMVideoElem v2TIMVideoElem = new V2TIMVideoElem();
        v2TIMVideoElem.setMessage(this.message);
        v2TIMVideoElem.setElemIndex(0);
        return v2TIMVideoElem;
    }

    public boolean isPeerRead() {
        Message message;
        int status = getStatus();
        if (status == 0 || status == 1 || status == 3 || status == 5 || (message = this.message) == null) {
            return false;
        }
        return message.isPeerRead();
    }
}
