package com.sumsub.sns.internal.core.analytics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.analytics.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28364c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* JADX INFO: renamed from: a */
    public int f57828a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ java.lang.Object f57829b;

    public C28364c(kotlin.coroutines.Continuation r2) {
            r1 = this;
            r0 = 2
            r1.<init>(r0, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object r2, kotlin.coroutines.Continuation r3) {
            r1 = this;
            com.sumsub.sns.internal.core.analytics.c r0 = new com.sumsub.sns.internal.core.analytics.c
            r0.<init>(r3)
            r0.f57829b = r2
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            kotlinx.coroutines.m0 r2 = (kotlinx.coroutines.InterfaceC41709m0) r2
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            com.sumsub.sns.internal.core.analytics.c r0 = new com.sumsub.sns.internal.core.analytics.c
            r0.<init>(r3)
            r0.f57829b = r2
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r2 = r0.invokeSuspend(r2)
            return r2
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f57828a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L28
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            java.lang.Object r1 = r7.f57829b
            kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L16
            goto L30
        L16:
            r8 = move-exception
            goto L56
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L20:
            java.lang.Object r1 = r7.f57829b
            kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
            kotlin.ResultKt.throwOnFailure(r8)
            goto L43
        L28:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.f57829b
            r1 = r8
            kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
        L30:
            boolean r8 = kotlinx.coroutines.C41713n0.m91132h(r1)
            if (r8 == 0) goto L60
            r7.f57829b = r1
            r7.f57828a = r3
            r4 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.m90350b(r4, r7)
            if (r8 != r0) goto L43
            goto L55
        L43:
            kotlinx.coroutines.g2 r8 = kotlinx.coroutines.C41685g2.f91735b     // Catch: java.lang.Throwable -> L16
            com.sumsub.sns.internal.core.analytics.b r4 = new com.sumsub.sns.internal.core.analytics.b     // Catch: java.lang.Throwable -> L16
            r5 = 0
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L16
            r7.f57829b = r1     // Catch: java.lang.Throwable -> L16
            r7.f57828a = r2     // Catch: java.lang.Throwable -> L16
            java.lang.Object r8 = kotlinx.coroutines.C41686h.m91049g(r8, r4, r7)     // Catch: java.lang.Throwable -> L16
            if (r8 != r0) goto L30
        L55:
            return r0
        L56:
            com.sumsub.sns.internal.log.logger.k r4 = com.sumsub.sns.internal.log.C33272c.f67814c
            java.lang.String r5 = "Analytics"
            java.lang.String r6 = "Failed to flush"
            r4.mo68959w(r5, r6, r8)
            goto L30
        L60:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
    }
}
