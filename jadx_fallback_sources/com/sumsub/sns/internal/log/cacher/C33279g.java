package com.sumsub.sns.internal.log.cacher;

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.cacher.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33279g extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* JADX INFO: renamed from: a */
    public int f67828a;

    /* JADX INFO: renamed from: b */
    public int f67829b;

    /* JADX INFO: renamed from: c */
    public int f67830c;

    /* JADX INFO: renamed from: d */
    public java.io.File[] f67831d;

    /* JADX INFO: renamed from: e */
    public com.sumsub.sns.internal.log.cacher.C33284l f67832e;

    /* JADX INFO: renamed from: f */
    public int f67833f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ com.sumsub.sns.internal.log.cacher.C33284l f67834g;

    public C33279g(com.sumsub.sns.internal.log.cacher.C33284l r1, kotlin.coroutines.Continuation r2) {
            r0 = this;
            r0.f67834g = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object r2, kotlin.coroutines.Continuation r3) {
            r1 = this;
            com.sumsub.sns.internal.log.cacher.g r2 = new com.sumsub.sns.internal.log.cacher.g
            com.sumsub.sns.internal.log.cacher.l r0 = r1.f67834g
            r2.<init>(r0, r3)
            return r2
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            kotlinx.coroutines.m0 r2 = (kotlinx.coroutines.InterfaceC41709m0) r2
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            com.sumsub.sns.internal.log.cacher.g r2 = new com.sumsub.sns.internal.log.cacher.g
            com.sumsub.sns.internal.log.cacher.l r0 = r1.f67834g
            r2.<init>(r0, r3)
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.f67833f
            r2 = 1
            if (r1 == 0) goto L26
            if (r1 != r2) goto L1e
            int r1 = r11.f67830c
            int r3 = r11.f67829b
            int r4 = r11.f67828a
            com.sumsub.sns.internal.log.cacher.l r5 = r11.f67832e
            java.io.File[] r6 = r11.f67831d
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L1a
            goto Lbb
        L1a:
            r0 = move-exception
            r12 = r0
            goto Ld1
        L1e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L26:
            kotlin.ResultKt.throwOnFailure(r12)
            r4 = 0
            com.sumsub.sns.internal.log.cacher.l r12 = r11.f67834g     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = r12.f67848a     // Catch: java.lang.Throwable -> L1a
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L1a
            java.io.File r12 = r12.f67853f     // Catch: java.lang.Throwable -> L1a
            r3.<init>(r12, r1)     // Catch: java.lang.Throwable -> L1a
            r3.mkdirs()     // Catch: java.lang.Throwable -> L1a
            boolean r12 = r3.isDirectory()     // Catch: java.lang.Throwable -> L1a
            if (r12 != 0) goto L67
            com.sumsub.sns.internal.log.c r5 = com.sumsub.sns.internal.log.C33272c.f67812a     // Catch: java.lang.Throwable -> L1a
            com.sumsub.sns.internal.log.cacher.l r12 = r11.f67834g     // Catch: java.lang.Throwable -> L1a
            java.lang.String r6 = r12.f67854g     // Catch: java.lang.Throwable -> L1a
            java.lang.String r12 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r0.<init>()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "Cache directory "
            r0.append(r1)     // Catch: java.lang.Throwable -> L1a
            r0.append(r12)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r12 = " is not a directory"
            r0.append(r12)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> L1a
            r9 = 4
            r10 = 0
            r8 = 0
            com.sumsub.log.logger.Logger.DefaultImpls.e$default(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L1a
            kotlin.Unit r12 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L1a
            return r12
        L67:
            java.io.File[] r12 = r3.listFiles()     // Catch: java.lang.Throwable -> L1a
            if (r12 == 0) goto L6f
            int r1 = r12.length     // Catch: java.lang.Throwable -> L1a
            goto L70
        L6f:
            r1 = r4
        L70:
            if (r1 <= 0) goto L99
            com.sumsub.sns.internal.log.c r5 = com.sumsub.sns.internal.log.C33272c.f67812a     // Catch: java.lang.Throwable -> L95
            com.sumsub.sns.internal.log.cacher.l r3 = r11.f67834g     // Catch: java.lang.Throwable -> L95
            java.lang.String r6 = r3.f67854g     // Catch: java.lang.Throwable -> L95
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
            r3.<init>()     // Catch: java.lang.Throwable -> L95
            java.lang.String r7 = "Processing cache ("
            r3.append(r7)     // Catch: java.lang.Throwable -> L95
            r3.append(r1)     // Catch: java.lang.Throwable -> L95
            java.lang.String r7 = " files) ... "
            r3.append(r7)     // Catch: java.lang.Throwable -> L95
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> L95
            r9 = 4
            r10 = 0
            r8 = 0
            com.sumsub.log.logger.Logger.DefaultImpls.i$default(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L95
            goto L99
        L95:
            r0 = move-exception
            r12 = r0
            r4 = r1
            goto Ld1
        L99:
            if (r12 == 0) goto Lbe
            com.sumsub.sns.internal.log.cacher.l r3 = r11.f67834g     // Catch: java.lang.Throwable -> L95
            int r5 = r12.length     // Catch: java.lang.Throwable -> L95
            r6 = r4
            r4 = r1
            r1 = r5
            r5 = r3
            r3 = r6
            r6 = r12
        La4:
            if (r3 >= r1) goto Lbd
            r12 = r6[r3]     // Catch: java.lang.Throwable -> L1a
            r11.f67831d = r6     // Catch: java.lang.Throwable -> L1a
            r11.f67832e = r5     // Catch: java.lang.Throwable -> L1a
            r11.f67828a = r4     // Catch: java.lang.Throwable -> L1a
            r11.f67829b = r3     // Catch: java.lang.Throwable -> L1a
            r11.f67830c = r1     // Catch: java.lang.Throwable -> L1a
            r11.f67833f = r2     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r12 = r5.m71621a(r12, r11)     // Catch: java.lang.Throwable -> L1a
            if (r12 != r0) goto Lbb
            return r0
        Lbb:
            int r3 = r3 + r2
            goto La4
        Lbd:
            r1 = r4
        Lbe:
            if (r1 <= 0) goto Lce
            com.sumsub.sns.internal.log.c r2 = com.sumsub.sns.internal.log.C33272c.f67812a
            com.sumsub.sns.internal.log.cacher.l r12 = r11.f67834g
            java.lang.String r3 = r12.f67854g
            r6 = 4
            r7 = 0
            java.lang.String r4 = "Done processing cache"
            r5 = 0
            com.sumsub.log.logger.Logger.DefaultImpls.i$default(r2, r3, r4, r5, r6, r7)
        Lce:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        Ld1:
            if (r4 <= 0) goto Le1
            com.sumsub.sns.internal.log.c r5 = com.sumsub.sns.internal.log.C33272c.f67812a
            com.sumsub.sns.internal.log.cacher.l r0 = r11.f67834g
            java.lang.String r6 = r0.f67854g
            r9 = 4
            r10 = 0
            java.lang.String r7 = "Done processing cache"
            r8 = 0
            com.sumsub.log.logger.Logger.DefaultImpls.i$default(r5, r6, r7, r8, r9, r10)
        Le1:
            throw r12
    }
}
