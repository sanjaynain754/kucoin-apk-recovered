package com.kubi.futures.trade.position.vm;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AddMarginViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.position.vm.AddMarginViewModel", m90122f = "AddMarginViewModel.kt", m90123i = {0}, m90124l = {323}, m90125m = "fetchUnifyCalculateResult", m90126n = {"value"}, m90127s = {"L$0"})
public final class AddMarginViewModel$fetchUnifyCalculateResult$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AddMarginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddMarginViewModel$fetchUnifyCalculateResult$1(AddMarginViewModel addMarginViewModel, Continuation<? super AddMarginViewModel$fetchUnifyCalculateResult$1> continuation) {
        super(continuation);
        this.this$0 = addMarginViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m27788X(null, this);
    }
}
