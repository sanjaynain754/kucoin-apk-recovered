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
@DebugMetadata(m90121c = "com.kubi.user.site.config.UserCenterSiteConfigRepository", m90122f = "UserCenterSiteConfigRepository.kt", m90123i = {0, 0, 0, 0}, m90124l = {265}, m90125m = "parseUserCenterSiteConfigJson", m90126n = {"userCenterSiteConfigJson", "this_$iv", "json$iv", "$i$f$fromJsonOrNull"}, m90127s = {"L$0", "L$1", "L$2", "I$0"})
public final class UserCenterSiteConfigRepository$parseUserCenterSiteConfigJson$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserCenterSiteConfigRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserCenterSiteConfigRepository$parseUserCenterSiteConfigJson$1(UserCenterSiteConfigRepository userCenterSiteConfigRepository, Continuation<? super UserCenterSiteConfigRepository$parseUserCenterSiteConfigJson$1> continuation) {
        super(continuation);
        this.this$0 = userCenterSiteConfigRepository;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m65775k(null, this);
    }
}
