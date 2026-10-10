package io.trtc.tuikit.atomicxcore.impl.message;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.j0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39841j0 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* JADX INFO: renamed from: a */
    public int f88538a;

    /* JADX INFO: renamed from: b */
    public kotlin.Pair f88539b;

    /* JADX INFO: renamed from: c */
    public java.util.Iterator f88540c;

    /* JADX INFO: renamed from: d */
    public int f88541d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ java.util.ArrayList f88542e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ io.trtc.tuikit.atomicxcore.api.CompletionHandler f88543f;

    public C39841j0(java.util.ArrayList r1, io.trtc.tuikit.atomicxcore.api.CompletionHandler r2, kotlin.coroutines.Continuation r3) {
            r0 = this;
            r0.f88542e = r1
            r0.f88543f = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object r3, kotlin.coroutines.Continuation r4) {
            r2 = this;
            io.trtc.tuikit.atomicxcore.impl.message.j0 r3 = new io.trtc.tuikit.atomicxcore.impl.message.j0
            java.util.ArrayList r0 = r2.f88542e
            io.trtc.tuikit.atomicxcore.api.CompletionHandler r1 = r2.f88543f
            r3.<init>(r0, r1, r4)
            return r3
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            kotlinx.coroutines.m0 r3 = (kotlinx.coroutines.InterfaceC41709m0) r3
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            io.trtc.tuikit.atomicxcore.impl.message.j0 r3 = new io.trtc.tuikit.atomicxcore.impl.message.j0
            java.util.ArrayList r0 = r2.f88542e
            io.trtc.tuikit.atomicxcore.api.CompletionHandler r1 = r2.f88543f
            r3.<init>(r0, r1, r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            java.lang.Object r3 = r3.invokeSuspend(r4)
            return r3
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f88541d
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            int r1 = r6.f88538a
            java.util.Iterator r3 = r6.f88540c
            kotlin.Pair r4 = r6.f88539b
            kotlin.ResultKt.throwOnFailure(r7)
            goto L45
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            kotlin.ResultKt.throwOnFailure(r7)
            java.util.ArrayList r7 = r6.f88542e
            java.util.Iterator r7 = r7.iterator()
            r1 = 0
            r3 = 0
            r4 = r3
            r3 = r7
        L2a:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L70
            java.lang.Object r7 = r3.next()
            kotlinx.coroutines.r0 r7 = (kotlinx.coroutines.InterfaceC41729r0) r7
            r6.f88539b = r4
            r6.f88540c = r3
            r6.f88538a = r1
            r6.f88541d = r2
            java.lang.Object r7 = r7.mo91198h(r6)
            if (r7 != r0) goto L45
            return r0
        L45:
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.m103853unboximpl()
            boolean r5 = kotlin.Result.m103850isFailureimpl(r7)
            if (r5 == 0) goto L2a
            java.lang.Throwable r7 = kotlin.Result.m103847exceptionOrNullimpl(r7)
            boolean r1 = r7 instanceof io.trtc.tuikit.atomicxcore.impl.common.C39497e
            if (r1 == 0) goto L6e
            kotlin.Pair r4 = new kotlin.Pair
            io.trtc.tuikit.atomicxcore.impl.common.e r7 = (io.trtc.tuikit.atomicxcore.impl.common.C39497e) r7
            int r1 = r7.f87694a
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)
            java.lang.String r7 = r7.getMessage()
            if (r7 != 0) goto L6b
            java.lang.String r7 = ""
        L6b:
            r4.<init>(r1, r7)
        L6e:
            r1 = r2
            goto L2a
        L70:
            if (r1 == 0) goto L8c
            if (r4 == 0) goto L8c
            io.trtc.tuikit.atomicxcore.api.CompletionHandler r7 = r6.f88543f
            if (r7 == 0) goto L93
            java.lang.Object r0 = r4.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Object r1 = r4.getSecond()
            java.lang.String r1 = (java.lang.String) r1
            r7.onFailure(r0, r1)
            goto L93
        L8c:
            io.trtc.tuikit.atomicxcore.api.CompletionHandler r7 = r6.f88543f
            if (r7 == 0) goto L93
            r7.onSuccess()
        L93:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
    }
}
