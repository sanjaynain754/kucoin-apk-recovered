package kotlinx.coroutines.flow;

import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class FlowKt__LimitKt$drop$2$1<T> implements InterfaceC41635f {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref.IntRef f91574b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f91575c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC41635f<T> f91576d;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$drop$2$1(Ref.IntRef intRef, int i11, InterfaceC41635f<? super T> interfaceC41635f) {
        this.f91574b = intRef;
        this.f91575c = i11;
        this.f91576d = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(T t11, Continuation<? super Unit> continuation) {
        FlowKt__LimitKt$drop$2$1$emit$1 flowKt__LimitKt$drop$2$1$emit$1;
        if (continuation instanceof FlowKt__LimitKt$drop$2$1$emit$1) {
            flowKt__LimitKt$drop$2$1$emit$1 = (FlowKt__LimitKt$drop$2$1$emit$1) continuation;
            int i11 = flowKt__LimitKt$drop$2$1$emit$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$drop$2$1$emit$1.label = i11 - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$drop$2$1$emit$1 = new FlowKt__LimitKt$drop$2$1$emit$1(this, continuation);
            }
        } else {
            flowKt__LimitKt$drop$2$1$emit$1 = new FlowKt__LimitKt$drop$2$1$emit$1(this, continuation);
        }
        Object obj = flowKt__LimitKt$drop$2$1$emit$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = flowKt__LimitKt$drop$2$1$emit$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.IntRef intRef = this.f91574b;
            int i13 = intRef.element;
            if (i13 < this.f91575c) {
                intRef.element = i13 + 1;
                return Unit.INSTANCE;
            }
            InterfaceC41635f<T> interfaceC41635f = this.f91576d;
            flowKt__LimitKt$drop$2$1$emit$1.label = 1;
            if (interfaceC41635f.emit(t11, flowKt__LimitKt$drop$2$1$emit$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
