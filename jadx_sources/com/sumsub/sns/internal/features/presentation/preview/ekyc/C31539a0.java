package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.a0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31539a0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f64034a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f64035b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31707h0 f64036c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f64037d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f64038e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31539a0(C31707h0 c31707h0, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f64036c = c31707h0;
        this.f64037d = str;
        this.f64038e = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31539a0 c31539a0 = new C31539a0(this.f64036c, this.f64037d, this.f64038e, continuation);
        c31539a0.f64035b = obj;
        return c31539a0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31539a0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0041 A[PHI: r1
      0x0041: PHI (r1v4 kotlinx.coroutines.m0) = (r1v3 kotlinx.coroutines.m0), (r1v5 kotlinx.coroutines.m0), (r1v7 kotlinx.coroutines.m0) binds: [B:15:0x0040, B:22:0x006e, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:21:0x0064 A[PHI: r1
      0x0064: PHI (r1v5 kotlinx.coroutines.m0) = (r1v4 kotlinx.coroutines.m0), (r1v9 kotlinx.coroutines.m0) binds: [B:19:0x0061, B:10:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006e -> B:16:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
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
            p852kotlin.ResultKt.throwOnFailure(r8)
            goto L64
        L22:
            java.lang.Object r1 = r7.f64035b
            kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
            p852kotlin.ResultKt.throwOnFailure(r8)
            goto L41
        L2a:
            p852kotlin.ResultKt.throwOnFailure(r8)
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
            kotlin.Unit r8 = p852kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.features.presentation.preview.ekyc.C31539a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
