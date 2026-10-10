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
@DebugMetadata(m90121c = "com.kubi.assets.exchange.viewmodel.MainConvertViewModel", m90122f = "MainConvertViewModel.kt", m90123i = {0, 0, 1, 1}, m90124l = {54, 54}, m90125m = "requestConvertMainSmallAssets", m90126n = {"intent", "key", "intent", "key"}, m90127s = {"L$0", "L$1", "L$0", "L$1"})
public final class MainConvertViewModel$requestConvertMainSmallAssets$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MainConvertViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainConvertViewModel$requestConvertMainSmallAssets$1(MainConvertViewModel mainConvertViewModel, Continuation<? super MainConvertViewModel$requestConvertMainSmallAssets$1> continuation) {
        super(continuation);
        this.this$0 = mainConvertViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m16526v(null, this);
    }
}
