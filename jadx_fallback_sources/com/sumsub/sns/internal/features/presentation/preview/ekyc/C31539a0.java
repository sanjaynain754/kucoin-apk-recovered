package com.sumsub.sns.internal.features.presentation.preview.ekyc;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.a0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31539a0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* JADX INFO: renamed from: a */
    public int f64034a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ java.lang.Object f64035b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ com.sumsub.sns.internal.features.presentation.preview.ekyc.C31707h0 f64036c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ java.lang.String f64037d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ java.lang.String f64038e;

    public C31539a0(com.sumsub.sns.internal.features.presentation.preview.ekyc.C31707h0 r1, java.lang.String r2, java.lang.String r3, kotlin.coroutines.Continuation r4) {
            r0 = this;
            r0.f64036c = r1
            r0.f64037d = r2
            r0.f64038e = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
            r4 = this;
            com.sumsub.sns.internal.features.presentation.preview.ekyc.a0 r0 = new com.sumsub.sns.internal.features.presentation.preview.ekyc.a0
            com.sumsub.sns.internal.features.presentation.preview.ekyc.h0 r1 = r4.f64036c
            java.lang.String r2 = r4.f64037d
            java.lang.String r3 = r4.f64038e
            r0.<init>(r1, r2, r3, r6)
            r0.f64035b = r5
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            com.sumsub.sns.internal.features.presentation.preview.ekyc.a0 r1 = (com.sumsub.sns.internal.features.presentation.preview.ekyc.C31539a0) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f64034a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            goto L22
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            java.lang.Object r1 = r7.f64035b
            kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
            kotlin.ResultKt.throwOnFailure(r8)
            goto L64
        L22:
            java.lang.Object r1 = r7.f64035b
            kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
            kotlin.ResultKt.throwOnFailure(r8)
            goto L41
        L2a:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.f64035b
            kotlinx.coroutines.m0 r8 = (kotlinx.coroutines.InterfaceC41709m0) r8
            com.sumsub.sns.internal.features.presentation.preview.ekyc.h0 r1 = r7.f64036c
            r7.f64035b = r8
            r7.f64034a = r4
            kotlin.reflect.KProperty[] r4 = com.sumsub.sns.internal.features.presentation.preview.ekyc.C31707h0.f64357D
            java.lang.Object r1 = r1.awaitViewModelPrepared(r7)
            if (r1 != r0) goto L40
            goto L70
        L40:
            r1 = r8
        L41:
            boolean r8 = kotlinx.coroutines.C41713n0.m91132h(r1)
            if (r8 == 0) goto L71
            com.sumsub.sns.internal.features.data.model.common.remote.m r8 = new com.sumsub.sns.internal.features.data.model.common.remote.m
            com.sumsub.sns.internal.features.data.model.common.remote.z0 r4 = new com.sumsub.sns.internal.features.data.model.common.remote.z0
            r4.<init>()
            r5 = 5
            r6 = 0
            r8.<init>(r6, r4, r6, r5)
            com.sumsub.sns.internal.features.presentation.preview.ekyc.h0 r4 = r7.f64036c
            java.lang.String r5 = r7.f64037d
            java.lang.String r6 = r7.f64038e
            r7.f64035b = r1
            r7.f64034a = r3
            java.lang.Object r8 = com.sumsub.sns.internal.features.presentation.preview.ekyc.C31707h0.m70804a(r4, r5, r6, r8, r7)
            if (r8 != r0) goto L64
            goto L70
        L64:
            r7.f64035b = r1
            r7.f64034a = r2
            r4 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.m90350b(r4, r7)
            if (r8 != r0) goto L41
        L70:
            return r0
        L71:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
    }
}
