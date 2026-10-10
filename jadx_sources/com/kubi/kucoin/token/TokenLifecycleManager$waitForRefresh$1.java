package com.kubi.kucoin.token;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: TokenLifecycleManager.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/kucoin/token/TokenLifecycleRefreshResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kucoin.token.TokenLifecycleManager$waitForRefresh$1", m90122f = "TokenLifecycleManager.kt", m90123i = {}, m90124l = {777}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TokenLifecycleManager$waitForRefresh$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super TokenLifecycleRefreshResult>, Object> {
    final /* synthetic */ String $expiredToken;
    final /* synthetic */ Ref.ObjectRef<String> $fallbackAccountType;
    final /* synthetic */ long $refreshTimeLimit;
    final /* synthetic */ String $refreshType;
    final /* synthetic */ boolean $registerBlockingBarrier;
    final /* synthetic */ String $source;
    final /* synthetic */ String $triggerPath;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenLifecycleManager$waitForRefresh$1(String str, String str2, String str3, long j11, String str4, boolean z11, Ref.ObjectRef<String> objectRef, Continuation<? super TokenLifecycleManager$waitForRefresh$1> continuation) {
        super(2, continuation);
        this.$expiredToken = str;
        this.$triggerPath = str2;
        this.$source = str3;
        this.$refreshTimeLimit = j11;
        this.$refreshType = str4;
        this.$registerBlockingBarrier = z11;
        this.$fallbackAccountType = objectRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final Unit m32997f(Ref.ObjectRef objectRef, String str) {
        objectRef.element = str;
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenLifecycleManager$waitForRefresh$1(this.$expiredToken, this.$triggerPath, this.$source, this.$refreshTimeLimit, this.$refreshType, this.$registerBlockingBarrier, this.$fallbackAccountType, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super TokenLifecycleRefreshResult> continuation) {
        return ((TokenLifecycleManager$waitForRefresh$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
        String str4 = this.$refreshType;
        boolean z11 = this.$registerBlockingBarrier;
        final Ref.ObjectRef<String> objectRef = this.$fallbackAccountType;
        Function1 function1 = new Function1() { // from class: com.kubi.kucoin.token.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return TokenLifecycleManager$waitForRefresh$1.m32997f(objectRef, (String) obj2);
            }
        };
        this.label = 1;
        Object objM32909t = TokenLifecycleManager.m32909t(tokenLifecycleManager, str, str2, str3, j11, str4, z11, null, null, function1, this, 192, null);
        if (objM32909t == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM32909t;
    }
}
