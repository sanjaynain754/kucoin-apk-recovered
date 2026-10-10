package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.InterfaceC41574m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/channels/m;", "", "<anonymous>", "(Lkotlinx/coroutines/channels/m;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
@DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1", m90122f = "Delay.kt", m90123i = {0, 1, 2}, m90124l = {307, 309, 310}, m90125m = "invokeSuspend", m90126n = {"$this$produce", "$this$produce", "$this$produce"}, m90127s = {"L$0", "L$0", "L$0"})
public final class FlowKt__DelayKt$fixedPeriodTicker$1 extends SuspendLambda implements Function2<InterfaceC41574m<? super Unit>, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $delayMillis;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$fixedPeriodTicker$1(long j11, Continuation<? super FlowKt__DelayKt$fixedPeriodTicker$1> continuation) {
        super(2, continuation);
        this.$delayMillis = j11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FlowKt__DelayKt$fixedPeriodTicker$1 flowKt__DelayKt$fixedPeriodTicker$1 = new FlowKt__DelayKt$fixedPeriodTicker$1(this.$delayMillis, continuation);
        flowKt__DelayKt$fixedPeriodTicker$1.L$0 = obj;
        return flowKt__DelayKt$fixedPeriodTicker$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41574m<? super Unit> interfaceC41574m, Continuation<? super Unit> continuation) {
        return ((FlowKt__DelayKt$fixedPeriodTicker$1) create(interfaceC41574m, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003f A[PHI: r1
      0x003f: PHI (r1v3 kotlinx.coroutines.channels.m) = (r1v2 kotlinx.coroutines.channels.m), (r1v4 kotlinx.coroutines.channels.m), (r1v6 kotlinx.coroutines.channels.m) binds: [B:13:0x003c, B:19:0x005a, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0050 A[PHI: r1
      0x0050: PHI (r1v4 kotlinx.coroutines.channels.m) = (r1v3 kotlinx.coroutines.channels.m), (r1v8 kotlinx.coroutines.channels.m) binds: [B:16:0x004d, B:10:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:15:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
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
            p852kotlin.ResultKt.throwOnFailure(r8)
            goto L50
        L22:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.channels.m r1 = (kotlinx.coroutines.channels.InterfaceC41574m) r1
            p852kotlin.ResultKt.throwOnFailure(r8)
            goto L3f
        L2a:
            p852kotlin.ResultKt.throwOnFailure(r8)
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
            kotlin.Unit r4 = p852kotlin.Unit.INSTANCE
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
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
