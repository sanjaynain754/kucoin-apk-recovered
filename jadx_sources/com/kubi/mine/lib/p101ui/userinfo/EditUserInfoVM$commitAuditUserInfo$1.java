package com.kubi.mine.lib.p101ui.userinfo;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: EditUserInfoVM.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.ui.userinfo.EditUserInfoVM", m90122f = "EditUserInfoVM.kt", m90123i = {0, 0}, m90124l = {37}, m90125m = "commitAuditUserInfo", m90126n = {"avatar", "nickName"}, m90127s = {"L$0", "L$1"})
public final class EditUserInfoVM$commitAuditUserInfo$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EditUserInfoVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditUserInfoVM$commitAuditUserInfo$1(EditUserInfoVM editUserInfoVM, Continuation<? super EditUserInfoVM$commitAuditUserInfo$1> continuation) {
        super(continuation);
        this.this$0 = editUserInfoVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m42324e(null, null, this);
    }
}
