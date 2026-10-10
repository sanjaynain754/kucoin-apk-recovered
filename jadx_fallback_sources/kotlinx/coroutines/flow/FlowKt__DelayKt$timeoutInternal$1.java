package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes61.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m90084d2 = {"T", "Lkotlinx/coroutines/m0;", "Lkotlinx/coroutines/flow/f;", "downStream", "", "<anonymous>", "(Lkotlinx/coroutines/m0;Lkotlinx/coroutines/flow/f;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", m90122f = "Delay.kt", m90123i = {0, 0}, m90124l = {413}, m90125m = "invokeSuspend", m90126n = {"downStream", "values"}, m90127s = {"L$0", "L$1"})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1\n+ 2 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n+ 3 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,407:1\n27#2:408\n28#2:414\n54#3,5:409\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1\n*L\n392#1:408\n392#1:414\n392#1:409,5\n*E\n"})
public final class FlowKt__DelayKt$timeoutInternal$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.InterfaceC41709m0, kotlinx.coroutines.flow.InterfaceC41635f<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.InterfaceC41634e<T> $this_timeoutInternal;
    final /* synthetic */ long $timeout;
    long J$0;
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    int label;

    public FlowKt__DelayKt$timeoutInternal$1(long r1, kotlinx.coroutines.flow.InterfaceC41634e<? extends T> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1> r4) {
            r0 = this;
            r0.$timeout = r1
            r0.$this_timeoutInternal = r3
            r1 = 3
            r0.<init>(r1, r4)
            return
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.InterfaceC41709m0 r1, java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r0 = this;
            kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
            kotlinx.coroutines.flow.f r2 = (kotlinx.coroutines.flow.InterfaceC41635f) r2
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r1 = r0.invoke(r1, r2, r3)
            return r1
    }

    public final java.lang.Object invoke(kotlinx.coroutines.InterfaceC41709m0 r5, kotlinx.coroutines.flow.InterfaceC41635f<? super T> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            r4 = this;
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1
            long r1 = r4.$timeout
            kotlinx.coroutines.flow.e<T> r3 = r4.$this_timeoutInternal
            r0.<init>(r1, r3, r7)
            r0.L$0 = r5
            r0.L$1 = r6
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            java.lang.Object r5 = r0.invokeSuspend(r5)
            return r5
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L22
            if (r1 != r2) goto L1a
            long r4 = r9.J$0
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.InterfaceC41576o) r1
            java.lang.Object r6 = r9.L$0
            kotlinx.coroutines.flow.f r6 = (kotlinx.coroutines.flow.InterfaceC41635f) r6
            kotlin.ResultKt.throwOnFailure(r10)
            goto L77
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.m0 r10 = (kotlinx.coroutines.InterfaceC41709m0) r10
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.InterfaceC41635f) r1
            long r4 = r9.$timeout
            kotlin.time.Duration$Companion r6 = kotlin.time.Duration.Companion
            long r6 = r6.m105278getZEROUwyO8pc()
            int r4 = kotlin.time.Duration.m105186compareToLRDsOJo(r4, r6)
            if (r4 <= 0) goto L82
            kotlinx.coroutines.flow.e<T> r4 = r9.$this_timeoutInternal
            r5 = 0
            r6 = 2
            kotlinx.coroutines.flow.e r4 = kotlinx.coroutines.flow.C41636g.m90911e(r4, r5, r3, r6, r3)
            kotlinx.coroutines.channels.o r10 = kotlinx.coroutines.flow.C41636g.m90899W(r4, r10)
            long r4 = r9.$timeout
            r6 = r1
            r1 = r10
        L4b:
            kotlinx.coroutines.selects.SelectImplementation r10 = new kotlinx.coroutines.selects.SelectImplementation
            kotlin.coroutines.CoroutineContext r7 = r9.getContext()
            r10.<init>(r7)
            kotlinx.coroutines.selects.f r7 = r1.mo90596f()
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1 r8 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1
            r8.<init>(r6, r3)
            r10.mo91279g(r7, r8)
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2 r7 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2
            r7.<init>(r4, r3)
            kotlinx.coroutines.selects.C41747b.m91298b(r10, r4, r7)
            r9.L$0 = r6
            r9.L$1 = r1
            r9.J$0 = r4
            r9.label = r2
            java.lang.Object r10 = r10.m91283o(r9)
            if (r10 != r0) goto L77
            return r0
        L77:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L4b
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L82:
            kotlinx.coroutines.TimeoutCancellationException r10 = new kotlinx.coroutines.TimeoutCancellationException
            java.lang.String r0 = "Timed out immediately"
            r10.<init>(r0)
            throw r10
    }
}
