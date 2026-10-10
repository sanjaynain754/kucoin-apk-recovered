package com.tencent.imsdk.p128v2;

import android.text.TextUtils;
import com.tencent.imsdk.BaseConstants;
import com.tencent.imsdk.common.IMCallback;
import com.tencent.imsdk.common.IMContext;
import com.tencent.imsdk.common.IMLog;
import com.tencent.imsdk.conversation.ConversationKey;
import com.tencent.imsdk.conversation.ConversationManager;
import com.tencent.imsdk.group.GroupManager;
import com.tencent.imsdk.group.GroupMemberInfo;
import com.tencent.imsdk.manager.BaseManager;
import com.tencent.imsdk.message.C2CMessageReceipt;
import com.tencent.imsdk.message.CustomElement;
import com.tencent.imsdk.message.FaceElement;
import com.tencent.imsdk.message.FileElement;
import com.tencent.imsdk.message.GroupMessageReadMembers;
import com.tencent.imsdk.message.GroupMessageReceipt;
import com.tencent.imsdk.message.ImageElement;
import com.tencent.imsdk.message.LocationElement;
import com.tencent.imsdk.message.MergerElement;
import com.tencent.imsdk.message.Message;
import com.tencent.imsdk.message.MessageCenter;
import com.tencent.imsdk.message.MessageExtension;
import com.tencent.imsdk.message.MessageExtensionResult;
import com.tencent.imsdk.message.MessageKey;
import com.tencent.imsdk.message.MessageListGetOption;
import com.tencent.imsdk.message.MessageListener;
import com.tencent.imsdk.message.MessageQuoteInfo;
import com.tencent.imsdk.message.MessageReactionChangeInfo;
import com.tencent.imsdk.message.MessageReactionResult;
import com.tencent.imsdk.message.MessageReactionUserResult;
import com.tencent.imsdk.message.MessageSearchParam;
import com.tencent.imsdk.message.MessageSearchResult;
import com.tencent.imsdk.message.MessageUploadProgressCallback;
import com.tencent.imsdk.message.SoundElement;
import com.tencent.imsdk.message.TextElement;
import com.tencent.imsdk.message.VideoElement;
import com.tencent.imsdk.relationship.ReceiveMessageOptInfo;
import com.tencent.imsdk.relationship.RelationshipManager;
import com.tencent.imsdk.relationship.UserInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMMessageManagerImpl extends V2TIMMessageManager {
    private static final int MAX_ABSTRACT_COUNT = 5;
    private static final int MAX_ABSTRACT_LENGTH = 100;
    private static final int MAX_FORWARD_COUNT = 300;
    private static final String TAG = "V2TIMMessageManagerImpl";
    private Object mLockObject;
    private MessageListener mMessageListener;
    private List<V2TIMAdvancedMsgListener> mV2TIMMsgListenerList;

    public static class V2TIMMessageManagerImplHolder {
        private static final V2TIMMessageManagerImpl v2TIMMessageManagerImpl = new V2TIMMessageManagerImpl();

        private V2TIMMessageManagerImplHolder() {
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public V2TIMMessage createAtSignedGroupMessage(V2TIMMessage v2TIMMessage, List<String> list) {
        if (v2TIMMessage == null) {
            IMLog.m75914e(TAG, "createAtSignedGroupMessage, message cannot be null");
            return null;
        }
        if (list == null || list.isEmpty()) {
            IMLog.m75914e(TAG, "atUserList cannot be empty");
            return null;
        }
        v2TIMMessage.setGroupAtUserList(list);
        return v2TIMMessage;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public V2TIMMessage createCustomMessage(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            IMLog.m75914e(TAG, "data cannot be empty");
            return null;
        }
        V2TIMMessage v2TIMMessage = new V2TIMMessage();
        Message message = v2TIMMessage.getMessage();
        CustomElement customElement = new CustomElement();
        customElement.setData(bArr);
        message.addElement(customElement);
        return v2TIMMessage;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public V2TIMMessage createForwardMessage(V2TIMMessage v2TIMMessage) {
        if (v2TIMMessage == null) {
            IMLog.m75914e(TAG, "createForwardMessage, message cannot be null");
            return null;
        }
        if (2 != v2TIMMessage.getStatus()) {
            IMLog.m75914e(TAG, "message status must be V2TIM_MSG_STATUS_SEND_SUCC");
            return null;
        }
        if (9 == v2TIMMessage.getElemType()) {
            IMLog.m75914e(TAG, "group tips message is not support");
            return null;
        }
        V2TIMMessage v2TIMMessage2 = new V2TIMMessage();
        Message message = v2TIMMessage2.getMessage();
        message.setMessageBaseElements(v2TIMMessage.getMessage().getMessageBaseElements());
        message.setForward(true);
        return v2TIMMessage2;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public V2TIMMessage createMergerMessage(List<V2TIMMessage> list, String str, List<String> list2, String str2) {
        if (list == null || list.size() == 0 || list.size() > 300) {
            IMLog.m75914e(TAG, "messageList invalid, the number of messageList must be between 1 and 300");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (list2 != null) {
            int size = list2.size();
            if (size >= 5) {
                size = 5;
            }
            for (int i11 = 0; i11 < size; i11++) {
                String strSubstring = list2.get(i11);
                if (strSubstring != null) {
                    if (strSubstring.length() > 100) {
                        strSubstring = strSubstring.substring(0, 100);
                    }
                    arrayList.add(strSubstring);
                }
            }
        }
        for (V2TIMMessage v2TIMMessage : list) {
            if (2 != v2TIMMessage.getStatus()) {
                IMLog.m75914e(TAG, "message status must be V2TIM_MSG_STATUS_SEND_SUCC");
                return null;
            }
            if (9 == v2TIMMessage.getElemType()) {
                IMLog.m75914e(TAG, "group tips message is not support");
                return null;
            }
        }
        if (str2 == null) {
            IMLog.m75914e(TAG, "compatibleText invalid, compatibleText cannot be null");
            return null;
        }
        MergerElement mergerElement = new MergerElement();
        mergerElement.setTitle(str);
        mergerElement.setAbstractList(arrayList);
        mergerElement.setCompatibleText(str2);
        ArrayList arrayList2 = new ArrayList();
        Iterator<V2TIMMessage> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().getMessage());
        }
        mergerElement.setMessageList(arrayList2);
        V2TIMMessage v2TIMMessage2 = new V2TIMMessage();
        Message message = v2TIMMessage2.getMessage();
        message.addElement(mergerElement);
        message.setForward(true);
        return v2TIMMessage2;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public V2TIMMessage createQuoteMessage(V2TIMMessage v2TIMMessage, V2TIMMessage v2TIMMessage2) {
        if (v2TIMMessage == null) {
            IMLog.m75914e(TAG, "createQuoteMessage, message cannot be null");
            return null;
        }
        if (v2TIMMessage2 == null) {
            IMLog.m75914e(TAG, "createQuoteMessage, quotedMessage cannot be null");
            return null;
        }
        MessageQuoteInfo messageQuoteInfo = new MessageQuoteInfo();
        messageQuoteInfo.setMsgID(v2TIMMessage2.getMsgID());
        messageQuoteInfo.setMessageTime(v2TIMMessage2.getMessage().getTimestamp());
        messageQuoteInfo.setMessageSequence(v2TIMMessage2.getSeq());
        v2TIMMessage.getMessage().setQuoteInfo(messageQuoteInfo);
        return v2TIMMessage;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public V2TIMMessage createTargetedGroupMessage(V2TIMMessage v2TIMMessage, List<String> list) {
        if (v2TIMMessage == null) {
            IMLog.m75914e(TAG, "createTargetedGroupMessage, message cannot be null");
            return null;
        }
        if (list == null || list.isEmpty()) {
            IMLog.m75914e(TAG, "receiverList cannot be empty");
            return null;
        }
        List<String> groupAtUserList = v2TIMMessage.getGroupAtUserList();
        if (groupAtUserList == null || groupAtUserList.isEmpty()) {
            v2TIMMessage.getMessage().setTargetGroupMemberList(list);
            return v2TIMMessage;
        }
        IMLog.m75914e(TAG, "targeted group message does not support at message");
        return null;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public String sendMessage(final V2TIMMessage v2TIMMessage, String str, String str2, int i11, boolean z11, V2TIMOfflinePushInfo v2TIMOfflinePushInfo, final V2TIMSendCallback<V2TIMMessage> v2TIMSendCallback) {
        if (v2TIMMessage == null) {
            if (v2TIMSendCallback != null) {
                v2TIMSendCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "message is null");
            }
            return null;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            if (v2TIMSendCallback != null) {
                v2TIMSendCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "receiver and groupID cannot be empty at the same time!");
            }
            return null;
        }
        Message message = v2TIMMessage.getMessage();
        if (TextUtils.isEmpty(str2)) {
            message.setMessageType(Message.MESSAGE_TYPE_C2C);
            message.setReceiverUserID(str);
        } else {
            message.setMessageType(Message.MESSAGE_TYPE_GROUP);
            message.setGroupID(str2);
            List<String> targetGroupMemberList = message.getTargetGroupMemberList();
            if (!TextUtils.isEmpty(str) && (targetGroupMemberList == null || message.getTargetGroupMemberList().isEmpty())) {
                List<String> groupAtUserList = v2TIMMessage.getGroupAtUserList();
                if (groupAtUserList != null && !groupAtUserList.isEmpty()) {
                    if (v2TIMSendCallback != null) {
                        v2TIMSendCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "targeted group message does not support group @ message");
                    }
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                message.setTargetGroupMemberList(arrayList);
            }
        }
        message.setPriority(i11);
        if (z11) {
            message.setLifeTime(0);
        }
        if (v2TIMOfflinePushInfo != null) {
            message.setOfflinePushInfo(v2TIMOfflinePushInfo.getMessageOfflinePushInfo());
        }
        message.setPlatform(Message.PLATFORM_ANDROID);
        String strSendMessage = MessageCenter.getInstance().sendMessage(message, new MessageUploadProgressCallback() { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.2
            @Override // com.tencent.imsdk.message.MessageUploadProgressCallback
            public void onUploadProgress(int i12, final int i13, final int i14) {
                IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        V2TIMSendCallback v2TIMSendCallback2 = v2TIMSendCallback;
                        if (v2TIMSendCallback2 != null) {
                            int i15 = i14;
                            v2TIMSendCallback2.onProgress(i15 > 0 ? (int) ((i13 / i15) * 100.0f) : 0);
                        }
                    }
                });
            }
        }, new IMCallback(new V2TIMValueCallback<Message>() { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.3
            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onError(int i12, String str3) {
                V2TIMSendCallback v2TIMSendCallback2 = v2TIMSendCallback;
                if (v2TIMSendCallback2 != null) {
                    v2TIMSendCallback2.onError(i12, str3);
                }
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onSuccess(Message message2) {
                if (v2TIMSendCallback != null) {
                    v2TIMMessage.setMessage(message2);
                    v2TIMSendCallback.onSuccess(v2TIMMessage);
                }
            }
        }) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.4
            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i12, String str3, Object obj) {
                Message message2 = v2TIMMessage.getMessage();
                message2.update((Message) obj);
                message2.setMessageStatus(3);
                super.fail(i12, str3, obj);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Object obj) {
                v2TIMMessage.getMessage().update((Message) obj);
                super.success(obj);
            }
        });
        BaseManager.getInstance().reportTUIComponentUsage(3L);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(14L);
        arrayList2.add(15L);
        BaseManager.getInstance().reportTUIPluginUsage(arrayList2);
        return strSendMessage;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void setAllReceiveMessageOpt(int i11, int i12, int i13, int i14, long j11, V2TIMCallback v2TIMCallback) {
        int i15;
        int i16 = 1;
        if (i11 == 0) {
            i15 = i16;
        } else if (i11 == 1) {
            i15 = 2;
        } else {
            i16 = 3;
            if (i11 != 2 && i11 != 3) {
                IMLog.m75914e(TAG, "setAllReceiveMessageOpt error opt = " + i11);
                if (v2TIMCallback != null) {
                    v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "opt is error");
                    return;
                }
                return;
            }
            i15 = i16;
        }
        RelationshipManager.getInstance().setAllReceiveMessageOpt(i15, i12, i13, i14, j11, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.9
            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i17, String str) {
                super.fail(i17, str);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Object obj) {
                super.success(obj);
            }
        });
    }

    private V2TIMMessageManagerImpl() {
        this.mLockObject = new Object();
        this.mV2TIMMsgListenerList = new CopyOnWriteArrayList();
    }

    private void getC2CMessageReadReceipts(List<V2TIMMessage> list, final V2TIMValueCallback<List<V2TIMMessageReceipt>> v2TIMValueCallback) {
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        for (V2TIMMessage v2TIMMessage : list) {
            if (v2TIMMessage != null && v2TIMMessage.getUserID() != null && !v2TIMMessage.getUserID().isEmpty() && v2TIMMessage.isSelf() && 2 == v2TIMMessage.getStatus() && v2TIMMessage.isNeedReadReceipt()) {
                arrayList.add(v2TIMMessage.getMsgID());
            }
        }
        if (arrayList.size() != 0) {
            findMessages(arrayList, new V2TIMValueCallback<List<V2TIMMessage>>() { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.44
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i11, str);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(List<V2TIMMessage> list2) {
                    Iterator<V2TIMMessage> it = list2.iterator();
                    while (it.hasNext()) {
                        Message message = it.next().getMessage();
                        C2CMessageReceipt c2CMessageReceipt = new C2CMessageReceipt();
                        c2CMessageReceipt.setUserID(message.getReceiverUserID());
                        c2CMessageReceipt.setMessageID(message.getMsgID());
                        c2CMessageReceipt.setPeerRead(message.isReceiptPeerRead());
                        c2CMessageReceipt.setReceiptTimestamp(message.getReceiptTime());
                        V2TIMMessageReceipt v2TIMMessageReceipt = new V2TIMMessageReceipt();
                        v2TIMMessageReceipt.setC2CMessageReceipt(c2CMessageReceipt);
                        arrayList2.add(v2TIMMessageReceipt);
                    }
                    if (arrayList2.size() > 0) {
                        V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                        if (v2TIMValueCallback2 != null) {
                            v2TIMValueCallback2.onSuccess(arrayList2);
                            return;
                        }
                        return;
                    }
                    V2TIMValueCallback v2TIMValueCallback3 = v2TIMValueCallback;
                    if (v2TIMValueCallback3 != null) {
                        v2TIMValueCallback3.onError(BaseConstants.ERR_INVALID_PARAMETERS, "invalid message list");
                    }
                }
            });
        } else if (v2TIMValueCallback != null) {
            v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "invalid message list");
        }
    }

    private void getGroupMessageReadReceipts(List<V2TIMMessage> list, final V2TIMValueCallback<List<V2TIMMessageReceipt>> v2TIMValueCallback) {
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        for (V2TIMMessage v2TIMMessage : list) {
            if (v2TIMMessage != null && v2TIMMessage.getGroupID() != null && v2TIMMessage.getGroupID().length() != 0 && v2TIMMessage.isSelf() && 2 == v2TIMMessage.getStatus() && v2TIMMessage.isNeedReadReceipt()) {
                Message message = v2TIMMessage.getMessage();
                if (message.getReceiptUnreadCount() == 0) {
                    GroupMessageReceipt groupMessageReceipt = new GroupMessageReceipt();
                    groupMessageReceipt.setGroupID(message.getGroupID());
                    groupMessageReceipt.setMsgID(message.getMsgID());
                    groupMessageReceipt.setReadCount(message.getReceiptReadCount());
                    groupMessageReceipt.setUnreadCount(message.getReceiptUnreadCount());
                    V2TIMMessageReceipt v2TIMMessageReceipt = new V2TIMMessageReceipt();
                    v2TIMMessageReceipt.setGroupMessageReceipt(groupMessageReceipt);
                    arrayList2.add(v2TIMMessageReceipt);
                } else {
                    arrayList.add(message.getMessageKey());
                }
            }
        }
        if (arrayList.size() != 0) {
            MessageCenter.getInstance().getGroupMessageReceipts(arrayList, new IMCallback<List<GroupMessageReceipt>>(new V2TIMValueCallback<List<GroupMessageReceipt>>() { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.45
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i11, str);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(List<GroupMessageReceipt> list2) {
                    for (GroupMessageReceipt groupMessageReceipt2 : list2) {
                        V2TIMMessageReceipt v2TIMMessageReceipt2 = new V2TIMMessageReceipt();
                        GroupMessageReceipt groupMessageReceipt3 = new GroupMessageReceipt();
                        groupMessageReceipt3.setGroupID(groupMessageReceipt2.getGroupID());
                        groupMessageReceipt3.setMsgID(groupMessageReceipt2.getMsgID());
                        groupMessageReceipt3.setReadCount(groupMessageReceipt2.getReadCount());
                        groupMessageReceipt3.setUnreadCount(groupMessageReceipt2.getUnreadCount());
                        v2TIMMessageReceipt2.setGroupMessageReceipt(groupMessageReceipt3);
                        arrayList2.add(v2TIMMessageReceipt2);
                    }
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onSuccess(arrayList2);
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.46
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(List<GroupMessageReceipt> list2) {
                    super.success(list2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str) {
                    super.fail(i11, str);
                }
            });
        } else if (arrayList2.size() > 0) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onSuccess(arrayList2);
            }
        } else if (v2TIMValueCallback != null) {
            v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "invalid messages");
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void addAdvancedMsgListener(V2TIMAdvancedMsgListener v2TIMAdvancedMsgListener) {
        if (v2TIMAdvancedMsgListener == null) {
            return;
        }
        synchronized (this.mLockObject) {
            try {
                if (this.mV2TIMMsgListenerList.contains(v2TIMAdvancedMsgListener)) {
                    return;
                }
                this.mV2TIMMsgListenerList.add(v2TIMAdvancedMsgListener);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void addMessageReaction(V2TIMMessage v2TIMMessage, String str, final V2TIMCallback v2TIMCallback) {
        if (v2TIMMessage == null) {
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "invalid message");
            }
        } else if (!TextUtils.isEmpty(str)) {
            MessageCenter.getInstance().addMessageReaction(v2TIMMessage.getMessage(), str, new IMCallback(new V2TIMCallback() { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.55
                @Override // com.tencent.imsdk.p128v2.V2TIMCallback
                public void onError(int i11, String str2) {
                    V2TIMCallback v2TIMCallback2 = v2TIMCallback;
                    if (v2TIMCallback2 != null) {
                        v2TIMCallback2.onError(i11, str2);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMCallback
                public void onSuccess() {
                    V2TIMCallback v2TIMCallback2 = v2TIMCallback;
                    if (v2TIMCallback2 != null) {
                        v2TIMCallback2.onSuccess();
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.56
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str2) {
                    super.fail(i11, str2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj) {
                    super.success(obj);
                }
            });
        } else if (v2TIMCallback != null) {
            v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "reactionID is empty");
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public V2TIMMessage createFaceMessage(int i11, byte[] bArr) {
        V2TIMMessage v2TIMMessage = new V2TIMMessage();
        Message message = v2TIMMessage.getMessage();
        FaceElement faceElement = new FaceElement();
        faceElement.setFaceData(bArr);
        faceElement.setFaceIndex(i11);
        message.addElement(faceElement);
        return v2TIMMessage;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public V2TIMMessage createLocationMessage(String str, double d11, double d12) {
        V2TIMMessage v2TIMMessage = new V2TIMMessage();
        Message message = v2TIMMessage.getMessage();
        LocationElement locationElement = new LocationElement();
        locationElement.setLongitude(d11);
        locationElement.setLatitude(d12);
        locationElement.setDescription(str);
        message.addElement(locationElement);
        return v2TIMMessage;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void deleteMessageExtensions(V2TIMMessage v2TIMMessage, List<String> list, final V2TIMValueCallback<List<V2TIMMessageExtensionResult>> v2TIMValueCallback) {
        if (v2TIMMessage != null) {
            MessageCenter.getInstance().deleteMessageExtensions(v2TIMMessage.getMessage(), list, new IMCallback(new V2TIMValueCallback<List<MessageExtensionResult>>() { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.53
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i11, str);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(List<MessageExtensionResult> list2) {
                    if (v2TIMValueCallback != null) {
                        ArrayList arrayList = new ArrayList();
                        for (MessageExtensionResult messageExtensionResult : list2) {
                            V2TIMMessageExtensionResult v2TIMMessageExtensionResult = new V2TIMMessageExtensionResult();
                            v2TIMMessageExtensionResult.setMessageExtensionResult(messageExtensionResult);
                            arrayList.add(v2TIMMessageExtensionResult);
                        }
                        v2TIMValueCallback.onSuccess(arrayList);
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.54
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str) {
                    super.fail(i11, str);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj) {
                    super.success(obj);
                }
            });
        } else if (v2TIMValueCallback != null) {
            v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "invalid message");
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void deleteMessageFromLocalStorage(V2TIMMessage v2TIMMessage, V2TIMCallback v2TIMCallback) {
        if (v2TIMMessage != null) {
            MessageCenter.getInstance().deleteLocalMessage(v2TIMMessage.getMessage(), new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.28
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str) {
                    super.fail(i11, str);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj) {
                    super.success(obj);
                }
            });
        } else if (v2TIMCallback != null) {
            v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "message is null");
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void deleteMessages(List<V2TIMMessage> list, V2TIMCallback v2TIMCallback) {
        if (list == null || list.isEmpty()) {
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "messages is invalid");
            }
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<V2TIMMessage> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getMessage().getMessageKey());
            }
            MessageCenter.getInstance().deleteCloudMessageList(arrayList, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.29
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str) {
                    super.fail(i11, str);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj) {
                    super.success(obj);
                }
            });
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void findMessages(List<String> list, final V2TIMValueCallback<List<V2TIMMessage>> v2TIMValueCallback) {
        if (list != null && !list.isEmpty()) {
            MessageCenter.getInstance().findMessageByMessageId(list, new IMCallback<List<Message>>(new V2TIMValueCallback<List<Message>>() { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.36
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i11, str);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(List<Message> list2) {
                    ArrayList arrayList = new ArrayList();
                    for (Message message : list2) {
                        V2TIMMessage v2TIMMessage = new V2TIMMessage();
                        v2TIMMessage.setMessage(message);
                        arrayList.add(v2TIMMessage);
                    }
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onSuccess(arrayList);
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.37
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(List<Message> list2) {
                    super.success(list2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str) {
                    super.fail(i11, str);
                }
            });
        } else if (v2TIMValueCallback != null) {
            v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "messages is empty");
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void getAllReceiveMessageOpt(final V2TIMValueCallback<V2TIMReceiveMessageOptInfo> v2TIMValueCallback) {
        RelationshipManager.getInstance().getAllReceiveMessageOpt(new IMCallback<ReceiveMessageOptInfo>(new V2TIMValueCallback<ReceiveMessageOptInfo>() { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.11
            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onError(int i11, String str) {
                V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                if (v2TIMValueCallback2 != null) {
                    v2TIMValueCallback2.onError(i11, str);
                }
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onSuccess(ReceiveMessageOptInfo receiveMessageOptInfo) {
                if (v2TIMValueCallback != null) {
                    V2TIMReceiveMessageOptInfo v2TIMReceiveMessageOptInfo = new V2TIMReceiveMessageOptInfo();
                    v2TIMReceiveMessageOptInfo.setReceiveMessageOptInfo(receiveMessageOptInfo);
                    v2TIMValueCallback.onSuccess(v2TIMReceiveMessageOptInfo);
                }
            }
        }) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.12
            @Override // com.tencent.imsdk.common.IMCallback
            public void success(ReceiveMessageOptInfo receiveMessageOptInfo) {
                super.success(receiveMessageOptInfo);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str) {
                super.fail(i11, str);
            }
        });
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void getAllUserListOfMessageReaction(V2TIMMessage v2TIMMessage, String str, int i11, int i12, final V2TIMValueCallback<V2TIMMessageReactionUserResult> v2TIMValueCallback) {
        if (v2TIMMessage == null) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "invalid message");
            }
        } else if (!TextUtils.isEmpty(str)) {
            MessageCenter.getInstance().getAllUserListOfMessageReaction(v2TIMMessage.getMessage(), str, i11, i12, new IMCallback<MessageReactionUserResult>(new V2TIMValueCallback<MessageReactionUserResult>() { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.61
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i13, String str2) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i13, str2);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(MessageReactionUserResult messageReactionUserResult) {
                    V2TIMMessageReactionUserResult v2TIMMessageReactionUserResult = new V2TIMMessageReactionUserResult();
                    v2TIMMessageReactionUserResult.setMessageReactionUserResult(messageReactionUserResult);
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onSuccess(v2TIMMessageReactionUserResult);
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.62
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(MessageReactionUserResult messageReactionUserResult) {
                    super.success(messageReactionUserResult);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i13, String str2) {
                    super.fail(i13, str2);
                }
            });
        } else if (v2TIMValueCallback != null) {
            v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "reactionID is empty");
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void getC2CReceiveMessageOpt(List<String> list, final V2TIMValueCallback<List<V2TIMReceiveMessageOptInfo>> v2TIMValueCallback) {
        if (list != null && list.size() != 0) {
            RelationshipManager.getInstance().getC2CReceiveMessageOpt(list, new IMCallback<List<ReceiveMessageOptInfo>>(new V2TIMValueCallback<List<ReceiveMessageOptInfo>>() { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.6
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i11, str);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(List<ReceiveMessageOptInfo> list2) {
                    if (v2TIMValueCallback != null) {
                        ArrayList arrayList = new ArrayList();
                        for (ReceiveMessageOptInfo receiveMessageOptInfo : list2) {
                            V2TIMReceiveMessageOptInfo v2TIMReceiveMessageOptInfo = new V2TIMReceiveMessageOptInfo();
                            v2TIMReceiveMessageOptInfo.setUserID(receiveMessageOptInfo.getUserID());
                            v2TIMReceiveMessageOptInfo.setC2CReceiveMessageOpt(receiveMessageOptInfo.getReceiveMessageOpt());
                            arrayList.add(v2TIMReceiveMessageOptInfo);
                        }
                        v2TIMValueCallback.onSuccess(arrayList);
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.7
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(List<ReceiveMessageOptInfo> list2) {
                    super.success(list2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str) {
                    super.fail(i11, str);
                }
            });
        } else if (v2TIMValueCallback != null) {
            v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "invalid userIDList");
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void getGroupMessageReadMemberList(V2TIMMessage v2TIMMessage, final int i11, long j11, int i12, final V2TIMValueCallback<V2TIMGroupMessageReadMemberList> v2TIMValueCallback) {
        if (v2TIMMessage == null || v2TIMMessage.getGroupID() == null || v2TIMMessage.getGroupID().length() == 0 || !v2TIMMessage.isSelf() || 2 != v2TIMMessage.getStatus() || !v2TIMMessage.isNeedReadReceipt()) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "invalid message");
            }
        } else if (i12 > 100) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "invalid count, maximum support 100");
            }
        } else {
            MessageCenter.getInstance().getGroupMessageReadMembers(v2TIMMessage.getMessage(), i11, j11, i12, new IMCallback<GroupMessageReadMembers>(new V2TIMValueCallback<GroupMessageReadMembers>() { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.47
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i13, String str) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i13, str);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(GroupMessageReadMembers groupMessageReadMembers) {
                    if (v2TIMValueCallback != null) {
                        V2TIMGroupMessageReadMemberList v2TIMGroupMessageReadMemberList = new V2TIMGroupMessageReadMemberList();
                        v2TIMGroupMessageReadMemberList.setMessageReadMembers(groupMessageReadMembers, i11);
                        v2TIMValueCallback.onSuccess(v2TIMGroupMessageReadMemberList);
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.48
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(GroupMessageReadMembers groupMessageReadMembers) {
                    super.success(groupMessageReadMembers);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i13, String str) {
                    super.fail(i13, str);
                }
            });
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void getHistoryMessageList(V2TIMMessageListGetOption v2TIMMessageListGetOption, final V2TIMValueCallback<List<V2TIMMessage>> v2TIMValueCallback) {
        if (v2TIMMessageListGetOption == null) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "option is null");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(v2TIMMessageListGetOption.getUserID()) && TextUtils.isEmpty(v2TIMMessageListGetOption.getGroupID())) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "groupID and userID cannot be null at the same time");
                return;
            }
            return;
        }
        if (!TextUtils.isEmpty(v2TIMMessageListGetOption.getUserID()) && !TextUtils.isEmpty(v2TIMMessageListGetOption.getGroupID())) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "groupID and userID cannot set at the same time");
                return;
            }
            return;
        }
        MessageListGetOption messageListGetOption = new MessageListGetOption();
        messageListGetOption.setCount(v2TIMMessageListGetOption.getCount());
        messageListGetOption.setGetTimeBegin(v2TIMMessageListGetOption.getGetTimeBegin());
        messageListGetOption.setGetTimePeriod(v2TIMMessageListGetOption.getGetTimePeriod());
        int getType = v2TIMMessageListGetOption.getGetType();
        if (getType == 1) {
            messageListGetOption.setToOlderMessage(true);
            messageListGetOption.setGetCloudMessage(true);
        } else if (getType == 2) {
            messageListGetOption.setToOlderMessage(false);
            messageListGetOption.setGetCloudMessage(true);
        } else if (getType == 3) {
            messageListGetOption.setToOlderMessage(true);
            messageListGetOption.setGetCloudMessage(false);
            messageListGetOption.setMessageTypeList(v2TIMMessageListGetOption.getMessageTypeList());
        } else if (getType != 4) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "getType is invalid");
                return;
            }
            return;
        } else {
            messageListGetOption.setToOlderMessage(false);
            messageListGetOption.setGetCloudMessage(false);
            messageListGetOption.setMessageTypeList(v2TIMMessageListGetOption.getMessageTypeList());
        }
        if (v2TIMMessageListGetOption.getLastMsg() != null) {
            messageListGetOption.setMessageKey(v2TIMMessageListGetOption.getLastMsg().getMessage().getMessageKey());
        } else if (!TextUtils.isEmpty(v2TIMMessageListGetOption.getGroupID()) && v2TIMMessageListGetOption.getLastMsgSeq() > 0) {
            MessageKey messageKey = new MessageKey();
            messageKey.setSeq(v2TIMMessageListGetOption.getLastMsgSeq());
            messageListGetOption.setMessageKey(messageKey);
        }
        messageListGetOption.setMessageSequenceList(v2TIMMessageListGetOption.getMessageSeqList());
        V2TIMValueCallback<List<Message>> v2TIMValueCallback2 = new V2TIMValueCallback<List<Message>>() { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.17
            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onError(int i11, String str) {
                V2TIMValueCallback v2TIMValueCallback3 = v2TIMValueCallback;
                if (v2TIMValueCallback3 != null) {
                    v2TIMValueCallback3.onError(i11, str);
                }
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onSuccess(List<Message> list) {
                ArrayList arrayList = new ArrayList();
                for (Message message : list) {
                    V2TIMMessage v2TIMMessage = new V2TIMMessage();
                    v2TIMMessage.setMessage(message);
                    arrayList.add(v2TIMMessage);
                }
                V2TIMValueCallback v2TIMValueCallback3 = v2TIMValueCallback;
                if (v2TIMValueCallback3 != null) {
                    v2TIMValueCallback3.onSuccess(arrayList);
                }
            }
        };
        if (TextUtils.isEmpty(v2TIMMessageListGetOption.getUserID())) {
            MessageCenter.getInstance().getGroupHistoryMessageList(v2TIMMessageListGetOption.getGroupID(), messageListGetOption, new IMCallback<List<Message>>(v2TIMValueCallback2) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.19
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(List<Message> list) {
                    super.success(list);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str) {
                    super.fail(i11, str);
                }
            });
        } else {
            MessageCenter.getInstance().getC2CHistoryMessageList(v2TIMMessageListGetOption.getUserID(), messageListGetOption, new IMCallback<List<Message>>(v2TIMValueCallback2) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.18
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(List<Message> list) {
                    super.success(list);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str) {
                    super.fail(i11, str);
                }
            });
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void getMessageExtensions(V2TIMMessage v2TIMMessage, final V2TIMValueCallback<List<V2TIMMessageExtension>> v2TIMValueCallback) {
        if (v2TIMMessage != null) {
            MessageCenter.getInstance().getMessageExtensions(v2TIMMessage.getMessage(), new IMCallback<List<MessageExtension>>(new V2TIMValueCallback<List<MessageExtension>>() { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.51
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i11, str);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(List<MessageExtension> list) {
                    if (v2TIMValueCallback != null) {
                        ArrayList arrayList = new ArrayList();
                        for (MessageExtension messageExtension : list) {
                            V2TIMMessageExtension v2TIMMessageExtension = new V2TIMMessageExtension();
                            v2TIMMessageExtension.setMessageExtension(messageExtension);
                            arrayList.add(v2TIMMessageExtension);
                        }
                        v2TIMValueCallback.onSuccess(arrayList);
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.52
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(List<MessageExtension> list) {
                    super.success(list);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str) {
                    super.fail(i11, str);
                }
            });
        } else if (v2TIMValueCallback != null) {
            v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "invalid message");
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void getMessageReadReceipts(List<V2TIMMessage> list, V2TIMValueCallback<List<V2TIMMessageReceipt>> v2TIMValueCallback) {
        if (list == null || list.size() == 0) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "invalid message list");
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        V2TIMMessage v2TIMMessage = arrayList.get(0);
        if (v2TIMMessage.getUserID() == null || v2TIMMessage.getUserID().isEmpty()) {
            getGroupMessageReadReceipts(arrayList, v2TIMValueCallback);
        } else {
            getC2CMessageReadReceipts(arrayList, v2TIMValueCallback);
        }
    }

    public void initListener() {
        this.mMessageListener = new MessageListener() { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.1
            @Override // com.tencent.imsdk.message.MessageListener
            public void onGroupMessagePinned(String str, Message message, boolean z11, GroupMemberInfo groupMemberInfo) {
                V2TIMMessage v2TIMMessage = new V2TIMMessage();
                v2TIMMessage.setMessage(message);
                V2TIMGroupMemberInfo v2TIMGroupMemberInfo = new V2TIMGroupMemberInfo();
                v2TIMGroupMemberInfo.setGroupMemberInfo(groupMemberInfo);
                synchronized (V2TIMMessageManagerImpl.this.mLockObject) {
                    try {
                        Iterator it = V2TIMMessageManagerImpl.this.mV2TIMMsgListenerList.iterator();
                        while (it.hasNext()) {
                            ((V2TIMAdvancedMsgListener) it.next()).onGroupMessagePinned(str, v2TIMMessage, z11, v2TIMGroupMemberInfo);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // com.tencent.imsdk.message.MessageListener
            public void onReceiveC2CMessageReceipt(List<C2CMessageReceipt> list) {
                ArrayList arrayList = new ArrayList();
                boolean z11 = false;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    C2CMessageReceipt c2CMessageReceipt = list.get(i11);
                    V2TIMMessageReceipt v2TIMMessageReceipt = new V2TIMMessageReceipt();
                    v2TIMMessageReceipt.setC2CMessageReceipt(c2CMessageReceipt);
                    arrayList.add(v2TIMMessageReceipt);
                    if (i11 == 0) {
                        z11 = !TextUtils.isEmpty(c2CMessageReceipt.getMessageID());
                    }
                }
                synchronized (V2TIMMessageManagerImpl.this.mLockObject) {
                    try {
                        for (V2TIMAdvancedMsgListener v2TIMAdvancedMsgListener : V2TIMMessageManagerImpl.this.mV2TIMMsgListenerList) {
                            if (z11) {
                                v2TIMAdvancedMsgListener.onRecvMessageReadReceipts(arrayList);
                            } else {
                                v2TIMAdvancedMsgListener.onRecvC2CReadReceipt(arrayList);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // com.tencent.imsdk.message.MessageListener
            public void onReceiveGroupMessageReceipt(List<GroupMessageReceipt> list) {
                ArrayList arrayList = new ArrayList();
                for (GroupMessageReceipt groupMessageReceipt : list) {
                    V2TIMMessageReceipt v2TIMMessageReceipt = new V2TIMMessageReceipt();
                    v2TIMMessageReceipt.setGroupMessageReceipt(groupMessageReceipt);
                    arrayList.add(v2TIMMessageReceipt);
                }
                synchronized (V2TIMMessageManagerImpl.this.mLockObject) {
                    try {
                        Iterator it = V2TIMMessageManagerImpl.this.mV2TIMMsgListenerList.iterator();
                        while (it.hasNext()) {
                            ((V2TIMAdvancedMsgListener) it.next()).onRecvMessageReadReceipts(arrayList);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // com.tencent.imsdk.message.MessageListener
            public void onReceiveMessageExtensionsChanged(MessageKey messageKey, List<MessageExtension> list) {
                String messageID = messageKey != null ? messageKey.getMessageID() : "";
                ArrayList arrayList = new ArrayList();
                for (MessageExtension messageExtension : list) {
                    V2TIMMessageExtension v2TIMMessageExtension = new V2TIMMessageExtension();
                    v2TIMMessageExtension.setMessageExtension(messageExtension);
                    arrayList.add(v2TIMMessageExtension);
                }
                synchronized (V2TIMMessageManagerImpl.this.mLockObject) {
                    try {
                        Iterator it = V2TIMMessageManagerImpl.this.mV2TIMMsgListenerList.iterator();
                        while (it.hasNext()) {
                            ((V2TIMAdvancedMsgListener) it.next()).onRecvMessageExtensionsChanged(messageID, arrayList);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // com.tencent.imsdk.message.MessageListener
            public void onReceiveMessageExtensionsDeleted(MessageKey messageKey, List<MessageExtension> list) {
                String messageID = messageKey != null ? messageKey.getMessageID() : "";
                ArrayList arrayList = new ArrayList();
                Iterator<MessageExtension> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getExtensionKey());
                }
                synchronized (V2TIMMessageManagerImpl.this.mLockObject) {
                    try {
                        Iterator it2 = V2TIMMessageManagerImpl.this.mV2TIMMsgListenerList.iterator();
                        while (it2.hasNext()) {
                            ((V2TIMAdvancedMsgListener) it2.next()).onRecvMessageExtensionsDeleted(messageID, arrayList);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // com.tencent.imsdk.message.MessageListener
            public void onReceiveMessageReactionsChanged(List<MessageReactionChangeInfo> list) {
                ArrayList arrayList = new ArrayList();
                for (MessageReactionChangeInfo messageReactionChangeInfo : list) {
                    V2TIMMessageReactionChangeInfo v2TIMMessageReactionChangeInfo = new V2TIMMessageReactionChangeInfo();
                    v2TIMMessageReactionChangeInfo.setMessageReactionChangeInfo(messageReactionChangeInfo);
                    arrayList.add(v2TIMMessageReactionChangeInfo);
                }
                synchronized (V2TIMMessageManagerImpl.this.mLockObject) {
                    try {
                        Iterator it = V2TIMMessageManagerImpl.this.mV2TIMMsgListenerList.iterator();
                        while (it.hasNext()) {
                            ((V2TIMAdvancedMsgListener) it.next()).onRecvMessageReactionsChanged(arrayList);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // com.tencent.imsdk.message.MessageListener
            public void onReceiveNewMessage(List<Message> list) {
                if (list == null || list.isEmpty()) {
                    return;
                }
                for (Message message : list) {
                    V2TIMMessage v2TIMMessage = new V2TIMMessage();
                    v2TIMMessage.setMessage(message);
                    if (message.isPushMessage()) {
                        BaseManager.getInstance().notifyExperimentalNotify("onRecvPushMessage", v2TIMMessage);
                    } else {
                        V2TIMMessageManagerImpl.this.onRecvNewMessage(v2TIMMessage);
                    }
                }
            }

            @Override // com.tencent.imsdk.message.MessageListener
            public void onRecvTTSResponse(String str, List<byte[]> list, boolean z11) {
                V2TIMTTSResponse v2TIMTTSResponse = new V2TIMTTSResponse();
                v2TIMTTSResponse.setMsgID(str);
                v2TIMTTSResponse.setAudioDataList(list);
                v2TIMTTSResponse.setFinished(z11);
                synchronized (V2TIMMessageManagerImpl.this.mLockObject) {
                    try {
                        Iterator it = V2TIMMessageManagerImpl.this.mV2TIMMsgListenerList.iterator();
                        while (it.hasNext()) {
                            ((V2TIMAdvancedMsgListener) it.next()).onRecvTTSResponse(v2TIMTTSResponse);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // com.tencent.imsdk.message.MessageListener
            public void onReceiveMessageModified(List<Message> list) {
                for (Message message : list) {
                    V2TIMMessage v2TIMMessage = new V2TIMMessage();
                    v2TIMMessage.setMessage(message);
                    synchronized (V2TIMMessageManagerImpl.this.mLockObject) {
                        try {
                            Iterator it = V2TIMMessageManagerImpl.this.mV2TIMMsgListenerList.iterator();
                            while (it.hasNext()) {
                                ((V2TIMAdvancedMsgListener) it.next()).onRecvMessageModified(v2TIMMessage);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }

            @Override // com.tencent.imsdk.message.MessageListener
            public void onReceiveMessageRevoked(Map<MessageKey, Map<UserInfo, String>> map, boolean z11) {
                for (Map.Entry<MessageKey, Map<UserInfo, String>> entry : map.entrySet()) {
                    MessageKey key = entry.getKey();
                    Map<UserInfo, String> value = entry.getValue();
                    UserInfo next = value.keySet().iterator().next();
                    String str = value.get(next);
                    String messageID = key.getMessageID();
                    V2TIMUserFullInfo v2TIMUserFullInfo = new V2TIMUserFullInfo();
                    v2TIMUserFullInfo.setUserInfo(next);
                    synchronized (V2TIMMessageManagerImpl.this.mLockObject) {
                        if (z11) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("messageID", messageID);
                                jSONObject.put("userID", v2TIMUserFullInfo.getUserID());
                                BaseManager.getInstance().notifyExperimentalNotify("onRevokePushMessage", jSONObject);
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        } else {
                            for (V2TIMAdvancedMsgListener v2TIMAdvancedMsgListener : V2TIMMessageManagerImpl.this.mV2TIMMsgListenerList) {
                                v2TIMAdvancedMsgListener.onRecvMessageRevoked(messageID);
                                v2TIMAdvancedMsgListener.onRecvMessageRevoked(messageID, v2TIMUserFullInfo, str);
                            }
                        }
                    }
                }
            }
        };
        MessageCenter.getInstance().addMessageListener(this.mMessageListener);
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public String insertC2CMessageToLocalStorage(final V2TIMMessage v2TIMMessage, String str, String str2, final V2TIMValueCallback<V2TIMMessage> v2TIMValueCallback) {
        if (v2TIMMessage == null) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "message is null!");
            }
            return "";
        }
        if (TextUtils.isEmpty(str)) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "userID is empty");
            }
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "sender is empty");
            }
            return "";
        }
        Message message = v2TIMMessage.getMessage();
        message.setMessageType(Message.MESSAGE_TYPE_C2C);
        message.setSenderUserID(str2);
        message.setReceiverUserID(str);
        return MessageCenter.getInstance().insertLocalMessage(message, new IMCallback(new V2TIMValueCallback<Message>() { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.34
            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onError(int i11, String str3) {
                V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                if (v2TIMValueCallback2 != null) {
                    v2TIMValueCallback2.onError(i11, str3);
                }
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onSuccess(Message message2) {
                if (v2TIMValueCallback != null) {
                    v2TIMMessage.setMessage(message2);
                    v2TIMValueCallback.onSuccess(v2TIMMessage);
                }
            }
        }) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.35
            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Object obj) {
                v2TIMMessage.getMessage().update((Message) obj);
                super.success(obj);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str3) {
                super.fail(i11, str3);
            }
        });
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public String insertGroupMessageToLocalStorage(final V2TIMMessage v2TIMMessage, String str, String str2, final V2TIMValueCallback<V2TIMMessage> v2TIMValueCallback) {
        if (v2TIMMessage == null) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "message is null!");
            }
            return "";
        }
        if (TextUtils.isEmpty(str)) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "groupID is empty");
            }
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "sender is empty");
            }
            return "";
        }
        Message message = v2TIMMessage.getMessage();
        message.setMessageType(Message.MESSAGE_TYPE_GROUP);
        message.setSenderUserID(str2);
        message.setGroupID(str);
        return MessageCenter.getInstance().insertLocalMessage(message, new IMCallback(new V2TIMValueCallback<Message>() { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.32
            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onError(int i11, String str3) {
                V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                if (v2TIMValueCallback2 != null) {
                    v2TIMValueCallback2.onError(i11, str3);
                }
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onSuccess(Message message2) {
                if (v2TIMValueCallback != null) {
                    v2TIMMessage.setMessage(message2);
                    v2TIMValueCallback.onSuccess(v2TIMMessage);
                }
            }
        }) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.33
            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Object obj) {
                v2TIMMessage.getMessage().update((Message) obj);
                super.success(obj);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str3) {
                super.fail(i11, str3);
            }
        });
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void modifyMessage(V2TIMMessage v2TIMMessage, final V2TIMCompleteCallback<V2TIMMessage> v2TIMCompleteCallback) {
        if (v2TIMMessage != null) {
            MessageCenter.getInstance().modifyMessage(v2TIMMessage.getMessage(), new IMCallback(new V2TIMCompleteCallback<Message>() { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.21
                @Override // com.tencent.imsdk.p128v2.V2TIMCompleteCallback
                public void onComplete(int i11, String str, Message message) {
                    V2TIMMessage v2TIMMessage2;
                    if (message != null) {
                        v2TIMMessage2 = new V2TIMMessage();
                        v2TIMMessage2.setMessage(message);
                    } else {
                        v2TIMMessage2 = null;
                    }
                    V2TIMCompleteCallback v2TIMCompleteCallback2 = v2TIMCompleteCallback;
                    if (v2TIMCompleteCallback2 != null) {
                        v2TIMCompleteCallback2.onComplete(i11, str, v2TIMMessage2);
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.22
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str, Object obj) {
                    super.fail(i11, str, obj);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj) {
                    super.success(obj);
                }
            });
        } else if (v2TIMCompleteCallback != null) {
            v2TIMCompleteCallback.onComplete(BaseConstants.ERR_INVALID_PARAMETERS, "msg is null", null);
        }
    }

    public void onRecvNewMessage(V2TIMMessage v2TIMMessage) {
        synchronized (this.mLockObject) {
            try {
                Iterator<V2TIMAdvancedMsgListener> it = this.mV2TIMMsgListenerList.iterator();
                while (it.hasNext()) {
                    it.next().onRecvNewMessage(v2TIMMessage);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void removeAdvancedMsgListener(V2TIMAdvancedMsgListener v2TIMAdvancedMsgListener) {
        if (v2TIMAdvancedMsgListener == null) {
            return;
        }
        synchronized (this.mLockObject) {
            this.mV2TIMMsgListenerList.remove(v2TIMAdvancedMsgListener);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void removeMessageReaction(V2TIMMessage v2TIMMessage, String str, final V2TIMCallback v2TIMCallback) {
        if (v2TIMMessage == null) {
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "invalid message");
            }
        } else if (!TextUtils.isEmpty(str)) {
            MessageCenter.getInstance().removeMessageReaction(v2TIMMessage.getMessage(), str, new IMCallback(new V2TIMCallback() { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.57
                @Override // com.tencent.imsdk.p128v2.V2TIMCallback
                public void onError(int i11, String str2) {
                    V2TIMCallback v2TIMCallback2 = v2TIMCallback;
                    if (v2TIMCallback2 != null) {
                        v2TIMCallback2.onError(i11, str2);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMCallback
                public void onSuccess() {
                    V2TIMCallback v2TIMCallback2 = v2TIMCallback;
                    if (v2TIMCallback2 != null) {
                        v2TIMCallback2.onSuccess();
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.58
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str2) {
                    super.fail(i11, str2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj) {
                    super.success(obj);
                }
            });
        } else if (v2TIMCallback != null) {
            v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "reactionID is empty");
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void revokeMessage(final V2TIMMessage v2TIMMessage, V2TIMCallback v2TIMCallback) {
        if (v2TIMMessage == null) {
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "msg is null");
            }
        } else if (v2TIMMessage.getStatus() == 2) {
            MessageCenter.getInstance().revokeMessage(v2TIMMessage.getMessage().getMessageKey(), new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.20
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj) {
                    v2TIMMessage.getMessage().setMessageStatus(6);
                    super.success(obj);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str) {
                    super.fail(i11, str);
                }
            });
        } else if (v2TIMCallback != null) {
            v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "msg status must be V2TIM_MSG_STATUS_SEND_SUCC");
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void sendMessageReadReceipts(List<V2TIMMessage> list, final V2TIMCallback v2TIMCallback) {
        if (list == null || list.size() == 0) {
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "invalid messageList");
                return;
            }
            return;
        }
        final ArrayList<V2TIMMessage> arrayList = new ArrayList();
        arrayList.addAll(list);
        ArrayList arrayList2 = new ArrayList();
        for (V2TIMMessage v2TIMMessage : arrayList) {
            if (v2TIMMessage != null && true != v2TIMMessage.isSelf() && v2TIMMessage.isNeedReadReceipt()) {
                Message message = v2TIMMessage.getMessage();
                if (!message.isHasSentReceipt()) {
                    arrayList2.add(message.getMessageKey());
                }
            }
        }
        if (arrayList2.size() != 0) {
            MessageCenter.getInstance().sendMessageReceipts(arrayList2, new IMCallback(new V2TIMCallback() { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.42
                @Override // com.tencent.imsdk.p128v2.V2TIMCallback
                public void onError(int i11, String str) {
                    V2TIMCallback v2TIMCallback2 = v2TIMCallback;
                    if (v2TIMCallback2 != null) {
                        v2TIMCallback2.onError(i11, str);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMCallback
                public void onSuccess() {
                    V2TIMCallback v2TIMCallback2 = v2TIMCallback;
                    if (v2TIMCallback2 != null) {
                        v2TIMCallback2.onSuccess();
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.43
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((V2TIMMessage) it.next()).getMessage().setHasSentReceipt(true);
                    }
                    super.success(obj);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str) {
                    super.fail(i11, str);
                }
            });
        } else if (v2TIMCallback != null) {
            v2TIMCallback.onSuccess();
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void setC2CReceiveMessageOpt(List<String> list, int i11, V2TIMCallback v2TIMCallback) {
        if (list == null || list.size() == 0) {
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "invalid userIDList");
                return;
            }
            return;
        }
        int i12 = 1;
        if (i11 != 0) {
            if (i11 == 1) {
                i12 = 2;
            } else {
                if (i11 != 2) {
                    IMLog.m75914e(TAG, "setC2CReceiveMessageOpt error opt = " + i11);
                    if (v2TIMCallback != null) {
                        v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "opt is error");
                        return;
                    }
                    return;
                }
                i12 = 3;
            }
        }
        RelationshipManager.getInstance().setC2CReceiveMessageOpt(list, i12, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.5
            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i13, String str) {
                super.fail(i13, str);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Object obj) {
                super.success(obj);
            }
        });
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void setMessageExtensions(V2TIMMessage v2TIMMessage, List<V2TIMMessageExtension> list, final V2TIMValueCallback<List<V2TIMMessageExtensionResult>> v2TIMValueCallback) {
        if (v2TIMMessage == null) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "invalid message");
                return;
            }
            return;
        }
        if (list == null) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "extensions cannot be null");
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (V2TIMMessageExtension v2TIMMessageExtension : list) {
            if (TextUtils.isEmpty(v2TIMMessageExtension.getExtensionKey())) {
                if (v2TIMValueCallback != null) {
                    v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "empty extensionKey");
                    return;
                }
                return;
            } else {
                MessageExtension messageExtension = new MessageExtension();
                messageExtension.setExtensionKey(v2TIMMessageExtension.getExtensionKey());
                messageExtension.setExtensionValue(v2TIMMessageExtension.getExtensionValue());
                arrayList.add(messageExtension);
            }
        }
        MessageCenter.getInstance().setMessageExtensions(v2TIMMessage.getMessage(), arrayList, new IMCallback<List<MessageExtensionResult>>(new V2TIMValueCallback<List<MessageExtensionResult>>() { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.49
            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onError(int i11, String str) {
                V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                if (v2TIMValueCallback2 != null) {
                    v2TIMValueCallback2.onError(i11, str);
                }
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onSuccess(List<MessageExtensionResult> list2) {
                if (v2TIMValueCallback != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (MessageExtensionResult messageExtensionResult : list2) {
                        V2TIMMessageExtensionResult v2TIMMessageExtensionResult = new V2TIMMessageExtensionResult();
                        v2TIMMessageExtensionResult.setMessageExtensionResult(messageExtensionResult);
                        arrayList2.add(v2TIMMessageExtensionResult);
                    }
                    v2TIMValueCallback.onSuccess(arrayList2);
                }
            }
        }) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.50
            @Override // com.tencent.imsdk.common.IMCallback
            public void success(List<MessageExtensionResult> list2) {
                super.success(list2);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str) {
                super.fail(i11, str);
            }
        });
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void translateText(List<String> list, String str, String str2, V2TIMValueCallback<HashMap<String, String>> v2TIMValueCallback) {
        if (list == null || list.isEmpty()) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "sourceTextList is empty");
            }
        } else if (!TextUtils.isEmpty(str2)) {
            MessageCenter.getInstance().translateText(list, str, str2, new IMCallback(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.63
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str3) {
                    super.fail(i11, str3);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj) {
                    super.success(obj);
                }
            });
        } else if (v2TIMValueCallback != null) {
            v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "targetLanguage is empty");
        }
    }

    public static V2TIMMessageManagerImpl getInstance() {
        return V2TIMMessageManagerImplHolder.v2TIMMessageManagerImpl;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void clearC2CHistoryMessage(String str, V2TIMCallback v2TIMCallback) {
        if (TextUtils.isEmpty(str)) {
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "userID is empty");
                return;
            }
            return;
        }
        MessageCenter.getInstance().clearC2CHistoryMessage(str, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.30
            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str2) {
                super.fail(i11, str2);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Object obj) {
                super.success(obj);
            }
        });
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void clearGroupHistoryMessage(String str, V2TIMCallback v2TIMCallback) {
        if (TextUtils.isEmpty(str)) {
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "groupID is empty");
                return;
            }
            return;
        }
        MessageCenter.getInstance().clearGroupHistoryMessage(str, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.31
            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str2) {
                super.fail(i11, str2);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Object obj) {
                super.success(obj);
            }
        });
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public V2TIMMessage createFileMessage(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            IMLog.m75914e(TAG, "filePath cannot be empty");
            return null;
        }
        if (!new File(str).exists()) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            IMLog.m75914e(TAG, "fileName cannot be empty");
            return null;
        }
        V2TIMMessage v2TIMMessage = new V2TIMMessage();
        Message message = v2TIMMessage.getMessage();
        FileElement fileElement = new FileElement();
        fileElement.setFilePath(str);
        fileElement.setFileName(str2);
        message.addElement(fileElement);
        return v2TIMMessage;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public V2TIMMessage createImageMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            IMLog.m75914e(TAG, "imagePath cannot be empty");
            return null;
        }
        if (!new File(str).exists()) {
            IMLog.m75914e(TAG, "file not exist");
            return null;
        }
        V2TIMMessage v2TIMMessage = new V2TIMMessage();
        Message message = v2TIMMessage.getMessage();
        ImageElement imageElement = new ImageElement();
        imageElement.setOriginImageFilePath(str);
        message.addElement(imageElement);
        return v2TIMMessage;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public V2TIMMessage createSoundMessage(String str, int i11) {
        if (TextUtils.isEmpty(str)) {
            IMLog.m75914e(TAG, "soundPath cannot be empty");
            return null;
        }
        if (!new File(str).exists()) {
            IMLog.m75914e(TAG, "file not exist");
            return null;
        }
        V2TIMMessage v2TIMMessage = new V2TIMMessage();
        Message message = v2TIMMessage.getMessage();
        SoundElement soundElement = new SoundElement();
        if (i11 < 0) {
            i11 = 0;
        }
        soundElement.setSoundDuration(i11);
        soundElement.setSoundFilePath(str);
        message.addElement(soundElement);
        return v2TIMMessage;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public V2TIMMessage createTextAtMessage(String str, List<String> list) {
        if (TextUtils.isEmpty(str)) {
            IMLog.m75914e(TAG, "text cannot be empty");
            return null;
        }
        if (list != null && !list.isEmpty()) {
            V2TIMMessage v2TIMMessage = new V2TIMMessage();
            Message message = v2TIMMessage.getMessage();
            TextElement textElement = new TextElement();
            textElement.setTextContent(str);
            message.addElement(textElement);
            v2TIMMessage.setGroupAtUserList(list);
            return v2TIMMessage;
        }
        IMLog.m75914e(TAG, "atUserList cannot be empty");
        return null;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public V2TIMMessage createTextMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            IMLog.m75914e(TAG, "text cannot be empty");
            return null;
        }
        V2TIMMessage v2TIMMessage = new V2TIMMessage();
        Message message = v2TIMMessage.getMessage();
        TextElement textElement = new TextElement();
        textElement.setTextContent(str);
        message.addElement(textElement);
        return v2TIMMessage;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public V2TIMMessage createVideoMessage(String str, String str2, int i11, String str3) {
        if (TextUtils.isEmpty(str)) {
            IMLog.m75914e(TAG, "videoFilePath cannot be empty");
            return null;
        }
        if (!new File(str).exists()) {
            IMLog.m75914e(TAG, "video file not exist");
            return null;
        }
        if (TextUtils.isEmpty(str3)) {
            IMLog.m75914e(TAG, "snapshotPath cannot be empty");
            return null;
        }
        if (!new File(str3).exists()) {
            IMLog.m75914e(TAG, "snapshot file not exist");
            return null;
        }
        V2TIMMessage v2TIMMessage = new V2TIMMessage();
        Message message = v2TIMMessage.getMessage();
        VideoElement videoElement = new VideoElement();
        videoElement.setVideoFilePath(str);
        videoElement.setSnapshotFilePath(str3);
        if (i11 < 0) {
            i11 = 0;
        }
        videoElement.setVideoDuration(i11);
        videoElement.setVideoType(str2);
        message.addElement(videoElement);
        return v2TIMMessage;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void getC2CHistoryMessageList(String str, int i11, V2TIMMessage v2TIMMessage, final V2TIMValueCallback<List<V2TIMMessage>> v2TIMValueCallback) {
        MessageKey messageKey;
        if (!TextUtils.isEmpty(str) && i11 > 0) {
            V2TIMValueCallback<List<Message>> v2TIMValueCallback2 = new V2TIMValueCallback<List<Message>>() { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.13
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i12, String str2) {
                    V2TIMValueCallback v2TIMValueCallback3 = v2TIMValueCallback;
                    if (v2TIMValueCallback3 != null) {
                        v2TIMValueCallback3.onError(i12, str2);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(List<Message> list) {
                    ArrayList arrayList = new ArrayList();
                    for (Message message : list) {
                        V2TIMMessage v2TIMMessage2 = new V2TIMMessage();
                        v2TIMMessage2.setMessage(message);
                        arrayList.add(v2TIMMessage2);
                    }
                    V2TIMValueCallback v2TIMValueCallback3 = v2TIMValueCallback;
                    if (v2TIMValueCallback3 != null) {
                        v2TIMValueCallback3.onSuccess(arrayList);
                    }
                }
            };
            if (v2TIMMessage != null) {
                messageKey = v2TIMMessage.getMessage().getMessageKey();
            } else {
                messageKey = null;
            }
            MessageListGetOption messageListGetOption = new MessageListGetOption();
            messageListGetOption.setCount(i11);
            messageListGetOption.setToOlderMessage(true);
            messageListGetOption.setGetCloudMessage(true);
            messageListGetOption.setMessageKey(messageKey);
            MessageCenter.getInstance().getC2CHistoryMessageList(str, messageListGetOption, new IMCallback<List<Message>>(v2TIMValueCallback2) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.14
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(List<Message> list) {
                    super.success(list);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i12, String str2) {
                    super.fail(i12, str2);
                }
            });
            return;
        }
        if (v2TIMValueCallback != null) {
            v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "userID is empty or count <= 0");
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void getGroupHistoryMessageList(String str, int i11, V2TIMMessage v2TIMMessage, final V2TIMValueCallback<List<V2TIMMessage>> v2TIMValueCallback) {
        MessageKey messageKey;
        if (!TextUtils.isEmpty(str) && i11 > 0) {
            V2TIMValueCallback<List<Message>> v2TIMValueCallback2 = new V2TIMValueCallback<List<Message>>() { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.15
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i12, String str2) {
                    V2TIMValueCallback v2TIMValueCallback3 = v2TIMValueCallback;
                    if (v2TIMValueCallback3 != null) {
                        v2TIMValueCallback3.onError(i12, str2);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(List<Message> list) {
                    ArrayList arrayList = new ArrayList();
                    for (Message message : list) {
                        V2TIMMessage v2TIMMessage2 = new V2TIMMessage();
                        v2TIMMessage2.setMessage(message);
                        arrayList.add(v2TIMMessage2);
                    }
                    V2TIMValueCallback v2TIMValueCallback3 = v2TIMValueCallback;
                    if (v2TIMValueCallback3 != null) {
                        v2TIMValueCallback3.onSuccess(arrayList);
                    }
                }
            };
            if (v2TIMMessage != null) {
                messageKey = v2TIMMessage.getMessage().getMessageKey();
            } else {
                messageKey = null;
            }
            MessageListGetOption messageListGetOption = new MessageListGetOption();
            messageListGetOption.setCount(i11);
            messageListGetOption.setToOlderMessage(true);
            messageListGetOption.setGetCloudMessage(true);
            messageListGetOption.setMessageKey(messageKey);
            MessageCenter.getInstance().getGroupHistoryMessageList(str, messageListGetOption, new IMCallback<List<Message>>(v2TIMValueCallback2) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.16
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(List<Message> list) {
                    super.success(list);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i12, String str2) {
                    super.fail(i12, str2);
                }
            });
            return;
        }
        if (v2TIMValueCallback != null) {
            v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "groupID is empty or count <= 0");
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void getMessageReactions(List<V2TIMMessage> list, int i11, final V2TIMValueCallback<List<V2TIMMessageReactionResult>> v2TIMValueCallback) {
        if (list.size() == 0) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "invalid messages");
            }
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<V2TIMMessage> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getMessage().getMessageKey());
            }
            MessageCenter.getInstance().getMessageReactions(arrayList, i11, new IMCallback<List<MessageReactionResult>>(new V2TIMValueCallback<List<MessageReactionResult>>() { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.59
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i12, String str) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i12, str);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(List<MessageReactionResult> list2) {
                    ArrayList arrayList2 = new ArrayList();
                    for (MessageReactionResult messageReactionResult : list2) {
                        V2TIMMessageReactionResult v2TIMMessageReactionResult = new V2TIMMessageReactionResult();
                        v2TIMMessageReactionResult.setMessageReactionResult(messageReactionResult);
                        arrayList2.add(v2TIMMessageReactionResult);
                    }
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onSuccess(arrayList2);
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.60
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(List<MessageReactionResult> list2) {
                    super.success(list2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i12, String str) {
                    super.fail(i12, str);
                }
            });
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void getPinnedGroupMessageList(String str, final V2TIMValueCallback<List<V2TIMMessage>> v2TIMValueCallback) {
        if (TextUtils.isEmpty(str)) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "groupID is empty");
            }
        } else {
            MessageCenter.getInstance().getPinnedGroupMessageList(str, new IMCallback<List<Message>>(new V2TIMValueCallback<List<Message>>() { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.65
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str2) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i11, str2);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(List<Message> list) {
                    ArrayList arrayList = new ArrayList();
                    for (Message message : list) {
                        V2TIMMessage v2TIMMessage = new V2TIMMessage();
                        v2TIMMessage.setMessage(message);
                        arrayList.add(v2TIMMessage);
                    }
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onSuccess(arrayList);
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.66
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(List<Message> list) {
                    super.success(list);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str2) {
                    super.fail(i11, str2);
                }
            });
        }
    }

    public void internalStartTTS(String str, String str2, int i11, V2TIMTTSVoiceFormat v2TIMTTSVoiceFormat, V2TIMCallback v2TIMCallback) {
        float speed;
        if (TextUtils.isEmpty(str)) {
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "msgID is empty");
            }
        } else {
            if (TextUtils.isEmpty(str2)) {
                if (v2TIMCallback != null) {
                    v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "streamMsgID is empty");
                    return;
                }
                return;
            }
            String voiceID = "";
            if (v2TIMTTSVoiceFormat != null) {
                if (v2TIMTTSVoiceFormat.getVoiceID() != null) {
                    voiceID = v2TIMTTSVoiceFormat.getVoiceID();
                }
                speed = v2TIMTTSVoiceFormat.getSpeed();
            } else {
                speed = 1.0f;
            }
            MessageCenter.getInstance().startTTS(str, str2, i11, voiceID, speed, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.67
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i12, String str3) {
                    super.fail(i12, str3);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj) {
                    super.success(obj);
                }
            });
        }
    }

    public void internalStopTTS(String str, String str2, V2TIMCallback v2TIMCallback) {
        if (TextUtils.isEmpty(str)) {
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "msgID is empty");
            }
        } else {
            if (TextUtils.isEmpty(str2)) {
                if (v2TIMCallback != null) {
                    v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "streamMsgID is empty");
                    return;
                }
                return;
            }
            MessageCenter.getInstance().stopTTS(str, str2, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.68
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str3) {
                    super.fail(i11, str3);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj) {
                    super.success(obj);
                }
            });
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void markAllMessageAsRead(V2TIMCallback v2TIMCallback) {
        ConversationManager.getInstance().clearUnreadMessage(true, true, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.27
            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str) {
                super.fail(i11, str);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Object obj) {
                super.success(obj);
            }
        });
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void markC2CMessageAsRead(String str, V2TIMCallback v2TIMCallback) {
        if (TextUtils.isEmpty(str)) {
            ConversationManager.getInstance().clearUnreadMessage(true, false, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.23
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str2) {
                    super.fail(i11, str2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj) {
                    super.success(obj);
                }
            });
        } else {
            MessageCenter.getInstance().setC2CMessageRead(str, 0L, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.24
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str2) {
                    super.fail(i11, str2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj) {
                    super.success(obj);
                }
            });
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void markGroupMessageAsRead(String str, V2TIMCallback v2TIMCallback) {
        if (TextUtils.isEmpty(str)) {
            ConversationManager.getInstance().clearUnreadMessage(false, true, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.25
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str2) {
                    super.fail(i11, str2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj) {
                    super.success(obj);
                }
            });
        } else {
            MessageCenter.getInstance().setGroupMessageRead(str, 0L, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.26
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str2) {
                    super.fail(i11, str2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj) {
                    super.success(obj);
                }
            });
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void pinGroupMessage(String str, V2TIMMessage v2TIMMessage, boolean z11, V2TIMCallback v2TIMCallback) {
        if (TextUtils.isEmpty(str)) {
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "groupID is empty");
            }
        } else {
            if (v2TIMMessage == null) {
                if (v2TIMCallback != null) {
                    v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "message cannot be null");
                    return;
                }
                return;
            }
            MessageCenter.getInstance().pinGroupMessage(str, v2TIMMessage.getMessage(), z11, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.64
                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str2) {
                    super.fail(i11, str2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Object obj) {
                    super.success(obj);
                }
            });
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void searchCloudMessages(V2TIMMessageSearchParam v2TIMMessageSearchParam, final V2TIMValueCallback<V2TIMMessageSearchResult> v2TIMValueCallback) {
        if (v2TIMMessageSearchParam.getSearchTimePosition() >= 0 && v2TIMMessageSearchParam.getSearchTimePeriod() >= 0) {
            MessageSearchParam messageSearchParam = v2TIMMessageSearchParam.getMessageSearchParam();
            if (!TextUtils.isEmpty(v2TIMMessageSearchParam.getConversationID())) {
                ConversationKey conversationKey = V2TIMConversationManagerImpl.getInstance().getConversationKey(v2TIMMessageSearchParam.getConversationID());
                if (conversationKey.getConversationType() != 1 && conversationKey.getConversationType() != 2) {
                    if (v2TIMValueCallback != null) {
                        v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "invalid conversationID");
                        return;
                    }
                    return;
                } else {
                    if (TextUtils.isEmpty(conversationKey.getConversationID())) {
                        if (v2TIMValueCallback != null) {
                            v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "invalid conversationID");
                            return;
                        }
                        return;
                    }
                    messageSearchParam.setConversationKey(conversationKey);
                }
            }
            MessageCenter.getInstance().searchCloudMessage(v2TIMMessageSearchParam.getMessageSearchParam(), new IMCallback<MessageSearchResult>(new V2TIMValueCallback<MessageSearchResult>() { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.40
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i11, str);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(MessageSearchResult messageSearchResult) {
                    V2TIMMessageSearchResult v2TIMMessageSearchResult = new V2TIMMessageSearchResult();
                    v2TIMMessageSearchResult.setMessageSearchResult(messageSearchResult);
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onSuccess(v2TIMMessageSearchResult);
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.41
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(MessageSearchResult messageSearchResult) {
                    super.success(messageSearchResult);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str) {
                    super.fail(i11, str);
                }
            });
            return;
        }
        if (v2TIMValueCallback != null) {
            v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "time < 0");
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void searchLocalMessages(V2TIMMessageSearchParam v2TIMMessageSearchParam, final V2TIMValueCallback<V2TIMMessageSearchResult> v2TIMValueCallback) {
        if (v2TIMMessageSearchParam.getSearchTimePosition() >= 0 && v2TIMMessageSearchParam.getSearchTimePeriod() >= 0) {
            MessageSearchParam messageSearchParam = v2TIMMessageSearchParam.getMessageSearchParam();
            if (!TextUtils.isEmpty(v2TIMMessageSearchParam.getConversationID())) {
                ConversationKey conversationKey = V2TIMConversationManagerImpl.getInstance().getConversationKey(v2TIMMessageSearchParam.getConversationID());
                if (conversationKey.getConversationType() != 1 && conversationKey.getConversationType() != 2) {
                    if (v2TIMValueCallback != null) {
                        v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "invalid conversationID");
                        return;
                    }
                    return;
                }
                messageSearchParam.setConversationKey(conversationKey);
            }
            if (v2TIMMessageSearchParam.getPageIndex() >= 0 && v2TIMMessageSearchParam.getPageSize() >= 0) {
                MessageCenter.getInstance().searchLocalMessage(v2TIMMessageSearchParam.getMessageSearchParam(), new IMCallback<MessageSearchResult>(new V2TIMValueCallback<MessageSearchResult>() { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.38
                    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                    public void onError(int i11, String str) {
                        V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                        if (v2TIMValueCallback2 != null) {
                            v2TIMValueCallback2.onError(i11, str);
                        }
                    }

                    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                    public void onSuccess(MessageSearchResult messageSearchResult) {
                        V2TIMMessageSearchResult v2TIMMessageSearchResult = new V2TIMMessageSearchResult();
                        v2TIMMessageSearchResult.setMessageSearchResult(messageSearchResult);
                        V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                        if (v2TIMValueCallback2 != null) {
                            v2TIMValueCallback2.onSuccess(v2TIMMessageSearchResult);
                        }
                    }
                }) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.39
                    @Override // com.tencent.imsdk.common.IMCallback
                    public void success(MessageSearchResult messageSearchResult) {
                        super.success(messageSearchResult);
                    }

                    @Override // com.tencent.imsdk.common.IMCallback
                    public void fail(int i11, String str) {
                        super.fail(i11, str);
                    }
                });
                BaseManager.getInstance().reportTUIComponentUsage(6L);
                return;
            } else {
                if (v2TIMValueCallback != null) {
                    v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "pageIndex or pageSize is invalid");
                    return;
                }
                return;
            }
        }
        if (v2TIMValueCallback != null) {
            v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "time < 0");
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void setGroupReceiveMessageOpt(String str, int i11, V2TIMCallback v2TIMCallback) {
        int i12;
        if (TextUtils.isEmpty(str)) {
            IMLog.m75914e(TAG, "setReceiveMessageOpt err, groupID is empty");
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "groupID is empty");
                return;
            }
            return;
        }
        int i13 = GroupMemberInfo.MEMBER_ROLE_MEMBER;
        if (i11 == 0) {
            i12 = GroupMemberInfo.MESSAGE_RECEIVE_OPTION_AUTO_RECEIVE;
        } else if (i11 == 1) {
            i12 = GroupMemberInfo.MESSAGE_RECEIVE_OPTION_NOT_RECEIVE;
        } else if (i11 == 2) {
            i12 = GroupMemberInfo.MESSAGE_RECEIVE_OPTION_RECEIVE_WITH_NO_OFFLINE_PUSH;
        } else if (i11 == 3) {
            i12 = GroupMemberInfo.MESSAGE_RECEIVE_OPTION_RECEIVE_WITH_NO_OFFLINE_PUSH_EXCEPT_AT;
        } else if (i11 == 4) {
            i12 = GroupMemberInfo.MESSAGE_RECEIVE_OPTION_NOT_RECEIVE_EXCEPT_AT;
        } else {
            IMLog.m75914e(TAG, "setReceiveMessageOpt error opt = " + i11);
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "opt is error");
                return;
            }
            return;
        }
        GroupManager.getInstance().setGroupReceiveMessageOpt(str, i12, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.8
            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i14, String str2) {
                super.fail(i14, str2);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Object obj) {
                super.success(obj);
            }
        });
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public void setAllReceiveMessageOpt(int i11, long j11, long j12, V2TIMCallback v2TIMCallback) {
        int i12;
        int i13 = 1;
        if (i11 == 0) {
            i12 = i13;
        } else if (i11 == 1) {
            i12 = 2;
        } else {
            i13 = 3;
            if (i11 != 2 && i11 != 3) {
                IMLog.m75914e(TAG, "setAllReceiveMessageOpt error opt = " + i11);
                if (v2TIMCallback != null) {
                    v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "opt is error");
                    return;
                }
                return;
            }
            i12 = i13;
        }
        RelationshipManager.getInstance().setAllReceiveMessageOpt(i12, j11, j12, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMMessageManagerImpl.10
            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i14, String str) {
                super.fail(i14, str);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Object obj) {
                super.success(obj);
            }
        });
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMMessageManager
    public V2TIMMessage createCustomMessage(byte[] bArr, String str, byte[] bArr2) {
        if (bArr != null && bArr.length != 0) {
            V2TIMMessage v2TIMMessage = new V2TIMMessage();
            Message message = v2TIMMessage.getMessage();
            CustomElement customElement = new CustomElement();
            customElement.setData(bArr);
            customElement.setDescription(str);
            customElement.setExtension(bArr2);
            message.addElement(customElement);
            return v2TIMMessage;
        }
        IMLog.m75914e(TAG, "data cannot be empty");
        return null;
    }
}
