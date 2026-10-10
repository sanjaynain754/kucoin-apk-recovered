package com.kubi.mvi.common;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: MviEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, m90084d2 = {"<anonymous>", "", "T", "it"}, m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.mvi.common.MviExKt$collectOnIO$1", m90122f = "MviEx.kt", m90123i = {}, m90124l = {296}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MviExKt$collectOnIO$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.InterfaceC41709m0, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $block;
    final /* synthetic */ kotlinx.coroutines.InterfaceC41709m0 $scope;
    /* synthetic */ java.lang.Object L$0;
    int label;

    public MviExKt$collectOnIO$1(kotlin.jvm.functions.Function3<? super kotlinx.coroutines.InterfaceC41709m0, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1, kotlinx.coroutines.InterfaceC41709m0 r2, kotlin.coroutines.Continuation<? super com.kubi.mvi.common.MviExKt$collectOnIO$1> r3) {
            r0 = this;
            r0.$block = r1
            r0.$scope = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
            r3 = this;
            com.kubi.mvi.common.MviExKt$collectOnIO$1 r0 = new com.kubi.mvi.common.MviExKt$collectOnIO$1
            kotlin.jvm.functions.Function3<kotlinx.coroutines.m0, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r3.$block
            kotlinx.coroutines.m0 r2 = r3.$scope
            r0.<init>(r1, r2, r5)
            r0.L$0 = r4
            return r0
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke2(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(T r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            com.kubi.mvi.common.MviExKt$collectOnIO$1 r1 = (com.kubi.mvi.common.MviExKt$collectOnIO$1) r1
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
            goto L29
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            kotlin.ResultKt.throwOnFailure(r5)
            java.lang.Object r5 = r4.L$0
            kotlin.jvm.functions.Function3<kotlinx.coroutines.m0, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r4.$block
            kotlinx.coroutines.m0 r3 = r4.$scope
            r4.label = r2
            java.lang.Object r5 = r1.invoke(r3, r5, r4)
            if (r5 != r0) goto L29
            return r0
        L29:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
    }
}
