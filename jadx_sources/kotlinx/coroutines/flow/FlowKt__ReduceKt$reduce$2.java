package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.C41658l;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Reduce.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class FlowKt__ReduceKt$reduce$2<T> implements InterfaceC41635f {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref.ObjectRef<Object> f91598b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Function3<S, T, Continuation<? super S>, Object> f91599c;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ReduceKt$reduce$2(Ref.ObjectRef<Object> objectRef, Function3<? super S, ? super T, ? super Continuation<? super S>, ? extends Object> function3) {
        this.f91598b = objectRef;
        this.f91599c = function3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(T t11, Continuation<? super Unit> continuation) {
        FlowKt__ReduceKt$reduce$2$emit$1 flowKt__ReduceKt$reduce$2$emit$1;
        Ref.ObjectRef<Object> objectRef;
        Ref.ObjectRef<Object> objectRef2;
        if (continuation instanceof FlowKt__ReduceKt$reduce$2$emit$1) {
            flowKt__ReduceKt$reduce$2$emit$1 = (FlowKt__ReduceKt$reduce$2$emit$1) continuation;
            int i11 = flowKt__ReduceKt$reduce$2$emit$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$reduce$2$emit$1.label = i11 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$reduce$2$emit$1 = new FlowKt__ReduceKt$reduce$2$emit$1(this, continuation);
            }
        } else {
            flowKt__ReduceKt$reduce$2$emit$1 = new FlowKt__ReduceKt$reduce$2$emit$1(this, continuation);
        }
        Object obj = flowKt__ReduceKt$reduce$2$emit$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = flowKt__ReduceKt$reduce$2$emit$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            objectRef = this.f91598b;
            Object obj2 = objectRef.element;
            if (obj2 != C41658l.f91700a) {
                Function3<S, T, Continuation<? super S>, Object> function3 = this.f91599c;
                flowKt__ReduceKt$reduce$2$emit$1.L$0 = objectRef;
                flowKt__ReduceKt$reduce$2$emit$1.label = 1;
                Object objInvoke = function3.invoke((S) obj2, t11, flowKt__ReduceKt$reduce$2$emit$1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = objInvoke;
                objectRef2 = objectRef;
            }
            objectRef.element = t11;
            return Unit.INSTANCE;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objectRef2 = (Ref.ObjectRef) flowKt__ReduceKt$reduce$2$emit$1.L$0;
        ResultKt.throwOnFailure(obj);
        Object obj3 = obj;
        objectRef = objectRef2;
        t11 = (T) obj3;
        objectRef.element = t11;
        return Unit.INSTANCE;
    }
}
