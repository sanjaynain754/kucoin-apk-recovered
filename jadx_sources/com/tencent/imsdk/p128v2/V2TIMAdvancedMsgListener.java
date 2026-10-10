package com.tencent.imsdk.p128v2;

import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public abstract class V2TIMAdvancedMsgListener {
    @Deprecated
    public void onRecvMessageRevoked(String str) {
    }

    public void onRecvMessageRevoked(String str, V2TIMUserFullInfo v2TIMUserFullInfo, String str2) {
    }

    public void onRecvC2CReadReceipt(List<V2TIMMessageReceipt> list) {
    }

    public void onRecvMessageModified(V2TIMMessage v2TIMMessage) {
    }

    public void onRecvMessageReactionsChanged(List<V2TIMMessageReactionChangeInfo> list) {
    }

    public void onRecvMessageReadReceipts(List<V2TIMMessageReceipt> list) {
    }

    public void onRecvNewMessage(V2TIMMessage v2TIMMessage) {
    }

    public void onRecvTTSResponse(V2TIMTTSResponse v2TIMTTSResponse) {
    }

    public void onRecvMessageExtensionsChanged(String str, List<V2TIMMessageExtension> list) {
    }

    public void onRecvMessageExtensionsDeleted(String str, List<String> list) {
    }

    public void onGroupMessagePinned(String str, V2TIMMessage v2TIMMessage, boolean z11, V2TIMGroupMemberInfo v2TIMGroupMemberInfo) {
    }
}
