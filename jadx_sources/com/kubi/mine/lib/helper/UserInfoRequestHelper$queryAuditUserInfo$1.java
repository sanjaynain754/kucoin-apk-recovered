package com.kubi.mine.lib.helper;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: UserInfoRequestHelper.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.helper.UserInfoRequestHelper", m90122f = "UserInfoRequestHelper.kt", m90123i = {0}, m90124l = {29}, m90125m = "queryAuditUserInfo", m90126n = {"userInfoApi"}, m90127s = {"L$0"})
public final class UserInfoRequestHelper$queryAuditUserInfo$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserInfoRequestHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserInfoRequestHelper$queryAuditUserInfo$1(UserInfoRequestHelper userInfoRequestHelper, Continuation<? super UserInfoRequestHelper$queryAuditUserInfo$1> continuation) {
        super(continuation);
        this.this$0 = userInfoRequestHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m41653b(this);
    }
}
