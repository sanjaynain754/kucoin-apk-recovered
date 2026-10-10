package com.kubi.user.token;

import com.kubi.kucoin.token.TokenLifecycleRefreshTag;
import com.kubi.user.model.LoginUserEntity;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.kubi.user.token.TokenLifecycleRefreshExecutor$refreshTokenInternal$requestRefreshToken$1 */
/* JADX INFO: compiled from: TokenLifecycleRefreshExecutor.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/user/model/LoginUserEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.user.token.TokenLifecycleRefreshExecutor$refreshTokenInternal$requestRefreshToken$1", m90122f = "TokenLifecycleRefreshExecutor.kt", m90123i = {}, m90124l = {231}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class C26831xe38a5a38 extends SuspendLambda implements Function1<Continuation<? super LoginUserEntity>, Object> {
    final /* synthetic */ String $attributionToken;
    final /* synthetic */ String $refreshToken;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26831xe38a5a38(String str, String str2, Continuation<? super C26831xe38a5a38> continuation) {
        super(1, continuation);
        this.$attributionToken = str;
        this.$refreshToken = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new C26831xe38a5a38(this.$attributionToken, this.$refreshToken, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super LoginUserEntity> continuation) {
        return ((C26831xe38a5a38) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
        TokenLifecycleRefreshApi tokenLifecycleRefreshApiM65862o = TokenLifecycleRefreshExecutor.f53847a.m65862o();
        TokenLifecycleRefreshTag tokenLifecycleRefreshTag = TokenLifecycleRefreshTag.f28484a;
        String str = this.$attributionToken;
        String str2 = this.$refreshToken;
        this.label = 1;
        Object objM65876a = tokenLifecycleRefreshApiM65862o.m65876a(tokenLifecycleRefreshTag, str, str2, this);
        if (objM65876a == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM65876a;
    }
}
