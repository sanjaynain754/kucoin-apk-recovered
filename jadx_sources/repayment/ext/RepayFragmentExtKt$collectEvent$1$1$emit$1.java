package repayment.ext;

import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: RepayFragmentExt.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "repayment.ext.RepayFragmentExtKt$collectEvent$1$1", m90122f = "RepayFragmentExt.kt", m90123i = {0, 1}, m90124l = {110, 120}, m90125m = "emit", m90126n = {"it", "it"}, m90127s = {"L$0", "L$0"})
public final class RepayFragmentExtKt$collectEvent$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RepayFragmentExtKt$collectEvent$1.C440311<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepayFragmentExtKt$collectEvent$1$1$emit$1(RepayFragmentExtKt$collectEvent$1.C440311<? super T> c440311, Continuation<? super RepayFragmentExtKt$collectEvent$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = c440311;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to repayment.ext.RepayFragmentExtKt$collectEvent$1$1$emit$1 for r1v1 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r2) {
        /*
            r1 = this;
            r1.result = r2
            int r2 = r1.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.label = r2
            repayment.ext.RepayFragmentExtKt$collectEvent$1$1<T> r2 = r1.this$0
            r0 = 0
            java.lang.Object r2 = r2.emit(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: repayment.ext.RepayFragmentExtKt$collectEvent$1$1$emit$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
