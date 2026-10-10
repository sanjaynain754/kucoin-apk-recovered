package com.sumsub.sns.internal.features.data.repository.dynamic;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.E */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29962E extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f60174a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60175b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29967J f60176c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29962E(C29967J c29967j, Continuation continuation) {
        super(2, continuation);
        this.f60176c = c29967j;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C29962E c29962e = new C29962E(this.f60176c, continuation);
        c29962e.f60175b = obj;
        return c29962e;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C29962E c29962e = new C29962E(this.f60176c, (Continuation) obj2);
        c29962e.f60175b = (InterfaceC41709m0) obj;
        return c29962e.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:14:0x004d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004b -> B:6:0x0012). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f60174a
            r2 = 1
            if (r1 == 0) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r1 = r9.f60175b
            kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
            p852kotlin.ResultKt.throwOnFailure(r10)
        L12:
            r3 = r1
            goto L4e
        L14:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1c:
            p852kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.f60175b
            kotlinx.coroutines.m0 r10 = (kotlinx.coroutines.InterfaceC41709m0) r10
            r1 = r10
        L24:
            boolean r10 = kotlinx.coroutines.C41713n0.m91132h(r1)
            if (r10 == 0) goto L6c
            kotlin.time.Duration$Companion r10 = p852kotlin.time.Duration.INSTANCE
            com.sumsub.sns.internal.features.data.repository.dynamic.a r10 = com.sumsub.sns.internal.features.data.repository.dynamic.C29973b.f60208f
            com.sumsub.sns.internal.features.data.repository.dynamic.b r10 = r10.m70053a()
            long r3 = r10.f60209a
            r5 = 1
            long r3 = p852kotlin.ranges.RangesKt.coerceAtLeast(r3, r5)
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            kotlin.time.DurationUnit r10 = p852kotlin.time.DurationUnit.MILLISECONDS
            long r3 = p852kotlin.time.DurationKt.toDuration(r3, r10)
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
            kotlin.Unit r10 = p852kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.features.data.repository.dynamic.C29962E.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
