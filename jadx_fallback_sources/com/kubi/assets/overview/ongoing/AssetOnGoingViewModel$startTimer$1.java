package com.kubi.assets.overview.ongoing;

/* JADX INFO: compiled from: AssetOnGoingViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1", m90122f = "AssetOnGoingViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AssetOnGoingViewModel$startTimer$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ com.kubi.assets.overview.ongoing.AssetOnGoingViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1$1 */
    /* JADX INFO: compiled from: AssetOnGoingViewModel.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1$1", m90122f = "AssetOnGoingViewModel.kt", m90123i = {0, 1}, m90124l = {407, 408}, m90125m = "invokeSuspend", m90126n = {"$this$flow", "$this$flow"}, m90127s = {"L$0", "L$0"})
    public static final class C107531 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.InterfaceC41635f<? super kotlin.Unit>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        private /* synthetic */ java.lang.Object L$0;
        int label;

        public C107531(kotlin.coroutines.Continuation<? super com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1.C107531> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r2, kotlin.coroutines.Continuation<?> r3) {
                r1 = this;
                com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1$1 r0 = new com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1$1
                r0.<init>(r3)
                r0.L$0 = r2
                return r0
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.InterfaceC41635f<? super kotlin.Unit> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.InterfaceC41635f) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlinx.coroutines.flow.InterfaceC41635f<? super kotlin.Unit> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1$1 r1 = (com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1.C107531) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                r7 = this;
                java.lang.Object r0 = r7.L$0
                kotlinx.coroutines.flow.f r0 = (kotlinx.coroutines.flow.InterfaceC41635f) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
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
                kotlin.ResultKt.throwOnFailure(r8)
                goto L2f
            L1f:
                kotlin.ResultKt.throwOnFailure(r8)
            L22:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                r7.L$0 = r0
                r7.label = r4
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L2f
                goto L3b
            L2f:
                r7.L$0 = r0
                r7.label = r3
                r5 = 15000(0x3a98, double:7.411E-320)
                java.lang.Object r8 = kotlinx.coroutines.DelayKt.m90350b(r5, r7)
                if (r8 != r1) goto L22
            L3b:
                return r1
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1$2 */
    /* JADX INFO: compiled from: AssetOnGoingViewModel.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "", "it"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1$2", m90122f = "AssetOnGoingViewModel.kt", m90123i = {}, m90124l = {411}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C107542 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Unit, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int label;
        final /* synthetic */ com.kubi.assets.overview.ongoing.AssetOnGoingViewModel this$0;

        public C107542(com.kubi.assets.overview.ongoing.AssetOnGoingViewModel r1, kotlin.coroutines.Continuation<? super com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1.C107542> r2) {
                r0 = this;
                r0.this$0 = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r2, kotlin.coroutines.Continuation<?> r3) {
                r1 = this;
                com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1$2 r2 = new com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1$2
                com.kubi.assets.overview.ongoing.AssetOnGoingViewModel r0 = r1.this$0
                r2.<init>(r0, r3)
                return r2
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
                com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1$2 r1 = (com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1.C107542) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                r3 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r3.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r4)
                goto L26
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.ResultKt.throwOnFailure(r4)
                com.kubi.assets.overview.ongoing.AssetOnGoingViewModel r4 = r3.this$0
                r3.label = r2
                r1 = 0
                java.lang.Object r4 = com.kubi.assets.overview.ongoing.AssetOnGoingViewModel.m18721t(r4, r1, r3)
                if (r4 != r0) goto L26
                return r0
            L26:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
        }
    }

    public AssetOnGoingViewModel$startTimer$1(com.kubi.assets.overview.ongoing.AssetOnGoingViewModel r1, kotlin.coroutines.Continuation<? super com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r2, kotlin.coroutines.Continuation<?> r3) {
            r1 = this;
            com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1 r2 = new com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1
            com.kubi.assets.overview.ongoing.AssetOnGoingViewModel r0 = r1.this$0
            r2.<init>(r0, r3)
            return r2
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
            com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1 r1 = (com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            r3 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r3.label
            if (r0 != 0) goto L2b
            kotlin.ResultKt.throwOnFailure(r4)
            com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1$1 r4 = new com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1$1
            r0 = 0
            r4.<init>(r0)
            kotlinx.coroutines.flow.e r4 = kotlinx.coroutines.flow.C41636g.m90887K(r4)
            com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1$2 r1 = new com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$startTimer$1$2
            com.kubi.assets.overview.ongoing.AssetOnGoingViewModel r2 = r3.this$0
            r1.<init>(r2, r0)
            kotlinx.coroutines.flow.e r4 = kotlinx.coroutines.flow.C41636g.m90896T(r4, r1)
            com.kubi.assets.overview.ongoing.AssetOnGoingViewModel r0 = r3.this$0
            lb.f r0 = com.kubi.assets.overview.ongoing.AssetOnGoingViewModel.m18719r(r0)
            kotlinx.coroutines.flow.C41636g.m90891O(r4, r0)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
    }
}
