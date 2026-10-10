package com.sumsub.sns.internal.features.presentation.exitsurvey;

import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.exitsurvey.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31032p extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public InterfaceC41669n f62719a;

    /* JADX INFO: renamed from: b */
    public C31033q f62720b;

    /* JADX INFO: renamed from: c */
    public Object f62721c;

    /* JADX INFO: renamed from: d */
    public int f62722d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C31033q f62723e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31032p(C31033q c31033q, Continuation continuation) {
        super(2, continuation);
        this.f62723e = c31033q;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31032p(this.f62723e, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31032p(this.f62723e, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003c -> B:12:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x003e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.f62722d
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r1 = r12.f62721c
            com.sumsub.sns.internal.features.presentation.exitsurvey.q r3 = r12.f62720b
            kotlinx.coroutines.flow.n r4 = r12.f62719a
            p852kotlin.ResultKt.throwOnFailure(r13)
            goto L3f
        L15:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1d:
            p852kotlin.ResultKt.throwOnFailure(r13)
            com.sumsub.sns.internal.features.presentation.exitsurvey.q r13 = r12.f62723e
            kotlinx.coroutines.flow.n r1 = r13.f62729e
            r3 = r13
            r4 = r1
        L26:
            java.lang.Object r1 = r4.getValue()
            r13 = r1
            com.sumsub.sns.internal.features.presentation.exitsurvey.k r13 = (com.sumsub.sns.internal.features.presentation.exitsurvey.AbstractC31027k) r13
            r12.f62719a = r4
            r12.f62720b = r3
            r12.f62721c = r1
            r12.f62722d = r2
            java.lang.String r13 = "sns_exit_survey_thanks"
            java.lang.Object r13 = r3.getString(r13, r12)
            if (r13 != r0) goto L3f
            return r0
        L3f:
            java.lang.String r13 = (java.lang.String) r13
            kotlin.reflect.KProperty[] r5 = com.sumsub.sns.internal.features.presentation.exitsurvey.C31033q.f62724g
            java.util.Set r5 = r3.m70565e()
            com.sumsub.sns.internal.features.presentation.exitsurvey.j r6 = new com.sumsub.sns.internal.features.presentation.exitsurvey.j
            r6.<init>(r13, r5)
            boolean r13 = r4.compareAndSet(r1, r6)
            if (r13 == 0) goto L26
            com.sumsub.sns.internal.features.presentation.exitsurvey.q r5 = r12.f62723e
            com.sumsub.sns.internal.core.common.v r6 = new com.sumsub.sns.internal.core.common.v
            r6.<init>()
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 2
            long r0 = r13.toMillis(r0)
            java.lang.Long r8 = p852kotlin.coroutines.jvm.internal.Boxing.boxLong(r0)
            r10 = 10
            r11 = 0
            r7 = 0
            r9 = 0
            com.sumsub.sns.core.presentation.base.AbstractC28052C.finish$default(r5, r6, r7, r8, r9, r10, r11)
            kotlin.Unit r13 = p852kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.features.presentation.exitsurvey.C31032p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
