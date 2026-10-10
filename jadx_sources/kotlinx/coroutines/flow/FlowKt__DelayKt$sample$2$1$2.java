package kotlinx.coroutines.flow;

import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", m90122f = "Delay.kt", m90123i = {}, m90124l = {293}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$2\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,407:1\n14#2:408\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$2\n*L\n293#1:408\n*E\n"})
public final class FlowKt__DelayKt$sample$2$1$2 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC41635f<T> $downstream;
    final /* synthetic */ Ref.ObjectRef<Object> $lastValue;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$sample$2$1$2(Ref.ObjectRef<Object> objectRef, InterfaceC41635f<? super T> interfaceC41635f, Continuation<? super FlowKt__DelayKt$sample$2$1$2> continuation) {
        super(2, continuation);
        this.$lastValue = objectRef;
        this.$downstream = interfaceC41635f;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlowKt__DelayKt$sample$2$1$2(this.$lastValue, this.$downstream, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((FlowKt__DelayKt$sample$2$1$2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2 for r5v1 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            p852kotlin.ResultKt.throwOnFailure(r6)
            goto L36
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            p852kotlin.ResultKt.throwOnFailure(r6)
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r6 = r5.$lastValue
            T r1 = r6.element
            if (r1 != 0) goto L23
            kotlin.Unit r6 = p852kotlin.Unit.INSTANCE
            return r6
        L23:
            r3 = 0
            r6.element = r3
            kotlinx.coroutines.flow.f<T> r6 = r5.$downstream
            og0.a0 r4 = kotlinx.coroutines.flow.internal.C41658l.f91700a
            if (r1 != r4) goto L2d
            r1 = r3
        L2d:
            r5.label = r2
            java.lang.Object r6 = r6.emit(r1, r5)
            if (r6 != r0) goto L36
            return r0
        L36:
            kotlin.Unit r6 = p852kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
