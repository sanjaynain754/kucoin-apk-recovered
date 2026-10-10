package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.SafeCollector;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.InlineMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"kotlinx/coroutines/flow/FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,108:1\n143#2,13:109\n156#2,6:123\n375#3:122\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n155#1:122\n*E\n"})
public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1<T> implements InterfaceC41634e<T> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC41634e f91562b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Function3 f91563c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", m90122f = "Emitters.kt", m90123i = {0, 0, 1, 2}, m90124l = {110, 117, 124}, m90125m = "collect", m90126n = {"this", "$this$onCompletion_u24lambda_u242", "e", "sc"}, m90127s = {"L$0", "L$1", "L$0", "L$0"})
    public static final class C415991 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C415991(Continuation continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(InterfaceC41634e interfaceC41634e, Function3 function3) {
        this.f91562b = interfaceC41634e;
        this.f91563c = function3;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41634e
    public Object collect(InterfaceC41635f<? super T> interfaceC41635f, Continuation<? super Unit> continuation) throws Throwable {
        C415991 c415991;
        FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1<T> flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
        C41681z c41681z;
        Function3 function3;
        SafeCollector safeCollector;
        Throwable th2;
        SafeCollector safeCollector2;
        Object objInvoke;
        if (continuation instanceof C415991) {
            c415991 = (C415991) continuation;
            int i11 = c415991.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c415991.label = i11 - Integer.MIN_VALUE;
            } else {
                c415991 = new C415991(continuation);
            }
        } else {
            c415991 = new C415991(continuation);
        }
        Object obj = c415991.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c415991.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                InterfaceC41634e interfaceC41634e = this.f91562b;
                c415991.L$0 = this;
                c415991.L$1 = interfaceC41635f;
                c415991.label = 1;
                if (interfaceC41634e.collect(interfaceC41635f, c415991) != coroutine_suspended) {
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = this;
                    safeCollector = new SafeCollector(interfaceC41635f, c415991.getContext());
                    Function3 function4 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f91563c;
                    c415991.L$0 = safeCollector;
                    c415991.L$1 = null;
                    c415991.label = 3;
                    InlineMarker.mark(6);
                    objInvoke = function4.invoke(safeCollector, null, c415991);
                    InlineMarker.mark(7);
                    if (objInvoke != coroutine_suspended) {
                        safeCollector2 = safeCollector;
                        safeCollector2.releaseIntercepted();
                        return Unit.INSTANCE;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = this;
                c41681z = new C41681z(th);
                function3 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f91563c;
                c415991.L$0 = th;
                c415991.L$1 = null;
                c415991.label = 2;
                if (FlowKt__EmittersKt.m90773c(c41681z, function3, th, c415991) == coroutine_suspended) {
                    throw th;
                }
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                Throwable th4 = (Throwable) c415991.L$0;
                ResultKt.throwOnFailure(obj);
                throw th4;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            safeCollector2 = (SafeCollector) c415991.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                safeCollector2.releaseIntercepted();
                return Unit.INSTANCE;
            } catch (Throwable th5) {
                th2 = th5;
                safeCollector2.releaseIntercepted();
                throw th2;
            }
        }
        interfaceC41635f = (InterfaceC41635f) c415991.L$1;
        flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = (FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1) c415991.L$0;
        try {
            ResultKt.throwOnFailure(obj);
            safeCollector = new SafeCollector(interfaceC41635f, c415991.getContext());
            try {
                Function3 function5 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f91563c;
                c415991.L$0 = safeCollector;
                c415991.L$1 = null;
                c415991.label = 3;
                InlineMarker.mark(6);
                objInvoke = function5.invoke(safeCollector, null, c415991);
                InlineMarker.mark(7);
                if (objInvoke != coroutine_suspended) {
                    safeCollector2 = safeCollector;
                    safeCollector2.releaseIntercepted();
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            } catch (Throwable th6) {
                th2 = th6;
                safeCollector2 = safeCollector;
                safeCollector2.releaseIntercepted();
                throw th2;
            }
        } catch (Throwable th7) {
            th = th7;
            c41681z = new C41681z(th);
            function3 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f91563c;
            c415991.L$0 = th;
            c415991.L$1 = null;
            c415991.label = 2;
            if (FlowKt__EmittersKt.m90773c(c41681z, function3, th, c415991) == coroutine_suspended) {
                throw th;
            }
        }
    }
}
