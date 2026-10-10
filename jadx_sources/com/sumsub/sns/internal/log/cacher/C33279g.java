package com.sumsub.sns.internal.log.cacher;

import java.io.File;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.cacher.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33279g extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f67828a;

    /* JADX INFO: renamed from: b */
    public int f67829b;

    /* JADX INFO: renamed from: c */
    public int f67830c;

    /* JADX INFO: renamed from: d */
    public File[] f67831d;

    /* JADX INFO: renamed from: e */
    public C33284l f67832e;

    /* JADX INFO: renamed from: f */
    public int f67833f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C33284l f67834g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33279g(C33284l c33284l, Continuation continuation) {
        super(2, continuation);
        this.f67834g = c33284l;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C33279g(this.f67834g, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C33279g(this.f67834g, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a6 A[Catch: all -> 0x001a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x001a, blocks: (B:6:0x0015, B:30:0x00a6, B:13:0x002a, B:15:0x003e, B:17:0x0067, B:19:0x006d), top: B:44:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ba A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b8 -> B:33:0x00bb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.log.cacher.C33279g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
