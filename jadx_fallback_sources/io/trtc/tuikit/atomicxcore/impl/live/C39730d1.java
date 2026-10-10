package io.trtc.tuikit.atomicxcore.impl.live;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.d1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39730d1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* JADX INFO: renamed from: a */
    public int f88279a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ io.trtc.tuikit.atomicxcore.impl.live.C39733e1 f88280b;

    public C39730d1(io.trtc.tuikit.atomicxcore.impl.live.C39733e1 r1, kotlin.coroutines.Continuation r2) {
            r0 = this;
            r0.f88280b = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object r2, kotlin.coroutines.Continuation r3) {
            r1 = this;
            io.trtc.tuikit.atomicxcore.impl.live.d1 r2 = new io.trtc.tuikit.atomicxcore.impl.live.d1
            io.trtc.tuikit.atomicxcore.impl.live.e1 r0 = r1.f88280b
            r2.<init>(r0, r3)
            return r2
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            kotlinx.coroutines.m0 r2 = (kotlinx.coroutines.InterfaceC41709m0) r2
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            io.trtc.tuikit.atomicxcore.impl.live.d1 r2 = new io.trtc.tuikit.atomicxcore.impl.live.d1
            io.trtc.tuikit.atomicxcore.impl.live.e1 r0 = r1.f88280b
            r2.<init>(r0, r3)
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
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
            kotlin.ResultKt.throwOnFailure(r7)
            goto L29
        L1b:
            kotlin.ResultKt.throwOnFailure(r7)
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
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r7 != r1) goto L47
            goto L49
        L47:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
        L49:
            if (r7 != r0) goto L1e
        L4b:
            return r0
    }
}
