package com.kubi.user.site.config;

import com.kubi.p110rn.modules.BridgeParamKeyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: UserCenterSiteConfigRepository.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.user.site.config.UserCenterSiteConfigRepository", m90122f = "UserCenterSiteConfigRepository.kt", m90123i = {0, 0, 0, 1, 1, 1, 1}, m90124l = {143, 147}, m90125m = "retryWhenException", m90126n = {"block", BridgeParamKeyKt.MAX_COUNT, "count", "block", "e", BridgeParamKeyKt.MAX_COUNT, "count"}, m90127s = {"L$0", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"})
public final class UserCenterSiteConfigRepository$retryWhenException$1<T> extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserCenterSiteConfigRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserCenterSiteConfigRepository$retryWhenException$1(UserCenterSiteConfigRepository userCenterSiteConfigRepository, Continuation<? super UserCenterSiteConfigRepository$retryWhenException$1> continuation) {
        super(continuation);
        this.this$0 = userCenterSiteConfigRepository;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m65776l(0, null, this);
    }
}
