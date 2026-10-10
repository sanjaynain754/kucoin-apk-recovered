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
public final class FlowKt__LimitKt$take$2$1<T> implements InterfaceC41635f {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref.IntRef f91582b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f91583c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC41635f<T> f91584d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f91585e;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$take$2$1(Ref.IntRef intRef, int i11, InterfaceC41635f<? super T> interfaceC41635f, Object obj) {
        this.f91582b = intRef;
        this.f91583c = i11;
        this.f91584d = interfaceC41635f;
        this.f91585e = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r7.emit(r6, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt__LimitKt.m90783d(r7, r6, r2, r0) == r1) goto L25;
     */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(T t11, Continuation<? super Unit> continuation) {
        FlowKt__LimitKt$take$2$1$emit$1 flowKt__LimitKt$take$2$1$emit$1;
        if (continuation instanceof FlowKt__LimitKt$take$2$1$emit$1) {
            flowKt__LimitKt$take$2$1$emit$1 = (FlowKt__LimitKt$take$2$1$emit$1) continuation;
            int i11 = flowKt__LimitKt$take$2$1$emit$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$take$2$1$emit$1.label = i11 - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$take$2$1$emit$1 = new FlowKt__LimitKt$take$2$1$emit$1(this, continuation);
            }
        } else {
            flowKt__LimitKt$take$2$1$emit$1 = new FlowKt__LimitKt$take$2$1$emit$1(this, continuation);
        }
        Object obj = flowKt__LimitKt$take$2$1$emit$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = flowKt__LimitKt$take$2$1$emit$1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        Ref.IntRef intRef = this.f91582b;
        int i13 = intRef.element + 1;
        intRef.element = i13;
        if (i13 < this.f91583c) {
            InterfaceC41635f<T> interfaceC41635f = this.f91584d;
            flowKt__LimitKt$take$2$1$emit$1.label = 1;
        } else {
            InterfaceC41635f<T> interfaceC41635f2 = this.f91584d;
            Object obj2 = this.f91585e;
            flowKt__LimitKt$take$2$1$emit$1.label = 2;
        }
        return coroutine_suspended;
    }
}
