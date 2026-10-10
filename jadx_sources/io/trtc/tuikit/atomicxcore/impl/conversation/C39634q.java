package io.trtc.tuikit.atomicxcore.impl.conversation;

import com.tencent.imsdk.p128v2.V2TIMConversation;
import com.tencent.imsdk.p128v2.V2TIMConversationListFilter;
import com.tencent.imsdk.p128v2.V2TIMConversationListener;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationInfo;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationListFilter;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationMarkType;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.q */
/* JADX INFO: loaded from: classes61.dex */
public final class C39634q extends V2TIMConversationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39606E f88044a;

    public C39634q(C39606E c39606e) {
        this.f88044a = c39606e;
    }

    /* JADX INFO: renamed from: a */
    public final void m88292a(List list) {
        C39606E c39606e = this.f88044a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ConversationInfo conversationInfo = (ConversationInfo) it.next();
            Iterator it2 = ((List) c39606e.f87977e.getValue()).iterator();
            int i11 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i11 = -1;
                    break;
                } else if (Intrinsics.areEqual(((ConversationInfo) it2.next()).getConversationID(), conversationInfo.getConversationID())) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 != -1) {
                List mutableList = CollectionsKt.toMutableList((Collection) c39606e.f87977e.getValue());
                mutableList.set(i11, conversationInfo);
                c39606e.f87977e.setValue(mutableList);
            } else {
                InterfaceC41669n interfaceC41669n = c39606e.f87977e;
                interfaceC41669n.setValue(CollectionsKt.plus((Collection<? extends ConversationInfo>) interfaceC41669n.getValue(), conversationInfo));
            }
        }
        InterfaceC41669n interfaceC41669n2 = this.f88044a.f87977e;
        interfaceC41669n2.setValue(CollectionsKt.sortedWith((Iterable) interfaceC41669n2.getValue(), new C39633p()));
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationListener
    public final void onConversationChanged(List v2List) {
        Intrinsics.checkNotNullParameter(v2List, "conversationList");
        Intrinsics.checkNotNullParameter(v2List, "v2List");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(v2List, 10));
        Iterator it = v2List.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC39619b.m88290a((V2TIMConversation) it.next()));
        }
        m88292a(CollectionsKt.sortedWith(arrayList, new C39618a()));
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationListener
    public final void onConversationDeleted(List conversationIDList) {
        Intrinsics.checkNotNullParameter(conversationIDList, "conversationIDList");
        InterfaceC41669n interfaceC41669n = this.f88044a.f87977e;
        Iterable iterable = (Iterable) interfaceC41669n.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!conversationIDList.contains(((ConversationInfo) obj).getConversationID())) {
                arrayList.add(obj);
            }
        }
        interfaceC41669n.setValue(arrayList);
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationListener
    public final void onNewConversation(List v2List) {
        Intrinsics.checkNotNullParameter(v2List, "conversationList");
        Intrinsics.checkNotNullParameter(v2List, "v2List");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(v2List, 10));
        Iterator it = v2List.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC39619b.m88290a((V2TIMConversation) it.next()));
        }
        m88292a(CollectionsKt.sortedWith(arrayList, new C39618a()));
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationListener
    public final void onTotalUnreadMessageCountChanged(long j11) {
        C39606E c39606e = this.f88044a;
        if (c39606e.f87983k != null) {
            return;
        }
        c39606e.f87982j = j11;
        if (c39606e.f87975c) {
            return;
        }
        c39606e.f87975c = true;
        c39606e.f87974b.postDelayed(c39606e.f87976d, 100L);
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMConversationListener
    public final void onUnreadMessageCountChangedByFilter(V2TIMConversationListFilter filter, long j11) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        ConversationListFilter conversationListFilter = this.f88044a.f87983k;
        if (conversationListFilter != null && ConversationType.INSTANCE.parse(filter.getConversationType()) == conversationListFilter.getType() && Intrinsics.areEqual(filter.getConversationGroup(), conversationListFilter.getConversationGroup())) {
            long markType = filter.getMarkType();
            ConversationMarkType markType2 = conversationListFilter.getMarkType();
            if (markType == (markType2 != null ? markType2.getValue() : 0L)) {
                boolean hasUnreadCount = filter.getHasUnreadCount();
                Boolean hasUnreadCount2 = conversationListFilter.getHasUnreadCount();
                if (hasUnreadCount == (hasUnreadCount2 != null ? hasUnreadCount2.booleanValue() : false)) {
                    boolean hasGroupAtInfo = filter.getHasGroupAtInfo();
                    Boolean hasGroupAtInfo2 = conversationListFilter.getHasGroupAtInfo();
                    if (hasGroupAtInfo != (hasGroupAtInfo2 != null ? hasGroupAtInfo2.booleanValue() : false)) {
                        return;
                    }
                    C39606E c39606e = this.f88044a;
                    c39606e.f87982j = j11;
                    if (c39606e.f87975c) {
                        return;
                    }
                    c39606e.f87975c = true;
                    c39606e.f87974b.postDelayed(c39606e.f87976d, 100L);
                }
            }
        }
    }
}
