package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.InterfaceC41574m;
import kotlinx.coroutines.flow.internal.C41658l;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {"Lkotlinx/coroutines/channels/m;", "", "", "<anonymous>", "(Lkotlinx/coroutines/channels/m;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
@DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", m90122f = "Delay.kt", m90123i = {}, m90124l = {204}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FlowKt__DelayKt$debounceInternal$1$values$1 extends SuspendLambda implements Function2<InterfaceC41574m<? super Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC41634e<T> $this_debounceInternal;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1 */
    /* JADX INFO: compiled from: Delay.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class C415971<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41574m<Object> f91560b;

        public C415971(InterfaceC41574m<Object> interfaceC41574m) {
            this.f91560b = interfaceC41574m;
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
            FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1;
            if (continuation instanceof FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) {
                flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 = (FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) continuation;
                int i11 = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.label = i11 - Integer.MIN_VALUE;
                } else {
                    flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 = new FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1(this, continuation);
                }
            } else {
                flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 = new FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1(this, continuation);
            }
            Object obj = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.label;
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC41574m<Object> interfaceC41574m = this.f91560b;
                if (t11 == null) {
                    t11 = (T) C41658l.f91700a;
                }
                flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.label = 1;
                if (interfaceC41574m.send(t11, flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) == coroutine_suspended) {
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

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41574m<? super Object> interfaceC41574m, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC41574m<Object>) interfaceC41574m, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$debounceInternal$1$values$1(InterfaceC41634e<? extends T> interfaceC41634e, Continuation<? super FlowKt__DelayKt$debounceInternal$1$values$1> continuation) {
        super(2, continuation);
        this.$this_debounceInternal = interfaceC41634e;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FlowKt__DelayKt$debounceInternal$1$values$1 flowKt__DelayKt$debounceInternal$1$values$1 = new FlowKt__DelayKt$debounceInternal$1$values$1(this.$this_debounceInternal, continuation);
        flowKt__DelayKt$debounceInternal$1$values$1.L$0 = obj;
        return flowKt__DelayKt$debounceInternal$1$values$1;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41574m<Object> interfaceC41574m, Continuation<? super Unit> continuation) {
        return ((FlowKt__DelayKt$debounceInternal$1$values$1) create(interfaceC41574m, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1 for r4v1 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            p852kotlin.ResultKt.throwOnFailure(r5)
            goto L2e
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            p852kotlin.ResultKt.throwOnFailure(r5)
            java.lang.Object r5 = r4.L$0
            kotlinx.coroutines.channels.m r5 = (kotlinx.coroutines.channels.InterfaceC41574m) r5
            kotlinx.coroutines.flow.e<T> r1 = r4.$this_debounceInternal
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1 r3 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1
            r3.<init>(r5)
            r4.label = r2
            java.lang.Object r5 = r1.collect(r3, r4)
            if (r5 != r0) goto L2e
            return r0
        L2e:
            kotlin.Unit r5 = p852kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
