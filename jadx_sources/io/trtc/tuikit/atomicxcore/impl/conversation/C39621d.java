package io.trtc.tuikit.atomicxcore.impl.conversation;

import com.tencent.imsdk.p128v2.V2TIMConversationListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.d */
/* JADX INFO: loaded from: classes61.dex */
public final class C39621d extends V2TIMConversationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39627j f88018a;

    public C39621d(C39627j c39627j) {
        this.f88018a = c39627j;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationListener
    public final void onConversationGroupCreated(String groupName, List conversationList) {
        Object value;
        List listPlus;
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(conversationList, "conversationList");
        C39627j c39627j = this.f88018a;
        c39627j.getClass();
        if (groupName.length() == 0) {
            return;
        }
        InterfaceC41669n interfaceC41669n = c39627j.f88033a;
        do {
            value = interfaceC41669n.getValue();
            listPlus = (List) value;
            if (!listPlus.contains(groupName)) {
                listPlus = CollectionsKt.plus((Collection<? extends String>) listPlus, groupName);
            }
        } while (!interfaceC41669n.compareAndSet(value, listPlus));
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationListener
    public final void onConversationGroupDeleted(String groupName) {
        Object value;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        InterfaceC41669n interfaceC41669n = this.f88018a.f88033a;
        do {
            value = interfaceC41669n.getValue();
            arrayList = new ArrayList();
            for (Object obj : (List) value) {
                if (!Intrinsics.areEqual((String) obj, groupName)) {
                    arrayList.add(obj);
                }
            }
        } while (!interfaceC41669n.compareAndSet(value, arrayList));
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationListener
    public final void onConversationGroupNameChanged(String oldName, String newName) {
        Object value;
        List<String> list;
        Intrinsics.checkNotNullParameter(oldName, "oldName");
        Intrinsics.checkNotNullParameter(newName, "newName");
        InterfaceC41669n interfaceC41669n = this.f88018a.f88033a;
        do {
            value = interfaceC41669n.getValue();
            list = (List) value;
            if (list.contains(oldName)) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (String str : list) {
                    if (Intrinsics.areEqual(str, oldName)) {
                        str = newName;
                    }
                    arrayList.add(str);
                }
                list = arrayList;
            }
        } while (!interfaceC41669n.compareAndSet(value, list));
    }
}
