package com.kubi.core.biz.submit;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: TradeSubmitVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeSubmitVM$startFundsInfo$timerFlow$1", m90122f = "TradeSubmitVM.kt", m90123i = {0, 1}, m90124l = {386, 387}, m90125m = "invokeSuspend", m90126n = {"$this$flow", "$this$flow"}, m90127s = {"L$0", "L$0"})
public final class TradeSubmitVM$startFundsInfo$timerFlow$1 extends SuspendLambda implements Function2<InterfaceC41635f<? super Unit>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    public TradeSubmitVM$startFundsInfo$timerFlow$1(Continuation<? super TradeSubmitVM$startFundsInfo$timerFlow$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TradeSubmitVM$startFundsInfo$timerFlow$1 tradeSubmitVM$startFundsInfo$timerFlow$1 = new TradeSubmitVM$startFundsInfo$timerFlow$1(continuation);
        tradeSubmitVM$startFundsInfo$timerFlow$1.L$0 = obj;
        return tradeSubmitVM$startFundsInfo$timerFlow$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41635f<? super Unit> interfaceC41635f, Continuation<? super Unit> continuation) {
        return ((TradeSubmitVM$startFundsInfo$timerFlow$1) create(interfaceC41635f, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022  */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0039 -> B:11:0x0022). Please report as a decompilation issue!!! */
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
            java.lang.Object r0 = r7.L$0
            kotlinx.coroutines.flow.f r0 = (kotlinx.coroutines.flow.InterfaceC41635f) r0
            java.lang.Object r1 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r7.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1f
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L13
            goto L1f
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            p852kotlin.ResultKt.throwOnFailure(r8)
            goto L2f
        L1f:
            p852kotlin.ResultKt.throwOnFailure(r8)
        L22:
            r7.L$0 = r0
            r7.label = r4
            r5 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.m90350b(r5, r7)
            if (r8 != r1) goto L2f
            goto L3b
        L2f:
            kotlin.Unit r8 = p852kotlin.Unit.INSTANCE
            r7.L$0 = r0
            r7.label = r3
            java.lang.Object r8 = r0.emit(r8, r7)
            if (r8 != r1) goto L22
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.core.biz.submit.TradeSubmitVM$startFundsInfo$timerFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
