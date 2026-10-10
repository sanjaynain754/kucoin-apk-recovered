package com.kubi.unify.utils;

/* JADX INFO: compiled from: FlowEx.kt */
/* JADX INFO: loaded from: classes52.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.unify.utils.FlowExKt$bufferTime$1$launchTimer$1", m90122f = "FlowEx.kt", m90123i = {0, 1, 1}, m90124l = {38, 47}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "$this$launch", "snapshot"}, m90127s = {"L$0", "L$0", "L$1"})
public final class FlowExKt$bufferTime$1$launchTimer$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.channels.InterfaceC41574m<java.util.List<? extends T>> $$this$channelFlow;
    final /* synthetic */ kotlinx.coroutines.channels.InterfaceC41565d<T> $bufferChannel;
    final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean $firstRun;
    final /* synthetic */ long $timeMillis;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;

    public FlowExKt$bufferTime$1$launchTimer$1(java.util.concurrent.atomic.AtomicBoolean r1, long r2, kotlinx.coroutines.channels.InterfaceC41565d<T> r4, kotlinx.coroutines.channels.InterfaceC41574m<? super java.util.List<? extends T>> r5, kotlin.coroutines.Continuation<? super com.kubi.unify.utils.FlowExKt$bufferTime$1$launchTimer$1> r6) {
            r0 = this;
            r0.$firstRun = r1
            r0.$timeMillis = r2
            r0.$bufferChannel = r4
            r0.$$this$channelFlow = r5
            r1 = 2
            r0.<init>(r1, r6)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r8, kotlin.coroutines.Continuation<?> r9) {
            r7 = this;
            com.kubi.unify.utils.FlowExKt$bufferTime$1$launchTimer$1 r0 = new com.kubi.unify.utils.FlowExKt$bufferTime$1$launchTimer$1
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.$firstRun
            long r2 = r7.$timeMillis
            kotlinx.coroutines.channels.d<T> r4 = r7.$bufferChannel
            kotlinx.coroutines.channels.m<java.util.List<? extends T>> r5 = r7.$$this$channelFlow
            r6 = r9
            r0.<init>(r1, r2, r4, r5, r6)
            r0.L$0 = r8
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
            com.kubi.unify.utils.FlowExKt$bufferTime$1$launchTimer$1 r1 = (com.kubi.unify.utils.FlowExKt$bufferTime$1$launchTimer$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            r7 = this;
            java.lang.Object r0 = r7.L$0
            kotlinx.coroutines.m0 r0 = (kotlinx.coroutines.InterfaceC41709m0) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r7.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L23
            if (r2 == r4) goto L1f
            if (r2 != r3) goto L17
            java.lang.Object r2 = r7.L$1
            java.util.List r2 = (java.util.List) r2
            goto L23
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L45
        L23:
            kotlin.ResultKt.throwOnFailure(r8)
        L26:
            boolean r8 = kotlinx.coroutines.C41713n0.m91132h(r0)
            if (r8 == 0) goto L73
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.$firstRun
            r2 = 0
            boolean r8 = r8.compareAndSet(r4, r2)
            if (r8 != 0) goto L45
            long r5 = r7.$timeMillis
            r7.L$0 = r0
            r8 = 0
            r7.L$1 = r8
            r7.label = r4
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.m90350b(r5, r7)
            if (r8 != r1) goto L45
            goto L72
        L45:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L4a:
            kotlinx.coroutines.channels.d<T> r2 = r7.$bufferChannel
            java.lang.Object r2 = r2.mo90609o()
            java.lang.Object r2 = kotlinx.coroutines.channels.ChannelResult.m90673f(r2)
            if (r2 == 0) goto L5a
            r8.add(r2)
            goto L4a
        L5a:
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L26
            kotlinx.coroutines.channels.m<java.util.List<? extends T>> r2 = r7.$$this$channelFlow
            r7.L$0 = r0
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r7.L$1 = r5
            r7.label = r3
            java.lang.Object r8 = r2.send(r8, r7)
            if (r8 != r1) goto L26
        L72:
            return r1
        L73:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
    }
}
