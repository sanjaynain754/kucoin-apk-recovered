package com.sumsub.sns.internal.features.presentation.videoident.chat;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.chat.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32909i extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public long f67316a;

    /* JADX INFO: renamed from: b */
    public int f67317b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f67318c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32917q f67319d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32909i(C32917q c32917q, Continuation continuation) {
        super(2, continuation);
        this.f67319d = c32917q;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32909i c32909i = new C32909i(this.f67319d, continuation);
        c32909i.f67318c = obj;
        return c32909i;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C32909i c32909i = new C32909i(this.f67319d, (Continuation) obj2);
        c32909i.f67318c = (InterfaceC41635f) obj;
        return c32909i.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c A[PHI: r1 r6
      0x004c: PHI (r1v4 kotlinx.coroutines.flow.f) = (r1v3 kotlinx.coroutines.flow.f), (r1v5 kotlinx.coroutines.flow.f), (r1v7 kotlinx.coroutines.flow.f) binds: [B:15:0x004a, B:22:0x007a, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x004c: PHI (r6v2 long) = (r6v1 long), (r6v4 long), (r6v5 long) binds: [B:15:0x004a, B:22:0x007a, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:21:0x0065 A[PHI: r1 r6
      0x0065: PHI (r1v5 kotlinx.coroutines.flow.f) = (r1v4 kotlinx.coroutines.flow.f), (r1v9 kotlinx.coroutines.flow.f) binds: [B:19:0x0062, B:10:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x0065: PHI (r6v3 long) = (r6v2 long), (r6v6 long) binds: [B:19:0x0062, B:10:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007a -> B:16:0x004c). Please report as a decompilation issue!!! */
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
            p852kotlin.ResultKt.throwOnFailure(r11)
            goto L65
        L26:
            long r6 = r10.f67316a
            java.lang.Object r1 = r10.f67318c
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.InterfaceC41635f) r1
            p852kotlin.ResultKt.throwOnFailure(r11)
            goto L4c
        L30:
            p852kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.f67318c
            kotlinx.coroutines.flow.f r11 = (kotlinx.coroutines.flow.InterfaceC41635f) r11
            r7 = 0
            java.lang.Long r1 = p852kotlin.coroutines.jvm.internal.Boxing.boxLong(r7)
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
            java.lang.Long r11 = p852kotlin.coroutines.jvm.internal.Boxing.boxLong(r6)
            r10.f67318c = r1
            r10.f67316a = r6
            r10.f67317b = r4
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto L4c
        L7c:
            return r0
        L7d:
            kotlin.Unit r11 = p852kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.features.presentation.videoident.chat.C32909i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
