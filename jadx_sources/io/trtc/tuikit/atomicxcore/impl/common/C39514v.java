package io.trtc.tuikit.atomicxcore.impl.common;

import com.tencent.imsdk.p128v2.V2TIMAdvancedMsgListener;
import com.tencent.imsdk.p128v2.V2TIMGroupMemberInfo;
import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.imsdk.p128v2.V2TIMMessage;
import com.tencent.imsdk.p128v2.V2TIMUserFullInfo;
import java.lang.ref.WeakReference;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.common.v */
/* JADX INFO: loaded from: classes61.dex */
public final class C39514v extends V2TIMAdvancedMsgListener {

    /* JADX INFO: renamed from: a */
    public final WeakReference f87710a;

    @Override // com.tencent.imsdk.p128v2.V2TIMAdvancedMsgListener
    public final void onGroupMessagePinned(String str, V2TIMMessage v2TIMMessage, boolean z11, V2TIMGroupMemberInfo v2TIMGroupMemberInfo) {
        V2TIMAdvancedMsgListener v2TIMAdvancedMsgListener = (V2TIMAdvancedMsgListener) this.f87710a.get();
        if (v2TIMAdvancedMsgListener == null) {
            V2TIMManager.getMessageManager().removeAdvancedMsgListener(this);
        } else {
            v2TIMAdvancedMsgListener.onGroupMessagePinned(str, v2TIMMessage, z11, v2TIMGroupMemberInfo);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMAdvancedMsgListener
    public final void onRecvC2CReadReceipt(List list) {
        V2TIMAdvancedMsgListener v2TIMAdvancedMsgListener = (V2TIMAdvancedMsgListener) this.f87710a.get();
        if (v2TIMAdvancedMsgListener == null) {
            V2TIMManager.getMessageManager().removeAdvancedMsgListener(this);
        } else {
            v2TIMAdvancedMsgListener.onRecvC2CReadReceipt(list);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMAdvancedMsgListener
    public final void onRecvMessageExtensionsChanged(String str, List list) {
        V2TIMAdvancedMsgListener v2TIMAdvancedMsgListener = (V2TIMAdvancedMsgListener) this.f87710a.get();
        if (v2TIMAdvancedMsgListener == null) {
            V2TIMManager.getMessageManager().removeAdvancedMsgListener(this);
        } else {
            v2TIMAdvancedMsgListener.onRecvMessageExtensionsChanged(str, list);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMAdvancedMsgListener
    public final void onRecvMessageExtensionsDeleted(String msgID, List extensionKeys) {
        Intrinsics.checkNotNullParameter(msgID, "msgID");
        Intrinsics.checkNotNullParameter(extensionKeys, "extensionKeys");
        V2TIMAdvancedMsgListener v2TIMAdvancedMsgListener = (V2TIMAdvancedMsgListener) this.f87710a.get();
        if (v2TIMAdvancedMsgListener == null) {
            V2TIMManager.getMessageManager().removeAdvancedMsgListener(this);
        } else {
            v2TIMAdvancedMsgListener.onRecvMessageExtensionsDeleted(msgID, extensionKeys);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMAdvancedMsgListener
    public final void onRecvMessageModified(V2TIMMessage msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        V2TIMAdvancedMsgListener v2TIMAdvancedMsgListener = (V2TIMAdvancedMsgListener) this.f87710a.get();
        if (v2TIMAdvancedMsgListener == null) {
            V2TIMManager.getMessageManager().removeAdvancedMsgListener(this);
        } else {
            v2TIMAdvancedMsgListener.onRecvMessageModified(msg);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMAdvancedMsgListener
    public final void onRecvMessageReactionsChanged(List changedList) {
        Intrinsics.checkNotNullParameter(changedList, "changedList");
        V2TIMAdvancedMsgListener v2TIMAdvancedMsgListener = (V2TIMAdvancedMsgListener) this.f87710a.get();
        if (v2TIMAdvancedMsgListener == null) {
            V2TIMManager.getMessageManager().removeAdvancedMsgListener(this);
        } else {
            v2TIMAdvancedMsgListener.onRecvMessageReactionsChanged(changedList);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMAdvancedMsgListener
    public final void onRecvMessageReadReceipts(List receiptList) {
        Intrinsics.checkNotNullParameter(receiptList, "receiptList");
        V2TIMAdvancedMsgListener v2TIMAdvancedMsgListener = (V2TIMAdvancedMsgListener) this.f87710a.get();
        if (v2TIMAdvancedMsgListener == null) {
            V2TIMManager.getMessageManager().removeAdvancedMsgListener(this);
        } else {
            v2TIMAdvancedMsgListener.onRecvMessageReadReceipts(receiptList);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMAdvancedMsgListener
    public final void onRecvMessageRevoked(String str, V2TIMUserFullInfo v2TIMUserFullInfo, String str2) {
        V2TIMAdvancedMsgListener v2TIMAdvancedMsgListener = (V2TIMAdvancedMsgListener) this.f87710a.get();
        if (v2TIMAdvancedMsgListener == null) {
            V2TIMManager.getMessageManager().removeAdvancedMsgListener(this);
        } else {
            v2TIMAdvancedMsgListener.onRecvMessageRevoked(str, v2TIMUserFullInfo, str2);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMAdvancedMsgListener
    public final void onRecvNewMessage(V2TIMMessage msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        V2TIMAdvancedMsgListener v2TIMAdvancedMsgListener = (V2TIMAdvancedMsgListener) this.f87710a.get();
        if (v2TIMAdvancedMsgListener == null) {
            V2TIMManager.getMessageManager().removeAdvancedMsgListener(this);
        } else {
            v2TIMAdvancedMsgListener.onRecvNewMessage(msg);
        }
    }

    public C39514v(V2TIMAdvancedMsgListener target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f87710a = new WeakReference(target);
    }
}
