package com.kubi.futures.settings.vm;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: UnifyIsolatedLeverageSettingViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.settings.vm.UnifyIsolatedLeverageSettingViewModel", m90122f = "UnifyIsolatedLeverageSettingViewModel.kt", m90123i = {0, 0, 0}, m90124l = {82}, m90125m = "fetchLeverageOfCalResult", m90126n = {"symbol", "leverage", "positionSide"}, m90127s = {"L$0", "L$1", "L$2"})
public final class UnifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UnifyIsolatedLeverageSettingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$1(UnifyIsolatedLeverageSettingViewModel unifyIsolatedLeverageSettingViewModel, Continuation<? super UnifyIsolatedLeverageSettingViewModel$fetchLeverageOfCalResult$1> continuation) {
        super(continuation);
        this.this$0 = unifyIsolatedLeverageSettingViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m26433M(null, null, null, this);
    }
}
