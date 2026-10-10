package io.trtc.tuikit.atomicxcore.impl.contact;

import com.tencent.imsdk.p128v2.V2TIMGroupListener;
import com.tencent.imsdk.p128v2.V2TIMGroupMemberChangeInfo;
import com.tencent.imsdk.p128v2.V2TIMGroupMemberInfo;
import com.tencent.imsdk.p128v2.V2TIMManager;
import io.trtc.tuikit.atomicxcore.api.contact.GroupMember;
import io.trtc.tuikit.atomicxcore.api.contact.GroupMemberRole;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.n0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39577n0 extends V2TIMGroupListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39531G0 f87885a;

    public C39577n0(C39531G0 c39531g0) {
        this.f87885a = c39531g0;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onGrantAdministrator(String groupID, V2TIMGroupMemberInfo opUser, List memberList) {
        Object value;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(groupID, "groupID");
        Intrinsics.checkNotNullParameter(opUser, "opUser");
        Intrinsics.checkNotNullParameter(memberList, "memberList");
        if (Intrinsics.areEqual(groupID, this.f87885a.f87759a)) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(memberList, 10));
            Iterator it = memberList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((V2TIMGroupMemberInfo) it.next()).getUserID());
            }
            Set set = CollectionsKt.toSet(arrayList2);
            InterfaceC41669n interfaceC41669n = this.f87885a.f87769k;
            do {
                value = interfaceC41669n.getValue();
                List<GroupMember> list = (List) value;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (GroupMember groupMemberCopy$default : list) {
                    if (set.contains(groupMemberCopy$default.getUserID())) {
                        groupMemberCopy$default = GroupMember.copy$default(groupMemberCopy$default, null, null, null, null, GroupMemberRole.ADMIN, 0L, 47, null);
                    }
                    arrayList.add(groupMemberCopy$default);
                }
            } while (!interfaceC41669n.compareAndSet(value, arrayList));
            if (set.contains(C39531G0.m88272a(this.f87885a))) {
                this.f87885a.f87770l.setValue(GroupMemberRole.ADMIN);
            }
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onGroupInfoChanged(String groupID, List changeInfoList) {
        Intrinsics.checkNotNullParameter(groupID, "groupID");
        Intrinsics.checkNotNullParameter(changeInfoList, "changeInfoList");
        if (Intrinsics.areEqual(groupID, this.f87885a.f87759a)) {
            C39531G0.m88274b(this.f87885a);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onMemberEnter(String groupID, List memberList) {
        Object value;
        List listPlus;
        Intrinsics.checkNotNullParameter(groupID, "groupID");
        Intrinsics.checkNotNullParameter(memberList, "memberList");
        if (Intrinsics.areEqual(groupID, this.f87885a.f87759a)) {
            C39531G0 c39531g0 = this.f87885a;
            InterfaceC41669n interfaceC41669n = c39531g0.f87769k;
            do {
                value = interfaceC41669n.getValue();
                listPlus = (List) value;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPlus, 10));
                Iterator it = listPlus.iterator();
                while (it.hasNext()) {
                    arrayList.add(((GroupMember) it.next()).getUserID());
                }
                Set set = CollectionsKt.toSet(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : memberList) {
                    if (!set.contains(((V2TIMGroupMemberInfo) obj).getUserID())) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(C39531G0.m88255a(c39531g0, (V2TIMGroupMemberInfo) it2.next()));
                }
                if (!arrayList3.isEmpty()) {
                    listPlus = CollectionsKt.plus((Collection) listPlus, (Iterable) arrayList3);
                }
            } while (!interfaceC41669n.compareAndSet(value, listPlus));
            C39531G0.m88274b(this.f87885a);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onMemberInfoChanged(String groupID, List changeInfoList) {
        Object value;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(groupID, "groupID");
        Intrinsics.checkNotNullParameter(changeInfoList, "changeInfoList");
        if (Intrinsics.areEqual(groupID, this.f87885a.f87759a) && !changeInfoList.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(changeInfoList, 10)), 16));
            for (Object obj : changeInfoList) {
                linkedHashMap.put(((V2TIMGroupMemberChangeInfo) obj).getUserID(), obj);
            }
            long serverTime = V2TIMManager.getInstance().getServerTime();
            InterfaceC41669n interfaceC41669n = this.f87885a.f87769k;
            do {
                value = interfaceC41669n.getValue();
                List<GroupMember> list = (List) value;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (GroupMember groupMemberCopy$default : list) {
                    V2TIMGroupMemberChangeInfo v2TIMGroupMemberChangeInfo = (V2TIMGroupMemberChangeInfo) linkedHashMap.get(groupMemberCopy$default.getUserID());
                    if (v2TIMGroupMemberChangeInfo != null) {
                        groupMemberCopy$default = GroupMember.copy$default(groupMemberCopy$default, null, null, null, null, null, v2TIMGroupMemberChangeInfo.getMuteTime() > 0 ? v2TIMGroupMemberChangeInfo.getMuteTime() + serverTime : 0L, 31, null);
                    }
                    arrayList.add(groupMemberCopy$default);
                }
            } while (!interfaceC41669n.compareAndSet(value, arrayList));
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onMemberInvited(String groupID, V2TIMGroupMemberInfo opUser, List memberList) {
        Object value;
        List listPlus;
        Intrinsics.checkNotNullParameter(groupID, "groupID");
        Intrinsics.checkNotNullParameter(opUser, "opUser");
        Intrinsics.checkNotNullParameter(memberList, "memberList");
        if (Intrinsics.areEqual(groupID, this.f87885a.f87759a)) {
            C39531G0 c39531g0 = this.f87885a;
            InterfaceC41669n interfaceC41669n = c39531g0.f87769k;
            do {
                value = interfaceC41669n.getValue();
                listPlus = (List) value;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPlus, 10));
                Iterator it = listPlus.iterator();
                while (it.hasNext()) {
                    arrayList.add(((GroupMember) it.next()).getUserID());
                }
                Set set = CollectionsKt.toSet(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : memberList) {
                    if (!set.contains(((V2TIMGroupMemberInfo) obj).getUserID())) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(C39531G0.m88255a(c39531g0, (V2TIMGroupMemberInfo) it2.next()));
                }
                if (!arrayList3.isEmpty()) {
                    listPlus = CollectionsKt.plus((Collection) listPlus, (Iterable) arrayList3);
                }
            } while (!interfaceC41669n.compareAndSet(value, listPlus));
            C39531G0.m88274b(this.f87885a);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onMemberKicked(String groupID, V2TIMGroupMemberInfo opUser, List memberList) {
        Object value;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(groupID, "groupID");
        Intrinsics.checkNotNullParameter(opUser, "opUser");
        Intrinsics.checkNotNullParameter(memberList, "memberList");
        if (Intrinsics.areEqual(groupID, this.f87885a.f87759a)) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(memberList, 10));
            Iterator it = memberList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((V2TIMGroupMemberInfo) it.next()).getUserID());
            }
            Set set = CollectionsKt.toSet(arrayList2);
            InterfaceC41669n interfaceC41669n = this.f87885a.f87769k;
            do {
                value = interfaceC41669n.getValue();
                arrayList = new ArrayList();
                for (Object obj : (List) value) {
                    if (!set.contains(((GroupMember) obj).getUserID())) {
                        arrayList.add(obj);
                    }
                }
            } while (!interfaceC41669n.compareAndSet(value, arrayList));
            C39531G0.m88274b(this.f87885a);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onMemberLeave(String groupID, V2TIMGroupMemberInfo member) {
        Object value;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(groupID, "groupID");
        Intrinsics.checkNotNullParameter(member, "member");
        if (Intrinsics.areEqual(groupID, this.f87885a.f87759a)) {
            InterfaceC41669n interfaceC41669n = this.f87885a.f87769k;
            do {
                value = interfaceC41669n.getValue();
                arrayList = new ArrayList();
                for (Object obj : (List) value) {
                    if (!Intrinsics.areEqual(((GroupMember) obj).getUserID(), member.getUserID())) {
                        arrayList.add(obj);
                    }
                }
            } while (!interfaceC41669n.compareAndSet(value, arrayList));
            C39531G0.m88274b(this.f87885a);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMGroupListener
    public final void onRevokeAdministrator(String groupID, V2TIMGroupMemberInfo opUser, List memberList) {
        Object value;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(groupID, "groupID");
        Intrinsics.checkNotNullParameter(opUser, "opUser");
        Intrinsics.checkNotNullParameter(memberList, "memberList");
        if (Intrinsics.areEqual(groupID, this.f87885a.f87759a)) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(memberList, 10));
            Iterator it = memberList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((V2TIMGroupMemberInfo) it.next()).getUserID());
            }
            Set set = CollectionsKt.toSet(arrayList2);
            InterfaceC41669n interfaceC41669n = this.f87885a.f87769k;
            do {
                value = interfaceC41669n.getValue();
                List<GroupMember> list = (List) value;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (GroupMember groupMemberCopy$default : list) {
                    if (set.contains(groupMemberCopy$default.getUserID())) {
                        groupMemberCopy$default = GroupMember.copy$default(groupMemberCopy$default, null, null, null, null, GroupMemberRole.MEMBER, 0L, 47, null);
                    }
                    arrayList.add(groupMemberCopy$default);
                }
            } while (!interfaceC41669n.compareAndSet(value, arrayList));
            if (set.contains(C39531G0.m88272a(this.f87885a))) {
                this.f87885a.f87770l.setValue(GroupMemberRole.MEMBER);
            }
        }
    }
}
