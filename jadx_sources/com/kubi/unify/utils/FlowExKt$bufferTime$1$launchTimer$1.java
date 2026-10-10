package com.kubi.unify.utils;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.channels.InterfaceC41565d;
import kotlinx.coroutines.channels.InterfaceC41574m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FlowEx.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.utils.FlowExKt$bufferTime$1$launchTimer$1", m90122f = "FlowEx.kt", m90123i = {0, 1, 1}, m90124l = {38, 47}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "$this$launch", "snapshot"}, m90127s = {"L$0", "L$0", "L$1"})
public final class FlowExKt$bufferTime$1$launchTimer$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC41574m<List<? extends T>> $$this$channelFlow;
    final /* synthetic */ InterfaceC41565d<T> $bufferChannel;
    final /* synthetic */ AtomicBoolean $firstRun;
    final /* synthetic */ long $timeMillis;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExKt$bufferTime$1$launchTimer$1(AtomicBoolean atomicBoolean, long j11, InterfaceC41565d<T> interfaceC41565d, InterfaceC41574m<? super List<? extends T>> interfaceC41574m, Continuation<? super FlowExKt$bufferTime$1$launchTimer$1> continuation) {
        super(2, continuation);
        this.$firstRun = atomicBoolean;
        this.$timeMillis = j11;
        this.$bufferChannel = interfaceC41565d;
        this.$$this$channelFlow = interfaceC41574m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FlowExKt$bufferTime$1$launchTimer$1 flowExKt$bufferTime$1$launchTimer$1 = new FlowExKt$bufferTime$1$launchTimer$1(this.$firstRun, this.$timeMillis, this.$bufferChannel, this.$$this$channelFlow, continuation);
        flowExKt$bufferTime$1$launchTimer$1.L$0 = obj;
        return flowExKt$bufferTime$1$launchTimer$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FlowExKt$bufferTime$1$launchTimer$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005e -> B:11:0x0026). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0070 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to com.kubi.unify.utils.FlowExKt$bufferTime$1$launchTimer$1 for r7v1 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.L$0
            kotlinx.coroutines.m0 r0 = (kotlinx.coroutines.InterfaceC41709m0) r0
            java.lang.Object r1 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
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
            p852kotlin.ResultKt.throwOnFailure(r8)
            goto L45
        L23:
            p852kotlin.ResultKt.throwOnFailure(r8)
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
            java.lang.Object r5 = p852kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r7.L$1 = r5
            r7.label = r3
            java.lang.Object r8 = r2.send(r8, r7)
            if (r8 != r1) goto L26
        L72:
            return r1
        L73:
            kotlin.Unit r8 = p852kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.unify.utils.FlowExKt$bufferTime$1$launchTimer$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
