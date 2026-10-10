package com.kubi.user.site.config;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.tensorflow.lite.schema.BuiltinOperator;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: renamed from: com.kubi.user.site.config.UserCenterSiteConfigRepository$fetchUserCenterSiteConfigFromServer$1 */
/* JADX INFO: compiled from: UserCenterSiteConfigRepository.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.user.site.config.UserCenterSiteConfigRepository", m90122f = "UserCenterSiteConfigRepository.kt", m90123i = {0}, m90124l = {BuiltinOperator.RIGHT_SHIFT}, m90125m = "fetchUserCenterSiteConfigFromServer", m90126n = {"api"}, m90127s = {"L$0"})
public final class C26805xed17c1cc extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserCenterSiteConfigRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26805xed17c1cc(UserCenterSiteConfigRepository userCenterSiteConfigRepository, Continuation<? super C26805xed17c1cc> continuation) {
        super(continuation);
        this.this$0 = userCenterSiteConfigRepository;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m65770f(this);
    }
}
