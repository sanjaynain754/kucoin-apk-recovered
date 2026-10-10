package kotlinx.coroutines.flow;

import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class FlowKt__LimitKt$dropWhile$1$1<T> implements InterfaceC41635f {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref.BooleanRef f91577b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC41635f<T> f91578c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Function2<T, Continuation<? super Boolean>, Object> f91579d;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$dropWhile$1$1(Ref.BooleanRef booleanRef, InterfaceC41635f<? super T> interfaceC41635f, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        this.f91577b = booleanRef;
        this.f91578c = interfaceC41635f;
        this.f91579d = function2;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r8.emit(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r8.emit(r7, r0) == r1) goto L33;
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
        FlowKt__LimitKt$dropWhile$1$1$emit$1 flowKt__LimitKt$dropWhile$1$1$emit$1;
        FlowKt__LimitKt$dropWhile$1$1<T> flowKt__LimitKt$dropWhile$1$1;
        if (continuation instanceof FlowKt__LimitKt$dropWhile$1$1$emit$1) {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = (FlowKt__LimitKt$dropWhile$1$1$emit$1) continuation;
            int i11 = flowKt__LimitKt$dropWhile$1$1$emit$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$dropWhile$1$1$emit$1.label = i11 - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, continuation);
            }
        } else {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, continuation);
        }
        Object objInvoke = flowKt__LimitKt$dropWhile$1$1$emit$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = flowKt__LimitKt$dropWhile$1$1$emit$1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                ResultKt.throwOnFailure(objInvoke);
                return Unit.INSTANCE;
            }
            if (i12 == 2) {
                t11 = (T) flowKt__LimitKt$dropWhile$1$1$emit$1.L$1;
                flowKt__LimitKt$dropWhile$1$1 = (FlowKt__LimitKt$dropWhile$1$1) flowKt__LimitKt$dropWhile$1$1$emit$1.L$0;
                ResultKt.throwOnFailure(objInvoke);
                if (!((Boolean) objInvoke).booleanValue()) {
                    return Unit.INSTANCE;
                }
                flowKt__LimitKt$dropWhile$1$1.f91577b.element = true;
                InterfaceC41635f<T> interfaceC41635f = flowKt__LimitKt$dropWhile$1$1.f91578c;
                flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = null;
                flowKt__LimitKt$dropWhile$1$1$emit$1.L$1 = null;
                flowKt__LimitKt$dropWhile$1$1$emit$1.label = 3;
            } else {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objInvoke);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objInvoke);
        if (this.f91577b.element) {
            InterfaceC41635f<T> interfaceC41635f2 = this.f91578c;
            flowKt__LimitKt$dropWhile$1$1$emit$1.label = 1;
        } else {
            Function2<T, Continuation<? super Boolean>, Object> function2 = this.f91579d;
            flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = this;
            flowKt__LimitKt$dropWhile$1$1$emit$1.L$1 = t11;
            flowKt__LimitKt$dropWhile$1$1$emit$1.label = 2;
            objInvoke = function2.invoke(t11, flowKt__LimitKt$dropWhile$1$1$emit$1);
            if (objInvoke != coroutine_suspended) {
                flowKt__LimitKt$dropWhile$1$1 = this;
                if (!((Boolean) objInvoke).booleanValue()) {
                    return Unit.INSTANCE;
                }
                flowKt__LimitKt$dropWhile$1$1.f91577b.element = true;
                InterfaceC41635f<T> interfaceC41635f3 = flowKt__LimitKt$dropWhile$1$1.f91578c;
                flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = null;
                flowKt__LimitKt$dropWhile$1$1$emit$1.L$1 = null;
                flowKt__LimitKt$dropWhile$1$1$emit$1.label = 3;
            }
        }
        return coroutine_suspended;
    }
}
