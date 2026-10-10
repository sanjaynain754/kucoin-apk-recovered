package com.kubi.assets.sort;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AccountTabSortSettingVM.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.sort.AccountTabSortSettingVM", m90122f = "AccountTabSortSettingVM.kt", m90123i = {}, m90124l = {73}, m90125m = "loadAccountData", m90126n = {}, m90127s = {})
public final class AccountTabSortSettingVM$loadAccountData$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AccountTabSortSettingVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountTabSortSettingVM$loadAccountData$1(AccountTabSortSettingVM accountTabSortSettingVM, Continuation<? super AccountTabSortSettingVM$loadAccountData$1> continuation) {
        super(continuation);
        this.this$0 = accountTabSortSettingVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m19339x(this);
    }
}
