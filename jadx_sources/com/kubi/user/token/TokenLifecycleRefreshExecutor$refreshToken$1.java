package com.kubi.user.token;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: TokenLifecycleRefreshExecutor.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.user.token.TokenLifecycleRefreshExecutor", m90122f = "TokenLifecycleRefreshExecutor.kt", m90123i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, m90124l = {660, 166}, m90125m = "refreshToken", m90126n = {"triggerPath", "context", "source", "$this$withLock_u24default$iv", "refreshTimeLimit", "$i$f$withLock", "triggerPath", "context", "source", "$this$withLock_u24default$iv", "refreshTimeLimit", "$i$f$withLock", "$i$a$-withLock$default-TokenLifecycleRefreshExecutor$refreshToken$2"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "J$0", "I$0", "L$0", "L$1", "L$2", "L$3", "J$0", "I$0", "I$1"})
public final class TokenLifecycleRefreshExecutor$refreshToken$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TokenLifecycleRefreshExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenLifecycleRefreshExecutor$refreshToken$1(TokenLifecycleRefreshExecutor tokenLifecycleRefreshExecutor, Continuation<? super TokenLifecycleRefreshExecutor$refreshToken$1> continuation) {
        super(continuation);
        this.this$0 = tokenLifecycleRefreshExecutor;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m65852A(null, null, null, 0L, this);
    }
}
