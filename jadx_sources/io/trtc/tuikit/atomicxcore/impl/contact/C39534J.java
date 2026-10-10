package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMGroupListener;
import com.tencent.imsdk.p128v2.V2TIMGroupMemberInfo;
import io.trtc.tuikit.atomicxcore.api.contact.ContactListStore;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.J */
/* JADX INFO: loaded from: classes61.dex */
public final class C39534J extends V2TIMGroupListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39539O f87789a;

    public C39534J(C39539O c39539o) {
        this.f87789a = c39539o;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onReceiveJoinApplication(String str, V2TIMGroupMemberInfo v2TIMGroupMemberInfo, String str2) {
        ContactListStore.fetchGroupApplicationList$default(this.f87789a, null, 1, null);
    }
}
