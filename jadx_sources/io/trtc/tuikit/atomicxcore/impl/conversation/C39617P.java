package io.trtc.tuikit.atomicxcore.impl.conversation;

import com.tencent.imsdk.p128v2.V2TIMConversation;
import com.tencent.imsdk.p128v2.V2TIMManager;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationInfo;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationListFilter;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationMarkType;
import io.trtc.tuikit.atomicxcore.api.conversation.ConversationType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41674s;
import kotlinx.coroutines.flow.InterfaceC41668m;
import kotlinx.coroutines.flow.InterfaceC41673r;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.P */
/* JADX INFO: loaded from: classes61.dex */
public final class C39617P {

    /* JADX INFO: renamed from: a */
    public static final C39617P f88005a = new C39617P();

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap f88006b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f88007c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f88008d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public static final ConcurrentSkipListSet f88009e = new ConcurrentSkipListSet();

    /* JADX INFO: renamed from: f */
    public static final ConcurrentSkipListSet f88010f = new ConcurrentSkipListSet();

    /* JADX INFO: renamed from: g */
    public static final ConcurrentHashMap f88011g = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h */
    public static volatile boolean f88012h;

    /* JADX INFO: renamed from: i */
    public static final InterfaceC41668m f88013i;

    /* JADX INFO: renamed from: j */
    public static final InterfaceC41673r f88014j;

    /* JADX INFO: renamed from: k */
    public static final C39607F f88015k;

    /* JADX WARN: Code duplicated, block: B:16:0x0058  */
    /* JADX WARN: Code duplicated, block: B:18:0x0086  */
    /* JADX WARN: Code duplicated, block: B:19:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ae A[LOOP:0: B:24:0x00a8->B:26:0x00ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0090
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m88285a(io.trtc.tuikit.atomicxcore.api.conversation.ConversationMarkType r10, p852kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.m88285a(io.trtc.tuikit.atomicxcore.api.conversation.ConversationMarkType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    static {
        InterfaceC41668m interfaceC41668mM91001b = C41674s.m91001b(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        f88013i = interfaceC41668mM91001b;
        f88014j = C41636g.m90905b(interfaceC41668mM91001b);
        f88015k = new C39607F();
    }

    /* JADX INFO: renamed from: b */
    public static void m88288b(List list) {
        V2TIMConversation rawConversation$atomicxcore_release;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            ConversationInfo conversationInfo = (ConversationInfo) it.next();
            String conversationID = conversationInfo.getConversationID();
            if (conversationInfo.getMarkList().contains(ConversationMarkType.HIDE)) {
                ConcurrentHashMap concurrentHashMap = f88006b;
                ConversationInfo conversationInfo2 = (ConversationInfo) concurrentHashMap.get(conversationID);
                int unreadCount = (conversationInfo2 == null || (rawConversation$atomicxcore_release = conversationInfo2.getRawConversation$atomicxcore_release()) == null) ? 0 : rawConversation$atomicxcore_release.getUnreadCount();
                V2TIMConversation rawConversation$atomicxcore_release2 = conversationInfo.getRawConversation$atomicxcore_release();
                if ((rawConversation$atomicxcore_release2 != null ? rawConversation$atomicxcore_release2.getUnreadCount() : 0) > unreadCount && !f88009e.contains(conversationID)) {
                    arrayList.add(conversationID);
                }
                if (!Intrinsics.areEqual(concurrentHashMap.get(conversationID), conversationInfo)) {
                    concurrentHashMap.put(conversationID, conversationInfo);
                    z11 = true;
                }
            } else if (f88006b.remove(conversationID) != null) {
                f88009e.remove(conversationID);
                z11 = true;
            }
            if (conversationInfo.getMarkList().contains(ConversationMarkType.FOLD)) {
                ConcurrentHashMap concurrentHashMap2 = f88007c;
                if (!Intrinsics.areEqual(concurrentHashMap2.get(conversationID), conversationInfo)) {
                    concurrentHashMap2.put(conversationID, conversationInfo);
                    z11 = true;
                }
            } else if (f88007c.remove(conversationID) != null) {
                z11 = true;
            }
            V2TIMConversation rawConversation$atomicxcore_release3 = conversationInfo.getRawConversation$atomicxcore_release();
            int unreadCount2 = rawConversation$atomicxcore_release3 != null ? rawConversation$atomicxcore_release3.getUnreadCount() : 0;
            if (conversationInfo.getMarkList().contains(ConversationMarkType.UNREAD)) {
                if (unreadCount2 > 0 && !f88010f.contains(conversationID)) {
                    arrayList2.add(conversationID);
                }
                ConcurrentHashMap concurrentHashMap3 = f88008d;
                if (!Intrinsics.areEqual(concurrentHashMap3.get(conversationID), conversationInfo)) {
                    concurrentHashMap3.put(conversationID, conversationInfo);
                    z11 = true;
                }
            } else if (f88008d.remove(conversationID) != null) {
                f88010f.remove(conversationID);
                z11 = true;
            }
        }
        if (!arrayList.isEmpty()) {
            f88009e.addAll(arrayList);
            V2TIMManager.getConversationManager().markConversation(arrayList, ConversationMarkType.HIDE.getValue(), false, new C39609H(arrayList));
        }
        if (!arrayList2.isEmpty()) {
            f88010f.addAll(arrayList2);
            V2TIMManager.getConversationManager().markConversation(arrayList2, ConversationMarkType.UNREAD.getValue(), false, new C39610I(arrayList2));
        }
        if (z11) {
            f88013i.mo90855d(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m88289a(ContinuationImpl continuationImpl) {
        C39608G c39608g;
        C39617P c39617p;
        if (continuationImpl instanceof C39608G) {
            c39608g = (C39608G) continuationImpl;
            int i11 = c39608g.f87990d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c39608g.f87990d = i11 - Integer.MIN_VALUE;
            } else {
                c39608g = new C39608G(this, continuationImpl);
            }
        } else {
            c39608g = new C39608G(this, continuationImpl);
        }
        Object obj = c39608g.f87988b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c39608g.f87990d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            if (f88012h) {
                return Unit.INSTANCE;
            }
            V2TIMManager.getConversationManager().addConversationListener(f88015k);
            c39608g.f87987a = this;
            c39608g.f87990d = 1;
            if (C41713n0.m91130f(new C39616O(null), c39608g) == coroutine_suspended) {
                return coroutine_suspended;
            }
            c39617p = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c39617p = c39608g.f87987a;
            ResultKt.throwOnFailure(obj);
        }
        c39617p.getClass();
        ConcurrentHashMap concurrentHashMap = f88011g;
        if (!concurrentHashMap.isEmpty()) {
            Collection collectionValues = concurrentHashMap.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            m88288b(CollectionsKt.toList(collectionValues));
            concurrentHashMap.clear();
        }
        f88012h = true;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m88287a(ConversationInfo conversationInfo, ConversationListFilter conversationListFilter) {
        if (conversationListFilter == null) {
            return true;
        }
        if (conversationListFilter.getType() != ConversationType.UNKNOWN && conversationInfo.getType() != conversationListFilter.getType()) {
            return false;
        }
        String conversationGroup = conversationListFilter.getConversationGroup();
        return conversationGroup == null || conversationInfo.getConversationGroupList().contains(conversationGroup);
    }

    /* JADX INFO: renamed from: a */
    public static final void m88286a(List list) {
        if (!f88012h) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f88011g.remove((String) it.next());
            }
        }
        Iterator it2 = list.iterator();
        boolean z11 = false;
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (f88006b.remove(str) != null) {
                z11 = true;
            }
            if (f88007c.remove(str) != null) {
                z11 = true;
            }
            if (f88008d.remove(str) != null) {
                z11 = true;
            }
            f88009e.remove(str);
            f88010f.remove(str);
        }
        if (z11) {
            f88013i.mo90855d(Unit.INSTANCE);
        }
    }
}
