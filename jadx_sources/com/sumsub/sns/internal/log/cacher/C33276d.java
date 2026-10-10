package com.sumsub.sns.internal.log.cacher;

import java.util.Iterator;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.cacher.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33276d extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public Iterator f67817a;

    /* JADX INFO: renamed from: b */
    public InterfaceC33274b f67818b;

    /* JADX INFO: renamed from: c */
    public int f67819c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f67820d;

    public C33276d(Continuation continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C33276d c33276d = new C33276d(continuation);
        c33276d.f67820d = obj;
        return c33276d;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C33276d c33276d = new C33276d((Continuation) obj2);
        c33276d.f67820d = (InterfaceC41709m0) obj;
        return c33276d.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Code duplicated, block: B:18:0x005c  */
    /* JADX WARN: Code duplicated, block: B:19:0x005d A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:22:0x0062, B:16:0x003d, B:19:0x005d), top: B:30:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:15:0x0036
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f67819c
            r2 = 1
            if (r1 == 0) goto L21
            if (r1 != r2) goto L19
            com.sumsub.sns.internal.log.cacher.b r1 = r8.f67818b
            java.util.Iterator r3 = r8.f67817a
            java.lang.Object r4 = r8.f67820d
            kotlinx.coroutines.m0 r4 = (kotlinx.coroutines.InterfaceC41709m0) r4
            p852kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L17
            goto L62
        L17:
            r9 = move-exception
            goto L69
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            p852kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.f67820d
            kotlinx.coroutines.m0 r9 = (kotlinx.coroutines.InterfaceC41709m0) r9
            java.util.concurrent.CopyOnWriteArraySet r1 = com.sumsub.sns.internal.log.cacher.AbstractC33277e.f67822b
            java.util.Iterator r1 = r1.iterator()
            r4 = r9
            r3 = r1
        L30:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L92
            java.lang.Object r9 = r3.next()
            r1 = r9
            com.sumsub.sns.internal.log.cacher.b r1 = (com.sumsub.sns.internal.log.cacher.InterfaceC33274b) r1
            kotlin.Result$Companion r9 = p852kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L17
            r8.f67820d = r4     // Catch: java.lang.Throwable -> L17
            r8.f67817a = r3     // Catch: java.lang.Throwable -> L17
            r8.f67818b = r1     // Catch: java.lang.Throwable -> L17
            r8.f67819c = r2     // Catch: java.lang.Throwable -> L17
            r9 = r1
            com.sumsub.sns.internal.log.cacher.l r9 = (com.sumsub.sns.internal.log.cacher.C33284l) r9     // Catch: java.lang.Throwable -> L17
            kotlinx.coroutines.j0 r5 = r9.f67851d     // Catch: java.lang.Throwable -> L17
            com.sumsub.sns.internal.log.cacher.g r6 = new com.sumsub.sns.internal.log.cacher.g     // Catch: java.lang.Throwable -> L17
            r7 = 0
            r6.<init>(r9, r7)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r9 = kotlinx.coroutines.C41686h.m91049g(r5, r6, r8)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r5 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L17
            if (r9 != r5) goto L5d
            goto L5f
        L5d:
            kotlin.Unit r9 = p852kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L17
        L5f:
            if (r9 != r0) goto L62
            return r0
        L62:
            kotlin.Unit r9 = p852kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L17
            java.lang.Object r9 = p852kotlin.Result.m103844constructorimpl(r9)     // Catch: java.lang.Throwable -> L17
            goto L73
        L69:
            kotlin.Result$Companion r5 = p852kotlin.Result.INSTANCE
            java.lang.Object r9 = p852kotlin.ResultKt.createFailure(r9)
            java.lang.Object r9 = p852kotlin.Result.m103844constructorimpl(r9)
        L73:
            java.lang.Throwable r9 = p852kotlin.Result.m103847exceptionOrNullimpl(r9)
            if (r9 == 0) goto L30
            com.sumsub.sns.internal.log.c r5 = com.sumsub.sns.internal.log.C33272c.f67812a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to processDir using "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.String r5 = "SinkWrapper"
            com.sumsub.sns.internal.log.AbstractC33293d.m71623a(r5, r1, r9)
            goto L30
        L92:
            kotlin.Unit r9 = p852kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.log.cacher.C33276d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
