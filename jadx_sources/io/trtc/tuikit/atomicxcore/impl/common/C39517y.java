package io.trtc.tuikit.atomicxcore.impl.common;

import com.tencent.imsdk.p128v2.V2TIMGroupListener;
import com.tencent.imsdk.p128v2.V2TIMGroupMemberInfo;
import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.imsdk.p128v2.V2TIMTopicInfo;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.common.y */
/* JADX INFO: loaded from: classes61.dex */
public final class C39517y extends V2TIMGroupListener {

    /* JADX INFO: renamed from: a */
    public final WeakReference f87713a;

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onAllGroupMembersMuted(String str, boolean z11) {
        V2TIMGroupListener v2TIMGroupListener = (V2TIMGroupListener) this.f87713a.get();
        if (v2TIMGroupListener == null) {
            V2TIMManager.getInstance().removeGroupListener(this);
        } else {
            v2TIMGroupListener.onAllGroupMembersMuted(str, z11);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onApplicationProcessed(String str, V2TIMGroupMemberInfo v2TIMGroupMemberInfo, boolean z11, String str2) {
        V2TIMGroupListener v2TIMGroupListener = (V2TIMGroupListener) this.f87713a.get();
        if (v2TIMGroupListener == null) {
            V2TIMManager.getInstance().removeGroupListener(this);
        } else {
            v2TIMGroupListener.onApplicationProcessed(str, v2TIMGroupMemberInfo, z11, str2);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onGrantAdministrator(String str, V2TIMGroupMemberInfo v2TIMGroupMemberInfo, List list) {
        V2TIMGroupListener v2TIMGroupListener = (V2TIMGroupListener) this.f87713a.get();
        if (v2TIMGroupListener == null) {
            V2TIMManager.getInstance().removeGroupListener(this);
        } else {
            v2TIMGroupListener.onGrantAdministrator(str, v2TIMGroupMemberInfo, list);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onGroupAttributeChanged(String str, Map map) {
        V2TIMGroupListener v2TIMGroupListener = (V2TIMGroupListener) this.f87713a.get();
        if (v2TIMGroupListener == null) {
            V2TIMManager.getInstance().removeGroupListener(this);
        } else {
            v2TIMGroupListener.onGroupAttributeChanged(str, map);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onGroupCounterChanged(String str, String str2, long j11) {
        V2TIMGroupListener v2TIMGroupListener = (V2TIMGroupListener) this.f87713a.get();
        if (v2TIMGroupListener == null) {
            V2TIMManager.getInstance().removeGroupListener(this);
        } else {
            v2TIMGroupListener.onGroupCounterChanged(str, str2, j11);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onGroupCreated(String str) {
        V2TIMGroupListener v2TIMGroupListener = (V2TIMGroupListener) this.f87713a.get();
        if (v2TIMGroupListener == null) {
            V2TIMManager.getInstance().removeGroupListener(this);
        } else {
            v2TIMGroupListener.onGroupCreated(str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onGroupDismissed(String str, V2TIMGroupMemberInfo v2TIMGroupMemberInfo) {
        V2TIMGroupListener v2TIMGroupListener = (V2TIMGroupListener) this.f87713a.get();
        if (v2TIMGroupListener == null) {
            V2TIMManager.getInstance().removeGroupListener(this);
        } else {
            v2TIMGroupListener.onGroupDismissed(str, v2TIMGroupMemberInfo);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onGroupInfoChanged(String groupID, List changeInfoList) {
        Intrinsics.checkNotNullParameter(groupID, "groupID");
        Intrinsics.checkNotNullParameter(changeInfoList, "changeInfoList");
        V2TIMGroupListener v2TIMGroupListener = (V2TIMGroupListener) this.f87713a.get();
        if (v2TIMGroupListener == null) {
            V2TIMManager.getInstance().removeGroupListener(this);
        } else {
            v2TIMGroupListener.onGroupInfoChanged(groupID, changeInfoList);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onGroupRecycled(String str, V2TIMGroupMemberInfo v2TIMGroupMemberInfo) {
        V2TIMGroupListener v2TIMGroupListener = (V2TIMGroupListener) this.f87713a.get();
        if (v2TIMGroupListener == null) {
            V2TIMManager.getInstance().removeGroupListener(this);
        } else {
            v2TIMGroupListener.onGroupRecycled(str, v2TIMGroupMemberInfo);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onMemberEnter(String groupID, List memberList) {
        Intrinsics.checkNotNullParameter(groupID, "groupID");
        Intrinsics.checkNotNullParameter(memberList, "memberList");
        V2TIMGroupListener v2TIMGroupListener = (V2TIMGroupListener) this.f87713a.get();
        if (v2TIMGroupListener == null) {
            V2TIMManager.getInstance().removeGroupListener(this);
        } else {
            v2TIMGroupListener.onMemberEnter(groupID, memberList);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onMemberInfoChanged(String str, List list) {
        V2TIMGroupListener v2TIMGroupListener = (V2TIMGroupListener) this.f87713a.get();
        if (v2TIMGroupListener == null) {
            V2TIMManager.getInstance().removeGroupListener(this);
        } else {
            v2TIMGroupListener.onMemberInfoChanged(str, list);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onMemberInvited(String groupID, V2TIMGroupMemberInfo opUser, List memberList) {
        Intrinsics.checkNotNullParameter(groupID, "groupID");
        Intrinsics.checkNotNullParameter(opUser, "opUser");
        Intrinsics.checkNotNullParameter(memberList, "memberList");
        V2TIMGroupListener v2TIMGroupListener = (V2TIMGroupListener) this.f87713a.get();
        if (v2TIMGroupListener == null) {
            V2TIMManager.getInstance().removeGroupListener(this);
        } else {
            v2TIMGroupListener.onMemberInvited(groupID, opUser, memberList);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onMemberKicked(String groupID, V2TIMGroupMemberInfo opUser, List memberList) {
        Intrinsics.checkNotNullParameter(groupID, "groupID");
        Intrinsics.checkNotNullParameter(opUser, "opUser");
        Intrinsics.checkNotNullParameter(memberList, "memberList");
        V2TIMGroupListener v2TIMGroupListener = (V2TIMGroupListener) this.f87713a.get();
        if (v2TIMGroupListener == null) {
            V2TIMManager.getInstance().removeGroupListener(this);
        } else {
            v2TIMGroupListener.onMemberKicked(groupID, opUser, memberList);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onMemberLeave(String groupID, V2TIMGroupMemberInfo member) {
        Intrinsics.checkNotNullParameter(groupID, "groupID");
        Intrinsics.checkNotNullParameter(member, "member");
        V2TIMGroupListener v2TIMGroupListener = (V2TIMGroupListener) this.f87713a.get();
        if (v2TIMGroupListener == null) {
            V2TIMManager.getInstance().removeGroupListener(this);
        } else {
            v2TIMGroupListener.onMemberLeave(groupID, member);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onMemberMarkChanged(String str, List list, int i11, boolean z11) {
        V2TIMGroupListener v2TIMGroupListener = (V2TIMGroupListener) this.f87713a.get();
        if (v2TIMGroupListener == null) {
            V2TIMManager.getInstance().removeGroupListener(this);
        } else {
            v2TIMGroupListener.onMemberMarkChanged(str, list, i11, z11);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onQuitFromGroup(String str) {
        V2TIMGroupListener v2TIMGroupListener = (V2TIMGroupListener) this.f87713a.get();
        if (v2TIMGroupListener == null) {
            V2TIMManager.getInstance().removeGroupListener(this);
        } else {
            v2TIMGroupListener.onQuitFromGroup(str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onReceiveJoinApplication(String str, V2TIMGroupMemberInfo v2TIMGroupMemberInfo, String str2) {
        V2TIMGroupListener v2TIMGroupListener = (V2TIMGroupListener) this.f87713a.get();
        if (v2TIMGroupListener == null) {
            V2TIMManager.getInstance().removeGroupListener(this);
        } else {
            v2TIMGroupListener.onReceiveJoinApplication(str, v2TIMGroupMemberInfo, str2);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onReceiveRESTCustomData(String str, byte[] bArr) {
        V2TIMGroupListener v2TIMGroupListener = (V2TIMGroupListener) this.f87713a.get();
        if (v2TIMGroupListener == null) {
            V2TIMManager.getInstance().removeGroupListener(this);
        } else {
            v2TIMGroupListener.onReceiveRESTCustomData(str, bArr);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onRevokeAdministrator(String str, V2TIMGroupMemberInfo v2TIMGroupMemberInfo, List list) {
        V2TIMGroupListener v2TIMGroupListener = (V2TIMGroupListener) this.f87713a.get();
        if (v2TIMGroupListener == null) {
            V2TIMManager.getInstance().removeGroupListener(this);
        } else {
            v2TIMGroupListener.onRevokeAdministrator(str, v2TIMGroupMemberInfo, list);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onTopicCreated(String str, String str2) {
        V2TIMGroupListener v2TIMGroupListener = (V2TIMGroupListener) this.f87713a.get();
        if (v2TIMGroupListener == null) {
            V2TIMManager.getInstance().removeGroupListener(this);
        } else {
            v2TIMGroupListener.onTopicCreated(str, str2);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onTopicDeleted(String str, List list) {
        V2TIMGroupListener v2TIMGroupListener = (V2TIMGroupListener) this.f87713a.get();
        if (v2TIMGroupListener == null) {
            V2TIMManager.getInstance().removeGroupListener(this);
        } else {
            v2TIMGroupListener.onTopicDeleted(str, list);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onTopicInfoChanged(String str, V2TIMTopicInfo v2TIMTopicInfo) {
        V2TIMGroupListener v2TIMGroupListener = (V2TIMGroupListener) this.f87713a.get();
        if (v2TIMGroupListener == null) {
            V2TIMManager.getInstance().removeGroupListener(this);
        } else {
            v2TIMGroupListener.onTopicInfoChanged(str, v2TIMTopicInfo);
        }
    }

    public C39517y(V2TIMGroupListener target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f87713a = new WeakReference(target);
    }
}
