package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: Zip.kt */
/* JADX INFO: loaded from: classes23.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m90084d2 = {"R", "Lkotlinx/coroutines/flow/f;", "", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/f;Lkotlin/Array;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", m90122f = "Zip.kt", m90123i = {}, m90124l = {29, 29}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FlowKt__ZipKt$combine$1$1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.InterfaceC41635f<? super R>, java.lang.Object[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    int label;

    public FlowKt__ZipKt$combine$1$1(kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1> r2) {
            r0 = this;
            r0.$transform = r1
            r1 = 3
            r0.<init>(r1, r2)
            return
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object[] r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r0 = this;
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.InterfaceC41635f) r1
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r1 = r0.invoke(r1, r2, r3)
            return r1
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.InterfaceC41635f<? super R> r3, java.lang.Object[] r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
            r2 = this;
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1
            kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r1 = r2.$transform
            r0.<init>(r1, r5)
            r0.L$0 = r3
            r0.L$1 = r4
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            java.lang.Object r3 = r0.invokeSuspend(r3)
            return r3
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4c
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.L$0
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.InterfaceC41635f) r1
            kotlin.ResultKt.throwOnFailure(r7)
            goto L40
        L22:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.L$0
            r1 = r7
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.InterfaceC41635f) r1
            java.lang.Object r7 = r6.L$1
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r4 = r6.$transform
            r5 = 0
            r5 = r7[r5]
            r7 = r7[r3]
            r6.L$0 = r1
            r6.label = r3
            java.lang.Object r7 = r4.invoke(r5, r7, r6)
            if (r7 != r0) goto L40
            goto L4b
        L40:
            r3 = 0
            r6.L$0 = r3
            r6.label = r2
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L4c
        L4b:
            return r0
        L4c:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
    }
}
