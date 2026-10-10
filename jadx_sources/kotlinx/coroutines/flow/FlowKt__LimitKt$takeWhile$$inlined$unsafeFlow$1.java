package kotlinx.coroutines.flow;

import kotlinx.coroutines.C41783z1;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.C41654h;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,108:1\n83#2:109\n124#2,17:110\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n83#1:110,17\n*E\n"})
public final class FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1<T> implements InterfaceC41634e<T> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC41634e f91586b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Function2 f91587c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", m90122f = "Limit.kt", m90123i = {0}, m90124l = {120}, m90125m = "collect", m90126n = {"collector$iv"}, m90127s = {"L$0"})
    public static final class C416051 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C416051(Continuation continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(InterfaceC41634e interfaceC41634e, Function2 function2) {
        this.f91586b = interfaceC41634e;
        this.f91587c = function2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41634e
    public Object collect(InterfaceC41635f<? super T> interfaceC41635f, Continuation<? super Unit> continuation) {
        C416051 c416051;
        FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1;
        if (continuation instanceof C416051) {
            c416051 = (C416051) continuation;
            int i11 = c416051.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c416051.label = i11 - Integer.MIN_VALUE;
            } else {
                c416051 = new C416051(continuation);
            }
        } else {
            c416051 = new C416051(continuation);
        }
        Object obj = c416051.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c416051.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e interfaceC41634e = this.f91586b;
            FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$2 = new FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1(this.f91587c, interfaceC41635f);
            try {
                c416051.L$0 = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$2;
                c416051.label = 1;
                if (interfaceC41634e.collect(flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$2, c416051) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (AbortFlowException e11) {
                e = e11;
                flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$2;
                C41654h.m90983a(e, flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1);
                C41783z1.m91406l(c416051.getContext());
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = (FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1) c416051.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (AbortFlowException e12) {
                e = e12;
                C41654h.m90983a(e, flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1);
                C41783z1.m91406l(c416051.getContext());
            }
        }
        return Unit.INSTANCE;
    }
}
