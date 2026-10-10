package com.sumsub.sns.core.presentation.base;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.r0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28146r0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* JADX INFO: renamed from: a */
    public kotlinx.coroutines.channels.InterfaceC41567f f57384a;

    /* JADX INFO: renamed from: b */
    public kotlin.jvm.functions.Function2 f57385b;

    /* JADX INFO: renamed from: c */
    public int f57386c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ com.sumsub.sns.core.presentation.base.AbstractC28073M0 f57387d;

    public C28146r0(com.sumsub.sns.core.presentation.base.AbstractC28073M0 r1, kotlin.coroutines.Continuation r2) {
            r0 = this;
            r0.f57387d = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object r2, kotlin.coroutines.Continuation r3) {
            r1 = this;
            com.sumsub.sns.core.presentation.base.r0 r2 = new com.sumsub.sns.core.presentation.base.r0
            com.sumsub.sns.core.presentation.base.M0 r0 = r1.f57387d
            r2.<init>(r0, r3)
            return r2
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            kotlinx.coroutines.m0 r2 = (kotlinx.coroutines.InterfaceC41709m0) r2
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            com.sumsub.sns.core.presentation.base.r0 r2 = new com.sumsub.sns.core.presentation.base.r0
            com.sumsub.sns.core.presentation.base.M0 r0 = r1.f57387d
            r2.<init>(r0, r3)
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f57386c
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L3b
            if (r1 == r6) goto L35
            if (r1 == r5) goto L2a
            if (r1 == r4) goto L23
            if (r1 != r3) goto L1b
            kotlinx.coroutines.channels.f r1 = r10.f57384a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L48
        L1b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L23:
            kotlinx.coroutines.channels.f r1 = r10.f57384a
            kotlin.ResultKt.throwOnFailure(r11)
            goto La9
        L2a:
            kotlin.jvm.functions.Function2 r1 = r10.f57385b
            kotlinx.coroutines.channels.f r7 = r10.f57384a
            kotlin.ResultKt.throwOnFailure(r11)
            r9 = r7
            r7 = r1
            r1 = r9
            goto L75
        L35:
            kotlinx.coroutines.channels.f r1 = r10.f57384a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L55
        L3b:
            kotlin.ResultKt.throwOnFailure(r11)
            com.sumsub.sns.core.presentation.base.M0 r11 = r10.f57387d
            kotlinx.coroutines.channels.d r11 = com.sumsub.sns.core.presentation.base.AbstractC28073M0.access$getUpdateStateQueue$p(r11)
            kotlinx.coroutines.channels.f r1 = r11.iterator()
        L48:
            r10.f57384a = r1
            r10.f57385b = r2
            r10.f57386c = r6
            java.lang.Object r11 = r1.mo90631a(r10)
            if (r11 != r0) goto L55
            goto Lbb
        L55:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto Lbc
            java.lang.Object r11 = r1.next()
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            com.sumsub.sns.core.presentation.base.M0 r7 = r10.f57387d
            r10.f57384a = r1
            r10.f57385b = r11
            r10.f57386c = r5
            java.lang.Object r7 = r7.awaitStringsReady(r10)
            if (r7 != r0) goto L72
            goto Lbb
        L72:
            r9 = r7
            r7 = r11
            r11 = r9
        L75:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L48
            com.sumsub.sns.core.presentation.base.M0 r11 = r10.f57387d
            kotlinx.coroutines.flow.m r11 = com.sumsub.sns.core.presentation.base.AbstractC28073M0.access$get_viewState$p(r11)
            java.util.List r11 = r11.mo86421a()
            java.lang.Object r11 = kotlin.collections.CollectionsKt.firstOrNull(r11)
            com.sumsub.sns.core.presentation.base.s r11 = (com.sumsub.sns.core.presentation.base.InterfaceC28147s) r11
            if (r11 != 0) goto L95
            com.sumsub.sns.core.presentation.base.M0 r11 = r10.f57387d
            com.sumsub.sns.core.presentation.base.s r11 = r11.getDefaultState()
        L95:
            com.sumsub.sns.core.presentation.base.M0 r8 = r10.f57387d
            com.sumsub.sns.core.presentation.base.AbstractC28073M0.access$assertStateNotNull(r8, r11)
            if (r11 == 0) goto L48
            r10.f57384a = r1
            r10.f57385b = r2
            r10.f57386c = r4
            java.lang.Object r11 = r7.invoke(r11, r10)
            if (r11 != r0) goto La9
            goto Lbb
        La9:
            com.sumsub.sns.core.presentation.base.s r11 = (com.sumsub.sns.core.presentation.base.InterfaceC28147s) r11
            com.sumsub.sns.core.presentation.base.M0 r7 = r10.f57387d
            kotlinx.coroutines.flow.m r7 = com.sumsub.sns.core.presentation.base.AbstractC28073M0.access$get_viewState$p(r7)
            r10.f57384a = r1
            r10.f57386c = r3
            java.lang.Object r11 = r7.emit(r11, r10)
            if (r11 != r0) goto L48
        Lbb:
            return r0
        Lbc:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
    }
}
