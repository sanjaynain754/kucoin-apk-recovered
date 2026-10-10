package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes61.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/channels/m;", "", "<anonymous>", "(Lkotlinx/coroutines/channels/m;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1", m90122f = "Delay.kt", m90123i = {0, 1, 2}, m90124l = {307, 309, 310}, m90125m = "invokeSuspend", m90126n = {"$this$produce", "$this$produce", "$this$produce"}, m90127s = {"L$0", "L$0", "L$0"})
public final class FlowKt__DelayKt$fixedPeriodTicker$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.InterfaceC41574m<? super kotlin.Unit>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ long $delayMillis;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    public FlowKt__DelayKt$fixedPeriodTicker$1(long r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1> r3) {
            r0 = this;
            r0.$delayMillis = r1
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
            r3 = this;
            kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1
            long r1 = r3.$delayMillis
            r0.<init>(r1, r5)
            r0.L$0 = r4
            return r0
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.InterfaceC41574m<? super kotlin.Unit> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlinx.coroutines.channels.m r1 = (kotlinx.coroutines.channels.InterfaceC41574m) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke2(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.channels.InterfaceC41574m<? super kotlin.Unit> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1 r1 = (kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            goto L22
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.channels.m r1 = (kotlinx.coroutines.channels.InterfaceC41574m) r1
            kotlin.ResultKt.throwOnFailure(r8)
            goto L50
        L22:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.channels.m r1 = (kotlinx.coroutines.channels.InterfaceC41574m) r1
            kotlin.ResultKt.throwOnFailure(r8)
            goto L3f
        L2a:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            kotlinx.coroutines.channels.m r1 = (kotlinx.coroutines.channels.InterfaceC41574m) r1
            long r5 = r7.$delayMillis
            r7.L$0 = r1
            r7.label = r4
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.m90350b(r5, r7)
            if (r8 != r0) goto L3f
            goto L5c
        L3f:
            kotlinx.coroutines.channels.p r8 = r1.getChannel()
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            r7.L$0 = r1
            r7.label = r3
            java.lang.Object r8 = r8.send(r4, r7)
            if (r8 != r0) goto L50
            goto L5c
        L50:
            long r4 = r7.$delayMillis
            r7.L$0 = r1
            r7.label = r2
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.m90350b(r4, r7)
            if (r8 != r0) goto L3f
        L5c:
            return r0
    }
}
