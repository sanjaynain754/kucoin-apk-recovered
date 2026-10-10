package kotlinx.coroutines.rx2;

/* JADX INFO: compiled from: RxConvert.kt */
/* JADX INFO: loaded from: classes23.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1", m90122f = "RxConvert.kt", m90123i = {0}, m90124l = {110}, m90125m = "invokeSuspend", m90126n = {"$this$launch"}, m90127s = {"L$0"})
public final class RxConvertKt$asObservable$1$job$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.reactivex.ObservableEmitter<T> $emitter;
    final /* synthetic */ kotlinx.coroutines.flow.InterfaceC41634e<T> $this_asObservable;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1$a */
    /* JADX INFO: compiled from: RxConvert.kt */
    @kotlin.Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class C41733a<T> implements kotlinx.coroutines.flow.InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ io.reactivex.ObservableEmitter<T> f91781b;

        public C41733a(io.reactivex.ObservableEmitter<T> r1) {
                r0 = this;
                r0.f91781b = r1
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        public final java.lang.Object emit(T r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                io.reactivex.ObservableEmitter<T> r2 = r0.f91781b
                r2.onNext(r1)
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }
    }

    public RxConvertKt$asObservable$1$job$1(kotlinx.coroutines.flow.InterfaceC41634e<? extends T> r1, io.reactivex.ObservableEmitter<T> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1> r3) {
            r0 = this;
            r0.$this_asObservable = r1
            r0.$emitter = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
            r3 = this;
            kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1 r0 = new kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1
            kotlinx.coroutines.flow.e<T> r1 = r3.$this_asObservable
            io.reactivex.ObservableEmitter<T> r2 = r3.$emitter
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
            kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1 r1 = (kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r0 = r6.L$0
            kotlinx.coroutines.m0 r0 = (kotlinx.coroutines.InterfaceC41709m0) r0
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L13
            goto L39
        L13:
            r7 = move-exception
            goto L43
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.L$0
            kotlinx.coroutines.m0 r7 = (kotlinx.coroutines.InterfaceC41709m0) r7
            kotlinx.coroutines.flow.e<T> r1 = r6.$this_asObservable     // Catch: java.lang.Throwable -> L3f
            kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1$a r3 = new kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1$a     // Catch: java.lang.Throwable -> L3f
            io.reactivex.ObservableEmitter<T> r4 = r6.$emitter     // Catch: java.lang.Throwable -> L3f
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3f
            r6.L$0 = r7     // Catch: java.lang.Throwable -> L3f
            r6.label = r2     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r1 = r1.collect(r3, r6)     // Catch: java.lang.Throwable -> L3f
            if (r1 != r0) goto L38
            return r0
        L38:
            r0 = r7
        L39:
            io.reactivex.ObservableEmitter<T> r7 = r6.$emitter     // Catch: java.lang.Throwable -> L13
            r7.onComplete()     // Catch: java.lang.Throwable -> L13
            goto L5c
        L3f:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L43:
            boolean r1 = r7 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto L57
            io.reactivex.ObservableEmitter<T> r1 = r6.$emitter
            boolean r1 = r1.tryOnError(r7)
            if (r1 != 0) goto L5c
            kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
            kotlinx.coroutines.rx2.C41736c.m91216a(r7, r0)
            goto L5c
        L57:
            io.reactivex.ObservableEmitter<T> r7 = r6.$emitter
            r7.onComplete()
        L5c:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
    }
}
