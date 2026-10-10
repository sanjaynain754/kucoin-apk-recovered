package kotlinx.coroutines.rx2;

import io.reactivex.ObservableEmitter;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: RxConvert.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
@DebugMetadata(m90121c = "kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1", m90122f = "RxConvert.kt", m90123i = {0}, m90124l = {110}, m90125m = "invokeSuspend", m90126n = {"$this$launch"}, m90127s = {"L$0"})
public final class RxConvertKt$asObservable$1$job$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ ObservableEmitter<T> $emitter;
    final /* synthetic */ InterfaceC41634e<T> $this_asObservable;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1$a */
    /* JADX INFO: compiled from: RxConvert.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class C41733a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ObservableEmitter<T> f91781b;

        public C41733a(ObservableEmitter<T> observableEmitter) {
            this.f91781b = observableEmitter;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        public final Object emit(T t11, Continuation<? super Unit> continuation) {
            this.f91781b.onNext(t11);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RxConvertKt$asObservable$1$job$1(InterfaceC41634e<? extends T> interfaceC41634e, ObservableEmitter<T> observableEmitter, Continuation<? super RxConvertKt$asObservable$1$job$1> continuation) {
        super(2, continuation);
        this.$this_asObservable = interfaceC41634e;
        this.$emitter = observableEmitter;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RxConvertKt$asObservable$1$job$1 rxConvertKt$asObservable$1$job$1 = new RxConvertKt$asObservable$1$job$1(this.$this_asObservable, this.$emitter, continuation);
        rxConvertKt$asObservable$1$job$1.L$0 = obj;
        return rxConvertKt$asObservable$1$job$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((RxConvertKt$asObservable$1$job$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1 for r6v1 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r0 = r6.L$0
            kotlinx.coroutines.m0 r0 = (kotlinx.coroutines.InterfaceC41709m0) r0
            p852kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L13
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
            p852kotlin.ResultKt.throwOnFailure(r7)
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
            kotlin.coroutines.CoroutineContext r0 = r0.getF93592b()
            kotlinx.coroutines.rx2.C41736c.m91216a(r7, r0)
            goto L5c
        L57:
            io.reactivex.ObservableEmitter<T> r7 = r6.$emitter
            r7.onComplete()
        L5c:
            kotlin.Unit r7 = p852kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
