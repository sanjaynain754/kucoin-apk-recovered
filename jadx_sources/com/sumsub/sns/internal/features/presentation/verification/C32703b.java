package com.sumsub.sns.internal.features.presentation.verification;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32703b extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f66880a;

    /* JADX INFO: renamed from: b */
    public long f66881b;

    /* JADX INFO: renamed from: c */
    public int f66882c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f66883d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f66884e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32703b(long j11, Continuation continuation) {
        super(2, continuation);
        this.f66884e = j11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32703b c32703b = new C32703b(this.f66884e, continuation);
        c32703b.f66883d = obj;
        return c32703b;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C32703b c32703b = new C32703b(this.f66884e, (Continuation) obj2);
        c32703b.f66883d = (InterfaceC41635f) obj;
        return c32703b.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0045 A[DONT_INVERT, PHI: r1 r12
      0x0045: PHI (r1v3 int) = (r1v1 int), (r1v2 int), (r1v6 int), (r1v8 int) binds: [B:12:0x003d, B:20:0x007c, B:25:0x008b, B:10:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0045: PHI (r12v4 kotlinx.coroutines.flow.f) = 
      (r12v2 kotlinx.coroutines.flow.f)
      (r12v3 kotlinx.coroutines.flow.f)
      (r12v6 kotlinx.coroutines.flow.f)
      (r12v8 kotlinx.coroutines.flow.f)
     binds: [B:12:0x003d, B:20:0x007c, B:25:0x008b, B:10:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    /* JADX WARN: Code duplicated, block: B:16:0x0054  */
    /* JADX WARN: Code duplicated, block: B:19:0x0071 A[PHI: r1 r7 r12
      0x0071: PHI (r1v2 int) = (r1v3 int), (r1v7 int) binds: [B:17:0x006e, B:11:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x0071: PHI (r7v0 long) = (r7v4 long), (r7v5 long) binds: [B:17:0x006e, B:11:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x0071: PHI (r12v3 kotlinx.coroutines.flow.f) = (r12v4 kotlinx.coroutines.flow.f), (r12v7 kotlinx.coroutines.flow.f) binds: [B:17:0x006e, B:11:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007c -> B:13:0x0045). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0088 -> B:25:0x008b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
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
            p852kotlin.ResultKt.throwOnFailure(r12)
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
            p852kotlin.ResultKt.throwOnFailure(r12)
            r12 = r7
            goto L45
        L30:
            long r7 = r11.f66881b
            int r1 = r11.f66880a
            java.lang.Object r9 = r11.f66883d
            kotlinx.coroutines.flow.f r9 = (kotlinx.coroutines.flow.InterfaceC41635f) r9
            p852kotlin.ResultKt.throwOnFailure(r12)
            r12 = r9
            goto L71
        L3d:
            p852kotlin.ResultKt.throwOnFailure(r12)
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
            java.lang.Long r9 = p852kotlin.coroutines.jvm.internal.Boxing.boxLong(r9)
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
            kotlin.Unit r12 = p852kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.features.presentation.verification.C32703b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
