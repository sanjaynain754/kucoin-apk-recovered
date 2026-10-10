package com.kubi.kucoin.token;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: TokenLifecycleManager.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/kucoin/token/TokenLifecycleRefreshResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kucoin.token.TokenLifecycleManager$getOrCreateRefresh$task$1$4", m90122f = "TokenLifecycleManager.kt", m90123i = {}, m90124l = {549}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TokenLifecycleManager$getOrCreateRefresh$task$1$4 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super TokenLifecycleRefreshResult>, Object> {
    final /* synthetic */ String $expiredToken;
    final /* synthetic */ TokenLifecycleRefreshContext $refreshContext;
    final /* synthetic */ long $refreshTimeLimit;
    final /* synthetic */ String $source;
    final /* synthetic */ long $taskGeneration;
    final /* synthetic */ String $triggerPath;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenLifecycleManager$getOrCreateRefresh$task$1$4(String str, String str2, String str3, long j11, long j12, TokenLifecycleRefreshContext tokenLifecycleRefreshContext, Continuation<? super TokenLifecycleManager$getOrCreateRefresh$task$1$4> continuation) {
        super(2, continuation);
        this.$expiredToken = str;
        this.$triggerPath = str2;
        this.$source = str3;
        this.$refreshTimeLimit = j11;
        this.$taskGeneration = j12;
        this.$refreshContext = tokenLifecycleRefreshContext;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenLifecycleManager$getOrCreateRefresh$task$1$4(this.$expiredToken, this.$triggerPath, this.$source, this.$refreshTimeLimit, this.$taskGeneration, this.$refreshContext, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super TokenLifecycleRefreshResult> continuation) {
        return ((TokenLifecycleManager$getOrCreateRefresh$task$1$4) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        TokenLifecycleManager tokenLifecycleManager = TokenLifecycleManager.f28424a;
        String str = this.$expiredToken;
        String str2 = this.$triggerPath;
        String str3 = this.$source;
        long j11 = this.$refreshTimeLimit;
        long j12 = this.$taskGeneration;
        TokenLifecycleRefreshContext tokenLifecycleRefreshContext = this.$refreshContext;
        this.label = 1;
        Object objM32914E = tokenLifecycleManager.m32914E(str, str2, str3, j11, j12, tokenLifecycleRefreshContext, this);
        if (objM32914E == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM32914E;
    }
}
