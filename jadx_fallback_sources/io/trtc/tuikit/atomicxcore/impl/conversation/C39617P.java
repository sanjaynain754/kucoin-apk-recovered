package io.trtc.tuikit.atomicxcore.impl.conversation;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.conversation.P */
/* JADX INFO: loaded from: classes61.dex */
public final class C39617P {

    /* JADX INFO: renamed from: a */
    public static final io.trtc.tuikit.atomicxcore.impl.conversation.C39617P f88005a = null;

    /* JADX INFO: renamed from: b */
    public static final java.util.concurrent.ConcurrentHashMap f88006b = null;

    /* JADX INFO: renamed from: c */
    public static final java.util.concurrent.ConcurrentHashMap f88007c = null;

    /* JADX INFO: renamed from: d */
    public static final java.util.concurrent.ConcurrentHashMap f88008d = null;

    /* JADX INFO: renamed from: e */
    public static final java.util.concurrent.ConcurrentSkipListSet f88009e = null;

    /* JADX INFO: renamed from: f */
    public static final java.util.concurrent.ConcurrentSkipListSet f88010f = null;

    /* JADX INFO: renamed from: g */
    public static final java.util.concurrent.ConcurrentHashMap f88011g = null;

    /* JADX INFO: renamed from: h */
    public static volatile boolean f88012h;

    /* JADX INFO: renamed from: i */
    public static final kotlinx.coroutines.flow.InterfaceC41668m f88013i = null;

    /* JADX INFO: renamed from: j */
    public static final kotlinx.coroutines.flow.InterfaceC41673r f88014j = null;

    /* JADX INFO: renamed from: k */
    public static final io.trtc.tuikit.atomicxcore.impl.conversation.C39607F f88015k = null;

    static {
            io.trtc.tuikit.atomicxcore.impl.conversation.P r0 = new io.trtc.tuikit.atomicxcore.impl.conversation.P
            r0.<init>()
            io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88005a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88006b = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88007c = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88008d = r0
            java.util.concurrent.ConcurrentSkipListSet r0 = new java.util.concurrent.ConcurrentSkipListSet
            r0.<init>()
            io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88009e = r0
            java.util.concurrent.ConcurrentSkipListSet r0 = new java.util.concurrent.ConcurrentSkipListSet
            r0.<init>()
            io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88010f = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88011g = r0
            kotlinx.coroutines.channels.BufferOverflow r0 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
            r1 = 2
            r2 = 0
            r3 = 1
            r4 = 0
            kotlinx.coroutines.flow.m r0 = kotlinx.coroutines.flow.C41674s.m91001b(r3, r4, r0, r1, r2)
            io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88013i = r0
            kotlinx.coroutines.flow.r r0 = kotlinx.coroutines.flow.C41636g.m90905b(r0)
            io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88014j = r0
            io.trtc.tuikit.atomicxcore.impl.conversation.F r0 = new io.trtc.tuikit.atomicxcore.impl.conversation.F
            r0.<init>()
            io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88015k = r0
            return
    }

    public C39617P() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m88285a(io.trtc.tuikit.atomicxcore.api.conversation.ConversationMarkType r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
            boolean r0 = r11 instanceof io.trtc.tuikit.atomicxcore.impl.conversation.C39611J
            if (r0 == 0) goto L13
            r0 = r11
            io.trtc.tuikit.atomicxcore.impl.conversation.J r0 = (io.trtc.tuikit.atomicxcore.impl.conversation.C39611J) r0
            int r1 = r0.f87997e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f87997e = r1
            goto L18
        L13:
            io.trtc.tuikit.atomicxcore.impl.conversation.J r0 = new io.trtc.tuikit.atomicxcore.impl.conversation.J
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f87996d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f87997e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            kotlin.jvm.internal.Ref$LongRef r10 = r0.f87995c
            java.util.List r2 = r0.f87994b
            com.tencent.imsdk.v2.V2TIMConversationListFilter r4 = r0.f87993a
            kotlin.ResultKt.throwOnFailure(r11)
            r5 = r4
            goto L8c
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            kotlin.ResultKt.throwOnFailure(r11)
            com.tencent.imsdk.v2.V2TIMConversationListFilter r11 = new com.tencent.imsdk.v2.V2TIMConversationListFilter
            r11.<init>()
            long r4 = r10.getValue()
            r11.setMarkType(r4)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            kotlin.jvm.internal.Ref$LongRef r2 = new kotlin.jvm.internal.Ref$LongRef
            r2.<init>()
            r4 = 0
            r5 = r2
            r2 = r10
            r10 = r5
            r5 = r11
        L56:
            if (r4 != 0) goto Lcf
            r0.f87993a = r5
            r0.f87994b = r2
            r0.f87995c = r10
            r0.f87997e = r3
            kotlinx.coroutines.o r11 = new kotlinx.coroutines.o
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r11.<init>(r4, r3)
            r11.m91142E()
            com.tencent.imsdk.v2.V2TIMConversationManager r4 = com.tencent.imsdk.p128v2.V2TIMManager.getConversationManager()
            long r6 = r10.element
            io.trtc.tuikit.atomicxcore.impl.conversation.K r9 = new io.trtc.tuikit.atomicxcore.impl.conversation.K
            r9.<init>(r11)
            r8 = 100
            r4.getConversationListByFilter(r5, r6, r8, r9)
            java.lang.Object r11 = r11.m91171w()
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r11 != r4) goto L89
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L89:
            if (r11 != r1) goto L8c
            return r1
        L8c:
            com.tencent.imsdk.v2.V2TIMConversationResult r11 = (com.tencent.imsdk.p128v2.V2TIMConversationResult) r11
            if (r11 == 0) goto Lcd
            java.util.List r4 = r11.getConversationList()
            java.lang.String r6 = "getConversationList(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r4, r7)
            r6.<init>(r7)
            java.util.Iterator r4 = r4.iterator()
        La8:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto Lbf
            java.lang.Object r7 = r4.next()
            com.tencent.imsdk.v2.V2TIMConversation r7 = (com.tencent.imsdk.p128v2.V2TIMConversation) r7
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            io.trtc.tuikit.atomicxcore.api.conversation.ConversationInfo r7 = io.trtc.tuikit.atomicxcore.impl.conversation.AbstractC39619b.m88290a(r7)
            r6.add(r7)
            goto La8
        Lbf:
            r2.addAll(r6)
            long r6 = r11.getNextSeq()
            r10.element = r6
            boolean r4 = r11.isFinished()
            goto L56
        Lcd:
            r4 = r3
            goto L56
        Lcf:
            return r2
    }

    /* JADX INFO: renamed from: a */
    public static final void m88286a(java.util.List r4) {
            boolean r0 = io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88012h
            if (r0 != 0) goto L1a
            java.util.Iterator r0 = r4.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.concurrent.ConcurrentHashMap r2 = io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88011g
            r2.remove(r1)
            goto L8
        L1a:
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L1f:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L52
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.concurrent.ConcurrentHashMap r2 = io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88006b
            java.lang.Object r2 = r2.remove(r1)
            r3 = 1
            if (r2 == 0) goto L35
            r0 = r3
        L35:
            java.util.concurrent.ConcurrentHashMap r2 = io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88007c
            java.lang.Object r2 = r2.remove(r1)
            if (r2 == 0) goto L3e
            r0 = r3
        L3e:
            java.util.concurrent.ConcurrentHashMap r2 = io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88008d
            java.lang.Object r2 = r2.remove(r1)
            if (r2 == 0) goto L47
            r0 = r3
        L47:
            java.util.concurrent.ConcurrentSkipListSet r2 = io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88009e
            r2.remove(r1)
            java.util.concurrent.ConcurrentSkipListSet r2 = io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88010f
            r2.remove(r1)
            goto L1f
        L52:
            if (r0 == 0) goto L5b
            kotlinx.coroutines.flow.m r4 = io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88013i
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r4.mo90855d(r0)
        L5b:
            return
    }

    /* JADX INFO: renamed from: a */
    public static boolean m88287a(io.trtc.tuikit.atomicxcore.api.conversation.ConversationInfo r4, io.trtc.tuikit.atomicxcore.api.conversation.ConversationListFilter r5) {
            r0 = 1
            if (r5 != 0) goto L4
            return r0
        L4:
            io.trtc.tuikit.atomicxcore.api.conversation.ConversationType r1 = r5.getType()
            io.trtc.tuikit.atomicxcore.api.conversation.ConversationType r2 = io.trtc.tuikit.atomicxcore.api.conversation.ConversationType.UNKNOWN
            r3 = 0
            if (r1 == r2) goto L18
            io.trtc.tuikit.atomicxcore.api.conversation.ConversationType r1 = r4.getType()
            io.trtc.tuikit.atomicxcore.api.conversation.ConversationType r2 = r5.getType()
            if (r1 == r2) goto L18
            return r3
        L18:
            java.lang.String r5 = r5.getConversationGroup()
            if (r5 == 0) goto L29
            java.util.List r4 = r4.getConversationGroupList()
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto L29
            return r3
        L29:
            return r0
    }

    /* JADX INFO: renamed from: b */
    public static void m88288b(java.util.List r10) {
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r10 = r10.iterator()
            r0 = 0
            r8 = r0
        L10:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto Le4
            java.lang.Object r2 = r10.next()
            io.trtc.tuikit.atomicxcore.api.conversation.ConversationInfo r2 = (io.trtc.tuikit.atomicxcore.api.conversation.ConversationInfo) r2
            java.lang.String r3 = r2.getConversationID()
            java.util.List r4 = r2.getMarkList()
            io.trtc.tuikit.atomicxcore.api.conversation.ConversationMarkType r5 = io.trtc.tuikit.atomicxcore.api.conversation.ConversationMarkType.HIDE
            boolean r4 = r4.contains(r5)
            r5 = 1
            if (r4 == 0) goto L6b
            java.util.concurrent.ConcurrentHashMap r4 = io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88006b
            java.lang.Object r7 = r4.get(r3)
            io.trtc.tuikit.atomicxcore.api.conversation.ConversationInfo r7 = (io.trtc.tuikit.atomicxcore.api.conversation.ConversationInfo) r7
            if (r7 == 0) goto L42
            com.tencent.imsdk.v2.V2TIMConversation r7 = r7.getRawConversation$atomicxcore_release()
            if (r7 == 0) goto L42
            int r7 = r7.getUnreadCount()
            goto L43
        L42:
            r7 = r0
        L43:
            com.tencent.imsdk.v2.V2TIMConversation r9 = r2.getRawConversation$atomicxcore_release()
            if (r9 == 0) goto L4e
            int r9 = r9.getUnreadCount()
            goto L4f
        L4e:
            r9 = r0
        L4f:
            if (r9 <= r7) goto L5c
            java.util.concurrent.ConcurrentSkipListSet r7 = io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88009e
            boolean r7 = r7.contains(r3)
            if (r7 != 0) goto L5c
            r1.add(r3)
        L5c:
            java.lang.Object r7 = r4.get(r3)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r2)
            if (r7 != 0) goto L79
            r4.put(r3, r2)
        L69:
            r8 = r5
            goto L79
        L6b:
            java.util.concurrent.ConcurrentHashMap r4 = io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88006b
            java.lang.Object r4 = r4.remove(r3)
            if (r4 == 0) goto L79
            java.util.concurrent.ConcurrentSkipListSet r4 = io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88009e
            r4.remove(r3)
            goto L69
        L79:
            java.util.List r4 = r2.getMarkList()
            io.trtc.tuikit.atomicxcore.api.conversation.ConversationMarkType r7 = io.trtc.tuikit.atomicxcore.api.conversation.ConversationMarkType.FOLD
            boolean r4 = r4.contains(r7)
            if (r4 == 0) goto L96
            java.util.concurrent.ConcurrentHashMap r4 = io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88007c
            java.lang.Object r7 = r4.get(r3)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r2)
            if (r7 != 0) goto L9f
            r4.put(r3, r2)
        L94:
            r8 = r5
            goto L9f
        L96:
            java.util.concurrent.ConcurrentHashMap r4 = io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88007c
            java.lang.Object r4 = r4.remove(r3)
            if (r4 == 0) goto L9f
            goto L94
        L9f:
            com.tencent.imsdk.v2.V2TIMConversation r4 = r2.getRawConversation$atomicxcore_release()
            if (r4 == 0) goto Laa
            int r4 = r4.getUnreadCount()
            goto Lab
        Laa:
            r4 = r0
        Lab:
            java.util.List r7 = r2.getMarkList()
            io.trtc.tuikit.atomicxcore.api.conversation.ConversationMarkType r9 = io.trtc.tuikit.atomicxcore.api.conversation.ConversationMarkType.UNREAD
            boolean r7 = r7.contains(r9)
            if (r7 == 0) goto Ld6
            if (r4 <= 0) goto Lc4
            java.util.concurrent.ConcurrentSkipListSet r4 = io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88010f
            boolean r4 = r4.contains(r3)
            if (r4 != 0) goto Lc4
            r6.add(r3)
        Lc4:
            java.util.concurrent.ConcurrentHashMap r4 = io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88008d
            java.lang.Object r7 = r4.get(r3)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r2)
            if (r7 != 0) goto L10
            r4.put(r3, r2)
        Ld3:
            r8 = r5
            goto L10
        Ld6:
            java.util.concurrent.ConcurrentHashMap r2 = io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88008d
            java.lang.Object r2 = r2.remove(r3)
            if (r2 == 0) goto L10
            java.util.concurrent.ConcurrentSkipListSet r2 = io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88010f
            r2.remove(r3)
            goto Ld3
        Le4:
            boolean r10 = r1.isEmpty()
            if (r10 != 0) goto L102
            java.util.concurrent.ConcurrentSkipListSet r10 = io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88009e
            r10.addAll(r1)
            com.tencent.imsdk.v2.V2TIMConversationManager r0 = com.tencent.imsdk.p128v2.V2TIMManager.getConversationManager()
            io.trtc.tuikit.atomicxcore.api.conversation.ConversationMarkType r10 = io.trtc.tuikit.atomicxcore.api.conversation.ConversationMarkType.HIDE
            long r2 = r10.getValue()
            io.trtc.tuikit.atomicxcore.impl.conversation.H r5 = new io.trtc.tuikit.atomicxcore.impl.conversation.H
            r5.<init>(r1)
            r4 = 0
            r0.markConversation(r1, r2, r4, r5)
        L102:
            boolean r10 = r6.isEmpty()
            if (r10 != 0) goto L121
            java.util.concurrent.ConcurrentSkipListSet r10 = io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88010f
            r10.addAll(r6)
            com.tencent.imsdk.v2.V2TIMConversationManager r2 = com.tencent.imsdk.p128v2.V2TIMManager.getConversationManager()
            io.trtc.tuikit.atomicxcore.api.conversation.ConversationMarkType r10 = io.trtc.tuikit.atomicxcore.api.conversation.ConversationMarkType.UNREAD
            long r4 = r10.getValue()
            io.trtc.tuikit.atomicxcore.impl.conversation.I r7 = new io.trtc.tuikit.atomicxcore.impl.conversation.I
            r7.<init>(r6)
            r3 = r6
            r6 = 0
            r2.markConversation(r3, r4, r6, r7)
        L121:
            if (r8 == 0) goto L12a
            kotlinx.coroutines.flow.m r10 = io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88013i
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r10.mo90855d(r0)
        L12a:
            return
    }

    /* JADX INFO: renamed from: a */
    public final java.lang.Object m88289a(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
            r4 = this;
            boolean r0 = r5 instanceof io.trtc.tuikit.atomicxcore.impl.conversation.C39608G
            if (r0 == 0) goto L13
            r0 = r5
            io.trtc.tuikit.atomicxcore.impl.conversation.G r0 = (io.trtc.tuikit.atomicxcore.impl.conversation.C39608G) r0
            int r1 = r0.f87990d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f87990d = r1
            goto L18
        L13:
            io.trtc.tuikit.atomicxcore.impl.conversation.G r0 = new io.trtc.tuikit.atomicxcore.impl.conversation.G
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f87988b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f87990d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            io.trtc.tuikit.atomicxcore.impl.conversation.P r0 = r0.f87987a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L58
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.ResultKt.throwOnFailure(r5)
            boolean r5 = io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88012h
            if (r5 == 0) goto L3d
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L3d:
            com.tencent.imsdk.v2.V2TIMConversationManager r5 = com.tencent.imsdk.p128v2.V2TIMManager.getConversationManager()
            io.trtc.tuikit.atomicxcore.impl.conversation.F r2 = io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88015k
            r5.addConversationListener(r2)
            r0.f87987a = r4
            r0.f87990d = r3
            io.trtc.tuikit.atomicxcore.impl.conversation.O r5 = new io.trtc.tuikit.atomicxcore.impl.conversation.O
            r2 = 0
            r5.<init>(r2)
            java.lang.Object r5 = kotlinx.coroutines.C41713n0.m91130f(r5, r0)
            if (r5 != r1) goto L57
            return r1
        L57:
            r0 = r4
        L58:
            r0.getClass()
            java.util.concurrent.ConcurrentHashMap r5 = io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88011g
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L64
            goto L77
        L64:
            java.util.Collection r0 = r5.values()
            java.lang.String r1 = "<get-values>(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.List r0 = kotlin.collections.CollectionsKt.toList(r0)
            m88288b(r0)
            r5.clear()
        L77:
            io.trtc.tuikit.atomicxcore.impl.conversation.C39617P.f88012h = r3
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
    }
}
