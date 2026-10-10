package com.kubi.sdk.pkg.util;

import com.tencent.bugly.proguard.C33590cg;
import com.tencent.qcloud.tuicore.TUIConstants;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: SingleDeferredCache.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.util.SingleDeferredCache", m90122f = "SingleDeferredCache.kt", m90123i = {0, 0, 0, 0, 0, 1, 1, 1}, m90124l = {117, 98}, m90125m = C33590cg.f69440j, m90126n = {"this", "key", TUIConstants.TIMPush.NOTIFICATION.ACTION, "$this$withLock_u24default$iv", "timeout", "this", "key", "$this$withLock_u24default$iv"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$2"})
public final class SingleDeferredCache$cache$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SingleDeferredCache<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleDeferredCache$cache$1(SingleDeferredCache<T> singleDeferredCache, Continuation<? super SingleDeferredCache$cache$1> continuation) {
        super(continuation);
        this.this$0 = singleDeferredCache;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to com.kubi.sdk.pkg.util.SingleDeferredCache$cache$1 for r6v1 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
        /*
            r6 = this;
            r6.result = r7
            int r7 = r6.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r7 | r0
            r6.label = r7
            com.kubi.sdk.pkg.util.SingleDeferredCache<T> r0 = r6.this$0
            r2 = 0
            r4 = 0
            r1 = 0
            r5 = r6
            java.lang.Object r7 = r0.m57845a(r1, r2, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.sdk.pkg.util.SingleDeferredCache$cache$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
