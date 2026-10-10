package com.kubi.mvi.common;

/* JADX INFO: compiled from: MviEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {"Lkotlinx/coroutines/flow/f;", "", "", "<anonymous>", "(Lkotlinx/coroutines/flow/f;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.mvi.common.MviExKt$repeatCall$1", m90122f = "MviEx.kt", m90123i = {0, 1}, m90124l = {154, 156}, m90125m = "invokeSuspend", m90126n = {"$this$flow", "$this$flow"}, m90127s = {"L$0", "L$0"})
public final class MviExKt$repeatCall$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.InterfaceC41635f<? super java.lang.Integer>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ long $delay;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> $finishAction;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> $startAction;
    final /* synthetic */ int $times;
    int I$0;
    int I$1;
    long J$0;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    public MviExKt$repeatCall$1(kotlin.jvm.functions.Function0<kotlin.Unit> r1, int r2, kotlin.jvm.functions.Function0<kotlin.Unit> r3, long r4, kotlin.coroutines.Continuation<? super com.kubi.mvi.common.MviExKt$repeatCall$1> r6) {
            r0 = this;
            r0.$startAction = r1
            r0.$times = r2
            r0.$finishAction = r3
            r0.$delay = r4
            r1 = 2
            r0.<init>(r1, r6)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r9) {
            r7 = this;
            com.kubi.mvi.common.MviExKt$repeatCall$1 r0 = new com.kubi.mvi.common.MviExKt$repeatCall$1
            kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r7.$startAction
            int r2 = r7.$times
            kotlin.jvm.functions.Function0<kotlin.Unit> r3 = r7.$finishAction
            long r4 = r7.$delay
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r6)
            r0.L$0 = r8
            return r0
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.InterfaceC41635f<? super java.lang.Integer> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.InterfaceC41635f) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke2(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.InterfaceC41635f<? super java.lang.Integer> r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            com.kubi.mvi.common.MviExKt$repeatCall$1 r1 = (com.kubi.mvi.common.MviExKt$repeatCall$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            int r1 = r11.I$1
            long r4 = r11.J$0
            int r6 = r11.I$0
            java.lang.Object r7 = r11.L$0
            kotlinx.coroutines.flow.f r7 = (kotlinx.coroutines.flow.InterfaceC41635f) r7
            kotlin.ResultKt.throwOnFailure(r12)
            goto L77
        L1c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L24:
            int r1 = r11.I$1
            long r4 = r11.J$0
            int r6 = r11.I$0
            java.lang.Object r7 = r11.L$0
            kotlinx.coroutines.flow.f r7 = (kotlinx.coroutines.flow.InterfaceC41635f) r7
            kotlin.ResultKt.throwOnFailure(r12)
            goto L60
        L32:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.Object r12 = r11.L$0
            kotlinx.coroutines.flow.f r12 = (kotlinx.coroutines.flow.InterfaceC41635f) r12
            kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r11.$startAction
            if (r1 == 0) goto L40
            r1.invoke()
        L40:
            int r1 = r11.$times
            long r4 = r11.$delay
            r6 = 0
        L45:
            if (r6 >= r1) goto L7d
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r6)
            r11.L$0 = r12
            r11.I$0 = r1
            r11.J$0 = r4
            r11.I$1 = r6
            r11.label = r3
            java.lang.Object r7 = r12.emit(r7, r11)
            if (r7 != r0) goto L5c
            goto L76
        L5c:
            r7 = r6
            r6 = r1
            r1 = r7
            r7 = r12
        L60:
            r8 = 0
            int r12 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r12 <= 0) goto L77
            r11.L$0 = r7
            r11.I$0 = r6
            r11.J$0 = r4
            r11.I$1 = r1
            r11.label = r2
            java.lang.Object r12 = kotlinx.coroutines.DelayKt.m90350b(r4, r11)
            if (r12 != r0) goto L77
        L76:
            return r0
        L77:
            r12 = r7
            int r1 = r1 + r3
            r10 = r6
            r6 = r1
            r1 = r10
            goto L45
        L7d:
            kotlin.jvm.functions.Function0<kotlin.Unit> r12 = r11.$finishAction
            if (r12 == 0) goto L84
            r12.invoke()
        L84:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
    }
}
