package com.tencent.imsdk.message;

import com.tencent.imsdk.BaseConstants;
import com.tencent.imsdk.common.IMCallback;
import com.tencent.imsdk.common.IMContext;
import com.tencent.imsdk.common.IMLog;
import com.tencent.imsdk.conversation.ConversationKey;
import com.tencent.imsdk.group.GroupMemberInfo;
import com.tencent.imsdk.manager.BaseManager;
import com.tencent.imsdk.relationship.UserInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes59.dex */
public class MessageCenter {
    private static final String TAG = "MessageCenter";
    private MessageListener mMessageListener;
    private Object mLockObject = new Object();
    private CopyOnWriteArrayList<MessageListener> mMessageProxyListenerList = new CopyOnWriteArrayList<>();

    public static class MessageCenterHolder {
        private static final MessageCenter messageCenter = new MessageCenter();

        private MessageCenterHolder() {
        }
    }

    public native void nativeAddMessageReaction(Message message, String str, IMCallback iMCallback);

    public native void nativeCancelSendingMessage(String str, IMCallback iMCallback);

    public native void nativeClearC2CHistoryMessage(String str, IMCallback iMCallback);

    public native void nativeClearGroupHistoryMessage(String str, IMCallback iMCallback);

    public native void nativeClearLocalHistoryMessage(ConversationKey conversationKey, long j11, long j12, IMCallback iMCallback);

    public native void nativeConvertTextToVoice(Map<String, String> map, IMCallback iMCallback);

    public native void nativeConvertVoiceToText(String str, String str2, IMCallback iMCallback);

    public native void nativeDeleteCloudMessageList(List<MessageKey> list, IMCallback iMCallback);

    public native void nativeDeleteCustomVoice(String str, IMCallback iMCallback);

    public native void nativeDeleteLocalMessage(Message message, IMCallback iMCallback);

    public native void nativeDeleteMessageExtensions(Message message, List<String> list, IMCallback iMCallback);

    public native void nativeDownloadMessageElement(DownloadParam downloadParam, IMCallback iMCallback, IMCallback iMCallback2);

    public native void nativeDownloadRelayMessageList(Message message, IMCallback iMCallback);

    public native void nativeFindMessageByMessageID(List<String> list, IMCallback iMCallback);

    public native void nativeFindRelayMessageList(String str, List<String> list, IMCallback iMCallback);

    public native void nativeGetAllUserListOfMessageReaction(Message message, String str, int i11, int i12, IMCallback iMCallback);

    public native void nativeGetC2CHistoryMessageList(String str, MessageListGetOption messageListGetOption, IMCallback iMCallback);

    public native void nativeGetCustomVoiceList(IMCallback iMCallback);

    public native void nativeGetGroupHistoryMessageList(String str, MessageListGetOption messageListGetOption, IMCallback iMCallback);

    public native void nativeGetGroupMessageReadMembers(Message message, int i11, long j11, int i12, IMCallback iMCallback);

    public native void nativeGetGroupMessageReceipts(List<MessageKey> list, IMCallback iMCallback);

    public native void nativeGetMessageExtensions(Message message, IMCallback iMCallback);

    public native void nativeGetMessageReactions(List<MessageKey> list, int i11, IMCallback iMCallback);

    public native void nativeGetPinnedGroupMessageList(String str, IMCallback iMCallback);

    public native String nativeInsertLocalMessage(Message message, IMCallback iMCallback);

    public native boolean nativeIsMessagePeerRead(MessageKey messageKey);

    public native boolean nativeIsMessageSelfRead(MessageKey messageKey);

    public native void nativeModifyMessage(Message message, IMCallback iMCallback);

    public native void nativePinGroupMessage(String str, Message message, boolean z11, IMCallback iMCallback);

    public native void nativeRemoveMessageReaction(Message message, String str, IMCallback iMCallback);

    public native void nativeRevokeMessage(MessageKey messageKey, IMCallback iMCallback);

    public native void nativeSearchCloudMessage(MessageSearchParam messageSearchParam, IMCallback iMCallback);

    public native void nativeSearchLocalMessage(MessageSearchParam messageSearchParam, IMCallback iMCallback);

    public native String nativeSendMessage(Message message, MessageUploadProgressCallback messageUploadProgressCallback, IMCallback iMCallback);

    public native void nativeSendMessageReceipts(List<MessageKey> list, IMCallback iMCallback);

    public native void nativeSetC2CMessageRead(String str, long j11, IMCallback iMCallback);

    public native void nativeSetGroupMessageRead(String str, long j11, IMCallback iMCallback);

    public native void nativeSetLocalCustomNumber(Message message, int i11);

    public native void nativeSetLocalCustomString(Message message, String str);

    public native void nativeSetMessageExtensions(Message message, List<MessageExtension> list, IMCallback iMCallback);

    public native void nativeSetMessageListener(MessageListener messageListener);

    public native void nativeStartTTS(String str, String str2, int i11, String str3, float f11, IMCallback iMCallback);

    public native void nativeStopTTS(String str, String str2, IMCallback iMCallback);

    public native void nativeTranslateText(List<String> list, String str, String str2, IMCallback iMCallback);

    public native void nativeVoiceClone(String str, String str2, String str3, String str4, IMCallback iMCallback);

    private void initMessageListener() {
        MessageListener messageListener = new MessageListener() { // from class: com.tencent.imsdk.message.MessageCenter.1
            @Override // com.tencent.imsdk.message.MessageListener
            public void onGroupMessagePinned(final String str, final Message message, final boolean z11, final GroupMemberInfo groupMemberInfo) {
                IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.message.MessageCenter.1.9
                    @Override // java.lang.Runnable
                    public void run() {
                        Iterator it = MessageCenter.this.mMessageProxyListenerList.iterator();
                        while (it.hasNext()) {
                            ((MessageListener) it.next()).onGroupMessagePinned(str, message, z11, groupMemberInfo);
                        }
                    }
                });
            }

            @Override // com.tencent.imsdk.message.MessageListener
            public void onReceiveC2CMessageReceipt(final List<C2CMessageReceipt> list) {
                IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.message.MessageCenter.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (MessageCenter.this.mLockObject) {
                            try {
                                Iterator it = MessageCenter.this.mMessageProxyListenerList.iterator();
                                while (it.hasNext()) {
                                    ((MessageListener) it.next()).onReceiveC2CMessageReceipt(list);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                });
            }

            @Override // com.tencent.imsdk.message.MessageListener
            public void onReceiveGroupMessageReceipt(final List<GroupMessageReceipt> list) {
                IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.message.MessageCenter.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        Iterator it = MessageCenter.this.mMessageProxyListenerList.iterator();
                        while (it.hasNext()) {
                            ((MessageListener) it.next()).onReceiveGroupMessageReceipt(list);
                        }
                    }
                });
            }

            @Override // com.tencent.imsdk.message.MessageListener
            public void onReceiveMessageExtensionsChanged(final MessageKey messageKey, final List<MessageExtension> list) {
                IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.message.MessageCenter.1.6
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (MessageCenter.this.mLockObject) {
                            try {
                                Iterator it = MessageCenter.this.mMessageProxyListenerList.iterator();
                                while (it.hasNext()) {
                                    ((MessageListener) it.next()).onReceiveMessageExtensionsChanged(messageKey, list);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                });
            }

            @Override // com.tencent.imsdk.message.MessageListener
            public void onReceiveMessageExtensionsDeleted(final MessageKey messageKey, final List<MessageExtension> list) {
                IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.message.MessageCenter.1.7
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (MessageCenter.this.mLockObject) {
                            try {
                                Iterator it = MessageCenter.this.mMessageProxyListenerList.iterator();
                                while (it.hasNext()) {
                                    ((MessageListener) it.next()).onReceiveMessageExtensionsDeleted(messageKey, list);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                });
            }

            @Override // com.tencent.imsdk.message.MessageListener
            public void onReceiveMessageModified(final List<Message> list) {
                IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.message.MessageCenter.1.5
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (MessageCenter.this.mLockObject) {
                            try {
                                Iterator it = MessageCenter.this.mMessageProxyListenerList.iterator();
                                while (it.hasNext()) {
                                    ((MessageListener) it.next()).onReceiveMessageModified(list);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                });
            }

            @Override // com.tencent.imsdk.message.MessageListener
            public void onReceiveMessageReactionsChanged(final List<MessageReactionChangeInfo> list) {
                IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.message.MessageCenter.1.8
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (MessageCenter.this.mLockObject) {
                            try {
                                Iterator it = MessageCenter.this.mMessageProxyListenerList.iterator();
                                while (it.hasNext()) {
                                    ((MessageListener) it.next()).onReceiveMessageReactionsChanged(list);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                });
            }

            @Override // com.tencent.imsdk.message.MessageListener
            public void onReceiveMessageRevoked(final Map<MessageKey, Map<UserInfo, String>> map, final boolean z11) {
                IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.message.MessageCenter.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (MessageCenter.this.mLockObject) {
                            try {
                                Iterator it = MessageCenter.this.mMessageProxyListenerList.iterator();
                                while (it.hasNext()) {
                                    ((MessageListener) it.next()).onReceiveMessageRevoked(map, z11);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                });
            }

            @Override // com.tencent.imsdk.message.MessageListener
            public void onReceiveNewMessage(final List<Message> list) {
                IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.message.MessageCenter.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (MessageCenter.this.mLockObject) {
                            try {
                                Iterator it = MessageCenter.this.mMessageProxyListenerList.iterator();
                                while (it.hasNext()) {
                                    ((MessageListener) it.next()).onReceiveNewMessage(list);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                });
            }

            @Override // com.tencent.imsdk.message.MessageListener
            public void onRecvTTSResponse(final String str, final List<byte[]> list, final boolean z11) {
                IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.message.MessageCenter.1.10
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (MessageCenter.this.mLockObject) {
                            try {
                                Iterator it = MessageCenter.this.mMessageProxyListenerList.iterator();
                                while (it.hasNext()) {
                                    ((MessageListener) it.next()).onRecvTTSResponse(str, list, z11);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                });
            }
        };
        this.mMessageListener = messageListener;
        nativeSetMessageListener(messageListener);
    }

    public void addMessageListener(MessageListener messageListener) {
        synchronized (this.mLockObject) {
            this.mMessageProxyListenerList.add(messageListener);
        }
    }

    public static MessageCenter getInstance() {
        return MessageCenterHolder.messageCenter;
    }

    public void addMessageReaction(Message message, String str, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeAddMessageReaction(message, str, iMCallback);
    }

    public void cancelSendingMessage(String str, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeCancelSendingMessage(str, iMCallback);
    }

    public void clearC2CHistoryMessage(String str, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeClearC2CHistoryMessage(str, iMCallback);
    }

    public void clearGroupHistoryMessage(String str, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeClearGroupHistoryMessage(str, iMCallback);
    }

    public void clearLocalHistoryMessage(ConversationKey conversationKey, long j11, long j12, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeClearLocalHistoryMessage(conversationKey, j11, j12, iMCallback);
    }

    public void convertTextToVoice(Map<String, String> map, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeConvertTextToVoice(map, iMCallback);
    }

    public void convertVoiceToText(String str, String str2, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeConvertVoiceToText(str, str2, iMCallback);
    }

    public void deleteCloudMessageList(List<MessageKey> list, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeDeleteCloudMessageList(list, iMCallback);
    }

    public void deleteCustomVoice(String str, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeDeleteCustomVoice(str, iMCallback);
    }

    public void deleteLocalMessage(Message message, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeDeleteLocalMessage(message, iMCallback);
    }

    public void deleteMessageExtensions(Message message, List<String> list, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeDeleteMessageExtensions(message, list, iMCallback);
    }

    public void downloadMessageElement(DownloadParam downloadParam, IMCallback<DownloadProgressInfo> iMCallback, IMCallback iMCallback2) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback2 != null) {
                iMCallback2.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeDownloadMessageElement(downloadParam, iMCallback, iMCallback2);
    }

    public void downloadRelayMessageList(Message message, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeDownloadRelayMessageList(message, iMCallback);
    }

    public void findMessageByMessageId(List<String> list, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeFindMessageByMessageID(list, iMCallback);
    }

    public void findRelayMessageList(String str, List<String> list, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeFindRelayMessageList(str, list, iMCallback);
    }

    public void getAllUserListOfMessageReaction(Message message, String str, int i11, int i12, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeGetAllUserListOfMessageReaction(message, str, i11, i12, iMCallback);
    }

    public void getC2CHistoryMessageList(String str, MessageListGetOption messageListGetOption, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeGetC2CHistoryMessageList(str, messageListGetOption, iMCallback);
    }

    public void getCustomVoiceList(IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeGetCustomVoiceList(iMCallback);
    }

    public void getGroupHistoryMessageList(String str, MessageListGetOption messageListGetOption, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeGetGroupHistoryMessageList(str, messageListGetOption, iMCallback);
    }

    public void getGroupMessageReadMembers(Message message, int i11, long j11, int i12, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeGetGroupMessageReadMembers(message, i11, j11, i12, iMCallback);
    }

    public void getGroupMessageReceipts(List<MessageKey> list, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeGetGroupMessageReceipts(list, iMCallback);
    }

    public void getMessageExtensions(Message message, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeGetMessageExtensions(message, iMCallback);
    }

    public void getMessageReactions(List<MessageKey> list, int i11, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeGetMessageReactions(list, i11, iMCallback);
    }

    public void getPinnedGroupMessageList(String str, IMCallback<List<Message>> iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeGetPinnedGroupMessageList(str, iMCallback);
    }

    public void init() {
        initMessageListener();
    }

    public String insertLocalMessage(Message message, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return null;
            }
            return null;
        }
        return nativeInsertLocalMessage(message, iMCallback);
    }

    public boolean isMessagePeerRead(MessageKey messageKey) {
        if (!BaseManager.getInstance().isInited()) {
            IMLog.m75914e(TAG, "sdk not ini");
            return false;
        }
        return nativeIsMessagePeerRead(messageKey);
    }

    public boolean isMessageSelfRead(MessageKey messageKey) {
        if (!BaseManager.getInstance().isInited()) {
            IMLog.m75914e(TAG, "sdk not ini");
            return false;
        }
        return nativeIsMessageSelfRead(messageKey);
    }

    public void modifyMessage(Message message, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeModifyMessage(message, iMCallback);
    }

    public void pinGroupMessage(String str, Message message, boolean z11, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativePinGroupMessage(str, message, z11, iMCallback);
    }

    public void removeMessageReaction(Message message, String str, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeRemoveMessageReaction(message, str, iMCallback);
    }

    public void revokeMessage(MessageKey messageKey, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeRevokeMessage(messageKey, iMCallback);
    }

    public void searchCloudMessage(MessageSearchParam messageSearchParam, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeSearchCloudMessage(messageSearchParam, iMCallback);
    }

    public void searchLocalMessage(MessageSearchParam messageSearchParam, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeSearchLocalMessage(messageSearchParam, iMCallback);
    }

    public String sendMessage(Message message, MessageUploadProgressCallback messageUploadProgressCallback, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return null;
            }
            return null;
        }
        return nativeSendMessage(message, messageUploadProgressCallback, iMCallback);
    }

    public void sendMessageReceipts(List<MessageKey> list, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeSendMessageReceipts(list, iMCallback);
    }

    public void setC2CMessageRead(String str, long j11, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeSetC2CMessageRead(str, j11, iMCallback);
    }

    public void setGroupMessageRead(String str, long j11, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeSetGroupMessageRead(str, j11, iMCallback);
    }

    public void setLocalCustomNumber(Message message, int i11) {
        nativeSetLocalCustomNumber(message, i11);
    }

    public void setLocalCustomString(Message message, String str) {
        nativeSetLocalCustomString(message, str);
    }

    public void setMessageExtensions(Message message, List<MessageExtension> list, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeSetMessageExtensions(message, list, iMCallback);
    }

    public void startTTS(String str, String str2, int i11, String str3, float f11, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeStartTTS(str, str2, i11, str3, f11, iMCallback);
    }

    public void stopTTS(String str, String str2, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeStopTTS(str, str2, iMCallback);
    }

    public void translateText(List<String> list, String str, String str2, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeTranslateText(list, str, str2, iMCallback);
    }

    public void voiceClone(String str, String str2, String str3, String str4, IMCallback iMCallback) {
        if (!BaseManager.getInstance().isInited()) {
            if (iMCallback != null) {
                iMCallback.fail(BaseConstants.ERR_SDK_NOT_INITIALIZED, "sdk not init");
                return;
            }
            return;
        }
        nativeVoiceClone(str, str2, str3, str4, iMCallback);
    }
}
