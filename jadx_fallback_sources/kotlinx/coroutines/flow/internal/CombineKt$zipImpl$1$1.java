package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: Combine.kt */
/* JADX INFO: loaded from: classes61.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", m90122f = "Combine.kt", m90123i = {0, 0}, m90124l = {123}, m90125m = "invokeSuspend", m90126n = {"second", "collectJob"}, m90127s = {"L$0", "L$1"})
public final class CombineKt$zipImpl$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.InterfaceC41634e<T1> $flow;
    final /* synthetic */ kotlinx.coroutines.flow.InterfaceC41634e<T2> $flow2;
    final /* synthetic */ kotlinx.coroutines.flow.InterfaceC41635f<R> $this_unsafeFlow;
    final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 */
    /* JADX INFO: compiled from: Combine.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", m90122f = "Combine.kt", m90123i = {}, m90124l = {124}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C416432 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Unit, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.Object $cnt;
        final /* synthetic */ kotlinx.coroutines.InterfaceC41781z $collectJob;
        final /* synthetic */ kotlinx.coroutines.flow.InterfaceC41634e<T1> $flow;
        final /* synthetic */ kotlin.coroutines.CoroutineContext $scopeContext;
        final /* synthetic */ kotlinx.coroutines.channels.InterfaceC41576o<java.lang.Object> $second;
        final /* synthetic */ kotlinx.coroutines.flow.InterfaceC41635f<R> $this_unsafeFlow;
        final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Combine.kt */
        @kotlin.Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
        public static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ kotlin.coroutines.CoroutineContext f91677b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ java.lang.Object f91678c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ kotlinx.coroutines.channels.InterfaceC41576o<java.lang.Object> f91679d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ kotlinx.coroutines.flow.InterfaceC41635f<R> f91680e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> f91681f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ kotlinx.coroutines.InterfaceC41781z f91682g;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: Combine.kt */
            @kotlin.Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", m90122f = "Combine.kt", m90123i = {}, m90124l = {126, 129, 129}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
            @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCombine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,140:1\n994#2:141\n14#3:142\n*S KotlinDebug\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$1\n*L\n126#1:141\n129#1:142\n*E\n"})
            public static final class C470111 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Unit, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ kotlinx.coroutines.InterfaceC41781z $collectJob;
                final /* synthetic */ kotlinx.coroutines.channels.InterfaceC41576o<java.lang.Object> $second;
                final /* synthetic */ kotlinx.coroutines.flow.InterfaceC41635f<R> $this_unsafeFlow;
                final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
                final /* synthetic */ T1 $value;
                java.lang.Object L$0;
                int label;

                public C470111(kotlinx.coroutines.channels.InterfaceC41576o<? extends java.lang.Object> r1, kotlinx.coroutines.flow.InterfaceC41635f<? super R> r2, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3, T1 r4, kotlinx.coroutines.InterfaceC41781z r5, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.C416432.AnonymousClass1.C470111> r6) {
                        r0 = this;
                        r0.$second = r1
                        r0.$this_unsafeFlow = r2
                        r0.$transform = r3
                        r0.$value = r4
                        r0.$collectJob = r5
                        r1 = 2
                        r0.<init>(r1, r6)
                        return
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r8, kotlin.coroutines.Continuation<?> r9) {
                        r7 = this;
                        kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1
                        kotlinx.coroutines.channels.o<java.lang.Object> r1 = r7.$second
                        kotlinx.coroutines.flow.f<R> r2 = r7.$this_unsafeFlow
                        kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r3 = r7.$transform
                        T1 r4 = r7.$value
                        kotlinx.coroutines.z r5 = r7.$collectJob
                        r6 = r9
                        r0.<init>(r1, r2, r3, r4, r5, r6)
                        return r0
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.Unit r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                        r0 = this;
                        kotlin.Unit r1 = (kotlin.Unit) r1
                        kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                        java.lang.Object r1 = r0.invoke2(r1, r2)
                        return r1
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final java.lang.Object invoke2(kotlin.Unit r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                        r0 = this;
                        kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                        kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1 r1 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.C416432.AnonymousClass1.C470111) r1
                        kotlin.Unit r2 = kotlin.Unit.INSTANCE
                        java.lang.Object r1 = r1.invokeSuspend(r2)
                        return r1
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                        r8 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r8.label
                        r2 = 0
                        r3 = 3
                        r4 = 2
                        r5 = 1
                        if (r1 == 0) goto L30
                        if (r1 == r5) goto L26
                        if (r1 == r4) goto L1e
                        if (r1 != r3) goto L16
                        kotlin.ResultKt.throwOnFailure(r9)
                        goto L71
                    L16:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r0)
                        throw r9
                    L1e:
                        java.lang.Object r1 = r8.L$0
                        kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.InterfaceC41635f) r1
                        kotlin.ResultKt.throwOnFailure(r9)
                        goto L66
                    L26:
                        kotlin.ResultKt.throwOnFailure(r9)
                        kotlinx.coroutines.channels.ChannelResult r9 = (kotlinx.coroutines.channels.ChannelResult) r9
                        java.lang.Object r9 = r9.m90679l()
                        goto L3e
                    L30:
                        kotlin.ResultKt.throwOnFailure(r9)
                        kotlinx.coroutines.channels.o<java.lang.Object> r9 = r8.$second
                        r8.label = r5
                        java.lang.Object r9 = r9.mo90611p(r8)
                        if (r9 != r0) goto L3e
                        goto L70
                    L3e:
                        kotlinx.coroutines.z r1 = r8.$collectJob
                        boolean r5 = r9 instanceof kotlinx.coroutines.channels.ChannelResult.C41560b
                        if (r5 == 0) goto L50
                        java.lang.Throwable r9 = kotlinx.coroutines.channels.ChannelResult.m90672e(r9)
                        if (r9 != 0) goto L4f
                        kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
                        r9.<init>(r1)
                    L4f:
                        throw r9
                    L50:
                        kotlinx.coroutines.flow.f<R> r1 = r8.$this_unsafeFlow
                        kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r5 = r8.$transform
                        T1 r6 = r8.$value
                        og0.a0 r7 = kotlinx.coroutines.flow.internal.C41658l.f91700a
                        if (r9 != r7) goto L5b
                        r9 = r2
                    L5b:
                        r8.L$0 = r1
                        r8.label = r4
                        java.lang.Object r9 = r5.invoke(r6, r9, r8)
                        if (r9 != r0) goto L66
                        goto L70
                    L66:
                        r8.L$0 = r2
                        r8.label = r3
                        java.lang.Object r9 = r1.emit(r9, r8)
                        if (r9 != r0) goto L71
                    L70:
                        return r0
                    L71:
                        kotlin.Unit r9 = kotlin.Unit.INSTANCE
                        return r9
                }
            }

            public AnonymousClass1(kotlin.coroutines.CoroutineContext r1, java.lang.Object r2, kotlinx.coroutines.channels.InterfaceC41576o<? extends java.lang.Object> r3, kotlinx.coroutines.flow.InterfaceC41635f<? super R> r4, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r5, kotlinx.coroutines.InterfaceC41781z r6) {
                    r0 = this;
                    r0.f91677b = r1
                    r0.f91678c = r2
                    r0.f91679d = r3
                    r0.f91680e = r4
                    r0.f91681f = r5
                    r0.f91682g = r6
                    r0.<init>()
                    return
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public final java.lang.Object emit(T1 r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
                    r12 = this;
                    boolean r0 = r14 instanceof kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r14
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1
                    r0.<init>(r12, r14)
                L18:
                    java.lang.Object r14 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.ResultKt.throwOnFailure(r14)
                    goto L52
                L29:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L31:
                    kotlin.ResultKt.throwOnFailure(r14)
                    kotlin.coroutines.CoroutineContext r14 = r12.f91677b
                    kotlin.Unit r2 = kotlin.Unit.INSTANCE
                    java.lang.Object r4 = r12.f91678c
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1 r5 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1
                    kotlinx.coroutines.channels.o<java.lang.Object> r6 = r12.f91679d
                    kotlinx.coroutines.flow.f<R> r7 = r12.f91680e
                    kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r8 = r12.f91681f
                    kotlinx.coroutines.z r10 = r12.f91682g
                    r11 = 0
                    r9 = r13
                    r5.<init>(r6, r7, r8, r9, r10, r11)
                    r0.label = r3
                    java.lang.Object r13 = kotlinx.coroutines.flow.internal.C41650d.m90980c(r14, r2, r4, r5, r0)
                    if (r13 != r1) goto L52
                    return r1
                L52:
                    kotlin.Unit r13 = kotlin.Unit.INSTANCE
                    return r13
            }
        }

        public C416432(kotlinx.coroutines.flow.InterfaceC41634e<? extends T1> r1, kotlin.coroutines.CoroutineContext r2, java.lang.Object r3, kotlinx.coroutines.channels.InterfaceC41576o<? extends java.lang.Object> r4, kotlinx.coroutines.flow.InterfaceC41635f<? super R> r5, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r6, kotlinx.coroutines.InterfaceC41781z r7, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.C416432> r8) {
                r0 = this;
                r0.$flow = r1
                r0.$scopeContext = r2
                r0.$cnt = r3
                r0.$second = r4
                r0.$this_unsafeFlow = r5
                r0.$transform = r6
                r0.$collectJob = r7
                r1 = 2
                r0.<init>(r1, r8)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r10, kotlin.coroutines.Continuation<?> r11) {
                r9 = this;
                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 r0 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2
                kotlinx.coroutines.flow.e<T1> r1 = r9.$flow
                kotlin.coroutines.CoroutineContext r2 = r9.$scopeContext
                java.lang.Object r3 = r9.$cnt
                kotlinx.coroutines.channels.o<java.lang.Object> r4 = r9.$second
                kotlinx.coroutines.flow.f<R> r5 = r9.$this_unsafeFlow
                kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r6 = r9.$transform
                kotlinx.coroutines.z r7 = r9.$collectJob
                r8 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r0
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.Unit r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.Unit r1 = (kotlin.Unit) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlin.Unit r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 r1 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.C416432) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r11)
                goto L36
            Lf:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L17:
                kotlin.ResultKt.throwOnFailure(r11)
                kotlinx.coroutines.flow.e<T1> r11 = r10.$flow
                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1 r3 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1
                kotlin.coroutines.CoroutineContext r4 = r10.$scopeContext
                java.lang.Object r5 = r10.$cnt
                kotlinx.coroutines.channels.o<java.lang.Object> r6 = r10.$second
                kotlinx.coroutines.flow.f<R> r7 = r10.$this_unsafeFlow
                kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r8 = r10.$transform
                kotlinx.coroutines.z r9 = r10.$collectJob
                r3.<init>(r4, r5, r6, r7, r8, r9)
                r10.label = r2
                java.lang.Object r11 = r11.collect(r3, r10)
                if (r11 != r0) goto L36
                return r0
            L36:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$a */
    /* JADX INFO: compiled from: Combine.kt */
    @kotlin.Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class C41644a implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ kotlinx.coroutines.InterfaceC41781z f91683b;

        public C41644a(kotlinx.coroutines.InterfaceC41781z r1) {
                r0 = this;
                r0.f91683b = r1
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: a */
        public final void m90960a(java.lang.Throwable r3) {
                r2 = this;
                kotlinx.coroutines.z r3 = r2.f91683b
                boolean r3 = r3.isActive()
                if (r3 == 0) goto L14
                kotlinx.coroutines.z r3 = r2.f91683b
                kotlinx.coroutines.flow.internal.AbortFlowException r0 = new kotlinx.coroutines.flow.internal.AbortFlowException
                kotlinx.coroutines.z r1 = r2.f91683b
                r0.<init>(r1)
                r3.mo90415a(r0)
            L14:
                return
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.m90960a(r1)
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }
    }

    public CombineKt$zipImpl$1$1(kotlinx.coroutines.flow.InterfaceC41634e<? extends T2> r1, kotlinx.coroutines.flow.InterfaceC41634e<? extends T1> r2, kotlinx.coroutines.flow.InterfaceC41635f<? super R> r3, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1> r5) {
            r0 = this;
            r0.$flow2 = r1
            r0.$flow = r2
            r0.$this_unsafeFlow = r3
            r0.$transform = r4
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r7, kotlin.coroutines.Continuation<?> r8) {
            r6 = this;
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1
            kotlinx.coroutines.flow.e<T2> r1 = r6.$flow2
            kotlinx.coroutines.flow.e<T1> r2 = r6.$flow
            kotlinx.coroutines.flow.f<R> r3 = r6.$this_unsafeFlow
            kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r4 = r6.$transform
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r0.L$0 = r7
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
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1 r1 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            r25 = this;
            r4 = r25
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r8 = 1
            r9 = 0
            if (r0 == 0) goto L2b
            if (r0 != r8) goto L23
            java.lang.Object r0 = r4.L$1
            r1 = r0
            kotlinx.coroutines.z r1 = (kotlinx.coroutines.InterfaceC41781z) r1
            java.lang.Object r0 = r4.L$0
            r2 = r0
            kotlinx.coroutines.channels.o r2 = (kotlinx.coroutines.channels.InterfaceC41576o) r2
            kotlin.ResultKt.throwOnFailure(r26)     // Catch: java.lang.Throwable -> L1d kotlinx.coroutines.flow.internal.AbortFlowException -> L20
            goto L96
        L1d:
            r0 = move-exception
            goto Lbe
        L20:
            r0 = move-exception
            goto Lb7
        L23:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2b:
            kotlin.ResultKt.throwOnFailure(r26)
            java.lang.Object r0 = r4.L$0
            r10 = r0
            kotlinx.coroutines.m0 r10 = (kotlinx.coroutines.InterfaceC41709m0) r10
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1 r13 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1
            kotlinx.coroutines.flow.e<T2> r0 = r4.$flow2
            r13.<init>(r0, r9)
            r14 = 3
            r15 = 0
            r11 = 0
            r12 = 0
            kotlinx.coroutines.channels.o r1 = kotlinx.coroutines.channels.ProduceKt.m90684d(r10, r11, r12, r13, r14, r15)
            kotlinx.coroutines.z r2 = kotlinx.coroutines.C41783z1.m91396b(r9, r8, r9)
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.channels.SendChannel<*>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r0)
            r0 = r1
            kotlinx.coroutines.channels.p r0 = (kotlinx.coroutines.channels.InterfaceC41577p) r0
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$a r3 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$a
            r3.<init>(r2)
            r0.mo90591d(r3)
            kotlin.coroutines.CoroutineContext r18 = r10.getCoroutineContext()     // Catch: java.lang.Throwable -> Lb0 kotlinx.coroutines.flow.internal.AbortFlowException -> Lb3
            java.lang.Object r19 = og0.C43059h0.m94588g(r18)     // Catch: java.lang.Throwable -> Lb0 kotlinx.coroutines.flow.internal.AbortFlowException -> Lb3
            kotlin.coroutines.CoroutineContext r0 = r10.getCoroutineContext()     // Catch: java.lang.Throwable -> Lb0 kotlinx.coroutines.flow.internal.AbortFlowException -> Lb3
            kotlin.coroutines.CoroutineContext r0 = r0.plus(r2)     // Catch: java.lang.Throwable -> Lb0 kotlinx.coroutines.flow.internal.AbortFlowException -> Lb3
            r20 = r1
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> La1 kotlinx.coroutines.flow.internal.AbortFlowException -> Lab
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 r16 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2     // Catch: java.lang.Throwable -> La1 kotlinx.coroutines.flow.internal.AbortFlowException -> Lab
            kotlinx.coroutines.flow.e<T1> r3 = r4.$flow     // Catch: java.lang.Throwable -> La1 kotlinx.coroutines.flow.internal.AbortFlowException -> Lab
            kotlinx.coroutines.flow.f<R> r5 = r4.$this_unsafeFlow     // Catch: java.lang.Throwable -> La1 kotlinx.coroutines.flow.internal.AbortFlowException -> Lab
            kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r6 = r4.$transform     // Catch: java.lang.Throwable -> La1 kotlinx.coroutines.flow.internal.AbortFlowException -> Lab
            r24 = 0
            r23 = r2
            r17 = r3
            r21 = r5
            r22 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch: java.lang.Throwable -> La1 kotlinx.coroutines.flow.internal.AbortFlowException -> La5
            r11 = r20
            r10 = r23
            r4.L$0 = r11     // Catch: java.lang.Throwable -> L9a kotlinx.coroutines.flow.internal.AbortFlowException -> L9d
            r4.L$1 = r10     // Catch: java.lang.Throwable -> L9a kotlinx.coroutines.flow.internal.AbortFlowException -> L9d
            r4.label = r8     // Catch: java.lang.Throwable -> L9a kotlinx.coroutines.flow.internal.AbortFlowException -> L9d
            r2 = 0
            r5 = 4
            r6 = 0
            r3 = r16
            java.lang.Object r0 = kotlinx.coroutines.flow.internal.C41650d.m90981d(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L9a kotlinx.coroutines.flow.internal.AbortFlowException -> L9d
            if (r0 != r7) goto L95
            return r7
        L95:
            r2 = r11
        L96:
            kotlinx.coroutines.channels.InterfaceC41576o.a.m90713a(r2, r9, r8, r9)
            goto Lbb
        L9a:
            r0 = move-exception
        L9b:
            r2 = r11
            goto Lbe
        L9d:
            r0 = move-exception
        L9e:
            r1 = r10
            r2 = r11
            goto Lb7
        La1:
            r0 = move-exception
            r11 = r20
            goto L9b
        La5:
            r0 = move-exception
            r11 = r20
            r10 = r23
            goto L9e
        Lab:
            r0 = move-exception
            r10 = r2
            r11 = r20
            goto L9e
        Lb0:
            r0 = move-exception
            r11 = r1
            goto L9b
        Lb3:
            r0 = move-exception
            r11 = r1
            r10 = r2
            goto L9e
        Lb7:
            kotlinx.coroutines.flow.internal.C41654h.m90983a(r0, r1)     // Catch: java.lang.Throwable -> L1d
            goto L96
        Lbb:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        Lbe:
            kotlinx.coroutines.channels.InterfaceC41576o.a.m90713a(r2, r9, r8, r9)
            throw r0
    }
}
