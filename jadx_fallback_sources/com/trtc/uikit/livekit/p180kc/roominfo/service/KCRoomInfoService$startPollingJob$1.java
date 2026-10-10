package com.trtc.uikit.livekit.p180kc.roominfo.service;

/* JADX INFO: compiled from: KCRoomInfoService.kt */
/* JADX INFO: loaded from: classes60.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.roominfo.service.KCRoomInfoService$startPollingJob$1", m90122f = "KCRoomInfoService.kt", m90123i = {0}, m90124l = {390}, m90125m = "invokeSuspend", m90126n = {"$this$launch"}, m90127s = {"L$0"})
public final class KCRoomInfoService$startPollingJob$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ long $realPollingInterval;
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.trtc.uikit.livekit.p180kc.roominfo.service.KCRoomInfoService this$0;

    public KCRoomInfoService$startPollingJob$1(long r1, com.trtc.uikit.livekit.p180kc.roominfo.service.KCRoomInfoService r3, kotlin.coroutines.Continuation<? super com.trtc.uikit.livekit.p180kc.roominfo.service.KCRoomInfoService$startPollingJob$1> r4) {
            r0 = this;
            r0.$realPollingInterval = r1
            r0.this$0 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r5, kotlin.coroutines.Continuation<?> r6) {
            r4 = this;
            com.trtc.uikit.livekit.kc.roominfo.service.KCRoomInfoService$startPollingJob$1 r0 = new com.trtc.uikit.livekit.kc.roominfo.service.KCRoomInfoService$startPollingJob$1
            long r1 = r4.$realPollingInterval
            com.trtc.uikit.livekit.kc.roominfo.service.KCRoomInfoService r3 = r4.this$0
            r0.<init>(r1, r3, r6)
            r0.L$0 = r5
            return r0
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.InterfaceC41709m0 r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke2(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.InterfaceC41709m0 r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            com.trtc.uikit.livekit.kc.roominfo.service.KCRoomInfoService$startPollingJob$1 r1 = (com.trtc.uikit.livekit.p180kc.roominfo.service.KCRoomInfoService$startPollingJob$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            r8 = this;
            java.lang.Object r0 = r8.L$0
            kotlinx.coroutines.m0 r0 = (kotlinx.coroutines.InterfaceC41709m0) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r8.label
            r3 = 1
            if (r2 == 0) goto L1b
            if (r2 != r3) goto L13
            kotlin.ResultKt.throwOnFailure(r9)
            goto L34
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1b:
            kotlin.ResultKt.throwOnFailure(r9)
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
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
    }
}
