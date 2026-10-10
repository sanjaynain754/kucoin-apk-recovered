package com.kubi.unify.account;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AccountDialogHelper.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.account.AccountDialogHelper", m90122f = "AccountDialogHelper.kt", m90123i = {0, 0, 0}, m90124l = {80}, m90125m = "showToggleNotEmptyDialog", m90126n = {"fromType", "errorMsg", "childFragmentManager"}, m90127s = {"L$0", "L$1", "L$2"})
public final class AccountDialogHelper$showToggleNotEmptyDialog$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AccountDialogHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountDialogHelper$showToggleNotEmptyDialog$1(AccountDialogHelper accountDialogHelper, Continuation<? super AccountDialogHelper$showToggleNotEmptyDialog$1> continuation) {
        super(continuation);
        this.this$0 = accountDialogHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m64899f(null, null, null, this);
    }
}
