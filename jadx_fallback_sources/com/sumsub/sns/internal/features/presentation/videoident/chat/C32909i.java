package com.sumsub.sns.internal.features.presentation.videoident.chat;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.chat.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32909i extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* JADX INFO: renamed from: a */
    public long f67316a;

    /* JADX INFO: renamed from: b */
    public int f67317b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ java.lang.Object f67318c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ com.sumsub.sns.internal.features.presentation.videoident.chat.C32917q f67319d;

    public C32909i(com.sumsub.sns.internal.features.presentation.videoident.chat.C32917q r1, kotlin.coroutines.Continuation r2) {
            r0 = this;
            r0.f67319d = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object r3, kotlin.coroutines.Continuation r4) {
            r2 = this;
            com.sumsub.sns.internal.features.presentation.videoident.chat.i r0 = new com.sumsub.sns.internal.features.presentation.videoident.chat.i
            com.sumsub.sns.internal.features.presentation.videoident.chat.q r1 = r2.f67319d
            r0.<init>(r1, r4)
            r0.f67318c = r3
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            kotlinx.coroutines.flow.f r3 = (kotlinx.coroutines.flow.InterfaceC41635f) r3
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            com.sumsub.sns.internal.features.presentation.videoident.chat.i r0 = new com.sumsub.sns.internal.features.presentation.videoident.chat.i
            com.sumsub.sns.internal.features.presentation.videoident.chat.q r1 = r2.f67319d
            r0.<init>(r1, r4)
            r0.f67318c = r3
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            java.lang.Object r3 = r0.invokeSuspend(r3)
            return r3
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f67317b
            r2 = 1
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L30
            if (r1 == r6) goto L26
            if (r1 == r5) goto L1c
            if (r1 != r4) goto L14
            goto L26
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            long r6 = r10.f67316a
            java.lang.Object r1 = r10.f67318c
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.InterfaceC41635f) r1
            kotlin.ResultKt.throwOnFailure(r11)
            goto L65
        L26:
            long r6 = r10.f67316a
            java.lang.Object r1 = r10.f67318c
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.InterfaceC41635f) r1
            kotlin.ResultKt.throwOnFailure(r11)
            goto L4c
        L30:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.f67318c
            kotlinx.coroutines.flow.f r11 = (kotlinx.coroutines.flow.InterfaceC41635f) r11
            r7 = 0
            java.lang.Long r1 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r7)
            r10.f67318c = r11
            r10.f67316a = r7
            r10.f67317b = r6
            java.lang.Object r1 = r11.emit(r1, r10)
            if (r1 != r0) goto L4a
            goto L7c
        L4a:
            r1 = r11
            r6 = r7
        L4c:
            com.sumsub.sns.internal.features.presentation.videoident.chat.q r11 = r10.f67319d
            boolean r11 = r11.f67332d
            if (r11 == 0) goto L7d
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            long r8 = r11.toMillis(r2)
            r10.f67318c = r1
            r10.f67316a = r6
            r10.f67317b = r5
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.m90350b(r8, r10)
            if (r11 != r0) goto L65
            goto L7c
        L65:
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            long r8 = r11.toMillis(r2)
            long r6 = r6 + r8
            java.lang.Long r11 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r6)
            r10.f67318c = r1
            r10.f67316a = r6
            r10.f67317b = r4
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto L4c
        L7c:
            return r0
        L7d:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
    }
}
