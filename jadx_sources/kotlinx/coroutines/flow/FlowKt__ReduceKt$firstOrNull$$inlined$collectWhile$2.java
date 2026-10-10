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
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"kotlinx/coroutines/flow/FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", "Lkotlinx/coroutines/flow/f;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,131:1\n134#2,6:132\n*E\n"})
public final class FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2<T> implements InterfaceC41635f<T> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function2 f91596b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Ref.ObjectRef f91597c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", m90122f = "Reduce.kt", m90123i = {0, 0}, m90124l = {132}, m90125m = "emit", m90126n = {"this", "it"}, m90127s = {"L$0", "L$1"})
    public static final class C416111 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C416111(Continuation continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2.this.emit(null, this);
        }
    }

    public FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2(Function2 function2, Ref.ObjectRef objectRef) {
        this.f91596b = function2;
        this.f91597c = objectRef;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public Object emit(T t11, Continuation<? super Unit> continuation) {
        C416111 c416111;
        FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2<T> flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
        if (continuation instanceof C416111) {
            c416111 = (C416111) continuation;
            int i11 = c416111.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c416111.label = i11 - Integer.MIN_VALUE;
            } else {
                c416111 = new C416111(continuation);
            }
        } else {
            c416111 = new C416111(continuation);
        }
        Object objInvoke = c416111.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c416111.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            Function2 function2 = this.f91596b;
            c416111.L$0 = this;
            c416111.L$1 = t11;
            c416111.label = 1;
            InlineMarker.mark(6);
            objInvoke = function2.invoke(t11, c416111);
            InlineMarker.mark(7);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t11 = (T) c416111.L$1;
            flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) c416111.L$0;
            ResultKt.throwOnFailure(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Unit.INSTANCE;
        }
        flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2.f91597c.element = t11;
        throw new AbortFlowException(flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2);
    }
}
