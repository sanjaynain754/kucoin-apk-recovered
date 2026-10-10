package com.trtc.uikit.livekit.p180kc.roominfo.service;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KCRoomInfoService.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.roominfo.service.KCRoomInfoService$startPollingJob$1", m90122f = "KCRoomInfoService.kt", m90123i = {0}, m90124l = {390}, m90125m = "invokeSuspend", m90126n = {"$this$launch"}, m90127s = {"L$0"})
public final class KCRoomInfoService$startPollingJob$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $realPollingInterval;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ KCRoomInfoService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCRoomInfoService$startPollingJob$1(long j11, KCRoomInfoService kCRoomInfoService, Continuation<? super KCRoomInfoService$startPollingJob$1> continuation) {
        super(2, continuation);
        this.$realPollingInterval = j11;
        this.this$0 = kCRoomInfoService;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KCRoomInfoService$startPollingJob$1 kCRoomInfoService$startPollingJob$1 = new KCRoomInfoService$startPollingJob$1(this.$realPollingInterval, this.this$0, continuation);
        kCRoomInfoService$startPollingJob$1.L$0 = obj;
        return kCRoomInfoService$startPollingJob$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCRoomInfoService$startPollingJob$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:13:0x0033 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0031 -> B:14:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.L$0
            kotlinx.coroutines.m0 r0 = (kotlinx.coroutines.InterfaceC41709m0) r0
            java.lang.Object r1 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r8.label
            r3 = 1
            if (r2 == 0) goto L1b
            if (r2 != r3) goto L13
            p852kotlin.ResultKt.throwOnFailure(r9)
            goto L34
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1b:
            p852kotlin.ResultKt.throwOnFailure(r9)
        L1e:
            boolean r9 = kotlinx.coroutines.C41713n0.m91132h(r0)
            if (r9 == 0) goto L3a
            long r4 = r8.$realPollingInterval
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            r8.L$0 = r0
            r8.label = r3
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.m90350b(r4, r8)
            if (r9 != r1) goto L34
            return r1
        L34:
            com.trtc.uikit.livekit.kc.roominfo.service.KCRoomInfoService r9 = r8.this$0
            r9.m81566k()
            goto L1e
        L3a:
            kotlin.Unit r9 = p852kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.trtc.uikit.livekit.p180kc.roominfo.service.KCRoomInfoService$startPollingJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
