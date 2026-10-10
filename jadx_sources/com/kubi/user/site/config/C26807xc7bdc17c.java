package com.kubi.user.site.config;

import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.kubi.user.site.config.UserCenterSiteConfigRepository$fetchUserCenterSiteConfigFromServerRetry$userSiteConfig$1 */
/* JADX INFO: compiled from: UserCenterSiteConfigRepository.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/user/site/config/UserCenterSiteConfig;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.user.site.config.UserCenterSiteConfigRepository$fetchUserCenterSiteConfigFromServerRetry$userSiteConfig$1", m90122f = "UserCenterSiteConfigRepository.kt", m90123i = {}, m90124l = {120}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class C26807xc7bdc17c extends SuspendLambda implements Function1<Continuation<? super UserCenterSiteConfig>, Object> {
    final /* synthetic */ UserCenterSiteConfigApi $api;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26807xc7bdc17c(UserCenterSiteConfigApi userCenterSiteConfigApi, Continuation<? super C26807xc7bdc17c> continuation) {
        super(1, continuation);
        this.$api = userCenterSiteConfigApi;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new C26807xc7bdc17c(this.$api, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super UserCenterSiteConfig> continuation) {
        return ((C26807xc7bdc17c) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
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
        UserCenterSiteConfigApi userCenterSiteConfigApi = this.$api;
        this.label = 1;
        Object objM65777a = userCenterSiteConfigApi.m65777a(this);
        if (objM65777a == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM65777a;
    }
}
