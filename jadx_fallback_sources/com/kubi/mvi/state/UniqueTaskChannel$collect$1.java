package com.kubi.mvi.state;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: UniqueTaskChannel.kt */
/* JADX INFO: loaded from: classes12.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, m90084d2 = {"T", "Lkotlinx/coroutines/m0;", "it", "", "<anonymous>"}, m90085k = 3, m90086mv = {1, 9, 0})
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.mvi.state.UniqueTaskChannel$collect$1", m90122f = "UniqueTaskChannel.kt", m90123i = {0}, m90124l = {74}, m90125m = "invokeSuspend", m90126n = {"it"}, m90127s = {"L$0"})
public final class UniqueTaskChannel$collect$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.InterfaceC41709m0, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $block;
    /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.kubi.mvi.state.UniqueTaskChannel<T> this$0;

    public UniqueTaskChannel$collect$1(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1, com.kubi.mvi.state.UniqueTaskChannel<T> r2, kotlin.coroutines.Continuation<? super com.kubi.mvi.state.UniqueTaskChannel$collect$1> r3) {
            r0 = this;
            r0.$block = r1
            r0.this$0 = r2
            r1 = 3
            r0.<init>(r1, r3)
            return
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.InterfaceC41709m0 r1, java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r0 = this;
            kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r1 = r0.invoke2(r1, r2, r3)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.InterfaceC41709m0 r3, T r4, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
            r2 = this;
            com.kubi.mvi.state.UniqueTaskChannel$collect$1 r3 = new com.kubi.mvi.state.UniqueTaskChannel$collect$1
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r0 = r2.$block
            com.kubi.mvi.state.UniqueTaskChannel<T> r1 = r2.this$0
            r3.<init>(r0, r1, r5)
            r3.L$0 = r4
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            java.lang.Object r3 = r3.invokeSuspend(r4)
            return r3
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
            r3 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r0 = r3.L$0
            kotlin.ResultKt.throwOnFailure(r4)
            goto L2c
        L11:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L19:
            kotlin.ResultKt.throwOnFailure(r4)
            java.lang.Object r4 = r3.L$0
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r3.$block
            r3.L$0 = r4
            r3.label = r2
            java.lang.Object r1 = r1.invoke(r4, r3)
            if (r1 != r0) goto L2b
            return r0
        L2b:
            r0 = r4
        L2c:
            com.kubi.mvi.state.UniqueTaskChannel<T> r4 = r3.this$0
            com.kubi.mvi.state.UniqueTaskChannel.m42660b(r4, r0)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
    }
}
