package kotlinx.coroutines.flow;

import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Transform.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class FlowKt__TransformKt$runningFold$1$1<T> implements InterfaceC41635f {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref.ObjectRef<R> f91611b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Function3<R, T, Continuation<? super R>, Object> f91612c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC41635f<R> f91613d;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__TransformKt$runningFold$1$1(Ref.ObjectRef<R> objectRef, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3, InterfaceC41635f<? super R> interfaceC41635f) {
        this.f91611b = objectRef;
        this.f91612c = function3;
        this.f91613d = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        if (r7.emit((R) r8, r0) == r1) goto L22;
     */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(T t11, Continuation<? super Unit> continuation) {
        FlowKt__TransformKt$runningFold$1$1$emit$1 flowKt__TransformKt$runningFold$1$1$emit$1;
        Ref.ObjectRef objectRef;
        FlowKt__TransformKt$runningFold$1$1<T> flowKt__TransformKt$runningFold$1$1;
        if (continuation instanceof FlowKt__TransformKt$runningFold$1$1$emit$1) {
            flowKt__TransformKt$runningFold$1$1$emit$1 = (FlowKt__TransformKt$runningFold$1$1$emit$1) continuation;
            int i11 = flowKt__TransformKt$runningFold$1$1$emit$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$runningFold$1$1$emit$1.label = i11 - Integer.MIN_VALUE;
            } else {
                flowKt__TransformKt$runningFold$1$1$emit$1 = new FlowKt__TransformKt$runningFold$1$1$emit$1(this, continuation);
            }
        } else {
            flowKt__TransformKt$runningFold$1$1$emit$1 = new FlowKt__TransformKt$runningFold$1$1$emit$1(this, continuation);
        }
        Object obj = flowKt__TransformKt$runningFold$1$1$emit$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = flowKt__TransformKt$runningFold$1$1$emit$1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                objectRef = (Ref.ObjectRef) flowKt__TransformKt$runningFold$1$1$emit$1.L$1;
                flowKt__TransformKt$runningFold$1$1 = (FlowKt__TransformKt$runningFold$1$1) flowKt__TransformKt$runningFold$1$1$emit$1.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        Ref.ObjectRef objectRef2 = this.f91611b;
        Function3<R, T, Continuation<? super R>, Object> function3 = this.f91612c;
        T t12 = objectRef2.element;
        flowKt__TransformKt$runningFold$1$1$emit$1.L$0 = this;
        flowKt__TransformKt$runningFold$1$1$emit$1.L$1 = objectRef2;
        flowKt__TransformKt$runningFold$1$1$emit$1.label = 1;
        Object objInvoke = function3.invoke((R) t12, t11, flowKt__TransformKt$runningFold$1$1$emit$1);
        if (objInvoke != coroutine_suspended) {
            obj = (T) objInvoke;
            objectRef = objectRef2;
            flowKt__TransformKt$runningFold$1$1 = this;
        }
        return coroutine_suspended;
        objectRef.element = (T) obj;
        InterfaceC41635f<R> interfaceC41635f = flowKt__TransformKt$runningFold$1$1.f91613d;
        T t13 = flowKt__TransformKt$runningFold$1$1.f91611b.element;
        flowKt__TransformKt$runningFold$1$1$emit$1.L$0 = null;
        flowKt__TransformKt$runningFold$1$1$emit$1.L$1 = null;
        flowKt__TransformKt$runningFold$1$1$emit$1.label = 2;
    }
}
