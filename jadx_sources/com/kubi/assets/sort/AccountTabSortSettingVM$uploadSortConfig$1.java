package com.kubi.assets.sort;

import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AccountTabSortSettingVM.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.sort.AccountTabSortSettingVM", m90122f = "AccountTabSortSettingVM.kt", m90123i = {0, 0, 0, 1, 1, 1, 1}, m90124l = {277, 286}, m90125m = "uploadSortConfig", m90126n = {"sortType", "accounts", "accountTypeList", "sortType", "accounts", "accountTypeList", DbParams.KEY_CHANNEL_RESULT}, m90127s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
public final class AccountTabSortSettingVM$uploadSortConfig$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AccountTabSortSettingVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountTabSortSettingVM$uploadSortConfig$1(AccountTabSortSettingVM accountTabSortSettingVM, Continuation<? super AccountTabSortSettingVM$uploadSortConfig$1> continuation) {
        super(continuation);
        this.this$0 = accountTabSortSettingVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m19333G(null, null, this);
    }
}
