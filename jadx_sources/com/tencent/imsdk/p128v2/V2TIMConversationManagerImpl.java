package com.tencent.imsdk.p128v2;

import android.text.TextUtils;
import com.tencent.imsdk.BaseConstants;
import com.tencent.imsdk.common.IMCallback;
import com.tencent.imsdk.common.IMContext;
import com.tencent.imsdk.conversation.Conversation;
import com.tencent.imsdk.conversation.ConversationKey;
import com.tencent.imsdk.conversation.ConversationListFilter;
import com.tencent.imsdk.conversation.ConversationListener;
import com.tencent.imsdk.conversation.ConversationManager;
import com.tencent.imsdk.conversation.ConversationOperationResult;
import com.tencent.imsdk.conversation.ConversationResult;
import com.tencent.imsdk.conversation.UnreadMessageCountResult;
import com.tencent.imsdk.manager.BaseManager;
import com.tencent.imsdk.message.DraftMessage;
import com.tencent.imsdk.message.MessageCenter;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMConversationManagerImpl extends V2TIMConversationManager {
    private ConversationListener mConversationListener;
    private V2TIMConversationListener mV2TIMConversationListener;
    private final List<V2TIMConversationListener> mV2TIMConversationListenerList;

    public static class V2TIMConversationManagerImplHolder {
        private static final V2TIMConversationManagerImpl v2TIMConversationManagerImpl = new V2TIMConversationManagerImpl();

        private V2TIMConversationManagerImplHolder() {
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationManager
    public void getConversationList(long j11, int i11, final V2TIMValueCallback<V2TIMConversationResult> v2TIMValueCallback) {
        if (i11 <= 0) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "count is invalid");
            }
        } else {
            ConversationManager.getInstance().getConversationList(j11, i11, new IMCallback<ConversationResult>(new V2TIMValueCallback<ConversationResult>() { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.5
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i12, String str) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i12, str);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(ConversationResult conversationResult) {
                    if (v2TIMValueCallback != null) {
                        V2TIMConversationResult v2TIMConversationResult = new V2TIMConversationResult();
                        v2TIMConversationResult.setConversationResult(conversationResult);
                        v2TIMValueCallback.onSuccess(v2TIMConversationResult);
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.6
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(ConversationResult conversationResult) {
                    super.success(conversationResult);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i12, String str) {
                    super.fail(i12, str);
                }
            });
            BaseManager.getInstance().reportTUIComponentUsage(2L);
        }
    }

    private V2TIMConversationManagerImpl() {
        this.mV2TIMConversationListenerList = new ArrayList();
        initListener();
    }

    private void initListener() {
        if (this.mConversationListener == null) {
            this.mConversationListener = new ConversationListener() { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.1
                @Override // com.tencent.imsdk.conversation.ConversationListener
                public void onConversationChanged(List<Conversation> list) {
                    ArrayList arrayList = new ArrayList();
                    for (Conversation conversation : list) {
                        V2TIMConversation v2TIMConversation = new V2TIMConversation();
                        v2TIMConversation.setConversation(conversation);
                        arrayList.add(v2TIMConversation);
                    }
                    List<V2TIMConversation> listUnmodifiableList = Collections.unmodifiableList(arrayList);
                    Iterator it = V2TIMConversationManagerImpl.this.mV2TIMConversationListenerList.iterator();
                    while (it.hasNext()) {
                        ((V2TIMConversationListener) it.next()).onConversationChanged(listUnmodifiableList);
                    }
                }

                @Override // com.tencent.imsdk.conversation.ConversationListener
                public void onConversationGroupCreated(String str, List<Conversation> list) {
                    ArrayList arrayList = new ArrayList();
                    for (Conversation conversation : list) {
                        V2TIMConversation v2TIMConversation = new V2TIMConversation();
                        v2TIMConversation.setConversation(conversation);
                        arrayList.add(v2TIMConversation);
                    }
                    List<V2TIMConversation> listUnmodifiableList = Collections.unmodifiableList(arrayList);
                    Iterator it = V2TIMConversationManagerImpl.this.mV2TIMConversationListenerList.iterator();
                    while (it.hasNext()) {
                        ((V2TIMConversationListener) it.next()).onConversationGroupCreated(str, listUnmodifiableList);
                    }
                }

                @Override // com.tencent.imsdk.conversation.ConversationListener
                public void onConversationGroupDeleted(String str) {
                    Iterator it = V2TIMConversationManagerImpl.this.mV2TIMConversationListenerList.iterator();
                    while (it.hasNext()) {
                        ((V2TIMConversationListener) it.next()).onConversationGroupDeleted(str);
                    }
                }

                @Override // com.tencent.imsdk.conversation.ConversationListener
                public void onConversationGroupNameChanged(String str, String str2) {
                    Iterator it = V2TIMConversationManagerImpl.this.mV2TIMConversationListenerList.iterator();
                    while (it.hasNext()) {
                        ((V2TIMConversationListener) it.next()).onConversationGroupNameChanged(str, str2);
                    }
                }

                @Override // com.tencent.imsdk.conversation.ConversationListener
                public void onConversationsAddedToGroup(String str, List<Conversation> list) {
                    ArrayList arrayList = new ArrayList();
                    for (Conversation conversation : list) {
                        V2TIMConversation v2TIMConversation = new V2TIMConversation();
                        v2TIMConversation.setConversation(conversation);
                        arrayList.add(v2TIMConversation);
                    }
                    List<V2TIMConversation> listUnmodifiableList = Collections.unmodifiableList(arrayList);
                    Iterator it = V2TIMConversationManagerImpl.this.mV2TIMConversationListenerList.iterator();
                    while (it.hasNext()) {
                        ((V2TIMConversationListener) it.next()).onConversationsAddedToGroup(str, listUnmodifiableList);
                    }
                }

                @Override // com.tencent.imsdk.conversation.ConversationListener
                public void onConversationsDeletedFromGroup(String str, List<Conversation> list, int i11) {
                    ArrayList arrayList = new ArrayList();
                    for (Conversation conversation : list) {
                        V2TIMConversation v2TIMConversation = new V2TIMConversation();
                        v2TIMConversation.setConversation(conversation);
                        arrayList.add(v2TIMConversation);
                    }
                    List<V2TIMConversation> listUnmodifiableList = Collections.unmodifiableList(arrayList);
                    for (V2TIMConversationListener v2TIMConversationListener : V2TIMConversationManagerImpl.this.mV2TIMConversationListenerList) {
                        v2TIMConversationListener.onConversationsDeletedFromGroup(str, listUnmodifiableList);
                        v2TIMConversationListener.onConversationsDeletedFromGroup(str, listUnmodifiableList, i11);
                    }
                }

                @Override // com.tencent.imsdk.conversation.ConversationListener
                public void onNewConversation(List<Conversation> list) {
                    ArrayList arrayList = new ArrayList();
                    for (Conversation conversation : list) {
                        V2TIMConversation v2TIMConversation = new V2TIMConversation();
                        v2TIMConversation.setConversation(conversation);
                        arrayList.add(v2TIMConversation);
                    }
                    List<V2TIMConversation> listUnmodifiableList = Collections.unmodifiableList(arrayList);
                    Iterator it = V2TIMConversationManagerImpl.this.mV2TIMConversationListenerList.iterator();
                    while (it.hasNext()) {
                        ((V2TIMConversationListener) it.next()).onNewConversation(listUnmodifiableList);
                    }
                }

                @Override // com.tencent.imsdk.conversation.ConversationListener
                public void onSyncServerFailed() {
                    Iterator it = V2TIMConversationManagerImpl.this.mV2TIMConversationListenerList.iterator();
                    while (it.hasNext()) {
                        ((V2TIMConversationListener) it.next()).onSyncServerFailed();
                    }
                }

                @Override // com.tencent.imsdk.conversation.ConversationListener
                public void onSyncServerFinish() {
                    Iterator it = V2TIMConversationManagerImpl.this.mV2TIMConversationListenerList.iterator();
                    while (it.hasNext()) {
                        ((V2TIMConversationListener) it.next()).onSyncServerFinish();
                    }
                }

                @Override // com.tencent.imsdk.conversation.ConversationListener
                public void onSyncServerStart() {
                    Iterator it = V2TIMConversationManagerImpl.this.mV2TIMConversationListenerList.iterator();
                    while (it.hasNext()) {
                        ((V2TIMConversationListener) it.next()).onSyncServerStart();
                    }
                }

                @Override // com.tencent.imsdk.conversation.ConversationListener
                public void onUnreadMessageCountChanged(UnreadMessageCountResult unreadMessageCountResult) {
                    for (V2TIMConversationListener v2TIMConversationListener : V2TIMConversationManagerImpl.this.mV2TIMConversationListenerList) {
                        ConversationListFilter filter = unreadMessageCountResult.getFilter();
                        if (filter == null || filter.isNull()) {
                            v2TIMConversationListener.onTotalUnreadMessageCountChanged(unreadMessageCountResult.getTotalUnreadCount());
                        } else {
                            V2TIMConversationListFilter v2TIMConversationListFilter = new V2TIMConversationListFilter();
                            v2TIMConversationListFilter.setConversationFilter(filter);
                            v2TIMConversationListener.onUnreadMessageCountChangedByFilter(v2TIMConversationListFilter, unreadMessageCountResult.getTotalUnreadCount());
                        }
                    }
                }

                @Override // com.tencent.imsdk.conversation.ConversationListener
                public void onConversationDeleted(List<String> list) {
                    List<String> listUnmodifiableList = Collections.unmodifiableList(list);
                    Iterator it = V2TIMConversationManagerImpl.this.mV2TIMConversationListenerList.iterator();
                    while (it.hasNext()) {
                        ((V2TIMConversationListener) it.next()).onConversationDeleted(listUnmodifiableList);
                    }
                }
            };
        }
        ConversationManager.getInstance().setConversationListener(this.mConversationListener);
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationManager
    public void addConversationListener(final V2TIMConversationListener v2TIMConversationListener) {
        if (v2TIMConversationListener == null) {
            return;
        }
        IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.3
            @Override // java.lang.Runnable
            public void run() {
                if (V2TIMConversationManagerImpl.this.mV2TIMConversationListenerList.contains(v2TIMConversationListener)) {
                    return;
                }
                V2TIMConversationManagerImpl.this.mV2TIMConversationListenerList.add(v2TIMConversationListener);
            }
        });
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationManager
    public void cleanConversationUnreadMessageCount(String str, long j11, long j12, V2TIMCallback v2TIMCallback) {
        IMCallback iMCallback = new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.23
            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str2) {
                super.fail(i11, str2);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void success(Object obj) {
                super.success(obj);
            }
        };
        if (str == null || str.length() == 0) {
            ConversationManager.getInstance().clearUnreadMessage(true, true, iMCallback);
            return;
        }
        ConversationKey conversationKey = getConversationKey(str);
        if (1 == conversationKey.getConversationType()) {
            if (conversationKey.getConversationID().isEmpty()) {
                ConversationManager.getInstance().clearUnreadMessage(true, false, iMCallback);
                return;
            } else {
                MessageCenter.getInstance().setC2CMessageRead(conversationKey.getConversationID(), j11, iMCallback);
                return;
            }
        }
        if (2 != conversationKey.getConversationType()) {
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "conversationID is invalid");
            }
        } else if (conversationKey.getConversationID().isEmpty()) {
            ConversationManager.getInstance().clearUnreadMessage(false, true, iMCallback);
        } else {
            MessageCenter.getInstance().setGroupMessageRead(conversationKey.getConversationID(), j12, iMCallback);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationManager
    public void deleteConversationList(List<String> list, boolean z11, final V2TIMValueCallback<List<V2TIMConversationOperationResult>> v2TIMValueCallback) {
        if (list == null || list.size() == 0) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "conversationIDList is empty");
            }
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(getConversationKey(it.next()));
            }
            ConversationManager.getInstance().deleteConversationList(arrayList, z11, new IMCallback(new V2TIMValueCallback<List<ConversationOperationResult>>() { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.15
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i11, str);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(List<ConversationOperationResult> list2) {
                    ArrayList arrayList2 = new ArrayList();
                    for (ConversationOperationResult conversationOperationResult : list2) {
                        V2TIMConversationOperationResult v2TIMConversationOperationResult = new V2TIMConversationOperationResult();
                        v2TIMConversationOperationResult.setConversationOperationResult(conversationOperationResult);
                        arrayList2.add(v2TIMConversationOperationResult);
                    }
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onSuccess(arrayList2);
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.16
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

    public ConversationKey getConversationKey(String str) {
        ConversationKey conversationKey = new ConversationKey();
        if (TextUtils.isEmpty(str)) {
            return conversationKey;
        }
        if (str.indexOf(TUIConstants.TUIConversation.CONVERSATION_C2C_PREFIX) == 0) {
            String strSubstring = str.substring(4);
            conversationKey.setConversationType(1);
            conversationKey.setConversationID(strSubstring);
            return conversationKey;
        }
        if (str.indexOf(TUIConstants.TUIConversation.CONVERSATION_GROUP_PREFIX) == 0) {
            String strSubstring2 = str.substring(6);
            conversationKey.setConversationType(2);
            conversationKey.setConversationID(strSubstring2);
            return conversationKey;
        }
        if (str.equals("c2c")) {
            conversationKey.setConversationType(1);
            conversationKey.setConversationID("");
            return conversationKey;
        }
        if (str.equals("group")) {
            conversationKey.setConversationType(2);
            conversationKey.setConversationID("");
            return conversationKey;
        }
        if (str.length() == 0) {
            conversationKey.setConversationType(3);
            conversationKey.setConversationID("");
            return conversationKey;
        }
        conversationKey.setConversationType(0);
        conversationKey.setConversationID("");
        return conversationKey;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationManager
    public void getConversationListByFilter(V2TIMConversationListFilter v2TIMConversationListFilter, long j11, int i11, final V2TIMValueCallback<V2TIMConversationResult> v2TIMValueCallback) {
        if (v2TIMConversationListFilter == null) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "filter is null");
            }
        } else if (i11 > 0) {
            ConversationManager.getInstance().getConversationListByFilter(v2TIMConversationListFilter.getConversationFilter(), j11, i11, new IMCallback<ConversationResult>(new V2TIMValueCallback<ConversationResult>() { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.9
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i12, String str) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i12, str);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(ConversationResult conversationResult) {
                    if (v2TIMValueCallback != null) {
                        V2TIMConversationResult v2TIMConversationResult = new V2TIMConversationResult();
                        v2TIMConversationResult.setConversationResult(conversationResult);
                        v2TIMValueCallback.onSuccess(v2TIMConversationResult);
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.10
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(ConversationResult conversationResult) {
                    super.success(conversationResult);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i12, String str) {
                    super.fail(i12, str);
                }
            });
        } else if (v2TIMValueCallback != null) {
            v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "count is invalid");
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationManager
    public void getTotalUnreadMessageCount(final V2TIMValueCallback<Long> v2TIMValueCallback) {
        ConversationManager.getInstance().getTotalUnreadMessageCount(new ConversationListFilter(), new IMCallback<UnreadMessageCountResult>(new V2TIMValueCallback<UnreadMessageCountResult>() { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.19
            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onError(int i11, String str) {
                V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                if (v2TIMValueCallback2 != null) {
                    v2TIMValueCallback2.onError(i11, str);
                }
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onSuccess(UnreadMessageCountResult unreadMessageCountResult) {
                V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                if (v2TIMValueCallback2 != null) {
                    v2TIMValueCallback2.onSuccess(Long.valueOf(unreadMessageCountResult.getTotalUnreadCount()));
                }
            }
        }) { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.20
            @Override // com.tencent.imsdk.common.IMCallback
            public void success(UnreadMessageCountResult unreadMessageCountResult) {
                super.success(unreadMessageCountResult);
            }

            @Override // com.tencent.imsdk.common.IMCallback
            public void fail(int i11, String str) {
                super.fail(i11, str);
            }
        });
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationManager
    public void getUnreadMessageCountByFilter(V2TIMConversationListFilter v2TIMConversationListFilter, final V2TIMValueCallback<Long> v2TIMValueCallback) {
        if (v2TIMConversationListFilter == null) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "filter must not be null");
            }
        } else {
            ConversationListFilter conversationFilter = v2TIMConversationListFilter.getConversationFilter();
            if (conversationFilter.isNull()) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "one of type, conversationGroup and markType fields of the filter must be set");
            } else {
                ConversationManager.getInstance().getTotalUnreadMessageCount(conversationFilter, new IMCallback<UnreadMessageCountResult>(new V2TIMValueCallback<UnreadMessageCountResult>() { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.21
                    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                    public void onError(int i11, String str) {
                        V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                        if (v2TIMValueCallback2 != null) {
                            v2TIMValueCallback2.onError(i11, str);
                        }
                    }

                    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                    public void onSuccess(UnreadMessageCountResult unreadMessageCountResult) {
                        V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                        if (v2TIMValueCallback2 != null) {
                            v2TIMValueCallback2.onSuccess(Long.valueOf(unreadMessageCountResult.getTotalUnreadCount()));
                        }
                    }
                }) { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.22
                    @Override // com.tencent.imsdk.common.IMCallback
                    public void success(UnreadMessageCountResult unreadMessageCountResult) {
                        super.success(unreadMessageCountResult);
                    }

                    @Override // com.tencent.imsdk.common.IMCallback
                    public void fail(int i11, String str) {
                        super.fail(i11, str);
                    }
                });
            }
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationManager
    public void markConversation(List<String> list, long j11, boolean z11, final V2TIMValueCallback<List<V2TIMConversationOperationResult>> v2TIMValueCallback) {
        if (list == null || list.size() == 0) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "conversationIDList is empty");
            }
        } else if (j11 == 0) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "markType is invalid");
            }
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(getConversationKey(it.next()));
            }
            ConversationManager.getInstance().markConversation(arrayList, j11, z11, new IMCallback(new V2TIMValueCallback<List<ConversationOperationResult>>() { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.24
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i11, str);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(List<ConversationOperationResult> list2) {
                    ArrayList arrayList2 = new ArrayList();
                    for (ConversationOperationResult conversationOperationResult : list2) {
                        V2TIMConversationOperationResult v2TIMConversationOperationResult = new V2TIMConversationOperationResult();
                        v2TIMConversationOperationResult.setConversationOperationResult(conversationOperationResult);
                        arrayList2.add(v2TIMConversationOperationResult);
                    }
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onSuccess(arrayList2);
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.25
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

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationManager
    public void removeConversationListener(final V2TIMConversationListener v2TIMConversationListener) {
        if (v2TIMConversationListener == null) {
            return;
        }
        IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.4
            @Override // java.lang.Runnable
            public void run() {
                V2TIMConversationManagerImpl.this.mV2TIMConversationListenerList.remove(v2TIMConversationListener);
            }
        });
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationManager
    public void setConversationCustomData(List<String> list, String str, final V2TIMValueCallback<List<V2TIMConversationOperationResult>> v2TIMValueCallback) {
        if (list == null || list.size() == 0) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "conversationIDList is empty");
            }
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(getConversationKey(it.next()));
            }
            ConversationManager.getInstance().setConversationCustomData(arrayList, str, new IMCallback(new V2TIMValueCallback<List<ConversationOperationResult>>() { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.26
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str2) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i11, str2);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(List<ConversationOperationResult> list2) {
                    ArrayList arrayList2 = new ArrayList();
                    for (ConversationOperationResult conversationOperationResult : list2) {
                        V2TIMConversationOperationResult v2TIMConversationOperationResult = new V2TIMConversationOperationResult();
                        v2TIMConversationOperationResult.setConversationOperationResult(conversationOperationResult);
                        arrayList2.add(v2TIMConversationOperationResult);
                    }
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onSuccess(arrayList2);
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.27
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

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationManager
    public void subscribeUnreadMessageCountByFilter(V2TIMConversationListFilter v2TIMConversationListFilter) {
        if (v2TIMConversationListFilter == null) {
            return;
        }
        ConversationListFilter conversationFilter = v2TIMConversationListFilter.getConversationFilter();
        if (conversationFilter.isNull()) {
            return;
        }
        ConversationManager.getInstance().subscribeUnreadMessageCountByFilter(conversationFilter);
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationManager
    public void unsubscribeUnreadMessageCountByFilter(V2TIMConversationListFilter v2TIMConversationListFilter) {
        if (v2TIMConversationListFilter == null) {
            return;
        }
        ConversationListFilter conversationFilter = v2TIMConversationListFilter.getConversationFilter();
        if (conversationFilter.isNull()) {
            return;
        }
        ConversationManager.getInstance().unsubscribeUnreadMessageCountByFilter(conversationFilter);
    }

    public static V2TIMConversationManagerImpl getInstance() {
        return V2TIMConversationManagerImplHolder.v2TIMConversationManagerImpl;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationManager
    public void addConversationsToGroup(String str, List<String> list, final V2TIMValueCallback<List<V2TIMConversationOperationResult>> v2TIMValueCallback) {
        if (TextUtils.isEmpty(str)) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "groupName is empty");
            }
        } else {
            if (list != null && list.size() != 0) {
                ArrayList arrayList = new ArrayList();
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(getConversationKey(it.next()));
                }
                ConversationManager.getInstance().addConversationsToGroup(str, arrayList, new IMCallback(new V2TIMValueCallback<List<ConversationOperationResult>>() { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.33
                    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                    public void onError(int i11, String str2) {
                        V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                        if (v2TIMValueCallback2 != null) {
                            v2TIMValueCallback2.onError(i11, str2);
                        }
                    }

                    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                    public void onSuccess(List<ConversationOperationResult> list2) {
                        ArrayList arrayList2 = new ArrayList();
                        for (ConversationOperationResult conversationOperationResult : list2) {
                            V2TIMConversationOperationResult v2TIMConversationOperationResult = new V2TIMConversationOperationResult();
                            v2TIMConversationOperationResult.setConversationOperationResult(conversationOperationResult);
                            arrayList2.add(v2TIMConversationOperationResult);
                        }
                        V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                        if (v2TIMValueCallback2 != null) {
                            v2TIMValueCallback2.onSuccess(arrayList2);
                        }
                    }
                }) { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.34
                    @Override // com.tencent.imsdk.common.IMCallback
                    public void fail(int i11, String str2) {
                        super.fail(i11, str2);
                    }

                    @Override // com.tencent.imsdk.common.IMCallback
                    public void success(Object obj) {
                        super.success(obj);
                    }
                });
                return;
            }
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "conversationIDList is empty");
            }
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationManager
    public void createConversationGroup(String str, List<String> list, final V2TIMValueCallback<List<V2TIMConversationOperationResult>> v2TIMValueCallback) {
        if (TextUtils.isEmpty(str)) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "group name is empty");
            }
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(getConversationKey(it.next()));
            }
            ConversationManager.getInstance().createConversationGroup(str, arrayList, new IMCallback(new V2TIMValueCallback<List<ConversationOperationResult>>() { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.28
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str2) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i11, str2);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(List<ConversationOperationResult> list2) {
                    ArrayList arrayList2 = new ArrayList();
                    for (ConversationOperationResult conversationOperationResult : list2) {
                        V2TIMConversationOperationResult v2TIMConversationOperationResult = new V2TIMConversationOperationResult();
                        v2TIMConversationOperationResult.setConversationOperationResult(conversationOperationResult);
                        arrayList2.add(v2TIMConversationOperationResult);
                    }
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onSuccess(arrayList2);
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.29
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

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationManager
    public void deleteConversation(String str, final V2TIMCallback v2TIMCallback) {
        if (TextUtils.isEmpty(str)) {
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "conversationID is empty");
            }
        } else {
            ConversationKey conversationKey = getConversationKey(str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(conversationKey);
            ConversationManager.getInstance().deleteConversationList(arrayList, true, new IMCallback(new V2TIMValueCallback<List<ConversationOperationResult>>() { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.13
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str2) {
                    V2TIMCallback v2TIMCallback2 = v2TIMCallback;
                    if (v2TIMCallback2 != null) {
                        v2TIMCallback2.onError(i11, str2);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(List<ConversationOperationResult> list) {
                    if (v2TIMCallback != null) {
                        if (list.isEmpty() || list.get(0).getResultCode() == 0) {
                            v2TIMCallback.onSuccess();
                        } else {
                            v2TIMCallback.onError(list.get(0).getResultCode(), list.get(0).getResultInfo());
                        }
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.14
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

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationManager
    public void deleteConversationGroup(String str, V2TIMCallback v2TIMCallback) {
        if (TextUtils.isEmpty(str)) {
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "group name is empty");
                return;
            }
            return;
        }
        ConversationManager.getInstance().deleteConversationGroup(str, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.31
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

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationManager
    public void deleteConversationsFromGroup(String str, List<String> list, final V2TIMValueCallback<List<V2TIMConversationOperationResult>> v2TIMValueCallback) {
        if (TextUtils.isEmpty(str)) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "groupName is empty");
            }
        } else {
            if (list != null && list.size() != 0) {
                ArrayList arrayList = new ArrayList();
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(getConversationKey(it.next()));
                }
                ConversationManager.getInstance().deleteConversationsFromGroup(str, arrayList, new IMCallback(new V2TIMValueCallback<List<ConversationOperationResult>>() { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.35
                    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                    public void onError(int i11, String str2) {
                        V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                        if (v2TIMValueCallback2 != null) {
                            v2TIMValueCallback2.onError(i11, str2);
                        }
                    }

                    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                    public void onSuccess(List<ConversationOperationResult> list2) {
                        ArrayList arrayList2 = new ArrayList();
                        for (ConversationOperationResult conversationOperationResult : list2) {
                            V2TIMConversationOperationResult v2TIMConversationOperationResult = new V2TIMConversationOperationResult();
                            v2TIMConversationOperationResult.setConversationOperationResult(conversationOperationResult);
                            arrayList2.add(v2TIMConversationOperationResult);
                        }
                        V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                        if (v2TIMValueCallback2 != null) {
                            v2TIMValueCallback2.onSuccess(arrayList2);
                        }
                    }
                }) { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.36
                    @Override // com.tencent.imsdk.common.IMCallback
                    public void fail(int i11, String str2) {
                        super.fail(i11, str2);
                    }

                    @Override // com.tencent.imsdk.common.IMCallback
                    public void success(Object obj) {
                        super.success(obj);
                    }
                });
                return;
            }
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "conversationIDList is empty");
            }
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationManager
    public void getConversation(String str, final V2TIMValueCallback<V2TIMConversation> v2TIMValueCallback) {
        if (TextUtils.isEmpty(str)) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "conversationID is empty");
            }
        } else {
            ConversationManager.getInstance().getConversationInfo(getConversationKey(str), new IMCallback<Conversation>(new V2TIMValueCallback<Conversation>() { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.11
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str2) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i11, str2);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(Conversation conversation) {
                    if (v2TIMValueCallback != null) {
                        V2TIMConversation v2TIMConversation = new V2TIMConversation();
                        v2TIMConversation.setConversation(conversation);
                        v2TIMValueCallback.onSuccess(v2TIMConversation);
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.12
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(Conversation conversation) {
                    super.success(conversation);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str2) {
                    super.fail(i11, str2);
                }
            });
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationManager
    public void getConversationGroupList(V2TIMValueCallback<List<String>> v2TIMValueCallback) {
        ConversationManager.getInstance().getConversationGroupList(new IMCallback(v2TIMValueCallback) { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.30
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

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationManager
    public void pinConversation(String str, boolean z11, V2TIMCallback v2TIMCallback) {
        if (TextUtils.isEmpty(str)) {
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "conversationID is empty");
            }
        } else {
            ConversationManager.getInstance().pinConversation(getConversationKey(str), z11, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.18
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

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationManager
    public void renameConversationGroup(String str, String str2, V2TIMCallback v2TIMCallback) {
        if (TextUtils.isEmpty(str)) {
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "oldName is empty");
            }
        } else {
            if (TextUtils.isEmpty(str2)) {
                if (v2TIMCallback != null) {
                    v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "newName is empty");
                    return;
                }
                return;
            }
            ConversationManager.getInstance().renameConversationGroup(str, str2, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.32
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

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationManager
    public void setConversationDraft(String str, String str2, V2TIMCallback v2TIMCallback) {
        if (TextUtils.isEmpty(str)) {
            if (v2TIMCallback != null) {
                v2TIMCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "conversationID is empty");
            }
        } else {
            ConversationKey conversationKey = getConversationKey(str);
            DraftMessage draftMessage = new DraftMessage();
            if (str2 != null) {
                draftMessage.setUserDefinedData(str2.getBytes());
            }
            ConversationManager.getInstance().setConversationDraft(conversationKey, draftMessage, new IMCallback(v2TIMCallback) { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.17
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

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationManager
    public void setConversationListener(final V2TIMConversationListener v2TIMConversationListener) {
        IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.2
            @Override // java.lang.Runnable
            public void run() {
                if (V2TIMConversationManagerImpl.this.mV2TIMConversationListener != null) {
                    V2TIMConversationManagerImpl.this.mV2TIMConversationListenerList.remove(V2TIMConversationManagerImpl.this.mV2TIMConversationListener);
                }
                if (v2TIMConversationListener != null) {
                    V2TIMConversationManagerImpl.this.mV2TIMConversationListenerList.add(v2TIMConversationListener);
                }
                V2TIMConversationManagerImpl.this.mV2TIMConversationListener = v2TIMConversationListener;
            }
        });
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationManager
    public void getConversationList(List<String> list, final V2TIMValueCallback<List<V2TIMConversation>> v2TIMValueCallback) {
        if (list == null || list.size() == 0) {
            if (v2TIMValueCallback != null) {
                v2TIMValueCallback.onError(BaseConstants.ERR_INVALID_PARAMETERS, "conversationIDList cannot be empty");
            }
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(getConversationKey(it.next()));
            }
            ConversationManager.getInstance().getConversationList(arrayList, new IMCallback<List<Conversation>>(new V2TIMValueCallback<List<Conversation>>() { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.7
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str) {
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onError(i11, str);
                    }
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(List<Conversation> list2) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Conversation conversation : list2) {
                        V2TIMConversation v2TIMConversation = new V2TIMConversation();
                        v2TIMConversation.setConversation(conversation);
                        arrayList2.add(v2TIMConversation);
                    }
                    V2TIMValueCallback v2TIMValueCallback2 = v2TIMValueCallback;
                    if (v2TIMValueCallback2 != null) {
                        v2TIMValueCallback2.onSuccess(arrayList2);
                    }
                }
            }) { // from class: com.tencent.imsdk.v2.V2TIMConversationManagerImpl.8
                @Override // com.tencent.imsdk.common.IMCallback
                public void success(List<Conversation> list2) {
                    super.success(list2);
                }

                @Override // com.tencent.imsdk.common.IMCallback
                public void fail(int i11, String str) {
                    super.fail(i11, str);
                }
            });
        }
    }
}
