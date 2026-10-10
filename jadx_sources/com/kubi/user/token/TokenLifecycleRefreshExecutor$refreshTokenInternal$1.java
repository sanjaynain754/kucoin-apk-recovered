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
@DebugMetadata(m90121c = "com.kubi.user.token.TokenLifecycleRefreshExecutor", m90122f = "TokenLifecycleRefreshExecutor.kt", m90123i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, m90124l = {240, 242}, m90125m = "refreshTokenInternal", m90126n = {"triggerPath", "context", "source", "targetAccountId", "refreshToken", "attributionToken", "accountType", "requestRefreshToken", "refreshTimeLimit", "wasCurrentAccount", "effectiveRefreshTimeLimit", "refreshTokenExpired", "triggerPath", "context", "source", "targetAccountId", "refreshToken", "attributionToken", "accountType", "requestRefreshToken", "refreshTimeLimit", "wasCurrentAccount", "effectiveRefreshTimeLimit", "refreshTokenExpired"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "J$0", "Z$0", "J$1", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "J$0", "Z$0", "J$1", "I$0"})
public final class TokenLifecycleRefreshExecutor$refreshTokenInternal$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TokenLifecycleRefreshExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenLifecycleRefreshExecutor$refreshTokenInternal$1(TokenLifecycleRefreshExecutor tokenLifecycleRefreshExecutor, Continuation<? super TokenLifecycleRefreshExecutor$refreshTokenInternal$1> continuation) {
        super(continuation);
        this.this$0 = tokenLifecycleRefreshExecutor;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m65853B(null, null, null, 0L, this);
    }
}
