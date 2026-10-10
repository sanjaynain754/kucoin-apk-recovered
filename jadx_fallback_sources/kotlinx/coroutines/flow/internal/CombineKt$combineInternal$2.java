package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: Combine.kt */
/* JADX INFO: loaded from: classes23.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", m90122f = "Combine.kt", m90123i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, m90124l = {51, 73, 76}, m90125m = "invokeSuspend", m90126n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, m90127s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
public final class CombineKt$combineInternal$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<T[]> $arrayFactory;
    final /* synthetic */ kotlinx.coroutines.flow.InterfaceC41634e<T>[] $flows;
    final /* synthetic */ kotlinx.coroutines.flow.InterfaceC41635f<R> $this_combineInternal;
    final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.InterfaceC41635f<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $transform;
    int I$0;
    int I$1;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1 */
    /* JADX INFO: compiled from: Combine.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", m90122f = "Combine.kt", m90123i = {}, m90124l = {28}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C416421 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.InterfaceC41634e<T>[] $flows;

        /* JADX INFO: renamed from: $i */
        final /* synthetic */ int f91674$i;
        final /* synthetic */ java.util.concurrent.atomic.AtomicInteger $nonClosed;
        final /* synthetic */ kotlinx.coroutines.channels.InterfaceC41565d<kotlin.collections.IndexedValue<java.lang.Object>> $resultChannel;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: Combine.kt */
        @kotlin.Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
        public static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ kotlinx.coroutines.channels.InterfaceC41565d<kotlin.collections.IndexedValue<java.lang.Object>> f91675b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f91676c;

            public AnonymousClass1(kotlinx.coroutines.channels.InterfaceC41565d<kotlin.collections.IndexedValue<java.lang.Object>> r1, int r2) {
                    r0 = this;
                    r0.f91675b = r1
                    r0.f91676c = r2
                    r0.<init>()
                    return
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public final java.lang.Object emit(T r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                    r0.<init>(r6, r8)
                L18:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L38
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.ResultKt.throwOnFailure(r8)
                    goto L56
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    kotlin.ResultKt.throwOnFailure(r8)
                    goto L4d
                L38:
                    kotlin.ResultKt.throwOnFailure(r8)
                    kotlinx.coroutines.channels.d<kotlin.collections.IndexedValue<java.lang.Object>> r8 = r6.f91675b
                    kotlin.collections.IndexedValue r2 = new kotlin.collections.IndexedValue
                    int r5 = r6.f91676c
                    r2.<init>(r5, r7)
                    r0.label = r4
                    java.lang.Object r7 = r8.send(r2, r0)
                    if (r7 != r1) goto L4d
                    goto L55
                L4d:
                    r0.label = r3
                    java.lang.Object r7 = kotlinx.coroutines.C41552b3.m90496a(r0)
                    if (r7 != r1) goto L56
                L55:
                    return r1
                L56:
                    kotlin.Unit r7 = kotlin.Unit.INSTANCE
                    return r7
            }
        }

        public C416421(kotlinx.coroutines.flow.InterfaceC41634e<? extends T>[] r1, int r2, java.util.concurrent.atomic.AtomicInteger r3, kotlinx.coroutines.channels.InterfaceC41565d<kotlin.collections.IndexedValue<java.lang.Object>> r4, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.C416421> r5) {
                r0 = this;
                r0.$flows = r1
                r0.f91674$i = r2
                r0.$nonClosed = r3
                r0.$resultChannel = r4
                r1 = 2
                r0.<init>(r1, r5)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r7, kotlin.coroutines.Continuation<?> r8) {
                r6 = this;
                kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1
                kotlinx.coroutines.flow.e<T>[] r1 = r6.$flows
                int r2 = r6.f91674$i
                java.util.concurrent.atomic.AtomicInteger r3 = r6.$nonClosed
                kotlinx.coroutines.channels.d<kotlin.collections.IndexedValue<java.lang.Object>> r4 = r6.$resultChannel
                r5 = r8
                r0.<init>(r1, r2, r3, r4, r5)
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
                kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1 r1 = (kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.C416421) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.label
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L1a
                if (r1 != r3) goto L12
                kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L10
                goto L33
            L10:
                r7 = move-exception
                goto L43
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                kotlin.ResultKt.throwOnFailure(r7)
                kotlinx.coroutines.flow.e<T>[] r7 = r6.$flows     // Catch: java.lang.Throwable -> L10
                int r1 = r6.f91674$i     // Catch: java.lang.Throwable -> L10
                r7 = r7[r1]     // Catch: java.lang.Throwable -> L10
                kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1 r4 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1     // Catch: java.lang.Throwable -> L10
                kotlinx.coroutines.channels.d<kotlin.collections.IndexedValue<java.lang.Object>> r5 = r6.$resultChannel     // Catch: java.lang.Throwable -> L10
                r4.<init>(r5, r1)     // Catch: java.lang.Throwable -> L10
                r6.label = r3     // Catch: java.lang.Throwable -> L10
                java.lang.Object r7 = r7.collect(r4, r6)     // Catch: java.lang.Throwable -> L10
                if (r7 != r0) goto L33
                return r0
            L33:
                java.util.concurrent.atomic.AtomicInteger r7 = r6.$nonClosed
                int r7 = r7.decrementAndGet()
                if (r7 != 0) goto L40
                kotlinx.coroutines.channels.d<kotlin.collections.IndexedValue<java.lang.Object>> r7 = r6.$resultChannel
                kotlinx.coroutines.channels.InterfaceC41577p.a.m90714a(r7, r2, r3, r2)
            L40:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            L43:
                java.util.concurrent.atomic.AtomicInteger r0 = r6.$nonClosed
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto L50
                kotlinx.coroutines.channels.d<kotlin.collections.IndexedValue<java.lang.Object>> r0 = r6.$resultChannel
                kotlinx.coroutines.channels.InterfaceC41577p.a.m90714a(r0, r2, r3, r2)
            L50:
                throw r7
        }
    }

    public CombineKt$combineInternal$2(kotlinx.coroutines.flow.InterfaceC41634e<? extends T>[] r1, kotlin.jvm.functions.Function0<T[]> r2, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.InterfaceC41635f<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r3, kotlinx.coroutines.flow.InterfaceC41635f<? super R> r4, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2> r5) {
            r0 = this;
            r0.$flows = r1
            r0.$arrayFactory = r2
            r0.$transform = r3
            r0.$this_combineInternal = r4
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r7, kotlin.coroutines.Continuation<?> r8) {
            r6 = this;
            kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2 r0 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2
            kotlinx.coroutines.flow.e<T>[] r1 = r6.$flows
            kotlin.jvm.functions.Function0<T[]> r2 = r6.$arrayFactory
            kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.f<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r3 = r6.$transform
            kotlinx.coroutines.flow.f<R> r4 = r6.$this_combineInternal
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
            kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2 r1 = (kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            r21 = this;
            r0 = r21
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4e
            if (r2 == r5) goto L31
            if (r2 == r4) goto L1c
            if (r2 != r3) goto L14
            goto L1c
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1c:
            int r2 = r0.I$1
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$2
            byte[] r7 = (byte[]) r7
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.d r8 = (kotlinx.coroutines.channels.InterfaceC41565d) r8
            java.lang.Object r9 = r0.L$0
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            kotlin.ResultKt.throwOnFailure(r22)
            goto L129
        L31:
            int r2 = r0.I$1
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$2
            byte[] r7 = (byte[]) r7
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.d r8 = (kotlinx.coroutines.channels.InterfaceC41565d) r8
            java.lang.Object r9 = r0.L$0
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            kotlin.ResultKt.throwOnFailure(r22)
            r10 = r22
            kotlinx.coroutines.channels.ChannelResult r10 = (kotlinx.coroutines.channels.ChannelResult) r10
            java.lang.Object r10 = r10.m90679l()
            goto Lb6
        L4e:
            kotlin.ResultKt.throwOnFailure(r22)
            java.lang.Object r2 = r0.L$0
            r6 = r2
            kotlinx.coroutines.m0 r6 = (kotlinx.coroutines.InterfaceC41709m0) r6
            kotlinx.coroutines.flow.e<T>[] r2 = r0.$flows
            int r2 = r2.length
            if (r2 != 0) goto L5e
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L5e:
            java.lang.Object[] r7 = new java.lang.Object[r2]
            og0.a0 r8 = kotlinx.coroutines.flow.internal.C41658l.f91701b
            r11 = 6
            r12 = 0
            r9 = 0
            r10 = 0
            kotlin.collections.ArraysKt.fill$default(r7, r8, r9, r10, r11, r12)
            r12 = r7
            r7 = 6
            r8 = 0
            kotlinx.coroutines.channels.d r17 = kotlinx.coroutines.channels.C41568g.m90691b(r2, r8, r8, r7, r8)
            java.util.concurrent.atomic.AtomicInteger r7 = new java.util.concurrent.atomic.AtomicInteger
            r7.<init>(r2)
            r19 = 0
            r15 = r19
        L79:
            if (r15 >= r2) goto L93
            kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1 r9 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1
            kotlinx.coroutines.flow.e<T>[] r14 = r0.$flows
            r18 = 0
            r16 = r7
            r13 = r9
            r13.<init>(r14, r15, r16, r17, r18)
            r10 = 3
            r11 = 0
            r7 = 0
            r8 = 0
            kotlinx.coroutines.C41686h.m91046d(r6, r7, r8, r9, r10, r11)
            int r15 = r15 + 1
            r7 = r16
            goto L79
        L93:
            byte[] r6 = new byte[r2]
            r7 = r12
            r8 = r17
        L98:
            int r9 = r19 + 1
            byte r9 = (byte) r9
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r6
            r0.I$0 = r2
            r0.I$1 = r9
            r0.label = r5
            java.lang.Object r10 = r8.mo90611p(r0)
            if (r10 != r1) goto Laf
            goto L128
        Laf:
            r20 = r6
            r6 = r2
            r2 = r9
            r9 = r7
            r7 = r20
        Lb6:
            java.lang.Object r10 = kotlinx.coroutines.channels.ChannelResult.m90673f(r10)
            kotlin.collections.IndexedValue r10 = (kotlin.collections.IndexedValue) r10
            if (r10 != 0) goto Lc1
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        Lc1:
            int r11 = r10.getIndex()
            r12 = r9[r11]
            java.lang.Object r10 = r10.getValue()
            r9[r11] = r10
            og0.a0 r10 = kotlinx.coroutines.flow.internal.C41658l.f91701b
            if (r12 != r10) goto Ld3
            int r6 = r6 + (-1)
        Ld3:
            r10 = r7[r11]
            if (r10 == r2) goto Le6
            byte r10 = (byte) r2
            r7[r11] = r10
            java.lang.Object r10 = r8.mo90609o()
            java.lang.Object r10 = kotlinx.coroutines.channels.ChannelResult.m90673f(r10)
            kotlin.collections.IndexedValue r10 = (kotlin.collections.IndexedValue) r10
            if (r10 != 0) goto Lc1
        Le6:
            if (r6 != 0) goto L129
            kotlin.jvm.functions.Function0<T[]> r10 = r0.$arrayFactory
            java.lang.Object r10 = r10.invoke()
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            if (r10 != 0) goto L109
            kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.f<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r10 = r0.$transform
            kotlinx.coroutines.flow.f<R> r11 = r0.$this_combineInternal
            r0.L$0 = r9
            r0.L$1 = r8
            r0.L$2 = r7
            r0.I$0 = r6
            r0.I$1 = r2
            r0.label = r4
            java.lang.Object r10 = r10.invoke(r11, r9, r0)
            if (r10 != r1) goto L129
            goto L128
        L109:
            r14 = 14
            r15 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            kotlin.collections.ArraysKt.copyInto$default(r9, r10, r11, r12, r13, r14, r15)
            kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.f<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r11 = r0.$transform
            kotlinx.coroutines.flow.f<R> r12 = r0.$this_combineInternal
            r0.L$0 = r9
            r0.L$1 = r8
            r0.L$2 = r7
            r0.I$0 = r6
            r0.I$1 = r2
            r0.label = r3
            java.lang.Object r10 = r11.invoke(r12, r10, r0)
            if (r10 != r1) goto L129
        L128:
            return r1
        L129:
            r19 = r2
            r2 = r6
            r6 = r7
            r7 = r9
            goto L98
    }
}
