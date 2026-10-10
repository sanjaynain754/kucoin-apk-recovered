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
@DebugMetadata(m90121c = "com.kubi.network.retrofit.utils.RetrofitFlowExKt", m90122f = "RetrofitFlowEx.kt", m90123i = {0, 0, 0, 0, 1, 1, 1, 1}, m90124l = {79, 80, 88}, m90125m = "getDataOrNull", m90126n = {"block", DbParams.KEY_CHANNEL_RESULT, "allowNull", "needShowErrorToast", "block", DbParams.KEY_CHANNEL_RESULT, "allowNull", "needShowErrorToast"}, m90127s = {"L$0", "L$2", "Z$0", "Z$1", "L$0", "L$2", "Z$0", "Z$1"})
public final class RetrofitFlowExKt$getDataOrNull$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RetrofitFlowExKt.m42821b(null, false, false, null, this);
    }

    public RetrofitFlowExKt$getDataOrNull$1(Continuation<? super RetrofitFlowExKt$getDataOrNull$1> continuation) {
        super(continuation);
    }
}
