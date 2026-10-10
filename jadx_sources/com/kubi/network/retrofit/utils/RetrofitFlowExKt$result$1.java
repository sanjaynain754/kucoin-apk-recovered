package com.kubi.network.retrofit.utils;

import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: RetrofitFlowEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.network.retrofit.utils.RetrofitFlowExKt", m90122f = "RetrofitFlowEx.kt", m90123i = {}, m90124l = {56}, m90125m = DbParams.KEY_CHANNEL_RESULT, m90126n = {}, m90127s = {})
public final class RetrofitFlowExKt$result$1<T> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RetrofitFlowExKt.m42830k(null, this);
    }

    public RetrofitFlowExKt$result$1(Continuation<? super RetrofitFlowExKt$result$1> continuation) {
        super(continuation);
    }
}
