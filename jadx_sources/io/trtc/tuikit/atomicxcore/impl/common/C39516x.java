package io.trtc.tuikit.atomicxcore.impl.common;

import com.tencent.imsdk.p128v2.V2TIMFriendshipListener;
import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.imsdk.p128v2.V2TIMOfficialAccountInfo;
import java.lang.ref.WeakReference;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.common.x */
/* JADX INFO: loaded from: classes61.dex */
public final class C39516x extends V2TIMFriendshipListener {

    /* JADX INFO: renamed from: a */
    public final WeakReference f87712a;

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onBlackListAdd(List list) {
        V2TIMFriendshipListener v2TIMFriendshipListener = (V2TIMFriendshipListener) this.f87712a.get();
        if (v2TIMFriendshipListener == null) {
            V2TIMManager.getFriendshipManager().removeFriendListener(this);
        } else {
            v2TIMFriendshipListener.onBlackListAdd(list);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onBlackListDeleted(List list) {
        V2TIMFriendshipListener v2TIMFriendshipListener = (V2TIMFriendshipListener) this.f87712a.get();
        if (v2TIMFriendshipListener == null) {
            V2TIMManager.getFriendshipManager().removeFriendListener(this);
        } else {
            v2TIMFriendshipListener.onBlackListDeleted(list);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onFriendApplicationListAdded(List list) {
        V2TIMFriendshipListener v2TIMFriendshipListener = (V2TIMFriendshipListener) this.f87712a.get();
        if (v2TIMFriendshipListener == null) {
            V2TIMManager.getFriendshipManager().removeFriendListener(this);
        } else {
            v2TIMFriendshipListener.onFriendApplicationListAdded(list);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onFriendApplicationListDeleted(List list) {
        V2TIMFriendshipListener v2TIMFriendshipListener = (V2TIMFriendshipListener) this.f87712a.get();
        if (v2TIMFriendshipListener == null) {
            V2TIMManager.getFriendshipManager().removeFriendListener(this);
        } else {
            v2TIMFriendshipListener.onFriendApplicationListDeleted(list);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onFriendApplicationListRead() {
        V2TIMFriendshipListener v2TIMFriendshipListener = (V2TIMFriendshipListener) this.f87712a.get();
        if (v2TIMFriendshipListener == null) {
            V2TIMManager.getFriendshipManager().removeFriendListener(this);
        } else {
            v2TIMFriendshipListener.onFriendApplicationListRead();
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onFriendGroupCreated(String str, List list) {
        V2TIMFriendshipListener v2TIMFriendshipListener = (V2TIMFriendshipListener) this.f87712a.get();
        if (v2TIMFriendshipListener == null) {
            V2TIMManager.getFriendshipManager().removeFriendListener(this);
        } else {
            v2TIMFriendshipListener.onFriendGroupCreated(str, list);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onFriendGroupDeleted(List list) {
        V2TIMFriendshipListener v2TIMFriendshipListener = (V2TIMFriendshipListener) this.f87712a.get();
        if (v2TIMFriendshipListener == null) {
            V2TIMManager.getFriendshipManager().removeFriendListener(this);
        } else {
            v2TIMFriendshipListener.onFriendGroupDeleted(list);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onFriendGroupNameChanged(String str, String str2) {
        V2TIMFriendshipListener v2TIMFriendshipListener = (V2TIMFriendshipListener) this.f87712a.get();
        if (v2TIMFriendshipListener == null) {
            V2TIMManager.getFriendshipManager().removeFriendListener(this);
        } else {
            v2TIMFriendshipListener.onFriendGroupNameChanged(str, str2);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onFriendInfoChanged(List list) {
        V2TIMFriendshipListener v2TIMFriendshipListener = (V2TIMFriendshipListener) this.f87712a.get();
        if (v2TIMFriendshipListener == null) {
            V2TIMManager.getFriendshipManager().removeFriendListener(this);
        } else {
            v2TIMFriendshipListener.onFriendInfoChanged(list);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onFriendListAdded(List list) {
        V2TIMFriendshipListener v2TIMFriendshipListener = (V2TIMFriendshipListener) this.f87712a.get();
        if (v2TIMFriendshipListener == null) {
            V2TIMManager.getFriendshipManager().removeFriendListener(this);
        } else {
            v2TIMFriendshipListener.onFriendListAdded(list);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onFriendListDeleted(List list) {
        V2TIMFriendshipListener v2TIMFriendshipListener = (V2TIMFriendshipListener) this.f87712a.get();
        if (v2TIMFriendshipListener == null) {
            V2TIMManager.getFriendshipManager().removeFriendListener(this);
        } else {
            v2TIMFriendshipListener.onFriendListDeleted(list);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onFriendsAddedToGroup(String str, List list) {
        V2TIMFriendshipListener v2TIMFriendshipListener = (V2TIMFriendshipListener) this.f87712a.get();
        if (v2TIMFriendshipListener == null) {
            V2TIMManager.getFriendshipManager().removeFriendListener(this);
        } else {
            v2TIMFriendshipListener.onFriendsAddedToGroup(str, list);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onFriendsDeletedFromGroup(String str, List list) {
        V2TIMFriendshipListener v2TIMFriendshipListener = (V2TIMFriendshipListener) this.f87712a.get();
        if (v2TIMFriendshipListener == null) {
            V2TIMManager.getFriendshipManager().removeFriendListener(this);
        } else {
            v2TIMFriendshipListener.onFriendsDeletedFromGroup(str, list);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onMutualFollowersListChanged(List list, boolean z11) {
        V2TIMFriendshipListener v2TIMFriendshipListener = (V2TIMFriendshipListener) this.f87712a.get();
        if (v2TIMFriendshipListener == null) {
            V2TIMManager.getFriendshipManager().removeFriendListener(this);
        } else {
            v2TIMFriendshipListener.onMutualFollowersListChanged(list, z11);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onMyFollowersListChanged(List list, boolean z11) {
        V2TIMFriendshipListener v2TIMFriendshipListener = (V2TIMFriendshipListener) this.f87712a.get();
        if (v2TIMFriendshipListener == null) {
            V2TIMManager.getFriendshipManager().removeFriendListener(this);
        } else {
            v2TIMFriendshipListener.onMyFollowersListChanged(list, z11);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onMyFollowingListChanged(List list, boolean z11) {
        V2TIMFriendshipListener v2TIMFriendshipListener = (V2TIMFriendshipListener) this.f87712a.get();
        if (v2TIMFriendshipListener == null) {
            V2TIMManager.getFriendshipManager().removeFriendListener(this);
        } else {
            v2TIMFriendshipListener.onMyFollowingListChanged(list, z11);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onOfficialAccountDeleted(String str) {
        V2TIMFriendshipListener v2TIMFriendshipListener = (V2TIMFriendshipListener) this.f87712a.get();
        if (v2TIMFriendshipListener == null) {
            V2TIMManager.getFriendshipManager().removeFriendListener(this);
        } else {
            v2TIMFriendshipListener.onOfficialAccountDeleted(str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onOfficialAccountInfoChanged(V2TIMOfficialAccountInfo v2TIMOfficialAccountInfo) {
        V2TIMFriendshipListener v2TIMFriendshipListener = (V2TIMFriendshipListener) this.f87712a.get();
        if (v2TIMFriendshipListener == null) {
            V2TIMManager.getFriendshipManager().removeFriendListener(this);
        } else {
            v2TIMFriendshipListener.onOfficialAccountInfoChanged(v2TIMOfficialAccountInfo);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onOfficialAccountSubscribed(V2TIMOfficialAccountInfo v2TIMOfficialAccountInfo) {
        V2TIMFriendshipListener v2TIMFriendshipListener = (V2TIMFriendshipListener) this.f87712a.get();
        if (v2TIMFriendshipListener == null) {
            V2TIMManager.getFriendshipManager().removeFriendListener(this);
        } else {
            v2TIMFriendshipListener.onOfficialAccountSubscribed(v2TIMOfficialAccountInfo);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onOfficialAccountUnsubscribed(String str) {
        V2TIMFriendshipListener v2TIMFriendshipListener = (V2TIMFriendshipListener) this.f87712a.get();
        if (v2TIMFriendshipListener == null) {
            V2TIMManager.getFriendshipManager().removeFriendListener(this);
        } else {
            v2TIMFriendshipListener.onOfficialAccountUnsubscribed(str);
        }
    }

    public C39516x(V2TIMFriendshipListener target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f87712a = new WeakReference(target);
    }
}
