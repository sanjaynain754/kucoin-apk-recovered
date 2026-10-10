package kotlinx.coroutines.flow;

import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"kotlinx/coroutines/flow/FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,108:1\n102#2,7:109\n*E\n"})
public final class FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1<R> implements InterfaceC41634e<R> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f91608b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC41634e f91609c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Function3 f91610d;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", m90122f = "Transform.kt", m90123i = {0, 0, 0}, m90124l = {110, 111}, m90125m = "collect", m90126n = {"this", "$this$runningFold_u24lambda_u249", "accumulator"}, m90127s = {"L$0", "L$1", "L$2"})
    public static final class C416171 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C416171(Continuation continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1(Object obj, InterfaceC41634e interfaceC41634e, Function3 function3) {
        this.f91608b = obj;
        this.f91609c = interfaceC41634e;
        this.f91610d = function3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (r8.collect(r5, r0) == r1) goto L22;
     */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
    @Override // kotlinx.coroutines.flow.InterfaceC41634e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(InterfaceC41635f<? super R> interfaceC41635f, Continuation<? super Unit> continuation) {
        C416171 c416171;
        FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1<R> flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1;
        InterfaceC41635f interfaceC41635f2;
        Ref.ObjectRef objectRef;
        if (continuation instanceof C416171) {
            c416171 = (C416171) continuation;
            int i11 = c416171.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c416171.label = i11 - Integer.MIN_VALUE;
            } else {
                c416171 = new C416171(continuation);
            }
        } else {
            c416171 = new C416171(continuation);
        }
        Object obj = c416171.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c416171.label;
        if (i12 != 0) {
            if (i12 == 1) {
                objectRef = (Ref.ObjectRef) c416171.L$2;
                InterfaceC41635f interfaceC41635f3 = (InterfaceC41635f) c416171.L$1;
                flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 = (FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1) c416171.L$0;
                ResultKt.throwOnFailure(obj);
                interfaceC41635f2 = interfaceC41635f3;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        ?? r11 = this.f91608b;
        objectRef2.element = r11;
        c416171.L$0 = this;
        c416171.L$1 = interfaceC41635f;
        c416171.L$2 = objectRef2;
        c416171.label = 1;
        if (interfaceC41635f.emit(r11, c416171) != coroutine_suspended) {
            flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 = this;
            interfaceC41635f2 = interfaceC41635f;
            objectRef = objectRef2;
        }
        return coroutine_suspended;
        InterfaceC41634e interfaceC41634e = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.f91609c;
        FlowKt__TransformKt$runningFold$1$1 flowKt__TransformKt$runningFold$1$1 = new FlowKt__TransformKt$runningFold$1$1(objectRef, flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.f91610d, interfaceC41635f2);
        c416171.L$0 = null;
        c416171.L$1 = null;
        c416171.L$2 = null;
        c416171.label = 2;
    }
}
