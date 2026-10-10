package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes61.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {"Lkotlinx/coroutines/channels/m;", "", "", "<anonymous>", "(Lkotlinx/coroutines/channels/m;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1", m90122f = "Delay.kt", m90123i = {}, m90124l = {273}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FlowKt__DelayKt$sample$2$values$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.InterfaceC41574m<? super java.lang.Object>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.InterfaceC41634e<T> $this_sample;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1 */
    /* JADX INFO: compiled from: Delay.kt */
    @kotlin.Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class C415981<T> implements kotlinx.coroutines.flow.InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ kotlinx.coroutines.channels.InterfaceC41574m<java.lang.Object> f91561b;

        public C415981(kotlinx.coroutines.channels.InterfaceC41574m<java.lang.Object> r1) {
                r0 = this;
                r0.f91561b = r1
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        public final java.lang.Object emit(T r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1$emit$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.ResultKt.throwOnFailure(r6)
                goto L43
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.ResultKt.throwOnFailure(r6)
                kotlinx.coroutines.channels.m<java.lang.Object> r6 = r4.f91561b
                if (r5 != 0) goto L3a
                og0.a0 r5 = kotlinx.coroutines.flow.internal.C41658l.f91700a
            L3a:
                r0.label = r3
                java.lang.Object r5 = r6.send(r5, r0)
                if (r5 != r1) goto L43
                return r1
            L43:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
        }
    }

    public FlowKt__DelayKt$sample$2$values$1(kotlinx.coroutines.flow.InterfaceC41634e<? extends T> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1> r2) {
            r0 = this;
            r0.$this_sample = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1
            kotlinx.coroutines.flow.e<T> r1 = r2.$this_sample
            r0.<init>(r1, r4)
            r0.L$0 = r3
            return r0
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.InterfaceC41574m<? super java.lang.Object> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlinx.coroutines.channels.m r1 = (kotlinx.coroutines.channels.InterfaceC41574m) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke2(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.channels.InterfaceC41574m<java.lang.Object> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1 r1 = (kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r5)
            goto L2e
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            kotlin.ResultKt.throwOnFailure(r5)
            java.lang.Object r5 = r4.L$0
            kotlinx.coroutines.channels.m r5 = (kotlinx.coroutines.channels.InterfaceC41574m) r5
            kotlinx.coroutines.flow.e<T> r1 = r4.$this_sample
            kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1 r3 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1
            r3.<init>(r5)
            r4.label = r2
            java.lang.Object r5 = r1.collect(r3, r4)
            if (r5 != r0) goto L2e
            return r0
        L2e:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
    }
}
