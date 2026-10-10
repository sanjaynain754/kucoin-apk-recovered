package io.trtc.tuikit.atomicxcore.impl.room;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.k0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39934k0 extends io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore implements io.trtc.tuikit.atomicxcore.impl.room.InterfaceC39917c {

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ int f88764C = 0;

    /* JADX INFO: renamed from: A */
    public final com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager f88765A;

    /* JADX INFO: renamed from: B */
    public final io.trtc.tuikit.atomicxcore.api.room.RoomParticipantState f88766B;

    /* JADX INFO: renamed from: a */
    public final com.tencent.cloud.tuikit.engine.room.TUIRoomEngine f88767a;

    /* JADX INFO: renamed from: b */
    public final kotlinx.coroutines.flow.InterfaceC41669n f88768b;

    /* JADX INFO: renamed from: c */
    public final kotlinx.coroutines.flow.InterfaceC41669n f88769c;

    /* JADX INFO: renamed from: d */
    public final kotlinx.coroutines.flow.InterfaceC41669n f88770d;

    /* JADX INFO: renamed from: e */
    public final kotlinx.coroutines.flow.InterfaceC41669n f88771e;

    /* JADX INFO: renamed from: f */
    public final kotlinx.coroutines.flow.InterfaceC41669n f88772f;

    /* JADX INFO: renamed from: g */
    public final kotlinx.coroutines.flow.InterfaceC41669n f88773g;

    /* JADX INFO: renamed from: h */
    public final kotlinx.coroutines.flow.InterfaceC41669n f88774h;

    /* JADX INFO: renamed from: i */
    public final kotlinx.coroutines.flow.InterfaceC41669n f88775i;

    /* JADX INFO: renamed from: j */
    public final io.trtc.tuikit.atomicxcore.impl.room.log.C39937a f88776j;

    /* JADX INFO: renamed from: k */
    public final int f88777k;

    /* JADX INFO: renamed from: l */
    public final int f88778l;

    /* JADX INFO: renamed from: m */
    public boolean f88779m;

    /* JADX INFO: renamed from: n */
    public boolean f88780n;

    /* JADX INFO: renamed from: o */
    public final java.util.LinkedHashMap f88781o;

    /* JADX INFO: renamed from: p */
    public final java.util.LinkedHashMap f88782p;

    /* JADX INFO: renamed from: q */
    public final java.util.LinkedHashMap f88783q;

    /* JADX INFO: renamed from: r */
    public final kotlinx.coroutines.InterfaceC41709m0 f88784r;

    /* JADX INFO: renamed from: s */
    public io.trtc.tuikit.atomicxcore.api.room.RoomInfo f88785s;

    /* JADX INFO: renamed from: t */
    public final io.trtc.tuikit.atomicxcore.impl.room.C39921e f88786t;

    /* JADX INFO: renamed from: u */
    public final io.trtc.tuikit.atomicxcore.impl.common.C39509q f88787u;

    /* JADX INFO: renamed from: v */
    public final io.trtc.tuikit.atomicxcore.impl.room.C39874E f88788v;

    /* JADX INFO: renamed from: w */
    public final io.trtc.tuikit.atomicxcore.impl.room.C39927h f88789w;

    /* JADX INFO: renamed from: x */
    public final io.trtc.tuikit.atomicxcore.impl.room.C39923f f88790x;

    /* JADX INFO: renamed from: y */
    public final io.trtc.tuikit.atomicxcore.impl.room.C39915b f88791y;

    /* JADX INFO: renamed from: z */
    public final com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager f88792z;

    public C39934k0(java.lang.String r27) {
            r26 = this;
            r0 = r26
            r1 = r27
            com.tencent.cloud.tuikit.engine.room.TUIRoomEngine r2 = com.tencent.cloud.tuikit.engine.room.TUIRoomEngine.sharedInstance()
            java.lang.String r3 = "sharedInstance(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r3 = "roomID"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "roomEngine"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            r0.<init>()
            r0.f88767a = r2
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            kotlinx.coroutines.flow.n r3 = kotlinx.coroutines.flow.C41679x.m91009a(r3)
            r0.f88768b = r3
            java.lang.String r4 = ""
            kotlinx.coroutines.flow.n r4 = kotlinx.coroutines.flow.C41679x.m91009a(r4)
            r0.f88769c = r4
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            kotlinx.coroutines.flow.n r5 = kotlinx.coroutines.flow.C41679x.m91009a(r5)
            r0.f88770d = r5
            r6 = 0
            kotlinx.coroutines.flow.n r6 = kotlinx.coroutines.flow.C41679x.m91009a(r6)
            r0.f88771e = r6
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
            kotlinx.coroutines.flow.n r7 = kotlinx.coroutines.flow.C41679x.m91009a(r7)
            java.util.List r8 = kotlin.collections.CollectionsKt.emptyList()
            kotlinx.coroutines.flow.n r8 = kotlinx.coroutines.flow.C41679x.m91009a(r8)
            java.util.List r9 = kotlin.collections.CollectionsKt.emptyList()
            kotlinx.coroutines.flow.n r9 = kotlinx.coroutines.flow.C41679x.m91009a(r9)
            r0.f88772f = r9
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            kotlinx.coroutines.flow.n r10 = kotlinx.coroutines.flow.C41679x.m91009a(r10)
            r0.f88773g = r10
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            kotlinx.coroutines.flow.n r11 = kotlinx.coroutines.flow.C41679x.m91009a(r11)
            r0.f88774h = r11
            io.trtc.tuikit.atomicxcore.api.room.RoomParticipant r12 = new io.trtc.tuikit.atomicxcore.api.room.RoomParticipant
            r24 = 2047(0x7ff, float:2.868E-42)
            r25 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            kotlinx.coroutines.flow.n r12 = kotlinx.coroutines.flow.C41679x.m91009a(r12)
            r0.f88775i = r12
            java.lang.String r13 = "file"
            java.lang.String r14 = "RoomParticipantStoreImpl"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r13)
            io.trtc.tuikit.atomicxcore.impl.room.log.a r13 = new io.trtc.tuikit.atomicxcore.impl.room.log.a
            r13.<init>(r14)
            r0.f88776j = r13
            r13 = 300(0x12c, float:4.2E-43)
            r0.f88777k = r13
            r13 = 50
            r0.f88778l = r13
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            r0.f88781o = r13
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            r0.f88782p = r13
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            r0.f88783q = r13
            kotlinx.coroutines.e2 r13 = kotlinx.coroutines.C41782z0.m91393c()
            kotlinx.coroutines.m0 r13 = kotlinx.coroutines.C41713n0.m91125a(r13)
            r0.f88784r = r13
            io.trtc.tuikit.atomicxcore.impl.room.e r13 = new io.trtc.tuikit.atomicxcore.impl.room.e
            r13.<init>()
            r0.f88786t = r13
            io.trtc.tuikit.atomicxcore.impl.common.q r13 = new io.trtc.tuikit.atomicxcore.impl.common.q
            r13.<init>()
            r0.f88787u = r13
            io.trtc.tuikit.atomicxcore.impl.room.E r13 = new io.trtc.tuikit.atomicxcore.impl.room.E
            r13.<init>(r0)
            r0.f88788v = r13
            io.trtc.tuikit.atomicxcore.impl.room.h r13 = new io.trtc.tuikit.atomicxcore.impl.room.h
            r13.<init>(r0, r1)
            r0.f88789w = r13
            io.trtc.tuikit.atomicxcore.impl.room.f r13 = new io.trtc.tuikit.atomicxcore.impl.room.f
            r13.<init>(r0, r1)
            r0.f88790x = r13
            io.trtc.tuikit.atomicxcore.impl.room.b r1 = new io.trtc.tuikit.atomicxcore.impl.room.b
            r1.<init>(r7, r8)
            r0.f88791y = r1
            com.tencent.cloud.tuikit.engine.common.TUICommonDefine$ExtensionType r1 = com.tencent.cloud.tuikit.engine.common.TUICommonDefine.ExtensionType.CONFERENCE_LIST_MANAGER
            java.lang.Object r1 = r2.getExtension(r1)
            java.lang.String r13 = "null cannot be cast to non-null type com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r13)
            com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager r1 = (com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager) r1
            r0.f88792z = r1
            com.tencent.cloud.tuikit.engine.common.TUICommonDefine$ExtensionType r1 = com.tencent.cloud.tuikit.engine.common.TUICommonDefine.ExtensionType.CONFERENCE_INVITATION_MANAGER
            java.lang.Object r1 = r2.getExtension(r1)
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager r1 = (com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager) r1
            r0.f88765A = r1
            io.trtc.tuikit.atomicxcore.api.room.RoomParticipantState r13 = new io.trtc.tuikit.atomicxcore.api.room.RoomParticipantState
            kotlinx.coroutines.flow.w r14 = kotlinx.coroutines.flow.C41636g.m90907c(r3)
            kotlinx.coroutines.flow.w r15 = kotlinx.coroutines.flow.C41636g.m90907c(r4)
            kotlinx.coroutines.flow.w r16 = kotlinx.coroutines.flow.C41636g.m90907c(r5)
            kotlinx.coroutines.flow.w r17 = kotlinx.coroutines.flow.C41636g.m90907c(r6)
            kotlinx.coroutines.flow.w r18 = kotlinx.coroutines.flow.C41636g.m90907c(r7)
            kotlinx.coroutines.flow.w r19 = kotlinx.coroutines.flow.C41636g.m90907c(r8)
            kotlinx.coroutines.flow.w r20 = kotlinx.coroutines.flow.C41636g.m90907c(r10)
            kotlinx.coroutines.flow.w r21 = kotlinx.coroutines.flow.C41636g.m90907c(r11)
            kotlinx.coroutines.flow.w r22 = kotlinx.coroutines.flow.C41636g.m90907c(r9)
            kotlinx.coroutines.flow.w r23 = kotlinx.coroutines.flow.C41636g.m90907c(r12)
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0.f88766B = r13
            return
    }

    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m88348a(io.trtc.tuikit.atomicxcore.impl.room.C39934k0 r9, java.lang.String r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
            r9.getClass()
            boolean r0 = r11 instanceof io.trtc.tuikit.atomicxcore.impl.room.C39890M
            if (r0 == 0) goto L16
            r0 = r11
            io.trtc.tuikit.atomicxcore.impl.room.M r0 = (io.trtc.tuikit.atomicxcore.impl.room.C39890M) r0
            int r1 = r0.f88660f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f88660f = r1
            goto L1b
        L16:
            io.trtc.tuikit.atomicxcore.impl.room.M r0 = new io.trtc.tuikit.atomicxcore.impl.room.M
            r0.<init>(r9, r11)
        L1b:
            java.lang.Object r11 = r0.f88658d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f88660f
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            kotlin.jvm.internal.Ref$ObjectRef r9 = r0.f88657c
            java.lang.String r10 = r0.f88656b
            io.trtc.tuikit.atomicxcore.impl.room.k0 r2 = r0.f88655a
            kotlin.ResultKt.throwOnFailure(r11)
            r8 = r0
            r0 = r10
            r10 = r2
        L34:
            r2 = r8
            goto L88
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            java.lang.String r2 = ""
            r11.element = r2
            java.util.LinkedHashMap r2 = r9.f88783q
            r2.clear()
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
        L53:
            r0.f88655a = r10
            r0.f88656b = r11
            r0.f88657c = r9
            r0.f88660f = r3
            kotlin.coroutines.SafeContinuation r2 = new kotlin.coroutines.SafeContinuation
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r2.<init>(r4)
            com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager r4 = r10.f88792z
            T r5 = r9.element
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r10.f88778l
            io.trtc.tuikit.atomicxcore.impl.room.N r7 = new io.trtc.tuikit.atomicxcore.impl.room.N
            r7.<init>(r2, r10)
            r4.fetchAttendeeList(r11, r5, r6, r7)
            java.lang.Object r2 = r2.getOrThrow()
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r4) goto L81
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L81:
            if (r2 != r1) goto L84
            return r1
        L84:
            r8 = r0
            r0 = r11
            r11 = r2
            goto L34
        L88:
            com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager$ScheduledAttendeesResult r11 = (com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager.ScheduledAttendeesResult) r11
            java.util.List<com.tencent.cloud.tuikit.engine.room.TUIRoomDefine$UserInfo> r4 = r11.scheduleAttendees
            java.lang.String r5 = "scheduleAttendees"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.util.Iterator r4 = r4.iterator()
        L95:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lb4
            java.lang.Object r5 = r4.next()
            com.tencent.cloud.tuikit.engine.room.TUIRoomDefine$UserInfo r5 = (com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.UserInfo) r5
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStatus r6 = io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStatus.SCHEDULED
            io.trtc.tuikit.atomicxcore.api.room.RoomParticipant r5 = io.trtc.tuikit.atomicxcore.impl.room.AbstractC39939m0.m88367a(r5, r6)
            java.util.LinkedHashMap r6 = r10.f88783q
            java.lang.String r7 = r5.getUserID()
            r6.put(r7, r5)
            goto L95
        Lb4:
            java.lang.String r11 = r11.cursor
            java.lang.String r4 = "cursor"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r4)
            r9.element = r11
            io.trtc.tuikit.atomicxcore.impl.room.log.a r11 = r10.f88776j
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "fetchAttendeeList page, cursor: "
            r4.<init>(r5)
            T r5 = r9.element
            java.lang.String r5 = (java.lang.String) r5
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r11.getClass()
            java.lang.String r5 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            r5 = 0
            r11.m88357a(r5, r4)
            T r11 = r9.element
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            int r11 = r11.length()
            if (r11 <= 0) goto Leb
            r11 = r0
            r0 = r2
            goto L53
        Leb:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
    }

    /* JADX INFO: renamed from: a */
    public static final void m88349a(io.trtc.tuikit.atomicxcore.impl.room.C39934k0 r5) {
            kotlinx.coroutines.flow.n r0 = r5.f88768b
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.List r2 = kotlin.collections.CollectionsKt.createListBuilder()
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L29
            java.lang.Object r3 = r0.next()
            io.trtc.tuikit.atomicxcore.api.room.RoomParticipant r3 = (io.trtc.tuikit.atomicxcore.api.room.RoomParticipant) r3
            java.lang.String r3 = r3.getUserID()
            r1.add(r3)
            goto L15
        L29:
            java.util.LinkedHashMap r0 = r5.f88782p
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L33:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L51
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r1.add(r4)
            if (r4 == 0) goto L33
            java.lang.Object r3 = r3.getValue()
            r2.add(r3)
            goto L33
        L51:
            java.util.LinkedHashMap r0 = r5.f88783q
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L5b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L79
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r1.add(r4)
            if (r4 == 0) goto L5b
            java.lang.Object r3 = r3.getValue()
            r2.add(r3)
            goto L5b
        L79:
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r2)
            kotlinx.coroutines.flow.n r5 = r5.f88772f
            r5.setValue(r0)
            return
    }

    /* JADX INFO: renamed from: a */
    public static final void m88350a(io.trtc.tuikit.atomicxcore.impl.room.C39934k0 r16, java.lang.String r17, io.trtc.tuikit.atomicxcore.impl.room.EnumC39906U0 r18, boolean r19) {
            r0 = r16
            r2 = r17
            java.util.LinkedHashMap r1 = r0.f88781o
            java.lang.Object r1 = r1.get(r2)
            io.trtc.tuikit.atomicxcore.api.room.RoomParticipant r1 = (io.trtc.tuikit.atomicxcore.api.room.RoomParticipant) r1
            if (r1 != 0) goto L43
            if (r19 != 0) goto L2d
            io.trtc.tuikit.atomicxcore.impl.room.log.a r0 = r0.f88776j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Ignore participant without stream userID: "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.getClass()
            java.lang.String r2 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = 0
            r0.m88357a(r2, r1)
            return
        L2d:
            io.trtc.tuikit.atomicxcore.api.room.RoomParticipant r1 = new io.trtc.tuikit.atomicxcore.api.room.RoomParticipant
            r13 = 2046(0x7fe, float:2.867E-42)
            r14 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r2 = r1
            r1 = r17
            goto L58
        L43:
            r14 = 2047(0x7ff, float:2.868E-42)
            r15 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r2 = r1
            r1 = r17
            io.trtc.tuikit.atomicxcore.api.room.RoomParticipant r2 = io.trtc.tuikit.atomicxcore.api.room.RoomParticipant.copy$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L58:
            io.trtc.tuikit.atomicxcore.api.device.DeviceStatus r3 = io.trtc.tuikit.atomicxcore.impl.room.AbstractC39939m0.m88360a(r19)
            int r4 = r18.ordinal()
            if (r4 == 0) goto Ld5
            r5 = 1
            if (r4 == r5) goto L92
            r1 = 2
            if (r4 == r1) goto L6a
            goto Ld8
        L6a:
            r2.setScreenShareStatus(r3)
            io.trtc.tuikit.atomicxcore.api.device.DeviceStatus r1 = io.trtc.tuikit.atomicxcore.api.device.DeviceStatus.f87604ON
            if (r3 != r1) goto L81
            kotlinx.coroutines.flow.n r1 = r0.f88771e
        L73:
            java.lang.Object r3 = r1.getValue()
            r4 = r3
            io.trtc.tuikit.atomicxcore.api.room.RoomParticipant r4 = (io.trtc.tuikit.atomicxcore.api.room.RoomParticipant) r4
            boolean r3 = r1.compareAndSet(r3, r2)
            if (r3 == 0) goto L73
            goto Ld8
        L81:
            kotlinx.coroutines.flow.n r4 = r0.f88771e
        L83:
            java.lang.Object r1 = r4.getValue()
            r3 = r1
            io.trtc.tuikit.atomicxcore.api.room.RoomParticipant r3 = (io.trtc.tuikit.atomicxcore.api.room.RoomParticipant) r3
            r3 = 0
            boolean r1 = r4.compareAndSet(r1, r3)
            if (r1 == 0) goto L83
            goto Ld8
        L92:
            r2.setCameraStatus(r3)
            io.trtc.tuikit.atomicxcore.api.device.DeviceStatus r4 = io.trtc.tuikit.atomicxcore.api.device.DeviceStatus.f87604ON
            if (r3 != r4) goto La1
            kotlinx.coroutines.flow.n r1 = r0.f88770d
            io.trtc.tuikit.atomicxcore.impl.room.c0 r3 = io.trtc.tuikit.atomicxcore.impl.room.C39918c0.f88734a
            io.trtc.tuikit.atomicxcore.impl.room.AbstractC39913a.m88341a(r1, r2, r3)
            goto Ld8
        La1:
            kotlinx.coroutines.flow.n r4 = r0.f88770d
        La3:
            java.lang.Object r3 = r4.getValue()
            r5 = r3
            java.util.List r5 = (java.util.List) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        Lb3:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto Lce
            java.lang.Object r7 = r5.next()
            r8 = r7
            io.trtc.tuikit.atomicxcore.api.room.RoomParticipant r8 = (io.trtc.tuikit.atomicxcore.api.room.RoomParticipant) r8
            java.lang.String r8 = r8.getUserID()
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r1)
            if (r8 != 0) goto Lb3
            r6.add(r7)
            goto Lb3
        Lce:
            boolean r3 = r4.compareAndSet(r3, r6)
            if (r3 == 0) goto La3
            goto Ld8
        Ld5:
            r2.setMicrophoneStatus(r3)
        Ld8:
            r0.m88354a(r2)
            return
    }

    /* JADX INFO: renamed from: b */
    public static final java.lang.Object m88351b(io.trtc.tuikit.atomicxcore.impl.room.C39934k0 r9, java.lang.String r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
            boolean r0 = r11 instanceof io.trtc.tuikit.atomicxcore.impl.room.C39894O
            if (r0 == 0) goto L13
            r0 = r11
            io.trtc.tuikit.atomicxcore.impl.room.O r0 = (io.trtc.tuikit.atomicxcore.impl.room.C39894O) r0
            int r1 = r0.f88670f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f88670f = r1
            goto L18
        L13:
            io.trtc.tuikit.atomicxcore.impl.room.O r0 = new io.trtc.tuikit.atomicxcore.impl.room.O
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f88668d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f88670f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            kotlin.jvm.internal.Ref$ObjectRef r9 = r0.f88667c
            java.lang.String r10 = r0.f88666b
            io.trtc.tuikit.atomicxcore.impl.room.k0 r2 = r0.f88665a
            kotlin.ResultKt.throwOnFailure(r11)
            r8 = r0
            r0 = r10
            r10 = r2
        L31:
            r2 = r8
            goto L85
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            java.lang.String r2 = ""
            r11.element = r2
            java.util.LinkedHashMap r2 = r9.f88782p
            r2.clear()
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
        L50:
            r0.f88665a = r10
            r0.f88666b = r11
            r0.f88667c = r9
            r0.f88670f = r3
            kotlin.coroutines.SafeContinuation r2 = new kotlin.coroutines.SafeContinuation
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r2.<init>(r4)
            com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager r4 = r10.f88765A
            T r5 = r9.element
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r10.f88778l
            io.trtc.tuikit.atomicxcore.impl.room.P r7 = new io.trtc.tuikit.atomicxcore.impl.room.P
            r7.<init>(r2, r10)
            r4.getInvitationList(r11, r5, r6, r7)
            java.lang.Object r2 = r2.getOrThrow()
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r4) goto L7e
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L7e:
            if (r2 != r1) goto L81
            return r1
        L81:
            r8 = r0
            r0 = r11
            r11 = r2
            goto L31
        L85:
            com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager$InvitationListResult r11 = (com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager.InvitationListResult) r11
            java.util.List<com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager$Invitation> r4 = r11.invitationList
            java.lang.String r5 = "invitationList"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.util.Iterator r4 = r4.iterator()
        L92:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lbb
            java.lang.Object r5 = r4.next()
            com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager$Invitation r5 = (com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager.Invitation) r5
            com.tencent.cloud.tuikit.engine.room.TUIRoomDefine$UserInfo r6 = r5.invitee
            java.lang.String r7 = "invitee"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager$InvitationStatus r5 = r5.status
            java.lang.String r7 = "status"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r7)
            io.trtc.tuikit.atomicxcore.api.room.RoomParticipant r5 = io.trtc.tuikit.atomicxcore.impl.room.AbstractC39939m0.m88366a(r6, r5)
            java.util.LinkedHashMap r6 = r10.f88782p
            java.lang.String r7 = r5.getUserID()
            r6.put(r7, r5)
            goto L92
        Lbb:
            java.lang.String r11 = r11.cursor
            java.lang.String r4 = "cursor"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r4)
            r9.element = r11
            io.trtc.tuikit.atomicxcore.impl.room.log.a r11 = r10.f88776j
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "fetchInvitationList page, cursor: "
            r4.<init>(r5)
            T r5 = r9.element
            java.lang.String r5 = (java.lang.String) r5
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r11.getClass()
            java.lang.String r5 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            r5 = 0
            r11.m88357a(r5, r4)
            T r11 = r9.element
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            int r11 = r11.length()
            if (r11 <= 0) goto Lf2
            r11 = r0
            r0 = r2
            goto L50
        Lf2:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
    }

    /* JADX INFO: renamed from: c */
    public static final java.lang.Object m88352c(io.trtc.tuikit.atomicxcore.impl.room.C39934k0 r13, java.lang.String r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
            r13.getClass()
            boolean r0 = r15 instanceof io.trtc.tuikit.atomicxcore.impl.room.C39898Q
            if (r0 == 0) goto L16
            r0 = r15
            io.trtc.tuikit.atomicxcore.impl.room.Q r0 = (io.trtc.tuikit.atomicxcore.impl.room.C39898Q) r0
            int r1 = r0.f88684f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f88684f = r1
            goto L1b
        L16:
            io.trtc.tuikit.atomicxcore.impl.room.Q r0 = new io.trtc.tuikit.atomicxcore.impl.room.Q
            r0.<init>(r13, r15)
        L1b:
            java.lang.Object r15 = r0.f88682d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f88684f
            r3 = 0
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 != r5) goto L38
            kotlin.jvm.internal.Ref$LongRef r13 = r0.f88681c
            java.lang.String r14 = r0.f88680b
            io.trtc.tuikit.atomicxcore.impl.room.k0 r2 = r0.f88679a
            kotlin.ResultKt.throwOnFailure(r15)
            r12 = r0
            r0 = r14
            r14 = r2
        L36:
            r2 = r12
            goto L9a
        L38:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L40:
            kotlin.ResultKt.throwOnFailure(r15)
            kotlin.jvm.internal.Ref$LongRef r15 = new kotlin.jvm.internal.Ref$LongRef
            r15.<init>()
            if (r14 == 0) goto L55
            java.lang.Long r2 = kotlin.text.StringsKt.toLongOrNull(r14)
            if (r2 == 0) goto L55
            long r6 = r2.longValue()
            goto L56
        L55:
            r6 = r3
        L56:
            r15.element = r6
            if (r14 == 0) goto L60
            int r2 = r14.length()
            if (r2 != 0) goto L65
        L60:
            java.util.LinkedHashMap r2 = r13.f88781o
            r2.clear()
        L65:
            r12 = r14
            r14 = r13
            r13 = r15
            r15 = r12
        L69:
            r0.f88679a = r14
            r0.f88680b = r15
            r0.f88681c = r13
            r0.f88684f = r5
            kotlin.coroutines.SafeContinuation r2 = new kotlin.coroutines.SafeContinuation
            kotlin.coroutines.Continuation r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r2.<init>(r6)
            com.tencent.cloud.tuikit.engine.room.TUIRoomEngine r6 = r14.f88767a
            long r7 = r13.element
            io.trtc.tuikit.atomicxcore.impl.room.S r9 = new io.trtc.tuikit.atomicxcore.impl.room.S
            r9.<init>(r2, r14)
            r6.getUserList(r7, r9)
            java.lang.Object r2 = r2.getOrThrow()
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r6) goto L93
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L93:
            if (r2 != r1) goto L96
            return r1
        L96:
            r12 = r0
            r0 = r15
            r15 = r2
            goto L36
        L9a:
            com.tencent.cloud.tuikit.engine.room.TUIRoomDefine$UserListResult r15 = (com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.UserListResult) r15
            java.util.List<com.tencent.cloud.tuikit.engine.room.TUIRoomDefine$UserInfo> r6 = r15.userInfoList
            java.lang.String r7 = "userInfoList"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            java.util.Iterator r6 = r6.iterator()
        La8:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L113
            java.lang.Object r7 = r6.next()
            com.tencent.cloud.tuikit.engine.room.TUIRoomDefine$UserInfo r7 = (com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.UserInfo) r7
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStatus r8 = io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStatus.IN_ROOM
            io.trtc.tuikit.atomicxcore.api.room.RoomParticipant r7 = io.trtc.tuikit.atomicxcore.impl.room.AbstractC39939m0.m88367a(r7, r8)
            r14.m88356b(r7)
            java.lang.String r8 = r7.getUserID()
            int r8 = r8.length()
            if (r8 != 0) goto Lcb
            goto Lf4
        Lcb:
            kotlinx.coroutines.flow.n r8 = r14.f88771e
            java.lang.Object r8 = r8.getValue()
            io.trtc.tuikit.atomicxcore.api.room.RoomParticipant r8 = (io.trtc.tuikit.atomicxcore.api.room.RoomParticipant) r8
            if (r8 == 0) goto Lda
            java.lang.String r8 = r8.getUserID()
            goto Ldb
        Lda:
            r8 = 0
        Ldb:
            java.lang.String r9 = r7.getUserID()
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r9)
            if (r8 == 0) goto Lf4
            kotlinx.coroutines.flow.n r8 = r14.f88771e
        Le7:
            java.lang.Object r9 = r8.getValue()
            r10 = r9
            io.trtc.tuikit.atomicxcore.api.room.RoomParticipant r10 = (io.trtc.tuikit.atomicxcore.api.room.RoomParticipant) r10
            boolean r9 = r8.compareAndSet(r9, r7)
            if (r9 == 0) goto Le7
        Lf4:
            java.lang.String r8 = r7.getUserID()
            com.tencent.cloud.tuikit.engine.room.TUIRoomDefine$LoginUserInfo r9 = com.tencent.cloud.tuikit.engine.room.TUIRoomEngine.getSelfInfo()
            java.lang.String r9 = r9.userId
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r8)
            if (r8 == 0) goto L109
            kotlinx.coroutines.flow.n r8 = r14.f88775i
            r8.setValue(r7)
        L109:
            java.util.LinkedHashMap r8 = r14.f88781o
            java.lang.String r9 = r7.getUserID()
            r8.put(r9, r7)
            goto La8
        L113:
            long r6 = r15.nextSequence
            r13.element = r6
            io.trtc.tuikit.atomicxcore.impl.room.log.a r15 = r14.f88776j
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "getUserList, nextSequence: "
            r6.<init>(r7)
            long r7 = r13.element
            r6.append(r7)
            java.lang.String r7 = " userList size:"
            r6.append(r7)
            java.util.LinkedHashMap r8 = r14.f88781o
            int r8 = r8.size()
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            r15.getClass()
            java.lang.String r8 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r8)
            r9 = 0
            r15.m88357a(r9, r6)
            if (r0 == 0) goto L14c
            int r15 = r0.length()
            if (r15 <= 0) goto L14c
            goto L161
        L14c:
            long r10 = r13.element
            int r15 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r15 == 0) goto L161
            java.util.LinkedHashMap r15 = r14.f88781o
            int r15 = r15.size()
            int r6 = r14.f88777k
            if (r15 < r6) goto L15d
            goto L161
        L15d:
            r15 = r0
            r0 = r2
            goto L69
        L161:
            io.trtc.tuikit.atomicxcore.impl.room.log.a r15 = r14.f88776j
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getUserList, result: "
            r0.<init>(r1)
            long r1 = r13.element
            r0.append(r1)
            r0.append(r7)
            java.util.LinkedHashMap r1 = r14.f88781o
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r8)
            r15.m88357a(r9, r0)
            kotlinx.coroutines.flow.n r15 = r14.f88768b
            java.util.LinkedHashMap r0 = r14.f88781o
            java.util.Collection r0 = r0.values()
            java.lang.String r1 = "<get-values>(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.List r0 = kotlin.collections.CollectionsKt.toList(r0)
            r15.setValue(r0)
            kotlinx.coroutines.flow.n r14 = r14.f88769c
            long r0 = r13.element
            java.lang.String r13 = java.lang.String.valueOf(r0)
            r14.setValue(r13)
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
    }

    /* JADX INFO: renamed from: a */
    public final void m88353a(io.trtc.tuikit.atomicxcore.api.device.DeviceType r6, java.lang.String r7, boolean r8, io.trtc.tuikit.atomicxcore.api.CompletionHandler r9) {
            r5 = this;
            io.trtc.tuikit.atomicxcore.impl.room.b r0 = r5.f88791y
            r0.getClass()
            java.lang.String r1 = "userID"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            java.lang.String r1 = "device"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            java.util.LinkedHashMap r0 = r0.f88730d
            java.lang.Object r0 = r0.get(r7)
            io.trtc.tuikit.atomicxcore.impl.room.V0 r0 = (io.trtc.tuikit.atomicxcore.impl.room.C39908V0) r0
            r1 = 0
            if (r0 == 0) goto L29
            java.lang.String r2 = "deviceType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            java.util.Map r0 = r0.f88718b
            java.lang.Object r0 = r0.get(r6)
            com.tencent.cloud.tuikit.engine.room.TUIRoomDefine$Request r0 = (com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.Request) r0
            goto L2a
        L29:
            r0 = r1
        L2a:
            if (r0 != 0) goto L48
            io.trtc.tuikit.atomicxcore.impl.room.log.a r6 = r5.f88776j
            r6.getClass()
            java.lang.String r7 = "message"
            java.lang.String r8 = "Not receiving requests"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r7)
            r7 = 1
            r6.m88357a(r7, r8)
            if (r9 == 0) goto L47
            com.tencent.cloud.tuikit.engine.common.TUICommonDefine$Error r6 = com.tencent.cloud.tuikit.engine.common.TUICommonDefine.Error.FAILED
            int r6 = r6.getValue()
            r9.onFailure(r6, r8)
        L47:
            return
        L48:
            com.tencent.cloud.tuikit.engine.room.TUIRoomEngine r2 = r5.f88767a
            java.lang.String r0 = r0.requestId
            io.trtc.tuikit.atomicxcore.impl.common.c r3 = new io.trtc.tuikit.atomicxcore.impl.common.c
            io.trtc.tuikit.atomicxcore.impl.room.h0 r4 = new io.trtc.tuikit.atomicxcore.impl.room.h0
            r4.<init>(r5, r6, r7)
            r6 = 4
            r3.<init>(r9, r4, r1, r6)
            java.lang.String r6 = ""
            r2.responseRemoteRequest(r0, r8, r6, r3)
            return
    }

    /* JADX INFO: renamed from: a */
    public final void m88354a(io.trtc.tuikit.atomicxcore.api.room.RoomParticipant r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "participant"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.util.LinkedHashMap r2 = r0.f88781o
            java.lang.String r3 = r1.getUserID()
            r2.put(r3, r1)
            kotlinx.coroutines.flow.n r2 = r0.f88768b
            io.trtc.tuikit.atomicxcore.impl.room.I r3 = io.trtc.tuikit.atomicxcore.impl.room.C39882I.f88637a
            io.trtc.tuikit.atomicxcore.impl.room.AbstractC39913a.m88341a(r2, r1, r3)
            java.lang.String r2 = r1.getUserID()
            com.tencent.cloud.tuikit.engine.room.TUIRoomDefine$LoginUserInfo r3 = com.tencent.cloud.tuikit.engine.room.TUIRoomEngine.getSelfInfo()
            java.lang.String r3 = r3.userId
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r2)
            if (r2 == 0) goto L5c
            kotlinx.coroutines.flow.n r15 = r0.f88775i
        L2b:
            java.lang.Object r2 = r15.getValue()
            r3 = r2
            io.trtc.tuikit.atomicxcore.api.room.RoomParticipant r3 = (io.trtc.tuikit.atomicxcore.api.room.RoomParticipant) r3
            r13 = 2047(0x7ff, float:2.868E-42)
            r14 = 0
            r3 = r2
            r2 = 0
            r4 = r3
            r3 = 0
            r5 = r4
            r4 = 0
            r6 = r5
            r5 = 0
            r7 = r6
            r6 = 0
            r8 = r7
            r7 = 0
            r9 = r8
            r8 = 0
            r10 = r9
            r9 = 0
            r11 = r10
            r10 = 0
            r12 = r11
            r11 = 0
            r16 = r12
            r12 = 0
            r0 = r16
            io.trtc.tuikit.atomicxcore.api.room.RoomParticipant r2 = io.trtc.tuikit.atomicxcore.api.room.RoomParticipant.copy$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = r15.compareAndSet(r0, r2)
            if (r0 == 0) goto L59
            goto L5c
        L59:
            r0 = r17
            goto L2b
        L5c:
            r17.m88356b(r18)
            java.lang.String r0 = r1.getUserID()
            int r0 = r0.length()
            if (r0 != 0) goto L6c
            r0 = r17
            goto L97
        L6c:
            r0 = r17
            kotlinx.coroutines.flow.n r2 = r0.f88771e
            java.lang.Object r2 = r2.getValue()
            io.trtc.tuikit.atomicxcore.api.room.RoomParticipant r2 = (io.trtc.tuikit.atomicxcore.api.room.RoomParticipant) r2
            if (r2 == 0) goto L7d
            java.lang.String r2 = r2.getUserID()
            goto L7e
        L7d:
            r2 = 0
        L7e:
            java.lang.String r3 = r1.getUserID()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 == 0) goto L97
            kotlinx.coroutines.flow.n r2 = r0.f88771e
        L8a:
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            io.trtc.tuikit.atomicxcore.api.room.RoomParticipant r4 = (io.trtc.tuikit.atomicxcore.api.room.RoomParticipant) r4
            boolean r3 = r2.compareAndSet(r3, r1)
            if (r3 == 0) goto L8a
        L97:
            java.lang.String r2 = r1.getUserID()
            java.lang.String r3 = "userID"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.util.LinkedHashMap r4 = r0.f88782p
            r4.remove(r2)
            kotlinx.coroutines.flow.n r4 = r0.f88772f
        La8:
            java.lang.Object r5 = r4.getValue()
            r6 = r5
            java.util.List r6 = (java.util.List) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        Lb8:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Ld3
            java.lang.Object r8 = r6.next()
            r9 = r8
            io.trtc.tuikit.atomicxcore.api.room.RoomParticipant r9 = (io.trtc.tuikit.atomicxcore.api.room.RoomParticipant) r9
            java.lang.String r9 = r9.getUserID()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r2)
            if (r9 != 0) goto Lb8
            r7.add(r8)
            goto Lb8
        Ld3:
            boolean r5 = r4.compareAndSet(r5, r7)
            if (r5 == 0) goto La8
            java.lang.String r5 = r1.getUserID()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            java.util.LinkedHashMap r1 = r0.f88783q
            r1.remove(r5)
            kotlinx.coroutines.flow.n r6 = r0.f88772f
        Le7:
            java.lang.Object r1 = r6.getValue()
            r2 = r1
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        Lf7:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L112
            java.lang.Object r4 = r2.next()
            r7 = r4
            io.trtc.tuikit.atomicxcore.api.room.RoomParticipant r7 = (io.trtc.tuikit.atomicxcore.api.room.RoomParticipant) r7
            java.lang.String r7 = r7.getUserID()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r5)
            if (r7 != 0) goto Lf7
            r3.add(r4)
            goto Lf7
        L112:
            boolean r1 = r6.compareAndSet(r1, r3)
            if (r1 == 0) goto Le7
            return
    }

    /* JADX INFO: renamed from: a */
    public final void m88355a(java.lang.String r6, io.trtc.tuikit.atomicxcore.api.device.DeviceType r7, boolean r8, io.trtc.tuikit.atomicxcore.api.CompletionHandler r9) {
            r5 = this;
            io.trtc.tuikit.atomicxcore.impl.room.b r0 = r5.f88791y
            r0.getClass()
            java.lang.String r1 = "userID"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            java.lang.String r1 = "device"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            java.util.LinkedHashMap r0 = r0.f88732f
            java.lang.Object r0 = r0.get(r6)
            io.trtc.tuikit.atomicxcore.impl.room.V0 r0 = (io.trtc.tuikit.atomicxcore.impl.room.C39908V0) r0
            r1 = 0
            if (r0 == 0) goto L29
            java.lang.String r2 = "deviceType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            java.util.Map r0 = r0.f88718b
            java.lang.Object r0 = r0.get(r7)
            com.tencent.cloud.tuikit.engine.room.TUIRoomDefine$Request r0 = (com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.Request) r0
            goto L2a
        L29:
            r0 = r1
        L2a:
            if (r0 != 0) goto L48
            io.trtc.tuikit.atomicxcore.impl.room.log.a r6 = r5.f88776j
            r6.getClass()
            java.lang.String r7 = "message"
            java.lang.String r8 = "Not receiving invitations"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r7)
            r7 = 1
            r6.m88357a(r7, r8)
            if (r9 == 0) goto L47
            com.tencent.cloud.tuikit.engine.common.TUICommonDefine$Error r6 = com.tencent.cloud.tuikit.engine.common.TUICommonDefine.Error.FAILED
            int r6 = r6.getValue()
            r9.onFailure(r6, r8)
        L47:
            return
        L48:
            com.tencent.cloud.tuikit.engine.room.TUIRoomEngine r2 = r5.f88767a
            java.lang.String r0 = r0.requestId
            io.trtc.tuikit.atomicxcore.impl.common.c r3 = new io.trtc.tuikit.atomicxcore.impl.common.c
            io.trtc.tuikit.atomicxcore.impl.room.i0 r4 = new io.trtc.tuikit.atomicxcore.impl.room.i0
            r4.<init>(r5, r6, r7)
            r6 = 4
            r3.<init>(r9, r4, r1, r6)
            java.lang.String r6 = ""
            r2.responseRemoteRequest(r0, r8, r6, r3)
            return
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void acceptOpenDeviceInvitation(java.lang.String r2, io.trtc.tuikit.atomicxcore.api.device.DeviceType r3, io.trtc.tuikit.atomicxcore.api.CompletionHandler r4) {
            r1 = this;
            java.lang.String r0 = "userID"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "device"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 1
            r1.m88355a(r2, r3, r0, r4)
            return
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void addRoomParticipantListener(io.trtc.tuikit.atomicxcore.api.room.RoomParticipantListener r2) {
            r1 = this;
            io.trtc.tuikit.atomicxcore.impl.common.q r0 = r1.f88787u
            r0.m88248a(r2)
            return
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void approveOpenDeviceRequest(io.trtc.tuikit.atomicxcore.api.device.DeviceType r2, java.lang.String r3, io.trtc.tuikit.atomicxcore.api.CompletionHandler r4) {
            r1 = this;
            java.lang.String r0 = "device"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "userID"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 1
            r1.m88353a(r2, r3, r0, r4)
            return
    }

    /* JADX INFO: renamed from: b */
    public final void m88356b(io.trtc.tuikit.atomicxcore.api.room.RoomParticipant r6) {
            r5 = this;
            java.lang.String r0 = r6.getUserID()
            int r0 = r0.length()
            if (r0 != 0) goto Lb
            goto L4e
        Lb:
            kotlinx.coroutines.flow.n r0 = r5.f88770d
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            r3 = r1
            io.trtc.tuikit.atomicxcore.api.room.RoomParticipant r3 = (io.trtc.tuikit.atomicxcore.api.room.RoomParticipant) r3
            java.lang.String r3 = r3.getUserID()
            java.lang.String r4 = r6.getUserID()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 == 0) goto L17
            goto L35
        L34:
            r1 = r2
        L35:
            io.trtc.tuikit.atomicxcore.api.room.RoomParticipant r1 = (io.trtc.tuikit.atomicxcore.api.room.RoomParticipant) r1
            if (r1 == 0) goto L3d
            java.lang.String r2 = r1.getUserID()
        L3d:
            java.lang.String r0 = r6.getUserID()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L4e
            kotlinx.coroutines.flow.n r0 = r5.f88770d
            io.trtc.tuikit.atomicxcore.impl.room.j0 r1 = io.trtc.tuikit.atomicxcore.impl.room.C39932j0.f88761a
            io.trtc.tuikit.atomicxcore.impl.room.AbstractC39913a.m88342b(r0, r6, r1)
        L4e:
            return
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void cancelOpenDeviceInvitation(java.lang.String r5, io.trtc.tuikit.atomicxcore.api.device.DeviceType r6, io.trtc.tuikit.atomicxcore.api.CompletionHandler r7) {
            r4 = this;
            java.lang.String r0 = "userID"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "device"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            io.trtc.tuikit.atomicxcore.impl.room.b r0 = r4.f88791y
            com.tencent.cloud.tuikit.engine.room.TUIRoomDefine$Request r0 = r0.m88343a(r5, r6)
            if (r0 != 0) goto L2f
            io.trtc.tuikit.atomicxcore.impl.room.log.a r5 = r4.f88776j
            r5.getClass()
            java.lang.String r6 = "message"
            java.lang.String r0 = "No invitation is sent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r6)
            r6 = 1
            r5.m88357a(r6, r0)
            if (r7 == 0) goto L2e
            com.tencent.cloud.tuikit.engine.common.TUICommonDefine$Error r5 = com.tencent.cloud.tuikit.engine.common.TUICommonDefine.Error.FAILED
            int r5 = r5.getValue()
            r7.onFailure(r5, r0)
        L2e:
            return
        L2f:
            com.tencent.cloud.tuikit.engine.room.TUIRoomEngine r1 = r4.f88767a
            java.lang.String r0 = r0.requestId
            io.trtc.tuikit.atomicxcore.impl.common.c r2 = new io.trtc.tuikit.atomicxcore.impl.common.c
            io.trtc.tuikit.atomicxcore.impl.room.K r3 = new io.trtc.tuikit.atomicxcore.impl.room.K
            r3.<init>(r4, r5, r6)
            r5 = 0
            r6 = 4
            r2.<init>(r7, r3, r5, r6)
            r1.cancelRequest(r0, r2)
            return
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void cancelOpenDeviceRequest(io.trtc.tuikit.atomicxcore.api.device.DeviceType r6, io.trtc.tuikit.atomicxcore.api.CompletionHandler r7) {
            r5 = this;
            java.lang.String r0 = "device"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            io.trtc.tuikit.atomicxcore.impl.room.b r1 = r5.f88791y
            r1.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.LinkedHashMap r0 = r1.f88729c
            java.lang.Object r0 = r0.get(r6)
            com.tencent.cloud.tuikit.engine.room.TUIRoomDefine$Request r0 = (com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.Request) r0
            if (r0 != 0) goto L33
            io.trtc.tuikit.atomicxcore.impl.room.log.a r6 = r5.f88776j
            r6.getClass()
            java.lang.String r0 = "message"
            java.lang.String r1 = "No device application is requesting"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 1
            r6.m88357a(r0, r1)
            if (r7 == 0) goto L32
            com.tencent.cloud.tuikit.engine.common.TUICommonDefine$Error r6 = com.tencent.cloud.tuikit.engine.common.TUICommonDefine.Error.FAILED
            int r6 = r6.getValue()
            r7.onFailure(r6, r1)
        L32:
            return
        L33:
            com.tencent.cloud.tuikit.engine.room.TUIRoomEngine r1 = r5.f88767a
            java.lang.String r0 = r0.requestId
            io.trtc.tuikit.atomicxcore.impl.common.c r2 = new io.trtc.tuikit.atomicxcore.impl.common.c
            io.trtc.tuikit.atomicxcore.impl.room.L r3 = new io.trtc.tuikit.atomicxcore.impl.room.L
            r3.<init>(r5, r6)
            r6 = 0
            r4 = 4
            r2.<init>(r7, r3, r6, r4)
            r1.cancelRequest(r0, r2)
            return
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void closeParticipantDevice(java.lang.String r5, io.trtc.tuikit.atomicxcore.api.device.DeviceType r6, io.trtc.tuikit.atomicxcore.api.CompletionHandler r7) {
            r4 = this;
            java.lang.String r0 = "userID"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "device"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            com.tencent.cloud.tuikit.engine.room.TUIRoomEngine r0 = r4.f88767a
            com.tencent.cloud.tuikit.engine.room.TUIRoomDefine$MediaDevice r6 = io.trtc.tuikit.atomicxcore.impl.room.AbstractC39939m0.m88359a(r6)
            io.trtc.tuikit.atomicxcore.impl.common.c r1 = new io.trtc.tuikit.atomicxcore.impl.common.c
            r2 = 0
            r3 = 6
            r1.<init>(r7, r2, r2, r3)
            r0.closeRemoteDeviceByAdmin(r5, r6, r1)
            return
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void declineOpenDeviceInvitation(java.lang.String r2, io.trtc.tuikit.atomicxcore.api.device.DeviceType r3, io.trtc.tuikit.atomicxcore.api.CompletionHandler r4) {
            r1 = this;
            java.lang.String r0 = "userID"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "device"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r1.m88355a(r2, r3, r0, r4)
            return
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void disableAllDevices(io.trtc.tuikit.atomicxcore.api.device.DeviceType r5, boolean r6, io.trtc.tuikit.atomicxcore.api.CompletionHandler r7) {
            r4 = this;
            java.lang.String r0 = "device"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.tencent.cloud.tuikit.engine.room.TUIRoomEngine r0 = r4.f88767a
            com.tencent.cloud.tuikit.engine.room.TUIRoomDefine$MediaDevice r5 = io.trtc.tuikit.atomicxcore.impl.room.AbstractC39939m0.m88359a(r5)
            io.trtc.tuikit.atomicxcore.impl.common.c r1 = new io.trtc.tuikit.atomicxcore.impl.common.c
            r2 = 0
            r3 = 6
            r1.<init>(r7, r2, r2, r3)
            r0.disableDeviceForAllUserByAdmin(r5, r6, r1)
            return
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void disableAllMessages(boolean r5, io.trtc.tuikit.atomicxcore.api.CompletionHandler r6) {
            r4 = this;
            com.tencent.cloud.tuikit.engine.room.TUIRoomEngine r0 = r4.f88767a
            io.trtc.tuikit.atomicxcore.impl.common.c r1 = new io.trtc.tuikit.atomicxcore.impl.common.c
            r2 = 0
            r3 = 6
            r1.<init>(r6, r2, r2, r3)
            r0.disableSendingMessageForAllUser(r5, r1)
            return
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void disableUserMessage(java.lang.String r5, boolean r6, io.trtc.tuikit.atomicxcore.api.CompletionHandler r7) {
            r4 = this;
            java.lang.String r0 = "userID"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.tencent.cloud.tuikit.engine.room.TUIRoomEngine r0 = r4.f88767a
            io.trtc.tuikit.atomicxcore.impl.common.c r1 = new io.trtc.tuikit.atomicxcore.impl.common.c
            r2 = 0
            r3 = 6
            r1.<init>(r7, r2, r2, r3)
            r0.disableSendingMessageByAdmin(r5, r6, r1)
            return
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void getParticipantList(java.lang.String r8, io.trtc.tuikit.atomicxcore.api.ListResultCompletionHandler r9) {
            r7 = this;
            io.trtc.tuikit.atomicxcore.api.room.RoomInfo r0 = r7.f88785s
            if (r0 == 0) goto La
            java.lang.String r0 = r0.getRoomID()
        L8:
            r4 = r0
            goto Lc
        La:
            r0 = 0
            goto L8
        Lc:
            r0 = 2
            java.lang.String r1 = "message"
            if (r4 == 0) goto L17
            int r2 = r4.length()
            if (r2 != 0) goto L1a
        L17:
            r8 = r7
            r5 = r9
            goto L50
        L1a:
            boolean r2 = r7.f88779m
            if (r2 == 0) goto L3b
            io.trtc.tuikit.atomicxcore.impl.room.log.a r8 = r7.f88776j
            r8.getClass()
            java.lang.String r2 = "getParticipantList failed, request limit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            r8.m88357a(r0, r2)
            if (r9 == 0) goto L39
            com.tencent.cloud.tuikit.engine.common.TUICommonDefine$Error r8 = com.tencent.cloud.tuikit.engine.common.TUICommonDefine.Error.FREQ_LIMIT
            int r8 = r8.getValue()
            java.lang.String r0 = "request limit"
            r9.onFailure(r8, r0)
            return
        L39:
            r8 = r7
            goto L6a
        L3b:
            kotlinx.coroutines.m0 r0 = r7.f88784r
            io.trtc.tuikit.atomicxcore.impl.room.U r1 = new io.trtc.tuikit.atomicxcore.impl.room.U
            r6 = 0
            r2 = r7
            r3 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r8 = r2
            r5 = 3
            r2 = 0
            r3 = 0
            r4 = r1
            r1 = r0
            kotlinx.coroutines.C41686h.m91046d(r1, r2, r3, r4, r5, r6)
            return
        L50:
            io.trtc.tuikit.atomicxcore.impl.room.log.a r9 = r8.f88776j
            r9.getClass()
            java.lang.String r2 = "getParticipantList failed, not in room"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            r9.m88357a(r0, r2)
            if (r5 == 0) goto L6a
            com.tencent.cloud.tuikit.engine.common.TUICommonDefine$Error r9 = com.tencent.cloud.tuikit.engine.common.TUICommonDefine.Error.OPERATION_INVALID_BEFORE_ENTER_ROOM
            int r9 = r9.getValue()
            java.lang.String r0 = "not in room"
            r5.onFailure(r9, r0)
        L6a:
            return
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final io.trtc.tuikit.atomicxcore.api.room.RoomParticipantState getState() {
            r1 = this;
            io.trtc.tuikit.atomicxcore.api.room.RoomParticipantState r0 = r1.f88766B
            return r0
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void inviteToOpenDevice(java.lang.String r6, io.trtc.tuikit.atomicxcore.api.device.DeviceType r7, int r8, io.trtc.tuikit.atomicxcore.api.CompletionHandler r9) {
            r5 = this;
            java.lang.String r0 = "userID"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r1 = "device"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            com.tencent.cloud.tuikit.engine.room.TUIRoomEngine r2 = r5.f88767a
            com.tencent.cloud.tuikit.engine.room.TUIRoomDefine$MediaDevice r3 = io.trtc.tuikit.atomicxcore.impl.room.AbstractC39939m0.m88359a(r7)
            io.trtc.tuikit.atomicxcore.impl.room.Z r4 = new io.trtc.tuikit.atomicxcore.impl.room.Z
            r4.<init>(r5, r7, r9, r6)
            com.tencent.cloud.tuikit.engine.room.TUIRoomDefine$Request r8 = r2.openRemoteDeviceByAdmin(r6, r3, r8, r4)
            io.trtc.tuikit.atomicxcore.impl.room.b r9 = r5.f88791y
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
            r9.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.util.LinkedHashMap r1 = r9.f88731e
            java.lang.Object r1 = r1.get(r6)
            io.trtc.tuikit.atomicxcore.impl.room.V0 r1 = (io.trtc.tuikit.atomicxcore.impl.room.C39908V0) r1
            if (r1 != 0) goto L40
            io.trtc.tuikit.atomicxcore.impl.room.V0 r1 = new io.trtc.tuikit.atomicxcore.impl.room.V0
            java.util.Map r2 = kotlin.collections.MapsKt.emptyMap()
            r1.<init>(r6, r2)
        L40:
            java.lang.String r2 = "deviceType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.util.Map r0 = r1.f88718b
            java.util.Map r0 = kotlin.collections.MapsKt.toMutableMap(r0)
            r0.put(r7, r8)
            java.lang.String r7 = r1.f88717a
            java.lang.String r1 = "userId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            java.lang.String r1 = "deviceRequests"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            io.trtc.tuikit.atomicxcore.impl.room.V0 r1 = new io.trtc.tuikit.atomicxcore.impl.room.V0
            r1.<init>(r7, r0)
            java.util.LinkedHashMap r7 = r9.f88731e
            r7.put(r6, r1)
            kotlinx.coroutines.flow.n r6 = r9.f88728b
        L6a:
            java.lang.Object r7 = r6.getValue()
            r9 = r7
            java.util.List r9 = (java.util.List) r9
            io.trtc.tuikit.atomicxcore.api.room.DeviceRequestInfo r0 = io.trtc.tuikit.atomicxcore.impl.room.AbstractC39939m0.m88361a(r8)
            java.util.List r9 = kotlin.collections.CollectionsKt.plus(r9, r0)
            boolean r7 = r6.compareAndSet(r7, r9)
            if (r7 == 0) goto L6a
            return
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void kickUser(java.lang.String r5, io.trtc.tuikit.atomicxcore.api.CompletionHandler r6) {
            r4 = this;
            java.lang.String r0 = "userID"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.tencent.cloud.tuikit.engine.room.TUIRoomEngine r0 = r4.f88767a
            io.trtc.tuikit.atomicxcore.impl.common.c r1 = new io.trtc.tuikit.atomicxcore.impl.common.c
            r2 = 0
            r3 = 6
            r1.<init>(r6, r2, r2, r3)
            r0.kickRemoteUserOutOfRoom(r5, r1)
            return
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void muteMicrophone() {
            r1 = this;
            com.tencent.cloud.tuikit.engine.room.TUIRoomEngine r0 = r1.f88767a
            r0.muteLocalAudio()
            return
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void rejectOpenDeviceRequest(io.trtc.tuikit.atomicxcore.api.device.DeviceType r2, java.lang.String r3, io.trtc.tuikit.atomicxcore.api.CompletionHandler r4) {
            r1 = this;
            java.lang.String r0 = "device"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "userID"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r1.m88353a(r2, r3, r0, r4)
            return
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void removeRoomParticipantListener(io.trtc.tuikit.atomicxcore.api.room.RoomParticipantListener r2) {
            r1 = this;
            io.trtc.tuikit.atomicxcore.impl.common.q r0 = r1.f88787u
            r0.m88250b(r2)
            return
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void requestToOpenDevice(io.trtc.tuikit.atomicxcore.api.device.DeviceType r5, int r6, io.trtc.tuikit.atomicxcore.api.CompletionHandler r7) {
            r4 = this;
            java.lang.String r0 = "device"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.tencent.cloud.tuikit.engine.room.TUIRoomEngine r1 = r4.f88767a
            com.tencent.cloud.tuikit.engine.room.TUIRoomDefine$MediaDevice r2 = io.trtc.tuikit.atomicxcore.impl.room.AbstractC39939m0.m88359a(r5)
            io.trtc.tuikit.atomicxcore.impl.room.g0 r3 = new io.trtc.tuikit.atomicxcore.impl.room.g0
            r3.<init>(r4, r5, r7)
            com.tencent.cloud.tuikit.engine.room.TUIRoomDefine$Request r6 = r1.applyToAdminToOpenLocalDevice(r2, r6, r3)
            io.trtc.tuikit.atomicxcore.impl.room.b r7 = r4.f88791y
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            r7.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.LinkedHashMap r7 = r7.f88729c
            r7.put(r5, r6)
            return
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void revokeAdmin(java.lang.String r6, io.trtc.tuikit.atomicxcore.api.CompletionHandler r7) {
            r5 = this;
            java.lang.String r0 = "userID"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            com.tencent.cloud.tuikit.engine.room.TUIRoomEngine r0 = r5.f88767a
            com.tencent.cloud.tuikit.engine.room.TUIRoomDefine$Role r1 = com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.Role.GENERAL_USER
            io.trtc.tuikit.atomicxcore.impl.common.c r2 = new io.trtc.tuikit.atomicxcore.impl.common.c
            r3 = 0
            r4 = 6
            r2.<init>(r7, r3, r3, r4)
            r0.changeUserRole(r6, r1, r2)
            return
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void setAdmin(java.lang.String r6, io.trtc.tuikit.atomicxcore.api.CompletionHandler r7) {
            r5 = this;
            java.lang.String r0 = "userID"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            com.tencent.cloud.tuikit.engine.room.TUIRoomEngine r0 = r5.f88767a
            com.tencent.cloud.tuikit.engine.room.TUIRoomDefine$Role r1 = com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.Role.MANAGER
            io.trtc.tuikit.atomicxcore.impl.common.c r2 = new io.trtc.tuikit.atomicxcore.impl.common.c
            r3 = 0
            r4 = 6
            r2.<init>(r7, r3, r3, r4)
            r0.changeUserRole(r6, r1, r2)
            return
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void transferOwner(java.lang.String r6, io.trtc.tuikit.atomicxcore.api.CompletionHandler r7) {
            r5 = this;
            java.lang.String r0 = "userID"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            com.tencent.cloud.tuikit.engine.room.TUIRoomEngine r0 = r5.f88767a
            com.tencent.cloud.tuikit.engine.room.TUIRoomDefine$Role r1 = com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.Role.ROOM_OWNER
            io.trtc.tuikit.atomicxcore.impl.common.c r2 = new io.trtc.tuikit.atomicxcore.impl.common.c
            r3 = 0
            r4 = 6
            r2.<init>(r7, r3, r3, r4)
            r0.changeUserRole(r6, r1, r2)
            return
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void unmuteMicrophone(io.trtc.tuikit.atomicxcore.api.CompletionHandler r5) {
            r4 = this;
            com.tencent.cloud.tuikit.engine.room.TUIRoomEngine r0 = r4.f88767a
            io.trtc.tuikit.atomicxcore.impl.common.c r1 = new io.trtc.tuikit.atomicxcore.impl.common.c
            r2 = 0
            r3 = 6
            r1.<init>(r5, r2, r2, r3)
            r0.unmuteLocalAudio(r1)
            return
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void updateParticipantMetaData(java.lang.String r5, java.util.HashMap r6, io.trtc.tuikit.atomicxcore.api.CompletionHandler r7) {
            r4 = this;
            java.lang.String r0 = "userID"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "metaData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            com.tencent.cloud.tuikit.engine.room.TUIRoomEngine r0 = r4.f88767a
            io.trtc.tuikit.atomicxcore.impl.common.c r1 = new io.trtc.tuikit.atomicxcore.impl.common.c
            r2 = 0
            r3 = 6
            r1.<init>(r7, r2, r2, r3)
            r0.setCustomInfoForUser(r5, r6, r1)
            return
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore
    public final void updateParticipantNameCard(java.lang.String r5, java.lang.String r6, io.trtc.tuikit.atomicxcore.api.CompletionHandler r7) {
            r4 = this;
            java.lang.String r0 = "userID"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "nameCard"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            com.tencent.cloud.tuikit.engine.room.TUIRoomEngine r0 = r4.f88767a
            io.trtc.tuikit.atomicxcore.impl.common.c r1 = new io.trtc.tuikit.atomicxcore.impl.common.c
            r2 = 0
            r3 = 6
            r1.<init>(r7, r2, r2, r3)
            r0.changeUserNameCard(r5, r6, r1)
            return
    }
}
