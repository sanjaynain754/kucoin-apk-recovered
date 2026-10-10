package com.kubi.assets.exchange.viewmodel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: MainConvertViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.exchange.viewmodel.MainConvertViewModel", m90122f = "MainConvertViewModel.kt", m90123i = {}, m90124l = {42}, m90125m = "requestMainConvertList", m90126n = {}, m90127s = {})
public final class MainConvertViewModel$requestMainConvertList$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MainConvertViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainConvertViewModel$requestMainConvertList$1(MainConvertViewModel mainConvertViewModel, Continuation<? super MainConvertViewModel$requestMainConvertList$1> continuation) {
        super(continuation);
        this.this$0 = mainConvertViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m16527x(this);
    }
}
