package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes23.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", m90122f = "Delay.kt", m90123i = {}, m90124l = {226}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$1\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,407:1\n14#2:408\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$1\n*L\n226#1:408\n*E\n"})
public final class FlowKt__DelayKt$debounceInternal$1$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.InterfaceC41635f<T> $downstream;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> $lastValue;
    int label;

    public FlowKt__DelayKt$debounceInternal$1$3$1(kotlinx.coroutines.flow.InterfaceC41635f<? super T> r1, kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1> r3) {
            r0 = this;
            r0.$downstream = r1
            r0.$lastValue = r2
            r1 = 1
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> r4) {
            r3 = this;
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1
            kotlinx.coroutines.flow.f<T> r1 = r3.$downstream
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r2 = r3.$lastValue
            r0.<init>(r1, r2, r4)
            return r0
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> r1) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.invoke2(r1)
            return r1
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r1 = this;
            kotlin.coroutines.Continuation r2 = r1.create(r2)
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1 r2 = (kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1) r2
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            java.lang.Object r2 = r2.invokeSuspend(r0)
            return r2
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 != r3) goto L10
            kotlin.ResultKt.throwOnFailure(r6)
            goto L2f
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.flow.f<T> r6 = r5.$downstream
            og0.a0 r1 = kotlinx.coroutines.flow.internal.C41658l.f91700a
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r4 = r5.$lastValue
            T r4 = r4.element
            if (r4 != r1) goto L26
            r4 = r2
        L26:
            r5.label = r3
            java.lang.Object r6 = r6.emit(r4, r5)
            if (r6 != r0) goto L2f
            return r0
        L2f:
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r6 = r5.$lastValue
            r6.element = r2
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
    }
}
