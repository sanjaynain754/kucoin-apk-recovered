package io.trtc.tuikit.atomicxcore.impl.common;

import com.tencent.imsdk.p128v2.V2TIMConversationListFilter;
import com.tencent.imsdk.p128v2.V2TIMConversationListener;
import com.tencent.imsdk.p128v2.V2TIMManager;
import java.lang.ref.WeakReference;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.common.w */
/* JADX INFO: loaded from: classes61.dex */
public final class C39515w extends V2TIMConversationListener {

    /* JADX INFO: renamed from: a */
    public final WeakReference f87711a;

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationListener
    public final void onConversationChanged(List conversationList) {
        Intrinsics.checkNotNullParameter(conversationList, "conversationList");
        V2TIMConversationListener v2TIMConversationListener = (V2TIMConversationListener) this.f87711a.get();
        if (v2TIMConversationListener == null) {
            V2TIMManager.getConversationManager().removeConversationListener(this);
        } else {
            v2TIMConversationListener.onConversationChanged(conversationList);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationListener
    public final void onConversationDeleted(List conversationIDList) {
        Intrinsics.checkNotNullParameter(conversationIDList, "conversationIDList");
        V2TIMConversationListener v2TIMConversationListener = (V2TIMConversationListener) this.f87711a.get();
        if (v2TIMConversationListener == null) {
            V2TIMManager.getConversationManager().removeConversationListener(this);
        } else {
            v2TIMConversationListener.onConversationDeleted(conversationIDList);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationListener
    public final void onConversationGroupCreated(String str, List list) {
        V2TIMConversationListener v2TIMConversationListener = (V2TIMConversationListener) this.f87711a.get();
        if (v2TIMConversationListener == null) {
            V2TIMManager.getConversationManager().removeConversationListener(this);
        } else {
            v2TIMConversationListener.onConversationGroupCreated(str, list);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationListener
    public final void onConversationGroupDeleted(String str) {
        V2TIMConversationListener v2TIMConversationListener = (V2TIMConversationListener) this.f87711a.get();
        if (v2TIMConversationListener == null) {
            V2TIMManager.getConversationManager().removeConversationListener(this);
        } else {
            v2TIMConversationListener.onConversationGroupDeleted(str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationListener
    public final void onConversationGroupNameChanged(String str, String str2) {
        V2TIMConversationListener v2TIMConversationListener = (V2TIMConversationListener) this.f87711a.get();
        if (v2TIMConversationListener == null) {
            V2TIMManager.getConversationManager().removeConversationListener(this);
        } else {
            v2TIMConversationListener.onConversationGroupNameChanged(str, str2);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationListener
    public final void onConversationsAddedToGroup(String str, List list) {
        V2TIMConversationListener v2TIMConversationListener = (V2TIMConversationListener) this.f87711a.get();
        if (v2TIMConversationListener == null) {
            V2TIMManager.getConversationManager().removeConversationListener(this);
        } else {
            v2TIMConversationListener.onConversationsAddedToGroup(str, list);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationListener
    public final void onConversationsDeletedFromGroup(String str, List list, int i11) {
        V2TIMConversationListener v2TIMConversationListener = (V2TIMConversationListener) this.f87711a.get();
        if (v2TIMConversationListener == null) {
            V2TIMManager.getConversationManager().removeConversationListener(this);
        } else {
            v2TIMConversationListener.onConversationsDeletedFromGroup(str, list, i11);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationListener
    public final void onNewConversation(List conversationList) {
        Intrinsics.checkNotNullParameter(conversationList, "conversationList");
        V2TIMConversationListener v2TIMConversationListener = (V2TIMConversationListener) this.f87711a.get();
        if (v2TIMConversationListener == null) {
            V2TIMManager.getConversationManager().removeConversationListener(this);
        } else {
            v2TIMConversationListener.onNewConversation(conversationList);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationListener
    public final void onSyncServerFailed() {
        V2TIMConversationListener v2TIMConversationListener = (V2TIMConversationListener) this.f87711a.get();
        if (v2TIMConversationListener == null) {
            V2TIMManager.getConversationManager().removeConversationListener(this);
        } else {
            v2TIMConversationListener.onSyncServerFailed();
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationListener
    public final void onSyncServerFinish() {
        V2TIMConversationListener v2TIMConversationListener = (V2TIMConversationListener) this.f87711a.get();
        if (v2TIMConversationListener == null) {
            V2TIMManager.getConversationManager().removeConversationListener(this);
        } else {
            v2TIMConversationListener.onSyncServerFinish();
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationListener
    public final void onSyncServerStart() {
        V2TIMConversationListener v2TIMConversationListener = (V2TIMConversationListener) this.f87711a.get();
        if (v2TIMConversationListener == null) {
            V2TIMManager.getConversationManager().removeConversationListener(this);
        } else {
            v2TIMConversationListener.onSyncServerStart();
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationListener
    public final void onTotalUnreadMessageCountChanged(long j11) {
        V2TIMConversationListener v2TIMConversationListener = (V2TIMConversationListener) this.f87711a.get();
        if (v2TIMConversationListener == null) {
            V2TIMManager.getConversationManager().removeConversationListener(this);
        } else {
            v2TIMConversationListener.onTotalUnreadMessageCountChanged(j11);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationListener
    public final void onUnreadMessageCountChangedByFilter(V2TIMConversationListFilter v2TIMConversationListFilter, long j11) {
        V2TIMConversationListener v2TIMConversationListener = (V2TIMConversationListener) this.f87711a.get();
        if (v2TIMConversationListener == null) {
            V2TIMManager.getConversationManager().removeConversationListener(this);
        } else {
            v2TIMConversationListener.onUnreadMessageCountChangedByFilter(v2TIMConversationListFilter, j11);
        }
    }

    public C39515w(V2TIMConversationListener target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f87711a = new WeakReference(target);
    }
}
