package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMFriendInfo;
import com.tencent.imsdk.p128v2.V2TIMFriendshipListener;
import io.trtc.tuikit.atomicxcore.api.contact.GroupMember;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.j0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39569j0 extends V2TIMFriendshipListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39531G0 f87875a;

    public C39569j0(C39531G0 c39531g0) {
        this.f87875a = c39531g0;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMFriendshipListener
    public final void onFriendInfoChanged(List list) {
        Object value;
        ArrayList arrayList;
        GroupMember groupMemberCopy$default;
        if (list == null) {
            return;
        }
        InterfaceC41669n interfaceC41669n = this.f87875a.f87769k;
        do {
            value = interfaceC41669n.getValue();
            List<GroupMember> list2 = (List) value;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (GroupMember groupMember : list2) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                for (Object obj : list) {
                    V2TIMFriendInfo v2TIMFriendInfo = (V2TIMFriendInfo) obj;
                    linkedHashMap.put(v2TIMFriendInfo != null ? v2TIMFriendInfo.getUserID() : null, obj);
                }
                V2TIMFriendInfo v2TIMFriendInfo2 = (V2TIMFriendInfo) linkedHashMap.get(groupMember.getUserID());
                if (v2TIMFriendInfo2 != null && (groupMemberCopy$default = GroupMember.copy$default(groupMember, null, v2TIMFriendInfo2.getUserProfile().getNickName(), v2TIMFriendInfo2.getUserProfile().getFaceUrl(), null, null, 0L, 57, null)) != null) {
                    groupMember = groupMemberCopy$default;
                }
                arrayList.add(groupMember);
            }
        } while (!interfaceC41669n.compareAndSet(value, arrayList));
    }
}
