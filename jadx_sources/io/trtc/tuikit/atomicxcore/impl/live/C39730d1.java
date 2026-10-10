package io.trtc.tuikit.atomicxcore.impl.live;

import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.d1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39730d1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f88279a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39733e1 f88280b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39730d1(C39733e1 c39733e1, Continuation continuation) {
        super(2, continuation);
        this.f88280b = c39733e1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39730d1(this.f88280b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C39730d1(this.f88280b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    /* JADX WARN: Code duplicated, block: B:18:0x0049 A[DONT_INVERT] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f88279a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L1b
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            p852kotlin.ResultKt.throwOnFailure(r7)
            goto L29
        L1b:
            p852kotlin.ResultKt.throwOnFailure(r7)
        L1e:
            r6.f88279a = r3
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.m90350b(r4, r6)
            if (r7 != r0) goto L29
            goto L4b
        L29:
            io.trtc.tuikit.atomicxcore.impl.live.e1 r7 = r6.f88280b
            r6.f88279a = r2
            int r1 = io.trtc.tuikit.atomicxcore.impl.live.C39733e1.f88284i
            r7.getClass()
            kotlinx.coroutines.e2 r1 = kotlinx.coroutines.C41782z0.m91393c()
            io.trtc.tuikit.atomicxcore.impl.live.b1 r4 = new io.trtc.tuikit.atomicxcore.impl.live.b1
            r5 = 0
            r4.<init>(r7, r5)
            java.lang.Object r7 = kotlinx.coroutines.C41686h.m91049g(r1, r4, r6)
            java.lang.Object r1 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r7 != r1) goto L47
            goto L49
        L47:
            kotlin.Unit r7 = p852kotlin.Unit.INSTANCE
        L49:
            if (r7 != r0) goto L1e
        L4b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.trtc.tuikit.atomicxcore.impl.live.C39730d1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
