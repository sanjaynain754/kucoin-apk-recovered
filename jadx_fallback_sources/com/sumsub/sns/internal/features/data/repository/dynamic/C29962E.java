package com.sumsub.sns.internal.features.data.repository.dynamic;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.E */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29962E extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* JADX INFO: renamed from: a */
    public int f60174a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ java.lang.Object f60175b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ com.sumsub.sns.internal.features.data.repository.dynamic.C29967J f60176c;

    public C29962E(com.sumsub.sns.internal.features.data.repository.dynamic.C29967J r1, kotlin.coroutines.Continuation r2) {
            r0 = this;
            r0.f60176c = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object r3, kotlin.coroutines.Continuation r4) {
            r2 = this;
            com.sumsub.sns.internal.features.data.repository.dynamic.E r0 = new com.sumsub.sns.internal.features.data.repository.dynamic.E
            com.sumsub.sns.internal.features.data.repository.dynamic.J r1 = r2.f60176c
            r0.<init>(r1, r4)
            r0.f60175b = r3
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            kotlinx.coroutines.m0 r3 = (kotlinx.coroutines.InterfaceC41709m0) r3
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            com.sumsub.sns.internal.features.data.repository.dynamic.E r0 = new com.sumsub.sns.internal.features.data.repository.dynamic.E
            com.sumsub.sns.internal.features.data.repository.dynamic.J r1 = r2.f60176c
            r0.<init>(r1, r4)
            r0.f60175b = r3
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            java.lang.Object r3 = r0.invokeSuspend(r3)
            return r3
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f60174a
            r2 = 1
            if (r1 == 0) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r1 = r9.f60175b
            kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
            kotlin.ResultKt.throwOnFailure(r10)
        L12:
            r3 = r1
            goto L4e
        L14:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1c:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.f60175b
            kotlinx.coroutines.m0 r10 = (kotlinx.coroutines.InterfaceC41709m0) r10
            r1 = r10
        L24:
            boolean r10 = kotlinx.coroutines.C41713n0.m91132h(r1)
            if (r10 == 0) goto L6c
            kotlin.time.Duration$Companion r10 = kotlin.time.Duration.Companion
            com.sumsub.sns.internal.features.data.repository.dynamic.a r10 = com.sumsub.sns.internal.features.data.repository.dynamic.C29973b.f60208f
            com.sumsub.sns.internal.features.data.repository.dynamic.b r10 = r10.m70053a()
            long r3 = r10.f60209a
            r5 = 1
            long r3 = kotlin.ranges.RangesKt.coerceAtLeast(r3, r5)
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            kotlin.time.DurationUnit r10 = kotlin.time.DurationUnit.MILLISECONDS
            long r3 = kotlin.time.DurationKt.toDuration(r3, r10)
            r9.f60175b = r1
            r9.f60174a = r2
            java.lang.Object r10 = kotlinx.coroutines.DelayKt.m90351c(r3, r9)
            if (r10 != r0) goto L12
            return r0
        L4e:
            kotlinx.coroutines.C41713n0.m91131g(r3)
            com.sumsub.sns.internal.log.a r10 = com.sumsub.sns.internal.log.C33272c.f67816e
            com.sumsub.sns.internal.log.logger.b r10 = r10.f67810a
            java.lang.String r1 = "DataRepository"
            java.lang.String r4 = "Manually updating data"
            r5 = 0
            r10.mo68955d(r1, r4, r5)
            com.sumsub.sns.internal.features.data.repository.dynamic.D r6 = new com.sumsub.sns.internal.features.data.repository.dynamic.D
            com.sumsub.sns.internal.features.data.repository.dynamic.J r10 = r9.f60176c
            r6.<init>(r10, r5)
            r7 = 3
            r8 = 0
            r4 = 0
            kotlinx.coroutines.C41686h.m91046d(r3, r4, r5, r6, r7, r8)
            r1 = r3
            goto L24
        L6c:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
    }
}
