package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Errors.kt */
/* JADX INFO: loaded from: classes23.dex */
@kotlin.Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class FlowKt__ErrorsKt$catchImpl$2<T> implements kotlinx.coroutines.flow.InterfaceC41635f {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kotlinx.coroutines.flow.InterfaceC41635f<T> f91568b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Throwable> f91569c;

    public FlowKt__ErrorsKt$catchImpl$2(kotlinx.coroutines.flow.InterfaceC41635f<? super T> r1, kotlin.jvm.internal.Ref.ObjectRef<java.lang.Throwable> r2) {
            r0 = this;
            r0.f91568b = r1
            r0.f91569c = r2
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final java.lang.Object emit(T r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2 r5 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2) r5
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2d
            goto L47
        L2d:
            r6 = move-exception
            goto L4c
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.flow.f<T> r6 = r4.f91568b     // Catch: java.lang.Throwable -> L4a
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L4a
            r0.label = r3     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4a
            if (r5 != r1) goto L47
            return r1
        L47:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L4a:
            r6 = move-exception
            r5 = r4
        L4c:
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Throwable> r5 = r5.f91569c
            r5.element = r6
            throw r6
    }
}
