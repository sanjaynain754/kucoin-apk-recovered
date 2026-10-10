package com.kubi.sdk.util;

import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: PreLoader.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.util.PreLoader", m90122f = "PreLoader.kt", m90123i = {0, 0, 1, 1, 1, 1}, m90124l = {84, 42}, m90125m = "preload", m90126n = {"$this$withLock_u24default$iv", "$i$f$withLock", "$this$withLock_u24default$iv", "comparable", "$i$f$withLock", "$i$a$-withLock$default-PreLoader$preload$2"}, m90127s = {"L$0", "I$0", "L$0", "L$1", "I$0", "I$1"})
public final class PreLoader$preload$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PreLoader<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreLoader$preload$1(PreLoader<T> preLoader, Continuation<? super PreLoader$preload$1> continuation) {
        super(continuation);
        this.this$0 = preLoader;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to com.kubi.sdk.util.PreLoader$preload$1 for r1v1 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
        /*
            r1 = this;
            r1.result = r2
            int r2 = r1.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.label = r2
            com.kubi.sdk.util.PreLoader<T> r2 = r1.this$0
            java.lang.Object r2 = r2.m58345e(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.sdk.util.PreLoader$preload$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
