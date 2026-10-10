package jumio.core;

/* JADX INFO: renamed from: jumio.core.j1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40679j1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* JADX INFO: renamed from: a */
    public int f90297a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ java.lang.Object f90298b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ com.jumio.core.extraction.ExtractionClient f90299c;

    public C40679j1(com.jumio.core.extraction.ExtractionClient r1, kotlin.coroutines.Continuation r2) {
            r0 = this;
            r0.f90299c = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object r3, kotlin.coroutines.Continuation r4) {
            r2 = this;
            jumio.core.j1 r0 = new jumio.core.j1
            com.jumio.core.extraction.ExtractionClient r1 = r2.f90299c
            r0.<init>(r1, r4)
            r0.f90298b = r3
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            kotlinx.coroutines.m0 r3 = (kotlinx.coroutines.InterfaceC41709m0) r3
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            jumio.core.j1 r0 = new jumio.core.j1
            com.jumio.core.extraction.ExtractionClient r1 = r2.f90299c
            r0.<init>(r1, r4)
            r0.f90298b = r3
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            java.lang.Object r3 = r0.invokeSuspend(r3)
            return r3
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = r4.f90298b
            kotlinx.coroutines.m0 r0 = (kotlinx.coroutines.InterfaceC41709m0) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r4.f90297a
            r3 = 1
            if (r2 == 0) goto L1d
            if (r2 != r3) goto L15
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L13
            goto L33
        L13:
            r5 = move-exception
            goto L36
        L15:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1d:
            kotlin.ResultKt.throwOnFailure(r5)
        L20:
            boolean r5 = kotlinx.coroutines.C41713n0.m91132h(r0)
            if (r5 == 0) goto L40
            com.jumio.core.extraction.ExtractionClient r5 = r4.f90299c     // Catch: java.lang.Throwable -> L13
            r4.f90298b = r0     // Catch: java.lang.Throwable -> L13
            r4.f90297a = r3     // Catch: java.lang.Throwable -> L13
            java.lang.Object r5 = com.jumio.core.extraction.ExtractionClient.access$extract(r5, r4)     // Catch: java.lang.Throwable -> L13
            if (r5 != r1) goto L33
            return r1
        L33:
            kotlin.Unit r5 = (kotlin.Unit) r5     // Catch: java.lang.Throwable -> L13
            goto L20
        L36:
            com.jumio.commons.log.Log.printStackTrace(r5)
            com.jumio.core.extraction.ExtractionClient r5 = r4.f90299c
            r2 = 0
            r5.setResult(r2)
            goto L20
        L40:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
    }
}
