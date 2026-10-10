package com.sumsub.sns.core.presentation.base;

import kotlinx.coroutines.channels.InterfaceC41567f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.r0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28146r0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public InterfaceC41567f f57384a;

    /* JADX INFO: renamed from: b */
    public Function2 f57385b;

    /* JADX INFO: renamed from: c */
    public int f57386c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC28073M0 f57387d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28146r0(AbstractC28073M0 abstractC28073M0, Continuation continuation) {
        super(2, continuation);
        this.f57387d = abstractC28073M0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28146r0(this.f57387d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C28146r0(this.f57387d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0048 A[PHI: r1
      0x0048: PHI (r1v5 kotlinx.coroutines.channels.f) = 
      (r1v1 kotlinx.coroutines.channels.f)
      (r1v2 kotlinx.coroutines.channels.f)
      (r1v3 kotlinx.coroutines.channels.f)
      (r1v3 kotlinx.coroutines.channels.f)
      (r1v10 kotlinx.coroutines.channels.f)
     binds: [B:14:0x003b, B:35:0x00b9, B:25:0x007b, B:30:0x009a, B:8:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0055 A[PHI: r1 r11
      0x0055: PHI (r1v4 kotlinx.coroutines.channels.f) = (r1v5 kotlinx.coroutines.channels.f), (r1v6 kotlinx.coroutines.channels.f) binds: [B:16:0x0052, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0055: PHI (r11v18 java.lang.Object) = (r11v25 java.lang.Object), (r11v0 java.lang.Object) binds: [B:16:0x0052, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0072  */
    /* JADX WARN: Code duplicated, block: B:26:0x007d  */
    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    /* JADX WARN: Code duplicated, block: B:31:0x009c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a9 A[PHI: r1 r11
      0x00a9: PHI (r1v2 kotlinx.coroutines.channels.f) = (r1v3 kotlinx.coroutines.channels.f), (r1v9 kotlinx.coroutines.channels.f) binds: [B:32:0x00a6, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r11v3 java.lang.Object) = (r11v15 java.lang.Object), (r11v0 java.lang.Object) binds: [B:32:0x00a6, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007b -> B:15:0x0048). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x009a -> B:15:0x0048). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b9 -> B:15:0x0048). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
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
            p852kotlin.ResultKt.throwOnFailure(r11)
            goto L48
        L1b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L23:
            kotlinx.coroutines.channels.f r1 = r10.f57384a
            p852kotlin.ResultKt.throwOnFailure(r11)
            goto La9
        L2a:
            kotlin.jvm.functions.Function2 r1 = r10.f57385b
            kotlinx.coroutines.channels.f r7 = r10.f57384a
            p852kotlin.ResultKt.throwOnFailure(r11)
            r9 = r7
            r7 = r1
            r1 = r9
            goto L75
        L35:
            kotlinx.coroutines.channels.f r1 = r10.f57384a
            p852kotlin.ResultKt.throwOnFailure(r11)
            goto L55
        L3b:
            p852kotlin.ResultKt.throwOnFailure(r11)
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
            kotlin.jvm.functions.Function2 r11 = (p852kotlin.jvm.functions.Function2) r11
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
            java.lang.Object r11 = p852kotlin.collections.CollectionsKt.firstOrNull(r11)
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
            kotlin.Unit r11 = p852kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.core.presentation.base.C28146r0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
