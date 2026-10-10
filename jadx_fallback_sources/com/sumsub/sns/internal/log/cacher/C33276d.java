package com.sumsub.sns.internal.log.cacher;

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.cacher.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33276d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* JADX INFO: renamed from: a */
    public java.util.Iterator f67817a;

    /* JADX INFO: renamed from: b */
    public com.sumsub.sns.internal.log.cacher.InterfaceC33274b f67818b;

    /* JADX INFO: renamed from: c */
    public int f67819c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ java.lang.Object f67820d;

    public C33276d(kotlin.coroutines.Continuation r2) {
            r1 = this;
            r0 = 2
            r1.<init>(r0, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object r2, kotlin.coroutines.Continuation r3) {
            r1 = this;
            com.sumsub.sns.internal.log.cacher.d r0 = new com.sumsub.sns.internal.log.cacher.d
            r0.<init>(r3)
            r0.f67820d = r2
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            kotlinx.coroutines.m0 r2 = (kotlinx.coroutines.InterfaceC41709m0) r2
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            com.sumsub.sns.internal.log.cacher.d r0 = new com.sumsub.sns.internal.log.cacher.d
            r0.<init>(r3)
            r0.f67820d = r2
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r2 = r0.invokeSuspend(r2)
            return r2
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f67819c
            r2 = 1
            if (r1 == 0) goto L21
            if (r1 != r2) goto L19
            com.sumsub.sns.internal.log.cacher.b r1 = r8.f67818b
            java.util.Iterator r3 = r8.f67817a
            java.lang.Object r4 = r8.f67820d
            kotlinx.coroutines.m0 r4 = (kotlinx.coroutines.InterfaceC41709m0) r4
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L17
            goto L62
        L17:
            r9 = move-exception
            goto L69
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.f67820d
            kotlinx.coroutines.m0 r9 = (kotlinx.coroutines.InterfaceC41709m0) r9
            java.util.concurrent.CopyOnWriteArraySet r1 = com.sumsub.sns.internal.log.cacher.AbstractC33277e.f67822b
            java.util.Iterator r1 = r1.iterator()
            r4 = r9
            r3 = r1
        L30:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L92
            java.lang.Object r9 = r3.next()
            r1 = r9
            com.sumsub.sns.internal.log.cacher.b r1 = (com.sumsub.sns.internal.log.cacher.InterfaceC33274b) r1
            kotlin.Result$Companion r9 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L17
            r8.f67820d = r4     // Catch: java.lang.Throwable -> L17
            r8.f67817a = r3     // Catch: java.lang.Throwable -> L17
            r8.f67818b = r1     // Catch: java.lang.Throwable -> L17
            r8.f67819c = r2     // Catch: java.lang.Throwable -> L17
            r9 = r1
            com.sumsub.sns.internal.log.cacher.l r9 = (com.sumsub.sns.internal.log.cacher.C33284l) r9     // Catch: java.lang.Throwable -> L17
            kotlinx.coroutines.j0 r5 = r9.f67851d     // Catch: java.lang.Throwable -> L17
            com.sumsub.sns.internal.log.cacher.g r6 = new com.sumsub.sns.internal.log.cacher.g     // Catch: java.lang.Throwable -> L17
            r7 = 0
            r6.<init>(r9, r7)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r9 = kotlinx.coroutines.C41686h.m91049g(r5, r6, r8)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L17
            if (r9 != r5) goto L5d
            goto L5f
        L5d:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L17
        L5f:
            if (r9 != r0) goto L62
            return r0
        L62:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L17
            java.lang.Object r9 = kotlin.Result.m103844constructorimpl(r9)     // Catch: java.lang.Throwable -> L17
            goto L73
        L69:
            kotlin.Result$Companion r5 = kotlin.Result.Companion
            java.lang.Object r9 = kotlin.ResultKt.createFailure(r9)
            java.lang.Object r9 = kotlin.Result.m103844constructorimpl(r9)
        L73:
            java.lang.Throwable r9 = kotlin.Result.m103847exceptionOrNullimpl(r9)
            if (r9 == 0) goto L30
            com.sumsub.sns.internal.log.c r5 = com.sumsub.sns.internal.log.C33272c.f67812a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to processDir using "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.String r5 = "SinkWrapper"
            com.sumsub.sns.internal.log.AbstractC33293d.m71623a(r5, r1, r9)
            goto L30
        L92:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
    }
}
