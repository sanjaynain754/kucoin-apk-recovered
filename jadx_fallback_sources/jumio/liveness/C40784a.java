package jumio.liveness;

/* JADX INFO: renamed from: jumio.liveness.a */
/* JADX INFO: loaded from: classes61.dex */
public final class C40784a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* JADX INFO: renamed from: a */
    public int f90601a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ java.lang.Object f90602b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ com.jumio.liveness.CameraData f90603c;

    public C40784a(com.jumio.liveness.CameraData r1, kotlin.coroutines.Continuation r2) {
            r0 = this;
            r0.f90603c = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object r3, kotlin.coroutines.Continuation r4) {
            r2 = this;
            jumio.liveness.a r0 = new jumio.liveness.a
            com.jumio.liveness.CameraData r1 = r2.f90603c
            r0.<init>(r1, r4)
            r0.f90602b = r3
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            kotlinx.coroutines.m0 r3 = (kotlinx.coroutines.InterfaceC41709m0) r3
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            jumio.liveness.a r0 = new jumio.liveness.a
            com.jumio.liveness.CameraData r1 = r2.f90603c
            r0.<init>(r1, r4)
            r0.f90602b = r3
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            java.lang.Object r3 = r0.invokeSuspend(r3)
            return r3
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            r6 = this;
            java.lang.Object r0 = r6.f90602b
            kotlinx.coroutines.m0 r0 = (kotlinx.coroutines.InterfaceC41709m0) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r6.f90601a
            r3 = 1
            if (r2 == 0) goto L1b
            if (r2 != r3) goto L13
            kotlin.ResultKt.throwOnFailure(r7)
            goto L31
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            kotlin.ResultKt.throwOnFailure(r7)
        L1e:
            boolean r7 = kotlinx.coroutines.C41713n0.m91132h(r0)
            if (r7 == 0) goto L37
            r6.f90602b = r0
            r6.f90601a = r3
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.m90350b(r4, r6)
            if (r7 != r1) goto L31
            return r1
        L31:
            com.jumio.liveness.CameraData r7 = r6.f90603c
            com.jumio.liveness.CameraData.access$requestData(r7)
            goto L1e
        L37:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
    }
}
