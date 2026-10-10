package io.trtc.tuikit.atomicxcore.impl.message;

import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import java.util.ArrayList;
import java.util.Iterator;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.j0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39841j0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f88538a;

    /* JADX INFO: renamed from: b */
    public Pair f88539b;

    /* JADX INFO: renamed from: c */
    public Iterator f88540c;

    /* JADX INFO: renamed from: d */
    public int f88541d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ArrayList f88542e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CompletionHandler f88543f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39841j0(ArrayList arrayList, CompletionHandler completionHandler, Continuation continuation) {
        super(2, continuation);
        this.f88542e = arrayList;
        this.f88543f = completionHandler;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C39841j0(this.f88542e, this.f88543f, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C39841j0(this.f88542e, this.f88543f, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX WARN: Code duplicated, block: B:13:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    /* JADX WARN: Code duplicated, block: B:18:0x0059  */
    /* JADX WARN: Code duplicated, block: B:20:0x0069  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0042 -> B:14:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:16:0x0051
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f88541d
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            int r1 = r6.f88538a
            java.util.Iterator r3 = r6.f88540c
            kotlin.Pair r4 = r6.f88539b
            p852kotlin.ResultKt.throwOnFailure(r7)
            goto L45
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            p852kotlin.ResultKt.throwOnFailure(r7)
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
            kotlin.Result r7 = (p852kotlin.Result) r7
            java.lang.Object r7 = r7.getValue()
            boolean r5 = p852kotlin.Result.m103850isFailureimpl(r7)
            if (r5 == 0) goto L2a
            java.lang.Throwable r7 = p852kotlin.Result.m103847exceptionOrNullimpl(r7)
            boolean r1 = r7 instanceof io.trtc.tuikit.atomicxcore.impl.common.C39497e
            if (r1 == 0) goto L6e
            kotlin.Pair r4 = new kotlin.Pair
            io.trtc.tuikit.atomicxcore.impl.common.e r7 = (io.trtc.tuikit.atomicxcore.impl.common.C39497e) r7
            int r1 = r7.f87694a
            java.lang.Integer r1 = p852kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)
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
            kotlin.Unit r7 = p852kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.trtc.tuikit.atomicxcore.impl.message.C39841j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
