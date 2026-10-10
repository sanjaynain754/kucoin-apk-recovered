package repayment.ext;

/* JADX INFO: compiled from: RepayFragmentExt.kt */
/* JADX INFO: loaded from: classes61.dex */
@kotlin.Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "repayment.ext.RepayFragmentExtKt$collectEvent$1$1", m90122f = "RepayFragmentExt.kt", m90123i = {0, 1}, m90124l = {110, 120}, m90125m = "emit", m90126n = {"it", "it"}, m90127s = {"L$0", "L$0"})
public final class RepayFragmentExtKt$collectEvent$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ repayment.ext.RepayFragmentExtKt$collectEvent$1.C440311<T> this$0;

    public RepayFragmentExtKt$collectEvent$1$1$emit$1(repayment.ext.RepayFragmentExtKt$collectEvent$1.C440311<? super T> r1, kotlin.coroutines.Continuation<? super repayment.ext.RepayFragmentExtKt$collectEvent$1$1$emit$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>(r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r2) {
            r1 = this;
            r1.result = r2
            int r2 = r1.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.label = r2
            repayment.ext.RepayFragmentExtKt$collectEvent$1$1<T> r2 = r1.this$0
            r0 = 0
            java.lang.Object r2 = r2.m97099a(r0, r1)
            return r2
    }
}
