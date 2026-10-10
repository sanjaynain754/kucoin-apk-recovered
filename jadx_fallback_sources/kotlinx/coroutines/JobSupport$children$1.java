package kotlinx.coroutines;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes61.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {"Lkotlin/sequences/SequenceScope;", "Lkotlinx/coroutines/x1;", "", "<anonymous>", "(Lkotlin/sequences/SequenceScope;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "kotlinx.coroutines.JobSupport$children$1", m90122f = "JobSupport.kt", m90123i = {1, 1, 1}, m90124l = {1003, 1005}, m90125m = "invokeSuspend", m90126n = {"$this$sequence", "this_$iv", "cur$iv"}, m90127s = {"L$0", "L$1", "L$2"})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$children$1\n+ 2 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n*L\n1#1,1583:1\n273#2,6:1584\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$children$1\n*L\n1005#1:1584,6\n*E\n"})
public final class JobSupport$children$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super kotlinx.coroutines.InterfaceC41775x1>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    final /* synthetic */ kotlinx.coroutines.JobSupport this$0;

    public JobSupport$children$1(kotlinx.coroutines.JobSupport r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.JobSupport$children$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            kotlinx.coroutines.JobSupport$children$1 r0 = new kotlinx.coroutines.JobSupport$children$1
            kotlinx.coroutines.JobSupport r1 = r2.this$0
            r0.<init>(r1, r4)
            r0.L$0 = r3
            return r0
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.sequences.SequenceScope<? super kotlinx.coroutines.InterfaceC41775x1> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke2(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlin.sequences.SequenceScope<? super kotlinx.coroutines.InterfaceC41775x1> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            kotlinx.coroutines.JobSupport$children$1 r1 = (kotlinx.coroutines.JobSupport$children$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1e
            java.lang.Object r1 = r5.L$2
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            java.lang.Object r3 = r5.L$1
            og0.n r3 = (og0.C43070n) r3
            java.lang.Object r4 = r5.L$0
            kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
            kotlin.ResultKt.throwOnFailure(r6)
            goto L81
        L1e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L26:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L86
        L2a:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.Object r6 = r5.L$0
            kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
            kotlinx.coroutines.JobSupport r1 = r5.this$0
            java.lang.Object r1 = r1.m90428k0()
            boolean r4 = r1 instanceof kotlinx.coroutines.C41761u
            if (r4 == 0) goto L48
            kotlinx.coroutines.u r1 = (kotlinx.coroutines.C41761u) r1
            kotlinx.coroutines.v r1 = r1.f91867f
            r5.label = r3
            java.lang.Object r6 = r6.yield(r1, r5)
            if (r6 != r0) goto L86
            goto L80
        L48:
            boolean r3 = r1 instanceof kotlinx.coroutines.InterfaceC41741s1
            if (r3 == 0) goto L86
            kotlinx.coroutines.s1 r1 = (kotlinx.coroutines.InterfaceC41741s1) r1
            kotlinx.coroutines.f2 r1 = r1.mo90454a()
            if (r1 == 0) goto L86
            java.lang.Object r3 = r1.m91079j()
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r4)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r4 = r3
            r3 = r1
            r1 = r4
            r4 = r6
        L63:
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r6 != 0) goto L86
            boolean r6 = r1 instanceof kotlinx.coroutines.C41761u
            if (r6 == 0) goto L81
            r6 = r1
            kotlinx.coroutines.u r6 = (kotlinx.coroutines.C41761u) r6
            kotlinx.coroutines.v r6 = r6.f91867f
            r5.L$0 = r4
            r5.L$1 = r3
            r5.L$2 = r1
            r5.label = r2
            java.lang.Object r6 = r4.yield(r6, r5)
            if (r6 != r0) goto L81
        L80:
            return r0
        L81:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r1.m91080k()
            goto L63
        L86:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
    }
}
