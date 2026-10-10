package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.C41658l;
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
public final class FlowKt__TransformKt$runningReduce$1$1<T> implements InterfaceC41635f {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref.ObjectRef<Object> f91614b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Function3<T, T, Continuation<? super T>, Object> f91615c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC41635f<T> f91616d;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__TransformKt$runningReduce$1$1(Ref.ObjectRef<Object> objectRef, Function3<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> function3, InterfaceC41635f<? super T> interfaceC41635f) {
        this.f91614b = objectRef;
        this.f91615c = function3;
        this.f91616d = interfaceC41635f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r8.emit(r9, r0) == r1) goto L26;
     */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(T t11, Continuation<? super Unit> continuation) {
        FlowKt__TransformKt$runningReduce$1$1$emit$1 flowKt__TransformKt$runningReduce$1$1$emit$1;
        Ref.ObjectRef<Object> objectRef;
        Ref.ObjectRef<Object> objectRef2;
        FlowKt__TransformKt$runningReduce$1$1<T> flowKt__TransformKt$runningReduce$1$1;
        if (continuation instanceof FlowKt__TransformKt$runningReduce$1$1$emit$1) {
            flowKt__TransformKt$runningReduce$1$1$emit$1 = (FlowKt__TransformKt$runningReduce$1$1$emit$1) continuation;
            int i11 = flowKt__TransformKt$runningReduce$1$1$emit$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$runningReduce$1$1$emit$1.label = i11 - Integer.MIN_VALUE;
            } else {
                flowKt__TransformKt$runningReduce$1$1$emit$1 = new FlowKt__TransformKt$runningReduce$1$1$emit$1(this, continuation);
            }
        } else {
            flowKt__TransformKt$runningReduce$1$1$emit$1 = new FlowKt__TransformKt$runningReduce$1$1$emit$1(this, continuation);
        }
        Object obj = flowKt__TransformKt$runningReduce$1$1$emit$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = flowKt__TransformKt$runningReduce$1$1$emit$1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                objectRef2 = (Ref.ObjectRef) flowKt__TransformKt$runningReduce$1$1$emit$1.L$1;
                flowKt__TransformKt$runningReduce$1$1 = (FlowKt__TransformKt$runningReduce$1$1) flowKt__TransformKt$runningReduce$1$1$emit$1.L$0;
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
        objectRef = this.f91614b;
        Object obj2 = objectRef.element;
        if (obj2 == C41658l.f91700a) {
            flowKt__TransformKt$runningReduce$1$1 = this;
            objectRef.element = t11;
            InterfaceC41635f<T> interfaceC41635f = flowKt__TransformKt$runningReduce$1$1.f91616d;
            T t12 = flowKt__TransformKt$runningReduce$1$1.f91614b.element;
            flowKt__TransformKt$runningReduce$1$1$emit$1.L$0 = null;
            flowKt__TransformKt$runningReduce$1$1$emit$1.L$1 = null;
            flowKt__TransformKt$runningReduce$1$1$emit$1.label = 2;
        } else {
            Function3<T, T, Continuation<? super T>, Object> function3 = this.f91615c;
            flowKt__TransformKt$runningReduce$1$1$emit$1.L$0 = this;
            flowKt__TransformKt$runningReduce$1$1$emit$1.L$1 = objectRef;
            flowKt__TransformKt$runningReduce$1$1$emit$1.label = 1;
            Object objInvoke = function3.invoke((T) obj2, t11, flowKt__TransformKt$runningReduce$1$1$emit$1);
            if (objInvoke != coroutine_suspended) {
                obj = objInvoke;
                objectRef2 = objectRef;
                flowKt__TransformKt$runningReduce$1$1 = this;
            }
        }
        return coroutine_suspended;
        Object obj3 = obj;
        objectRef = objectRef2;
        t11 = (T) obj3;
        objectRef.element = t11;
        InterfaceC41635f<T> interfaceC41635f2 = flowKt__TransformKt$runningReduce$1$1.f91616d;
        T t13 = flowKt__TransformKt$runningReduce$1$1.f91614b.element;
        flowKt__TransformKt$runningReduce$1$1$emit$1.L$0 = null;
        flowKt__TransformKt$runningReduce$1$1$emit$1.L$1 = null;
        flowKt__TransformKt$runningReduce$1$1$emit$1.label = 2;
    }
}
