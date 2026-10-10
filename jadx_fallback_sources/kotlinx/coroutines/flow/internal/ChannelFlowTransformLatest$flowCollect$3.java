package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes23.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", m90122f = "Merge.kt", m90123i = {}, m90124l = {23}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ChannelFlowTransformLatest$flowCollect$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.InterfaceC41635f<R> $collector;
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> this$0;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1 */
    /* JADX INFO: compiled from: Merge.kt */
    @kotlin.Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class C416401<T> implements kotlinx.coroutines.flow.InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.InterfaceC41775x1> f91666b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ kotlinx.coroutines.InterfaceC41709m0 f91667c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> f91668d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ kotlinx.coroutines.flow.InterfaceC41635f<R> f91669e;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: Merge.kt */
        @kotlin.Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", m90122f = "Merge.kt", m90123i = {}, m90124l = {30}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ kotlinx.coroutines.flow.InterfaceC41635f<R> $collector;
            final /* synthetic */ T $value;
            int label;
            final /* synthetic */ kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> this$0;

            public AnonymousClass2(kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r1, kotlinx.coroutines.flow.InterfaceC41635f<? super R> r2, T r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.C416401.AnonymousClass2> r4) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.$collector = r2
                    r0.$value = r3
                    r1 = 2
                    r0.<init>(r1, r4)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                    r3 = this;
                    kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2
                    kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r0 = r3.this$0
                    kotlinx.coroutines.flow.f<R> r1 = r3.$collector
                    T r2 = r3.$value
                    r4.<init>(r0, r1, r2, r5)
                    return r4
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
                    kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2 r1 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.C416401.AnonymousClass2) r1
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
                    goto L2d
                Lf:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L17:
                    kotlin.ResultKt.throwOnFailure(r5)
                    kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r5 = r4.this$0
                    kotlin.jvm.functions.Function3 r5 = kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest.m90957r(r5)
                    kotlinx.coroutines.flow.f<R> r1 = r4.$collector
                    T r3 = r4.$value
                    r4.label = r2
                    java.lang.Object r5 = r5.invoke(r1, r3, r4)
                    if (r5 != r0) goto L2d
                    return r0
                L2d:
                    kotlin.Unit r5 = kotlin.Unit.INSTANCE
                    return r5
            }
        }

        public C416401(kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.InterfaceC41775x1> r1, kotlinx.coroutines.InterfaceC41709m0 r2, kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r3, kotlinx.coroutines.flow.InterfaceC41635f<? super R> r4) {
                r0 = this;
                r0.f91666b = r1
                r0.f91667c = r2
                r0.f91668d = r3
                r0.f91669e = r4
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        public final java.lang.Object emit(T r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3b
                if (r2 != r3) goto L33
                java.lang.Object r8 = r0.L$2
                kotlinx.coroutines.x1 r8 = (kotlinx.coroutines.InterfaceC41775x1) r8
                java.lang.Object r8 = r0.L$1
                java.lang.Object r0 = r0.L$0
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.C416401) r0
                kotlin.ResultKt.throwOnFailure(r9)
                goto L5e
            L33:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3b:
                kotlin.ResultKt.throwOnFailure(r9)
                kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.x1> r9 = r7.f91666b
                T r9 = r9.element
                kotlinx.coroutines.x1 r9 = (kotlinx.coroutines.InterfaceC41775x1) r9
                if (r9 == 0) goto L5d
                kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                r2.<init>()
                r9.mo90415a(r2)
                r0.L$0 = r7
                r0.L$1 = r8
                r0.L$2 = r9
                r0.label = r3
                java.lang.Object r9 = r9.mo90385E(r0)
                if (r9 != r1) goto L5d
                return r1
            L5d:
                r0 = r7
            L5e:
                kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.x1> r9 = r0.f91666b
                kotlinx.coroutines.m0 r1 = r0.f91667c
                kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r2 = r0.f91668d
                kotlinx.coroutines.flow.f<R> r0 = r0.f91669e
                r5 = 0
                r4.<init>(r2, r0, r8, r5)
                r5 = 1
                r6 = 0
                r2 = 0
                kotlinx.coroutines.x1 r8 = kotlinx.coroutines.C41686h.m91046d(r1, r2, r3, r4, r5, r6)
                r9.element = r8
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
        }
    }

    public ChannelFlowTransformLatest$flowCollect$3(kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r1, kotlinx.coroutines.flow.InterfaceC41635f<? super R> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3> r3) {
            r0 = this;
            r0.this$0 = r1
            r0.$collector = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
            r3 = this;
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r1 = r3.this$0
            kotlinx.coroutines.flow.f<R> r2 = r3.$collector
            r0.<init>(r1, r2, r5)
            r0.L$0 = r4
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
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3 r1 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r8)
            goto L37
        Lf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L17:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.L$0
            kotlinx.coroutines.m0 r8 = (kotlinx.coroutines.InterfaceC41709m0) r8
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r3 = r7.this$0
            kotlinx.coroutines.flow.e<S> r4 = r3.f91664e
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1 r5 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1
            kotlinx.coroutines.flow.f<R> r6 = r7.$collector
            r5.<init>(r1, r8, r3, r6)
            r7.label = r2
            java.lang.Object r8 = r4.collect(r5, r7)
            if (r8 != r0) goto L37
            return r0
        L37:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
    }
}
