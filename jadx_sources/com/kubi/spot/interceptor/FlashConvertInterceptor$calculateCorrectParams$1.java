package com.kubi.spot.interceptor;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: FlashConvertInterceptor.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.interceptor.FlashConvertInterceptor", m90122f = "FlashConvertInterceptor.kt", m90123i = {0}, m90124l = {171}, m90125m = "calculateCorrectParams", m90126n = {"isLogin"}, m90127s = {"Z$0"})
public final class FlashConvertInterceptor$calculateCorrectParams$1 extends ContinuationImpl {
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlashConvertInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlashConvertInterceptor$calculateCorrectParams$1(FlashConvertInterceptor flashConvertInterceptor, Continuation<? super FlashConvertInterceptor$calculateCorrectParams$1> continuation) {
        super(continuation);
        this.this$0 = flashConvertInterceptor;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m61868j(this);
    }
}
