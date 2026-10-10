package com.kubi.tradingbotkit.business.strategyList.viewModel;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: StrategyListViewModel.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.strategyList.viewModel.StrategyListViewModel$startPolling$1", m90122f = "StrategyListViewModel.kt", m90123i = {0}, m90124l = {137}, m90125m = "invokeSuspend", m90126n = {"$this$launch"}, m90127s = {"L$0"})
public final class StrategyListViewModel$startPolling$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StrategyListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrategyListViewModel$startPolling$1(StrategyListViewModel strategyListViewModel, Continuation<? super StrategyListViewModel$startPolling$1> continuation) {
        super(2, continuation);
        this.this$0 = strategyListViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StrategyListViewModel$startPolling$1 strategyListViewModel$startPolling$1 = new StrategyListViewModel$startPolling$1(this.this$0, continuation);
        strategyListViewModel$startPolling$1.L$0 = obj;
        return strategyListViewModel$startPolling$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((StrategyListViewModel$startPolling$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:13:0x0030 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002e -> B:14:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.L$0
            kotlinx.coroutines.m0 r0 = (kotlinx.coroutines.InterfaceC41709m0) r0
            java.lang.Object r1 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r6.label
            r3 = 1
            if (r2 == 0) goto L1b
            if (r2 != r3) goto L13
            p852kotlin.ResultKt.throwOnFailure(r7)
            goto L31
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            p852kotlin.ResultKt.throwOnFailure(r7)
        L1e:
            boolean r7 = kotlinx.coroutines.C41713n0.m91132h(r0)
            if (r7 == 0) goto L37
            r6.L$0 = r0
            r6.label = r3
            r4 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.m90350b(r4, r6)
            if (r7 != r1) goto L31
            return r1
        L31:
            com.kubi.tradingbotkit.business.strategyList.viewModel.StrategyListViewModel r7 = r6.this$0
            r7.m64154w()
            goto L1e
        L37:
            kotlin.Unit r7 = p852kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.tradingbotkit.business.strategyList.viewModel.StrategyListViewModel$startPolling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
