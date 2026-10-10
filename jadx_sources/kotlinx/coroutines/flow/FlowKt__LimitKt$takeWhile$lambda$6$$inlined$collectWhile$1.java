package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.AbortFlowException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.InlineMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", "Lkotlinx/coroutines/flow/f;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,131:1\n84#2,6:132\n*E\n"})
public final class FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1<T> implements InterfaceC41635f<T> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function2 f91588b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC41635f f91589c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", m90122f = "Limit.kt", m90123i = {0, 0, 1}, m90124l = {132, 133}, m90125m = "emit", m90126n = {"this", "value", "this"}, m90127s = {"L$0", "L$1", "L$0"})
    public static final class C416061 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C416061(Continuation continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1.this.emit(null, this);
        }
    }

    public FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1(Function2 function2, InterfaceC41635f interfaceC41635f) {
        this.f91588b = function2;
        this.f91589c = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(T t11, Continuation<? super Unit> continuation) {
        C416061 c416061;
        Object obj;
        Object obj2;
        FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1<T> flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1;
        if (continuation instanceof C416061) {
            c416061 = (C416061) continuation;
            int i11 = c416061.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c416061.label = i11 - Integer.MIN_VALUE;
            } else {
                c416061 = new C416061(continuation);
            }
        } else {
            c416061 = new C416061(continuation);
        }
        Object obj3 = c416061.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c416061.label;
        boolean z11 = true;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj3);
            Function2 function2 = this.f91588b;
            c416061.L$0 = this;
            c416061.L$1 = t11;
            c416061.label = 1;
            InlineMarker.mark(6);
            Object objInvoke = function2.invoke(t11, c416061);
            InlineMarker.mark(7);
            if (objInvoke != coroutine_suspended) {
                obj = objInvoke;
                obj2 = t11;
                flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = this;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            Object obj4 = c416061.L$1;
            FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1<T> flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$2 = (FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1) c416061.L$0;
            ResultKt.throwOnFailure(obj3);
            obj2 = obj4;
            flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$2;
            obj = obj3;
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = (FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1) c416061.L$0;
            ResultKt.throwOnFailure(obj3);
        }
        if (z11) {
            return Unit.INSTANCE;
        }
        throw new AbortFlowException(flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1);
        if (((Boolean) obj).booleanValue()) {
            InterfaceC41635f interfaceC41635f = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1.f91589c;
            c416061.L$0 = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1;
            c416061.L$1 = null;
            c416061.label = 2;
        } else {
            z11 = false;
        }
        if (z11) {
            return Unit.INSTANCE;
        }
        throw new AbortFlowException(flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1);
    }
}
