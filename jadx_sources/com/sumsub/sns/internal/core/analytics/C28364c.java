package com.sumsub.sns.internal.core.analytics;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.analytics.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28364c extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f57828a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f57829b;

    public C28364c(Continuation continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C28364c c28364c = new C28364c(continuation);
        c28364c.f57829b = obj;
        return c28364c;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C28364c c28364c = new C28364c((Continuation) obj2);
        c28364c.f57829b = (InterfaceC41709m0) obj;
        return c28364c.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030 A[PHI: r1
      0x0030: PHI (r1v5 kotlinx.coroutines.m0) = (r1v2 kotlinx.coroutines.m0), (r1v3 kotlinx.coroutines.m0), (r1v4 kotlinx.coroutines.m0), (r1v9 kotlinx.coroutines.m0) binds: [B:14:0x0028, B:23:0x0056, B:21:0x0053, B:7:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:20:0x0043 A[Catch: all -> 0x0016, PHI: r1
      0x0043: PHI (r1v4 kotlinx.coroutines.m0) = (r1v5 kotlinx.coroutines.m0), (r1v7 kotlinx.coroutines.m0) binds: [B:18:0x0040, B:13:0x0020] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0016, blocks: (B:7:0x0012, B:20:0x0043), top: B:26:0x0012 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0053 -> B:15:0x0030). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0056 -> B:15:0x0030). Please report as a decompilation issue!!! */
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
            int r1 = r7.f57828a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L28
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            java.lang.Object r1 = r7.f57829b
            kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
            p852kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L16
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
            p852kotlin.ResultKt.throwOnFailure(r8)
            goto L43
        L28:
            p852kotlin.ResultKt.throwOnFailure(r8)
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
            kotlin.Unit r8 = p852kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.core.analytics.C28364c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
