package com.kubi.core.biz.callauction.mvi;

/* JADX INFO: compiled from: CallAuctionViewModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1", m90122f = "CallAuctionViewModel.kt", m90123i = {}, m90124l = {288}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class CallAuctionViewModel$countDown$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.internal.Ref.LongRef $cycleCount;
    final /* synthetic */ kotlin.jvm.internal.Ref.LongRef $delayTime;
    final /* synthetic */ kotlin.jvm.internal.Ref.LongRef $firstTime;
    final /* synthetic */ long $remainSec;
    final /* synthetic */ long $timeInterval;
    int label;
    final /* synthetic */ com.kubi.core.biz.callauction.mvi.CallAuctionViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1$1 */
    /* JADX INFO: compiled from: CallAuctionViewModel.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1$1", m90122f = "CallAuctionViewModel.kt", m90123i = {0, 0, 1, 1}, m90124l = {254, 259}, m90125m = "invokeSuspend", m90126n = {"$this$flow", "num", "$this$flow", "num"}, m90127s = {"L$0", "J$0", "L$0", "J$0"})
    public static final class C118251 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.InterfaceC41635f<? super java.lang.Long>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.internal.Ref.LongRef $cycleCount;
        final /* synthetic */ kotlin.jvm.internal.Ref.LongRef $delayTime;
        final /* synthetic */ kotlin.jvm.internal.Ref.LongRef $firstTime;
        final /* synthetic */ long $remainSec;
        final /* synthetic */ long $timeInterval;
        long J$0;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        public C118251(long r1, kotlin.jvm.internal.Ref.LongRef r3, kotlin.jvm.internal.Ref.LongRef r4, kotlin.jvm.internal.Ref.LongRef r5, long r6, kotlin.coroutines.Continuation<? super com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1.C118251> r8) {
                r0 = this;
                r0.$remainSec = r1
                r0.$cycleCount = r3
                r0.$firstTime = r4
                r0.$delayTime = r5
                r0.$timeInterval = r6
                r1 = 2
                r0.<init>(r1, r8)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r10, kotlin.coroutines.Continuation<?> r11) {
                r9 = this;
                com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1$1 r0 = new com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1$1
                long r1 = r9.$remainSec
                kotlin.jvm.internal.Ref$LongRef r3 = r9.$cycleCount
                kotlin.jvm.internal.Ref$LongRef r4 = r9.$firstTime
                kotlin.jvm.internal.Ref$LongRef r5 = r9.$delayTime
                long r6 = r9.$timeInterval
                r8 = r11
                r0.<init>(r1, r3, r4, r5, r6, r8)
                r0.L$0 = r10
                return r0
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.InterfaceC41635f<? super java.lang.Long> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.InterfaceC41635f) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlinx.coroutines.flow.InterfaceC41635f<? super java.lang.Long> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1$1 r1 = (com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1.C118251) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
                r18 = this;
                r0 = r18
                java.lang.Object r1 = r0.L$0
                kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.InterfaceC41635f) r1
                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r0.label
                r4 = -1
                r6 = 2
                r7 = 1
                if (r3 == 0) goto L2c
                if (r3 == r7) goto L26
                if (r3 != r6) goto L1e
                long r8 = r0.J$0
                kotlin.ResultKt.throwOnFailure(r19)
                r16 = r4
                goto L8b
            L1e:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L26:
                long r8 = r0.J$0
                kotlin.ResultKt.throwOnFailure(r19)
                goto L4f
            L2c:
                kotlin.ResultKt.throwOnFailure(r19)
                long r8 = r0.$remainSec
            L31:
                int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r3 >= 0) goto L90
                kotlin.jvm.internal.Ref$LongRef r3 = r0.$cycleCount
                long r10 = r3.element
                r12 = 1
                long r10 = r10 + r12
                r3.element = r10
                java.lang.Long r3 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r8)
                r0.L$0 = r1
                r0.J$0 = r8
                r0.label = r7
                java.lang.Object r3 = r1.emit(r3, r0)
                if (r3 != r2) goto L4f
                goto L8a
            L4f:
                kotlin.jvm.internal.Ref$LongRef r3 = r0.$firstTime
                long r10 = r3.element
                r12 = 0
                int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r10 != 0) goto L5f
                long r10 = java.lang.System.currentTimeMillis()
                r3.element = r10
            L5f:
                kotlin.jvm.internal.Ref$LongRef r3 = r0.$delayTime
                kotlin.jvm.internal.Ref$LongRef r10 = r0.$cycleCount
                long r10 = r10.element
                long r14 = r0.$timeInterval
                long r10 = r10 * r14
                long r14 = java.lang.System.currentTimeMillis()
                r16 = r4
                kotlin.jvm.internal.Ref$LongRef r4 = r0.$firstTime
                long r4 = r4.element
                long r14 = r14 - r4
                long r10 = r10 - r14
                r3.element = r10
                int r3 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r3 == 0) goto L8b
                kotlin.jvm.internal.Ref$LongRef r3 = r0.$delayTime
                long r3 = r3.element
                r0.L$0 = r1
                r0.J$0 = r8
                r0.label = r6
                java.lang.Object r3 = kotlinx.coroutines.DelayKt.m90350b(r3, r0)
                if (r3 != r2) goto L8b
            L8a:
                return r2
            L8b:
                long r8 = r8 + r16
                r4 = r16
                goto L31
            L90:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1$2 */
    /* JADX INFO: compiled from: CallAuctionViewModel.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1$2", m90122f = "CallAuctionViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C118262 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Long, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ long J$0;
        int label;
        final /* synthetic */ com.kubi.core.biz.callauction.mvi.CallAuctionViewModel this$0;

        public C118262(com.kubi.core.biz.callauction.mvi.CallAuctionViewModel r1, kotlin.coroutines.Continuation<? super com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1.C118262> r2) {
                r0 = this;
                r0.this$0 = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ com.kubi.core.biz.callauction.mvi.CallAuctionContract$UIState m21678a(java.lang.String r0, com.kubi.core.biz.callauction.mvi.CallAuctionContract$UIState r1) {
                com.kubi.core.biz.callauction.mvi.CallAuctionContract$UIState r0 = m21679f(r0, r1)
                return r0
        }

        /* JADX INFO: renamed from: f */
        public static final com.kubi.core.biz.callauction.mvi.CallAuctionContract$UIState m21679f(java.lang.String r9, com.kubi.core.biz.callauction.mvi.CallAuctionContract$UIState r10) {
                r7 = 55
                r8 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r5 = 0
                r6 = 0
                r4 = r9
                r0 = r10
                com.kubi.core.biz.callauction.mvi.CallAuctionContract$UIState r9 = com.kubi.core.biz.callauction.mvi.CallAuctionContract$UIState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1$2 r0 = new com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1$2
                com.kubi.core.biz.callauction.mvi.CallAuctionViewModel r1 = r2.this$0
                r0.<init>(r1, r4)
                java.lang.Number r3 = (java.lang.Number) r3
                long r3 = r3.longValue()
                r0.J$0 = r3
                return r0
        }

        public final java.lang.Object invoke(long r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                kotlin.coroutines.Continuation r1 = r0.create(r1, r3)
                com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1$2 r1 = (com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1.C118262) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Long r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                java.lang.Number r3 = (java.lang.Number) r3
                long r0 = r3.longValue()
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                java.lang.Object r3 = r2.invoke(r0, r4)
                return r3
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                r4 = this;
                long r0 = r4.J$0
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r4.label
                if (r2 != 0) goto L21
                kotlin.ResultKt.throwOnFailure(r5)
                r5 = 1000(0x3e8, float:1.401E-42)
                long r2 = (long) r5
                long r0 = r0 * r2
                java.lang.String r5 = com.kubi.core.utils.C12465d.m23405a(r0)
                com.kubi.core.biz.callauction.mvi.CallAuctionViewModel r0 = r4.this$0
                com.kubi.core.biz.callauction.mvi.e r1 = new com.kubi.core.biz.callauction.mvi.e
                r1.<init>(r5)
                com.kubi.core.biz.callauction.mvi.CallAuctionViewModel.m21663v(r0, r1)
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L21:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1$3 */
    /* JADX INFO: compiled from: CallAuctionViewModel.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "error", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1$3", m90122f = "CallAuctionViewModel.kt", m90123i = {0, 1, 2, 3, 4, 5}, m90124l = {269, 271, 274, 276, 279, 281}, m90125m = "invokeSuspend", m90126n = {"error", "error", "error", "error", "error", "error"}, m90127s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$0"})
    public static final class C118273 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.InterfaceC41635f<? super java.lang.Long>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ java.lang.Object L$0;
        int label;
        final /* synthetic */ com.kubi.core.biz.callauction.mvi.CallAuctionViewModel this$0;

        public C118273(com.kubi.core.biz.callauction.mvi.CallAuctionViewModel r1, kotlin.coroutines.Continuation<? super com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1.C118273> r2) {
                r0 = this;
                r0.this$0 = r1
                r1 = 3
                r0.<init>(r1, r2)
                return
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.InterfaceC41635f<? super java.lang.Long> r1, java.lang.Throwable r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r0 = this;
                kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.InterfaceC41635f) r1
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r1 = r0.invoke2(r1, r2, r3)
                return r1
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlinx.coroutines.flow.InterfaceC41635f<? super java.lang.Long> r2, java.lang.Throwable r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r1 = this;
                com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1$3 r2 = new com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1$3
                com.kubi.core.biz.callauction.mvi.CallAuctionViewModel r0 = r1.this$0
                r2.<init>(r0, r4)
                r2.L$0 = r3
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                java.lang.Object r2 = r2.invokeSuspend(r3)
                return r2
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                r9 = this;
                java.lang.Object r0 = r9.L$0
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r9.label
                r3 = 0
                r4 = 0
                r5 = 1
                java.lang.String r6 = "CallAuctionViewModel"
                switch(r2) {
                    case 0: goto L2c;
                    case 1: goto L28;
                    case 2: goto L23;
                    case 3: goto L1f;
                    case 4: goto L23;
                    case 5: goto L1a;
                    case 6: goto L23;
                    default: goto L12;
                }
            L12:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1a:
                kotlin.ResultKt.throwOnFailure(r10)
                goto Lc6
            L1f:
                kotlin.ResultKt.throwOnFailure(r10)
                goto L8f
            L23:
                kotlin.ResultKt.throwOnFailure(r10)
                goto Ldd
            L28:
                kotlin.ResultKt.throwOnFailure(r10)
                goto L58
            L2c:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.String r10 = "倒计时结束"
                ve.C45518a.m100507a(r10, r6)
                if (r0 != 0) goto Ldd
                com.kubi.core.biz.callauction.mvi.CallAuctionViewModel r10 = r9.this$0
                com.kubi.mvi.state.f r10 = r10.getState()
                com.kubi.core.biz.callauction.mvi.CallAuctionContract$UIState r10 = (com.kubi.core.biz.callauction.mvi.CallAuctionContract$UIState) r10
                com.kubi.core.biz.callauction.mvi.CallAuctionContract$Phase r10 = r10.getPhase()
                com.kubi.core.biz.callauction.mvi.CallAuctionContract$Phase r2 = com.kubi.core.biz.callauction.mvi.CallAuctionContract$Phase.Phase1
                r7 = 1000(0x3e8, double:4.94E-321)
                if (r10 != r2) goto L6f
                java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
                r9.L$0 = r10
                r9.label = r5
                java.lang.Object r10 = kotlinx.coroutines.DelayKt.m90350b(r7, r9)
                if (r10 != r1) goto L58
                goto Ldc
            L58:
                java.lang.String r10 = "第一阶段倒计时结束"
                ve.C45518a.m100507a(r10, r6)
                com.kubi.core.biz.callauction.mvi.CallAuctionViewModel r10 = r9.this$0
                java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
                r9.L$0 = r0
                r0 = 2
                r9.label = r0
                java.lang.Object r10 = com.kubi.core.biz.callauction.mvi.CallAuctionViewModel.m21659r(r10, r9)
                if (r10 != r1) goto Ldd
                goto Ldc
            L6f:
                com.kubi.core.biz.callauction.mvi.CallAuctionViewModel r10 = r9.this$0
                com.kubi.mvi.state.f r10 = r10.getState()
                com.kubi.core.biz.callauction.mvi.CallAuctionContract$UIState r10 = (com.kubi.core.biz.callauction.mvi.CallAuctionContract$UIState) r10
                com.kubi.core.biz.callauction.mvi.CallAuctionContract$Phase r10 = r10.getPhase()
                com.kubi.core.biz.callauction.mvi.CallAuctionContract$Phase r2 = com.kubi.core.biz.callauction.mvi.CallAuctionContract$Phase.Phase2
                if (r10 != r2) goto La6
                java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
                r9.L$0 = r10
                r10 = 3
                r9.label = r10
                java.lang.Object r10 = kotlinx.coroutines.DelayKt.m90350b(r7, r9)
                if (r10 != r1) goto L8f
                goto Ldc
            L8f:
                java.lang.String r10 = "第二阶段倒计时结束"
                ve.C45518a.m100507a(r10, r6)
                com.kubi.core.biz.callauction.mvi.CallAuctionViewModel r10 = r9.this$0
                java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
                r9.L$0 = r0
                r0 = 4
                r9.label = r0
                java.lang.Object r10 = com.kubi.core.biz.callauction.mvi.CallAuctionViewModel.m21650I(r10, r4, r9, r5, r3)
                if (r10 != r1) goto Ldd
                goto Ldc
            La6:
                com.kubi.core.biz.callauction.mvi.CallAuctionViewModel r10 = r9.this$0
                com.kubi.mvi.state.f r10 = r10.getState()
                com.kubi.core.biz.callauction.mvi.CallAuctionContract$UIState r10 = (com.kubi.core.biz.callauction.mvi.CallAuctionContract$UIState) r10
                com.kubi.core.biz.callauction.mvi.CallAuctionContract$Phase r10 = r10.getPhase()
                com.kubi.core.biz.callauction.mvi.CallAuctionContract$Phase r2 = com.kubi.core.biz.callauction.mvi.CallAuctionContract$Phase.Phase3
                if (r10 != r2) goto Ldd
                java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
                r9.L$0 = r10
                r10 = 5
                r9.label = r10
                java.lang.Object r10 = kotlinx.coroutines.DelayKt.m90350b(r7, r9)
                if (r10 != r1) goto Lc6
                goto Ldc
            Lc6:
                java.lang.String r10 = "第三阶段倒计时结束"
                ve.C45518a.m100507a(r10, r6)
                com.kubi.core.biz.callauction.mvi.CallAuctionViewModel r10 = r9.this$0
                java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
                r9.L$0 = r0
                r0 = 6
                r9.label = r0
                java.lang.Object r10 = com.kubi.core.biz.callauction.mvi.CallAuctionViewModel.m21650I(r10, r4, r9, r5, r3)
                if (r10 != r1) goto Ldd
            Ldc:
                return r1
            Ldd:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1$4 */
    /* JADX INFO: compiled from: CallAuctionViewModel.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "exception", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1$4", m90122f = "CallAuctionViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCallAuctionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallAuctionViewModel.kt\ncom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$countDown$1$4\n+ 2 SpotIssue.kt\ncom/kubi/core/spot/exeption/SpotIssueKt\n*L\n1#1,332:1\n55#2,2:333\n*S KotlinDebug\n*F\n+ 1 CallAuctionViewModel.kt\ncom/kubi/core/biz/callauction/mvi/CallAuctionViewModel$countDown$1$4\n*L\n286#1:333,2\n*E\n"})
    public static final class C118284 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.InterfaceC41635f<? super java.lang.Long>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ java.lang.Object L$0;
        int label;

        public C118284(kotlin.coroutines.Continuation<? super com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1.C118284> r2) {
                r1 = this;
                r0 = 3
                r1.<init>(r0, r2)
                return
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.InterfaceC41635f<? super java.lang.Long> r1, java.lang.Throwable r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r0 = this;
                kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.InterfaceC41635f) r1
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r1 = r0.invoke2(r1, r2, r3)
                return r1
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlinx.coroutines.flow.InterfaceC41635f<? super java.lang.Long> r1, java.lang.Throwable r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r0 = this;
                com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1$4 r1 = new com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1$4
                r1.<init>(r3)
                r1.L$0 = r2
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                r8 = this;
                java.lang.Object r0 = r8.L$0
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.label
                if (r1 != 0) goto L2f
                kotlin.ResultKt.throwOnFailure(r9)
                java.lang.String r3 = r0.getMessage()
                if (r3 == 0) goto L2c
                java.lang.Class<com.kubi.core.biz.callauction.mvi.CallAuctionViewModel> r9 = com.kubi.core.biz.callauction.mvi.CallAuctionViewModel.class
                java.lang.String r4 = r9.getSimpleName()
                java.lang.String r9 = "getSimpleName(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r9)
                com.kubi.core.spot.exeption.SpotMessage r2 = new com.kubi.core.spot.exeption.SpotMessage
                r6 = 4
                r7 = 0
                r5 = 0
                r2.<init>(r3, r4, r5, r6, r7)
                r9 = 2
                r0 = 0
                p569qq.C43846g.m96568c(r2, r0, r9, r0)
            L2c:
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
            L2f:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
        }
    }

    public CallAuctionViewModel$countDown$1(long r1, kotlin.jvm.internal.Ref.LongRef r3, kotlin.jvm.internal.Ref.LongRef r4, kotlin.jvm.internal.Ref.LongRef r5, long r6, com.kubi.core.biz.callauction.mvi.CallAuctionViewModel r8, kotlin.coroutines.Continuation<? super com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1> r9) {
            r0 = this;
            r0.$remainSec = r1
            r0.$cycleCount = r3
            r0.$firstTime = r4
            r0.$delayTime = r5
            r0.$timeInterval = r6
            r0.this$0 = r8
            r1 = 2
            r0.<init>(r1, r9)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r11, kotlin.coroutines.Continuation<?> r12) {
            r10 = this;
            com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1 r0 = new com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1
            long r1 = r10.$remainSec
            kotlin.jvm.internal.Ref$LongRef r3 = r10.$cycleCount
            kotlin.jvm.internal.Ref$LongRef r4 = r10.$firstTime
            kotlin.jvm.internal.Ref$LongRef r5 = r10.$delayTime
            long r6 = r10.$timeInterval
            com.kubi.core.biz.callauction.mvi.CallAuctionViewModel r8 = r10.this$0
            r9 = r12
            r0.<init>(r1, r3, r4, r5, r6, r8, r9)
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
            com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1 r1 = (com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r13)
            goto L5f
        Lf:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L17:
            kotlin.ResultKt.throwOnFailure(r13)
            com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1$1 r3 = new com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1$1
            long r4 = r12.$remainSec
            kotlin.jvm.internal.Ref$LongRef r6 = r12.$cycleCount
            kotlin.jvm.internal.Ref$LongRef r7 = r12.$firstTime
            kotlin.jvm.internal.Ref$LongRef r8 = r12.$delayTime
            long r9 = r12.$timeInterval
            r11 = 0
            r3.<init>(r4, r6, r7, r8, r9, r11)
            kotlinx.coroutines.flow.e r13 = kotlinx.coroutines.flow.C41636g.m90887K(r3)
            kotlinx.coroutines.j0 r1 = o00.C42911a.m94120b()
            kotlinx.coroutines.flow.e r13 = kotlinx.coroutines.flow.C41636g.m90890N(r13, r1)
            com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1$2 r1 = new com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1$2
            com.kubi.core.biz.callauction.mvi.CallAuctionViewModel r3 = r12.this$0
            r4 = 0
            r1.<init>(r3, r4)
            kotlinx.coroutines.flow.e r13 = kotlinx.coroutines.flow.C41636g.m90896T(r13, r1)
            com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1$3 r1 = new com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1$3
            com.kubi.core.biz.callauction.mvi.CallAuctionViewModel r3 = r12.this$0
            r1.<init>(r3, r4)
            kotlinx.coroutines.flow.e r13 = kotlinx.coroutines.flow.C41636g.m90895S(r13, r1)
            com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1$4 r1 = new com.kubi.core.biz.callauction.mvi.CallAuctionViewModel$countDown$1$4
            r1.<init>(r4)
            kotlinx.coroutines.flow.e r13 = kotlinx.coroutines.flow.C41636g.m90917h(r13, r1)
            r12.label = r2
            java.lang.Object r13 = kotlinx.coroutines.flow.C41636g.m90923k(r13, r12)
            if (r13 != r0) goto L5f
            return r0
        L5f:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
    }
}
