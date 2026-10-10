package com.kubi.operation.lib.widgets.userstatus;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: UserStatusWidgetVM.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.operation.lib.widgets.userstatus.UserStatusWidgetVM", m90122f = "UserStatusWidgetVM.kt", m90123i = {0}, m90124l = {178}, m90125m = "applyJoinTask", m90126n = {"taskId"}, m90127s = {"L$0"})
public final class UserStatusWidgetVM$applyJoinTask$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserStatusWidgetVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserStatusWidgetVM$applyJoinTask$1(UserStatusWidgetVM userStatusWidgetVM, Continuation<? super UserStatusWidgetVM$applyJoinTask$1> continuation) {
        super(continuation);
        this.this$0 = userStatusWidgetVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m43892u(null, this);
    }
}
