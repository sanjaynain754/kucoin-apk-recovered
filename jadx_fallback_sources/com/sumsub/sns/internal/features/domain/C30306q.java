package com.sumsub.sns.internal.features.domain;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30306q {

    /* JADX INFO: renamed from: a */
    public final com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a f60917a;

    /* JADX INFO: renamed from: b */
    public final com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d f60918b;

    public C30306q(com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a r1, com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d r2) {
            r0 = this;
            r0.<init>()
            r0.f60917a = r1
            r0.f60918b = r2
            return
    }

    /* JADX INFO: renamed from: a */
    public final java.lang.Object m70177a(java.util.List r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
            r6 = this;
            boolean r0 = r8 instanceof com.sumsub.sns.internal.features.domain.C30304p
            if (r0 == 0) goto L13
            r0 = r8
            com.sumsub.sns.internal.features.domain.p r0 = (com.sumsub.sns.internal.features.domain.C30304p) r0
            int r1 = r0.f60908f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f60908f = r1
            goto L18
        L13:
            com.sumsub.sns.internal.features.domain.p r0 = new com.sumsub.sns.internal.features.domain.p
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f60906d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f60908f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.String r7 = r0.f60905c
            java.util.Iterator r2 = r0.f60904b
            java.util.List r4 = r0.f60903a
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Exception -> L2f
            goto L6a
        L2f:
            r7 = move-exception
            goto L73
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            kotlin.ResultKt.throwOnFailure(r8)
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Exception -> L2f
            r8.<init>()     // Catch: java.lang.Exception -> L2f
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Exception -> L2f
            r2 = r7
            r4 = r8
        L47:
            boolean r7 = r2.hasNext()     // Catch: java.lang.Exception -> L2f
            if (r7 == 0) goto L6e
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Exception -> L2f
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L2f
            com.sumsub.sns.internal.features.data.repository.applicant.d r8 = r6.f60918b     // Catch: java.lang.Exception -> L2f
            int r5 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.Exception -> L2f
            r0.f60903a = r4     // Catch: java.lang.Exception -> L2f
            r0.f60904b = r2     // Catch: java.lang.Exception -> L2f
            r0.f60905c = r7     // Catch: java.lang.Exception -> L2f
            r0.f60908f = r3     // Catch: java.lang.Exception -> L2f
            com.sumsub.sns.internal.features.data.repository.applicant.z r8 = (com.sumsub.sns.internal.features.data.repository.applicant.C29950z) r8     // Catch: java.lang.Exception -> L2f
            java.lang.Object r8 = r8.m70007a(r5, r0)     // Catch: java.lang.Exception -> L2f
            if (r8 != r1) goto L6a
            return r1
        L6a:
            r4.add(r7)     // Catch: java.lang.Exception -> L2f
            goto L47
        L6e:
            java.lang.Object r7 = kotlin.Result.m103844constructorimpl(r4)     // Catch: java.lang.Exception -> L2f
            return r7
        L73:
            kotlin.Result$Companion r8 = kotlin.Result.Companion
            com.sumsub.sns.internal.features.data.repository.common.a r8 = r6.f60917a
            java.lang.Exception r7 = com.sumsub.sns.internal.core.domain.base.AbstractC28543c.m69413a(r8, r7)
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
            java.lang.Object r7 = kotlin.Result.m103844constructorimpl(r7)
            return r7
    }
}
