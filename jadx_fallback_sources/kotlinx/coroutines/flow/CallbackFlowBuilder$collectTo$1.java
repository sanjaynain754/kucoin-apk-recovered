package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes23.dex */
@kotlin.Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "kotlinx.coroutines.flow.CallbackFlowBuilder", m90122f = "Builders.kt", m90123i = {0}, m90124l = {330}, m90125m = "collectTo", m90126n = {"scope"}, m90127s = {"L$0"})
public final class CallbackFlowBuilder$collectTo$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ kotlinx.coroutines.flow.CallbackFlowBuilder<T> this$0;

    public CallbackFlowBuilder$collectTo$1(kotlinx.coroutines.flow.CallbackFlowBuilder<T> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>(r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
            r1 = this;
            r1.result = r2
            int r2 = r1.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.label = r2
            kotlinx.coroutines.flow.CallbackFlowBuilder<T> r2 = r1.this$0
            r0 = 0
            java.lang.Object r2 = r2.mo90741h(r0, r1)
            return r2
    }
}
