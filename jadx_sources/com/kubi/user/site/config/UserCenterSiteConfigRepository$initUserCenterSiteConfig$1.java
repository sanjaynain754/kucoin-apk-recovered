package com.kubi.user.site.config;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: UserCenterSiteConfigRepository.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.user.site.config.UserCenterSiteConfigRepository", m90122f = "UserCenterSiteConfigRepository.kt", m90123i = {0, 1}, m90124l = {105, 107}, m90125m = "initUserCenterSiteConfig", m90126n = {"userCenterSiteConfigJson", "userCenterSiteConfigJson"}, m90127s = {"L$0", "L$0"})
public final class UserCenterSiteConfigRepository$initUserCenterSiteConfig$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserCenterSiteConfigRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserCenterSiteConfigRepository$initUserCenterSiteConfig$1(UserCenterSiteConfigRepository userCenterSiteConfigRepository, Continuation<? super UserCenterSiteConfigRepository$initUserCenterSiteConfig$1> continuation) {
        super(continuation);
        this.this$0 = userCenterSiteConfigRepository;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m65774j(this);
    }
}
