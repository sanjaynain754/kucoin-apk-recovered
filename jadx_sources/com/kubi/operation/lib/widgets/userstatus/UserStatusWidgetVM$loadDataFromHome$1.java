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
@DebugMetadata(m90121c = "com.kubi.operation.lib.widgets.userstatus.UserStatusWidgetVM", m90122f = "UserStatusWidgetVM.kt", m90123i = {0, 0}, m90124l = {140}, m90125m = "loadDataFromHome", m90126n = {"isFirstLoad", "startTime"}, m90127s = {"Z$0", "J$0"})
public final class UserStatusWidgetVM$loadDataFromHome$1 extends ContinuationImpl {
    long J$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserStatusWidgetVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserStatusWidgetVM$loadDataFromHome$1(UserStatusWidgetVM userStatusWidgetVM, Continuation<? super UserStatusWidgetVM$loadDataFromHome$1> continuation) {
        super(continuation);
        this.this$0 = userStatusWidgetVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m43897y(this);
    }
}
