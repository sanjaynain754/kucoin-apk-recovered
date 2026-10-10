package repayment;

/* JADX INFO: compiled from: RepayVM.kt */
/* JADX INFO: loaded from: classes61.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "repayment.RepayVM$startFetch$1", m90122f = "RepayVM.kt", m90123i = {}, m90124l = {220}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRepayVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepayVM.kt\nrepayment/RepayVM$startFetch$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,228:1\n25#2:229\n26#2:231\n1#3:230\n*S KotlinDebug\n*F\n+ 1 RepayVM.kt\nrepayment/RepayVM$startFetch$1\n*L\n222#1:229\n222#1:231\n222#1:230\n*E\n"})
public final class RepayVM$startFetch$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> $failedCall;
    final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $successCall;
    final /* synthetic */ kotlinx.coroutines.flow.InterfaceC41634e<T> $this_startFetch;
    int label;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: repayment.RepayVM$startFetch$1$1 */
    /* JADX INFO: compiled from: RepayVM.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n"}, m90084d2 = {"<anonymous>", "", "T", "it"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "repayment.RepayVM$startFetch$1$1", m90122f = "RepayVM.kt", m90123i = {0}, m90124l = {221}, m90125m = "invokeSuspend", m90126n = {"it"}, m90127s = {"L$0"})
    public static final class C440011<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $successCall;
        /* synthetic */ java.lang.Object L$0;
        int label;

        public C440011(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1, kotlin.coroutines.Continuation<? super repayment.RepayVM$startFetch$1.C440011> r2) {
                r0 = this;
                r0.$successCall = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                repayment.RepayVM$startFetch$1$1 r0 = new repayment.RepayVM$startFetch$1$1
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r2.$successCall
                r0.<init>(r1, r4)
                r0.L$0 = r3
                return r0
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(T r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                repayment.RepayVM$startFetch$1$1 r1 = (repayment.RepayVM$startFetch$1.C440011) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                r4 = this;
                java.lang.Object r0 = r4.L$0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r4.label
                r3 = 1
                if (r2 == 0) goto L19
                if (r2 != r3) goto L11
                kotlin.ResultKt.throwOnFailure(r5)
                goto L2d
            L11:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L19:
                kotlin.ResultKt.throwOnFailure(r5)
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r5 = r4.$successCall
                java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
                r4.L$0 = r2
                r4.label = r3
                java.lang.Object r5 = r5.invoke(r0, r4)
                if (r5 != r1) goto L2d
                return r1
            L2d:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
        }
    }

    public RepayVM$startFetch$1(kotlinx.coroutines.flow.InterfaceC41634e<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3, kotlin.coroutines.Continuation<? super repayment.RepayVM$startFetch$1> r4) {
            r0 = this;
            r0.$this_startFetch = r1
            r0.$successCall = r2
            r0.$failedCall = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
            r3 = this;
            repayment.RepayVM$startFetch$1 r4 = new repayment.RepayVM$startFetch$1
            kotlinx.coroutines.flow.e<T> r0 = r3.$this_startFetch
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r3.$successCall
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r2 = r3.$failedCall
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
            repayment.RepayVM$startFetch$1 r1 = (repayment.RepayVM$startFetch$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r6)
            goto L2e
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.flow.e<T> r6 = r5.$this_startFetch
            repayment.RepayVM$startFetch$1$1 r1 = new repayment.RepayVM$startFetch$1$1
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r3 = r5.$successCall
            r4 = 0
            r1.<init>(r3, r4)
            r5.label = r2
            r2 = 0
            java.lang.Object r6 = com.kubi.network.retrofit.utils.RetrofitFlowExKt.m42823d(r6, r2, r1, r5)
            if (r6 != r0) goto L2e
            return r0
        L2e:
            com.kubi.network.retrofit.utils.f r6 = (com.kubi.network.retrofit.utils.C19334f) r6
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r0 = r5.$failedCall
            java.lang.Throwable r6 = r6.m42847b()
            if (r6 == 0) goto L3e
            r0.invoke(r6)
            r6.printStackTrace()
        L3e:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
    }
}
