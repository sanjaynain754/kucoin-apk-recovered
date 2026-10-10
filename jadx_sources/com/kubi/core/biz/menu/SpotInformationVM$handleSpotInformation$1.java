package com.kubi.core.biz.menu;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: SpotInformationVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.menu.SpotInformationVM", m90122f = "SpotInformationVM.kt", m90123i = {0, 1}, m90124l = {31, 31}, m90125m = "handleSpotInformation", m90126n = {"symbol", "symbol"}, m90127s = {"L$0", "L$0"})
public final class SpotInformationVM$handleSpotInformation$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SpotInformationVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotInformationVM$handleSpotInformation$1(SpotInformationVM spotInformationVM, Continuation<? super SpotInformationVM$handleSpotInformation$1> continuation) {
        super(continuation);
        this.this$0 = spotInformationVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m21968s(null, this);
    }
}
