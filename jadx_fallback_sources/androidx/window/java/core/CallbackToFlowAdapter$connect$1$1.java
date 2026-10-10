package androidx.window.java.core;

/* JADX INFO: compiled from: CallbackToFlowAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m90084d2 = {"", "T", "Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 8, 0})
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "androidx.window.java.core.CallbackToFlowAdapter$connect$1$1", m90122f = "CallbackToFlowAdapter.kt", m90123i = {}, m90124l = {46}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class CallbackToFlowAdapter$connect$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.core.util.Consumer<T> $consumer;
    final /* synthetic */ kotlinx.coroutines.flow.InterfaceC41634e<T> $flow;
    int label;


    public CallbackToFlowAdapter$connect$1$1(kotlinx.coroutines.flow.InterfaceC41634e<? extends T> r1, androidx.core.util.Consumer<T> r2, kotlin.coroutines.Continuation<? super androidx.window.java.core.CallbackToFlowAdapter$connect$1$1> r3) {
            r0 = this;
            r0.$flow = r1
            r0.$consumer = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            androidx.window.java.core.CallbackToFlowAdapter$connect$1$1 r3 = new androidx.window.java.core.CallbackToFlowAdapter$connect$1$1
            kotlinx.coroutines.flow.e<T> r0 = r2.$flow
            androidx.core.util.Consumer<T> r1 = r2.$consumer
            r3.<init>(r0, r1, r4)
            return r3
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.InterfaceC41709m0 r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke2(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.InterfaceC41709m0 r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            androidx.window.java.core.CallbackToFlowAdapter$connect$1$1 r1 = (androidx.window.java.core.CallbackToFlowAdapter$connect$1$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r5)
            goto L2c
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            kotlin.ResultKt.throwOnFailure(r5)
            kotlinx.coroutines.flow.e<T> r5 = r4.$flow
            androidx.window.java.core.CallbackToFlowAdapter$connect$1$1$1 r1 = new androidx.window.java.core.CallbackToFlowAdapter$connect$1$1$1
            androidx.core.util.Consumer<T> r3 = r4.$consumer
            r1.<init>(r3)
            r4.label = r2
            java.lang.Object r5 = r5.collect(r1, r4)
            if (r5 != r0) goto L2c
            return r0
        L2c:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
    }
}
