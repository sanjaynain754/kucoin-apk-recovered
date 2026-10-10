package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes61.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "", "it"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", m90122f = "Delay.kt", m90123i = {}, m90124l = {293}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$2\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,407:1\n14#2:408\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$2\n*L\n293#1:408\n*E\n"})
public final class FlowKt__DelayKt$sample$2$1$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Unit, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.InterfaceC41635f<T> $downstream;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> $lastValue;
    int label;

    public FlowKt__DelayKt$sample$2$1$2(kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> r1, kotlinx.coroutines.flow.InterfaceC41635f<? super T> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2> r3) {
            r0 = this;
            r0.$lastValue = r1
            r0.$downstream = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2 r3 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r0 = r2.$lastValue
            kotlinx.coroutines.flow.f<T> r1 = r2.$downstream
            r3.<init>(r0, r1, r4)
            return r3
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.Unit r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.Unit r1 = (kotlin.Unit) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke2(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlin.Unit r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2 r1 = (kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r6)
            goto L36
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r6 = r5.$lastValue
            T r1 = r6.element
            if (r1 != 0) goto L23
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
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
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
    }
}
