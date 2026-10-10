package com.kubi.kucoin.token;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: TokenLifecycleManager.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kucoin.token.TokenLifecycleManager", m90122f = "TokenLifecycleManager.kt", m90123i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, m90124l = {978, 1013}, m90125m = "awaitBlockingRefreshBarrierSuspend", m90126n = {"requestToken", "triggerPath", "onAccountTypeResolved", "barrier", "blockingWaitStart", "requestToken", "triggerPath", "onAccountTypeResolved", "barrier", "refreshResult", "forceContext", "tokenForForcedRefresh", "forcedRefreshTask", "blockingWaitStart"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "J$0"})
public final class TokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TokenLifecycleManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$1(TokenLifecycleManager tokenLifecycleManager, Continuation<? super TokenLifecycleManager$awaitBlockingRefreshBarrierSuspend$1> continuation) {
        super(continuation);
        this.this$0 = tokenLifecycleManager;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m32946r(null, null, null, this);
    }
}
