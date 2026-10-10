package com.sumsub.sns.internal.features.presentation.verification;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32703b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* JADX INFO: renamed from: a */
    public int f66880a;

    /* JADX INFO: renamed from: b */
    public long f66881b;

    /* JADX INFO: renamed from: c */
    public int f66882c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ java.lang.Object f66883d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f66884e;

    public C32703b(long r1, kotlin.coroutines.Continuation r3) {
            r0 = this;
            r0.f66884e = r1
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object r4, kotlin.coroutines.Continuation r5) {
            r3 = this;
            com.sumsub.sns.internal.features.presentation.verification.b r0 = new com.sumsub.sns.internal.features.presentation.verification.b
            long r1 = r3.f66884e
            r0.<init>(r1, r5)
            r0.f66883d = r4
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            kotlinx.coroutines.flow.f r4 = (kotlinx.coroutines.flow.InterfaceC41635f) r4
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            com.sumsub.sns.internal.features.presentation.verification.b r0 = new com.sumsub.sns.internal.features.presentation.verification.b
            long r1 = r3.f66884e
            r0.<init>(r1, r5)
            r0.f66883d = r4
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            java.lang.Object r4 = r0.invokeSuspend(r4)
            return r4
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.f66882c
            r2 = 1000(0x3e8, double:4.94E-321)
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L3d
            if (r1 == r6) goto L30
            if (r1 == r5) goto L25
            if (r1 != r4) goto L1d
            java.lang.Object r1 = r11.f66883d
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.InterfaceC41635f) r1
            kotlin.ResultKt.throwOnFailure(r12)
            r12 = r1
            goto L8b
        L1d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L25:
            int r1 = r11.f66880a
            java.lang.Object r7 = r11.f66883d
            kotlinx.coroutines.flow.f r7 = (kotlinx.coroutines.flow.InterfaceC41635f) r7
            kotlin.ResultKt.throwOnFailure(r12)
            r12 = r7
            goto L45
        L30:
            long r7 = r11.f66881b
            int r1 = r11.f66880a
            java.lang.Object r9 = r11.f66883d
            kotlinx.coroutines.flow.f r9 = (kotlinx.coroutines.flow.InterfaceC41635f) r9
            kotlin.ResultKt.throwOnFailure(r12)
            r12 = r9
            goto L71
        L3d:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.Object r12 = r11.f66883d
            kotlinx.coroutines.flow.f r12 = (kotlinx.coroutines.flow.InterfaceC41635f) r12
            r1 = 0
        L45:
            if (r1 != 0) goto L8d
            long r7 = r11.f66884e
            long r9 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r9
            r9 = 0
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 <= 0) goto L7f
            float r9 = (float) r7
            float r10 = (float) r2
            float r9 = r9 / r10
            double r9 = (double) r9
            double r9 = java.lang.Math.ceil(r9)
            float r9 = (float) r9
            long r9 = (long) r9
            java.lang.Long r9 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r9)
            r11.f66883d = r12
            r11.f66880a = r1
            r11.f66881b = r7
            r11.f66882c = r6
            java.lang.Object r9 = r12.emit(r9, r11)
            if (r9 != r0) goto L71
            goto L8a
        L71:
            long r7 = r7 % r2
            r11.f66883d = r12
            r11.f66880a = r1
            r11.f66882c = r5
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.m90350b(r7, r11)
            if (r7 != r0) goto L45
            goto L8a
        L7f:
            r11.f66883d = r12
            r11.f66882c = r4
            r1 = 0
            java.lang.Object r1 = r12.emit(r1, r11)
            if (r1 != r0) goto L8b
        L8a:
            return r0
        L8b:
            r1 = r6
            goto L45
        L8d:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
    }
}
